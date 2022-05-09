
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "organisationName",
    "startDate",
    "endDate",
    "role",
    "description",
    "workingWithChildren",
    "commitment"
})
@Generated("jsonschema2pojo")
public class Volunteering {

    /**
     * ID
     * <p>
     * The work experience ID in the Apply system.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The work experience ID in the Apply system.")
    private Object id;
    /**
     * Organisation Name
     * <p>
     * The organisation worked for.
     * 
     */
    @JsonProperty("organisationName")
    @JsonPropertyDescription("The organisation worked for.")
    private String organisationName;
    /**
     * Start Date
     * <p>
     * The date the position began.
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("The date the position began.")
    private Object startDate;
    /**
     * End Date
     * <p>
     * The date the position finished, if applicable.
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("The date the position finished, if applicable.")
    private Object endDate;
    /**
     * Role
     * <p>
     * The position held by the candidate.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("The position held by the candidate.")
    private String role;
    /**
     * Description
     * <p>
     * A written description of the work involved.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A written description of the work involved.")
    private String description;
    /**
     * Working With Children
     * <p>
     * Did this position involve working in a school or with children?
     * 
     */
    @JsonProperty("workingWithChildren")
    @JsonPropertyDescription("Did this position involve working in a school or with children?")
    private Object workingWithChildren;
    /**
     * Commitment
     * <p>
     * Whether the work was full time or part time
     * 
     */
    @JsonProperty("commitment")
    @JsonPropertyDescription("Whether the work was full time or part time")
    private String commitment;

    /**
     * ID
     * <p>
     * The work experience ID in the Apply system.
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The work experience ID in the Apply system.
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public Volunteering withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Organisation Name
     * <p>
     * The organisation worked for.
     * 
     */
    @JsonProperty("organisationName")
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * Organisation Name
     * <p>
     * The organisation worked for.
     * 
     */
    @JsonProperty("organisationName")
    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public Volunteering withOrganisationName(String organisationName) {
        this.organisationName = organisationName;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date the position began.
     * 
     */
    @JsonProperty("startDate")
    public Object getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * The date the position began.
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Volunteering withStartDate(Object startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date the position finished, if applicable.
     * 
     */
    @JsonProperty("endDate")
    public Object getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * The date the position finished, if applicable.
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Volunteering withEndDate(Object endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Role
     * <p>
     * The position held by the candidate.
     * 
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * Role
     * <p>
     * The position held by the candidate.
     * 
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public Volunteering withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Description
     * <p>
     * A written description of the work involved.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A written description of the work involved.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Volunteering withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Working With Children
     * <p>
     * Did this position involve working in a school or with children?
     * 
     */
    @JsonProperty("workingWithChildren")
    public Object getWorkingWithChildren() {
        return workingWithChildren;
    }

    /**
     * Working With Children
     * <p>
     * Did this position involve working in a school or with children?
     * 
     */
    @JsonProperty("workingWithChildren")
    public void setWorkingWithChildren(Object workingWithChildren) {
        this.workingWithChildren = workingWithChildren;
    }

    public Volunteering withWorkingWithChildren(Object workingWithChildren) {
        this.workingWithChildren = workingWithChildren;
        return this;
    }

    /**
     * Commitment
     * <p>
     * Whether the work was full time or part time
     * 
     */
    @JsonProperty("commitment")
    public String getCommitment() {
        return commitment;
    }

    /**
     * Commitment
     * <p>
     * Whether the work was full time or part time
     * 
     */
    @JsonProperty("commitment")
    public void setCommitment(String commitment) {
        this.commitment = commitment;
    }

    public Volunteering withCommitment(String commitment) {
        this.commitment = commitment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Volunteering.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("organisationName");
        sb.append('=');
        sb.append(((this.organisationName == null)?"<null>":this.organisationName));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("workingWithChildren");
        sb.append('=');
        sb.append(((this.workingWithChildren == null)?"<null>":this.workingWithChildren));
        sb.append(',');
        sb.append("commitment");
        sb.append('=');
        sb.append(((this.commitment == null)?"<null>":this.commitment));
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
        result = ((result* 31)+((this.organisationName == null)? 0 :this.organisationName.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.commitment == null)? 0 :this.commitment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.workingWithChildren == null)? 0 :this.workingWithChildren.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Volunteering) == false) {
            return false;
        }
        Volunteering rhs = ((Volunteering) other);
        return (((((((((this.organisationName == rhs.organisationName)||((this.organisationName!= null)&&this.organisationName.equals(rhs.organisationName)))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.commitment == rhs.commitment)||((this.commitment!= null)&&this.commitment.equals(rhs.commitment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.workingWithChildren == rhs.workingWithChildren)||((this.workingWithChildren!= null)&&this.workingWithChildren.equals(rhs.workingWithChildren))));
    }

}
