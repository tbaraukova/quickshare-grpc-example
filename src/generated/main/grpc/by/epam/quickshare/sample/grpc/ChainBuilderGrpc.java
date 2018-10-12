package by.epam.quickshare.sample.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: chain.proto")
public final class ChainBuilderGrpc {

  private ChainBuilderGrpc() {}

  public static final String SERVICE_NAME = "ChainBuilder";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<by.epam.quickshare.sample.grpc.Link,
      by.epam.quickshare.sample.grpc.Chain> METHOD_BUILD_CHAIN =
      io.grpc.MethodDescriptor.<by.epam.quickshare.sample.grpc.Link, by.epam.quickshare.sample.grpc.Chain>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "ChainBuilder", "BuildChain"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              by.epam.quickshare.sample.grpc.Link.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              by.epam.quickshare.sample.grpc.Chain.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<by.epam.quickshare.sample.grpc.Link,
      by.epam.quickshare.sample.grpc.Chain> METHOD_REMOVE_LINK =
      io.grpc.MethodDescriptor.<by.epam.quickshare.sample.grpc.Link, by.epam.quickshare.sample.grpc.Chain>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ChainBuilder", "RemoveLink"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              by.epam.quickshare.sample.grpc.Link.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              by.epam.quickshare.sample.grpc.Chain.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<by.epam.quickshare.sample.grpc.Chain,
      by.epam.quickshare.sample.grpc.Link> METHOD_BREAK_CHAIN =
      io.grpc.MethodDescriptor.<by.epam.quickshare.sample.grpc.Chain, by.epam.quickshare.sample.grpc.Link>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "ChainBuilder", "BreakChain"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              by.epam.quickshare.sample.grpc.Chain.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              by.epam.quickshare.sample.grpc.Link.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<by.epam.quickshare.sample.grpc.Chain,
      by.epam.quickshare.sample.grpc.Link> METHOD_BREAK_CHAINS =
      io.grpc.MethodDescriptor.<by.epam.quickshare.sample.grpc.Chain, by.epam.quickshare.sample.grpc.Link>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "ChainBuilder", "BreakChains"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              by.epam.quickshare.sample.grpc.Chain.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              by.epam.quickshare.sample.grpc.Link.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChainBuilderStub newStub(io.grpc.Channel channel) {
    return new ChainBuilderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChainBuilderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChainBuilderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChainBuilderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChainBuilderFutureStub(channel);
  }

  /**
   */
  public static abstract class ChainBuilderImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Link> buildChain(
        io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Chain> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BUILD_CHAIN, responseObserver);
    }

    /**
     */
    public void removeLink(by.epam.quickshare.sample.grpc.Link request,
        io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Chain> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_LINK, responseObserver);
    }

    /**
     */
    public void breakChain(by.epam.quickshare.sample.grpc.Chain request,
        io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Link> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BREAK_CHAIN, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Chain> breakChains(
        io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Link> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BREAK_CHAINS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_BUILD_CHAIN,
            asyncClientStreamingCall(
              new MethodHandlers<
                by.epam.quickshare.sample.grpc.Link,
                by.epam.quickshare.sample.grpc.Chain>(
                  this, METHODID_BUILD_CHAIN)))
          .addMethod(
            METHOD_REMOVE_LINK,
            asyncUnaryCall(
              new MethodHandlers<
                by.epam.quickshare.sample.grpc.Link,
                by.epam.quickshare.sample.grpc.Chain>(
                  this, METHODID_REMOVE_LINK)))
          .addMethod(
            METHOD_BREAK_CHAIN,
            asyncServerStreamingCall(
              new MethodHandlers<
                by.epam.quickshare.sample.grpc.Chain,
                by.epam.quickshare.sample.grpc.Link>(
                  this, METHODID_BREAK_CHAIN)))
          .addMethod(
            METHOD_BREAK_CHAINS,
            asyncBidiStreamingCall(
              new MethodHandlers<
                by.epam.quickshare.sample.grpc.Chain,
                by.epam.quickshare.sample.grpc.Link>(
                  this, METHODID_BREAK_CHAINS)))
          .build();
    }
  }

  /**
   */
  public static final class ChainBuilderStub extends io.grpc.stub.AbstractStub<ChainBuilderStub> {
    private ChainBuilderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainBuilderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainBuilderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainBuilderStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Link> buildChain(
        io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Chain> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_BUILD_CHAIN, getCallOptions()), responseObserver);
    }

    /**
     */
    public void removeLink(by.epam.quickshare.sample.grpc.Link request,
        io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Chain> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_LINK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void breakChain(by.epam.quickshare.sample.grpc.Chain request,
        io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Link> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_BREAK_CHAIN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Chain> breakChains(
        io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Link> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_BREAK_CHAINS, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ChainBuilderBlockingStub extends io.grpc.stub.AbstractStub<ChainBuilderBlockingStub> {
    private ChainBuilderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainBuilderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainBuilderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainBuilderBlockingStub(channel, callOptions);
    }

    /**
     */
    public by.epam.quickshare.sample.grpc.Chain removeLink(by.epam.quickshare.sample.grpc.Link request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_LINK, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<by.epam.quickshare.sample.grpc.Link> breakChain(
        by.epam.quickshare.sample.grpc.Chain request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_BREAK_CHAIN, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChainBuilderFutureStub extends io.grpc.stub.AbstractStub<ChainBuilderFutureStub> {
    private ChainBuilderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainBuilderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainBuilderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainBuilderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<by.epam.quickshare.sample.grpc.Chain> removeLink(
        by.epam.quickshare.sample.grpc.Link request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_LINK, getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE_LINK = 0;
  private static final int METHODID_BREAK_CHAIN = 1;
  private static final int METHODID_BUILD_CHAIN = 2;
  private static final int METHODID_BREAK_CHAINS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChainBuilderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChainBuilderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REMOVE_LINK:
          serviceImpl.removeLink((by.epam.quickshare.sample.grpc.Link) request,
              (io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Chain>) responseObserver);
          break;
        case METHODID_BREAK_CHAIN:
          serviceImpl.breakChain((by.epam.quickshare.sample.grpc.Chain) request,
              (io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Link>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUILD_CHAIN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.buildChain(
              (io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Chain>) responseObserver);
        case METHODID_BREAK_CHAINS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.breakChains(
              (io.grpc.stub.StreamObserver<by.epam.quickshare.sample.grpc.Link>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class ChainBuilderDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return by.epam.quickshare.sample.grpc.ChainOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChainBuilderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChainBuilderDescriptorSupplier())
              .addMethod(METHOD_BUILD_CHAIN)
              .addMethod(METHOD_REMOVE_LINK)
              .addMethod(METHOD_BREAK_CHAIN)
              .addMethod(METHOD_BREAK_CHAINS)
              .build();
        }
      }
    }
    return result;
  }
}
