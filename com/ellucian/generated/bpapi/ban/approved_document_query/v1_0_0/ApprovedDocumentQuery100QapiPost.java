
package com.ellucian.generated.bpapi.ban.approved_document_query.v1_0_0;

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
    "activityDate",
    "bankNum",
    "docNum",
    "docType",
    "seqNum",
    "userId"
})
@Generated("jsonschema2pojo")
public class ApprovedDocumentQuery100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FOBAPPD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FOBAPPD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Bank
     * Code
     * <p>
     * Lineage reference object : FOBAPPD_BANK_NUM
     * 
     */
    @JsonProperty("bankNum")
    @JsonPropertyDescription("Lineage reference object : FOBAPPD_BANK_NUM")
    private String bankNum;
    /**
     * Document
     * Number
     * <p>
     * Lineage reference object : FOBAPPD_DOC_NUM
     * 
     */
    @JsonProperty("docNum")
    @JsonPropertyDescription("Lineage reference object : FOBAPPD_DOC_NUM")
    private String docNum;
    /**
     * Document
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("docType")
    private String docType;
    /**
     * Submission
     * Number
     * <p>
     * Lineage reference object : FOBAPPD_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FOBAPPD_SEQ_NUM")
    private Double seqNum;
    /**
     * User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("userId")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FOBAPPD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FOBAPPD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ApprovedDocumentQuery100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Bank
     * Code
     * <p>
     * Lineage reference object : FOBAPPD_BANK_NUM
     * 
     */
    @JsonProperty("bankNum")
    public String getBankNum() {
        return bankNum;
    }

    /**
     * Bank
     * Code
     * <p>
     * Lineage reference object : FOBAPPD_BANK_NUM
     * 
     */
    @JsonProperty("bankNum")
    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public ApprovedDocumentQuery100QapiPost withBankNum(String bankNum) {
        this.bankNum = bankNum;
        return this;
    }

    /**
     * Document
     * Number
     * <p>
     * Lineage reference object : FOBAPPD_DOC_NUM
     * 
     */
    @JsonProperty("docNum")
    public String getDocNum() {
        return docNum;
    }

    /**
     * Document
     * Number
     * <p>
     * Lineage reference object : FOBAPPD_DOC_NUM
     * 
     */
    @JsonProperty("docNum")
    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public ApprovedDocumentQuery100QapiPost withDocNum(String docNum) {
        this.docNum = docNum;
        return this;
    }

    /**
     * Document
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    /**
     * Document
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    public ApprovedDocumentQuery100QapiPost withDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * Submission
     * Number
     * <p>
     * Lineage reference object : FOBAPPD_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public Double getSeqNum() {
        return seqNum;
    }

    /**
     * Submission
     * Number
     * <p>
     * Lineage reference object : FOBAPPD_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public ApprovedDocumentQuery100QapiPost withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    /**
     * User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApprovedDocumentQuery100QapiPost withUserId(String userId) {
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

    public ApprovedDocumentQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovedDocumentQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("bankNum");
        sb.append('=');
        sb.append(((this.bankNum == null)?"<null>":this.bankNum));
        sb.append(',');
        sb.append("docNum");
        sb.append('=');
        sb.append(((this.docNum == null)?"<null>":this.docNum));
        sb.append(',');
        sb.append("docType");
        sb.append('=');
        sb.append(((this.docType == null)?"<null>":this.docType));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
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
        result = ((result* 31)+((this.docNum == null)? 0 :this.docNum.hashCode()));
        result = ((result* 31)+((this.bankNum == null)? 0 :this.bankNum.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.docType == null)? 0 :this.docType.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApprovedDocumentQuery100QapiPost) == false) {
            return false;
        }
        ApprovedDocumentQuery100QapiPost rhs = ((ApprovedDocumentQuery100QapiPost) other);
        return ((((((((this.docNum == rhs.docNum)||((this.docNum!= null)&&this.docNum.equals(rhs.docNum)))&&((this.bankNum == rhs.bankNum)||((this.bankNum!= null)&&this.bankNum.equals(rhs.bankNum))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.docType == rhs.docType)||((this.docType!= null)&&this.docType.equals(rhs.docType))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
