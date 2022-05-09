
package com.ellucian.generated.eedm.persons.v12_1_0;

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
 * A type of phone for a person. Includes a standard type (e.g. 'mobile', 'home') and an optional, custom type to further identify the type of phone.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "phoneType",
    "detail"
})
@Generated("jsonschema2pojo")
public class Type__2 {

    /**
     * Type
     * <p>
     * A type of phone contact for a person.
     * (Required)
     * 
     */
    @JsonProperty("phoneType")
    @JsonPropertyDescription("A type of phone contact for a person.")
    private Type__2 .PhoneType phoneType;
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
     * A type of phone contact for a person.
     * (Required)
     * 
     */
    @JsonProperty("phoneType")
    public Type__2 .PhoneType getPhoneType() {
        return phoneType;
    }

    /**
     * Type
     * <p>
     * A type of phone contact for a person.
     * (Required)
     * 
     */
    @JsonProperty("phoneType")
    public void setPhoneType(Type__2 .PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public Type__2 withPhoneType(Type__2 .PhoneType phoneType) {
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

    public Type__2 withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Type__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Type__2) == false) {
            return false;
        }
        Type__2 rhs = ((Type__2) other);
        return (((this.phoneType == rhs.phoneType)||((this.phoneType!= null)&&this.phoneType.equals(rhs.phoneType)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Type
     * <p>
     * A type of phone contact for a person.
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
        private final static Map<String, Type__2 .PhoneType> CONSTANTS = new HashMap<String, Type__2 .PhoneType>();

        static {
            for (Type__2 .PhoneType c: values()) {
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
        public static Type__2 .PhoneType fromValue(String value) {
            Type__2 .PhoneType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
