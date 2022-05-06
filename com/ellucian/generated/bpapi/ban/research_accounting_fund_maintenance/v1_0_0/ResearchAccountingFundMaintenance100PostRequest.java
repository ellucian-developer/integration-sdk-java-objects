
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
    "budgPrdStartDate",
    "withholdingPercent",
    "code",
    "budgPrdEndDate",
    "inddCodeDistr",
    "indrCodeRate",
    "coasCode",
    "cstaCodeCharge",
    "effDate",
    "encMultYrInd",
    "basiCodeCs",
    "cstdCodeDistr",
    "withholdingAmt",
    "cstrCodeRate",
    "billedArAcctCode",
    "termDate",
    "basiCodeIc",
    "indaCodeCharge",
    "wholdingArAcctCode"
})
@Generated("jsonschema2pojo")
public class ResearchAccountingFundMaintenance100PostRequest {

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
     * Indirect Cost Rate Code
     * <p>
     * Lineage reference object : FRVFUND_INDR_CODE_RATE
     * 
     */
    @JsonProperty("indrCodeRate")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_INDR_CODE_RATE")
    private String indrCodeRate;
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
     * Cost Share Credit Account Code
     * <p>
     * Lineage reference object : FRVFUND_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta
     * 
     */
    @JsonProperty("cstaCodeCharge")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_CSTA_CODE_CHARGE, Lookup lineage reference object : frbcsta,frvcsta")
    private String cstaCodeCharge;
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
     * Cost Share Distribute From Code
     * <p>
     * Lineage reference object : FRVFUND_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd
     * 
     */
    @JsonProperty("cstdCodeDistr")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_CSTD_CODE_DISTR, Lookup lineage reference object : frbcstd,frvcstd")
    private String cstdCodeDistr;
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
     * Cost Share Rate Code
     * <p>
     * Lineage reference object : FRVFUND_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr
     * 
     */
    @JsonProperty("cstrCodeRate")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_CSTR_CODE_RATE, Lookup lineage reference object : frrcstr,frvcstr")
    private String cstrCodeRate;
    /**
     * Billed Accounts Receivable
     * <p>
     * Lineage reference object : FRVFUND_BILLED_AR_ACCT_CODE
     * 
     */
    @JsonProperty("billedArAcctCode")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_BILLED_AR_ACCT_CODE")
    private String billedArAcctCode;
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
     * Indirect Cost Basis
     * <p>
     * Lineage reference object : FRVFUND_BASI_CODE_IC
     * 
     */
    @JsonProperty("basiCodeIc")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_BASI_CODE_IC")
    private String basiCodeIc;
    /**
     * Indirect Cost Charge Account Code
     * <p>
     * Lineage reference object : FRVFUND_INDA_CODE_CHARGE
     * 
     */
    @JsonProperty("indaCodeCharge")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_INDA_CODE_CHARGE")
    private String indaCodeCharge;
    /**
     * Retainage Accounts Receivable
     * <p>
     * Lineage reference object : FRVFUND_WHOLDING_AR_ACCT_CODE
     * 
     */
    @JsonProperty("wholdingArAcctCode")
    @JsonPropertyDescription("Lineage reference object : FRVFUND_WHOLDING_AR_ACCT_CODE")
    private String wholdingArAcctCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public ResearchAccountingFundMaintenance100PostRequest withBudgPrdStartDate(Date budgPrdStartDate) {
        this.budgPrdStartDate = budgPrdStartDate;
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

    public ResearchAccountingFundMaintenance100PostRequest withWithholdingPercent(Double withholdingPercent) {
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

    public ResearchAccountingFundMaintenance100PostRequest withCode(String code) {
        this.code = code;
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

    public ResearchAccountingFundMaintenance100PostRequest withBudgPrdEndDate(Date budgPrdEndDate) {
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

    public ResearchAccountingFundMaintenance100PostRequest withInddCodeDistr(String inddCodeDistr) {
        this.inddCodeDistr = inddCodeDistr;
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

    public ResearchAccountingFundMaintenance100PostRequest withIndrCodeRate(String indrCodeRate) {
        this.indrCodeRate = indrCodeRate;
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

    public ResearchAccountingFundMaintenance100PostRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public ResearchAccountingFundMaintenance100PostRequest withCstaCodeCharge(String cstaCodeCharge) {
        this.cstaCodeCharge = cstaCodeCharge;
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

    public ResearchAccountingFundMaintenance100PostRequest withEffDate(Date effDate) {
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

    public ResearchAccountingFundMaintenance100PostRequest withEncMultYrInd(String encMultYrInd) {
        this.encMultYrInd = encMultYrInd;
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

    public ResearchAccountingFundMaintenance100PostRequest withBasiCodeCs(String basiCodeCs) {
        this.basiCodeCs = basiCodeCs;
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

    public ResearchAccountingFundMaintenance100PostRequest withCstdCodeDistr(String cstdCodeDistr) {
        this.cstdCodeDistr = cstdCodeDistr;
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

    public ResearchAccountingFundMaintenance100PostRequest withWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
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

    public ResearchAccountingFundMaintenance100PostRequest withCstrCodeRate(String cstrCodeRate) {
        this.cstrCodeRate = cstrCodeRate;
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

    public ResearchAccountingFundMaintenance100PostRequest withBilledArAcctCode(String billedArAcctCode) {
        this.billedArAcctCode = billedArAcctCode;
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

    public ResearchAccountingFundMaintenance100PostRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public ResearchAccountingFundMaintenance100PostRequest withBasiCodeIc(String basiCodeIc) {
        this.basiCodeIc = basiCodeIc;
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

    public ResearchAccountingFundMaintenance100PostRequest withIndaCodeCharge(String indaCodeCharge) {
        this.indaCodeCharge = indaCodeCharge;
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

    public ResearchAccountingFundMaintenance100PostRequest withWholdingArAcctCode(String wholdingArAcctCode) {
        this.wholdingArAcctCode = wholdingArAcctCode;
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

    public ResearchAccountingFundMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResearchAccountingFundMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("budgPrdStartDate");
        sb.append('=');
        sb.append(((this.budgPrdStartDate == null)?"<null>":this.budgPrdStartDate));
        sb.append(',');
        sb.append("withholdingPercent");
        sb.append('=');
        sb.append(((this.withholdingPercent == null)?"<null>":this.withholdingPercent));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("budgPrdEndDate");
        sb.append('=');
        sb.append(((this.budgPrdEndDate == null)?"<null>":this.budgPrdEndDate));
        sb.append(',');
        sb.append("inddCodeDistr");
        sb.append('=');
        sb.append(((this.inddCodeDistr == null)?"<null>":this.inddCodeDistr));
        sb.append(',');
        sb.append("indrCodeRate");
        sb.append('=');
        sb.append(((this.indrCodeRate == null)?"<null>":this.indrCodeRate));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("cstaCodeCharge");
        sb.append('=');
        sb.append(((this.cstaCodeCharge == null)?"<null>":this.cstaCodeCharge));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("encMultYrInd");
        sb.append('=');
        sb.append(((this.encMultYrInd == null)?"<null>":this.encMultYrInd));
        sb.append(',');
        sb.append("basiCodeCs");
        sb.append('=');
        sb.append(((this.basiCodeCs == null)?"<null>":this.basiCodeCs));
        sb.append(',');
        sb.append("cstdCodeDistr");
        sb.append('=');
        sb.append(((this.cstdCodeDistr == null)?"<null>":this.cstdCodeDistr));
        sb.append(',');
        sb.append("withholdingAmt");
        sb.append('=');
        sb.append(((this.withholdingAmt == null)?"<null>":this.withholdingAmt));
        sb.append(',');
        sb.append("cstrCodeRate");
        sb.append('=');
        sb.append(((this.cstrCodeRate == null)?"<null>":this.cstrCodeRate));
        sb.append(',');
        sb.append("billedArAcctCode");
        sb.append('=');
        sb.append(((this.billedArAcctCode == null)?"<null>":this.billedArAcctCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("basiCodeIc");
        sb.append('=');
        sb.append(((this.basiCodeIc == null)?"<null>":this.basiCodeIc));
        sb.append(',');
        sb.append("indaCodeCharge");
        sb.append('=');
        sb.append(((this.indaCodeCharge == null)?"<null>":this.indaCodeCharge));
        sb.append(',');
        sb.append("wholdingArAcctCode");
        sb.append('=');
        sb.append(((this.wholdingArAcctCode == null)?"<null>":this.wholdingArAcctCode));
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
        result = ((result* 31)+((this.budgPrdStartDate == null)? 0 :this.budgPrdStartDate.hashCode()));
        result = ((result* 31)+((this.withholdingPercent == null)? 0 :this.withholdingPercent.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.budgPrdEndDate == null)? 0 :this.budgPrdEndDate.hashCode()));
        result = ((result* 31)+((this.inddCodeDistr == null)? 0 :this.inddCodeDistr.hashCode()));
        result = ((result* 31)+((this.indrCodeRate == null)? 0 :this.indrCodeRate.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.cstaCodeCharge == null)? 0 :this.cstaCodeCharge.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.encMultYrInd == null)? 0 :this.encMultYrInd.hashCode()));
        result = ((result* 31)+((this.basiCodeCs == null)? 0 :this.basiCodeCs.hashCode()));
        result = ((result* 31)+((this.cstdCodeDistr == null)? 0 :this.cstdCodeDistr.hashCode()));
        result = ((result* 31)+((this.withholdingAmt == null)? 0 :this.withholdingAmt.hashCode()));
        result = ((result* 31)+((this.cstrCodeRate == null)? 0 :this.cstrCodeRate.hashCode()));
        result = ((result* 31)+((this.billedArAcctCode == null)? 0 :this.billedArAcctCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.basiCodeIc == null)? 0 :this.basiCodeIc.hashCode()));
        result = ((result* 31)+((this.indaCodeCharge == null)? 0 :this.indaCodeCharge.hashCode()));
        result = ((result* 31)+((this.wholdingArAcctCode == null)? 0 :this.wholdingArAcctCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResearchAccountingFundMaintenance100PostRequest) == false) {
            return false;
        }
        ResearchAccountingFundMaintenance100PostRequest rhs = ((ResearchAccountingFundMaintenance100PostRequest) other);
        return (((((((((((((((((((((this.budgPrdStartDate == rhs.budgPrdStartDate)||((this.budgPrdStartDate!= null)&&this.budgPrdStartDate.equals(rhs.budgPrdStartDate)))&&((this.withholdingPercent == rhs.withholdingPercent)||((this.withholdingPercent!= null)&&this.withholdingPercent.equals(rhs.withholdingPercent))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.budgPrdEndDate == rhs.budgPrdEndDate)||((this.budgPrdEndDate!= null)&&this.budgPrdEndDate.equals(rhs.budgPrdEndDate))))&&((this.inddCodeDistr == rhs.inddCodeDistr)||((this.inddCodeDistr!= null)&&this.inddCodeDistr.equals(rhs.inddCodeDistr))))&&((this.indrCodeRate == rhs.indrCodeRate)||((this.indrCodeRate!= null)&&this.indrCodeRate.equals(rhs.indrCodeRate))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.cstaCodeCharge == rhs.cstaCodeCharge)||((this.cstaCodeCharge!= null)&&this.cstaCodeCharge.equals(rhs.cstaCodeCharge))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.encMultYrInd == rhs.encMultYrInd)||((this.encMultYrInd!= null)&&this.encMultYrInd.equals(rhs.encMultYrInd))))&&((this.basiCodeCs == rhs.basiCodeCs)||((this.basiCodeCs!= null)&&this.basiCodeCs.equals(rhs.basiCodeCs))))&&((this.cstdCodeDistr == rhs.cstdCodeDistr)||((this.cstdCodeDistr!= null)&&this.cstdCodeDistr.equals(rhs.cstdCodeDistr))))&&((this.withholdingAmt == rhs.withholdingAmt)||((this.withholdingAmt!= null)&&this.withholdingAmt.equals(rhs.withholdingAmt))))&&((this.cstrCodeRate == rhs.cstrCodeRate)||((this.cstrCodeRate!= null)&&this.cstrCodeRate.equals(rhs.cstrCodeRate))))&&((this.billedArAcctCode == rhs.billedArAcctCode)||((this.billedArAcctCode!= null)&&this.billedArAcctCode.equals(rhs.billedArAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.basiCodeIc == rhs.basiCodeIc)||((this.basiCodeIc!= null)&&this.basiCodeIc.equals(rhs.basiCodeIc))))&&((this.indaCodeCharge == rhs.indaCodeCharge)||((this.indaCodeCharge!= null)&&this.indaCodeCharge.equals(rhs.indaCodeCharge))))&&((this.wholdingArAcctCode == rhs.wholdingArAcctCode)||((this.wholdingArAcctCode!= null)&&this.wholdingArAcctCode.equals(rhs.wholdingArAcctCode))));
    }

}
