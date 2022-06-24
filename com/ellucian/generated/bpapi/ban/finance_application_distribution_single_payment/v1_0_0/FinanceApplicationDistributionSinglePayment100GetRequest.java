
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
    private String addressCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : amount
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : amount")
    private Double amount;
    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private String holdPassword;
    /**
     * Payment Number
     * <p>
     * Lineage reference object : paymentId
     * 
     */
    @JsonProperty("paymentId")
    @JsonPropertyDescription("Lineage reference object : paymentId")
    private String paymentId;
    /**
     * Document
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("Lineage reference object : documentNumber")
    private String documentNumber;
    /**
     * Lineage reference object : tagOption
     * 
     */
    @JsonProperty("tagOption")
    @JsonPropertyDescription("Lineage reference object : tagOption")
    private Double tagOption;
    /**
     * Invoice Paid Number
     * <p>
     * Lineage reference object : invNumberPaid
     * 
     */
    @JsonProperty("invNumberPaid")
    @JsonPropertyDescription("Lineage reference object : invNumberPaid")
    private String invNumberPaid;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Sequence
     * <p>
     * Lineage reference object : addressSeqno
     * 
     */
    @JsonProperty("addressSeqno")
    @JsonPropertyDescription("Lineage reference object : addressSeqno")
    private Double addressSeqno;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : detailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : detailCode, Lookup lineage reference object : tbbdetc")
    private String detailCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Address Type
     * <p>
     * Lineage reference object : addressCode
     * 
     */
    @JsonProperty("addressCode")
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : addressCode
     * 
     */
    @JsonProperty("addressCode")
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withAddressCode(String addressCode) {
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
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : amount
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withAmount(Double amount) {
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
    public String getHoldPassword() {
        return holdPassword;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public void setHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withHoldPassword(String holdPassword) {
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
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Payment Number
     * <p>
     * Lineage reference object : paymentId
     * 
     */
    @JsonProperty("paymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withPaymentId(String paymentId) {
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
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Lineage reference object : tagOption
     * 
     */
    @JsonProperty("tagOption")
    public Double getTagOption() {
        return tagOption;
    }

    /**
     * Lineage reference object : tagOption
     * 
     */
    @JsonProperty("tagOption")
    public void setTagOption(Double tagOption) {
        this.tagOption = tagOption;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withTagOption(Double tagOption) {
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
    public String getInvNumberPaid() {
        return invNumberPaid;
    }

    /**
     * Invoice Paid Number
     * <p>
     * Lineage reference object : invNumberPaid
     * 
     */
    @JsonProperty("invNumberPaid")
    public void setInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withInvNumberPaid(String invNumberPaid) {
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
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withId(String id) {
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
    public Double getAddressSeqno() {
        return addressSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : addressSeqno
     * 
     */
    @JsonProperty("addressSeqno")
    public void setAddressSeqno(Double addressSeqno) {
        this.addressSeqno = addressSeqno;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withAddressSeqno(Double addressSeqno) {
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
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : detailCode, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public FinanceApplicationDistributionSinglePayment100GetRequest withDetailCode(String detailCode) {
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
