
package com.ellucian.generated.bpapi.ban.section_syllabus_long_title_and_learning_objectives.v1_0_0;

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
    "learningObjectives",
    "longCourseTitle",
    "sectionUrl",
    "crn",
    "termCode"
})
@Generated("jsonschema2pojo")
public class SectionSyllabusLongTitleAndLearningObjectives100PutRequest {

    /**
     * Lineage reference object : SSRSYLO_LEARNING_OBJECTIVES
     * 
     */
    @JsonProperty("learningObjectives")
    @JsonPropertyDescription("Lineage reference object : SSRSYLO_LEARNING_OBJECTIVES")
    private Object learningObjectives;
    /**
     * Lineage reference object : SSRSYLN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("longCourseTitle")
    @JsonPropertyDescription("Lineage reference object : SSRSYLN_LONG_COURSE_TITLE")
    private String longCourseTitle;
    /**
     * URL
     * <p>
     * Lineage reference object : SSRSYLN_SECTION_URL
     * 
     */
    @JsonProperty("sectionUrl")
    @JsonPropertyDescription("Lineage reference object : SSRSYLN_SECTION_URL")
    private String sectionUrl;
    /**
     * CRN
     * <p>
     * Lineage reference object : crn
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : crn")
    private String crn;
    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : termCode, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SSRSYLO_LEARNING_OBJECTIVES
     * 
     */
    @JsonProperty("learningObjectives")
    public Object getLearningObjectives() {
        return learningObjectives;
    }

    /**
     * Lineage reference object : SSRSYLO_LEARNING_OBJECTIVES
     * 
     */
    @JsonProperty("learningObjectives")
    public void setLearningObjectives(Object learningObjectives) {
        this.learningObjectives = learningObjectives;
    }

    public SectionSyllabusLongTitleAndLearningObjectives100PutRequest withLearningObjectives(Object learningObjectives) {
        this.learningObjectives = learningObjectives;
        return this;
    }

    /**
     * Lineage reference object : SSRSYLN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("longCourseTitle")
    public String getLongCourseTitle() {
        return longCourseTitle;
    }

    /**
     * Lineage reference object : SSRSYLN_LONG_COURSE_TITLE
     * 
     */
    @JsonProperty("longCourseTitle")
    public void setLongCourseTitle(String longCourseTitle) {
        this.longCourseTitle = longCourseTitle;
    }

    public SectionSyllabusLongTitleAndLearningObjectives100PutRequest withLongCourseTitle(String longCourseTitle) {
        this.longCourseTitle = longCourseTitle;
        return this;
    }

    /**
     * URL
     * <p>
     * Lineage reference object : SSRSYLN_SECTION_URL
     * 
     */
    @JsonProperty("sectionUrl")
    public String getSectionUrl() {
        return sectionUrl;
    }

    /**
     * URL
     * <p>
     * Lineage reference object : SSRSYLN_SECTION_URL
     * 
     */
    @JsonProperty("sectionUrl")
    public void setSectionUrl(String sectionUrl) {
        this.sectionUrl = sectionUrl;
    }

    public SectionSyllabusLongTitleAndLearningObjectives100PutRequest withSectionUrl(String sectionUrl) {
        this.sectionUrl = sectionUrl;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : crn
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : crn
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public SectionSyllabusLongTitleAndLearningObjectives100PutRequest withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public SectionSyllabusLongTitleAndLearningObjectives100PutRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public SectionSyllabusLongTitleAndLearningObjectives100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionSyllabusLongTitleAndLearningObjectives100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("learningObjectives");
        sb.append('=');
        sb.append(((this.learningObjectives == null)?"<null>":this.learningObjectives));
        sb.append(',');
        sb.append("longCourseTitle");
        sb.append('=');
        sb.append(((this.longCourseTitle == null)?"<null>":this.longCourseTitle));
        sb.append(',');
        sb.append("sectionUrl");
        sb.append('=');
        sb.append(((this.sectionUrl == null)?"<null>":this.sectionUrl));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.learningObjectives == null)? 0 :this.learningObjectives.hashCode()));
        result = ((result* 31)+((this.longCourseTitle == null)? 0 :this.longCourseTitle.hashCode()));
        result = ((result* 31)+((this.sectionUrl == null)? 0 :this.sectionUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionSyllabusLongTitleAndLearningObjectives100PutRequest) == false) {
            return false;
        }
        SectionSyllabusLongTitleAndLearningObjectives100PutRequest rhs = ((SectionSyllabusLongTitleAndLearningObjectives100PutRequest) other);
        return (((((((this.learningObjectives == rhs.learningObjectives)||((this.learningObjectives!= null)&&this.learningObjectives.equals(rhs.learningObjectives)))&&((this.longCourseTitle == rhs.longCourseTitle)||((this.longCourseTitle!= null)&&this.longCourseTitle.equals(rhs.longCourseTitle))))&&((this.sectionUrl == rhs.sectionUrl)||((this.sectionUrl!= null)&&this.sectionUrl.equals(rhs.sectionUrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
