
package com.ellucian.generated.bpapi.ban.schedule_details_links_and_corequisites.v1_0_0;

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
    "ssrlink",
    "ssrcorq"
})
@Generated("jsonschema2pojo")
public class ScheduleDetailsLinksAndCorequisites100GetResponse {

    @JsonProperty("ssrlink")
    private List<Ssrlink> ssrlink = new ArrayList<Ssrlink>();
    @JsonProperty("ssrcorq")
    private List<Ssrcorq> ssrcorq = new ArrayList<Ssrcorq>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrlink")
    public List<Ssrlink> getSsrlink() {
        return ssrlink;
    }

    @JsonProperty("ssrlink")
    public void setSsrlink(List<Ssrlink> ssrlink) {
        this.ssrlink = ssrlink;
    }

    public ScheduleDetailsLinksAndCorequisites100GetResponse withSsrlink(List<Ssrlink> ssrlink) {
        this.ssrlink = ssrlink;
        return this;
    }

    @JsonProperty("ssrcorq")
    public List<Ssrcorq> getSsrcorq() {
        return ssrcorq;
    }

    @JsonProperty("ssrcorq")
    public void setSsrcorq(List<Ssrcorq> ssrcorq) {
        this.ssrcorq = ssrcorq;
    }

    public ScheduleDetailsLinksAndCorequisites100GetResponse withSsrcorq(List<Ssrcorq> ssrcorq) {
        this.ssrcorq = ssrcorq;
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

    public ScheduleDetailsLinksAndCorequisites100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleDetailsLinksAndCorequisites100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrlink");
        sb.append('=');
        sb.append(((this.ssrlink == null)?"<null>":this.ssrlink));
        sb.append(',');
        sb.append("ssrcorq");
        sb.append('=');
        sb.append(((this.ssrcorq == null)?"<null>":this.ssrcorq));
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
        result = ((result* 31)+((this.ssrcorq == null)? 0 :this.ssrcorq.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrlink == null)? 0 :this.ssrlink.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleDetailsLinksAndCorequisites100GetResponse) == false) {
            return false;
        }
        ScheduleDetailsLinksAndCorequisites100GetResponse rhs = ((ScheduleDetailsLinksAndCorequisites100GetResponse) other);
        return ((((this.ssrcorq == rhs.ssrcorq)||((this.ssrcorq!= null)&&this.ssrcorq.equals(rhs.ssrcorq)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrlink == rhs.ssrlink)||((this.ssrlink!= null)&&this.ssrlink.equals(rhs.ssrlink))));
    }

}
