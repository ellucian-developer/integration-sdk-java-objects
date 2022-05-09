
package com.ellucian.generated.eedm.sections_maximum.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Course
 * <p>
 * The course associated with this section.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "subject",
    "number",
    "detail"
})
@Generated("jsonschema2pojo")
public class Course {

    /**
     * Title
     * <p>
     * The full name of a course.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a course.")
    private String title;
    /**
     * Subject
     * <p>
     * A branch of knowledge typically used as a course of study, such as "Mathematics" or "Biology".
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A branch of knowledge typically used as a course of study, such as \"Mathematics\" or \"Biology\".")
    private Subject subject;
    /**
     * Course Number
     * <p>
     * A numbering scheme to distinguish different Courses. Typically this is an integer, but can be any string.
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("A numbering scheme to distinguish different Courses. Typically this is an integer, but can be any string.")
    private String number;
    /**
     * Course
     * <p>
     * The course associated with this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The course associated with this section.")
    private Detail__1 detail;

    /**
     * Title
     * <p>
     * The full name of a course.
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
     * The full name of a course.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Course withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Subject
     * <p>
     * A branch of knowledge typically used as a course of study, such as "Mathematics" or "Biology".
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public Subject getSubject() {
        return subject;
    }

    /**
     * Subject
     * <p>
     * A branch of knowledge typically used as a course of study, such as "Mathematics" or "Biology".
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Course withSubject(Subject subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Course Number
     * <p>
     * A numbering scheme to distinguish different Courses. Typically this is an integer, but can be any string.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Course Number
     * <p>
     * A numbering scheme to distinguish different Courses. Typically this is an integer, but can be any string.
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Course withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Course
     * <p>
     * The course associated with this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail__1 getDetail() {
        return detail;
    }

    /**
     * Course
     * <p>
     * The course associated with this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__1 detail) {
        this.detail = detail;
    }

    public Course withDetail(Detail__1 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Course.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Course) == false) {
            return false;
        }
        Course rhs = ((Course) other);
        return (((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))));
    }

}
