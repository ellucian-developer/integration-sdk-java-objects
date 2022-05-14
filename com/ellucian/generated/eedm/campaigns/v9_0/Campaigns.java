
package com.ellucian.generated.eedm.campaigns.v9_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Campaigns
 * <p>
 * A systematic course of fundraising activities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "code",
    "purpose",
    "startOn",
    "endOn",
    "parentCampaign",
    "institutionalUnits",
    "rule",
    "fundRaisingGoal",
    "contributionsGoal",
    "donorsGoal",
    "pyramidLevels",
    "notes",
    "assignments"
})
@Generated("jsonschema2pojo")
public class Campaigns {

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
     * A global identifier of the campaign.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of the campaign.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the campaign.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the campaign.")
    private String title;
    /**
     * Code
     * <p>
     * A short identifier of the campaign.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A short identifier of the campaign.")
    private String code;
    /**
     * Purpose
     * <p>
     * The stated purpose of the campaign.
     * 
     */
    @JsonProperty("purpose")
    @JsonPropertyDescription("The stated purpose of the campaign.")
    private String purpose;
    /**
     * Start Date
     * <p>
     * The date when the campaign started (or is scheduled to start).
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the campaign started (or is scheduled to start).")
    private Object startOn;
    /**
     * End Date
     * <p>
     * The date when a campaign ended  (or is scheduled to end).
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when a campaign ended  (or is scheduled to end).")
    private Object endOn;
    /**
     * Parent Campaign
     * <p>
     * The campaign to which this campaign is subordinate.
     * 
     */
    @JsonProperty("parentCampaign")
    @JsonPropertyDescription("The campaign to which this campaign is subordinate.")
    private Object parentCampaign;
    /**
     * Institutional Units
     * <p>
     * The institutional units associated with the campaign.
     * 
     */
    @JsonProperty("institutionalUnits")
    @JsonPropertyDescription("The institutional units associated with the campaign.")
    private List<InstitutionalUnit> institutionalUnits = new ArrayList<InstitutionalUnit>();
    /**
     * Rule
     * <p>
     * The rule that is used to calculate totals for the campaign.
     * 
     */
    @JsonProperty("rule")
    @JsonPropertyDescription("The rule that is used to calculate totals for the campaign.")
    private Object rule;
    /**
     * Fundraising Goal
     * <p>
     * The desired amount of funds to be raised by the campaign.
     * 
     */
    @JsonProperty("fundRaisingGoal")
    @JsonPropertyDescription("The desired amount of funds to be raised by the campaign.")
    private Object fundRaisingGoal;
    /**
     * Contributions Goal
     * <p>
     * The number of individual contributions that is desired for the campaign.
     * 
     */
    @JsonProperty("contributionsGoal")
    @JsonPropertyDescription("The number of individual contributions that is desired for the campaign.")
    private Object contributionsGoal;
    /**
     * Donors Goal
     * <p>
     * The number of individual donors that is desired for the campaign.
     * 
     */
    @JsonProperty("donorsGoal")
    @JsonPropertyDescription("The number of individual donors that is desired for the campaign.")
    private Object donorsGoal;
    /**
     * Pyramid Levels
     * <p>
     * Defined levels of contribution (based on contribution amounts) with targets for contributions, donors, and funds raised.
     * 
     */
    @JsonProperty("pyramidLevels")
    @JsonPropertyDescription("Defined levels of contribution (based on contribution amounts) with targets for contributions, donors, and funds raised.")
    private List<PyramidLevel> pyramidLevels = new ArrayList<PyramidLevel>();
    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the campaign
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Notes/comments that have been generated regarding the campaign")
    private List<Note> notes = new ArrayList<Note>();
    /**
     * Assignments
     * <p>
     * The staff members or teams of staff members who are assigned to work on the campaign.
     * 
     */
    @JsonProperty("assignments")
    @JsonPropertyDescription("The staff members or teams of staff members who are assigned to work on the campaign.")
    private List<Assignment> assignments = new ArrayList<Assignment>();

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

    public Campaigns withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of the campaign.
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
     * A global identifier of the campaign.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Campaigns withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the campaign.
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
     * The full name of the campaign.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Campaigns withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Code
     * <p>
     * A short identifier of the campaign.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A short identifier of the campaign.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Campaigns withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Purpose
     * <p>
     * The stated purpose of the campaign.
     * 
     */
    @JsonProperty("purpose")
    public String getPurpose() {
        return purpose;
    }

    /**
     * Purpose
     * <p>
     * The stated purpose of the campaign.
     * 
     */
    @JsonProperty("purpose")
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Campaigns withPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date when the campaign started (or is scheduled to start).
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date when the campaign started (or is scheduled to start).
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Campaigns withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date when a campaign ended  (or is scheduled to end).
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The date when a campaign ended  (or is scheduled to end).
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Campaigns withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Parent Campaign
     * <p>
     * The campaign to which this campaign is subordinate.
     * 
     */
    @JsonProperty("parentCampaign")
    public Object getParentCampaign() {
        return parentCampaign;
    }

    /**
     * Parent Campaign
     * <p>
     * The campaign to which this campaign is subordinate.
     * 
     */
    @JsonProperty("parentCampaign")
    public void setParentCampaign(Object parentCampaign) {
        this.parentCampaign = parentCampaign;
    }

    public Campaigns withParentCampaign(Object parentCampaign) {
        this.parentCampaign = parentCampaign;
        return this;
    }

    /**
     * Institutional Units
     * <p>
     * The institutional units associated with the campaign.
     * 
     */
    @JsonProperty("institutionalUnits")
    public List<InstitutionalUnit> getInstitutionalUnits() {
        return institutionalUnits;
    }

    /**
     * Institutional Units
     * <p>
     * The institutional units associated with the campaign.
     * 
     */
    @JsonProperty("institutionalUnits")
    public void setInstitutionalUnits(List<InstitutionalUnit> institutionalUnits) {
        this.institutionalUnits = institutionalUnits;
    }

    public Campaigns withInstitutionalUnits(List<InstitutionalUnit> institutionalUnits) {
        this.institutionalUnits = institutionalUnits;
        return this;
    }

    /**
     * Rule
     * <p>
     * The rule that is used to calculate totals for the campaign.
     * 
     */
    @JsonProperty("rule")
    public Object getRule() {
        return rule;
    }

    /**
     * Rule
     * <p>
     * The rule that is used to calculate totals for the campaign.
     * 
     */
    @JsonProperty("rule")
    public void setRule(Object rule) {
        this.rule = rule;
    }

    public Campaigns withRule(Object rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Fundraising Goal
     * <p>
     * The desired amount of funds to be raised by the campaign.
     * 
     */
    @JsonProperty("fundRaisingGoal")
    public Object getFundRaisingGoal() {
        return fundRaisingGoal;
    }

    /**
     * Fundraising Goal
     * <p>
     * The desired amount of funds to be raised by the campaign.
     * 
     */
    @JsonProperty("fundRaisingGoal")
    public void setFundRaisingGoal(Object fundRaisingGoal) {
        this.fundRaisingGoal = fundRaisingGoal;
    }

    public Campaigns withFundRaisingGoal(Object fundRaisingGoal) {
        this.fundRaisingGoal = fundRaisingGoal;
        return this;
    }

    /**
     * Contributions Goal
     * <p>
     * The number of individual contributions that is desired for the campaign.
     * 
     */
    @JsonProperty("contributionsGoal")
    public Object getContributionsGoal() {
        return contributionsGoal;
    }

    /**
     * Contributions Goal
     * <p>
     * The number of individual contributions that is desired for the campaign.
     * 
     */
    @JsonProperty("contributionsGoal")
    public void setContributionsGoal(Object contributionsGoal) {
        this.contributionsGoal = contributionsGoal;
    }

    public Campaigns withContributionsGoal(Object contributionsGoal) {
        this.contributionsGoal = contributionsGoal;
        return this;
    }

    /**
     * Donors Goal
     * <p>
     * The number of individual donors that is desired for the campaign.
     * 
     */
    @JsonProperty("donorsGoal")
    public Object getDonorsGoal() {
        return donorsGoal;
    }

    /**
     * Donors Goal
     * <p>
     * The number of individual donors that is desired for the campaign.
     * 
     */
    @JsonProperty("donorsGoal")
    public void setDonorsGoal(Object donorsGoal) {
        this.donorsGoal = donorsGoal;
    }

    public Campaigns withDonorsGoal(Object donorsGoal) {
        this.donorsGoal = donorsGoal;
        return this;
    }

    /**
     * Pyramid Levels
     * <p>
     * Defined levels of contribution (based on contribution amounts) with targets for contributions, donors, and funds raised.
     * 
     */
    @JsonProperty("pyramidLevels")
    public List<PyramidLevel> getPyramidLevels() {
        return pyramidLevels;
    }

    /**
     * Pyramid Levels
     * <p>
     * Defined levels of contribution (based on contribution amounts) with targets for contributions, donors, and funds raised.
     * 
     */
    @JsonProperty("pyramidLevels")
    public void setPyramidLevels(List<PyramidLevel> pyramidLevels) {
        this.pyramidLevels = pyramidLevels;
    }

    public Campaigns withPyramidLevels(List<PyramidLevel> pyramidLevels) {
        this.pyramidLevels = pyramidLevels;
        return this;
    }

    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the campaign
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * Notes/comments that have been generated regarding the campaign
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Campaigns withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Assignments
     * <p>
     * The staff members or teams of staff members who are assigned to work on the campaign.
     * 
     */
    @JsonProperty("assignments")
    public List<Assignment> getAssignments() {
        return assignments;
    }

    /**
     * Assignments
     * <p>
     * The staff members or teams of staff members who are assigned to work on the campaign.
     * 
     */
    @JsonProperty("assignments")
    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public Campaigns withAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Campaigns.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("purpose");
        sb.append('=');
        sb.append(((this.purpose == null)?"<null>":this.purpose));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("parentCampaign");
        sb.append('=');
        sb.append(((this.parentCampaign == null)?"<null>":this.parentCampaign));
        sb.append(',');
        sb.append("institutionalUnits");
        sb.append('=');
        sb.append(((this.institutionalUnits == null)?"<null>":this.institutionalUnits));
        sb.append(',');
        sb.append("rule");
        sb.append('=');
        sb.append(((this.rule == null)?"<null>":this.rule));
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
        sb.append("pyramidLevels");
        sb.append('=');
        sb.append(((this.pyramidLevels == null)?"<null>":this.pyramidLevels));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("assignments");
        sb.append('=');
        sb.append(((this.assignments == null)?"<null>":this.assignments));
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
        result = ((result* 31)+((this.parentCampaign == null)? 0 :this.parentCampaign.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.assignments == null)? 0 :this.assignments.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.pyramidLevels == null)? 0 :this.pyramidLevels.hashCode()));
        result = ((result* 31)+((this.institutionalUnits == null)? 0 :this.institutionalUnits.hashCode()));
        result = ((result* 31)+((this.rule == null)? 0 :this.rule.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.fundRaisingGoal == null)? 0 :this.fundRaisingGoal.hashCode()));
        result = ((result* 31)+((this.contributionsGoal == null)? 0 :this.contributionsGoal.hashCode()));
        result = ((result* 31)+((this.donorsGoal == null)? 0 :this.donorsGoal.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Campaigns) == false) {
            return false;
        }
        Campaigns rhs = ((Campaigns) other);
        return (((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.parentCampaign == rhs.parentCampaign)||((this.parentCampaign!= null)&&this.parentCampaign.equals(rhs.parentCampaign))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.assignments == rhs.assignments)||((this.assignments!= null)&&this.assignments.equals(rhs.assignments))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.pyramidLevels == rhs.pyramidLevels)||((this.pyramidLevels!= null)&&this.pyramidLevels.equals(rhs.pyramidLevels))))&&((this.institutionalUnits == rhs.institutionalUnits)||((this.institutionalUnits!= null)&&this.institutionalUnits.equals(rhs.institutionalUnits))))&&((this.rule == rhs.rule)||((this.rule!= null)&&this.rule.equals(rhs.rule))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.fundRaisingGoal == rhs.fundRaisingGoal)||((this.fundRaisingGoal!= null)&&this.fundRaisingGoal.equals(rhs.fundRaisingGoal))))&&((this.contributionsGoal == rhs.contributionsGoal)||((this.contributionsGoal!= null)&&this.contributionsGoal.equals(rhs.contributionsGoal))))&&((this.donorsGoal == rhs.donorsGoal)||((this.donorsGoal!= null)&&this.donorsGoal.equals(rhs.donorsGoal))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
