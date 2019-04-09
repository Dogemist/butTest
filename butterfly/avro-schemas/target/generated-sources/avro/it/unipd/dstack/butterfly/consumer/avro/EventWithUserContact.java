/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package it.unipd.dstack.butterfly.consumer.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Avro Schema that aggregates the event to notify to the user, and the contact info of said user */
@org.apache.avro.specific.AvroGenerated
public class EventWithUserContact extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8127862267648893526L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EventWithUserContact\",\"namespace\":\"it.unipd.dstack.butterfly.consumer.avro\",\"doc\":\"Avro Schema that aggregates the event to notify to the user, and the contact info of said user\",\"fields\":[{\"name\":\"event\",\"type\":{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"it.unipd.dstack.butterfly.producer.avro\",\"doc\":\"Avro Schema for producer events\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"Time in which the event happened\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"service\",\"type\":{\"type\":\"enum\",\"name\":\"Services\",\"doc\":\"Producer services supported by Butterfly\",\"symbols\":[\"REDMINE\",\"GITLAB\",\"SONARQUBE\"]},\"doc\":\"Third party service that originated the event\"},{\"name\":\"projectName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The name of the project associated with the current event\"},{\"name\":\"projectURL\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The URL of the project associated with the current event. Sonarqube doesn't provide this information.\"},{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID of the current event, whose representation may change based on `service` and `event_type`\"},{\"name\":\"eventType\",\"type\":{\"type\":\"enum\",\"name\":\"ServiceEventTypes\",\"doc\":\"List of events available for each supported service\",\"symbols\":[\"GITLAB_COMMIT_CREATED\",\"GITLAB_ISSUE_CREATED\",\"GITLAB_ISSUE_EDITED\",\"REDMINE_TICKET_CREATED\",\"REDMINE_TICKET_EDITED\",\"REDMINE_TICKET_PRIORITY_EDITED\",\"REDMINE_USER_ADDED\",\"SONARQUBE_PROJECT_ANALYSIS_COMPLETED\"]},\"doc\":\"Event type related to the current event\"},{\"name\":\"username\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The username of the user that originated the event. Sonarqube doesn't provide this information.\"},{\"name\":\"userEmail\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Email of the user that originated the event. Sonarqube doesn't provide this information.\"},{\"name\":\"title\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Title of the event. For instance, in Gitlab this would be the branch in which there was a new commit, or the title of an issue.\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Description of the event. For instance, in Gitlab this would be the commit message or the body of the issue.\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"List of tags associated with the event. For instance, in Gitlab this would be the issue labels.\",\"default\":[]}]},\"doc\":\"Avro Schema for the event to notify to the user\"},{\"name\":\"userContact\",\"type\":{\"type\":\"record\",\"name\":\"UserSingleContact\",\"doc\":\"Avro Schema which contains the user info, a single contact platform and a contact ID\",\"fields\":[{\"name\":\"firstname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The firstname of the user that should receive the event notification\"},{\"name\":\"lastname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The lastname of the user that should receive the event notification\"},{\"name\":\"contact\",\"type\":{\"type\":\"enum\",\"name\":\"Contacts\",\"doc\":\"Consumer contact applications supported by Butterfly\",\"symbols\":[\"TELEGRAM\",\"SLACK\",\"EMAIL\"]},\"doc\":\"The type of contact platform where the user designed as recipient should receive this notification\"},{\"name\":\"contactRef\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The ID that identifies the user in the chosen contact platform\"}]},\"doc\":\"Avro Schema which contains the user info, the preferred contact platform and a contact ID\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EventWithUserContact> ENCODER =
      new BinaryMessageEncoder<EventWithUserContact>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EventWithUserContact> DECODER =
      new BinaryMessageDecoder<EventWithUserContact>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<EventWithUserContact> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<EventWithUserContact> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EventWithUserContact>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this EventWithUserContact to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a EventWithUserContact from a ByteBuffer. */
  public static EventWithUserContact fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Avro Schema for the event to notify to the user */
  @Deprecated public it.unipd.dstack.butterfly.producer.avro.Event event;
  /** Avro Schema which contains the user info, the preferred contact platform and a contact ID */
  @Deprecated public it.unipd.dstack.butterfly.consumer.avro.UserSingleContact userContact;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EventWithUserContact() {}

  /**
   * All-args constructor.
   * @param event Avro Schema for the event to notify to the user
   * @param userContact Avro Schema which contains the user info, the preferred contact platform and a contact ID
   */
  public EventWithUserContact(it.unipd.dstack.butterfly.producer.avro.Event event, it.unipd.dstack.butterfly.consumer.avro.UserSingleContact userContact) {
    this.event = event;
    this.userContact = userContact;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return event;
    case 1: return userContact;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: event = (it.unipd.dstack.butterfly.producer.avro.Event)value$; break;
    case 1: userContact = (it.unipd.dstack.butterfly.consumer.avro.UserSingleContact)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'event' field.
   * @return Avro Schema for the event to notify to the user
   */
  public it.unipd.dstack.butterfly.producer.avro.Event getEvent() {
    return event;
  }

  /**
   * Sets the value of the 'event' field.
   * Avro Schema for the event to notify to the user
   * @param value the value to set.
   */
  public void setEvent(it.unipd.dstack.butterfly.producer.avro.Event value) {
    this.event = value;
  }

  /**
   * Gets the value of the 'userContact' field.
   * @return Avro Schema which contains the user info, the preferred contact platform and a contact ID
   */
  public it.unipd.dstack.butterfly.consumer.avro.UserSingleContact getUserContact() {
    return userContact;
  }

  /**
   * Sets the value of the 'userContact' field.
   * Avro Schema which contains the user info, the preferred contact platform and a contact ID
   * @param value the value to set.
   */
  public void setUserContact(it.unipd.dstack.butterfly.consumer.avro.UserSingleContact value) {
    this.userContact = value;
  }

  /**
   * Creates a new EventWithUserContact RecordBuilder.
   * @return A new EventWithUserContact RecordBuilder
   */
  public static it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder newBuilder() {
    return new it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder();
  }

  /**
   * Creates a new EventWithUserContact RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EventWithUserContact RecordBuilder
   */
  public static it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder newBuilder(it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder other) {
    return new it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder(other);
  }

  /**
   * Creates a new EventWithUserContact RecordBuilder by copying an existing EventWithUserContact instance.
   * @param other The existing instance to copy.
   * @return A new EventWithUserContact RecordBuilder
   */
  public static it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder newBuilder(it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact other) {
    return new it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder(other);
  }

  /**
   * RecordBuilder for EventWithUserContact instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EventWithUserContact>
    implements org.apache.avro.data.RecordBuilder<EventWithUserContact> {

    /** Avro Schema for the event to notify to the user */
    private it.unipd.dstack.butterfly.producer.avro.Event event;
    private it.unipd.dstack.butterfly.producer.avro.Event.Builder eventBuilder;
    /** Avro Schema which contains the user info, the preferred contact platform and a contact ID */
    private it.unipd.dstack.butterfly.consumer.avro.UserSingleContact userContact;
    private it.unipd.dstack.butterfly.consumer.avro.UserSingleContact.Builder userContactBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.event)) {
        this.event = data().deepCopy(fields()[0].schema(), other.event);
        fieldSetFlags()[0] = true;
      }
      if (other.hasEventBuilder()) {
        this.eventBuilder = it.unipd.dstack.butterfly.producer.avro.Event.newBuilder(other.getEventBuilder());
      }
      if (isValidValue(fields()[1], other.userContact)) {
        this.userContact = data().deepCopy(fields()[1].schema(), other.userContact);
        fieldSetFlags()[1] = true;
      }
      if (other.hasUserContactBuilder()) {
        this.userContactBuilder = it.unipd.dstack.butterfly.consumer.avro.UserSingleContact.newBuilder(other.getUserContactBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing EventWithUserContact instance
     * @param other The existing instance to copy.
     */
    private Builder(it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.event)) {
        this.event = data().deepCopy(fields()[0].schema(), other.event);
        fieldSetFlags()[0] = true;
      }
      this.eventBuilder = null;
      if (isValidValue(fields()[1], other.userContact)) {
        this.userContact = data().deepCopy(fields()[1].schema(), other.userContact);
        fieldSetFlags()[1] = true;
      }
      this.userContactBuilder = null;
    }

    /**
      * Gets the value of the 'event' field.
      * Avro Schema for the event to notify to the user
      * @return The value.
      */
    public it.unipd.dstack.butterfly.producer.avro.Event getEvent() {
      return event;
    }

    /**
      * Sets the value of the 'event' field.
      * Avro Schema for the event to notify to the user
      * @param value The value of 'event'.
      * @return This builder.
      */
    public it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder setEvent(it.unipd.dstack.butterfly.producer.avro.Event value) {
      validate(fields()[0], value);
      this.eventBuilder = null;
      this.event = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'event' field has been set.
      * Avro Schema for the event to notify to the user
      * @return True if the 'event' field has been set, false otherwise.
      */
    public boolean hasEvent() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'event' field and creates one if it doesn't exist yet.
     * Avro Schema for the event to notify to the user
     * @return This builder.
     */
    public it.unipd.dstack.butterfly.producer.avro.Event.Builder getEventBuilder() {
      if (eventBuilder == null) {
        if (hasEvent()) {
          setEventBuilder(it.unipd.dstack.butterfly.producer.avro.Event.newBuilder(event));
        } else {
          setEventBuilder(it.unipd.dstack.butterfly.producer.avro.Event.newBuilder());
        }
      }
      return eventBuilder;
    }

    /**
     * Sets the Builder instance for the 'event' field
     * Avro Schema for the event to notify to the user
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder setEventBuilder(it.unipd.dstack.butterfly.producer.avro.Event.Builder value) {
      clearEvent();
      eventBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'event' field has an active Builder instance
     * Avro Schema for the event to notify to the user
     * @return True if the 'event' field has an active Builder instance
     */
    public boolean hasEventBuilder() {
      return eventBuilder != null;
    }

    /**
      * Clears the value of the 'event' field.
      * Avro Schema for the event to notify to the user
      * @return This builder.
      */
    public it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder clearEvent() {
      event = null;
      eventBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userContact' field.
      * Avro Schema which contains the user info, the preferred contact platform and a contact ID
      * @return The value.
      */
    public it.unipd.dstack.butterfly.consumer.avro.UserSingleContact getUserContact() {
      return userContact;
    }

    /**
      * Sets the value of the 'userContact' field.
      * Avro Schema which contains the user info, the preferred contact platform and a contact ID
      * @param value The value of 'userContact'.
      * @return This builder.
      */
    public it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder setUserContact(it.unipd.dstack.butterfly.consumer.avro.UserSingleContact value) {
      validate(fields()[1], value);
      this.userContactBuilder = null;
      this.userContact = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userContact' field has been set.
      * Avro Schema which contains the user info, the preferred contact platform and a contact ID
      * @return True if the 'userContact' field has been set, false otherwise.
      */
    public boolean hasUserContact() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'userContact' field and creates one if it doesn't exist yet.
     * Avro Schema which contains the user info, the preferred contact platform and a contact ID
     * @return This builder.
     */
    public it.unipd.dstack.butterfly.consumer.avro.UserSingleContact.Builder getUserContactBuilder() {
      if (userContactBuilder == null) {
        if (hasUserContact()) {
          setUserContactBuilder(it.unipd.dstack.butterfly.consumer.avro.UserSingleContact.newBuilder(userContact));
        } else {
          setUserContactBuilder(it.unipd.dstack.butterfly.consumer.avro.UserSingleContact.newBuilder());
        }
      }
      return userContactBuilder;
    }

    /**
     * Sets the Builder instance for the 'userContact' field
     * Avro Schema which contains the user info, the preferred contact platform and a contact ID
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder setUserContactBuilder(it.unipd.dstack.butterfly.consumer.avro.UserSingleContact.Builder value) {
      clearUserContact();
      userContactBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'userContact' field has an active Builder instance
     * Avro Schema which contains the user info, the preferred contact platform and a contact ID
     * @return True if the 'userContact' field has an active Builder instance
     */
    public boolean hasUserContactBuilder() {
      return userContactBuilder != null;
    }

    /**
      * Clears the value of the 'userContact' field.
      * Avro Schema which contains the user info, the preferred contact platform and a contact ID
      * @return This builder.
      */
    public it.unipd.dstack.butterfly.consumer.avro.EventWithUserContact.Builder clearUserContact() {
      userContact = null;
      userContactBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EventWithUserContact build() {
      try {
        EventWithUserContact record = new EventWithUserContact();
        if (eventBuilder != null) {
          record.event = this.eventBuilder.build();
        } else {
          record.event = fieldSetFlags()[0] ? this.event : (it.unipd.dstack.butterfly.producer.avro.Event) defaultValue(fields()[0]);
        }
        if (userContactBuilder != null) {
          record.userContact = this.userContactBuilder.build();
        } else {
          record.userContact = fieldSetFlags()[1] ? this.userContact : (it.unipd.dstack.butterfly.consumer.avro.UserSingleContact) defaultValue(fields()[1]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EventWithUserContact>
    WRITER$ = (org.apache.avro.io.DatumWriter<EventWithUserContact>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EventWithUserContact>
    READER$ = (org.apache.avro.io.DatumReader<EventWithUserContact>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}