
package com.ellucian.generated.eedm.constituent_business_relationship_types.v11_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Constituent Business Relationship Types
 * <p>
 * A list of valid types of business relationships between constituents (persons or organizations).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "category",
    "authority"
})
@Generated("jsonschema2pojo")
public class ConstituentBusinessRelationshipTypes {

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
     * The global identifier of the constituent business relationship type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent business relationship type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the constituent business relationship type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the constituent business relationship type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the constituent business relationship type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the constituent business relationship type.")
    private String description;
    /**
     * Category
     * <p>
     * The upper level category of the business relationship type.
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The upper level category of the business relationship type.")
    private ConstituentBusinessRelationshipTypes.Category category;
    /**
     * Authority
     * <p>
     * An indicator of the impact the relationship type can have on advancement decisions such as level of contributions.
     * 
     */
    @JsonProperty("authority")
    @JsonPropertyDescription("An indicator of the impact the relationship type can have on advancement decisions such as level of contributions.")
    private Object authority;

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

    public ConstituentBusinessRelationshipTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent business relationship type.
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
     * The global identifier of the constituent business relationship type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentBusinessRelationshipTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the constituent business relationship type.
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
     * The full name of the constituent business relationship type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ConstituentBusinessRelationshipTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the constituent business relationship type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the constituent business relationship type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConstituentBusinessRelationshipTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Category
     * <p>
     * The upper level category of the business relationship type.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public ConstituentBusinessRelationshipTypes.Category getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * The upper level category of the business relationship type.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(ConstituentBusinessRelationshipTypes.Category category) {
        this.category = category;
    }

    public ConstituentBusinessRelationshipTypes withCategory(ConstituentBusinessRelationshipTypes.Category category) {
        this.category = category;
        return this;
    }

    /**
     * Authority
     * <p>
     * An indicator of the impact the relationship type can have on advancement decisions such as level of contributions.
     * 
     */
    @JsonProperty("authority")
    public Object getAuthority() {
        return authority;
    }

    /**
     * Authority
     * <p>
     * An indicator of the impact the relationship type can have on advancement decisions such as level of contributions.
     * 
     */
    @JsonProperty("authority")
    public void setAuthority(Object authority) {
        this.authority = authority;
    }

    public ConstituentBusinessRelationshipTypes withAuthority(Object authority) {
        this.authority = authority;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentBusinessRelationshipTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("authority");
        sb.append('=');
        sb.append(((this.authority == null)?"<null>":this.authority));
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
        result = ((result* 31)+((this.authority == null)? 0 :this.authority.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentBusinessRelationshipTypes) == false) {
            return false;
        }
        ConstituentBusinessRelationshipTypes rhs = ((ConstituentBusinessRelationshipTypes) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.authority == rhs.authority)||((this.authority!= null)&&this.authority.equals(rhs.authority))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }


    /**
     * Category
     * <p>
     * The upper level category of the business relationship type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Category {

        ORGANIZATIONAL("organizational"),
        EMPLOYMENT_INCLUDE("employmentInclude"),
        EMPLOYMENT_EXCLUDE("employmentExclude"),
        OTHER("other");
        private final String value;
        private final static Map<String, ConstituentBusinessRelationshipTypes.Category> CONSTANTS = new HashMap<String, ConstituentBusinessRelationshipTypes.Category>();

        static {
            for (ConstituentBusinessRelationshipTypes.Category c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Category(String value) {
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
        public static ConstituentBusinessRelationshipTypes.Category fromValue(String value) {
            ConstituentBusinessRelationshipTypes.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
