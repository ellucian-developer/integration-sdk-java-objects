
package com.ellucian.generated.eedm.section_registrations.v7_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Section Registrations
 * <p>
 * A record of a student's interaction with a specific section such as registration, grades, and involvement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "registrant",
    "section",
    "academicLevel",
    "status",
    "approvals",
    "repeatedSection",
    "awardGradeScheme",
    "credit",
    "qualityPoints",
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
     * Academic Level
     * <p>
     * The academic level at which the student is registering for the course (The level specified should match one of the levels allowed for the section).
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level at which the student is registering for the course (The level specified should match one of the levels allowed for the section).")
    private AcademicLevel academicLevel;
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
     * Repeated Section
     * <p>
     * Specifies if the section has been repeated and if the credit and/or quality points should be included in calculations.
     * 
     */
    @JsonProperty("repeatedSection")
    @JsonPropertyDescription("Specifies if the section has been repeated and if the credit and/or quality points should be included in calculations.")
    private SectionRegistrations.RepeatedSection repeatedSection;
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
     * Credit
     * <p>
     * Unit specification that can be awarded for completing a section
     * 
     */
    @JsonProperty("credit")
    @JsonPropertyDescription("Unit specification that can be awarded for completing a section")
    private Object credit;
    /**
     * Quality Points
     * <p>
     * A value, based on the grade awarded, that represents the student's performance in the section that may be used to determine a student's overall performance.
     * 
     */
    @JsonProperty("qualityPoints")
    @JsonPropertyDescription("A value, based on the grade awarded, that represents the student's performance in the section that may be used to determine a student's overall performance.")
    private Object qualityPoints;
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
     * Academic Level
     * <p>
     * The academic level at which the student is registering for the course (The level specified should match one of the levels allowed for the section).
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    public AcademicLevel getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level at which the student is registering for the course (The level specified should match one of the levels allowed for the section).
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
    }

    public SectionRegistrations withAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
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
     * Repeated Section
     * <p>
     * Specifies if the section has been repeated and if the credit and/or quality points should be included in calculations.
     * 
     */
    @JsonProperty("repeatedSection")
    public SectionRegistrations.RepeatedSection getRepeatedSection() {
        return repeatedSection;
    }

    /**
     * Repeated Section
     * <p>
     * Specifies if the section has been repeated and if the credit and/or quality points should be included in calculations.
     * 
     */
    @JsonProperty("repeatedSection")
    public void setRepeatedSection(SectionRegistrations.RepeatedSection repeatedSection) {
        this.repeatedSection = repeatedSection;
    }

    public SectionRegistrations withRepeatedSection(SectionRegistrations.RepeatedSection repeatedSection) {
        this.repeatedSection = repeatedSection;
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
     * Credit
     * <p>
     * Unit specification that can be awarded for completing a section
     * 
     */
    @JsonProperty("credit")
    public Object getCredit() {
        return credit;
    }

    /**
     * Credit
     * <p>
     * Unit specification that can be awarded for completing a section
     * 
     */
    @JsonProperty("credit")
    public void setCredit(Object credit) {
        this.credit = credit;
    }

    public SectionRegistrations withCredit(Object credit) {
        this.credit = credit;
        return this;
    }

    /**
     * Quality Points
     * <p>
     * A value, based on the grade awarded, that represents the student's performance in the section that may be used to determine a student's overall performance.
     * 
     */
    @JsonProperty("qualityPoints")
    public Object getQualityPoints() {
        return qualityPoints;
    }

    /**
     * Quality Points
     * <p>
     * A value, based on the grade awarded, that represents the student's performance in the section that may be used to determine a student's overall performance.
     * 
     */
    @JsonProperty("qualityPoints")
    public void setQualityPoints(Object qualityPoints) {
        this.qualityPoints = qualityPoints;
    }

    public SectionRegistrations withQualityPoints(Object qualityPoints) {
        this.qualityPoints = qualityPoints;
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
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("approvals");
        sb.append('=');
        sb.append(((this.approvals == null)?"<null>":this.approvals));
        sb.append(',');
        sb.append("repeatedSection");
        sb.append('=');
        sb.append(((this.repeatedSection == null)?"<null>":this.repeatedSection));
        sb.append(',');
        sb.append("awardGradeScheme");
        sb.append('=');
        sb.append(((this.awardGradeScheme == null)?"<null>":this.awardGradeScheme));
        sb.append(',');
        sb.append("credit");
        sb.append('=');
        sb.append(((this.credit == null)?"<null>":this.credit));
        sb.append(',');
        sb.append("qualityPoints");
        sb.append('=');
        sb.append(((this.qualityPoints == null)?"<null>":this.qualityPoints));
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
        result = ((result* 31)+((this.repeatedSection == null)? 0 :this.repeatedSection.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.process == null)? 0 :this.process.hashCode()));
        result = ((result* 31)+((this.qualityPoints == null)? 0 :this.qualityPoints.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.grades == null)? 0 :this.grades.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.transcript == null)? 0 :this.transcript.hashCode()));
        result = ((result* 31)+((this.involvement == null)? 0 :this.involvement.hashCode()));
        result = ((result* 31)+((this.awardGradeScheme == null)? 0 :this.awardGradeScheme.hashCode()));
        result = ((result* 31)+((this.approvals == null)? 0 :this.approvals.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.registrant == null)? 0 :this.registrant.hashCode()));
        result = ((result* 31)+((this.credit == null)? 0 :this.credit.hashCode()));
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
        return (((((((((((((((((this.repeatedSection == rhs.repeatedSection)||((this.repeatedSection!= null)&&this.repeatedSection.equals(rhs.repeatedSection)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.process == rhs.process)||((this.process!= null)&&this.process.equals(rhs.process))))&&((this.qualityPoints == rhs.qualityPoints)||((this.qualityPoints!= null)&&this.qualityPoints.equals(rhs.qualityPoints))))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.grades == rhs.grades)||((this.grades!= null)&&this.grades.equals(rhs.grades))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.transcript == rhs.transcript)||((this.transcript!= null)&&this.transcript.equals(rhs.transcript))))&&((this.involvement == rhs.involvement)||((this.involvement!= null)&&this.involvement.equals(rhs.involvement))))&&((this.awardGradeScheme == rhs.awardGradeScheme)||((this.awardGradeScheme!= null)&&this.awardGradeScheme.equals(rhs.awardGradeScheme))))&&((this.approvals == rhs.approvals)||((this.approvals!= null)&&this.approvals.equals(rhs.approvals))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.registrant == rhs.registrant)||((this.registrant!= null)&&this.registrant.equals(rhs.registrant))))&&((this.credit == rhs.credit)||((this.credit!= null)&&this.credit.equals(rhs.credit))))&&((this.reporting == rhs.reporting)||((this.reporting!= null)&&this.reporting.equals(rhs.reporting))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Repeated Section
     * <p>
     * Specifies if the section has been repeated and if the credit and/or quality points should be included in calculations.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RepeatedSection {

        NOT_REPEATED("notRepeated"),
        REPEATED_INCLUDE_CREDIT("repeatedIncludeCredit"),
        REPEATED_INCLUDE_QUALITY_POINTS("repeatedIncludeQualityPoints"),
        REPEATED_INCLUDE_BOTH("repeatedIncludeBoth"),
        REPEATED_INCLUDE_NEITHER("repeatedIncludeNeither");
        private final String value;
        private final static Map<String, SectionRegistrations.RepeatedSection> CONSTANTS = new HashMap<String, SectionRegistrations.RepeatedSection>();

        static {
            for (SectionRegistrations.RepeatedSection c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RepeatedSection(String value) {
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
        public static SectionRegistrations.RepeatedSection fromValue(String value) {
            SectionRegistrations.RepeatedSection constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
