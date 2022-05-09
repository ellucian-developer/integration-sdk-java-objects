
package com.ellucian.generated.eedm.job_applications.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Job Applications
 * <p>
 * Information about applications for employment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "position",
    "desiredCompensation",
    "employmentPreference",
    "status",
    "source",
    "appliedOn"
})
@Generated("jsonschema2pojo")
public class JobApplications {

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
     * The global identifier of the job application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the job application.")
    private String id;
    /**
     * Person
     * <p>
     * The person applying for employment.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person applying for employment.")
    private Person person;
    /**
     * Position
     * <p>
     * The position associated with the application.
     * 
     */
    @JsonProperty("position")
    @JsonPropertyDescription("The position associated with the application.")
    private Object position;
    /**
     * Desired Compensation
     * <p>
     * The applicant's desired compensation.
     * 
     */
    @JsonProperty("desiredCompensation")
    @JsonPropertyDescription("The applicant's desired compensation.")
    private Object desiredCompensation;
    /**
     * Employment Preference
     * <p>
     * The preference of employment (e.g. full-time, part-time and no preference).
     * 
     */
    @JsonProperty("employmentPreference")
    @JsonPropertyDescription("The preference of employment (e.g. full-time, part-time and no preference).")
    private Object employmentPreference;
    /**
     * Status
     * <p>
     * The status of the job application.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the job application.")
    private Object status;
    /**
     * Source
     * <p>
     * The source of information for the employment opportunity.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of information for the employment opportunity.")
    private Object source;
    /**
     * Applied On
     * <p>
     * The date when the application was submitted.
     * 
     */
    @JsonProperty("appliedOn")
    @JsonPropertyDescription("The date when the application was submitted.")
    private Object appliedOn;

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

    public JobApplications withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the job application.
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
     * The global identifier of the job application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public JobApplications withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person applying for employment.
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
     * The person applying for employment.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public JobApplications withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Position
     * <p>
     * The position associated with the application.
     * 
     */
    @JsonProperty("position")
    public Object getPosition() {
        return position;
    }

    /**
     * Position
     * <p>
     * The position associated with the application.
     * 
     */
    @JsonProperty("position")
    public void setPosition(Object position) {
        this.position = position;
    }

    public JobApplications withPosition(Object position) {
        this.position = position;
        return this;
    }

    /**
     * Desired Compensation
     * <p>
     * The applicant's desired compensation.
     * 
     */
    @JsonProperty("desiredCompensation")
    public Object getDesiredCompensation() {
        return desiredCompensation;
    }

    /**
     * Desired Compensation
     * <p>
     * The applicant's desired compensation.
     * 
     */
    @JsonProperty("desiredCompensation")
    public void setDesiredCompensation(Object desiredCompensation) {
        this.desiredCompensation = desiredCompensation;
    }

    public JobApplications withDesiredCompensation(Object desiredCompensation) {
        this.desiredCompensation = desiredCompensation;
        return this;
    }

    /**
     * Employment Preference
     * <p>
     * The preference of employment (e.g. full-time, part-time and no preference).
     * 
     */
    @JsonProperty("employmentPreference")
    public Object getEmploymentPreference() {
        return employmentPreference;
    }

    /**
     * Employment Preference
     * <p>
     * The preference of employment (e.g. full-time, part-time and no preference).
     * 
     */
    @JsonProperty("employmentPreference")
    public void setEmploymentPreference(Object employmentPreference) {
        this.employmentPreference = employmentPreference;
    }

    public JobApplications withEmploymentPreference(Object employmentPreference) {
        this.employmentPreference = employmentPreference;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the job application.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the job application.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public JobApplications withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of information for the employment opportunity.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of information for the employment opportunity.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public JobApplications withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Applied On
     * <p>
     * The date when the application was submitted.
     * 
     */
    @JsonProperty("appliedOn")
    public Object getAppliedOn() {
        return appliedOn;
    }

    /**
     * Applied On
     * <p>
     * The date when the application was submitted.
     * 
     */
    @JsonProperty("appliedOn")
    public void setAppliedOn(Object appliedOn) {
        this.appliedOn = appliedOn;
    }

    public JobApplications withAppliedOn(Object appliedOn) {
        this.appliedOn = appliedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobApplications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("desiredCompensation");
        sb.append('=');
        sb.append(((this.desiredCompensation == null)?"<null>":this.desiredCompensation));
        sb.append(',');
        sb.append("employmentPreference");
        sb.append('=');
        sb.append(((this.employmentPreference == null)?"<null>":this.employmentPreference));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("appliedOn");
        sb.append('=');
        sb.append(((this.appliedOn == null)?"<null>":this.appliedOn));
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
        result = ((result* 31)+((this.appliedOn == null)? 0 :this.appliedOn.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        result = ((result* 31)+((this.desiredCompensation == null)? 0 :this.desiredCompensation.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.employmentPreference == null)? 0 :this.employmentPreference.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobApplications) == false) {
            return false;
        }
        JobApplications rhs = ((JobApplications) other);
        return ((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.appliedOn == rhs.appliedOn)||((this.appliedOn!= null)&&this.appliedOn.equals(rhs.appliedOn))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))))&&((this.desiredCompensation == rhs.desiredCompensation)||((this.desiredCompensation!= null)&&this.desiredCompensation.equals(rhs.desiredCompensation))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.employmentPreference == rhs.employmentPreference)||((this.employmentPreference!= null)&&this.employmentPreference.equals(rhs.employmentPreference))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
