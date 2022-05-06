
package com.ellucian.generated.bpapi.ban.contract_review.v1_0_0;

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
    "charge",
    "stuId",
    "crossrefDetailCode",
    "refundInd",
    "tranNumber",
    "detailCode",
    "finalInd",
    "crossrefSrceCode",
    "tbvrconrStuName",
    "balance",
    "transDate",
    "crossrefDcatCode",
    "payment",
    "cpdtInd",
    "detailTranNumber",
    "user",
    "contNumber",
    "desc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbvconr {

    /**
     * Charge
     * <p>
     * Lineage reference object : TBVCONR_CHARGE
     * 
     */
    @JsonProperty("charge")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_CHARGE")
    private Double charge;
    /**
     * Student ID
     * <p>
     * Lineage reference object : TBVCONR_STU_ID
     * 
     */
    @JsonProperty("stuId")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_STU_ID")
    private String stuId;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVCONR_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("crossrefDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_CROSSREF_DETAIL_CODE")
    private String crossrefDetailCode;
    /**
     * Credit Student
     * <p>
     * Lineage reference object : TBVCONR_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_REFUND_IND")
    private String refundInd;
    /**
     * Tran Number
     * <p>
     * Lineage reference object : TBVCONR_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_TRAN_NUMBER")
    private Double tranNumber;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVCONR_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String detailCode;
    /**
     * Final Pay
     * <p>
     * Lineage reference object : TBVCONR_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_FINAL_IND")
    private String finalInd;
    /**
     * Source
     * <p>
     * Lineage reference object : TBVCONR_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("crossrefSrceCode")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_CROSSREF_SRCE_CODE")
    private String crossrefSrceCode;
    /**
     * Lineage reference object : TBVCONR_STU_NAME
     * 
     */
    @JsonProperty("tbvrconrStuName")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_STU_NAME")
    private String tbvrconrStuName;
    /**
     * Balance
     * <p>
     * Lineage reference object : TBVCONR_BALANCE
     * 
     */
    @JsonProperty("balance")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_BALANCE")
    private Double balance;
    /**
     * Trans Date
     * <p>
     * Lineage reference object : TBVCONR_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_TRANS_DATE")
    private Date transDate;
    /**
     * Category Code
     * <p>
     * Lineage reference object : TBVCONR_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("crossrefDcatCode")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_CROSSREF_DCAT_CODE")
    private String crossrefDcatCode;
    /**
     * Payment
     * <p>
     * Lineage reference object : TBVCONR_PAYMENT
     * 
     */
    @JsonProperty("payment")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_PAYMENT")
    private Double payment;
    /**
     * Pay Detail
     * <p>
     * Lineage reference object : TBVCONR_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_CPDT_IND")
    private String cpdtInd;
    /**
     * Detail Tran
     * <p>
     * Lineage reference object : TBVCONR_DETAIL_TRAN_NUMBER
     * 
     */
    @JsonProperty("detailTranNumber")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_DETAIL_TRAN_NUMBER")
    private Double detailTranNumber;
    /**
     * User
     * <p>
     * Lineage reference object : TBVCONR_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_USER")
    private String user;
    /**
     * Contract Number
     * <p>
     * Lineage reference object : TBVCONR_CONT_NUMBER, Lookup lineage reference object : tbbcont
     * 
     */
    @JsonProperty("contNumber")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_CONT_NUMBER, Lookup lineage reference object : tbbcont")
    private Double contNumber;
    /**
     * Lineage reference object : TBVCONR_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_DESC")
    private String desc;
    /**
     * Term
     * <p>
     * Lineage reference object : TBVCONR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Charge
     * <p>
     * Lineage reference object : TBVCONR_CHARGE
     * 
     */
    @JsonProperty("charge")
    public Double getCharge() {
        return charge;
    }

    /**
     * Charge
     * <p>
     * Lineage reference object : TBVCONR_CHARGE
     * 
     */
    @JsonProperty("charge")
    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Tbvconr withCharge(Double charge) {
        this.charge = charge;
        return this;
    }

    /**
     * Student ID
     * <p>
     * Lineage reference object : TBVCONR_STU_ID
     * 
     */
    @JsonProperty("stuId")
    public String getStuId() {
        return stuId;
    }

    /**
     * Student ID
     * <p>
     * Lineage reference object : TBVCONR_STU_ID
     * 
     */
    @JsonProperty("stuId")
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public Tbvconr withStuId(String stuId) {
        this.stuId = stuId;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVCONR_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("crossrefDetailCode")
    public String getCrossrefDetailCode() {
        return crossrefDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVCONR_CROSSREF_DETAIL_CODE
     * 
     */
    @JsonProperty("crossrefDetailCode")
    public void setCrossrefDetailCode(String crossrefDetailCode) {
        this.crossrefDetailCode = crossrefDetailCode;
    }

    public Tbvconr withCrossrefDetailCode(String crossrefDetailCode) {
        this.crossrefDetailCode = crossrefDetailCode;
        return this;
    }

    /**
     * Credit Student
     * <p>
     * Lineage reference object : TBVCONR_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    /**
     * Credit Student
     * <p>
     * Lineage reference object : TBVCONR_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public Tbvconr withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * Tran Number
     * <p>
     * Lineage reference object : TBVCONR_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public Double getTranNumber() {
        return tranNumber;
    }

    /**
     * Tran Number
     * <p>
     * Lineage reference object : TBVCONR_TRAN_NUMBER
     * 
     */
    @JsonProperty("tranNumber")
    public void setTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
    }

    public Tbvconr withTranNumber(Double tranNumber) {
        this.tranNumber = tranNumber;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVCONR_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBVCONR_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbvconr withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Final Pay
     * <p>
     * Lineage reference object : TBVCONR_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    public String getFinalInd() {
        return finalInd;
    }

    /**
     * Final Pay
     * <p>
     * Lineage reference object : TBVCONR_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    public void setFinalInd(String finalInd) {
        this.finalInd = finalInd;
    }

    public Tbvconr withFinalInd(String finalInd) {
        this.finalInd = finalInd;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBVCONR_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("crossrefSrceCode")
    public String getCrossrefSrceCode() {
        return crossrefSrceCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBVCONR_CROSSREF_SRCE_CODE
     * 
     */
    @JsonProperty("crossrefSrceCode")
    public void setCrossrefSrceCode(String crossrefSrceCode) {
        this.crossrefSrceCode = crossrefSrceCode;
    }

    public Tbvconr withCrossrefSrceCode(String crossrefSrceCode) {
        this.crossrefSrceCode = crossrefSrceCode;
        return this;
    }

    /**
     * Lineage reference object : TBVCONR_STU_NAME
     * 
     */
    @JsonProperty("tbvrconrStuName")
    public String getTbvrconrStuName() {
        return tbvrconrStuName;
    }

    /**
     * Lineage reference object : TBVCONR_STU_NAME
     * 
     */
    @JsonProperty("tbvrconrStuName")
    public void setTbvrconrStuName(String tbvrconrStuName) {
        this.tbvrconrStuName = tbvrconrStuName;
    }

    public Tbvconr withTbvrconrStuName(String tbvrconrStuName) {
        this.tbvrconrStuName = tbvrconrStuName;
        return this;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBVCONR_BALANCE
     * 
     */
    @JsonProperty("balance")
    public Double getBalance() {
        return balance;
    }

    /**
     * Balance
     * <p>
     * Lineage reference object : TBVCONR_BALANCE
     * 
     */
    @JsonProperty("balance")
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Tbvconr withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Trans Date
     * <p>
     * Lineage reference object : TBVCONR_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Trans Date
     * <p>
     * Lineage reference object : TBVCONR_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Tbvconr withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Category Code
     * <p>
     * Lineage reference object : TBVCONR_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("crossrefDcatCode")
    public String getCrossrefDcatCode() {
        return crossrefDcatCode;
    }

    /**
     * Category Code
     * <p>
     * Lineage reference object : TBVCONR_CROSSREF_DCAT_CODE
     * 
     */
    @JsonProperty("crossrefDcatCode")
    public void setCrossrefDcatCode(String crossrefDcatCode) {
        this.crossrefDcatCode = crossrefDcatCode;
    }

    public Tbvconr withCrossrefDcatCode(String crossrefDcatCode) {
        this.crossrefDcatCode = crossrefDcatCode;
        return this;
    }

    /**
     * Payment
     * <p>
     * Lineage reference object : TBVCONR_PAYMENT
     * 
     */
    @JsonProperty("payment")
    public Double getPayment() {
        return payment;
    }

    /**
     * Payment
     * <p>
     * Lineage reference object : TBVCONR_PAYMENT
     * 
     */
    @JsonProperty("payment")
    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Tbvconr withPayment(Double payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Pay Detail
     * <p>
     * Lineage reference object : TBVCONR_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    public String getCpdtInd() {
        return cpdtInd;
    }

    /**
     * Pay Detail
     * <p>
     * Lineage reference object : TBVCONR_CPDT_IND
     * 
     */
    @JsonProperty("cpdtInd")
    public void setCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
    }

    public Tbvconr withCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
        return this;
    }

    /**
     * Detail Tran
     * <p>
     * Lineage reference object : TBVCONR_DETAIL_TRAN_NUMBER
     * 
     */
    @JsonProperty("detailTranNumber")
    public Double getDetailTranNumber() {
        return detailTranNumber;
    }

    /**
     * Detail Tran
     * <p>
     * Lineage reference object : TBVCONR_DETAIL_TRAN_NUMBER
     * 
     */
    @JsonProperty("detailTranNumber")
    public void setDetailTranNumber(Double detailTranNumber) {
        this.detailTranNumber = detailTranNumber;
    }

    public Tbvconr withDetailTranNumber(Double detailTranNumber) {
        this.detailTranNumber = detailTranNumber;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : TBVCONR_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User
     * <p>
     * Lineage reference object : TBVCONR_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Tbvconr withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : TBVCONR_CONT_NUMBER, Lookup lineage reference object : tbbcont
     * 
     */
    @JsonProperty("contNumber")
    public Double getContNumber() {
        return contNumber;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : TBVCONR_CONT_NUMBER, Lookup lineage reference object : tbbcont
     * 
     */
    @JsonProperty("contNumber")
    public void setContNumber(Double contNumber) {
        this.contNumber = contNumber;
    }

    public Tbvconr withContNumber(Double contNumber) {
        this.contNumber = contNumber;
        return this;
    }

    /**
     * Lineage reference object : TBVCONR_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Lineage reference object : TBVCONR_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Tbvconr withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBVCONR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBVCONR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Tbvconr withTermCode(String termCode) {
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

    public Tbvconr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbvconr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("charge");
        sb.append('=');
        sb.append(((this.charge == null)?"<null>":this.charge));
        sb.append(',');
        sb.append("stuId");
        sb.append('=');
        sb.append(((this.stuId == null)?"<null>":this.stuId));
        sb.append(',');
        sb.append("crossrefDetailCode");
        sb.append('=');
        sb.append(((this.crossrefDetailCode == null)?"<null>":this.crossrefDetailCode));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("tranNumber");
        sb.append('=');
        sb.append(((this.tranNumber == null)?"<null>":this.tranNumber));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("finalInd");
        sb.append('=');
        sb.append(((this.finalInd == null)?"<null>":this.finalInd));
        sb.append(',');
        sb.append("crossrefSrceCode");
        sb.append('=');
        sb.append(((this.crossrefSrceCode == null)?"<null>":this.crossrefSrceCode));
        sb.append(',');
        sb.append("tbvrconrStuName");
        sb.append('=');
        sb.append(((this.tbvrconrStuName == null)?"<null>":this.tbvrconrStuName));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("crossrefDcatCode");
        sb.append('=');
        sb.append(((this.crossrefDcatCode == null)?"<null>":this.crossrefDcatCode));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("cpdtInd");
        sb.append('=');
        sb.append(((this.cpdtInd == null)?"<null>":this.cpdtInd));
        sb.append(',');
        sb.append("detailTranNumber");
        sb.append('=');
        sb.append(((this.detailTranNumber == null)?"<null>":this.detailTranNumber));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("contNumber");
        sb.append('=');
        sb.append(((this.contNumber == null)?"<null>":this.contNumber));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.charge == null)? 0 :this.charge.hashCode()));
        result = ((result* 31)+((this.stuId == null)? 0 :this.stuId.hashCode()));
        result = ((result* 31)+((this.crossrefDetailCode == null)? 0 :this.crossrefDetailCode.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.finalInd == null)? 0 :this.finalInd.hashCode()));
        result = ((result* 31)+((this.crossrefSrceCode == null)? 0 :this.crossrefSrceCode.hashCode()));
        result = ((result* 31)+((this.tbvrconrStuName == null)? 0 :this.tbvrconrStuName.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.crossrefDcatCode == null)? 0 :this.crossrefDcatCode.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cpdtInd == null)? 0 :this.cpdtInd.hashCode()));
        result = ((result* 31)+((this.detailTranNumber == null)? 0 :this.detailTranNumber.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.contNumber == null)? 0 :this.contNumber.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbvconr) == false) {
            return false;
        }
        Tbvconr rhs = ((Tbvconr) other);
        return (((((((((((((((((((((this.charge == rhs.charge)||((this.charge!= null)&&this.charge.equals(rhs.charge)))&&((this.stuId == rhs.stuId)||((this.stuId!= null)&&this.stuId.equals(rhs.stuId))))&&((this.crossrefDetailCode == rhs.crossrefDetailCode)||((this.crossrefDetailCode!= null)&&this.crossrefDetailCode.equals(rhs.crossrefDetailCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.finalInd == rhs.finalInd)||((this.finalInd!= null)&&this.finalInd.equals(rhs.finalInd))))&&((this.crossrefSrceCode == rhs.crossrefSrceCode)||((this.crossrefSrceCode!= null)&&this.crossrefSrceCode.equals(rhs.crossrefSrceCode))))&&((this.tbvrconrStuName == rhs.tbvrconrStuName)||((this.tbvrconrStuName!= null)&&this.tbvrconrStuName.equals(rhs.tbvrconrStuName))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.crossrefDcatCode == rhs.crossrefDcatCode)||((this.crossrefDcatCode!= null)&&this.crossrefDcatCode.equals(rhs.crossrefDcatCode))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cpdtInd == rhs.cpdtInd)||((this.cpdtInd!= null)&&this.cpdtInd.equals(rhs.cpdtInd))))&&((this.detailTranNumber == rhs.detailTranNumber)||((this.detailTranNumber!= null)&&this.detailTranNumber.equals(rhs.detailTranNumber))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.contNumber == rhs.contNumber)||((this.contNumber!= null)&&this.contNumber.equals(rhs.contNumber))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
