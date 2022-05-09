
package com.ellucian.generated.eedm.student_financial_aid_awards.v7_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Status
 * <p>
 * Status of the financial aid award.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "state",
    "stateOn"
})
@Generated("jsonschema2pojo")
public class Status {

    /**
     * State
     * <p>
     * The state of the award.
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The state of the award.")
    private Status.State state;
    /**
     * State On
     * <p>
     * Effective date of the state
     * 
     */
    @JsonProperty("stateOn")
    @JsonPropertyDescription("Effective date of the state")
    private Object stateOn;

    /**
     * State
     * <p>
     * The state of the award.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public Status.State getState() {
        return state;
    }

    /**
     * State
     * <p>
     * The state of the award.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(Status.State state) {
        this.state = state;
    }

    public Status withState(Status.State state) {
        this.state = state;
        return this;
    }

    /**
     * State On
     * <p>
     * Effective date of the state
     * 
     */
    @JsonProperty("stateOn")
    public Object getStateOn() {
        return stateOn;
    }

    /**
     * State On
     * <p>
     * Effective date of the state
     * 
     */
    @JsonProperty("stateOn")
    public void setStateOn(Object stateOn) {
        this.stateOn = stateOn;
    }

    public Status withStateOn(Object stateOn) {
        this.stateOn = stateOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("stateOn");
        sb.append('=');
        sb.append(((this.stateOn == null)?"<null>":this.stateOn));
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
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.stateOn == null)? 0 :this.stateOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return (((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state)))&&((this.stateOn == rhs.stateOn)||((this.stateOn!= null)&&this.stateOn.equals(rhs.stateOn))));
    }


    /**
     * State
     * <p>
     * The state of the award.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum State {

        OFFERED("offered"),
        ACCEPTED("accepted"),
        DECLINED("declined"),
        CANCELLED("cancelled");
        private final String value;
        private final static Map<String, Status.State> CONSTANTS = new HashMap<String, Status.State>();

        static {
            for (Status.State c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        State(String value) {
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
        public static Status.State fromValue(String value) {
            Status.State constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
