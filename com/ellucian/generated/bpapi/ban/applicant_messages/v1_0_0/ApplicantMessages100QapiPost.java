
package com.ellucian.generated.bpapi.ban.applicant_messages.v1_0_0;

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
    "keyblckAidyCode",
    "id",
    "mesgCode",
    "activityDate",
    "expirationDate",
    "userId",
    "mesgDesc",
    "fullDesc"
})
@Generated("jsonschema2pojo")
public class ApplicantMessages100QapiPost {

    @JsonProperty("keyblckAidyCode")
    private String keyblckAidyCode;
    @JsonProperty("id")
    private String id;
    /**
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("mesgCode")
    @JsonPropertyDescription("Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg")
    private String mesgCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : RORMESG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RORMESG_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("Lineage reference object : RORMESG_EXPIRATION_DATE")
    private Date expirationDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : RORMESG_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : RORMESG_USER_ID")
    private String userId;
    @JsonProperty("mesgDesc")
    private String mesgDesc;
    /**
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("fullDesc")
    @JsonPropertyDescription("Lineage reference object : RORMESG_FULL_DESC")
    private String fullDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public ApplicantMessages100QapiPost withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApplicantMessages100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("mesgCode")
    public String getMesgCode() {
        return mesgCode;
    }

    /**
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("mesgCode")
    public void setMesgCode(String mesgCode) {
        this.mesgCode = mesgCode;
    }

    public ApplicantMessages100QapiPost withMesgCode(String mesgCode) {
        this.mesgCode = mesgCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RORMESG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RORMESG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ApplicantMessages100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ApplicantMessages100QapiPost withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : RORMESG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : RORMESG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApplicantMessages100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("mesgDesc")
    public String getMesgDesc() {
        return mesgDesc;
    }

    @JsonProperty("mesgDesc")
    public void setMesgDesc(String mesgDesc) {
        this.mesgDesc = mesgDesc;
    }

    public ApplicantMessages100QapiPost withMesgDesc(String mesgDesc) {
        this.mesgDesc = mesgDesc;
        return this;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("fullDesc")
    public String getFullDesc() {
        return fullDesc;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("fullDesc")
    public void setFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
    }

    public ApplicantMessages100QapiPost withFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
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

    public ApplicantMessages100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantMessages100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("mesgCode");
        sb.append('=');
        sb.append(((this.mesgCode == null)?"<null>":this.mesgCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("mesgDesc");
        sb.append('=');
        sb.append(((this.mesgDesc == null)?"<null>":this.mesgDesc));
        sb.append(',');
        sb.append("fullDesc");
        sb.append('=');
        sb.append(((this.fullDesc == null)?"<null>":this.fullDesc));
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
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.mesgDesc == null)? 0 :this.mesgDesc.hashCode()));
        result = ((result* 31)+((this.mesgCode == null)? 0 :this.mesgCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.fullDesc == null)? 0 :this.fullDesc.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantMessages100QapiPost) == false) {
            return false;
        }
        ApplicantMessages100QapiPost rhs = ((ApplicantMessages100QapiPost) other);
        return ((((((((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.mesgDesc == rhs.mesgDesc)||((this.mesgDesc!= null)&&this.mesgDesc.equals(rhs.mesgDesc))))&&((this.mesgCode == rhs.mesgCode)||((this.mesgCode!= null)&&this.mesgCode.equals(rhs.mesgCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.fullDesc == rhs.fullDesc)||((this.fullDesc!= null)&&this.fullDesc.equals(rhs.fullDesc))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
