
package com.ellucian.generated.bpapi.ban.electronic_approval_summary_transaction_information.v1_0_0;

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
    "criteria.holdQueueStatusInd",
    "criteria.submissionDate",
    "transactionStatus",
    "criteria.holdActionInd",
    "criteria.name",
    "criteria.applyUserId",
    "criteria.originatorUserId",
    "criteria.applyDate",
    "criteria.acatCode",
    "transactionToDate",
    "criteria.applyInd",
    "criteria.createdDate",
    "criteria.transactionNo",
    "queueStatus",
    "criteria.id",
    "approverAction",
    "proxyFor",
    "transactionFromDate"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalSummaryTransactionInformation100PutRequest {

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.holdQueueStatusInd")
    private String criteriaHoldQueueStatusInd;
    /**
     * Submitted On
     * <p>
     * Lineage reference object : NOBTRAN_SUBMISSION_DATE
     * 
     */
    @JsonProperty("criteria.submissionDate")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_SUBMISSION_DATE")
    private Date criteriaSubmissionDate;
    /**
     * Transaction Status
     * <p>
     * Lineage reference object : transactionStatus
     * (Required)
     * 
     */
    @JsonProperty("transactionStatus")
    @JsonPropertyDescription("Lineage reference object : transactionStatus")
    private String transactionStatus;
    /**
     * Required Action Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.holdActionInd")
    private String criteriaHoldActionInd;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.name")
    private String criteriaName;
    /**
     * Applied to Database By
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_USER_ID
     * 
     */
    @JsonProperty("criteria.applyUserId")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_APPLY_USER_ID")
    private String criteriaApplyUserId;
    /**
     * Originator ID
     * <p>
     * Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID
     * 
     */
    @JsonProperty("criteria.originatorUserId")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID")
    private String criteriaOriginatorUserId;
    /**
     * Application Date
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_DATE
     * 
     */
    @JsonProperty("criteria.applyDate")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_APPLY_DATE")
    private Date criteriaApplyDate;
    /**
     * Approval Category
     * <p>
     * Lineage reference object : NOBTRAN_ACAT_CODE
     * 
     */
    @JsonProperty("criteria.acatCode")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_ACAT_CODE")
    private String criteriaAcatCode;
    /**
     * Submitted To Date
     * <p>
     * Lineage reference object : transactionToDate
     * 
     */
    @JsonProperty("transactionToDate")
    @JsonPropertyDescription("Lineage reference object : transactionToDate")
    private Date transactionToDate;
    /**
     * Lineage reference object : NOBTRAN_APPLY_IND
     * 
     */
    @JsonProperty("criteria.applyInd")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_APPLY_IND")
    private String criteriaApplyInd;
    /**
     * Transaction Created On
     * <p>
     * Lineage reference object : NOBTRAN_CREATED_DATE
     * 
     */
    @JsonProperty("criteria.createdDate")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_CREATED_DATE")
    private Date criteriaCreatedDate;
    /**
     * Transaction Number
     * <p>
     * Lineage reference object : NOBTRAN_TRANSACTION_NO
     * 
     */
    @JsonProperty("criteria.transactionNo")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_TRANSACTION_NO")
    private Double criteriaTransactionNo;
    /**
     * Queue Status
     * <p>
     * Lineage reference object : queueStatus
     * (Required)
     * 
     */
    @JsonProperty("queueStatus")
    @JsonPropertyDescription("Lineage reference object : queueStatus")
    private String queueStatus;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.id")
    private String criteriaId;
    /**
     * Approver Action
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("approverAction")
    private String approverAction;
    /**
     * Proxy For
     * <p>
     * Lineage reference object : proxyFor
     * 
     */
    @JsonProperty("proxyFor")
    @JsonPropertyDescription("Lineage reference object : proxyFor")
    private String proxyFor;
    /**
     * Submitted From Date
     * <p>
     * Lineage reference object : transactionFromDate
     * 
     */
    @JsonProperty("transactionFromDate")
    @JsonPropertyDescription("Lineage reference object : transactionFromDate")
    private Date transactionFromDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.holdQueueStatusInd")
    public String getCriteriaHoldQueueStatusInd() {
        return criteriaHoldQueueStatusInd;
    }

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.holdQueueStatusInd")
    public void setCriteriaHoldQueueStatusInd(String criteriaHoldQueueStatusInd) {
        this.criteriaHoldQueueStatusInd = criteriaHoldQueueStatusInd;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaHoldQueueStatusInd(String criteriaHoldQueueStatusInd) {
        this.criteriaHoldQueueStatusInd = criteriaHoldQueueStatusInd;
        return this;
    }

    /**
     * Submitted On
     * <p>
     * Lineage reference object : NOBTRAN_SUBMISSION_DATE
     * 
     */
    @JsonProperty("criteria.submissionDate")
    public Date getCriteriaSubmissionDate() {
        return criteriaSubmissionDate;
    }

    /**
     * Submitted On
     * <p>
     * Lineage reference object : NOBTRAN_SUBMISSION_DATE
     * 
     */
    @JsonProperty("criteria.submissionDate")
    public void setCriteriaSubmissionDate(Date criteriaSubmissionDate) {
        this.criteriaSubmissionDate = criteriaSubmissionDate;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaSubmissionDate(Date criteriaSubmissionDate) {
        this.criteriaSubmissionDate = criteriaSubmissionDate;
        return this;
    }

    /**
     * Transaction Status
     * <p>
     * Lineage reference object : transactionStatus
     * (Required)
     * 
     */
    @JsonProperty("transactionStatus")
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Transaction Status
     * <p>
     * Lineage reference object : transactionStatus
     * (Required)
     * 
     */
    @JsonProperty("transactionStatus")
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    /**
     * Required Action Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.holdActionInd")
    public String getCriteriaHoldActionInd() {
        return criteriaHoldActionInd;
    }

    /**
     * Required Action Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.holdActionInd")
    public void setCriteriaHoldActionInd(String criteriaHoldActionInd) {
        this.criteriaHoldActionInd = criteriaHoldActionInd;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaHoldActionInd(String criteriaHoldActionInd) {
        this.criteriaHoldActionInd = criteriaHoldActionInd;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.name")
    public String getCriteriaName() {
        return criteriaName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.name")
    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
        return this;
    }

    /**
     * Applied to Database By
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_USER_ID
     * 
     */
    @JsonProperty("criteria.applyUserId")
    public String getCriteriaApplyUserId() {
        return criteriaApplyUserId;
    }

    /**
     * Applied to Database By
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_USER_ID
     * 
     */
    @JsonProperty("criteria.applyUserId")
    public void setCriteriaApplyUserId(String criteriaApplyUserId) {
        this.criteriaApplyUserId = criteriaApplyUserId;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaApplyUserId(String criteriaApplyUserId) {
        this.criteriaApplyUserId = criteriaApplyUserId;
        return this;
    }

    /**
     * Originator ID
     * <p>
     * Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID
     * 
     */
    @JsonProperty("criteria.originatorUserId")
    public String getCriteriaOriginatorUserId() {
        return criteriaOriginatorUserId;
    }

    /**
     * Originator ID
     * <p>
     * Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID
     * 
     */
    @JsonProperty("criteria.originatorUserId")
    public void setCriteriaOriginatorUserId(String criteriaOriginatorUserId) {
        this.criteriaOriginatorUserId = criteriaOriginatorUserId;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaOriginatorUserId(String criteriaOriginatorUserId) {
        this.criteriaOriginatorUserId = criteriaOriginatorUserId;
        return this;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_DATE
     * 
     */
    @JsonProperty("criteria.applyDate")
    public Date getCriteriaApplyDate() {
        return criteriaApplyDate;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_DATE
     * 
     */
    @JsonProperty("criteria.applyDate")
    public void setCriteriaApplyDate(Date criteriaApplyDate) {
        this.criteriaApplyDate = criteriaApplyDate;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaApplyDate(Date criteriaApplyDate) {
        this.criteriaApplyDate = criteriaApplyDate;
        return this;
    }

    /**
     * Approval Category
     * <p>
     * Lineage reference object : NOBTRAN_ACAT_CODE
     * 
     */
    @JsonProperty("criteria.acatCode")
    public String getCriteriaAcatCode() {
        return criteriaAcatCode;
    }

    /**
     * Approval Category
     * <p>
     * Lineage reference object : NOBTRAN_ACAT_CODE
     * 
     */
    @JsonProperty("criteria.acatCode")
    public void setCriteriaAcatCode(String criteriaAcatCode) {
        this.criteriaAcatCode = criteriaAcatCode;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaAcatCode(String criteriaAcatCode) {
        this.criteriaAcatCode = criteriaAcatCode;
        return this;
    }

    /**
     * Submitted To Date
     * <p>
     * Lineage reference object : transactionToDate
     * 
     */
    @JsonProperty("transactionToDate")
    public Date getTransactionToDate() {
        return transactionToDate;
    }

    /**
     * Submitted To Date
     * <p>
     * Lineage reference object : transactionToDate
     * 
     */
    @JsonProperty("transactionToDate")
    public void setTransactionToDate(Date transactionToDate) {
        this.transactionToDate = transactionToDate;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withTransactionToDate(Date transactionToDate) {
        this.transactionToDate = transactionToDate;
        return this;
    }

    /**
     * Lineage reference object : NOBTRAN_APPLY_IND
     * 
     */
    @JsonProperty("criteria.applyInd")
    public String getCriteriaApplyInd() {
        return criteriaApplyInd;
    }

    /**
     * Lineage reference object : NOBTRAN_APPLY_IND
     * 
     */
    @JsonProperty("criteria.applyInd")
    public void setCriteriaApplyInd(String criteriaApplyInd) {
        this.criteriaApplyInd = criteriaApplyInd;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaApplyInd(String criteriaApplyInd) {
        this.criteriaApplyInd = criteriaApplyInd;
        return this;
    }

    /**
     * Transaction Created On
     * <p>
     * Lineage reference object : NOBTRAN_CREATED_DATE
     * 
     */
    @JsonProperty("criteria.createdDate")
    public Date getCriteriaCreatedDate() {
        return criteriaCreatedDate;
    }

    /**
     * Transaction Created On
     * <p>
     * Lineage reference object : NOBTRAN_CREATED_DATE
     * 
     */
    @JsonProperty("criteria.createdDate")
    public void setCriteriaCreatedDate(Date criteriaCreatedDate) {
        this.criteriaCreatedDate = criteriaCreatedDate;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaCreatedDate(Date criteriaCreatedDate) {
        this.criteriaCreatedDate = criteriaCreatedDate;
        return this;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : NOBTRAN_TRANSACTION_NO
     * 
     */
    @JsonProperty("criteria.transactionNo")
    public Double getCriteriaTransactionNo() {
        return criteriaTransactionNo;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : NOBTRAN_TRANSACTION_NO
     * 
     */
    @JsonProperty("criteria.transactionNo")
    public void setCriteriaTransactionNo(Double criteriaTransactionNo) {
        this.criteriaTransactionNo = criteriaTransactionNo;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaTransactionNo(Double criteriaTransactionNo) {
        this.criteriaTransactionNo = criteriaTransactionNo;
        return this;
    }

    /**
     * Queue Status
     * <p>
     * Lineage reference object : queueStatus
     * (Required)
     * 
     */
    @JsonProperty("queueStatus")
    public String getQueueStatus() {
        return queueStatus;
    }

    /**
     * Queue Status
     * <p>
     * Lineage reference object : queueStatus
     * (Required)
     * 
     */
    @JsonProperty("queueStatus")
    public void setQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.id")
    public String getCriteriaId() {
        return criteriaId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.id")
    public void setCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
        return this;
    }

    /**
     * Approver Action
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("approverAction")
    public String getApproverAction() {
        return approverAction;
    }

    /**
     * Approver Action
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("approverAction")
    public void setApproverAction(String approverAction) {
        this.approverAction = approverAction;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withApproverAction(String approverAction) {
        this.approverAction = approverAction;
        return this;
    }

    /**
     * Proxy For
     * <p>
     * Lineage reference object : proxyFor
     * 
     */
    @JsonProperty("proxyFor")
    public String getProxyFor() {
        return proxyFor;
    }

    /**
     * Proxy For
     * <p>
     * Lineage reference object : proxyFor
     * 
     */
    @JsonProperty("proxyFor")
    public void setProxyFor(String proxyFor) {
        this.proxyFor = proxyFor;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withProxyFor(String proxyFor) {
        this.proxyFor = proxyFor;
        return this;
    }

    /**
     * Submitted From Date
     * <p>
     * Lineage reference object : transactionFromDate
     * 
     */
    @JsonProperty("transactionFromDate")
    public Date getTransactionFromDate() {
        return transactionFromDate;
    }

    /**
     * Submitted From Date
     * <p>
     * Lineage reference object : transactionFromDate
     * 
     */
    @JsonProperty("transactionFromDate")
    public void setTransactionFromDate(Date transactionFromDate) {
        this.transactionFromDate = transactionFromDate;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withTransactionFromDate(Date transactionFromDate) {
        this.transactionFromDate = transactionFromDate;
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

    public ElectronicApprovalSummaryTransactionInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalSummaryTransactionInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaHoldQueueStatusInd");
        sb.append('=');
        sb.append(((this.criteriaHoldQueueStatusInd == null)?"<null>":this.criteriaHoldQueueStatusInd));
        sb.append(',');
        sb.append("criteriaSubmissionDate");
        sb.append('=');
        sb.append(((this.criteriaSubmissionDate == null)?"<null>":this.criteriaSubmissionDate));
        sb.append(',');
        sb.append("transactionStatus");
        sb.append('=');
        sb.append(((this.transactionStatus == null)?"<null>":this.transactionStatus));
        sb.append(',');
        sb.append("criteriaHoldActionInd");
        sb.append('=');
        sb.append(((this.criteriaHoldActionInd == null)?"<null>":this.criteriaHoldActionInd));
        sb.append(',');
        sb.append("criteriaName");
        sb.append('=');
        sb.append(((this.criteriaName == null)?"<null>":this.criteriaName));
        sb.append(',');
        sb.append("criteriaApplyUserId");
        sb.append('=');
        sb.append(((this.criteriaApplyUserId == null)?"<null>":this.criteriaApplyUserId));
        sb.append(',');
        sb.append("criteriaOriginatorUserId");
        sb.append('=');
        sb.append(((this.criteriaOriginatorUserId == null)?"<null>":this.criteriaOriginatorUserId));
        sb.append(',');
        sb.append("criteriaApplyDate");
        sb.append('=');
        sb.append(((this.criteriaApplyDate == null)?"<null>":this.criteriaApplyDate));
        sb.append(',');
        sb.append("criteriaAcatCode");
        sb.append('=');
        sb.append(((this.criteriaAcatCode == null)?"<null>":this.criteriaAcatCode));
        sb.append(',');
        sb.append("transactionToDate");
        sb.append('=');
        sb.append(((this.transactionToDate == null)?"<null>":this.transactionToDate));
        sb.append(',');
        sb.append("criteriaApplyInd");
        sb.append('=');
        sb.append(((this.criteriaApplyInd == null)?"<null>":this.criteriaApplyInd));
        sb.append(',');
        sb.append("criteriaCreatedDate");
        sb.append('=');
        sb.append(((this.criteriaCreatedDate == null)?"<null>":this.criteriaCreatedDate));
        sb.append(',');
        sb.append("criteriaTransactionNo");
        sb.append('=');
        sb.append(((this.criteriaTransactionNo == null)?"<null>":this.criteriaTransactionNo));
        sb.append(',');
        sb.append("queueStatus");
        sb.append('=');
        sb.append(((this.queueStatus == null)?"<null>":this.queueStatus));
        sb.append(',');
        sb.append("criteriaId");
        sb.append('=');
        sb.append(((this.criteriaId == null)?"<null>":this.criteriaId));
        sb.append(',');
        sb.append("approverAction");
        sb.append('=');
        sb.append(((this.approverAction == null)?"<null>":this.approverAction));
        sb.append(',');
        sb.append("proxyFor");
        sb.append('=');
        sb.append(((this.proxyFor == null)?"<null>":this.proxyFor));
        sb.append(',');
        sb.append("transactionFromDate");
        sb.append('=');
        sb.append(((this.transactionFromDate == null)?"<null>":this.transactionFromDate));
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
        result = ((result* 31)+((this.criteriaHoldQueueStatusInd == null)? 0 :this.criteriaHoldQueueStatusInd.hashCode()));
        result = ((result* 31)+((this.transactionStatus == null)? 0 :this.transactionStatus.hashCode()));
        result = ((result* 31)+((this.criteriaId == null)? 0 :this.criteriaId.hashCode()));
        result = ((result* 31)+((this.criteriaHoldActionInd == null)? 0 :this.criteriaHoldActionInd.hashCode()));
        result = ((result* 31)+((this.criteriaTransactionNo == null)? 0 :this.criteriaTransactionNo.hashCode()));
        result = ((result* 31)+((this.criteriaAcatCode == null)? 0 :this.criteriaAcatCode.hashCode()));
        result = ((result* 31)+((this.criteriaApplyInd == null)? 0 :this.criteriaApplyInd.hashCode()));
        result = ((result* 31)+((this.criteriaApplyUserId == null)? 0 :this.criteriaApplyUserId.hashCode()));
        result = ((result* 31)+((this.transactionToDate == null)? 0 :this.transactionToDate.hashCode()));
        result = ((result* 31)+((this.criteriaSubmissionDate == null)? 0 :this.criteriaSubmissionDate.hashCode()));
        result = ((result* 31)+((this.queueStatus == null)? 0 :this.queueStatus.hashCode()));
        result = ((result* 31)+((this.criteriaName == null)? 0 :this.criteriaName.hashCode()));
        result = ((result* 31)+((this.criteriaCreatedDate == null)? 0 :this.criteriaCreatedDate.hashCode()));
        result = ((result* 31)+((this.criteriaApplyDate == null)? 0 :this.criteriaApplyDate.hashCode()));
        result = ((result* 31)+((this.approverAction == null)? 0 :this.approverAction.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.proxyFor == null)? 0 :this.proxyFor.hashCode()));
        result = ((result* 31)+((this.transactionFromDate == null)? 0 :this.transactionFromDate.hashCode()));
        result = ((result* 31)+((this.criteriaOriginatorUserId == null)? 0 :this.criteriaOriginatorUserId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalSummaryTransactionInformation100PutRequest) == false) {
            return false;
        }
        ElectronicApprovalSummaryTransactionInformation100PutRequest rhs = ((ElectronicApprovalSummaryTransactionInformation100PutRequest) other);
        return ((((((((((((((((((((this.criteriaHoldQueueStatusInd == rhs.criteriaHoldQueueStatusInd)||((this.criteriaHoldQueueStatusInd!= null)&&this.criteriaHoldQueueStatusInd.equals(rhs.criteriaHoldQueueStatusInd)))&&((this.transactionStatus == rhs.transactionStatus)||((this.transactionStatus!= null)&&this.transactionStatus.equals(rhs.transactionStatus))))&&((this.criteriaId == rhs.criteriaId)||((this.criteriaId!= null)&&this.criteriaId.equals(rhs.criteriaId))))&&((this.criteriaHoldActionInd == rhs.criteriaHoldActionInd)||((this.criteriaHoldActionInd!= null)&&this.criteriaHoldActionInd.equals(rhs.criteriaHoldActionInd))))&&((this.criteriaTransactionNo == rhs.criteriaTransactionNo)||((this.criteriaTransactionNo!= null)&&this.criteriaTransactionNo.equals(rhs.criteriaTransactionNo))))&&((this.criteriaAcatCode == rhs.criteriaAcatCode)||((this.criteriaAcatCode!= null)&&this.criteriaAcatCode.equals(rhs.criteriaAcatCode))))&&((this.criteriaApplyInd == rhs.criteriaApplyInd)||((this.criteriaApplyInd!= null)&&this.criteriaApplyInd.equals(rhs.criteriaApplyInd))))&&((this.criteriaApplyUserId == rhs.criteriaApplyUserId)||((this.criteriaApplyUserId!= null)&&this.criteriaApplyUserId.equals(rhs.criteriaApplyUserId))))&&((this.transactionToDate == rhs.transactionToDate)||((this.transactionToDate!= null)&&this.transactionToDate.equals(rhs.transactionToDate))))&&((this.criteriaSubmissionDate == rhs.criteriaSubmissionDate)||((this.criteriaSubmissionDate!= null)&&this.criteriaSubmissionDate.equals(rhs.criteriaSubmissionDate))))&&((this.queueStatus == rhs.queueStatus)||((this.queueStatus!= null)&&this.queueStatus.equals(rhs.queueStatus))))&&((this.criteriaName == rhs.criteriaName)||((this.criteriaName!= null)&&this.criteriaName.equals(rhs.criteriaName))))&&((this.criteriaCreatedDate == rhs.criteriaCreatedDate)||((this.criteriaCreatedDate!= null)&&this.criteriaCreatedDate.equals(rhs.criteriaCreatedDate))))&&((this.criteriaApplyDate == rhs.criteriaApplyDate)||((this.criteriaApplyDate!= null)&&this.criteriaApplyDate.equals(rhs.criteriaApplyDate))))&&((this.approverAction == rhs.approverAction)||((this.approverAction!= null)&&this.approverAction.equals(rhs.approverAction))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.proxyFor == rhs.proxyFor)||((this.proxyFor!= null)&&this.proxyFor.equals(rhs.proxyFor))))&&((this.transactionFromDate == rhs.transactionFromDate)||((this.transactionFromDate!= null)&&this.transactionFromDate.equals(rhs.transactionFromDate))))&&((this.criteriaOriginatorUserId == rhs.criteriaOriginatorUserId)||((this.criteriaOriginatorUserId!= null)&&this.criteriaOriginatorUserId.equals(rhs.criteriaOriginatorUserId))));
    }

}
