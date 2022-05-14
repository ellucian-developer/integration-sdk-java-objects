
package com.ellucian.generated.eedm.financial_aid_funds.v9_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Financial Aid Funds
 * <p>
 * The details of named grants, loans, scholarships, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "source",
    "aidType",
    "classifications",
    "category",
    "privacy",
    "financials"
})
@Generated("jsonschema2pojo")
public class FinancialAidFunds {

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
     * The global identifier of the financial aid fund.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the financial aid fund.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the financial aid fund.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the financial aid fund.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the financial aid fund.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the financial aid fund.")
    private String description;
    /**
     * Code
     * <p>
     * The code that identifies the financial aid fund.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that identifies the financial aid fund.")
    private String code;
    /**
     * Source
     * <p>
     * The source of the financial aid fund (federal, state, institutional, other).
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the financial aid fund (federal, state, institutional, other).")
    private Object source;
    /**
     * Aid Type
     * <p>
     * Type of the financial aid fund (loan, grant, scholarship, work).
     * 
     */
    @JsonProperty("aidType")
    @JsonPropertyDescription("Type of the financial aid fund (loan, grant, scholarship, work).")
    private Object aidType;
    /**
     * Classifications
     * <p>
     * The classifications assigned to the financial aid fund.
     * 
     */
    @JsonProperty("classifications")
    @JsonPropertyDescription("The classifications assigned to the financial aid fund.")
    private List<Classification> classifications = new ArrayList<Classification>();
    /**
     * Category
     * <p>
     * Category of the financial aid fund.
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Category of the financial aid fund.")
    private Object category;
    /**
     * Privacy
     * <p>
     * The privacy level of the financial aid fund based on privacy concerns (restricted, non-restricted). This indicates whether the award of this fund to a student is restricted or not for view.
     * 
     */
    @JsonProperty("privacy")
    @JsonPropertyDescription("The privacy level of the financial aid fund based on privacy concerns (restricted, non-restricted). This indicates whether the award of this fund to a student is restricted or not for view.")
    private Object privacy;
    /**
     * Financials
     * <p>
     * Financial details related to the financial aid fund by aid year and financial aid office.
     * 
     */
    @JsonProperty("financials")
    @JsonPropertyDescription("Financial details related to the financial aid fund by aid year and financial aid office.")
    private List<Financial> financials = new ArrayList<Financial>();

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

    public FinancialAidFunds withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the financial aid fund.
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
     * The global identifier of the financial aid fund.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FinancialAidFunds withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the financial aid fund.
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
     * The full name of the financial aid fund.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FinancialAidFunds withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the financial aid fund.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the financial aid fund.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public FinancialAidFunds withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code that identifies the financial aid fund.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that identifies the financial aid fund.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public FinancialAidFunds withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the financial aid fund (federal, state, institutional, other).
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the financial aid fund (federal, state, institutional, other).
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public FinancialAidFunds withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Aid Type
     * <p>
     * Type of the financial aid fund (loan, grant, scholarship, work).
     * 
     */
    @JsonProperty("aidType")
    public Object getAidType() {
        return aidType;
    }

    /**
     * Aid Type
     * <p>
     * Type of the financial aid fund (loan, grant, scholarship, work).
     * 
     */
    @JsonProperty("aidType")
    public void setAidType(Object aidType) {
        this.aidType = aidType;
    }

    public FinancialAidFunds withAidType(Object aidType) {
        this.aidType = aidType;
        return this;
    }

    /**
     * Classifications
     * <p>
     * The classifications assigned to the financial aid fund.
     * 
     */
    @JsonProperty("classifications")
    public List<Classification> getClassifications() {
        return classifications;
    }

    /**
     * Classifications
     * <p>
     * The classifications assigned to the financial aid fund.
     * 
     */
    @JsonProperty("classifications")
    public void setClassifications(List<Classification> classifications) {
        this.classifications = classifications;
    }

    public FinancialAidFunds withClassifications(List<Classification> classifications) {
        this.classifications = classifications;
        return this;
    }

    /**
     * Category
     * <p>
     * Category of the financial aid fund.
     * 
     */
    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * Category of the financial aid fund.
     * 
     */
    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    public FinancialAidFunds withCategory(Object category) {
        this.category = category;
        return this;
    }

    /**
     * Privacy
     * <p>
     * The privacy level of the financial aid fund based on privacy concerns (restricted, non-restricted). This indicates whether the award of this fund to a student is restricted or not for view.
     * 
     */
    @JsonProperty("privacy")
    public Object getPrivacy() {
        return privacy;
    }

    /**
     * Privacy
     * <p>
     * The privacy level of the financial aid fund based on privacy concerns (restricted, non-restricted). This indicates whether the award of this fund to a student is restricted or not for view.
     * 
     */
    @JsonProperty("privacy")
    public void setPrivacy(Object privacy) {
        this.privacy = privacy;
    }

    public FinancialAidFunds withPrivacy(Object privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Financials
     * <p>
     * Financial details related to the financial aid fund by aid year and financial aid office.
     * 
     */
    @JsonProperty("financials")
    public List<Financial> getFinancials() {
        return financials;
    }

    /**
     * Financials
     * <p>
     * Financial details related to the financial aid fund by aid year and financial aid office.
     * 
     */
    @JsonProperty("financials")
    public void setFinancials(List<Financial> financials) {
        this.financials = financials;
    }

    public FinancialAidFunds withFinancials(List<Financial> financials) {
        this.financials = financials;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialAidFunds.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("aidType");
        sb.append('=');
        sb.append(((this.aidType == null)?"<null>":this.aidType));
        sb.append(',');
        sb.append("classifications");
        sb.append('=');
        sb.append(((this.classifications == null)?"<null>":this.classifications));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("privacy");
        sb.append('=');
        sb.append(((this.privacy == null)?"<null>":this.privacy));
        sb.append(',');
        sb.append("financials");
        sb.append('=');
        sb.append(((this.financials == null)?"<null>":this.financials));
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
        result = ((result* 31)+((this.classifications == null)? 0 :this.classifications.hashCode()));
        result = ((result* 31)+((this.financials == null)? 0 :this.financials.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.aidType == null)? 0 :this.aidType.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.privacy == null)? 0 :this.privacy.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialAidFunds) == false) {
            return false;
        }
        FinancialAidFunds rhs = ((FinancialAidFunds) other);
        return ((((((((((((this.classifications == rhs.classifications)||((this.classifications!= null)&&this.classifications.equals(rhs.classifications)))&&((this.financials == rhs.financials)||((this.financials!= null)&&this.financials.equals(rhs.financials))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.aidType == rhs.aidType)||((this.aidType!= null)&&this.aidType.equals(rhs.aidType))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.privacy == rhs.privacy)||((this.privacy!= null)&&this.privacy.equals(rhs.privacy))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
