
package com.ellucian.generated.eedm.purchase_orders.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contact
 * <p>
 * The contact for the vendor.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "email"
})
@Generated("jsonschema2pojo")
public class Contact__1 {

    /**
     * Name
     * <p>
     * The name of the contact.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the contact.")
    private String name;
    /**
     * Email
     * <p>
     * The email address of the contact.
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The email address of the contact.")
    private String email;

    /**
     * Name
     * <p>
     * The name of the contact.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the contact.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Contact__1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Email
     * <p>
     * The email address of the contact.
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email
     * <p>
     * The email address of the contact.
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Contact__1 withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact__1) == false) {
            return false;
        }
        Contact__1 rhs = ((Contact__1) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}