
package com.ellucian.generated.eedm.accounts_payable_invoices.v11_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Allocation
 * <p>
 * The allocation of line item values to the accounting string.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allocated",
    "taxAmount",
    "additionalAmount",
    "discountAmount"
})
@Generated("jsonschema2pojo")
public class Allocation {

    /**
     * Allocated
     * <p>
     * The portion (or percentage) of the line item amount or quantity allocated to the accounting string. (One of amount, quantity or percent must be specified)
     * (Required)
     * 
     */
    @JsonProperty("allocated")
    @JsonPropertyDescription("The portion (or percentage) of the line item amount or quantity allocated to the accounting string. (One of amount, quantity or percent must be specified)")
    private Allocated allocated;
    /**
     * Tax Amount
     * <p>
     * The tax amount associated with the accounting string - overrides the distributed line amounts, if specified.
     * 
     */
    @JsonProperty("taxAmount")
    @JsonPropertyDescription("The tax amount associated with the accounting string - overrides the distributed line amounts, if specified.")
    private Object taxAmount;
    /**
     * Additional Amount
     * <p>
     * Additional charges applied to the accounting string (e.g. freight) - overrides the distributed line item amounts, if specified.
     * 
     */
    @JsonProperty("additionalAmount")
    @JsonPropertyDescription("Additional charges applied to the accounting string (e.g. freight) - overrides the distributed line item amounts, if specified.")
    private Object additionalAmount;
    /**
     * Discount Amount
     * <p>
     * The discount amount associated with the accounting string - overrides the distributed line amounts, if specified.
     * 
     */
    @JsonProperty("discountAmount")
    @JsonPropertyDescription("The discount amount associated with the accounting string - overrides the distributed line amounts, if specified.")
    private Object discountAmount;

    /**
     * Allocated
     * <p>
     * The portion (or percentage) of the line item amount or quantity allocated to the accounting string. (One of amount, quantity or percent must be specified)
     * (Required)
     * 
     */
    @JsonProperty("allocated")
    public Allocated getAllocated() {
        return allocated;
    }

    /**
     * Allocated
     * <p>
     * The portion (or percentage) of the line item amount or quantity allocated to the accounting string. (One of amount, quantity or percent must be specified)
     * (Required)
     * 
     */
    @JsonProperty("allocated")
    public void setAllocated(Allocated allocated) {
        this.allocated = allocated;
    }

    public Allocation withAllocated(Allocated allocated) {
        this.allocated = allocated;
        return this;
    }

    /**
     * Tax Amount
     * <p>
     * The tax amount associated with the accounting string - overrides the distributed line amounts, if specified.
     * 
     */
    @JsonProperty("taxAmount")
    public Object getTaxAmount() {
        return taxAmount;
    }

    /**
     * Tax Amount
     * <p>
     * The tax amount associated with the accounting string - overrides the distributed line amounts, if specified.
     * 
     */
    @JsonProperty("taxAmount")
    public void setTaxAmount(Object taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Allocation withTaxAmount(Object taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Additional Amount
     * <p>
     * Additional charges applied to the accounting string (e.g. freight) - overrides the distributed line item amounts, if specified.
     * 
     */
    @JsonProperty("additionalAmount")
    public Object getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Additional Amount
     * <p>
     * Additional charges applied to the accounting string (e.g. freight) - overrides the distributed line item amounts, if specified.
     * 
     */
    @JsonProperty("additionalAmount")
    public void setAdditionalAmount(Object additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public Allocation withAdditionalAmount(Object additionalAmount) {
        this.additionalAmount = additionalAmount;
        return this;
    }

    /**
     * Discount Amount
     * <p>
     * The discount amount associated with the accounting string - overrides the distributed line amounts, if specified.
     * 
     */
    @JsonProperty("discountAmount")
    public Object getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Discount Amount
     * <p>
     * The discount amount associated with the accounting string - overrides the distributed line amounts, if specified.
     * 
     */
    @JsonProperty("discountAmount")
    public void setDiscountAmount(Object discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Allocation withDiscountAmount(Object discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Allocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allocated");
        sb.append('=');
        sb.append(((this.allocated == null)?"<null>":this.allocated));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null)?"<null>":this.taxAmount));
        sb.append(',');
        sb.append("additionalAmount");
        sb.append('=');
        sb.append(((this.additionalAmount == null)?"<null>":this.additionalAmount));
        sb.append(',');
        sb.append("discountAmount");
        sb.append('=');
        sb.append(((this.discountAmount == null)?"<null>":this.discountAmount));
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
        result = ((result* 31)+((this.discountAmount == null)? 0 :this.discountAmount.hashCode()));
        result = ((result* 31)+((this.taxAmount == null)? 0 :this.taxAmount.hashCode()));
        result = ((result* 31)+((this.additionalAmount == null)? 0 :this.additionalAmount.hashCode()));
        result = ((result* 31)+((this.allocated == null)? 0 :this.allocated.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Allocation) == false) {
            return false;
        }
        Allocation rhs = ((Allocation) other);
        return (((((this.discountAmount == rhs.discountAmount)||((this.discountAmount!= null)&&this.discountAmount.equals(rhs.discountAmount)))&&((this.taxAmount == rhs.taxAmount)||((this.taxAmount!= null)&&this.taxAmount.equals(rhs.taxAmount))))&&((this.additionalAmount == rhs.additionalAmount)||((this.additionalAmount!= null)&&this.additionalAmount.equals(rhs.additionalAmount))))&&((this.allocated == rhs.allocated)||((this.allocated!= null)&&this.allocated.equals(rhs.allocated))));
    }

}
