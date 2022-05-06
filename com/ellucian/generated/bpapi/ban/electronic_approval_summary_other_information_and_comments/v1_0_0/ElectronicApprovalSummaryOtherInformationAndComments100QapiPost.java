
package com.ellucian.generated.bpapi.ban.electronic_approval_summary_other_information_and_comments.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "proxyFor",
    "transactionFromDate",
    "transactionToDate",
    "transactionStatus",
    "activityDate",
    "userId",
    "comments"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalSummaryOtherInformationAndComments100QapiPost {

    @JsonProperty("proxyFor")
    private String proxyFor;
    @JsonProperty("transactionFromDate")
    private String transactionFromDate;
    @JsonProperty("transactionToDate")
    private String transactionToDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionStatus")
    private String transactionStatus;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("comments")
    private String comments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("proxyFor")
    public String getProxyFor() {
        return proxyFor;
    }

    @JsonProperty("proxyFor")
    public void setProxyFor(String proxyFor) {
        this.proxyFor = proxyFor;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100QapiPost withProxyFor(String proxyFor) {
        this.proxyFor = proxyFor;
        return this;
    }

    @JsonProperty("transactionFromDate")
    public String getTransactionFromDate() {
        return transactionFromDate;
    }

    @JsonProperty("transactionFromDate")
    public void setTransactionFromDate(String transactionFromDate) {
        this.transactionFromDate = transactionFromDate;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100QapiPost withTransactionFromDate(String transactionFromDate) {
        this.transactionFromDate = transactionFromDate;
        return this;
    }

    @JsonProperty("transactionToDate")
    public String getTransactionToDate() {
        return transactionToDate;
    }

    @JsonProperty("transactionToDate")
    public void setTransactionToDate(String transactionToDate) {
        this.transactionToDate = transactionToDate;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100QapiPost withTransactionToDate(String transactionToDate) {
        this.transactionToDate = transactionToDate;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionStatus")
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionStatus")
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100QapiPost withTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100QapiPost withActivityDate(String activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100QapiPost withComments(String comments) {
        this.comments = comments;
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

    public ElectronicApprovalSummaryOtherInformationAndComments100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalSummaryOtherInformationAndComments100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("proxyFor");
        sb.append('=');
        sb.append(((this.proxyFor == null)?"<null>":this.proxyFor));
        sb.append(',');
        sb.append("transactionFromDate");
        sb.append('=');
        sb.append(((this.transactionFromDate == null)?"<null>":this.transactionFromDate));
        sb.append(',');
        sb.append("transactionToDate");
        sb.append('=');
        sb.append(((this.transactionToDate == null)?"<null>":this.transactionToDate));
        sb.append(',');
        sb.append("transactionStatus");
        sb.append('=');
        sb.append(((this.transactionStatus == null)?"<null>":this.transactionStatus));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
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
        if ((other instanceof ElectronicApprovalSummaryOtherInformationAndComments100QapiPost) == false) {
            return false;
        }
        ElectronicApprovalSummaryOtherInformationAndComments100QapiPost rhs = ((ElectronicApprovalSummaryOtherInformationAndComments100QapiPost) other);
        return (((((((((this.transactionToDate == rhs.transactionToDate)||((this.transactionToDate!= null)&&this.transactionToDate.equals(rhs.transactionToDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.transactionStatus == rhs.transactionStatus)||((this.transactionStatus!= null)&&this.transactionStatus.equals(rhs.transactionStatus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.proxyFor == rhs.proxyFor)||((this.proxyFor!= null)&&this.proxyFor.equals(rhs.proxyFor))))&&((this.transactionFromDate == rhs.transactionFromDate)||((this.transactionFromDate!= null)&&this.transactionFromDate.equals(rhs.transactionFromDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
