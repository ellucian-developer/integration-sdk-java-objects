
package com.ellucian.generated.bpapi.ban.course_syllabus.v1_0_0;

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
    "technicalRequirement",
    "termCodeEff",
    "subjCode",
    "learningObjectives",
    "longCourseTitle",
    "courseUrl",
    "requiredMaterials"
})
@Generated("jsonschema2pojo")
public class CourseSyllabus100PutRequest {

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
     * Lineage reference object : SCRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    @JsonPropertyDescription("Lineage reference object : SCRSYTR_TECHNICAL_REQUIREMENT")
    private Object technicalRequirement;
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
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private Object subjCode;
    /**
     * Lineage reference object : SCRSYLO_LEARNING_OBJECTIVES
     * 
     */
    @JsonProperty("learningObjectives")
    @JsonPropertyDescription("Lineage reference object : SCRSYLO_LEARNING_OBJECTIVES")
    private Object learningObjectives;
    /**
     * Title
     * <p>
     * Lineage reference object : SCRSYLN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("longCourseTitle")
    @JsonPropertyDescription("Lineage reference object : SCRSYLN_LONG_COURSE_TITLE")
    private String longCourseTitle;
    /**
     * URL
     * <p>
     * Lineage reference object : SCRSYLN_COURSE_URL
     * 
     */
    @JsonProperty("courseUrl")
    @JsonPropertyDescription("Lineage reference object : SCRSYLN_COURSE_URL")
    private String courseUrl;
    /**
     * Lineage reference object : SCRSYRM_REQUIRED_MATERIALS
     * 
     */
    @JsonProperty("requiredMaterials")
    @JsonPropertyDescription("Lineage reference object : SCRSYRM_REQUIRED_MATERIALS")
    private Object requiredMaterials;
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

    public CourseSyllabus100PutRequest withCrseNumb(Object crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Lineage reference object : SCRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    public Object getTechnicalRequirement() {
        return technicalRequirement;
    }

    /**
     * Lineage reference object : SCRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    public void setTechnicalRequirement(Object technicalRequirement) {
        this.technicalRequirement = technicalRequirement;
    }

    public CourseSyllabus100PutRequest withTechnicalRequirement(Object technicalRequirement) {
        this.technicalRequirement = technicalRequirement;
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

    public CourseSyllabus100PutRequest withTermCodeEff(Object termCodeEff) {
        this.termCodeEff = termCodeEff;
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

    public CourseSyllabus100PutRequest withSubjCode(Object subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Lineage reference object : SCRSYLO_LEARNING_OBJECTIVES
     * 
     */
    @JsonProperty("learningObjectives")
    public Object getLearningObjectives() {
        return learningObjectives;
    }

    /**
     * Lineage reference object : SCRSYLO_LEARNING_OBJECTIVES
     * 
     */
    @JsonProperty("learningObjectives")
    public void setLearningObjectives(Object learningObjectives) {
        this.learningObjectives = learningObjectives;
    }

    public CourseSyllabus100PutRequest withLearningObjectives(Object learningObjectives) {
        this.learningObjectives = learningObjectives;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SCRSYLN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("longCourseTitle")
    public String getLongCourseTitle() {
        return longCourseTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SCRSYLN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("longCourseTitle")
    public void setLongCourseTitle(String longCourseTitle) {
        this.longCourseTitle = longCourseTitle;
    }

    public CourseSyllabus100PutRequest withLongCourseTitle(String longCourseTitle) {
        this.longCourseTitle = longCourseTitle;
        return this;
    }

    /**
     * URL
     * <p>
     * Lineage reference object : SCRSYLN_COURSE_URL
     * 
     */
    @JsonProperty("courseUrl")
    public String getCourseUrl() {
        return courseUrl;
    }

    /**
     * URL
     * <p>
     * Lineage reference object : SCRSYLN_COURSE_URL
     * 
     */
    @JsonProperty("courseUrl")
    public void setCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
    }

    public CourseSyllabus100PutRequest withCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
        return this;
    }

    /**
     * Lineage reference object : SCRSYRM_REQUIRED_MATERIALS
     * 
     */
    @JsonProperty("requiredMaterials")
    public Object getRequiredMaterials() {
        return requiredMaterials;
    }

    /**
     * Lineage reference object : SCRSYRM_REQUIRED_MATERIALS
     * 
     */
    @JsonProperty("requiredMaterials")
    public void setRequiredMaterials(Object requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
    }

    public CourseSyllabus100PutRequest withRequiredMaterials(Object requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
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

    public CourseSyllabus100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseSyllabus100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("technicalRequirement");
        sb.append('=');
        sb.append(((this.technicalRequirement == null)?"<null>":this.technicalRequirement));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("learningObjectives");
        sb.append('=');
        sb.append(((this.learningObjectives == null)?"<null>":this.learningObjectives));
        sb.append(',');
        sb.append("longCourseTitle");
        sb.append('=');
        sb.append(((this.longCourseTitle == null)?"<null>":this.longCourseTitle));
        sb.append(',');
        sb.append("courseUrl");
        sb.append('=');
        sb.append(((this.courseUrl == null)?"<null>":this.courseUrl));
        sb.append(',');
        sb.append("requiredMaterials");
        sb.append('=');
        sb.append(((this.requiredMaterials == null)?"<null>":this.requiredMaterials));
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
        result = ((result* 31)+((this.technicalRequirement == null)? 0 :this.technicalRequirement.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.learningObjectives == null)? 0 :this.learningObjectives.hashCode()));
        result = ((result* 31)+((this.longCourseTitle == null)? 0 :this.longCourseTitle.hashCode()));
        result = ((result* 31)+((this.courseUrl == null)? 0 :this.courseUrl.hashCode()));
        result = ((result* 31)+((this.requiredMaterials == null)? 0 :this.requiredMaterials.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseSyllabus100PutRequest) == false) {
            return false;
        }
        CourseSyllabus100PutRequest rhs = ((CourseSyllabus100PutRequest) other);
        return ((((((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.technicalRequirement == rhs.technicalRequirement)||((this.technicalRequirement!= null)&&this.technicalRequirement.equals(rhs.technicalRequirement))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.learningObjectives == rhs.learningObjectives)||((this.learningObjectives!= null)&&this.learningObjectives.equals(rhs.learningObjectives))))&&((this.longCourseTitle == rhs.longCourseTitle)||((this.longCourseTitle!= null)&&this.longCourseTitle.equals(rhs.longCourseTitle))))&&((this.courseUrl == rhs.courseUrl)||((this.courseUrl!= null)&&this.courseUrl.equals(rhs.courseUrl))))&&((this.requiredMaterials == rhs.requiredMaterials)||((this.requiredMaterials!= null)&&this.requiredMaterials.equals(rhs.requiredMaterials))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
