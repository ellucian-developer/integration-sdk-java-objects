
package com.ellucian.generated.eedm.student_academic_period_profiles.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Academic Period Profiles
 * <p>
 * Information about a student for a specified academic period.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "academicPeriod",
    "studentStatus",
    "residency",
    "type",
    "academicPeriodEnrollmentStatus",
    "academicLoad",
    "tags",
    "measures"
})
@Generated("jsonschema2pojo")
public class StudentAcademicPeriodProfiles {

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
     * The global identifier of the student academic period profile.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student academic period profile.")
    private String id;
    /**
     * Person
     * <p>
     * A reference to link a student to the common HEDM persons entity.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("A reference to link a student to the common HEDM persons entity.")
    private Person person;
    /**
     * Academic Period
     * <p>
     * A term within an academic year.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("A term within an academic year.")
    private AcademicPeriod academicPeriod;
    /**
     * Student Status
     * <p>
     * Status of the student for a given academic period.
     * 
     */
    @JsonProperty("studentStatus")
    @JsonPropertyDescription("Status of the student for a given academic period.")
    private Object studentStatus;
    /**
     * Residency
     * <p>
     * The residency type of the student for the academic period (e.g. international, in state, out of state, etc.).
     * 
     */
    @JsonProperty("residency")
    @JsonPropertyDescription("The residency type of the student for the academic period (e.g. international, in state, out of state, etc.).")
    private Object residency;
    /**
     * Type
     * <p>
     * Type of the student for the academic period.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the student for the academic period.")
    private Object type;
    /**
     * Academic Period Enrollment Status
     * <p>
     * Status of the student enrollment for a given academic period.
     * 
     */
    @JsonProperty("academicPeriodEnrollmentStatus")
    @JsonPropertyDescription("Status of the student enrollment for a given academic period.")
    private Object academicPeriodEnrollmentStatus;
    /**
     * Academic Load
     * <p>
     * The relative load (full-time, part-time, overload) of a student during the academic period based on the number of contact hours or credits.
     * 
     */
    @JsonProperty("academicLoad")
    @JsonPropertyDescription("The relative load (full-time, part-time, overload) of a student during the academic period based on the number of contact hours or credits.")
    private Object academicLoad;
    /**
     * Tags
     * <p>
     * A list of custom defined attributes or characteristics (tags) assigned to the student.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("A list of custom defined attributes or characteristics (tags) assigned to the student.")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * Measures
     * <p>
     * Measures (GPA, year classification) associated with the student for the academic period by academic level.
     * 
     */
    @JsonProperty("measures")
    @JsonPropertyDescription("Measures (GPA, year classification) associated with the student for the academic period by academic level.")
    private List<Measure> measures = new ArrayList<Measure>();

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

    public StudentAcademicPeriodProfiles withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student academic period profile.
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
     * The global identifier of the student academic period profile.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAcademicPeriodProfiles withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * A reference to link a student to the common HEDM persons entity.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * A reference to link a student to the common HEDM persons entity.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public StudentAcademicPeriodProfiles withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * A term within an academic year.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    public AcademicPeriod getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * A term within an academic year.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public StudentAcademicPeriodProfiles withAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Student Status
     * <p>
     * Status of the student for a given academic period.
     * 
     */
    @JsonProperty("studentStatus")
    public Object getStudentStatus() {
        return studentStatus;
    }

    /**
     * Student Status
     * <p>
     * Status of the student for a given academic period.
     * 
     */
    @JsonProperty("studentStatus")
    public void setStudentStatus(Object studentStatus) {
        this.studentStatus = studentStatus;
    }

    public StudentAcademicPeriodProfiles withStudentStatus(Object studentStatus) {
        this.studentStatus = studentStatus;
        return this;
    }

    /**
     * Residency
     * <p>
     * The residency type of the student for the academic period (e.g. international, in state, out of state, etc.).
     * 
     */
    @JsonProperty("residency")
    public Object getResidency() {
        return residency;
    }

    /**
     * Residency
     * <p>
     * The residency type of the student for the academic period (e.g. international, in state, out of state, etc.).
     * 
     */
    @JsonProperty("residency")
    public void setResidency(Object residency) {
        this.residency = residency;
    }

    public StudentAcademicPeriodProfiles withResidency(Object residency) {
        this.residency = residency;
        return this;
    }

    /**
     * Type
     * <p>
     * Type of the student for the academic period.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Type of the student for the academic period.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public StudentAcademicPeriodProfiles withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Academic Period Enrollment Status
     * <p>
     * Status of the student enrollment for a given academic period.
     * 
     */
    @JsonProperty("academicPeriodEnrollmentStatus")
    public Object getAcademicPeriodEnrollmentStatus() {
        return academicPeriodEnrollmentStatus;
    }

    /**
     * Academic Period Enrollment Status
     * <p>
     * Status of the student enrollment for a given academic period.
     * 
     */
    @JsonProperty("academicPeriodEnrollmentStatus")
    public void setAcademicPeriodEnrollmentStatus(Object academicPeriodEnrollmentStatus) {
        this.academicPeriodEnrollmentStatus = academicPeriodEnrollmentStatus;
    }

    public StudentAcademicPeriodProfiles withAcademicPeriodEnrollmentStatus(Object academicPeriodEnrollmentStatus) {
        this.academicPeriodEnrollmentStatus = academicPeriodEnrollmentStatus;
        return this;
    }

    /**
     * Academic Load
     * <p>
     * The relative load (full-time, part-time, overload) of a student during the academic period based on the number of contact hours or credits.
     * 
     */
    @JsonProperty("academicLoad")
    public Object getAcademicLoad() {
        return academicLoad;
    }

    /**
     * Academic Load
     * <p>
     * The relative load (full-time, part-time, overload) of a student during the academic period based on the number of contact hours or credits.
     * 
     */
    @JsonProperty("academicLoad")
    public void setAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
    }

    public StudentAcademicPeriodProfiles withAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
        return this;
    }

    /**
     * Tags
     * <p>
     * A list of custom defined attributes or characteristics (tags) assigned to the student.
     * 
     */
    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * Tags
     * <p>
     * A list of custom defined attributes or characteristics (tags) assigned to the student.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public StudentAcademicPeriodProfiles withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Measures
     * <p>
     * Measures (GPA, year classification) associated with the student for the academic period by academic level.
     * 
     */
    @JsonProperty("measures")
    public List<Measure> getMeasures() {
        return measures;
    }

    /**
     * Measures
     * <p>
     * Measures (GPA, year classification) associated with the student for the academic period by academic level.
     * 
     */
    @JsonProperty("measures")
    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }

    public StudentAcademicPeriodProfiles withMeasures(List<Measure> measures) {
        this.measures = measures;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAcademicPeriodProfiles.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("studentStatus");
        sb.append('=');
        sb.append(((this.studentStatus == null)?"<null>":this.studentStatus));
        sb.append(',');
        sb.append("residency");
        sb.append('=');
        sb.append(((this.residency == null)?"<null>":this.residency));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("academicPeriodEnrollmentStatus");
        sb.append('=');
        sb.append(((this.academicPeriodEnrollmentStatus == null)?"<null>":this.academicPeriodEnrollmentStatus));
        sb.append(',');
        sb.append("academicLoad");
        sb.append('=');
        sb.append(((this.academicLoad == null)?"<null>":this.academicLoad));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("measures");
        sb.append('=');
        sb.append(((this.measures == null)?"<null>":this.measures));
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
        result = ((result* 31)+((this.residency == null)? 0 :this.residency.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.measures == null)? 0 :this.measures.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.academicPeriodEnrollmentStatus == null)? 0 :this.academicPeriodEnrollmentStatus.hashCode()));
        result = ((result* 31)+((this.studentStatus == null)? 0 :this.studentStatus.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.academicLoad == null)? 0 :this.academicLoad.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAcademicPeriodProfiles) == false) {
            return false;
        }
        StudentAcademicPeriodProfiles rhs = ((StudentAcademicPeriodProfiles) other);
        return ((((((((((((this.residency == rhs.residency)||((this.residency!= null)&&this.residency.equals(rhs.residency)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.measures == rhs.measures)||((this.measures!= null)&&this.measures.equals(rhs.measures))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.academicPeriodEnrollmentStatus == rhs.academicPeriodEnrollmentStatus)||((this.academicPeriodEnrollmentStatus!= null)&&this.academicPeriodEnrollmentStatus.equals(rhs.academicPeriodEnrollmentStatus))))&&((this.studentStatus == rhs.studentStatus)||((this.studentStatus!= null)&&this.studentStatus.equals(rhs.studentStatus))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.academicLoad == rhs.academicLoad)||((this.academicLoad!= null)&&this.academicLoad.equals(rhs.academicLoad))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
