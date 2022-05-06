
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
    "criteria.activityDate",
    "toHours",
    "attsCode",
    "criteria.toHours",
    "clasCode",
    "criteria.clasCode",
    "criteria.levlCode",
    "fromHours",
    "criteria.fromHours",
    "levlCode",
    "criteria.stvclasDesc"
})
@Generated("jsonschema2pojo")
public class StudentClassificationRules100PutRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRCLSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_ACTIVITY_DATE")
    private Date criteriaActivityDate;
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
     * Attribute
     * <p>
     * Lineage reference object : SGRCATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * (Required)
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SGRCATT_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    /**
     * To Hours
     * <p>
     * Lineage reference object : SGRCLSR_TO_HOURS
     * (Required)
     * 
     */
    @JsonProperty("criteria.toHours")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_TO_HOURS")
    private Double criteriaToHours;
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
     * Class Code
     * <p>
     * Lineage reference object : SGRCLSR_CLAS_CODE, Lookup lineage reference object : stvclas
     * (Required)
     * 
     */
    @JsonProperty("criteria.clasCode")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_CLAS_CODE, Lookup lineage reference object : stvclas")
    private String criteriaClasCode;
    /**
     * Level Code
     * <p>
     * Lineage reference object : SGRCLSR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String criteriaLevlCode;
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
     * From Hours
     * <p>
     * Lineage reference object : SGRCLSR_FROM_HOURS
     * (Required)
     * 
     */
    @JsonProperty("criteria.fromHours")
    @JsonPropertyDescription("Lineage reference object : SGRCLSR_FROM_HOURS")
    private Double criteriaFromHours;
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
    @JsonProperty("criteria.stvclasDesc")
    private String criteriaStvclasDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRCLSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRCLSR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public StudentClassificationRules100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

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

    public StudentClassificationRules100PutRequest withToHours(Double toHours) {
        this.toHours = toHours;
        return this;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SGRCATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * (Required)
     * 
     */
    @JsonProperty("attsCode")
    public String getAttsCode() {
        return attsCode;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SGRCATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * (Required)
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public StudentClassificationRules100PutRequest withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    /**
     * To Hours
     * <p>
     * Lineage reference object : SGRCLSR_TO_HOURS
     * (Required)
     * 
     */
    @JsonProperty("criteria.toHours")
    public Double getCriteriaToHours() {
        return criteriaToHours;
    }

    /**
     * To Hours
     * <p>
     * Lineage reference object : SGRCLSR_TO_HOURS
     * (Required)
     * 
     */
    @JsonProperty("criteria.toHours")
    public void setCriteriaToHours(Double criteriaToHours) {
        this.criteriaToHours = criteriaToHours;
    }

    public StudentClassificationRules100PutRequest withCriteriaToHours(Double criteriaToHours) {
        this.criteriaToHours = criteriaToHours;
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

    public StudentClassificationRules100PutRequest withClasCode(String clasCode) {
        this.clasCode = clasCode;
        return this;
    }

    /**
     * Class Code
     * <p>
     * Lineage reference object : SGRCLSR_CLAS_CODE, Lookup lineage reference object : stvclas
     * (Required)
     * 
     */
    @JsonProperty("criteria.clasCode")
    public String getCriteriaClasCode() {
        return criteriaClasCode;
    }

    /**
     * Class Code
     * <p>
     * Lineage reference object : SGRCLSR_CLAS_CODE, Lookup lineage reference object : stvclas
     * (Required)
     * 
     */
    @JsonProperty("criteria.clasCode")
    public void setCriteriaClasCode(String criteriaClasCode) {
        this.criteriaClasCode = criteriaClasCode;
    }

    public StudentClassificationRules100PutRequest withCriteriaClasCode(String criteriaClasCode) {
        this.criteriaClasCode = criteriaClasCode;
        return this;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : SGRCLSR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : SGRCLSR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public StudentClassificationRules100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
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

    public StudentClassificationRules100PutRequest withFromHours(Double fromHours) {
        this.fromHours = fromHours;
        return this;
    }

    /**
     * From Hours
     * <p>
     * Lineage reference object : SGRCLSR_FROM_HOURS
     * (Required)
     * 
     */
    @JsonProperty("criteria.fromHours")
    public Double getCriteriaFromHours() {
        return criteriaFromHours;
    }

    /**
     * From Hours
     * <p>
     * Lineage reference object : SGRCLSR_FROM_HOURS
     * (Required)
     * 
     */
    @JsonProperty("criteria.fromHours")
    public void setCriteriaFromHours(Double criteriaFromHours) {
        this.criteriaFromHours = criteriaFromHours;
    }

    public StudentClassificationRules100PutRequest withCriteriaFromHours(Double criteriaFromHours) {
        this.criteriaFromHours = criteriaFromHours;
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

    public StudentClassificationRules100PutRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvclasDesc")
    public String getCriteriaStvclasDesc() {
        return criteriaStvclasDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvclasDesc")
    public void setCriteriaStvclasDesc(String criteriaStvclasDesc) {
        this.criteriaStvclasDesc = criteriaStvclasDesc;
    }

    public StudentClassificationRules100PutRequest withCriteriaStvclasDesc(String criteriaStvclasDesc) {
        this.criteriaStvclasDesc = criteriaStvclasDesc;
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

    public StudentClassificationRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentClassificationRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("toHours");
        sb.append('=');
        sb.append(((this.toHours == null)?"<null>":this.toHours));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("criteriaToHours");
        sb.append('=');
        sb.append(((this.criteriaToHours == null)?"<null>":this.criteriaToHours));
        sb.append(',');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("criteriaClasCode");
        sb.append('=');
        sb.append(((this.criteriaClasCode == null)?"<null>":this.criteriaClasCode));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("fromHours");
        sb.append('=');
        sb.append(((this.fromHours == null)?"<null>":this.fromHours));
        sb.append(',');
        sb.append("criteriaFromHours");
        sb.append('=');
        sb.append(((this.criteriaFromHours == null)?"<null>":this.criteriaFromHours));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("criteriaStvclasDesc");
        sb.append('=');
        sb.append(((this.criteriaStvclasDesc == null)?"<null>":this.criteriaStvclasDesc));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaFromHours == null)? 0 :this.criteriaFromHours.hashCode()));
        result = ((result* 31)+((this.criteriaStvclasDesc == null)? 0 :this.criteriaStvclasDesc.hashCode()));
        result = ((result* 31)+((this.fromHours == null)? 0 :this.fromHours.hashCode()));
        result = ((result* 31)+((this.toHours == null)? 0 :this.toHours.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.criteriaToHours == null)? 0 :this.criteriaToHours.hashCode()));
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaClasCode == null)? 0 :this.criteriaClasCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentClassificationRules100PutRequest) == false) {
            return false;
        }
        StudentClassificationRules100PutRequest rhs = ((StudentClassificationRules100PutRequest) other);
        return (((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaFromHours == rhs.criteriaFromHours)||((this.criteriaFromHours!= null)&&this.criteriaFromHours.equals(rhs.criteriaFromHours))))&&((this.criteriaStvclasDesc == rhs.criteriaStvclasDesc)||((this.criteriaStvclasDesc!= null)&&this.criteriaStvclasDesc.equals(rhs.criteriaStvclasDesc))))&&((this.fromHours == rhs.fromHours)||((this.fromHours!= null)&&this.fromHours.equals(rhs.fromHours))))&&((this.toHours == rhs.toHours)||((this.toHours!= null)&&this.toHours.equals(rhs.toHours))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.criteriaToHours == rhs.criteriaToHours)||((this.criteriaToHours!= null)&&this.criteriaToHours.equals(rhs.criteriaToHours))))&&((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaClasCode == rhs.criteriaClasCode)||((this.criteriaClasCode!= null)&&this.criteriaClasCode.equals(rhs.criteriaClasCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
