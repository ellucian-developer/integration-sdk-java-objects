
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
    "ssrrare",
    "ssrrtst"
})
@Generated("jsonschema2pojo")
public class SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100GetResponse {

    @JsonProperty("ssrrare")
    private List<Ssrrare> ssrrare = new ArrayList<Ssrrare>();
    @JsonProperty("ssrrtst")
    private List<Ssrrtst> ssrrtst = new ArrayList<Ssrrtst>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrrare")
    public List<Ssrrare> getSsrrare() {
        return ssrrare;
    }

    @JsonProperty("ssrrare")
    public void setSsrrare(List<Ssrrare> ssrrare) {
        this.ssrrare = ssrrare;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100GetResponse withSsrrare(List<Ssrrare> ssrrare) {
        this.ssrrare = ssrrare;
        return this;
    }

    @JsonProperty("ssrrtst")
    public List<Ssrrtst> getSsrrtst() {
        return ssrrtst;
    }

    @JsonProperty("ssrrtst")
    public void setSsrrtst(List<Ssrrtst> ssrrtst) {
        this.ssrrtst = ssrrtst;
    }

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100GetResponse withSsrrtst(List<Ssrrtst> ssrrtst) {
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

    public SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.ssrrare == null)? 0 :this.ssrrare.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100GetResponse) == false) {
            return false;
        }
        SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100GetResponse rhs = ((SchedulePrerequisiteAndTestScoreRestrictionsSectionTestScoreAndPrerequisiteRestrictions100GetResponse) other);
        return ((((this.ssrrtst == rhs.ssrrtst)||((this.ssrrtst!= null)&&this.ssrrtst.equals(rhs.ssrrtst)))&&((this.ssrrare == rhs.ssrrare)||((this.ssrrare!= null)&&this.ssrrare.equals(rhs.ssrrare))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
