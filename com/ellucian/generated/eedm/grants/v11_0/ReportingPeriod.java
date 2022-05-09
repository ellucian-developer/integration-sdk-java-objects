
package com.ellucian.generated.eedm.grants.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class ReportingPeriod {

    /**
     * Start On
     * <p>
     * The first date of the reporting period.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date of the reporting period.")
    private String startOn;
    /**
     * End On
     * <p>
     * The last date of the reporting period.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date of the reporting period.")
    private String endOn;

    /**
     * Start On
     * <p>
     * The first date of the reporting period.
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
     * The first date of the reporting period.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public ReportingPeriod withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date of the reporting period.
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
     * The last date of the reporting period.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(String endOn) {
        this.endOn = endOn;
    }

    public ReportingPeriod withEndOn(String endOn) {
        this.endOn = endOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReportingPeriod.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReportingPeriod) == false) {
            return false;
        }
        ReportingPeriod rhs = ((ReportingPeriod) other);
        return (((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))));
    }

}
