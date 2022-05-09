
package com.ellucian.generated.eedm.person_emergency_contacts.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contact
 * <p>
 * The details of the person who is the emergency contact.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "types",
    "phones",
    "relationship"
})
@Generated("jsonschema2pojo")
public class Contact {

    /**
     * Name
     * <p>
     * The name of the contact.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the contact.")
    private Name name;
    /**
     * Types
     * <p>
     * The types of situations when the person should be contacted.
     * (Required)
     * 
     */
    @JsonProperty("types")
    @JsonPropertyDescription("The types of situations when the person should be contacted.")
    private List<Type> types = new ArrayList<Type>();
    /**
     * Phones
     * <p>
     * The phone details at which the contact can be reached.
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phone details at which the contact can be reached.")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Relationship
     * <p>
     * The relationship between the subject person and the contact.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("The relationship between the subject person and the contact.")
    private Relationship relationship;

    /**
     * Name
     * <p>
     * The name of the contact.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the contact.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    public Contact withName(Name name) {
        this.name = name;
        return this;
    }

    /**
     * Types
     * <p>
     * The types of situations when the person should be contacted.
     * (Required)
     * 
     */
    @JsonProperty("types")
    public List<Type> getTypes() {
        return types;
    }

    /**
     * Types
     * <p>
     * The types of situations when the person should be contacted.
     * (Required)
     * 
     */
    @JsonProperty("types")
    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Contact withTypes(List<Type> types) {
        this.types = types;
        return this;
    }

    /**
     * Phones
     * <p>
     * The phone details at which the contact can be reached.
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phones
     * <p>
     * The phone details at which the contact can be reached.
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public Contact withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Relationship
     * <p>
     * The relationship between the subject person and the contact.
     * 
     */
    @JsonProperty("relationship")
    public Relationship getRelationship() {
        return relationship;
    }

    /**
     * Relationship
     * <p>
     * The relationship between the subject person and the contact.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public Contact withRelationship(Relationship relationship) {
        this.relationship = relationship;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("types");
        sb.append('=');
        sb.append(((this.types == null)?"<null>":this.types));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.types == null)? 0 :this.types.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.types == rhs.types)||((this.types!= null)&&this.types.equals(rhs.types))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))));
    }

}
