
package com.ellucian.generated.eedm.account_funds_available_transactions.v8_0;

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
    "submittedBy"
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
     * (Required)
     * 
     */
    @JsonProperty("fundsAvailable")
    @JsonPropertyDescription("Status of the availability of funds.")
    private TransactionDetailLine.FundsAvailable fundsAvailable;
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
     * (Required)
     * 
     */
    @JsonProperty("fundsAvailable")
    public TransactionDetailLine.FundsAvailable getFundsAvailable() {
        return fundsAvailable;
    }

    /**
     * Funds Available
     * <p>
     * Status of the availability of funds.
     * (Required)
     * 
     */
    @JsonProperty("fundsAvailable")
    public void setFundsAvailable(TransactionDetailLine.FundsAvailable fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    public TransactionDetailLine withFundsAvailable(TransactionDetailLine.FundsAvailable fundsAvailable) {
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
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.fundsAvailable == null)? 0 :this.fundsAvailable.hashCode()));
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
        return ((((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.fundsAvailable == rhs.fundsAvailable)||((this.fundsAvailable!= null)&&this.fundsAvailable.equals(rhs.fundsAvailable))));
    }


    /**
     * Funds Available
     * <p>
     * Status of the availability of funds.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum FundsAvailable {

        AVAILABLE("available"),
        NOT_AVAILABLE("notAvailable"),
        OVERRIDE_AVAILABLE("overrideAvailable"),
        INVALID_ACCOUNTING_STRING("invalidAccountingString"),
        NOT_APPLICABLE("notApplicable");
        private final String value;
        private final static Map<String, TransactionDetailLine.FundsAvailable> CONSTANTS = new HashMap<String, TransactionDetailLine.FundsAvailable>();

        static {
            for (TransactionDetailLine.FundsAvailable c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FundsAvailable(String value) {
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
        public static TransactionDetailLine.FundsAvailable fromValue(String value) {
            TransactionDetailLine.FundsAvailable constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

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
