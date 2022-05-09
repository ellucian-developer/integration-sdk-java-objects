
package com.ellucian.generated.eedm.campaigns.v9_0;

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
    "preference",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class Assignment {

    /**
     * Assignee
     * <p>
     * The person or team assigned to the campaign.
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    @JsonPropertyDescription("The person or team assigned to the campaign.")
    private String assignee;
    /**
     * role
     * <p>
     * The role of the assignee in the campaign.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("The role of the assignee in the campaign.")
    private Object role;
    /**
     * Preferred assignee
     * <p>
     * Indicates the preferred assignee for the campaign.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Indicates the preferred assignee for the campaign.")
    private Object preference;
    /**
     * Start Date
     * <p>
     * The start date of the assignment.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the assignment.")
    private Date startOn;
    /**
     * End Date
     * <p>
     * The end date of the assignment.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the assignment.")
    private Object endOn;

    /**
     * Assignee
     * <p>
     * The person or team assigned to the campaign.
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    public String getAssignee() {
        return assignee;
    }

    /**
     * Assignee
     * <p>
     * The person or team assigned to the campaign.
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Assignment withAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * role
     * <p>
     * The role of the assignee in the campaign.
     * 
     */
    @JsonProperty("role")
    public Object getRole() {
        return role;
    }

    /**
     * role
     * <p>
     * The role of the assignee in the campaign.
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
     * Preferred assignee
     * <p>
     * Indicates the preferred assignee for the campaign.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred assignee
     * <p>
     * Indicates the preferred assignee for the campaign.
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

    /**
     * Start Date
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
     * Start Date
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
     * End Date
     * <p>
     * The end date of the assignment.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
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
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
