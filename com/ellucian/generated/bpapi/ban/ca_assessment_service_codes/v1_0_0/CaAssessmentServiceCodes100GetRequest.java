
package com.ellucian.generated.bpapi.ban.ca_assessment_service_codes.v1_0_0;

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
    "assessmentOpt",
    "code",
    "noncreditServiceInd",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class CaAssessmentServiceCodes100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVASST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SVVASST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Assessment Service
     * <p>
     * Lineage reference object : SVVASST_ASSESSMENT_OPT
     * (Required)
     * 
     */
    @JsonProperty("assessmentOpt")
    @JsonPropertyDescription("Lineage reference object : SVVASST_ASSESSMENT_OPT")
    private String assessmentOpt;
    /**
     * Code
     * <p>
     * Lineage reference object : SVVASST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : SVVASST_CODE")
    private String code;
    /**
     * Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("noncreditServiceInd")
    @JsonPropertyDescription("Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND")
    private String noncreditServiceInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : SVVASST_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SVVASST_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * Lineage reference object : SVVASST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SVVASST_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVASST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SVVASST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaAssessmentServiceCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Assessment Service
     * <p>
     * Lineage reference object : SVVASST_ASSESSMENT_OPT
     * (Required)
     * 
     */
    @JsonProperty("assessmentOpt")
    public String getAssessmentOpt() {
        return assessmentOpt;
    }

    /**
     * Assessment Service
     * <p>
     * Lineage reference object : SVVASST_ASSESSMENT_OPT
     * (Required)
     * 
     */
    @JsonProperty("assessmentOpt")
    public void setAssessmentOpt(String assessmentOpt) {
        this.assessmentOpt = assessmentOpt;
    }

    public CaAssessmentServiceCodes100GetRequest withAssessmentOpt(String assessmentOpt) {
        this.assessmentOpt = assessmentOpt;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVASST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SVVASST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaAssessmentServiceCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("noncreditServiceInd")
    public String getNoncreditServiceInd() {
        return noncreditServiceInd;
    }

    /**
     * Lineage reference object : SVVASST_NONCREDIT_SERVICE_IND
     * 
     */
    @JsonProperty("noncreditServiceInd")
    public void setNoncreditServiceInd(String noncreditServiceInd) {
        this.noncreditServiceInd = noncreditServiceInd;
    }

    public CaAssessmentServiceCodes100GetRequest withNoncreditServiceInd(String noncreditServiceInd) {
        this.noncreditServiceInd = noncreditServiceInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVVASST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SVVASST_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CaAssessmentServiceCodes100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SVVASST_DESC
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
     * Lineage reference object : SVVASST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaAssessmentServiceCodes100GetRequest withDesc(String desc) {
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

    public CaAssessmentServiceCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaAssessmentServiceCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("assessmentOpt");
        sb.append('=');
        sb.append(((this.assessmentOpt == null)?"<null>":this.assessmentOpt));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("noncreditServiceInd");
        sb.append('=');
        sb.append(((this.noncreditServiceInd == null)?"<null>":this.noncreditServiceInd));
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
        result = ((result* 31)+((this.assessmentOpt == null)? 0 :this.assessmentOpt.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.noncreditServiceInd == null)? 0 :this.noncreditServiceInd.hashCode()));
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
        if ((other instanceof CaAssessmentServiceCodes100GetRequest) == false) {
            return false;
        }
        CaAssessmentServiceCodes100GetRequest rhs = ((CaAssessmentServiceCodes100GetRequest) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.assessmentOpt == rhs.assessmentOpt)||((this.assessmentOpt!= null)&&this.assessmentOpt.equals(rhs.assessmentOpt))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.noncreditServiceInd == rhs.noncreditServiceInd)||((this.noncreditServiceInd!= null)&&this.noncreditServiceInd.equals(rhs.noncreditServiceInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
