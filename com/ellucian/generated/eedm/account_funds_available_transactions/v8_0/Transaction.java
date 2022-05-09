
package com.ellucian.generated.eedm.account_funds_available_transactions.v8_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "type",
    "transactionDate",
    "transactionDetailLines",
    "referenceDocument"
})
@Generated("jsonschema2pojo")
public class Transaction {

    /**
     * Type
     * <p>
     * The type of the general ledger transaction (e.g. journal entry, encumbrance, budget).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the general ledger transaction (e.g. journal entry, encumbrance, budget).")
    private Transaction.Type type;
    /**
     * Transaction Date
     * <p>
     * The date on which the transaction is to occur.
     * 
     */
    @JsonProperty("transactionDate")
    @JsonPropertyDescription("The date on which the transaction is to occur.")
    private Object transactionDate;
    /**
     * Transaction Detail Lines
     * <p>
     * The detailed accounting lines associated with the transaction.
     * (Required)
     * 
     */
    @JsonProperty("transactionDetailLines")
    @JsonPropertyDescription("The detailed accounting lines associated with the transaction.")
    private List<TransactionDetailLine> transactionDetailLines = new ArrayList<TransactionDetailLine>();
    /**
     * Reference Document
     * <p>
     * The reference document checked for available funds.
     * 
     */
    @JsonProperty("referenceDocument")
    @JsonPropertyDescription("The reference document checked for available funds.")
    private Object referenceDocument;

    /**
     * Type
     * <p>
     * The type of the general ledger transaction (e.g. journal entry, encumbrance, budget).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Transaction.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the general ledger transaction (e.g. journal entry, encumbrance, budget).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Transaction.Type type) {
        this.type = type;
    }

    public Transaction withType(Transaction.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * The date on which the transaction is to occur.
     * 
     */
    @JsonProperty("transactionDate")
    public Object getTransactionDate() {
        return transactionDate;
    }

    /**
     * Transaction Date
     * <p>
     * The date on which the transaction is to occur.
     * 
     */
    @JsonProperty("transactionDate")
    public void setTransactionDate(Object transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Transaction withTransactionDate(Object transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    /**
     * Transaction Detail Lines
     * <p>
     * The detailed accounting lines associated with the transaction.
     * (Required)
     * 
     */
    @JsonProperty("transactionDetailLines")
    public List<TransactionDetailLine> getTransactionDetailLines() {
        return transactionDetailLines;
    }

    /**
     * Transaction Detail Lines
     * <p>
     * The detailed accounting lines associated with the transaction.
     * (Required)
     * 
     */
    @JsonProperty("transactionDetailLines")
    public void setTransactionDetailLines(List<TransactionDetailLine> transactionDetailLines) {
        this.transactionDetailLines = transactionDetailLines;
    }

    public Transaction withTransactionDetailLines(List<TransactionDetailLine> transactionDetailLines) {
        this.transactionDetailLines = transactionDetailLines;
        return this;
    }

    /**
     * Reference Document
     * <p>
     * The reference document checked for available funds.
     * 
     */
    @JsonProperty("referenceDocument")
    public Object getReferenceDocument() {
        return referenceDocument;
    }

    /**
     * Reference Document
     * <p>
     * The reference document checked for available funds.
     * 
     */
    @JsonProperty("referenceDocument")
    public void setReferenceDocument(Object referenceDocument) {
        this.referenceDocument = referenceDocument;
    }

    public Transaction withReferenceDocument(Object referenceDocument) {
        this.referenceDocument = referenceDocument;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Transaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("transactionDate");
        sb.append('=');
        sb.append(((this.transactionDate == null)?"<null>":this.transactionDate));
        sb.append(',');
        sb.append("transactionDetailLines");
        sb.append('=');
        sb.append(((this.transactionDetailLines == null)?"<null>":this.transactionDetailLines));
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
        result = ((result* 31)+((this.referenceDocument == null)? 0 :this.referenceDocument.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.transactionDate == null)? 0 :this.transactionDate.hashCode()));
        result = ((result* 31)+((this.transactionDetailLines == null)? 0 :this.transactionDetailLines.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transaction) == false) {
            return false;
        }
        Transaction rhs = ((Transaction) other);
        return (((((this.referenceDocument == rhs.referenceDocument)||((this.referenceDocument!= null)&&this.referenceDocument.equals(rhs.referenceDocument)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.transactionDate == rhs.transactionDate)||((this.transactionDate!= null)&&this.transactionDate.equals(rhs.transactionDate))))&&((this.transactionDetailLines == rhs.transactionDetailLines)||((this.transactionDetailLines!= null)&&this.transactionDetailLines.equals(rhs.transactionDetailLines))));
    }


    /**
     * Type
     * <p>
     * The type of the general ledger transaction (e.g. journal entry, encumbrance, budget).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        APPROVED_BUDGET("approvedBudget"),
        CONTINGENT_BUDGET("contingentBudget"),
        APPROVED_BUDGET_ADJUSTMENT("approvedBudgetAdjustment"),
        TEMPORARY_BUDGET("temporaryBudget"),
        TEMPORARY_BUDGET_ADJUSTMENT("temporaryBudgetAdjustment"),
        ENCUMBRANCE_OPEN_BALANCE("encumbranceOpenBalance"),
        GENERAL_ENCUMBRANCE_CREATE("generalEncumbranceCreate"),
        GENERAL_ENCUMBRANCE_ADJUST("generalEncumbranceAdjust"),
        GENERAL_ENCUMBRANCE_LIQUIDATION("generalEncumbranceLiquidation"),
        GENERAL_ENCUMBRANCE_CLOSE("generalEncumbranceClose"),
        PAYROLL_ENCUMBRANCE_CREATE("payrollEncumbranceCreate"),
        PAYROLL_ENCUMBRANCE_ADJUST("payrollEncumbranceAdjust"),
        PAYROLL_ENCUMBRANCE_LIQUIDATION("payrollEncumbranceLiquidation"),
        PAYROLL_ENCUMBRANCE_CLOSE("payrollEncumbranceClose"),
        TRAVEL_ENCUMBRANCE_CREATE("travelEncumbranceCreate"),
        TRAVEL_ENCUMBRANCE_ADJUST("travelEncumbranceAdjust"),
        TRAVEL_ENCUMBRANCE_CLOSE("travelEncumbranceClose"),
        DONATION("donation"),
        DONATION_ENDOWED("donationEndowed"),
        PLEDGE("pledge"),
        PLEDGE_ENDOWED("pledgeEndowed"),
        FINANCIAL_AID_TRANSMITTAL("financialAidTransmittal"),
        STUDENT_CHARGE("studentCharge"),
        STUDENT_INVOICE("studentInvoice"),
        STUDENT_PAYMENT("studentPayment"),
        GRANT_CHARGE("grantCharge"),
        GRANT_INVOICE("grantInvoice"),
        GRANT_PAYMENT("grantPayment"),
        OTHER_CHARGE("otherCharge"),
        OTHER_INVOICE("otherInvoice"),
        OTHER_PAYMENT("otherPayment"),
        PAYMENT_ALLOCATION("paymentAllocation"),
        DEPOSIT_ALLOCATION("depositAllocation"),
        MISC_CASH_RECEIPT("miscCashReceipt"),
        CASH_DISBURSEMENT("cashDisbursement"),
        PURCHASE_CARD_CHARGE("purchaseCardCharge"),
        MISC_GENERAL_LEDGER_TRANSACTION("miscGeneralLedgerTransaction"),
        PURCHASE_JOURNAL("purchaseJournal"),
        TRAVEL_ADVANCE("travelAdvance"),
        TRAVEL_EXPENSE("travelExpense"),
        YEAR_END_CLOSE_ENTRY("yearEndCloseEntry"),
        PAYROLL("payroll"),
        PAYROLL_WITH_LIQUIDATION("payrollWithLiquidation"),
        ACTUAL_OPEN_BALANCE("actualOpenBalance");
        private final String value;
        private final static Map<String, Transaction.Type> CONSTANTS = new HashMap<String, Transaction.Type>();

        static {
            for (Transaction.Type c: values()) {
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
        public static Transaction.Type fromValue(String value) {
            Transaction.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
