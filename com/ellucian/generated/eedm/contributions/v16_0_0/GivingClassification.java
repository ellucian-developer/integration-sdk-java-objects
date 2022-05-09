
package com.ellucian.generated.eedm.contributions.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "classification",
    "amount",
    "designation",
    "comment"
})
@Generated("jsonschema2pojo")
public class GivingClassification {

    /**
     * Classification
     * <p>
     * The user defined categorization of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("The user defined categorization of the contribution.")
    private Classification classification;
    /**
     * Amount
     * <p>
     * The amount of the contribution associated with the giving classification.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount of the contribution associated with the giving classification.")
    private Object amount;
    /**
     * Designation
     * <p>
     * The designated use of the amount associated with the giving classification.
     * 
     */
    @JsonProperty("designation")
    @JsonPropertyDescription("The designated use of the amount associated with the giving classification.")
    private Object designation;
    /**
     * Comment
     * <p>
     * The comment associated with the giving classification.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the giving classification.")
    private String comment;

    /**
     * Classification
     * <p>
     * The user defined categorization of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("classification")
    public Classification getClassification() {
        return classification;
    }

    /**
     * Classification
     * <p>
     * The user defined categorization of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("classification")
    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public GivingClassification withClassification(Classification classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount of the contribution associated with the giving classification.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount of the contribution associated with the giving classification.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public GivingClassification withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Designation
     * <p>
     * The designated use of the amount associated with the giving classification.
     * 
     */
    @JsonProperty("designation")
    public Object getDesignation() {
        return designation;
    }

    /**
     * Designation
     * <p>
     * The designated use of the amount associated with the giving classification.
     * 
     */
    @JsonProperty("designation")
    public void setDesignation(Object designation) {
        this.designation = designation;
    }

    public GivingClassification withDesignation(Object designation) {
        this.designation = designation;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the giving classification.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the giving classification.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public GivingClassification withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GivingClassification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GivingClassification) == false) {
            return false;
        }
        GivingClassification rhs = ((GivingClassification) other);
        return (((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))));
    }

}
