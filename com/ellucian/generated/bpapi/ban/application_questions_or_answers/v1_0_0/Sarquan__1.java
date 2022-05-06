
package com.ellucian.generated.bpapi.ban.application_questions_or_answers.v1_0_0;

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
    "longAnswer",
    "admrCode",
    "displayWebInd",
    "answer",
    "question",
    "seqno",
    "webInd",
    "stvadmrDesc"
})
@Generated("jsonschema2pojo")
public class Sarquan__1 {

    /**
     * Essay Answer
     * <p>
     * Lineage reference object : SARQUAN_LONG_ANSWER
     * 
     */
    @JsonProperty("longAnswer")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_LONG_ANSWER")
    private String longAnswer;
    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARQUAN_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Lineage reference object : SARQUAN_DISPLAY_WEB_IND
     * 
     */
    @JsonProperty("displayWebInd")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_DISPLAY_WEB_IND")
    private String displayWebInd;
    /**
     * Question Answer
     * <p>
     * Lineage reference object : SARQUAN_ANSWER
     * 
     */
    @JsonProperty("answer")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_ANSWER")
    private String answer;
    /**
     * Applicant Question
     * <p>
     * Lineage reference object : SARQUAN_QUESTION
     * 
     */
    @JsonProperty("question")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_QUESTION")
    private String question;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SARQUAN_SEQNO
     * 
     */
    @JsonProperty("seqno")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_SEQNO")
    private Double seqno;
    /**
     * Lineage reference object : SARQUAN_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_WEB_IND")
    private String webInd;
    @JsonProperty("stvadmrDesc")
    private String stvadmrDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Essay Answer
     * <p>
     * Lineage reference object : SARQUAN_LONG_ANSWER
     * 
     */
    @JsonProperty("longAnswer")
    public String getLongAnswer() {
        return longAnswer;
    }

    /**
     * Essay Answer
     * <p>
     * Lineage reference object : SARQUAN_LONG_ANSWER
     * 
     */
    @JsonProperty("longAnswer")
    public void setLongAnswer(String longAnswer) {
        this.longAnswer = longAnswer;
    }

    public Sarquan__1 withLongAnswer(String longAnswer) {
        this.longAnswer = longAnswer;
        return this;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARQUAN_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARQUAN_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public Sarquan__1 withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Lineage reference object : SARQUAN_DISPLAY_WEB_IND
     * 
     */
    @JsonProperty("displayWebInd")
    public String getDisplayWebInd() {
        return displayWebInd;
    }

    /**
     * Lineage reference object : SARQUAN_DISPLAY_WEB_IND
     * 
     */
    @JsonProperty("displayWebInd")
    public void setDisplayWebInd(String displayWebInd) {
        this.displayWebInd = displayWebInd;
    }

    public Sarquan__1 withDisplayWebInd(String displayWebInd) {
        this.displayWebInd = displayWebInd;
        return this;
    }

    /**
     * Question Answer
     * <p>
     * Lineage reference object : SARQUAN_ANSWER
     * 
     */
    @JsonProperty("answer")
    public String getAnswer() {
        return answer;
    }

    /**
     * Question Answer
     * <p>
     * Lineage reference object : SARQUAN_ANSWER
     * 
     */
    @JsonProperty("answer")
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Sarquan__1 withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * Applicant Question
     * <p>
     * Lineage reference object : SARQUAN_QUESTION
     * 
     */
    @JsonProperty("question")
    public String getQuestion() {
        return question;
    }

    /**
     * Applicant Question
     * <p>
     * Lineage reference object : SARQUAN_QUESTION
     * 
     */
    @JsonProperty("question")
    public void setQuestion(String question) {
        this.question = question;
    }

    public Sarquan__1 withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SARQUAN_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public Double getSeqno() {
        return seqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SARQUAN_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public void setSeqno(Double seqno) {
        this.seqno = seqno;
    }

    public Sarquan__1 withSeqno(Double seqno) {
        this.seqno = seqno;
        return this;
    }

    /**
     * Lineage reference object : SARQUAN_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    public String getWebInd() {
        return webInd;
    }

    /**
     * Lineage reference object : SARQUAN_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    public void setWebInd(String webInd) {
        this.webInd = webInd;
    }

    public Sarquan__1 withWebInd(String webInd) {
        this.webInd = webInd;
        return this;
    }

    @JsonProperty("stvadmrDesc")
    public String getStvadmrDesc() {
        return stvadmrDesc;
    }

    @JsonProperty("stvadmrDesc")
    public void setStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
    }

    public Sarquan__1 withStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
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

    public Sarquan__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sarquan__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("longAnswer");
        sb.append('=');
        sb.append(((this.longAnswer == null)?"<null>":this.longAnswer));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("displayWebInd");
        sb.append('=');
        sb.append(((this.displayWebInd == null)?"<null>":this.displayWebInd));
        sb.append(',');
        sb.append("answer");
        sb.append('=');
        sb.append(((this.answer == null)?"<null>":this.answer));
        sb.append(',');
        sb.append("question");
        sb.append('=');
        sb.append(((this.question == null)?"<null>":this.question));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("webInd");
        sb.append('=');
        sb.append(((this.webInd == null)?"<null>":this.webInd));
        sb.append(',');
        sb.append("stvadmrDesc");
        sb.append('=');
        sb.append(((this.stvadmrDesc == null)?"<null>":this.stvadmrDesc));
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
        result = ((result* 31)+((this.longAnswer == null)? 0 :this.longAnswer.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.displayWebInd == null)? 0 :this.displayWebInd.hashCode()));
        result = ((result* 31)+((this.answer == null)? 0 :this.answer.hashCode()));
        result = ((result* 31)+((this.question == null)? 0 :this.question.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.webInd == null)? 0 :this.webInd.hashCode()));
        result = ((result* 31)+((this.stvadmrDesc == null)? 0 :this.stvadmrDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sarquan__1) == false) {
            return false;
        }
        Sarquan__1 rhs = ((Sarquan__1) other);
        return ((((((((((this.longAnswer == rhs.longAnswer)||((this.longAnswer!= null)&&this.longAnswer.equals(rhs.longAnswer)))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.displayWebInd == rhs.displayWebInd)||((this.displayWebInd!= null)&&this.displayWebInd.equals(rhs.displayWebInd))))&&((this.answer == rhs.answer)||((this.answer!= null)&&this.answer.equals(rhs.answer))))&&((this.question == rhs.question)||((this.question!= null)&&this.question.equals(rhs.question))))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.webInd == rhs.webInd)||((this.webInd!= null)&&this.webInd.equals(rhs.webInd))))&&((this.stvadmrDesc == rhs.stvadmrDesc)||((this.stvadmrDesc!= null)&&this.stvadmrDesc.equals(rhs.stvadmrDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
