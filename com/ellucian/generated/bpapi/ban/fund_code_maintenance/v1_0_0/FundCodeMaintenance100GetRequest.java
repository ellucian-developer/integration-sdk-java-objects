
package com.ellucian.generated.bpapi.ban.fund_code_maintenance.v1_0_0;

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
    "criteria.acctCodeAccr",
    "criteria.actvCodeDef",
    "criteria.propCode",
    "criteria.statusInd",
    "criteria.srcCapSameInd",
    "criteria.ftypCode",
    "criteria.fbalInd",
    "criteria.restInd",
    "criteria.termDate",
    "criteria.orgnCodeDef",
    "criteria.locnCodeDef",
    "activityDate",
    "criteria.dataEntryInd",
    "criteria.effCertAllocInd",
    "criteria.grntCode",
    "criteria.effCertRequiredInd",
    "criteria.coasCode",
    "criteria.cashReceiptBankCode",
    "criteria.fundCodePlant",
    "criteria.effDate",
    "criteria.fundCode",
    "criteria.acctCodeRev",
    "criteria.title",
    "criteria.acctCodePlant",
    "criteria.netAssetClass",
    "criteria.expendEndDate",
    "criteria.fundCodePred",
    "criteria.bankCode",
    "criteria.progCodeDef"
})
@Generated("jsonschema2pojo")
public class FundCodeMaintenance100GetRequest {

    /**
     * Unbilled AR Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ACCR
     * 
     */
    @JsonProperty("criteria.acctCodeAccr")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_ACCR")
    private String criteriaAcctCodeAccr;
    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("criteria.actvCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACTV_CODE_DEF")
    private String criteriaActvCodeDef;
    /**
     * Proposal
     * <p>
     * Lineage reference object : FTVFUND_PROP_CODE
     * 
     */
    @JsonProperty("criteria.propCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROP_CODE")
    private String criteriaPropCode;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Capitalization Fund Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.srcCapSameInd")
    private String criteriaSrcCapSameInd;
    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp")
    private String criteriaFtypCode;
    /**
     * Multiple Fund Balance Indicator
     * <p>
     * Lineage reference object : FTVFUND_FBAL_IND
     * 
     */
    @JsonProperty("criteria.fbalInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FBAL_IND")
    private String criteriaFbalInd;
    /**
     * Restriction Indicator
     * <p>
     * Lineage reference object : FTVFUND_REST_IND
     * 
     */
    @JsonProperty("criteria.restInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_REST_IND")
    private String criteriaRestInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFUND_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.orgnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ORGN_CODE_DEF")
    private String criteriaOrgnCodeDef;
    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.locnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_LOCN_CODE_DEF")
    private String criteriaLocnCodeDef;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVFUND_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_DATA_ENTRY_IND")
    private String criteriaDataEntryInd;
    /**
     * Fund Requires Effort Allocation
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND
     * 
     */
    @JsonProperty("criteria.effCertAllocInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND")
    private String criteriaEffCertAllocInd;
    /**
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("criteria.grntCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_GRNT_CODE")
    private String criteriaGrntCode;
    /**
     * Fund Requires Effort Certification
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("criteria.effCertRequiredInd")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND")
    private String criteriaEffCertRequiredInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.cashReceiptBankCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String criteriaCashReceiptBankCode;
    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.fundCodePlant")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_PLANT")
    private String criteriaFundCodePlant;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE")
    private String criteriaFundCode;
    /**
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("criteria.acctCodeRev")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_REV")
    private String criteriaAcctCodeRev;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFUND_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_TITLE")
    private String criteriaTitle;
    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.acctCodePlant")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACCT_CODE_PLANT")
    private String criteriaAcctCodePlant;
    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("criteria.netAssetClass")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_NET_ASSET_CLASS")
    private String criteriaNetAssetClass;
    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FTVFUND_EXPEND_END_DATE
     * 
     */
    @JsonProperty("criteria.expendEndDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_EXPEND_END_DATE")
    private Date criteriaExpendEndDate;
    /**
     * Predecessor Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PRED
     * 
     */
    @JsonProperty("criteria.fundCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_FUND_CODE_PRED")
    private String criteriaFundCodePred;
    /**
     * Bank
     * <p>
     * Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String criteriaBankCode;
    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("criteria.progCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_PROG_CODE_DEF")
    private String criteriaProgCodeDef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Unbilled AR Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ACCR
     * 
     */
    @JsonProperty("criteria.acctCodeAccr")
    public String getCriteriaAcctCodeAccr() {
        return criteriaAcctCodeAccr;
    }

    /**
     * Unbilled AR Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_ACCR
     * 
     */
    @JsonProperty("criteria.acctCodeAccr")
    public void setCriteriaAcctCodeAccr(String criteriaAcctCodeAccr) {
        this.criteriaAcctCodeAccr = criteriaAcctCodeAccr;
    }

    public FundCodeMaintenance100GetRequest withCriteriaAcctCodeAccr(String criteriaAcctCodeAccr) {
        this.criteriaAcctCodeAccr = criteriaAcctCodeAccr;
        return this;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("criteria.actvCodeDef")
    public String getCriteriaActvCodeDef() {
        return criteriaActvCodeDef;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVFUND_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("criteria.actvCodeDef")
    public void setCriteriaActvCodeDef(String criteriaActvCodeDef) {
        this.criteriaActvCodeDef = criteriaActvCodeDef;
    }

    public FundCodeMaintenance100GetRequest withCriteriaActvCodeDef(String criteriaActvCodeDef) {
        this.criteriaActvCodeDef = criteriaActvCodeDef;
        return this;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FTVFUND_PROP_CODE
     * 
     */
    @JsonProperty("criteria.propCode")
    public String getCriteriaPropCode() {
        return criteriaPropCode;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FTVFUND_PROP_CODE
     * 
     */
    @JsonProperty("criteria.propCode")
    public void setCriteriaPropCode(String criteriaPropCode) {
        this.criteriaPropCode = criteriaPropCode;
    }

    public FundCodeMaintenance100GetRequest withCriteriaPropCode(String criteriaPropCode) {
        this.criteriaPropCode = criteriaPropCode;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVFUND_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public FundCodeMaintenance100GetRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Capitalization Fund Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.srcCapSameInd")
    public String getCriteriaSrcCapSameInd() {
        return criteriaSrcCapSameInd;
    }

    /**
     * Capitalization Fund Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.srcCapSameInd")
    public void setCriteriaSrcCapSameInd(String criteriaSrcCapSameInd) {
        this.criteriaSrcCapSameInd = criteriaSrcCapSameInd;
    }

    public FundCodeMaintenance100GetRequest withCriteriaSrcCapSameInd(String criteriaSrcCapSameInd) {
        this.criteriaSrcCapSameInd = criteriaSrcCapSameInd;
        return this;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftypCode")
    public String getCriteriaFtypCode() {
        return criteriaFtypCode;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFUND_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.ftypCode")
    public void setCriteriaFtypCode(String criteriaFtypCode) {
        this.criteriaFtypCode = criteriaFtypCode;
    }

    public FundCodeMaintenance100GetRequest withCriteriaFtypCode(String criteriaFtypCode) {
        this.criteriaFtypCode = criteriaFtypCode;
        return this;
    }

    /**
     * Multiple Fund Balance Indicator
     * <p>
     * Lineage reference object : FTVFUND_FBAL_IND
     * 
     */
    @JsonProperty("criteria.fbalInd")
    public String getCriteriaFbalInd() {
        return criteriaFbalInd;
    }

    /**
     * Multiple Fund Balance Indicator
     * <p>
     * Lineage reference object : FTVFUND_FBAL_IND
     * 
     */
    @JsonProperty("criteria.fbalInd")
    public void setCriteriaFbalInd(String criteriaFbalInd) {
        this.criteriaFbalInd = criteriaFbalInd;
    }

    public FundCodeMaintenance100GetRequest withCriteriaFbalInd(String criteriaFbalInd) {
        this.criteriaFbalInd = criteriaFbalInd;
        return this;
    }

    /**
     * Restriction Indicator
     * <p>
     * Lineage reference object : FTVFUND_REST_IND
     * 
     */
    @JsonProperty("criteria.restInd")
    public String getCriteriaRestInd() {
        return criteriaRestInd;
    }

    /**
     * Restriction Indicator
     * <p>
     * Lineage reference object : FTVFUND_REST_IND
     * 
     */
    @JsonProperty("criteria.restInd")
    public void setCriteriaRestInd(String criteriaRestInd) {
        this.criteriaRestInd = criteriaRestInd;
    }

    public FundCodeMaintenance100GetRequest withCriteriaRestInd(String criteriaRestInd) {
        this.criteriaRestInd = criteriaRestInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFUND_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFUND_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public FundCodeMaintenance100GetRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.orgnCodeDef")
    public String getCriteriaOrgnCodeDef() {
        return criteriaOrgnCodeDef;
    }

    /**
     * Default Organization
     * <p>
     * Lineage reference object : FTVFUND_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.orgnCodeDef")
    public void setCriteriaOrgnCodeDef(String criteriaOrgnCodeDef) {
        this.criteriaOrgnCodeDef = criteriaOrgnCodeDef;
    }

    public FundCodeMaintenance100GetRequest withCriteriaOrgnCodeDef(String criteriaOrgnCodeDef) {
        this.criteriaOrgnCodeDef = criteriaOrgnCodeDef;
        return this;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.locnCodeDef")
    public String getCriteriaLocnCodeDef() {
        return criteriaLocnCodeDef;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVFUND_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.locnCodeDef")
    public void setCriteriaLocnCodeDef(String criteriaLocnCodeDef) {
        this.criteriaLocnCodeDef = criteriaLocnCodeDef;
    }

    public FundCodeMaintenance100GetRequest withCriteriaLocnCodeDef(String criteriaLocnCodeDef) {
        this.criteriaLocnCodeDef = criteriaLocnCodeDef;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FundCodeMaintenance100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVFUND_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public String getCriteriaDataEntryInd() {
        return criteriaDataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVFUND_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public void setCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
    }

    public FundCodeMaintenance100GetRequest withCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
        return this;
    }

    /**
     * Fund Requires Effort Allocation
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND
     * 
     */
    @JsonProperty("criteria.effCertAllocInd")
    public String getCriteriaEffCertAllocInd() {
        return criteriaEffCertAllocInd;
    }

    /**
     * Fund Requires Effort Allocation
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_ALLOC_IND
     * 
     */
    @JsonProperty("criteria.effCertAllocInd")
    public void setCriteriaEffCertAllocInd(String criteriaEffCertAllocInd) {
        this.criteriaEffCertAllocInd = criteriaEffCertAllocInd;
    }

    public FundCodeMaintenance100GetRequest withCriteriaEffCertAllocInd(String criteriaEffCertAllocInd) {
        this.criteriaEffCertAllocInd = criteriaEffCertAllocInd;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("criteria.grntCode")
    public String getCriteriaGrntCode() {
        return criteriaGrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FTVFUND_GRNT_CODE
     * 
     */
    @JsonProperty("criteria.grntCode")
    public void setCriteriaGrntCode(String criteriaGrntCode) {
        this.criteriaGrntCode = criteriaGrntCode;
    }

    public FundCodeMaintenance100GetRequest withCriteriaGrntCode(String criteriaGrntCode) {
        this.criteriaGrntCode = criteriaGrntCode;
        return this;
    }

    /**
     * Fund Requires Effort Certification
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("criteria.effCertRequiredInd")
    public String getCriteriaEffCertRequiredInd() {
        return criteriaEffCertRequiredInd;
    }

    /**
     * Fund Requires Effort Certification
     * <p>
     * Lineage reference object : FTVFUND_EFF_CERT_REQUIRED_IND
     * 
     */
    @JsonProperty("criteria.effCertRequiredInd")
    public void setCriteriaEffCertRequiredInd(String criteriaEffCertRequiredInd) {
        this.criteriaEffCertRequiredInd = criteriaEffCertRequiredInd;
    }

    public FundCodeMaintenance100GetRequest withCriteriaEffCertRequiredInd(String criteriaEffCertRequiredInd) {
        this.criteriaEffCertRequiredInd = criteriaEffCertRequiredInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public FundCodeMaintenance100GetRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.cashReceiptBankCode")
    public String getCriteriaCashReceiptBankCode() {
        return criteriaCashReceiptBankCode;
    }

    /**
     * Cash Receipt Bank Code
     * <p>
     * Lineage reference object : FTVFUND_CASH_RECEIPT_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.cashReceiptBankCode")
    public void setCriteriaCashReceiptBankCode(String criteriaCashReceiptBankCode) {
        this.criteriaCashReceiptBankCode = criteriaCashReceiptBankCode;
    }

    public FundCodeMaintenance100GetRequest withCriteriaCashReceiptBankCode(String criteriaCashReceiptBankCode) {
        this.criteriaCashReceiptBankCode = criteriaCashReceiptBankCode;
        return this;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.fundCodePlant")
    public String getCriteriaFundCodePlant() {
        return criteriaFundCodePlant;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.fundCodePlant")
    public void setCriteriaFundCodePlant(String criteriaFundCodePlant) {
        this.criteriaFundCodePlant = criteriaFundCodePlant;
    }

    public FundCodeMaintenance100GetRequest withCriteriaFundCodePlant(String criteriaFundCodePlant) {
        this.criteriaFundCodePlant = criteriaFundCodePlant;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public FundCodeMaintenance100GetRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public FundCodeMaintenance100GetRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    /**
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("criteria.acctCodeRev")
    public String getCriteriaAcctCodeRev() {
        return criteriaAcctCodeRev;
    }

    /**
     * Revenue Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_REV
     * 
     */
    @JsonProperty("criteria.acctCodeRev")
    public void setCriteriaAcctCodeRev(String criteriaAcctCodeRev) {
        this.criteriaAcctCodeRev = criteriaAcctCodeRev;
    }

    public FundCodeMaintenance100GetRequest withCriteriaAcctCodeRev(String criteriaAcctCodeRev) {
        this.criteriaAcctCodeRev = criteriaAcctCodeRev;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFUND_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFUND_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public FundCodeMaintenance100GetRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.acctCodePlant")
    public String getCriteriaAcctCodePlant() {
        return criteriaAcctCodePlant;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFUND_ACCT_CODE_PLANT
     * 
     */
    @JsonProperty("criteria.acctCodePlant")
    public void setCriteriaAcctCodePlant(String criteriaAcctCodePlant) {
        this.criteriaAcctCodePlant = criteriaAcctCodePlant;
    }

    public FundCodeMaintenance100GetRequest withCriteriaAcctCodePlant(String criteriaAcctCodePlant) {
        this.criteriaAcctCodePlant = criteriaAcctCodePlant;
        return this;
    }

    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("criteria.netAssetClass")
    public String getCriteriaNetAssetClass() {
        return criteriaNetAssetClass;
    }

    /**
     * Lineage reference object : FTVFUND_NET_ASSET_CLASS
     * 
     */
    @JsonProperty("criteria.netAssetClass")
    public void setCriteriaNetAssetClass(String criteriaNetAssetClass) {
        this.criteriaNetAssetClass = criteriaNetAssetClass;
    }

    public FundCodeMaintenance100GetRequest withCriteriaNetAssetClass(String criteriaNetAssetClass) {
        this.criteriaNetAssetClass = criteriaNetAssetClass;
        return this;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FTVFUND_EXPEND_END_DATE
     * 
     */
    @JsonProperty("criteria.expendEndDate")
    public Date getCriteriaExpendEndDate() {
        return criteriaExpendEndDate;
    }

    /**
     * Expenditure End Date
     * <p>
     * Lineage reference object : FTVFUND_EXPEND_END_DATE
     * 
     */
    @JsonProperty("criteria.expendEndDate")
    public void setCriteriaExpendEndDate(Date criteriaExpendEndDate) {
        this.criteriaExpendEndDate = criteriaExpendEndDate;
    }

    public FundCodeMaintenance100GetRequest withCriteriaExpendEndDate(Date criteriaExpendEndDate) {
        this.criteriaExpendEndDate = criteriaExpendEndDate;
        return this;
    }

    /**
     * Predecessor Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PRED
     * 
     */
    @JsonProperty("criteria.fundCodePred")
    public String getCriteriaFundCodePred() {
        return criteriaFundCodePred;
    }

    /**
     * Predecessor Fund
     * <p>
     * Lineage reference object : FTVFUND_FUND_CODE_PRED
     * 
     */
    @JsonProperty("criteria.fundCodePred")
    public void setCriteriaFundCodePred(String criteriaFundCodePred) {
        this.criteriaFundCodePred = criteriaFundCodePred;
    }

    public FundCodeMaintenance100GetRequest withCriteriaFundCodePred(String criteriaFundCodePred) {
        this.criteriaFundCodePred = criteriaFundCodePred;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    public String getCriteriaBankCode() {
        return criteriaBankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FTVFUND_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("criteria.bankCode")
    public void setCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
    }

    public FundCodeMaintenance100GetRequest withCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
        return this;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("criteria.progCodeDef")
    public String getCriteriaProgCodeDef() {
        return criteriaProgCodeDef;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVFUND_PROG_CODE_DEF
     * 
     */
    @JsonProperty("criteria.progCodeDef")
    public void setCriteriaProgCodeDef(String criteriaProgCodeDef) {
        this.criteriaProgCodeDef = criteriaProgCodeDef;
    }

    public FundCodeMaintenance100GetRequest withCriteriaProgCodeDef(String criteriaProgCodeDef) {
        this.criteriaProgCodeDef = criteriaProgCodeDef;
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

    public FundCodeMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundCodeMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaAcctCodeAccr");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeAccr == null)?"<null>":this.criteriaAcctCodeAccr));
        sb.append(',');
        sb.append("criteriaActvCodeDef");
        sb.append('=');
        sb.append(((this.criteriaActvCodeDef == null)?"<null>":this.criteriaActvCodeDef));
        sb.append(',');
        sb.append("criteriaPropCode");
        sb.append('=');
        sb.append(((this.criteriaPropCode == null)?"<null>":this.criteriaPropCode));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaSrcCapSameInd");
        sb.append('=');
        sb.append(((this.criteriaSrcCapSameInd == null)?"<null>":this.criteriaSrcCapSameInd));
        sb.append(',');
        sb.append("criteriaFtypCode");
        sb.append('=');
        sb.append(((this.criteriaFtypCode == null)?"<null>":this.criteriaFtypCode));
        sb.append(',');
        sb.append("criteriaFbalInd");
        sb.append('=');
        sb.append(((this.criteriaFbalInd == null)?"<null>":this.criteriaFbalInd));
        sb.append(',');
        sb.append("criteriaRestInd");
        sb.append('=');
        sb.append(((this.criteriaRestInd == null)?"<null>":this.criteriaRestInd));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaOrgnCodeDef");
        sb.append('=');
        sb.append(((this.criteriaOrgnCodeDef == null)?"<null>":this.criteriaOrgnCodeDef));
        sb.append(',');
        sb.append("criteriaLocnCodeDef");
        sb.append('=');
        sb.append(((this.criteriaLocnCodeDef == null)?"<null>":this.criteriaLocnCodeDef));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("criteriaDataEntryInd");
        sb.append('=');
        sb.append(((this.criteriaDataEntryInd == null)?"<null>":this.criteriaDataEntryInd));
        sb.append(',');
        sb.append("criteriaEffCertAllocInd");
        sb.append('=');
        sb.append(((this.criteriaEffCertAllocInd == null)?"<null>":this.criteriaEffCertAllocInd));
        sb.append(',');
        sb.append("criteriaGrntCode");
        sb.append('=');
        sb.append(((this.criteriaGrntCode == null)?"<null>":this.criteriaGrntCode));
        sb.append(',');
        sb.append("criteriaEffCertRequiredInd");
        sb.append('=');
        sb.append(((this.criteriaEffCertRequiredInd == null)?"<null>":this.criteriaEffCertRequiredInd));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaCashReceiptBankCode");
        sb.append('=');
        sb.append(((this.criteriaCashReceiptBankCode == null)?"<null>":this.criteriaCashReceiptBankCode));
        sb.append(',');
        sb.append("criteriaFundCodePlant");
        sb.append('=');
        sb.append(((this.criteriaFundCodePlant == null)?"<null>":this.criteriaFundCodePlant));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("criteriaAcctCodeRev");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeRev == null)?"<null>":this.criteriaAcctCodeRev));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("criteriaAcctCodePlant");
        sb.append('=');
        sb.append(((this.criteriaAcctCodePlant == null)?"<null>":this.criteriaAcctCodePlant));
        sb.append(',');
        sb.append("criteriaNetAssetClass");
        sb.append('=');
        sb.append(((this.criteriaNetAssetClass == null)?"<null>":this.criteriaNetAssetClass));
        sb.append(',');
        sb.append("criteriaExpendEndDate");
        sb.append('=');
        sb.append(((this.criteriaExpendEndDate == null)?"<null>":this.criteriaExpendEndDate));
        sb.append(',');
        sb.append("criteriaFundCodePred");
        sb.append('=');
        sb.append(((this.criteriaFundCodePred == null)?"<null>":this.criteriaFundCodePred));
        sb.append(',');
        sb.append("criteriaBankCode");
        sb.append('=');
        sb.append(((this.criteriaBankCode == null)?"<null>":this.criteriaBankCode));
        sb.append(',');
        sb.append("criteriaProgCodeDef");
        sb.append('=');
        sb.append(((this.criteriaProgCodeDef == null)?"<null>":this.criteriaProgCodeDef));
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
        result = ((result* 31)+((this.criteriaRestInd == null)? 0 :this.criteriaRestInd.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaFundCodePlant == null)? 0 :this.criteriaFundCodePlant.hashCode()));
        result = ((result* 31)+((this.criteriaNetAssetClass == null)? 0 :this.criteriaNetAssetClass.hashCode()));
        result = ((result* 31)+((this.criteriaSrcCapSameInd == null)? 0 :this.criteriaSrcCapSameInd.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeRev == null)? 0 :this.criteriaAcctCodeRev.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.criteriaActvCodeDef == null)? 0 :this.criteriaActvCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodePlant == null)? 0 :this.criteriaAcctCodePlant.hashCode()));
        result = ((result* 31)+((this.criteriaExpendEndDate == null)? 0 :this.criteriaExpendEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaGrntCode == null)? 0 :this.criteriaGrntCode.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCodeDef == null)? 0 :this.criteriaOrgnCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaEffCertAllocInd == null)? 0 :this.criteriaEffCertAllocInd.hashCode()));
        result = ((result* 31)+((this.criteriaPropCode == null)? 0 :this.criteriaPropCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtypCode == null)? 0 :this.criteriaFtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaDataEntryInd == null)? 0 :this.criteriaDataEntryInd.hashCode()));
        result = ((result* 31)+((this.criteriaCashReceiptBankCode == null)? 0 :this.criteriaCashReceiptBankCode.hashCode()));
        result = ((result* 31)+((this.criteriaFundCodePred == null)? 0 :this.criteriaFundCodePred.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaProgCodeDef == null)? 0 :this.criteriaProgCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaLocnCodeDef == null)? 0 :this.criteriaLocnCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaEffCertRequiredInd == null)? 0 :this.criteriaEffCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFbalInd == null)? 0 :this.criteriaFbalInd.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeAccr == null)? 0 :this.criteriaAcctCodeAccr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundCodeMaintenance100GetRequest) == false) {
            return false;
        }
        FundCodeMaintenance100GetRequest rhs = ((FundCodeMaintenance100GetRequest) other);
        return (((((((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaRestInd == rhs.criteriaRestInd)||((this.criteriaRestInd!= null)&&this.criteriaRestInd.equals(rhs.criteriaRestInd))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaFundCodePlant == rhs.criteriaFundCodePlant)||((this.criteriaFundCodePlant!= null)&&this.criteriaFundCodePlant.equals(rhs.criteriaFundCodePlant))))&&((this.criteriaNetAssetClass == rhs.criteriaNetAssetClass)||((this.criteriaNetAssetClass!= null)&&this.criteriaNetAssetClass.equals(rhs.criteriaNetAssetClass))))&&((this.criteriaSrcCapSameInd == rhs.criteriaSrcCapSameInd)||((this.criteriaSrcCapSameInd!= null)&&this.criteriaSrcCapSameInd.equals(rhs.criteriaSrcCapSameInd))))&&((this.criteriaAcctCodeRev == rhs.criteriaAcctCodeRev)||((this.criteriaAcctCodeRev!= null)&&this.criteriaAcctCodeRev.equals(rhs.criteriaAcctCodeRev))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.criteriaActvCodeDef == rhs.criteriaActvCodeDef)||((this.criteriaActvCodeDef!= null)&&this.criteriaActvCodeDef.equals(rhs.criteriaActvCodeDef))))&&((this.criteriaAcctCodePlant == rhs.criteriaAcctCodePlant)||((this.criteriaAcctCodePlant!= null)&&this.criteriaAcctCodePlant.equals(rhs.criteriaAcctCodePlant))))&&((this.criteriaExpendEndDate == rhs.criteriaExpendEndDate)||((this.criteriaExpendEndDate!= null)&&this.criteriaExpendEndDate.equals(rhs.criteriaExpendEndDate))))&&((this.criteriaGrntCode == rhs.criteriaGrntCode)||((this.criteriaGrntCode!= null)&&this.criteriaGrntCode.equals(rhs.criteriaGrntCode))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.criteriaOrgnCodeDef == rhs.criteriaOrgnCodeDef)||((this.criteriaOrgnCodeDef!= null)&&this.criteriaOrgnCodeDef.equals(rhs.criteriaOrgnCodeDef))))&&((this.criteriaEffCertAllocInd == rhs.criteriaEffCertAllocInd)||((this.criteriaEffCertAllocInd!= null)&&this.criteriaEffCertAllocInd.equals(rhs.criteriaEffCertAllocInd))))&&((this.criteriaPropCode == rhs.criteriaPropCode)||((this.criteriaPropCode!= null)&&this.criteriaPropCode.equals(rhs.criteriaPropCode))))&&((this.criteriaFtypCode == rhs.criteriaFtypCode)||((this.criteriaFtypCode!= null)&&this.criteriaFtypCode.equals(rhs.criteriaFtypCode))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaDataEntryInd == rhs.criteriaDataEntryInd)||((this.criteriaDataEntryInd!= null)&&this.criteriaDataEntryInd.equals(rhs.criteriaDataEntryInd))))&&((this.criteriaCashReceiptBankCode == rhs.criteriaCashReceiptBankCode)||((this.criteriaCashReceiptBankCode!= null)&&this.criteriaCashReceiptBankCode.equals(rhs.criteriaCashReceiptBankCode))))&&((this.criteriaFundCodePred == rhs.criteriaFundCodePred)||((this.criteriaFundCodePred!= null)&&this.criteriaFundCodePred.equals(rhs.criteriaFundCodePred))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaProgCodeDef == rhs.criteriaProgCodeDef)||((this.criteriaProgCodeDef!= null)&&this.criteriaProgCodeDef.equals(rhs.criteriaProgCodeDef))))&&((this.criteriaLocnCodeDef == rhs.criteriaLocnCodeDef)||((this.criteriaLocnCodeDef!= null)&&this.criteriaLocnCodeDef.equals(rhs.criteriaLocnCodeDef))))&&((this.criteriaEffCertRequiredInd == rhs.criteriaEffCertRequiredInd)||((this.criteriaEffCertRequiredInd!= null)&&this.criteriaEffCertRequiredInd.equals(rhs.criteriaEffCertRequiredInd))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFbalInd == rhs.criteriaFbalInd)||((this.criteriaFbalInd!= null)&&this.criteriaFbalInd.equals(rhs.criteriaFbalInd))))&&((this.criteriaAcctCodeAccr == rhs.criteriaAcctCodeAccr)||((this.criteriaAcctCodeAccr!= null)&&this.criteriaAcctCodeAccr.equals(rhs.criteriaAcctCodeAccr))));
    }

}
