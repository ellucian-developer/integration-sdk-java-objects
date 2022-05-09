
package com.ellucian.generated.eedm.student_charges.v16_0_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Charges
 * <p>
 * Charges incurred by a student.
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
    "chargeableOn",
    "chargedAmount",
    "reportingDetail",
    "overrideDescription",
    "comments"
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
     * The person (student) who incurred the charge.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The person (student) who incurred the charge.")
    private Student student;
    /**
     * Funding Source
     * <p>
     * The accounting code of the funding source associated with the student charge.
     * 
     */
    @JsonProperty("fundingSource")
    @JsonPropertyDescription("The accounting code of the funding source associated with the student charge.")
    private Object fundingSource;
    /**
     * Funding Destination
     * <p>
     * The accounting code of the funding destination associated with the student charge.
     * (Required)
     * 
     */
    @JsonProperty("fundingDestination")
    @JsonPropertyDescription("The accounting code of the funding destination associated with the student charge.")
    private FundingDestination fundingDestination;
    /**
     * Academic Period
     * <p>
     * The term in which charges were incurred.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The term in which charges were incurred.")
    private AcademicPeriod academicPeriod;
    /**
     * Chargeable On
     * <p>
     * The date when the student becomes liable for the charge.
     * (Required)
     * 
     */
    @JsonProperty("chargeableOn")
    @JsonPropertyDescription("The date when the student becomes liable for the charge.")
    private Date chargeableOn;
    /**
     * Charged Amount
     * <p>
     * The amount of the charge.
     * (Required)
     * 
     */
    @JsonProperty("chargedAmount")
    @JsonPropertyDescription("The amount of the charge.")
    private Object chargedAmount;
    /**
     * Reporting Detail
     * <p>
     * Attributes specific to the transaction when identified for tax reporting only.
     * 
     */
    @JsonProperty("reportingDetail")
    @JsonPropertyDescription("Attributes specific to the transaction when identified for tax reporting only.")
    private Object reportingDetail;
    /**
     * Override Description
     * <p>
     * The override description associated with the charge.
     * 
     */
    @JsonProperty("overrideDescription")
    @JsonPropertyDescription("The override description associated with the charge.")
    private String overrideDescription;
    /**
     * Comments
     * <p>
     * The comments associated with the charge.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments associated with the charge.")
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
     * The person (student) who incurred the charge.
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
     * The person (student) who incurred the charge.
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
     * Funding Source
     * <p>
     * The accounting code of the funding source associated with the student charge.
     * 
     */
    @JsonProperty("fundingSource")
    public Object getFundingSource() {
        return fundingSource;
    }

    /**
     * Funding Source
     * <p>
     * The accounting code of the funding source associated with the student charge.
     * 
     */
    @JsonProperty("fundingSource")
    public void setFundingSource(Object fundingSource) {
        this.fundingSource = fundingSource;
    }

    public StudentCharges withFundingSource(Object fundingSource) {
        this.fundingSource = fundingSource;
        return this;
    }

    /**
     * Funding Destination
     * <p>
     * The accounting code of the funding destination associated with the student charge.
     * (Required)
     * 
     */
    @JsonProperty("fundingDestination")
    public FundingDestination getFundingDestination() {
        return fundingDestination;
    }

    /**
     * Funding Destination
     * <p>
     * The accounting code of the funding destination associated with the student charge.
     * (Required)
     * 
     */
    @JsonProperty("fundingDestination")
    public void setFundingDestination(FundingDestination fundingDestination) {
        this.fundingDestination = fundingDestination;
    }

    public StudentCharges withFundingDestination(FundingDestination fundingDestination) {
        this.fundingDestination = fundingDestination;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The term in which charges were incurred.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    public AcademicPeriod getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The term in which charges were incurred.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public StudentCharges withAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Chargeable On
     * <p>
     * The date when the student becomes liable for the charge.
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
     * The date when the student becomes liable for the charge.
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
     * Charged Amount
     * <p>
     * The amount of the charge.
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
     * The amount of the charge.
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

    /**
     * Reporting Detail
     * <p>
     * Attributes specific to the transaction when identified for tax reporting only.
     * 
     */
    @JsonProperty("reportingDetail")
    public Object getReportingDetail() {
        return reportingDetail;
    }

    /**
     * Reporting Detail
     * <p>
     * Attributes specific to the transaction when identified for tax reporting only.
     * 
     */
    @JsonProperty("reportingDetail")
    public void setReportingDetail(Object reportingDetail) {
        this.reportingDetail = reportingDetail;
    }

    public StudentCharges withReportingDetail(Object reportingDetail) {
        this.reportingDetail = reportingDetail;
        return this;
    }

    /**
     * Override Description
     * <p>
     * The override description associated with the charge.
     * 
     */
    @JsonProperty("overrideDescription")
    public String getOverrideDescription() {
        return overrideDescription;
    }

    /**
     * Override Description
     * <p>
     * The override description associated with the charge.
     * 
     */
    @JsonProperty("overrideDescription")
    public void setOverrideDescription(String overrideDescription) {
        this.overrideDescription = overrideDescription;
    }

    public StudentCharges withOverrideDescription(String overrideDescription) {
        this.overrideDescription = overrideDescription;
        return this;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the charge.
     * 
     */
    @JsonProperty("comments")
    public List<String> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the charge.
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
        sb.append("chargeableOn");
        sb.append('=');
        sb.append(((this.chargeableOn == null)?"<null>":this.chargeableOn));
        sb.append(',');
        sb.append("chargedAmount");
        sb.append('=');
        sb.append(((this.chargedAmount == null)?"<null>":this.chargedAmount));
        sb.append(',');
        sb.append("reportingDetail");
        sb.append('=');
        sb.append(((this.reportingDetail == null)?"<null>":this.reportingDetail));
        sb.append(',');
        sb.append("overrideDescription");
        sb.append('=');
        sb.append(((this.overrideDescription == null)?"<null>":this.overrideDescription));
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
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.chargedAmount == null)? 0 :this.chargedAmount.hashCode()));
        result = ((result* 31)+((this.overrideDescription == null)? 0 :this.overrideDescription.hashCode()));
        result = ((result* 31)+((this.chargeableOn == null)? 0 :this.chargeableOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.fundingSource == null)? 0 :this.fundingSource.hashCode()));
        result = ((result* 31)+((this.reportingDetail == null)? 0 :this.reportingDetail.hashCode()));
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
        return ((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.fundingDestination == rhs.fundingDestination)||((this.fundingDestination!= null)&&this.fundingDestination.equals(rhs.fundingDestination))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.chargedAmount == rhs.chargedAmount)||((this.chargedAmount!= null)&&this.chargedAmount.equals(rhs.chargedAmount))))&&((this.overrideDescription == rhs.overrideDescription)||((this.overrideDescription!= null)&&this.overrideDescription.equals(rhs.overrideDescription))))&&((this.chargeableOn == rhs.chargeableOn)||((this.chargeableOn!= null)&&this.chargeableOn.equals(rhs.chargeableOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.fundingSource == rhs.fundingSource)||((this.fundingSource!= null)&&this.fundingSource.equals(rhs.fundingSource))))&&((this.reportingDetail == rhs.reportingDetail)||((this.reportingDetail!= null)&&this.reportingDetail.equals(rhs.reportingDetail))));
    }

}
