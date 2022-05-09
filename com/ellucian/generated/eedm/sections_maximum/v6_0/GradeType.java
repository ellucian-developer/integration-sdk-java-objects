
package com.ellucian.generated.eedm.sections_maximum.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "details"
})
@Generated("jsonschema2pojo")
public class GradeType {

    /**
     * Title
     * <p>
     * The full name of grade type
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of grade type")
    private String title;
    /**
     * Grade Type
     * <p>
     * The grade type that is used in this section
     * (Required)
     * 
     */
    @JsonProperty("details")
    @JsonPropertyDescription("The grade type that is used in this section")
    private Details details;

    /**
     * Title
     * <p>
     * The full name of grade type
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
     * The full name of grade type
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GradeType withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Grade Type
     * <p>
     * The grade type that is used in this section
     * (Required)
     * 
     */
    @JsonProperty("details")
    public Details getDetails() {
        return details;
    }

    /**
     * Grade Type
     * <p>
     * The grade type that is used in this section
     * (Required)
     * 
     */
    @JsonProperty("details")
    public void setDetails(Details details) {
        this.details = details;
    }

    public GradeType withDetails(Details details) {
        this.details = details;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("details");
        sb.append('=');
        sb.append(((this.details == null)?"<null>":this.details));
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
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.details == null)? 0 :this.details.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeType) == false) {
            return false;
        }
        GradeType rhs = ((GradeType) other);
        return (((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title)))&&((this.details == rhs.details)||((this.details!= null)&&this.details.equals(rhs.details))));
    }

}
