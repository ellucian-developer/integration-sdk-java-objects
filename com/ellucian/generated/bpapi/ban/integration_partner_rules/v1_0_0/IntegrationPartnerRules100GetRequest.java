
package com.ellucian.generated.bpapi.ban.integration_partner_rules.v1_0_0;

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
    "activityDate",
    "integrationCde",
    "intpDesc",
    "intpCode",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class IntegrationPartnerRules100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORINTG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GORINTG_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Integration 
     * Partner Value
     * <p>
     * Lineage reference object : GORINTG_INTEGRATION_CDE
     * (Required)
     * 
     */
    @JsonProperty("integrationCde")
    @JsonPropertyDescription("Lineage reference object : GORINTG_INTEGRATION_CDE")
    private String integrationCde;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("intpDesc")
    private String intpDesc;
    /**
     * Cross Referenced
     * Partner System
     * <p>
     * Lineage reference object : GORINTG_INTP_CODE
     * (Required)
     * 
     */
    @JsonProperty("intpCode")
    @JsonPropertyDescription("Lineage reference object : GORINTG_INTP_CODE")
    private String intpCode;
    /**
     * User ID
     * <p>
     * Lineage reference object : GORINTG_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GORINTG_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * Lineage reference object : GORINTG_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GORINTG_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORINTG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORINTG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public IntegrationPartnerRules100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Integration 
     * Partner Value
     * <p>
     * Lineage reference object : GORINTG_INTEGRATION_CDE
     * (Required)
     * 
     */
    @JsonProperty("integrationCde")
    public String getIntegrationCde() {
        return integrationCde;
    }

    /**
     * Integration 
     * Partner Value
     * <p>
     * Lineage reference object : GORINTG_INTEGRATION_CDE
     * (Required)
     * 
     */
    @JsonProperty("integrationCde")
    public void setIntegrationCde(String integrationCde) {
        this.integrationCde = integrationCde;
    }

    public IntegrationPartnerRules100GetRequest withIntegrationCde(String integrationCde) {
        this.integrationCde = integrationCde;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("intpDesc")
    public String getIntpDesc() {
        return intpDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("intpDesc")
    public void setIntpDesc(String intpDesc) {
        this.intpDesc = intpDesc;
    }

    public IntegrationPartnerRules100GetRequest withIntpDesc(String intpDesc) {
        this.intpDesc = intpDesc;
        return this;
    }

    /**
     * Cross Referenced
     * Partner System
     * <p>
     * Lineage reference object : GORINTG_INTP_CODE
     * (Required)
     * 
     */
    @JsonProperty("intpCode")
    public String getIntpCode() {
        return intpCode;
    }

    /**
     * Cross Referenced
     * Partner System
     * <p>
     * Lineage reference object : GORINTG_INTP_CODE
     * (Required)
     * 
     */
    @JsonProperty("intpCode")
    public void setIntpCode(String intpCode) {
        this.intpCode = intpCode;
    }

    public IntegrationPartnerRules100GetRequest withIntpCode(String intpCode) {
        this.intpCode = intpCode;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GORINTG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GORINTG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public IntegrationPartnerRules100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GORINTG_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GORINTG_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public IntegrationPartnerRules100GetRequest withDesc(String desc) {
        this.desc = desc;
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

    public IntegrationPartnerRules100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IntegrationPartnerRules100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("integrationCde");
        sb.append('=');
        sb.append(((this.integrationCde == null)?"<null>":this.integrationCde));
        sb.append(',');
        sb.append("intpDesc");
        sb.append('=');
        sb.append(((this.intpDesc == null)?"<null>":this.intpDesc));
        sb.append(',');
        sb.append("intpCode");
        sb.append('=');
        sb.append(((this.intpCode == null)?"<null>":this.intpCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.integrationCde == null)? 0 :this.integrationCde.hashCode()));
        result = ((result* 31)+((this.intpDesc == null)? 0 :this.intpDesc.hashCode()));
        result = ((result* 31)+((this.intpCode == null)? 0 :this.intpCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IntegrationPartnerRules100GetRequest) == false) {
            return false;
        }
        IntegrationPartnerRules100GetRequest rhs = ((IntegrationPartnerRules100GetRequest) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.integrationCde == rhs.integrationCde)||((this.integrationCde!= null)&&this.integrationCde.equals(rhs.integrationCde))))&&((this.intpDesc == rhs.intpDesc)||((this.intpDesc!= null)&&this.intpDesc.equals(rhs.intpDesc))))&&((this.intpCode == rhs.intpCode)||((this.intpCode!= null)&&this.intpCode.equals(rhs.intpCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
