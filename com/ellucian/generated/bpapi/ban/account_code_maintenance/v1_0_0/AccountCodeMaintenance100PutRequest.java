
package com.ellucian.generated.bpapi.ban.account_code_maintenance.v1_0_0;

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
    "criteria.acctCodeFringe",
    "criteria.atypCode",
    "criteria.statusInd",
    "dataEntryInd",
    "coasCode",
    "criteria.acctCodePool",
    "title",
    "criteria.termDate",
    "criteria.dataEntryInd",
    "acctClassCode",
    "criteria.acctCodePred",
    "statusInd",
    "criteria.coasCode",
    "acctCodePool",
    "fringePct",
    "acctCodeAsset",
    "acctCodeDeprAccum",
    "criteria.effDate",
    "criteria.acctCode",
    "criteria.fringePct",
    "acctCodePred",
    "acctCodeFringe",
    "acctCodeDeprExp",
    "criteria.normalBal",
    "ftvacctAcctCodeAsset",
    "criteria.title",
    "criteria.acctClassCode",
    "criteria.acctCodeDeprExp",
    "incomeTypeCode",
    "criteria.incomeTypeCode",
    "criteria.acctCodeAsset",
    "termDate",
    "criteria.acctCodeDeprAccum",
    "atypCode",
    "normalBal"
})
@Generated("jsonschema2pojo")
public class AccountCodeMaintenance100PutRequest {

    /**
     * Fringe Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_FRINGE
     * 
     */
    @JsonProperty("criteria.acctCodeFringe")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_FRINGE")
    private String criteriaAcctCodeFringe;
    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVACCT_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ATYP_CODE, Lookup lineage reference object : ftvatyp")
    private String criteriaAtypCode;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVACCT_DATA_ENTRY_IND
     * (Required)
     * 
     */
    @JsonProperty("dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_DATA_ENTRY_IND")
    private String dataEntryInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVACCT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Pool Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_POOL
     * 
     */
    @JsonProperty("criteria.acctCodePool")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_POOL")
    private String criteriaAcctCodePool;
    /**
     * Account Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_TITLE")
    private String title;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCT_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVACCT_DATA_ENTRY_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_DATA_ENTRY_IND")
    private String criteriaDataEntryInd;
    /**
     * Account Class
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CLASS_CODE
     * 
     */
    @JsonProperty("acctClassCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CLASS_CODE")
    private String acctClassCode;
    /**
     * Predecessor Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_PRED
     * 
     */
    @JsonProperty("criteria.acctCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_PRED")
    private String criteriaAcctCodePred;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_STATUS_IND")
    private String statusInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVACCT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Pool Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_POOL
     * 
     */
    @JsonProperty("acctCodePool")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_POOL")
    private String acctCodePool;
    /**
     * Fringe Percent
     * <p>
     * Lineage reference object : FTVACCT_FRINGE_PCT
     * 
     */
    @JsonProperty("fringePct")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_FRINGE_PCT")
    private Double fringePct;
    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("acctCodeAsset")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_ASSET")
    private String acctCodeAsset;
    /**
     * Accumulated Depreciation Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_ACCUM
     * 
     */
    @JsonProperty("acctCodeDeprAccum")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_DEPR_ACCUM")
    private String acctCodeDeprAccum;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE")
    private String criteriaAcctCode;
    /**
     * Fringe Percent
     * <p>
     * Lineage reference object : FTVACCT_FRINGE_PCT
     * 
     */
    @JsonProperty("criteria.fringePct")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_FRINGE_PCT")
    private Double criteriaFringePct;
    /**
     * Predecessor Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_PRED
     * 
     */
    @JsonProperty("acctCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_PRED")
    private String acctCodePred;
    /**
     * Fringe Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_FRINGE
     * 
     */
    @JsonProperty("acctCodeFringe")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_FRINGE")
    private String acctCodeFringe;
    /**
     * Depreciation Expense Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_EXP
     * 
     */
    @JsonProperty("acctCodeDeprExp")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_DEPR_EXP")
    private String acctCodeDeprExp;
    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVACCT_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("criteria.normalBal")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_NORMAL_BAL")
    private String criteriaNormalBal;
    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("ftvacctAcctCodeAsset")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_ASSET")
    private String ftvacctAcctCodeAsset;
    /**
     * Account Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_TITLE")
    private String criteriaTitle;
    /**
     * Account Class
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CLASS_CODE
     * 
     */
    @JsonProperty("criteria.acctClassCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CLASS_CODE")
    private String criteriaAcctClassCode;
    /**
     * Depreciation Expense Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_EXP
     * 
     */
    @JsonProperty("criteria.acctCodeDeprExp")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_DEPR_EXP")
    private String criteriaAcctCodeDeprExp;
    /**
     * IncomeType
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("incomeTypeCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvityp")
    private String incomeTypeCode;
    /**
     * IncomeType
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("criteria.incomeTypeCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvityp")
    private String criteriaIncomeTypeCode;
    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("criteria.acctCodeAsset")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_ASSET")
    private String criteriaAcctCodeAsset;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_TERM_DATE")
    private Date termDate;
    /**
     * Accumulated Depreciation Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_ACCUM
     * 
     */
    @JsonProperty("criteria.acctCodeDeprAccum")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE_DEPR_ACCUM")
    private String criteriaAcctCodeDeprAccum;
    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVACCT_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ATYP_CODE, Lookup lineage reference object : ftvatyp")
    private String atypCode;
    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVACCT_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("normalBal")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_NORMAL_BAL")
    private String normalBal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fringe Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_FRINGE
     * 
     */
    @JsonProperty("criteria.acctCodeFringe")
    public String getCriteriaAcctCodeFringe() {
        return criteriaAcctCodeFringe;
    }

    /**
     * Fringe Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_FRINGE
     * 
     */
    @JsonProperty("criteria.acctCodeFringe")
    public void setCriteriaAcctCodeFringe(String criteriaAcctCodeFringe) {
        this.criteriaAcctCodeFringe = criteriaAcctCodeFringe;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaAcctCodeFringe(String criteriaAcctCodeFringe) {
        this.criteriaAcctCodeFringe = criteriaAcctCodeFringe;
        return this;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVACCT_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public String getCriteriaAtypCode() {
        return criteriaAtypCode;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVACCT_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public void setCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVACCT_DATA_ENTRY_IND
     * (Required)
     * 
     */
    @JsonProperty("dataEntryInd")
    public String getDataEntryInd() {
        return dataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVACCT_DATA_ENTRY_IND
     * (Required)
     * 
     */
    @JsonProperty("dataEntryInd")
    public void setDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
    }

    public AccountCodeMaintenance100PutRequest withDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVACCT_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FTVACCT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public AccountCodeMaintenance100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Pool Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_POOL
     * 
     */
    @JsonProperty("criteria.acctCodePool")
    public String getCriteriaAcctCodePool() {
        return criteriaAcctCodePool;
    }

    /**
     * Pool Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_POOL
     * 
     */
    @JsonProperty("criteria.acctCodePool")
    public void setCriteriaAcctCodePool(String criteriaAcctCodePool) {
        this.criteriaAcctCodePool = criteriaAcctCodePool;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaAcctCodePool(String criteriaAcctCodePool) {
        this.criteriaAcctCodePool = criteriaAcctCodePool;
        return this;
    }

    /**
     * Account Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Account Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AccountCodeMaintenance100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCT_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCT_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVACCT_DATA_ENTRY_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public String getCriteriaDataEntryInd() {
        return criteriaDataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVACCT_DATA_ENTRY_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public void setCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
        return this;
    }

    /**
     * Account Class
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CLASS_CODE
     * 
     */
    @JsonProperty("acctClassCode")
    public String getAcctClassCode() {
        return acctClassCode;
    }

    /**
     * Account Class
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CLASS_CODE
     * 
     */
    @JsonProperty("acctClassCode")
    public void setAcctClassCode(String acctClassCode) {
        this.acctClassCode = acctClassCode;
    }

    public AccountCodeMaintenance100PutRequest withAcctClassCode(String acctClassCode) {
        this.acctClassCode = acctClassCode;
        return this;
    }

    /**
     * Predecessor Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_PRED
     * 
     */
    @JsonProperty("criteria.acctCodePred")
    public String getCriteriaAcctCodePred() {
        return criteriaAcctCodePred;
    }

    /**
     * Predecessor Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_PRED
     * 
     */
    @JsonProperty("criteria.acctCodePred")
    public void setCriteriaAcctCodePred(String criteriaAcctCodePred) {
        this.criteriaAcctCodePred = criteriaAcctCodePred;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaAcctCodePred(String criteriaAcctCodePred) {
        this.criteriaAcctCodePred = criteriaAcctCodePred;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public AccountCodeMaintenance100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVACCT_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FTVACCT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Pool Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_POOL
     * 
     */
    @JsonProperty("acctCodePool")
    public String getAcctCodePool() {
        return acctCodePool;
    }

    /**
     * Pool Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_POOL
     * 
     */
    @JsonProperty("acctCodePool")
    public void setAcctCodePool(String acctCodePool) {
        this.acctCodePool = acctCodePool;
    }

    public AccountCodeMaintenance100PutRequest withAcctCodePool(String acctCodePool) {
        this.acctCodePool = acctCodePool;
        return this;
    }

    /**
     * Fringe Percent
     * <p>
     * Lineage reference object : FTVACCT_FRINGE_PCT
     * 
     */
    @JsonProperty("fringePct")
    public Double getFringePct() {
        return fringePct;
    }

    /**
     * Fringe Percent
     * <p>
     * Lineage reference object : FTVACCT_FRINGE_PCT
     * 
     */
    @JsonProperty("fringePct")
    public void setFringePct(Double fringePct) {
        this.fringePct = fringePct;
    }

    public AccountCodeMaintenance100PutRequest withFringePct(Double fringePct) {
        this.fringePct = fringePct;
        return this;
    }

    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("acctCodeAsset")
    public String getAcctCodeAsset() {
        return acctCodeAsset;
    }

    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("acctCodeAsset")
    public void setAcctCodeAsset(String acctCodeAsset) {
        this.acctCodeAsset = acctCodeAsset;
    }

    public AccountCodeMaintenance100PutRequest withAcctCodeAsset(String acctCodeAsset) {
        this.acctCodeAsset = acctCodeAsset;
        return this;
    }

    /**
     * Accumulated Depreciation Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_ACCUM
     * 
     */
    @JsonProperty("acctCodeDeprAccum")
    public String getAcctCodeDeprAccum() {
        return acctCodeDeprAccum;
    }

    /**
     * Accumulated Depreciation Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_ACCUM
     * 
     */
    @JsonProperty("acctCodeDeprAccum")
    public void setAcctCodeDeprAccum(String acctCodeDeprAccum) {
        this.acctCodeDeprAccum = acctCodeDeprAccum;
    }

    public AccountCodeMaintenance100PutRequest withAcctCodeDeprAccum(String acctCodeDeprAccum) {
        this.acctCodeDeprAccum = acctCodeDeprAccum;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCT_EFF_DATE
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
     * Lineage reference object : FTVACCT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCode")
    public String getCriteriaAcctCode() {
        return criteriaAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCode")
    public void setCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
        return this;
    }

    /**
     * Fringe Percent
     * <p>
     * Lineage reference object : FTVACCT_FRINGE_PCT
     * 
     */
    @JsonProperty("criteria.fringePct")
    public Double getCriteriaFringePct() {
        return criteriaFringePct;
    }

    /**
     * Fringe Percent
     * <p>
     * Lineage reference object : FTVACCT_FRINGE_PCT
     * 
     */
    @JsonProperty("criteria.fringePct")
    public void setCriteriaFringePct(Double criteriaFringePct) {
        this.criteriaFringePct = criteriaFringePct;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaFringePct(Double criteriaFringePct) {
        this.criteriaFringePct = criteriaFringePct;
        return this;
    }

    /**
     * Predecessor Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_PRED
     * 
     */
    @JsonProperty("acctCodePred")
    public String getAcctCodePred() {
        return acctCodePred;
    }

    /**
     * Predecessor Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_PRED
     * 
     */
    @JsonProperty("acctCodePred")
    public void setAcctCodePred(String acctCodePred) {
        this.acctCodePred = acctCodePred;
    }

    public AccountCodeMaintenance100PutRequest withAcctCodePred(String acctCodePred) {
        this.acctCodePred = acctCodePred;
        return this;
    }

    /**
     * Fringe Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_FRINGE
     * 
     */
    @JsonProperty("acctCodeFringe")
    public String getAcctCodeFringe() {
        return acctCodeFringe;
    }

    /**
     * Fringe Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_FRINGE
     * 
     */
    @JsonProperty("acctCodeFringe")
    public void setAcctCodeFringe(String acctCodeFringe) {
        this.acctCodeFringe = acctCodeFringe;
    }

    public AccountCodeMaintenance100PutRequest withAcctCodeFringe(String acctCodeFringe) {
        this.acctCodeFringe = acctCodeFringe;
        return this;
    }

    /**
     * Depreciation Expense Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_EXP
     * 
     */
    @JsonProperty("acctCodeDeprExp")
    public String getAcctCodeDeprExp() {
        return acctCodeDeprExp;
    }

    /**
     * Depreciation Expense Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_EXP
     * 
     */
    @JsonProperty("acctCodeDeprExp")
    public void setAcctCodeDeprExp(String acctCodeDeprExp) {
        this.acctCodeDeprExp = acctCodeDeprExp;
    }

    public AccountCodeMaintenance100PutRequest withAcctCodeDeprExp(String acctCodeDeprExp) {
        this.acctCodeDeprExp = acctCodeDeprExp;
        return this;
    }

    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVACCT_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("criteria.normalBal")
    public String getCriteriaNormalBal() {
        return criteriaNormalBal;
    }

    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVACCT_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("criteria.normalBal")
    public void setCriteriaNormalBal(String criteriaNormalBal) {
        this.criteriaNormalBal = criteriaNormalBal;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaNormalBal(String criteriaNormalBal) {
        this.criteriaNormalBal = criteriaNormalBal;
        return this;
    }

    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("ftvacctAcctCodeAsset")
    public String getFtvacctAcctCodeAsset() {
        return ftvacctAcctCodeAsset;
    }

    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("ftvacctAcctCodeAsset")
    public void setFtvacctAcctCodeAsset(String ftvacctAcctCodeAsset) {
        this.ftvacctAcctCodeAsset = ftvacctAcctCodeAsset;
    }

    public AccountCodeMaintenance100PutRequest withFtvacctAcctCodeAsset(String ftvacctAcctCodeAsset) {
        this.ftvacctAcctCodeAsset = ftvacctAcctCodeAsset;
        return this;
    }

    /**
     * Account Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Account Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Account Class
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CLASS_CODE
     * 
     */
    @JsonProperty("criteria.acctClassCode")
    public String getCriteriaAcctClassCode() {
        return criteriaAcctClassCode;
    }

    /**
     * Account Class
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CLASS_CODE
     * 
     */
    @JsonProperty("criteria.acctClassCode")
    public void setCriteriaAcctClassCode(String criteriaAcctClassCode) {
        this.criteriaAcctClassCode = criteriaAcctClassCode;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaAcctClassCode(String criteriaAcctClassCode) {
        this.criteriaAcctClassCode = criteriaAcctClassCode;
        return this;
    }

    /**
     * Depreciation Expense Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_EXP
     * 
     */
    @JsonProperty("criteria.acctCodeDeprExp")
    public String getCriteriaAcctCodeDeprExp() {
        return criteriaAcctCodeDeprExp;
    }

    /**
     * Depreciation Expense Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_EXP
     * 
     */
    @JsonProperty("criteria.acctCodeDeprExp")
    public void setCriteriaAcctCodeDeprExp(String criteriaAcctCodeDeprExp) {
        this.criteriaAcctCodeDeprExp = criteriaAcctCodeDeprExp;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaAcctCodeDeprExp(String criteriaAcctCodeDeprExp) {
        this.criteriaAcctCodeDeprExp = criteriaAcctCodeDeprExp;
        return this;
    }

    /**
     * IncomeType
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("incomeTypeCode")
    public String getIncomeTypeCode() {
        return incomeTypeCode;
    }

    /**
     * IncomeType
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("incomeTypeCode")
    public void setIncomeTypeCode(String incomeTypeCode) {
        this.incomeTypeCode = incomeTypeCode;
    }

    public AccountCodeMaintenance100PutRequest withIncomeTypeCode(String incomeTypeCode) {
        this.incomeTypeCode = incomeTypeCode;
        return this;
    }

    /**
     * IncomeType
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("criteria.incomeTypeCode")
    public String getCriteriaIncomeTypeCode() {
        return criteriaIncomeTypeCode;
    }

    /**
     * IncomeType
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("criteria.incomeTypeCode")
    public void setCriteriaIncomeTypeCode(String criteriaIncomeTypeCode) {
        this.criteriaIncomeTypeCode = criteriaIncomeTypeCode;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaIncomeTypeCode(String criteriaIncomeTypeCode) {
        this.criteriaIncomeTypeCode = criteriaIncomeTypeCode;
        return this;
    }

    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("criteria.acctCodeAsset")
    public String getCriteriaAcctCodeAsset() {
        return criteriaAcctCodeAsset;
    }

    /**
     * Asset Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_ASSET
     * 
     */
    @JsonProperty("criteria.acctCodeAsset")
    public void setCriteriaAcctCodeAsset(String criteriaAcctCodeAsset) {
        this.criteriaAcctCodeAsset = criteriaAcctCodeAsset;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaAcctCodeAsset(String criteriaAcctCodeAsset) {
        this.criteriaAcctCodeAsset = criteriaAcctCodeAsset;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public AccountCodeMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Accumulated Depreciation Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_ACCUM
     * 
     */
    @JsonProperty("criteria.acctCodeDeprAccum")
    public String getCriteriaAcctCodeDeprAccum() {
        return criteriaAcctCodeDeprAccum;
    }

    /**
     * Accumulated Depreciation Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE_DEPR_ACCUM
     * 
     */
    @JsonProperty("criteria.acctCodeDeprAccum")
    public void setCriteriaAcctCodeDeprAccum(String criteriaAcctCodeDeprAccum) {
        this.criteriaAcctCodeDeprAccum = criteriaAcctCodeDeprAccum;
    }

    public AccountCodeMaintenance100PutRequest withCriteriaAcctCodeDeprAccum(String criteriaAcctCodeDeprAccum) {
        this.criteriaAcctCodeDeprAccum = criteriaAcctCodeDeprAccum;
        return this;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVACCT_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVACCT_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public AccountCodeMaintenance100PutRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVACCT_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("normalBal")
    public String getNormalBal() {
        return normalBal;
    }

    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVACCT_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("normalBal")
    public void setNormalBal(String normalBal) {
        this.normalBal = normalBal;
    }

    public AccountCodeMaintenance100PutRequest withNormalBal(String normalBal) {
        this.normalBal = normalBal;
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

    public AccountCodeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountCodeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaAcctCodeFringe");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeFringe == null)?"<null>":this.criteriaAcctCodeFringe));
        sb.append(',');
        sb.append("criteriaAtypCode");
        sb.append('=');
        sb.append(((this.criteriaAtypCode == null)?"<null>":this.criteriaAtypCode));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("criteriaAcctCodePool");
        sb.append('=');
        sb.append(((this.criteriaAcctCodePool == null)?"<null>":this.criteriaAcctCodePool));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaDataEntryInd");
        sb.append('=');
        sb.append(((this.criteriaDataEntryInd == null)?"<null>":this.criteriaDataEntryInd));
        sb.append(',');
        sb.append("acctClassCode");
        sb.append('=');
        sb.append(((this.acctClassCode == null)?"<null>":this.acctClassCode));
        sb.append(',');
        sb.append("criteriaAcctCodePred");
        sb.append('=');
        sb.append(((this.criteriaAcctCodePred == null)?"<null>":this.criteriaAcctCodePred));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("acctCodePool");
        sb.append('=');
        sb.append(((this.acctCodePool == null)?"<null>":this.acctCodePool));
        sb.append(',');
        sb.append("fringePct");
        sb.append('=');
        sb.append(((this.fringePct == null)?"<null>":this.fringePct));
        sb.append(',');
        sb.append("acctCodeAsset");
        sb.append('=');
        sb.append(((this.acctCodeAsset == null)?"<null>":this.acctCodeAsset));
        sb.append(',');
        sb.append("acctCodeDeprAccum");
        sb.append('=');
        sb.append(((this.acctCodeDeprAccum == null)?"<null>":this.acctCodeDeprAccum));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaAcctCode");
        sb.append('=');
        sb.append(((this.criteriaAcctCode == null)?"<null>":this.criteriaAcctCode));
        sb.append(',');
        sb.append("criteriaFringePct");
        sb.append('=');
        sb.append(((this.criteriaFringePct == null)?"<null>":this.criteriaFringePct));
        sb.append(',');
        sb.append("acctCodePred");
        sb.append('=');
        sb.append(((this.acctCodePred == null)?"<null>":this.acctCodePred));
        sb.append(',');
        sb.append("acctCodeFringe");
        sb.append('=');
        sb.append(((this.acctCodeFringe == null)?"<null>":this.acctCodeFringe));
        sb.append(',');
        sb.append("acctCodeDeprExp");
        sb.append('=');
        sb.append(((this.acctCodeDeprExp == null)?"<null>":this.acctCodeDeprExp));
        sb.append(',');
        sb.append("criteriaNormalBal");
        sb.append('=');
        sb.append(((this.criteriaNormalBal == null)?"<null>":this.criteriaNormalBal));
        sb.append(',');
        sb.append("ftvacctAcctCodeAsset");
        sb.append('=');
        sb.append(((this.ftvacctAcctCodeAsset == null)?"<null>":this.ftvacctAcctCodeAsset));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("criteriaAcctClassCode");
        sb.append('=');
        sb.append(((this.criteriaAcctClassCode == null)?"<null>":this.criteriaAcctClassCode));
        sb.append(',');
        sb.append("criteriaAcctCodeDeprExp");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeDeprExp == null)?"<null>":this.criteriaAcctCodeDeprExp));
        sb.append(',');
        sb.append("incomeTypeCode");
        sb.append('=');
        sb.append(((this.incomeTypeCode == null)?"<null>":this.incomeTypeCode));
        sb.append(',');
        sb.append("criteriaIncomeTypeCode");
        sb.append('=');
        sb.append(((this.criteriaIncomeTypeCode == null)?"<null>":this.criteriaIncomeTypeCode));
        sb.append(',');
        sb.append("criteriaAcctCodeAsset");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeAsset == null)?"<null>":this.criteriaAcctCodeAsset));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("criteriaAcctCodeDeprAccum");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeDeprAccum == null)?"<null>":this.criteriaAcctCodeDeprAccum));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("normalBal");
        sb.append('=');
        sb.append(((this.normalBal == null)?"<null>":this.normalBal));
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
        result = ((result* 31)+((this.criteriaAcctCodeDeprExp == null)? 0 :this.criteriaAcctCodeDeprExp.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeDeprAccum == null)? 0 :this.criteriaAcctCodeDeprAccum.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCode == null)? 0 :this.criteriaAcctCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.criteriaIncomeTypeCode == null)? 0 :this.criteriaIncomeTypeCode.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodePred == null)? 0 :this.criteriaAcctCodePred.hashCode()));
        result = ((result* 31)+((this.acctClassCode == null)? 0 :this.acctClassCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeAsset == null)? 0 :this.criteriaAcctCodeAsset.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.acctCodePool == null)? 0 :this.acctCodePool.hashCode()));
        result = ((result* 31)+((this.fringePct == null)? 0 :this.fringePct.hashCode()));
        result = ((result* 31)+((this.criteriaNormalBal == null)? 0 :this.criteriaNormalBal.hashCode()));
        result = ((result* 31)+((this.acctCodeAsset == null)? 0 :this.acctCodeAsset.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.acctCodeDeprAccum == null)? 0 :this.acctCodeDeprAccum.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCode == null)? 0 :this.criteriaAtypCode.hashCode()));
        result = ((result* 31)+((this.acctCodePred == null)? 0 :this.acctCodePred.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaDataEntryInd == null)? 0 :this.criteriaDataEntryInd.hashCode()));
        result = ((result* 31)+((this.acctCodeFringe == null)? 0 :this.acctCodeFringe.hashCode()));
        result = ((result* 31)+((this.acctCodeDeprExp == null)? 0 :this.acctCodeDeprExp.hashCode()));
        result = ((result* 31)+((this.ftvacctAcctCodeAsset == null)? 0 :this.ftvacctAcctCodeAsset.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodePool == null)? 0 :this.criteriaAcctCodePool.hashCode()));
        result = ((result* 31)+((this.criteriaAcctClassCode == null)? 0 :this.criteriaAcctClassCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeFringe == null)? 0 :this.criteriaAcctCodeFringe.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.incomeTypeCode == null)? 0 :this.incomeTypeCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.criteriaFringePct == null)? 0 :this.criteriaFringePct.hashCode()));
        result = ((result* 31)+((this.normalBal == null)? 0 :this.normalBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountCodeMaintenance100PutRequest) == false) {
            return false;
        }
        AccountCodeMaintenance100PutRequest rhs = ((AccountCodeMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((this.criteriaAcctCodeDeprExp == rhs.criteriaAcctCodeDeprExp)||((this.criteriaAcctCodeDeprExp!= null)&&this.criteriaAcctCodeDeprExp.equals(rhs.criteriaAcctCodeDeprExp)))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaAcctCodeDeprAccum == rhs.criteriaAcctCodeDeprAccum)||((this.criteriaAcctCodeDeprAccum!= null)&&this.criteriaAcctCodeDeprAccum.equals(rhs.criteriaAcctCodeDeprAccum))))&&((this.criteriaAcctCode == rhs.criteriaAcctCode)||((this.criteriaAcctCode!= null)&&this.criteriaAcctCode.equals(rhs.criteriaAcctCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.criteriaIncomeTypeCode == rhs.criteriaIncomeTypeCode)||((this.criteriaIncomeTypeCode!= null)&&this.criteriaIncomeTypeCode.equals(rhs.criteriaIncomeTypeCode))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.criteriaAcctCodePred == rhs.criteriaAcctCodePred)||((this.criteriaAcctCodePred!= null)&&this.criteriaAcctCodePred.equals(rhs.criteriaAcctCodePred))))&&((this.acctClassCode == rhs.acctClassCode)||((this.acctClassCode!= null)&&this.acctClassCode.equals(rhs.acctClassCode))))&&((this.criteriaAcctCodeAsset == rhs.criteriaAcctCodeAsset)||((this.criteriaAcctCodeAsset!= null)&&this.criteriaAcctCodeAsset.equals(rhs.criteriaAcctCodeAsset))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.acctCodePool == rhs.acctCodePool)||((this.acctCodePool!= null)&&this.acctCodePool.equals(rhs.acctCodePool))))&&((this.fringePct == rhs.fringePct)||((this.fringePct!= null)&&this.fringePct.equals(rhs.fringePct))))&&((this.criteriaNormalBal == rhs.criteriaNormalBal)||((this.criteriaNormalBal!= null)&&this.criteriaNormalBal.equals(rhs.criteriaNormalBal))))&&((this.acctCodeAsset == rhs.acctCodeAsset)||((this.acctCodeAsset!= null)&&this.acctCodeAsset.equals(rhs.acctCodeAsset))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.acctCodeDeprAccum == rhs.acctCodeDeprAccum)||((this.acctCodeDeprAccum!= null)&&this.acctCodeDeprAccum.equals(rhs.acctCodeDeprAccum))))&&((this.criteriaAtypCode == rhs.criteriaAtypCode)||((this.criteriaAtypCode!= null)&&this.criteriaAtypCode.equals(rhs.criteriaAtypCode))))&&((this.acctCodePred == rhs.acctCodePred)||((this.acctCodePred!= null)&&this.acctCodePred.equals(rhs.acctCodePred))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaDataEntryInd == rhs.criteriaDataEntryInd)||((this.criteriaDataEntryInd!= null)&&this.criteriaDataEntryInd.equals(rhs.criteriaDataEntryInd))))&&((this.acctCodeFringe == rhs.acctCodeFringe)||((this.acctCodeFringe!= null)&&this.acctCodeFringe.equals(rhs.acctCodeFringe))))&&((this.acctCodeDeprExp == rhs.acctCodeDeprExp)||((this.acctCodeDeprExp!= null)&&this.acctCodeDeprExp.equals(rhs.acctCodeDeprExp))))&&((this.ftvacctAcctCodeAsset == rhs.ftvacctAcctCodeAsset)||((this.ftvacctAcctCodeAsset!= null)&&this.ftvacctAcctCodeAsset.equals(rhs.ftvacctAcctCodeAsset))))&&((this.criteriaAcctCodePool == rhs.criteriaAcctCodePool)||((this.criteriaAcctCodePool!= null)&&this.criteriaAcctCodePool.equals(rhs.criteriaAcctCodePool))))&&((this.criteriaAcctClassCode == rhs.criteriaAcctClassCode)||((this.criteriaAcctClassCode!= null)&&this.criteriaAcctClassCode.equals(rhs.criteriaAcctClassCode))))&&((this.criteriaAcctCodeFringe == rhs.criteriaAcctCodeFringe)||((this.criteriaAcctCodeFringe!= null)&&this.criteriaAcctCodeFringe.equals(rhs.criteriaAcctCodeFringe))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.incomeTypeCode == rhs.incomeTypeCode)||((this.incomeTypeCode!= null)&&this.incomeTypeCode.equals(rhs.incomeTypeCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.criteriaFringePct == rhs.criteriaFringePct)||((this.criteriaFringePct!= null)&&this.criteriaFringePct.equals(rhs.criteriaFringePct))))&&((this.normalBal == rhs.normalBal)||((this.normalBal!= null)&&this.normalBal.equals(rhs.normalBal))));
    }

}
