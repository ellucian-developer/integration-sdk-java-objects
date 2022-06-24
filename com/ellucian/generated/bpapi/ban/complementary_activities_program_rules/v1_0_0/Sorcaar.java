
package com.ellucian.generated.bpapi.ban.complementary_activities_program_rules.v1_0_0;

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
    "reqHrsActivity",
    "activityDate",
    "reqCreditsActivity",
    "actvDesc",
    "userId",
    "actcCode"
})
@Generated("jsonschema2pojo")
public class Sorcaar {

    /**
     * Lineage reference object : SORCAAR_REQ_HOURS_ACTIVITY
     * 
     */
    @JsonProperty("reqHrsActivity")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_REQ_HOURS_ACTIVITY")
    private Double reqHrsActivity;
    /**
     * Lineage reference object : SORCAAR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY
     * 
     */
    @JsonProperty("reqCreditsActivity")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY")
    private Double reqCreditsActivity;
    @JsonProperty("actvDesc")
    private String actvDesc;
    /**
     * Lineage reference object : SORCAAR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    @JsonPropertyDescription("Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC")
    private String actcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORCAAR_REQ_HOURS_ACTIVITY
     * 
     */
    @JsonProperty("reqHrsActivity")
    public Double getReqHrsActivity() {
        return reqHrsActivity;
    }

    /**
     * Lineage reference object : SORCAAR_REQ_HOURS_ACTIVITY
     * 
     */
    @JsonProperty("reqHrsActivity")
    public void setReqHrsActivity(Double reqHrsActivity) {
        this.reqHrsActivity = reqHrsActivity;
    }

    public Sorcaar withReqHrsActivity(Double reqHrsActivity) {
        this.reqHrsActivity = reqHrsActivity;
        return this;
    }

    /**
     * Lineage reference object : SORCAAR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORCAAR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorcaar withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY
     * 
     */
    @JsonProperty("reqCreditsActivity")
    public Double getReqCreditsActivity() {
        return reqCreditsActivity;
    }

    /**
     * Lineage reference object : SORCAAR_REQ_CREDITS_ACTIVITY
     * 
     */
    @JsonProperty("reqCreditsActivity")
    public void setReqCreditsActivity(Double reqCreditsActivity) {
        this.reqCreditsActivity = reqCreditsActivity;
    }

    public Sorcaar withReqCreditsActivity(Double reqCreditsActivity) {
        this.reqCreditsActivity = reqCreditsActivity;
        return this;
    }

    @JsonProperty("actvDesc")
    public String getActvDesc() {
        return actvDesc;
    }

    @JsonProperty("actvDesc")
    public void setActvDesc(String actvDesc) {
        this.actvDesc = actvDesc;
    }

    public Sorcaar withActvDesc(String actvDesc) {
        this.actvDesc = actvDesc;
        return this;
    }

    /**
     * Lineage reference object : SORCAAR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORCAAR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorcaar withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    /**
     * Lineage reference object : SORCAAR_ACTC_CODE, Lookup lineage reference object : STVACTC
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public Sorcaar withActcCode(String actcCode) {
        this.actcCode = actcCode;
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

    public Sorcaar withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorcaar.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqHrsActivity");
        sb.append('=');
        sb.append(((this.reqHrsActivity == null)?"<null>":this.reqHrsActivity));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("reqCreditsActivity");
        sb.append('=');
        sb.append(((this.reqCreditsActivity == null)?"<null>":this.reqCreditsActivity));
        sb.append(',');
        sb.append("actvDesc");
        sb.append('=');
        sb.append(((this.actvDesc == null)?"<null>":this.actvDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
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
        result = ((result* 31)+((this.reqHrsActivity == null)? 0 :this.reqHrsActivity.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.reqCreditsActivity == null)? 0 :this.reqCreditsActivity.hashCode()));
        result = ((result* 31)+((this.actvDesc == null)? 0 :this.actvDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorcaar) == false) {
            return false;
        }
        Sorcaar rhs = ((Sorcaar) other);
        return ((((((((this.reqHrsActivity == rhs.reqHrsActivity)||((this.reqHrsActivity!= null)&&this.reqHrsActivity.equals(rhs.reqHrsActivity)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.reqCreditsActivity == rhs.reqCreditsActivity)||((this.reqCreditsActivity!= null)&&this.reqCreditsActivity.equals(rhs.reqCreditsActivity))))&&((this.actvDesc == rhs.actvDesc)||((this.actvDesc!= null)&&this.actvDesc.equals(rhs.actvDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))));
    }

}
