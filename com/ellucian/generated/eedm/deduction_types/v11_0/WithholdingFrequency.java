
package com.ellucian.generated.eedm.deduction_types.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Withholding Frequency
 * <p>
 * The withholding frequency associated with the deduction type.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cyclesPerYear",
    "payrollPeriods"
})
@Generated("jsonschema2pojo")
public class WithholdingFrequency {

    /**
     * Cycles Per Year
     * <p>
     * The number of cycles per year.
     * 
     */
    @JsonProperty("cyclesPerYear")
    @JsonPropertyDescription("The number of cycles per year.")
    private Object cyclesPerYear;
    /**
     * Payroll Periods
     * <p>
     * The payroll periods in which the deduction type can be withheld.
     * 
     */
    @JsonProperty("payrollPeriods")
    @JsonPropertyDescription("The payroll periods in which the deduction type can be withheld.")
    private List<PayrollPeriod> payrollPeriods = new ArrayList<PayrollPeriod>();

    /**
     * Cycles Per Year
     * <p>
     * The number of cycles per year.
     * 
     */
    @JsonProperty("cyclesPerYear")
    public Object getCyclesPerYear() {
        return cyclesPerYear;
    }

    /**
     * Cycles Per Year
     * <p>
     * The number of cycles per year.
     * 
     */
    @JsonProperty("cyclesPerYear")
    public void setCyclesPerYear(Object cyclesPerYear) {
        this.cyclesPerYear = cyclesPerYear;
    }

    public WithholdingFrequency withCyclesPerYear(Object cyclesPerYear) {
        this.cyclesPerYear = cyclesPerYear;
        return this;
    }

    /**
     * Payroll Periods
     * <p>
     * The payroll periods in which the deduction type can be withheld.
     * 
     */
    @JsonProperty("payrollPeriods")
    public List<PayrollPeriod> getPayrollPeriods() {
        return payrollPeriods;
    }

    /**
     * Payroll Periods
     * <p>
     * The payroll periods in which the deduction type can be withheld.
     * 
     */
    @JsonProperty("payrollPeriods")
    public void setPayrollPeriods(List<PayrollPeriod> payrollPeriods) {
        this.payrollPeriods = payrollPeriods;
    }

    public WithholdingFrequency withPayrollPeriods(List<PayrollPeriod> payrollPeriods) {
        this.payrollPeriods = payrollPeriods;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WithholdingFrequency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cyclesPerYear");
        sb.append('=');
        sb.append(((this.cyclesPerYear == null)?"<null>":this.cyclesPerYear));
        sb.append(',');
        sb.append("payrollPeriods");
        sb.append('=');
        sb.append(((this.payrollPeriods == null)?"<null>":this.payrollPeriods));
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
        result = ((result* 31)+((this.cyclesPerYear == null)? 0 :this.cyclesPerYear.hashCode()));
        result = ((result* 31)+((this.payrollPeriods == null)? 0 :this.payrollPeriods.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WithholdingFrequency) == false) {
            return false;
        }
        WithholdingFrequency rhs = ((WithholdingFrequency) other);
        return (((this.cyclesPerYear == rhs.cyclesPerYear)||((this.cyclesPerYear!= null)&&this.cyclesPerYear.equals(rhs.cyclesPerYear)))&&((this.payrollPeriods == rhs.payrollPeriods)||((this.payrollPeriods!= null)&&this.payrollPeriods.equals(rhs.payrollPeriods))));
    }

}
