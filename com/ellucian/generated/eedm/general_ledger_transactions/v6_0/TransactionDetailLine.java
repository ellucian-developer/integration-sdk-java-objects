
package com.ellucian.generated.eedm.general_ledger_transactions.v6_0;

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
    "sequenceNumber",
    "accountingString",
    "description",
    "type",
    "amount"
})
@Generated("jsonschema2pojo")
public class TransactionDetailLine {

    /**
     * Sequence Number
     * <p>
     * An optional tracking number for the detailed accounting line.
     * 
     */
    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("An optional tracking number for the detailed accounting line.")
    private Object sequenceNumber;
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
     * Description
     * <p>
     * The description of the detailed accounting line.
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the detailed accounting line.")
    private String description;
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
     * Sequence Number
     * <p>
     * An optional tracking number for the detailed accounting line.
     * 
     */
    @JsonProperty("sequenceNumber")
    public Object getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sequence Number
     * <p>
     * An optional tracking number for the detailed accounting line.
     * 
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Object sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public TransactionDetailLine withSequenceNumber(Object sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

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
     * Description
     * <p>
     * The description of the detailed accounting line.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the detailed accounting line.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public TransactionDetailLine withDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionDetailLine.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
        sb.append(',');
        sb.append("accountingString");
        sb.append('=');
        sb.append(((this.accountingString == null)?"<null>":this.accountingString));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
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
        return ((((((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber)))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
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
