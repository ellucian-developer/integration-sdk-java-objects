
package com.ellucian.generated.eedm.students.v16_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Students
 * <p>
 * Information about a person who has, or is eligible to, register/enroll at the institution as a student.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "types",
    "residencies",
    "levelClassifications"
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
     * The person who has, or is eligible to, register/enroll at the institution as a student.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person who has, or is eligible to, register/enroll at the institution as a student.")
    private Person person;
    /**
     * Types
     * <p>
     * The types of the student.
     * 
     */
    @JsonProperty("types")
    @JsonPropertyDescription("The types of the student.")
    private List<Type> types = new ArrayList<Type>();
    /**
     * Residencies
     * <p>
     * The residency types (e.g.: international, in state, out of state, etc.) associated with the student for periods of time.
     * 
     */
    @JsonProperty("residencies")
    @JsonPropertyDescription("The residency types (e.g.: international, in state, out of state, etc.) associated with the student for periods of time.")
    private List<Residency> residencies = new ArrayList<Residency>();
    /**
     * Level Classifications
     * <p>
     * The most recent student classification for their academic levels.
     * 
     */
    @JsonProperty("levelClassifications")
    @JsonPropertyDescription("The most recent student classification for their academic levels.")
    private List<LevelClassification> levelClassifications = new ArrayList<LevelClassification>();

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
     * The person who has, or is eligible to, register/enroll at the institution as a student.
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
     * The person who has, or is eligible to, register/enroll at the institution as a student.
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
     * Types
     * <p>
     * The types of the student.
     * 
     */
    @JsonProperty("types")
    public List<Type> getTypes() {
        return types;
    }

    /**
     * Types
     * <p>
     * The types of the student.
     * 
     */
    @JsonProperty("types")
    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Students withTypes(List<Type> types) {
        this.types = types;
        return this;
    }

    /**
     * Residencies
     * <p>
     * The residency types (e.g.: international, in state, out of state, etc.) associated with the student for periods of time.
     * 
     */
    @JsonProperty("residencies")
    public List<Residency> getResidencies() {
        return residencies;
    }

    /**
     * Residencies
     * <p>
     * The residency types (e.g.: international, in state, out of state, etc.) associated with the student for periods of time.
     * 
     */
    @JsonProperty("residencies")
    public void setResidencies(List<Residency> residencies) {
        this.residencies = residencies;
    }

    public Students withResidencies(List<Residency> residencies) {
        this.residencies = residencies;
        return this;
    }

    /**
     * Level Classifications
     * <p>
     * The most recent student classification for their academic levels.
     * 
     */
    @JsonProperty("levelClassifications")
    public List<LevelClassification> getLevelClassifications() {
        return levelClassifications;
    }

    /**
     * Level Classifications
     * <p>
     * The most recent student classification for their academic levels.
     * 
     */
    @JsonProperty("levelClassifications")
    public void setLevelClassifications(List<LevelClassification> levelClassifications) {
        this.levelClassifications = levelClassifications;
    }

    public Students withLevelClassifications(List<LevelClassification> levelClassifications) {
        this.levelClassifications = levelClassifications;
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
        sb.append("types");
        sb.append('=');
        sb.append(((this.types == null)?"<null>":this.types));
        sb.append(',');
        sb.append("residencies");
        sb.append('=');
        sb.append(((this.residencies == null)?"<null>":this.residencies));
        sb.append(',');
        sb.append("levelClassifications");
        sb.append('=');
        sb.append(((this.levelClassifications == null)?"<null>":this.levelClassifications));
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
        result = ((result* 31)+((this.types == null)? 0 :this.types.hashCode()));
        result = ((result* 31)+((this.levelClassifications == null)? 0 :this.levelClassifications.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.residencies == null)? 0 :this.residencies.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
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
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.types == rhs.types)||((this.types!= null)&&this.types.equals(rhs.types))))&&((this.levelClassifications == rhs.levelClassifications)||((this.levelClassifications!= null)&&this.levelClassifications.equals(rhs.levelClassifications))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.residencies == rhs.residencies)||((this.residencies!= null)&&this.residencies.equals(rhs.residencies))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
