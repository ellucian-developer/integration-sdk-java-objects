
package com.ellucian.generated.bpapi.ban.test_codes.v1_0_0;

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
    "admrCode",
    "assessmentForm",
    "code",
    "dataType",
    "desc",
    "maxValue",
    "minValue",
    "misCode",
    "noPositions",
    "systemReqInd",
    "vrMsgNo"
})
@Generated("jsonschema2pojo")
public class TestCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVTESC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVTESC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Admissions Checklist Request Item
     * <p>
     * Lineage reference object : STVTESC_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : STVTESC_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Assessment Data
     * <p>
     * Lineage reference object : STVTESC_ASSESSMENT_FORM
     * 
     */
    @JsonProperty("assessmentForm")
    @JsonPropertyDescription("Lineage reference object : STVTESC_ASSESSMENT_FORM")
    private String assessmentForm;
    /**
     * Test Code
     * <p>
     * Lineage reference object : STVTESC_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVTESC_CODE")
    private String code;
    /**
     * Lineage reference object : STVTESC_DATA_TYPE
     * 
     */
    @JsonProperty("dataType")
    @JsonPropertyDescription("Lineage reference object : STVTESC_DATA_TYPE")
    private String dataType;
    /**
     * Description
     * <p>
     * Lineage reference object : STVTESC_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVTESC_DESC")
    private String desc;
    /**
     * Maximum Score
     * <p>
     * Lineage reference object : STVTESC_MAX_VALUE
     * 
     */
    @JsonProperty("maxValue")
    @JsonPropertyDescription("Lineage reference object : STVTESC_MAX_VALUE")
    private String maxValue;
    /**
     * Minimum Score
     * <p>
     * Lineage reference object : STVTESC_MIN_VALUE
     * 
     */
    @JsonProperty("minValue")
    @JsonPropertyDescription("Lineage reference object : STVTESC_MIN_VALUE")
    private String minValue;
    /**
     * MIS
     * <p>
     * Lineage reference object : STVTESC_MIS_CODE
     * 
     */
    @JsonProperty("misCode")
    @JsonPropertyDescription("Lineage reference object : STVTESC_MIS_CODE")
    private String misCode;
    /**
     * Maximum Number of Positions
     * <p>
     * Lineage reference object : STVTESC_NO_POSITIONS
     * 
     */
    @JsonProperty("noPositions")
    @JsonPropertyDescription("Lineage reference object : STVTESC_NO_POSITIONS")
    private Double noPositions;
    /**
     * System Required
     * <p>
     * Lineage reference object : STVTESC_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVTESC_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVTESC_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVTESC_VR_MSG_NO")
    private Double vrMsgNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVTESC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVTESC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TestCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Admissions Checklist Request Item
     * <p>
     * Lineage reference object : STVTESC_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admissions Checklist Request Item
     * <p>
     * Lineage reference object : STVTESC_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public TestCodes100QapiPost withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Assessment Data
     * <p>
     * Lineage reference object : STVTESC_ASSESSMENT_FORM
     * 
     */
    @JsonProperty("assessmentForm")
    public String getAssessmentForm() {
        return assessmentForm;
    }

    /**
     * Assessment Data
     * <p>
     * Lineage reference object : STVTESC_ASSESSMENT_FORM
     * 
     */
    @JsonProperty("assessmentForm")
    public void setAssessmentForm(String assessmentForm) {
        this.assessmentForm = assessmentForm;
    }

    public TestCodes100QapiPost withAssessmentForm(String assessmentForm) {
        this.assessmentForm = assessmentForm;
        return this;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : STVTESC_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Test Code
     * <p>
     * Lineage reference object : STVTESC_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public TestCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVTESC_DATA_TYPE
     * 
     */
    @JsonProperty("dataType")
    public String getDataType() {
        return dataType;
    }

    /**
     * Lineage reference object : STVTESC_DATA_TYPE
     * 
     */
    @JsonProperty("dataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public TestCodes100QapiPost withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVTESC_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVTESC_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TestCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Maximum Score
     * <p>
     * Lineage reference object : STVTESC_MAX_VALUE
     * 
     */
    @JsonProperty("maxValue")
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * Maximum Score
     * <p>
     * Lineage reference object : STVTESC_MAX_VALUE
     * 
     */
    @JsonProperty("maxValue")
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public TestCodes100QapiPost withMaxValue(String maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * Minimum Score
     * <p>
     * Lineage reference object : STVTESC_MIN_VALUE
     * 
     */
    @JsonProperty("minValue")
    public String getMinValue() {
        return minValue;
    }

    /**
     * Minimum Score
     * <p>
     * Lineage reference object : STVTESC_MIN_VALUE
     * 
     */
    @JsonProperty("minValue")
    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public TestCodes100QapiPost withMinValue(String minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * MIS
     * <p>
     * Lineage reference object : STVTESC_MIS_CODE
     * 
     */
    @JsonProperty("misCode")
    public String getMisCode() {
        return misCode;
    }

    /**
     * MIS
     * <p>
     * Lineage reference object : STVTESC_MIS_CODE
     * 
     */
    @JsonProperty("misCode")
    public void setMisCode(String misCode) {
        this.misCode = misCode;
    }

    public TestCodes100QapiPost withMisCode(String misCode) {
        this.misCode = misCode;
        return this;
    }

    /**
     * Maximum Number of Positions
     * <p>
     * Lineage reference object : STVTESC_NO_POSITIONS
     * 
     */
    @JsonProperty("noPositions")
    public Double getNoPositions() {
        return noPositions;
    }

    /**
     * Maximum Number of Positions
     * <p>
     * Lineage reference object : STVTESC_NO_POSITIONS
     * 
     */
    @JsonProperty("noPositions")
    public void setNoPositions(Double noPositions) {
        this.noPositions = noPositions;
    }

    public TestCodes100QapiPost withNoPositions(Double noPositions) {
        this.noPositions = noPositions;
        return this;
    }

    /**
     * System Required
     * <p>
     * Lineage reference object : STVTESC_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * System Required
     * <p>
     * Lineage reference object : STVTESC_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public TestCodes100QapiPost withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVTESC_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVTESC_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public TestCodes100QapiPost withVrMsgNo(Double vrMsgNo) {
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

    public TestCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("assessmentForm");
        sb.append('=');
        sb.append(((this.assessmentForm == null)?"<null>":this.assessmentForm));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("maxValue");
        sb.append('=');
        sb.append(((this.maxValue == null)?"<null>":this.maxValue));
        sb.append(',');
        sb.append("minValue");
        sb.append('=');
        sb.append(((this.minValue == null)?"<null>":this.minValue));
        sb.append(',');
        sb.append("misCode");
        sb.append('=');
        sb.append(((this.misCode == null)?"<null>":this.misCode));
        sb.append(',');
        sb.append("noPositions");
        sb.append('=');
        sb.append(((this.noPositions == null)?"<null>":this.noPositions));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.maxValue == null)? 0 :this.maxValue.hashCode()));
        result = ((result* 31)+((this.noPositions == null)? 0 :this.noPositions.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.misCode == null)? 0 :this.misCode.hashCode()));
        result = ((result* 31)+((this.assessmentForm == null)? 0 :this.assessmentForm.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.minValue == null)? 0 :this.minValue.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
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
        if ((other instanceof TestCodes100QapiPost) == false) {
            return false;
        }
        TestCodes100QapiPost rhs = ((TestCodes100QapiPost) other);
        return ((((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.maxValue == rhs.maxValue)||((this.maxValue!= null)&&this.maxValue.equals(rhs.maxValue))))&&((this.noPositions == rhs.noPositions)||((this.noPositions!= null)&&this.noPositions.equals(rhs.noPositions))))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.misCode == rhs.misCode)||((this.misCode!= null)&&this.misCode.equals(rhs.misCode))))&&((this.assessmentForm == rhs.assessmentForm)||((this.assessmentForm!= null)&&this.assessmentForm.equals(rhs.assessmentForm))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.minValue == rhs.minValue)||((this.minValue!= null)&&this.minValue.equals(rhs.minValue))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
