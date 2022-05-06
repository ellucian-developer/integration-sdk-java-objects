
package com.ellucian.generated.bpapi.ban.student_course_registration_audit.v1_0_0;

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
    "activityDate",
    "registrationDate",
    "errorFlag",
    "sessionid",
    "message",
    "userId",
    "crn",
    "rmsgCde"
})
@Generated("jsonschema2pojo")
public class Sfrrscm {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRSCM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRRSCM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SFRRSCM_REGISTRATION_DATE
     * 
     */
    @JsonProperty("registrationDate")
    @JsonPropertyDescription("Lineage reference object : SFRRSCM_REGISTRATION_DATE")
    private Date registrationDate;
    /**
     * Error
     * <p>
     * Lineage reference object : SFRRSCM_ERROR_FLAG
     * 
     */
    @JsonProperty("errorFlag")
    @JsonPropertyDescription("Lineage reference object : SFRRSCM_ERROR_FLAG")
    private String errorFlag;
    /**
     * Session ID
     * <p>
     * Lineage reference object : SFRRSCM_SESSIONID
     * 
     */
    @JsonProperty("sessionid")
    @JsonPropertyDescription("Lineage reference object : SFRRSCM_SESSIONID")
    private String sessionid;
    /**
     * Message
     * <p>
     * Lineage reference object : SFRRSCM_MESSAGE
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Lineage reference object : SFRRSCM_MESSAGE")
    private String message;
    /**
     * Lineage reference object : SFRRSCM_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SFRRSCM_USER_ID")
    private String userId;
    /**
     * CRN
     * <p>
     * Lineage reference object : SFRRSCM_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SFRRSCM_CRN")
    private String crn;
    /**
     * Message Type
     * <p>
     * Lineage reference object : SFRRSCM_RMSG_CDE
     * 
     */
    @JsonProperty("rmsgCde")
    @JsonPropertyDescription("Lineage reference object : SFRRSCM_RMSG_CDE")
    private String rmsgCde;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRSCM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRSCM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sfrrscm withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SFRRSCM_REGISTRATION_DATE
     * 
     */
    @JsonProperty("registrationDate")
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Lineage reference object : SFRRSCM_REGISTRATION_DATE
     * 
     */
    @JsonProperty("registrationDate")
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Sfrrscm withRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /**
     * Error
     * <p>
     * Lineage reference object : SFRRSCM_ERROR_FLAG
     * 
     */
    @JsonProperty("errorFlag")
    public String getErrorFlag() {
        return errorFlag;
    }

    /**
     * Error
     * <p>
     * Lineage reference object : SFRRSCM_ERROR_FLAG
     * 
     */
    @JsonProperty("errorFlag")
    public void setErrorFlag(String errorFlag) {
        this.errorFlag = errorFlag;
    }

    public Sfrrscm withErrorFlag(String errorFlag) {
        this.errorFlag = errorFlag;
        return this;
    }

    /**
     * Session ID
     * <p>
     * Lineage reference object : SFRRSCM_SESSIONID
     * 
     */
    @JsonProperty("sessionid")
    public String getSessionid() {
        return sessionid;
    }

    /**
     * Session ID
     * <p>
     * Lineage reference object : SFRRSCM_SESSIONID
     * 
     */
    @JsonProperty("sessionid")
    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public Sfrrscm withSessionid(String sessionid) {
        this.sessionid = sessionid;
        return this;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : SFRRSCM_MESSAGE
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : SFRRSCM_MESSAGE
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Sfrrscm withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Lineage reference object : SFRRSCM_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SFRRSCM_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sfrrscm withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRRSCM_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRRSCM_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Sfrrscm withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Message Type
     * <p>
     * Lineage reference object : SFRRSCM_RMSG_CDE
     * 
     */
    @JsonProperty("rmsgCde")
    public String getRmsgCde() {
        return rmsgCde;
    }

    /**
     * Message Type
     * <p>
     * Lineage reference object : SFRRSCM_RMSG_CDE
     * 
     */
    @JsonProperty("rmsgCde")
    public void setRmsgCde(String rmsgCde) {
        this.rmsgCde = rmsgCde;
    }

    public Sfrrscm withRmsgCde(String rmsgCde) {
        this.rmsgCde = rmsgCde;
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

    public Sfrrscm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfrrscm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("registrationDate");
        sb.append('=');
        sb.append(((this.registrationDate == null)?"<null>":this.registrationDate));
        sb.append(',');
        sb.append("errorFlag");
        sb.append('=');
        sb.append(((this.errorFlag == null)?"<null>":this.errorFlag));
        sb.append(',');
        sb.append("sessionid");
        sb.append('=');
        sb.append(((this.sessionid == null)?"<null>":this.sessionid));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("rmsgCde");
        sb.append('=');
        sb.append(((this.rmsgCde == null)?"<null>":this.rmsgCde));
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
        result = ((result* 31)+((this.registrationDate == null)? 0 :this.registrationDate.hashCode()));
        result = ((result* 31)+((this.errorFlag == null)? 0 :this.errorFlag.hashCode()));
        result = ((result* 31)+((this.sessionid == null)? 0 :this.sessionid.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.rmsgCde == null)? 0 :this.rmsgCde.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfrrscm) == false) {
            return false;
        }
        Sfrrscm rhs = ((Sfrrscm) other);
        return ((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.registrationDate == rhs.registrationDate)||((this.registrationDate!= null)&&this.registrationDate.equals(rhs.registrationDate))))&&((this.errorFlag == rhs.errorFlag)||((this.errorFlag!= null)&&this.errorFlag.equals(rhs.errorFlag))))&&((this.sessionid == rhs.sessionid)||((this.sessionid!= null)&&this.sessionid.equals(rhs.sessionid))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.rmsgCde == rhs.rmsgCde)||((this.rmsgCde!= null)&&this.rmsgCde.equals(rhs.rmsgCde))));
    }

}
