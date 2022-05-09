
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "institution",
    "graduatedOn",
    "performanceMeasure",
    "attendancePeriods"
})
@Generated("jsonschema2pojo")
public class SecondarySchool {

    /**
     * Institution
     * <p>
     * The institution attended
     * 
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("The institution attended")
    private Object institution;
    /**
     * Graduated Secondary School On
     * <p>
     * The date the applicant graduated from secondary school
     * 
     */
    @JsonProperty("graduatedOn")
    @JsonPropertyDescription("The date the applicant graduated from secondary school")
    private Object graduatedOn;
    /**
     * Performance Measure
     * <p>
     * A measure of the applicant's performance (ex. GPA)
     * 
     */
    @JsonProperty("performanceMeasure")
    @JsonPropertyDescription("A measure of the applicant's performance (ex. GPA)")
    private String performanceMeasure;
    /**
     * Attendance Periods
     * <p>
     * 
     * 
     */
    @JsonProperty("attendancePeriods")
    @JsonPropertyDescription("")
    private List<AttendancePeriod> attendancePeriods = new ArrayList<AttendancePeriod>();

    /**
     * Institution
     * <p>
     * The institution attended
     * 
     */
    @JsonProperty("institution")
    public Object getInstitution() {
        return institution;
    }

    /**
     * Institution
     * <p>
     * The institution attended
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(Object institution) {
        this.institution = institution;
    }

    public SecondarySchool withInstitution(Object institution) {
        this.institution = institution;
        return this;
    }

    /**
     * Graduated Secondary School On
     * <p>
     * The date the applicant graduated from secondary school
     * 
     */
    @JsonProperty("graduatedOn")
    public Object getGraduatedOn() {
        return graduatedOn;
    }

    /**
     * Graduated Secondary School On
     * <p>
     * The date the applicant graduated from secondary school
     * 
     */
    @JsonProperty("graduatedOn")
    public void setGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
    }

    public SecondarySchool withGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
        return this;
    }

    /**
     * Performance Measure
     * <p>
     * A measure of the applicant's performance (ex. GPA)
     * 
     */
    @JsonProperty("performanceMeasure")
    public String getPerformanceMeasure() {
        return performanceMeasure;
    }

    /**
     * Performance Measure
     * <p>
     * A measure of the applicant's performance (ex. GPA)
     * 
     */
    @JsonProperty("performanceMeasure")
    public void setPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
    }

    public SecondarySchool withPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
        return this;
    }

    /**
     * Attendance Periods
     * <p>
     * 
     * 
     */
    @JsonProperty("attendancePeriods")
    public List<AttendancePeriod> getAttendancePeriods() {
        return attendancePeriods;
    }

    /**
     * Attendance Periods
     * <p>
     * 
     * 
     */
    @JsonProperty("attendancePeriods")
    public void setAttendancePeriods(List<AttendancePeriod> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
    }

    public SecondarySchool withAttendancePeriods(List<AttendancePeriod> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecondarySchool.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("institution");
        sb.append('=');
        sb.append(((this.institution == null)?"<null>":this.institution));
        sb.append(',');
        sb.append("graduatedOn");
        sb.append('=');
        sb.append(((this.graduatedOn == null)?"<null>":this.graduatedOn));
        sb.append(',');
        sb.append("performanceMeasure");
        sb.append('=');
        sb.append(((this.performanceMeasure == null)?"<null>":this.performanceMeasure));
        sb.append(',');
        sb.append("attendancePeriods");
        sb.append('=');
        sb.append(((this.attendancePeriods == null)?"<null>":this.attendancePeriods));
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
        result = ((result* 31)+((this.institution == null)? 0 :this.institution.hashCode()));
        result = ((result* 31)+((this.attendancePeriods == null)? 0 :this.attendancePeriods.hashCode()));
        result = ((result* 31)+((this.graduatedOn == null)? 0 :this.graduatedOn.hashCode()));
        result = ((result* 31)+((this.performanceMeasure == null)? 0 :this.performanceMeasure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecondarySchool) == false) {
            return false;
        }
        SecondarySchool rhs = ((SecondarySchool) other);
        return (((((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution)))&&((this.attendancePeriods == rhs.attendancePeriods)||((this.attendancePeriods!= null)&&this.attendancePeriods.equals(rhs.attendancePeriods))))&&((this.graduatedOn == rhs.graduatedOn)||((this.graduatedOn!= null)&&this.graduatedOn.equals(rhs.graduatedOn))))&&((this.performanceMeasure == rhs.performanceMeasure)||((this.performanceMeasure!= null)&&this.performanceMeasure.equals(rhs.performanceMeasure))));
    }

}
