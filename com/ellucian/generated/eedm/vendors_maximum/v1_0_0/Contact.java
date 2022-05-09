
package com.ellucian.generated.eedm.vendors_maximum.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendorContact",
    "relationshipType",
    "person",
    "phones"
})
@Generated("jsonschema2pojo")
public class Contact {

    /**
     * Vendor Contact
     * <p>
     * The detail of the vendor contact.
     * (Required)
     * 
     */
    @JsonProperty("vendorContact")
    @JsonPropertyDescription("The detail of the vendor contact.")
    private VendorContact vendorContact;
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
    private List<Phone__2> phones = new ArrayList<Phone__2>();

    /**
     * Vendor Contact
     * <p>
     * The detail of the vendor contact.
     * (Required)
     * 
     */
    @JsonProperty("vendorContact")
    public VendorContact getVendorContact() {
        return vendorContact;
    }

    /**
     * Vendor Contact
     * <p>
     * The detail of the vendor contact.
     * (Required)
     * 
     */
    @JsonProperty("vendorContact")
    public void setVendorContact(VendorContact vendorContact) {
        this.vendorContact = vendorContact;
    }

    public Contact withVendorContact(VendorContact vendorContact) {
        this.vendorContact = vendorContact;
        return this;
    }

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
    public List<Phone__2> getPhones() {
        return phones;
    }

    /**
     * Phones
     * <p>
     * The phone type, number and extension of the contact person.
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone__2> phones) {
        this.phones = phones;
    }

    public Contact withPhones(List<Phone__2> phones) {
        this.phones = phones;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vendorContact");
        sb.append('=');
        sb.append(((this.vendorContact == null)?"<null>":this.vendorContact));
        sb.append(',');
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
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.vendorContact == null)? 0 :this.vendorContact.hashCode()));
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
        return (((((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones)))&&((this.vendorContact == rhs.vendorContact)||((this.vendorContact!= null)&&this.vendorContact.equals(rhs.vendorContact))))&&((this.relationshipType == rhs.relationshipType)||((this.relationshipType!= null)&&this.relationshipType.equals(rhs.relationshipType))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))));
    }

}
