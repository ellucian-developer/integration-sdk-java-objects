
package com.ellucian.generated.bpapi.ban.finance_detail_codes.v1_0_0;

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
    "detailCode",
    "desc",
    "typeInd",
    "dcatCode",
    "detailCodeInd",
    "priority",
    "refundInd",
    "currCode",
    "dirdInd",
    "refundableInd",
    "receiptInd",
    "payhistInd",
    "glNosEnterable",
    "detcActiveInd",
    "paytCode",
    "taxtCode",
    "taxProfile",
    "taxMethod",
    "amount",
    "effectiveDate",
    "tbbdetcDetailCode"
})
@Generated("jsonschema2pojo")
public class FinanceDetailCodes100QapiPost {

    @JsonProperty("detailCode")
    private String detailCode;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("typeInd")
    private String typeInd;
    @JsonProperty("dcatCode")
    private String dcatCode;
    @JsonProperty("detailCodeInd")
    private String detailCodeInd;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("refundInd")
    private String refundInd;
    @JsonProperty("currCode")
    private String currCode;
    @JsonProperty("dirdInd")
    private String dirdInd;
    @JsonProperty("refundableInd")
    private String refundableInd;
    @JsonProperty("receiptInd")
    private String receiptInd;
    @JsonProperty("payhistInd")
    private String payhistInd;
    @JsonProperty("glNosEnterable")
    private String glNosEnterable;
    @JsonProperty("detcActiveInd")
    private String detcActiveInd;
    @JsonProperty("paytCode")
    private String paytCode;
    @JsonProperty("taxtCode")
    private String taxtCode;
    @JsonProperty("taxProfile")
    private String taxProfile;
    @JsonProperty("taxMethod")
    private String taxMethod;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tbbdetcDetailCode")
    private String tbbdetcDetailCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public FinanceDetailCodes100QapiPost withDetailCode(String detailCode) {
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

    public FinanceDetailCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public FinanceDetailCodes100QapiPost withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    @JsonProperty("dcatCode")
    public String getDcatCode() {
        return dcatCode;
    }

    @JsonProperty("dcatCode")
    public void setDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
    }

    public FinanceDetailCodes100QapiPost withDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
        return this;
    }

    @JsonProperty("detailCodeInd")
    public String getDetailCodeInd() {
        return detailCodeInd;
    }

    @JsonProperty("detailCodeInd")
    public void setDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
    }

    public FinanceDetailCodes100QapiPost withDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
        return this;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public FinanceDetailCodes100QapiPost withPriority(String priority) {
        this.priority = priority;
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

    public FinanceDetailCodes100QapiPost withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public FinanceDetailCodes100QapiPost withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    @JsonProperty("dirdInd")
    public String getDirdInd() {
        return dirdInd;
    }

    @JsonProperty("dirdInd")
    public void setDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
    }

    public FinanceDetailCodes100QapiPost withDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
        return this;
    }

    @JsonProperty("refundableInd")
    public String getRefundableInd() {
        return refundableInd;
    }

    @JsonProperty("refundableInd")
    public void setRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
    }

    public FinanceDetailCodes100QapiPost withRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
        return this;
    }

    @JsonProperty("receiptInd")
    public String getReceiptInd() {
        return receiptInd;
    }

    @JsonProperty("receiptInd")
    public void setReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
    }

    public FinanceDetailCodes100QapiPost withReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
        return this;
    }

    @JsonProperty("payhistInd")
    public String getPayhistInd() {
        return payhistInd;
    }

    @JsonProperty("payhistInd")
    public void setPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
    }

    public FinanceDetailCodes100QapiPost withPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
        return this;
    }

    @JsonProperty("glNosEnterable")
    public String getGlNosEnterable() {
        return glNosEnterable;
    }

    @JsonProperty("glNosEnterable")
    public void setGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
    }

    public FinanceDetailCodes100QapiPost withGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
        return this;
    }

    @JsonProperty("detcActiveInd")
    public String getDetcActiveInd() {
        return detcActiveInd;
    }

    @JsonProperty("detcActiveInd")
    public void setDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
    }

    public FinanceDetailCodes100QapiPost withDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
        return this;
    }

    @JsonProperty("paytCode")
    public String getPaytCode() {
        return paytCode;
    }

    @JsonProperty("paytCode")
    public void setPaytCode(String paytCode) {
        this.paytCode = paytCode;
    }

    public FinanceDetailCodes100QapiPost withPaytCode(String paytCode) {
        this.paytCode = paytCode;
        return this;
    }

    @JsonProperty("taxtCode")
    public String getTaxtCode() {
        return taxtCode;
    }

    @JsonProperty("taxtCode")
    public void setTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
    }

    public FinanceDetailCodes100QapiPost withTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
        return this;
    }

    @JsonProperty("taxProfile")
    public String getTaxProfile() {
        return taxProfile;
    }

    @JsonProperty("taxProfile")
    public void setTaxProfile(String taxProfile) {
        this.taxProfile = taxProfile;
    }

    public FinanceDetailCodes100QapiPost withTaxProfile(String taxProfile) {
        this.taxProfile = taxProfile;
        return this;
    }

    @JsonProperty("taxMethod")
    public String getTaxMethod() {
        return taxMethod;
    }

    @JsonProperty("taxMethod")
    public void setTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
    }

    public FinanceDetailCodes100QapiPost withTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
        return this;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public FinanceDetailCodes100QapiPost withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public FinanceDetailCodes100QapiPost withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tbbdetcDetailCode")
    public String getTbbdetcDetailCode() {
        return tbbdetcDetailCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tbbdetcDetailCode")
    public void setTbbdetcDetailCode(String tbbdetcDetailCode) {
        this.tbbdetcDetailCode = tbbdetcDetailCode;
    }

    public FinanceDetailCodes100QapiPost withTbbdetcDetailCode(String tbbdetcDetailCode) {
        this.tbbdetcDetailCode = tbbdetcDetailCode;
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

    public FinanceDetailCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceDetailCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("dcatCode");
        sb.append('=');
        sb.append(((this.dcatCode == null)?"<null>":this.dcatCode));
        sb.append(',');
        sb.append("detailCodeInd");
        sb.append('=');
        sb.append(((this.detailCodeInd == null)?"<null>":this.detailCodeInd));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("dirdInd");
        sb.append('=');
        sb.append(((this.dirdInd == null)?"<null>":this.dirdInd));
        sb.append(',');
        sb.append("refundableInd");
        sb.append('=');
        sb.append(((this.refundableInd == null)?"<null>":this.refundableInd));
        sb.append(',');
        sb.append("receiptInd");
        sb.append('=');
        sb.append(((this.receiptInd == null)?"<null>":this.receiptInd));
        sb.append(',');
        sb.append("payhistInd");
        sb.append('=');
        sb.append(((this.payhistInd == null)?"<null>":this.payhistInd));
        sb.append(',');
        sb.append("glNosEnterable");
        sb.append('=');
        sb.append(((this.glNosEnterable == null)?"<null>":this.glNosEnterable));
        sb.append(',');
        sb.append("detcActiveInd");
        sb.append('=');
        sb.append(((this.detcActiveInd == null)?"<null>":this.detcActiveInd));
        sb.append(',');
        sb.append("paytCode");
        sb.append('=');
        sb.append(((this.paytCode == null)?"<null>":this.paytCode));
        sb.append(',');
        sb.append("taxtCode");
        sb.append('=');
        sb.append(((this.taxtCode == null)?"<null>":this.taxtCode));
        sb.append(',');
        sb.append("taxProfile");
        sb.append('=');
        sb.append(((this.taxProfile == null)?"<null>":this.taxProfile));
        sb.append(',');
        sb.append("taxMethod");
        sb.append('=');
        sb.append(((this.taxMethod == null)?"<null>":this.taxMethod));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("tbbdetcDetailCode");
        sb.append('=');
        sb.append(((this.tbbdetcDetailCode == null)?"<null>":this.tbbdetcDetailCode));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.detailCodeInd == null)? 0 :this.detailCodeInd.hashCode()));
        result = ((result* 31)+((this.paytCode == null)? 0 :this.paytCode.hashCode()));
        result = ((result* 31)+((this.taxMethod == null)? 0 :this.taxMethod.hashCode()));
        result = ((result* 31)+((this.detcActiveInd == null)? 0 :this.detcActiveInd.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.payhistInd == null)? 0 :this.payhistInd.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.taxProfile == null)? 0 :this.taxProfile.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.dirdInd == null)? 0 :this.dirdInd.hashCode()));
        result = ((result* 31)+((this.refundableInd == null)? 0 :this.refundableInd.hashCode()));
        result = ((result* 31)+((this.tbbdetcDetailCode == null)? 0 :this.tbbdetcDetailCode.hashCode()));
        result = ((result* 31)+((this.glNosEnterable == null)? 0 :this.glNosEnterable.hashCode()));
        result = ((result* 31)+((this.taxtCode == null)? 0 :this.taxtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceDetailCodes100QapiPost) == false) {
            return false;
        }
        FinanceDetailCodes100QapiPost rhs = ((FinanceDetailCodes100QapiPost) other);
        return (((((((((((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.detailCodeInd == rhs.detailCodeInd)||((this.detailCodeInd!= null)&&this.detailCodeInd.equals(rhs.detailCodeInd))))&&((this.paytCode == rhs.paytCode)||((this.paytCode!= null)&&this.paytCode.equals(rhs.paytCode))))&&((this.taxMethod == rhs.taxMethod)||((this.taxMethod!= null)&&this.taxMethod.equals(rhs.taxMethod))))&&((this.detcActiveInd == rhs.detcActiveInd)||((this.detcActiveInd!= null)&&this.detcActiveInd.equals(rhs.detcActiveInd))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.payhistInd == rhs.payhistInd)||((this.payhistInd!= null)&&this.payhistInd.equals(rhs.payhistInd))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.taxProfile == rhs.taxProfile)||((this.taxProfile!= null)&&this.taxProfile.equals(rhs.taxProfile))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.dirdInd == rhs.dirdInd)||((this.dirdInd!= null)&&this.dirdInd.equals(rhs.dirdInd))))&&((this.refundableInd == rhs.refundableInd)||((this.refundableInd!= null)&&this.refundableInd.equals(rhs.refundableInd))))&&((this.tbbdetcDetailCode == rhs.tbbdetcDetailCode)||((this.tbbdetcDetailCode!= null)&&this.tbbdetcDetailCode.equals(rhs.tbbdetcDetailCode))))&&((this.glNosEnterable == rhs.glNosEnterable)||((this.glNosEnterable!= null)&&this.glNosEnterable.equals(rhs.glNosEnterable))))&&((this.taxtCode == rhs.taxtCode)||((this.taxtCode!= null)&&this.taxtCode.equals(rhs.taxtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
