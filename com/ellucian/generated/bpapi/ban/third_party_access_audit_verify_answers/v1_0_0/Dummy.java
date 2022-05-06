
package com.ellucian.generated.bpapi.ban.third_party_access_audit_verify_answers.v1_0_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "result",
    "gobansrActivityDate1",
    "questionValue",
    "verifyAnswer"
})
@Generated("jsonschema2pojo")
public class Dummy {

    @JsonProperty("result")
    private String result;
    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("gobansrActivityDate1")
    private Date gobansrActivityDate1;
    /**
     * Question
     * <p>
     * 
     * 
     */
    @JsonProperty("questionValue")
    private String questionValue;
    /**
     * Verify Answer
     * <p>
     * 
     * 
     */
    @JsonProperty("verifyAnswer")
    private String verifyAnswer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    public Dummy withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("gobansrActivityDate1")
    public Date getGobansrActivityDate1() {
        return gobansrActivityDate1;
    }

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("gobansrActivityDate1")
    public void setGobansrActivityDate1(Date gobansrActivityDate1) {
        this.gobansrActivityDate1 = gobansrActivityDate1;
    }

    public Dummy withGobansrActivityDate1(Date gobansrActivityDate1) {
        this.gobansrActivityDate1 = gobansrActivityDate1;
        return this;
    }

    /**
     * Question
     * <p>
     * 
     * 
     */
    @JsonProperty("questionValue")
    public String getQuestionValue() {
        return questionValue;
    }

    /**
     * Question
     * <p>
     * 
     * 
     */
    @JsonProperty("questionValue")
    public void setQuestionValue(String questionValue) {
        this.questionValue = questionValue;
    }

    public Dummy withQuestionValue(String questionValue) {
        this.questionValue = questionValue;
        return this;
    }

    /**
     * Verify Answer
     * <p>
     * 
     * 
     */
    @JsonProperty("verifyAnswer")
    public String getVerifyAnswer() {
        return verifyAnswer;
    }

    /**
     * Verify Answer
     * <p>
     * 
     * 
     */
    @JsonProperty("verifyAnswer")
    public void setVerifyAnswer(String verifyAnswer) {
        this.verifyAnswer = verifyAnswer;
    }

    public Dummy withVerifyAnswer(String verifyAnswer) {
        this.verifyAnswer = verifyAnswer;
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

    public Dummy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dummy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("gobansrActivityDate1");
        sb.append('=');
        sb.append(((this.gobansrActivityDate1 == null)?"<null>":this.gobansrActivityDate1));
        sb.append(',');
        sb.append("questionValue");
        sb.append('=');
        sb.append(((this.questionValue == null)?"<null>":this.questionValue));
        sb.append(',');
        sb.append("verifyAnswer");
        sb.append('=');
        sb.append(((this.verifyAnswer == null)?"<null>":this.verifyAnswer));
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
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.gobansrActivityDate1 == null)? 0 :this.gobansrActivityDate1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.verifyAnswer == null)? 0 :this.verifyAnswer.hashCode()));
        result = ((result* 31)+((this.questionValue == null)? 0 :this.questionValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dummy) == false) {
            return false;
        }
        Dummy rhs = ((Dummy) other);
        return ((((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.gobansrActivityDate1 == rhs.gobansrActivityDate1)||((this.gobansrActivityDate1 != null)&&this.gobansrActivityDate1 .equals(rhs.gobansrActivityDate1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.verifyAnswer == rhs.verifyAnswer)||((this.verifyAnswer!= null)&&this.verifyAnswer.equals(rhs.verifyAnswer))))&&((this.questionValue == rhs.questionValue)||((this.questionValue!= null)&&this.questionValue.equals(rhs.questionValue))));
    }

}
