
package com.ellucian.generated.bpapi.ban.system_control_maintenance.v1_0_0;

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
    "criteria.activityDate",
    "criteria.statusInd",
    "fobsyscEffDate",
    "criteria.termDate",
    "ruclSecurityInd",
    "wbudTrackInd",
    "criteria.multipleFbAcctInd",
    "criteria.wbudInd",
    "criteria.consolPostInd",
    "statusInd",
    "fundOrgSecurityInd",
    "acctCodeCoasDueFrm",
    "federalEmployerId",
    "criteria.nchgDate",
    "criteria.ruclSecurityInd",
    "criteria.editDeferInd",
    "criteria.effDate",
    "criteria.fundOrgSecurityInd",
    "criteria.acctCodeCoasDueTo",
    "acctCodeCoasDueTo",
    "multipleFbAcctInd",
    "editDeferInd",
    "consolPostInd",
    "criteria.federalEmployerId",
    "criteria.acctCodeCoasDueFrm",
    "wbudInd",
    "fobsyscWbudInd",
    "criteria.wbudTrackInd",
    "termDate"
})
@Generated("jsonschema2pojo")
public class SystemControlMaintenance100PutRequest {

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FOBSYSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("fobsyscEffDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_EFF_DATE")
    private Date fobsyscEffDate;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("ruclSecurityInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_RUCL_SECURITY_IND")
    private String ruclSecurityInd;
    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("wbudTrackInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_WBUD_TRACK_IND")
    private String wbudTrackInd;
    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("criteria.multipleFbAcctInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND")
    private String criteriaMultipleFbAcctInd;
    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("criteria.wbudInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_WBUD_IND")
    private String criteriaWbudInd;
    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("criteria.consolPostInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_CONSOL_POST_IND")
    private String criteriaConsolPostInd;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_STATUS_IND")
    private String statusInd;
    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("fundOrgSecurityInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND")
    private String fundOrgSecurityInd;
    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueFrm")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM")
    private String acctCodeCoasDueFrm;
    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("federalEmployerId")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID")
    private String federalEmployerId;
    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FOBSYSC_NCHG_DATE
     * 
     */
    @JsonProperty("criteria.nchgDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_NCHG_DATE")
    private Date criteriaNchgDate;
    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("criteria.ruclSecurityInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_RUCL_SECURITY_IND")
    private String criteriaRuclSecurityInd;
    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("criteria.editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_EDIT_DEFER_IND")
    private String criteriaEditDeferInd;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("criteria.fundOrgSecurityInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND")
    private String criteriaFundOrgSecurityInd;
    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCodeCoasDueTo")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO")
    private String criteriaAcctCodeCoasDueTo;
    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueTo")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO")
    private String acctCodeCoasDueTo;
    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("multipleFbAcctInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND")
    private String multipleFbAcctInd;
    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_EDIT_DEFER_IND")
    private String editDeferInd;
    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("consolPostInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_CONSOL_POST_IND")
    private String consolPostInd;
    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("criteria.federalEmployerId")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID")
    private String criteriaFederalEmployerId;
    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCodeCoasDueFrm")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM")
    private String criteriaAcctCodeCoasDueFrm;
    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("wbudInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_WBUD_IND")
    private String wbudInd;
    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("fobsyscWbudInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_WBUD_IND")
    private String fobsyscWbudInd;
    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("criteria.wbudTrackInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_WBUD_TRACK_IND")
    private String criteriaWbudTrackInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_TERM_DATE")
    private Date termDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FOBSYSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FOBSYSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public SystemControlMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public SystemControlMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("fobsyscEffDate")
    public Date getFobsyscEffDate() {
        return fobsyscEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("fobsyscEffDate")
    public void setFobsyscEffDate(Date fobsyscEffDate) {
        this.fobsyscEffDate = fobsyscEffDate;
    }

    public SystemControlMaintenance100PutRequest withFobsyscEffDate(Date fobsyscEffDate) {
        this.fobsyscEffDate = fobsyscEffDate;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public SystemControlMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("ruclSecurityInd")
    public String getRuclSecurityInd() {
        return ruclSecurityInd;
    }

    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("ruclSecurityInd")
    public void setRuclSecurityInd(String ruclSecurityInd) {
        this.ruclSecurityInd = ruclSecurityInd;
    }

    public SystemControlMaintenance100PutRequest withRuclSecurityInd(String ruclSecurityInd) {
        this.ruclSecurityInd = ruclSecurityInd;
        return this;
    }

    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("wbudTrackInd")
    public String getWbudTrackInd() {
        return wbudTrackInd;
    }

    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("wbudTrackInd")
    public void setWbudTrackInd(String wbudTrackInd) {
        this.wbudTrackInd = wbudTrackInd;
    }

    public SystemControlMaintenance100PutRequest withWbudTrackInd(String wbudTrackInd) {
        this.wbudTrackInd = wbudTrackInd;
        return this;
    }

    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("criteria.multipleFbAcctInd")
    public String getCriteriaMultipleFbAcctInd() {
        return criteriaMultipleFbAcctInd;
    }

    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("criteria.multipleFbAcctInd")
    public void setCriteriaMultipleFbAcctInd(String criteriaMultipleFbAcctInd) {
        this.criteriaMultipleFbAcctInd = criteriaMultipleFbAcctInd;
    }

    public SystemControlMaintenance100PutRequest withCriteriaMultipleFbAcctInd(String criteriaMultipleFbAcctInd) {
        this.criteriaMultipleFbAcctInd = criteriaMultipleFbAcctInd;
        return this;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("criteria.wbudInd")
    public String getCriteriaWbudInd() {
        return criteriaWbudInd;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("criteria.wbudInd")
    public void setCriteriaWbudInd(String criteriaWbudInd) {
        this.criteriaWbudInd = criteriaWbudInd;
    }

    public SystemControlMaintenance100PutRequest withCriteriaWbudInd(String criteriaWbudInd) {
        this.criteriaWbudInd = criteriaWbudInd;
        return this;
    }

    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("criteria.consolPostInd")
    public String getCriteriaConsolPostInd() {
        return criteriaConsolPostInd;
    }

    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("criteria.consolPostInd")
    public void setCriteriaConsolPostInd(String criteriaConsolPostInd) {
        this.criteriaConsolPostInd = criteriaConsolPostInd;
    }

    public SystemControlMaintenance100PutRequest withCriteriaConsolPostInd(String criteriaConsolPostInd) {
        this.criteriaConsolPostInd = criteriaConsolPostInd;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public SystemControlMaintenance100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("fundOrgSecurityInd")
    public String getFundOrgSecurityInd() {
        return fundOrgSecurityInd;
    }

    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("fundOrgSecurityInd")
    public void setFundOrgSecurityInd(String fundOrgSecurityInd) {
        this.fundOrgSecurityInd = fundOrgSecurityInd;
    }

    public SystemControlMaintenance100PutRequest withFundOrgSecurityInd(String fundOrgSecurityInd) {
        this.fundOrgSecurityInd = fundOrgSecurityInd;
        return this;
    }

    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueFrm")
    public String getAcctCodeCoasDueFrm() {
        return acctCodeCoasDueFrm;
    }

    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueFrm")
    public void setAcctCodeCoasDueFrm(String acctCodeCoasDueFrm) {
        this.acctCodeCoasDueFrm = acctCodeCoasDueFrm;
    }

    public SystemControlMaintenance100PutRequest withAcctCodeCoasDueFrm(String acctCodeCoasDueFrm) {
        this.acctCodeCoasDueFrm = acctCodeCoasDueFrm;
        return this;
    }

    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("federalEmployerId")
    public String getFederalEmployerId() {
        return federalEmployerId;
    }

    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("federalEmployerId")
    public void setFederalEmployerId(String federalEmployerId) {
        this.federalEmployerId = federalEmployerId;
    }

    public SystemControlMaintenance100PutRequest withFederalEmployerId(String federalEmployerId) {
        this.federalEmployerId = federalEmployerId;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FOBSYSC_NCHG_DATE
     * 
     */
    @JsonProperty("criteria.nchgDate")
    public Date getCriteriaNchgDate() {
        return criteriaNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FOBSYSC_NCHG_DATE
     * 
     */
    @JsonProperty("criteria.nchgDate")
    public void setCriteriaNchgDate(Date criteriaNchgDate) {
        this.criteriaNchgDate = criteriaNchgDate;
    }

    public SystemControlMaintenance100PutRequest withCriteriaNchgDate(Date criteriaNchgDate) {
        this.criteriaNchgDate = criteriaNchgDate;
        return this;
    }

    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("criteria.ruclSecurityInd")
    public String getCriteriaRuclSecurityInd() {
        return criteriaRuclSecurityInd;
    }

    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("criteria.ruclSecurityInd")
    public void setCriteriaRuclSecurityInd(String criteriaRuclSecurityInd) {
        this.criteriaRuclSecurityInd = criteriaRuclSecurityInd;
    }

    public SystemControlMaintenance100PutRequest withCriteriaRuclSecurityInd(String criteriaRuclSecurityInd) {
        this.criteriaRuclSecurityInd = criteriaRuclSecurityInd;
        return this;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("criteria.editDeferInd")
    public String getCriteriaEditDeferInd() {
        return criteriaEditDeferInd;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("criteria.editDeferInd")
    public void setCriteriaEditDeferInd(String criteriaEditDeferInd) {
        this.criteriaEditDeferInd = criteriaEditDeferInd;
    }

    public SystemControlMaintenance100PutRequest withCriteriaEditDeferInd(String criteriaEditDeferInd) {
        this.criteriaEditDeferInd = criteriaEditDeferInd;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public SystemControlMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("criteria.fundOrgSecurityInd")
    public String getCriteriaFundOrgSecurityInd() {
        return criteriaFundOrgSecurityInd;
    }

    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("criteria.fundOrgSecurityInd")
    public void setCriteriaFundOrgSecurityInd(String criteriaFundOrgSecurityInd) {
        this.criteriaFundOrgSecurityInd = criteriaFundOrgSecurityInd;
    }

    public SystemControlMaintenance100PutRequest withCriteriaFundOrgSecurityInd(String criteriaFundOrgSecurityInd) {
        this.criteriaFundOrgSecurityInd = criteriaFundOrgSecurityInd;
        return this;
    }

    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCodeCoasDueTo")
    public String getCriteriaAcctCodeCoasDueTo() {
        return criteriaAcctCodeCoasDueTo;
    }

    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCodeCoasDueTo")
    public void setCriteriaAcctCodeCoasDueTo(String criteriaAcctCodeCoasDueTo) {
        this.criteriaAcctCodeCoasDueTo = criteriaAcctCodeCoasDueTo;
    }

    public SystemControlMaintenance100PutRequest withCriteriaAcctCodeCoasDueTo(String criteriaAcctCodeCoasDueTo) {
        this.criteriaAcctCodeCoasDueTo = criteriaAcctCodeCoasDueTo;
        return this;
    }

    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueTo")
    public String getAcctCodeCoasDueTo() {
        return acctCodeCoasDueTo;
    }

    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * (Required)
     * 
     */
    @JsonProperty("acctCodeCoasDueTo")
    public void setAcctCodeCoasDueTo(String acctCodeCoasDueTo) {
        this.acctCodeCoasDueTo = acctCodeCoasDueTo;
    }

    public SystemControlMaintenance100PutRequest withAcctCodeCoasDueTo(String acctCodeCoasDueTo) {
        this.acctCodeCoasDueTo = acctCodeCoasDueTo;
        return this;
    }

    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("multipleFbAcctInd")
    public String getMultipleFbAcctInd() {
        return multipleFbAcctInd;
    }

    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("multipleFbAcctInd")
    public void setMultipleFbAcctInd(String multipleFbAcctInd) {
        this.multipleFbAcctInd = multipleFbAcctInd;
    }

    public SystemControlMaintenance100PutRequest withMultipleFbAcctInd(String multipleFbAcctInd) {
        this.multipleFbAcctInd = multipleFbAcctInd;
        return this;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public String getEditDeferInd() {
        return editDeferInd;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public void setEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
    }

    public SystemControlMaintenance100PutRequest withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("consolPostInd")
    public String getConsolPostInd() {
        return consolPostInd;
    }

    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("consolPostInd")
    public void setConsolPostInd(String consolPostInd) {
        this.consolPostInd = consolPostInd;
    }

    public SystemControlMaintenance100PutRequest withConsolPostInd(String consolPostInd) {
        this.consolPostInd = consolPostInd;
        return this;
    }

    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("criteria.federalEmployerId")
    public String getCriteriaFederalEmployerId() {
        return criteriaFederalEmployerId;
    }

    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("criteria.federalEmployerId")
    public void setCriteriaFederalEmployerId(String criteriaFederalEmployerId) {
        this.criteriaFederalEmployerId = criteriaFederalEmployerId;
    }

    public SystemControlMaintenance100PutRequest withCriteriaFederalEmployerId(String criteriaFederalEmployerId) {
        this.criteriaFederalEmployerId = criteriaFederalEmployerId;
        return this;
    }

    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCodeCoasDueFrm")
    public String getCriteriaAcctCodeCoasDueFrm() {
        return criteriaAcctCodeCoasDueFrm;
    }

    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCodeCoasDueFrm")
    public void setCriteriaAcctCodeCoasDueFrm(String criteriaAcctCodeCoasDueFrm) {
        this.criteriaAcctCodeCoasDueFrm = criteriaAcctCodeCoasDueFrm;
    }

    public SystemControlMaintenance100PutRequest withCriteriaAcctCodeCoasDueFrm(String criteriaAcctCodeCoasDueFrm) {
        this.criteriaAcctCodeCoasDueFrm = criteriaAcctCodeCoasDueFrm;
        return this;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("wbudInd")
    public String getWbudInd() {
        return wbudInd;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("wbudInd")
    public void setWbudInd(String wbudInd) {
        this.wbudInd = wbudInd;
    }

    public SystemControlMaintenance100PutRequest withWbudInd(String wbudInd) {
        this.wbudInd = wbudInd;
        return this;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("fobsyscWbudInd")
    public String getFobsyscWbudInd() {
        return fobsyscWbudInd;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("fobsyscWbudInd")
    public void setFobsyscWbudInd(String fobsyscWbudInd) {
        this.fobsyscWbudInd = fobsyscWbudInd;
    }

    public SystemControlMaintenance100PutRequest withFobsyscWbudInd(String fobsyscWbudInd) {
        this.fobsyscWbudInd = fobsyscWbudInd;
        return this;
    }

    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("criteria.wbudTrackInd")
    public String getCriteriaWbudTrackInd() {
        return criteriaWbudTrackInd;
    }

    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("criteria.wbudTrackInd")
    public void setCriteriaWbudTrackInd(String criteriaWbudTrackInd) {
        this.criteriaWbudTrackInd = criteriaWbudTrackInd;
    }

    public SystemControlMaintenance100PutRequest withCriteriaWbudTrackInd(String criteriaWbudTrackInd) {
        this.criteriaWbudTrackInd = criteriaWbudTrackInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public SystemControlMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public SystemControlMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SystemControlMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("fobsyscEffDate");
        sb.append('=');
        sb.append(((this.fobsyscEffDate == null)?"<null>":this.fobsyscEffDate));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("ruclSecurityInd");
        sb.append('=');
        sb.append(((this.ruclSecurityInd == null)?"<null>":this.ruclSecurityInd));
        sb.append(',');
        sb.append("wbudTrackInd");
        sb.append('=');
        sb.append(((this.wbudTrackInd == null)?"<null>":this.wbudTrackInd));
        sb.append(',');
        sb.append("criteriaMultipleFbAcctInd");
        sb.append('=');
        sb.append(((this.criteriaMultipleFbAcctInd == null)?"<null>":this.criteriaMultipleFbAcctInd));
        sb.append(',');
        sb.append("criteriaWbudInd");
        sb.append('=');
        sb.append(((this.criteriaWbudInd == null)?"<null>":this.criteriaWbudInd));
        sb.append(',');
        sb.append("criteriaConsolPostInd");
        sb.append('=');
        sb.append(((this.criteriaConsolPostInd == null)?"<null>":this.criteriaConsolPostInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("fundOrgSecurityInd");
        sb.append('=');
        sb.append(((this.fundOrgSecurityInd == null)?"<null>":this.fundOrgSecurityInd));
        sb.append(',');
        sb.append("acctCodeCoasDueFrm");
        sb.append('=');
        sb.append(((this.acctCodeCoasDueFrm == null)?"<null>":this.acctCodeCoasDueFrm));
        sb.append(',');
        sb.append("federalEmployerId");
        sb.append('=');
        sb.append(((this.federalEmployerId == null)?"<null>":this.federalEmployerId));
        sb.append(',');
        sb.append("criteriaNchgDate");
        sb.append('=');
        sb.append(((this.criteriaNchgDate == null)?"<null>":this.criteriaNchgDate));
        sb.append(',');
        sb.append("criteriaRuclSecurityInd");
        sb.append('=');
        sb.append(((this.criteriaRuclSecurityInd == null)?"<null>":this.criteriaRuclSecurityInd));
        sb.append(',');
        sb.append("criteriaEditDeferInd");
        sb.append('=');
        sb.append(((this.criteriaEditDeferInd == null)?"<null>":this.criteriaEditDeferInd));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaFundOrgSecurityInd");
        sb.append('=');
        sb.append(((this.criteriaFundOrgSecurityInd == null)?"<null>":this.criteriaFundOrgSecurityInd));
        sb.append(',');
        sb.append("criteriaAcctCodeCoasDueTo");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeCoasDueTo == null)?"<null>":this.criteriaAcctCodeCoasDueTo));
        sb.append(',');
        sb.append("acctCodeCoasDueTo");
        sb.append('=');
        sb.append(((this.acctCodeCoasDueTo == null)?"<null>":this.acctCodeCoasDueTo));
        sb.append(',');
        sb.append("multipleFbAcctInd");
        sb.append('=');
        sb.append(((this.multipleFbAcctInd == null)?"<null>":this.multipleFbAcctInd));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("consolPostInd");
        sb.append('=');
        sb.append(((this.consolPostInd == null)?"<null>":this.consolPostInd));
        sb.append(',');
        sb.append("criteriaFederalEmployerId");
        sb.append('=');
        sb.append(((this.criteriaFederalEmployerId == null)?"<null>":this.criteriaFederalEmployerId));
        sb.append(',');
        sb.append("criteriaAcctCodeCoasDueFrm");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeCoasDueFrm == null)?"<null>":this.criteriaAcctCodeCoasDueFrm));
        sb.append(',');
        sb.append("wbudInd");
        sb.append('=');
        sb.append(((this.wbudInd == null)?"<null>":this.wbudInd));
        sb.append(',');
        sb.append("fobsyscWbudInd");
        sb.append('=');
        sb.append(((this.fobsyscWbudInd == null)?"<null>":this.fobsyscWbudInd));
        sb.append(',');
        sb.append("criteriaWbudTrackInd");
        sb.append('=');
        sb.append(((this.criteriaWbudTrackInd == null)?"<null>":this.criteriaWbudTrackInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.criteriaWbudInd == null)? 0 :this.criteriaWbudInd.hashCode()));
        result = ((result* 31)+((this.criteriaEditDeferInd == null)? 0 :this.criteriaEditDeferInd.hashCode()));
        result = ((result* 31)+((this.criteriaFederalEmployerId == null)? 0 :this.criteriaFederalEmployerId.hashCode()));
        result = ((result* 31)+((this.fobsyscEffDate == null)? 0 :this.fobsyscEffDate.hashCode()));
        result = ((result* 31)+((this.ruclSecurityInd == null)? 0 :this.ruclSecurityInd.hashCode()));
        result = ((result* 31)+((this.wbudTrackInd == null)? 0 :this.wbudTrackInd.hashCode()));
        result = ((result* 31)+((this.criteriaConsolPostInd == null)? 0 :this.criteriaConsolPostInd.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeCoasDueTo == null)? 0 :this.criteriaAcctCodeCoasDueTo.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.fundOrgSecurityInd == null)? 0 :this.fundOrgSecurityInd.hashCode()));
        result = ((result* 31)+((this.acctCodeCoasDueFrm == null)? 0 :this.acctCodeCoasDueFrm.hashCode()));
        result = ((result* 31)+((this.federalEmployerId == null)? 0 :this.federalEmployerId.hashCode()));
        result = ((result* 31)+((this.criteriaNchgDate == null)? 0 :this.criteriaNchgDate.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeCoasDueFrm == null)? 0 :this.criteriaAcctCodeCoasDueFrm.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaWbudTrackInd == null)? 0 :this.criteriaWbudTrackInd.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaRuclSecurityInd == null)? 0 :this.criteriaRuclSecurityInd.hashCode()));
        result = ((result* 31)+((this.criteriaFundOrgSecurityInd == null)? 0 :this.criteriaFundOrgSecurityInd.hashCode()));
        result = ((result* 31)+((this.acctCodeCoasDueTo == null)? 0 :this.acctCodeCoasDueTo.hashCode()));
        result = ((result* 31)+((this.multipleFbAcctInd == null)? 0 :this.multipleFbAcctInd.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.criteriaMultipleFbAcctInd == null)? 0 :this.criteriaMultipleFbAcctInd.hashCode()));
        result = ((result* 31)+((this.consolPostInd == null)? 0 :this.consolPostInd.hashCode()));
        result = ((result* 31)+((this.wbudInd == null)? 0 :this.wbudInd.hashCode()));
        result = ((result* 31)+((this.fobsyscWbudInd == null)? 0 :this.fobsyscWbudInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemControlMaintenance100PutRequest) == false) {
            return false;
        }
        SystemControlMaintenance100PutRequest rhs = ((SystemControlMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((((((((this.criteriaWbudInd == rhs.criteriaWbudInd)||((this.criteriaWbudInd!= null)&&this.criteriaWbudInd.equals(rhs.criteriaWbudInd)))&&((this.criteriaEditDeferInd == rhs.criteriaEditDeferInd)||((this.criteriaEditDeferInd!= null)&&this.criteriaEditDeferInd.equals(rhs.criteriaEditDeferInd))))&&((this.criteriaFederalEmployerId == rhs.criteriaFederalEmployerId)||((this.criteriaFederalEmployerId!= null)&&this.criteriaFederalEmployerId.equals(rhs.criteriaFederalEmployerId))))&&((this.fobsyscEffDate == rhs.fobsyscEffDate)||((this.fobsyscEffDate!= null)&&this.fobsyscEffDate.equals(rhs.fobsyscEffDate))))&&((this.ruclSecurityInd == rhs.ruclSecurityInd)||((this.ruclSecurityInd!= null)&&this.ruclSecurityInd.equals(rhs.ruclSecurityInd))))&&((this.wbudTrackInd == rhs.wbudTrackInd)||((this.wbudTrackInd!= null)&&this.wbudTrackInd.equals(rhs.wbudTrackInd))))&&((this.criteriaConsolPostInd == rhs.criteriaConsolPostInd)||((this.criteriaConsolPostInd!= null)&&this.criteriaConsolPostInd.equals(rhs.criteriaConsolPostInd))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.criteriaAcctCodeCoasDueTo == rhs.criteriaAcctCodeCoasDueTo)||((this.criteriaAcctCodeCoasDueTo!= null)&&this.criteriaAcctCodeCoasDueTo.equals(rhs.criteriaAcctCodeCoasDueTo))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.fundOrgSecurityInd == rhs.fundOrgSecurityInd)||((this.fundOrgSecurityInd!= null)&&this.fundOrgSecurityInd.equals(rhs.fundOrgSecurityInd))))&&((this.acctCodeCoasDueFrm == rhs.acctCodeCoasDueFrm)||((this.acctCodeCoasDueFrm!= null)&&this.acctCodeCoasDueFrm.equals(rhs.acctCodeCoasDueFrm))))&&((this.federalEmployerId == rhs.federalEmployerId)||((this.federalEmployerId!= null)&&this.federalEmployerId.equals(rhs.federalEmployerId))))&&((this.criteriaNchgDate == rhs.criteriaNchgDate)||((this.criteriaNchgDate!= null)&&this.criteriaNchgDate.equals(rhs.criteriaNchgDate))))&&((this.criteriaAcctCodeCoasDueFrm == rhs.criteriaAcctCodeCoasDueFrm)||((this.criteriaAcctCodeCoasDueFrm!= null)&&this.criteriaAcctCodeCoasDueFrm.equals(rhs.criteriaAcctCodeCoasDueFrm))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaWbudTrackInd == rhs.criteriaWbudTrackInd)||((this.criteriaWbudTrackInd!= null)&&this.criteriaWbudTrackInd.equals(rhs.criteriaWbudTrackInd))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaRuclSecurityInd == rhs.criteriaRuclSecurityInd)||((this.criteriaRuclSecurityInd!= null)&&this.criteriaRuclSecurityInd.equals(rhs.criteriaRuclSecurityInd))))&&((this.criteriaFundOrgSecurityInd == rhs.criteriaFundOrgSecurityInd)||((this.criteriaFundOrgSecurityInd!= null)&&this.criteriaFundOrgSecurityInd.equals(rhs.criteriaFundOrgSecurityInd))))&&((this.acctCodeCoasDueTo == rhs.acctCodeCoasDueTo)||((this.acctCodeCoasDueTo!= null)&&this.acctCodeCoasDueTo.equals(rhs.acctCodeCoasDueTo))))&&((this.multipleFbAcctInd == rhs.multipleFbAcctInd)||((this.multipleFbAcctInd!= null)&&this.multipleFbAcctInd.equals(rhs.multipleFbAcctInd))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.criteriaMultipleFbAcctInd == rhs.criteriaMultipleFbAcctInd)||((this.criteriaMultipleFbAcctInd!= null)&&this.criteriaMultipleFbAcctInd.equals(rhs.criteriaMultipleFbAcctInd))))&&((this.consolPostInd == rhs.consolPostInd)||((this.consolPostInd!= null)&&this.consolPostInd.equals(rhs.consolPostInd))))&&((this.wbudInd == rhs.wbudInd)||((this.wbudInd!= null)&&this.wbudInd.equals(rhs.wbudInd))))&&((this.fobsyscWbudInd == rhs.fobsyscWbudInd)||((this.fobsyscWbudInd!= null)&&this.fobsyscWbudInd.equals(rhs.fobsyscWbudInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
