
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Address
 * <p>
 * Contact address of the foundation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressLines",
    "city",
    "state",
    "country",
    "zipCode"
})
@Generated("jsonschema2pojo")
public class Address {

    /**
     * Address Lines
     * <p>
     * The address lines of the foundation's location, such as a street address, post office box number, etc.
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("The address lines of the foundation's location, such as a street address, post office box number, etc.")
    private List<String> addressLines = new ArrayList<String>();
    /**
     * City
     * <p>
     * The city of the foundation's location.
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city of the foundation's location.")
    private String city;
    /**
     * State
     * <p>
     * The state of the foundation's location.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The state of the foundation's location.")
    private String state;
    /**
     * Country
     * <p>
     * The country of the foundation's location.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country of the foundation's location.")
    private String country;
    /**
     * Zip Code
     * <p>
     * The zip code of the foundation's location.
     * 
     */
    @JsonProperty("zipCode")
    @JsonPropertyDescription("The zip code of the foundation's location.")
    private String zipCode;

    /**
     * Address Lines
     * <p>
     * The address lines of the foundation's location, such as a street address, post office box number, etc.
     * 
     */
    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the foundation's location, such as a street address, post office box number, etc.
     * 
     */
    @JsonProperty("addressLines")
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public Address withAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
        return this;
    }

    /**
     * City
     * <p>
     * The city of the foundation's location.
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * The city of the foundation's location.
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * State
     * <p>
     * The state of the foundation's location.
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * <p>
     * The state of the foundation's location.
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Address withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Country
     * <p>
     * The country of the foundation's location.
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The country of the foundation's location.
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Address withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Zip Code
     * <p>
     * The zip code of the foundation's location.
     * 
     */
    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Zip Code
     * <p>
     * The zip code of the foundation's location.
     * 
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Address withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressLines");
        sb.append('=');
        sb.append(((this.addressLines == null)?"<null>":this.addressLines));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
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
        result = ((result* 31)+((this.zipCode == null)? 0 :this.zipCode.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
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
        return ((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.zipCode == rhs.zipCode)||((this.zipCode!= null)&&this.zipCode.equals(rhs.zipCode))))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))));
    }

}
