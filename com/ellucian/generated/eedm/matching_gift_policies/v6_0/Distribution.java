
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

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
 * Distribution
 * <p>
 * Gift distribution details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frequency",
    "dates"
})
@Generated("jsonschema2pojo")
public class Distribution {

    /**
     * Frequency
     * <p>
     * Gift distribution frequency
     * 
     */
    @JsonProperty("frequency")
    @JsonPropertyDescription("Gift distribution frequency")
    private Distribution.Frequency frequency;
    /**
     * Dates
     * <p>
     * 
     * 
     */
    @JsonProperty("dates")
    @JsonPropertyDescription("")
    private Object dates;

    /**
     * Frequency
     * <p>
     * Gift distribution frequency
     * 
     */
    @JsonProperty("frequency")
    public Distribution.Frequency getFrequency() {
        return frequency;
    }

    /**
     * Frequency
     * <p>
     * Gift distribution frequency
     * 
     */
    @JsonProperty("frequency")
    public void setFrequency(Distribution.Frequency frequency) {
        this.frequency = frequency;
    }

    public Distribution withFrequency(Distribution.Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Dates
     * <p>
     * 
     * 
     */
    @JsonProperty("dates")
    public Object getDates() {
        return dates;
    }

    /**
     * Dates
     * <p>
     * 
     * 
     */
    @JsonProperty("dates")
    public void setDates(Object dates) {
        this.dates = dates;
    }

    public Distribution withDates(Object dates) {
        this.dates = dates;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Distribution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frequency");
        sb.append('=');
        sb.append(((this.frequency == null)?"<null>":this.frequency));
        sb.append(',');
        sb.append("dates");
        sb.append('=');
        sb.append(((this.dates == null)?"<null>":this.dates));
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
        result = ((result* 31)+((this.dates == null)? 0 :this.dates.hashCode()));
        result = ((result* 31)+((this.frequency == null)? 0 :this.frequency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Distribution) == false) {
            return false;
        }
        Distribution rhs = ((Distribution) other);
        return (((this.dates == rhs.dates)||((this.dates!= null)&&this.dates.equals(rhs.dates)))&&((this.frequency == rhs.frequency)||((this.frequency!= null)&&this.frequency.equals(rhs.frequency))));
    }


    /**
     * Frequency
     * <p>
     * Gift distribution frequency
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Frequency {

        CONTINUOUSLY("continuously"),
        MONTHLY("monthly"),
        QUARTERLY("quarterly"),
        ANNUALLY("annually"),
        SEMI_ANNUALLY("semiAnnually");
        private final String value;
        private final static Map<String, Distribution.Frequency> CONSTANTS = new HashMap<String, Distribution.Frequency>();

        static {
            for (Distribution.Frequency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Frequency(String value) {
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
        public static Distribution.Frequency fromValue(String value) {
            Distribution.Frequency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
