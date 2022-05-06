
package com.ellucian.generated.bpapi.ban.student_detail_codes.v1_0_0;

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
    "detcActiveInd",
    "tbdcInd",
    "abdcInd",
    "likeTermInd",
    "likeAidyInd",
    "likePeriodInd",
    "likeScpInd",
    "glNosEnterable",
    "paytCode",
    "taxtCode",
    "tivInd",
    "instChgInd",
    "tbbdectNonAllowChgInd",
    "prebillPrintInd",
    "payhistInd",
    "taxProfile",
    "taxMethod",
    "amount",
    "termCode",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class StudentDetailCodes100QapiPost {

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_DETAIL_CODE")
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
    @JsonProperty("detcActiveInd")
    private String detcActiveInd;
    /**
     * Term-based
     * <p>
     * Lineage reference object : TBBEACT_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_TBDC_IND")
    private String tbdcInd;
    /**
     * Aid Year-based
     * <p>
     * Lineage reference object : TBBEACT_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    @JsonPropertyDescription("Lineage reference object : TBBEACT_ABDC_IND")
    private String abdcInd;
    @JsonProperty("likeTermInd")
    private String likeTermInd;
    @JsonProperty("likeAidyInd")
    private String likeAidyInd;
    @JsonProperty("likePeriodInd")
    private String likePeriodInd;
    @JsonProperty("likeScpInd")
    private String likeScpInd;
    @JsonProperty("glNosEnterable")
    private String glNosEnterable;
    @JsonProperty("paytCode")
    private String paytCode;
    @JsonProperty("taxtCode")
    private String taxtCode;
    @JsonProperty("tivInd")
    private String tivInd;
    @JsonProperty("instChgInd")
    private String instChgInd;
    @JsonProperty("tbbdectNonAllowChgInd")
    private String tbbdectNonAllowChgInd;
    @JsonProperty("prebillPrintInd")
    private String prebillPrintInd;
    @JsonProperty("payhistInd")
    private String payhistInd;
    @JsonProperty("taxProfile")
    private String taxProfile;
    @JsonProperty("taxMethod")
    private String taxMethod;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBEACT_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public StudentDetailCodes100QapiPost withDetailCode(String detailCode) {
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

    public StudentDetailCodes100QapiPost withDesc(String desc) {
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

    public StudentDetailCodes100QapiPost withTypeInd(String typeInd) {
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

    public StudentDetailCodes100QapiPost withDcatCode(String dcatCode) {
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

    public StudentDetailCodes100QapiPost withDetailCodeInd(String detailCodeInd) {
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

    public StudentDetailCodes100QapiPost withPriority(String priority) {
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

    public StudentDetailCodes100QapiPost withRefundInd(String refundInd) {
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

    public StudentDetailCodes100QapiPost withCurrCode(String currCode) {
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

    public StudentDetailCodes100QapiPost withDirdInd(String dirdInd) {
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

    public StudentDetailCodes100QapiPost withRefundableInd(String refundableInd) {
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

    public StudentDetailCodes100QapiPost withReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
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

    public StudentDetailCodes100QapiPost withDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
        return this;
    }

    /**
     * Term-based
     * <p>
     * Lineage reference object : TBBEACT_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    public String getTbdcInd() {
        return tbdcInd;
    }

    /**
     * Term-based
     * <p>
     * Lineage reference object : TBBEACT_TBDC_IND
     * 
     */
    @JsonProperty("tbdcInd")
    public void setTbdcInd(String tbdcInd) {
        this.tbdcInd = tbdcInd;
    }

    public StudentDetailCodes100QapiPost withTbdcInd(String tbdcInd) {
        this.tbdcInd = tbdcInd;
        return this;
    }

    /**
     * Aid Year-based
     * <p>
     * Lineage reference object : TBBEACT_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    public String getAbdcInd() {
        return abdcInd;
    }

    /**
     * Aid Year-based
     * <p>
     * Lineage reference object : TBBEACT_ABDC_IND
     * 
     */
    @JsonProperty("abdcInd")
    public void setAbdcInd(String abdcInd) {
        this.abdcInd = abdcInd;
    }

    public StudentDetailCodes100QapiPost withAbdcInd(String abdcInd) {
        this.abdcInd = abdcInd;
        return this;
    }

    @JsonProperty("likeTermInd")
    public String getLikeTermInd() {
        return likeTermInd;
    }

    @JsonProperty("likeTermInd")
    public void setLikeTermInd(String likeTermInd) {
        this.likeTermInd = likeTermInd;
    }

    public StudentDetailCodes100QapiPost withLikeTermInd(String likeTermInd) {
        this.likeTermInd = likeTermInd;
        return this;
    }

    @JsonProperty("likeAidyInd")
    public String getLikeAidyInd() {
        return likeAidyInd;
    }

    @JsonProperty("likeAidyInd")
    public void setLikeAidyInd(String likeAidyInd) {
        this.likeAidyInd = likeAidyInd;
    }

    public StudentDetailCodes100QapiPost withLikeAidyInd(String likeAidyInd) {
        this.likeAidyInd = likeAidyInd;
        return this;
    }

    @JsonProperty("likePeriodInd")
    public String getLikePeriodInd() {
        return likePeriodInd;
    }

    @JsonProperty("likePeriodInd")
    public void setLikePeriodInd(String likePeriodInd) {
        this.likePeriodInd = likePeriodInd;
    }

    public StudentDetailCodes100QapiPost withLikePeriodInd(String likePeriodInd) {
        this.likePeriodInd = likePeriodInd;
        return this;
    }

    @JsonProperty("likeScpInd")
    public String getLikeScpInd() {
        return likeScpInd;
    }

    @JsonProperty("likeScpInd")
    public void setLikeScpInd(String likeScpInd) {
        this.likeScpInd = likeScpInd;
    }

    public StudentDetailCodes100QapiPost withLikeScpInd(String likeScpInd) {
        this.likeScpInd = likeScpInd;
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

    public StudentDetailCodes100QapiPost withGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
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

    public StudentDetailCodes100QapiPost withPaytCode(String paytCode) {
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

    public StudentDetailCodes100QapiPost withTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
        return this;
    }

    @JsonProperty("tivInd")
    public String getTivInd() {
        return tivInd;
    }

    @JsonProperty("tivInd")
    public void setTivInd(String tivInd) {
        this.tivInd = tivInd;
    }

    public StudentDetailCodes100QapiPost withTivInd(String tivInd) {
        this.tivInd = tivInd;
        return this;
    }

    @JsonProperty("instChgInd")
    public String getInstChgInd() {
        return instChgInd;
    }

    @JsonProperty("instChgInd")
    public void setInstChgInd(String instChgInd) {
        this.instChgInd = instChgInd;
    }

    public StudentDetailCodes100QapiPost withInstChgInd(String instChgInd) {
        this.instChgInd = instChgInd;
        return this;
    }

    @JsonProperty("tbbdectNonAllowChgInd")
    public String getTbbdectNonAllowChgInd() {
        return tbbdectNonAllowChgInd;
    }

    @JsonProperty("tbbdectNonAllowChgInd")
    public void setTbbdectNonAllowChgInd(String tbbdectNonAllowChgInd) {
        this.tbbdectNonAllowChgInd = tbbdectNonAllowChgInd;
    }

    public StudentDetailCodes100QapiPost withTbbdectNonAllowChgInd(String tbbdectNonAllowChgInd) {
        this.tbbdectNonAllowChgInd = tbbdectNonAllowChgInd;
        return this;
    }

    @JsonProperty("prebillPrintInd")
    public String getPrebillPrintInd() {
        return prebillPrintInd;
    }

    @JsonProperty("prebillPrintInd")
    public void setPrebillPrintInd(String prebillPrintInd) {
        this.prebillPrintInd = prebillPrintInd;
    }

    public StudentDetailCodes100QapiPost withPrebillPrintInd(String prebillPrintInd) {
        this.prebillPrintInd = prebillPrintInd;
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

    public StudentDetailCodes100QapiPost withPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
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

    public StudentDetailCodes100QapiPost withTaxProfile(String taxProfile) {
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

    public StudentDetailCodes100QapiPost withTaxMethod(String taxMethod) {
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

    public StudentDetailCodes100QapiPost withAmount(String amount) {
        this.amount = amount;
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

    public StudentDetailCodes100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
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

    public StudentDetailCodes100QapiPost withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public StudentDetailCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentDetailCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("detcActiveInd");
        sb.append('=');
        sb.append(((this.detcActiveInd == null)?"<null>":this.detcActiveInd));
        sb.append(',');
        sb.append("tbdcInd");
        sb.append('=');
        sb.append(((this.tbdcInd == null)?"<null>":this.tbdcInd));
        sb.append(',');
        sb.append("abdcInd");
        sb.append('=');
        sb.append(((this.abdcInd == null)?"<null>":this.abdcInd));
        sb.append(',');
        sb.append("likeTermInd");
        sb.append('=');
        sb.append(((this.likeTermInd == null)?"<null>":this.likeTermInd));
        sb.append(',');
        sb.append("likeAidyInd");
        sb.append('=');
        sb.append(((this.likeAidyInd == null)?"<null>":this.likeAidyInd));
        sb.append(',');
        sb.append("likePeriodInd");
        sb.append('=');
        sb.append(((this.likePeriodInd == null)?"<null>":this.likePeriodInd));
        sb.append(',');
        sb.append("likeScpInd");
        sb.append('=');
        sb.append(((this.likeScpInd == null)?"<null>":this.likeScpInd));
        sb.append(',');
        sb.append("glNosEnterable");
        sb.append('=');
        sb.append(((this.glNosEnterable == null)?"<null>":this.glNosEnterable));
        sb.append(',');
        sb.append("paytCode");
        sb.append('=');
        sb.append(((this.paytCode == null)?"<null>":this.paytCode));
        sb.append(',');
        sb.append("taxtCode");
        sb.append('=');
        sb.append(((this.taxtCode == null)?"<null>":this.taxtCode));
        sb.append(',');
        sb.append("tivInd");
        sb.append('=');
        sb.append(((this.tivInd == null)?"<null>":this.tivInd));
        sb.append(',');
        sb.append("instChgInd");
        sb.append('=');
        sb.append(((this.instChgInd == null)?"<null>":this.instChgInd));
        sb.append(',');
        sb.append("tbbdectNonAllowChgInd");
        sb.append('=');
        sb.append(((this.tbbdectNonAllowChgInd == null)?"<null>":this.tbbdectNonAllowChgInd));
        sb.append(',');
        sb.append("prebillPrintInd");
        sb.append('=');
        sb.append(((this.prebillPrintInd == null)?"<null>":this.prebillPrintInd));
        sb.append(',');
        sb.append("payhistInd");
        sb.append('=');
        sb.append(((this.payhistInd == null)?"<null>":this.payhistInd));
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
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.detailCodeInd == null)? 0 :this.detailCodeInd.hashCode()));
        result = ((result* 31)+((this.taxMethod == null)? 0 :this.taxMethod.hashCode()));
        result = ((result* 31)+((this.detcActiveInd == null)? 0 :this.detcActiveInd.hashCode()));
        result = ((result* 31)+((this.payhistInd == null)? 0 :this.payhistInd.hashCode()));
        result = ((result* 31)+((this.tivInd == null)? 0 :this.tivInd.hashCode()));
        result = ((result* 31)+((this.prebillPrintInd == null)? 0 :this.prebillPrintInd.hashCode()));
        result = ((result* 31)+((this.tbdcInd == null)? 0 :this.tbdcInd.hashCode()));
        result = ((result* 31)+((this.likeTermInd == null)? 0 :this.likeTermInd.hashCode()));
        result = ((result* 31)+((this.glNosEnterable == null)? 0 :this.glNosEnterable.hashCode()));
        result = ((result* 31)+((this.likeScpInd == null)? 0 :this.likeScpInd.hashCode()));
        result = ((result* 31)+((this.tbbdectNonAllowChgInd == null)? 0 :this.tbbdectNonAllowChgInd.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.paytCode == null)? 0 :this.paytCode.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.likeAidyInd == null)? 0 :this.likeAidyInd.hashCode()));
        result = ((result* 31)+((this.likePeriodInd == null)? 0 :this.likePeriodInd.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.taxProfile == null)? 0 :this.taxProfile.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.dirdInd == null)? 0 :this.dirdInd.hashCode()));
        result = ((result* 31)+((this.refundableInd == null)? 0 :this.refundableInd.hashCode()));
        result = ((result* 31)+((this.abdcInd == null)? 0 :this.abdcInd.hashCode()));
        result = ((result* 31)+((this.taxtCode == null)? 0 :this.taxtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.instChgInd == null)? 0 :this.instChgInd.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentDetailCodes100QapiPost) == false) {
            return false;
        }
        StudentDetailCodes100QapiPost rhs = ((StudentDetailCodes100QapiPost) other);
        return (((((((((((((((((((((((((((((((((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode)))&&((this.detailCodeInd == rhs.detailCodeInd)||((this.detailCodeInd!= null)&&this.detailCodeInd.equals(rhs.detailCodeInd))))&&((this.taxMethod == rhs.taxMethod)||((this.taxMethod!= null)&&this.taxMethod.equals(rhs.taxMethod))))&&((this.detcActiveInd == rhs.detcActiveInd)||((this.detcActiveInd!= null)&&this.detcActiveInd.equals(rhs.detcActiveInd))))&&((this.payhistInd == rhs.payhistInd)||((this.payhistInd!= null)&&this.payhistInd.equals(rhs.payhistInd))))&&((this.tivInd == rhs.tivInd)||((this.tivInd!= null)&&this.tivInd.equals(rhs.tivInd))))&&((this.prebillPrintInd == rhs.prebillPrintInd)||((this.prebillPrintInd!= null)&&this.prebillPrintInd.equals(rhs.prebillPrintInd))))&&((this.tbdcInd == rhs.tbdcInd)||((this.tbdcInd!= null)&&this.tbdcInd.equals(rhs.tbdcInd))))&&((this.likeTermInd == rhs.likeTermInd)||((this.likeTermInd!= null)&&this.likeTermInd.equals(rhs.likeTermInd))))&&((this.glNosEnterable == rhs.glNosEnterable)||((this.glNosEnterable!= null)&&this.glNosEnterable.equals(rhs.glNosEnterable))))&&((this.likeScpInd == rhs.likeScpInd)||((this.likeScpInd!= null)&&this.likeScpInd.equals(rhs.likeScpInd))))&&((this.tbbdectNonAllowChgInd == rhs.tbbdectNonAllowChgInd)||((this.tbbdectNonAllowChgInd!= null)&&this.tbbdectNonAllowChgInd.equals(rhs.tbbdectNonAllowChgInd))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.paytCode == rhs.paytCode)||((this.paytCode!= null)&&this.paytCode.equals(rhs.paytCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.likeAidyInd == rhs.likeAidyInd)||((this.likeAidyInd!= null)&&this.likeAidyInd.equals(rhs.likeAidyInd))))&&((this.likePeriodInd == rhs.likePeriodInd)||((this.likePeriodInd!= null)&&this.likePeriodInd.equals(rhs.likePeriodInd))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.taxProfile == rhs.taxProfile)||((this.taxProfile!= null)&&this.taxProfile.equals(rhs.taxProfile))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.dirdInd == rhs.dirdInd)||((this.dirdInd!= null)&&this.dirdInd.equals(rhs.dirdInd))))&&((this.refundableInd == rhs.refundableInd)||((this.refundableInd!= null)&&this.refundableInd.equals(rhs.refundableInd))))&&((this.abdcInd == rhs.abdcInd)||((this.abdcInd!= null)&&this.abdcInd.equals(rhs.abdcInd))))&&((this.taxtCode == rhs.taxtCode)||((this.taxtCode!= null)&&this.taxtCode.equals(rhs.taxtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.instChgInd == rhs.instChgInd)||((this.instChgInd!= null)&&this.instChgInd.equals(rhs.instChgInd))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
