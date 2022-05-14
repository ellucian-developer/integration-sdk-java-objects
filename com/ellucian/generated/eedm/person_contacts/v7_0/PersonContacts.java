
package com.ellucian.generated.eedm.person_contacts.v7_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Contacts
 * <p>
 * People who will be contacted in case of emergency or other situations related to the subject person
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "contacts"
})
@Generated("jsonschema2pojo")
public class PersonContacts {

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
     * The global identifier of the person contacts information resource
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the person contacts information resource")
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
     * Contacts
     * <p>
     * The subject person's contacts
     * 
     */
    @JsonProperty("contacts")
    @JsonPropertyDescription("The subject person's contacts")
    private List<Contact> contacts = new ArrayList<Contact>();

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

    public PersonContacts withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person contacts information resource
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
     * The global identifier of the person contacts information resource
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonContacts withId(String id) {
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

    public PersonContacts withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Contacts
     * <p>
     * The subject person's contacts
     * 
     */
    @JsonProperty("contacts")
    public List<Contact> getContacts() {
        return contacts;
    }

    /**
     * Contacts
     * <p>
     * The subject person's contacts
     * 
     */
    @JsonProperty("contacts")
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public PersonContacts withContacts(List<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonContacts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("contacts");
        sb.append('=');
        sb.append(((this.contacts == null)?"<null>":this.contacts));
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
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.contacts == null)? 0 :this.contacts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonContacts) == false) {
            return false;
        }
        PersonContacts rhs = ((PersonContacts) other);
        return (((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.contacts == rhs.contacts)||((this.contacts!= null)&&this.contacts.equals(rhs.contacts))));
    }

}
