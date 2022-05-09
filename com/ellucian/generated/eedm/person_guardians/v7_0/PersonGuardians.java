
package com.ellucian.generated.eedm.person_guardians.v7_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Guardians
 * <p>
 * Legal guardians of the subject person
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "guardians"
})
@Generated("jsonschema2pojo")
public class PersonGuardians {

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
     * The global identifier of the guardians information resource
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the guardians information resource")
    private String id;
    /**
     * Person
     * <p>
     * The subject person
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The subject person")
    private Person person;
    /**
     * Guardians
     * <p>
     * The subject person's guardians
     * (Required)
     * 
     */
    @JsonProperty("guardians")
    @JsonPropertyDescription("The subject person's guardians")
    private List<Object> guardians = new ArrayList<Object>();

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

    public PersonGuardians withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the guardians information resource
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
     * The global identifier of the guardians information resource
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonGuardians withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The subject person
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
     * The subject person
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonGuardians withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Guardians
     * <p>
     * The subject person's guardians
     * (Required)
     * 
     */
    @JsonProperty("guardians")
    public List<Object> getGuardians() {
        return guardians;
    }

    /**
     * Guardians
     * <p>
     * The subject person's guardians
     * (Required)
     * 
     */
    @JsonProperty("guardians")
    public void setGuardians(List<Object> guardians) {
        this.guardians = guardians;
    }

    public PersonGuardians withGuardians(List<Object> guardians) {
        this.guardians = guardians;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonGuardians.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("guardians");
        sb.append('=');
        sb.append(((this.guardians == null)?"<null>":this.guardians));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.guardians == null)? 0 :this.guardians.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonGuardians) == false) {
            return false;
        }
        PersonGuardians rhs = ((PersonGuardians) other);
        return (((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.guardians == rhs.guardians)||((this.guardians!= null)&&this.guardians.equals(rhs.guardians))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))));
    }

}
