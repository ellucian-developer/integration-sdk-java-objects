
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
    "georCode",
    "startRange",
    "endRange",
    "geodCode",
    "type"
})
@Generated("jsonschema2pojo")
public class GeographicRegionRules100PostRequest {

    /**
     * Region
     * <p>
     * Lineage reference object : georCode, Lookup lineage reference object : stvgeor
     * 
     */
    @JsonProperty("georCode")
    @JsonPropertyDescription("Lineage reference object : georCode, Lookup lineage reference object : stvgeor")
    private Object georCode;
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
     * Division
     * <p>
     * Lineage reference object : geodCode, Lookup lineage reference object : stvgeod
     * 
     */
    @JsonProperty("geodCode")
    @JsonPropertyDescription("Lineage reference object : geodCode, Lookup lineage reference object : stvgeod")
    private Object geodCode;
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
     * Region
     * <p>
     * Lineage reference object : georCode, Lookup lineage reference object : stvgeor
     * 
     */
    @JsonProperty("georCode")
    public Object getGeorCode() {
        return georCode;
    }

    /**
     * Region
     * <p>
     * Lineage reference object : georCode, Lookup lineage reference object : stvgeor
     * 
     */
    @JsonProperty("georCode")
    public void setGeorCode(Object georCode) {
        this.georCode = georCode;
    }

    public GeographicRegionRules100PostRequest withGeorCode(Object georCode) {
        this.georCode = georCode;
        return this;
    }

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

    public GeographicRegionRules100PostRequest withStartRange(String startRange) {
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

    public GeographicRegionRules100PostRequest withEndRange(String endRange) {
        this.endRange = endRange;
        return this;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : geodCode, Lookup lineage reference object : stvgeod
     * 
     */
    @JsonProperty("geodCode")
    public Object getGeodCode() {
        return geodCode;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : geodCode, Lookup lineage reference object : stvgeod
     * 
     */
    @JsonProperty("geodCode")
    public void setGeodCode(Object geodCode) {
        this.geodCode = geodCode;
    }

    public GeographicRegionRules100PostRequest withGeodCode(Object geodCode) {
        this.geodCode = geodCode;
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

    public GeographicRegionRules100PostRequest withType(String type) {
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

    public GeographicRegionRules100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeographicRegionRules100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("georCode");
        sb.append('=');
        sb.append(((this.georCode == null)?"<null>":this.georCode));
        sb.append(',');
        sb.append("startRange");
        sb.append('=');
        sb.append(((this.startRange == null)?"<null>":this.startRange));
        sb.append(',');
        sb.append("endRange");
        sb.append('=');
        sb.append(((this.endRange == null)?"<null>":this.endRange));
        sb.append(',');
        sb.append("geodCode");
        sb.append('=');
        sb.append(((this.geodCode == null)?"<null>":this.geodCode));
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
        result = ((result* 31)+((this.georCode == null)? 0 :this.georCode.hashCode()));
        result = ((result* 31)+((this.startRange == null)? 0 :this.startRange.hashCode()));
        result = ((result* 31)+((this.endRange == null)? 0 :this.endRange.hashCode()));
        result = ((result* 31)+((this.geodCode == null)? 0 :this.geodCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeographicRegionRules100PostRequest) == false) {
            return false;
        }
        GeographicRegionRules100PostRequest rhs = ((GeographicRegionRules100PostRequest) other);
        return (((((((this.georCode == rhs.georCode)||((this.georCode!= null)&&this.georCode.equals(rhs.georCode)))&&((this.startRange == rhs.startRange)||((this.startRange!= null)&&this.startRange.equals(rhs.startRange))))&&((this.endRange == rhs.endRange)||((this.endRange!= null)&&this.endRange.equals(rhs.endRange))))&&((this.geodCode == rhs.geodCode)||((this.geodCode!= null)&&this.geodCode.equals(rhs.geodCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
