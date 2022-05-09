
package com.ellucian.generated.eedm.housing_assignments.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountingCode",
    "charge"
})
@Generated("jsonschema2pojo")
public class AdditionalCharge {

    /**
     * Accounting Code
     * <p>
     * The accounting code associated with the additional charge.
     * (Required)
     * 
     */
    @JsonProperty("accountingCode")
    @JsonPropertyDescription("The accounting code associated with the additional charge.")
    private AccountingCode accountingCode;
    /**
     * Charge
     * <p>
     * The amount of the additional charge.
     * (Required)
     * 
     */
    @JsonProperty("charge")
    @JsonPropertyDescription("The amount of the additional charge.")
    private Charge charge;

    /**
     * Accounting Code
     * <p>
     * The accounting code associated with the additional charge.
     * (Required)
     * 
     */
    @JsonProperty("accountingCode")
    public AccountingCode getAccountingCode() {
        return accountingCode;
    }

    /**
     * Accounting Code
     * <p>
     * The accounting code associated with the additional charge.
     * (Required)
     * 
     */
    @JsonProperty("accountingCode")
    public void setAccountingCode(AccountingCode accountingCode) {
        this.accountingCode = accountingCode;
    }

    public AdditionalCharge withAccountingCode(AccountingCode accountingCode) {
        this.accountingCode = accountingCode;
        return this;
    }

    /**
     * Charge
     * <p>
     * The amount of the additional charge.
     * (Required)
     * 
     */
    @JsonProperty("charge")
    public Charge getCharge() {
        return charge;
    }

    /**
     * Charge
     * <p>
     * The amount of the additional charge.
     * (Required)
     * 
     */
    @JsonProperty("charge")
    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    public AdditionalCharge withCharge(Charge charge) {
        this.charge = charge;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalCharge.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountingCode");
        sb.append('=');
        sb.append(((this.accountingCode == null)?"<null>":this.accountingCode));
        sb.append(',');
        sb.append("charge");
        sb.append('=');
        sb.append(((this.charge == null)?"<null>":this.charge));
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
        result = ((result* 31)+((this.accountingCode == null)? 0 :this.accountingCode.hashCode()));
        result = ((result* 31)+((this.charge == null)? 0 :this.charge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalCharge) == false) {
            return false;
        }
        AdditionalCharge rhs = ((AdditionalCharge) other);
        return (((this.accountingCode == rhs.accountingCode)||((this.accountingCode!= null)&&this.accountingCode.equals(rhs.accountingCode)))&&((this.charge == rhs.charge)||((this.charge!= null)&&this.charge.equals(rhs.charge))));
    }

}
