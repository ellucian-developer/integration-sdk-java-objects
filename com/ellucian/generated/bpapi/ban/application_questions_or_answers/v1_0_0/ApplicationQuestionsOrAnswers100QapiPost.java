
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
    "id",
    "keyblocTermCode",
    "termCodeEntry",
    "sarappdApdcCode",
    "apstCode",
    "applDate",
    "applNo",
    "admtCode",
    "sessCode",
    "reqDocInd",
    "applPreference",
    "stypCode",
    "resdCode",
    "fullPartInd",
    "seqno",
    "admrCode",
    "question",
    "webInd",
    "displayWebInd",
    "answer",
    "longAnswer"
})
@Generated("jsonschema2pojo")
public class ApplicationQuestionsOrAnswers100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    @JsonProperty("termCodeEntry")
    private String termCodeEntry;
    @JsonProperty("sarappdApdcCode")
    private String sarappdApdcCode;
    @JsonProperty("apstCode")
    private String apstCode;
    @JsonProperty("applDate")
    private String applDate;
    @JsonProperty("applNo")
    private String applNo;
    @JsonProperty("admtCode")
    private String admtCode;
    @JsonProperty("sessCode")
    private String sessCode;
    @JsonProperty("reqDocInd")
    private String reqDocInd;
    @JsonProperty("applPreference")
    private String applPreference;
    @JsonProperty("stypCode")
    private String stypCode;
    @JsonProperty("resdCode")
    private String resdCode;
    @JsonProperty("fullPartInd")
    private String fullPartInd;
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
     * Lineage reference object : SARQUAN_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_WEB_IND")
    private String webInd;
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
     * Essay Answer
     * <p>
     * Lineage reference object : SARQUAN_LONG_ANSWER
     * 
     */
    @JsonProperty("longAnswer")
    @JsonPropertyDescription("Lineage reference object : SARQUAN_LONG_ANSWER")
    private String longAnswer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    @JsonProperty("termCodeEntry")
    public String getTermCodeEntry() {
        return termCodeEntry;
    }

    @JsonProperty("termCodeEntry")
    public void setTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
        return this;
    }

    @JsonProperty("sarappdApdcCode")
    public String getSarappdApdcCode() {
        return sarappdApdcCode;
    }

    @JsonProperty("sarappdApdcCode")
    public void setSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    @JsonProperty("apstCode")
    public String getApstCode() {
        return apstCode;
    }

    @JsonProperty("apstCode")
    public void setApstCode(String apstCode) {
        this.apstCode = apstCode;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withApstCode(String apstCode) {
        this.apstCode = apstCode;
        return this;
    }

    @JsonProperty("applDate")
    public String getApplDate() {
        return applDate;
    }

    @JsonProperty("applDate")
    public void setApplDate(String applDate) {
        this.applDate = applDate;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withApplDate(String applDate) {
        this.applDate = applDate;
        return this;
    }

    @JsonProperty("applNo")
    public String getApplNo() {
        return applNo;
    }

    @JsonProperty("applNo")
    public void setApplNo(String applNo) {
        this.applNo = applNo;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withApplNo(String applNo) {
        this.applNo = applNo;
        return this;
    }

    @JsonProperty("admtCode")
    public String getAdmtCode() {
        return admtCode;
    }

    @JsonProperty("admtCode")
    public void setAdmtCode(String admtCode) {
        this.admtCode = admtCode;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    @JsonProperty("reqDocInd")
    public String getReqDocInd() {
        return reqDocInd;
    }

    @JsonProperty("reqDocInd")
    public void setReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
        return this;
    }

    @JsonProperty("applPreference")
    public String getApplPreference() {
        return applPreference;
    }

    @JsonProperty("applPreference")
    public void setApplPreference(String applPreference) {
        this.applPreference = applPreference;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withApplPreference(String applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public ApplicationQuestionsOrAnswers100QapiPost withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
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

    public ApplicationQuestionsOrAnswers100QapiPost withSeqno(Double seqno) {
        this.seqno = seqno;
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

    public ApplicationQuestionsOrAnswers100QapiPost withAdmrCode(String admrCode) {
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

    public ApplicationQuestionsOrAnswers100QapiPost withQuestion(String question) {
        this.question = question;
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

    public ApplicationQuestionsOrAnswers100QapiPost withWebInd(String webInd) {
        this.webInd = webInd;
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

    public ApplicationQuestionsOrAnswers100QapiPost withDisplayWebInd(String displayWebInd) {
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

    public ApplicationQuestionsOrAnswers100QapiPost withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

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

    public ApplicationQuestionsOrAnswers100QapiPost withLongAnswer(String longAnswer) {
        this.longAnswer = longAnswer;
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

    public ApplicationQuestionsOrAnswers100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationQuestionsOrAnswers100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("sarappdApdcCode");
        sb.append('=');
        sb.append(((this.sarappdApdcCode == null)?"<null>":this.sarappdApdcCode));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("question");
        sb.append('=');
        sb.append(((this.question == null)?"<null>":this.question));
        sb.append(',');
        sb.append("webInd");
        sb.append('=');
        sb.append(((this.webInd == null)?"<null>":this.webInd));
        sb.append(',');
        sb.append("displayWebInd");
        sb.append('=');
        sb.append(((this.displayWebInd == null)?"<null>":this.displayWebInd));
        sb.append(',');
        sb.append("answer");
        sb.append('=');
        sb.append(((this.answer == null)?"<null>":this.answer));
        sb.append(',');
        sb.append("longAnswer");
        sb.append('=');
        sb.append(((this.longAnswer == null)?"<null>":this.longAnswer));
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
        result = ((result* 31)+((this.reqDocInd == null)? 0 :this.reqDocInd.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.question == null)? 0 :this.question.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.webInd == null)? 0 :this.webInd.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.displayWebInd == null)? 0 :this.displayWebInd.hashCode()));
        result = ((result* 31)+((this.answer == null)? 0 :this.answer.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationQuestionsOrAnswers100QapiPost) == false) {
            return false;
        }
        ApplicationQuestionsOrAnswers100QapiPost rhs = ((ApplicationQuestionsOrAnswers100QapiPost) other);
        return (((((((((((((((((((((((this.longAnswer == rhs.longAnswer)||((this.longAnswer!= null)&&this.longAnswer.equals(rhs.longAnswer)))&&((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.question == rhs.question)||((this.question!= null)&&this.question.equals(rhs.question))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.webInd == rhs.webInd)||((this.webInd!= null)&&this.webInd.equals(rhs.webInd))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.displayWebInd == rhs.displayWebInd)||((this.displayWebInd!= null)&&this.displayWebInd.equals(rhs.displayWebInd))))&&((this.answer == rhs.answer)||((this.answer!= null)&&this.answer.equals(rhs.answer))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))));
    }

}
