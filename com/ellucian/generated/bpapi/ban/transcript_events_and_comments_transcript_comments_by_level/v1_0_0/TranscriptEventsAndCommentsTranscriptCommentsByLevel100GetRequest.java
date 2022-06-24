
package com.ellucian.generated.bpapi.ban.transcript_events_and_comments_transcript_comments_by_level.v1_0_0;

import java.util.Date;
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
    "keyblckOrigCode",
    "keyblckLevlCode",
    "keyblckTermCode",
    "comment",
    "id",
    "levlCode",
    "effectiveDate",
    "origCode"
})
@Generated("jsonschema2pojo")
public class TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest {

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblckOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblckOrigCode")
    @JsonPropertyDescription("Lineage reference object : keyblckOrigCode, Lookup lineage reference object : stvorig")
    private String keyblckOrigCode;
    /**
     * Level
     * <p>
     * Lineage reference object : keyblckLevlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("keyblckLevlCode")
    @JsonPropertyDescription("Lineage reference object : keyblckLevlCode, Lookup lineage reference object : stvlevl")
    private String keyblckLevlCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode")
    private String keyblckTermCode;
    /**
     * Comment
     * <p>
     * Lineage reference object : SHRTMCM_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : SHRTMCM_COMMENT")
    private String comment;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRTMCM_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRTMCM_LEVL_CODE")
    private String levlCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : SHRTMCM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : SHRTMCM_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Originator
     * <p>
     * Lineage reference object : SHRTMCM_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SHRTMCM_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblckOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblckOrigCode")
    public String getKeyblckOrigCode() {
        return keyblckOrigCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblckOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblckOrigCode")
    public void setKeyblckOrigCode(String keyblckOrigCode) {
        this.keyblckOrigCode = keyblckOrigCode;
    }

    public TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest withKeyblckOrigCode(String keyblckOrigCode) {
        this.keyblckOrigCode = keyblckOrigCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : keyblckLevlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("keyblckLevlCode")
    public String getKeyblckLevlCode() {
        return keyblckLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : keyblckLevlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("keyblckLevlCode")
    public void setKeyblckLevlCode(String keyblckLevlCode) {
        this.keyblckLevlCode = keyblckLevlCode;
    }

    public TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest withKeyblckLevlCode(String keyblckLevlCode) {
        this.keyblckLevlCode = keyblckLevlCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode
     * 
     */
    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SHRTMCM_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SHRTMCM_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRTMCM_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRTMCM_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : SHRTMCM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : SHRTMCM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SHRTMCM_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SHRTMCM_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckOrigCode");
        sb.append('=');
        sb.append(((this.keyblckOrigCode == null)?"<null>":this.keyblckOrigCode));
        sb.append(',');
        sb.append("keyblckLevlCode");
        sb.append('=');
        sb.append(((this.keyblckLevlCode == null)?"<null>":this.keyblckLevlCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
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
        result = ((result* 31)+((this.keyblckOrigCode == null)? 0 :this.keyblckOrigCode.hashCode()));
        result = ((result* 31)+((this.keyblckLevlCode == null)? 0 :this.keyblckLevlCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest) == false) {
            return false;
        }
        TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest rhs = ((TranscriptEventsAndCommentsTranscriptCommentsByLevel100GetRequest) other);
        return ((((((((((this.keyblckOrigCode == rhs.keyblckOrigCode)||((this.keyblckOrigCode!= null)&&this.keyblckOrigCode.equals(rhs.keyblckOrigCode)))&&((this.keyblckLevlCode == rhs.keyblckLevlCode)||((this.keyblckLevlCode!= null)&&this.keyblckLevlCode.equals(rhs.keyblckLevlCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
