
package com.ellucian.generated.eedm.student_aptitude_assessments.v9_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Aptitude Assessments
 * <p>
 * The results of a aptitude assessment for a student.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "assessment",
    "assessedOn",
    "score",
    "percentiles",
    "form",
    "specialCircumstances",
    "update",
    "preference",
    "source",
    "status",
    "reported"
})
@Generated("jsonschema2pojo")
public class StudentAptitudeAssessments {

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
     * The global identifier of the Student Aptitude Assessment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Student Aptitude Assessment.")
    private String id;
    /**
     * Student
     * <p>
     * The student taking the aptitude assessment.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student taking the aptitude assessment.")
    private Student student;
    /**
     * Assessment
     * <p>
     * The aptitude assessment the student took.
     * (Required)
     * 
     */
    @JsonProperty("assessment")
    @JsonPropertyDescription("The aptitude assessment the student took.")
    private Assessment assessment;
    /**
     * Assessed On
     * <p>
     * The date on which the assessment occurred.
     * (Required)
     * 
     */
    @JsonProperty("assessedOn")
    @JsonPropertyDescription("The date on which the assessment occurred.")
    private Date assessedOn;
    /**
     * Score
     * <p>
     * The score the student received for the assessment.
     * (Required)
     * 
     */
    @JsonProperty("score")
    @JsonPropertyDescription("The score the student received for the assessment.")
    private Object score;
    /**
     * Percentiles
     * <p>
     * The percentile values and types associated with the score.
     * 
     */
    @JsonProperty("percentiles")
    @JsonPropertyDescription("The percentile values and types associated with the score.")
    private List<Percentile> percentiles = new ArrayList<Percentile>();
    /**
     * Form
     * <p>
     * The name and number of the form used for the assessment for this result.
     * 
     */
    @JsonProperty("form")
    @JsonPropertyDescription("The name and number of the form used for the assessment for this result.")
    private Form form;
    /**
     * Special Circumstances
     * <p>
     * Special circumstances surrounding the taking of the assessment
     * 
     */
    @JsonProperty("specialCircumstances")
    @JsonPropertyDescription("Special circumstances surrounding the taking of the assessment")
    private List<SpecialCircumstance> specialCircumstances = new ArrayList<SpecialCircumstance>();
    /**
     * Update
     * <p>
     * The update status of the student's assessment result.
     * 
     */
    @JsonProperty("update")
    @JsonPropertyDescription("The update status of the student's assessment result.")
    private Object update;
    /**
     * Preference
     * <p>
     * An indicator that this result of the assessment are the preferred values for the assessment
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("An indicator that this result of the assessment are the preferred values for the assessment")
    private Object preference;
    /**
     * Source
     * <p>
     * The sources of the assessment results for the student.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The sources of the assessment results for the student.")
    private Object source;
    /**
     * Status
     * <p>
     * The status of this assessment results for the student.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this assessment results for the student.")
    private Object status;
    /**
     * Reported
     * <p>
     * An indicator of the nature of the assessment results.
     * 
     */
    @JsonProperty("reported")
    @JsonPropertyDescription("An indicator of the nature of the assessment results.")
    private Object reported;

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

    public StudentAptitudeAssessments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Student Aptitude Assessment.
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
     * The global identifier of the Student Aptitude Assessment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAptitudeAssessments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student taking the aptitude assessment.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public Student getStudent() {
        return student;
    }

    /**
     * Student
     * <p>
     * The student taking the aptitude assessment.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentAptitudeAssessments withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Assessment
     * <p>
     * The aptitude assessment the student took.
     * (Required)
     * 
     */
    @JsonProperty("assessment")
    public Assessment getAssessment() {
        return assessment;
    }

    /**
     * Assessment
     * <p>
     * The aptitude assessment the student took.
     * (Required)
     * 
     */
    @JsonProperty("assessment")
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    public StudentAptitudeAssessments withAssessment(Assessment assessment) {
        this.assessment = assessment;
        return this;
    }

    /**
     * Assessed On
     * <p>
     * The date on which the assessment occurred.
     * (Required)
     * 
     */
    @JsonProperty("assessedOn")
    public Date getAssessedOn() {
        return assessedOn;
    }

    /**
     * Assessed On
     * <p>
     * The date on which the assessment occurred.
     * (Required)
     * 
     */
    @JsonProperty("assessedOn")
    public void setAssessedOn(Date assessedOn) {
        this.assessedOn = assessedOn;
    }

    public StudentAptitudeAssessments withAssessedOn(Date assessedOn) {
        this.assessedOn = assessedOn;
        return this;
    }

    /**
     * Score
     * <p>
     * The score the student received for the assessment.
     * (Required)
     * 
     */
    @JsonProperty("score")
    public Object getScore() {
        return score;
    }

    /**
     * Score
     * <p>
     * The score the student received for the assessment.
     * (Required)
     * 
     */
    @JsonProperty("score")
    public void setScore(Object score) {
        this.score = score;
    }

    public StudentAptitudeAssessments withScore(Object score) {
        this.score = score;
        return this;
    }

    /**
     * Percentiles
     * <p>
     * The percentile values and types associated with the score.
     * 
     */
    @JsonProperty("percentiles")
    public List<Percentile> getPercentiles() {
        return percentiles;
    }

    /**
     * Percentiles
     * <p>
     * The percentile values and types associated with the score.
     * 
     */
    @JsonProperty("percentiles")
    public void setPercentiles(List<Percentile> percentiles) {
        this.percentiles = percentiles;
    }

    public StudentAptitudeAssessments withPercentiles(List<Percentile> percentiles) {
        this.percentiles = percentiles;
        return this;
    }

    /**
     * Form
     * <p>
     * The name and number of the form used for the assessment for this result.
     * 
     */
    @JsonProperty("form")
    public Form getForm() {
        return form;
    }

    /**
     * Form
     * <p>
     * The name and number of the form used for the assessment for this result.
     * 
     */
    @JsonProperty("form")
    public void setForm(Form form) {
        this.form = form;
    }

    public StudentAptitudeAssessments withForm(Form form) {
        this.form = form;
        return this;
    }

    /**
     * Special Circumstances
     * <p>
     * Special circumstances surrounding the taking of the assessment
     * 
     */
    @JsonProperty("specialCircumstances")
    public List<SpecialCircumstance> getSpecialCircumstances() {
        return specialCircumstances;
    }

    /**
     * Special Circumstances
     * <p>
     * Special circumstances surrounding the taking of the assessment
     * 
     */
    @JsonProperty("specialCircumstances")
    public void setSpecialCircumstances(List<SpecialCircumstance> specialCircumstances) {
        this.specialCircumstances = specialCircumstances;
    }

    public StudentAptitudeAssessments withSpecialCircumstances(List<SpecialCircumstance> specialCircumstances) {
        this.specialCircumstances = specialCircumstances;
        return this;
    }

    /**
     * Update
     * <p>
     * The update status of the student's assessment result.
     * 
     */
    @JsonProperty("update")
    public Object getUpdate() {
        return update;
    }

    /**
     * Update
     * <p>
     * The update status of the student's assessment result.
     * 
     */
    @JsonProperty("update")
    public void setUpdate(Object update) {
        this.update = update;
    }

    public StudentAptitudeAssessments withUpdate(Object update) {
        this.update = update;
        return this;
    }

    /**
     * Preference
     * <p>
     * An indicator that this result of the assessment are the preferred values for the assessment
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preference
     * <p>
     * An indicator that this result of the assessment are the preferred values for the assessment
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public StudentAptitudeAssessments withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Source
     * <p>
     * The sources of the assessment results for the student.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The sources of the assessment results for the student.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public StudentAptitudeAssessments withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of this assessment results for the student.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of this assessment results for the student.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public StudentAptitudeAssessments withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Reported
     * <p>
     * An indicator of the nature of the assessment results.
     * 
     */
    @JsonProperty("reported")
    public Object getReported() {
        return reported;
    }

    /**
     * Reported
     * <p>
     * An indicator of the nature of the assessment results.
     * 
     */
    @JsonProperty("reported")
    public void setReported(Object reported) {
        this.reported = reported;
    }

    public StudentAptitudeAssessments withReported(Object reported) {
        this.reported = reported;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAptitudeAssessments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("student");
        sb.append('=');
        sb.append(((this.student == null)?"<null>":this.student));
        sb.append(',');
        sb.append("assessment");
        sb.append('=');
        sb.append(((this.assessment == null)?"<null>":this.assessment));
        sb.append(',');
        sb.append("assessedOn");
        sb.append('=');
        sb.append(((this.assessedOn == null)?"<null>":this.assessedOn));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("percentiles");
        sb.append('=');
        sb.append(((this.percentiles == null)?"<null>":this.percentiles));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("specialCircumstances");
        sb.append('=');
        sb.append(((this.specialCircumstances == null)?"<null>":this.specialCircumstances));
        sb.append(',');
        sb.append("update");
        sb.append('=');
        sb.append(((this.update == null)?"<null>":this.update));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("reported");
        sb.append('=');
        sb.append(((this.reported == null)?"<null>":this.reported));
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
        result = ((result* 31)+((this.specialCircumstances == null)? 0 :this.specialCircumstances.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.percentiles == null)? 0 :this.percentiles.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.update == null)? 0 :this.update.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.assessedOn == null)? 0 :this.assessedOn.hashCode()));
        result = ((result* 31)+((this.assessment == null)? 0 :this.assessment.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.reported == null)? 0 :this.reported.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAptitudeAssessments) == false) {
            return false;
        }
        StudentAptitudeAssessments rhs = ((StudentAptitudeAssessments) other);
        return (((((((((((((((this.specialCircumstances == rhs.specialCircumstances)||((this.specialCircumstances!= null)&&this.specialCircumstances.equals(rhs.specialCircumstances)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.percentiles == rhs.percentiles)||((this.percentiles!= null)&&this.percentiles.equals(rhs.percentiles))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.update == rhs.update)||((this.update!= null)&&this.update.equals(rhs.update))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.assessedOn == rhs.assessedOn)||((this.assessedOn!= null)&&this.assessedOn.equals(rhs.assessedOn))))&&((this.assessment == rhs.assessment)||((this.assessment!= null)&&this.assessment.equals(rhs.assessment))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.reported == rhs.reported)||((this.reported!= null)&&this.reported.equals(rhs.reported))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
