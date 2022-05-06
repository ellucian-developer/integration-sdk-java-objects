
package com.ellucian.generated.bpapi.ban.student_status_codes.v1_0_0;

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
    "stvcstsDesc",
    "activityDate",
    "code",
    "systemReqInd",
    "cstsCode",
    "regInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class StudentStatusCodes100GetResponse {

    @JsonProperty("stvcstsDesc")
    private String stvcstsDesc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSTST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVSTST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Status Code
     * <p>
     * Lineage reference object : STVSTST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVSTST_CODE")
    private String code;
    /**
     * Lineage reference object : STVSTST_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVSTST_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Curriculum Status
     * <p>
     * Lineage reference object : STVSTST_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    @JsonPropertyDescription("Lineage reference object : STVSTST_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String cstsCode;
    /**
     * Lineage reference object : STVSTST_REG_IND
     * 
     */
    @JsonProperty("regInd")
    @JsonPropertyDescription("Lineage reference object : STVSTST_REG_IND")
    private String regInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVSTST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVSTST_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stvcstsDesc")
    public String getStvcstsDesc() {
        return stvcstsDesc;
    }

    @JsonProperty("stvcstsDesc")
    public void setStvcstsDesc(String stvcstsDesc) {
        this.stvcstsDesc = stvcstsDesc;
    }

    public StudentStatusCodes100GetResponse withStvcstsDesc(String stvcstsDesc) {
        this.stvcstsDesc = stvcstsDesc;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSTST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSTST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public StudentStatusCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : STVSTST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : STVSTST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public StudentStatusCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVSTST_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVSTST_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public StudentStatusCodes100GetResponse withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Curriculum Status
     * <p>
     * Lineage reference object : STVSTST_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public String getCstsCode() {
        return cstsCode;
    }

    /**
     * Curriculum Status
     * <p>
     * Lineage reference object : STVSTST_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public void setCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
    }

    public StudentStatusCodes100GetResponse withCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
        return this;
    }

    /**
     * Lineage reference object : STVSTST_REG_IND
     * 
     */
    @JsonProperty("regInd")
    public String getRegInd() {
        return regInd;
    }

    /**
     * Lineage reference object : STVSTST_REG_IND
     * 
     */
    @JsonProperty("regInd")
    public void setRegInd(String regInd) {
        this.regInd = regInd;
    }

    public StudentStatusCodes100GetResponse withRegInd(String regInd) {
        this.regInd = regInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSTST_DESC
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
     * Lineage reference object : STVSTST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StudentStatusCodes100GetResponse withDesc(String desc) {
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

    public StudentStatusCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentStatusCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvcstsDesc");
        sb.append('=');
        sb.append(((this.stvcstsDesc == null)?"<null>":this.stvcstsDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("cstsCode");
        sb.append('=');
        sb.append(((this.cstsCode == null)?"<null>":this.cstsCode));
        sb.append(',');
        sb.append("regInd");
        sb.append('=');
        sb.append(((this.regInd == null)?"<null>":this.regInd));
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
        result = ((result* 31)+((this.stvcstsDesc == null)? 0 :this.stvcstsDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.cstsCode == null)? 0 :this.cstsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.regInd == null)? 0 :this.regInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentStatusCodes100GetResponse) == false) {
            return false;
        }
        StudentStatusCodes100GetResponse rhs = ((StudentStatusCodes100GetResponse) other);
        return (((((((((this.stvcstsDesc == rhs.stvcstsDesc)||((this.stvcstsDesc!= null)&&this.stvcstsDesc.equals(rhs.stvcstsDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.cstsCode == rhs.cstsCode)||((this.cstsCode!= null)&&this.cstsCode.equals(rhs.cstsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.regInd == rhs.regInd)||((this.regInd!= null)&&this.regInd.equals(rhs.regInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
