
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
    "criteria.seidCode",
    "criteria.activityDate",
    "criteria.userId",
    "criteria.seidValue",
    "seidValue",
    "gtvseirCode",
    "id",
    "gorpsidSeidCode"
})
@Generated("jsonschema2pojo")
public class PersonSocialEconomicIdentityDetails100PutRequest {

    /**
     * Gorpsid Seid Code
     * <p>
     * Lineage reference object : GORPSID_SEID_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.seidCode")
    @JsonPropertyDescription("Lineage reference object : GORPSID_SEID_CODE")
    private String criteriaSeidCode;
    /**
     * Gorpsid Activity Date
     * <p>
     * Lineage reference object : GORPSID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : GORPSID_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Gorpsid User Id
     * <p>
     * Lineage reference object : GORPSID_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : GORPSID_USER_ID")
    private String criteriaUserId;
    /**
     * Gorpsid Seid Value
     * <p>
     * Lineage reference object : GORPSID_SEID_VALUE, Lookup lineage reference object : gorseid
     * 
     */
    @JsonProperty("criteria.seidValue")
    @JsonPropertyDescription("Lineage reference object : GORPSID_SEID_VALUE, Lookup lineage reference object : gorseid")
    private String criteriaSeidValue;
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
    private String gtvseirCode;
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
     * Gorpsid Seid Code
     * <p>
     * Lineage reference object : GORPSID_SEID_CODE
     * (Required)
     * 
     */
    @JsonProperty("gorpsidSeidCode")
    @JsonPropertyDescription("Lineage reference object : GORPSID_SEID_CODE")
    private String gorpsidSeidCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gorpsid Seid Code
     * <p>
     * Lineage reference object : GORPSID_SEID_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.seidCode")
    public String getCriteriaSeidCode() {
        return criteriaSeidCode;
    }

    /**
     * Gorpsid Seid Code
     * <p>
     * Lineage reference object : GORPSID_SEID_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.seidCode")
    public void setCriteriaSeidCode(String criteriaSeidCode) {
        this.criteriaSeidCode = criteriaSeidCode;
    }

    public PersonSocialEconomicIdentityDetails100PutRequest withCriteriaSeidCode(String criteriaSeidCode) {
        this.criteriaSeidCode = criteriaSeidCode;
        return this;
    }

    /**
     * Gorpsid Activity Date
     * <p>
     * Lineage reference object : GORPSID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Gorpsid Activity Date
     * <p>
     * Lineage reference object : GORPSID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public PersonSocialEconomicIdentityDetails100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Gorpsid User Id
     * <p>
     * Lineage reference object : GORPSID_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Gorpsid User Id
     * <p>
     * Lineage reference object : GORPSID_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public PersonSocialEconomicIdentityDetails100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Gorpsid Seid Value
     * <p>
     * Lineage reference object : GORPSID_SEID_VALUE, Lookup lineage reference object : gorseid
     * 
     */
    @JsonProperty("criteria.seidValue")
    public String getCriteriaSeidValue() {
        return criteriaSeidValue;
    }

    /**
     * Gorpsid Seid Value
     * <p>
     * Lineage reference object : GORPSID_SEID_VALUE, Lookup lineage reference object : gorseid
     * 
     */
    @JsonProperty("criteria.seidValue")
    public void setCriteriaSeidValue(String criteriaSeidValue) {
        this.criteriaSeidValue = criteriaSeidValue;
    }

    public PersonSocialEconomicIdentityDetails100PutRequest withCriteriaSeidValue(String criteriaSeidValue) {
        this.criteriaSeidValue = criteriaSeidValue;
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

    public PersonSocialEconomicIdentityDetails100PutRequest withSeidValue(String seidValue) {
        this.seidValue = seidValue;
        return this;
    }

    /**
     * Lineage reference object : gtvseirCode
     * 
     */
    @JsonProperty("gtvseirCode")
    public String getGtvseirCode() {
        return gtvseirCode;
    }

    /**
     * Lineage reference object : gtvseirCode
     * 
     */
    @JsonProperty("gtvseirCode")
    public void setGtvseirCode(String gtvseirCode) {
        this.gtvseirCode = gtvseirCode;
    }

    public PersonSocialEconomicIdentityDetails100PutRequest withGtvseirCode(String gtvseirCode) {
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

    public PersonSocialEconomicIdentityDetails100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Gorpsid Seid Code
     * <p>
     * Lineage reference object : GORPSID_SEID_CODE
     * (Required)
     * 
     */
    @JsonProperty("gorpsidSeidCode")
    public String getGorpsidSeidCode() {
        return gorpsidSeidCode;
    }

    /**
     * Gorpsid Seid Code
     * <p>
     * Lineage reference object : GORPSID_SEID_CODE
     * (Required)
     * 
     */
    @JsonProperty("gorpsidSeidCode")
    public void setGorpsidSeidCode(String gorpsidSeidCode) {
        this.gorpsidSeidCode = gorpsidSeidCode;
    }

    public PersonSocialEconomicIdentityDetails100PutRequest withGorpsidSeidCode(String gorpsidSeidCode) {
        this.gorpsidSeidCode = gorpsidSeidCode;
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

    public PersonSocialEconomicIdentityDetails100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonSocialEconomicIdentityDetails100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSeidCode");
        sb.append('=');
        sb.append(((this.criteriaSeidCode == null)?"<null>":this.criteriaSeidCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaSeidValue");
        sb.append('=');
        sb.append(((this.criteriaSeidValue == null)?"<null>":this.criteriaSeidValue));
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
        sb.append("gorpsidSeidCode");
        sb.append('=');
        sb.append(((this.gorpsidSeidCode == null)?"<null>":this.gorpsidSeidCode));
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
        result = ((result* 31)+((this.criteriaSeidValue == null)? 0 :this.criteriaSeidValue.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.seidValue == null)? 0 :this.seidValue.hashCode()));
        result = ((result* 31)+((this.gtvseirCode == null)? 0 :this.gtvseirCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSeidCode == null)? 0 :this.criteriaSeidCode.hashCode()));
        result = ((result* 31)+((this.gorpsidSeidCode == null)? 0 :this.gorpsidSeidCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonSocialEconomicIdentityDetails100PutRequest) == false) {
            return false;
        }
        PersonSocialEconomicIdentityDetails100PutRequest rhs = ((PersonSocialEconomicIdentityDetails100PutRequest) other);
        return ((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaSeidValue == rhs.criteriaSeidValue)||((this.criteriaSeidValue!= null)&&this.criteriaSeidValue.equals(rhs.criteriaSeidValue))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.seidValue == rhs.seidValue)||((this.seidValue!= null)&&this.seidValue.equals(rhs.seidValue))))&&((this.gtvseirCode == rhs.gtvseirCode)||((this.gtvseirCode!= null)&&this.gtvseirCode.equals(rhs.gtvseirCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSeidCode == rhs.criteriaSeidCode)||((this.criteriaSeidCode!= null)&&this.criteriaSeidCode.equals(rhs.criteriaSeidCode))))&&((this.gorpsidSeidCode == rhs.gorpsidSeidCode)||((this.gorpsidSeidCode!= null)&&this.gorpsidSeidCode.equals(rhs.gorpsidSeidCode))));
    }

}
