
package com.ellucian.generated.eedm.payment_transactions.v12_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "document",
    "amount"
})
@Generated("jsonschema2pojo")
public class PaymentsFor {

    /**
     * Document
     * <p>
     * The invoice or refunds for which the payment occurred.
     * 
     */
    @JsonProperty("document")
    @JsonPropertyDescription("The invoice or refunds for which the payment occurred.")
    private Object document;
    /**
     * Amount
     * <p>
     * The amount paid for the invoice or refund.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount paid for the invoice or refund.")
    private Object amount;

    /**
     * Document
     * <p>
     * The invoice or refunds for which the payment occurred.
     * 
     */
    @JsonProperty("document")
    public Object getDocument() {
        return document;
    }

    /**
     * Document
     * <p>
     * The invoice or refunds for which the payment occurred.
     * 
     */
    @JsonProperty("document")
    public void setDocument(Object document) {
        this.document = document;
    }

    public PaymentsFor withDocument(Object document) {
        this.document = document;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount paid for the invoice or refund.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount paid for the invoice or refund.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public PaymentsFor withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentsFor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("document");
        sb.append('=');
        sb.append(((this.document == null)?"<null>":this.document));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        result = ((result* 31)+((this.document == null)? 0 :this.document.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentsFor) == false) {
            return false;
        }
        PaymentsFor rhs = ((PaymentsFor) other);
        return (((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.document == rhs.document)||((this.document!= null)&&this.document.equals(rhs.document))));
    }

}
