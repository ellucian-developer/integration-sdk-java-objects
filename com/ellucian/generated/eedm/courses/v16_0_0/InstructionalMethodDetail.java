
package com.ellucian.generated.eedm.courses.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instructionalMethod",
    "instructionalDeliveryMethod"
})
@Generated("jsonschema2pojo")
public class InstructionalMethodDetail {

    /**
     * Instructional Method
     * <p>
     * The method, style, or format in which the course is taught (for example, 'Lecture', 'Lab').
     * (Required)
     * 
     */
    @JsonProperty("instructionalMethod")
    @JsonPropertyDescription("The method, style, or format in which the course is taught (for example, 'Lecture', 'Lab').")
    private InstructionalMethod instructionalMethod;
    /**
     * Instructional Delivery Method
     * <p>
     * The delivery method used for instruction.
     * 
     */
    @JsonProperty("instructionalDeliveryMethod")
    @JsonPropertyDescription("The delivery method used for instruction.")
    private Object instructionalDeliveryMethod;

    /**
     * Instructional Method
     * <p>
     * The method, style, or format in which the course is taught (for example, 'Lecture', 'Lab').
     * (Required)
     * 
     */
    @JsonProperty("instructionalMethod")
    public InstructionalMethod getInstructionalMethod() {
        return instructionalMethod;
    }

    /**
     * Instructional Method
     * <p>
     * The method, style, or format in which the course is taught (for example, 'Lecture', 'Lab').
     * (Required)
     * 
     */
    @JsonProperty("instructionalMethod")
    public void setInstructionalMethod(InstructionalMethod instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
    }

    public InstructionalMethodDetail withInstructionalMethod(InstructionalMethod instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
        return this;
    }

    /**
     * Instructional Delivery Method
     * <p>
     * The delivery method used for instruction.
     * 
     */
    @JsonProperty("instructionalDeliveryMethod")
    public Object getInstructionalDeliveryMethod() {
        return instructionalDeliveryMethod;
    }

    /**
     * Instructional Delivery Method
     * <p>
     * The delivery method used for instruction.
     * 
     */
    @JsonProperty("instructionalDeliveryMethod")
    public void setInstructionalDeliveryMethod(Object instructionalDeliveryMethod) {
        this.instructionalDeliveryMethod = instructionalDeliveryMethod;
    }

    public InstructionalMethodDetail withInstructionalDeliveryMethod(Object instructionalDeliveryMethod) {
        this.instructionalDeliveryMethod = instructionalDeliveryMethod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstructionalMethodDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instructionalMethod");
        sb.append('=');
        sb.append(((this.instructionalMethod == null)?"<null>":this.instructionalMethod));
        sb.append(',');
        sb.append("instructionalDeliveryMethod");
        sb.append('=');
        sb.append(((this.instructionalDeliveryMethod == null)?"<null>":this.instructionalDeliveryMethod));
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
        result = ((result* 31)+((this.instructionalDeliveryMethod == null)? 0 :this.instructionalDeliveryMethod.hashCode()));
        result = ((result* 31)+((this.instructionalMethod == null)? 0 :this.instructionalMethod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstructionalMethodDetail) == false) {
            return false;
        }
        InstructionalMethodDetail rhs = ((InstructionalMethodDetail) other);
        return (((this.instructionalDeliveryMethod == rhs.instructionalDeliveryMethod)||((this.instructionalDeliveryMethod!= null)&&this.instructionalDeliveryMethod.equals(rhs.instructionalDeliveryMethod)))&&((this.instructionalMethod == rhs.instructionalMethod)||((this.instructionalMethod!= null)&&this.instructionalMethod.equals(rhs.instructionalMethod))));
    }

}
