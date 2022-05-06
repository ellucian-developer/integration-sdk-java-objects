
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
    "enddate",
    "commentCode",
    "name",
    "restrictUpdateInd",
    "id",
    "purgeInd",
    "origCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbrcmnt {

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
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
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
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
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

    public Tbrcmnt withEnddate(Date enddate) {
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

    public Tbrcmnt withCommentCode(String commentCode) {
        this.commentCode = commentCode;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Tbrcmnt withName(String name) {
        this.name = name;
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

    public Tbrcmnt withRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
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

    public Tbrcmnt withId(String id) {
        this.id = id;
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

    public Tbrcmnt withPurgeInd(String purgeInd) {
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

    public Tbrcmnt withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public Tbrcmnt withTermCode(String termCode) {
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

    public Tbrcmnt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbrcmnt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enddate");
        sb.append('=');
        sb.append(((this.enddate == null)?"<null>":this.enddate));
        sb.append(',');
        sb.append("commentCode");
        sb.append('=');
        sb.append(((this.commentCode == null)?"<null>":this.commentCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("restrictUpdateInd");
        sb.append('=');
        sb.append(((this.restrictUpdateInd == null)?"<null>":this.restrictUpdateInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("purgeInd");
        sb.append('=');
        sb.append(((this.purgeInd == null)?"<null>":this.purgeInd));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
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
        result = ((result* 31)+((this.enddate == null)? 0 :this.enddate.hashCode()));
        result = ((result* 31)+((this.commentCode == null)? 0 :this.commentCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.restrictUpdateInd == null)? 0 :this.restrictUpdateInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.purgeInd == null)? 0 :this.purgeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbrcmnt) == false) {
            return false;
        }
        Tbrcmnt rhs = ((Tbrcmnt) other);
        return ((((((((((this.enddate == rhs.enddate)||((this.enddate!= null)&&this.enddate.equals(rhs.enddate)))&&((this.commentCode == rhs.commentCode)||((this.commentCode!= null)&&this.commentCode.equals(rhs.commentCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.restrictUpdateInd == rhs.restrictUpdateInd)||((this.restrictUpdateInd!= null)&&this.restrictUpdateInd.equals(rhs.restrictUpdateInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.purgeInd == rhs.purgeInd)||((this.purgeInd!= null)&&this.purgeInd.equals(rhs.purgeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
