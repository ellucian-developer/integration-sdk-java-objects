
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
    "academicLoad"
})
@Generated("jsonschema2pojo")
public class AcademicLoad {

    /**
     * Basis
     * <p>
     * An indicator as to whether the academic load is established for the student overall or specific to a student's academic level.
     * (Required)
     * 
     */
    @JsonProperty("basis")
    @JsonPropertyDescription("An indicator as to whether the academic load is established for the student overall or specific to a student's academic level.")
    private BasisEnum basis;
    /**
     * Academic Level
     * <p>
     * The academic level associated with the academic load.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level associated with the academic load.")
    private Object academicLevel;
    /**
     * Academic Load
     * <p>
     * The student calculated academic load for the period.
     * (Required)
     * 
     */
    @JsonProperty("academicLoad")
    @JsonPropertyDescription("The student calculated academic load for the period.")
    private AcademicLoadEnum academicLoad;

    /**
     * Basis
     * <p>
     * An indicator as to whether the academic load is established for the student overall or specific to a student's academic level.
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
     * An indicator as to whether the academic load is established for the student overall or specific to a student's academic level.
     * (Required)
     * 
     */
    @JsonProperty("basis")
    public void setBasis(BasisEnum basis) {
        this.basis = basis;
    }

    public AcademicLoad withBasis(BasisEnum basis) {
        this.basis = basis;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the academic load.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level associated with the academic load.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public AcademicLoad withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Academic Load
     * <p>
     * The student calculated academic load for the period.
     * (Required)
     * 
     */
    @JsonProperty("academicLoad")
    public AcademicLoadEnum getAcademicLoad() {
        return academicLoad;
    }

    /**
     * Academic Load
     * <p>
     * The student calculated academic load for the period.
     * (Required)
     * 
     */
    @JsonProperty("academicLoad")
    public void setAcademicLoad(AcademicLoadEnum academicLoad) {
        this.academicLoad = academicLoad;
    }

    public AcademicLoad withAcademicLoad(AcademicLoadEnum academicLoad) {
        this.academicLoad = academicLoad;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicLoad.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("basis");
        sb.append('=');
        sb.append(((this.basis == null)?"<null>":this.basis));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("academicLoad");
        sb.append('=');
        sb.append(((this.academicLoad == null)?"<null>":this.academicLoad));
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
        result = ((result* 31)+((this.basis == null)? 0 :this.basis.hashCode()));
        result = ((result* 31)+((this.academicLoad == null)? 0 :this.academicLoad.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicLoad) == false) {
            return false;
        }
        AcademicLoad rhs = ((AcademicLoad) other);
        return ((((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel)))&&((this.basis == rhs.basis)||((this.basis!= null)&&this.basis.equals(rhs.basis))))&&((this.academicLoad == rhs.academicLoad)||((this.academicLoad!= null)&&this.academicLoad.equals(rhs.academicLoad))));
    }

}
