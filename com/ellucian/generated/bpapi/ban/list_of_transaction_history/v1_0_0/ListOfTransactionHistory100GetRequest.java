
package com.ellucian.generated.bpapi.ban.list_of_transaction_history.v1_0_0;

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
    "displayDocType",
    "submissionNumber",
    "cmtType",
    "transDesc",
    "transDate",
    "fgvtrnhDocCode"
})
@Generated("jsonschema2pojo")
public class ListOfTransactionHistory100GetRequest {

    /**
     * Document
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDocType")
    private String displayDocType;
    /**
     * Submission
     * Number
     * <p>
     * Lineage reference object : FGVTRNH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    @JsonPropertyDescription("Lineage reference object : FGVTRNH_SUBMISSION_NUMBER")
    private Double submissionNumber;
    /**
     * Commit
     * Type
     * <p>
     * Lineage reference object : FGVTRNH_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    @JsonPropertyDescription("Lineage reference object : FGVTRNH_CMT_TYPE")
    private String cmtType;
    /**
     * Description
     * <p>
     * Lineage reference object : FGVTRNH_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    @JsonPropertyDescription("Lineage reference object : FGVTRNH_TRANS_DESC")
    private String transDesc;
    /**
     * Transaction
     * Date
     * <p>
     * Lineage reference object : FGVTRNH_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FGVTRNH_TRANS_DATE")
    private Date transDate;
    /**
     * Document
     * Code
     * <p>
     * Lineage reference object : FGVTRNH_DOC_CODE
     * 
     */
    @JsonProperty("fgvtrnhDocCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRNH_DOC_CODE")
    private String fgvtrnhDocCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Document
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDocType")
    public String getDisplayDocType() {
        return displayDocType;
    }

    /**
     * Document
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDocType")
    public void setDisplayDocType(String displayDocType) {
        this.displayDocType = displayDocType;
    }

    public ListOfTransactionHistory100GetRequest withDisplayDocType(String displayDocType) {
        this.displayDocType = displayDocType;
        return this;
    }

    /**
     * Submission
     * Number
     * <p>
     * Lineage reference object : FGVTRNH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public Double getSubmissionNumber() {
        return submissionNumber;
    }

    /**
     * Submission
     * Number
     * <p>
     * Lineage reference object : FGVTRNH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public void setSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    public ListOfTransactionHistory100GetRequest withSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
        return this;
    }

    /**
     * Commit
     * Type
     * <p>
     * Lineage reference object : FGVTRNH_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    public String getCmtType() {
        return cmtType;
    }

    /**
     * Commit
     * Type
     * <p>
     * Lineage reference object : FGVTRNH_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    public void setCmtType(String cmtType) {
        this.cmtType = cmtType;
    }

    public ListOfTransactionHistory100GetRequest withCmtType(String cmtType) {
        this.cmtType = cmtType;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGVTRNH_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    public String getTransDesc() {
        return transDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGVTRNH_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc;
    }

    public ListOfTransactionHistory100GetRequest withTransDesc(String transDesc) {
        this.transDesc = transDesc;
        return this;
    }

    /**
     * Transaction
     * Date
     * <p>
     * Lineage reference object : FGVTRNH_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction
     * Date
     * <p>
     * Lineage reference object : FGVTRNH_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public ListOfTransactionHistory100GetRequest withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Document
     * Code
     * <p>
     * Lineage reference object : FGVTRNH_DOC_CODE
     * 
     */
    @JsonProperty("fgvtrnhDocCode")
    public String getFgvtrnhDocCode() {
        return fgvtrnhDocCode;
    }

    /**
     * Document
     * Code
     * <p>
     * Lineage reference object : FGVTRNH_DOC_CODE
     * 
     */
    @JsonProperty("fgvtrnhDocCode")
    public void setFgvtrnhDocCode(String fgvtrnhDocCode) {
        this.fgvtrnhDocCode = fgvtrnhDocCode;
    }

    public ListOfTransactionHistory100GetRequest withFgvtrnhDocCode(String fgvtrnhDocCode) {
        this.fgvtrnhDocCode = fgvtrnhDocCode;
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

    public ListOfTransactionHistory100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListOfTransactionHistory100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayDocType");
        sb.append('=');
        sb.append(((this.displayDocType == null)?"<null>":this.displayDocType));
        sb.append(',');
        sb.append("submissionNumber");
        sb.append('=');
        sb.append(((this.submissionNumber == null)?"<null>":this.submissionNumber));
        sb.append(',');
        sb.append("cmtType");
        sb.append('=');
        sb.append(((this.cmtType == null)?"<null>":this.cmtType));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("fgvtrnhDocCode");
        sb.append('=');
        sb.append(((this.fgvtrnhDocCode == null)?"<null>":this.fgvtrnhDocCode));
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
        result = ((result* 31)+((this.displayDocType == null)? 0 :this.displayDocType.hashCode()));
        result = ((result* 31)+((this.submissionNumber == null)? 0 :this.submissionNumber.hashCode()));
        result = ((result* 31)+((this.cmtType == null)? 0 :this.cmtType.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fgvtrnhDocCode == null)? 0 :this.fgvtrnhDocCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListOfTransactionHistory100GetRequest) == false) {
            return false;
        }
        ListOfTransactionHistory100GetRequest rhs = ((ListOfTransactionHistory100GetRequest) other);
        return ((((((((this.displayDocType == rhs.displayDocType)||((this.displayDocType!= null)&&this.displayDocType.equals(rhs.displayDocType)))&&((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber))))&&((this.cmtType == rhs.cmtType)||((this.cmtType!= null)&&this.cmtType.equals(rhs.cmtType))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fgvtrnhDocCode == rhs.fgvtrnhDocCode)||((this.fgvtrnhDocCode!= null)&&this.fgvtrnhDocCode.equals(rhs.fgvtrnhDocCode))));
    }

}
