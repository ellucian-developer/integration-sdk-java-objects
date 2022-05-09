
package com.ellucian.generated.eedm.student_unverified_grades.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grade",
    "type",
    "submittedOn"
})
@Generated("jsonschema2pojo")
public class Grade {

    /**
     * Grade
     * <p>
     * The actual grade.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The actual grade.")
    private Grade__1 grade;
    /**
     * Type
     * <p>
     * The type of grade (e.g. midterm, final).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of grade (e.g. midterm, final).")
    private Type type;
    /**
     * Submitted On
     * <p>
     * The date the unverified grade was submitted.
     * 
     */
    @JsonProperty("submittedOn")
    @JsonPropertyDescription("The date the unverified grade was submitted.")
    private Object submittedOn;

    /**
     * Grade
     * <p>
     * The actual grade.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public Grade__1 getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The actual grade.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public void setGrade(Grade__1 grade) {
        this.grade = grade;
    }

    public Grade withGrade(Grade__1 grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of grade (e.g. midterm, final).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of grade (e.g. midterm, final).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public Grade withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Submitted On
     * <p>
     * The date the unverified grade was submitted.
     * 
     */
    @JsonProperty("submittedOn")
    public Object getSubmittedOn() {
        return submittedOn;
    }

    /**
     * Submitted On
     * <p>
     * The date the unverified grade was submitted.
     * 
     */
    @JsonProperty("submittedOn")
    public void setSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
    }

    public Grade withSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Grade.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("submittedOn");
        sb.append('=');
        sb.append(((this.submittedOn == null)?"<null>":this.submittedOn));
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
        result = ((result* 31)+((this.submittedOn == null)? 0 :this.submittedOn.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Grade) == false) {
            return false;
        }
        Grade rhs = ((Grade) other);
        return ((((this.submittedOn == rhs.submittedOn)||((this.submittedOn!= null)&&this.submittedOn.equals(rhs.submittedOn)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))));
    }

}
