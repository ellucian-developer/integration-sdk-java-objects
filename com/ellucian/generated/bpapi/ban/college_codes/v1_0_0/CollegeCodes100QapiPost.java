
package com.ellucian.generated.bpapi.ban.college_codes.v1_0_0;

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
    "desc",
    "dicdCode",
    "statscanCde3",
    "systemReqInd",
    "vrMsgNo",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class CollegeCodes100QapiPost {

    /**
     * Code
     * <p>
     * Lineage reference object : STVCOLL_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCOLL_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCOLL_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCOLL_DESC")
    private String desc;
    /**
     * MIS District
     * <p>
     * Lineage reference object : STVCOLL_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    @JsonPropertyDescription("Lineage reference object : STVCOLL_DICD_CODE, Lookup lineage reference object : gtvdicd")
    private String dicdCode;
    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVCOLL_STATSCAN_CDE3
     * 
     */
    @JsonProperty("statscanCde3")
    @JsonPropertyDescription("Lineage reference object : STVCOLL_STATSCAN_CDE3")
    private String statscanCde3;
    /**
     * Lineage reference object : STVCOLL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVCOLL_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVCOLL_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVCOLL_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCOLL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVCOLL_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : STVCOLL_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVCOLL_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CollegeCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCOLL_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCOLL_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CollegeCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * MIS District
     * <p>
     * Lineage reference object : STVCOLL_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public String getDicdCode() {
        return dicdCode;
    }

    /**
     * MIS District
     * <p>
     * Lineage reference object : STVCOLL_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public void setDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
    }

    public CollegeCodes100QapiPost withDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
        return this;
    }

    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVCOLL_STATSCAN_CDE3
     * 
     */
    @JsonProperty("statscanCde3")
    public String getStatscanCde3() {
        return statscanCde3;
    }

    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVCOLL_STATSCAN_CDE3
     * 
     */
    @JsonProperty("statscanCde3")
    public void setStatscanCde3(String statscanCde3) {
        this.statscanCde3 = statscanCde3;
    }

    public CollegeCodes100QapiPost withStatscanCde3(String statscanCde3) {
        this.statscanCde3 = statscanCde3;
        return this;
    }

    /**
     * Lineage reference object : STVCOLL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVCOLL_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public CollegeCodes100QapiPost withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVCOLL_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVCOLL_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public CollegeCodes100QapiPost withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCOLL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCOLL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CollegeCodes100QapiPost withActivityDate(Date activityDate) {
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

    public CollegeCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollegeCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("dicdCode");
        sb.append('=');
        sb.append(((this.dicdCode == null)?"<null>":this.dicdCode));
        sb.append(',');
        sb.append("statscanCde3");
        sb.append('=');
        sb.append(((this.statscanCde3 == null)?"<null>":this.statscanCde3));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.dicdCode == null)? 0 :this.dicdCode.hashCode()));
        result = ((result* 31)+((this.statscanCde3 == null)? 0 :this.statscanCde3 .hashCode()));
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
        if ((other instanceof CollegeCodes100QapiPost) == false) {
            return false;
        }
        CollegeCodes100QapiPost rhs = ((CollegeCodes100QapiPost) other);
        return (((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.dicdCode == rhs.dicdCode)||((this.dicdCode!= null)&&this.dicdCode.equals(rhs.dicdCode))))&&((this.statscanCde3 == rhs.statscanCde3)||((this.statscanCde3 != null)&&this.statscanCde3 .equals(rhs.statscanCde3))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
