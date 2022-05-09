
package com.ellucian.generated.eedm.financial_aid_funds.v9_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "aidYear",
    "office",
    "budgetedAmount",
    "maximumOfferedBudgetAmount",
    "minimumAwardAmount",
    "maximumAwardAmount"
})
@Generated("jsonschema2pojo")
public class Financial {

    /**
     * Aid Year
     * <p>
     * The year that the financial aid fund is available for.
     * (Required)
     * 
     */
    @JsonProperty("aidYear")
    @JsonPropertyDescription("The year that the financial aid fund is available for.")
    private AidYear aidYear;
    /**
     * Office
     * <p>
     * The financial aid office handling the funds.
     * 
     */
    @JsonProperty("office")
    @JsonPropertyDescription("The financial aid office handling the funds.")
    private Object office;
    /**
     * Budgeted Amount
     * <p>
     * Maximum total amount that can be accepted by all students for a given financial aid year and office.
     * (Required)
     * 
     */
    @JsonProperty("budgetedAmount")
    @JsonPropertyDescription("Maximum total amount that can be accepted by all students for a given financial aid year and office.")
    private BudgetedAmount budgetedAmount;
    /**
     * Maximum Offered Budget Amount
     * <p>
     * Maximum total amount that may be offered to all students for a given financial aid year and office, assuming not all offers will be accepted.
     * 
     */
    @JsonProperty("maximumOfferedBudgetAmount")
    @JsonPropertyDescription("Maximum total amount that may be offered to all students for a given financial aid year and office, assuming not all offers will be accepted.")
    private Object maximumOfferedBudgetAmount;
    /**
     * Minimum Award Amount
     * <p>
     * Minimum amount that may be awarded for an individual award.
     * 
     */
    @JsonProperty("minimumAwardAmount")
    @JsonPropertyDescription("Minimum amount that may be awarded for an individual award.")
    private Object minimumAwardAmount;
    /**
     * Maximum Award Amount
     * <p>
     * Maximum amount that may be awarded for an individual award.
     * 
     */
    @JsonProperty("maximumAwardAmount")
    @JsonPropertyDescription("Maximum amount that may be awarded for an individual award.")
    private Object maximumAwardAmount;

    /**
     * Aid Year
     * <p>
     * The year that the financial aid fund is available for.
     * (Required)
     * 
     */
    @JsonProperty("aidYear")
    public AidYear getAidYear() {
        return aidYear;
    }

    /**
     * Aid Year
     * <p>
     * The year that the financial aid fund is available for.
     * (Required)
     * 
     */
    @JsonProperty("aidYear")
    public void setAidYear(AidYear aidYear) {
        this.aidYear = aidYear;
    }

    public Financial withAidYear(AidYear aidYear) {
        this.aidYear = aidYear;
        return this;
    }

    /**
     * Office
     * <p>
     * The financial aid office handling the funds.
     * 
     */
    @JsonProperty("office")
    public Object getOffice() {
        return office;
    }

    /**
     * Office
     * <p>
     * The financial aid office handling the funds.
     * 
     */
    @JsonProperty("office")
    public void setOffice(Object office) {
        this.office = office;
    }

    public Financial withOffice(Object office) {
        this.office = office;
        return this;
    }

    /**
     * Budgeted Amount
     * <p>
     * Maximum total amount that can be accepted by all students for a given financial aid year and office.
     * (Required)
     * 
     */
    @JsonProperty("budgetedAmount")
    public BudgetedAmount getBudgetedAmount() {
        return budgetedAmount;
    }

    /**
     * Budgeted Amount
     * <p>
     * Maximum total amount that can be accepted by all students for a given financial aid year and office.
     * (Required)
     * 
     */
    @JsonProperty("budgetedAmount")
    public void setBudgetedAmount(BudgetedAmount budgetedAmount) {
        this.budgetedAmount = budgetedAmount;
    }

    public Financial withBudgetedAmount(BudgetedAmount budgetedAmount) {
        this.budgetedAmount = budgetedAmount;
        return this;
    }

    /**
     * Maximum Offered Budget Amount
     * <p>
     * Maximum total amount that may be offered to all students for a given financial aid year and office, assuming not all offers will be accepted.
     * 
     */
    @JsonProperty("maximumOfferedBudgetAmount")
    public Object getMaximumOfferedBudgetAmount() {
        return maximumOfferedBudgetAmount;
    }

    /**
     * Maximum Offered Budget Amount
     * <p>
     * Maximum total amount that may be offered to all students for a given financial aid year and office, assuming not all offers will be accepted.
     * 
     */
    @JsonProperty("maximumOfferedBudgetAmount")
    public void setMaximumOfferedBudgetAmount(Object maximumOfferedBudgetAmount) {
        this.maximumOfferedBudgetAmount = maximumOfferedBudgetAmount;
    }

    public Financial withMaximumOfferedBudgetAmount(Object maximumOfferedBudgetAmount) {
        this.maximumOfferedBudgetAmount = maximumOfferedBudgetAmount;
        return this;
    }

    /**
     * Minimum Award Amount
     * <p>
     * Minimum amount that may be awarded for an individual award.
     * 
     */
    @JsonProperty("minimumAwardAmount")
    public Object getMinimumAwardAmount() {
        return minimumAwardAmount;
    }

    /**
     * Minimum Award Amount
     * <p>
     * Minimum amount that may be awarded for an individual award.
     * 
     */
    @JsonProperty("minimumAwardAmount")
    public void setMinimumAwardAmount(Object minimumAwardAmount) {
        this.minimumAwardAmount = minimumAwardAmount;
    }

    public Financial withMinimumAwardAmount(Object minimumAwardAmount) {
        this.minimumAwardAmount = minimumAwardAmount;
        return this;
    }

    /**
     * Maximum Award Amount
     * <p>
     * Maximum amount that may be awarded for an individual award.
     * 
     */
    @JsonProperty("maximumAwardAmount")
    public Object getMaximumAwardAmount() {
        return maximumAwardAmount;
    }

    /**
     * Maximum Award Amount
     * <p>
     * Maximum amount that may be awarded for an individual award.
     * 
     */
    @JsonProperty("maximumAwardAmount")
    public void setMaximumAwardAmount(Object maximumAwardAmount) {
        this.maximumAwardAmount = maximumAwardAmount;
    }

    public Financial withMaximumAwardAmount(Object maximumAwardAmount) {
        this.maximumAwardAmount = maximumAwardAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Financial.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aidYear");
        sb.append('=');
        sb.append(((this.aidYear == null)?"<null>":this.aidYear));
        sb.append(',');
        sb.append("office");
        sb.append('=');
        sb.append(((this.office == null)?"<null>":this.office));
        sb.append(',');
        sb.append("budgetedAmount");
        sb.append('=');
        sb.append(((this.budgetedAmount == null)?"<null>":this.budgetedAmount));
        sb.append(',');
        sb.append("maximumOfferedBudgetAmount");
        sb.append('=');
        sb.append(((this.maximumOfferedBudgetAmount == null)?"<null>":this.maximumOfferedBudgetAmount));
        sb.append(',');
        sb.append("minimumAwardAmount");
        sb.append('=');
        sb.append(((this.minimumAwardAmount == null)?"<null>":this.minimumAwardAmount));
        sb.append(',');
        sb.append("maximumAwardAmount");
        sb.append('=');
        sb.append(((this.maximumAwardAmount == null)?"<null>":this.maximumAwardAmount));
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
        result = ((result* 31)+((this.maximumAwardAmount == null)? 0 :this.maximumAwardAmount.hashCode()));
        result = ((result* 31)+((this.minimumAwardAmount == null)? 0 :this.minimumAwardAmount.hashCode()));
        result = ((result* 31)+((this.maximumOfferedBudgetAmount == null)? 0 :this.maximumOfferedBudgetAmount.hashCode()));
        result = ((result* 31)+((this.office == null)? 0 :this.office.hashCode()));
        result = ((result* 31)+((this.aidYear == null)? 0 :this.aidYear.hashCode()));
        result = ((result* 31)+((this.budgetedAmount == null)? 0 :this.budgetedAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Financial) == false) {
            return false;
        }
        Financial rhs = ((Financial) other);
        return (((((((this.maximumAwardAmount == rhs.maximumAwardAmount)||((this.maximumAwardAmount!= null)&&this.maximumAwardAmount.equals(rhs.maximumAwardAmount)))&&((this.minimumAwardAmount == rhs.minimumAwardAmount)||((this.minimumAwardAmount!= null)&&this.minimumAwardAmount.equals(rhs.minimumAwardAmount))))&&((this.maximumOfferedBudgetAmount == rhs.maximumOfferedBudgetAmount)||((this.maximumOfferedBudgetAmount!= null)&&this.maximumOfferedBudgetAmount.equals(rhs.maximumOfferedBudgetAmount))))&&((this.office == rhs.office)||((this.office!= null)&&this.office.equals(rhs.office))))&&((this.aidYear == rhs.aidYear)||((this.aidYear!= null)&&this.aidYear.equals(rhs.aidYear))))&&((this.budgetedAmount == rhs.budgetedAmount)||((this.budgetedAmount!= null)&&this.budgetedAmount.equals(rhs.budgetedAmount))));
    }

}
