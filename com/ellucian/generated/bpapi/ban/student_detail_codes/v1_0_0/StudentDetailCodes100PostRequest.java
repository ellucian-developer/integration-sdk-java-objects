
package com.ellucian.generated.bpapi.ban.student_detail_codes.v1_0_0;

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
    "bFundCode",
    "currCode",
    "detailCodeInd",
    "aLocnCode",
    "taxMethod",
    "aActvCode",
    "aCoasCode",
    "payhistInd",
    "tivInd",
    "tbdcInd",
    "effDate",
    "aRuclCode1",
    "aRuclCode3",
    "aRuclCode2",
    "glNosEnterable",
    "tbbeactTbdcInd",
    "tbbdectNonAllowChgInd",
    "bProgCode",
    "refundInd",
    "bAcciCode",
    "priority",
    "likeAidyInd",
    "receiptInd",
    "detailDesc",
    "tbbeactDetailCode",
    "bRuclCode3",
    "aAcctCode",
    "refundableInd",
    "tbbdetcDcatCode",
    "taxtCode",
    "bRuclCode1",
    "bRuclCode2",
    "bOrgnCode",
    "desc",
    "bLocnCode",
    "bCoasCode",
    "code",
    "detcActiveInd",
    "tbbeactAbdcInd",
    "bActvCode",
    "percent",
    "prebillPrintInd",
    "likeTermInd",
    "aFundCode",
    "likeScpInd",
    "amount",
    "typeInd",
    "paytCode",
    "likePeriodInd",
    "aAcciCode",
    "detailCode",
    "aProgCode",
    "displayNchgDate",
    "taxProfile",
    "dcatCode",
    "bAcctCode",
    "dirdInd",
    "abdcInd",
    "aOrgnCode",
    "instChgInd",
    "effectiveDate",
    "termCode"
})
@Generated("jsonschema2pojo")
public class StudentDetailCodes100PostRequest {

    /**
     * Account B - Fund
     * <p>
     * Lineage reference object : TBRACCT_B_FUND_CODE
     * 
     */
    @JsonProperty("bFundCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_FUND_CODE")
    private String bFundCode;
    /**
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("detailCodeInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE_IND")
    private String detailCodeInd;
    /**
     * Account A - Location
     * <p>
     * Lineage reference object : TBRACCT_A_LOCN_CODE
     * 
     */
    @JsonProperty("aLocnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_LOCN_CODE")
    private String aLocnCode;
    @JsonProperty("taxMethod")
    private String taxMethod;
    /**
     * Account A - Activity
     * <p>
     * Lineage reference object : TBRACCT_A_ACTV_CODE
     * 
     */
    @JsonProperty("aActvCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ACTV_CODE")
    private String aActvCode;
    /**
     * Account A - COA
     * <p>
     * Lineage reference object : TBRACCT_A_COAS_CODE
     * 
     */
    @JsonProperty("aCoasCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_COAS_CODE")
    private String aCoasCode;
    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYHIST_IND")
    private String payhistInd;
    /**
     * Title IV
     * <p>
     * Lineage reference object : TBBDETC_TIV_IND
     * 
     */
    @JsonProperty("tivInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TIV_IND")
    private String tivInd;
    /**
     * Term Based
     * <p>
     * Lineage reference object : TBBDETC_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TBDC_IND")
    private String tbdcInd;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_EFF_DATE")
    private Date effDate;
    /**
     * Account A - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE1
     * 
     */
    @JsonProperty("aRuclCode1")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_RUCL_CODE1")
    private String aRuclCode1;
    /**
     * Account A - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE3
     * 
     */
    @JsonProperty("aRuclCode3")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_RUCL_CODE3")
    private String aRuclCode3;
    /**
     * Account A - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE2
     * 
     */
    @JsonProperty("aRuclCode2")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_RUCL_CODE2")
    private String aRuclCode2;
    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("glNosEnterable")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_GL_NOS_ENTERABLE")
    private String glNosEnterable;
    /**
     * Term-based
     * <p>
     * Lineage reference object : TBBEACT_TBDC_IND
     * 
     */
    @JsonProperty("tbbeactTbdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_TBDC_IND")
    private String tbbeactTbdcInd;
    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdectNonAllowChgInd")
    private String tbbdectNonAllowChgInd;
    /**
     * Account B - Program
     * <p>
     * Lineage reference object : TBRACCT_B_PROG_CODE
     * 
     */
    @JsonProperty("bProgCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_PROG_CODE")
    private String bProgCode;
    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_REFUND_IND")
    private String refundInd;
    /**
     * Account B - Account Index
     * <p>
     * Lineage reference object : TBRACCT_B_ACCI_CODE
     * 
     */
    @JsonProperty("bAcciCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ACCI_CODE")
    private String bAcciCode;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PRIORITY")
    private String priority;
    /**
     * Like Aid Year
     * <p>
     * Lineage reference object : TBBDETC_LIKE_AIDY_IND
     * 
     */
    @JsonProperty("likeAidyInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_AIDY_IND")
    private String likeAidyInd;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_RECEIPT_IND")
    private String receiptInd;
    /**
     * Detail Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detailDesc")
    private String detailDesc;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_DETAIL_CODE")
    private String tbbeactDetailCode;
    /**
     * Account B - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE3
     * 
     */
    @JsonProperty("bRuclCode3")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_RUCL_CODE3")
    private String bRuclCode3;
    /**
     * Account A - Account
     * <p>
     * Lineage reference object : TBRACCT_A_ACCT_CODE
     * 
     */
    @JsonProperty("aAcctCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ACCT_CODE")
    private String aAcctCode;
    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_REFUNDABLE_IND")
    private String refundableInd;
    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("tbbdetcDcatCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat")
    private String tbbdetcDcatCode;
    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("taxtCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt")
    private String taxtCode;
    /**
     * Account B - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE1
     * 
     */
    @JsonProperty("bRuclCode1")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_RUCL_CODE1")
    private String bRuclCode1;
    /**
     * Account B - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE2
     * 
     */
    @JsonProperty("bRuclCode2")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_RUCL_CODE2")
    private String bRuclCode2;
    /**
     * Account B - Orgn
     * <p>
     * Lineage reference object : TBRACCT_B_ORGN_CODE
     * 
     */
    @JsonProperty("bOrgnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ORGN_CODE")
    private String bOrgnCode;
    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DESC")
    private String desc;
    /**
     * Account B - Location
     * <p>
     * Lineage reference object : TBRACCT_B_LOCN_CODE
     * 
     */
    @JsonProperty("bLocnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_LOCN_CODE")
    private String bLocnCode;
    /**
     * Account B - COA
     * <p>
     * Lineage reference object : TBRACCT_B_COAS_CODE
     * 
     */
    @JsonProperty("bCoasCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_COAS_CODE")
    private String bCoasCode;
    /**
     * Designator
     * <p>
     * 
     * 
     */
    @JsonProperty("code")
    private String code;
    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("detcActiveInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETC_ACTIVE_IND")
    private String detcActiveInd;
    /**
     * Aid Year-based
     * <p>
     * Lineage reference object : TBBEACT_ABDC_IND
     * 
     */
    @JsonProperty("tbbeactAbdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_ABDC_IND")
    private String tbbeactAbdcInd;
    /**
     * Account B - Activity
     * <p>
     * Lineage reference object : TBRACCT_B_ACTV_CODE
     * 
     */
    @JsonProperty("bActvCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ACTV_CODE")
    private String bActvCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : TBRACCT_PERCENT
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_PERCENT")
    private Double percent;
    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("prebillPrintInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PREBILL_PRINT_IND")
    private String prebillPrintInd;
    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("likeTermInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_TERM_IND")
    private String likeTermInd;
    /**
     * Account A - Fund
     * <p>
     * Lineage reference object : TBRACCT_A_FUND_CODE
     * 
     */
    @JsonProperty("aFundCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_FUND_CODE")
    private String aFundCode;
    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("likeScpInd")
    private String likeScpInd;
    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_AMOUNT")
    private Double amount;
    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TYPE_IND")
    private String typeInd;
    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt")
    private String paytCode;
    /**
     * Like Period
     * <p>
     * Lineage reference object : TBBDETC_LIKE_PERIOD_IND
     * 
     */
    @JsonProperty("likePeriodInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_PERIOD_IND")
    private String likePeriodInd;
    /**
     * Account A - Account Index
     * <p>
     * Lineage reference object : TBRACCT_A_ACCI_CODE
     * 
     */
    @JsonProperty("aAcciCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ACCI_CODE")
    private String aAcciCode;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE")
    private String detailCode;
    /**
     * Account A - Program
     * <p>
     * Lineage reference object : TBRACCT_A_PROG_CODE
     * 
     */
    @JsonProperty("aProgCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_PROG_CODE")
    private String aProgCode;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    @JsonProperty("taxProfile")
    private String taxProfile;
    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("dcatCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat")
    private String dcatCode;
    /**
     * Account B - Account
     * <p>
     * Lineage reference object : TBRACCT_B_ACCT_CODE
     * 
     */
    @JsonProperty("bAcctCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ACCT_CODE")
    private String bAcctCode;
    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("dirdInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DIRD_IND")
    private String dirdInd;
    /**
     * Aid Year Based
     * <p>
     * Lineage reference object : TBBDETC_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_ABDC_IND")
    private String abdcInd;
    /**
     * Account A - Orgn
     * <p>
     * Lineage reference object : TBRACCT_A_ORGN_CODE
     * 
     */
    @JsonProperty("aOrgnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ORGN_CODE")
    private String aOrgnCode;
    /**
     * Institutional Charges
     * <p>
     * Lineage reference object : TBBDETC_INST_CHG_IND
     * 
     */
    @JsonProperty("instChgInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_INST_CHG_IND")
    private String instChgInd;
    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Account B - Fund
     * <p>
     * Lineage reference object : TBRACCT_B_FUND_CODE
     * 
     */
    @JsonProperty("bFundCode")
    public String getbFundCode() {
        return bFundCode;
    }

    /**
     * Account B - Fund
     * <p>
     * Lineage reference object : TBRACCT_B_FUND_CODE
     * 
     */
    @JsonProperty("bFundCode")
    public void setbFundCode(String bFundCode) {
        this.bFundCode = bFundCode;
    }

    public StudentDetailCodes100PostRequest withbFundCode(String bFundCode) {
        this.bFundCode = bFundCode;
        return this;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public StudentDetailCodes100PostRequest withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("detailCodeInd")
    public String getDetailCodeInd() {
        return detailCodeInd;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("detailCodeInd")
    public void setDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
    }

    public StudentDetailCodes100PostRequest withDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
        return this;
    }

    /**
     * Account A - Location
     * <p>
     * Lineage reference object : TBRACCT_A_LOCN_CODE
     * 
     */
    @JsonProperty("aLocnCode")
    public String getaLocnCode() {
        return aLocnCode;
    }

    /**
     * Account A - Location
     * <p>
     * Lineage reference object : TBRACCT_A_LOCN_CODE
     * 
     */
    @JsonProperty("aLocnCode")
    public void setaLocnCode(String aLocnCode) {
        this.aLocnCode = aLocnCode;
    }

    public StudentDetailCodes100PostRequest withaLocnCode(String aLocnCode) {
        this.aLocnCode = aLocnCode;
        return this;
    }

    @JsonProperty("taxMethod")
    public String getTaxMethod() {
        return taxMethod;
    }

    @JsonProperty("taxMethod")
    public void setTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
    }

    public StudentDetailCodes100PostRequest withTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
        return this;
    }

    /**
     * Account A - Activity
     * <p>
     * Lineage reference object : TBRACCT_A_ACTV_CODE
     * 
     */
    @JsonProperty("aActvCode")
    public String getaActvCode() {
        return aActvCode;
    }

    /**
     * Account A - Activity
     * <p>
     * Lineage reference object : TBRACCT_A_ACTV_CODE
     * 
     */
    @JsonProperty("aActvCode")
    public void setaActvCode(String aActvCode) {
        this.aActvCode = aActvCode;
    }

    public StudentDetailCodes100PostRequest withaActvCode(String aActvCode) {
        this.aActvCode = aActvCode;
        return this;
    }

    /**
     * Account A - COA
     * <p>
     * Lineage reference object : TBRACCT_A_COAS_CODE
     * 
     */
    @JsonProperty("aCoasCode")
    public String getaCoasCode() {
        return aCoasCode;
    }

    /**
     * Account A - COA
     * <p>
     * Lineage reference object : TBRACCT_A_COAS_CODE
     * 
     */
    @JsonProperty("aCoasCode")
    public void setaCoasCode(String aCoasCode) {
        this.aCoasCode = aCoasCode;
    }

    public StudentDetailCodes100PostRequest withaCoasCode(String aCoasCode) {
        this.aCoasCode = aCoasCode;
        return this;
    }

    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    public String getPayhistInd() {
        return payhistInd;
    }

    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    public void setPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
    }

    public StudentDetailCodes100PostRequest withPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
        return this;
    }

    /**
     * Title IV
     * <p>
     * Lineage reference object : TBBDETC_TIV_IND
     * 
     */
    @JsonProperty("tivInd")
    public String getTivInd() {
        return tivInd;
    }

    /**
     * Title IV
     * <p>
     * Lineage reference object : TBBDETC_TIV_IND
     * 
     */
    @JsonProperty("tivInd")
    public void setTivInd(String tivInd) {
        this.tivInd = tivInd;
    }

    public StudentDetailCodes100PostRequest withTivInd(String tivInd) {
        this.tivInd = tivInd;
        return this;
    }

    /**
     * Term Based
     * <p>
     * Lineage reference object : TBBDETC_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    public String getTbdcInd() {
        return tbdcInd;
    }

    /**
     * Term Based
     * <p>
     * Lineage reference object : TBBDETC_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    public void setTbdcInd(String tbdcInd) {
        this.tbdcInd = tbdcInd;
    }

    public StudentDetailCodes100PostRequest withTbdcInd(String tbdcInd) {
        this.tbdcInd = tbdcInd;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
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
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public StudentDetailCodes100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Account A - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE1
     * 
     */
    @JsonProperty("aRuclCode1")
    public String getaRuclCode1() {
        return aRuclCode1;
    }

    /**
     * Account A - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE1
     * 
     */
    @JsonProperty("aRuclCode1")
    public void setaRuclCode1(String aRuclCode1) {
        this.aRuclCode1 = aRuclCode1;
    }

    public StudentDetailCodes100PostRequest withaRuclCode1(String aRuclCode1) {
        this.aRuclCode1 = aRuclCode1;
        return this;
    }

    /**
     * Account A - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE3
     * 
     */
    @JsonProperty("aRuclCode3")
    public String getaRuclCode3() {
        return aRuclCode3;
    }

    /**
     * Account A - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE3
     * 
     */
    @JsonProperty("aRuclCode3")
    public void setaRuclCode3(String aRuclCode3) {
        this.aRuclCode3 = aRuclCode3;
    }

    public StudentDetailCodes100PostRequest withaRuclCode3(String aRuclCode3) {
        this.aRuclCode3 = aRuclCode3;
        return this;
    }

    /**
     * Account A - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE2
     * 
     */
    @JsonProperty("aRuclCode2")
    public String getaRuclCode2() {
        return aRuclCode2;
    }

    /**
     * Account A - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE2
     * 
     */
    @JsonProperty("aRuclCode2")
    public void setaRuclCode2(String aRuclCode2) {
        this.aRuclCode2 = aRuclCode2;
    }

    public StudentDetailCodes100PostRequest withaRuclCode2(String aRuclCode2) {
        this.aRuclCode2 = aRuclCode2;
        return this;
    }

    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("glNosEnterable")
    public String getGlNosEnterable() {
        return glNosEnterable;
    }

    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("glNosEnterable")
    public void setGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
    }

    public StudentDetailCodes100PostRequest withGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
        return this;
    }

    /**
     * Term-based
     * <p>
     * Lineage reference object : TBBEACT_TBDC_IND
     * 
     */
    @JsonProperty("tbbeactTbdcInd")
    public String getTbbeactTbdcInd() {
        return tbbeactTbdcInd;
    }

    /**
     * Term-based
     * <p>
     * Lineage reference object : TBBEACT_TBDC_IND
     * 
     */
    @JsonProperty("tbbeactTbdcInd")
    public void setTbbeactTbdcInd(String tbbeactTbdcInd) {
        this.tbbeactTbdcInd = tbbeactTbdcInd;
    }

    public StudentDetailCodes100PostRequest withTbbeactTbdcInd(String tbbeactTbdcInd) {
        this.tbbeactTbdcInd = tbbeactTbdcInd;
        return this;
    }

    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdectNonAllowChgInd")
    public String getTbbdectNonAllowChgInd() {
        return tbbdectNonAllowChgInd;
    }

    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdectNonAllowChgInd")
    public void setTbbdectNonAllowChgInd(String tbbdectNonAllowChgInd) {
        this.tbbdectNonAllowChgInd = tbbdectNonAllowChgInd;
    }

    public StudentDetailCodes100PostRequest withTbbdectNonAllowChgInd(String tbbdectNonAllowChgInd) {
        this.tbbdectNonAllowChgInd = tbbdectNonAllowChgInd;
        return this;
    }

    /**
     * Account B - Program
     * <p>
     * Lineage reference object : TBRACCT_B_PROG_CODE
     * 
     */
    @JsonProperty("bProgCode")
    public String getbProgCode() {
        return bProgCode;
    }

    /**
     * Account B - Program
     * <p>
     * Lineage reference object : TBRACCT_B_PROG_CODE
     * 
     */
    @JsonProperty("bProgCode")
    public void setbProgCode(String bProgCode) {
        this.bProgCode = bProgCode;
    }

    public StudentDetailCodes100PostRequest withbProgCode(String bProgCode) {
        this.bProgCode = bProgCode;
        return this;
    }

    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public StudentDetailCodes100PostRequest withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * Account B - Account Index
     * <p>
     * Lineage reference object : TBRACCT_B_ACCI_CODE
     * 
     */
    @JsonProperty("bAcciCode")
    public String getbAcciCode() {
        return bAcciCode;
    }

    /**
     * Account B - Account Index
     * <p>
     * Lineage reference object : TBRACCT_B_ACCI_CODE
     * 
     */
    @JsonProperty("bAcciCode")
    public void setbAcciCode(String bAcciCode) {
        this.bAcciCode = bAcciCode;
    }

    public StudentDetailCodes100PostRequest withbAcciCode(String bAcciCode) {
        this.bAcciCode = bAcciCode;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public StudentDetailCodes100PostRequest withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Like Aid Year
     * <p>
     * Lineage reference object : TBBDETC_LIKE_AIDY_IND
     * 
     */
    @JsonProperty("likeAidyInd")
    public String getLikeAidyInd() {
        return likeAidyInd;
    }

    /**
     * Like Aid Year
     * <p>
     * Lineage reference object : TBBDETC_LIKE_AIDY_IND
     * 
     */
    @JsonProperty("likeAidyInd")
    public void setLikeAidyInd(String likeAidyInd) {
        this.likeAidyInd = likeAidyInd;
    }

    public StudentDetailCodes100PostRequest withLikeAidyInd(String likeAidyInd) {
        this.likeAidyInd = likeAidyInd;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    public String getReceiptInd() {
        return receiptInd;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    public void setReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
    }

    public StudentDetailCodes100PostRequest withReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
        return this;
    }

    /**
     * Detail Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detailDesc")
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * Detail Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detailDesc")
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public StudentDetailCodes100PostRequest withDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactDetailCode")
    public String getTbbeactDetailCode() {
        return tbbeactDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactDetailCode")
    public void setTbbeactDetailCode(String tbbeactDetailCode) {
        this.tbbeactDetailCode = tbbeactDetailCode;
    }

    public StudentDetailCodes100PostRequest withTbbeactDetailCode(String tbbeactDetailCode) {
        this.tbbeactDetailCode = tbbeactDetailCode;
        return this;
    }

    /**
     * Account B - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE3
     * 
     */
    @JsonProperty("bRuclCode3")
    public String getbRuclCode3() {
        return bRuclCode3;
    }

    /**
     * Account B - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE3
     * 
     */
    @JsonProperty("bRuclCode3")
    public void setbRuclCode3(String bRuclCode3) {
        this.bRuclCode3 = bRuclCode3;
    }

    public StudentDetailCodes100PostRequest withbRuclCode3(String bRuclCode3) {
        this.bRuclCode3 = bRuclCode3;
        return this;
    }

    /**
     * Account A - Account
     * <p>
     * Lineage reference object : TBRACCT_A_ACCT_CODE
     * 
     */
    @JsonProperty("aAcctCode")
    public String getaAcctCode() {
        return aAcctCode;
    }

    /**
     * Account A - Account
     * <p>
     * Lineage reference object : TBRACCT_A_ACCT_CODE
     * 
     */
    @JsonProperty("aAcctCode")
    public void setaAcctCode(String aAcctCode) {
        this.aAcctCode = aAcctCode;
    }

    public StudentDetailCodes100PostRequest withaAcctCode(String aAcctCode) {
        this.aAcctCode = aAcctCode;
        return this;
    }

    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    public String getRefundableInd() {
        return refundableInd;
    }

    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    public void setRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
    }

    public StudentDetailCodes100PostRequest withRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("tbbdetcDcatCode")
    public String getTbbdetcDcatCode() {
        return tbbdetcDcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("tbbdetcDcatCode")
    public void setTbbdetcDcatCode(String tbbdetcDcatCode) {
        this.tbbdetcDcatCode = tbbdetcDcatCode;
    }

    public StudentDetailCodes100PostRequest withTbbdetcDcatCode(String tbbdetcDcatCode) {
        this.tbbdetcDcatCode = tbbdetcDcatCode;
        return this;
    }

    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("taxtCode")
    public String getTaxtCode() {
        return taxtCode;
    }

    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("taxtCode")
    public void setTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
    }

    public StudentDetailCodes100PostRequest withTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
        return this;
    }

    /**
     * Account B - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE1
     * 
     */
    @JsonProperty("bRuclCode1")
    public String getbRuclCode1() {
        return bRuclCode1;
    }

    /**
     * Account B - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE1
     * 
     */
    @JsonProperty("bRuclCode1")
    public void setbRuclCode1(String bRuclCode1) {
        this.bRuclCode1 = bRuclCode1;
    }

    public StudentDetailCodes100PostRequest withbRuclCode1(String bRuclCode1) {
        this.bRuclCode1 = bRuclCode1;
        return this;
    }

    /**
     * Account B - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE2
     * 
     */
    @JsonProperty("bRuclCode2")
    public String getbRuclCode2() {
        return bRuclCode2;
    }

    /**
     * Account B - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE2
     * 
     */
    @JsonProperty("bRuclCode2")
    public void setbRuclCode2(String bRuclCode2) {
        this.bRuclCode2 = bRuclCode2;
    }

    public StudentDetailCodes100PostRequest withbRuclCode2(String bRuclCode2) {
        this.bRuclCode2 = bRuclCode2;
        return this;
    }

    /**
     * Account B - Orgn
     * <p>
     * Lineage reference object : TBRACCT_B_ORGN_CODE
     * 
     */
    @JsonProperty("bOrgnCode")
    public String getbOrgnCode() {
        return bOrgnCode;
    }

    /**
     * Account B - Orgn
     * <p>
     * Lineage reference object : TBRACCT_B_ORGN_CODE
     * 
     */
    @JsonProperty("bOrgnCode")
    public void setbOrgnCode(String bOrgnCode) {
        this.bOrgnCode = bOrgnCode;
    }

    public StudentDetailCodes100PostRequest withbOrgnCode(String bOrgnCode) {
        this.bOrgnCode = bOrgnCode;
        return this;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StudentDetailCodes100PostRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Account B - Location
     * <p>
     * Lineage reference object : TBRACCT_B_LOCN_CODE
     * 
     */
    @JsonProperty("bLocnCode")
    public String getbLocnCode() {
        return bLocnCode;
    }

    /**
     * Account B - Location
     * <p>
     * Lineage reference object : TBRACCT_B_LOCN_CODE
     * 
     */
    @JsonProperty("bLocnCode")
    public void setbLocnCode(String bLocnCode) {
        this.bLocnCode = bLocnCode;
    }

    public StudentDetailCodes100PostRequest withbLocnCode(String bLocnCode) {
        this.bLocnCode = bLocnCode;
        return this;
    }

    /**
     * Account B - COA
     * <p>
     * Lineage reference object : TBRACCT_B_COAS_CODE
     * 
     */
    @JsonProperty("bCoasCode")
    public String getbCoasCode() {
        return bCoasCode;
    }

    /**
     * Account B - COA
     * <p>
     * Lineage reference object : TBRACCT_B_COAS_CODE
     * 
     */
    @JsonProperty("bCoasCode")
    public void setbCoasCode(String bCoasCode) {
        this.bCoasCode = bCoasCode;
    }

    public StudentDetailCodes100PostRequest withbCoasCode(String bCoasCode) {
        this.bCoasCode = bCoasCode;
        return this;
    }

    /**
     * Designator
     * <p>
     * 
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Designator
     * <p>
     * 
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public StudentDetailCodes100PostRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("detcActiveInd")
    public String getDetcActiveInd() {
        return detcActiveInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("detcActiveInd")
    public void setDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
    }

    public StudentDetailCodes100PostRequest withDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
        return this;
    }

    /**
     * Aid Year-based
     * <p>
     * Lineage reference object : TBBEACT_ABDC_IND
     * 
     */
    @JsonProperty("tbbeactAbdcInd")
    public String getTbbeactAbdcInd() {
        return tbbeactAbdcInd;
    }

    /**
     * Aid Year-based
     * <p>
     * Lineage reference object : TBBEACT_ABDC_IND
     * 
     */
    @JsonProperty("tbbeactAbdcInd")
    public void setTbbeactAbdcInd(String tbbeactAbdcInd) {
        this.tbbeactAbdcInd = tbbeactAbdcInd;
    }

    public StudentDetailCodes100PostRequest withTbbeactAbdcInd(String tbbeactAbdcInd) {
        this.tbbeactAbdcInd = tbbeactAbdcInd;
        return this;
    }

    /**
     * Account B - Activity
     * <p>
     * Lineage reference object : TBRACCT_B_ACTV_CODE
     * 
     */
    @JsonProperty("bActvCode")
    public String getbActvCode() {
        return bActvCode;
    }

    /**
     * Account B - Activity
     * <p>
     * Lineage reference object : TBRACCT_B_ACTV_CODE
     * 
     */
    @JsonProperty("bActvCode")
    public void setbActvCode(String bActvCode) {
        this.bActvCode = bActvCode;
    }

    public StudentDetailCodes100PostRequest withbActvCode(String bActvCode) {
        this.bActvCode = bActvCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBRACCT_PERCENT
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBRACCT_PERCENT
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public StudentDetailCodes100PostRequest withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("prebillPrintInd")
    public String getPrebillPrintInd() {
        return prebillPrintInd;
    }

    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("prebillPrintInd")
    public void setPrebillPrintInd(String prebillPrintInd) {
        this.prebillPrintInd = prebillPrintInd;
    }

    public StudentDetailCodes100PostRequest withPrebillPrintInd(String prebillPrintInd) {
        this.prebillPrintInd = prebillPrintInd;
        return this;
    }

    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("likeTermInd")
    public String getLikeTermInd() {
        return likeTermInd;
    }

    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("likeTermInd")
    public void setLikeTermInd(String likeTermInd) {
        this.likeTermInd = likeTermInd;
    }

    public StudentDetailCodes100PostRequest withLikeTermInd(String likeTermInd) {
        this.likeTermInd = likeTermInd;
        return this;
    }

    /**
     * Account A - Fund
     * <p>
     * Lineage reference object : TBRACCT_A_FUND_CODE
     * 
     */
    @JsonProperty("aFundCode")
    public String getaFundCode() {
        return aFundCode;
    }

    /**
     * Account A - Fund
     * <p>
     * Lineage reference object : TBRACCT_A_FUND_CODE
     * 
     */
    @JsonProperty("aFundCode")
    public void setaFundCode(String aFundCode) {
        this.aFundCode = aFundCode;
    }

    public StudentDetailCodes100PostRequest withaFundCode(String aFundCode) {
        this.aFundCode = aFundCode;
        return this;
    }

    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("likeScpInd")
    public String getLikeScpInd() {
        return likeScpInd;
    }

    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("likeScpInd")
    public void setLikeScpInd(String likeScpInd) {
        this.likeScpInd = likeScpInd;
    }

    public StudentDetailCodes100PostRequest withLikeScpInd(String likeScpInd) {
        this.likeScpInd = likeScpInd;
        return this;
    }

    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public StudentDetailCodes100PostRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public StudentDetailCodes100PostRequest withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    public String getPaytCode() {
        return paytCode;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    public void setPaytCode(String paytCode) {
        this.paytCode = paytCode;
    }

    public StudentDetailCodes100PostRequest withPaytCode(String paytCode) {
        this.paytCode = paytCode;
        return this;
    }

    /**
     * Like Period
     * <p>
     * Lineage reference object : TBBDETC_LIKE_PERIOD_IND
     * 
     */
    @JsonProperty("likePeriodInd")
    public String getLikePeriodInd() {
        return likePeriodInd;
    }

    /**
     * Like Period
     * <p>
     * Lineage reference object : TBBDETC_LIKE_PERIOD_IND
     * 
     */
    @JsonProperty("likePeriodInd")
    public void setLikePeriodInd(String likePeriodInd) {
        this.likePeriodInd = likePeriodInd;
    }

    public StudentDetailCodes100PostRequest withLikePeriodInd(String likePeriodInd) {
        this.likePeriodInd = likePeriodInd;
        return this;
    }

    /**
     * Account A - Account Index
     * <p>
     * Lineage reference object : TBRACCT_A_ACCI_CODE
     * 
     */
    @JsonProperty("aAcciCode")
    public String getaAcciCode() {
        return aAcciCode;
    }

    /**
     * Account A - Account Index
     * <p>
     * Lineage reference object : TBRACCT_A_ACCI_CODE
     * 
     */
    @JsonProperty("aAcciCode")
    public void setaAcciCode(String aAcciCode) {
        this.aAcciCode = aAcciCode;
    }

    public StudentDetailCodes100PostRequest withaAcciCode(String aAcciCode) {
        this.aAcciCode = aAcciCode;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public StudentDetailCodes100PostRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Account A - Program
     * <p>
     * Lineage reference object : TBRACCT_A_PROG_CODE
     * 
     */
    @JsonProperty("aProgCode")
    public String getaProgCode() {
        return aProgCode;
    }

    /**
     * Account A - Program
     * <p>
     * Lineage reference object : TBRACCT_A_PROG_CODE
     * 
     */
    @JsonProperty("aProgCode")
    public void setaProgCode(String aProgCode) {
        this.aProgCode = aProgCode;
    }

    public StudentDetailCodes100PostRequest withaProgCode(String aProgCode) {
        this.aProgCode = aProgCode;
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

    public StudentDetailCodes100PostRequest withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    @JsonProperty("taxProfile")
    public String getTaxProfile() {
        return taxProfile;
    }

    @JsonProperty("taxProfile")
    public void setTaxProfile(String taxProfile) {
        this.taxProfile = taxProfile;
    }

    public StudentDetailCodes100PostRequest withTaxProfile(String taxProfile) {
        this.taxProfile = taxProfile;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("dcatCode")
    public String getDcatCode() {
        return dcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("dcatCode")
    public void setDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
    }

    public StudentDetailCodes100PostRequest withDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
        return this;
    }

    /**
     * Account B - Account
     * <p>
     * Lineage reference object : TBRACCT_B_ACCT_CODE
     * 
     */
    @JsonProperty("bAcctCode")
    public String getbAcctCode() {
        return bAcctCode;
    }

    /**
     * Account B - Account
     * <p>
     * Lineage reference object : TBRACCT_B_ACCT_CODE
     * 
     */
    @JsonProperty("bAcctCode")
    public void setbAcctCode(String bAcctCode) {
        this.bAcctCode = bAcctCode;
    }

    public StudentDetailCodes100PostRequest withbAcctCode(String bAcctCode) {
        this.bAcctCode = bAcctCode;
        return this;
    }

    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("dirdInd")
    public String getDirdInd() {
        return dirdInd;
    }

    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("dirdInd")
    public void setDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
    }

    public StudentDetailCodes100PostRequest withDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
        return this;
    }

    /**
     * Aid Year Based
     * <p>
     * Lineage reference object : TBBDETC_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    public String getAbdcInd() {
        return abdcInd;
    }

    /**
     * Aid Year Based
     * <p>
     * Lineage reference object : TBBDETC_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    public void setAbdcInd(String abdcInd) {
        this.abdcInd = abdcInd;
    }

    public StudentDetailCodes100PostRequest withAbdcInd(String abdcInd) {
        this.abdcInd = abdcInd;
        return this;
    }

    /**
     * Account A - Orgn
     * <p>
     * Lineage reference object : TBRACCT_A_ORGN_CODE
     * 
     */
    @JsonProperty("aOrgnCode")
    public String getaOrgnCode() {
        return aOrgnCode;
    }

    /**
     * Account A - Orgn
     * <p>
     * Lineage reference object : TBRACCT_A_ORGN_CODE
     * 
     */
    @JsonProperty("aOrgnCode")
    public void setaOrgnCode(String aOrgnCode) {
        this.aOrgnCode = aOrgnCode;
    }

    public StudentDetailCodes100PostRequest withaOrgnCode(String aOrgnCode) {
        this.aOrgnCode = aOrgnCode;
        return this;
    }

    /**
     * Institutional Charges
     * <p>
     * Lineage reference object : TBBDETC_INST_CHG_IND
     * 
     */
    @JsonProperty("instChgInd")
    public String getInstChgInd() {
        return instChgInd;
    }

    /**
     * Institutional Charges
     * <p>
     * Lineage reference object : TBBDETC_INST_CHG_IND
     * 
     */
    @JsonProperty("instChgInd")
    public void setInstChgInd(String instChgInd) {
        this.instChgInd = instChgInd;
    }

    public StudentDetailCodes100PostRequest withInstChgInd(String instChgInd) {
        this.instChgInd = instChgInd;
        return this;
    }

    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public StudentDetailCodes100PostRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public StudentDetailCodes100PostRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public StudentDetailCodes100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentDetailCodes100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bFundCode");
        sb.append('=');
        sb.append(((this.bFundCode == null)?"<null>":this.bFundCode));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("detailCodeInd");
        sb.append('=');
        sb.append(((this.detailCodeInd == null)?"<null>":this.detailCodeInd));
        sb.append(',');
        sb.append("aLocnCode");
        sb.append('=');
        sb.append(((this.aLocnCode == null)?"<null>":this.aLocnCode));
        sb.append(',');
        sb.append("taxMethod");
        sb.append('=');
        sb.append(((this.taxMethod == null)?"<null>":this.taxMethod));
        sb.append(',');
        sb.append("aActvCode");
        sb.append('=');
        sb.append(((this.aActvCode == null)?"<null>":this.aActvCode));
        sb.append(',');
        sb.append("aCoasCode");
        sb.append('=');
        sb.append(((this.aCoasCode == null)?"<null>":this.aCoasCode));
        sb.append(',');
        sb.append("payhistInd");
        sb.append('=');
        sb.append(((this.payhistInd == null)?"<null>":this.payhistInd));
        sb.append(',');
        sb.append("tivInd");
        sb.append('=');
        sb.append(((this.tivInd == null)?"<null>":this.tivInd));
        sb.append(',');
        sb.append("tbdcInd");
        sb.append('=');
        sb.append(((this.tbdcInd == null)?"<null>":this.tbdcInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("aRuclCode1");
        sb.append('=');
        sb.append(((this.aRuclCode1 == null)?"<null>":this.aRuclCode1));
        sb.append(',');
        sb.append("aRuclCode3");
        sb.append('=');
        sb.append(((this.aRuclCode3 == null)?"<null>":this.aRuclCode3));
        sb.append(',');
        sb.append("aRuclCode2");
        sb.append('=');
        sb.append(((this.aRuclCode2 == null)?"<null>":this.aRuclCode2));
        sb.append(',');
        sb.append("glNosEnterable");
        sb.append('=');
        sb.append(((this.glNosEnterable == null)?"<null>":this.glNosEnterable));
        sb.append(',');
        sb.append("tbbeactTbdcInd");
        sb.append('=');
        sb.append(((this.tbbeactTbdcInd == null)?"<null>":this.tbbeactTbdcInd));
        sb.append(',');
        sb.append("tbbdectNonAllowChgInd");
        sb.append('=');
        sb.append(((this.tbbdectNonAllowChgInd == null)?"<null>":this.tbbdectNonAllowChgInd));
        sb.append(',');
        sb.append("bProgCode");
        sb.append('=');
        sb.append(((this.bProgCode == null)?"<null>":this.bProgCode));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("bAcciCode");
        sb.append('=');
        sb.append(((this.bAcciCode == null)?"<null>":this.bAcciCode));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("likeAidyInd");
        sb.append('=');
        sb.append(((this.likeAidyInd == null)?"<null>":this.likeAidyInd));
        sb.append(',');
        sb.append("receiptInd");
        sb.append('=');
        sb.append(((this.receiptInd == null)?"<null>":this.receiptInd));
        sb.append(',');
        sb.append("detailDesc");
        sb.append('=');
        sb.append(((this.detailDesc == null)?"<null>":this.detailDesc));
        sb.append(',');
        sb.append("tbbeactDetailCode");
        sb.append('=');
        sb.append(((this.tbbeactDetailCode == null)?"<null>":this.tbbeactDetailCode));
        sb.append(',');
        sb.append("bRuclCode3");
        sb.append('=');
        sb.append(((this.bRuclCode3 == null)?"<null>":this.bRuclCode3));
        sb.append(',');
        sb.append("aAcctCode");
        sb.append('=');
        sb.append(((this.aAcctCode == null)?"<null>":this.aAcctCode));
        sb.append(',');
        sb.append("refundableInd");
        sb.append('=');
        sb.append(((this.refundableInd == null)?"<null>":this.refundableInd));
        sb.append(',');
        sb.append("tbbdetcDcatCode");
        sb.append('=');
        sb.append(((this.tbbdetcDcatCode == null)?"<null>":this.tbbdetcDcatCode));
        sb.append(',');
        sb.append("taxtCode");
        sb.append('=');
        sb.append(((this.taxtCode == null)?"<null>":this.taxtCode));
        sb.append(',');
        sb.append("bRuclCode1");
        sb.append('=');
        sb.append(((this.bRuclCode1 == null)?"<null>":this.bRuclCode1));
        sb.append(',');
        sb.append("bRuclCode2");
        sb.append('=');
        sb.append(((this.bRuclCode2 == null)?"<null>":this.bRuclCode2));
        sb.append(',');
        sb.append("bOrgnCode");
        sb.append('=');
        sb.append(((this.bOrgnCode == null)?"<null>":this.bOrgnCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("bLocnCode");
        sb.append('=');
        sb.append(((this.bLocnCode == null)?"<null>":this.bLocnCode));
        sb.append(',');
        sb.append("bCoasCode");
        sb.append('=');
        sb.append(((this.bCoasCode == null)?"<null>":this.bCoasCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("detcActiveInd");
        sb.append('=');
        sb.append(((this.detcActiveInd == null)?"<null>":this.detcActiveInd));
        sb.append(',');
        sb.append("tbbeactAbdcInd");
        sb.append('=');
        sb.append(((this.tbbeactAbdcInd == null)?"<null>":this.tbbeactAbdcInd));
        sb.append(',');
        sb.append("bActvCode");
        sb.append('=');
        sb.append(((this.bActvCode == null)?"<null>":this.bActvCode));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("prebillPrintInd");
        sb.append('=');
        sb.append(((this.prebillPrintInd == null)?"<null>":this.prebillPrintInd));
        sb.append(',');
        sb.append("likeTermInd");
        sb.append('=');
        sb.append(((this.likeTermInd == null)?"<null>":this.likeTermInd));
        sb.append(',');
        sb.append("aFundCode");
        sb.append('=');
        sb.append(((this.aFundCode == null)?"<null>":this.aFundCode));
        sb.append(',');
        sb.append("likeScpInd");
        sb.append('=');
        sb.append(((this.likeScpInd == null)?"<null>":this.likeScpInd));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("paytCode");
        sb.append('=');
        sb.append(((this.paytCode == null)?"<null>":this.paytCode));
        sb.append(',');
        sb.append("likePeriodInd");
        sb.append('=');
        sb.append(((this.likePeriodInd == null)?"<null>":this.likePeriodInd));
        sb.append(',');
        sb.append("aAcciCode");
        sb.append('=');
        sb.append(((this.aAcciCode == null)?"<null>":this.aAcciCode));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("aProgCode");
        sb.append('=');
        sb.append(((this.aProgCode == null)?"<null>":this.aProgCode));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("taxProfile");
        sb.append('=');
        sb.append(((this.taxProfile == null)?"<null>":this.taxProfile));
        sb.append(',');
        sb.append("dcatCode");
        sb.append('=');
        sb.append(((this.dcatCode == null)?"<null>":this.dcatCode));
        sb.append(',');
        sb.append("bAcctCode");
        sb.append('=');
        sb.append(((this.bAcctCode == null)?"<null>":this.bAcctCode));
        sb.append(',');
        sb.append("dirdInd");
        sb.append('=');
        sb.append(((this.dirdInd == null)?"<null>":this.dirdInd));
        sb.append(',');
        sb.append("abdcInd");
        sb.append('=');
        sb.append(((this.abdcInd == null)?"<null>":this.abdcInd));
        sb.append(',');
        sb.append("aOrgnCode");
        sb.append('=');
        sb.append(((this.aOrgnCode == null)?"<null>":this.aOrgnCode));
        sb.append(',');
        sb.append("instChgInd");
        sb.append('=');
        sb.append(((this.instChgInd == null)?"<null>":this.instChgInd));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.bFundCode == null)? 0 :this.bFundCode.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.detailCodeInd == null)? 0 :this.detailCodeInd.hashCode()));
        result = ((result* 31)+((this.aLocnCode == null)? 0 :this.aLocnCode.hashCode()));
        result = ((result* 31)+((this.taxMethod == null)? 0 :this.taxMethod.hashCode()));
        result = ((result* 31)+((this.aActvCode == null)? 0 :this.aActvCode.hashCode()));
        result = ((result* 31)+((this.aCoasCode == null)? 0 :this.aCoasCode.hashCode()));
        result = ((result* 31)+((this.payhistInd == null)? 0 :this.payhistInd.hashCode()));
        result = ((result* 31)+((this.tivInd == null)? 0 :this.tivInd.hashCode()));
        result = ((result* 31)+((this.tbdcInd == null)? 0 :this.tbdcInd.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.aRuclCode1 == null)? 0 :this.aRuclCode1 .hashCode()));
        result = ((result* 31)+((this.aRuclCode3 == null)? 0 :this.aRuclCode3 .hashCode()));
        result = ((result* 31)+((this.aRuclCode2 == null)? 0 :this.aRuclCode2 .hashCode()));
        result = ((result* 31)+((this.glNosEnterable == null)? 0 :this.glNosEnterable.hashCode()));
        result = ((result* 31)+((this.tbbeactTbdcInd == null)? 0 :this.tbbeactTbdcInd.hashCode()));
        result = ((result* 31)+((this.tbbdectNonAllowChgInd == null)? 0 :this.tbbdectNonAllowChgInd.hashCode()));
        result = ((result* 31)+((this.bProgCode == null)? 0 :this.bProgCode.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.bAcciCode == null)? 0 :this.bAcciCode.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.likeAidyInd == null)? 0 :this.likeAidyInd.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.detailDesc == null)? 0 :this.detailDesc.hashCode()));
        result = ((result* 31)+((this.tbbeactDetailCode == null)? 0 :this.tbbeactDetailCode.hashCode()));
        result = ((result* 31)+((this.bRuclCode3 == null)? 0 :this.bRuclCode3 .hashCode()));
        result = ((result* 31)+((this.aAcctCode == null)? 0 :this.aAcctCode.hashCode()));
        result = ((result* 31)+((this.refundableInd == null)? 0 :this.refundableInd.hashCode()));
        result = ((result* 31)+((this.tbbdetcDcatCode == null)? 0 :this.tbbdetcDcatCode.hashCode()));
        result = ((result* 31)+((this.taxtCode == null)? 0 :this.taxtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bRuclCode1 == null)? 0 :this.bRuclCode1 .hashCode()));
        result = ((result* 31)+((this.bRuclCode2 == null)? 0 :this.bRuclCode2 .hashCode()));
        result = ((result* 31)+((this.bOrgnCode == null)? 0 :this.bOrgnCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.bLocnCode == null)? 0 :this.bLocnCode.hashCode()));
        result = ((result* 31)+((this.bCoasCode == null)? 0 :this.bCoasCode.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.detcActiveInd == null)? 0 :this.detcActiveInd.hashCode()));
        result = ((result* 31)+((this.tbbeactAbdcInd == null)? 0 :this.tbbeactAbdcInd.hashCode()));
        result = ((result* 31)+((this.bActvCode == null)? 0 :this.bActvCode.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.prebillPrintInd == null)? 0 :this.prebillPrintInd.hashCode()));
        result = ((result* 31)+((this.likeTermInd == null)? 0 :this.likeTermInd.hashCode()));
        result = ((result* 31)+((this.aFundCode == null)? 0 :this.aFundCode.hashCode()));
        result = ((result* 31)+((this.likeScpInd == null)? 0 :this.likeScpInd.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.paytCode == null)? 0 :this.paytCode.hashCode()));
        result = ((result* 31)+((this.likePeriodInd == null)? 0 :this.likePeriodInd.hashCode()));
        result = ((result* 31)+((this.aAcciCode == null)? 0 :this.aAcciCode.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.aProgCode == null)? 0 :this.aProgCode.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.taxProfile == null)? 0 :this.taxProfile.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.bAcctCode == null)? 0 :this.bAcctCode.hashCode()));
        result = ((result* 31)+((this.dirdInd == null)? 0 :this.dirdInd.hashCode()));
        result = ((result* 31)+((this.abdcInd == null)? 0 :this.abdcInd.hashCode()));
        result = ((result* 31)+((this.aOrgnCode == null)? 0 :this.aOrgnCode.hashCode()));
        result = ((result* 31)+((this.instChgInd == null)? 0 :this.instChgInd.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentDetailCodes100PostRequest) == false) {
            return false;
        }
        StudentDetailCodes100PostRequest rhs = ((StudentDetailCodes100PostRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.bFundCode == rhs.bFundCode)||((this.bFundCode!= null)&&this.bFundCode.equals(rhs.bFundCode)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.detailCodeInd == rhs.detailCodeInd)||((this.detailCodeInd!= null)&&this.detailCodeInd.equals(rhs.detailCodeInd))))&&((this.aLocnCode == rhs.aLocnCode)||((this.aLocnCode!= null)&&this.aLocnCode.equals(rhs.aLocnCode))))&&((this.taxMethod == rhs.taxMethod)||((this.taxMethod!= null)&&this.taxMethod.equals(rhs.taxMethod))))&&((this.aActvCode == rhs.aActvCode)||((this.aActvCode!= null)&&this.aActvCode.equals(rhs.aActvCode))))&&((this.aCoasCode == rhs.aCoasCode)||((this.aCoasCode!= null)&&this.aCoasCode.equals(rhs.aCoasCode))))&&((this.payhistInd == rhs.payhistInd)||((this.payhistInd!= null)&&this.payhistInd.equals(rhs.payhistInd))))&&((this.tivInd == rhs.tivInd)||((this.tivInd!= null)&&this.tivInd.equals(rhs.tivInd))))&&((this.tbdcInd == rhs.tbdcInd)||((this.tbdcInd!= null)&&this.tbdcInd.equals(rhs.tbdcInd))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.aRuclCode1 == rhs.aRuclCode1)||((this.aRuclCode1 != null)&&this.aRuclCode1 .equals(rhs.aRuclCode1))))&&((this.aRuclCode3 == rhs.aRuclCode3)||((this.aRuclCode3 != null)&&this.aRuclCode3 .equals(rhs.aRuclCode3))))&&((this.aRuclCode2 == rhs.aRuclCode2)||((this.aRuclCode2 != null)&&this.aRuclCode2 .equals(rhs.aRuclCode2))))&&((this.glNosEnterable == rhs.glNosEnterable)||((this.glNosEnterable!= null)&&this.glNosEnterable.equals(rhs.glNosEnterable))))&&((this.tbbeactTbdcInd == rhs.tbbeactTbdcInd)||((this.tbbeactTbdcInd!= null)&&this.tbbeactTbdcInd.equals(rhs.tbbeactTbdcInd))))&&((this.tbbdectNonAllowChgInd == rhs.tbbdectNonAllowChgInd)||((this.tbbdectNonAllowChgInd!= null)&&this.tbbdectNonAllowChgInd.equals(rhs.tbbdectNonAllowChgInd))))&&((this.bProgCode == rhs.bProgCode)||((this.bProgCode!= null)&&this.bProgCode.equals(rhs.bProgCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.bAcciCode == rhs.bAcciCode)||((this.bAcciCode!= null)&&this.bAcciCode.equals(rhs.bAcciCode))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.likeAidyInd == rhs.likeAidyInd)||((this.likeAidyInd!= null)&&this.likeAidyInd.equals(rhs.likeAidyInd))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.detailDesc == rhs.detailDesc)||((this.detailDesc!= null)&&this.detailDesc.equals(rhs.detailDesc))))&&((this.tbbeactDetailCode == rhs.tbbeactDetailCode)||((this.tbbeactDetailCode!= null)&&this.tbbeactDetailCode.equals(rhs.tbbeactDetailCode))))&&((this.bRuclCode3 == rhs.bRuclCode3)||((this.bRuclCode3 != null)&&this.bRuclCode3 .equals(rhs.bRuclCode3))))&&((this.aAcctCode == rhs.aAcctCode)||((this.aAcctCode!= null)&&this.aAcctCode.equals(rhs.aAcctCode))))&&((this.refundableInd == rhs.refundableInd)||((this.refundableInd!= null)&&this.refundableInd.equals(rhs.refundableInd))))&&((this.tbbdetcDcatCode == rhs.tbbdetcDcatCode)||((this.tbbdetcDcatCode!= null)&&this.tbbdetcDcatCode.equals(rhs.tbbdetcDcatCode))))&&((this.taxtCode == rhs.taxtCode)||((this.taxtCode!= null)&&this.taxtCode.equals(rhs.taxtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bRuclCode1 == rhs.bRuclCode1)||((this.bRuclCode1 != null)&&this.bRuclCode1 .equals(rhs.bRuclCode1))))&&((this.bRuclCode2 == rhs.bRuclCode2)||((this.bRuclCode2 != null)&&this.bRuclCode2 .equals(rhs.bRuclCode2))))&&((this.bOrgnCode == rhs.bOrgnCode)||((this.bOrgnCode!= null)&&this.bOrgnCode.equals(rhs.bOrgnCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.bLocnCode == rhs.bLocnCode)||((this.bLocnCode!= null)&&this.bLocnCode.equals(rhs.bLocnCode))))&&((this.bCoasCode == rhs.bCoasCode)||((this.bCoasCode!= null)&&this.bCoasCode.equals(rhs.bCoasCode))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.detcActiveInd == rhs.detcActiveInd)||((this.detcActiveInd!= null)&&this.detcActiveInd.equals(rhs.detcActiveInd))))&&((this.tbbeactAbdcInd == rhs.tbbeactAbdcInd)||((this.tbbeactAbdcInd!= null)&&this.tbbeactAbdcInd.equals(rhs.tbbeactAbdcInd))))&&((this.bActvCode == rhs.bActvCode)||((this.bActvCode!= null)&&this.bActvCode.equals(rhs.bActvCode))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.prebillPrintInd == rhs.prebillPrintInd)||((this.prebillPrintInd!= null)&&this.prebillPrintInd.equals(rhs.prebillPrintInd))))&&((this.likeTermInd == rhs.likeTermInd)||((this.likeTermInd!= null)&&this.likeTermInd.equals(rhs.likeTermInd))))&&((this.aFundCode == rhs.aFundCode)||((this.aFundCode!= null)&&this.aFundCode.equals(rhs.aFundCode))))&&((this.likeScpInd == rhs.likeScpInd)||((this.likeScpInd!= null)&&this.likeScpInd.equals(rhs.likeScpInd))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.paytCode == rhs.paytCode)||((this.paytCode!= null)&&this.paytCode.equals(rhs.paytCode))))&&((this.likePeriodInd == rhs.likePeriodInd)||((this.likePeriodInd!= null)&&this.likePeriodInd.equals(rhs.likePeriodInd))))&&((this.aAcciCode == rhs.aAcciCode)||((this.aAcciCode!= null)&&this.aAcciCode.equals(rhs.aAcciCode))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.aProgCode == rhs.aProgCode)||((this.aProgCode!= null)&&this.aProgCode.equals(rhs.aProgCode))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.taxProfile == rhs.taxProfile)||((this.taxProfile!= null)&&this.taxProfile.equals(rhs.taxProfile))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.bAcctCode == rhs.bAcctCode)||((this.bAcctCode!= null)&&this.bAcctCode.equals(rhs.bAcctCode))))&&((this.dirdInd == rhs.dirdInd)||((this.dirdInd!= null)&&this.dirdInd.equals(rhs.dirdInd))))&&((this.abdcInd == rhs.abdcInd)||((this.abdcInd!= null)&&this.abdcInd.equals(rhs.abdcInd))))&&((this.aOrgnCode == rhs.aOrgnCode)||((this.aOrgnCode!= null)&&this.aOrgnCode.equals(rhs.aOrgnCode))))&&((this.instChgInd == rhs.instChgInd)||((this.instChgInd!= null)&&this.instChgInd.equals(rhs.instChgInd))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
