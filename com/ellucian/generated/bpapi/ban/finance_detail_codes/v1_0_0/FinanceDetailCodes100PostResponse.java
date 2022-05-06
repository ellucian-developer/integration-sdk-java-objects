
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
    "tbbeact2",
    "tbracct2"
})
@Generated("jsonschema2pojo")
public class FinanceDetailCodes100PostResponse {

    @JsonProperty("tbbdetc")
    private List<Tbbdetc__1> tbbdetc = new ArrayList<Tbbdetc__1>();
    @JsonProperty("tbbeact2")
    private List<Tbbeact2__1> tbbeact2 = new ArrayList<Tbbeact2__1>();
    @JsonProperty("tbracct2")
    private List<Tbracct2> tbracct2 = new ArrayList<Tbracct2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbbdetc")
    public List<Tbbdetc__1> getTbbdetc() {
        return tbbdetc;
    }

    @JsonProperty("tbbdetc")
    public void setTbbdetc(List<Tbbdetc__1> tbbdetc) {
        this.tbbdetc = tbbdetc;
    }

    public FinanceDetailCodes100PostResponse withTbbdetc(List<Tbbdetc__1> tbbdetc) {
        this.tbbdetc = tbbdetc;
        return this;
    }

    @JsonProperty("tbbeact2")
    public List<Tbbeact2__1> getTbbeact2() {
        return tbbeact2;
    }

    @JsonProperty("tbbeact2")
    public void setTbbeact2(List<Tbbeact2__1> tbbeact2) {
        this.tbbeact2 = tbbeact2;
    }

    public FinanceDetailCodes100PostResponse withTbbeact2(List<Tbbeact2__1> tbbeact2) {
        this.tbbeact2 = tbbeact2;
        return this;
    }

    @JsonProperty("tbracct2")
    public List<Tbracct2> getTbracct2() {
        return tbracct2;
    }

    @JsonProperty("tbracct2")
    public void setTbracct2(List<Tbracct2> tbracct2) {
        this.tbracct2 = tbracct2;
    }

    public FinanceDetailCodes100PostResponse withTbracct2(List<Tbracct2> tbracct2) {
        this.tbracct2 = tbracct2;
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

    public FinanceDetailCodes100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceDetailCodes100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbdetc");
        sb.append('=');
        sb.append(((this.tbbdetc == null)?"<null>":this.tbbdetc));
        sb.append(',');
        sb.append("tbbeact2");
        sb.append('=');
        sb.append(((this.tbbeact2 == null)?"<null>":this.tbbeact2));
        sb.append(',');
        sb.append("tbracct2");
        sb.append('=');
        sb.append(((this.tbracct2 == null)?"<null>":this.tbracct2));
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
        result = ((result* 31)+((this.tbbeact2 == null)? 0 :this.tbbeact2 .hashCode()));
        result = ((result* 31)+((this.tbracct2 == null)? 0 :this.tbracct2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbbdetc == null)? 0 :this.tbbdetc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceDetailCodes100PostResponse) == false) {
            return false;
        }
        FinanceDetailCodes100PostResponse rhs = ((FinanceDetailCodes100PostResponse) other);
        return (((((this.tbbeact2 == rhs.tbbeact2)||((this.tbbeact2 != null)&&this.tbbeact2 .equals(rhs.tbbeact2)))&&((this.tbracct2 == rhs.tbracct2)||((this.tbracct2 != null)&&this.tbracct2 .equals(rhs.tbracct2))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbbdetc == rhs.tbbdetc)||((this.tbbdetc!= null)&&this.tbbdetc.equals(rhs.tbbdetc))));
    }

}
