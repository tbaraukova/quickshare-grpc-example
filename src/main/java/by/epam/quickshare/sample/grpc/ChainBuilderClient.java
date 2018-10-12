package by.epam.quickshare.sample.grpc;

import com.google.common.collect.Lists;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChainBuilderClient {


    private final ManagedChannel channel;
    private final ChainBuilderGrpc.ChainBuilderStub chainBuilderStub;
    private final ChainBuilderGrpc.ChainBuilderBlockingStub chainBuilderBlockingStub;

    /**
     * Construct client for accessing RouteGuide server at {@code host:port}.
     */
    public ChainBuilderClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true));
    }

    /**
     * Construct client for accessing RouteGuide server using the existing channel.
     */
    public ChainBuilderClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        chainBuilderBlockingStub = ChainBuilderGrpc.newBlockingStub(channel);
        chainBuilderStub = ChainBuilderGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {

        System.out.println("Hello from gRPC-client!");
        List<Link> links = IntStream.iterate(0, i -> i + 1)
            .limit(50)
            .mapToObj(i -> Link.newBuilder().setId(i).build())
            .collect(
                Collectors.toList());

        List<Chain> chains = Lists.newArrayList();

        ChainBuilderClient chainBuilderClient = new ChainBuilderClient("localhost", 8080);
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            try {
                chainBuilderClient.shutdown();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }));


        System.out.println("create 5 chains");
        Lists.partition(links, 10).forEach(l -> chainBuilderClient.buildChain(l, chains));
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("break first chain");
        chainBuilderClient.chainBuilderBlockingStub.breakChain(chains.get(0)).forEachRemaining(System.out::println);
        chains.remove(0);
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("break other chains");
        chainBuilderClient.breakChains(chains);
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void breakChains(List<Chain> chains) {
        StreamObserver<Chain> chainStreamObserver = chainBuilderStub.breakChains(new StreamObserver<Link>() {
            @Override
            public void onNext(Link value) {
                System.out.println(value);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {

            }
        });
        chains.forEach(chainStreamObserver::onNext);
        chainStreamObserver.onCompleted();
    }

    private void buildChain(List<Link> links, List<Chain> chains) {
        StreamObserver<Link> linkStreamObserver = this.chainBuilderStub.buildChain(
            new StreamObserver<Chain>() {
                @Override
                public void onNext(Chain value) {
                    chains.add(value);
                    System.out.println(value);
                }

                @Override
                public void onError(Throwable t) {
                    t.printStackTrace();
                }

                @Override
                public void onCompleted() {

                }
            });
        links.forEach(linkStreamObserver::onNext);
        linkStreamObserver.onCompleted();
    }
}
