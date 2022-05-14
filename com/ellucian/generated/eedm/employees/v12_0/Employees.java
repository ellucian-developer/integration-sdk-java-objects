
package com.ellucian.generated.eedm.employees.v12_0;

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
 * Employees
 * <p>
 * Information about persons employed in the institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "campus",
    "homeOrganization",
    "contract",
    "payClass",
    "payStatus",
    "benefitsStatus",
    "hoursPerPeriod",
    "status",
    "startOn",
    "endOn",
    "terminationReason",
    "rehireableStatus",
    "leaveReason"
})
@Generated("jsonschema2pojo")
public class Employees {

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
     * The global identifier of the employee.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the employee.")
    private String id;
    /**
     * Person
     * <p>
     * A reference to link an employee to the common persons entity.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("A reference to link an employee to the common persons entity.")
    private Person person;
    /**
     * Campus
     * <p>
     * The physical location assigned to an employee.
     * 
     */
    @JsonProperty("campus")
    @JsonPropertyDescription("The physical location assigned to an employee.")
    private Object campus;
    /**
     * Home Organization
     * <p>
     * The home organization of the employee.
     * 
     */
    @JsonProperty("homeOrganization")
    @JsonPropertyDescription("The home organization of the employee.")
    private Object homeOrganization;
    /**
     * Contract
     * <p>
     * The detail associated with the contract.
     * (Required)
     * 
     */
    @JsonProperty("contract")
    @JsonPropertyDescription("The detail associated with the contract.")
    private Contract contract;
    /**
     * Pay Class
     * <p>
     * The classification assigned to the employee, or their primary job, that may impact payroll processing such as time entry methods, earning types and pay periods.
     * 
     */
    @JsonProperty("payClass")
    @JsonPropertyDescription("The classification assigned to the employee, or their primary job, that may impact payroll processing such as time entry methods, earning types and pay periods.")
    private Object payClass;
    /**
     * Pay Status
     * <p>
     * The pay status of the employee (e.g. with pay, without pay or partial pay).
     * 
     */
    @JsonProperty("payStatus")
    @JsonPropertyDescription("The pay status of the employee (e.g. with pay, without pay or partial pay).")
    private Object payStatus;
    /**
     * Benefits Status
     * <p>
     * The benefits status of the employee (e.g. with or without benefits).
     * 
     */
    @JsonProperty("benefitsStatus")
    @JsonPropertyDescription("The benefits status of the employee (e.g. with or without benefits).")
    private Object benefitsStatus;
    /**
     * Hours Per Period
     * <p>
     * The number of hours worked per period.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    @JsonPropertyDescription("The number of hours worked per period.")
    private List<HoursPerPeriod> hoursPerPeriod = new ArrayList<HoursPerPeriod>();
    /**
     * Status
     * <p>
     * The employment status (e.g. active, terminated or on leave).
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The employment status (e.g. active, terminated or on leave).")
    private Employees.Status status;
    /**
     * Start On
     * <p>
     * The first date of employment.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date of employment.")
    private String startOn;
    /**
     * End On
     * <p>
     * The last date of employment.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date of employment.")
    private Object endOn;
    /**
     * Termination Reason
     * <p>
     * The reason for employment termination.
     * 
     */
    @JsonProperty("terminationReason")
    @JsonPropertyDescription("The reason for employment termination.")
    private Object terminationReason;
    /**
     * Rehireable Status
     * <p>
     * The eligibility status for being rehired.
     * 
     */
    @JsonProperty("rehireableStatus")
    @JsonPropertyDescription("The eligibility status for being rehired.")
    private Object rehireableStatus;
    /**
     * Leave Reason
     * <p>
     * The reason for leave of absence.
     * 
     */
    @JsonProperty("leaveReason")
    @JsonPropertyDescription("The reason for leave of absence.")
    private Object leaveReason;

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

    public Employees withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the employee.
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
     * The global identifier of the employee.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Employees withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * A reference to link an employee to the common persons entity.
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
     * A reference to link an employee to the common persons entity.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public Employees withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Campus
     * <p>
     * The physical location assigned to an employee.
     * 
     */
    @JsonProperty("campus")
    public Object getCampus() {
        return campus;
    }

    /**
     * Campus
     * <p>
     * The physical location assigned to an employee.
     * 
     */
    @JsonProperty("campus")
    public void setCampus(Object campus) {
        this.campus = campus;
    }

    public Employees withCampus(Object campus) {
        this.campus = campus;
        return this;
    }

    /**
     * Home Organization
     * <p>
     * The home organization of the employee.
     * 
     */
    @JsonProperty("homeOrganization")
    public Object getHomeOrganization() {
        return homeOrganization;
    }

    /**
     * Home Organization
     * <p>
     * The home organization of the employee.
     * 
     */
    @JsonProperty("homeOrganization")
    public void setHomeOrganization(Object homeOrganization) {
        this.homeOrganization = homeOrganization;
    }

    public Employees withHomeOrganization(Object homeOrganization) {
        this.homeOrganization = homeOrganization;
        return this;
    }

    /**
     * Contract
     * <p>
     * The detail associated with the contract.
     * (Required)
     * 
     */
    @JsonProperty("contract")
    public Contract getContract() {
        return contract;
    }

    /**
     * Contract
     * <p>
     * The detail associated with the contract.
     * (Required)
     * 
     */
    @JsonProperty("contract")
    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Employees withContract(Contract contract) {
        this.contract = contract;
        return this;
    }

    /**
     * Pay Class
     * <p>
     * The classification assigned to the employee, or their primary job, that may impact payroll processing such as time entry methods, earning types and pay periods.
     * 
     */
    @JsonProperty("payClass")
    public Object getPayClass() {
        return payClass;
    }

    /**
     * Pay Class
     * <p>
     * The classification assigned to the employee, or their primary job, that may impact payroll processing such as time entry methods, earning types and pay periods.
     * 
     */
    @JsonProperty("payClass")
    public void setPayClass(Object payClass) {
        this.payClass = payClass;
    }

    public Employees withPayClass(Object payClass) {
        this.payClass = payClass;
        return this;
    }

    /**
     * Pay Status
     * <p>
     * The pay status of the employee (e.g. with pay, without pay or partial pay).
     * 
     */
    @JsonProperty("payStatus")
    public Object getPayStatus() {
        return payStatus;
    }

    /**
     * Pay Status
     * <p>
     * The pay status of the employee (e.g. with pay, without pay or partial pay).
     * 
     */
    @JsonProperty("payStatus")
    public void setPayStatus(Object payStatus) {
        this.payStatus = payStatus;
    }

    public Employees withPayStatus(Object payStatus) {
        this.payStatus = payStatus;
        return this;
    }

    /**
     * Benefits Status
     * <p>
     * The benefits status of the employee (e.g. with or without benefits).
     * 
     */
    @JsonProperty("benefitsStatus")
    public Object getBenefitsStatus() {
        return benefitsStatus;
    }

    /**
     * Benefits Status
     * <p>
     * The benefits status of the employee (e.g. with or without benefits).
     * 
     */
    @JsonProperty("benefitsStatus")
    public void setBenefitsStatus(Object benefitsStatus) {
        this.benefitsStatus = benefitsStatus;
    }

    public Employees withBenefitsStatus(Object benefitsStatus) {
        this.benefitsStatus = benefitsStatus;
        return this;
    }

    /**
     * Hours Per Period
     * <p>
     * The number of hours worked per period.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    public List<HoursPerPeriod> getHoursPerPeriod() {
        return hoursPerPeriod;
    }

    /**
     * Hours Per Period
     * <p>
     * The number of hours worked per period.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    public void setHoursPerPeriod(List<HoursPerPeriod> hoursPerPeriod) {
        this.hoursPerPeriod = hoursPerPeriod;
    }

    public Employees withHoursPerPeriod(List<HoursPerPeriod> hoursPerPeriod) {
        this.hoursPerPeriod = hoursPerPeriod;
        return this;
    }

    /**
     * Status
     * <p>
     * The employment status (e.g. active, terminated or on leave).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Employees.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The employment status (e.g. active, terminated or on leave).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Employees.Status status) {
        this.status = status;
    }

    public Employees withStatus(Employees.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date of employment.
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
     * The first date of employment.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public Employees withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date of employment.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date of employment.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Employees withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Termination Reason
     * <p>
     * The reason for employment termination.
     * 
     */
    @JsonProperty("terminationReason")
    public Object getTerminationReason() {
        return terminationReason;
    }

    /**
     * Termination Reason
     * <p>
     * The reason for employment termination.
     * 
     */
    @JsonProperty("terminationReason")
    public void setTerminationReason(Object terminationReason) {
        this.terminationReason = terminationReason;
    }

    public Employees withTerminationReason(Object terminationReason) {
        this.terminationReason = terminationReason;
        return this;
    }

    /**
     * Rehireable Status
     * <p>
     * The eligibility status for being rehired.
     * 
     */
    @JsonProperty("rehireableStatus")
    public Object getRehireableStatus() {
        return rehireableStatus;
    }

    /**
     * Rehireable Status
     * <p>
     * The eligibility status for being rehired.
     * 
     */
    @JsonProperty("rehireableStatus")
    public void setRehireableStatus(Object rehireableStatus) {
        this.rehireableStatus = rehireableStatus;
    }

    public Employees withRehireableStatus(Object rehireableStatus) {
        this.rehireableStatus = rehireableStatus;
        return this;
    }

    /**
     * Leave Reason
     * <p>
     * The reason for leave of absence.
     * 
     */
    @JsonProperty("leaveReason")
    public Object getLeaveReason() {
        return leaveReason;
    }

    /**
     * Leave Reason
     * <p>
     * The reason for leave of absence.
     * 
     */
    @JsonProperty("leaveReason")
    public void setLeaveReason(Object leaveReason) {
        this.leaveReason = leaveReason;
    }

    public Employees withLeaveReason(Object leaveReason) {
        this.leaveReason = leaveReason;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employees.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("campus");
        sb.append('=');
        sb.append(((this.campus == null)?"<null>":this.campus));
        sb.append(',');
        sb.append("homeOrganization");
        sb.append('=');
        sb.append(((this.homeOrganization == null)?"<null>":this.homeOrganization));
        sb.append(',');
        sb.append("contract");
        sb.append('=');
        sb.append(((this.contract == null)?"<null>":this.contract));
        sb.append(',');
        sb.append("payClass");
        sb.append('=');
        sb.append(((this.payClass == null)?"<null>":this.payClass));
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("terminationReason");
        sb.append('=');
        sb.append(((this.terminationReason == null)?"<null>":this.terminationReason));
        sb.append(',');
        sb.append("rehireableStatus");
        sb.append('=');
        sb.append(((this.rehireableStatus == null)?"<null>":this.rehireableStatus));
        sb.append(',');
        sb.append("leaveReason");
        sb.append('=');
        sb.append(((this.leaveReason == null)?"<null>":this.leaveReason));
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
        result = ((result* 31)+((this.campus == null)? 0 :this.campus.hashCode()));
        result = ((result* 31)+((this.homeOrganization == null)? 0 :this.homeOrganization.hashCode()));
        result = ((result* 31)+((this.contract == null)? 0 :this.contract.hashCode()));
        result = ((result* 31)+((this.benefitsStatus == null)? 0 :this.benefitsStatus.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.payClass == null)? 0 :this.payClass.hashCode()));
        result = ((result* 31)+((this.rehireableStatus == null)? 0 :this.rehireableStatus.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.leaveReason == null)? 0 :this.leaveReason.hashCode()));
        result = ((result* 31)+((this.hoursPerPeriod == null)? 0 :this.hoursPerPeriod.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.payStatus == null)? 0 :this.payStatus.hashCode()));
        result = ((result* 31)+((this.terminationReason == null)? 0 :this.terminationReason.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employees) == false) {
            return false;
        }
        Employees rhs = ((Employees) other);
        return (((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.campus == rhs.campus)||((this.campus!= null)&&this.campus.equals(rhs.campus))))&&((this.homeOrganization == rhs.homeOrganization)||((this.homeOrganization!= null)&&this.homeOrganization.equals(rhs.homeOrganization))))&&((this.contract == rhs.contract)||((this.contract!= null)&&this.contract.equals(rhs.contract))))&&((this.benefitsStatus == rhs.benefitsStatus)||((this.benefitsStatus!= null)&&this.benefitsStatus.equals(rhs.benefitsStatus))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.payClass == rhs.payClass)||((this.payClass!= null)&&this.payClass.equals(rhs.payClass))))&&((this.rehireableStatus == rhs.rehireableStatus)||((this.rehireableStatus!= null)&&this.rehireableStatus.equals(rhs.rehireableStatus))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.leaveReason == rhs.leaveReason)||((this.leaveReason!= null)&&this.leaveReason.equals(rhs.leaveReason))))&&((this.hoursPerPeriod == rhs.hoursPerPeriod)||((this.hoursPerPeriod!= null)&&this.hoursPerPeriod.equals(rhs.hoursPerPeriod))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.payStatus == rhs.payStatus)||((this.payStatus!= null)&&this.payStatus.equals(rhs.payStatus))))&&((this.terminationReason == rhs.terminationReason)||((this.terminationReason!= null)&&this.terminationReason.equals(rhs.terminationReason))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The employment status (e.g. active, terminated or on leave).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        TERMINATED("terminated"),
        LEAVE("leave");
        private final String value;
        private final static Map<String, Employees.Status> CONSTANTS = new HashMap<String, Employees.Status>();

        static {
            for (Employees.Status c: values()) {
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
        public static Employees.Status fromValue(String value) {
            Employees.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
