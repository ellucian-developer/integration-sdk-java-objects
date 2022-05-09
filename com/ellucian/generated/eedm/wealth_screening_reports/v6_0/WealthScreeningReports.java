
package com.ellucian.generated.eedm.wealth_screening_reports.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Results of person's wealth screening for fundraising purposes (integration model)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "recordId",
    "requestId",
    "metrics"
})
@Generated("jsonschema2pojo")
public class WealthScreeningReports {

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
     * Record ID
     * <p>
     * The internal identifier of the wealth screening record at the origin
     * (Required)
     * 
     */
    @JsonProperty("recordId")
    @JsonPropertyDescription("The internal identifier of the wealth screening record at the origin")
    private String recordId;
    /**
     * Request Id
     * <p>
     * The global identifier of the request for the wealth screening record
     * (Required)
     * 
     */
    @JsonProperty("requestId")
    @JsonPropertyDescription("The global identifier of the request for the wealth screening record")
    private String requestId;
    /**
     * Metrics
     * <p>
     * Wealth screening metrics
     * 
     */
    @JsonProperty("metrics")
    @JsonPropertyDescription("Wealth screening metrics")
    private Metrics metrics;

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

    public WealthScreeningReports withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Record ID
     * <p>
     * The internal identifier of the wealth screening record at the origin
     * (Required)
     * 
     */
    @JsonProperty("recordId")
    public String getRecordId() {
        return recordId;
    }

    /**
     * Record ID
     * <p>
     * The internal identifier of the wealth screening record at the origin
     * (Required)
     * 
     */
    @JsonProperty("recordId")
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public WealthScreeningReports withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * Request Id
     * <p>
     * The global identifier of the request for the wealth screening record
     * (Required)
     * 
     */
    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    /**
     * Request Id
     * <p>
     * The global identifier of the request for the wealth screening record
     * (Required)
     * 
     */
    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public WealthScreeningReports withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Metrics
     * <p>
     * Wealth screening metrics
     * 
     */
    @JsonProperty("metrics")
    public Metrics getMetrics() {
        return metrics;
    }

    /**
     * Metrics
     * <p>
     * Wealth screening metrics
     * 
     */
    @JsonProperty("metrics")
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    public WealthScreeningReports withMetrics(Metrics metrics) {
        this.metrics = metrics;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WealthScreeningReports.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("recordId");
        sb.append('=');
        sb.append(((this.recordId == null)?"<null>":this.recordId));
        sb.append(',');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null)?"<null>":this.requestId));
        sb.append(',');
        sb.append("metrics");
        sb.append('=');
        sb.append(((this.metrics == null)?"<null>":this.metrics));
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
        result = ((result* 31)+((this.recordId == null)? 0 :this.recordId.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.metrics == null)? 0 :this.metrics.hashCode()));
        result = ((result* 31)+((this.requestId == null)? 0 :this.requestId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WealthScreeningReports) == false) {
            return false;
        }
        WealthScreeningReports rhs = ((WealthScreeningReports) other);
        return (((((this.recordId == rhs.recordId)||((this.recordId!= null)&&this.recordId.equals(rhs.recordId)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.metrics == rhs.metrics)||((this.metrics!= null)&&this.metrics.equals(rhs.metrics))))&&((this.requestId == rhs.requestId)||((this.requestId!= null)&&this.requestId.equals(rhs.requestId))));
    }

}
