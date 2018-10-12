package by.epam.quickshare.sample.grpc;

import com.google.common.collect.Lists;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.List;

public class ChainBuilderServer {

    private final Server server;

    public ChainBuilderServer(int port) throws IOException {
        this.server = ServerBuilder.forPort(port).addService(new ChainBuilderService())
            .build();
    }

    /**
     * Start serving requests.
     */
    public void start() throws IOException {
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Use stderr here since the logger may has been reset by its JVM shutdown hook.
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            ChainBuilderServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    /**
     * Stop serving requests and shutdown resources.
     */
    public void stop() {
        if(server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if(server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main method.  This comment makes the linter happy.
     */
    public static void main(String[] args) throws Exception {
        ChainBuilderServer server = new ChainBuilderServer(8080);
        server.start();
        System.out.println("Hello from gRPC-server!");
        server.blockUntilShutdown();
    }

    private class ChainBuilderService extends ChainBuilderGrpc.ChainBuilderImplBase {

        List<Chain> chains = Lists.newArrayList();

        @Override
        public StreamObserver<Link> buildChain(StreamObserver<Chain> responseObserver) {
            Chain.Builder builder = Chain.newBuilder();
            return new StreamObserver<Link>() {
                @Override
                public void onNext(Link value) {
                    builder.addLinks(value);
                }

                @Override
                public void onError(Throwable t) {

                    t.printStackTrace();
                }

                @Override
                public void onCompleted() {
                    Chain chain = builder.build();
                    chains.add(chain);
                    responseObserver.onNext(chain);
                    responseObserver.onCompleted();
                    System.out.println("Chain is built: " + chain);
                }
            };
        }

        @Override
        public void removeLink(Link request, StreamObserver<Chain> responseObserver) {
            Chain chain = chains.stream().filter(c -> c.getLinksList().contains(request))
                .findFirst().orElse(null);
            if(chain == null) {
                responseObserver.onNext(null);
                return;
            }
            chains.remove(chain);
            Chain build = chain.toBuilder().removeLinks(chain.getLinksList().indexOf(request)).build();
            chains.add(build);
            responseObserver.onNext(build);
            responseObserver.onCompleted();
            System.out.println("Link is removed, link: " + request);
        }

        @Override
        public void breakChain(Chain request, StreamObserver<Link> responseObserver) {
            doBreakChain(request, responseObserver);
            responseObserver.onCompleted();
            System.out.println("Chain is broken: " + request);
        }

        private void doBreakChain(Chain request, StreamObserver<Link> responseObserver) {
            chains.remove(request);
            request.getLinksList().forEach(responseObserver::onNext);
        }

        @Override
        public StreamObserver<Chain> breakChains(StreamObserver<Link> responseObserver) {
            return new StreamObserver<Chain>() {
                @Override
                public void onNext(Chain value) {
                    doBreakChain(value, responseObserver);
                }

                @Override
                public void onError(Throwable t) {
                    t.printStackTrace();
                }

                @Override
                public void onCompleted() {
                    System.out.println("Chains are broken");
                    responseObserver.onCompleted();
                }
            };
        }
    }
}
