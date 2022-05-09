
package com.ellucian.generated.eedm.section_registrations.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Process
 * <p>
 * Properties associated with the processing of section grades.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gradeExtension",
    "transcript"
})
@Generated("jsonschema2pojo")
public class Process {

    /**
     * Grade Extension
     * <p>
     * Default grade and expiration date for incomplete grades.
     * 
     */
    @JsonProperty("gradeExtension")
    @JsonPropertyDescription("Default grade and expiration date for incomplete grades.")
    private Object gradeExtension;
    /**
     * Transcript
     * <p>
     * Properties dealing with the transcript processing of the grade.
     * 
     */
    @JsonProperty("transcript")
    @JsonPropertyDescription("Properties dealing with the transcript processing of the grade.")
    private Object transcript;

    /**
     * Grade Extension
     * <p>
     * Default grade and expiration date for incomplete grades.
     * 
     */
    @JsonProperty("gradeExtension")
    public Object getGradeExtension() {
        return gradeExtension;
    }

    /**
     * Grade Extension
     * <p>
     * Default grade and expiration date for incomplete grades.
     * 
     */
    @JsonProperty("gradeExtension")
    public void setGradeExtension(Object gradeExtension) {
        this.gradeExtension = gradeExtension;
    }

    public Process withGradeExtension(Object gradeExtension) {
        this.gradeExtension = gradeExtension;
        return this;
    }

    /**
     * Transcript
     * <p>
     * Properties dealing with the transcript processing of the grade.
     * 
     */
    @JsonProperty("transcript")
    public Object getTranscript() {
        return transcript;
    }

    /**
     * Transcript
     * <p>
     * Properties dealing with the transcript processing of the grade.
     * 
     */
    @JsonProperty("transcript")
    public void setTranscript(Object transcript) {
        this.transcript = transcript;
    }

    public Process withTranscript(Object transcript) {
        this.transcript = transcript;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Process.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gradeExtension");
        sb.append('=');
        sb.append(((this.gradeExtension == null)?"<null>":this.gradeExtension));
        sb.append(',');
        sb.append("transcript");
        sb.append('=');
        sb.append(((this.transcript == null)?"<null>":this.transcript));
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
        result = ((result* 31)+((this.gradeExtension == null)? 0 :this.gradeExtension.hashCode()));
        result = ((result* 31)+((this.transcript == null)? 0 :this.transcript.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Process) == false) {
            return false;
        }
        Process rhs = ((Process) other);
        return (((this.gradeExtension == rhs.gradeExtension)||((this.gradeExtension!= null)&&this.gradeExtension.equals(rhs.gradeExtension)))&&((this.transcript == rhs.transcript)||((this.transcript!= null)&&this.transcript.equals(rhs.transcript))));
    }

}
