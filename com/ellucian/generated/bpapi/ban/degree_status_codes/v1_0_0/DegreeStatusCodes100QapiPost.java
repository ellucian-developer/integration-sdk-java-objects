
package com.ellucian.generated.bpapi.ban.degree_status_codes.v1_0_0;

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
    "awardStatusInd",
    "cactCode",
    "code",
    "cstsCode",
    "desc",
    "nextStatus",
    "systemReqInd"
})
@Generated("jsonschema2pojo")
public class DegreeStatusCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVDEGS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVDEGS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Awarded Indicator
     * <p>
     * Lineage reference object : STVDEGS_AWARD_STATUS_IND
     * 
     */
    @JsonProperty("awardStatusInd")
    @JsonPropertyDescription("Lineage reference object : STVDEGS_AWARD_STATUS_IND")
    private String awardStatusInd;
    @JsonProperty("cactCode")
    private String cactCode;
    /**
     * Degree Status Code
     * <p>
     * Lineage reference object : STVDEGS_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVDEGS_CODE")
    private String code;
    /**
     * Curriculum Status
     * <p>
     * Lineage reference object : STVDEGS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    @JsonPropertyDescription("Lineage reference object : STVDEGS_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String cstsCode;
    /**
     * Description
     * <p>
     * Lineage reference object : STVDEGS_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVDEGS_DESC")
    private String desc;
    /**
     * Next Degree Status
     * <p>
     * Lineage reference object : STVDEGS_NEXT_STATUS
     * 
     */
    @JsonProperty("nextStatus")
    @JsonPropertyDescription("Lineage reference object : STVDEGS_NEXT_STATUS")
    private String nextStatus;
    /**
     * Lineage reference object : STVDEGS_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVDEGS_SYSTEM_REQ_IND")
    private String systemReqInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVDEGS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVDEGS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public DegreeStatusCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Awarded Indicator
     * <p>
     * Lineage reference object : STVDEGS_AWARD_STATUS_IND
     * 
     */
    @JsonProperty("awardStatusInd")
    public String getAwardStatusInd() {
        return awardStatusInd;
    }

    /**
     * Awarded Indicator
     * <p>
     * Lineage reference object : STVDEGS_AWARD_STATUS_IND
     * 
     */
    @JsonProperty("awardStatusInd")
    public void setAwardStatusInd(String awardStatusInd) {
        this.awardStatusInd = awardStatusInd;
    }

    public DegreeStatusCodes100QapiPost withAwardStatusInd(String awardStatusInd) {
        this.awardStatusInd = awardStatusInd;
        return this;
    }

    @JsonProperty("cactCode")
    public String getCactCode() {
        return cactCode;
    }

    @JsonProperty("cactCode")
    public void setCactCode(String cactCode) {
        this.cactCode = cactCode;
    }

    public DegreeStatusCodes100QapiPost withCactCode(String cactCode) {
        this.cactCode = cactCode;
        return this;
    }

    /**
     * Degree Status Code
     * <p>
     * Lineage reference object : STVDEGS_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Degree Status Code
     * <p>
     * Lineage reference object : STVDEGS_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public DegreeStatusCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Curriculum Status
     * <p>
     * Lineage reference object : STVDEGS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public String getCstsCode() {
        return cstsCode;
    }

    /**
     * Curriculum Status
     * <p>
     * Lineage reference object : STVDEGS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public void setCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
    }

    public DegreeStatusCodes100QapiPost withCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVDEGS_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVDEGS_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DegreeStatusCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Next Degree Status
     * <p>
     * Lineage reference object : STVDEGS_NEXT_STATUS
     * 
     */
    @JsonProperty("nextStatus")
    public String getNextStatus() {
        return nextStatus;
    }

    /**
     * Next Degree Status
     * <p>
     * Lineage reference object : STVDEGS_NEXT_STATUS
     * 
     */
    @JsonProperty("nextStatus")
    public void setNextStatus(String nextStatus) {
        this.nextStatus = nextStatus;
    }

    public DegreeStatusCodes100QapiPost withNextStatus(String nextStatus) {
        this.nextStatus = nextStatus;
        return this;
    }

    /**
     * Lineage reference object : STVDEGS_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVDEGS_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public DegreeStatusCodes100QapiPost withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
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

    public DegreeStatusCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DegreeStatusCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("awardStatusInd");
        sb.append('=');
        sb.append(((this.awardStatusInd == null)?"<null>":this.awardStatusInd));
        sb.append(',');
        sb.append("cactCode");
        sb.append('=');
        sb.append(((this.cactCode == null)?"<null>":this.cactCode));
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
        sb.append("nextStatus");
        sb.append('=');
        sb.append(((this.nextStatus == null)?"<null>":this.nextStatus));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
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
        result = ((result* 31)+((this.nextStatus == null)? 0 :this.nextStatus.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.awardStatusInd == null)? 0 :this.awardStatusInd.hashCode()));
        result = ((result* 31)+((this.cstsCode == null)? 0 :this.cstsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cactCode == null)? 0 :this.cactCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DegreeStatusCodes100QapiPost) == false) {
            return false;
        }
        DegreeStatusCodes100QapiPost rhs = ((DegreeStatusCodes100QapiPost) other);
        return ((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.nextStatus == rhs.nextStatus)||((this.nextStatus!= null)&&this.nextStatus.equals(rhs.nextStatus))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.awardStatusInd == rhs.awardStatusInd)||((this.awardStatusInd!= null)&&this.awardStatusInd.equals(rhs.awardStatusInd))))&&((this.cstsCode == rhs.cstsCode)||((this.cstsCode!= null)&&this.cstsCode.equals(rhs.cstsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cactCode == rhs.cactCode)||((this.cactCode!= null)&&this.cactCode.equals(rhs.cactCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
