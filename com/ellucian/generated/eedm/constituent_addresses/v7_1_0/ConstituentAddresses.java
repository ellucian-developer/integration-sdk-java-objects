
package com.ellucian.generated.eedm.constituent_addresses.v7_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Addresses
 * <p>
 * The place where a constituent is located or may be reached.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "addressLines",
    "place",
    "latitude",
    "longitude",
    "geographicAreas",
    "comment"
})
@Generated("jsonschema2pojo")
public class ConstituentAddresses {

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
     * The global identifier of the Constituent Address.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Constituent Address.")
    private String id;
    /**
     * Address
     * <p>
     * The address lines of the address, such as a street address, post office box number, or city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("The address lines of the address, such as a street address, post office box number, or city, region, and postal code.")
    private List<String> addressLines = new ArrayList<String>();
    /**
     * Place
     * <p>
     * A country specific postal region.  Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes
     * 
     */
    @JsonProperty("place")
    @JsonPropertyDescription("A country specific postal region.  Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes")
    private Object place;
    /**
     * Latitude
     * <p>
     * The latitude of the address location.
     * 
     */
    @JsonProperty("latitude")
    @JsonPropertyDescription("The latitude of the address location.")
    private Object latitude;
    /**
     * Longitude
     * <p>
     * The longitude of the address location.
     * 
     */
    @JsonProperty("longitude")
    @JsonPropertyDescription("The longitude of the address location.")
    private Object longitude;
    /**
     * Geographic Areas
     * <p>
     * The geographic areas assigned to this address.
     * 
     */
    @JsonProperty("geographicAreas")
    @JsonPropertyDescription("The geographic areas assigned to this address.")
    private List<GeographicArea> geographicAreas = new ArrayList<GeographicArea>();
    /**
     * Comment
     * <p>
     * A comment about the address.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A comment about the address.")
    private String comment;

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

    public ConstituentAddresses withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Constituent Address.
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
     * The global identifier of the Constituent Address.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentAddresses withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Address
     * <p>
     * The address lines of the address, such as a street address, post office box number, or city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * Address
     * <p>
     * The address lines of the address, such as a street address, post office box number, or city, region, and postal code.
     * (Required)
     * 
     */
    @JsonProperty("addressLines")
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public ConstituentAddresses withAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
        return this;
    }

    /**
     * Place
     * <p>
     * A country specific postal region.  Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes
     * 
     */
    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    /**
     * Place
     * <p>
     * A country specific postal region.  Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes
     * 
     */
    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    public ConstituentAddresses withPlace(Object place) {
        this.place = place;
        return this;
    }

    /**
     * Latitude
     * <p>
     * The latitude of the address location.
     * 
     */
    @JsonProperty("latitude")
    public Object getLatitude() {
        return latitude;
    }

    /**
     * Latitude
     * <p>
     * The latitude of the address location.
     * 
     */
    @JsonProperty("latitude")
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public ConstituentAddresses withLatitude(Object latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude
     * <p>
     * The longitude of the address location.
     * 
     */
    @JsonProperty("longitude")
    public Object getLongitude() {
        return longitude;
    }

    /**
     * Longitude
     * <p>
     * The longitude of the address location.
     * 
     */
    @JsonProperty("longitude")
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public ConstituentAddresses withLongitude(Object longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Geographic Areas
     * <p>
     * The geographic areas assigned to this address.
     * 
     */
    @JsonProperty("geographicAreas")
    public List<GeographicArea> getGeographicAreas() {
        return geographicAreas;
    }

    /**
     * Geographic Areas
     * <p>
     * The geographic areas assigned to this address.
     * 
     */
    @JsonProperty("geographicAreas")
    public void setGeographicAreas(List<GeographicArea> geographicAreas) {
        this.geographicAreas = geographicAreas;
    }

    public ConstituentAddresses withGeographicAreas(List<GeographicArea> geographicAreas) {
        this.geographicAreas = geographicAreas;
        return this;
    }

    /**
     * Comment
     * <p>
     * A comment about the address.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * A comment about the address.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ConstituentAddresses withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentAddresses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("addressLines");
        sb.append('=');
        sb.append(((this.addressLines == null)?"<null>":this.addressLines));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
        sb.append(',');
        sb.append("geographicAreas");
        sb.append('=');
        sb.append(((this.geographicAreas == null)?"<null>":this.geographicAreas));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.geographicAreas == null)? 0 :this.geographicAreas.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentAddresses) == false) {
            return false;
        }
        ConstituentAddresses rhs = ((ConstituentAddresses) other);
        return (((((((((this.geographicAreas == rhs.geographicAreas)||((this.geographicAreas!= null)&&this.geographicAreas.equals(rhs.geographicAreas)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))));
    }

}
