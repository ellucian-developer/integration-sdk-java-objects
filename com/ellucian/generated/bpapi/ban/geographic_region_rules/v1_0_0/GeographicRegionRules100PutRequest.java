
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
    "criteria.endRange",
    "endRange",
    "geodCode",
    "type",
    "criteria.type",
    "criteria.startRange"
})
@Generated("jsonschema2pojo")
public class GeographicRegionRules100PutRequest {

    /**
     * Region
     * <p>
     * Lineage reference object : georCode, Lookup lineage reference object : stvgeor
     * 
     */
    @JsonProperty("georCode")
    @JsonPropertyDescription("Lineage reference object : georCode, Lookup lineage reference object : stvgeor")
    private String georCode;
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
    @JsonProperty("criteria.endRange")
    @JsonPropertyDescription("Lineage reference object : SORGEOR_END_RANGE")
    private String criteriaEndRange;
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
    private String geodCode;
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
    /**
     * Type
     * <p>
     * Lineage reference object : SORGEOR_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.type")
    @JsonPropertyDescription("Lineage reference object : SORGEOR_TYPE")
    private String criteriaType;
    /**
     * Value A
     * <p>
     * Lineage reference object : SORGEOR_START_RANGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startRange")
    @JsonPropertyDescription("Lineage reference object : SORGEOR_START_RANGE")
    private String criteriaStartRange;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Region
     * <p>
     * Lineage reference object : georCode, Lookup lineage reference object : stvgeor
     * 
     */
    @JsonProperty("georCode")
    public String getGeorCode() {
        return georCode;
    }

    /**
     * Region
     * <p>
     * Lineage reference object : georCode, Lookup lineage reference object : stvgeor
     * 
     */
    @JsonProperty("georCode")
    public void setGeorCode(String georCode) {
        this.georCode = georCode;
    }

    public GeographicRegionRules100PutRequest withGeorCode(String georCode) {
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

    public GeographicRegionRules100PutRequest withStartRange(String startRange) {
        this.startRange = startRange;
        return this;
    }

    /**
     * Value B
     * <p>
     * Lineage reference object : SORGEOR_END_RANGE
     * 
     */
    @JsonProperty("criteria.endRange")
    public String getCriteriaEndRange() {
        return criteriaEndRange;
    }

    /**
     * Value B
     * <p>
     * Lineage reference object : SORGEOR_END_RANGE
     * 
     */
    @JsonProperty("criteria.endRange")
    public void setCriteriaEndRange(String criteriaEndRange) {
        this.criteriaEndRange = criteriaEndRange;
    }

    public GeographicRegionRules100PutRequest withCriteriaEndRange(String criteriaEndRange) {
        this.criteriaEndRange = criteriaEndRange;
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

    public GeographicRegionRules100PutRequest withEndRange(String endRange) {
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
    public String getGeodCode() {
        return geodCode;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : geodCode, Lookup lineage reference object : stvgeod
     * 
     */
    @JsonProperty("geodCode")
    public void setGeodCode(String geodCode) {
        this.geodCode = geodCode;
    }

    public GeographicRegionRules100PutRequest withGeodCode(String geodCode) {
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

    public GeographicRegionRules100PutRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SORGEOR_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.type")
    public String getCriteriaType() {
        return criteriaType;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SORGEOR_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.type")
    public void setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
    }

    public GeographicRegionRules100PutRequest withCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }

    /**
     * Value A
     * <p>
     * Lineage reference object : SORGEOR_START_RANGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startRange")
    public String getCriteriaStartRange() {
        return criteriaStartRange;
    }

    /**
     * Value A
     * <p>
     * Lineage reference object : SORGEOR_START_RANGE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startRange")
    public void setCriteriaStartRange(String criteriaStartRange) {
        this.criteriaStartRange = criteriaStartRange;
    }

    public GeographicRegionRules100PutRequest withCriteriaStartRange(String criteriaStartRange) {
        this.criteriaStartRange = criteriaStartRange;
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

    public GeographicRegionRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeographicRegionRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("georCode");
        sb.append('=');
        sb.append(((this.georCode == null)?"<null>":this.georCode));
        sb.append(',');
        sb.append("startRange");
        sb.append('=');
        sb.append(((this.startRange == null)?"<null>":this.startRange));
        sb.append(',');
        sb.append("criteriaEndRange");
        sb.append('=');
        sb.append(((this.criteriaEndRange == null)?"<null>":this.criteriaEndRange));
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
        sb.append("criteriaType");
        sb.append('=');
        sb.append(((this.criteriaType == null)?"<null>":this.criteriaType));
        sb.append(',');
        sb.append("criteriaStartRange");
        sb.append('=');
        sb.append(((this.criteriaStartRange == null)?"<null>":this.criteriaStartRange));
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
        result = ((result* 31)+((this.criteriaStartRange == null)? 0 :this.criteriaStartRange.hashCode()));
        result = ((result* 31)+((this.criteriaEndRange == null)? 0 :this.criteriaEndRange.hashCode()));
        result = ((result* 31)+((this.endRange == null)? 0 :this.endRange.hashCode()));
        result = ((result* 31)+((this.geodCode == null)? 0 :this.geodCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.criteriaType == null)? 0 :this.criteriaType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeographicRegionRules100PutRequest) == false) {
            return false;
        }
        GeographicRegionRules100PutRequest rhs = ((GeographicRegionRules100PutRequest) other);
        return ((((((((((this.georCode == rhs.georCode)||((this.georCode!= null)&&this.georCode.equals(rhs.georCode)))&&((this.startRange == rhs.startRange)||((this.startRange!= null)&&this.startRange.equals(rhs.startRange))))&&((this.criteriaStartRange == rhs.criteriaStartRange)||((this.criteriaStartRange!= null)&&this.criteriaStartRange.equals(rhs.criteriaStartRange))))&&((this.criteriaEndRange == rhs.criteriaEndRange)||((this.criteriaEndRange!= null)&&this.criteriaEndRange.equals(rhs.criteriaEndRange))))&&((this.endRange == rhs.endRange)||((this.endRange!= null)&&this.endRange.equals(rhs.endRange))))&&((this.geodCode == rhs.geodCode)||((this.geodCode!= null)&&this.geodCode.equals(rhs.geodCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.criteriaType == rhs.criteriaType)||((this.criteriaType!= null)&&this.criteriaType.equals(rhs.criteriaType))));
    }

}
