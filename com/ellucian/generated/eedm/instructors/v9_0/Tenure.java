
package com.ellucian.generated.eedm.instructors.v9_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Tenure
 * <p>
 * The tenure of the instructor.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "startOn",
    "reviewedOn"
})
@Generated("jsonschema2pojo")
public class Tenure {

    /**
     * Type
     * <p>
     * The type of tenure (e.g tenured, non-tenured, on track, ineligible, without faculty status).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of tenure (e.g tenured, non-tenured, on track, ineligible, without faculty status).")
    private Type type;
    /**
     * Start On
     * <p>
     * The date when tenure was awarded to the instructor.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when tenure was awarded to the instructor.")
    private Object startOn;
    /**
     * Reviewed On
     * <p>
     * The date the instructor was last reviewed for tenure.
     * 
     */
    @JsonProperty("reviewedOn")
    @JsonPropertyDescription("The date the instructor was last reviewed for tenure.")
    private Object reviewedOn;

    /**
     * Type
     * <p>
     * The type of tenure (e.g tenured, non-tenured, on track, ineligible, without faculty status).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of tenure (e.g tenured, non-tenured, on track, ineligible, without faculty status).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public Tenure withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when tenure was awarded to the instructor.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when tenure was awarded to the instructor.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Tenure withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * Reviewed On
     * <p>
     * The date the instructor was last reviewed for tenure.
     * 
     */
    @JsonProperty("reviewedOn")
    public Object getReviewedOn() {
        return reviewedOn;
    }

    /**
     * Reviewed On
     * <p>
     * The date the instructor was last reviewed for tenure.
     * 
     */
    @JsonProperty("reviewedOn")
    public void setReviewedOn(Object reviewedOn) {
        this.reviewedOn = reviewedOn;
    }

    public Tenure withReviewedOn(Object reviewedOn) {
        this.reviewedOn = reviewedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tenure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("reviewedOn");
        sb.append('=');
        sb.append(((this.reviewedOn == null)?"<null>":this.reviewedOn));
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
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.reviewedOn == null)? 0 :this.reviewedOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tenure) == false) {
            return false;
        }
        Tenure rhs = ((Tenure) other);
        return ((((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.reviewedOn == rhs.reviewedOn)||((this.reviewedOn!= null)&&this.reviewedOn.equals(rhs.reviewedOn))));
    }

}
