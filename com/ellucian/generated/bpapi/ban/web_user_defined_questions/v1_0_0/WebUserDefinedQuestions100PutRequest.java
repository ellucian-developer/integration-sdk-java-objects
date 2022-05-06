
package com.ellucian.generated.bpapi.ban.web_user_defined_questions.v1_0_0;

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
    "criteria.qstnCde",
    "criteria.admrCode",
    "criteria.yesNoQstnInd",
    "criteria.activityDate",
    "question",
    "criteria.question",
    "wappCode",
    "criteria.seqno",
    "criteria.wappCode",
    "yesNoQstnInd"
})
@Generated("jsonschema2pojo")
public class WebUserDefinedQuestions100PutRequest {

    /**
     * EDI Question Code
     * <p>
     * Lineage reference object : SARWUDQ_QSTN_CDE
     * 
     */
    @JsonProperty("criteria.qstnCde")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_QSTN_CDE")
    private String criteriaQstnCde;
    /**
     * Admission Request Code
     * <p>
     * Lineage reference object : SARWUDQ_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String criteriaAdmrCode;
    /**
     * Lineage reference object : SARWUDQ_YES_NO_QSTN_IND
     * 
     */
    @JsonProperty("criteria.yesNoQstnInd")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_YES_NO_QSTN_IND")
    private String criteriaYesNoQstnInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARWUDQ_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Question Text
     * <p>
     * Lineage reference object : SARWUDQ_QUESTION
     * (Required)
     * 
     */
    @JsonProperty("question")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_QUESTION")
    private String question;
    /**
     * Question Text
     * <p>
     * Lineage reference object : SARWUDQ_QUESTION
     * (Required)
     * 
     */
    @JsonProperty("criteria.question")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_QUESTION")
    private String criteriaQuestion;
    /**
     * Application Type
     * <p>
     * Lineage reference object : SARWUDQ_WAPP_CODE, Lookup lineage reference object : stvwapp
     * (Required)
     * 
     */
    @JsonProperty("wappCode")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_WAPP_CODE, Lookup lineage reference object : stvwapp")
    private String wappCode;
    /**
     * Ordering Sequence
     * <p>
     * Lineage reference object : SARWUDQ_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqno")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_SEQNO")
    private Double criteriaSeqno;
    /**
     * Application Type
     * <p>
     * Lineage reference object : SARWUDQ_WAPP_CODE, Lookup lineage reference object : stvwapp
     * (Required)
     * 
     */
    @JsonProperty("criteria.wappCode")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_WAPP_CODE, Lookup lineage reference object : stvwapp")
    private String criteriaWappCode;
    /**
     * Lineage reference object : SARWUDQ_YES_NO_QSTN_IND
     * 
     */
    @JsonProperty("yesNoQstnInd")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_YES_NO_QSTN_IND")
    private String yesNoQstnInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * EDI Question Code
     * <p>
     * Lineage reference object : SARWUDQ_QSTN_CDE
     * 
     */
    @JsonProperty("criteria.qstnCde")
    public String getCriteriaQstnCde() {
        return criteriaQstnCde;
    }

    /**
     * EDI Question Code
     * <p>
     * Lineage reference object : SARWUDQ_QSTN_CDE
     * 
     */
    @JsonProperty("criteria.qstnCde")
    public void setCriteriaQstnCde(String criteriaQstnCde) {
        this.criteriaQstnCde = criteriaQstnCde;
    }

    public WebUserDefinedQuestions100PutRequest withCriteriaQstnCde(String criteriaQstnCde) {
        this.criteriaQstnCde = criteriaQstnCde;
        return this;
    }

    /**
     * Admission Request Code
     * <p>
     * Lineage reference object : SARWUDQ_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public String getCriteriaAdmrCode() {
        return criteriaAdmrCode;
    }

    /**
     * Admission Request Code
     * <p>
     * Lineage reference object : SARWUDQ_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public void setCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
    }

    public WebUserDefinedQuestions100PutRequest withCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
        return this;
    }

    /**
     * Lineage reference object : SARWUDQ_YES_NO_QSTN_IND
     * 
     */
    @JsonProperty("criteria.yesNoQstnInd")
    public String getCriteriaYesNoQstnInd() {
        return criteriaYesNoQstnInd;
    }

    /**
     * Lineage reference object : SARWUDQ_YES_NO_QSTN_IND
     * 
     */
    @JsonProperty("criteria.yesNoQstnInd")
    public void setCriteriaYesNoQstnInd(String criteriaYesNoQstnInd) {
        this.criteriaYesNoQstnInd = criteriaYesNoQstnInd;
    }

    public WebUserDefinedQuestions100PutRequest withCriteriaYesNoQstnInd(String criteriaYesNoQstnInd) {
        this.criteriaYesNoQstnInd = criteriaYesNoQstnInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARWUDQ_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARWUDQ_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public WebUserDefinedQuestions100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Question Text
     * <p>
     * Lineage reference object : SARWUDQ_QUESTION
     * (Required)
     * 
     */
    @JsonProperty("question")
    public String getQuestion() {
        return question;
    }

    /**
     * Question Text
     * <p>
     * Lineage reference object : SARWUDQ_QUESTION
     * (Required)
     * 
     */
    @JsonProperty("question")
    public void setQuestion(String question) {
        this.question = question;
    }

    public WebUserDefinedQuestions100PutRequest withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * Question Text
     * <p>
     * Lineage reference object : SARWUDQ_QUESTION
     * (Required)
     * 
     */
    @JsonProperty("criteria.question")
    public String getCriteriaQuestion() {
        return criteriaQuestion;
    }

    /**
     * Question Text
     * <p>
     * Lineage reference object : SARWUDQ_QUESTION
     * (Required)
     * 
     */
    @JsonProperty("criteria.question")
    public void setCriteriaQuestion(String criteriaQuestion) {
        this.criteriaQuestion = criteriaQuestion;
    }

    public WebUserDefinedQuestions100PutRequest withCriteriaQuestion(String criteriaQuestion) {
        this.criteriaQuestion = criteriaQuestion;
        return this;
    }

    /**
     * Application Type
     * <p>
     * Lineage reference object : SARWUDQ_WAPP_CODE, Lookup lineage reference object : stvwapp
     * (Required)
     * 
     */
    @JsonProperty("wappCode")
    public String getWappCode() {
        return wappCode;
    }

    /**
     * Application Type
     * <p>
     * Lineage reference object : SARWUDQ_WAPP_CODE, Lookup lineage reference object : stvwapp
     * (Required)
     * 
     */
    @JsonProperty("wappCode")
    public void setWappCode(String wappCode) {
        this.wappCode = wappCode;
    }

    public WebUserDefinedQuestions100PutRequest withWappCode(String wappCode) {
        this.wappCode = wappCode;
        return this;
    }

    /**
     * Ordering Sequence
     * <p>
     * Lineage reference object : SARWUDQ_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqno")
    public Double getCriteriaSeqno() {
        return criteriaSeqno;
    }

    /**
     * Ordering Sequence
     * <p>
     * Lineage reference object : SARWUDQ_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqno")
    public void setCriteriaSeqno(Double criteriaSeqno) {
        this.criteriaSeqno = criteriaSeqno;
    }

    public WebUserDefinedQuestions100PutRequest withCriteriaSeqno(Double criteriaSeqno) {
        this.criteriaSeqno = criteriaSeqno;
        return this;
    }

    /**
     * Application Type
     * <p>
     * Lineage reference object : SARWUDQ_WAPP_CODE, Lookup lineage reference object : stvwapp
     * (Required)
     * 
     */
    @JsonProperty("criteria.wappCode")
    public String getCriteriaWappCode() {
        return criteriaWappCode;
    }

    /**
     * Application Type
     * <p>
     * Lineage reference object : SARWUDQ_WAPP_CODE, Lookup lineage reference object : stvwapp
     * (Required)
     * 
     */
    @JsonProperty("criteria.wappCode")
    public void setCriteriaWappCode(String criteriaWappCode) {
        this.criteriaWappCode = criteriaWappCode;
    }

    public WebUserDefinedQuestions100PutRequest withCriteriaWappCode(String criteriaWappCode) {
        this.criteriaWappCode = criteriaWappCode;
        return this;
    }

    /**
     * Lineage reference object : SARWUDQ_YES_NO_QSTN_IND
     * 
     */
    @JsonProperty("yesNoQstnInd")
    public String getYesNoQstnInd() {
        return yesNoQstnInd;
    }

    /**
     * Lineage reference object : SARWUDQ_YES_NO_QSTN_IND
     * 
     */
    @JsonProperty("yesNoQstnInd")
    public void setYesNoQstnInd(String yesNoQstnInd) {
        this.yesNoQstnInd = yesNoQstnInd;
    }

    public WebUserDefinedQuestions100PutRequest withYesNoQstnInd(String yesNoQstnInd) {
        this.yesNoQstnInd = yesNoQstnInd;
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

    public WebUserDefinedQuestions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebUserDefinedQuestions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaQstnCde");
        sb.append('=');
        sb.append(((this.criteriaQstnCde == null)?"<null>":this.criteriaQstnCde));
        sb.append(',');
        sb.append("criteriaAdmrCode");
        sb.append('=');
        sb.append(((this.criteriaAdmrCode == null)?"<null>":this.criteriaAdmrCode));
        sb.append(',');
        sb.append("criteriaYesNoQstnInd");
        sb.append('=');
        sb.append(((this.criteriaYesNoQstnInd == null)?"<null>":this.criteriaYesNoQstnInd));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("question");
        sb.append('=');
        sb.append(((this.question == null)?"<null>":this.question));
        sb.append(',');
        sb.append("criteriaQuestion");
        sb.append('=');
        sb.append(((this.criteriaQuestion == null)?"<null>":this.criteriaQuestion));
        sb.append(',');
        sb.append("wappCode");
        sb.append('=');
        sb.append(((this.wappCode == null)?"<null>":this.wappCode));
        sb.append(',');
        sb.append("criteriaSeqno");
        sb.append('=');
        sb.append(((this.criteriaSeqno == null)?"<null>":this.criteriaSeqno));
        sb.append(',');
        sb.append("criteriaWappCode");
        sb.append('=');
        sb.append(((this.criteriaWappCode == null)?"<null>":this.criteriaWappCode));
        sb.append(',');
        sb.append("yesNoQstnInd");
        sb.append('=');
        sb.append(((this.yesNoQstnInd == null)?"<null>":this.yesNoQstnInd));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaQstnCde == null)? 0 :this.criteriaQstnCde.hashCode()));
        result = ((result* 31)+((this.question == null)? 0 :this.question.hashCode()));
        result = ((result* 31)+((this.criteriaAdmrCode == null)? 0 :this.criteriaAdmrCode.hashCode()));
        result = ((result* 31)+((this.wappCode == null)? 0 :this.wappCode.hashCode()));
        result = ((result* 31)+((this.criteriaSeqno == null)? 0 :this.criteriaSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaQuestion == null)? 0 :this.criteriaQuestion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.yesNoQstnInd == null)? 0 :this.yesNoQstnInd.hashCode()));
        result = ((result* 31)+((this.criteriaWappCode == null)? 0 :this.criteriaWappCode.hashCode()));
        result = ((result* 31)+((this.criteriaYesNoQstnInd == null)? 0 :this.criteriaYesNoQstnInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebUserDefinedQuestions100PutRequest) == false) {
            return false;
        }
        WebUserDefinedQuestions100PutRequest rhs = ((WebUserDefinedQuestions100PutRequest) other);
        return ((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaQstnCde == rhs.criteriaQstnCde)||((this.criteriaQstnCde!= null)&&this.criteriaQstnCde.equals(rhs.criteriaQstnCde))))&&((this.question == rhs.question)||((this.question!= null)&&this.question.equals(rhs.question))))&&((this.criteriaAdmrCode == rhs.criteriaAdmrCode)||((this.criteriaAdmrCode!= null)&&this.criteriaAdmrCode.equals(rhs.criteriaAdmrCode))))&&((this.wappCode == rhs.wappCode)||((this.wappCode!= null)&&this.wappCode.equals(rhs.wappCode))))&&((this.criteriaSeqno == rhs.criteriaSeqno)||((this.criteriaSeqno!= null)&&this.criteriaSeqno.equals(rhs.criteriaSeqno))))&&((this.criteriaQuestion == rhs.criteriaQuestion)||((this.criteriaQuestion!= null)&&this.criteriaQuestion.equals(rhs.criteriaQuestion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.yesNoQstnInd == rhs.yesNoQstnInd)||((this.yesNoQstnInd!= null)&&this.yesNoQstnInd.equals(rhs.yesNoQstnInd))))&&((this.criteriaWappCode == rhs.criteriaWappCode)||((this.criteriaWappCode!= null)&&this.criteriaWappCode.equals(rhs.criteriaWappCode))))&&((this.criteriaYesNoQstnInd == rhs.criteriaYesNoQstnInd)||((this.criteriaYesNoQstnInd!= null)&&this.criteriaYesNoQstnInd.equals(rhs.criteriaYesNoQstnInd))));
    }

}
