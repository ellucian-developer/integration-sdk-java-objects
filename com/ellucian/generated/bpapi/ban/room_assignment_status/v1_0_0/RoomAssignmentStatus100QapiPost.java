
package com.ellucian.generated.bpapi.ban.room_assignment_status.v1_0_0;

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
    "xxxxxxxTermCode",
    "ascdCode",
    "startDate",
    "endDate"
})
@Generated("jsonschema2pojo")
public class RoomAssignmentStatus100QapiPost {

    @JsonProperty("xxxxxxxTermCode")
    private String xxxxxxxTermCode;
    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRRFCR_ASCD_CODE
     * 
     */
    @JsonProperty("ascdCode")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_ASCD_CODE")
    private String ascdCode;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("xxxxxxxTermCode")
    public String getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(String xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public RoomAssignmentStatus100QapiPost withXxxxxxxTermCode(String xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
        return this;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRRFCR_ASCD_CODE
     * 
     */
    @JsonProperty("ascdCode")
    public String getAscdCode() {
        return ascdCode;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRRFCR_ASCD_CODE
     * 
     */
    @JsonProperty("ascdCode")
    public void setAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
    }

    public RoomAssignmentStatus100QapiPost withAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
        return this;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public RoomAssignmentStatus100QapiPost withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public RoomAssignmentStatus100QapiPost withEndDate(String endDate) {
        this.endDate = endDate;
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

    public RoomAssignmentStatus100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomAssignmentStatus100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xxxxxxxTermCode");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCode == null)?"<null>":this.xxxxxxxTermCode));
        sb.append(',');
        sb.append("ascdCode");
        sb.append('=');
        sb.append(((this.ascdCode == null)?"<null>":this.ascdCode));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
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
        if ((other instanceof RoomAssignmentStatus100QapiPost) == false) {
            return false;
        }
        RoomAssignmentStatus100QapiPost rhs = ((RoomAssignmentStatus100QapiPost) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode))))&&((this.ascdCode == rhs.ascdCode)||((this.ascdCode!= null)&&this.ascdCode.equals(rhs.ascdCode))));
    }

}
