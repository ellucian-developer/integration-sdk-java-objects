
package com.ellucian.generated.bpapi.ban.section_syllabus_long_title_and_learning_objectives.v1_0_0;

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
    "longCourseTitle",
    "sectionUrl"
})
@Generated("jsonschema2pojo")
public class Ssrsyln {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRSYLN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRSYLN_ACTIVITY_DATE")
    private Date activityDate;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRSYLN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRSYLN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssrsyln withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public Ssrsyln withLongCourseTitle(String longCourseTitle) {
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

    public Ssrsyln withSectionUrl(String sectionUrl) {
        this.sectionUrl = sectionUrl;
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

    public Ssrsyln withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrsyln.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("longCourseTitle");
        sb.append('=');
        sb.append(((this.longCourseTitle == null)?"<null>":this.longCourseTitle));
        sb.append(',');
        sb.append("sectionUrl");
        sb.append('=');
        sb.append(((this.sectionUrl == null)?"<null>":this.sectionUrl));
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
        result = ((result* 31)+((this.longCourseTitle == null)? 0 :this.longCourseTitle.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.sectionUrl == null)? 0 :this.sectionUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrsyln) == false) {
            return false;
        }
        Ssrsyln rhs = ((Ssrsyln) other);
        return (((((this.longCourseTitle == rhs.longCourseTitle)||((this.longCourseTitle!= null)&&this.longCourseTitle.equals(rhs.longCourseTitle)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.sectionUrl == rhs.sectionUrl)||((this.sectionUrl!= null)&&this.sectionUrl.equals(rhs.sectionUrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
