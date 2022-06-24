
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
    "criteria.admrCode",
    "criteria.webInd",
    "question",
    "keyblocTermCode",
    "criteria.displayWebInd",
    "admrCode",
    "answer",
    "criteria.question",
    "criteria.seqno",
    "criteria.answer",
    "criteria.longAnswer",
    "id"
})
@Generated("jsonschema2pojo")
public class ApplicationQuestionsOrAnswers100PutRequest {

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
    @JsonProperty("criteria.admrCode")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String criteriaAdmrCode;
    /**
     * Lineage reference object : SARQUAN_WEB_IND
     * 
     */
    @JsonProperty("criteria.webInd")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_WEB_IND")
    private String criteriaWebInd;
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
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Lineage reference object : SARQUAN_DISPLAY_WEB_IND
     * 
     */
    @JsonProperty("criteria.displayWebInd")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_DISPLAY_WEB_IND")
    private String criteriaDisplayWebInd;
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
    @JsonProperty("criteria.question")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_QUESTION")
    private String criteriaQuestion;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SARQUAN_SEQNO
     * 
     */
    @JsonProperty("criteria.seqno")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_SEQNO")
    private Double criteriaSeqno;
    /**
     * Question Answer
     * <p>
     * Lineage reference object : SARQUAN_ANSWER
     * 
     */
    @JsonProperty("criteria.answer")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_ANSWER")
    private String criteriaAnswer;
    /**
     * Essay Answer
     * <p>
     * Lineage reference object : SARQUAN_LONG_ANSWER
     * 
     */
    @JsonProperty("criteria.longAnswer")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_LONG_ANSWER")
    private String criteriaLongAnswer;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
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

    public ApplicationQuestionsOrAnswers100PutRequest withLongAnswer(String longAnswer) {
        this.longAnswer = longAnswer;
        return this;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARQUAN_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public String getCriteriaAdmrCode() {
        return criteriaAdmrCode;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARQUAN_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public void setCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
    }

    public ApplicationQuestionsOrAnswers100PutRequest withCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
        return this;
    }

    /**
     * Lineage reference object : SARQUAN_WEB_IND
     * 
     */
    @JsonProperty("criteria.webInd")
    public String getCriteriaWebInd() {
        return criteriaWebInd;
    }

    /**
     * Lineage reference object : SARQUAN_WEB_IND
     * 
     */
    @JsonProperty("criteria.webInd")
    public void setCriteriaWebInd(String criteriaWebInd) {
        this.criteriaWebInd = criteriaWebInd;
    }

    public ApplicationQuestionsOrAnswers100PutRequest withCriteriaWebInd(String criteriaWebInd) {
        this.criteriaWebInd = criteriaWebInd;
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

    public ApplicationQuestionsOrAnswers100PutRequest withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ApplicationQuestionsOrAnswers100PutRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Lineage reference object : SARQUAN_DISPLAY_WEB_IND
     * 
     */
    @JsonProperty("criteria.displayWebInd")
    public String getCriteriaDisplayWebInd() {
        return criteriaDisplayWebInd;
    }

    /**
     * Lineage reference object : SARQUAN_DISPLAY_WEB_IND
     * 
     */
    @JsonProperty("criteria.displayWebInd")
    public void setCriteriaDisplayWebInd(String criteriaDisplayWebInd) {
        this.criteriaDisplayWebInd = criteriaDisplayWebInd;
    }

    public ApplicationQuestionsOrAnswers100PutRequest withCriteriaDisplayWebInd(String criteriaDisplayWebInd) {
        this.criteriaDisplayWebInd = criteriaDisplayWebInd;
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

    public ApplicationQuestionsOrAnswers100PutRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
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

    public ApplicationQuestionsOrAnswers100PutRequest withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * Applicant Question
     * <p>
     * Lineage reference object : SARQUAN_QUESTION
     * 
     */
    @JsonProperty("criteria.question")
    public String getCriteriaQuestion() {
        return criteriaQuestion;
    }

    /**
     * Applicant Question
     * <p>
     * Lineage reference object : SARQUAN_QUESTION
     * 
     */
    @JsonProperty("criteria.question")
    public void setCriteriaQuestion(String criteriaQuestion) {
        this.criteriaQuestion = criteriaQuestion;
    }

    public ApplicationQuestionsOrAnswers100PutRequest withCriteriaQuestion(String criteriaQuestion) {
        this.criteriaQuestion = criteriaQuestion;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SARQUAN_SEQNO
     * 
     */
    @JsonProperty("criteria.seqno")
    public Double getCriteriaSeqno() {
        return criteriaSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SARQUAN_SEQNO
     * 
     */
    @JsonProperty("criteria.seqno")
    public void setCriteriaSeqno(Double criteriaSeqno) {
        this.criteriaSeqno = criteriaSeqno;
    }

    public ApplicationQuestionsOrAnswers100PutRequest withCriteriaSeqno(Double criteriaSeqno) {
        this.criteriaSeqno = criteriaSeqno;
        return this;
    }

    /**
     * Question Answer
     * <p>
     * Lineage reference object : SARQUAN_ANSWER
     * 
     */
    @JsonProperty("criteria.answer")
    public String getCriteriaAnswer() {
        return criteriaAnswer;
    }

    /**
     * Question Answer
     * <p>
     * Lineage reference object : SARQUAN_ANSWER
     * 
     */
    @JsonProperty("criteria.answer")
    public void setCriteriaAnswer(String criteriaAnswer) {
        this.criteriaAnswer = criteriaAnswer;
    }

    public ApplicationQuestionsOrAnswers100PutRequest withCriteriaAnswer(String criteriaAnswer) {
        this.criteriaAnswer = criteriaAnswer;
        return this;
    }

    /**
     * Essay Answer
     * <p>
     * Lineage reference object : SARQUAN_LONG_ANSWER
     * 
     */
    @JsonProperty("criteria.longAnswer")
    public String getCriteriaLongAnswer() {
        return criteriaLongAnswer;
    }

    /**
     * Essay Answer
     * <p>
     * Lineage reference object : SARQUAN_LONG_ANSWER
     * 
     */
    @JsonProperty("criteria.longAnswer")
    public void setCriteriaLongAnswer(String criteriaLongAnswer) {
        this.criteriaLongAnswer = criteriaLongAnswer;
    }

    public ApplicationQuestionsOrAnswers100PutRequest withCriteriaLongAnswer(String criteriaLongAnswer) {
        this.criteriaLongAnswer = criteriaLongAnswer;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApplicationQuestionsOrAnswers100PutRequest withId(String id) {
        this.id = id;
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

    public ApplicationQuestionsOrAnswers100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationQuestionsOrAnswers100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("longAnswer");
        sb.append('=');
        sb.append(((this.longAnswer == null)?"<null>":this.longAnswer));
        sb.append(',');
        sb.append("criteriaAdmrCode");
        sb.append('=');
        sb.append(((this.criteriaAdmrCode == null)?"<null>":this.criteriaAdmrCode));
        sb.append(',');
        sb.append("criteriaWebInd");
        sb.append('=');
        sb.append(((this.criteriaWebInd == null)?"<null>":this.criteriaWebInd));
        sb.append(',');
        sb.append("question");
        sb.append('=');
        sb.append(((this.question == null)?"<null>":this.question));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("criteriaDisplayWebInd");
        sb.append('=');
        sb.append(((this.criteriaDisplayWebInd == null)?"<null>":this.criteriaDisplayWebInd));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("answer");
        sb.append('=');
        sb.append(((this.answer == null)?"<null>":this.answer));
        sb.append(',');
        sb.append("criteriaQuestion");
        sb.append('=');
        sb.append(((this.criteriaQuestion == null)?"<null>":this.criteriaQuestion));
        sb.append(',');
        sb.append("criteriaSeqno");
        sb.append('=');
        sb.append(((this.criteriaSeqno == null)?"<null>":this.criteriaSeqno));
        sb.append(',');
        sb.append("criteriaAnswer");
        sb.append('=');
        sb.append(((this.criteriaAnswer == null)?"<null>":this.criteriaAnswer));
        sb.append(',');
        sb.append("criteriaLongAnswer");
        sb.append('=');
        sb.append(((this.criteriaLongAnswer == null)?"<null>":this.criteriaLongAnswer));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.criteriaLongAnswer == null)? 0 :this.criteriaLongAnswer.hashCode()));
        result = ((result* 31)+((this.question == null)? 0 :this.question.hashCode()));
        result = ((result* 31)+((this.criteriaAdmrCode == null)? 0 :this.criteriaAdmrCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaAnswer == null)? 0 :this.criteriaAnswer.hashCode()));
        result = ((result* 31)+((this.criteriaQuestion == null)? 0 :this.criteriaQuestion.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.criteriaWebInd == null)? 0 :this.criteriaWebInd.hashCode()));
        result = ((result* 31)+((this.answer == null)? 0 :this.answer.hashCode()));
        result = ((result* 31)+((this.criteriaSeqno == null)? 0 :this.criteriaSeqno.hashCode()));
        result = ((result* 31)+((this.criteriaDisplayWebInd == null)? 0 :this.criteriaDisplayWebInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationQuestionsOrAnswers100PutRequest) == false) {
            return false;
        }
        ApplicationQuestionsOrAnswers100PutRequest rhs = ((ApplicationQuestionsOrAnswers100PutRequest) other);
        return (((((((((((((((this.longAnswer == rhs.longAnswer)||((this.longAnswer!= null)&&this.longAnswer.equals(rhs.longAnswer)))&&((this.criteriaLongAnswer == rhs.criteriaLongAnswer)||((this.criteriaLongAnswer!= null)&&this.criteriaLongAnswer.equals(rhs.criteriaLongAnswer))))&&((this.question == rhs.question)||((this.question!= null)&&this.question.equals(rhs.question))))&&((this.criteriaAdmrCode == rhs.criteriaAdmrCode)||((this.criteriaAdmrCode!= null)&&this.criteriaAdmrCode.equals(rhs.criteriaAdmrCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.criteriaAnswer == rhs.criteriaAnswer)||((this.criteriaAnswer!= null)&&this.criteriaAnswer.equals(rhs.criteriaAnswer))))&&((this.criteriaQuestion == rhs.criteriaQuestion)||((this.criteriaQuestion!= null)&&this.criteriaQuestion.equals(rhs.criteriaQuestion))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.criteriaWebInd == rhs.criteriaWebInd)||((this.criteriaWebInd!= null)&&this.criteriaWebInd.equals(rhs.criteriaWebInd))))&&((this.answer == rhs.answer)||((this.answer!= null)&&this.answer.equals(rhs.answer))))&&((this.criteriaSeqno == rhs.criteriaSeqno)||((this.criteriaSeqno!= null)&&this.criteriaSeqno.equals(rhs.criteriaSeqno))))&&((this.criteriaDisplayWebInd == rhs.criteriaDisplayWebInd)||((this.criteriaDisplayWebInd!= null)&&this.criteriaDisplayWebInd.equals(rhs.criteriaDisplayWebInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
