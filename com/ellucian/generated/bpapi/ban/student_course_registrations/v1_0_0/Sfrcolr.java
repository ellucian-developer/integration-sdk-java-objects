
package com.ellucian.generated.bpapi.ban.student_course_registrations.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "assessFees",
    "hold"
})
@Generated("jsonschema2pojo")
public class Sfrcolr {

    /**
     * Fees
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("assessFees")
    private String assessFees;
    @JsonProperty("hold")
    private String hold;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fees
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("assessFees")
    public String getAssessFees() {
        return assessFees;
    }

    /**
     * Fees
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("assessFees")
    public void setAssessFees(String assessFees) {
        this.assessFees = assessFees;
    }

    public Sfrcolr withAssessFees(String assessFees) {
        this.assessFees = assessFees;
        return this;
    }

    @JsonProperty("hold")
    public String getHold() {
        return hold;
    }

    @JsonProperty("hold")
    public void setHold(String hold) {
        this.hold = hold;
    }

    public Sfrcolr withHold(String hold) {
        this.hold = hold;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Sfrcolr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfrcolr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("assessFees");
        sb.append('=');
        sb.append(((this.assessFees == null)?"<null>":this.assessFees));
        sb.append(',');
        sb.append("hold");
        sb.append('=');
        sb.append(((this.hold == null)?"<null>":this.hold));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.assessFees == null)? 0 :this.assessFees.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hold == null)? 0 :this.hold.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfrcolr) == false) {
            return false;
        }
        Sfrcolr rhs = ((Sfrcolr) other);
        return ((((this.assessFees == rhs.assessFees)||((this.assessFees!= null)&&this.assessFees.equals(rhs.assessFees)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.hold == rhs.hold)||((this.hold!= null)&&this.hold.equals(rhs.hold))));
    }

}
