
package com.ellucian.generated.eedm.admission_decisions.v11_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Admission Decisions
 * <p>
 * Decisions made on admission applications.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "application",
    "decisionType",
    "decidedOn"
})
@Generated("jsonschema2pojo")
public class AdmissionDecisions {

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
     * The global identifier of the decision for the admission application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the decision for the admission application.")
    private String id;
    /**
     * Application
     * <p>
     * The admission application on which this decision was made.
     * (Required)
     * 
     */
    @JsonProperty("application")
    @JsonPropertyDescription("The admission application on which this decision was made.")
    private Application application;
    /**
     * Decision Type
     * <p>
     * The type of decision on the admission application.
     * (Required)
     * 
     */
    @JsonProperty("decisionType")
    @JsonPropertyDescription("The type of decision on the admission application.")
    private DecisionType decisionType;
    /**
     * Decided On
     * <p>
     * The date of the decision on the admission application.
     * (Required)
     * 
     */
    @JsonProperty("decidedOn")
    @JsonPropertyDescription("The date of the decision on the admission application.")
    private Date decidedOn;

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

    public AdmissionDecisions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the decision for the admission application.
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
     * The global identifier of the decision for the admission application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionDecisions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Application
     * <p>
     * The admission application on which this decision was made.
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
     * The admission application on which this decision was made.
     * (Required)
     * 
     */
    @JsonProperty("application")
    public void setApplication(Application application) {
        this.application = application;
    }

    public AdmissionDecisions withApplication(Application application) {
        this.application = application;
        return this;
    }

    /**
     * Decision Type
     * <p>
     * The type of decision on the admission application.
     * (Required)
     * 
     */
    @JsonProperty("decisionType")
    public DecisionType getDecisionType() {
        return decisionType;
    }

    /**
     * Decision Type
     * <p>
     * The type of decision on the admission application.
     * (Required)
     * 
     */
    @JsonProperty("decisionType")
    public void setDecisionType(DecisionType decisionType) {
        this.decisionType = decisionType;
    }

    public AdmissionDecisions withDecisionType(DecisionType decisionType) {
        this.decisionType = decisionType;
        return this;
    }

    /**
     * Decided On
     * <p>
     * The date of the decision on the admission application.
     * (Required)
     * 
     */
    @JsonProperty("decidedOn")
    public Date getDecidedOn() {
        return decidedOn;
    }

    /**
     * Decided On
     * <p>
     * The date of the decision on the admission application.
     * (Required)
     * 
     */
    @JsonProperty("decidedOn")
    public void setDecidedOn(Date decidedOn) {
        this.decidedOn = decidedOn;
    }

    public AdmissionDecisions withDecidedOn(Date decidedOn) {
        this.decidedOn = decidedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionDecisions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("decisionType");
        sb.append('=');
        sb.append(((this.decisionType == null)?"<null>":this.decisionType));
        sb.append(',');
        sb.append("decidedOn");
        sb.append('=');
        sb.append(((this.decidedOn == null)?"<null>":this.decidedOn));
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
        result = ((result* 31)+((this.decisionType == null)? 0 :this.decisionType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.decidedOn == null)? 0 :this.decidedOn.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionDecisions) == false) {
            return false;
        }
        AdmissionDecisions rhs = ((AdmissionDecisions) other);
        return ((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.decisionType == rhs.decisionType)||((this.decisionType!= null)&&this.decisionType.equals(rhs.decisionType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.decidedOn == rhs.decidedOn)||((this.decidedOn!= null)&&this.decidedOn.equals(rhs.decidedOn))))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))));
    }

}
