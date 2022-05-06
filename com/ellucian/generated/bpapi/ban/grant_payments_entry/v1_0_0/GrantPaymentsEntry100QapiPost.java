
package com.ellucian.generated.bpapi.ban.grant_payments_entry.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keyblckGrntCode",
    "keyblckAgencyCode",
    "tranNumber",
    "grntCode",
    "detailCode",
    "balance",
    "transDate",
    "billInvSeqNo",
    "billInvAdjNo",
    "tranNumberPaid",
    "paidInvSeqNo",
    "paidInvAdjNo",
    "withholdingAmt",
    "paymentId",
    "fundCode",
    "rebillInd"
})
@Generated("jsonschema2pojo")
public class GrantPaymentsEntry100QapiPost {

    @JsonProperty("keyblckGrntCode")
    private String keyblckGrntCode;
    @JsonProperty("keyblckAgencyCode")
    private String keyblckAgencyCode;
    @JsonProperty("tranNumber")
    private String tranNumber;
    @JsonProperty("grntCode")
    private String grntCode;
    @JsonProperty("detailCode")
    private String detailCode;
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("transDate")
    private String transDate;
    @JsonProperty("billInvSeqNo")
    private String billInvSeqNo;
    @JsonProperty("billInvAdjNo")
    private String billInvAdjNo;
    @JsonProperty("tranNumberPaid")
    private String tranNumberPaid;
    @JsonProperty("paidInvSeqNo")
    private String paidInvSeqNo;
    @JsonProperty("paidInvAdjNo")
    private String paidInvAdjNo;
    @JsonProperty("withholdingAmt")
    private String withholdingAmt;
    @JsonProperty("paymentId")
    private String paymentId;
    @JsonProperty("fundCode")
    private String fundCode;
    @JsonProperty("rebillInd")
    private String rebillInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckGrntCode")
    public String getKeyblckGrntCode() {
        return keyblckGrntCode;
    }

    @JsonProperty("keyblckGrntCode")
    public void setKeyblckGrntCode(String keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
    }

    public GrantPaymentsEntry100QapiPost withKeyblckGrntCode(String keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
        return this;
    }

    @JsonProperty("keyblckAgencyCode")
    public String getKeyblckAgencyCode() {
        return keyblckAgencyCode;
    }

    @JsonProperty("keyblckAgencyCode")
    public void setKeyblckAgencyCode(String keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
    }

    public GrantPaymentsEntry100QapiPost withKeyblckAgencyCode(String keyblckAgencyCode) {
        this.keyblckAgencyCode = keyblckAgencyCode;
        return this;
    }

    @JsonProperty("tranNumber")
    public String getTranNumber() {
        return tranNumber;
    }

    @JsonProperty("tranNumber")
    public void setTranNumber(String tranNumber) {
        this.tranNumber = tranNumber;
    }

    public GrantPaymentsEntry100QapiPost withTranNumber(String tranNumber) {
        this.tranNumber = tranNumber;
        return this;
    }

    @JsonProperty("grntCode")
    public String getGrntCode() {
        return grntCode;
    }

    @JsonProperty("grntCode")
    public void setGrntCode(String grntCode) {
        this.grntCode = grntCode;
    }

    public GrantPaymentsEntry100QapiPost withGrntCode(String grntCode) {
        this.grntCode = grntCode;
        return this;
    }

    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public GrantPaymentsEntry100QapiPost withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    @JsonProperty("balance")
    public String getBalance() {
        return balance;
    }

    @JsonProperty("balance")
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public GrantPaymentsEntry100QapiPost withBalance(String balance) {
        this.balance = balance;
        return this;
    }

    @JsonProperty("transDate")
    public String getTransDate() {
        return transDate;
    }

    @JsonProperty("transDate")
    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public GrantPaymentsEntry100QapiPost withTransDate(String transDate) {
        this.transDate = transDate;
        return this;
    }

    @JsonProperty("billInvSeqNo")
    public String getBillInvSeqNo() {
        return billInvSeqNo;
    }

    @JsonProperty("billInvSeqNo")
    public void setBillInvSeqNo(String billInvSeqNo) {
        this.billInvSeqNo = billInvSeqNo;
    }

    public GrantPaymentsEntry100QapiPost withBillInvSeqNo(String billInvSeqNo) {
        this.billInvSeqNo = billInvSeqNo;
        return this;
    }

    @JsonProperty("billInvAdjNo")
    public String getBillInvAdjNo() {
        return billInvAdjNo;
    }

    @JsonProperty("billInvAdjNo")
    public void setBillInvAdjNo(String billInvAdjNo) {
        this.billInvAdjNo = billInvAdjNo;
    }

    public GrantPaymentsEntry100QapiPost withBillInvAdjNo(String billInvAdjNo) {
        this.billInvAdjNo = billInvAdjNo;
        return this;
    }

    @JsonProperty("tranNumberPaid")
    public String getTranNumberPaid() {
        return tranNumberPaid;
    }

    @JsonProperty("tranNumberPaid")
    public void setTranNumberPaid(String tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
    }

    public GrantPaymentsEntry100QapiPost withTranNumberPaid(String tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
        return this;
    }

    @JsonProperty("paidInvSeqNo")
    public String getPaidInvSeqNo() {
        return paidInvSeqNo;
    }

    @JsonProperty("paidInvSeqNo")
    public void setPaidInvSeqNo(String paidInvSeqNo) {
        this.paidInvSeqNo = paidInvSeqNo;
    }

    public GrantPaymentsEntry100QapiPost withPaidInvSeqNo(String paidInvSeqNo) {
        this.paidInvSeqNo = paidInvSeqNo;
        return this;
    }

    @JsonProperty("paidInvAdjNo")
    public String getPaidInvAdjNo() {
        return paidInvAdjNo;
    }

    @JsonProperty("paidInvAdjNo")
    public void setPaidInvAdjNo(String paidInvAdjNo) {
        this.paidInvAdjNo = paidInvAdjNo;
    }

    public GrantPaymentsEntry100QapiPost withPaidInvAdjNo(String paidInvAdjNo) {
        this.paidInvAdjNo = paidInvAdjNo;
        return this;
    }

    @JsonProperty("withholdingAmt")
    public String getWithholdingAmt() {
        return withholdingAmt;
    }

    @JsonProperty("withholdingAmt")
    public void setWithholdingAmt(String withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
    }

    public GrantPaymentsEntry100QapiPost withWithholdingAmt(String withholdingAmt) {
        this.withholdingAmt = withholdingAmt;
        return this;
    }

    @JsonProperty("paymentId")
    public String getPaymentId() {
        return paymentId;
    }

    @JsonProperty("paymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public GrantPaymentsEntry100QapiPost withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public GrantPaymentsEntry100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    @JsonProperty("rebillInd")
    public String getRebillInd() {
        return rebillInd;
    }

    @JsonProperty("rebillInd")
    public void setRebillInd(String rebillInd) {
        this.rebillInd = rebillInd;
    }

    public GrantPaymentsEntry100QapiPost withRebillInd(String rebillInd) {
        this.rebillInd = rebillInd;
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

    public GrantPaymentsEntry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantPaymentsEntry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckGrntCode");
        sb.append('=');
        sb.append(((this.keyblckGrntCode == null)?"<null>":this.keyblckGrntCode));
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
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("billInvSeqNo");
        sb.append('=');
        sb.append(((this.billInvSeqNo == null)?"<null>":this.billInvSeqNo));
        sb.append(',');
        sb.append("billInvAdjNo");
        sb.append('=');
        sb.append(((this.billInvAdjNo == null)?"<null>":this.billInvAdjNo));
        sb.append(',');
        sb.append("tranNumberPaid");
        sb.append('=');
        sb.append(((this.tranNumberPaid == null)?"<null>":this.tranNumberPaid));
        sb.append(',');
        sb.append("paidInvSeqNo");
        sb.append('=');
        sb.append(((this.paidInvSeqNo == null)?"<null>":this.paidInvSeqNo));
        sb.append(',');
        sb.append("paidInvAdjNo");
        sb.append('=');
        sb.append(((this.paidInvAdjNo == null)?"<null>":this.paidInvAdjNo));
        sb.append(',');
        sb.append("withholdingAmt");
        sb.append('=');
        sb.append(((this.withholdingAmt == null)?"<null>":this.withholdingAmt));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("rebillInd");
        sb.append('=');
        sb.append(((this.rebillInd == null)?"<null>":this.rebillInd));
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
        if ((other instanceof GrantPaymentsEntry100QapiPost) == false) {
            return false;
        }
        GrantPaymentsEntry100QapiPost rhs = ((GrantPaymentsEntry100QapiPost) other);
        return ((((((((((((((((((this.paidInvSeqNo == rhs.paidInvSeqNo)||((this.paidInvSeqNo!= null)&&this.paidInvSeqNo.equals(rhs.paidInvSeqNo)))&&((this.rebillInd == rhs.rebillInd)||((this.rebillInd!= null)&&this.rebillInd.equals(rhs.rebillInd))))&&((this.keyblckAgencyCode == rhs.keyblckAgencyCode)||((this.keyblckAgencyCode!= null)&&this.keyblckAgencyCode.equals(rhs.keyblckAgencyCode))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.grntCode == rhs.grntCode)||((this.grntCode!= null)&&this.grntCode.equals(rhs.grntCode))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.withholdingAmt == rhs.withholdingAmt)||((this.withholdingAmt!= null)&&this.withholdingAmt.equals(rhs.withholdingAmt))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.billInvAdjNo == rhs.billInvAdjNo)||((this.billInvAdjNo!= null)&&this.billInvAdjNo.equals(rhs.billInvAdjNo))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckGrntCode == rhs.keyblckGrntCode)||((this.keyblckGrntCode!= null)&&this.keyblckGrntCode.equals(rhs.keyblckGrntCode))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.billInvSeqNo == rhs.billInvSeqNo)||((this.billInvSeqNo!= null)&&this.billInvSeqNo.equals(rhs.billInvSeqNo))))&&((this.paidInvAdjNo == rhs.paidInvAdjNo)||((this.paidInvAdjNo!= null)&&this.paidInvAdjNo.equals(rhs.paidInvAdjNo))));
    }

}
