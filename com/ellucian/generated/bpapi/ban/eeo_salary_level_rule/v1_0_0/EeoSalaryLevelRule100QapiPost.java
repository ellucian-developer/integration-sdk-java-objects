
package com.ellucian.generated.bpapi.ban.eeo_salary_level_rule.v1_0_0;

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
    "eeogCode",
    "esklCode",
    "salaLevel",
    "maxSala",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class EeoSalaryLevelRule100QapiPost {

    /**
     * Contract Group
     * <p>
     * Lineage reference object : PTREEOS_EEOG_CODE, Lookup lineage reference object : ptveeog
     * 
     */
    @JsonProperty("eeogCode")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_EEOG_CODE, Lookup lineage reference object : ptveeog")
    private String eeogCode;
    /**
     * EEO Skill Code
     * <p>
     * Lineage reference object : PTREEOS_ESKL_CODE
     * 
     */
    @JsonProperty("esklCode")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_ESKL_CODE")
    private String esklCode;
    /**
     * Salary Level
     * <p>
     * Lineage reference object : PTREEOS_SALA_LEVEL
     * 
     */
    @JsonProperty("salaLevel")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_SALA_LEVEL")
    private Double salaLevel;
    /**
     * Maximum Salary
     * <p>
     * Lineage reference object : PTREEOS_MAX_SALA
     * 
     */
    @JsonProperty("maxSala")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_MAX_SALA")
    private Double maxSala;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREEOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Contract Group
     * <p>
     * Lineage reference object : PTREEOS_EEOG_CODE, Lookup lineage reference object : ptveeog
     * 
     */
    @JsonProperty("eeogCode")
    public String getEeogCode() {
        return eeogCode;
    }

    /**
     * Contract Group
     * <p>
     * Lineage reference object : PTREEOS_EEOG_CODE, Lookup lineage reference object : ptveeog
     * 
     */
    @JsonProperty("eeogCode")
    public void setEeogCode(String eeogCode) {
        this.eeogCode = eeogCode;
    }

    public EeoSalaryLevelRule100QapiPost withEeogCode(String eeogCode) {
        this.eeogCode = eeogCode;
        return this;
    }

    /**
     * EEO Skill Code
     * <p>
     * Lineage reference object : PTREEOS_ESKL_CODE
     * 
     */
    @JsonProperty("esklCode")
    public String getEsklCode() {
        return esklCode;
    }

    /**
     * EEO Skill Code
     * <p>
     * Lineage reference object : PTREEOS_ESKL_CODE
     * 
     */
    @JsonProperty("esklCode")
    public void setEsklCode(String esklCode) {
        this.esklCode = esklCode;
    }

    public EeoSalaryLevelRule100QapiPost withEsklCode(String esklCode) {
        this.esklCode = esklCode;
        return this;
    }

    /**
     * Salary Level
     * <p>
     * Lineage reference object : PTREEOS_SALA_LEVEL
     * 
     */
    @JsonProperty("salaLevel")
    public Double getSalaLevel() {
        return salaLevel;
    }

    /**
     * Salary Level
     * <p>
     * Lineage reference object : PTREEOS_SALA_LEVEL
     * 
     */
    @JsonProperty("salaLevel")
    public void setSalaLevel(Double salaLevel) {
        this.salaLevel = salaLevel;
    }

    public EeoSalaryLevelRule100QapiPost withSalaLevel(Double salaLevel) {
        this.salaLevel = salaLevel;
        return this;
    }

    /**
     * Maximum Salary
     * <p>
     * Lineage reference object : PTREEOS_MAX_SALA
     * 
     */
    @JsonProperty("maxSala")
    public Double getMaxSala() {
        return maxSala;
    }

    /**
     * Maximum Salary
     * <p>
     * Lineage reference object : PTREEOS_MAX_SALA
     * 
     */
    @JsonProperty("maxSala")
    public void setMaxSala(Double maxSala) {
        this.maxSala = maxSala;
    }

    public EeoSalaryLevelRule100QapiPost withMaxSala(Double maxSala) {
        this.maxSala = maxSala;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREEOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREEOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EeoSalaryLevelRule100QapiPost withActivityDate(Date activityDate) {
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

    public EeoSalaryLevelRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EeoSalaryLevelRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eeogCode");
        sb.append('=');
        sb.append(((this.eeogCode == null)?"<null>":this.eeogCode));
        sb.append(',');
        sb.append("esklCode");
        sb.append('=');
        sb.append(((this.esklCode == null)?"<null>":this.esklCode));
        sb.append(',');
        sb.append("salaLevel");
        sb.append('=');
        sb.append(((this.salaLevel == null)?"<null>":this.salaLevel));
        sb.append(',');
        sb.append("maxSala");
        sb.append('=');
        sb.append(((this.maxSala == null)?"<null>":this.maxSala));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.eeogCode == null)? 0 :this.eeogCode.hashCode()));
        result = ((result* 31)+((this.salaLevel == null)? 0 :this.salaLevel.hashCode()));
        result = ((result* 31)+((this.esklCode == null)? 0 :this.esklCode.hashCode()));
        result = ((result* 31)+((this.maxSala == null)? 0 :this.maxSala.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EeoSalaryLevelRule100QapiPost) == false) {
            return false;
        }
        EeoSalaryLevelRule100QapiPost rhs = ((EeoSalaryLevelRule100QapiPost) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.eeogCode == rhs.eeogCode)||((this.eeogCode!= null)&&this.eeogCode.equals(rhs.eeogCode))))&&((this.salaLevel == rhs.salaLevel)||((this.salaLevel!= null)&&this.salaLevel.equals(rhs.salaLevel))))&&((this.esklCode == rhs.esklCode)||((this.esklCode!= null)&&this.esklCode.equals(rhs.esklCode))))&&((this.maxSala == rhs.maxSala)||((this.maxSala!= null)&&this.maxSala.equals(rhs.maxSala))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
