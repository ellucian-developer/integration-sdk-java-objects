
package com.ellucian.generated.eedm.constituent_ratings.v15_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Screening
 * <p>
 * The target type and the method of screening used for the rating.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "targetType",
    "method"
})
@Generated("jsonschema2pojo")
public class Screening {

    /**
     * Target Type
     * <p>
     * The target type of the screening, e.g.: individual, household.
     * 
     */
    @JsonProperty("targetType")
    @JsonPropertyDescription("The target type of the screening, e.g.: individual, household.")
    private Object targetType;
    /**
     * Method
     * <p>
     * The method used in screening the target, e.g.: staff visit, peer evaluation, etc.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("The method used in screening the target, e.g.: staff visit, peer evaluation, etc.")
    private Object method;

    /**
     * Target Type
     * <p>
     * The target type of the screening, e.g.: individual, household.
     * 
     */
    @JsonProperty("targetType")
    public Object getTargetType() {
        return targetType;
    }

    /**
     * Target Type
     * <p>
     * The target type of the screening, e.g.: individual, household.
     * 
     */
    @JsonProperty("targetType")
    public void setTargetType(Object targetType) {
        this.targetType = targetType;
    }

    public Screening withTargetType(Object targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Method
     * <p>
     * The method used in screening the target, e.g.: staff visit, peer evaluation, etc.
     * 
     */
    @JsonProperty("method")
    public Object getMethod() {
        return method;
    }

    /**
     * Method
     * <p>
     * The method used in screening the target, e.g.: staff visit, peer evaluation, etc.
     * 
     */
    @JsonProperty("method")
    public void setMethod(Object method) {
        this.method = method;
    }

    public Screening withMethod(Object method) {
        this.method = method;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Screening.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("targetType");
        sb.append('=');
        sb.append(((this.targetType == null)?"<null>":this.targetType));
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
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.targetType == null)? 0 :this.targetType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Screening) == false) {
            return false;
        }
        Screening rhs = ((Screening) other);
        return (((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method)))&&((this.targetType == rhs.targetType)||((this.targetType!= null)&&this.targetType.equals(rhs.targetType))));
    }

}
