
package com.ellucian.generated.bpapi.ban.user_approval.v1_0_0;

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
    "fobuappDocCode",
    "nextIndicator",
    "origUser",
    "docCode",
    "userId"
})
@Generated("jsonschema2pojo")
public class UserApproval100GetRequest {

    /**
     * Change Sequence
     * <p>
     * Lineage reference object : FOBUAPP_CHG_SEQ_NUM
     * 
     */
    @JsonProperty("chgSeqNum")
    @JsonPropertyDescription("Lineage reference object : FOBUAPP_CHG_SEQ_NUM")
    private Double chgSeqNum;
    /**
     * Submission
     * <p>
     * Lineage reference object : FOBUAPP_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    @JsonPropertyDescription("Lineage reference object : FOBUAPP_SUBMISSION_NUMBER")
    private Double submissionNumber;
    /**
     * Document Number
     * <p>
     * Lineage reference object : FOBUAPP_DOC_CODE
     * 
     */
    @JsonProperty("fobuappDocCode")
    @JsonPropertyDescription("Lineage reference object : FOBUAPP_DOC_CODE")
    private String fobuappDocCode;
    /**
     * Lineage reference object : nextIndicator
     * 
     */
    @JsonProperty("nextIndicator")
    @JsonPropertyDescription("Lineage reference object : nextIndicator")
    private Object nextIndicator;
    /**
     * Originating User
     * <p>
     * Lineage reference object : FOBUAPP_ORIG_USER
     * 
     */
    @JsonProperty("origUser")
    @JsonPropertyDescription("Lineage reference object : FOBUAPP_ORIG_USER")
    private String origUser;
    /**
     * Document
     * <p>
     * Lineage reference object : docCode
     * 
     */
    @JsonProperty("docCode")
    @JsonPropertyDescription("Lineage reference object : docCode")
    private Object docCode;
    /**
     * User ID
     * <p>
     * Lineage reference object : userId
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : userId")
    private Object userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Change Sequence
     * <p>
     * Lineage reference object : FOBUAPP_CHG_SEQ_NUM
     * 
     */
    @JsonProperty("chgSeqNum")
    public Double getChgSeqNum() {
        return chgSeqNum;
    }

    /**
     * Change Sequence
     * <p>
     * Lineage reference object : FOBUAPP_CHG_SEQ_NUM
     * 
     */
    @JsonProperty("chgSeqNum")
    public void setChgSeqNum(Double chgSeqNum) {
        this.chgSeqNum = chgSeqNum;
    }

    public UserApproval100GetRequest withChgSeqNum(Double chgSeqNum) {
        this.chgSeqNum = chgSeqNum;
        return this;
    }

    /**
     * Submission
     * <p>
     * Lineage reference object : FOBUAPP_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public Double getSubmissionNumber() {
        return submissionNumber;
    }

    /**
     * Submission
     * <p>
     * Lineage reference object : FOBUAPP_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public void setSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    public UserApproval100GetRequest withSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
        return this;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : FOBUAPP_DOC_CODE
     * 
     */
    @JsonProperty("fobuappDocCode")
    public String getFobuappDocCode() {
        return fobuappDocCode;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : FOBUAPP_DOC_CODE
     * 
     */
    @JsonProperty("fobuappDocCode")
    public void setFobuappDocCode(String fobuappDocCode) {
        this.fobuappDocCode = fobuappDocCode;
    }

    public UserApproval100GetRequest withFobuappDocCode(String fobuappDocCode) {
        this.fobuappDocCode = fobuappDocCode;
        return this;
    }

    /**
     * Lineage reference object : nextIndicator
     * 
     */
    @JsonProperty("nextIndicator")
    public Object getNextIndicator() {
        return nextIndicator;
    }

    /**
     * Lineage reference object : nextIndicator
     * 
     */
    @JsonProperty("nextIndicator")
    public void setNextIndicator(Object nextIndicator) {
        this.nextIndicator = nextIndicator;
    }

    public UserApproval100GetRequest withNextIndicator(Object nextIndicator) {
        this.nextIndicator = nextIndicator;
        return this;
    }

    /**
     * Originating User
     * <p>
     * Lineage reference object : FOBUAPP_ORIG_USER
     * 
     */
    @JsonProperty("origUser")
    public String getOrigUser() {
        return origUser;
    }

    /**
     * Originating User
     * <p>
     * Lineage reference object : FOBUAPP_ORIG_USER
     * 
     */
    @JsonProperty("origUser")
    public void setOrigUser(String origUser) {
        this.origUser = origUser;
    }

    public UserApproval100GetRequest withOrigUser(String origUser) {
        this.origUser = origUser;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : docCode
     * 
     */
    @JsonProperty("docCode")
    public Object getDocCode() {
        return docCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : docCode
     * 
     */
    @JsonProperty("docCode")
    public void setDocCode(Object docCode) {
        this.docCode = docCode;
    }

    public UserApproval100GetRequest withDocCode(Object docCode) {
        this.docCode = docCode;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : userId
     * 
     */
    @JsonProperty("userId")
    public Object getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : userId
     * 
     */
    @JsonProperty("userId")
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public UserApproval100GetRequest withUserId(Object userId) {
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

    public UserApproval100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserApproval100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chgSeqNum");
        sb.append('=');
        sb.append(((this.chgSeqNum == null)?"<null>":this.chgSeqNum));
        sb.append(',');
        sb.append("submissionNumber");
        sb.append('=');
        sb.append(((this.submissionNumber == null)?"<null>":this.submissionNumber));
        sb.append(',');
        sb.append("fobuappDocCode");
        sb.append('=');
        sb.append(((this.fobuappDocCode == null)?"<null>":this.fobuappDocCode));
        sb.append(',');
        sb.append("nextIndicator");
        sb.append('=');
        sb.append(((this.nextIndicator == null)?"<null>":this.nextIndicator));
        sb.append(',');
        sb.append("origUser");
        sb.append('=');
        sb.append(((this.origUser == null)?"<null>":this.origUser));
        sb.append(',');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
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
        result = ((result* 31)+((this.chgSeqNum == null)? 0 :this.chgSeqNum.hashCode()));
        result = ((result* 31)+((this.submissionNumber == null)? 0 :this.submissionNumber.hashCode()));
        result = ((result* 31)+((this.fobuappDocCode == null)? 0 :this.fobuappDocCode.hashCode()));
        result = ((result* 31)+((this.nextIndicator == null)? 0 :this.nextIndicator.hashCode()));
        result = ((result* 31)+((this.origUser == null)? 0 :this.origUser.hashCode()));
        result = ((result* 31)+((this.docCode == null)? 0 :this.docCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserApproval100GetRequest) == false) {
            return false;
        }
        UserApproval100GetRequest rhs = ((UserApproval100GetRequest) other);
        return (((((((((this.chgSeqNum == rhs.chgSeqNum)||((this.chgSeqNum!= null)&&this.chgSeqNum.equals(rhs.chgSeqNum)))&&((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber))))&&((this.fobuappDocCode == rhs.fobuappDocCode)||((this.fobuappDocCode!= null)&&this.fobuappDocCode.equals(rhs.fobuappDocCode))))&&((this.nextIndicator == rhs.nextIndicator)||((this.nextIndicator!= null)&&this.nextIndicator.equals(rhs.nextIndicator))))&&((this.origUser == rhs.origUser)||((this.origUser!= null)&&this.origUser.equals(rhs.origUser))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
