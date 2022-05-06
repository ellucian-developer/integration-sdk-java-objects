
package com.ellucian.generated.bpapi.ban.section_details_read_only.v1_0_0;

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
    "ssrmeet",
    "ssbsect",
    "soratmt"
})
@Generated("jsonschema2pojo")
public class SectionDetailsReadOnly100GetResponse {

    @JsonProperty("ssrmeet")
    private List<Ssrmeet> ssrmeet = new ArrayList<Ssrmeet>();
    @JsonProperty("ssbsect")
    private List<Ssbsect> ssbsect = new ArrayList<Ssbsect>();
    @JsonProperty("soratmt")
    private List<Soratmt> soratmt = new ArrayList<Soratmt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrmeet")
    public List<Ssrmeet> getSsrmeet() {
        return ssrmeet;
    }

    @JsonProperty("ssrmeet")
    public void setSsrmeet(List<Ssrmeet> ssrmeet) {
        this.ssrmeet = ssrmeet;
    }

    public SectionDetailsReadOnly100GetResponse withSsrmeet(List<Ssrmeet> ssrmeet) {
        this.ssrmeet = ssrmeet;
        return this;
    }

    @JsonProperty("ssbsect")
    public List<Ssbsect> getSsbsect() {
        return ssbsect;
    }

    @JsonProperty("ssbsect")
    public void setSsbsect(List<Ssbsect> ssbsect) {
        this.ssbsect = ssbsect;
    }

    public SectionDetailsReadOnly100GetResponse withSsbsect(List<Ssbsect> ssbsect) {
        this.ssbsect = ssbsect;
        return this;
    }

    @JsonProperty("soratmt")
    public List<Soratmt> getSoratmt() {
        return soratmt;
    }

    @JsonProperty("soratmt")
    public void setSoratmt(List<Soratmt> soratmt) {
        this.soratmt = soratmt;
    }

    public SectionDetailsReadOnly100GetResponse withSoratmt(List<Soratmt> soratmt) {
        this.soratmt = soratmt;
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

    public SectionDetailsReadOnly100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionDetailsReadOnly100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrmeet");
        sb.append('=');
        sb.append(((this.ssrmeet == null)?"<null>":this.ssrmeet));
        sb.append(',');
        sb.append("ssbsect");
        sb.append('=');
        sb.append(((this.ssbsect == null)?"<null>":this.ssbsect));
        sb.append(',');
        sb.append("soratmt");
        sb.append('=');
        sb.append(((this.soratmt == null)?"<null>":this.soratmt));
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
        result = ((result* 31)+((this.ssrmeet == null)? 0 :this.ssrmeet.hashCode()));
        result = ((result* 31)+((this.soratmt == null)? 0 :this.soratmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionDetailsReadOnly100GetResponse) == false) {
            return false;
        }
        SectionDetailsReadOnly100GetResponse rhs = ((SectionDetailsReadOnly100GetResponse) other);
        return (((((this.ssbsect == rhs.ssbsect)||((this.ssbsect!= null)&&this.ssbsect.equals(rhs.ssbsect)))&&((this.ssrmeet == rhs.ssrmeet)||((this.ssrmeet!= null)&&this.ssrmeet.equals(rhs.ssrmeet))))&&((this.soratmt == rhs.soratmt)||((this.soratmt!= null)&&this.soratmt.equals(rhs.soratmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
