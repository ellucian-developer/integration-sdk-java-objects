
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Education Level
 * <p>
 * Applicant's higher and highest education level related information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "higherEducationLevel",
    "higherEducationCompletionDate",
    "highestEducationLevel"
})
@Generated("jsonschema2pojo")
public class EducationLevel {

    /**
     * Higher Education Level
     * <p>
     * Applicant’s Higher Education Level.
     * 
     */
    @JsonProperty("higherEducationLevel")
    @JsonPropertyDescription("Applicant\u2019s Higher Education Level.")
    private String higherEducationLevel;
    /**
     * Higher Education Completion Date
     * <p>
     * Applicant’s Higher Education Degree Date.
     * 
     */
    @JsonProperty("higherEducationCompletionDate")
    @JsonPropertyDescription("Applicant\u2019s Higher Education Degree Date.")
    private Object higherEducationCompletionDate;
    /**
     * Highest Education Level
     * <p>
     * Applicant's highest education level.
     * 
     */
    @JsonProperty("highestEducationLevel")
    @JsonPropertyDescription("Applicant's highest education level.")
    private String highestEducationLevel;

    /**
     * Higher Education Level
     * <p>
     * Applicant’s Higher Education Level.
     * 
     */
    @JsonProperty("higherEducationLevel")
    public String getHigherEducationLevel() {
        return higherEducationLevel;
    }

    /**
     * Higher Education Level
     * <p>
     * Applicant’s Higher Education Level.
     * 
     */
    @JsonProperty("higherEducationLevel")
    public void setHigherEducationLevel(String higherEducationLevel) {
        this.higherEducationLevel = higherEducationLevel;
    }

    public EducationLevel withHigherEducationLevel(String higherEducationLevel) {
        this.higherEducationLevel = higherEducationLevel;
        return this;
    }

    /**
     * Higher Education Completion Date
     * <p>
     * Applicant’s Higher Education Degree Date.
     * 
     */
    @JsonProperty("higherEducationCompletionDate")
    public Object getHigherEducationCompletionDate() {
        return higherEducationCompletionDate;
    }

    /**
     * Higher Education Completion Date
     * <p>
     * Applicant’s Higher Education Degree Date.
     * 
     */
    @JsonProperty("higherEducationCompletionDate")
    public void setHigherEducationCompletionDate(Object higherEducationCompletionDate) {
        this.higherEducationCompletionDate = higherEducationCompletionDate;
    }

    public EducationLevel withHigherEducationCompletionDate(Object higherEducationCompletionDate) {
        this.higherEducationCompletionDate = higherEducationCompletionDate;
        return this;
    }

    /**
     * Highest Education Level
     * <p>
     * Applicant's highest education level.
     * 
     */
    @JsonProperty("highestEducationLevel")
    public String getHighestEducationLevel() {
        return highestEducationLevel;
    }

    /**
     * Highest Education Level
     * <p>
     * Applicant's highest education level.
     * 
     */
    @JsonProperty("highestEducationLevel")
    public void setHighestEducationLevel(String highestEducationLevel) {
        this.highestEducationLevel = highestEducationLevel;
    }

    public EducationLevel withHighestEducationLevel(String highestEducationLevel) {
        this.highestEducationLevel = highestEducationLevel;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EducationLevel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("higherEducationLevel");
        sb.append('=');
        sb.append(((this.higherEducationLevel == null)?"<null>":this.higherEducationLevel));
        sb.append(',');
        sb.append("higherEducationCompletionDate");
        sb.append('=');
        sb.append(((this.higherEducationCompletionDate == null)?"<null>":this.higherEducationCompletionDate));
        sb.append(',');
        sb.append("highestEducationLevel");
        sb.append('=');
        sb.append(((this.highestEducationLevel == null)?"<null>":this.highestEducationLevel));
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
        result = ((result* 31)+((this.higherEducationLevel == null)? 0 :this.higherEducationLevel.hashCode()));
        result = ((result* 31)+((this.highestEducationLevel == null)? 0 :this.highestEducationLevel.hashCode()));
        result = ((result* 31)+((this.higherEducationCompletionDate == null)? 0 :this.higherEducationCompletionDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EducationLevel) == false) {
            return false;
        }
        EducationLevel rhs = ((EducationLevel) other);
        return ((((this.higherEducationLevel == rhs.higherEducationLevel)||((this.higherEducationLevel!= null)&&this.higherEducationLevel.equals(rhs.higherEducationLevel)))&&((this.highestEducationLevel == rhs.highestEducationLevel)||((this.highestEducationLevel!= null)&&this.highestEducationLevel.equals(rhs.highestEducationLevel))))&&((this.higherEducationCompletionDate == rhs.higherEducationCompletionDate)||((this.higherEducationCompletionDate!= null)&&this.higherEducationCompletionDate.equals(rhs.higherEducationCompletionDate))));
    }

}
