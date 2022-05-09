
package com.ellucian.generated.eedm.dfe_admission_decisions.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Representative
 * <p>
 * The individual representing the institution who made this decision.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fullName",
    "userId",
    "email"
})
@Generated("jsonschema2pojo")
public class Representative {

    /**
     * Full Name
     * <p>
     * The full name of the user who made this update.
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("The full name of the user who made this update.")
    private String fullName;
    /**
     * User ID
     * <p>
     * The ID of the user in the Student Record System.
     * (Required)
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("The ID of the user in the Student Record System.")
    private String userId;
    /**
     * Email
     * <p>
     * The email address of the user who made this update.
     * (Required)
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The email address of the user who made this update.")
    private String email;

    /**
     * Full Name
     * <p>
     * The full name of the user who made this update.
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Full Name
     * <p>
     * The full name of the user who made this update.
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Representative withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * User ID
     * <p>
     * The ID of the user in the Student Record System.
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * The ID of the user in the Student Record System.
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Representative withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Email
     * <p>
     * The email address of the user who made this update.
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email
     * <p>
     * The email address of the user who made this update.
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Representative withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Representative.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Representative) == false) {
            return false;
        }
        Representative rhs = ((Representative) other);
        return ((((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName)))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
