
package com.ellucian.generated.eedm.fiscal_years.v11_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Fiscal Years
 * <p>
 * The periods of time that an institution uses for accounting and financial statement purposes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "reportingSegment",
    "startOn",
    "endOn",
    "numberOfPeriods",
    "yearEndAdjustment",
    "status"
})
@Generated("jsonschema2pojo")
public class FiscalYears {

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
     * The global identifier of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the fiscal year.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the fiscal year.")
    private String title;
    /**
     * Reporting Segment
     * <p>
     * The segment of the educational institution used for reporting purposes.
     * (Required)
     * 
     */
    @JsonProperty("reportingSegment")
    @JsonPropertyDescription("The segment of the educational institution used for reporting purposes.")
    private String reportingSegment;
    /**
     * Start On
     * <p>
     * The start date of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the fiscal year.")
    private String startOn;
    /**
     * End On
     * <p>
     * The end date of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the fiscal year.")
    private String endOn;
    /**
     * Number Of Periods
     * <p>
     * The number of periods in the fiscal year.
     * 
     */
    @JsonProperty("numberOfPeriods")
    @JsonPropertyDescription("The number of periods in the fiscal year.")
    private Object numberOfPeriods;
    /**
     * Year End Adjustment
     * <p>
     * An indication whether the year end adjustment is active or inactive.
     * 
     */
    @JsonProperty("yearEndAdjustment")
    @JsonPropertyDescription("An indication whether the year end adjustment is active or inactive.")
    private Object yearEndAdjustment;
    /**
     * Status
     * <p>
     * The status of the fiscal year.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the fiscal year.")
    private Object status;

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

    public FiscalYears withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the fiscal year.
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
     * The global identifier of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FiscalYears withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FiscalYears withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Reporting Segment
     * <p>
     * The segment of the educational institution used for reporting purposes.
     * (Required)
     * 
     */
    @JsonProperty("reportingSegment")
    public String getReportingSegment() {
        return reportingSegment;
    }

    /**
     * Reporting Segment
     * <p>
     * The segment of the educational institution used for reporting purposes.
     * (Required)
     * 
     */
    @JsonProperty("reportingSegment")
    public void setReportingSegment(String reportingSegment) {
        this.reportingSegment = reportingSegment;
    }

    public FiscalYears withReportingSegment(String reportingSegment) {
        this.reportingSegment = reportingSegment;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public FiscalYears withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public String getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the fiscal year.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(String endOn) {
        this.endOn = endOn;
    }

    public FiscalYears withEndOn(String endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Number Of Periods
     * <p>
     * The number of periods in the fiscal year.
     * 
     */
    @JsonProperty("numberOfPeriods")
    public Object getNumberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * Number Of Periods
     * <p>
     * The number of periods in the fiscal year.
     * 
     */
    @JsonProperty("numberOfPeriods")
    public void setNumberOfPeriods(Object numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }

    public FiscalYears withNumberOfPeriods(Object numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
        return this;
    }

    /**
     * Year End Adjustment
     * <p>
     * An indication whether the year end adjustment is active or inactive.
     * 
     */
    @JsonProperty("yearEndAdjustment")
    public Object getYearEndAdjustment() {
        return yearEndAdjustment;
    }

    /**
     * Year End Adjustment
     * <p>
     * An indication whether the year end adjustment is active or inactive.
     * 
     */
    @JsonProperty("yearEndAdjustment")
    public void setYearEndAdjustment(Object yearEndAdjustment) {
        this.yearEndAdjustment = yearEndAdjustment;
    }

    public FiscalYears withYearEndAdjustment(Object yearEndAdjustment) {
        this.yearEndAdjustment = yearEndAdjustment;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the fiscal year.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the fiscal year.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public FiscalYears withStatus(Object status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FiscalYears.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("reportingSegment");
        sb.append('=');
        sb.append(((this.reportingSegment == null)?"<null>":this.reportingSegment));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("numberOfPeriods");
        sb.append('=');
        sb.append(((this.numberOfPeriods == null)?"<null>":this.numberOfPeriods));
        sb.append(',');
        sb.append("yearEndAdjustment");
        sb.append('=');
        sb.append(((this.yearEndAdjustment == null)?"<null>":this.yearEndAdjustment));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.reportingSegment == null)? 0 :this.reportingSegment.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.yearEndAdjustment == null)? 0 :this.yearEndAdjustment.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.numberOfPeriods == null)? 0 :this.numberOfPeriods.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FiscalYears) == false) {
            return false;
        }
        FiscalYears rhs = ((FiscalYears) other);
        return ((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.reportingSegment == rhs.reportingSegment)||((this.reportingSegment!= null)&&this.reportingSegment.equals(rhs.reportingSegment))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.yearEndAdjustment == rhs.yearEndAdjustment)||((this.yearEndAdjustment!= null)&&this.yearEndAdjustment.equals(rhs.yearEndAdjustment))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.numberOfPeriods == rhs.numberOfPeriods)||((this.numberOfPeriods!= null)&&this.numberOfPeriods.equals(rhs.numberOfPeriods))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
