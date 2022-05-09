
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Address
 * <p>
 * The parent or legal guardian's address
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "region",
    "subregion",
    "country",
    "locality",
    "postalCode",
    "addressType",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4"
})
@Generated("jsonschema2pojo")
public class Address__1 {

    /**
     * Region
     * <p>
     * A region within the country
     * 
     */
    @JsonProperty("region")
    @JsonPropertyDescription("A region within the country")
    private Object region;
    /**
     * Subregion
     * <p>
     * The subregion within a region (ex. county)
     * 
     */
    @JsonProperty("subregion")
    @JsonPropertyDescription("The subregion within a region (ex. county)")
    private Object subregion;
    /**
     * Country
     * <p>
     * The country
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country")
    private Object country;
    /**
     * Locality
     * <p>
     * The city or town name.
     * 
     */
    @JsonProperty("locality")
    @JsonPropertyDescription("The city or town name.")
    private String locality;
    /**
     * Postal Code
     * <p>
     * The postal code
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("The postal code")
    private String postalCode;
    /**
     * Address Type
     * <p>
     * The type of address
     * 
     */
    @JsonProperty("addressType")
    @JsonPropertyDescription("The type of address")
    private Object addressType;
    /**
     * Address Line1
     * <p>
     * The first line of the parent or guardian's address
     * 
     */
    @JsonProperty("addressLine1")
    @JsonPropertyDescription("The first line of the parent or guardian's address")
    private String addressLine1;
    /**
     * Address Line2
     * <p>
     * The second line of the parent or guardian's address.
     * 
     */
    @JsonProperty("addressLine2")
    @JsonPropertyDescription("The second line of the parent or guardian's address.")
    private String addressLine2;
    /**
     * Address Line3
     * <p>
     * The third line of the parent or guardian's address.
     * 
     */
    @JsonProperty("addressLine3")
    @JsonPropertyDescription("The third line of the parent or guardian's address.")
    private String addressLine3;
    /**
     * Address Line4
     * <p>
     * The fourth line of the parent or guardian's address.
     * 
     */
    @JsonProperty("addressLine4")
    @JsonPropertyDescription("The fourth line of the parent or guardian's address.")
    private String addressLine4;

    /**
     * Region
     * <p>
     * A region within the country
     * 
     */
    @JsonProperty("region")
    public Object getRegion() {
        return region;
    }

    /**
     * Region
     * <p>
     * A region within the country
     * 
     */
    @JsonProperty("region")
    public void setRegion(Object region) {
        this.region = region;
    }

    public Address__1 withRegion(Object region) {
        this.region = region;
        return this;
    }

    /**
     * Subregion
     * <p>
     * The subregion within a region (ex. county)
     * 
     */
    @JsonProperty("subregion")
    public Object getSubregion() {
        return subregion;
    }

    /**
     * Subregion
     * <p>
     * The subregion within a region (ex. county)
     * 
     */
    @JsonProperty("subregion")
    public void setSubregion(Object subregion) {
        this.subregion = subregion;
    }

    public Address__1 withSubregion(Object subregion) {
        this.subregion = subregion;
        return this;
    }

    /**
     * Country
     * <p>
     * The country
     * 
     */
    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The country
     * 
     */
    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    public Address__1 withCountry(Object country) {
        this.country = country;
        return this;
    }

    /**
     * Locality
     * <p>
     * The city or town name.
     * 
     */
    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    /**
     * Locality
     * <p>
     * The city or town name.
     * 
     */
    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Address__1 withLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The postal code
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * The postal code
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address__1 withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Address Type
     * <p>
     * The type of address
     * 
     */
    @JsonProperty("addressType")
    public Object getAddressType() {
        return addressType;
    }

    /**
     * Address Type
     * <p>
     * The type of address
     * 
     */
    @JsonProperty("addressType")
    public void setAddressType(Object addressType) {
        this.addressType = addressType;
    }

    public Address__1 withAddressType(Object addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * Address Line1
     * <p>
     * The first line of the parent or guardian's address
     * 
     */
    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Address Line1
     * <p>
     * The first line of the parent or guardian's address
     * 
     */
    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Address__1 withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Address Line2
     * <p>
     * The second line of the parent or guardian's address.
     * 
     */
    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Address Line2
     * <p>
     * The second line of the parent or guardian's address.
     * 
     */
    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Address__1 withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Address Line3
     * <p>
     * The third line of the parent or guardian's address.
     * 
     */
    @JsonProperty("addressLine3")
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Address Line3
     * <p>
     * The third line of the parent or guardian's address.
     * 
     */
    @JsonProperty("addressLine3")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public Address__1 withAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * Address Line4
     * <p>
     * The fourth line of the parent or guardian's address.
     * 
     */
    @JsonProperty("addressLine4")
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Address Line4
     * <p>
     * The fourth line of the parent or guardian's address.
     * 
     */
    @JsonProperty("addressLine4")
    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public Address__1 withAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("subregion");
        sb.append('=');
        sb.append(((this.subregion == null)?"<null>":this.subregion));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("locality");
        sb.append('=');
        sb.append(((this.locality == null)?"<null>":this.locality));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("addressType");
        sb.append('=');
        sb.append(((this.addressType == null)?"<null>":this.addressType));
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
        result = ((result* 31)+((this.subregion == null)? 0 :this.subregion.hashCode()));
        result = ((result* 31)+((this.addressType == null)? 0 :this.addressType.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.locality == null)? 0 :this.locality.hashCode()));
        result = ((result* 31)+((this.addressLine1 == null)? 0 :this.addressLine1 .hashCode()));
        result = ((result* 31)+((this.addressLine2 == null)? 0 :this.addressLine2 .hashCode()));
        result = ((result* 31)+((this.addressLine3 == null)? 0 :this.addressLine3 .hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        result = ((result* 31)+((this.addressLine4 == null)? 0 :this.addressLine4 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address__1) == false) {
            return false;
        }
        Address__1 rhs = ((Address__1) other);
        return (((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.subregion == rhs.subregion)||((this.subregion!= null)&&this.subregion.equals(rhs.subregion))))&&((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.locality == rhs.locality)||((this.locality!= null)&&this.locality.equals(rhs.locality))))&&((this.addressLine1 == rhs.addressLine1)||((this.addressLine1 != null)&&this.addressLine1 .equals(rhs.addressLine1))))&&((this.addressLine2 == rhs.addressLine2)||((this.addressLine2 != null)&&this.addressLine2 .equals(rhs.addressLine2))))&&((this.addressLine3 == rhs.addressLine3)||((this.addressLine3 != null)&&this.addressLine3 .equals(rhs.addressLine3))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.addressLine4 == rhs.addressLine4)||((this.addressLine4 != null)&&this.addressLine4 .equals(rhs.addressLine4))));
    }

}
