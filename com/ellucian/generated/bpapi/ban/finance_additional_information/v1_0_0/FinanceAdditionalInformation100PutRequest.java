
package com.ellucian.generated.bpapi.ban.finance_additional_information.v1_0_0;

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
    "additionalId",
    "criteria.userId",
    "criteria.activityDate",
    "criteria.additionalId",
    "adidCode",
    "criteria.adidCode",
    "id"
})
@Generated("jsonschema2pojo")
public class FinanceAdditionalInformation100PutRequest {

    /**
     * Additional Identification
     * <p>
     * Lineage reference object : GORADID_ADDITIONAL_ID
     * 
     */
    @JsonProperty("additionalId")
    @JsonPropertyDescription("Lineage reference object : GORADID_ADDITIONAL_ID")
    private String additionalId;
    /**
     * User
     * <p>
     * Lineage reference object : GORADID_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : GORADID_USER_ID")
    private String criteriaUserId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORADID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : GORADID_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Additional Identification
     * <p>
     * Lineage reference object : GORADID_ADDITIONAL_ID
     * 
     */
    @JsonProperty("criteria.additionalId")
    @JsonPropertyDescription("Lineage reference object : GORADID_ADDITIONAL_ID")
    private String criteriaAdditionalId;
    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    @JsonPropertyDescription("Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid")
    private String adidCode;
    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("criteria.adidCode")
    @JsonPropertyDescription("Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid")
    private String criteriaAdidCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Additional Identification
     * <p>
     * Lineage reference object : GORADID_ADDITIONAL_ID
     * 
     */
    @JsonProperty("additionalId")
    public String getAdditionalId() {
        return additionalId;
    }

    /**
     * Additional Identification
     * <p>
     * Lineage reference object : GORADID_ADDITIONAL_ID
     * 
     */
    @JsonProperty("additionalId")
    public void setAdditionalId(String additionalId) {
        this.additionalId = additionalId;
    }

    public FinanceAdditionalInformation100PutRequest withAdditionalId(String additionalId) {
        this.additionalId = additionalId;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GORADID_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GORADID_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public FinanceAdditionalInformation100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORADID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORADID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public FinanceAdditionalInformation100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Additional Identification
     * <p>
     * Lineage reference object : GORADID_ADDITIONAL_ID
     * 
     */
    @JsonProperty("criteria.additionalId")
    public String getCriteriaAdditionalId() {
        return criteriaAdditionalId;
    }

    /**
     * Additional Identification
     * <p>
     * Lineage reference object : GORADID_ADDITIONAL_ID
     * 
     */
    @JsonProperty("criteria.additionalId")
    public void setCriteriaAdditionalId(String criteriaAdditionalId) {
        this.criteriaAdditionalId = criteriaAdditionalId;
    }

    public FinanceAdditionalInformation100PutRequest withCriteriaAdditionalId(String criteriaAdditionalId) {
        this.criteriaAdditionalId = criteriaAdditionalId;
        return this;
    }

    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    public String getAdidCode() {
        return adidCode;
    }

    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    public void setAdidCode(String adidCode) {
        this.adidCode = adidCode;
    }

    public FinanceAdditionalInformation100PutRequest withAdidCode(String adidCode) {
        this.adidCode = adidCode;
        return this;
    }

    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("criteria.adidCode")
    public String getCriteriaAdidCode() {
        return criteriaAdidCode;
    }

    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("criteria.adidCode")
    public void setCriteriaAdidCode(String criteriaAdidCode) {
        this.criteriaAdidCode = criteriaAdidCode;
    }

    public FinanceAdditionalInformation100PutRequest withCriteriaAdidCode(String criteriaAdidCode) {
        this.criteriaAdidCode = criteriaAdidCode;
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

    public FinanceAdditionalInformation100PutRequest withId(String id) {
        this.id = id;
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

    public FinanceAdditionalInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceAdditionalInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("additionalId");
        sb.append('=');
        sb.append(((this.additionalId == null)?"<null>":this.additionalId));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaAdditionalId");
        sb.append('=');
        sb.append(((this.criteriaAdditionalId == null)?"<null>":this.criteriaAdditionalId));
        sb.append(',');
        sb.append("adidCode");
        sb.append('=');
        sb.append(((this.adidCode == null)?"<null>":this.adidCode));
        sb.append(',');
        sb.append("criteriaAdidCode");
        sb.append('=');
        sb.append(((this.criteriaAdidCode == null)?"<null>":this.criteriaAdidCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.criteriaAdditionalId == null)? 0 :this.criteriaAdditionalId.hashCode()));
        result = ((result* 31)+((this.additionalId == null)? 0 :this.additionalId.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaAdidCode == null)? 0 :this.criteriaAdidCode.hashCode()));
        result = ((result* 31)+((this.adidCode == null)? 0 :this.adidCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceAdditionalInformation100PutRequest) == false) {
            return false;
        }
        FinanceAdditionalInformation100PutRequest rhs = ((FinanceAdditionalInformation100PutRequest) other);
        return (((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaAdditionalId == rhs.criteriaAdditionalId)||((this.criteriaAdditionalId!= null)&&this.criteriaAdditionalId.equals(rhs.criteriaAdditionalId))))&&((this.additionalId == rhs.additionalId)||((this.additionalId!= null)&&this.additionalId.equals(rhs.additionalId))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaAdidCode == rhs.criteriaAdidCode)||((this.criteriaAdidCode!= null)&&this.criteriaAdidCode.equals(rhs.criteriaAdidCode))))&&((this.adidCode == rhs.adidCode)||((this.adidCode!= null)&&this.adidCode.equals(rhs.adidCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
