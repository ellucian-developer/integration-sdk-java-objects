
package com.ellucian.generated.eedm.student_payments.v6_0;

import java.util.ArrayList;
import java.util.Date;
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
 * Student Payments
 * <p>
 * Details of payments made by students
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "accountReceivableType",
    "accountingCode",
    "academicPeriod",
    "paymentType",
    "paidOn",
    "amount",
    "comments"
})
@Generated("jsonschema2pojo")
public class StudentPayments {

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
     * The global identifier of the student-payments.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student-payments.")
    private String id;
    /**
     * Student
     * <p>
     * The person (student), who made the payment
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The person (student), who made the payment")
    private Student student;
    /**
     * Account Receivable Type
     * <p>
     * Account Receivable Type that the charge is associated with
     * 
     */
    @JsonProperty("accountReceivableType")
    @JsonPropertyDescription("Account Receivable Type that the charge is associated with")
    private Object accountReceivableType;
    /**
     * Accounting Code
     * <p>
     * The accounting code to which the payment will be applied
     * 
     */
    @JsonProperty("accountingCode")
    @JsonPropertyDescription("The accounting code to which the payment will be applied")
    private Object accountingCode;
    /**
     * Term
     * <p>
     * The term to which the payment is attached
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The term to which the payment is attached")
    private Object academicPeriod;
    /**
     * Payment Type
     * <p>
     * The mode of the payment
     * (Required)
     * 
     */
    @JsonProperty("paymentType")
    @JsonPropertyDescription("The mode of the payment")
    private StudentPayments.PaymentType paymentType;
    /**
     * paid On
     * <p>
     * Date the payment was made on
     * (Required)
     * 
     */
    @JsonProperty("paidOn")
    @JsonPropertyDescription("Date the payment was made on")
    private Date paidOn;
    /**
     * Amount
     * <p>
     * Amount of the payment
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Amount of the payment")
    private Amount amount;
    /**
     * Comments
     * <p>
     * Comments about the payment
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("Comments about the payment")
    private List<String> comments = new ArrayList<String>();

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

    public StudentPayments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student-payments.
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
     * The global identifier of the student-payments.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentPayments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The person (student), who made the payment
     * (Required)
     * 
     */
    @JsonProperty("student")
    public Student getStudent() {
        return student;
    }

    /**
     * Student
     * <p>
     * The person (student), who made the payment
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentPayments withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Account Receivable Type
     * <p>
     * Account Receivable Type that the charge is associated with
     * 
     */
    @JsonProperty("accountReceivableType")
    public Object getAccountReceivableType() {
        return accountReceivableType;
    }

    /**
     * Account Receivable Type
     * <p>
     * Account Receivable Type that the charge is associated with
     * 
     */
    @JsonProperty("accountReceivableType")
    public void setAccountReceivableType(Object accountReceivableType) {
        this.accountReceivableType = accountReceivableType;
    }

    public StudentPayments withAccountReceivableType(Object accountReceivableType) {
        this.accountReceivableType = accountReceivableType;
        return this;
    }

    /**
     * Accounting Code
     * <p>
     * The accounting code to which the payment will be applied
     * 
     */
    @JsonProperty("accountingCode")
    public Object getAccountingCode() {
        return accountingCode;
    }

    /**
     * Accounting Code
     * <p>
     * The accounting code to which the payment will be applied
     * 
     */
    @JsonProperty("accountingCode")
    public void setAccountingCode(Object accountingCode) {
        this.accountingCode = accountingCode;
    }

    public StudentPayments withAccountingCode(Object accountingCode) {
        this.accountingCode = accountingCode;
        return this;
    }

    /**
     * Term
     * <p>
     * The term to which the payment is attached
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Term
     * <p>
     * The term to which the payment is attached
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public StudentPayments withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Payment Type
     * <p>
     * The mode of the payment
     * (Required)
     * 
     */
    @JsonProperty("paymentType")
    public StudentPayments.PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Payment Type
     * <p>
     * The mode of the payment
     * (Required)
     * 
     */
    @JsonProperty("paymentType")
    public void setPaymentType(StudentPayments.PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public StudentPayments withPaymentType(StudentPayments.PaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * paid On
     * <p>
     * Date the payment was made on
     * (Required)
     * 
     */
    @JsonProperty("paidOn")
    public Date getPaidOn() {
        return paidOn;
    }

    /**
     * paid On
     * <p>
     * Date the payment was made on
     * (Required)
     * 
     */
    @JsonProperty("paidOn")
    public void setPaidOn(Date paidOn) {
        this.paidOn = paidOn;
    }

    public StudentPayments withPaidOn(Date paidOn) {
        this.paidOn = paidOn;
        return this;
    }

    /**
     * Amount
     * <p>
     * Amount of the payment
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
     * Amount of the payment
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public StudentPayments withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Comments
     * <p>
     * Comments about the payment
     * 
     */
    @JsonProperty("comments")
    public List<String> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * Comments about the payment
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public StudentPayments withComments(List<String> comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentPayments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("student");
        sb.append('=');
        sb.append(((this.student == null)?"<null>":this.student));
        sb.append(',');
        sb.append("accountReceivableType");
        sb.append('=');
        sb.append(((this.accountReceivableType == null)?"<null>":this.accountReceivableType));
        sb.append(',');
        sb.append("accountingCode");
        sb.append('=');
        sb.append(((this.accountingCode == null)?"<null>":this.accountingCode));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("paymentType");
        sb.append('=');
        sb.append(((this.paymentType == null)?"<null>":this.paymentType));
        sb.append(',');
        sb.append("paidOn");
        sb.append('=');
        sb.append(((this.paidOn == null)?"<null>":this.paidOn));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.accountingCode == null)? 0 :this.accountingCode.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.accountReceivableType == null)? 0 :this.accountReceivableType.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.paidOn == null)? 0 :this.paidOn.hashCode()));
        result = ((result* 31)+((this.paymentType == null)? 0 :this.paymentType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentPayments) == false) {
            return false;
        }
        StudentPayments rhs = ((StudentPayments) other);
        return (((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.accountingCode == rhs.accountingCode)||((this.accountingCode!= null)&&this.accountingCode.equals(rhs.accountingCode))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.accountReceivableType == rhs.accountReceivableType)||((this.accountReceivableType!= null)&&this.accountReceivableType.equals(rhs.accountReceivableType))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.paidOn == rhs.paidOn)||((this.paidOn!= null)&&this.paidOn.equals(rhs.paidOn))))&&((this.paymentType == rhs.paymentType)||((this.paymentType!= null)&&this.paymentType.equals(rhs.paymentType))));
    }


    /**
     * Payment Type
     * <p>
     * The mode of the payment
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PaymentType {

        FINANCIAL_AID("financialAid"),
        DEPOSIT("deposit"),
        SPONSOR("sponsor"),
        PAYROLL("payroll"),
        CASH("cash");
        private final String value;
        private final static Map<String, StudentPayments.PaymentType> CONSTANTS = new HashMap<String, StudentPayments.PaymentType>();

        static {
            for (StudentPayments.PaymentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PaymentType(String value) {
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
        public static StudentPayments.PaymentType fromValue(String value) {
            StudentPayments.PaymentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
