
package com.ellucian.generated.eedm.proposals.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Granted
 * <p>
 * The amount and the date associated with the grant from the prospect for the proposal.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "date"
})
@Generated("jsonschema2pojo")
public class Granted {

    /**
     * Amount
     * <p>
     * The granted amount for the proposal.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The granted amount for the proposal.")
    private Object amount;
    /**
     * Date
     * <p>
     * The date on which the proposal amount was granted.
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("The date on which the proposal amount was granted.")
    private Object date;

    /**
     * Amount
     * <p>
     * The granted amount for the proposal.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The granted amount for the proposal.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public Granted withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Date
     * <p>
     * The date on which the proposal amount was granted.
     * 
     */
    @JsonProperty("date")
    public Object getDate() {
        return date;
    }

    /**
     * Date
     * <p>
     * The date on which the proposal amount was granted.
     * 
     */
    @JsonProperty("date")
    public void setDate(Object date) {
        this.date = date;
    }

    public Granted withDate(Object date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Granted.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Granted) == false) {
            return false;
        }
        Granted rhs = ((Granted) other);
        return (((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))));
    }

}
