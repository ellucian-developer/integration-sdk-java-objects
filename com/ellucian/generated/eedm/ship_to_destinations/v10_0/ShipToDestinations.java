
package com.ellucian.generated.eedm.ship_to_destinations.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Ship To Destinations
 * <p>
 * The destinations where purchases may be shipped.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "addressLines",
    "building",
    "floor",
    "place",
    "startOn",
    "endOn",
    "contact",
    "taxCode"
})
@Generated("jsonschema2pojo")
public class ShipToDestinations {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the ship to destination.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the ship to destination.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the ship to destination.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the ship to destination.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the ship to destination.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the ship to destination.")
    private String description;
    /**
     * Code
     * <p>
     * The code that may be used to identify the ship to destination.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that may be used to identify the ship to destination.")
    private String code;
    /**
     * Address Lines
     * <p>
     * The address lines of the destination's location, such as a street address or post office box number, city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("The address lines of the destination's location, such as a street address or post office box number, city, region, and postal code.")
    private List<String> addressLines = new ArrayList<String>();
    /**
     * Building
     * <p>
     * The building specified for the destination.
     * 
     */
    @JsonProperty("building")
    @JsonPropertyDescription("The building specified for the destination.")
    private String building;
    /**
     * Floor
     * <p>
     * The floor specified for the destination.
     * 
     */
    @JsonProperty("floor")
    @JsonPropertyDescription("The floor specified for the destination.")
    private String floor;
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
     * Start On
     * <p>
     * The first date when shipping to the destination is valid.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date when shipping to the destination is valid.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date when shipping to the destination is valid.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when shipping to the destination is valid.")
    private Object endOn;
    /**
     * Contact
     * <p>
     * The contact specified for the destination.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("The contact specified for the destination.")
    private Contact contact;
    /**
     * Tax Code
     * <p>
     * The default tax code associated with the destination.
     * 
     */
    @JsonProperty("taxCode")
    @JsonPropertyDescription("The default tax code associated with the destination.")
    private Object taxCode;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public ShipToDestinations withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the ship to destination.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the ship to destination.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ShipToDestinations withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the ship to destination.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the ship to destination.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ShipToDestinations withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the ship to destination.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the ship to destination.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ShipToDestinations withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code that may be used to identify the ship to destination.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that may be used to identify the ship to destination.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ShipToDestinations withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the destination's location, such as a street address or post office box number, city, region, and postal code.
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
     * The address lines of the destination's location, such as a street address or post office box number, city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public ShipToDestinations withAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
        return this;
    }

    /**
     * Building
     * <p>
     * The building specified for the destination.
     * 
     */
    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    /**
     * Building
     * <p>
     * The building specified for the destination.
     * 
     */
    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    public ShipToDestinations withBuilding(String building) {
        this.building = building;
        return this;
    }

    /**
     * Floor
     * <p>
     * The floor specified for the destination.
     * 
     */
    @JsonProperty("floor")
    public String getFloor() {
        return floor;
    }

    /**
     * Floor
     * <p>
     * The floor specified for the destination.
     * 
     */
    @JsonProperty("floor")
    public void setFloor(String floor) {
        this.floor = floor;
    }

    public ShipToDestinations withFloor(String floor) {
        this.floor = floor;
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

    public ShipToDestinations withPlace(Object place) {
        this.place = place;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date when shipping to the destination is valid.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date when shipping to the destination is valid.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public ShipToDestinations withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when shipping to the destination is valid.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when shipping to the destination is valid.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public ShipToDestinations withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Contact
     * <p>
     * The contact specified for the destination.
     * 
     */
    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    /**
     * Contact
     * <p>
     * The contact specified for the destination.
     * 
     */
    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public ShipToDestinations withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Tax Code
     * <p>
     * The default tax code associated with the destination.
     * 
     */
    @JsonProperty("taxCode")
    public Object getTaxCode() {
        return taxCode;
    }

    /**
     * Tax Code
     * <p>
     * The default tax code associated with the destination.
     * 
     */
    @JsonProperty("taxCode")
    public void setTaxCode(Object taxCode) {
        this.taxCode = taxCode;
    }

    public ShipToDestinations withTaxCode(Object taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipToDestinations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("addressLines");
        sb.append('=');
        sb.append(((this.addressLines == null)?"<null>":this.addressLines));
        sb.append(',');
        sb.append("building");
        sb.append('=');
        sb.append(((this.building == null)?"<null>":this.building));
        sb.append(',');
        sb.append("floor");
        sb.append('=');
        sb.append(((this.floor == null)?"<null>":this.floor));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("taxCode");
        sb.append('=');
        sb.append(((this.taxCode == null)?"<null>":this.taxCode));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.taxCode == null)? 0 :this.taxCode.hashCode()));
        result = ((result* 31)+((this.building == null)? 0 :this.building.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        result = ((result* 31)+((this.floor == null)? 0 :this.floor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShipToDestinations) == false) {
            return false;
        }
        ShipToDestinations rhs = ((ShipToDestinations) other);
        return ((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.taxCode == rhs.taxCode)||((this.taxCode!= null)&&this.taxCode.equals(rhs.taxCode))))&&((this.building == rhs.building)||((this.building!= null)&&this.building.equals(rhs.building))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))))&&((this.floor == rhs.floor)||((this.floor!= null)&&this.floor.equals(rhs.floor))));
    }

}
