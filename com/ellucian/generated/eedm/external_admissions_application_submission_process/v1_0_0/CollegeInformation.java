
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
    "cdsCode",
    "city",
    "state",
    "ceeb",
    "gpa",
    "totalCredit",
    "attendancePeriods",
    "degreeDate",
    "degreeObtained"
})
@Generated("jsonschema2pojo")
public class CollegeInformation {

    /**
     * College/University Name
     * <p>
     * Name of College/University.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of College/University.")
    private String name;
    /**
     * College/University CDS Code
     * <p>
     * CDS code of the College/University.
     * 
     */
    @JsonProperty("cdsCode")
    @JsonPropertyDescription("CDS code of the College/University.")
    private String cdsCode;
    /**
     * College/University State
     * <p>
     * City of College/University.
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City of College/University.")
    private String city;
    /**
     * College/University State
     * <p>
     * State of College/University.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("State of College/University.")
    private String state;
    /**
     * College/University CEEB Code
     * <p>
     * CEEB code of the College/University.
     * 
     */
    @JsonProperty("ceeb")
    @JsonPropertyDescription("CEEB code of the College/University.")
    private String ceeb;
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
     * Total Credit
     * <p>
     * Applicant’s total credit.
     * 
     */
    @JsonProperty("totalCredit")
    @JsonPropertyDescription("Applicant\u2019s total credit.")
    private String totalCredit;
    /**
     * Attendance Periods
     * <p>
     * 
     * 
     */
    @JsonProperty("attendancePeriods")
    @JsonPropertyDescription("")
    private List<AttendancePeriod__1> attendancePeriods = new ArrayList<AttendancePeriod__1>();
    /**
     * College/University Degree Date
     * <p>
     * The date the applicant was awarded the degree.
     * 
     */
    @JsonProperty("degreeDate")
    @JsonPropertyDescription("The date the applicant was awarded the degree.")
    private Object degreeDate;
    /**
     * College/University Degree Obtained
     * <p>
     * Indicates if the applicant obtained the degree.
     * 
     */
    @JsonProperty("degreeObtained")
    @JsonPropertyDescription("Indicates if the applicant obtained the degree.")
    private String degreeObtained;

    /**
     * College/University Name
     * <p>
     * Name of College/University.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * College/University Name
     * <p>
     * Name of College/University.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CollegeInformation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * College/University CDS Code
     * <p>
     * CDS code of the College/University.
     * 
     */
    @JsonProperty("cdsCode")
    public String getCdsCode() {
        return cdsCode;
    }

    /**
     * College/University CDS Code
     * <p>
     * CDS code of the College/University.
     * 
     */
    @JsonProperty("cdsCode")
    public void setCdsCode(String cdsCode) {
        this.cdsCode = cdsCode;
    }

    public CollegeInformation withCdsCode(String cdsCode) {
        this.cdsCode = cdsCode;
        return this;
    }

    /**
     * College/University State
     * <p>
     * City of College/University.
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * College/University State
     * <p>
     * City of College/University.
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public CollegeInformation withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * College/University State
     * <p>
     * State of College/University.
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * College/University State
     * <p>
     * State of College/University.
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public CollegeInformation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * College/University CEEB Code
     * <p>
     * CEEB code of the College/University.
     * 
     */
    @JsonProperty("ceeb")
    public String getCeeb() {
        return ceeb;
    }

    /**
     * College/University CEEB Code
     * <p>
     * CEEB code of the College/University.
     * 
     */
    @JsonProperty("ceeb")
    public void setCeeb(String ceeb) {
        this.ceeb = ceeb;
    }

    public CollegeInformation withCeeb(String ceeb) {
        this.ceeb = ceeb;
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

    public CollegeInformation withGpa(String gpa) {
        this.gpa = gpa;
        return this;
    }

    /**
     * Total Credit
     * <p>
     * Applicant’s total credit.
     * 
     */
    @JsonProperty("totalCredit")
    public String getTotalCredit() {
        return totalCredit;
    }

    /**
     * Total Credit
     * <p>
     * Applicant’s total credit.
     * 
     */
    @JsonProperty("totalCredit")
    public void setTotalCredit(String totalCredit) {
        this.totalCredit = totalCredit;
    }

    public CollegeInformation withTotalCredit(String totalCredit) {
        this.totalCredit = totalCredit;
        return this;
    }

    /**
     * Attendance Periods
     * <p>
     * 
     * 
     */
    @JsonProperty("attendancePeriods")
    public List<AttendancePeriod__1> getAttendancePeriods() {
        return attendancePeriods;
    }

    /**
     * Attendance Periods
     * <p>
     * 
     * 
     */
    @JsonProperty("attendancePeriods")
    public void setAttendancePeriods(List<AttendancePeriod__1> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
    }

    public CollegeInformation withAttendancePeriods(List<AttendancePeriod__1> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
        return this;
    }

    /**
     * College/University Degree Date
     * <p>
     * The date the applicant was awarded the degree.
     * 
     */
    @JsonProperty("degreeDate")
    public Object getDegreeDate() {
        return degreeDate;
    }

    /**
     * College/University Degree Date
     * <p>
     * The date the applicant was awarded the degree.
     * 
     */
    @JsonProperty("degreeDate")
    public void setDegreeDate(Object degreeDate) {
        this.degreeDate = degreeDate;
    }

    public CollegeInformation withDegreeDate(Object degreeDate) {
        this.degreeDate = degreeDate;
        return this;
    }

    /**
     * College/University Degree Obtained
     * <p>
     * Indicates if the applicant obtained the degree.
     * 
     */
    @JsonProperty("degreeObtained")
    public String getDegreeObtained() {
        return degreeObtained;
    }

    /**
     * College/University Degree Obtained
     * <p>
     * Indicates if the applicant obtained the degree.
     * 
     */
    @JsonProperty("degreeObtained")
    public void setDegreeObtained(String degreeObtained) {
        this.degreeObtained = degreeObtained;
    }

    public CollegeInformation withDegreeObtained(String degreeObtained) {
        this.degreeObtained = degreeObtained;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollegeInformation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("cdsCode");
        sb.append('=');
        sb.append(((this.cdsCode == null)?"<null>":this.cdsCode));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("ceeb");
        sb.append('=');
        sb.append(((this.ceeb == null)?"<null>":this.ceeb));
        sb.append(',');
        sb.append("gpa");
        sb.append('=');
        sb.append(((this.gpa == null)?"<null>":this.gpa));
        sb.append(',');
        sb.append("totalCredit");
        sb.append('=');
        sb.append(((this.totalCredit == null)?"<null>":this.totalCredit));
        sb.append(',');
        sb.append("attendancePeriods");
        sb.append('=');
        sb.append(((this.attendancePeriods == null)?"<null>":this.attendancePeriods));
        sb.append(',');
        sb.append("degreeDate");
        sb.append('=');
        sb.append(((this.degreeDate == null)?"<null>":this.degreeDate));
        sb.append(',');
        sb.append("degreeObtained");
        sb.append('=');
        sb.append(((this.degreeObtained == null)?"<null>":this.degreeObtained));
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
        result = ((result* 31)+((this.ceeb == null)? 0 :this.ceeb.hashCode()));
        result = ((result* 31)+((this.attendancePeriods == null)? 0 :this.attendancePeriods.hashCode()));
        result = ((result* 31)+((this.degreeDate == null)? 0 :this.degreeDate.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.totalCredit == null)? 0 :this.totalCredit.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.degreeObtained == null)? 0 :this.degreeObtained.hashCode()));
        result = ((result* 31)+((this.gpa == null)? 0 :this.gpa.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.cdsCode == null)? 0 :this.cdsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollegeInformation) == false) {
            return false;
        }
        CollegeInformation rhs = ((CollegeInformation) other);
        return (((((((((((this.ceeb == rhs.ceeb)||((this.ceeb!= null)&&this.ceeb.equals(rhs.ceeb)))&&((this.attendancePeriods == rhs.attendancePeriods)||((this.attendancePeriods!= null)&&this.attendancePeriods.equals(rhs.attendancePeriods))))&&((this.degreeDate == rhs.degreeDate)||((this.degreeDate!= null)&&this.degreeDate.equals(rhs.degreeDate))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.totalCredit == rhs.totalCredit)||((this.totalCredit!= null)&&this.totalCredit.equals(rhs.totalCredit))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.degreeObtained == rhs.degreeObtained)||((this.degreeObtained!= null)&&this.degreeObtained.equals(rhs.degreeObtained))))&&((this.gpa == rhs.gpa)||((this.gpa!= null)&&this.gpa.equals(rhs.gpa))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.cdsCode == rhs.cdsCode)||((this.cdsCode!= null)&&this.cdsCode.equals(rhs.cdsCode))));
    }

}
