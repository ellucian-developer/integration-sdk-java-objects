
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startDate",
    "endDate"
})
@Generated("jsonschema2pojo")
public class AttendancePeriod {

    /**
     * Start Date
     * <p>
     * The start date for the attendance period.
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("The start date for the attendance period.")
    private Object startDate;
    /**
     * End Date
     * <p>
     * The end date for the attendance period
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("The end date for the attendance period")
    private Object endDate;

    /**
     * Start Date
     * <p>
     * The start date for the attendance period.
     * 
     */
    @JsonProperty("startDate")
    public Object getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * The start date for the attendance period.
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public AttendancePeriod withStartDate(Object startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * The end date for the attendance period
     * 
     */
    @JsonProperty("endDate")
    public Object getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * The end date for the attendance period
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public AttendancePeriod withEndDate(Object endDate) {
        this.endDate = endDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttendancePeriod.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttendancePeriod) == false) {
            return false;
        }
        AttendancePeriod rhs = ((AttendancePeriod) other);
        return (((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
