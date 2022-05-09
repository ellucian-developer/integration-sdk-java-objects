
package com.ellucian.generated.eedm.student_transcript_grades_options.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grade",
    "value",
    "incompleteGrade"
})
@Generated("jsonschema2pojo")
public class Grade {

    /**
     * Grade
     * <p>
     * The grade that may be awarded to the student by the instructor.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grade that may be awarded to the student by the instructor.")
    private Grade__1 grade;
    /**
     * Value
     * <p>
     * The grade value.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The grade value.")
    private String value;
    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    @JsonPropertyDescription("The default incomplete final grade and the extension date associated with the student's grade.")
    private IncompleteGrade incompleteGrade;

    /**
     * Grade
     * <p>
     * The grade that may be awarded to the student by the instructor.
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
     * The grade that may be awarded to the student by the instructor.
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
     * Value
     * <p>
     * The grade value.
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The grade value.
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Grade withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    public IncompleteGrade getIncompleteGrade() {
        return incompleteGrade;
    }

    /**
     * Incomplete Grade
     * <p>
     * The default incomplete final grade and the extension date associated with the student's grade.
     * 
     */
    @JsonProperty("incompleteGrade")
    public void setIncompleteGrade(IncompleteGrade incompleteGrade) {
        this.incompleteGrade = incompleteGrade;
    }

    public Grade withIncompleteGrade(IncompleteGrade incompleteGrade) {
        this.incompleteGrade = incompleteGrade;
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
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("incompleteGrade");
        sb.append('=');
        sb.append(((this.incompleteGrade == null)?"<null>":this.incompleteGrade));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.incompleteGrade == null)? 0 :this.incompleteGrade.hashCode()));
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
        return ((((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value)))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.incompleteGrade == rhs.incompleteGrade)||((this.incompleteGrade!= null)&&this.incompleteGrade.equals(rhs.incompleteGrade))));
    }

}
