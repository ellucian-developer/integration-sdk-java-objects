
package com.ellucian.generated.eedm.accounts_payable_invoices.v11_3_0;

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
    "source",
    "budgetCheck",
    "submittedBy"
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
     * The accounting string associated with the account detail item.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    @JsonPropertyDescription("The accounting string associated with the account detail item.")
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
     * The allocation of line item values to the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("allocation")
    @JsonPropertyDescription("The allocation of line item values to the accounting string.")
    private Allocation allocation;
    /**
     * Source
     * <p>
     * The source account for the payment to the accounting string if different from the source specified for the invoice.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source account for the payment to the accounting string if different from the source specified for the invoice.")
    private Object source;
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
     * The accounting string associated with the account detail item.
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
     * The accounting string associated with the account detail item.
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
     * The allocation of line item values to the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("allocation")
    public Allocation getAllocation() {
        return allocation;
    }

    /**
     * Allocation
     * <p>
     * The allocation of line item values to the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("allocation")
    public void setAllocation(Allocation allocation) {
        this.allocation = allocation;
    }

    public AccountDetail withAllocation(Allocation allocation) {
        this.allocation = allocation;
        return this;
    }

    /**
     * Source
     * <p>
     * The source account for the payment to the accounting string if different from the source specified for the invoice.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source account for the payment to the accounting string if different from the source specified for the invoice.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public AccountDetail withSource(Object source) {
        this.source = source;
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
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("budgetCheck");
        sb.append('=');
        sb.append(((this.budgetCheck == null)?"<null>":this.budgetCheck));
        sb.append(',');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
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
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.allocation == null)? 0 :this.allocation.hashCode()));
        result = ((result* 31)+((this.taxFormComponent == null)? 0 :this.taxFormComponent.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.budgetCheck == null)? 0 :this.budgetCheck.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
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
        return ((((((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber))))&&((this.allocation == rhs.allocation)||((this.allocation!= null)&&this.allocation.equals(rhs.allocation))))&&((this.taxFormComponent == rhs.taxFormComponent)||((this.taxFormComponent!= null)&&this.taxFormComponent.equals(rhs.taxFormComponent))))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.budgetCheck == rhs.budgetCheck)||((this.budgetCheck!= null)&&this.budgetCheck.equals(rhs.budgetCheck))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))));
    }

}
