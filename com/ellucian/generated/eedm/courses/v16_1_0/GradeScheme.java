
package com.ellucian.generated.eedm.courses.v16_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gradeScheme",
    "usage"
})
@Generated("jsonschema2pojo")
public class GradeScheme {

    /**
     * Grade Scheme
     * <p>
     * The grading scheme that may be used to award a grade to a student taking this course.
     * (Required)
     * 
     */
    @JsonProperty("gradeScheme")
    @JsonPropertyDescription("The grading scheme that may be used to award a grade to a student taking this course.")
    private GradeScheme__1 gradeScheme;
    /**
     * Usage
     * <p>
     * An indicator of whether the grade scheme is used as the default for registration.
     * 
     */
    @JsonProperty("usage")
    @JsonPropertyDescription("An indicator of whether the grade scheme is used as the default for registration.")
    private Object usage;

    /**
     * Grade Scheme
     * <p>
     * The grading scheme that may be used to award a grade to a student taking this course.
     * (Required)
     * 
     */
    @JsonProperty("gradeScheme")
    public GradeScheme__1 getGradeScheme() {
        return gradeScheme;
    }

    /**
     * Grade Scheme
     * <p>
     * The grading scheme that may be used to award a grade to a student taking this course.
     * (Required)
     * 
     */
    @JsonProperty("gradeScheme")
    public void setGradeScheme(GradeScheme__1 gradeScheme) {
        this.gradeScheme = gradeScheme;
    }

    public GradeScheme withGradeScheme(GradeScheme__1 gradeScheme) {
        this.gradeScheme = gradeScheme;
        return this;
    }

    /**
     * Usage
     * <p>
     * An indicator of whether the grade scheme is used as the default for registration.
     * 
     */
    @JsonProperty("usage")
    public Object getUsage() {
        return usage;
    }

    /**
     * Usage
     * <p>
     * An indicator of whether the grade scheme is used as the default for registration.
     * 
     */
    @JsonProperty("usage")
    public void setUsage(Object usage) {
        this.usage = usage;
    }

    public GradeScheme withUsage(Object usage) {
        this.usage = usage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeScheme.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gradeScheme");
        sb.append('=');
        sb.append(((this.gradeScheme == null)?"<null>":this.gradeScheme));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
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
        result = ((result* 31)+((this.gradeScheme == null)? 0 :this.gradeScheme.hashCode()));
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeScheme) == false) {
            return false;
        }
        GradeScheme rhs = ((GradeScheme) other);
        return (((this.gradeScheme == rhs.gradeScheme)||((this.gradeScheme!= null)&&this.gradeScheme.equals(rhs.gradeScheme)))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))));
    }

}
