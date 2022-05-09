
package com.ellucian.generated.eedm.advancement_premiums.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Advancement Premiums
 * <p>
 * Information on goods or services offered as premiums.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "fairMarketValue",
    "lifetimeMaximumAwardable",
    "monthsBetweenAssignments",
    "endOn",
    "comment"
})
@Generated("jsonschema2pojo")
public class AdvancementPremiums {

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
     * The global identifier of the advancement premium.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the advancement premium.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the advancement premium.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the advancement premium.")
    private String title;
    /**
     * Fair Market Value
     * <p>
     * The fair market value per premium.
     * 
     */
    @JsonProperty("fairMarketValue")
    @JsonPropertyDescription("The fair market value per premium.")
    private Object fairMarketValue;
    /**
     * Lifetime Maximum Awardable
     * <p>
     * The lifetime maximum number of awards of the premium per constituent.
     * 
     */
    @JsonProperty("lifetimeMaximumAwardable")
    @JsonPropertyDescription("The lifetime maximum number of awards of the premium per constituent.")
    private Object lifetimeMaximumAwardable;
    /**
     * Months Between Assignments
     * <p>
     * The minimum number of months between subsequent assignments of the premium to the same constituent.
     * 
     */
    @JsonProperty("monthsBetweenAssignments")
    @JsonPropertyDescription("The minimum number of months between subsequent assignments of the premium to the same constituent.")
    private Object monthsBetweenAssignments;
    /**
     * End On
     * <p>
     * The date when the premium will no longer be available for assignment.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the premium will no longer be available for assignment.")
    private Object endOn;
    /**
     * Comment
     * <p>
     * Any comments regarding the advancement premium.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Any comments regarding the advancement premium.")
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

    public AdvancementPremiums withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the advancement premium.
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
     * The global identifier of the advancement premium.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdvancementPremiums withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the advancement premium.
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
     * The full name of the advancement premium.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdvancementPremiums withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Fair Market Value
     * <p>
     * The fair market value per premium.
     * 
     */
    @JsonProperty("fairMarketValue")
    public Object getFairMarketValue() {
        return fairMarketValue;
    }

    /**
     * Fair Market Value
     * <p>
     * The fair market value per premium.
     * 
     */
    @JsonProperty("fairMarketValue")
    public void setFairMarketValue(Object fairMarketValue) {
        this.fairMarketValue = fairMarketValue;
    }

    public AdvancementPremiums withFairMarketValue(Object fairMarketValue) {
        this.fairMarketValue = fairMarketValue;
        return this;
    }

    /**
     * Lifetime Maximum Awardable
     * <p>
     * The lifetime maximum number of awards of the premium per constituent.
     * 
     */
    @JsonProperty("lifetimeMaximumAwardable")
    public Object getLifetimeMaximumAwardable() {
        return lifetimeMaximumAwardable;
    }

    /**
     * Lifetime Maximum Awardable
     * <p>
     * The lifetime maximum number of awards of the premium per constituent.
     * 
     */
    @JsonProperty("lifetimeMaximumAwardable")
    public void setLifetimeMaximumAwardable(Object lifetimeMaximumAwardable) {
        this.lifetimeMaximumAwardable = lifetimeMaximumAwardable;
    }

    public AdvancementPremiums withLifetimeMaximumAwardable(Object lifetimeMaximumAwardable) {
        this.lifetimeMaximumAwardable = lifetimeMaximumAwardable;
        return this;
    }

    /**
     * Months Between Assignments
     * <p>
     * The minimum number of months between subsequent assignments of the premium to the same constituent.
     * 
     */
    @JsonProperty("monthsBetweenAssignments")
    public Object getMonthsBetweenAssignments() {
        return monthsBetweenAssignments;
    }

    /**
     * Months Between Assignments
     * <p>
     * The minimum number of months between subsequent assignments of the premium to the same constituent.
     * 
     */
    @JsonProperty("monthsBetweenAssignments")
    public void setMonthsBetweenAssignments(Object monthsBetweenAssignments) {
        this.monthsBetweenAssignments = monthsBetweenAssignments;
    }

    public AdvancementPremiums withMonthsBetweenAssignments(Object monthsBetweenAssignments) {
        this.monthsBetweenAssignments = monthsBetweenAssignments;
        return this;
    }

    /**
     * End On
     * <p>
     * The date when the premium will no longer be available for assignment.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when the premium will no longer be available for assignment.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public AdvancementPremiums withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Comment
     * <p>
     * Any comments regarding the advancement premium.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Any comments regarding the advancement premium.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public AdvancementPremiums withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdvancementPremiums.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("fairMarketValue");
        sb.append('=');
        sb.append(((this.fairMarketValue == null)?"<null>":this.fairMarketValue));
        sb.append(',');
        sb.append("lifetimeMaximumAwardable");
        sb.append('=');
        sb.append(((this.lifetimeMaximumAwardable == null)?"<null>":this.lifetimeMaximumAwardable));
        sb.append(',');
        sb.append("monthsBetweenAssignments");
        sb.append('=');
        sb.append(((this.monthsBetweenAssignments == null)?"<null>":this.monthsBetweenAssignments));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.fairMarketValue == null)? 0 :this.fairMarketValue.hashCode()));
        result = ((result* 31)+((this.monthsBetweenAssignments == null)? 0 :this.monthsBetweenAssignments.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.lifetimeMaximumAwardable == null)? 0 :this.lifetimeMaximumAwardable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvancementPremiums) == false) {
            return false;
        }
        AdvancementPremiums rhs = ((AdvancementPremiums) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.fairMarketValue == rhs.fairMarketValue)||((this.fairMarketValue!= null)&&this.fairMarketValue.equals(rhs.fairMarketValue))))&&((this.monthsBetweenAssignments == rhs.monthsBetweenAssignments)||((this.monthsBetweenAssignments!= null)&&this.monthsBetweenAssignments.equals(rhs.monthsBetweenAssignments))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.lifetimeMaximumAwardable == rhs.lifetimeMaximumAwardable)||((this.lifetimeMaximumAwardable!= null)&&this.lifetimeMaximumAwardable.equals(rhs.lifetimeMaximumAwardable))));
    }

}
