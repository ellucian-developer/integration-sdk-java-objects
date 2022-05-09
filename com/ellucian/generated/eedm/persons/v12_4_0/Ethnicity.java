
package com.ellucian.generated.eedm.persons.v12_4_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Ethnicity
 * <p>
 * The ethnicity association of the person.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ethnicGroup",
    "reporting"
})
@Generated("jsonschema2pojo")
public class Ethnicity {

    /**
     * Ethnic Group
     * <p>
     * The ethnic group with which the person identifies.
     * 
     */
    @JsonProperty("ethnicGroup")
    @JsonPropertyDescription("The ethnic group with which the person identifies.")
    private Object ethnicGroup;
    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    @JsonPropertyDescription("Properties required for governmental or other reporting.")
    private List<Reporting> reporting = new ArrayList<Reporting>();

    /**
     * Ethnic Group
     * <p>
     * The ethnic group with which the person identifies.
     * 
     */
    @JsonProperty("ethnicGroup")
    public Object getEthnicGroup() {
        return ethnicGroup;
    }

    /**
     * Ethnic Group
     * <p>
     * The ethnic group with which the person identifies.
     * 
     */
    @JsonProperty("ethnicGroup")
    public void setEthnicGroup(Object ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    public Ethnicity withEthnicGroup(Object ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
        return this;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public List<Reporting> getReporting() {
        return reporting;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public void setReporting(List<Reporting> reporting) {
        this.reporting = reporting;
    }

    public Ethnicity withReporting(List<Reporting> reporting) {
        this.reporting = reporting;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ethnicity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ethnicGroup");
        sb.append('=');
        sb.append(((this.ethnicGroup == null)?"<null>":this.ethnicGroup));
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
        result = ((result* 31)+((this.ethnicGroup == null)? 0 :this.ethnicGroup.hashCode()));
        result = ((result* 31)+((this.reporting == null)? 0 :this.reporting.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ethnicity) == false) {
            return false;
        }
        Ethnicity rhs = ((Ethnicity) other);
        return (((this.ethnicGroup == rhs.ethnicGroup)||((this.ethnicGroup!= null)&&this.ethnicGroup.equals(rhs.ethnicGroup)))&&((this.reporting == rhs.reporting)||((this.reporting!= null)&&this.reporting.equals(rhs.reporting))));
    }

}
