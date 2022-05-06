
package com.ellucian.generated.bpapi.ban.us_specific_institution_financial_aid_options_institutional_defaults.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keyblckAidyCode",
    "cssCollCde"
})
@Generated("jsonschema2pojo")
public class UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetRequest {

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private Object keyblckAidyCode;
    /**
     * College Scholarship Service ID
     * <p>
     * Lineage reference object : RORINID_CSS_COLL_CDE
     * 
     */
    @JsonProperty("cssCollCde")
    @JsonPropertyDescription("Lineage reference object : RORINID_CSS_COLL_CDE")
    private String cssCollCde;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public Object getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetRequest withKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * College Scholarship Service ID
     * <p>
     * Lineage reference object : RORINID_CSS_COLL_CDE
     * 
     */
    @JsonProperty("cssCollCde")
    public String getCssCollCde() {
        return cssCollCde;
    }

    /**
     * College Scholarship Service ID
     * <p>
     * Lineage reference object : RORINID_CSS_COLL_CDE
     * 
     */
    @JsonProperty("cssCollCde")
    public void setCssCollCde(String cssCollCde) {
        this.cssCollCde = cssCollCde;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetRequest withCssCollCde(String cssCollCde) {
        this.cssCollCde = cssCollCde;
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

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("cssCollCde");
        sb.append('=');
        sb.append(((this.cssCollCde == null)?"<null>":this.cssCollCde));
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
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cssCollCde == null)? 0 :this.cssCollCde.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetRequest) == false) {
            return false;
        }
        UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetRequest rhs = ((UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100GetRequest) other);
        return ((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cssCollCde == rhs.cssCollCde)||((this.cssCollCde!= null)&&this.cssCollCde.equals(rhs.cssCollCde))));
    }

}
