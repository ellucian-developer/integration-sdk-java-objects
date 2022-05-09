
package com.ellucian.generated.eedm.sections.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instructionalMethod",
    "contactHours",
    "labHours",
    "lectureHours"
})
@Generated("jsonschema2pojo")
public class InstructionalMethodDetail {

    /**
     * Instructional Method
     * <p>
     * The method, style, or format in which the section of a course is taught (for example, 'Lecture', 'Lab').
     * 
     */
    @JsonProperty("instructionalMethod")
    @JsonPropertyDescription("The method, style, or format in which the section of a course is taught (for example, 'Lecture', 'Lab').")
    private Object instructionalMethod;
    /**
     * Contact Hours
     * <p>
     * The contact hours that may be assigned to the section.
     * 
     */
    @JsonProperty("contactHours")
    @JsonPropertyDescription("The contact hours that may be assigned to the section.")
    private Object contactHours;
    /**
     * Lab Hours
     * <p>
     * The lab hours that may be assigned to the section.
     * 
     */
    @JsonProperty("labHours")
    @JsonPropertyDescription("The lab hours that may be assigned to the section.")
    private Object labHours;
    /**
     * Lecture Hours
     * <p>
     * The lecture hours that may be assigned to the section.
     * 
     */
    @JsonProperty("lectureHours")
    @JsonPropertyDescription("The lecture hours that may be assigned to the section.")
    private Object lectureHours;

    /**
     * Instructional Method
     * <p>
     * The method, style, or format in which the section of a course is taught (for example, 'Lecture', 'Lab').
     * 
     */
    @JsonProperty("instructionalMethod")
    public Object getInstructionalMethod() {
        return instructionalMethod;
    }

    /**
     * Instructional Method
     * <p>
     * The method, style, or format in which the section of a course is taught (for example, 'Lecture', 'Lab').
     * 
     */
    @JsonProperty("instructionalMethod")
    public void setInstructionalMethod(Object instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
    }

    public InstructionalMethodDetail withInstructionalMethod(Object instructionalMethod) {
        this.instructionalMethod = instructionalMethod;
        return this;
    }

    /**
     * Contact Hours
     * <p>
     * The contact hours that may be assigned to the section.
     * 
     */
    @JsonProperty("contactHours")
    public Object getContactHours() {
        return contactHours;
    }

    /**
     * Contact Hours
     * <p>
     * The contact hours that may be assigned to the section.
     * 
     */
    @JsonProperty("contactHours")
    public void setContactHours(Object contactHours) {
        this.contactHours = contactHours;
    }

    public InstructionalMethodDetail withContactHours(Object contactHours) {
        this.contactHours = contactHours;
        return this;
    }

    /**
     * Lab Hours
     * <p>
     * The lab hours that may be assigned to the section.
     * 
     */
    @JsonProperty("labHours")
    public Object getLabHours() {
        return labHours;
    }

    /**
     * Lab Hours
     * <p>
     * The lab hours that may be assigned to the section.
     * 
     */
    @JsonProperty("labHours")
    public void setLabHours(Object labHours) {
        this.labHours = labHours;
    }

    public InstructionalMethodDetail withLabHours(Object labHours) {
        this.labHours = labHours;
        return this;
    }

    /**
     * Lecture Hours
     * <p>
     * The lecture hours that may be assigned to the section.
     * 
     */
    @JsonProperty("lectureHours")
    public Object getLectureHours() {
        return lectureHours;
    }

    /**
     * Lecture Hours
     * <p>
     * The lecture hours that may be assigned to the section.
     * 
     */
    @JsonProperty("lectureHours")
    public void setLectureHours(Object lectureHours) {
        this.lectureHours = lectureHours;
    }

    public InstructionalMethodDetail withLectureHours(Object lectureHours) {
        this.lectureHours = lectureHours;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstructionalMethodDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instructionalMethod");
        sb.append('=');
        sb.append(((this.instructionalMethod == null)?"<null>":this.instructionalMethod));
        sb.append(',');
        sb.append("contactHours");
        sb.append('=');
        sb.append(((this.contactHours == null)?"<null>":this.contactHours));
        sb.append(',');
        sb.append("labHours");
        sb.append('=');
        sb.append(((this.labHours == null)?"<null>":this.labHours));
        sb.append(',');
        sb.append("lectureHours");
        sb.append('=');
        sb.append(((this.lectureHours == null)?"<null>":this.lectureHours));
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
        result = ((result* 31)+((this.lectureHours == null)? 0 :this.lectureHours.hashCode()));
        result = ((result* 31)+((this.instructionalMethod == null)? 0 :this.instructionalMethod.hashCode()));
        result = ((result* 31)+((this.contactHours == null)? 0 :this.contactHours.hashCode()));
        result = ((result* 31)+((this.labHours == null)? 0 :this.labHours.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstructionalMethodDetail) == false) {
            return false;
        }
        InstructionalMethodDetail rhs = ((InstructionalMethodDetail) other);
        return (((((this.lectureHours == rhs.lectureHours)||((this.lectureHours!= null)&&this.lectureHours.equals(rhs.lectureHours)))&&((this.instructionalMethod == rhs.instructionalMethod)||((this.instructionalMethod!= null)&&this.instructionalMethod.equals(rhs.instructionalMethod))))&&((this.contactHours == rhs.contactHours)||((this.contactHours!= null)&&this.contactHours.equals(rhs.contactHours))))&&((this.labHours == rhs.labHours)||((this.labHours!= null)&&this.labHours.equals(rhs.labHours))));
    }

}
