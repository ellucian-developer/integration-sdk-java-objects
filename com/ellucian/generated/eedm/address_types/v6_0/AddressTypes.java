
package com.ellucian.generated.eedm.address_types.v6_0;

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
 * Address Types
 * <p>
 * A type of address where a person or organization may be contacted.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "addressType"
})
@Generated("jsonschema2pojo")
public class AddressTypes {

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
     * A globally unique identifier of an address type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A globally unique identifier of an address type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of an address type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an address type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of an address type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of an address type.")
    private String description;
    /**
     * Address Type Code
     * <p>
     * The generally unique code for an address type.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The generally unique code for an address type.")
    private String code;
    /**
     * Type
     * <p>
     * A mapping to a standard type for the address type.
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    @JsonPropertyDescription("A mapping to a standard type for the address type.")
    private AddressTypes.AddressType addressType;

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

    public AddressTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A globally unique identifier of an address type.
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
     * A globally unique identifier of an address type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AddressTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an address type.
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
     * The full name of an address type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AddressTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of an address type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of an address type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AddressTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Address Type Code
     * <p>
     * The generally unique code for an address type.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Address Type Code
     * <p>
     * The generally unique code for an address type.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AddressTypes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * A mapping to a standard type for the address type.
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    public AddressTypes.AddressType getAddressType() {
        return addressType;
    }

    /**
     * Type
     * <p>
     * A mapping to a standard type for the address type.
     * (Required)
     * 
     */
    @JsonProperty("addressType")
    public void setAddressType(AddressTypes.AddressType addressType) {
        this.addressType = addressType;
    }

    public AddressTypes withAddressType(AddressTypes.AddressType addressType) {
        this.addressType = addressType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddressTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("addressType");
        sb.append('=');
        sb.append(((this.addressType == null)?"<null>":this.addressType));
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
        result = ((result* 31)+((this.addressType == null)? 0 :this.addressType.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddressTypes) == false) {
            return false;
        }
        AddressTypes rhs = ((AddressTypes) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }


    /**
     * Type
     * <p>
     * A mapping to a standard type for the address type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AddressType {

        HOME("home"),
        SCHOOL("school"),
        VACATION("vacation"),
        BILLING("billing"),
        SHIPPING("shipping"),
        MAILING("mailing"),
        BUSINESS("business"),
        PARENT("parent"),
        FAMILY("family"),
        POBOX("pobox"),
        MAIN("main"),
        BRANCH("branch"),
        REGION("region"),
        SUPPORT("support"),
        MATCHING_GIFTS("matchingGifts"),
        OTHER("other");
        private final String value;
        private final static Map<String, AddressTypes.AddressType> CONSTANTS = new HashMap<String, AddressTypes.AddressType>();

        static {
            for (AddressTypes.AddressType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AddressType(String value) {
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
        public static AddressTypes.AddressType fromValue(String value) {
            AddressTypes.AddressType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
