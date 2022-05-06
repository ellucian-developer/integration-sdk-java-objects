
package com.ellucian.generated.bpapi.ban.geographic_region_rules.v1_0_0;

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
    "startRange",
    "endRange",
    "type"
})
@Generated("jsonschema2pojo")
public class GeographicRegionRules100PostResponse {

    /**
     * Value A
     * <p>
     * Lineage reference object : SORGEOR_START_RANGE
     * (Required)
     * 
     */
    @JsonProperty("startRange")
    @JsonPropertyDescription("Lineage reference object : SORGEOR_START_RANGE")
    private String startRange;
    /**
     * Value B
     * <p>
     * Lineage reference object : SORGEOR_END_RANGE
     * 
     */
    @JsonProperty("endRange")
    @JsonPropertyDescription("Lineage reference object : SORGEOR_END_RANGE")
    private String endRange;
    /**
     * Type
     * <p>
     * Lineage reference object : SORGEOR_TYPE
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : SORGEOR_TYPE")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Value A
     * <p>
     * Lineage reference object : SORGEOR_START_RANGE
     * (Required)
     * 
     */
    @JsonProperty("startRange")
    public String getStartRange() {
        return startRange;
    }

    /**
     * Value A
     * <p>
     * Lineage reference object : SORGEOR_START_RANGE
     * (Required)
     * 
     */
    @JsonProperty("startRange")
    public void setStartRange(String startRange) {
        this.startRange = startRange;
    }

    public GeographicRegionRules100PostResponse withStartRange(String startRange) {
        this.startRange = startRange;
        return this;
    }

    /**
     * Value B
     * <p>
     * Lineage reference object : SORGEOR_END_RANGE
     * 
     */
    @JsonProperty("endRange")
    public String getEndRange() {
        return endRange;
    }

    /**
     * Value B
     * <p>
     * Lineage reference object : SORGEOR_END_RANGE
     * 
     */
    @JsonProperty("endRange")
    public void setEndRange(String endRange) {
        this.endRange = endRange;
    }

    public GeographicRegionRules100PostResponse withEndRange(String endRange) {
        this.endRange = endRange;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SORGEOR_TYPE
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SORGEOR_TYPE
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public GeographicRegionRules100PostResponse withType(String type) {
        this.type = type;
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

    public GeographicRegionRules100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeographicRegionRules100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startRange");
        sb.append('=');
        sb.append(((this.startRange == null)?"<null>":this.startRange));
        sb.append(',');
        sb.append("endRange");
        sb.append('=');
        sb.append(((this.endRange == null)?"<null>":this.endRange));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.startRange == null)? 0 :this.startRange.hashCode()));
        result = ((result* 31)+((this.endRange == null)? 0 :this.endRange.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeographicRegionRules100PostResponse) == false) {
            return false;
        }
        GeographicRegionRules100PostResponse rhs = ((GeographicRegionRules100PostResponse) other);
        return (((((this.startRange == rhs.startRange)||((this.startRange!= null)&&this.startRange.equals(rhs.startRange)))&&((this.endRange == rhs.endRange)||((this.endRange!= null)&&this.endRange.equals(rhs.endRange))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
