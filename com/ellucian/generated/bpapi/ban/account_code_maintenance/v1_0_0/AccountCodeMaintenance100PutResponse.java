
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
    "dataEntryInd",
    "coasCode",
    "accountClassTitle",
    "title",
    "incomeDescription",
    "effDate",
    "activityDate",
    "acctClassCode",
    "statusInd",
    "deprExpTitle",
    "acctCodePool",
    "fringePct",
    "fringeAccountTitle",
    "acctCodeAsset",
    "acctCodeDeprAccum",
    "accountTypeTitle",
    "normalBalanceDescription",
    "acctCodePred",
    "acctCodeFringe",
    "acctCode",
    "acctCodeDeprExp",
    "displayNchgDate",
    "accumDeprTitle",
    "assetAccountTitle",
    "predTitle",
    "incomeTypeCode",
    "poolAccountTitle",
    "termDate",
    "atypCode",
    "normalBal"
})
@Generated("jsonschema2pojo")
public class AccountCodeMaintenance100PutResponse {

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
    @JsonProperty("accountClassTitle")
    private String accountClassTitle;
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
    @JsonProperty("incomeDescription")
    private String incomeDescription;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_EFF_DATE")
    private Date effDate;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVACCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACTIVITY_DATE")
    private Date activityDate;
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
     * Active Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_STATUS_IND")
    private String statusInd;
    @JsonProperty("deprExpTitle")
    private String deprExpTitle;
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
    @JsonProperty("fringeAccountTitle")
    private String fringeAccountTitle;
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
    @JsonProperty("accountTypeTitle")
    private String accountTypeTitle;
    @JsonProperty("normalBalanceDescription")
    private String normalBalanceDescription;
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
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE")
    private String acctCode;
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
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    @JsonProperty("accumDeprTitle")
    private String accumDeprTitle;
    @JsonProperty("assetAccountTitle")
    private String assetAccountTitle;
    @JsonProperty("predTitle")
    private String predTitle;
    /**
     * IncomeType
     * <p>
     * Lookup lineage reference object : ftvityp
     * 
     */
    @JsonProperty("incomeTypeCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvityp")
    private String incomeTypeCode;
    @JsonProperty("poolAccountTitle")
    private String poolAccountTitle;
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

    public AccountCodeMaintenance100PutResponse withDataEntryInd(String dataEntryInd) {
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

    public AccountCodeMaintenance100PutResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("accountClassTitle")
    public String getAccountClassTitle() {
        return accountClassTitle;
    }

    @JsonProperty("accountClassTitle")
    public void setAccountClassTitle(String accountClassTitle) {
        this.accountClassTitle = accountClassTitle;
    }

    public AccountCodeMaintenance100PutResponse withAccountClassTitle(String accountClassTitle) {
        this.accountClassTitle = accountClassTitle;
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

    public AccountCodeMaintenance100PutResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("incomeDescription")
    public String getIncomeDescription() {
        return incomeDescription;
    }

    @JsonProperty("incomeDescription")
    public void setIncomeDescription(String incomeDescription) {
        this.incomeDescription = incomeDescription;
    }

    public AccountCodeMaintenance100PutResponse withIncomeDescription(String incomeDescription) {
        this.incomeDescription = incomeDescription;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public AccountCodeMaintenance100PutResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVACCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVACCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AccountCodeMaintenance100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public AccountCodeMaintenance100PutResponse withAcctClassCode(String acctClassCode) {
        this.acctClassCode = acctClassCode;
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

    public AccountCodeMaintenance100PutResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    @JsonProperty("deprExpTitle")
    public String getDeprExpTitle() {
        return deprExpTitle;
    }

    @JsonProperty("deprExpTitle")
    public void setDeprExpTitle(String deprExpTitle) {
        this.deprExpTitle = deprExpTitle;
    }

    public AccountCodeMaintenance100PutResponse withDeprExpTitle(String deprExpTitle) {
        this.deprExpTitle = deprExpTitle;
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

    public AccountCodeMaintenance100PutResponse withAcctCodePool(String acctCodePool) {
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

    public AccountCodeMaintenance100PutResponse withFringePct(Double fringePct) {
        this.fringePct = fringePct;
        return this;
    }

    @JsonProperty("fringeAccountTitle")
    public String getFringeAccountTitle() {
        return fringeAccountTitle;
    }

    @JsonProperty("fringeAccountTitle")
    public void setFringeAccountTitle(String fringeAccountTitle) {
        this.fringeAccountTitle = fringeAccountTitle;
    }

    public AccountCodeMaintenance100PutResponse withFringeAccountTitle(String fringeAccountTitle) {
        this.fringeAccountTitle = fringeAccountTitle;
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

    public AccountCodeMaintenance100PutResponse withAcctCodeAsset(String acctCodeAsset) {
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

    public AccountCodeMaintenance100PutResponse withAcctCodeDeprAccum(String acctCodeDeprAccum) {
        this.acctCodeDeprAccum = acctCodeDeprAccum;
        return this;
    }

    @JsonProperty("accountTypeTitle")
    public String getAccountTypeTitle() {
        return accountTypeTitle;
    }

    @JsonProperty("accountTypeTitle")
    public void setAccountTypeTitle(String accountTypeTitle) {
        this.accountTypeTitle = accountTypeTitle;
    }

    public AccountCodeMaintenance100PutResponse withAccountTypeTitle(String accountTypeTitle) {
        this.accountTypeTitle = accountTypeTitle;
        return this;
    }

    @JsonProperty("normalBalanceDescription")
    public String getNormalBalanceDescription() {
        return normalBalanceDescription;
    }

    @JsonProperty("normalBalanceDescription")
    public void setNormalBalanceDescription(String normalBalanceDescription) {
        this.normalBalanceDescription = normalBalanceDescription;
    }

    public AccountCodeMaintenance100PutResponse withNormalBalanceDescription(String normalBalanceDescription) {
        this.normalBalanceDescription = normalBalanceDescription;
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

    public AccountCodeMaintenance100PutResponse withAcctCodePred(String acctCodePred) {
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

    public AccountCodeMaintenance100PutResponse withAcctCodeFringe(String acctCodeFringe) {
        this.acctCodeFringe = acctCodeFringe;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public AccountCodeMaintenance100PutResponse withAcctCode(String acctCode) {
        this.acctCode = acctCode;
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

    public AccountCodeMaintenance100PutResponse withAcctCodeDeprExp(String acctCodeDeprExp) {
        this.acctCodeDeprExp = acctCodeDeprExp;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public Date getDisplayNchgDate() {
        return displayNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public void setDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
    }

    public AccountCodeMaintenance100PutResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    @JsonProperty("accumDeprTitle")
    public String getAccumDeprTitle() {
        return accumDeprTitle;
    }

    @JsonProperty("accumDeprTitle")
    public void setAccumDeprTitle(String accumDeprTitle) {
        this.accumDeprTitle = accumDeprTitle;
    }

    public AccountCodeMaintenance100PutResponse withAccumDeprTitle(String accumDeprTitle) {
        this.accumDeprTitle = accumDeprTitle;
        return this;
    }

    @JsonProperty("assetAccountTitle")
    public String getAssetAccountTitle() {
        return assetAccountTitle;
    }

    @JsonProperty("assetAccountTitle")
    public void setAssetAccountTitle(String assetAccountTitle) {
        this.assetAccountTitle = assetAccountTitle;
    }

    public AccountCodeMaintenance100PutResponse withAssetAccountTitle(String assetAccountTitle) {
        this.assetAccountTitle = assetAccountTitle;
        return this;
    }

    @JsonProperty("predTitle")
    public String getPredTitle() {
        return predTitle;
    }

    @JsonProperty("predTitle")
    public void setPredTitle(String predTitle) {
        this.predTitle = predTitle;
    }

    public AccountCodeMaintenance100PutResponse withPredTitle(String predTitle) {
        this.predTitle = predTitle;
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

    public AccountCodeMaintenance100PutResponse withIncomeTypeCode(String incomeTypeCode) {
        this.incomeTypeCode = incomeTypeCode;
        return this;
    }

    @JsonProperty("poolAccountTitle")
    public String getPoolAccountTitle() {
        return poolAccountTitle;
    }

    @JsonProperty("poolAccountTitle")
    public void setPoolAccountTitle(String poolAccountTitle) {
        this.poolAccountTitle = poolAccountTitle;
    }

    public AccountCodeMaintenance100PutResponse withPoolAccountTitle(String poolAccountTitle) {
        this.poolAccountTitle = poolAccountTitle;
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

    public AccountCodeMaintenance100PutResponse withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public AccountCodeMaintenance100PutResponse withAtypCode(String atypCode) {
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

    public AccountCodeMaintenance100PutResponse withNormalBal(String normalBal) {
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

    public AccountCodeMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountCodeMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("accountClassTitle");
        sb.append('=');
        sb.append(((this.accountClassTitle == null)?"<null>":this.accountClassTitle));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("incomeDescription");
        sb.append('=');
        sb.append(((this.incomeDescription == null)?"<null>":this.incomeDescription));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("acctClassCode");
        sb.append('=');
        sb.append(((this.acctClassCode == null)?"<null>":this.acctClassCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("deprExpTitle");
        sb.append('=');
        sb.append(((this.deprExpTitle == null)?"<null>":this.deprExpTitle));
        sb.append(',');
        sb.append("acctCodePool");
        sb.append('=');
        sb.append(((this.acctCodePool == null)?"<null>":this.acctCodePool));
        sb.append(',');
        sb.append("fringePct");
        sb.append('=');
        sb.append(((this.fringePct == null)?"<null>":this.fringePct));
        sb.append(',');
        sb.append("fringeAccountTitle");
        sb.append('=');
        sb.append(((this.fringeAccountTitle == null)?"<null>":this.fringeAccountTitle));
        sb.append(',');
        sb.append("acctCodeAsset");
        sb.append('=');
        sb.append(((this.acctCodeAsset == null)?"<null>":this.acctCodeAsset));
        sb.append(',');
        sb.append("acctCodeDeprAccum");
        sb.append('=');
        sb.append(((this.acctCodeDeprAccum == null)?"<null>":this.acctCodeDeprAccum));
        sb.append(',');
        sb.append("accountTypeTitle");
        sb.append('=');
        sb.append(((this.accountTypeTitle == null)?"<null>":this.accountTypeTitle));
        sb.append(',');
        sb.append("normalBalanceDescription");
        sb.append('=');
        sb.append(((this.normalBalanceDescription == null)?"<null>":this.normalBalanceDescription));
        sb.append(',');
        sb.append("acctCodePred");
        sb.append('=');
        sb.append(((this.acctCodePred == null)?"<null>":this.acctCodePred));
        sb.append(',');
        sb.append("acctCodeFringe");
        sb.append('=');
        sb.append(((this.acctCodeFringe == null)?"<null>":this.acctCodeFringe));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("acctCodeDeprExp");
        sb.append('=');
        sb.append(((this.acctCodeDeprExp == null)?"<null>":this.acctCodeDeprExp));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("accumDeprTitle");
        sb.append('=');
        sb.append(((this.accumDeprTitle == null)?"<null>":this.accumDeprTitle));
        sb.append(',');
        sb.append("assetAccountTitle");
        sb.append('=');
        sb.append(((this.assetAccountTitle == null)?"<null>":this.assetAccountTitle));
        sb.append(',');
        sb.append("predTitle");
        sb.append('=');
        sb.append(((this.predTitle == null)?"<null>":this.predTitle));
        sb.append(',');
        sb.append("incomeTypeCode");
        sb.append('=');
        sb.append(((this.incomeTypeCode == null)?"<null>":this.incomeTypeCode));
        sb.append(',');
        sb.append("poolAccountTitle");
        sb.append('=');
        sb.append(((this.poolAccountTitle == null)?"<null>":this.poolAccountTitle));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.accountClassTitle == null)? 0 :this.accountClassTitle.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.incomeDescription == null)? 0 :this.incomeDescription.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.acctClassCode == null)? 0 :this.acctClassCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.deprExpTitle == null)? 0 :this.deprExpTitle.hashCode()));
        result = ((result* 31)+((this.acctCodePool == null)? 0 :this.acctCodePool.hashCode()));
        result = ((result* 31)+((this.fringePct == null)? 0 :this.fringePct.hashCode()));
        result = ((result* 31)+((this.fringeAccountTitle == null)? 0 :this.fringeAccountTitle.hashCode()));
        result = ((result* 31)+((this.acctCodeAsset == null)? 0 :this.acctCodeAsset.hashCode()));
        result = ((result* 31)+((this.acctCodeDeprAccum == null)? 0 :this.acctCodeDeprAccum.hashCode()));
        result = ((result* 31)+((this.accountTypeTitle == null)? 0 :this.accountTypeTitle.hashCode()));
        result = ((result* 31)+((this.normalBalanceDescription == null)? 0 :this.normalBalanceDescription.hashCode()));
        result = ((result* 31)+((this.acctCodePred == null)? 0 :this.acctCodePred.hashCode()));
        result = ((result* 31)+((this.acctCodeFringe == null)? 0 :this.acctCodeFringe.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.acctCodeDeprExp == null)? 0 :this.acctCodeDeprExp.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.accumDeprTitle == null)? 0 :this.accumDeprTitle.hashCode()));
        result = ((result* 31)+((this.assetAccountTitle == null)? 0 :this.assetAccountTitle.hashCode()));
        result = ((result* 31)+((this.predTitle == null)? 0 :this.predTitle.hashCode()));
        result = ((result* 31)+((this.incomeTypeCode == null)? 0 :this.incomeTypeCode.hashCode()));
        result = ((result* 31)+((this.poolAccountTitle == null)? 0 :this.poolAccountTitle.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.normalBal == null)? 0 :this.normalBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountCodeMaintenance100PutResponse) == false) {
            return false;
        }
        AccountCodeMaintenance100PutResponse rhs = ((AccountCodeMaintenance100PutResponse) other);
        return ((((((((((((((((((((((((((((((((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd)))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.accountClassTitle == rhs.accountClassTitle)||((this.accountClassTitle!= null)&&this.accountClassTitle.equals(rhs.accountClassTitle))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.incomeDescription == rhs.incomeDescription)||((this.incomeDescription!= null)&&this.incomeDescription.equals(rhs.incomeDescription))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.acctClassCode == rhs.acctClassCode)||((this.acctClassCode!= null)&&this.acctClassCode.equals(rhs.acctClassCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.deprExpTitle == rhs.deprExpTitle)||((this.deprExpTitle!= null)&&this.deprExpTitle.equals(rhs.deprExpTitle))))&&((this.acctCodePool == rhs.acctCodePool)||((this.acctCodePool!= null)&&this.acctCodePool.equals(rhs.acctCodePool))))&&((this.fringePct == rhs.fringePct)||((this.fringePct!= null)&&this.fringePct.equals(rhs.fringePct))))&&((this.fringeAccountTitle == rhs.fringeAccountTitle)||((this.fringeAccountTitle!= null)&&this.fringeAccountTitle.equals(rhs.fringeAccountTitle))))&&((this.acctCodeAsset == rhs.acctCodeAsset)||((this.acctCodeAsset!= null)&&this.acctCodeAsset.equals(rhs.acctCodeAsset))))&&((this.acctCodeDeprAccum == rhs.acctCodeDeprAccum)||((this.acctCodeDeprAccum!= null)&&this.acctCodeDeprAccum.equals(rhs.acctCodeDeprAccum))))&&((this.accountTypeTitle == rhs.accountTypeTitle)||((this.accountTypeTitle!= null)&&this.accountTypeTitle.equals(rhs.accountTypeTitle))))&&((this.normalBalanceDescription == rhs.normalBalanceDescription)||((this.normalBalanceDescription!= null)&&this.normalBalanceDescription.equals(rhs.normalBalanceDescription))))&&((this.acctCodePred == rhs.acctCodePred)||((this.acctCodePred!= null)&&this.acctCodePred.equals(rhs.acctCodePred))))&&((this.acctCodeFringe == rhs.acctCodeFringe)||((this.acctCodeFringe!= null)&&this.acctCodeFringe.equals(rhs.acctCodeFringe))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.acctCodeDeprExp == rhs.acctCodeDeprExp)||((this.acctCodeDeprExp!= null)&&this.acctCodeDeprExp.equals(rhs.acctCodeDeprExp))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.accumDeprTitle == rhs.accumDeprTitle)||((this.accumDeprTitle!= null)&&this.accumDeprTitle.equals(rhs.accumDeprTitle))))&&((this.assetAccountTitle == rhs.assetAccountTitle)||((this.assetAccountTitle!= null)&&this.assetAccountTitle.equals(rhs.assetAccountTitle))))&&((this.predTitle == rhs.predTitle)||((this.predTitle!= null)&&this.predTitle.equals(rhs.predTitle))))&&((this.incomeTypeCode == rhs.incomeTypeCode)||((this.incomeTypeCode!= null)&&this.incomeTypeCode.equals(rhs.incomeTypeCode))))&&((this.poolAccountTitle == rhs.poolAccountTitle)||((this.poolAccountTitle!= null)&&this.poolAccountTitle.equals(rhs.poolAccountTitle))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.normalBal == rhs.normalBal)||((this.normalBal!= null)&&this.normalBal.equals(rhs.normalBal))));
    }

}
