/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Counter extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6386705575599716127L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Counter\",\"namespace\":\"schema\",\"fields\":[{\"name\":\"counterId\",\"type\":\"int\",\"doc\":\"Identifier for reference\"},{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"Time the counter was created\"}],\"doc:\":\"Counter for compaction test\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Counter> ENCODER =
      new BinaryMessageEncoder<Counter>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Counter> DECODER =
      new BinaryMessageDecoder<Counter>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Counter> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Counter> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Counter> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Counter>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Counter to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Counter from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Counter instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Counter fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Identifier for reference */
  @Deprecated public int counterId;
  /** Time the counter was created */
  @Deprecated public long timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Counter() {}

  /**
   * All-args constructor.
   * @param counterId Identifier for reference
   * @param timestamp Time the counter was created
   */
  public Counter(java.lang.Integer counterId, java.lang.Long timestamp) {
    this.counterId = counterId;
    this.timestamp = timestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return counterId;
    case 1: return timestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: counterId = (java.lang.Integer)value$; break;
    case 1: timestamp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'counterId' field.
   * @return Identifier for reference
   */
  public int getCounterId() {
    return counterId;
  }


  /**
   * Sets the value of the 'counterId' field.
   * Identifier for reference
   * @param value the value to set.
   */
  public void setCounterId(int value) {
    this.counterId = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return Time the counter was created
   */
  public long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * Time the counter was created
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Creates a new Counter RecordBuilder.
   * @return A new Counter RecordBuilder
   */
  public static schema.Counter.Builder newBuilder() {
    return new schema.Counter.Builder();
  }

  /**
   * Creates a new Counter RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Counter RecordBuilder
   */
  public static schema.Counter.Builder newBuilder(schema.Counter.Builder other) {
    if (other == null) {
      return new schema.Counter.Builder();
    } else {
      return new schema.Counter.Builder(other);
    }
  }

  /**
   * Creates a new Counter RecordBuilder by copying an existing Counter instance.
   * @param other The existing instance to copy.
   * @return A new Counter RecordBuilder
   */
  public static schema.Counter.Builder newBuilder(schema.Counter other) {
    if (other == null) {
      return new schema.Counter.Builder();
    } else {
      return new schema.Counter.Builder(other);
    }
  }

  /**
   * RecordBuilder for Counter instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Counter>
    implements org.apache.avro.data.RecordBuilder<Counter> {

    /** Identifier for reference */
    private int counterId;
    /** Time the counter was created */
    private long timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(schema.Counter.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.counterId)) {
        this.counterId = data().deepCopy(fields()[0].schema(), other.counterId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Counter instance
     * @param other The existing instance to copy.
     */
    private Builder(schema.Counter other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.counterId)) {
        this.counterId = data().deepCopy(fields()[0].schema(), other.counterId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'counterId' field.
      * Identifier for reference
      * @return The value.
      */
    public int getCounterId() {
      return counterId;
    }


    /**
      * Sets the value of the 'counterId' field.
      * Identifier for reference
      * @param value The value of 'counterId'.
      * @return This builder.
      */
    public schema.Counter.Builder setCounterId(int value) {
      validate(fields()[0], value);
      this.counterId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'counterId' field has been set.
      * Identifier for reference
      * @return True if the 'counterId' field has been set, false otherwise.
      */
    public boolean hasCounterId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'counterId' field.
      * Identifier for reference
      * @return This builder.
      */
    public schema.Counter.Builder clearCounterId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * Time the counter was created
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * Time the counter was created
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public schema.Counter.Builder setTimestamp(long value) {
      validate(fields()[1], value);
      this.timestamp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * Time the counter was created
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * Time the counter was created
      * @return This builder.
      */
    public schema.Counter.Builder clearTimestamp() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Counter build() {
      try {
        Counter record = new Counter();
        record.counterId = fieldSetFlags()[0] ? this.counterId : (java.lang.Integer) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Counter>
    WRITER$ = (org.apache.avro.io.DatumWriter<Counter>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Counter>
    READER$ = (org.apache.avro.io.DatumReader<Counter>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.counterId);

    out.writeLong(this.timestamp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.counterId = in.readInt();

      this.timestamp = in.readLong();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.counterId = in.readInt();
          break;

        case 1:
          this.timestamp = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









