
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
public class StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100GetResponse {

    @JsonProperty("smrstrg")
    private List<Smrstrg> smrstrg = new ArrayList<Smrstrg>();
    @JsonProperty("smrstpv")
    private List<Smrstpv> smrstpv = new ArrayList<Smrstpv>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smrstrg")
    public List<Smrstrg> getSmrstrg() {
        return smrstrg;
    }

    @JsonProperty("smrstrg")
    public void setSmrstrg(List<Smrstrg> smrstrg) {
        this.smrstrg = smrstrg;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100GetResponse withSmrstrg(List<Smrstrg> smrstrg) {
        this.smrstrg = smrstrg;
        return this;
    }

    @JsonProperty("smrstpv")
    public List<Smrstpv> getSmrstpv() {
        return smrstpv;
    }

    @JsonProperty("smrstpv")
    public void setSmrstpv(List<Smrstpv> smrstpv) {
        this.smrstpv = smrstpv;
    }

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100GetResponse withSmrstpv(List<Smrstpv> smrstpv) {
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

    public StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100GetResponse) == false) {
            return false;
        }
        StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100GetResponse rhs = ((StudentAdjustmentTargetsWaiversSubstitutionsTargetCourses100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.smrstpv == rhs.smrstpv)||((this.smrstpv!= null)&&this.smrstpv.equals(rhs.smrstpv))))&&((this.smrstrg == rhs.smrstrg)||((this.smrstrg!= null)&&this.smrstrg.equals(rhs.smrstrg))));
    }

}
