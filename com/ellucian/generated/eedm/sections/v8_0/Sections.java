
package com.ellucian.generated.eedm.sections.v8_0;

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
 * Sections
 * <p>
 * An instance of a course.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
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
    "censusDates",
    "course",
    "credits",
    "site",
    "academicLevels",
    "gradeSchemes",
    "courseLevels",
    "status",
    "duration",
    "maxEnrollment",
    "owningInstitutionUnits",
    "billing",
    "reportingDetail"
})
@Generated("jsonschema2pojo")
public class Sections {

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
     * A globally unique identifier of a section to be used in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A globally unique identifier of a section to be used in all external references.")
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
     * A numbering scheme or other mark that distinguishes between multiple sections.  It is generally unique within an academic period and course.
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("A numbering scheme or other mark that distinguishes between multiple sections.  It is generally unique within an academic period and course.")
    private String number;
    /**
     * Instructional Platform
     * <p>
     * A technology platform used to manage the administration of a section.
     * 
     */
    @JsonProperty("instructionalPlatform")
    @JsonPropertyDescription("A technology platform used to manage the administration of a section.")
    private Object instructionalPlatform;
    /**
     * Academic Period
     * <p>
     * The academic time period associated with a section.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic time period associated with a section.")
    private Object academicPeriod;
    /**
     * Administrative Time Period
     * <p>
     * The administrative time period associated with a section.
     * 
     */
    @JsonProperty("administrativePeriod")
    @JsonPropertyDescription("The administrative time period associated with a section.")
    private Object administrativePeriod;
    /**
     * Census Dates
     * <p>
     * The dates at which the section's enrollment/headcount is determined. These dates override the census dates for the academic period, if they are different.
     * 
     */
    @JsonProperty("censusDates")
    @JsonPropertyDescription("The dates at which the section's enrollment/headcount is determined. These dates override the census dates for the academic period, if they are different.")
    private List<String> censusDates = new ArrayList<String>();
    /**
     * Course
     * <p>
     * The smallest unit of instruction for which an Oganization grants credits.
     * (Required)
     * 
     */
    @JsonProperty("course")
    @JsonPropertyDescription("The smallest unit of instruction for which an Oganization grants credits.")
    private Course course;
    /**
     * Credit
     * <p>
     * Unit specification that can be awarded for completing a section.
     * 
     */
    @JsonProperty("credits")
    @JsonPropertyDescription("Unit specification that can be awarded for completing a section.")
    private List<Credit> credits = new ArrayList<Credit>();
    /**
     * Site
     * <p>
     * The primary location within the organization where a section's meetings will be held
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The primary location within the organization where a section's meetings will be held")
    private Object site;
    /**
     * Academic Level
     * <p>
     * The levels of academic progress that can be associated with a section
     * 
     */
    @JsonProperty("academicLevels")
    @JsonPropertyDescription("The levels of academic progress that can be associated with a section")
    private List<AcademicLevel> academicLevels = new ArrayList<AcademicLevel>();
    /**
     * Grade Schemes
     * <p>
     * The grading schemes that may be used to award a grade to a student in this section of the course. Must be a subset of the grade schemes of the course.
     * 
     */
    @JsonProperty("gradeSchemes")
    @JsonPropertyDescription("The grading schemes that may be used to award a grade to a student in this section of the course. Must be a subset of the grade schemes of the course.")
    private List<GradeScheme> gradeSchemes = new ArrayList<GradeScheme>();
    /**
     * Course Levels
     * <p>
     * The levels of a course
     * 
     */
    @JsonProperty("courseLevels")
    @JsonPropertyDescription("The levels of a course")
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
     * Owning Institution Units
     * <p>
     * The units (departments) of the educational institution which own, or are responsible for, a course
     * 
     */
    @JsonProperty("owningInstitutionUnits")
    @JsonPropertyDescription("The units (departments) of the educational institution which own, or are responsible for, a course")
    private List<OwningInstitutionUnit> owningInstitutionUnits = new ArrayList<OwningInstitutionUnit>();
    /**
     * Billing
     * <p>
     * The number of units that may be used to calculate the charge for the section as part of registration processing.
     * 
     */
    @JsonProperty("billing")
    @JsonPropertyDescription("The number of units that may be used to calculate the charge for the section as part of registration processing.")
    private Object billing;
    /**
     * Reporting Detail
     * <p>
     * Additional properties required for localized reporting.
     * 
     */
    @JsonProperty("reportingDetail")
    @JsonPropertyDescription("Additional properties required for localized reporting.")
    private Object reportingDetail;

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

    public Sections withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A globally unique identifier of a section to be used in all external references.
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
     * A globally unique identifier of a section to be used in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Sections withId(String id) {
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

    public Sections withTitle(String title) {
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

    public Sections withDescription(String description) {
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

    public Sections withStartOn(Date startOn) {
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

    public Sections withEndOn(Object endOn) {
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

    public Sections withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Section Number
     * <p>
     * A numbering scheme or other mark that distinguishes between multiple sections.  It is generally unique within an academic period and course.
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Section Number
     * <p>
     * A numbering scheme or other mark that distinguishes between multiple sections.  It is generally unique within an academic period and course.
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Sections withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Instructional Platform
     * <p>
     * A technology platform used to manage the administration of a section.
     * 
     */
    @JsonProperty("instructionalPlatform")
    public Object getInstructionalPlatform() {
        return instructionalPlatform;
    }

    /**
     * Instructional Platform
     * <p>
     * A technology platform used to manage the administration of a section.
     * 
     */
    @JsonProperty("instructionalPlatform")
    public void setInstructionalPlatform(Object instructionalPlatform) {
        this.instructionalPlatform = instructionalPlatform;
    }

    public Sections withInstructionalPlatform(Object instructionalPlatform) {
        this.instructionalPlatform = instructionalPlatform;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic time period associated with a section.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic time period associated with a section.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public Sections withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Administrative Time Period
     * <p>
     * The administrative time period associated with a section.
     * 
     */
    @JsonProperty("administrativePeriod")
    public Object getAdministrativePeriod() {
        return administrativePeriod;
    }

    /**
     * Administrative Time Period
     * <p>
     * The administrative time period associated with a section.
     * 
     */
    @JsonProperty("administrativePeriod")
    public void setAdministrativePeriod(Object administrativePeriod) {
        this.administrativePeriod = administrativePeriod;
    }

    public Sections withAdministrativePeriod(Object administrativePeriod) {
        this.administrativePeriod = administrativePeriod;
        return this;
    }

    /**
     * Census Dates
     * <p>
     * The dates at which the section's enrollment/headcount is determined. These dates override the census dates for the academic period, if they are different.
     * 
     */
    @JsonProperty("censusDates")
    public List<String> getCensusDates() {
        return censusDates;
    }

    /**
     * Census Dates
     * <p>
     * The dates at which the section's enrollment/headcount is determined. These dates override the census dates for the academic period, if they are different.
     * 
     */
    @JsonProperty("censusDates")
    public void setCensusDates(List<String> censusDates) {
        this.censusDates = censusDates;
    }

    public Sections withCensusDates(List<String> censusDates) {
        this.censusDates = censusDates;
        return this;
    }

    /**
     * Course
     * <p>
     * The smallest unit of instruction for which an Oganization grants credits.
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
     * The smallest unit of instruction for which an Oganization grants credits.
     * (Required)
     * 
     */
    @JsonProperty("course")
    public void setCourse(Course course) {
        this.course = course;
    }

    public Sections withCourse(Course course) {
        this.course = course;
        return this;
    }

    /**
     * Credit
     * <p>
     * Unit specification that can be awarded for completing a section.
     * 
     */
    @JsonProperty("credits")
    public List<Credit> getCredits() {
        return credits;
    }

    /**
     * Credit
     * <p>
     * Unit specification that can be awarded for completing a section.
     * 
     */
    @JsonProperty("credits")
    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public Sections withCredits(List<Credit> credits) {
        this.credits = credits;
        return this;
    }

    /**
     * Site
     * <p>
     * The primary location within the organization where a section's meetings will be held
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The primary location within the organization where a section's meetings will be held
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public Sections withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The levels of academic progress that can be associated with a section
     * 
     */
    @JsonProperty("academicLevels")
    public List<AcademicLevel> getAcademicLevels() {
        return academicLevels;
    }

    /**
     * Academic Level
     * <p>
     * The levels of academic progress that can be associated with a section
     * 
     */
    @JsonProperty("academicLevels")
    public void setAcademicLevels(List<AcademicLevel> academicLevels) {
        this.academicLevels = academicLevels;
    }

    public Sections withAcademicLevels(List<AcademicLevel> academicLevels) {
        this.academicLevels = academicLevels;
        return this;
    }

    /**
     * Grade Schemes
     * <p>
     * The grading schemes that may be used to award a grade to a student in this section of the course. Must be a subset of the grade schemes of the course.
     * 
     */
    @JsonProperty("gradeSchemes")
    public List<GradeScheme> getGradeSchemes() {
        return gradeSchemes;
    }

    /**
     * Grade Schemes
     * <p>
     * The grading schemes that may be used to award a grade to a student in this section of the course. Must be a subset of the grade schemes of the course.
     * 
     */
    @JsonProperty("gradeSchemes")
    public void setGradeSchemes(List<GradeScheme> gradeSchemes) {
        this.gradeSchemes = gradeSchemes;
    }

    public Sections withGradeSchemes(List<GradeScheme> gradeSchemes) {
        this.gradeSchemes = gradeSchemes;
        return this;
    }

    /**
     * Course Levels
     * <p>
     * The levels of a course
     * 
     */
    @JsonProperty("courseLevels")
    public List<CourseLevel> getCourseLevels() {
        return courseLevels;
    }

    /**
     * Course Levels
     * <p>
     * The levels of a course
     * 
     */
    @JsonProperty("courseLevels")
    public void setCourseLevels(List<CourseLevel> courseLevels) {
        this.courseLevels = courseLevels;
    }

    public Sections withCourseLevels(List<CourseLevel> courseLevels) {
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

    public Sections withStatus(Object status) {
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

    public Sections withDuration(Object duration) {
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

    public Sections withMaxEnrollment(Object maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
        return this;
    }

    /**
     * Owning Institution Units
     * <p>
     * The units (departments) of the educational institution which own, or are responsible for, a course
     * 
     */
    @JsonProperty("owningInstitutionUnits")
    public List<OwningInstitutionUnit> getOwningInstitutionUnits() {
        return owningInstitutionUnits;
    }

    /**
     * Owning Institution Units
     * <p>
     * The units (departments) of the educational institution which own, or are responsible for, a course
     * 
     */
    @JsonProperty("owningInstitutionUnits")
    public void setOwningInstitutionUnits(List<OwningInstitutionUnit> owningInstitutionUnits) {
        this.owningInstitutionUnits = owningInstitutionUnits;
    }

    public Sections withOwningInstitutionUnits(List<OwningInstitutionUnit> owningInstitutionUnits) {
        this.owningInstitutionUnits = owningInstitutionUnits;
        return this;
    }

    /**
     * Billing
     * <p>
     * The number of units that may be used to calculate the charge for the section as part of registration processing.
     * 
     */
    @JsonProperty("billing")
    public Object getBilling() {
        return billing;
    }

    /**
     * Billing
     * <p>
     * The number of units that may be used to calculate the charge for the section as part of registration processing.
     * 
     */
    @JsonProperty("billing")
    public void setBilling(Object billing) {
        this.billing = billing;
    }

    public Sections withBilling(Object billing) {
        this.billing = billing;
        return this;
    }

    /**
     * Reporting Detail
     * <p>
     * Additional properties required for localized reporting.
     * 
     */
    @JsonProperty("reportingDetail")
    public Object getReportingDetail() {
        return reportingDetail;
    }

    /**
     * Reporting Detail
     * <p>
     * Additional properties required for localized reporting.
     * 
     */
    @JsonProperty("reportingDetail")
    public void setReportingDetail(Object reportingDetail) {
        this.reportingDetail = reportingDetail;
    }

    public Sections withReportingDetail(Object reportingDetail) {
        this.reportingDetail = reportingDetail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sections.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("censusDates");
        sb.append('=');
        sb.append(((this.censusDates == null)?"<null>":this.censusDates));
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
        sb.append("gradeSchemes");
        sb.append('=');
        sb.append(((this.gradeSchemes == null)?"<null>":this.gradeSchemes));
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
        sb.append("owningInstitutionUnits");
        sb.append('=');
        sb.append(((this.owningInstitutionUnits == null)?"<null>":this.owningInstitutionUnits));
        sb.append(',');
        sb.append("billing");
        sb.append('=');
        sb.append(((this.billing == null)?"<null>":this.billing));
        sb.append(',');
        sb.append("reportingDetail");
        sb.append('=');
        sb.append(((this.reportingDetail == null)?"<null>":this.reportingDetail));
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
        result = ((result* 31)+((this.maxEnrollment == null)? 0 :this.maxEnrollment.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.academicLevels == null)? 0 :this.academicLevels.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.billing == null)? 0 :this.billing.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.owningInstitutionUnits == null)? 0 :this.owningInstitutionUnits.hashCode()));
        result = ((result* 31)+((this.administrativePeriod == null)? 0 :this.administrativePeriod.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.course == null)? 0 :this.course.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.censusDates == null)? 0 :this.censusDates.hashCode()));
        result = ((result* 31)+((this.gradeSchemes == null)? 0 :this.gradeSchemes.hashCode()));
        result = ((result* 31)+((this.instructionalPlatform == null)? 0 :this.instructionalPlatform.hashCode()));
        result = ((result* 31)+((this.reportingDetail == null)? 0 :this.reportingDetail.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.courseLevels == null)? 0 :this.courseLevels.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sections) == false) {
            return false;
        }
        Sections rhs = ((Sections) other);
        return (((((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.maxEnrollment == rhs.maxEnrollment)||((this.maxEnrollment!= null)&&this.maxEnrollment.equals(rhs.maxEnrollment))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.academicLevels == rhs.academicLevels)||((this.academicLevels!= null)&&this.academicLevels.equals(rhs.academicLevels))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.billing == rhs.billing)||((this.billing!= null)&&this.billing.equals(rhs.billing))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.owningInstitutionUnits == rhs.owningInstitutionUnits)||((this.owningInstitutionUnits!= null)&&this.owningInstitutionUnits.equals(rhs.owningInstitutionUnits))))&&((this.administrativePeriod == rhs.administrativePeriod)||((this.administrativePeriod!= null)&&this.administrativePeriod.equals(rhs.administrativePeriod))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.course == rhs.course)||((this.course!= null)&&this.course.equals(rhs.course))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.censusDates == rhs.censusDates)||((this.censusDates!= null)&&this.censusDates.equals(rhs.censusDates))))&&((this.gradeSchemes == rhs.gradeSchemes)||((this.gradeSchemes!= null)&&this.gradeSchemes.equals(rhs.gradeSchemes))))&&((this.instructionalPlatform == rhs.instructionalPlatform)||((this.instructionalPlatform!= null)&&this.instructionalPlatform.equals(rhs.instructionalPlatform))))&&((this.reportingDetail == rhs.reportingDetail)||((this.reportingDetail!= null)&&this.reportingDetail.equals(rhs.reportingDetail))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.courseLevels == rhs.courseLevels)||((this.courseLevels!= null)&&this.courseLevels.equals(rhs.courseLevels))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
