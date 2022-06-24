
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
    "criteria.expirationDate",
    "criteria.activityDate",
    "criteria.userId",
    "criteria.fullDesc",
    "criteria.mesgCode",
    "mesgCode",
    "id",
    "fullDesc",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class ApplicantMessages100PutRequest {

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private String keyblckAidyCode;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    @JsonPropertyDescription("Lineage reference object : RORMESG_EXPIRATION_DATE")
    private Date criteriaExpirationDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : RORMESG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : RORMESG_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : RORMESG_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : RORMESG_USER_ID")
    private String criteriaUserId;
    /**
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("criteria.fullDesc")
    @JsonPropertyDescription("Lineage reference object : RORMESG_FULL_DESC")
    private String criteriaFullDesc;
    /**
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("criteria.mesgCode")
    @JsonPropertyDescription("Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg")
    private String criteriaMesgCode;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
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

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public ApplicantMessages100PutRequest withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    public Date getCriteriaExpirationDate() {
        return criteriaExpirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    public void setCriteriaExpirationDate(Date criteriaExpirationDate) {
        this.criteriaExpirationDate = criteriaExpirationDate;
    }

    public ApplicantMessages100PutRequest withCriteriaExpirationDate(Date criteriaExpirationDate) {
        this.criteriaExpirationDate = criteriaExpirationDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RORMESG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RORMESG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public ApplicantMessages100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : RORMESG_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : RORMESG_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public ApplicantMessages100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("criteria.fullDesc")
    public String getCriteriaFullDesc() {
        return criteriaFullDesc;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("criteria.fullDesc")
    public void setCriteriaFullDesc(String criteriaFullDesc) {
        this.criteriaFullDesc = criteriaFullDesc;
    }

    public ApplicantMessages100PutRequest withCriteriaFullDesc(String criteriaFullDesc) {
        this.criteriaFullDesc = criteriaFullDesc;
        return this;
    }

    /**
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("criteria.mesgCode")
    public String getCriteriaMesgCode() {
        return criteriaMesgCode;
    }

    /**
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("criteria.mesgCode")
    public void setCriteriaMesgCode(String criteriaMesgCode) {
        this.criteriaMesgCode = criteriaMesgCode;
    }

    public ApplicantMessages100PutRequest withCriteriaMesgCode(String criteriaMesgCode) {
        this.criteriaMesgCode = criteriaMesgCode;
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

    public ApplicantMessages100PutRequest withMesgCode(String mesgCode) {
        this.mesgCode = mesgCode;
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

    public ApplicantMessages100PutRequest withId(String id) {
        this.id = id;
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

    public ApplicantMessages100PutRequest withFullDesc(String fullDesc) {
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

    public ApplicantMessages100PutRequest withExpirationDate(Date expirationDate) {
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

    public ApplicantMessages100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantMessages100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("criteriaExpirationDate");
        sb.append('=');
        sb.append(((this.criteriaExpirationDate == null)?"<null>":this.criteriaExpirationDate));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaFullDesc");
        sb.append('=');
        sb.append(((this.criteriaFullDesc == null)?"<null>":this.criteriaFullDesc));
        sb.append(',');
        sb.append("criteriaMesgCode");
        sb.append('=');
        sb.append(((this.criteriaMesgCode == null)?"<null>":this.criteriaMesgCode));
        sb.append(',');
        sb.append("mesgCode");
        sb.append('=');
        sb.append(((this.mesgCode == null)?"<null>":this.mesgCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaMesgCode == null)? 0 :this.criteriaMesgCode.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.criteriaExpirationDate == null)? 0 :this.criteriaExpirationDate.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaFullDesc == null)? 0 :this.criteriaFullDesc.hashCode()));
        result = ((result* 31)+((this.mesgCode == null)? 0 :this.mesgCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fullDesc == null)? 0 :this.fullDesc.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantMessages100PutRequest) == false) {
            return false;
        }
        ApplicantMessages100PutRequest rhs = ((ApplicantMessages100PutRequest) other);
        return ((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaMesgCode == rhs.criteriaMesgCode)||((this.criteriaMesgCode!= null)&&this.criteriaMesgCode.equals(rhs.criteriaMesgCode))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.criteriaExpirationDate == rhs.criteriaExpirationDate)||((this.criteriaExpirationDate!= null)&&this.criteriaExpirationDate.equals(rhs.criteriaExpirationDate))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaFullDesc == rhs.criteriaFullDesc)||((this.criteriaFullDesc!= null)&&this.criteriaFullDesc.equals(rhs.criteriaFullDesc))))&&((this.mesgCode == rhs.mesgCode)||((this.mesgCode!= null)&&this.mesgCode.equals(rhs.mesgCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fullDesc == rhs.fullDesc)||((this.fullDesc!= null)&&this.fullDesc.equals(rhs.fullDesc))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
