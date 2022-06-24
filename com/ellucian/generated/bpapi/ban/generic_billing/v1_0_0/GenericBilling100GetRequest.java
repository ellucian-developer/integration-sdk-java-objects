
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
    "updateInd",
    "displayBillInv",
    "grntCode",
    "finalInd",
    "budgetAmt",
    "billAmt",
    "withholdingAmt",
    "displayBfrmCode",
    "periodToDate",
    "displayGrantCode",
    "billInvAdjNo",
    "completeInd",
    "bfrmCode",
    "displayBillAdj",
    "dateSubmitted",
    "billInvSeqNo"
})
@Generated("jsonschema2pojo")
public class GenericBilling100GetRequest {

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
    private Double displayBillInv;
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
     * Bill Format
     * <p>
     * Lineage reference object : displayBfrmCode
     * 
     */
    @JsonProperty("displayBfrmCode")
    @JsonPropertyDescription("Lineage reference object : displayBfrmCode")
    private String displayBfrmCode;
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
    private String displayGrantCode;
    /**
     * Lineage reference object : FRRGENB_BILL_INV_ADJ_NO
     * (Required)
     * 
     */
    @JsonProperty("billInvAdjNo")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BILL_INV_ADJ_NO")
    private Double billInvAdjNo;
    /**
     * Complete Indicator
     * <p>
     * Lineage reference object : FRRGENB_COMPLETE_IND
     * (Required)
     * 
     */
    @JsonProperty("completeInd")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_COMPLETE_IND")
    private String completeInd;
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
     * Lineage reference object : displayBillAdj
     * 
     */
    @JsonProperty("displayBillAdj")
    @JsonPropertyDescription("Lineage reference object : displayBillAdj")
    private Double displayBillAdj;
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
    /**
     * Bill Invoice Number
     * <p>
     * Lineage reference object : FRRGENB_BILL_INV_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("billInvSeqNo")
    @JsonPropertyDescription("Lineage reference object : FRRGENB_BILL_INV_SEQ_NO")
    private Double billInvSeqNo;
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

    public GenericBilling100GetRequest withGroupSeqNo(Double groupSeqNo) {
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

    public GenericBilling100GetRequest withPeriodFromDate(Date periodFromDate) {
        this.periodFromDate = periodFromDate;
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

    public GenericBilling100GetRequest withUpdateInd(String updateInd) {
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
    public Double getDisplayBillInv() {
        return displayBillInv;
    }

    /**
     * Bill Invoice
     * <p>
     * Lineage reference object : displayBillInv
     * 
     */
    @JsonProperty("displayBillInv")
    public void setDisplayBillInv(Double displayBillInv) {
        this.displayBillInv = displayBillInv;
    }

    public GenericBilling100GetRequest withDisplayBillInv(Double displayBillInv) {
        this.displayBillInv = displayBillInv;
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

    public GenericBilling100GetRequest withGrntCode(String grntCode) {
        this.grntCode = grntCode;
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

    public GenericBilling100GetRequest withFinalInd(String finalInd) {
        this.finalInd = finalInd;
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

    public GenericBilling100GetRequest withBudgetAmt(Double budgetAmt) {
        this.budgetAmt = budgetAmt;
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

    public GenericBilling100GetRequest withBillAmt(Double billAmt) {
        this.billAmt = billAmt;
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

    public GenericBilling100GetRequest withWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
        return this;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : displayBfrmCode
     * 
     */
    @JsonProperty("displayBfrmCode")
    public String getDisplayBfrmCode() {
        return displayBfrmCode;
    }

    /**
     * Bill Format
     * <p>
     * Lineage reference object : displayBfrmCode
     * 
     */
    @JsonProperty("displayBfrmCode")
    public void setDisplayBfrmCode(String displayBfrmCode) {
        this.displayBfrmCode = displayBfrmCode;
    }

    public GenericBilling100GetRequest withDisplayBfrmCode(String displayBfrmCode) {
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

    public GenericBilling100GetRequest withPeriodToDate(Date periodToDate) {
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
    public String getDisplayGrantCode() {
        return displayGrantCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrantCode
     * 
     */
    @JsonProperty("displayGrantCode")
    public void setDisplayGrantCode(String displayGrantCode) {
        this.displayGrantCode = displayGrantCode;
    }

    public GenericBilling100GetRequest withDisplayGrantCode(String displayGrantCode) {
        this.displayGrantCode = displayGrantCode;
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

    public GenericBilling100GetRequest withBillInvAdjNo(Double billInvAdjNo) {
        this.billInvAdjNo = billInvAdjNo;
        return this;
    }

    /**
     * Complete Indicator
     * <p>
     * Lineage reference object : FRRGENB_COMPLETE_IND
     * (Required)
     * 
     */
    @JsonProperty("completeInd")
    public String getCompleteInd() {
        return completeInd;
    }

    /**
     * Complete Indicator
     * <p>
     * Lineage reference object : FRRGENB_COMPLETE_IND
     * (Required)
     * 
     */
    @JsonProperty("completeInd")
    public void setCompleteInd(String completeInd) {
        this.completeInd = completeInd;
    }

    public GenericBilling100GetRequest withCompleteInd(String completeInd) {
        this.completeInd = completeInd;
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

    public GenericBilling100GetRequest withBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
        return this;
    }

    /**
     * Lineage reference object : displayBillAdj
     * 
     */
    @JsonProperty("displayBillAdj")
    public Double getDisplayBillAdj() {
        return displayBillAdj;
    }

    /**
     * Lineage reference object : displayBillAdj
     * 
     */
    @JsonProperty("displayBillAdj")
    public void setDisplayBillAdj(Double displayBillAdj) {
        this.displayBillAdj = displayBillAdj;
    }

    public GenericBilling100GetRequest withDisplayBillAdj(Double displayBillAdj) {
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

    public GenericBilling100GetRequest withDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
        return this;
    }

    /**
     * Bill Invoice Number
     * <p>
     * Lineage reference object : FRRGENB_BILL_INV_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("billInvSeqNo")
    public Double getBillInvSeqNo() {
        return billInvSeqNo;
    }

    /**
     * Bill Invoice Number
     * <p>
     * Lineage reference object : FRRGENB_BILL_INV_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("billInvSeqNo")
    public void setBillInvSeqNo(Double billInvSeqNo) {
        this.billInvSeqNo = billInvSeqNo;
    }

    public GenericBilling100GetRequest withBillInvSeqNo(Double billInvSeqNo) {
        this.billInvSeqNo = billInvSeqNo;
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

    public GenericBilling100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenericBilling100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("groupSeqNo");
        sb.append('=');
        sb.append(((this.groupSeqNo == null)?"<null>":this.groupSeqNo));
        sb.append(',');
        sb.append("periodFromDate");
        sb.append('=');
        sb.append(((this.periodFromDate == null)?"<null>":this.periodFromDate));
        sb.append(',');
        sb.append("updateInd");
        sb.append('=');
        sb.append(((this.updateInd == null)?"<null>":this.updateInd));
        sb.append(',');
        sb.append("displayBillInv");
        sb.append('=');
        sb.append(((this.displayBillInv == null)?"<null>":this.displayBillInv));
        sb.append(',');
        sb.append("grntCode");
        sb.append('=');
        sb.append(((this.grntCode == null)?"<null>":this.grntCode));
        sb.append(',');
        sb.append("finalInd");
        sb.append('=');
        sb.append(((this.finalInd == null)?"<null>":this.finalInd));
        sb.append(',');
        sb.append("budgetAmt");
        sb.append('=');
        sb.append(((this.budgetAmt == null)?"<null>":this.budgetAmt));
        sb.append(',');
        sb.append("billAmt");
        sb.append('=');
        sb.append(((this.billAmt == null)?"<null>":this.billAmt));
        sb.append(',');
        sb.append("withholdingAmt");
        sb.append('=');
        sb.append(((this.withholdingAmt == null)?"<null>":this.withholdingAmt));
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
        sb.append("billInvAdjNo");
        sb.append('=');
        sb.append(((this.billInvAdjNo == null)?"<null>":this.billInvAdjNo));
        sb.append(',');
        sb.append("completeInd");
        sb.append('=');
        sb.append(((this.completeInd == null)?"<null>":this.completeInd));
        sb.append(',');
        sb.append("bfrmCode");
        sb.append('=');
        sb.append(((this.bfrmCode == null)?"<null>":this.bfrmCode));
        sb.append(',');
        sb.append("displayBillAdj");
        sb.append('=');
        sb.append(((this.displayBillAdj == null)?"<null>":this.displayBillAdj));
        sb.append(',');
        sb.append("dateSubmitted");
        sb.append('=');
        sb.append(((this.dateSubmitted == null)?"<null>":this.dateSubmitted));
        sb.append(',');
        sb.append("billInvSeqNo");
        sb.append('=');
        sb.append(((this.billInvSeqNo == null)?"<null>":this.billInvSeqNo));
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
        result = ((result* 31)+((this.updateInd == null)? 0 :this.updateInd.hashCode()));
        result = ((result* 31)+((this.displayBillInv == null)? 0 :this.displayBillInv.hashCode()));
        result = ((result* 31)+((this.grntCode == null)? 0 :this.grntCode.hashCode()));
        result = ((result* 31)+((this.finalInd == null)? 0 :this.finalInd.hashCode()));
        result = ((result* 31)+((this.budgetAmt == null)? 0 :this.budgetAmt.hashCode()));
        result = ((result* 31)+((this.billAmt == null)? 0 :this.billAmt.hashCode()));
        result = ((result* 31)+((this.withholdingAmt == null)? 0 :this.withholdingAmt.hashCode()));
        result = ((result* 31)+((this.displayBfrmCode == null)? 0 :this.displayBfrmCode.hashCode()));
        result = ((result* 31)+((this.periodToDate == null)? 0 :this.periodToDate.hashCode()));
        result = ((result* 31)+((this.displayGrantCode == null)? 0 :this.displayGrantCode.hashCode()));
        result = ((result* 31)+((this.billInvAdjNo == null)? 0 :this.billInvAdjNo.hashCode()));
        result = ((result* 31)+((this.completeInd == null)? 0 :this.completeInd.hashCode()));
        result = ((result* 31)+((this.bfrmCode == null)? 0 :this.bfrmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayBillAdj == null)? 0 :this.displayBillAdj.hashCode()));
        result = ((result* 31)+((this.dateSubmitted == null)? 0 :this.dateSubmitted.hashCode()));
        result = ((result* 31)+((this.billInvSeqNo == null)? 0 :this.billInvSeqNo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenericBilling100GetRequest) == false) {
            return false;
        }
        GenericBilling100GetRequest rhs = ((GenericBilling100GetRequest) other);
        return ((((((((((((((((((((this.groupSeqNo == rhs.groupSeqNo)||((this.groupSeqNo!= null)&&this.groupSeqNo.equals(rhs.groupSeqNo)))&&((this.periodFromDate == rhs.periodFromDate)||((this.periodFromDate!= null)&&this.periodFromDate.equals(rhs.periodFromDate))))&&((this.updateInd == rhs.updateInd)||((this.updateInd!= null)&&this.updateInd.equals(rhs.updateInd))))&&((this.displayBillInv == rhs.displayBillInv)||((this.displayBillInv!= null)&&this.displayBillInv.equals(rhs.displayBillInv))))&&((this.grntCode == rhs.grntCode)||((this.grntCode!= null)&&this.grntCode.equals(rhs.grntCode))))&&((this.finalInd == rhs.finalInd)||((this.finalInd!= null)&&this.finalInd.equals(rhs.finalInd))))&&((this.budgetAmt == rhs.budgetAmt)||((this.budgetAmt!= null)&&this.budgetAmt.equals(rhs.budgetAmt))))&&((this.billAmt == rhs.billAmt)||((this.billAmt!= null)&&this.billAmt.equals(rhs.billAmt))))&&((this.withholdingAmt == rhs.withholdingAmt)||((this.withholdingAmt!= null)&&this.withholdingAmt.equals(rhs.withholdingAmt))))&&((this.displayBfrmCode == rhs.displayBfrmCode)||((this.displayBfrmCode!= null)&&this.displayBfrmCode.equals(rhs.displayBfrmCode))))&&((this.periodToDate == rhs.periodToDate)||((this.periodToDate!= null)&&this.periodToDate.equals(rhs.periodToDate))))&&((this.displayGrantCode == rhs.displayGrantCode)||((this.displayGrantCode!= null)&&this.displayGrantCode.equals(rhs.displayGrantCode))))&&((this.billInvAdjNo == rhs.billInvAdjNo)||((this.billInvAdjNo!= null)&&this.billInvAdjNo.equals(rhs.billInvAdjNo))))&&((this.completeInd == rhs.completeInd)||((this.completeInd!= null)&&this.completeInd.equals(rhs.completeInd))))&&((this.bfrmCode == rhs.bfrmCode)||((this.bfrmCode!= null)&&this.bfrmCode.equals(rhs.bfrmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayBillAdj == rhs.displayBillAdj)||((this.displayBillAdj!= null)&&this.displayBillAdj.equals(rhs.displayBillAdj))))&&((this.dateSubmitted == rhs.dateSubmitted)||((this.dateSubmitted!= null)&&this.dateSubmitted.equals(rhs.dateSubmitted))))&&((this.billInvSeqNo == rhs.billInvSeqNo)||((this.billInvSeqNo!= null)&&this.billInvSeqNo.equals(rhs.billInvSeqNo))));
    }

}
