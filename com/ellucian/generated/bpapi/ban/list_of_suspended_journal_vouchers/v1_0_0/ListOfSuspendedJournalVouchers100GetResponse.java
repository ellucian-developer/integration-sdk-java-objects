
package com.ellucian.generated.bpapi.ban.list_of_suspended_journal_vouchers.v1_0_0;

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
    "docDescription",
    "submissionNumber",
    "docNum",
    "statusInd",
    "transDate",
    "docAmt"
})
@Generated("jsonschema2pojo")
public class ListOfSuspendedJournalVouchers100GetResponse {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("docDescription")
    private String docDescription;
    /**
     * Submission
     * <p>
     * Lineage reference object : FGBJVCH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_SUBMISSION_NUMBER")
    private Double submissionNumber;
    /**
     * Document
     * <p>
     * Lineage reference object : FGBJVCH_DOC_NUM
     * 
     */
    @JsonProperty("docNum")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_DOC_NUM")
    private String docNum;
    /**
     * Status
     * <p>
     * Lineage reference object : FGBJVCH_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_STATUS_IND")
    private String statusInd;
    /**
     * Transaction  
     * Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_TRANS_DATE")
    private Date transDate;
    /**
     * Amount
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    @JsonPropertyDescription("Lineage reference object : FGBJVCH_DOC_AMT")
    private Double docAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("docDescription")
    public String getDocDescription() {
        return docDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("docDescription")
    public void setDocDescription(String docDescription) {
        this.docDescription = docDescription;
    }

    public ListOfSuspendedJournalVouchers100GetResponse withDocDescription(String docDescription) {
        this.docDescription = docDescription;
        return this;
    }

    /**
     * Submission
     * <p>
     * Lineage reference object : FGBJVCH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public Double getSubmissionNumber() {
        return submissionNumber;
    }

    /**
     * Submission
     * <p>
     * Lineage reference object : FGBJVCH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public void setSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    public ListOfSuspendedJournalVouchers100GetResponse withSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FGBJVCH_DOC_NUM
     * 
     */
    @JsonProperty("docNum")
    public String getDocNum() {
        return docNum;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FGBJVCH_DOC_NUM
     * 
     */
    @JsonProperty("docNum")
    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public ListOfSuspendedJournalVouchers100GetResponse withDocNum(String docNum) {
        this.docNum = docNum;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBJVCH_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBJVCH_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public ListOfSuspendedJournalVouchers100GetResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Transaction  
     * Date
     * <p>
     * Lineage reference object : FGBJVCH_TRANS_DATE
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
     * Lineage reference object : FGBJVCH_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public ListOfSuspendedJournalVouchers100GetResponse withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public Double getDocAmt() {
        return docAmt;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBJVCH_DOC_AMT
     * 
     */
    @JsonProperty("docAmt")
    public void setDocAmt(Double docAmt) {
        this.docAmt = docAmt;
    }

    public ListOfSuspendedJournalVouchers100GetResponse withDocAmt(Double docAmt) {
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

    public ListOfSuspendedJournalVouchers100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListOfSuspendedJournalVouchers100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("docDescription");
        sb.append('=');
        sb.append(((this.docDescription == null)?"<null>":this.docDescription));
        sb.append(',');
        sb.append("submissionNumber");
        sb.append('=');
        sb.append(((this.submissionNumber == null)?"<null>":this.submissionNumber));
        sb.append(',');
        sb.append("docNum");
        sb.append('=');
        sb.append(((this.docNum == null)?"<null>":this.docNum));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
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
        result = ((result* 31)+((this.docDescription == null)? 0 :this.docDescription.hashCode()));
        result = ((result* 31)+((this.submissionNumber == null)? 0 :this.submissionNumber.hashCode()));
        result = ((result* 31)+((this.docNum == null)? 0 :this.docNum.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.docAmt == null)? 0 :this.docAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListOfSuspendedJournalVouchers100GetResponse) == false) {
            return false;
        }
        ListOfSuspendedJournalVouchers100GetResponse rhs = ((ListOfSuspendedJournalVouchers100GetResponse) other);
        return ((((((((this.docDescription == rhs.docDescription)||((this.docDescription!= null)&&this.docDescription.equals(rhs.docDescription)))&&((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber))))&&((this.docNum == rhs.docNum)||((this.docNum!= null)&&this.docNum.equals(rhs.docNum))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.docAmt == rhs.docAmt)||((this.docAmt!= null)&&this.docAmt.equals(rhs.docAmt))));
    }

}
