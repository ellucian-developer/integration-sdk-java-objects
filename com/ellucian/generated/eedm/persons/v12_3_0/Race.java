
package com.ellucian.generated.eedm.persons.v12_3_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "race",
    "reporting"
})
@Generated("jsonschema2pojo")
public class Race {

    /**
     * Race
     * <p>
     * The race to which a person belongs.
     * 
     */
    @JsonProperty("race")
    @JsonPropertyDescription("The race to which a person belongs.")
    private Object race;
    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    @JsonPropertyDescription("Properties required for governmental or other reporting.")
    private List<Reporting__1> reporting = new ArrayList<Reporting__1>();

    /**
     * Race
     * <p>
     * The race to which a person belongs.
     * 
     */
    @JsonProperty("race")
    public Object getRace() {
        return race;
    }

    /**
     * Race
     * <p>
     * The race to which a person belongs.
     * 
     */
    @JsonProperty("race")
    public void setRace(Object race) {
        this.race = race;
    }

    public Race withRace(Object race) {
        this.race = race;
        return this;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public List<Reporting__1> getReporting() {
        return reporting;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public void setReporting(List<Reporting__1> reporting) {
        this.reporting = reporting;
    }

    public Race withReporting(List<Reporting__1> reporting) {
        this.reporting = reporting;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Race.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("race");
        sb.append('=');
        sb.append(((this.race == null)?"<null>":this.race));
        sb.append(',');
        sb.append("reporting");
        sb.append('=');
        sb.append(((this.reporting == null)?"<null>":this.reporting));
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
        result = ((result* 31)+((this.race == null)? 0 :this.race.hashCode()));
        result = ((result* 31)+((this.reporting == null)? 0 :this.reporting.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Race) == false) {
            return false;
        }
        Race rhs = ((Race) other);
        return (((this.race == rhs.race)||((this.race!= null)&&this.race.equals(rhs.race)))&&((this.reporting == rhs.reporting)||((this.reporting!= null)&&this.reporting.equals(rhs.reporting))));
    }

}
