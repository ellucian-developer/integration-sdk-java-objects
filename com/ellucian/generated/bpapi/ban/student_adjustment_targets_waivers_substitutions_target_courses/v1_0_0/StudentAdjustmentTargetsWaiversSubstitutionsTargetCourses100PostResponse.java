
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substitutions_target_courses.v1_0_0;

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
    "smrstrg",
    "smrstpv"
})
@Generated("jsonschema2pojo")
public class StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostResponse {

    @JsonProperty("smrstrg")
    private List<Smrstrg__1> smrstrg = new ArrayList<Smrstrg__1>();
    @JsonProperty("smrstpv")
    private List<Smrstpv__1> smrstpv = new ArrayList<Smrstpv__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smrstrg")
    public List<Smrstrg__1> getSmrstrg() {
        return smrstrg;
    }

    @JsonProperty("smrstrg")
    public void setSmrstrg(List<Smrstrg__1> smrstrg) {
        this.smrstrg = smrstrg;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostResponse withSmrstrg(List<Smrstrg__1> smrstrg) {
        this.smrstrg = smrstrg;
        return this;
    }

    @JsonProperty("smrstpv")
    public List<Smrstpv__1> getSmrstpv() {
        return smrstpv;
    }

    @JsonProperty("smrstpv")
    public void setSmrstpv(List<Smrstpv__1> smrstpv) {
        this.smrstpv = smrstpv;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostResponse withSmrstpv(List<Smrstpv__1> smrstpv) {
        this.smrstpv = smrstpv;
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("smrstrg");
        sb.append('=');
        sb.append(((this.smrstrg == null)?"<null>":this.smrstrg));
        sb.append(',');
        sb.append("smrstpv");
        sb.append('=');
        sb.append(((this.smrstpv == null)?"<null>":this.smrstpv));
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
        result = ((result* 31)+((this.smrstpv == null)? 0 :this.smrstpv.hashCode()));
        result = ((result* 31)+((this.smrstrg == null)? 0 :this.smrstrg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostResponse) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostResponse rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100PostResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.smrstpv == rhs.smrstpv)||((this.smrstpv!= null)&&this.smrstpv.equals(rhs.smrstpv))))&&((this.smrstrg == rhs.smrstrg)||((this.smrstrg!= null)&&this.smrstrg.equals(rhs.smrstrg))));
    }

}
