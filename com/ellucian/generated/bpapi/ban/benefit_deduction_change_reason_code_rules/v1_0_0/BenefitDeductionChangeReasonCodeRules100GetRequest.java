
package com.ellucian.generated.bpapi.ban.benefit_deduction_change_reason_code_rules.v1_0_0;

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
    "code",
    "activityDate",
    "deductionChgType",
    "lifechgEnrollDays",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class BenefitDeductionChangeReasonCodeRules100GetRequest {

    /**
     * Deduction Change Reason Code
     * <p>
     * Lineage reference object : PTRBREA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTRBREA_CODE")
    private String code;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBREA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRBREA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Deduction Change Type
     * <p>
     * Lineage reference object : PTRBREA_DEDUCTION_CHG_TYPE
     * (Required)
     * 
     */
    @JsonProperty("deductionChgType")
    @JsonPropertyDescription("Lineage reference object : PTRBREA_DEDUCTION_CHG_TYPE")
    private String deductionChgType;
    /**
     * Life Event Enrollment Days
     * <p>
     * Lineage reference object : PTRBREA_LIFECHG_ENROLL_DAYS
     * 
     */
    @JsonProperty("lifechgEnrollDays")
    @JsonPropertyDescription("Lineage reference object : PTRBREA_LIFECHG_ENROLL_DAYS")
    private Double lifechgEnrollDays;
    /**
     * User ID
     * <p>
     * Lineage reference object : PTRBREA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PTRBREA_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * Lineage reference object : PTRBREA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTRBREA_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Deduction Change Reason Code
     * <p>
     * Lineage reference object : PTRBREA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Deduction Change Reason Code
     * <p>
     * Lineage reference object : PTRBREA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public BenefitDeductionChangeReasonCodeRules100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBREA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBREA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BenefitDeductionChangeReasonCodeRules100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Deduction Change Type
     * <p>
     * Lineage reference object : PTRBREA_DEDUCTION_CHG_TYPE
     * (Required)
     * 
     */
    @JsonProperty("deductionChgType")
    public String getDeductionChgType() {
        return deductionChgType;
    }

    /**
     * Deduction Change Type
     * <p>
     * Lineage reference object : PTRBREA_DEDUCTION_CHG_TYPE
     * (Required)
     * 
     */
    @JsonProperty("deductionChgType")
    public void setDeductionChgType(String deductionChgType) {
        this.deductionChgType = deductionChgType;
    }

    public BenefitDeductionChangeReasonCodeRules100GetRequest withDeductionChgType(String deductionChgType) {
        this.deductionChgType = deductionChgType;
        return this;
    }

    /**
     * Life Event Enrollment Days
     * <p>
     * Lineage reference object : PTRBREA_LIFECHG_ENROLL_DAYS
     * 
     */
    @JsonProperty("lifechgEnrollDays")
    public Double getLifechgEnrollDays() {
        return lifechgEnrollDays;
    }

    /**
     * Life Event Enrollment Days
     * <p>
     * Lineage reference object : PTRBREA_LIFECHG_ENROLL_DAYS
     * 
     */
    @JsonProperty("lifechgEnrollDays")
    public void setLifechgEnrollDays(Double lifechgEnrollDays) {
        this.lifechgEnrollDays = lifechgEnrollDays;
    }

    public BenefitDeductionChangeReasonCodeRules100GetRequest withLifechgEnrollDays(Double lifechgEnrollDays) {
        this.lifechgEnrollDays = lifechgEnrollDays;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : PTRBREA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : PTRBREA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BenefitDeductionChangeReasonCodeRules100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRBREA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRBREA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BenefitDeductionChangeReasonCodeRules100GetRequest withDesc(String desc) {
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

    public BenefitDeductionChangeReasonCodeRules100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitDeductionChangeReasonCodeRules100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("deductionChgType");
        sb.append('=');
        sb.append(((this.deductionChgType == null)?"<null>":this.deductionChgType));
        sb.append(',');
        sb.append("lifechgEnrollDays");
        sb.append('=');
        sb.append(((this.lifechgEnrollDays == null)?"<null>":this.lifechgEnrollDays));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.deductionChgType == null)? 0 :this.deductionChgType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lifechgEnrollDays == null)? 0 :this.lifechgEnrollDays.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitDeductionChangeReasonCodeRules100GetRequest) == false) {
            return false;
        }
        BenefitDeductionChangeReasonCodeRules100GetRequest rhs = ((BenefitDeductionChangeReasonCodeRules100GetRequest) other);
        return ((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.deductionChgType == rhs.deductionChgType)||((this.deductionChgType!= null)&&this.deductionChgType.equals(rhs.deductionChgType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lifechgEnrollDays == rhs.lifechgEnrollDays)||((this.lifechgEnrollDays!= null)&&this.lifechgEnrollDays.equals(rhs.lifechgEnrollDays))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
