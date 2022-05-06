
package com.ellucian.generated.bpapi.ban.section_syllabus_long_title_and_learning_objectives.v1_0_0;

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
    "ssrsylo",
    "ssrsyln"
})
@Generated("jsonschema2pojo")
public class SectionSyllabusLongTitleAndLearningObjectives100PutResponse {

    @JsonProperty("ssrsylo")
    private List<Ssrsylo__1> ssrsylo = new ArrayList<Ssrsylo__1>();
    @JsonProperty("ssrsyln")
    private List<Ssrsyln__1> ssrsyln = new ArrayList<Ssrsyln__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrsylo")
    public List<Ssrsylo__1> getSsrsylo() {
        return ssrsylo;
    }

    @JsonProperty("ssrsylo")
    public void setSsrsylo(List<Ssrsylo__1> ssrsylo) {
        this.ssrsylo = ssrsylo;
    }

    public SectionSyllabusLongTitleAndLearningObjectives100PutResponse withSsrsylo(List<Ssrsylo__1> ssrsylo) {
        this.ssrsylo = ssrsylo;
        return this;
    }

    @JsonProperty("ssrsyln")
    public List<Ssrsyln__1> getSsrsyln() {
        return ssrsyln;
    }

    @JsonProperty("ssrsyln")
    public void setSsrsyln(List<Ssrsyln__1> ssrsyln) {
        this.ssrsyln = ssrsyln;
    }

    public SectionSyllabusLongTitleAndLearningObjectives100PutResponse withSsrsyln(List<Ssrsyln__1> ssrsyln) {
        this.ssrsyln = ssrsyln;
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

    public SectionSyllabusLongTitleAndLearningObjectives100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionSyllabusLongTitleAndLearningObjectives100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrsylo");
        sb.append('=');
        sb.append(((this.ssrsylo == null)?"<null>":this.ssrsylo));
        sb.append(',');
        sb.append("ssrsyln");
        sb.append('=');
        sb.append(((this.ssrsyln == null)?"<null>":this.ssrsyln));
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
        result = ((result* 31)+((this.ssrsyln == null)? 0 :this.ssrsyln.hashCode()));
        result = ((result* 31)+((this.ssrsylo == null)? 0 :this.ssrsylo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionSyllabusLongTitleAndLearningObjectives100PutResponse) == false) {
            return false;
        }
        SectionSyllabusLongTitleAndLearningObjectives100PutResponse rhs = ((SectionSyllabusLongTitleAndLearningObjectives100PutResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ssrsyln == rhs.ssrsyln)||((this.ssrsyln!= null)&&this.ssrsyln.equals(rhs.ssrsyln))))&&((this.ssrsylo == rhs.ssrsylo)||((this.ssrsylo!= null)&&this.ssrsylo.equals(rhs.ssrsylo))));
    }

}
