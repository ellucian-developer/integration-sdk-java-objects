
package com.ellucian.generated.eedm.institution_jobs.v8_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Institution Jobs
 * <p>
 * A detailed description of the job at an institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "employer",
    "position",
    "department",
    "startOn",
    "endOn",
    "jobChangeReason",
    "accountingStrings",
    "status",
    "payStatus",
    "benefitsStatus",
    "hoursPerPeriod",
    "fullTimeEquivalent",
    "appointmentPercentage",
    "supervisors",
    "salary",
    "classification",
    "preference"
})
@Generated("jsonschema2pojo")
public class InstitutionJobs {

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
     * The global identifier of the institution job.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the institution job.")
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
     * The operational unit of the institution to which the job belongs.
     * (Required)
     * 
     */
    @JsonProperty("employer")
    @JsonPropertyDescription("The operational unit of the institution to which the job belongs.")
    private Employer employer;
    /**
     * Position
     * <p>
     * The position associated with the job.
     * (Required)
     * 
     */
    @JsonProperty("position")
    @JsonPropertyDescription("The position associated with the job.")
    private Position position;
    /**
     * Department
     * <p>
     * The department of the institution to which the job belongs.
     * (Required)
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("The department of the institution to which the job belongs.")
    private String department;
    /**
     * Start On
     * <p>
     * The first day of the job.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first day of the job.")
    private String startOn;
    /**
     * End On
     * <p>
     * The last day of the job.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last day of the job.")
    private Object endOn;
    /**
     * Job Change Reason
     * <p>
     * The reason associated with the change of job.
     * 
     */
    @JsonProperty("jobChangeReason")
    @JsonPropertyDescription("The reason associated with the change of job.")
    private Object jobChangeReason;
    /**
     * Accounting Strings
     * <p>
     * The accounting strings associated with the job.
     * 
     */
    @JsonProperty("accountingStrings")
    @JsonPropertyDescription("The accounting strings associated with the job.")
    private List<String> accountingStrings = new ArrayList<String>();
    /**
     * Status
     * <p>
     * The status of the employee on the job.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the employee on the job.")
    private InstitutionJobs.Status status;
    /**
     * Pay Status
     * <p>
     * The pay status of the employee.
     * 
     */
    @JsonProperty("payStatus")
    @JsonPropertyDescription("The pay status of the employee.")
    private Object payStatus;
    /**
     * Benefits Status
     * <p>
     * The benefit status of the employee.
     * 
     */
    @JsonProperty("benefitsStatus")
    @JsonPropertyDescription("The benefit status of the employee.")
    private Object benefitsStatus;
    /**
     * Hours Per Period
     * <p>
     * The number of hours of work in specified time periods.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    @JsonPropertyDescription("The number of hours of work in specified time periods.")
    private List<HoursPerPeriod> hoursPerPeriod = new ArrayList<HoursPerPeriod>();
    /**
     * Full Time Equivalent
     * <p>
     * The ratio of hours of work for the position to the hours of work expected of a full-time employee.
     * 
     */
    @JsonProperty("fullTimeEquivalent")
    @JsonPropertyDescription("The ratio of hours of work for the position to the hours of work expected of a full-time employee.")
    private Object fullTimeEquivalent;
    /**
     * Appointment Percentage
     * <p>
     * The percentage of the position filled by the employee.
     * 
     */
    @JsonProperty("appointmentPercentage")
    @JsonPropertyDescription("The percentage of the position filled by the employee.")
    private Object appointmentPercentage;
    /**
     * Supervisors
     * <p>
     * The supervisor associated with the job.
     * 
     */
    @JsonProperty("supervisors")
    @JsonPropertyDescription("The supervisor associated with the job.")
    private List<Supervisor> supervisors = new ArrayList<Supervisor>();
    /**
     * Salary
     * <p>
     * The details of the salary associated with the job.
     * 
     */
    @JsonProperty("salary")
    @JsonPropertyDescription("The details of the salary associated with the job.")
    private Salary salary;
    /**
     * Classification
     * <p>
     * The employment classification of the job.
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("The employment classification of the job.")
    private Object classification;
    /**
     * Preference
     * <p>
     * The preference for a job (primary).
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("The preference for a job (primary).")
    private Object preference;

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

    public InstitutionJobs withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the institution job.
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
     * The global identifier of the institution job.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public InstitutionJobs withId(String id) {
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

    public InstitutionJobs withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Employer
     * <p>
     * The operational unit of the institution to which the job belongs.
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
     * The operational unit of the institution to which the job belongs.
     * (Required)
     * 
     */
    @JsonProperty("employer")
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public InstitutionJobs withEmployer(Employer employer) {
        this.employer = employer;
        return this;
    }

    /**
     * Position
     * <p>
     * The position associated with the job.
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
     * The position associated with the job.
     * (Required)
     * 
     */
    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    public InstitutionJobs withPosition(Position position) {
        this.position = position;
        return this;
    }

    /**
     * Department
     * <p>
     * The department of the institution to which the job belongs.
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
     * The department of the institution to which the job belongs.
     * (Required)
     * 
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public InstitutionJobs withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first day of the job.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first day of the job.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public InstitutionJobs withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last day of the job.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last day of the job.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public InstitutionJobs withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Job Change Reason
     * <p>
     * The reason associated with the change of job.
     * 
     */
    @JsonProperty("jobChangeReason")
    public Object getJobChangeReason() {
        return jobChangeReason;
    }

    /**
     * Job Change Reason
     * <p>
     * The reason associated with the change of job.
     * 
     */
    @JsonProperty("jobChangeReason")
    public void setJobChangeReason(Object jobChangeReason) {
        this.jobChangeReason = jobChangeReason;
    }

    public InstitutionJobs withJobChangeReason(Object jobChangeReason) {
        this.jobChangeReason = jobChangeReason;
        return this;
    }

    /**
     * Accounting Strings
     * <p>
     * The accounting strings associated with the job.
     * 
     */
    @JsonProperty("accountingStrings")
    public List<String> getAccountingStrings() {
        return accountingStrings;
    }

    /**
     * Accounting Strings
     * <p>
     * The accounting strings associated with the job.
     * 
     */
    @JsonProperty("accountingStrings")
    public void setAccountingStrings(List<String> accountingStrings) {
        this.accountingStrings = accountingStrings;
    }

    public InstitutionJobs withAccountingStrings(List<String> accountingStrings) {
        this.accountingStrings = accountingStrings;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the employee on the job.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public InstitutionJobs.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the employee on the job.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(InstitutionJobs.Status status) {
        this.status = status;
    }

    public InstitutionJobs withStatus(InstitutionJobs.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Pay Status
     * <p>
     * The pay status of the employee.
     * 
     */
    @JsonProperty("payStatus")
    public Object getPayStatus() {
        return payStatus;
    }

    /**
     * Pay Status
     * <p>
     * The pay status of the employee.
     * 
     */
    @JsonProperty("payStatus")
    public void setPayStatus(Object payStatus) {
        this.payStatus = payStatus;
    }

    public InstitutionJobs withPayStatus(Object payStatus) {
        this.payStatus = payStatus;
        return this;
    }

    /**
     * Benefits Status
     * <p>
     * The benefit status of the employee.
     * 
     */
    @JsonProperty("benefitsStatus")
    public Object getBenefitsStatus() {
        return benefitsStatus;
    }

    /**
     * Benefits Status
     * <p>
     * The benefit status of the employee.
     * 
     */
    @JsonProperty("benefitsStatus")
    public void setBenefitsStatus(Object benefitsStatus) {
        this.benefitsStatus = benefitsStatus;
    }

    public InstitutionJobs withBenefitsStatus(Object benefitsStatus) {
        this.benefitsStatus = benefitsStatus;
        return this;
    }

    /**
     * Hours Per Period
     * <p>
     * The number of hours of work in specified time periods.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    public List<HoursPerPeriod> getHoursPerPeriod() {
        return hoursPerPeriod;
    }

    /**
     * Hours Per Period
     * <p>
     * The number of hours of work in specified time periods.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    public void setHoursPerPeriod(List<HoursPerPeriod> hoursPerPeriod) {
        this.hoursPerPeriod = hoursPerPeriod;
    }

    public InstitutionJobs withHoursPerPeriod(List<HoursPerPeriod> hoursPerPeriod) {
        this.hoursPerPeriod = hoursPerPeriod;
        return this;
    }

    /**
     * Full Time Equivalent
     * <p>
     * The ratio of hours of work for the position to the hours of work expected of a full-time employee.
     * 
     */
    @JsonProperty("fullTimeEquivalent")
    public Object getFullTimeEquivalent() {
        return fullTimeEquivalent;
    }

    /**
     * Full Time Equivalent
     * <p>
     * The ratio of hours of work for the position to the hours of work expected of a full-time employee.
     * 
     */
    @JsonProperty("fullTimeEquivalent")
    public void setFullTimeEquivalent(Object fullTimeEquivalent) {
        this.fullTimeEquivalent = fullTimeEquivalent;
    }

    public InstitutionJobs withFullTimeEquivalent(Object fullTimeEquivalent) {
        this.fullTimeEquivalent = fullTimeEquivalent;
        return this;
    }

    /**
     * Appointment Percentage
     * <p>
     * The percentage of the position filled by the employee.
     * 
     */
    @JsonProperty("appointmentPercentage")
    public Object getAppointmentPercentage() {
        return appointmentPercentage;
    }

    /**
     * Appointment Percentage
     * <p>
     * The percentage of the position filled by the employee.
     * 
     */
    @JsonProperty("appointmentPercentage")
    public void setAppointmentPercentage(Object appointmentPercentage) {
        this.appointmentPercentage = appointmentPercentage;
    }

    public InstitutionJobs withAppointmentPercentage(Object appointmentPercentage) {
        this.appointmentPercentage = appointmentPercentage;
        return this;
    }

    /**
     * Supervisors
     * <p>
     * The supervisor associated with the job.
     * 
     */
    @JsonProperty("supervisors")
    public List<Supervisor> getSupervisors() {
        return supervisors;
    }

    /**
     * Supervisors
     * <p>
     * The supervisor associated with the job.
     * 
     */
    @JsonProperty("supervisors")
    public void setSupervisors(List<Supervisor> supervisors) {
        this.supervisors = supervisors;
    }

    public InstitutionJobs withSupervisors(List<Supervisor> supervisors) {
        this.supervisors = supervisors;
        return this;
    }

    /**
     * Salary
     * <p>
     * The details of the salary associated with the job.
     * 
     */
    @JsonProperty("salary")
    public Salary getSalary() {
        return salary;
    }

    /**
     * Salary
     * <p>
     * The details of the salary associated with the job.
     * 
     */
    @JsonProperty("salary")
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public InstitutionJobs withSalary(Salary salary) {
        this.salary = salary;
        return this;
    }

    /**
     * Classification
     * <p>
     * The employment classification of the job.
     * 
     */
    @JsonProperty("classification")
    public Object getClassification() {
        return classification;
    }

    /**
     * Classification
     * <p>
     * The employment classification of the job.
     * 
     */
    @JsonProperty("classification")
    public void setClassification(Object classification) {
        this.classification = classification;
    }

    public InstitutionJobs withClassification(Object classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Preference
     * <p>
     * The preference for a job (primary).
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preference
     * <p>
     * The preference for a job (primary).
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public InstitutionJobs withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstitutionJobs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("jobChangeReason");
        sb.append('=');
        sb.append(((this.jobChangeReason == null)?"<null>":this.jobChangeReason));
        sb.append(',');
        sb.append("accountingStrings");
        sb.append('=');
        sb.append(((this.accountingStrings == null)?"<null>":this.accountingStrings));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("payStatus");
        sb.append('=');
        sb.append(((this.payStatus == null)?"<null>":this.payStatus));
        sb.append(',');
        sb.append("benefitsStatus");
        sb.append('=');
        sb.append(((this.benefitsStatus == null)?"<null>":this.benefitsStatus));
        sb.append(',');
        sb.append("hoursPerPeriod");
        sb.append('=');
        sb.append(((this.hoursPerPeriod == null)?"<null>":this.hoursPerPeriod));
        sb.append(',');
        sb.append("fullTimeEquivalent");
        sb.append('=');
        sb.append(((this.fullTimeEquivalent == null)?"<null>":this.fullTimeEquivalent));
        sb.append(',');
        sb.append("appointmentPercentage");
        sb.append('=');
        sb.append(((this.appointmentPercentage == null)?"<null>":this.appointmentPercentage));
        sb.append(',');
        sb.append("supervisors");
        sb.append('=');
        sb.append(((this.supervisors == null)?"<null>":this.supervisors));
        sb.append(',');
        sb.append("salary");
        sb.append('=');
        sb.append(((this.salary == null)?"<null>":this.salary));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.benefitsStatus == null)? 0 :this.benefitsStatus.hashCode()));
        result = ((result* 31)+((this.salary == null)? 0 :this.salary.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        result = ((result* 31)+((this.appointmentPercentage == null)? 0 :this.appointmentPercentage.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.hoursPerPeriod == null)? 0 :this.hoursPerPeriod.hashCode()));
        result = ((result* 31)+((this.employer == null)? 0 :this.employer.hashCode()));
        result = ((result* 31)+((this.jobChangeReason == null)? 0 :this.jobChangeReason.hashCode()));
        result = ((result* 31)+((this.fullTimeEquivalent == null)? 0 :this.fullTimeEquivalent.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.accountingStrings == null)? 0 :this.accountingStrings.hashCode()));
        result = ((result* 31)+((this.payStatus == null)? 0 :this.payStatus.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.supervisors == null)? 0 :this.supervisors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstitutionJobs) == false) {
            return false;
        }
        InstitutionJobs rhs = ((InstitutionJobs) other);
        return (((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.benefitsStatus == rhs.benefitsStatus)||((this.benefitsStatus!= null)&&this.benefitsStatus.equals(rhs.benefitsStatus))))&&((this.salary == rhs.salary)||((this.salary!= null)&&this.salary.equals(rhs.salary))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))))&&((this.appointmentPercentage == rhs.appointmentPercentage)||((this.appointmentPercentage!= null)&&this.appointmentPercentage.equals(rhs.appointmentPercentage))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.hoursPerPeriod == rhs.hoursPerPeriod)||((this.hoursPerPeriod!= null)&&this.hoursPerPeriod.equals(rhs.hoursPerPeriod))))&&((this.employer == rhs.employer)||((this.employer!= null)&&this.employer.equals(rhs.employer))))&&((this.jobChangeReason == rhs.jobChangeReason)||((this.jobChangeReason!= null)&&this.jobChangeReason.equals(rhs.jobChangeReason))))&&((this.fullTimeEquivalent == rhs.fullTimeEquivalent)||((this.fullTimeEquivalent!= null)&&this.fullTimeEquivalent.equals(rhs.fullTimeEquivalent))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.accountingStrings == rhs.accountingStrings)||((this.accountingStrings!= null)&&this.accountingStrings.equals(rhs.accountingStrings))))&&((this.payStatus == rhs.payStatus)||((this.payStatus!= null)&&this.payStatus.equals(rhs.payStatus))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.supervisors == rhs.supervisors)||((this.supervisors!= null)&&this.supervisors.equals(rhs.supervisors))));
    }


    /**
     * Status
     * <p>
     * The status of the employee on the job.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        ENDED("ended"),
        LEAVE("leave");
        private final String value;
        private final static Map<String, InstitutionJobs.Status> CONSTANTS = new HashMap<String, InstitutionJobs.Status>();

        static {
            for (InstitutionJobs.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static InstitutionJobs.Status fromValue(String value) {
            InstitutionJobs.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
