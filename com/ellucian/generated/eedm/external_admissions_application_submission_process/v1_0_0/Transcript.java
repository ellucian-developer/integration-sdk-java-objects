
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Transcript
 * <p>
 * Applicant's high school transcript details.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "highestGradeCompleted",
    "highestEnglishCourseTaken",
    "highestEnglishGrade",
    "highestMathCoursePassed",
    "highestMathCourseTaken",
    "highestMathCoursePassedGrade",
    "highestMathGrade"
})
@Generated("jsonschema2pojo")
public class Transcript {

    /**
     * Highest Grade Completed
     * <p>
     * Applicant’s highest high school grade completed.
     * 
     */
    @JsonProperty("highestGradeCompleted")
    @JsonPropertyDescription("Applicant\u2019s highest high school grade completed.")
    private String highestGradeCompleted;
    /**
     * Highest English Course Taken
     * <p>
     * Applicant’s highest English course taken in high school.
     * 
     */
    @JsonProperty("highestEnglishCourseTaken")
    @JsonPropertyDescription("Applicant\u2019s highest English course taken in high school.")
    private Integer highestEnglishCourseTaken;
    /**
     * Highest English Course Taken Grade
     * <p>
     * Applicant’s grade received in the highest English course taken in high school.
     * 
     */
    @JsonProperty("highestEnglishGrade")
    @JsonPropertyDescription("Applicant\u2019s grade received in the highest English course taken in high school.")
    private String highestEnglishGrade;
    /**
     * Highest Math Course Passed
     * <p>
     * Applicant’s highest math course passed with a Pass in high school.
     * 
     */
    @JsonProperty("highestMathCoursePassed")
    @JsonPropertyDescription("Applicant\u2019s highest math course passed with a Pass in high school.")
    private Integer highestMathCoursePassed;
    /**
     * Highest Math Course Taken
     * <p>
     * Applicant’s highest math course taken in high school.
     * 
     */
    @JsonProperty("highestMathCourseTaken")
    @JsonPropertyDescription("Applicant\u2019s highest math course taken in high school.")
    private Integer highestMathCourseTaken;
    /**
     * Highest Math Course Passed Grade
     * <p>
     * Applicant’s grade received for highest math course passed in high school with a Pass.
     * 
     */
    @JsonProperty("highestMathCoursePassedGrade")
    @JsonPropertyDescription("Applicant\u2019s grade received for highest math course passed in high school with a Pass.")
    private String highestMathCoursePassedGrade;
    /**
     * Highest Math Course Taken Grade
     * <p>
     * Applicant’s grade received for highest math course taken in high school.
     * 
     */
    @JsonProperty("highestMathGrade")
    @JsonPropertyDescription("Applicant\u2019s grade received for highest math course taken in high school.")
    private String highestMathGrade;

    /**
     * Highest Grade Completed
     * <p>
     * Applicant’s highest high school grade completed.
     * 
     */
    @JsonProperty("highestGradeCompleted")
    public String getHighestGradeCompleted() {
        return highestGradeCompleted;
    }

    /**
     * Highest Grade Completed
     * <p>
     * Applicant’s highest high school grade completed.
     * 
     */
    @JsonProperty("highestGradeCompleted")
    public void setHighestGradeCompleted(String highestGradeCompleted) {
        this.highestGradeCompleted = highestGradeCompleted;
    }

    public Transcript withHighestGradeCompleted(String highestGradeCompleted) {
        this.highestGradeCompleted = highestGradeCompleted;
        return this;
    }

    /**
     * Highest English Course Taken
     * <p>
     * Applicant’s highest English course taken in high school.
     * 
     */
    @JsonProperty("highestEnglishCourseTaken")
    public Integer getHighestEnglishCourseTaken() {
        return highestEnglishCourseTaken;
    }

    /**
     * Highest English Course Taken
     * <p>
     * Applicant’s highest English course taken in high school.
     * 
     */
    @JsonProperty("highestEnglishCourseTaken")
    public void setHighestEnglishCourseTaken(Integer highestEnglishCourseTaken) {
        this.highestEnglishCourseTaken = highestEnglishCourseTaken;
    }

    public Transcript withHighestEnglishCourseTaken(Integer highestEnglishCourseTaken) {
        this.highestEnglishCourseTaken = highestEnglishCourseTaken;
        return this;
    }

    /**
     * Highest English Course Taken Grade
     * <p>
     * Applicant’s grade received in the highest English course taken in high school.
     * 
     */
    @JsonProperty("highestEnglishGrade")
    public String getHighestEnglishGrade() {
        return highestEnglishGrade;
    }

    /**
     * Highest English Course Taken Grade
     * <p>
     * Applicant’s grade received in the highest English course taken in high school.
     * 
     */
    @JsonProperty("highestEnglishGrade")
    public void setHighestEnglishGrade(String highestEnglishGrade) {
        this.highestEnglishGrade = highestEnglishGrade;
    }

    public Transcript withHighestEnglishGrade(String highestEnglishGrade) {
        this.highestEnglishGrade = highestEnglishGrade;
        return this;
    }

    /**
     * Highest Math Course Passed
     * <p>
     * Applicant’s highest math course passed with a Pass in high school.
     * 
     */
    @JsonProperty("highestMathCoursePassed")
    public Integer getHighestMathCoursePassed() {
        return highestMathCoursePassed;
    }

    /**
     * Highest Math Course Passed
     * <p>
     * Applicant’s highest math course passed with a Pass in high school.
     * 
     */
    @JsonProperty("highestMathCoursePassed")
    public void setHighestMathCoursePassed(Integer highestMathCoursePassed) {
        this.highestMathCoursePassed = highestMathCoursePassed;
    }

    public Transcript withHighestMathCoursePassed(Integer highestMathCoursePassed) {
        this.highestMathCoursePassed = highestMathCoursePassed;
        return this;
    }

    /**
     * Highest Math Course Taken
     * <p>
     * Applicant’s highest math course taken in high school.
     * 
     */
    @JsonProperty("highestMathCourseTaken")
    public Integer getHighestMathCourseTaken() {
        return highestMathCourseTaken;
    }

    /**
     * Highest Math Course Taken
     * <p>
     * Applicant’s highest math course taken in high school.
     * 
     */
    @JsonProperty("highestMathCourseTaken")
    public void setHighestMathCourseTaken(Integer highestMathCourseTaken) {
        this.highestMathCourseTaken = highestMathCourseTaken;
    }

    public Transcript withHighestMathCourseTaken(Integer highestMathCourseTaken) {
        this.highestMathCourseTaken = highestMathCourseTaken;
        return this;
    }

    /**
     * Highest Math Course Passed Grade
     * <p>
     * Applicant’s grade received for highest math course passed in high school with a Pass.
     * 
     */
    @JsonProperty("highestMathCoursePassedGrade")
    public String getHighestMathCoursePassedGrade() {
        return highestMathCoursePassedGrade;
    }

    /**
     * Highest Math Course Passed Grade
     * <p>
     * Applicant’s grade received for highest math course passed in high school with a Pass.
     * 
     */
    @JsonProperty("highestMathCoursePassedGrade")
    public void setHighestMathCoursePassedGrade(String highestMathCoursePassedGrade) {
        this.highestMathCoursePassedGrade = highestMathCoursePassedGrade;
    }

    public Transcript withHighestMathCoursePassedGrade(String highestMathCoursePassedGrade) {
        this.highestMathCoursePassedGrade = highestMathCoursePassedGrade;
        return this;
    }

    /**
     * Highest Math Course Taken Grade
     * <p>
     * Applicant’s grade received for highest math course taken in high school.
     * 
     */
    @JsonProperty("highestMathGrade")
    public String getHighestMathGrade() {
        return highestMathGrade;
    }

    /**
     * Highest Math Course Taken Grade
     * <p>
     * Applicant’s grade received for highest math course taken in high school.
     * 
     */
    @JsonProperty("highestMathGrade")
    public void setHighestMathGrade(String highestMathGrade) {
        this.highestMathGrade = highestMathGrade;
    }

    public Transcript withHighestMathGrade(String highestMathGrade) {
        this.highestMathGrade = highestMathGrade;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Transcript.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("highestGradeCompleted");
        sb.append('=');
        sb.append(((this.highestGradeCompleted == null)?"<null>":this.highestGradeCompleted));
        sb.append(',');
        sb.append("highestEnglishCourseTaken");
        sb.append('=');
        sb.append(((this.highestEnglishCourseTaken == null)?"<null>":this.highestEnglishCourseTaken));
        sb.append(',');
        sb.append("highestEnglishGrade");
        sb.append('=');
        sb.append(((this.highestEnglishGrade == null)?"<null>":this.highestEnglishGrade));
        sb.append(',');
        sb.append("highestMathCoursePassed");
        sb.append('=');
        sb.append(((this.highestMathCoursePassed == null)?"<null>":this.highestMathCoursePassed));
        sb.append(',');
        sb.append("highestMathCourseTaken");
        sb.append('=');
        sb.append(((this.highestMathCourseTaken == null)?"<null>":this.highestMathCourseTaken));
        sb.append(',');
        sb.append("highestMathCoursePassedGrade");
        sb.append('=');
        sb.append(((this.highestMathCoursePassedGrade == null)?"<null>":this.highestMathCoursePassedGrade));
        sb.append(',');
        sb.append("highestMathGrade");
        sb.append('=');
        sb.append(((this.highestMathGrade == null)?"<null>":this.highestMathGrade));
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
        result = ((result* 31)+((this.highestMathCourseTaken == null)? 0 :this.highestMathCourseTaken.hashCode()));
        result = ((result* 31)+((this.highestGradeCompleted == null)? 0 :this.highestGradeCompleted.hashCode()));
        result = ((result* 31)+((this.highestEnglishGrade == null)? 0 :this.highestEnglishGrade.hashCode()));
        result = ((result* 31)+((this.highestMathCoursePassed == null)? 0 :this.highestMathCoursePassed.hashCode()));
        result = ((result* 31)+((this.highestMathGrade == null)? 0 :this.highestMathGrade.hashCode()));
        result = ((result* 31)+((this.highestEnglishCourseTaken == null)? 0 :this.highestEnglishCourseTaken.hashCode()));
        result = ((result* 31)+((this.highestMathCoursePassedGrade == null)? 0 :this.highestMathCoursePassedGrade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transcript) == false) {
            return false;
        }
        Transcript rhs = ((Transcript) other);
        return ((((((((this.highestMathCourseTaken == rhs.highestMathCourseTaken)||((this.highestMathCourseTaken!= null)&&this.highestMathCourseTaken.equals(rhs.highestMathCourseTaken)))&&((this.highestGradeCompleted == rhs.highestGradeCompleted)||((this.highestGradeCompleted!= null)&&this.highestGradeCompleted.equals(rhs.highestGradeCompleted))))&&((this.highestEnglishGrade == rhs.highestEnglishGrade)||((this.highestEnglishGrade!= null)&&this.highestEnglishGrade.equals(rhs.highestEnglishGrade))))&&((this.highestMathCoursePassed == rhs.highestMathCoursePassed)||((this.highestMathCoursePassed!= null)&&this.highestMathCoursePassed.equals(rhs.highestMathCoursePassed))))&&((this.highestMathGrade == rhs.highestMathGrade)||((this.highestMathGrade!= null)&&this.highestMathGrade.equals(rhs.highestMathGrade))))&&((this.highestEnglishCourseTaken == rhs.highestEnglishCourseTaken)||((this.highestEnglishCourseTaken!= null)&&this.highestEnglishCourseTaken.equals(rhs.highestEnglishCourseTaken))))&&((this.highestMathCoursePassedGrade == rhs.highestMathCoursePassedGrade)||((this.highestMathCoursePassedGrade!= null)&&this.highestMathCoursePassedGrade.equals(rhs.highestMathCoursePassedGrade))));
    }

}
