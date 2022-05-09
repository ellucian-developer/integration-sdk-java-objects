
package com.ellucian.generated.eedm.user_identity_profiles.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Primary Address
 * <p>
 * Address of the person
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "postalCode",
    "region",
    "municipality",
    "addressLines"
})
@Generated("jsonschema2pojo")
public class PrimaryAddress {

    /**
     * Postal Code
     * <p>
     * Code established by postal authorities.
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("Code established by postal authorities.")
    private String postalCode;
    /**
     * Region
     * <p>
     * State or province portion of the address.
     * 
     */
    @JsonProperty("region")
    @JsonPropertyDescription("State or province portion of the address.")
    private String region;
    /**
     * Municipality
     * <p>
     * City, town, village, or hamlet portion of the address
     * 
     */
    @JsonProperty("municipality")
    @JsonPropertyDescription("City, town, village, or hamlet portion of the address")
    private String municipality;
    /**
     * Address Line
     * <p>
     * One formatted address line with all pieces in their proper place.
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("One formatted address line with all pieces in their proper place.")
    private List<String> addressLines = new ArrayList<String>();

    /**
     * Postal Code
     * <p>
     * Code established by postal authorities.
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * Code established by postal authorities.
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public PrimaryAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Region
     * <p>
     * State or province portion of the address.
     * 
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * Region
     * <p>
     * State or province portion of the address.
     * 
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public PrimaryAddress withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Municipality
     * <p>
     * City, town, village, or hamlet portion of the address
     * 
     */
    @JsonProperty("municipality")
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Municipality
     * <p>
     * City, town, village, or hamlet portion of the address
     * 
     */
    @JsonProperty("municipality")
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public PrimaryAddress withMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    /**
     * Address Line
     * <p>
     * One formatted address line with all pieces in their proper place.
     * 
     */
    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * Address Line
     * <p>
     * One formatted address line with all pieces in their proper place.
     * 
     */
    @JsonProperty("addressLines")
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public PrimaryAddress withAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PrimaryAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("municipality");
        sb.append('=');
        sb.append(((this.municipality == null)?"<null>":this.municipality));
        sb.append(',');
        sb.append("addressLines");
        sb.append('=');
        sb.append(((this.addressLines == null)?"<null>":this.addressLines));
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
        result = ((result* 31)+((this.municipality == null)? 0 :this.municipality.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrimaryAddress) == false) {
            return false;
        }
        PrimaryAddress rhs = ((PrimaryAddress) other);
        return (((((this.municipality == rhs.municipality)||((this.municipality!= null)&&this.municipality.equals(rhs.municipality)))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))));
    }

}
