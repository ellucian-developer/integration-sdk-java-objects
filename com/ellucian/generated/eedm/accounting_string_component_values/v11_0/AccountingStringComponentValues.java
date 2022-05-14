
package com.ellucian.generated.eedm.accounting_string_component_values.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Accounting String Component Values
 * <p>
 * The details of an accounting string component.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "value",
    "description",
    "component",
    "determiningComponent",
    "relatedComponentDefaults",
    "parentComponent",
    "transactionStatus",
    "type",
    "budgetPools"
})
@Generated("jsonschema2pojo")
public class AccountingStringComponentValues {

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
     * The global identifier of the accounting string component value.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the accounting string component value.")
    private String id;
    /**
     * Value
     * <p>
     * The value of the accounting string component.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The value of the accounting string component.")
    private String value;
    /**
     * Description
     * <p>
     * The description of the accounting string component value.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the accounting string component value.")
    private String description;
    /**
     * Component
     * <p>
     * Accounting string component used in the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("component")
    @JsonPropertyDescription("Accounting string component used in the accounting string.")
    private Component component;
    /**
     * Determining Component
     * <p>
     * The accounting string component identifying a relationship with a prerequisite domain component.
     * 
     */
    @JsonProperty("determiningComponent")
    @JsonPropertyDescription("The accounting string component identifying a relationship with a prerequisite domain component.")
    private Object determiningComponent;
    /**
     * Related Component Defaults
     * <p>
     * The default accounting string component values related to this component value
     * 
     */
    @JsonProperty("relatedComponentDefaults")
    @JsonPropertyDescription("The default accounting string component values related to this component value")
    private List<RelatedComponentDefault> relatedComponentDefaults = new ArrayList<RelatedComponentDefault>();
    /**
     * Parent Component
     * <p>
     * The accounting string component that is one level higher in the component hierarchy.
     * 
     */
    @JsonProperty("parentComponent")
    @JsonPropertyDescription("The accounting string component that is one level higher in the component hierarchy.")
    private Object parentComponent;
    /**
     * Transaction Status
     * <p>
     * Indicates if accounting string component value is available for transaction entry.
     * 
     */
    @JsonProperty("transactionStatus")
    @JsonPropertyDescription("Indicates if accounting string component value is available for transaction entry.")
    private Object transactionStatus;
    /**
     * Type
     * <p>
     * Type of the account component.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the account component.")
    private Object type;
    /**
     * Budget Pools
     * <p>
     * The pool accounts associated with the accounting string component value by fiscal year.
     * 
     */
    @JsonProperty("budgetPools")
    @JsonPropertyDescription("The pool accounts associated with the accounting string component value by fiscal year.")
    private List<BudgetPool> budgetPools = new ArrayList<BudgetPool>();

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

    public AccountingStringComponentValues withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the accounting string component value.
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
     * The global identifier of the accounting string component value.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AccountingStringComponentValues withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Value
     * <p>
     * The value of the accounting string component.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The value of the accounting string component.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public AccountingStringComponentValues withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the accounting string component value.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the accounting string component value.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AccountingStringComponentValues withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Component
     * <p>
     * Accounting string component used in the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("component")
    public Component getComponent() {
        return component;
    }

    /**
     * Component
     * <p>
     * Accounting string component used in the accounting string.
     * (Required)
     * 
     */
    @JsonProperty("component")
    public void setComponent(Component component) {
        this.component = component;
    }

    public AccountingStringComponentValues withComponent(Component component) {
        this.component = component;
        return this;
    }

    /**
     * Determining Component
     * <p>
     * The accounting string component identifying a relationship with a prerequisite domain component.
     * 
     */
    @JsonProperty("determiningComponent")
    public Object getDeterminingComponent() {
        return determiningComponent;
    }

    /**
     * Determining Component
     * <p>
     * The accounting string component identifying a relationship with a prerequisite domain component.
     * 
     */
    @JsonProperty("determiningComponent")
    public void setDeterminingComponent(Object determiningComponent) {
        this.determiningComponent = determiningComponent;
    }

    public AccountingStringComponentValues withDeterminingComponent(Object determiningComponent) {
        this.determiningComponent = determiningComponent;
        return this;
    }

    /**
     * Related Component Defaults
     * <p>
     * The default accounting string component values related to this component value
     * 
     */
    @JsonProperty("relatedComponentDefaults")
    public List<RelatedComponentDefault> getRelatedComponentDefaults() {
        return relatedComponentDefaults;
    }

    /**
     * Related Component Defaults
     * <p>
     * The default accounting string component values related to this component value
     * 
     */
    @JsonProperty("relatedComponentDefaults")
    public void setRelatedComponentDefaults(List<RelatedComponentDefault> relatedComponentDefaults) {
        this.relatedComponentDefaults = relatedComponentDefaults;
    }

    public AccountingStringComponentValues withRelatedComponentDefaults(List<RelatedComponentDefault> relatedComponentDefaults) {
        this.relatedComponentDefaults = relatedComponentDefaults;
        return this;
    }

    /**
     * Parent Component
     * <p>
     * The accounting string component that is one level higher in the component hierarchy.
     * 
     */
    @JsonProperty("parentComponent")
    public Object getParentComponent() {
        return parentComponent;
    }

    /**
     * Parent Component
     * <p>
     * The accounting string component that is one level higher in the component hierarchy.
     * 
     */
    @JsonProperty("parentComponent")
    public void setParentComponent(Object parentComponent) {
        this.parentComponent = parentComponent;
    }

    public AccountingStringComponentValues withParentComponent(Object parentComponent) {
        this.parentComponent = parentComponent;
        return this;
    }

    /**
     * Transaction Status
     * <p>
     * Indicates if accounting string component value is available for transaction entry.
     * 
     */
    @JsonProperty("transactionStatus")
    public Object getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Transaction Status
     * <p>
     * Indicates if accounting string component value is available for transaction entry.
     * 
     */
    @JsonProperty("transactionStatus")
    public void setTransactionStatus(Object transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public AccountingStringComponentValues withTransactionStatus(Object transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    /**
     * Type
     * <p>
     * Type of the account component.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Type of the account component.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public AccountingStringComponentValues withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Budget Pools
     * <p>
     * The pool accounts associated with the accounting string component value by fiscal year.
     * 
     */
    @JsonProperty("budgetPools")
    public List<BudgetPool> getBudgetPools() {
        return budgetPools;
    }

    /**
     * Budget Pools
     * <p>
     * The pool accounts associated with the accounting string component value by fiscal year.
     * 
     */
    @JsonProperty("budgetPools")
    public void setBudgetPools(List<BudgetPool> budgetPools) {
        this.budgetPools = budgetPools;
    }

    public AccountingStringComponentValues withBudgetPools(List<BudgetPool> budgetPools) {
        this.budgetPools = budgetPools;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingStringComponentValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("component");
        sb.append('=');
        sb.append(((this.component == null)?"<null>":this.component));
        sb.append(',');
        sb.append("determiningComponent");
        sb.append('=');
        sb.append(((this.determiningComponent == null)?"<null>":this.determiningComponent));
        sb.append(',');
        sb.append("relatedComponentDefaults");
        sb.append('=');
        sb.append(((this.relatedComponentDefaults == null)?"<null>":this.relatedComponentDefaults));
        sb.append(',');
        sb.append("parentComponent");
        sb.append('=');
        sb.append(((this.parentComponent == null)?"<null>":this.parentComponent));
        sb.append(',');
        sb.append("transactionStatus");
        sb.append('=');
        sb.append(((this.transactionStatus == null)?"<null>":this.transactionStatus));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("budgetPools");
        sb.append('=');
        sb.append(((this.budgetPools == null)?"<null>":this.budgetPools));
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
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.relatedComponentDefaults == null)? 0 :this.relatedComponentDefaults.hashCode()));
        result = ((result* 31)+((this.transactionStatus == null)? 0 :this.transactionStatus.hashCode()));
        result = ((result* 31)+((this.budgetPools == null)? 0 :this.budgetPools.hashCode()));
        result = ((result* 31)+((this.parentComponent == null)? 0 :this.parentComponent.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.determiningComponent == null)? 0 :this.determiningComponent.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingStringComponentValues) == false) {
            return false;
        }
        AccountingStringComponentValues rhs = ((AccountingStringComponentValues) other);
        return ((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component))))&&((this.relatedComponentDefaults == rhs.relatedComponentDefaults)||((this.relatedComponentDefaults!= null)&&this.relatedComponentDefaults.equals(rhs.relatedComponentDefaults))))&&((this.transactionStatus == rhs.transactionStatus)||((this.transactionStatus!= null)&&this.transactionStatus.equals(rhs.transactionStatus))))&&((this.budgetPools == rhs.budgetPools)||((this.budgetPools!= null)&&this.budgetPools.equals(rhs.budgetPools))))&&((this.parentComponent == rhs.parentComponent)||((this.parentComponent!= null)&&this.parentComponent.equals(rhs.parentComponent))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.determiningComponent == rhs.determiningComponent)||((this.determiningComponent!= null)&&this.determiningComponent.equals(rhs.determiningComponent))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
