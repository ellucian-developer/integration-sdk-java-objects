
package com.ellucian.generated.eedm.room_rates.v10_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rate",
    "period"
})
@Generated("jsonschema2pojo")
public class Rate {

    /**
     * Rate
     * <p>
     * The rate charged for the room for the period specified.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    @JsonPropertyDescription("The rate charged for the room for the period specified.")
    private Rate__1 rate;
    /**
     * Period
     * <p>
     * The interval for which rate is defined.
     * (Required)
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("The interval for which rate is defined.")
    private Rate.Period period;

    /**
     * Rate
     * <p>
     * The rate charged for the room for the period specified.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public Rate__1 getRate() {
        return rate;
    }

    /**
     * Rate
     * <p>
     * The rate charged for the room for the period specified.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public void setRate(Rate__1 rate) {
        this.rate = rate;
    }

    public Rate withRate(Rate__1 rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Period
     * <p>
     * The interval for which rate is defined.
     * (Required)
     * 
     */
    @JsonProperty("period")
    public Rate.Period getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * The interval for which rate is defined.
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Rate.Period period) {
        this.period = period;
    }

    public Rate withPeriod(Rate.Period period) {
        this.period = period;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
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
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rate) == false) {
            return false;
        }
        Rate rhs = ((Rate) other);
        return (((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))));
    }


    /**
     * Period
     * <p>
     * The interval for which rate is defined.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Period {

        DAY("day"),
        WEEK("week"),
        MONTH("month"),
        TERM("term"),
        YEAR("year");
        private final String value;
        private final static Map<String, Rate.Period> CONSTANTS = new HashMap<String, Rate.Period>();

        static {
            for (Rate.Period c: values()) {
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
        public static Rate.Period fromValue(String value) {
            Rate.Period constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
