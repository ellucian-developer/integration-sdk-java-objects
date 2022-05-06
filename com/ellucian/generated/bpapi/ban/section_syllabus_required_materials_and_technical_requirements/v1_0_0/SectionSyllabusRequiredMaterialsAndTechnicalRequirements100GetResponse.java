
package com.ellucian.generated.bpapi.ban.section_syllabus_required_materials_and_technical_requirements.v1_0_0;

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
    "ssrsytr",
    "ssrsyrm"
})
@Generated("jsonschema2pojo")
public class SectionSyllabusRequiredMaterialsAndTechnicalRequirements100GetResponse {

    @JsonProperty("ssrsytr")
    private List<Ssrsytr> ssrsytr = new ArrayList<Ssrsytr>();
    @JsonProperty("ssrsyrm")
    private List<Ssrsyrm> ssrsyrm = new ArrayList<Ssrsyrm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrsytr")
    public List<Ssrsytr> getSsrsytr() {
        return ssrsytr;
    }

    @JsonProperty("ssrsytr")
    public void setSsrsytr(List<Ssrsytr> ssrsytr) {
        this.ssrsytr = ssrsytr;
    }

    public SectionSyllabusRequiredMaterialsAndTechnicalRequirements100GetResponse withSsrsytr(List<Ssrsytr> ssrsytr) {
        this.ssrsytr = ssrsytr;
        return this;
    }

    @JsonProperty("ssrsyrm")
    public List<Ssrsyrm> getSsrsyrm() {
        return ssrsyrm;
    }

    @JsonProperty("ssrsyrm")
    public void setSsrsyrm(List<Ssrsyrm> ssrsyrm) {
        this.ssrsyrm = ssrsyrm;
    }

    public SectionSyllabusRequiredMaterialsAndTechnicalRequirements100GetResponse withSsrsyrm(List<Ssrsyrm> ssrsyrm) {
        this.ssrsyrm = ssrsyrm;
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

    public SectionSyllabusRequiredMaterialsAndTechnicalRequirements100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionSyllabusRequiredMaterialsAndTechnicalRequirements100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrsytr");
        sb.append('=');
        sb.append(((this.ssrsytr == null)?"<null>":this.ssrsytr));
        sb.append(',');
        sb.append("ssrsyrm");
        sb.append('=');
        sb.append(((this.ssrsyrm == null)?"<null>":this.ssrsyrm));
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
        result = ((result* 31)+((this.ssrsytr == null)? 0 :this.ssrsytr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrsyrm == null)? 0 :this.ssrsyrm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionSyllabusRequiredMaterialsAndTechnicalRequirements100GetResponse) == false) {
            return false;
        }
        SectionSyllabusRequiredMaterialsAndTechnicalRequirements100GetResponse rhs = ((SectionSyllabusRequiredMaterialsAndTechnicalRequirements100GetResponse) other);
        return ((((this.ssrsytr == rhs.ssrsytr)||((this.ssrsytr!= null)&&this.ssrsytr.equals(rhs.ssrsytr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrsyrm == rhs.ssrsyrm)||((this.ssrsyrm!= null)&&this.ssrsyrm.equals(rhs.ssrsyrm))));
    }

}
