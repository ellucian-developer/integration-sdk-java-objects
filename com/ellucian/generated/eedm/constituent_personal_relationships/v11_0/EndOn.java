
package com.ellucian.generated.eedm.constituent_personal_relationships.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * End Date
 * <p>
 * The date when the relationship ended
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
     * The year when the relationship ended
     * 
     */
    @JsonProperty("year")
    @JsonPropertyDescription("The year when the relationship ended")
    private Object year;
    /**
     * Month
     * <p>
     * The month when the relationship ended
     * 
     */
    @JsonProperty("month")
    @JsonPropertyDescription("The month when the relationship ended")
    private Object month;
    /**
     * Day
     * <p>
     * The day when the relationship ended
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("The day when the relationship ended")
    private Object day;

    /**
     * Year
     * <p>
     * The year when the relationship ended
     * 
     */
    @JsonProperty("year")
    public Object getYear() {
        return year;
    }

    /**
     * Year
     * <p>
     * The year when the relationship ended
     * 
     */
    @JsonProperty("year")
    public void setYear(Object year) {
        this.year = year;
    }

    public EndOn withYear(Object year) {
        this.year = year;
        return this;
    }

    /**
     * Month
     * <p>
     * The month when the relationship ended
     * 
     */
    @JsonProperty("month")
    public Object getMonth() {
        return month;
    }

    /**
     * Month
     * <p>
     * The month when the relationship ended
     * 
     */
    @JsonProperty("month")
    public void setMonth(Object month) {
        this.month = month;
    }

    public EndOn withMonth(Object month) {
        this.month = month;
        return this;
    }

    /**
     * Day
     * <p>
     * The day when the relationship ended
     * 
     */
    @JsonProperty("day")
    public Object getDay() {
        return day;
    }

    /**
     * Day
     * <p>
     * The day when the relationship ended
     * 
     */
    @JsonProperty("day")
    public void setDay(Object day) {
        this.day = day;
    }

    public EndOn withDay(Object day) {
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
