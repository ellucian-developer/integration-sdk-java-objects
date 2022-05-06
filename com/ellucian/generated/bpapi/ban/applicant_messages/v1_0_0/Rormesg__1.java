
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
    "mesgDesc",
    "activityDate",
    "mesgCode",
    "userId",
    "fullDesc",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class Rormesg__1 {

    @JsonProperty("mesgDesc")
    private String mesgDesc;
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
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("mesgCode")
    @JsonPropertyDescription("Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg")
    private String mesgCode;
    /**
     * User ID
     * <p>
     * Lineage reference object : RORMESG_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : RORMESG_USER_ID")
    private String userId;
    /**
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("fullDesc")
    @JsonPropertyDescription("Lineage reference object : RORMESG_FULL_DESC")
    private String fullDesc;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("Lineage reference object : RORMESG_EXPIRATION_DATE")
    private Date expirationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mesgDesc")
    public String getMesgDesc() {
        return mesgDesc;
    }

    @JsonProperty("mesgDesc")
    public void setMesgDesc(String mesgDesc) {
        this.mesgDesc = mesgDesc;
    }

    public Rormesg__1 withMesgDesc(String mesgDesc) {
        this.mesgDesc = mesgDesc;
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

    public Rormesg__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public Rormesg__1 withMesgCode(String mesgCode) {
        this.mesgCode = mesgCode;
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

    public Rormesg__1 withUserId(String userId) {
        this.userId = userId;
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

    public Rormesg__1 withFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
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

    public Rormesg__1 withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public Rormesg__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rormesg__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mesgDesc");
        sb.append('=');
        sb.append(((this.mesgDesc == null)?"<null>":this.mesgDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("mesgCode");
        sb.append('=');
        sb.append(((this.mesgCode == null)?"<null>":this.mesgCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("fullDesc");
        sb.append('=');
        sb.append(((this.fullDesc == null)?"<null>":this.fullDesc));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
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
        result = ((result* 31)+((this.mesgDesc == null)? 0 :this.mesgDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.mesgCode == null)? 0 :this.mesgCode.hashCode()));
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
        if ((other instanceof Rormesg__1) == false) {
            return false;
        }
        Rormesg__1 rhs = ((Rormesg__1) other);
        return ((((((((this.mesgDesc == rhs.mesgDesc)||((this.mesgDesc!= null)&&this.mesgDesc.equals(rhs.mesgDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.mesgCode == rhs.mesgCode)||((this.mesgCode!= null)&&this.mesgCode.equals(rhs.mesgCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.fullDesc == rhs.fullDesc)||((this.fullDesc!= null)&&this.fullDesc.equals(rhs.fullDesc))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
