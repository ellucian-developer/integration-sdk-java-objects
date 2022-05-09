
package com.ellucian.generated.eedm.contributions.v10_0;

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
    "comments"
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
     * Comments
     * <p>
     * The comment associated with the giving classification.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comment associated with the giving classification.")
    private String comments;

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
     * Comments
     * <p>
     * The comment associated with the giving classification.
     * 
     */
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comment associated with the giving classification.
     * 
     */
    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    public GivingClassification withComments(String comments) {
        this.comments = comments;
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
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
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
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
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
        return (((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))));
    }

}
