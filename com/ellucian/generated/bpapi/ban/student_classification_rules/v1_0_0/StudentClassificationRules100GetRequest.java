
package com.ellucian.generated.bpapi.ban.student_classification_rules.v1_0_0;

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
    "toHours",
    "activityDate",
    "clasCode",
    "fromHours",
    "levlCode",
    "stvclasDesc"
})
@Generated("jsonschema2pojo")
public class StudentClassificationRules100GetRequest {

    /**
     * To Hours
     * <p>
     * Lineage reference object : SGRCLSR_TO_HOURS
     * (Required)
     * 
     */
    @JsonProperty("toHours")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_TO_HOURS")
    private Double toHours;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRCLSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Class Code
     * <p>
     * Lineage reference object : SGRCLSR_CLAS_CODE, Lookup lineage reference object : stvclas
     * (Required)
     * 
     */
    @JsonProperty("clasCode")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_CLAS_CODE, Lookup lineage reference object : stvclas")
    private String clasCode;
    /**
     * From Hours
     * <p>
     * Lineage reference object : SGRCLSR_FROM_HOURS
     * (Required)
     * 
     */
    @JsonProperty("fromHours")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_FROM_HOURS")
    private Double fromHours;
    /**
     * Level Code
     * <p>
     * Lineage reference object : SGRCLSR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvclasDesc")
    private String stvclasDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Hours
     * <p>
     * Lineage reference object : SGRCLSR_TO_HOURS
     * (Required)
     * 
     */
    @JsonProperty("toHours")
    public Double getToHours() {
        return toHours;
    }

    /**
     * To Hours
     * <p>
     * Lineage reference object : SGRCLSR_TO_HOURS
     * (Required)
     * 
     */
    @JsonProperty("toHours")
    public void setToHours(Double toHours) {
        this.toHours = toHours;
    }

    public StudentClassificationRules100GetRequest withToHours(Double toHours) {
        this.toHours = toHours;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRCLSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRCLSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public StudentClassificationRules100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Class Code
     * <p>
     * Lineage reference object : SGRCLSR_CLAS_CODE, Lookup lineage reference object : stvclas
     * (Required)
     * 
     */
    @JsonProperty("clasCode")
    public String getClasCode() {
        return clasCode;
    }

    /**
     * Class Code
     * <p>
     * Lineage reference object : SGRCLSR_CLAS_CODE, Lookup lineage reference object : stvclas
     * (Required)
     * 
     */
    @JsonProperty("clasCode")
    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
    }

    public StudentClassificationRules100GetRequest withClasCode(String clasCode) {
        this.clasCode = clasCode;
        return this;
    }

    /**
     * From Hours
     * <p>
     * Lineage reference object : SGRCLSR_FROM_HOURS
     * (Required)
     * 
     */
    @JsonProperty("fromHours")
    public Double getFromHours() {
        return fromHours;
    }

    /**
     * From Hours
     * <p>
     * Lineage reference object : SGRCLSR_FROM_HOURS
     * (Required)
     * 
     */
    @JsonProperty("fromHours")
    public void setFromHours(Double fromHours) {
        this.fromHours = fromHours;
    }

    public StudentClassificationRules100GetRequest withFromHours(Double fromHours) {
        this.fromHours = fromHours;
        return this;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : SGRCLSR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : SGRCLSR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public StudentClassificationRules100GetRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvclasDesc")
    public String getStvclasDesc() {
        return stvclasDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvclasDesc")
    public void setStvclasDesc(String stvclasDesc) {
        this.stvclasDesc = stvclasDesc;
    }

    public StudentClassificationRules100GetRequest withStvclasDesc(String stvclasDesc) {
        this.stvclasDesc = stvclasDesc;
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

    public StudentClassificationRules100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentClassificationRules100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("toHours");
        sb.append('=');
        sb.append(((this.toHours == null)?"<null>":this.toHours));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("fromHours");
        sb.append('=');
        sb.append(((this.fromHours == null)?"<null>":this.fromHours));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("stvclasDesc");
        sb.append('=');
        sb.append(((this.stvclasDesc == null)?"<null>":this.stvclasDesc));
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
        result = ((result* 31)+((this.toHours == null)? 0 :this.toHours.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fromHours == null)? 0 :this.fromHours.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.stvclasDesc == null)? 0 :this.stvclasDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentClassificationRules100GetRequest) == false) {
            return false;
        }
        StudentClassificationRules100GetRequest rhs = ((StudentClassificationRules100GetRequest) other);
        return ((((((((this.toHours == rhs.toHours)||((this.toHours!= null)&&this.toHours.equals(rhs.toHours)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fromHours == rhs.fromHours)||((this.fromHours!= null)&&this.fromHours.equals(rhs.fromHours))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.stvclasDesc == rhs.stvclasDesc)||((this.stvclasDesc!= null)&&this.stvclasDesc.equals(rhs.stvclasDesc))));
    }

}
