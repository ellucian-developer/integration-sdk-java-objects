
package com.ellucian.generated.eedm.contribution_payroll_deductions.v8_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contribution Payroll Deductions
 * <p>
 * The details of payroll deductions related to contributions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "arrangement",
    "deductedOn",
    "amount"
})
@Generated("jsonschema2pojo")
public class ContributionPayrollDeductions {

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
     * The global identifier of the contribution payroll-deduction.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the contribution payroll-deduction.")
    private String id;
    /**
     * Arrangement
     * <p>
     * The arrangement details related to the payroll deduction.
     * (Required)
     * 
     */
    @JsonProperty("arrangement")
    @JsonPropertyDescription("The arrangement details related to the payroll deduction.")
    private Arrangement arrangement;
    /**
     * Deducted On
     * <p>
     * The date the payroll deduction was made.
     * (Required)
     * 
     */
    @JsonProperty("deductedOn")
    @JsonPropertyDescription("The date the payroll deduction was made.")
    private String deductedOn;
    /**
     * Amount
     * <p>
     * The amount that was deducted from the payroll.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount that was deducted from the payroll.")
    private Amount amount;

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

    public ContributionPayrollDeductions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the contribution payroll-deduction.
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
     * The global identifier of the contribution payroll-deduction.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ContributionPayrollDeductions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Arrangement
     * <p>
     * The arrangement details related to the payroll deduction.
     * (Required)
     * 
     */
    @JsonProperty("arrangement")
    public Arrangement getArrangement() {
        return arrangement;
    }

    /**
     * Arrangement
     * <p>
     * The arrangement details related to the payroll deduction.
     * (Required)
     * 
     */
    @JsonProperty("arrangement")
    public void setArrangement(Arrangement arrangement) {
        this.arrangement = arrangement;
    }

    public ContributionPayrollDeductions withArrangement(Arrangement arrangement) {
        this.arrangement = arrangement;
        return this;
    }

    /**
     * Deducted On
     * <p>
     * The date the payroll deduction was made.
     * (Required)
     * 
     */
    @JsonProperty("deductedOn")
    public String getDeductedOn() {
        return deductedOn;
    }

    /**
     * Deducted On
     * <p>
     * The date the payroll deduction was made.
     * (Required)
     * 
     */
    @JsonProperty("deductedOn")
    public void setDeductedOn(String deductedOn) {
        this.deductedOn = deductedOn;
    }

    public ContributionPayrollDeductions withDeductedOn(String deductedOn) {
        this.deductedOn = deductedOn;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount that was deducted from the payroll.
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
     * The amount that was deducted from the payroll.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public ContributionPayrollDeductions withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContributionPayrollDeductions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("arrangement");
        sb.append('=');
        sb.append(((this.arrangement == null)?"<null>":this.arrangement));
        sb.append(',');
        sb.append("deductedOn");
        sb.append('=');
        sb.append(((this.deductedOn == null)?"<null>":this.deductedOn));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        result = ((result* 31)+((this.arrangement == null)? 0 :this.arrangement.hashCode()));
        result = ((result* 31)+((this.deductedOn == null)? 0 :this.deductedOn.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContributionPayrollDeductions) == false) {
            return false;
        }
        ContributionPayrollDeductions rhs = ((ContributionPayrollDeductions) other);
        return ((((((this.arrangement == rhs.arrangement)||((this.arrangement!= null)&&this.arrangement.equals(rhs.arrangement)))&&((this.deductedOn == rhs.deductedOn)||((this.deductedOn!= null)&&this.deductedOn.equals(rhs.deductedOn))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
