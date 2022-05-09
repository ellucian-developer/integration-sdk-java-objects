
package com.ellucian.generated.eedm.proposals.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Actual Request
 * <p>
 * The amount and the date associated with the actual request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "date"
})
@Generated("jsonschema2pojo")
public class ActualRequest {

    /**
     * Amount
     * <p>
     * The actual requested amount for the proposal.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The actual requested amount for the proposal.")
    private Object amount;
    /**
     * Date
     * <p>
     * The actual request date for the proposal.
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("The actual request date for the proposal.")
    private Object date;

    /**
     * Amount
     * <p>
     * The actual requested amount for the proposal.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The actual requested amount for the proposal.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public ActualRequest withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Date
     * <p>
     * The actual request date for the proposal.
     * 
     */
    @JsonProperty("date")
    public Object getDate() {
        return date;
    }

    /**
     * Date
     * <p>
     * The actual request date for the proposal.
     * 
     */
    @JsonProperty("date")
    public void setDate(Object date) {
        this.date = date;
    }

    public ActualRequest withDate(Object date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActualRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof ActualRequest) == false) {
            return false;
        }
        ActualRequest rhs = ((ActualRequest) other);
        return (((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))));
    }

}
