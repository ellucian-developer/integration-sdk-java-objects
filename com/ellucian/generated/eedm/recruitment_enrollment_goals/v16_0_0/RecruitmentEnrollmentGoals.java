
package com.ellucian.generated.eedm.recruitment_enrollment_goals.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Recruitment Enrollment Goals
 * <p>
 * The admission funnel goals for recruitment cycles.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "cycle",
    "territory",
    "team",
    "owner",
    "goal"
})
@Generated("jsonschema2pojo")
public class RecruitmentEnrollmentGoals {

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
     * The global identifier of the recruitment enrollment goal.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the recruitment enrollment goal.")
    private String id;
    /**
     * Cycle
     * <p>
     * The recruiting cycle or academic period associated with the goal.
     * (Required)
     * 
     */
    @JsonProperty("cycle")
    @JsonPropertyDescription("The recruiting cycle or academic period associated with the goal.")
    private Object cycle;
    /**
     * Territory
     * <p>
     * The recruiting territory assigned to the goal.
     * 
     */
    @JsonProperty("territory")
    @JsonPropertyDescription("The recruiting territory assigned to the goal.")
    private Object territory;
    /**
     * Team
     * <p>
     * The recruitment goal team responsible for the goal.
     * 
     */
    @JsonProperty("team")
    @JsonPropertyDescription("The recruitment goal team responsible for the goal.")
    private Object team;
    /**
     * Owner
     * <p>
     * The representative or representative team that owns the goal.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("The representative or representative team that owns the goal.")
    private Object owner;
    /**
     * Goal
     * <p>
     * The enrollment goal details.
     * (Required)
     * 
     */
    @JsonProperty("goal")
    @JsonPropertyDescription("The enrollment goal details.")
    private Goal goal;

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

    public RecruitmentEnrollmentGoals withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the recruitment enrollment goal.
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
     * The global identifier of the recruitment enrollment goal.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RecruitmentEnrollmentGoals withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Cycle
     * <p>
     * The recruiting cycle or academic period associated with the goal.
     * (Required)
     * 
     */
    @JsonProperty("cycle")
    public Object getCycle() {
        return cycle;
    }

    /**
     * Cycle
     * <p>
     * The recruiting cycle or academic period associated with the goal.
     * (Required)
     * 
     */
    @JsonProperty("cycle")
    public void setCycle(Object cycle) {
        this.cycle = cycle;
    }

    public RecruitmentEnrollmentGoals withCycle(Object cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * Territory
     * <p>
     * The recruiting territory assigned to the goal.
     * 
     */
    @JsonProperty("territory")
    public Object getTerritory() {
        return territory;
    }

    /**
     * Territory
     * <p>
     * The recruiting territory assigned to the goal.
     * 
     */
    @JsonProperty("territory")
    public void setTerritory(Object territory) {
        this.territory = territory;
    }

    public RecruitmentEnrollmentGoals withTerritory(Object territory) {
        this.territory = territory;
        return this;
    }

    /**
     * Team
     * <p>
     * The recruitment goal team responsible for the goal.
     * 
     */
    @JsonProperty("team")
    public Object getTeam() {
        return team;
    }

    /**
     * Team
     * <p>
     * The recruitment goal team responsible for the goal.
     * 
     */
    @JsonProperty("team")
    public void setTeam(Object team) {
        this.team = team;
    }

    public RecruitmentEnrollmentGoals withTeam(Object team) {
        this.team = team;
        return this;
    }

    /**
     * Owner
     * <p>
     * The representative or representative team that owns the goal.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public Object getOwner() {
        return owner;
    }

    /**
     * Owner
     * <p>
     * The representative or representative team that owns the goal.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public void setOwner(Object owner) {
        this.owner = owner;
    }

    public RecruitmentEnrollmentGoals withOwner(Object owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Goal
     * <p>
     * The enrollment goal details.
     * (Required)
     * 
     */
    @JsonProperty("goal")
    public Goal getGoal() {
        return goal;
    }

    /**
     * Goal
     * <p>
     * The enrollment goal details.
     * (Required)
     * 
     */
    @JsonProperty("goal")
    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public RecruitmentEnrollmentGoals withGoal(Goal goal) {
        this.goal = goal;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecruitmentEnrollmentGoals.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("cycle");
        sb.append('=');
        sb.append(((this.cycle == null)?"<null>":this.cycle));
        sb.append(',');
        sb.append("territory");
        sb.append('=');
        sb.append(((this.territory == null)?"<null>":this.territory));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("goal");
        sb.append('=');
        sb.append(((this.goal == null)?"<null>":this.goal));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.goal == null)? 0 :this.goal.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.cycle == null)? 0 :this.cycle.hashCode()));
        result = ((result* 31)+((this.territory == null)? 0 :this.territory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecruitmentEnrollmentGoals) == false) {
            return false;
        }
        RecruitmentEnrollmentGoals rhs = ((RecruitmentEnrollmentGoals) other);
        return ((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.goal == rhs.goal)||((this.goal!= null)&&this.goal.equals(rhs.goal))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this.cycle == rhs.cycle)||((this.cycle!= null)&&this.cycle.equals(rhs.cycle))))&&((this.territory == rhs.territory)||((this.territory!= null)&&this.territory.equals(rhs.territory))));
    }

}
