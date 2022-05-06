
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
    "activityDate",
    "eeogCode",
    "salaLevel",
    "esklCode",
    "maxSala"
})
@Generated("jsonschema2pojo")
public class EeoSalaryLevelRule100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREEOS_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Contract Group
     * <p>
     * Lineage reference object : PTREEOS_EEOG_CODE, Lookup lineage reference object : ptveeog
     * (Required)
     * 
     */
    @JsonProperty("eeogCode")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_EEOG_CODE, Lookup lineage reference object : ptveeog")
    private String eeogCode;
    /**
     * Salary Level
     * <p>
     * Lineage reference object : PTREEOS_SALA_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("salaLevel")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_SALA_LEVEL")
    private Double salaLevel;
    /**
     * EEO Skill Code
     * <p>
     * Lineage reference object : PTREEOS_ESKL_CODE
     * (Required)
     * 
     */
    @JsonProperty("esklCode")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_ESKL_CODE")
    private String esklCode;
    /**
     * Maximum Salary
     * <p>
     * Lineage reference object : PTREEOS_MAX_SALA
     * (Required)
     * 
     */
    @JsonProperty("maxSala")
    @JsonPropertyDescription("Lineage reference object : PTREEOS_MAX_SALA")
    private Double maxSala;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTREEOS_ACTIVITY_DATE
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
     * Lineage reference object : PTREEOS_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EeoSalaryLevelRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Contract Group
     * <p>
     * Lineage reference object : PTREEOS_EEOG_CODE, Lookup lineage reference object : ptveeog
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("eeogCode")
    public void setEeogCode(String eeogCode) {
        this.eeogCode = eeogCode;
    }

    public EeoSalaryLevelRule100GetRequest withEeogCode(String eeogCode) {
        this.eeogCode = eeogCode;
        return this;
    }

    /**
     * Salary Level
     * <p>
     * Lineage reference object : PTREEOS_SALA_LEVEL
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("salaLevel")
    public void setSalaLevel(Double salaLevel) {
        this.salaLevel = salaLevel;
    }

    public EeoSalaryLevelRule100GetRequest withSalaLevel(Double salaLevel) {
        this.salaLevel = salaLevel;
        return this;
    }

    /**
     * EEO Skill Code
     * <p>
     * Lineage reference object : PTREEOS_ESKL_CODE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("esklCode")
    public void setEsklCode(String esklCode) {
        this.esklCode = esklCode;
    }

    public EeoSalaryLevelRule100GetRequest withEsklCode(String esklCode) {
        this.esklCode = esklCode;
        return this;
    }

    /**
     * Maximum Salary
     * <p>
     * Lineage reference object : PTREEOS_MAX_SALA
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("maxSala")
    public void setMaxSala(Double maxSala) {
        this.maxSala = maxSala;
    }

    public EeoSalaryLevelRule100GetRequest withMaxSala(Double maxSala) {
        this.maxSala = maxSala;
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

    public EeoSalaryLevelRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EeoSalaryLevelRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("eeogCode");
        sb.append('=');
        sb.append(((this.eeogCode == null)?"<null>":this.eeogCode));
        sb.append(',');
        sb.append("salaLevel");
        sb.append('=');
        sb.append(((this.salaLevel == null)?"<null>":this.salaLevel));
        sb.append(',');
        sb.append("esklCode");
        sb.append('=');
        sb.append(((this.esklCode == null)?"<null>":this.esklCode));
        sb.append(',');
        sb.append("maxSala");
        sb.append('=');
        sb.append(((this.maxSala == null)?"<null>":this.maxSala));
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
        if ((other instanceof EeoSalaryLevelRule100GetRequest) == false) {
            return false;
        }
        EeoSalaryLevelRule100GetRequest rhs = ((EeoSalaryLevelRule100GetRequest) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.eeogCode == rhs.eeogCode)||((this.eeogCode!= null)&&this.eeogCode.equals(rhs.eeogCode))))&&((this.salaLevel == rhs.salaLevel)||((this.salaLevel!= null)&&this.salaLevel.equals(rhs.salaLevel))))&&((this.esklCode == rhs.esklCode)||((this.esklCode!= null)&&this.esklCode.equals(rhs.esklCode))))&&((this.maxSala == rhs.maxSala)||((this.maxSala!= null)&&this.maxSala.equals(rhs.maxSala))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
