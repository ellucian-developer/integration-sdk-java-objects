
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "locality",
    "region",
    "subRegion",
    "country",
    "postalCode",
    "type"
})
@Generated("jsonschema2pojo")
public class Address {

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
     * Locality
     * <p>
     * The locality of an address (ex. City)
     * 
     */
    @JsonProperty("locality")
    @JsonPropertyDescription("The locality of an address (ex. City)")
    private String locality;
    /**
     * Region
     * <p>
     * The region of the address
     * 
     */
    @JsonProperty("region")
    @JsonPropertyDescription("The region of the address")
    private Region region;
    /**
     * Sub Region
     * <p>
     * The subregion of the address (ex. County)
     * 
     */
    @JsonProperty("subRegion")
    @JsonPropertyDescription("The subregion of the address (ex. County)")
    private Object subRegion;
    /**
     * Country
     * <p>
     * The country of the address.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country of the address.")
    private Object country;
    /**
     * Postal Code
     * <p>
     * The postal code associated with the address.
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("The postal code associated with the address.")
    private String postalCode;
    /**
     * Type
     * <p>
     * The type of address
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of address")
    private Address.Type type;

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
     * Locality
     * <p>
     * The locality of an address (ex. City)
     * 
     */
    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    /**
     * Locality
     * <p>
     * The locality of an address (ex. City)
     * 
     */
    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Address withLocality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * Region
     * <p>
     * The region of the address
     * 
     */
    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    /**
     * Region
     * <p>
     * The region of the address
     * 
     */
    @JsonProperty("region")
    public void setRegion(Region region) {
        this.region = region;
    }

    public Address withRegion(Region region) {
        this.region = region;
        return this;
    }

    /**
     * Sub Region
     * <p>
     * The subregion of the address (ex. County)
     * 
     */
    @JsonProperty("subRegion")
    public Object getSubRegion() {
        return subRegion;
    }

    /**
     * Sub Region
     * <p>
     * The subregion of the address (ex. County)
     * 
     */
    @JsonProperty("subRegion")
    public void setSubRegion(Object subRegion) {
        this.subRegion = subRegion;
    }

    public Address withSubRegion(Object subRegion) {
        this.subRegion = subRegion;
        return this;
    }

    /**
     * Country
     * <p>
     * The country of the address.
     * 
     */
    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The country of the address.
     * 
     */
    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    public Address withCountry(Object country) {
        this.country = country;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The postal code associated with the address.
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * The postal code associated with the address.
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
     * Type
     * <p>
     * The type of address
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Address.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of address
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Address.Type type) {
        this.type = type;
    }

    public Address withType(Address.Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("locality");
        sb.append('=');
        sb.append(((this.locality == null)?"<null>":this.locality));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("subRegion");
        sb.append('=');
        sb.append(((this.subRegion == null)?"<null>":this.subRegion));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.subRegion == null)? 0 :this.subRegion.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.locality == null)? 0 :this.locality.hashCode()));
        result = ((result* 31)+((this.addressLine1 == null)? 0 :this.addressLine1 .hashCode()));
        result = ((result* 31)+((this.addressLine2 == null)? 0 :this.addressLine2 .hashCode()));
        result = ((result* 31)+((this.addressLine3 == null)? 0 :this.addressLine3 .hashCode()));
        result = ((result* 31)+((this.addressLine4 == null)? 0 :this.addressLine4 .hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
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
        return (((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.subRegion == rhs.subRegion)||((this.subRegion!= null)&&this.subRegion.equals(rhs.subRegion))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.locality == rhs.locality)||((this.locality!= null)&&this.locality.equals(rhs.locality))))&&((this.addressLine1 == rhs.addressLine1)||((this.addressLine1 != null)&&this.addressLine1 .equals(rhs.addressLine1))))&&((this.addressLine2 == rhs.addressLine2)||((this.addressLine2 != null)&&this.addressLine2 .equals(rhs.addressLine2))))&&((this.addressLine3 == rhs.addressLine3)||((this.addressLine3 != null)&&this.addressLine3 .equals(rhs.addressLine3))))&&((this.addressLine4 == rhs.addressLine4)||((this.addressLine4 != null)&&this.addressLine4 .equals(rhs.addressLine4))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Type
     * <p>
     * The type of address
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        HOME("home"),
        SCHOOL("school"),
        VACATION("vacation"),
        BILLING("billing");
        private final String value;
        private final static Map<String, Address.Type> CONSTANTS = new HashMap<String, Address.Type>();

        static {
            for (Address.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Address.Type fromValue(String value) {
            Address.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
