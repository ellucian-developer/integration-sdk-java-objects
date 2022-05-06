
package com.ellucian.generated.bpapi.ban.contract_review.v1_0_0;

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
    "tbvconr",
    "tbvconr_ctrl"
})
@Generated("jsonschema2pojo")
public class ContractReview100GetResponse {

    @JsonProperty("tbvconr")
    private List<Tbvconr> tbvconr = new ArrayList<Tbvconr>();
    @JsonProperty("tbvconr_ctrl")
    private List<TbvconrCtrl> tbvconrCtrl = new ArrayList<TbvconrCtrl>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbvconr")
    public List<Tbvconr> getTbvconr() {
        return tbvconr;
    }

    @JsonProperty("tbvconr")
    public void setTbvconr(List<Tbvconr> tbvconr) {
        this.tbvconr = tbvconr;
    }

    public ContractReview100GetResponse withTbvconr(List<Tbvconr> tbvconr) {
        this.tbvconr = tbvconr;
        return this;
    }

    @JsonProperty("tbvconr_ctrl")
    public List<TbvconrCtrl> getTbvconrCtrl() {
        return tbvconrCtrl;
    }

    @JsonProperty("tbvconr_ctrl")
    public void setTbvconrCtrl(List<TbvconrCtrl> tbvconrCtrl) {
        this.tbvconrCtrl = tbvconrCtrl;
    }

    public ContractReview100GetResponse withTbvconrCtrl(List<TbvconrCtrl> tbvconrCtrl) {
        this.tbvconrCtrl = tbvconrCtrl;
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

    public ContractReview100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractReview100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbvconr");
        sb.append('=');
        sb.append(((this.tbvconr == null)?"<null>":this.tbvconr));
        sb.append(',');
        sb.append("tbvconrCtrl");
        sb.append('=');
        sb.append(((this.tbvconrCtrl == null)?"<null>":this.tbvconrCtrl));
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
        result = ((result* 31)+((this.tbvconr == null)? 0 :this.tbvconr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbvconrCtrl == null)? 0 :this.tbvconrCtrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractReview100GetResponse) == false) {
            return false;
        }
        ContractReview100GetResponse rhs = ((ContractReview100GetResponse) other);
        return ((((this.tbvconr == rhs.tbvconr)||((this.tbvconr!= null)&&this.tbvconr.equals(rhs.tbvconr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbvconrCtrl == rhs.tbvconrCtrl)||((this.tbvconrCtrl!= null)&&this.tbvconrCtrl.equals(rhs.tbvconrCtrl))));
    }

}
