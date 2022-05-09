
package com.ellucian.generated.eedm.requisitions.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Allocated
 * <p>
 * The portion (or percentage) of the line item amount or quantity allocated to the accounting string (at least one of amount, quantity or percent must be specified).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "percent",
    "quantity"
})
@Generated("jsonschema2pojo")
public class Allocated {

    /**
     * Amount
     * <p>
     * The amount allocated to the accounting string.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount allocated to the accounting string.")
    private Object amount;
    /**
     * Percent
     * <p>
     * The percentage of the line item amount allocated to the accounting string.
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("The percentage of the line item amount allocated to the accounting string.")
    private Object percent;
    /**
     * Quantity
     * <p>
     * The quantity allocated to the accounting string.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("The quantity allocated to the accounting string.")
    private Object quantity;

    /**
     * Amount
     * <p>
     * The amount allocated to the accounting string.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount allocated to the accounting string.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public Allocated withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Percent
     * <p>
     * The percentage of the line item amount allocated to the accounting string.
     * 
     */
    @JsonProperty("percent")
    public Object getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * The percentage of the line item amount allocated to the accounting string.
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Object percent) {
        this.percent = percent;
    }

    public Allocated withPercent(Object percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Quantity
     * <p>
     * The quantity allocated to the accounting string.
     * 
     */
    @JsonProperty("quantity")
    public Object getQuantity() {
        return quantity;
    }

    /**
     * Quantity
     * <p>
     * The quantity allocated to the accounting string.
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Object quantity) {
        this.quantity = quantity;
    }

    public Allocated withQuantity(Object quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Allocated.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Allocated) == false) {
            return false;
        }
        Allocated rhs = ((Allocated) other);
        return ((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))));
    }

}
