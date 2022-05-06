
package com.ellucian.generated.bpapi.ban.ca_campus_codes.v1_0_0;

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
    "timeZoneName",
    "utcOffset",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class CaCampusCodes100QapiPost {

    /**
     * Code
     * <p>
     * Lineage reference object : STVCAMP_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCAMP_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCAMP_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCAMP_DESC")
    private String desc;
    /**
     * District/College ID
     * <p>
     * Lineage reference object : STVCAMP_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    @JsonPropertyDescription("Lineage reference object : STVCAMP_DICD_CODE, Lookup lineage reference object : gtvdicd")
    private String dicdCode;
    /**
     * Lineage reference object : STVCAMP_TIMEZONE_NAME, Lookup lineage reference object : V,TIMEZONE_NAMES
     * 
     */
    @JsonProperty("timeZoneName")
    @JsonPropertyDescription("Lineage reference object : STVCAMP_TIMEZONE_NAME, Lookup lineage reference object : V,TIMEZONE_NAMES")
    private String timeZoneName;
    /**
     * UTC Offset
     * <p>
     * Lineage reference object : STVCAMP_UTC_OFFSET
     * 
     */
    @JsonProperty("utcOffset")
    @JsonPropertyDescription("Lineage reference object : STVCAMP_UTC_OFFSET")
    private String utcOffset;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCAMP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVCAMP_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : STVCAMP_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVCAMP_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaCampusCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCAMP_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCAMP_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaCampusCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * District/College ID
     * <p>
     * Lineage reference object : STVCAMP_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public String getDicdCode() {
        return dicdCode;
    }

    /**
     * District/College ID
     * <p>
     * Lineage reference object : STVCAMP_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public void setDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
    }

    public CaCampusCodes100QapiPost withDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
        return this;
    }

    /**
     * Lineage reference object : STVCAMP_TIMEZONE_NAME, Lookup lineage reference object : V,TIMEZONE_NAMES
     * 
     */
    @JsonProperty("timeZoneName")
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Lineage reference object : STVCAMP_TIMEZONE_NAME, Lookup lineage reference object : V,TIMEZONE_NAMES
     * 
     */
    @JsonProperty("timeZoneName")
    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public CaCampusCodes100QapiPost withTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
        return this;
    }

    /**
     * UTC Offset
     * <p>
     * Lineage reference object : STVCAMP_UTC_OFFSET
     * 
     */
    @JsonProperty("utcOffset")
    public String getUtcOffset() {
        return utcOffset;
    }

    /**
     * UTC Offset
     * <p>
     * Lineage reference object : STVCAMP_UTC_OFFSET
     * 
     */
    @JsonProperty("utcOffset")
    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public CaCampusCodes100QapiPost withUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCAMP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCAMP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaCampusCodes100QapiPost withActivityDate(Date activityDate) {
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

    public CaCampusCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaCampusCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("timeZoneName");
        sb.append('=');
        sb.append(((this.timeZoneName == null)?"<null>":this.timeZoneName));
        sb.append(',');
        sb.append("utcOffset");
        sb.append('=');
        sb.append(((this.utcOffset == null)?"<null>":this.utcOffset));
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
        result = ((result* 31)+((this.timeZoneName == null)? 0 :this.timeZoneName.hashCode()));
        result = ((result* 31)+((this.utcOffset == null)? 0 :this.utcOffset.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.dicdCode == null)? 0 :this.dicdCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaCampusCodes100QapiPost) == false) {
            return false;
        }
        CaCampusCodes100QapiPost rhs = ((CaCampusCodes100QapiPost) other);
        return ((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.timeZoneName == rhs.timeZoneName)||((this.timeZoneName!= null)&&this.timeZoneName.equals(rhs.timeZoneName))))&&((this.utcOffset == rhs.utcOffset)||((this.utcOffset!= null)&&this.utcOffset.equals(rhs.utcOffset))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.dicdCode == rhs.dicdCode)||((this.dicdCode!= null)&&this.dicdCode.equals(rhs.dicdCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
