
package com.ellucian.generated.bpapi.ban.us_specific_institution_financial_aid_options_direct_loan_mpn_rules.v1_0_0;

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
    "robinst",
    "rlrdmpo",
    "rlrdmps"
})
@Generated("jsonschema2pojo")
public class UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetResponse {

    @JsonProperty("robinst")
    private List<Robinst> robinst = new ArrayList<Robinst>();
    @JsonProperty("rlrdmpo")
    private List<Rlrdmpo> rlrdmpo = new ArrayList<Rlrdmpo>();
    @JsonProperty("rlrdmps")
    private List<Rlrdmp> rlrdmps = new ArrayList<Rlrdmp>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("robinst")
    public List<Robinst> getRobinst() {
        return robinst;
    }

    @JsonProperty("robinst")
    public void setRobinst(List<Robinst> robinst) {
        this.robinst = robinst;
    }

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetResponse withRobinst(List<Robinst> robinst) {
        this.robinst = robinst;
        return this;
    }

    @JsonProperty("rlrdmpo")
    public List<Rlrdmpo> getRlrdmpo() {
        return rlrdmpo;
    }

    @JsonProperty("rlrdmpo")
    public void setRlrdmpo(List<Rlrdmpo> rlrdmpo) {
        this.rlrdmpo = rlrdmpo;
    }

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetResponse withRlrdmpo(List<Rlrdmpo> rlrdmpo) {
        this.rlrdmpo = rlrdmpo;
        return this;
    }

    @JsonProperty("rlrdmps")
    public List<Rlrdmp> getRlrdmps() {
        return rlrdmps;
    }

    @JsonProperty("rlrdmps")
    public void setRlrdmps(List<Rlrdmp> rlrdmps) {
        this.rlrdmps = rlrdmps;
    }

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetResponse withRlrdmps(List<Rlrdmp> rlrdmps) {
        this.rlrdmps = rlrdmps;
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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("robinst");
        sb.append('=');
        sb.append(((this.robinst == null)?"<null>":this.robinst));
        sb.append(',');
        sb.append("rlrdmpo");
        sb.append('=');
        sb.append(((this.rlrdmpo == null)?"<null>":this.rlrdmpo));
        sb.append(',');
        sb.append("rlrdmps");
        sb.append('=');
        sb.append(((this.rlrdmps == null)?"<null>":this.rlrdmps));
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
        result = ((result* 31)+((this.rlrdmps == null)? 0 :this.rlrdmps.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.robinst == null)? 0 :this.robinst.hashCode()));
        result = ((result* 31)+((this.rlrdmpo == null)? 0 :this.rlrdmpo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetResponse) == false) {
            return false;
        }
        UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetResponse rhs = ((UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetResponse) other);
        return (((((this.rlrdmps == rhs.rlrdmps)||((this.rlrdmps!= null)&&this.rlrdmps.equals(rhs.rlrdmps)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.robinst == rhs.robinst)||((this.robinst!= null)&&this.robinst.equals(rhs.robinst))))&&((this.rlrdmpo == rhs.rlrdmpo)||((this.rlrdmpo!= null)&&this.rlrdmpo.equals(rhs.rlrdmpo))));
    }

}
