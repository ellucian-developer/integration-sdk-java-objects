
package com.ellucian.generated.eedm.sections_maximum.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Academic Level
 * <p>
 * A designation of the level of instruction of a course or a program of study.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "title",
    "detail"
})
@Generated("jsonschema2pojo")
public class AcademicLevel__1 {

    /**
     * Code
     * <p>
     * The code that identifies the academic level (e.g. 'UG').
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that identifies the academic level (e.g. 'UG').")
    private String code;
    /**
     * Title
     * <p>
     * The full name of the academic level (e.g. 'Undergraduate').
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the academic level (e.g. 'Undergraduate').")
    private String title;
    /**
     * Detail
     * <p>
     * A designation of the level of instruction of a course or a program of study.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("A designation of the level of instruction of a course or a program of study.")
    private Detail__4 detail;

    /**
     * Code
     * <p>
     * The code that identifies the academic level (e.g. 'UG').
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that identifies the academic level (e.g. 'UG').
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AcademicLevel__1 withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the academic level (e.g. 'Undergraduate').
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the academic level (e.g. 'Undergraduate').
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AcademicLevel__1 withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Detail
     * <p>
     * A designation of the level of instruction of a course or a program of study.
     * 
     */
    @JsonProperty("detail")
    public Detail__4 getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * A designation of the level of instruction of a course or a program of study.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__4 detail) {
        this.detail = detail;
    }

    public AcademicLevel__1 withDetail(Detail__4 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicLevel__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicLevel__1) == false) {
            return false;
        }
        AcademicLevel__1 rhs = ((AcademicLevel__1) other);
        return ((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
