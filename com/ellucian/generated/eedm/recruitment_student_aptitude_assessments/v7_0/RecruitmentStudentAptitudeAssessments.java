
package com.ellucian.generated.eedm.recruitment_student_aptitude_assessments.v7_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Recruitment Student Aptitude Assessments
 * <p>
 * The results of an aptitude assessment of a student for recruiting systems.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "prospectiveStudent",
    "assessment",
    "studentAptitudeAssessment",
    "assessedOn",
    "score",
    "percentile",
    "update",
    "preference",
    "source",
    "status",
    "reported"
})
@Generated("jsonschema2pojo")
public class RecruitmentStudentAptitudeAssessments {

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
     * The global identifier of the recruitment student aptitude assessment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the recruitment student aptitude assessment.")
    private String id;
    /**
     * Prospective Student
     * <p>
     * The prospective student taking the aptitude assessment.
     * (Required)
     * 
     */
    @JsonProperty("prospectiveStudent")
    @JsonPropertyDescription("The prospective student taking the aptitude assessment.")
    private ProspectiveStudent prospectiveStudent;
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
     * Student Aptitude Assessment
     * <p>
     * Optional link to foundation domain student aptitude assessment.
     * 
     */
    @JsonProperty("studentAptitudeAssessment")
    @JsonPropertyDescription("Optional link to foundation domain student aptitude assessment.")
    private Object studentAptitudeAssessment;
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
     * Percentile
     * <p>
     * The percentile value and type associated with the score.
     * 
     */
    @JsonProperty("percentile")
    @JsonPropertyDescription("The percentile value and type associated with the score.")
    private Object percentile;
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

    public RecruitmentStudentAptitudeAssessments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the recruitment student aptitude assessment.
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
     * The global identifier of the recruitment student aptitude assessment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RecruitmentStudentAptitudeAssessments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Prospective Student
     * <p>
     * The prospective student taking the aptitude assessment.
     * (Required)
     * 
     */
    @JsonProperty("prospectiveStudent")
    public ProspectiveStudent getProspectiveStudent() {
        return prospectiveStudent;
    }

    /**
     * Prospective Student
     * <p>
     * The prospective student taking the aptitude assessment.
     * (Required)
     * 
     */
    @JsonProperty("prospectiveStudent")
    public void setProspectiveStudent(ProspectiveStudent prospectiveStudent) {
        this.prospectiveStudent = prospectiveStudent;
    }

    public RecruitmentStudentAptitudeAssessments withProspectiveStudent(ProspectiveStudent prospectiveStudent) {
        this.prospectiveStudent = prospectiveStudent;
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

    public RecruitmentStudentAptitudeAssessments withAssessment(Assessment assessment) {
        this.assessment = assessment;
        return this;
    }

    /**
     * Student Aptitude Assessment
     * <p>
     * Optional link to foundation domain student aptitude assessment.
     * 
     */
    @JsonProperty("studentAptitudeAssessment")
    public Object getStudentAptitudeAssessment() {
        return studentAptitudeAssessment;
    }

    /**
     * Student Aptitude Assessment
     * <p>
     * Optional link to foundation domain student aptitude assessment.
     * 
     */
    @JsonProperty("studentAptitudeAssessment")
    public void setStudentAptitudeAssessment(Object studentAptitudeAssessment) {
        this.studentAptitudeAssessment = studentAptitudeAssessment;
    }

    public RecruitmentStudentAptitudeAssessments withStudentAptitudeAssessment(Object studentAptitudeAssessment) {
        this.studentAptitudeAssessment = studentAptitudeAssessment;
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

    public RecruitmentStudentAptitudeAssessments withAssessedOn(Date assessedOn) {
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

    public RecruitmentStudentAptitudeAssessments withScore(Object score) {
        this.score = score;
        return this;
    }

    /**
     * Percentile
     * <p>
     * The percentile value and type associated with the score.
     * 
     */
    @JsonProperty("percentile")
    public Object getPercentile() {
        return percentile;
    }

    /**
     * Percentile
     * <p>
     * The percentile value and type associated with the score.
     * 
     */
    @JsonProperty("percentile")
    public void setPercentile(Object percentile) {
        this.percentile = percentile;
    }

    public RecruitmentStudentAptitudeAssessments withPercentile(Object percentile) {
        this.percentile = percentile;
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

    public RecruitmentStudentAptitudeAssessments withUpdate(Object update) {
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

    public RecruitmentStudentAptitudeAssessments withPreference(Object preference) {
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

    public RecruitmentStudentAptitudeAssessments withSource(Object source) {
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

    public RecruitmentStudentAptitudeAssessments withStatus(Object status) {
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

    public RecruitmentStudentAptitudeAssessments withReported(Object reported) {
        this.reported = reported;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecruitmentStudentAptitudeAssessments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("prospectiveStudent");
        sb.append('=');
        sb.append(((this.prospectiveStudent == null)?"<null>":this.prospectiveStudent));
        sb.append(',');
        sb.append("assessment");
        sb.append('=');
        sb.append(((this.assessment == null)?"<null>":this.assessment));
        sb.append(',');
        sb.append("studentAptitudeAssessment");
        sb.append('=');
        sb.append(((this.studentAptitudeAssessment == null)?"<null>":this.studentAptitudeAssessment));
        sb.append(',');
        sb.append("assessedOn");
        sb.append('=');
        sb.append(((this.assessedOn == null)?"<null>":this.assessedOn));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.prospectiveStudent == null)? 0 :this.prospectiveStudent.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.update == null)? 0 :this.update.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.assessedOn == null)? 0 :this.assessedOn.hashCode()));
        result = ((result* 31)+((this.assessment == null)? 0 :this.assessment.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.reported == null)? 0 :this.reported.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.studentAptitudeAssessment == null)? 0 :this.studentAptitudeAssessment.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecruitmentStudentAptitudeAssessments) == false) {
            return false;
        }
        RecruitmentStudentAptitudeAssessments rhs = ((RecruitmentStudentAptitudeAssessments) other);
        return ((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.prospectiveStudent == rhs.prospectiveStudent)||((this.prospectiveStudent!= null)&&this.prospectiveStudent.equals(rhs.prospectiveStudent))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.update == rhs.update)||((this.update!= null)&&this.update.equals(rhs.update))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.assessedOn == rhs.assessedOn)||((this.assessedOn!= null)&&this.assessedOn.equals(rhs.assessedOn))))&&((this.assessment == rhs.assessment)||((this.assessment!= null)&&this.assessment.equals(rhs.assessment))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.reported == rhs.reported)||((this.reported!= null)&&this.reported.equals(rhs.reported))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.studentAptitudeAssessment == rhs.studentAptitudeAssessment)||((this.studentAptitudeAssessment!= null)&&this.studentAptitudeAssessment.equals(rhs.studentAptitudeAssessment))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
