
package com.ellucian.generated.eedm.accounts_payable_invoices.v11_2_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Discount
 * <p>
 * The discount applied to the line item (e.g. trade/volume discounts).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "percent"
})
@Generated("jsonschema2pojo")
public class Discount {

    /**
     * Amount
     * <p>
     * The amount of the discount for the line item, if specified.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount of the discount for the line item, if specified.")
    private Object amount;
    /**
     * Percent
     * <p>
     * The discount percentage applied to the line item, if specified.
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("The discount percentage applied to the line item, if specified.")
    private Object percent;

    /**
     * Amount
     * <p>
     * The amount of the discount for the line item, if specified.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount of the discount for the line item, if specified.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public Discount withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Percent
     * <p>
     * The discount percentage applied to the line item, if specified.
     * 
     */
    @JsonProperty("percent")
    public Object getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * The discount percentage applied to the line item, if specified.
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Object percent) {
        this.percent = percent;
    }

    public Discount withPercent(Object percent) {
        this.percent = percent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Discount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
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
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Discount) == false) {
            return false;
        }
        Discount rhs = ((Discount) other);
        return (((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))));
    }

}
