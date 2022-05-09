
package com.ellucian.generated.eedm.student_grade_point_averages.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "academicSource",
    "academicLevel",
    "value",
    "attemptedCredits",
    "earnedCredits",
    "qualityPoints"
})
@Generated("jsonschema2pojo")
public class Cumulative {

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
     * Academic Level
     * <p>
     * The academic level associated with the calculated grade point average.
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level associated with the calculated grade point average.")
    private AcademicLevel__1 academicLevel;
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

    public Cumulative withAcademicSource(String academicSource) {
        this.academicSource = academicSource;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the calculated grade point average.
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    public AcademicLevel__1 getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the calculated grade point average.
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(AcademicLevel__1 academicLevel) {
        this.academicLevel = academicLevel;
    }

    public Cumulative withAcademicLevel(AcademicLevel__1 academicLevel) {
        this.academicLevel = academicLevel;
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

    public Cumulative withValue(Double value) {
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

    public Cumulative withAttemptedCredits(Double attemptedCredits) {
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

    public Cumulative withEarnedCredits(Double earnedCredits) {
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

    public Cumulative withQualityPoints(Double qualityPoints) {
        this.qualityPoints = qualityPoints;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cumulative.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("academicSource");
        sb.append('=');
        sb.append(((this.academicSource == null)?"<null>":this.academicSource));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
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
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.academicSource == null)? 0 :this.academicSource.hashCode()));
        result = ((result* 31)+((this.qualityPoints == null)? 0 :this.qualityPoints.hashCode()));
        result = ((result* 31)+((this.attemptedCredits == null)? 0 :this.attemptedCredits.hashCode()));
        result = ((result* 31)+((this.earnedCredits == null)? 0 :this.earnedCredits.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cumulative) == false) {
            return false;
        }
        Cumulative rhs = ((Cumulative) other);
        return (((((((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel)))&&((this.academicSource == rhs.academicSource)||((this.academicSource!= null)&&this.academicSource.equals(rhs.academicSource))))&&((this.qualityPoints == rhs.qualityPoints)||((this.qualityPoints!= null)&&this.qualityPoints.equals(rhs.qualityPoints))))&&((this.attemptedCredits == rhs.attemptedCredits)||((this.attemptedCredits!= null)&&this.attemptedCredits.equals(rhs.attemptedCredits))))&&((this.earnedCredits == rhs.earnedCredits)||((this.earnedCredits!= null)&&this.earnedCredits.equals(rhs.earnedCredits))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
