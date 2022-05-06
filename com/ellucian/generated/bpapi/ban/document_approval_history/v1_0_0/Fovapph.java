
package com.ellucian.generated.bpapi.ban.document_approval_history.v1_0_0;

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
    "docType",
    "docCode"
})
@Generated("jsonschema2pojo")
public class Fovapph {

    /**
     * Change Sequence
     * <p>
     * Lineage reference object : FOVAPPH_CHG_SEQ_NUM
     * 
     */
    @JsonProperty("chgSeqNum")
    @JsonPropertyDescription("Lineage reference object : FOVAPPH_CHG_SEQ_NUM")
    private Double chgSeqNum;
    /**
     * Submission Number
     * <p>
     * Lineage reference object : FOVAPPH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    @JsonPropertyDescription("Lineage reference object : FOVAPPH_SUBMISSION_NUMBER")
    private Double submissionNumber;
    /**
     * Type
     * <p>
     * Lineage reference object : FOVAPPH_DOC_TYPE
     * 
     */
    @JsonProperty("docType")
    @JsonPropertyDescription("Lineage reference object : FOVAPPH_DOC_TYPE")
    private String docType;
    /**
     * Document Code
     * <p>
     * Lineage reference object : FOVAPPH_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    @JsonPropertyDescription("Lineage reference object : FOVAPPH_DOC_CODE")
    private String docCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Change Sequence
     * <p>
     * Lineage reference object : FOVAPPH_CHG_SEQ_NUM
     * 
     */
    @JsonProperty("chgSeqNum")
    public Double getChgSeqNum() {
        return chgSeqNum;
    }

    /**
     * Change Sequence
     * <p>
     * Lineage reference object : FOVAPPH_CHG_SEQ_NUM
     * 
     */
    @JsonProperty("chgSeqNum")
    public void setChgSeqNum(Double chgSeqNum) {
        this.chgSeqNum = chgSeqNum;
    }

    public Fovapph withChgSeqNum(Double chgSeqNum) {
        this.chgSeqNum = chgSeqNum;
        return this;
    }

    /**
     * Submission Number
     * <p>
     * Lineage reference object : FOVAPPH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public Double getSubmissionNumber() {
        return submissionNumber;
    }

    /**
     * Submission Number
     * <p>
     * Lineage reference object : FOVAPPH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public void setSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    public Fovapph withSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FOVAPPH_DOC_TYPE
     * 
     */
    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FOVAPPH_DOC_TYPE
     * 
     */
    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Fovapph withDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * Document Code
     * <p>
     * Lineage reference object : FOVAPPH_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public String getDocCode() {
        return docCode;
    }

    /**
     * Document Code
     * <p>
     * Lineage reference object : FOVAPPH_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public Fovapph withDocCode(String docCode) {
        this.docCode = docCode;
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

    public Fovapph withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fovapph.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chgSeqNum");
        sb.append('=');
        sb.append(((this.chgSeqNum == null)?"<null>":this.chgSeqNum));
        sb.append(',');
        sb.append("submissionNumber");
        sb.append('=');
        sb.append(((this.submissionNumber == null)?"<null>":this.submissionNumber));
        sb.append(',');
        sb.append("docType");
        sb.append('=');
        sb.append(((this.docType == null)?"<null>":this.docType));
        sb.append(',');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
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
        if ((other instanceof Fovapph) == false) {
            return false;
        }
        Fovapph rhs = ((Fovapph) other);
        return ((((((this.chgSeqNum == rhs.chgSeqNum)||((this.chgSeqNum!= null)&&this.chgSeqNum.equals(rhs.chgSeqNum)))&&((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.docType == rhs.docType)||((this.docType!= null)&&this.docType.equals(rhs.docType))));
    }

}
