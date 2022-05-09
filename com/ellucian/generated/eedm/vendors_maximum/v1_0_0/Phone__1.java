
package com.ellucian.generated.eedm.vendors_maximum.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "countryCallingCode",
    "number",
    "extension"
})
@Generated("jsonschema2pojo")
public class Phone__1 {

    /**
     * Type
     * <p>
     * A type of phone for a vendor. Includes a standard type (e.g. 'mobile', 'business') and an optional, custom type to further identify the type of phone.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of phone for a vendor. Includes a standard type (e.g. 'mobile', 'business') and an optional, custom type to further identify the type of phone.")
    private Type__3 type;
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
     * A type of phone for a vendor. Includes a standard type (e.g. 'mobile', 'business') and an optional, custom type to further identify the type of phone.
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
     * A type of phone for a vendor. Includes a standard type (e.g. 'mobile', 'business') and an optional, custom type to further identify the type of phone.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__3 type) {
        this.type = type;
    }

    public Phone__1 withType(Type__3 type) {
        this.type = type;
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

    public Phone__1 withCountryCallingCode(Object countryCallingCode) {
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

    public Phone__1 withNumber(String number) {
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

    public Phone__1 withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Phone__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.countryCallingCode == null)? 0 :this.countryCallingCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Phone__1) == false) {
            return false;
        }
        Phone__1 rhs = ((Phone__1) other);
        return (((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.countryCallingCode == rhs.countryCallingCode)||((this.countryCallingCode!= null)&&this.countryCallingCode.equals(rhs.countryCallingCode))));
    }

}
