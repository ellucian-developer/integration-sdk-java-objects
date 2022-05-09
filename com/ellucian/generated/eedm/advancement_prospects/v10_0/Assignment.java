
package com.ellucian.generated.eedm.advancement_prospects.v10_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "assignee",
    "role",
    "startOn",
    "endOn",
    "preference"
})
@Generated("jsonschema2pojo")
public class Assignment {

    /**
     * Assignee
     * <p>
     * A person or team assigned to the prospect.
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    @JsonPropertyDescription("A person or team assigned to the prospect.")
    private Object assignee;
    /**
     * Role
     * <p>
     * The role of the assignee.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("The role of the assignee.")
    private Object role;
    /**
     * Start On
     * <p>
     * The start date of the assignment.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the assignment.")
    private Date startOn;
    /**
     * End On
     * <p>
     * The end date of the assignment.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the assignment.")
    private Object endOn;
    /**
     * Preference
     * <p>
     * Indicates the primary assignee for the prospect.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Indicates the primary assignee for the prospect.")
    private Object preference;

    /**
     * Assignee
     * <p>
     * A person or team assigned to the prospect.
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    public Object getAssignee() {
        return assignee;
    }

    /**
     * Assignee
     * <p>
     * A person or team assigned to the prospect.
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public Assignment withAssignee(Object assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * Role
     * <p>
     * The role of the assignee.
     * 
     */
    @JsonProperty("role")
    public Object getRole() {
        return role;
    }

    /**
     * Role
     * <p>
     * The role of the assignee.
     * 
     */
    @JsonProperty("role")
    public void setRole(Object role) {
        this.role = role;
    }

    public Assignment withRole(Object role) {
        this.role = role;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date of the assignment.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date of the assignment.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public Assignment withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the assignment.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the assignment.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Assignment withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Preference
     * <p>
     * Indicates the primary assignee for the prospect.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preference
     * <p>
     * Indicates the primary assignee for the prospect.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Assignment withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Assignment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
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
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.assignee == null)? 0 :this.assignee.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Assignment) == false) {
            return false;
        }
        Assignment rhs = ((Assignment) other);
        return ((((((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.assignee == rhs.assignee)||((this.assignee!= null)&&this.assignee.equals(rhs.assignee))))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }

}
