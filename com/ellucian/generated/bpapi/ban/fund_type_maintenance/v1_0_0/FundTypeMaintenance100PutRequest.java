
package com.ellucian.generated.bpapi.ban.fund_type_maintenance.v1_0_0;

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
    "criteria.ftvftypBavlKeyAcct",
    "criteria.ftvftypBavlKeyProg",
    "criteria.ftvftypEffDate",
    "internalFtypCode",
    "criteria.ftvftypStatusInd",
    "fundCodeCap",
    "coasCode",
    "title",
    "criteria.ftvftypCoasCode",
    "criteria.ftvftypBavlKeyOrg",
    "criteria.ftvftypFtypCode",
    "criteria.ftvftypDefOverrideInd",
    "criteria.ftvftypBavlPeriod",
    "criteria.ftvftypActivityDate",
    "criteria.ftvftypEncMultYrInd",
    "criteria.ftvftypBavlSeverity",
    "criteria.ftvftypAcctCodeCap",
    "ftypCodePred",
    "overrideInd",
    "criteria.ftvftypTermDate",
    "criteria.ftvftypTitle",
    "criteria.ftvftypFundCodeCap",
    "criteria.ftvftypInternalFtypCode",
    "criteria.ftvftypFtypCodePred",
    "criteria.ftvftypBavlKeyFund",
    "acctCodeCap",
    "termDate",
    "ftypCode"
})
@Generated("jsonschema2pojo")
public class FundTypeMaintenance100PutRequest {

    /**
     * Account
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyAcct")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_KEY_ACCT")
    private String criteriaFtvftypBavlKeyAcct;
    /**
     * Program
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyProg")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_KEY_PROG")
    private String criteriaFtvftypBavlKeyProg;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypEffDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_EFF_DATE")
    private Date criteriaFtvftypEffDate;
    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalFtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE")
    private String internalFtypCode;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFTYP_STATUS_IND
     * 
     */
    @JsonProperty("criteria.ftvftypStatusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_STATUS_IND")
    private String criteriaFtvftypStatusInd;
    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("fundCodeCap")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FUND_CODE_CAP")
    private String fundCodeCap;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TITLE")
    private String title;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypCoasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaFtvftypCoasCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ORG
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyOrg")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_KEY_ORG")
    private String criteriaFtvftypBavlKeyOrg;
    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypFtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp")
    private String criteriaFtvftypFtypCode;
    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypDefOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND")
    private String criteriaFtvftypDefOverrideInd;
    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_PERIOD
     * 
     */
    @JsonProperty("criteria.ftvftypBavlPeriod")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_PERIOD")
    private String criteriaFtvftypBavlPeriod;
    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ftvftypActivityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ACTIVITY_DATE")
    private Date criteriaFtvftypActivityDate;
    /**
     * Encumber Multi Year Labor
     * <p>
     * Lineage reference object : FTVFTYP_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("criteria.ftvftypEncMultYrInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ENC_MULT_YR_IND")
    private String criteriaFtvftypEncMultYrInd;
    /**
     * Severity Control
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_SEVERITY
     * 
     */
    @JsonProperty("criteria.ftvftypBavlSeverity")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_SEVERITY")
    private String criteriaFtvftypBavlSeverity;
    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("criteria.ftvftypAcctCodeCap")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ACCT_CODE_CAP")
    private String criteriaFtvftypAcctCodeCap;
    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("ftypCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp")
    private String ftypCodePred;
    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("overrideInd")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND")
    private String overrideInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("criteria.ftvftypTermDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TERM_DATE")
    private Date criteriaFtvftypTermDate;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypTitle")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TITLE")
    private String criteriaFtvftypTitle;
    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("criteria.ftvftypFundCodeCap")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FUND_CODE_CAP")
    private String criteriaFtvftypFundCodeCap;
    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypInternalFtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE")
    private String criteriaFtvftypInternalFtypCode;
    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("criteria.ftvftypFtypCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp")
    private String criteriaFtvftypFtypCodePred;
    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyFund")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_BAVL_KEY_FUND")
    private String criteriaFtvftypBavlKeyFund;
    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("acctCodeCap")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ACCT_CODE_CAP")
    private String acctCodeCap;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TERM_DATE")
    private Date termDate;
    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp")
    private String ftypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Account
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyAcct")
    public String getCriteriaFtvftypBavlKeyAcct() {
        return criteriaFtvftypBavlKeyAcct;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ACCT
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyAcct")
    public void setCriteriaFtvftypBavlKeyAcct(String criteriaFtvftypBavlKeyAcct) {
        this.criteriaFtvftypBavlKeyAcct = criteriaFtvftypBavlKeyAcct;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypBavlKeyAcct(String criteriaFtvftypBavlKeyAcct) {
        this.criteriaFtvftypBavlKeyAcct = criteriaFtvftypBavlKeyAcct;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyProg")
    public String getCriteriaFtvftypBavlKeyProg() {
        return criteriaFtvftypBavlKeyProg;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_PROG
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyProg")
    public void setCriteriaFtvftypBavlKeyProg(String criteriaFtvftypBavlKeyProg) {
        this.criteriaFtvftypBavlKeyProg = criteriaFtvftypBavlKeyProg;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypBavlKeyProg(String criteriaFtvftypBavlKeyProg) {
        this.criteriaFtvftypBavlKeyProg = criteriaFtvftypBavlKeyProg;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypEffDate")
    public Date getCriteriaFtvftypEffDate() {
        return criteriaFtvftypEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypEffDate")
    public void setCriteriaFtvftypEffDate(Date criteriaFtvftypEffDate) {
        this.criteriaFtvftypEffDate = criteriaFtvftypEffDate;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypEffDate(Date criteriaFtvftypEffDate) {
        this.criteriaFtvftypEffDate = criteriaFtvftypEffDate;
        return this;
    }

    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalFtypCode")
    public String getInternalFtypCode() {
        return internalFtypCode;
    }

    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalFtypCode")
    public void setInternalFtypCode(String internalFtypCode) {
        this.internalFtypCode = internalFtypCode;
    }

    public FundTypeMaintenance100PutRequest withInternalFtypCode(String internalFtypCode) {
        this.internalFtypCode = internalFtypCode;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFTYP_STATUS_IND
     * 
     */
    @JsonProperty("criteria.ftvftypStatusInd")
    public String getCriteriaFtvftypStatusInd() {
        return criteriaFtvftypStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFTYP_STATUS_IND
     * 
     */
    @JsonProperty("criteria.ftvftypStatusInd")
    public void setCriteriaFtvftypStatusInd(String criteriaFtvftypStatusInd) {
        this.criteriaFtvftypStatusInd = criteriaFtvftypStatusInd;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypStatusInd(String criteriaFtvftypStatusInd) {
        this.criteriaFtvftypStatusInd = criteriaFtvftypStatusInd;
        return this;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("fundCodeCap")
    public String getFundCodeCap() {
        return fundCodeCap;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("fundCodeCap")
    public void setFundCodeCap(String fundCodeCap) {
        this.fundCodeCap = fundCodeCap;
    }

    public FundTypeMaintenance100PutRequest withFundCodeCap(String fundCodeCap) {
        this.fundCodeCap = fundCodeCap;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public FundTypeMaintenance100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FundTypeMaintenance100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypCoasCode")
    public String getCriteriaFtvftypCoasCode() {
        return criteriaFtvftypCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypCoasCode")
    public void setCriteriaFtvftypCoasCode(String criteriaFtvftypCoasCode) {
        this.criteriaFtvftypCoasCode = criteriaFtvftypCoasCode;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypCoasCode(String criteriaFtvftypCoasCode) {
        this.criteriaFtvftypCoasCode = criteriaFtvftypCoasCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ORG
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyOrg")
    public String getCriteriaFtvftypBavlKeyOrg() {
        return criteriaFtvftypBavlKeyOrg;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_ORG
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyOrg")
    public void setCriteriaFtvftypBavlKeyOrg(String criteriaFtvftypBavlKeyOrg) {
        this.criteriaFtvftypBavlKeyOrg = criteriaFtvftypBavlKeyOrg;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypBavlKeyOrg(String criteriaFtvftypBavlKeyOrg) {
        this.criteriaFtvftypBavlKeyOrg = criteriaFtvftypBavlKeyOrg;
        return this;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypFtypCode")
    public String getCriteriaFtvftypFtypCode() {
        return criteriaFtvftypFtypCode;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypFtypCode")
    public void setCriteriaFtvftypFtypCode(String criteriaFtvftypFtypCode) {
        this.criteriaFtvftypFtypCode = criteriaFtvftypFtypCode;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypFtypCode(String criteriaFtvftypFtypCode) {
        this.criteriaFtvftypFtypCode = criteriaFtvftypFtypCode;
        return this;
    }

    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypDefOverrideInd")
    public String getCriteriaFtvftypDefOverrideInd() {
        return criteriaFtvftypDefOverrideInd;
    }

    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypDefOverrideInd")
    public void setCriteriaFtvftypDefOverrideInd(String criteriaFtvftypDefOverrideInd) {
        this.criteriaFtvftypDefOverrideInd = criteriaFtvftypDefOverrideInd;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypDefOverrideInd(String criteriaFtvftypDefOverrideInd) {
        this.criteriaFtvftypDefOverrideInd = criteriaFtvftypDefOverrideInd;
        return this;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_PERIOD
     * 
     */
    @JsonProperty("criteria.ftvftypBavlPeriod")
    public String getCriteriaFtvftypBavlPeriod() {
        return criteriaFtvftypBavlPeriod;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_PERIOD
     * 
     */
    @JsonProperty("criteria.ftvftypBavlPeriod")
    public void setCriteriaFtvftypBavlPeriod(String criteriaFtvftypBavlPeriod) {
        this.criteriaFtvftypBavlPeriod = criteriaFtvftypBavlPeriod;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypBavlPeriod(String criteriaFtvftypBavlPeriod) {
        this.criteriaFtvftypBavlPeriod = criteriaFtvftypBavlPeriod;
        return this;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ftvftypActivityDate")
    public Date getCriteriaFtvftypActivityDate() {
        return criteriaFtvftypActivityDate;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVFTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ftvftypActivityDate")
    public void setCriteriaFtvftypActivityDate(Date criteriaFtvftypActivityDate) {
        this.criteriaFtvftypActivityDate = criteriaFtvftypActivityDate;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypActivityDate(Date criteriaFtvftypActivityDate) {
        this.criteriaFtvftypActivityDate = criteriaFtvftypActivityDate;
        return this;
    }

    /**
     * Encumber Multi Year Labor
     * <p>
     * Lineage reference object : FTVFTYP_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("criteria.ftvftypEncMultYrInd")
    public String getCriteriaFtvftypEncMultYrInd() {
        return criteriaFtvftypEncMultYrInd;
    }

    /**
     * Encumber Multi Year Labor
     * <p>
     * Lineage reference object : FTVFTYP_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("criteria.ftvftypEncMultYrInd")
    public void setCriteriaFtvftypEncMultYrInd(String criteriaFtvftypEncMultYrInd) {
        this.criteriaFtvftypEncMultYrInd = criteriaFtvftypEncMultYrInd;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypEncMultYrInd(String criteriaFtvftypEncMultYrInd) {
        this.criteriaFtvftypEncMultYrInd = criteriaFtvftypEncMultYrInd;
        return this;
    }

    /**
     * Severity Control
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_SEVERITY
     * 
     */
    @JsonProperty("criteria.ftvftypBavlSeverity")
    public String getCriteriaFtvftypBavlSeverity() {
        return criteriaFtvftypBavlSeverity;
    }

    /**
     * Severity Control
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_SEVERITY
     * 
     */
    @JsonProperty("criteria.ftvftypBavlSeverity")
    public void setCriteriaFtvftypBavlSeverity(String criteriaFtvftypBavlSeverity) {
        this.criteriaFtvftypBavlSeverity = criteriaFtvftypBavlSeverity;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypBavlSeverity(String criteriaFtvftypBavlSeverity) {
        this.criteriaFtvftypBavlSeverity = criteriaFtvftypBavlSeverity;
        return this;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("criteria.ftvftypAcctCodeCap")
    public String getCriteriaFtvftypAcctCodeCap() {
        return criteriaFtvftypAcctCodeCap;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("criteria.ftvftypAcctCodeCap")
    public void setCriteriaFtvftypAcctCodeCap(String criteriaFtvftypAcctCodeCap) {
        this.criteriaFtvftypAcctCodeCap = criteriaFtvftypAcctCodeCap;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypAcctCodeCap(String criteriaFtvftypAcctCodeCap) {
        this.criteriaFtvftypAcctCodeCap = criteriaFtvftypAcctCodeCap;
        return this;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("ftypCodePred")
    public String getFtypCodePred() {
        return ftypCodePred;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("ftypCodePred")
    public void setFtypCodePred(String ftypCodePred) {
        this.ftypCodePred = ftypCodePred;
    }

    public FundTypeMaintenance100PutRequest withFtypCodePred(String ftypCodePred) {
        this.ftypCodePred = ftypCodePred;
        return this;
    }

    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("overrideInd")
    public String getOverrideInd() {
        return overrideInd;
    }

    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("overrideInd")
    public void setOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
    }

    public FundTypeMaintenance100PutRequest withOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("criteria.ftvftypTermDate")
    public Date getCriteriaFtvftypTermDate() {
        return criteriaFtvftypTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("criteria.ftvftypTermDate")
    public void setCriteriaFtvftypTermDate(Date criteriaFtvftypTermDate) {
        this.criteriaFtvftypTermDate = criteriaFtvftypTermDate;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypTermDate(Date criteriaFtvftypTermDate) {
        this.criteriaFtvftypTermDate = criteriaFtvftypTermDate;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypTitle")
    public String getCriteriaFtvftypTitle() {
        return criteriaFtvftypTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypTitle")
    public void setCriteriaFtvftypTitle(String criteriaFtvftypTitle) {
        this.criteriaFtvftypTitle = criteriaFtvftypTitle;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypTitle(String criteriaFtvftypTitle) {
        this.criteriaFtvftypTitle = criteriaFtvftypTitle;
        return this;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("criteria.ftvftypFundCodeCap")
    public String getCriteriaFtvftypFundCodeCap() {
        return criteriaFtvftypFundCodeCap;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("criteria.ftvftypFundCodeCap")
    public void setCriteriaFtvftypFundCodeCap(String criteriaFtvftypFundCodeCap) {
        this.criteriaFtvftypFundCodeCap = criteriaFtvftypFundCodeCap;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypFundCodeCap(String criteriaFtvftypFundCodeCap) {
        this.criteriaFtvftypFundCodeCap = criteriaFtvftypFundCodeCap;
        return this;
    }

    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypInternalFtypCode")
    public String getCriteriaFtvftypInternalFtypCode() {
        return criteriaFtvftypInternalFtypCode;
    }

    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftvftypInternalFtypCode")
    public void setCriteriaFtvftypInternalFtypCode(String criteriaFtvftypInternalFtypCode) {
        this.criteriaFtvftypInternalFtypCode = criteriaFtvftypInternalFtypCode;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypInternalFtypCode(String criteriaFtvftypInternalFtypCode) {
        this.criteriaFtvftypInternalFtypCode = criteriaFtvftypInternalFtypCode;
        return this;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("criteria.ftvftypFtypCodePred")
    public String getCriteriaFtvftypFtypCodePred() {
        return criteriaFtvftypFtypCodePred;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("criteria.ftvftypFtypCodePred")
    public void setCriteriaFtvftypFtypCodePred(String criteriaFtvftypFtypCodePred) {
        this.criteriaFtvftypFtypCodePred = criteriaFtvftypFtypCodePred;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypFtypCodePred(String criteriaFtvftypFtypCodePred) {
        this.criteriaFtvftypFtypCodePred = criteriaFtvftypFtypCodePred;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyFund")
    public String getCriteriaFtvftypBavlKeyFund() {
        return criteriaFtvftypBavlKeyFund;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFTYP_BAVL_KEY_FUND
     * 
     */
    @JsonProperty("criteria.ftvftypBavlKeyFund")
    public void setCriteriaFtvftypBavlKeyFund(String criteriaFtvftypBavlKeyFund) {
        this.criteriaFtvftypBavlKeyFund = criteriaFtvftypBavlKeyFund;
    }

    public FundTypeMaintenance100PutRequest withCriteriaFtvftypBavlKeyFund(String criteriaFtvftypBavlKeyFund) {
        this.criteriaFtvftypBavlKeyFund = criteriaFtvftypBavlKeyFund;
        return this;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("acctCodeCap")
    public String getAcctCodeCap() {
        return acctCodeCap;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("acctCodeCap")
    public void setAcctCodeCap(String acctCodeCap) {
        this.acctCodeCap = acctCodeCap;
    }

    public FundTypeMaintenance100PutRequest withAcctCodeCap(String acctCodeCap) {
        this.acctCodeCap = acctCodeCap;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public FundTypeMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public String getFtypCode() {
        return ftypCode;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public void setFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
    }

    public FundTypeMaintenance100PutRequest withFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
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

    public FundTypeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundTypeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaFtvftypBavlKeyAcct");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlKeyAcct == null)?"<null>":this.criteriaFtvftypBavlKeyAcct));
        sb.append(',');
        sb.append("criteriaFtvftypBavlKeyProg");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlKeyProg == null)?"<null>":this.criteriaFtvftypBavlKeyProg));
        sb.append(',');
        sb.append("criteriaFtvftypEffDate");
        sb.append('=');
        sb.append(((this.criteriaFtvftypEffDate == null)?"<null>":this.criteriaFtvftypEffDate));
        sb.append(',');
        sb.append("internalFtypCode");
        sb.append('=');
        sb.append(((this.internalFtypCode == null)?"<null>":this.internalFtypCode));
        sb.append(',');
        sb.append("criteriaFtvftypStatusInd");
        sb.append('=');
        sb.append(((this.criteriaFtvftypStatusInd == null)?"<null>":this.criteriaFtvftypStatusInd));
        sb.append(',');
        sb.append("fundCodeCap");
        sb.append('=');
        sb.append(((this.fundCodeCap == null)?"<null>":this.fundCodeCap));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("criteriaFtvftypCoasCode");
        sb.append('=');
        sb.append(((this.criteriaFtvftypCoasCode == null)?"<null>":this.criteriaFtvftypCoasCode));
        sb.append(',');
        sb.append("criteriaFtvftypBavlKeyOrg");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlKeyOrg == null)?"<null>":this.criteriaFtvftypBavlKeyOrg));
        sb.append(',');
        sb.append("criteriaFtvftypFtypCode");
        sb.append('=');
        sb.append(((this.criteriaFtvftypFtypCode == null)?"<null>":this.criteriaFtvftypFtypCode));
        sb.append(',');
        sb.append("criteriaFtvftypDefOverrideInd");
        sb.append('=');
        sb.append(((this.criteriaFtvftypDefOverrideInd == null)?"<null>":this.criteriaFtvftypDefOverrideInd));
        sb.append(',');
        sb.append("criteriaFtvftypBavlPeriod");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlPeriod == null)?"<null>":this.criteriaFtvftypBavlPeriod));
        sb.append(',');
        sb.append("criteriaFtvftypActivityDate");
        sb.append('=');
        sb.append(((this.criteriaFtvftypActivityDate == null)?"<null>":this.criteriaFtvftypActivityDate));
        sb.append(',');
        sb.append("criteriaFtvftypEncMultYrInd");
        sb.append('=');
        sb.append(((this.criteriaFtvftypEncMultYrInd == null)?"<null>":this.criteriaFtvftypEncMultYrInd));
        sb.append(',');
        sb.append("criteriaFtvftypBavlSeverity");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlSeverity == null)?"<null>":this.criteriaFtvftypBavlSeverity));
        sb.append(',');
        sb.append("criteriaFtvftypAcctCodeCap");
        sb.append('=');
        sb.append(((this.criteriaFtvftypAcctCodeCap == null)?"<null>":this.criteriaFtvftypAcctCodeCap));
        sb.append(',');
        sb.append("ftypCodePred");
        sb.append('=');
        sb.append(((this.ftypCodePred == null)?"<null>":this.ftypCodePred));
        sb.append(',');
        sb.append("overrideInd");
        sb.append('=');
        sb.append(((this.overrideInd == null)?"<null>":this.overrideInd));
        sb.append(',');
        sb.append("criteriaFtvftypTermDate");
        sb.append('=');
        sb.append(((this.criteriaFtvftypTermDate == null)?"<null>":this.criteriaFtvftypTermDate));
        sb.append(',');
        sb.append("criteriaFtvftypTitle");
        sb.append('=');
        sb.append(((this.criteriaFtvftypTitle == null)?"<null>":this.criteriaFtvftypTitle));
        sb.append(',');
        sb.append("criteriaFtvftypFundCodeCap");
        sb.append('=');
        sb.append(((this.criteriaFtvftypFundCodeCap == null)?"<null>":this.criteriaFtvftypFundCodeCap));
        sb.append(',');
        sb.append("criteriaFtvftypInternalFtypCode");
        sb.append('=');
        sb.append(((this.criteriaFtvftypInternalFtypCode == null)?"<null>":this.criteriaFtvftypInternalFtypCode));
        sb.append(',');
        sb.append("criteriaFtvftypFtypCodePred");
        sb.append('=');
        sb.append(((this.criteriaFtvftypFtypCodePred == null)?"<null>":this.criteriaFtvftypFtypCodePred));
        sb.append(',');
        sb.append("criteriaFtvftypBavlKeyFund");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlKeyFund == null)?"<null>":this.criteriaFtvftypBavlKeyFund));
        sb.append(',');
        sb.append("acctCodeCap");
        sb.append('=');
        sb.append(((this.acctCodeCap == null)?"<null>":this.acctCodeCap));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("ftypCode");
        sb.append('=');
        sb.append(((this.ftypCode == null)?"<null>":this.ftypCode));
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
        result = ((result* 31)+((this.criteriaFtvftypBavlKeyAcct == null)? 0 :this.criteriaFtvftypBavlKeyAcct.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlPeriod == null)? 0 :this.criteriaFtvftypBavlPeriod.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlKeyProg == null)? 0 :this.criteriaFtvftypBavlKeyProg.hashCode()));
        result = ((result* 31)+((this.internalFtypCode == null)? 0 :this.internalFtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlSeverity == null)? 0 :this.criteriaFtvftypBavlSeverity.hashCode()));
        result = ((result* 31)+((this.fundCodeCap == null)? 0 :this.fundCodeCap.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypTermDate == null)? 0 :this.criteriaFtvftypTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypFtypCode == null)? 0 :this.criteriaFtvftypFtypCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlKeyFund == null)? 0 :this.criteriaFtvftypBavlKeyFund.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypDefOverrideInd == null)? 0 :this.criteriaFtvftypDefOverrideInd.hashCode()));
        result = ((result* 31)+((this.ftypCodePred == null)? 0 :this.ftypCodePred.hashCode()));
        result = ((result* 31)+((this.overrideInd == null)? 0 :this.overrideInd.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypFundCodeCap == null)? 0 :this.criteriaFtvftypFundCodeCap.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypInternalFtypCode == null)? 0 :this.criteriaFtvftypInternalFtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypCoasCode == null)? 0 :this.criteriaFtvftypCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypActivityDate == null)? 0 :this.criteriaFtvftypActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypEncMultYrInd == null)? 0 :this.criteriaFtvftypEncMultYrInd.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypEffDate == null)? 0 :this.criteriaFtvftypEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypTitle == null)? 0 :this.criteriaFtvftypTitle.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypStatusInd == null)? 0 :this.criteriaFtvftypStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlKeyOrg == null)? 0 :this.criteriaFtvftypBavlKeyOrg.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypFtypCodePred == null)? 0 :this.criteriaFtvftypFtypCodePred.hashCode()));
        result = ((result* 31)+((this.acctCodeCap == null)? 0 :this.acctCodeCap.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypAcctCodeCap == null)? 0 :this.criteriaFtvftypAcctCodeCap.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.ftypCode == null)? 0 :this.ftypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundTypeMaintenance100PutRequest) == false) {
            return false;
        }
        FundTypeMaintenance100PutRequest rhs = ((FundTypeMaintenance100PutRequest) other);
        return ((((((((((((((((((((((((((((((this.criteriaFtvftypBavlKeyAcct == rhs.criteriaFtvftypBavlKeyAcct)||((this.criteriaFtvftypBavlKeyAcct!= null)&&this.criteriaFtvftypBavlKeyAcct.equals(rhs.criteriaFtvftypBavlKeyAcct)))&&((this.criteriaFtvftypBavlPeriod == rhs.criteriaFtvftypBavlPeriod)||((this.criteriaFtvftypBavlPeriod!= null)&&this.criteriaFtvftypBavlPeriod.equals(rhs.criteriaFtvftypBavlPeriod))))&&((this.criteriaFtvftypBavlKeyProg == rhs.criteriaFtvftypBavlKeyProg)||((this.criteriaFtvftypBavlKeyProg!= null)&&this.criteriaFtvftypBavlKeyProg.equals(rhs.criteriaFtvftypBavlKeyProg))))&&((this.internalFtypCode == rhs.internalFtypCode)||((this.internalFtypCode!= null)&&this.internalFtypCode.equals(rhs.internalFtypCode))))&&((this.criteriaFtvftypBavlSeverity == rhs.criteriaFtvftypBavlSeverity)||((this.criteriaFtvftypBavlSeverity!= null)&&this.criteriaFtvftypBavlSeverity.equals(rhs.criteriaFtvftypBavlSeverity))))&&((this.fundCodeCap == rhs.fundCodeCap)||((this.fundCodeCap!= null)&&this.fundCodeCap.equals(rhs.fundCodeCap))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.criteriaFtvftypTermDate == rhs.criteriaFtvftypTermDate)||((this.criteriaFtvftypTermDate!= null)&&this.criteriaFtvftypTermDate.equals(rhs.criteriaFtvftypTermDate))))&&((this.criteriaFtvftypFtypCode == rhs.criteriaFtvftypFtypCode)||((this.criteriaFtvftypFtypCode!= null)&&this.criteriaFtvftypFtypCode.equals(rhs.criteriaFtvftypFtypCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.criteriaFtvftypBavlKeyFund == rhs.criteriaFtvftypBavlKeyFund)||((this.criteriaFtvftypBavlKeyFund!= null)&&this.criteriaFtvftypBavlKeyFund.equals(rhs.criteriaFtvftypBavlKeyFund))))&&((this.criteriaFtvftypDefOverrideInd == rhs.criteriaFtvftypDefOverrideInd)||((this.criteriaFtvftypDefOverrideInd!= null)&&this.criteriaFtvftypDefOverrideInd.equals(rhs.criteriaFtvftypDefOverrideInd))))&&((this.ftypCodePred == rhs.ftypCodePred)||((this.ftypCodePred!= null)&&this.ftypCodePred.equals(rhs.ftypCodePred))))&&((this.overrideInd == rhs.overrideInd)||((this.overrideInd!= null)&&this.overrideInd.equals(rhs.overrideInd))))&&((this.criteriaFtvftypFundCodeCap == rhs.criteriaFtvftypFundCodeCap)||((this.criteriaFtvftypFundCodeCap!= null)&&this.criteriaFtvftypFundCodeCap.equals(rhs.criteriaFtvftypFundCodeCap))))&&((this.criteriaFtvftypInternalFtypCode == rhs.criteriaFtvftypInternalFtypCode)||((this.criteriaFtvftypInternalFtypCode!= null)&&this.criteriaFtvftypInternalFtypCode.equals(rhs.criteriaFtvftypInternalFtypCode))))&&((this.criteriaFtvftypCoasCode == rhs.criteriaFtvftypCoasCode)||((this.criteriaFtvftypCoasCode!= null)&&this.criteriaFtvftypCoasCode.equals(rhs.criteriaFtvftypCoasCode))))&&((this.criteriaFtvftypActivityDate == rhs.criteriaFtvftypActivityDate)||((this.criteriaFtvftypActivityDate!= null)&&this.criteriaFtvftypActivityDate.equals(rhs.criteriaFtvftypActivityDate))))&&((this.criteriaFtvftypEncMultYrInd == rhs.criteriaFtvftypEncMultYrInd)||((this.criteriaFtvftypEncMultYrInd!= null)&&this.criteriaFtvftypEncMultYrInd.equals(rhs.criteriaFtvftypEncMultYrInd))))&&((this.criteriaFtvftypEffDate == rhs.criteriaFtvftypEffDate)||((this.criteriaFtvftypEffDate!= null)&&this.criteriaFtvftypEffDate.equals(rhs.criteriaFtvftypEffDate))))&&((this.criteriaFtvftypTitle == rhs.criteriaFtvftypTitle)||((this.criteriaFtvftypTitle!= null)&&this.criteriaFtvftypTitle.equals(rhs.criteriaFtvftypTitle))))&&((this.criteriaFtvftypStatusInd == rhs.criteriaFtvftypStatusInd)||((this.criteriaFtvftypStatusInd!= null)&&this.criteriaFtvftypStatusInd.equals(rhs.criteriaFtvftypStatusInd))))&&((this.criteriaFtvftypBavlKeyOrg == rhs.criteriaFtvftypBavlKeyOrg)||((this.criteriaFtvftypBavlKeyOrg!= null)&&this.criteriaFtvftypBavlKeyOrg.equals(rhs.criteriaFtvftypBavlKeyOrg))))&&((this.criteriaFtvftypFtypCodePred == rhs.criteriaFtvftypFtypCodePred)||((this.criteriaFtvftypFtypCodePred!= null)&&this.criteriaFtvftypFtypCodePred.equals(rhs.criteriaFtvftypFtypCodePred))))&&((this.acctCodeCap == rhs.acctCodeCap)||((this.acctCodeCap!= null)&&this.acctCodeCap.equals(rhs.acctCodeCap))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFtvftypAcctCodeCap == rhs.criteriaFtvftypAcctCodeCap)||((this.criteriaFtvftypAcctCodeCap!= null)&&this.criteriaFtvftypAcctCodeCap.equals(rhs.criteriaFtvftypAcctCodeCap))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.ftypCode == rhs.ftypCode)||((this.ftypCode!= null)&&this.ftypCode.equals(rhs.ftypCode))));
    }

}
