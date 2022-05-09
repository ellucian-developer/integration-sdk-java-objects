
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
    "attendancePeriods",
    "performanceMeasure",
    "totalCreditsEarned",
    "credentialReceived",
    "credentialEarnedOn"
})
@Generated("jsonschema2pojo")
public class PreviousInstitution {

    /**
     * Institution
     * <p>
     * An institution that the applicant previously attended
     * 
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("An institution that the applicant previously attended")
    private Object institution;
    /**
     * Attendance Periods
     * <p>
     * The periods of attendance at a previous institution.
     * 
     */
    @JsonProperty("attendancePeriods")
    @JsonPropertyDescription("The periods of attendance at a previous institution.")
    private List<AttendancePeriod__1> attendancePeriods = new ArrayList<AttendancePeriod__1>();
    /**
     * Performance Measure
     * <p>
     * The measure of performance at an institution (ex. GPA)
     * 
     */
    @JsonProperty("performanceMeasure")
    @JsonPropertyDescription("The measure of performance at an institution (ex. GPA)")
    private String performanceMeasure;
    /**
     * Total Credits Earned
     * <p>
     * The total number of credits earned at a previous institution.
     * 
     */
    @JsonProperty("totalCreditsEarned")
    @JsonPropertyDescription("The total number of credits earned at a previous institution.")
    private Double totalCreditsEarned;
    /**
     * Credential Received
     * <p>
     * The credential granted to the applicant
     * 
     */
    @JsonProperty("credentialReceived")
    @JsonPropertyDescription("The credential granted to the applicant")
    private Object credentialReceived;
    /**
     * Credential Earned On
     * <p>
     * The date a credential was granted.
     * 
     */
    @JsonProperty("credentialEarnedOn")
    @JsonPropertyDescription("The date a credential was granted.")
    private Object credentialEarnedOn;

    /**
     * Institution
     * <p>
     * An institution that the applicant previously attended
     * 
     */
    @JsonProperty("institution")
    public Object getInstitution() {
        return institution;
    }

    /**
     * Institution
     * <p>
     * An institution that the applicant previously attended
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(Object institution) {
        this.institution = institution;
    }

    public PreviousInstitution withInstitution(Object institution) {
        this.institution = institution;
        return this;
    }

    /**
     * Attendance Periods
     * <p>
     * The periods of attendance at a previous institution.
     * 
     */
    @JsonProperty("attendancePeriods")
    public List<AttendancePeriod__1> getAttendancePeriods() {
        return attendancePeriods;
    }

    /**
     * Attendance Periods
     * <p>
     * The periods of attendance at a previous institution.
     * 
     */
    @JsonProperty("attendancePeriods")
    public void setAttendancePeriods(List<AttendancePeriod__1> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
    }

    public PreviousInstitution withAttendancePeriods(List<AttendancePeriod__1> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
        return this;
    }

    /**
     * Performance Measure
     * <p>
     * The measure of performance at an institution (ex. GPA)
     * 
     */
    @JsonProperty("performanceMeasure")
    public String getPerformanceMeasure() {
        return performanceMeasure;
    }

    /**
     * Performance Measure
     * <p>
     * The measure of performance at an institution (ex. GPA)
     * 
     */
    @JsonProperty("performanceMeasure")
    public void setPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
    }

    public PreviousInstitution withPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
        return this;
    }

    /**
     * Total Credits Earned
     * <p>
     * The total number of credits earned at a previous institution.
     * 
     */
    @JsonProperty("totalCreditsEarned")
    public Double getTotalCreditsEarned() {
        return totalCreditsEarned;
    }

    /**
     * Total Credits Earned
     * <p>
     * The total number of credits earned at a previous institution.
     * 
     */
    @JsonProperty("totalCreditsEarned")
    public void setTotalCreditsEarned(Double totalCreditsEarned) {
        this.totalCreditsEarned = totalCreditsEarned;
    }

    public PreviousInstitution withTotalCreditsEarned(Double totalCreditsEarned) {
        this.totalCreditsEarned = totalCreditsEarned;
        return this;
    }

    /**
     * Credential Received
     * <p>
     * The credential granted to the applicant
     * 
     */
    @JsonProperty("credentialReceived")
    public Object getCredentialReceived() {
        return credentialReceived;
    }

    /**
     * Credential Received
     * <p>
     * The credential granted to the applicant
     * 
     */
    @JsonProperty("credentialReceived")
    public void setCredentialReceived(Object credentialReceived) {
        this.credentialReceived = credentialReceived;
    }

    public PreviousInstitution withCredentialReceived(Object credentialReceived) {
        this.credentialReceived = credentialReceived;
        return this;
    }

    /**
     * Credential Earned On
     * <p>
     * The date a credential was granted.
     * 
     */
    @JsonProperty("credentialEarnedOn")
    public Object getCredentialEarnedOn() {
        return credentialEarnedOn;
    }

    /**
     * Credential Earned On
     * <p>
     * The date a credential was granted.
     * 
     */
    @JsonProperty("credentialEarnedOn")
    public void setCredentialEarnedOn(Object credentialEarnedOn) {
        this.credentialEarnedOn = credentialEarnedOn;
    }

    public PreviousInstitution withCredentialEarnedOn(Object credentialEarnedOn) {
        this.credentialEarnedOn = credentialEarnedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PreviousInstitution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("institution");
        sb.append('=');
        sb.append(((this.institution == null)?"<null>":this.institution));
        sb.append(',');
        sb.append("attendancePeriods");
        sb.append('=');
        sb.append(((this.attendancePeriods == null)?"<null>":this.attendancePeriods));
        sb.append(',');
        sb.append("performanceMeasure");
        sb.append('=');
        sb.append(((this.performanceMeasure == null)?"<null>":this.performanceMeasure));
        sb.append(',');
        sb.append("totalCreditsEarned");
        sb.append('=');
        sb.append(((this.totalCreditsEarned == null)?"<null>":this.totalCreditsEarned));
        sb.append(',');
        sb.append("credentialReceived");
        sb.append('=');
        sb.append(((this.credentialReceived == null)?"<null>":this.credentialReceived));
        sb.append(',');
        sb.append("credentialEarnedOn");
        sb.append('=');
        sb.append(((this.credentialEarnedOn == null)?"<null>":this.credentialEarnedOn));
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
        result = ((result* 31)+((this.performanceMeasure == null)? 0 :this.performanceMeasure.hashCode()));
        result = ((result* 31)+((this.credentialReceived == null)? 0 :this.credentialReceived.hashCode()));
        result = ((result* 31)+((this.credentialEarnedOn == null)? 0 :this.credentialEarnedOn.hashCode()));
        result = ((result* 31)+((this.totalCreditsEarned == null)? 0 :this.totalCreditsEarned.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PreviousInstitution) == false) {
            return false;
        }
        PreviousInstitution rhs = ((PreviousInstitution) other);
        return (((((((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution)))&&((this.attendancePeriods == rhs.attendancePeriods)||((this.attendancePeriods!= null)&&this.attendancePeriods.equals(rhs.attendancePeriods))))&&((this.performanceMeasure == rhs.performanceMeasure)||((this.performanceMeasure!= null)&&this.performanceMeasure.equals(rhs.performanceMeasure))))&&((this.credentialReceived == rhs.credentialReceived)||((this.credentialReceived!= null)&&this.credentialReceived.equals(rhs.credentialReceived))))&&((this.credentialEarnedOn == rhs.credentialEarnedOn)||((this.credentialEarnedOn!= null)&&this.credentialEarnedOn.equals(rhs.credentialEarnedOn))))&&((this.totalCreditsEarned == rhs.totalCreditsEarned)||((this.totalCreditsEarned!= null)&&this.totalCreditsEarned.equals(rhs.totalCreditsEarned))));
    }

}
