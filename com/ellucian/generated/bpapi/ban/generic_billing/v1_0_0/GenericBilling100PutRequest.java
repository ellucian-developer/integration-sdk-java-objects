
package com.ellucian.generated.bpapi.ban.generic_billing.v1_0_0;

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
    "groupSeqNo",
    "periodFromDate",
    "criteria.billInvAdjNo",
    "criteria.periodToDate",
    "criteria.budgetAmt",
    "updateInd",
    "displayBillInv",
    "criteria.withholdingAmt",
    "criteria.billInvSeqNo",
    "criteria.bfrmCode",
    "budgetAmt",
    "withholdingAmt",
    "billInvAdjNo",
    "criteria.grntCode",
    "bfrmCode",
    "criteria.completeInd",
    "criteria.dateSubmitted",
    "frrgenbBillInvSeqNo",
    "grntCode",
    "criteria.groupSeqNo",
    "criteria.billAmt",
    "finalInd",
    "billAmt",
    "displayBfrmCode",
    "periodToDate",
    "displayGrantCode",
    "criteria.updateInd",
    "criteria.finalInd",
    "criteria.periodFromDate",
    "displayBillAdj",
    "dateSubmitted"
})
@Generated("jsonschema2pojo")
public class GenericBilling100PutRequest {

    /**
     * Group Sequence Number
     * <p>
     * Lineage reference object : FRRGENB_GROUP_SEQ_NO, Lookup lineage reference object : frrbfrm
     * (Required)
     * 
     */
    @JsonProperty("groupSeqNo")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_GROUP_SEQ_NO, Lookup lineage reference object : frrbfrm")
    private Double groupSeqNo;
    /**
     * Period From
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodFromDate")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_PERIOD_FROM_DATE")
    private Date periodFromDate;
    /**
     * Lineage reference object : FRRGENB_BILL_INV_ADJ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.billInvAdjNo")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BILL_INV_ADJ_NO")
    private Double criteriaBillInvAdjNo;
    /**
     * Period To
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.periodToDate")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_PERIOD_TO_DATE")
    private Date criteriaPeriodToDate;
    /**
     * Budget Amount
     * <p>
     * Lineage reference object : FRRGENB_BUDGET_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgetAmt")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BUDGET_AMT")
    private Double criteriaBudgetAmt;
    /**
     * Update Indicator
     * <p>
     * Lineage reference object : FRRGENB_UPDATE_IND
     * (Required)
     * 
     */
    @JsonProperty("updateInd")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_UPDATE_IND")
    private String updateInd;
    /**
     * Bill Invoice
     * <p>
     * Lineage reference object : displayBillInv
     * 
     */
    @JsonProperty("displayBillInv")
    @JsonPropertyDescription("Lineage reference object : displayBillInv")
    private Object displayBillInv;
    /**
     * Retainage
     * <p>
     * Lineage reference object : FRRGENB_WITHHOLDING_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.withholdingAmt")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_WITHHOLDING_AMT")
    private Double criteriaWithholdingAmt;
    /**
     * Bill Invoice Number
     * <p>
     * Lineage reference object : FRRGENB_BILL_INV_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.billInvSeqNo")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BILL_INV_SEQ_NO")
    private Double criteriaBillInvSeqNo;
    /**
     * Bill Format
     * <p>
     * Lineage reference object : FRRGENB_BFRM_CODE
     * 
     */
    @JsonProperty("criteria.bfrmCode")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BFRM_CODE")
    private String criteriaBfrmCode;
    /**
     * Budget Amount
     * <p>
     * Lineage reference object : FRRGENB_BUDGET_AMT
     * (Required)
     * 
     */
    @JsonProperty("budgetAmt")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BUDGET_AMT")
    private Double budgetAmt;
    /**
     * Retainage
     * <p>
     * Lineage reference object : FRRGENB_WITHHOLDING_AMT
     * (Required)
     * 
     */
    @JsonProperty("withholdingAmt")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_WITHHOLDING_AMT")
    private Double withholdingAmt;
    /**
     * Lineage reference object : FRRGENB_BILL_INV_ADJ_NO
     * (Required)
     * 
     */
    @JsonProperty("billInvAdjNo")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BILL_INV_ADJ_NO")
    private Double billInvAdjNo;
    /**
     * Grant
     * <p>
     * Lineage reference object : FRRGENB_GRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grntCode")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_GRNT_CODE")
    private String criteriaGrntCode;
    /**
     * Bill Format
     * <p>
     * Lineage reference object : FRRGENB_BFRM_CODE
     * 
     */
    @JsonProperty("bfrmCode")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BFRM_CODE")
    private String bfrmCode;
    /**
     * Complete Indicator
     * <p>
     * Lineage reference object : FRRGENB_COMPLETE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.completeInd")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_COMPLETE_IND")
    private String criteriaCompleteInd;
    /**
     * Date Submitted
     * <p>
     * Lineage reference object : FRRGENB_DATE_SUBMITTED
     * (Required)
     * 
     */
    @JsonProperty("criteria.dateSubmitted")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_DATE_SUBMITTED")
    private Date criteriaDateSubmitted;
    /**
     * Bill Invoice Number
     * <p>
     * Lineage reference object : FRRGENB_BILL_INV_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("frrgenbBillInvSeqNo")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BILL_INV_SEQ_NO")
    private Double frrgenbBillInvSeqNo;
    /**
     * Grant
     * <p>
     * Lineage reference object : FRRGENB_GRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("grntCode")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_GRNT_CODE")
    private String grntCode;
    /**
     * Group Sequence Number
     * <p>
     * Lineage reference object : FRRGENB_GROUP_SEQ_NO, Lookup lineage reference object : frrbfrm
     * (Required)
     * 
     */
    @JsonProperty("criteria.groupSeqNo")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_GROUP_SEQ_NO, Lookup lineage reference object : frrbfrm")
    private Double criteriaGroupSeqNo;
    /**
     * Bill Amount
     * <p>
     * Lineage reference object : FRRGENB_BILL_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.billAmt")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BILL_AMT")
    private Double criteriaBillAmt;
    /**
     * Final Indicator
     * <p>
     * Lineage reference object : FRRGENB_FINAL_IND
     * (Required)
     * 
     */
    @JsonProperty("finalInd")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_FINAL_IND")
    private String finalInd;
    /**
     * Bill Amount
     * <p>
     * Lineage reference object : FRRGENB_BILL_AMT
     * (Required)
     * 
     */
    @JsonProperty("billAmt")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BILL_AMT")
    private Double billAmt;
    /**
     * Bill Format
     * <p>
     * Lineage reference object : displayBfrmCode
     * 
     */
    @JsonProperty("displayBfrmCode")
    @JsonPropertyDescription("Lineage reference object : displayBfrmCode")
    private Object displayBfrmCode;
    /**
     * Period To
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodToDate")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_PERIOD_TO_DATE")
    private Date periodToDate;
    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrantCode
     * 
     */
    @JsonProperty("displayGrantCode")
    @JsonPropertyDescription("Lineage reference object : displayGrantCode")
    private Object displayGrantCode;
    /**
     * Update Indicator
     * <p>
     * Lineage reference object : FRRGENB_UPDATE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.updateInd")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_UPDATE_IND")
    private String criteriaUpdateInd;
    /**
     * Final Indicator
     * <p>
     * Lineage reference object : FRRGENB_FINAL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.finalInd")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_FINAL_IND")
    private String criteriaFinalInd;
    /**
     * Period From
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.periodFromDate")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_PERIOD_FROM_DATE")
    private Date criteriaPeriodFromDate;
    /**
     * Lineage reference object : displayBillAdj
     * 
     */
    @JsonProperty("displayBillAdj")
    @JsonPropertyDescription("Lineage reference object : displayBillAdj")
    private Object displayBillAdj;
    /**
     * Date Submitted
     * <p>
     * Lineage reference object : FRRGENB_DATE_SUBMITTED
     * (Required)
     * 
     */
    @JsonProperty("dateSubmitted")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_DATE_SUBMITTED")
    private Date dateSubmitted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Group Sequence Number
     * <p>
     * Lineage reference object : FRRGENB_GROUP_SEQ_NO, Lookup lineage reference object : frrbfrm
     * (Required)
     * 
     */
    @JsonProperty("groupSeqNo")
    public Double getGroupSeqNo() {
        return groupSeqNo;
    }

    /**
     * Group Sequence Number
     * <p>
     * Lineage reference object : FRRGENB_GROUP_SEQ_NO, Lookup lineage reference object : frrbfrm
     * (Required)
     * 
     */
    @JsonProperty("groupSeqNo")
    public void setGroupSeqNo(Double groupSeqNo) {
        this.groupSeqNo = groupSeqNo;
    }

    public GenericBilling100PutRequest withGroupSeqNo(Double groupSeqNo) {
        this.groupSeqNo = groupSeqNo;
        return this;
    }

    /**
     * Period From
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodFromDate")
    public Date getPeriodFromDate() {
        return periodFromDate;
    }

    /**
     * Period From
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodFromDate")
    public void setPeriodFromDate(Date periodFromDate) {
        this.periodFromDate = periodFromDate;
    }

    public GenericBilling100PutRequest withPeriodFromDate(Date periodFromDate) {
        this.periodFromDate = periodFromDate;
        return this;
    }

    /**
     * Lineage reference object : FRRGENB_BILL_INV_ADJ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.billInvAdjNo")
    public Double getCriteriaBillInvAdjNo() {
        return criteriaBillInvAdjNo;
    }

    /**
     * Lineage reference object : FRRGENB_BILL_INV_ADJ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.billInvAdjNo")
    public void setCriteriaBillInvAdjNo(Double criteriaBillInvAdjNo) {
        this.criteriaBillInvAdjNo = criteriaBillInvAdjNo;
    }

    public GenericBilling100PutRequest withCriteriaBillInvAdjNo(Double criteriaBillInvAdjNo) {
        this.criteriaBillInvAdjNo = criteriaBillInvAdjNo;
        return this;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.periodToDate")
    public Date getCriteriaPeriodToDate() {
        return criteriaPeriodToDate;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.periodToDate")
    public void setCriteriaPeriodToDate(Date criteriaPeriodToDate) {
        this.criteriaPeriodToDate = criteriaPeriodToDate;
    }

    public GenericBilling100PutRequest withCriteriaPeriodToDate(Date criteriaPeriodToDate) {
        this.criteriaPeriodToDate = criteriaPeriodToDate;
        return this;
    }

    /**
     * Budget Amount
     * <p>
     * Lineage reference object : FRRGENB_BUDGET_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgetAmt")
    public Double getCriteriaBudgetAmt() {
        return criteriaBudgetAmt;
    }

    /**
     * Budget Amount
     * <p>
     * Lineage reference object : FRRGENB_BUDGET_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.budgetAmt")
    public void setCriteriaBudgetAmt(Double criteriaBudgetAmt) {
        this.criteriaBudgetAmt = criteriaBudgetAmt;
    }

    public GenericBilling100PutRequest withCriteriaBudgetAmt(Double criteriaBudgetAmt) {
        this.criteriaBudgetAmt = criteriaBudgetAmt;
        return this;
    }

    /**
     * Update Indicator
     * <p>
     * Lineage reference object : FRRGENB_UPDATE_IND
     * (Required)
     * 
     */
    @JsonProperty("updateInd")
    public String getUpdateInd() {
        return updateInd;
    }

    /**
     * Update Indicator
     * <p>
     * Lineage reference object : FRRGENB_UPDATE_IND
     * (Required)
     * 
     */
    @JsonProperty("updateInd")
    public void setUpdateInd(String updateInd) {
        this.updateInd = updateInd;
    }

    public GenericBilling100PutRequest withUpdateInd(String updateInd) {
        this.updateInd = updateInd;
        return this;
    }

    /**
     * Bill Invoice
     * <p>
     * Lineage reference object : displayBillInv
     * 
     */
    @JsonProperty("displayBillInv")
    public Object getDisplayBillInv() {
        return displayBillInv;
    }

    /**
     * Bill Invoice
     * <p>
     * Lineage reference object : displayBillInv
     * 
     */
    @JsonProperty("displayBillInv")
    public void setDisplayBillInv(Object displayBillInv) {
        this.displayBillInv = displayBillInv;
    }

    public GenericBilling100PutRequest withDisplayBillInv(Object displayBillInv) {
        this.displayBillInv = displayBillInv;
        return this;
    }

    /**
     * Retainage
     * <p>
     * Lineage reference object : FRRGENB_WITHHOLDING_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.withholdingAmt")
    public Double getCriteriaWithholdingAmt() {
        return criteriaWithholdingAmt;
    }

    /**
     * Retainage
     * <p>
     * Lineage reference object : FRRGENB_WITHHOLDING_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.withholdingAmt")
    public void setCriteriaWithholdingAmt(Double criteriaWithholdingAmt) {
        this.criteriaWithholdingAmt = criteriaWithholdingAmt;
    }

    public GenericBilling100PutRequest withCriteriaWithholdingAmt(Double criteriaWithholdingAmt) {
        this.criteriaWithholdingAmt = criteriaWithholdingAmt;
        return this;
    }

    /**
     * Bill Invoice Number
     * <p>
     * Lineage reference object : FRRGENB_BILL_INV_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.billInvSeqNo")
    public Double getCriteriaBillInvSeqNo() {
        return criteriaBillInvSeqNo;
    }

    /**
     * Bill Invoice Number
     * <p>
     * Lineage reference object : FRRGENB_BILL_INV_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.billInvSeqNo")
    public void setCriteriaBillInvSeqNo(Double criteriaBillInvSeqNo) {
        this.criteriaBillInvSeqNo = criteriaBillInvSeqNo;
    }

    public GenericBilling100PutRequest withCriteriaBillInvSeqNo(Double criteriaBillInvSeqNo) {
        this.criteriaBillInvSeqNo = criteriaBillInvSeqNo;
        return this;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : FRRGENB_BFRM_CODE
     * 
     */
    @JsonProperty("criteria.bfrmCode")
    public String getCriteriaBfrmCode() {
        return criteriaBfrmCode;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : FRRGENB_BFRM_CODE
     * 
     */
    @JsonProperty("criteria.bfrmCode")
    public void setCriteriaBfrmCode(String criteriaBfrmCode) {
        this.criteriaBfrmCode = criteriaBfrmCode;
    }

    public GenericBilling100PutRequest withCriteriaBfrmCode(String criteriaBfrmCode) {
        this.criteriaBfrmCode = criteriaBfrmCode;
        return this;
    }

    /**
     * Budget Amount
     * <p>
     * Lineage reference object : FRRGENB_BUDGET_AMT
     * (Required)
     * 
     */
    @JsonProperty("budgetAmt")
    public Double getBudgetAmt() {
        return budgetAmt;
    }

    /**
     * Budget Amount
     * <p>
     * Lineage reference object : FRRGENB_BUDGET_AMT
     * (Required)
     * 
     */
    @JsonProperty("budgetAmt")
    public void setBudgetAmt(Double budgetAmt) {
        this.budgetAmt = budgetAmt;
    }

    public GenericBilling100PutRequest withBudgetAmt(Double budgetAmt) {
        this.budgetAmt = budgetAmt;
        return this;
    }

    /**
     * Retainage
     * <p>
     * Lineage reference object : FRRGENB_WITHHOLDING_AMT
     * (Required)
     * 
     */
    @JsonProperty("withholdingAmt")
    public Double getWithholdingAmt() {
        return withholdingAmt;
    }

    /**
     * Retainage
     * <p>
     * Lineage reference object : FRRGENB_WITHHOLDING_AMT
     * (Required)
     * 
     */
    @JsonProperty("withholdingAmt")
    public void setWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
    }

    public GenericBilling100PutRequest withWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
        return this;
    }

    /**
     * Lineage reference object : FRRGENB_BILL_INV_ADJ_NO
     * (Required)
     * 
     */
    @JsonProperty("billInvAdjNo")
    public Double getBillInvAdjNo() {
        return billInvAdjNo;
    }

    /**
     * Lineage reference object : FRRGENB_BILL_INV_ADJ_NO
     * (Required)
     * 
     */
    @JsonProperty("billInvAdjNo")
    public void setBillInvAdjNo(Double billInvAdjNo) {
        this.billInvAdjNo = billInvAdjNo;
    }

    public GenericBilling100PutRequest withBillInvAdjNo(Double billInvAdjNo) {
        this.billInvAdjNo = billInvAdjNo;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FRRGENB_GRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grntCode")
    public String getCriteriaGrntCode() {
        return criteriaGrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FRRGENB_GRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grntCode")
    public void setCriteriaGrntCode(String criteriaGrntCode) {
        this.criteriaGrntCode = criteriaGrntCode;
    }

    public GenericBilling100PutRequest withCriteriaGrntCode(String criteriaGrntCode) {
        this.criteriaGrntCode = criteriaGrntCode;
        return this;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : FRRGENB_BFRM_CODE
     * 
     */
    @JsonProperty("bfrmCode")
    public String getBfrmCode() {
        return bfrmCode;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : FRRGENB_BFRM_CODE
     * 
     */
    @JsonProperty("bfrmCode")
    public void setBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
    }

    public GenericBilling100PutRequest withBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
        return this;
    }

    /**
     * Complete Indicator
     * <p>
     * Lineage reference object : FRRGENB_COMPLETE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.completeInd")
    public String getCriteriaCompleteInd() {
        return criteriaCompleteInd;
    }

    /**
     * Complete Indicator
     * <p>
     * Lineage reference object : FRRGENB_COMPLETE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.completeInd")
    public void setCriteriaCompleteInd(String criteriaCompleteInd) {
        this.criteriaCompleteInd = criteriaCompleteInd;
    }

    public GenericBilling100PutRequest withCriteriaCompleteInd(String criteriaCompleteInd) {
        this.criteriaCompleteInd = criteriaCompleteInd;
        return this;
    }

    /**
     * Date Submitted
     * <p>
     * Lineage reference object : FRRGENB_DATE_SUBMITTED
     * (Required)
     * 
     */
    @JsonProperty("criteria.dateSubmitted")
    public Date getCriteriaDateSubmitted() {
        return criteriaDateSubmitted;
    }

    /**
     * Date Submitted
     * <p>
     * Lineage reference object : FRRGENB_DATE_SUBMITTED
     * (Required)
     * 
     */
    @JsonProperty("criteria.dateSubmitted")
    public void setCriteriaDateSubmitted(Date criteriaDateSubmitted) {
        this.criteriaDateSubmitted = criteriaDateSubmitted;
    }

    public GenericBilling100PutRequest withCriteriaDateSubmitted(Date criteriaDateSubmitted) {
        this.criteriaDateSubmitted = criteriaDateSubmitted;
        return this;
    }

    /**
     * Bill Invoice Number
     * <p>
     * Lineage reference object : FRRGENB_BILL_INV_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("frrgenbBillInvSeqNo")
    public Double getFrrgenbBillInvSeqNo() {
        return frrgenbBillInvSeqNo;
    }

    /**
     * Bill Invoice Number
     * <p>
     * Lineage reference object : FRRGENB_BILL_INV_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("frrgenbBillInvSeqNo")
    public void setFrrgenbBillInvSeqNo(Double frrgenbBillInvSeqNo) {
        this.frrgenbBillInvSeqNo = frrgenbBillInvSeqNo;
    }

    public GenericBilling100PutRequest withFrrgenbBillInvSeqNo(Double frrgenbBillInvSeqNo) {
        this.frrgenbBillInvSeqNo = frrgenbBillInvSeqNo;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FRRGENB_GRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("grntCode")
    public String getGrntCode() {
        return grntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : FRRGENB_GRNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("grntCode")
    public void setGrntCode(String grntCode) {
        this.grntCode = grntCode;
    }

    public GenericBilling100PutRequest withGrntCode(String grntCode) {
        this.grntCode = grntCode;
        return this;
    }

    /**
     * Group Sequence Number
     * <p>
     * Lineage reference object : FRRGENB_GROUP_SEQ_NO, Lookup lineage reference object : frrbfrm
     * (Required)
     * 
     */
    @JsonProperty("criteria.groupSeqNo")
    public Double getCriteriaGroupSeqNo() {
        return criteriaGroupSeqNo;
    }

    /**
     * Group Sequence Number
     * <p>
     * Lineage reference object : FRRGENB_GROUP_SEQ_NO, Lookup lineage reference object : frrbfrm
     * (Required)
     * 
     */
    @JsonProperty("criteria.groupSeqNo")
    public void setCriteriaGroupSeqNo(Double criteriaGroupSeqNo) {
        this.criteriaGroupSeqNo = criteriaGroupSeqNo;
    }

    public GenericBilling100PutRequest withCriteriaGroupSeqNo(Double criteriaGroupSeqNo) {
        this.criteriaGroupSeqNo = criteriaGroupSeqNo;
        return this;
    }

    /**
     * Bill Amount
     * <p>
     * Lineage reference object : FRRGENB_BILL_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.billAmt")
    public Double getCriteriaBillAmt() {
        return criteriaBillAmt;
    }

    /**
     * Bill Amount
     * <p>
     * Lineage reference object : FRRGENB_BILL_AMT
     * (Required)
     * 
     */
    @JsonProperty("criteria.billAmt")
    public void setCriteriaBillAmt(Double criteriaBillAmt) {
        this.criteriaBillAmt = criteriaBillAmt;
    }

    public GenericBilling100PutRequest withCriteriaBillAmt(Double criteriaBillAmt) {
        this.criteriaBillAmt = criteriaBillAmt;
        return this;
    }

    /**
     * Final Indicator
     * <p>
     * Lineage reference object : FRRGENB_FINAL_IND
     * (Required)
     * 
     */
    @JsonProperty("finalInd")
    public String getFinalInd() {
        return finalInd;
    }

    /**
     * Final Indicator
     * <p>
     * Lineage reference object : FRRGENB_FINAL_IND
     * (Required)
     * 
     */
    @JsonProperty("finalInd")
    public void setFinalInd(String finalInd) {
        this.finalInd = finalInd;
    }

    public GenericBilling100PutRequest withFinalInd(String finalInd) {
        this.finalInd = finalInd;
        return this;
    }

    /**
     * Bill Amount
     * <p>
     * Lineage reference object : FRRGENB_BILL_AMT
     * (Required)
     * 
     */
    @JsonProperty("billAmt")
    public Double getBillAmt() {
        return billAmt;
    }

    /**
     * Bill Amount
     * <p>
     * Lineage reference object : FRRGENB_BILL_AMT
     * (Required)
     * 
     */
    @JsonProperty("billAmt")
    public void setBillAmt(Double billAmt) {
        this.billAmt = billAmt;
    }

    public GenericBilling100PutRequest withBillAmt(Double billAmt) {
        this.billAmt = billAmt;
        return this;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : displayBfrmCode
     * 
     */
    @JsonProperty("displayBfrmCode")
    public Object getDisplayBfrmCode() {
        return displayBfrmCode;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : displayBfrmCode
     * 
     */
    @JsonProperty("displayBfrmCode")
    public void setDisplayBfrmCode(Object displayBfrmCode) {
        this.displayBfrmCode = displayBfrmCode;
    }

    public GenericBilling100PutRequest withDisplayBfrmCode(Object displayBfrmCode) {
        this.displayBfrmCode = displayBfrmCode;
        return this;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodToDate")
    public Date getPeriodToDate() {
        return periodToDate;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodToDate")
    public void setPeriodToDate(Date periodToDate) {
        this.periodToDate = periodToDate;
    }

    public GenericBilling100PutRequest withPeriodToDate(Date periodToDate) {
        this.periodToDate = periodToDate;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrantCode
     * 
     */
    @JsonProperty("displayGrantCode")
    public Object getDisplayGrantCode() {
        return displayGrantCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrantCode
     * 
     */
    @JsonProperty("displayGrantCode")
    public void setDisplayGrantCode(Object displayGrantCode) {
        this.displayGrantCode = displayGrantCode;
    }

    public GenericBilling100PutRequest withDisplayGrantCode(Object displayGrantCode) {
        this.displayGrantCode = displayGrantCode;
        return this;
    }

    /**
     * Update Indicator
     * <p>
     * Lineage reference object : FRRGENB_UPDATE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.updateInd")
    public String getCriteriaUpdateInd() {
        return criteriaUpdateInd;
    }

    /**
     * Update Indicator
     * <p>
     * Lineage reference object : FRRGENB_UPDATE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.updateInd")
    public void setCriteriaUpdateInd(String criteriaUpdateInd) {
        this.criteriaUpdateInd = criteriaUpdateInd;
    }

    public GenericBilling100PutRequest withCriteriaUpdateInd(String criteriaUpdateInd) {
        this.criteriaUpdateInd = criteriaUpdateInd;
        return this;
    }

    /**
     * Final Indicator
     * <p>
     * Lineage reference object : FRRGENB_FINAL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.finalInd")
    public String getCriteriaFinalInd() {
        return criteriaFinalInd;
    }

    /**
     * Final Indicator
     * <p>
     * Lineage reference object : FRRGENB_FINAL_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.finalInd")
    public void setCriteriaFinalInd(String criteriaFinalInd) {
        this.criteriaFinalInd = criteriaFinalInd;
    }

    public GenericBilling100PutRequest withCriteriaFinalInd(String criteriaFinalInd) {
        this.criteriaFinalInd = criteriaFinalInd;
        return this;
    }

    /**
     * Period From
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.periodFromDate")
    public Date getCriteriaPeriodFromDate() {
        return criteriaPeriodFromDate;
    }

    /**
     * Period From
     * <p>
     * Lineage reference object : FRRGENB_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.periodFromDate")
    public void setCriteriaPeriodFromDate(Date criteriaPeriodFromDate) {
        this.criteriaPeriodFromDate = criteriaPeriodFromDate;
    }

    public GenericBilling100PutRequest withCriteriaPeriodFromDate(Date criteriaPeriodFromDate) {
        this.criteriaPeriodFromDate = criteriaPeriodFromDate;
        return this;
    }

    /**
     * Lineage reference object : displayBillAdj
     * 
     */
    @JsonProperty("displayBillAdj")
    public Object getDisplayBillAdj() {
        return displayBillAdj;
    }

    /**
     * Lineage reference object : displayBillAdj
     * 
     */
    @JsonProperty("displayBillAdj")
    public void setDisplayBillAdj(Object displayBillAdj) {
        this.displayBillAdj = displayBillAdj;
    }

    public GenericBilling100PutRequest withDisplayBillAdj(Object displayBillAdj) {
        this.displayBillAdj = displayBillAdj;
        return this;
    }

    /**
     * Date Submitted
     * <p>
     * Lineage reference object : FRRGENB_DATE_SUBMITTED
     * (Required)
     * 
     */
    @JsonProperty("dateSubmitted")
    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    /**
     * Date Submitted
     * <p>
     * Lineage reference object : FRRGENB_DATE_SUBMITTED
     * (Required)
     * 
     */
    @JsonProperty("dateSubmitted")
    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public GenericBilling100PutRequest withDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
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

    public GenericBilling100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenericBilling100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("groupSeqNo");
        sb.append('=');
        sb.append(((this.groupSeqNo == null)?"<null>":this.groupSeqNo));
        sb.append(',');
        sb.append("periodFromDate");
        sb.append('=');
        sb.append(((this.periodFromDate == null)?"<null>":this.periodFromDate));
        sb.append(',');
        sb.append("criteriaBillInvAdjNo");
        sb.append('=');
        sb.append(((this.criteriaBillInvAdjNo == null)?"<null>":this.criteriaBillInvAdjNo));
        sb.append(',');
        sb.append("criteriaPeriodToDate");
        sb.append('=');
        sb.append(((this.criteriaPeriodToDate == null)?"<null>":this.criteriaPeriodToDate));
        sb.append(',');
        sb.append("criteriaBudgetAmt");
        sb.append('=');
        sb.append(((this.criteriaBudgetAmt == null)?"<null>":this.criteriaBudgetAmt));
        sb.append(',');
        sb.append("updateInd");
        sb.append('=');
        sb.append(((this.updateInd == null)?"<null>":this.updateInd));
        sb.append(',');
        sb.append("displayBillInv");
        sb.append('=');
        sb.append(((this.displayBillInv == null)?"<null>":this.displayBillInv));
        sb.append(',');
        sb.append("criteriaWithholdingAmt");
        sb.append('=');
        sb.append(((this.criteriaWithholdingAmt == null)?"<null>":this.criteriaWithholdingAmt));
        sb.append(',');
        sb.append("criteriaBillInvSeqNo");
        sb.append('=');
        sb.append(((this.criteriaBillInvSeqNo == null)?"<null>":this.criteriaBillInvSeqNo));
        sb.append(',');
        sb.append("criteriaBfrmCode");
        sb.append('=');
        sb.append(((this.criteriaBfrmCode == null)?"<null>":this.criteriaBfrmCode));
        sb.append(',');
        sb.append("budgetAmt");
        sb.append('=');
        sb.append(((this.budgetAmt == null)?"<null>":this.budgetAmt));
        sb.append(',');
        sb.append("withholdingAmt");
        sb.append('=');
        sb.append(((this.withholdingAmt == null)?"<null>":this.withholdingAmt));
        sb.append(',');
        sb.append("billInvAdjNo");
        sb.append('=');
        sb.append(((this.billInvAdjNo == null)?"<null>":this.billInvAdjNo));
        sb.append(',');
        sb.append("criteriaGrntCode");
        sb.append('=');
        sb.append(((this.criteriaGrntCode == null)?"<null>":this.criteriaGrntCode));
        sb.append(',');
        sb.append("bfrmCode");
        sb.append('=');
        sb.append(((this.bfrmCode == null)?"<null>":this.bfrmCode));
        sb.append(',');
        sb.append("criteriaCompleteInd");
        sb.append('=');
        sb.append(((this.criteriaCompleteInd == null)?"<null>":this.criteriaCompleteInd));
        sb.append(',');
        sb.append("criteriaDateSubmitted");
        sb.append('=');
        sb.append(((this.criteriaDateSubmitted == null)?"<null>":this.criteriaDateSubmitted));
        sb.append(',');
        sb.append("frrgenbBillInvSeqNo");
        sb.append('=');
        sb.append(((this.frrgenbBillInvSeqNo == null)?"<null>":this.frrgenbBillInvSeqNo));
        sb.append(',');
        sb.append("grntCode");
        sb.append('=');
        sb.append(((this.grntCode == null)?"<null>":this.grntCode));
        sb.append(',');
        sb.append("criteriaGroupSeqNo");
        sb.append('=');
        sb.append(((this.criteriaGroupSeqNo == null)?"<null>":this.criteriaGroupSeqNo));
        sb.append(',');
        sb.append("criteriaBillAmt");
        sb.append('=');
        sb.append(((this.criteriaBillAmt == null)?"<null>":this.criteriaBillAmt));
        sb.append(',');
        sb.append("finalInd");
        sb.append('=');
        sb.append(((this.finalInd == null)?"<null>":this.finalInd));
        sb.append(',');
        sb.append("billAmt");
        sb.append('=');
        sb.append(((this.billAmt == null)?"<null>":this.billAmt));
        sb.append(',');
        sb.append("displayBfrmCode");
        sb.append('=');
        sb.append(((this.displayBfrmCode == null)?"<null>":this.displayBfrmCode));
        sb.append(',');
        sb.append("periodToDate");
        sb.append('=');
        sb.append(((this.periodToDate == null)?"<null>":this.periodToDate));
        sb.append(',');
        sb.append("displayGrantCode");
        sb.append('=');
        sb.append(((this.displayGrantCode == null)?"<null>":this.displayGrantCode));
        sb.append(',');
        sb.append("criteriaUpdateInd");
        sb.append('=');
        sb.append(((this.criteriaUpdateInd == null)?"<null>":this.criteriaUpdateInd));
        sb.append(',');
        sb.append("criteriaFinalInd");
        sb.append('=');
        sb.append(((this.criteriaFinalInd == null)?"<null>":this.criteriaFinalInd));
        sb.append(',');
        sb.append("criteriaPeriodFromDate");
        sb.append('=');
        sb.append(((this.criteriaPeriodFromDate == null)?"<null>":this.criteriaPeriodFromDate));
        sb.append(',');
        sb.append("displayBillAdj");
        sb.append('=');
        sb.append(((this.displayBillAdj == null)?"<null>":this.displayBillAdj));
        sb.append(',');
        sb.append("dateSubmitted");
        sb.append('=');
        sb.append(((this.dateSubmitted == null)?"<null>":this.dateSubmitted));
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
        result = ((result* 31)+((this.groupSeqNo == null)? 0 :this.groupSeqNo.hashCode()));
        result = ((result* 31)+((this.periodFromDate == null)? 0 :this.periodFromDate.hashCode()));
        result = ((result* 31)+((this.criteriaGroupSeqNo == null)? 0 :this.criteriaGroupSeqNo.hashCode()));
        result = ((result* 31)+((this.updateInd == null)? 0 :this.updateInd.hashCode()));
        result = ((result* 31)+((this.displayBillInv == null)? 0 :this.displayBillInv.hashCode()));
        result = ((result* 31)+((this.budgetAmt == null)? 0 :this.budgetAmt.hashCode()));
        result = ((result* 31)+((this.withholdingAmt == null)? 0 :this.withholdingAmt.hashCode()));
        result = ((result* 31)+((this.billInvAdjNo == null)? 0 :this.billInvAdjNo.hashCode()));
        result = ((result* 31)+((this.bfrmCode == null)? 0 :this.bfrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaGrntCode == null)? 0 :this.criteriaGrntCode.hashCode()));
        result = ((result* 31)+((this.criteriaCompleteInd == null)? 0 :this.criteriaCompleteInd.hashCode()));
        result = ((result* 31)+((this.criteriaBillInvSeqNo == null)? 0 :this.criteriaBillInvSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaUpdateInd == null)? 0 :this.criteriaUpdateInd.hashCode()));
        result = ((result* 31)+((this.criteriaBillInvAdjNo == null)? 0 :this.criteriaBillInvAdjNo.hashCode()));
        result = ((result* 31)+((this.criteriaPeriodToDate == null)? 0 :this.criteriaPeriodToDate.hashCode()));
        result = ((result* 31)+((this.criteriaDateSubmitted == null)? 0 :this.criteriaDateSubmitted.hashCode()));
        result = ((result* 31)+((this.criteriaFinalInd == null)? 0 :this.criteriaFinalInd.hashCode()));
        result = ((result* 31)+((this.frrgenbBillInvSeqNo == null)? 0 :this.frrgenbBillInvSeqNo.hashCode()));
        result = ((result* 31)+((this.grntCode == null)? 0 :this.grntCode.hashCode()));
        result = ((result* 31)+((this.criteriaBfrmCode == null)? 0 :this.criteriaBfrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaPeriodFromDate == null)? 0 :this.criteriaPeriodFromDate.hashCode()));
        result = ((result* 31)+((this.finalInd == null)? 0 :this.finalInd.hashCode()));
        result = ((result* 31)+((this.billAmt == null)? 0 :this.billAmt.hashCode()));
        result = ((result* 31)+((this.criteriaBudgetAmt == null)? 0 :this.criteriaBudgetAmt.hashCode()));
        result = ((result* 31)+((this.displayBfrmCode == null)? 0 :this.displayBfrmCode.hashCode()));
        result = ((result* 31)+((this.periodToDate == null)? 0 :this.periodToDate.hashCode()));
        result = ((result* 31)+((this.displayGrantCode == null)? 0 :this.displayGrantCode.hashCode()));
        result = ((result* 31)+((this.criteriaWithholdingAmt == null)? 0 :this.criteriaWithholdingAmt.hashCode()));
        result = ((result* 31)+((this.criteriaBillAmt == null)? 0 :this.criteriaBillAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayBillAdj == null)? 0 :this.displayBillAdj.hashCode()));
        result = ((result* 31)+((this.dateSubmitted == null)? 0 :this.dateSubmitted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenericBilling100PutRequest) == false) {
            return false;
        }
        GenericBilling100PutRequest rhs = ((GenericBilling100PutRequest) other);
        return (((((((((((((((((((((((((((((((((this.groupSeqNo == rhs.groupSeqNo)||((this.groupSeqNo!= null)&&this.groupSeqNo.equals(rhs.groupSeqNo)))&&((this.periodFromDate == rhs.periodFromDate)||((this.periodFromDate!= null)&&this.periodFromDate.equals(rhs.periodFromDate))))&&((this.criteriaGroupSeqNo == rhs.criteriaGroupSeqNo)||((this.criteriaGroupSeqNo!= null)&&this.criteriaGroupSeqNo.equals(rhs.criteriaGroupSeqNo))))&&((this.updateInd == rhs.updateInd)||((this.updateInd!= null)&&this.updateInd.equals(rhs.updateInd))))&&((this.displayBillInv == rhs.displayBillInv)||((this.displayBillInv!= null)&&this.displayBillInv.equals(rhs.displayBillInv))))&&((this.budgetAmt == rhs.budgetAmt)||((this.budgetAmt!= null)&&this.budgetAmt.equals(rhs.budgetAmt))))&&((this.withholdingAmt == rhs.withholdingAmt)||((this.withholdingAmt!= null)&&this.withholdingAmt.equals(rhs.withholdingAmt))))&&((this.billInvAdjNo == rhs.billInvAdjNo)||((this.billInvAdjNo!= null)&&this.billInvAdjNo.equals(rhs.billInvAdjNo))))&&((this.bfrmCode == rhs.bfrmCode)||((this.bfrmCode!= null)&&this.bfrmCode.equals(rhs.bfrmCode))))&&((this.criteriaGrntCode == rhs.criteriaGrntCode)||((this.criteriaGrntCode!= null)&&this.criteriaGrntCode.equals(rhs.criteriaGrntCode))))&&((this.criteriaCompleteInd == rhs.criteriaCompleteInd)||((this.criteriaCompleteInd!= null)&&this.criteriaCompleteInd.equals(rhs.criteriaCompleteInd))))&&((this.criteriaBillInvSeqNo == rhs.criteriaBillInvSeqNo)||((this.criteriaBillInvSeqNo!= null)&&this.criteriaBillInvSeqNo.equals(rhs.criteriaBillInvSeqNo))))&&((this.criteriaUpdateInd == rhs.criteriaUpdateInd)||((this.criteriaUpdateInd!= null)&&this.criteriaUpdateInd.equals(rhs.criteriaUpdateInd))))&&((this.criteriaBillInvAdjNo == rhs.criteriaBillInvAdjNo)||((this.criteriaBillInvAdjNo!= null)&&this.criteriaBillInvAdjNo.equals(rhs.criteriaBillInvAdjNo))))&&((this.criteriaPeriodToDate == rhs.criteriaPeriodToDate)||((this.criteriaPeriodToDate!= null)&&this.criteriaPeriodToDate.equals(rhs.criteriaPeriodToDate))))&&((this.criteriaDateSubmitted == rhs.criteriaDateSubmitted)||((this.criteriaDateSubmitted!= null)&&this.criteriaDateSubmitted.equals(rhs.criteriaDateSubmitted))))&&((this.criteriaFinalInd == rhs.criteriaFinalInd)||((this.criteriaFinalInd!= null)&&this.criteriaFinalInd.equals(rhs.criteriaFinalInd))))&&((this.frrgenbBillInvSeqNo == rhs.frrgenbBillInvSeqNo)||((this.frrgenbBillInvSeqNo!= null)&&this.frrgenbBillInvSeqNo.equals(rhs.frrgenbBillInvSeqNo))))&&((this.grntCode == rhs.grntCode)||((this.grntCode!= null)&&this.grntCode.equals(rhs.grntCode))))&&((this.criteriaBfrmCode == rhs.criteriaBfrmCode)||((this.criteriaBfrmCode!= null)&&this.criteriaBfrmCode.equals(rhs.criteriaBfrmCode))))&&((this.criteriaPeriodFromDate == rhs.criteriaPeriodFromDate)||((this.criteriaPeriodFromDate!= null)&&this.criteriaPeriodFromDate.equals(rhs.criteriaPeriodFromDate))))&&((this.finalInd == rhs.finalInd)||((this.finalInd!= null)&&this.finalInd.equals(rhs.finalInd))))&&((this.billAmt == rhs.billAmt)||((this.billAmt!= null)&&this.billAmt.equals(rhs.billAmt))))&&((this.criteriaBudgetAmt == rhs.criteriaBudgetAmt)||((this.criteriaBudgetAmt!= null)&&this.criteriaBudgetAmt.equals(rhs.criteriaBudgetAmt))))&&((this.displayBfrmCode == rhs.displayBfrmCode)||((this.displayBfrmCode!= null)&&this.displayBfrmCode.equals(rhs.displayBfrmCode))))&&((this.periodToDate == rhs.periodToDate)||((this.periodToDate!= null)&&this.periodToDate.equals(rhs.periodToDate))))&&((this.displayGrantCode == rhs.displayGrantCode)||((this.displayGrantCode!= null)&&this.displayGrantCode.equals(rhs.displayGrantCode))))&&((this.criteriaWithholdingAmt == rhs.criteriaWithholdingAmt)||((this.criteriaWithholdingAmt!= null)&&this.criteriaWithholdingAmt.equals(rhs.criteriaWithholdingAmt))))&&((this.criteriaBillAmt == rhs.criteriaBillAmt)||((this.criteriaBillAmt!= null)&&this.criteriaBillAmt.equals(rhs.criteriaBillAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayBillAdj == rhs.displayBillAdj)||((this.displayBillAdj!= null)&&this.displayBillAdj.equals(rhs.displayBillAdj))))&&((this.dateSubmitted == rhs.dateSubmitted)||((this.dateSubmitted!= null)&&this.dateSubmitted.equals(rhs.dateSubmitted))));
    }

}
