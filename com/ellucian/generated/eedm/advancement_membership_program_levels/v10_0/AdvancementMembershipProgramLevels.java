
package com.ellucian.generated.eedm.advancement_membership_program_levels.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Advancement Membership Program Levels
 * <p>
 * The levels available for membership within membership programs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "program",
    "status",
    "levelType",
    "rank",
    "duration",
    "dues",
    "maximumMembers",
    "additionalMembers",
    "additionalMemberRate",
    "premiums",
    "designations"
})
@Generated("jsonschema2pojo")
public class AdvancementMembershipProgramLevels {

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
     * The global identifier of the advancement membership program level.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the advancement membership program level.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the advancement membership program level.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the advancement membership program level.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the advancement membership program level.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the advancement membership program level.")
    private String description;
    /**
     * Program
     * <p>
     * The associated membership program.
     * (Required)
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("The associated membership program.")
    private Program program;
    /**
     * Status
     * <p>
     * The status of the level.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the level.")
    private Status status;
    /**
     * Level Type
     * <p>
     * The categorization of the membership level (e.g. family and individual).
     * 
     */
    @JsonProperty("levelType")
    @JsonPropertyDescription("The categorization of the membership level (e.g. family and individual).")
    private Object levelType;
    /**
     * Rank
     * <p>
     * The level's relative ranking to other levels within the membership program.
     * 
     */
    @JsonProperty("rank")
    @JsonPropertyDescription("The level's relative ranking to other levels within the membership program.")
    private Object rank;
    /**
     * Duration
     * <p>
     * The rules used to determine the length of a new membership for the level.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("The rules used to determine the length of a new membership for the level.")
    private Object duration;
    /**
     * Dues
     * <p>
     * The rules to calculate dues for a membership at the level.
     * 
     */
    @JsonProperty("dues")
    @JsonPropertyDescription("The rules to calculate dues for a membership at the level.")
    private Object dues;
    /**
     * Maximum Members
     * <p>
     * The maximum number of members for the standard membership rate.
     * 
     */
    @JsonProperty("maximumMembers")
    @JsonPropertyDescription("The maximum number of members for the standard membership rate.")
    private Object maximumMembers;
    /**
     * Additional Members
     * <p>
     * An indicator to identify if additional members can be added above the defined maximum for the standard membership rate - often at an additional cost.
     * 
     */
    @JsonProperty("additionalMembers")
    @JsonPropertyDescription("An indicator to identify if additional members can be added above the defined maximum for the standard membership rate - often at an additional cost.")
    private Object additionalMembers;
    /**
     * Additional Member Rate
     * <p>
     * The rate per additional member that exceeds the maximum members identified for the standard rate.
     * 
     */
    @JsonProperty("additionalMemberRate")
    @JsonPropertyDescription("The rate per additional member that exceeds the maximum members identified for the standard rate.")
    private Object additionalMemberRate;
    /**
     * Premiums
     * <p>
     * The quantity and selection requirements of premiums associated with the membership level.
     * 
     */
    @JsonProperty("premiums")
    @JsonPropertyDescription("The quantity and selection requirements of premiums associated with the membership level.")
    private List<Premium> premiums = new ArrayList<Premium>();
    /**
     * Designations
     * <p>
     * The designated uses with allocated percentage of the dues for the membership program level.
     * 
     */
    @JsonProperty("designations")
    @JsonPropertyDescription("The designated uses with allocated percentage of the dues for the membership program level.")
    private List<Designation> designations = new ArrayList<Designation>();

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

    public AdvancementMembershipProgramLevels withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the advancement membership program level.
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
     * The global identifier of the advancement membership program level.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdvancementMembershipProgramLevels withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the advancement membership program level.
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
     * The full name of the advancement membership program level.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdvancementMembershipProgramLevels withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the advancement membership program level.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the advancement membership program level.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdvancementMembershipProgramLevels withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Program
     * <p>
     * The associated membership program.
     * (Required)
     * 
     */
    @JsonProperty("program")
    public Program getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * The associated membership program.
     * (Required)
     * 
     */
    @JsonProperty("program")
    public void setProgram(Program program) {
        this.program = program;
    }

    public AdvancementMembershipProgramLevels withProgram(Program program) {
        this.program = program;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the level.
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
     * The status of the level.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public AdvancementMembershipProgramLevels withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Level Type
     * <p>
     * The categorization of the membership level (e.g. family and individual).
     * 
     */
    @JsonProperty("levelType")
    public Object getLevelType() {
        return levelType;
    }

    /**
     * Level Type
     * <p>
     * The categorization of the membership level (e.g. family and individual).
     * 
     */
    @JsonProperty("levelType")
    public void setLevelType(Object levelType) {
        this.levelType = levelType;
    }

    public AdvancementMembershipProgramLevels withLevelType(Object levelType) {
        this.levelType = levelType;
        return this;
    }

    /**
     * Rank
     * <p>
     * The level's relative ranking to other levels within the membership program.
     * 
     */
    @JsonProperty("rank")
    public Object getRank() {
        return rank;
    }

    /**
     * Rank
     * <p>
     * The level's relative ranking to other levels within the membership program.
     * 
     */
    @JsonProperty("rank")
    public void setRank(Object rank) {
        this.rank = rank;
    }

    public AdvancementMembershipProgramLevels withRank(Object rank) {
        this.rank = rank;
        return this;
    }

    /**
     * Duration
     * <p>
     * The rules used to determine the length of a new membership for the level.
     * 
     */
    @JsonProperty("duration")
    public Object getDuration() {
        return duration;
    }

    /**
     * Duration
     * <p>
     * The rules used to determine the length of a new membership for the level.
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Object duration) {
        this.duration = duration;
    }

    public AdvancementMembershipProgramLevels withDuration(Object duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Dues
     * <p>
     * The rules to calculate dues for a membership at the level.
     * 
     */
    @JsonProperty("dues")
    public Object getDues() {
        return dues;
    }

    /**
     * Dues
     * <p>
     * The rules to calculate dues for a membership at the level.
     * 
     */
    @JsonProperty("dues")
    public void setDues(Object dues) {
        this.dues = dues;
    }

    public AdvancementMembershipProgramLevels withDues(Object dues) {
        this.dues = dues;
        return this;
    }

    /**
     * Maximum Members
     * <p>
     * The maximum number of members for the standard membership rate.
     * 
     */
    @JsonProperty("maximumMembers")
    public Object getMaximumMembers() {
        return maximumMembers;
    }

    /**
     * Maximum Members
     * <p>
     * The maximum number of members for the standard membership rate.
     * 
     */
    @JsonProperty("maximumMembers")
    public void setMaximumMembers(Object maximumMembers) {
        this.maximumMembers = maximumMembers;
    }

    public AdvancementMembershipProgramLevels withMaximumMembers(Object maximumMembers) {
        this.maximumMembers = maximumMembers;
        return this;
    }

    /**
     * Additional Members
     * <p>
     * An indicator to identify if additional members can be added above the defined maximum for the standard membership rate - often at an additional cost.
     * 
     */
    @JsonProperty("additionalMembers")
    public Object getAdditionalMembers() {
        return additionalMembers;
    }

    /**
     * Additional Members
     * <p>
     * An indicator to identify if additional members can be added above the defined maximum for the standard membership rate - often at an additional cost.
     * 
     */
    @JsonProperty("additionalMembers")
    public void setAdditionalMembers(Object additionalMembers) {
        this.additionalMembers = additionalMembers;
    }

    public AdvancementMembershipProgramLevels withAdditionalMembers(Object additionalMembers) {
        this.additionalMembers = additionalMembers;
        return this;
    }

    /**
     * Additional Member Rate
     * <p>
     * The rate per additional member that exceeds the maximum members identified for the standard rate.
     * 
     */
    @JsonProperty("additionalMemberRate")
    public Object getAdditionalMemberRate() {
        return additionalMemberRate;
    }

    /**
     * Additional Member Rate
     * <p>
     * The rate per additional member that exceeds the maximum members identified for the standard rate.
     * 
     */
    @JsonProperty("additionalMemberRate")
    public void setAdditionalMemberRate(Object additionalMemberRate) {
        this.additionalMemberRate = additionalMemberRate;
    }

    public AdvancementMembershipProgramLevels withAdditionalMemberRate(Object additionalMemberRate) {
        this.additionalMemberRate = additionalMemberRate;
        return this;
    }

    /**
     * Premiums
     * <p>
     * The quantity and selection requirements of premiums associated with the membership level.
     * 
     */
    @JsonProperty("premiums")
    public List<Premium> getPremiums() {
        return premiums;
    }

    /**
     * Premiums
     * <p>
     * The quantity and selection requirements of premiums associated with the membership level.
     * 
     */
    @JsonProperty("premiums")
    public void setPremiums(List<Premium> premiums) {
        this.premiums = premiums;
    }

    public AdvancementMembershipProgramLevels withPremiums(List<Premium> premiums) {
        this.premiums = premiums;
        return this;
    }

    /**
     * Designations
     * <p>
     * The designated uses with allocated percentage of the dues for the membership program level.
     * 
     */
    @JsonProperty("designations")
    public List<Designation> getDesignations() {
        return designations;
    }

    /**
     * Designations
     * <p>
     * The designated uses with allocated percentage of the dues for the membership program level.
     * 
     */
    @JsonProperty("designations")
    public void setDesignations(List<Designation> designations) {
        this.designations = designations;
    }

    public AdvancementMembershipProgramLevels withDesignations(List<Designation> designations) {
        this.designations = designations;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdvancementMembershipProgramLevels.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("levelType");
        sb.append('=');
        sb.append(((this.levelType == null)?"<null>":this.levelType));
        sb.append(',');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("dues");
        sb.append('=');
        sb.append(((this.dues == null)?"<null>":this.dues));
        sb.append(',');
        sb.append("maximumMembers");
        sb.append('=');
        sb.append(((this.maximumMembers == null)?"<null>":this.maximumMembers));
        sb.append(',');
        sb.append("additionalMembers");
        sb.append('=');
        sb.append(((this.additionalMembers == null)?"<null>":this.additionalMembers));
        sb.append(',');
        sb.append("additionalMemberRate");
        sb.append('=');
        sb.append(((this.additionalMemberRate == null)?"<null>":this.additionalMemberRate));
        sb.append(',');
        sb.append("premiums");
        sb.append('=');
        sb.append(((this.premiums == null)?"<null>":this.premiums));
        sb.append(',');
        sb.append("designations");
        sb.append('=');
        sb.append(((this.designations == null)?"<null>":this.designations));
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
        result = ((result* 31)+((this.maximumMembers == null)? 0 :this.maximumMembers.hashCode()));
        result = ((result* 31)+((this.additionalMemberRate == null)? 0 :this.additionalMemberRate.hashCode()));
        result = ((result* 31)+((this.premiums == null)? 0 :this.premiums.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.dues == null)? 0 :this.dues.hashCode()));
        result = ((result* 31)+((this.designations == null)? 0 :this.designations.hashCode()));
        result = ((result* 31)+((this.levelType == null)? 0 :this.levelType.hashCode()));
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.additionalMembers == null)? 0 :this.additionalMembers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvancementMembershipProgramLevels) == false) {
            return false;
        }
        AdvancementMembershipProgramLevels rhs = ((AdvancementMembershipProgramLevels) other);
        return ((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.maximumMembers == rhs.maximumMembers)||((this.maximumMembers!= null)&&this.maximumMembers.equals(rhs.maximumMembers))))&&((this.additionalMemberRate == rhs.additionalMemberRate)||((this.additionalMemberRate!= null)&&this.additionalMemberRate.equals(rhs.additionalMemberRate))))&&((this.premiums == rhs.premiums)||((this.premiums!= null)&&this.premiums.equals(rhs.premiums))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.dues == rhs.dues)||((this.dues!= null)&&this.dues.equals(rhs.dues))))&&((this.designations == rhs.designations)||((this.designations!= null)&&this.designations.equals(rhs.designations))))&&((this.levelType == rhs.levelType)||((this.levelType!= null)&&this.levelType.equals(rhs.levelType))))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.additionalMembers == rhs.additionalMembers)||((this.additionalMembers!= null)&&this.additionalMembers.equals(rhs.additionalMembers))));
    }

}
