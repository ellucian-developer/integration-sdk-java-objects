
package com.ellucian.generated.eedm.courses.v8_0;

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
 * Courses
 * <p>
 * The smallest unit of instruction for which an oganization grants credits. Identifies subject, course number and level, availability dates, instructional method, grading schemes, credits granted, and the granting organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "subject",
    "courseLevels",
    "instructionalMethods",
    "owningInstitutionUnits",
    "schedulingStartOn",
    "schedulingEndOn",
    "number",
    "academicLevels",
    "gradeSchemes",
    "credits",
    "billing",
    "reportingDetail"
})
@Generated("jsonschema2pojo")
public class Courses {

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
     * A global identifier of a course to be used in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a course to be used in all external references.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of a course as it appears in a course catalog (for example, 'Calculus').
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a course as it appears in a course catalog (for example, 'Calculus').")
    private String title;
    /**
     * Description
     * <p>
     * A description of the substance and nature of a course as it appears in a course catalog.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the substance and nature of a course as it appears in a course catalog.")
    private String description;
    /**
     * Subject
     * <p>
     * The branch of knowledge such as 'Mathematics' or 'Biology' associated with a course.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("The branch of knowledge such as 'Mathematics' or 'Biology' associated with a course.")
    private Subject subject;
    /**
     * Course Levels
     * <p>
     * The levels of scholarship that apply to a course.
     * 
     */
    @JsonProperty("courseLevels")
    @JsonPropertyDescription("The levels of scholarship that apply to a course.")
    private List<CourseLevel> courseLevels = new ArrayList<CourseLevel>();
    /**
     * Instructional Methods
     * <p>
     * The methods, styles, or formats in which a course is taught (for example, 'Lecture', 'Lab').
     * 
     */
    @JsonProperty("instructionalMethods")
    @JsonPropertyDescription("The methods, styles, or formats in which a course is taught (for example, 'Lecture', 'Lab').")
    private List<InstructionalMethod> instructionalMethods = new ArrayList<InstructionalMethod>();
    /**
     * Owning Institution Units
     * <p>
     * A list of units of the educational institution (optionally, hierarchical) that own or are responsible for a course
     * 
     */
    @JsonProperty("owningInstitutionUnits")
    @JsonPropertyDescription("A list of units of the educational institution (optionally, hierarchical) that own or are responsible for a course")
    private List<OwningInstitutionUnit> owningInstitutionUnits = new ArrayList<OwningInstitutionUnit>();
    /**
     * Course Effective Starting Date
     * <p>
     * The starting date on which a course is available to have sections scheduled. When combined with the Course Effective Ending Date, this defines the time period a course is available for scheduling.
     * (Required)
     * 
     */
    @JsonProperty("schedulingStartOn")
    @JsonPropertyDescription("The starting date on which a course is available to have sections scheduled. When combined with the Course Effective Ending Date, this defines the time period a course is available for scheduling.")
    private Date schedulingStartOn;
    /**
     * Course Effective Ending Date
     * <p>
     * The ending date on which a course is no longer available to have sections scheduled. When combined with the Course Effective Starting Date, this defines the time period a course is available for scheduling.
     * 
     */
    @JsonProperty("schedulingEndOn")
    @JsonPropertyDescription("The ending date on which a course is no longer available to have sections scheduled. When combined with the Course Effective Starting Date, this defines the time period a course is available for scheduling.")
    private Object schedulingEndOn;
    /**
     * Course Number
     * <p>
     * A numbering scheme that distinguishes courses within a subject. Typically, this is an integer.
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("A numbering scheme that distinguishes courses within a subject. Typically, this is an integer.")
    private String number;
    /**
     * Academic Levels
     * <p>
     * The academic level (for example, 'Under Graduate' or 'Graduate') associated with a course.
     * 
     */
    @JsonProperty("academicLevels")
    @JsonPropertyDescription("The academic level (for example, 'Under Graduate' or 'Graduate') associated with a course.")
    private List<AcademicLevel> academicLevels = new ArrayList<AcademicLevel>();
    /**
     * Grade Schemes
     * <p>
     * The grading schemes that may be used to award a grade to a student taking this course.
     * 
     */
    @JsonProperty("gradeSchemes")
    @JsonPropertyDescription("The grading schemes that may be used to award a grade to a student taking this course.")
    private List<GradeScheme> gradeSchemes = new ArrayList<GradeScheme>();
    /**
     * Credits
     * <p>
     * The credit specifications that apply to a course (for example, 'Regular Credit').
     * 
     */
    @JsonProperty("credits")
    @JsonPropertyDescription("The credit specifications that apply to a course (for example, 'Regular Credit').")
    private List<Credit> credits = new ArrayList<Credit>();
    /**
     * Billing
     * <p>
     * The number of units that may be used to calculate the charge for the course.
     * 
     */
    @JsonProperty("billing")
    @JsonPropertyDescription("The number of units that may be used to calculate the charge for the course.")
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

    public Courses withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a course to be used in all external references.
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
     * A global identifier of a course to be used in all external references.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Courses withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a course as it appears in a course catalog (for example, 'Calculus').
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
     * The full name of a course as it appears in a course catalog (for example, 'Calculus').
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Courses withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A description of the substance and nature of a course as it appears in a course catalog.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of the substance and nature of a course as it appears in a course catalog.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Courses withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Subject
     * <p>
     * The branch of knowledge such as 'Mathematics' or 'Biology' associated with a course.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public Subject getSubject() {
        return subject;
    }

    /**
     * Subject
     * <p>
     * The branch of knowledge such as 'Mathematics' or 'Biology' associated with a course.
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Courses withSubject(Subject subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Course Levels
     * <p>
     * The levels of scholarship that apply to a course.
     * 
     */
    @JsonProperty("courseLevels")
    public List<CourseLevel> getCourseLevels() {
        return courseLevels;
    }

    /**
     * Course Levels
     * <p>
     * The levels of scholarship that apply to a course.
     * 
     */
    @JsonProperty("courseLevels")
    public void setCourseLevels(List<CourseLevel> courseLevels) {
        this.courseLevels = courseLevels;
    }

    public Courses withCourseLevels(List<CourseLevel> courseLevels) {
        this.courseLevels = courseLevels;
        return this;
    }

    /**
     * Instructional Methods
     * <p>
     * The methods, styles, or formats in which a course is taught (for example, 'Lecture', 'Lab').
     * 
     */
    @JsonProperty("instructionalMethods")
    public List<InstructionalMethod> getInstructionalMethods() {
        return instructionalMethods;
    }

    /**
     * Instructional Methods
     * <p>
     * The methods, styles, or formats in which a course is taught (for example, 'Lecture', 'Lab').
     * 
     */
    @JsonProperty("instructionalMethods")
    public void setInstructionalMethods(List<InstructionalMethod> instructionalMethods) {
        this.instructionalMethods = instructionalMethods;
    }

    public Courses withInstructionalMethods(List<InstructionalMethod> instructionalMethods) {
        this.instructionalMethods = instructionalMethods;
        return this;
    }

    /**
     * Owning Institution Units
     * <p>
     * A list of units of the educational institution (optionally, hierarchical) that own or are responsible for a course
     * 
     */
    @JsonProperty("owningInstitutionUnits")
    public List<OwningInstitutionUnit> getOwningInstitutionUnits() {
        return owningInstitutionUnits;
    }

    /**
     * Owning Institution Units
     * <p>
     * A list of units of the educational institution (optionally, hierarchical) that own or are responsible for a course
     * 
     */
    @JsonProperty("owningInstitutionUnits")
    public void setOwningInstitutionUnits(List<OwningInstitutionUnit> owningInstitutionUnits) {
        this.owningInstitutionUnits = owningInstitutionUnits;
    }

    public Courses withOwningInstitutionUnits(List<OwningInstitutionUnit> owningInstitutionUnits) {
        this.owningInstitutionUnits = owningInstitutionUnits;
        return this;
    }

    /**
     * Course Effective Starting Date
     * <p>
     * The starting date on which a course is available to have sections scheduled. When combined with the Course Effective Ending Date, this defines the time period a course is available for scheduling.
     * (Required)
     * 
     */
    @JsonProperty("schedulingStartOn")
    public Date getSchedulingStartOn() {
        return schedulingStartOn;
    }

    /**
     * Course Effective Starting Date
     * <p>
     * The starting date on which a course is available to have sections scheduled. When combined with the Course Effective Ending Date, this defines the time period a course is available for scheduling.
     * (Required)
     * 
     */
    @JsonProperty("schedulingStartOn")
    public void setSchedulingStartOn(Date schedulingStartOn) {
        this.schedulingStartOn = schedulingStartOn;
    }

    public Courses withSchedulingStartOn(Date schedulingStartOn) {
        this.schedulingStartOn = schedulingStartOn;
        return this;
    }

    /**
     * Course Effective Ending Date
     * <p>
     * The ending date on which a course is no longer available to have sections scheduled. When combined with the Course Effective Starting Date, this defines the time period a course is available for scheduling.
     * 
     */
    @JsonProperty("schedulingEndOn")
    public Object getSchedulingEndOn() {
        return schedulingEndOn;
    }

    /**
     * Course Effective Ending Date
     * <p>
     * The ending date on which a course is no longer available to have sections scheduled. When combined with the Course Effective Starting Date, this defines the time period a course is available for scheduling.
     * 
     */
    @JsonProperty("schedulingEndOn")
    public void setSchedulingEndOn(Object schedulingEndOn) {
        this.schedulingEndOn = schedulingEndOn;
    }

    public Courses withSchedulingEndOn(Object schedulingEndOn) {
        this.schedulingEndOn = schedulingEndOn;
        return this;
    }

    /**
     * Course Number
     * <p>
     * A numbering scheme that distinguishes courses within a subject. Typically, this is an integer.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Course Number
     * <p>
     * A numbering scheme that distinguishes courses within a subject. Typically, this is an integer.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Courses withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Academic Levels
     * <p>
     * The academic level (for example, 'Under Graduate' or 'Graduate') associated with a course.
     * 
     */
    @JsonProperty("academicLevels")
    public List<AcademicLevel> getAcademicLevels() {
        return academicLevels;
    }

    /**
     * Academic Levels
     * <p>
     * The academic level (for example, 'Under Graduate' or 'Graduate') associated with a course.
     * 
     */
    @JsonProperty("academicLevels")
    public void setAcademicLevels(List<AcademicLevel> academicLevels) {
        this.academicLevels = academicLevels;
    }

    public Courses withAcademicLevels(List<AcademicLevel> academicLevels) {
        this.academicLevels = academicLevels;
        return this;
    }

    /**
     * Grade Schemes
     * <p>
     * The grading schemes that may be used to award a grade to a student taking this course.
     * 
     */
    @JsonProperty("gradeSchemes")
    public List<GradeScheme> getGradeSchemes() {
        return gradeSchemes;
    }

    /**
     * Grade Schemes
     * <p>
     * The grading schemes that may be used to award a grade to a student taking this course.
     * 
     */
    @JsonProperty("gradeSchemes")
    public void setGradeSchemes(List<GradeScheme> gradeSchemes) {
        this.gradeSchemes = gradeSchemes;
    }

    public Courses withGradeSchemes(List<GradeScheme> gradeSchemes) {
        this.gradeSchemes = gradeSchemes;
        return this;
    }

    /**
     * Credits
     * <p>
     * The credit specifications that apply to a course (for example, 'Regular Credit').
     * 
     */
    @JsonProperty("credits")
    public List<Credit> getCredits() {
        return credits;
    }

    /**
     * Credits
     * <p>
     * The credit specifications that apply to a course (for example, 'Regular Credit').
     * 
     */
    @JsonProperty("credits")
    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public Courses withCredits(List<Credit> credits) {
        this.credits = credits;
        return this;
    }

    /**
     * Billing
     * <p>
     * The number of units that may be used to calculate the charge for the course.
     * 
     */
    @JsonProperty("billing")
    public Object getBilling() {
        return billing;
    }

    /**
     * Billing
     * <p>
     * The number of units that may be used to calculate the charge for the course.
     * 
     */
    @JsonProperty("billing")
    public void setBilling(Object billing) {
        this.billing = billing;
    }

    public Courses withBilling(Object billing) {
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

    public Courses withReportingDetail(Object reportingDetail) {
        this.reportingDetail = reportingDetail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Courses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("courseLevels");
        sb.append('=');
        sb.append(((this.courseLevels == null)?"<null>":this.courseLevels));
        sb.append(',');
        sb.append("instructionalMethods");
        sb.append('=');
        sb.append(((this.instructionalMethods == null)?"<null>":this.instructionalMethods));
        sb.append(',');
        sb.append("owningInstitutionUnits");
        sb.append('=');
        sb.append(((this.owningInstitutionUnits == null)?"<null>":this.owningInstitutionUnits));
        sb.append(',');
        sb.append("schedulingStartOn");
        sb.append('=');
        sb.append(((this.schedulingStartOn == null)?"<null>":this.schedulingStartOn));
        sb.append(',');
        sb.append("schedulingEndOn");
        sb.append('=');
        sb.append(((this.schedulingEndOn == null)?"<null>":this.schedulingEndOn));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("academicLevels");
        sb.append('=');
        sb.append(((this.academicLevels == null)?"<null>":this.academicLevels));
        sb.append(',');
        sb.append("gradeSchemes");
        sb.append('=');
        sb.append(((this.gradeSchemes == null)?"<null>":this.gradeSchemes));
        sb.append(',');
        sb.append("credits");
        sb.append('=');
        sb.append(((this.credits == null)?"<null>":this.credits));
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
        result = ((result* 31)+((this.gradeSchemes == null)? 0 :this.gradeSchemes.hashCode()));
        result = ((result* 31)+((this.academicLevels == null)? 0 :this.academicLevels.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.reportingDetail == null)? 0 :this.reportingDetail.hashCode()));
        result = ((result* 31)+((this.billing == null)? 0 :this.billing.hashCode()));
        result = ((result* 31)+((this.schedulingEndOn == null)? 0 :this.schedulingEndOn.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.courseLevels == null)? 0 :this.courseLevels.hashCode()));
        result = ((result* 31)+((this.owningInstitutionUnits == null)? 0 :this.owningInstitutionUnits.hashCode()));
        result = ((result* 31)+((this.schedulingStartOn == null)? 0 :this.schedulingStartOn.hashCode()));
        result = ((result* 31)+((this.credits == null)? 0 :this.credits.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.instructionalMethods == null)? 0 :this.instructionalMethods.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Courses) == false) {
            return false;
        }
        Courses rhs = ((Courses) other);
        return (((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.gradeSchemes == rhs.gradeSchemes)||((this.gradeSchemes!= null)&&this.gradeSchemes.equals(rhs.gradeSchemes))))&&((this.academicLevels == rhs.academicLevels)||((this.academicLevels!= null)&&this.academicLevels.equals(rhs.academicLevels))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.reportingDetail == rhs.reportingDetail)||((this.reportingDetail!= null)&&this.reportingDetail.equals(rhs.reportingDetail))))&&((this.billing == rhs.billing)||((this.billing!= null)&&this.billing.equals(rhs.billing))))&&((this.schedulingEndOn == rhs.schedulingEndOn)||((this.schedulingEndOn!= null)&&this.schedulingEndOn.equals(rhs.schedulingEndOn))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.courseLevels == rhs.courseLevels)||((this.courseLevels!= null)&&this.courseLevels.equals(rhs.courseLevels))))&&((this.owningInstitutionUnits == rhs.owningInstitutionUnits)||((this.owningInstitutionUnits!= null)&&this.owningInstitutionUnits.equals(rhs.owningInstitutionUnits))))&&((this.schedulingStartOn == rhs.schedulingStartOn)||((this.schedulingStartOn!= null)&&this.schedulingStartOn.equals(rhs.schedulingStartOn))))&&((this.credits == rhs.credits)||((this.credits!= null)&&this.credits.equals(rhs.credits))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.instructionalMethods == rhs.instructionalMethods)||((this.instructionalMethods!= null)&&this.instructionalMethods.equals(rhs.instructionalMethods))));
    }

}
