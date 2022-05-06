
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substitutions_other_adjustments_tracking.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "smrsotk",
    "smbsotk"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetResponse {

    @JsonProperty("smrsotk")
    private List<Smrsotk> smrsotk = new ArrayList<Smrsotk>();
    @JsonProperty("smbsotk")
    private List<Smbsotk> smbsotk = new ArrayList<Smbsotk>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smrsotk")
    public List<Smrsotk> getSmrsotk() {
        return smrsotk;
    }

    @JsonProperty("smrsotk")
    public void setSmrsotk(List<Smrsotk> smrsotk) {
        this.smrsotk = smrsotk;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetResponse withSmrsotk(List<Smrsotk> smrsotk) {
        this.smrsotk = smrsotk;
        return this;
    }

    @JsonProperty("smbsotk")
    public List<Smbsotk> getSmbsotk() {
        return smbsotk;
    }

    @JsonProperty("smbsotk")
    public void setSmbsotk(List<Smbsotk> smbsotk) {
        this.smbsotk = smbsotk;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetResponse withSmbsotk(List<Smbsotk> smbsotk) {
        this.smbsotk = smbsotk;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("smrsotk");
        sb.append('=');
        sb.append(((this.smrsotk == null)?"<null>":this.smrsotk));
        sb.append(',');
        sb.append("smbsotk");
        sb.append('=');
        sb.append(((this.smbsotk == null)?"<null>":this.smbsotk));
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
        result = ((result* 31)+((this.smrsotk == null)? 0 :this.smrsotk.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.smbsotk == null)? 0 :this.smbsotk.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetResponse) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetResponse rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsOtherAdjustmentsTracking100GetResponse) other);
        return ((((this.smrsotk == rhs.smrsotk)||((this.smrsotk!= null)&&this.smrsotk.equals(rhs.smrsotk)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.smbsotk == rhs.smbsotk)||((this.smbsotk!= null)&&this.smbsotk.equals(rhs.smbsotk))));
    }

}
