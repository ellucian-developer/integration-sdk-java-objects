
package com.ellucian.generated.eedm.person_contacts.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contactAvailability",
    "countryCallingCode",
    "number",
    "extension"
})
@Generated("jsonschema2pojo")
public class Phone {

    /**
     * Contact Availability
     * <p>
     * The avaialbility of (best time to call) the contact on this number
     * 
     */
    @JsonProperty("contactAvailability")
    @JsonPropertyDescription("The avaialbility of (best time to call) the contact on this number")
    private Object contactAvailability;
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
     * Contact Availability
     * <p>
     * The avaialbility of (best time to call) the contact on this number
     * 
     */
    @JsonProperty("contactAvailability")
    public Object getContactAvailability() {
        return contactAvailability;
    }

    /**
     * Contact Availability
     * <p>
     * The avaialbility of (best time to call) the contact on this number
     * 
     */
    @JsonProperty("contactAvailability")
    public void setContactAvailability(Object contactAvailability) {
        this.contactAvailability = contactAvailability;
    }

    public Phone withContactAvailability(Object contactAvailability) {
        this.contactAvailability = contactAvailability;
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
        sb.append("contactAvailability");
        sb.append('=');
        sb.append(((this.contactAvailability == null)?"<null>":this.contactAvailability));
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
        result = ((result* 31)+((this.contactAvailability == null)? 0 :this.contactAvailability.hashCode()));
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
        return (((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.countryCallingCode == rhs.countryCallingCode)||((this.countryCallingCode!= null)&&this.countryCallingCode.equals(rhs.countryCallingCode))))&&((this.contactAvailability == rhs.contactAvailability)||((this.contactAvailability!= null)&&this.contactAvailability.equals(rhs.contactAvailability))));
    }

}
