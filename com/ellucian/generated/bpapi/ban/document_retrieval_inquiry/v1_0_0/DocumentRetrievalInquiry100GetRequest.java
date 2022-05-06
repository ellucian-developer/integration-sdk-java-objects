
package com.ellucian.generated.bpapi.ban.document_retrieval_inquiry.v1_0_0;

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
    "submissionNumber",
    "bankCode",
    "keyblckSubmissionNumber",
    "prjdCode",
    "seqNum",
    "acciCode",
    "keyblckDocCode",
    "coasCode",
    "locnCode",
    "keyblckDtypCode",
    "orgnCode",
    "acctCode",
    "itemNum",
    "fundCode",
    "transDesc",
    "transAmt",
    "progCode",
    "ruclCode",
    "docRefNum",
    "actvCode",
    "drCrInd"
})
@Generated("jsonschema2pojo")
public class DocumentRetrievalInquiry100GetRequest {

    /**
     * Sub Number
     * <p>
     * Lineage reference object : FGBTRNH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_SUBMISSION_NUMBER")
    private Double submissionNumber;
    /**
     * Bank
     * <p>
     * Lineage reference object : FGBTRNH_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Submission Number
     * <p>
     * Lineage reference object : keyblckSubmissionNumber
     * 
     */
    @JsonProperty("keyblckSubmissionNumber")
    @JsonPropertyDescription("Lineage reference object : keyblckSubmissionNumber")
    private Object keyblckSubmissionNumber;
    /**
     * Proj
     * <p>
     * Lineage reference object : FGBTRNH_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_PRJD_CODE")
    private String prjdCode;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBTRNH_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_SEQ_NUM")
    private Double seqNum;
    /**
     * Index
     * <p>
     * Lineage reference object : FGBTRNH_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String acciCode;
    /**
     * Document
     * <p>
     * Lineage reference object : keyblckDocCode
     * (Required)
     * 
     */
    @JsonProperty("keyblckDocCode")
    @JsonPropertyDescription("Lineage reference object : keyblckDocCode")
    private Object keyblckDocCode;
    /**
     * COA
     * <p>
     * Lineage reference object : FGBTRNH_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Locn
     * <p>
     * Lineage reference object : FGBTRNH_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_LOCN_CODE")
    private String locnCode;
    /**
     * Document Type
     * <p>
     * Lineage reference object : keyblckDtypCode, Lookup lineage reference object : ftvdtyp
     * (Required)
     * 
     */
    @JsonProperty("keyblckDtypCode")
    @JsonPropertyDescription("Lineage reference object : keyblckDtypCode, Lookup lineage reference object : ftvdtyp")
    private Object keyblckDtypCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBTRNH_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_ORGN_CODE")
    private String orgnCode;
    /**
     * Acct
     * <p>
     * Lineage reference object : FGBTRNH_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_ACCT_CODE")
    private String acctCode;
    /**
     * Item
     * <p>
     * Lineage reference object : FGBTRNH_ITEM_NUM
     * 
     */
    @JsonProperty("itemNum")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_ITEM_NUM")
    private Double itemNum;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGBTRNH_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_FUND_CODE")
    private String fundCode;
    /**
     * Description
     * <p>
     * Lineage reference object : FGBTRNH_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_TRANS_DESC")
    private String transDesc;
    /**
     * Amount
     * <p>
     * Lineage reference object : FGBTRNH_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_TRANS_AMT")
    private Double transAmt;
    /**
     * Prog
     * <p>
     * Lineage reference object : FGBTRNH_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_PROG_CODE")
    private String progCode;
    /**
     * Journal Type
     * <p>
     * Lineage reference object : FGBTRNH_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_RUCL_CODE, Lookup lineage reference object : ftvrucl")
    private String ruclCode;
    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBTRNH_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_DOC_REF_NUM")
    private String docRefNum;
    /**
     * Actv
     * <p>
     * Lineage reference object : FGBTRNH_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_ACTV_CODE")
    private String actvCode;
    /**
     * Sign
     * <p>
     * Lineage reference object : FGBTRNH_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    @JsonPropertyDescription("Lineage reference object : FGBTRNH_DR_CR_IND")
    private String drCrInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Sub Number
     * <p>
     * Lineage reference object : FGBTRNH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public Double getSubmissionNumber() {
        return submissionNumber;
    }

    /**
     * Sub Number
     * <p>
     * Lineage reference object : FGBTRNH_SUBMISSION_NUMBER
     * 
     */
    @JsonProperty("submissionNumber")
    public void setSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    public DocumentRetrievalInquiry100GetRequest withSubmissionNumber(Double submissionNumber) {
        this.submissionNumber = submissionNumber;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FGBTRNH_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FGBTRNH_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public DocumentRetrievalInquiry100GetRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Submission Number
     * <p>
     * Lineage reference object : keyblckSubmissionNumber
     * 
     */
    @JsonProperty("keyblckSubmissionNumber")
    public Object getKeyblckSubmissionNumber() {
        return keyblckSubmissionNumber;
    }

    /**
     * Submission Number
     * <p>
     * Lineage reference object : keyblckSubmissionNumber
     * 
     */
    @JsonProperty("keyblckSubmissionNumber")
    public void setKeyblckSubmissionNumber(Object keyblckSubmissionNumber) {
        this.keyblckSubmissionNumber = keyblckSubmissionNumber;
    }

    public DocumentRetrievalInquiry100GetRequest withKeyblckSubmissionNumber(Object keyblckSubmissionNumber) {
        this.keyblckSubmissionNumber = keyblckSubmissionNumber;
        return this;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FGBTRNH_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    public String getPrjdCode() {
        return prjdCode;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FGBTRNH_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    public void setPrjdCode(String prjdCode) {
        this.prjdCode = prjdCode;
    }

    public DocumentRetrievalInquiry100GetRequest withPrjdCode(String prjdCode) {
        this.prjdCode = prjdCode;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBTRNH_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public Double getSeqNum() {
        return seqNum;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBTRNH_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public DocumentRetrievalInquiry100GetRequest withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBTRNH_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBTRNH_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public DocumentRetrievalInquiry100GetRequest withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keyblckDocCode
     * (Required)
     * 
     */
    @JsonProperty("keyblckDocCode")
    public Object getKeyblckDocCode() {
        return keyblckDocCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : keyblckDocCode
     * (Required)
     * 
     */
    @JsonProperty("keyblckDocCode")
    public void setKeyblckDocCode(Object keyblckDocCode) {
        this.keyblckDocCode = keyblckDocCode;
    }

    public DocumentRetrievalInquiry100GetRequest withKeyblckDocCode(Object keyblckDocCode) {
        this.keyblckDocCode = keyblckDocCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBTRNH_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBTRNH_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public DocumentRetrievalInquiry100GetRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBTRNH_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBTRNH_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public DocumentRetrievalInquiry100GetRequest withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Document Type
     * <p>
     * Lineage reference object : keyblckDtypCode, Lookup lineage reference object : ftvdtyp
     * (Required)
     * 
     */
    @JsonProperty("keyblckDtypCode")
    public Object getKeyblckDtypCode() {
        return keyblckDtypCode;
    }

    /**
     * Document Type
     * <p>
     * Lineage reference object : keyblckDtypCode, Lookup lineage reference object : ftvdtyp
     * (Required)
     * 
     */
    @JsonProperty("keyblckDtypCode")
    public void setKeyblckDtypCode(Object keyblckDtypCode) {
        this.keyblckDtypCode = keyblckDtypCode;
    }

    public DocumentRetrievalInquiry100GetRequest withKeyblckDtypCode(Object keyblckDtypCode) {
        this.keyblckDtypCode = keyblckDtypCode;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBTRNH_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBTRNH_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public DocumentRetrievalInquiry100GetRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBTRNH_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBTRNH_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public DocumentRetrievalInquiry100GetRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : FGBTRNH_ITEM_NUM
     * 
     */
    @JsonProperty("itemNum")
    public Double getItemNum() {
        return itemNum;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : FGBTRNH_ITEM_NUM
     * 
     */
    @JsonProperty("itemNum")
    public void setItemNum(Double itemNum) {
        this.itemNum = itemNum;
    }

    public DocumentRetrievalInquiry100GetRequest withItemNum(Double itemNum) {
        this.itemNum = itemNum;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBTRNH_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBTRNH_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public DocumentRetrievalInquiry100GetRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBTRNH_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    public String getTransDesc() {
        return transDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGBTRNH_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc;
    }

    public DocumentRetrievalInquiry100GetRequest withTransDesc(String transDesc) {
        this.transDesc = transDesc;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBTRNH_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    public Double getTransAmt() {
        return transAmt;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGBTRNH_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    public void setTransAmt(Double transAmt) {
        this.transAmt = transAmt;
    }

    public DocumentRetrievalInquiry100GetRequest withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
        return this;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBTRNH_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBTRNH_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public DocumentRetrievalInquiry100GetRequest withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Journal Type
     * <p>
     * Lineage reference object : FGBTRNH_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCode")
    public String getRuclCode() {
        return ruclCode;
    }

    /**
     * Journal Type
     * <p>
     * Lineage reference object : FGBTRNH_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public DocumentRetrievalInquiry100GetRequest withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBTRNH_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    public String getDocRefNum() {
        return docRefNum;
    }

    /**
     * Document Reference
     * <p>
     * Lineage reference object : FGBTRNH_DOC_REF_NUM
     * 
     */
    @JsonProperty("docRefNum")
    public void setDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
    }

    public DocumentRetrievalInquiry100GetRequest withDocRefNum(String docRefNum) {
        this.docRefNum = docRefNum;
        return this;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBTRNH_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBTRNH_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public DocumentRetrievalInquiry100GetRequest withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Sign
     * <p>
     * Lineage reference object : FGBTRNH_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public String getDrCrInd() {
        return drCrInd;
    }

    /**
     * Sign
     * <p>
     * Lineage reference object : FGBTRNH_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public void setDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
    }

    public DocumentRetrievalInquiry100GetRequest withDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
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

    public DocumentRetrievalInquiry100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentRetrievalInquiry100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("submissionNumber");
        sb.append('=');
        sb.append(((this.submissionNumber == null)?"<null>":this.submissionNumber));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("keyblckSubmissionNumber");
        sb.append('=');
        sb.append(((this.keyblckSubmissionNumber == null)?"<null>":this.keyblckSubmissionNumber));
        sb.append(',');
        sb.append("prjdCode");
        sb.append('=');
        sb.append(((this.prjdCode == null)?"<null>":this.prjdCode));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("keyblckDocCode");
        sb.append('=');
        sb.append(((this.keyblckDocCode == null)?"<null>":this.keyblckDocCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("keyblckDtypCode");
        sb.append('=');
        sb.append(((this.keyblckDtypCode == null)?"<null>":this.keyblckDtypCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("itemNum");
        sb.append('=');
        sb.append(((this.itemNum == null)?"<null>":this.itemNum));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("transAmt");
        sb.append('=');
        sb.append(((this.transAmt == null)?"<null>":this.transAmt));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("docRefNum");
        sb.append('=');
        sb.append(((this.docRefNum == null)?"<null>":this.docRefNum));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("drCrInd");
        sb.append('=');
        sb.append(((this.drCrInd == null)?"<null>":this.drCrInd));
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
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.keyblckSubmissionNumber == null)? 0 :this.keyblckSubmissionNumber.hashCode()));
        result = ((result* 31)+((this.prjdCode == null)? 0 :this.prjdCode.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.keyblckDocCode == null)? 0 :this.keyblckDocCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.keyblckDtypCode == null)? 0 :this.keyblckDtypCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.itemNum == null)? 0 :this.itemNum.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.docRefNum == null)? 0 :this.docRefNum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentRetrievalInquiry100GetRequest) == false) {
            return false;
        }
        DocumentRetrievalInquiry100GetRequest rhs = ((DocumentRetrievalInquiry100GetRequest) other);
        return (((((((((((((((((((((((this.submissionNumber == rhs.submissionNumber)||((this.submissionNumber!= null)&&this.submissionNumber.equals(rhs.submissionNumber)))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.keyblckSubmissionNumber == rhs.keyblckSubmissionNumber)||((this.keyblckSubmissionNumber!= null)&&this.keyblckSubmissionNumber.equals(rhs.keyblckSubmissionNumber))))&&((this.prjdCode == rhs.prjdCode)||((this.prjdCode!= null)&&this.prjdCode.equals(rhs.prjdCode))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.keyblckDocCode == rhs.keyblckDocCode)||((this.keyblckDocCode!= null)&&this.keyblckDocCode.equals(rhs.keyblckDocCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.keyblckDtypCode == rhs.keyblckDtypCode)||((this.keyblckDtypCode!= null)&&this.keyblckDtypCode.equals(rhs.keyblckDtypCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.itemNum == rhs.itemNum)||((this.itemNum!= null)&&this.itemNum.equals(rhs.itemNum))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.docRefNum == rhs.docRefNum)||((this.docRefNum!= null)&&this.docRefNum.equals(rhs.docRefNum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))));
    }

}
