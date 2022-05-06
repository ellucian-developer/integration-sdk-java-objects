
package com.ellucian.generated.bpapi.ban.course_registration_campus_and_college_restrictions.v1_0_0;

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
    "criteria.campDescription",
    "criteria.campCode",
    "campCode",
    "subjCode",
    "criteria.collDescription",
    "criteria.collCode",
    "collCode"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationCampusAndCollegeRestrictions100PutRequest {

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private Object crseNumb;
    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private Object termCodeEff;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.campDescription")
    private String criteriaCampDescription;
    /**
     * Campus
     * <p>
     * Lineage reference object : SCRRCAM_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    @JsonPropertyDescription("Lineage reference object : SCRRCAM_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String criteriaCampCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SCRRCAM_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SCRRCAM_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private Object subjCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.collDescription")
    private String criteriaCollDescription;
    /**
     * College
     * <p>
     * Lineage reference object : SCRRCOL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SCRRCOL_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
    /**
     * College
     * <p>
     * Lineage reference object : SCRRCOL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SCRRCOL_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public Object getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(Object crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withCrseNumb(Object crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public Object getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(Object termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withTermCodeEff(Object termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.campDescription")
    public String getCriteriaCampDescription() {
        return criteriaCampDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.campDescription")
    public void setCriteriaCampDescription(String criteriaCampDescription) {
        this.criteriaCampDescription = criteriaCampDescription;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withCriteriaCampDescription(String criteriaCampDescription) {
        this.criteriaCampDescription = criteriaCampDescription;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SCRRCAM_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public String getCriteriaCampCode() {
        return criteriaCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SCRRCAM_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.campCode")
    public void setCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withCriteriaCampCode(String criteriaCampCode) {
        this.criteriaCampCode = criteriaCampCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SCRRCAM_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SCRRCAM_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public Object getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(Object subjCode) {
        this.subjCode = subjCode;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withSubjCode(Object subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.collDescription")
    public String getCriteriaCollDescription() {
        return criteriaCollDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.collDescription")
    public void setCriteriaCollDescription(String criteriaCollDescription) {
        this.criteriaCollDescription = criteriaCollDescription;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withCriteriaCollDescription(String criteriaCollDescription) {
        this.criteriaCollDescription = criteriaCollDescription;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SCRRCOL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SCRRCOL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SCRRCOL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SCRRCOL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
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

    public CourseRegistrationCampusAndCollegeRestrictions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationCampusAndCollegeRestrictions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("criteriaCampDescription");
        sb.append('=');
        sb.append(((this.criteriaCampDescription == null)?"<null>":this.criteriaCampDescription));
        sb.append(',');
        sb.append("criteriaCampCode");
        sb.append('=');
        sb.append(((this.criteriaCampCode == null)?"<null>":this.criteriaCampCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("criteriaCollDescription");
        sb.append('=');
        sb.append(((this.criteriaCollDescription == null)?"<null>":this.criteriaCollDescription));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
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
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.criteriaCampCode == null)? 0 :this.criteriaCampCode.hashCode()));
        result = ((result* 31)+((this.criteriaCampDescription == null)? 0 :this.criteriaCampDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollDescription == null)? 0 :this.criteriaCollDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationCampusAndCollegeRestrictions100PutRequest) == false) {
            return false;
        }
        CourseRegistrationCampusAndCollegeRestrictions100PutRequest rhs = ((CourseRegistrationCampusAndCollegeRestrictions100PutRequest) other);
        return (((((((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.criteriaCampCode == rhs.criteriaCampCode)||((this.criteriaCampCode!= null)&&this.criteriaCampCode.equals(rhs.criteriaCampCode))))&&((this.criteriaCampDescription == rhs.criteriaCampDescription)||((this.criteriaCampDescription!= null)&&this.criteriaCampDescription.equals(rhs.criteriaCampDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.criteriaCollDescription == rhs.criteriaCollDescription)||((this.criteriaCollDescription!= null)&&this.criteriaCollDescription.equals(rhs.criteriaCollDescription))));
    }

}
