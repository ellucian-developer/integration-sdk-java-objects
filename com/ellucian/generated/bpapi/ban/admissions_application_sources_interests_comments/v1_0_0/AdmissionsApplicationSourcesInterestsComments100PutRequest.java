
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
    "criteria.origCode",
    "criteria.commentText",
    "kbentryTermCode",
    "primarySrceInd",
    "criteria.stvsbgiDesc",
    "sbgiCode",
    "id",
    "commentText",
    "criteria.sbgiCode",
    "criteria.primarySrceInd",
    "origCode"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationSourcesInterestsComments100PutRequest {

    /**
     * Originator
     * <p>
     * Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
    /**
     * Comment
     * <p>
     * Lineage reference object : SARACMT_COMMENT_TEXT
     * 
     */
    @JsonProperty("criteria.commentText")
    @JsonPropertyDescription("Lineage reference object : SARACMT_COMMENT_TEXT")
    private String criteriaCommentText;
    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    @JsonPropertyDescription("Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm")
    private Object kbentryTermCode;
    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("primarySrceInd")
    @JsonPropertyDescription("Lineage reference object : SARRSRC_PRIMARY_SRCE_IND")
    private String primarySrceInd;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvsbgiDesc")
    private String criteriaStvsbgiDesc;
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
    private Object id;
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
     * Background Institution
     * <p>
     * Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String criteriaSbgiCode;
    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("criteria.primarySrceInd")
    @JsonPropertyDescription("Lineage reference object : SARRSRC_PRIMARY_SRCE_IND")
    private String criteriaPrimarySrceInd;
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
     * Originator
     * <p>
     * Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("criteria.origCode")
    public String getCriteriaOrigCode() {
        return criteriaOrigCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SARACMT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SARACMT_COMMENT_TEXT
     * 
     */
    @JsonProperty("criteria.commentText")
    public String getCriteriaCommentText() {
        return criteriaCommentText;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SARACMT_COMMENT_TEXT
     * 
     */
    @JsonProperty("criteria.commentText")
    public void setCriteriaCommentText(String criteriaCommentText) {
        this.criteriaCommentText = criteriaCommentText;
    }

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withCriteriaCommentText(String criteriaCommentText) {
        this.criteriaCommentText = criteriaCommentText;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public Object getKbentryTermCode() {
        return kbentryTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public void setKbentryTermCode(Object kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
    }

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withKbentryTermCode(Object kbentryTermCode) {
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

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withPrimarySrceInd(String primarySrceInd) {
        this.primarySrceInd = primarySrceInd;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvsbgiDesc")
    public String getCriteriaStvsbgiDesc() {
        return criteriaStvsbgiDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvsbgiDesc")
    public void setCriteriaStvsbgiDesc(String criteriaStvsbgiDesc) {
        this.criteriaStvsbgiDesc = criteriaStvsbgiDesc;
    }

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withCriteriaStvsbgiDesc(String criteriaStvsbgiDesc) {
        this.criteriaStvsbgiDesc = criteriaStvsbgiDesc;
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

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withSbgiCode(String sbgiCode) {
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
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withId(Object id) {
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

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withCommentText(String commentText) {
        this.commentText = commentText;
        return this;
    }

    /**
     * Background Institution
     * <p>
     * Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public String getCriteriaSbgiCode() {
        return criteriaSbgiCode;
    }

    /**
     * Background Institution
     * <p>
     * Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public void setCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
    }

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
        return this;
    }

    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("criteria.primarySrceInd")
    public String getCriteriaPrimarySrceInd() {
        return criteriaPrimarySrceInd;
    }

    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("criteria.primarySrceInd")
    public void setCriteriaPrimarySrceInd(String criteriaPrimarySrceInd) {
        this.criteriaPrimarySrceInd = criteriaPrimarySrceInd;
    }

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withCriteriaPrimarySrceInd(String criteriaPrimarySrceInd) {
        this.criteriaPrimarySrceInd = criteriaPrimarySrceInd;
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

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withOrigCode(String origCode) {
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

    public AdmissionsApplicationSourcesInterestsComments100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationSourcesInterestsComments100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaOrigCode");
        sb.append('=');
        sb.append(((this.criteriaOrigCode == null)?"<null>":this.criteriaOrigCode));
        sb.append(',');
        sb.append("criteriaCommentText");
        sb.append('=');
        sb.append(((this.criteriaCommentText == null)?"<null>":this.criteriaCommentText));
        sb.append(',');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
        sb.append(',');
        sb.append("primarySrceInd");
        sb.append('=');
        sb.append(((this.primarySrceInd == null)?"<null>":this.primarySrceInd));
        sb.append(',');
        sb.append("criteriaStvsbgiDesc");
        sb.append('=');
        sb.append(((this.criteriaStvsbgiDesc == null)?"<null>":this.criteriaStvsbgiDesc));
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
        sb.append("criteriaSbgiCode");
        sb.append('=');
        sb.append(((this.criteriaSbgiCode == null)?"<null>":this.criteriaSbgiCode));
        sb.append(',');
        sb.append("criteriaPrimarySrceInd");
        sb.append('=');
        sb.append(((this.criteriaPrimarySrceInd == null)?"<null>":this.criteriaPrimarySrceInd));
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
        result = ((result* 31)+((this.criteriaCommentText == null)? 0 :this.criteriaCommentText.hashCode()));
        result = ((result* 31)+((this.criteriaSbgiCode == null)? 0 :this.criteriaSbgiCode.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.commentText == null)? 0 :this.commentText.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.primarySrceInd == null)? 0 :this.primarySrceInd.hashCode()));
        result = ((result* 31)+((this.criteriaStvsbgiDesc == null)? 0 :this.criteriaStvsbgiDesc.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaPrimarySrceInd == null)? 0 :this.criteriaPrimarySrceInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationSourcesInterestsComments100PutRequest) == false) {
            return false;
        }
        AdmissionsApplicationSourcesInterestsComments100PutRequest rhs = ((AdmissionsApplicationSourcesInterestsComments100PutRequest) other);
        return (((((((((((((this.criteriaCommentText == rhs.criteriaCommentText)||((this.criteriaCommentText!= null)&&this.criteriaCommentText.equals(rhs.criteriaCommentText)))&&((this.criteriaSbgiCode == rhs.criteriaSbgiCode)||((this.criteriaSbgiCode!= null)&&this.criteriaSbgiCode.equals(rhs.criteriaSbgiCode))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.commentText == rhs.commentText)||((this.commentText!= null)&&this.commentText.equals(rhs.commentText))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.primarySrceInd == rhs.primarySrceInd)||((this.primarySrceInd!= null)&&this.primarySrceInd.equals(rhs.primarySrceInd))))&&((this.criteriaStvsbgiDesc == rhs.criteriaStvsbgiDesc)||((this.criteriaStvsbgiDesc!= null)&&this.criteriaStvsbgiDesc.equals(rhs.criteriaStvsbgiDesc))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaPrimarySrceInd == rhs.criteriaPrimarySrceInd)||((this.criteriaPrimarySrceInd!= null)&&this.criteriaPrimarySrceInd.equals(rhs.criteriaPrimarySrceInd))));
    }

}
