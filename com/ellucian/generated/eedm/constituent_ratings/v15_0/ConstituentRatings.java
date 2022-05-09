
package com.ellucian.generated.eedm.constituent_ratings.v15_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Ratings
 * <p>
 * Information on ratings associated with constituents.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "description",
    "constituent",
    "type",
    "preference",
    "area",
    "status",
    "ratedOn",
    "screening",
    "college",
    "campaign",
    "evaluator",
    "source",
    "businessUnit",
    "value",
    "amount",
    "participation",
    "currencyRange",
    "capacity",
    "readiness",
    "inclination",
    "notes"
})
@Generated("jsonschema2pojo")
public class ConstituentRatings {

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
     * Id
     * <p>
     * The global identifier of the constituent rating
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent rating")
    private String id;
    /**
     * Description
     * <p>
     * The description of the constituent rating.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the constituent rating.")
    private String description;
    /**
     * Constituent
     * <p>
     * The constituent associated with the rating.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The constituent associated with the rating.")
    private Object constituent;
    /**
     * Type
     * <p>
     * The type of the constituent rating, e.g.: influence, income capacity, etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the constituent rating, e.g.: influence, income capacity, etc.")
    private Type type;
    /**
     * Preference
     * <p>
     * Indicates the primary rating for the constituent for the given rating type. Only one rating should be set to primary for a constituent for a rating type.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Indicates the primary rating for the constituent for the given rating type. Only one rating should be set to primary for a constituent for a rating type.")
    private Object preference;
    /**
     * Area
     * <p>
     * The area for which the constituent was rated, e.g.: planned giving, capital campaign, etc.
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("The area for which the constituent was rated, e.g.: planned giving, capital campaign, etc.")
    private Object area;
    /**
     * Status
     * <p>
     * The status of the rating.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the rating.")
    private Status status;
    /**
     * Rated On
     * <p>
     * The date on which the constituent was rated.
     * (Required)
     * 
     */
    @JsonProperty("ratedOn")
    @JsonPropertyDescription("The date on which the constituent was rated.")
    private String ratedOn;
    /**
     * Screening
     * <p>
     * The target type and the method of screening used for the rating.
     * 
     */
    @JsonProperty("screening")
    @JsonPropertyDescription("The target type and the method of screening used for the rating.")
    private Screening screening;
    /**
     * College
     * <p>
     * The institution associated with the rating.
     * 
     */
    @JsonProperty("college")
    @JsonPropertyDescription("The institution associated with the rating.")
    private Object college;
    /**
     * Campaign
     * <p>
     * The campaign associated with the rating.
     * 
     */
    @JsonProperty("campaign")
    @JsonPropertyDescription("The campaign associated with the rating.")
    private Object campaign;
    /**
     * Evaluator
     * <p>
     * The person who evaluated the rating.
     * 
     */
    @JsonProperty("evaluator")
    @JsonPropertyDescription("The person who evaluated the rating.")
    private Object evaluator;
    /**
     * Source
     * <p>
     * The source from which the rating information originated.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source from which the rating information originated.")
    private Object source;
    /**
     * Business Unit
     * <p>
     * The business unit associated with the rating.
     * 
     */
    @JsonProperty("businessUnit")
    @JsonPropertyDescription("The business unit associated with the rating.")
    private String businessUnit;
    /**
     * Value
     * <p>
     * The rating of the constituent for the rating type, e.g.: high, platinum, gold, etc.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The rating of the constituent for the rating type, e.g.: high, platinum, gold, etc.")
    private String value;
    /**
     * Amount
     * <p>
     * The amount at which a constituent was rated.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount at which a constituent was rated.")
    private Object amount;
    /**
     * Participation
     * <p>
     * The estimation of the likelihood of the constituent contributing to the campaign, e.g.: high, medium, low, etc.
     * 
     */
    @JsonProperty("participation")
    @JsonPropertyDescription("The estimation of the likelihood of the constituent contributing to the campaign, e.g.: high, medium, low, etc.")
    private Object participation;
    /**
     * Currency Range
     * <p>
     * The range at which a constituent was rated.
     * 
     */
    @JsonProperty("currencyRange")
    @JsonPropertyDescription("The range at which a constituent was rated.")
    private Object currencyRange;
    /**
     * Capacity
     * <p>
     * The highest contribution level expected for the constituent, e.g.: major gift, annual gift, etc.
     * 
     */
    @JsonProperty("capacity")
    @JsonPropertyDescription("The highest contribution level expected for the constituent, e.g.: major gift, annual gift, etc.")
    private Object capacity;
    /**
     * Readiness
     * <p>
     * The timeframe expected for the constituent's contribution, e.g.: 1 - 2 years, 2 - 3 years, etc.
     * 
     */
    @JsonProperty("readiness")
    @JsonPropertyDescription("The timeframe expected for the constituent's contribution, e.g.: 1 - 2 years, 2 - 3 years, etc.")
    private Object readiness;
    /**
     * Inclination
     * <p>
     * The level of constituent's inclination to donate, e.g.: definitely give, not likely to give, etc.
     * 
     */
    @JsonProperty("inclination")
    @JsonPropertyDescription("The level of constituent's inclination to donate, e.g.: definitely give, not likely to give, etc.")
    private Object inclination;
    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the rating.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Notes/comments that have been generated regarding the rating.")
    private List<Note> notes = new ArrayList<Note>();

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

    public ConstituentRatings withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Id
     * <p>
     * The global identifier of the constituent rating
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * The global identifier of the constituent rating
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentRatings withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the constituent rating.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the constituent rating.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConstituentRatings withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Constituent
     * <p>
     * The constituent associated with the rating.
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
     * The constituent associated with the rating.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public ConstituentRatings withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the constituent rating, e.g.: influence, income capacity, etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the constituent rating, e.g.: influence, income capacity, etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public ConstituentRatings withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Preference
     * <p>
     * Indicates the primary rating for the constituent for the given rating type. Only one rating should be set to primary for a constituent for a rating type.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preference
     * <p>
     * Indicates the primary rating for the constituent for the given rating type. Only one rating should be set to primary for a constituent for a rating type.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public ConstituentRatings withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Area
     * <p>
     * The area for which the constituent was rated, e.g.: planned giving, capital campaign, etc.
     * 
     */
    @JsonProperty("area")
    public Object getArea() {
        return area;
    }

    /**
     * Area
     * <p>
     * The area for which the constituent was rated, e.g.: planned giving, capital campaign, etc.
     * 
     */
    @JsonProperty("area")
    public void setArea(Object area) {
        this.area = area;
    }

    public ConstituentRatings withArea(Object area) {
        this.area = area;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the rating.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the rating.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public ConstituentRatings withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Rated On
     * <p>
     * The date on which the constituent was rated.
     * (Required)
     * 
     */
    @JsonProperty("ratedOn")
    public String getRatedOn() {
        return ratedOn;
    }

    /**
     * Rated On
     * <p>
     * The date on which the constituent was rated.
     * (Required)
     * 
     */
    @JsonProperty("ratedOn")
    public void setRatedOn(String ratedOn) {
        this.ratedOn = ratedOn;
    }

    public ConstituentRatings withRatedOn(String ratedOn) {
        this.ratedOn = ratedOn;
        return this;
    }

    /**
     * Screening
     * <p>
     * The target type and the method of screening used for the rating.
     * 
     */
    @JsonProperty("screening")
    public Screening getScreening() {
        return screening;
    }

    /**
     * Screening
     * <p>
     * The target type and the method of screening used for the rating.
     * 
     */
    @JsonProperty("screening")
    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public ConstituentRatings withScreening(Screening screening) {
        this.screening = screening;
        return this;
    }

    /**
     * College
     * <p>
     * The institution associated with the rating.
     * 
     */
    @JsonProperty("college")
    public Object getCollege() {
        return college;
    }

    /**
     * College
     * <p>
     * The institution associated with the rating.
     * 
     */
    @JsonProperty("college")
    public void setCollege(Object college) {
        this.college = college;
    }

    public ConstituentRatings withCollege(Object college) {
        this.college = college;
        return this;
    }

    /**
     * Campaign
     * <p>
     * The campaign associated with the rating.
     * 
     */
    @JsonProperty("campaign")
    public Object getCampaign() {
        return campaign;
    }

    /**
     * Campaign
     * <p>
     * The campaign associated with the rating.
     * 
     */
    @JsonProperty("campaign")
    public void setCampaign(Object campaign) {
        this.campaign = campaign;
    }

    public ConstituentRatings withCampaign(Object campaign) {
        this.campaign = campaign;
        return this;
    }

    /**
     * Evaluator
     * <p>
     * The person who evaluated the rating.
     * 
     */
    @JsonProperty("evaluator")
    public Object getEvaluator() {
        return evaluator;
    }

    /**
     * Evaluator
     * <p>
     * The person who evaluated the rating.
     * 
     */
    @JsonProperty("evaluator")
    public void setEvaluator(Object evaluator) {
        this.evaluator = evaluator;
    }

    public ConstituentRatings withEvaluator(Object evaluator) {
        this.evaluator = evaluator;
        return this;
    }

    /**
     * Source
     * <p>
     * The source from which the rating information originated.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source from which the rating information originated.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentRatings withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Business Unit
     * <p>
     * The business unit associated with the rating.
     * 
     */
    @JsonProperty("businessUnit")
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Business Unit
     * <p>
     * The business unit associated with the rating.
     * 
     */
    @JsonProperty("businessUnit")
    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public ConstituentRatings withBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     * Value
     * <p>
     * The rating of the constituent for the rating type, e.g.: high, platinum, gold, etc.
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The rating of the constituent for the rating type, e.g.: high, platinum, gold, etc.
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public ConstituentRatings withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount at which a constituent was rated.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount at which a constituent was rated.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public ConstituentRatings withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Participation
     * <p>
     * The estimation of the likelihood of the constituent contributing to the campaign, e.g.: high, medium, low, etc.
     * 
     */
    @JsonProperty("participation")
    public Object getParticipation() {
        return participation;
    }

    /**
     * Participation
     * <p>
     * The estimation of the likelihood of the constituent contributing to the campaign, e.g.: high, medium, low, etc.
     * 
     */
    @JsonProperty("participation")
    public void setParticipation(Object participation) {
        this.participation = participation;
    }

    public ConstituentRatings withParticipation(Object participation) {
        this.participation = participation;
        return this;
    }

    /**
     * Currency Range
     * <p>
     * The range at which a constituent was rated.
     * 
     */
    @JsonProperty("currencyRange")
    public Object getCurrencyRange() {
        return currencyRange;
    }

    /**
     * Currency Range
     * <p>
     * The range at which a constituent was rated.
     * 
     */
    @JsonProperty("currencyRange")
    public void setCurrencyRange(Object currencyRange) {
        this.currencyRange = currencyRange;
    }

    public ConstituentRatings withCurrencyRange(Object currencyRange) {
        this.currencyRange = currencyRange;
        return this;
    }

    /**
     * Capacity
     * <p>
     * The highest contribution level expected for the constituent, e.g.: major gift, annual gift, etc.
     * 
     */
    @JsonProperty("capacity")
    public Object getCapacity() {
        return capacity;
    }

    /**
     * Capacity
     * <p>
     * The highest contribution level expected for the constituent, e.g.: major gift, annual gift, etc.
     * 
     */
    @JsonProperty("capacity")
    public void setCapacity(Object capacity) {
        this.capacity = capacity;
    }

    public ConstituentRatings withCapacity(Object capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Readiness
     * <p>
     * The timeframe expected for the constituent's contribution, e.g.: 1 - 2 years, 2 - 3 years, etc.
     * 
     */
    @JsonProperty("readiness")
    public Object getReadiness() {
        return readiness;
    }

    /**
     * Readiness
     * <p>
     * The timeframe expected for the constituent's contribution, e.g.: 1 - 2 years, 2 - 3 years, etc.
     * 
     */
    @JsonProperty("readiness")
    public void setReadiness(Object readiness) {
        this.readiness = readiness;
    }

    public ConstituentRatings withReadiness(Object readiness) {
        this.readiness = readiness;
        return this;
    }

    /**
     * Inclination
     * <p>
     * The level of constituent's inclination to donate, e.g.: definitely give, not likely to give, etc.
     * 
     */
    @JsonProperty("inclination")
    public Object getInclination() {
        return inclination;
    }

    /**
     * Inclination
     * <p>
     * The level of constituent's inclination to donate, e.g.: definitely give, not likely to give, etc.
     * 
     */
    @JsonProperty("inclination")
    public void setInclination(Object inclination) {
        this.inclination = inclination;
    }

    public ConstituentRatings withInclination(Object inclination) {
        this.inclination = inclination;
        return this;
    }

    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the rating.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the rating.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public ConstituentRatings withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentRatings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("ratedOn");
        sb.append('=');
        sb.append(((this.ratedOn == null)?"<null>":this.ratedOn));
        sb.append(',');
        sb.append("screening");
        sb.append('=');
        sb.append(((this.screening == null)?"<null>":this.screening));
        sb.append(',');
        sb.append("college");
        sb.append('=');
        sb.append(((this.college == null)?"<null>":this.college));
        sb.append(',');
        sb.append("campaign");
        sb.append('=');
        sb.append(((this.campaign == null)?"<null>":this.campaign));
        sb.append(',');
        sb.append("evaluator");
        sb.append('=');
        sb.append(((this.evaluator == null)?"<null>":this.evaluator));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("businessUnit");
        sb.append('=');
        sb.append(((this.businessUnit == null)?"<null>":this.businessUnit));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("participation");
        sb.append('=');
        sb.append(((this.participation == null)?"<null>":this.participation));
        sb.append(',');
        sb.append("currencyRange");
        sb.append('=');
        sb.append(((this.currencyRange == null)?"<null>":this.currencyRange));
        sb.append(',');
        sb.append("capacity");
        sb.append('=');
        sb.append(((this.capacity == null)?"<null>":this.capacity));
        sb.append(',');
        sb.append("readiness");
        sb.append('=');
        sb.append(((this.readiness == null)?"<null>":this.readiness));
        sb.append(',');
        sb.append("inclination");
        sb.append('=');
        sb.append(((this.inclination == null)?"<null>":this.inclination));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
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
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.college == null)? 0 :this.college.hashCode()));
        result = ((result* 31)+((this.participation == null)? 0 :this.participation.hashCode()));
        result = ((result* 31)+((this.inclination == null)? 0 :this.inclination.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.screening == null)? 0 :this.screening.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.businessUnit == null)? 0 :this.businessUnit.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.readiness == null)? 0 :this.readiness.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.capacity == null)? 0 :this.capacity.hashCode()));
        result = ((result* 31)+((this.currencyRange == null)? 0 :this.currencyRange.hashCode()));
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        result = ((result* 31)+((this.campaign == null)? 0 :this.campaign.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.ratedOn == null)? 0 :this.ratedOn.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.evaluator == null)? 0 :this.evaluator.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentRatings) == false) {
            return false;
        }
        ConstituentRatings rhs = ((ConstituentRatings) other);
        return ((((((((((((((((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.college == rhs.college)||((this.college!= null)&&this.college.equals(rhs.college))))&&((this.participation == rhs.participation)||((this.participation!= null)&&this.participation.equals(rhs.participation))))&&((this.inclination == rhs.inclination)||((this.inclination!= null)&&this.inclination.equals(rhs.inclination))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.screening == rhs.screening)||((this.screening!= null)&&this.screening.equals(rhs.screening))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.businessUnit == rhs.businessUnit)||((this.businessUnit!= null)&&this.businessUnit.equals(rhs.businessUnit))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.readiness == rhs.readiness)||((this.readiness!= null)&&this.readiness.equals(rhs.readiness))))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.capacity == rhs.capacity)||((this.capacity!= null)&&this.capacity.equals(rhs.capacity))))&&((this.currencyRange == rhs.currencyRange)||((this.currencyRange!= null)&&this.currencyRange.equals(rhs.currencyRange))))&&((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent))))&&((this.campaign == rhs.campaign)||((this.campaign!= null)&&this.campaign.equals(rhs.campaign))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.ratedOn == rhs.ratedOn)||((this.ratedOn!= null)&&this.ratedOn.equals(rhs.ratedOn))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.evaluator == rhs.evaluator)||((this.evaluator!= null)&&this.evaluator.equals(rhs.evaluator))));
    }

}
