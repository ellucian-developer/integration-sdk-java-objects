
package com.ellucian.generated.bpapi.ban.ca_faculty_staff_type_codes.v1_0_0;

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
    "errHandlingInd",
    "activityDate",
    "code",
    "loadActiveInd",
    "loadLimit",
    "desc"
})
@Generated("jsonschema2pojo")
public class CaFacultyStaffTypeCodes100GetResponse {

    /**
     * Lineage reference object : STVFSTP_ERR_HANDLING_IND
     * 
     */
    @JsonProperty("errHandlingInd")
    @JsonPropertyDescription("Lineage reference object : STVFSTP_ERR_HANDLING_IND")
    private String errHandlingInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVFSTP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVFSTP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVFSTP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVFSTP_CODE")
    private String code;
    /**
     * Lineage reference object : STVFSTP_LOAD_ACTIVE_IND
     * 
     */
    @JsonProperty("loadActiveInd")
    @JsonPropertyDescription("Lineage reference object : STVFSTP_LOAD_ACTIVE_IND")
    private String loadActiveInd;
    /**
     * Type Load Limit (FTE)
     * <p>
     * Lineage reference object : STVFSTP_LOAD_LIMIT
     * 
     */
    @JsonProperty("loadLimit")
    @JsonPropertyDescription("Lineage reference object : STVFSTP_LOAD_LIMIT")
    private Double loadLimit;
    /**
     * Description
     * <p>
     * Lineage reference object : STVFSTP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVFSTP_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVFSTP_ERR_HANDLING_IND
     * 
     */
    @JsonProperty("errHandlingInd")
    public String getErrHandlingInd() {
        return errHandlingInd;
    }

    /**
     * Lineage reference object : STVFSTP_ERR_HANDLING_IND
     * 
     */
    @JsonProperty("errHandlingInd")
    public void setErrHandlingInd(String errHandlingInd) {
        this.errHandlingInd = errHandlingInd;
    }

    public CaFacultyStaffTypeCodes100GetResponse withErrHandlingInd(String errHandlingInd) {
        this.errHandlingInd = errHandlingInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVFSTP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVFSTP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaFacultyStaffTypeCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVFSTP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVFSTP_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaFacultyStaffTypeCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVFSTP_LOAD_ACTIVE_IND
     * 
     */
    @JsonProperty("loadActiveInd")
    public String getLoadActiveInd() {
        return loadActiveInd;
    }

    /**
     * Lineage reference object : STVFSTP_LOAD_ACTIVE_IND
     * 
     */
    @JsonProperty("loadActiveInd")
    public void setLoadActiveInd(String loadActiveInd) {
        this.loadActiveInd = loadActiveInd;
    }

    public CaFacultyStaffTypeCodes100GetResponse withLoadActiveInd(String loadActiveInd) {
        this.loadActiveInd = loadActiveInd;
        return this;
    }

    /**
     * Type Load Limit (FTE)
     * <p>
     * Lineage reference object : STVFSTP_LOAD_LIMIT
     * 
     */
    @JsonProperty("loadLimit")
    public Double getLoadLimit() {
        return loadLimit;
    }

    /**
     * Type Load Limit (FTE)
     * <p>
     * Lineage reference object : STVFSTP_LOAD_LIMIT
     * 
     */
    @JsonProperty("loadLimit")
    public void setLoadLimit(Double loadLimit) {
        this.loadLimit = loadLimit;
    }

    public CaFacultyStaffTypeCodes100GetResponse withLoadLimit(Double loadLimit) {
        this.loadLimit = loadLimit;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVFSTP_DESC
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
     * Lineage reference object : STVFSTP_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaFacultyStaffTypeCodes100GetResponse withDesc(String desc) {
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

    public CaFacultyStaffTypeCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaFacultyStaffTypeCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("errHandlingInd");
        sb.append('=');
        sb.append(((this.errHandlingInd == null)?"<null>":this.errHandlingInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("loadActiveInd");
        sb.append('=');
        sb.append(((this.loadActiveInd == null)?"<null>":this.loadActiveInd));
        sb.append(',');
        sb.append("loadLimit");
        sb.append('=');
        sb.append(((this.loadLimit == null)?"<null>":this.loadLimit));
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
        result = ((result* 31)+((this.errHandlingInd == null)? 0 :this.errHandlingInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.loadActiveInd == null)? 0 :this.loadActiveInd.hashCode()));
        result = ((result* 31)+((this.loadLimit == null)? 0 :this.loadLimit.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaFacultyStaffTypeCodes100GetResponse) == false) {
            return false;
        }
        CaFacultyStaffTypeCodes100GetResponse rhs = ((CaFacultyStaffTypeCodes100GetResponse) other);
        return ((((((((this.errHandlingInd == rhs.errHandlingInd)||((this.errHandlingInd!= null)&&this.errHandlingInd.equals(rhs.errHandlingInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.loadActiveInd == rhs.loadActiveInd)||((this.loadActiveInd!= null)&&this.loadActiveInd.equals(rhs.loadActiveInd))))&&((this.loadLimit == rhs.loadLimit)||((this.loadLimit!= null)&&this.loadLimit.equals(rhs.loadLimit))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
