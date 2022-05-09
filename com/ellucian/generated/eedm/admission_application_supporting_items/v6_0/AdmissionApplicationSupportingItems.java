
package com.ellucian.generated.eedm.admission_application_supporting_items.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Admission Application Supporting Items
 * <p>
 * Supporting items required for application of student admission
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "application",
    "type",
    "receivedOn",
    "required",
    "requiredByDate",
    "firstRequestedOn",
    "lastRequestedOn",
    "externalReference",
    "status"
})
@Generated("jsonschema2pojo")
public class AdmissionApplicationSupportingItems {

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
     * The global identifier of the admission-application-supplementary-items.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the admission-application-supplementary-items.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the admission-application-supplementary-items.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the admission-application-supplementary-items.")
    private String title;
    /**
     * Application
     * <p>
     * The application that supplementary items are required for.
     * (Required)
     * 
     */
    @JsonProperty("application")
    @JsonPropertyDescription("The application that supplementary items are required for.")
    private Application application;
    /**
     * Type
     * <p>
     * The type of supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of supplementary item.")
    private Type type;
    /**
     * Received On
     * <p>
     * Date the supplementary items was received.
     * 
     */
    @JsonProperty("receivedOn")
    @JsonPropertyDescription("Date the supplementary items was received.")
    private Object receivedOn;
    /**
     * Required
     * <p>
     * Requiredness of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("required")
    @JsonPropertyDescription("Requiredness of the supplementary item.")
    private AdmissionApplicationSupportingItems.Required required;
    /**
     * Required By Date
     * <p>
     * The date the supplementary item is required by.
     * 
     */
    @JsonProperty("requiredByDate")
    @JsonPropertyDescription("The date the supplementary item is required by.")
    private Object requiredByDate;
    /**
     * First Requested On
     * <p>
     * First time the supplementary item was requested on.
     * 
     */
    @JsonProperty("firstRequestedOn")
    @JsonPropertyDescription("First time the supplementary item was requested on.")
    private Object firstRequestedOn;
    /**
     * Last Requested On
     * <p>
     * Last time the supplementary items was requested on.
     * 
     */
    @JsonProperty("lastRequestedOn")
    @JsonPropertyDescription("Last time the supplementary items was requested on.")
    private Object lastRequestedOn;
    /**
     * External Reference
     * <p>
     * External reference of the supplementary item.
     * 
     */
    @JsonProperty("externalReference")
    @JsonPropertyDescription("External reference of the supplementary item.")
    private String externalReference;
    /**
     * Status
     * <p>
     * Status of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the supplementary item.")
    private Status status;

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

    public AdmissionApplicationSupportingItems withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the admission-application-supplementary-items.
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
     * The global identifier of the admission-application-supplementary-items.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionApplicationSupportingItems withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the admission-application-supplementary-items.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the admission-application-supplementary-items.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdmissionApplicationSupportingItems withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Application
     * <p>
     * The application that supplementary items are required for.
     * (Required)
     * 
     */
    @JsonProperty("application")
    public Application getApplication() {
        return application;
    }

    /**
     * Application
     * <p>
     * The application that supplementary items are required for.
     * (Required)
     * 
     */
    @JsonProperty("application")
    public void setApplication(Application application) {
        this.application = application;
    }

    public AdmissionApplicationSupportingItems withApplication(Application application) {
        this.application = application;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of supplementary item.
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
     * The type of supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public AdmissionApplicationSupportingItems withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Received On
     * <p>
     * Date the supplementary items was received.
     * 
     */
    @JsonProperty("receivedOn")
    public Object getReceivedOn() {
        return receivedOn;
    }

    /**
     * Received On
     * <p>
     * Date the supplementary items was received.
     * 
     */
    @JsonProperty("receivedOn")
    public void setReceivedOn(Object receivedOn) {
        this.receivedOn = receivedOn;
    }

    public AdmissionApplicationSupportingItems withReceivedOn(Object receivedOn) {
        this.receivedOn = receivedOn;
        return this;
    }

    /**
     * Required
     * <p>
     * Requiredness of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("required")
    public AdmissionApplicationSupportingItems.Required getRequired() {
        return required;
    }

    /**
     * Required
     * <p>
     * Requiredness of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("required")
    public void setRequired(AdmissionApplicationSupportingItems.Required required) {
        this.required = required;
    }

    public AdmissionApplicationSupportingItems withRequired(AdmissionApplicationSupportingItems.Required required) {
        this.required = required;
        return this;
    }

    /**
     * Required By Date
     * <p>
     * The date the supplementary item is required by.
     * 
     */
    @JsonProperty("requiredByDate")
    public Object getRequiredByDate() {
        return requiredByDate;
    }

    /**
     * Required By Date
     * <p>
     * The date the supplementary item is required by.
     * 
     */
    @JsonProperty("requiredByDate")
    public void setRequiredByDate(Object requiredByDate) {
        this.requiredByDate = requiredByDate;
    }

    public AdmissionApplicationSupportingItems withRequiredByDate(Object requiredByDate) {
        this.requiredByDate = requiredByDate;
        return this;
    }

    /**
     * First Requested On
     * <p>
     * First time the supplementary item was requested on.
     * 
     */
    @JsonProperty("firstRequestedOn")
    public Object getFirstRequestedOn() {
        return firstRequestedOn;
    }

    /**
     * First Requested On
     * <p>
     * First time the supplementary item was requested on.
     * 
     */
    @JsonProperty("firstRequestedOn")
    public void setFirstRequestedOn(Object firstRequestedOn) {
        this.firstRequestedOn = firstRequestedOn;
    }

    public AdmissionApplicationSupportingItems withFirstRequestedOn(Object firstRequestedOn) {
        this.firstRequestedOn = firstRequestedOn;
        return this;
    }

    /**
     * Last Requested On
     * <p>
     * Last time the supplementary items was requested on.
     * 
     */
    @JsonProperty("lastRequestedOn")
    public Object getLastRequestedOn() {
        return lastRequestedOn;
    }

    /**
     * Last Requested On
     * <p>
     * Last time the supplementary items was requested on.
     * 
     */
    @JsonProperty("lastRequestedOn")
    public void setLastRequestedOn(Object lastRequestedOn) {
        this.lastRequestedOn = lastRequestedOn;
    }

    public AdmissionApplicationSupportingItems withLastRequestedOn(Object lastRequestedOn) {
        this.lastRequestedOn = lastRequestedOn;
        return this;
    }

    /**
     * External Reference
     * <p>
     * External reference of the supplementary item.
     * 
     */
    @JsonProperty("externalReference")
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * External Reference
     * <p>
     * External reference of the supplementary item.
     * 
     */
    @JsonProperty("externalReference")
    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public AdmissionApplicationSupportingItems withExternalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    /**
     * Status
     * <p>
     * Status of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Status of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public AdmissionApplicationSupportingItems withStatus(Status status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionApplicationSupportingItems.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("application");
        sb.append('=');
        sb.append(((this.application == null)?"<null>":this.application));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("receivedOn");
        sb.append('=');
        sb.append(((this.receivedOn == null)?"<null>":this.receivedOn));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
        sb.append(',');
        sb.append("requiredByDate");
        sb.append('=');
        sb.append(((this.requiredByDate == null)?"<null>":this.requiredByDate));
        sb.append(',');
        sb.append("firstRequestedOn");
        sb.append('=');
        sb.append(((this.firstRequestedOn == null)?"<null>":this.firstRequestedOn));
        sb.append(',');
        sb.append("lastRequestedOn");
        sb.append('=');
        sb.append(((this.lastRequestedOn == null)?"<null>":this.lastRequestedOn));
        sb.append(',');
        sb.append("externalReference");
        sb.append('=');
        sb.append(((this.externalReference == null)?"<null>":this.externalReference));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.firstRequestedOn == null)? 0 :this.firstRequestedOn.hashCode()));
        result = ((result* 31)+((this.lastRequestedOn == null)? 0 :this.lastRequestedOn.hashCode()));
        result = ((result* 31)+((this.requiredByDate == null)? 0 :this.requiredByDate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        result = ((result* 31)+((this.externalReference == null)? 0 :this.externalReference.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.receivedOn == null)? 0 :this.receivedOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionApplicationSupportingItems) == false) {
            return false;
        }
        AdmissionApplicationSupportingItems rhs = ((AdmissionApplicationSupportingItems) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.firstRequestedOn == rhs.firstRequestedOn)||((this.firstRequestedOn!= null)&&this.firstRequestedOn.equals(rhs.firstRequestedOn))))&&((this.lastRequestedOn == rhs.lastRequestedOn)||((this.lastRequestedOn!= null)&&this.lastRequestedOn.equals(rhs.lastRequestedOn))))&&((this.requiredByDate == rhs.requiredByDate)||((this.requiredByDate!= null)&&this.requiredByDate.equals(rhs.requiredByDate))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))))&&((this.externalReference == rhs.externalReference)||((this.externalReference!= null)&&this.externalReference.equals(rhs.externalReference))))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.receivedOn == rhs.receivedOn)||((this.receivedOn!= null)&&this.receivedOn.equals(rhs.receivedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Required
     * <p>
     * Requiredness of the supplementary item.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Required {

        MANDATORY("mandatory"),
        OPTIONAL("optional");
        private final String value;
        private final static Map<String, AdmissionApplicationSupportingItems.Required> CONSTANTS = new HashMap<String, AdmissionApplicationSupportingItems.Required>();

        static {
            for (AdmissionApplicationSupportingItems.Required c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Required(String value) {
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
        public static AdmissionApplicationSupportingItems.Required fromValue(String value) {
            AdmissionApplicationSupportingItems.Required constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
