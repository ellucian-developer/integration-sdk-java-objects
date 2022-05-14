
package com.ellucian.generated.eedm.person_holds.v6_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Holds
 * <p>
 * A customized list of holds that may be applied to a person.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "type",
    "notificationIndicator",
    "startOn",
    "endOn",
    "comment"
})
@Generated("jsonschema2pojo")
public class PersonHolds {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the person hold.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the person hold.")
    private String id;
    /**
     * Person
     * <p>
     * The person for whom the hold has been recorded.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person for whom the hold has been recorded.")
    private Person person;
    /**
     * Type
     * <p>
     * The type of the hold.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the hold.")
    private Type type;
    /**
     * Notification Indicator
     * <p>
     * Indicates if the person should be notified of the hold being placed.
     * 
     */
    @JsonProperty("notificationIndicator")
    @JsonPropertyDescription("Indicates if the person should be notified of the hold being placed.")
    private Object notificationIndicator;
    /**
     * Start On
     * <p>
     * The date when the hold goes into effect.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the hold goes into effect.")
    private Date startOn;
    /**
     * End On
     * <p>
     * The date when the hold ends.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the hold ends.")
    private Object endOn;
    /**
     * Comment
     * <p>
     * A comment for the hold.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A comment for the hold.")
    private String comment;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public PersonHolds withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person hold.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person hold.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonHolds withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person for whom the hold has been recorded.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The person for whom the hold has been recorded.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonHolds withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the hold.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the hold.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public PersonHolds withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Notification Indicator
     * <p>
     * Indicates if the person should be notified of the hold being placed.
     * 
     */
    @JsonProperty("notificationIndicator")
    public Object getNotificationIndicator() {
        return notificationIndicator;
    }

    /**
     * Notification Indicator
     * <p>
     * Indicates if the person should be notified of the hold being placed.
     * 
     */
    @JsonProperty("notificationIndicator")
    public void setNotificationIndicator(Object notificationIndicator) {
        this.notificationIndicator = notificationIndicator;
    }

    public PersonHolds withNotificationIndicator(Object notificationIndicator) {
        this.notificationIndicator = notificationIndicator;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when the hold goes into effect.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the hold goes into effect.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public PersonHolds withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date when the hold ends.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when the hold ends.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public PersonHolds withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Comment
     * <p>
     * A comment for the hold.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * A comment for the hold.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public PersonHolds withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonHolds.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("notificationIndicator");
        sb.append('=');
        sb.append(((this.notificationIndicator == null)?"<null>":this.notificationIndicator));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.notificationIndicator == null)? 0 :this.notificationIndicator.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonHolds) == false) {
            return false;
        }
        PersonHolds rhs = ((PersonHolds) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.notificationIndicator == rhs.notificationIndicator)||((this.notificationIndicator!= null)&&this.notificationIndicator.equals(rhs.notificationIndicator))));
    }

}
