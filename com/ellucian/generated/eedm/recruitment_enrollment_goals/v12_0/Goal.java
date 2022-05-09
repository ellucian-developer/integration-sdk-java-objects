
package com.ellucian.generated.eedm.recruitment_enrollment_goals.v12_0;

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
 * Goal
 * <p>
 * The enrollment goal details.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "type",
    "status",
    "subGoals"
})
@Generated("jsonschema2pojo")
public class Goal {

    /**
     * Name
     * <p>
     * The title of the enrollment goal.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The title of the enrollment goal.")
    private String name;
    /**
     * Type
     * <p>
     * An indicator if the prospect pool for the goal is only territory based or is a reporting goal which uses additional criteria to define the prospect pool.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("An indicator if the prospect pool for the goal is only territory based or is a reporting goal which uses additional criteria to define the prospect pool.")
    private Goal.Type type;
    /**
     * Status
     * <p>
     * A calculated assessment based on the source system's criteria if the goal has been met, not met or if the assessment is pending.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("A calculated assessment based on the source system's criteria if the goal has been met, not met or if the assessment is pending.")
    private Goal.Status status;
    /**
     * Sub Goals
     * <p>
     * The goal details for the specific stages of the admission funnel.
     * 
     */
    @JsonProperty("subGoals")
    @JsonPropertyDescription("The goal details for the specific stages of the admission funnel.")
    private List<SubGoal> subGoals = new ArrayList<SubGoal>();

    /**
     * Name
     * <p>
     * The title of the enrollment goal.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The title of the enrollment goal.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Goal withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Type
     * <p>
     * An indicator if the prospect pool for the goal is only territory based or is a reporting goal which uses additional criteria to define the prospect pool.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Goal.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * An indicator if the prospect pool for the goal is only territory based or is a reporting goal which uses additional criteria to define the prospect pool.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Goal.Type type) {
        this.type = type;
    }

    public Goal withType(Goal.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * A calculated assessment based on the source system's criteria if the goal has been met, not met or if the assessment is pending.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Goal.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * A calculated assessment based on the source system's criteria if the goal has been met, not met or if the assessment is pending.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Goal.Status status) {
        this.status = status;
    }

    public Goal withStatus(Goal.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Sub Goals
     * <p>
     * The goal details for the specific stages of the admission funnel.
     * 
     */
    @JsonProperty("subGoals")
    public List<SubGoal> getSubGoals() {
        return subGoals;
    }

    /**
     * Sub Goals
     * <p>
     * The goal details for the specific stages of the admission funnel.
     * 
     */
    @JsonProperty("subGoals")
    public void setSubGoals(List<SubGoal> subGoals) {
        this.subGoals = subGoals;
    }

    public Goal withSubGoals(List<SubGoal> subGoals) {
        this.subGoals = subGoals;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Goal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("subGoals");
        sb.append('=');
        sb.append(((this.subGoals == null)?"<null>":this.subGoals));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.subGoals == null)? 0 :this.subGoals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Goal) == false) {
            return false;
        }
        Goal rhs = ((Goal) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.subGoals == rhs.subGoals)||((this.subGoals!= null)&&this.subGoals.equals(rhs.subGoals))));
    }


    /**
     * Status
     * <p>
     * A calculated assessment based on the source system's criteria if the goal has been met, not met or if the assessment is pending.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        PENDING("pending"),
        MET("met"),
        NOT_MET("notMet");
        private final String value;
        private final static Map<String, Goal.Status> CONSTANTS = new HashMap<String, Goal.Status>();

        static {
            for (Goal.Status c: values()) {
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
        public static Goal.Status fromValue(String value) {
            Goal.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type
     * <p>
     * An indicator if the prospect pool for the goal is only territory based or is a reporting goal which uses additional criteria to define the prospect pool.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        TERRITORY("territory"),
        REPORTING("reporting");
        private final String value;
        private final static Map<String, Goal.Type> CONSTANTS = new HashMap<String, Goal.Type>();

        static {
            for (Goal.Type c: values()) {
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
        public static Goal.Type fromValue(String value) {
            Goal.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
