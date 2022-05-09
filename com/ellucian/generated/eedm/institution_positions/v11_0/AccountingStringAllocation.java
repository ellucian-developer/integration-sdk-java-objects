
package com.ellucian.generated.eedm.institution_positions.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountingString",
    "allocatedPercentage"
})
@Generated("jsonschema2pojo")
public class AccountingStringAllocation {

    /**
     * Accounting String
     * <p>
     * An accounting string associated with the position.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    @JsonPropertyDescription("An accounting string associated with the position.")
    private String accountingString;
    /**
     * Allocated Percentage
     * <p>
     * The percentage allocation of the position's expenses to the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("allocatedPercentage")
    @JsonPropertyDescription("The percentage allocation of the position's expenses to the accounting string.")
    private Double allocatedPercentage;

    /**
     * Accounting String
     * <p>
     * An accounting string associated with the position.
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
     * An accounting string associated with the position.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    public void setAccountingString(String accountingString) {
        this.accountingString = accountingString;
    }

    public AccountingStringAllocation withAccountingString(String accountingString) {
        this.accountingString = accountingString;
        return this;
    }

    /**
     * Allocated Percentage
     * <p>
     * The percentage allocation of the position's expenses to the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("allocatedPercentage")
    public Double getAllocatedPercentage() {
        return allocatedPercentage;
    }

    /**
     * Allocated Percentage
     * <p>
     * The percentage allocation of the position's expenses to the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("allocatedPercentage")
    public void setAllocatedPercentage(Double allocatedPercentage) {
        this.allocatedPercentage = allocatedPercentage;
    }

    public AccountingStringAllocation withAllocatedPercentage(Double allocatedPercentage) {
        this.allocatedPercentage = allocatedPercentage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingStringAllocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountingString");
        sb.append('=');
        sb.append(((this.accountingString == null)?"<null>":this.accountingString));
        sb.append(',');
        sb.append("allocatedPercentage");
        sb.append('=');
        sb.append(((this.allocatedPercentage == null)?"<null>":this.allocatedPercentage));
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
        result = ((result* 31)+((this.allocatedPercentage == null)? 0 :this.allocatedPercentage.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingStringAllocation) == false) {
            return false;
        }
        AccountingStringAllocation rhs = ((AccountingStringAllocation) other);
        return (((this.allocatedPercentage == rhs.allocatedPercentage)||((this.allocatedPercentage!= null)&&this.allocatedPercentage.equals(rhs.allocatedPercentage)))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))));
    }

}
