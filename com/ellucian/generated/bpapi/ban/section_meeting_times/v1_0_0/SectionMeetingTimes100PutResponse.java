
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
    "sirasgn",
    "ssrmrdf"
})
@Generated("jsonschema2pojo")
public class SectionMeetingTimes100PutResponse {

    @JsonProperty("ssrmeet")
    private List<Ssrmeet__2> ssrmeet = new ArrayList<Ssrmeet__2>();
    @JsonProperty("ssrmprt")
    private List<Ssrmprt__1> ssrmprt = new ArrayList<Ssrmprt__1>();
    @JsonProperty("sirasgn")
    private List<Sirasgn__1> sirasgn = new ArrayList<Sirasgn__1>();
    @JsonProperty("ssrmrdf")
    private List<Ssrmrdf__1> ssrmrdf = new ArrayList<Ssrmrdf__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrmeet")
    public List<Ssrmeet__2> getSsrmeet() {
        return ssrmeet;
    }

    @JsonProperty("ssrmeet")
    public void setSsrmeet(List<Ssrmeet__2> ssrmeet) {
        this.ssrmeet = ssrmeet;
    }

    public SectionMeetingTimes100PutResponse withSsrmeet(List<Ssrmeet__2> ssrmeet) {
        this.ssrmeet = ssrmeet;
        return this;
    }

    @JsonProperty("ssrmprt")
    public List<Ssrmprt__1> getSsrmprt() {
        return ssrmprt;
    }

    @JsonProperty("ssrmprt")
    public void setSsrmprt(List<Ssrmprt__1> ssrmprt) {
        this.ssrmprt = ssrmprt;
    }

    public SectionMeetingTimes100PutResponse withSsrmprt(List<Ssrmprt__1> ssrmprt) {
        this.ssrmprt = ssrmprt;
        return this;
    }

    @JsonProperty("sirasgn")
    public List<Sirasgn__1> getSirasgn() {
        return sirasgn;
    }

    @JsonProperty("sirasgn")
    public void setSirasgn(List<Sirasgn__1> sirasgn) {
        this.sirasgn = sirasgn;
    }

    public SectionMeetingTimes100PutResponse withSirasgn(List<Sirasgn__1> sirasgn) {
        this.sirasgn = sirasgn;
        return this;
    }

    @JsonProperty("ssrmrdf")
    public List<Ssrmrdf__1> getSsrmrdf() {
        return ssrmrdf;
    }

    @JsonProperty("ssrmrdf")
    public void setSsrmrdf(List<Ssrmrdf__1> ssrmrdf) {
        this.ssrmrdf = ssrmrdf;
    }

    public SectionMeetingTimes100PutResponse withSsrmrdf(List<Ssrmrdf__1> ssrmrdf) {
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

    public SectionMeetingTimes100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionMeetingTimes100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrmeet");
        sb.append('=');
        sb.append(((this.ssrmeet == null)?"<null>":this.ssrmeet));
        sb.append(',');
        sb.append("ssrmprt");
        sb.append('=');
        sb.append(((this.ssrmprt == null)?"<null>":this.ssrmprt));
        sb.append(',');
        sb.append("sirasgn");
        sb.append('=');
        sb.append(((this.sirasgn == null)?"<null>":this.sirasgn));
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
        result = ((result* 31)+((this.sirasgn == null)? 0 :this.sirasgn.hashCode()));
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
        if ((other instanceof SectionMeetingTimes100PutResponse) == false) {
            return false;
        }
        SectionMeetingTimes100PutResponse rhs = ((SectionMeetingTimes100PutResponse) other);
        return ((((((this.sirasgn == rhs.sirasgn)||((this.sirasgn!= null)&&this.sirasgn.equals(rhs.sirasgn)))&&((this.ssrmeet == rhs.ssrmeet)||((this.ssrmeet!= null)&&this.ssrmeet.equals(rhs.ssrmeet))))&&((this.ssrmrdf == rhs.ssrmrdf)||((this.ssrmrdf!= null)&&this.ssrmrdf.equals(rhs.ssrmrdf))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrmprt == rhs.ssrmprt)||((this.ssrmprt!= null)&&this.ssrmprt.equals(rhs.ssrmprt))));
    }

}
