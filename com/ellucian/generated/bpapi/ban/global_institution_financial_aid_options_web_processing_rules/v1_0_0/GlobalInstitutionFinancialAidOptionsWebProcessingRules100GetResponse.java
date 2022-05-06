
package com.ellucian.generated.bpapi.ban.global_institution_financial_aid_options_web_processing_rules.v1_0_0;

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
    "rorwebr",
    "rorweba"
})
@Generated("jsonschema2pojo")
public class GlobalInstitutionFinancialAidOptionsWebProcessingRules100GetResponse {

    @JsonProperty("rorwebr")
    private List<Rorwebr> rorwebr = new ArrayList<Rorwebr>();
    @JsonProperty("rorweba")
    private List<Rorweba> rorweba = new ArrayList<Rorweba>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rorwebr")
    public List<Rorwebr> getRorwebr() {
        return rorwebr;
    }

    @JsonProperty("rorwebr")
    public void setRorwebr(List<Rorwebr> rorwebr) {
        this.rorwebr = rorwebr;
    }

    public GlobalInstitutionFinancialAidOptionsWebProcessingRules100GetResponse withRorwebr(List<Rorwebr> rorwebr) {
        this.rorwebr = rorwebr;
        return this;
    }

    @JsonProperty("rorweba")
    public List<Rorweba> getRorweba() {
        return rorweba;
    }

    @JsonProperty("rorweba")
    public void setRorweba(List<Rorweba> rorweba) {
        this.rorweba = rorweba;
    }

    public GlobalInstitutionFinancialAidOptionsWebProcessingRules100GetResponse withRorweba(List<Rorweba> rorweba) {
        this.rorweba = rorweba;
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

    public GlobalInstitutionFinancialAidOptionsWebProcessingRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalInstitutionFinancialAidOptionsWebProcessingRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rorwebr");
        sb.append('=');
        sb.append(((this.rorwebr == null)?"<null>":this.rorwebr));
        sb.append(',');
        sb.append("rorweba");
        sb.append('=');
        sb.append(((this.rorweba == null)?"<null>":this.rorweba));
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
        result = ((result* 31)+((this.rorweba == null)? 0 :this.rorweba.hashCode()));
        result = ((result* 31)+((this.rorwebr == null)? 0 :this.rorwebr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlobalInstitutionFinancialAidOptionsWebProcessingRules100GetResponse) == false) {
            return false;
        }
        GlobalInstitutionFinancialAidOptionsWebProcessingRules100GetResponse rhs = ((GlobalInstitutionFinancialAidOptionsWebProcessingRules100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.rorweba == rhs.rorweba)||((this.rorweba!= null)&&this.rorweba.equals(rhs.rorweba))))&&((this.rorwebr == rhs.rorwebr)||((this.rorwebr!= null)&&this.rorwebr.equals(rhs.rorwebr))));
    }

}
