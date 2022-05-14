
package com.ellucian.generated.eedm.privacy_statuses.v6_0;

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
 * Privacy Statuses
 * <p>
 * A classification of data privacy statuses.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "privacyCategory"
})
@Generated("jsonschema2pojo")
public class PrivacyStatuses {

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
     * The global identifier of a privacy status.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of a privacy status.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of a privacy status.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a privacy status.")
    private String title;
    /**
     * Description
     * <p>
     * The description of a privacy status.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of a privacy status.")
    private String description;
    /**
     * Code
     * <p>
     * A privacy status code.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A privacy status code.")
    private String code;
    /**
     * Privacy Category
     * <p>
     * The global category of information privacy protection.
     * (Required)
     * 
     */
    @JsonProperty("privacyCategory")
    @JsonPropertyDescription("The global category of information privacy protection.")
    private PrivacyStatuses.PrivacyCategory privacyCategory;

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

    public PrivacyStatuses withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of a privacy status.
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
     * The global identifier of a privacy status.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PrivacyStatuses withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a privacy status.
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
     * The full name of a privacy status.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PrivacyStatuses withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of a privacy status.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of a privacy status.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PrivacyStatuses withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A privacy status code.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A privacy status code.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PrivacyStatuses withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Privacy Category
     * <p>
     * The global category of information privacy protection.
     * (Required)
     * 
     */
    @JsonProperty("privacyCategory")
    public PrivacyStatuses.PrivacyCategory getPrivacyCategory() {
        return privacyCategory;
    }

    /**
     * Privacy Category
     * <p>
     * The global category of information privacy protection.
     * (Required)
     * 
     */
    @JsonProperty("privacyCategory")
    public void setPrivacyCategory(PrivacyStatuses.PrivacyCategory privacyCategory) {
        this.privacyCategory = privacyCategory;
    }

    public PrivacyStatuses withPrivacyCategory(PrivacyStatuses.PrivacyCategory privacyCategory) {
        this.privacyCategory = privacyCategory;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PrivacyStatuses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("privacyCategory");
        sb.append('=');
        sb.append(((this.privacyCategory == null)?"<null>":this.privacyCategory));
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
        result = ((result* 31)+((this.privacyCategory == null)? 0 :this.privacyCategory.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
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
        if ((other instanceof PrivacyStatuses) == false) {
            return false;
        }
        PrivacyStatuses rhs = ((PrivacyStatuses) other);
        return (((((((this.privacyCategory == rhs.privacyCategory)||((this.privacyCategory!= null)&&this.privacyCategory.equals(rhs.privacyCategory)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }


    /**
     * Privacy Category
     * <p>
     * The global category of information privacy protection.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PrivacyCategory {

        UNRESTRICTED("unrestricted"),
        RESTRICTED("restricted");
        private final String value;
        private final static Map<String, PrivacyStatuses.PrivacyCategory> CONSTANTS = new HashMap<String, PrivacyStatuses.PrivacyCategory>();

        static {
            for (PrivacyStatuses.PrivacyCategory c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PrivacyCategory(String value) {
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
        public static PrivacyStatuses.PrivacyCategory fromValue(String value) {
            PrivacyStatuses.PrivacyCategory constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
