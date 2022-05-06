
package com.ellucian.generated.bpapi.ban.room_assignment_status.v1_0_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "endDate",
    "xxxxxxxTermCode",
    "startDate",
    "ascdCode"
})
@Generated("jsonschema2pojo")
public class RoomAssignmentStatus100GetRequest {

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_END_DATE")
    private Date endDate;
    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm")
    private Object xxxxxxxTermCode;
    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_START_DATE")
    private Date startDate;
    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("ascdCode")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd")
    private String ascdCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public RoomAssignmentStatus100GetRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public Object getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public RoomAssignmentStatus100GetRequest withXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
        return this;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public RoomAssignmentStatus100GetRequest withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("ascdCode")
    public String getAscdCode() {
        return ascdCode;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("ascdCode")
    public void setAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
    }

    public RoomAssignmentStatus100GetRequest withAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public RoomAssignmentStatus100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomAssignmentStatus100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("xxxxxxxTermCode");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCode == null)?"<null>":this.xxxxxxxTermCode));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("ascdCode");
        sb.append('=');
        sb.append(((this.ascdCode == null)?"<null>":this.ascdCode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCode == null)? 0 :this.xxxxxxxTermCode.hashCode()));
        result = ((result* 31)+((this.ascdCode == null)? 0 :this.ascdCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomAssignmentStatus100GetRequest) == false) {
            return false;
        }
        RoomAssignmentStatus100GetRequest rhs = ((RoomAssignmentStatus100GetRequest) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode))))&&((this.ascdCode == rhs.ascdCode)||((this.ascdCode!= null)&&this.ascdCode.equals(rhs.ascdCode))));
    }

}
