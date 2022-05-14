
package com.ellucian.generated.eedm.student_payments.v11_0;

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
 * Details of payments made by students.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "fundingSource",
    "fundingDestination",
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
     * The global identifier of the student payment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student payment.")
    private String id;
    /**
     * Student
     * <p>
     * The person (student) who made the payment.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The person (student) who made the payment.")
    private Student student;
    /**
     * Funding Source
     * <p>
     * The accounting code of the funding source associated with the student payment.
     * (Required)
     * 
     */
    @JsonProperty("fundingSource")
    @JsonPropertyDescription("The accounting code of the funding source associated with the student payment.")
    private FundingSource fundingSource;
    /**
     * Funding Destination
     * <p>
     * The accounting code of the funding destination associated with the student payment.
     * 
     */
    @JsonProperty("fundingDestination")
    @JsonPropertyDescription("The accounting code of the funding destination associated with the student payment.")
    private Object fundingDestination;
    /**
     * Academic Period
     * <p>
     * The academic period to which the payment is attached.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period to which the payment is attached.")
    private Object academicPeriod;
    /**
     * Payment Type
     * <p>
     * The type of the payment.
     * (Required)
     * 
     */
    @JsonProperty("paymentType")
    @JsonPropertyDescription("The type of the payment.")
    private StudentPayments.PaymentType paymentType;
    /**
     * paid On
     * <p>
     * The date when the payment was made.
     * (Required)
     * 
     */
    @JsonProperty("paidOn")
    @JsonPropertyDescription("The date when the payment was made.")
    private Date paidOn;
    /**
     * Amount
     * <p>
     * The amount of the payment.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount of the payment.")
    private Amount amount;
    /**
     * Comments
     * <p>
     * The comments associated with the payment.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments associated with the payment.")
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
     * The global identifier of the student payment.
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
     * The global identifier of the student payment.
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
     * The person (student) who made the payment.
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
     * The person (student) who made the payment.
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
     * Funding Source
     * <p>
     * The accounting code of the funding source associated with the student payment.
     * (Required)
     * 
     */
    @JsonProperty("fundingSource")
    public FundingSource getFundingSource() {
        return fundingSource;
    }

    /**
     * Funding Source
     * <p>
     * The accounting code of the funding source associated with the student payment.
     * (Required)
     * 
     */
    @JsonProperty("fundingSource")
    public void setFundingSource(FundingSource fundingSource) {
        this.fundingSource = fundingSource;
    }

    public StudentPayments withFundingSource(FundingSource fundingSource) {
        this.fundingSource = fundingSource;
        return this;
    }

    /**
     * Funding Destination
     * <p>
     * The accounting code of the funding destination associated with the student payment.
     * 
     */
    @JsonProperty("fundingDestination")
    public Object getFundingDestination() {
        return fundingDestination;
    }

    /**
     * Funding Destination
     * <p>
     * The accounting code of the funding destination associated with the student payment.
     * 
     */
    @JsonProperty("fundingDestination")
    public void setFundingDestination(Object fundingDestination) {
        this.fundingDestination = fundingDestination;
    }

    public StudentPayments withFundingDestination(Object fundingDestination) {
        this.fundingDestination = fundingDestination;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period to which the payment is attached.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period to which the payment is attached.
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
     * The type of the payment.
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
     * The type of the payment.
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
     * The date when the payment was made.
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
     * The date when the payment was made.
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
     * The amount of the payment.
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
     * The amount of the payment.
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
     * The comments associated with the payment.
     * 
     */
    @JsonProperty("comments")
    public List<String> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the payment.
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
        sb.append("fundingSource");
        sb.append('=');
        sb.append(((this.fundingSource == null)?"<null>":this.fundingSource));
        sb.append(',');
        sb.append("fundingDestination");
        sb.append('=');
        sb.append(((this.fundingDestination == null)?"<null>":this.fundingDestination));
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
        result = ((result* 31)+((this.fundingDestination == null)? 0 :this.fundingDestination.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.fundingSource == null)? 0 :this.fundingSource.hashCode()));
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
        return (((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.fundingDestination == rhs.fundingDestination)||((this.fundingDestination!= null)&&this.fundingDestination.equals(rhs.fundingDestination))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.fundingSource == rhs.fundingSource)||((this.fundingSource!= null)&&this.fundingSource.equals(rhs.fundingSource))))&&((this.paidOn == rhs.paidOn)||((this.paidOn!= null)&&this.paidOn.equals(rhs.paidOn))))&&((this.paymentType == rhs.paymentType)||((this.paymentType!= null)&&this.paymentType.equals(rhs.paymentType))));
    }


    /**
     * Payment Type
     * <p>
     * The type of the payment.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PaymentType {

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
