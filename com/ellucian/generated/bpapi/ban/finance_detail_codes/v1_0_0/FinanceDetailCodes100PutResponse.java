
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
    "tbbeact2"
})
@Generated("jsonschema2pojo")
public class FinanceDetailCodes100PutResponse {

    @JsonProperty("tbbdetc")
    private List<Tbbdetc__2> tbbdetc = new ArrayList<Tbbdetc__2>();
    @JsonProperty("tbbeact2")
    private List<Tbbeact2__2> tbbeact2 = new ArrayList<Tbbeact2__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbbdetc")
    public List<Tbbdetc__2> getTbbdetc() {
        return tbbdetc;
    }

    @JsonProperty("tbbdetc")
    public void setTbbdetc(List<Tbbdetc__2> tbbdetc) {
        this.tbbdetc = tbbdetc;
    }

    public FinanceDetailCodes100PutResponse withTbbdetc(List<Tbbdetc__2> tbbdetc) {
        this.tbbdetc = tbbdetc;
        return this;
    }

    @JsonProperty("tbbeact2")
    public List<Tbbeact2__2> getTbbeact2() {
        return tbbeact2;
    }

    @JsonProperty("tbbeact2")
    public void setTbbeact2(List<Tbbeact2__2> tbbeact2) {
        this.tbbeact2 = tbbeact2;
    }

    public FinanceDetailCodes100PutResponse withTbbeact2(List<Tbbeact2__2> tbbeact2) {
        this.tbbeact2 = tbbeact2;
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

    public FinanceDetailCodes100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceDetailCodes100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbdetc");
        sb.append('=');
        sb.append(((this.tbbdetc == null)?"<null>":this.tbbdetc));
        sb.append(',');
        sb.append("tbbeact2");
        sb.append('=');
        sb.append(((this.tbbeact2 == null)?"<null>":this.tbbeact2));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbbdetc == null)? 0 :this.tbbdetc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceDetailCodes100PutResponse) == false) {
            return false;
        }
        FinanceDetailCodes100PutResponse rhs = ((FinanceDetailCodes100PutResponse) other);
        return ((((this.tbbeact2 == rhs.tbbeact2)||((this.tbbeact2 != null)&&this.tbbeact2 .equals(rhs.tbbeact2)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbbdetc == rhs.tbbdetc)||((this.tbbdetc!= null)&&this.tbbdetc.equals(rhs.tbbdetc))));
    }

}
