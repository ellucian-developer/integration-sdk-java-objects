
package com.ellucian.generated.bpapi.ban.approval_history.v1_0_0;

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
    "chgSeqNum",
    "submissionNumber",
    "queueId",
    "activityDate",
    "docType",
    "docCode",
    "origUserId",
    "queueLevel",
    "origUserName",
    "userName",
    "userId"
})
@Generated("jsonschema2pojo")
public class ApprovalHistory100GetResponse {

    /**
     * Change Sequence
     * <p>
     * Lineage reference object : FOVAPHT_CHG_SEQ_NUM
     * 
     */
    @JsonProperty("chgSeqNum")
    @JsonPropertyDescription("Lineage reference object : FOVAPHT_CHG_SEQ_NUM")
    private Double chgSeqNum;
    /**
     * Submission Number
     * <p>
     * Lineage reference object : FOVAPHT_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    @JsonPropertyDescription("Lineage reference object : FOVAPHT_SUBMISSION_NUMBER")
    private Double submissionNumber;
    /**
     * Queue ID
     * <p>
     * Lineage reference object : FOVAPHT_QUEUE_ID
     * 
     */
    @JsonProperty("queueId")
    @JsonPropertyDescription("Lineage reference object : FOVAPHT_QUEUE_ID")
    private String queueId;
    /**
     * Approved Date
     * <p>
     * Lineage reference object : FOVAPHT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FOVAPHT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Document Type
     * <p>
     * Lineage reference object : FOVAPHT_DOC_TYPE
     * 
     */
    @JsonProperty("docType")
    @JsonPropertyDescription("Lineage reference object : FOVAPHT_DOC_TYPE")
    private String docType;
    /**
     * Document Code
     * <p>
     * Lineage reference object : FOVAPHT_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    @JsonPropertyDescription("Lineage reference object : FOVAPHT_DOC_CODE")
    private String docCode;
    /**
     * Originating User
     * <p>
     * 
     * 
     */
    @JsonProperty("origUserId")
    private String origUserId;
    /**
     * Queue Level
     * <p>
     * Lineage reference object : FOVAPHT_QUEUE_LEVEL
     * 
     */
    @JsonProperty("queueLevel")
    @JsonPropertyDescription("Lineage reference object : FOVAPHT_QUEUE_LEVEL")
    private Double queueLevel;
    @JsonProperty("origUserName")
    private String origUserName;
    /**
     * Approver's Name
     * <p>
     * 
     * 
     */
    @JsonProperty("userName")
    private String userName;
    /**
     * Approver's ID
     * <p>
     * Lineage reference object : FOVAPHT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : FOVAPHT_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Change Sequence
     * <p>
     * Lineage reference object : FOVAPHT_CHG_SEQ_NUM
     * 
     */
    @JsonProperty("chgSeqNum")
    public Double getChgSeqNum() {
        return chgSeqNum;
    }

    /**
     * Change Sequence
     * <p>
     * Lineage reference object : FOVAPHT_CHG_SEQ_NUM
     * 
     */
    @JsonProperty("chgSeqNum")
    public void setChgSeqNum(Double chgSeqNum) {
        this.chgSeqNum = chgSeqNum;
    }

    public ApprovalHistory100GetResponse withChgSeqNum(Double chgSeqNum) {
        this.chgSeqNum = chgSeqNum;
        return this;
    }

    /**
     * Submission Number
     * <p>
     * Lineage reference object : FOVAPHT_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public Double getSubmissionNumber() {
        return submissionNumber;
    }

    /**
     * Submission Number
     * <p>
     * Lineage reference object : FOVAPHT_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public void setSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    public ApprovalHistory100GetResponse withSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
        return this;
    }

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FOVAPHT_QUEUE_ID
     * 
     */
    @JsonProperty("queueId")
    public String getQueueId() {
        return queueId;
    }

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FOVAPHT_QUEUE_ID
     * 
     */
    @JsonProperty("queueId")
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public ApprovalHistory100GetResponse withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Approved Date
     * <p>
     * Lineage reference object : FOVAPHT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Approved Date
     * <p>
     * Lineage reference object : FOVAPHT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ApprovalHistory100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Document Type
     * <p>
     * Lineage reference object : FOVAPHT_DOC_TYPE
     * 
     */
    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    /**
     * Document Type
     * <p>
     * Lineage reference object : FOVAPHT_DOC_TYPE
     * 
     */
    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    public ApprovalHistory100GetResponse withDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * Document Code
     * <p>
     * Lineage reference object : FOVAPHT_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public String getDocCode() {
        return docCode;
    }

    /**
     * Document Code
     * <p>
     * Lineage reference object : FOVAPHT_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public ApprovalHistory100GetResponse withDocCode(String docCode) {
        this.docCode = docCode;
        return this;
    }

    /**
     * Originating User
     * <p>
     * 
     * 
     */
    @JsonProperty("origUserId")
    public String getOrigUserId() {
        return origUserId;
    }

    /**
     * Originating User
     * <p>
     * 
     * 
     */
    @JsonProperty("origUserId")
    public void setOrigUserId(String origUserId) {
        this.origUserId = origUserId;
    }

    public ApprovalHistory100GetResponse withOrigUserId(String origUserId) {
        this.origUserId = origUserId;
        return this;
    }

    /**
     * Queue Level
     * <p>
     * Lineage reference object : FOVAPHT_QUEUE_LEVEL
     * 
     */
    @JsonProperty("queueLevel")
    public Double getQueueLevel() {
        return queueLevel;
    }

    /**
     * Queue Level
     * <p>
     * Lineage reference object : FOVAPHT_QUEUE_LEVEL
     * 
     */
    @JsonProperty("queueLevel")
    public void setQueueLevel(Double queueLevel) {
        this.queueLevel = queueLevel;
    }

    public ApprovalHistory100GetResponse withQueueLevel(Double queueLevel) {
        this.queueLevel = queueLevel;
        return this;
    }

    @JsonProperty("origUserName")
    public String getOrigUserName() {
        return origUserName;
    }

    @JsonProperty("origUserName")
    public void setOrigUserName(String origUserName) {
        this.origUserName = origUserName;
    }

    public ApprovalHistory100GetResponse withOrigUserName(String origUserName) {
        this.origUserName = origUserName;
        return this;
    }

    /**
     * Approver's Name
     * <p>
     * 
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Approver's Name
     * <p>
     * 
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ApprovalHistory100GetResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Approver's ID
     * <p>
     * Lineage reference object : FOVAPHT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Approver's ID
     * <p>
     * Lineage reference object : FOVAPHT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApprovalHistory100GetResponse withUserId(String userId) {
        this.userId = userId;
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

    public ApprovalHistory100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovalHistory100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chgSeqNum");
        sb.append('=');
        sb.append(((this.chgSeqNum == null)?"<null>":this.chgSeqNum));
        sb.append(',');
        sb.append("submissionNumber");
        sb.append('=');
        sb.append(((this.submissionNumber == null)?"<null>":this.submissionNumber));
        sb.append(',');
        sb.append("queueId");
        sb.append('=');
        sb.append(((this.queueId == null)?"<null>":this.queueId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("docType");
        sb.append('=');
        sb.append(((this.docType == null)?"<null>":this.docType));
        sb.append(',');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
        sb.append(',');
        sb.append("origUserId");
        sb.append('=');
        sb.append(((this.origUserId == null)?"<null>":this.origUserId));
        sb.append(',');
        sb.append("queueLevel");
        sb.append('=');
        sb.append(((this.queueLevel == null)?"<null>":this.queueLevel));
        sb.append(',');
        sb.append("origUserName");
        sb.append('=');
        sb.append(((this.origUserName == null)?"<null>":this.origUserName));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.submissionNumber == null)? 0 :this.submissionNumber.hashCode()));
        result = ((result* 31)+((this.queueId == null)? 0 :this.queueId.hashCode()));
        result = ((result* 31)+((this.docType == null)? 0 :this.docType.hashCode()));
        result = ((result* 31)+((this.docCode == null)? 0 :this.docCode.hashCode()));
        result = ((result* 31)+((this.queueLevel == null)? 0 :this.queueLevel.hashCode()));
        result = ((result* 31)+((this.origUserName == null)? 0 :this.origUserName.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.chgSeqNum == null)? 0 :this.chgSeqNum.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.origUserId == null)? 0 :this.origUserId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApprovalHistory100GetResponse) == false) {
            return false;
        }
        ApprovalHistory100GetResponse rhs = ((ApprovalHistory100GetResponse) other);
        return (((((((((((((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber)))&&((this.queueId == rhs.queueId)||((this.queueId!= null)&&this.queueId.equals(rhs.queueId))))&&((this.docType == rhs.docType)||((this.docType!= null)&&this.docType.equals(rhs.docType))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.queueLevel == rhs.queueLevel)||((this.queueLevel!= null)&&this.queueLevel.equals(rhs.queueLevel))))&&((this.origUserName == rhs.origUserName)||((this.origUserName!= null)&&this.origUserName.equals(rhs.origUserName))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.chgSeqNum == rhs.chgSeqNum)||((this.chgSeqNum!= null)&&this.chgSeqNum.equals(rhs.chgSeqNum))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.origUserId == rhs.origUserId)||((this.origUserId!= null)&&this.origUserId.equals(rhs.origUserId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
