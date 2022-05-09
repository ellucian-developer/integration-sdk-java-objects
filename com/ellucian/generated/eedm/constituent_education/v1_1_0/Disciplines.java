
package com.ellucian.generated.eedm.constituent_education.v1_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Disciplines
 * <p>
 * The academic disciplines associated with the person's education at the institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "majors",
    "minors",
    "concentrations",
    "specializations"
})
@Generated("jsonschema2pojo")
public class Disciplines {

    /**
     * Majors
     * <p>
     * The major(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("majors")
    @JsonPropertyDescription("The major(s) associated with the person's education at the institution.")
    private List<Major> majors = new ArrayList<Major>();
    /**
     * Minors
     * <p>
     * The minor(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("minors")
    @JsonPropertyDescription("The minor(s) associated with the person's education at the institution.")
    private List<Minor> minors = new ArrayList<Minor>();
    /**
     * Concentrations
     * <p>
     * The concentration(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("concentrations")
    @JsonPropertyDescription("The concentration(s) associated with the person's education at the institution.")
    private List<Concentration> concentrations = new ArrayList<Concentration>();
    /**
     * Specializations
     * <p>
     * The specialization(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("specializations")
    @JsonPropertyDescription("The specialization(s) associated with the person's education at the institution.")
    private List<Specialization> specializations = new ArrayList<Specialization>();

    /**
     * Majors
     * <p>
     * The major(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("majors")
    public List<Major> getMajors() {
        return majors;
    }

    /**
     * Majors
     * <p>
     * The major(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("majors")
    public void setMajors(List<Major> majors) {
        this.majors = majors;
    }

    public Disciplines withMajors(List<Major> majors) {
        this.majors = majors;
        return this;
    }

    /**
     * Minors
     * <p>
     * The minor(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("minors")
    public List<Minor> getMinors() {
        return minors;
    }

    /**
     * Minors
     * <p>
     * The minor(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("minors")
    public void setMinors(List<Minor> minors) {
        this.minors = minors;
    }

    public Disciplines withMinors(List<Minor> minors) {
        this.minors = minors;
        return this;
    }

    /**
     * Concentrations
     * <p>
     * The concentration(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("concentrations")
    public List<Concentration> getConcentrations() {
        return concentrations;
    }

    /**
     * Concentrations
     * <p>
     * The concentration(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("concentrations")
    public void setConcentrations(List<Concentration> concentrations) {
        this.concentrations = concentrations;
    }

    public Disciplines withConcentrations(List<Concentration> concentrations) {
        this.concentrations = concentrations;
        return this;
    }

    /**
     * Specializations
     * <p>
     * The specialization(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("specializations")
    public List<Specialization> getSpecializations() {
        return specializations;
    }

    /**
     * Specializations
     * <p>
     * The specialization(s) associated with the person's education at the institution.
     * 
     */
    @JsonProperty("specializations")
    public void setSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
    }

    public Disciplines withSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Disciplines.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("majors");
        sb.append('=');
        sb.append(((this.majors == null)?"<null>":this.majors));
        sb.append(',');
        sb.append("minors");
        sb.append('=');
        sb.append(((this.minors == null)?"<null>":this.minors));
        sb.append(',');
        sb.append("concentrations");
        sb.append('=');
        sb.append(((this.concentrations == null)?"<null>":this.concentrations));
        sb.append(',');
        sb.append("specializations");
        sb.append('=');
        sb.append(((this.specializations == null)?"<null>":this.specializations));
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
        result = ((result* 31)+((this.majors == null)? 0 :this.majors.hashCode()));
        result = ((result* 31)+((this.concentrations == null)? 0 :this.concentrations.hashCode()));
        result = ((result* 31)+((this.specializations == null)? 0 :this.specializations.hashCode()));
        result = ((result* 31)+((this.minors == null)? 0 :this.minors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Disciplines) == false) {
            return false;
        }
        Disciplines rhs = ((Disciplines) other);
        return (((((this.majors == rhs.majors)||((this.majors!= null)&&this.majors.equals(rhs.majors)))&&((this.concentrations == rhs.concentrations)||((this.concentrations!= null)&&this.concentrations.equals(rhs.concentrations))))&&((this.specializations == rhs.specializations)||((this.specializations!= null)&&this.specializations.equals(rhs.specializations))))&&((this.minors == rhs.minors)||((this.minors!= null)&&this.minors.equals(rhs.minors))));
    }

}
