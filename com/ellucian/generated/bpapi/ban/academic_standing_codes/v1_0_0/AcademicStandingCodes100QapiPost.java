
package com.ellucian.generated.bpapi.ban.academic_standing_codes.v1_0_0;

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
    "code",
    "deansListInd",
    "desc",
    "ediEquiv",
    "maxRegHours",
    "minRegHours",
    "preventRegInd",
    "probationInd",
    "systemReqInd",
    "vrMsgNo"
})
@Generated("jsonschema2pojo")
public class AcademicStandingCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVASTD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVASTD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Standing Code
     * <p>
     * Lineage reference object : STVASTD_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVASTD_CODE")
    private String code;
    /**
     * Lineage reference object : STVASTD_DEANS_LIST_IND
     * 
     */
    @JsonProperty("deansListInd")
    @JsonPropertyDescription("Lineage reference object : STVASTD_DEANS_LIST_IND")
    private String deansListInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVASTD_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVASTD_DESC")
    private String desc;
    /**
     * EDI Eqv
     * <p>
     * Lineage reference object : STVASTD_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    @JsonPropertyDescription("Lineage reference object : STVASTD_EDI_EQUIV")
    private String ediEquiv;
    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : STVASTD_MAX_REG_HOURS
     * 
     */
    @JsonProperty("maxRegHours")
    @JsonPropertyDescription("Lineage reference object : STVASTD_MAX_REG_HOURS")
    private Double maxRegHours;
    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : STVASTD_MIN_REG_HOURS
     * 
     */
    @JsonProperty("minRegHours")
    @JsonPropertyDescription("Lineage reference object : STVASTD_MIN_REG_HOURS")
    private Double minRegHours;
    /**
     * Lineage reference object : STVASTD_PREVENT_REG_IND
     * 
     */
    @JsonProperty("preventRegInd")
    @JsonPropertyDescription("Lineage reference object : STVASTD_PREVENT_REG_IND")
    private String preventRegInd;
    /**
     * Lineage reference object : STVASTD_PROBATION_IND
     * 
     */
    @JsonProperty("probationInd")
    @JsonPropertyDescription("Lineage reference object : STVASTD_PROBATION_IND")
    private String probationInd;
    /**
     * Lineage reference object : STVASTD_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVASTD_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Voice Msg
     * <p>
     * Lineage reference object : STVASTD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVASTD_VR_MSG_NO")
    private Double vrMsgNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVASTD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVASTD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AcademicStandingCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Standing Code
     * <p>
     * Lineage reference object : STVASTD_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Standing Code
     * <p>
     * Lineage reference object : STVASTD_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AcademicStandingCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVASTD_DEANS_LIST_IND
     * 
     */
    @JsonProperty("deansListInd")
    public String getDeansListInd() {
        return deansListInd;
    }

    /**
     * Lineage reference object : STVASTD_DEANS_LIST_IND
     * 
     */
    @JsonProperty("deansListInd")
    public void setDeansListInd(String deansListInd) {
        this.deansListInd = deansListInd;
    }

    public AcademicStandingCodes100QapiPost withDeansListInd(String deansListInd) {
        this.deansListInd = deansListInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVASTD_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVASTD_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AcademicStandingCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * EDI Eqv
     * <p>
     * Lineage reference object : STVASTD_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public String getEdiEquiv() {
        return ediEquiv;
    }

    /**
     * EDI Eqv
     * <p>
     * Lineage reference object : STVASTD_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public void setEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
    }

    public AcademicStandingCodes100QapiPost withEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
        return this;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : STVASTD_MAX_REG_HOURS
     * 
     */
    @JsonProperty("maxRegHours")
    public Double getMaxRegHours() {
        return maxRegHours;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : STVASTD_MAX_REG_HOURS
     * 
     */
    @JsonProperty("maxRegHours")
    public void setMaxRegHours(Double maxRegHours) {
        this.maxRegHours = maxRegHours;
    }

    public AcademicStandingCodes100QapiPost withMaxRegHours(Double maxRegHours) {
        this.maxRegHours = maxRegHours;
        return this;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : STVASTD_MIN_REG_HOURS
     * 
     */
    @JsonProperty("minRegHours")
    public Double getMinRegHours() {
        return minRegHours;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : STVASTD_MIN_REG_HOURS
     * 
     */
    @JsonProperty("minRegHours")
    public void setMinRegHours(Double minRegHours) {
        this.minRegHours = minRegHours;
    }

    public AcademicStandingCodes100QapiPost withMinRegHours(Double minRegHours) {
        this.minRegHours = minRegHours;
        return this;
    }

    /**
     * Lineage reference object : STVASTD_PREVENT_REG_IND
     * 
     */
    @JsonProperty("preventRegInd")
    public String getPreventRegInd() {
        return preventRegInd;
    }

    /**
     * Lineage reference object : STVASTD_PREVENT_REG_IND
     * 
     */
    @JsonProperty("preventRegInd")
    public void setPreventRegInd(String preventRegInd) {
        this.preventRegInd = preventRegInd;
    }

    public AcademicStandingCodes100QapiPost withPreventRegInd(String preventRegInd) {
        this.preventRegInd = preventRegInd;
        return this;
    }

    /**
     * Lineage reference object : STVASTD_PROBATION_IND
     * 
     */
    @JsonProperty("probationInd")
    public String getProbationInd() {
        return probationInd;
    }

    /**
     * Lineage reference object : STVASTD_PROBATION_IND
     * 
     */
    @JsonProperty("probationInd")
    public void setProbationInd(String probationInd) {
        this.probationInd = probationInd;
    }

    public AcademicStandingCodes100QapiPost withProbationInd(String probationInd) {
        this.probationInd = probationInd;
        return this;
    }

    /**
     * Lineage reference object : STVASTD_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVASTD_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public AcademicStandingCodes100QapiPost withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Voice Msg
     * <p>
     * Lineage reference object : STVASTD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Msg
     * <p>
     * Lineage reference object : STVASTD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public AcademicStandingCodes100QapiPost withVrMsgNo(Double vrMsgNo) {
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

    public AcademicStandingCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicStandingCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("deansListInd");
        sb.append('=');
        sb.append(((this.deansListInd == null)?"<null>":this.deansListInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("ediEquiv");
        sb.append('=');
        sb.append(((this.ediEquiv == null)?"<null>":this.ediEquiv));
        sb.append(',');
        sb.append("maxRegHours");
        sb.append('=');
        sb.append(((this.maxRegHours == null)?"<null>":this.maxRegHours));
        sb.append(',');
        sb.append("minRegHours");
        sb.append('=');
        sb.append(((this.minRegHours == null)?"<null>":this.minRegHours));
        sb.append(',');
        sb.append("preventRegInd");
        sb.append('=');
        sb.append(((this.preventRegInd == null)?"<null>":this.preventRegInd));
        sb.append(',');
        sb.append("probationInd");
        sb.append('=');
        sb.append(((this.probationInd == null)?"<null>":this.probationInd));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
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
        result = ((result* 31)+((this.preventRegInd == null)? 0 :this.preventRegInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.probationInd == null)? 0 :this.probationInd.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.minRegHours == null)? 0 :this.minRegHours.hashCode()));
        result = ((result* 31)+((this.deansListInd == null)? 0 :this.deansListInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.maxRegHours == null)? 0 :this.maxRegHours.hashCode()));
        result = ((result* 31)+((this.ediEquiv == null)? 0 :this.ediEquiv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicStandingCodes100QapiPost) == false) {
            return false;
        }
        AcademicStandingCodes100QapiPost rhs = ((AcademicStandingCodes100QapiPost) other);
        return (((((((((((((this.preventRegInd == rhs.preventRegInd)||((this.preventRegInd!= null)&&this.preventRegInd.equals(rhs.preventRegInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.probationInd == rhs.probationInd)||((this.probationInd!= null)&&this.probationInd.equals(rhs.probationInd))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.minRegHours == rhs.minRegHours)||((this.minRegHours!= null)&&this.minRegHours.equals(rhs.minRegHours))))&&((this.deansListInd == rhs.deansListInd)||((this.deansListInd!= null)&&this.deansListInd.equals(rhs.deansListInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.maxRegHours == rhs.maxRegHours)||((this.maxRegHours!= null)&&this.maxRegHours.equals(rhs.maxRegHours))))&&((this.ediEquiv == rhs.ediEquiv)||((this.ediEquiv!= null)&&this.ediEquiv.equals(rhs.ediEquiv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
