
package com.ellucian.generated.eedm.students.v7_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Students
 * <p>
 * Information about a person who is registered/enrolled in the institution as a student.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "type",
    "cohorts",
    "tags",
    "residency",
    "measures"
})
@Generated("jsonschema2pojo")
public class Students {

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
     * The global identifier of the student.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student.")
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
     * Type
     * <p>
     * The type of the student.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the student.")
    private Object type;
    /**
     * Cohorts
     * <p>
     * Groupings of students for reporting/tracking purposes (cohorts) to which the student is associated.
     * 
     */
    @JsonProperty("cohorts")
    @JsonPropertyDescription("Groupings of students for reporting/tracking purposes (cohorts) to which the student is associated.")
    private List<Cohort> cohorts = new ArrayList<Cohort>();
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
     * Residency
     * <p>
     * The residency type of the student (e.g.: international, in state, out of state, etc.).
     * 
     */
    @JsonProperty("residency")
    @JsonPropertyDescription("The residency type of the student (e.g.: international, in state, out of state, etc.).")
    private Object residency;
    /**
     * Measures
     * <p>
     * Measures (GPA, year classification) associated with the student by academic level.
     * 
     */
    @JsonProperty("measures")
    @JsonPropertyDescription("Measures (GPA, year classification) associated with the student by academic level.")
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

    public Students withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student.
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
     * The global identifier of the student.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Students withId(String id) {
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

    public Students withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the student.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the student.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public Students withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Cohorts
     * <p>
     * Groupings of students for reporting/tracking purposes (cohorts) to which the student is associated.
     * 
     */
    @JsonProperty("cohorts")
    public List<Cohort> getCohorts() {
        return cohorts;
    }

    /**
     * Cohorts
     * <p>
     * Groupings of students for reporting/tracking purposes (cohorts) to which the student is associated.
     * 
     */
    @JsonProperty("cohorts")
    public void setCohorts(List<Cohort> cohorts) {
        this.cohorts = cohorts;
    }

    public Students withCohorts(List<Cohort> cohorts) {
        this.cohorts = cohorts;
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

    public Students withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Residency
     * <p>
     * The residency type of the student (e.g.: international, in state, out of state, etc.).
     * 
     */
    @JsonProperty("residency")
    public Object getResidency() {
        return residency;
    }

    /**
     * Residency
     * <p>
     * The residency type of the student (e.g.: international, in state, out of state, etc.).
     * 
     */
    @JsonProperty("residency")
    public void setResidency(Object residency) {
        this.residency = residency;
    }

    public Students withResidency(Object residency) {
        this.residency = residency;
        return this;
    }

    /**
     * Measures
     * <p>
     * Measures (GPA, year classification) associated with the student by academic level.
     * 
     */
    @JsonProperty("measures")
    public List<Measure> getMeasures() {
        return measures;
    }

    /**
     * Measures
     * <p>
     * Measures (GPA, year classification) associated with the student by academic level.
     * 
     */
    @JsonProperty("measures")
    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }

    public Students withMeasures(List<Measure> measures) {
        this.measures = measures;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Students.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("cohorts");
        sb.append('=');
        sb.append(((this.cohorts == null)?"<null>":this.cohorts));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("residency");
        sb.append('=');
        sb.append(((this.residency == null)?"<null>":this.residency));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.cohorts == null)? 0 :this.cohorts.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Students) == false) {
            return false;
        }
        Students rhs = ((Students) other);
        return (((((((((this.residency == rhs.residency)||((this.residency!= null)&&this.residency.equals(rhs.residency)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.measures == rhs.measures)||((this.measures!= null)&&this.measures.equals(rhs.measures))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.cohorts == rhs.cohorts)||((this.cohorts!= null)&&this.cohorts.equals(rhs.cohorts))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
