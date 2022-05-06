
package com.ellucian.generated.bpapi.ban.section_section_preferences.v1_0_0;

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
    "ssrsrdf",
    "ssrsprt"
})
@Generated("jsonschema2pojo")
public class SectionSectionPreferences100GetResponse {

    @JsonProperty("ssrsrdf")
    private List<Ssrsrdf> ssrsrdf = new ArrayList<Ssrsrdf>();
    @JsonProperty("ssrsprt")
    private List<Ssrsprt> ssrsprt = new ArrayList<Ssrsprt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrsrdf")
    public List<Ssrsrdf> getSsrsrdf() {
        return ssrsrdf;
    }

    @JsonProperty("ssrsrdf")
    public void setSsrsrdf(List<Ssrsrdf> ssrsrdf) {
        this.ssrsrdf = ssrsrdf;
    }

    public SectionSectionPreferences100GetResponse withSsrsrdf(List<Ssrsrdf> ssrsrdf) {
        this.ssrsrdf = ssrsrdf;
        return this;
    }

    @JsonProperty("ssrsprt")
    public List<Ssrsprt> getSsrsprt() {
        return ssrsprt;
    }

    @JsonProperty("ssrsprt")
    public void setSsrsprt(List<Ssrsprt> ssrsprt) {
        this.ssrsprt = ssrsprt;
    }

    public SectionSectionPreferences100GetResponse withSsrsprt(List<Ssrsprt> ssrsprt) {
        this.ssrsprt = ssrsprt;
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

    public SectionSectionPreferences100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionSectionPreferences100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrsrdf");
        sb.append('=');
        sb.append(((this.ssrsrdf == null)?"<null>":this.ssrsrdf));
        sb.append(',');
        sb.append("ssrsprt");
        sb.append('=');
        sb.append(((this.ssrsprt == null)?"<null>":this.ssrsprt));
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
        result = ((result* 31)+((this.ssrsrdf == null)? 0 :this.ssrsrdf.hashCode()));
        result = ((result* 31)+((this.ssrsprt == null)? 0 :this.ssrsprt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionSectionPreferences100GetResponse) == false) {
            return false;
        }
        SectionSectionPreferences100GetResponse rhs = ((SectionSectionPreferences100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ssrsrdf == rhs.ssrsrdf)||((this.ssrsrdf!= null)&&this.ssrsrdf.equals(rhs.ssrsrdf))))&&((this.ssrsprt == rhs.ssrsprt)||((this.ssrsprt!= null)&&this.ssrsprt.equals(rhs.ssrsprt))));
    }

}
