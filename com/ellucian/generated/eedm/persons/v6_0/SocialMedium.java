
package com.ellucian.generated.eedm.persons.v6_0;

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
public class SocialMedium {

    /**
     * Social Media
     * <p>
     * A type of social media account for a person. Includes a standard type (e.g. 'skype', 'facebook') and an optional, custom type to further identify the type of social media account.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of social media account for a person. Includes a standard type (e.g. 'skype', 'facebook') and an optional, custom type to further identify the type of social media account.")
    private Type__5 type;
    /**
     * Preferred Social Media
     * <p>
     * Specifies if the social media account is preferred over others of the same type. Only one social media should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Specifies if the social media account is preferred over others of the same type. Only one social media should be set to primary for a person.")
    private Object preference;
    /**
     * Address
     * <p>
     * The username, handle or other address of the social media account.
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The username, handle or other address of the social media account.")
    private String address;

    /**
     * Social Media
     * <p>
     * A type of social media account for a person. Includes a standard type (e.g. 'skype', 'facebook') and an optional, custom type to further identify the type of social media account.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__5 getType() {
        return type;
    }

    /**
     * Social Media
     * <p>
     * A type of social media account for a person. Includes a standard type (e.g. 'skype', 'facebook') and an optional, custom type to further identify the type of social media account.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__5 type) {
        this.type = type;
    }

    public SocialMedium withType(Type__5 type) {
        this.type = type;
        return this;
    }

    /**
     * Preferred Social Media
     * <p>
     * Specifies if the social media account is preferred over others of the same type. Only one social media should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred Social Media
     * <p>
     * Specifies if the social media account is preferred over others of the same type. Only one social media should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public SocialMedium withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Address
     * <p>
     * The username, handle or other address of the social media account.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The username, handle or other address of the social media account.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public SocialMedium withAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SocialMedium.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof SocialMedium) == false) {
            return false;
        }
        SocialMedium rhs = ((SocialMedium) other);
        return ((((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }

}
