
package com.ellucian.generated.eedm.advancement_ticket_types.v1_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Advancement Ticket Types
 * <p>
 * The valid list of user defined advancement ticket types.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "category"
})
@Generated("jsonschema2pojo")
public class AdvancementTicketTypes {

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
     * The global identifier of the advancement ticket type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the advancement ticket type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the advancement ticket type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the advancement ticket type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the advancement ticket type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the advancement ticket type.")
    private String description;
    /**
     * Category
     * <p>
     * The category associated with the ticket type (i.e. athletics, performing arts).
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The category associated with the ticket type (i.e. athletics, performing arts).")
    private String category;

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

    public AdvancementTicketTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the advancement ticket type.
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
     * The global identifier of the advancement ticket type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdvancementTicketTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the advancement ticket type.
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
     * The full name of the advancement ticket type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdvancementTicketTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the advancement ticket type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the advancement ticket type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdvancementTicketTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Category
     * <p>
     * The category associated with the ticket type (i.e. athletics, performing arts).
     * 
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * The category associated with the ticket type (i.e. athletics, performing arts).
     * 
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public AdvancementTicketTypes withCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdvancementTicketTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
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
        if ((other instanceof AdvancementTicketTypes) == false) {
            return false;
        }
        AdvancementTicketTypes rhs = ((AdvancementTicketTypes) other);
        return ((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
