
package com.ellucian.generated.bpapi.ban.benefit_or_deduction_grouping_rule.v1_0_0;

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
    "ptrbdsg",
    "ptrbdpg",
    "ptrbdgm"
})
@Generated("jsonschema2pojo")
public class BenefitOrDeductionGroupingRule100GetResponse {

    @JsonProperty("ptrbdsg")
    private List<Ptrbdsg> ptrbdsg = new ArrayList<Ptrbdsg>();
    @JsonProperty("ptrbdpg")
    private List<Ptrbdpg> ptrbdpg = new ArrayList<Ptrbdpg>();
    @JsonProperty("ptrbdgm")
    private List<Ptrbdgm> ptrbdgm = new ArrayList<Ptrbdgm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ptrbdsg")
    public List<Ptrbdsg> getPtrbdsg() {
        return ptrbdsg;
    }

    @JsonProperty("ptrbdsg")
    public void setPtrbdsg(List<Ptrbdsg> ptrbdsg) {
        this.ptrbdsg = ptrbdsg;
    }

    public BenefitOrDeductionGroupingRule100GetResponse withPtrbdsg(List<Ptrbdsg> ptrbdsg) {
        this.ptrbdsg = ptrbdsg;
        return this;
    }

    @JsonProperty("ptrbdpg")
    public List<Ptrbdpg> getPtrbdpg() {
        return ptrbdpg;
    }

    @JsonProperty("ptrbdpg")
    public void setPtrbdpg(List<Ptrbdpg> ptrbdpg) {
        this.ptrbdpg = ptrbdpg;
    }

    public BenefitOrDeductionGroupingRule100GetResponse withPtrbdpg(List<Ptrbdpg> ptrbdpg) {
        this.ptrbdpg = ptrbdpg;
        return this;
    }

    @JsonProperty("ptrbdgm")
    public List<Ptrbdgm> getPtrbdgm() {
        return ptrbdgm;
    }

    @JsonProperty("ptrbdgm")
    public void setPtrbdgm(List<Ptrbdgm> ptrbdgm) {
        this.ptrbdgm = ptrbdgm;
    }

    public BenefitOrDeductionGroupingRule100GetResponse withPtrbdgm(List<Ptrbdgm> ptrbdgm) {
        this.ptrbdgm = ptrbdgm;
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

    public BenefitOrDeductionGroupingRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitOrDeductionGroupingRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ptrbdsg");
        sb.append('=');
        sb.append(((this.ptrbdsg == null)?"<null>":this.ptrbdsg));
        sb.append(',');
        sb.append("ptrbdpg");
        sb.append('=');
        sb.append(((this.ptrbdpg == null)?"<null>":this.ptrbdpg));
        sb.append(',');
        sb.append("ptrbdgm");
        sb.append('=');
        sb.append(((this.ptrbdgm == null)?"<null>":this.ptrbdgm));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ptrbdsg == null)? 0 :this.ptrbdsg.hashCode()));
        result = ((result* 31)+((this.ptrbdgm == null)? 0 :this.ptrbdgm.hashCode()));
        result = ((result* 31)+((this.ptrbdpg == null)? 0 :this.ptrbdpg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitOrDeductionGroupingRule100GetResponse) == false) {
            return false;
        }
        BenefitOrDeductionGroupingRule100GetResponse rhs = ((BenefitOrDeductionGroupingRule100GetResponse) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ptrbdsg == rhs.ptrbdsg)||((this.ptrbdsg!= null)&&this.ptrbdsg.equals(rhs.ptrbdsg))))&&((this.ptrbdgm == rhs.ptrbdgm)||((this.ptrbdgm!= null)&&this.ptrbdgm.equals(rhs.ptrbdgm))))&&((this.ptrbdpg == rhs.ptrbdpg)||((this.ptrbdpg!= null)&&this.ptrbdpg.equals(rhs.ptrbdpg))));
    }

}
