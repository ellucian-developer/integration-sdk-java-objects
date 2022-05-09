
package com.ellucian.generated.eedm.institution_jobs.v12_1_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Amount
 * <p>
 * The amount of salary for the job.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "period",
    "rate"
})
@Generated("jsonschema2pojo")
public class Amount {

    /**
     * Period
     * <p>
     * The time period of the salary.
     * (Required)
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("The time period of the salary.")
    private Amount.Period period;
    /**
     * Rate
     * <p>
     * The amount awarded per time period.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    @JsonPropertyDescription("The amount awarded per time period.")
    private Rate rate;

    /**
     * Period
     * <p>
     * The time period of the salary.
     * (Required)
     * 
     */
    @JsonProperty("period")
    public Amount.Period getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * The time period of the salary.
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Amount.Period period) {
        this.period = period;
    }

    public Amount withPeriod(Amount.Period period) {
        this.period = period;
        return this;
    }

    /**
     * Rate
     * <p>
     * The amount awarded per time period.
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
     * The amount awarded per time period.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Amount withRate(Rate rate) {
        this.rate = rate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Amount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Amount) == false) {
            return false;
        }
        Amount rhs = ((Amount) other);
        return (((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))));
    }


    /**
     * Period
     * <p>
     * The time period of the salary.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Period {

        HOUR("hour"),
        YEAR("year"),
        CONTRACT("contract");
        private final String value;
        private final static Map<String, Amount.Period> CONSTANTS = new HashMap<String, Amount.Period>();

        static {
            for (Amount.Period c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Period(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Amount.Period fromValue(String value) {
            Amount.Period constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
