
package com.ellucian.generated.eedm.constituent_persons.v12_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "recurrence"
})
@Generated("jsonschema2pojo")
public class SeasonalOccupancy {

    /**
     * Recurrence
     * <p>
     * The recurrence of the seasonal occupancy.
     * 
     */
    @JsonProperty("recurrence")
    @JsonPropertyDescription("The recurrence of the seasonal occupancy.")
    private Object recurrence;

    /**
     * Recurrence
     * <p>
     * The recurrence of the seasonal occupancy.
     * 
     */
    @JsonProperty("recurrence")
    public Object getRecurrence() {
        return recurrence;
    }

    /**
     * Recurrence
     * <p>
     * The recurrence of the seasonal occupancy.
     * 
     */
    @JsonProperty("recurrence")
    public void setRecurrence(Object recurrence) {
        this.recurrence = recurrence;
    }

    public SeasonalOccupancy withRecurrence(Object recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SeasonalOccupancy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recurrence");
        sb.append('=');
        sb.append(((this.recurrence == null)?"<null>":this.recurrence));
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
        result = ((result* 31)+((this.recurrence == null)? 0 :this.recurrence.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeasonalOccupancy) == false) {
            return false;
        }
        SeasonalOccupancy rhs = ((SeasonalOccupancy) other);
        return ((this.recurrence == rhs.recurrence)||((this.recurrence!= null)&&this.recurrence.equals(rhs.recurrence)));
    }

}
