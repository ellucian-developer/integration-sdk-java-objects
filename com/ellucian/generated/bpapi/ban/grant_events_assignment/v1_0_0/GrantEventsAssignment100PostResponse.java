
package com.ellucian.generated.bpapi.ban.grant_events_assignment.v1_0_0;

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
    "frrevng",
    "frbevng",
    "frbgrnt"
})
@Generated("jsonschema2pojo")
public class GrantEventsAssignment100PostResponse {

    @JsonProperty("frrevng")
    private List<Frrevng__1> frrevng = new ArrayList<Frrevng__1>();
    @JsonProperty("frbevng")
    private List<Frbevng__1> frbevng = new ArrayList<Frbevng__1>();
    @JsonProperty("frbgrnt")
    private List<Frbgrnt__1> frbgrnt = new ArrayList<Frbgrnt__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("frrevng")
    public List<Frrevng__1> getFrrevng() {
        return frrevng;
    }

    @JsonProperty("frrevng")
    public void setFrrevng(List<Frrevng__1> frrevng) {
        this.frrevng = frrevng;
    }

    public GrantEventsAssignment100PostResponse withFrrevng(List<Frrevng__1> frrevng) {
        this.frrevng = frrevng;
        return this;
    }

    @JsonProperty("frbevng")
    public List<Frbevng__1> getFrbevng() {
        return frbevng;
    }

    @JsonProperty("frbevng")
    public void setFrbevng(List<Frbevng__1> frbevng) {
        this.frbevng = frbevng;
    }

    public GrantEventsAssignment100PostResponse withFrbevng(List<Frbevng__1> frbevng) {
        this.frbevng = frbevng;
        return this;
    }

    @JsonProperty("frbgrnt")
    public List<Frbgrnt__1> getFrbgrnt() {
        return frbgrnt;
    }

    @JsonProperty("frbgrnt")
    public void setFrbgrnt(List<Frbgrnt__1> frbgrnt) {
        this.frbgrnt = frbgrnt;
    }

    public GrantEventsAssignment100PostResponse withFrbgrnt(List<Frbgrnt__1> frbgrnt) {
        this.frbgrnt = frbgrnt;
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

    public GrantEventsAssignment100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantEventsAssignment100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frrevng");
        sb.append('=');
        sb.append(((this.frrevng == null)?"<null>":this.frrevng));
        sb.append(',');
        sb.append("frbevng");
        sb.append('=');
        sb.append(((this.frbevng == null)?"<null>":this.frbevng));
        sb.append(',');
        sb.append("frbgrnt");
        sb.append('=');
        sb.append(((this.frbgrnt == null)?"<null>":this.frbgrnt));
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
        result = ((result* 31)+((this.frbevng == null)? 0 :this.frbevng.hashCode()));
        result = ((result* 31)+((this.frrevng == null)? 0 :this.frrevng.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.frbgrnt == null)? 0 :this.frbgrnt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantEventsAssignment100PostResponse) == false) {
            return false;
        }
        GrantEventsAssignment100PostResponse rhs = ((GrantEventsAssignment100PostResponse) other);
        return (((((this.frbevng == rhs.frbevng)||((this.frbevng!= null)&&this.frbevng.equals(rhs.frbevng)))&&((this.frrevng == rhs.frrevng)||((this.frrevng!= null)&&this.frrevng.equals(rhs.frrevng))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.frbgrnt == rhs.frbgrnt)||((this.frbgrnt!= null)&&this.frbgrnt.equals(rhs.frbgrnt))));
    }

}
