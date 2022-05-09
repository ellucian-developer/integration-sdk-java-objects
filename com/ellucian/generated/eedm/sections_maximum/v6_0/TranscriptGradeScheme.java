
package com.ellucian.generated.eedm.sections_maximum.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "title",
    "academicLevel",
    "startOn",
    "endOn",
    "detail"
})
@Generated("jsonschema2pojo")
public class TranscriptGradeScheme {

    /**
     * Code
     * <p>
     * The code for the grade scheme that may be used a reference or for reporting.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code for the grade scheme that may be used a reference or for reporting.")
    private String code;
    /**
     * Title
     * <p>
     * The full name of a grade scheme.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a grade scheme.")
    private String title;
    /**
     * Academic Level
     * <p>
     * A designation of the level of instruction of a course or a program of study.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("A designation of the level of instruction of a course or a program of study.")
    private AcademicLevel__2 academicLevel;
    /**
     * Start Date
     * <p>
     * The date after which a grade scheme may be used.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date after which a grade scheme may be used.")
    private Object startOn;
    /**
     * End Date
     * <p>
     * The date after which a grade scheme may no longer be used.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date after which a grade scheme may no longer be used.")
    private Object endOn;
    /**
     * Detail
     * <p>
     * The scheme to which the grade belongs, such as pass/fail, etc.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The scheme to which the grade belongs, such as pass/fail, etc.")
    private Detail__7 detail;

    /**
     * Code
     * <p>
     * The code for the grade scheme that may be used a reference or for reporting.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code for the grade scheme that may be used a reference or for reporting.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public TranscriptGradeScheme withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a grade scheme.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of a grade scheme.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public TranscriptGradeScheme withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * A designation of the level of instruction of a course or a program of study.
     * 
     */
    @JsonProperty("academicLevel")
    public AcademicLevel__2 getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * A designation of the level of instruction of a course or a program of study.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(AcademicLevel__2 academicLevel) {
        this.academicLevel = academicLevel;
    }

    public TranscriptGradeScheme withAcademicLevel(AcademicLevel__2 academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date after which a grade scheme may be used.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date after which a grade scheme may be used.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public TranscriptGradeScheme withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date after which a grade scheme may no longer be used.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The date after which a grade scheme may no longer be used.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public TranscriptGradeScheme withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Detail
     * <p>
     * The scheme to which the grade belongs, such as pass/fail, etc.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail__7 getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The scheme to which the grade belongs, such as pass/fail, etc.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__7 detail) {
        this.detail = detail;
    }

    public TranscriptGradeScheme withDetail(Detail__7 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TranscriptGradeScheme.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TranscriptGradeScheme) == false) {
            return false;
        }
        TranscriptGradeScheme rhs = ((TranscriptGradeScheme) other);
        return (((((((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
