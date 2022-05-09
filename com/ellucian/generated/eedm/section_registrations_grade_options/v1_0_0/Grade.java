
package com.ellucian.generated.eedm.section_registrations_grade_options.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grade",
    "value",
    "incompleteGradeDetails",
    "lastDateOfAttendanceRequiredness"
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
     * Incomplete Grade Details
     * <p>
     * The incomplete grade details associated with the grade.
     * 
     */
    @JsonProperty("incompleteGradeDetails")
    @JsonPropertyDescription("The incomplete grade details associated with the grade.")
    private IncompleteGradeDetails incompleteGradeDetails;
    /**
     * Last Date Of Attendance Requiredness
     * <p>
     * An indicator whether the last date of attendance is required for the grade.
     * 
     */
    @JsonProperty("lastDateOfAttendanceRequiredness")
    @JsonPropertyDescription("An indicator whether the last date of attendance is required for the grade.")
    private Object lastDateOfAttendanceRequiredness;

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
     * Incomplete Grade Details
     * <p>
     * The incomplete grade details associated with the grade.
     * 
     */
    @JsonProperty("incompleteGradeDetails")
    public IncompleteGradeDetails getIncompleteGradeDetails() {
        return incompleteGradeDetails;
    }

    /**
     * Incomplete Grade Details
     * <p>
     * The incomplete grade details associated with the grade.
     * 
     */
    @JsonProperty("incompleteGradeDetails")
    public void setIncompleteGradeDetails(IncompleteGradeDetails incompleteGradeDetails) {
        this.incompleteGradeDetails = incompleteGradeDetails;
    }

    public Grade withIncompleteGradeDetails(IncompleteGradeDetails incompleteGradeDetails) {
        this.incompleteGradeDetails = incompleteGradeDetails;
        return this;
    }

    /**
     * Last Date Of Attendance Requiredness
     * <p>
     * An indicator whether the last date of attendance is required for the grade.
     * 
     */
    @JsonProperty("lastDateOfAttendanceRequiredness")
    public Object getLastDateOfAttendanceRequiredness() {
        return lastDateOfAttendanceRequiredness;
    }

    /**
     * Last Date Of Attendance Requiredness
     * <p>
     * An indicator whether the last date of attendance is required for the grade.
     * 
     */
    @JsonProperty("lastDateOfAttendanceRequiredness")
    public void setLastDateOfAttendanceRequiredness(Object lastDateOfAttendanceRequiredness) {
        this.lastDateOfAttendanceRequiredness = lastDateOfAttendanceRequiredness;
    }

    public Grade withLastDateOfAttendanceRequiredness(Object lastDateOfAttendanceRequiredness) {
        this.lastDateOfAttendanceRequiredness = lastDateOfAttendanceRequiredness;
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
        sb.append("incompleteGradeDetails");
        sb.append('=');
        sb.append(((this.incompleteGradeDetails == null)?"<null>":this.incompleteGradeDetails));
        sb.append(',');
        sb.append("lastDateOfAttendanceRequiredness");
        sb.append('=');
        sb.append(((this.lastDateOfAttendanceRequiredness == null)?"<null>":this.lastDateOfAttendanceRequiredness));
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
        result = ((result* 31)+((this.lastDateOfAttendanceRequiredness == null)? 0 :this.lastDateOfAttendanceRequiredness.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.incompleteGradeDetails == null)? 0 :this.incompleteGradeDetails.hashCode()));
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
        return (((((this.lastDateOfAttendanceRequiredness == rhs.lastDateOfAttendanceRequiredness)||((this.lastDateOfAttendanceRequiredness!= null)&&this.lastDateOfAttendanceRequiredness.equals(rhs.lastDateOfAttendanceRequiredness)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.incompleteGradeDetails == rhs.incompleteGradeDetails)||((this.incompleteGradeDetails!= null)&&this.incompleteGradeDetails.equals(rhs.incompleteGradeDetails))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))));
    }

}
