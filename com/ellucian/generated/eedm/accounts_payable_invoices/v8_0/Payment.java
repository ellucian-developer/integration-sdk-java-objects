
package com.ellucian.generated.eedm.accounts_payable_invoices.v8_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Payment
 * <p>
 * Information concerning the payment of the invoice.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source",
    "paymentDueOn",
    "directDepositOverride",
    "paymentTerms"
})
@Generated("jsonschema2pojo")
public class Payment {

    /**
     * Source
     * <p>
     * The source account for the payment of the invoice.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source account for the payment of the invoice.")
    private Source source;
    /**
     * Payment Due On
     * <p>
     * The date the invoice payment is due.
     * (Required)
     * 
     */
    @JsonProperty("paymentDueOn")
    @JsonPropertyDescription("The date the invoice payment is due.")
    private String paymentDueOn;
    /**
     * Direct Deposit Override
     * <p>
     * An indication if direct deposit should not be used for the invoice or if the vendor default for direct deposit should be used.
     * 
     */
    @JsonProperty("directDepositOverride")
    @JsonPropertyDescription("An indication if direct deposit should not be used for the invoice or if the vendor default for direct deposit should be used.")
    private Object directDepositOverride;
    /**
     * Payment Terms
     * <p>
     * The vendor payment terms and conditions that are applicable to this invoice.
     * 
     */
    @JsonProperty("paymentTerms")
    @JsonPropertyDescription("The vendor payment terms and conditions that are applicable to this invoice.")
    private Object paymentTerms;

    /**
     * Source
     * <p>
     * The source account for the payment of the invoice.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source account for the payment of the invoice.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    public Payment withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * Payment Due On
     * <p>
     * The date the invoice payment is due.
     * (Required)
     * 
     */
    @JsonProperty("paymentDueOn")
    public String getPaymentDueOn() {
        return paymentDueOn;
    }

    /**
     * Payment Due On
     * <p>
     * The date the invoice payment is due.
     * (Required)
     * 
     */
    @JsonProperty("paymentDueOn")
    public void setPaymentDueOn(String paymentDueOn) {
        this.paymentDueOn = paymentDueOn;
    }

    public Payment withPaymentDueOn(String paymentDueOn) {
        this.paymentDueOn = paymentDueOn;
        return this;
    }

    /**
     * Direct Deposit Override
     * <p>
     * An indication if direct deposit should not be used for the invoice or if the vendor default for direct deposit should be used.
     * 
     */
    @JsonProperty("directDepositOverride")
    public Object getDirectDepositOverride() {
        return directDepositOverride;
    }

    /**
     * Direct Deposit Override
     * <p>
     * An indication if direct deposit should not be used for the invoice or if the vendor default for direct deposit should be used.
     * 
     */
    @JsonProperty("directDepositOverride")
    public void setDirectDepositOverride(Object directDepositOverride) {
        this.directDepositOverride = directDepositOverride;
    }

    public Payment withDirectDepositOverride(Object directDepositOverride) {
        this.directDepositOverride = directDepositOverride;
        return this;
    }

    /**
     * Payment Terms
     * <p>
     * The vendor payment terms and conditions that are applicable to this invoice.
     * 
     */
    @JsonProperty("paymentTerms")
    public Object getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Payment Terms
     * <p>
     * The vendor payment terms and conditions that are applicable to this invoice.
     * 
     */
    @JsonProperty("paymentTerms")
    public void setPaymentTerms(Object paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public Payment withPaymentTerms(Object paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Payment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("paymentDueOn");
        sb.append('=');
        sb.append(((this.paymentDueOn == null)?"<null>":this.paymentDueOn));
        sb.append(',');
        sb.append("directDepositOverride");
        sb.append('=');
        sb.append(((this.directDepositOverride == null)?"<null>":this.directDepositOverride));
        sb.append(',');
        sb.append("paymentTerms");
        sb.append('=');
        sb.append(((this.paymentTerms == null)?"<null>":this.paymentTerms));
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
        result = ((result* 31)+((this.paymentDueOn == null)? 0 :this.paymentDueOn.hashCode()));
        result = ((result* 31)+((this.directDepositOverride == null)? 0 :this.directDepositOverride.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.paymentTerms == null)? 0 :this.paymentTerms.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payment) == false) {
            return false;
        }
        Payment rhs = ((Payment) other);
        return (((((this.paymentDueOn == rhs.paymentDueOn)||((this.paymentDueOn!= null)&&this.paymentDueOn.equals(rhs.paymentDueOn)))&&((this.directDepositOverride == rhs.directDepositOverride)||((this.directDepositOverride!= null)&&this.directDepositOverride.equals(rhs.directDepositOverride))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.paymentTerms == rhs.paymentTerms)||((this.paymentTerms!= null)&&this.paymentTerms.equals(rhs.paymentTerms))));
    }

}
