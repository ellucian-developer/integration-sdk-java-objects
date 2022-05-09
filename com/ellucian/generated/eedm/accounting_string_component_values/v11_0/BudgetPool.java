
package com.ellucian.generated.eedm.accounting_string_component_values.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fiscalYear",
    "accountingComponent"
})
@Generated("jsonschema2pojo")
public class BudgetPool {

    /**
     * Fiscal Year
     * <p>
     * The fiscal year associated with the budget pool.
     * (Required)
     * 
     */
    @JsonProperty("fiscalYear")
    @JsonPropertyDescription("The fiscal year associated with the budget pool.")
    private FiscalYear fiscalYear;
    /**
     * Accounting Component
     * <p>
     * The pool account associated with the accounting string component value.
     * (Required)
     * 
     */
    @JsonProperty("accountingComponent")
    @JsonPropertyDescription("The pool account associated with the accounting string component value.")
    private AccountingComponent accountingComponent;

    /**
     * Fiscal Year
     * <p>
     * The fiscal year associated with the budget pool.
     * (Required)
     * 
     */
    @JsonProperty("fiscalYear")
    public FiscalYear getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Fiscal Year
     * <p>
     * The fiscal year associated with the budget pool.
     * (Required)
     * 
     */
    @JsonProperty("fiscalYear")
    public void setFiscalYear(FiscalYear fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public BudgetPool withFiscalYear(FiscalYear fiscalYear) {
        this.fiscalYear = fiscalYear;
        return this;
    }

    /**
     * Accounting Component
     * <p>
     * The pool account associated with the accounting string component value.
     * (Required)
     * 
     */
    @JsonProperty("accountingComponent")
    public AccountingComponent getAccountingComponent() {
        return accountingComponent;
    }

    /**
     * Accounting Component
     * <p>
     * The pool account associated with the accounting string component value.
     * (Required)
     * 
     */
    @JsonProperty("accountingComponent")
    public void setAccountingComponent(AccountingComponent accountingComponent) {
        this.accountingComponent = accountingComponent;
    }

    public BudgetPool withAccountingComponent(AccountingComponent accountingComponent) {
        this.accountingComponent = accountingComponent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BudgetPool.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fiscalYear");
        sb.append('=');
        sb.append(((this.fiscalYear == null)?"<null>":this.fiscalYear));
        sb.append(',');
        sb.append("accountingComponent");
        sb.append('=');
        sb.append(((this.accountingComponent == null)?"<null>":this.accountingComponent));
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
        result = ((result* 31)+((this.accountingComponent == null)? 0 :this.accountingComponent.hashCode()));
        result = ((result* 31)+((this.fiscalYear == null)? 0 :this.fiscalYear.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BudgetPool) == false) {
            return false;
        }
        BudgetPool rhs = ((BudgetPool) other);
        return (((this.accountingComponent == rhs.accountingComponent)||((this.accountingComponent!= null)&&this.accountingComponent.equals(rhs.accountingComponent)))&&((this.fiscalYear == rhs.fiscalYear)||((this.fiscalYear!= null)&&this.fiscalYear.equals(rhs.fiscalYear))));
    }

}
