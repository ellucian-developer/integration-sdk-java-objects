
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
 * A type of address for a vendor. Includes a standard type (e.g. 'business', 'mailing') and an optional, custom type to further identify the type of address.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "code",
    "addressType",
    "detail"
})
@Generated("jsonschema2pojo")
public class Type__1 {

    /**
     * Title
     * <p>
     * The title of the address type.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of the address type.")
    private String title;
    /**
     * Code
     * <p>
     * The code used to identify the address type.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code used to identify the address type.")
    private String code;
    /**
     * Address Type
     * <p>
     * The standard type of address for the vendor.
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    @JsonPropertyDescription("The standard type of address for the vendor.")
    private Type__1 .AddressType addressType;
    /**
     * Detail
     * <p>
     * Additional details about the type of address.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Additional details about the type of address.")
    private Object detail;

    /**
     * Title
     * <p>
     * The title of the address type.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The title of the address type.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Type__1 withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Code
     * <p>
     * The code used to identify the address type.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code used to identify the address type.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Type__1 withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Address Type
     * <p>
     * The standard type of address for the vendor.
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    public Type__1 .AddressType getAddressType() {
        return addressType;
    }

    /**
     * Address Type
     * <p>
     * The standard type of address for the vendor.
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    public void setAddressType(Type__1 .AddressType addressType) {
        this.addressType = addressType;
    }

    public Type__1 withAddressType(Type__1 .AddressType addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * Detail
     * <p>
     * Additional details about the type of address.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * Additional details about the type of address.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Type__1 withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Type__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.addressType == null)? 0 :this.addressType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type__1) == false) {
            return false;
        }
        Type__1 rhs = ((Type__1) other);
        return (((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType))));
    }


    /**
     * Address Type
     * <p>
     * The standard type of address for the vendor.
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
        private final static Map<String, Type__1 .AddressType> CONSTANTS = new HashMap<String, Type__1 .AddressType>();

        static {
            for (Type__1 .AddressType c: values()) {
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
        public static Type__1 .AddressType fromValue(String value) {
            Type__1 .AddressType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
