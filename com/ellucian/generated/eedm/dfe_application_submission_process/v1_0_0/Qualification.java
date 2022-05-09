
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Qualification
 * <p>
 * Information about applicant’s qualification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gcses",
    "degrees",
    "otherQualifications",
    "missingGcsesExplanation"
})
@Generated("jsonschema2pojo")
public class Qualification {

    /**
     * GCSES
     * <p>
     * Information related to General Certificate of Secondary Education (GCSE) exams.
     * 
     */
    @JsonProperty("gcses")
    @JsonPropertyDescription("Information related to General Certificate of Secondary Education (GCSE) exams.")
    private List<Gcse> gcses = new ArrayList<Gcse>();
    /**
     * Degrees
     * <p>
     * Information about an applicant’s degree.
     * 
     */
    @JsonProperty("degrees")
    @JsonPropertyDescription("Information about an applicant\u2019s degree.")
    private List<Degree> degrees = new ArrayList<Degree>();
    /**
     * Other Qualifications
     * <p>
     * Additional qualification details of an applicant.
     * 
     */
    @JsonProperty("otherQualifications")
    @JsonPropertyDescription("Additional qualification details of an applicant.")
    private List<OtherQualification> otherQualifications = new ArrayList<OtherQualification>();
    /**
     * Missing gcses Explanation
     * <p>
     * If the candidate lacks any required GCSEs, this field will contain their free-text explanation of why this is the case.
     * 
     */
    @JsonProperty("missingGcsesExplanation")
    @JsonPropertyDescription("If the candidate lacks any required GCSEs, this field will contain their free-text explanation of why this is the case.")
    private String missingGcsesExplanation;

    /**
     * GCSES
     * <p>
     * Information related to General Certificate of Secondary Education (GCSE) exams.
     * 
     */
    @JsonProperty("gcses")
    public List<Gcse> getGcses() {
        return gcses;
    }

    /**
     * GCSES
     * <p>
     * Information related to General Certificate of Secondary Education (GCSE) exams.
     * 
     */
    @JsonProperty("gcses")
    public void setGcses(List<Gcse> gcses) {
        this.gcses = gcses;
    }

    public Qualification withGcses(List<Gcse> gcses) {
        this.gcses = gcses;
        return this;
    }

    /**
     * Degrees
     * <p>
     * Information about an applicant’s degree.
     * 
     */
    @JsonProperty("degrees")
    public List<Degree> getDegrees() {
        return degrees;
    }

    /**
     * Degrees
     * <p>
     * Information about an applicant’s degree.
     * 
     */
    @JsonProperty("degrees")
    public void setDegrees(List<Degree> degrees) {
        this.degrees = degrees;
    }

    public Qualification withDegrees(List<Degree> degrees) {
        this.degrees = degrees;
        return this;
    }

    /**
     * Other Qualifications
     * <p>
     * Additional qualification details of an applicant.
     * 
     */
    @JsonProperty("otherQualifications")
    public List<OtherQualification> getOtherQualifications() {
        return otherQualifications;
    }

    /**
     * Other Qualifications
     * <p>
     * Additional qualification details of an applicant.
     * 
     */
    @JsonProperty("otherQualifications")
    public void setOtherQualifications(List<OtherQualification> otherQualifications) {
        this.otherQualifications = otherQualifications;
    }

    public Qualification withOtherQualifications(List<OtherQualification> otherQualifications) {
        this.otherQualifications = otherQualifications;
        return this;
    }

    /**
     * Missing gcses Explanation
     * <p>
     * If the candidate lacks any required GCSEs, this field will contain their free-text explanation of why this is the case.
     * 
     */
    @JsonProperty("missingGcsesExplanation")
    public String getMissingGcsesExplanation() {
        return missingGcsesExplanation;
    }

    /**
     * Missing gcses Explanation
     * <p>
     * If the candidate lacks any required GCSEs, this field will contain their free-text explanation of why this is the case.
     * 
     */
    @JsonProperty("missingGcsesExplanation")
    public void setMissingGcsesExplanation(String missingGcsesExplanation) {
        this.missingGcsesExplanation = missingGcsesExplanation;
    }

    public Qualification withMissingGcsesExplanation(String missingGcsesExplanation) {
        this.missingGcsesExplanation = missingGcsesExplanation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Qualification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gcses");
        sb.append('=');
        sb.append(((this.gcses == null)?"<null>":this.gcses));
        sb.append(',');
        sb.append("degrees");
        sb.append('=');
        sb.append(((this.degrees == null)?"<null>":this.degrees));
        sb.append(',');
        sb.append("otherQualifications");
        sb.append('=');
        sb.append(((this.otherQualifications == null)?"<null>":this.otherQualifications));
        sb.append(',');
        sb.append("missingGcsesExplanation");
        sb.append('=');
        sb.append(((this.missingGcsesExplanation == null)?"<null>":this.missingGcsesExplanation));
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
        result = ((result* 31)+((this.missingGcsesExplanation == null)? 0 :this.missingGcsesExplanation.hashCode()));
        result = ((result* 31)+((this.degrees == null)? 0 :this.degrees.hashCode()));
        result = ((result* 31)+((this.otherQualifications == null)? 0 :this.otherQualifications.hashCode()));
        result = ((result* 31)+((this.gcses == null)? 0 :this.gcses.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Qualification) == false) {
            return false;
        }
        Qualification rhs = ((Qualification) other);
        return (((((this.missingGcsesExplanation == rhs.missingGcsesExplanation)||((this.missingGcsesExplanation!= null)&&this.missingGcsesExplanation.equals(rhs.missingGcsesExplanation)))&&((this.degrees == rhs.degrees)||((this.degrees!= null)&&this.degrees.equals(rhs.degrees))))&&((this.otherQualifications == rhs.otherQualifications)||((this.otherQualifications!= null)&&this.otherQualifications.equals(rhs.otherQualifications))))&&((this.gcses == rhs.gcses)||((this.gcses!= null)&&this.gcses.equals(rhs.gcses))));
    }

}
