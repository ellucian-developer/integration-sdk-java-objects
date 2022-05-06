
package com.ellucian.generated.bpapi.ban.grant_payments_entry.v1_0_0;

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
    "paidInvSeqNo",
    "rebillInd",
    "keyblckAgencyCode",
    "tranNumber",
    "grntCode",
    "detailCode",
    "withholdingAmt",
    "balance",
    "billInvAdjNo",
    "fundCode",
    "paymentId",
    "transDate",
    "keyblckGrntCode",
    "tranNumberPaid",
    "billInvSeqNo",
    "paidInvAdjNo"
})
@Generated("jsonschema2pojo")
public class GrantPaymentsEntry100GetRequest {

    /**
     * Trraccd Paid Inv Seq No
     * <p>
     * Lineage reference object : TRRACCD_PAID_INV_SEQ_NO
     * 
     */
    @JsonProperty("paidInvSeqNo")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_PAID_INV_SEQ_NO")
    private Double paidInvSeqNo;
    /**
     * Lineage reference object : TRRACCD_REBILL_IND
     * 
     */
    @JsonProperty("rebillInd")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_REBILL_IND")
    private String rebillInd;
    /**
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAgencyCode")
    private Object keyblckAgencyCode;
    /**
     * Trraccd Tran Number
     * <p>
     * Lineage reference object : TRRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_TRAN_NUMBER")
    private Double tranNumber;
    /**
     * Trraccd Grnt Code
     * <p>
     * Lineage reference object : TRRACCD_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_GRNT_CODE")
    private String grntCode;
    /**
     * Trraccd Detail Code
     * <p>
     * Lineage reference object : TRRACCD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_DETAIL_CODE")
    private String detailCode;
    /**
     * Trraccd Withholding Amt
     * <p>
     * Lineage reference object : TRRACCD_WITHHOLDING_AMT
     * 
     */
    @JsonProperty("withholdingAmt")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_WITHHOLDING_AMT")
    private Double withholdingAmt;
    /**
     * Trraccd Balance
     * <p>
     * Lineage reference object : TRRACCD_BALANCE
     * 
     */
    @JsonProperty("balance")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_BALANCE")
    private Double balance;
    /**
     * Trraccd Bill Inv Adj No
     * <p>
     * Lineage reference object : TRRACCD_BILL_INV_ADJ_NO
     * 
     */
    @JsonProperty("billInvAdjNo")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_BILL_INV_ADJ_NO")
    private Double billInvAdjNo;
    /**
     * Trraccd Fund Code
     * <p>
     * Lineage reference object : TRRACCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_FUND_CODE")
    private String fundCode;
    /**
     * Trraccd Payment Id
     * <p>
     * Lineage reference object : TRRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_PAYMENT_ID")
    private String paymentId;
    /**
     * Trraccd Trans Date
     * <p>
     * Lineage reference object : TRRACCD_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_TRANS_DATE")
    private Date transDate;
    /**
     * Grant
     * <p>
     * Lineage reference object : keyblckGrntCode
     * 
     */
    @JsonProperty("keyblckGrntCode")
    @JsonPropertyDescription("Lineage reference object : keyblckGrntCode")
    private Object keyblckGrntCode;
    /**
     * Trraccd Tran Number Paid
     * <p>
     * Lineage reference object : TRRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tranNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_TRAN_NUMBER_PAID")
    private Double tranNumberPaid;
    /**
     * Trraccd Bill Inv Seq No
     * <p>
     * Lineage reference object : TRRACCD_BILL_INV_SEQ_NO
     * 
     */
    @JsonProperty("billInvSeqNo")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_BILL_INV_SEQ_NO")
    private Double billInvSeqNo;
    /**
     * Trraccd Paid Inv Adj No
     * <p>
     * Lineage reference object : TRRACCD_PAID_INV_ADJ_NO
     * 
     */
    @JsonProperty("paidInvAdjNo")
    @JsonPropertyDescription("Lineage reference object : TRRACCD_PAID_INV_ADJ_NO")
    private Double paidInvAdjNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Trraccd Paid Inv Seq No
     * <p>
     * Lineage reference object : TRRACCD_PAID_INV_SEQ_NO
     * 
     */
    @JsonProperty("paidInvSeqNo")
    public Double getPaidInvSeqNo() {
        return paidInvSeqNo;
    }

    /**
     * Trraccd Paid Inv Seq No
     * <p>
     * Lineage reference object : TRRACCD_PAID_INV_SEQ_NO
     * 
     */
    @JsonProperty("paidInvSeqNo")
    public void setPaidInvSeqNo(Double paidInvSeqNo) {
        this.paidInvSeqNo = paidInvSeqNo;
    }

    public GrantPaymentsEntry100GetRequest withPaidInvSeqNo(Double paidInvSeqNo) {
        this.paidInvSeqNo = paidInvSeqNo;
        return this;
    }

    /**
     * Lineage reference object : TRRACCD_REBILL_IND
     * 
     */
    @JsonProperty("rebillInd")
    public String getRebillInd() {
        return rebillInd;
    }

    /**
     * Lineage reference object : TRRACCD_REBILL_IND
     * 
     */
    @JsonProperty("rebillInd")
    public void setRebillInd(String rebillInd) {
        this.rebillInd = rebillInd;
    }

    public GrantPaymentsEntry100GetRequest withRebillInd(String rebillInd) {
        this.rebillInd = rebillInd;
        return this;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    public Object getKeyblckAgencyCode() {
        return keyblckAgencyCode;
    }

    /**
     * Agency
     * <p>
     * Lineage reference object : keyblckAgencyCode
     * 
     */
    @JsonProperty("keyblckAgencyCode")
    public void setKeyblckAgencyCode(Object keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
    }

    public GrantPaymentsEntry100GetRequest withKeyblckAgencyCode(Object keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
        return this;
    }

    /**
     * Trraccd Tran Number
     * <p>
     * Lineage reference object : TRRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public Double getTranNumber() {
        return tranNumber;
    }

    /**
     * Trraccd Tran Number
     * <p>
     * Lineage reference object : TRRACCD_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public void setTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
    }

    public GrantPaymentsEntry100GetRequest withTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
        return this;
    }

    /**
     * Trraccd Grnt Code
     * <p>
     * Lineage reference object : TRRACCD_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    public String getGrntCode() {
        return grntCode;
    }

    /**
     * Trraccd Grnt Code
     * <p>
     * Lineage reference object : TRRACCD_GRNT_CODE
     * 
     */
    @JsonProperty("grntCode")
    public void setGrntCode(String grntCode) {
        this.grntCode = grntCode;
    }

    public GrantPaymentsEntry100GetRequest withGrntCode(String grntCode) {
        this.grntCode = grntCode;
        return this;
    }

    /**
     * Trraccd Detail Code
     * <p>
     * Lineage reference object : TRRACCD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Trraccd Detail Code
     * <p>
     * Lineage reference object : TRRACCD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public GrantPaymentsEntry100GetRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Trraccd Withholding Amt
     * <p>
     * Lineage reference object : TRRACCD_WITHHOLDING_AMT
     * 
     */
    @JsonProperty("withholdingAmt")
    public Double getWithholdingAmt() {
        return withholdingAmt;
    }

    /**
     * Trraccd Withholding Amt
     * <p>
     * Lineage reference object : TRRACCD_WITHHOLDING_AMT
     * 
     */
    @JsonProperty("withholdingAmt")
    public void setWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
    }

    public GrantPaymentsEntry100GetRequest withWithholdingAmt(Double withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
        return this;
    }

    /**
     * Trraccd Balance
     * <p>
     * Lineage reference object : TRRACCD_BALANCE
     * 
     */
    @JsonProperty("balance")
    public Double getBalance() {
        return balance;
    }

    /**
     * Trraccd Balance
     * <p>
     * Lineage reference object : TRRACCD_BALANCE
     * 
     */
    @JsonProperty("balance")
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public GrantPaymentsEntry100GetRequest withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Trraccd Bill Inv Adj No
     * <p>
     * Lineage reference object : TRRACCD_BILL_INV_ADJ_NO
     * 
     */
    @JsonProperty("billInvAdjNo")
    public Double getBillInvAdjNo() {
        return billInvAdjNo;
    }

    /**
     * Trraccd Bill Inv Adj No
     * <p>
     * Lineage reference object : TRRACCD_BILL_INV_ADJ_NO
     * 
     */
    @JsonProperty("billInvAdjNo")
    public void setBillInvAdjNo(Double billInvAdjNo) {
        this.billInvAdjNo = billInvAdjNo;
    }

    public GrantPaymentsEntry100GetRequest withBillInvAdjNo(Double billInvAdjNo) {
        this.billInvAdjNo = billInvAdjNo;
        return this;
    }

    /**
     * Trraccd Fund Code
     * <p>
     * Lineage reference object : TRRACCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Trraccd Fund Code
     * <p>
     * Lineage reference object : TRRACCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public GrantPaymentsEntry100GetRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Trraccd Payment Id
     * <p>
     * Lineage reference object : TRRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Trraccd Payment Id
     * <p>
     * Lineage reference object : TRRACCD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public GrantPaymentsEntry100GetRequest withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Trraccd Trans Date
     * <p>
     * Lineage reference object : TRRACCD_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Trraccd Trans Date
     * <p>
     * Lineage reference object : TRRACCD_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public GrantPaymentsEntry100GetRequest withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : keyblckGrntCode
     * 
     */
    @JsonProperty("keyblckGrntCode")
    public Object getKeyblckGrntCode() {
        return keyblckGrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : keyblckGrntCode
     * 
     */
    @JsonProperty("keyblckGrntCode")
    public void setKeyblckGrntCode(Object keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
    }

    public GrantPaymentsEntry100GetRequest withKeyblckGrntCode(Object keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
        return this;
    }

    /**
     * Trraccd Tran Number Paid
     * <p>
     * Lineage reference object : TRRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tranNumberPaid")
    public Double getTranNumberPaid() {
        return tranNumberPaid;
    }

    /**
     * Trraccd Tran Number Paid
     * <p>
     * Lineage reference object : TRRACCD_TRAN_NUMBER_PAID
     * 
     */
    @JsonProperty("tranNumberPaid")
    public void setTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
    }

    public GrantPaymentsEntry100GetRequest withTranNumberPaid(Double tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
        return this;
    }

    /**
     * Trraccd Bill Inv Seq No
     * <p>
     * Lineage reference object : TRRACCD_BILL_INV_SEQ_NO
     * 
     */
    @JsonProperty("billInvSeqNo")
    public Double getBillInvSeqNo() {
        return billInvSeqNo;
    }

    /**
     * Trraccd Bill Inv Seq No
     * <p>
     * Lineage reference object : TRRACCD_BILL_INV_SEQ_NO
     * 
     */
    @JsonProperty("billInvSeqNo")
    public void setBillInvSeqNo(Double billInvSeqNo) {
        this.billInvSeqNo = billInvSeqNo;
    }

    public GrantPaymentsEntry100GetRequest withBillInvSeqNo(Double billInvSeqNo) {
        this.billInvSeqNo = billInvSeqNo;
        return this;
    }

    /**
     * Trraccd Paid Inv Adj No
     * <p>
     * Lineage reference object : TRRACCD_PAID_INV_ADJ_NO
     * 
     */
    @JsonProperty("paidInvAdjNo")
    public Double getPaidInvAdjNo() {
        return paidInvAdjNo;
    }

    /**
     * Trraccd Paid Inv Adj No
     * <p>
     * Lineage reference object : TRRACCD_PAID_INV_ADJ_NO
     * 
     */
    @JsonProperty("paidInvAdjNo")
    public void setPaidInvAdjNo(Double paidInvAdjNo) {
        this.paidInvAdjNo = paidInvAdjNo;
    }

    public GrantPaymentsEntry100GetRequest withPaidInvAdjNo(Double paidInvAdjNo) {
        this.paidInvAdjNo = paidInvAdjNo;
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

    public GrantPaymentsEntry100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantPaymentsEntry100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paidInvSeqNo");
        sb.append('=');
        sb.append(((this.paidInvSeqNo == null)?"<null>":this.paidInvSeqNo));
        sb.append(',');
        sb.append("rebillInd");
        sb.append('=');
        sb.append(((this.rebillInd == null)?"<null>":this.rebillInd));
        sb.append(',');
        sb.append("keyblckAgencyCode");
        sb.append('=');
        sb.append(((this.keyblckAgencyCode == null)?"<null>":this.keyblckAgencyCode));
        sb.append(',');
        sb.append("tranNumber");
        sb.append('=');
        sb.append(((this.tranNumber == null)?"<null>":this.tranNumber));
        sb.append(',');
        sb.append("grntCode");
        sb.append('=');
        sb.append(((this.grntCode == null)?"<null>":this.grntCode));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("withholdingAmt");
        sb.append('=');
        sb.append(((this.withholdingAmt == null)?"<null>":this.withholdingAmt));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("billInvAdjNo");
        sb.append('=');
        sb.append(((this.billInvAdjNo == null)?"<null>":this.billInvAdjNo));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("keyblckGrntCode");
        sb.append('=');
        sb.append(((this.keyblckGrntCode == null)?"<null>":this.keyblckGrntCode));
        sb.append(',');
        sb.append("tranNumberPaid");
        sb.append('=');
        sb.append(((this.tranNumberPaid == null)?"<null>":this.tranNumberPaid));
        sb.append(',');
        sb.append("billInvSeqNo");
        sb.append('=');
        sb.append(((this.billInvSeqNo == null)?"<null>":this.billInvSeqNo));
        sb.append(',');
        sb.append("paidInvAdjNo");
        sb.append('=');
        sb.append(((this.paidInvAdjNo == null)?"<null>":this.paidInvAdjNo));
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
        result = ((result* 31)+((this.paidInvSeqNo == null)? 0 :this.paidInvSeqNo.hashCode()));
        result = ((result* 31)+((this.rebillInd == null)? 0 :this.rebillInd.hashCode()));
        result = ((result* 31)+((this.keyblckAgencyCode == null)? 0 :this.keyblckAgencyCode.hashCode()));
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.grntCode == null)? 0 :this.grntCode.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.withholdingAmt == null)? 0 :this.withholdingAmt.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.billInvAdjNo == null)? 0 :this.billInvAdjNo.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckGrntCode == null)? 0 :this.keyblckGrntCode.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.billInvSeqNo == null)? 0 :this.billInvSeqNo.hashCode()));
        result = ((result* 31)+((this.paidInvAdjNo == null)? 0 :this.paidInvAdjNo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantPaymentsEntry100GetRequest) == false) {
            return false;
        }
        GrantPaymentsEntry100GetRequest rhs = ((GrantPaymentsEntry100GetRequest) other);
        return ((((((((((((((((((this.paidInvSeqNo == rhs.paidInvSeqNo)||((this.paidInvSeqNo!= null)&&this.paidInvSeqNo.equals(rhs.paidInvSeqNo)))&&((this.rebillInd == rhs.rebillInd)||((this.rebillInd!= null)&&this.rebillInd.equals(rhs.rebillInd))))&&((this.keyblckAgencyCode == rhs.keyblckAgencyCode)||((this.keyblckAgencyCode!= null)&&this.keyblckAgencyCode.equals(rhs.keyblckAgencyCode))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.grntCode == rhs.grntCode)||((this.grntCode!= null)&&this.grntCode.equals(rhs.grntCode))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.withholdingAmt == rhs.withholdingAmt)||((this.withholdingAmt!= null)&&this.withholdingAmt.equals(rhs.withholdingAmt))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.billInvAdjNo == rhs.billInvAdjNo)||((this.billInvAdjNo!= null)&&this.billInvAdjNo.equals(rhs.billInvAdjNo))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckGrntCode == rhs.keyblckGrntCode)||((this.keyblckGrntCode!= null)&&this.keyblckGrntCode.equals(rhs.keyblckGrntCode))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.billInvSeqNo == rhs.billInvSeqNo)||((this.billInvSeqNo!= null)&&this.billInvSeqNo.equals(rhs.billInvSeqNo))))&&((this.paidInvAdjNo == rhs.paidInvAdjNo)||((this.paidInvAdjNo!= null)&&this.paidInvAdjNo.equals(rhs.paidInvAdjNo))));
    }

}
