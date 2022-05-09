
package com.ellucian.generated.eedm.institution_jobs.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountingString",
    "allocatedPercentage",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class AccountingStringAllocation {

    /**
     * Accounting String
     * <p>
     * An accounting string associated with the job.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    @JsonPropertyDescription("An accounting string associated with the job.")
    private String accountingString;
    /**
     * Allocated Percentage
     * <p>
     * The percentage allocation of the job expenses to the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("allocatedPercentage")
    @JsonPropertyDescription("The percentage allocation of the job expenses to the accounting string.")
    private Double allocatedPercentage;
    /**
     * Start On
     * <p>
     * The start date associated with the accounting string.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date associated with the accounting string.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The end date associated with the accounting string.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date associated with the accounting string.")
    private Object endOn;

    /**
     * Accounting String
     * <p>
     * An accounting string associated with the job.
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
     * An accounting string associated with the job.
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
     * The percentage allocation of the job expenses to the accounting string.
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
     * The percentage allocation of the job expenses to the accounting string.
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

    /**
     * Start On
     * <p>
     * The start date associated with the accounting string.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date associated with the accounting string.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public AccountingStringAllocation withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date associated with the accounting string.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date associated with the accounting string.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public AccountingStringAllocation withEndOn(Object endOn) {
        this.endOn = endOn;
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
        result = ((result* 31)+((this.allocatedPercentage == null)? 0 :this.allocatedPercentage.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
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
        return (((((this.allocatedPercentage == rhs.allocatedPercentage)||((this.allocatedPercentage!= null)&&this.allocatedPercentage.equals(rhs.allocatedPercentage)))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))));
    }

}
