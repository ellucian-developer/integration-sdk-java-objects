
package com.ellucian.generated.eedm.recruitment_persons.v7_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "type",
    "status",
    "startOn",
    "endOn",
    "preference"
})
@Generated("jsonschema2pojo")
public class Address {

    /**
     * Address
     * <p>
     * The associated physical address.
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The associated physical address.")
    private Object address;
    /**
     * Type
     * <p>
     * A type of address for a person. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of address for a person. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.")
    private Type__2 type;
    /**
     * Status
     * <p>
     * The current status of the person's relationship to the address.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current status of the person's relationship to the address.")
    private Address.Status status;
    /**
     * Start On
     * <p>
     * The earliest date that this address was valid for the person.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The earliest date that this address was valid for the person.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The latest date when this address was valid for the person.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The latest date when this address was valid for the person.")
    private Object endOn;
    /**
     * Preferred Address
     * <p>
     * Specifies if the address is preferred over others of the same type. Only one address should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Specifies if the address is preferred over others of the same type. Only one address should be set to primary for a person.")
    private Object preference;

    /**
     * Address
     * <p>
     * The associated physical address.
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
     * The associated physical address.
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
     * A type of address for a person. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__2 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of address for a person. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
     * (Required)
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

    /**
     * Status
     * <p>
     * The current status of the person's relationship to the address.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Address.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The current status of the person's relationship to the address.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Address.Status status) {
        this.status = status;
    }

    public Address withStatus(Address.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this address was valid for the person.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this address was valid for the person.
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
     * The latest date when this address was valid for the person.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The latest date when this address was valid for the person.
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
     * Preferred Address
     * <p>
     * Specifies if the address is preferred over others of the same type. Only one address should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred Address
     * <p>
     * Specifies if the address is preferred over others of the same type. Only one address should be set to primary for a person.
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
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
        return (((((((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The current status of the person's relationship to the address.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive");
        private final String value;
        private final static Map<String, Address.Status> CONSTANTS = new HashMap<String, Address.Status>();

        static {
            for (Address.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Address.Status fromValue(String value) {
            Address.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
