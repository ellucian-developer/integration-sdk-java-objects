
package com.ellucian.generated.eedm.sections.v16_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
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
    "titles",
    "descriptions",
    "startOn",
    "endOn",
    "code",
    "number",
    "instructionalPlatform",
    "academicPeriod",
    "censusDates",
    "course",
    "courseCategories",
    "credits",
    "site",
    "academicLevels",
    "gradeSchemes",
    "courseLevels",
    "instructionalMethods",
    "hours",
    "instructionalDeliveryMethod",
    "status",
    "duration",
    "maxEnrollment",
    "reservedSeatsMaximum",
    "waitlist",
    "crossListed",
    "owningInstitutionUnits",
    "billing",
    "chargeAssessmentMethod",
    "alternateIds",
    "reportingAcademicPeriod"
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
     * Titles
     * <p>
     * The section titles details.
     * (Required)
     * 
     */
    @JsonProperty("titles")
    @JsonPropertyDescription("The section titles details.")
    private List<Title> titles = new ArrayList<Title>();
    /**
     * Descriptions
     * <p>
     * The section descriptions details.
     * 
     */
    @JsonProperty("descriptions")
    @JsonPropertyDescription("The section descriptions details.")
    private List<Description> descriptions = new ArrayList<Description>();
    /**
     * Offering Start Date
     * <p>
     * The starting date at which a section may be scheduled to be taken.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The starting date at which a section may be scheduled to be taken.")
    private String startOn;
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
     * The smallest unit of instruction for which an organization grants credits.
     * (Required)
     * 
     */
    @JsonProperty("course")
    @JsonPropertyDescription("The smallest unit of instruction for which an organization grants credits.")
    private Course course;
    /**
     * Course Categories
     * <p>
     * The categories to which the course may belong (for example - Vocational, Co-op Work Experience, Lab, Music, etc.)
     * 
     */
    @JsonProperty("courseCategories")
    @JsonPropertyDescription("The categories to which the course may belong (for example - Vocational, Co-op Work Experience, Lab, Music, etc.)")
    private List<CourseCategory> courseCategories = new ArrayList<CourseCategory>();
    /**
     * Credits
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
     * The primary location within the organization where a section's meetings will be held.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The primary location within the organization where a section's meetings will be held.")
    private Object site;
    /**
     * Academic Level
     * <p>
     * The levels of academic progress that can be associated with a section.
     * 
     */
    @JsonProperty("academicLevels")
    @JsonPropertyDescription("The levels of academic progress that can be associated with a section.")
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
     * Instructional Methods
     * <p>
     * The method, style, or format in which the section of a course is taught (for example, 'Lecture', 'Lab').
     * (Required)
     * 
     */
    @JsonProperty("instructionalMethods")
    @JsonPropertyDescription("The method, style, or format in which the section of a course is taught (for example, 'Lecture', 'Lab').")
    private List<InstructionalMethod> instructionalMethods = new ArrayList<InstructionalMethod>();
    /**
     * Hours
     * <p>
     * The hours that may be assigned to the section by instructional method.
     * 
     */
    @JsonProperty("hours")
    @JsonPropertyDescription("The hours that may be assigned to the section by instructional method.")
    private List<Hour> hours = new ArrayList<Hour>();
    /**
     * Instructional Delivery Method
     * <p>
     * The delivery method of instruction for the section (for example: 'Face to face', 'Web', etc.)
     * 
     */
    @JsonProperty("instructionalDeliveryMethod")
    @JsonPropertyDescription("The delivery method of instruction for the section (for example: 'Face to face', 'Web', etc.)")
    private Object instructionalDeliveryMethod;
    /**
     * Status
     * <p>
     * The status of a section (for example, open, closed, pending, cancelled).
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of a section (for example, open, closed, pending, cancelled).")
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
     * Reserved Seats Maximum
     * <p>
     * The maximum number of reserved seats for the section.
     * 
     */
    @JsonProperty("reservedSeatsMaximum")
    @JsonPropertyDescription("The maximum number of reserved seats for the section.")
    private Object reservedSeatsMaximum;
    /**
     * Waitlist
     * <p>
     * Waitlist information for the section.
     * 
     */
    @JsonProperty("waitlist")
    @JsonPropertyDescription("Waitlist information for the section.")
    private Object waitlist;
    /**
     * Cross Listed
     * <p>
     * An indication if this section is cross listed.
     * 
     */
    @JsonProperty("crossListed")
    @JsonPropertyDescription("An indication if this section is cross listed.")
    private Object crossListed;
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
     * Charge Assessment Method
     * <p>
     * The method used to assess the charge for the section.
     * 
     */
    @JsonProperty("chargeAssessmentMethod")
    @JsonPropertyDescription("The method used to assess the charge for the section.")
    private Object chargeAssessmentMethod;
    /**
     * Alternate Ids
     * <p>
     * Additional unique identifiers assigned to sections to support non-Ethos integrations.
     * 
     */
    @JsonProperty("alternateIds")
    @JsonPropertyDescription("Additional unique identifiers assigned to sections to support non-Ethos integrations.")
    private List<AlternateId> alternateIds = new ArrayList<AlternateId>();
    /**
     * Reporting Academic Period
     * <p>
     * The reporting academic period associated with the section.
     * 
     */
    @JsonProperty("reportingAcademicPeriod")
    @JsonPropertyDescription("The reporting academic period associated with the section.")
    private Object reportingAcademicPeriod;

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
     * Titles
     * <p>
     * The section titles details.
     * (Required)
     * 
     */
    @JsonProperty("titles")
    public List<Title> getTitles() {
        return titles;
    }

    /**
     * Titles
     * <p>
     * The section titles details.
     * (Required)
     * 
     */
    @JsonProperty("titles")
    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public Sections withTitles(List<Title> titles) {
        this.titles = titles;
        return this;
    }

    /**
     * Descriptions
     * <p>
     * The section descriptions details.
     * 
     */
    @JsonProperty("descriptions")
    public List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Descriptions
     * <p>
     * The section descriptions details.
     * 
     */
    @JsonProperty("descriptions")
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public Sections withDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
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
    public String getStartOn() {
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
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public Sections withStartOn(String startOn) {
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
     * The smallest unit of instruction for which an organization grants credits.
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
     * The smallest unit of instruction for which an organization grants credits.
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
     * Course Categories
     * <p>
     * The categories to which the course may belong (for example - Vocational, Co-op Work Experience, Lab, Music, etc.)
     * 
     */
    @JsonProperty("courseCategories")
    public List<CourseCategory> getCourseCategories() {
        return courseCategories;
    }

    /**
     * Course Categories
     * <p>
     * The categories to which the course may belong (for example - Vocational, Co-op Work Experience, Lab, Music, etc.)
     * 
     */
    @JsonProperty("courseCategories")
    public void setCourseCategories(List<CourseCategory> courseCategories) {
        this.courseCategories = courseCategories;
    }

    public Sections withCourseCategories(List<CourseCategory> courseCategories) {
        this.courseCategories = courseCategories;
        return this;
    }

    /**
     * Credits
     * <p>
     * Unit specification that can be awarded for completing a section.
     * 
     */
    @JsonProperty("credits")
    public List<Credit> getCredits() {
        return credits;
    }

    /**
     * Credits
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
     * The primary location within the organization where a section's meetings will be held.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The primary location within the organization where a section's meetings will be held.
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
     * The levels of academic progress that can be associated with a section.
     * 
     */
    @JsonProperty("academicLevels")
    public List<AcademicLevel> getAcademicLevels() {
        return academicLevels;
    }

    /**
     * Academic Level
     * <p>
     * The levels of academic progress that can be associated with a section.
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
     * Instructional Methods
     * <p>
     * The method, style, or format in which the section of a course is taught (for example, 'Lecture', 'Lab').
     * (Required)
     * 
     */
    @JsonProperty("instructionalMethods")
    public List<InstructionalMethod> getInstructionalMethods() {
        return instructionalMethods;
    }

    /**
     * Instructional Methods
     * <p>
     * The method, style, or format in which the section of a course is taught (for example, 'Lecture', 'Lab').
     * (Required)
     * 
     */
    @JsonProperty("instructionalMethods")
    public void setInstructionalMethods(List<InstructionalMethod> instructionalMethods) {
        this.instructionalMethods = instructionalMethods;
    }

    public Sections withInstructionalMethods(List<InstructionalMethod> instructionalMethods) {
        this.instructionalMethods = instructionalMethods;
        return this;
    }

    /**
     * Hours
     * <p>
     * The hours that may be assigned to the section by instructional method.
     * 
     */
    @JsonProperty("hours")
    public List<Hour> getHours() {
        return hours;
    }

    /**
     * Hours
     * <p>
     * The hours that may be assigned to the section by instructional method.
     * 
     */
    @JsonProperty("hours")
    public void setHours(List<Hour> hours) {
        this.hours = hours;
    }

    public Sections withHours(List<Hour> hours) {
        this.hours = hours;
        return this;
    }

    /**
     * Instructional Delivery Method
     * <p>
     * The delivery method of instruction for the section (for example: 'Face to face', 'Web', etc.)
     * 
     */
    @JsonProperty("instructionalDeliveryMethod")
    public Object getInstructionalDeliveryMethod() {
        return instructionalDeliveryMethod;
    }

    /**
     * Instructional Delivery Method
     * <p>
     * The delivery method of instruction for the section (for example: 'Face to face', 'Web', etc.)
     * 
     */
    @JsonProperty("instructionalDeliveryMethod")
    public void setInstructionalDeliveryMethod(Object instructionalDeliveryMethod) {
        this.instructionalDeliveryMethod = instructionalDeliveryMethod;
    }

    public Sections withInstructionalDeliveryMethod(Object instructionalDeliveryMethod) {
        this.instructionalDeliveryMethod = instructionalDeliveryMethod;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of a section (for example, open, closed, pending, cancelled).
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of a section (for example, open, closed, pending, cancelled).
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
     * Reserved Seats Maximum
     * <p>
     * The maximum number of reserved seats for the section.
     * 
     */
    @JsonProperty("reservedSeatsMaximum")
    public Object getReservedSeatsMaximum() {
        return reservedSeatsMaximum;
    }

    /**
     * Reserved Seats Maximum
     * <p>
     * The maximum number of reserved seats for the section.
     * 
     */
    @JsonProperty("reservedSeatsMaximum")
    public void setReservedSeatsMaximum(Object reservedSeatsMaximum) {
        this.reservedSeatsMaximum = reservedSeatsMaximum;
    }

    public Sections withReservedSeatsMaximum(Object reservedSeatsMaximum) {
        this.reservedSeatsMaximum = reservedSeatsMaximum;
        return this;
    }

    /**
     * Waitlist
     * <p>
     * Waitlist information for the section.
     * 
     */
    @JsonProperty("waitlist")
    public Object getWaitlist() {
        return waitlist;
    }

    /**
     * Waitlist
     * <p>
     * Waitlist information for the section.
     * 
     */
    @JsonProperty("waitlist")
    public void setWaitlist(Object waitlist) {
        this.waitlist = waitlist;
    }

    public Sections withWaitlist(Object waitlist) {
        this.waitlist = waitlist;
        return this;
    }

    /**
     * Cross Listed
     * <p>
     * An indication if this section is cross listed.
     * 
     */
    @JsonProperty("crossListed")
    public Object getCrossListed() {
        return crossListed;
    }

    /**
     * Cross Listed
     * <p>
     * An indication if this section is cross listed.
     * 
     */
    @JsonProperty("crossListed")
    public void setCrossListed(Object crossListed) {
        this.crossListed = crossListed;
    }

    public Sections withCrossListed(Object crossListed) {
        this.crossListed = crossListed;
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
     * Charge Assessment Method
     * <p>
     * The method used to assess the charge for the section.
     * 
     */
    @JsonProperty("chargeAssessmentMethod")
    public Object getChargeAssessmentMethod() {
        return chargeAssessmentMethod;
    }

    /**
     * Charge Assessment Method
     * <p>
     * The method used to assess the charge for the section.
     * 
     */
    @JsonProperty("chargeAssessmentMethod")
    public void setChargeAssessmentMethod(Object chargeAssessmentMethod) {
        this.chargeAssessmentMethod = chargeAssessmentMethod;
    }

    public Sections withChargeAssessmentMethod(Object chargeAssessmentMethod) {
        this.chargeAssessmentMethod = chargeAssessmentMethod;
        return this;
    }

    /**
     * Alternate Ids
     * <p>
     * Additional unique identifiers assigned to sections to support non-Ethos integrations.
     * 
     */
    @JsonProperty("alternateIds")
    public List<AlternateId> getAlternateIds() {
        return alternateIds;
    }

    /**
     * Alternate Ids
     * <p>
     * Additional unique identifiers assigned to sections to support non-Ethos integrations.
     * 
     */
    @JsonProperty("alternateIds")
    public void setAlternateIds(List<AlternateId> alternateIds) {
        this.alternateIds = alternateIds;
    }

    public Sections withAlternateIds(List<AlternateId> alternateIds) {
        this.alternateIds = alternateIds;
        return this;
    }

    /**
     * Reporting Academic Period
     * <p>
     * The reporting academic period associated with the section.
     * 
     */
    @JsonProperty("reportingAcademicPeriod")
    public Object getReportingAcademicPeriod() {
        return reportingAcademicPeriod;
    }

    /**
     * Reporting Academic Period
     * <p>
     * The reporting academic period associated with the section.
     * 
     */
    @JsonProperty("reportingAcademicPeriod")
    public void setReportingAcademicPeriod(Object reportingAcademicPeriod) {
        this.reportingAcademicPeriod = reportingAcademicPeriod;
    }

    public Sections withReportingAcademicPeriod(Object reportingAcademicPeriod) {
        this.reportingAcademicPeriod = reportingAcademicPeriod;
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
        sb.append("titles");
        sb.append('=');
        sb.append(((this.titles == null)?"<null>":this.titles));
        sb.append(',');
        sb.append("descriptions");
        sb.append('=');
        sb.append(((this.descriptions == null)?"<null>":this.descriptions));
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
        sb.append("censusDates");
        sb.append('=');
        sb.append(((this.censusDates == null)?"<null>":this.censusDates));
        sb.append(',');
        sb.append("course");
        sb.append('=');
        sb.append(((this.course == null)?"<null>":this.course));
        sb.append(',');
        sb.append("courseCategories");
        sb.append('=');
        sb.append(((this.courseCategories == null)?"<null>":this.courseCategories));
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
        sb.append("instructionalMethods");
        sb.append('=');
        sb.append(((this.instructionalMethods == null)?"<null>":this.instructionalMethods));
        sb.append(',');
        sb.append("hours");
        sb.append('=');
        sb.append(((this.hours == null)?"<null>":this.hours));
        sb.append(',');
        sb.append("instructionalDeliveryMethod");
        sb.append('=');
        sb.append(((this.instructionalDeliveryMethod == null)?"<null>":this.instructionalDeliveryMethod));
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
        sb.append("reservedSeatsMaximum");
        sb.append('=');
        sb.append(((this.reservedSeatsMaximum == null)?"<null>":this.reservedSeatsMaximum));
        sb.append(',');
        sb.append("waitlist");
        sb.append('=');
        sb.append(((this.waitlist == null)?"<null>":this.waitlist));
        sb.append(',');
        sb.append("crossListed");
        sb.append('=');
        sb.append(((this.crossListed == null)?"<null>":this.crossListed));
        sb.append(',');
        sb.append("owningInstitutionUnits");
        sb.append('=');
        sb.append(((this.owningInstitutionUnits == null)?"<null>":this.owningInstitutionUnits));
        sb.append(',');
        sb.append("billing");
        sb.append('=');
        sb.append(((this.billing == null)?"<null>":this.billing));
        sb.append(',');
        sb.append("chargeAssessmentMethod");
        sb.append('=');
        sb.append(((this.chargeAssessmentMethod == null)?"<null>":this.chargeAssessmentMethod));
        sb.append(',');
        sb.append("alternateIds");
        sb.append('=');
        sb.append(((this.alternateIds == null)?"<null>":this.alternateIds));
        sb.append(',');
        sb.append("reportingAcademicPeriod");
        sb.append('=');
        sb.append(((this.reportingAcademicPeriod == null)?"<null>":this.reportingAcademicPeriod));
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
        result = ((result* 31)+((this.reportingAcademicPeriod == null)? 0 :this.reportingAcademicPeriod.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.maxEnrollment == null)? 0 :this.maxEnrollment.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.alternateIds == null)? 0 :this.alternateIds.hashCode()));
        result = ((result* 31)+((this.academicLevels == null)? 0 :this.academicLevels.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.descriptions == null)? 0 :this.descriptions.hashCode()));
        result = ((result* 31)+((this.crossListed == null)? 0 :this.crossListed.hashCode()));
        result = ((result* 31)+((this.billing == null)? 0 :this.billing.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.owningInstitutionUnits == null)? 0 :this.owningInstitutionUnits.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.course == null)? 0 :this.course.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.censusDates == null)? 0 :this.censusDates.hashCode()));
        result = ((result* 31)+((this.instructionalMethods == null)? 0 :this.instructionalMethods.hashCode()));
        result = ((result* 31)+((this.gradeSchemes == null)? 0 :this.gradeSchemes.hashCode()));
        result = ((result* 31)+((this.hours == null)? 0 :this.hours.hashCode()));
        result = ((result* 31)+((this.instructionalDeliveryMethod == null)? 0 :this.instructionalDeliveryMethod.hashCode()));
        result = ((result* 31)+((this.chargeAssessmentMethod == null)? 0 :this.chargeAssessmentMethod.hashCode()));
        result = ((result* 31)+((this.titles == null)? 0 :this.titles.hashCode()));
        result = ((result* 31)+((this.instructionalPlatform == null)? 0 :this.instructionalPlatform.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.courseLevels == null)? 0 :this.courseLevels.hashCode()));
        result = ((result* 31)+((this.courseCategories == null)? 0 :this.courseCategories.hashCode()));
        result = ((result* 31)+((this.waitlist == null)? 0 :this.waitlist.hashCode()));
        result = ((result* 31)+((this.reservedSeatsMaximum == null)? 0 :this.reservedSeatsMaximum.hashCode()));
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
        return (((((((((((((((((((((((((((((((((this.reportingAcademicPeriod == rhs.reportingAcademicPeriod)||((this.reportingAcademicPeriod!= null)&&this.reportingAcademicPeriod.equals(rhs.reportingAcademicPeriod)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.maxEnrollment == rhs.maxEnrollment)||((this.maxEnrollment!= null)&&this.maxEnrollment.equals(rhs.maxEnrollment))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.alternateIds == rhs.alternateIds)||((this.alternateIds!= null)&&this.alternateIds.equals(rhs.alternateIds))))&&((this.academicLevels == rhs.academicLevels)||((this.academicLevels!= null)&&this.academicLevels.equals(rhs.academicLevels))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.descriptions == rhs.descriptions)||((this.descriptions!= null)&&this.descriptions.equals(rhs.descriptions))))&&((this.crossListed == rhs.crossListed)||((this.crossListed!= null)&&this.crossListed.equals(rhs.crossListed))))&&((this.billing == rhs.billing)||((this.billing!= null)&&this.billing.equals(rhs.billing))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.owningInstitutionUnits == rhs.owningInstitutionUnits)||((this.owningInstitutionUnits!= null)&&this.owningInstitutionUnits.equals(rhs.owningInstitutionUnits))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.course == rhs.course)||((this.course!= null)&&this.course.equals(rhs.course))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.censusDates == rhs.censusDates)||((this.censusDates!= null)&&this.censusDates.equals(rhs.censusDates))))&&((this.instructionalMethods == rhs.instructionalMethods)||((this.instructionalMethods!= null)&&this.instructionalMethods.equals(rhs.instructionalMethods))))&&((this.gradeSchemes == rhs.gradeSchemes)||((this.gradeSchemes!= null)&&this.gradeSchemes.equals(rhs.gradeSchemes))))&&((this.hours == rhs.hours)||((this.hours!= null)&&this.hours.equals(rhs.hours))))&&((this.instructionalDeliveryMethod == rhs.instructionalDeliveryMethod)||((this.instructionalDeliveryMethod!= null)&&this.instructionalDeliveryMethod.equals(rhs.instructionalDeliveryMethod))))&&((this.chargeAssessmentMethod == rhs.chargeAssessmentMethod)||((this.chargeAssessmentMethod!= null)&&this.chargeAssessmentMethod.equals(rhs.chargeAssessmentMethod))))&&((this.titles == rhs.titles)||((this.titles!= null)&&this.titles.equals(rhs.titles))))&&((this.instructionalPlatform == rhs.instructionalPlatform)||((this.instructionalPlatform!= null)&&this.instructionalPlatform.equals(rhs.instructionalPlatform))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.courseLevels == rhs.courseLevels)||((this.courseLevels!= null)&&this.courseLevels.equals(rhs.courseLevels))))&&((this.courseCategories == rhs.courseCategories)||((this.courseCategories!= null)&&this.courseCategories.equals(rhs.courseCategories))))&&((this.waitlist == rhs.waitlist)||((this.waitlist!= null)&&this.waitlist.equals(rhs.waitlist))))&&((this.reservedSeatsMaximum == rhs.reservedSeatsMaximum)||((this.reservedSeatsMaximum!= null)&&this.reservedSeatsMaximum.equals(rhs.reservedSeatsMaximum))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
