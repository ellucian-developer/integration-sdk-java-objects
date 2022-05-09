
package com.ellucian.generated.eedm.institution_job_supervisors.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Institution Job Supervisors
 * <p>
 * Information about the supervisors associated with jobs at the institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "person",
    "employer",
    "position",
    "department",
    "supervisors"
})
@Generated("jsonschema2pojo")
public class InstitutionJobSupervisors {

    /**
     * ID
     * <p>
     * The global identifier of the institution job supervisor.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the institution job supervisor.")
    private String id;
    /**
     * Person
     * <p>
     * The employee to which the job is associated.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The employee to which the job is associated.")
    private Person person;
    /**
     * Employer
     * <p>
     * The institution for which the employee works.
     * (Required)
     * 
     */
    @JsonProperty("employer")
    @JsonPropertyDescription("The institution for which the employee works.")
    private Employer employer;
    /**
     * Position
     * <p>
     * The position associated with the employee.
     * (Required)
     * 
     */
    @JsonProperty("position")
    @JsonPropertyDescription("The position associated with the employee.")
    private Position position;
    /**
     * Department
     * <p>
     * The department of the institution to which the employee belongs.
     * (Required)
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("The department of the institution to which the employee belongs.")
    private String department;
    /**
     * Supervisors
     * <p>
     * The supervisors associated with the employee's job.
     * 
     */
    @JsonProperty("supervisors")
    @JsonPropertyDescription("The supervisors associated with the employee's job.")
    private List<Supervisor> supervisors = new ArrayList<Supervisor>();

    /**
     * ID
     * <p>
     * The global identifier of the institution job supervisor.
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
     * The global identifier of the institution job supervisor.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public InstitutionJobSupervisors withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The employee to which the job is associated.
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
     * The employee to which the job is associated.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public InstitutionJobSupervisors withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Employer
     * <p>
     * The institution for which the employee works.
     * (Required)
     * 
     */
    @JsonProperty("employer")
    public Employer getEmployer() {
        return employer;
    }

    /**
     * Employer
     * <p>
     * The institution for which the employee works.
     * (Required)
     * 
     */
    @JsonProperty("employer")
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public InstitutionJobSupervisors withEmployer(Employer employer) {
        this.employer = employer;
        return this;
    }

    /**
     * Position
     * <p>
     * The position associated with the employee.
     * (Required)
     * 
     */
    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    /**
     * Position
     * <p>
     * The position associated with the employee.
     * (Required)
     * 
     */
    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    public InstitutionJobSupervisors withPosition(Position position) {
        this.position = position;
        return this;
    }

    /**
     * Department
     * <p>
     * The department of the institution to which the employee belongs.
     * (Required)
     * 
     */
    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    /**
     * Department
     * <p>
     * The department of the institution to which the employee belongs.
     * (Required)
     * 
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public InstitutionJobSupervisors withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Supervisors
     * <p>
     * The supervisors associated with the employee's job.
     * 
     */
    @JsonProperty("supervisors")
    public List<Supervisor> getSupervisors() {
        return supervisors;
    }

    /**
     * Supervisors
     * <p>
     * The supervisors associated with the employee's job.
     * 
     */
    @JsonProperty("supervisors")
    public void setSupervisors(List<Supervisor> supervisors) {
        this.supervisors = supervisors;
    }

    public InstitutionJobSupervisors withSupervisors(List<Supervisor> supervisors) {
        this.supervisors = supervisors;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstitutionJobSupervisors.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("employer");
        sb.append('=');
        sb.append(((this.employer == null)?"<null>":this.employer));
        sb.append(',');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("supervisors");
        sb.append('=');
        sb.append(((this.supervisors == null)?"<null>":this.supervisors));
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
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.employer == null)? 0 :this.employer.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.supervisors == null)? 0 :this.supervisors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstitutionJobSupervisors) == false) {
            return false;
        }
        InstitutionJobSupervisors rhs = ((InstitutionJobSupervisors) other);
        return (((((((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person)))&&((this.employer == rhs.employer)||((this.employer!= null)&&this.employer.equals(rhs.employer))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.supervisors == rhs.supervisors)||((this.supervisors!= null)&&this.supervisors.equals(rhs.supervisors))));
    }

}
