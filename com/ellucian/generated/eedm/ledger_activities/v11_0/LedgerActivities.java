
package com.ellucian.generated.eedm.ledger_activities.v11_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Ledger Activities
 * <p>
 * The detailed activity that is posted against the ledger.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "reportingSegment",
    "ledgerCategory",
    "documentType",
    "adjustmentType",
    "period",
    "transactionDate",
    "enteredOn",
    "accountingString",
    "accountingStringComponentValues",
    "referenceDocumentNumber",
    "reference",
    "type",
    "amount",
    "status",
    "billingStatus",
    "grant"
})
@Generated("jsonschema2pojo")
public class LedgerActivities {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the ledger activity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the ledger activity.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the ledger activity.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the ledger activity.")
    private String title;
    /**
     * Reporting Segment
     * <p>
     * The reporting segment with which the ledger activity is associated (e.g. chart, campus, institution, etc.).
     * (Required)
     * 
     */
    @JsonProperty("reportingSegment")
    @JsonPropertyDescription("The reporting segment with which the ledger activity is associated (e.g. chart, campus, institution, etc.).")
    private String reportingSegment;
    /**
     * Ledger Category
     * <p>
     * The ledger category associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("ledgerCategory")
    @JsonPropertyDescription("The ledger category associated with the activity.")
    private LedgerActivities.LedgerCategory ledgerCategory;
    /**
     * Document Type
     * <p>
     * The type of financial document associated with the activity.
     * 
     */
    @JsonProperty("documentType")
    @JsonPropertyDescription("The type of financial document associated with the activity.")
    private Object documentType;
    /**
     * Adjustment Type
     * <p>
     * The type of adjustment (opening balance or year-end adjustment).
     * 
     */
    @JsonProperty("adjustmentType")
    @JsonPropertyDescription("The type of adjustment (opening balance or year-end adjustment).")
    private Object adjustmentType;
    /**
     * Period
     * <p>
     * The fiscal period during which the activity is posted to the ledger.
     * (Required)
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("The fiscal period during which the activity is posted to the ledger.")
    private Period period;
    /**
     * Transaction Date
     * <p>
     * The date the activity is posted to the account in the ledger.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    @JsonPropertyDescription("The date the activity is posted to the account in the ledger.")
    private String transactionDate;
    /**
     * Entered On
     * <p>
     * The date the activity occurred.
     * (Required)
     * 
     */
    @JsonProperty("enteredOn")
    @JsonPropertyDescription("The date the activity occurred.")
    private String enteredOn;
    /**
     * Accounting String
     * <p>
     * The accounting string associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    @JsonPropertyDescription("The accounting string associated with the activity.")
    private String accountingString;
    /**
     * Accounting String Component Values
     * <p>
     * The accounting string component values associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("accountingStringComponentValues")
    @JsonPropertyDescription("The accounting string component values associated with the activity.")
    private List<AccountingStringComponentValue> accountingStringComponentValues = new ArrayList<AccountingStringComponentValue>();
    /**
     * Reference Document Number
     * <p>
     * The reference document number associated with the activity.
     * 
     */
    @JsonProperty("referenceDocumentNumber")
    @JsonPropertyDescription("The reference document number associated with the activity.")
    private String referenceDocumentNumber;
    /**
     * Reference
     * <p>
     * The person, organization, or institution associated with the activity.
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("The person, organization, or institution associated with the activity.")
    private Object reference;
    /**
     * Type
     * <p>
     * The type of activity.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of activity.")
    private Object type;
    /**
     * Amount
     * <p>
     * The amount associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount associated with the activity.")
    private Amount amount;
    /**
     * Status
     * <p>
     * The status associated with the activity (posted or pending posting).
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status associated with the activity (posted or pending posting).")
    private Object status;
    /**
     * Billing Status
     * <p>
     * The billing status of the expenditure activity (billed or unbilled).
     * 
     */
    @JsonProperty("billingStatus")
    @JsonPropertyDescription("The billing status of the expenditure activity (billed or unbilled).")
    private Object billingStatus;
    /**
     * Grant
     * <p>
     * The grant with which the activity is associated.
     * 
     */
    @JsonProperty("grant")
    @JsonPropertyDescription("The grant with which the activity is associated.")
    private Object grant;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public LedgerActivities withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the ledger activity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the ledger activity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public LedgerActivities withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the ledger activity.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the ledger activity.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public LedgerActivities withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Reporting Segment
     * <p>
     * The reporting segment with which the ledger activity is associated (e.g. chart, campus, institution, etc.).
     * (Required)
     * 
     */
    @JsonProperty("reportingSegment")
    public String getReportingSegment() {
        return reportingSegment;
    }

    /**
     * Reporting Segment
     * <p>
     * The reporting segment with which the ledger activity is associated (e.g. chart, campus, institution, etc.).
     * (Required)
     * 
     */
    @JsonProperty("reportingSegment")
    public void setReportingSegment(String reportingSegment) {
        this.reportingSegment = reportingSegment;
    }

    public LedgerActivities withReportingSegment(String reportingSegment) {
        this.reportingSegment = reportingSegment;
        return this;
    }

    /**
     * Ledger Category
     * <p>
     * The ledger category associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("ledgerCategory")
    public LedgerActivities.LedgerCategory getLedgerCategory() {
        return ledgerCategory;
    }

    /**
     * Ledger Category
     * <p>
     * The ledger category associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("ledgerCategory")
    public void setLedgerCategory(LedgerActivities.LedgerCategory ledgerCategory) {
        this.ledgerCategory = ledgerCategory;
    }

    public LedgerActivities withLedgerCategory(LedgerActivities.LedgerCategory ledgerCategory) {
        this.ledgerCategory = ledgerCategory;
        return this;
    }

    /**
     * Document Type
     * <p>
     * The type of financial document associated with the activity.
     * 
     */
    @JsonProperty("documentType")
    public Object getDocumentType() {
        return documentType;
    }

    /**
     * Document Type
     * <p>
     * The type of financial document associated with the activity.
     * 
     */
    @JsonProperty("documentType")
    public void setDocumentType(Object documentType) {
        this.documentType = documentType;
    }

    public LedgerActivities withDocumentType(Object documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * Adjustment Type
     * <p>
     * The type of adjustment (opening balance or year-end adjustment).
     * 
     */
    @JsonProperty("adjustmentType")
    public Object getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Adjustment Type
     * <p>
     * The type of adjustment (opening balance or year-end adjustment).
     * 
     */
    @JsonProperty("adjustmentType")
    public void setAdjustmentType(Object adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public LedgerActivities withAdjustmentType(Object adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * Period
     * <p>
     * The fiscal period during which the activity is posted to the ledger.
     * (Required)
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * The fiscal period during which the activity is posted to the ledger.
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    public LedgerActivities withPeriod(Period period) {
        this.period = period;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * The date the activity is posted to the account in the ledger.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Transaction Date
     * <p>
     * The date the activity is posted to the account in the ledger.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public LedgerActivities withTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    /**
     * Entered On
     * <p>
     * The date the activity occurred.
     * (Required)
     * 
     */
    @JsonProperty("enteredOn")
    public String getEnteredOn() {
        return enteredOn;
    }

    /**
     * Entered On
     * <p>
     * The date the activity occurred.
     * (Required)
     * 
     */
    @JsonProperty("enteredOn")
    public void setEnteredOn(String enteredOn) {
        this.enteredOn = enteredOn;
    }

    public LedgerActivities withEnteredOn(String enteredOn) {
        this.enteredOn = enteredOn;
        return this;
    }

    /**
     * Accounting String
     * <p>
     * The accounting string associated with the activity.
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
     * The accounting string associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    public void setAccountingString(String accountingString) {
        this.accountingString = accountingString;
    }

    public LedgerActivities withAccountingString(String accountingString) {
        this.accountingString = accountingString;
        return this;
    }

    /**
     * Accounting String Component Values
     * <p>
     * The accounting string component values associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("accountingStringComponentValues")
    public List<AccountingStringComponentValue> getAccountingStringComponentValues() {
        return accountingStringComponentValues;
    }

    /**
     * Accounting String Component Values
     * <p>
     * The accounting string component values associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("accountingStringComponentValues")
    public void setAccountingStringComponentValues(List<AccountingStringComponentValue> accountingStringComponentValues) {
        this.accountingStringComponentValues = accountingStringComponentValues;
    }

    public LedgerActivities withAccountingStringComponentValues(List<AccountingStringComponentValue> accountingStringComponentValues) {
        this.accountingStringComponentValues = accountingStringComponentValues;
        return this;
    }

    /**
     * Reference Document Number
     * <p>
     * The reference document number associated with the activity.
     * 
     */
    @JsonProperty("referenceDocumentNumber")
    public String getReferenceDocumentNumber() {
        return referenceDocumentNumber;
    }

    /**
     * Reference Document Number
     * <p>
     * The reference document number associated with the activity.
     * 
     */
    @JsonProperty("referenceDocumentNumber")
    public void setReferenceDocumentNumber(String referenceDocumentNumber) {
        this.referenceDocumentNumber = referenceDocumentNumber;
    }

    public LedgerActivities withReferenceDocumentNumber(String referenceDocumentNumber) {
        this.referenceDocumentNumber = referenceDocumentNumber;
        return this;
    }

    /**
     * Reference
     * <p>
     * The person, organization, or institution associated with the activity.
     * 
     */
    @JsonProperty("reference")
    public Object getReference() {
        return reference;
    }

    /**
     * Reference
     * <p>
     * The person, organization, or institution associated with the activity.
     * 
     */
    @JsonProperty("reference")
    public void setReference(Object reference) {
        this.reference = reference;
    }

    public LedgerActivities withReference(Object reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of activity.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of activity.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public LedgerActivities withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount associated with the activity.
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
     * The amount associated with the activity.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public LedgerActivities withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Status
     * <p>
     * The status associated with the activity (posted or pending posting).
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status associated with the activity (posted or pending posting).
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public LedgerActivities withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Billing Status
     * <p>
     * The billing status of the expenditure activity (billed or unbilled).
     * 
     */
    @JsonProperty("billingStatus")
    public Object getBillingStatus() {
        return billingStatus;
    }

    /**
     * Billing Status
     * <p>
     * The billing status of the expenditure activity (billed or unbilled).
     * 
     */
    @JsonProperty("billingStatus")
    public void setBillingStatus(Object billingStatus) {
        this.billingStatus = billingStatus;
    }

    public LedgerActivities withBillingStatus(Object billingStatus) {
        this.billingStatus = billingStatus;
        return this;
    }

    /**
     * Grant
     * <p>
     * The grant with which the activity is associated.
     * 
     */
    @JsonProperty("grant")
    public Object getGrant() {
        return grant;
    }

    /**
     * Grant
     * <p>
     * The grant with which the activity is associated.
     * 
     */
    @JsonProperty("grant")
    public void setGrant(Object grant) {
        this.grant = grant;
    }

    public LedgerActivities withGrant(Object grant) {
        this.grant = grant;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LedgerActivities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("reportingSegment");
        sb.append('=');
        sb.append(((this.reportingSegment == null)?"<null>":this.reportingSegment));
        sb.append(',');
        sb.append("ledgerCategory");
        sb.append('=');
        sb.append(((this.ledgerCategory == null)?"<null>":this.ledgerCategory));
        sb.append(',');
        sb.append("documentType");
        sb.append('=');
        sb.append(((this.documentType == null)?"<null>":this.documentType));
        sb.append(',');
        sb.append("adjustmentType");
        sb.append('=');
        sb.append(((this.adjustmentType == null)?"<null>":this.adjustmentType));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("transactionDate");
        sb.append('=');
        sb.append(((this.transactionDate == null)?"<null>":this.transactionDate));
        sb.append(',');
        sb.append("enteredOn");
        sb.append('=');
        sb.append(((this.enteredOn == null)?"<null>":this.enteredOn));
        sb.append(',');
        sb.append("accountingString");
        sb.append('=');
        sb.append(((this.accountingString == null)?"<null>":this.accountingString));
        sb.append(',');
        sb.append("accountingStringComponentValues");
        sb.append('=');
        sb.append(((this.accountingStringComponentValues == null)?"<null>":this.accountingStringComponentValues));
        sb.append(',');
        sb.append("referenceDocumentNumber");
        sb.append('=');
        sb.append(((this.referenceDocumentNumber == null)?"<null>":this.referenceDocumentNumber));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("billingStatus");
        sb.append('=');
        sb.append(((this.billingStatus == null)?"<null>":this.billingStatus));
        sb.append(',');
        sb.append("grant");
        sb.append('=');
        sb.append(((this.grant == null)?"<null>":this.grant));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.documentType == null)? 0 :this.documentType.hashCode()));
        result = ((result* 31)+((this.adjustmentType == null)? 0 :this.adjustmentType.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.transactionDate == null)? 0 :this.transactionDate.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.accountingStringComponentValues == null)? 0 :this.accountingStringComponentValues.hashCode()));
        result = ((result* 31)+((this.billingStatus == null)? 0 :this.billingStatus.hashCode()));
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.reportingSegment == null)? 0 :this.reportingSegment.hashCode()));
        result = ((result* 31)+((this.enteredOn == null)? 0 :this.enteredOn.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.ledgerCategory == null)? 0 :this.ledgerCategory.hashCode()));
        result = ((result* 31)+((this.grant == null)? 0 :this.grant.hashCode()));
        result = ((result* 31)+((this.referenceDocumentNumber == null)? 0 :this.referenceDocumentNumber.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LedgerActivities) == false) {
            return false;
        }
        LedgerActivities rhs = ((LedgerActivities) other);
        return ((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.documentType == rhs.documentType)||((this.documentType!= null)&&this.documentType.equals(rhs.documentType))))&&((this.adjustmentType == rhs.adjustmentType)||((this.adjustmentType!= null)&&this.adjustmentType.equals(rhs.adjustmentType))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.transactionDate == rhs.transactionDate)||((this.transactionDate!= null)&&this.transactionDate.equals(rhs.transactionDate))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.accountingStringComponentValues == rhs.accountingStringComponentValues)||((this.accountingStringComponentValues!= null)&&this.accountingStringComponentValues.equals(rhs.accountingStringComponentValues))))&&((this.billingStatus == rhs.billingStatus)||((this.billingStatus!= null)&&this.billingStatus.equals(rhs.billingStatus))))&&((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference))))&&((this.reportingSegment == rhs.reportingSegment)||((this.reportingSegment!= null)&&this.reportingSegment.equals(rhs.reportingSegment))))&&((this.enteredOn == rhs.enteredOn)||((this.enteredOn!= null)&&this.enteredOn.equals(rhs.enteredOn))))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.ledgerCategory == rhs.ledgerCategory)||((this.ledgerCategory!= null)&&this.ledgerCategory.equals(rhs.ledgerCategory))))&&((this.grant == rhs.grant)||((this.grant!= null)&&this.grant.equals(rhs.grant))))&&((this.referenceDocumentNumber == rhs.referenceDocumentNumber)||((this.referenceDocumentNumber!= null)&&this.referenceDocumentNumber.equals(rhs.referenceDocumentNumber))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Ledger Category
     * <p>
     * The ledger category associated with the activity.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum LedgerCategory {

        ORIGINAL_BUDGET("originalBudget"),
        BUDGET_ADJUSTMENT("budgetAdjustment"),
        ACTUALS("actuals"),
        ENCUMBRANCE("encumbrance"),
        RESERVATION("reservation"),
        ACCOUNTED_BUDGET("accountedBudget"),
        TEMPORARY_BUDGET("temporaryBudget");
        private final String value;
        private final static Map<String, LedgerActivities.LedgerCategory> CONSTANTS = new HashMap<String, LedgerActivities.LedgerCategory>();

        static {
            for (LedgerActivities.LedgerCategory c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        LedgerCategory(String value) {
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
        public static LedgerActivities.LedgerCategory fromValue(String value) {
            LedgerActivities.LedgerCategory constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
