
package com.ellucian.generated.eedm.purchase_orders.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Manual Vendor Detail
 * <p>
 * The detail associated with an undefined vendor or an override to an existing vendor's information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "addressLines",
    "place",
    "contact"
})
@Generated("jsonschema2pojo")
public class ManualVendorDetail {

    /**
     * Name
     * <p>
     * The name of the vendor.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the vendor.")
    private String name;
    /**
     * Address Lines
     * <p>
     * The address lines of the vendor's location, such as a street address or post office box number, city, region, and postal code.
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("The address lines of the vendor's location, such as a street address or post office box number, city, region, and postal code.")
    private List<String> addressLines = new ArrayList<String>();
    /**
     * Place
     * <p>
     * A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.
     * 
     */
    @JsonProperty("place")
    @JsonPropertyDescription("A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.")
    private Place place;
    /**
     * Contact
     * <p>
     * The contact for the vendor.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("The contact for the vendor.")
    private Contact__1 contact;

    /**
     * Name
     * <p>
     * The name of the vendor.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the vendor.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ManualVendorDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the vendor's location, such as a street address or post office box number, city, region, and postal code.
     * 
     */
    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the vendor's location, such as a street address or post office box number, city, region, and postal code.
     * 
     */
    @JsonProperty("addressLines")
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public ManualVendorDetail withAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
        return this;
    }

    /**
     * Place
     * <p>
     * A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.
     * 
     */
    @JsonProperty("place")
    public Place getPlace() {
        return place;
    }

    /**
     * Place
     * <p>
     * A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.
     * 
     */
    @JsonProperty("place")
    public void setPlace(Place place) {
        this.place = place;
    }

    public ManualVendorDetail withPlace(Place place) {
        this.place = place;
        return this;
    }

    /**
     * Contact
     * <p>
     * The contact for the vendor.
     * 
     */
    @JsonProperty("contact")
    public Contact__1 getContact() {
        return contact;
    }

    /**
     * Contact
     * <p>
     * The contact for the vendor.
     * 
     */
    @JsonProperty("contact")
    public void setContact(Contact__1 contact) {
        this.contact = contact;
    }

    public ManualVendorDetail withContact(Contact__1 contact) {
        this.contact = contact;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ManualVendorDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("addressLines");
        sb.append('=');
        sb.append(((this.addressLines == null)?"<null>":this.addressLines));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManualVendorDetail) == false) {
            return false;
        }
        ManualVendorDetail rhs = ((ManualVendorDetail) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))));
    }

}