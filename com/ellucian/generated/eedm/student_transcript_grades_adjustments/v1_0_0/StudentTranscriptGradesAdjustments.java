
package com.ellucian.generated.eedm.student_transcript_grades_adjustments.v1_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Transcript Grades Adjustments
 * <p>
 * The grade adjustments submitted for the student transcript.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "detail"
})
@Generated("jsonschema2pojo")
public class StudentTranscriptGradesAdjustments {

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
     * Detail
     * <p>
     * The details of the adjustments to the student transcript.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The details of the adjustments to the student transcript.")
    private Detail detail;

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

    public StudentTranscriptGradesAdjustments withMetadata(Metadata metadata) {
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

    public StudentTranscriptGradesAdjustments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Detail
     * <p>
     * The details of the adjustments to the student transcript.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The details of the adjustments to the student transcript.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public StudentTranscriptGradesAdjustments withDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentTranscriptGradesAdjustments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentTranscriptGradesAdjustments) == false) {
            return false;
        }
        StudentTranscriptGradesAdjustments rhs = ((StudentTranscriptGradesAdjustments) other);
        return ((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }

}
