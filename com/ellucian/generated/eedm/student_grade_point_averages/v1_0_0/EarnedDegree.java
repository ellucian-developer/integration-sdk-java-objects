
package com.ellucian.generated.eedm.student_grade_point_averages.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "academicProgram",
    "academicSource",
    "earnedOn",
    "value",
    "attemptedCredits",
    "earnedCredits",
    "qualityPoints"
})
@Generated("jsonschema2pojo")
public class EarnedDegree {

    /**
     * Academic Program
     * <p>
     * The academic program associated with the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("academicProgram")
    @JsonPropertyDescription("The academic program associated with the grade point average.")
    private AcademicProgram academicProgram;
    /**
     * Academic Source
     * <p>
     * An indication of the academic sources that have been included in the grade point average (e.g. institution, transfer or all).
     * (Required)
     * 
     */
    @JsonProperty("academicSource")
    @JsonPropertyDescription("An indication of the academic sources that have been included in the grade point average (e.g. institution, transfer or all).")
    private String academicSource;
    /**
     * Earned On
     * <p>
     * The date the student earned the degree.
     * (Required)
     * 
     */
    @JsonProperty("earnedOn")
    @JsonPropertyDescription("The date the student earned the degree.")
    private String earnedOn;
    /**
     * Value
     * <p>
     * The grade point average.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The grade point average.")
    private Double value;
    /**
     * Attempted Credits
     * <p>
     * The number of attempted credits used to compute the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("attemptedCredits")
    @JsonPropertyDescription("The number of attempted credits used to compute the grade point average.")
    private Double attemptedCredits;
    /**
     * Earned Credits
     * <p>
     * The number of earned credits used to compute the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("earnedCredits")
    @JsonPropertyDescription("The number of earned credits used to compute the grade point average.")
    private Double earnedCredits;
    /**
     * Quality Points
     * <p>
     * The number of quality points used to compute the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("qualityPoints")
    @JsonPropertyDescription("The number of quality points used to compute the grade point average.")
    private Double qualityPoints;

    /**
     * Academic Program
     * <p>
     * The academic program associated with the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("academicProgram")
    public AcademicProgram getAcademicProgram() {
        return academicProgram;
    }

    /**
     * Academic Program
     * <p>
     * The academic program associated with the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("academicProgram")
    public void setAcademicProgram(AcademicProgram academicProgram) {
        this.academicProgram = academicProgram;
    }

    public EarnedDegree withAcademicProgram(AcademicProgram academicProgram) {
        this.academicProgram = academicProgram;
        return this;
    }

    /**
     * Academic Source
     * <p>
     * An indication of the academic sources that have been included in the grade point average (e.g. institution, transfer or all).
     * (Required)
     * 
     */
    @JsonProperty("academicSource")
    public String getAcademicSource() {
        return academicSource;
    }

    /**
     * Academic Source
     * <p>
     * An indication of the academic sources that have been included in the grade point average (e.g. institution, transfer or all).
     * (Required)
     * 
     */
    @JsonProperty("academicSource")
    public void setAcademicSource(String academicSource) {
        this.academicSource = academicSource;
    }

    public EarnedDegree withAcademicSource(String academicSource) {
        this.academicSource = academicSource;
        return this;
    }

    /**
     * Earned On
     * <p>
     * The date the student earned the degree.
     * (Required)
     * 
     */
    @JsonProperty("earnedOn")
    public String getEarnedOn() {
        return earnedOn;
    }

    /**
     * Earned On
     * <p>
     * The date the student earned the degree.
     * (Required)
     * 
     */
    @JsonProperty("earnedOn")
    public void setEarnedOn(String earnedOn) {
        this.earnedOn = earnedOn;
    }

    public EarnedDegree withEarnedOn(String earnedOn) {
        this.earnedOn = earnedOn;
        return this;
    }

    /**
     * Value
     * <p>
     * The grade point average.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The grade point average.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    public EarnedDegree withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Attempted Credits
     * <p>
     * The number of attempted credits used to compute the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("attemptedCredits")
    public Double getAttemptedCredits() {
        return attemptedCredits;
    }

    /**
     * Attempted Credits
     * <p>
     * The number of attempted credits used to compute the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("attemptedCredits")
    public void setAttemptedCredits(Double attemptedCredits) {
        this.attemptedCredits = attemptedCredits;
    }

    public EarnedDegree withAttemptedCredits(Double attemptedCredits) {
        this.attemptedCredits = attemptedCredits;
        return this;
    }

    /**
     * Earned Credits
     * <p>
     * The number of earned credits used to compute the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("earnedCredits")
    public Double getEarnedCredits() {
        return earnedCredits;
    }

    /**
     * Earned Credits
     * <p>
     * The number of earned credits used to compute the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("earnedCredits")
    public void setEarnedCredits(Double earnedCredits) {
        this.earnedCredits = earnedCredits;
    }

    public EarnedDegree withEarnedCredits(Double earnedCredits) {
        this.earnedCredits = earnedCredits;
        return this;
    }

    /**
     * Quality Points
     * <p>
     * The number of quality points used to compute the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("qualityPoints")
    public Double getQualityPoints() {
        return qualityPoints;
    }

    /**
     * Quality Points
     * <p>
     * The number of quality points used to compute the grade point average.
     * (Required)
     * 
     */
    @JsonProperty("qualityPoints")
    public void setQualityPoints(Double qualityPoints) {
        this.qualityPoints = qualityPoints;
    }

    public EarnedDegree withQualityPoints(Double qualityPoints) {
        this.qualityPoints = qualityPoints;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EarnedDegree.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("academicProgram");
        sb.append('=');
        sb.append(((this.academicProgram == null)?"<null>":this.academicProgram));
        sb.append(',');
        sb.append("academicSource");
        sb.append('=');
        sb.append(((this.academicSource == null)?"<null>":this.academicSource));
        sb.append(',');
        sb.append("earnedOn");
        sb.append('=');
        sb.append(((this.earnedOn == null)?"<null>":this.earnedOn));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("attemptedCredits");
        sb.append('=');
        sb.append(((this.attemptedCredits == null)?"<null>":this.attemptedCredits));
        sb.append(',');
        sb.append("earnedCredits");
        sb.append('=');
        sb.append(((this.earnedCredits == null)?"<null>":this.earnedCredits));
        sb.append(',');
        sb.append("qualityPoints");
        sb.append('=');
        sb.append(((this.qualityPoints == null)?"<null>":this.qualityPoints));
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
        result = ((result* 31)+((this.academicProgram == null)? 0 :this.academicProgram.hashCode()));
        result = ((result* 31)+((this.academicSource == null)? 0 :this.academicSource.hashCode()));
        result = ((result* 31)+((this.qualityPoints == null)? 0 :this.qualityPoints.hashCode()));
        result = ((result* 31)+((this.attemptedCredits == null)? 0 :this.attemptedCredits.hashCode()));
        result = ((result* 31)+((this.earnedCredits == null)? 0 :this.earnedCredits.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.earnedOn == null)? 0 :this.earnedOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EarnedDegree) == false) {
            return false;
        }
        EarnedDegree rhs = ((EarnedDegree) other);
        return ((((((((this.academicProgram == rhs.academicProgram)||((this.academicProgram!= null)&&this.academicProgram.equals(rhs.academicProgram)))&&((this.academicSource == rhs.academicSource)||((this.academicSource!= null)&&this.academicSource.equals(rhs.academicSource))))&&((this.qualityPoints == rhs.qualityPoints)||((this.qualityPoints!= null)&&this.qualityPoints.equals(rhs.qualityPoints))))&&((this.attemptedCredits == rhs.attemptedCredits)||((this.attemptedCredits!= null)&&this.attemptedCredits.equals(rhs.attemptedCredits))))&&((this.earnedCredits == rhs.earnedCredits)||((this.earnedCredits!= null)&&this.earnedCredits.equals(rhs.earnedCredits))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.earnedOn == rhs.earnedOn)||((this.earnedOn!= null)&&this.earnedOn.equals(rhs.earnedOn))));
    }

}
