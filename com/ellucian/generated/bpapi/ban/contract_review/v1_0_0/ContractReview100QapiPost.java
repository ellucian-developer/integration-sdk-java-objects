
package com.ellucian.generated.bpapi.ban.contract_review.v1_0_0;

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
    "id",
    "contractNumber",
    "keyblocTermCode",
    "idstudent",
    "stuId",
    "tbvrconrStuName",
    "detailCode",
    "desc",
    "tranNumber",
    "transDate",
    "termCode",
    "contNumber",
    "detailTranNumber",
    "charge",
    "balance",
    "payment",
    "crossrefDetailCode",
    "crossrefSrceCode",
    "crossrefDcatCode",
    "cpdtInd",
    "refundInd",
    "finalInd"
})
@Generated("jsonschema2pojo")
public class ContractReview100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("contractNumber")
    private String contractNumber;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    @JsonProperty("idstudent")
    private String idstudent;
    @JsonProperty("stuId")
    private String stuId;
    @JsonProperty("tbvrconrStuName")
    private String tbvrconrStuName;
    @JsonProperty("detailCode")
    private String detailCode;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("tranNumber")
    private String tranNumber;
    @JsonProperty("transDate")
    private String transDate;
    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("contNumber")
    private String contNumber;
    @JsonProperty("detailTranNumber")
    private String detailTranNumber;
    @JsonProperty("charge")
    private String charge;
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("payment")
    private String payment;
    @JsonProperty("crossrefDetailCode")
    private String crossrefDetailCode;
    @JsonProperty("crossrefSrceCode")
    private String crossrefSrceCode;
    @JsonProperty("crossrefDcatCode")
    private String crossrefDcatCode;
    @JsonProperty("cpdtInd")
    private String cpdtInd;
    @JsonProperty("refundInd")
    private String refundInd;
    @JsonProperty("finalInd")
    private String finalInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ContractReview100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("contractNumber")
    public String getContractNumber() {
        return contractNumber;
    }

    @JsonProperty("contractNumber")
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ContractReview100QapiPost withContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ContractReview100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    @JsonProperty("idstudent")
    public String getIdstudent() {
        return idstudent;
    }

    @JsonProperty("idstudent")
    public void setIdstudent(String idstudent) {
        this.idstudent = idstudent;
    }

    public ContractReview100QapiPost withIdstudent(String idstudent) {
        this.idstudent = idstudent;
        return this;
    }

    @JsonProperty("stuId")
    public String getStuId() {
        return stuId;
    }

    @JsonProperty("stuId")
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public ContractReview100QapiPost withStuId(String stuId) {
        this.stuId = stuId;
        return this;
    }

    @JsonProperty("tbvrconrStuName")
    public String getTbvrconrStuName() {
        return tbvrconrStuName;
    }

    @JsonProperty("tbvrconrStuName")
    public void setTbvrconrStuName(String tbvrconrStuName) {
        this.tbvrconrStuName = tbvrconrStuName;
    }

    public ContractReview100QapiPost withTbvrconrStuName(String tbvrconrStuName) {
        this.tbvrconrStuName = tbvrconrStuName;
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

    public ContractReview100QapiPost withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ContractReview100QapiPost withDesc(String desc) {
        this.desc = desc;
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

    public ContractReview100QapiPost withTranNumber(String tranNumber) {
        this.tranNumber = tranNumber;
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

    public ContractReview100QapiPost withTransDate(String transDate) {
        this.transDate = transDate;
        return this;
    }

    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public ContractReview100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("contNumber")
    public String getContNumber() {
        return contNumber;
    }

    @JsonProperty("contNumber")
    public void setContNumber(String contNumber) {
        this.contNumber = contNumber;
    }

    public ContractReview100QapiPost withContNumber(String contNumber) {
        this.contNumber = contNumber;
        return this;
    }

    @JsonProperty("detailTranNumber")
    public String getDetailTranNumber() {
        return detailTranNumber;
    }

    @JsonProperty("detailTranNumber")
    public void setDetailTranNumber(String detailTranNumber) {
        this.detailTranNumber = detailTranNumber;
    }

    public ContractReview100QapiPost withDetailTranNumber(String detailTranNumber) {
        this.detailTranNumber = detailTranNumber;
        return this;
    }

    @JsonProperty("charge")
    public String getCharge() {
        return charge;
    }

    @JsonProperty("charge")
    public void setCharge(String charge) {
        this.charge = charge;
    }

    public ContractReview100QapiPost withCharge(String charge) {
        this.charge = charge;
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

    public ContractReview100QapiPost withBalance(String balance) {
        this.balance = balance;
        return this;
    }

    @JsonProperty("payment")
    public String getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(String payment) {
        this.payment = payment;
    }

    public ContractReview100QapiPost withPayment(String payment) {
        this.payment = payment;
        return this;
    }

    @JsonProperty("crossrefDetailCode")
    public String getCrossrefDetailCode() {
        return crossrefDetailCode;
    }

    @JsonProperty("crossrefDetailCode")
    public void setCrossrefDetailCode(String crossrefDetailCode) {
        this.crossrefDetailCode = crossrefDetailCode;
    }

    public ContractReview100QapiPost withCrossrefDetailCode(String crossrefDetailCode) {
        this.crossrefDetailCode = crossrefDetailCode;
        return this;
    }

    @JsonProperty("crossrefSrceCode")
    public String getCrossrefSrceCode() {
        return crossrefSrceCode;
    }

    @JsonProperty("crossrefSrceCode")
    public void setCrossrefSrceCode(String crossrefSrceCode) {
        this.crossrefSrceCode = crossrefSrceCode;
    }

    public ContractReview100QapiPost withCrossrefSrceCode(String crossrefSrceCode) {
        this.crossrefSrceCode = crossrefSrceCode;
        return this;
    }

    @JsonProperty("crossrefDcatCode")
    public String getCrossrefDcatCode() {
        return crossrefDcatCode;
    }

    @JsonProperty("crossrefDcatCode")
    public void setCrossrefDcatCode(String crossrefDcatCode) {
        this.crossrefDcatCode = crossrefDcatCode;
    }

    public ContractReview100QapiPost withCrossrefDcatCode(String crossrefDcatCode) {
        this.crossrefDcatCode = crossrefDcatCode;
        return this;
    }

    @JsonProperty("cpdtInd")
    public String getCpdtInd() {
        return cpdtInd;
    }

    @JsonProperty("cpdtInd")
    public void setCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
    }

    public ContractReview100QapiPost withCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
        return this;
    }

    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public ContractReview100QapiPost withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    @JsonProperty("finalInd")
    public String getFinalInd() {
        return finalInd;
    }

    @JsonProperty("finalInd")
    public void setFinalInd(String finalInd) {
        this.finalInd = finalInd;
    }

    public ContractReview100QapiPost withFinalInd(String finalInd) {
        this.finalInd = finalInd;
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

    public ContractReview100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractReview100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("idstudent");
        sb.append('=');
        sb.append(((this.idstudent == null)?"<null>":this.idstudent));
        sb.append(',');
        sb.append("stuId");
        sb.append('=');
        sb.append(((this.stuId == null)?"<null>":this.stuId));
        sb.append(',');
        sb.append("tbvrconrStuName");
        sb.append('=');
        sb.append(((this.tbvrconrStuName == null)?"<null>":this.tbvrconrStuName));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("tranNumber");
        sb.append('=');
        sb.append(((this.tranNumber == null)?"<null>":this.tranNumber));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("contNumber");
        sb.append('=');
        sb.append(((this.contNumber == null)?"<null>":this.contNumber));
        sb.append(',');
        sb.append("detailTranNumber");
        sb.append('=');
        sb.append(((this.detailTranNumber == null)?"<null>":this.detailTranNumber));
        sb.append(',');
        sb.append("charge");
        sb.append('=');
        sb.append(((this.charge == null)?"<null>":this.charge));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("crossrefDetailCode");
        sb.append('=');
        sb.append(((this.crossrefDetailCode == null)?"<null>":this.crossrefDetailCode));
        sb.append(',');
        sb.append("crossrefSrceCode");
        sb.append('=');
        sb.append(((this.crossrefSrceCode == null)?"<null>":this.crossrefSrceCode));
        sb.append(',');
        sb.append("crossrefDcatCode");
        sb.append('=');
        sb.append(((this.crossrefDcatCode == null)?"<null>":this.crossrefDcatCode));
        sb.append(',');
        sb.append("cpdtInd");
        sb.append('=');
        sb.append(((this.cpdtInd == null)?"<null>":this.cpdtInd));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("finalInd");
        sb.append('=');
        sb.append(((this.finalInd == null)?"<null>":this.finalInd));
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
        if ((other instanceof ContractReview100QapiPost) == false) {
            return false;
        }
        ContractReview100QapiPost rhs = ((ContractReview100QapiPost) other);
        return ((((((((((((((((((((((((this.charge == rhs.charge)||((this.charge!= null)&&this.charge.equals(rhs.charge)))&&((this.stuId == rhs.stuId)||((this.stuId!= null)&&this.stuId.equals(rhs.stuId))))&&((this.idstudent == rhs.idstudent)||((this.idstudent!= null)&&this.idstudent.equals(rhs.idstudent))))&&((this.crossrefDetailCode == rhs.crossrefDetailCode)||((this.crossrefDetailCode!= null)&&this.crossrefDetailCode.equals(rhs.crossrefDetailCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.finalInd == rhs.finalInd)||((this.finalInd!= null)&&this.finalInd.equals(rhs.finalInd))))&&((this.crossrefSrceCode == rhs.crossrefSrceCode)||((this.crossrefSrceCode!= null)&&this.crossrefSrceCode.equals(rhs.crossrefSrceCode))))&&((this.tbvrconrStuName == rhs.tbvrconrStuName)||((this.tbvrconrStuName!= null)&&this.tbvrconrStuName.equals(rhs.tbvrconrStuName))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.crossrefDcatCode == rhs.crossrefDcatCode)||((this.crossrefDcatCode!= null)&&this.crossrefDcatCode.equals(rhs.crossrefDcatCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cpdtInd == rhs.cpdtInd)||((this.cpdtInd!= null)&&this.cpdtInd.equals(rhs.cpdtInd))))&&((this.detailTranNumber == rhs.detailTranNumber)||((this.detailTranNumber!= null)&&this.detailTranNumber.equals(rhs.detailTranNumber))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.contNumber == rhs.contNumber)||((this.contNumber!= null)&&this.contNumber.equals(rhs.contNumber))));
    }

}
