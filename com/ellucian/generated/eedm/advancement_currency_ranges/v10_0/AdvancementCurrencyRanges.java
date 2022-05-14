
package com.ellucian.generated.eedm.advancement_currency_ranges.v10_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Advancement Currency Ranges
 * <p>
 * A list of valid currency ranges.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "lowerLimit",
    "upperLimit"
})
@Generated("jsonschema2pojo")
public class AdvancementCurrencyRanges {

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
     * The global identifier of the advancement currency range.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the advancement currency range.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the advancement currency range.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the advancement currency range.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the advancement currency range.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the advancement currency range.")
    private String description;
    /**
     * Lower Limit
     * <p>
     * The lowest amount allowed for the currency range.
     * (Required)
     * 
     */
    @JsonProperty("lowerLimit")
    @JsonPropertyDescription("The lowest amount allowed for the currency range.")
    private LowerLimit lowerLimit;
    /**
     * Upper Limit
     * <p>
     * The highest amount allowed for the currency range.
     * (Required)
     * 
     */
    @JsonProperty("upperLimit")
    @JsonPropertyDescription("The highest amount allowed for the currency range.")
    private UpperLimit upperLimit;

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

    public AdvancementCurrencyRanges withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the advancement currency range.
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
     * The global identifier of the advancement currency range.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdvancementCurrencyRanges withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the advancement currency range.
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
     * The full name of the advancement currency range.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdvancementCurrencyRanges withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the advancement currency range.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the advancement currency range.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdvancementCurrencyRanges withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lower Limit
     * <p>
     * The lowest amount allowed for the currency range.
     * (Required)
     * 
     */
    @JsonProperty("lowerLimit")
    public LowerLimit getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Lower Limit
     * <p>
     * The lowest amount allowed for the currency range.
     * (Required)
     * 
     */
    @JsonProperty("lowerLimit")
    public void setLowerLimit(LowerLimit lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public AdvancementCurrencyRanges withLowerLimit(LowerLimit lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    /**
     * Upper Limit
     * <p>
     * The highest amount allowed for the currency range.
     * (Required)
     * 
     */
    @JsonProperty("upperLimit")
    public UpperLimit getUpperLimit() {
        return upperLimit;
    }

    /**
     * Upper Limit
     * <p>
     * The highest amount allowed for the currency range.
     * (Required)
     * 
     */
    @JsonProperty("upperLimit")
    public void setUpperLimit(UpperLimit upperLimit) {
        this.upperLimit = upperLimit;
    }

    public AdvancementCurrencyRanges withUpperLimit(UpperLimit upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdvancementCurrencyRanges.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("lowerLimit");
        sb.append('=');
        sb.append(((this.lowerLimit == null)?"<null>":this.lowerLimit));
        sb.append(',');
        sb.append("upperLimit");
        sb.append('=');
        sb.append(((this.upperLimit == null)?"<null>":this.upperLimit));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.upperLimit == null)? 0 :this.upperLimit.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.lowerLimit == null)? 0 :this.lowerLimit.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvancementCurrencyRanges) == false) {
            return false;
        }
        AdvancementCurrencyRanges rhs = ((AdvancementCurrencyRanges) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.upperLimit == rhs.upperLimit)||((this.upperLimit!= null)&&this.upperLimit.equals(rhs.upperLimit))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.lowerLimit == rhs.lowerLimit)||((this.lowerLimit!= null)&&this.lowerLimit.equals(rhs.lowerLimit))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
