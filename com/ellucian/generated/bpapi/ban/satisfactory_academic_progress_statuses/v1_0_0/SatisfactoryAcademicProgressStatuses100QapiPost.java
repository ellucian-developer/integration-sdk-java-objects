
package com.ellucian.generated.bpapi.ban.satisfactory_academic_progress_statuses.v1_0_0;

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
    "activeInd",
    "aidType",
    "code",
    "desc",
    "disbInd",
    "letrCode",
    "pckgInd",
    "priority",
    "vrMsgNo"
})
@Generated("jsonschema2pojo")
public class SatisfactoryAcademicProgressStatuses100QapiPost {

    /**
     * Lineage reference object : RTVSAPR_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : RTVSAPR_ACTIVE_IND")
    private String activeInd;
    /**
     * Which Aid
     * <p>
     * Lineage reference object : RTVSAPR_AID_TYPE
     * 
     */
    @JsonProperty("aidType")
    @JsonPropertyDescription("Lineage reference object : RTVSAPR_AID_TYPE")
    private Double aidType;
    /**
     * SAP Status
     * <p>
     * Lineage reference object : RTVSAPR_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVSAPR_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : RTVSAPR_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVSAPR_DESC")
    private String desc;
    /**
     * Lineage reference object : RTVSAPR_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    @JsonPropertyDescription("Lineage reference object : RTVSAPR_DISB_IND")
    private String disbInd;
    /**
     * Letter Code
     * <p>
     * Lineage reference object : RTVSAPR_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("letrCode")
    @JsonPropertyDescription("Lineage reference object : RTVSAPR_LETR_CODE, Lookup lineage reference object : gtvletr")
    private String letrCode;
    /**
     * Lineage reference object : RTVSAPR_PCKG_IND
     * 
     */
    @JsonProperty("pckgInd")
    @JsonPropertyDescription("Lineage reference object : RTVSAPR_PCKG_IND")
    private String pckgInd;
    /**
     * Priority
     * <p>
     * Lineage reference object : RTVSAPR_PRIORITY
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : RTVSAPR_PRIORITY")
    private Double priority;
    /**
     * Message Number
     * <p>
     * Lineage reference object : RTVSAPR_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : RTVSAPR_VR_MSG_NO")
    private Double vrMsgNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RTVSAPR_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : RTVSAPR_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public SatisfactoryAcademicProgressStatuses100QapiPost withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Which Aid
     * <p>
     * Lineage reference object : RTVSAPR_AID_TYPE
     * 
     */
    @JsonProperty("aidType")
    public Double getAidType() {
        return aidType;
    }

    /**
     * Which Aid
     * <p>
     * Lineage reference object : RTVSAPR_AID_TYPE
     * 
     */
    @JsonProperty("aidType")
    public void setAidType(Double aidType) {
        this.aidType = aidType;
    }

    public SatisfactoryAcademicProgressStatuses100QapiPost withAidType(Double aidType) {
        this.aidType = aidType;
        return this;
    }

    /**
     * SAP Status
     * <p>
     * Lineage reference object : RTVSAPR_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * SAP Status
     * <p>
     * Lineage reference object : RTVSAPR_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SatisfactoryAcademicProgressStatuses100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVSAPR_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVSAPR_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SatisfactoryAcademicProgressStatuses100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : RTVSAPR_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public String getDisbInd() {
        return disbInd;
    }

    /**
     * Lineage reference object : RTVSAPR_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public void setDisbInd(String disbInd) {
        this.disbInd = disbInd;
    }

    public SatisfactoryAcademicProgressStatuses100QapiPost withDisbInd(String disbInd) {
        this.disbInd = disbInd;
        return this;
    }

    /**
     * Letter Code
     * <p>
     * Lineage reference object : RTVSAPR_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("letrCode")
    public String getLetrCode() {
        return letrCode;
    }

    /**
     * Letter Code
     * <p>
     * Lineage reference object : RTVSAPR_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("letrCode")
    public void setLetrCode(String letrCode) {
        this.letrCode = letrCode;
    }

    public SatisfactoryAcademicProgressStatuses100QapiPost withLetrCode(String letrCode) {
        this.letrCode = letrCode;
        return this;
    }

    /**
     * Lineage reference object : RTVSAPR_PCKG_IND
     * 
     */
    @JsonProperty("pckgInd")
    public String getPckgInd() {
        return pckgInd;
    }

    /**
     * Lineage reference object : RTVSAPR_PCKG_IND
     * 
     */
    @JsonProperty("pckgInd")
    public void setPckgInd(String pckgInd) {
        this.pckgInd = pckgInd;
    }

    public SatisfactoryAcademicProgressStatuses100QapiPost withPckgInd(String pckgInd) {
        this.pckgInd = pckgInd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : RTVSAPR_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : RTVSAPR_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public SatisfactoryAcademicProgressStatuses100QapiPost withPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Message Number
     * <p>
     * Lineage reference object : RTVSAPR_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Message Number
     * <p>
     * Lineage reference object : RTVSAPR_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public SatisfactoryAcademicProgressStatuses100QapiPost withVrMsgNo(Double vrMsgNo) {
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

    public SatisfactoryAcademicProgressStatuses100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SatisfactoryAcademicProgressStatuses100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("aidType");
        sb.append('=');
        sb.append(((this.aidType == null)?"<null>":this.aidType));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("disbInd");
        sb.append('=');
        sb.append(((this.disbInd == null)?"<null>":this.disbInd));
        sb.append(',');
        sb.append("letrCode");
        sb.append('=');
        sb.append(((this.letrCode == null)?"<null>":this.letrCode));
        sb.append(',');
        sb.append("pckgInd");
        sb.append('=');
        sb.append(((this.pckgInd == null)?"<null>":this.pckgInd));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
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
        result = ((result* 31)+((this.aidType == null)? 0 :this.aidType.hashCode()));
        result = ((result* 31)+((this.disbInd == null)? 0 :this.disbInd.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.letrCode == null)? 0 :this.letrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.pckgInd == null)? 0 :this.pckgInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SatisfactoryAcademicProgressStatuses100QapiPost) == false) {
            return false;
        }
        SatisfactoryAcademicProgressStatuses100QapiPost rhs = ((SatisfactoryAcademicProgressStatuses100QapiPost) other);
        return (((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.aidType == rhs.aidType)||((this.aidType!= null)&&this.aidType.equals(rhs.aidType))))&&((this.disbInd == rhs.disbInd)||((this.disbInd!= null)&&this.disbInd.equals(rhs.disbInd))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.letrCode == rhs.letrCode)||((this.letrCode!= null)&&this.letrCode.equals(rhs.letrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.pckgInd == rhs.pckgInd)||((this.pckgInd!= null)&&this.pckgInd.equals(rhs.pckgInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
