
package com.ellucian.generated.bpapi.ban.crosswalk_rules.v1_0_0;

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
    "internalCode",
    "concept",
    "internalCodeSeqno",
    "translationCode",
    "internalCodeGroup",
    "reportingDate",
    "externalCode",
    "sysiCode",
    "desc",
    "sysreqInd",
    "comments",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class CrosswalkRules100QapiPost {

    /**
     * Code
     * <p>
     * Lineage reference object : GTVSDAX_INTERNAL_CODE
     * 
     */
    @JsonProperty("internalCode")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_INTERNAL_CODE")
    private String internalCode;
    /**
     * Concept
     * <p>
     * Lineage reference object : GTVSDAX_CONCEPT
     * 
     */
    @JsonProperty("concept")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_CONCEPT")
    private String concept;
    /**
     * Sequence
     * <p>
     * Lineage reference object : GTVSDAX_INTERNAL_CODE_SEQNO
     * 
     */
    @JsonProperty("internalCodeSeqno")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_INTERNAL_CODE_SEQNO")
    private Double internalCodeSeqno;
    /**
     * Translation Code
     * <p>
     * Lineage reference object : GTVSDAX_TRANSLATION_CODE
     * 
     */
    @JsonProperty("translationCode")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_TRANSLATION_CODE")
    private String translationCode;
    /**
     * Group
     * <p>
     * Lineage reference object : GTVSDAX_INTERNAL_CODE_GROUP
     * 
     */
    @JsonProperty("internalCodeGroup")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_INTERNAL_CODE_GROUP")
    private String internalCodeGroup;
    /**
     * Reporting Date
     * <p>
     * Lineage reference object : GTVSDAX_REPORTING_DATE
     * 
     */
    @JsonProperty("reportingDate")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_REPORTING_DATE")
    private Date reportingDate;
    /**
     * External Code
     * <p>
     * Lineage reference object : GTVSDAX_EXTERNAL_CODE
     * 
     */
    @JsonProperty("externalCode")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_EXTERNAL_CODE")
    private String externalCode;
    /**
     * Sys
     * <p>
     * Lineage reference object : GTVSDAX_SYSI_CODE, Lookup lineage reference object : gtvsysi
     * 
     */
    @JsonProperty("sysiCode")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_SYSI_CODE, Lookup lineage reference object : gtvsysi")
    private String sysiCode;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVSDAX_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_DESC")
    private String desc;
    /**
     * Sys Required
     * <p>
     * Lineage reference object : GTVSDAX_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_SYSREQ_IND")
    private String sysreqInd;
    /**
     * Comments
     * <p>
     * Lineage reference object : GTVSDAX_COMMENTS
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_COMMENTS")
    private String comments;
    /**
     * Last Update
     * <p>
     * Lineage reference object : GTVSDAX_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_USER_ID")
    private String userId;
    /**
     * Lineage reference object : GTVSDAX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVSDAX_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : GTVSDAX_INTERNAL_CODE
     * 
     */
    @JsonProperty("internalCode")
    public String getInternalCode() {
        return internalCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVSDAX_INTERNAL_CODE
     * 
     */
    @JsonProperty("internalCode")
    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public CrosswalkRules100QapiPost withInternalCode(String internalCode) {
        this.internalCode = internalCode;
        return this;
    }

    /**
     * Concept
     * <p>
     * Lineage reference object : GTVSDAX_CONCEPT
     * 
     */
    @JsonProperty("concept")
    public String getConcept() {
        return concept;
    }

    /**
     * Concept
     * <p>
     * Lineage reference object : GTVSDAX_CONCEPT
     * 
     */
    @JsonProperty("concept")
    public void setConcept(String concept) {
        this.concept = concept;
    }

    public CrosswalkRules100QapiPost withConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : GTVSDAX_INTERNAL_CODE_SEQNO
     * 
     */
    @JsonProperty("internalCodeSeqno")
    public Double getInternalCodeSeqno() {
        return internalCodeSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : GTVSDAX_INTERNAL_CODE_SEQNO
     * 
     */
    @JsonProperty("internalCodeSeqno")
    public void setInternalCodeSeqno(Double internalCodeSeqno) {
        this.internalCodeSeqno = internalCodeSeqno;
    }

    public CrosswalkRules100QapiPost withInternalCodeSeqno(Double internalCodeSeqno) {
        this.internalCodeSeqno = internalCodeSeqno;
        return this;
    }

    /**
     * Translation Code
     * <p>
     * Lineage reference object : GTVSDAX_TRANSLATION_CODE
     * 
     */
    @JsonProperty("translationCode")
    public String getTranslationCode() {
        return translationCode;
    }

    /**
     * Translation Code
     * <p>
     * Lineage reference object : GTVSDAX_TRANSLATION_CODE
     * 
     */
    @JsonProperty("translationCode")
    public void setTranslationCode(String translationCode) {
        this.translationCode = translationCode;
    }

    public CrosswalkRules100QapiPost withTranslationCode(String translationCode) {
        this.translationCode = translationCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : GTVSDAX_INTERNAL_CODE_GROUP
     * 
     */
    @JsonProperty("internalCodeGroup")
    public String getInternalCodeGroup() {
        return internalCodeGroup;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : GTVSDAX_INTERNAL_CODE_GROUP
     * 
     */
    @JsonProperty("internalCodeGroup")
    public void setInternalCodeGroup(String internalCodeGroup) {
        this.internalCodeGroup = internalCodeGroup;
    }

    public CrosswalkRules100QapiPost withInternalCodeGroup(String internalCodeGroup) {
        this.internalCodeGroup = internalCodeGroup;
        return this;
    }

    /**
     * Reporting Date
     * <p>
     * Lineage reference object : GTVSDAX_REPORTING_DATE
     * 
     */
    @JsonProperty("reportingDate")
    public Date getReportingDate() {
        return reportingDate;
    }

    /**
     * Reporting Date
     * <p>
     * Lineage reference object : GTVSDAX_REPORTING_DATE
     * 
     */
    @JsonProperty("reportingDate")
    public void setReportingDate(Date reportingDate) {
        this.reportingDate = reportingDate;
    }

    public CrosswalkRules100QapiPost withReportingDate(Date reportingDate) {
        this.reportingDate = reportingDate;
        return this;
    }

    /**
     * External Code
     * <p>
     * Lineage reference object : GTVSDAX_EXTERNAL_CODE
     * 
     */
    @JsonProperty("externalCode")
    public String getExternalCode() {
        return externalCode;
    }

    /**
     * External Code
     * <p>
     * Lineage reference object : GTVSDAX_EXTERNAL_CODE
     * 
     */
    @JsonProperty("externalCode")
    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public CrosswalkRules100QapiPost withExternalCode(String externalCode) {
        this.externalCode = externalCode;
        return this;
    }

    /**
     * Sys
     * <p>
     * Lineage reference object : GTVSDAX_SYSI_CODE, Lookup lineage reference object : gtvsysi
     * 
     */
    @JsonProperty("sysiCode")
    public String getSysiCode() {
        return sysiCode;
    }

    /**
     * Sys
     * <p>
     * Lineage reference object : GTVSDAX_SYSI_CODE, Lookup lineage reference object : gtvsysi
     * 
     */
    @JsonProperty("sysiCode")
    public void setSysiCode(String sysiCode) {
        this.sysiCode = sysiCode;
    }

    public CrosswalkRules100QapiPost withSysiCode(String sysiCode) {
        this.sysiCode = sysiCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVSDAX_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVSDAX_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CrosswalkRules100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Sys Required
     * <p>
     * Lineage reference object : GTVSDAX_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public String getSysreqInd() {
        return sysreqInd;
    }

    /**
     * Sys Required
     * <p>
     * Lineage reference object : GTVSDAX_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public void setSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
    }

    public CrosswalkRules100QapiPost withSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : GTVSDAX_COMMENTS
     * 
     */
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : GTVSDAX_COMMENTS
     * 
     */
    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    public CrosswalkRules100QapiPost withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Last Update
     * <p>
     * Lineage reference object : GTVSDAX_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Last Update
     * <p>
     * Lineage reference object : GTVSDAX_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CrosswalkRules100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : GTVSDAX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : GTVSDAX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CrosswalkRules100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public CrosswalkRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CrosswalkRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("internalCode");
        sb.append('=');
        sb.append(((this.internalCode == null)?"<null>":this.internalCode));
        sb.append(',');
        sb.append("concept");
        sb.append('=');
        sb.append(((this.concept == null)?"<null>":this.concept));
        sb.append(',');
        sb.append("internalCodeSeqno");
        sb.append('=');
        sb.append(((this.internalCodeSeqno == null)?"<null>":this.internalCodeSeqno));
        sb.append(',');
        sb.append("translationCode");
        sb.append('=');
        sb.append(((this.translationCode == null)?"<null>":this.translationCode));
        sb.append(',');
        sb.append("internalCodeGroup");
        sb.append('=');
        sb.append(((this.internalCodeGroup == null)?"<null>":this.internalCodeGroup));
        sb.append(',');
        sb.append("reportingDate");
        sb.append('=');
        sb.append(((this.reportingDate == null)?"<null>":this.reportingDate));
        sb.append(',');
        sb.append("externalCode");
        sb.append('=');
        sb.append(((this.externalCode == null)?"<null>":this.externalCode));
        sb.append(',');
        sb.append("sysiCode");
        sb.append('=');
        sb.append(((this.sysiCode == null)?"<null>":this.sysiCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("sysreqInd");
        sb.append('=');
        sb.append(((this.sysreqInd == null)?"<null>":this.sysreqInd));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.translationCode == null)? 0 :this.translationCode.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.externalCode == null)? 0 :this.externalCode.hashCode()));
        result = ((result* 31)+((this.concept == null)? 0 :this.concept.hashCode()));
        result = ((result* 31)+((this.sysreqInd == null)? 0 :this.sysreqInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.sysiCode == null)? 0 :this.sysiCode.hashCode()));
        result = ((result* 31)+((this.internalCodeSeqno == null)? 0 :this.internalCodeSeqno.hashCode()));
        result = ((result* 31)+((this.reportingDate == null)? 0 :this.reportingDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.internalCodeGroup == null)? 0 :this.internalCodeGroup.hashCode()));
        result = ((result* 31)+((this.internalCode == null)? 0 :this.internalCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrosswalkRules100QapiPost) == false) {
            return false;
        }
        CrosswalkRules100QapiPost rhs = ((CrosswalkRules100QapiPost) other);
        return (((((((((((((((this.translationCode == rhs.translationCode)||((this.translationCode!= null)&&this.translationCode.equals(rhs.translationCode)))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.externalCode == rhs.externalCode)||((this.externalCode!= null)&&this.externalCode.equals(rhs.externalCode))))&&((this.concept == rhs.concept)||((this.concept!= null)&&this.concept.equals(rhs.concept))))&&((this.sysreqInd == rhs.sysreqInd)||((this.sysreqInd!= null)&&this.sysreqInd.equals(rhs.sysreqInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.sysiCode == rhs.sysiCode)||((this.sysiCode!= null)&&this.sysiCode.equals(rhs.sysiCode))))&&((this.internalCodeSeqno == rhs.internalCodeSeqno)||((this.internalCodeSeqno!= null)&&this.internalCodeSeqno.equals(rhs.internalCodeSeqno))))&&((this.reportingDate == rhs.reportingDate)||((this.reportingDate!= null)&&this.reportingDate.equals(rhs.reportingDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.internalCodeGroup == rhs.internalCodeGroup)||((this.internalCodeGroup!= null)&&this.internalCodeGroup.equals(rhs.internalCodeGroup))))&&((this.internalCode == rhs.internalCode)||((this.internalCode!= null)&&this.internalCode.equals(rhs.internalCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
