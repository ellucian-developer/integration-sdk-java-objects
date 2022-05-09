
package com.ellucian.generated.eedm.admission_recruitment_opportunities.v12_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "state",
    "stateDate"
})
@Generated("jsonschema2pojo")
public class OpportunityState {

    /**
     * State
     * <p>
     * The state of the opportunity.
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The state of the opportunity.")
    private State state;
    /**
     * State Date
     * <p>
     * The date on which the state was recorded.
     * (Required)
     * 
     */
    @JsonProperty("stateDate")
    @JsonPropertyDescription("The date on which the state was recorded.")
    private Date stateDate;

    /**
     * State
     * <p>
     * The state of the opportunity.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public State getState() {
        return state;
    }

    /**
     * State
     * <p>
     * The state of the opportunity.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    public OpportunityState withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * State Date
     * <p>
     * The date on which the state was recorded.
     * (Required)
     * 
     */
    @JsonProperty("stateDate")
    public Date getStateDate() {
        return stateDate;
    }

    /**
     * State Date
     * <p>
     * The date on which the state was recorded.
     * (Required)
     * 
     */
    @JsonProperty("stateDate")
    public void setStateDate(Date stateDate) {
        this.stateDate = stateDate;
    }

    public OpportunityState withStateDate(Date stateDate) {
        this.stateDate = stateDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpportunityState.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("stateDate");
        sb.append('=');
        sb.append(((this.stateDate == null)?"<null>":this.stateDate));
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
        result = ((result* 31)+((this.stateDate == null)? 0 :this.stateDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpportunityState) == false) {
            return false;
        }
        OpportunityState rhs = ((OpportunityState) other);
        return (((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state)))&&((this.stateDate == rhs.stateDate)||((this.stateDate!= null)&&this.stateDate.equals(rhs.stateDate))));
    }

}
