
package com.ellucian.generated.bpapi.ban.schedule_cross_list_definition.v1_0_0;

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
    "ssrxlst",
    "ssbxlst"
})
@Generated("jsonschema2pojo")
public class ScheduleCrossListDefinition100GetResponse {

    @JsonProperty("ssrxlst")
    private List<Ssrxlst> ssrxlst = new ArrayList<Ssrxlst>();
    @JsonProperty("ssbxlst")
    private List<Ssbxlst> ssbxlst = new ArrayList<Ssbxlst>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrxlst")
    public List<Ssrxlst> getSsrxlst() {
        return ssrxlst;
    }

    @JsonProperty("ssrxlst")
    public void setSsrxlst(List<Ssrxlst> ssrxlst) {
        this.ssrxlst = ssrxlst;
    }

    public ScheduleCrossListDefinition100GetResponse withSsrxlst(List<Ssrxlst> ssrxlst) {
        this.ssrxlst = ssrxlst;
        return this;
    }

    @JsonProperty("ssbxlst")
    public List<Ssbxlst> getSsbxlst() {
        return ssbxlst;
    }

    @JsonProperty("ssbxlst")
    public void setSsbxlst(List<Ssbxlst> ssbxlst) {
        this.ssbxlst = ssbxlst;
    }

    public ScheduleCrossListDefinition100GetResponse withSsbxlst(List<Ssbxlst> ssbxlst) {
        this.ssbxlst = ssbxlst;
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

    public ScheduleCrossListDefinition100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleCrossListDefinition100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrxlst");
        sb.append('=');
        sb.append(((this.ssrxlst == null)?"<null>":this.ssrxlst));
        sb.append(',');
        sb.append("ssbxlst");
        sb.append('=');
        sb.append(((this.ssbxlst == null)?"<null>":this.ssbxlst));
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
        result = ((result* 31)+((this.ssbxlst == null)? 0 :this.ssbxlst.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrxlst == null)? 0 :this.ssrxlst.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleCrossListDefinition100GetResponse) == false) {
            return false;
        }
        ScheduleCrossListDefinition100GetResponse rhs = ((ScheduleCrossListDefinition100GetResponse) other);
        return ((((this.ssbxlst == rhs.ssbxlst)||((this.ssbxlst!= null)&&this.ssbxlst.equals(rhs.ssbxlst)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrxlst == rhs.ssrxlst)||((this.ssrxlst!= null)&&this.ssrxlst.equals(rhs.ssrxlst))));
    }

}
