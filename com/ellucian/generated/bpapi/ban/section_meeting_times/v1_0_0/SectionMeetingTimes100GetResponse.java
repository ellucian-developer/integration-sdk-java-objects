
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
    "sirasgn"
})
@Generated("jsonschema2pojo")
public class SectionMeetingTimes100GetResponse {

    @JsonProperty("ssrmeet")
    private List<Ssrmeet> ssrmeet = new ArrayList<Ssrmeet>();
    @JsonProperty("sirasgn")
    private List<Sirasgn> sirasgn = new ArrayList<Sirasgn>();
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

    public SectionMeetingTimes100GetResponse withSsrmeet(List<Ssrmeet> ssrmeet) {
        this.ssrmeet = ssrmeet;
        return this;
    }

    @JsonProperty("sirasgn")
    public List<Sirasgn> getSirasgn() {
        return sirasgn;
    }

    @JsonProperty("sirasgn")
    public void setSirasgn(List<Sirasgn> sirasgn) {
        this.sirasgn = sirasgn;
    }

    public SectionMeetingTimes100GetResponse withSirasgn(List<Sirasgn> sirasgn) {
        this.sirasgn = sirasgn;
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

    public SectionMeetingTimes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionMeetingTimes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrmeet");
        sb.append('=');
        sb.append(((this.ssrmeet == null)?"<null>":this.ssrmeet));
        sb.append(',');
        sb.append("sirasgn");
        sb.append('=');
        sb.append(((this.sirasgn == null)?"<null>":this.sirasgn));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionMeetingTimes100GetResponse) == false) {
            return false;
        }
        SectionMeetingTimes100GetResponse rhs = ((SectionMeetingTimes100GetResponse) other);
        return ((((this.sirasgn == rhs.sirasgn)||((this.sirasgn!= null)&&this.sirasgn.equals(rhs.sirasgn)))&&((this.ssrmeet == rhs.ssrmeet)||((this.ssrmeet!= null)&&this.ssrmeet.equals(rhs.ssrmeet))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
