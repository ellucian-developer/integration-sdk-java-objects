
package com.ellucian.generated.bpapi.ban.aid_year_based_designators.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "criteria.code",
    "criteria.shortDesc",
    "shortDesc",
    "comment",
    "criteria.comment"
})
@Generated("jsonschema2pojo")
public class AidYearBasedDesignators100PutRequest {

    /**
     * Code
     * <p>
     * Lineage reference object : TTVTEXT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_CODE")
    private String criteriaCode;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.shortDesc")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_SHORT_DESC")
    private String criteriaShortDesc;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_SHORT_DESC")
    private String shortDesc;
    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_COMMENT")
    private String comment;
    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.comment")
    @JsonPropertyDescription("Lineage reference object : TTVTEXT_COMMENT")
    private String criteriaComment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : TTVTEXT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : TTVTEXT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public AidYearBasedDesignators100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.shortDesc")
    public String getCriteriaShortDesc() {
        return criteriaShortDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.shortDesc")
    public void setCriteriaShortDesc(String criteriaShortDesc) {
        this.criteriaShortDesc = criteriaShortDesc;
    }

    public AidYearBasedDesignators100PutRequest withCriteriaShortDesc(String criteriaShortDesc) {
        this.criteriaShortDesc = criteriaShortDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVTEXT_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public AidYearBasedDesignators100PutRequest withShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public AidYearBasedDesignators100PutRequest withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.comment")
    public String getCriteriaComment() {
        return criteriaComment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : TTVTEXT_COMMENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.comment")
    public void setCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
    }

    public AidYearBasedDesignators100PutRequest withCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public AidYearBasedDesignators100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AidYearBasedDesignators100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaShortDesc");
        sb.append('=');
        sb.append(((this.criteriaShortDesc == null)?"<null>":this.criteriaShortDesc));
        sb.append(',');
        sb.append("shortDesc");
        sb.append('=');
        sb.append(((this.shortDesc == null)?"<null>":this.shortDesc));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("criteriaComment");
        sb.append('=');
        sb.append(((this.criteriaComment == null)?"<null>":this.criteriaComment));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.criteriaShortDesc == null)? 0 :this.criteriaShortDesc.hashCode()));
        result = ((result* 31)+((this.shortDesc == null)? 0 :this.shortDesc.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.criteriaComment == null)? 0 :this.criteriaComment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AidYearBasedDesignators100PutRequest) == false) {
            return false;
        }
        AidYearBasedDesignators100PutRequest rhs = ((AidYearBasedDesignators100PutRequest) other);
        return (((((((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode)))&&((this.criteriaShortDesc == rhs.criteriaShortDesc)||((this.criteriaShortDesc!= null)&&this.criteriaShortDesc.equals(rhs.criteriaShortDesc))))&&((this.shortDesc == rhs.shortDesc)||((this.shortDesc!= null)&&this.shortDesc.equals(rhs.shortDesc))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.criteriaComment == rhs.criteriaComment)||((this.criteriaComment!= null)&&this.criteriaComment.equals(rhs.criteriaComment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
