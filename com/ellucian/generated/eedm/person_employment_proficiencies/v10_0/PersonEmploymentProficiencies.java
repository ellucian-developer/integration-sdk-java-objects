
package com.ellucian.generated.eedm.person_employment_proficiencies.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Employment Proficiencies
 * <p>
 * The proficiencies specified for a person for employment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "proficiency",
    "level",
    "proficiencyLevelClassifications",
    "startOn",
    "endOn",
    "lastUsedOn",
    "comment"
})
@Generated("jsonschema2pojo")
public class PersonEmploymentProficiencies {

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
     * The global identifier of the person employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the person employment proficiency.")
    private String id;
    /**
     * Person
     * <p>
     * The person possessing the employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person possessing the employment proficiency.")
    private Person person;
    /**
     * Proficiency
     * <p>
     * The person's proficiency.
     * (Required)
     * 
     */
    @JsonProperty("proficiency")
    @JsonPropertyDescription("The person's proficiency.")
    private Proficiency proficiency;
    /**
     * Level
     * <p>
     * The person's level of proficiency.
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("The person's level of proficiency.")
    private Object level;
    /**
     * Proficiency Level Classifications
     * <p>
     * The classifications of the person's proficiency level (e.g. read, write, translate, etc.).
     * 
     */
    @JsonProperty("proficiencyLevelClassifications")
    @JsonPropertyDescription("The classifications of the person's proficiency level (e.g. read, write, translate, etc.).")
    private List<ProficiencyLevelClassification> proficiencyLevelClassifications = new ArrayList<ProficiencyLevelClassification>();
    /**
     * Start On
     * <p>
     * The first date when the proficiency is valid.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date when the proficiency is valid.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date when the proficiency is valid.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when the proficiency is valid.")
    private Object endOn;
    /**
     * Last Used On
     * <p>
     * The last date the proficiency was used.
     * 
     */
    @JsonProperty("lastUsedOn")
    @JsonPropertyDescription("The last date the proficiency was used.")
    private Object lastUsedOn;
    /**
     * Comment
     * <p>
     * The comments associated with the person employment proficiency.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comments associated with the person employment proficiency.")
    private String comment;

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

    public PersonEmploymentProficiencies withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person employment proficiency.
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
     * The global identifier of the person employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonEmploymentProficiencies withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person possessing the employment proficiency.
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
     * The person possessing the employment proficiency.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonEmploymentProficiencies withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Proficiency
     * <p>
     * The person's proficiency.
     * (Required)
     * 
     */
    @JsonProperty("proficiency")
    public Proficiency getProficiency() {
        return proficiency;
    }

    /**
     * Proficiency
     * <p>
     * The person's proficiency.
     * (Required)
     * 
     */
    @JsonProperty("proficiency")
    public void setProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
    }

    public PersonEmploymentProficiencies withProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
        return this;
    }

    /**
     * Level
     * <p>
     * The person's level of proficiency.
     * 
     */
    @JsonProperty("level")
    public Object getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * The person's level of proficiency.
     * 
     */
    @JsonProperty("level")
    public void setLevel(Object level) {
        this.level = level;
    }

    public PersonEmploymentProficiencies withLevel(Object level) {
        this.level = level;
        return this;
    }

    /**
     * Proficiency Level Classifications
     * <p>
     * The classifications of the person's proficiency level (e.g. read, write, translate, etc.).
     * 
     */
    @JsonProperty("proficiencyLevelClassifications")
    public List<ProficiencyLevelClassification> getProficiencyLevelClassifications() {
        return proficiencyLevelClassifications;
    }

    /**
     * Proficiency Level Classifications
     * <p>
     * The classifications of the person's proficiency level (e.g. read, write, translate, etc.).
     * 
     */
    @JsonProperty("proficiencyLevelClassifications")
    public void setProficiencyLevelClassifications(List<ProficiencyLevelClassification> proficiencyLevelClassifications) {
        this.proficiencyLevelClassifications = proficiencyLevelClassifications;
    }

    public PersonEmploymentProficiencies withProficiencyLevelClassifications(List<ProficiencyLevelClassification> proficiencyLevelClassifications) {
        this.proficiencyLevelClassifications = proficiencyLevelClassifications;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date when the proficiency is valid.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date when the proficiency is valid.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public PersonEmploymentProficiencies withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when the proficiency is valid.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when the proficiency is valid.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public PersonEmploymentProficiencies withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Last Used On
     * <p>
     * The last date the proficiency was used.
     * 
     */
    @JsonProperty("lastUsedOn")
    public Object getLastUsedOn() {
        return lastUsedOn;
    }

    /**
     * Last Used On
     * <p>
     * The last date the proficiency was used.
     * 
     */
    @JsonProperty("lastUsedOn")
    public void setLastUsedOn(Object lastUsedOn) {
        this.lastUsedOn = lastUsedOn;
    }

    public PersonEmploymentProficiencies withLastUsedOn(Object lastUsedOn) {
        this.lastUsedOn = lastUsedOn;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comments associated with the person employment proficiency.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comments associated with the person employment proficiency.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public PersonEmploymentProficiencies withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonEmploymentProficiencies.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("proficiency");
        sb.append('=');
        sb.append(((this.proficiency == null)?"<null>":this.proficiency));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("proficiencyLevelClassifications");
        sb.append('=');
        sb.append(((this.proficiencyLevelClassifications == null)?"<null>":this.proficiencyLevelClassifications));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("lastUsedOn");
        sb.append('=');
        sb.append(((this.lastUsedOn == null)?"<null>":this.lastUsedOn));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.lastUsedOn == null)? 0 :this.lastUsedOn.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.proficiencyLevelClassifications == null)? 0 :this.proficiencyLevelClassifications.hashCode()));
        result = ((result* 31)+((this.proficiency == null)? 0 :this.proficiency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonEmploymentProficiencies) == false) {
            return false;
        }
        PersonEmploymentProficiencies rhs = ((PersonEmploymentProficiencies) other);
        return (((((((((((this.lastUsedOn == rhs.lastUsedOn)||((this.lastUsedOn!= null)&&this.lastUsedOn.equals(rhs.lastUsedOn)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.proficiencyLevelClassifications == rhs.proficiencyLevelClassifications)||((this.proficiencyLevelClassifications!= null)&&this.proficiencyLevelClassifications.equals(rhs.proficiencyLevelClassifications))))&&((this.proficiency == rhs.proficiency)||((this.proficiency!= null)&&this.proficiency.equals(rhs.proficiency))));
    }

}
