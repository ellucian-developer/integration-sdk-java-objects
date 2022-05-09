
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
 * A type of email for a person. Includes a standard type (e.g. 'personal', 'business') and an optional, custom type to further identify the type of email.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "emailType",
    "detail"
})
@Generated("jsonschema2pojo")
public class Type__3 {

    /**
     * Type
     * <p>
     * A mapping to a standard type for the email type.
     * (Required)
     * 
     */
    @JsonProperty("emailType")
    @JsonPropertyDescription("A mapping to a standard type for the email type.")
    private Type__3 .EmailType emailType;
    /**
     * Detail
     * <p>
     * Additional details about the type of email.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Additional details about the type of email.")
    private Object detail;

    /**
     * Type
     * <p>
     * A mapping to a standard type for the email type.
     * (Required)
     * 
     */
    @JsonProperty("emailType")
    public Type__3 .EmailType getEmailType() {
        return emailType;
    }

    /**
     * Type
     * <p>
     * A mapping to a standard type for the email type.
     * (Required)
     * 
     */
    @JsonProperty("emailType")
    public void setEmailType(Type__3 .EmailType emailType) {
        this.emailType = emailType;
    }

    public Type__3 withEmailType(Type__3 .EmailType emailType) {
        this.emailType = emailType;
        return this;
    }

    /**
     * Detail
     * <p>
     * Additional details about the type of email.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * Additional details about the type of email.
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
        sb.append("emailType");
        sb.append('=');
        sb.append(((this.emailType == null)?"<null>":this.emailType));
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
        result = ((result* 31)+((this.emailType == null)? 0 :this.emailType.hashCode()));
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
        return (((this.emailType == rhs.emailType)||((this.emailType!= null)&&this.emailType.equals(rhs.emailType)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Type
     * <p>
     * A mapping to a standard type for the email type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EmailType {

        PERSONAL("personal"),
        BUSINESS("business"),
        SCHOOL("school"),
        PARENT("parent"),
        FAMILY("family"),
        SALES("sales"),
        SUPPORT("support"),
        GENERAL("general"),
        BILLING("billing"),
        LEGAL("legal"),
        HR("hr"),
        MEDIA("media"),
        MATCHING_GIFTS("matchingGifts"),
        OTHER("other");
        private final String value;
        private final static Map<String, Type__3 .EmailType> CONSTANTS = new HashMap<String, Type__3 .EmailType>();

        static {
            for (Type__3 .EmailType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EmailType(String value) {
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
        public static Type__3 .EmailType fromValue(String value) {
            Type__3 .EmailType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
