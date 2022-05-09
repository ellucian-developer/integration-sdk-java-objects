
package com.ellucian.generated.eedm.constituent_organizations.v9_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "status",
    "startOn",
    "endOn",
    "preference",
    "address",
    "comment"
})
@Generated("jsonschema2pojo")
public class Email {

    /**
     * Type
     * <p>
     * A type of email for the organization. Includes a standard type (e.g. 'general', 'hr') and an optional, custom type to further identify the type of email.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of email for the organization. Includes a standard type (e.g. 'general', 'hr') and an optional, custom type to further identify the type of email.")
    private Type__5 type;
    /**
     * Status
     * <p>
     * The status of the email for the organization
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the email for the organization")
    private Object status;
    /**
     * Start On
     * <p>
     * The date the email became active
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date the email became active")
    private Object startOn;
    /**
     * End On
     * <p>
     * The date the email became inactive
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date the email became inactive")
    private Object endOn;
    /**
     * Preferred Email
     * <p>
     * Specifies if the email is preferred over all other emails.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Specifies if the email is preferred over all other emails.")
    private Object preference;
    /**
     * Email Address
     * <p>
     * An email address for the organization
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("An email address for the organization")
    private String address;
    /**
     * Comment
     * <p>
     * A comment concerning the email address.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A comment concerning the email address.")
    private String comment;

    /**
     * Type
     * <p>
     * A type of email for the organization. Includes a standard type (e.g. 'general', 'hr') and an optional, custom type to further identify the type of email.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__5 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of email for the organization. Includes a standard type (e.g. 'general', 'hr') and an optional, custom type to further identify the type of email.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__5 type) {
        this.type = type;
    }

    public Email withType(Type__5 type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the email for the organization
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the email for the organization
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public Email withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date the email became active
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date the email became active
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Email withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date the email became inactive
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date the email became inactive
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Email withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Preferred Email
     * <p>
     * Specifies if the email is preferred over all other emails.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred Email
     * <p>
     * Specifies if the email is preferred over all other emails.
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
     * An email address for the organization
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
     * An email address for the organization
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

    /**
     * Comment
     * <p>
     * A comment concerning the email address.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * A comment concerning the email address.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Email withComment(String comment) {
        this.comment = comment;
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
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
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
        if ((other instanceof Email) == false) {
            return false;
        }
        Email rhs = ((Email) other);
        return ((((((((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
