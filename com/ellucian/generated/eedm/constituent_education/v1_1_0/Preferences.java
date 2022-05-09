
package com.ellucian.generated.eedm.constituent_education.v1_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Preferences
 * <p>
 * Indicates the preferences of the education over all other education for the person.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "constituent",
    "institution"
})
@Generated("jsonschema2pojo")
public class Preferences {

    /**
     * Constituent
     * <p>
     * Indicates that the constituent prefers this education over all other education for the person.
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("Indicates that the constituent prefers this education over all other education for the person.")
    private Object constituent;
    /**
     * Institution
     * <p>
     * Indicates the institution prefers this education over all other education for the person.
     * 
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("Indicates the institution prefers this education over all other education for the person.")
    private Object institution;

    /**
     * Constituent
     * <p>
     * Indicates that the constituent prefers this education over all other education for the person.
     * 
     */
    @JsonProperty("constituent")
    public Object getConstituent() {
        return constituent;
    }

    /**
     * Constituent
     * <p>
     * Indicates that the constituent prefers this education over all other education for the person.
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public Preferences withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    /**
     * Institution
     * <p>
     * Indicates the institution prefers this education over all other education for the person.
     * 
     */
    @JsonProperty("institution")
    public Object getInstitution() {
        return institution;
    }

    /**
     * Institution
     * <p>
     * Indicates the institution prefers this education over all other education for the person.
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(Object institution) {
        this.institution = institution;
    }

    public Preferences withInstitution(Object institution) {
        this.institution = institution;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Preferences.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
        sb.append(',');
        sb.append("institution");
        sb.append('=');
        sb.append(((this.institution == null)?"<null>":this.institution));
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
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        result = ((result* 31)+((this.institution == null)? 0 :this.institution.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Preferences) == false) {
            return false;
        }
        Preferences rhs = ((Preferences) other);
        return (((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent)))&&((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution))));
    }

}
