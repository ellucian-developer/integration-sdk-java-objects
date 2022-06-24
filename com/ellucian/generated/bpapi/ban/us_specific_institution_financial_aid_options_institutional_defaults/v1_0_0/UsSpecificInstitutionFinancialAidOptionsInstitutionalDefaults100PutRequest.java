
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
    "criteria.cssCollCde",
    "keyblckAidyCode",
    "titleIvRoundInd",
    "fedSchoolCode",
    "servAgentCde",
    "pellFundCode",
    "entityId",
    "destNumber",
    "titleIvRetInd",
    "cssCollCde"
})
@Generated("jsonschema2pojo")
public class UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest {

    /**
     * College Scholarship Service ID
     * <p>
     * Lineage reference object : RORINID_CSS_COLL_CDE
     * 
     */
    @JsonProperty("criteria.cssCollCde")
    @JsonPropertyDescription("Lineage reference object : RORINID_CSS_COLL_CDE")
    private String criteriaCssCollCde;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private String keyblckAidyCode;
    /**
     * Rounding Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_ROUND_IND
     * 
     */
    @JsonProperty("titleIvRoundInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TITLE_IV_ROUND_IND")
    private String titleIvRoundInd;
    /**
     * Federal School Code
     * <p>
     * Lineage reference object : ROBINST_FED_SCHOOL_CODE
     * 
     */
    @JsonProperty("fedSchoolCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_FED_SCHOOL_CODE")
    private String fedSchoolCode;
    /**
     * Service Agent Code
     * <p>
     * Lineage reference object : ROBINST_SERV_AGENT_CDE
     * 
     */
    @JsonProperty("servAgentCde")
    @JsonPropertyDescription("Lineage reference object : ROBINST_SERV_AGENT_CDE")
    private String servAgentCde;
    /**
     * Pell Fund Code
     * <p>
     * Lineage reference object : ROBINST_PELL_FUND_CODE, Lookup lineage reference object : rfrbase
     * 
     */
    @JsonProperty("pellFundCode")
    @JsonPropertyDescription("Lineage reference object : ROBINST_PELL_FUND_CODE, Lookup lineage reference object : rfrbase")
    private String pellFundCode;
    /**
     * Main Campus Entity ID
     * <p>
     * Lineage reference object : ROBINST_ENTITY_ID
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("Lineage reference object : ROBINST_ENTITY_ID")
    private String entityId;
    /**
     * Title IV Destination Number
     * <p>
     * Lineage reference object : ROBINST_DEST_NUMBER
     * 
     */
    @JsonProperty("destNumber")
    @JsonPropertyDescription("Lineage reference object : ROBINST_DEST_NUMBER")
    private String destNumber;
    /**
     * Return Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_RET_IND
     * 
     */
    @JsonProperty("titleIvRetInd")
    @JsonPropertyDescription("Lineage reference object : ROBINST_TITLE_IV_RET_IND")
    private String titleIvRetInd;
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
     * College Scholarship Service ID
     * <p>
     * Lineage reference object : RORINID_CSS_COLL_CDE
     * 
     */
    @JsonProperty("criteria.cssCollCde")
    public String getCriteriaCssCollCde() {
        return criteriaCssCollCde;
    }

    /**
     * College Scholarship Service ID
     * <p>
     * Lineage reference object : RORINID_CSS_COLL_CDE
     * 
     */
    @JsonProperty("criteria.cssCollCde")
    public void setCriteriaCssCollCde(String criteriaCssCollCde) {
        this.criteriaCssCollCde = criteriaCssCollCde;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withCriteriaCssCollCde(String criteriaCssCollCde) {
        this.criteriaCssCollCde = criteriaCssCollCde;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Rounding Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_ROUND_IND
     * 
     */
    @JsonProperty("titleIvRoundInd")
    public String getTitleIvRoundInd() {
        return titleIvRoundInd;
    }

    /**
     * Rounding Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_ROUND_IND
     * 
     */
    @JsonProperty("titleIvRoundInd")
    public void setTitleIvRoundInd(String titleIvRoundInd) {
        this.titleIvRoundInd = titleIvRoundInd;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withTitleIvRoundInd(String titleIvRoundInd) {
        this.titleIvRoundInd = titleIvRoundInd;
        return this;
    }

    /**
     * Federal School Code
     * <p>
     * Lineage reference object : ROBINST_FED_SCHOOL_CODE
     * 
     */
    @JsonProperty("fedSchoolCode")
    public String getFedSchoolCode() {
        return fedSchoolCode;
    }

    /**
     * Federal School Code
     * <p>
     * Lineage reference object : ROBINST_FED_SCHOOL_CODE
     * 
     */
    @JsonProperty("fedSchoolCode")
    public void setFedSchoolCode(String fedSchoolCode) {
        this.fedSchoolCode = fedSchoolCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withFedSchoolCode(String fedSchoolCode) {
        this.fedSchoolCode = fedSchoolCode;
        return this;
    }

    /**
     * Service Agent Code
     * <p>
     * Lineage reference object : ROBINST_SERV_AGENT_CDE
     * 
     */
    @JsonProperty("servAgentCde")
    public String getServAgentCde() {
        return servAgentCde;
    }

    /**
     * Service Agent Code
     * <p>
     * Lineage reference object : ROBINST_SERV_AGENT_CDE
     * 
     */
    @JsonProperty("servAgentCde")
    public void setServAgentCde(String servAgentCde) {
        this.servAgentCde = servAgentCde;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withServAgentCde(String servAgentCde) {
        this.servAgentCde = servAgentCde;
        return this;
    }

    /**
     * Pell Fund Code
     * <p>
     * Lineage reference object : ROBINST_PELL_FUND_CODE, Lookup lineage reference object : rfrbase
     * 
     */
    @JsonProperty("pellFundCode")
    public String getPellFundCode() {
        return pellFundCode;
    }

    /**
     * Pell Fund Code
     * <p>
     * Lineage reference object : ROBINST_PELL_FUND_CODE, Lookup lineage reference object : rfrbase
     * 
     */
    @JsonProperty("pellFundCode")
    public void setPellFundCode(String pellFundCode) {
        this.pellFundCode = pellFundCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withPellFundCode(String pellFundCode) {
        this.pellFundCode = pellFundCode;
        return this;
    }

    /**
     * Main Campus Entity ID
     * <p>
     * Lineage reference object : ROBINST_ENTITY_ID
     * 
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Main Campus Entity ID
     * <p>
     * Lineage reference object : ROBINST_ENTITY_ID
     * 
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Title IV Destination Number
     * <p>
     * Lineage reference object : ROBINST_DEST_NUMBER
     * 
     */
    @JsonProperty("destNumber")
    public String getDestNumber() {
        return destNumber;
    }

    /**
     * Title IV Destination Number
     * <p>
     * Lineage reference object : ROBINST_DEST_NUMBER
     * 
     */
    @JsonProperty("destNumber")
    public void setDestNumber(String destNumber) {
        this.destNumber = destNumber;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withDestNumber(String destNumber) {
        this.destNumber = destNumber;
        return this;
    }

    /**
     * Return Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_RET_IND
     * 
     */
    @JsonProperty("titleIvRetInd")
    public String getTitleIvRetInd() {
        return titleIvRetInd;
    }

    /**
     * Return Indicator
     * <p>
     * Lineage reference object : ROBINST_TITLE_IV_RET_IND
     * 
     */
    @JsonProperty("titleIvRetInd")
    public void setTitleIvRetInd(String titleIvRetInd) {
        this.titleIvRetInd = titleIvRetInd;
    }

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withTitleIvRetInd(String titleIvRetInd) {
        this.titleIvRetInd = titleIvRetInd;
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

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withCssCollCde(String cssCollCde) {
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

    public UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCssCollCde");
        sb.append('=');
        sb.append(((this.criteriaCssCollCde == null)?"<null>":this.criteriaCssCollCde));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("titleIvRoundInd");
        sb.append('=');
        sb.append(((this.titleIvRoundInd == null)?"<null>":this.titleIvRoundInd));
        sb.append(',');
        sb.append("fedSchoolCode");
        sb.append('=');
        sb.append(((this.fedSchoolCode == null)?"<null>":this.fedSchoolCode));
        sb.append(',');
        sb.append("servAgentCde");
        sb.append('=');
        sb.append(((this.servAgentCde == null)?"<null>":this.servAgentCde));
        sb.append(',');
        sb.append("pellFundCode");
        sb.append('=');
        sb.append(((this.pellFundCode == null)?"<null>":this.pellFundCode));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("destNumber");
        sb.append('=');
        sb.append(((this.destNumber == null)?"<null>":this.destNumber));
        sb.append(',');
        sb.append("titleIvRetInd");
        sb.append('=');
        sb.append(((this.titleIvRetInd == null)?"<null>":this.titleIvRetInd));
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
        result = ((result* 31)+((this.titleIvRoundInd == null)? 0 :this.titleIvRoundInd.hashCode()));
        result = ((result* 31)+((this.fedSchoolCode == null)? 0 :this.fedSchoolCode.hashCode()));
        result = ((result* 31)+((this.servAgentCde == null)? 0 :this.servAgentCde.hashCode()));
        result = ((result* 31)+((this.pellFundCode == null)? 0 :this.pellFundCode.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.destNumber == null)? 0 :this.destNumber.hashCode()));
        result = ((result* 31)+((this.titleIvRetInd == null)? 0 :this.titleIvRetInd.hashCode()));
        result = ((result* 31)+((this.criteriaCssCollCde == null)? 0 :this.criteriaCssCollCde.hashCode()));
        result = ((result* 31)+((this.cssCollCde == null)? 0 :this.cssCollCde.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest) == false) {
            return false;
        }
        UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest rhs = ((UsSpecificInstitutionFinancialAidOptionsInstitutionalDefaults100PutRequest) other);
        return ((((((((((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.titleIvRoundInd == rhs.titleIvRoundInd)||((this.titleIvRoundInd!= null)&&this.titleIvRoundInd.equals(rhs.titleIvRoundInd))))&&((this.fedSchoolCode == rhs.fedSchoolCode)||((this.fedSchoolCode!= null)&&this.fedSchoolCode.equals(rhs.fedSchoolCode))))&&((this.servAgentCde == rhs.servAgentCde)||((this.servAgentCde!= null)&&this.servAgentCde.equals(rhs.servAgentCde))))&&((this.pellFundCode == rhs.pellFundCode)||((this.pellFundCode!= null)&&this.pellFundCode.equals(rhs.pellFundCode))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.destNumber == rhs.destNumber)||((this.destNumber!= null)&&this.destNumber.equals(rhs.destNumber))))&&((this.titleIvRetInd == rhs.titleIvRetInd)||((this.titleIvRetInd!= null)&&this.titleIvRetInd.equals(rhs.titleIvRetInd))))&&((this.criteriaCssCollCde == rhs.criteriaCssCollCde)||((this.criteriaCssCollCde!= null)&&this.criteriaCssCollCde.equals(rhs.criteriaCssCollCde))))&&((this.cssCollCde == rhs.cssCollCde)||((this.cssCollCde!= null)&&this.cssCollCde.equals(rhs.cssCollCde))));
    }

}
