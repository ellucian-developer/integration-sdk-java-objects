
package com.ellucian.generated.eedm.commerce_tax_code_rates.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Commerce Tax Code Rates
 * <p>
 * A list of defined tax rates and their associated codes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "defaultCompoundingSequence",
    "taxPercentage",
    "taxRebatePercentage",
    "startOn",
    "endOn",
    "taxCodes"
})
@Generated("jsonschema2pojo")
public class CommerceTaxCodeRates {

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
     * The global identifier of the commerce tax code rate.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the commerce tax code rate.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the commerce tax code rate.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the commerce tax code rate.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the commerce tax code rate.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the commerce tax code rate.")
    private String description;
    /**
     * Code
     * <p>
     * A code that may be used to identify the tax jurisdiction.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the tax jurisdiction.")
    private String code;
    /**
     * Default Compounding Sequence
     * <p>
     * The default compounding order in which the tax code rate will be applied.
     * 
     */
    @JsonProperty("defaultCompoundingSequence")
    @JsonPropertyDescription("The default compounding order in which the tax code rate will be applied.")
    private Object defaultCompoundingSequence;
    /**
     * Tax Percentage
     * <p>
     * The tax percentage associated with the tax code rate.
     * 
     */
    @JsonProperty("taxPercentage")
    @JsonPropertyDescription("The tax percentage associated with the tax code rate.")
    private Object taxPercentage;
    /**
     * Tax Rebate Percentage
     * <p>
     * The tax rebate percentage associated with the tax code rate.
     * 
     */
    @JsonProperty("taxRebatePercentage")
    @JsonPropertyDescription("The tax rebate percentage associated with the tax code rate.")
    private Object taxRebatePercentage;
    /**
     * Start On
     * <p>
     * The first date that the tax code rate is effective.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date that the tax code rate is effective.")
    private String startOn;
    /**
     * End On
     * <p>
     * The last date that the tax code rate is effective.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date that the tax code rate is effective.")
    private Object endOn;
    /**
     * Tax Codes
     * <p>
     * The tax code(s) which are associated with the commerce tax code rate.
     * 
     */
    @JsonProperty("taxCodes")
    @JsonPropertyDescription("The tax code(s) which are associated with the commerce tax code rate.")
    private List<TaxCode> taxCodes = new ArrayList<TaxCode>();

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

    public CommerceTaxCodeRates withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the commerce tax code rate.
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
     * The global identifier of the commerce tax code rate.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CommerceTaxCodeRates withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the commerce tax code rate.
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
     * The full name of the commerce tax code rate.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CommerceTaxCodeRates withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the commerce tax code rate.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the commerce tax code rate.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CommerceTaxCodeRates withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the tax jurisdiction.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the tax jurisdiction.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CommerceTaxCodeRates withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Default Compounding Sequence
     * <p>
     * The default compounding order in which the tax code rate will be applied.
     * 
     */
    @JsonProperty("defaultCompoundingSequence")
    public Object getDefaultCompoundingSequence() {
        return defaultCompoundingSequence;
    }

    /**
     * Default Compounding Sequence
     * <p>
     * The default compounding order in which the tax code rate will be applied.
     * 
     */
    @JsonProperty("defaultCompoundingSequence")
    public void setDefaultCompoundingSequence(Object defaultCompoundingSequence) {
        this.defaultCompoundingSequence = defaultCompoundingSequence;
    }

    public CommerceTaxCodeRates withDefaultCompoundingSequence(Object defaultCompoundingSequence) {
        this.defaultCompoundingSequence = defaultCompoundingSequence;
        return this;
    }

    /**
     * Tax Percentage
     * <p>
     * The tax percentage associated with the tax code rate.
     * 
     */
    @JsonProperty("taxPercentage")
    public Object getTaxPercentage() {
        return taxPercentage;
    }

    /**
     * Tax Percentage
     * <p>
     * The tax percentage associated with the tax code rate.
     * 
     */
    @JsonProperty("taxPercentage")
    public void setTaxPercentage(Object taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public CommerceTaxCodeRates withTaxPercentage(Object taxPercentage) {
        this.taxPercentage = taxPercentage;
        return this;
    }

    /**
     * Tax Rebate Percentage
     * <p>
     * The tax rebate percentage associated with the tax code rate.
     * 
     */
    @JsonProperty("taxRebatePercentage")
    public Object getTaxRebatePercentage() {
        return taxRebatePercentage;
    }

    /**
     * Tax Rebate Percentage
     * <p>
     * The tax rebate percentage associated with the tax code rate.
     * 
     */
    @JsonProperty("taxRebatePercentage")
    public void setTaxRebatePercentage(Object taxRebatePercentage) {
        this.taxRebatePercentage = taxRebatePercentage;
    }

    public CommerceTaxCodeRates withTaxRebatePercentage(Object taxRebatePercentage) {
        this.taxRebatePercentage = taxRebatePercentage;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date that the tax code rate is effective.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date that the tax code rate is effective.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public CommerceTaxCodeRates withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date that the tax code rate is effective.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date that the tax code rate is effective.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public CommerceTaxCodeRates withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Tax Codes
     * <p>
     * The tax code(s) which are associated with the commerce tax code rate.
     * 
     */
    @JsonProperty("taxCodes")
    public List<TaxCode> getTaxCodes() {
        return taxCodes;
    }

    /**
     * Tax Codes
     * <p>
     * The tax code(s) which are associated with the commerce tax code rate.
     * 
     */
    @JsonProperty("taxCodes")
    public void setTaxCodes(List<TaxCode> taxCodes) {
        this.taxCodes = taxCodes;
    }

    public CommerceTaxCodeRates withTaxCodes(List<TaxCode> taxCodes) {
        this.taxCodes = taxCodes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommerceTaxCodeRates.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("defaultCompoundingSequence");
        sb.append('=');
        sb.append(((this.defaultCompoundingSequence == null)?"<null>":this.defaultCompoundingSequence));
        sb.append(',');
        sb.append("taxPercentage");
        sb.append('=');
        sb.append(((this.taxPercentage == null)?"<null>":this.taxPercentage));
        sb.append(',');
        sb.append("taxRebatePercentage");
        sb.append('=');
        sb.append(((this.taxRebatePercentage == null)?"<null>":this.taxRebatePercentage));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("taxCodes");
        sb.append('=');
        sb.append(((this.taxCodes == null)?"<null>":this.taxCodes));
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
        result = ((result* 31)+((this.defaultCompoundingSequence == null)? 0 :this.defaultCompoundingSequence.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.taxRebatePercentage == null)? 0 :this.taxRebatePercentage.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.taxCodes == null)? 0 :this.taxCodes.hashCode()));
        result = ((result* 31)+((this.taxPercentage == null)? 0 :this.taxPercentage.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommerceTaxCodeRates) == false) {
            return false;
        }
        CommerceTaxCodeRates rhs = ((CommerceTaxCodeRates) other);
        return ((((((((((((this.defaultCompoundingSequence == rhs.defaultCompoundingSequence)||((this.defaultCompoundingSequence!= null)&&this.defaultCompoundingSequence.equals(rhs.defaultCompoundingSequence)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.taxRebatePercentage == rhs.taxRebatePercentage)||((this.taxRebatePercentage!= null)&&this.taxRebatePercentage.equals(rhs.taxRebatePercentage))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.taxCodes == rhs.taxCodes)||((this.taxCodes!= null)&&this.taxCodes.equals(rhs.taxCodes))))&&((this.taxPercentage == rhs.taxPercentage)||((this.taxPercentage!= null)&&this.taxPercentage.equals(rhs.taxPercentage))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
