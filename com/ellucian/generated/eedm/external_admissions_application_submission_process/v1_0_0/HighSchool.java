
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "city",
    "state",
    "ceebCode",
    "cdsCode",
    "graduatedOn",
    "gpa",
    "attendance",
    "educationLevel",
    "attendancePeriods"
})
@Generated("jsonschema2pojo")
public class HighSchool {

    /**
     * Name
     * <p>
     * Name of High School.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of High School.")
    private String name;
    /**
     * City
     * <p>
     * City of High School.
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City of High School.")
    private String city;
    /**
     * State
     * <p>
     * State of High School.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("State of High School.")
    private String state;
    /**
     * CEEB Code
     * <p>
     * High school’s CEEB code.
     * 
     */
    @JsonProperty("ceebCode")
    @JsonPropertyDescription("High school\u2019s CEEB code.")
    private String ceebCode;
    /**
     * CDS Code
     * <p>
     * High school’s CDS code.
     * 
     */
    @JsonProperty("cdsCode")
    @JsonPropertyDescription("High school\u2019s CDS code.")
    private String cdsCode;
    /**
     * Graduated High School On
     * <p>
     * The date the applicant graduated from high school.
     * 
     */
    @JsonProperty("graduatedOn")
    @JsonPropertyDescription("The date the applicant graduated from high school.")
    private Object graduatedOn;
    /**
     * Grade Point Average
     * <p>
     * Applicant’s grade point average (GPA).
     * 
     */
    @JsonProperty("gpa")
    @JsonPropertyDescription("Applicant\u2019s grade point average (GPA).")
    private String gpa;
    /**
     * Attendance
     * <p>
     * Applicant’s Attendance.
     * 
     */
    @JsonProperty("attendance")
    @JsonPropertyDescription("Applicant\u2019s Attendance.")
    private String attendance;
    /**
     * High School Education Level
     * <p>
     * Applicant’s High School Education Level.
     * 
     */
    @JsonProperty("educationLevel")
    @JsonPropertyDescription("Applicant\u2019s High School Education Level.")
    private String educationLevel;
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
     * Name
     * <p>
     * Name of High School.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Name of High School.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public HighSchool withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * City
     * <p>
     * City of High School.
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * City of High School.
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public HighSchool withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * State
     * <p>
     * State of High School.
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * <p>
     * State of High School.
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public HighSchool withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * CEEB Code
     * <p>
     * High school’s CEEB code.
     * 
     */
    @JsonProperty("ceebCode")
    public String getCeebCode() {
        return ceebCode;
    }

    /**
     * CEEB Code
     * <p>
     * High school’s CEEB code.
     * 
     */
    @JsonProperty("ceebCode")
    public void setCeebCode(String ceebCode) {
        this.ceebCode = ceebCode;
    }

    public HighSchool withCeebCode(String ceebCode) {
        this.ceebCode = ceebCode;
        return this;
    }

    /**
     * CDS Code
     * <p>
     * High school’s CDS code.
     * 
     */
    @JsonProperty("cdsCode")
    public String getCdsCode() {
        return cdsCode;
    }

    /**
     * CDS Code
     * <p>
     * High school’s CDS code.
     * 
     */
    @JsonProperty("cdsCode")
    public void setCdsCode(String cdsCode) {
        this.cdsCode = cdsCode;
    }

    public HighSchool withCdsCode(String cdsCode) {
        this.cdsCode = cdsCode;
        return this;
    }

    /**
     * Graduated High School On
     * <p>
     * The date the applicant graduated from high school.
     * 
     */
    @JsonProperty("graduatedOn")
    public Object getGraduatedOn() {
        return graduatedOn;
    }

    /**
     * Graduated High School On
     * <p>
     * The date the applicant graduated from high school.
     * 
     */
    @JsonProperty("graduatedOn")
    public void setGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
    }

    public HighSchool withGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
        return this;
    }

    /**
     * Grade Point Average
     * <p>
     * Applicant’s grade point average (GPA).
     * 
     */
    @JsonProperty("gpa")
    public String getGpa() {
        return gpa;
    }

    /**
     * Grade Point Average
     * <p>
     * Applicant’s grade point average (GPA).
     * 
     */
    @JsonProperty("gpa")
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public HighSchool withGpa(String gpa) {
        this.gpa = gpa;
        return this;
    }

    /**
     * Attendance
     * <p>
     * Applicant’s Attendance.
     * 
     */
    @JsonProperty("attendance")
    public String getAttendance() {
        return attendance;
    }

    /**
     * Attendance
     * <p>
     * Applicant’s Attendance.
     * 
     */
    @JsonProperty("attendance")
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public HighSchool withAttendance(String attendance) {
        this.attendance = attendance;
        return this;
    }

    /**
     * High School Education Level
     * <p>
     * Applicant’s High School Education Level.
     * 
     */
    @JsonProperty("educationLevel")
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * High School Education Level
     * <p>
     * Applicant’s High School Education Level.
     * 
     */
    @JsonProperty("educationLevel")
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public HighSchool withEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
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

    public HighSchool withAttendancePeriods(List<AttendancePeriod> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HighSchool.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("ceebCode");
        sb.append('=');
        sb.append(((this.ceebCode == null)?"<null>":this.ceebCode));
        sb.append(',');
        sb.append("cdsCode");
        sb.append('=');
        sb.append(((this.cdsCode == null)?"<null>":this.cdsCode));
        sb.append(',');
        sb.append("graduatedOn");
        sb.append('=');
        sb.append(((this.graduatedOn == null)?"<null>":this.graduatedOn));
        sb.append(',');
        sb.append("gpa");
        sb.append('=');
        sb.append(((this.gpa == null)?"<null>":this.gpa));
        sb.append(',');
        sb.append("attendance");
        sb.append('=');
        sb.append(((this.attendance == null)?"<null>":this.attendance));
        sb.append(',');
        sb.append("educationLevel");
        sb.append('=');
        sb.append(((this.educationLevel == null)?"<null>":this.educationLevel));
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
        result = ((result* 31)+((this.attendancePeriods == null)? 0 :this.attendancePeriods.hashCode()));
        result = ((result* 31)+((this.ceebCode == null)? 0 :this.ceebCode.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.graduatedOn == null)? 0 :this.graduatedOn.hashCode()));
        result = ((result* 31)+((this.educationLevel == null)? 0 :this.educationLevel.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.gpa == null)? 0 :this.gpa.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.cdsCode == null)? 0 :this.cdsCode.hashCode()));
        result = ((result* 31)+((this.attendance == null)? 0 :this.attendance.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HighSchool) == false) {
            return false;
        }
        HighSchool rhs = ((HighSchool) other);
        return (((((((((((this.attendancePeriods == rhs.attendancePeriods)||((this.attendancePeriods!= null)&&this.attendancePeriods.equals(rhs.attendancePeriods)))&&((this.ceebCode == rhs.ceebCode)||((this.ceebCode!= null)&&this.ceebCode.equals(rhs.ceebCode))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.graduatedOn == rhs.graduatedOn)||((this.graduatedOn!= null)&&this.graduatedOn.equals(rhs.graduatedOn))))&&((this.educationLevel == rhs.educationLevel)||((this.educationLevel!= null)&&this.educationLevel.equals(rhs.educationLevel))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.gpa == rhs.gpa)||((this.gpa!= null)&&this.gpa.equals(rhs.gpa))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.cdsCode == rhs.cdsCode)||((this.cdsCode!= null)&&this.cdsCode.equals(rhs.cdsCode))))&&((this.attendance == rhs.attendance)||((this.attendance!= null)&&this.attendance.equals(rhs.attendance))));
    }

}
