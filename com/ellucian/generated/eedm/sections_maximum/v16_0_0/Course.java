
package com.ellucian.generated.eedm.sections_maximum.v16_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Course
 * <p>
 * The smallest unit of instruction for which an Organization grants credits.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "titles",
    "subject",
    "number",
    "detail"
})
@Generated("jsonschema2pojo")
public class Course {

    /**
     * Titles
     * <p>
     * The course titles details.
     * (Required)
     * 
     */
    @JsonProperty("titles")
    @JsonPropertyDescription("The course titles details.")
    private List<Title> titles = new ArrayList<Title>();
    /**
     * Subject
     * <p>
     * A topic or category used to categorize a branch of knowledge or study such as "Mathematics" or "Biology".
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("A topic or category used to categorize a branch of knowledge or study such as \"Mathematics\" or \"Biology\".")
    private Subject subject;
    /**
     * Course Number
     * <p>
     * A numbering scheme that distinguishes courses within a subject. Typically, this is an integer.
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("A numbering scheme that distinguishes courses within a subject. Typically, this is an integer.")
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
     * Titles
     * <p>
     * The course titles details.
     * (Required)
     * 
     */
    @JsonProperty("titles")
    public List<Title> getTitles() {
        return titles;
    }

    /**
     * Titles
     * <p>
     * The course titles details.
     * (Required)
     * 
     */
    @JsonProperty("titles")
    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public Course withTitles(List<Title> titles) {
        this.titles = titles;
        return this;
    }

    /**
     * Subject
     * <p>
     * A topic or category used to categorize a branch of knowledge or study such as "Mathematics" or "Biology".
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
     * A topic or category used to categorize a branch of knowledge or study such as "Mathematics" or "Biology".
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
     * A numbering scheme that distinguishes courses within a subject. Typically, this is an integer.
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
     * A numbering scheme that distinguishes courses within a subject. Typically, this is an integer.
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
        sb.append("titles");
        sb.append('=');
        sb.append(((this.titles == null)?"<null>":this.titles));
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
        result = ((result* 31)+((this.titles == null)? 0 :this.titles.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
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
        return (((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.titles == rhs.titles)||((this.titles!= null)&&this.titles.equals(rhs.titles))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))));
    }

}
