
package com.ellucian.generated.eedm.country_iso_codes.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Country ISO Codes
 * <p>
 * The valid list of ISO 3166 country codes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "isoCode",
    "status"
})
@Generated("jsonschema2pojo")
public class CountryIsoCodes {

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
     * The global identifier of the country ISO code.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the country ISO code.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the country represented by the ISO code.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the country represented by the ISO code.")
    private String title;
    /**
     * ISO Code
     * <p>
     * The 3-character ISO 3166-1 code associated with the country.
     * (Required)
     * 
     */
    @JsonProperty("isoCode")
    @JsonPropertyDescription("The 3-character ISO 3166-1 code associated with the country.")
    private String isoCode;
    /**
     * Status
     * <p>
     * An indicator as to whether the ISO code is currently in use or was previously used to represent a country.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("An indicator as to whether the ISO code is currently in use or was previously used to represent a country.")
    private CountryIsoCodes.Status status;

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

    public CountryIsoCodes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the country ISO code.
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
     * The global identifier of the country ISO code.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CountryIsoCodes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the country represented by the ISO code.
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
     * The full name of the country represented by the ISO code.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CountryIsoCodes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * ISO Code
     * <p>
     * The 3-character ISO 3166-1 code associated with the country.
     * (Required)
     * 
     */
    @JsonProperty("isoCode")
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * ISO Code
     * <p>
     * The 3-character ISO 3166-1 code associated with the country.
     * (Required)
     * 
     */
    @JsonProperty("isoCode")
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public CountryIsoCodes withIsoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    /**
     * Status
     * <p>
     * An indicator as to whether the ISO code is currently in use or was previously used to represent a country.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public CountryIsoCodes.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * An indicator as to whether the ISO code is currently in use or was previously used to represent a country.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(CountryIsoCodes.Status status) {
        this.status = status;
    }

    public CountryIsoCodes withStatus(CountryIsoCodes.Status status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CountryIsoCodes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.isoCode == null)? 0 :this.isoCode.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CountryIsoCodes) == false) {
            return false;
        }
        CountryIsoCodes rhs = ((CountryIsoCodes) other);
        return ((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.isoCode == rhs.isoCode)||((this.isoCode!= null)&&this.isoCode.equals(rhs.isoCode))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * An indicator as to whether the ISO code is currently in use or was previously used to represent a country.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive");
        private final String value;
        private final static Map<String, CountryIsoCodes.Status> CONSTANTS = new HashMap<String, CountryIsoCodes.Status>();

        static {
            for (CountryIsoCodes.Status c: values()) {
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
        public static CountryIsoCodes.Status fromValue(String value) {
            CountryIsoCodes.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
