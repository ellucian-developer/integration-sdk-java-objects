
package com.ellucian.generated.eedm.students.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level",
    "performanceMeasure",
    "classification"
})
@Generated("jsonschema2pojo")
public class Measure {

    /**
     * Level
     * <p>
     * The academic level associated with the student.
     * (Required)
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("The academic level associated with the student.")
    private Level level;
    /**
     * Performance Measure
     * <p>
     * Measurement of the student's performance by academic level. (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    @JsonPropertyDescription("Measurement of the student's performance by academic level. (e.g. GPA).")
    private String performanceMeasure;
    /**
     * Classification
     * <p>
     * The student's classification by academic level. (E.g Freshman, Senior, ...)
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("The student's classification by academic level. (E.g Freshman, Senior, ...)")
    private Object classification;

    /**
     * Level
     * <p>
     * The academic level associated with the student.
     * (Required)
     * 
     */
    @JsonProperty("level")
    public Level getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * The academic level associated with the student.
     * (Required)
     * 
     */
    @JsonProperty("level")
    public void setLevel(Level level) {
        this.level = level;
    }

    public Measure withLevel(Level level) {
        this.level = level;
        return this;
    }

    /**
     * Performance Measure
     * <p>
     * Measurement of the student's performance by academic level. (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    public String getPerformanceMeasure() {
        return performanceMeasure;
    }

    /**
     * Performance Measure
     * <p>
     * Measurement of the student's performance by academic level. (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    public void setPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
    }

    public Measure withPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
        return this;
    }

    /**
     * Classification
     * <p>
     * The student's classification by academic level. (E.g Freshman, Senior, ...)
     * 
     */
    @JsonProperty("classification")
    public Object getClassification() {
        return classification;
    }

    /**
     * Classification
     * <p>
     * The student's classification by academic level. (E.g Freshman, Senior, ...)
     * 
     */
    @JsonProperty("classification")
    public void setClassification(Object classification) {
        this.classification = classification;
    }

    public Measure withClassification(Object classification) {
        this.classification = classification;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Measure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("performanceMeasure");
        sb.append('=');
        sb.append(((this.performanceMeasure == null)?"<null>":this.performanceMeasure));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
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
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.performanceMeasure == null)? 0 :this.performanceMeasure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Measure) == false) {
            return false;
        }
        Measure rhs = ((Measure) other);
        return ((((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification)))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.performanceMeasure == rhs.performanceMeasure)||((this.performanceMeasure!= null)&&this.performanceMeasure.equals(rhs.performanceMeasure))));
    }

}
