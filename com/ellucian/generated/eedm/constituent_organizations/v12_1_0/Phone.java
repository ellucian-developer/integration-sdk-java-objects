
package com.ellucian.generated.eedm.constituent_organizations.v12_1_0;

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
    "type",
    "status",
    "startOn",
    "endOn",
    "preference",
    "country",
    "number",
    "extension",
    "privacy",
    "comment"
})
@Generated("jsonschema2pojo")
public class Phone {

    /**
     * Type
     * <p>
     * A type of phone for the organization. Includes a standard type (e.g., 'main', 'support') and an optional, custom type to further identify the type of phone.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of phone for the organization. Includes a standard type (e.g., 'main', 'support') and an optional, custom type to further identify the type of phone.")
    private Type__4 type;
    /**
     * Status
     * <p>
     * The status of the phone for the organization
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the phone for the organization")
    private Object status;
    /**
     * Start On
     * <p>
     * The earliest date that this phone was valid for the organization.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The earliest date that this phone was valid for the organization.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The latest date that this phone was valid for the organization
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The latest date that this phone was valid for the organization")
    private Object endOn;
    /**
     * Preferred Phone
     * <p>
     * Specifies if the phone is preferred over all other phones.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Specifies if the phone is preferred over all other phones.")
    private Object preference;
    /**
     * country
     * <p>
     * The country in which the phone is located.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country in which the phone is located.")
    private Object country;
    /**
     * Number
     * <p>
     * The number assigned to the phone.
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("The number assigned to the phone.")
    private String number;
    /**
     * Extension
     * <p>
     * The extension used to connect to the phone when multiple phones share the same primary number.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("The extension used to connect to the phone when multiple phones share the same primary number.")
    private String extension;
    /**
     * Privacy
     * <p>
     * An indication if the phone number is unlisted and should be protected from view or if it is listed and available for all.
     * 
     */
    @JsonProperty("privacy")
    @JsonPropertyDescription("An indication if the phone number is unlisted and should be protected from view or if it is listed and available for all.")
    private Phone.Privacy privacy;
    /**
     * Comment
     * <p>
     * A comment concerning the phone number.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A comment concerning the phone number.")
    private String comment;

    /**
     * Type
     * <p>
     * A type of phone for the organization. Includes a standard type (e.g., 'main', 'support') and an optional, custom type to further identify the type of phone.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__4 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of phone for the organization. Includes a standard type (e.g., 'main', 'support') and an optional, custom type to further identify the type of phone.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__4 type) {
        this.type = type;
    }

    public Phone withType(Type__4 type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the phone for the organization
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the phone for the organization
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public Phone withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this phone was valid for the organization.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this phone was valid for the organization.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Phone withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The latest date that this phone was valid for the organization
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The latest date that this phone was valid for the organization
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Phone withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Preferred Phone
     * <p>
     * Specifies if the phone is preferred over all other phones.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred Phone
     * <p>
     * Specifies if the phone is preferred over all other phones.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Phone withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    /**
     * country
     * <p>
     * The country in which the phone is located.
     * 
     */
    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    /**
     * country
     * <p>
     * The country in which the phone is located.
     * 
     */
    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    public Phone withCountry(Object country) {
        this.country = country;
        return this;
    }

    /**
     * Number
     * <p>
     * The number assigned to the phone.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Number
     * <p>
     * The number assigned to the phone.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Phone withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Extension
     * <p>
     * The extension used to connect to the phone when multiple phones share the same primary number.
     * 
     */
    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    /**
     * Extension
     * <p>
     * The extension used to connect to the phone when multiple phones share the same primary number.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Phone withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Privacy
     * <p>
     * An indication if the phone number is unlisted and should be protected from view or if it is listed and available for all.
     * 
     */
    @JsonProperty("privacy")
    public Phone.Privacy getPrivacy() {
        return privacy;
    }

    /**
     * Privacy
     * <p>
     * An indication if the phone number is unlisted and should be protected from view or if it is listed and available for all.
     * 
     */
    @JsonProperty("privacy")
    public void setPrivacy(Phone.Privacy privacy) {
        this.privacy = privacy;
    }

    public Phone withPrivacy(Phone.Privacy privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Comment
     * <p>
     * A comment concerning the phone number.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * A comment concerning the phone number.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Phone withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Phone.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("privacy");
        sb.append('=');
        sb.append(((this.privacy == null)?"<null>":this.privacy));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.privacy == null)? 0 :this.privacy.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Phone) == false) {
            return false;
        }
        Phone rhs = ((Phone) other);
        return (((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.privacy == rhs.privacy)||((this.privacy!= null)&&this.privacy.equals(rhs.privacy))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Privacy
     * <p>
     * An indication if the phone number is unlisted and should be protected from view or if it is listed and available for all.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Privacy {

        LISTED("listed"),
        UNLISTED("unlisted");
        private final String value;
        private final static Map<String, Phone.Privacy> CONSTANTS = new HashMap<String, Phone.Privacy>();

        static {
            for (Phone.Privacy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Privacy(String value) {
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
        public static Phone.Privacy fromValue(String value) {
            Phone.Privacy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
