
package com.ellucian.generated.eedm.constituent_assets.v13_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Assets
 * <p>
 * The assets (e.g. art, stocks, airplane) used by Advancement to calculate the wealth of a constituent.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "description",
    "owner",
    "type",
    "status",
    "informationDate",
    "targetType",
    "state",
    "worth",
    "range",
    "source",
    "comment"
})
@Generated("jsonschema2pojo")
public class ConstituentAssets {

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
     * The global identifier of the constituent asset.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent asset.")
    private String id;
    /**
     * Description
     * <p>
     * The description of the constituent asset.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the constituent asset.")
    private String description;
    /**
     * Owner
     * <p>
     * The owner of the asset.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("The owner of the asset.")
    private Owner owner;
    /**
     * Type
     * <p>
     * The type of the asset owned by the constituent (e.g.: real estate, art, stocks).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the asset owned by the constituent (e.g.: real estate, art, stocks).")
    private Type type;
    /**
     * Status
     * <p>
     * The status of the asset owned by the constituent.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the asset owned by the constituent.")
    private Object status;
    /**
     * Information Date
     * <p>
     * The date of the information for the asset.
     * (Required)
     * 
     */
    @JsonProperty("informationDate")
    @JsonPropertyDescription("The date of the information for the asset.")
    private String informationDate;
    /**
     * Target Type
     * <p>
     * The asset's target type (e.g.: individual, household).
     * 
     */
    @JsonProperty("targetType")
    @JsonPropertyDescription("The asset's target type (e.g.: individual, household).")
    private Object targetType;
    /**
     * State
     * <p>
     * The state of the asset (e.g.: cash on hand, sale of the asset).
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The state of the asset (e.g.: cash on hand, sale of the asset).")
    private Object state;
    /**
     * Worth
     * <p>
     * The specified worth of the asset.
     * 
     */
    @JsonProperty("worth")
    @JsonPropertyDescription("The specified worth of the asset.")
    private Object worth;
    /**
     * Range
     * <p>
     * The range within which the asset's worth falls.
     * 
     */
    @JsonProperty("range")
    @JsonPropertyDescription("The range within which the asset's worth falls.")
    private Object range;
    /**
     * Source
     * <p>
     * The source that provided the asset information.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source that provided the asset information.")
    private Object source;
    /**
     * Comment
     * <p>
     * The comments about the asset.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comments about the asset.")
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

    public ConstituentAssets withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent asset.
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
     * The global identifier of the constituent asset.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentAssets withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the constituent asset.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the constituent asset.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConstituentAssets withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Owner
     * <p>
     * The owner of the asset.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    /**
     * Owner
     * <p>
     * The owner of the asset.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public ConstituentAssets withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the asset owned by the constituent (e.g.: real estate, art, stocks).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the asset owned by the constituent (e.g.: real estate, art, stocks).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public ConstituentAssets withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the asset owned by the constituent.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the asset owned by the constituent.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public ConstituentAssets withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Information Date
     * <p>
     * The date of the information for the asset.
     * (Required)
     * 
     */
    @JsonProperty("informationDate")
    public String getInformationDate() {
        return informationDate;
    }

    /**
     * Information Date
     * <p>
     * The date of the information for the asset.
     * (Required)
     * 
     */
    @JsonProperty("informationDate")
    public void setInformationDate(String informationDate) {
        this.informationDate = informationDate;
    }

    public ConstituentAssets withInformationDate(String informationDate) {
        this.informationDate = informationDate;
        return this;
    }

    /**
     * Target Type
     * <p>
     * The asset's target type (e.g.: individual, household).
     * 
     */
    @JsonProperty("targetType")
    public Object getTargetType() {
        return targetType;
    }

    /**
     * Target Type
     * <p>
     * The asset's target type (e.g.: individual, household).
     * 
     */
    @JsonProperty("targetType")
    public void setTargetType(Object targetType) {
        this.targetType = targetType;
    }

    public ConstituentAssets withTargetType(Object targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * State
     * <p>
     * The state of the asset (e.g.: cash on hand, sale of the asset).
     * 
     */
    @JsonProperty("state")
    public Object getState() {
        return state;
    }

    /**
     * State
     * <p>
     * The state of the asset (e.g.: cash on hand, sale of the asset).
     * 
     */
    @JsonProperty("state")
    public void setState(Object state) {
        this.state = state;
    }

    public ConstituentAssets withState(Object state) {
        this.state = state;
        return this;
    }

    /**
     * Worth
     * <p>
     * The specified worth of the asset.
     * 
     */
    @JsonProperty("worth")
    public Object getWorth() {
        return worth;
    }

    /**
     * Worth
     * <p>
     * The specified worth of the asset.
     * 
     */
    @JsonProperty("worth")
    public void setWorth(Object worth) {
        this.worth = worth;
    }

    public ConstituentAssets withWorth(Object worth) {
        this.worth = worth;
        return this;
    }

    /**
     * Range
     * <p>
     * The range within which the asset's worth falls.
     * 
     */
    @JsonProperty("range")
    public Object getRange() {
        return range;
    }

    /**
     * Range
     * <p>
     * The range within which the asset's worth falls.
     * 
     */
    @JsonProperty("range")
    public void setRange(Object range) {
        this.range = range;
    }

    public ConstituentAssets withRange(Object range) {
        this.range = range;
        return this;
    }

    /**
     * Source
     * <p>
     * The source that provided the asset information.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source that provided the asset information.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentAssets withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comments about the asset.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comments about the asset.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ConstituentAssets withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentAssets.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("informationDate");
        sb.append('=');
        sb.append(((this.informationDate == null)?"<null>":this.informationDate));
        sb.append(',');
        sb.append("targetType");
        sb.append('=');
        sb.append(((this.targetType == null)?"<null>":this.targetType));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("worth");
        sb.append('=');
        sb.append(((this.worth == null)?"<null>":this.worth));
        sb.append(',');
        sb.append("range");
        sb.append('=');
        sb.append(((this.range == null)?"<null>":this.range));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.range == null)? 0 :this.range.hashCode()));
        result = ((result* 31)+((this.targetType == null)? 0 :this.targetType.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.worth == null)? 0 :this.worth.hashCode()));
        result = ((result* 31)+((this.informationDate == null)? 0 :this.informationDate.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentAssets) == false) {
            return false;
        }
        ConstituentAssets rhs = ((ConstituentAssets) other);
        return ((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.range == rhs.range)||((this.range!= null)&&this.range.equals(rhs.range))))&&((this.targetType == rhs.targetType)||((this.targetType!= null)&&this.targetType.equals(rhs.targetType))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.worth == rhs.worth)||((this.worth!= null)&&this.worth.equals(rhs.worth))))&&((this.informationDate == rhs.informationDate)||((this.informationDate!= null)&&this.informationDate.equals(rhs.informationDate))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
