
package com.ellucian.generated.bpapi.ban.third_party_access_audit_verification_questions.v1_0_0;

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
    "questionDescription",
    "activityDate",
    "id",
    "ansrDesc",
    "qstnDesc"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccessAuditVerificationQuestions100GetRequest {

    /**
     * Institution Defined Question
     * <p>
     * 
     * 
     */
    @JsonProperty("questionDescription")
    private String questionDescription;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBANSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GOBANSR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Answer
     * <p>
     * Lineage reference object : GOBANSR_ANSR_DESC
     * 
     */
    @JsonProperty("ansrDesc")
    @JsonPropertyDescription("Lineage reference object : GOBANSR_ANSR_DESC")
    private String ansrDesc;
    /**
     * Or User Defined Question
     * <p>
     * Lineage reference object : GOBANSR_QSTN_DESC
     * 
     */
    @JsonProperty("qstnDesc")
    @JsonPropertyDescription("Lineage reference object : GOBANSR_QSTN_DESC")
    private String qstnDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Institution Defined Question
     * <p>
     * 
     * 
     */
    @JsonProperty("questionDescription")
    public String getQuestionDescription() {
        return questionDescription;
    }

    /**
     * Institution Defined Question
     * <p>
     * 
     * 
     */
    @JsonProperty("questionDescription")
    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public ThirdPartyAccessAuditVerificationQuestions100GetRequest withQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBANSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBANSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ThirdPartyAccessAuditVerificationQuestions100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public ThirdPartyAccessAuditVerificationQuestions100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Answer
     * <p>
     * Lineage reference object : GOBANSR_ANSR_DESC
     * 
     */
    @JsonProperty("ansrDesc")
    public String getAnsrDesc() {
        return ansrDesc;
    }

    /**
     * Answer
     * <p>
     * Lineage reference object : GOBANSR_ANSR_DESC
     * 
     */
    @JsonProperty("ansrDesc")
    public void setAnsrDesc(String ansrDesc) {
        this.ansrDesc = ansrDesc;
    }

    public ThirdPartyAccessAuditVerificationQuestions100GetRequest withAnsrDesc(String ansrDesc) {
        this.ansrDesc = ansrDesc;
        return this;
    }

    /**
     * Or User Defined Question
     * <p>
     * Lineage reference object : GOBANSR_QSTN_DESC
     * 
     */
    @JsonProperty("qstnDesc")
    public String getQstnDesc() {
        return qstnDesc;
    }

    /**
     * Or User Defined Question
     * <p>
     * Lineage reference object : GOBANSR_QSTN_DESC
     * 
     */
    @JsonProperty("qstnDesc")
    public void setQstnDesc(String qstnDesc) {
        this.qstnDesc = qstnDesc;
    }

    public ThirdPartyAccessAuditVerificationQuestions100GetRequest withQstnDesc(String qstnDesc) {
        this.qstnDesc = qstnDesc;
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

    public ThirdPartyAccessAuditVerificationQuestions100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccessAuditVerificationQuestions100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("questionDescription");
        sb.append('=');
        sb.append(((this.questionDescription == null)?"<null>":this.questionDescription));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ansrDesc");
        sb.append('=');
        sb.append(((this.ansrDesc == null)?"<null>":this.ansrDesc));
        sb.append(',');
        sb.append("qstnDesc");
        sb.append('=');
        sb.append(((this.qstnDesc == null)?"<null>":this.qstnDesc));
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
        result = ((result* 31)+((this.questionDescription == null)? 0 :this.questionDescription.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ansrDesc == null)? 0 :this.ansrDesc.hashCode()));
        result = ((result* 31)+((this.qstnDesc == null)? 0 :this.qstnDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccessAuditVerificationQuestions100GetRequest) == false) {
            return false;
        }
        ThirdPartyAccessAuditVerificationQuestions100GetRequest rhs = ((ThirdPartyAccessAuditVerificationQuestions100GetRequest) other);
        return (((((((this.questionDescription == rhs.questionDescription)||((this.questionDescription!= null)&&this.questionDescription.equals(rhs.questionDescription)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ansrDesc == rhs.ansrDesc)||((this.ansrDesc!= null)&&this.ansrDesc.equals(rhs.ansrDesc))))&&((this.qstnDesc == rhs.qstnDesc)||((this.qstnDesc!= null)&&this.qstnDesc.equals(rhs.qstnDesc))));
    }

}
