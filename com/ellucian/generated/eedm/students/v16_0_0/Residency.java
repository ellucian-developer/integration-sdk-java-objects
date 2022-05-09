
package com.ellucian.generated.eedm.students.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "residency",
    "startOn",
    "administrativePeriod"
})
@Generated("jsonschema2pojo")
public class Residency {

    /**
     * Residency
     * <p>
     * The residency type associated with the student.
     * (Required)
     * 
     */
    @JsonProperty("residency")
    @JsonPropertyDescription("The residency type associated with the student.")
    private Residency__1 residency;
    /**
     * Start On
     * <p>
     * The date the residency became effective.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date the residency became effective.")
    private Object startOn;
    /**
     * Administrative Period
     * <p>
     * The starting administrative period associated with the residency.
     * 
     */
    @JsonProperty("administrativePeriod")
    @JsonPropertyDescription("The starting administrative period associated with the residency.")
    private Object administrativePeriod;

    /**
     * Residency
     * <p>
     * The residency type associated with the student.
     * (Required)
     * 
     */
    @JsonProperty("residency")
    public Residency__1 getResidency() {
        return residency;
    }

    /**
     * Residency
     * <p>
     * The residency type associated with the student.
     * (Required)
     * 
     */
    @JsonProperty("residency")
    public void setResidency(Residency__1 residency) {
        this.residency = residency;
    }

    public Residency withResidency(Residency__1 residency) {
        this.residency = residency;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date the residency became effective.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date the residency became effective.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Residency withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * Administrative Period
     * <p>
     * The starting administrative period associated with the residency.
     * 
     */
    @JsonProperty("administrativePeriod")
    public Object getAdministrativePeriod() {
        return administrativePeriod;
    }

    /**
     * Administrative Period
     * <p>
     * The starting administrative period associated with the residency.
     * 
     */
    @JsonProperty("administrativePeriod")
    public void setAdministrativePeriod(Object administrativePeriod) {
        this.administrativePeriod = administrativePeriod;
    }

    public Residency withAdministrativePeriod(Object administrativePeriod) {
        this.administrativePeriod = administrativePeriod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Residency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("residency");
        sb.append('=');
        sb.append(((this.residency == null)?"<null>":this.residency));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("administrativePeriod");
        sb.append('=');
        sb.append(((this.administrativePeriod == null)?"<null>":this.administrativePeriod));
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
        result = ((result* 31)+((this.residency == null)? 0 :this.residency.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.administrativePeriod == null)? 0 :this.administrativePeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Residency) == false) {
            return false;
        }
        Residency rhs = ((Residency) other);
        return ((((this.residency == rhs.residency)||((this.residency!= null)&&this.residency.equals(rhs.residency)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.administrativePeriod == rhs.administrativePeriod)||((this.administrativePeriod!= null)&&this.administrativePeriod.equals(rhs.administrativePeriod))));
    }

}
