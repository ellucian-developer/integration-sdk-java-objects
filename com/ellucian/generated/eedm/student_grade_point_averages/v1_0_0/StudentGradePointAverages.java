
package com.ellucian.generated.eedm.student_grade_point_averages.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Grade Point Averages
 * <p>
 * The information about grade point averages for a student.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "student",
    "periodBased",
    "cumulative",
    "earnedDegrees"
})
@Generated("jsonschema2pojo")
public class StudentGradePointAverages {

    /**
     * ID
     * <p>
     * The global identifier of the student grade point average.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student grade point average.")
    private String id;
    /**
     * Student
     * <p>
     * The student associated with the grade point averages.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student associated with the grade point averages.")
    private Student student;
    /**
     * Period Based
     * <p>
     * The period based grade point averages for the student.
     * 
     */
    @JsonProperty("periodBased")
    @JsonPropertyDescription("The period based grade point averages for the student.")
    private List<PeriodBased> periodBased = new ArrayList<PeriodBased>();
    /**
     * Cumulative
     * <p>
     * The cumulative grade point averages for the student.
     * 
     */
    @JsonProperty("cumulative")
    @JsonPropertyDescription("The cumulative grade point averages for the student.")
    private List<Cumulative> cumulative = new ArrayList<Cumulative>();
    /**
     * Earned Degrees
     * <p>
     * The grade point average of the student for earned degrees.
     * 
     */
    @JsonProperty("earnedDegrees")
    @JsonPropertyDescription("The grade point average of the student for earned degrees.")
    private List<EarnedDegree> earnedDegrees = new ArrayList<EarnedDegree>();

    /**
     * ID
     * <p>
     * The global identifier of the student grade point average.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student grade point average.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentGradePointAverages withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student associated with the grade point averages.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public Student getStudent() {
        return student;
    }

    /**
     * Student
     * <p>
     * The student associated with the grade point averages.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentGradePointAverages withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Period Based
     * <p>
     * The period based grade point averages for the student.
     * 
     */
    @JsonProperty("periodBased")
    public List<PeriodBased> getPeriodBased() {
        return periodBased;
    }

    /**
     * Period Based
     * <p>
     * The period based grade point averages for the student.
     * 
     */
    @JsonProperty("periodBased")
    public void setPeriodBased(List<PeriodBased> periodBased) {
        this.periodBased = periodBased;
    }

    public StudentGradePointAverages withPeriodBased(List<PeriodBased> periodBased) {
        this.periodBased = periodBased;
        return this;
    }

    /**
     * Cumulative
     * <p>
     * The cumulative grade point averages for the student.
     * 
     */
    @JsonProperty("cumulative")
    public List<Cumulative> getCumulative() {
        return cumulative;
    }

    /**
     * Cumulative
     * <p>
     * The cumulative grade point averages for the student.
     * 
     */
    @JsonProperty("cumulative")
    public void setCumulative(List<Cumulative> cumulative) {
        this.cumulative = cumulative;
    }

    public StudentGradePointAverages withCumulative(List<Cumulative> cumulative) {
        this.cumulative = cumulative;
        return this;
    }

    /**
     * Earned Degrees
     * <p>
     * The grade point average of the student for earned degrees.
     * 
     */
    @JsonProperty("earnedDegrees")
    public List<EarnedDegree> getEarnedDegrees() {
        return earnedDegrees;
    }

    /**
     * Earned Degrees
     * <p>
     * The grade point average of the student for earned degrees.
     * 
     */
    @JsonProperty("earnedDegrees")
    public void setEarnedDegrees(List<EarnedDegree> earnedDegrees) {
        this.earnedDegrees = earnedDegrees;
    }

    public StudentGradePointAverages withEarnedDegrees(List<EarnedDegree> earnedDegrees) {
        this.earnedDegrees = earnedDegrees;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentGradePointAverages.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("student");
        sb.append('=');
        sb.append(((this.student == null)?"<null>":this.student));
        sb.append(',');
        sb.append("periodBased");
        sb.append('=');
        sb.append(((this.periodBased == null)?"<null>":this.periodBased));
        sb.append(',');
        sb.append("cumulative");
        sb.append('=');
        sb.append(((this.cumulative == null)?"<null>":this.cumulative));
        sb.append(',');
        sb.append("earnedDegrees");
        sb.append('=');
        sb.append(((this.earnedDegrees == null)?"<null>":this.earnedDegrees));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.cumulative == null)? 0 :this.cumulative.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.periodBased == null)? 0 :this.periodBased.hashCode()));
        result = ((result* 31)+((this.earnedDegrees == null)? 0 :this.earnedDegrees.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentGradePointAverages) == false) {
            return false;
        }
        StudentGradePointAverages rhs = ((StudentGradePointAverages) other);
        return ((((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.cumulative == rhs.cumulative)||((this.cumulative!= null)&&this.cumulative.equals(rhs.cumulative))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.periodBased == rhs.periodBased)||((this.periodBased!= null)&&this.periodBased.equals(rhs.periodBased))))&&((this.earnedDegrees == rhs.earnedDegrees)||((this.earnedDegrees!= null)&&this.earnedDegrees.equals(rhs.earnedDegrees))));
    }

}
