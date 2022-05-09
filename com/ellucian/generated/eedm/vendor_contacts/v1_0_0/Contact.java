
package com.ellucian.generated.eedm.vendor_contacts.v1_0_0;

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
 * The details for the vendor contact.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "relationshipType",
    "person",
    "phones",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class Contact {

    /**
     * Relationship Type
     * <p>
     * The type of relationship between the vendor and the contact.
     * 
     */
    @JsonProperty("relationshipType")
    @JsonPropertyDescription("The type of relationship between the vendor and the contact.")
    private Object relationshipType;
    /**
     * Person
     * <p>
     * The person who is the vendor contact.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person who is the vendor contact.")
    private Person person;
    /**
     * Phones
     * <p>
     * The phone type, number and extension of the contact person.
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phone type, number and extension of the contact person.")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Start On
     * <p>
     * The earliest date when the contact is active.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The earliest date when the contact is active.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date when the contact was active.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when the contact was active.")
    private Object endOn;

    /**
     * Relationship Type
     * <p>
     * The type of relationship between the vendor and the contact.
     * 
     */
    @JsonProperty("relationshipType")
    public Object getRelationshipType() {
        return relationshipType;
    }

    /**
     * Relationship Type
     * <p>
     * The type of relationship between the vendor and the contact.
     * 
     */
    @JsonProperty("relationshipType")
    public void setRelationshipType(Object relationshipType) {
        this.relationshipType = relationshipType;
    }

    public Contact withRelationshipType(Object relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    /**
     * Person
     * <p>
     * The person who is the vendor contact.
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
     * The person who is the vendor contact.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public Contact withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Phones
     * <p>
     * The phone type, number and extension of the contact person.
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phones
     * <p>
     * The phone type, number and extension of the contact person.
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
     * Start On
     * <p>
     * The earliest date when the contact is active.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The earliest date when the contact is active.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Contact withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when the contact was active.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when the contact was active.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Contact withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("relationshipType");
        sb.append('=');
        sb.append(((this.relationshipType == null)?"<null>":this.relationshipType));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.relationshipType == null)? 0 :this.relationshipType.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
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
        return ((((((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn)))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.relationshipType == rhs.relationshipType)||((this.relationshipType!= null)&&this.relationshipType.equals(rhs.relationshipType))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))));
    }

}
