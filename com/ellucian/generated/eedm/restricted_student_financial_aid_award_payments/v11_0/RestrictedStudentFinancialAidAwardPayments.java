
package com.ellucian.generated.eedm.restricted_student_financial_aid_award_payments.v11_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Restricted Student Financial Aid Award Payments
 * <p>
 * Financial aid award payments applied to students' accounts when the knowledge of awards is restricted.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "award",
    "fundingDestination",
    "paidOn",
    "amount",
    "academicPeriod",
    "awardPeriod"
})
@Generated("jsonschema2pojo")
public class RestrictedStudentFinancialAidAwardPayments {

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
     * The global identifier of the student financial aid award payment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student financial aid award payment.")
    private String id;
    /**
     * Award
     * <p>
     * The financial aid award associated with the payment.
     * (Required)
     * 
     */
    @JsonProperty("award")
    @JsonPropertyDescription("The financial aid award associated with the payment.")
    private Award award;
    /**
     * Funding Destination
     * <p>
     * The accounting code of the funding destination associated with the payment.
     * 
     */
    @JsonProperty("fundingDestination")
    @JsonPropertyDescription("The accounting code of the funding destination associated with the payment.")
    private Object fundingDestination;
    /**
     * Paid On
     * <p>
     * The date of the payment.
     * (Required)
     * 
     */
    @JsonProperty("paidOn")
    @JsonPropertyDescription("The date of the payment.")
    private String paidOn;
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
     * Academic Period
     * <p>
     * The academic period associated with the payment.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period associated with the payment.")
    private Object academicPeriod;
    /**
     * Award Period
     * <p>
     * The financial aid award period associated with the payment.
     * (Required)
     * 
     */
    @JsonProperty("awardPeriod")
    @JsonPropertyDescription("The financial aid award period associated with the payment.")
    private AwardPeriod awardPeriod;

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

    public RestrictedStudentFinancialAidAwardPayments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student financial aid award payment.
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
     * The global identifier of the student financial aid award payment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RestrictedStudentFinancialAidAwardPayments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Award
     * <p>
     * The financial aid award associated with the payment.
     * (Required)
     * 
     */
    @JsonProperty("award")
    public Award getAward() {
        return award;
    }

    /**
     * Award
     * <p>
     * The financial aid award associated with the payment.
     * (Required)
     * 
     */
    @JsonProperty("award")
    public void setAward(Award award) {
        this.award = award;
    }

    public RestrictedStudentFinancialAidAwardPayments withAward(Award award) {
        this.award = award;
        return this;
    }

    /**
     * Funding Destination
     * <p>
     * The accounting code of the funding destination associated with the payment.
     * 
     */
    @JsonProperty("fundingDestination")
    public Object getFundingDestination() {
        return fundingDestination;
    }

    /**
     * Funding Destination
     * <p>
     * The accounting code of the funding destination associated with the payment.
     * 
     */
    @JsonProperty("fundingDestination")
    public void setFundingDestination(Object fundingDestination) {
        this.fundingDestination = fundingDestination;
    }

    public RestrictedStudentFinancialAidAwardPayments withFundingDestination(Object fundingDestination) {
        this.fundingDestination = fundingDestination;
        return this;
    }

    /**
     * Paid On
     * <p>
     * The date of the payment.
     * (Required)
     * 
     */
    @JsonProperty("paidOn")
    public String getPaidOn() {
        return paidOn;
    }

    /**
     * Paid On
     * <p>
     * The date of the payment.
     * (Required)
     * 
     */
    @JsonProperty("paidOn")
    public void setPaidOn(String paidOn) {
        this.paidOn = paidOn;
    }

    public RestrictedStudentFinancialAidAwardPayments withPaidOn(String paidOn) {
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

    public RestrictedStudentFinancialAidAwardPayments withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period associated with the payment.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period associated with the payment.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public RestrictedStudentFinancialAidAwardPayments withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Award Period
     * <p>
     * The financial aid award period associated with the payment.
     * (Required)
     * 
     */
    @JsonProperty("awardPeriod")
    public AwardPeriod getAwardPeriod() {
        return awardPeriod;
    }

    /**
     * Award Period
     * <p>
     * The financial aid award period associated with the payment.
     * (Required)
     * 
     */
    @JsonProperty("awardPeriod")
    public void setAwardPeriod(AwardPeriod awardPeriod) {
        this.awardPeriod = awardPeriod;
    }

    public RestrictedStudentFinancialAidAwardPayments withAwardPeriod(AwardPeriod awardPeriod) {
        this.awardPeriod = awardPeriod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RestrictedStudentFinancialAidAwardPayments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("award");
        sb.append('=');
        sb.append(((this.award == null)?"<null>":this.award));
        sb.append(',');
        sb.append("fundingDestination");
        sb.append('=');
        sb.append(((this.fundingDestination == null)?"<null>":this.fundingDestination));
        sb.append(',');
        sb.append("paidOn");
        sb.append('=');
        sb.append(((this.paidOn == null)?"<null>":this.paidOn));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("awardPeriod");
        sb.append('=');
        sb.append(((this.awardPeriod == null)?"<null>":this.awardPeriod));
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
        result = ((result* 31)+((this.award == null)? 0 :this.award.hashCode()));
        result = ((result* 31)+((this.awardPeriod == null)? 0 :this.awardPeriod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.paidOn == null)? 0 :this.paidOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RestrictedStudentFinancialAidAwardPayments) == false) {
            return false;
        }
        RestrictedStudentFinancialAidAwardPayments rhs = ((RestrictedStudentFinancialAidAwardPayments) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.fundingDestination == rhs.fundingDestination)||((this.fundingDestination!= null)&&this.fundingDestination.equals(rhs.fundingDestination))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.award == rhs.award)||((this.award!= null)&&this.award.equals(rhs.award))))&&((this.awardPeriod == rhs.awardPeriod)||((this.awardPeriod!= null)&&this.awardPeriod.equals(rhs.awardPeriod))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.paidOn == rhs.paidOn)||((this.paidOn!= null)&&this.paidOn.equals(rhs.paidOn))));
    }

}
