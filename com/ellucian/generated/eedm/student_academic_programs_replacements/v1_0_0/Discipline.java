
package com.ellucian.generated.eedm.student_academic_programs_replacements.v1_0_0;

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
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.discipline == null)? 0 :this.discipline.hashCode()));
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
        return (((((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.discipline == rhs.discipline)||((this.discipline!= null)&&this.discipline.equals(rhs.discipline))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
