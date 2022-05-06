
package com.ellucian.generated.bpapi.ban._2019_2020_need_analysis.v1_0_0;

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
    "rcrapp1",
    "rorstat"
})
@Generated("jsonschema2pojo")
public class _20192020NeedAnalysis100GetResponse {

    @JsonProperty("rcrapp1")
    private List<Rcrapp1> rcrapp1 = new ArrayList<Rcrapp1>();
    @JsonProperty("rorstat")
    private List<Rorstat> rorstat = new ArrayList<Rorstat>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rcrapp1")
    public List<Rcrapp1> getRcrapp1() {
        return rcrapp1;
    }

    @JsonProperty("rcrapp1")
    public void setRcrapp1(List<Rcrapp1> rcrapp1) {
        this.rcrapp1 = rcrapp1;
    }

    public _20192020NeedAnalysis100GetResponse withRcrapp1(List<Rcrapp1> rcrapp1) {
        this.rcrapp1 = rcrapp1;
        return this;
    }

    @JsonProperty("rorstat")
    public List<Rorstat> getRorstat() {
        return rorstat;
    }

    @JsonProperty("rorstat")
    public void setRorstat(List<Rorstat> rorstat) {
        this.rorstat = rorstat;
    }

    public _20192020NeedAnalysis100GetResponse withRorstat(List<Rorstat> rorstat) {
        this.rorstat = rorstat;
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

    public _20192020NeedAnalysis100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20192020NeedAnalysis100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rcrapp1");
        sb.append('=');
        sb.append(((this.rcrapp1 == null)?"<null>":this.rcrapp1));
        sb.append(',');
        sb.append("rorstat");
        sb.append('=');
        sb.append(((this.rorstat == null)?"<null>":this.rorstat));
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
        result = ((result* 31)+((this.rcrapp1 == null)? 0 :this.rcrapp1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rorstat == null)? 0 :this.rorstat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20192020NeedAnalysis100GetResponse) == false) {
            return false;
        }
        _20192020NeedAnalysis100GetResponse rhs = ((_20192020NeedAnalysis100GetResponse) other);
        return ((((this.rcrapp1 == rhs.rcrapp1)||((this.rcrapp1 != null)&&this.rcrapp1 .equals(rhs.rcrapp1)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rorstat == rhs.rorstat)||((this.rorstat!= null)&&this.rorstat.equals(rhs.rorstat))));
    }

}
