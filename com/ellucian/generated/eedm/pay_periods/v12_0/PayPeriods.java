
package com.ellucian.generated.eedm.pay_periods.v12_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Pay Periods
 * <p>
 * The periods of time over which an employee's work time is recorded.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "startOn",
    "endOn",
    "payDate",
    "payCycle",
    "timeEntryStartOn",
    "timeEntryEndOn"
})
@Generated("jsonschema2pojo")
public class PayPeriods {

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
     * The global identifier of the pay period.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the pay period.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the pay period.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the pay period.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the pay period.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the pay period.")
    private String description;
    /**
     * Start On
     * <p>
     * The start date of the pay period.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the pay period.")
    private String startOn;
    /**
     * End On
     * <p>
     * The end date of the pay period.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the pay period.")
    private String endOn;
    /**
     * Pay Date
     * <p>
     * The scheduled check date.
     * (Required)
     * 
     */
    @JsonProperty("payDate")
    @JsonPropertyDescription("The scheduled check date.")
    private String payDate;
    /**
     * Pay Cycle
     * <p>
     * The pay cycle associated with the pay period.
     * (Required)
     * 
     */
    @JsonProperty("payCycle")
    @JsonPropertyDescription("The pay cycle associated with the pay period.")
    private PayCycle payCycle;
    /**
     * Time Entry Start On
     * <p>
     * The earliest date when time entry is available.
     * 
     */
    @JsonProperty("timeEntryStartOn")
    @JsonPropertyDescription("The earliest date when time entry is available.")
    private Object timeEntryStartOn;
    /**
     * Time Entry End On
     * <p>
     * The date and time when time entry is closed.
     * 
     */
    @JsonProperty("timeEntryEndOn")
    @JsonPropertyDescription("The date and time when time entry is closed.")
    private Object timeEntryEndOn;

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

    public PayPeriods withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the pay period.
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
     * The global identifier of the pay period.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PayPeriods withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the pay period.
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
     * The full name of the pay period.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PayPeriods withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the pay period.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the pay period.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PayPeriods withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date of the pay period.
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
     * The start date of the pay period.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public PayPeriods withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the pay period.
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
     * The end date of the pay period.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(String endOn) {
        this.endOn = endOn;
    }

    public PayPeriods withEndOn(String endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Pay Date
     * <p>
     * The scheduled check date.
     * (Required)
     * 
     */
    @JsonProperty("payDate")
    public String getPayDate() {
        return payDate;
    }

    /**
     * Pay Date
     * <p>
     * The scheduled check date.
     * (Required)
     * 
     */
    @JsonProperty("payDate")
    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public PayPeriods withPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }

    /**
     * Pay Cycle
     * <p>
     * The pay cycle associated with the pay period.
     * (Required)
     * 
     */
    @JsonProperty("payCycle")
    public PayCycle getPayCycle() {
        return payCycle;
    }

    /**
     * Pay Cycle
     * <p>
     * The pay cycle associated with the pay period.
     * (Required)
     * 
     */
    @JsonProperty("payCycle")
    public void setPayCycle(PayCycle payCycle) {
        this.payCycle = payCycle;
    }

    public PayPeriods withPayCycle(PayCycle payCycle) {
        this.payCycle = payCycle;
        return this;
    }

    /**
     * Time Entry Start On
     * <p>
     * The earliest date when time entry is available.
     * 
     */
    @JsonProperty("timeEntryStartOn")
    public Object getTimeEntryStartOn() {
        return timeEntryStartOn;
    }

    /**
     * Time Entry Start On
     * <p>
     * The earliest date when time entry is available.
     * 
     */
    @JsonProperty("timeEntryStartOn")
    public void setTimeEntryStartOn(Object timeEntryStartOn) {
        this.timeEntryStartOn = timeEntryStartOn;
    }

    public PayPeriods withTimeEntryStartOn(Object timeEntryStartOn) {
        this.timeEntryStartOn = timeEntryStartOn;
        return this;
    }

    /**
     * Time Entry End On
     * <p>
     * The date and time when time entry is closed.
     * 
     */
    @JsonProperty("timeEntryEndOn")
    public Object getTimeEntryEndOn() {
        return timeEntryEndOn;
    }

    /**
     * Time Entry End On
     * <p>
     * The date and time when time entry is closed.
     * 
     */
    @JsonProperty("timeEntryEndOn")
    public void setTimeEntryEndOn(Object timeEntryEndOn) {
        this.timeEntryEndOn = timeEntryEndOn;
    }

    public PayPeriods withTimeEntryEndOn(Object timeEntryEndOn) {
        this.timeEntryEndOn = timeEntryEndOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayPeriods.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("payDate");
        sb.append('=');
        sb.append(((this.payDate == null)?"<null>":this.payDate));
        sb.append(',');
        sb.append("payCycle");
        sb.append('=');
        sb.append(((this.payCycle == null)?"<null>":this.payCycle));
        sb.append(',');
        sb.append("timeEntryStartOn");
        sb.append('=');
        sb.append(((this.timeEntryStartOn == null)?"<null>":this.timeEntryStartOn));
        sb.append(',');
        sb.append("timeEntryEndOn");
        sb.append('=');
        sb.append(((this.timeEntryEndOn == null)?"<null>":this.timeEntryEndOn));
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
        result = ((result* 31)+((this.timeEntryEndOn == null)? 0 :this.timeEntryEndOn.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.timeEntryStartOn == null)? 0 :this.timeEntryStartOn.hashCode()));
        result = ((result* 31)+((this.payCycle == null)? 0 :this.payCycle.hashCode()));
        result = ((result* 31)+((this.payDate == null)? 0 :this.payDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayPeriods) == false) {
            return false;
        }
        PayPeriods rhs = ((PayPeriods) other);
        return (((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.timeEntryEndOn == rhs.timeEntryEndOn)||((this.timeEntryEndOn!= null)&&this.timeEntryEndOn.equals(rhs.timeEntryEndOn))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.timeEntryStartOn == rhs.timeEntryStartOn)||((this.timeEntryStartOn!= null)&&this.timeEntryStartOn.equals(rhs.timeEntryStartOn))))&&((this.payCycle == rhs.payCycle)||((this.payCycle!= null)&&this.payCycle.equals(rhs.payCycle))))&&((this.payDate == rhs.payDate)||((this.payDate!= null)&&this.payDate.equals(rhs.payDate))));
    }

}
