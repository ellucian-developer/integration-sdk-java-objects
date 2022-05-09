
package com.ellucian.generated.eedm.apply_prospects.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "institution"
})
@Generated("jsonschema2pojo")
public class HighSchool {

    /**
     * Institution
     * <p>
     * The educational institution where the prospect studied.
     * 
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("The educational institution where the prospect studied.")
    private Institution institution;

    /**
     * Institution
     * <p>
     * The educational institution where the prospect studied.
     * 
     */
    @JsonProperty("institution")
    public Institution getInstitution() {
        return institution;
    }

    /**
     * Institution
     * <p>
     * The educational institution where the prospect studied.
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public HighSchool withInstitution(Institution institution) {
        this.institution = institution;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HighSchool.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.institution == null)? 0 :this.institution.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HighSchool) == false) {
            return false;
        }
        HighSchool rhs = ((HighSchool) other);
        return ((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution)));
    }

}
