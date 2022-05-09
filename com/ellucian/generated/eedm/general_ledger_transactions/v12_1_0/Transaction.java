
package com.ellucian.generated.eedm.general_ledger_transactions.v12_1_0;

import java.util.ArrayList;
import java.util.Date;
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
    "referenceNumber",
    "transactionNumber",
    "ledgerDate",
    "transactionTypeReferenceDate",
    "externalBatchReference",
    "reference",
    "transactionDetailLines"
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
     * Reference Number
     * <p>
     * A source reference number/document number for the transaction.
     * 
     */
    @JsonProperty("referenceNumber")
    @JsonPropertyDescription("A source reference number/document number for the transaction.")
    private String referenceNumber;
    /**
     * Transaction Number
     * <p>
     * A sequential number associated with the transaction.
     * 
     */
    @JsonProperty("transactionNumber")
    @JsonPropertyDescription("A sequential number associated with the transaction.")
    private String transactionNumber;
    /**
     * Ledger Date
     * <p>
     * The date the transaction is credited/debited to the account in the general ledger (i.e. posting date).
     * (Required)
     * 
     */
    @JsonProperty("ledgerDate")
    @JsonPropertyDescription("The date the transaction is credited/debited to the account in the general ledger (i.e. posting date).")
    private Date ledgerDate;
    /**
     * Transaction Type Reference Date
     * <p>
     * A supplementary date assigned to the transaction based on the transaction type.
     * 
     */
    @JsonProperty("transactionTypeReferenceDate")
    @JsonPropertyDescription("A supplementary date assigned to the transaction based on the transaction type.")
    private Object transactionTypeReferenceDate;
    /**
     * External Batch Reference
     * <p>
     * An external reference number that identifies the transaction as being included in a specified batch.
     * 
     */
    @JsonProperty("externalBatchReference")
    @JsonPropertyDescription("An external reference number that identifies the transaction as being included in a specified batch.")
    private String externalBatchReference;
    /**
     * Reference
     * <p>
     * The person or organization associated with the transaction.
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("The person or organization associated with the transaction.")
    private Object reference;
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
     * Reference Number
     * <p>
     * A source reference number/document number for the transaction.
     * 
     */
    @JsonProperty("referenceNumber")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Reference Number
     * <p>
     * A source reference number/document number for the transaction.
     * 
     */
    @JsonProperty("referenceNumber")
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Transaction withReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }

    /**
     * Transaction Number
     * <p>
     * A sequential number associated with the transaction.
     * 
     */
    @JsonProperty("transactionNumber")
    public String getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Transaction Number
     * <p>
     * A sequential number associated with the transaction.
     * 
     */
    @JsonProperty("transactionNumber")
    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Transaction withTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
        return this;
    }

    /**
     * Ledger Date
     * <p>
     * The date the transaction is credited/debited to the account in the general ledger (i.e. posting date).
     * (Required)
     * 
     */
    @JsonProperty("ledgerDate")
    public Date getLedgerDate() {
        return ledgerDate;
    }

    /**
     * Ledger Date
     * <p>
     * The date the transaction is credited/debited to the account in the general ledger (i.e. posting date).
     * (Required)
     * 
     */
    @JsonProperty("ledgerDate")
    public void setLedgerDate(Date ledgerDate) {
        this.ledgerDate = ledgerDate;
    }

    public Transaction withLedgerDate(Date ledgerDate) {
        this.ledgerDate = ledgerDate;
        return this;
    }

    /**
     * Transaction Type Reference Date
     * <p>
     * A supplementary date assigned to the transaction based on the transaction type.
     * 
     */
    @JsonProperty("transactionTypeReferenceDate")
    public Object getTransactionTypeReferenceDate() {
        return transactionTypeReferenceDate;
    }

    /**
     * Transaction Type Reference Date
     * <p>
     * A supplementary date assigned to the transaction based on the transaction type.
     * 
     */
    @JsonProperty("transactionTypeReferenceDate")
    public void setTransactionTypeReferenceDate(Object transactionTypeReferenceDate) {
        this.transactionTypeReferenceDate = transactionTypeReferenceDate;
    }

    public Transaction withTransactionTypeReferenceDate(Object transactionTypeReferenceDate) {
        this.transactionTypeReferenceDate = transactionTypeReferenceDate;
        return this;
    }

    /**
     * External Batch Reference
     * <p>
     * An external reference number that identifies the transaction as being included in a specified batch.
     * 
     */
    @JsonProperty("externalBatchReference")
    public String getExternalBatchReference() {
        return externalBatchReference;
    }

    /**
     * External Batch Reference
     * <p>
     * An external reference number that identifies the transaction as being included in a specified batch.
     * 
     */
    @JsonProperty("externalBatchReference")
    public void setExternalBatchReference(String externalBatchReference) {
        this.externalBatchReference = externalBatchReference;
    }

    public Transaction withExternalBatchReference(String externalBatchReference) {
        this.externalBatchReference = externalBatchReference;
        return this;
    }

    /**
     * Reference
     * <p>
     * The person or organization associated with the transaction.
     * 
     */
    @JsonProperty("reference")
    public Object getReference() {
        return reference;
    }

    /**
     * Reference
     * <p>
     * The person or organization associated with the transaction.
     * 
     */
    @JsonProperty("reference")
    public void setReference(Object reference) {
        this.reference = reference;
    }

    public Transaction withReference(Object reference) {
        this.reference = reference;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Transaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("referenceNumber");
        sb.append('=');
        sb.append(((this.referenceNumber == null)?"<null>":this.referenceNumber));
        sb.append(',');
        sb.append("transactionNumber");
        sb.append('=');
        sb.append(((this.transactionNumber == null)?"<null>":this.transactionNumber));
        sb.append(',');
        sb.append("ledgerDate");
        sb.append('=');
        sb.append(((this.ledgerDate == null)?"<null>":this.ledgerDate));
        sb.append(',');
        sb.append("transactionTypeReferenceDate");
        sb.append('=');
        sb.append(((this.transactionTypeReferenceDate == null)?"<null>":this.transactionTypeReferenceDate));
        sb.append(',');
        sb.append("externalBatchReference");
        sb.append('=');
        sb.append(((this.externalBatchReference == null)?"<null>":this.externalBatchReference));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("transactionDetailLines");
        sb.append('=');
        sb.append(((this.transactionDetailLines == null)?"<null>":this.transactionDetailLines));
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
        result = ((result* 31)+((this.transactionTypeReferenceDate == null)? 0 :this.transactionTypeReferenceDate.hashCode()));
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.ledgerDate == null)? 0 :this.ledgerDate.hashCode()));
        result = ((result* 31)+((this.referenceNumber == null)? 0 :this.referenceNumber.hashCode()));
        result = ((result* 31)+((this.transactionNumber == null)? 0 :this.transactionNumber.hashCode()));
        result = ((result* 31)+((this.externalBatchReference == null)? 0 :this.externalBatchReference.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
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
        return (((((((((this.transactionTypeReferenceDate == rhs.transactionTypeReferenceDate)||((this.transactionTypeReferenceDate!= null)&&this.transactionTypeReferenceDate.equals(rhs.transactionTypeReferenceDate)))&&((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference))))&&((this.ledgerDate == rhs.ledgerDate)||((this.ledgerDate!= null)&&this.ledgerDate.equals(rhs.ledgerDate))))&&((this.referenceNumber == rhs.referenceNumber)||((this.referenceNumber!= null)&&this.referenceNumber.equals(rhs.referenceNumber))))&&((this.transactionNumber == rhs.transactionNumber)||((this.transactionNumber!= null)&&this.transactionNumber.equals(rhs.transactionNumber))))&&((this.externalBatchReference == rhs.externalBatchReference)||((this.externalBatchReference!= null)&&this.externalBatchReference.equals(rhs.externalBatchReference))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.transactionDetailLines == rhs.transactionDetailLines)||((this.transactionDetailLines!= null)&&this.transactionDetailLines.equals(rhs.transactionDetailLines))));
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
