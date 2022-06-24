
package com.ellucian.generated.eedm.accounts_payable_invoices.v11_3_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rate",
    "amount"
})
@Generated("jsonschema2pojo")
public class TaxCodeRate {

    /**
     * Rate
     * <p>
     * The tax code rate that applies to the line item.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    @JsonPropertyDescription("The tax code rate that applies to the line item.")
    private Rate rate;
    /**
     * Amount
     * <p>
     * The tax amount associated with the line item - overrides the distributed line amounts if specified.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The tax amount associated with the line item - overrides the distributed line amounts if specified.")
    private Amount amount;

    /**
     * Rate
     * <p>
     * The tax code rate that applies to the line item.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public Rate getRate() {
        return rate;
    }

    /**
     * Rate
     * <p>
     * The tax code rate that applies to the line item.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public TaxCodeRate withRate(Rate rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Amount
     * <p>
     * The tax amount associated with the line item - overrides the distributed line amounts if specified.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The tax amount associated with the line item - overrides the distributed line amounts if specified.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public TaxCodeRate withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaxCodeRate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxCodeRate) == false) {
            return false;
        }
        TaxCodeRate rhs = ((TaxCodeRate) other);
        return (((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))));
    }

}
