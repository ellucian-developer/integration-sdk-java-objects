
package com.ellucian.generated.bpapi.ban.support_service_detail_service_assgnment.v1_0_0;

import java.util.Date;
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
    "seprCode",
    "criteria.origCode",
    "endDate",
    "sprvCode",
    "criteria.endDate",
    "seadetlSsgpCode",
    "sserCode",
    "criteria.ssstCode",
    "criteria.beginDate",
    "criteria.seprCode",
    "ssepCode",
    "origCode",
    "beginDate",
    "criteria.ssepCode",
    "criteria.ssrsCode",
    "seadetlTermCodeEff",
    "ssgpCode",
    "seadetlId",
    "criteria.sserCode",
    "criteria.ssgpCode",
    "criteria.sprvCode",
    "ssstCode",
    "ssrsCode"
})
@Generated("jsonschema2pojo")
public class SupportServiceDetailServiceAssgnment100PutRequest {

    /**
     * Service Provided
     * <p>
     * Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr
     * 
     */
    @JsonProperty("seprCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr")
    private String seprCode;
    /**
     * Review
     * <p>
     * Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : SERDTSR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_END_DATE")
    private Date endDate;
    /**
     * Service Provider
     * <p>
     * Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv
     * 
     */
    @JsonProperty("sprvCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv")
    private String sprvCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : SERDTSR_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_END_DATE")
    private Date criteriaEndDate;
    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("seadetlSsgpCode")
    @JsonPropertyDescription("Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp")
    private Object seadetlSsgpCode;
    /**
     * Service
     * <p>
     * Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser
     * (Required)
     * 
     */
    @JsonProperty("sserCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser")
    private String sserCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("criteria.ssstCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst")
    private String criteriaSsstCode;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("criteria.beginDate")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_BEGIN_DATE")
    private Date criteriaBeginDate;
    /**
     * Service Provided
     * <p>
     * Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr
     * 
     */
    @JsonProperty("criteria.seprCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr")
    private String criteriaSeprCode;
    /**
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("ssepCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep")
    private String ssepCode;
    /**
     * Review
     * <p>
     * Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_BEGIN_DATE")
    private Date beginDate;
    /**
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("criteria.ssepCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep")
    private String criteriaSsepCode;
    /**
     * Result
     * <p>
     * Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("criteria.ssrsCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs")
    private String criteriaSsrsCode;
    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("seadetlTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm")
    private Object seadetlTermCodeEff;
    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("seadetlId")
    @JsonPropertyDescription("Lineage reference object : seadetlId")
    private Object seadetlId;
    /**
     * Service
     * <p>
     * Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser
     * (Required)
     * 
     */
    @JsonProperty("criteria.sserCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser")
    private String criteriaSserCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String criteriaSsgpCode;
    /**
     * Service Provider
     * <p>
     * Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv
     * 
     */
    @JsonProperty("criteria.sprvCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv")
    private String criteriaSprvCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst")
    private String ssstCode;
    /**
     * Result
     * <p>
     * Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs")
    private String ssrsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Service Provided
     * <p>
     * Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr
     * 
     */
    @JsonProperty("seprCode")
    public String getSeprCode() {
        return seprCode;
    }

    /**
     * Service Provided
     * <p>
     * Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr
     * 
     */
    @JsonProperty("seprCode")
    public void setSeprCode(String seprCode) {
        this.seprCode = seprCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSeprCode(String seprCode) {
        this.seprCode = seprCode;
        return this;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public String getCriteriaOrigCode() {
        return criteriaOrigCode;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SERDTSR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SERDTSR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Service Provider
     * <p>
     * Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv
     * 
     */
    @JsonProperty("sprvCode")
    public String getSprvCode() {
        return sprvCode;
    }

    /**
     * Service Provider
     * <p>
     * Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv
     * 
     */
    @JsonProperty("sprvCode")
    public void setSprvCode(String sprvCode) {
        this.sprvCode = sprvCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSprvCode(String sprvCode) {
        this.sprvCode = sprvCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SERDTSR_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SERDTSR_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("seadetlSsgpCode")
    public Object getSeadetlSsgpCode() {
        return seadetlSsgpCode;
    }

    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("seadetlSsgpCode")
    public void setSeadetlSsgpCode(Object seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSeadetlSsgpCode(Object seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
        return this;
    }

    /**
     * Service
     * <p>
     * Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser
     * (Required)
     * 
     */
    @JsonProperty("sserCode")
    public String getSserCode() {
        return sserCode;
    }

    /**
     * Service
     * <p>
     * Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser
     * (Required)
     * 
     */
    @JsonProperty("sserCode")
    public void setSserCode(String sserCode) {
        this.sserCode = sserCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSserCode(String sserCode) {
        this.sserCode = sserCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("criteria.ssstCode")
    public String getCriteriaSsstCode() {
        return criteriaSsstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("criteria.ssstCode")
    public void setCriteriaSsstCode(String criteriaSsstCode) {
        this.criteriaSsstCode = criteriaSsstCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaSsstCode(String criteriaSsstCode) {
        this.criteriaSsstCode = criteriaSsstCode;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("criteria.beginDate")
    public Date getCriteriaBeginDate() {
        return criteriaBeginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("criteria.beginDate")
    public void setCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
        return this;
    }

    /**
     * Service Provided
     * <p>
     * Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr
     * 
     */
    @JsonProperty("criteria.seprCode")
    public String getCriteriaSeprCode() {
        return criteriaSeprCode;
    }

    /**
     * Service Provided
     * <p>
     * Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr
     * 
     */
    @JsonProperty("criteria.seprCode")
    public void setCriteriaSeprCode(String criteriaSeprCode) {
        this.criteriaSeprCode = criteriaSeprCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaSeprCode(String criteriaSeprCode) {
        this.criteriaSeprCode = criteriaSeprCode;
        return this;
    }

    /**
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("ssepCode")
    public String getSsepCode() {
        return ssepCode;
    }

    /**
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("ssepCode")
    public void setSsepCode(String ssepCode) {
        this.ssepCode = ssepCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSsepCode(String ssepCode) {
        this.ssepCode = ssepCode;
        return this;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("criteria.ssepCode")
    public String getCriteriaSsepCode() {
        return criteriaSsepCode;
    }

    /**
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("criteria.ssepCode")
    public void setCriteriaSsepCode(String criteriaSsepCode) {
        this.criteriaSsepCode = criteriaSsepCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaSsepCode(String criteriaSsepCode) {
        this.criteriaSsepCode = criteriaSsepCode;
        return this;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("criteria.ssrsCode")
    public String getCriteriaSsrsCode() {
        return criteriaSsrsCode;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("criteria.ssrsCode")
    public void setCriteriaSsrsCode(String criteriaSsrsCode) {
        this.criteriaSsrsCode = criteriaSsrsCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaSsrsCode(String criteriaSsrsCode) {
        this.criteriaSsrsCode = criteriaSsrsCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("seadetlTermCodeEff")
    public Object getSeadetlTermCodeEff() {
        return seadetlTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("seadetlTermCodeEff")
    public void setSeadetlTermCodeEff(Object seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSeadetlTermCodeEff(Object seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("seadetlId")
    public Object getSeadetlId() {
        return seadetlId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("seadetlId")
    public void setSeadetlId(Object seadetlId) {
        this.seadetlId = seadetlId;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSeadetlId(Object seadetlId) {
        this.seadetlId = seadetlId;
        return this;
    }

    /**
     * Service
     * <p>
     * Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser
     * (Required)
     * 
     */
    @JsonProperty("criteria.sserCode")
    public String getCriteriaSserCode() {
        return criteriaSserCode;
    }

    /**
     * Service
     * <p>
     * Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser
     * (Required)
     * 
     */
    @JsonProperty("criteria.sserCode")
    public void setCriteriaSserCode(String criteriaSserCode) {
        this.criteriaSserCode = criteriaSserCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaSserCode(String criteriaSserCode) {
        this.criteriaSserCode = criteriaSserCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public String getCriteriaSsgpCode() {
        return criteriaSsgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public void setCriteriaSsgpCode(String criteriaSsgpCode) {
        this.criteriaSsgpCode = criteriaSsgpCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaSsgpCode(String criteriaSsgpCode) {
        this.criteriaSsgpCode = criteriaSsgpCode;
        return this;
    }

    /**
     * Service Provider
     * <p>
     * Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv
     * 
     */
    @JsonProperty("criteria.sprvCode")
    public String getCriteriaSprvCode() {
        return criteriaSprvCode;
    }

    /**
     * Service Provider
     * <p>
     * Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv
     * 
     */
    @JsonProperty("criteria.sprvCode")
    public void setCriteriaSprvCode(String criteriaSprvCode) {
        this.criteriaSprvCode = criteriaSprvCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withCriteriaSprvCode(String criteriaSprvCode) {
        this.criteriaSprvCode = criteriaSprvCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public String getSsstCode() {
        return ssstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public void setSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
        return this;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    public String getSsrsCode() {
        return ssrsCode;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    public void setSsrsCode(String ssrsCode) {
        this.ssrsCode = ssrsCode;
    }

    public SupportServiceDetailServiceAssgnment100PutRequest withSsrsCode(String ssrsCode) {
        this.ssrsCode = ssrsCode;
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

    public SupportServiceDetailServiceAssgnment100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupportServiceDetailServiceAssgnment100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seprCode");
        sb.append('=');
        sb.append(((this.seprCode == null)?"<null>":this.seprCode));
        sb.append(',');
        sb.append("criteriaOrigCode");
        sb.append('=');
        sb.append(((this.criteriaOrigCode == null)?"<null>":this.criteriaOrigCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("sprvCode");
        sb.append('=');
        sb.append(((this.sprvCode == null)?"<null>":this.sprvCode));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("seadetlSsgpCode");
        sb.append('=');
        sb.append(((this.seadetlSsgpCode == null)?"<null>":this.seadetlSsgpCode));
        sb.append(',');
        sb.append("sserCode");
        sb.append('=');
        sb.append(((this.sserCode == null)?"<null>":this.sserCode));
        sb.append(',');
        sb.append("criteriaSsstCode");
        sb.append('=');
        sb.append(((this.criteriaSsstCode == null)?"<null>":this.criteriaSsstCode));
        sb.append(',');
        sb.append("criteriaBeginDate");
        sb.append('=');
        sb.append(((this.criteriaBeginDate == null)?"<null>":this.criteriaBeginDate));
        sb.append(',');
        sb.append("criteriaSeprCode");
        sb.append('=');
        sb.append(((this.criteriaSeprCode == null)?"<null>":this.criteriaSeprCode));
        sb.append(',');
        sb.append("ssepCode");
        sb.append('=');
        sb.append(((this.ssepCode == null)?"<null>":this.ssepCode));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("criteriaSsepCode");
        sb.append('=');
        sb.append(((this.criteriaSsepCode == null)?"<null>":this.criteriaSsepCode));
        sb.append(',');
        sb.append("criteriaSsrsCode");
        sb.append('=');
        sb.append(((this.criteriaSsrsCode == null)?"<null>":this.criteriaSsrsCode));
        sb.append(',');
        sb.append("seadetlTermCodeEff");
        sb.append('=');
        sb.append(((this.seadetlTermCodeEff == null)?"<null>":this.seadetlTermCodeEff));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("seadetlId");
        sb.append('=');
        sb.append(((this.seadetlId == null)?"<null>":this.seadetlId));
        sb.append(',');
        sb.append("criteriaSserCode");
        sb.append('=');
        sb.append(((this.criteriaSserCode == null)?"<null>":this.criteriaSserCode));
        sb.append(',');
        sb.append("criteriaSsgpCode");
        sb.append('=');
        sb.append(((this.criteriaSsgpCode == null)?"<null>":this.criteriaSsgpCode));
        sb.append(',');
        sb.append("criteriaSprvCode");
        sb.append('=');
        sb.append(((this.criteriaSprvCode == null)?"<null>":this.criteriaSprvCode));
        sb.append(',');
        sb.append("ssstCode");
        sb.append('=');
        sb.append(((this.ssstCode == null)?"<null>":this.ssstCode));
        sb.append(',');
        sb.append("ssrsCode");
        sb.append('=');
        sb.append(((this.ssrsCode == null)?"<null>":this.ssrsCode));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.criteriaSserCode == null)? 0 :this.criteriaSserCode.hashCode()));
        result = ((result* 31)+((this.seadetlSsgpCode == null)? 0 :this.seadetlSsgpCode.hashCode()));
        result = ((result* 31)+((this.sserCode == null)? 0 :this.sserCode.hashCode()));
        result = ((result* 31)+((this.criteriaBeginDate == null)? 0 :this.criteriaBeginDate.hashCode()));
        result = ((result* 31)+((this.criteriaSsstCode == null)? 0 :this.criteriaSsstCode.hashCode()));
        result = ((result* 31)+((this.criteriaSsepCode == null)? 0 :this.criteriaSsepCode.hashCode()));
        result = ((result* 31)+((this.seadetlTermCodeEff == null)? 0 :this.seadetlTermCodeEff.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.ssstCode == null)? 0 :this.ssstCode.hashCode()));
        result = ((result* 31)+((this.seprCode == null)? 0 :this.seprCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.sprvCode == null)? 0 :this.sprvCode.hashCode()));
        result = ((result* 31)+((this.criteriaSeprCode == null)? 0 :this.criteriaSeprCode.hashCode()));
        result = ((result* 31)+((this.ssepCode == null)? 0 :this.ssepCode.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.criteriaSsrsCode == null)? 0 :this.criteriaSsrsCode.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.seadetlId == null)? 0 :this.seadetlId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSsgpCode == null)? 0 :this.criteriaSsgpCode.hashCode()));
        result = ((result* 31)+((this.ssrsCode == null)? 0 :this.ssrsCode.hashCode()));
        result = ((result* 31)+((this.criteriaSprvCode == null)? 0 :this.criteriaSprvCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupportServiceDetailServiceAssgnment100PutRequest) == false) {
            return false;
        }
        SupportServiceDetailServiceAssgnment100PutRequest rhs = ((SupportServiceDetailServiceAssgnment100PutRequest) other);
        return (((((((((((((((((((((((((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.criteriaSserCode == rhs.criteriaSserCode)||((this.criteriaSserCode!= null)&&this.criteriaSserCode.equals(rhs.criteriaSserCode))))&&((this.seadetlSsgpCode == rhs.seadetlSsgpCode)||((this.seadetlSsgpCode!= null)&&this.seadetlSsgpCode.equals(rhs.seadetlSsgpCode))))&&((this.sserCode == rhs.sserCode)||((this.sserCode!= null)&&this.sserCode.equals(rhs.sserCode))))&&((this.criteriaBeginDate == rhs.criteriaBeginDate)||((this.criteriaBeginDate!= null)&&this.criteriaBeginDate.equals(rhs.criteriaBeginDate))))&&((this.criteriaSsstCode == rhs.criteriaSsstCode)||((this.criteriaSsstCode!= null)&&this.criteriaSsstCode.equals(rhs.criteriaSsstCode))))&&((this.criteriaSsepCode == rhs.criteriaSsepCode)||((this.criteriaSsepCode!= null)&&this.criteriaSsepCode.equals(rhs.criteriaSsepCode))))&&((this.seadetlTermCodeEff == rhs.seadetlTermCodeEff)||((this.seadetlTermCodeEff!= null)&&this.seadetlTermCodeEff.equals(rhs.seadetlTermCodeEff))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))))&&((this.seprCode == rhs.seprCode)||((this.seprCode!= null)&&this.seprCode.equals(rhs.seprCode))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.sprvCode == rhs.sprvCode)||((this.sprvCode!= null)&&this.sprvCode.equals(rhs.sprvCode))))&&((this.criteriaSeprCode == rhs.criteriaSeprCode)||((this.criteriaSeprCode!= null)&&this.criteriaSeprCode.equals(rhs.criteriaSeprCode))))&&((this.ssepCode == rhs.ssepCode)||((this.ssepCode!= null)&&this.ssepCode.equals(rhs.ssepCode))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.criteriaSsrsCode == rhs.criteriaSsrsCode)||((this.criteriaSsrsCode!= null)&&this.criteriaSsrsCode.equals(rhs.criteriaSsrsCode))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.seadetlId == rhs.seadetlId)||((this.seadetlId!= null)&&this.seadetlId.equals(rhs.seadetlId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSsgpCode == rhs.criteriaSsgpCode)||((this.criteriaSsgpCode!= null)&&this.criteriaSsgpCode.equals(rhs.criteriaSsgpCode))))&&((this.ssrsCode == rhs.ssrsCode)||((this.ssrsCode!= null)&&this.ssrsCode.equals(rhs.ssrsCode))))&&((this.criteriaSprvCode == rhs.criteriaSprvCode)||((this.criteriaSprvCode!= null)&&this.criteriaSprvCode.equals(rhs.criteriaSprvCode))));
    }

}
