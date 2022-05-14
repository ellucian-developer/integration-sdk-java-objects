
package com.ellucian.generated.eedm.giving_society_recognition_levels.v8_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Giving Society Recognition Levels
 * <p>
 * A user defined ranking used in giving society.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "society",
    "rank",
    "minimumContribution",
    "maximumContribution"
})
@Generated("jsonschema2pojo")
public class GivingSocietyRecognitionLevels {

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
     * The global identifier of the giving society recognition level.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the giving society recognition level.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the giving society recognition level.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the giving society recognition level.")
    private String title;
    /**
     * Society
     * <p>
     * The giving society for which this recognition level is defined.
     * (Required)
     * 
     */
    @JsonProperty("society")
    @JsonPropertyDescription("The giving society for which this recognition level is defined.")
    private Society society;
    /**
     * Rank
     * <p>
     * The rank of the recognition level within the giving society.
     * (Required)
     * 
     */
    @JsonProperty("rank")
    @JsonPropertyDescription("The rank of the recognition level within the giving society.")
    private Double rank;
    /**
     * Minimum Contribution
     * <p>
     * The minimum contribution level required for the recognition level.
     * 
     */
    @JsonProperty("minimumContribution")
    @JsonPropertyDescription("The minimum contribution level required for the recognition level.")
    private Object minimumContribution;
    /**
     * Maximum Contribution
     * <p>
     * The maximum contribution level allowed within the recognition level.
     * 
     */
    @JsonProperty("maximumContribution")
    @JsonPropertyDescription("The maximum contribution level allowed within the recognition level.")
    private Object maximumContribution;

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

    public GivingSocietyRecognitionLevels withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the giving society recognition level.
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
     * The global identifier of the giving society recognition level.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GivingSocietyRecognitionLevels withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the giving society recognition level.
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
     * The full name of the giving society recognition level.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GivingSocietyRecognitionLevels withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Society
     * <p>
     * The giving society for which this recognition level is defined.
     * (Required)
     * 
     */
    @JsonProperty("society")
    public Society getSociety() {
        return society;
    }

    /**
     * Society
     * <p>
     * The giving society for which this recognition level is defined.
     * (Required)
     * 
     */
    @JsonProperty("society")
    public void setSociety(Society society) {
        this.society = society;
    }

    public GivingSocietyRecognitionLevels withSociety(Society society) {
        this.society = society;
        return this;
    }

    /**
     * Rank
     * <p>
     * The rank of the recognition level within the giving society.
     * (Required)
     * 
     */
    @JsonProperty("rank")
    public Double getRank() {
        return rank;
    }

    /**
     * Rank
     * <p>
     * The rank of the recognition level within the giving society.
     * (Required)
     * 
     */
    @JsonProperty("rank")
    public void setRank(Double rank) {
        this.rank = rank;
    }

    public GivingSocietyRecognitionLevels withRank(Double rank) {
        this.rank = rank;
        return this;
    }

    /**
     * Minimum Contribution
     * <p>
     * The minimum contribution level required for the recognition level.
     * 
     */
    @JsonProperty("minimumContribution")
    public Object getMinimumContribution() {
        return minimumContribution;
    }

    /**
     * Minimum Contribution
     * <p>
     * The minimum contribution level required for the recognition level.
     * 
     */
    @JsonProperty("minimumContribution")
    public void setMinimumContribution(Object minimumContribution) {
        this.minimumContribution = minimumContribution;
    }

    public GivingSocietyRecognitionLevels withMinimumContribution(Object minimumContribution) {
        this.minimumContribution = minimumContribution;
        return this;
    }

    /**
     * Maximum Contribution
     * <p>
     * The maximum contribution level allowed within the recognition level.
     * 
     */
    @JsonProperty("maximumContribution")
    public Object getMaximumContribution() {
        return maximumContribution;
    }

    /**
     * Maximum Contribution
     * <p>
     * The maximum contribution level allowed within the recognition level.
     * 
     */
    @JsonProperty("maximumContribution")
    public void setMaximumContribution(Object maximumContribution) {
        this.maximumContribution = maximumContribution;
    }

    public GivingSocietyRecognitionLevels withMaximumContribution(Object maximumContribution) {
        this.maximumContribution = maximumContribution;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GivingSocietyRecognitionLevels.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("society");
        sb.append('=');
        sb.append(((this.society == null)?"<null>":this.society));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("minimumContribution");
        sb.append('=');
        sb.append(((this.minimumContribution == null)?"<null>":this.minimumContribution));
        sb.append(',');
        sb.append("maximumContribution");
        sb.append('=');
        sb.append(((this.maximumContribution == null)?"<null>":this.maximumContribution));
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
        result = ((result* 31)+((this.society == null)? 0 :this.society.hashCode()));
        result = ((result* 31)+((this.maximumContribution == null)? 0 :this.maximumContribution.hashCode()));
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        result = ((result* 31)+((this.minimumContribution == null)? 0 :this.minimumContribution.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GivingSocietyRecognitionLevels) == false) {
            return false;
        }
        GivingSocietyRecognitionLevels rhs = ((GivingSocietyRecognitionLevels) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.society == rhs.society)||((this.society!= null)&&this.society.equals(rhs.society))))&&((this.maximumContribution == rhs.maximumContribution)||((this.maximumContribution!= null)&&this.maximumContribution.equals(rhs.maximumContribution))))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))))&&((this.minimumContribution == rhs.minimumContribution)||((this.minimumContribution!= null)&&this.minimumContribution.equals(rhs.minimumContribution))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
