
package com.ellucian.generated.eedm.communication_activity_efforts.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Communication Activity Efforts
 * <p>
 * Fundraising and outreach activities that are part of a communication plan.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "type",
    "contactPreferenceType",
    "communicationActivityName",
    "source",
    "author",
    "targetDate",
    "channel",
    "appealGoals",
    "categories",
    "budget",
    "actualCost",
    "notes"
})
@Generated("jsonschema2pojo")
public class CommunicationActivityEfforts {

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
     * The global identifier of the communication activity effort.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the communication activity effort.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the communication activity effort.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the communication activity effort.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the communication activity effort.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the communication activity effort.")
    private String description;
    /**
     * Code
     * <p>
     * The code used to identify the communication activity effort.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code used to identify the communication activity effort.")
    private String code;
    /**
     * Type
     * <p>
     * The communication activity type associated with the effort.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The communication activity type associated with the effort.")
    private Object type;
    /**
     * Contact Preference Type
     * <p>
     * The contact preference type associated with the effort.
     * 
     */
    @JsonProperty("contactPreferenceType")
    @JsonPropertyDescription("The contact preference type associated with the effort.")
    private Object contactPreferenceType;
    /**
     * Communication Activity Name
     * <p>
     * The communication activity name associated with the effort.
     * 
     */
    @JsonProperty("communicationActivityName")
    @JsonPropertyDescription("The communication activity name associated with the effort.")
    private Object communicationActivityName;
    /**
     * source
     * <p>
     * The source of data used in the effort.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of data used in the effort.")
    private Object source;
    /**
     * Author
     * <p>
     * The person making the effort, if applicable.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("The person making the effort, if applicable.")
    private Object author;
    /**
     * Target Date
     * <p>
     * The date the activity of the effort is expected to occur.
     * 
     */
    @JsonProperty("targetDate")
    @JsonPropertyDescription("The date the activity of the effort is expected to occur.")
    private Object targetDate;
    /**
     * Channel
     * <p>
     * The channel associated with the effort.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    @JsonPropertyDescription("The channel associated with the effort.")
    private Channel channel;
    /**
     * Appeal Goals
     * <p>
     * The goals for efforts which are appeals.
     * 
     */
    @JsonProperty("appealGoals")
    @JsonPropertyDescription("The goals for efforts which are appeals.")
    private AppealGoals appealGoals;
    /**
     * Categories
     * <p>
     * A group of custom categorizations used for communication activity efforts.
     * 
     */
    @JsonProperty("categories")
    @JsonPropertyDescription("A group of custom categorizations used for communication activity efforts.")
    private Categories categories;
    /**
     * Budget
     * <p>
     * The budget allocated for the effort.
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("The budget allocated for the effort.")
    private Object budget;
    /**
     * Actual Cost
     * <p>
     * The actual cost of the effort.
     * 
     */
    @JsonProperty("actualCost")
    @JsonPropertyDescription("The actual cost of the effort.")
    private Object actualCost;
    /**
     * Notes
     * <p>
     * A list of notes made concerning the effort.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("A list of notes made concerning the effort.")
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

    public CommunicationActivityEfforts withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the communication activity effort.
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
     * The global identifier of the communication activity effort.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CommunicationActivityEfforts withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the communication activity effort.
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
     * The full name of the communication activity effort.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CommunicationActivityEfforts withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the communication activity effort.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the communication activity effort.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CommunicationActivityEfforts withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code used to identify the communication activity effort.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code used to identify the communication activity effort.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CommunicationActivityEfforts withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * The communication activity type associated with the effort.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The communication activity type associated with the effort.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public CommunicationActivityEfforts withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Contact Preference Type
     * <p>
     * The contact preference type associated with the effort.
     * 
     */
    @JsonProperty("contactPreferenceType")
    public Object getContactPreferenceType() {
        return contactPreferenceType;
    }

    /**
     * Contact Preference Type
     * <p>
     * The contact preference type associated with the effort.
     * 
     */
    @JsonProperty("contactPreferenceType")
    public void setContactPreferenceType(Object contactPreferenceType) {
        this.contactPreferenceType = contactPreferenceType;
    }

    public CommunicationActivityEfforts withContactPreferenceType(Object contactPreferenceType) {
        this.contactPreferenceType = contactPreferenceType;
        return this;
    }

    /**
     * Communication Activity Name
     * <p>
     * The communication activity name associated with the effort.
     * 
     */
    @JsonProperty("communicationActivityName")
    public Object getCommunicationActivityName() {
        return communicationActivityName;
    }

    /**
     * Communication Activity Name
     * <p>
     * The communication activity name associated with the effort.
     * 
     */
    @JsonProperty("communicationActivityName")
    public void setCommunicationActivityName(Object communicationActivityName) {
        this.communicationActivityName = communicationActivityName;
    }

    public CommunicationActivityEfforts withCommunicationActivityName(Object communicationActivityName) {
        this.communicationActivityName = communicationActivityName;
        return this;
    }

    /**
     * source
     * <p>
     * The source of data used in the effort.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * source
     * <p>
     * The source of data used in the effort.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public CommunicationActivityEfforts withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Author
     * <p>
     * The person making the effort, if applicable.
     * 
     */
    @JsonProperty("author")
    public Object getAuthor() {
        return author;
    }

    /**
     * Author
     * <p>
     * The person making the effort, if applicable.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(Object author) {
        this.author = author;
    }

    public CommunicationActivityEfforts withAuthor(Object author) {
        this.author = author;
        return this;
    }

    /**
     * Target Date
     * <p>
     * The date the activity of the effort is expected to occur.
     * 
     */
    @JsonProperty("targetDate")
    public Object getTargetDate() {
        return targetDate;
    }

    /**
     * Target Date
     * <p>
     * The date the activity of the effort is expected to occur.
     * 
     */
    @JsonProperty("targetDate")
    public void setTargetDate(Object targetDate) {
        this.targetDate = targetDate;
    }

    public CommunicationActivityEfforts withTargetDate(Object targetDate) {
        this.targetDate = targetDate;
        return this;
    }

    /**
     * Channel
     * <p>
     * The channel associated with the effort.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public Channel getChannel() {
        return channel;
    }

    /**
     * Channel
     * <p>
     * The channel associated with the effort.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public CommunicationActivityEfforts withChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Appeal Goals
     * <p>
     * The goals for efforts which are appeals.
     * 
     */
    @JsonProperty("appealGoals")
    public AppealGoals getAppealGoals() {
        return appealGoals;
    }

    /**
     * Appeal Goals
     * <p>
     * The goals for efforts which are appeals.
     * 
     */
    @JsonProperty("appealGoals")
    public void setAppealGoals(AppealGoals appealGoals) {
        this.appealGoals = appealGoals;
    }

    public CommunicationActivityEfforts withAppealGoals(AppealGoals appealGoals) {
        this.appealGoals = appealGoals;
        return this;
    }

    /**
     * Categories
     * <p>
     * A group of custom categorizations used for communication activity efforts.
     * 
     */
    @JsonProperty("categories")
    public Categories getCategories() {
        return categories;
    }

    /**
     * Categories
     * <p>
     * A group of custom categorizations used for communication activity efforts.
     * 
     */
    @JsonProperty("categories")
    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public CommunicationActivityEfforts withCategories(Categories categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Budget
     * <p>
     * The budget allocated for the effort.
     * 
     */
    @JsonProperty("budget")
    public Object getBudget() {
        return budget;
    }

    /**
     * Budget
     * <p>
     * The budget allocated for the effort.
     * 
     */
    @JsonProperty("budget")
    public void setBudget(Object budget) {
        this.budget = budget;
    }

    public CommunicationActivityEfforts withBudget(Object budget) {
        this.budget = budget;
        return this;
    }

    /**
     * Actual Cost
     * <p>
     * The actual cost of the effort.
     * 
     */
    @JsonProperty("actualCost")
    public Object getActualCost() {
        return actualCost;
    }

    /**
     * Actual Cost
     * <p>
     * The actual cost of the effort.
     * 
     */
    @JsonProperty("actualCost")
    public void setActualCost(Object actualCost) {
        this.actualCost = actualCost;
    }

    public CommunicationActivityEfforts withActualCost(Object actualCost) {
        this.actualCost = actualCost;
        return this;
    }

    /**
     * Notes
     * <p>
     * A list of notes made concerning the effort.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * A list of notes made concerning the effort.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public CommunicationActivityEfforts withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommunicationActivityEfforts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("contactPreferenceType");
        sb.append('=');
        sb.append(((this.contactPreferenceType == null)?"<null>":this.contactPreferenceType));
        sb.append(',');
        sb.append("communicationActivityName");
        sb.append('=');
        sb.append(((this.communicationActivityName == null)?"<null>":this.communicationActivityName));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("targetDate");
        sb.append('=');
        sb.append(((this.targetDate == null)?"<null>":this.targetDate));
        sb.append(',');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("appealGoals");
        sb.append('=');
        sb.append(((this.appealGoals == null)?"<null>":this.appealGoals));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("budget");
        sb.append('=');
        sb.append(((this.budget == null)?"<null>":this.budget));
        sb.append(',');
        sb.append("actualCost");
        sb.append('=');
        sb.append(((this.actualCost == null)?"<null>":this.actualCost));
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
        result = ((result* 31)+((this.communicationActivityName == null)? 0 :this.communicationActivityName.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.contactPreferenceType == null)? 0 :this.contactPreferenceType.hashCode()));
        result = ((result* 31)+((this.appealGoals == null)? 0 :this.appealGoals.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.targetDate == null)? 0 :this.targetDate.hashCode()));
        result = ((result* 31)+((this.channel == null)? 0 :this.channel.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        result = ((result* 31)+((this.actualCost == null)? 0 :this.actualCost.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommunicationActivityEfforts) == false) {
            return false;
        }
        CommunicationActivityEfforts rhs = ((CommunicationActivityEfforts) other);
        return ((((((((((((((((((this.communicationActivityName == rhs.communicationActivityName)||((this.communicationActivityName!= null)&&this.communicationActivityName.equals(rhs.communicationActivityName)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.contactPreferenceType == rhs.contactPreferenceType)||((this.contactPreferenceType!= null)&&this.contactPreferenceType.equals(rhs.contactPreferenceType))))&&((this.appealGoals == rhs.appealGoals)||((this.appealGoals!= null)&&this.appealGoals.equals(rhs.appealGoals))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.targetDate == rhs.targetDate)||((this.targetDate!= null)&&this.targetDate.equals(rhs.targetDate))))&&((this.channel == rhs.channel)||((this.channel!= null)&&this.channel.equals(rhs.channel))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))))&&((this.actualCost == rhs.actualCost)||((this.actualCost!= null)&&this.actualCost.equals(rhs.actualCost))));
    }

}
