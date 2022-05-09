
package com.ellucian.generated.eedm.educational_institution_units.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Parents
 * <p>
 * The parent institution and upper-level unit of the institution
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "institution",
    "unit"
})
@Generated("jsonschema2pojo")
public class Parents {

    /**
     * Institution
     * <p>
     * The institution which the unit is a part of
     * (Required)
     * 
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("The institution which the unit is a part of")
    private Institution institution;
    /**
     * Unit
     * <p>
     * The parent (upper-level) unit within the institution
     * 
     */
    @JsonProperty("unit")
    @JsonPropertyDescription("The parent (upper-level) unit within the institution")
    private Object unit;

    /**
     * Institution
     * <p>
     * The institution which the unit is a part of
     * (Required)
     * 
     */
    @JsonProperty("institution")
    public Institution getInstitution() {
        return institution;
    }

    /**
     * Institution
     * <p>
     * The institution which the unit is a part of
     * (Required)
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Parents withInstitution(Institution institution) {
        this.institution = institution;
        return this;
    }

    /**
     * Unit
     * <p>
     * The parent (upper-level) unit within the institution
     * 
     */
    @JsonProperty("unit")
    public Object getUnit() {
        return unit;
    }

    /**
     * Unit
     * <p>
     * The parent (upper-level) unit within the institution
     * 
     */
    @JsonProperty("unit")
    public void setUnit(Object unit) {
        this.unit = unit;
    }

    public Parents withUnit(Object unit) {
        this.unit = unit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Parents.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("institution");
        sb.append('=');
        sb.append(((this.institution == null)?"<null>":this.institution));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
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
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parents) == false) {
            return false;
        }
        Parents rhs = ((Parents) other);
        return (((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution)))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))));
    }

}
