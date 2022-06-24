
package com.ellucian.generated.eedm.dfe_admission_decisions.v1_2_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Interview
 * <p>
 * Interviews made on teachers training applications in UK under UK Government Department, DfE (Department for Education).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "interviewId",
    "providerCode",
    "interviewDate",
    "location",
    "additionalDetails",
    "cancellationReason"
})
@Generated("jsonschema2pojo")
public class Interview {

    /**
     * Id
     * <p>
     * The global identifier of the interview for the admission application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the interview for the admission application.")
    private Id id;
    /**
     * Interview Id
     * <p>
     * The unique ID of interview.
     * 
     */
    @JsonProperty("interviewId")
    @JsonPropertyDescription("The unique ID of interview.")
    private String interviewId;
    /**
     * Provider Code
     * <p>
     * The Provider Code of the Interview on the admission application.
     * 
     */
    @JsonProperty("providerCode")
    @JsonPropertyDescription("The Provider Code of the Interview on the admission application.")
    private String providerCode;
    /**
     * Interview Date
     * <p>
     * The Date and time of the interview.
     * 
     */
    @JsonProperty("interviewDate")
    @JsonPropertyDescription("The Date and time of the interview.")
    private Date interviewDate;
    /**
     * Location
     * <p>
     * A string describing where or how the interview will take place.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("A string describing where or how the interview will take place.")
    private String location;
    /**
     * Additional Details
     * <p>
     * Optional string for additional notes.
     * 
     */
    @JsonProperty("additionalDetails")
    @JsonPropertyDescription("Optional string for additional notes.")
    private String additionalDetails;
    /**
     * Cancellation Reason
     * <p>
     * The reason for the cancellation of Interview.
     * 
     */
    @JsonProperty("cancellationReason")
    @JsonPropertyDescription("The reason for the cancellation of Interview.")
    private String cancellationReason;

    /**
     * Id
     * <p>
     * The global identifier of the interview for the admission application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Id getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * The global identifier of the interview for the admission application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Id id) {
        this.id = id;
    }

    public Interview withId(Id id) {
        this.id = id;
        return this;
    }

    /**
     * Interview Id
     * <p>
     * The unique ID of interview.
     * 
     */
    @JsonProperty("interviewId")
    public String getInterviewId() {
        return interviewId;
    }

    /**
     * Interview Id
     * <p>
     * The unique ID of interview.
     * 
     */
    @JsonProperty("interviewId")
    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }

    public Interview withInterviewId(String interviewId) {
        this.interviewId = interviewId;
        return this;
    }

    /**
     * Provider Code
     * <p>
     * The Provider Code of the Interview on the admission application.
     * 
     */
    @JsonProperty("providerCode")
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Provider Code
     * <p>
     * The Provider Code of the Interview on the admission application.
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
     * Interview Date
     * <p>
     * The Date and time of the interview.
     * 
     */
    @JsonProperty("interviewDate")
    public Date getInterviewDate() {
        return interviewDate;
    }

    /**
     * Interview Date
     * <p>
     * The Date and time of the interview.
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
     * A string describing where or how the interview will take place.
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * A string describing where or how the interview will take place.
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
     * Optional string for additional notes.
     * 
     */
    @JsonProperty("additionalDetails")
    public String getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Additional Details
     * <p>
     * Optional string for additional notes.
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
     * Cancellation Reason
     * <p>
     * The reason for the cancellation of Interview.
     * 
     */
    @JsonProperty("cancellationReason")
    public String getCancellationReason() {
        return cancellationReason;
    }

    /**
     * Cancellation Reason
     * <p>
     * The reason for the cancellation of Interview.
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Interview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("interviewId");
        sb.append('=');
        sb.append(((this.interviewId == null)?"<null>":this.interviewId));
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
        sb.append("cancellationReason");
        sb.append('=');
        sb.append(((this.cancellationReason == null)?"<null>":this.cancellationReason));
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
        result = ((result* 31)+((this.interviewId == null)? 0 :this.interviewId.hashCode()));
        result = ((result* 31)+((this.providerCode == null)? 0 :this.providerCode.hashCode()));
        result = ((result* 31)+((this.cancellationReason == null)? 0 :this.cancellationReason.hashCode()));
        result = ((result* 31)+((this.interviewDate == null)? 0 :this.interviewDate.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalDetails == null)? 0 :this.additionalDetails.hashCode()));
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
        return ((((((((this.interviewId == rhs.interviewId)||((this.interviewId!= null)&&this.interviewId.equals(rhs.interviewId)))&&((this.providerCode == rhs.providerCode)||((this.providerCode!= null)&&this.providerCode.equals(rhs.providerCode))))&&((this.cancellationReason == rhs.cancellationReason)||((this.cancellationReason!= null)&&this.cancellationReason.equals(rhs.cancellationReason))))&&((this.interviewDate == rhs.interviewDate)||((this.interviewDate!= null)&&this.interviewDate.equals(rhs.interviewDate))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalDetails == rhs.additionalDetails)||((this.additionalDetails!= null)&&this.additionalDetails.equals(rhs.additionalDetails))));
    }

}
