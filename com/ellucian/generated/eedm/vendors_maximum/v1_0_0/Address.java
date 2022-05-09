
package com.ellucian.generated.eedm.vendors_maximum.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "addressLines",
    "place",
    "detail",
    "type",
    "status",
    "phones",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class Address {

    /**
     * Code
     * <p>
     * A code used to uniquely identify the address type instance.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code used to uniquely identify the address type instance.")
    private String code;
    /**
     * Address Lines
     * <p>
     * The address lines of the vendor's location, such as a street address, post office box number, or city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("The address lines of the vendor's location, such as a street address, post office box number, or city, region, and postal code.")
    private List<String> addressLines = new ArrayList<String>();
    /**
     * Place
     * <p>
     * A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.
     * 
     */
    @JsonProperty("place")
    @JsonPropertyDescription("A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.")
    private Object place;
    /**
     * Detail
     * <p>
     * The details associated with the address.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The details associated with the address.")
    private Object detail;
    /**
     * Type
     * <p>
     * A type of address for a vendor. Includes a standard type (e.g. 'business', 'mailing') and an optional, custom type to further identify the type of address.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of address for a vendor. Includes a standard type (e.g. 'business', 'mailing') and an optional, custom type to further identify the type of address.")
    private Type__1 type;
    /**
     * Status
     * <p>
     * The status of the address (active or inactive).
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the address (active or inactive).")
    private Object status;
    /**
     * Phones
     * <p>
     * The phones and phone-connected devices for this address at which the vendor can be contacted.
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phones and phone-connected devices for this address at which the vendor can be contacted.")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Start On
     * <p>
     * The earliest date that this address was valid for the vendor.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The earliest date that this address was valid for the vendor.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The latest date when this address was valid for the vendor.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The latest date when this address was valid for the vendor.")
    private Object endOn;

    /**
     * Code
     * <p>
     * A code used to uniquely identify the address type instance.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code used to uniquely identify the address type instance.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Address withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the vendor's location, such as a street address, post office box number, or city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the vendor's location, such as a street address, post office box number, or city, region, and postal code.
     * (Required)
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
     * Place
     * <p>
     * A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.
     * 
     */
    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    /**
     * Place
     * <p>
     * A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.
     * 
     */
    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    public Address withPlace(Object place) {
        this.place = place;
        return this;
    }

    /**
     * Detail
     * <p>
     * The details associated with the address.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The details associated with the address.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Address withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Type
     * <p>
     * A type of address for a vendor. Includes a standard type (e.g. 'business', 'mailing') and an optional, custom type to further identify the type of address.
     * 
     */
    @JsonProperty("type")
    public Type__1 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of address for a vendor. Includes a standard type (e.g. 'business', 'mailing') and an optional, custom type to further identify the type of address.
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
     * Status
     * <p>
     * The status of the address (active or inactive).
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the address (active or inactive).
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public Address withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Phones
     * <p>
     * The phones and phone-connected devices for this address at which the vendor can be contacted.
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phones
     * <p>
     * The phones and phone-connected devices for this address at which the vendor can be contacted.
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public Address withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this address was valid for the vendor.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The earliest date that this address was valid for the vendor.
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
     * The latest date when this address was valid for the vendor.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The latest date when this address was valid for the vendor.
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("addressLines");
        sb.append('=');
        sb.append(((this.addressLines == null)?"<null>":this.addressLines));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
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
        return ((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
