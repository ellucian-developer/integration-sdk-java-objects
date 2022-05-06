
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
    "addressCode",
    "amount",
    "holdPassword",
    "paymentId",
    "documentNumber",
    "tagOption",
    "invNumberPaid",
    "id",
    "addressSeqno",
    "detailCode"
})
@Generated("jsonschema2pojo")
public class FinanceApplicationDistributionSinglePayment100GetRequest {

    /**
     * Address Type
     * <p>
     * Lineage reference object : addressCode
     * 
     */
    @JsonProperty("addressCode")
    @JsonPropertyDescription("Lineage reference object : addressCode")
    private Object addressCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : amount
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : amount")
    private Object amount;
    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private Object holdPassword;
    /**
     * Payment Number
     * <p>
     * Lineage reference object : paymentId
     * 
     */
    @JsonProperty("paymentId")
    @JsonPropertyDescription("Lineage reference object : paymentId")
    private Object paymentId;
    /**
     * Document
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : documentNumber")
    private Object documentNumber;
    /**
     * Lineage reference object : tagOption
     * 
     */
    @JsonProperty("tagOption")
    @JsonPropertyDescription("Lineage reference object : tagOption")
    private Object tagOption;
    /**
     * Invoice Paid Number
     * <p>
     * Lineage reference object : invNumberPaid
     * 
     */
    @JsonProperty("invNumberPaid")
    @JsonPropertyDescription("Lineage reference object : invNumberPaid")
    private Object invNumberPaid;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Sequence
     * <p>
     * Lineage reference object : addressSeqno
     * 
     */
    @JsonProperty("addressSeqno")
    @JsonPropertyDescription("Lineage reference object : addressSeqno")
    private Object addressSeqno;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : detailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : detailCode, Lookup lineage reference object : tbbdetc")
    private Object detailCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Address Type
     * <p>
     * Lineage reference object : addressCode
     * 
     */
    @JsonProperty("addressCode")
    public Object getAddressCode() {
        return addressCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : addressCode
     * 
     */
    @JsonProperty("addressCode")
    public void setAddressCode(Object addressCode) {
        this.addressCode = addressCode;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withAddressCode(Object addressCode) {
        this.addressCode = addressCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : amount
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : amount
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public Object getHoldPassword() {
        return holdPassword;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public void setHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    /**
     * Payment Number
     * <p>
     * Lineage reference object : paymentId
     * 
     */
    @JsonProperty("paymentId")
    public Object getPaymentId() {
        return paymentId;
    }

    /**
     * Payment Number
     * <p>
     * Lineage reference object : paymentId
     * 
     */
    @JsonProperty("paymentId")
    public void setPaymentId(Object paymentId) {
        this.paymentId = paymentId;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withPaymentId(Object paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public Object getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(Object documentNumber) {
        this.documentNumber = documentNumber;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withDocumentNumber(Object documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Lineage reference object : tagOption
     * 
     */
    @JsonProperty("tagOption")
    public Object getTagOption() {
        return tagOption;
    }

    /**
     * Lineage reference object : tagOption
     * 
     */
    @JsonProperty("tagOption")
    public void setTagOption(Object tagOption) {
        this.tagOption = tagOption;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withTagOption(Object tagOption) {
        this.tagOption = tagOption;
        return this;
    }

    /**
     * Invoice Paid Number
     * <p>
     * Lineage reference object : invNumberPaid
     * 
     */
    @JsonProperty("invNumberPaid")
    public Object getInvNumberPaid() {
        return invNumberPaid;
    }

    /**
     * Invoice Paid Number
     * <p>
     * Lineage reference object : invNumberPaid
     * 
     */
    @JsonProperty("invNumberPaid")
    public void setInvNumberPaid(Object invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withInvNumberPaid(Object invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : addressSeqno
     * 
     */
    @JsonProperty("addressSeqno")
    public Object getAddressSeqno() {
        return addressSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : addressSeqno
     * 
     */
    @JsonProperty("addressSeqno")
    public void setAddressSeqno(Object addressSeqno) {
        this.addressSeqno = addressSeqno;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withAddressSeqno(Object addressSeqno) {
        this.addressSeqno = addressSeqno;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : detailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public Object getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : detailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(Object detailCode) {
        this.detailCode = detailCode;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withDetailCode(Object detailCode) {
        this.detailCode = detailCode;
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

    public FinanceApplicationDistributionSinglePayment100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceApplicationDistributionSinglePayment100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressCode");
        sb.append('=');
        sb.append(((this.addressCode == null)?"<null>":this.addressCode));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("tagOption");
        sb.append('=');
        sb.append(((this.tagOption == null)?"<null>":this.tagOption));
        sb.append(',');
        sb.append("invNumberPaid");
        sb.append('=');
        sb.append(((this.invNumberPaid == null)?"<null>":this.invNumberPaid));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("addressSeqno");
        sb.append('=');
        sb.append(((this.addressSeqno == null)?"<null>":this.addressSeqno));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
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
        if ((other instanceof FinanceApplicationDistributionSinglePayment100GetRequest) == false) {
            return false;
        }
        FinanceApplicationDistributionSinglePayment100GetRequest rhs = ((FinanceApplicationDistributionSinglePayment100GetRequest) other);
        return ((((((((((((this.addressCode == rhs.addressCode)||((this.addressCode!= null)&&this.addressCode.equals(rhs.addressCode)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.tagOption == rhs.tagOption)||((this.tagOption!= null)&&this.tagOption.equals(rhs.tagOption))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.addressSeqno == rhs.addressSeqno)||((this.addressSeqno!= null)&&this.addressSeqno.equals(rhs.addressSeqno))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))));
    }

}
