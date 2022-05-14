
package com.ellucian.generated.eedm.student_transcript_grades_options.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Transcript Grades Options
 * <p>
 * The options associated with the student transcript grade.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "gradeScheme",
    "grades"
})
@Generated("jsonschema2pojo")
public class StudentTranscriptGradesOptions {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the student transcript grade.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student transcript grade.")
    private String id;
    /**
     * Grade Scheme
     * <p>
     * The grading scheme used to award the student their grade.
     * 
     */
    @JsonProperty("gradeScheme")
    @JsonPropertyDescription("The grading scheme used to award the student their grade.")
    private Object gradeScheme;
    /**
     * Grades
     * <p>
     * The grading options associated with the student transcript grade.
     * 
     */
    @JsonProperty("grades")
    @JsonPropertyDescription("The grading options associated with the student transcript grade.")
    private List<Grade> grades = new ArrayList<Grade>();

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public StudentTranscriptGradesOptions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student transcript grade.
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
     * The global identifier of the student transcript grade.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentTranscriptGradesOptions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Grade Scheme
     * <p>
     * The grading scheme used to award the student their grade.
     * 
     */
    @JsonProperty("gradeScheme")
    public Object getGradeScheme() {
        return gradeScheme;
    }

    /**
     * Grade Scheme
     * <p>
     * The grading scheme used to award the student their grade.
     * 
     */
    @JsonProperty("gradeScheme")
    public void setGradeScheme(Object gradeScheme) {
        this.gradeScheme = gradeScheme;
    }

    public StudentTranscriptGradesOptions withGradeScheme(Object gradeScheme) {
        this.gradeScheme = gradeScheme;
        return this;
    }

    /**
     * Grades
     * <p>
     * The grading options associated with the student transcript grade.
     * 
     */
    @JsonProperty("grades")
    public List<Grade> getGrades() {
        return grades;
    }

    /**
     * Grades
     * <p>
     * The grading options associated with the student transcript grade.
     * 
     */
    @JsonProperty("grades")
    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public StudentTranscriptGradesOptions withGrades(List<Grade> grades) {
        this.grades = grades;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentTranscriptGradesOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("gradeScheme");
        sb.append('=');
        sb.append(((this.gradeScheme == null)?"<null>":this.gradeScheme));
        sb.append(',');
        sb.append("grades");
        sb.append('=');
        sb.append(((this.grades == null)?"<null>":this.grades));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.gradeScheme == null)? 0 :this.gradeScheme.hashCode()));
        result = ((result* 31)+((this.grades == null)? 0 :this.grades.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentTranscriptGradesOptions) == false) {
            return false;
        }
        StudentTranscriptGradesOptions rhs = ((StudentTranscriptGradesOptions) other);
        return (((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.gradeScheme == rhs.gradeScheme)||((this.gradeScheme!= null)&&this.gradeScheme.equals(rhs.gradeScheme))))&&((this.grades == rhs.grades)||((this.grades!= null)&&this.grades.equals(rhs.grades))));
    }

}
