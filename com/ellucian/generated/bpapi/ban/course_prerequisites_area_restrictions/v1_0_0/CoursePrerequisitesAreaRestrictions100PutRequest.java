
package com.ellucian.generated.bpapi.ban.course_prerequisites_area_restrictions.v1_0_0;

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
    "crseNumb",
    "termCodeEff",
    "criteria.activityDate",
    "scrrareArea",
    "subjCode",
    "criteria.area",
    "criteria.areaDesc"
})
@Generated("jsonschema2pojo")
public class CoursePrerequisitesAreaRestrictions100PutRequest {

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private Object crseNumb;
    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private Object termCodeEff;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRRARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SCRRARE_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Area
     * <p>
     * Lineage reference object : SCRRARE_AREA
     * 
     */
    @JsonProperty("scrrareArea")
    @JsonPropertyDescription("Lineage reference object : SCRRARE_AREA")
    private String scrrareArea;
    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj")
    private Object subjCode;
    /**
     * Area
     * <p>
     * Lineage reference object : SCRRARE_AREA
     * 
     */
    @JsonProperty("criteria.area")
    @JsonPropertyDescription("Lineage reference object : SCRRARE_AREA")
    private String criteriaArea;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.areaDesc")
    private String criteriaAreaDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public Object getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scapreqCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(Object crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CoursePrerequisitesAreaRestrictions100PutRequest withCrseNumb(Object crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public Object getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scapreqTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(Object termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public CoursePrerequisitesAreaRestrictions100PutRequest withTermCodeEff(Object termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRRARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRRARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public CoursePrerequisitesAreaRestrictions100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SCRRARE_AREA
     * 
     */
    @JsonProperty("scrrareArea")
    public String getScrrareArea() {
        return scrrareArea;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SCRRARE_AREA
     * 
     */
    @JsonProperty("scrrareArea")
    public void setScrrareArea(String scrrareArea) {
        this.scrrareArea = scrrareArea;
    }

    public CoursePrerequisitesAreaRestrictions100PutRequest withScrrareArea(String scrrareArea) {
        this.scrrareArea = scrrareArea;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public Object getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scapreqSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(Object subjCode) {
        this.subjCode = subjCode;
    }

    public CoursePrerequisitesAreaRestrictions100PutRequest withSubjCode(Object subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SCRRARE_AREA
     * 
     */
    @JsonProperty("criteria.area")
    public String getCriteriaArea() {
        return criteriaArea;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SCRRARE_AREA
     * 
     */
    @JsonProperty("criteria.area")
    public void setCriteriaArea(String criteriaArea) {
        this.criteriaArea = criteriaArea;
    }

    public CoursePrerequisitesAreaRestrictions100PutRequest withCriteriaArea(String criteriaArea) {
        this.criteriaArea = criteriaArea;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.areaDesc")
    public String getCriteriaAreaDesc() {
        return criteriaAreaDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.areaDesc")
    public void setCriteriaAreaDesc(String criteriaAreaDesc) {
        this.criteriaAreaDesc = criteriaAreaDesc;
    }

    public CoursePrerequisitesAreaRestrictions100PutRequest withCriteriaAreaDesc(String criteriaAreaDesc) {
        this.criteriaAreaDesc = criteriaAreaDesc;
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

    public CoursePrerequisitesAreaRestrictions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoursePrerequisitesAreaRestrictions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("scrrareArea");
        sb.append('=');
        sb.append(((this.scrrareArea == null)?"<null>":this.scrrareArea));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("criteriaArea");
        sb.append('=');
        sb.append(((this.criteriaArea == null)?"<null>":this.criteriaArea));
        sb.append(',');
        sb.append("criteriaAreaDesc");
        sb.append('=');
        sb.append(((this.criteriaAreaDesc == null)?"<null>":this.criteriaAreaDesc));
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
        result = ((result* 31)+((this.criteriaArea == null)? 0 :this.criteriaArea.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.scrrareArea == null)? 0 :this.scrrareArea.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaAreaDesc == null)? 0 :this.criteriaAreaDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoursePrerequisitesAreaRestrictions100PutRequest) == false) {
            return false;
        }
        CoursePrerequisitesAreaRestrictions100PutRequest rhs = ((CoursePrerequisitesAreaRestrictions100PutRequest) other);
        return (((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaArea == rhs.criteriaArea)||((this.criteriaArea!= null)&&this.criteriaArea.equals(rhs.criteriaArea))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.scrrareArea == rhs.scrrareArea)||((this.scrrareArea!= null)&&this.scrrareArea.equals(rhs.scrrareArea))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaAreaDesc == rhs.criteriaAreaDesc)||((this.criteriaAreaDesc!= null)&&this.criteriaAreaDesc.equals(rhs.criteriaAreaDesc))));
    }

}
