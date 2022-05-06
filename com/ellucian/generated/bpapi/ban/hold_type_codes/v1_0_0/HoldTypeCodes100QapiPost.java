
package com.ellucian.generated.bpapi.ban.hold_type_codes.v1_0_0;

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
    "applicationHoldInd",
    "arHoldInd",
    "code",
    "complianceHoldInd",
    "desc",
    "dispWebInd",
    "envHoldInd",
    "gradeHoldInd",
    "gradHoldInd",
    "regHoldInd",
    "transHoldInd",
    "vrMsgNo"
})
@Generated("jsonschema2pojo")
public class HoldTypeCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVHLDD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVHLDD_APPLICATION_HOLD_IND
     * 
     */
    @JsonProperty("applicationHoldInd")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_APPLICATION_HOLD_IND")
    private String applicationHoldInd;
    /**
     * Lineage reference object : STVHLDD_AR_HOLD_IND
     * 
     */
    @JsonProperty("arHoldInd")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_AR_HOLD_IND")
    private String arHoldInd;
    /**
     * Code
     * <p>
     * Lineage reference object : STVHLDD_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_CODE")
    private String code;
    /**
     * Lineage reference object : STVHLDD_COMPLIANCE_HOLD_IND
     * 
     */
    @JsonProperty("complianceHoldInd")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_COMPLIANCE_HOLD_IND")
    private String complianceHoldInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVHLDD_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_DESC")
    private String desc;
    /**
     * Lineage reference object : STVHLDD_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_DISP_WEB_IND")
    private String dispWebInd;
    /**
     * Lineage reference object : STVHLDD_ENV_HOLD_IND
     * 
     */
    @JsonProperty("envHoldInd")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_ENV_HOLD_IND")
    private String envHoldInd;
    /**
     * Lineage reference object : STVHLDD_GRADE_HOLD_IND
     * 
     */
    @JsonProperty("gradeHoldInd")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_GRADE_HOLD_IND")
    private String gradeHoldInd;
    /**
     * Lineage reference object : STVHLDD_GRAD_HOLD_IND
     * 
     */
    @JsonProperty("gradHoldInd")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_GRAD_HOLD_IND")
    private String gradHoldInd;
    /**
     * Lineage reference object : STVHLDD_REG_HOLD_IND
     * 
     */
    @JsonProperty("regHoldInd")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_REG_HOLD_IND")
    private String regHoldInd;
    /**
     * Lineage reference object : STVHLDD_TRANS_HOLD_IND
     * 
     */
    @JsonProperty("transHoldInd")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_TRANS_HOLD_IND")
    private String transHoldInd;
    /**
     * Voice Message
     * <p>
     * Lineage reference object : STVHLDD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVHLDD_VR_MSG_NO")
    private Double vrMsgNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVHLDD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVHLDD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public HoldTypeCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVHLDD_APPLICATION_HOLD_IND
     * 
     */
    @JsonProperty("applicationHoldInd")
    public String getApplicationHoldInd() {
        return applicationHoldInd;
    }

    /**
     * Lineage reference object : STVHLDD_APPLICATION_HOLD_IND
     * 
     */
    @JsonProperty("applicationHoldInd")
    public void setApplicationHoldInd(String applicationHoldInd) {
        this.applicationHoldInd = applicationHoldInd;
    }

    public HoldTypeCodes100QapiPost withApplicationHoldInd(String applicationHoldInd) {
        this.applicationHoldInd = applicationHoldInd;
        return this;
    }

    /**
     * Lineage reference object : STVHLDD_AR_HOLD_IND
     * 
     */
    @JsonProperty("arHoldInd")
    public String getArHoldInd() {
        return arHoldInd;
    }

    /**
     * Lineage reference object : STVHLDD_AR_HOLD_IND
     * 
     */
    @JsonProperty("arHoldInd")
    public void setArHoldInd(String arHoldInd) {
        this.arHoldInd = arHoldInd;
    }

    public HoldTypeCodes100QapiPost withArHoldInd(String arHoldInd) {
        this.arHoldInd = arHoldInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVHLDD_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVHLDD_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public HoldTypeCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVHLDD_COMPLIANCE_HOLD_IND
     * 
     */
    @JsonProperty("complianceHoldInd")
    public String getComplianceHoldInd() {
        return complianceHoldInd;
    }

    /**
     * Lineage reference object : STVHLDD_COMPLIANCE_HOLD_IND
     * 
     */
    @JsonProperty("complianceHoldInd")
    public void setComplianceHoldInd(String complianceHoldInd) {
        this.complianceHoldInd = complianceHoldInd;
    }

    public HoldTypeCodes100QapiPost withComplianceHoldInd(String complianceHoldInd) {
        this.complianceHoldInd = complianceHoldInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVHLDD_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVHLDD_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public HoldTypeCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : STVHLDD_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public String getDispWebInd() {
        return dispWebInd;
    }

    /**
     * Lineage reference object : STVHLDD_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public void setDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
    }

    public HoldTypeCodes100QapiPost withDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
        return this;
    }

    /**
     * Lineage reference object : STVHLDD_ENV_HOLD_IND
     * 
     */
    @JsonProperty("envHoldInd")
    public String getEnvHoldInd() {
        return envHoldInd;
    }

    /**
     * Lineage reference object : STVHLDD_ENV_HOLD_IND
     * 
     */
    @JsonProperty("envHoldInd")
    public void setEnvHoldInd(String envHoldInd) {
        this.envHoldInd = envHoldInd;
    }

    public HoldTypeCodes100QapiPost withEnvHoldInd(String envHoldInd) {
        this.envHoldInd = envHoldInd;
        return this;
    }

    /**
     * Lineage reference object : STVHLDD_GRADE_HOLD_IND
     * 
     */
    @JsonProperty("gradeHoldInd")
    public String getGradeHoldInd() {
        return gradeHoldInd;
    }

    /**
     * Lineage reference object : STVHLDD_GRADE_HOLD_IND
     * 
     */
    @JsonProperty("gradeHoldInd")
    public void setGradeHoldInd(String gradeHoldInd) {
        this.gradeHoldInd = gradeHoldInd;
    }

    public HoldTypeCodes100QapiPost withGradeHoldInd(String gradeHoldInd) {
        this.gradeHoldInd = gradeHoldInd;
        return this;
    }

    /**
     * Lineage reference object : STVHLDD_GRAD_HOLD_IND
     * 
     */
    @JsonProperty("gradHoldInd")
    public String getGradHoldInd() {
        return gradHoldInd;
    }

    /**
     * Lineage reference object : STVHLDD_GRAD_HOLD_IND
     * 
     */
    @JsonProperty("gradHoldInd")
    public void setGradHoldInd(String gradHoldInd) {
        this.gradHoldInd = gradHoldInd;
    }

    public HoldTypeCodes100QapiPost withGradHoldInd(String gradHoldInd) {
        this.gradHoldInd = gradHoldInd;
        return this;
    }

    /**
     * Lineage reference object : STVHLDD_REG_HOLD_IND
     * 
     */
    @JsonProperty("regHoldInd")
    public String getRegHoldInd() {
        return regHoldInd;
    }

    /**
     * Lineage reference object : STVHLDD_REG_HOLD_IND
     * 
     */
    @JsonProperty("regHoldInd")
    public void setRegHoldInd(String regHoldInd) {
        this.regHoldInd = regHoldInd;
    }

    public HoldTypeCodes100QapiPost withRegHoldInd(String regHoldInd) {
        this.regHoldInd = regHoldInd;
        return this;
    }

    /**
     * Lineage reference object : STVHLDD_TRANS_HOLD_IND
     * 
     */
    @JsonProperty("transHoldInd")
    public String getTransHoldInd() {
        return transHoldInd;
    }

    /**
     * Lineage reference object : STVHLDD_TRANS_HOLD_IND
     * 
     */
    @JsonProperty("transHoldInd")
    public void setTransHoldInd(String transHoldInd) {
        this.transHoldInd = transHoldInd;
    }

    public HoldTypeCodes100QapiPost withTransHoldInd(String transHoldInd) {
        this.transHoldInd = transHoldInd;
        return this;
    }

    /**
     * Voice Message
     * <p>
     * Lineage reference object : STVHLDD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Message
     * <p>
     * Lineage reference object : STVHLDD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public HoldTypeCodes100QapiPost withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
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

    public HoldTypeCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HoldTypeCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("applicationHoldInd");
        sb.append('=');
        sb.append(((this.applicationHoldInd == null)?"<null>":this.applicationHoldInd));
        sb.append(',');
        sb.append("arHoldInd");
        sb.append('=');
        sb.append(((this.arHoldInd == null)?"<null>":this.arHoldInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("complianceHoldInd");
        sb.append('=');
        sb.append(((this.complianceHoldInd == null)?"<null>":this.complianceHoldInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("dispWebInd");
        sb.append('=');
        sb.append(((this.dispWebInd == null)?"<null>":this.dispWebInd));
        sb.append(',');
        sb.append("envHoldInd");
        sb.append('=');
        sb.append(((this.envHoldInd == null)?"<null>":this.envHoldInd));
        sb.append(',');
        sb.append("gradeHoldInd");
        sb.append('=');
        sb.append(((this.gradeHoldInd == null)?"<null>":this.gradeHoldInd));
        sb.append(',');
        sb.append("gradHoldInd");
        sb.append('=');
        sb.append(((this.gradHoldInd == null)?"<null>":this.gradHoldInd));
        sb.append(',');
        sb.append("regHoldInd");
        sb.append('=');
        sb.append(((this.regHoldInd == null)?"<null>":this.regHoldInd));
        sb.append(',');
        sb.append("transHoldInd");
        sb.append('=');
        sb.append(((this.transHoldInd == null)?"<null>":this.transHoldInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
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
        result = ((result* 31)+((this.envHoldInd == null)? 0 :this.envHoldInd.hashCode()));
        result = ((result* 31)+((this.gradeHoldInd == null)? 0 :this.gradeHoldInd.hashCode()));
        result = ((result* 31)+((this.arHoldInd == null)? 0 :this.arHoldInd.hashCode()));
        result = ((result* 31)+((this.complianceHoldInd == null)? 0 :this.complianceHoldInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.gradHoldInd == null)? 0 :this.gradHoldInd.hashCode()));
        result = ((result* 31)+((this.regHoldInd == null)? 0 :this.regHoldInd.hashCode()));
        result = ((result* 31)+((this.applicationHoldInd == null)? 0 :this.applicationHoldInd.hashCode()));
        result = ((result* 31)+((this.dispWebInd == null)? 0 :this.dispWebInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.transHoldInd == null)? 0 :this.transHoldInd.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HoldTypeCodes100QapiPost) == false) {
            return false;
        }
        HoldTypeCodes100QapiPost rhs = ((HoldTypeCodes100QapiPost) other);
        return (((((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.envHoldInd == rhs.envHoldInd)||((this.envHoldInd!= null)&&this.envHoldInd.equals(rhs.envHoldInd))))&&((this.gradeHoldInd == rhs.gradeHoldInd)||((this.gradeHoldInd!= null)&&this.gradeHoldInd.equals(rhs.gradeHoldInd))))&&((this.arHoldInd == rhs.arHoldInd)||((this.arHoldInd!= null)&&this.arHoldInd.equals(rhs.arHoldInd))))&&((this.complianceHoldInd == rhs.complianceHoldInd)||((this.complianceHoldInd!= null)&&this.complianceHoldInd.equals(rhs.complianceHoldInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.gradHoldInd == rhs.gradHoldInd)||((this.gradHoldInd!= null)&&this.gradHoldInd.equals(rhs.gradHoldInd))))&&((this.regHoldInd == rhs.regHoldInd)||((this.regHoldInd!= null)&&this.regHoldInd.equals(rhs.regHoldInd))))&&((this.applicationHoldInd == rhs.applicationHoldInd)||((this.applicationHoldInd!= null)&&this.applicationHoldInd.equals(rhs.applicationHoldInd))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.transHoldInd == rhs.transHoldInd)||((this.transHoldInd!= null)&&this.transHoldInd.equals(rhs.transHoldInd))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
