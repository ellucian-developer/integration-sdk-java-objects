
package com.ellucian.generated.eedm.recruitment_persons.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "status",
    "preference",
    "countryCallingCode",
    "number",
    "extension"
})
@Generated("jsonschema2pojo")
public class Phone {

    /**
     * Type
     * <p>
     * A type of phone for a person. Includes a standard type (e.g. 'mobile', 'home') and an optional, custom type to further identify the type of phone.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of phone for a person. Includes a standard type (e.g. 'mobile', 'home') and an optional, custom type to further identify the type of phone.")
    private Type__3 type;
    /**
     * Status
     * <p>
     * The status of the phone for the person.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the phone for the person.")
    private Object status;
    /**
     * Preferred Phone
     * <p>
     * Specifies if the phone is preferred over others of the same type. Only one phone should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Specifies if the phone is preferred over others of the same type. Only one phone should be set to primary for a person.")
    private Object preference;
    /**
     * Country Calling Code
     * <p>
     * The country calling code of telephone and/or mobile device when dialing internationally.
     * 
     */
    @JsonProperty("countryCallingCode")
    @JsonPropertyDescription("The country calling code of telephone and/or mobile device when dialing internationally.")
    private Object countryCallingCode;
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
     * Type
     * <p>
     * A type of phone for a person. Includes a standard type (e.g. 'mobile', 'home') and an optional, custom type to further identify the type of phone.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__3 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of phone for a person. Includes a standard type (e.g. 'mobile', 'home') and an optional, custom type to further identify the type of phone.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__3 type) {
        this.type = type;
    }

    public Phone withType(Type__3 type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the phone for the person.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the phone for the person.
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
     * Preferred Phone
     * <p>
     * Specifies if the phone is preferred over others of the same type. Only one phone should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred Phone
     * <p>
     * Specifies if the phone is preferred over others of the same type. Only one phone should be set to primary for a person.
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
     * Country Calling Code
     * <p>
     * The country calling code of telephone and/or mobile device when dialing internationally.
     * 
     */
    @JsonProperty("countryCallingCode")
    public Object getCountryCallingCode() {
        return countryCallingCode;
    }

    /**
     * Country Calling Code
     * <p>
     * The country calling code of telephone and/or mobile device when dialing internationally.
     * 
     */
    @JsonProperty("countryCallingCode")
    public void setCountryCallingCode(Object countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
    }

    public Phone withCountryCallingCode(Object countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
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
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("countryCallingCode");
        sb.append('=');
        sb.append(((this.countryCallingCode == null)?"<null>":this.countryCallingCode));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.countryCallingCode == null)? 0 :this.countryCallingCode.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
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
        return (((((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.countryCallingCode == rhs.countryCallingCode)||((this.countryCallingCode!= null)&&this.countryCallingCode.equals(rhs.countryCallingCode))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
