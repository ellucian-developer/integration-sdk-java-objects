
package com.ellucian.generated.bpapi.ban.registration_add_authorization_codes.v1_0_0;

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
    "spridenId",
    "activityDate",
    "assignDate",
    "generateDate",
    "activeInd",
    "dataOrigin",
    "authCde",
    "spridenName",
    "userId",
    "crn",
    "termCode"
})
@Generated("jsonschema2pojo")
public class RegistrationAddAuthorizationCodes100GetResponse {

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    private String spridenId;
    /**
     * Last Updated Date
     * <p>
     * Lineage reference object : SFBAUTH_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * First Assigned Date
     * <p>
     * Lineage reference object : SFBAUTH_ASSIGN_DATE
     * 
     */
    @JsonProperty("assignDate")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_ASSIGN_DATE")
    private Date assignDate;
    /**
     * Sfbauth Generate Date
     * <p>
     * Lineage reference object : SFBAUTH_GENERATE_DATE
     * (Required)
     * 
     */
    @JsonProperty("generateDate")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_GENERATE_DATE")
    private Date generateDate;
    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_ACTIVE_IND")
    private String activeInd;
    /**
     * Sfbauth Data Origin
     * <p>
     * Lineage reference object : SFBAUTH_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_DATA_ORIGIN")
    private String dataOrigin;
    /**
     * Authorization Code
     * <p>
     * Lineage reference object : SFBAUTH_AUTH_CDE
     * (Required)
     * 
     */
    @JsonProperty("authCde")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_AUTH_CDE")
    private String authCde;
    /**
     * Student Name
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenName")
    private String spridenName;
    /**
     * Last Updated by User ID
     * <p>
     * Lineage reference object : SFBAUTH_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_USER_ID")
    private String userId;
    /**
     * Sfbauth Crn
     * <p>
     * Lineage reference object : SFBAUTH_CRN
     * (Required)
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_CRN")
    private String crn;
    /**
     * Sfbauth Term Code
     * <p>
     * Lineage reference object : SFBAUTH_TERM_CODE
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public String getSpridenId() {
        return spridenId;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public void setSpridenId(String spridenId) {
        this.spridenId = spridenId;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * Last Updated Date
     * <p>
     * Lineage reference object : SFBAUTH_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Updated Date
     * <p>
     * Lineage reference object : SFBAUTH_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * First Assigned Date
     * <p>
     * Lineage reference object : SFBAUTH_ASSIGN_DATE
     * 
     */
    @JsonProperty("assignDate")
    public Date getAssignDate() {
        return assignDate;
    }

    /**
     * First Assigned Date
     * <p>
     * Lineage reference object : SFBAUTH_ASSIGN_DATE
     * 
     */
    @JsonProperty("assignDate")
    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withAssignDate(Date assignDate) {
        this.assignDate = assignDate;
        return this;
    }

    /**
     * Sfbauth Generate Date
     * <p>
     * Lineage reference object : SFBAUTH_GENERATE_DATE
     * (Required)
     * 
     */
    @JsonProperty("generateDate")
    public Date getGenerateDate() {
        return generateDate;
    }

    /**
     * Sfbauth Generate Date
     * <p>
     * Lineage reference object : SFBAUTH_GENERATE_DATE
     * (Required)
     * 
     */
    @JsonProperty("generateDate")
    public void setGenerateDate(Date generateDate) {
        this.generateDate = generateDate;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withGenerateDate(Date generateDate) {
        this.generateDate = generateDate;
        return this;
    }

    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Sfbauth Data Origin
     * <p>
     * Lineage reference object : SFBAUTH_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public String getDataOrigin() {
        return dataOrigin;
    }

    /**
     * Sfbauth Data Origin
     * <p>
     * Lineage reference object : SFBAUTH_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    /**
     * Authorization Code
     * <p>
     * Lineage reference object : SFBAUTH_AUTH_CDE
     * (Required)
     * 
     */
    @JsonProperty("authCde")
    public String getAuthCde() {
        return authCde;
    }

    /**
     * Authorization Code
     * <p>
     * Lineage reference object : SFBAUTH_AUTH_CDE
     * (Required)
     * 
     */
    @JsonProperty("authCde")
    public void setAuthCde(String authCde) {
        this.authCde = authCde;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withAuthCde(String authCde) {
        this.authCde = authCde;
        return this;
    }

    /**
     * Student Name
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenName")
    public String getSpridenName() {
        return spridenName;
    }

    /**
     * Student Name
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenName")
    public void setSpridenName(String spridenName) {
        this.spridenName = spridenName;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withSpridenName(String spridenName) {
        this.spridenName = spridenName;
        return this;
    }

    /**
     * Last Updated by User ID
     * <p>
     * Lineage reference object : SFBAUTH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Last Updated by User ID
     * <p>
     * Lineage reference object : SFBAUTH_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Sfbauth Crn
     * <p>
     * Lineage reference object : SFBAUTH_CRN
     * (Required)
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * Sfbauth Crn
     * <p>
     * Lineage reference object : SFBAUTH_CRN
     * (Required)
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Sfbauth Term Code
     * <p>
     * Lineage reference object : SFBAUTH_TERM_CODE
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Sfbauth Term Code
     * <p>
     * Lineage reference object : SFBAUTH_TERM_CODE
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public RegistrationAddAuthorizationCodes100GetResponse withTermCode(String termCode) {
        this.termCode = termCode;
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

    public RegistrationAddAuthorizationCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationAddAuthorizationCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("assignDate");
        sb.append('=');
        sb.append(((this.assignDate == null)?"<null>":this.assignDate));
        sb.append(',');
        sb.append("generateDate");
        sb.append('=');
        sb.append(((this.generateDate == null)?"<null>":this.generateDate));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("dataOrigin");
        sb.append('=');
        sb.append(((this.dataOrigin == null)?"<null>":this.dataOrigin));
        sb.append(',');
        sb.append("authCde");
        sb.append('=');
        sb.append(((this.authCde == null)?"<null>":this.authCde));
        sb.append(',');
        sb.append("spridenName");
        sb.append('=');
        sb.append(((this.spridenName == null)?"<null>":this.spridenName));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.assignDate == null)? 0 :this.assignDate.hashCode()));
        result = ((result* 31)+((this.generateDate == null)? 0 :this.generateDate.hashCode()));
        result = ((result* 31)+((this.authCde == null)? 0 :this.authCde.hashCode()));
        result = ((result* 31)+((this.spridenName == null)? 0 :this.spridenName.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationAddAuthorizationCodes100GetResponse) == false) {
            return false;
        }
        RegistrationAddAuthorizationCodes100GetResponse rhs = ((RegistrationAddAuthorizationCodes100GetResponse) other);
        return (((((((((((((this.assignDate == rhs.assignDate)||((this.assignDate!= null)&&this.assignDate.equals(rhs.assignDate)))&&((this.generateDate == rhs.generateDate)||((this.generateDate!= null)&&this.generateDate.equals(rhs.generateDate))))&&((this.authCde == rhs.authCde)||((this.authCde!= null)&&this.authCde.equals(rhs.authCde))))&&((this.spridenName == rhs.spridenName)||((this.spridenName!= null)&&this.spridenName.equals(rhs.spridenName))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
