
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "preference",
    "address"
})
@Generated("jsonschema2pojo")
public class Email {

    /**
     * Type
     * <p>
     * A type of email for an applicant. Includes a standard type (e.g. 'personal', 'business') and an optional, custom type to further identify the type of email.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of email for an applicant. Includes a standard type (e.g. 'personal', 'business') and an optional, custom type to further identify the type of email.")
    private Object type;
    /**
     * Preferred Email
     * <p>
     * Specifies if the email is preferred over others of the same type or overall. Only one email should be set to primary for an applicant.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Specifies if the email is preferred over others of the same type or overall. Only one email should be set to primary for an applicant.")
    private Object preference;
    /**
     * Email Address
     * <p>
     * An email address for the applicant.
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("An email address for the applicant.")
    private String address;

    /**
     * Type
     * <p>
     * A type of email for an applicant. Includes a standard type (e.g. 'personal', 'business') and an optional, custom type to further identify the type of email.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of email for an applicant. Includes a standard type (e.g. 'personal', 'business') and an optional, custom type to further identify the type of email.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public Email withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Preferred Email
     * <p>
     * Specifies if the email is preferred over others of the same type or overall. Only one email should be set to primary for an applicant.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred Email
     * <p>
     * Specifies if the email is preferred over others of the same type or overall. Only one email should be set to primary for an applicant.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Email withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Email Address
     * <p>
     * An email address for the applicant.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * Email Address
     * <p>
     * An email address for the applicant.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public Email withAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Email.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Email) == false) {
            return false;
        }
        Email rhs = ((Email) other);
        return ((((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }

}
