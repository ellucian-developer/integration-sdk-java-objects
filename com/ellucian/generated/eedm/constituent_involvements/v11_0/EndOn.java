
package com.ellucian.generated.eedm.constituent_involvements.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * End Date
 * <p>
 * The date when a constituent's involvement in an activity ends.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "year",
    "month",
    "day"
})
@Generated("jsonschema2pojo")
public class EndOn {

    /**
     * Year
     * <p>
     * The year part of the date.
     * 
     */
    @JsonProperty("year")
    @JsonPropertyDescription("The year part of the date.")
    private Double year;
    /**
     * Month
     * <p>
     * The month part of the date.
     * 
     */
    @JsonProperty("month")
    @JsonPropertyDescription("The month part of the date.")
    private Double month;
    /**
     * Day
     * <p>
     * The day part of the date.
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("The day part of the date.")
    private Double day;

    /**
     * Year
     * <p>
     * The year part of the date.
     * 
     */
    @JsonProperty("year")
    public Double getYear() {
        return year;
    }

    /**
     * Year
     * <p>
     * The year part of the date.
     * 
     */
    @JsonProperty("year")
    public void setYear(Double year) {
        this.year = year;
    }

    public EndOn withYear(Double year) {
        this.year = year;
        return this;
    }

    /**
     * Month
     * <p>
     * The month part of the date.
     * 
     */
    @JsonProperty("month")
    public Double getMonth() {
        return month;
    }

    /**
     * Month
     * <p>
     * The month part of the date.
     * 
     */
    @JsonProperty("month")
    public void setMonth(Double month) {
        this.month = month;
    }

    public EndOn withMonth(Double month) {
        this.month = month;
        return this;
    }

    /**
     * Day
     * <p>
     * The day part of the date.
     * 
     */
    @JsonProperty("day")
    public Double getDay() {
        return day;
    }

    /**
     * Day
     * <p>
     * The day part of the date.
     * 
     */
    @JsonProperty("day")
    public void setDay(Double day) {
        this.day = day;
    }

    public EndOn withDay(Double day) {
        this.day = day;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EndOn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("month");
        sb.append('=');
        sb.append(((this.month == null)?"<null>":this.month));
        sb.append(',');
        sb.append("day");
        sb.append('=');
        sb.append(((this.day == null)?"<null>":this.day));
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
        result = ((result* 31)+((this.month == null)? 0 :this.month.hashCode()));
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.day == null)? 0 :this.day.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndOn) == false) {
            return false;
        }
        EndOn rhs = ((EndOn) other);
        return ((((this.month == rhs.month)||((this.month!= null)&&this.month.equals(rhs.month)))&&((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year))))&&((this.day == rhs.day)||((this.day!= null)&&this.day.equals(rhs.day))));
    }

}
