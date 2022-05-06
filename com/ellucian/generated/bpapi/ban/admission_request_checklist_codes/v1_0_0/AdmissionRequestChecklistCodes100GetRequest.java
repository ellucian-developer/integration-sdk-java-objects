
package com.ellucian.generated.bpapi.ban.admission_request_checklist_codes.v1_0_0;

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
    "dispWebInd",
    "vrEligInd",
    "vrMsgNo",
    "desc",
    "tableName"
})
@Generated("jsonschema2pojo")
public class AdmissionRequestChecklistCodes100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVADMR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVADMR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Request Code
     * <p>
     * Lineage reference object : STVADMR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVADMR_CODE")
    private String code;
    /**
     * Lineage reference object : STVADMR_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    @JsonPropertyDescription("Lineage reference object : STVADMR_DISP_WEB_IND")
    private String dispWebInd;
    /**
     * Lineage reference object : STVADMR_VR_ELIG_IND
     * 
     */
    @JsonProperty("vrEligInd")
    @JsonPropertyDescription("Lineage reference object : STVADMR_VR_ELIG_IND")
    private String vrEligInd;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVADMR_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVADMR_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Description
     * <p>
     * Lineage reference object : STVADMR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVADMR_DESC")
    private String desc;
    /**
     * Cross Reference Table Name
     * <p>
     * Lineage reference object : STVADMR_TABLE_NAME
     * 
     */
    @JsonProperty("tableName")
    @JsonPropertyDescription("Lineage reference object : STVADMR_TABLE_NAME")
    private String tableName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVADMR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVADMR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AdmissionRequestChecklistCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Request Code
     * <p>
     * Lineage reference object : STVADMR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Request Code
     * <p>
     * Lineage reference object : STVADMR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AdmissionRequestChecklistCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVADMR_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public String getDispWebInd() {
        return dispWebInd;
    }

    /**
     * Lineage reference object : STVADMR_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public void setDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
    }

    public AdmissionRequestChecklistCodes100GetRequest withDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
        return this;
    }

    /**
     * Lineage reference object : STVADMR_VR_ELIG_IND
     * 
     */
    @JsonProperty("vrEligInd")
    public String getVrEligInd() {
        return vrEligInd;
    }

    /**
     * Lineage reference object : STVADMR_VR_ELIG_IND
     * 
     */
    @JsonProperty("vrEligInd")
    public void setVrEligInd(String vrEligInd) {
        this.vrEligInd = vrEligInd;
    }

    public AdmissionRequestChecklistCodes100GetRequest withVrEligInd(String vrEligInd) {
        this.vrEligInd = vrEligInd;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVADMR_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVADMR_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public AdmissionRequestChecklistCodes100GetRequest withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVADMR_DESC
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
     * Lineage reference object : STVADMR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AdmissionRequestChecklistCodes100GetRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Cross Reference Table Name
     * <p>
     * Lineage reference object : STVADMR_TABLE_NAME
     * 
     */
    @JsonProperty("tableName")
    public String getTableName() {
        return tableName;
    }

    /**
     * Cross Reference Table Name
     * <p>
     * Lineage reference object : STVADMR_TABLE_NAME
     * 
     */
    @JsonProperty("tableName")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public AdmissionRequestChecklistCodes100GetRequest withTableName(String tableName) {
        this.tableName = tableName;
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

    public AdmissionRequestChecklistCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionRequestChecklistCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("dispWebInd");
        sb.append('=');
        sb.append(((this.dispWebInd == null)?"<null>":this.dispWebInd));
        sb.append(',');
        sb.append("vrEligInd");
        sb.append('=');
        sb.append(((this.vrEligInd == null)?"<null>":this.vrEligInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("tableName");
        sb.append('=');
        sb.append(((this.tableName == null)?"<null>":this.tableName));
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
        result = ((result* 31)+((this.dispWebInd == null)? 0 :this.dispWebInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrEligInd == null)? 0 :this.vrEligInd.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.tableName == null)? 0 :this.tableName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionRequestChecklistCodes100GetRequest) == false) {
            return false;
        }
        AdmissionRequestChecklistCodes100GetRequest rhs = ((AdmissionRequestChecklistCodes100GetRequest) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrEligInd == rhs.vrEligInd)||((this.vrEligInd!= null)&&this.vrEligInd.equals(rhs.vrEligInd))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.tableName == rhs.tableName)||((this.tableName!= null)&&this.tableName.equals(rhs.tableName))));
    }

}
