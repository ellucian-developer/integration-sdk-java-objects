
package com.ellucian.generated.eedm.organizations.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "role",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class Role {

    /**
     * Role
     * <p>
     * The role of the organization
     * (Required)
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("The role of the organization")
    private RoleEnum role;
    /**
     * Start On
     * <p>
     * The start date of the relationship in this role
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the relationship in this role")
    private Object startOn;
    /**
     * End On
     * <p>
     * The end date of the relationship in this role
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the relationship in this role")
    private Object endOn;

    /**
     * Role
     * <p>
     * The role of the organization
     * (Required)
     * 
     */
    @JsonProperty("role")
    public RoleEnum getRole() {
        return role;
    }

    /**
     * Role
     * <p>
     * The role of the organization
     * (Required)
     * 
     */
    @JsonProperty("role")
    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public Role withRole(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date of the relationship in this role
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date of the relationship in this role
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Role withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the relationship in this role
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the relationship in this role
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Role withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Role.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Role) == false) {
            return false;
        }
        Role rhs = ((Role) other);
        return ((((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))));
    }

}
