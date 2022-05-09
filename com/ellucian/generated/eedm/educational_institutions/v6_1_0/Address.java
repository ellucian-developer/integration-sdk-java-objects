
package com.ellucian.generated.eedm.educational_institutions.v6_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "type",
    "startOn",
    "endOn",
    "preference"
})
@Generated("jsonschema2pojo")
public class Address {

    /**
     * Address
     * <p>
     * The address associated with the location.
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The address associated with the location.")
    private Object address;
    /**
     * Type
     * <p>
     * A type of location for the institution. Includes a standard type (e.g. 'main', 'support') and an optional, custom type to further identify the type of location.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of location for the institution. Includes a standard type (e.g. 'main', 'support') and an optional, custom type to further identify the type of location.")
    private Type type;
    /**
     * Start On
     * <p>
     * The earliest date that this location was valid for the institution.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The earliest date that this location was valid for the institution.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The latest date when this location was valid for the institution.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The latest date when this location was valid for the institution.")
    private Object endOn;
    /**
     * Preferred Location
     * <p>
     * Specifies if the location is preferred over others of the same type.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Specifies if the location is preferred over others of the same type.")
    private Object preference;

    /**
     * Address
     * <p>
     * The address associated with the location.
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
     * The address associated with the location.
     * (Required)
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
     * A type of location for the institution. Includes a standard type (e.g. 'main', 'support') and an optional, custom type to further identify the type of location.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of location for the institution. Includes a standard type (e.g. 'main', 'support') and an optional, custom type to further identify the type of location.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public Address withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this location was valid for the institution.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this location was valid for the institution.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Address withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The latest date when this location was valid for the institution.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The latest date when this location was valid for the institution.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Address withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Preferred Location
     * <p>
     * Specifies if the location is preferred over others of the same type.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred Location
     * <p>
     * Specifies if the location is preferred over others of the same type.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Address withPreference(Object preference) {
        this.preference = preference;
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
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
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
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
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
        return ((((((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }

}
