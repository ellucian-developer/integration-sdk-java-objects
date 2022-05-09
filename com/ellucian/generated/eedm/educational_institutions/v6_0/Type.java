
package com.ellucian.generated.eedm.educational_institutions.v6_0;

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
 * A type of location for the institution. Includes a standard type (e.g. 'main', 'support') and an optional, custom type to further identify the type of location.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressType",
    "detail"
})
@Generated("jsonschema2pojo")
public class Type {

    /**
     * Address Type
     * <p>
     * A mapping to a standard type for the address
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    @JsonPropertyDescription("A mapping to a standard type for the address")
    private Type.AddressType addressType;
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
     * Address Type
     * <p>
     * A mapping to a standard type for the address
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    public Type.AddressType getAddressType() {
        return addressType;
    }

    /**
     * Address Type
     * <p>
     * A mapping to a standard type for the address
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    public void setAddressType(Type.AddressType addressType) {
        this.addressType = addressType;
    }

    public Type withAddressType(Type.AddressType addressType) {
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

    public Type withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Type.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Type) == false) {
            return false;
        }
        Type rhs = ((Type) other);
        return (((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Address Type
     * <p>
     * A mapping to a standard type for the address
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
        private final static Map<String, Type.AddressType> CONSTANTS = new HashMap<String, Type.AddressType>();

        static {
            for (Type.AddressType c: values()) {
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
        public static Type.AddressType fromValue(String value) {
            Type.AddressType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
