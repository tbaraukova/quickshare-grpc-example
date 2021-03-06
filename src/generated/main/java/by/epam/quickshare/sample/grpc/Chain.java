// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package by.epam.quickshare.sample.grpc;

/**
 * Protobuf type {@code Chain}
 */
public  final class Chain extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Chain)
    ChainOrBuilder {
  // Use Chain.newBuilder() to construct.
  private Chain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Chain() {
    links_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Chain(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              links_ = new java.util.ArrayList<by.epam.quickshare.sample.grpc.Link>();
              mutable_bitField0_ |= 0x00000001;
            }
            links_.add(
                input.readMessage(by.epam.quickshare.sample.grpc.Link.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        links_ = java.util.Collections.unmodifiableList(links_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Chain_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Chain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            by.epam.quickshare.sample.grpc.Chain.class, by.epam.quickshare.sample.grpc.Chain.Builder.class);
  }

  public static final int LINKS_FIELD_NUMBER = 1;
  private java.util.List<by.epam.quickshare.sample.grpc.Link> links_;
  /**
   * <code>repeated .Link links = 1;</code>
   */
  public java.util.List<by.epam.quickshare.sample.grpc.Link> getLinksList() {
    return links_;
  }
  /**
   * <code>repeated .Link links = 1;</code>
   */
  public java.util.List<? extends by.epam.quickshare.sample.grpc.LinkOrBuilder> 
      getLinksOrBuilderList() {
    return links_;
  }
  /**
   * <code>repeated .Link links = 1;</code>
   */
  public int getLinksCount() {
    return links_.size();
  }
  /**
   * <code>repeated .Link links = 1;</code>
   */
  public by.epam.quickshare.sample.grpc.Link getLinks(int index) {
    return links_.get(index);
  }
  /**
   * <code>repeated .Link links = 1;</code>
   */
  public by.epam.quickshare.sample.grpc.LinkOrBuilder getLinksOrBuilder(
      int index) {
    return links_.get(index);
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
    for (int i = 0; i < links_.size(); i++) {
      output.writeMessage(1, links_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < links_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, links_.get(i));
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
    if (!(obj instanceof by.epam.quickshare.sample.grpc.Chain)) {
      return super.equals(obj);
    }
    by.epam.quickshare.sample.grpc.Chain other = (by.epam.quickshare.sample.grpc.Chain) obj;

    boolean result = true;
    result = result && getLinksList()
        .equals(other.getLinksList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getLinksCount() > 0) {
      hash = (37 * hash) + LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getLinksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static by.epam.quickshare.sample.grpc.Chain parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static by.epam.quickshare.sample.grpc.Chain parseFrom(
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
  public static Builder newBuilder(by.epam.quickshare.sample.grpc.Chain prototype) {
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
   * Protobuf type {@code Chain}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Chain)
      by.epam.quickshare.sample.grpc.ChainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Chain_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Chain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              by.epam.quickshare.sample.grpc.Chain.class, by.epam.quickshare.sample.grpc.Chain.Builder.class);
    }

    // Construct using by.epam.quickshare.sample.grpc.Chain.newBuilder()
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
        getLinksFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        linksBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return by.epam.quickshare.sample.grpc.ChainOuterClass.internal_static_Chain_descriptor;
    }

    public by.epam.quickshare.sample.grpc.Chain getDefaultInstanceForType() {
      return by.epam.quickshare.sample.grpc.Chain.getDefaultInstance();
    }

    public by.epam.quickshare.sample.grpc.Chain build() {
      by.epam.quickshare.sample.grpc.Chain result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public by.epam.quickshare.sample.grpc.Chain buildPartial() {
      by.epam.quickshare.sample.grpc.Chain result = new by.epam.quickshare.sample.grpc.Chain(this);
      int from_bitField0_ = bitField0_;
      if (linksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          links_ = java.util.Collections.unmodifiableList(links_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.links_ = links_;
      } else {
        result.links_ = linksBuilder_.build();
      }
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
      if (other instanceof by.epam.quickshare.sample.grpc.Chain) {
        return mergeFrom((by.epam.quickshare.sample.grpc.Chain)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(by.epam.quickshare.sample.grpc.Chain other) {
      if (other == by.epam.quickshare.sample.grpc.Chain.getDefaultInstance()) return this;
      if (linksBuilder_ == null) {
        if (!other.links_.isEmpty()) {
          if (links_.isEmpty()) {
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLinksIsMutable();
            links_.addAll(other.links_);
          }
          onChanged();
        }
      } else {
        if (!other.links_.isEmpty()) {
          if (linksBuilder_.isEmpty()) {
            linksBuilder_.dispose();
            linksBuilder_ = null;
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
            linksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLinksFieldBuilder() : null;
          } else {
            linksBuilder_.addAllMessages(other.links_);
          }
        }
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
      by.epam.quickshare.sample.grpc.Chain parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (by.epam.quickshare.sample.grpc.Chain) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<by.epam.quickshare.sample.grpc.Link> links_ =
      java.util.Collections.emptyList();
    private void ensureLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        links_ = new java.util.ArrayList<by.epam.quickshare.sample.grpc.Link>(links_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        by.epam.quickshare.sample.grpc.Link, by.epam.quickshare.sample.grpc.Link.Builder, by.epam.quickshare.sample.grpc.LinkOrBuilder> linksBuilder_;

    /**
     * <code>repeated .Link links = 1;</code>
     */
    public java.util.List<by.epam.quickshare.sample.grpc.Link> getLinksList() {
      if (linksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(links_);
      } else {
        return linksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public int getLinksCount() {
      if (linksBuilder_ == null) {
        return links_.size();
      } else {
        return linksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public by.epam.quickshare.sample.grpc.Link getLinks(int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);
      } else {
        return linksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public Builder setLinks(
        int index, by.epam.quickshare.sample.grpc.Link value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.set(index, value);
        onChanged();
      } else {
        linksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public Builder setLinks(
        int index, by.epam.quickshare.sample.grpc.Link.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.set(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public Builder addLinks(by.epam.quickshare.sample.grpc.Link value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(value);
        onChanged();
      } else {
        linksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public Builder addLinks(
        int index, by.epam.quickshare.sample.grpc.Link value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(index, value);
        onChanged();
      } else {
        linksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public Builder addLinks(
        by.epam.quickshare.sample.grpc.Link.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public Builder addLinks(
        int index, by.epam.quickshare.sample.grpc.Link.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public Builder addAllLinks(
        java.lang.Iterable<? extends by.epam.quickshare.sample.grpc.Link> values) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, links_);
        onChanged();
      } else {
        linksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public Builder clearLinks() {
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        linksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public Builder removeLinks(int index) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.remove(index);
        onChanged();
      } else {
        linksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public by.epam.quickshare.sample.grpc.Link.Builder getLinksBuilder(
        int index) {
      return getLinksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public by.epam.quickshare.sample.grpc.LinkOrBuilder getLinksOrBuilder(
        int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);  } else {
        return linksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public java.util.List<? extends by.epam.quickshare.sample.grpc.LinkOrBuilder> 
         getLinksOrBuilderList() {
      if (linksBuilder_ != null) {
        return linksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(links_);
      }
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public by.epam.quickshare.sample.grpc.Link.Builder addLinksBuilder() {
      return getLinksFieldBuilder().addBuilder(
          by.epam.quickshare.sample.grpc.Link.getDefaultInstance());
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public by.epam.quickshare.sample.grpc.Link.Builder addLinksBuilder(
        int index) {
      return getLinksFieldBuilder().addBuilder(
          index, by.epam.quickshare.sample.grpc.Link.getDefaultInstance());
    }
    /**
     * <code>repeated .Link links = 1;</code>
     */
    public java.util.List<by.epam.quickshare.sample.grpc.Link.Builder> 
         getLinksBuilderList() {
      return getLinksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        by.epam.quickshare.sample.grpc.Link, by.epam.quickshare.sample.grpc.Link.Builder, by.epam.quickshare.sample.grpc.LinkOrBuilder> 
        getLinksFieldBuilder() {
      if (linksBuilder_ == null) {
        linksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            by.epam.quickshare.sample.grpc.Link, by.epam.quickshare.sample.grpc.Link.Builder, by.epam.quickshare.sample.grpc.LinkOrBuilder>(
                links_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        links_ = null;
      }
      return linksBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Chain)
  }

  // @@protoc_insertion_point(class_scope:Chain)
  private static final by.epam.quickshare.sample.grpc.Chain DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new by.epam.quickshare.sample.grpc.Chain();
  }

  public static by.epam.quickshare.sample.grpc.Chain getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Chain>
      PARSER = new com.google.protobuf.AbstractParser<Chain>() {
    public Chain parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Chain(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Chain> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Chain> getParserForType() {
    return PARSER;
  }

  public by.epam.quickshare.sample.grpc.Chain getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

