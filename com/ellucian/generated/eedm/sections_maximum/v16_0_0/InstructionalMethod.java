
package com.ellucian.generated.eedm.sections_maximum.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Instructional Method
 * <p>
 * The method, style, or format of instruction associated with the instructor's involvement with the section (for example, 'Lecture', 'Lab').
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "abbreviation",
    "title",
    "detail"
})
@Generated("jsonschema2pojo")
public class InstructionalMethod {

    /**
     * Abbreviation
     * <p>
     * The abbreviated name of an instructional method.
     * 
     */
    @JsonProperty("abbreviation")
    @JsonPropertyDescription("The abbreviated name of an instructional method.")
    private String abbreviation;
    /**
     * Title
     * <p>
     * The full name of an instructional method.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an instructional method.")
    private String title;
    /**
     * Instructional Method
     * <p>
     * The instructional method used in this instructional event.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The instructional method used in this instructional event.")
    private Detail__6 detail;

    /**
     * Abbreviation
     * <p>
     * The abbreviated name of an instructional method.
     * 
     */
    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Abbreviation
     * <p>
     * The abbreviated name of an instructional method.
     * 
     */
    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public InstructionalMethod withAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an instructional method.
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
     * The full name of an instructional method.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public InstructionalMethod withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * The instructional method used in this instructional event.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail__6 getDetail() {
        return detail;
    }

    /**
     * Instructional Method
     * <p>
     * The instructional method used in this instructional event.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__6 detail) {
        this.detail = detail;
    }

    public InstructionalMethod withDetail(Detail__6 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstructionalMethod.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof InstructionalMethod) == false) {
            return false;
        }
        InstructionalMethod rhs = ((InstructionalMethod) other);
        return ((((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail)))&&((this.abbreviation == rhs.abbreviation)||((this.abbreviation!= null)&&this.abbreviation.equals(rhs.abbreviation))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
