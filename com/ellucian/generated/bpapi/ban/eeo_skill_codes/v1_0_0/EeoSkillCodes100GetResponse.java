
package com.ellucian.generated.bpapi.ban.eeo_skill_codes.v1_0_0;

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
    "misOccCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class EeoSkillCodes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTVESKL_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTVESKL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * EEO Skill Code
     * <p>
     * Lineage reference object : PTVESKL_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTVESKL_CODE")
    private String code;
    /**
     * MIS Occ Code
     * <p>
     * Lineage reference object : PTVESKL_MIS_OCC_CODE
     * 
     */
    @JsonProperty("misOccCode")
    @JsonPropertyDescription("Lineage reference object : PTVESKL_MIS_OCC_CODE")
    private String misOccCode;
    /**
     * Description
     * <p>
     * Lineage reference object : PTVESKL_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTVESKL_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTVESKL_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTVESKL_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EeoSkillCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * EEO Skill Code
     * <p>
     * Lineage reference object : PTVESKL_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * EEO Skill Code
     * <p>
     * Lineage reference object : PTVESKL_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EeoSkillCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * MIS Occ Code
     * <p>
     * Lineage reference object : PTVESKL_MIS_OCC_CODE
     * 
     */
    @JsonProperty("misOccCode")
    public String getMisOccCode() {
        return misOccCode;
    }

    /**
     * MIS Occ Code
     * <p>
     * Lineage reference object : PTVESKL_MIS_OCC_CODE
     * 
     */
    @JsonProperty("misOccCode")
    public void setMisOccCode(String misOccCode) {
        this.misOccCode = misOccCode;
    }

    public EeoSkillCodes100GetResponse withMisOccCode(String misOccCode) {
        this.misOccCode = misOccCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTVESKL_DESC
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
     * Lineage reference object : PTVESKL_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EeoSkillCodes100GetResponse withDesc(String desc) {
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

    public EeoSkillCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EeoSkillCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("misOccCode");
        sb.append('=');
        sb.append(((this.misOccCode == null)?"<null>":this.misOccCode));
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
        result = ((result* 31)+((this.misOccCode == null)? 0 :this.misOccCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EeoSkillCodes100GetResponse) == false) {
            return false;
        }
        EeoSkillCodes100GetResponse rhs = ((EeoSkillCodes100GetResponse) other);
        return ((((((this.misOccCode == rhs.misOccCode)||((this.misOccCode!= null)&&this.misOccCode.equals(rhs.misOccCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
