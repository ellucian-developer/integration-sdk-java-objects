
package com.ellucian.generated.bpapi.ban.receipt.v1_0_0;

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
    "tbvrcpt",
    "tbrcrcp",
    "tbrccrc"
})
@Generated("jsonschema2pojo")
public class Receipt100GetResponse {

    @JsonProperty("tbvrcpt")
    private List<Tbvrcpt> tbvrcpt = new ArrayList<Tbvrcpt>();
    @JsonProperty("tbrcrcp")
    private List<Tbrcrcp> tbrcrcp = new ArrayList<Tbrcrcp>();
    @JsonProperty("tbrccrc")
    private List<Tbrccrc> tbrccrc = new ArrayList<Tbrccrc>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbvrcpt")
    public List<Tbvrcpt> getTbvrcpt() {
        return tbvrcpt;
    }

    @JsonProperty("tbvrcpt")
    public void setTbvrcpt(List<Tbvrcpt> tbvrcpt) {
        this.tbvrcpt = tbvrcpt;
    }

    public Receipt100GetResponse withTbvrcpt(List<Tbvrcpt> tbvrcpt) {
        this.tbvrcpt = tbvrcpt;
        return this;
    }

    @JsonProperty("tbrcrcp")
    public List<Tbrcrcp> getTbrcrcp() {
        return tbrcrcp;
    }

    @JsonProperty("tbrcrcp")
    public void setTbrcrcp(List<Tbrcrcp> tbrcrcp) {
        this.tbrcrcp = tbrcrcp;
    }

    public Receipt100GetResponse withTbrcrcp(List<Tbrcrcp> tbrcrcp) {
        this.tbrcrcp = tbrcrcp;
        return this;
    }

    @JsonProperty("tbrccrc")
    public List<Tbrccrc> getTbrccrc() {
        return tbrccrc;
    }

    @JsonProperty("tbrccrc")
    public void setTbrccrc(List<Tbrccrc> tbrccrc) {
        this.tbrccrc = tbrccrc;
    }

    public Receipt100GetResponse withTbrccrc(List<Tbrccrc> tbrccrc) {
        this.tbrccrc = tbrccrc;
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

    public Receipt100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Receipt100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbvrcpt");
        sb.append('=');
        sb.append(((this.tbvrcpt == null)?"<null>":this.tbvrcpt));
        sb.append(',');
        sb.append("tbrcrcp");
        sb.append('=');
        sb.append(((this.tbrcrcp == null)?"<null>":this.tbrcrcp));
        sb.append(',');
        sb.append("tbrccrc");
        sb.append('=');
        sb.append(((this.tbrccrc == null)?"<null>":this.tbrccrc));
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
        result = ((result* 31)+((this.tbrcrcp == null)? 0 :this.tbrcrcp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbvrcpt == null)? 0 :this.tbvrcpt.hashCode()));
        result = ((result* 31)+((this.tbrccrc == null)? 0 :this.tbrccrc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Receipt100GetResponse) == false) {
            return false;
        }
        Receipt100GetResponse rhs = ((Receipt100GetResponse) other);
        return (((((this.tbrcrcp == rhs.tbrcrcp)||((this.tbrcrcp!= null)&&this.tbrcrcp.equals(rhs.tbrcrcp)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbvrcpt == rhs.tbvrcpt)||((this.tbvrcpt!= null)&&this.tbvrcpt.equals(rhs.tbvrcpt))))&&((this.tbrccrc == rhs.tbrccrc)||((this.tbrccrc!= null)&&this.tbrccrc.equals(rhs.tbrccrc))));
    }

}
