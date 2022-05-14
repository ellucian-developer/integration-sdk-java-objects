
package com.ellucian.generated.eedm.proposals.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Proposals
 * <p>
 * Requests for contributions from prospects.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "prospect",
    "type",
    "purpose",
    "startOn",
    "endOn",
    "stage",
    "status",
    "probability",
    "parentProposal",
    "changeReason",
    "college",
    "department",
    "division",
    "campaign",
    "amounts",
    "nonContributionAmount",
    "designations",
    "assignments",
    "notes"
})
@Generated("jsonschema2pojo")
public class Proposals {

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
     * The global identifier of the proposal.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the proposal.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the proposal.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the proposal.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the proposal.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the proposal.")
    private String description;
    /**
     * Prospect
     * <p>
     * The prospect associated with the proposal.
     * (Required)
     * 
     */
    @JsonProperty("prospect")
    @JsonPropertyDescription("The prospect associated with the proposal.")
    private Prospect prospect;
    /**
     * Type
     * <p>
     * The proposal's type, e.g. capital funds, scholarships, major gifts, etc.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The proposal's type, e.g. capital funds, scholarships, major gifts, etc.")
    private Object type;
    /**
     * Purpose
     * <p>
     * The purpose for the proposal.
     * 
     */
    @JsonProperty("purpose")
    @JsonPropertyDescription("The purpose for the proposal.")
    private Object purpose;
    /**
     * Start On
     * <p>
     * The date on which the proposal began.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date on which the proposal began.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The date on which the proposal ends.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date on which the proposal ends.")
    private Object endOn;
    /**
     * Stage
     * <p>
     * The proposal's stage, e.g.: cultivating, acknowledging, solicitation, etc.
     * (Required)
     * 
     */
    @JsonProperty("stage")
    @JsonPropertyDescription("The proposal's stage, e.g.: cultivating, acknowledging, solicitation, etc.")
    private Stage stage;
    /**
     * Status
     * <p>
     * The current status of the proposal.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current status of the proposal.")
    private Status status;
    /**
     * Probability
     * <p>
     * The likelihood of granting the proposal, e.g. 50, 75, 100.
     * 
     */
    @JsonProperty("probability")
    @JsonPropertyDescription("The likelihood of granting the proposal, e.g. 50, 75, 100.")
    private Object probability;
    /**
     * Parent Proposal
     * <p>
     * The parent proposal, if it is part of a hierarchy.
     * 
     */
    @JsonProperty("parentProposal")
    @JsonPropertyDescription("The parent proposal, if it is part of a hierarchy.")
    private Object parentProposal;
    /**
     * Change Reason
     * <p>
     * The explanation for a substantial change in proposal expectations.
     * 
     */
    @JsonProperty("changeReason")
    @JsonPropertyDescription("The explanation for a substantial change in proposal expectations.")
    private String changeReason;
    /**
     * College
     * <p>
     * The college that will receive the funds from the proposal.
     * 
     */
    @JsonProperty("college")
    @JsonPropertyDescription("The college that will receive the funds from the proposal.")
    private Object college;
    /**
     * Department
     * <p>
     * The department that will receive the funds from the proposal.
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("The department that will receive the funds from the proposal.")
    private Object department;
    /**
     * Division
     * <p>
     * The division that will receive the funds from the proposal.
     * 
     */
    @JsonProperty("division")
    @JsonPropertyDescription("The division that will receive the funds from the proposal.")
    private Object division;
    /**
     * Campaign
     * <p>
     * The campaign associated with the proposal.
     * 
     */
    @JsonProperty("campaign")
    @JsonPropertyDescription("The campaign associated with the proposal.")
    private Object campaign;
    /**
     * Amounts
     * <p>
     * The amounts associated with the proposal.
     * 
     */
    @JsonProperty("amounts")
    @JsonPropertyDescription("The amounts associated with the proposal.")
    private Amounts amounts;
    /**
     * Non Contribution Amount
     * <p>
     * The amount received for the proposal that does not have a corresponding contribution. e.g: amounts transferred from a legacy system.
     * 
     */
    @JsonProperty("nonContributionAmount")
    @JsonPropertyDescription("The amount received for the proposal that does not have a corresponding contribution. e.g: amounts transferred from a legacy system.")
    private Object nonContributionAmount;
    /**
     * Designations
     * <p>
     * The designations associated with the proposal.
     * 
     */
    @JsonProperty("designations")
    @JsonPropertyDescription("The designations associated with the proposal.")
    private List<Designation> designations = new ArrayList<Designation>();
    /**
     * Assignments
     * <p>
     * The people or teams assigned to the proposal.
     * 
     */
    @JsonProperty("assignments")
    @JsonPropertyDescription("The people or teams assigned to the proposal.")
    private List<Assignment> assignments = new ArrayList<Assignment>();
    /**
     * Notes
     * <p>
     * The notes related to the proposal.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("The notes related to the proposal.")
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

    public Proposals withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the proposal.
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
     * The global identifier of the proposal.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Proposals withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the proposal.
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
     * The full name of the proposal.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Proposals withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the proposal.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the proposal.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Proposals withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Prospect
     * <p>
     * The prospect associated with the proposal.
     * (Required)
     * 
     */
    @JsonProperty("prospect")
    public Prospect getProspect() {
        return prospect;
    }

    /**
     * Prospect
     * <p>
     * The prospect associated with the proposal.
     * (Required)
     * 
     */
    @JsonProperty("prospect")
    public void setProspect(Prospect prospect) {
        this.prospect = prospect;
    }

    public Proposals withProspect(Prospect prospect) {
        this.prospect = prospect;
        return this;
    }

    /**
     * Type
     * <p>
     * The proposal's type, e.g. capital funds, scholarships, major gifts, etc.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The proposal's type, e.g. capital funds, scholarships, major gifts, etc.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public Proposals withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Purpose
     * <p>
     * The purpose for the proposal.
     * 
     */
    @JsonProperty("purpose")
    public Object getPurpose() {
        return purpose;
    }

    /**
     * Purpose
     * <p>
     * The purpose for the proposal.
     * 
     */
    @JsonProperty("purpose")
    public void setPurpose(Object purpose) {
        this.purpose = purpose;
    }

    public Proposals withPurpose(Object purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date on which the proposal began.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date on which the proposal began.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Proposals withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date on which the proposal ends.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date on which the proposal ends.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Proposals withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Stage
     * <p>
     * The proposal's stage, e.g.: cultivating, acknowledging, solicitation, etc.
     * (Required)
     * 
     */
    @JsonProperty("stage")
    public Stage getStage() {
        return stage;
    }

    /**
     * Stage
     * <p>
     * The proposal's stage, e.g.: cultivating, acknowledging, solicitation, etc.
     * (Required)
     * 
     */
    @JsonProperty("stage")
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Proposals withStage(Stage stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Status
     * <p>
     * The current status of the proposal.
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
     * The current status of the proposal.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public Proposals withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Probability
     * <p>
     * The likelihood of granting the proposal, e.g. 50, 75, 100.
     * 
     */
    @JsonProperty("probability")
    public Object getProbability() {
        return probability;
    }

    /**
     * Probability
     * <p>
     * The likelihood of granting the proposal, e.g. 50, 75, 100.
     * 
     */
    @JsonProperty("probability")
    public void setProbability(Object probability) {
        this.probability = probability;
    }

    public Proposals withProbability(Object probability) {
        this.probability = probability;
        return this;
    }

    /**
     * Parent Proposal
     * <p>
     * The parent proposal, if it is part of a hierarchy.
     * 
     */
    @JsonProperty("parentProposal")
    public Object getParentProposal() {
        return parentProposal;
    }

    /**
     * Parent Proposal
     * <p>
     * The parent proposal, if it is part of a hierarchy.
     * 
     */
    @JsonProperty("parentProposal")
    public void setParentProposal(Object parentProposal) {
        this.parentProposal = parentProposal;
    }

    public Proposals withParentProposal(Object parentProposal) {
        this.parentProposal = parentProposal;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * The explanation for a substantial change in proposal expectations.
     * 
     */
    @JsonProperty("changeReason")
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * Change Reason
     * <p>
     * The explanation for a substantial change in proposal expectations.
     * 
     */
    @JsonProperty("changeReason")
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public Proposals withChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    /**
     * College
     * <p>
     * The college that will receive the funds from the proposal.
     * 
     */
    @JsonProperty("college")
    public Object getCollege() {
        return college;
    }

    /**
     * College
     * <p>
     * The college that will receive the funds from the proposal.
     * 
     */
    @JsonProperty("college")
    public void setCollege(Object college) {
        this.college = college;
    }

    public Proposals withCollege(Object college) {
        this.college = college;
        return this;
    }

    /**
     * Department
     * <p>
     * The department that will receive the funds from the proposal.
     * 
     */
    @JsonProperty("department")
    public Object getDepartment() {
        return department;
    }

    /**
     * Department
     * <p>
     * The department that will receive the funds from the proposal.
     * 
     */
    @JsonProperty("department")
    public void setDepartment(Object department) {
        this.department = department;
    }

    public Proposals withDepartment(Object department) {
        this.department = department;
        return this;
    }

    /**
     * Division
     * <p>
     * The division that will receive the funds from the proposal.
     * 
     */
    @JsonProperty("division")
    public Object getDivision() {
        return division;
    }

    /**
     * Division
     * <p>
     * The division that will receive the funds from the proposal.
     * 
     */
    @JsonProperty("division")
    public void setDivision(Object division) {
        this.division = division;
    }

    public Proposals withDivision(Object division) {
        this.division = division;
        return this;
    }

    /**
     * Campaign
     * <p>
     * The campaign associated with the proposal.
     * 
     */
    @JsonProperty("campaign")
    public Object getCampaign() {
        return campaign;
    }

    /**
     * Campaign
     * <p>
     * The campaign associated with the proposal.
     * 
     */
    @JsonProperty("campaign")
    public void setCampaign(Object campaign) {
        this.campaign = campaign;
    }

    public Proposals withCampaign(Object campaign) {
        this.campaign = campaign;
        return this;
    }

    /**
     * Amounts
     * <p>
     * The amounts associated with the proposal.
     * 
     */
    @JsonProperty("amounts")
    public Amounts getAmounts() {
        return amounts;
    }

    /**
     * Amounts
     * <p>
     * The amounts associated with the proposal.
     * 
     */
    @JsonProperty("amounts")
    public void setAmounts(Amounts amounts) {
        this.amounts = amounts;
    }

    public Proposals withAmounts(Amounts amounts) {
        this.amounts = amounts;
        return this;
    }

    /**
     * Non Contribution Amount
     * <p>
     * The amount received for the proposal that does not have a corresponding contribution. e.g: amounts transferred from a legacy system.
     * 
     */
    @JsonProperty("nonContributionAmount")
    public Object getNonContributionAmount() {
        return nonContributionAmount;
    }

    /**
     * Non Contribution Amount
     * <p>
     * The amount received for the proposal that does not have a corresponding contribution. e.g: amounts transferred from a legacy system.
     * 
     */
    @JsonProperty("nonContributionAmount")
    public void setNonContributionAmount(Object nonContributionAmount) {
        this.nonContributionAmount = nonContributionAmount;
    }

    public Proposals withNonContributionAmount(Object nonContributionAmount) {
        this.nonContributionAmount = nonContributionAmount;
        return this;
    }

    /**
     * Designations
     * <p>
     * The designations associated with the proposal.
     * 
     */
    @JsonProperty("designations")
    public List<Designation> getDesignations() {
        return designations;
    }

    /**
     * Designations
     * <p>
     * The designations associated with the proposal.
     * 
     */
    @JsonProperty("designations")
    public void setDesignations(List<Designation> designations) {
        this.designations = designations;
    }

    public Proposals withDesignations(List<Designation> designations) {
        this.designations = designations;
        return this;
    }

    /**
     * Assignments
     * <p>
     * The people or teams assigned to the proposal.
     * 
     */
    @JsonProperty("assignments")
    public List<Assignment> getAssignments() {
        return assignments;
    }

    /**
     * Assignments
     * <p>
     * The people or teams assigned to the proposal.
     * 
     */
    @JsonProperty("assignments")
    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public Proposals withAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
        return this;
    }

    /**
     * Notes
     * <p>
     * The notes related to the proposal.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * The notes related to the proposal.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Proposals withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Proposals.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("prospect");
        sb.append('=');
        sb.append(((this.prospect == null)?"<null>":this.prospect));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        sb.append("stage");
        sb.append('=');
        sb.append(((this.stage == null)?"<null>":this.stage));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("probability");
        sb.append('=');
        sb.append(((this.probability == null)?"<null>":this.probability));
        sb.append(',');
        sb.append("parentProposal");
        sb.append('=');
        sb.append(((this.parentProposal == null)?"<null>":this.parentProposal));
        sb.append(',');
        sb.append("changeReason");
        sb.append('=');
        sb.append(((this.changeReason == null)?"<null>":this.changeReason));
        sb.append(',');
        sb.append("college");
        sb.append('=');
        sb.append(((this.college == null)?"<null>":this.college));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("division");
        sb.append('=');
        sb.append(((this.division == null)?"<null>":this.division));
        sb.append(',');
        sb.append("campaign");
        sb.append('=');
        sb.append(((this.campaign == null)?"<null>":this.campaign));
        sb.append(',');
        sb.append("amounts");
        sb.append('=');
        sb.append(((this.amounts == null)?"<null>":this.amounts));
        sb.append(',');
        sb.append("nonContributionAmount");
        sb.append('=');
        sb.append(((this.nonContributionAmount == null)?"<null>":this.nonContributionAmount));
        sb.append(',');
        sb.append("designations");
        sb.append('=');
        sb.append(((this.designations == null)?"<null>":this.designations));
        sb.append(',');
        sb.append("assignments");
        sb.append('=');
        sb.append(((this.assignments == null)?"<null>":this.assignments));
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
        result = ((result* 31)+((this.college == null)? 0 :this.college.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.assignments == null)? 0 :this.assignments.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.changeReason == null)? 0 :this.changeReason.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.probability == null)? 0 :this.probability.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.nonContributionAmount == null)? 0 :this.nonContributionAmount.hashCode()));
        result = ((result* 31)+((this.prospect == null)? 0 :this.prospect.hashCode()));
        result = ((result* 31)+((this.division == null)? 0 :this.division.hashCode()));
        result = ((result* 31)+((this.designations == null)? 0 :this.designations.hashCode()));
        result = ((result* 31)+((this.stage == null)? 0 :this.stage.hashCode()));
        result = ((result* 31)+((this.amounts == null)? 0 :this.amounts.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.campaign == null)? 0 :this.campaign.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.parentProposal == null)? 0 :this.parentProposal.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Proposals) == false) {
            return false;
        }
        Proposals rhs = ((Proposals) other);
        return ((((((((((((((((((((((((this.college == rhs.college)||((this.college!= null)&&this.college.equals(rhs.college)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.assignments == rhs.assignments)||((this.assignments!= null)&&this.assignments.equals(rhs.assignments))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.changeReason == rhs.changeReason)||((this.changeReason!= null)&&this.changeReason.equals(rhs.changeReason))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.probability == rhs.probability)||((this.probability!= null)&&this.probability.equals(rhs.probability))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.nonContributionAmount == rhs.nonContributionAmount)||((this.nonContributionAmount!= null)&&this.nonContributionAmount.equals(rhs.nonContributionAmount))))&&((this.prospect == rhs.prospect)||((this.prospect!= null)&&this.prospect.equals(rhs.prospect))))&&((this.division == rhs.division)||((this.division!= null)&&this.division.equals(rhs.division))))&&((this.designations == rhs.designations)||((this.designations!= null)&&this.designations.equals(rhs.designations))))&&((this.stage == rhs.stage)||((this.stage!= null)&&this.stage.equals(rhs.stage))))&&((this.amounts == rhs.amounts)||((this.amounts!= null)&&this.amounts.equals(rhs.amounts))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.campaign == rhs.campaign)||((this.campaign!= null)&&this.campaign.equals(rhs.campaign))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.parentProposal == rhs.parentProposal)||((this.parentProposal!= null)&&this.parentProposal.equals(rhs.parentProposal))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
