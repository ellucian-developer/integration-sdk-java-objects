
package com.ellucian.generated.eedm.vendors_maximum.v1_0_0;

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
 * A type of phone for a vendor. Includes a standard type (e.g. 'mobile', 'business') and an optional, custom type to further identify the type of phone.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "phoneType",
    "detail"
})
@Generated("jsonschema2pojo")
public class Type__3 {

    /**
     * Type
     * <p>
     * A type of phone contact for a vendor.
     * (Required)
     * 
     */
    @JsonProperty("phoneType")
    @JsonPropertyDescription("A type of phone contact for a vendor.")
    private Type__3 .PhoneType phoneType;
    /**
     * Detail
     * <p>
     * Additional details about the type of phone.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Additional details about the type of phone.")
    private Object detail;

    /**
     * Type
     * <p>
     * A type of phone contact for a vendor.
     * (Required)
     * 
     */
    @JsonProperty("phoneType")
    public Type__3 .PhoneType getPhoneType() {
        return phoneType;
    }

    /**
     * Type
     * <p>
     * A type of phone contact for a vendor.
     * (Required)
     * 
     */
    @JsonProperty("phoneType")
    public void setPhoneType(Type__3 .PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public Type__3 withPhoneType(Type__3 .PhoneType phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    /**
     * Detail
     * <p>
     * Additional details about the type of phone.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * Additional details about the type of phone.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Type__3 withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Type__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("phoneType");
        sb.append('=');
        sb.append(((this.phoneType == null)?"<null>":this.phoneType));
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
        result = ((result* 31)+((this.phoneType == null)? 0 :this.phoneType.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type__3) == false) {
            return false;
        }
        Type__3 rhs = ((Type__3) other);
        return (((this.phoneType == rhs.phoneType)||((this.phoneType!= null)&&this.phoneType.equals(rhs.phoneType)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Type
     * <p>
     * A type of phone contact for a vendor.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PhoneType {

        MOBILE("mobile"),
        HOME("home"),
        SCHOOL("school"),
        VACATION("vacation"),
        BUSINESS("business"),
        FAX("fax"),
        PAGER("pager"),
        TDD("tdd"),
        PARENT("parent"),
        FAMILY("family"),
        MAIN("main"),
        BRANCH("branch"),
        REGION("region"),
        SUPPORT("support"),
        BILLING("billing"),
        MATCHING_GIFTS("matchingGifts"),
        OTHER("other");
        private final String value;
        private final static Map<String, Type__3 .PhoneType> CONSTANTS = new HashMap<String, Type__3 .PhoneType>();

        static {
            for (Type__3 .PhoneType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PhoneType(String value) {
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
        public static Type__3 .PhoneType fromValue(String value) {
            Type__3 .PhoneType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
