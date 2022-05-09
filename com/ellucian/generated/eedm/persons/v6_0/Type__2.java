
package com.ellucian.generated.eedm.persons.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Type
 * <p>
 * A type of address for a person. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressType",
    "detail"
})
@Generated("jsonschema2pojo")
public class Type__2 {

    /**
     * Type
     * <p>
     * A mapping to a standard type for the address type.
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    @JsonPropertyDescription("A mapping to a standard type for the address type.")
    private Type__2 .AddressType addressType;
    /**
     * Detail
     * <p>
     * An optional, custom address type.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("An optional, custom address type.")
    private Object detail;

    /**
     * Type
     * <p>
     * A mapping to a standard type for the address type.
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    public Type__2 .AddressType getAddressType() {
        return addressType;
    }

    /**
     * Type
     * <p>
     * A mapping to a standard type for the address type.
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    public void setAddressType(Type__2 .AddressType addressType) {
        this.addressType = addressType;
    }

    public Type__2 withAddressType(Type__2 .AddressType addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * Detail
     * <p>
     * An optional, custom address type.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * An optional, custom address type.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Type__2 withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Type__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressType");
        sb.append('=');
        sb.append(((this.addressType == null)?"<null>":this.addressType));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.addressType == null)? 0 :this.addressType.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type__2) == false) {
            return false;
        }
        Type__2 rhs = ((Type__2) other);
        return (((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Type
     * <p>
     * A mapping to a standard type for the address type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AddressType {

        HOME("home"),
        SCHOOL("school"),
        VACATION("vacation"),
        BILLING("billing"),
        SHIPPING("shipping"),
        MAILING("mailing"),
        BUSINESS("business"),
        PARENT("parent"),
        FAMILY("family"),
        POBOX("pobox"),
        MAIN("main"),
        BRANCH("branch"),
        REGION("region"),
        SUPPORT("support"),
        MATCHING_GIFTS("matchingGifts"),
        OTHER("other");
        private final String value;
        private final static Map<String, Type__2 .AddressType> CONSTANTS = new HashMap<String, Type__2 .AddressType>();

        static {
            for (Type__2 .AddressType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AddressType(String value) {
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
        public static Type__2 .AddressType fromValue(String value) {
            Type__2 .AddressType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
