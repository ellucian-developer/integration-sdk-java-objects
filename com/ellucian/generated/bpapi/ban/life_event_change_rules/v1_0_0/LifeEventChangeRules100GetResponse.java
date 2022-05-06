
package com.ellucian.generated.bpapi.ban.life_event_change_rules.v1_0_0;

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
    "ptrlfsd",
    "ptrlfch",
    "ptrlfbd"
})
@Generated("jsonschema2pojo")
public class LifeEventChangeRules100GetResponse {

    @JsonProperty("ptrlfsd")
    private List<Ptrlfsd> ptrlfsd = new ArrayList<Ptrlfsd>();
    @JsonProperty("ptrlfch")
    private List<Ptrlfch> ptrlfch = new ArrayList<Ptrlfch>();
    @JsonProperty("ptrlfbd")
    private List<Ptrlfbd> ptrlfbd = new ArrayList<Ptrlfbd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ptrlfsd")
    public List<Ptrlfsd> getPtrlfsd() {
        return ptrlfsd;
    }

    @JsonProperty("ptrlfsd")
    public void setPtrlfsd(List<Ptrlfsd> ptrlfsd) {
        this.ptrlfsd = ptrlfsd;
    }

    public LifeEventChangeRules100GetResponse withPtrlfsd(List<Ptrlfsd> ptrlfsd) {
        this.ptrlfsd = ptrlfsd;
        return this;
    }

    @JsonProperty("ptrlfch")
    public List<Ptrlfch> getPtrlfch() {
        return ptrlfch;
    }

    @JsonProperty("ptrlfch")
    public void setPtrlfch(List<Ptrlfch> ptrlfch) {
        this.ptrlfch = ptrlfch;
    }

    public LifeEventChangeRules100GetResponse withPtrlfch(List<Ptrlfch> ptrlfch) {
        this.ptrlfch = ptrlfch;
        return this;
    }

    @JsonProperty("ptrlfbd")
    public List<Ptrlfbd> getPtrlfbd() {
        return ptrlfbd;
    }

    @JsonProperty("ptrlfbd")
    public void setPtrlfbd(List<Ptrlfbd> ptrlfbd) {
        this.ptrlfbd = ptrlfbd;
    }

    public LifeEventChangeRules100GetResponse withPtrlfbd(List<Ptrlfbd> ptrlfbd) {
        this.ptrlfbd = ptrlfbd;
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

    public LifeEventChangeRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LifeEventChangeRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ptrlfsd");
        sb.append('=');
        sb.append(((this.ptrlfsd == null)?"<null>":this.ptrlfsd));
        sb.append(',');
        sb.append("ptrlfch");
        sb.append('=');
        sb.append(((this.ptrlfch == null)?"<null>":this.ptrlfch));
        sb.append(',');
        sb.append("ptrlfbd");
        sb.append('=');
        sb.append(((this.ptrlfbd == null)?"<null>":this.ptrlfbd));
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
        result = ((result* 31)+((this.ptrlfch == null)? 0 :this.ptrlfch.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ptrlfsd == null)? 0 :this.ptrlfsd.hashCode()));
        result = ((result* 31)+((this.ptrlfbd == null)? 0 :this.ptrlfbd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifeEventChangeRules100GetResponse) == false) {
            return false;
        }
        LifeEventChangeRules100GetResponse rhs = ((LifeEventChangeRules100GetResponse) other);
        return (((((this.ptrlfch == rhs.ptrlfch)||((this.ptrlfch!= null)&&this.ptrlfch.equals(rhs.ptrlfch)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ptrlfsd == rhs.ptrlfsd)||((this.ptrlfsd!= null)&&this.ptrlfsd.equals(rhs.ptrlfsd))))&&((this.ptrlfbd == rhs.ptrlfbd)||((this.ptrlfbd!= null)&&this.ptrlfbd.equals(rhs.ptrlfbd))));
    }

}
