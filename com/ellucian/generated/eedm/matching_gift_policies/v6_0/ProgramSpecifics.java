
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Program Specifics
 * <p>
 * Foundation program specific details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minimumMatchedAmount",
    "maximumMatchedAmount",
    "annualMaximumMatchPerEmployee",
    "matchingGiftRatio",
    "employee",
    "retiree",
    "fiscalYear",
    "giftDistributionFiscalYear",
    "employeeDeadline",
    "matchPriorCycle",
    "matchingFundsRestrictions",
    "payrollDeduction",
    "donorAdvisedFunds",
    "charitableSpendingAccounts"
})
@Generated("jsonschema2pojo")
public class ProgramSpecifics {

    /**
     * Minimum Matched Amount
     * <p>
     * Minimum amount of contribution that will be matched
     * 
     */
    @JsonProperty("minimumMatchedAmount")
    @JsonPropertyDescription("Minimum amount of contribution that will be matched")
    private MinimumMatchedAmount minimumMatchedAmount;
    /**
     * Maximum Matched Amount
     * <p>
     * Maximum amount of contribution that will be matched
     * 
     */
    @JsonProperty("maximumMatchedAmount")
    @JsonPropertyDescription("Maximum amount of contribution that will be matched")
    private MaximumMatchedAmount maximumMatchedAmount;
    /**
     * Annual Maximum Match Per Employee
     * <p>
     * Annual maximum amount of contribution that will be matched per employee
     * 
     */
    @JsonProperty("annualMaximumMatchPerEmployee")
    @JsonPropertyDescription("Annual maximum amount of contribution that will be matched per employee")
    private AnnualMaximumMatchPerEmployee annualMaximumMatchPerEmployee;
    /**
     * Matching Gift Ratio
     * <p>
     * The ratio of donation matched by the company.
     * 
     */
    @JsonProperty("matchingGiftRatio")
    @JsonPropertyDescription("The ratio of donation matched by the company.")
    private String matchingGiftRatio;
    /**
     * Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("employee")
    @JsonPropertyDescription("")
    private Employee employee;
    /**
     * Retiree
     * <p>
     * 
     * 
     */
    @JsonProperty("retiree")
    @JsonPropertyDescription("")
    private Retiree retiree;
    /**
     * Fiscal Year
     * <p>
     * Matching company’s fiscal year
     * 
     */
    @JsonProperty("fiscalYear")
    @JsonPropertyDescription("Matching company\u2019s fiscal year")
    private String fiscalYear;
    /**
     * Gift Distribution Fiscal Year
     * <p>
     * Fiscal year for gift distribution if different from company's fiscal year.
     * 
     */
    @JsonProperty("giftDistributionFiscalYear")
    @JsonPropertyDescription("Fiscal year for gift distribution if different from company's fiscal year.")
    private String giftDistributionFiscalYear;
    /**
     * Employee Deadline
     * <p>
     * The annual deadline for submitting a gift to be matched.
     * 
     */
    @JsonProperty("employeeDeadline")
    @JsonPropertyDescription("The annual deadline for submitting a gift to be matched.")
    private EmployeeDeadline employeeDeadline;
    /**
     * Match Prior Cycle
     * <p>
     * Company will match a gift submitted in a prior matching gift cycle
     * 
     */
    @JsonProperty("matchPriorCycle")
    @JsonPropertyDescription("Company will match a gift submitted in a prior matching gift cycle")
    private ProgramSpecifics.MatchPriorCycle matchPriorCycle;
    /**
     * Matching Funds Restrictions
     * <p>
     * Distribution restriction imposed on matched funds.
     * 
     */
    @JsonProperty("matchingFundsRestrictions")
    @JsonPropertyDescription("Distribution restriction imposed on matched funds.")
    private ProgramSpecifics.MatchingFundsRestrictions matchingFundsRestrictions;
    /**
     * Payroll Deduction
     * <p>
     * Payroll deduction offered and required details
     * 
     */
    @JsonProperty("payrollDeduction")
    @JsonPropertyDescription("Payroll deduction offered and required details")
    private PayrollDeduction payrollDeduction;
    /**
     * Donor Advised Funds
     * <p>
     * Donor can advice the funds to be invested.
     * 
     */
    @JsonProperty("donorAdvisedFunds")
    @JsonPropertyDescription("Donor can advice the funds to be invested.")
    private ProgramSpecifics.DonorAdvisedFunds donorAdvisedFunds;
    /**
     * Charitable Spending Accounts
     * <p>
     * Charitable Spending accounts contributions accepted.
     * 
     */
    @JsonProperty("charitableSpendingAccounts")
    @JsonPropertyDescription("Charitable Spending accounts contributions accepted.")
    private ProgramSpecifics.CharitableSpendingAccounts charitableSpendingAccounts;

    /**
     * Minimum Matched Amount
     * <p>
     * Minimum amount of contribution that will be matched
     * 
     */
    @JsonProperty("minimumMatchedAmount")
    public MinimumMatchedAmount getMinimumMatchedAmount() {
        return minimumMatchedAmount;
    }

    /**
     * Minimum Matched Amount
     * <p>
     * Minimum amount of contribution that will be matched
     * 
     */
    @JsonProperty("minimumMatchedAmount")
    public void setMinimumMatchedAmount(MinimumMatchedAmount minimumMatchedAmount) {
        this.minimumMatchedAmount = minimumMatchedAmount;
    }

    public ProgramSpecifics withMinimumMatchedAmount(MinimumMatchedAmount minimumMatchedAmount) {
        this.minimumMatchedAmount = minimumMatchedAmount;
        return this;
    }

    /**
     * Maximum Matched Amount
     * <p>
     * Maximum amount of contribution that will be matched
     * 
     */
    @JsonProperty("maximumMatchedAmount")
    public MaximumMatchedAmount getMaximumMatchedAmount() {
        return maximumMatchedAmount;
    }

    /**
     * Maximum Matched Amount
     * <p>
     * Maximum amount of contribution that will be matched
     * 
     */
    @JsonProperty("maximumMatchedAmount")
    public void setMaximumMatchedAmount(MaximumMatchedAmount maximumMatchedAmount) {
        this.maximumMatchedAmount = maximumMatchedAmount;
    }

    public ProgramSpecifics withMaximumMatchedAmount(MaximumMatchedAmount maximumMatchedAmount) {
        this.maximumMatchedAmount = maximumMatchedAmount;
        return this;
    }

    /**
     * Annual Maximum Match Per Employee
     * <p>
     * Annual maximum amount of contribution that will be matched per employee
     * 
     */
    @JsonProperty("annualMaximumMatchPerEmployee")
    public AnnualMaximumMatchPerEmployee getAnnualMaximumMatchPerEmployee() {
        return annualMaximumMatchPerEmployee;
    }

    /**
     * Annual Maximum Match Per Employee
     * <p>
     * Annual maximum amount of contribution that will be matched per employee
     * 
     */
    @JsonProperty("annualMaximumMatchPerEmployee")
    public void setAnnualMaximumMatchPerEmployee(AnnualMaximumMatchPerEmployee annualMaximumMatchPerEmployee) {
        this.annualMaximumMatchPerEmployee = annualMaximumMatchPerEmployee;
    }

    public ProgramSpecifics withAnnualMaximumMatchPerEmployee(AnnualMaximumMatchPerEmployee annualMaximumMatchPerEmployee) {
        this.annualMaximumMatchPerEmployee = annualMaximumMatchPerEmployee;
        return this;
    }

    /**
     * Matching Gift Ratio
     * <p>
     * The ratio of donation matched by the company.
     * 
     */
    @JsonProperty("matchingGiftRatio")
    public String getMatchingGiftRatio() {
        return matchingGiftRatio;
    }

    /**
     * Matching Gift Ratio
     * <p>
     * The ratio of donation matched by the company.
     * 
     */
    @JsonProperty("matchingGiftRatio")
    public void setMatchingGiftRatio(String matchingGiftRatio) {
        this.matchingGiftRatio = matchingGiftRatio;
    }

    public ProgramSpecifics withMatchingGiftRatio(String matchingGiftRatio) {
        this.matchingGiftRatio = matchingGiftRatio;
        return this;
    }

    /**
     * Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("employee")
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("employee")
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ProgramSpecifics withEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Retiree
     * <p>
     * 
     * 
     */
    @JsonProperty("retiree")
    public Retiree getRetiree() {
        return retiree;
    }

    /**
     * Retiree
     * <p>
     * 
     * 
     */
    @JsonProperty("retiree")
    public void setRetiree(Retiree retiree) {
        this.retiree = retiree;
    }

    public ProgramSpecifics withRetiree(Retiree retiree) {
        this.retiree = retiree;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Matching company’s fiscal year
     * 
     */
    @JsonProperty("fiscalYear")
    public String getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Fiscal Year
     * <p>
     * Matching company’s fiscal year
     * 
     */
    @JsonProperty("fiscalYear")
    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public ProgramSpecifics withFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
        return this;
    }

    /**
     * Gift Distribution Fiscal Year
     * <p>
     * Fiscal year for gift distribution if different from company's fiscal year.
     * 
     */
    @JsonProperty("giftDistributionFiscalYear")
    public String getGiftDistributionFiscalYear() {
        return giftDistributionFiscalYear;
    }

    /**
     * Gift Distribution Fiscal Year
     * <p>
     * Fiscal year for gift distribution if different from company's fiscal year.
     * 
     */
    @JsonProperty("giftDistributionFiscalYear")
    public void setGiftDistributionFiscalYear(String giftDistributionFiscalYear) {
        this.giftDistributionFiscalYear = giftDistributionFiscalYear;
    }

    public ProgramSpecifics withGiftDistributionFiscalYear(String giftDistributionFiscalYear) {
        this.giftDistributionFiscalYear = giftDistributionFiscalYear;
        return this;
    }

    /**
     * Employee Deadline
     * <p>
     * The annual deadline for submitting a gift to be matched.
     * 
     */
    @JsonProperty("employeeDeadline")
    public EmployeeDeadline getEmployeeDeadline() {
        return employeeDeadline;
    }

    /**
     * Employee Deadline
     * <p>
     * The annual deadline for submitting a gift to be matched.
     * 
     */
    @JsonProperty("employeeDeadline")
    public void setEmployeeDeadline(EmployeeDeadline employeeDeadline) {
        this.employeeDeadline = employeeDeadline;
    }

    public ProgramSpecifics withEmployeeDeadline(EmployeeDeadline employeeDeadline) {
        this.employeeDeadline = employeeDeadline;
        return this;
    }

    /**
     * Match Prior Cycle
     * <p>
     * Company will match a gift submitted in a prior matching gift cycle
     * 
     */
    @JsonProperty("matchPriorCycle")
    public ProgramSpecifics.MatchPriorCycle getMatchPriorCycle() {
        return matchPriorCycle;
    }

    /**
     * Match Prior Cycle
     * <p>
     * Company will match a gift submitted in a prior matching gift cycle
     * 
     */
    @JsonProperty("matchPriorCycle")
    public void setMatchPriorCycle(ProgramSpecifics.MatchPriorCycle matchPriorCycle) {
        this.matchPriorCycle = matchPriorCycle;
    }

    public ProgramSpecifics withMatchPriorCycle(ProgramSpecifics.MatchPriorCycle matchPriorCycle) {
        this.matchPriorCycle = matchPriorCycle;
        return this;
    }

    /**
     * Matching Funds Restrictions
     * <p>
     * Distribution restriction imposed on matched funds.
     * 
     */
    @JsonProperty("matchingFundsRestrictions")
    public ProgramSpecifics.MatchingFundsRestrictions getMatchingFundsRestrictions() {
        return matchingFundsRestrictions;
    }

    /**
     * Matching Funds Restrictions
     * <p>
     * Distribution restriction imposed on matched funds.
     * 
     */
    @JsonProperty("matchingFundsRestrictions")
    public void setMatchingFundsRestrictions(ProgramSpecifics.MatchingFundsRestrictions matchingFundsRestrictions) {
        this.matchingFundsRestrictions = matchingFundsRestrictions;
    }

    public ProgramSpecifics withMatchingFundsRestrictions(ProgramSpecifics.MatchingFundsRestrictions matchingFundsRestrictions) {
        this.matchingFundsRestrictions = matchingFundsRestrictions;
        return this;
    }

    /**
     * Payroll Deduction
     * <p>
     * Payroll deduction offered and required details
     * 
     */
    @JsonProperty("payrollDeduction")
    public PayrollDeduction getPayrollDeduction() {
        return payrollDeduction;
    }

    /**
     * Payroll Deduction
     * <p>
     * Payroll deduction offered and required details
     * 
     */
    @JsonProperty("payrollDeduction")
    public void setPayrollDeduction(PayrollDeduction payrollDeduction) {
        this.payrollDeduction = payrollDeduction;
    }

    public ProgramSpecifics withPayrollDeduction(PayrollDeduction payrollDeduction) {
        this.payrollDeduction = payrollDeduction;
        return this;
    }

    /**
     * Donor Advised Funds
     * <p>
     * Donor can advice the funds to be invested.
     * 
     */
    @JsonProperty("donorAdvisedFunds")
    public ProgramSpecifics.DonorAdvisedFunds getDonorAdvisedFunds() {
        return donorAdvisedFunds;
    }

    /**
     * Donor Advised Funds
     * <p>
     * Donor can advice the funds to be invested.
     * 
     */
    @JsonProperty("donorAdvisedFunds")
    public void setDonorAdvisedFunds(ProgramSpecifics.DonorAdvisedFunds donorAdvisedFunds) {
        this.donorAdvisedFunds = donorAdvisedFunds;
    }

    public ProgramSpecifics withDonorAdvisedFunds(ProgramSpecifics.DonorAdvisedFunds donorAdvisedFunds) {
        this.donorAdvisedFunds = donorAdvisedFunds;
        return this;
    }

    /**
     * Charitable Spending Accounts
     * <p>
     * Charitable Spending accounts contributions accepted.
     * 
     */
    @JsonProperty("charitableSpendingAccounts")
    public ProgramSpecifics.CharitableSpendingAccounts getCharitableSpendingAccounts() {
        return charitableSpendingAccounts;
    }

    /**
     * Charitable Spending Accounts
     * <p>
     * Charitable Spending accounts contributions accepted.
     * 
     */
    @JsonProperty("charitableSpendingAccounts")
    public void setCharitableSpendingAccounts(ProgramSpecifics.CharitableSpendingAccounts charitableSpendingAccounts) {
        this.charitableSpendingAccounts = charitableSpendingAccounts;
    }

    public ProgramSpecifics withCharitableSpendingAccounts(ProgramSpecifics.CharitableSpendingAccounts charitableSpendingAccounts) {
        this.charitableSpendingAccounts = charitableSpendingAccounts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramSpecifics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("minimumMatchedAmount");
        sb.append('=');
        sb.append(((this.minimumMatchedAmount == null)?"<null>":this.minimumMatchedAmount));
        sb.append(',');
        sb.append("maximumMatchedAmount");
        sb.append('=');
        sb.append(((this.maximumMatchedAmount == null)?"<null>":this.maximumMatchedAmount));
        sb.append(',');
        sb.append("annualMaximumMatchPerEmployee");
        sb.append('=');
        sb.append(((this.annualMaximumMatchPerEmployee == null)?"<null>":this.annualMaximumMatchPerEmployee));
        sb.append(',');
        sb.append("matchingGiftRatio");
        sb.append('=');
        sb.append(((this.matchingGiftRatio == null)?"<null>":this.matchingGiftRatio));
        sb.append(',');
        sb.append("employee");
        sb.append('=');
        sb.append(((this.employee == null)?"<null>":this.employee));
        sb.append(',');
        sb.append("retiree");
        sb.append('=');
        sb.append(((this.retiree == null)?"<null>":this.retiree));
        sb.append(',');
        sb.append("fiscalYear");
        sb.append('=');
        sb.append(((this.fiscalYear == null)?"<null>":this.fiscalYear));
        sb.append(',');
        sb.append("giftDistributionFiscalYear");
        sb.append('=');
        sb.append(((this.giftDistributionFiscalYear == null)?"<null>":this.giftDistributionFiscalYear));
        sb.append(',');
        sb.append("employeeDeadline");
        sb.append('=');
        sb.append(((this.employeeDeadline == null)?"<null>":this.employeeDeadline));
        sb.append(',');
        sb.append("matchPriorCycle");
        sb.append('=');
        sb.append(((this.matchPriorCycle == null)?"<null>":this.matchPriorCycle));
        sb.append(',');
        sb.append("matchingFundsRestrictions");
        sb.append('=');
        sb.append(((this.matchingFundsRestrictions == null)?"<null>":this.matchingFundsRestrictions));
        sb.append(',');
        sb.append("payrollDeduction");
        sb.append('=');
        sb.append(((this.payrollDeduction == null)?"<null>":this.payrollDeduction));
        sb.append(',');
        sb.append("donorAdvisedFunds");
        sb.append('=');
        sb.append(((this.donorAdvisedFunds == null)?"<null>":this.donorAdvisedFunds));
        sb.append(',');
        sb.append("charitableSpendingAccounts");
        sb.append('=');
        sb.append(((this.charitableSpendingAccounts == null)?"<null>":this.charitableSpendingAccounts));
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
        result = ((result* 31)+((this.payrollDeduction == null)? 0 :this.payrollDeduction.hashCode()));
        result = ((result* 31)+((this.minimumMatchedAmount == null)? 0 :this.minimumMatchedAmount.hashCode()));
        result = ((result* 31)+((this.giftDistributionFiscalYear == null)? 0 :this.giftDistributionFiscalYear.hashCode()));
        result = ((result* 31)+((this.donorAdvisedFunds == null)? 0 :this.donorAdvisedFunds.hashCode()));
        result = ((result* 31)+((this.annualMaximumMatchPerEmployee == null)? 0 :this.annualMaximumMatchPerEmployee.hashCode()));
        result = ((result* 31)+((this.employee == null)? 0 :this.employee.hashCode()));
        result = ((result* 31)+((this.charitableSpendingAccounts == null)? 0 :this.charitableSpendingAccounts.hashCode()));
        result = ((result* 31)+((this.maximumMatchedAmount == null)? 0 :this.maximumMatchedAmount.hashCode()));
        result = ((result* 31)+((this.matchingGiftRatio == null)? 0 :this.matchingGiftRatio.hashCode()));
        result = ((result* 31)+((this.retiree == null)? 0 :this.retiree.hashCode()));
        result = ((result* 31)+((this.employeeDeadline == null)? 0 :this.employeeDeadline.hashCode()));
        result = ((result* 31)+((this.matchingFundsRestrictions == null)? 0 :this.matchingFundsRestrictions.hashCode()));
        result = ((result* 31)+((this.matchPriorCycle == null)? 0 :this.matchPriorCycle.hashCode()));
        result = ((result* 31)+((this.fiscalYear == null)? 0 :this.fiscalYear.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramSpecifics) == false) {
            return false;
        }
        ProgramSpecifics rhs = ((ProgramSpecifics) other);
        return (((((((((((((((this.payrollDeduction == rhs.payrollDeduction)||((this.payrollDeduction!= null)&&this.payrollDeduction.equals(rhs.payrollDeduction)))&&((this.minimumMatchedAmount == rhs.minimumMatchedAmount)||((this.minimumMatchedAmount!= null)&&this.minimumMatchedAmount.equals(rhs.minimumMatchedAmount))))&&((this.giftDistributionFiscalYear == rhs.giftDistributionFiscalYear)||((this.giftDistributionFiscalYear!= null)&&this.giftDistributionFiscalYear.equals(rhs.giftDistributionFiscalYear))))&&((this.donorAdvisedFunds == rhs.donorAdvisedFunds)||((this.donorAdvisedFunds!= null)&&this.donorAdvisedFunds.equals(rhs.donorAdvisedFunds))))&&((this.annualMaximumMatchPerEmployee == rhs.annualMaximumMatchPerEmployee)||((this.annualMaximumMatchPerEmployee!= null)&&this.annualMaximumMatchPerEmployee.equals(rhs.annualMaximumMatchPerEmployee))))&&((this.employee == rhs.employee)||((this.employee!= null)&&this.employee.equals(rhs.employee))))&&((this.charitableSpendingAccounts == rhs.charitableSpendingAccounts)||((this.charitableSpendingAccounts!= null)&&this.charitableSpendingAccounts.equals(rhs.charitableSpendingAccounts))))&&((this.maximumMatchedAmount == rhs.maximumMatchedAmount)||((this.maximumMatchedAmount!= null)&&this.maximumMatchedAmount.equals(rhs.maximumMatchedAmount))))&&((this.matchingGiftRatio == rhs.matchingGiftRatio)||((this.matchingGiftRatio!= null)&&this.matchingGiftRatio.equals(rhs.matchingGiftRatio))))&&((this.retiree == rhs.retiree)||((this.retiree!= null)&&this.retiree.equals(rhs.retiree))))&&((this.employeeDeadline == rhs.employeeDeadline)||((this.employeeDeadline!= null)&&this.employeeDeadline.equals(rhs.employeeDeadline))))&&((this.matchingFundsRestrictions == rhs.matchingFundsRestrictions)||((this.matchingFundsRestrictions!= null)&&this.matchingFundsRestrictions.equals(rhs.matchingFundsRestrictions))))&&((this.matchPriorCycle == rhs.matchPriorCycle)||((this.matchPriorCycle!= null)&&this.matchPriorCycle.equals(rhs.matchPriorCycle))))&&((this.fiscalYear == rhs.fiscalYear)||((this.fiscalYear!= null)&&this.fiscalYear.equals(rhs.fiscalYear))));
    }


    /**
     * Charitable Spending Accounts
     * <p>
     * Charitable Spending accounts contributions accepted.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CharitableSpendingAccounts {

        ACCEPTED("accepted"),
        NOT_ACCEPTED("notAccepted");
        private final String value;
        private final static Map<String, ProgramSpecifics.CharitableSpendingAccounts> CONSTANTS = new HashMap<String, ProgramSpecifics.CharitableSpendingAccounts>();

        static {
            for (ProgramSpecifics.CharitableSpendingAccounts c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CharitableSpendingAccounts(String value) {
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
        public static ProgramSpecifics.CharitableSpendingAccounts fromValue(String value) {
            ProgramSpecifics.CharitableSpendingAccounts constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Donor Advised Funds
     * <p>
     * Donor can advice the funds to be invested.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DonorAdvisedFunds {

        ACCEPTED("accepted"),
        NOT_ACCEPTED("notAccepted");
        private final String value;
        private final static Map<String, ProgramSpecifics.DonorAdvisedFunds> CONSTANTS = new HashMap<String, ProgramSpecifics.DonorAdvisedFunds>();

        static {
            for (ProgramSpecifics.DonorAdvisedFunds c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DonorAdvisedFunds(String value) {
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
        public static ProgramSpecifics.DonorAdvisedFunds fromValue(String value) {
            ProgramSpecifics.DonorAdvisedFunds constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Matching Funds Restrictions
     * <p>
     * Distribution restriction imposed on matched funds.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MatchingFundsRestrictions {

        UNRESTRICTED("unrestricted"),
        FOLLOW_DONORS_DESIGNATION("followDonorsDesignation"),
        APPLY_TO_GENERAL_FUND("applyToGeneralFund");
        private final String value;
        private final static Map<String, ProgramSpecifics.MatchingFundsRestrictions> CONSTANTS = new HashMap<String, ProgramSpecifics.MatchingFundsRestrictions>();

        static {
            for (ProgramSpecifics.MatchingFundsRestrictions c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MatchingFundsRestrictions(String value) {
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
        public static ProgramSpecifics.MatchingFundsRestrictions fromValue(String value) {
            ProgramSpecifics.MatchingFundsRestrictions constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Match Prior Cycle
     * <p>
     * Company will match a gift submitted in a prior matching gift cycle
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MatchPriorCycle {

        ALLOWED("allowed"),
        NOT_ALLOWED("notAllowed");
        private final String value;
        private final static Map<String, ProgramSpecifics.MatchPriorCycle> CONSTANTS = new HashMap<String, ProgramSpecifics.MatchPriorCycle>();

        static {
            for (ProgramSpecifics.MatchPriorCycle c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MatchPriorCycle(String value) {
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
        public static ProgramSpecifics.MatchPriorCycle fromValue(String value) {
            ProgramSpecifics.MatchPriorCycle constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
