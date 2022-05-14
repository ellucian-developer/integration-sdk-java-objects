
package com.ellucian.generated.eedm.advancement_prospects.v10_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Advancement Prospects
 * <p>
 * A prospect is a constituent (or multiple constituents) which has been identified as potential major supporter.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "type",
    "source",
    "status",
    "startOn",
    "endOn",
    "givingExpectation",
    "targetGiftLevel",
    "campaign",
    "primaryContact",
    "persons",
    "organizations",
    "groups",
    "assignments",
    "stages",
    "notes"
})
@Generated("jsonschema2pojo")
public class AdvancementProspects {

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
     * The global identifier of the advancement prospect.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the advancement prospect.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the advancement prospect.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the advancement prospect.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the prospect.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the prospect.")
    private String description;
    /**
     * Type
     * <p>
     * The type of prospect.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of prospect.")
    private AdvancementProspects.Type type;
    /**
     * Source
     * <p>
     * The source of information for the prospect.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of information for the prospect.")
    private Object source;
    /**
     * Status
     * <p>
     * The status of the prospect.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the prospect.")
    private Status status;
    /**
     * Start On
     * <p>
     * The first date of the time period defined for the prospect.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date of the time period defined for the prospect.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date of the time period defined for the prospect.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date of the time period defined for the prospect.")
    private Object endOn;
    /**
     * Giving Expectation
     * <p>
     * The amount of funds expected from the prospect.
     * 
     */
    @JsonProperty("givingExpectation")
    @JsonPropertyDescription("The amount of funds expected from the prospect.")
    private Object givingExpectation;
    /**
     * Target Gift Level
     * <p>
     * The target gift level associated with the prospect.
     * 
     */
    @JsonProperty("targetGiftLevel")
    @JsonPropertyDescription("The target gift level associated with the prospect.")
    private Object targetGiftLevel;
    /**
     * Campaign
     * <p>
     * The campaign to which the prospect is associated.
     * 
     */
    @JsonProperty("campaign")
    @JsonPropertyDescription("The campaign to which the prospect is associated.")
    private Object campaign;
    /**
     * Primary Contact
     * <p>
     * The primary contact for the prospect.
     * (Required)
     * 
     */
    @JsonProperty("primaryContact")
    @JsonPropertyDescription("The primary contact for the prospect.")
    private PrimaryContact primaryContact;
    /**
     * Persons
     * <p>
     * The people associated with the prospect.
     * 
     */
    @JsonProperty("persons")
    @JsonPropertyDescription("The people associated with the prospect.")
    private List<Person> persons = new ArrayList<Person>();
    /**
     * Organizations
     * <p>
     * The organizations associated with the prospect.
     * 
     */
    @JsonProperty("organizations")
    @JsonPropertyDescription("The organizations associated with the prospect.")
    private List<Organization> organizations = new ArrayList<Organization>();
    /**
     * Groups
     * <p>
     * The group associated with the prospect.
     * 
     */
    @JsonProperty("groups")
    @JsonPropertyDescription("The group associated with the prospect.")
    private List<Group> groups = new ArrayList<Group>();
    /**
     * Assignments
     * <p>
     * The persons or teams assigned to the prospect.
     * 
     */
    @JsonProperty("assignments")
    @JsonPropertyDescription("The persons or teams assigned to the prospect.")
    private List<Assignment> assignments = new ArrayList<Assignment>();
    /**
     * Stages
     * <p>
     * The stage of the prospect.
     * 
     */
    @JsonProperty("stages")
    @JsonPropertyDescription("The stage of the prospect.")
    private List<Stage> stages = new ArrayList<Stage>();
    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the prospect.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Notes/comments that have been generated regarding the prospect.")
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

    public AdvancementProspects withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the advancement prospect.
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
     * The global identifier of the advancement prospect.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdvancementProspects withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the advancement prospect.
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
     * The full name of the advancement prospect.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdvancementProspects withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the prospect.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the prospect.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdvancementProspects withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of prospect.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AdvancementProspects.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of prospect.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AdvancementProspects.Type type) {
        this.type = type;
    }

    public AdvancementProspects withType(AdvancementProspects.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of information for the prospect.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of information for the prospect.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public AdvancementProspects withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the prospect.
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
     * The status of the prospect.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public AdvancementProspects withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date of the time period defined for the prospect.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date of the time period defined for the prospect.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public AdvancementProspects withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date of the time period defined for the prospect.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date of the time period defined for the prospect.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public AdvancementProspects withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Giving Expectation
     * <p>
     * The amount of funds expected from the prospect.
     * 
     */
    @JsonProperty("givingExpectation")
    public Object getGivingExpectation() {
        return givingExpectation;
    }

    /**
     * Giving Expectation
     * <p>
     * The amount of funds expected from the prospect.
     * 
     */
    @JsonProperty("givingExpectation")
    public void setGivingExpectation(Object givingExpectation) {
        this.givingExpectation = givingExpectation;
    }

    public AdvancementProspects withGivingExpectation(Object givingExpectation) {
        this.givingExpectation = givingExpectation;
        return this;
    }

    /**
     * Target Gift Level
     * <p>
     * The target gift level associated with the prospect.
     * 
     */
    @JsonProperty("targetGiftLevel")
    public Object getTargetGiftLevel() {
        return targetGiftLevel;
    }

    /**
     * Target Gift Level
     * <p>
     * The target gift level associated with the prospect.
     * 
     */
    @JsonProperty("targetGiftLevel")
    public void setTargetGiftLevel(Object targetGiftLevel) {
        this.targetGiftLevel = targetGiftLevel;
    }

    public AdvancementProspects withTargetGiftLevel(Object targetGiftLevel) {
        this.targetGiftLevel = targetGiftLevel;
        return this;
    }

    /**
     * Campaign
     * <p>
     * The campaign to which the prospect is associated.
     * 
     */
    @JsonProperty("campaign")
    public Object getCampaign() {
        return campaign;
    }

    /**
     * Campaign
     * <p>
     * The campaign to which the prospect is associated.
     * 
     */
    @JsonProperty("campaign")
    public void setCampaign(Object campaign) {
        this.campaign = campaign;
    }

    public AdvancementProspects withCampaign(Object campaign) {
        this.campaign = campaign;
        return this;
    }

    /**
     * Primary Contact
     * <p>
     * The primary contact for the prospect.
     * (Required)
     * 
     */
    @JsonProperty("primaryContact")
    public PrimaryContact getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Primary Contact
     * <p>
     * The primary contact for the prospect.
     * (Required)
     * 
     */
    @JsonProperty("primaryContact")
    public void setPrimaryContact(PrimaryContact primaryContact) {
        this.primaryContact = primaryContact;
    }

    public AdvancementProspects withPrimaryContact(PrimaryContact primaryContact) {
        this.primaryContact = primaryContact;
        return this;
    }

    /**
     * Persons
     * <p>
     * The people associated with the prospect.
     * 
     */
    @JsonProperty("persons")
    public List<Person> getPersons() {
        return persons;
    }

    /**
     * Persons
     * <p>
     * The people associated with the prospect.
     * 
     */
    @JsonProperty("persons")
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public AdvancementProspects withPersons(List<Person> persons) {
        this.persons = persons;
        return this;
    }

    /**
     * Organizations
     * <p>
     * The organizations associated with the prospect.
     * 
     */
    @JsonProperty("organizations")
    public List<Organization> getOrganizations() {
        return organizations;
    }

    /**
     * Organizations
     * <p>
     * The organizations associated with the prospect.
     * 
     */
    @JsonProperty("organizations")
    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    public AdvancementProspects withOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
        return this;
    }

    /**
     * Groups
     * <p>
     * The group associated with the prospect.
     * 
     */
    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    /**
     * Groups
     * <p>
     * The group associated with the prospect.
     * 
     */
    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public AdvancementProspects withGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Assignments
     * <p>
     * The persons or teams assigned to the prospect.
     * 
     */
    @JsonProperty("assignments")
    public List<Assignment> getAssignments() {
        return assignments;
    }

    /**
     * Assignments
     * <p>
     * The persons or teams assigned to the prospect.
     * 
     */
    @JsonProperty("assignments")
    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public AdvancementProspects withAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
        return this;
    }

    /**
     * Stages
     * <p>
     * The stage of the prospect.
     * 
     */
    @JsonProperty("stages")
    public List<Stage> getStages() {
        return stages;
    }

    /**
     * Stages
     * <p>
     * The stage of the prospect.
     * 
     */
    @JsonProperty("stages")
    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

    public AdvancementProspects withStages(List<Stage> stages) {
        this.stages = stages;
        return this;
    }

    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the prospect.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the prospect.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public AdvancementProspects withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdvancementProspects.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("givingExpectation");
        sb.append('=');
        sb.append(((this.givingExpectation == null)?"<null>":this.givingExpectation));
        sb.append(',');
        sb.append("targetGiftLevel");
        sb.append('=');
        sb.append(((this.targetGiftLevel == null)?"<null>":this.targetGiftLevel));
        sb.append(',');
        sb.append("campaign");
        sb.append('=');
        sb.append(((this.campaign == null)?"<null>":this.campaign));
        sb.append(',');
        sb.append("primaryContact");
        sb.append('=');
        sb.append(((this.primaryContact == null)?"<null>":this.primaryContact));
        sb.append(',');
        sb.append("persons");
        sb.append('=');
        sb.append(((this.persons == null)?"<null>":this.persons));
        sb.append(',');
        sb.append("organizations");
        sb.append('=');
        sb.append(((this.organizations == null)?"<null>":this.organizations));
        sb.append(',');
        sb.append("groups");
        sb.append('=');
        sb.append(((this.groups == null)?"<null>":this.groups));
        sb.append(',');
        sb.append("assignments");
        sb.append('=');
        sb.append(((this.assignments == null)?"<null>":this.assignments));
        sb.append(',');
        sb.append("stages");
        sb.append('=');
        sb.append(((this.stages == null)?"<null>":this.stages));
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
        result = ((result* 31)+((this.givingExpectation == null)? 0 :this.givingExpectation.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.assignments == null)? 0 :this.assignments.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.groups == null)? 0 :this.groups.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.targetGiftLevel == null)? 0 :this.targetGiftLevel.hashCode()));
        result = ((result* 31)+((this.persons == null)? 0 :this.persons.hashCode()));
        result = ((result* 31)+((this.primaryContact == null)? 0 :this.primaryContact.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.organizations == null)? 0 :this.organizations.hashCode()));
        result = ((result* 31)+((this.stages == null)? 0 :this.stages.hashCode()));
        result = ((result* 31)+((this.campaign == null)? 0 :this.campaign.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvancementProspects) == false) {
            return false;
        }
        AdvancementProspects rhs = ((AdvancementProspects) other);
        return ((((((((((((((((((((this.givingExpectation == rhs.givingExpectation)||((this.givingExpectation!= null)&&this.givingExpectation.equals(rhs.givingExpectation)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.assignments == rhs.assignments)||((this.assignments!= null)&&this.assignments.equals(rhs.assignments))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.groups == rhs.groups)||((this.groups!= null)&&this.groups.equals(rhs.groups))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.targetGiftLevel == rhs.targetGiftLevel)||((this.targetGiftLevel!= null)&&this.targetGiftLevel.equals(rhs.targetGiftLevel))))&&((this.persons == rhs.persons)||((this.persons!= null)&&this.persons.equals(rhs.persons))))&&((this.primaryContact == rhs.primaryContact)||((this.primaryContact!= null)&&this.primaryContact.equals(rhs.primaryContact))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.organizations == rhs.organizations)||((this.organizations!= null)&&this.organizations.equals(rhs.organizations))))&&((this.stages == rhs.stages)||((this.stages!= null)&&this.stages.equals(rhs.stages))))&&((this.campaign == rhs.campaign)||((this.campaign!= null)&&this.campaign.equals(rhs.campaign))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Type
     * <p>
     * The type of prospect.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        INDIVIDUAL("individual"),
        FAMILY_FOUNDATION("familyFoundation"),
        FOUNDATION("foundation"),
        CORPORATION("corporation"),
        COUPLE("couple"),
        GROUP("group");
        private final String value;
        private final static Map<String, AdvancementProspects.Type> CONSTANTS = new HashMap<String, AdvancementProspects.Type>();

        static {
            for (AdvancementProspects.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static AdvancementProspects.Type fromValue(String value) {
            AdvancementProspects.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
