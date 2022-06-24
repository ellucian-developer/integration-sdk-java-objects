
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
    "keyblocPurgeInd",
    "keyblocCommentCode",
    "keyblocEnddate",
    "keyblocRestrictUpdateInd"
})
@Generated("jsonschema2pojo")
public class KeyBlock {

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblocOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblocOrigCode")
    @JsonPropertyDescription("Lineage reference object : keyblocOrigCode, Lookup lineage reference object : stvorig")
    private String keyblocOrigCode;
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
    private String keyblocTermCode;
    /**
     * Text
     * <p>
     * Lineage reference object : keyblocTextCode
     * 
     */
    @JsonProperty("keyblocTextCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTextCode")
    private String keyblocTextCode;
    /**
     * Purge
     * <p>
     * Lineage reference object : keyblocPurgeInd
     * 
     */
    @JsonProperty("keyblocPurgeInd")
    @JsonPropertyDescription("Lineage reference object : keyblocPurgeInd")
    private String keyblocPurgeInd;
    /**
     * Comment Type
     * <p>
     * Lineage reference object : keyblocCommentCode, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("keyblocCommentCode")
    @JsonPropertyDescription("Lineage reference object : keyblocCommentCode, Lookup lineage reference object : ttvcmnt")
    private String keyblocCommentCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : keyblocEnddate
     * 
     */
    @JsonProperty("keyblocEnddate")
    @JsonPropertyDescription("Lineage reference object : keyblocEnddate")
    private Date keyblocEnddate;
    /**
     * Restrict Update
     * <p>
     * Lineage reference object : keyblocRestrictUpdateInd
     * 
     */
    @JsonProperty("keyblocRestrictUpdateInd")
    @JsonPropertyDescription("Lineage reference object : keyblocRestrictUpdateInd")
    private String keyblocRestrictUpdateInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblocOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblocOrigCode")
    public String getKeyblocOrigCode() {
        return keyblocOrigCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblocOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblocOrigCode")
    public void setKeyblocOrigCode(String keyblocOrigCode) {
        this.keyblocOrigCode = keyblocOrigCode;
    }

    public KeyBlock withKeyblocOrigCode(String keyblocOrigCode) {
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

    public KeyBlock withKeyblocComment(Object keyblocComment) {
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
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public KeyBlock withKeyblocTermCode(String keyblocTermCode) {
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
    public String getKeyblocTextCode() {
        return keyblocTextCode;
    }

    /**
     * Text
     * <p>
     * Lineage reference object : keyblocTextCode
     * 
     */
    @JsonProperty("keyblocTextCode")
    public void setKeyblocTextCode(String keyblocTextCode) {
        this.keyblocTextCode = keyblocTextCode;
    }

    public KeyBlock withKeyblocTextCode(String keyblocTextCode) {
        this.keyblocTextCode = keyblocTextCode;
        return this;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : keyblocPurgeInd
     * 
     */
    @JsonProperty("keyblocPurgeInd")
    public String getKeyblocPurgeInd() {
        return keyblocPurgeInd;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : keyblocPurgeInd
     * 
     */
    @JsonProperty("keyblocPurgeInd")
    public void setKeyblocPurgeInd(String keyblocPurgeInd) {
        this.keyblocPurgeInd = keyblocPurgeInd;
    }

    public KeyBlock withKeyblocPurgeInd(String keyblocPurgeInd) {
        this.keyblocPurgeInd = keyblocPurgeInd;
        return this;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : keyblocCommentCode, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("keyblocCommentCode")
    public String getKeyblocCommentCode() {
        return keyblocCommentCode;
    }

    /**
     * Comment Type
     * <p>
     * Lineage reference object : keyblocCommentCode, Lookup lineage reference object : ttvcmnt
     * 
     */
    @JsonProperty("keyblocCommentCode")
    public void setKeyblocCommentCode(String keyblocCommentCode) {
        this.keyblocCommentCode = keyblocCommentCode;
    }

    public KeyBlock withKeyblocCommentCode(String keyblocCommentCode) {
        this.keyblocCommentCode = keyblocCommentCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : keyblocEnddate
     * 
     */
    @JsonProperty("keyblocEnddate")
    public Date getKeyblocEnddate() {
        return keyblocEnddate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : keyblocEnddate
     * 
     */
    @JsonProperty("keyblocEnddate")
    public void setKeyblocEnddate(Date keyblocEnddate) {
        this.keyblocEnddate = keyblocEnddate;
    }

    public KeyBlock withKeyblocEnddate(Date keyblocEnddate) {
        this.keyblocEnddate = keyblocEnddate;
        return this;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : keyblocRestrictUpdateInd
     * 
     */
    @JsonProperty("keyblocRestrictUpdateInd")
    public String getKeyblocRestrictUpdateInd() {
        return keyblocRestrictUpdateInd;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : keyblocRestrictUpdateInd
     * 
     */
    @JsonProperty("keyblocRestrictUpdateInd")
    public void setKeyblocRestrictUpdateInd(String keyblocRestrictUpdateInd) {
        this.keyblocRestrictUpdateInd = keyblocRestrictUpdateInd;
    }

    public KeyBlock withKeyblocRestrictUpdateInd(String keyblocRestrictUpdateInd) {
        this.keyblocRestrictUpdateInd = keyblocRestrictUpdateInd;
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

    public KeyBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("keyblocPurgeInd");
        sb.append('=');
        sb.append(((this.keyblocPurgeInd == null)?"<null>":this.keyblocPurgeInd));
        sb.append(',');
        sb.append("keyblocCommentCode");
        sb.append('=');
        sb.append(((this.keyblocCommentCode == null)?"<null>":this.keyblocCommentCode));
        sb.append(',');
        sb.append("keyblocEnddate");
        sb.append('=');
        sb.append(((this.keyblocEnddate == null)?"<null>":this.keyblocEnddate));
        sb.append(',');
        sb.append("keyblocRestrictUpdateInd");
        sb.append('=');
        sb.append(((this.keyblocRestrictUpdateInd == null)?"<null>":this.keyblocRestrictUpdateInd));
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
        result = ((result* 31)+((this.keyblocPurgeInd == null)? 0 :this.keyblocPurgeInd.hashCode()));
        result = ((result* 31)+((this.keyblocCommentCode == null)? 0 :this.keyblocCommentCode.hashCode()));
        result = ((result* 31)+((this.keyblocEnddate == null)? 0 :this.keyblocEnddate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblocRestrictUpdateInd == null)? 0 :this.keyblocRestrictUpdateInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyBlock) == false) {
            return false;
        }
        KeyBlock rhs = ((KeyBlock) other);
        return ((((((((((this.keyblocOrigCode == rhs.keyblocOrigCode)||((this.keyblocOrigCode!= null)&&this.keyblocOrigCode.equals(rhs.keyblocOrigCode)))&&((this.keyblocComment == rhs.keyblocComment)||((this.keyblocComment!= null)&&this.keyblocComment.equals(rhs.keyblocComment))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.keyblocTextCode == rhs.keyblocTextCode)||((this.keyblocTextCode!= null)&&this.keyblocTextCode.equals(rhs.keyblocTextCode))))&&((this.keyblocPurgeInd == rhs.keyblocPurgeInd)||((this.keyblocPurgeInd!= null)&&this.keyblocPurgeInd.equals(rhs.keyblocPurgeInd))))&&((this.keyblocCommentCode == rhs.keyblocCommentCode)||((this.keyblocCommentCode!= null)&&this.keyblocCommentCode.equals(rhs.keyblocCommentCode))))&&((this.keyblocEnddate == rhs.keyblocEnddate)||((this.keyblocEnddate!= null)&&this.keyblocEnddate.equals(rhs.keyblocEnddate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblocRestrictUpdateInd == rhs.keyblocRestrictUpdateInd)||((this.keyblocRestrictUpdateInd!= null)&&this.keyblocRestrictUpdateInd.equals(rhs.keyblocRestrictUpdateInd))));
    }

}
