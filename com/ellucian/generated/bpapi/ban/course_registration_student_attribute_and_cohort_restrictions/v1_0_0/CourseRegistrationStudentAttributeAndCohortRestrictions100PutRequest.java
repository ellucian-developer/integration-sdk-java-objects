
package com.ellucian.generated.bpapi.ban.course_registration_student_attribute_and_cohort_restrictions.v1_0_0;

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
    "criteria.criteriaAttsCode",
    "chrtCode",
    "attsCode",
    "scacrseCrseNumb",
    "scacrseSubjCode",
    "criteria.criteriaChrtCode",
    "scacrseTermCodeEff"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest {

    /**
     * Attribute
     * <p>
     * Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("criteria.criteriaAttsCode")
    @JsonPropertyDescription("Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String criteriaCriteriaAttsCode;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SCRRCHR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SCRRCHR_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Attribute
     * <p>
     * Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private Object scacrseCrseNumb;
    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private Object scacrseSubjCode;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SCRRCHR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("criteria.criteriaChrtCode")
    @JsonPropertyDescription("Lineage reference object : SCRRCHR_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String criteriaCriteriaChrtCode;
    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private Object scacrseTermCodeEff;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attribute
     * <p>
     * Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("criteria.criteriaAttsCode")
    public String getCriteriaCriteriaAttsCode() {
        return criteriaCriteriaAttsCode;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("criteria.criteriaAttsCode")
    public void setCriteriaCriteriaAttsCode(String criteriaCriteriaAttsCode) {
        this.criteriaCriteriaAttsCode = criteriaCriteriaAttsCode;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest withCriteriaCriteriaAttsCode(String criteriaCriteriaAttsCode) {
        this.criteriaCriteriaAttsCode = criteriaCriteriaAttsCode;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SCRRCHR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SCRRCHR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public String getAttsCode() {
        return attsCode;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SCRRATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public Object getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(Object scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest withScacrseCrseNumb(Object scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public Object getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(Object scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest withScacrseSubjCode(Object scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SCRRCHR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("criteria.criteriaChrtCode")
    public String getCriteriaCriteriaChrtCode() {
        return criteriaCriteriaChrtCode;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SCRRCHR_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("criteria.criteriaChrtCode")
    public void setCriteriaCriteriaChrtCode(String criteriaCriteriaChrtCode) {
        this.criteriaCriteriaChrtCode = criteriaCriteriaChrtCode;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest withCriteriaCriteriaChrtCode(String criteriaCriteriaChrtCode) {
        this.criteriaCriteriaChrtCode = criteriaCriteriaChrtCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public Object getScacrseTermCodeEff() {
        return scacrseTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public void setScacrseTermCodeEff(Object scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest withScacrseTermCodeEff(Object scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
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

    public CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCriteriaAttsCode");
        sb.append('=');
        sb.append(((this.criteriaCriteriaAttsCode == null)?"<null>":this.criteriaCriteriaAttsCode));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("criteriaCriteriaChrtCode");
        sb.append('=');
        sb.append(((this.criteriaCriteriaChrtCode == null)?"<null>":this.criteriaCriteriaChrtCode));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
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
        result = ((result* 31)+((this.criteriaCriteriaAttsCode == null)? 0 :this.criteriaCriteriaAttsCode.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaCriteriaChrtCode == null)? 0 :this.criteriaCriteriaChrtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseTermCodeEff == null)? 0 :this.scacrseTermCodeEff.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest) == false) {
            return false;
        }
        CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest rhs = ((CourseRegistrationStudentAttributeAndCohortRestrictions100PutRequest) other);
        return (((((((((this.criteriaCriteriaAttsCode == rhs.criteriaCriteriaAttsCode)||((this.criteriaCriteriaAttsCode!= null)&&this.criteriaCriteriaAttsCode.equals(rhs.criteriaCriteriaAttsCode)))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.criteriaCriteriaChrtCode == rhs.criteriaCriteriaChrtCode)||((this.criteriaCriteriaChrtCode!= null)&&this.criteriaCriteriaChrtCode.equals(rhs.criteriaCriteriaChrtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))));
    }

}
