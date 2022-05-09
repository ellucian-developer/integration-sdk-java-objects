
package com.ellucian.generated.eedm.proposals.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Amounts
 * <p>
 * The amounts associated with the proposal.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "plannedRequest",
    "anticipated",
    "actualRequest",
    "granted"
})
@Generated("jsonschema2pojo")
public class Amounts {

    /**
     * Planned Request
     * <p>
     * The amount and date associated with the planned request.
     * 
     */
    @JsonProperty("plannedRequest")
    @JsonPropertyDescription("The amount and date associated with the planned request.")
    private PlannedRequest plannedRequest;
    /**
     * Anticipated
     * <p>
     * The amount and date associated with the anticipated request.
     * 
     */
    @JsonProperty("anticipated")
    @JsonPropertyDescription("The amount and date associated with the anticipated request.")
    private Anticipated anticipated;
    /**
     * Actual Request
     * <p>
     * The amount and the date associated with the actual request.
     * 
     */
    @JsonProperty("actualRequest")
    @JsonPropertyDescription("The amount and the date associated with the actual request.")
    private ActualRequest actualRequest;
    /**
     * Granted
     * <p>
     * The amount and the date associated with the grant from the prospect for the proposal.
     * 
     */
    @JsonProperty("granted")
    @JsonPropertyDescription("The amount and the date associated with the grant from the prospect for the proposal.")
    private Granted granted;

    /**
     * Planned Request
     * <p>
     * The amount and date associated with the planned request.
     * 
     */
    @JsonProperty("plannedRequest")
    public PlannedRequest getPlannedRequest() {
        return plannedRequest;
    }

    /**
     * Planned Request
     * <p>
     * The amount and date associated with the planned request.
     * 
     */
    @JsonProperty("plannedRequest")
    public void setPlannedRequest(PlannedRequest plannedRequest) {
        this.plannedRequest = plannedRequest;
    }

    public Amounts withPlannedRequest(PlannedRequest plannedRequest) {
        this.plannedRequest = plannedRequest;
        return this;
    }

    /**
     * Anticipated
     * <p>
     * The amount and date associated with the anticipated request.
     * 
     */
    @JsonProperty("anticipated")
    public Anticipated getAnticipated() {
        return anticipated;
    }

    /**
     * Anticipated
     * <p>
     * The amount and date associated with the anticipated request.
     * 
     */
    @JsonProperty("anticipated")
    public void setAnticipated(Anticipated anticipated) {
        this.anticipated = anticipated;
    }

    public Amounts withAnticipated(Anticipated anticipated) {
        this.anticipated = anticipated;
        return this;
    }

    /**
     * Actual Request
     * <p>
     * The amount and the date associated with the actual request.
     * 
     */
    @JsonProperty("actualRequest")
    public ActualRequest getActualRequest() {
        return actualRequest;
    }

    /**
     * Actual Request
     * <p>
     * The amount and the date associated with the actual request.
     * 
     */
    @JsonProperty("actualRequest")
    public void setActualRequest(ActualRequest actualRequest) {
        this.actualRequest = actualRequest;
    }

    public Amounts withActualRequest(ActualRequest actualRequest) {
        this.actualRequest = actualRequest;
        return this;
    }

    /**
     * Granted
     * <p>
     * The amount and the date associated with the grant from the prospect for the proposal.
     * 
     */
    @JsonProperty("granted")
    public Granted getGranted() {
        return granted;
    }

    /**
     * Granted
     * <p>
     * The amount and the date associated with the grant from the prospect for the proposal.
     * 
     */
    @JsonProperty("granted")
    public void setGranted(Granted granted) {
        this.granted = granted;
    }

    public Amounts withGranted(Granted granted) {
        this.granted = granted;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Amounts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("plannedRequest");
        sb.append('=');
        sb.append(((this.plannedRequest == null)?"<null>":this.plannedRequest));
        sb.append(',');
        sb.append("anticipated");
        sb.append('=');
        sb.append(((this.anticipated == null)?"<null>":this.anticipated));
        sb.append(',');
        sb.append("actualRequest");
        sb.append('=');
        sb.append(((this.actualRequest == null)?"<null>":this.actualRequest));
        sb.append(',');
        sb.append("granted");
        sb.append('=');
        sb.append(((this.granted == null)?"<null>":this.granted));
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
        result = ((result* 31)+((this.anticipated == null)? 0 :this.anticipated.hashCode()));
        result = ((result* 31)+((this.plannedRequest == null)? 0 :this.plannedRequest.hashCode()));
        result = ((result* 31)+((this.actualRequest == null)? 0 :this.actualRequest.hashCode()));
        result = ((result* 31)+((this.granted == null)? 0 :this.granted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Amounts) == false) {
            return false;
        }
        Amounts rhs = ((Amounts) other);
        return (((((this.anticipated == rhs.anticipated)||((this.anticipated!= null)&&this.anticipated.equals(rhs.anticipated)))&&((this.plannedRequest == rhs.plannedRequest)||((this.plannedRequest!= null)&&this.plannedRequest.equals(rhs.plannedRequest))))&&((this.actualRequest == rhs.actualRequest)||((this.actualRequest!= null)&&this.actualRequest.equals(rhs.actualRequest))))&&((this.granted == rhs.granted)||((this.granted!= null)&&this.granted.equals(rhs.granted))));
    }

}
