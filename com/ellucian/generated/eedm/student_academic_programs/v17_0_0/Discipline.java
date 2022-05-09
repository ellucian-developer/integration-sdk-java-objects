
package com.ellucian.generated.eedm.student_academic_programs.v17_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "discipline",
    "administeringInstitutionUnit",
    "startOn",
    "endOn",
    "overrideStartOn",
    "overrideEndOn",
    "parentDiscipline",
    "status"
})
@Generated("jsonschema2pojo")
public class Discipline {

    /**
     * Discipline
     * <p>
     * An academic discipline associated with an academic program.
     * (Required)
     * 
     */
    @JsonProperty("discipline")
    @JsonPropertyDescription("An academic discipline associated with an academic program.")
    private Discipline__1 discipline;
    /**
     * Administering Institution Unit
     * <p>
     * The institutional unit that administers the discipline (major, minor, concentration), typically a department within a school or college.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    @JsonPropertyDescription("The institutional unit that administers the discipline (major, minor, concentration), typically a department within a school or college.")
    private Object administeringInstitutionUnit;
    /**
     * Start On
     * <p>
     * The date on which the discipline begins for the student academic program.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date on which the discipline begins for the student academic program.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The date on which the discipline ends for the student academic program.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date on which the discipline ends for the student academic program.")
    private Object endOn;
    /**
     * Override Start On
     * <p>
     * The starting date of the discipline to be used for reporting.
     * 
     */
    @JsonProperty("overrideStartOn")
    @JsonPropertyDescription("The starting date of the discipline to be used for reporting.")
    private Object overrideStartOn;
    /**
     * Override End On
     * <p>
     * The ending date of the discipline to be used for reporting.
     * 
     */
    @JsonProperty("overrideEndOn")
    @JsonPropertyDescription("The ending date of the discipline to be used for reporting.")
    private Object overrideEndOn;
    /**
     * Parent Discipline
     * <p>
     * The academic discipline that is one level higher in the discipline hierarchy.
     * 
     */
    @JsonProperty("parentDiscipline")
    @JsonPropertyDescription("The academic discipline that is one level higher in the discipline hierarchy.")
    private Object parentDiscipline;
    /**
     * Status
     * <p>
     * The state of a student's discipline within a program.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The state of a student's discipline within a program.")
    private Object status;

    /**
     * Discipline
     * <p>
     * An academic discipline associated with an academic program.
     * (Required)
     * 
     */
    @JsonProperty("discipline")
    public Discipline__1 getDiscipline() {
        return discipline;
    }

    /**
     * Discipline
     * <p>
     * An academic discipline associated with an academic program.
     * (Required)
     * 
     */
    @JsonProperty("discipline")
    public void setDiscipline(Discipline__1 discipline) {
        this.discipline = discipline;
    }

    public Discipline withDiscipline(Discipline__1 discipline) {
        this.discipline = discipline;
        return this;
    }

    /**
     * Administering Institution Unit
     * <p>
     * The institutional unit that administers the discipline (major, minor, concentration), typically a department within a school or college.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    public Object getAdministeringInstitutionUnit() {
        return administeringInstitutionUnit;
    }

    /**
     * Administering Institution Unit
     * <p>
     * The institutional unit that administers the discipline (major, minor, concentration), typically a department within a school or college.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    public void setAdministeringInstitutionUnit(Object administeringInstitutionUnit) {
        this.administeringInstitutionUnit = administeringInstitutionUnit;
    }

    public Discipline withAdministeringInstitutionUnit(Object administeringInstitutionUnit) {
        this.administeringInstitutionUnit = administeringInstitutionUnit;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date on which the discipline begins for the student academic program.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date on which the discipline begins for the student academic program.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Discipline withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date on which the discipline ends for the student academic program.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date on which the discipline ends for the student academic program.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Discipline withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Override Start On
     * <p>
     * The starting date of the discipline to be used for reporting.
     * 
     */
    @JsonProperty("overrideStartOn")
    public Object getOverrideStartOn() {
        return overrideStartOn;
    }

    /**
     * Override Start On
     * <p>
     * The starting date of the discipline to be used for reporting.
     * 
     */
    @JsonProperty("overrideStartOn")
    public void setOverrideStartOn(Object overrideStartOn) {
        this.overrideStartOn = overrideStartOn;
    }

    public Discipline withOverrideStartOn(Object overrideStartOn) {
        this.overrideStartOn = overrideStartOn;
        return this;
    }

    /**
     * Override End On
     * <p>
     * The ending date of the discipline to be used for reporting.
     * 
     */
    @JsonProperty("overrideEndOn")
    public Object getOverrideEndOn() {
        return overrideEndOn;
    }

    /**
     * Override End On
     * <p>
     * The ending date of the discipline to be used for reporting.
     * 
     */
    @JsonProperty("overrideEndOn")
    public void setOverrideEndOn(Object overrideEndOn) {
        this.overrideEndOn = overrideEndOn;
    }

    public Discipline withOverrideEndOn(Object overrideEndOn) {
        this.overrideEndOn = overrideEndOn;
        return this;
    }

    /**
     * Parent Discipline
     * <p>
     * The academic discipline that is one level higher in the discipline hierarchy.
     * 
     */
    @JsonProperty("parentDiscipline")
    public Object getParentDiscipline() {
        return parentDiscipline;
    }

    /**
     * Parent Discipline
     * <p>
     * The academic discipline that is one level higher in the discipline hierarchy.
     * 
     */
    @JsonProperty("parentDiscipline")
    public void setParentDiscipline(Object parentDiscipline) {
        this.parentDiscipline = parentDiscipline;
    }

    public Discipline withParentDiscipline(Object parentDiscipline) {
        this.parentDiscipline = parentDiscipline;
        return this;
    }

    /**
     * Status
     * <p>
     * The state of a student's discipline within a program.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The state of a student's discipline within a program.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public Discipline withStatus(Object status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Discipline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("discipline");
        sb.append('=');
        sb.append(((this.discipline == null)?"<null>":this.discipline));
        sb.append(',');
        sb.append("administeringInstitutionUnit");
        sb.append('=');
        sb.append(((this.administeringInstitutionUnit == null)?"<null>":this.administeringInstitutionUnit));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("overrideStartOn");
        sb.append('=');
        sb.append(((this.overrideStartOn == null)?"<null>":this.overrideStartOn));
        sb.append(',');
        sb.append("overrideEndOn");
        sb.append('=');
        sb.append(((this.overrideEndOn == null)?"<null>":this.overrideEndOn));
        sb.append(',');
        sb.append("parentDiscipline");
        sb.append('=');
        sb.append(((this.parentDiscipline == null)?"<null>":this.parentDiscipline));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.overrideEndOn == null)? 0 :this.overrideEndOn.hashCode()));
        result = ((result* 31)+((this.administeringInstitutionUnit == null)? 0 :this.administeringInstitutionUnit.hashCode()));
        result = ((result* 31)+((this.parentDiscipline == null)? 0 :this.parentDiscipline.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.discipline == null)? 0 :this.discipline.hashCode()));
        result = ((result* 31)+((this.overrideStartOn == null)? 0 :this.overrideStartOn.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Discipline) == false) {
            return false;
        }
        Discipline rhs = ((Discipline) other);
        return (((((((((this.overrideEndOn == rhs.overrideEndOn)||((this.overrideEndOn!= null)&&this.overrideEndOn.equals(rhs.overrideEndOn)))&&((this.administeringInstitutionUnit == rhs.administeringInstitutionUnit)||((this.administeringInstitutionUnit!= null)&&this.administeringInstitutionUnit.equals(rhs.administeringInstitutionUnit))))&&((this.parentDiscipline == rhs.parentDiscipline)||((this.parentDiscipline!= null)&&this.parentDiscipline.equals(rhs.parentDiscipline))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.discipline == rhs.discipline)||((this.discipline!= null)&&this.discipline.equals(rhs.discipline))))&&((this.overrideStartOn == rhs.overrideStartOn)||((this.overrideStartOn!= null)&&this.overrideStartOn.equals(rhs.overrideStartOn))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
