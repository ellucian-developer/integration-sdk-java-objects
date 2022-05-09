
package com.ellucian.generated.eedm.apply_prospects.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "type"
})
@Generated("jsonschema2pojo")
public class Address {

    /**
     * Address
     * <p>
     * The associated physical address.
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The associated physical address.")
    private Object address;
    /**
     * Type
     * <p>
     * A type of address for a prospect. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of address for a prospect. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.")
    private Type__2 type;

    /**
     * Address
     * <p>
     * The associated physical address.
     * 
     */
    @JsonProperty("address")
    public Object getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The associated physical address.
     * 
     */
    @JsonProperty("address")
    public void setAddress(Object address) {
        this.address = address;
    }

    public Address withAddress(Object address) {
        this.address = address;
        return this;
    }

    /**
     * Type
     * <p>
     * A type of address for a prospect. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
     * 
     */
    @JsonProperty("type")
    public Type__2 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of address for a prospect. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
     * 
     */
    @JsonProperty("type")
    public void setType(Type__2 type) {
        this.type = type;
    }

    public Address withType(Type__2 type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))));
    }

}
