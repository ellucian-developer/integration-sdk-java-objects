
package com.ellucian.generated.eedm.institution_positions.v11_0;

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
    "period",
    "hours"
})
@Generated("jsonschema2pojo")
public class HoursPerPeriod {

    /**
     * Period
     * <p>
     * The defined time period (e.g. day, week, month, etc).
     * (Required)
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("The defined time period (e.g. day, week, month, etc).")
    private HoursPerPeriod.Period period;
    /**
     * Hours
     * <p>
     * The number of hours of work in the specified time period.
     * (Required)
     * 
     */
    @JsonProperty("hours")
    @JsonPropertyDescription("The number of hours of work in the specified time period.")
    private Double hours;

    /**
     * Period
     * <p>
     * The defined time period (e.g. day, week, month, etc).
     * (Required)
     * 
     */
    @JsonProperty("period")
    public HoursPerPeriod.Period getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * The defined time period (e.g. day, week, month, etc).
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(HoursPerPeriod.Period period) {
        this.period = period;
    }

    public HoursPerPeriod withPeriod(HoursPerPeriod.Period period) {
        this.period = period;
        return this;
    }

    /**
     * Hours
     * <p>
     * The number of hours of work in the specified time period.
     * (Required)
     * 
     */
    @JsonProperty("hours")
    public Double getHours() {
        return hours;
    }

    /**
     * Hours
     * <p>
     * The number of hours of work in the specified time period.
     * (Required)
     * 
     */
    @JsonProperty("hours")
    public void setHours(Double hours) {
        this.hours = hours;
    }

    public HoursPerPeriod withHours(Double hours) {
        this.hours = hours;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HoursPerPeriod.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("hours");
        sb.append('=');
        sb.append(((this.hours == null)?"<null>":this.hours));
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
        result = ((result* 31)+((this.hours == null)? 0 :this.hours.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HoursPerPeriod) == false) {
            return false;
        }
        HoursPerPeriod rhs = ((HoursPerPeriod) other);
        return (((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period)))&&((this.hours == rhs.hours)||((this.hours!= null)&&this.hours.equals(rhs.hours))));
    }


    /**
     * Period
     * <p>
     * The defined time period (e.g. day, week, month, etc).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Period {

        DAY("day"),
        WEEK("week"),
        MONTH("month"),
        YEAR("year"),
        PAY_PERIOD("payPeriod");
        private final String value;
        private final static Map<String, HoursPerPeriod.Period> CONSTANTS = new HashMap<String, HoursPerPeriod.Period>();

        static {
            for (HoursPerPeriod.Period c: values()) {
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
        public static HoursPerPeriod.Period fromValue(String value) {
            HoursPerPeriod.Period constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
