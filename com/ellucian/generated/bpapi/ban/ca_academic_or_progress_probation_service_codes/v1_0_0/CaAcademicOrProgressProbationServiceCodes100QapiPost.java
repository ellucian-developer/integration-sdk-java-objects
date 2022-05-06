
package com.ellucian.generated.bpapi.ban.ca_academic_or_progress_probation_service_codes.v1_0_0;

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
    "acProgProbOpt",
    "code",
    "desc",
    "userId"
})
@Generated("jsonschema2pojo")
public class CaAcademicOrProgressProbationServiceCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVPRST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVVPRST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Probation Support Service
     * <p>
     * Lineage reference object : SVVPRST_AC_PROG_PROB_OPT
     * 
     */
    @JsonProperty("acProgProbOpt")
    @JsonPropertyDescription("Lineage reference object : SVVPRST_AC_PROG_PROB_OPT")
    private String acProgProbOpt;
    /**
     * Code
     * <p>
     * Lineage reference object : SVVPRST_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : SVVPRST_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : SVVPRST_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SVVPRST_DESC")
    private String desc;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVVPRST_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVVPRST_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVPRST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVPRST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaAcademicOrProgressProbationServiceCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Probation Support Service
     * <p>
     * Lineage reference object : SVVPRST_AC_PROG_PROB_OPT
     * 
     */
    @JsonProperty("acProgProbOpt")
    public String getAcProgProbOpt() {
        return acProgProbOpt;
    }

    /**
     * Probation Support Service
     * <p>
     * Lineage reference object : SVVPRST_AC_PROG_PROB_OPT
     * 
     */
    @JsonProperty("acProgProbOpt")
    public void setAcProgProbOpt(String acProgProbOpt) {
        this.acProgProbOpt = acProgProbOpt;
    }

    public CaAcademicOrProgressProbationServiceCodes100QapiPost withAcProgProbOpt(String acProgProbOpt) {
        this.acProgProbOpt = acProgProbOpt;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVPRST_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVPRST_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaAcademicOrProgressProbationServiceCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVPRST_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVPRST_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaAcademicOrProgressProbationServiceCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVVPRST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVVPRST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CaAcademicOrProgressProbationServiceCodes100QapiPost withUserId(String userId) {
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

    public CaAcademicOrProgressProbationServiceCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaAcademicOrProgressProbationServiceCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("acProgProbOpt");
        sb.append('=');
        sb.append(((this.acProgProbOpt == null)?"<null>":this.acProgProbOpt));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.acProgProbOpt == null)? 0 :this.acProgProbOpt.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaAcademicOrProgressProbationServiceCodes100QapiPost) == false) {
            return false;
        }
        CaAcademicOrProgressProbationServiceCodes100QapiPost rhs = ((CaAcademicOrProgressProbationServiceCodes100QapiPost) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.acProgProbOpt == rhs.acProgProbOpt)||((this.acProgProbOpt!= null)&&this.acProgProbOpt.equals(rhs.acProgProbOpt))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
