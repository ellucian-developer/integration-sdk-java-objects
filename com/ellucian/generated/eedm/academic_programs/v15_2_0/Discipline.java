
package com.ellucian.generated.eedm.academic_programs.v15_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "discipline",
    "startOn",
    "endOn",
    "administeringInstitutionUnit",
    "programConstraint",
    "administrativePeriodStart",
    "administrativePeriodEnd",
    "parentDiscipline",
    "subdisciplines"
})
@Generated("jsonschema2pojo")
public class Discipline {

    /**
     * Discipline
     * <p>
     * An academic discipline associated with the academic program.
     * (Required)
     * 
     */
    @JsonProperty("discipline")
    @JsonPropertyDescription("An academic discipline associated with the academic program.")
    private Discipline__1 discipline;
    /**
     * Start On
     * <p>
     * The start date of the discipline's relationship to the program.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the discipline's relationship to the program.")
    private String startOn;
    /**
     * End On
     * <p>
     * The end date of the discipline's relationship to the program.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the discipline's relationship to the program.")
    private Object endOn;
    /**
     * Administering Institution Unit
     * <p>
     * The institution unit that administers the discipline (major, minor, concentration), typically a department within a school or college.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    @JsonPropertyDescription("The institution unit that administers the discipline (major, minor, concentration), typically a department within a school or college.")
    private Object administeringInstitutionUnit;
    /**
     * Program Constraint
     * <p>
     * The state of the relationship of the discipline to the program within the given start and end dates. Required disciplines are part of the fundamental definition of the program and must be included for the program to be valid when the program is associated with a person.
     * 
     */
    @JsonProperty("programConstraint")
    @JsonPropertyDescription("The state of the relationship of the discipline to the program within the given start and end dates. Required disciplines are part of the fundamental definition of the program and must be included for the program to be valid when the program is associated with a person.")
    private Object programConstraint;
    /**
     * Administrative Period Start
     * <p>
     * The earliest administrative period the discipline can be applied to the program when associated with a student.
     * 
     */
    @JsonProperty("administrativePeriodStart")
    @JsonPropertyDescription("The earliest administrative period the discipline can be applied to the program when associated with a student.")
    private Object administrativePeriodStart;
    /**
     * Administrative Period End
     * <p>
     * The latest administrative period the discipline can be applied to the program when associated with a student.
     * 
     */
    @JsonProperty("administrativePeriodEnd")
    @JsonPropertyDescription("The latest administrative period the discipline can be applied to the program when associated with a student.")
    private Object administrativePeriodEnd;
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
     * Subdisciplines
     * <p>
     * A list of academic disciplines that are subordinate to the discipline.
     * 
     */
    @JsonProperty("subdisciplines")
    @JsonPropertyDescription("A list of academic disciplines that are subordinate to the discipline.")
    private List<Subdiscipline> subdisciplines = new ArrayList<Subdiscipline>();

    /**
     * Discipline
     * <p>
     * An academic discipline associated with the academic program.
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
     * An academic discipline associated with the academic program.
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
     * Start On
     * <p>
     * The start date of the discipline's relationship to the program.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date of the discipline's relationship to the program.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public Discipline withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the discipline's relationship to the program.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the discipline's relationship to the program.
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
     * Administering Institution Unit
     * <p>
     * The institution unit that administers the discipline (major, minor, concentration), typically a department within a school or college.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    public Object getAdministeringInstitutionUnit() {
        return administeringInstitutionUnit;
    }

    /**
     * Administering Institution Unit
     * <p>
     * The institution unit that administers the discipline (major, minor, concentration), typically a department within a school or college.
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
     * Program Constraint
     * <p>
     * The state of the relationship of the discipline to the program within the given start and end dates. Required disciplines are part of the fundamental definition of the program and must be included for the program to be valid when the program is associated with a person.
     * 
     */
    @JsonProperty("programConstraint")
    public Object getProgramConstraint() {
        return programConstraint;
    }

    /**
     * Program Constraint
     * <p>
     * The state of the relationship of the discipline to the program within the given start and end dates. Required disciplines are part of the fundamental definition of the program and must be included for the program to be valid when the program is associated with a person.
     * 
     */
    @JsonProperty("programConstraint")
    public void setProgramConstraint(Object programConstraint) {
        this.programConstraint = programConstraint;
    }

    public Discipline withProgramConstraint(Object programConstraint) {
        this.programConstraint = programConstraint;
        return this;
    }

    /**
     * Administrative Period Start
     * <p>
     * The earliest administrative period the discipline can be applied to the program when associated with a student.
     * 
     */
    @JsonProperty("administrativePeriodStart")
    public Object getAdministrativePeriodStart() {
        return administrativePeriodStart;
    }

    /**
     * Administrative Period Start
     * <p>
     * The earliest administrative period the discipline can be applied to the program when associated with a student.
     * 
     */
    @JsonProperty("administrativePeriodStart")
    public void setAdministrativePeriodStart(Object administrativePeriodStart) {
        this.administrativePeriodStart = administrativePeriodStart;
    }

    public Discipline withAdministrativePeriodStart(Object administrativePeriodStart) {
        this.administrativePeriodStart = administrativePeriodStart;
        return this;
    }

    /**
     * Administrative Period End
     * <p>
     * The latest administrative period the discipline can be applied to the program when associated with a student.
     * 
     */
    @JsonProperty("administrativePeriodEnd")
    public Object getAdministrativePeriodEnd() {
        return administrativePeriodEnd;
    }

    /**
     * Administrative Period End
     * <p>
     * The latest administrative period the discipline can be applied to the program when associated with a student.
     * 
     */
    @JsonProperty("administrativePeriodEnd")
    public void setAdministrativePeriodEnd(Object administrativePeriodEnd) {
        this.administrativePeriodEnd = administrativePeriodEnd;
    }

    public Discipline withAdministrativePeriodEnd(Object administrativePeriodEnd) {
        this.administrativePeriodEnd = administrativePeriodEnd;
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
     * Subdisciplines
     * <p>
     * A list of academic disciplines that are subordinate to the discipline.
     * 
     */
    @JsonProperty("subdisciplines")
    public List<Subdiscipline> getSubdisciplines() {
        return subdisciplines;
    }

    /**
     * Subdisciplines
     * <p>
     * A list of academic disciplines that are subordinate to the discipline.
     * 
     */
    @JsonProperty("subdisciplines")
    public void setSubdisciplines(List<Subdiscipline> subdisciplines) {
        this.subdisciplines = subdisciplines;
    }

    public Discipline withSubdisciplines(List<Subdiscipline> subdisciplines) {
        this.subdisciplines = subdisciplines;
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
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("administeringInstitutionUnit");
        sb.append('=');
        sb.append(((this.administeringInstitutionUnit == null)?"<null>":this.administeringInstitutionUnit));
        sb.append(',');
        sb.append("programConstraint");
        sb.append('=');
        sb.append(((this.programConstraint == null)?"<null>":this.programConstraint));
        sb.append(',');
        sb.append("administrativePeriodStart");
        sb.append('=');
        sb.append(((this.administrativePeriodStart == null)?"<null>":this.administrativePeriodStart));
        sb.append(',');
        sb.append("administrativePeriodEnd");
        sb.append('=');
        sb.append(((this.administrativePeriodEnd == null)?"<null>":this.administrativePeriodEnd));
        sb.append(',');
        sb.append("parentDiscipline");
        sb.append('=');
        sb.append(((this.parentDiscipline == null)?"<null>":this.parentDiscipline));
        sb.append(',');
        sb.append("subdisciplines");
        sb.append('=');
        sb.append(((this.subdisciplines == null)?"<null>":this.subdisciplines));
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
        result = ((result* 31)+((this.administeringInstitutionUnit == null)? 0 :this.administeringInstitutionUnit.hashCode()));
        result = ((result* 31)+((this.programConstraint == null)? 0 :this.programConstraint.hashCode()));
        result = ((result* 31)+((this.parentDiscipline == null)? 0 :this.parentDiscipline.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.discipline == null)? 0 :this.discipline.hashCode()));
        result = ((result* 31)+((this.administrativePeriodStart == null)? 0 :this.administrativePeriodStart.hashCode()));
        result = ((result* 31)+((this.administrativePeriodEnd == null)? 0 :this.administrativePeriodEnd.hashCode()));
        result = ((result* 31)+((this.subdisciplines == null)? 0 :this.subdisciplines.hashCode()));
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
        return ((((((((((this.administeringInstitutionUnit == rhs.administeringInstitutionUnit)||((this.administeringInstitutionUnit!= null)&&this.administeringInstitutionUnit.equals(rhs.administeringInstitutionUnit)))&&((this.programConstraint == rhs.programConstraint)||((this.programConstraint!= null)&&this.programConstraint.equals(rhs.programConstraint))))&&((this.parentDiscipline == rhs.parentDiscipline)||((this.parentDiscipline!= null)&&this.parentDiscipline.equals(rhs.parentDiscipline))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.discipline == rhs.discipline)||((this.discipline!= null)&&this.discipline.equals(rhs.discipline))))&&((this.administrativePeriodStart == rhs.administrativePeriodStart)||((this.administrativePeriodStart!= null)&&this.administrativePeriodStart.equals(rhs.administrativePeriodStart))))&&((this.administrativePeriodEnd == rhs.administrativePeriodEnd)||((this.administrativePeriodEnd!= null)&&this.administrativePeriodEnd.equals(rhs.administrativePeriodEnd))))&&((this.subdisciplines == rhs.subdisciplines)||((this.subdisciplines!= null)&&this.subdisciplines.equals(rhs.subdisciplines))));
    }

}
