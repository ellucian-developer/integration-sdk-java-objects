
package com.ellucian.generated.bpapi.ban.finance_detail_codes.v1_0_0;

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
    "tbbdectNonAllowChgInd",
    "amount",
    "currCode",
    "typeInd",
    "detailCodeInd",
    "paytCode",
    "detcActiveInd",
    "payhistInd",
    "refundInd",
    "priority",
    "detailCode",
    "receiptInd",
    "prebillPrintInd",
    "likeTermInd",
    "dcatCode",
    "dirdInd",
    "refundableInd",
    "glNosEnterable",
    "taxtCode",
    "effectiveDate",
    "desc",
    "likeScpInd",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbbdetc {

    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdectNonAllowChgInd")
    private String tbbdectNonAllowChgInd;
    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_AMOUNT")
    private Double amount;
    /**
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TYPE_IND")
    private String typeInd;
    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("detailCodeInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE_IND")
    private String detailCodeInd;
    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt")
    private String paytCode;
    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("detcActiveInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETC_ACTIVE_IND")
    private String detcActiveInd;
    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PAYHIST_IND")
    private String payhistInd;
    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_REFUND_IND")
    private String refundInd;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PRIORITY")
    private String priority;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DETAIL_CODE")
    private String detailCode;
    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_RECEIPT_IND")
    private String receiptInd;
    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("prebillPrintInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_PREBILL_PRINT_IND")
    private String prebillPrintInd;
    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("likeTermInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_LIKE_TERM_IND")
    private String likeTermInd;
    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("dcatCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat")
    private String dcatCode;
    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("dirdInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DIRD_IND")
    private String dirdInd;
    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_REFUNDABLE_IND")
    private String refundableInd;
    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("glNosEnterable")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_GL_NOS_ENTERABLE")
    private String glNosEnterable;
    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("taxtCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt")
    private String taxtCode;
    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_DESC")
    private String desc;
    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("likeScpInd")
    private String likeScpInd;
    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdectNonAllowChgInd")
    public String getTbbdectNonAllowChgInd() {
        return tbbdectNonAllowChgInd;
    }

    /**
     * Non-Allowable Charge
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdectNonAllowChgInd")
    public void setTbbdectNonAllowChgInd(String tbbdectNonAllowChgInd) {
        this.tbbdectNonAllowChgInd = tbbdectNonAllowChgInd;
    }

    public Tbbdetc withTbbdectNonAllowChgInd(String tbbdectNonAllowChgInd) {
        this.tbbdectNonAllowChgInd = tbbdectNonAllowChgInd;
        return this;
    }

    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Default Amount
     * <p>
     * Lineage reference object : TBBDETC_AMOUNT
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Tbbdetc withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Lookup lineage reference object : gtvcurr
     * (Required)
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public Tbbdetc withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TBBDETC_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public Tbbdetc withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("detailCodeInd")
    public String getDetailCodeInd() {
        return detailCodeInd;
    }

    /**
     * Grant Type
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE_IND
     * 
     */
    @JsonProperty("detailCodeInd")
    public void setDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
    }

    public Tbbdetc withDetailCodeInd(String detailCodeInd) {
        this.detailCodeInd = detailCodeInd;
        return this;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    public String getPaytCode() {
        return paytCode;
    }

    /**
     * Pay Type
     * <p>
     * Lineage reference object : TBBDETC_PAYT_CODE, Lookup lineage reference object : ttvpayt
     * (Required)
     * 
     */
    @JsonProperty("paytCode")
    public void setPaytCode(String paytCode) {
        this.paytCode = paytCode;
    }

    public Tbbdetc withPaytCode(String paytCode) {
        this.paytCode = paytCode;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("detcActiveInd")
    public String getDetcActiveInd() {
        return detcActiveInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBBDETC_DETC_ACTIVE_IND
     * 
     */
    @JsonProperty("detcActiveInd")
    public void setDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
    }

    public Tbbdetc withDetcActiveInd(String detcActiveInd) {
        this.detcActiveInd = detcActiveInd;
        return this;
    }

    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    public String getPayhistInd() {
        return payhistInd;
    }

    /**
     * Payment History
     * <p>
     * Lineage reference object : TBBDETC_PAYHIST_IND
     * 
     */
    @JsonProperty("payhistInd")
    public void setPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
    }

    public Tbbdetc withPayhistInd(String payhistInd) {
        this.payhistInd = payhistInd;
        return this;
    }

    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    /**
     * Refund Code
     * <p>
     * Lineage reference object : TBBDETC_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public Tbbdetc withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBDETC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Tbbdetc withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBBDETC_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbbdetc withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    public String getReceiptInd() {
        return receiptInd;
    }

    /**
     * Receipt
     * <p>
     * Lineage reference object : TBBDETC_RECEIPT_IND
     * 
     */
    @JsonProperty("receiptInd")
    public void setReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
    }

    public Tbbdetc withReceiptInd(String receiptInd) {
        this.receiptInd = receiptInd;
        return this;
    }

    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("prebillPrintInd")
    public String getPrebillPrintInd() {
        return prebillPrintInd;
    }

    /**
     * Exclude Invoice Print
     * <p>
     * Lineage reference object : TBBDETC_PREBILL_PRINT_IND
     * 
     */
    @JsonProperty("prebillPrintInd")
    public void setPrebillPrintInd(String prebillPrintInd) {
        this.prebillPrintInd = prebillPrintInd;
    }

    public Tbbdetc withPrebillPrintInd(String prebillPrintInd) {
        this.prebillPrintInd = prebillPrintInd;
        return this;
    }

    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("likeTermInd")
    public String getLikeTermInd() {
        return likeTermInd;
    }

    /**
     * Like Term
     * <p>
     * Lineage reference object : TBBDETC_LIKE_TERM_IND
     * 
     */
    @JsonProperty("likeTermInd")
    public void setLikeTermInd(String likeTermInd) {
        this.likeTermInd = likeTermInd;
    }

    public Tbbdetc withLikeTermInd(String likeTermInd) {
        this.likeTermInd = likeTermInd;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("dcatCode")
    public String getDcatCode() {
        return dcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBBDETC_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * (Required)
     * 
     */
    @JsonProperty("dcatCode")
    public void setDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
    }

    public Tbbdetc withDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
        return this;
    }

    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("dirdInd")
    public String getDirdInd() {
        return dirdInd;
    }

    /**
     * Direct Deposit
     * <p>
     * Lineage reference object : TBBDETC_DIRD_IND
     * 
     */
    @JsonProperty("dirdInd")
    public void setDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
    }

    public Tbbdetc withDirdInd(String dirdInd) {
        this.dirdInd = dirdInd;
        return this;
    }

    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    public String getRefundableInd() {
        return refundableInd;
    }

    /**
     * Refundable
     * <p>
     * Lineage reference object : TBBDETC_REFUNDABLE_IND
     * 
     */
    @JsonProperty("refundableInd")
    public void setRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
    }

    public Tbbdetc withRefundableInd(String refundableInd) {
        this.refundableInd = refundableInd;
        return this;
    }

    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("glNosEnterable")
    public String getGlNosEnterable() {
        return glNosEnterable;
    }

    /**
     * GL Enterable
     * <p>
     * Lineage reference object : TBBDETC_GL_NOS_ENTERABLE
     * 
     */
    @JsonProperty("glNosEnterable")
    public void setGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
    }

    public Tbbdetc withGlNosEnterable(String glNosEnterable) {
        this.glNosEnterable = glNosEnterable;
        return this;
    }

    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("taxtCode")
    public String getTaxtCode() {
        return taxtCode;
    }

    /**
     * Tax Type
     * <p>
     * Lineage reference object : TBBDETC_TAXT_CODE, Lookup lineage reference object : ttvtaxt
     * 
     */
    @JsonProperty("taxtCode")
    public void setTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
    }

    public Tbbdetc withTaxtCode(String taxtCode) {
        this.taxtCode = taxtCode;
        return this;
    }

    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Default Effective Date
     * <p>
     * Lineage reference object : TBBDETC_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Tbbdetc withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Detail Code Description
     * <p>
     * Lineage reference object : TBBDETC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Tbbdetc withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("likeScpInd")
    public String getLikeScpInd() {
        return likeScpInd;
    }

    /**
     * Like Student Centric Period
     * <p>
     * 
     * 
     */
    @JsonProperty("likeScpInd")
    public void setLikeScpInd(String likeScpInd) {
        this.likeScpInd = likeScpInd;
    }

    public Tbbdetc withLikeScpInd(String likeScpInd) {
        this.likeScpInd = likeScpInd;
        return this;
    }

    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Default Term
     * <p>
     * Lineage reference object : TBBDETC_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Tbbdetc withTermCode(String termCode) {
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

    public Tbbdetc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbdetc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbdectNonAllowChgInd");
        sb.append('=');
        sb.append(((this.tbbdectNonAllowChgInd == null)?"<null>":this.tbbdectNonAllowChgInd));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("detailCodeInd");
        sb.append('=');
        sb.append(((this.detailCodeInd == null)?"<null>":this.detailCodeInd));
        sb.append(',');
        sb.append("paytCode");
        sb.append('=');
        sb.append(((this.paytCode == null)?"<null>":this.paytCode));
        sb.append(',');
        sb.append("detcActiveInd");
        sb.append('=');
        sb.append(((this.detcActiveInd == null)?"<null>":this.detcActiveInd));
        sb.append(',');
        sb.append("payhistInd");
        sb.append('=');
        sb.append(((this.payhistInd == null)?"<null>":this.payhistInd));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("receiptInd");
        sb.append('=');
        sb.append(((this.receiptInd == null)?"<null>":this.receiptInd));
        sb.append(',');
        sb.append("prebillPrintInd");
        sb.append('=');
        sb.append(((this.prebillPrintInd == null)?"<null>":this.prebillPrintInd));
        sb.append(',');
        sb.append("likeTermInd");
        sb.append('=');
        sb.append(((this.likeTermInd == null)?"<null>":this.likeTermInd));
        sb.append(',');
        sb.append("dcatCode");
        sb.append('=');
        sb.append(((this.dcatCode == null)?"<null>":this.dcatCode));
        sb.append(',');
        sb.append("dirdInd");
        sb.append('=');
        sb.append(((this.dirdInd == null)?"<null>":this.dirdInd));
        sb.append(',');
        sb.append("refundableInd");
        sb.append('=');
        sb.append(((this.refundableInd == null)?"<null>":this.refundableInd));
        sb.append(',');
        sb.append("glNosEnterable");
        sb.append('=');
        sb.append(((this.glNosEnterable == null)?"<null>":this.glNosEnterable));
        sb.append(',');
        sb.append("taxtCode");
        sb.append('=');
        sb.append(((this.taxtCode == null)?"<null>":this.taxtCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("likeScpInd");
        sb.append('=');
        sb.append(((this.likeScpInd == null)?"<null>":this.likeScpInd));
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
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.detailCodeInd == null)? 0 :this.detailCodeInd.hashCode()));
        result = ((result* 31)+((this.detcActiveInd == null)? 0 :this.detcActiveInd.hashCode()));
        result = ((result* 31)+((this.payhistInd == null)? 0 :this.payhistInd.hashCode()));
        result = ((result* 31)+((this.prebillPrintInd == null)? 0 :this.prebillPrintInd.hashCode()));
        result = ((result* 31)+((this.likeTermInd == null)? 0 :this.likeTermInd.hashCode()));
        result = ((result* 31)+((this.glNosEnterable == null)? 0 :this.glNosEnterable.hashCode()));
        result = ((result* 31)+((this.likeScpInd == null)? 0 :this.likeScpInd.hashCode()));
        result = ((result* 31)+((this.tbbdectNonAllowChgInd == null)? 0 :this.tbbdectNonAllowChgInd.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.paytCode == null)? 0 :this.paytCode.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.receiptInd == null)? 0 :this.receiptInd.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.dirdInd == null)? 0 :this.dirdInd.hashCode()));
        result = ((result* 31)+((this.refundableInd == null)? 0 :this.refundableInd.hashCode()));
        result = ((result* 31)+((this.taxtCode == null)? 0 :this.taxtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        if ((other instanceof Tbbdetc) == false) {
            return false;
        }
        Tbbdetc rhs = ((Tbbdetc) other);
        return (((((((((((((((((((((((((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode)))&&((this.detailCodeInd == rhs.detailCodeInd)||((this.detailCodeInd!= null)&&this.detailCodeInd.equals(rhs.detailCodeInd))))&&((this.detcActiveInd == rhs.detcActiveInd)||((this.detcActiveInd!= null)&&this.detcActiveInd.equals(rhs.detcActiveInd))))&&((this.payhistInd == rhs.payhistInd)||((this.payhistInd!= null)&&this.payhistInd.equals(rhs.payhistInd))))&&((this.prebillPrintInd == rhs.prebillPrintInd)||((this.prebillPrintInd!= null)&&this.prebillPrintInd.equals(rhs.prebillPrintInd))))&&((this.likeTermInd == rhs.likeTermInd)||((this.likeTermInd!= null)&&this.likeTermInd.equals(rhs.likeTermInd))))&&((this.glNosEnterable == rhs.glNosEnterable)||((this.glNosEnterable!= null)&&this.glNosEnterable.equals(rhs.glNosEnterable))))&&((this.likeScpInd == rhs.likeScpInd)||((this.likeScpInd!= null)&&this.likeScpInd.equals(rhs.likeScpInd))))&&((this.tbbdectNonAllowChgInd == rhs.tbbdectNonAllowChgInd)||((this.tbbdectNonAllowChgInd!= null)&&this.tbbdectNonAllowChgInd.equals(rhs.tbbdectNonAllowChgInd))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.paytCode == rhs.paytCode)||((this.paytCode!= null)&&this.paytCode.equals(rhs.paytCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.receiptInd == rhs.receiptInd)||((this.receiptInd!= null)&&this.receiptInd.equals(rhs.receiptInd))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.dirdInd == rhs.dirdInd)||((this.dirdInd!= null)&&this.dirdInd.equals(rhs.dirdInd))))&&((this.refundableInd == rhs.refundableInd)||((this.refundableInd!= null)&&this.refundableInd.equals(rhs.refundableInd))))&&((this.taxtCode == rhs.taxtCode)||((this.taxtCode!= null)&&this.taxtCode.equals(rhs.taxtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
