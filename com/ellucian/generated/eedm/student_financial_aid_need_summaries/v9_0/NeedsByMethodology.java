
package com.ellucian.generated.eedm.student_financial_aid_need_summaries.v9_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "methodology",
    "applicationOutcome",
    "budgetDuration",
    "costOfAttendance",
    "expectedFamilyContribution",
    "grossNeed",
    "needReduction"
})
@Generated("jsonschema2pojo")
public class NeedsByMethodology {

    /**
     * Methodology
     * <p>
     * The methodology used to determine the applicant's financial aid need (federal or institutional).
     * (Required)
     * 
     */
    @JsonProperty("methodology")
    @JsonPropertyDescription("The methodology used to determine the applicant's financial aid need (federal or institutional).")
    private NeedsByMethodology.Methodology methodology;
    /**
     * Application Outcome
     * <p>
     * The result of the applicant's financial aid application analysis based on the specified methodology.
     * (Required)
     * 
     */
    @JsonProperty("applicationOutcome")
    @JsonPropertyDescription("The result of the applicant's financial aid application analysis based on the specified methodology.")
    private ApplicationOutcome applicationOutcome;
    /**
     * Budget Duration
     * <p>
     * The number of months for which the budget is applicable based on the specified methodology.
     * 
     */
    @JsonProperty("budgetDuration")
    @JsonPropertyDescription("The number of months for which the budget is applicable based on the specified methodology.")
    private Object budgetDuration;
    /**
     * Cost Of Attendance
     * <p>
     * The estimated cost for the applicant to attend the institution for the aid year based on the specified methodology.
     * 
     */
    @JsonProperty("costOfAttendance")
    @JsonPropertyDescription("The estimated cost for the applicant to attend the institution for the aid year based on the specified methodology.")
    private Object costOfAttendance;
    /**
     * Expected Family Contribution
     * <p>
     * The total amount that the applicant and/or parent(s) are expected to contribute during the aid year based on the specified methodology.
     * 
     */
    @JsonProperty("expectedFamilyContribution")
    @JsonPropertyDescription("The total amount that the applicant and/or parent(s) are expected to contribute during the aid year based on the specified methodology.")
    private Object expectedFamilyContribution;
    /**
     * Gross Need
     * <p>
     * The total cost of attendance less the expected family contribution based on the specified methodology.
     * 
     */
    @JsonProperty("grossNeed")
    @JsonPropertyDescription("The total cost of attendance less the expected family contribution based on the specified methodology.")
    private Object grossNeed;
    /**
     * Need Reduction
     * <p>
     * The financial aid resources managed by the financial aid office which reduce financial need based on the specified methodology.
     * 
     */
    @JsonProperty("needReduction")
    @JsonPropertyDescription("The financial aid resources managed by the financial aid office which reduce financial need based on the specified methodology.")
    private Object needReduction;

    /**
     * Methodology
     * <p>
     * The methodology used to determine the applicant's financial aid need (federal or institutional).
     * (Required)
     * 
     */
    @JsonProperty("methodology")
    public NeedsByMethodology.Methodology getMethodology() {
        return methodology;
    }

    /**
     * Methodology
     * <p>
     * The methodology used to determine the applicant's financial aid need (federal or institutional).
     * (Required)
     * 
     */
    @JsonProperty("methodology")
    public void setMethodology(NeedsByMethodology.Methodology methodology) {
        this.methodology = methodology;
    }

    public NeedsByMethodology withMethodology(NeedsByMethodology.Methodology methodology) {
        this.methodology = methodology;
        return this;
    }

    /**
     * Application Outcome
     * <p>
     * The result of the applicant's financial aid application analysis based on the specified methodology.
     * (Required)
     * 
     */
    @JsonProperty("applicationOutcome")
    public ApplicationOutcome getApplicationOutcome() {
        return applicationOutcome;
    }

    /**
     * Application Outcome
     * <p>
     * The result of the applicant's financial aid application analysis based on the specified methodology.
     * (Required)
     * 
     */
    @JsonProperty("applicationOutcome")
    public void setApplicationOutcome(ApplicationOutcome applicationOutcome) {
        this.applicationOutcome = applicationOutcome;
    }

    public NeedsByMethodology withApplicationOutcome(ApplicationOutcome applicationOutcome) {
        this.applicationOutcome = applicationOutcome;
        return this;
    }

    /**
     * Budget Duration
     * <p>
     * The number of months for which the budget is applicable based on the specified methodology.
     * 
     */
    @JsonProperty("budgetDuration")
    public Object getBudgetDuration() {
        return budgetDuration;
    }

    /**
     * Budget Duration
     * <p>
     * The number of months for which the budget is applicable based on the specified methodology.
     * 
     */
    @JsonProperty("budgetDuration")
    public void setBudgetDuration(Object budgetDuration) {
        this.budgetDuration = budgetDuration;
    }

    public NeedsByMethodology withBudgetDuration(Object budgetDuration) {
        this.budgetDuration = budgetDuration;
        return this;
    }

    /**
     * Cost Of Attendance
     * <p>
     * The estimated cost for the applicant to attend the institution for the aid year based on the specified methodology.
     * 
     */
    @JsonProperty("costOfAttendance")
    public Object getCostOfAttendance() {
        return costOfAttendance;
    }

    /**
     * Cost Of Attendance
     * <p>
     * The estimated cost for the applicant to attend the institution for the aid year based on the specified methodology.
     * 
     */
    @JsonProperty("costOfAttendance")
    public void setCostOfAttendance(Object costOfAttendance) {
        this.costOfAttendance = costOfAttendance;
    }

    public NeedsByMethodology withCostOfAttendance(Object costOfAttendance) {
        this.costOfAttendance = costOfAttendance;
        return this;
    }

    /**
     * Expected Family Contribution
     * <p>
     * The total amount that the applicant and/or parent(s) are expected to contribute during the aid year based on the specified methodology.
     * 
     */
    @JsonProperty("expectedFamilyContribution")
    public Object getExpectedFamilyContribution() {
        return expectedFamilyContribution;
    }

    /**
     * Expected Family Contribution
     * <p>
     * The total amount that the applicant and/or parent(s) are expected to contribute during the aid year based on the specified methodology.
     * 
     */
    @JsonProperty("expectedFamilyContribution")
    public void setExpectedFamilyContribution(Object expectedFamilyContribution) {
        this.expectedFamilyContribution = expectedFamilyContribution;
    }

    public NeedsByMethodology withExpectedFamilyContribution(Object expectedFamilyContribution) {
        this.expectedFamilyContribution = expectedFamilyContribution;
        return this;
    }

    /**
     * Gross Need
     * <p>
     * The total cost of attendance less the expected family contribution based on the specified methodology.
     * 
     */
    @JsonProperty("grossNeed")
    public Object getGrossNeed() {
        return grossNeed;
    }

    /**
     * Gross Need
     * <p>
     * The total cost of attendance less the expected family contribution based on the specified methodology.
     * 
     */
    @JsonProperty("grossNeed")
    public void setGrossNeed(Object grossNeed) {
        this.grossNeed = grossNeed;
    }

    public NeedsByMethodology withGrossNeed(Object grossNeed) {
        this.grossNeed = grossNeed;
        return this;
    }

    /**
     * Need Reduction
     * <p>
     * The financial aid resources managed by the financial aid office which reduce financial need based on the specified methodology.
     * 
     */
    @JsonProperty("needReduction")
    public Object getNeedReduction() {
        return needReduction;
    }

    /**
     * Need Reduction
     * <p>
     * The financial aid resources managed by the financial aid office which reduce financial need based on the specified methodology.
     * 
     */
    @JsonProperty("needReduction")
    public void setNeedReduction(Object needReduction) {
        this.needReduction = needReduction;
    }

    public NeedsByMethodology withNeedReduction(Object needReduction) {
        this.needReduction = needReduction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NeedsByMethodology.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("methodology");
        sb.append('=');
        sb.append(((this.methodology == null)?"<null>":this.methodology));
        sb.append(',');
        sb.append("applicationOutcome");
        sb.append('=');
        sb.append(((this.applicationOutcome == null)?"<null>":this.applicationOutcome));
        sb.append(',');
        sb.append("budgetDuration");
        sb.append('=');
        sb.append(((this.budgetDuration == null)?"<null>":this.budgetDuration));
        sb.append(',');
        sb.append("costOfAttendance");
        sb.append('=');
        sb.append(((this.costOfAttendance == null)?"<null>":this.costOfAttendance));
        sb.append(',');
        sb.append("expectedFamilyContribution");
        sb.append('=');
        sb.append(((this.expectedFamilyContribution == null)?"<null>":this.expectedFamilyContribution));
        sb.append(',');
        sb.append("grossNeed");
        sb.append('=');
        sb.append(((this.grossNeed == null)?"<null>":this.grossNeed));
        sb.append(',');
        sb.append("needReduction");
        sb.append('=');
        sb.append(((this.needReduction == null)?"<null>":this.needReduction));
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
        result = ((result* 31)+((this.needReduction == null)? 0 :this.needReduction.hashCode()));
        result = ((result* 31)+((this.grossNeed == null)? 0 :this.grossNeed.hashCode()));
        result = ((result* 31)+((this.budgetDuration == null)? 0 :this.budgetDuration.hashCode()));
        result = ((result* 31)+((this.expectedFamilyContribution == null)? 0 :this.expectedFamilyContribution.hashCode()));
        result = ((result* 31)+((this.costOfAttendance == null)? 0 :this.costOfAttendance.hashCode()));
        result = ((result* 31)+((this.applicationOutcome == null)? 0 :this.applicationOutcome.hashCode()));
        result = ((result* 31)+((this.methodology == null)? 0 :this.methodology.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NeedsByMethodology) == false) {
            return false;
        }
        NeedsByMethodology rhs = ((NeedsByMethodology) other);
        return ((((((((this.needReduction == rhs.needReduction)||((this.needReduction!= null)&&this.needReduction.equals(rhs.needReduction)))&&((this.grossNeed == rhs.grossNeed)||((this.grossNeed!= null)&&this.grossNeed.equals(rhs.grossNeed))))&&((this.budgetDuration == rhs.budgetDuration)||((this.budgetDuration!= null)&&this.budgetDuration.equals(rhs.budgetDuration))))&&((this.expectedFamilyContribution == rhs.expectedFamilyContribution)||((this.expectedFamilyContribution!= null)&&this.expectedFamilyContribution.equals(rhs.expectedFamilyContribution))))&&((this.costOfAttendance == rhs.costOfAttendance)||((this.costOfAttendance!= null)&&this.costOfAttendance.equals(rhs.costOfAttendance))))&&((this.applicationOutcome == rhs.applicationOutcome)||((this.applicationOutcome!= null)&&this.applicationOutcome.equals(rhs.applicationOutcome))))&&((this.methodology == rhs.methodology)||((this.methodology!= null)&&this.methodology.equals(rhs.methodology))));
    }


    /**
     * Methodology
     * <p>
     * The methodology used to determine the applicant's financial aid need (federal or institutional).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Methodology {

        INSTITUTIONAL("institutional"),
        FEDERAL("federal");
        private final String value;
        private final static Map<String, NeedsByMethodology.Methodology> CONSTANTS = new HashMap<String, NeedsByMethodology.Methodology>();

        static {
            for (NeedsByMethodology.Methodology c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Methodology(String value) {
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
        public static NeedsByMethodology.Methodology fromValue(String value) {
            NeedsByMethodology.Methodology constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
