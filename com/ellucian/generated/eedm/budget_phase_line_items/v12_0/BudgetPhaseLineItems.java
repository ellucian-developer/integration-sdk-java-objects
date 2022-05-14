
package com.ellucian.generated.eedm.budget_phase_line_items.v12_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Budget Phase Line Items
 * <p>
 * Budget details separated by line.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "budgetPhase",
    "accountingStringComponentValues",
    "amount",
    "comment"
})
@Generated("jsonschema2pojo")
public class BudgetPhaseLineItems {

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
     * The global identifier of the budget phase line item.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the budget phase line item.")
    private String id;
    /**
     * Budget Phase
     * <p>
     * The budget phase to which the line item belongs.
     * (Required)
     * 
     */
    @JsonProperty("budgetPhase")
    @JsonPropertyDescription("The budget phase to which the line item belongs.")
    private BudgetPhase budgetPhase;
    /**
     * Accounting String Component Values
     * <p>
     * The accounting string details of the line item.
     * 
     */
    @JsonProperty("accountingStringComponentValues")
    @JsonPropertyDescription("The accounting string details of the line item.")
    private List<AccountingStringComponentValue> accountingStringComponentValues = new ArrayList<AccountingStringComponentValue>();
    /**
     * Amount
     * <p>
     * The amount associated with the line item.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount associated with the line item.")
    private Object amount;
    /**
     * Comment
     * <p>
     * The comment associated with the line item.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the line item.")
    private String comment;

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

    public BudgetPhaseLineItems withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the budget phase line item.
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
     * The global identifier of the budget phase line item.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public BudgetPhaseLineItems withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Budget Phase
     * <p>
     * The budget phase to which the line item belongs.
     * (Required)
     * 
     */
    @JsonProperty("budgetPhase")
    public BudgetPhase getBudgetPhase() {
        return budgetPhase;
    }

    /**
     * Budget Phase
     * <p>
     * The budget phase to which the line item belongs.
     * (Required)
     * 
     */
    @JsonProperty("budgetPhase")
    public void setBudgetPhase(BudgetPhase budgetPhase) {
        this.budgetPhase = budgetPhase;
    }

    public BudgetPhaseLineItems withBudgetPhase(BudgetPhase budgetPhase) {
        this.budgetPhase = budgetPhase;
        return this;
    }

    /**
     * Accounting String Component Values
     * <p>
     * The accounting string details of the line item.
     * 
     */
    @JsonProperty("accountingStringComponentValues")
    public List<AccountingStringComponentValue> getAccountingStringComponentValues() {
        return accountingStringComponentValues;
    }

    /**
     * Accounting String Component Values
     * <p>
     * The accounting string details of the line item.
     * 
     */
    @JsonProperty("accountingStringComponentValues")
    public void setAccountingStringComponentValues(List<AccountingStringComponentValue> accountingStringComponentValues) {
        this.accountingStringComponentValues = accountingStringComponentValues;
    }

    public BudgetPhaseLineItems withAccountingStringComponentValues(List<AccountingStringComponentValue> accountingStringComponentValues) {
        this.accountingStringComponentValues = accountingStringComponentValues;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount associated with the line item.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount associated with the line item.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public BudgetPhaseLineItems withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the line item.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the line item.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public BudgetPhaseLineItems withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BudgetPhaseLineItems.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("budgetPhase");
        sb.append('=');
        sb.append(((this.budgetPhase == null)?"<null>":this.budgetPhase));
        sb.append(',');
        sb.append("accountingStringComponentValues");
        sb.append('=');
        sb.append(((this.accountingStringComponentValues == null)?"<null>":this.accountingStringComponentValues));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.budgetPhase == null)? 0 :this.budgetPhase.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.accountingStringComponentValues == null)? 0 :this.accountingStringComponentValues.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BudgetPhaseLineItems) == false) {
            return false;
        }
        BudgetPhaseLineItems rhs = ((BudgetPhaseLineItems) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.budgetPhase == rhs.budgetPhase)||((this.budgetPhase!= null)&&this.budgetPhase.equals(rhs.budgetPhase))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.accountingStringComponentValues == rhs.accountingStringComponentValues)||((this.accountingStringComponentValues!= null)&&this.accountingStringComponentValues.equals(rhs.accountingStringComponentValues))));
    }

}
