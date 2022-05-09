
package com.ellucian.generated.eedm.academic_programs.v10_0;

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
        result = ((result* 31)+((this.discipline == null)? 0 :this.discipline.hashCode()));
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
        return (((this.discipline == rhs.discipline)||((this.discipline!= null)&&this.discipline.equals(rhs.discipline)))&&((this.subdisciplines == rhs.subdisciplines)||((this.subdisciplines!= null)&&this.subdisciplines.equals(rhs.subdisciplines))));
    }

}
