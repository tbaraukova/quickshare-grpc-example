// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package by.epam.quickshare.sample.grpc;

/**
 * Protobuf type {@code Link}
 */
public  final class Link extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Link)
    LinkOrBuilder {
  // Use Link.newBuilder() to construct.
  private Link(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Link() {
    id_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Link(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Link_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Link_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            by.epam.quickshare.sample.grpc.Link.class, by.epam.quickshare.sample.grpc.Link.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof by.epam.quickshare.sample.grpc.Link)) {
      return super.equals(obj);
    }
    by.epam.quickshare.sample.grpc.Link other = (by.epam.quickshare.sample.grpc.Link) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static by.epam.quickshare.sample.grpc.Link parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static by.epam.quickshare.sample.grpc.Link parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Link parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static by.epam.quickshare.sample.grpc.Link parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Link parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static by.epam.quickshare.sample.grpc.Link parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Link parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static by.epam.quickshare.sample.grpc.Link parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Link parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static by.epam.quickshare.sample.grpc.Link parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Link parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static by.epam.quickshare.sample.grpc.Link parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(by.epam.quickshare.sample.grpc.Link prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Link}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Link)
      by.epam.quickshare.sample.grpc.LinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Link_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Link_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              by.epam.quickshare.sample.grpc.Link.class, by.epam.quickshare.sample.grpc.Link.Builder.class);
    }

    // Construct using by.epam.quickshare.sample.grpc.Link.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Link_descriptor;
    }

    public by.epam.quickshare.sample.grpc.Link getDefaultInstanceForType() {
      return by.epam.quickshare.sample.grpc.Link.getDefaultInstance();
    }

    public by.epam.quickshare.sample.grpc.Link build() {
      by.epam.quickshare.sample.grpc.Link result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public by.epam.quickshare.sample.grpc.Link buildPartial() {
      by.epam.quickshare.sample.grpc.Link result = new by.epam.quickshare.sample.grpc.Link(this);
      result.id_ = id_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof by.epam.quickshare.sample.grpc.Link) {
        return mergeFrom((by.epam.quickshare.sample.grpc.Link)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(by.epam.quickshare.sample.grpc.Link other) {
      if (other == by.epam.quickshare.sample.grpc.Link.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      by.epam.quickshare.sample.grpc.Link parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (by.epam.quickshare.sample.grpc.Link) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Link)
  }

  // @@protoc_insertion_point(class_scope:Link)
  private static final by.epam.quickshare.sample.grpc.Link DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new by.epam.quickshare.sample.grpc.Link();
  }

  public static by.epam.quickshare.sample.grpc.Link getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Link>
      PARSER = new com.google.protobuf.AbstractParser<Link>() {
    public Link parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Link(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Link> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Link> getParserForType() {
    return PARSER;
  }

  public by.epam.quickshare.sample.grpc.Link getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
