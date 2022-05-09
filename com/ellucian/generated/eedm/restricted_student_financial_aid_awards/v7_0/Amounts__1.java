
package com.ellucian.generated.eedm.restricted_student_financial_aid_awards.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Amounts
 * <p>
 * Details of amounts to be distributed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "plannedAmount",
    "actualAmount"
})
@Generated("jsonschema2pojo")
public class Amounts__1 {

    /**
     * Planned Amount
     * <p>
     * The amount anticipated to be distributed
     * 
     */
    @JsonProperty("plannedAmount")
    @JsonPropertyDescription("The amount anticipated to be distributed")
    private Object plannedAmount;
    /**
     * Actual Amount
     * <p>
     * The amount that was actually distributed
     * 
     */
    @JsonProperty("actualAmount")
    @JsonPropertyDescription("The amount that was actually distributed")
    private Object actualAmount;

    /**
     * Planned Amount
     * <p>
     * The amount anticipated to be distributed
     * 
     */
    @JsonProperty("plannedAmount")
    public Object getPlannedAmount() {
        return plannedAmount;
    }

    /**
     * Planned Amount
     * <p>
     * The amount anticipated to be distributed
     * 
     */
    @JsonProperty("plannedAmount")
    public void setPlannedAmount(Object plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public Amounts__1 withPlannedAmount(Object plannedAmount) {
        this.plannedAmount = plannedAmount;
        return this;
    }

    /**
     * Actual Amount
     * <p>
     * The amount that was actually distributed
     * 
     */
    @JsonProperty("actualAmount")
    public Object getActualAmount() {
        return actualAmount;
    }

    /**
     * Actual Amount
     * <p>
     * The amount that was actually distributed
     * 
     */
    @JsonProperty("actualAmount")
    public void setActualAmount(Object actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Amounts__1 withActualAmount(Object actualAmount) {
        this.actualAmount = actualAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Amounts__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("plannedAmount");
        sb.append('=');
        sb.append(((this.plannedAmount == null)?"<null>":this.plannedAmount));
        sb.append(',');
        sb.append("actualAmount");
        sb.append('=');
        sb.append(((this.actualAmount == null)?"<null>":this.actualAmount));
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
        result = ((result* 31)+((this.plannedAmount == null)? 0 :this.plannedAmount.hashCode()));
        result = ((result* 31)+((this.actualAmount == null)? 0 :this.actualAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Amounts__1) == false) {
            return false;
        }
        Amounts__1 rhs = ((Amounts__1) other);
        return (((this.plannedAmount == rhs.plannedAmount)||((this.plannedAmount!= null)&&this.plannedAmount.equals(rhs.plannedAmount)))&&((this.actualAmount == rhs.actualAmount)||((this.actualAmount!= null)&&this.actualAmount.equals(rhs.actualAmount))));
    }

}
