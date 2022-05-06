
package com.ellucian.generated.bpapi.ban.applicant_entry_by_requisition_or_position_status_log.v1_0_0;

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
    "appsCode",
    "activityDate",
    "seqNo",
    "comment",
    "appsDesc",
    "userId",
    "appsDate"
})
@Generated("jsonschema2pojo")
public class Parapst {

    /**
     * Status
     * <p>
     * Lineage reference object : PARAPST_APPS_CODE
     * 
     */
    @JsonProperty("appsCode")
    @JsonPropertyDescription("Lineage reference object : PARAPST_APPS_CODE")
    private String appsCode;
    /**
     * Lineage reference object : PARAPST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PARAPST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PARAPST_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : PARAPST_SEQ_NO")
    private String seqNo;
    /**
     * Comment
     * <p>
     * Lineage reference object : PARAPST_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : PARAPST_COMMENT")
    private String comment;
    @JsonProperty("appsDesc")
    private String appsDesc;
    /**
     * Lineage reference object : PARAPST_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PARAPST_USER_ID")
    private String userId;
    /**
     * Status Date
     * <p>
     * Lineage reference object : PARAPST_APPS_DATE
     * (Required)
     * 
     */
    @JsonProperty("appsDate")
    @JsonPropertyDescription("Lineage reference object : PARAPST_APPS_DATE")
    private Date appsDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : PARAPST_APPS_CODE
     * 
     */
    @JsonProperty("appsCode")
    public String getAppsCode() {
        return appsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : PARAPST_APPS_CODE
     * 
     */
    @JsonProperty("appsCode")
    public void setAppsCode(String appsCode) {
        this.appsCode = appsCode;
    }

    public Parapst withAppsCode(String appsCode) {
        this.appsCode = appsCode;
        return this;
    }

    /**
     * Lineage reference object : PARAPST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PARAPST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Parapst withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PARAPST_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PARAPST_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public Parapst withSeqNo(String seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PARAPST_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : PARAPST_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Parapst withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @JsonProperty("appsDesc")
    public String getAppsDesc() {
        return appsDesc;
    }

    @JsonProperty("appsDesc")
    public void setAppsDesc(String appsDesc) {
        this.appsDesc = appsDesc;
    }

    public Parapst withAppsDesc(String appsDesc) {
        this.appsDesc = appsDesc;
        return this;
    }

    /**
     * Lineage reference object : PARAPST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PARAPST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Parapst withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : PARAPST_APPS_DATE
     * (Required)
     * 
     */
    @JsonProperty("appsDate")
    public Date getAppsDate() {
        return appsDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : PARAPST_APPS_DATE
     * (Required)
     * 
     */
    @JsonProperty("appsDate")
    public void setAppsDate(Date appsDate) {
        this.appsDate = appsDate;
    }

    public Parapst withAppsDate(Date appsDate) {
        this.appsDate = appsDate;
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

    public Parapst withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Parapst.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("appsCode");
        sb.append('=');
        sb.append(((this.appsCode == null)?"<null>":this.appsCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("appsDesc");
        sb.append('=');
        sb.append(((this.appsDesc == null)?"<null>":this.appsDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("appsDate");
        sb.append('=');
        sb.append(((this.appsDate == null)?"<null>":this.appsDate));
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
        result = ((result* 31)+((this.appsCode == null)? 0 :this.appsCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.appsDesc == null)? 0 :this.appsDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.appsDate == null)? 0 :this.appsDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parapst) == false) {
            return false;
        }
        Parapst rhs = ((Parapst) other);
        return (((((((((this.appsCode == rhs.appsCode)||((this.appsCode!= null)&&this.appsCode.equals(rhs.appsCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.appsDesc == rhs.appsDesc)||((this.appsDesc!= null)&&this.appsDesc.equals(rhs.appsDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.appsDate == rhs.appsDate)||((this.appsDate!= null)&&this.appsDate.equals(rhs.appsDate))));
    }

}
