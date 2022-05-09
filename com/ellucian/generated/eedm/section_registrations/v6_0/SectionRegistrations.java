
package com.ellucian.generated.eedm.section_registrations.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Section Registration
 * <p>
 * A record of a student's interaction with a specific section such as registration, grades, involvement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "registrant",
    "section",
    "status",
    "approvals",
    "awardGradeScheme",
    "transcript",
    "grades",
    "process",
    "involvement",
    "reporting"
})
@Generated("jsonschema2pojo")
public class SectionRegistrations {

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
     * A global identifier of a course.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a course.")
    private String id;
    /**
     * Registrant
     * <p>
     * A person registered for a section.
     * (Required)
     * 
     */
    @JsonProperty("registrant")
    @JsonPropertyDescription("A person registered for a section.")
    private Registrant registrant;
    /**
     * Section
     * <p>
     * An instance of a course for which a person is registering.
     * (Required)
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("An instance of a course for which a person is registering.")
    private Section section;
    /**
     * Status
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private Object status;
    /**
     * Approval
     * <p>
     * The method of approval.
     * 
     */
    @JsonProperty("approvals")
    @JsonPropertyDescription("The method of approval.")
    private List<Approval> approvals = new ArrayList<Approval>();
    /**
     * Award Grade Scheme
     * <p>
     * The grading scheme that will be used to award the student a grade for the section.
     * (Required)
     * 
     */
    @JsonProperty("awardGradeScheme")
    @JsonPropertyDescription("The grading scheme that will be used to award the student a grade for the section.")
    private AwardGradeScheme awardGradeScheme;
    /**
     * Transcript
     * <p>
     * Details on how the student elected to have their transcript grades recorded.
     * 
     */
    @JsonProperty("transcript")
    @JsonPropertyDescription("Details on how the student elected to have their transcript grades recorded.")
    private Object transcript;
    /**
     * Grades
     * <p>
     * Grades that have been assigned to this section registration.
     * 
     */
    @JsonProperty("grades")
    @JsonPropertyDescription("Grades that have been assigned to this section registration.")
    private List<Grade> grades = new ArrayList<Grade>();
    /**
     * Process
     * <p>
     * Properties associated with the processing of section grades.
     * 
     */
    @JsonProperty("process")
    @JsonPropertyDescription("Properties associated with the processing of section grades.")
    private Process process;
    /**
     * Involvement
     * <p>
     * The range of dates between which a student was involved with a section.
     * 
     */
    @JsonProperty("involvement")
    @JsonPropertyDescription("The range of dates between which a student was involved with a section.")
    private Involvement involvement;
    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    @JsonPropertyDescription("Properties required for governmental or other reporting.")
    private Object reporting;

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

    public SectionRegistrations withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a course.
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
     * A global identifier of a course.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SectionRegistrations withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Registrant
     * <p>
     * A person registered for a section.
     * (Required)
     * 
     */
    @JsonProperty("registrant")
    public Registrant getRegistrant() {
        return registrant;
    }

    /**
     * Registrant
     * <p>
     * A person registered for a section.
     * (Required)
     * 
     */
    @JsonProperty("registrant")
    public void setRegistrant(Registrant registrant) {
        this.registrant = registrant;
    }

    public SectionRegistrations withRegistrant(Registrant registrant) {
        this.registrant = registrant;
        return this;
    }

    /**
     * Section
     * <p>
     * An instance of a course for which a person is registering.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public Section getSection() {
        return section;
    }

    /**
     * Section
     * <p>
     * An instance of a course for which a person is registering.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public void setSection(Section section) {
        this.section = section;
    }

    public SectionRegistrations withSection(Section section) {
        this.section = section;
        return this;
    }

    /**
     * Status
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public SectionRegistrations withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Approval
     * <p>
     * The method of approval.
     * 
     */
    @JsonProperty("approvals")
    public List<Approval> getApprovals() {
        return approvals;
    }

    /**
     * Approval
     * <p>
     * The method of approval.
     * 
     */
    @JsonProperty("approvals")
    public void setApprovals(List<Approval> approvals) {
        this.approvals = approvals;
    }

    public SectionRegistrations withApprovals(List<Approval> approvals) {
        this.approvals = approvals;
        return this;
    }

    /**
     * Award Grade Scheme
     * <p>
     * The grading scheme that will be used to award the student a grade for the section.
     * (Required)
     * 
     */
    @JsonProperty("awardGradeScheme")
    public AwardGradeScheme getAwardGradeScheme() {
        return awardGradeScheme;
    }

    /**
     * Award Grade Scheme
     * <p>
     * The grading scheme that will be used to award the student a grade for the section.
     * (Required)
     * 
     */
    @JsonProperty("awardGradeScheme")
    public void setAwardGradeScheme(AwardGradeScheme awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
    }

    public SectionRegistrations withAwardGradeScheme(AwardGradeScheme awardGradeScheme) {
        this.awardGradeScheme = awardGradeScheme;
        return this;
    }

    /**
     * Transcript
     * <p>
     * Details on how the student elected to have their transcript grades recorded.
     * 
     */
    @JsonProperty("transcript")
    public Object getTranscript() {
        return transcript;
    }

    /**
     * Transcript
     * <p>
     * Details on how the student elected to have their transcript grades recorded.
     * 
     */
    @JsonProperty("transcript")
    public void setTranscript(Object transcript) {
        this.transcript = transcript;
    }

    public SectionRegistrations withTranscript(Object transcript) {
        this.transcript = transcript;
        return this;
    }

    /**
     * Grades
     * <p>
     * Grades that have been assigned to this section registration.
     * 
     */
    @JsonProperty("grades")
    public List<Grade> getGrades() {
        return grades;
    }

    /**
     * Grades
     * <p>
     * Grades that have been assigned to this section registration.
     * 
     */
    @JsonProperty("grades")
    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public SectionRegistrations withGrades(List<Grade> grades) {
        this.grades = grades;
        return this;
    }

    /**
     * Process
     * <p>
     * Properties associated with the processing of section grades.
     * 
     */
    @JsonProperty("process")
    public Process getProcess() {
        return process;
    }

    /**
     * Process
     * <p>
     * Properties associated with the processing of section grades.
     * 
     */
    @JsonProperty("process")
    public void setProcess(Process process) {
        this.process = process;
    }

    public SectionRegistrations withProcess(Process process) {
        this.process = process;
        return this;
    }

    /**
     * Involvement
     * <p>
     * The range of dates between which a student was involved with a section.
     * 
     */
    @JsonProperty("involvement")
    public Involvement getInvolvement() {
        return involvement;
    }

    /**
     * Involvement
     * <p>
     * The range of dates between which a student was involved with a section.
     * 
     */
    @JsonProperty("involvement")
    public void setInvolvement(Involvement involvement) {
        this.involvement = involvement;
    }

    public SectionRegistrations withInvolvement(Involvement involvement) {
        this.involvement = involvement;
        return this;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public Object getReporting() {
        return reporting;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public void setReporting(Object reporting) {
        this.reporting = reporting;
    }

    public SectionRegistrations withReporting(Object reporting) {
        this.reporting = reporting;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRegistrations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("registrant");
        sb.append('=');
        sb.append(((this.registrant == null)?"<null>":this.registrant));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("approvals");
        sb.append('=');
        sb.append(((this.approvals == null)?"<null>":this.approvals));
        sb.append(',');
        sb.append("awardGradeScheme");
        sb.append('=');
        sb.append(((this.awardGradeScheme == null)?"<null>":this.awardGradeScheme));
        sb.append(',');
        sb.append("transcript");
        sb.append('=');
        sb.append(((this.transcript == null)?"<null>":this.transcript));
        sb.append(',');
        sb.append("grades");
        sb.append('=');
        sb.append(((this.grades == null)?"<null>":this.grades));
        sb.append(',');
        sb.append("process");
        sb.append('=');
        sb.append(((this.process == null)?"<null>":this.process));
        sb.append(',');
        sb.append("involvement");
        sb.append('=');
        sb.append(((this.involvement == null)?"<null>":this.involvement));
        sb.append(',');
        sb.append("reporting");
        sb.append('=');
        sb.append(((this.reporting == null)?"<null>":this.reporting));
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
        result = ((result* 31)+((this.process == null)? 0 :this.process.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.grades == null)? 0 :this.grades.hashCode()));
        result = ((result* 31)+((this.transcript == null)? 0 :this.transcript.hashCode()));
        result = ((result* 31)+((this.involvement == null)? 0 :this.involvement.hashCode()));
        result = ((result* 31)+((this.awardGradeScheme == null)? 0 :this.awardGradeScheme.hashCode()));
        result = ((result* 31)+((this.approvals == null)? 0 :this.approvals.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.registrant == null)? 0 :this.registrant.hashCode()));
        result = ((result* 31)+((this.reporting == null)? 0 :this.reporting.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRegistrations) == false) {
            return false;
        }
        SectionRegistrations rhs = ((SectionRegistrations) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.process == rhs.process)||((this.process!= null)&&this.process.equals(rhs.process))))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.grades == rhs.grades)||((this.grades!= null)&&this.grades.equals(rhs.grades))))&&((this.transcript == rhs.transcript)||((this.transcript!= null)&&this.transcript.equals(rhs.transcript))))&&((this.involvement == rhs.involvement)||((this.involvement!= null)&&this.involvement.equals(rhs.involvement))))&&((this.awardGradeScheme == rhs.awardGradeScheme)||((this.awardGradeScheme!= null)&&this.awardGradeScheme.equals(rhs.awardGradeScheme))))&&((this.approvals == rhs.approvals)||((this.approvals!= null)&&this.approvals.equals(rhs.approvals))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.registrant == rhs.registrant)||((this.registrant!= null)&&this.registrant.equals(rhs.registrant))))&&((this.reporting == rhs.reporting)||((this.reporting!= null)&&this.reporting.equals(rhs.reporting))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
