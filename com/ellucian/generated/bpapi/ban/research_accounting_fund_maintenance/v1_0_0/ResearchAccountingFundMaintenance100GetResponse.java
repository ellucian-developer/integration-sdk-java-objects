
package com.ellucian.generated.bpapi.ban.research_accounting_fund_maintenance.v1_0_0;

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
    "inddCodeDistrName",
    "withholdingPercent",
    "code",
    "wholdingArAcctCodeDesc",
    "basiCodeIcName",
    "coasCode",
    "acctCodeRev",
    "cstrCodeRateName",
    "grntCodeDisplay1",
    "cstaCodeCharge",
    "cstdCodeDistr",
    "effDate",
    "encMultYrInd",
    "grntTitleDisplay1",
    "withholdingAmt",
    "cashReceiptBankCode",
    "billedArAcctCode",
    "indrCodeRateName",
    "basiCodeIc",
    "wholdingArAcctCode",
    "budgPrdStartDate",
    "budgPrdEndDate",
    "inddCodeDistr",
    "idcEncInd",
    "indrCodeRate",
    "billedArAcctCodeDesc",
    "cstaCodeChargeName",
    "acctCodeAccr",
    "indaCodeChargeName",
    "cstdCodeDistrName",
    "basiCodeCs",
    "displayNchgDate",
    "cstrCodeRate",
    "basiCodeCsName",
    "termDate",
    "indaCodeCharge",
    "ftvfundTitle"
})
@Generated("jsonschema2pojo")
public class ResearchAccountingFundMaintenance100GetResponse {

    @JsonProperty("inddCodeDistrName")
    private String inddCodeDistrName;
    /**
     * Retainage Percent
     * <p>
     * Lineage reference object : FRVFUND_WITHHOLDING_PERCENT
     * 
     */
    @JsonProperty("withholdingPercent")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_WITHHOLDING_PERCENT")
    private Double withholdingPercent;
    /**
     * Fund
     * <p>
     * Lineage reference object : FRVFUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_CODE")
    private String code;
    @JsonProperty("wholdingArAcctCodeDesc")
    private String wholdingArAcctCodeDesc;
    @JsonProperty("basiCodeIcName")
    private String basiCodeIcName;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Revenue Account
     * <p>
     * 
     * 
     */
    @JsonProperty("acctCodeRev")
    private String acctCodeRev;
    @JsonProperty("cstrCodeRateName")
    private String cstrCodeRateName;
    /**
     * Grant
     * <p>
     * 
     * 
     */
    @JsonProperty("grntCodeDisplay1")
    private String grntCodeDisplay1;
    /**
     * Cost Share Credit Account Code
     * <p>
     * Lineage reference object : FRVFUND_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta
     * 
     */
    @JsonProperty("cstaCodeCharge")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta")
    private String cstaCodeCharge;
    /**
     * Cost Share Distribute From Code
     * <p>
     * Lineage reference object : FRVFUND_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd
     * 
     */
    @JsonProperty("cstdCodeDistr")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd")
    private String cstdCodeDistr;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FRVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_EFF_DATE")
    private Date effDate;
    /**
     * Encumber Multi Year Labor
     * <p>
     * Lineage reference object : FRVFUND_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("encMultYrInd")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_ENC_MULT_YR_IND")
    private String encMultYrInd;
    @JsonProperty("grntTitleDisplay1")
    private String grntTitleDisplay1;
    /**
     * Retainage Amount
     * <p>
     * Lineage reference object : FRVFUND_WITHHOLDING_AMT
     * 
     */
    @JsonProperty("withholdingAmt")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_WITHHOLDING_AMT")
    private Double withholdingAmt;
    /**
     * Cash Receipt Bank Code
     * <p>
     * 
     * 
     */
    @JsonProperty("cashReceiptBankCode")
    private String cashReceiptBankCode;
    /**
     * Billed Accounts Receivable
     * <p>
     * Lineage reference object : FRVFUND_BILLED_AR_ACCT_CODE
     * 
     */
    @JsonProperty("billedArAcctCode")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_BILLED_AR_ACCT_CODE")
    private String billedArAcctCode;
    @JsonProperty("indrCodeRateName")
    private String indrCodeRateName;
    /**
     * Indirect Cost Basis
     * <p>
     * Lineage reference object : FRVFUND_BASI_CODE_IC
     * 
     */
    @JsonProperty("basiCodeIc")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_BASI_CODE_IC")
    private String basiCodeIc;
    /**
     * Retainage Accounts Receivable
     * <p>
     * Lineage reference object : FRVFUND_WHOLDING_AR_ACCT_CODE
     * 
     */
    @JsonProperty("wholdingArAcctCode")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_WHOLDING_AR_ACCT_CODE")
    private String wholdingArAcctCode;
    /**
     * Budget Period Start Date
     * <p>
     * Lineage reference object : FRVFUND_BUDG_PRD_START_DATE
     * 
     */
    @JsonProperty("budgPrdStartDate")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_BUDG_PRD_START_DATE")
    private Date budgPrdStartDate;
    /**
     * Budget Period End Date
     * <p>
     * Lineage reference object : FRVFUND_BUDG_PRD_END_DATE
     * 
     */
    @JsonProperty("budgPrdEndDate")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_BUDG_PRD_END_DATE")
    private Date budgPrdEndDate;
    /**
     * Indirect Cost Distribute To Code
     * <p>
     * Lineage reference object : FRVFUND_INDD_CODE_DISTR
     * 
     */
    @JsonProperty("inddCodeDistr")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_INDD_CODE_DISTR")
    private String inddCodeDistr;
    /**
     * Indirect Cost Encumbering
     * <p>
     * Lineage reference object : FRVFUND_IDC_ENC_IND
     * 
     */
    @JsonProperty("idcEncInd")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_IDC_ENC_IND")
    private String idcEncInd;
    /**
     * Indirect Cost Rate Code
     * <p>
     * Lineage reference object : FRVFUND_INDR_CODE_RATE
     * 
     */
    @JsonProperty("indrCodeRate")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_INDR_CODE_RATE")
    private String indrCodeRate;
    @JsonProperty("billedArAcctCodeDesc")
    private String billedArAcctCodeDesc;
    @JsonProperty("cstaCodeChargeName")
    private String cstaCodeChargeName;
    /**
     * Unbilled Accounts Receivable
     * <p>
     * 
     * 
     */
    @JsonProperty("acctCodeAccr")
    private String acctCodeAccr;
    @JsonProperty("indaCodeChargeName")
    private String indaCodeChargeName;
    @JsonProperty("cstdCodeDistrName")
    private String cstdCodeDistrName;
    /**
     * Cost Share Basis
     * <p>
     * Lineage reference object : FRVFUND_BASI_CODE_CS
     * 
     */
    @JsonProperty("basiCodeCs")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_BASI_CODE_CS")
    private String basiCodeCs;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    /**
     * Cost Share Rate Code
     * <p>
     * Lineage reference object : FRVFUND_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr
     * 
     */
    @JsonProperty("cstrCodeRate")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr")
    private String cstrCodeRate;
    @JsonProperty("basiCodeCsName")
    private String basiCodeCsName;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FRVFUND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_TERM_DATE")
    private Date termDate;
    /**
     * Indirect Cost Charge Account Code
     * <p>
     * Lineage reference object : FRVFUND_INDA_CODE_CHARGE
     * 
     */
    @JsonProperty("indaCodeCharge")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_INDA_CODE_CHARGE")
    private String indaCodeCharge;
    @JsonProperty("ftvfundTitle")
    private String ftvfundTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("inddCodeDistrName")
    public String getInddCodeDistrName() {
        return inddCodeDistrName;
    }

    @JsonProperty("inddCodeDistrName")
    public void setInddCodeDistrName(String inddCodeDistrName) {
        this.inddCodeDistrName = inddCodeDistrName;
    }

    public ResearchAccountingFundMaintenance100GetResponse withInddCodeDistrName(String inddCodeDistrName) {
        this.inddCodeDistrName = inddCodeDistrName;
        return this;
    }

    /**
     * Retainage Percent
     * <p>
     * Lineage reference object : FRVFUND_WITHHOLDING_PERCENT
     * 
     */
    @JsonProperty("withholdingPercent")
    public Double getWithholdingPercent() {
        return withholdingPercent;
    }

    /**
     * Retainage Percent
     * <p>
     * Lineage reference object : FRVFUND_WITHHOLDING_PERCENT
     * 
     */
    @JsonProperty("withholdingPercent")
    public void setWithholdingPercent(Double withholdingPercent) {
        this.withholdingPercent = withholdingPercent;
    }

    public ResearchAccountingFundMaintenance100GetResponse withWithholdingPercent(Double withholdingPercent) {
        this.withholdingPercent = withholdingPercent;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FRVFUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FRVFUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ResearchAccountingFundMaintenance100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("wholdingArAcctCodeDesc")
    public String getWholdingArAcctCodeDesc() {
        return wholdingArAcctCodeDesc;
    }

    @JsonProperty("wholdingArAcctCodeDesc")
    public void setWholdingArAcctCodeDesc(String wholdingArAcctCodeDesc) {
        this.wholdingArAcctCodeDesc = wholdingArAcctCodeDesc;
    }

    public ResearchAccountingFundMaintenance100GetResponse withWholdingArAcctCodeDesc(String wholdingArAcctCodeDesc) {
        this.wholdingArAcctCodeDesc = wholdingArAcctCodeDesc;
        return this;
    }

    @JsonProperty("basiCodeIcName")
    public String getBasiCodeIcName() {
        return basiCodeIcName;
    }

    @JsonProperty("basiCodeIcName")
    public void setBasiCodeIcName(String basiCodeIcName) {
        this.basiCodeIcName = basiCodeIcName;
    }

    public ResearchAccountingFundMaintenance100GetResponse withBasiCodeIcName(String basiCodeIcName) {
        this.basiCodeIcName = basiCodeIcName;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FRVFUND_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ResearchAccountingFundMaintenance100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Revenue Account
     * <p>
     * 
     * 
     */
    @JsonProperty("acctCodeRev")
    public String getAcctCodeRev() {
        return acctCodeRev;
    }

    /**
     * Revenue Account
     * <p>
     * 
     * 
     */
    @JsonProperty("acctCodeRev")
    public void setAcctCodeRev(String acctCodeRev) {
        this.acctCodeRev = acctCodeRev;
    }

    public ResearchAccountingFundMaintenance100GetResponse withAcctCodeRev(String acctCodeRev) {
        this.acctCodeRev = acctCodeRev;
        return this;
    }

    @JsonProperty("cstrCodeRateName")
    public String getCstrCodeRateName() {
        return cstrCodeRateName;
    }

    @JsonProperty("cstrCodeRateName")
    public void setCstrCodeRateName(String cstrCodeRateName) {
        this.cstrCodeRateName = cstrCodeRateName;
    }

    public ResearchAccountingFundMaintenance100GetResponse withCstrCodeRateName(String cstrCodeRateName) {
        this.cstrCodeRateName = cstrCodeRateName;
        return this;
    }

    /**
     * Grant
     * <p>
     * 
     * 
     */
    @JsonProperty("grntCodeDisplay1")
    public String getGrntCodeDisplay1() {
        return grntCodeDisplay1;
    }

    /**
     * Grant
     * <p>
     * 
     * 
     */
    @JsonProperty("grntCodeDisplay1")
    public void setGrntCodeDisplay1(String grntCodeDisplay1) {
        this.grntCodeDisplay1 = grntCodeDisplay1;
    }

    public ResearchAccountingFundMaintenance100GetResponse withGrntCodeDisplay1(String grntCodeDisplay1) {
        this.grntCodeDisplay1 = grntCodeDisplay1;
        return this;
    }

    /**
     * Cost Share Credit Account Code
     * <p>
     * Lineage reference object : FRVFUND_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta
     * 
     */
    @JsonProperty("cstaCodeCharge")
    public String getCstaCodeCharge() {
        return cstaCodeCharge;
    }

    /**
     * Cost Share Credit Account Code
     * <p>
     * Lineage reference object : FRVFUND_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta
     * 
     */
    @JsonProperty("cstaCodeCharge")
    public void setCstaCodeCharge(String cstaCodeCharge) {
        this.cstaCodeCharge = cstaCodeCharge;
    }

    public ResearchAccountingFundMaintenance100GetResponse withCstaCodeCharge(String cstaCodeCharge) {
        this.cstaCodeCharge = cstaCodeCharge;
        return this;
    }

    /**
     * Cost Share Distribute From Code
     * <p>
     * Lineage reference object : FRVFUND_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd
     * 
     */
    @JsonProperty("cstdCodeDistr")
    public String getCstdCodeDistr() {
        return cstdCodeDistr;
    }

    /**
     * Cost Share Distribute From Code
     * <p>
     * Lineage reference object : FRVFUND_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd
     * 
     */
    @JsonProperty("cstdCodeDistr")
    public void setCstdCodeDistr(String cstdCodeDistr) {
        this.cstdCodeDistr = cstdCodeDistr;
    }

    public ResearchAccountingFundMaintenance100GetResponse withCstdCodeDistr(String cstdCodeDistr) {
        this.cstdCodeDistr = cstdCodeDistr;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FRVFUND_EFF_DATE
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
     * Lineage reference object : FRVFUND_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public ResearchAccountingFundMaintenance100GetResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Encumber Multi Year Labor
     * <p>
     * Lineage reference object : FRVFUND_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("encMultYrInd")
    public String getEncMultYrInd() {
        return encMultYrInd;
    }

    /**
     * Encumber Multi Year Labor
     * <p>
     * Lineage reference object : FRVFUND_ENC_MULT_YR_IND
     * 
     */
    @JsonProperty("encMultYrInd")
    public void setEncMultYrInd(String encMultYrInd) {
        this.encMultYrInd = encMultYrInd;
    }

    public ResearchAccountingFundMaintenance100GetResponse withEncMultYrInd(String encMultYrInd) {
        this.encMultYrInd = encMultYrInd;
        return this;
    }

    @JsonProperty("grntTitleDisplay1")
    public String getGrntTitleDisplay1() {
        return grntTitleDisplay1;
    }

    @JsonProperty("grntTitleDisplay1")
    public void setGrntTitleDisplay1(String grntTitleDisplay1) {
        this.grntTitleDisplay1 = grntTitleDisplay1;
    }

    public ResearchAccountingFundMaintenance100GetResponse withGrntTitleDisplay1(String grntTitleDisplay1) {
        this.grntTitleDisplay1 = grntTitleDisplay1;
        return this;
    }

    /**
     * Retainage Amount
     * <p>
     * Lineage reference object : FRVFUND_WITHHOLDING_AMT
     * 
     */
    @JsonProperty("withholdingAmt")
    public Double getWithholdingAmt() {
        return withholdingAmt;
    }

    /**
     * Retainage Amount
     * <p>
     * Lineage reference object : FRVFUND_WITHHOLDING_AMT
     * 
     */
    @JsonProperty("withholdingAmt")
    public void setWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
    }

    public ResearchAccountingFundMaintenance100GetResponse withWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
        return this;
    }

    /**
     * Cash Receipt Bank Code
     * <p>
     * 
     * 
     */
    @JsonProperty("cashReceiptBankCode")
    public String getCashReceiptBankCode() {
        return cashReceiptBankCode;
    }

    /**
     * Cash Receipt Bank Code
     * <p>
     * 
     * 
     */
    @JsonProperty("cashReceiptBankCode")
    public void setCashReceiptBankCode(String cashReceiptBankCode) {
        this.cashReceiptBankCode = cashReceiptBankCode;
    }

    public ResearchAccountingFundMaintenance100GetResponse withCashReceiptBankCode(String cashReceiptBankCode) {
        this.cashReceiptBankCode = cashReceiptBankCode;
        return this;
    }

    /**
     * Billed Accounts Receivable
     * <p>
     * Lineage reference object : FRVFUND_BILLED_AR_ACCT_CODE
     * 
     */
    @JsonProperty("billedArAcctCode")
    public String getBilledArAcctCode() {
        return billedArAcctCode;
    }

    /**
     * Billed Accounts Receivable
     * <p>
     * Lineage reference object : FRVFUND_BILLED_AR_ACCT_CODE
     * 
     */
    @JsonProperty("billedArAcctCode")
    public void setBilledArAcctCode(String billedArAcctCode) {
        this.billedArAcctCode = billedArAcctCode;
    }

    public ResearchAccountingFundMaintenance100GetResponse withBilledArAcctCode(String billedArAcctCode) {
        this.billedArAcctCode = billedArAcctCode;
        return this;
    }

    @JsonProperty("indrCodeRateName")
    public String getIndrCodeRateName() {
        return indrCodeRateName;
    }

    @JsonProperty("indrCodeRateName")
    public void setIndrCodeRateName(String indrCodeRateName) {
        this.indrCodeRateName = indrCodeRateName;
    }

    public ResearchAccountingFundMaintenance100GetResponse withIndrCodeRateName(String indrCodeRateName) {
        this.indrCodeRateName = indrCodeRateName;
        return this;
    }

    /**
     * Indirect Cost Basis
     * <p>
     * Lineage reference object : FRVFUND_BASI_CODE_IC
     * 
     */
    @JsonProperty("basiCodeIc")
    public String getBasiCodeIc() {
        return basiCodeIc;
    }

    /**
     * Indirect Cost Basis
     * <p>
     * Lineage reference object : FRVFUND_BASI_CODE_IC
     * 
     */
    @JsonProperty("basiCodeIc")
    public void setBasiCodeIc(String basiCodeIc) {
        this.basiCodeIc = basiCodeIc;
    }

    public ResearchAccountingFundMaintenance100GetResponse withBasiCodeIc(String basiCodeIc) {
        this.basiCodeIc = basiCodeIc;
        return this;
    }

    /**
     * Retainage Accounts Receivable
     * <p>
     * Lineage reference object : FRVFUND_WHOLDING_AR_ACCT_CODE
     * 
     */
    @JsonProperty("wholdingArAcctCode")
    public String getWholdingArAcctCode() {
        return wholdingArAcctCode;
    }

    /**
     * Retainage Accounts Receivable
     * <p>
     * Lineage reference object : FRVFUND_WHOLDING_AR_ACCT_CODE
     * 
     */
    @JsonProperty("wholdingArAcctCode")
    public void setWholdingArAcctCode(String wholdingArAcctCode) {
        this.wholdingArAcctCode = wholdingArAcctCode;
    }

    public ResearchAccountingFundMaintenance100GetResponse withWholdingArAcctCode(String wholdingArAcctCode) {
        this.wholdingArAcctCode = wholdingArAcctCode;
        return this;
    }

    /**
     * Budget Period Start Date
     * <p>
     * Lineage reference object : FRVFUND_BUDG_PRD_START_DATE
     * 
     */
    @JsonProperty("budgPrdStartDate")
    public Date getBudgPrdStartDate() {
        return budgPrdStartDate;
    }

    /**
     * Budget Period Start Date
     * <p>
     * Lineage reference object : FRVFUND_BUDG_PRD_START_DATE
     * 
     */
    @JsonProperty("budgPrdStartDate")
    public void setBudgPrdStartDate(Date budgPrdStartDate) {
        this.budgPrdStartDate = budgPrdStartDate;
    }

    public ResearchAccountingFundMaintenance100GetResponse withBudgPrdStartDate(Date budgPrdStartDate) {
        this.budgPrdStartDate = budgPrdStartDate;
        return this;
    }

    /**
     * Budget Period End Date
     * <p>
     * Lineage reference object : FRVFUND_BUDG_PRD_END_DATE
     * 
     */
    @JsonProperty("budgPrdEndDate")
    public Date getBudgPrdEndDate() {
        return budgPrdEndDate;
    }

    /**
     * Budget Period End Date
     * <p>
     * Lineage reference object : FRVFUND_BUDG_PRD_END_DATE
     * 
     */
    @JsonProperty("budgPrdEndDate")
    public void setBudgPrdEndDate(Date budgPrdEndDate) {
        this.budgPrdEndDate = budgPrdEndDate;
    }

    public ResearchAccountingFundMaintenance100GetResponse withBudgPrdEndDate(Date budgPrdEndDate) {
        this.budgPrdEndDate = budgPrdEndDate;
        return this;
    }

    /**
     * Indirect Cost Distribute To Code
     * <p>
     * Lineage reference object : FRVFUND_INDD_CODE_DISTR
     * 
     */
    @JsonProperty("inddCodeDistr")
    public String getInddCodeDistr() {
        return inddCodeDistr;
    }

    /**
     * Indirect Cost Distribute To Code
     * <p>
     * Lineage reference object : FRVFUND_INDD_CODE_DISTR
     * 
     */
    @JsonProperty("inddCodeDistr")
    public void setInddCodeDistr(String inddCodeDistr) {
        this.inddCodeDistr = inddCodeDistr;
    }

    public ResearchAccountingFundMaintenance100GetResponse withInddCodeDistr(String inddCodeDistr) {
        this.inddCodeDistr = inddCodeDistr;
        return this;
    }

    /**
     * Indirect Cost Encumbering
     * <p>
     * Lineage reference object : FRVFUND_IDC_ENC_IND
     * 
     */
    @JsonProperty("idcEncInd")
    public String getIdcEncInd() {
        return idcEncInd;
    }

    /**
     * Indirect Cost Encumbering
     * <p>
     * Lineage reference object : FRVFUND_IDC_ENC_IND
     * 
     */
    @JsonProperty("idcEncInd")
    public void setIdcEncInd(String idcEncInd) {
        this.idcEncInd = idcEncInd;
    }

    public ResearchAccountingFundMaintenance100GetResponse withIdcEncInd(String idcEncInd) {
        this.idcEncInd = idcEncInd;
        return this;
    }

    /**
     * Indirect Cost Rate Code
     * <p>
     * Lineage reference object : FRVFUND_INDR_CODE_RATE
     * 
     */
    @JsonProperty("indrCodeRate")
    public String getIndrCodeRate() {
        return indrCodeRate;
    }

    /**
     * Indirect Cost Rate Code
     * <p>
     * Lineage reference object : FRVFUND_INDR_CODE_RATE
     * 
     */
    @JsonProperty("indrCodeRate")
    public void setIndrCodeRate(String indrCodeRate) {
        this.indrCodeRate = indrCodeRate;
    }

    public ResearchAccountingFundMaintenance100GetResponse withIndrCodeRate(String indrCodeRate) {
        this.indrCodeRate = indrCodeRate;
        return this;
    }

    @JsonProperty("billedArAcctCodeDesc")
    public String getBilledArAcctCodeDesc() {
        return billedArAcctCodeDesc;
    }

    @JsonProperty("billedArAcctCodeDesc")
    public void setBilledArAcctCodeDesc(String billedArAcctCodeDesc) {
        this.billedArAcctCodeDesc = billedArAcctCodeDesc;
    }

    public ResearchAccountingFundMaintenance100GetResponse withBilledArAcctCodeDesc(String billedArAcctCodeDesc) {
        this.billedArAcctCodeDesc = billedArAcctCodeDesc;
        return this;
    }

    @JsonProperty("cstaCodeChargeName")
    public String getCstaCodeChargeName() {
        return cstaCodeChargeName;
    }

    @JsonProperty("cstaCodeChargeName")
    public void setCstaCodeChargeName(String cstaCodeChargeName) {
        this.cstaCodeChargeName = cstaCodeChargeName;
    }

    public ResearchAccountingFundMaintenance100GetResponse withCstaCodeChargeName(String cstaCodeChargeName) {
        this.cstaCodeChargeName = cstaCodeChargeName;
        return this;
    }

    /**
     * Unbilled Accounts Receivable
     * <p>
     * 
     * 
     */
    @JsonProperty("acctCodeAccr")
    public String getAcctCodeAccr() {
        return acctCodeAccr;
    }

    /**
     * Unbilled Accounts Receivable
     * <p>
     * 
     * 
     */
    @JsonProperty("acctCodeAccr")
    public void setAcctCodeAccr(String acctCodeAccr) {
        this.acctCodeAccr = acctCodeAccr;
    }

    public ResearchAccountingFundMaintenance100GetResponse withAcctCodeAccr(String acctCodeAccr) {
        this.acctCodeAccr = acctCodeAccr;
        return this;
    }

    @JsonProperty("indaCodeChargeName")
    public String getIndaCodeChargeName() {
        return indaCodeChargeName;
    }

    @JsonProperty("indaCodeChargeName")
    public void setIndaCodeChargeName(String indaCodeChargeName) {
        this.indaCodeChargeName = indaCodeChargeName;
    }

    public ResearchAccountingFundMaintenance100GetResponse withIndaCodeChargeName(String indaCodeChargeName) {
        this.indaCodeChargeName = indaCodeChargeName;
        return this;
    }

    @JsonProperty("cstdCodeDistrName")
    public String getCstdCodeDistrName() {
        return cstdCodeDistrName;
    }

    @JsonProperty("cstdCodeDistrName")
    public void setCstdCodeDistrName(String cstdCodeDistrName) {
        this.cstdCodeDistrName = cstdCodeDistrName;
    }

    public ResearchAccountingFundMaintenance100GetResponse withCstdCodeDistrName(String cstdCodeDistrName) {
        this.cstdCodeDistrName = cstdCodeDistrName;
        return this;
    }

    /**
     * Cost Share Basis
     * <p>
     * Lineage reference object : FRVFUND_BASI_CODE_CS
     * 
     */
    @JsonProperty("basiCodeCs")
    public String getBasiCodeCs() {
        return basiCodeCs;
    }

    /**
     * Cost Share Basis
     * <p>
     * Lineage reference object : FRVFUND_BASI_CODE_CS
     * 
     */
    @JsonProperty("basiCodeCs")
    public void setBasiCodeCs(String basiCodeCs) {
        this.basiCodeCs = basiCodeCs;
    }

    public ResearchAccountingFundMaintenance100GetResponse withBasiCodeCs(String basiCodeCs) {
        this.basiCodeCs = basiCodeCs;
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

    public ResearchAccountingFundMaintenance100GetResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    /**
     * Cost Share Rate Code
     * <p>
     * Lineage reference object : FRVFUND_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr
     * 
     */
    @JsonProperty("cstrCodeRate")
    public String getCstrCodeRate() {
        return cstrCodeRate;
    }

    /**
     * Cost Share Rate Code
     * <p>
     * Lineage reference object : FRVFUND_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr
     * 
     */
    @JsonProperty("cstrCodeRate")
    public void setCstrCodeRate(String cstrCodeRate) {
        this.cstrCodeRate = cstrCodeRate;
    }

    public ResearchAccountingFundMaintenance100GetResponse withCstrCodeRate(String cstrCodeRate) {
        this.cstrCodeRate = cstrCodeRate;
        return this;
    }

    @JsonProperty("basiCodeCsName")
    public String getBasiCodeCsName() {
        return basiCodeCsName;
    }

    @JsonProperty("basiCodeCsName")
    public void setBasiCodeCsName(String basiCodeCsName) {
        this.basiCodeCsName = basiCodeCsName;
    }

    public ResearchAccountingFundMaintenance100GetResponse withBasiCodeCsName(String basiCodeCsName) {
        this.basiCodeCsName = basiCodeCsName;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FRVFUND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FRVFUND_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public ResearchAccountingFundMaintenance100GetResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Indirect Cost Charge Account Code
     * <p>
     * Lineage reference object : FRVFUND_INDA_CODE_CHARGE
     * 
     */
    @JsonProperty("indaCodeCharge")
    public String getIndaCodeCharge() {
        return indaCodeCharge;
    }

    /**
     * Indirect Cost Charge Account Code
     * <p>
     * Lineage reference object : FRVFUND_INDA_CODE_CHARGE
     * 
     */
    @JsonProperty("indaCodeCharge")
    public void setIndaCodeCharge(String indaCodeCharge) {
        this.indaCodeCharge = indaCodeCharge;
    }

    public ResearchAccountingFundMaintenance100GetResponse withIndaCodeCharge(String indaCodeCharge) {
        this.indaCodeCharge = indaCodeCharge;
        return this;
    }

    @JsonProperty("ftvfundTitle")
    public String getFtvfundTitle() {
        return ftvfundTitle;
    }

    @JsonProperty("ftvfundTitle")
    public void setFtvfundTitle(String ftvfundTitle) {
        this.ftvfundTitle = ftvfundTitle;
    }

    public ResearchAccountingFundMaintenance100GetResponse withFtvfundTitle(String ftvfundTitle) {
        this.ftvfundTitle = ftvfundTitle;
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

    public ResearchAccountingFundMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResearchAccountingFundMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("inddCodeDistrName");
        sb.append('=');
        sb.append(((this.inddCodeDistrName == null)?"<null>":this.inddCodeDistrName));
        sb.append(',');
        sb.append("withholdingPercent");
        sb.append('=');
        sb.append(((this.withholdingPercent == null)?"<null>":this.withholdingPercent));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("wholdingArAcctCodeDesc");
        sb.append('=');
        sb.append(((this.wholdingArAcctCodeDesc == null)?"<null>":this.wholdingArAcctCodeDesc));
        sb.append(',');
        sb.append("basiCodeIcName");
        sb.append('=');
        sb.append(((this.basiCodeIcName == null)?"<null>":this.basiCodeIcName));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("acctCodeRev");
        sb.append('=');
        sb.append(((this.acctCodeRev == null)?"<null>":this.acctCodeRev));
        sb.append(',');
        sb.append("cstrCodeRateName");
        sb.append('=');
        sb.append(((this.cstrCodeRateName == null)?"<null>":this.cstrCodeRateName));
        sb.append(',');
        sb.append("grntCodeDisplay1");
        sb.append('=');
        sb.append(((this.grntCodeDisplay1 == null)?"<null>":this.grntCodeDisplay1));
        sb.append(',');
        sb.append("cstaCodeCharge");
        sb.append('=');
        sb.append(((this.cstaCodeCharge == null)?"<null>":this.cstaCodeCharge));
        sb.append(',');
        sb.append("cstdCodeDistr");
        sb.append('=');
        sb.append(((this.cstdCodeDistr == null)?"<null>":this.cstdCodeDistr));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("encMultYrInd");
        sb.append('=');
        sb.append(((this.encMultYrInd == null)?"<null>":this.encMultYrInd));
        sb.append(',');
        sb.append("grntTitleDisplay1");
        sb.append('=');
        sb.append(((this.grntTitleDisplay1 == null)?"<null>":this.grntTitleDisplay1));
        sb.append(',');
        sb.append("withholdingAmt");
        sb.append('=');
        sb.append(((this.withholdingAmt == null)?"<null>":this.withholdingAmt));
        sb.append(',');
        sb.append("cashReceiptBankCode");
        sb.append('=');
        sb.append(((this.cashReceiptBankCode == null)?"<null>":this.cashReceiptBankCode));
        sb.append(',');
        sb.append("billedArAcctCode");
        sb.append('=');
        sb.append(((this.billedArAcctCode == null)?"<null>":this.billedArAcctCode));
        sb.append(',');
        sb.append("indrCodeRateName");
        sb.append('=');
        sb.append(((this.indrCodeRateName == null)?"<null>":this.indrCodeRateName));
        sb.append(',');
        sb.append("basiCodeIc");
        sb.append('=');
        sb.append(((this.basiCodeIc == null)?"<null>":this.basiCodeIc));
        sb.append(',');
        sb.append("wholdingArAcctCode");
        sb.append('=');
        sb.append(((this.wholdingArAcctCode == null)?"<null>":this.wholdingArAcctCode));
        sb.append(',');
        sb.append("budgPrdStartDate");
        sb.append('=');
        sb.append(((this.budgPrdStartDate == null)?"<null>":this.budgPrdStartDate));
        sb.append(',');
        sb.append("budgPrdEndDate");
        sb.append('=');
        sb.append(((this.budgPrdEndDate == null)?"<null>":this.budgPrdEndDate));
        sb.append(',');
        sb.append("inddCodeDistr");
        sb.append('=');
        sb.append(((this.inddCodeDistr == null)?"<null>":this.inddCodeDistr));
        sb.append(',');
        sb.append("idcEncInd");
        sb.append('=');
        sb.append(((this.idcEncInd == null)?"<null>":this.idcEncInd));
        sb.append(',');
        sb.append("indrCodeRate");
        sb.append('=');
        sb.append(((this.indrCodeRate == null)?"<null>":this.indrCodeRate));
        sb.append(',');
        sb.append("billedArAcctCodeDesc");
        sb.append('=');
        sb.append(((this.billedArAcctCodeDesc == null)?"<null>":this.billedArAcctCodeDesc));
        sb.append(',');
        sb.append("cstaCodeChargeName");
        sb.append('=');
        sb.append(((this.cstaCodeChargeName == null)?"<null>":this.cstaCodeChargeName));
        sb.append(',');
        sb.append("acctCodeAccr");
        sb.append('=');
        sb.append(((this.acctCodeAccr == null)?"<null>":this.acctCodeAccr));
        sb.append(',');
        sb.append("indaCodeChargeName");
        sb.append('=');
        sb.append(((this.indaCodeChargeName == null)?"<null>":this.indaCodeChargeName));
        sb.append(',');
        sb.append("cstdCodeDistrName");
        sb.append('=');
        sb.append(((this.cstdCodeDistrName == null)?"<null>":this.cstdCodeDistrName));
        sb.append(',');
        sb.append("basiCodeCs");
        sb.append('=');
        sb.append(((this.basiCodeCs == null)?"<null>":this.basiCodeCs));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("cstrCodeRate");
        sb.append('=');
        sb.append(((this.cstrCodeRate == null)?"<null>":this.cstrCodeRate));
        sb.append(',');
        sb.append("basiCodeCsName");
        sb.append('=');
        sb.append(((this.basiCodeCsName == null)?"<null>":this.basiCodeCsName));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("indaCodeCharge");
        sb.append('=');
        sb.append(((this.indaCodeCharge == null)?"<null>":this.indaCodeCharge));
        sb.append(',');
        sb.append("ftvfundTitle");
        sb.append('=');
        sb.append(((this.ftvfundTitle == null)?"<null>":this.ftvfundTitle));
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
        result = ((result* 31)+((this.inddCodeDistrName == null)? 0 :this.inddCodeDistrName.hashCode()));
        result = ((result* 31)+((this.withholdingPercent == null)? 0 :this.withholdingPercent.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.wholdingArAcctCodeDesc == null)? 0 :this.wholdingArAcctCodeDesc.hashCode()));
        result = ((result* 31)+((this.basiCodeIcName == null)? 0 :this.basiCodeIcName.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.acctCodeRev == null)? 0 :this.acctCodeRev.hashCode()));
        result = ((result* 31)+((this.cstrCodeRateName == null)? 0 :this.cstrCodeRateName.hashCode()));
        result = ((result* 31)+((this.grntCodeDisplay1 == null)? 0 :this.grntCodeDisplay1 .hashCode()));
        result = ((result* 31)+((this.cstaCodeCharge == null)? 0 :this.cstaCodeCharge.hashCode()));
        result = ((result* 31)+((this.cstdCodeDistr == null)? 0 :this.cstdCodeDistr.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.encMultYrInd == null)? 0 :this.encMultYrInd.hashCode()));
        result = ((result* 31)+((this.grntTitleDisplay1 == null)? 0 :this.grntTitleDisplay1 .hashCode()));
        result = ((result* 31)+((this.withholdingAmt == null)? 0 :this.withholdingAmt.hashCode()));
        result = ((result* 31)+((this.cashReceiptBankCode == null)? 0 :this.cashReceiptBankCode.hashCode()));
        result = ((result* 31)+((this.billedArAcctCode == null)? 0 :this.billedArAcctCode.hashCode()));
        result = ((result* 31)+((this.indrCodeRateName == null)? 0 :this.indrCodeRateName.hashCode()));
        result = ((result* 31)+((this.basiCodeIc == null)? 0 :this.basiCodeIc.hashCode()));
        result = ((result* 31)+((this.wholdingArAcctCode == null)? 0 :this.wholdingArAcctCode.hashCode()));
        result = ((result* 31)+((this.budgPrdStartDate == null)? 0 :this.budgPrdStartDate.hashCode()));
        result = ((result* 31)+((this.budgPrdEndDate == null)? 0 :this.budgPrdEndDate.hashCode()));
        result = ((result* 31)+((this.inddCodeDistr == null)? 0 :this.inddCodeDistr.hashCode()));
        result = ((result* 31)+((this.idcEncInd == null)? 0 :this.idcEncInd.hashCode()));
        result = ((result* 31)+((this.indrCodeRate == null)? 0 :this.indrCodeRate.hashCode()));
        result = ((result* 31)+((this.billedArAcctCodeDesc == null)? 0 :this.billedArAcctCodeDesc.hashCode()));
        result = ((result* 31)+((this.cstaCodeChargeName == null)? 0 :this.cstaCodeChargeName.hashCode()));
        result = ((result* 31)+((this.acctCodeAccr == null)? 0 :this.acctCodeAccr.hashCode()));
        result = ((result* 31)+((this.indaCodeChargeName == null)? 0 :this.indaCodeChargeName.hashCode()));
        result = ((result* 31)+((this.cstdCodeDistrName == null)? 0 :this.cstdCodeDistrName.hashCode()));
        result = ((result* 31)+((this.basiCodeCs == null)? 0 :this.basiCodeCs.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.cstrCodeRate == null)? 0 :this.cstrCodeRate.hashCode()));
        result = ((result* 31)+((this.basiCodeCsName == null)? 0 :this.basiCodeCsName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.indaCodeCharge == null)? 0 :this.indaCodeCharge.hashCode()));
        result = ((result* 31)+((this.ftvfundTitle == null)? 0 :this.ftvfundTitle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResearchAccountingFundMaintenance100GetResponse) == false) {
            return false;
        }
        ResearchAccountingFundMaintenance100GetResponse rhs = ((ResearchAccountingFundMaintenance100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((this.inddCodeDistrName == rhs.inddCodeDistrName)||((this.inddCodeDistrName!= null)&&this.inddCodeDistrName.equals(rhs.inddCodeDistrName)))&&((this.withholdingPercent == rhs.withholdingPercent)||((this.withholdingPercent!= null)&&this.withholdingPercent.equals(rhs.withholdingPercent))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.wholdingArAcctCodeDesc == rhs.wholdingArAcctCodeDesc)||((this.wholdingArAcctCodeDesc!= null)&&this.wholdingArAcctCodeDesc.equals(rhs.wholdingArAcctCodeDesc))))&&((this.basiCodeIcName == rhs.basiCodeIcName)||((this.basiCodeIcName!= null)&&this.basiCodeIcName.equals(rhs.basiCodeIcName))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.acctCodeRev == rhs.acctCodeRev)||((this.acctCodeRev!= null)&&this.acctCodeRev.equals(rhs.acctCodeRev))))&&((this.cstrCodeRateName == rhs.cstrCodeRateName)||((this.cstrCodeRateName!= null)&&this.cstrCodeRateName.equals(rhs.cstrCodeRateName))))&&((this.grntCodeDisplay1 == rhs.grntCodeDisplay1)||((this.grntCodeDisplay1 != null)&&this.grntCodeDisplay1 .equals(rhs.grntCodeDisplay1))))&&((this.cstaCodeCharge == rhs.cstaCodeCharge)||((this.cstaCodeCharge!= null)&&this.cstaCodeCharge.equals(rhs.cstaCodeCharge))))&&((this.cstdCodeDistr == rhs.cstdCodeDistr)||((this.cstdCodeDistr!= null)&&this.cstdCodeDistr.equals(rhs.cstdCodeDistr))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.encMultYrInd == rhs.encMultYrInd)||((this.encMultYrInd!= null)&&this.encMultYrInd.equals(rhs.encMultYrInd))))&&((this.grntTitleDisplay1 == rhs.grntTitleDisplay1)||((this.grntTitleDisplay1 != null)&&this.grntTitleDisplay1 .equals(rhs.grntTitleDisplay1))))&&((this.withholdingAmt == rhs.withholdingAmt)||((this.withholdingAmt!= null)&&this.withholdingAmt.equals(rhs.withholdingAmt))))&&((this.cashReceiptBankCode == rhs.cashReceiptBankCode)||((this.cashReceiptBankCode!= null)&&this.cashReceiptBankCode.equals(rhs.cashReceiptBankCode))))&&((this.billedArAcctCode == rhs.billedArAcctCode)||((this.billedArAcctCode!= null)&&this.billedArAcctCode.equals(rhs.billedArAcctCode))))&&((this.indrCodeRateName == rhs.indrCodeRateName)||((this.indrCodeRateName!= null)&&this.indrCodeRateName.equals(rhs.indrCodeRateName))))&&((this.basiCodeIc == rhs.basiCodeIc)||((this.basiCodeIc!= null)&&this.basiCodeIc.equals(rhs.basiCodeIc))))&&((this.wholdingArAcctCode == rhs.wholdingArAcctCode)||((this.wholdingArAcctCode!= null)&&this.wholdingArAcctCode.equals(rhs.wholdingArAcctCode))))&&((this.budgPrdStartDate == rhs.budgPrdStartDate)||((this.budgPrdStartDate!= null)&&this.budgPrdStartDate.equals(rhs.budgPrdStartDate))))&&((this.budgPrdEndDate == rhs.budgPrdEndDate)||((this.budgPrdEndDate!= null)&&this.budgPrdEndDate.equals(rhs.budgPrdEndDate))))&&((this.inddCodeDistr == rhs.inddCodeDistr)||((this.inddCodeDistr!= null)&&this.inddCodeDistr.equals(rhs.inddCodeDistr))))&&((this.idcEncInd == rhs.idcEncInd)||((this.idcEncInd!= null)&&this.idcEncInd.equals(rhs.idcEncInd))))&&((this.indrCodeRate == rhs.indrCodeRate)||((this.indrCodeRate!= null)&&this.indrCodeRate.equals(rhs.indrCodeRate))))&&((this.billedArAcctCodeDesc == rhs.billedArAcctCodeDesc)||((this.billedArAcctCodeDesc!= null)&&this.billedArAcctCodeDesc.equals(rhs.billedArAcctCodeDesc))))&&((this.cstaCodeChargeName == rhs.cstaCodeChargeName)||((this.cstaCodeChargeName!= null)&&this.cstaCodeChargeName.equals(rhs.cstaCodeChargeName))))&&((this.acctCodeAccr == rhs.acctCodeAccr)||((this.acctCodeAccr!= null)&&this.acctCodeAccr.equals(rhs.acctCodeAccr))))&&((this.indaCodeChargeName == rhs.indaCodeChargeName)||((this.indaCodeChargeName!= null)&&this.indaCodeChargeName.equals(rhs.indaCodeChargeName))))&&((this.cstdCodeDistrName == rhs.cstdCodeDistrName)||((this.cstdCodeDistrName!= null)&&this.cstdCodeDistrName.equals(rhs.cstdCodeDistrName))))&&((this.basiCodeCs == rhs.basiCodeCs)||((this.basiCodeCs!= null)&&this.basiCodeCs.equals(rhs.basiCodeCs))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.cstrCodeRate == rhs.cstrCodeRate)||((this.cstrCodeRate!= null)&&this.cstrCodeRate.equals(rhs.cstrCodeRate))))&&((this.basiCodeCsName == rhs.basiCodeCsName)||((this.basiCodeCsName!= null)&&this.basiCodeCsName.equals(rhs.basiCodeCsName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.indaCodeCharge == rhs.indaCodeCharge)||((this.indaCodeCharge!= null)&&this.indaCodeCharge.equals(rhs.indaCodeCharge))))&&((this.ftvfundTitle == rhs.ftvfundTitle)||((this.ftvfundTitle!= null)&&this.ftvfundTitle.equals(rhs.ftvfundTitle))));
    }

}
