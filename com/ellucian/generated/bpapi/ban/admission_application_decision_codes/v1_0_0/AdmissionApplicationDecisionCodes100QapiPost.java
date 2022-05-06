
package com.ellucian.generated.bpapi.ban.admission_application_decision_codes.v1_0_0;

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
    "applInact",
    "code",
    "cstsCode",
    "desc",
    "instAccInd",
    "rejectInd",
    "signfInd",
    "stdnAccInd",
    "vrEligInd",
    "vrMsgNo",
    "webDispInd"
})
@Generated("jsonschema2pojo")
public class AdmissionApplicationDecisionCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVAPDC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVAPDC_APPL_INACT
     * 
     */
    @JsonProperty("applInact")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_APPL_INACT")
    private String applInact;
    /**
     * Decision Code
     * <p>
     * Lineage reference object : STVAPDC_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_CODE")
    private String code;
    /**
     * Curriculum Status
     * <p>
     * Lineage reference object : STVAPDC_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String cstsCode;
    /**
     * Description
     * <p>
     * Lineage reference object : STVAPDC_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_DESC")
    private String desc;
    /**
     * Lineage reference object : STVAPDC_INST_ACC_IND
     * 
     */
    @JsonProperty("instAccInd")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_INST_ACC_IND")
    private String instAccInd;
    /**
     * Lineage reference object : STVAPDC_REJECT_IND
     * 
     */
    @JsonProperty("rejectInd")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_REJECT_IND")
    private String rejectInd;
    /**
     * Lineage reference object : STVAPDC_SIGNF_IND
     * 
     */
    @JsonProperty("signfInd")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_SIGNF_IND")
    private String signfInd;
    /**
     * Lineage reference object : STVAPDC_STDN_ACC_IND
     * 
     */
    @JsonProperty("stdnAccInd")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_STDN_ACC_IND")
    private String stdnAccInd;
    /**
     * Lineage reference object : STVAPDC_VR_ELIG_IND
     * 
     */
    @JsonProperty("vrEligInd")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_VR_ELIG_IND")
    private String vrEligInd;
    /**
     * Voice Response Message
     * <p>
     * Lineage reference object : STVAPDC_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Lineage reference object : STVAPDC_WEB_DISP_IND
     * 
     */
    @JsonProperty("webDispInd")
    @JsonPropertyDescription("Lineage reference object : STVAPDC_WEB_DISP_IND")
    private String webDispInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVAPDC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVAPDC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVAPDC_APPL_INACT
     * 
     */
    @JsonProperty("applInact")
    public String getApplInact() {
        return applInact;
    }

    /**
     * Lineage reference object : STVAPDC_APPL_INACT
     * 
     */
    @JsonProperty("applInact")
    public void setApplInact(String applInact) {
        this.applInact = applInact;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withApplInact(String applInact) {
        this.applInact = applInact;
        return this;
    }

    /**
     * Decision Code
     * <p>
     * Lineage reference object : STVAPDC_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Decision Code
     * <p>
     * Lineage reference object : STVAPDC_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Curriculum Status
     * <p>
     * Lineage reference object : STVAPDC_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public String getCstsCode() {
        return cstsCode;
    }

    /**
     * Curriculum Status
     * <p>
     * Lineage reference object : STVAPDC_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public void setCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVAPDC_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVAPDC_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : STVAPDC_INST_ACC_IND
     * 
     */
    @JsonProperty("instAccInd")
    public String getInstAccInd() {
        return instAccInd;
    }

    /**
     * Lineage reference object : STVAPDC_INST_ACC_IND
     * 
     */
    @JsonProperty("instAccInd")
    public void setInstAccInd(String instAccInd) {
        this.instAccInd = instAccInd;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withInstAccInd(String instAccInd) {
        this.instAccInd = instAccInd;
        return this;
    }

    /**
     * Lineage reference object : STVAPDC_REJECT_IND
     * 
     */
    @JsonProperty("rejectInd")
    public String getRejectInd() {
        return rejectInd;
    }

    /**
     * Lineage reference object : STVAPDC_REJECT_IND
     * 
     */
    @JsonProperty("rejectInd")
    public void setRejectInd(String rejectInd) {
        this.rejectInd = rejectInd;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withRejectInd(String rejectInd) {
        this.rejectInd = rejectInd;
        return this;
    }

    /**
     * Lineage reference object : STVAPDC_SIGNF_IND
     * 
     */
    @JsonProperty("signfInd")
    public String getSignfInd() {
        return signfInd;
    }

    /**
     * Lineage reference object : STVAPDC_SIGNF_IND
     * 
     */
    @JsonProperty("signfInd")
    public void setSignfInd(String signfInd) {
        this.signfInd = signfInd;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withSignfInd(String signfInd) {
        this.signfInd = signfInd;
        return this;
    }

    /**
     * Lineage reference object : STVAPDC_STDN_ACC_IND
     * 
     */
    @JsonProperty("stdnAccInd")
    public String getStdnAccInd() {
        return stdnAccInd;
    }

    /**
     * Lineage reference object : STVAPDC_STDN_ACC_IND
     * 
     */
    @JsonProperty("stdnAccInd")
    public void setStdnAccInd(String stdnAccInd) {
        this.stdnAccInd = stdnAccInd;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withStdnAccInd(String stdnAccInd) {
        this.stdnAccInd = stdnAccInd;
        return this;
    }

    /**
     * Lineage reference object : STVAPDC_VR_ELIG_IND
     * 
     */
    @JsonProperty("vrEligInd")
    public String getVrEligInd() {
        return vrEligInd;
    }

    /**
     * Lineage reference object : STVAPDC_VR_ELIG_IND
     * 
     */
    @JsonProperty("vrEligInd")
    public void setVrEligInd(String vrEligInd) {
        this.vrEligInd = vrEligInd;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withVrEligInd(String vrEligInd) {
        this.vrEligInd = vrEligInd;
        return this;
    }

    /**
     * Voice Response Message
     * <p>
     * Lineage reference object : STVAPDC_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message
     * <p>
     * Lineage reference object : STVAPDC_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Lineage reference object : STVAPDC_WEB_DISP_IND
     * 
     */
    @JsonProperty("webDispInd")
    public String getWebDispInd() {
        return webDispInd;
    }

    /**
     * Lineage reference object : STVAPDC_WEB_DISP_IND
     * 
     */
    @JsonProperty("webDispInd")
    public void setWebDispInd(String webDispInd) {
        this.webDispInd = webDispInd;
    }

    public AdmissionApplicationDecisionCodes100QapiPost withWebDispInd(String webDispInd) {
        this.webDispInd = webDispInd;
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

    public AdmissionApplicationDecisionCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionApplicationDecisionCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("applInact");
        sb.append('=');
        sb.append(((this.applInact == null)?"<null>":this.applInact));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("cstsCode");
        sb.append('=');
        sb.append(((this.cstsCode == null)?"<null>":this.cstsCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("instAccInd");
        sb.append('=');
        sb.append(((this.instAccInd == null)?"<null>":this.instAccInd));
        sb.append(',');
        sb.append("rejectInd");
        sb.append('=');
        sb.append(((this.rejectInd == null)?"<null>":this.rejectInd));
        sb.append(',');
        sb.append("signfInd");
        sb.append('=');
        sb.append(((this.signfInd == null)?"<null>":this.signfInd));
        sb.append(',');
        sb.append("stdnAccInd");
        sb.append('=');
        sb.append(((this.stdnAccInd == null)?"<null>":this.stdnAccInd));
        sb.append(',');
        sb.append("vrEligInd");
        sb.append('=');
        sb.append(((this.vrEligInd == null)?"<null>":this.vrEligInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("webDispInd");
        sb.append('=');
        sb.append(((this.webDispInd == null)?"<null>":this.webDispInd));
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
        result = ((result* 31)+((this.signfInd == null)? 0 :this.signfInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.stdnAccInd == null)? 0 :this.stdnAccInd.hashCode()));
        result = ((result* 31)+((this.rejectInd == null)? 0 :this.rejectInd.hashCode()));
        result = ((result* 31)+((this.instAccInd == null)? 0 :this.instAccInd.hashCode()));
        result = ((result* 31)+((this.applInact == null)? 0 :this.applInact.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.webDispInd == null)? 0 :this.webDispInd.hashCode()));
        result = ((result* 31)+((this.cstsCode == null)? 0 :this.cstsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrEligInd == null)? 0 :this.vrEligInd.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionApplicationDecisionCodes100QapiPost) == false) {
            return false;
        }
        AdmissionApplicationDecisionCodes100QapiPost rhs = ((AdmissionApplicationDecisionCodes100QapiPost) other);
        return ((((((((((((((this.signfInd == rhs.signfInd)||((this.signfInd!= null)&&this.signfInd.equals(rhs.signfInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.stdnAccInd == rhs.stdnAccInd)||((this.stdnAccInd!= null)&&this.stdnAccInd.equals(rhs.stdnAccInd))))&&((this.rejectInd == rhs.rejectInd)||((this.rejectInd!= null)&&this.rejectInd.equals(rhs.rejectInd))))&&((this.instAccInd == rhs.instAccInd)||((this.instAccInd!= null)&&this.instAccInd.equals(rhs.instAccInd))))&&((this.applInact == rhs.applInact)||((this.applInact!= null)&&this.applInact.equals(rhs.applInact))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.webDispInd == rhs.webDispInd)||((this.webDispInd!= null)&&this.webDispInd.equals(rhs.webDispInd))))&&((this.cstsCode == rhs.cstsCode)||((this.cstsCode!= null)&&this.cstsCode.equals(rhs.cstsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrEligInd == rhs.vrEligInd)||((this.vrEligInd!= null)&&this.vrEligInd.equals(rhs.vrEligInd))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
