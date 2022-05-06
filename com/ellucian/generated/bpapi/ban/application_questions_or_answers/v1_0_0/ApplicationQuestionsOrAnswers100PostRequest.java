
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
    "question",
    "answer",
    "keyblocTermCode",
    "id"
})
@Generated("jsonschema2pojo")
public class ApplicationQuestionsOrAnswers100PostRequest {

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
     * Applicant Question
     * <p>
     * Lineage reference object : SARQUAN_QUESTION
     * 
     */
    @JsonProperty("question")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_QUESTION")
    private String question;
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
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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

    public ApplicationQuestionsOrAnswers100PostRequest withLongAnswer(String longAnswer) {
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

    public ApplicationQuestionsOrAnswers100PostRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
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

    public ApplicationQuestionsOrAnswers100PostRequest withQuestion(String question) {
        this.question = question;
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

    public ApplicationQuestionsOrAnswers100PostRequest withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ApplicationQuestionsOrAnswers100PostRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public ApplicationQuestionsOrAnswers100PostRequest withId(Object id) {
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

    public ApplicationQuestionsOrAnswers100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationQuestionsOrAnswers100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("longAnswer");
        sb.append('=');
        sb.append(((this.longAnswer == null)?"<null>":this.longAnswer));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("question");
        sb.append('=');
        sb.append(((this.question == null)?"<null>":this.question));
        sb.append(',');
        sb.append("answer");
        sb.append('=');
        sb.append(((this.answer == null)?"<null>":this.answer));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
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
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.question == null)? 0 :this.question.hashCode()));
        result = ((result* 31)+((this.answer == null)? 0 :this.answer.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationQuestionsOrAnswers100PostRequest) == false) {
            return false;
        }
        ApplicationQuestionsOrAnswers100PostRequest rhs = ((ApplicationQuestionsOrAnswers100PostRequest) other);
        return ((((((((this.longAnswer == rhs.longAnswer)||((this.longAnswer!= null)&&this.longAnswer.equals(rhs.longAnswer)))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.question == rhs.question)||((this.question!= null)&&this.question.equals(rhs.question))))&&((this.answer == rhs.answer)||((this.answer!= null)&&this.answer.equals(rhs.answer))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
