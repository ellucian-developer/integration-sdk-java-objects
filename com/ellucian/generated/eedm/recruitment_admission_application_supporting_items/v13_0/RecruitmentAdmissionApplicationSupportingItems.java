
package com.ellucian.generated.eedm.recruitment_admission_application_supporting_items.v13_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Recruitment Admission Application Supporting Items
 * <p>
 * Supporting items associated with the applications for admission.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "application",
    "type",
    "receivedOn",
    "required",
    "assignedOn",
    "status"
})
@Generated("jsonschema2pojo")
public class RecruitmentAdmissionApplicationSupportingItems {

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
     * The global identifier of the recruitment admission application supporting item.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the recruitment admission application supporting item.")
    private String id;
    /**
     * Application
     * <p>
     * The recruitment application to which the supporting item is associated.
     * (Required)
     * 
     */
    @JsonProperty("application")
    @JsonPropertyDescription("The recruitment application to which the supporting item is associated.")
    private Application application;
    /**
     * Type
     * <p>
     * The type of supporting item.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of supporting item.")
    private Type type;
    /**
     * Received On
     * <p>
     * The date when the supporting item was received.
     * 
     */
    @JsonProperty("receivedOn")
    @JsonPropertyDescription("The date when the supporting item was received.")
    private Object receivedOn;
    /**
     * Required
     * <p>
     * The requiredness of the supporting item.
     * 
     */
    @JsonProperty("required")
    @JsonPropertyDescription("The requiredness of the supporting item.")
    private Object required;
    /**
     * Assigned On
     * <p>
     * The date when the supporting item was assigned as a requirement.
     * 
     */
    @JsonProperty("assignedOn")
    @JsonPropertyDescription("The date when the supporting item was assigned as a requirement.")
    private Object assignedOn;
    /**
     * Status
     * <p>
     * The status of the supporting item.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the supporting item.")
    private RecruitmentAdmissionApplicationSupportingItems.Status status;

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

    public RecruitmentAdmissionApplicationSupportingItems withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the recruitment admission application supporting item.
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
     * The global identifier of the recruitment admission application supporting item.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RecruitmentAdmissionApplicationSupportingItems withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Application
     * <p>
     * The recruitment application to which the supporting item is associated.
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
     * The recruitment application to which the supporting item is associated.
     * (Required)
     * 
     */
    @JsonProperty("application")
    public void setApplication(Application application) {
        this.application = application;
    }

    public RecruitmentAdmissionApplicationSupportingItems withApplication(Application application) {
        this.application = application;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of supporting item.
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
     * The type of supporting item.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public RecruitmentAdmissionApplicationSupportingItems withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Received On
     * <p>
     * The date when the supporting item was received.
     * 
     */
    @JsonProperty("receivedOn")
    public Object getReceivedOn() {
        return receivedOn;
    }

    /**
     * Received On
     * <p>
     * The date when the supporting item was received.
     * 
     */
    @JsonProperty("receivedOn")
    public void setReceivedOn(Object receivedOn) {
        this.receivedOn = receivedOn;
    }

    public RecruitmentAdmissionApplicationSupportingItems withReceivedOn(Object receivedOn) {
        this.receivedOn = receivedOn;
        return this;
    }

    /**
     * Required
     * <p>
     * The requiredness of the supporting item.
     * 
     */
    @JsonProperty("required")
    public Object getRequired() {
        return required;
    }

    /**
     * Required
     * <p>
     * The requiredness of the supporting item.
     * 
     */
    @JsonProperty("required")
    public void setRequired(Object required) {
        this.required = required;
    }

    public RecruitmentAdmissionApplicationSupportingItems withRequired(Object required) {
        this.required = required;
        return this;
    }

    /**
     * Assigned On
     * <p>
     * The date when the supporting item was assigned as a requirement.
     * 
     */
    @JsonProperty("assignedOn")
    public Object getAssignedOn() {
        return assignedOn;
    }

    /**
     * Assigned On
     * <p>
     * The date when the supporting item was assigned as a requirement.
     * 
     */
    @JsonProperty("assignedOn")
    public void setAssignedOn(Object assignedOn) {
        this.assignedOn = assignedOn;
    }

    public RecruitmentAdmissionApplicationSupportingItems withAssignedOn(Object assignedOn) {
        this.assignedOn = assignedOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the supporting item.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public RecruitmentAdmissionApplicationSupportingItems.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the supporting item.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(RecruitmentAdmissionApplicationSupportingItems.Status status) {
        this.status = status;
    }

    public RecruitmentAdmissionApplicationSupportingItems withStatus(RecruitmentAdmissionApplicationSupportingItems.Status status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecruitmentAdmissionApplicationSupportingItems.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        sb.append("assignedOn");
        sb.append('=');
        sb.append(((this.assignedOn == null)?"<null>":this.assignedOn));
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
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.receivedOn == null)? 0 :this.receivedOn.hashCode()));
        result = ((result* 31)+((this.assignedOn == null)? 0 :this.assignedOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecruitmentAdmissionApplicationSupportingItems) == false) {
            return false;
        }
        RecruitmentAdmissionApplicationSupportingItems rhs = ((RecruitmentAdmissionApplicationSupportingItems) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.receivedOn == rhs.receivedOn)||((this.receivedOn!= null)&&this.receivedOn.equals(rhs.receivedOn))))&&((this.assignedOn == rhs.assignedOn)||((this.assignedOn!= null)&&this.assignedOn.equals(rhs.assignedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the supporting item.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        RECEIVED("received"),
        NOT_RECEIVED("notReceived"),
        WAIVED("waived");
        private final String value;
        private final static Map<String, RecruitmentAdmissionApplicationSupportingItems.Status> CONSTANTS = new HashMap<String, RecruitmentAdmissionApplicationSupportingItems.Status>();

        static {
            for (RecruitmentAdmissionApplicationSupportingItems.Status c: values()) {
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
        public static RecruitmentAdmissionApplicationSupportingItems.Status fromValue(String value) {
            RecruitmentAdmissionApplicationSupportingItems.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
