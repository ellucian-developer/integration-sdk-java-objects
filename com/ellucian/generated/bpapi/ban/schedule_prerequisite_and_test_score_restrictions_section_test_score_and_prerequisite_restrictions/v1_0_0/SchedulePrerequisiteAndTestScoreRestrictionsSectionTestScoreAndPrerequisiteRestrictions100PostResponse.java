
package com.ellucian.generated.bpapi.ban.schedule_prerequisite_and_test_score_restrictions_section_test_score_and_prerequisite_restrictions.v1_0_0;

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
    "ssbsect",
    "ssrrare",
    "ssrrtst"
})
@Generated("jsonschema2pojo")
public class SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostResponse {

    @JsonProperty("ssbsect")
    private List<Ssbsect> ssbsect = new ArrayList<Ssbsect>();
    @JsonProperty("ssrrare")
    private List<Ssrrare__1> ssrrare = new ArrayList<Ssrrare__1>();
    @JsonProperty("ssrrtst")
    private List<Ssrrtst__1> ssrrtst = new ArrayList<Ssrrtst__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssbsect")
    public List<Ssbsect> getSsbsect() {
        return ssbsect;
    }

    @JsonProperty("ssbsect")
    public void setSsbsect(List<Ssbsect> ssbsect) {
        this.ssbsect = ssbsect;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostResponse withSsbsect(List<Ssbsect> ssbsect) {
        this.ssbsect = ssbsect;
        return this;
    }

    @JsonProperty("ssrrare")
    public List<Ssrrare__1> getSsrrare() {
        return ssrrare;
    }

    @JsonProperty("ssrrare")
    public void setSsrrare(List<Ssrrare__1> ssrrare) {
        this.ssrrare = ssrrare;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostResponse withSsrrare(List<Ssrrare__1> ssrrare) {
        this.ssrrare = ssrrare;
        return this;
    }

    @JsonProperty("ssrrtst")
    public List<Ssrrtst__1> getSsrrtst() {
        return ssrrtst;
    }

    @JsonProperty("ssrrtst")
    public void setSsrrtst(List<Ssrrtst__1> ssrrtst) {
        this.ssrrtst = ssrrtst;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostResponse withSsrrtst(List<Ssrrtst__1> ssrrtst) {
        this.ssrrtst = ssrrtst;
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssbsect");
        sb.append('=');
        sb.append(((this.ssbsect == null)?"<null>":this.ssbsect));
        sb.append(',');
        sb.append("ssrrare");
        sb.append('=');
        sb.append(((this.ssrrare == null)?"<null>":this.ssrrare));
        sb.append(',');
        sb.append("ssrrtst");
        sb.append('=');
        sb.append(((this.ssrrtst == null)?"<null>":this.ssrrtst));
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
        result = ((result* 31)+((this.ssrrtst == null)? 0 :this.ssrrtst.hashCode()));
        result = ((result* 31)+((this.ssbsect == null)? 0 :this.ssbsect.hashCode()));
        result = ((result* 31)+((this.ssrrare == null)? 0 :this.ssrrare.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostResponse) == false) {
            return false;
        }
        SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostResponse rhs = ((SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PostResponse) other);
        return (((((this.ssrrtst == rhs.ssrrtst)||((this.ssrrtst!= null)&&this.ssrrtst.equals(rhs.ssrrtst)))&&((this.ssbsect == rhs.ssbsect)||((this.ssbsect!= null)&&this.ssbsect.equals(rhs.ssbsect))))&&((this.ssrrare == rhs.ssrrare)||((this.ssrrare!= null)&&this.ssrrare.equals(rhs.ssrrare))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
