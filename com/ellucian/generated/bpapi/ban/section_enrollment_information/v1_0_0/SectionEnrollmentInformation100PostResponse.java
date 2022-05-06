
package com.ellucian.generated.bpapi.ban.section_enrollment_information.v1_0_0;

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
    "ssrresv"
})
@Generated("jsonschema2pojo")
public class SectionEnrollmentInformation100PostResponse {

    @JsonProperty("ssbsect")
    private List<Ssbsect__1> ssbsect = new ArrayList<Ssbsect__1>();
    @JsonProperty("ssrresv")
    private List<Ssrresv__1> ssrresv = new ArrayList<Ssrresv__1>();
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

    public SectionEnrollmentInformation100PostResponse withSsbsect(List<Ssbsect__1> ssbsect) {
        this.ssbsect = ssbsect;
        return this;
    }

    @JsonProperty("ssrresv")
    public List<Ssrresv__1> getSsrresv() {
        return ssrresv;
    }

    @JsonProperty("ssrresv")
    public void setSsrresv(List<Ssrresv__1> ssrresv) {
        this.ssrresv = ssrresv;
    }

    public SectionEnrollmentInformation100PostResponse withSsrresv(List<Ssrresv__1> ssrresv) {
        this.ssrresv = ssrresv;
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

    public SectionEnrollmentInformation100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionEnrollmentInformation100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssbsect");
        sb.append('=');
        sb.append(((this.ssbsect == null)?"<null>":this.ssbsect));
        sb.append(',');
        sb.append("ssrresv");
        sb.append('=');
        sb.append(((this.ssrresv == null)?"<null>":this.ssrresv));
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
        result = ((result* 31)+((this.ssbsect == null)? 0 :this.ssbsect.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrresv == null)? 0 :this.ssrresv.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionEnrollmentInformation100PostResponse) == false) {
            return false;
        }
        SectionEnrollmentInformation100PostResponse rhs = ((SectionEnrollmentInformation100PostResponse) other);
        return ((((this.ssbsect == rhs.ssbsect)||((this.ssbsect!= null)&&this.ssbsect.equals(rhs.ssbsect)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrresv == rhs.ssrresv)||((this.ssrresv!= null)&&this.ssrresv.equals(rhs.ssrresv))));
    }

}
