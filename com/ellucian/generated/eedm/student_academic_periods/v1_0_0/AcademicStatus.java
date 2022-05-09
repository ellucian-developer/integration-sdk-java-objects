
package com.ellucian.generated.eedm.student_academic_periods.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "basis",
    "academicLevel",
    "academicPeriodStatus"
})
@Generated("jsonschema2pojo")
public class AcademicStatus {

    /**
     * Basis
     * <p>
     * An indicator as to whether the academic status is established for the student overall or specific to a student's academic level.
     * (Required)
     * 
     */
    @JsonProperty("basis")
    @JsonPropertyDescription("An indicator as to whether the academic status is established for the student overall or specific to a student's academic level.")
    private BasisEnum basis;
    /**
     * Academic Level
     * <p>
     * The academic level associated with the academic period status.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level associated with the academic period status.")
    private Object academicLevel;
    /**
     * Academic Period Status
     * <p>
     * The student academic status for the period as established by the institution.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriodStatus")
    @JsonPropertyDescription("The student academic status for the period as established by the institution.")
    private AcademicPeriodStatus academicPeriodStatus;

    /**
     * Basis
     * <p>
     * An indicator as to whether the academic status is established for the student overall or specific to a student's academic level.
     * (Required)
     * 
     */
    @JsonProperty("basis")
    public BasisEnum getBasis() {
        return basis;
    }

    /**
     * Basis
     * <p>
     * An indicator as to whether the academic status is established for the student overall or specific to a student's academic level.
     * (Required)
     * 
     */
    @JsonProperty("basis")
    public void setBasis(BasisEnum basis) {
        this.basis = basis;
    }

    public AcademicStatus withBasis(BasisEnum basis) {
        this.basis = basis;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the academic period status.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the academic period status.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public AcademicStatus withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Academic Period Status
     * <p>
     * The student academic status for the period as established by the institution.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriodStatus")
    public AcademicPeriodStatus getAcademicPeriodStatus() {
        return academicPeriodStatus;
    }

    /**
     * Academic Period Status
     * <p>
     * The student academic status for the period as established by the institution.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriodStatus")
    public void setAcademicPeriodStatus(AcademicPeriodStatus academicPeriodStatus) {
        this.academicPeriodStatus = academicPeriodStatus;
    }

    public AcademicStatus withAcademicPeriodStatus(AcademicPeriodStatus academicPeriodStatus) {
        this.academicPeriodStatus = academicPeriodStatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("basis");
        sb.append('=');
        sb.append(((this.basis == null)?"<null>":this.basis));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("academicPeriodStatus");
        sb.append('=');
        sb.append(((this.academicPeriodStatus == null)?"<null>":this.academicPeriodStatus));
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
        result = ((result* 31)+((this.academicPeriodStatus == null)? 0 :this.academicPeriodStatus.hashCode()));
        result = ((result* 31)+((this.basis == null)? 0 :this.basis.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicStatus) == false) {
            return false;
        }
        AcademicStatus rhs = ((AcademicStatus) other);
        return ((((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel)))&&((this.academicPeriodStatus == rhs.academicPeriodStatus)||((this.academicPeriodStatus!= null)&&this.academicPeriodStatus.equals(rhs.academicPeriodStatus))))&&((this.basis == rhs.basis)||((this.basis!= null)&&this.basis.equals(rhs.basis))));
    }

}
