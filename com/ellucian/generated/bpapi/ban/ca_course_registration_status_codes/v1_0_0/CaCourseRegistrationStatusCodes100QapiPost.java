
package com.ellucian.generated.bpapi.ban.ca_course_registration_status_codes.v1_0_0;

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
    "actionDesc",
    "apportInd",
    "attemptHrInd",
    "auditInd",
    "autoGrade",
    "code",
    "desc",
    "enterableInd",
    "extensionInd",
    "gradableInd",
    "inclAssess",
    "inclSectEnrl",
    "inclTmstInd",
    "misBogwInd",
    "sbPrintInd",
    "systemReqInd",
    "voiceType",
    "waitInd",
    "webInd",
    "withdrawInd",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class CaCourseRegistrationStatusCodes100QapiPost {

    /**
     * Action Description
     * <p>
     * Lineage reference object : STVRSTS_ACTION_DESC
     * 
     */
    @JsonProperty("actionDesc")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_ACTION_DESC")
    private String actionDesc;
    /**
     * Lineage reference object : STVRSTS_APPORT_IND
     * 
     */
    @JsonProperty("apportInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_APPORT_IND")
    private String apportInd;
    /**
     * Lineage reference object : STVRSTS_ATTEMPT_HR_IND
     * 
     */
    @JsonProperty("attemptHrInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_ATTEMPT_HR_IND")
    private String attemptHrInd;
    /**
     * Lineage reference object : STVRSTS_AUDIT_IND
     * 
     */
    @JsonProperty("auditInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_AUDIT_IND")
    private String auditInd;
    /**
     * Auto Grade
     * <p>
     * Lineage reference object : STVRSTS_AUTO_GRADE
     * 
     */
    @JsonProperty("autoGrade")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_AUTO_GRADE")
    private String autoGrade;
    /**
     * Status Code
     * <p>
     * Lineage reference object : STVRSTS_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVRSTS_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_DESC")
    private String desc;
    /**
     * Lineage reference object : STVRSTS_ENTERABLE_IND
     * 
     */
    @JsonProperty("enterableInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_ENTERABLE_IND")
    private String enterableInd;
    /**
     * Lineage reference object : STVRSTS_EXTENSION_IND
     * 
     */
    @JsonProperty("extensionInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_EXTENSION_IND")
    private String extensionInd;
    /**
     * Lineage reference object : STVRSTS_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_GRADABLE_IND")
    private String gradableInd;
    /**
     * Lineage reference object : STVRSTS_INCL_ASSESS
     * 
     */
    @JsonProperty("inclAssess")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_INCL_ASSESS")
    private String inclAssess;
    /**
     * Lineage reference object : STVRSTS_INCL_SECT_ENRL
     * 
     */
    @JsonProperty("inclSectEnrl")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_INCL_SECT_ENRL")
    private String inclSectEnrl;
    /**
     * Lineage reference object : STVRSTS_INCL_TMST_IND
     * 
     */
    @JsonProperty("inclTmstInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_INCL_TMST_IND")
    private String inclTmstInd;
    /**
     * Lineage reference object : STVRSTS_MIS_BOGW_IND
     * 
     */
    @JsonProperty("misBogwInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_MIS_BOGW_IND")
    private String misBogwInd;
    /**
     * Lineage reference object : STVRSTS_SB_PRINT_IND
     * 
     */
    @JsonProperty("sbPrintInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_SB_PRINT_IND")
    private String sbPrintInd;
    /**
     * Lineage reference object : STVRSTS_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Status Type
     * <p>
     * Lineage reference object : STVRSTS_VOICE_TYPE
     * 
     */
    @JsonProperty("voiceType")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_VOICE_TYPE")
    private String voiceType;
    /**
     * Lineage reference object : STVRSTS_WAIT_IND
     * 
     */
    @JsonProperty("waitInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_WAIT_IND")
    private String waitInd;
    /**
     * Lineage reference object : STVRSTS_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_WEB_IND")
    private String webInd;
    /**
     * Lineage reference object : STVRSTS_WITHDRAW_IND
     * 
     */
    @JsonProperty("withdrawInd")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_WITHDRAW_IND")
    private String withdrawInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVRSTS_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Action Description
     * <p>
     * Lineage reference object : STVRSTS_ACTION_DESC
     * 
     */
    @JsonProperty("actionDesc")
    public String getActionDesc() {
        return actionDesc;
    }

    /**
     * Action Description
     * <p>
     * Lineage reference object : STVRSTS_ACTION_DESC
     * 
     */
    @JsonProperty("actionDesc")
    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_APPORT_IND
     * 
     */
    @JsonProperty("apportInd")
    public String getApportInd() {
        return apportInd;
    }

    /**
     * Lineage reference object : STVRSTS_APPORT_IND
     * 
     */
    @JsonProperty("apportInd")
    public void setApportInd(String apportInd) {
        this.apportInd = apportInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withApportInd(String apportInd) {
        this.apportInd = apportInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_ATTEMPT_HR_IND
     * 
     */
    @JsonProperty("attemptHrInd")
    public String getAttemptHrInd() {
        return attemptHrInd;
    }

    /**
     * Lineage reference object : STVRSTS_ATTEMPT_HR_IND
     * 
     */
    @JsonProperty("attemptHrInd")
    public void setAttemptHrInd(String attemptHrInd) {
        this.attemptHrInd = attemptHrInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withAttemptHrInd(String attemptHrInd) {
        this.attemptHrInd = attemptHrInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_AUDIT_IND
     * 
     */
    @JsonProperty("auditInd")
    public String getAuditInd() {
        return auditInd;
    }

    /**
     * Lineage reference object : STVRSTS_AUDIT_IND
     * 
     */
    @JsonProperty("auditInd")
    public void setAuditInd(String auditInd) {
        this.auditInd = auditInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withAuditInd(String auditInd) {
        this.auditInd = auditInd;
        return this;
    }

    /**
     * Auto Grade
     * <p>
     * Lineage reference object : STVRSTS_AUTO_GRADE
     * 
     */
    @JsonProperty("autoGrade")
    public String getAutoGrade() {
        return autoGrade;
    }

    /**
     * Auto Grade
     * <p>
     * Lineage reference object : STVRSTS_AUTO_GRADE
     * 
     */
    @JsonProperty("autoGrade")
    public void setAutoGrade(String autoGrade) {
        this.autoGrade = autoGrade;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withAutoGrade(String autoGrade) {
        this.autoGrade = autoGrade;
        return this;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : STVRSTS_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : STVRSTS_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVRSTS_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVRSTS_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_ENTERABLE_IND
     * 
     */
    @JsonProperty("enterableInd")
    public String getEnterableInd() {
        return enterableInd;
    }

    /**
     * Lineage reference object : STVRSTS_ENTERABLE_IND
     * 
     */
    @JsonProperty("enterableInd")
    public void setEnterableInd(String enterableInd) {
        this.enterableInd = enterableInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withEnterableInd(String enterableInd) {
        this.enterableInd = enterableInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_EXTENSION_IND
     * 
     */
    @JsonProperty("extensionInd")
    public String getExtensionInd() {
        return extensionInd;
    }

    /**
     * Lineage reference object : STVRSTS_EXTENSION_IND
     * 
     */
    @JsonProperty("extensionInd")
    public void setExtensionInd(String extensionInd) {
        this.extensionInd = extensionInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withExtensionInd(String extensionInd) {
        this.extensionInd = extensionInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    public String getGradableInd() {
        return gradableInd;
    }

    /**
     * Lineage reference object : STVRSTS_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    public void setGradableInd(String gradableInd) {
        this.gradableInd = gradableInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withGradableInd(String gradableInd) {
        this.gradableInd = gradableInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_INCL_ASSESS
     * 
     */
    @JsonProperty("inclAssess")
    public String getInclAssess() {
        return inclAssess;
    }

    /**
     * Lineage reference object : STVRSTS_INCL_ASSESS
     * 
     */
    @JsonProperty("inclAssess")
    public void setInclAssess(String inclAssess) {
        this.inclAssess = inclAssess;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withInclAssess(String inclAssess) {
        this.inclAssess = inclAssess;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_INCL_SECT_ENRL
     * 
     */
    @JsonProperty("inclSectEnrl")
    public String getInclSectEnrl() {
        return inclSectEnrl;
    }

    /**
     * Lineage reference object : STVRSTS_INCL_SECT_ENRL
     * 
     */
    @JsonProperty("inclSectEnrl")
    public void setInclSectEnrl(String inclSectEnrl) {
        this.inclSectEnrl = inclSectEnrl;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withInclSectEnrl(String inclSectEnrl) {
        this.inclSectEnrl = inclSectEnrl;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_INCL_TMST_IND
     * 
     */
    @JsonProperty("inclTmstInd")
    public String getInclTmstInd() {
        return inclTmstInd;
    }

    /**
     * Lineage reference object : STVRSTS_INCL_TMST_IND
     * 
     */
    @JsonProperty("inclTmstInd")
    public void setInclTmstInd(String inclTmstInd) {
        this.inclTmstInd = inclTmstInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withInclTmstInd(String inclTmstInd) {
        this.inclTmstInd = inclTmstInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_MIS_BOGW_IND
     * 
     */
    @JsonProperty("misBogwInd")
    public String getMisBogwInd() {
        return misBogwInd;
    }

    /**
     * Lineage reference object : STVRSTS_MIS_BOGW_IND
     * 
     */
    @JsonProperty("misBogwInd")
    public void setMisBogwInd(String misBogwInd) {
        this.misBogwInd = misBogwInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withMisBogwInd(String misBogwInd) {
        this.misBogwInd = misBogwInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_SB_PRINT_IND
     * 
     */
    @JsonProperty("sbPrintInd")
    public String getSbPrintInd() {
        return sbPrintInd;
    }

    /**
     * Lineage reference object : STVRSTS_SB_PRINT_IND
     * 
     */
    @JsonProperty("sbPrintInd")
    public void setSbPrintInd(String sbPrintInd) {
        this.sbPrintInd = sbPrintInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withSbPrintInd(String sbPrintInd) {
        this.sbPrintInd = sbPrintInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVRSTS_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Status Type
     * <p>
     * Lineage reference object : STVRSTS_VOICE_TYPE
     * 
     */
    @JsonProperty("voiceType")
    public String getVoiceType() {
        return voiceType;
    }

    /**
     * Status Type
     * <p>
     * Lineage reference object : STVRSTS_VOICE_TYPE
     * 
     */
    @JsonProperty("voiceType")
    public void setVoiceType(String voiceType) {
        this.voiceType = voiceType;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withVoiceType(String voiceType) {
        this.voiceType = voiceType;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_WAIT_IND
     * 
     */
    @JsonProperty("waitInd")
    public String getWaitInd() {
        return waitInd;
    }

    /**
     * Lineage reference object : STVRSTS_WAIT_IND
     * 
     */
    @JsonProperty("waitInd")
    public void setWaitInd(String waitInd) {
        this.waitInd = waitInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withWaitInd(String waitInd) {
        this.waitInd = waitInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    public String getWebInd() {
        return webInd;
    }

    /**
     * Lineage reference object : STVRSTS_WEB_IND
     * 
     */
    @JsonProperty("webInd")
    public void setWebInd(String webInd) {
        this.webInd = webInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withWebInd(String webInd) {
        this.webInd = webInd;
        return this;
    }

    /**
     * Lineage reference object : STVRSTS_WITHDRAW_IND
     * 
     */
    @JsonProperty("withdrawInd")
    public String getWithdrawInd() {
        return withdrawInd;
    }

    /**
     * Lineage reference object : STVRSTS_WITHDRAW_IND
     * 
     */
    @JsonProperty("withdrawInd")
    public void setWithdrawInd(String withdrawInd) {
        this.withdrawInd = withdrawInd;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withWithdrawInd(String withdrawInd) {
        this.withdrawInd = withdrawInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaCourseRegistrationStatusCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public CaCourseRegistrationStatusCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaCourseRegistrationStatusCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actionDesc");
        sb.append('=');
        sb.append(((this.actionDesc == null)?"<null>":this.actionDesc));
        sb.append(',');
        sb.append("apportInd");
        sb.append('=');
        sb.append(((this.apportInd == null)?"<null>":this.apportInd));
        sb.append(',');
        sb.append("attemptHrInd");
        sb.append('=');
        sb.append(((this.attemptHrInd == null)?"<null>":this.attemptHrInd));
        sb.append(',');
        sb.append("auditInd");
        sb.append('=');
        sb.append(((this.auditInd == null)?"<null>":this.auditInd));
        sb.append(',');
        sb.append("autoGrade");
        sb.append('=');
        sb.append(((this.autoGrade == null)?"<null>":this.autoGrade));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("enterableInd");
        sb.append('=');
        sb.append(((this.enterableInd == null)?"<null>":this.enterableInd));
        sb.append(',');
        sb.append("extensionInd");
        sb.append('=');
        sb.append(((this.extensionInd == null)?"<null>":this.extensionInd));
        sb.append(',');
        sb.append("gradableInd");
        sb.append('=');
        sb.append(((this.gradableInd == null)?"<null>":this.gradableInd));
        sb.append(',');
        sb.append("inclAssess");
        sb.append('=');
        sb.append(((this.inclAssess == null)?"<null>":this.inclAssess));
        sb.append(',');
        sb.append("inclSectEnrl");
        sb.append('=');
        sb.append(((this.inclSectEnrl == null)?"<null>":this.inclSectEnrl));
        sb.append(',');
        sb.append("inclTmstInd");
        sb.append('=');
        sb.append(((this.inclTmstInd == null)?"<null>":this.inclTmstInd));
        sb.append(',');
        sb.append("misBogwInd");
        sb.append('=');
        sb.append(((this.misBogwInd == null)?"<null>":this.misBogwInd));
        sb.append(',');
        sb.append("sbPrintInd");
        sb.append('=');
        sb.append(((this.sbPrintInd == null)?"<null>":this.sbPrintInd));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("voiceType");
        sb.append('=');
        sb.append(((this.voiceType == null)?"<null>":this.voiceType));
        sb.append(',');
        sb.append("waitInd");
        sb.append('=');
        sb.append(((this.waitInd == null)?"<null>":this.waitInd));
        sb.append(',');
        sb.append("webInd");
        sb.append('=');
        sb.append(((this.webInd == null)?"<null>":this.webInd));
        sb.append(',');
        sb.append("withdrawInd");
        sb.append('=');
        sb.append(((this.withdrawInd == null)?"<null>":this.withdrawInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.gradableInd == null)? 0 :this.gradableInd.hashCode()));
        result = ((result* 31)+((this.inclAssess == null)? 0 :this.inclAssess.hashCode()));
        result = ((result* 31)+((this.waitInd == null)? 0 :this.waitInd.hashCode()));
        result = ((result* 31)+((this.sbPrintInd == null)? 0 :this.sbPrintInd.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.inclSectEnrl == null)? 0 :this.inclSectEnrl.hashCode()));
        result = ((result* 31)+((this.withdrawInd == null)? 0 :this.withdrawInd.hashCode()));
        result = ((result* 31)+((this.webInd == null)? 0 :this.webInd.hashCode()));
        result = ((result* 31)+((this.attemptHrInd == null)? 0 :this.attemptHrInd.hashCode()));
        result = ((result* 31)+((this.auditInd == null)? 0 :this.auditInd.hashCode()));
        result = ((result* 31)+((this.enterableInd == null)? 0 :this.enterableInd.hashCode()));
        result = ((result* 31)+((this.misBogwInd == null)? 0 :this.misBogwInd.hashCode()));
        result = ((result* 31)+((this.voiceType == null)? 0 :this.voiceType.hashCode()));
        result = ((result* 31)+((this.inclTmstInd == null)? 0 :this.inclTmstInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.autoGrade == null)? 0 :this.autoGrade.hashCode()));
        result = ((result* 31)+((this.extensionInd == null)? 0 :this.extensionInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actionDesc == null)? 0 :this.actionDesc.hashCode()));
        result = ((result* 31)+((this.apportInd == null)? 0 :this.apportInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaCourseRegistrationStatusCodes100QapiPost) == false) {
            return false;
        }
        CaCourseRegistrationStatusCodes100QapiPost rhs = ((CaCourseRegistrationStatusCodes100QapiPost) other);
        return (((((((((((((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.gradableInd == rhs.gradableInd)||((this.gradableInd!= null)&&this.gradableInd.equals(rhs.gradableInd))))&&((this.inclAssess == rhs.inclAssess)||((this.inclAssess!= null)&&this.inclAssess.equals(rhs.inclAssess))))&&((this.waitInd == rhs.waitInd)||((this.waitInd!= null)&&this.waitInd.equals(rhs.waitInd))))&&((this.sbPrintInd == rhs.sbPrintInd)||((this.sbPrintInd!= null)&&this.sbPrintInd.equals(rhs.sbPrintInd))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.inclSectEnrl == rhs.inclSectEnrl)||((this.inclSectEnrl!= null)&&this.inclSectEnrl.equals(rhs.inclSectEnrl))))&&((this.withdrawInd == rhs.withdrawInd)||((this.withdrawInd!= null)&&this.withdrawInd.equals(rhs.withdrawInd))))&&((this.webInd == rhs.webInd)||((this.webInd!= null)&&this.webInd.equals(rhs.webInd))))&&((this.attemptHrInd == rhs.attemptHrInd)||((this.attemptHrInd!= null)&&this.attemptHrInd.equals(rhs.attemptHrInd))))&&((this.auditInd == rhs.auditInd)||((this.auditInd!= null)&&this.auditInd.equals(rhs.auditInd))))&&((this.enterableInd == rhs.enterableInd)||((this.enterableInd!= null)&&this.enterableInd.equals(rhs.enterableInd))))&&((this.misBogwInd == rhs.misBogwInd)||((this.misBogwInd!= null)&&this.misBogwInd.equals(rhs.misBogwInd))))&&((this.voiceType == rhs.voiceType)||((this.voiceType!= null)&&this.voiceType.equals(rhs.voiceType))))&&((this.inclTmstInd == rhs.inclTmstInd)||((this.inclTmstInd!= null)&&this.inclTmstInd.equals(rhs.inclTmstInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.autoGrade == rhs.autoGrade)||((this.autoGrade!= null)&&this.autoGrade.equals(rhs.autoGrade))))&&((this.extensionInd == rhs.extensionInd)||((this.extensionInd!= null)&&this.extensionInd.equals(rhs.extensionInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actionDesc == rhs.actionDesc)||((this.actionDesc!= null)&&this.actionDesc.equals(rhs.actionDesc))))&&((this.apportInd == rhs.apportInd)||((this.apportInd!= null)&&this.apportInd.equals(rhs.apportInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
