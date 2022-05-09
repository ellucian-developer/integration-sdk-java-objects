
package com.ellucian.generated.eedm.sections_maximum.v6_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Sections Maximum
 * <p>
 * An instance of a course.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "description",
    "startOn",
    "endOn",
    "code",
    "number",
    "instructionalPlatform",
    "academicPeriod",
    "administrativePeriod",
    "course",
    "credits",
    "site",
    "academicLevels",
    "awardGradeSchemes",
    "transcriptGradeSchemes",
    "courseLevels",
    "status",
    "duration",
    "maxEnrollment",
    "instructionalEvents",
    "owningInstitutionUnits",
    "gradeTypes"
})
@Generated("jsonschema2pojo")
public class SectionsMaximum {

    /**
     * ID
     * <p>
     * A globally unique identifier of a section maximum to be used in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A globally unique identifier of a section maximum to be used in all external references.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of a section.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a section.")
    private String title;
    /**
     * Description
     * <p>
     * A description of a section.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of a section.")
    private String description;
    /**
     * Offering Start Date
     * <p>
     * The starting date at which a section may be scheduled to be taken.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The starting date at which a section may be scheduled to be taken.")
    private Date startOn;
    /**
     * Offering End Date
     * <p>
     * The ending date at which a section may no longer be scheduled to be taken.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The ending date at which a section may no longer be scheduled to be taken.")
    private Object endOn;
    /**
     * Section Code
     * <p>
     * The human-readable identifier of a section. It is generally unique within an academic period.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The human-readable identifier of a section. It is generally unique within an academic period.")
    private String code;
    /**
     * Section Number
     * <p>
     * A numbering scheme or other mark that distinguishes between multiple sections. It is generally unique within an academic period and course.
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("A numbering scheme or other mark that distinguishes between multiple sections. It is generally unique within an academic period and course.")
    private String number;
    /**
     * Instructional Platform
     * <p>
     * The technology platform used to manage the administration of a section
     * 
     */
    @JsonProperty("instructionalPlatform")
    @JsonPropertyDescription("The technology platform used to manage the administration of a section")
    private Object instructionalPlatform;
    /**
     * Academic Period
     * <p>
     * The academic time period associated with this section.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic time period associated with this section.")
    private Object academicPeriod;
    /**
     * Administrative Time Period
     * <p>
     * The administrative time period associated with this section.
     * 
     */
    @JsonProperty("administrativePeriod")
    @JsonPropertyDescription("The administrative time period associated with this section.")
    private Object administrativePeriod;
    /**
     * Course
     * <p>
     * The course associated with this section.
     * (Required)
     * 
     */
    @JsonProperty("course")
    @JsonPropertyDescription("The course associated with this section.")
    private Course course;
    /**
     * Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("credits")
    @JsonPropertyDescription("")
    private List<Credit> credits = new ArrayList<Credit>();
    /**
     * Site
     * <p>
     * A physical location within the organization where this section events will be held.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("A physical location within the organization where this section events will be held.")
    private Object site;
    /**
     * Academic Levels
     * <p>
     * 
     * 
     */
    @JsonProperty("academicLevels")
    @JsonPropertyDescription("")
    private List<AcademicLevel> academicLevels = new ArrayList<AcademicLevel>();
    /**
     * Award Grade Schemes
     * <p>
     * The grading schemes that may be awarded by an instructor to a student taking this section of the course. Must be a subset of the award grade schemes of the course.
     * 
     */
    @JsonProperty("awardGradeSchemes")
    @JsonPropertyDescription("The grading schemes that may be awarded by an instructor to a student taking this section of the course. Must be a subset of the award grade schemes of the course.")
    private List<AwardGradeScheme> awardGradeSchemes = new ArrayList<AwardGradeScheme>();
    /**
     * Transcript Grade Schemes
     * <p>
     * The grading schemes that may be used to record a student's grade on a transcript of this section of the course. Must be a subset of the transcript grade schemes of the course.
     * 
     */
    @JsonProperty("transcriptGradeSchemes")
    @JsonPropertyDescription("The grading schemes that may be used to record a student's grade on a transcript of this section of the course. Must be a subset of the transcript grade schemes of the course.")
    private List<TranscriptGradeScheme> transcriptGradeSchemes = new ArrayList<TranscriptGradeScheme>();
    /**
     * Course Levels
     * <p>
     * 
     * 
     */
    @JsonProperty("courseLevels")
    @JsonPropertyDescription("")
    private List<CourseLevel> courseLevels = new ArrayList<CourseLevel>();
    /**
     * Status
     * <p>
     * The status of a section, for example, "Open" or "Closed".
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of a section, for example, \"Open\" or \"Closed\".")
    private Object status;
    /**
     * Duration
     * <p>
     * The scheme for calculating the duration of a section
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("The scheme for calculating the duration of a section")
    private Object duration;
    /**
     * Maximum Enrollment
     * <p>
     * The maximum number of persons who are allowed to enroll for a section.
     * 
     */
    @JsonProperty("maxEnrollment")
    @JsonPropertyDescription("The maximum number of persons who are allowed to enroll for a section.")
    private Object maxEnrollment;
    /**
     * Instructional Events
     * <p>
     * 
     * 
     */
    @JsonProperty("instructionalEvents")
    @JsonPropertyDescription("")
    private List<InstructionalEvent> instructionalEvents = new ArrayList<InstructionalEvent>();
    /**
     * Owning Institution Units
     * <p>
     * Units (departments) of the educational institution that own, or are responsible for, the course
     * 
     */
    @JsonProperty("owningInstitutionUnits")
    @JsonPropertyDescription("Units (departments) of the educational institution that own, or are responsible for, the course")
    private List<OwningInstitutionUnit> owningInstitutionUnits = new ArrayList<OwningInstitutionUnit>();
    /**
     * Grade Types
     * <p>
     * The grade types that can be used in grading a section
     * 
     */
    @JsonProperty("gradeTypes")
    @JsonPropertyDescription("The grade types that can be used in grading a section")
    private List<GradeType> gradeTypes = new ArrayList<GradeType>();

    /**
     * ID
     * <p>
     * A globally unique identifier of a section maximum to be used in all external references.
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
     * A globally unique identifier of a section maximum to be used in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SectionsMaximum withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a section.
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
     * The full name of a section.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public SectionsMaximum withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A description of a section.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of a section.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public SectionsMaximum withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Offering Start Date
     * <p>
     * The starting date at which a section may be scheduled to be taken.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Offering Start Date
     * <p>
     * The starting date at which a section may be scheduled to be taken.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public SectionsMaximum withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * Offering End Date
     * <p>
     * The ending date at which a section may no longer be scheduled to be taken.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * Offering End Date
     * <p>
     * The ending date at which a section may no longer be scheduled to be taken.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public SectionsMaximum withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Section Code
     * <p>
     * The human-readable identifier of a section. It is generally unique within an academic period.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Section Code
     * <p>
     * The human-readable identifier of a section. It is generally unique within an academic period.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SectionsMaximum withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Section Number
     * <p>
     * A numbering scheme or other mark that distinguishes between multiple sections. It is generally unique within an academic period and course.
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Section Number
     * <p>
     * A numbering scheme or other mark that distinguishes between multiple sections. It is generally unique within an academic period and course.
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public SectionsMaximum withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Instructional Platform
     * <p>
     * The technology platform used to manage the administration of a section
     * 
     */
    @JsonProperty("instructionalPlatform")
    public Object getInstructionalPlatform() {
        return instructionalPlatform;
    }

    /**
     * Instructional Platform
     * <p>
     * The technology platform used to manage the administration of a section
     * 
     */
    @JsonProperty("instructionalPlatform")
    public void setInstructionalPlatform(Object instructionalPlatform) {
        this.instructionalPlatform = instructionalPlatform;
    }

    public SectionsMaximum withInstructionalPlatform(Object instructionalPlatform) {
        this.instructionalPlatform = instructionalPlatform;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic time period associated with this section.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic time period associated with this section.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public SectionsMaximum withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Administrative Time Period
     * <p>
     * The administrative time period associated with this section.
     * 
     */
    @JsonProperty("administrativePeriod")
    public Object getAdministrativePeriod() {
        return administrativePeriod;
    }

    /**
     * Administrative Time Period
     * <p>
     * The administrative time period associated with this section.
     * 
     */
    @JsonProperty("administrativePeriod")
    public void setAdministrativePeriod(Object administrativePeriod) {
        this.administrativePeriod = administrativePeriod;
    }

    public SectionsMaximum withAdministrativePeriod(Object administrativePeriod) {
        this.administrativePeriod = administrativePeriod;
        return this;
    }

    /**
     * Course
     * <p>
     * The course associated with this section.
     * (Required)
     * 
     */
    @JsonProperty("course")
    public Course getCourse() {
        return course;
    }

    /**
     * Course
     * <p>
     * The course associated with this section.
     * (Required)
     * 
     */
    @JsonProperty("course")
    public void setCourse(Course course) {
        this.course = course;
    }

    public SectionsMaximum withCourse(Course course) {
        this.course = course;
        return this;
    }

    /**
     * Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("credits")
    public List<Credit> getCredits() {
        return credits;
    }

    /**
     * Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("credits")
    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public SectionsMaximum withCredits(List<Credit> credits) {
        this.credits = credits;
        return this;
    }

    /**
     * Site
     * <p>
     * A physical location within the organization where this section events will be held.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * A physical location within the organization where this section events will be held.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public SectionsMaximum withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Academic Levels
     * <p>
     * 
     * 
     */
    @JsonProperty("academicLevels")
    public List<AcademicLevel> getAcademicLevels() {
        return academicLevels;
    }

    /**
     * Academic Levels
     * <p>
     * 
     * 
     */
    @JsonProperty("academicLevels")
    public void setAcademicLevels(List<AcademicLevel> academicLevels) {
        this.academicLevels = academicLevels;
    }

    public SectionsMaximum withAcademicLevels(List<AcademicLevel> academicLevels) {
        this.academicLevels = academicLevels;
        return this;
    }

    /**
     * Award Grade Schemes
     * <p>
     * The grading schemes that may be awarded by an instructor to a student taking this section of the course. Must be a subset of the award grade schemes of the course.
     * 
     */
    @JsonProperty("awardGradeSchemes")
    public List<AwardGradeScheme> getAwardGradeSchemes() {
        return awardGradeSchemes;
    }

    /**
     * Award Grade Schemes
     * <p>
     * The grading schemes that may be awarded by an instructor to a student taking this section of the course. Must be a subset of the award grade schemes of the course.
     * 
     */
    @JsonProperty("awardGradeSchemes")
    public void setAwardGradeSchemes(List<AwardGradeScheme> awardGradeSchemes) {
        this.awardGradeSchemes = awardGradeSchemes;
    }

    public SectionsMaximum withAwardGradeSchemes(List<AwardGradeScheme> awardGradeSchemes) {
        this.awardGradeSchemes = awardGradeSchemes;
        return this;
    }

    /**
     * Transcript Grade Schemes
     * <p>
     * The grading schemes that may be used to record a student's grade on a transcript of this section of the course. Must be a subset of the transcript grade schemes of the course.
     * 
     */
    @JsonProperty("transcriptGradeSchemes")
    public List<TranscriptGradeScheme> getTranscriptGradeSchemes() {
        return transcriptGradeSchemes;
    }

    /**
     * Transcript Grade Schemes
     * <p>
     * The grading schemes that may be used to record a student's grade on a transcript of this section of the course. Must be a subset of the transcript grade schemes of the course.
     * 
     */
    @JsonProperty("transcriptGradeSchemes")
    public void setTranscriptGradeSchemes(List<TranscriptGradeScheme> transcriptGradeSchemes) {
        this.transcriptGradeSchemes = transcriptGradeSchemes;
    }

    public SectionsMaximum withTranscriptGradeSchemes(List<TranscriptGradeScheme> transcriptGradeSchemes) {
        this.transcriptGradeSchemes = transcriptGradeSchemes;
        return this;
    }

    /**
     * Course Levels
     * <p>
     * 
     * 
     */
    @JsonProperty("courseLevels")
    public List<CourseLevel> getCourseLevels() {
        return courseLevels;
    }

    /**
     * Course Levels
     * <p>
     * 
     * 
     */
    @JsonProperty("courseLevels")
    public void setCourseLevels(List<CourseLevel> courseLevels) {
        this.courseLevels = courseLevels;
    }

    public SectionsMaximum withCourseLevels(List<CourseLevel> courseLevels) {
        this.courseLevels = courseLevels;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of a section, for example, "Open" or "Closed".
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of a section, for example, "Open" or "Closed".
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public SectionsMaximum withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Duration
     * <p>
     * The scheme for calculating the duration of a section
     * 
     */
    @JsonProperty("duration")
    public Object getDuration() {
        return duration;
    }

    /**
     * Duration
     * <p>
     * The scheme for calculating the duration of a section
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Object duration) {
        this.duration = duration;
    }

    public SectionsMaximum withDuration(Object duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Maximum Enrollment
     * <p>
     * The maximum number of persons who are allowed to enroll for a section.
     * 
     */
    @JsonProperty("maxEnrollment")
    public Object getMaxEnrollment() {
        return maxEnrollment;
    }

    /**
     * Maximum Enrollment
     * <p>
     * The maximum number of persons who are allowed to enroll for a section.
     * 
     */
    @JsonProperty("maxEnrollment")
    public void setMaxEnrollment(Object maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public SectionsMaximum withMaxEnrollment(Object maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
        return this;
    }

    /**
     * Instructional Events
     * <p>
     * 
     * 
     */
    @JsonProperty("instructionalEvents")
    public List<InstructionalEvent> getInstructionalEvents() {
        return instructionalEvents;
    }

    /**
     * Instructional Events
     * <p>
     * 
     * 
     */
    @JsonProperty("instructionalEvents")
    public void setInstructionalEvents(List<InstructionalEvent> instructionalEvents) {
        this.instructionalEvents = instructionalEvents;
    }

    public SectionsMaximum withInstructionalEvents(List<InstructionalEvent> instructionalEvents) {
        this.instructionalEvents = instructionalEvents;
        return this;
    }

    /**
     * Owning Institution Units
     * <p>
     * Units (departments) of the educational institution that own, or are responsible for, the course
     * 
     */
    @JsonProperty("owningInstitutionUnits")
    public List<OwningInstitutionUnit> getOwningInstitutionUnits() {
        return owningInstitutionUnits;
    }

    /**
     * Owning Institution Units
     * <p>
     * Units (departments) of the educational institution that own, or are responsible for, the course
     * 
     */
    @JsonProperty("owningInstitutionUnits")
    public void setOwningInstitutionUnits(List<OwningInstitutionUnit> owningInstitutionUnits) {
        this.owningInstitutionUnits = owningInstitutionUnits;
    }

    public SectionsMaximum withOwningInstitutionUnits(List<OwningInstitutionUnit> owningInstitutionUnits) {
        this.owningInstitutionUnits = owningInstitutionUnits;
        return this;
    }

    /**
     * Grade Types
     * <p>
     * The grade types that can be used in grading a section
     * 
     */
    @JsonProperty("gradeTypes")
    public List<GradeType> getGradeTypes() {
        return gradeTypes;
    }

    /**
     * Grade Types
     * <p>
     * The grade types that can be used in grading a section
     * 
     */
    @JsonProperty("gradeTypes")
    public void setGradeTypes(List<GradeType> gradeTypes) {
        this.gradeTypes = gradeTypes;
    }

    public SectionsMaximum withGradeTypes(List<GradeType> gradeTypes) {
        this.gradeTypes = gradeTypes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionsMaximum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("instructionalPlatform");
        sb.append('=');
        sb.append(((this.instructionalPlatform == null)?"<null>":this.instructionalPlatform));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("administrativePeriod");
        sb.append('=');
        sb.append(((this.administrativePeriod == null)?"<null>":this.administrativePeriod));
        sb.append(',');
        sb.append("course");
        sb.append('=');
        sb.append(((this.course == null)?"<null>":this.course));
        sb.append(',');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("academicLevels");
        sb.append('=');
        sb.append(((this.academicLevels == null)?"<null>":this.academicLevels));
        sb.append(',');
        sb.append("awardGradeSchemes");
        sb.append('=');
        sb.append(((this.awardGradeSchemes == null)?"<null>":this.awardGradeSchemes));
        sb.append(',');
        sb.append("transcriptGradeSchemes");
        sb.append('=');
        sb.append(((this.transcriptGradeSchemes == null)?"<null>":this.transcriptGradeSchemes));
        sb.append(',');
        sb.append("courseLevels");
        sb.append('=');
        sb.append(((this.courseLevels == null)?"<null>":this.courseLevels));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("maxEnrollment");
        sb.append('=');
        sb.append(((this.maxEnrollment == null)?"<null>":this.maxEnrollment));
        sb.append(',');
        sb.append("instructionalEvents");
        sb.append('=');
        sb.append(((this.instructionalEvents == null)?"<null>":this.instructionalEvents));
        sb.append(',');
        sb.append("owningInstitutionUnits");
        sb.append('=');
        sb.append(((this.owningInstitutionUnits == null)?"<null>":this.owningInstitutionUnits));
        sb.append(',');
        sb.append("gradeTypes");
        sb.append('=');
        sb.append(((this.gradeTypes == null)?"<null>":this.gradeTypes));
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
        result = ((result* 31)+((this.maxEnrollment == null)? 0 :this.maxEnrollment.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.academicLevels == null)? 0 :this.academicLevels.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.instructionalPlatform == null)? 0 :this.instructionalPlatform.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.instructionalEvents == null)? 0 :this.instructionalEvents.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.courseLevels == null)? 0 :this.courseLevels.hashCode()));
        result = ((result* 31)+((this.owningInstitutionUnits == null)? 0 :this.owningInstitutionUnits.hashCode()));
        result = ((result* 31)+((this.administrativePeriod == null)? 0 :this.administrativePeriod.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.awardGradeSchemes == null)? 0 :this.awardGradeSchemes.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.course == null)? 0 :this.course.hashCode()));
        result = ((result* 31)+((this.gradeTypes == null)? 0 :this.gradeTypes.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.transcriptGradeSchemes == null)? 0 :this.transcriptGradeSchemes.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionsMaximum) == false) {
            return false;
        }
        SectionsMaximum rhs = ((SectionsMaximum) other);
        return ((((((((((((((((((((((((this.maxEnrollment == rhs.maxEnrollment)||((this.maxEnrollment!= null)&&this.maxEnrollment.equals(rhs.maxEnrollment)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.academicLevels == rhs.academicLevels)||((this.academicLevels!= null)&&this.academicLevels.equals(rhs.academicLevels))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.instructionalPlatform == rhs.instructionalPlatform)||((this.instructionalPlatform!= null)&&this.instructionalPlatform.equals(rhs.instructionalPlatform))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.instructionalEvents == rhs.instructionalEvents)||((this.instructionalEvents!= null)&&this.instructionalEvents.equals(rhs.instructionalEvents))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.courseLevels == rhs.courseLevels)||((this.courseLevels!= null)&&this.courseLevels.equals(rhs.courseLevels))))&&((this.owningInstitutionUnits == rhs.owningInstitutionUnits)||((this.owningInstitutionUnits!= null)&&this.owningInstitutionUnits.equals(rhs.owningInstitutionUnits))))&&((this.administrativePeriod == rhs.administrativePeriod)||((this.administrativePeriod!= null)&&this.administrativePeriod.equals(rhs.administrativePeriod))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.awardGradeSchemes == rhs.awardGradeSchemes)||((this.awardGradeSchemes!= null)&&this.awardGradeSchemes.equals(rhs.awardGradeSchemes))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.course == rhs.course)||((this.course!= null)&&this.course.equals(rhs.course))))&&((this.gradeTypes == rhs.gradeTypes)||((this.gradeTypes!= null)&&this.gradeTypes.equals(rhs.gradeTypes))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.transcriptGradeSchemes == rhs.transcriptGradeSchemes)||((this.transcriptGradeSchemes!= null)&&this.transcriptGradeSchemes.equals(rhs.transcriptGradeSchemes))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
