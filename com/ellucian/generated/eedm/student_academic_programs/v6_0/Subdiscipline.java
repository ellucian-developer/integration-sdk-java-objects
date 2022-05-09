
package com.ellucian.generated.eedm.student_academic_programs.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subdiscipline",
    "administeringInstitutionUnit"
})
@Generated("jsonschema2pojo")
public class Subdiscipline {

    /**
     * Subdiscipline
     * <p>
     * An academic disciplines that is subordinate to the discipline.
     * (Required)
     * 
     */
    @JsonProperty("subdiscipline")
    @JsonPropertyDescription("An academic disciplines that is subordinate to the discipline.")
    private Subdiscipline__1 subdiscipline;
    /**
     * Administering Institution Unit
     * <p>
     * The institutional unit that administers the sub-discipline (i.e concentration), typically a department within a school or college.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    @JsonPropertyDescription("The institutional unit that administers the sub-discipline (i.e concentration), typically a department within a school or college.")
    private Object administeringInstitutionUnit;

    /**
     * Subdiscipline
     * <p>
     * An academic disciplines that is subordinate to the discipline.
     * (Required)
     * 
     */
    @JsonProperty("subdiscipline")
    public Subdiscipline__1 getSubdiscipline() {
        return subdiscipline;
    }

    /**
     * Subdiscipline
     * <p>
     * An academic disciplines that is subordinate to the discipline.
     * (Required)
     * 
     */
    @JsonProperty("subdiscipline")
    public void setSubdiscipline(Subdiscipline__1 subdiscipline) {
        this.subdiscipline = subdiscipline;
    }

    public Subdiscipline withSubdiscipline(Subdiscipline__1 subdiscipline) {
        this.subdiscipline = subdiscipline;
        return this;
    }

    /**
     * Administering Institution Unit
     * <p>
     * The institutional unit that administers the sub-discipline (i.e concentration), typically a department within a school or college.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    public Object getAdministeringInstitutionUnit() {
        return administeringInstitutionUnit;
    }

    /**
     * Administering Institution Unit
     * <p>
     * The institutional unit that administers the sub-discipline (i.e concentration), typically a department within a school or college.
     * 
     */
    @JsonProperty("administeringInstitutionUnit")
    public void setAdministeringInstitutionUnit(Object administeringInstitutionUnit) {
        this.administeringInstitutionUnit = administeringInstitutionUnit;
    }

    public Subdiscipline withAdministeringInstitutionUnit(Object administeringInstitutionUnit) {
        this.administeringInstitutionUnit = administeringInstitutionUnit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Subdiscipline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("subdiscipline");
        sb.append('=');
        sb.append(((this.subdiscipline == null)?"<null>":this.subdiscipline));
        sb.append(',');
        sb.append("administeringInstitutionUnit");
        sb.append('=');
        sb.append(((this.administeringInstitutionUnit == null)?"<null>":this.administeringInstitutionUnit));
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
        result = ((result* 31)+((this.subdiscipline == null)? 0 :this.subdiscipline.hashCode()));
        result = ((result* 31)+((this.administeringInstitutionUnit == null)? 0 :this.administeringInstitutionUnit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subdiscipline) == false) {
            return false;
        }
        Subdiscipline rhs = ((Subdiscipline) other);
        return (((this.subdiscipline == rhs.subdiscipline)||((this.subdiscipline!= null)&&this.subdiscipline.equals(rhs.subdiscipline)))&&((this.administeringInstitutionUnit == rhs.administeringInstitutionUnit)||((this.administeringInstitutionUnit!= null)&&this.administeringInstitutionUnit.equals(rhs.administeringInstitutionUnit))));
    }

}
