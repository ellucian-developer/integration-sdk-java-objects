
package com.ellucian.generated.eedm.constituent_persons.v12_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "preference",
    "classYear",
    "institutionUnit",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class Affiliation {

    /**
     * Type
     * <p>
     * The type of the affiliation of the constituent to the institution.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the affiliation of the constituent to the institution.")
    private Type__3 type;
    /**
     * Preference
     * <p>
     * The preference of this affiliation over all others for this constituent.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("The preference of this affiliation over all others for this constituent.")
    private Object preference;
    /**
     * Class Year
     * <p>
     * The preferred class year for this affiliation.
     * 
     */
    @JsonProperty("classYear")
    @JsonPropertyDescription("The preferred class year for this affiliation.")
    private Object classYear;
    /**
     * Institution Unit
     * <p>
     * The preferred institution unit (e.g., a department of the educational institution) for this affiliation
     * 
     */
    @JsonProperty("institutionUnit")
    @JsonPropertyDescription("The preferred institution unit (e.g., a department of the educational institution) for this affiliation")
    private Object institutionUnit;
    /**
     * Start On
     * <p>
     * The first date when this affiliation is valid.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date when this affiliation is valid.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date when this affiliation is valid.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when this affiliation is valid.")
    private Object endOn;

    /**
     * Type
     * <p>
     * The type of the affiliation of the constituent to the institution.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__3 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the affiliation of the constituent to the institution.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__3 type) {
        this.type = type;
    }

    public Affiliation withType(Type__3 type) {
        this.type = type;
        return this;
    }

    /**
     * Preference
     * <p>
     * The preference of this affiliation over all others for this constituent.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preference
     * <p>
     * The preference of this affiliation over all others for this constituent.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Affiliation withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Class Year
     * <p>
     * The preferred class year for this affiliation.
     * 
     */
    @JsonProperty("classYear")
    public Object getClassYear() {
        return classYear;
    }

    /**
     * Class Year
     * <p>
     * The preferred class year for this affiliation.
     * 
     */
    @JsonProperty("classYear")
    public void setClassYear(Object classYear) {
        this.classYear = classYear;
    }

    public Affiliation withClassYear(Object classYear) {
        this.classYear = classYear;
        return this;
    }

    /**
     * Institution Unit
     * <p>
     * The preferred institution unit (e.g., a department of the educational institution) for this affiliation
     * 
     */
    @JsonProperty("institutionUnit")
    public Object getInstitutionUnit() {
        return institutionUnit;
    }

    /**
     * Institution Unit
     * <p>
     * The preferred institution unit (e.g., a department of the educational institution) for this affiliation
     * 
     */
    @JsonProperty("institutionUnit")
    public void setInstitutionUnit(Object institutionUnit) {
        this.institutionUnit = institutionUnit;
    }

    public Affiliation withInstitutionUnit(Object institutionUnit) {
        this.institutionUnit = institutionUnit;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date when this affiliation is valid.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date when this affiliation is valid.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Affiliation withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when this affiliation is valid.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when this affiliation is valid.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Affiliation withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Affiliation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("classYear");
        sb.append('=');
        sb.append(((this.classYear == null)?"<null>":this.classYear));
        sb.append(',');
        sb.append("institutionUnit");
        sb.append('=');
        sb.append(((this.institutionUnit == null)?"<null>":this.institutionUnit));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.classYear == null)? 0 :this.classYear.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Affiliation) == false) {
            return false;
        }
        Affiliation rhs = ((Affiliation) other);
        return (((((((this.institutionUnit == rhs.institutionUnit)||((this.institutionUnit!= null)&&this.institutionUnit.equals(rhs.institutionUnit)))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.classYear == rhs.classYear)||((this.classYear!= null)&&this.classYear.equals(rhs.classYear))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
