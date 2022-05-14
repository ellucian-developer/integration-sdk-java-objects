
package com.ellucian.generated.eedm.philanthropic_interest_purposes.v7_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Philanthropic Interest Purposes
 * <p>
 * Specific purposes within of an area of interest in which a constituent has expressed a willingness to support (e.g. museums within the area of art and culture).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "interestArea"
})
@Generated("jsonschema2pojo")
public class PhilanthropicInterestPurposes {

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
     * The global identifier of the Philanthropic Interest Purpose.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Philanthropic Interest Purpose.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the Philanthropic Interest Purpose.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the Philanthropic Interest Purpose.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the Philanthropic Interest Purpose.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the Philanthropic Interest Purpose.")
    private String description;
    /**
     * Interest Area
     * <p>
     * The philanthropic interest area associated with the purpose.
     * (Required)
     * 
     */
    @JsonProperty("interestArea")
    @JsonPropertyDescription("The philanthropic interest area associated with the purpose.")
    private InterestArea interestArea;

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

    public PhilanthropicInterestPurposes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Philanthropic Interest Purpose.
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
     * The global identifier of the Philanthropic Interest Purpose.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PhilanthropicInterestPurposes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the Philanthropic Interest Purpose.
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
     * The full name of the Philanthropic Interest Purpose.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PhilanthropicInterestPurposes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the Philanthropic Interest Purpose.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the Philanthropic Interest Purpose.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PhilanthropicInterestPurposes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Interest Area
     * <p>
     * The philanthropic interest area associated with the purpose.
     * (Required)
     * 
     */
    @JsonProperty("interestArea")
    public InterestArea getInterestArea() {
        return interestArea;
    }

    /**
     * Interest Area
     * <p>
     * The philanthropic interest area associated with the purpose.
     * (Required)
     * 
     */
    @JsonProperty("interestArea")
    public void setInterestArea(InterestArea interestArea) {
        this.interestArea = interestArea;
    }

    public PhilanthropicInterestPurposes withInterestArea(InterestArea interestArea) {
        this.interestArea = interestArea;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PhilanthropicInterestPurposes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("interestArea");
        sb.append('=');
        sb.append(((this.interestArea == null)?"<null>":this.interestArea));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.interestArea == null)? 0 :this.interestArea.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhilanthropicInterestPurposes) == false) {
            return false;
        }
        PhilanthropicInterestPurposes rhs = ((PhilanthropicInterestPurposes) other);
        return ((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.interestArea == rhs.interestArea)||((this.interestArea!= null)&&this.interestArea.equals(rhs.interestArea))));
    }

}
