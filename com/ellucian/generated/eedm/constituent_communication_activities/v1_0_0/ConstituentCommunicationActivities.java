
package com.ellucian.generated.eedm.constituent_communication_activities.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Constituent Communication Activities
 * <p>
 * The communication activities directed to or received from constituents.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "subject",
    "description",
    "communicationActivityName",
    "status",
    "statusReason",
    "originator",
    "recipients",
    "regarding",
    "type",
    "notes"
})
@Generated("jsonschema2pojo")
public class ConstituentCommunicationActivities {

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
     * The global identifier of the constituent communication activity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent communication activity.")
    private String id;
    /**
     * Subject
     * <p>
     * The subject of the constituent communication activity.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("The subject of the constituent communication activity.")
    private String subject;
    /**
     * Description
     * <p>
     * The description of the constituent communication activity.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the constituent communication activity.")
    private String description;
    /**
     * Communication Activity Name
     * <p>
     * The name of the communication activity.
     * 
     */
    @JsonProperty("communicationActivityName")
    @JsonPropertyDescription("The name of the communication activity.")
    private Object communicationActivityName;
    /**
     * Status
     * <p>
     * The status of the communication activity.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the communication activity.")
    private ConstituentCommunicationActivities.Status status;
    /**
     * Status Reason
     * <p>
     * The reason for the status.
     * 
     */
    @JsonProperty("statusReason")
    @JsonPropertyDescription("The reason for the status.")
    private Object statusReason;
    /**
     * Originator
     * <p>
     * The initiator of the communication activity.
     * 
     */
    @JsonProperty("originator")
    @JsonPropertyDescription("The initiator of the communication activity.")
    private Object originator;
    /**
     * Recipients
     * <p>
     * The people or organizations specified as recipients of the communication activity.
     * 
     */
    @JsonProperty("recipients")
    @JsonPropertyDescription("The people or organizations specified as recipients of the communication activity.")
    private List<Recipient> recipients = new ArrayList<Recipient>();
    /**
     * Regarding
     * <p>
     * The topic of the communication activity.
     * 
     */
    @JsonProperty("regarding")
    @JsonPropertyDescription("The topic of the communication activity.")
    private Object regarding;
    /**
     * Type
     * <p>
     * The type of communication activity.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of communication activity.")
    private Object type;
    /**
     * Notes
     * <p>
     * The notes that have been generated regarding the constituent communication activity.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("The notes that have been generated regarding the constituent communication activity.")
    private List<Note> notes = new ArrayList<Note>();

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

    public ConstituentCommunicationActivities withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent communication activity.
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
     * The global identifier of the constituent communication activity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentCommunicationActivities withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Subject
     * <p>
     * The subject of the constituent communication activity.
     * 
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * Subject
     * <p>
     * The subject of the constituent communication activity.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ConstituentCommunicationActivities withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the constituent communication activity.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the constituent communication activity.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConstituentCommunicationActivities withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Communication Activity Name
     * <p>
     * The name of the communication activity.
     * 
     */
    @JsonProperty("communicationActivityName")
    public Object getCommunicationActivityName() {
        return communicationActivityName;
    }

    /**
     * Communication Activity Name
     * <p>
     * The name of the communication activity.
     * 
     */
    @JsonProperty("communicationActivityName")
    public void setCommunicationActivityName(Object communicationActivityName) {
        this.communicationActivityName = communicationActivityName;
    }

    public ConstituentCommunicationActivities withCommunicationActivityName(Object communicationActivityName) {
        this.communicationActivityName = communicationActivityName;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the communication activity.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public ConstituentCommunicationActivities.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the communication activity.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(ConstituentCommunicationActivities.Status status) {
        this.status = status;
    }

    public ConstituentCommunicationActivities withStatus(ConstituentCommunicationActivities.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Status Reason
     * <p>
     * The reason for the status.
     * 
     */
    @JsonProperty("statusReason")
    public Object getStatusReason() {
        return statusReason;
    }

    /**
     * Status Reason
     * <p>
     * The reason for the status.
     * 
     */
    @JsonProperty("statusReason")
    public void setStatusReason(Object statusReason) {
        this.statusReason = statusReason;
    }

    public ConstituentCommunicationActivities withStatusReason(Object statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * Originator
     * <p>
     * The initiator of the communication activity.
     * 
     */
    @JsonProperty("originator")
    public Object getOriginator() {
        return originator;
    }

    /**
     * Originator
     * <p>
     * The initiator of the communication activity.
     * 
     */
    @JsonProperty("originator")
    public void setOriginator(Object originator) {
        this.originator = originator;
    }

    public ConstituentCommunicationActivities withOriginator(Object originator) {
        this.originator = originator;
        return this;
    }

    /**
     * Recipients
     * <p>
     * The people or organizations specified as recipients of the communication activity.
     * 
     */
    @JsonProperty("recipients")
    public List<Recipient> getRecipients() {
        return recipients;
    }

    /**
     * Recipients
     * <p>
     * The people or organizations specified as recipients of the communication activity.
     * 
     */
    @JsonProperty("recipients")
    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
    }

    public ConstituentCommunicationActivities withRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
        return this;
    }

    /**
     * Regarding
     * <p>
     * The topic of the communication activity.
     * 
     */
    @JsonProperty("regarding")
    public Object getRegarding() {
        return regarding;
    }

    /**
     * Regarding
     * <p>
     * The topic of the communication activity.
     * 
     */
    @JsonProperty("regarding")
    public void setRegarding(Object regarding) {
        this.regarding = regarding;
    }

    public ConstituentCommunicationActivities withRegarding(Object regarding) {
        this.regarding = regarding;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of communication activity.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of communication activity.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public ConstituentCommunicationActivities withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Notes
     * <p>
     * The notes that have been generated regarding the constituent communication activity.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * The notes that have been generated regarding the constituent communication activity.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public ConstituentCommunicationActivities withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentCommunicationActivities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("communicationActivityName");
        sb.append('=');
        sb.append(((this.communicationActivityName == null)?"<null>":this.communicationActivityName));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusReason");
        sb.append('=');
        sb.append(((this.statusReason == null)?"<null>":this.statusReason));
        sb.append(',');
        sb.append("originator");
        sb.append('=');
        sb.append(((this.originator == null)?"<null>":this.originator));
        sb.append(',');
        sb.append("recipients");
        sb.append('=');
        sb.append(((this.recipients == null)?"<null>":this.recipients));
        sb.append(',');
        sb.append("regarding");
        sb.append('=');
        sb.append(((this.regarding == null)?"<null>":this.regarding));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
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
        result = ((result* 31)+((this.communicationActivityName == null)? 0 :this.communicationActivityName.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.originator == null)? 0 :this.originator.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.regarding == null)? 0 :this.regarding.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.recipients == null)? 0 :this.recipients.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentCommunicationActivities) == false) {
            return false;
        }
        ConstituentCommunicationActivities rhs = ((ConstituentCommunicationActivities) other);
        return (((((((((((((this.communicationActivityName == rhs.communicationActivityName)||((this.communicationActivityName!= null)&&this.communicationActivityName.equals(rhs.communicationActivityName)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.originator == rhs.originator)||((this.originator!= null)&&this.originator.equals(rhs.originator))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.regarding == rhs.regarding)||((this.regarding!= null)&&this.regarding.equals(rhs.regarding))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.recipients == rhs.recipients)||((this.recipients!= null)&&this.recipients.equals(rhs.recipients))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the communication activity.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        OPEN("open"),
        COMPLETED("completed"),
        CANCELED("canceled"),
        SCHEDULED("scheduled");
        private final String value;
        private final static Map<String, ConstituentCommunicationActivities.Status> CONSTANTS = new HashMap<String, ConstituentCommunicationActivities.Status>();

        static {
            for (ConstituentCommunicationActivities.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ConstituentCommunicationActivities.Status fromValue(String value) {
            ConstituentCommunicationActivities.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
