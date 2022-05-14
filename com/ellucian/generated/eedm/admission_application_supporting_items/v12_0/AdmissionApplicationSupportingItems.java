
package com.ellucian.generated.eedm.admission_application_supporting_items.v12_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Admission Application Supporting Items
 * <p>
 * Supporting items required for application of student admission.
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
    "requiredByDate",
    "assignedOn",
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
     * The global identifier of the admission application supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the admission application supplementary item.")
    private String id;
    /**
     * Application
     * <p>
     * The application for which the supplementary items are required.
     * (Required)
     * 
     */
    @JsonProperty("application")
    @JsonPropertyDescription("The application for which the supplementary items are required.")
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
     * The date when the supplementary item was received.
     * 
     */
    @JsonProperty("receivedOn")
    @JsonPropertyDescription("The date when the supplementary item was received.")
    private Object receivedOn;
    /**
     * Required
     * <p>
     * Requiredness of the supplementary item.
     * 
     */
    @JsonProperty("required")
    @JsonPropertyDescription("Requiredness of the supplementary item.")
    private Object required;
    /**
     * Required By Date
     * <p>
     * The date by which the supplementary item is required.
     * 
     */
    @JsonProperty("requiredByDate")
    @JsonPropertyDescription("The date by which the supplementary item is required.")
    private Object requiredByDate;
    /**
     * Assigned On
     * <p>
     * The date the supplementary item was assigned as a requirement.
     * 
     */
    @JsonProperty("assignedOn")
    @JsonPropertyDescription("The date the supplementary item was assigned as a requirement.")
    private Object assignedOn;
    /**
     * External Reference
     * <p>
     * An external reference of the supplementary item.
     * 
     */
    @JsonProperty("externalReference")
    @JsonPropertyDescription("An external reference of the supplementary item.")
    private String externalReference;
    /**
     * Status
     * <p>
     * The status of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the supplementary item.")
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
     * The global identifier of the admission application supplementary item.
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
     * The global identifier of the admission application supplementary item.
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
     * Application
     * <p>
     * The application for which the supplementary items are required.
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
     * The application for which the supplementary items are required.
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
     * The date when the supplementary item was received.
     * 
     */
    @JsonProperty("receivedOn")
    public Object getReceivedOn() {
        return receivedOn;
    }

    /**
     * Received On
     * <p>
     * The date when the supplementary item was received.
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
     * 
     */
    @JsonProperty("required")
    public Object getRequired() {
        return required;
    }

    /**
     * Required
     * <p>
     * Requiredness of the supplementary item.
     * 
     */
    @JsonProperty("required")
    public void setRequired(Object required) {
        this.required = required;
    }

    public AdmissionApplicationSupportingItems withRequired(Object required) {
        this.required = required;
        return this;
    }

    /**
     * Required By Date
     * <p>
     * The date by which the supplementary item is required.
     * 
     */
    @JsonProperty("requiredByDate")
    public Object getRequiredByDate() {
        return requiredByDate;
    }

    /**
     * Required By Date
     * <p>
     * The date by which the supplementary item is required.
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
     * Assigned On
     * <p>
     * The date the supplementary item was assigned as a requirement.
     * 
     */
    @JsonProperty("assignedOn")
    public Object getAssignedOn() {
        return assignedOn;
    }

    /**
     * Assigned On
     * <p>
     * The date the supplementary item was assigned as a requirement.
     * 
     */
    @JsonProperty("assignedOn")
    public void setAssignedOn(Object assignedOn) {
        this.assignedOn = assignedOn;
    }

    public AdmissionApplicationSupportingItems withAssignedOn(Object assignedOn) {
        this.assignedOn = assignedOn;
        return this;
    }

    /**
     * External Reference
     * <p>
     * An external reference of the supplementary item.
     * 
     */
    @JsonProperty("externalReference")
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * External Reference
     * <p>
     * An external reference of the supplementary item.
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
     * The status of the supplementary item.
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
     * The status of the supplementary item.
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
        sb.append("assignedOn");
        sb.append('=');
        sb.append(((this.assignedOn == null)?"<null>":this.assignedOn));
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
        result = ((result* 31)+((this.externalReference == null)? 0 :this.externalReference.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.receivedOn == null)? 0 :this.receivedOn.hashCode()));
        result = ((result* 31)+((this.requiredByDate == null)? 0 :this.requiredByDate.hashCode()));
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
        if ((other instanceof AdmissionApplicationSupportingItems) == false) {
            return false;
        }
        AdmissionApplicationSupportingItems rhs = ((AdmissionApplicationSupportingItems) other);
        return (((((((((((this.externalReference == rhs.externalReference)||((this.externalReference!= null)&&this.externalReference.equals(rhs.externalReference)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.receivedOn == rhs.receivedOn)||((this.receivedOn!= null)&&this.receivedOn.equals(rhs.receivedOn))))&&((this.requiredByDate == rhs.requiredByDate)||((this.requiredByDate!= null)&&this.requiredByDate.equals(rhs.requiredByDate))))&&((this.assignedOn == rhs.assignedOn)||((this.assignedOn!= null)&&this.assignedOn.equals(rhs.assignedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
