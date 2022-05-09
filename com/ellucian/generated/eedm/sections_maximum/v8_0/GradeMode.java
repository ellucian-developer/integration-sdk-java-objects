
package com.ellucian.generated.eedm.sections_maximum.v8_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Grade Mode
 * <p>
 * The grade mode associated with the grade scheme.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "title",
    "detail"
})
@Generated("jsonschema2pojo")
public class GradeMode {

    /**
     * Code
     * <p>
     * The code associated with the grade mode.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code associated with the grade mode.")
    private String code;
    /**
     * Title
     * <p>
     * The full name of the grade modes.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the grade modes.")
    private String title;
    /**
     * Detail
     * <p>
     * The grade mode associated with the grade scheme.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The grade mode associated with the grade scheme.")
    private Detail__5 detail;

    /**
     * Code
     * <p>
     * The code associated with the grade mode.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code associated with the grade mode.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public GradeMode withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the grade modes.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the grade modes.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GradeMode withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Detail
     * <p>
     * The grade mode associated with the grade scheme.
     * 
     */
    @JsonProperty("detail")
    public Detail__5 getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The grade mode associated with the grade scheme.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__5 detail) {
        this.detail = detail;
    }

    public GradeMode withDetail(Detail__5 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeMode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof GradeMode) == false) {
            return false;
        }
        GradeMode rhs = ((GradeMode) other);
        return ((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
