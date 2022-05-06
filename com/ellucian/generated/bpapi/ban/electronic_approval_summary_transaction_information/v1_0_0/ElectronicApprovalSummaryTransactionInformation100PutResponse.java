
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
    "acatCode",
    "acatDesc",
    "holdActivityDate",
    "holdQueueStatusIndDesc",
    "applyInd",
    "transactionNo",
    "submissionDate",
    "holdActionIndDesc",
    "holdTransStatusInd",
    "applyUserId",
    "holdActionUserId",
    "createdDate",
    "originatorUserId",
    "name",
    "approverAction",
    "id",
    "applyDate"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalSummaryTransactionInformation100PutResponse {

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
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("acatDesc")
    private String acatDesc;
    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActivityDate")
    private Date holdActivityDate;
    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("holdQueueStatusIndDesc")
    private String holdQueueStatusIndDesc;
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
     * Required Action Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActionIndDesc")
    private String holdActionIndDesc;
    /**
     * Transaction Status
     * <p>
     * 
     * 
     */
    @JsonProperty("holdTransStatusInd")
    private String holdTransStatusInd;
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
     * Approved By ID
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActionUserId")
    private String holdActionUserId;
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
     * Approver Action
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("approverAction")
    private String approverAction;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withAcatCode(String acatCode) {
        this.acatCode = acatCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("acatDesc")
    public String getAcatDesc() {
        return acatDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("acatDesc")
    public void setAcatDesc(String acatDesc) {
        this.acatDesc = acatDesc;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withAcatDesc(String acatDesc) {
        this.acatDesc = acatDesc;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActivityDate")
    public Date getHoldActivityDate() {
        return holdActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActivityDate")
    public void setHoldActivityDate(Date holdActivityDate) {
        this.holdActivityDate = holdActivityDate;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withHoldActivityDate(Date holdActivityDate) {
        this.holdActivityDate = holdActivityDate;
        return this;
    }

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("holdQueueStatusIndDesc")
    public String getHoldQueueStatusIndDesc() {
        return holdQueueStatusIndDesc;
    }

    /**
     * Queue Status
     * <p>
     * 
     * 
     */
    @JsonProperty("holdQueueStatusIndDesc")
    public void setHoldQueueStatusIndDesc(String holdQueueStatusIndDesc) {
        this.holdQueueStatusIndDesc = holdQueueStatusIndDesc;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withHoldQueueStatusIndDesc(String holdQueueStatusIndDesc) {
        this.holdQueueStatusIndDesc = holdQueueStatusIndDesc;
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withApplyInd(String applyInd) {
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withTransactionNo(Double transactionNo) {
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
        return this;
    }

    /**
     * Required Action Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActionIndDesc")
    public String getHoldActionIndDesc() {
        return holdActionIndDesc;
    }

    /**
     * Required Action Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActionIndDesc")
    public void setHoldActionIndDesc(String holdActionIndDesc) {
        this.holdActionIndDesc = holdActionIndDesc;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withHoldActionIndDesc(String holdActionIndDesc) {
        this.holdActionIndDesc = holdActionIndDesc;
        return this;
    }

    /**
     * Transaction Status
     * <p>
     * 
     * 
     */
    @JsonProperty("holdTransStatusInd")
    public String getHoldTransStatusInd() {
        return holdTransStatusInd;
    }

    /**
     * Transaction Status
     * <p>
     * 
     * 
     */
    @JsonProperty("holdTransStatusInd")
    public void setHoldTransStatusInd(String holdTransStatusInd) {
        this.holdTransStatusInd = holdTransStatusInd;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withHoldTransStatusInd(String holdTransStatusInd) {
        this.holdTransStatusInd = holdTransStatusInd;
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
        return this;
    }

    /**
     * Approved By ID
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActionUserId")
    public String getHoldActionUserId() {
        return holdActionUserId;
    }

    /**
     * Approved By ID
     * <p>
     * 
     * 
     */
    @JsonProperty("holdActionUserId")
    public void setHoldActionUserId(String holdActionUserId) {
        this.holdActionUserId = holdActionUserId;
    }

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withHoldActionUserId(String holdActionUserId) {
        this.holdActionUserId = holdActionUserId;
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withOriginatorUserId(String originatorUserId) {
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withName(String name) {
        this.name = name;
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withApproverAction(String approverAction) {
        this.approverAction = approverAction;
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withId(String id) {
        this.id = id;
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withApplyDate(Date applyDate) {
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

    public ElectronicApprovalSummaryTransactionInformation100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalSummaryTransactionInformation100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acatCode");
        sb.append('=');
        sb.append(((this.acatCode == null)?"<null>":this.acatCode));
        sb.append(',');
        sb.append("acatDesc");
        sb.append('=');
        sb.append(((this.acatDesc == null)?"<null>":this.acatDesc));
        sb.append(',');
        sb.append("holdActivityDate");
        sb.append('=');
        sb.append(((this.holdActivityDate == null)?"<null>":this.holdActivityDate));
        sb.append(',');
        sb.append("holdQueueStatusIndDesc");
        sb.append('=');
        sb.append(((this.holdQueueStatusIndDesc == null)?"<null>":this.holdQueueStatusIndDesc));
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
        sb.append("holdActionIndDesc");
        sb.append('=');
        sb.append(((this.holdActionIndDesc == null)?"<null>":this.holdActionIndDesc));
        sb.append(',');
        sb.append("holdTransStatusInd");
        sb.append('=');
        sb.append(((this.holdTransStatusInd == null)?"<null>":this.holdTransStatusInd));
        sb.append(',');
        sb.append("applyUserId");
        sb.append('=');
        sb.append(((this.applyUserId == null)?"<null>":this.applyUserId));
        sb.append(',');
        sb.append("holdActionUserId");
        sb.append('=');
        sb.append(((this.holdActionUserId == null)?"<null>":this.holdActionUserId));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("originatorUserId");
        sb.append('=');
        sb.append(((this.originatorUserId == null)?"<null>":this.originatorUserId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("approverAction");
        sb.append('=');
        sb.append(((this.approverAction == null)?"<null>":this.approverAction));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.acatCode == null)? 0 :this.acatCode.hashCode()));
        result = ((result* 31)+((this.acatDesc == null)? 0 :this.acatDesc.hashCode()));
        result = ((result* 31)+((this.holdActivityDate == null)? 0 :this.holdActivityDate.hashCode()));
        result = ((result* 31)+((this.holdQueueStatusIndDesc == null)? 0 :this.holdQueueStatusIndDesc.hashCode()));
        result = ((result* 31)+((this.applyInd == null)? 0 :this.applyInd.hashCode()));
        result = ((result* 31)+((this.transactionNo == null)? 0 :this.transactionNo.hashCode()));
        result = ((result* 31)+((this.submissionDate == null)? 0 :this.submissionDate.hashCode()));
        result = ((result* 31)+((this.holdActionIndDesc == null)? 0 :this.holdActionIndDesc.hashCode()));
        result = ((result* 31)+((this.holdTransStatusInd == null)? 0 :this.holdTransStatusInd.hashCode()));
        result = ((result* 31)+((this.applyUserId == null)? 0 :this.applyUserId.hashCode()));
        result = ((result* 31)+((this.holdActionUserId == null)? 0 :this.holdActionUserId.hashCode()));
        result = ((result* 31)+((this.createdDate == null)? 0 :this.createdDate.hashCode()));
        result = ((result* 31)+((this.originatorUserId == null)? 0 :this.originatorUserId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.approverAction == null)? 0 :this.approverAction.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.applyDate == null)? 0 :this.applyDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalSummaryTransactionInformation100PutResponse) == false) {
            return false;
        }
        ElectronicApprovalSummaryTransactionInformation100PutResponse rhs = ((ElectronicApprovalSummaryTransactionInformation100PutResponse) other);
        return (((((((((((((((((((this.acatCode == rhs.acatCode)||((this.acatCode!= null)&&this.acatCode.equals(rhs.acatCode)))&&((this.acatDesc == rhs.acatDesc)||((this.acatDesc!= null)&&this.acatDesc.equals(rhs.acatDesc))))&&((this.holdActivityDate == rhs.holdActivityDate)||((this.holdActivityDate!= null)&&this.holdActivityDate.equals(rhs.holdActivityDate))))&&((this.holdQueueStatusIndDesc == rhs.holdQueueStatusIndDesc)||((this.holdQueueStatusIndDesc!= null)&&this.holdQueueStatusIndDesc.equals(rhs.holdQueueStatusIndDesc))))&&((this.applyInd == rhs.applyInd)||((this.applyInd!= null)&&this.applyInd.equals(rhs.applyInd))))&&((this.transactionNo == rhs.transactionNo)||((this.transactionNo!= null)&&this.transactionNo.equals(rhs.transactionNo))))&&((this.submissionDate == rhs.submissionDate)||((this.submissionDate!= null)&&this.submissionDate.equals(rhs.submissionDate))))&&((this.holdActionIndDesc == rhs.holdActionIndDesc)||((this.holdActionIndDesc!= null)&&this.holdActionIndDesc.equals(rhs.holdActionIndDesc))))&&((this.holdTransStatusInd == rhs.holdTransStatusInd)||((this.holdTransStatusInd!= null)&&this.holdTransStatusInd.equals(rhs.holdTransStatusInd))))&&((this.applyUserId == rhs.applyUserId)||((this.applyUserId!= null)&&this.applyUserId.equals(rhs.applyUserId))))&&((this.holdActionUserId == rhs.holdActionUserId)||((this.holdActionUserId!= null)&&this.holdActionUserId.equals(rhs.holdActionUserId))))&&((this.createdDate == rhs.createdDate)||((this.createdDate!= null)&&this.createdDate.equals(rhs.createdDate))))&&((this.originatorUserId == rhs.originatorUserId)||((this.originatorUserId!= null)&&this.originatorUserId.equals(rhs.originatorUserId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.approverAction == rhs.approverAction)||((this.approverAction!= null)&&this.approverAction.equals(rhs.approverAction))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.applyDate == rhs.applyDate)||((this.applyDate!= null)&&this.applyDate.equals(rhs.applyDate))));
    }

}
