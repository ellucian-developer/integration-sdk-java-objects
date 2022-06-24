
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
    "holdQueueStatusInd",
    "acatCode",
    "transactionStatus",
    "applyInd",
    "transactionNo",
    "submissionDate",
    "applyUserId",
    "transactionToDate",
    "createdDate",
    "queueStatus",
    "originatorUserId",
    "name",
    "holdActionInd",
    "id",
    "proxyFor",
    "transactionFromDate",
    "applyDate"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalSummaryTransactionInformation100GetRequest {

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("holdQueueStatusInd")
    private String holdQueueStatusInd;
    /**
     * Approval Category
     * <p>
     * Lineage reference object : NOBTRAN_ACAT_CODE
     * 
     */
    @JsonProperty("acatCode")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_ACAT_CODE")
    private String acatCode;
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
     * Lineage reference object : NOBTRAN_APPLY_IND
     * 
     */
    @JsonProperty("applyInd")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_APPLY_IND")
    private String applyInd;
    /**
     * Transaction Number
     * <p>
     * Lineage reference object : NOBTRAN_TRANSACTION_NO
     * 
     */
    @JsonProperty("transactionNo")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_TRANSACTION_NO")
    private Double transactionNo;
    /**
     * Submitted On
     * <p>
     * Lineage reference object : NOBTRAN_SUBMISSION_DATE
     * 
     */
    @JsonProperty("submissionDate")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_SUBMISSION_DATE")
    private Date submissionDate;
    /**
     * Applied to Database By
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_USER_ID
     * 
     */
    @JsonProperty("applyUserId")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_APPLY_USER_ID")
    private String applyUserId;
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
     * Transaction Created On
     * <p>
     * Lineage reference object : NOBTRAN_CREATED_DATE
     * 
     */
    @JsonProperty("createdDate")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_CREATED_DATE")
    private Date createdDate;
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
     * Originator ID
     * <p>
     * Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID
     * 
     */
    @JsonProperty("originatorUserId")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID")
    private String originatorUserId;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * Required Action Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActionInd")
    private String holdActionInd;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
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
    /**
     * Application Date
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_DATE
     * 
     */
    @JsonProperty("applyDate")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_APPLY_DATE")
    private Date applyDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("holdQueueStatusInd")
    public String getHoldQueueStatusInd() {
        return holdQueueStatusInd;
    }

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("holdQueueStatusInd")
    public void setHoldQueueStatusInd(String holdQueueStatusInd) {
        this.holdQueueStatusInd = holdQueueStatusInd;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withHoldQueueStatusInd(String holdQueueStatusInd) {
        this.holdQueueStatusInd = holdQueueStatusInd;
        return this;
    }

    /**
     * Approval Category
     * <p>
     * Lineage reference object : NOBTRAN_ACAT_CODE
     * 
     */
    @JsonProperty("acatCode")
    public String getAcatCode() {
        return acatCode;
    }

    /**
     * Approval Category
     * <p>
     * Lineage reference object : NOBTRAN_ACAT_CODE
     * 
     */
    @JsonProperty("acatCode")
    public void setAcatCode(String acatCode) {
        this.acatCode = acatCode;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withAcatCode(String acatCode) {
        this.acatCode = acatCode;
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

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    /**
     * Lineage reference object : NOBTRAN_APPLY_IND
     * 
     */
    @JsonProperty("applyInd")
    public String getApplyInd() {
        return applyInd;
    }

    /**
     * Lineage reference object : NOBTRAN_APPLY_IND
     * 
     */
    @JsonProperty("applyInd")
    public void setApplyInd(String applyInd) {
        this.applyInd = applyInd;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withApplyInd(String applyInd) {
        this.applyInd = applyInd;
        return this;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : NOBTRAN_TRANSACTION_NO
     * 
     */
    @JsonProperty("transactionNo")
    public Double getTransactionNo() {
        return transactionNo;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : NOBTRAN_TRANSACTION_NO
     * 
     */
    @JsonProperty("transactionNo")
    public void setTransactionNo(Double transactionNo) {
        this.transactionNo = transactionNo;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withTransactionNo(Double transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }

    /**
     * Submitted On
     * <p>
     * Lineage reference object : NOBTRAN_SUBMISSION_DATE
     * 
     */
    @JsonProperty("submissionDate")
    public Date getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Submitted On
     * <p>
     * Lineage reference object : NOBTRAN_SUBMISSION_DATE
     * 
     */
    @JsonProperty("submissionDate")
    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
        return this;
    }

    /**
     * Applied to Database By
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_USER_ID
     * 
     */
    @JsonProperty("applyUserId")
    public String getApplyUserId() {
        return applyUserId;
    }

    /**
     * Applied to Database By
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_USER_ID
     * 
     */
    @JsonProperty("applyUserId")
    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
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

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withTransactionToDate(Date transactionToDate) {
        this.transactionToDate = transactionToDate;
        return this;
    }

    /**
     * Transaction Created On
     * <p>
     * Lineage reference object : NOBTRAN_CREATED_DATE
     * 
     */
    @JsonProperty("createdDate")
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Transaction Created On
     * <p>
     * Lineage reference object : NOBTRAN_CREATED_DATE
     * 
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus;
        return this;
    }

    /**
     * Originator ID
     * <p>
     * Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID
     * 
     */
    @JsonProperty("originatorUserId")
    public String getOriginatorUserId() {
        return originatorUserId;
    }

    /**
     * Originator ID
     * <p>
     * Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID
     * 
     */
    @JsonProperty("originatorUserId")
    public void setOriginatorUserId(String originatorUserId) {
        this.originatorUserId = originatorUserId;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withOriginatorUserId(String originatorUserId) {
        this.originatorUserId = originatorUserId;
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

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Required Action Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActionInd")
    public String getHoldActionInd() {
        return holdActionInd;
    }

    /**
     * Required Action Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActionInd")
    public void setHoldActionInd(String holdActionInd) {
        this.holdActionInd = holdActionInd;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withHoldActionInd(String holdActionInd) {
        this.holdActionInd = holdActionInd;
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

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withId(String id) {
        this.id = id;
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

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withProxyFor(String proxyFor) {
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

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withTransactionFromDate(Date transactionFromDate) {
        this.transactionFromDate = transactionFromDate;
        return this;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_DATE
     * 
     */
    @JsonProperty("applyDate")
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_DATE
     * 
     */
    @JsonProperty("applyDate")
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withApplyDate(Date applyDate) {
        this.applyDate = applyDate;
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

    public ElectronicApprovalSummaryTransactionInformation100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalSummaryTransactionInformation100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("holdQueueStatusInd");
        sb.append('=');
        sb.append(((this.holdQueueStatusInd == null)?"<null>":this.holdQueueStatusInd));
        sb.append(',');
        sb.append("acatCode");
        sb.append('=');
        sb.append(((this.acatCode == null)?"<null>":this.acatCode));
        sb.append(',');
        sb.append("transactionStatus");
        sb.append('=');
        sb.append(((this.transactionStatus == null)?"<null>":this.transactionStatus));
        sb.append(',');
        sb.append("applyInd");
        sb.append('=');
        sb.append(((this.applyInd == null)?"<null>":this.applyInd));
        sb.append(',');
        sb.append("transactionNo");
        sb.append('=');
        sb.append(((this.transactionNo == null)?"<null>":this.transactionNo));
        sb.append(',');
        sb.append("submissionDate");
        sb.append('=');
        sb.append(((this.submissionDate == null)?"<null>":this.submissionDate));
        sb.append(',');
        sb.append("applyUserId");
        sb.append('=');
        sb.append(((this.applyUserId == null)?"<null>":this.applyUserId));
        sb.append(',');
        sb.append("transactionToDate");
        sb.append('=');
        sb.append(((this.transactionToDate == null)?"<null>":this.transactionToDate));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("queueStatus");
        sb.append('=');
        sb.append(((this.queueStatus == null)?"<null>":this.queueStatus));
        sb.append(',');
        sb.append("originatorUserId");
        sb.append('=');
        sb.append(((this.originatorUserId == null)?"<null>":this.originatorUserId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("holdActionInd");
        sb.append('=');
        sb.append(((this.holdActionInd == null)?"<null>":this.holdActionInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("proxyFor");
        sb.append('=');
        sb.append(((this.proxyFor == null)?"<null>":this.proxyFor));
        sb.append(',');
        sb.append("transactionFromDate");
        sb.append('=');
        sb.append(((this.transactionFromDate == null)?"<null>":this.transactionFromDate));
        sb.append(',');
        sb.append("applyDate");
        sb.append('=');
        sb.append(((this.applyDate == null)?"<null>":this.applyDate));
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
        result = ((result* 31)+((this.holdQueueStatusInd == null)? 0 :this.holdQueueStatusInd.hashCode()));
        result = ((result* 31)+((this.acatCode == null)? 0 :this.acatCode.hashCode()));
        result = ((result* 31)+((this.transactionStatus == null)? 0 :this.transactionStatus.hashCode()));
        result = ((result* 31)+((this.applyInd == null)? 0 :this.applyInd.hashCode()));
        result = ((result* 31)+((this.transactionNo == null)? 0 :this.transactionNo.hashCode()));
        result = ((result* 31)+((this.submissionDate == null)? 0 :this.submissionDate.hashCode()));
        result = ((result* 31)+((this.applyUserId == null)? 0 :this.applyUserId.hashCode()));
        result = ((result* 31)+((this.transactionToDate == null)? 0 :this.transactionToDate.hashCode()));
        result = ((result* 31)+((this.createdDate == null)? 0 :this.createdDate.hashCode()));
        result = ((result* 31)+((this.queueStatus == null)? 0 :this.queueStatus.hashCode()));
        result = ((result* 31)+((this.originatorUserId == null)? 0 :this.originatorUserId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.holdActionInd == null)? 0 :this.holdActionInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.proxyFor == null)? 0 :this.proxyFor.hashCode()));
        result = ((result* 31)+((this.transactionFromDate == null)? 0 :this.transactionFromDate.hashCode()));
        result = ((result* 31)+((this.applyDate == null)? 0 :this.applyDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalSummaryTransactionInformation100GetRequest) == false) {
            return false;
        }
        ElectronicApprovalSummaryTransactionInformation100GetRequest rhs = ((ElectronicApprovalSummaryTransactionInformation100GetRequest) other);
        return (((((((((((((((((((this.holdQueueStatusInd == rhs.holdQueueStatusInd)||((this.holdQueueStatusInd!= null)&&this.holdQueueStatusInd.equals(rhs.holdQueueStatusInd)))&&((this.acatCode == rhs.acatCode)||((this.acatCode!= null)&&this.acatCode.equals(rhs.acatCode))))&&((this.transactionStatus == rhs.transactionStatus)||((this.transactionStatus!= null)&&this.transactionStatus.equals(rhs.transactionStatus))))&&((this.applyInd == rhs.applyInd)||((this.applyInd!= null)&&this.applyInd.equals(rhs.applyInd))))&&((this.transactionNo == rhs.transactionNo)||((this.transactionNo!= null)&&this.transactionNo.equals(rhs.transactionNo))))&&((this.submissionDate == rhs.submissionDate)||((this.submissionDate!= null)&&this.submissionDate.equals(rhs.submissionDate))))&&((this.applyUserId == rhs.applyUserId)||((this.applyUserId!= null)&&this.applyUserId.equals(rhs.applyUserId))))&&((this.transactionToDate == rhs.transactionToDate)||((this.transactionToDate!= null)&&this.transactionToDate.equals(rhs.transactionToDate))))&&((this.createdDate == rhs.createdDate)||((this.createdDate!= null)&&this.createdDate.equals(rhs.createdDate))))&&((this.queueStatus == rhs.queueStatus)||((this.queueStatus!= null)&&this.queueStatus.equals(rhs.queueStatus))))&&((this.originatorUserId == rhs.originatorUserId)||((this.originatorUserId!= null)&&this.originatorUserId.equals(rhs.originatorUserId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.holdActionInd == rhs.holdActionInd)||((this.holdActionInd!= null)&&this.holdActionInd.equals(rhs.holdActionInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.proxyFor == rhs.proxyFor)||((this.proxyFor!= null)&&this.proxyFor.equals(rhs.proxyFor))))&&((this.transactionFromDate == rhs.transactionFromDate)||((this.transactionFromDate!= null)&&this.transactionFromDate.equals(rhs.transactionFromDate))))&&((this.applyDate == rhs.applyDate)||((this.applyDate!= null)&&this.applyDate.equals(rhs.applyDate))));
    }

}
