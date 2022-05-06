
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substituitions_substitutions.v1_0_0;

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
    "smrsspv",
    "smrssub"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostResponse {

    @JsonProperty("smrsspv")
    private List<Smrsspv__1> smrsspv = new ArrayList<Smrsspv__1>();
    @JsonProperty("smrssub")
    private List<Smrssub__1> smrssub = new ArrayList<Smrssub__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smrsspv")
    public List<Smrsspv__1> getSmrsspv() {
        return smrsspv;
    }

    @JsonProperty("smrsspv")
    public void setSmrsspv(List<Smrsspv__1> smrsspv) {
        this.smrsspv = smrsspv;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostResponse withSmrsspv(List<Smrsspv__1> smrsspv) {
        this.smrsspv = smrsspv;
        return this;
    }

    @JsonProperty("smrssub")
    public List<Smrssub__1> getSmrssub() {
        return smrssub;
    }

    @JsonProperty("smrssub")
    public void setSmrssub(List<Smrssub__1> smrssub) {
        this.smrssub = smrssub;
    }

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostResponse withSmrssub(List<Smrssub__1> smrssub) {
        this.smrssub = smrssub;
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

    public StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("smrsspv");
        sb.append('=');
        sb.append(((this.smrsspv == null)?"<null>":this.smrsspv));
        sb.append(',');
        sb.append("smrssub");
        sb.append('=');
        sb.append(((this.smrssub == null)?"<null>":this.smrssub));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.smrssub == null)? 0 :this.smrssub.hashCode()));
        result = ((result* 31)+((this.smrsspv == null)? 0 :this.smrsspv.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostResponse) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostResponse rhs = ((StudentAdjustmentTargetsWaiversSubstituitionsSubstitutions100PostResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.smrssub == rhs.smrssub)||((this.smrssub!= null)&&this.smrssub.equals(rhs.smrssub))))&&((this.smrsspv == rhs.smrsspv)||((this.smrsspv!= null)&&this.smrsspv.equals(rhs.smrsspv))));
    }

}
