// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ps.proto

package net;

/**
 * Protobuf type {@code net.KeyValueListMessage}
 */
public  final class KeyValueListMessage extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:net.KeyValueListMessage)
    KeyValueListMessageOrBuilder {
  // Use KeyValueListMessage.newBuilder() to construct.
  private KeyValueListMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private KeyValueListMessage() {
    size_ = 0;
    keyValueList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private KeyValueListMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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

            size_ = input.readInt32();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              keyValueList_ = new java.util.ArrayList<net.KeyValueMessage>();
              mutable_bitField0_ |= 0x00000002;
            }
            keyValueList_.add(input.readMessage(net.KeyValueMessage.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        keyValueList_ = java.util.Collections.unmodifiableList(keyValueList_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.Ps.internal_static_net_KeyValueListMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.Ps.internal_static_net_KeyValueListMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.KeyValueListMessage.class, net.KeyValueListMessage.Builder.class);
  }

  private int bitField0_;
  public static final int SIZE_FIELD_NUMBER = 1;
  private int size_;
  /**
   * <code>optional int32 size = 1;</code>
   */
  public int getSize() {
    return size_;
  }

  public static final int KEYVALUELIST_FIELD_NUMBER = 2;
  private java.util.List<net.KeyValueMessage> keyValueList_;
  /**
   * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
   */
  public java.util.List<net.KeyValueMessage> getKeyValueListList() {
    return keyValueList_;
  }
  /**
   * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
   */
  public java.util.List<? extends net.KeyValueMessageOrBuilder> 
      getKeyValueListOrBuilderList() {
    return keyValueList_;
  }
  /**
   * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
   */
  public int getKeyValueListCount() {
    return keyValueList_.size();
  }
  /**
   * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
   */
  public net.KeyValueMessage getKeyValueList(int index) {
    return keyValueList_.get(index);
  }
  /**
   * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
   */
  public net.KeyValueMessageOrBuilder getKeyValueListOrBuilder(
      int index) {
    return keyValueList_.get(index);
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
    if (size_ != 0) {
      output.writeInt32(1, size_);
    }
    for (int i = 0; i < keyValueList_.size(); i++) {
      output.writeMessage(2, keyValueList_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, size_);
    }
    for (int i = 0; i < keyValueList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, keyValueList_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static net.KeyValueListMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.KeyValueListMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.KeyValueListMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.KeyValueListMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.KeyValueListMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static net.KeyValueListMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static net.KeyValueListMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static net.KeyValueListMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static net.KeyValueListMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static net.KeyValueListMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.KeyValueListMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code net.KeyValueListMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.KeyValueListMessage)
      net.KeyValueListMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.Ps.internal_static_net_KeyValueListMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.Ps.internal_static_net_KeyValueListMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.KeyValueListMessage.class, net.KeyValueListMessage.Builder.class);
    }

    // Construct using net.KeyValueListMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getKeyValueListFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      size_ = 0;

      if (keyValueListBuilder_ == null) {
        keyValueList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        keyValueListBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.Ps.internal_static_net_KeyValueListMessage_descriptor;
    }

    public net.KeyValueListMessage getDefaultInstanceForType() {
      return net.KeyValueListMessage.getDefaultInstance();
    }

    public net.KeyValueListMessage build() {
      net.KeyValueListMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public net.KeyValueListMessage buildPartial() {
      net.KeyValueListMessage result = new net.KeyValueListMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.size_ = size_;
      if (keyValueListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          keyValueList_ = java.util.Collections.unmodifiableList(keyValueList_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.keyValueList_ = keyValueList_;
      } else {
        result.keyValueList_ = keyValueListBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.KeyValueListMessage) {
        return mergeFrom((net.KeyValueListMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.KeyValueListMessage other) {
      if (other == net.KeyValueListMessage.getDefaultInstance()) return this;
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (keyValueListBuilder_ == null) {
        if (!other.keyValueList_.isEmpty()) {
          if (keyValueList_.isEmpty()) {
            keyValueList_ = other.keyValueList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureKeyValueListIsMutable();
            keyValueList_.addAll(other.keyValueList_);
          }
          onChanged();
        }
      } else {
        if (!other.keyValueList_.isEmpty()) {
          if (keyValueListBuilder_.isEmpty()) {
            keyValueListBuilder_.dispose();
            keyValueListBuilder_ = null;
            keyValueList_ = other.keyValueList_;
            bitField0_ = (bitField0_ & ~0x00000002);
            keyValueListBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getKeyValueListFieldBuilder() : null;
          } else {
            keyValueListBuilder_.addAllMessages(other.keyValueList_);
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
      net.KeyValueListMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.KeyValueListMessage) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int size_ ;
    /**
     * <code>optional int32 size = 1;</code>
     */
    public int getSize() {
      return size_;
    }
    /**
     * <code>optional int32 size = 1;</code>
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 size = 1;</code>
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<net.KeyValueMessage> keyValueList_ =
      java.util.Collections.emptyList();
    private void ensureKeyValueListIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        keyValueList_ = new java.util.ArrayList<net.KeyValueMessage>(keyValueList_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        net.KeyValueMessage, net.KeyValueMessage.Builder, net.KeyValueMessageOrBuilder> keyValueListBuilder_;

    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public java.util.List<net.KeyValueMessage> getKeyValueListList() {
      if (keyValueListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keyValueList_);
      } else {
        return keyValueListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public int getKeyValueListCount() {
      if (keyValueListBuilder_ == null) {
        return keyValueList_.size();
      } else {
        return keyValueListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public net.KeyValueMessage getKeyValueList(int index) {
      if (keyValueListBuilder_ == null) {
        return keyValueList_.get(index);
      } else {
        return keyValueListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public Builder setKeyValueList(
        int index, net.KeyValueMessage value) {
      if (keyValueListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyValueListIsMutable();
        keyValueList_.set(index, value);
        onChanged();
      } else {
        keyValueListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public Builder setKeyValueList(
        int index, net.KeyValueMessage.Builder builderForValue) {
      if (keyValueListBuilder_ == null) {
        ensureKeyValueListIsMutable();
        keyValueList_.set(index, builderForValue.build());
        onChanged();
      } else {
        keyValueListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public Builder addKeyValueList(net.KeyValueMessage value) {
      if (keyValueListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyValueListIsMutable();
        keyValueList_.add(value);
        onChanged();
      } else {
        keyValueListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public Builder addKeyValueList(
        int index, net.KeyValueMessage value) {
      if (keyValueListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyValueListIsMutable();
        keyValueList_.add(index, value);
        onChanged();
      } else {
        keyValueListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public Builder addKeyValueList(
        net.KeyValueMessage.Builder builderForValue) {
      if (keyValueListBuilder_ == null) {
        ensureKeyValueListIsMutable();
        keyValueList_.add(builderForValue.build());
        onChanged();
      } else {
        keyValueListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public Builder addKeyValueList(
        int index, net.KeyValueMessage.Builder builderForValue) {
      if (keyValueListBuilder_ == null) {
        ensureKeyValueListIsMutable();
        keyValueList_.add(index, builderForValue.build());
        onChanged();
      } else {
        keyValueListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public Builder addAllKeyValueList(
        java.lang.Iterable<? extends net.KeyValueMessage> values) {
      if (keyValueListBuilder_ == null) {
        ensureKeyValueListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keyValueList_);
        onChanged();
      } else {
        keyValueListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public Builder clearKeyValueList() {
      if (keyValueListBuilder_ == null) {
        keyValueList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        keyValueListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public Builder removeKeyValueList(int index) {
      if (keyValueListBuilder_ == null) {
        ensureKeyValueListIsMutable();
        keyValueList_.remove(index);
        onChanged();
      } else {
        keyValueListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public net.KeyValueMessage.Builder getKeyValueListBuilder(
        int index) {
      return getKeyValueListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public net.KeyValueMessageOrBuilder getKeyValueListOrBuilder(
        int index) {
      if (keyValueListBuilder_ == null) {
        return keyValueList_.get(index);  } else {
        return keyValueListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public java.util.List<? extends net.KeyValueMessageOrBuilder> 
         getKeyValueListOrBuilderList() {
      if (keyValueListBuilder_ != null) {
        return keyValueListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keyValueList_);
      }
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public net.KeyValueMessage.Builder addKeyValueListBuilder() {
      return getKeyValueListFieldBuilder().addBuilder(
          net.KeyValueMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public net.KeyValueMessage.Builder addKeyValueListBuilder(
        int index) {
      return getKeyValueListFieldBuilder().addBuilder(
          index, net.KeyValueMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .net.KeyValueMessage keyValueList = 2;</code>
     */
    public java.util.List<net.KeyValueMessage.Builder> 
         getKeyValueListBuilderList() {
      return getKeyValueListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        net.KeyValueMessage, net.KeyValueMessage.Builder, net.KeyValueMessageOrBuilder> 
        getKeyValueListFieldBuilder() {
      if (keyValueListBuilder_ == null) {
        keyValueListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            net.KeyValueMessage, net.KeyValueMessage.Builder, net.KeyValueMessageOrBuilder>(
                keyValueList_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        keyValueList_ = null;
      }
      return keyValueListBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:net.KeyValueListMessage)
  }

  // @@protoc_insertion_point(class_scope:net.KeyValueListMessage)
  private static final net.KeyValueListMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.KeyValueListMessage();
  }

  public static net.KeyValueListMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyValueListMessage>
      PARSER = new com.google.protobuf.AbstractParser<KeyValueListMessage>() {
    public KeyValueListMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new KeyValueListMessage(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<KeyValueListMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyValueListMessage> getParserForType() {
    return PARSER;
  }

  public net.KeyValueListMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

