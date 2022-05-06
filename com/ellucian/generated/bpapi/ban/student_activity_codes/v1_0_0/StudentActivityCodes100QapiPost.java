
package com.ellucian.generated.bpapi.ban.student_activity_codes.v1_0_0;

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
    "accgCode",
    "activityDate",
    "actpCode",
    "code",
    "desc"
})
@Generated("jsonschema2pojo")
public class StudentActivityCodes100QapiPost {

    /**
     * Category
     * <p>
     * Lineage reference object : STVACTC_ACCG_CODE, Lookup lineage reference object : stvaccg
     * 
     */
    @JsonProperty("accgCode")
    @JsonPropertyDescription("Lineage reference object : STVACTC_ACCG_CODE, Lookup lineage reference object : stvaccg")
    private String accgCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACTC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVACTC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Type
     * <p>
     * Lineage reference object : STVACTC_ACTP_CODE, Lookup lineage reference object : stvactp
     * 
     */
    @JsonProperty("actpCode")
    @JsonPropertyDescription("Lineage reference object : STVACTC_ACTP_CODE, Lookup lineage reference object : stvactp")
    private String actpCode;
    /**
     * Code
     * <p>
     * Lineage reference object : STVACTC_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVACTC_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVACTC_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVACTC_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Category
     * <p>
     * Lineage reference object : STVACTC_ACCG_CODE, Lookup lineage reference object : stvaccg
     * 
     */
    @JsonProperty("accgCode")
    public String getAccgCode() {
        return accgCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : STVACTC_ACCG_CODE, Lookup lineage reference object : stvaccg
     * 
     */
    @JsonProperty("accgCode")
    public void setAccgCode(String accgCode) {
        this.accgCode = accgCode;
    }

    public StudentActivityCodes100QapiPost withAccgCode(String accgCode) {
        this.accgCode = accgCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACTC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVACTC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public StudentActivityCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVACTC_ACTP_CODE, Lookup lineage reference object : stvactp
     * 
     */
    @JsonProperty("actpCode")
    public String getActpCode() {
        return actpCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVACTC_ACTP_CODE, Lookup lineage reference object : stvactp
     * 
     */
    @JsonProperty("actpCode")
    public void setActpCode(String actpCode) {
        this.actpCode = actpCode;
    }

    public StudentActivityCodes100QapiPost withActpCode(String actpCode) {
        this.actpCode = actpCode;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVACTC_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVACTC_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public StudentActivityCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVACTC_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVACTC_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StudentActivityCodes100QapiPost withDesc(String desc) {
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

    public StudentActivityCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentActivityCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accgCode");
        sb.append('=');
        sb.append(((this.accgCode == null)?"<null>":this.accgCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("actpCode");
        sb.append('=');
        sb.append(((this.actpCode == null)?"<null>":this.actpCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.accgCode == null)? 0 :this.accgCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actpCode == null)? 0 :this.actpCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentActivityCodes100QapiPost) == false) {
            return false;
        }
        StudentActivityCodes100QapiPost rhs = ((StudentActivityCodes100QapiPost) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.accgCode == rhs.accgCode)||((this.accgCode!= null)&&this.accgCode.equals(rhs.accgCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actpCode == rhs.actpCode)||((this.actpCode!= null)&&this.actpCode.equals(rhs.actpCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
