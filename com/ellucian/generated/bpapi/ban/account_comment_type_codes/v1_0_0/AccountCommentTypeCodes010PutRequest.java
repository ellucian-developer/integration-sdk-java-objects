
package com.ellucian.generated.bpapi.ban.account_comment_type_codes.v1_0_0;

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
    "criteria.origCode",
    "criteria.termReqInd",
    "criteria.activityDate",
    "enddateReqInd",
    "criteria.activeInd",
    "termReqInd",
    "restrictUpdateInd",
    "purgeInd",
    "criteria.enddateReqInd",
    "criteria.desc",
    "criteria.restrictUpdateInd",
    "origCode",
    "criteria.code",
    "activeInd",
    "criteria.purgeInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class AccountCommentTypeCodes010PutRequest {

    /**
     * Originator
     * <p>
     * Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
    /**
     * Term Required
     * <p>
     * Lineage reference object : TTVCMNT_TERM_REQ_IND
     * 
     */
    @JsonProperty("criteria.termReqInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_TERM_REQ_IND")
    private String criteriaTermReqInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * End Date Required
     * <p>
     * Lineage reference object : TTVCMNT_ENDDATE_REQ_IND
     * 
     */
    @JsonProperty("enddateReqInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ENDDATE_REQ_IND")
    private String enddateReqInd;
    /**
     * Active
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.activeInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ACTIVE_IND")
    private String criteriaActiveInd;
    /**
     * Term Required
     * <p>
     * Lineage reference object : TTVCMNT_TERM_REQ_IND
     * 
     */
    @JsonProperty("termReqInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_TERM_REQ_IND")
    private String termReqInd;
    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND")
    private String restrictUpdateInd;
    /**
     * Purge
     * <p>
     * Lineage reference object : TTVCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_PURGE_IND")
    private String purgeInd;
    /**
     * End Date Required
     * <p>
     * Lineage reference object : TTVCMNT_ENDDATE_REQ_IND
     * 
     */
    @JsonProperty("criteria.enddateReqInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ENDDATE_REQ_IND")
    private String criteriaEnddateReqInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVCMNT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_DESC")
    private String criteriaDesc;
    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("criteria.restrictUpdateInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND")
    private String criteriaRestrictUpdateInd;
    /**
     * Originator
     * <p>
     * Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Code
     * <p>
     * Lineage reference object : TTVCMNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_CODE")
    private String criteriaCode;
    /**
     * Active
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_ACTIVE_IND")
    private String activeInd;
    /**
     * Purge
     * <p>
     * Lineage reference object : TTVCMNT_PURGE_IND
     * 
     */
    @JsonProperty("criteria.purgeInd")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_PURGE_IND")
    private String criteriaPurgeInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVCMNT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TTVCMNT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Originator
     * <p>
     * Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public String getCriteriaOrigCode() {
        return criteriaOrigCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public AccountCommentTypeCodes010PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

    /**
     * Term Required
     * <p>
     * Lineage reference object : TTVCMNT_TERM_REQ_IND
     * 
     */
    @JsonProperty("criteria.termReqInd")
    public String getCriteriaTermReqInd() {
        return criteriaTermReqInd;
    }

    /**
     * Term Required
     * <p>
     * Lineage reference object : TTVCMNT_TERM_REQ_IND
     * 
     */
    @JsonProperty("criteria.termReqInd")
    public void setCriteriaTermReqInd(String criteriaTermReqInd) {
        this.criteriaTermReqInd = criteriaTermReqInd;
    }

    public AccountCommentTypeCodes010PutRequest withCriteriaTermReqInd(String criteriaTermReqInd) {
        this.criteriaTermReqInd = criteriaTermReqInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public AccountCommentTypeCodes010PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * End Date Required
     * <p>
     * Lineage reference object : TTVCMNT_ENDDATE_REQ_IND
     * 
     */
    @JsonProperty("enddateReqInd")
    public String getEnddateReqInd() {
        return enddateReqInd;
    }

    /**
     * End Date Required
     * <p>
     * Lineage reference object : TTVCMNT_ENDDATE_REQ_IND
     * 
     */
    @JsonProperty("enddateReqInd")
    public void setEnddateReqInd(String enddateReqInd) {
        this.enddateReqInd = enddateReqInd;
    }

    public AccountCommentTypeCodes010PutRequest withEnddateReqInd(String enddateReqInd) {
        this.enddateReqInd = enddateReqInd;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.activeInd")
    public String getCriteriaActiveInd() {
        return criteriaActiveInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.activeInd")
    public void setCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
    }

    public AccountCommentTypeCodes010PutRequest withCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
        return this;
    }

    /**
     * Term Required
     * <p>
     * Lineage reference object : TTVCMNT_TERM_REQ_IND
     * 
     */
    @JsonProperty("termReqInd")
    public String getTermReqInd() {
        return termReqInd;
    }

    /**
     * Term Required
     * <p>
     * Lineage reference object : TTVCMNT_TERM_REQ_IND
     * 
     */
    @JsonProperty("termReqInd")
    public void setTermReqInd(String termReqInd) {
        this.termReqInd = termReqInd;
    }

    public AccountCommentTypeCodes010PutRequest withTermReqInd(String termReqInd) {
        this.termReqInd = termReqInd;
        return this;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    public String getRestrictUpdateInd() {
        return restrictUpdateInd;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("restrictUpdateInd")
    public void setRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
    }

    public AccountCommentTypeCodes010PutRequest withRestrictUpdateInd(String restrictUpdateInd) {
        this.restrictUpdateInd = restrictUpdateInd;
        return this;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TTVCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    public String getPurgeInd() {
        return purgeInd;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TTVCMNT_PURGE_IND
     * 
     */
    @JsonProperty("purgeInd")
    public void setPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
    }

    public AccountCommentTypeCodes010PutRequest withPurgeInd(String purgeInd) {
        this.purgeInd = purgeInd;
        return this;
    }

    /**
     * End Date Required
     * <p>
     * Lineage reference object : TTVCMNT_ENDDATE_REQ_IND
     * 
     */
    @JsonProperty("criteria.enddateReqInd")
    public String getCriteriaEnddateReqInd() {
        return criteriaEnddateReqInd;
    }

    /**
     * End Date Required
     * <p>
     * Lineage reference object : TTVCMNT_ENDDATE_REQ_IND
     * 
     */
    @JsonProperty("criteria.enddateReqInd")
    public void setCriteriaEnddateReqInd(String criteriaEnddateReqInd) {
        this.criteriaEnddateReqInd = criteriaEnddateReqInd;
    }

    public AccountCommentTypeCodes010PutRequest withCriteriaEnddateReqInd(String criteriaEnddateReqInd) {
        this.criteriaEnddateReqInd = criteriaEnddateReqInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVCMNT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVCMNT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public AccountCommentTypeCodes010PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("criteria.restrictUpdateInd")
    public String getCriteriaRestrictUpdateInd() {
        return criteriaRestrictUpdateInd;
    }

    /**
     * Restrict Update
     * <p>
     * Lineage reference object : TTVCMNT_RESTRICT_UPDATE_IND
     * 
     */
    @JsonProperty("criteria.restrictUpdateInd")
    public void setCriteriaRestrictUpdateInd(String criteriaRestrictUpdateInd) {
        this.criteriaRestrictUpdateInd = criteriaRestrictUpdateInd;
    }

    public AccountCommentTypeCodes010PutRequest withCriteriaRestrictUpdateInd(String criteriaRestrictUpdateInd) {
        this.criteriaRestrictUpdateInd = criteriaRestrictUpdateInd;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : TTVCMNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public AccountCommentTypeCodes010PutRequest withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : TTVCMNT_CODE
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
     * Lineage reference object : TTVCMNT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public AccountCommentTypeCodes010PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TTVCMNT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public AccountCommentTypeCodes010PutRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TTVCMNT_PURGE_IND
     * 
     */
    @JsonProperty("criteria.purgeInd")
    public String getCriteriaPurgeInd() {
        return criteriaPurgeInd;
    }

    /**
     * Purge
     * <p>
     * Lineage reference object : TTVCMNT_PURGE_IND
     * 
     */
    @JsonProperty("criteria.purgeInd")
    public void setCriteriaPurgeInd(String criteriaPurgeInd) {
        this.criteriaPurgeInd = criteriaPurgeInd;
    }

    public AccountCommentTypeCodes010PutRequest withCriteriaPurgeInd(String criteriaPurgeInd) {
        this.criteriaPurgeInd = criteriaPurgeInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVCMNT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVCMNT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AccountCommentTypeCodes010PutRequest withDesc(String desc) {
        this.desc = desc;
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

    public AccountCommentTypeCodes010PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountCommentTypeCodes010PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaOrigCode");
        sb.append('=');
        sb.append(((this.criteriaOrigCode == null)?"<null>":this.criteriaOrigCode));
        sb.append(',');
        sb.append("criteriaTermReqInd");
        sb.append('=');
        sb.append(((this.criteriaTermReqInd == null)?"<null>":this.criteriaTermReqInd));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("enddateReqInd");
        sb.append('=');
        sb.append(((this.enddateReqInd == null)?"<null>":this.enddateReqInd));
        sb.append(',');
        sb.append("criteriaActiveInd");
        sb.append('=');
        sb.append(((this.criteriaActiveInd == null)?"<null>":this.criteriaActiveInd));
        sb.append(',');
        sb.append("termReqInd");
        sb.append('=');
        sb.append(((this.termReqInd == null)?"<null>":this.termReqInd));
        sb.append(',');
        sb.append("restrictUpdateInd");
        sb.append('=');
        sb.append(((this.restrictUpdateInd == null)?"<null>":this.restrictUpdateInd));
        sb.append(',');
        sb.append("purgeInd");
        sb.append('=');
        sb.append(((this.purgeInd == null)?"<null>":this.purgeInd));
        sb.append(',');
        sb.append("criteriaEnddateReqInd");
        sb.append('=');
        sb.append(((this.criteriaEnddateReqInd == null)?"<null>":this.criteriaEnddateReqInd));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaRestrictUpdateInd");
        sb.append('=');
        sb.append(((this.criteriaRestrictUpdateInd == null)?"<null>":this.criteriaRestrictUpdateInd));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("criteriaPurgeInd");
        sb.append('=');
        sb.append(((this.criteriaPurgeInd == null)?"<null>":this.criteriaPurgeInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaRestrictUpdateInd == null)? 0 :this.criteriaRestrictUpdateInd.hashCode()));
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.enddateReqInd == null)? 0 :this.enddateReqInd.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermReqInd == null)? 0 :this.criteriaTermReqInd.hashCode()));
        result = ((result* 31)+((this.termReqInd == null)? 0 :this.termReqInd.hashCode()));
        result = ((result* 31)+((this.restrictUpdateInd == null)? 0 :this.restrictUpdateInd.hashCode()));
        result = ((result* 31)+((this.purgeInd == null)? 0 :this.purgeInd.hashCode()));
        result = ((result* 31)+((this.criteriaActiveInd == null)? 0 :this.criteriaActiveInd.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.criteriaEnddateReqInd == null)? 0 :this.criteriaEnddateReqInd.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.criteriaPurgeInd == null)? 0 :this.criteriaPurgeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountCommentTypeCodes010PutRequest) == false) {
            return false;
        }
        AccountCommentTypeCodes010PutRequest rhs = ((AccountCommentTypeCodes010PutRequest) other);
        return ((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaRestrictUpdateInd == rhs.criteriaRestrictUpdateInd)||((this.criteriaRestrictUpdateInd!= null)&&this.criteriaRestrictUpdateInd.equals(rhs.criteriaRestrictUpdateInd))))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.enddateReqInd == rhs.enddateReqInd)||((this.enddateReqInd!= null)&&this.enddateReqInd.equals(rhs.enddateReqInd))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.criteriaTermReqInd == rhs.criteriaTermReqInd)||((this.criteriaTermReqInd!= null)&&this.criteriaTermReqInd.equals(rhs.criteriaTermReqInd))))&&((this.termReqInd == rhs.termReqInd)||((this.termReqInd!= null)&&this.termReqInd.equals(rhs.termReqInd))))&&((this.restrictUpdateInd == rhs.restrictUpdateInd)||((this.restrictUpdateInd!= null)&&this.restrictUpdateInd.equals(rhs.restrictUpdateInd))))&&((this.purgeInd == rhs.purgeInd)||((this.purgeInd!= null)&&this.purgeInd.equals(rhs.purgeInd))))&&((this.criteriaActiveInd == rhs.criteriaActiveInd)||((this.criteriaActiveInd!= null)&&this.criteriaActiveInd.equals(rhs.criteriaActiveInd))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.criteriaEnddateReqInd == rhs.criteriaEnddateReqInd)||((this.criteriaEnddateReqInd!= null)&&this.criteriaEnddateReqInd.equals(rhs.criteriaEnddateReqInd))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.criteriaPurgeInd == rhs.criteriaPurgeInd)||((this.criteriaPurgeInd!= null)&&this.criteriaPurgeInd.equals(rhs.criteriaPurgeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
