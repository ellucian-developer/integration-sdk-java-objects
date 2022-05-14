
package com.ellucian.generated.eedm.contribution_calculation_rules.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contribution Calculation Rules
 * <p>
 * Rules used in calculating contributions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "contributionTypes",
    "creditTypes",
    "categoryInclusion",
    "categories",
    "categoryGroupInclusion",
    "categoryGroups"
})
@Generated("jsonschema2pojo")
public class ContributionCalculationRules {

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
     * The global identifier of the contribution calculation rule.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the contribution calculation rule.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the contribution calculation rule.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the contribution calculation rule.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the contribution calculation rule.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the contribution calculation rule.")
    private String description;
    /**
     * Contribution Type
     * <p>
     * The types of contribution that are applicable to the calculation rule (e.g. gift, pledge, recurringGift, etc.).
     * 
     */
    @JsonProperty("contributionTypes")
    @JsonPropertyDescription("The types of contribution that are applicable to the calculation rule (e.g. gift, pledge, recurringGift, etc.).")
    private List<ContributionType> contributionTypes = new ArrayList<ContributionType>();
    /**
     * Credit Types
     * <p>
     * The types of credit that are applicable to the calculation rule (e.g. legal, recognition, etc.).
     * 
     */
    @JsonProperty("creditTypes")
    @JsonPropertyDescription("The types of credit that are applicable to the calculation rule (e.g. legal, recognition, etc.).")
    private List<CreditType> creditTypes = new ArrayList<CreditType>();
    /**
     * Category Inclusion
     * <p>
     * An indication if the specified categories are included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categoryInclusion")
    @JsonPropertyDescription("An indication if the specified categories are included or excluded in the calculation rule.")
    private Object categoryInclusion;
    /**
     * Categories
     * <p>
     * Contribution categories to be included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categories")
    @JsonPropertyDescription("Contribution categories to be included or excluded in the calculation rule.")
    private List<Category> categories = new ArrayList<Category>();
    /**
     * Category Group Inclusion
     * <p>
     * An indication if the specified category groups are included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categoryGroupInclusion")
    @JsonPropertyDescription("An indication if the specified category groups are included or excluded in the calculation rule.")
    private Object categoryGroupInclusion;
    /**
     * Category Groups
     * <p>
     * Contribution category groups to be included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categoryGroups")
    @JsonPropertyDescription("Contribution category groups to be included or excluded in the calculation rule.")
    private List<CategoryGroup> categoryGroups = new ArrayList<CategoryGroup>();

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

    public ContributionCalculationRules withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the contribution calculation rule.
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
     * The global identifier of the contribution calculation rule.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ContributionCalculationRules withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the contribution calculation rule.
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
     * The full name of the contribution calculation rule.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ContributionCalculationRules withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the contribution calculation rule.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the contribution calculation rule.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ContributionCalculationRules withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Contribution Type
     * <p>
     * The types of contribution that are applicable to the calculation rule (e.g. gift, pledge, recurringGift, etc.).
     * 
     */
    @JsonProperty("contributionTypes")
    public List<ContributionType> getContributionTypes() {
        return contributionTypes;
    }

    /**
     * Contribution Type
     * <p>
     * The types of contribution that are applicable to the calculation rule (e.g. gift, pledge, recurringGift, etc.).
     * 
     */
    @JsonProperty("contributionTypes")
    public void setContributionTypes(List<ContributionType> contributionTypes) {
        this.contributionTypes = contributionTypes;
    }

    public ContributionCalculationRules withContributionTypes(List<ContributionType> contributionTypes) {
        this.contributionTypes = contributionTypes;
        return this;
    }

    /**
     * Credit Types
     * <p>
     * The types of credit that are applicable to the calculation rule (e.g. legal, recognition, etc.).
     * 
     */
    @JsonProperty("creditTypes")
    public List<CreditType> getCreditTypes() {
        return creditTypes;
    }

    /**
     * Credit Types
     * <p>
     * The types of credit that are applicable to the calculation rule (e.g. legal, recognition, etc.).
     * 
     */
    @JsonProperty("creditTypes")
    public void setCreditTypes(List<CreditType> creditTypes) {
        this.creditTypes = creditTypes;
    }

    public ContributionCalculationRules withCreditTypes(List<CreditType> creditTypes) {
        this.creditTypes = creditTypes;
        return this;
    }

    /**
     * Category Inclusion
     * <p>
     * An indication if the specified categories are included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categoryInclusion")
    public Object getCategoryInclusion() {
        return categoryInclusion;
    }

    /**
     * Category Inclusion
     * <p>
     * An indication if the specified categories are included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categoryInclusion")
    public void setCategoryInclusion(Object categoryInclusion) {
        this.categoryInclusion = categoryInclusion;
    }

    public ContributionCalculationRules withCategoryInclusion(Object categoryInclusion) {
        this.categoryInclusion = categoryInclusion;
        return this;
    }

    /**
     * Categories
     * <p>
     * Contribution categories to be included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * Categories
     * <p>
     * Contribution categories to be included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public ContributionCalculationRules withCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Category Group Inclusion
     * <p>
     * An indication if the specified category groups are included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categoryGroupInclusion")
    public Object getCategoryGroupInclusion() {
        return categoryGroupInclusion;
    }

    /**
     * Category Group Inclusion
     * <p>
     * An indication if the specified category groups are included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categoryGroupInclusion")
    public void setCategoryGroupInclusion(Object categoryGroupInclusion) {
        this.categoryGroupInclusion = categoryGroupInclusion;
    }

    public ContributionCalculationRules withCategoryGroupInclusion(Object categoryGroupInclusion) {
        this.categoryGroupInclusion = categoryGroupInclusion;
        return this;
    }

    /**
     * Category Groups
     * <p>
     * Contribution category groups to be included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categoryGroups")
    public List<CategoryGroup> getCategoryGroups() {
        return categoryGroups;
    }

    /**
     * Category Groups
     * <p>
     * Contribution category groups to be included or excluded in the calculation rule.
     * 
     */
    @JsonProperty("categoryGroups")
    public void setCategoryGroups(List<CategoryGroup> categoryGroups) {
        this.categoryGroups = categoryGroups;
    }

    public ContributionCalculationRules withCategoryGroups(List<CategoryGroup> categoryGroups) {
        this.categoryGroups = categoryGroups;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContributionCalculationRules.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("contributionTypes");
        sb.append('=');
        sb.append(((this.contributionTypes == null)?"<null>":this.contributionTypes));
        sb.append(',');
        sb.append("creditTypes");
        sb.append('=');
        sb.append(((this.creditTypes == null)?"<null>":this.creditTypes));
        sb.append(',');
        sb.append("categoryInclusion");
        sb.append('=');
        sb.append(((this.categoryInclusion == null)?"<null>":this.categoryInclusion));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("categoryGroupInclusion");
        sb.append('=');
        sb.append(((this.categoryGroupInclusion == null)?"<null>":this.categoryGroupInclusion));
        sb.append(',');
        sb.append("categoryGroups");
        sb.append('=');
        sb.append(((this.categoryGroups == null)?"<null>":this.categoryGroups));
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
        result = ((result* 31)+((this.categoryInclusion == null)? 0 :this.categoryInclusion.hashCode()));
        result = ((result* 31)+((this.contributionTypes == null)? 0 :this.contributionTypes.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.creditTypes == null)? 0 :this.creditTypes.hashCode()));
        result = ((result* 31)+((this.categoryGroups == null)? 0 :this.categoryGroups.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.categoryGroupInclusion == null)? 0 :this.categoryGroupInclusion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContributionCalculationRules) == false) {
            return false;
        }
        ContributionCalculationRules rhs = ((ContributionCalculationRules) other);
        return (((((((((((this.categoryInclusion == rhs.categoryInclusion)||((this.categoryInclusion!= null)&&this.categoryInclusion.equals(rhs.categoryInclusion)))&&((this.contributionTypes == rhs.contributionTypes)||((this.contributionTypes!= null)&&this.contributionTypes.equals(rhs.contributionTypes))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.creditTypes == rhs.creditTypes)||((this.creditTypes!= null)&&this.creditTypes.equals(rhs.creditTypes))))&&((this.categoryGroups == rhs.categoryGroups)||((this.categoryGroups!= null)&&this.categoryGroups.equals(rhs.categoryGroups))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.categoryGroupInclusion == rhs.categoryGroupInclusion)||((this.categoryGroupInclusion!= null)&&this.categoryGroupInclusion.equals(rhs.categoryGroupInclusion))));
    }

}
