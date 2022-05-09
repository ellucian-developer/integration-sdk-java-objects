
package com.ellucian.generated.eedm.ship_to_destinations.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contact
 * <p>
 * The contact specified for the destination.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "phone"
})
@Generated("jsonschema2pojo")
public class Contact {

    /**
     * Name
     * <p>
     * The name of the contact.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the contact.")
    private String name;
    /**
     * Phone
     * <p>
     * The phone number and extension of the contact.
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The phone number and extension of the contact.")
    private Object phone;

    /**
     * Name
     * <p>
     * The name of the contact.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the contact.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phone number and extension of the contact.
     * 
     */
    @JsonProperty("phone")
    public Object getPhone() {
        return phone;
    }

    /**
     * Phone
     * <p>
     * The phone number and extension of the contact.
     * 
     */
    @JsonProperty("phone")
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Contact withPhone(Object phone) {
        this.phone = phone;
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
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
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
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
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
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))));
    }

}
