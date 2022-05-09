
package com.ellucian.generated.eedm.blanket_purchase_orders.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sequenceNumber",
    "accountingString",
    "allocation",
    "budgetCheck"
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
     * The accounting string associated with the item ordered.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    @JsonPropertyDescription("The accounting string associated with the item ordered.")
    private String accountingString;
    /**
     * Allocation
     * <p>
     * The allocation of the accounting string for the item ordered.
     * 
     */
    @JsonProperty("allocation")
    @JsonPropertyDescription("The allocation of the accounting string for the item ordered.")
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
     * The accounting string associated with the item ordered.
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
     * The accounting string associated with the item ordered.
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
     * Allocation
     * <p>
     * The allocation of the accounting string for the item ordered.
     * 
     */
    @JsonProperty("allocation")
    public Object getAllocation() {
        return allocation;
    }

    /**
     * Allocation
     * <p>
     * The allocation of the accounting string for the item ordered.
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
        sb.append("allocation");
        sb.append('=');
        sb.append(((this.allocation == null)?"<null>":this.allocation));
        sb.append(',');
        sb.append("budgetCheck");
        sb.append('=');
        sb.append(((this.budgetCheck == null)?"<null>":this.budgetCheck));
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
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.budgetCheck == null)? 0 :this.budgetCheck.hashCode()));
        result = ((result* 31)+((this.allocation == null)? 0 :this.allocation.hashCode()));
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
        return (((((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber)))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.budgetCheck == rhs.budgetCheck)||((this.budgetCheck!= null)&&this.budgetCheck.equals(rhs.budgetCheck))))&&((this.allocation == rhs.allocation)||((this.allocation!= null)&&this.allocation.equals(rhs.allocation))));
    }

}
