
package com.ellucian.generated.eedm.aptitude_assessments.v6_0;

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
 * Calculation
 * <p>
 * The type and method of the calculations to be used to determent the assessment score.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "method"
})
@Generated("jsonschema2pojo")
public class Calculation {

    /**
     * Type
     * <p>
     * The type of calculation to be applied the assessment score.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of calculation to be applied the assessment score.")
    private Calculation.Type type;
    /**
     * Method
     * <p>
     * The calculation method to determine the assessment's score.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("The calculation method to determine the assessment's score.")
    private Object method;

    /**
     * Type
     * <p>
     * The type of calculation to be applied the assessment score.
     * 
     */
    @JsonProperty("type")
    public Calculation.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of calculation to be applied the assessment score.
     * 
     */
    @JsonProperty("type")
    public void setType(Calculation.Type type) {
        this.type = type;
    }

    public Calculation withType(Calculation.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Method
     * <p>
     * The calculation method to determine the assessment's score.
     * 
     */
    @JsonProperty("method")
    public Object getMethod() {
        return method;
    }

    /**
     * Method
     * <p>
     * The calculation method to determine the assessment's score.
     * 
     */
    @JsonProperty("method")
    public void setMethod(Object method) {
        this.method = method;
    }

    public Calculation withMethod(Object method) {
        this.method = method;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Calculation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
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
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Calculation) == false) {
            return false;
        }
        Calculation rhs = ((Calculation) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))));
    }


    /**
     * Type
     * <p>
     * The type of calculation to be applied the assessment score.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        RAW("raw"),
        CALCULATED("calculated");
        private final String value;
        private final static Map<String, Calculation.Type> CONSTANTS = new HashMap<String, Calculation.Type>();

        static {
            for (Calculation.Type c: values()) {
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
        public static Calculation.Type fromValue(String value) {
            Calculation.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
