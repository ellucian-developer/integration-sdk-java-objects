
package com.ellucian.generated.eedm.aptitude_assessments.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Aptitude Assessments
 * <p>
 * Assessments that are used to determine a student's aptitude (academic achievement, competency, proficiency).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "code",
    "description",
    "vendor",
    "parentAssessment",
    "validScores",
    "calculation",
    "assessmentType"
})
@Generated("jsonschema2pojo")
public class AptitudeAssessments {

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
     * The global identifier of the Aptitude Assessment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Aptitude Assessment.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the Aptitude Assessment.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the Aptitude Assessment.")
    private String title;
    /**
     * Code
     * <p>
     * The code that identifies the Aptitude Assessment.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that identifies the Aptitude Assessment.")
    private String code;
    /**
     * Description
     * <p>
     * The description of the Aptitude Assessment.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the Aptitude Assessment.")
    private String description;
    /**
     * Vendor
     * <p>
     * The organization that offers the assessment.
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("The organization that offers the assessment.")
    private Object vendor;
    /**
     * Parent Assessment
     * <p>
     * The assessment of which the assessment is part.
     * 
     */
    @JsonProperty("parentAssessment")
    @JsonPropertyDescription("The assessment of which the assessment is part.")
    private Object parentAssessment;
    /**
     * Valid Scores
     * <p>
     * The valid scores that may be awarded for the assessment.
     * 
     */
    @JsonProperty("validScores")
    @JsonPropertyDescription("The valid scores that may be awarded for the assessment.")
    private Object validScores;
    /**
     * Calculation
     * <p>
     * The type and method of the calculations to be used to determent the assessment score.
     * 
     */
    @JsonProperty("calculation")
    @JsonPropertyDescription("The type and method of the calculations to be used to determent the assessment score.")
    private Calculation calculation;
    /**
     * Assessment Type
     * <p>
     * The type of the assessment (e.g. admissions, placement, ...).
     * 
     */
    @JsonProperty("assessmentType")
    @JsonPropertyDescription("The type of the assessment (e.g. admissions, placement, ...).")
    private Object assessmentType;

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

    public AptitudeAssessments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Aptitude Assessment.
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
     * The global identifier of the Aptitude Assessment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AptitudeAssessments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the Aptitude Assessment.
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
     * The full name of the Aptitude Assessment.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AptitudeAssessments withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Code
     * <p>
     * The code that identifies the Aptitude Assessment.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that identifies the Aptitude Assessment.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AptitudeAssessments withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the Aptitude Assessment.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the Aptitude Assessment.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AptitudeAssessments withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Vendor
     * <p>
     * The organization that offers the assessment.
     * 
     */
    @JsonProperty("vendor")
    public Object getVendor() {
        return vendor;
    }

    /**
     * Vendor
     * <p>
     * The organization that offers the assessment.
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Object vendor) {
        this.vendor = vendor;
    }

    public AptitudeAssessments withVendor(Object vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Parent Assessment
     * <p>
     * The assessment of which the assessment is part.
     * 
     */
    @JsonProperty("parentAssessment")
    public Object getParentAssessment() {
        return parentAssessment;
    }

    /**
     * Parent Assessment
     * <p>
     * The assessment of which the assessment is part.
     * 
     */
    @JsonProperty("parentAssessment")
    public void setParentAssessment(Object parentAssessment) {
        this.parentAssessment = parentAssessment;
    }

    public AptitudeAssessments withParentAssessment(Object parentAssessment) {
        this.parentAssessment = parentAssessment;
        return this;
    }

    /**
     * Valid Scores
     * <p>
     * The valid scores that may be awarded for the assessment.
     * 
     */
    @JsonProperty("validScores")
    public Object getValidScores() {
        return validScores;
    }

    /**
     * Valid Scores
     * <p>
     * The valid scores that may be awarded for the assessment.
     * 
     */
    @JsonProperty("validScores")
    public void setValidScores(Object validScores) {
        this.validScores = validScores;
    }

    public AptitudeAssessments withValidScores(Object validScores) {
        this.validScores = validScores;
        return this;
    }

    /**
     * Calculation
     * <p>
     * The type and method of the calculations to be used to determent the assessment score.
     * 
     */
    @JsonProperty("calculation")
    public Calculation getCalculation() {
        return calculation;
    }

    /**
     * Calculation
     * <p>
     * The type and method of the calculations to be used to determent the assessment score.
     * 
     */
    @JsonProperty("calculation")
    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public AptitudeAssessments withCalculation(Calculation calculation) {
        this.calculation = calculation;
        return this;
    }

    /**
     * Assessment Type
     * <p>
     * The type of the assessment (e.g. admissions, placement, ...).
     * 
     */
    @JsonProperty("assessmentType")
    public Object getAssessmentType() {
        return assessmentType;
    }

    /**
     * Assessment Type
     * <p>
     * The type of the assessment (e.g. admissions, placement, ...).
     * 
     */
    @JsonProperty("assessmentType")
    public void setAssessmentType(Object assessmentType) {
        this.assessmentType = assessmentType;
    }

    public AptitudeAssessments withAssessmentType(Object assessmentType) {
        this.assessmentType = assessmentType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AptitudeAssessments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("parentAssessment");
        sb.append('=');
        sb.append(((this.parentAssessment == null)?"<null>":this.parentAssessment));
        sb.append(',');
        sb.append("validScores");
        sb.append('=');
        sb.append(((this.validScores == null)?"<null>":this.validScores));
        sb.append(',');
        sb.append("calculation");
        sb.append('=');
        sb.append(((this.calculation == null)?"<null>":this.calculation));
        sb.append(',');
        sb.append("assessmentType");
        sb.append('=');
        sb.append(((this.assessmentType == null)?"<null>":this.assessmentType));
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
        result = ((result* 31)+((this.calculation == null)? 0 :this.calculation.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.assessmentType == null)? 0 :this.assessmentType.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.parentAssessment == null)? 0 :this.parentAssessment.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.validScores == null)? 0 :this.validScores.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AptitudeAssessments) == false) {
            return false;
        }
        AptitudeAssessments rhs = ((AptitudeAssessments) other);
        return (((((((((((this.calculation == rhs.calculation)||((this.calculation!= null)&&this.calculation.equals(rhs.calculation)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.assessmentType == rhs.assessmentType)||((this.assessmentType!= null)&&this.assessmentType.equals(rhs.assessmentType))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.parentAssessment == rhs.parentAssessment)||((this.parentAssessment!= null)&&this.parentAssessment.equals(rhs.parentAssessment))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.validScores == rhs.validScores)||((this.validScores!= null)&&this.validScores.equals(rhs.validScores))));
    }

}
