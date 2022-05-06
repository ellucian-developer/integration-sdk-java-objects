
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
    "idstudent",
    "crossrefDetailCode",
    "keyblocTermCode",
    "refundInd",
    "contractNumber",
    "tranNumber",
    "detailCode",
    "finalInd",
    "crossrefSrceCode",
    "tbvrconrStuName",
    "balance",
    "transDate",
    "payment",
    "crossrefDcatCode",
    "id",
    "cpdtInd",
    "detailTranNumber",
    "desc",
    "termCode",
    "contNumber"
})
@Generated("jsonschema2pojo")
public class ContractReview100GetRequest {

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
     * Student ID
     * <p>
     * Lineage reference object : idstudent
     * 
     */
    @JsonProperty("idstudent")
    @JsonPropertyDescription("Lineage reference object : idstudent")
    private Object idstudent;
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
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
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
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    @JsonPropertyDescription("Lineage reference object : contractNumber")
    private Object contractNumber;
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
     * Payment
     * <p>
     * Lineage reference object : TBVCONR_PAYMENT
     * 
     */
    @JsonProperty("payment")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_PAYMENT")
    private Double payment;
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
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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
    /**
     * Contract Number
     * <p>
     * Lineage reference object : TBVCONR_CONT_NUMBER, Lookup lineage reference object : tbbcont
     * 
     */
    @JsonProperty("contNumber")
    @JsonPropertyDescription("Lineage reference object : TBVCONR_CONT_NUMBER, Lookup lineage reference object : tbbcont")
    private Double contNumber;
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

    public ContractReview100GetRequest withCharge(Double charge) {
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

    public ContractReview100GetRequest withStuId(String stuId) {
        this.stuId = stuId;
        return this;
    }

    /**
     * Student ID
     * <p>
     * Lineage reference object : idstudent
     * 
     */
    @JsonProperty("idstudent")
    public Object getIdstudent() {
        return idstudent;
    }

    /**
     * Student ID
     * <p>
     * Lineage reference object : idstudent
     * 
     */
    @JsonProperty("idstudent")
    public void setIdstudent(Object idstudent) {
        this.idstudent = idstudent;
    }

    public ContractReview100GetRequest withIdstudent(Object idstudent) {
        this.idstudent = idstudent;
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

    public ContractReview100GetRequest withCrossrefDetailCode(String crossrefDetailCode) {
        this.crossrefDetailCode = crossrefDetailCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ContractReview100GetRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
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

    public ContractReview100GetRequest withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    public Object getContractNumber() {
        return contractNumber;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    public void setContractNumber(Object contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ContractReview100GetRequest withContractNumber(Object contractNumber) {
        this.contractNumber = contractNumber;
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

    public ContractReview100GetRequest withTranNumber(Double tranNumber) {
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

    public ContractReview100GetRequest withDetailCode(String detailCode) {
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

    public ContractReview100GetRequest withFinalInd(String finalInd) {
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

    public ContractReview100GetRequest withCrossrefSrceCode(String crossrefSrceCode) {
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

    public ContractReview100GetRequest withTbvrconrStuName(String tbvrconrStuName) {
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

    public ContractReview100GetRequest withBalance(Double balance) {
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

    public ContractReview100GetRequest withTransDate(Date transDate) {
        this.transDate = transDate;
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

    public ContractReview100GetRequest withPayment(Double payment) {
        this.payment = payment;
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

    public ContractReview100GetRequest withCrossrefDcatCode(String crossrefDcatCode) {
        this.crossrefDcatCode = crossrefDcatCode;
        return this;
    }

    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public ContractReview100GetRequest withId(Object id) {
        this.id = id;
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

    public ContractReview100GetRequest withCpdtInd(String cpdtInd) {
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

    public ContractReview100GetRequest withDetailTranNumber(Double detailTranNumber) {
        this.detailTranNumber = detailTranNumber;
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

    public ContractReview100GetRequest withDesc(String desc) {
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

    public ContractReview100GetRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public ContractReview100GetRequest withContNumber(Double contNumber) {
        this.contNumber = contNumber;
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

    public ContractReview100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractReview100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("charge");
        sb.append('=');
        sb.append(((this.charge == null)?"<null>":this.charge));
        sb.append(',');
        sb.append("stuId");
        sb.append('=');
        sb.append(((this.stuId == null)?"<null>":this.stuId));
        sb.append(',');
        sb.append("idstudent");
        sb.append('=');
        sb.append(((this.idstudent == null)?"<null>":this.idstudent));
        sb.append(',');
        sb.append("crossrefDetailCode");
        sb.append('=');
        sb.append(((this.crossrefDetailCode == null)?"<null>":this.crossrefDetailCode));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
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
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("crossrefDcatCode");
        sb.append('=');
        sb.append(((this.crossrefDcatCode == null)?"<null>":this.crossrefDcatCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("cpdtInd");
        sb.append('=');
        sb.append(((this.cpdtInd == null)?"<null>":this.cpdtInd));
        sb.append(',');
        sb.append("detailTranNumber");
        sb.append('=');
        sb.append(((this.detailTranNumber == null)?"<null>":this.detailTranNumber));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("contNumber");
        sb.append('=');
        sb.append(((this.contNumber == null)?"<null>":this.contNumber));
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
        result = ((result* 31)+((this.idstudent == null)? 0 :this.idstudent.hashCode()));
        result = ((result* 31)+((this.crossrefDetailCode == null)? 0 :this.crossrefDetailCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.finalInd == null)? 0 :this.finalInd.hashCode()));
        result = ((result* 31)+((this.crossrefSrceCode == null)? 0 :this.crossrefSrceCode.hashCode()));
        result = ((result* 31)+((this.tbvrconrStuName == null)? 0 :this.tbvrconrStuName.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.crossrefDcatCode == null)? 0 :this.crossrefDcatCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cpdtInd == null)? 0 :this.cpdtInd.hashCode()));
        result = ((result* 31)+((this.detailTranNumber == null)? 0 :this.detailTranNumber.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.contNumber == null)? 0 :this.contNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractReview100GetRequest) == false) {
            return false;
        }
        ContractReview100GetRequest rhs = ((ContractReview100GetRequest) other);
        return ((((((((((((((((((((((((this.charge == rhs.charge)||((this.charge!= null)&&this.charge.equals(rhs.charge)))&&((this.stuId == rhs.stuId)||((this.stuId!= null)&&this.stuId.equals(rhs.stuId))))&&((this.idstudent == rhs.idstudent)||((this.idstudent!= null)&&this.idstudent.equals(rhs.idstudent))))&&((this.crossrefDetailCode == rhs.crossrefDetailCode)||((this.crossrefDetailCode!= null)&&this.crossrefDetailCode.equals(rhs.crossrefDetailCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.finalInd == rhs.finalInd)||((this.finalInd!= null)&&this.finalInd.equals(rhs.finalInd))))&&((this.crossrefSrceCode == rhs.crossrefSrceCode)||((this.crossrefSrceCode!= null)&&this.crossrefSrceCode.equals(rhs.crossrefSrceCode))))&&((this.tbvrconrStuName == rhs.tbvrconrStuName)||((this.tbvrconrStuName!= null)&&this.tbvrconrStuName.equals(rhs.tbvrconrStuName))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.crossrefDcatCode == rhs.crossrefDcatCode)||((this.crossrefDcatCode!= null)&&this.crossrefDcatCode.equals(rhs.crossrefDcatCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cpdtInd == rhs.cpdtInd)||((this.cpdtInd!= null)&&this.cpdtInd.equals(rhs.cpdtInd))))&&((this.detailTranNumber == rhs.detailTranNumber)||((this.detailTranNumber!= null)&&this.detailTranNumber.equals(rhs.detailTranNumber))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.contNumber == rhs.contNumber)||((this.contNumber!= null)&&this.contNumber.equals(rhs.contNumber))));
    }

}
