
package com.ellucian.generated.eedm.constituent_persons.v7_0;

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
    "address",
    "webSiteURL"
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
    private Type__8 type;
    /**
     * Status
     * <p>
     * The status of a social media account information for the person.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of a social media account information for the person.")
    private Object status;
    /**
     * Preferred Social Media
     * <p>
     * Specifies if the social media account is preferred over all other social media accounts.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Specifies if the social media account is preferred over all other social media accounts.")
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
     * Web Site URL
     * <p>
     * The URL used to access the social media account.
     * 
     */
    @JsonProperty("webSiteURL")
    @JsonPropertyDescription("The URL used to access the social media account.")
    private String webSiteURL;

    /**
     * Social Media
     * <p>
     * A type of social media account for a person. Includes a standard type (e.g. 'skype', 'facebook') and an optional, custom type to further identify the type of social media account.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__8 getType() {
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
    public void setType(Type__8 type) {
        this.type = type;
    }

    public SocialMedium withType(Type__8 type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of a social media account information for the person.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of a social media account information for the person.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public SocialMedium withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Preferred Social Media
     * <p>
     * Specifies if the social media account is preferred over all other social media accounts.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred Social Media
     * <p>
     * Specifies if the social media account is preferred over all other social media accounts.
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

    /**
     * Web Site URL
     * <p>
     * The URL used to access the social media account.
     * 
     */
    @JsonProperty("webSiteURL")
    public String getWebSiteURL() {
        return webSiteURL;
    }

    /**
     * Web Site URL
     * <p>
     * The URL used to access the social media account.
     * 
     */
    @JsonProperty("webSiteURL")
    public void setWebSiteURL(String webSiteURL) {
        this.webSiteURL = webSiteURL;
    }

    public SocialMedium withWebSiteURL(String webSiteURL) {
        this.webSiteURL = webSiteURL;
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("webSiteURL");
        sb.append('=');
        sb.append(((this.webSiteURL == null)?"<null>":this.webSiteURL));
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
        result = ((result* 31)+((this.webSiteURL == null)? 0 :this.webSiteURL.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
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
        return ((((((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.webSiteURL == rhs.webSiteURL)||((this.webSiteURL!= null)&&this.webSiteURL.equals(rhs.webSiteURL))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }

}
