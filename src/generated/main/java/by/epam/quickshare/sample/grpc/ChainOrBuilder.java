// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package by.epam.quickshare.sample.grpc;

public interface ChainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Chain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Link links = 1;</code>
   */
  java.util.List<by.epam.quickshare.sample.grpc.Link> 
      getLinksList();
  /**
   * <code>repeated .Link links = 1;</code>
   */
  by.epam.quickshare.sample.grpc.Link getLinks(int index);
  /**
   * <code>repeated .Link links = 1;</code>
   */
  int getLinksCount();
  /**
   * <code>repeated .Link links = 1;</code>
   */
  java.util.List<? extends by.epam.quickshare.sample.grpc.LinkOrBuilder> 
      getLinksOrBuilderList();
  /**
   * <code>repeated .Link links = 1;</code>
   */
  by.epam.quickshare.sample.grpc.LinkOrBuilder getLinksOrBuilder(
      int index);
}
