
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DfE Application Submission Process
 * <p>
 * The submission of teachers training applications in UK under UK Government Department, DfE (Department for Education).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dfeApplicationId",
    "type",
    "attribute",
    "metadata"
})
@Generated("jsonschema2pojo")
public class DfeApplicationSubmissionProcess {

    /**
     * DfE Application ID
     * <p>
     * The unique DfE ID of this application.
     * (Required)
     * 
     */
    @JsonProperty("dfeApplicationId")
    @JsonPropertyDescription("The unique DfE ID of this application.")
    private String dfeApplicationId;
    /**
     * Type
     * <p>
     * Type of the object, always 'application'.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the object, always 'application'.")
    private String type;
    /**
     * Attribute
     * <p>
     * The attributes of the application and applicant.
     * (Required)
     * 
     */
    @JsonProperty("attribute")
    @JsonPropertyDescription("The attributes of the application and applicant.")
    private Attribute attribute;
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
     * DfE Application ID
     * <p>
     * The unique DfE ID of this application.
     * (Required)
     * 
     */
    @JsonProperty("dfeApplicationId")
    public String getDfeApplicationId() {
        return dfeApplicationId;
    }

    /**
     * DfE Application ID
     * <p>
     * The unique DfE ID of this application.
     * (Required)
     * 
     */
    @JsonProperty("dfeApplicationId")
    public void setDfeApplicationId(String dfeApplicationId) {
        this.dfeApplicationId = dfeApplicationId;
    }

    public DfeApplicationSubmissionProcess withDfeApplicationId(String dfeApplicationId) {
        this.dfeApplicationId = dfeApplicationId;
        return this;
    }

    /**
     * Type
     * <p>
     * Type of the object, always 'application'.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Type of the object, always 'application'.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public DfeApplicationSubmissionProcess withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Attribute
     * <p>
     * The attributes of the application and applicant.
     * (Required)
     * 
     */
    @JsonProperty("attribute")
    public Attribute getAttribute() {
        return attribute;
    }

    /**
     * Attribute
     * <p>
     * The attributes of the application and applicant.
     * (Required)
     * 
     */
    @JsonProperty("attribute")
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public DfeApplicationSubmissionProcess withAttribute(Attribute attribute) {
        this.attribute = attribute;
        return this;
    }

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

    public DfeApplicationSubmissionProcess withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DfeApplicationSubmissionProcess.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dfeApplicationId");
        sb.append('=');
        sb.append(((this.dfeApplicationId == null)?"<null>":this.dfeApplicationId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("attribute");
        sb.append('=');
        sb.append(((this.attribute == null)?"<null>":this.attribute));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
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
        result = ((result* 31)+((this.attribute == null)? 0 :this.attribute.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.dfeApplicationId == null)? 0 :this.dfeApplicationId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DfeApplicationSubmissionProcess) == false) {
            return false;
        }
        DfeApplicationSubmissionProcess rhs = ((DfeApplicationSubmissionProcess) other);
        return (((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.attribute == rhs.attribute)||((this.attribute!= null)&&this.attribute.equals(rhs.attribute))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.dfeApplicationId == rhs.dfeApplicationId)||((this.dfeApplicationId!= null)&&this.dfeApplicationId.equals(rhs.dfeApplicationId))));
    }

}
