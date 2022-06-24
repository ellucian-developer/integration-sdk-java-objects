
package com.ellucian.generated.bpapi.ban.admissions_application_sources_interests_comments.v1_0_0;

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
    "kbentryTermCode",
    "primarySrceInd",
    "sbgiCode",
    "id",
    "commentText",
    "intsCode",
    "origCode"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationSourcesInterestsComments100PostRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    @JsonPropertyDescription("Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm")
    private String kbentryTermCode;
    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("primarySrceInd")
    @JsonPropertyDescription("Lineage reference object : SARRSRC_PRIMARY_SRCE_IND")
    private String primarySrceInd;
    /**
     * Background Institution
     * <p>
     * Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String sbgiCode;
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
     * Comment
     * <p>
     * Lineage reference object : SARACMT_COMMENT_TEXT
     * 
     */
    @JsonProperty("commentText")
    @JsonPropertyDescription("Lineage reference object : SARACMT_COMMENT_TEXT")
    private String commentText;
    /**
     * Interest
     * <p>
     * Lineage reference object : SORINTS_INTS_CODE, Lookup lineage reference object : stvints
     * (Required)
     * 
     */
    @JsonProperty("intsCode")
    @JsonPropertyDescription("Lineage reference object : SORINTS_INTS_CODE, Lookup lineage reference object : stvints")
    private String intsCode;
    /**
     * Originator
     * <p>
     * Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public String getKbentryTermCode() {
        return kbentryTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public void setKbentryTermCode(String kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostRequest withKbentryTermCode(String kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
        return this;
    }

    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("primarySrceInd")
    public String getPrimarySrceInd() {
        return primarySrceInd;
    }

    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("primarySrceInd")
    public void setPrimarySrceInd(String primarySrceInd) {
        this.primarySrceInd = primarySrceInd;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostRequest withPrimarySrceInd(String primarySrceInd) {
        this.primarySrceInd = primarySrceInd;
        return this;
    }

    /**
     * Background Institution
     * <p>
     * Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Background Institution
     * <p>
     * Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostRequest withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
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

    public AdmissionsApplicationSourcesInterestsComments100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SARACMT_COMMENT_TEXT
     * 
     */
    @JsonProperty("commentText")
    public String getCommentText() {
        return commentText;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SARACMT_COMMENT_TEXT
     * 
     */
    @JsonProperty("commentText")
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostRequest withCommentText(String commentText) {
        this.commentText = commentText;
        return this;
    }

    /**
     * Interest
     * <p>
     * Lineage reference object : SORINTS_INTS_CODE, Lookup lineage reference object : stvints
     * (Required)
     * 
     */
    @JsonProperty("intsCode")
    public String getIntsCode() {
        return intsCode;
    }

    /**
     * Interest
     * <p>
     * Lineage reference object : SORINTS_INTS_CODE, Lookup lineage reference object : stvints
     * (Required)
     * 
     */
    @JsonProperty("intsCode")
    public void setIntsCode(String intsCode) {
        this.intsCode = intsCode;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostRequest withIntsCode(String intsCode) {
        this.intsCode = intsCode;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostRequest withOrigCode(String origCode) {
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

    public AdmissionsApplicationSourcesInterestsComments100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationSourcesInterestsComments100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
        sb.append(',');
        sb.append("primarySrceInd");
        sb.append('=');
        sb.append(((this.primarySrceInd == null)?"<null>":this.primarySrceInd));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("commentText");
        sb.append('=');
        sb.append(((this.commentText == null)?"<null>":this.commentText));
        sb.append(',');
        sb.append("intsCode");
        sb.append('=');
        sb.append(((this.intsCode == null)?"<null>":this.intsCode));
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
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.primarySrceInd == null)? 0 :this.primarySrceInd.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.commentText == null)? 0 :this.commentText.hashCode()));
        result = ((result* 31)+((this.intsCode == null)? 0 :this.intsCode.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationSourcesInterestsComments100PostRequest) == false) {
            return false;
        }
        AdmissionsApplicationSourcesInterestsComments100PostRequest rhs = ((AdmissionsApplicationSourcesInterestsComments100PostRequest) other);
        return (((((((((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode)))&&((this.primarySrceInd == rhs.primarySrceInd)||((this.primarySrceInd!= null)&&this.primarySrceInd.equals(rhs.primarySrceInd))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.commentText == rhs.commentText)||((this.commentText!= null)&&this.commentText.equals(rhs.commentText))))&&((this.intsCode == rhs.intsCode)||((this.intsCode!= null)&&this.intsCode.equals(rhs.intsCode))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
