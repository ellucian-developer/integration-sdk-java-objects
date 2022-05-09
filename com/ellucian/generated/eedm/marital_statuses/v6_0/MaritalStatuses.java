
package com.ellucian.generated.eedm.marital_statuses.v6_0;

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
 * Marital Statuses
 * <p>
 * The condition of being married or unmarried.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "code",
    "title",
    "description",
    "maritalCategory"
})
@Generated("jsonschema2pojo")
public class MaritalStatuses {

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
     * The global identifier of a marital status to be used in all external references to a marital status.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of a marital status to be used in all external references to a marital status.")
    private String id;
    /**
     * Code
     * <p>
     * The human-readable code that identifies a marital status.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The human-readable code that identifies a marital status.")
    private String code;
    /**
     * Title
     * <p>
     * The full name of a marital status.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a marital status.")
    private String title;
    /**
     * Description
     * <p>
     * A description of a marital status.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of a marital status.")
    private String description;
    /**
     * Marital Category
     * <p>
     * The name of a higher level marital category to which this member category belongs.
     * (Required)
     * 
     */
    @JsonProperty("maritalCategory")
    @JsonPropertyDescription("The name of a higher level marital category to which this member category belongs.")
    private MaritalStatuses.MaritalCategory maritalCategory;

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

    public MaritalStatuses withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of a marital status to be used in all external references to a marital status.
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
     * The global identifier of a marital status to be used in all external references to a marital status.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MaritalStatuses withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Code
     * <p>
     * The human-readable code that identifies a marital status.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The human-readable code that identifies a marital status.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public MaritalStatuses withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a marital status.
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
     * The full name of a marital status.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public MaritalStatuses withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A description of a marital status.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of a marital status.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public MaritalStatuses withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Marital Category
     * <p>
     * The name of a higher level marital category to which this member category belongs.
     * (Required)
     * 
     */
    @JsonProperty("maritalCategory")
    public MaritalStatuses.MaritalCategory getMaritalCategory() {
        return maritalCategory;
    }

    /**
     * Marital Category
     * <p>
     * The name of a higher level marital category to which this member category belongs.
     * (Required)
     * 
     */
    @JsonProperty("maritalCategory")
    public void setMaritalCategory(MaritalStatuses.MaritalCategory maritalCategory) {
        this.maritalCategory = maritalCategory;
    }

    public MaritalStatuses withMaritalCategory(MaritalStatuses.MaritalCategory maritalCategory) {
        this.maritalCategory = maritalCategory;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MaritalStatuses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("maritalCategory");
        sb.append('=');
        sb.append(((this.maritalCategory == null)?"<null>":this.maritalCategory));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.maritalCategory == null)? 0 :this.maritalCategory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaritalStatuses) == false) {
            return false;
        }
        MaritalStatuses rhs = ((MaritalStatuses) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.maritalCategory == rhs.maritalCategory)||((this.maritalCategory!= null)&&this.maritalCategory.equals(rhs.maritalCategory))));
    }


    /**
     * Marital Category
     * <p>
     * The name of a higher level marital category to which this member category belongs.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MaritalCategory {

        SINGLE("single"),
        DIVORCED("divorced"),
        WIDOWED("widowed"),
        SEPARATED("separated"),
        MARRIED("married");
        private final String value;
        private final static Map<String, MaritalStatuses.MaritalCategory> CONSTANTS = new HashMap<String, MaritalStatuses.MaritalCategory>();

        static {
            for (MaritalStatuses.MaritalCategory c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MaritalCategory(String value) {
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
        public static MaritalStatuses.MaritalCategory fromValue(String value) {
            MaritalStatuses.MaritalCategory constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
