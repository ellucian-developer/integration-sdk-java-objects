
package com.ellucian.generated.eedm.sections_maximum.v8_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "title",
    "detail"
})
@Generated("jsonschema2pojo")
public class AcademicLevel {

    /**
     * Code
     * <p>
     * A code that identifies an academic level (for example, 'UG').
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that identifies an academic level (for example, 'UG').")
    private String code;
    /**
     * Title
     * <p>
     * The full name of an academic level (for example, 'Undergraduate').
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an academic level (for example, 'Undergraduate').")
    private String title;
    /**
     * Academic Level
     * <p>
     * The academic level associated with this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The academic level associated with this section.")
    private Detail__3 detail;

    /**
     * Code
     * <p>
     * A code that identifies an academic level (for example, 'UG').
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that identifies an academic level (for example, 'UG').
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AcademicLevel withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an academic level (for example, 'Undergraduate').
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
     * The full name of an academic level (for example, 'Undergraduate').
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AcademicLevel withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail__3 getDetail() {
        return detail;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__3 detail) {
        this.detail = detail;
    }

    public AcademicLevel withDetail(Detail__3 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicLevel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof AcademicLevel) == false) {
            return false;
        }
        AcademicLevel rhs = ((AcademicLevel) other);
        return ((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
