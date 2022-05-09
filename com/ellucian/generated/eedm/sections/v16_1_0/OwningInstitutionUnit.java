
package com.ellucian.generated.eedm.sections.v16_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "institutionUnit",
    "ownershipPercentage"
})
@Generated("jsonschema2pojo")
public class OwningInstitutionUnit {

    /**
     * Institution Unit
     * <p>
     * A unit (department) of the educational institution
     * (Required)
     * 
     */
    @JsonProperty("institutionUnit")
    @JsonPropertyDescription("A unit (department) of the educational institution")
    private InstitutionUnit institutionUnit;
    /**
     * Percent Ownership
     * <p>
     * The rate or proportion per hundred of ownership that is attributable to the organization.
     * (Required)
     * 
     */
    @JsonProperty("ownershipPercentage")
    @JsonPropertyDescription("The rate or proportion per hundred of ownership that is attributable to the organization.")
    private Double ownershipPercentage;

    /**
     * Institution Unit
     * <p>
     * A unit (department) of the educational institution
     * (Required)
     * 
     */
    @JsonProperty("institutionUnit")
    public InstitutionUnit getInstitutionUnit() {
        return institutionUnit;
    }

    /**
     * Institution Unit
     * <p>
     * A unit (department) of the educational institution
     * (Required)
     * 
     */
    @JsonProperty("institutionUnit")
    public void setInstitutionUnit(InstitutionUnit institutionUnit) {
        this.institutionUnit = institutionUnit;
    }

    public OwningInstitutionUnit withInstitutionUnit(InstitutionUnit institutionUnit) {
        this.institutionUnit = institutionUnit;
        return this;
    }

    /**
     * Percent Ownership
     * <p>
     * The rate or proportion per hundred of ownership that is attributable to the organization.
     * (Required)
     * 
     */
    @JsonProperty("ownershipPercentage")
    public Double getOwnershipPercentage() {
        return ownershipPercentage;
    }

    /**
     * Percent Ownership
     * <p>
     * The rate or proportion per hundred of ownership that is attributable to the organization.
     * (Required)
     * 
     */
    @JsonProperty("ownershipPercentage")
    public void setOwnershipPercentage(Double ownershipPercentage) {
        this.ownershipPercentage = ownershipPercentage;
    }

    public OwningInstitutionUnit withOwnershipPercentage(Double ownershipPercentage) {
        this.ownershipPercentage = ownershipPercentage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OwningInstitutionUnit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("institutionUnit");
        sb.append('=');
        sb.append(((this.institutionUnit == null)?"<null>":this.institutionUnit));
        sb.append(',');
        sb.append("ownershipPercentage");
        sb.append('=');
        sb.append(((this.ownershipPercentage == null)?"<null>":this.ownershipPercentage));
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
        result = ((result* 31)+((this.institutionUnit == null)? 0 :this.institutionUnit.hashCode()));
        result = ((result* 31)+((this.ownershipPercentage == null)? 0 :this.ownershipPercentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OwningInstitutionUnit) == false) {
            return false;
        }
        OwningInstitutionUnit rhs = ((OwningInstitutionUnit) other);
        return (((this.institutionUnit == rhs.institutionUnit)||((this.institutionUnit!= null)&&this.institutionUnit.equals(rhs.institutionUnit)))&&((this.ownershipPercentage == rhs.ownershipPercentage)||((this.ownershipPercentage!= null)&&this.ownershipPercentage.equals(rhs.ownershipPercentage))));
    }

}
