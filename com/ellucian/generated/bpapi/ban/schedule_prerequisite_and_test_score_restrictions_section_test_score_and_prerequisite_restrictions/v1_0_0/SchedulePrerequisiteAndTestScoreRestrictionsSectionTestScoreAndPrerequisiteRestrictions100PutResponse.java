
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
public class SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutResponse {

    @JsonProperty("ssbsect")
    private List<Ssbsect__1> ssbsect = new ArrayList<Ssbsect__1>();
    @JsonProperty("ssrrare")
    private List<Ssrrare__2> ssrrare = new ArrayList<Ssrrare__2>();
    @JsonProperty("ssrrtst")
    private List<Ssrrtst__2> ssrrtst = new ArrayList<Ssrrtst__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssbsect")
    public List<Ssbsect__1> getSsbsect() {
        return ssbsect;
    }

    @JsonProperty("ssbsect")
    public void setSsbsect(List<Ssbsect__1> ssbsect) {
        this.ssbsect = ssbsect;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutResponse withSsbsect(List<Ssbsect__1> ssbsect) {
        this.ssbsect = ssbsect;
        return this;
    }

    @JsonProperty("ssrrare")
    public List<Ssrrare__2> getSsrrare() {
        return ssrrare;
    }

    @JsonProperty("ssrrare")
    public void setSsrrare(List<Ssrrare__2> ssrrare) {
        this.ssrrare = ssrrare;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutResponse withSsrrare(List<Ssrrare__2> ssrrare) {
        this.ssrrare = ssrrare;
        return this;
    }

    @JsonProperty("ssrrtst")
    public List<Ssrrtst__2> getSsrrtst() {
        return ssrrtst;
    }

    @JsonProperty("ssrrtst")
    public void setSsrrtst(List<Ssrrtst__2> ssrrtst) {
        this.ssrrtst = ssrrtst;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutResponse withSsrrtst(List<Ssrrtst__2> ssrrtst) {
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutResponse) == false) {
            return false;
        }
        SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutResponse rhs = ((SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100PutResponse) other);
        return (((((this.ssrrtst == rhs.ssrrtst)||((this.ssrrtst!= null)&&this.ssrrtst.equals(rhs.ssrrtst)))&&((this.ssbsect == rhs.ssbsect)||((this.ssbsect!= null)&&this.ssbsect.equals(rhs.ssbsect))))&&((this.ssrrare == rhs.ssrrare)||((this.ssrrare!= null)&&this.ssrrare.equals(rhs.ssrrare))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
