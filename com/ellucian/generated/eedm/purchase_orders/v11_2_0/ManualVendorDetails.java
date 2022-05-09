
package com.ellucian.generated.eedm.purchase_orders.v11_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Manual Vendor Details
 * <p>
 * The details associated with an undefined vendor or an override to an existing vendor's information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "type",
    "addressLines",
    "place",
    "contact"
})
@Generated("jsonschema2pojo")
public class ManualVendorDetails {

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
     * Type
     * <p>
     * An indication of whether the vendor is a person or an organization.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("An indication of whether the vendor is a person or an organization.")
    private Object type;
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
    private Contact contact;

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

    public ManualVendorDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Type
     * <p>
     * An indication of whether the vendor is a person or an organization.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * An indication of whether the vendor is a person or an organization.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public ManualVendorDetails withType(Object type) {
        this.type = type;
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

    public ManualVendorDetails withAddressLines(List<String> addressLines) {
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

    public ManualVendorDetails withPlace(Place place) {
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
    public Contact getContact() {
        return contact;
    }

    /**
     * Contact
     * <p>
     * The contact for the vendor.
     * 
     */
    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public ManualVendorDetails withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ManualVendorDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManualVendorDetails) == false) {
            return false;
        }
        ManualVendorDetails rhs = ((ManualVendorDetails) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))));
    }

}
