
package com.ellucian.generated.bpapi.ban.applicant_need_analysis_application_inquiry.v1_0_0;

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
    "keyblckAidyCode",
    "keyblckStudentId",
    "infcCode",
    "seqNo",
    "currRecInd",
    "pellPgi",
    "usedTransNo",
    "activeInd",
    "pgi",
    "tfc",
    "collChoice",
    "createDate",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class ApplicantNeedAnalysisApplicationInquiry100QapiPost {

    @JsonProperty("keyblckAidyCode")
    private String keyblckAidyCode;
    @JsonProperty("keyblckStudentId")
    private String keyblckStudentId;
    /**
     * Application Source
     * <p>
     * Lineage reference object : RCVAPPL_INFC_CODE
     * 
     */
    @JsonProperty("infcCode")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_INFC_CODE")
    private String infcCode;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : RCVAPPL_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_SEQ_NO")
    private Double seqNo;
    /**
     * Current Record
     * <p>
     * Lineage reference object : RCVAPPL_CURR_REC_IND
     * 
     */
    @JsonProperty("currRecInd")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_CURR_REC_IND")
    private String currRecInd;
    /**
     * SAR EFC
     * <p>
     * Lineage reference object : RCVAPPL_PELL_PGI
     * 
     */
    @JsonProperty("pellPgi")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_PELL_PGI")
    private Double pellPgi;
    /**
     * Transaction Number
     * <p>
     * Lineage reference object : RCVAPPL_USED_TRANS_NO
     * 
     */
    @JsonProperty("usedTransNo")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_USED_TRANS_NO")
    private String usedTransNo;
    /**
     * CSS Active
     * <p>
     * Lineage reference object : RCVAPPL_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_ACTIVE_IND")
    private String activeInd;
    /**
     * Primary Pell EFC
     * <p>
     * Lineage reference object : RCVAPPL_PGI
     * 
     */
    @JsonProperty("pgi")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_PGI")
    private Double pgi;
    /**
     * Primary System EFC
     * <p>
     * Lineage reference object : RCVAPPL_TFC
     * 
     */
    @JsonProperty("tfc")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_TFC")
    private Double tfc;
    /**
     * College Choice
     * <p>
     * Lineage reference object : RCVAPPL_COLL_CHOICE
     * 
     */
    @JsonProperty("collChoice")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_COLL_CHOICE")
    private String collChoice;
    /**
     * Date Created
     * <p>
     * Lineage reference object : RCVAPPL_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_CREATE_DATE")
    private Date createDate;
    /**
     * Date Updated
     * <p>
     * Lineage reference object : RCVAPPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RCVAPPL_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    @JsonProperty("keyblckStudentId")
    public String getKeyblckStudentId() {
        return keyblckStudentId;
    }

    @JsonProperty("keyblckStudentId")
    public void setKeyblckStudentId(String keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withKeyblckStudentId(String keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    /**
     * Application Source
     * <p>
     * Lineage reference object : RCVAPPL_INFC_CODE
     * 
     */
    @JsonProperty("infcCode")
    public String getInfcCode() {
        return infcCode;
    }

    /**
     * Application Source
     * <p>
     * Lineage reference object : RCVAPPL_INFC_CODE
     * 
     */
    @JsonProperty("infcCode")
    public void setInfcCode(String infcCode) {
        this.infcCode = infcCode;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withInfcCode(String infcCode) {
        this.infcCode = infcCode;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : RCVAPPL_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : RCVAPPL_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Current Record
     * <p>
     * Lineage reference object : RCVAPPL_CURR_REC_IND
     * 
     */
    @JsonProperty("currRecInd")
    public String getCurrRecInd() {
        return currRecInd;
    }

    /**
     * Current Record
     * <p>
     * Lineage reference object : RCVAPPL_CURR_REC_IND
     * 
     */
    @JsonProperty("currRecInd")
    public void setCurrRecInd(String currRecInd) {
        this.currRecInd = currRecInd;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withCurrRecInd(String currRecInd) {
        this.currRecInd = currRecInd;
        return this;
    }

    /**
     * SAR EFC
     * <p>
     * Lineage reference object : RCVAPPL_PELL_PGI
     * 
     */
    @JsonProperty("pellPgi")
    public Double getPellPgi() {
        return pellPgi;
    }

    /**
     * SAR EFC
     * <p>
     * Lineage reference object : RCVAPPL_PELL_PGI
     * 
     */
    @JsonProperty("pellPgi")
    public void setPellPgi(Double pellPgi) {
        this.pellPgi = pellPgi;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withPellPgi(Double pellPgi) {
        this.pellPgi = pellPgi;
        return this;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : RCVAPPL_USED_TRANS_NO
     * 
     */
    @JsonProperty("usedTransNo")
    public String getUsedTransNo() {
        return usedTransNo;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : RCVAPPL_USED_TRANS_NO
     * 
     */
    @JsonProperty("usedTransNo")
    public void setUsedTransNo(String usedTransNo) {
        this.usedTransNo = usedTransNo;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withUsedTransNo(String usedTransNo) {
        this.usedTransNo = usedTransNo;
        return this;
    }

    /**
     * CSS Active
     * <p>
     * Lineage reference object : RCVAPPL_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * CSS Active
     * <p>
     * Lineage reference object : RCVAPPL_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Primary Pell EFC
     * <p>
     * Lineage reference object : RCVAPPL_PGI
     * 
     */
    @JsonProperty("pgi")
    public Double getPgi() {
        return pgi;
    }

    /**
     * Primary Pell EFC
     * <p>
     * Lineage reference object : RCVAPPL_PGI
     * 
     */
    @JsonProperty("pgi")
    public void setPgi(Double pgi) {
        this.pgi = pgi;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withPgi(Double pgi) {
        this.pgi = pgi;
        return this;
    }

    /**
     * Primary System EFC
     * <p>
     * Lineage reference object : RCVAPPL_TFC
     * 
     */
    @JsonProperty("tfc")
    public Double getTfc() {
        return tfc;
    }

    /**
     * Primary System EFC
     * <p>
     * Lineage reference object : RCVAPPL_TFC
     * 
     */
    @JsonProperty("tfc")
    public void setTfc(Double tfc) {
        this.tfc = tfc;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withTfc(Double tfc) {
        this.tfc = tfc;
        return this;
    }

    /**
     * College Choice
     * <p>
     * Lineage reference object : RCVAPPL_COLL_CHOICE
     * 
     */
    @JsonProperty("collChoice")
    public String getCollChoice() {
        return collChoice;
    }

    /**
     * College Choice
     * <p>
     * Lineage reference object : RCVAPPL_COLL_CHOICE
     * 
     */
    @JsonProperty("collChoice")
    public void setCollChoice(String collChoice) {
        this.collChoice = collChoice;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withCollChoice(String collChoice) {
        this.collChoice = collChoice;
        return this;
    }

    /**
     * Date Created
     * <p>
     * Lineage reference object : RCVAPPL_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Date Created
     * <p>
     * Lineage reference object : RCVAPPL_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Date Updated
     * <p>
     * Lineage reference object : RCVAPPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Date Updated
     * <p>
     * Lineage reference object : RCVAPPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public ApplicantNeedAnalysisApplicationInquiry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantNeedAnalysisApplicationInquiry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
        sb.append(',');
        sb.append("infcCode");
        sb.append('=');
        sb.append(((this.infcCode == null)?"<null>":this.infcCode));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("currRecInd");
        sb.append('=');
        sb.append(((this.currRecInd == null)?"<null>":this.currRecInd));
        sb.append(',');
        sb.append("pellPgi");
        sb.append('=');
        sb.append(((this.pellPgi == null)?"<null>":this.pellPgi));
        sb.append(',');
        sb.append("usedTransNo");
        sb.append('=');
        sb.append(((this.usedTransNo == null)?"<null>":this.usedTransNo));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("pgi");
        sb.append('=');
        sb.append(((this.pgi == null)?"<null>":this.pgi));
        sb.append(',');
        sb.append("tfc");
        sb.append('=');
        sb.append(((this.tfc == null)?"<null>":this.tfc));
        sb.append(',');
        sb.append("collChoice");
        sb.append('=');
        sb.append(((this.collChoice == null)?"<null>":this.collChoice));
        sb.append(',');
        sb.append("createDate");
        sb.append('=');
        sb.append(((this.createDate == null)?"<null>":this.createDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.infcCode == null)? 0 :this.infcCode.hashCode()));
        result = ((result* 31)+((this.currRecInd == null)? 0 :this.currRecInd.hashCode()));
        result = ((result* 31)+((this.pellPgi == null)? 0 :this.pellPgi.hashCode()));
        result = ((result* 31)+((this.tfc == null)? 0 :this.tfc.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.pgi == null)? 0 :this.pgi.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.keyblckStudentId == null)? 0 :this.keyblckStudentId.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.collChoice == null)? 0 :this.collChoice.hashCode()));
        result = ((result* 31)+((this.usedTransNo == null)? 0 :this.usedTransNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.createDate == null)? 0 :this.createDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantNeedAnalysisApplicationInquiry100QapiPost) == false) {
            return false;
        }
        ApplicantNeedAnalysisApplicationInquiry100QapiPost rhs = ((ApplicantNeedAnalysisApplicationInquiry100QapiPost) other);
        return (((((((((((((((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo)))&&((this.infcCode == rhs.infcCode)||((this.infcCode!= null)&&this.infcCode.equals(rhs.infcCode))))&&((this.currRecInd == rhs.currRecInd)||((this.currRecInd!= null)&&this.currRecInd.equals(rhs.currRecInd))))&&((this.pellPgi == rhs.pellPgi)||((this.pellPgi!= null)&&this.pellPgi.equals(rhs.pellPgi))))&&((this.tfc == rhs.tfc)||((this.tfc!= null)&&this.tfc.equals(rhs.tfc))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.pgi == rhs.pgi)||((this.pgi!= null)&&this.pgi.equals(rhs.pgi))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.collChoice == rhs.collChoice)||((this.collChoice!= null)&&this.collChoice.equals(rhs.collChoice))))&&((this.usedTransNo == rhs.usedTransNo)||((this.usedTransNo!= null)&&this.usedTransNo.equals(rhs.usedTransNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.createDate == rhs.createDate)||((this.createDate!= null)&&this.createDate.equals(rhs.createDate))));
    }

}
