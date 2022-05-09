
package com.ellucian.generated.eedm.advancement_membership_program_levels.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "designation",
    "allocation"
})
@Generated("jsonschema2pojo")
public class Designation {

    /**
     * Designation
     * <p>
     * The designated use of the dues for the membership program level.
     * (Required)
     * 
     */
    @JsonProperty("designation")
    @JsonPropertyDescription("The designated use of the dues for the membership program level.")
    private Designation__1 designation;
    /**
     * Allocation
     * <p>
     * The percentage of the dues allocated to the designation.
     * 
     */
    @JsonProperty("allocation")
    @JsonPropertyDescription("The percentage of the dues allocated to the designation.")
    private Object allocation;

    /**
     * Designation
     * <p>
     * The designated use of the dues for the membership program level.
     * (Required)
     * 
     */
    @JsonProperty("designation")
    public Designation__1 getDesignation() {
        return designation;
    }

    /**
     * Designation
     * <p>
     * The designated use of the dues for the membership program level.
     * (Required)
     * 
     */
    @JsonProperty("designation")
    public void setDesignation(Designation__1 designation) {
        this.designation = designation;
    }

    public Designation withDesignation(Designation__1 designation) {
        this.designation = designation;
        return this;
    }

    /**
     * Allocation
     * <p>
     * The percentage of the dues allocated to the designation.
     * 
     */
    @JsonProperty("allocation")
    public Object getAllocation() {
        return allocation;
    }

    /**
     * Allocation
     * <p>
     * The percentage of the dues allocated to the designation.
     * 
     */
    @JsonProperty("allocation")
    public void setAllocation(Object allocation) {
        this.allocation = allocation;
    }

    public Designation withAllocation(Object allocation) {
        this.allocation = allocation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Designation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("allocation");
        sb.append('=');
        sb.append(((this.allocation == null)?"<null>":this.allocation));
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
        result = ((result* 31)+((this.allocation == null)? 0 :this.allocation.hashCode()));
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Designation) == false) {
            return false;
        }
        Designation rhs = ((Designation) other);
        return (((this.allocation == rhs.allocation)||((this.allocation!= null)&&this.allocation.equals(rhs.allocation)))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))));
    }

}
