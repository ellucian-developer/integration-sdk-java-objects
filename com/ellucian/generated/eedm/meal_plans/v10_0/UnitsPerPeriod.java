
package com.ellucian.generated.eedm.meal_plans.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Units Per Period
 * <p>
 * The maximum number of units within a time period allowed for the meal plan component.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numberOfUnits",
    "period"
})
@Generated("jsonschema2pojo")
public class UnitsPerPeriod {

    /**
     * Number of Units
     * <p>
     * The number of units allowed.
     * 
     */
    @JsonProperty("numberOfUnits")
    @JsonPropertyDescription("The number of units allowed.")
    private Object numberOfUnits;
    /**
     * Period
     * <p>
     * The time period for the restriction.
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("The time period for the restriction.")
    private Object period;

    /**
     * Number of Units
     * <p>
     * The number of units allowed.
     * 
     */
    @JsonProperty("numberOfUnits")
    public Object getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Number of Units
     * <p>
     * The number of units allowed.
     * 
     */
    @JsonProperty("numberOfUnits")
    public void setNumberOfUnits(Object numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public UnitsPerPeriod withNumberOfUnits(Object numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
        return this;
    }

    /**
     * Period
     * <p>
     * The time period for the restriction.
     * 
     */
    @JsonProperty("period")
    public Object getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * The time period for the restriction.
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Object period) {
        this.period = period;
    }

    public UnitsPerPeriod withPeriod(Object period) {
        this.period = period;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UnitsPerPeriod.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numberOfUnits");
        sb.append('=');
        sb.append(((this.numberOfUnits == null)?"<null>":this.numberOfUnits));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.numberOfUnits == null)? 0 :this.numberOfUnits.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UnitsPerPeriod) == false) {
            return false;
        }
        UnitsPerPeriod rhs = ((UnitsPerPeriod) other);
        return (((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period)))&&((this.numberOfUnits == rhs.numberOfUnits)||((this.numberOfUnits!= null)&&this.numberOfUnits.equals(rhs.numberOfUnits))));
    }

}
