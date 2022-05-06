
package com.ellucian.generated.bpapi.ban.commodity_maintenance.v1_0_0;

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
    "displayCommCode"
})
@Generated("jsonschema2pojo")
public class CommodityMaintenance100GetRequest {

    /**
     * Commodity Code
     * <p>
     * Lineage reference object : displayCommCode
     * 
     */
    @JsonProperty("displayCommCode")
    @JsonPropertyDescription("Lineage reference object : displayCommCode")
    private Object displayCommCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Commodity Code
     * <p>
     * Lineage reference object : displayCommCode
     * 
     */
    @JsonProperty("displayCommCode")
    public Object getDisplayCommCode() {
        return displayCommCode;
    }

    /**
     * Commodity Code
     * <p>
     * Lineage reference object : displayCommCode
     * 
     */
    @JsonProperty("displayCommCode")
    public void setDisplayCommCode(Object displayCommCode) {
        this.displayCommCode = displayCommCode;
    }

    public CommodityMaintenance100GetRequest withDisplayCommCode(Object displayCommCode) {
        this.displayCommCode = displayCommCode;
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

    public CommodityMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommodityMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayCommCode");
        sb.append('=');
        sb.append(((this.displayCommCode == null)?"<null>":this.displayCommCode));
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
        result = ((result* 31)+((this.displayCommCode == null)? 0 :this.displayCommCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommodityMaintenance100GetRequest) == false) {
            return false;
        }
        CommodityMaintenance100GetRequest rhs = ((CommodityMaintenance100GetRequest) other);
        return (((this.displayCommCode == rhs.displayCommCode)||((this.displayCommCode!= null)&&this.displayCommCode.equals(rhs.displayCommCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}