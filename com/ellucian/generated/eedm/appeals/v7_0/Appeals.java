
package com.ellucian.generated.eedm.appeals.v7_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Appeals
 * <p>
 * Fund raising activities associated with a communication plan.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "communicationPlan",
    "type",
    "contactMethod",
    "nameType",
    "author",
    "vendor",
    "source",
    "startOn",
    "endOn",
    "targetDate",
    "actualDate",
    "status",
    "fundRaisingGoal",
    "contributionsGoal",
    "donorsGoal",
    "marketingLists",
    "budget",
    "actualCost",
    "categories",
    "notes"
})
@Generated("jsonschema2pojo")
public class Appeals {

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
     * The global identifier of the appeal.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the appeal.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the appeal.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the appeal.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the appeal.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the appeal.")
    private String description;
    /**
     * Code
     * <p>
     * A code that may be used to identify the appeal.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the appeal.")
    private String code;
    /**
     * Communication Plan
     * <p>
     * The communication plan to which the appeal is associated.
     * (Required)
     * 
     */
    @JsonProperty("communicationPlan")
    @JsonPropertyDescription("The communication plan to which the appeal is associated.")
    private CommunicationPlan communicationPlan;
    /**
     * Type
     * <p>
     * The type of the appeal.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the appeal.")
    private Object type;
    /**
     * Contact Method
     * <p>
     * The method to be used to contact constituents for the appeal.
     * 
     */
    @JsonProperty("contactMethod")
    @JsonPropertyDescription("The method to be used to contact constituents for the appeal.")
    private Object contactMethod;
    /**
     * Name Type
     * <p>
     * The type of formatted name for constituents that should be used for the appeal.
     * 
     */
    @JsonProperty("nameType")
    @JsonPropertyDescription("The type of formatted name for constituents that should be used for the appeal.")
    private Object nameType;
    /**
     * Author
     * <p>
     * The person making the appeal, if applicable.
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("The person making the appeal, if applicable.")
    private Object author;
    /**
     * Vendor
     * <p>
     * The vendor selected to support the appeal.
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("The vendor selected to support the appeal.")
    private Object vendor;
    /**
     * Source
     * <p>
     * The source of data used in the appeal.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of data used in the appeal.")
    private Object source;
    /**
     * Start On
     * <p>
     * The first date of the time period defined for the appeal.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date of the time period defined for the appeal.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date of the time period defined for the appeal.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date of the time period defined for the appeal.")
    private Object endOn;
    /**
     * Target Date
     * <p>
     * The date the activity of the appeal is expected to occur.
     * 
     */
    @JsonProperty("targetDate")
    @JsonPropertyDescription("The date the activity of the appeal is expected to occur.")
    private Object targetDate;
    /**
     * Actual Date
     * <p>
     * The date the activity of the appeal actually occurred.
     * 
     */
    @JsonProperty("actualDate")
    @JsonPropertyDescription("The date the activity of the appeal actually occurred.")
    private Object actualDate;
    /**
     * Status
     * <p>
     * The status of the appeal
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the appeal")
    private Appeals.Status status;
    /**
     * Fund Raising Goal
     * <p>
     * The desired amount of funds to be raised by the appeal.
     * 
     */
    @JsonProperty("fundRaisingGoal")
    @JsonPropertyDescription("The desired amount of funds to be raised by the appeal.")
    private Object fundRaisingGoal;
    /**
     * Contributions Goal
     * <p>
     * The number of individual contributions that is desired for the appeal.
     * 
     */
    @JsonProperty("contributionsGoal")
    @JsonPropertyDescription("The number of individual contributions that is desired for the appeal.")
    private Object contributionsGoal;
    /**
     * Donors Goal
     * <p>
     * The number of individual donors that is desired for the appeal.
     * 
     */
    @JsonProperty("donorsGoal")
    @JsonPropertyDescription("The number of individual donors that is desired for the appeal.")
    private Object donorsGoal;
    /**
     * Marketing Lists
     * <p>
     * The marketing lists used for the appeal.
     * 
     */
    @JsonProperty("marketingLists")
    @JsonPropertyDescription("The marketing lists used for the appeal.")
    private List<MarketingList> marketingLists = new ArrayList<MarketingList>();
    /**
     * Budget
     * <p>
     * The budget allocated for the appeal.
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("The budget allocated for the appeal.")
    private Object budget;
    /**
     * Actual Cost
     * <p>
     * The actual cost of the appeal.
     * 
     */
    @JsonProperty("actualCost")
    @JsonPropertyDescription("The actual cost of the appeal.")
    private Object actualCost;
    /**
     * Categories
     * <p>
     * A group of custom categorizations use for appeals.
     * 
     */
    @JsonProperty("categories")
    @JsonPropertyDescription("A group of custom categorizations use for appeals.")
    private Categories categories;
    /**
     * Notes
     * <p>
     * A list of notes made concerning the appeal.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("A list of notes made concerning the appeal.")
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

    public Appeals withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the appeal.
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
     * The global identifier of the appeal.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Appeals withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the appeal.
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
     * The full name of the appeal.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Appeals withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the appeal.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the appeal.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Appeals withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the appeal.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the appeal.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Appeals withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Communication Plan
     * <p>
     * The communication plan to which the appeal is associated.
     * (Required)
     * 
     */
    @JsonProperty("communicationPlan")
    public CommunicationPlan getCommunicationPlan() {
        return communicationPlan;
    }

    /**
     * Communication Plan
     * <p>
     * The communication plan to which the appeal is associated.
     * (Required)
     * 
     */
    @JsonProperty("communicationPlan")
    public void setCommunicationPlan(CommunicationPlan communicationPlan) {
        this.communicationPlan = communicationPlan;
    }

    public Appeals withCommunicationPlan(CommunicationPlan communicationPlan) {
        this.communicationPlan = communicationPlan;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the appeal.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the appeal.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public Appeals withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Contact Method
     * <p>
     * The method to be used to contact constituents for the appeal.
     * 
     */
    @JsonProperty("contactMethod")
    public Object getContactMethod() {
        return contactMethod;
    }

    /**
     * Contact Method
     * <p>
     * The method to be used to contact constituents for the appeal.
     * 
     */
    @JsonProperty("contactMethod")
    public void setContactMethod(Object contactMethod) {
        this.contactMethod = contactMethod;
    }

    public Appeals withContactMethod(Object contactMethod) {
        this.contactMethod = contactMethod;
        return this;
    }

    /**
     * Name Type
     * <p>
     * The type of formatted name for constituents that should be used for the appeal.
     * 
     */
    @JsonProperty("nameType")
    public Object getNameType() {
        return nameType;
    }

    /**
     * Name Type
     * <p>
     * The type of formatted name for constituents that should be used for the appeal.
     * 
     */
    @JsonProperty("nameType")
    public void setNameType(Object nameType) {
        this.nameType = nameType;
    }

    public Appeals withNameType(Object nameType) {
        this.nameType = nameType;
        return this;
    }

    /**
     * Author
     * <p>
     * The person making the appeal, if applicable.
     * 
     */
    @JsonProperty("author")
    public Object getAuthor() {
        return author;
    }

    /**
     * Author
     * <p>
     * The person making the appeal, if applicable.
     * 
     */
    @JsonProperty("author")
    public void setAuthor(Object author) {
        this.author = author;
    }

    public Appeals withAuthor(Object author) {
        this.author = author;
        return this;
    }

    /**
     * Vendor
     * <p>
     * The vendor selected to support the appeal.
     * 
     */
    @JsonProperty("vendor")
    public Object getVendor() {
        return vendor;
    }

    /**
     * Vendor
     * <p>
     * The vendor selected to support the appeal.
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Object vendor) {
        this.vendor = vendor;
    }

    public Appeals withVendor(Object vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of data used in the appeal.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of data used in the appeal.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public Appeals withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date of the time period defined for the appeal.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date of the time period defined for the appeal.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Appeals withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date of the time period defined for the appeal.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date of the time period defined for the appeal.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Appeals withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Target Date
     * <p>
     * The date the activity of the appeal is expected to occur.
     * 
     */
    @JsonProperty("targetDate")
    public Object getTargetDate() {
        return targetDate;
    }

    /**
     * Target Date
     * <p>
     * The date the activity of the appeal is expected to occur.
     * 
     */
    @JsonProperty("targetDate")
    public void setTargetDate(Object targetDate) {
        this.targetDate = targetDate;
    }

    public Appeals withTargetDate(Object targetDate) {
        this.targetDate = targetDate;
        return this;
    }

    /**
     * Actual Date
     * <p>
     * The date the activity of the appeal actually occurred.
     * 
     */
    @JsonProperty("actualDate")
    public Object getActualDate() {
        return actualDate;
    }

    /**
     * Actual Date
     * <p>
     * The date the activity of the appeal actually occurred.
     * 
     */
    @JsonProperty("actualDate")
    public void setActualDate(Object actualDate) {
        this.actualDate = actualDate;
    }

    public Appeals withActualDate(Object actualDate) {
        this.actualDate = actualDate;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the appeal
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Appeals.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the appeal
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Appeals.Status status) {
        this.status = status;
    }

    public Appeals withStatus(Appeals.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Fund Raising Goal
     * <p>
     * The desired amount of funds to be raised by the appeal.
     * 
     */
    @JsonProperty("fundRaisingGoal")
    public Object getFundRaisingGoal() {
        return fundRaisingGoal;
    }

    /**
     * Fund Raising Goal
     * <p>
     * The desired amount of funds to be raised by the appeal.
     * 
     */
    @JsonProperty("fundRaisingGoal")
    public void setFundRaisingGoal(Object fundRaisingGoal) {
        this.fundRaisingGoal = fundRaisingGoal;
    }

    public Appeals withFundRaisingGoal(Object fundRaisingGoal) {
        this.fundRaisingGoal = fundRaisingGoal;
        return this;
    }

    /**
     * Contributions Goal
     * <p>
     * The number of individual contributions that is desired for the appeal.
     * 
     */
    @JsonProperty("contributionsGoal")
    public Object getContributionsGoal() {
        return contributionsGoal;
    }

    /**
     * Contributions Goal
     * <p>
     * The number of individual contributions that is desired for the appeal.
     * 
     */
    @JsonProperty("contributionsGoal")
    public void setContributionsGoal(Object contributionsGoal) {
        this.contributionsGoal = contributionsGoal;
    }

    public Appeals withContributionsGoal(Object contributionsGoal) {
        this.contributionsGoal = contributionsGoal;
        return this;
    }

    /**
     * Donors Goal
     * <p>
     * The number of individual donors that is desired for the appeal.
     * 
     */
    @JsonProperty("donorsGoal")
    public Object getDonorsGoal() {
        return donorsGoal;
    }

    /**
     * Donors Goal
     * <p>
     * The number of individual donors that is desired for the appeal.
     * 
     */
    @JsonProperty("donorsGoal")
    public void setDonorsGoal(Object donorsGoal) {
        this.donorsGoal = donorsGoal;
    }

    public Appeals withDonorsGoal(Object donorsGoal) {
        this.donorsGoal = donorsGoal;
        return this;
    }

    /**
     * Marketing Lists
     * <p>
     * The marketing lists used for the appeal.
     * 
     */
    @JsonProperty("marketingLists")
    public List<MarketingList> getMarketingLists() {
        return marketingLists;
    }

    /**
     * Marketing Lists
     * <p>
     * The marketing lists used for the appeal.
     * 
     */
    @JsonProperty("marketingLists")
    public void setMarketingLists(List<MarketingList> marketingLists) {
        this.marketingLists = marketingLists;
    }

    public Appeals withMarketingLists(List<MarketingList> marketingLists) {
        this.marketingLists = marketingLists;
        return this;
    }

    /**
     * Budget
     * <p>
     * The budget allocated for the appeal.
     * 
     */
    @JsonProperty("budget")
    public Object getBudget() {
        return budget;
    }

    /**
     * Budget
     * <p>
     * The budget allocated for the appeal.
     * 
     */
    @JsonProperty("budget")
    public void setBudget(Object budget) {
        this.budget = budget;
    }

    public Appeals withBudget(Object budget) {
        this.budget = budget;
        return this;
    }

    /**
     * Actual Cost
     * <p>
     * The actual cost of the appeal.
     * 
     */
    @JsonProperty("actualCost")
    public Object getActualCost() {
        return actualCost;
    }

    /**
     * Actual Cost
     * <p>
     * The actual cost of the appeal.
     * 
     */
    @JsonProperty("actualCost")
    public void setActualCost(Object actualCost) {
        this.actualCost = actualCost;
    }

    public Appeals withActualCost(Object actualCost) {
        this.actualCost = actualCost;
        return this;
    }

    /**
     * Categories
     * <p>
     * A group of custom categorizations use for appeals.
     * 
     */
    @JsonProperty("categories")
    public Categories getCategories() {
        return categories;
    }

    /**
     * Categories
     * <p>
     * A group of custom categorizations use for appeals.
     * 
     */
    @JsonProperty("categories")
    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Appeals withCategories(Categories categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Notes
     * <p>
     * A list of notes made concerning the appeal.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * A list of notes made concerning the appeal.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Appeals withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Appeals.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("communicationPlan");
        sb.append('=');
        sb.append(((this.communicationPlan == null)?"<null>":this.communicationPlan));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("contactMethod");
        sb.append('=');
        sb.append(((this.contactMethod == null)?"<null>":this.contactMethod));
        sb.append(',');
        sb.append("nameType");
        sb.append('=');
        sb.append(((this.nameType == null)?"<null>":this.nameType));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("targetDate");
        sb.append('=');
        sb.append(((this.targetDate == null)?"<null>":this.targetDate));
        sb.append(',');
        sb.append("actualDate");
        sb.append('=');
        sb.append(((this.actualDate == null)?"<null>":this.actualDate));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("fundRaisingGoal");
        sb.append('=');
        sb.append(((this.fundRaisingGoal == null)?"<null>":this.fundRaisingGoal));
        sb.append(',');
        sb.append("contributionsGoal");
        sb.append('=');
        sb.append(((this.contributionsGoal == null)?"<null>":this.contributionsGoal));
        sb.append(',');
        sb.append("donorsGoal");
        sb.append('=');
        sb.append(((this.donorsGoal == null)?"<null>":this.donorsGoal));
        sb.append(',');
        sb.append("marketingLists");
        sb.append('=');
        sb.append(((this.marketingLists == null)?"<null>":this.marketingLists));
        sb.append(',');
        sb.append("budget");
        sb.append('=');
        sb.append(((this.budget == null)?"<null>":this.budget));
        sb.append(',');
        sb.append("actualCost");
        sb.append('=');
        sb.append(((this.actualCost == null)?"<null>":this.actualCost));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.nameType == null)? 0 :this.nameType.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.contactMethod == null)? 0 :this.contactMethod.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        result = ((result* 31)+((this.actualCost == null)? 0 :this.actualCost.hashCode()));
        result = ((result* 31)+((this.marketingLists == null)? 0 :this.marketingLists.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.targetDate == null)? 0 :this.targetDate.hashCode()));
        result = ((result* 31)+((this.communicationPlan == null)? 0 :this.communicationPlan.hashCode()));
        result = ((result* 31)+((this.fundRaisingGoal == null)? 0 :this.fundRaisingGoal.hashCode()));
        result = ((result* 31)+((this.contributionsGoal == null)? 0 :this.contributionsGoal.hashCode()));
        result = ((result* 31)+((this.donorsGoal == null)? 0 :this.donorsGoal.hashCode()));
        result = ((result* 31)+((this.actualDate == null)? 0 :this.actualDate.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Appeals) == false) {
            return false;
        }
        Appeals rhs = ((Appeals) other);
        return ((((((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.nameType == rhs.nameType)||((this.nameType!= null)&&this.nameType.equals(rhs.nameType))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.contactMethod == rhs.contactMethod)||((this.contactMethod!= null)&&this.contactMethod.equals(rhs.contactMethod))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))))&&((this.actualCost == rhs.actualCost)||((this.actualCost!= null)&&this.actualCost.equals(rhs.actualCost))))&&((this.marketingLists == rhs.marketingLists)||((this.marketingLists!= null)&&this.marketingLists.equals(rhs.marketingLists))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.targetDate == rhs.targetDate)||((this.targetDate!= null)&&this.targetDate.equals(rhs.targetDate))))&&((this.communicationPlan == rhs.communicationPlan)||((this.communicationPlan!= null)&&this.communicationPlan.equals(rhs.communicationPlan))))&&((this.fundRaisingGoal == rhs.fundRaisingGoal)||((this.fundRaisingGoal!= null)&&this.fundRaisingGoal.equals(rhs.fundRaisingGoal))))&&((this.contributionsGoal == rhs.contributionsGoal)||((this.contributionsGoal!= null)&&this.contributionsGoal.equals(rhs.contributionsGoal))))&&((this.donorsGoal == rhs.donorsGoal)||((this.donorsGoal!= null)&&this.donorsGoal.equals(rhs.donorsGoal))))&&((this.actualDate == rhs.actualDate)||((this.actualDate!= null)&&this.actualDate.equals(rhs.actualDate))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the appeal
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        OPEN("open"),
        COMPLETED("completed"),
        CANCELED("canceled");
        private final String value;
        private final static Map<String, Appeals.Status> CONSTANTS = new HashMap<String, Appeals.Status>();

        static {
            for (Appeals.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static Appeals.Status fromValue(String value) {
            Appeals.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
