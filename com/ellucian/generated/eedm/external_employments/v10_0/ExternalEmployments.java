
package com.ellucian.generated.eedm.external_employments.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * External Employments
 * <p>
 * Information about applicants' or employees' previous employments.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "position",
    "organization",
    "startOn",
    "endOn",
    "compensation",
    "jobTitle",
    "jobDescription",
    "priority",
    "status",
    "hoursWorked",
    "vocations",
    "supervisors",
    "employeesSupervised",
    "leavingReason",
    "comment"
})
@Generated("jsonschema2pojo")
public class ExternalEmployments {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the external employment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the external employment.")
    private String id;
    /**
     * Person
     * <p>
     * The person associated with the external employment.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person associated with the external employment.")
    private Person person;
    /**
     * Position
     * <p>
     * The position associated with the external employment.
     * 
     */
    @JsonProperty("position")
    @JsonPropertyDescription("The position associated with the external employment.")
    private Object position;
    /**
     * Organization
     * <p>
     * The organization associated with the external employment.
     * (Required)
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("The organization associated with the external employment.")
    private Organization organization;
    /**
     * Start On
     * <p>
     * The start of employment at the organization.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start of employment at the organization.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The end of employment at the organization.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end of employment at the organization.")
    private Object endOn;
    /**
     * Compensation
     * <p>
     * The salary or wages earned.
     * 
     */
    @JsonProperty("compensation")
    @JsonPropertyDescription("The salary or wages earned.")
    private Object compensation;
    /**
     * Job Title
     * <p>
     * The job title for the external employment.
     * 
     */
    @JsonProperty("jobTitle")
    @JsonPropertyDescription("The job title for the external employment.")
    private String jobTitle;
    /**
     * Job Description
     * <p>
     * The job responsibilities of the external employment.
     * 
     */
    @JsonProperty("jobDescription")
    @JsonPropertyDescription("The job responsibilities of the external employment.")
    private String jobDescription;
    /**
     * Priority
     * <p>
     * An indication whether the position was considered as primary for the employee.
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("An indication whether the position was considered as primary for the employee.")
    private Object priority;
    /**
     * Status
     * <p>
     * The status of the external employment.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the external employment.")
    private Object status;
    /**
     * Hours Worked
     * <p>
     * The number of hours the person worked per period.
     * 
     */
    @JsonProperty("hoursWorked")
    @JsonPropertyDescription("The number of hours the person worked per period.")
    private Object hoursWorked;
    /**
     * Vocations
     * <p>
     * The vocations associated with the external employment.
     * 
     */
    @JsonProperty("vocations")
    @JsonPropertyDescription("The vocations associated with the external employment.")
    private List<Vocation> vocations = new ArrayList<Vocation>();
    /**
     * Supervisors
     * <p>
     * The supervisors of the person for the external employment.
     * 
     */
    @JsonProperty("supervisors")
    @JsonPropertyDescription("The supervisors of the person for the external employment.")
    private List<Supervisor> supervisors = new ArrayList<Supervisor>();
    /**
     * Employees Supervised
     * <p>
     * The number of employees supervised.
     * 
     */
    @JsonProperty("employeesSupervised")
    @JsonPropertyDescription("The number of employees supervised.")
    private Object employeesSupervised;
    /**
     * Leaving Reason
     * <p>
     * The reason given for leaving the external employment.
     * 
     */
    @JsonProperty("leavingReason")
    @JsonPropertyDescription("The reason given for leaving the external employment.")
    private String leavingReason;
    /**
     * Comment
     * <p>
     * Any comment associated with the external employment.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Any comment associated with the external employment.")
    private String comment;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public ExternalEmployments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the external employment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the external employment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ExternalEmployments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person associated with the external employment.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The person associated with the external employment.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public ExternalEmployments withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Position
     * <p>
     * The position associated with the external employment.
     * 
     */
    @JsonProperty("position")
    public Object getPosition() {
        return position;
    }

    /**
     * Position
     * <p>
     * The position associated with the external employment.
     * 
     */
    @JsonProperty("position")
    public void setPosition(Object position) {
        this.position = position;
    }

    public ExternalEmployments withPosition(Object position) {
        this.position = position;
        return this;
    }

    /**
     * Organization
     * <p>
     * The organization associated with the external employment.
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Organization
     * <p>
     * The organization associated with the external employment.
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public ExternalEmployments withOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start of employment at the organization.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start of employment at the organization.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public ExternalEmployments withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end of employment at the organization.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end of employment at the organization.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public ExternalEmployments withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Compensation
     * <p>
     * The salary or wages earned.
     * 
     */
    @JsonProperty("compensation")
    public Object getCompensation() {
        return compensation;
    }

    /**
     * Compensation
     * <p>
     * The salary or wages earned.
     * 
     */
    @JsonProperty("compensation")
    public void setCompensation(Object compensation) {
        this.compensation = compensation;
    }

    public ExternalEmployments withCompensation(Object compensation) {
        this.compensation = compensation;
        return this;
    }

    /**
     * Job Title
     * <p>
     * The job title for the external employment.
     * 
     */
    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Job Title
     * <p>
     * The job title for the external employment.
     * 
     */
    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public ExternalEmployments withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Job Description
     * <p>
     * The job responsibilities of the external employment.
     * 
     */
    @JsonProperty("jobDescription")
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * Job Description
     * <p>
     * The job responsibilities of the external employment.
     * 
     */
    @JsonProperty("jobDescription")
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public ExternalEmployments withJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }

    /**
     * Priority
     * <p>
     * An indication whether the position was considered as primary for the employee.
     * 
     */
    @JsonProperty("priority")
    public Object getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * An indication whether the position was considered as primary for the employee.
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public ExternalEmployments withPriority(Object priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the external employment.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the external employment.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public ExternalEmployments withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Hours Worked
     * <p>
     * The number of hours the person worked per period.
     * 
     */
    @JsonProperty("hoursWorked")
    public Object getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Hours Worked
     * <p>
     * The number of hours the person worked per period.
     * 
     */
    @JsonProperty("hoursWorked")
    public void setHoursWorked(Object hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public ExternalEmployments withHoursWorked(Object hoursWorked) {
        this.hoursWorked = hoursWorked;
        return this;
    }

    /**
     * Vocations
     * <p>
     * The vocations associated with the external employment.
     * 
     */
    @JsonProperty("vocations")
    public List<Vocation> getVocations() {
        return vocations;
    }

    /**
     * Vocations
     * <p>
     * The vocations associated with the external employment.
     * 
     */
    @JsonProperty("vocations")
    public void setVocations(List<Vocation> vocations) {
        this.vocations = vocations;
    }

    public ExternalEmployments withVocations(List<Vocation> vocations) {
        this.vocations = vocations;
        return this;
    }

    /**
     * Supervisors
     * <p>
     * The supervisors of the person for the external employment.
     * 
     */
    @JsonProperty("supervisors")
    public List<Supervisor> getSupervisors() {
        return supervisors;
    }

    /**
     * Supervisors
     * <p>
     * The supervisors of the person for the external employment.
     * 
     */
    @JsonProperty("supervisors")
    public void setSupervisors(List<Supervisor> supervisors) {
        this.supervisors = supervisors;
    }

    public ExternalEmployments withSupervisors(List<Supervisor> supervisors) {
        this.supervisors = supervisors;
        return this;
    }

    /**
     * Employees Supervised
     * <p>
     * The number of employees supervised.
     * 
     */
    @JsonProperty("employeesSupervised")
    public Object getEmployeesSupervised() {
        return employeesSupervised;
    }

    /**
     * Employees Supervised
     * <p>
     * The number of employees supervised.
     * 
     */
    @JsonProperty("employeesSupervised")
    public void setEmployeesSupervised(Object employeesSupervised) {
        this.employeesSupervised = employeesSupervised;
    }

    public ExternalEmployments withEmployeesSupervised(Object employeesSupervised) {
        this.employeesSupervised = employeesSupervised;
        return this;
    }

    /**
     * Leaving Reason
     * <p>
     * The reason given for leaving the external employment.
     * 
     */
    @JsonProperty("leavingReason")
    public String getLeavingReason() {
        return leavingReason;
    }

    /**
     * Leaving Reason
     * <p>
     * The reason given for leaving the external employment.
     * 
     */
    @JsonProperty("leavingReason")
    public void setLeavingReason(String leavingReason) {
        this.leavingReason = leavingReason;
    }

    public ExternalEmployments withLeavingReason(String leavingReason) {
        this.leavingReason = leavingReason;
        return this;
    }

    /**
     * Comment
     * <p>
     * Any comment associated with the external employment.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Any comment associated with the external employment.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ExternalEmployments withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalEmployments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("compensation");
        sb.append('=');
        sb.append(((this.compensation == null)?"<null>":this.compensation));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("jobDescription");
        sb.append('=');
        sb.append(((this.jobDescription == null)?"<null>":this.jobDescription));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("hoursWorked");
        sb.append('=');
        sb.append(((this.hoursWorked == null)?"<null>":this.hoursWorked));
        sb.append(',');
        sb.append("vocations");
        sb.append('=');
        sb.append(((this.vocations == null)?"<null>":this.vocations));
        sb.append(',');
        sb.append("supervisors");
        sb.append('=');
        sb.append(((this.supervisors == null)?"<null>":this.supervisors));
        sb.append(',');
        sb.append("employeesSupervised");
        sb.append('=');
        sb.append(((this.employeesSupervised == null)?"<null>":this.employeesSupervised));
        sb.append(',');
        sb.append("leavingReason");
        sb.append('=');
        sb.append(((this.leavingReason == null)?"<null>":this.leavingReason));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.leavingReason == null)? 0 :this.leavingReason.hashCode()));
        result = ((result* 31)+((this.jobTitle == null)? 0 :this.jobTitle.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.vocations == null)? 0 :this.vocations.hashCode()));
        result = ((result* 31)+((this.compensation == null)? 0 :this.compensation.hashCode()));
        result = ((result* 31)+((this.jobDescription == null)? 0 :this.jobDescription.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        result = ((result* 31)+((this.employeesSupervised == null)? 0 :this.employeesSupervised.hashCode()));
        result = ((result* 31)+((this.hoursWorked == null)? 0 :this.hoursWorked.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.supervisors == null)? 0 :this.supervisors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalEmployments) == false) {
            return false;
        }
        ExternalEmployments rhs = ((ExternalEmployments) other);
        return (((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.leavingReason == rhs.leavingReason)||((this.leavingReason!= null)&&this.leavingReason.equals(rhs.leavingReason))))&&((this.jobTitle == rhs.jobTitle)||((this.jobTitle!= null)&&this.jobTitle.equals(rhs.jobTitle))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.vocations == rhs.vocations)||((this.vocations!= null)&&this.vocations.equals(rhs.vocations))))&&((this.compensation == rhs.compensation)||((this.compensation!= null)&&this.compensation.equals(rhs.compensation))))&&((this.jobDescription == rhs.jobDescription)||((this.jobDescription!= null)&&this.jobDescription.equals(rhs.jobDescription))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))))&&((this.employeesSupervised == rhs.employeesSupervised)||((this.employeesSupervised!= null)&&this.employeesSupervised.equals(rhs.employeesSupervised))))&&((this.hoursWorked == rhs.hoursWorked)||((this.hoursWorked!= null)&&this.hoursWorked.equals(rhs.hoursWorked))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.supervisors == rhs.supervisors)||((this.supervisors!= null)&&this.supervisors.equals(rhs.supervisors))));
    }

}
