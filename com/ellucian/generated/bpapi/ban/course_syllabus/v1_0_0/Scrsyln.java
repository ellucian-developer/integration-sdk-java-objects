
package com.ellucian.generated.bpapi.ban.course_syllabus.v1_0_0;

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
    "courseUrl",
    "endcopy"
})
@Generated("jsonschema2pojo")
public class Scrsyln {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRSYLN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SCRSYLN_ACTIVITY_DATE")
    private Date activityDate;
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
    @JsonProperty("endcopy")
    private String endcopy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRSYLN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRSYLN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Scrsyln withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public Scrsyln withLongCourseTitle(String longCourseTitle) {
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

    public Scrsyln withCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
        return this;
    }

    @JsonProperty("endcopy")
    public String getEndcopy() {
        return endcopy;
    }

    @JsonProperty("endcopy")
    public void setEndcopy(String endcopy) {
        this.endcopy = endcopy;
    }

    public Scrsyln withEndcopy(String endcopy) {
        this.endcopy = endcopy;
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

    public Scrsyln withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrsyln.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("longCourseTitle");
        sb.append('=');
        sb.append(((this.longCourseTitle == null)?"<null>":this.longCourseTitle));
        sb.append(',');
        sb.append("courseUrl");
        sb.append('=');
        sb.append(((this.courseUrl == null)?"<null>":this.courseUrl));
        sb.append(',');
        sb.append("endcopy");
        sb.append('=');
        sb.append(((this.endcopy == null)?"<null>":this.endcopy));
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
        result = ((result* 31)+((this.courseUrl == null)? 0 :this.courseUrl.hashCode()));
        result = ((result* 31)+((this.endcopy == null)? 0 :this.endcopy.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrsyln) == false) {
            return false;
        }
        Scrsyln rhs = ((Scrsyln) other);
        return ((((((this.longCourseTitle == rhs.longCourseTitle)||((this.longCourseTitle!= null)&&this.longCourseTitle.equals(rhs.longCourseTitle)))&&((this.courseUrl == rhs.courseUrl)||((this.courseUrl!= null)&&this.courseUrl.equals(rhs.courseUrl))))&&((this.endcopy == rhs.endcopy)||((this.endcopy!= null)&&this.endcopy.equals(rhs.endcopy))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
