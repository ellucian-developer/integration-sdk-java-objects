
package com.ellucian.generated.eedm.accounting_string_component_values.v15_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


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
    "subcomponents",
    "determiningComponent",
    "relatedComponentDefaults",
    "parentComponent",
    "transactionStatus",
    "type",
    "budgetPools",
    "effectiveStartOn",
    "effectiveEndOn",
    "status",
    "grants"
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
     * Subcomponents
     * <p>
     * The subcomponents which are part of the component.
     * 
     */
    @JsonProperty("subcomponents")
    @JsonPropertyDescription("The subcomponents which are part of the component.")
    private List<Subcomponent> subcomponents = new ArrayList<Subcomponent>();
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
     * Effective Start On
     * <p>
     * The first date and time that the version of the accounting string component value is effective.
     * (Required)
     * 
     */
    @JsonProperty("effectiveStartOn")
    @JsonPropertyDescription("The first date and time that the version of the accounting string component value is effective.")
    private Date effectiveStartOn;
    /**
     * Effective End On
     * <p>
     * The last date and time that the version of the accounting string component value is effective.
     * 
     */
    @JsonProperty("effectiveEndOn")
    @JsonPropertyDescription("The last date and time that the version of the accounting string component value is effective.")
    private Object effectiveEndOn;
    /**
     * Status
     * <p>
     * The status of the accounting string component value (active or inactive).
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the accounting string component value (active or inactive).")
    private AccountingStringComponentValues.Status status;
    /**
     * Grants
     * <p>
     * The grant(s) associated with the accounting string component value.
     * 
     */
    @JsonProperty("grants")
    @JsonPropertyDescription("The grant(s) associated with the accounting string component value.")
    private List<Grant> grants = new ArrayList<Grant>();

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
     * Subcomponents
     * <p>
     * The subcomponents which are part of the component.
     * 
     */
    @JsonProperty("subcomponents")
    public List<Subcomponent> getSubcomponents() {
        return subcomponents;
    }

    /**
     * Subcomponents
     * <p>
     * The subcomponents which are part of the component.
     * 
     */
    @JsonProperty("subcomponents")
    public void setSubcomponents(List<Subcomponent> subcomponents) {
        this.subcomponents = subcomponents;
    }

    public AccountingStringComponentValues withSubcomponents(List<Subcomponent> subcomponents) {
        this.subcomponents = subcomponents;
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

    /**
     * Effective Start On
     * <p>
     * The first date and time that the version of the accounting string component value is effective.
     * (Required)
     * 
     */
    @JsonProperty("effectiveStartOn")
    public Date getEffectiveStartOn() {
        return effectiveStartOn;
    }

    /**
     * Effective Start On
     * <p>
     * The first date and time that the version of the accounting string component value is effective.
     * (Required)
     * 
     */
    @JsonProperty("effectiveStartOn")
    public void setEffectiveStartOn(Date effectiveStartOn) {
        this.effectiveStartOn = effectiveStartOn;
    }

    public AccountingStringComponentValues withEffectiveStartOn(Date effectiveStartOn) {
        this.effectiveStartOn = effectiveStartOn;
        return this;
    }

    /**
     * Effective End On
     * <p>
     * The last date and time that the version of the accounting string component value is effective.
     * 
     */
    @JsonProperty("effectiveEndOn")
    public Object getEffectiveEndOn() {
        return effectiveEndOn;
    }

    /**
     * Effective End On
     * <p>
     * The last date and time that the version of the accounting string component value is effective.
     * 
     */
    @JsonProperty("effectiveEndOn")
    public void setEffectiveEndOn(Object effectiveEndOn) {
        this.effectiveEndOn = effectiveEndOn;
    }

    public AccountingStringComponentValues withEffectiveEndOn(Object effectiveEndOn) {
        this.effectiveEndOn = effectiveEndOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the accounting string component value (active or inactive).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public AccountingStringComponentValues.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the accounting string component value (active or inactive).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(AccountingStringComponentValues.Status status) {
        this.status = status;
    }

    public AccountingStringComponentValues withStatus(AccountingStringComponentValues.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Grants
     * <p>
     * The grant(s) associated with the accounting string component value.
     * 
     */
    @JsonProperty("grants")
    public List<Grant> getGrants() {
        return grants;
    }

    /**
     * Grants
     * <p>
     * The grant(s) associated with the accounting string component value.
     * 
     */
    @JsonProperty("grants")
    public void setGrants(List<Grant> grants) {
        this.grants = grants;
    }

    public AccountingStringComponentValues withGrants(List<Grant> grants) {
        this.grants = grants;
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
        sb.append("subcomponents");
        sb.append('=');
        sb.append(((this.subcomponents == null)?"<null>":this.subcomponents));
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
        sb.append("effectiveStartOn");
        sb.append('=');
        sb.append(((this.effectiveStartOn == null)?"<null>":this.effectiveStartOn));
        sb.append(',');
        sb.append("effectiveEndOn");
        sb.append('=');
        sb.append(((this.effectiveEndOn == null)?"<null>":this.effectiveEndOn));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("grants");
        sb.append('=');
        sb.append(((this.grants == null)?"<null>":this.grants));
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
        result = ((result* 31)+((this.grants == null)? 0 :this.grants.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.relatedComponentDefaults == null)? 0 :this.relatedComponentDefaults.hashCode()));
        result = ((result* 31)+((this.transactionStatus == null)? 0 :this.transactionStatus.hashCode()));
        result = ((result* 31)+((this.budgetPools == null)? 0 :this.budgetPools.hashCode()));
        result = ((result* 31)+((this.effectiveEndOn == null)? 0 :this.effectiveEndOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.determiningComponent == null)? 0 :this.determiningComponent.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.parentComponent == null)? 0 :this.parentComponent.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.subcomponents == null)? 0 :this.subcomponents.hashCode()));
        result = ((result* 31)+((this.effectiveStartOn == null)? 0 :this.effectiveStartOn.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
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
        return (((((((((((((((((this.grants == rhs.grants)||((this.grants!= null)&&this.grants.equals(rhs.grants)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.relatedComponentDefaults == rhs.relatedComponentDefaults)||((this.relatedComponentDefaults!= null)&&this.relatedComponentDefaults.equals(rhs.relatedComponentDefaults))))&&((this.transactionStatus == rhs.transactionStatus)||((this.transactionStatus!= null)&&this.transactionStatus.equals(rhs.transactionStatus))))&&((this.budgetPools == rhs.budgetPools)||((this.budgetPools!= null)&&this.budgetPools.equals(rhs.budgetPools))))&&((this.effectiveEndOn == rhs.effectiveEndOn)||((this.effectiveEndOn!= null)&&this.effectiveEndOn.equals(rhs.effectiveEndOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.determiningComponent == rhs.determiningComponent)||((this.determiningComponent!= null)&&this.determiningComponent.equals(rhs.determiningComponent))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component))))&&((this.parentComponent == rhs.parentComponent)||((this.parentComponent!= null)&&this.parentComponent.equals(rhs.parentComponent))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.subcomponents == rhs.subcomponents)||((this.subcomponents!= null)&&this.subcomponents.equals(rhs.subcomponents))))&&((this.effectiveStartOn == rhs.effectiveStartOn)||((this.effectiveStartOn!= null)&&this.effectiveStartOn.equals(rhs.effectiveStartOn))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the accounting string component value (active or inactive).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive");
        private final String value;
        private final static Map<String, AccountingStringComponentValues.Status> CONSTANTS = new HashMap<String, AccountingStringComponentValues.Status>();

        static {
            for (AccountingStringComponentValues.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static AccountingStringComponentValues.Status fromValue(String value) {
            AccountingStringComponentValues.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
