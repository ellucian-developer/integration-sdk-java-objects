
package com.ellucian.generated.eedm.prospect_opportunities_submissions.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "discipline",
    "administeringInstitutionUnit",
    "startOn"
})
@Generated("jsonschema2pojo")
public class Discipline {

    /**
     * Discipline
     * <p>
     * The academic discipline associated with the academic program.
     * (Required)
     * 
     */
    @JsonProperty("discipline")
    @JsonPropertyDescription("The academic discipline associated with the academic program.")
    private Discipline__1 discipline;
    /**
     * Administering Institution Unit
     * <p>
     * The administering institution unit associated with the discipline.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    @JsonPropertyDescription("The administering institution unit associated with the discipline.")
    private Object administeringInstitutionUnit;
    /**
     * Start On
     * <p>
     * The start date of the program.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the program.")
    private Object startOn;

    /**
     * Discipline
     * <p>
     * The academic discipline associated with the academic program.
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
     * The academic discipline associated with the academic program.
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
     * The administering institution unit associated with the discipline.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    public Object getAdministeringInstitutionUnit() {
        return administeringInstitutionUnit;
    }

    /**
     * Administering Institution Unit
     * <p>
     * The administering institution unit associated with the discipline.
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
     * The start date of the program.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date of the program.
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
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.discipline == null)? 0 :this.discipline.hashCode()));
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
        return ((((this.administeringInstitutionUnit == rhs.administeringInstitutionUnit)||((this.administeringInstitutionUnit!= null)&&this.administeringInstitutionUnit.equals(rhs.administeringInstitutionUnit)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.discipline == rhs.discipline)||((this.discipline!= null)&&this.discipline.equals(rhs.discipline))));
    }

}
