// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package by.epam.quickshare.sample.grpc;

public final class ChainOuterClass {
  private ChainOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Link_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Link_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Chain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Chain_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013chain.proto\"\022\n\004Link\022\n\n\002id\030\001 \001(\005\"\035\n\005Cha" +
      "in\022\024\n\005links\030\001 \003(\0132\005.Link2\213\001\n\014ChainBuilde" +
      "r\022\035\n\nBuildChain\022\005.Link\032\006.Chain(\001\022\033\n\nRemo" +
      "veLink\022\005.Link\032\006.Chain\022\035\n\nBreakChain\022\006.Ch" +
      "ain\032\005.Link0\001\022 \n\013BreakChains\022\006.Chain\032\005.Li" +
      "nk(\0010\001B\"\n\036by.epam.quickshare.sample.grpc" +
      "P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Link_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Link_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Link_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_Chain_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Chain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Chain_descriptor,
        new java.lang.String[] { "Links", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
