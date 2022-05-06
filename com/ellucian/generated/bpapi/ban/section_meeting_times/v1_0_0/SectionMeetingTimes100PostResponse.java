
package com.ellucian.generated.bpapi.ban.section_meeting_times.v1_0_0;

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
    "ssrmprt",
    "ssrmrdf"
})
@Generated("jsonschema2pojo")
public class SectionMeetingTimes100PostResponse {

    @JsonProperty("ssrmeet")
    private List<Ssrmeet__1> ssrmeet = new ArrayList<Ssrmeet__1>();
    @JsonProperty("ssrmprt")
    private List<Ssrmprt> ssrmprt = new ArrayList<Ssrmprt>();
    @JsonProperty("ssrmrdf")
    private List<Ssrmrdf> ssrmrdf = new ArrayList<Ssrmrdf>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrmeet")
    public List<Ssrmeet__1> getSsrmeet() {
        return ssrmeet;
    }

    @JsonProperty("ssrmeet")
    public void setSsrmeet(List<Ssrmeet__1> ssrmeet) {
        this.ssrmeet = ssrmeet;
    }

    public SectionMeetingTimes100PostResponse withSsrmeet(List<Ssrmeet__1> ssrmeet) {
        this.ssrmeet = ssrmeet;
        return this;
    }

    @JsonProperty("ssrmprt")
    public List<Ssrmprt> getSsrmprt() {
        return ssrmprt;
    }

    @JsonProperty("ssrmprt")
    public void setSsrmprt(List<Ssrmprt> ssrmprt) {
        this.ssrmprt = ssrmprt;
    }

    public SectionMeetingTimes100PostResponse withSsrmprt(List<Ssrmprt> ssrmprt) {
        this.ssrmprt = ssrmprt;
        return this;
    }

    @JsonProperty("ssrmrdf")
    public List<Ssrmrdf> getSsrmrdf() {
        return ssrmrdf;
    }

    @JsonProperty("ssrmrdf")
    public void setSsrmrdf(List<Ssrmrdf> ssrmrdf) {
        this.ssrmrdf = ssrmrdf;
    }

    public SectionMeetingTimes100PostResponse withSsrmrdf(List<Ssrmrdf> ssrmrdf) {
        this.ssrmrdf = ssrmrdf;
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

    public SectionMeetingTimes100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionMeetingTimes100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrmeet");
        sb.append('=');
        sb.append(((this.ssrmeet == null)?"<null>":this.ssrmeet));
        sb.append(',');
        sb.append("ssrmprt");
        sb.append('=');
        sb.append(((this.ssrmprt == null)?"<null>":this.ssrmprt));
        sb.append(',');
        sb.append("ssrmrdf");
        sb.append('=');
        sb.append(((this.ssrmrdf == null)?"<null>":this.ssrmrdf));
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
        result = ((result* 31)+((this.ssrmeet == null)? 0 :this.ssrmeet.hashCode()));
        result = ((result* 31)+((this.ssrmrdf == null)? 0 :this.ssrmrdf.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrmprt == null)? 0 :this.ssrmprt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionMeetingTimes100PostResponse) == false) {
            return false;
        }
        SectionMeetingTimes100PostResponse rhs = ((SectionMeetingTimes100PostResponse) other);
        return (((((this.ssrmeet == rhs.ssrmeet)||((this.ssrmeet!= null)&&this.ssrmeet.equals(rhs.ssrmeet)))&&((this.ssrmrdf == rhs.ssrmrdf)||((this.ssrmrdf!= null)&&this.ssrmrdf.equals(rhs.ssrmrdf))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrmprt == rhs.ssrmprt)||((this.ssrmprt!= null)&&this.ssrmprt.equals(rhs.ssrmprt))));
    }

}
