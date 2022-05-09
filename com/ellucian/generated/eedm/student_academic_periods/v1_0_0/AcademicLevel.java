
package com.ellucian.generated.eedm.student_academic_periods.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "academicLevel",
    "priority"
})
@Generated("jsonschema2pojo")
public class AcademicLevel {

    /**
     * Academic Level
     * <p>
     * The distinct academic level associated with the student for this period.
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The distinct academic level associated with the student for this period.")
    private AcademicLevel__1 academicLevel;
    /**
     * Priority
     * <p>
     * An indicator as to whether the academic level is the primary for the student.
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("An indicator as to whether the academic level is the primary for the student.")
    private Object priority;

    /**
     * Academic Level
     * <p>
     * The distinct academic level associated with the student for this period.
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
     * The distinct academic level associated with the student for this period.
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(AcademicLevel__1 academicLevel) {
        this.academicLevel = academicLevel;
    }

    public AcademicLevel withAcademicLevel(AcademicLevel__1 academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Priority
     * <p>
     * An indicator as to whether the academic level is the primary for the student.
     * 
     */
    @JsonProperty("priority")
    public Object getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * An indicator as to whether the academic level is the primary for the student.
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public AcademicLevel withPriority(Object priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicLevel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
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
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicLevel) == false) {
            return false;
        }
        AcademicLevel rhs = ((AcademicLevel) other);
        return (((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority)))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))));
    }

}
