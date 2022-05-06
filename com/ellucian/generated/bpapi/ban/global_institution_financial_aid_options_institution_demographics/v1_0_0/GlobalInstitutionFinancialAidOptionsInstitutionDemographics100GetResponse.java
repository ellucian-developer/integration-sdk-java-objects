
package com.ellucian.generated.bpapi.ban.global_institution_financial_aid_options_institution_demographics.v1_0_0;

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
    "rorcamp"
})
@Generated("jsonschema2pojo")
public class GlobalInstitutionFinancialAidOptionsInstitutionDemographics100GetResponse {

    @JsonProperty("robinst")
    private List<Robinst> robinst = new ArrayList<Robinst>();
    @JsonProperty("rorcamp")
    private List<Rorcamp> rorcamp = new ArrayList<Rorcamp>();
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

    public GlobalInstitutionFinancialAidOptionsInstitutionDemographics100GetResponse withRobinst(List<Robinst> robinst) {
        this.robinst = robinst;
        return this;
    }

    @JsonProperty("rorcamp")
    public List<Rorcamp> getRorcamp() {
        return rorcamp;
    }

    @JsonProperty("rorcamp")
    public void setRorcamp(List<Rorcamp> rorcamp) {
        this.rorcamp = rorcamp;
    }

    public GlobalInstitutionFinancialAidOptionsInstitutionDemographics100GetResponse withRorcamp(List<Rorcamp> rorcamp) {
        this.rorcamp = rorcamp;
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

    public GlobalInstitutionFinancialAidOptionsInstitutionDemographics100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalInstitutionFinancialAidOptionsInstitutionDemographics100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("robinst");
        sb.append('=');
        sb.append(((this.robinst == null)?"<null>":this.robinst));
        sb.append(',');
        sb.append("rorcamp");
        sb.append('=');
        sb.append(((this.rorcamp == null)?"<null>":this.rorcamp));
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
        result = ((result* 31)+((this.rorcamp == null)? 0 :this.rorcamp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.robinst == null)? 0 :this.robinst.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlobalInstitutionFinancialAidOptionsInstitutionDemographics100GetResponse) == false) {
            return false;
        }
        GlobalInstitutionFinancialAidOptionsInstitutionDemographics100GetResponse rhs = ((GlobalInstitutionFinancialAidOptionsInstitutionDemographics100GetResponse) other);
        return ((((this.rorcamp == rhs.rorcamp)||((this.rorcamp!= null)&&this.rorcamp.equals(rhs.rorcamp)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.robinst == rhs.robinst)||((this.robinst!= null)&&this.robinst.equals(rhs.robinst))));
    }

}
