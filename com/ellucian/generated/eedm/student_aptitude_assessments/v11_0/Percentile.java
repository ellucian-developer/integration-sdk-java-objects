
package com.ellucian.generated.eedm.student_aptitude_assessments.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "type"
})
@Generated("jsonschema2pojo")
public class Percentile {

    /**
     * Percentile Value
     * <p>
     * The percentile calculated for the score.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The percentile calculated for the score.")
    private Double value;
    /**
     * Percentile Type
     * <p>
     * The user defined type of the percentile.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The user defined type of the percentile.")
    private Type type;

    /**
     * Percentile Value
     * <p>
     * The percentile calculated for the score.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * Percentile Value
     * <p>
     * The percentile calculated for the score.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    public Percentile withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Percentile Type
     * <p>
     * The user defined type of the percentile.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Percentile Type
     * <p>
     * The user defined type of the percentile.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public Percentile withType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Percentile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Percentile) == false) {
            return false;
        }
        Percentile rhs = ((Percentile) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
