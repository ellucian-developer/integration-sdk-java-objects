
package com.ellucian.generated.eedm.sections_maximum.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "title",
    "ownershipPercentage",
    "institutionUnit"
})
@Generated("jsonschema2pojo")
public class OwningInstitutionUnit {

    /**
     * Code
     * <p>
     * The code that identifies the unit
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that identifies the unit")
    private String code;
    /**
     * Title
     * <p>
     * The full name of the unit
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the unit")
    private String title;
    /**
     * Percent Ownership
     * <p>
     * The rate or proportion per hundred of ownership that is attributable to the unit
     * (Required)
     * 
     */
    @JsonProperty("ownershipPercentage")
    @JsonPropertyDescription("The rate or proportion per hundred of ownership that is attributable to the unit")
    private Double ownershipPercentage;
    /**
     * Institution Unit
     * <p>
     * The unit (department) primarily responsible for this section
     * (Required)
     * 
     */
    @JsonProperty("institutionUnit")
    @JsonPropertyDescription("The unit (department) primarily responsible for this section")
    private InstitutionUnit institutionUnit;

    /**
     * Code
     * <p>
     * The code that identifies the unit
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that identifies the unit
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public OwningInstitutionUnit withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the unit
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the unit
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public OwningInstitutionUnit withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Percent Ownership
     * <p>
     * The rate or proportion per hundred of ownership that is attributable to the unit
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
     * The rate or proportion per hundred of ownership that is attributable to the unit
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

    /**
     * Institution Unit
     * <p>
     * The unit (department) primarily responsible for this section
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
     * The unit (department) primarily responsible for this section
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OwningInstitutionUnit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("ownershipPercentage");
        sb.append('=');
        sb.append(((this.ownershipPercentage == null)?"<null>":this.ownershipPercentage));
        sb.append(',');
        sb.append("institutionUnit");
        sb.append('=');
        sb.append(((this.institutionUnit == null)?"<null>":this.institutionUnit));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
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
        return (((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.institutionUnit == rhs.institutionUnit)||((this.institutionUnit!= null)&&this.institutionUnit.equals(rhs.institutionUnit))))&&((this.ownershipPercentage == rhs.ownershipPercentage)||((this.ownershipPercentage!= null)&&this.ownershipPercentage.equals(rhs.ownershipPercentage))));
    }

}
