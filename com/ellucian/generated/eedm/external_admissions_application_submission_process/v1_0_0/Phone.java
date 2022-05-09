
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "countryCode",
    "number",
    "extension",
    "textPermission"
})
@Generated("jsonschema2pojo")
public class Phone {

    /**
     * Type
     * <p>
     * Indicates the type of phone number of an applicant.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicates the type of phone number of an applicant.")
    private String type;
    /**
     * CountryCode
     * <p>
     * The countrycode of telephone and/or mobile device when dialing internationally.
     * 
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("The countrycode of telephone and/or mobile device when dialing internationally.")
    private Object countryCode;
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
     * Text Permission
     * <p>
     * Indicates user’s permission to send text messages to the phone number.
     * 
     */
    @JsonProperty("textPermission")
    @JsonPropertyDescription("Indicates user\u2019s permission to send text messages to the phone number.")
    private Boolean textPermission;

    /**
     * Type
     * <p>
     * Indicates the type of phone number of an applicant.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Indicates the type of phone number of an applicant.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Phone withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * CountryCode
     * <p>
     * The countrycode of telephone and/or mobile device when dialing internationally.
     * 
     */
    @JsonProperty("countryCode")
    public Object getCountryCode() {
        return countryCode;
    }

    /**
     * CountryCode
     * <p>
     * The countrycode of telephone and/or mobile device when dialing internationally.
     * 
     */
    @JsonProperty("countryCode")
    public void setCountryCode(Object countryCode) {
        this.countryCode = countryCode;
    }

    public Phone withCountryCode(Object countryCode) {
        this.countryCode = countryCode;
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
     * Text Permission
     * <p>
     * Indicates user’s permission to send text messages to the phone number.
     * 
     */
    @JsonProperty("textPermission")
    public Boolean getTextPermission() {
        return textPermission;
    }

    /**
     * Text Permission
     * <p>
     * Indicates user’s permission to send text messages to the phone number.
     * 
     */
    @JsonProperty("textPermission")
    public void setTextPermission(Boolean textPermission) {
        this.textPermission = textPermission;
    }

    public Phone withTextPermission(Boolean textPermission) {
        this.textPermission = textPermission;
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
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("textPermission");
        sb.append('=');
        sb.append(((this.textPermission == null)?"<null>":this.textPermission));
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
        result = ((result* 31)+((this.textPermission == null)? 0 :this.textPermission.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
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
        return ((((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.textPermission == rhs.textPermission)||((this.textPermission!= null)&&this.textPermission.equals(rhs.textPermission))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))));
    }

}
