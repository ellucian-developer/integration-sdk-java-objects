
package com.ellucian.generated.eedm.sections_maximum.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Subject
 * <p>
 * A topic or category used to categorize a branch of knowledge or study such as "Mathematics" or "Biology".
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "abbreviation",
    "title",
    "detail"
})
@Generated("jsonschema2pojo")
public class Subject {

    /**
     * Abbreviation
     * <p>
     * Human-readable abbreviated name of the subject.
     * 
     */
    @JsonProperty("abbreviation")
    @JsonPropertyDescription("Human-readable abbreviated name of the subject.")
    private String abbreviation;
    /**
     * Title
     * <p>
     * The full name of a subject.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a subject.")
    private String title;
    /**
     * Subject
     * <p>
     * The subject associated with this course.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The subject associated with this course.")
    private Detail detail;

    /**
     * Abbreviation
     * <p>
     * Human-readable abbreviated name of the subject.
     * 
     */
    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Abbreviation
     * <p>
     * Human-readable abbreviated name of the subject.
     * 
     */
    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Subject withAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a subject.
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
     * The full name of a subject.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Subject withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Subject
     * <p>
     * The subject associated with this course.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail getDetail() {
        return detail;
    }

    /**
     * Subject
     * <p>
     * The subject associated with this course.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Subject withDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Subject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("abbreviation");
        sb.append('=');
        sb.append(((this.abbreviation == null)?"<null>":this.abbreviation));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.abbreviation == null)? 0 :this.abbreviation.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subject) == false) {
            return false;
        }
        Subject rhs = ((Subject) other);
        return ((((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail)))&&((this.abbreviation == rhs.abbreviation)||((this.abbreviation!= null)&&this.abbreviation.equals(rhs.abbreviation))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
