
package com.ellucian.generated.bpapi.ban.ca_faculty_non_instructional_type_codes.v1_0_0;

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
    "loadActiveInd",
    "maxWorkload",
    "minWorkload",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class CaFacultyNonInstructionalTypeCodes100QapiPost {

    /**
     * Code
     * <p>
     * Lineage reference object : STVNIST_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVNIST_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVNIST_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVNIST_DESC")
    private String desc;
    /**
     * Lineage reference object : STVNIST_LOAD_ACTIVE_IND
     * 
     */
    @JsonProperty("loadActiveInd")
    @JsonPropertyDescription("Lineage reference object : STVNIST_LOAD_ACTIVE_IND")
    private String loadActiveInd;
    /**
     * Maximum Workload
     * <p>
     * Lineage reference object : STVNIST_MAX_WORKLOAD
     * 
     */
    @JsonProperty("maxWorkload")
    @JsonPropertyDescription("Lineage reference object : STVNIST_MAX_WORKLOAD")
    private Double maxWorkload;
    /**
     * Minimum Workload
     * <p>
     * Lineage reference object : STVNIST_MIN_WORKLOAD
     * 
     */
    @JsonProperty("minWorkload")
    @JsonPropertyDescription("Lineage reference object : STVNIST_MIN_WORKLOAD")
    private Double minWorkload;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVNIST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVNIST_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : STVNIST_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVNIST_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaFacultyNonInstructionalTypeCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVNIST_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVNIST_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaFacultyNonInstructionalTypeCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : STVNIST_LOAD_ACTIVE_IND
     * 
     */
    @JsonProperty("loadActiveInd")
    public String getLoadActiveInd() {
        return loadActiveInd;
    }

    /**
     * Lineage reference object : STVNIST_LOAD_ACTIVE_IND
     * 
     */
    @JsonProperty("loadActiveInd")
    public void setLoadActiveInd(String loadActiveInd) {
        this.loadActiveInd = loadActiveInd;
    }

    public CaFacultyNonInstructionalTypeCodes100QapiPost withLoadActiveInd(String loadActiveInd) {
        this.loadActiveInd = loadActiveInd;
        return this;
    }

    /**
     * Maximum Workload
     * <p>
     * Lineage reference object : STVNIST_MAX_WORKLOAD
     * 
     */
    @JsonProperty("maxWorkload")
    public Double getMaxWorkload() {
        return maxWorkload;
    }

    /**
     * Maximum Workload
     * <p>
     * Lineage reference object : STVNIST_MAX_WORKLOAD
     * 
     */
    @JsonProperty("maxWorkload")
    public void setMaxWorkload(Double maxWorkload) {
        this.maxWorkload = maxWorkload;
    }

    public CaFacultyNonInstructionalTypeCodes100QapiPost withMaxWorkload(Double maxWorkload) {
        this.maxWorkload = maxWorkload;
        return this;
    }

    /**
     * Minimum Workload
     * <p>
     * Lineage reference object : STVNIST_MIN_WORKLOAD
     * 
     */
    @JsonProperty("minWorkload")
    public Double getMinWorkload() {
        return minWorkload;
    }

    /**
     * Minimum Workload
     * <p>
     * Lineage reference object : STVNIST_MIN_WORKLOAD
     * 
     */
    @JsonProperty("minWorkload")
    public void setMinWorkload(Double minWorkload) {
        this.minWorkload = minWorkload;
    }

    public CaFacultyNonInstructionalTypeCodes100QapiPost withMinWorkload(Double minWorkload) {
        this.minWorkload = minWorkload;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVNIST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVNIST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaFacultyNonInstructionalTypeCodes100QapiPost withActivityDate(Date activityDate) {
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

    public CaFacultyNonInstructionalTypeCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaFacultyNonInstructionalTypeCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("loadActiveInd");
        sb.append('=');
        sb.append(((this.loadActiveInd == null)?"<null>":this.loadActiveInd));
        sb.append(',');
        sb.append("maxWorkload");
        sb.append('=');
        sb.append(((this.maxWorkload == null)?"<null>":this.maxWorkload));
        sb.append(',');
        sb.append("minWorkload");
        sb.append('=');
        sb.append(((this.minWorkload == null)?"<null>":this.minWorkload));
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
        result = ((result* 31)+((this.loadActiveInd == null)? 0 :this.loadActiveInd.hashCode()));
        result = ((result* 31)+((this.minWorkload == null)? 0 :this.minWorkload.hashCode()));
        result = ((result* 31)+((this.maxWorkload == null)? 0 :this.maxWorkload.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaFacultyNonInstructionalTypeCodes100QapiPost) == false) {
            return false;
        }
        CaFacultyNonInstructionalTypeCodes100QapiPost rhs = ((CaFacultyNonInstructionalTypeCodes100QapiPost) other);
        return ((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.loadActiveInd == rhs.loadActiveInd)||((this.loadActiveInd!= null)&&this.loadActiveInd.equals(rhs.loadActiveInd))))&&((this.minWorkload == rhs.minWorkload)||((this.minWorkload!= null)&&this.minWorkload.equals(rhs.minWorkload))))&&((this.maxWorkload == rhs.maxWorkload)||((this.maxWorkload!= null)&&this.maxWorkload.equals(rhs.maxWorkload))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
