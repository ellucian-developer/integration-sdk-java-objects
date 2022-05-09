
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * High School Information
 * <p>
 * Applicant's high school realted information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "highSchool",
    "transcript",
    "educationLevel"
})
@Generated("jsonschema2pojo")
public class HighSchoolInformation {

    /**
     * High School
     * <p>
     * High schools attended by the applicant.
     * 
     */
    @JsonProperty("highSchool")
    @JsonPropertyDescription("High schools attended by the applicant.")
    private List<HighSchool> highSchool = new ArrayList<HighSchool>();
    /**
     * Transcript
     * <p>
     * Applicant's high school transcript details.
     * 
     */
    @JsonProperty("transcript")
    @JsonPropertyDescription("Applicant's high school transcript details.")
    private Transcript transcript;
    /**
     * Education Level
     * <p>
     * Applicant's higher and highest education level related information.
     * 
     */
    @JsonProperty("educationLevel")
    @JsonPropertyDescription("Applicant's higher and highest education level related information.")
    private EducationLevel educationLevel;

    /**
     * High School
     * <p>
     * High schools attended by the applicant.
     * 
     */
    @JsonProperty("highSchool")
    public List<HighSchool> getHighSchool() {
        return highSchool;
    }

    /**
     * High School
     * <p>
     * High schools attended by the applicant.
     * 
     */
    @JsonProperty("highSchool")
    public void setHighSchool(List<HighSchool> highSchool) {
        this.highSchool = highSchool;
    }

    public HighSchoolInformation withHighSchool(List<HighSchool> highSchool) {
        this.highSchool = highSchool;
        return this;
    }

    /**
     * Transcript
     * <p>
     * Applicant's high school transcript details.
     * 
     */
    @JsonProperty("transcript")
    public Transcript getTranscript() {
        return transcript;
    }

    /**
     * Transcript
     * <p>
     * Applicant's high school transcript details.
     * 
     */
    @JsonProperty("transcript")
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public HighSchoolInformation withTranscript(Transcript transcript) {
        this.transcript = transcript;
        return this;
    }

    /**
     * Education Level
     * <p>
     * Applicant's higher and highest education level related information.
     * 
     */
    @JsonProperty("educationLevel")
    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    /**
     * Education Level
     * <p>
     * Applicant's higher and highest education level related information.
     * 
     */
    @JsonProperty("educationLevel")
    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public HighSchoolInformation withEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HighSchoolInformation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("highSchool");
        sb.append('=');
        sb.append(((this.highSchool == null)?"<null>":this.highSchool));
        sb.append(',');
        sb.append("transcript");
        sb.append('=');
        sb.append(((this.transcript == null)?"<null>":this.transcript));
        sb.append(',');
        sb.append("educationLevel");
        sb.append('=');
        sb.append(((this.educationLevel == null)?"<null>":this.educationLevel));
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
        result = ((result* 31)+((this.highSchool == null)? 0 :this.highSchool.hashCode()));
        result = ((result* 31)+((this.transcript == null)? 0 :this.transcript.hashCode()));
        result = ((result* 31)+((this.educationLevel == null)? 0 :this.educationLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HighSchoolInformation) == false) {
            return false;
        }
        HighSchoolInformation rhs = ((HighSchoolInformation) other);
        return ((((this.highSchool == rhs.highSchool)||((this.highSchool!= null)&&this.highSchool.equals(rhs.highSchool)))&&((this.transcript == rhs.transcript)||((this.transcript!= null)&&this.transcript.equals(rhs.transcript))))&&((this.educationLevel == rhs.educationLevel)||((this.educationLevel!= null)&&this.educationLevel.equals(rhs.educationLevel))));
    }

}
