
package com.ellucian.generated.eedm.vendors_maximum.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "usage"
})
@Generated("jsonschema2pojo")
public class DefaultAddress {

    /**
     * Address
     * <p>
     * The default address associated with the vendor.
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The default address associated with the vendor.")
    private Address__1 address;
    /**
     * Usage
     * <p>
     * The usage associated with the address.
     * (Required)
     * 
     */
    @JsonProperty("usage")
    @JsonPropertyDescription("The usage associated with the address.")
    private Usage usage;

    /**
     * Address
     * <p>
     * The default address associated with the vendor.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Address__1 getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The default address associated with the vendor.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address__1 address) {
        this.address = address;
    }

    public DefaultAddress withAddress(Address__1 address) {
        this.address = address;
        return this;
    }

    /**
     * Usage
     * <p>
     * The usage associated with the address.
     * (Required)
     * 
     */
    @JsonProperty("usage")
    public Usage getUsage() {
        return usage;
    }

    /**
     * Usage
     * <p>
     * The usage associated with the address.
     * (Required)
     * 
     */
    @JsonProperty("usage")
    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public DefaultAddress withUsage(Usage usage) {
        this.usage = usage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefaultAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
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
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultAddress) == false) {
            return false;
        }
        DefaultAddress rhs = ((DefaultAddress) other);
        return (((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))));
    }

}
