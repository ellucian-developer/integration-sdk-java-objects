
package com.ellucian.generated.bpapi.ban.comment_billing_mass_data_entry.v1_0_0;

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
    "keyblocOrigCode",
    "keyblocComment",
    "keyblocTermCode",
    "keyblocTextCode",
    "restrictUpdateInd",
    "keyblocCommentCode",
    "purgeInd",
    "origCode",
    "keyblocUpdateInd",
    "enddate",
    "commentCode",
    "keyblocPurgeInd",
    "keyblocEnddate",
    "id",
    "termCode"
})
@Generated("jsonschema2pojo")
public class CommentBillingMassDataEntry100PostRequest {

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblocOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblocOrigCode")
    @JsonPropertyDescription("Lineage reference object : keyblocOrigCode, Lookup lineage reference object : stvorig")
    private Object keyblocOrigCode;
    /**
     * Comment
     * <p>
     * Lineage reference object : keyblocComment
     * 
     */
    @JsonProperty("keyblocComment")
    @JsonPropertyDescription("Lineage reference object : keyblocComment")
    private Object keyblocComment;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
    /**
     * Text
     * <p>
     * Lineage reference object : keyblocTextCode
     * 
     */
    @JsonProperty("keyblocTextCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTextCode")
    private Object keyblocTextCode;
    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND")
    private String restrictUpdateInd;
    /**
     * Comment Type
     * <p>
     * Lineage reference object : keyblocCommentCode, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("keyblocCommentCode")
    @JsonPropertyDescription("Lineage reference object : keyblocCommentCode, Lookup lineage reference object : ttvcmnt")
    private Object keyblocCommentCode;
    /**
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_PURGE_IND")
    private String purgeInd;
    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Restrict Update
     * <p>
     * Lineage reference object : keyblocRestrictUpdateInd
     * 
     */
    @JsonProperty("keyblocUpdateInd")
    @JsonPropertyDescription("Lineage reference object : keyblocRestrictUpdateInd")
    private Object keyblocUpdateInd;
    /**
     * End Date
     * <p>
     * Lineage reference object : TBRCMNT_ENDDATE
     * 
     */
    @JsonProperty("enddate")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_ENDDATE")
    private Date enddate;
    /**
     * Comment Type
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt
     * (Required)
     * 
     */
    @JsonProperty("commentCode")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt")
    private String commentCode;
    /**
     * Purge
     * <p>
     * Lineage reference object : keyblocPurgeInd
     * 
     */
    @JsonProperty("keyblocPurgeInd")
    @JsonPropertyDescription("Lineage reference object : keyblocPurgeInd")
    private Object keyblocPurgeInd;
    /**
     * End Date
     * <p>
     * Lineage reference object : keyblocEnddate
     * 
     */
    @JsonProperty("keyblocEnddate")
    @JsonPropertyDescription("Lineage reference object : keyblocEnddate")
    private Object keyblocEnddate;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRCMNT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBRCMNT_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblocOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblocOrigCode")
    public Object getKeyblocOrigCode() {
        return keyblocOrigCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblocOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblocOrigCode")
    public void setKeyblocOrigCode(Object keyblocOrigCode) {
        this.keyblocOrigCode = keyblocOrigCode;
    }

    public CommentBillingMassDataEntry100PostRequest withKeyblocOrigCode(Object keyblocOrigCode) {
        this.keyblocOrigCode = keyblocOrigCode;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : keyblocComment
     * 
     */
    @JsonProperty("keyblocComment")
    public Object getKeyblocComment() {
        return keyblocComment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : keyblocComment
     * 
     */
    @JsonProperty("keyblocComment")
    public void setKeyblocComment(Object keyblocComment) {
        this.keyblocComment = keyblocComment;
    }

    public CommentBillingMassDataEntry100PostRequest withKeyblocComment(Object keyblocComment) {
        this.keyblocComment = keyblocComment;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public CommentBillingMassDataEntry100PostRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Text
     * <p>
     * Lineage reference object : keyblocTextCode
     * 
     */
    @JsonProperty("keyblocTextCode")
    public Object getKeyblocTextCode() {
        return keyblocTextCode;
    }

    /**
     * Text
     * <p>
     * Lineage reference object : keyblocTextCode
     * 
     */
    @JsonProperty("keyblocTextCode")
    public void setKeyblocTextCode(Object keyblocTextCode) {
        this.keyblocTextCode = keyblocTextCode;
    }

    public CommentBillingMassDataEntry100PostRequest withKeyblocTextCode(Object keyblocTextCode) {
        this.keyblocTextCode = keyblocTextCode;
        return this;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    public String getRestrictUpdateInd() {
        return restrictUpdateInd;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TBRCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    public void setRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
    }

    public CommentBillingMassDataEntry100PostRequest withRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : keyblocCommentCode, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("keyblocCommentCode")
    public Object getKeyblocCommentCode() {
        return keyblocCommentCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : keyblocCommentCode, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("keyblocCommentCode")
    public void setKeyblocCommentCode(Object keyblocCommentCode) {
        this.keyblocCommentCode = keyblocCommentCode;
    }

    public CommentBillingMassDataEntry100PostRequest withKeyblocCommentCode(Object keyblocCommentCode) {
        this.keyblocCommentCode = keyblocCommentCode;
        return this;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    public String getPurgeInd() {
        return purgeInd;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TBRCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    public void setPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
    }

    public CommentBillingMassDataEntry100PostRequest withPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TBRCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CommentBillingMassDataEntry100PostRequest withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : keyblocRestrictUpdateInd
     * 
     */
    @JsonProperty("keyblocUpdateInd")
    public Object getKeyblocUpdateInd() {
        return keyblocUpdateInd;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : keyblocRestrictUpdateInd
     * 
     */
    @JsonProperty("keyblocUpdateInd")
    public void setKeyblocUpdateInd(Object keyblocUpdateInd) {
        this.keyblocUpdateInd = keyblocUpdateInd;
    }

    public CommentBillingMassDataEntry100PostRequest withKeyblocUpdateInd(Object keyblocUpdateInd) {
        this.keyblocUpdateInd = keyblocUpdateInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRCMNT_ENDDATE
     * 
     */
    @JsonProperty("enddate")
    public Date getEnddate() {
        return enddate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : TBRCMNT_ENDDATE
     * 
     */
    @JsonProperty("enddate")
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public CommentBillingMassDataEntry100PostRequest withEnddate(Date enddate) {
        this.enddate = enddate;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt
     * (Required)
     * 
     */
    @JsonProperty("commentCode")
    public String getCommentCode() {
        return commentCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : TBRCMNT_COMMENT_CODE, Lookup lineage reference object : ttvcmnt
     * (Required)
     * 
     */
    @JsonProperty("commentCode")
    public void setCommentCode(String commentCode) {
        this.commentCode = commentCode;
    }

    public CommentBillingMassDataEntry100PostRequest withCommentCode(String commentCode) {
        this.commentCode = commentCode;
        return this;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : keyblocPurgeInd
     * 
     */
    @JsonProperty("keyblocPurgeInd")
    public Object getKeyblocPurgeInd() {
        return keyblocPurgeInd;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : keyblocPurgeInd
     * 
     */
    @JsonProperty("keyblocPurgeInd")
    public void setKeyblocPurgeInd(Object keyblocPurgeInd) {
        this.keyblocPurgeInd = keyblocPurgeInd;
    }

    public CommentBillingMassDataEntry100PostRequest withKeyblocPurgeInd(Object keyblocPurgeInd) {
        this.keyblocPurgeInd = keyblocPurgeInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : keyblocEnddate
     * 
     */
    @JsonProperty("keyblocEnddate")
    public Object getKeyblocEnddate() {
        return keyblocEnddate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : keyblocEnddate
     * 
     */
    @JsonProperty("keyblocEnddate")
    public void setKeyblocEnddate(Object keyblocEnddate) {
        this.keyblocEnddate = keyblocEnddate;
    }

    public CommentBillingMassDataEntry100PostRequest withKeyblocEnddate(Object keyblocEnddate) {
        this.keyblocEnddate = keyblocEnddate;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CommentBillingMassDataEntry100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRCMNT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRCMNT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public CommentBillingMassDataEntry100PostRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public CommentBillingMassDataEntry100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommentBillingMassDataEntry100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocOrigCode");
        sb.append('=');
        sb.append(((this.keyblocOrigCode == null)?"<null>":this.keyblocOrigCode));
        sb.append(',');
        sb.append("keyblocComment");
        sb.append('=');
        sb.append(((this.keyblocComment == null)?"<null>":this.keyblocComment));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("keyblocTextCode");
        sb.append('=');
        sb.append(((this.keyblocTextCode == null)?"<null>":this.keyblocTextCode));
        sb.append(',');
        sb.append("restrictUpdateInd");
        sb.append('=');
        sb.append(((this.restrictUpdateInd == null)?"<null>":this.restrictUpdateInd));
        sb.append(',');
        sb.append("keyblocCommentCode");
        sb.append('=');
        sb.append(((this.keyblocCommentCode == null)?"<null>":this.keyblocCommentCode));
        sb.append(',');
        sb.append("purgeInd");
        sb.append('=');
        sb.append(((this.purgeInd == null)?"<null>":this.purgeInd));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("keyblocUpdateInd");
        sb.append('=');
        sb.append(((this.keyblocUpdateInd == null)?"<null>":this.keyblocUpdateInd));
        sb.append(',');
        sb.append("enddate");
        sb.append('=');
        sb.append(((this.enddate == null)?"<null>":this.enddate));
        sb.append(',');
        sb.append("commentCode");
        sb.append('=');
        sb.append(((this.commentCode == null)?"<null>":this.commentCode));
        sb.append(',');
        sb.append("keyblocPurgeInd");
        sb.append('=');
        sb.append(((this.keyblocPurgeInd == null)?"<null>":this.keyblocPurgeInd));
        sb.append(',');
        sb.append("keyblocEnddate");
        sb.append('=');
        sb.append(((this.keyblocEnddate == null)?"<null>":this.keyblocEnddate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.keyblocOrigCode == null)? 0 :this.keyblocOrigCode.hashCode()));
        result = ((result* 31)+((this.keyblocComment == null)? 0 :this.keyblocComment.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.keyblocTextCode == null)? 0 :this.keyblocTextCode.hashCode()));
        result = ((result* 31)+((this.restrictUpdateInd == null)? 0 :this.restrictUpdateInd.hashCode()));
        result = ((result* 31)+((this.keyblocCommentCode == null)? 0 :this.keyblocCommentCode.hashCode()));
        result = ((result* 31)+((this.purgeInd == null)? 0 :this.purgeInd.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.keyblocUpdateInd == null)? 0 :this.keyblocUpdateInd.hashCode()));
        result = ((result* 31)+((this.enddate == null)? 0 :this.enddate.hashCode()));
        result = ((result* 31)+((this.commentCode == null)? 0 :this.commentCode.hashCode()));
        result = ((result* 31)+((this.keyblocPurgeInd == null)? 0 :this.keyblocPurgeInd.hashCode()));
        result = ((result* 31)+((this.keyblocEnddate == null)? 0 :this.keyblocEnddate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommentBillingMassDataEntry100PostRequest) == false) {
            return false;
        }
        CommentBillingMassDataEntry100PostRequest rhs = ((CommentBillingMassDataEntry100PostRequest) other);
        return (((((((((((((((((this.keyblocOrigCode == rhs.keyblocOrigCode)||((this.keyblocOrigCode!= null)&&this.keyblocOrigCode.equals(rhs.keyblocOrigCode)))&&((this.keyblocComment == rhs.keyblocComment)||((this.keyblocComment!= null)&&this.keyblocComment.equals(rhs.keyblocComment))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.keyblocTextCode == rhs.keyblocTextCode)||((this.keyblocTextCode!= null)&&this.keyblocTextCode.equals(rhs.keyblocTextCode))))&&((this.restrictUpdateInd == rhs.restrictUpdateInd)||((this.restrictUpdateInd!= null)&&this.restrictUpdateInd.equals(rhs.restrictUpdateInd))))&&((this.keyblocCommentCode == rhs.keyblocCommentCode)||((this.keyblocCommentCode!= null)&&this.keyblocCommentCode.equals(rhs.keyblocCommentCode))))&&((this.purgeInd == rhs.purgeInd)||((this.purgeInd!= null)&&this.purgeInd.equals(rhs.purgeInd))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.keyblocUpdateInd == rhs.keyblocUpdateInd)||((this.keyblocUpdateInd!= null)&&this.keyblocUpdateInd.equals(rhs.keyblocUpdateInd))))&&((this.enddate == rhs.enddate)||((this.enddate!= null)&&this.enddate.equals(rhs.enddate))))&&((this.commentCode == rhs.commentCode)||((this.commentCode!= null)&&this.commentCode.equals(rhs.commentCode))))&&((this.keyblocPurgeInd == rhs.keyblocPurgeInd)||((this.keyblocPurgeInd!= null)&&this.keyblocPurgeInd.equals(rhs.keyblocPurgeInd))))&&((this.keyblocEnddate == rhs.keyblocEnddate)||((this.keyblocEnddate!= null)&&this.keyblocEnddate.equals(rhs.keyblocEnddate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
