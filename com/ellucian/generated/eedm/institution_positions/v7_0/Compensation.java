
package com.ellucian.generated.eedm.institution_positions.v7_0;

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
 * Compensation
 * <p>
 * The salary or wages awarded for the position.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "range"
})
@Generated("jsonschema2pojo")
public class Compensation {

    /**
     * Type
     * <p>
     * The type of compensation awarded (e.g. salary, wages, etc.)
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of compensation awarded (e.g. salary, wages, etc.)")
    private Compensation.Type type;
    /**
     * Range
     * <p>
     * The range of compensation awarded for the position.
     * (Required)
     * 
     */
    @JsonProperty("range")
    @JsonPropertyDescription("The range of compensation awarded for the position.")
    private Range range;

    /**
     * Type
     * <p>
     * The type of compensation awarded (e.g. salary, wages, etc.)
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Compensation.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of compensation awarded (e.g. salary, wages, etc.)
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Compensation.Type type) {
        this.type = type;
    }

    public Compensation withType(Compensation.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Range
     * <p>
     * The range of compensation awarded for the position.
     * (Required)
     * 
     */
    @JsonProperty("range")
    public Range getRange() {
        return range;
    }

    /**
     * Range
     * <p>
     * The range of compensation awarded for the position.
     * (Required)
     * 
     */
    @JsonProperty("range")
    public void setRange(Range range) {
        this.range = range;
    }

    public Compensation withRange(Range range) {
        this.range = range;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Compensation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("range");
        sb.append('=');
        sb.append(((this.range == null)?"<null>":this.range));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.range == null)? 0 :this.range.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Compensation) == false) {
            return false;
        }
        Compensation rhs = ((Compensation) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.range == rhs.range)||((this.range!= null)&&this.range.equals(rhs.range))));
    }


    /**
     * Type
     * <p>
     * The type of compensation awarded (e.g. salary, wages, etc.)
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        SALARY("salary"),
        WAGES("wages");
        private final String value;
        private final static Map<String, Compensation.Type> CONSTANTS = new HashMap<String, Compensation.Type>();

        static {
            for (Compensation.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Compensation.Type fromValue(String value) {
            Compensation.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
