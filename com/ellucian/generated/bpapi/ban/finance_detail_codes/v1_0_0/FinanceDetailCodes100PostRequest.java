
package com.ellucian.generated.bpapi.ban.finance_detail_codes.v1_0_0;

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
    "tbracctAOrgnCode",
    "tbracctBRuclCode2",
    "tbracctBRuclCode3",
    "detcActiveInd",
    "tbracctBOrgnCode",
    "tbracctBRuclCode1",
    "payhistInd",
    "tbracctAActvCode",
    "tbracctBActvCode",
    "tbracctBFundCode",
    "tbracctAFundCode",
    "accountPercent2",
    "glNosEnterable",
    "tbracctBCoasCode",
    "tbracctACoasCode",
    "tbracctBAcciCode",
    "amount",
    "tbbeactEffDate",
    "typeInd",
    "paytCode",
    "tbracctAAcciCode",
    "refundInd",
    "priority",
    "detailCode",
    "receiptInd",
    "tbracctARuclCode1",
    "tbracctARuclCode2",
    "tbracctARuclCode3",
    "tbracctALocnCode",
    "tbracctBAcctCode",
    "tbracctAProgCode",
    "dcatCode",
    "tbracctBProgCode",
    "dirdInd",
    "refundableInd",
    "tbracctAAcctCode",
    "taxtCode",
    "tbracctBLocnCode",
    "effectiveDate",
    "desc"
})
@Generated("jsonschema2pojo")
public class FinanceDetailCodes100PostRequest {

    /**
     * Account A - Orgn
     * <p>
     * Lineage reference object : TBRACCT_A_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctAOrgnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ORGN_CODE")
    private String tbracctAOrgnCode;
    /**
     * Account B - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctBRuclCode2")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_RUCL_CODE2")
    private String tbracctBRuclCode2;
    /**
     * Account B - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctBRuclCode3")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_RUCL_CODE3")
    private String tbracctBRuclCode3;
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
     * Account B - Orgn
     * <p>
     * Lineage reference object : TBRACCT_B_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctBOrgnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ORGN_CODE")
    private String tbracctBOrgnCode;
    /**
     * Account B - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctBRuclCode1")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_RUCL_CODE1")
    private String tbracctBRuclCode1;
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
     * Account A - Activity
     * <p>
     * Lineage reference object : TBRACCT_A_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctAActvCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ACTV_CODE")
    private String tbracctAActvCode;
    /**
     * Account B - Activity
     * <p>
     * Lineage reference object : TBRACCT_B_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctBActvCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ACTV_CODE")
    private String tbracctBActvCode;
    /**
     * Account B - Fund
     * <p>
     * Lineage reference object : TBRACCT_B_FUND_CODE
     * 
     */
    @JsonProperty("tbracctBFundCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_FUND_CODE")
    private String tbracctBFundCode;
    /**
     * Account A - Fund
     * <p>
     * Lineage reference object : TBRACCT_A_FUND_CODE
     * 
     */
    @JsonProperty("tbracctAFundCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_FUND_CODE")
    private String tbracctAFundCode;
    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("accountPercent2")
    private Double accountPercent2;
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
     * Account B - COA
     * <p>
     * Lineage reference object : TBRACCT_B_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctBCoasCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_COAS_CODE")
    private String tbracctBCoasCode;
    /**
     * Account A - COA
     * <p>
     * Lineage reference object : TBRACCT_A_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctACoasCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_COAS_CODE")
    private String tbracctACoasCode;
    /**
     * Account B - Account Index
     * <p>
     * Lineage reference object : TBRACCT_B_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctBAcciCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ACCI_CODE")
    private String tbracctBAcciCode;
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
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactEffDate")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_EFF_DATE")
    private Date tbbeactEffDate;
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
     * Account A - Account Index
     * <p>
     * Lineage reference object : TBRACCT_A_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctAAcciCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ACCI_CODE")
    private String tbracctAAcciCode;
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
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_RECEIPT_IND")
    private String receiptInd;
    /**
     * Account A - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctARuclCode1")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_RUCL_CODE1")
    private String tbracctARuclCode1;
    /**
     * Account A - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctARuclCode2")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_RUCL_CODE2")
    private String tbracctARuclCode2;
    /**
     * Account A - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctARuclCode3")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_RUCL_CODE3")
    private String tbracctARuclCode3;
    /**
     * Account A - Location
     * <p>
     * Lineage reference object : TBRACCT_A_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctALocnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_LOCN_CODE")
    private String tbracctALocnCode;
    /**
     * Account B - Account
     * <p>
     * Lineage reference object : TBRACCT_B_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctBAcctCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_ACCT_CODE")
    private String tbracctBAcctCode;
    /**
     * Account A - Program
     * <p>
     * Lineage reference object : TBRACCT_A_PROG_CODE
     * 
     */
    @JsonProperty("tbracctAProgCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_PROG_CODE")
    private String tbracctAProgCode;
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
     * Account B - Program
     * <p>
     * Lineage reference object : TBRACCT_B_PROG_CODE
     * 
     */
    @JsonProperty("tbracctBProgCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_PROG_CODE")
    private String tbracctBProgCode;
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
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_REFUNDABLE_IND")
    private String refundableInd;
    /**
     * Account A - Account
     * <p>
     * Lineage reference object : TBRACCT_A_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctAAcctCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_A_ACCT_CODE")
    private String tbracctAAcctCode;
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
     * Account B - Location
     * <p>
     * Lineage reference object : TBRACCT_B_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctBLocnCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCT_B_LOCN_CODE")
    private String tbracctBLocnCode;
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
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Account A - Orgn
     * <p>
     * Lineage reference object : TBRACCT_A_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctAOrgnCode")
    public String getTbracctAOrgnCode() {
        return tbracctAOrgnCode;
    }

    /**
     * Account A - Orgn
     * <p>
     * Lineage reference object : TBRACCT_A_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctAOrgnCode")
    public void setTbracctAOrgnCode(String tbracctAOrgnCode) {
        this.tbracctAOrgnCode = tbracctAOrgnCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctAOrgnCode(String tbracctAOrgnCode) {
        this.tbracctAOrgnCode = tbracctAOrgnCode;
        return this;
    }

    /**
     * Account B - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctBRuclCode2")
    public String getTbracctBRuclCode2() {
        return tbracctBRuclCode2;
    }

    /**
     * Account B - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctBRuclCode2")
    public void setTbracctBRuclCode2(String tbracctBRuclCode2) {
        this.tbracctBRuclCode2 = tbracctBRuclCode2;
    }

    public FinanceDetailCodes100PostRequest withTbracctBRuclCode2(String tbracctBRuclCode2) {
        this.tbracctBRuclCode2 = tbracctBRuclCode2;
        return this;
    }

    /**
     * Account B - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctBRuclCode3")
    public String getTbracctBRuclCode3() {
        return tbracctBRuclCode3;
    }

    /**
     * Account B - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctBRuclCode3")
    public void setTbracctBRuclCode3(String tbracctBRuclCode3) {
        this.tbracctBRuclCode3 = tbracctBRuclCode3;
    }

    public FinanceDetailCodes100PostRequest withTbracctBRuclCode3(String tbracctBRuclCode3) {
        this.tbracctBRuclCode3 = tbracctBRuclCode3;
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

    public FinanceDetailCodes100PostRequest withDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
        return this;
    }

    /**
     * Account B - Orgn
     * <p>
     * Lineage reference object : TBRACCT_B_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctBOrgnCode")
    public String getTbracctBOrgnCode() {
        return tbracctBOrgnCode;
    }

    /**
     * Account B - Orgn
     * <p>
     * Lineage reference object : TBRACCT_B_ORGN_CODE
     * 
     */
    @JsonProperty("tbracctBOrgnCode")
    public void setTbracctBOrgnCode(String tbracctBOrgnCode) {
        this.tbracctBOrgnCode = tbracctBOrgnCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctBOrgnCode(String tbracctBOrgnCode) {
        this.tbracctBOrgnCode = tbracctBOrgnCode;
        return this;
    }

    /**
     * Account B - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctBRuclCode1")
    public String getTbracctBRuclCode1() {
        return tbracctBRuclCode1;
    }

    /**
     * Account B - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_B_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctBRuclCode1")
    public void setTbracctBRuclCode1(String tbracctBRuclCode1) {
        this.tbracctBRuclCode1 = tbracctBRuclCode1;
    }

    public FinanceDetailCodes100PostRequest withTbracctBRuclCode1(String tbracctBRuclCode1) {
        this.tbracctBRuclCode1 = tbracctBRuclCode1;
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

    public FinanceDetailCodes100PostRequest withPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
        return this;
    }

    /**
     * Account A - Activity
     * <p>
     * Lineage reference object : TBRACCT_A_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctAActvCode")
    public String getTbracctAActvCode() {
        return tbracctAActvCode;
    }

    /**
     * Account A - Activity
     * <p>
     * Lineage reference object : TBRACCT_A_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctAActvCode")
    public void setTbracctAActvCode(String tbracctAActvCode) {
        this.tbracctAActvCode = tbracctAActvCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctAActvCode(String tbracctAActvCode) {
        this.tbracctAActvCode = tbracctAActvCode;
        return this;
    }

    /**
     * Account B - Activity
     * <p>
     * Lineage reference object : TBRACCT_B_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctBActvCode")
    public String getTbracctBActvCode() {
        return tbracctBActvCode;
    }

    /**
     * Account B - Activity
     * <p>
     * Lineage reference object : TBRACCT_B_ACTV_CODE
     * 
     */
    @JsonProperty("tbracctBActvCode")
    public void setTbracctBActvCode(String tbracctBActvCode) {
        this.tbracctBActvCode = tbracctBActvCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctBActvCode(String tbracctBActvCode) {
        this.tbracctBActvCode = tbracctBActvCode;
        return this;
    }

    /**
     * Account B - Fund
     * <p>
     * Lineage reference object : TBRACCT_B_FUND_CODE
     * 
     */
    @JsonProperty("tbracctBFundCode")
    public String getTbracctBFundCode() {
        return tbracctBFundCode;
    }

    /**
     * Account B - Fund
     * <p>
     * Lineage reference object : TBRACCT_B_FUND_CODE
     * 
     */
    @JsonProperty("tbracctBFundCode")
    public void setTbracctBFundCode(String tbracctBFundCode) {
        this.tbracctBFundCode = tbracctBFundCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctBFundCode(String tbracctBFundCode) {
        this.tbracctBFundCode = tbracctBFundCode;
        return this;
    }

    /**
     * Account A - Fund
     * <p>
     * Lineage reference object : TBRACCT_A_FUND_CODE
     * 
     */
    @JsonProperty("tbracctAFundCode")
    public String getTbracctAFundCode() {
        return tbracctAFundCode;
    }

    /**
     * Account A - Fund
     * <p>
     * Lineage reference object : TBRACCT_A_FUND_CODE
     * 
     */
    @JsonProperty("tbracctAFundCode")
    public void setTbracctAFundCode(String tbracctAFundCode) {
        this.tbracctAFundCode = tbracctAFundCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctAFundCode(String tbracctAFundCode) {
        this.tbracctAFundCode = tbracctAFundCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("accountPercent2")
    public Double getAccountPercent2() {
        return accountPercent2;
    }

    /**
     * Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("accountPercent2")
    public void setAccountPercent2(Double accountPercent2) {
        this.accountPercent2 = accountPercent2;
    }

    public FinanceDetailCodes100PostRequest withAccountPercent2(Double accountPercent2) {
        this.accountPercent2 = accountPercent2;
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

    public FinanceDetailCodes100PostRequest withGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
        return this;
    }

    /**
     * Account B - COA
     * <p>
     * Lineage reference object : TBRACCT_B_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctBCoasCode")
    public String getTbracctBCoasCode() {
        return tbracctBCoasCode;
    }

    /**
     * Account B - COA
     * <p>
     * Lineage reference object : TBRACCT_B_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctBCoasCode")
    public void setTbracctBCoasCode(String tbracctBCoasCode) {
        this.tbracctBCoasCode = tbracctBCoasCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctBCoasCode(String tbracctBCoasCode) {
        this.tbracctBCoasCode = tbracctBCoasCode;
        return this;
    }

    /**
     * Account A - COA
     * <p>
     * Lineage reference object : TBRACCT_A_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctACoasCode")
    public String getTbracctACoasCode() {
        return tbracctACoasCode;
    }

    /**
     * Account A - COA
     * <p>
     * Lineage reference object : TBRACCT_A_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("tbracctACoasCode")
    public void setTbracctACoasCode(String tbracctACoasCode) {
        this.tbracctACoasCode = tbracctACoasCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctACoasCode(String tbracctACoasCode) {
        this.tbracctACoasCode = tbracctACoasCode;
        return this;
    }

    /**
     * Account B - Account Index
     * <p>
     * Lineage reference object : TBRACCT_B_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctBAcciCode")
    public String getTbracctBAcciCode() {
        return tbracctBAcciCode;
    }

    /**
     * Account B - Account Index
     * <p>
     * Lineage reference object : TBRACCT_B_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctBAcciCode")
    public void setTbracctBAcciCode(String tbracctBAcciCode) {
        this.tbracctBAcciCode = tbracctBAcciCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctBAcciCode(String tbracctBAcciCode) {
        this.tbracctBAcciCode = tbracctBAcciCode;
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

    public FinanceDetailCodes100PostRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactEffDate")
    public Date getTbbeactEffDate() {
        return tbbeactEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBBEACT_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("tbbeactEffDate")
    public void setTbbeactEffDate(Date tbbeactEffDate) {
        this.tbbeactEffDate = tbbeactEffDate;
    }

    public FinanceDetailCodes100PostRequest withTbbeactEffDate(Date tbbeactEffDate) {
        this.tbbeactEffDate = tbbeactEffDate;
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

    public FinanceDetailCodes100PostRequest withTypeInd(String typeInd) {
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

    public FinanceDetailCodes100PostRequest withPaytCode(String paytCode) {
        this.paytCode = paytCode;
        return this;
    }

    /**
     * Account A - Account Index
     * <p>
     * Lineage reference object : TBRACCT_A_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctAAcciCode")
    public String getTbracctAAcciCode() {
        return tbracctAAcciCode;
    }

    /**
     * Account A - Account Index
     * <p>
     * Lineage reference object : TBRACCT_A_ACCI_CODE
     * 
     */
    @JsonProperty("tbracctAAcciCode")
    public void setTbracctAAcciCode(String tbracctAAcciCode) {
        this.tbracctAAcciCode = tbracctAAcciCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctAAcciCode(String tbracctAAcciCode) {
        this.tbracctAAcciCode = tbracctAAcciCode;
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

    public FinanceDetailCodes100PostRequest withRefundInd(String refundInd) {
        this.refundInd = refundInd;
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

    public FinanceDetailCodes100PostRequest withPriority(String priority) {
        this.priority = priority;
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

    public FinanceDetailCodes100PostRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public FinanceDetailCodes100PostRequest withReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
        return this;
    }

    /**
     * Account A - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctARuclCode1")
    public String getTbracctARuclCode1() {
        return tbracctARuclCode1;
    }

    /**
     * Account A - Rule Class 1
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE1
     * 
     */
    @JsonProperty("tbracctARuclCode1")
    public void setTbracctARuclCode1(String tbracctARuclCode1) {
        this.tbracctARuclCode1 = tbracctARuclCode1;
    }

    public FinanceDetailCodes100PostRequest withTbracctARuclCode1(String tbracctARuclCode1) {
        this.tbracctARuclCode1 = tbracctARuclCode1;
        return this;
    }

    /**
     * Account A - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctARuclCode2")
    public String getTbracctARuclCode2() {
        return tbracctARuclCode2;
    }

    /**
     * Account A - Rule Class 2
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE2
     * 
     */
    @JsonProperty("tbracctARuclCode2")
    public void setTbracctARuclCode2(String tbracctARuclCode2) {
        this.tbracctARuclCode2 = tbracctARuclCode2;
    }

    public FinanceDetailCodes100PostRequest withTbracctARuclCode2(String tbracctARuclCode2) {
        this.tbracctARuclCode2 = tbracctARuclCode2;
        return this;
    }

    /**
     * Account A - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctARuclCode3")
    public String getTbracctARuclCode3() {
        return tbracctARuclCode3;
    }

    /**
     * Account A - Rule Class 3
     * <p>
     * Lineage reference object : TBRACCT_A_RUCL_CODE3
     * 
     */
    @JsonProperty("tbracctARuclCode3")
    public void setTbracctARuclCode3(String tbracctARuclCode3) {
        this.tbracctARuclCode3 = tbracctARuclCode3;
    }

    public FinanceDetailCodes100PostRequest withTbracctARuclCode3(String tbracctARuclCode3) {
        this.tbracctARuclCode3 = tbracctARuclCode3;
        return this;
    }

    /**
     * Account A - Location
     * <p>
     * Lineage reference object : TBRACCT_A_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctALocnCode")
    public String getTbracctALocnCode() {
        return tbracctALocnCode;
    }

    /**
     * Account A - Location
     * <p>
     * Lineage reference object : TBRACCT_A_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctALocnCode")
    public void setTbracctALocnCode(String tbracctALocnCode) {
        this.tbracctALocnCode = tbracctALocnCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctALocnCode(String tbracctALocnCode) {
        this.tbracctALocnCode = tbracctALocnCode;
        return this;
    }

    /**
     * Account B - Account
     * <p>
     * Lineage reference object : TBRACCT_B_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctBAcctCode")
    public String getTbracctBAcctCode() {
        return tbracctBAcctCode;
    }

    /**
     * Account B - Account
     * <p>
     * Lineage reference object : TBRACCT_B_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctBAcctCode")
    public void setTbracctBAcctCode(String tbracctBAcctCode) {
        this.tbracctBAcctCode = tbracctBAcctCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctBAcctCode(String tbracctBAcctCode) {
        this.tbracctBAcctCode = tbracctBAcctCode;
        return this;
    }

    /**
     * Account A - Program
     * <p>
     * Lineage reference object : TBRACCT_A_PROG_CODE
     * 
     */
    @JsonProperty("tbracctAProgCode")
    public String getTbracctAProgCode() {
        return tbracctAProgCode;
    }

    /**
     * Account A - Program
     * <p>
     * Lineage reference object : TBRACCT_A_PROG_CODE
     * 
     */
    @JsonProperty("tbracctAProgCode")
    public void setTbracctAProgCode(String tbracctAProgCode) {
        this.tbracctAProgCode = tbracctAProgCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctAProgCode(String tbracctAProgCode) {
        this.tbracctAProgCode = tbracctAProgCode;
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

    public FinanceDetailCodes100PostRequest withDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
        return this;
    }

    /**
     * Account B - Program
     * <p>
     * Lineage reference object : TBRACCT_B_PROG_CODE
     * 
     */
    @JsonProperty("tbracctBProgCode")
    public String getTbracctBProgCode() {
        return tbracctBProgCode;
    }

    /**
     * Account B - Program
     * <p>
     * Lineage reference object : TBRACCT_B_PROG_CODE
     * 
     */
    @JsonProperty("tbracctBProgCode")
    public void setTbracctBProgCode(String tbracctBProgCode) {
        this.tbracctBProgCode = tbracctBProgCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctBProgCode(String tbracctBProgCode) {
        this.tbracctBProgCode = tbracctBProgCode;
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

    public FinanceDetailCodes100PostRequest withDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
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

    public FinanceDetailCodes100PostRequest withRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
        return this;
    }

    /**
     * Account A - Account
     * <p>
     * Lineage reference object : TBRACCT_A_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctAAcctCode")
    public String getTbracctAAcctCode() {
        return tbracctAAcctCode;
    }

    /**
     * Account A - Account
     * <p>
     * Lineage reference object : TBRACCT_A_ACCT_CODE
     * 
     */
    @JsonProperty("tbracctAAcctCode")
    public void setTbracctAAcctCode(String tbracctAAcctCode) {
        this.tbracctAAcctCode = tbracctAAcctCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctAAcctCode(String tbracctAAcctCode) {
        this.tbracctAAcctCode = tbracctAAcctCode;
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

    public FinanceDetailCodes100PostRequest withTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
        return this;
    }

    /**
     * Account B - Location
     * <p>
     * Lineage reference object : TBRACCT_B_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctBLocnCode")
    public String getTbracctBLocnCode() {
        return tbracctBLocnCode;
    }

    /**
     * Account B - Location
     * <p>
     * Lineage reference object : TBRACCT_B_LOCN_CODE
     * 
     */
    @JsonProperty("tbracctBLocnCode")
    public void setTbracctBLocnCode(String tbracctBLocnCode) {
        this.tbracctBLocnCode = tbracctBLocnCode;
    }

    public FinanceDetailCodes100PostRequest withTbracctBLocnCode(String tbracctBLocnCode) {
        this.tbracctBLocnCode = tbracctBLocnCode;
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

    public FinanceDetailCodes100PostRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public FinanceDetailCodes100PostRequest withDesc(String desc) {
        this.desc = desc;
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

    public FinanceDetailCodes100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceDetailCodes100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbracctAOrgnCode");
        sb.append('=');
        sb.append(((this.tbracctAOrgnCode == null)?"<null>":this.tbracctAOrgnCode));
        sb.append(',');
        sb.append("tbracctBRuclCode2");
        sb.append('=');
        sb.append(((this.tbracctBRuclCode2 == null)?"<null>":this.tbracctBRuclCode2));
        sb.append(',');
        sb.append("tbracctBRuclCode3");
        sb.append('=');
        sb.append(((this.tbracctBRuclCode3 == null)?"<null>":this.tbracctBRuclCode3));
        sb.append(',');
        sb.append("detcActiveInd");
        sb.append('=');
        sb.append(((this.detcActiveInd == null)?"<null>":this.detcActiveInd));
        sb.append(',');
        sb.append("tbracctBOrgnCode");
        sb.append('=');
        sb.append(((this.tbracctBOrgnCode == null)?"<null>":this.tbracctBOrgnCode));
        sb.append(',');
        sb.append("tbracctBRuclCode1");
        sb.append('=');
        sb.append(((this.tbracctBRuclCode1 == null)?"<null>":this.tbracctBRuclCode1));
        sb.append(',');
        sb.append("payhistInd");
        sb.append('=');
        sb.append(((this.payhistInd == null)?"<null>":this.payhistInd));
        sb.append(',');
        sb.append("tbracctAActvCode");
        sb.append('=');
        sb.append(((this.tbracctAActvCode == null)?"<null>":this.tbracctAActvCode));
        sb.append(',');
        sb.append("tbracctBActvCode");
        sb.append('=');
        sb.append(((this.tbracctBActvCode == null)?"<null>":this.tbracctBActvCode));
        sb.append(',');
        sb.append("tbracctBFundCode");
        sb.append('=');
        sb.append(((this.tbracctBFundCode == null)?"<null>":this.tbracctBFundCode));
        sb.append(',');
        sb.append("tbracctAFundCode");
        sb.append('=');
        sb.append(((this.tbracctAFundCode == null)?"<null>":this.tbracctAFundCode));
        sb.append(',');
        sb.append("accountPercent2");
        sb.append('=');
        sb.append(((this.accountPercent2 == null)?"<null>":this.accountPercent2));
        sb.append(',');
        sb.append("glNosEnterable");
        sb.append('=');
        sb.append(((this.glNosEnterable == null)?"<null>":this.glNosEnterable));
        sb.append(',');
        sb.append("tbracctBCoasCode");
        sb.append('=');
        sb.append(((this.tbracctBCoasCode == null)?"<null>":this.tbracctBCoasCode));
        sb.append(',');
        sb.append("tbracctACoasCode");
        sb.append('=');
        sb.append(((this.tbracctACoasCode == null)?"<null>":this.tbracctACoasCode));
        sb.append(',');
        sb.append("tbracctBAcciCode");
        sb.append('=');
        sb.append(((this.tbracctBAcciCode == null)?"<null>":this.tbracctBAcciCode));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("tbbeactEffDate");
        sb.append('=');
        sb.append(((this.tbbeactEffDate == null)?"<null>":this.tbbeactEffDate));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("paytCode");
        sb.append('=');
        sb.append(((this.paytCode == null)?"<null>":this.paytCode));
        sb.append(',');
        sb.append("tbracctAAcciCode");
        sb.append('=');
        sb.append(((this.tbracctAAcciCode == null)?"<null>":this.tbracctAAcciCode));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("receiptInd");
        sb.append('=');
        sb.append(((this.receiptInd == null)?"<null>":this.receiptInd));
        sb.append(',');
        sb.append("tbracctARuclCode1");
        sb.append('=');
        sb.append(((this.tbracctARuclCode1 == null)?"<null>":this.tbracctARuclCode1));
        sb.append(',');
        sb.append("tbracctARuclCode2");
        sb.append('=');
        sb.append(((this.tbracctARuclCode2 == null)?"<null>":this.tbracctARuclCode2));
        sb.append(',');
        sb.append("tbracctARuclCode3");
        sb.append('=');
        sb.append(((this.tbracctARuclCode3 == null)?"<null>":this.tbracctARuclCode3));
        sb.append(',');
        sb.append("tbracctALocnCode");
        sb.append('=');
        sb.append(((this.tbracctALocnCode == null)?"<null>":this.tbracctALocnCode));
        sb.append(',');
        sb.append("tbracctBAcctCode");
        sb.append('=');
        sb.append(((this.tbracctBAcctCode == null)?"<null>":this.tbracctBAcctCode));
        sb.append(',');
        sb.append("tbracctAProgCode");
        sb.append('=');
        sb.append(((this.tbracctAProgCode == null)?"<null>":this.tbracctAProgCode));
        sb.append(',');
        sb.append("dcatCode");
        sb.append('=');
        sb.append(((this.dcatCode == null)?"<null>":this.dcatCode));
        sb.append(',');
        sb.append("tbracctBProgCode");
        sb.append('=');
        sb.append(((this.tbracctBProgCode == null)?"<null>":this.tbracctBProgCode));
        sb.append(',');
        sb.append("dirdInd");
        sb.append('=');
        sb.append(((this.dirdInd == null)?"<null>":this.dirdInd));
        sb.append(',');
        sb.append("refundableInd");
        sb.append('=');
        sb.append(((this.refundableInd == null)?"<null>":this.refundableInd));
        sb.append(',');
        sb.append("tbracctAAcctCode");
        sb.append('=');
        sb.append(((this.tbracctAAcctCode == null)?"<null>":this.tbracctAAcctCode));
        sb.append(',');
        sb.append("taxtCode");
        sb.append('=');
        sb.append(((this.taxtCode == null)?"<null>":this.taxtCode));
        sb.append(',');
        sb.append("tbracctBLocnCode");
        sb.append('=');
        sb.append(((this.tbracctBLocnCode == null)?"<null>":this.tbracctBLocnCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.tbracctAOrgnCode == null)? 0 :this.tbracctAOrgnCode.hashCode()));
        result = ((result* 31)+((this.tbracctBRuclCode2 == null)? 0 :this.tbracctBRuclCode2 .hashCode()));
        result = ((result* 31)+((this.tbracctBRuclCode3 == null)? 0 :this.tbracctBRuclCode3 .hashCode()));
        result = ((result* 31)+((this.detcActiveInd == null)? 0 :this.detcActiveInd.hashCode()));
        result = ((result* 31)+((this.tbracctBOrgnCode == null)? 0 :this.tbracctBOrgnCode.hashCode()));
        result = ((result* 31)+((this.tbracctBRuclCode1 == null)? 0 :this.tbracctBRuclCode1 .hashCode()));
        result = ((result* 31)+((this.payhistInd == null)? 0 :this.payhistInd.hashCode()));
        result = ((result* 31)+((this.tbracctAActvCode == null)? 0 :this.tbracctAActvCode.hashCode()));
        result = ((result* 31)+((this.tbracctBActvCode == null)? 0 :this.tbracctBActvCode.hashCode()));
        result = ((result* 31)+((this.tbracctBFundCode == null)? 0 :this.tbracctBFundCode.hashCode()));
        result = ((result* 31)+((this.tbracctAFundCode == null)? 0 :this.tbracctAFundCode.hashCode()));
        result = ((result* 31)+((this.accountPercent2 == null)? 0 :this.accountPercent2 .hashCode()));
        result = ((result* 31)+((this.glNosEnterable == null)? 0 :this.glNosEnterable.hashCode()));
        result = ((result* 31)+((this.tbracctBCoasCode == null)? 0 :this.tbracctBCoasCode.hashCode()));
        result = ((result* 31)+((this.tbracctACoasCode == null)? 0 :this.tbracctACoasCode.hashCode()));
        result = ((result* 31)+((this.tbracctBAcciCode == null)? 0 :this.tbracctBAcciCode.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.tbbeactEffDate == null)? 0 :this.tbbeactEffDate.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.paytCode == null)? 0 :this.paytCode.hashCode()));
        result = ((result* 31)+((this.tbracctAAcciCode == null)? 0 :this.tbracctAAcciCode.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.tbracctARuclCode1 == null)? 0 :this.tbracctARuclCode1 .hashCode()));
        result = ((result* 31)+((this.tbracctARuclCode2 == null)? 0 :this.tbracctARuclCode2 .hashCode()));
        result = ((result* 31)+((this.tbracctARuclCode3 == null)? 0 :this.tbracctARuclCode3 .hashCode()));
        result = ((result* 31)+((this.tbracctALocnCode == null)? 0 :this.tbracctALocnCode.hashCode()));
        result = ((result* 31)+((this.tbracctBAcctCode == null)? 0 :this.tbracctBAcctCode.hashCode()));
        result = ((result* 31)+((this.tbracctAProgCode == null)? 0 :this.tbracctAProgCode.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.tbracctBProgCode == null)? 0 :this.tbracctBProgCode.hashCode()));
        result = ((result* 31)+((this.dirdInd == null)? 0 :this.dirdInd.hashCode()));
        result = ((result* 31)+((this.refundableInd == null)? 0 :this.refundableInd.hashCode()));
        result = ((result* 31)+((this.tbracctAAcctCode == null)? 0 :this.tbracctAAcctCode.hashCode()));
        result = ((result* 31)+((this.taxtCode == null)? 0 :this.taxtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbracctBLocnCode == null)? 0 :this.tbracctBLocnCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceDetailCodes100PostRequest) == false) {
            return false;
        }
        FinanceDetailCodes100PostRequest rhs = ((FinanceDetailCodes100PostRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((this.tbracctAOrgnCode == rhs.tbracctAOrgnCode)||((this.tbracctAOrgnCode!= null)&&this.tbracctAOrgnCode.equals(rhs.tbracctAOrgnCode)))&&((this.tbracctBRuclCode2 == rhs.tbracctBRuclCode2)||((this.tbracctBRuclCode2 != null)&&this.tbracctBRuclCode2 .equals(rhs.tbracctBRuclCode2))))&&((this.tbracctBRuclCode3 == rhs.tbracctBRuclCode3)||((this.tbracctBRuclCode3 != null)&&this.tbracctBRuclCode3 .equals(rhs.tbracctBRuclCode3))))&&((this.detcActiveInd == rhs.detcActiveInd)||((this.detcActiveInd!= null)&&this.detcActiveInd.equals(rhs.detcActiveInd))))&&((this.tbracctBOrgnCode == rhs.tbracctBOrgnCode)||((this.tbracctBOrgnCode!= null)&&this.tbracctBOrgnCode.equals(rhs.tbracctBOrgnCode))))&&((this.tbracctBRuclCode1 == rhs.tbracctBRuclCode1)||((this.tbracctBRuclCode1 != null)&&this.tbracctBRuclCode1 .equals(rhs.tbracctBRuclCode1))))&&((this.payhistInd == rhs.payhistInd)||((this.payhistInd!= null)&&this.payhistInd.equals(rhs.payhistInd))))&&((this.tbracctAActvCode == rhs.tbracctAActvCode)||((this.tbracctAActvCode!= null)&&this.tbracctAActvCode.equals(rhs.tbracctAActvCode))))&&((this.tbracctBActvCode == rhs.tbracctBActvCode)||((this.tbracctBActvCode!= null)&&this.tbracctBActvCode.equals(rhs.tbracctBActvCode))))&&((this.tbracctBFundCode == rhs.tbracctBFundCode)||((this.tbracctBFundCode!= null)&&this.tbracctBFundCode.equals(rhs.tbracctBFundCode))))&&((this.tbracctAFundCode == rhs.tbracctAFundCode)||((this.tbracctAFundCode!= null)&&this.tbracctAFundCode.equals(rhs.tbracctAFundCode))))&&((this.accountPercent2 == rhs.accountPercent2)||((this.accountPercent2 != null)&&this.accountPercent2 .equals(rhs.accountPercent2))))&&((this.glNosEnterable == rhs.glNosEnterable)||((this.glNosEnterable!= null)&&this.glNosEnterable.equals(rhs.glNosEnterable))))&&((this.tbracctBCoasCode == rhs.tbracctBCoasCode)||((this.tbracctBCoasCode!= null)&&this.tbracctBCoasCode.equals(rhs.tbracctBCoasCode))))&&((this.tbracctACoasCode == rhs.tbracctACoasCode)||((this.tbracctACoasCode!= null)&&this.tbracctACoasCode.equals(rhs.tbracctACoasCode))))&&((this.tbracctBAcciCode == rhs.tbracctBAcciCode)||((this.tbracctBAcciCode!= null)&&this.tbracctBAcciCode.equals(rhs.tbracctBAcciCode))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.tbbeactEffDate == rhs.tbbeactEffDate)||((this.tbbeactEffDate!= null)&&this.tbbeactEffDate.equals(rhs.tbbeactEffDate))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.paytCode == rhs.paytCode)||((this.paytCode!= null)&&this.paytCode.equals(rhs.paytCode))))&&((this.tbracctAAcciCode == rhs.tbracctAAcciCode)||((this.tbracctAAcciCode!= null)&&this.tbracctAAcciCode.equals(rhs.tbracctAAcciCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.tbracctARuclCode1 == rhs.tbracctARuclCode1)||((this.tbracctARuclCode1 != null)&&this.tbracctARuclCode1 .equals(rhs.tbracctARuclCode1))))&&((this.tbracctARuclCode2 == rhs.tbracctARuclCode2)||((this.tbracctARuclCode2 != null)&&this.tbracctARuclCode2 .equals(rhs.tbracctARuclCode2))))&&((this.tbracctARuclCode3 == rhs.tbracctARuclCode3)||((this.tbracctARuclCode3 != null)&&this.tbracctARuclCode3 .equals(rhs.tbracctARuclCode3))))&&((this.tbracctALocnCode == rhs.tbracctALocnCode)||((this.tbracctALocnCode!= null)&&this.tbracctALocnCode.equals(rhs.tbracctALocnCode))))&&((this.tbracctBAcctCode == rhs.tbracctBAcctCode)||((this.tbracctBAcctCode!= null)&&this.tbracctBAcctCode.equals(rhs.tbracctBAcctCode))))&&((this.tbracctAProgCode == rhs.tbracctAProgCode)||((this.tbracctAProgCode!= null)&&this.tbracctAProgCode.equals(rhs.tbracctAProgCode))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.tbracctBProgCode == rhs.tbracctBProgCode)||((this.tbracctBProgCode!= null)&&this.tbracctBProgCode.equals(rhs.tbracctBProgCode))))&&((this.dirdInd == rhs.dirdInd)||((this.dirdInd!= null)&&this.dirdInd.equals(rhs.dirdInd))))&&((this.refundableInd == rhs.refundableInd)||((this.refundableInd!= null)&&this.refundableInd.equals(rhs.refundableInd))))&&((this.tbracctAAcctCode == rhs.tbracctAAcctCode)||((this.tbracctAAcctCode!= null)&&this.tbracctAAcctCode.equals(rhs.tbracctAAcctCode))))&&((this.taxtCode == rhs.taxtCode)||((this.taxtCode!= null)&&this.taxtCode.equals(rhs.taxtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbracctBLocnCode == rhs.tbracctBLocnCode)||((this.tbracctBLocnCode!= null)&&this.tbracctBLocnCode.equals(rhs.tbracctBLocnCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
