
package com.ellucian.generated.eedm.account_funds_available_transactions.v11_1_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountingString",
    "fundsAvailable",
    "type",
    "amount",
    "submittedBy",
    "referenceDocument"
})
@Generated("jsonschema2pojo")
public class TransactionDetailLine {

    /**
     * Accounting String
     * <p>
     * The accounting string associated with the transaction detail line.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    @JsonPropertyDescription("The accounting string associated with the transaction detail line.")
    private String accountingString;
    /**
     * Funds Available
     * <p>
     * Status of the availability of funds.
     * 
     */
    @JsonProperty("fundsAvailable")
    @JsonPropertyDescription("Status of the availability of funds.")
    private Object fundsAvailable;
    /**
     * Type
     * <p>
     * The type of detailed accounting line (credit/debit).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of detailed accounting line (credit/debit).")
    private TransactionDetailLine.Type type;
    /**
     * Amount
     * <p>
     * The amount of the credit or debit.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount of the credit or debit.")
    private Amount amount;
    /**
     * Submitted By
     * <p>
     * The person who made the submit request.
     * 
     */
    @JsonProperty("submittedBy")
    @JsonPropertyDescription("The person who made the submit request.")
    private Object submittedBy;
    /**
     * Reference Document
     * <p>
     * The reference document that may be liquidated or adjusted with the account funds available transaction request.
     * 
     */
    @JsonProperty("referenceDocument")
    @JsonPropertyDescription("The reference document that may be liquidated or adjusted with the account funds available transaction request.")
    private Object referenceDocument;

    /**
     * Accounting String
     * <p>
     * The accounting string associated with the transaction detail line.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    public String getAccountingString() {
        return accountingString;
    }

    /**
     * Accounting String
     * <p>
     * The accounting string associated with the transaction detail line.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    public void setAccountingString(String accountingString) {
        this.accountingString = accountingString;
    }

    public TransactionDetailLine withAccountingString(String accountingString) {
        this.accountingString = accountingString;
        return this;
    }

    /**
     * Funds Available
     * <p>
     * Status of the availability of funds.
     * 
     */
    @JsonProperty("fundsAvailable")
    public Object getFundsAvailable() {
        return fundsAvailable;
    }

    /**
     * Funds Available
     * <p>
     * Status of the availability of funds.
     * 
     */
    @JsonProperty("fundsAvailable")
    public void setFundsAvailable(Object fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    public TransactionDetailLine withFundsAvailable(Object fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of detailed accounting line (credit/debit).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public TransactionDetailLine.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of detailed accounting line (credit/debit).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(TransactionDetailLine.Type type) {
        this.type = type;
    }

    public TransactionDetailLine withType(TransactionDetailLine.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount of the credit or debit.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount of the credit or debit.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public TransactionDetailLine withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Submitted By
     * <p>
     * The person who made the submit request.
     * 
     */
    @JsonProperty("submittedBy")
    public Object getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Submitted By
     * <p>
     * The person who made the submit request.
     * 
     */
    @JsonProperty("submittedBy")
    public void setSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
    }

    public TransactionDetailLine withSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Reference Document
     * <p>
     * The reference document that may be liquidated or adjusted with the account funds available transaction request.
     * 
     */
    @JsonProperty("referenceDocument")
    public Object getReferenceDocument() {
        return referenceDocument;
    }

    /**
     * Reference Document
     * <p>
     * The reference document that may be liquidated or adjusted with the account funds available transaction request.
     * 
     */
    @JsonProperty("referenceDocument")
    public void setReferenceDocument(Object referenceDocument) {
        this.referenceDocument = referenceDocument;
    }

    public TransactionDetailLine withReferenceDocument(Object referenceDocument) {
        this.referenceDocument = referenceDocument;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionDetailLine.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountingString");
        sb.append('=');
        sb.append(((this.accountingString == null)?"<null>":this.accountingString));
        sb.append(',');
        sb.append("fundsAvailable");
        sb.append('=');
        sb.append(((this.fundsAvailable == null)?"<null>":this.fundsAvailable));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
        sb.append(',');
        sb.append("referenceDocument");
        sb.append('=');
        sb.append(((this.referenceDocument == null)?"<null>":this.referenceDocument));
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
        result = ((result* 31)+((this.submittedBy == null)? 0 :this.submittedBy.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.fundsAvailable == null)? 0 :this.fundsAvailable.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.referenceDocument == null)? 0 :this.referenceDocument.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionDetailLine) == false) {
            return false;
        }
        TransactionDetailLine rhs = ((TransactionDetailLine) other);
        return (((((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.fundsAvailable == rhs.fundsAvailable)||((this.fundsAvailable!= null)&&this.fundsAvailable.equals(rhs.fundsAvailable))))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.referenceDocument == rhs.referenceDocument)||((this.referenceDocument!= null)&&this.referenceDocument.equals(rhs.referenceDocument))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Type
     * <p>
     * The type of detailed accounting line (credit/debit).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        CREDIT("credit"),
        DEBIT("debit");
        private final String value;
        private final static Map<String, TransactionDetailLine.Type> CONSTANTS = new HashMap<String, TransactionDetailLine.Type>();

        static {
            for (TransactionDetailLine.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static TransactionDetailLine.Type fromValue(String value) {
            TransactionDetailLine.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
