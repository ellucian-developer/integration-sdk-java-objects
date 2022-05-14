
package com.ellucian.generated.eedm.accounts_payable_invoices.v11_0;

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
 * Accounts Payable Invoices
 * <p>
 * A request for payment for goods sold, services provided or expenses incurred, containing individual prices, additional charges, payment terms and account information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "vendor",
    "referenceNumber",
    "invoiceNumber",
    "vendorInvoiceNumber",
    "transactionDate",
    "vendorInvoiceDate",
    "voidDate",
    "processState",
    "paymentStatus",
    "vendorBilledAmount",
    "invoiceDiscountAmount",
    "taxes",
    "invoiceType",
    "payment",
    "invoiceComment",
    "governmentReporting",
    "submittedBy",
    "lineItems"
})
@Generated("jsonschema2pojo")
public class AccountsPayableInvoices {

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
     * The global identifier of the accounts payable invoice.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the accounts payable invoice.")
    private String id;
    /**
     * Vendor
     * <p>
     * The vendor associated with the invoice.
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("The vendor associated with the invoice.")
    private Vendor vendor;
    /**
     * Reference Number
     * <p>
     * The purchase order number, encumbrance number, or other reference number associated with the invoice.
     * 
     */
    @JsonProperty("referenceNumber")
    @JsonPropertyDescription("The purchase order number, encumbrance number, or other reference number associated with the invoice.")
    private String referenceNumber;
    /**
     * Invoice Number
     * <p>
     * A system-generated number associated with the invoice.
     * 
     */
    @JsonProperty("invoiceNumber")
    @JsonPropertyDescription("A system-generated number associated with the invoice.")
    private String invoiceNumber;
    /**
     * Vendor Invoice Number
     * <p>
     * The invoice number specified by the vendor.
     * 
     */
    @JsonProperty("vendorInvoiceNumber")
    @JsonPropertyDescription("The invoice number specified by the vendor.")
    private String vendorInvoiceNumber;
    /**
     * Transaction Date
     * <p>
     * The transaction date for the invoice. This will be the date used when entering the transactions into the general ledger.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    @JsonPropertyDescription("The transaction date for the invoice. This will be the date used when entering the transactions into the general ledger.")
    private String transactionDate;
    /**
     * Vendor Invoice Date
     * <p>
     * The invoice date as specified by the vendor.
     * 
     */
    @JsonProperty("vendorInvoiceDate")
    @JsonPropertyDescription("The invoice date as specified by the vendor.")
    private Object vendorInvoiceDate;
    /**
     * Void Date
     * <p>
     * The date on which the invoice was voided, if applicable.
     * 
     */
    @JsonProperty("voidDate")
    @JsonPropertyDescription("The date on which the invoice was voided, if applicable.")
    private Object voidDate;
    /**
     * Process State
     * <p>
     * The current state of the processing of the invoice.
     * (Required)
     * 
     */
    @JsonProperty("processState")
    @JsonPropertyDescription("The current state of the processing of the invoice.")
    private AccountsPayableInvoices.ProcessState processState;
    /**
     * Paymant Status
     * <p>
     * An indicator specifying if payment for the invoice is on hold.
     * (Required)
     * 
     */
    @JsonProperty("paymentStatus")
    @JsonPropertyDescription("An indicator specifying if payment for the invoice is on hold.")
    private AccountsPayableInvoices.PaymentStatus paymentStatus;
    /**
     * Vendor Billed Amount
     * <p>
     * The billed amount as specified by the vendor.
     * 
     */
    @JsonProperty("vendorBilledAmount")
    @JsonPropertyDescription("The billed amount as specified by the vendor.")
    private Object vendorBilledAmount;
    /**
     * Invoice Discount Amount
     * <p>
     * The discount applied to the overall invoice.
     * 
     */
    @JsonProperty("invoiceDiscountAmount")
    @JsonPropertyDescription("The discount applied to the overall invoice.")
    private Object invoiceDiscountAmount;
    /**
     * Taxes
     * <p>
     * The taxes associated with the invoice.
     * 
     */
    @JsonProperty("taxes")
    @JsonPropertyDescription("The taxes associated with the invoice.")
    private List<Tax> taxes = new ArrayList<Tax>();
    /**
     * Invoice Type
     * <p>
     * An indicator specifying if the invoice is a standard or a credit invoice.
     * 
     */
    @JsonProperty("invoiceType")
    @JsonPropertyDescription("An indicator specifying if the invoice is a standard or a credit invoice.")
    private Object invoiceType;
    /**
     * Payment
     * <p>
     * Information concerning the payment of the invoice.
     * (Required)
     * 
     */
    @JsonProperty("payment")
    @JsonPropertyDescription("Information concerning the payment of the invoice.")
    private Payment payment;
    /**
     * Invoice Comment
     * <p>
     * Comments on the invoice as a whole.
     * 
     */
    @JsonProperty("invoiceComment")
    @JsonPropertyDescription("Comments on the invoice as a whole.")
    private String invoiceComment;
    /**
     * Government Reporting
     * <p>
     * Information required for government reporting.
     * 
     */
    @JsonProperty("governmentReporting")
    @JsonPropertyDescription("Information required for government reporting.")
    private List<GovernmentReporting> governmentReporting = new ArrayList<GovernmentReporting>();
    /**
     * Submitted By
     * <p>
     * The person who made the submit request for the invoice.
     * 
     */
    @JsonProperty("submittedBy")
    @JsonPropertyDescription("The person who made the submit request for the invoice.")
    private Object submittedBy;
    /**
     * Line Items
     * <p>
     * The individual line items associated with an invoice.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    @JsonPropertyDescription("The individual line items associated with an invoice.")
    private List<LineItem> lineItems = new ArrayList<LineItem>();

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

    public AccountsPayableInvoices withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the accounts payable invoice.
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
     * The global identifier of the accounts payable invoice.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AccountsPayableInvoices withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Vendor
     * <p>
     * The vendor associated with the invoice.
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Vendor
     * <p>
     * The vendor associated with the invoice.
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public AccountsPayableInvoices withVendor(Vendor vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * The purchase order number, encumbrance number, or other reference number associated with the invoice.
     * 
     */
    @JsonProperty("referenceNumber")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Reference Number
     * <p>
     * The purchase order number, encumbrance number, or other reference number associated with the invoice.
     * 
     */
    @JsonProperty("referenceNumber")
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public AccountsPayableInvoices withReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }

    /**
     * Invoice Number
     * <p>
     * A system-generated number associated with the invoice.
     * 
     */
    @JsonProperty("invoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Invoice Number
     * <p>
     * A system-generated number associated with the invoice.
     * 
     */
    @JsonProperty("invoiceNumber")
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public AccountsPayableInvoices withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Vendor Invoice Number
     * <p>
     * The invoice number specified by the vendor.
     * 
     */
    @JsonProperty("vendorInvoiceNumber")
    public String getVendorInvoiceNumber() {
        return vendorInvoiceNumber;
    }

    /**
     * Vendor Invoice Number
     * <p>
     * The invoice number specified by the vendor.
     * 
     */
    @JsonProperty("vendorInvoiceNumber")
    public void setVendorInvoiceNumber(String vendorInvoiceNumber) {
        this.vendorInvoiceNumber = vendorInvoiceNumber;
    }

    public AccountsPayableInvoices withVendorInvoiceNumber(String vendorInvoiceNumber) {
        this.vendorInvoiceNumber = vendorInvoiceNumber;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * The transaction date for the invoice. This will be the date used when entering the transactions into the general ledger.
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
     * The transaction date for the invoice. This will be the date used when entering the transactions into the general ledger.
     * (Required)
     * 
     */
    @JsonProperty("transactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public AccountsPayableInvoices withTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    /**
     * Vendor Invoice Date
     * <p>
     * The invoice date as specified by the vendor.
     * 
     */
    @JsonProperty("vendorInvoiceDate")
    public Object getVendorInvoiceDate() {
        return vendorInvoiceDate;
    }

    /**
     * Vendor Invoice Date
     * <p>
     * The invoice date as specified by the vendor.
     * 
     */
    @JsonProperty("vendorInvoiceDate")
    public void setVendorInvoiceDate(Object vendorInvoiceDate) {
        this.vendorInvoiceDate = vendorInvoiceDate;
    }

    public AccountsPayableInvoices withVendorInvoiceDate(Object vendorInvoiceDate) {
        this.vendorInvoiceDate = vendorInvoiceDate;
        return this;
    }

    /**
     * Void Date
     * <p>
     * The date on which the invoice was voided, if applicable.
     * 
     */
    @JsonProperty("voidDate")
    public Object getVoidDate() {
        return voidDate;
    }

    /**
     * Void Date
     * <p>
     * The date on which the invoice was voided, if applicable.
     * 
     */
    @JsonProperty("voidDate")
    public void setVoidDate(Object voidDate) {
        this.voidDate = voidDate;
    }

    public AccountsPayableInvoices withVoidDate(Object voidDate) {
        this.voidDate = voidDate;
        return this;
    }

    /**
     * Process State
     * <p>
     * The current state of the processing of the invoice.
     * (Required)
     * 
     */
    @JsonProperty("processState")
    public AccountsPayableInvoices.ProcessState getProcessState() {
        return processState;
    }

    /**
     * Process State
     * <p>
     * The current state of the processing of the invoice.
     * (Required)
     * 
     */
    @JsonProperty("processState")
    public void setProcessState(AccountsPayableInvoices.ProcessState processState) {
        this.processState = processState;
    }

    public AccountsPayableInvoices withProcessState(AccountsPayableInvoices.ProcessState processState) {
        this.processState = processState;
        return this;
    }

    /**
     * Paymant Status
     * <p>
     * An indicator specifying if payment for the invoice is on hold.
     * (Required)
     * 
     */
    @JsonProperty("paymentStatus")
    public AccountsPayableInvoices.PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Paymant Status
     * <p>
     * An indicator specifying if payment for the invoice is on hold.
     * (Required)
     * 
     */
    @JsonProperty("paymentStatus")
    public void setPaymentStatus(AccountsPayableInvoices.PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public AccountsPayableInvoices withPaymentStatus(AccountsPayableInvoices.PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     * Vendor Billed Amount
     * <p>
     * The billed amount as specified by the vendor.
     * 
     */
    @JsonProperty("vendorBilledAmount")
    public Object getVendorBilledAmount() {
        return vendorBilledAmount;
    }

    /**
     * Vendor Billed Amount
     * <p>
     * The billed amount as specified by the vendor.
     * 
     */
    @JsonProperty("vendorBilledAmount")
    public void setVendorBilledAmount(Object vendorBilledAmount) {
        this.vendorBilledAmount = vendorBilledAmount;
    }

    public AccountsPayableInvoices withVendorBilledAmount(Object vendorBilledAmount) {
        this.vendorBilledAmount = vendorBilledAmount;
        return this;
    }

    /**
     * Invoice Discount Amount
     * <p>
     * The discount applied to the overall invoice.
     * 
     */
    @JsonProperty("invoiceDiscountAmount")
    public Object getInvoiceDiscountAmount() {
        return invoiceDiscountAmount;
    }

    /**
     * Invoice Discount Amount
     * <p>
     * The discount applied to the overall invoice.
     * 
     */
    @JsonProperty("invoiceDiscountAmount")
    public void setInvoiceDiscountAmount(Object invoiceDiscountAmount) {
        this.invoiceDiscountAmount = invoiceDiscountAmount;
    }

    public AccountsPayableInvoices withInvoiceDiscountAmount(Object invoiceDiscountAmount) {
        this.invoiceDiscountAmount = invoiceDiscountAmount;
        return this;
    }

    /**
     * Taxes
     * <p>
     * The taxes associated with the invoice.
     * 
     */
    @JsonProperty("taxes")
    public List<Tax> getTaxes() {
        return taxes;
    }

    /**
     * Taxes
     * <p>
     * The taxes associated with the invoice.
     * 
     */
    @JsonProperty("taxes")
    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public AccountsPayableInvoices withTaxes(List<Tax> taxes) {
        this.taxes = taxes;
        return this;
    }

    /**
     * Invoice Type
     * <p>
     * An indicator specifying if the invoice is a standard or a credit invoice.
     * 
     */
    @JsonProperty("invoiceType")
    public Object getInvoiceType() {
        return invoiceType;
    }

    /**
     * Invoice Type
     * <p>
     * An indicator specifying if the invoice is a standard or a credit invoice.
     * 
     */
    @JsonProperty("invoiceType")
    public void setInvoiceType(Object invoiceType) {
        this.invoiceType = invoiceType;
    }

    public AccountsPayableInvoices withInvoiceType(Object invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    /**
     * Payment
     * <p>
     * Information concerning the payment of the invoice.
     * (Required)
     * 
     */
    @JsonProperty("payment")
    public Payment getPayment() {
        return payment;
    }

    /**
     * Payment
     * <p>
     * Information concerning the payment of the invoice.
     * (Required)
     * 
     */
    @JsonProperty("payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public AccountsPayableInvoices withPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Invoice Comment
     * <p>
     * Comments on the invoice as a whole.
     * 
     */
    @JsonProperty("invoiceComment")
    public String getInvoiceComment() {
        return invoiceComment;
    }

    /**
     * Invoice Comment
     * <p>
     * Comments on the invoice as a whole.
     * 
     */
    @JsonProperty("invoiceComment")
    public void setInvoiceComment(String invoiceComment) {
        this.invoiceComment = invoiceComment;
    }

    public AccountsPayableInvoices withInvoiceComment(String invoiceComment) {
        this.invoiceComment = invoiceComment;
        return this;
    }

    /**
     * Government Reporting
     * <p>
     * Information required for government reporting.
     * 
     */
    @JsonProperty("governmentReporting")
    public List<GovernmentReporting> getGovernmentReporting() {
        return governmentReporting;
    }

    /**
     * Government Reporting
     * <p>
     * Information required for government reporting.
     * 
     */
    @JsonProperty("governmentReporting")
    public void setGovernmentReporting(List<GovernmentReporting> governmentReporting) {
        this.governmentReporting = governmentReporting;
    }

    public AccountsPayableInvoices withGovernmentReporting(List<GovernmentReporting> governmentReporting) {
        this.governmentReporting = governmentReporting;
        return this;
    }

    /**
     * Submitted By
     * <p>
     * The person who made the submit request for the invoice.
     * 
     */
    @JsonProperty("submittedBy")
    public Object getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Submitted By
     * <p>
     * The person who made the submit request for the invoice.
     * 
     */
    @JsonProperty("submittedBy")
    public void setSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
    }

    public AccountsPayableInvoices withSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Line Items
     * <p>
     * The individual line items associated with an invoice.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Line Items
     * <p>
     * The individual line items associated with an invoice.
     * (Required)
     * 
     */
    @JsonProperty("lineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public AccountsPayableInvoices withLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountsPayableInvoices.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("referenceNumber");
        sb.append('=');
        sb.append(((this.referenceNumber == null)?"<null>":this.referenceNumber));
        sb.append(',');
        sb.append("invoiceNumber");
        sb.append('=');
        sb.append(((this.invoiceNumber == null)?"<null>":this.invoiceNumber));
        sb.append(',');
        sb.append("vendorInvoiceNumber");
        sb.append('=');
        sb.append(((this.vendorInvoiceNumber == null)?"<null>":this.vendorInvoiceNumber));
        sb.append(',');
        sb.append("transactionDate");
        sb.append('=');
        sb.append(((this.transactionDate == null)?"<null>":this.transactionDate));
        sb.append(',');
        sb.append("vendorInvoiceDate");
        sb.append('=');
        sb.append(((this.vendorInvoiceDate == null)?"<null>":this.vendorInvoiceDate));
        sb.append(',');
        sb.append("voidDate");
        sb.append('=');
        sb.append(((this.voidDate == null)?"<null>":this.voidDate));
        sb.append(',');
        sb.append("processState");
        sb.append('=');
        sb.append(((this.processState == null)?"<null>":this.processState));
        sb.append(',');
        sb.append("paymentStatus");
        sb.append('=');
        sb.append(((this.paymentStatus == null)?"<null>":this.paymentStatus));
        sb.append(',');
        sb.append("vendorBilledAmount");
        sb.append('=');
        sb.append(((this.vendorBilledAmount == null)?"<null>":this.vendorBilledAmount));
        sb.append(',');
        sb.append("invoiceDiscountAmount");
        sb.append('=');
        sb.append(((this.invoiceDiscountAmount == null)?"<null>":this.invoiceDiscountAmount));
        sb.append(',');
        sb.append("taxes");
        sb.append('=');
        sb.append(((this.taxes == null)?"<null>":this.taxes));
        sb.append(',');
        sb.append("invoiceType");
        sb.append('=');
        sb.append(((this.invoiceType == null)?"<null>":this.invoiceType));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("invoiceComment");
        sb.append('=');
        sb.append(((this.invoiceComment == null)?"<null>":this.invoiceComment));
        sb.append(',');
        sb.append("governmentReporting");
        sb.append('=');
        sb.append(((this.governmentReporting == null)?"<null>":this.governmentReporting));
        sb.append(',');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
        sb.append(',');
        sb.append("lineItems");
        sb.append('=');
        sb.append(((this.lineItems == null)?"<null>":this.lineItems));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.vendorBilledAmount == null)? 0 :this.vendorBilledAmount.hashCode()));
        result = ((result* 31)+((this.processState == null)? 0 :this.processState.hashCode()));
        result = ((result* 31)+((this.governmentReporting == null)? 0 :this.governmentReporting.hashCode()));
        result = ((result* 31)+((this.invoiceDiscountAmount == null)? 0 :this.invoiceDiscountAmount.hashCode()));
        result = ((result* 31)+((this.taxes == null)? 0 :this.taxes.hashCode()));
        result = ((result* 31)+((this.invoiceComment == null)? 0 :this.invoiceComment.hashCode()));
        result = ((result* 31)+((this.transactionDate == null)? 0 :this.transactionDate.hashCode()));
        result = ((result* 31)+((this.vendorInvoiceNumber == null)? 0 :this.vendorInvoiceNumber.hashCode()));
        result = ((result* 31)+((this.voidDate == null)? 0 :this.voidDate.hashCode()));
        result = ((result* 31)+((this.lineItems == null)? 0 :this.lineItems.hashCode()));
        result = ((result* 31)+((this.referenceNumber == null)? 0 :this.referenceNumber.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.invoiceNumber == null)? 0 :this.invoiceNumber.hashCode()));
        result = ((result* 31)+((this.invoiceType == null)? 0 :this.invoiceType.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.vendorInvoiceDate == null)? 0 :this.vendorInvoiceDate.hashCode()));
        result = ((result* 31)+((this.paymentStatus == null)? 0 :this.paymentStatus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountsPayableInvoices) == false) {
            return false;
        }
        AccountsPayableInvoices rhs = ((AccountsPayableInvoices) other);
        return (((((((((((((((((((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.vendorBilledAmount == rhs.vendorBilledAmount)||((this.vendorBilledAmount!= null)&&this.vendorBilledAmount.equals(rhs.vendorBilledAmount))))&&((this.processState == rhs.processState)||((this.processState!= null)&&this.processState.equals(rhs.processState))))&&((this.governmentReporting == rhs.governmentReporting)||((this.governmentReporting!= null)&&this.governmentReporting.equals(rhs.governmentReporting))))&&((this.invoiceDiscountAmount == rhs.invoiceDiscountAmount)||((this.invoiceDiscountAmount!= null)&&this.invoiceDiscountAmount.equals(rhs.invoiceDiscountAmount))))&&((this.taxes == rhs.taxes)||((this.taxes!= null)&&this.taxes.equals(rhs.taxes))))&&((this.invoiceComment == rhs.invoiceComment)||((this.invoiceComment!= null)&&this.invoiceComment.equals(rhs.invoiceComment))))&&((this.transactionDate == rhs.transactionDate)||((this.transactionDate!= null)&&this.transactionDate.equals(rhs.transactionDate))))&&((this.vendorInvoiceNumber == rhs.vendorInvoiceNumber)||((this.vendorInvoiceNumber!= null)&&this.vendorInvoiceNumber.equals(rhs.vendorInvoiceNumber))))&&((this.voidDate == rhs.voidDate)||((this.voidDate!= null)&&this.voidDate.equals(rhs.voidDate))))&&((this.lineItems == rhs.lineItems)||((this.lineItems!= null)&&this.lineItems.equals(rhs.lineItems))))&&((this.referenceNumber == rhs.referenceNumber)||((this.referenceNumber!= null)&&this.referenceNumber.equals(rhs.referenceNumber))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.invoiceNumber == rhs.invoiceNumber)||((this.invoiceNumber!= null)&&this.invoiceNumber.equals(rhs.invoiceNumber))))&&((this.invoiceType == rhs.invoiceType)||((this.invoiceType!= null)&&this.invoiceType.equals(rhs.invoiceType))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.vendorInvoiceDate == rhs.vendorInvoiceDate)||((this.vendorInvoiceDate!= null)&&this.vendorInvoiceDate.equals(rhs.vendorInvoiceDate))))&&((this.paymentStatus == rhs.paymentStatus)||((this.paymentStatus!= null)&&this.paymentStatus.equals(rhs.paymentStatus))));
    }


    /**
     * Paymant Status
     * <p>
     * An indicator specifying if payment for the invoice is on hold.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PaymentStatus {

        HOLD("hold"),
        NO_HOLD("noHold");
        private final String value;
        private final static Map<String, AccountsPayableInvoices.PaymentStatus> CONSTANTS = new HashMap<String, AccountsPayableInvoices.PaymentStatus>();

        static {
            for (AccountsPayableInvoices.PaymentStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PaymentStatus(String value) {
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
        public static AccountsPayableInvoices.PaymentStatus fromValue(String value) {
            AccountsPayableInvoices.PaymentStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Process State
     * <p>
     * The current state of the processing of the invoice.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ProcessState {

        IN_PROGRESS("inProgress"),
        SUSPENDED("suspended"),
        SUBMITTED("submitted"),
        AWAITING_RECEIPT("awaitingReceipt"),
        NOT_APPROVED("notApproved"),
        APPROVED("approved"),
        OUTSTANDING("outstanding"),
        PAID("paid"),
        RECONCILED("reconciled"),
        VOIDED("voided");
        private final String value;
        private final static Map<String, AccountsPayableInvoices.ProcessState> CONSTANTS = new HashMap<String, AccountsPayableInvoices.ProcessState>();

        static {
            for (AccountsPayableInvoices.ProcessState c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ProcessState(String value) {
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
        public static AccountsPayableInvoices.ProcessState fromValue(String value) {
            AccountsPayableInvoices.ProcessState constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
