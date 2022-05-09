
package com.ellucian.generated.eedm.employee_leave_transactions.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employee Leave Transactions
 * <p>
 * Information on recorded transactions for leaves taken by employees.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "employeeLeave",
    "transactionDate",
    "accrued",
    "taken",
    "available"
})
@Generated("jsonschema2pojo")
public class EmployeeLeaveTransactions {

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
     * The global identifier of the employee leave transaction.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the employee leave transaction.")
    private String id;
    /**
     * Employee Leave
     * <p>
     * The leave plan for which the transaction occurred.
     * (Required)
     * 
     */
    @JsonProperty("employeeLeave")
    @JsonPropertyDescription("The leave plan for which the transaction occurred.")
    private EmployeeLeave employeeLeave;
    /**
     * Transaction Date
     * <p>
     * The date of the transaction.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    @JsonPropertyDescription("The date of the transaction.")
    private String transactionDate;
    /**
     * Accrued
     * <p>
     * The number of hours accrued for leave.
     * 
     */
    @JsonProperty("accrued")
    @JsonPropertyDescription("The number of hours accrued for leave.")
    private Object accrued;
    /**
     * Taken
     * <p>
     * The number of hours taken for leave.
     * 
     */
    @JsonProperty("taken")
    @JsonPropertyDescription("The number of hours taken for leave.")
    private Object taken;
    /**
     * Available
     * <p>
     * The number of hours available for leave.
     * 
     */
    @JsonProperty("available")
    @JsonPropertyDescription("The number of hours available for leave.")
    private Object available;

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

    public EmployeeLeaveTransactions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the employee leave transaction.
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
     * The global identifier of the employee leave transaction.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeLeaveTransactions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Employee Leave
     * <p>
     * The leave plan for which the transaction occurred.
     * (Required)
     * 
     */
    @JsonProperty("employeeLeave")
    public EmployeeLeave getEmployeeLeave() {
        return employeeLeave;
    }

    /**
     * Employee Leave
     * <p>
     * The leave plan for which the transaction occurred.
     * (Required)
     * 
     */
    @JsonProperty("employeeLeave")
    public void setEmployeeLeave(EmployeeLeave employeeLeave) {
        this.employeeLeave = employeeLeave;
    }

    public EmployeeLeaveTransactions withEmployeeLeave(EmployeeLeave employeeLeave) {
        this.employeeLeave = employeeLeave;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * The date of the transaction.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Transaction Date
     * <p>
     * The date of the transaction.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public EmployeeLeaveTransactions withTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    /**
     * Accrued
     * <p>
     * The number of hours accrued for leave.
     * 
     */
    @JsonProperty("accrued")
    public Object getAccrued() {
        return accrued;
    }

    /**
     * Accrued
     * <p>
     * The number of hours accrued for leave.
     * 
     */
    @JsonProperty("accrued")
    public void setAccrued(Object accrued) {
        this.accrued = accrued;
    }

    public EmployeeLeaveTransactions withAccrued(Object accrued) {
        this.accrued = accrued;
        return this;
    }

    /**
     * Taken
     * <p>
     * The number of hours taken for leave.
     * 
     */
    @JsonProperty("taken")
    public Object getTaken() {
        return taken;
    }

    /**
     * Taken
     * <p>
     * The number of hours taken for leave.
     * 
     */
    @JsonProperty("taken")
    public void setTaken(Object taken) {
        this.taken = taken;
    }

    public EmployeeLeaveTransactions withTaken(Object taken) {
        this.taken = taken;
        return this;
    }

    /**
     * Available
     * <p>
     * The number of hours available for leave.
     * 
     */
    @JsonProperty("available")
    public Object getAvailable() {
        return available;
    }

    /**
     * Available
     * <p>
     * The number of hours available for leave.
     * 
     */
    @JsonProperty("available")
    public void setAvailable(Object available) {
        this.available = available;
    }

    public EmployeeLeaveTransactions withAvailable(Object available) {
        this.available = available;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeLeaveTransactions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("employeeLeave");
        sb.append('=');
        sb.append(((this.employeeLeave == null)?"<null>":this.employeeLeave));
        sb.append(',');
        sb.append("transactionDate");
        sb.append('=');
        sb.append(((this.transactionDate == null)?"<null>":this.transactionDate));
        sb.append(',');
        sb.append("accrued");
        sb.append('=');
        sb.append(((this.accrued == null)?"<null>":this.accrued));
        sb.append(',');
        sb.append("taken");
        sb.append('=');
        sb.append(((this.taken == null)?"<null>":this.taken));
        sb.append(',');
        sb.append("available");
        sb.append('=');
        sb.append(((this.available == null)?"<null>":this.available));
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
        result = ((result* 31)+((this.accrued == null)? 0 :this.accrued.hashCode()));
        result = ((result* 31)+((this.taken == null)? 0 :this.taken.hashCode()));
        result = ((result* 31)+((this.available == null)? 0 :this.available.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.transactionDate == null)? 0 :this.transactionDate.hashCode()));
        result = ((result* 31)+((this.employeeLeave == null)? 0 :this.employeeLeave.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeLeaveTransactions) == false) {
            return false;
        }
        EmployeeLeaveTransactions rhs = ((EmployeeLeaveTransactions) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.accrued == rhs.accrued)||((this.accrued!= null)&&this.accrued.equals(rhs.accrued))))&&((this.taken == rhs.taken)||((this.taken!= null)&&this.taken.equals(rhs.taken))))&&((this.available == rhs.available)||((this.available!= null)&&this.available.equals(rhs.available))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.transactionDate == rhs.transactionDate)||((this.transactionDate!= null)&&this.transactionDate.equals(rhs.transactionDate))))&&((this.employeeLeave == rhs.employeeLeave)||((this.employeeLeave!= null)&&this.employeeLeave.equals(rhs.employeeLeave))));
    }

}
