
package com.ellucian.generated.bpapi.ban.registration_error_messages.v1_0_0;

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
    "cde",
    "seqno",
    "message",
    "localMessage",
    "sysReqInd",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class RegistrationErrorMessages100QapiPost {

    /**
     * Message Code
     * <p>
     * Lineage reference object : SFRRMSG_CDE
     * 
     */
    @JsonProperty("cde")
    @JsonPropertyDescription("Lineage reference object : SFRRMSG_CDE")
    private String cde;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRMSG_SEQNO
     * 
     */
    @JsonProperty("seqno")
    @JsonPropertyDescription("Lineage reference object : SFRRMSG_SEQNO")
    private Double seqno;
    /**
     * Baseline Message
     * <p>
     * Lineage reference object : SFRRMSG_MESSAGE
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Lineage reference object : SFRRMSG_MESSAGE")
    private String message;
    /**
     * Custom Message
     * <p>
     * Lineage reference object : SFRRMSG_LOCAL_MESSAGE
     * 
     */
    @JsonProperty("localMessage")
    @JsonPropertyDescription("Lineage reference object : SFRRMSG_LOCAL_MESSAGE")
    private String localMessage;
    /**
     * Lineage reference object : SFRRMSG_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    @JsonPropertyDescription("Lineage reference object : SFRRMSG_SYS_REQ_IND")
    private String sysReqInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRMSG_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SFRRMSG_USER_ID")
    private String userId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRMSG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRRMSG_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Message Code
     * <p>
     * Lineage reference object : SFRRMSG_CDE
     * 
     */
    @JsonProperty("cde")
    public String getCde() {
        return cde;
    }

    /**
     * Message Code
     * <p>
     * Lineage reference object : SFRRMSG_CDE
     * 
     */
    @JsonProperty("cde")
    public void setCde(String cde) {
        this.cde = cde;
    }

    public RegistrationErrorMessages100QapiPost withCde(String cde) {
        this.cde = cde;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRMSG_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public Double getSeqno() {
        return seqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRMSG_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public void setSeqno(Double seqno) {
        this.seqno = seqno;
    }

    public RegistrationErrorMessages100QapiPost withSeqno(Double seqno) {
        this.seqno = seqno;
        return this;
    }

    /**
     * Baseline Message
     * <p>
     * Lineage reference object : SFRRMSG_MESSAGE
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Baseline Message
     * <p>
     * Lineage reference object : SFRRMSG_MESSAGE
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public RegistrationErrorMessages100QapiPost withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Custom Message
     * <p>
     * Lineage reference object : SFRRMSG_LOCAL_MESSAGE
     * 
     */
    @JsonProperty("localMessage")
    public String getLocalMessage() {
        return localMessage;
    }

    /**
     * Custom Message
     * <p>
     * Lineage reference object : SFRRMSG_LOCAL_MESSAGE
     * 
     */
    @JsonProperty("localMessage")
    public void setLocalMessage(String localMessage) {
        this.localMessage = localMessage;
    }

    public RegistrationErrorMessages100QapiPost withLocalMessage(String localMessage) {
        this.localMessage = localMessage;
        return this;
    }

    /**
     * Lineage reference object : SFRRMSG_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    public String getSysReqInd() {
        return sysReqInd;
    }

    /**
     * Lineage reference object : SFRRMSG_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    public void setSysReqInd(String sysReqInd) {
        this.sysReqInd = sysReqInd;
    }

    public RegistrationErrorMessages100QapiPost withSysReqInd(String sysReqInd) {
        this.sysReqInd = sysReqInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRMSG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRMSG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RegistrationErrorMessages100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRMSG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRMSG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RegistrationErrorMessages100QapiPost withActivityDate(Date activityDate) {
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

    public RegistrationErrorMessages100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationErrorMessages100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cde");
        sb.append('=');
        sb.append(((this.cde == null)?"<null>":this.cde));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("localMessage");
        sb.append('=');
        sb.append(((this.localMessage == null)?"<null>":this.localMessage));
        sb.append(',');
        sb.append("sysReqInd");
        sb.append('=');
        sb.append(((this.sysReqInd == null)?"<null>":this.sysReqInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.cde == null)? 0 :this.cde.hashCode()));
        result = ((result* 31)+((this.sysReqInd == null)? 0 :this.sysReqInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.localMessage == null)? 0 :this.localMessage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationErrorMessages100QapiPost) == false) {
            return false;
        }
        RegistrationErrorMessages100QapiPost rhs = ((RegistrationErrorMessages100QapiPost) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.cde == rhs.cde)||((this.cde!= null)&&this.cde.equals(rhs.cde))))&&((this.sysReqInd == rhs.sysReqInd)||((this.sysReqInd!= null)&&this.sysReqInd.equals(rhs.sysReqInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.localMessage == rhs.localMessage)||((this.localMessage!= null)&&this.localMessage.equals(rhs.localMessage))));
    }

}
