
package com.ellucian.generated.bpapi.ban.student_account_detail_charges_payments.v1_0_0;

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
    "criteria.detailCode",
    "criteria.amount",
    "tbraccdOrigChgInd",
    "criteria.paymentId",
    "criteria.origChgInd",
    "criteria.statementDate",
    "criteria.termCode",
    "criteria.desc",
    "tbraccdCpdtInd",
    "criteria.tranNumber",
    "holdPassword",
    "criteria.taxMethod",
    "criteria.srceCode",
    "criteria.cpdtInd",
    "criteria.tranNumberPaid",
    "criteria.dueDate",
    "criteria.billDate",
    "id",
    "criteria.currCodeV",
    "criteria.rate",
    "tbraccdDesc",
    "criteria.period",
    "criteria.effectiveDate",
    "criteria.studypathName",
    "criteria.balance",
    "tbraccdPaymentId",
    "criteria.transDate",
    "tbraccdDocumentNumber",
    "criteria.taxAmount",
    "criteria.invNumberPaid",
    "criteria.additionalText",
    "criteria.stspKeySequence",
    "criteria.documentNumber",
    "criteria.entryDate",
    "criteria.aidyCode",
    "criteria.invoiceNumber",
    "criteria.receiptNumber"
})
@Generated("jsonschema2pojo")
public class StudentAccountDetailChargesPayments100PutRequest {

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaDetailCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_AMOUNT")
    private Double criteriaAmount;
    /**
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("tbraccdOrigChgInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ORIG_CHG_IND")
    private String tbraccdOrigChgInd;
    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("criteria.paymentId")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_PAYMENT_ID")
    private String criteriaPaymentId;
    /**
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("criteria.origChgInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ORIG_CHG_IND")
    private String criteriaOrigChgInd;
    /**
     * Statement
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("criteria.statementDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STATEMENT_DATE")
    private Date criteriaStatementDate;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTermCode;
    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DESC")
    private String criteriaDesc;
    /**
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("tbraccdCpdtInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CPDT_IND")
    private String tbraccdCpdtInd;
    /**
     * Trans Num
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("criteria.tranNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER")
    private Double criteriaTranNumber;
    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private Object holdPassword;
    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxMethod")
    private String criteriaTaxMethod;
    /**
     * Source
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("criteria.srceCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce")
    private String criteriaSrceCode;
    /**
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("criteria.cpdtInd")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_CPDT_IND")
    private String criteriaCpdtInd;
    /**
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.tranNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRAN_NUMBER_PAID")
    private Double criteriaTranNumberPaid;
    /**
     * Due
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("criteria.dueDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DUE_DATE")
    private Date criteriaDueDate;
    /**
     * Bill
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("criteria.billDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_BILL_DATE")
    private Date criteriaBillDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("criteria.currCodeV")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String criteriaCurrCodeV;
    /**
     * Rate
     * <p>
     * Lineage reference object : TBRACCD_RATE
     * 
     */
    @JsonProperty("criteria.rate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_RATE")
    private Double criteriaRate;
    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("tbraccdDesc")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DESC")
    private String tbraccdDesc;
    /**
     * Period
     * <p>
     * Lineage reference object : TBRACCD_PERIOD
     * 
     */
    @JsonProperty("criteria.period")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_PERIOD")
    private String criteriaPeriod;
    /**
     * Effective
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
    @JsonProperty("criteria.studypathName")
    private String criteriaStudypathName;
    /**
     * Balance
     * <p>
     * Lineage reference object : TBRACCD_BALANCE
     * 
     */
    @JsonProperty("criteria.balance")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_BALANCE")
    private Double criteriaBalance;
    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("tbraccdPaymentId")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_PAYMENT_ID")
    private String tbraccdPaymentId;
    /**
     * Transaction
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_TRANS_DATE")
    private Date criteriaTransDate;
    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("tbraccdDocumentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String tbraccdDocumentNumber;
    /**
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxAmount")
    private Double criteriaTaxAmount;
    /**
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.invNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INV_NUMBER_PAID")
    private String criteriaInvNumberPaid;
    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.additionalText")
    private String criteriaAdditionalText;
    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE")
    private Double criteriaStspKeySequence;
    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String criteriaDocumentNumber;
    /**
     * Entry
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("criteria.entryDate")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_ENTRY_DATE")
    private Date criteriaEntryDate;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRACCD_AIDY_CODE
     * 
     */
    @JsonProperty("criteria.aidyCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_AIDY_CODE")
    private String criteriaAidyCode;
    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("criteria.invoiceNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INVOICE_NUMBER")
    private String criteriaInvoiceNumber;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.receiptNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_RECEIPT_NUMBER")
    private Double criteriaReceiptNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public String getCriteriaDetailCode() {
        return criteriaDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public void setCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    public Double getCriteriaAmount() {
        return criteriaAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRACCD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    public void setCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
        return this;
    }

    /**
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("tbraccdOrigChgInd")
    public String getTbraccdOrigChgInd() {
        return tbraccdOrigChgInd;
    }

    /**
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("tbraccdOrigChgInd")
    public void setTbraccdOrigChgInd(String tbraccdOrigChgInd) {
        this.tbraccdOrigChgInd = tbraccdOrigChgInd;
    }

    public StudentAccountDetailChargesPayments100PutRequest withTbraccdOrigChgInd(String tbraccdOrigChgInd) {
        this.tbraccdOrigChgInd = tbraccdOrigChgInd;
        return this;
    }

    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("criteria.paymentId")
    public String getCriteriaPaymentId() {
        return criteriaPaymentId;
    }

    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("criteria.paymentId")
    public void setCriteriaPaymentId(String criteriaPaymentId) {
        this.criteriaPaymentId = criteriaPaymentId;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaPaymentId(String criteriaPaymentId) {
        this.criteriaPaymentId = criteriaPaymentId;
        return this;
    }

    /**
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("criteria.origChgInd")
    public String getCriteriaOrigChgInd() {
        return criteriaOrigChgInd;
    }

    /**
     * Original Charge
     * <p>
     * Lineage reference object : TBRACCD_ORIG_CHG_IND
     * 
     */
    @JsonProperty("criteria.origChgInd")
    public void setCriteriaOrigChgInd(String criteriaOrigChgInd) {
        this.criteriaOrigChgInd = criteriaOrigChgInd;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaOrigChgInd(String criteriaOrigChgInd) {
        this.criteriaOrigChgInd = criteriaOrigChgInd;
        return this;
    }

    /**
     * Statement
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("criteria.statementDate")
    public Date getCriteriaStatementDate() {
        return criteriaStatementDate;
    }

    /**
     * Statement
     * <p>
     * Lineage reference object : TBRACCD_STATEMENT_DATE
     * 
     */
    @JsonProperty("criteria.statementDate")
    public void setCriteriaStatementDate(Date criteriaStatementDate) {
        this.criteriaStatementDate = criteriaStatementDate;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaStatementDate(Date criteriaStatementDate) {
        this.criteriaStatementDate = criteriaStatementDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRACCD_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("tbraccdCpdtInd")
    public String getTbraccdCpdtInd() {
        return tbraccdCpdtInd;
    }

    /**
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("tbraccdCpdtInd")
    public void setTbraccdCpdtInd(String tbraccdCpdtInd) {
        this.tbraccdCpdtInd = tbraccdCpdtInd;
    }

    public StudentAccountDetailChargesPayments100PutRequest withTbraccdCpdtInd(String tbraccdCpdtInd) {
        this.tbraccdCpdtInd = tbraccdCpdtInd;
        return this;
    }

    /**
     * Trans Num
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("criteria.tranNumber")
    public Double getCriteriaTranNumber() {
        return criteriaTranNumber;
    }

    /**
     * Trans Num
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("criteria.tranNumber")
    public void setCriteriaTranNumber(Double criteriaTranNumber) {
        this.criteriaTranNumber = criteriaTranNumber;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaTranNumber(Double criteriaTranNumber) {
        this.criteriaTranNumber = criteriaTranNumber;
        return this;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public Object getHoldPassword() {
        return holdPassword;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public void setHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
    }

    public StudentAccountDetailChargesPayments100PutRequest withHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxMethod")
    public String getCriteriaTaxMethod() {
        return criteriaTaxMethod;
    }

    /**
     * Tax Method
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxMethod")
    public void setCriteriaTaxMethod(String criteriaTaxMethod) {
        this.criteriaTaxMethod = criteriaTaxMethod;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaTaxMethod(String criteriaTaxMethod) {
        this.criteriaTaxMethod = criteriaTaxMethod;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("criteria.srceCode")
    public String getCriteriaSrceCode() {
        return criteriaSrceCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRACCD_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("criteria.srceCode")
    public void setCriteriaSrceCode(String criteriaSrceCode) {
        this.criteriaSrceCode = criteriaSrceCode;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaSrceCode(String criteriaSrceCode) {
        this.criteriaSrceCode = criteriaSrceCode;
        return this;
    }

    /**
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("criteria.cpdtInd")
    public String getCriteriaCpdtInd() {
        return criteriaCpdtInd;
    }

    /**
     * Contract Pay Detail
     * <p>
     * Lineage reference object : TBRACCD_CPDT_IND
     * 
     */
    @JsonProperty("criteria.cpdtInd")
    public void setCriteriaCpdtInd(String criteriaCpdtInd) {
        this.criteriaCpdtInd = criteriaCpdtInd;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaCpdtInd(String criteriaCpdtInd) {
        this.criteriaCpdtInd = criteriaCpdtInd;
        return this;
    }

    /**
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.tranNumberPaid")
    public Double getCriteriaTranNumberPaid() {
        return criteriaTranNumberPaid;
    }

    /**
     * Trans Paid
     * <p>
     * Lineage reference object : TBRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.tranNumberPaid")
    public void setCriteriaTranNumberPaid(Double criteriaTranNumberPaid) {
        this.criteriaTranNumberPaid = criteriaTranNumberPaid;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaTranNumberPaid(Double criteriaTranNumberPaid) {
        this.criteriaTranNumberPaid = criteriaTranNumberPaid;
        return this;
    }

    /**
     * Due
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("criteria.dueDate")
    public Date getCriteriaDueDate() {
        return criteriaDueDate;
    }

    /**
     * Due
     * <p>
     * Lineage reference object : TBRACCD_DUE_DATE
     * 
     */
    @JsonProperty("criteria.dueDate")
    public void setCriteriaDueDate(Date criteriaDueDate) {
        this.criteriaDueDate = criteriaDueDate;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaDueDate(Date criteriaDueDate) {
        this.criteriaDueDate = criteriaDueDate;
        return this;
    }

    /**
     * Bill
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("criteria.billDate")
    public Date getCriteriaBillDate() {
        return criteriaBillDate;
    }

    /**
     * Bill
     * <p>
     * Lineage reference object : TBRACCD_BILL_DATE
     * 
     */
    @JsonProperty("criteria.billDate")
    public void setCriteriaBillDate(Date criteriaBillDate) {
        this.criteriaBillDate = criteriaBillDate;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaBillDate(Date criteriaBillDate) {
        this.criteriaBillDate = criteriaBillDate;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public StudentAccountDetailChargesPayments100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("criteria.currCodeV")
    public String getCriteriaCurrCodeV() {
        return criteriaCurrCodeV;
    }

    /**
     * Currency
     * <p>
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("criteria.currCodeV")
    public void setCriteriaCurrCodeV(String criteriaCurrCodeV) {
        this.criteriaCurrCodeV = criteriaCurrCodeV;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaCurrCodeV(String criteriaCurrCodeV) {
        this.criteriaCurrCodeV = criteriaCurrCodeV;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : TBRACCD_RATE
     * 
     */
    @JsonProperty("criteria.rate")
    public Double getCriteriaRate() {
        return criteriaRate;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : TBRACCD_RATE
     * 
     */
    @JsonProperty("criteria.rate")
    public void setCriteriaRate(Double criteriaRate) {
        this.criteriaRate = criteriaRate;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaRate(Double criteriaRate) {
        this.criteriaRate = criteriaRate;
        return this;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("tbraccdDesc")
    public String getTbraccdDesc() {
        return tbraccdDesc;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBRACCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("tbraccdDesc")
    public void setTbraccdDesc(String tbraccdDesc) {
        this.tbraccdDesc = tbraccdDesc;
    }

    public StudentAccountDetailChargesPayments100PutRequest withTbraccdDesc(String tbraccdDesc) {
        this.tbraccdDesc = tbraccdDesc;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRACCD_PERIOD
     * 
     */
    @JsonProperty("criteria.period")
    public String getCriteriaPeriod() {
        return criteriaPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRACCD_PERIOD
     * 
     */
    @JsonProperty("criteria.period")
    public void setCriteriaPeriod(String criteriaPeriod) {
        this.criteriaPeriod = criteriaPeriod;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaPeriod(String criteriaPeriod) {
        this.criteriaPeriod = criteriaPeriod;
        return this;
    }

    /**
     * Effective
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public Date getCriteriaEffectiveDate() {
        return criteriaEffectiveDate;
    }

    /**
     * Effective
     * <p>
     * Lineage reference object : TBRACCD_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
        return this;
    }

    @JsonProperty("criteria.studypathName")
    public String getCriteriaStudypathName() {
        return criteriaStudypathName;
    }

    @JsonProperty("criteria.studypathName")
    public void setCriteriaStudypathName(String criteriaStudypathName) {
        this.criteriaStudypathName = criteriaStudypathName;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaStudypathName(String criteriaStudypathName) {
        this.criteriaStudypathName = criteriaStudypathName;
        return this;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBRACCD_BALANCE
     * 
     */
    @JsonProperty("criteria.balance")
    public Double getCriteriaBalance() {
        return criteriaBalance;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBRACCD_BALANCE
     * 
     */
    @JsonProperty("criteria.balance")
    public void setCriteriaBalance(Double criteriaBalance) {
        this.criteriaBalance = criteriaBalance;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaBalance(Double criteriaBalance) {
        this.criteriaBalance = criteriaBalance;
        return this;
    }

    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("tbraccdPaymentId")
    public String getTbraccdPaymentId() {
        return tbraccdPaymentId;
    }

    /**
     * Pay Num
     * <p>
     * Lineage reference object : TBRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("tbraccdPaymentId")
    public void setTbraccdPaymentId(String tbraccdPaymentId) {
        this.tbraccdPaymentId = tbraccdPaymentId;
    }

    public StudentAccountDetailChargesPayments100PutRequest withTbraccdPaymentId(String tbraccdPaymentId) {
        this.tbraccdPaymentId = tbraccdPaymentId;
        return this;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    public Date getCriteriaTransDate() {
        return criteriaTransDate;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : TBRACCD_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.transDate")
    public void setCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaTransDate(Date criteriaTransDate) {
        this.criteriaTransDate = criteriaTransDate;
        return this;
    }

    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("tbraccdDocumentNumber")
    public String getTbraccdDocumentNumber() {
        return tbraccdDocumentNumber;
    }

    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("tbraccdDocumentNumber")
    public void setTbraccdDocumentNumber(String tbraccdDocumentNumber) {
        this.tbraccdDocumentNumber = tbraccdDocumentNumber;
    }

    public StudentAccountDetailChargesPayments100PutRequest withTbraccdDocumentNumber(String tbraccdDocumentNumber) {
        this.tbraccdDocumentNumber = tbraccdDocumentNumber;
        return this;
    }

    /**
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxAmount")
    public Double getCriteriaTaxAmount() {
        return criteriaTaxAmount;
    }

    /**
     * Tax
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.taxAmount")
    public void setCriteriaTaxAmount(Double criteriaTaxAmount) {
        this.criteriaTaxAmount = criteriaTaxAmount;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaTaxAmount(Double criteriaTaxAmount) {
        this.criteriaTaxAmount = criteriaTaxAmount;
        return this;
    }

    /**
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.invNumberPaid")
    public String getCriteriaInvNumberPaid() {
        return criteriaInvNumberPaid;
    }

    /**
     * Invoice Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("criteria.invNumberPaid")
    public void setCriteriaInvNumberPaid(String criteriaInvNumberPaid) {
        this.criteriaInvNumberPaid = criteriaInvNumberPaid;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaInvNumberPaid(String criteriaInvNumberPaid) {
        this.criteriaInvNumberPaid = criteriaInvNumberPaid;
        return this;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.additionalText")
    public String getCriteriaAdditionalText() {
        return criteriaAdditionalText;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.additionalText")
    public void setCriteriaAdditionalText(String criteriaAdditionalText) {
        this.criteriaAdditionalText = criteriaAdditionalText;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaAdditionalText(String criteriaAdditionalText) {
        this.criteriaAdditionalText = criteriaAdditionalText;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public Double getCriteriaStspKeySequence() {
        return criteriaStspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBRACCD_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public void setCriteriaStspKeySequence(Double criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaStspKeySequence(Double criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
        return this;
    }

    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public String getCriteriaDocumentNumber() {
        return criteriaDocumentNumber;
    }

    /**
     * Doc Num
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("criteria.documentNumber")
    public void setCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaDocumentNumber(String criteriaDocumentNumber) {
        this.criteriaDocumentNumber = criteriaDocumentNumber;
        return this;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("criteria.entryDate")
    public Date getCriteriaEntryDate() {
        return criteriaEntryDate;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : TBRACCD_ENTRY_DATE
     * 
     */
    @JsonProperty("criteria.entryDate")
    public void setCriteriaEntryDate(Date criteriaEntryDate) {
        this.criteriaEntryDate = criteriaEntryDate;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaEntryDate(Date criteriaEntryDate) {
        this.criteriaEntryDate = criteriaEntryDate;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRACCD_AIDY_CODE
     * 
     */
    @JsonProperty("criteria.aidyCode")
    public String getCriteriaAidyCode() {
        return criteriaAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRACCD_AIDY_CODE
     * 
     */
    @JsonProperty("criteria.aidyCode")
    public void setCriteriaAidyCode(String criteriaAidyCode) {
        this.criteriaAidyCode = criteriaAidyCode;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaAidyCode(String criteriaAidyCode) {
        this.criteriaAidyCode = criteriaAidyCode;
        return this;
    }

    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("criteria.invoiceNumber")
    public String getCriteriaInvoiceNumber() {
        return criteriaInvoiceNumber;
    }

    /**
     * Invoice Number
     * <p>
     * Lineage reference object : TBRACCD_INVOICE_NUMBER
     * 
     */
    @JsonProperty("criteria.invoiceNumber")
    public void setCriteriaInvoiceNumber(String criteriaInvoiceNumber) {
        this.criteriaInvoiceNumber = criteriaInvoiceNumber;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaInvoiceNumber(String criteriaInvoiceNumber) {
        this.criteriaInvoiceNumber = criteriaInvoiceNumber;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.receiptNumber")
    public Double getCriteriaReceiptNumber() {
        return criteriaReceiptNumber;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBRACCD_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("criteria.receiptNumber")
    public void setCriteriaReceiptNumber(Double criteriaReceiptNumber) {
        this.criteriaReceiptNumber = criteriaReceiptNumber;
    }

    public StudentAccountDetailChargesPayments100PutRequest withCriteriaReceiptNumber(Double criteriaReceiptNumber) {
        this.criteriaReceiptNumber = criteriaReceiptNumber;
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

    public StudentAccountDetailChargesPayments100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountDetailChargesPayments100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDetailCode");
        sb.append('=');
        sb.append(((this.criteriaDetailCode == null)?"<null>":this.criteriaDetailCode));
        sb.append(',');
        sb.append("criteriaAmount");
        sb.append('=');
        sb.append(((this.criteriaAmount == null)?"<null>":this.criteriaAmount));
        sb.append(',');
        sb.append("tbraccdOrigChgInd");
        sb.append('=');
        sb.append(((this.tbraccdOrigChgInd == null)?"<null>":this.tbraccdOrigChgInd));
        sb.append(',');
        sb.append("criteriaPaymentId");
        sb.append('=');
        sb.append(((this.criteriaPaymentId == null)?"<null>":this.criteriaPaymentId));
        sb.append(',');
        sb.append("criteriaOrigChgInd");
        sb.append('=');
        sb.append(((this.criteriaOrigChgInd == null)?"<null>":this.criteriaOrigChgInd));
        sb.append(',');
        sb.append("criteriaStatementDate");
        sb.append('=');
        sb.append(((this.criteriaStatementDate == null)?"<null>":this.criteriaStatementDate));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("tbraccdCpdtInd");
        sb.append('=');
        sb.append(((this.tbraccdCpdtInd == null)?"<null>":this.tbraccdCpdtInd));
        sb.append(',');
        sb.append("criteriaTranNumber");
        sb.append('=');
        sb.append(((this.criteriaTranNumber == null)?"<null>":this.criteriaTranNumber));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("criteriaTaxMethod");
        sb.append('=');
        sb.append(((this.criteriaTaxMethod == null)?"<null>":this.criteriaTaxMethod));
        sb.append(',');
        sb.append("criteriaSrceCode");
        sb.append('=');
        sb.append(((this.criteriaSrceCode == null)?"<null>":this.criteriaSrceCode));
        sb.append(',');
        sb.append("criteriaCpdtInd");
        sb.append('=');
        sb.append(((this.criteriaCpdtInd == null)?"<null>":this.criteriaCpdtInd));
        sb.append(',');
        sb.append("criteriaTranNumberPaid");
        sb.append('=');
        sb.append(((this.criteriaTranNumberPaid == null)?"<null>":this.criteriaTranNumberPaid));
        sb.append(',');
        sb.append("criteriaDueDate");
        sb.append('=');
        sb.append(((this.criteriaDueDate == null)?"<null>":this.criteriaDueDate));
        sb.append(',');
        sb.append("criteriaBillDate");
        sb.append('=');
        sb.append(((this.criteriaBillDate == null)?"<null>":this.criteriaBillDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaCurrCodeV");
        sb.append('=');
        sb.append(((this.criteriaCurrCodeV == null)?"<null>":this.criteriaCurrCodeV));
        sb.append(',');
        sb.append("criteriaRate");
        sb.append('=');
        sb.append(((this.criteriaRate == null)?"<null>":this.criteriaRate));
        sb.append(',');
        sb.append("tbraccdDesc");
        sb.append('=');
        sb.append(((this.tbraccdDesc == null)?"<null>":this.tbraccdDesc));
        sb.append(',');
        sb.append("criteriaPeriod");
        sb.append('=');
        sb.append(((this.criteriaPeriod == null)?"<null>":this.criteriaPeriod));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
        sb.append(',');
        sb.append("criteriaStudypathName");
        sb.append('=');
        sb.append(((this.criteriaStudypathName == null)?"<null>":this.criteriaStudypathName));
        sb.append(',');
        sb.append("criteriaBalance");
        sb.append('=');
        sb.append(((this.criteriaBalance == null)?"<null>":this.criteriaBalance));
        sb.append(',');
        sb.append("tbraccdPaymentId");
        sb.append('=');
        sb.append(((this.tbraccdPaymentId == null)?"<null>":this.tbraccdPaymentId));
        sb.append(',');
        sb.append("criteriaTransDate");
        sb.append('=');
        sb.append(((this.criteriaTransDate == null)?"<null>":this.criteriaTransDate));
        sb.append(',');
        sb.append("tbraccdDocumentNumber");
        sb.append('=');
        sb.append(((this.tbraccdDocumentNumber == null)?"<null>":this.tbraccdDocumentNumber));
        sb.append(',');
        sb.append("criteriaTaxAmount");
        sb.append('=');
        sb.append(((this.criteriaTaxAmount == null)?"<null>":this.criteriaTaxAmount));
        sb.append(',');
        sb.append("criteriaInvNumberPaid");
        sb.append('=');
        sb.append(((this.criteriaInvNumberPaid == null)?"<null>":this.criteriaInvNumberPaid));
        sb.append(',');
        sb.append("criteriaAdditionalText");
        sb.append('=');
        sb.append(((this.criteriaAdditionalText == null)?"<null>":this.criteriaAdditionalText));
        sb.append(',');
        sb.append("criteriaStspKeySequence");
        sb.append('=');
        sb.append(((this.criteriaStspKeySequence == null)?"<null>":this.criteriaStspKeySequence));
        sb.append(',');
        sb.append("criteriaDocumentNumber");
        sb.append('=');
        sb.append(((this.criteriaDocumentNumber == null)?"<null>":this.criteriaDocumentNumber));
        sb.append(',');
        sb.append("criteriaEntryDate");
        sb.append('=');
        sb.append(((this.criteriaEntryDate == null)?"<null>":this.criteriaEntryDate));
        sb.append(',');
        sb.append("criteriaAidyCode");
        sb.append('=');
        sb.append(((this.criteriaAidyCode == null)?"<null>":this.criteriaAidyCode));
        sb.append(',');
        sb.append("criteriaInvoiceNumber");
        sb.append('=');
        sb.append(((this.criteriaInvoiceNumber == null)?"<null>":this.criteriaInvoiceNumber));
        sb.append(',');
        sb.append("criteriaReceiptNumber");
        sb.append('=');
        sb.append(((this.criteriaReceiptNumber == null)?"<null>":this.criteriaReceiptNumber));
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
        result = ((result* 31)+((this.criteriaStspKeySequence == null)? 0 :this.criteriaStspKeySequence.hashCode()));
        result = ((result* 31)+((this.tbraccdOrigChgInd == null)? 0 :this.tbraccdOrigChgInd.hashCode()));
        result = ((result* 31)+((this.criteriaCpdtInd == null)? 0 :this.criteriaCpdtInd.hashCode()));
        result = ((result* 31)+((this.criteriaTranNumberPaid == null)? 0 :this.criteriaTranNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaDueDate == null)? 0 :this.criteriaDueDate.hashCode()));
        result = ((result* 31)+((this.criteriaEntryDate == null)? 0 :this.criteriaEntryDate.hashCode()));
        result = ((result* 31)+((this.tbraccdCpdtInd == null)? 0 :this.tbraccdCpdtInd.hashCode()));
        result = ((result* 31)+((this.criteriaCurrCodeV == null)? 0 :this.criteriaCurrCodeV.hashCode()));
        result = ((result* 31)+((this.criteriaBalance == null)? 0 :this.criteriaBalance.hashCode()));
        result = ((result* 31)+((this.criteriaAmount == null)? 0 :this.criteriaAmount.hashCode()));
        result = ((result* 31)+((this.criteriaStatementDate == null)? 0 :this.criteriaStatementDate.hashCode()));
        result = ((result* 31)+((this.criteriaInvoiceNumber == null)? 0 :this.criteriaInvoiceNumber.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.criteriaReceiptNumber == null)? 0 :this.criteriaReceiptNumber.hashCode()));
        result = ((result* 31)+((this.criteriaSrceCode == null)? 0 :this.criteriaSrceCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tbraccdDesc == null)? 0 :this.tbraccdDesc.hashCode()));
        result = ((result* 31)+((this.criteriaBillDate == null)? 0 :this.criteriaBillDate.hashCode()));
        result = ((result* 31)+((this.criteriaDocumentNumber == null)? 0 :this.criteriaDocumentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaTaxMethod == null)? 0 :this.criteriaTaxMethod.hashCode()));
        result = ((result* 31)+((this.tbraccdPaymentId == null)? 0 :this.tbraccdPaymentId.hashCode()));
        result = ((result* 31)+((this.criteriaTransDate == null)? 0 :this.criteriaTransDate.hashCode()));
        result = ((result* 31)+((this.criteriaInvNumberPaid == null)? 0 :this.criteriaInvNumberPaid.hashCode()));
        result = ((result* 31)+((this.criteriaTaxAmount == null)? 0 :this.criteriaTaxAmount.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.tbraccdDocumentNumber == null)? 0 :this.tbraccdDocumentNumber.hashCode()));
        result = ((result* 31)+((this.criteriaRate == null)? 0 :this.criteriaRate.hashCode()));
        result = ((result* 31)+((this.criteriaTranNumber == null)? 0 :this.criteriaTranNumber.hashCode()));
        result = ((result* 31)+((this.criteriaPeriod == null)? 0 :this.criteriaPeriod.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigChgInd == null)? 0 :this.criteriaOrigChgInd.hashCode()));
        result = ((result* 31)+((this.criteriaAidyCode == null)? 0 :this.criteriaAidyCode.hashCode()));
        result = ((result* 31)+((this.criteriaStudypathName == null)? 0 :this.criteriaStudypathName.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaPaymentId == null)? 0 :this.criteriaPaymentId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.criteriaAdditionalText == null)? 0 :this.criteriaAdditionalText.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountDetailChargesPayments100PutRequest) == false) {
            return false;
        }
        StudentAccountDetailChargesPayments100PutRequest rhs = ((StudentAccountDetailChargesPayments100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((this.criteriaStspKeySequence == rhs.criteriaStspKeySequence)||((this.criteriaStspKeySequence!= null)&&this.criteriaStspKeySequence.equals(rhs.criteriaStspKeySequence)))&&((this.tbraccdOrigChgInd == rhs.tbraccdOrigChgInd)||((this.tbraccdOrigChgInd!= null)&&this.tbraccdOrigChgInd.equals(rhs.tbraccdOrigChgInd))))&&((this.criteriaCpdtInd == rhs.criteriaCpdtInd)||((this.criteriaCpdtInd!= null)&&this.criteriaCpdtInd.equals(rhs.criteriaCpdtInd))))&&((this.criteriaTranNumberPaid == rhs.criteriaTranNumberPaid)||((this.criteriaTranNumberPaid!= null)&&this.criteriaTranNumberPaid.equals(rhs.criteriaTranNumberPaid))))&&((this.criteriaDueDate == rhs.criteriaDueDate)||((this.criteriaDueDate!= null)&&this.criteriaDueDate.equals(rhs.criteriaDueDate))))&&((this.criteriaEntryDate == rhs.criteriaEntryDate)||((this.criteriaEntryDate!= null)&&this.criteriaEntryDate.equals(rhs.criteriaEntryDate))))&&((this.tbraccdCpdtInd == rhs.tbraccdCpdtInd)||((this.tbraccdCpdtInd!= null)&&this.tbraccdCpdtInd.equals(rhs.tbraccdCpdtInd))))&&((this.criteriaCurrCodeV == rhs.criteriaCurrCodeV)||((this.criteriaCurrCodeV!= null)&&this.criteriaCurrCodeV.equals(rhs.criteriaCurrCodeV))))&&((this.criteriaBalance == rhs.criteriaBalance)||((this.criteriaBalance!= null)&&this.criteriaBalance.equals(rhs.criteriaBalance))))&&((this.criteriaAmount == rhs.criteriaAmount)||((this.criteriaAmount!= null)&&this.criteriaAmount.equals(rhs.criteriaAmount))))&&((this.criteriaStatementDate == rhs.criteriaStatementDate)||((this.criteriaStatementDate!= null)&&this.criteriaStatementDate.equals(rhs.criteriaStatementDate))))&&((this.criteriaInvoiceNumber == rhs.criteriaInvoiceNumber)||((this.criteriaInvoiceNumber!= null)&&this.criteriaInvoiceNumber.equals(rhs.criteriaInvoiceNumber))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.criteriaReceiptNumber == rhs.criteriaReceiptNumber)||((this.criteriaReceiptNumber!= null)&&this.criteriaReceiptNumber.equals(rhs.criteriaReceiptNumber))))&&((this.criteriaSrceCode == rhs.criteriaSrceCode)||((this.criteriaSrceCode!= null)&&this.criteriaSrceCode.equals(rhs.criteriaSrceCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tbraccdDesc == rhs.tbraccdDesc)||((this.tbraccdDesc!= null)&&this.tbraccdDesc.equals(rhs.tbraccdDesc))))&&((this.criteriaBillDate == rhs.criteriaBillDate)||((this.criteriaBillDate!= null)&&this.criteriaBillDate.equals(rhs.criteriaBillDate))))&&((this.criteriaDocumentNumber == rhs.criteriaDocumentNumber)||((this.criteriaDocumentNumber!= null)&&this.criteriaDocumentNumber.equals(rhs.criteriaDocumentNumber))))&&((this.criteriaTaxMethod == rhs.criteriaTaxMethod)||((this.criteriaTaxMethod!= null)&&this.criteriaTaxMethod.equals(rhs.criteriaTaxMethod))))&&((this.tbraccdPaymentId == rhs.tbraccdPaymentId)||((this.tbraccdPaymentId!= null)&&this.tbraccdPaymentId.equals(rhs.tbraccdPaymentId))))&&((this.criteriaTransDate == rhs.criteriaTransDate)||((this.criteriaTransDate!= null)&&this.criteriaTransDate.equals(rhs.criteriaTransDate))))&&((this.criteriaInvNumberPaid == rhs.criteriaInvNumberPaid)||((this.criteriaInvNumberPaid!= null)&&this.criteriaInvNumberPaid.equals(rhs.criteriaInvNumberPaid))))&&((this.criteriaTaxAmount == rhs.criteriaTaxAmount)||((this.criteriaTaxAmount!= null)&&this.criteriaTaxAmount.equals(rhs.criteriaTaxAmount))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.tbraccdDocumentNumber == rhs.tbraccdDocumentNumber)||((this.tbraccdDocumentNumber!= null)&&this.tbraccdDocumentNumber.equals(rhs.tbraccdDocumentNumber))))&&((this.criteriaRate == rhs.criteriaRate)||((this.criteriaRate!= null)&&this.criteriaRate.equals(rhs.criteriaRate))))&&((this.criteriaTranNumber == rhs.criteriaTranNumber)||((this.criteriaTranNumber!= null)&&this.criteriaTranNumber.equals(rhs.criteriaTranNumber))))&&((this.criteriaPeriod == rhs.criteriaPeriod)||((this.criteriaPeriod!= null)&&this.criteriaPeriod.equals(rhs.criteriaPeriod))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.criteriaOrigChgInd == rhs.criteriaOrigChgInd)||((this.criteriaOrigChgInd!= null)&&this.criteriaOrigChgInd.equals(rhs.criteriaOrigChgInd))))&&((this.criteriaAidyCode == rhs.criteriaAidyCode)||((this.criteriaAidyCode!= null)&&this.criteriaAidyCode.equals(rhs.criteriaAidyCode))))&&((this.criteriaStudypathName == rhs.criteriaStudypathName)||((this.criteriaStudypathName!= null)&&this.criteriaStudypathName.equals(rhs.criteriaStudypathName))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.criteriaPaymentId == rhs.criteriaPaymentId)||((this.criteriaPaymentId!= null)&&this.criteriaPaymentId.equals(rhs.criteriaPaymentId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.criteriaAdditionalText == rhs.criteriaAdditionalText)||((this.criteriaAdditionalText!= null)&&this.criteriaAdditionalText.equals(rhs.criteriaAdditionalText))));
    }

}
