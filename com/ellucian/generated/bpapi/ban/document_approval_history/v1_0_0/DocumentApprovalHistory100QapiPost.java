
package com.ellucian.generated.bpapi.ban.document_approval_history.v1_0_0;

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
    "docCode",
    "docType",
    "chgSeqNum",
    "submissionNumber"
})
@Generated("jsonschema2pojo")
public class DocumentApprovalHistory100QapiPost {

    @JsonProperty("docCode")
    private String docCode;
    @JsonProperty("docType")
    private String docType;
    @JsonProperty("chgSeqNum")
    private String chgSeqNum;
    @JsonProperty("submissionNumber")
    private String submissionNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("docCode")
    public String getDocCode() {
        return docCode;
    }

    @JsonProperty("docCode")
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public DocumentApprovalHistory100QapiPost withDocCode(String docCode) {
        this.docCode = docCode;
        return this;
    }

    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    public DocumentApprovalHistory100QapiPost withDocType(String docType) {
        this.docType = docType;
        return this;
    }

    @JsonProperty("chgSeqNum")
    public String getChgSeqNum() {
        return chgSeqNum;
    }

    @JsonProperty("chgSeqNum")
    public void setChgSeqNum(String chgSeqNum) {
        this.chgSeqNum = chgSeqNum;
    }

    public DocumentApprovalHistory100QapiPost withChgSeqNum(String chgSeqNum) {
        this.chgSeqNum = chgSeqNum;
        return this;
    }

    @JsonProperty("submissionNumber")
    public String getSubmissionNumber() {
        return submissionNumber;
    }

    @JsonProperty("submissionNumber")
    public void setSubmissionNumber(String submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    public DocumentApprovalHistory100QapiPost withSubmissionNumber(String submissionNumber) {
        this.submissionNumber = submissionNumber;
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

    public DocumentApprovalHistory100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentApprovalHistory100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
        sb.append(',');
        sb.append("docType");
        sb.append('=');
        sb.append(((this.docType == null)?"<null>":this.docType));
        sb.append(',');
        sb.append("chgSeqNum");
        sb.append('=');
        sb.append(((this.chgSeqNum == null)?"<null>":this.chgSeqNum));
        sb.append(',');
        sb.append("submissionNumber");
        sb.append('=');
        sb.append(((this.submissionNumber == null)?"<null>":this.submissionNumber));
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
        result = ((result* 31)+((this.docCode == null)? 0 :this.docCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.docType == null)? 0 :this.docType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentApprovalHistory100QapiPost) == false) {
            return false;
        }
        DocumentApprovalHistory100QapiPost rhs = ((DocumentApprovalHistory100QapiPost) other);
        return ((((((this.chgSeqNum == rhs.chgSeqNum)||((this.chgSeqNum!= null)&&this.chgSeqNum.equals(rhs.chgSeqNum)))&&((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.docType == rhs.docType)||((this.docType!= null)&&this.docType.equals(rhs.docType))));
    }

}
