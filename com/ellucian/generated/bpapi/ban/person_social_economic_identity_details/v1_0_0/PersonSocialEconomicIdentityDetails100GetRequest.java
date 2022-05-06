
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
    "seidValue",
    "gtvseirCode",
    "id",
    "userId"
})
@Generated("jsonschema2pojo")
public class PersonSocialEconomicIdentityDetails100GetRequest {

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
     * Lineage reference object : gtvseirCode
     * 
     */
    @JsonProperty("gtvseirCode")
    @JsonPropertyDescription("Lineage reference object : gtvseirCode")
    private Object gtvseirCode;
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

    public PersonSocialEconomicIdentityDetails100GetRequest withSeidCode(String seidCode) {
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

    public PersonSocialEconomicIdentityDetails100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public PersonSocialEconomicIdentityDetails100GetRequest withSeidValue(String seidValue) {
        this.seidValue = seidValue;
        return this;
    }

    /**
     * Lineage reference object : gtvseirCode
     * 
     */
    @JsonProperty("gtvseirCode")
    public Object getGtvseirCode() {
        return gtvseirCode;
    }

    /**
     * Lineage reference object : gtvseirCode
     * 
     */
    @JsonProperty("gtvseirCode")
    public void setGtvseirCode(Object gtvseirCode) {
        this.gtvseirCode = gtvseirCode;
    }

    public PersonSocialEconomicIdentityDetails100GetRequest withGtvseirCode(Object gtvseirCode) {
        this.gtvseirCode = gtvseirCode;
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

    public PersonSocialEconomicIdentityDetails100GetRequest withId(Object id) {
        this.id = id;
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

    public PersonSocialEconomicIdentityDetails100GetRequest withUserId(String userId) {
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

    public PersonSocialEconomicIdentityDetails100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonSocialEconomicIdentityDetails100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seidCode");
        sb.append('=');
        sb.append(((this.seidCode == null)?"<null>":this.seidCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("seidValue");
        sb.append('=');
        sb.append(((this.seidValue == null)?"<null>":this.seidValue));
        sb.append(',');
        sb.append("gtvseirCode");
        sb.append('=');
        sb.append(((this.gtvseirCode == null)?"<null>":this.gtvseirCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.seidValue == null)? 0 :this.seidValue.hashCode()));
        result = ((result* 31)+((this.gtvseirCode == null)? 0 :this.gtvseirCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonSocialEconomicIdentityDetails100GetRequest) == false) {
            return false;
        }
        PersonSocialEconomicIdentityDetails100GetRequest rhs = ((PersonSocialEconomicIdentityDetails100GetRequest) other);
        return ((((((((this.seidCode == rhs.seidCode)||((this.seidCode!= null)&&this.seidCode.equals(rhs.seidCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.seidValue == rhs.seidValue)||((this.seidValue!= null)&&this.seidValue.equals(rhs.seidValue))))&&((this.gtvseirCode == rhs.gtvseirCode)||((this.gtvseirCode!= null)&&this.gtvseirCode.equals(rhs.gtvseirCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
