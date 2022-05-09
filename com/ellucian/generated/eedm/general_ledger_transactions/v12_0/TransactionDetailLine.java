
package com.ellucian.generated.eedm.general_ledger_transactions.v12_0;

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
    "amount",
    "budgetOverride",
    "submittedBy",
    "budgetPeriod",
    "giftUnits",
    "encumbrance"
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
     * Budget Override
     * <p>
     * An indication if the budget was overridden or not.
     * 
     */
    @JsonProperty("budgetOverride")
    @JsonPropertyDescription("An indication if the budget was overridden or not.")
    private Object budgetOverride;
    /**
     * Submitted By
     * <p>
     * The person submitting the general ledger transaction.
     * 
     */
    @JsonProperty("submittedBy")
    @JsonPropertyDescription("The person submitting the general ledger transaction.")
    private Object submittedBy;
    /**
     * Budget Period
     * <p>
     * The budget period associated with the transaction.
     * 
     */
    @JsonProperty("budgetPeriod")
    @JsonPropertyDescription("The budget period associated with the transaction.")
    private Object budgetPeriod;
    /**
     * Gift Units
     * <p>
     * The number of gift units associated with the transaction.
     * 
     */
    @JsonProperty("giftUnits")
    @JsonPropertyDescription("The number of gift units associated with the transaction.")
    private Object giftUnits;
    /**
     * Encumbrance
     * <p>
     * The encumbrance associated with this transaction.
     * 
     */
    @JsonProperty("encumbrance")
    @JsonPropertyDescription("The encumbrance associated with this transaction.")
    private Encumbrance encumbrance;

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

    /**
     * Budget Override
     * <p>
     * An indication if the budget was overridden or not.
     * 
     */
    @JsonProperty("budgetOverride")
    public Object getBudgetOverride() {
        return budgetOverride;
    }

    /**
     * Budget Override
     * <p>
     * An indication if the budget was overridden or not.
     * 
     */
    @JsonProperty("budgetOverride")
    public void setBudgetOverride(Object budgetOverride) {
        this.budgetOverride = budgetOverride;
    }

    public TransactionDetailLine withBudgetOverride(Object budgetOverride) {
        this.budgetOverride = budgetOverride;
        return this;
    }

    /**
     * Submitted By
     * <p>
     * The person submitting the general ledger transaction.
     * 
     */
    @JsonProperty("submittedBy")
    public Object getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Submitted By
     * <p>
     * The person submitting the general ledger transaction.
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
     * Budget Period
     * <p>
     * The budget period associated with the transaction.
     * 
     */
    @JsonProperty("budgetPeriod")
    public Object getBudgetPeriod() {
        return budgetPeriod;
    }

    /**
     * Budget Period
     * <p>
     * The budget period associated with the transaction.
     * 
     */
    @JsonProperty("budgetPeriod")
    public void setBudgetPeriod(Object budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
    }

    public TransactionDetailLine withBudgetPeriod(Object budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
        return this;
    }

    /**
     * Gift Units
     * <p>
     * The number of gift units associated with the transaction.
     * 
     */
    @JsonProperty("giftUnits")
    public Object getGiftUnits() {
        return giftUnits;
    }

    /**
     * Gift Units
     * <p>
     * The number of gift units associated with the transaction.
     * 
     */
    @JsonProperty("giftUnits")
    public void setGiftUnits(Object giftUnits) {
        this.giftUnits = giftUnits;
    }

    public TransactionDetailLine withGiftUnits(Object giftUnits) {
        this.giftUnits = giftUnits;
        return this;
    }

    /**
     * Encumbrance
     * <p>
     * The encumbrance associated with this transaction.
     * 
     */
    @JsonProperty("encumbrance")
    public Encumbrance getEncumbrance() {
        return encumbrance;
    }

    /**
     * Encumbrance
     * <p>
     * The encumbrance associated with this transaction.
     * 
     */
    @JsonProperty("encumbrance")
    public void setEncumbrance(Encumbrance encumbrance) {
        this.encumbrance = encumbrance;
    }

    public TransactionDetailLine withEncumbrance(Encumbrance encumbrance) {
        this.encumbrance = encumbrance;
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
        sb.append("budgetOverride");
        sb.append('=');
        sb.append(((this.budgetOverride == null)?"<null>":this.budgetOverride));
        sb.append(',');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
        sb.append(',');
        sb.append("budgetPeriod");
        sb.append('=');
        sb.append(((this.budgetPeriod == null)?"<null>":this.budgetPeriod));
        sb.append(',');
        sb.append("giftUnits");
        sb.append('=');
        sb.append(((this.giftUnits == null)?"<null>":this.giftUnits));
        sb.append(',');
        sb.append("encumbrance");
        sb.append('=');
        sb.append(((this.encumbrance == null)?"<null>":this.encumbrance));
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
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.budgetPeriod == null)? 0 :this.budgetPeriod.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.giftUnits == null)? 0 :this.giftUnits.hashCode()));
        result = ((result* 31)+((this.budgetOverride == null)? 0 :this.budgetOverride.hashCode()));
        result = ((result* 31)+((this.encumbrance == null)? 0 :this.encumbrance.hashCode()));
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
        return (((((((((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.budgetPeriod == rhs.budgetPeriod)||((this.budgetPeriod!= null)&&this.budgetPeriod.equals(rhs.budgetPeriod))))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.giftUnits == rhs.giftUnits)||((this.giftUnits!= null)&&this.giftUnits.equals(rhs.giftUnits))))&&((this.budgetOverride == rhs.budgetOverride)||((this.budgetOverride!= null)&&this.budgetOverride.equals(rhs.budgetOverride))))&&((this.encumbrance == rhs.encumbrance)||((this.encumbrance!= null)&&this.encumbrance.equals(rhs.encumbrance))));
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
