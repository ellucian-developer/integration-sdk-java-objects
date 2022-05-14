
package com.ellucian.generated.eedm.student_academic_periods.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Academic Periods
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
    "academicLevels",
    "academicStatuses",
    "academicLoads"
})
@Generated("jsonschema2pojo")
public class StudentAcademicPeriods {

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
     * The global identifier of the student academic period.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student academic period.")
    private String id;
    /**
     * Person
     * <p>
     * The person who is associated with the academic period.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person who is associated with the academic period.")
    private Person person;
    /**
     * Academic Period
     * <p>
     * The academic period to which the student has been associated.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period to which the student has been associated.")
    private AcademicPeriod academicPeriod;
    /**
     * Academic Levels
     * <p>
     * The distinct academic levels associated with the student for this period.
     * (Required)
     * 
     */
    @JsonProperty("academicLevels")
    @JsonPropertyDescription("The distinct academic levels associated with the student for this period.")
    private List<AcademicLevel> academicLevels = new ArrayList<AcademicLevel>();
    /**
     * Academic Statuses
     * <p>
     * The student academic statuses for the period.
     * 
     */
    @JsonProperty("academicStatuses")
    @JsonPropertyDescription("The student academic statuses for the period.")
    private List<AcademicStatus> academicStatuses = new ArrayList<AcademicStatus>();
    /**
     * Academic Loads
     * <p>
     * The student calculated academic loads for the period.
     * 
     */
    @JsonProperty("academicLoads")
    @JsonPropertyDescription("The student calculated academic loads for the period.")
    private List<AcademicLoad> academicLoads = new ArrayList<AcademicLoad>();

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

    public StudentAcademicPeriods withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student academic period.
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
     * The global identifier of the student academic period.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAcademicPeriods withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person who is associated with the academic period.
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
     * The person who is associated with the academic period.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public StudentAcademicPeriods withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period to which the student has been associated.
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
     * The academic period to which the student has been associated.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public StudentAcademicPeriods withAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Academic Levels
     * <p>
     * The distinct academic levels associated with the student for this period.
     * (Required)
     * 
     */
    @JsonProperty("academicLevels")
    public List<AcademicLevel> getAcademicLevels() {
        return academicLevels;
    }

    /**
     * Academic Levels
     * <p>
     * The distinct academic levels associated with the student for this period.
     * (Required)
     * 
     */
    @JsonProperty("academicLevels")
    public void setAcademicLevels(List<AcademicLevel> academicLevels) {
        this.academicLevels = academicLevels;
    }

    public StudentAcademicPeriods withAcademicLevels(List<AcademicLevel> academicLevels) {
        this.academicLevels = academicLevels;
        return this;
    }

    /**
     * Academic Statuses
     * <p>
     * The student academic statuses for the period.
     * 
     */
    @JsonProperty("academicStatuses")
    public List<AcademicStatus> getAcademicStatuses() {
        return academicStatuses;
    }

    /**
     * Academic Statuses
     * <p>
     * The student academic statuses for the period.
     * 
     */
    @JsonProperty("academicStatuses")
    public void setAcademicStatuses(List<AcademicStatus> academicStatuses) {
        this.academicStatuses = academicStatuses;
    }

    public StudentAcademicPeriods withAcademicStatuses(List<AcademicStatus> academicStatuses) {
        this.academicStatuses = academicStatuses;
        return this;
    }

    /**
     * Academic Loads
     * <p>
     * The student calculated academic loads for the period.
     * 
     */
    @JsonProperty("academicLoads")
    public List<AcademicLoad> getAcademicLoads() {
        return academicLoads;
    }

    /**
     * Academic Loads
     * <p>
     * The student calculated academic loads for the period.
     * 
     */
    @JsonProperty("academicLoads")
    public void setAcademicLoads(List<AcademicLoad> academicLoads) {
        this.academicLoads = academicLoads;
    }

    public StudentAcademicPeriods withAcademicLoads(List<AcademicLoad> academicLoads) {
        this.academicLoads = academicLoads;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAcademicPeriods.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("academicLevels");
        sb.append('=');
        sb.append(((this.academicLevels == null)?"<null>":this.academicLevels));
        sb.append(',');
        sb.append("academicStatuses");
        sb.append('=');
        sb.append(((this.academicStatuses == null)?"<null>":this.academicStatuses));
        sb.append(',');
        sb.append("academicLoads");
        sb.append('=');
        sb.append(((this.academicLoads == null)?"<null>":this.academicLoads));
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
        result = ((result* 31)+((this.academicStatuses == null)? 0 :this.academicStatuses.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.academicLevels == null)? 0 :this.academicLevels.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.academicLoads == null)? 0 :this.academicLoads.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAcademicPeriods) == false) {
            return false;
        }
        StudentAcademicPeriods rhs = ((StudentAcademicPeriods) other);
        return ((((((((this.academicStatuses == rhs.academicStatuses)||((this.academicStatuses!= null)&&this.academicStatuses.equals(rhs.academicStatuses)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.academicLevels == rhs.academicLevels)||((this.academicLevels!= null)&&this.academicLevels.equals(rhs.academicLevels))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.academicLoads == rhs.academicLoads)||((this.academicLoads!= null)&&this.academicLoads.equals(rhs.academicLoads))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))));
    }

}
