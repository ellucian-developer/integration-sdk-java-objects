
package com.ellucian.generated.eedm.courses.v6_0;

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
    "creditCategory",
    "measure",
    "minimum",
    "maximum",
    "increment"
})
@Generated("jsonschema2pojo")
public class Credit {

    /**
     * Credit Category
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("creditCategory")
    @JsonPropertyDescription("")
    private CreditCategory creditCategory;
    /**
     * Measure
     * <p>
     * A unit or standard of measurement for a course credit.
     * (Required)
     * 
     */
    @JsonProperty("measure")
    @JsonPropertyDescription("A unit or standard of measurement for a course credit.")
    private Credit.Measure measure;
    /**
     * Minimum number
     * <p>
     * The lower, inclusive bound of the range of values for a course credit.
     * (Required)
     * 
     */
    @JsonProperty("minimum")
    @JsonPropertyDescription("The lower, inclusive bound of the range of values for a course credit.")
    private Double minimum;
    /**
     * Maximum number
     * <p>
     * The upper, inclusive bound of the range of values for a course credit.
     * 
     */
    @JsonProperty("maximum")
    @JsonPropertyDescription("The upper, inclusive bound of the range of values for a course credit.")
    private Object maximum;
    /**
     * Increment number
     * <p>
     * The increment by which the range of values for a course credit can change from the minimum to the maximum. For example, a range of 1 to 3 with an increment of 1 would evaluate to 1, 2, or 3. Specifying an increment of 0.5 would evaluate to 1, 1.5, 2, 2.5, or 3.
     * 
     */
    @JsonProperty("increment")
    @JsonPropertyDescription("The increment by which the range of values for a course credit can change from the minimum to the maximum. For example, a range of 1 to 3 with an increment of 1 would evaluate to 1, 2, or 3. Specifying an increment of 0.5 would evaluate to 1, 1.5, 2, 2.5, or 3.")
    private Object increment;

    /**
     * Credit Category
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("creditCategory")
    public CreditCategory getCreditCategory() {
        return creditCategory;
    }

    /**
     * Credit Category
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("creditCategory")
    public void setCreditCategory(CreditCategory creditCategory) {
        this.creditCategory = creditCategory;
    }

    public Credit withCreditCategory(CreditCategory creditCategory) {
        this.creditCategory = creditCategory;
        return this;
    }

    /**
     * Measure
     * <p>
     * A unit or standard of measurement for a course credit.
     * (Required)
     * 
     */
    @JsonProperty("measure")
    public Credit.Measure getMeasure() {
        return measure;
    }

    /**
     * Measure
     * <p>
     * A unit or standard of measurement for a course credit.
     * (Required)
     * 
     */
    @JsonProperty("measure")
    public void setMeasure(Credit.Measure measure) {
        this.measure = measure;
    }

    public Credit withMeasure(Credit.Measure measure) {
        this.measure = measure;
        return this;
    }

    /**
     * Minimum number
     * <p>
     * The lower, inclusive bound of the range of values for a course credit.
     * (Required)
     * 
     */
    @JsonProperty("minimum")
    public Double getMinimum() {
        return minimum;
    }

    /**
     * Minimum number
     * <p>
     * The lower, inclusive bound of the range of values for a course credit.
     * (Required)
     * 
     */
    @JsonProperty("minimum")
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    public Credit withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Maximum number
     * <p>
     * The upper, inclusive bound of the range of values for a course credit.
     * 
     */
    @JsonProperty("maximum")
    public Object getMaximum() {
        return maximum;
    }

    /**
     * Maximum number
     * <p>
     * The upper, inclusive bound of the range of values for a course credit.
     * 
     */
    @JsonProperty("maximum")
    public void setMaximum(Object maximum) {
        this.maximum = maximum;
    }

    public Credit withMaximum(Object maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Increment number
     * <p>
     * The increment by which the range of values for a course credit can change from the minimum to the maximum. For example, a range of 1 to 3 with an increment of 1 would evaluate to 1, 2, or 3. Specifying an increment of 0.5 would evaluate to 1, 1.5, 2, 2.5, or 3.
     * 
     */
    @JsonProperty("increment")
    public Object getIncrement() {
        return increment;
    }

    /**
     * Increment number
     * <p>
     * The increment by which the range of values for a course credit can change from the minimum to the maximum. For example, a range of 1 to 3 with an increment of 1 would evaluate to 1, 2, or 3. Specifying an increment of 0.5 would evaluate to 1, 1.5, 2, 2.5, or 3.
     * 
     */
    @JsonProperty("increment")
    public void setIncrement(Object increment) {
        this.increment = increment;
    }

    public Credit withIncrement(Object increment) {
        this.increment = increment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Credit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("creditCategory");
        sb.append('=');
        sb.append(((this.creditCategory == null)?"<null>":this.creditCategory));
        sb.append(',');
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
        sb.append(',');
        sb.append("minimum");
        sb.append('=');
        sb.append(((this.minimum == null)?"<null>":this.minimum));
        sb.append(',');
        sb.append("maximum");
        sb.append('=');
        sb.append(((this.maximum == null)?"<null>":this.maximum));
        sb.append(',');
        sb.append("increment");
        sb.append('=');
        sb.append(((this.increment == null)?"<null>":this.increment));
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
        result = ((result* 31)+((this.maximum == null)? 0 :this.maximum.hashCode()));
        result = ((result* 31)+((this.increment == null)? 0 :this.increment.hashCode()));
        result = ((result* 31)+((this.measure == null)? 0 :this.measure.hashCode()));
        result = ((result* 31)+((this.minimum == null)? 0 :this.minimum.hashCode()));
        result = ((result* 31)+((this.creditCategory == null)? 0 :this.creditCategory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Credit) == false) {
            return false;
        }
        Credit rhs = ((Credit) other);
        return ((((((this.maximum == rhs.maximum)||((this.maximum!= null)&&this.maximum.equals(rhs.maximum)))&&((this.increment == rhs.increment)||((this.increment!= null)&&this.increment.equals(rhs.increment))))&&((this.measure == rhs.measure)||((this.measure!= null)&&this.measure.equals(rhs.measure))))&&((this.minimum == rhs.minimum)||((this.minimum!= null)&&this.minimum.equals(rhs.minimum))))&&((this.creditCategory == rhs.creditCategory)||((this.creditCategory!= null)&&this.creditCategory.equals(rhs.creditCategory))));
    }


    /**
     * Measure
     * <p>
     * A unit or standard of measurement for a course credit.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Measure {

        CREDIT("credit"),
        CEU("ceu"),
        HOUR("hour");
        private final String value;
        private final static Map<String, Credit.Measure> CONSTANTS = new HashMap<String, Credit.Measure>();

        static {
            for (Credit.Measure c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Measure(String value) {
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
        public static Credit.Measure fromValue(String value) {
            Credit.Measure constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
