
package com.ellucian.generated.bpapi.ban.finance_application_distribution_single_payment.v1_0_0;

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
    "id",
    "amount",
    "addressCode",
    "detailCode",
    "tagOption",
    "addressSeqno",
    "invNumberPaid",
    "paymentId",
    "documentNumber",
    "holdPassword"
})
@Generated("jsonschema2pojo")
public class FinanceApplicationDistributionSinglePayment100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("addressCode")
    private String addressCode;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String detailCode;
    @JsonProperty("tagOption")
    private String tagOption;
    @JsonProperty("addressSeqno")
    private String addressSeqno;
    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_INV_NUMBER_PAID")
    private String invNumberPaid;
    @JsonProperty("paymentId")
    private String paymentId;
    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : TBRACCD_DOCUMENT_NUMBER")
    private String documentNumber;
    @JsonProperty("holdPassword")
    private String holdPassword;
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

    public FinanceApplicationDistributionSinglePayment100QapiPost withId(String id) {
        this.id = id;
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

    public FinanceApplicationDistributionSinglePayment100QapiPost withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    @JsonProperty("addressCode")
    public String getAddressCode() {
        return addressCode;
    }

    @JsonProperty("addressCode")
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public FinanceApplicationDistributionSinglePayment100QapiPost withAddressCode(String addressCode) {
        this.addressCode = addressCode;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRACCD_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public FinanceApplicationDistributionSinglePayment100QapiPost withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    @JsonProperty("tagOption")
    public String getTagOption() {
        return tagOption;
    }

    @JsonProperty("tagOption")
    public void setTagOption(String tagOption) {
        this.tagOption = tagOption;
    }

    public FinanceApplicationDistributionSinglePayment100QapiPost withTagOption(String tagOption) {
        this.tagOption = tagOption;
        return this;
    }

    @JsonProperty("addressSeqno")
    public String getAddressSeqno() {
        return addressSeqno;
    }

    @JsonProperty("addressSeqno")
    public void setAddressSeqno(String addressSeqno) {
        this.addressSeqno = addressSeqno;
    }

    public FinanceApplicationDistributionSinglePayment100QapiPost withAddressSeqno(String addressSeqno) {
        this.addressSeqno = addressSeqno;
        return this;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    public String getInvNumberPaid() {
        return invNumberPaid;
    }

    /**
     * Invoice Number Paid
     * <p>
     * Lineage reference object : TBRACCD_INV_NUMBER_PAID
     * 
     */
    @JsonProperty("invNumberPaid")
    public void setInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
    }

    public FinanceApplicationDistributionSinglePayment100QapiPost withInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
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

    public FinanceApplicationDistributionSinglePayment100QapiPost withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : TBRACCD_DOCUMENT_NUMBER
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public FinanceApplicationDistributionSinglePayment100QapiPost withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    @JsonProperty("holdPassword")
    public String getHoldPassword() {
        return holdPassword;
    }

    @JsonProperty("holdPassword")
    public void setHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
    }

    public FinanceApplicationDistributionSinglePayment100QapiPost withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
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

    public FinanceApplicationDistributionSinglePayment100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceApplicationDistributionSinglePayment100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("addressCode");
        sb.append('=');
        sb.append(((this.addressCode == null)?"<null>":this.addressCode));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("tagOption");
        sb.append('=');
        sb.append(((this.tagOption == null)?"<null>":this.tagOption));
        sb.append(',');
        sb.append("addressSeqno");
        sb.append('=');
        sb.append(((this.addressSeqno == null)?"<null>":this.addressSeqno));
        sb.append(',');
        sb.append("invNumberPaid");
        sb.append('=');
        sb.append(((this.invNumberPaid == null)?"<null>":this.invNumberPaid));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
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
        result = ((result* 31)+((this.addressCode == null)? 0 :this.addressCode.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.tagOption == null)? 0 :this.tagOption.hashCode()));
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.addressSeqno == null)? 0 :this.addressSeqno.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceApplicationDistributionSinglePayment100QapiPost) == false) {
            return false;
        }
        FinanceApplicationDistributionSinglePayment100QapiPost rhs = ((FinanceApplicationDistributionSinglePayment100QapiPost) other);
        return ((((((((((((this.addressCode == rhs.addressCode)||((this.addressCode!= null)&&this.addressCode.equals(rhs.addressCode)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.tagOption == rhs.tagOption)||((this.tagOption!= null)&&this.tagOption.equals(rhs.tagOption))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.addressSeqno == rhs.addressSeqno)||((this.addressSeqno!= null)&&this.addressSeqno.equals(rhs.addressSeqno))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))));
    }

}
