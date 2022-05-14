
package com.ellucian.generated.eedm.constituent_wealth_assessments.v9_1_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Wealth Assessments
 * <p>
 * The assessments of constituents' overall wealth.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "constituent",
    "wealthRange",
    "informationDate",
    "confidenceLevel",
    "source"
})
@Generated("jsonschema2pojo")
public class ConstituentWealthAssessments {

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
     * The global identifier of the constituent wealth assessment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent wealth assessment.")
    private String id;
    /**
     * Constituent
     * <p>
     * The constituent for whom the wealth assessment applies.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The constituent for whom the wealth assessment applies.")
    private Object constituent;
    /**
     * Wealth Range
     * <p>
     * The range within which the constituent's overall wealth falls.
     * (Required)
     * 
     */
    @JsonProperty("wealthRange")
    @JsonPropertyDescription("The range within which the constituent's overall wealth falls.")
    private WealthRange wealthRange;
    /**
     * Information Date
     * <p>
     * The date of the information of the wealth assessment.
     * (Required)
     * 
     */
    @JsonProperty("informationDate")
    @JsonPropertyDescription("The date of the information of the wealth assessment.")
    private String informationDate;
    /**
     * Confidence Level
     * <p>
     * The level of confidence in the constituent's wealth information.
     * 
     */
    @JsonProperty("confidenceLevel")
    @JsonPropertyDescription("The level of confidence in the constituent's wealth information.")
    private Object confidenceLevel;
    /**
     * Source
     * <p>
     * The source that provided the wealth assessment information.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source that provided the wealth assessment information.")
    private Object source;

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

    public ConstituentWealthAssessments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent wealth assessment.
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
     * The global identifier of the constituent wealth assessment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentWealthAssessments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Constituent
     * <p>
     * The constituent for whom the wealth assessment applies.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public Object getConstituent() {
        return constituent;
    }

    /**
     * Constituent
     * <p>
     * The constituent for whom the wealth assessment applies.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public ConstituentWealthAssessments withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    /**
     * Wealth Range
     * <p>
     * The range within which the constituent's overall wealth falls.
     * (Required)
     * 
     */
    @JsonProperty("wealthRange")
    public WealthRange getWealthRange() {
        return wealthRange;
    }

    /**
     * Wealth Range
     * <p>
     * The range within which the constituent's overall wealth falls.
     * (Required)
     * 
     */
    @JsonProperty("wealthRange")
    public void setWealthRange(WealthRange wealthRange) {
        this.wealthRange = wealthRange;
    }

    public ConstituentWealthAssessments withWealthRange(WealthRange wealthRange) {
        this.wealthRange = wealthRange;
        return this;
    }

    /**
     * Information Date
     * <p>
     * The date of the information of the wealth assessment.
     * (Required)
     * 
     */
    @JsonProperty("informationDate")
    public String getInformationDate() {
        return informationDate;
    }

    /**
     * Information Date
     * <p>
     * The date of the information of the wealth assessment.
     * (Required)
     * 
     */
    @JsonProperty("informationDate")
    public void setInformationDate(String informationDate) {
        this.informationDate = informationDate;
    }

    public ConstituentWealthAssessments withInformationDate(String informationDate) {
        this.informationDate = informationDate;
        return this;
    }

    /**
     * Confidence Level
     * <p>
     * The level of confidence in the constituent's wealth information.
     * 
     */
    @JsonProperty("confidenceLevel")
    public Object getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Confidence Level
     * <p>
     * The level of confidence in the constituent's wealth information.
     * 
     */
    @JsonProperty("confidenceLevel")
    public void setConfidenceLevel(Object confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    public ConstituentWealthAssessments withConfidenceLevel(Object confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
        return this;
    }

    /**
     * Source
     * <p>
     * The source that provided the wealth assessment information.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source that provided the wealth assessment information.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentWealthAssessments withSource(Object source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentWealthAssessments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
        sb.append(',');
        sb.append("wealthRange");
        sb.append('=');
        sb.append(((this.wealthRange == null)?"<null>":this.wealthRange));
        sb.append(',');
        sb.append("informationDate");
        sb.append('=');
        sb.append(((this.informationDate == null)?"<null>":this.informationDate));
        sb.append(',');
        sb.append("confidenceLevel");
        sb.append('=');
        sb.append(((this.confidenceLevel == null)?"<null>":this.confidenceLevel));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.wealthRange == null)? 0 :this.wealthRange.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.confidenceLevel == null)? 0 :this.confidenceLevel.hashCode()));
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        result = ((result* 31)+((this.informationDate == null)? 0 :this.informationDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentWealthAssessments) == false) {
            return false;
        }
        ConstituentWealthAssessments rhs = ((ConstituentWealthAssessments) other);
        return ((((((((this.wealthRange == rhs.wealthRange)||((this.wealthRange!= null)&&this.wealthRange.equals(rhs.wealthRange)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.confidenceLevel == rhs.confidenceLevel)||((this.confidenceLevel!= null)&&this.confidenceLevel.equals(rhs.confidenceLevel))))&&((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent))))&&((this.informationDate == rhs.informationDate)||((this.informationDate!= null)&&this.informationDate.equals(rhs.informationDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))));
    }

}
