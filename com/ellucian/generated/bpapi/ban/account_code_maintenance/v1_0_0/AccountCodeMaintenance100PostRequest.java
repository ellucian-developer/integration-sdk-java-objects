
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
    "acctCodePred",
    "dataEntryInd",
    "coasCode",
    "title",
    "acctCodeFringe",
    "acctCode",
    "acctCodeDeprExp",
    "effDate",
    "acctClassCode",
    "statusInd",
    "incomeTypeCode",
    "acctCodePool",
    "fringePct",
    "termDate",
    "atypCode",
    "acctCodeAsset",
    "acctCodeDeprAccum",
    "normalBal"
})
@Generated("jsonschema2pojo")
public class AccountCodeMaintenance100PostRequest {

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

    public AccountCodeMaintenance100PostRequest withAcctCodePred(String acctCodePred) {
        this.acctCodePred = acctCodePred;
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

    public AccountCodeMaintenance100PostRequest withDataEntryInd(String dataEntryInd) {
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

    public AccountCodeMaintenance100PostRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public AccountCodeMaintenance100PostRequest withTitle(String title) {
        this.title = title;
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

    public AccountCodeMaintenance100PostRequest withAcctCodeFringe(String acctCodeFringe) {
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

    public AccountCodeMaintenance100PostRequest withAcctCode(String acctCode) {
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

    public AccountCodeMaintenance100PostRequest withAcctCodeDeprExp(String acctCodeDeprExp) {
        this.acctCodeDeprExp = acctCodeDeprExp;
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

    public AccountCodeMaintenance100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public AccountCodeMaintenance100PostRequest withAcctClassCode(String acctClassCode) {
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

    public AccountCodeMaintenance100PostRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
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

    public AccountCodeMaintenance100PostRequest withIncomeTypeCode(String incomeTypeCode) {
        this.incomeTypeCode = incomeTypeCode;
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

    public AccountCodeMaintenance100PostRequest withAcctCodePool(String acctCodePool) {
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

    public AccountCodeMaintenance100PostRequest withFringePct(Double fringePct) {
        this.fringePct = fringePct;
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

    public AccountCodeMaintenance100PostRequest withTermDate(Date termDate) {
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

    public AccountCodeMaintenance100PostRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
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

    public AccountCodeMaintenance100PostRequest withAcctCodeAsset(String acctCodeAsset) {
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

    public AccountCodeMaintenance100PostRequest withAcctCodeDeprAccum(String acctCodeDeprAccum) {
        this.acctCodeDeprAccum = acctCodeDeprAccum;
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

    public AccountCodeMaintenance100PostRequest withNormalBal(String normalBal) {
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

    public AccountCodeMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountCodeMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acctCodePred");
        sb.append('=');
        sb.append(((this.acctCodePred == null)?"<null>":this.acctCodePred));
        sb.append(',');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("acctClassCode");
        sb.append('=');
        sb.append(((this.acctClassCode == null)?"<null>":this.acctClassCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("incomeTypeCode");
        sb.append('=');
        sb.append(((this.incomeTypeCode == null)?"<null>":this.incomeTypeCode));
        sb.append(',');
        sb.append("acctCodePool");
        sb.append('=');
        sb.append(((this.acctCodePool == null)?"<null>":this.acctCodePool));
        sb.append(',');
        sb.append("fringePct");
        sb.append('=');
        sb.append(((this.fringePct == null)?"<null>":this.fringePct));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("acctCodeAsset");
        sb.append('=');
        sb.append(((this.acctCodeAsset == null)?"<null>":this.acctCodeAsset));
        sb.append(',');
        sb.append("acctCodeDeprAccum");
        sb.append('=');
        sb.append(((this.acctCodeDeprAccum == null)?"<null>":this.acctCodeDeprAccum));
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
        result = ((result* 31)+((this.acctCodePred == null)? 0 :this.acctCodePred.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.acctCodeFringe == null)? 0 :this.acctCodeFringe.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.acctCodeDeprExp == null)? 0 :this.acctCodeDeprExp.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.acctClassCode == null)? 0 :this.acctClassCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.incomeTypeCode == null)? 0 :this.incomeTypeCode.hashCode()));
        result = ((result* 31)+((this.acctCodePool == null)? 0 :this.acctCodePool.hashCode()));
        result = ((result* 31)+((this.fringePct == null)? 0 :this.fringePct.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.acctCodeAsset == null)? 0 :this.acctCodeAsset.hashCode()));
        result = ((result* 31)+((this.acctCodeDeprAccum == null)? 0 :this.acctCodeDeprAccum.hashCode()));
        result = ((result* 31)+((this.normalBal == null)? 0 :this.normalBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountCodeMaintenance100PostRequest) == false) {
            return false;
        }
        AccountCodeMaintenance100PostRequest rhs = ((AccountCodeMaintenance100PostRequest) other);
        return ((((((((((((((((((((this.acctCodePred == rhs.acctCodePred)||((this.acctCodePred!= null)&&this.acctCodePred.equals(rhs.acctCodePred)))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.acctCodeFringe == rhs.acctCodeFringe)||((this.acctCodeFringe!= null)&&this.acctCodeFringe.equals(rhs.acctCodeFringe))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.acctCodeDeprExp == rhs.acctCodeDeprExp)||((this.acctCodeDeprExp!= null)&&this.acctCodeDeprExp.equals(rhs.acctCodeDeprExp))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.acctClassCode == rhs.acctClassCode)||((this.acctClassCode!= null)&&this.acctClassCode.equals(rhs.acctClassCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.incomeTypeCode == rhs.incomeTypeCode)||((this.incomeTypeCode!= null)&&this.incomeTypeCode.equals(rhs.incomeTypeCode))))&&((this.acctCodePool == rhs.acctCodePool)||((this.acctCodePool!= null)&&this.acctCodePool.equals(rhs.acctCodePool))))&&((this.fringePct == rhs.fringePct)||((this.fringePct!= null)&&this.fringePct.equals(rhs.fringePct))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.acctCodeAsset == rhs.acctCodeAsset)||((this.acctCodeAsset!= null)&&this.acctCodeAsset.equals(rhs.acctCodeAsset))))&&((this.acctCodeDeprAccum == rhs.acctCodeDeprAccum)||((this.acctCodeDeprAccum!= null)&&this.acctCodeDeprAccum.equals(rhs.acctCodeDeprAccum))))&&((this.normalBal == rhs.normalBal)||((this.normalBal!= null)&&this.normalBal.equals(rhs.normalBal))));
    }

}
