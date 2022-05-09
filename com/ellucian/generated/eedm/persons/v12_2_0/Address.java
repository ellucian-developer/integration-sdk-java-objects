
package com.ellucian.generated.eedm.persons.v12_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "type",
    "startOn",
    "endOn",
    "preference",
    "seasonalOccupancies"
})
@Generated("jsonschema2pojo")
public class Address {

    /**
     * Address
     * <p>
     * The associated physical address.
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The associated physical address.")
    private Object address;
    /**
     * Type
     * <p>
     * A type of address for a person. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of address for a person. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.")
    private Type__1 type;
    /**
     * Start On
     * <p>
     * The earliest date that this address was valid for the person.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The earliest date that this address was valid for the person.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The latest date when this address was valid for the person.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The latest date when this address was valid for the person.")
    private Object endOn;
    /**
     * Preferred Address
     * <p>
     * Specifies if the address is preferred over others of the same type. Only one address should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Specifies if the address is preferred over others of the same type. Only one address should be set to primary for a person.")
    private Object preference;
    /**
     * Seasonal Occupancies
     * <p>
     * Seasons during the year when the location is typically occupied, expressed as repeating time periods.
     * 
     */
    @JsonProperty("seasonalOccupancies")
    @JsonPropertyDescription("Seasons during the year when the location is typically occupied, expressed as repeating time periods.")
    private List<SeasonalOccupancy> seasonalOccupancies = new ArrayList<SeasonalOccupancy>();

    /**
     * Address
     * <p>
     * The associated physical address.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Object getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The associated physical address.
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Object address) {
        this.address = address;
    }

    public Address withAddress(Object address) {
        this.address = address;
        return this;
    }

    /**
     * Type
     * <p>
     * A type of address for a person. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__1 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of address for a person. Includes a standard type (e.g. 'home', 'school') and an optional, custom type to further identify the type of address.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__1 type) {
        this.type = type;
    }

    public Address withType(Type__1 type) {
        this.type = type;
        return this;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this address was valid for the person.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this address was valid for the person.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Address withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The latest date when this address was valid for the person.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The latest date when this address was valid for the person.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Address withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Preferred Address
     * <p>
     * Specifies if the address is preferred over others of the same type. Only one address should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preferred Address
     * <p>
     * Specifies if the address is preferred over others of the same type. Only one address should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Address withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Seasonal Occupancies
     * <p>
     * Seasons during the year when the location is typically occupied, expressed as repeating time periods.
     * 
     */
    @JsonProperty("seasonalOccupancies")
    public List<SeasonalOccupancy> getSeasonalOccupancies() {
        return seasonalOccupancies;
    }

    /**
     * Seasonal Occupancies
     * <p>
     * Seasons during the year when the location is typically occupied, expressed as repeating time periods.
     * 
     */
    @JsonProperty("seasonalOccupancies")
    public void setSeasonalOccupancies(List<SeasonalOccupancy> seasonalOccupancies) {
        this.seasonalOccupancies = seasonalOccupancies;
    }

    public Address withSeasonalOccupancies(List<SeasonalOccupancy> seasonalOccupancies) {
        this.seasonalOccupancies = seasonalOccupancies;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("seasonalOccupancies");
        sb.append('=');
        sb.append(((this.seasonalOccupancies == null)?"<null>":this.seasonalOccupancies));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.seasonalOccupancies == null)? 0 :this.seasonalOccupancies.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return (((((((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.seasonalOccupancies == rhs.seasonalOccupancies)||((this.seasonalOccupancies!= null)&&this.seasonalOccupancies.equals(rhs.seasonalOccupancies))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
