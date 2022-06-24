
package com.ellucian.generated.bpapi.ban.applicant_requirements.v1_0_0;

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
    "criteria.sbgiDesc",
    "criteria.displayPckgInd1",
    "sbgiTypeInd",
    "sbgiCode",
    "keyblckAidyCode",
    "criteria.displayTreqDesc",
    "keyblckId",
    "fundCode",
    "displayMemoInd1",
    "criteria.satInd",
    "criteria.displayDisbInd1",
    "criteria.period",
    "statDate",
    "trstCode",
    "period",
    "criteria.fundCode",
    "displayDisbInd1",
    "criteria.sysInd",
    "criteria.infoAccessInd",
    "criteria.rtvtreqPerkMpnFlag",
    "infoAccessInd",
    "displayTrkLtrInd1",
    "criteria.displayMemoInd1",
    "criteria.displayTrkLtrInd1",
    "criteria.sbgiTypeInd",
    "criteria.statDate",
    "criteria.trstCode",
    "displayPckgInd1",
    "criteria.treqCode",
    "criteria.estDate",
    "criteria.sbgiCode"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirements100PutRequest {

    /**
     * SBGI Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sbgiDesc")
    private String criteriaSbgiDesc;
    @JsonProperty("criteria.displayPckgInd1")
    private String criteriaDisplayPckgInd1;
    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("sbgiTypeInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SBGI_TYPE_IND")
    private String sbgiTypeInd;
    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SBGI_CODE")
    private String sbgiCode;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private String keyblckAidyCode;
    @JsonProperty("criteria.displayTreqDesc")
    private String criteriaDisplayTreqDesc;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("keyblckId")
    @JsonPropertyDescription("Lineage reference object : keyblckId")
    private String keyblckId;
    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String fundCode;
    @JsonProperty("displayMemoInd1")
    private String displayMemoInd1;
    /**
     * Satisfied
     * <p>
     * Lineage reference object : RRRAREQ_SAT_IND
     * 
     */
    @JsonProperty("criteria.satInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SAT_IND")
    private String criteriaSatInd;
    @JsonProperty("criteria.displayDisbInd1")
    private String criteriaDisplayDisbInd1;
    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("criteria.period")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds")
    private String criteriaPeriod;
    /**
     * Status   Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("statDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_STAT_DATE")
    private Date statDate;
    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst")
    private String trstCode;
    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds")
    private String period;
    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String criteriaFundCode;
    @JsonProperty("displayDisbInd1")
    private String displayDisbInd1;
    /**
     * System
     * <p>
     * Lineage reference object : RRRAREQ_SYS_IND
     * 
     */
    @JsonProperty("criteria.sysInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SYS_IND")
    private String criteriaSysInd;
    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("criteria.infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_INFO_ACCESS_IND")
    private String criteriaInfoAccessInd;
    @JsonProperty("criteria.rtvtreqPerkMpnFlag")
    private String criteriaRtvtreqPerkMpnFlag;
    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_INFO_ACCESS_IND")
    private String infoAccessInd;
    @JsonProperty("displayTrkLtrInd1")
    private String displayTrkLtrInd1;
    @JsonProperty("criteria.displayMemoInd1")
    private String criteriaDisplayMemoInd1;
    @JsonProperty("criteria.displayTrkLtrInd1")
    private String criteriaDisplayTrkLtrInd1;
    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("criteria.sbgiTypeInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SBGI_TYPE_IND")
    private String criteriaSbgiTypeInd;
    /**
     * Status   Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.statDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_STAT_DATE")
    private Date criteriaStatDate;
    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("criteria.trstCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst")
    private String criteriaTrstCode;
    @JsonProperty("displayPckgInd1")
    private String displayPckgInd1;
    /**
     * Requirement
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.treqCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_TREQ_CODE")
    private String criteriaTreqCode;
    /**
     * Established Date
     * <p>
     * Lineage reference object : RRRAREQ_EST_DATE
     * 
     */
    @JsonProperty("criteria.estDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_EST_DATE")
    private Date criteriaEstDate;
    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SBGI_CODE")
    private String criteriaSbgiCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * SBGI Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sbgiDesc")
    public String getCriteriaSbgiDesc() {
        return criteriaSbgiDesc;
    }

    /**
     * SBGI Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sbgiDesc")
    public void setCriteriaSbgiDesc(String criteriaSbgiDesc) {
        this.criteriaSbgiDesc = criteriaSbgiDesc;
    }

    public ApplicantRequirements100PutRequest withCriteriaSbgiDesc(String criteriaSbgiDesc) {
        this.criteriaSbgiDesc = criteriaSbgiDesc;
        return this;
    }

    @JsonProperty("criteria.displayPckgInd1")
    public String getCriteriaDisplayPckgInd1() {
        return criteriaDisplayPckgInd1;
    }

    @JsonProperty("criteria.displayPckgInd1")
    public void setCriteriaDisplayPckgInd1(String criteriaDisplayPckgInd1) {
        this.criteriaDisplayPckgInd1 = criteriaDisplayPckgInd1;
    }

    public ApplicantRequirements100PutRequest withCriteriaDisplayPckgInd1(String criteriaDisplayPckgInd1) {
        this.criteriaDisplayPckgInd1 = criteriaDisplayPckgInd1;
        return this;
    }

    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("sbgiTypeInd")
    public String getSbgiTypeInd() {
        return sbgiTypeInd;
    }

    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("sbgiTypeInd")
    public void setSbgiTypeInd(String sbgiTypeInd) {
        this.sbgiTypeInd = sbgiTypeInd;
    }

    public ApplicantRequirements100PutRequest withSbgiTypeInd(String sbgiTypeInd) {
        this.sbgiTypeInd = sbgiTypeInd;
        return this;
    }

    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public ApplicantRequirements100PutRequest withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
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

    public ApplicantRequirements100PutRequest withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    @JsonProperty("criteria.displayTreqDesc")
    public String getCriteriaDisplayTreqDesc() {
        return criteriaDisplayTreqDesc;
    }

    @JsonProperty("criteria.displayTreqDesc")
    public void setCriteriaDisplayTreqDesc(String criteriaDisplayTreqDesc) {
        this.criteriaDisplayTreqDesc = criteriaDisplayTreqDesc;
    }

    public ApplicantRequirements100PutRequest withCriteriaDisplayTreqDesc(String criteriaDisplayTreqDesc) {
        this.criteriaDisplayTreqDesc = criteriaDisplayTreqDesc;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("keyblckId")
    public String getKeyblckId() {
        return keyblckId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("keyblckId")
    public void setKeyblckId(String keyblckId) {
        this.keyblckId = keyblckId;
    }

    public ApplicantRequirements100PutRequest withKeyblckId(String keyblckId) {
        this.keyblckId = keyblckId;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public ApplicantRequirements100PutRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    @JsonProperty("displayMemoInd1")
    public String getDisplayMemoInd1() {
        return displayMemoInd1;
    }

    @JsonProperty("displayMemoInd1")
    public void setDisplayMemoInd1(String displayMemoInd1) {
        this.displayMemoInd1 = displayMemoInd1;
    }

    public ApplicantRequirements100PutRequest withDisplayMemoInd1(String displayMemoInd1) {
        this.displayMemoInd1 = displayMemoInd1;
        return this;
    }

    /**
     * Satisfied
     * <p>
     * Lineage reference object : RRRAREQ_SAT_IND
     * 
     */
    @JsonProperty("criteria.satInd")
    public String getCriteriaSatInd() {
        return criteriaSatInd;
    }

    /**
     * Satisfied
     * <p>
     * Lineage reference object : RRRAREQ_SAT_IND
     * 
     */
    @JsonProperty("criteria.satInd")
    public void setCriteriaSatInd(String criteriaSatInd) {
        this.criteriaSatInd = criteriaSatInd;
    }

    public ApplicantRequirements100PutRequest withCriteriaSatInd(String criteriaSatInd) {
        this.criteriaSatInd = criteriaSatInd;
        return this;
    }

    @JsonProperty("criteria.displayDisbInd1")
    public String getCriteriaDisplayDisbInd1() {
        return criteriaDisplayDisbInd1;
    }

    @JsonProperty("criteria.displayDisbInd1")
    public void setCriteriaDisplayDisbInd1(String criteriaDisplayDisbInd1) {
        this.criteriaDisplayDisbInd1 = criteriaDisplayDisbInd1;
    }

    public ApplicantRequirements100PutRequest withCriteriaDisplayDisbInd1(String criteriaDisplayDisbInd1) {
        this.criteriaDisplayDisbInd1 = criteriaDisplayDisbInd1;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("criteria.period")
    public String getCriteriaPeriod() {
        return criteriaPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("criteria.period")
    public void setCriteriaPeriod(String criteriaPeriod) {
        this.criteriaPeriod = criteriaPeriod;
    }

    public ApplicantRequirements100PutRequest withCriteriaPeriod(String criteriaPeriod) {
        this.criteriaPeriod = criteriaPeriod;
        return this;
    }

    /**
     * Status   Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("statDate")
    public Date getStatDate() {
        return statDate;
    }

    /**
     * Status   Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("statDate")
    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public ApplicantRequirements100PutRequest withStatDate(Date statDate) {
        this.statDate = statDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCode")
    public String getTrstCode() {
        return trstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCode")
    public void setTrstCode(String trstCode) {
        this.trstCode = trstCode;
    }

    public ApplicantRequirements100PutRequest withTrstCode(String trstCode) {
        this.trstCode = trstCode;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public ApplicantRequirements100PutRequest withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public ApplicantRequirements100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    @JsonProperty("displayDisbInd1")
    public String getDisplayDisbInd1() {
        return displayDisbInd1;
    }

    @JsonProperty("displayDisbInd1")
    public void setDisplayDisbInd1(String displayDisbInd1) {
        this.displayDisbInd1 = displayDisbInd1;
    }

    public ApplicantRequirements100PutRequest withDisplayDisbInd1(String displayDisbInd1) {
        this.displayDisbInd1 = displayDisbInd1;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RRRAREQ_SYS_IND
     * 
     */
    @JsonProperty("criteria.sysInd")
    public String getCriteriaSysInd() {
        return criteriaSysInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RRRAREQ_SYS_IND
     * 
     */
    @JsonProperty("criteria.sysInd")
    public void setCriteriaSysInd(String criteriaSysInd) {
        this.criteriaSysInd = criteriaSysInd;
    }

    public ApplicantRequirements100PutRequest withCriteriaSysInd(String criteriaSysInd) {
        this.criteriaSysInd = criteriaSysInd;
        return this;
    }

    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("criteria.infoAccessInd")
    public String getCriteriaInfoAccessInd() {
        return criteriaInfoAccessInd;
    }

    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("criteria.infoAccessInd")
    public void setCriteriaInfoAccessInd(String criteriaInfoAccessInd) {
        this.criteriaInfoAccessInd = criteriaInfoAccessInd;
    }

    public ApplicantRequirements100PutRequest withCriteriaInfoAccessInd(String criteriaInfoAccessInd) {
        this.criteriaInfoAccessInd = criteriaInfoAccessInd;
        return this;
    }

    @JsonProperty("criteria.rtvtreqPerkMpnFlag")
    public String getCriteriaRtvtreqPerkMpnFlag() {
        return criteriaRtvtreqPerkMpnFlag;
    }

    @JsonProperty("criteria.rtvtreqPerkMpnFlag")
    public void setCriteriaRtvtreqPerkMpnFlag(String criteriaRtvtreqPerkMpnFlag) {
        this.criteriaRtvtreqPerkMpnFlag = criteriaRtvtreqPerkMpnFlag;
    }

    public ApplicantRequirements100PutRequest withCriteriaRtvtreqPerkMpnFlag(String criteriaRtvtreqPerkMpnFlag) {
        this.criteriaRtvtreqPerkMpnFlag = criteriaRtvtreqPerkMpnFlag;
        return this;
    }

    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public ApplicantRequirements100PutRequest withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    @JsonProperty("displayTrkLtrInd1")
    public String getDisplayTrkLtrInd1() {
        return displayTrkLtrInd1;
    }

    @JsonProperty("displayTrkLtrInd1")
    public void setDisplayTrkLtrInd1(String displayTrkLtrInd1) {
        this.displayTrkLtrInd1 = displayTrkLtrInd1;
    }

    public ApplicantRequirements100PutRequest withDisplayTrkLtrInd1(String displayTrkLtrInd1) {
        this.displayTrkLtrInd1 = displayTrkLtrInd1;
        return this;
    }

    @JsonProperty("criteria.displayMemoInd1")
    public String getCriteriaDisplayMemoInd1() {
        return criteriaDisplayMemoInd1;
    }

    @JsonProperty("criteria.displayMemoInd1")
    public void setCriteriaDisplayMemoInd1(String criteriaDisplayMemoInd1) {
        this.criteriaDisplayMemoInd1 = criteriaDisplayMemoInd1;
    }

    public ApplicantRequirements100PutRequest withCriteriaDisplayMemoInd1(String criteriaDisplayMemoInd1) {
        this.criteriaDisplayMemoInd1 = criteriaDisplayMemoInd1;
        return this;
    }

    @JsonProperty("criteria.displayTrkLtrInd1")
    public String getCriteriaDisplayTrkLtrInd1() {
        return criteriaDisplayTrkLtrInd1;
    }

    @JsonProperty("criteria.displayTrkLtrInd1")
    public void setCriteriaDisplayTrkLtrInd1(String criteriaDisplayTrkLtrInd1) {
        this.criteriaDisplayTrkLtrInd1 = criteriaDisplayTrkLtrInd1;
    }

    public ApplicantRequirements100PutRequest withCriteriaDisplayTrkLtrInd1(String criteriaDisplayTrkLtrInd1) {
        this.criteriaDisplayTrkLtrInd1 = criteriaDisplayTrkLtrInd1;
        return this;
    }

    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("criteria.sbgiTypeInd")
    public String getCriteriaSbgiTypeInd() {
        return criteriaSbgiTypeInd;
    }

    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("criteria.sbgiTypeInd")
    public void setCriteriaSbgiTypeInd(String criteriaSbgiTypeInd) {
        this.criteriaSbgiTypeInd = criteriaSbgiTypeInd;
    }

    public ApplicantRequirements100PutRequest withCriteriaSbgiTypeInd(String criteriaSbgiTypeInd) {
        this.criteriaSbgiTypeInd = criteriaSbgiTypeInd;
        return this;
    }

    /**
     * Status   Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.statDate")
    public Date getCriteriaStatDate() {
        return criteriaStatDate;
    }

    /**
     * Status   Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.statDate")
    public void setCriteriaStatDate(Date criteriaStatDate) {
        this.criteriaStatDate = criteriaStatDate;
    }

    public ApplicantRequirements100PutRequest withCriteriaStatDate(Date criteriaStatDate) {
        this.criteriaStatDate = criteriaStatDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("criteria.trstCode")
    public String getCriteriaTrstCode() {
        return criteriaTrstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("criteria.trstCode")
    public void setCriteriaTrstCode(String criteriaTrstCode) {
        this.criteriaTrstCode = criteriaTrstCode;
    }

    public ApplicantRequirements100PutRequest withCriteriaTrstCode(String criteriaTrstCode) {
        this.criteriaTrstCode = criteriaTrstCode;
        return this;
    }

    @JsonProperty("displayPckgInd1")
    public String getDisplayPckgInd1() {
        return displayPckgInd1;
    }

    @JsonProperty("displayPckgInd1")
    public void setDisplayPckgInd1(String displayPckgInd1) {
        this.displayPckgInd1 = displayPckgInd1;
    }

    public ApplicantRequirements100PutRequest withDisplayPckgInd1(String displayPckgInd1) {
        this.displayPckgInd1 = displayPckgInd1;
        return this;
    }

    /**
     * Requirement
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.treqCode")
    public String getCriteriaTreqCode() {
        return criteriaTreqCode;
    }

    /**
     * Requirement
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.treqCode")
    public void setCriteriaTreqCode(String criteriaTreqCode) {
        this.criteriaTreqCode = criteriaTreqCode;
    }

    public ApplicantRequirements100PutRequest withCriteriaTreqCode(String criteriaTreqCode) {
        this.criteriaTreqCode = criteriaTreqCode;
        return this;
    }

    /**
     * Established Date
     * <p>
     * Lineage reference object : RRRAREQ_EST_DATE
     * 
     */
    @JsonProperty("criteria.estDate")
    public Date getCriteriaEstDate() {
        return criteriaEstDate;
    }

    /**
     * Established Date
     * <p>
     * Lineage reference object : RRRAREQ_EST_DATE
     * 
     */
    @JsonProperty("criteria.estDate")
    public void setCriteriaEstDate(Date criteriaEstDate) {
        this.criteriaEstDate = criteriaEstDate;
    }

    public ApplicantRequirements100PutRequest withCriteriaEstDate(Date criteriaEstDate) {
        this.criteriaEstDate = criteriaEstDate;
        return this;
    }

    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public String getCriteriaSbgiCode() {
        return criteriaSbgiCode;
    }

    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public void setCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
    }

    public ApplicantRequirements100PutRequest withCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
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

    public ApplicantRequirements100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirements100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSbgiDesc");
        sb.append('=');
        sb.append(((this.criteriaSbgiDesc == null)?"<null>":this.criteriaSbgiDesc));
        sb.append(',');
        sb.append("criteriaDisplayPckgInd1");
        sb.append('=');
        sb.append(((this.criteriaDisplayPckgInd1 == null)?"<null>":this.criteriaDisplayPckgInd1));
        sb.append(',');
        sb.append("sbgiTypeInd");
        sb.append('=');
        sb.append(((this.sbgiTypeInd == null)?"<null>":this.sbgiTypeInd));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("criteriaDisplayTreqDesc");
        sb.append('=');
        sb.append(((this.criteriaDisplayTreqDesc == null)?"<null>":this.criteriaDisplayTreqDesc));
        sb.append(',');
        sb.append("keyblckId");
        sb.append('=');
        sb.append(((this.keyblckId == null)?"<null>":this.keyblckId));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("displayMemoInd1");
        sb.append('=');
        sb.append(((this.displayMemoInd1 == null)?"<null>":this.displayMemoInd1));
        sb.append(',');
        sb.append("criteriaSatInd");
        sb.append('=');
        sb.append(((this.criteriaSatInd == null)?"<null>":this.criteriaSatInd));
        sb.append(',');
        sb.append("criteriaDisplayDisbInd1");
        sb.append('=');
        sb.append(((this.criteriaDisplayDisbInd1 == null)?"<null>":this.criteriaDisplayDisbInd1));
        sb.append(',');
        sb.append("criteriaPeriod");
        sb.append('=');
        sb.append(((this.criteriaPeriod == null)?"<null>":this.criteriaPeriod));
        sb.append(',');
        sb.append("statDate");
        sb.append('=');
        sb.append(((this.statDate == null)?"<null>":this.statDate));
        sb.append(',');
        sb.append("trstCode");
        sb.append('=');
        sb.append(((this.trstCode == null)?"<null>":this.trstCode));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("displayDisbInd1");
        sb.append('=');
        sb.append(((this.displayDisbInd1 == null)?"<null>":this.displayDisbInd1));
        sb.append(',');
        sb.append("criteriaSysInd");
        sb.append('=');
        sb.append(((this.criteriaSysInd == null)?"<null>":this.criteriaSysInd));
        sb.append(',');
        sb.append("criteriaInfoAccessInd");
        sb.append('=');
        sb.append(((this.criteriaInfoAccessInd == null)?"<null>":this.criteriaInfoAccessInd));
        sb.append(',');
        sb.append("criteriaRtvtreqPerkMpnFlag");
        sb.append('=');
        sb.append(((this.criteriaRtvtreqPerkMpnFlag == null)?"<null>":this.criteriaRtvtreqPerkMpnFlag));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("displayTrkLtrInd1");
        sb.append('=');
        sb.append(((this.displayTrkLtrInd1 == null)?"<null>":this.displayTrkLtrInd1));
        sb.append(',');
        sb.append("criteriaDisplayMemoInd1");
        sb.append('=');
        sb.append(((this.criteriaDisplayMemoInd1 == null)?"<null>":this.criteriaDisplayMemoInd1));
        sb.append(',');
        sb.append("criteriaDisplayTrkLtrInd1");
        sb.append('=');
        sb.append(((this.criteriaDisplayTrkLtrInd1 == null)?"<null>":this.criteriaDisplayTrkLtrInd1));
        sb.append(',');
        sb.append("criteriaSbgiTypeInd");
        sb.append('=');
        sb.append(((this.criteriaSbgiTypeInd == null)?"<null>":this.criteriaSbgiTypeInd));
        sb.append(',');
        sb.append("criteriaStatDate");
        sb.append('=');
        sb.append(((this.criteriaStatDate == null)?"<null>":this.criteriaStatDate));
        sb.append(',');
        sb.append("criteriaTrstCode");
        sb.append('=');
        sb.append(((this.criteriaTrstCode == null)?"<null>":this.criteriaTrstCode));
        sb.append(',');
        sb.append("displayPckgInd1");
        sb.append('=');
        sb.append(((this.displayPckgInd1 == null)?"<null>":this.displayPckgInd1));
        sb.append(',');
        sb.append("criteriaTreqCode");
        sb.append('=');
        sb.append(((this.criteriaTreqCode == null)?"<null>":this.criteriaTreqCode));
        sb.append(',');
        sb.append("criteriaEstDate");
        sb.append('=');
        sb.append(((this.criteriaEstDate == null)?"<null>":this.criteriaEstDate));
        sb.append(',');
        sb.append("criteriaSbgiCode");
        sb.append('=');
        sb.append(((this.criteriaSbgiCode == null)?"<null>":this.criteriaSbgiCode));
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
        result = ((result* 31)+((this.criteriaFundCode == null)? 0 :this.criteriaFundCode.hashCode()));
        result = ((result* 31)+((this.criteriaSbgiCode == null)? 0 :this.criteriaSbgiCode.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayDisbInd1 == null)? 0 :this.criteriaDisplayDisbInd1 .hashCode()));
        result = ((result* 31)+((this.sbgiTypeInd == null)? 0 :this.sbgiTypeInd.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.criteriaSatInd == null)? 0 :this.criteriaSatInd.hashCode()));
        result = ((result* 31)+((this.criteriaEstDate == null)? 0 :this.criteriaEstDate.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayPckgInd1 == null)? 0 :this.criteriaDisplayPckgInd1 .hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayTrkLtrInd1 == null)? 0 :this.criteriaDisplayTrkLtrInd1 .hashCode()));
        result = ((result* 31)+((this.keyblckId == null)? 0 :this.keyblckId.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.displayMemoInd1 == null)? 0 :this.displayMemoInd1 .hashCode()));
        result = ((result* 31)+((this.criteriaDisplayTreqDesc == null)? 0 :this.criteriaDisplayTreqDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSbgiDesc == null)? 0 :this.criteriaSbgiDesc.hashCode()));
        result = ((result* 31)+((this.statDate == null)? 0 :this.statDate.hashCode()));
        result = ((result* 31)+((this.trstCode == null)? 0 :this.trstCode.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.displayDisbInd1 == null)? 0 :this.displayDisbInd1 .hashCode()));
        result = ((result* 31)+((this.criteriaRtvtreqPerkMpnFlag == null)? 0 :this.criteriaRtvtreqPerkMpnFlag.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.displayTrkLtrInd1 == null)? 0 :this.displayTrkLtrInd1 .hashCode()));
        result = ((result* 31)+((this.criteriaStatDate == null)? 0 :this.criteriaStatDate.hashCode()));
        result = ((result* 31)+((this.criteriaPeriod == null)? 0 :this.criteriaPeriod.hashCode()));
        result = ((result* 31)+((this.criteriaInfoAccessInd == null)? 0 :this.criteriaInfoAccessInd.hashCode()));
        result = ((result* 31)+((this.criteriaSbgiTypeInd == null)? 0 :this.criteriaSbgiTypeInd.hashCode()));
        result = ((result* 31)+((this.criteriaTrstCode == null)? 0 :this.criteriaTrstCode.hashCode()));
        result = ((result* 31)+((this.criteriaSysInd == null)? 0 :this.criteriaSysInd.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayMemoInd1 == null)? 0 :this.criteriaDisplayMemoInd1 .hashCode()));
        result = ((result* 31)+((this.displayPckgInd1 == null)? 0 :this.displayPckgInd1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaTreqCode == null)? 0 :this.criteriaTreqCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirements100PutRequest) == false) {
            return false;
        }
        ApplicantRequirements100PutRequest rhs = ((ApplicantRequirements100PutRequest) other);
        return (((((((((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaSbgiCode == rhs.criteriaSbgiCode)||((this.criteriaSbgiCode!= null)&&this.criteriaSbgiCode.equals(rhs.criteriaSbgiCode))))&&((this.criteriaDisplayDisbInd1 == rhs.criteriaDisplayDisbInd1)||((this.criteriaDisplayDisbInd1 != null)&&this.criteriaDisplayDisbInd1 .equals(rhs.criteriaDisplayDisbInd1))))&&((this.sbgiTypeInd == rhs.sbgiTypeInd)||((this.sbgiTypeInd!= null)&&this.sbgiTypeInd.equals(rhs.sbgiTypeInd))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.criteriaSatInd == rhs.criteriaSatInd)||((this.criteriaSatInd!= null)&&this.criteriaSatInd.equals(rhs.criteriaSatInd))))&&((this.criteriaEstDate == rhs.criteriaEstDate)||((this.criteriaEstDate!= null)&&this.criteriaEstDate.equals(rhs.criteriaEstDate))))&&((this.criteriaDisplayPckgInd1 == rhs.criteriaDisplayPckgInd1)||((this.criteriaDisplayPckgInd1 != null)&&this.criteriaDisplayPckgInd1 .equals(rhs.criteriaDisplayPckgInd1))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.criteriaDisplayTrkLtrInd1 == rhs.criteriaDisplayTrkLtrInd1)||((this.criteriaDisplayTrkLtrInd1 != null)&&this.criteriaDisplayTrkLtrInd1 .equals(rhs.criteriaDisplayTrkLtrInd1))))&&((this.keyblckId == rhs.keyblckId)||((this.keyblckId!= null)&&this.keyblckId.equals(rhs.keyblckId))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.displayMemoInd1 == rhs.displayMemoInd1)||((this.displayMemoInd1 != null)&&this.displayMemoInd1 .equals(rhs.displayMemoInd1))))&&((this.criteriaDisplayTreqDesc == rhs.criteriaDisplayTreqDesc)||((this.criteriaDisplayTreqDesc!= null)&&this.criteriaDisplayTreqDesc.equals(rhs.criteriaDisplayTreqDesc))))&&((this.criteriaSbgiDesc == rhs.criteriaSbgiDesc)||((this.criteriaSbgiDesc!= null)&&this.criteriaSbgiDesc.equals(rhs.criteriaSbgiDesc))))&&((this.statDate == rhs.statDate)||((this.statDate!= null)&&this.statDate.equals(rhs.statDate))))&&((this.trstCode == rhs.trstCode)||((this.trstCode!= null)&&this.trstCode.equals(rhs.trstCode))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.displayDisbInd1 == rhs.displayDisbInd1)||((this.displayDisbInd1 != null)&&this.displayDisbInd1 .equals(rhs.displayDisbInd1))))&&((this.criteriaRtvtreqPerkMpnFlag == rhs.criteriaRtvtreqPerkMpnFlag)||((this.criteriaRtvtreqPerkMpnFlag!= null)&&this.criteriaRtvtreqPerkMpnFlag.equals(rhs.criteriaRtvtreqPerkMpnFlag))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.displayTrkLtrInd1 == rhs.displayTrkLtrInd1)||((this.displayTrkLtrInd1 != null)&&this.displayTrkLtrInd1 .equals(rhs.displayTrkLtrInd1))))&&((this.criteriaStatDate == rhs.criteriaStatDate)||((this.criteriaStatDate!= null)&&this.criteriaStatDate.equals(rhs.criteriaStatDate))))&&((this.criteriaPeriod == rhs.criteriaPeriod)||((this.criteriaPeriod!= null)&&this.criteriaPeriod.equals(rhs.criteriaPeriod))))&&((this.criteriaInfoAccessInd == rhs.criteriaInfoAccessInd)||((this.criteriaInfoAccessInd!= null)&&this.criteriaInfoAccessInd.equals(rhs.criteriaInfoAccessInd))))&&((this.criteriaSbgiTypeInd == rhs.criteriaSbgiTypeInd)||((this.criteriaSbgiTypeInd!= null)&&this.criteriaSbgiTypeInd.equals(rhs.criteriaSbgiTypeInd))))&&((this.criteriaTrstCode == rhs.criteriaTrstCode)||((this.criteriaTrstCode!= null)&&this.criteriaTrstCode.equals(rhs.criteriaTrstCode))))&&((this.criteriaSysInd == rhs.criteriaSysInd)||((this.criteriaSysInd!= null)&&this.criteriaSysInd.equals(rhs.criteriaSysInd))))&&((this.criteriaDisplayMemoInd1 == rhs.criteriaDisplayMemoInd1)||((this.criteriaDisplayMemoInd1 != null)&&this.criteriaDisplayMemoInd1 .equals(rhs.criteriaDisplayMemoInd1))))&&((this.displayPckgInd1 == rhs.displayPckgInd1)||((this.displayPckgInd1 != null)&&this.displayPckgInd1 .equals(rhs.displayPckgInd1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaTreqCode == rhs.criteriaTreqCode)||((this.criteriaTreqCode!= null)&&this.criteriaTreqCode.equals(rhs.criteriaTreqCode))));
    }

}
