
package com.ellucian.generated.bpapi.ban.electronic_approval_summary_other_information_and_comments.v1_0_0;

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
    "transactionToDate",
    "activityDate",
    "comments",
    "transactionStatus",
    "proxyFor",
    "transactionFromDate",
    "userId"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalSummaryOtherInformationAndComments100GetRequest {

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
     * Date and Time
     * <p>
     * Lineage reference object : NORCMNT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NORCMNT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Comments
     * <p>
     * Lineage reference object : NORCMNT_COMMENTS
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("Lineage reference object : NORCMNT_COMMENTS")
    private String comments;
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
     * Made By
     * <p>
     * Lineage reference object : NORCMNT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NORCMNT_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public ElectronicApprovalSummaryOtherInformationAndComments100GetRequest withTransactionToDate(Date transactionToDate) {
        this.transactionToDate = transactionToDate;
        return this;
    }

    /**
     * Date and Time
     * <p>
     * Lineage reference object : NORCMNT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Date and Time
     * <p>
     * Lineage reference object : NORCMNT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : NORCMNT_COMMENTS
     * 
     */
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : NORCMNT_COMMENTS
     * 
     */
    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100GetRequest withComments(String comments) {
        this.comments = comments;
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

    public ElectronicApprovalSummaryOtherInformationAndComments100GetRequest withTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
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

    public ElectronicApprovalSummaryOtherInformationAndComments100GetRequest withProxyFor(String proxyFor) {
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

    public ElectronicApprovalSummaryOtherInformationAndComments100GetRequest withTransactionFromDate(Date transactionFromDate) {
        this.transactionFromDate = transactionFromDate;
        return this;
    }

    /**
     * Made By
     * <p>
     * Lineage reference object : NORCMNT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Made By
     * <p>
     * Lineage reference object : NORCMNT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100GetRequest withUserId(String userId) {
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

    public ElectronicApprovalSummaryOtherInformationAndComments100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalSummaryOtherInformationAndComments100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transactionToDate");
        sb.append('=');
        sb.append(((this.transactionToDate == null)?"<null>":this.transactionToDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("transactionStatus");
        sb.append('=');
        sb.append(((this.transactionStatus == null)?"<null>":this.transactionStatus));
        sb.append(',');
        sb.append("proxyFor");
        sb.append('=');
        sb.append(((this.proxyFor == null)?"<null>":this.proxyFor));
        sb.append(',');
        sb.append("transactionFromDate");
        sb.append('=');
        sb.append(((this.transactionFromDate == null)?"<null>":this.transactionFromDate));
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
        result = ((result* 31)+((this.transactionToDate == null)? 0 :this.transactionToDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.transactionStatus == null)? 0 :this.transactionStatus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.proxyFor == null)? 0 :this.proxyFor.hashCode()));
        result = ((result* 31)+((this.transactionFromDate == null)? 0 :this.transactionFromDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalSummaryOtherInformationAndComments100GetRequest) == false) {
            return false;
        }
        ElectronicApprovalSummaryOtherInformationAndComments100GetRequest rhs = ((ElectronicApprovalSummaryOtherInformationAndComments100GetRequest) other);
        return (((((((((this.transactionToDate == rhs.transactionToDate)||((this.transactionToDate!= null)&&this.transactionToDate.equals(rhs.transactionToDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.transactionStatus == rhs.transactionStatus)||((this.transactionStatus!= null)&&this.transactionStatus.equals(rhs.transactionStatus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.proxyFor == rhs.proxyFor)||((this.proxyFor!= null)&&this.proxyFor.equals(rhs.proxyFor))))&&((this.transactionFromDate == rhs.transactionFromDate)||((this.transactionFromDate!= null)&&this.transactionFromDate.equals(rhs.transactionFromDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
