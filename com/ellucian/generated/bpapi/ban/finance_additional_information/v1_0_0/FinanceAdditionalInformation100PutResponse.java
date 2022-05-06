
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
    "adidDesc",
    "additionalId",
    "activityDate",
    "adidCode",
    "userId"
})
@Generated("jsonschema2pojo")
public class FinanceAdditionalInformation100PutResponse {

    /**
     * ID Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("adidDesc")
    private String adidDesc;
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
     * Activity Date
     * <p>
     * Lineage reference object : GORADID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GORADID_ACTIVITY_DATE")
    private Date activityDate;
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
     * User
     * <p>
     * Lineage reference object : GORADID_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GORADID_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("adidDesc")
    public String getAdidDesc() {
        return adidDesc;
    }

    /**
     * ID Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("adidDesc")
    public void setAdidDesc(String adidDesc) {
        this.adidDesc = adidDesc;
    }

    public FinanceAdditionalInformation100PutResponse withAdidDesc(String adidDesc) {
        this.adidDesc = adidDesc;
        return this;
    }

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

    public FinanceAdditionalInformation100PutResponse withAdditionalId(String additionalId) {
        this.additionalId = additionalId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORADID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORADID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FinanceAdditionalInformation100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public FinanceAdditionalInformation100PutResponse withAdidCode(String adidCode) {
        this.adidCode = adidCode;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GORADID_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GORADID_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FinanceAdditionalInformation100PutResponse withUserId(String userId) {
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

    public FinanceAdditionalInformation100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceAdditionalInformation100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adidDesc");
        sb.append('=');
        sb.append(((this.adidDesc == null)?"<null>":this.adidDesc));
        sb.append(',');
        sb.append("additionalId");
        sb.append('=');
        sb.append(((this.additionalId == null)?"<null>":this.additionalId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("adidCode");
        sb.append('=');
        sb.append(((this.adidCode == null)?"<null>":this.adidCode));
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
        result = ((result* 31)+((this.adidDesc == null)? 0 :this.adidDesc.hashCode()));
        result = ((result* 31)+((this.additionalId == null)? 0 :this.additionalId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.adidCode == null)? 0 :this.adidCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceAdditionalInformation100PutResponse) == false) {
            return false;
        }
        FinanceAdditionalInformation100PutResponse rhs = ((FinanceAdditionalInformation100PutResponse) other);
        return (((((((this.adidDesc == rhs.adidDesc)||((this.adidDesc!= null)&&this.adidDesc.equals(rhs.adidDesc)))&&((this.additionalId == rhs.additionalId)||((this.additionalId!= null)&&this.additionalId.equals(rhs.additionalId))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.adidCode == rhs.adidCode)||((this.adidCode!= null)&&this.adidCode.equals(rhs.adidCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
