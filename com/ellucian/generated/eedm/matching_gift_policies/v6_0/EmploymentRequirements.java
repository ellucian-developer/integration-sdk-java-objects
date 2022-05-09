
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EmploymentRequirements
 * <p>
 * Duration of service required in months of all employees for gift matching.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fullTimeDuration",
    "partTimeDuration"
})
@Generated("jsonschema2pojo")
public class EmploymentRequirements {

    /**
     * Full Time Duration
     * <p>
     * Duration of service, in months as a full time employee in order to be eligible for matching gifts.
     * 
     */
    @JsonProperty("fullTimeDuration")
    @JsonPropertyDescription("Duration of service, in months as a full time employee in order to be eligible for matching gifts.")
    private Object fullTimeDuration;
    /**
     * Part Time Duration
     * <p>
     * Duration of service, in months as a part time employees for matching gifts.
     * 
     */
    @JsonProperty("partTimeDuration")
    @JsonPropertyDescription("Duration of service, in months as a part time employees for matching gifts.")
    private Object partTimeDuration;

    /**
     * Full Time Duration
     * <p>
     * Duration of service, in months as a full time employee in order to be eligible for matching gifts.
     * 
     */
    @JsonProperty("fullTimeDuration")
    public Object getFullTimeDuration() {
        return fullTimeDuration;
    }

    /**
     * Full Time Duration
     * <p>
     * Duration of service, in months as a full time employee in order to be eligible for matching gifts.
     * 
     */
    @JsonProperty("fullTimeDuration")
    public void setFullTimeDuration(Object fullTimeDuration) {
        this.fullTimeDuration = fullTimeDuration;
    }

    public EmploymentRequirements withFullTimeDuration(Object fullTimeDuration) {
        this.fullTimeDuration = fullTimeDuration;
        return this;
    }

    /**
     * Part Time Duration
     * <p>
     * Duration of service, in months as a part time employees for matching gifts.
     * 
     */
    @JsonProperty("partTimeDuration")
    public Object getPartTimeDuration() {
        return partTimeDuration;
    }

    /**
     * Part Time Duration
     * <p>
     * Duration of service, in months as a part time employees for matching gifts.
     * 
     */
    @JsonProperty("partTimeDuration")
    public void setPartTimeDuration(Object partTimeDuration) {
        this.partTimeDuration = partTimeDuration;
    }

    public EmploymentRequirements withPartTimeDuration(Object partTimeDuration) {
        this.partTimeDuration = partTimeDuration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmploymentRequirements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullTimeDuration");
        sb.append('=');
        sb.append(((this.fullTimeDuration == null)?"<null>":this.fullTimeDuration));
        sb.append(',');
        sb.append("partTimeDuration");
        sb.append('=');
        sb.append(((this.partTimeDuration == null)?"<null>":this.partTimeDuration));
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
        result = ((result* 31)+((this.fullTimeDuration == null)? 0 :this.fullTimeDuration.hashCode()));
        result = ((result* 31)+((this.partTimeDuration == null)? 0 :this.partTimeDuration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmploymentRequirements) == false) {
            return false;
        }
        EmploymentRequirements rhs = ((EmploymentRequirements) other);
        return (((this.fullTimeDuration == rhs.fullTimeDuration)||((this.fullTimeDuration!= null)&&this.fullTimeDuration.equals(rhs.fullTimeDuration)))&&((this.partTimeDuration == rhs.partTimeDuration)||((this.partTimeDuration!= null)&&this.partTimeDuration.equals(rhs.partTimeDuration))));
    }

}
