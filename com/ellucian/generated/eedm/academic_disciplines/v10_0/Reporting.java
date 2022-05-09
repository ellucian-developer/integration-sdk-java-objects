
package com.ellucian.generated.eedm.academic_disciplines.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "country"
})
@Generated("jsonschema2pojo")
public class Reporting {

    /**
     * Country
     * <p>
     * The country with specific reporting requirements.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country with specific reporting requirements.")
    private Object country;

    /**
     * Country
     * <p>
     * The country with specific reporting requirements.
     * 
     */
    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The country with specific reporting requirements.
     * 
     */
    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    public Reporting withCountry(Object country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reporting.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reporting) == false) {
            return false;
        }
        Reporting rhs = ((Reporting) other);
        return ((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)));
    }

}
