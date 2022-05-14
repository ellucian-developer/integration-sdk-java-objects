
package com.ellucian.generated.eedm.external_admissions_application_decision_statuses.v1_0_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * External Admissions Application Decision Statuses
 * <p>
 * Status of the decisions made on the Applications
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "admissionDecision",
    "dfeApplicationId",
    "status",
    "jobRunId",
    "errorDetail",
    "errorDescription",
    "responseCode",
    "jobRunDate"
})
@Generated("jsonschema2pojo")
public class ExternalAdmissionsApplicationDecisionStatuses {

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
     * Admission Decision
     * <p>
     * Decisions made on admission applications.
     * (Required)
     * 
     */
    @JsonProperty("admissionDecision")
    @JsonPropertyDescription("Decisions made on admission applications.")
    private AdmissionDecision admissionDecision;
    /**
     * Dfe Application Id
     * <p>
     * The unique DfE ID of the application on which this decision was made.
     * 
     */
    @JsonProperty("dfeApplicationId")
    @JsonPropertyDescription("The unique DfE ID of the application on which this decision was made.")
    private String dfeApplicationId;
    /**
     * Status
     * <p>
     * Status of the decision
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the decision")
    private ExternalAdmissionsApplicationDecisionStatuses.Status status;
    /**
     * Job Run Id
     * <p>
     * Correlation id of the job run
     * (Required)
     * 
     */
    @JsonProperty("jobRunId")
    @JsonPropertyDescription("Correlation id of the job run")
    private String jobRunId;
    /**
     * Error Detail
     * <p>
     * Details of the Error occurred
     * 
     */
    @JsonProperty("errorDetail")
    @JsonPropertyDescription("Details of the Error occurred")
    private String errorDetail;
    /**
     * Error Description
     * <p>
     * Description of the error occurred
     * 
     */
    @JsonProperty("errorDescription")
    @JsonPropertyDescription("Description of the error occurred")
    private String errorDescription;
    /**
     * Response Code
     * <p>
     * Response code received while sending information to 3rd Party
     * 
     */
    @JsonProperty("responseCode")
    @JsonPropertyDescription("Response code received while sending information to 3rd Party")
    private String responseCode;
    /**
     * Job Run Date
     * <p>
     * Pipeline Job run date and time
     * 
     */
    @JsonProperty("jobRunDate")
    @JsonPropertyDescription("Pipeline Job run date and time")
    private Date jobRunDate;

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

    public ExternalAdmissionsApplicationDecisionStatuses withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Admission Decision
     * <p>
     * Decisions made on admission applications.
     * (Required)
     * 
     */
    @JsonProperty("admissionDecision")
    public AdmissionDecision getAdmissionDecision() {
        return admissionDecision;
    }

    /**
     * Admission Decision
     * <p>
     * Decisions made on admission applications.
     * (Required)
     * 
     */
    @JsonProperty("admissionDecision")
    public void setAdmissionDecision(AdmissionDecision admissionDecision) {
        this.admissionDecision = admissionDecision;
    }

    public ExternalAdmissionsApplicationDecisionStatuses withAdmissionDecision(AdmissionDecision admissionDecision) {
        this.admissionDecision = admissionDecision;
        return this;
    }

    /**
     * Dfe Application Id
     * <p>
     * The unique DfE ID of the application on which this decision was made.
     * 
     */
    @JsonProperty("dfeApplicationId")
    public String getDfeApplicationId() {
        return dfeApplicationId;
    }

    /**
     * Dfe Application Id
     * <p>
     * The unique DfE ID of the application on which this decision was made.
     * 
     */
    @JsonProperty("dfeApplicationId")
    public void setDfeApplicationId(String dfeApplicationId) {
        this.dfeApplicationId = dfeApplicationId;
    }

    public ExternalAdmissionsApplicationDecisionStatuses withDfeApplicationId(String dfeApplicationId) {
        this.dfeApplicationId = dfeApplicationId;
        return this;
    }

    /**
     * Status
     * <p>
     * Status of the decision
     * (Required)
     * 
     */
    @JsonProperty("status")
    public ExternalAdmissionsApplicationDecisionStatuses.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Status of the decision
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(ExternalAdmissionsApplicationDecisionStatuses.Status status) {
        this.status = status;
    }

    public ExternalAdmissionsApplicationDecisionStatuses withStatus(ExternalAdmissionsApplicationDecisionStatuses.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Job Run Id
     * <p>
     * Correlation id of the job run
     * (Required)
     * 
     */
    @JsonProperty("jobRunId")
    public String getJobRunId() {
        return jobRunId;
    }

    /**
     * Job Run Id
     * <p>
     * Correlation id of the job run
     * (Required)
     * 
     */
    @JsonProperty("jobRunId")
    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    public ExternalAdmissionsApplicationDecisionStatuses withJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
        return this;
    }

    /**
     * Error Detail
     * <p>
     * Details of the Error occurred
     * 
     */
    @JsonProperty("errorDetail")
    public String getErrorDetail() {
        return errorDetail;
    }

    /**
     * Error Detail
     * <p>
     * Details of the Error occurred
     * 
     */
    @JsonProperty("errorDetail")
    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public ExternalAdmissionsApplicationDecisionStatuses withErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    /**
     * Error Description
     * <p>
     * Description of the error occurred
     * 
     */
    @JsonProperty("errorDescription")
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Error Description
     * <p>
     * Description of the error occurred
     * 
     */
    @JsonProperty("errorDescription")
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public ExternalAdmissionsApplicationDecisionStatuses withErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    /**
     * Response Code
     * <p>
     * Response code received while sending information to 3rd Party
     * 
     */
    @JsonProperty("responseCode")
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Response Code
     * <p>
     * Response code received while sending information to 3rd Party
     * 
     */
    @JsonProperty("responseCode")
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public ExternalAdmissionsApplicationDecisionStatuses withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * Job Run Date
     * <p>
     * Pipeline Job run date and time
     * 
     */
    @JsonProperty("jobRunDate")
    public Date getJobRunDate() {
        return jobRunDate;
    }

    /**
     * Job Run Date
     * <p>
     * Pipeline Job run date and time
     * 
     */
    @JsonProperty("jobRunDate")
    public void setJobRunDate(Date jobRunDate) {
        this.jobRunDate = jobRunDate;
    }

    public ExternalAdmissionsApplicationDecisionStatuses withJobRunDate(Date jobRunDate) {
        this.jobRunDate = jobRunDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalAdmissionsApplicationDecisionStatuses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("admissionDecision");
        sb.append('=');
        sb.append(((this.admissionDecision == null)?"<null>":this.admissionDecision));
        sb.append(',');
        sb.append("dfeApplicationId");
        sb.append('=');
        sb.append(((this.dfeApplicationId == null)?"<null>":this.dfeApplicationId));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("jobRunId");
        sb.append('=');
        sb.append(((this.jobRunId == null)?"<null>":this.jobRunId));
        sb.append(',');
        sb.append("errorDetail");
        sb.append('=');
        sb.append(((this.errorDetail == null)?"<null>":this.errorDetail));
        sb.append(',');
        sb.append("errorDescription");
        sb.append('=');
        sb.append(((this.errorDescription == null)?"<null>":this.errorDescription));
        sb.append(',');
        sb.append("responseCode");
        sb.append('=');
        sb.append(((this.responseCode == null)?"<null>":this.responseCode));
        sb.append(',');
        sb.append("jobRunDate");
        sb.append('=');
        sb.append(((this.jobRunDate == null)?"<null>":this.jobRunDate));
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
        result = ((result* 31)+((this.jobRunDate == null)? 0 :this.jobRunDate.hashCode()));
        result = ((result* 31)+((this.admissionDecision == null)? 0 :this.admissionDecision.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.errorDescription == null)? 0 :this.errorDescription.hashCode()));
        result = ((result* 31)+((this.dfeApplicationId == null)? 0 :this.dfeApplicationId.hashCode()));
        result = ((result* 31)+((this.errorDetail == null)? 0 :this.errorDetail.hashCode()));
        result = ((result* 31)+((this.jobRunId == null)? 0 :this.jobRunId.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.responseCode == null)? 0 :this.responseCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalAdmissionsApplicationDecisionStatuses) == false) {
            return false;
        }
        ExternalAdmissionsApplicationDecisionStatuses rhs = ((ExternalAdmissionsApplicationDecisionStatuses) other);
        return ((((((((((this.jobRunDate == rhs.jobRunDate)||((this.jobRunDate!= null)&&this.jobRunDate.equals(rhs.jobRunDate)))&&((this.admissionDecision == rhs.admissionDecision)||((this.admissionDecision!= null)&&this.admissionDecision.equals(rhs.admissionDecision))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.errorDescription == rhs.errorDescription)||((this.errorDescription!= null)&&this.errorDescription.equals(rhs.errorDescription))))&&((this.dfeApplicationId == rhs.dfeApplicationId)||((this.dfeApplicationId!= null)&&this.dfeApplicationId.equals(rhs.dfeApplicationId))))&&((this.errorDetail == rhs.errorDetail)||((this.errorDetail!= null)&&this.errorDetail.equals(rhs.errorDetail))))&&((this.jobRunId == rhs.jobRunId)||((this.jobRunId!= null)&&this.jobRunId.equals(rhs.jobRunId))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.responseCode == rhs.responseCode)||((this.responseCode!= null)&&this.responseCode.equals(rhs.responseCode))));
    }


    /**
     * Status
     * <p>
     * Status of the decision
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        SUCCESS("Success"),
        FAILURE("Failure");
        private final String value;
        private final static Map<String, ExternalAdmissionsApplicationDecisionStatuses.Status> CONSTANTS = new HashMap<String, ExternalAdmissionsApplicationDecisionStatuses.Status>();

        static {
            for (ExternalAdmissionsApplicationDecisionStatuses.Status c: values()) {
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
        public static ExternalAdmissionsApplicationDecisionStatuses.Status fromValue(String value) {
            ExternalAdmissionsApplicationDecisionStatuses.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
