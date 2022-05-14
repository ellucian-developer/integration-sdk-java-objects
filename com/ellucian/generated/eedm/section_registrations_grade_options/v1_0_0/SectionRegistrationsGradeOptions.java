
package com.ellucian.generated.eedm.section_registrations_grade_options.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Section Registrations Grade Options
 * <p>
 * The grading options for the section registration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "section",
    "sectionGradability",
    "studentGradeScheme",
    "gradeStatus",
    "grades"
})
@Generated("jsonschema2pojo")
public class SectionRegistrationsGradeOptions {

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
     * The global identifier of the section registration.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the section registration.")
    private String id;
    /**
     * Section
     * <p>
     * An instance of a course for which a person has registered.
     * (Required)
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("An instance of a course for which a person has registered.")
    private Section section;
    /**
     * Section Gradability
     * <p>
     * An indicator whether the section is gradable.
     * 
     */
    @JsonProperty("sectionGradability")
    @JsonPropertyDescription("An indicator whether the section is gradable.")
    private Object sectionGradability;
    /**
     * Student Grade Scheme
     * <p>
     * The grading scheme used to award the student their grade for the section.
     * 
     */
    @JsonProperty("studentGradeScheme")
    @JsonPropertyDescription("The grading scheme used to award the student their grade for the section.")
    private Object studentGradeScheme;
    /**
     * Grade Status
     * <p>
     * An indicator whether the student has a verified grade or the section registration.
     * 
     */
    @JsonProperty("gradeStatus")
    @JsonPropertyDescription("An indicator whether the student has a verified grade or the section registration.")
    private Object gradeStatus;
    /**
     * Grades
     * <p>
     * The grade options associated with the section registration.
     * 
     */
    @JsonProperty("grades")
    @JsonPropertyDescription("The grade options associated with the section registration.")
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

    public SectionRegistrationsGradeOptions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the section registration.
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
     * The global identifier of the section registration.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SectionRegistrationsGradeOptions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Section
     * <p>
     * An instance of a course for which a person has registered.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public Section getSection() {
        return section;
    }

    /**
     * Section
     * <p>
     * An instance of a course for which a person has registered.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public void setSection(Section section) {
        this.section = section;
    }

    public SectionRegistrationsGradeOptions withSection(Section section) {
        this.section = section;
        return this;
    }

    /**
     * Section Gradability
     * <p>
     * An indicator whether the section is gradable.
     * 
     */
    @JsonProperty("sectionGradability")
    public Object getSectionGradability() {
        return sectionGradability;
    }

    /**
     * Section Gradability
     * <p>
     * An indicator whether the section is gradable.
     * 
     */
    @JsonProperty("sectionGradability")
    public void setSectionGradability(Object sectionGradability) {
        this.sectionGradability = sectionGradability;
    }

    public SectionRegistrationsGradeOptions withSectionGradability(Object sectionGradability) {
        this.sectionGradability = sectionGradability;
        return this;
    }

    /**
     * Student Grade Scheme
     * <p>
     * The grading scheme used to award the student their grade for the section.
     * 
     */
    @JsonProperty("studentGradeScheme")
    public Object getStudentGradeScheme() {
        return studentGradeScheme;
    }

    /**
     * Student Grade Scheme
     * <p>
     * The grading scheme used to award the student their grade for the section.
     * 
     */
    @JsonProperty("studentGradeScheme")
    public void setStudentGradeScheme(Object studentGradeScheme) {
        this.studentGradeScheme = studentGradeScheme;
    }

    public SectionRegistrationsGradeOptions withStudentGradeScheme(Object studentGradeScheme) {
        this.studentGradeScheme = studentGradeScheme;
        return this;
    }

    /**
     * Grade Status
     * <p>
     * An indicator whether the student has a verified grade or the section registration.
     * 
     */
    @JsonProperty("gradeStatus")
    public Object getGradeStatus() {
        return gradeStatus;
    }

    /**
     * Grade Status
     * <p>
     * An indicator whether the student has a verified grade or the section registration.
     * 
     */
    @JsonProperty("gradeStatus")
    public void setGradeStatus(Object gradeStatus) {
        this.gradeStatus = gradeStatus;
    }

    public SectionRegistrationsGradeOptions withGradeStatus(Object gradeStatus) {
        this.gradeStatus = gradeStatus;
        return this;
    }

    /**
     * Grades
     * <p>
     * The grade options associated with the section registration.
     * 
     */
    @JsonProperty("grades")
    public List<Grade> getGrades() {
        return grades;
    }

    /**
     * Grades
     * <p>
     * The grade options associated with the section registration.
     * 
     */
    @JsonProperty("grades")
    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public SectionRegistrationsGradeOptions withGrades(List<Grade> grades) {
        this.grades = grades;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRegistrationsGradeOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
        sb.append(',');
        sb.append("sectionGradability");
        sb.append('=');
        sb.append(((this.sectionGradability == null)?"<null>":this.sectionGradability));
        sb.append(',');
        sb.append("studentGradeScheme");
        sb.append('=');
        sb.append(((this.studentGradeScheme == null)?"<null>":this.studentGradeScheme));
        sb.append(',');
        sb.append("gradeStatus");
        sb.append('=');
        sb.append(((this.gradeStatus == null)?"<null>":this.gradeStatus));
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
        result = ((result* 31)+((this.sectionGradability == null)? 0 :this.sectionGradability.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.gradeStatus == null)? 0 :this.gradeStatus.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.grades == null)? 0 :this.grades.hashCode()));
        result = ((result* 31)+((this.studentGradeScheme == null)? 0 :this.studentGradeScheme.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRegistrationsGradeOptions) == false) {
            return false;
        }
        SectionRegistrationsGradeOptions rhs = ((SectionRegistrationsGradeOptions) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.sectionGradability == rhs.sectionGradability)||((this.sectionGradability!= null)&&this.sectionGradability.equals(rhs.sectionGradability))))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.gradeStatus == rhs.gradeStatus)||((this.gradeStatus!= null)&&this.gradeStatus.equals(rhs.gradeStatus))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.grades == rhs.grades)||((this.grades!= null)&&this.grades.equals(rhs.grades))))&&((this.studentGradeScheme == rhs.studentGradeScheme)||((this.studentGradeScheme!= null)&&this.studentGradeScheme.equals(rhs.studentGradeScheme))));
    }

}
