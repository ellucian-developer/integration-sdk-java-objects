
package com.ellucian.generated.eedm.region_iso_codes.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Region ISO Codes
 * <p>
 * The valid list of ISO 3166-2 region (subdivision) codes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "isoCode",
    "country",
    "status"
})
@Generated("jsonschema2pojo")
public class RegionIsoCodes {

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
     * The global identifier of the region ISO code.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the region ISO code.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the region represented by the ISO code.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the region represented by the ISO code.")
    private String title;
    /**
     * Iso Code
     * <p>
     * The ISO 3166-2 code associated with the region.
     * (Required)
     * 
     */
    @JsonProperty("isoCode")
    @JsonPropertyDescription("The ISO 3166-2 code associated with the region.")
    private String isoCode;
    /**
     * Country
     * <p>
     * The country associated with the region.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country associated with the region.")
    private Object country;
    /**
     * Status
     * <p>
     * An indicator as to whether the ISO code is currently in use or was previously used to represent a region.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("An indicator as to whether the ISO code is currently in use or was previously used to represent a region.")
    private RegionIsoCodes.Status status;

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

    public RegionIsoCodes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the region ISO code.
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
     * The global identifier of the region ISO code.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RegionIsoCodes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the region represented by the ISO code.
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
     * The full name of the region represented by the ISO code.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public RegionIsoCodes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Iso Code
     * <p>
     * The ISO 3166-2 code associated with the region.
     * (Required)
     * 
     */
    @JsonProperty("isoCode")
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * Iso Code
     * <p>
     * The ISO 3166-2 code associated with the region.
     * (Required)
     * 
     */
    @JsonProperty("isoCode")
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public RegionIsoCodes withIsoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    /**
     * Country
     * <p>
     * The country associated with the region.
     * 
     */
    @JsonProperty("country")
    public Object getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The country associated with the region.
     * 
     */
    @JsonProperty("country")
    public void setCountry(Object country) {
        this.country = country;
    }

    public RegionIsoCodes withCountry(Object country) {
        this.country = country;
        return this;
    }

    /**
     * Status
     * <p>
     * An indicator as to whether the ISO code is currently in use or was previously used to represent a region.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public RegionIsoCodes.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * An indicator as to whether the ISO code is currently in use or was previously used to represent a region.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(RegionIsoCodes.Status status) {
        this.status = status;
    }

    public RegionIsoCodes withStatus(RegionIsoCodes.Status status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegionIsoCodes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("isoCode");
        sb.append('=');
        sb.append(((this.isoCode == null)?"<null>":this.isoCode));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.isoCode == null)? 0 :this.isoCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegionIsoCodes) == false) {
            return false;
        }
        RegionIsoCodes rhs = ((RegionIsoCodes) other);
        return (((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.isoCode == rhs.isoCode)||((this.isoCode!= null)&&this.isoCode.equals(rhs.isoCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * An indicator as to whether the ISO code is currently in use or was previously used to represent a region.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive");
        private final String value;
        private final static Map<String, RegionIsoCodes.Status> CONSTANTS = new HashMap<String, RegionIsoCodes.Status>();

        static {
            for (RegionIsoCodes.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static RegionIsoCodes.Status fromValue(String value) {
            RegionIsoCodes.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
