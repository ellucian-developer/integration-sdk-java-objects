
package com.ellucian.generated.eedm.person_employment_references.v10_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Employment References
 * <p>
 * References provided for job applicants or employees.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "reference"
})
@Generated("jsonschema2pojo")
public class PersonEmploymentReferences {

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
     * The global identifier of the person employment reference.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the person employment reference.")
    private String id;
    /**
     * Person
     * <p>
     * The job applicant for whom the reference was specified.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The job applicant for whom the reference was specified.")
    private Person person;
    /**
     * Reference
     * <p>
     * The reference specified for job applicant or employee.
     * (Required)
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("The reference specified for job applicant or employee.")
    private Reference reference;

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

    public PersonEmploymentReferences withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person employment reference.
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
     * The global identifier of the person employment reference.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonEmploymentReferences withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The job applicant for whom the reference was specified.
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
     * The job applicant for whom the reference was specified.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonEmploymentReferences withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Reference
     * <p>
     * The reference specified for job applicant or employee.
     * (Required)
     * 
     */
    @JsonProperty("reference")
    public Reference getReference() {
        return reference;
    }

    /**
     * Reference
     * <p>
     * The reference specified for job applicant or employee.
     * (Required)
     * 
     */
    @JsonProperty("reference")
    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public PersonEmploymentReferences withReference(Reference reference) {
        this.reference = reference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonEmploymentReferences.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
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
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonEmploymentReferences) == false) {
            return false;
        }
        PersonEmploymentReferences rhs = ((PersonEmploymentReferences) other);
        return (((((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))));
    }

}
