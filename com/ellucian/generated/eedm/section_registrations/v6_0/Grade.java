
package com.ellucian.generated.eedm.section_registrations.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "grade",
    "submission"
})
@Generated("jsonschema2pojo")
public class Grade {

    /**
     * Type
     * <p>
     * The type of section grade.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of section grade.")
    private Type type;
    /**
     * Grade
     * <p>
     * The grade awarded to the student by the instructor.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grade awarded to the student by the instructor.")
    private Grade__1 grade;
    /**
     * Submission
     * <p>
     * Properties related to the submission of the section grade.
     * 
     */
    @JsonProperty("submission")
    @JsonPropertyDescription("Properties related to the submission of the section grade.")
    private Submission submission;

    /**
     * Type
     * <p>
     * The type of section grade.
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
     * The type of section grade.
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
     * Grade
     * <p>
     * The grade awarded to the student by the instructor.
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
     * The grade awarded to the student by the instructor.
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
     * Submission
     * <p>
     * Properties related to the submission of the section grade.
     * 
     */
    @JsonProperty("submission")
    public Submission getSubmission() {
        return submission;
    }

    /**
     * Submission
     * <p>
     * Properties related to the submission of the section grade.
     * 
     */
    @JsonProperty("submission")
    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public Grade withSubmission(Submission submission) {
        this.submission = submission;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Grade.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("submission");
        sb.append('=');
        sb.append(((this.submission == null)?"<null>":this.submission));
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
        result = ((result* 31)+((this.submission == null)? 0 :this.submission.hashCode()));
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
        return ((((this.submission == rhs.submission)||((this.submission!= null)&&this.submission.equals(rhs.submission)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))));
    }

}
