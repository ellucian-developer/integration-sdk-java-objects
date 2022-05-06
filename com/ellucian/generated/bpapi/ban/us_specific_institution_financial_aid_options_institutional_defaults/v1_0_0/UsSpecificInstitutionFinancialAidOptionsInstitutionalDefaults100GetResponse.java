
package com.ellucian.generated.bpapi.ban.us_specific_institution_financial_aid_options_institutional_defaults.v1_0_0;

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
    "rorinid"
})
@Generated("jsonschema2pojo")
public class UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetResponse {

    @JsonProperty("robinst")
    private List<Robinst> robinst = new ArrayList<Robinst>();
    @JsonProperty("rorinid")
    private List<Rorinid> rorinid = new ArrayList<Rorinid>();
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

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetResponse withRobinst(List<Robinst> robinst) {
        this.robinst = robinst;
        return this;
    }

    @JsonProperty("rorinid")
    public List<Rorinid> getRorinid() {
        return rorinid;
    }

    @JsonProperty("rorinid")
    public void setRorinid(List<Rorinid> rorinid) {
        this.rorinid = rorinid;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetResponse withRorinid(List<Rorinid> rorinid) {
        this.rorinid = rorinid;
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

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("robinst");
        sb.append('=');
        sb.append(((this.robinst == null)?"<null>":this.robinst));
        sb.append(',');
        sb.append("rorinid");
        sb.append('=');
        sb.append(((this.rorinid == null)?"<null>":this.rorinid));
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
        result = ((result* 31)+((this.robinst == null)? 0 :this.robinst.hashCode()));
        result = ((result* 31)+((this.rorinid == null)? 0 :this.rorinid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetResponse) == false) {
            return false;
        }
        UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetResponse rhs = ((UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.robinst == rhs.robinst)||((this.robinst!= null)&&this.robinst.equals(rhs.robinst))))&&((this.rorinid == rhs.rorinid)||((this.rorinid!= null)&&this.rorinid.equals(rhs.rorinid))));
    }

}
