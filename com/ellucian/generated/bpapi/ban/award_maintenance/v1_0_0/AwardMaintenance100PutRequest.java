
package com.ellucian.generated.bpapi.ban.award_maintenance.v1_0_0;

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
    "fedLimitOvrdeInd",
    "displayMemautAmt",
    "treqOvrdeInd",
    "sysInd",
    "criteria.displayDeccanAmt",
    "criteria.displayMemautAmt",
    "criteria.unmetNeedOvrdeInd",
    "criteria.fedLimitOvrdeInd",
    "unmetNeedOvrdeInd",
    "criteria.replaceTfcOvrdeInd",
    "keyblckAidyCode",
    "criteria.paidAmt",
    "replaceTfcOvrdeInd",
    "displayRescheduleInd",
    "fundCode",
    "criteria.treqOvrdeInd",
    "criteria.fundLimitOvrdeInd",
    "criteria.overrideFundRule",
    "id",
    "lockInd",
    "criteria.fundCode",
    "acceptAmt",
    "criteria.awstCode",
    "criteria.sysInd",
    "criteria.infoAccessInd",
    "infoAccessInd",
    "paidAmt",
    "fundDescription",
    "criteria.lockInd",
    "overrideFundRule",
    "awstCode",
    "criteria.offerAmt",
    "criteria.acceptAmt",
    "fundLimitOvrdeInd",
    "criteria.displayRescheduleInd",
    "offerAmt",
    "displayDeccanAmt",
    "criteria.fundDescription"
})
@Generated("jsonschema2pojo")
public class AwardMaintenance100PutRequest {

    /**
     * Federal Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fedLimitOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND")
    private String fedLimitOvrdeInd;
    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    private Double displayMemautAmt;
    /**
     * Tracking Requirement Override
     * <p>
     * Lineage reference object : RPRAWRD_TREQ_OVRDE_IND
     * 
     */
    @JsonProperty("treqOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_TREQ_OVRDE_IND")
    private String treqOvrdeInd;
    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_SYS_IND")
    private String sysInd;
    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayDeccanAmt")
    private Double criteriaDisplayDeccanAmt;
    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayMemautAmt")
    private Double criteriaDisplayMemautAmt;
    /**
     * Unmet Need Override
     * <p>
     * Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.unmetNeedOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND")
    private String criteriaUnmetNeedOvrdeInd;
    /**
     * Federal Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.fedLimitOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND")
    private String criteriaFedLimitOvrdeInd;
    /**
     * Unmet Need Override
     * <p>
     * Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND
     * 
     */
    @JsonProperty("unmetNeedOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND")
    private String unmetNeedOvrdeInd;
    /**
     * Replace EFC Override
     * <p>
     * Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.replaceTfcOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND")
    private String criteriaReplaceTfcOvrdeInd;
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
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("criteria.paidAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_PAID_AMT")
    private Double criteriaPaidAmt;
    /**
     * Replace EFC Override
     * <p>
     * Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND
     * 
     */
    @JsonProperty("replaceTfcOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND")
    private String replaceTfcOvrdeInd;
    @JsonProperty("displayRescheduleInd")
    private String displayRescheduleInd;
    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String fundCode;
    /**
     * Tracking Requirement Override
     * <p>
     * Lineage reference object : RPRAWRD_TREQ_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.treqOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_TREQ_OVRDE_IND")
    private String criteriaTreqOvrdeInd;
    /**
     * Fund Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.fundLimitOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND")
    private String criteriaFundLimitOvrdeInd;
    /**
     * Fund Award Rule Override
     * <p>
     * Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE
     * 
     */
    @JsonProperty("criteria.overrideFundRule")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE")
    private String criteriaOverrideFundRule;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_LOCK_IND")
    private String lockInd;
    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String criteriaFundCode;
    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_ACCEPT_AMT")
    private Double acceptAmt;
    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("criteria.awstCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst")
    private String criteriaAwstCode;
    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("criteria.sysInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_SYS_IND")
    private String criteriaSysInd;
    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("criteria.infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_INFO_ACCESS_IND")
    private String criteriaInfoAccessInd;
    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_PAID_AMT")
    private Double paidAmt;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    private String fundDescription;
    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.lockInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_LOCK_IND")
    private String criteriaLockInd;
    /**
     * Fund Award Rule Override
     * <p>
     * Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE
     * 
     */
    @JsonProperty("overrideFundRule")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE")
    private String overrideFundRule;
    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("awstCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst")
    private String awstCode;
    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("criteria.offerAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_OFFER_AMT")
    private Double criteriaOfferAmt;
    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("criteria.acceptAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_ACCEPT_AMT")
    private Double criteriaAcceptAmt;
    /**
     * Fund Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fundLimitOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND")
    private String fundLimitOvrdeInd;
    @JsonProperty("criteria.displayRescheduleInd")
    private String criteriaDisplayRescheduleInd;
    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_OFFER_AMT")
    private Double offerAmt;
    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    private Double displayDeccanAmt;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.fundDescription")
    private String criteriaFundDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Federal Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fedLimitOvrdeInd")
    public String getFedLimitOvrdeInd() {
        return fedLimitOvrdeInd;
    }

    /**
     * Federal Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fedLimitOvrdeInd")
    public void setFedLimitOvrdeInd(String fedLimitOvrdeInd) {
        this.fedLimitOvrdeInd = fedLimitOvrdeInd;
    }

    public AwardMaintenance100PutRequest withFedLimitOvrdeInd(String fedLimitOvrdeInd) {
        this.fedLimitOvrdeInd = fedLimitOvrdeInd;
        return this;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    public Double getDisplayMemautAmt() {
        return displayMemautAmt;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    public void setDisplayMemautAmt(Double displayMemautAmt) {
        this.displayMemautAmt = displayMemautAmt;
    }

    public AwardMaintenance100PutRequest withDisplayMemautAmt(Double displayMemautAmt) {
        this.displayMemautAmt = displayMemautAmt;
        return this;
    }

    /**
     * Tracking Requirement Override
     * <p>
     * Lineage reference object : RPRAWRD_TREQ_OVRDE_IND
     * 
     */
    @JsonProperty("treqOvrdeInd")
    public String getTreqOvrdeInd() {
        return treqOvrdeInd;
    }

    /**
     * Tracking Requirement Override
     * <p>
     * Lineage reference object : RPRAWRD_TREQ_OVRDE_IND
     * 
     */
    @JsonProperty("treqOvrdeInd")
    public void setTreqOvrdeInd(String treqOvrdeInd) {
        this.treqOvrdeInd = treqOvrdeInd;
    }

    public AwardMaintenance100PutRequest withTreqOvrdeInd(String treqOvrdeInd) {
        this.treqOvrdeInd = treqOvrdeInd;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    public String getSysInd() {
        return sysInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    public void setSysInd(String sysInd) {
        this.sysInd = sysInd;
    }

    public AwardMaintenance100PutRequest withSysInd(String sysInd) {
        this.sysInd = sysInd;
        return this;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayDeccanAmt")
    public Double getCriteriaDisplayDeccanAmt() {
        return criteriaDisplayDeccanAmt;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayDeccanAmt")
    public void setCriteriaDisplayDeccanAmt(Double criteriaDisplayDeccanAmt) {
        this.criteriaDisplayDeccanAmt = criteriaDisplayDeccanAmt;
    }

    public AwardMaintenance100PutRequest withCriteriaDisplayDeccanAmt(Double criteriaDisplayDeccanAmt) {
        this.criteriaDisplayDeccanAmt = criteriaDisplayDeccanAmt;
        return this;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayMemautAmt")
    public Double getCriteriaDisplayMemautAmt() {
        return criteriaDisplayMemautAmt;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.displayMemautAmt")
    public void setCriteriaDisplayMemautAmt(Double criteriaDisplayMemautAmt) {
        this.criteriaDisplayMemautAmt = criteriaDisplayMemautAmt;
    }

    public AwardMaintenance100PutRequest withCriteriaDisplayMemautAmt(Double criteriaDisplayMemautAmt) {
        this.criteriaDisplayMemautAmt = criteriaDisplayMemautAmt;
        return this;
    }

    /**
     * Unmet Need Override
     * <p>
     * Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.unmetNeedOvrdeInd")
    public String getCriteriaUnmetNeedOvrdeInd() {
        return criteriaUnmetNeedOvrdeInd;
    }

    /**
     * Unmet Need Override
     * <p>
     * Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.unmetNeedOvrdeInd")
    public void setCriteriaUnmetNeedOvrdeInd(String criteriaUnmetNeedOvrdeInd) {
        this.criteriaUnmetNeedOvrdeInd = criteriaUnmetNeedOvrdeInd;
    }

    public AwardMaintenance100PutRequest withCriteriaUnmetNeedOvrdeInd(String criteriaUnmetNeedOvrdeInd) {
        this.criteriaUnmetNeedOvrdeInd = criteriaUnmetNeedOvrdeInd;
        return this;
    }

    /**
     * Federal Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.fedLimitOvrdeInd")
    public String getCriteriaFedLimitOvrdeInd() {
        return criteriaFedLimitOvrdeInd;
    }

    /**
     * Federal Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.fedLimitOvrdeInd")
    public void setCriteriaFedLimitOvrdeInd(String criteriaFedLimitOvrdeInd) {
        this.criteriaFedLimitOvrdeInd = criteriaFedLimitOvrdeInd;
    }

    public AwardMaintenance100PutRequest withCriteriaFedLimitOvrdeInd(String criteriaFedLimitOvrdeInd) {
        this.criteriaFedLimitOvrdeInd = criteriaFedLimitOvrdeInd;
        return this;
    }

    /**
     * Unmet Need Override
     * <p>
     * Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND
     * 
     */
    @JsonProperty("unmetNeedOvrdeInd")
    public String getUnmetNeedOvrdeInd() {
        return unmetNeedOvrdeInd;
    }

    /**
     * Unmet Need Override
     * <p>
     * Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND
     * 
     */
    @JsonProperty("unmetNeedOvrdeInd")
    public void setUnmetNeedOvrdeInd(String unmetNeedOvrdeInd) {
        this.unmetNeedOvrdeInd = unmetNeedOvrdeInd;
    }

    public AwardMaintenance100PutRequest withUnmetNeedOvrdeInd(String unmetNeedOvrdeInd) {
        this.unmetNeedOvrdeInd = unmetNeedOvrdeInd;
        return this;
    }

    /**
     * Replace EFC Override
     * <p>
     * Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.replaceTfcOvrdeInd")
    public String getCriteriaReplaceTfcOvrdeInd() {
        return criteriaReplaceTfcOvrdeInd;
    }

    /**
     * Replace EFC Override
     * <p>
     * Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.replaceTfcOvrdeInd")
    public void setCriteriaReplaceTfcOvrdeInd(String criteriaReplaceTfcOvrdeInd) {
        this.criteriaReplaceTfcOvrdeInd = criteriaReplaceTfcOvrdeInd;
    }

    public AwardMaintenance100PutRequest withCriteriaReplaceTfcOvrdeInd(String criteriaReplaceTfcOvrdeInd) {
        this.criteriaReplaceTfcOvrdeInd = criteriaReplaceTfcOvrdeInd;
        return this;
    }

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

    public AwardMaintenance100PutRequest withKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("criteria.paidAmt")
    public Double getCriteriaPaidAmt() {
        return criteriaPaidAmt;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("criteria.paidAmt")
    public void setCriteriaPaidAmt(Double criteriaPaidAmt) {
        this.criteriaPaidAmt = criteriaPaidAmt;
    }

    public AwardMaintenance100PutRequest withCriteriaPaidAmt(Double criteriaPaidAmt) {
        this.criteriaPaidAmt = criteriaPaidAmt;
        return this;
    }

    /**
     * Replace EFC Override
     * <p>
     * Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND
     * 
     */
    @JsonProperty("replaceTfcOvrdeInd")
    public String getReplaceTfcOvrdeInd() {
        return replaceTfcOvrdeInd;
    }

    /**
     * Replace EFC Override
     * <p>
     * Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND
     * 
     */
    @JsonProperty("replaceTfcOvrdeInd")
    public void setReplaceTfcOvrdeInd(String replaceTfcOvrdeInd) {
        this.replaceTfcOvrdeInd = replaceTfcOvrdeInd;
    }

    public AwardMaintenance100PutRequest withReplaceTfcOvrdeInd(String replaceTfcOvrdeInd) {
        this.replaceTfcOvrdeInd = replaceTfcOvrdeInd;
        return this;
    }

    @JsonProperty("displayRescheduleInd")
    public String getDisplayRescheduleInd() {
        return displayRescheduleInd;
    }

    @JsonProperty("displayRescheduleInd")
    public void setDisplayRescheduleInd(String displayRescheduleInd) {
        this.displayRescheduleInd = displayRescheduleInd;
    }

    public AwardMaintenance100PutRequest withDisplayRescheduleInd(String displayRescheduleInd) {
        this.displayRescheduleInd = displayRescheduleInd;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public AwardMaintenance100PutRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Tracking Requirement Override
     * <p>
     * Lineage reference object : RPRAWRD_TREQ_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.treqOvrdeInd")
    public String getCriteriaTreqOvrdeInd() {
        return criteriaTreqOvrdeInd;
    }

    /**
     * Tracking Requirement Override
     * <p>
     * Lineage reference object : RPRAWRD_TREQ_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.treqOvrdeInd")
    public void setCriteriaTreqOvrdeInd(String criteriaTreqOvrdeInd) {
        this.criteriaTreqOvrdeInd = criteriaTreqOvrdeInd;
    }

    public AwardMaintenance100PutRequest withCriteriaTreqOvrdeInd(String criteriaTreqOvrdeInd) {
        this.criteriaTreqOvrdeInd = criteriaTreqOvrdeInd;
        return this;
    }

    /**
     * Fund Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.fundLimitOvrdeInd")
    public String getCriteriaFundLimitOvrdeInd() {
        return criteriaFundLimitOvrdeInd;
    }

    /**
     * Fund Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("criteria.fundLimitOvrdeInd")
    public void setCriteriaFundLimitOvrdeInd(String criteriaFundLimitOvrdeInd) {
        this.criteriaFundLimitOvrdeInd = criteriaFundLimitOvrdeInd;
    }

    public AwardMaintenance100PutRequest withCriteriaFundLimitOvrdeInd(String criteriaFundLimitOvrdeInd) {
        this.criteriaFundLimitOvrdeInd = criteriaFundLimitOvrdeInd;
        return this;
    }

    /**
     * Fund Award Rule Override
     * <p>
     * Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE
     * 
     */
    @JsonProperty("criteria.overrideFundRule")
    public String getCriteriaOverrideFundRule() {
        return criteriaOverrideFundRule;
    }

    /**
     * Fund Award Rule Override
     * <p>
     * Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE
     * 
     */
    @JsonProperty("criteria.overrideFundRule")
    public void setCriteriaOverrideFundRule(String criteriaOverrideFundRule) {
        this.criteriaOverrideFundRule = criteriaOverrideFundRule;
    }

    public AwardMaintenance100PutRequest withCriteriaOverrideFundRule(String criteriaOverrideFundRule) {
        this.criteriaOverrideFundRule = criteriaOverrideFundRule;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public AwardMaintenance100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public AwardMaintenance100PutRequest withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public AwardMaintenance100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public Double getAcceptAmt() {
        return acceptAmt;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public void setAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
    }

    public AwardMaintenance100PutRequest withAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("criteria.awstCode")
    public String getCriteriaAwstCode() {
        return criteriaAwstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("criteria.awstCode")
    public void setCriteriaAwstCode(String criteriaAwstCode) {
        this.criteriaAwstCode = criteriaAwstCode;
    }

    public AwardMaintenance100PutRequest withCriteriaAwstCode(String criteriaAwstCode) {
        this.criteriaAwstCode = criteriaAwstCode;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("criteria.sysInd")
    public String getCriteriaSysInd() {
        return criteriaSysInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("criteria.sysInd")
    public void setCriteriaSysInd(String criteriaSysInd) {
        this.criteriaSysInd = criteriaSysInd;
    }

    public AwardMaintenance100PutRequest withCriteriaSysInd(String criteriaSysInd) {
        this.criteriaSysInd = criteriaSysInd;
        return this;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("criteria.infoAccessInd")
    public String getCriteriaInfoAccessInd() {
        return criteriaInfoAccessInd;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("criteria.infoAccessInd")
    public void setCriteriaInfoAccessInd(String criteriaInfoAccessInd) {
        this.criteriaInfoAccessInd = criteriaInfoAccessInd;
    }

    public AwardMaintenance100PutRequest withCriteriaInfoAccessInd(String criteriaInfoAccessInd) {
        this.criteriaInfoAccessInd = criteriaInfoAccessInd;
        return this;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public AwardMaintenance100PutRequest withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public Double getPaidAmt() {
        return paidAmt;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public void setPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
    }

    public AwardMaintenance100PutRequest withPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public String getFundDescription() {
        return fundDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public void setFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
    }

    public AwardMaintenance100PutRequest withFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
        return this;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.lockInd")
    public String getCriteriaLockInd() {
        return criteriaLockInd;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.lockInd")
    public void setCriteriaLockInd(String criteriaLockInd) {
        this.criteriaLockInd = criteriaLockInd;
    }

    public AwardMaintenance100PutRequest withCriteriaLockInd(String criteriaLockInd) {
        this.criteriaLockInd = criteriaLockInd;
        return this;
    }

    /**
     * Fund Award Rule Override
     * <p>
     * Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE
     * 
     */
    @JsonProperty("overrideFundRule")
    public String getOverrideFundRule() {
        return overrideFundRule;
    }

    /**
     * Fund Award Rule Override
     * <p>
     * Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE
     * 
     */
    @JsonProperty("overrideFundRule")
    public void setOverrideFundRule(String overrideFundRule) {
        this.overrideFundRule = overrideFundRule;
    }

    public AwardMaintenance100PutRequest withOverrideFundRule(String overrideFundRule) {
        this.overrideFundRule = overrideFundRule;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("awstCode")
    public String getAwstCode() {
        return awstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("awstCode")
    public void setAwstCode(String awstCode) {
        this.awstCode = awstCode;
    }

    public AwardMaintenance100PutRequest withAwstCode(String awstCode) {
        this.awstCode = awstCode;
        return this;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("criteria.offerAmt")
    public Double getCriteriaOfferAmt() {
        return criteriaOfferAmt;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("criteria.offerAmt")
    public void setCriteriaOfferAmt(Double criteriaOfferAmt) {
        this.criteriaOfferAmt = criteriaOfferAmt;
    }

    public AwardMaintenance100PutRequest withCriteriaOfferAmt(Double criteriaOfferAmt) {
        this.criteriaOfferAmt = criteriaOfferAmt;
        return this;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("criteria.acceptAmt")
    public Double getCriteriaAcceptAmt() {
        return criteriaAcceptAmt;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("criteria.acceptAmt")
    public void setCriteriaAcceptAmt(Double criteriaAcceptAmt) {
        this.criteriaAcceptAmt = criteriaAcceptAmt;
    }

    public AwardMaintenance100PutRequest withCriteriaAcceptAmt(Double criteriaAcceptAmt) {
        this.criteriaAcceptAmt = criteriaAcceptAmt;
        return this;
    }

    /**
     * Fund Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fundLimitOvrdeInd")
    public String getFundLimitOvrdeInd() {
        return fundLimitOvrdeInd;
    }

    /**
     * Fund Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fundLimitOvrdeInd")
    public void setFundLimitOvrdeInd(String fundLimitOvrdeInd) {
        this.fundLimitOvrdeInd = fundLimitOvrdeInd;
    }

    public AwardMaintenance100PutRequest withFundLimitOvrdeInd(String fundLimitOvrdeInd) {
        this.fundLimitOvrdeInd = fundLimitOvrdeInd;
        return this;
    }

    @JsonProperty("criteria.displayRescheduleInd")
    public String getCriteriaDisplayRescheduleInd() {
        return criteriaDisplayRescheduleInd;
    }

    @JsonProperty("criteria.displayRescheduleInd")
    public void setCriteriaDisplayRescheduleInd(String criteriaDisplayRescheduleInd) {
        this.criteriaDisplayRescheduleInd = criteriaDisplayRescheduleInd;
    }

    public AwardMaintenance100PutRequest withCriteriaDisplayRescheduleInd(String criteriaDisplayRescheduleInd) {
        this.criteriaDisplayRescheduleInd = criteriaDisplayRescheduleInd;
        return this;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public Double getOfferAmt() {
        return offerAmt;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public void setOfferAmt(Double offerAmt) {
        this.offerAmt = offerAmt;
    }

    public AwardMaintenance100PutRequest withOfferAmt(Double offerAmt) {
        this.offerAmt = offerAmt;
        return this;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    public Double getDisplayDeccanAmt() {
        return displayDeccanAmt;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    public void setDisplayDeccanAmt(Double displayDeccanAmt) {
        this.displayDeccanAmt = displayDeccanAmt;
    }

    public AwardMaintenance100PutRequest withDisplayDeccanAmt(Double displayDeccanAmt) {
        this.displayDeccanAmt = displayDeccanAmt;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.fundDescription")
    public String getCriteriaFundDescription() {
        return criteriaFundDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.fundDescription")
    public void setCriteriaFundDescription(String criteriaFundDescription) {
        this.criteriaFundDescription = criteriaFundDescription;
    }

    public AwardMaintenance100PutRequest withCriteriaFundDescription(String criteriaFundDescription) {
        this.criteriaFundDescription = criteriaFundDescription;
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

    public AwardMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AwardMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fedLimitOvrdeInd");
        sb.append('=');
        sb.append(((this.fedLimitOvrdeInd == null)?"<null>":this.fedLimitOvrdeInd));
        sb.append(',');
        sb.append("displayMemautAmt");
        sb.append('=');
        sb.append(((this.displayMemautAmt == null)?"<null>":this.displayMemautAmt));
        sb.append(',');
        sb.append("treqOvrdeInd");
        sb.append('=');
        sb.append(((this.treqOvrdeInd == null)?"<null>":this.treqOvrdeInd));
        sb.append(',');
        sb.append("sysInd");
        sb.append('=');
        sb.append(((this.sysInd == null)?"<null>":this.sysInd));
        sb.append(',');
        sb.append("criteriaDisplayDeccanAmt");
        sb.append('=');
        sb.append(((this.criteriaDisplayDeccanAmt == null)?"<null>":this.criteriaDisplayDeccanAmt));
        sb.append(',');
        sb.append("criteriaDisplayMemautAmt");
        sb.append('=');
        sb.append(((this.criteriaDisplayMemautAmt == null)?"<null>":this.criteriaDisplayMemautAmt));
        sb.append(',');
        sb.append("criteriaUnmetNeedOvrdeInd");
        sb.append('=');
        sb.append(((this.criteriaUnmetNeedOvrdeInd == null)?"<null>":this.criteriaUnmetNeedOvrdeInd));
        sb.append(',');
        sb.append("criteriaFedLimitOvrdeInd");
        sb.append('=');
        sb.append(((this.criteriaFedLimitOvrdeInd == null)?"<null>":this.criteriaFedLimitOvrdeInd));
        sb.append(',');
        sb.append("unmetNeedOvrdeInd");
        sb.append('=');
        sb.append(((this.unmetNeedOvrdeInd == null)?"<null>":this.unmetNeedOvrdeInd));
        sb.append(',');
        sb.append("criteriaReplaceTfcOvrdeInd");
        sb.append('=');
        sb.append(((this.criteriaReplaceTfcOvrdeInd == null)?"<null>":this.criteriaReplaceTfcOvrdeInd));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("criteriaPaidAmt");
        sb.append('=');
        sb.append(((this.criteriaPaidAmt == null)?"<null>":this.criteriaPaidAmt));
        sb.append(',');
        sb.append("replaceTfcOvrdeInd");
        sb.append('=');
        sb.append(((this.replaceTfcOvrdeInd == null)?"<null>":this.replaceTfcOvrdeInd));
        sb.append(',');
        sb.append("displayRescheduleInd");
        sb.append('=');
        sb.append(((this.displayRescheduleInd == null)?"<null>":this.displayRescheduleInd));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("criteriaTreqOvrdeInd");
        sb.append('=');
        sb.append(((this.criteriaTreqOvrdeInd == null)?"<null>":this.criteriaTreqOvrdeInd));
        sb.append(',');
        sb.append("criteriaFundLimitOvrdeInd");
        sb.append('=');
        sb.append(((this.criteriaFundLimitOvrdeInd == null)?"<null>":this.criteriaFundLimitOvrdeInd));
        sb.append(',');
        sb.append("criteriaOverrideFundRule");
        sb.append('=');
        sb.append(((this.criteriaOverrideFundRule == null)?"<null>":this.criteriaOverrideFundRule));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("acceptAmt");
        sb.append('=');
        sb.append(((this.acceptAmt == null)?"<null>":this.acceptAmt));
        sb.append(',');
        sb.append("criteriaAwstCode");
        sb.append('=');
        sb.append(((this.criteriaAwstCode == null)?"<null>":this.criteriaAwstCode));
        sb.append(',');
        sb.append("criteriaSysInd");
        sb.append('=');
        sb.append(((this.criteriaSysInd == null)?"<null>":this.criteriaSysInd));
        sb.append(',');
        sb.append("criteriaInfoAccessInd");
        sb.append('=');
        sb.append(((this.criteriaInfoAccessInd == null)?"<null>":this.criteriaInfoAccessInd));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("paidAmt");
        sb.append('=');
        sb.append(((this.paidAmt == null)?"<null>":this.paidAmt));
        sb.append(',');
        sb.append("fundDescription");
        sb.append('=');
        sb.append(((this.fundDescription == null)?"<null>":this.fundDescription));
        sb.append(',');
        sb.append("criteriaLockInd");
        sb.append('=');
        sb.append(((this.criteriaLockInd == null)?"<null>":this.criteriaLockInd));
        sb.append(',');
        sb.append("overrideFundRule");
        sb.append('=');
        sb.append(((this.overrideFundRule == null)?"<null>":this.overrideFundRule));
        sb.append(',');
        sb.append("awstCode");
        sb.append('=');
        sb.append(((this.awstCode == null)?"<null>":this.awstCode));
        sb.append(',');
        sb.append("criteriaOfferAmt");
        sb.append('=');
        sb.append(((this.criteriaOfferAmt == null)?"<null>":this.criteriaOfferAmt));
        sb.append(',');
        sb.append("criteriaAcceptAmt");
        sb.append('=');
        sb.append(((this.criteriaAcceptAmt == null)?"<null>":this.criteriaAcceptAmt));
        sb.append(',');
        sb.append("fundLimitOvrdeInd");
        sb.append('=');
        sb.append(((this.fundLimitOvrdeInd == null)?"<null>":this.fundLimitOvrdeInd));
        sb.append(',');
        sb.append("criteriaDisplayRescheduleInd");
        sb.append('=');
        sb.append(((this.criteriaDisplayRescheduleInd == null)?"<null>":this.criteriaDisplayRescheduleInd));
        sb.append(',');
        sb.append("offerAmt");
        sb.append('=');
        sb.append(((this.offerAmt == null)?"<null>":this.offerAmt));
        sb.append(',');
        sb.append("displayDeccanAmt");
        sb.append('=');
        sb.append(((this.displayDeccanAmt == null)?"<null>":this.displayDeccanAmt));
        sb.append(',');
        sb.append("criteriaFundDescription");
        sb.append('=');
        sb.append(((this.criteriaFundDescription == null)?"<null>":this.criteriaFundDescription));
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
        result = ((result* 31)+((this.criteriaLockInd == null)? 0 :this.criteriaLockInd.hashCode()));
        result = ((result* 31)+((this.criteriaAwstCode == null)? 0 :this.criteriaAwstCode.hashCode()));
        result = ((result* 31)+((this.fedLimitOvrdeInd == null)? 0 :this.fedLimitOvrdeInd.hashCode()));
        result = ((result* 31)+((this.criteriaFundDescription == null)? 0 :this.criteriaFundDescription.hashCode()));
        result = ((result* 31)+((this.displayMemautAmt == null)? 0 :this.displayMemautAmt.hashCode()));
        result = ((result* 31)+((this.treqOvrdeInd == null)? 0 :this.treqOvrdeInd.hashCode()));
        result = ((result* 31)+((this.sysInd == null)? 0 :this.sysInd.hashCode()));
        result = ((result* 31)+((this.criteriaFundLimitOvrdeInd == null)? 0 :this.criteriaFundLimitOvrdeInd.hashCode()));
        result = ((result* 31)+((this.criteriaAcceptAmt == null)? 0 :this.criteriaAcceptAmt.hashCode()));
        result = ((result* 31)+((this.criteriaUnmetNeedOvrdeInd == null)? 0 :this.criteriaUnmetNeedOvrdeInd.hashCode()));
        result = ((result* 31)+((this.criteriaOverrideFundRule == null)? 0 :this.criteriaOverrideFundRule.hashCode()));
        result = ((result* 31)+((this.unmetNeedOvrdeInd == null)? 0 :this.unmetNeedOvrdeInd.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.replaceTfcOvrdeInd == null)? 0 :this.replaceTfcOvrdeInd.hashCode()));
        result = ((result* 31)+((this.displayRescheduleInd == null)? 0 :this.displayRescheduleInd.hashCode()));
        result = ((result* 31)+((this.criteriaTreqOvrdeInd == null)? 0 :this.criteriaTreqOvrdeInd.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.criteriaFedLimitOvrdeInd == null)? 0 :this.criteriaFedLimitOvrdeInd.hashCode()));
        result = ((result* 31)+((this.acceptAmt == null)? 0 :this.acceptAmt.hashCode()));
        result = ((result* 31)+((this.criteriaPaidAmt == null)? 0 :this.criteriaPaidAmt.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.paidAmt == null)? 0 :this.paidAmt.hashCode()));
        result = ((result* 31)+((this.fundDescription == null)? 0 :this.fundDescription.hashCode()));
        result = ((result* 31)+((this.criteriaInfoAccessInd == null)? 0 :this.criteriaInfoAccessInd.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayRescheduleInd == null)? 0 :this.criteriaDisplayRescheduleInd.hashCode()));
        result = ((result* 31)+((this.criteriaReplaceTfcOvrdeInd == null)? 0 :this.criteriaReplaceTfcOvrdeInd.hashCode()));
        result = ((result* 31)+((this.overrideFundRule == null)? 0 :this.overrideFundRule.hashCode()));
        result = ((result* 31)+((this.criteriaOfferAmt == null)? 0 :this.criteriaOfferAmt.hashCode()));
        result = ((result* 31)+((this.awstCode == null)? 0 :this.awstCode.hashCode()));
        result = ((result* 31)+((this.fundLimitOvrdeInd == null)? 0 :this.fundLimitOvrdeInd.hashCode()));
        result = ((result* 31)+((this.criteriaSysInd == null)? 0 :this.criteriaSysInd.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayDeccanAmt == null)? 0 :this.criteriaDisplayDeccanAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.offerAmt == null)? 0 :this.offerAmt.hashCode()));
        result = ((result* 31)+((this.displayDeccanAmt == null)? 0 :this.displayDeccanAmt.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayMemautAmt == null)? 0 :this.criteriaDisplayMemautAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwardMaintenance100PutRequest) == false) {
            return false;
        }
        AwardMaintenance100PutRequest rhs = ((AwardMaintenance100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaLockInd == rhs.criteriaLockInd)||((this.criteriaLockInd!= null)&&this.criteriaLockInd.equals(rhs.criteriaLockInd))))&&((this.criteriaAwstCode == rhs.criteriaAwstCode)||((this.criteriaAwstCode!= null)&&this.criteriaAwstCode.equals(rhs.criteriaAwstCode))))&&((this.fedLimitOvrdeInd == rhs.fedLimitOvrdeInd)||((this.fedLimitOvrdeInd!= null)&&this.fedLimitOvrdeInd.equals(rhs.fedLimitOvrdeInd))))&&((this.criteriaFundDescription == rhs.criteriaFundDescription)||((this.criteriaFundDescription!= null)&&this.criteriaFundDescription.equals(rhs.criteriaFundDescription))))&&((this.displayMemautAmt == rhs.displayMemautAmt)||((this.displayMemautAmt!= null)&&this.displayMemautAmt.equals(rhs.displayMemautAmt))))&&((this.treqOvrdeInd == rhs.treqOvrdeInd)||((this.treqOvrdeInd!= null)&&this.treqOvrdeInd.equals(rhs.treqOvrdeInd))))&&((this.sysInd == rhs.sysInd)||((this.sysInd!= null)&&this.sysInd.equals(rhs.sysInd))))&&((this.criteriaFundLimitOvrdeInd == rhs.criteriaFundLimitOvrdeInd)||((this.criteriaFundLimitOvrdeInd!= null)&&this.criteriaFundLimitOvrdeInd.equals(rhs.criteriaFundLimitOvrdeInd))))&&((this.criteriaAcceptAmt == rhs.criteriaAcceptAmt)||((this.criteriaAcceptAmt!= null)&&this.criteriaAcceptAmt.equals(rhs.criteriaAcceptAmt))))&&((this.criteriaUnmetNeedOvrdeInd == rhs.criteriaUnmetNeedOvrdeInd)||((this.criteriaUnmetNeedOvrdeInd!= null)&&this.criteriaUnmetNeedOvrdeInd.equals(rhs.criteriaUnmetNeedOvrdeInd))))&&((this.criteriaOverrideFundRule == rhs.criteriaOverrideFundRule)||((this.criteriaOverrideFundRule!= null)&&this.criteriaOverrideFundRule.equals(rhs.criteriaOverrideFundRule))))&&((this.unmetNeedOvrdeInd == rhs.unmetNeedOvrdeInd)||((this.unmetNeedOvrdeInd!= null)&&this.unmetNeedOvrdeInd.equals(rhs.unmetNeedOvrdeInd))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.replaceTfcOvrdeInd == rhs.replaceTfcOvrdeInd)||((this.replaceTfcOvrdeInd!= null)&&this.replaceTfcOvrdeInd.equals(rhs.replaceTfcOvrdeInd))))&&((this.displayRescheduleInd == rhs.displayRescheduleInd)||((this.displayRescheduleInd!= null)&&this.displayRescheduleInd.equals(rhs.displayRescheduleInd))))&&((this.criteriaTreqOvrdeInd == rhs.criteriaTreqOvrdeInd)||((this.criteriaTreqOvrdeInd!= null)&&this.criteriaTreqOvrdeInd.equals(rhs.criteriaTreqOvrdeInd))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.criteriaFedLimitOvrdeInd == rhs.criteriaFedLimitOvrdeInd)||((this.criteriaFedLimitOvrdeInd!= null)&&this.criteriaFedLimitOvrdeInd.equals(rhs.criteriaFedLimitOvrdeInd))))&&((this.acceptAmt == rhs.acceptAmt)||((this.acceptAmt!= null)&&this.acceptAmt.equals(rhs.acceptAmt))))&&((this.criteriaPaidAmt == rhs.criteriaPaidAmt)||((this.criteriaPaidAmt!= null)&&this.criteriaPaidAmt.equals(rhs.criteriaPaidAmt))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.paidAmt == rhs.paidAmt)||((this.paidAmt!= null)&&this.paidAmt.equals(rhs.paidAmt))))&&((this.fundDescription == rhs.fundDescription)||((this.fundDescription!= null)&&this.fundDescription.equals(rhs.fundDescription))))&&((this.criteriaInfoAccessInd == rhs.criteriaInfoAccessInd)||((this.criteriaInfoAccessInd!= null)&&this.criteriaInfoAccessInd.equals(rhs.criteriaInfoAccessInd))))&&((this.criteriaDisplayRescheduleInd == rhs.criteriaDisplayRescheduleInd)||((this.criteriaDisplayRescheduleInd!= null)&&this.criteriaDisplayRescheduleInd.equals(rhs.criteriaDisplayRescheduleInd))))&&((this.criteriaReplaceTfcOvrdeInd == rhs.criteriaReplaceTfcOvrdeInd)||((this.criteriaReplaceTfcOvrdeInd!= null)&&this.criteriaReplaceTfcOvrdeInd.equals(rhs.criteriaReplaceTfcOvrdeInd))))&&((this.overrideFundRule == rhs.overrideFundRule)||((this.overrideFundRule!= null)&&this.overrideFundRule.equals(rhs.overrideFundRule))))&&((this.criteriaOfferAmt == rhs.criteriaOfferAmt)||((this.criteriaOfferAmt!= null)&&this.criteriaOfferAmt.equals(rhs.criteriaOfferAmt))))&&((this.awstCode == rhs.awstCode)||((this.awstCode!= null)&&this.awstCode.equals(rhs.awstCode))))&&((this.fundLimitOvrdeInd == rhs.fundLimitOvrdeInd)||((this.fundLimitOvrdeInd!= null)&&this.fundLimitOvrdeInd.equals(rhs.fundLimitOvrdeInd))))&&((this.criteriaSysInd == rhs.criteriaSysInd)||((this.criteriaSysInd!= null)&&this.criteriaSysInd.equals(rhs.criteriaSysInd))))&&((this.criteriaDisplayDeccanAmt == rhs.criteriaDisplayDeccanAmt)||((this.criteriaDisplayDeccanAmt!= null)&&this.criteriaDisplayDeccanAmt.equals(rhs.criteriaDisplayDeccanAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.offerAmt == rhs.offerAmt)||((this.offerAmt!= null)&&this.offerAmt.equals(rhs.offerAmt))))&&((this.displayDeccanAmt == rhs.displayDeccanAmt)||((this.displayDeccanAmt!= null)&&this.displayDeccanAmt.equals(rhs.displayDeccanAmt))))&&((this.criteriaDisplayMemautAmt == rhs.criteriaDisplayMemautAmt)||((this.criteriaDisplayMemautAmt!= null)&&this.criteriaDisplayMemautAmt.equals(rhs.criteriaDisplayMemautAmt))));
    }

}
