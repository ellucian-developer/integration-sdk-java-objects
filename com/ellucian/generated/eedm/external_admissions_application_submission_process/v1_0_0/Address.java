
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "city",
    "county",
    "postalCode",
    "state",
    "country"
})
@Generated("jsonschema2pojo")
public class Address {

    /**
     * Type
     * <p>
     * The type of address
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of address")
    private String type;
    /**
     * Address Line1
     * <p>
     * The first line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine1")
    @JsonPropertyDescription("The first line of an applicant's address.")
    private String addressLine1;
    /**
     * Address Line2
     * <p>
     * The second line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine2")
    @JsonPropertyDescription("The second line of an applicant's address.")
    private String addressLine2;
    /**
     * Address Line3
     * <p>
     * The third line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine3")
    @JsonPropertyDescription("The third line of an applicant's address.")
    private String addressLine3;
    /**
     * Address Line4
     * <p>
     * The fourth line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine4")
    @JsonPropertyDescription("The fourth line of an applicant's address.")
    private String addressLine4;
    /**
     * City
     * <p>
     * The city of an applicant's address.
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city of an applicant's address.")
    private String city;
    /**
     * County
     * <p>
     * The county of an applicant's address.
     * 
     */
    @JsonProperty("county")
    @JsonPropertyDescription("The county of an applicant's address.")
    private String county;
    /**
     * Postal Code
     * <p>
     * The postal code of the address.
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("The postal code of the address.")
    private String postalCode;
    /**
     * State
     * <p>
     * The state of the address.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The state of the address.")
    private String state;
    /**
     * Country
     * <p>
     * The country of the address.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country of the address.")
    private String country;

    /**
     * Type
     * <p>
     * The type of address
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of address
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Address withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Address Line1
     * <p>
     * The first line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Address Line1
     * <p>
     * The first line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Address withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Address Line2
     * <p>
     * The second line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Address Line2
     * <p>
     * The second line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Address withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Address Line3
     * <p>
     * The third line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine3")
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Address Line3
     * <p>
     * The third line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public Address withAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * Address Line4
     * <p>
     * The fourth line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine4")
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Address Line4
     * <p>
     * The fourth line of an applicant's address.
     * 
     */
    @JsonProperty("addressLine4")
    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public Address withAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
        return this;
    }

    /**
     * City
     * <p>
     * The city of an applicant's address.
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * The city of an applicant's address.
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
     * County
     * <p>
     * The county of an applicant's address.
     * 
     */
    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    /**
     * County
     * <p>
     * The county of an applicant's address.
     * 
     */
    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    public Address withCounty(String county) {
        this.county = county;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The postal code of the address.
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * The postal code of the address.
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * State
     * <p>
     * The state of the address.
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * <p>
     * The state of the address.
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
     * The country of the address.
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The country of the address.
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("addressLine1");
        sb.append('=');
        sb.append(((this.addressLine1 == null)?"<null>":this.addressLine1));
        sb.append(',');
        sb.append("addressLine2");
        sb.append('=');
        sb.append(((this.addressLine2 == null)?"<null>":this.addressLine2));
        sb.append(',');
        sb.append("addressLine3");
        sb.append('=');
        sb.append(((this.addressLine3 == null)?"<null>":this.addressLine3));
        sb.append(',');
        sb.append("addressLine4");
        sb.append('=');
        sb.append(((this.addressLine4 == null)?"<null>":this.addressLine4));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("county");
        sb.append('=');
        sb.append(((this.county == null)?"<null>":this.county));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
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
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.county == null)? 0 :this.county.hashCode()));
        result = ((result* 31)+((this.addressLine1 == null)? 0 :this.addressLine1 .hashCode()));
        result = ((result* 31)+((this.addressLine2 == null)? 0 :this.addressLine2 .hashCode()));
        result = ((result* 31)+((this.addressLine3 == null)? 0 :this.addressLine3 .hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.addressLine4 == null)? 0 :this.addressLine4 .hashCode()));
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
        return (((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.county == rhs.county)||((this.county!= null)&&this.county.equals(rhs.county))))&&((this.addressLine1 == rhs.addressLine1)||((this.addressLine1 != null)&&this.addressLine1 .equals(rhs.addressLine1))))&&((this.addressLine2 == rhs.addressLine2)||((this.addressLine2 != null)&&this.addressLine2 .equals(rhs.addressLine2))))&&((this.addressLine3 == rhs.addressLine3)||((this.addressLine3 != null)&&this.addressLine3 .equals(rhs.addressLine3))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.addressLine4 == rhs.addressLine4)||((this.addressLine4 != null)&&this.addressLine4 .equals(rhs.addressLine4))));
    }

}
