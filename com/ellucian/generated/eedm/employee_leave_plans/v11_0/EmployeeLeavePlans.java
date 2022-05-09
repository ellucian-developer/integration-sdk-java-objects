
package com.ellucian.generated.eedm.employee_leave_plans.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employee Leave Plans
 * <p>
 * Information on employees' leave plans.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "plan",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class EmployeeLeavePlans {

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
     * The global identifier of the employee leave plan.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the employee leave plan.")
    private String id;
    /**
     * Person
     * <p>
     * The person associated with the leave plan.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person associated with the leave plan.")
    private Person person;
    /**
     * Plan
     * <p>
     * The leave plan assigned to the employee.
     * (Required)
     * 
     */
    @JsonProperty("plan")
    @JsonPropertyDescription("The leave plan assigned to the employee.")
    private Plan plan;
    /**
     * Start On
     * <p>
     * The start date of the plan.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the plan.")
    private String startOn;
    /**
     * End On
     * <p>
     * The end date of the plan.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the plan.")
    private Object endOn;

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

    public EmployeeLeavePlans withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the employee leave plan.
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
     * The global identifier of the employee leave plan.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeLeavePlans withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person associated with the leave plan.
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
     * The person associated with the leave plan.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public EmployeeLeavePlans withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Plan
     * <p>
     * The leave plan assigned to the employee.
     * (Required)
     * 
     */
    @JsonProperty("plan")
    public Plan getPlan() {
        return plan;
    }

    /**
     * Plan
     * <p>
     * The leave plan assigned to the employee.
     * (Required)
     * 
     */
    @JsonProperty("plan")
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public EmployeeLeavePlans withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date of the plan.
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
     * The start date of the plan.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public EmployeeLeavePlans withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the plan.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the plan.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public EmployeeLeavePlans withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeLeavePlans.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("plan");
        sb.append('=');
        sb.append(((this.plan == null)?"<null>":this.plan));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.plan == null)? 0 :this.plan.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeLeavePlans) == false) {
            return false;
        }
        EmployeeLeavePlans rhs = ((EmployeeLeavePlans) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.plan == rhs.plan)||((this.plan!= null)&&this.plan.equals(rhs.plan))));
    }

}
