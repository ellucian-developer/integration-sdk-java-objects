
package com.ellucian.generated.bpapi.ban.cost_center_codes.v1_0_0;

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
    "stvvctcrDesc",
    "activityDate",
    "code",
    "userId"
})
@Generated("jsonschema2pojo")
public class CostCenterCodes100GetRequest {

    /**
     * Description
     * <p>
     * Lineage reference object : TVVCTCR_DESC
     * (Required)
     * 
     */
    @JsonProperty("stvvctcrDesc")
    @JsonPropertyDescription("Lineage reference object : TVVCTCR_DESC")
    private String stvvctcrDesc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TVVCTCR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TVVCTCR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Cost Center Code
     * <p>
     * Lineage reference object : TVVCTCR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : TVVCTCR_CODE")
    private String code;
    /**
     * User ID
     * <p>
     * Lineage reference object : TVVCTCR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : TVVCTCR_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * Lineage reference object : TVVCTCR_DESC
     * (Required)
     * 
     */
    @JsonProperty("stvvctcrDesc")
    public String getStvvctcrDesc() {
        return stvvctcrDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TVVCTCR_DESC
     * (Required)
     * 
     */
    @JsonProperty("stvvctcrDesc")
    public void setStvvctcrDesc(String stvvctcrDesc) {
        this.stvvctcrDesc = stvvctcrDesc;
    }

    public CostCenterCodes100GetRequest withStvvctcrDesc(String stvvctcrDesc) {
        this.stvvctcrDesc = stvvctcrDesc;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TVVCTCR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TVVCTCR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CostCenterCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Cost Center Code
     * <p>
     * Lineage reference object : TVVCTCR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Cost Center Code
     * <p>
     * Lineage reference object : TVVCTCR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CostCenterCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TVVCTCR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TVVCTCR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CostCenterCodes100GetRequest withUserId(String userId) {
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

    public CostCenterCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CostCenterCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvvctcrDesc");
        sb.append('=');
        sb.append(((this.stvvctcrDesc == null)?"<null>":this.stvvctcrDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        result = ((result* 31)+((this.stvvctcrDesc == null)? 0 :this.stvvctcrDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CostCenterCodes100GetRequest) == false) {
            return false;
        }
        CostCenterCodes100GetRequest rhs = ((CostCenterCodes100GetRequest) other);
        return ((((((this.stvvctcrDesc == rhs.stvvctcrDesc)||((this.stvvctcrDesc!= null)&&this.stvvctcrDesc.equals(rhs.stvvctcrDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
