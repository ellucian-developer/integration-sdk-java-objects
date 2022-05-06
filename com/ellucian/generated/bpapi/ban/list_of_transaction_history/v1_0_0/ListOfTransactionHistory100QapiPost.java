
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
    "docCode",
    "dtypCode",
    "dtypSeqNum",
    "transDate",
    "seqNum",
    "serialNum",
    "fsyrCode",
    "postingPeriod",
    "ruclCode",
    "itemNum",
    "subNum",
    "fgvtrnhDocCode",
    "displayDocType",
    "submissionNumber",
    "cmtType",
    "transDesc"
})
@Generated("jsonschema2pojo")
public class ListOfTransactionHistory100QapiPost {

    /**
     * Document
     * Code
     * <p>
     * Lineage reference object : FGVTRNH_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRNH_DOC_CODE")
    private String docCode;
    @JsonProperty("dtypCode")
    private String dtypCode;
    @JsonProperty("dtypSeqNum")
    private String dtypSeqNum;
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
    @JsonProperty("seqNum")
    private String seqNum;
    @JsonProperty("serialNum")
    private String serialNum;
    @JsonProperty("fsyrCode")
    private String fsyrCode;
    @JsonProperty("postingPeriod")
    private String postingPeriod;
    @JsonProperty("ruclCode")
    private String ruclCode;
    @JsonProperty("itemNum")
    private String itemNum;
    @JsonProperty("subNum")
    private String subNum;
    @JsonProperty("fgvtrnhDocCode")
    private String fgvtrnhDocCode;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Document
     * Code
     * <p>
     * Lineage reference object : FGVTRNH_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public String getDocCode() {
        return docCode;
    }

    /**
     * Document
     * Code
     * <p>
     * Lineage reference object : FGVTRNH_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public ListOfTransactionHistory100QapiPost withDocCode(String docCode) {
        this.docCode = docCode;
        return this;
    }

    @JsonProperty("dtypCode")
    public String getDtypCode() {
        return dtypCode;
    }

    @JsonProperty("dtypCode")
    public void setDtypCode(String dtypCode) {
        this.dtypCode = dtypCode;
    }

    public ListOfTransactionHistory100QapiPost withDtypCode(String dtypCode) {
        this.dtypCode = dtypCode;
        return this;
    }

    @JsonProperty("dtypSeqNum")
    public String getDtypSeqNum() {
        return dtypSeqNum;
    }

    @JsonProperty("dtypSeqNum")
    public void setDtypSeqNum(String dtypSeqNum) {
        this.dtypSeqNum = dtypSeqNum;
    }

    public ListOfTransactionHistory100QapiPost withDtypSeqNum(String dtypSeqNum) {
        this.dtypSeqNum = dtypSeqNum;
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

    public ListOfTransactionHistory100QapiPost withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    @JsonProperty("seqNum")
    public String getSeqNum() {
        return seqNum;
    }

    @JsonProperty("seqNum")
    public void setSeqNum(String seqNum) {
        this.seqNum = seqNum;
    }

    public ListOfTransactionHistory100QapiPost withSeqNum(String seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    @JsonProperty("serialNum")
    public String getSerialNum() {
        return serialNum;
    }

    @JsonProperty("serialNum")
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public ListOfTransactionHistory100QapiPost withSerialNum(String serialNum) {
        this.serialNum = serialNum;
        return this;
    }

    @JsonProperty("fsyrCode")
    public String getFsyrCode() {
        return fsyrCode;
    }

    @JsonProperty("fsyrCode")
    public void setFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
    }

    public ListOfTransactionHistory100QapiPost withFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
        return this;
    }

    @JsonProperty("postingPeriod")
    public String getPostingPeriod() {
        return postingPeriod;
    }

    @JsonProperty("postingPeriod")
    public void setPostingPeriod(String postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public ListOfTransactionHistory100QapiPost withPostingPeriod(String postingPeriod) {
        this.postingPeriod = postingPeriod;
        return this;
    }

    @JsonProperty("ruclCode")
    public String getRuclCode() {
        return ruclCode;
    }

    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public ListOfTransactionHistory100QapiPost withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

    @JsonProperty("itemNum")
    public String getItemNum() {
        return itemNum;
    }

    @JsonProperty("itemNum")
    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    public ListOfTransactionHistory100QapiPost withItemNum(String itemNum) {
        this.itemNum = itemNum;
        return this;
    }

    @JsonProperty("subNum")
    public String getSubNum() {
        return subNum;
    }

    @JsonProperty("subNum")
    public void setSubNum(String subNum) {
        this.subNum = subNum;
    }

    public ListOfTransactionHistory100QapiPost withSubNum(String subNum) {
        this.subNum = subNum;
        return this;
    }

    @JsonProperty("fgvtrnhDocCode")
    public String getFgvtrnhDocCode() {
        return fgvtrnhDocCode;
    }

    @JsonProperty("fgvtrnhDocCode")
    public void setFgvtrnhDocCode(String fgvtrnhDocCode) {
        this.fgvtrnhDocCode = fgvtrnhDocCode;
    }

    public ListOfTransactionHistory100QapiPost withFgvtrnhDocCode(String fgvtrnhDocCode) {
        this.fgvtrnhDocCode = fgvtrnhDocCode;
        return this;
    }

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

    public ListOfTransactionHistory100QapiPost withDisplayDocType(String displayDocType) {
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

    public ListOfTransactionHistory100QapiPost withSubmissionNumber(Double submissionNumber) {
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

    public ListOfTransactionHistory100QapiPost withCmtType(String cmtType) {
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

    public ListOfTransactionHistory100QapiPost withTransDesc(String transDesc) {
        this.transDesc = transDesc;
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

    public ListOfTransactionHistory100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListOfTransactionHistory100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
        sb.append(',');
        sb.append("dtypCode");
        sb.append('=');
        sb.append(((this.dtypCode == null)?"<null>":this.dtypCode));
        sb.append(',');
        sb.append("dtypSeqNum");
        sb.append('=');
        sb.append(((this.dtypSeqNum == null)?"<null>":this.dtypSeqNum));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("serialNum");
        sb.append('=');
        sb.append(((this.serialNum == null)?"<null>":this.serialNum));
        sb.append(',');
        sb.append("fsyrCode");
        sb.append('=');
        sb.append(((this.fsyrCode == null)?"<null>":this.fsyrCode));
        sb.append(',');
        sb.append("postingPeriod");
        sb.append('=');
        sb.append(((this.postingPeriod == null)?"<null>":this.postingPeriod));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("itemNum");
        sb.append('=');
        sb.append(((this.itemNum == null)?"<null>":this.itemNum));
        sb.append(',');
        sb.append("subNum");
        sb.append('=');
        sb.append(((this.subNum == null)?"<null>":this.subNum));
        sb.append(',');
        sb.append("fgvtrnhDocCode");
        sb.append('=');
        sb.append(((this.fgvtrnhDocCode == null)?"<null>":this.fgvtrnhDocCode));
        sb.append(',');
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
        result = ((result* 31)+((this.submissionNumber == null)? 0 :this.submissionNumber.hashCode()));
        result = ((result* 31)+((this.serialNum == null)? 0 :this.serialNum.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.docCode == null)? 0 :this.docCode.hashCode()));
        result = ((result* 31)+((this.fgvtrnhDocCode == null)? 0 :this.fgvtrnhDocCode.hashCode()));
        result = ((result* 31)+((this.dtypSeqNum == null)? 0 :this.dtypSeqNum.hashCode()));
        result = ((result* 31)+((this.displayDocType == null)? 0 :this.displayDocType.hashCode()));
        result = ((result* 31)+((this.itemNum == null)? 0 :this.itemNum.hashCode()));
        result = ((result* 31)+((this.fsyrCode == null)? 0 :this.fsyrCode.hashCode()));
        result = ((result* 31)+((this.cmtType == null)? 0 :this.cmtType.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.dtypCode == null)? 0 :this.dtypCode.hashCode()));
        result = ((result* 31)+((this.postingPeriod == null)? 0 :this.postingPeriod.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subNum == null)? 0 :this.subNum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListOfTransactionHistory100QapiPost) == false) {
            return false;
        }
        ListOfTransactionHistory100QapiPost rhs = ((ListOfTransactionHistory100QapiPost) other);
        return ((((((((((((((((((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber)))&&((this.serialNum == rhs.serialNum)||((this.serialNum!= null)&&this.serialNum.equals(rhs.serialNum))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.fgvtrnhDocCode == rhs.fgvtrnhDocCode)||((this.fgvtrnhDocCode!= null)&&this.fgvtrnhDocCode.equals(rhs.fgvtrnhDocCode))))&&((this.dtypSeqNum == rhs.dtypSeqNum)||((this.dtypSeqNum!= null)&&this.dtypSeqNum.equals(rhs.dtypSeqNum))))&&((this.displayDocType == rhs.displayDocType)||((this.displayDocType!= null)&&this.displayDocType.equals(rhs.displayDocType))))&&((this.itemNum == rhs.itemNum)||((this.itemNum!= null)&&this.itemNum.equals(rhs.itemNum))))&&((this.fsyrCode == rhs.fsyrCode)||((this.fsyrCode!= null)&&this.fsyrCode.equals(rhs.fsyrCode))))&&((this.cmtType == rhs.cmtType)||((this.cmtType!= null)&&this.cmtType.equals(rhs.cmtType))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.dtypCode == rhs.dtypCode)||((this.dtypCode!= null)&&this.dtypCode.equals(rhs.dtypCode))))&&((this.postingPeriod == rhs.postingPeriod)||((this.postingPeriod!= null)&&this.postingPeriod.equals(rhs.postingPeriod))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subNum == rhs.subNum)||((this.subNum!= null)&&this.subNum.equals(rhs.subNum))));
    }

}
