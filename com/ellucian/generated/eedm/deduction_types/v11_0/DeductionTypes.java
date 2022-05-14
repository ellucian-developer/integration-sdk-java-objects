
package com.ellucian.generated.eedm.deduction_types.v11_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Deduction Types
 * <p>
 * Information on types of deduction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "category",
    "costCalculationMethod",
    "parentType",
    "withholdingFrequency",
    "taxApplication"
})
@Generated("jsonschema2pojo")
public class DeductionTypes {

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
     * The global identifier of the deduction type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the deduction type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the deduction type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the deduction type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the deduction type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the deduction type.")
    private String description;
    /**
     * Code
     * <p>
     * A code that may be used to identify the deduction type.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the deduction type.")
    private String code;
    /**
     * Category
     * <p>
     * The category of deduction associated with the deduction type (e.g. dental plans, garnishments, education plans, etc.).
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The category of deduction associated with the deduction type (e.g. dental plans, garnishments, education plans, etc.).")
    private Object category;
    /**
     * Cost Calculation Method
     * <p>
     * The cost calculation method associated with the deduction type (e.g. percentage, fixed amount, etc.).
     * (Required)
     * 
     */
    @JsonProperty("costCalculationMethod")
    @JsonPropertyDescription("The cost calculation method associated with the deduction type (e.g. percentage, fixed amount, etc.).")
    private CostCalculationMethod costCalculationMethod;
    /**
     * Parent Type
     * <p>
     * The deduction type that is one level higher in deduction hierarchy.
     * 
     */
    @JsonProperty("parentType")
    @JsonPropertyDescription("The deduction type that is one level higher in deduction hierarchy.")
    private Object parentType;
    /**
     * Withholding Frequency
     * <p>
     * The withholding frequency associated with the deduction type.
     * 
     */
    @JsonProperty("withholdingFrequency")
    @JsonPropertyDescription("The withholding frequency associated with the deduction type.")
    private WithholdingFrequency withholdingFrequency;
    /**
     * Tax Application
     * <p>
     * An indicator if the deduction should be applied before or after taxes are withheld.
     * 
     */
    @JsonProperty("taxApplication")
    @JsonPropertyDescription("An indicator if the deduction should be applied before or after taxes are withheld.")
    private Object taxApplication;

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

    public DeductionTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the deduction type.
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
     * The global identifier of the deduction type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public DeductionTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the deduction type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the deduction type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public DeductionTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the deduction type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the deduction type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public DeductionTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the deduction type.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the deduction type.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public DeductionTypes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Category
     * <p>
     * The category of deduction associated with the deduction type (e.g. dental plans, garnishments, education plans, etc.).
     * 
     */
    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * The category of deduction associated with the deduction type (e.g. dental plans, garnishments, education plans, etc.).
     * 
     */
    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    public DeductionTypes withCategory(Object category) {
        this.category = category;
        return this;
    }

    /**
     * Cost Calculation Method
     * <p>
     * The cost calculation method associated with the deduction type (e.g. percentage, fixed amount, etc.).
     * (Required)
     * 
     */
    @JsonProperty("costCalculationMethod")
    public CostCalculationMethod getCostCalculationMethod() {
        return costCalculationMethod;
    }

    /**
     * Cost Calculation Method
     * <p>
     * The cost calculation method associated with the deduction type (e.g. percentage, fixed amount, etc.).
     * (Required)
     * 
     */
    @JsonProperty("costCalculationMethod")
    public void setCostCalculationMethod(CostCalculationMethod costCalculationMethod) {
        this.costCalculationMethod = costCalculationMethod;
    }

    public DeductionTypes withCostCalculationMethod(CostCalculationMethod costCalculationMethod) {
        this.costCalculationMethod = costCalculationMethod;
        return this;
    }

    /**
     * Parent Type
     * <p>
     * The deduction type that is one level higher in deduction hierarchy.
     * 
     */
    @JsonProperty("parentType")
    public Object getParentType() {
        return parentType;
    }

    /**
     * Parent Type
     * <p>
     * The deduction type that is one level higher in deduction hierarchy.
     * 
     */
    @JsonProperty("parentType")
    public void setParentType(Object parentType) {
        this.parentType = parentType;
    }

    public DeductionTypes withParentType(Object parentType) {
        this.parentType = parentType;
        return this;
    }

    /**
     * Withholding Frequency
     * <p>
     * The withholding frequency associated with the deduction type.
     * 
     */
    @JsonProperty("withholdingFrequency")
    public WithholdingFrequency getWithholdingFrequency() {
        return withholdingFrequency;
    }

    /**
     * Withholding Frequency
     * <p>
     * The withholding frequency associated with the deduction type.
     * 
     */
    @JsonProperty("withholdingFrequency")
    public void setWithholdingFrequency(WithholdingFrequency withholdingFrequency) {
        this.withholdingFrequency = withholdingFrequency;
    }

    public DeductionTypes withWithholdingFrequency(WithholdingFrequency withholdingFrequency) {
        this.withholdingFrequency = withholdingFrequency;
        return this;
    }

    /**
     * Tax Application
     * <p>
     * An indicator if the deduction should be applied before or after taxes are withheld.
     * 
     */
    @JsonProperty("taxApplication")
    public Object getTaxApplication() {
        return taxApplication;
    }

    /**
     * Tax Application
     * <p>
     * An indicator if the deduction should be applied before or after taxes are withheld.
     * 
     */
    @JsonProperty("taxApplication")
    public void setTaxApplication(Object taxApplication) {
        this.taxApplication = taxApplication;
    }

    public DeductionTypes withTaxApplication(Object taxApplication) {
        this.taxApplication = taxApplication;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeductionTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("costCalculationMethod");
        sb.append('=');
        sb.append(((this.costCalculationMethod == null)?"<null>":this.costCalculationMethod));
        sb.append(',');
        sb.append("parentType");
        sb.append('=');
        sb.append(((this.parentType == null)?"<null>":this.parentType));
        sb.append(',');
        sb.append("withholdingFrequency");
        sb.append('=');
        sb.append(((this.withholdingFrequency == null)?"<null>":this.withholdingFrequency));
        sb.append(',');
        sb.append("taxApplication");
        sb.append('=');
        sb.append(((this.taxApplication == null)?"<null>":this.taxApplication));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.costCalculationMethod == null)? 0 :this.costCalculationMethod.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.taxApplication == null)? 0 :this.taxApplication.hashCode()));
        result = ((result* 31)+((this.parentType == null)? 0 :this.parentType.hashCode()));
        result = ((result* 31)+((this.withholdingFrequency == null)? 0 :this.withholdingFrequency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeductionTypes) == false) {
            return false;
        }
        DeductionTypes rhs = ((DeductionTypes) other);
        return (((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.costCalculationMethod == rhs.costCalculationMethod)||((this.costCalculationMethod!= null)&&this.costCalculationMethod.equals(rhs.costCalculationMethod))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.taxApplication == rhs.taxApplication)||((this.taxApplication!= null)&&this.taxApplication.equals(rhs.taxApplication))))&&((this.parentType == rhs.parentType)||((this.parentType!= null)&&this.parentType.equals(rhs.parentType))))&&((this.withholdingFrequency == rhs.withholdingFrequency)||((this.withholdingFrequency!= null)&&this.withholdingFrequency.equals(rhs.withholdingFrequency))));
    }

}
