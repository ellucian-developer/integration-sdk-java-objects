
package com.ellucian.generated.eedm.person_contacts.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contact Address
 * <p>
 * The associated physical or mailing address of the contact
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address"
})
@Generated("jsonschema2pojo")
public class ContactAddress {

    /**
     * Address
     * <p>
     * The complete address (optionally, split into multiple lines)
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The complete address (optionally, split into multiple lines)")
    private Object address;

    /**
     * Address
     * <p>
     * The complete address (optionally, split into multiple lines)
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Object getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The complete address (optionally, split into multiple lines)
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Object address) {
        this.address = address;
    }

    public ContactAddress withAddress(Object address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContactAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactAddress) == false) {
            return false;
        }
        ContactAddress rhs = ((ContactAddress) other);
        return ((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)));
    }

}
