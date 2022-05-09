
package com.ellucian.generated.eedm.payment_transactions.v12_0;

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


/**
 * Payment Transactions
 * <p>
 * The details of transactions representing disbursements from the institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "documentNumber",
    "referenceNumber",
    "paymentMethod",
    "paymentDate",
    "paymentsFor",
    "amount",
    "payeeDetails",
    "status",
    "void"
})
@Generated("jsonschema2pojo")
public class PaymentTransactions {

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
     * The global identifier of the payment transaction.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the payment transaction.")
    private String id;
    /**
     * Document Number
     * <p>
     * The document number associated with the payment transaction (i.e. check number, payment transaction number).
     * (Required)
     * 
     */
    @JsonProperty("documentNumber")
    @JsonPropertyDescription("The document number associated with the payment transaction (i.e. check number, payment transaction number).")
    private String documentNumber;
    /**
     * Reference Number
     * <p>
     * The reference number associated with the payment transaction.
     * 
     */
    @JsonProperty("referenceNumber")
    @JsonPropertyDescription("The reference number associated with the payment transaction.")
    private String referenceNumber;
    /**
     * Payment Method
     * <p>
     * The payment method used for the transaction.
     * (Required)
     * 
     */
    @JsonProperty("paymentMethod")
    @JsonPropertyDescription("The payment method used for the transaction.")
    private PaymentTransactions.PaymentMethod paymentMethod;
    /**
     * Payment Date
     * <p>
     * The date the payment occurred.
     * (Required)
     * 
     */
    @JsonProperty("paymentDate")
    @JsonPropertyDescription("The date the payment occurred.")
    private String paymentDate;
    /**
     * Payments For
     * <p>
     * The invoices or refunds for which the payment occurred.
     * 
     */
    @JsonProperty("paymentsFor")
    @JsonPropertyDescription("The invoices or refunds for which the payment occurred.")
    private List<PaymentsFor> paymentsFor = new ArrayList<PaymentsFor>();
    /**
     * Amount
     * <p>
     * The total amount paid as part of the transaction.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The total amount paid as part of the transaction.")
    private Amount amount;
    /**
     * Payee Details
     * <p>
     * The details associated with the payee.
     * 
     */
    @JsonProperty("payeeDetails")
    @JsonPropertyDescription("The details associated with the payee.")
    private Object payeeDetails;
    /**
     * Status
     * <p>
     * The status of the payment transaction.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the payment transaction.")
    private PaymentTransactions.Status status;
    /**
     * Void
     * <p>
     * The void type and date associated with the transaction.
     * 
     */
    @JsonProperty("void")
    @JsonPropertyDescription("The void type and date associated with the transaction.")
    private Object _void;

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

    public PaymentTransactions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the payment transaction.
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
     * The global identifier of the payment transaction.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PaymentTransactions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Document Number
     * <p>
     * The document number associated with the payment transaction (i.e. check number, payment transaction number).
     * (Required)
     * 
     */
    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Document Number
     * <p>
     * The document number associated with the payment transaction (i.e. check number, payment transaction number).
     * (Required)
     * 
     */
    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public PaymentTransactions withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * The reference number associated with the payment transaction.
     * 
     */
    @JsonProperty("referenceNumber")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Reference Number
     * <p>
     * The reference number associated with the payment transaction.
     * 
     */
    @JsonProperty("referenceNumber")
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public PaymentTransactions withReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }

    /**
     * Payment Method
     * <p>
     * The payment method used for the transaction.
     * (Required)
     * 
     */
    @JsonProperty("paymentMethod")
    public PaymentTransactions.PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Payment Method
     * <p>
     * The payment method used for the transaction.
     * (Required)
     * 
     */
    @JsonProperty("paymentMethod")
    public void setPaymentMethod(PaymentTransactions.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentTransactions withPaymentMethod(PaymentTransactions.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Payment Date
     * <p>
     * The date the payment occurred.
     * (Required)
     * 
     */
    @JsonProperty("paymentDate")
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Payment Date
     * <p>
     * The date the payment occurred.
     * (Required)
     * 
     */
    @JsonProperty("paymentDate")
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentTransactions withPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * Payments For
     * <p>
     * The invoices or refunds for which the payment occurred.
     * 
     */
    @JsonProperty("paymentsFor")
    public List<PaymentsFor> getPaymentsFor() {
        return paymentsFor;
    }

    /**
     * Payments For
     * <p>
     * The invoices or refunds for which the payment occurred.
     * 
     */
    @JsonProperty("paymentsFor")
    public void setPaymentsFor(List<PaymentsFor> paymentsFor) {
        this.paymentsFor = paymentsFor;
    }

    public PaymentTransactions withPaymentsFor(List<PaymentsFor> paymentsFor) {
        this.paymentsFor = paymentsFor;
        return this;
    }

    /**
     * Amount
     * <p>
     * The total amount paid as part of the transaction.
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
     * The total amount paid as part of the transaction.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public PaymentTransactions withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Payee Details
     * <p>
     * The details associated with the payee.
     * 
     */
    @JsonProperty("payeeDetails")
    public Object getPayeeDetails() {
        return payeeDetails;
    }

    /**
     * Payee Details
     * <p>
     * The details associated with the payee.
     * 
     */
    @JsonProperty("payeeDetails")
    public void setPayeeDetails(Object payeeDetails) {
        this.payeeDetails = payeeDetails;
    }

    public PaymentTransactions withPayeeDetails(Object payeeDetails) {
        this.payeeDetails = payeeDetails;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the payment transaction.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public PaymentTransactions.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the payment transaction.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(PaymentTransactions.Status status) {
        this.status = status;
    }

    public PaymentTransactions withStatus(PaymentTransactions.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Void
     * <p>
     * The void type and date associated with the transaction.
     * 
     */
    @JsonProperty("void")
    public Object getVoid() {
        return _void;
    }

    /**
     * Void
     * <p>
     * The void type and date associated with the transaction.
     * 
     */
    @JsonProperty("void")
    public void setVoid(Object _void) {
        this._void = _void;
    }

    public PaymentTransactions withVoid(Object _void) {
        this._void = _void;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentTransactions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("referenceNumber");
        sb.append('=');
        sb.append(((this.referenceNumber == null)?"<null>":this.referenceNumber));
        sb.append(',');
        sb.append("paymentMethod");
        sb.append('=');
        sb.append(((this.paymentMethod == null)?"<null>":this.paymentMethod));
        sb.append(',');
        sb.append("paymentDate");
        sb.append('=');
        sb.append(((this.paymentDate == null)?"<null>":this.paymentDate));
        sb.append(',');
        sb.append("paymentsFor");
        sb.append('=');
        sb.append(((this.paymentsFor == null)?"<null>":this.paymentsFor));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("payeeDetails");
        sb.append('=');
        sb.append(((this.payeeDetails == null)?"<null>":this.payeeDetails));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_void");
        sb.append('=');
        sb.append(((this._void == null)?"<null>":this._void));
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
        result = ((result* 31)+((this.paymentsFor == null)? 0 :this.paymentsFor.hashCode()));
        result = ((result* 31)+((this._void == null)? 0 :this._void.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.payeeDetails == null)? 0 :this.payeeDetails.hashCode()));
        result = ((result* 31)+((this.referenceNumber == null)? 0 :this.referenceNumber.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.paymentMethod == null)? 0 :this.paymentMethod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.paymentDate == null)? 0 :this.paymentDate.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentTransactions) == false) {
            return false;
        }
        PaymentTransactions rhs = ((PaymentTransactions) other);
        return ((((((((((((this.paymentsFor == rhs.paymentsFor)||((this.paymentsFor!= null)&&this.paymentsFor.equals(rhs.paymentsFor)))&&((this._void == rhs._void)||((this._void!= null)&&this._void.equals(rhs._void))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.payeeDetails == rhs.payeeDetails)||((this.payeeDetails!= null)&&this.payeeDetails.equals(rhs.payeeDetails))))&&((this.referenceNumber == rhs.referenceNumber)||((this.referenceNumber!= null)&&this.referenceNumber.equals(rhs.referenceNumber))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.paymentMethod == rhs.paymentMethod)||((this.paymentMethod!= null)&&this.paymentMethod.equals(rhs.paymentMethod))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.paymentDate == rhs.paymentDate)||((this.paymentDate!= null)&&this.paymentDate.equals(rhs.paymentDate))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Payment Method
     * <p>
     * The payment method used for the transaction.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PaymentMethod {

        CHECK("check"),
        DIRECT_DEPOSIT("directDeposit"),
        WIRE("wire"),
        E_CHECK("eCheck"),
        CREDIT_CARD("creditCard"),
        DEBIT_CARD("debitCard");
        private final String value;
        private final static Map<String, PaymentTransactions.PaymentMethod> CONSTANTS = new HashMap<String, PaymentTransactions.PaymentMethod>();

        static {
            for (PaymentTransactions.PaymentMethod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PaymentMethod(String value) {
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
        public static PaymentTransactions.PaymentMethod fromValue(String value) {
            PaymentTransactions.PaymentMethod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Status
     * <p>
     * The status of the payment transaction.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        RECONCILED("reconciled"),
        OUTSTANDING("outstanding"),
        VOID("void");
        private final String value;
        private final static Map<String, PaymentTransactions.Status> CONSTANTS = new HashMap<String, PaymentTransactions.Status>();

        static {
            for (PaymentTransactions.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static PaymentTransactions.Status fromValue(String value) {
            PaymentTransactions.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
