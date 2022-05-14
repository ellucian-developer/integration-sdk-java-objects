
package com.ellucian.generated.eedm.student_charges.v6_0;

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
 * Student Charges
 * <p>
 * Charges for expenses incurred by a student.
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
    "chargeType",
    "chargeableOn",
    "comments",
    "chargedAmount"
})
@Generated("jsonschema2pojo")
public class StudentCharges {

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
     * The global identifier of the student charge.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student charge.")
    private String id;
    /**
     * Student
     * <p>
     * The person (student), who incurred the charge
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The person (student), who incurred the charge")
    private Student student;
    /**
     * Account Receivable Type
     * <p>
     * The account receivable type the charge is attached to
     * 
     */
    @JsonProperty("accountReceivableType")
    @JsonPropertyDescription("The account receivable type the charge is attached to")
    private Object accountReceivableType;
    /**
     * Accounting Code
     * <p>
     * Accounting Code the charge is associated with
     * 
     */
    @JsonProperty("accountingCode")
    @JsonPropertyDescription("Accounting Code the charge is associated with")
    private Object accountingCode;
    /**
     * Academic Period
     * <p>
     * The term the charges are incurred in
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The term the charges are incurred in")
    private Object academicPeriod;
    /**
     * Charge Type
     * <p>
     * Type of the charge the student incurred
     * 
     */
    @JsonProperty("chargeType")
    @JsonPropertyDescription("Type of the charge the student incurred")
    private StudentCharges.ChargeType chargeType;
    /**
     * Chargeable On
     * <p>
     * The date when the student becomes liable for the charge
     * (Required)
     * 
     */
    @JsonProperty("chargeableOn")
    @JsonPropertyDescription("The date when the student becomes liable for the charge")
    private Date chargeableOn;
    /**
     * Comments
     * <p>
     * Comments of the charges
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("Comments of the charges")
    private List<String> comments = new ArrayList<String>();
    /**
     * Charged Amount
     * <p>
     * The amount of the charge
     * (Required)
     * 
     */
    @JsonProperty("chargedAmount")
    @JsonPropertyDescription("The amount of the charge")
    private Object chargedAmount;

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

    public StudentCharges withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student charge.
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
     * The global identifier of the student charge.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentCharges withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The person (student), who incurred the charge
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
     * The person (student), who incurred the charge
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentCharges withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Account Receivable Type
     * <p>
     * The account receivable type the charge is attached to
     * 
     */
    @JsonProperty("accountReceivableType")
    public Object getAccountReceivableType() {
        return accountReceivableType;
    }

    /**
     * Account Receivable Type
     * <p>
     * The account receivable type the charge is attached to
     * 
     */
    @JsonProperty("accountReceivableType")
    public void setAccountReceivableType(Object accountReceivableType) {
        this.accountReceivableType = accountReceivableType;
    }

    public StudentCharges withAccountReceivableType(Object accountReceivableType) {
        this.accountReceivableType = accountReceivableType;
        return this;
    }

    /**
     * Accounting Code
     * <p>
     * Accounting Code the charge is associated with
     * 
     */
    @JsonProperty("accountingCode")
    public Object getAccountingCode() {
        return accountingCode;
    }

    /**
     * Accounting Code
     * <p>
     * Accounting Code the charge is associated with
     * 
     */
    @JsonProperty("accountingCode")
    public void setAccountingCode(Object accountingCode) {
        this.accountingCode = accountingCode;
    }

    public StudentCharges withAccountingCode(Object accountingCode) {
        this.accountingCode = accountingCode;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The term the charges are incurred in
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The term the charges are incurred in
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public StudentCharges withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Charge Type
     * <p>
     * Type of the charge the student incurred
     * 
     */
    @JsonProperty("chargeType")
    public StudentCharges.ChargeType getChargeType() {
        return chargeType;
    }

    /**
     * Charge Type
     * <p>
     * Type of the charge the student incurred
     * 
     */
    @JsonProperty("chargeType")
    public void setChargeType(StudentCharges.ChargeType chargeType) {
        this.chargeType = chargeType;
    }

    public StudentCharges withChargeType(StudentCharges.ChargeType chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    /**
     * Chargeable On
     * <p>
     * The date when the student becomes liable for the charge
     * (Required)
     * 
     */
    @JsonProperty("chargeableOn")
    public Date getChargeableOn() {
        return chargeableOn;
    }

    /**
     * Chargeable On
     * <p>
     * The date when the student becomes liable for the charge
     * (Required)
     * 
     */
    @JsonProperty("chargeableOn")
    public void setChargeableOn(Date chargeableOn) {
        this.chargeableOn = chargeableOn;
    }

    public StudentCharges withChargeableOn(Date chargeableOn) {
        this.chargeableOn = chargeableOn;
        return this;
    }

    /**
     * Comments
     * <p>
     * Comments of the charges
     * 
     */
    @JsonProperty("comments")
    public List<String> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * Comments of the charges
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public StudentCharges withComments(List<String> comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Charged Amount
     * <p>
     * The amount of the charge
     * (Required)
     * 
     */
    @JsonProperty("chargedAmount")
    public Object getChargedAmount() {
        return chargedAmount;
    }

    /**
     * Charged Amount
     * <p>
     * The amount of the charge
     * (Required)
     * 
     */
    @JsonProperty("chargedAmount")
    public void setChargedAmount(Object chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public StudentCharges withChargedAmount(Object chargedAmount) {
        this.chargedAmount = chargedAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCharges.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("chargeType");
        sb.append('=');
        sb.append(((this.chargeType == null)?"<null>":this.chargeType));
        sb.append(',');
        sb.append("chargeableOn");
        sb.append('=');
        sb.append(((this.chargeableOn == null)?"<null>":this.chargeableOn));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("chargedAmount");
        sb.append('=');
        sb.append(((this.chargedAmount == null)?"<null>":this.chargedAmount));
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
        result = ((result* 31)+((this.accountingCode == null)? 0 :this.accountingCode.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.accountReceivableType == null)? 0 :this.accountReceivableType.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.chargeType == null)? 0 :this.chargeType.hashCode()));
        result = ((result* 31)+((this.chargedAmount == null)? 0 :this.chargedAmount.hashCode()));
        result = ((result* 31)+((this.chargeableOn == null)? 0 :this.chargeableOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCharges) == false) {
            return false;
        }
        StudentCharges rhs = ((StudentCharges) other);
        return (((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.accountingCode == rhs.accountingCode)||((this.accountingCode!= null)&&this.accountingCode.equals(rhs.accountingCode))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.accountReceivableType == rhs.accountReceivableType)||((this.accountReceivableType!= null)&&this.accountReceivableType.equals(rhs.accountReceivableType))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.chargeType == rhs.chargeType)||((this.chargeType!= null)&&this.chargeType.equals(rhs.chargeType))))&&((this.chargedAmount == rhs.chargedAmount)||((this.chargedAmount!= null)&&this.chargedAmount.equals(rhs.chargedAmount))))&&((this.chargeableOn == rhs.chargeableOn)||((this.chargeableOn!= null)&&this.chargeableOn.equals(rhs.chargeableOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))));
    }


    /**
     * Charge Type
     * <p>
     * Type of the charge the student incurred
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ChargeType {

        TUITION("tuition"),
        FEE("fee"),
        HOUSING("housing"),
        MEAL("meal");
        private final String value;
        private final static Map<String, StudentCharges.ChargeType> CONSTANTS = new HashMap<String, StudentCharges.ChargeType>();

        static {
            for (StudentCharges.ChargeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ChargeType(String value) {
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
        public static StudentCharges.ChargeType fromValue(String value) {
            StudentCharges.ChargeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
