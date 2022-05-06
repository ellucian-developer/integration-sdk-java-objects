
package com.ellucian.generated.bpapi.ban.web_user_defined_questions.v1_0_0;

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
    "admrCode",
    "seqno",
    "question",
    "wappCode",
    "qstnCde",
    "yesNoQstnInd"
})
@Generated("jsonschema2pojo")
public class WebUserDefinedQuestions100PostRequest {

    /**
     * Admission Request Code
     * <p>
     * Lineage reference object : SARWUDQ_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Ordering Sequence
     * <p>
     * Lineage reference object : SARWUDQ_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("seqno")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_SEQNO")
    private Double seqno;
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
     * EDI Question Code
     * <p>
     * Lineage reference object : SARWUDQ_QSTN_CDE
     * 
     */
    @JsonProperty("qstnCde")
    @JsonPropertyDescription("Lineage reference object : SARWUDQ_QSTN_CDE")
    private String qstnCde;
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
     * Admission Request Code
     * <p>
     * Lineage reference object : SARWUDQ_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admission Request Code
     * <p>
     * Lineage reference object : SARWUDQ_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public WebUserDefinedQuestions100PostRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Ordering Sequence
     * <p>
     * Lineage reference object : SARWUDQ_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("seqno")
    public Double getSeqno() {
        return seqno;
    }

    /**
     * Ordering Sequence
     * <p>
     * Lineage reference object : SARWUDQ_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("seqno")
    public void setSeqno(Double seqno) {
        this.seqno = seqno;
    }

    public WebUserDefinedQuestions100PostRequest withSeqno(Double seqno) {
        this.seqno = seqno;
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

    public WebUserDefinedQuestions100PostRequest withQuestion(String question) {
        this.question = question;
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

    public WebUserDefinedQuestions100PostRequest withWappCode(String wappCode) {
        this.wappCode = wappCode;
        return this;
    }

    /**
     * EDI Question Code
     * <p>
     * Lineage reference object : SARWUDQ_QSTN_CDE
     * 
     */
    @JsonProperty("qstnCde")
    public String getQstnCde() {
        return qstnCde;
    }

    /**
     * EDI Question Code
     * <p>
     * Lineage reference object : SARWUDQ_QSTN_CDE
     * 
     */
    @JsonProperty("qstnCde")
    public void setQstnCde(String qstnCde) {
        this.qstnCde = qstnCde;
    }

    public WebUserDefinedQuestions100PostRequest withQstnCde(String qstnCde) {
        this.qstnCde = qstnCde;
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

    public WebUserDefinedQuestions100PostRequest withYesNoQstnInd(String yesNoQstnInd) {
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

    public WebUserDefinedQuestions100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebUserDefinedQuestions100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("question");
        sb.append('=');
        sb.append(((this.question == null)?"<null>":this.question));
        sb.append(',');
        sb.append("wappCode");
        sb.append('=');
        sb.append(((this.wappCode == null)?"<null>":this.wappCode));
        sb.append(',');
        sb.append("qstnCde");
        sb.append('=');
        sb.append(((this.qstnCde == null)?"<null>":this.qstnCde));
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
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.question == null)? 0 :this.question.hashCode()));
        result = ((result* 31)+((this.wappCode == null)? 0 :this.wappCode.hashCode()));
        result = ((result* 31)+((this.qstnCde == null)? 0 :this.qstnCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.yesNoQstnInd == null)? 0 :this.yesNoQstnInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebUserDefinedQuestions100PostRequest) == false) {
            return false;
        }
        WebUserDefinedQuestions100PostRequest rhs = ((WebUserDefinedQuestions100PostRequest) other);
        return ((((((((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode)))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.question == rhs.question)||((this.question!= null)&&this.question.equals(rhs.question))))&&((this.wappCode == rhs.wappCode)||((this.wappCode!= null)&&this.wappCode.equals(rhs.wappCode))))&&((this.qstnCde == rhs.qstnCde)||((this.qstnCde!= null)&&this.qstnCde.equals(rhs.qstnCde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.yesNoQstnInd == rhs.yesNoQstnInd)||((this.yesNoQstnInd!= null)&&this.yesNoQstnInd.equals(rhs.yesNoQstnInd))));
    }

}
