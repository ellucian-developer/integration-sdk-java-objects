
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
    "abalInd",
    "canApprove",
    "origUser",
    "approvalType",
    "dtyp",
    "docCode",
    "docAmt"
})
@Generated("jsonschema2pojo")
public class UserApproval100GetResponse {

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
     * NSF
     * <p>
     * 
     * 
     */
    @JsonProperty("abalInd")
    private String abalInd;
    /**
     * Next Approver
     * <p>
     * 
     * 
     */
    @JsonProperty("canApprove")
    private String canApprove;
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
     * Queue Type
     * <p>
     * 
     * 
     */
    @JsonProperty("approvalType")
    private String approvalType;
    /**
     * Document Type
     * <p>
     * 
     * 
     */
    @JsonProperty("dtyp")
    private String dtyp;
    /**
     * Document Number
     * <p>
     * Lineage reference object : FOBUAPP_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    @JsonPropertyDescription("Lineage reference object : FOBUAPP_DOC_CODE")
    private String docCode;
    /**
     * Document Amount
     * <p>
     * Lineage reference object : FOBUAPP_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    @JsonPropertyDescription("Lineage reference object : FOBUAPP_DOC_AMT")
    private Double docAmt;
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

    public UserApproval100GetResponse withChgSeqNum(Double chgSeqNum) {
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

    public UserApproval100GetResponse withSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
        return this;
    }

    /**
     * NSF
     * <p>
     * 
     * 
     */
    @JsonProperty("abalInd")
    public String getAbalInd() {
        return abalInd;
    }

    /**
     * NSF
     * <p>
     * 
     * 
     */
    @JsonProperty("abalInd")
    public void setAbalInd(String abalInd) {
        this.abalInd = abalInd;
    }

    public UserApproval100GetResponse withAbalInd(String abalInd) {
        this.abalInd = abalInd;
        return this;
    }

    /**
     * Next Approver
     * <p>
     * 
     * 
     */
    @JsonProperty("canApprove")
    public String getCanApprove() {
        return canApprove;
    }

    /**
     * Next Approver
     * <p>
     * 
     * 
     */
    @JsonProperty("canApprove")
    public void setCanApprove(String canApprove) {
        this.canApprove = canApprove;
    }

    public UserApproval100GetResponse withCanApprove(String canApprove) {
        this.canApprove = canApprove;
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

    public UserApproval100GetResponse withOrigUser(String origUser) {
        this.origUser = origUser;
        return this;
    }

    /**
     * Queue Type
     * <p>
     * 
     * 
     */
    @JsonProperty("approvalType")
    public String getApprovalType() {
        return approvalType;
    }

    /**
     * Queue Type
     * <p>
     * 
     * 
     */
    @JsonProperty("approvalType")
    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType;
    }

    public UserApproval100GetResponse withApprovalType(String approvalType) {
        this.approvalType = approvalType;
        return this;
    }

    /**
     * Document Type
     * <p>
     * 
     * 
     */
    @JsonProperty("dtyp")
    public String getDtyp() {
        return dtyp;
    }

    /**
     * Document Type
     * <p>
     * 
     * 
     */
    @JsonProperty("dtyp")
    public void setDtyp(String dtyp) {
        this.dtyp = dtyp;
    }

    public UserApproval100GetResponse withDtyp(String dtyp) {
        this.dtyp = dtyp;
        return this;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : FOBUAPP_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public String getDocCode() {
        return docCode;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : FOBUAPP_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public UserApproval100GetResponse withDocCode(String docCode) {
        this.docCode = docCode;
        return this;
    }

    /**
     * Document Amount
     * <p>
     * Lineage reference object : FOBUAPP_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public Double getDocAmt() {
        return docAmt;
    }

    /**
     * Document Amount
     * <p>
     * Lineage reference object : FOBUAPP_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public void setDocAmt(Double docAmt) {
        this.docAmt = docAmt;
    }

    public UserApproval100GetResponse withDocAmt(Double docAmt) {
        this.docAmt = docAmt;
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

    public UserApproval100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserApproval100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chgSeqNum");
        sb.append('=');
        sb.append(((this.chgSeqNum == null)?"<null>":this.chgSeqNum));
        sb.append(',');
        sb.append("submissionNumber");
        sb.append('=');
        sb.append(((this.submissionNumber == null)?"<null>":this.submissionNumber));
        sb.append(',');
        sb.append("abalInd");
        sb.append('=');
        sb.append(((this.abalInd == null)?"<null>":this.abalInd));
        sb.append(',');
        sb.append("canApprove");
        sb.append('=');
        sb.append(((this.canApprove == null)?"<null>":this.canApprove));
        sb.append(',');
        sb.append("origUser");
        sb.append('=');
        sb.append(((this.origUser == null)?"<null>":this.origUser));
        sb.append(',');
        sb.append("approvalType");
        sb.append('=');
        sb.append(((this.approvalType == null)?"<null>":this.approvalType));
        sb.append(',');
        sb.append("dtyp");
        sb.append('=');
        sb.append(((this.dtyp == null)?"<null>":this.dtyp));
        sb.append(',');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
        sb.append(',');
        sb.append("docAmt");
        sb.append('=');
        sb.append(((this.docAmt == null)?"<null>":this.docAmt));
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
        result = ((result* 31)+((this.abalInd == null)? 0 :this.abalInd.hashCode()));
        result = ((result* 31)+((this.canApprove == null)? 0 :this.canApprove.hashCode()));
        result = ((result* 31)+((this.origUser == null)? 0 :this.origUser.hashCode()));
        result = ((result* 31)+((this.approvalType == null)? 0 :this.approvalType.hashCode()));
        result = ((result* 31)+((this.dtyp == null)? 0 :this.dtyp.hashCode()));
        result = ((result* 31)+((this.docCode == null)? 0 :this.docCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.docAmt == null)? 0 :this.docAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserApproval100GetResponse) == false) {
            return false;
        }
        UserApproval100GetResponse rhs = ((UserApproval100GetResponse) other);
        return (((((((((((this.chgSeqNum == rhs.chgSeqNum)||((this.chgSeqNum!= null)&&this.chgSeqNum.equals(rhs.chgSeqNum)))&&((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber))))&&((this.abalInd == rhs.abalInd)||((this.abalInd!= null)&&this.abalInd.equals(rhs.abalInd))))&&((this.canApprove == rhs.canApprove)||((this.canApprove!= null)&&this.canApprove.equals(rhs.canApprove))))&&((this.origUser == rhs.origUser)||((this.origUser!= null)&&this.origUser.equals(rhs.origUser))))&&((this.approvalType == rhs.approvalType)||((this.approvalType!= null)&&this.approvalType.equals(rhs.approvalType))))&&((this.dtyp == rhs.dtyp)||((this.dtyp!= null)&&this.dtyp.equals(rhs.dtyp))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.docAmt == rhs.docAmt)||((this.docAmt!= null)&&this.docAmt.equals(rhs.docAmt))));
    }

}
