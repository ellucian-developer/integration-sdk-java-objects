
package com.ellucian.generated.bpapi.ban.finance_detail_codes.v1_0_0;

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
    "tbbdetc",
    "tbbeact",
    "tbracct"
})
@Generated("jsonschema2pojo")
public class FinanceDetailCodes100GetResponse {

    @JsonProperty("tbbdetc")
    private List<Tbbdetc> tbbdetc = new ArrayList<Tbbdetc>();
    @JsonProperty("tbbeact")
    private List<Tbbeact> tbbeact = new ArrayList<Tbbeact>();
    @JsonProperty("tbracct")
    private List<Tbracct> tbracct = new ArrayList<Tbracct>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbbdetc")
    public List<Tbbdetc> getTbbdetc() {
        return tbbdetc;
    }

    @JsonProperty("tbbdetc")
    public void setTbbdetc(List<Tbbdetc> tbbdetc) {
        this.tbbdetc = tbbdetc;
    }

    public FinanceDetailCodes100GetResponse withTbbdetc(List<Tbbdetc> tbbdetc) {
        this.tbbdetc = tbbdetc;
        return this;
    }

    @JsonProperty("tbbeact")
    public List<Tbbeact> getTbbeact() {
        return tbbeact;
    }

    @JsonProperty("tbbeact")
    public void setTbbeact(List<Tbbeact> tbbeact) {
        this.tbbeact = tbbeact;
    }

    public FinanceDetailCodes100GetResponse withTbbeact(List<Tbbeact> tbbeact) {
        this.tbbeact = tbbeact;
        return this;
    }

    @JsonProperty("tbracct")
    public List<Tbracct> getTbracct() {
        return tbracct;
    }

    @JsonProperty("tbracct")
    public void setTbracct(List<Tbracct> tbracct) {
        this.tbracct = tbracct;
    }

    public FinanceDetailCodes100GetResponse withTbracct(List<Tbracct> tbracct) {
        this.tbracct = tbracct;
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

    public FinanceDetailCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceDetailCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbdetc");
        sb.append('=');
        sb.append(((this.tbbdetc == null)?"<null>":this.tbbdetc));
        sb.append(',');
        sb.append("tbbeact");
        sb.append('=');
        sb.append(((this.tbbeact == null)?"<null>":this.tbbeact));
        sb.append(',');
        sb.append("tbracct");
        sb.append('=');
        sb.append(((this.tbracct == null)?"<null>":this.tbracct));
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
        result = ((result* 31)+((this.tbbeact == null)? 0 :this.tbbeact.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbbdetc == null)? 0 :this.tbbdetc.hashCode()));
        result = ((result* 31)+((this.tbracct == null)? 0 :this.tbracct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceDetailCodes100GetResponse) == false) {
            return false;
        }
        FinanceDetailCodes100GetResponse rhs = ((FinanceDetailCodes100GetResponse) other);
        return (((((this.tbbeact == rhs.tbbeact)||((this.tbbeact!= null)&&this.tbbeact.equals(rhs.tbbeact)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbbdetc == rhs.tbbdetc)||((this.tbbdetc!= null)&&this.tbbdetc.equals(rhs.tbbdetc))))&&((this.tbracct == rhs.tbracct)||((this.tbracct!= null)&&this.tbracct.equals(rhs.tbracct))));
    }

}
