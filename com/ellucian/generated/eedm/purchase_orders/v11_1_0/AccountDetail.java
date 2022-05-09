
package com.ellucian.generated.eedm.purchase_orders.v11_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sequenceNumber",
    "accountingString",
    "taxFormComponent",
    "allocation",
    "budgetCheck",
    "submittedBy",
    "status",
    "statusDate"
})
@Generated("jsonschema2pojo")
public class AccountDetail {

    /**
     * Sequence Number
     * <p>
     * The sequence number associated with the account detail item.
     * 
     */
    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("The sequence number associated with the account detail item.")
    private Object sequenceNumber;
    /**
     * Accounting String
     * <p>
     * The accounting string associated with the line item.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    @JsonPropertyDescription("The accounting string associated with the line item.")
    private String accountingString;
    /**
     * Tax Form Component
     * <p>
     * The tax form component associated with the line item.
     * 
     */
    @JsonProperty("taxFormComponent")
    @JsonPropertyDescription("The tax form component associated with the line item.")
    private Object taxFormComponent;
    /**
     * Allocation
     * <p>
     * The allocation of the line item.
     * 
     */
    @JsonProperty("allocation")
    @JsonPropertyDescription("The allocation of the line item.")
    private Object allocation;
    /**
     * Budget Check
     * <p>
     * An indication that budget checking should be overridden for the accounting string.
     * 
     */
    @JsonProperty("budgetCheck")
    @JsonPropertyDescription("An indication that budget checking should be overridden for the accounting string.")
    private Object budgetCheck;
    /**
     * Submitted By
     * <p>
     * The person who made the submit request for the line item.
     * 
     */
    @JsonProperty("submittedBy")
    @JsonPropertyDescription("The person who made the submit request for the line item.")
    private Object submittedBy;
    /**
     * Status
     * <p>
     * The status of the account details associated with the line item.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the account details associated with the line item.")
    private Object status;
    /**
     * Status Date
     * <p>
     * The date associated with the line item account detail status.
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("The date associated with the line item account detail status.")
    private Object statusDate;

    /**
     * Sequence Number
     * <p>
     * The sequence number associated with the account detail item.
     * 
     */
    @JsonProperty("sequenceNumber")
    public Object getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sequence Number
     * <p>
     * The sequence number associated with the account detail item.
     * 
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Object sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public AccountDetail withSequenceNumber(Object sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Accounting String
     * <p>
     * The accounting string associated with the line item.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    public String getAccountingString() {
        return accountingString;
    }

    /**
     * Accounting String
     * <p>
     * The accounting string associated with the line item.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    public void setAccountingString(String accountingString) {
        this.accountingString = accountingString;
    }

    public AccountDetail withAccountingString(String accountingString) {
        this.accountingString = accountingString;
        return this;
    }

    /**
     * Tax Form Component
     * <p>
     * The tax form component associated with the line item.
     * 
     */
    @JsonProperty("taxFormComponent")
    public Object getTaxFormComponent() {
        return taxFormComponent;
    }

    /**
     * Tax Form Component
     * <p>
     * The tax form component associated with the line item.
     * 
     */
    @JsonProperty("taxFormComponent")
    public void setTaxFormComponent(Object taxFormComponent) {
        this.taxFormComponent = taxFormComponent;
    }

    public AccountDetail withTaxFormComponent(Object taxFormComponent) {
        this.taxFormComponent = taxFormComponent;
        return this;
    }

    /**
     * Allocation
     * <p>
     * The allocation of the line item.
     * 
     */
    @JsonProperty("allocation")
    public Object getAllocation() {
        return allocation;
    }

    /**
     * Allocation
     * <p>
     * The allocation of the line item.
     * 
     */
    @JsonProperty("allocation")
    public void setAllocation(Object allocation) {
        this.allocation = allocation;
    }

    public AccountDetail withAllocation(Object allocation) {
        this.allocation = allocation;
        return this;
    }

    /**
     * Budget Check
     * <p>
     * An indication that budget checking should be overridden for the accounting string.
     * 
     */
    @JsonProperty("budgetCheck")
    public Object getBudgetCheck() {
        return budgetCheck;
    }

    /**
     * Budget Check
     * <p>
     * An indication that budget checking should be overridden for the accounting string.
     * 
     */
    @JsonProperty("budgetCheck")
    public void setBudgetCheck(Object budgetCheck) {
        this.budgetCheck = budgetCheck;
    }

    public AccountDetail withBudgetCheck(Object budgetCheck) {
        this.budgetCheck = budgetCheck;
        return this;
    }

    /**
     * Submitted By
     * <p>
     * The person who made the submit request for the line item.
     * 
     */
    @JsonProperty("submittedBy")
    public Object getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Submitted By
     * <p>
     * The person who made the submit request for the line item.
     * 
     */
    @JsonProperty("submittedBy")
    public void setSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
    }

    public AccountDetail withSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the account details associated with the line item.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the account details associated with the line item.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public AccountDetail withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Status Date
     * <p>
     * The date associated with the line item account detail status.
     * 
     */
    @JsonProperty("statusDate")
    public Object getStatusDate() {
        return statusDate;
    }

    /**
     * Status Date
     * <p>
     * The date associated with the line item account detail status.
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(Object statusDate) {
        this.statusDate = statusDate;
    }

    public AccountDetail withStatusDate(Object statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
        sb.append(',');
        sb.append("accountingString");
        sb.append('=');
        sb.append(((this.accountingString == null)?"<null>":this.accountingString));
        sb.append(',');
        sb.append("taxFormComponent");
        sb.append('=');
        sb.append(((this.taxFormComponent == null)?"<null>":this.taxFormComponent));
        sb.append(',');
        sb.append("allocation");
        sb.append('=');
        sb.append(((this.allocation == null)?"<null>":this.allocation));
        sb.append(',');
        sb.append("budgetCheck");
        sb.append('=');
        sb.append(((this.budgetCheck == null)?"<null>":this.budgetCheck));
        sb.append(',');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
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
        result = ((result* 31)+((this.submittedBy == null)? 0 :this.submittedBy.hashCode()));
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.allocation == null)? 0 :this.allocation.hashCode()));
        result = ((result* 31)+((this.taxFormComponent == null)? 0 :this.taxFormComponent.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.budgetCheck == null)? 0 :this.budgetCheck.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetail) == false) {
            return false;
        }
        AccountDetail rhs = ((AccountDetail) other);
        return (((((((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate))))&&((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber))))&&((this.allocation == rhs.allocation)||((this.allocation!= null)&&this.allocation.equals(rhs.allocation))))&&((this.taxFormComponent == rhs.taxFormComponent)||((this.taxFormComponent!= null)&&this.taxFormComponent.equals(rhs.taxFormComponent))))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.budgetCheck == rhs.budgetCheck)||((this.budgetCheck!= null)&&this.budgetCheck.equals(rhs.budgetCheck))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
