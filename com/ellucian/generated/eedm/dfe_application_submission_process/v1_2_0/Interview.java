
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_2_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "providerCode",
    "interviewDate",
    "location",
    "additionalDetails",
    "cancelledOn",
    "cancellationReason",
    "createdOn",
    "updatedOn"
})
@Generated("jsonschema2pojo")
public class Interview {

    /**
     * Id
     * <p>
     * DfE Interview Id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("DfE Interview Id")
    private String id;
    /**
     * Provider Code
     * <p>
     * The training or the ratifying provider for the application and the course applied to
     * 
     */
    @JsonProperty("providerCode")
    @JsonPropertyDescription("The training or the ratifying provider for the application and the course applied to")
    private String providerCode;
    /**
     * Interview Date And Time
     * <p>
     * Date and time of the interview
     * 
     */
    @JsonProperty("interviewDate")
    @JsonPropertyDescription("Date and time of the interview")
    private Date interviewDate;
    /**
     * Location
     * <p>
     * The string describing where or how the interview will take place
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("The string describing where or how the interview will take place")
    private String location;
    /**
     * Additional Details
     * <p>
     * The string for additional notes.
     * 
     */
    @JsonProperty("additionalDetails")
    @JsonPropertyDescription("The string for additional notes.")
    private String additionalDetails;
    /**
     * Cancelled On
     * <p>
     * Date and time of cancellation, if cancelled
     * 
     */
    @JsonProperty("cancelledOn")
    @JsonPropertyDescription("Date and time of cancellation, if cancelled")
    private String cancelledOn;
    /**
     * Cancellation Reason
     * <p>
     * The reason for the cancellation. If none are yet provided for an application rejected by default
     * 
     */
    @JsonProperty("cancellationReason")
    @JsonPropertyDescription("The reason for the cancellation. If none are yet provided for an application rejected by default")
    private String cancellationReason;
    /**
     * Created On
     * <p>
     * Date and time the original interview was created
     * 
     */
    @JsonProperty("createdOn")
    @JsonPropertyDescription("Date and time the original interview was created")
    private String createdOn;
    /**
     * Updated On
     * <p>
     * Date and time the interview was updated
     * 
     */
    @JsonProperty("updatedOn")
    @JsonPropertyDescription("Date and time the interview was updated")
    private String updatedOn;

    /**
     * Id
     * <p>
     * DfE Interview Id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * DfE Interview Id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Interview withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Provider Code
     * <p>
     * The training or the ratifying provider for the application and the course applied to
     * 
     */
    @JsonProperty("providerCode")
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Provider Code
     * <p>
     * The training or the ratifying provider for the application and the course applied to
     * 
     */
    @JsonProperty("providerCode")
    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public Interview withProviderCode(String providerCode) {
        this.providerCode = providerCode;
        return this;
    }

    /**
     * Interview Date And Time
     * <p>
     * Date and time of the interview
     * 
     */
    @JsonProperty("interviewDate")
    public Date getInterviewDate() {
        return interviewDate;
    }

    /**
     * Interview Date And Time
     * <p>
     * Date and time of the interview
     * 
     */
    @JsonProperty("interviewDate")
    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public Interview withInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
        return this;
    }

    /**
     * Location
     * <p>
     * The string describing where or how the interview will take place
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * The string describing where or how the interview will take place
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public Interview withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Additional Details
     * <p>
     * The string for additional notes.
     * 
     */
    @JsonProperty("additionalDetails")
    public String getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Additional Details
     * <p>
     * The string for additional notes.
     * 
     */
    @JsonProperty("additionalDetails")
    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public Interview withAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
        return this;
    }

    /**
     * Cancelled On
     * <p>
     * Date and time of cancellation, if cancelled
     * 
     */
    @JsonProperty("cancelledOn")
    public String getCancelledOn() {
        return cancelledOn;
    }

    /**
     * Cancelled On
     * <p>
     * Date and time of cancellation, if cancelled
     * 
     */
    @JsonProperty("cancelledOn")
    public void setCancelledOn(String cancelledOn) {
        this.cancelledOn = cancelledOn;
    }

    public Interview withCancelledOn(String cancelledOn) {
        this.cancelledOn = cancelledOn;
        return this;
    }

    /**
     * Cancellation Reason
     * <p>
     * The reason for the cancellation. If none are yet provided for an application rejected by default
     * 
     */
    @JsonProperty("cancellationReason")
    public String getCancellationReason() {
        return cancellationReason;
    }

    /**
     * Cancellation Reason
     * <p>
     * The reason for the cancellation. If none are yet provided for an application rejected by default
     * 
     */
    @JsonProperty("cancellationReason")
    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Interview withCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
        return this;
    }

    /**
     * Created On
     * <p>
     * Date and time the original interview was created
     * 
     */
    @JsonProperty("createdOn")
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * Created On
     * <p>
     * Date and time the original interview was created
     * 
     */
    @JsonProperty("createdOn")
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Interview withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Updated On
     * <p>
     * Date and time the interview was updated
     * 
     */
    @JsonProperty("updatedOn")
    public String getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Updated On
     * <p>
     * Date and time the interview was updated
     * 
     */
    @JsonProperty("updatedOn")
    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Interview withUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Interview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("providerCode");
        sb.append('=');
        sb.append(((this.providerCode == null)?"<null>":this.providerCode));
        sb.append(',');
        sb.append("interviewDate");
        sb.append('=');
        sb.append(((this.interviewDate == null)?"<null>":this.interviewDate));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("additionalDetails");
        sb.append('=');
        sb.append(((this.additionalDetails == null)?"<null>":this.additionalDetails));
        sb.append(',');
        sb.append("cancelledOn");
        sb.append('=');
        sb.append(((this.cancelledOn == null)?"<null>":this.cancelledOn));
        sb.append(',');
        sb.append("cancellationReason");
        sb.append('=');
        sb.append(((this.cancellationReason == null)?"<null>":this.cancellationReason));
        sb.append(',');
        sb.append("createdOn");
        sb.append('=');
        sb.append(((this.createdOn == null)?"<null>":this.createdOn));
        sb.append(',');
        sb.append("updatedOn");
        sb.append('=');
        sb.append(((this.updatedOn == null)?"<null>":this.updatedOn));
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
        result = ((result* 31)+((this.providerCode == null)? 0 :this.providerCode.hashCode()));
        result = ((result* 31)+((this.cancelledOn == null)? 0 :this.cancelledOn.hashCode()));
        result = ((result* 31)+((this.cancellationReason == null)? 0 :this.cancellationReason.hashCode()));
        result = ((result* 31)+((this.interviewDate == null)? 0 :this.interviewDate.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.updatedOn == null)? 0 :this.updatedOn.hashCode()));
        result = ((result* 31)+((this.additionalDetails == null)? 0 :this.additionalDetails.hashCode()));
        result = ((result* 31)+((this.createdOn == null)? 0 :this.createdOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Interview) == false) {
            return false;
        }
        Interview rhs = ((Interview) other);
        return ((((((((((this.providerCode == rhs.providerCode)||((this.providerCode!= null)&&this.providerCode.equals(rhs.providerCode)))&&((this.cancelledOn == rhs.cancelledOn)||((this.cancelledOn!= null)&&this.cancelledOn.equals(rhs.cancelledOn))))&&((this.cancellationReason == rhs.cancellationReason)||((this.cancellationReason!= null)&&this.cancellationReason.equals(rhs.cancellationReason))))&&((this.interviewDate == rhs.interviewDate)||((this.interviewDate!= null)&&this.interviewDate.equals(rhs.interviewDate))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.updatedOn == rhs.updatedOn)||((this.updatedOn!= null)&&this.updatedOn.equals(rhs.updatedOn))))&&((this.additionalDetails == rhs.additionalDetails)||((this.additionalDetails!= null)&&this.additionalDetails.equals(rhs.additionalDetails))))&&((this.createdOn == rhs.createdOn)||((this.createdOn!= null)&&this.createdOn.equals(rhs.createdOn))));
    }

}
