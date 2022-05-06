
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substitutions_waivers.v1_0_0;

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
    "smrswpv",
    "smrswav"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PostResponse {

    @JsonProperty("smrswpv")
    private List<Smrswpv__1> smrswpv = new ArrayList<Smrswpv__1>();
    @JsonProperty("smrswav")
    private List<Smrswav__1> smrswav = new ArrayList<Smrswav__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smrswpv")
    public List<Smrswpv__1> getSmrswpv() {
        return smrswpv;
    }

    @JsonProperty("smrswpv")
    public void setSmrswpv(List<Smrswpv__1> smrswpv) {
        this.smrswpv = smrswpv;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PostResponse withSmrswpv(List<Smrswpv__1> smrswpv) {
        this.smrswpv = smrswpv;
        return this;
    }

    @JsonProperty("smrswav")
    public List<Smrswav__1> getSmrswav() {
        return smrswav;
    }

    @JsonProperty("smrswav")
    public void setSmrswav(List<Smrswav__1> smrswav) {
        this.smrswav = smrswav;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PostResponse withSmrswav(List<Smrswav__1> smrswav) {
        this.smrswav = smrswav;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("smrswpv");
        sb.append('=');
        sb.append(((this.smrswpv == null)?"<null>":this.smrswpv));
        sb.append(',');
        sb.append("smrswav");
        sb.append('=');
        sb.append(((this.smrswav == null)?"<null>":this.smrswav));
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
        result = ((result* 31)+((this.smrswav == null)? 0 :this.smrswav.hashCode()));
        result = ((result* 31)+((this.smrswpv == null)? 0 :this.smrswpv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PostResponse) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PostResponse rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsWaivers100PostResponse) other);
        return ((((this.smrswav == rhs.smrswav)||((this.smrswav!= null)&&this.smrswav.equals(rhs.smrswav)))&&((this.smrswpv == rhs.smrswpv)||((this.smrswpv!= null)&&this.smrswpv.equals(rhs.smrswpv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
