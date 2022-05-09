
package com.ellucian.generated.eedm.recruitment_enrollment_goals.v16_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "target",
    "actual",
    "assessedOn"
})
@Generated("jsonschema2pojo")
public class SubGoal {

    /**
     * Type
     * <p>
     * The stage type of the admission funnel to which the details apply.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The stage type of the admission funnel to which the details apply.")
    private SubGoal.Type type;
    /**
     * Target
     * <p>
     * The targeted number of prospects from the goal population that are desired to reach this stage of the admissions funnel.
     * (Required)
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("The targeted number of prospects from the goal population that are desired to reach this stage of the admissions funnel.")
    private Integer target;
    /**
     * Actual
     * <p>
     * The actual number of prospects from the goal population that reached this stage of the admissions funnel as of the assessed date.
     * 
     */
    @JsonProperty("actual")
    @JsonPropertyDescription("The actual number of prospects from the goal population that reached this stage of the admissions funnel as of the assessed date.")
    private Object actual;
    /**
     * Assessed On
     * <p>
     * The most recent date the actual value was updated.
     * 
     */
    @JsonProperty("assessedOn")
    @JsonPropertyDescription("The most recent date the actual value was updated.")
    private Object assessedOn;

    /**
     * Type
     * <p>
     * The stage type of the admission funnel to which the details apply.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public SubGoal.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The stage type of the admission funnel to which the details apply.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(SubGoal.Type type) {
        this.type = type;
    }

    public SubGoal withType(SubGoal.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Target
     * <p>
     * The targeted number of prospects from the goal population that are desired to reach this stage of the admissions funnel.
     * (Required)
     * 
     */
    @JsonProperty("target")
    public Integer getTarget() {
        return target;
    }

    /**
     * Target
     * <p>
     * The targeted number of prospects from the goal population that are desired to reach this stage of the admissions funnel.
     * (Required)
     * 
     */
    @JsonProperty("target")
    public void setTarget(Integer target) {
        this.target = target;
    }

    public SubGoal withTarget(Integer target) {
        this.target = target;
        return this;
    }

    /**
     * Actual
     * <p>
     * The actual number of prospects from the goal population that reached this stage of the admissions funnel as of the assessed date.
     * 
     */
    @JsonProperty("actual")
    public Object getActual() {
        return actual;
    }

    /**
     * Actual
     * <p>
     * The actual number of prospects from the goal population that reached this stage of the admissions funnel as of the assessed date.
     * 
     */
    @JsonProperty("actual")
    public void setActual(Object actual) {
        this.actual = actual;
    }

    public SubGoal withActual(Object actual) {
        this.actual = actual;
        return this;
    }

    /**
     * Assessed On
     * <p>
     * The most recent date the actual value was updated.
     * 
     */
    @JsonProperty("assessedOn")
    public Object getAssessedOn() {
        return assessedOn;
    }

    /**
     * Assessed On
     * <p>
     * The most recent date the actual value was updated.
     * 
     */
    @JsonProperty("assessedOn")
    public void setAssessedOn(Object assessedOn) {
        this.assessedOn = assessedOn;
    }

    public SubGoal withAssessedOn(Object assessedOn) {
        this.assessedOn = assessedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubGoal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("actual");
        sb.append('=');
        sb.append(((this.actual == null)?"<null>":this.actual));
        sb.append(',');
        sb.append("assessedOn");
        sb.append('=');
        sb.append(((this.assessedOn == null)?"<null>":this.assessedOn));
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
        result = ((result* 31)+((this.actual == null)? 0 :this.actual.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.assessedOn == null)? 0 :this.assessedOn.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubGoal) == false) {
            return false;
        }
        SubGoal rhs = ((SubGoal) other);
        return (((((this.actual == rhs.actual)||((this.actual!= null)&&this.actual.equals(rhs.actual)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.assessedOn == rhs.assessedOn)||((this.assessedOn!= null)&&this.assessedOn.equals(rhs.assessedOn))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))));
    }


    /**
     * Type
     * <p>
     * The stage type of the admission funnel to which the details apply.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        PROSPECT("prospect"),
        INQUIRY("inquiry"),
        APPLICATION_STARTED("applicationStarted"),
        APPLICATION_SUBMITTED("applicationSubmitted"),
        APPLICATION_COMPLETED("applicationCompleted"),
        ADMITTED("admitted"),
        CONFIRMED("confirmed"),
        ENROLLED("enrolled");
        private final String value;
        private final static Map<String, SubGoal.Type> CONSTANTS = new HashMap<String, SubGoal.Type>();

        static {
            for (SubGoal.Type c: values()) {
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
        public static SubGoal.Type fromValue(String value) {
            SubGoal.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
