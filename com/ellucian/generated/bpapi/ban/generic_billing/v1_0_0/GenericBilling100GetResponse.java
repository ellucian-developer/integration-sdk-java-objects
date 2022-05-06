
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
    "displayPayeeName",
    "groupSeqNo",
    "periodFromDate",
    "updateInd",
    "displayBfrmDesc",
    "displayGroupDesc",
    "budgetAmt",
    "withholdingAmt",
    "displayEmployerId",
    "billInvAdjNo",
    "completeInd",
    "bfrmCode",
    "displayPmsDesc",
    "displaySponsor",
    "billInvSeqNo",
    "displayPayeeZip",
    "grntCode",
    "finalInd",
    "displaySponsorName",
    "billAmt",
    "periodToDate",
    "displayPayeeState",
    "displayPmsCode",
    "displayPayeeAddress23",
    "displayPayeeCity",
    "displayPayeeAddress1",
    "dateSubmitted"
})
@Generated("jsonschema2pojo")
public class GenericBilling100GetResponse {

    /**
     * Payee's Name
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeName")
    private String displayPayeeName;
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
    @JsonProperty("displayBfrmDesc")
    private String displayBfrmDesc;
    @JsonProperty("displayGroupDesc")
    private String displayGroupDesc;
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
     * Employer ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayEmployerId")
    private String displayEmployerId;
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
    @JsonProperty("displayPmsDesc")
    private String displayPmsDesc;
    /**
     * Sponsor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsor")
    private String displaySponsor;
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
    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeZip")
    private String displayPayeeZip;
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
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsorName")
    private String displaySponsorName;
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
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeState")
    private String displayPayeeState;
    /**
     * PMS Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPmsCode")
    private String displayPmsCode;
    @JsonProperty("displayPayeeAddress23")
    private String displayPayeeAddress23;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeCity")
    private String displayPayeeCity;
    /**
     * Address
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeAddress1")
    private String displayPayeeAddress1;
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
     * Payee's Name
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeName")
    public String getDisplayPayeeName() {
        return displayPayeeName;
    }

    /**
     * Payee's Name
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeName")
    public void setDisplayPayeeName(String displayPayeeName) {
        this.displayPayeeName = displayPayeeName;
    }

    public GenericBilling100GetResponse withDisplayPayeeName(String displayPayeeName) {
        this.displayPayeeName = displayPayeeName;
        return this;
    }

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

    public GenericBilling100GetResponse withGroupSeqNo(Double groupSeqNo) {
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

    public GenericBilling100GetResponse withPeriodFromDate(Date periodFromDate) {
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

    public GenericBilling100GetResponse withUpdateInd(String updateInd) {
        this.updateInd = updateInd;
        return this;
    }

    @JsonProperty("displayBfrmDesc")
    public String getDisplayBfrmDesc() {
        return displayBfrmDesc;
    }

    @JsonProperty("displayBfrmDesc")
    public void setDisplayBfrmDesc(String displayBfrmDesc) {
        this.displayBfrmDesc = displayBfrmDesc;
    }

    public GenericBilling100GetResponse withDisplayBfrmDesc(String displayBfrmDesc) {
        this.displayBfrmDesc = displayBfrmDesc;
        return this;
    }

    @JsonProperty("displayGroupDesc")
    public String getDisplayGroupDesc() {
        return displayGroupDesc;
    }

    @JsonProperty("displayGroupDesc")
    public void setDisplayGroupDesc(String displayGroupDesc) {
        this.displayGroupDesc = displayGroupDesc;
    }

    public GenericBilling100GetResponse withDisplayGroupDesc(String displayGroupDesc) {
        this.displayGroupDesc = displayGroupDesc;
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

    public GenericBilling100GetResponse withBudgetAmt(Double budgetAmt) {
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

    public GenericBilling100GetResponse withWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
        return this;
    }

    /**
     * Employer ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayEmployerId")
    public String getDisplayEmployerId() {
        return displayEmployerId;
    }

    /**
     * Employer ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayEmployerId")
    public void setDisplayEmployerId(String displayEmployerId) {
        this.displayEmployerId = displayEmployerId;
    }

    public GenericBilling100GetResponse withDisplayEmployerId(String displayEmployerId) {
        this.displayEmployerId = displayEmployerId;
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

    public GenericBilling100GetResponse withBillInvAdjNo(Double billInvAdjNo) {
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

    public GenericBilling100GetResponse withCompleteInd(String completeInd) {
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

    public GenericBilling100GetResponse withBfrmCode(String bfrmCode) {
        this.bfrmCode = bfrmCode;
        return this;
    }

    @JsonProperty("displayPmsDesc")
    public String getDisplayPmsDesc() {
        return displayPmsDesc;
    }

    @JsonProperty("displayPmsDesc")
    public void setDisplayPmsDesc(String displayPmsDesc) {
        this.displayPmsDesc = displayPmsDesc;
    }

    public GenericBilling100GetResponse withDisplayPmsDesc(String displayPmsDesc) {
        this.displayPmsDesc = displayPmsDesc;
        return this;
    }

    /**
     * Sponsor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsor")
    public String getDisplaySponsor() {
        return displaySponsor;
    }

    /**
     * Sponsor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsor")
    public void setDisplaySponsor(String displaySponsor) {
        this.displaySponsor = displaySponsor;
    }

    public GenericBilling100GetResponse withDisplaySponsor(String displaySponsor) {
        this.displaySponsor = displaySponsor;
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

    public GenericBilling100GetResponse withBillInvSeqNo(Double billInvSeqNo) {
        this.billInvSeqNo = billInvSeqNo;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeZip")
    public String getDisplayPayeeZip() {
        return displayPayeeZip;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeZip")
    public void setDisplayPayeeZip(String displayPayeeZip) {
        this.displayPayeeZip = displayPayeeZip;
    }

    public GenericBilling100GetResponse withDisplayPayeeZip(String displayPayeeZip) {
        this.displayPayeeZip = displayPayeeZip;
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

    public GenericBilling100GetResponse withGrntCode(String grntCode) {
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

    public GenericBilling100GetResponse withFinalInd(String finalInd) {
        this.finalInd = finalInd;
        return this;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsorName")
    public String getDisplaySponsorName() {
        return displaySponsorName;
    }

    /**
     * Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsorName")
    public void setDisplaySponsorName(String displaySponsorName) {
        this.displaySponsorName = displaySponsorName;
    }

    public GenericBilling100GetResponse withDisplaySponsorName(String displaySponsorName) {
        this.displaySponsorName = displaySponsorName;
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

    public GenericBilling100GetResponse withBillAmt(Double billAmt) {
        this.billAmt = billAmt;
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

    public GenericBilling100GetResponse withPeriodToDate(Date periodToDate) {
        this.periodToDate = periodToDate;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeState")
    public String getDisplayPayeeState() {
        return displayPayeeState;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeState")
    public void setDisplayPayeeState(String displayPayeeState) {
        this.displayPayeeState = displayPayeeState;
    }

    public GenericBilling100GetResponse withDisplayPayeeState(String displayPayeeState) {
        this.displayPayeeState = displayPayeeState;
        return this;
    }

    /**
     * PMS Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPmsCode")
    public String getDisplayPmsCode() {
        return displayPmsCode;
    }

    /**
     * PMS Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPmsCode")
    public void setDisplayPmsCode(String displayPmsCode) {
        this.displayPmsCode = displayPmsCode;
    }

    public GenericBilling100GetResponse withDisplayPmsCode(String displayPmsCode) {
        this.displayPmsCode = displayPmsCode;
        return this;
    }

    @JsonProperty("displayPayeeAddress23")
    public String getDisplayPayeeAddress23() {
        return displayPayeeAddress23;
    }

    @JsonProperty("displayPayeeAddress23")
    public void setDisplayPayeeAddress23(String displayPayeeAddress23) {
        this.displayPayeeAddress23 = displayPayeeAddress23;
    }

    public GenericBilling100GetResponse withDisplayPayeeAddress23(String displayPayeeAddress23) {
        this.displayPayeeAddress23 = displayPayeeAddress23;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeCity")
    public String getDisplayPayeeCity() {
        return displayPayeeCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeCity")
    public void setDisplayPayeeCity(String displayPayeeCity) {
        this.displayPayeeCity = displayPayeeCity;
    }

    public GenericBilling100GetResponse withDisplayPayeeCity(String displayPayeeCity) {
        this.displayPayeeCity = displayPayeeCity;
        return this;
    }

    /**
     * Address
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeAddress1")
    public String getDisplayPayeeAddress1() {
        return displayPayeeAddress1;
    }

    /**
     * Address
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeAddress1")
    public void setDisplayPayeeAddress1(String displayPayeeAddress1) {
        this.displayPayeeAddress1 = displayPayeeAddress1;
    }

    public GenericBilling100GetResponse withDisplayPayeeAddress1(String displayPayeeAddress1) {
        this.displayPayeeAddress1 = displayPayeeAddress1;
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

    public GenericBilling100GetResponse withDateSubmitted(Date dateSubmitted) {
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

    public GenericBilling100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenericBilling100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayPayeeName");
        sb.append('=');
        sb.append(((this.displayPayeeName == null)?"<null>":this.displayPayeeName));
        sb.append(',');
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
        sb.append("displayBfrmDesc");
        sb.append('=');
        sb.append(((this.displayBfrmDesc == null)?"<null>":this.displayBfrmDesc));
        sb.append(',');
        sb.append("displayGroupDesc");
        sb.append('=');
        sb.append(((this.displayGroupDesc == null)?"<null>":this.displayGroupDesc));
        sb.append(',');
        sb.append("budgetAmt");
        sb.append('=');
        sb.append(((this.budgetAmt == null)?"<null>":this.budgetAmt));
        sb.append(',');
        sb.append("withholdingAmt");
        sb.append('=');
        sb.append(((this.withholdingAmt == null)?"<null>":this.withholdingAmt));
        sb.append(',');
        sb.append("displayEmployerId");
        sb.append('=');
        sb.append(((this.displayEmployerId == null)?"<null>":this.displayEmployerId));
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
        sb.append("displayPmsDesc");
        sb.append('=');
        sb.append(((this.displayPmsDesc == null)?"<null>":this.displayPmsDesc));
        sb.append(',');
        sb.append("displaySponsor");
        sb.append('=');
        sb.append(((this.displaySponsor == null)?"<null>":this.displaySponsor));
        sb.append(',');
        sb.append("billInvSeqNo");
        sb.append('=');
        sb.append(((this.billInvSeqNo == null)?"<null>":this.billInvSeqNo));
        sb.append(',');
        sb.append("displayPayeeZip");
        sb.append('=');
        sb.append(((this.displayPayeeZip == null)?"<null>":this.displayPayeeZip));
        sb.append(',');
        sb.append("grntCode");
        sb.append('=');
        sb.append(((this.grntCode == null)?"<null>":this.grntCode));
        sb.append(',');
        sb.append("finalInd");
        sb.append('=');
        sb.append(((this.finalInd == null)?"<null>":this.finalInd));
        sb.append(',');
        sb.append("displaySponsorName");
        sb.append('=');
        sb.append(((this.displaySponsorName == null)?"<null>":this.displaySponsorName));
        sb.append(',');
        sb.append("billAmt");
        sb.append('=');
        sb.append(((this.billAmt == null)?"<null>":this.billAmt));
        sb.append(',');
        sb.append("periodToDate");
        sb.append('=');
        sb.append(((this.periodToDate == null)?"<null>":this.periodToDate));
        sb.append(',');
        sb.append("displayPayeeState");
        sb.append('=');
        sb.append(((this.displayPayeeState == null)?"<null>":this.displayPayeeState));
        sb.append(',');
        sb.append("displayPmsCode");
        sb.append('=');
        sb.append(((this.displayPmsCode == null)?"<null>":this.displayPmsCode));
        sb.append(',');
        sb.append("displayPayeeAddress23");
        sb.append('=');
        sb.append(((this.displayPayeeAddress23 == null)?"<null>":this.displayPayeeAddress23));
        sb.append(',');
        sb.append("displayPayeeCity");
        sb.append('=');
        sb.append(((this.displayPayeeCity == null)?"<null>":this.displayPayeeCity));
        sb.append(',');
        sb.append("displayPayeeAddress1");
        sb.append('=');
        sb.append(((this.displayPayeeAddress1 == null)?"<null>":this.displayPayeeAddress1));
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
        result = ((result* 31)+((this.displayPayeeName == null)? 0 :this.displayPayeeName.hashCode()));
        result = ((result* 31)+((this.groupSeqNo == null)? 0 :this.groupSeqNo.hashCode()));
        result = ((result* 31)+((this.periodFromDate == null)? 0 :this.periodFromDate.hashCode()));
        result = ((result* 31)+((this.updateInd == null)? 0 :this.updateInd.hashCode()));
        result = ((result* 31)+((this.displayBfrmDesc == null)? 0 :this.displayBfrmDesc.hashCode()));
        result = ((result* 31)+((this.displayGroupDesc == null)? 0 :this.displayGroupDesc.hashCode()));
        result = ((result* 31)+((this.budgetAmt == null)? 0 :this.budgetAmt.hashCode()));
        result = ((result* 31)+((this.withholdingAmt == null)? 0 :this.withholdingAmt.hashCode()));
        result = ((result* 31)+((this.displayEmployerId == null)? 0 :this.displayEmployerId.hashCode()));
        result = ((result* 31)+((this.billInvAdjNo == null)? 0 :this.billInvAdjNo.hashCode()));
        result = ((result* 31)+((this.completeInd == null)? 0 :this.completeInd.hashCode()));
        result = ((result* 31)+((this.bfrmCode == null)? 0 :this.bfrmCode.hashCode()));
        result = ((result* 31)+((this.displayPmsDesc == null)? 0 :this.displayPmsDesc.hashCode()));
        result = ((result* 31)+((this.displaySponsor == null)? 0 :this.displaySponsor.hashCode()));
        result = ((result* 31)+((this.billInvSeqNo == null)? 0 :this.billInvSeqNo.hashCode()));
        result = ((result* 31)+((this.displayPayeeZip == null)? 0 :this.displayPayeeZip.hashCode()));
        result = ((result* 31)+((this.grntCode == null)? 0 :this.grntCode.hashCode()));
        result = ((result* 31)+((this.finalInd == null)? 0 :this.finalInd.hashCode()));
        result = ((result* 31)+((this.displaySponsorName == null)? 0 :this.displaySponsorName.hashCode()));
        result = ((result* 31)+((this.billAmt == null)? 0 :this.billAmt.hashCode()));
        result = ((result* 31)+((this.periodToDate == null)? 0 :this.periodToDate.hashCode()));
        result = ((result* 31)+((this.displayPayeeState == null)? 0 :this.displayPayeeState.hashCode()));
        result = ((result* 31)+((this.displayPmsCode == null)? 0 :this.displayPmsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayPayeeAddress23 == null)? 0 :this.displayPayeeAddress23 .hashCode()));
        result = ((result* 31)+((this.displayPayeeCity == null)? 0 :this.displayPayeeCity.hashCode()));
        result = ((result* 31)+((this.displayPayeeAddress1 == null)? 0 :this.displayPayeeAddress1 .hashCode()));
        result = ((result* 31)+((this.dateSubmitted == null)? 0 :this.dateSubmitted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenericBilling100GetResponse) == false) {
            return false;
        }
        GenericBilling100GetResponse rhs = ((GenericBilling100GetResponse) other);
        return (((((((((((((((((((((((((((((this.displayPayeeName == rhs.displayPayeeName)||((this.displayPayeeName!= null)&&this.displayPayeeName.equals(rhs.displayPayeeName)))&&((this.groupSeqNo == rhs.groupSeqNo)||((this.groupSeqNo!= null)&&this.groupSeqNo.equals(rhs.groupSeqNo))))&&((this.periodFromDate == rhs.periodFromDate)||((this.periodFromDate!= null)&&this.periodFromDate.equals(rhs.periodFromDate))))&&((this.updateInd == rhs.updateInd)||((this.updateInd!= null)&&this.updateInd.equals(rhs.updateInd))))&&((this.displayBfrmDesc == rhs.displayBfrmDesc)||((this.displayBfrmDesc!= null)&&this.displayBfrmDesc.equals(rhs.displayBfrmDesc))))&&((this.displayGroupDesc == rhs.displayGroupDesc)||((this.displayGroupDesc!= null)&&this.displayGroupDesc.equals(rhs.displayGroupDesc))))&&((this.budgetAmt == rhs.budgetAmt)||((this.budgetAmt!= null)&&this.budgetAmt.equals(rhs.budgetAmt))))&&((this.withholdingAmt == rhs.withholdingAmt)||((this.withholdingAmt!= null)&&this.withholdingAmt.equals(rhs.withholdingAmt))))&&((this.displayEmployerId == rhs.displayEmployerId)||((this.displayEmployerId!= null)&&this.displayEmployerId.equals(rhs.displayEmployerId))))&&((this.billInvAdjNo == rhs.billInvAdjNo)||((this.billInvAdjNo!= null)&&this.billInvAdjNo.equals(rhs.billInvAdjNo))))&&((this.completeInd == rhs.completeInd)||((this.completeInd!= null)&&this.completeInd.equals(rhs.completeInd))))&&((this.bfrmCode == rhs.bfrmCode)||((this.bfrmCode!= null)&&this.bfrmCode.equals(rhs.bfrmCode))))&&((this.displayPmsDesc == rhs.displayPmsDesc)||((this.displayPmsDesc!= null)&&this.displayPmsDesc.equals(rhs.displayPmsDesc))))&&((this.displaySponsor == rhs.displaySponsor)||((this.displaySponsor!= null)&&this.displaySponsor.equals(rhs.displaySponsor))))&&((this.billInvSeqNo == rhs.billInvSeqNo)||((this.billInvSeqNo!= null)&&this.billInvSeqNo.equals(rhs.billInvSeqNo))))&&((this.displayPayeeZip == rhs.displayPayeeZip)||((this.displayPayeeZip!= null)&&this.displayPayeeZip.equals(rhs.displayPayeeZip))))&&((this.grntCode == rhs.grntCode)||((this.grntCode!= null)&&this.grntCode.equals(rhs.grntCode))))&&((this.finalInd == rhs.finalInd)||((this.finalInd!= null)&&this.finalInd.equals(rhs.finalInd))))&&((this.displaySponsorName == rhs.displaySponsorName)||((this.displaySponsorName!= null)&&this.displaySponsorName.equals(rhs.displaySponsorName))))&&((this.billAmt == rhs.billAmt)||((this.billAmt!= null)&&this.billAmt.equals(rhs.billAmt))))&&((this.periodToDate == rhs.periodToDate)||((this.periodToDate!= null)&&this.periodToDate.equals(rhs.periodToDate))))&&((this.displayPayeeState == rhs.displayPayeeState)||((this.displayPayeeState!= null)&&this.displayPayeeState.equals(rhs.displayPayeeState))))&&((this.displayPmsCode == rhs.displayPmsCode)||((this.displayPmsCode!= null)&&this.displayPmsCode.equals(rhs.displayPmsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayPayeeAddress23 == rhs.displayPayeeAddress23)||((this.displayPayeeAddress23 != null)&&this.displayPayeeAddress23 .equals(rhs.displayPayeeAddress23))))&&((this.displayPayeeCity == rhs.displayPayeeCity)||((this.displayPayeeCity!= null)&&this.displayPayeeCity.equals(rhs.displayPayeeCity))))&&((this.displayPayeeAddress1 == rhs.displayPayeeAddress1)||((this.displayPayeeAddress1 != null)&&this.displayPayeeAddress1 .equals(rhs.displayPayeeAddress1))))&&((this.dateSubmitted == rhs.dateSubmitted)||((this.dateSubmitted!= null)&&this.dateSubmitted.equals(rhs.dateSubmitted))));
    }

}
