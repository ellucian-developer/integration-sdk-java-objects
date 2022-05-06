
package com.ellucian.generated.bpapi.ban.person_social_economic_identity_details.v1_0_0;

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
    "seidCode",
    "activityDate",
    "seidValueDesc",
    "seidValue",
    "seirCode",
    "userId"
})
@Generated("jsonschema2pojo")
public class PersonSocialEconomicIdentityDetails100PutResponse {

    /**
     * Gorpsid Seid Code
     * <p>
     * Lineage reference object : GORPSID_SEID_CODE
     * (Required)
     * 
     */
    @JsonProperty("seidCode")
    @JsonPropertyDescription("Lineage reference object : GORPSID_SEID_CODE")
    private String seidCode;
    /**
     * Gorpsid Activity Date
     * <p>
     * Lineage reference object : GORPSID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GORPSID_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("seidValueDesc")
    private String seidValueDesc;
    /**
     * Gorpsid Seid Value
     * <p>
     * Lineage reference object : GORPSID_SEID_VALUE, Lookup lineage reference object : gorseid
     * 
     */
    @JsonProperty("seidValue")
    @JsonPropertyDescription("Lineage reference object : GORPSID_SEID_VALUE, Lookup lineage reference object : gorseid")
    private String seidValue;
    /**
     * Gorpsid Seir Code
     * <p>
     * Lineage reference object : GORPSID_SEIR_CODE
     * (Required)
     * 
     */
    @JsonProperty("seirCode")
    @JsonPropertyDescription("Lineage reference object : GORPSID_SEIR_CODE")
    private String seirCode;
    /**
     * Gorpsid User Id
     * <p>
     * Lineage reference object : GORPSID_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GORPSID_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gorpsid Seid Code
     * <p>
     * Lineage reference object : GORPSID_SEID_CODE
     * (Required)
     * 
     */
    @JsonProperty("seidCode")
    public String getSeidCode() {
        return seidCode;
    }

    /**
     * Gorpsid Seid Code
     * <p>
     * Lineage reference object : GORPSID_SEID_CODE
     * (Required)
     * 
     */
    @JsonProperty("seidCode")
    public void setSeidCode(String seidCode) {
        this.seidCode = seidCode;
    }

    public PersonSocialEconomicIdentityDetails100PutResponse withSeidCode(String seidCode) {
        this.seidCode = seidCode;
        return this;
    }

    /**
     * Gorpsid Activity Date
     * <p>
     * Lineage reference object : GORPSID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Gorpsid Activity Date
     * <p>
     * Lineage reference object : GORPSID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PersonSocialEconomicIdentityDetails100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("seidValueDesc")
    public String getSeidValueDesc() {
        return seidValueDesc;
    }

    @JsonProperty("seidValueDesc")
    public void setSeidValueDesc(String seidValueDesc) {
        this.seidValueDesc = seidValueDesc;
    }

    public PersonSocialEconomicIdentityDetails100PutResponse withSeidValueDesc(String seidValueDesc) {
        this.seidValueDesc = seidValueDesc;
        return this;
    }

    /**
     * Gorpsid Seid Value
     * <p>
     * Lineage reference object : GORPSID_SEID_VALUE, Lookup lineage reference object : gorseid
     * 
     */
    @JsonProperty("seidValue")
    public String getSeidValue() {
        return seidValue;
    }

    /**
     * Gorpsid Seid Value
     * <p>
     * Lineage reference object : GORPSID_SEID_VALUE, Lookup lineage reference object : gorseid
     * 
     */
    @JsonProperty("seidValue")
    public void setSeidValue(String seidValue) {
        this.seidValue = seidValue;
    }

    public PersonSocialEconomicIdentityDetails100PutResponse withSeidValue(String seidValue) {
        this.seidValue = seidValue;
        return this;
    }

    /**
     * Gorpsid Seir Code
     * <p>
     * Lineage reference object : GORPSID_SEIR_CODE
     * (Required)
     * 
     */
    @JsonProperty("seirCode")
    public String getSeirCode() {
        return seirCode;
    }

    /**
     * Gorpsid Seir Code
     * <p>
     * Lineage reference object : GORPSID_SEIR_CODE
     * (Required)
     * 
     */
    @JsonProperty("seirCode")
    public void setSeirCode(String seirCode) {
        this.seirCode = seirCode;
    }

    public PersonSocialEconomicIdentityDetails100PutResponse withSeirCode(String seirCode) {
        this.seirCode = seirCode;
        return this;
    }

    /**
     * Gorpsid User Id
     * <p>
     * Lineage reference object : GORPSID_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Gorpsid User Id
     * <p>
     * Lineage reference object : GORPSID_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PersonSocialEconomicIdentityDetails100PutResponse withUserId(String userId) {
        this.userId = userId;
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

    public PersonSocialEconomicIdentityDetails100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonSocialEconomicIdentityDetails100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seidCode");
        sb.append('=');
        sb.append(((this.seidCode == null)?"<null>":this.seidCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("seidValueDesc");
        sb.append('=');
        sb.append(((this.seidValueDesc == null)?"<null>":this.seidValueDesc));
        sb.append(',');
        sb.append("seidValue");
        sb.append('=');
        sb.append(((this.seidValue == null)?"<null>":this.seidValue));
        sb.append(',');
        sb.append("seirCode");
        sb.append('=');
        sb.append(((this.seirCode == null)?"<null>":this.seirCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.seidCode == null)? 0 :this.seidCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.seidValueDesc == null)? 0 :this.seidValueDesc.hashCode()));
        result = ((result* 31)+((this.seidValue == null)? 0 :this.seidValue.hashCode()));
        result = ((result* 31)+((this.seirCode == null)? 0 :this.seirCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonSocialEconomicIdentityDetails100PutResponse) == false) {
            return false;
        }
        PersonSocialEconomicIdentityDetails100PutResponse rhs = ((PersonSocialEconomicIdentityDetails100PutResponse) other);
        return ((((((((this.seidCode == rhs.seidCode)||((this.seidCode!= null)&&this.seidCode.equals(rhs.seidCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.seidValueDesc == rhs.seidValueDesc)||((this.seidValueDesc!= null)&&this.seidValueDesc.equals(rhs.seidValueDesc))))&&((this.seidValue == rhs.seidValue)||((this.seidValue!= null)&&this.seidValue.equals(rhs.seidValue))))&&((this.seirCode == rhs.seirCode)||((this.seirCode!= null)&&this.seirCode.equals(rhs.seirCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
