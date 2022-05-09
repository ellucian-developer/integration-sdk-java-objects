
package com.ellucian.generated.eedm.student_unverified_grades.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Details
 * <p>
 * The grade and/or last attendance details.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grades",
    "lastAttendance"
})
@Generated("jsonschema2pojo")
public class Details {

    /**
     * Grades
     * <p>
     * The grade details.
     * 
     */
    @JsonProperty("grades")
    @JsonPropertyDescription("The grade details.")
    private List<Grade> grades = new ArrayList<Grade>();
    /**
     * Last Attendance
     * <p>
     * The details regarding the student's last known attendance.
     * 
     */
    @JsonProperty("lastAttendance")
    @JsonPropertyDescription("The details regarding the student's last known attendance.")
    private Object lastAttendance;

    /**
     * Grades
     * <p>
     * The grade details.
     * 
     */
    @JsonProperty("grades")
    public List<Grade> getGrades() {
        return grades;
    }

    /**
     * Grades
     * <p>
     * The grade details.
     * 
     */
    @JsonProperty("grades")
    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public Details withGrades(List<Grade> grades) {
        this.grades = grades;
        return this;
    }

    /**
     * Last Attendance
     * <p>
     * The details regarding the student's last known attendance.
     * 
     */
    @JsonProperty("lastAttendance")
    public Object getLastAttendance() {
        return lastAttendance;
    }

    /**
     * Last Attendance
     * <p>
     * The details regarding the student's last known attendance.
     * 
     */
    @JsonProperty("lastAttendance")
    public void setLastAttendance(Object lastAttendance) {
        this.lastAttendance = lastAttendance;
    }

    public Details withLastAttendance(Object lastAttendance) {
        this.lastAttendance = lastAttendance;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Details.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grades");
        sb.append('=');
        sb.append(((this.grades == null)?"<null>":this.grades));
        sb.append(',');
        sb.append("lastAttendance");
        sb.append('=');
        sb.append(((this.lastAttendance == null)?"<null>":this.lastAttendance));
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
        result = ((result* 31)+((this.lastAttendance == null)? 0 :this.lastAttendance.hashCode()));
        result = ((result* 31)+((this.grades == null)? 0 :this.grades.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Details) == false) {
            return false;
        }
        Details rhs = ((Details) other);
        return (((this.lastAttendance == rhs.lastAttendance)||((this.lastAttendance!= null)&&this.lastAttendance.equals(rhs.lastAttendance)))&&((this.grades == rhs.grades)||((this.grades!= null)&&this.grades.equals(rhs.grades))));
    }

}
