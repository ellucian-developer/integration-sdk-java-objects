
package com.ellucian.generated.eedm.dfe_admission_decisions.v1_2_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DfE Admission Decisions
 * <p>
 * Decisions made on teachers training applications in UK under UK Government Department, DfE (Department for Education).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "application",
    "dfeApplicationId",
    "admissionDecision",
    "decision",
    "interview",
    "courseInformation",
    "conditions",
    "conditionsMet",
    "decidedOn",
    "representative"
})
@Generated("jsonschema2pojo")
public class DfeAdmissionDecisions {

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
     * 
     */
    @JsonProperty("application")
    @JsonPropertyDescription("The admission application on which this decision was made.")
    private Object application;
    /**
     * DfE Application ID
     * <p>
     * The unique DfE ID of the application on which this decision was made.
     * (Required)
     * 
     */
    @JsonProperty("dfeApplicationId")
    @JsonPropertyDescription("The unique DfE ID of the application on which this decision was made.")
    private String dfeApplicationId;
    /**
     * Admission Decision
     * <p>
     * Decisions made on admission applications.
     * 
     */
    @JsonProperty("admissionDecision")
    @JsonPropertyDescription("Decisions made on admission applications.")
    private Object admissionDecision;
    /**
     * Decision
     * <p>
     * The decision made on DfE admission application.
     * 
     */
    @JsonProperty("decision")
    @JsonPropertyDescription("The decision made on DfE admission application.")
    private Object decision;
    /**
     * Interview
     * <p>
     * Interviews made on teachers training applications in UK under UK Government Department, DfE (Department for Education).
     * 
     */
    @JsonProperty("interview")
    @JsonPropertyDescription("Interviews made on teachers training applications in UK under UK Government Department, DfE (Department for Education).")
    private Interview interview;
    /**
     * Course Information
     * <p>
     * Identifies the subject offered by the institution and all related information.
     * 
     */
    @JsonProperty("courseInformation")
    @JsonPropertyDescription("Identifies the subject offered by the institution and all related information.")
    private Object courseInformation;
    /**
     * Conditions
     * <p>
     * The conditions of the offer.
     * 
     */
    @JsonProperty("conditions")
    @JsonPropertyDescription("The conditions of the offer.")
    private List<String> conditions = new ArrayList<String>();
    /**
     * Conditions Met
     * <p>
     * Flag to identify if conditions are Met or nor Met.
     * 
     */
    @JsonProperty("conditionsMet")
    @JsonPropertyDescription("Flag to identify if conditions are Met or nor Met.")
    private Boolean conditionsMet;
    /**
     * Decided On
     * <p>
     * The date of the decision on the admission application.
     * 
     */
    @JsonProperty("decidedOn")
    @JsonPropertyDescription("The date of the decision on the admission application.")
    private Date decidedOn;
    /**
     * Representative
     * <p>
     * The individual representing the institution who made this decision.
     * (Required)
     * 
     */
    @JsonProperty("representative")
    @JsonPropertyDescription("The individual representing the institution who made this decision.")
    private Representative representative;

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

    public DfeAdmissionDecisions withMetadata(Metadata metadata) {
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

    public DfeAdmissionDecisions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Application
     * <p>
     * The admission application on which this decision was made.
     * 
     */
    @JsonProperty("application")
    public Object getApplication() {
        return application;
    }

    /**
     * Application
     * <p>
     * The admission application on which this decision was made.
     * 
     */
    @JsonProperty("application")
    public void setApplication(Object application) {
        this.application = application;
    }

    public DfeAdmissionDecisions withApplication(Object application) {
        this.application = application;
        return this;
    }

    /**
     * DfE Application ID
     * <p>
     * The unique DfE ID of the application on which this decision was made.
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
     * The unique DfE ID of the application on which this decision was made.
     * (Required)
     * 
     */
    @JsonProperty("dfeApplicationId")
    public void setDfeApplicationId(String dfeApplicationId) {
        this.dfeApplicationId = dfeApplicationId;
    }

    public DfeAdmissionDecisions withDfeApplicationId(String dfeApplicationId) {
        this.dfeApplicationId = dfeApplicationId;
        return this;
    }

    /**
     * Admission Decision
     * <p>
     * Decisions made on admission applications.
     * 
     */
    @JsonProperty("admissionDecision")
    public Object getAdmissionDecision() {
        return admissionDecision;
    }

    /**
     * Admission Decision
     * <p>
     * Decisions made on admission applications.
     * 
     */
    @JsonProperty("admissionDecision")
    public void setAdmissionDecision(Object admissionDecision) {
        this.admissionDecision = admissionDecision;
    }

    public DfeAdmissionDecisions withAdmissionDecision(Object admissionDecision) {
        this.admissionDecision = admissionDecision;
        return this;
    }

    /**
     * Decision
     * <p>
     * The decision made on DfE admission application.
     * 
     */
    @JsonProperty("decision")
    public Object getDecision() {
        return decision;
    }

    /**
     * Decision
     * <p>
     * The decision made on DfE admission application.
     * 
     */
    @JsonProperty("decision")
    public void setDecision(Object decision) {
        this.decision = decision;
    }

    public DfeAdmissionDecisions withDecision(Object decision) {
        this.decision = decision;
        return this;
    }

    /**
     * Interview
     * <p>
     * Interviews made on teachers training applications in UK under UK Government Department, DfE (Department for Education).
     * 
     */
    @JsonProperty("interview")
    public Interview getInterview() {
        return interview;
    }

    /**
     * Interview
     * <p>
     * Interviews made on teachers training applications in UK under UK Government Department, DfE (Department for Education).
     * 
     */
    @JsonProperty("interview")
    public void setInterview(Interview interview) {
        this.interview = interview;
    }

    public DfeAdmissionDecisions withInterview(Interview interview) {
        this.interview = interview;
        return this;
    }

    /**
     * Course Information
     * <p>
     * Identifies the subject offered by the institution and all related information.
     * 
     */
    @JsonProperty("courseInformation")
    public Object getCourseInformation() {
        return courseInformation;
    }

    /**
     * Course Information
     * <p>
     * Identifies the subject offered by the institution and all related information.
     * 
     */
    @JsonProperty("courseInformation")
    public void setCourseInformation(Object courseInformation) {
        this.courseInformation = courseInformation;
    }

    public DfeAdmissionDecisions withCourseInformation(Object courseInformation) {
        this.courseInformation = courseInformation;
        return this;
    }

    /**
     * Conditions
     * <p>
     * The conditions of the offer.
     * 
     */
    @JsonProperty("conditions")
    public List<String> getConditions() {
        return conditions;
    }

    /**
     * Conditions
     * <p>
     * The conditions of the offer.
     * 
     */
    @JsonProperty("conditions")
    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }

    public DfeAdmissionDecisions withConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Conditions Met
     * <p>
     * Flag to identify if conditions are Met or nor Met.
     * 
     */
    @JsonProperty("conditionsMet")
    public Boolean getConditionsMet() {
        return conditionsMet;
    }

    /**
     * Conditions Met
     * <p>
     * Flag to identify if conditions are Met or nor Met.
     * 
     */
    @JsonProperty("conditionsMet")
    public void setConditionsMet(Boolean conditionsMet) {
        this.conditionsMet = conditionsMet;
    }

    public DfeAdmissionDecisions withConditionsMet(Boolean conditionsMet) {
        this.conditionsMet = conditionsMet;
        return this;
    }

    /**
     * Decided On
     * <p>
     * The date of the decision on the admission application.
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
     * 
     */
    @JsonProperty("decidedOn")
    public void setDecidedOn(Date decidedOn) {
        this.decidedOn = decidedOn;
    }

    public DfeAdmissionDecisions withDecidedOn(Date decidedOn) {
        this.decidedOn = decidedOn;
        return this;
    }

    /**
     * Representative
     * <p>
     * The individual representing the institution who made this decision.
     * (Required)
     * 
     */
    @JsonProperty("representative")
    public Representative getRepresentative() {
        return representative;
    }

    /**
     * Representative
     * <p>
     * The individual representing the institution who made this decision.
     * (Required)
     * 
     */
    @JsonProperty("representative")
    public void setRepresentative(Representative representative) {
        this.representative = representative;
    }

    public DfeAdmissionDecisions withRepresentative(Representative representative) {
        this.representative = representative;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DfeAdmissionDecisions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("dfeApplicationId");
        sb.append('=');
        sb.append(((this.dfeApplicationId == null)?"<null>":this.dfeApplicationId));
        sb.append(',');
        sb.append("admissionDecision");
        sb.append('=');
        sb.append(((this.admissionDecision == null)?"<null>":this.admissionDecision));
        sb.append(',');
        sb.append("decision");
        sb.append('=');
        sb.append(((this.decision == null)?"<null>":this.decision));
        sb.append(',');
        sb.append("interview");
        sb.append('=');
        sb.append(((this.interview == null)?"<null>":this.interview));
        sb.append(',');
        sb.append("courseInformation");
        sb.append('=');
        sb.append(((this.courseInformation == null)?"<null>":this.courseInformation));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("conditionsMet");
        sb.append('=');
        sb.append(((this.conditionsMet == null)?"<null>":this.conditionsMet));
        sb.append(',');
        sb.append("decidedOn");
        sb.append('=');
        sb.append(((this.decidedOn == null)?"<null>":this.decidedOn));
        sb.append(',');
        sb.append("representative");
        sb.append('=');
        sb.append(((this.representative == null)?"<null>":this.representative));
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
        result = ((result* 31)+((this.admissionDecision == null)? 0 :this.admissionDecision.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.decidedOn == null)? 0 :this.decidedOn.hashCode()));
        result = ((result* 31)+((this.decision == null)? 0 :this.decision.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.dfeApplicationId == null)? 0 :this.dfeApplicationId.hashCode()));
        result = ((result* 31)+((this.conditionsMet == null)? 0 :this.conditionsMet.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.courseInformation == null)? 0 :this.courseInformation.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.interview == null)? 0 :this.interview.hashCode()));
        result = ((result* 31)+((this.representative == null)? 0 :this.representative.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DfeAdmissionDecisions) == false) {
            return false;
        }
        DfeAdmissionDecisions rhs = ((DfeAdmissionDecisions) other);
        return (((((((((((((this.admissionDecision == rhs.admissionDecision)||((this.admissionDecision!= null)&&this.admissionDecision.equals(rhs.admissionDecision)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.decidedOn == rhs.decidedOn)||((this.decidedOn!= null)&&this.decidedOn.equals(rhs.decidedOn))))&&((this.decision == rhs.decision)||((this.decision!= null)&&this.decision.equals(rhs.decision))))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.dfeApplicationId == rhs.dfeApplicationId)||((this.dfeApplicationId!= null)&&this.dfeApplicationId.equals(rhs.dfeApplicationId))))&&((this.conditionsMet == rhs.conditionsMet)||((this.conditionsMet!= null)&&this.conditionsMet.equals(rhs.conditionsMet))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.courseInformation == rhs.courseInformation)||((this.courseInformation!= null)&&this.courseInformation.equals(rhs.courseInformation))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.interview == rhs.interview)||((this.interview!= null)&&this.interview.equals(rhs.interview))))&&((this.representative == rhs.representative)||((this.representative!= null)&&this.representative.equals(rhs.representative))));
    }

}
