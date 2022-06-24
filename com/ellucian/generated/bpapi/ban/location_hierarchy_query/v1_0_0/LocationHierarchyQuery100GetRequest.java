
package com.ellucian.generated.bpapi.ban.location_hierarchy_query.v1_0_0;

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
    "ftxlochLocnCode",
    "ftxlochCoasCode"
})
@Generated("jsonschema2pojo")
public class LocationHierarchyQuery100GetRequest {

    /**
     * Location
     * <p>
     * Lineage reference object : ftxlochLocnCode
     * 
     */
    @JsonProperty("ftxlochLocnCode")
    @JsonPropertyDescription("Lineage reference object : ftxlochLocnCode")
    private String ftxlochLocnCode;
    /**
     * COA
     * <p>
     * Lineage reference object : ftxlochCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxlochCoasCode")
    @JsonPropertyDescription("Lineage reference object : ftxlochCoasCode, Lookup lineage reference object : ftvcoas")
    private String ftxlochCoasCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Location
     * <p>
     * Lineage reference object : ftxlochLocnCode
     * 
     */
    @JsonProperty("ftxlochLocnCode")
    public String getFtxlochLocnCode() {
        return ftxlochLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : ftxlochLocnCode
     * 
     */
    @JsonProperty("ftxlochLocnCode")
    public void setFtxlochLocnCode(String ftxlochLocnCode) {
        this.ftxlochLocnCode = ftxlochLocnCode;
    }

    public LocationHierarchyQuery100GetRequest withFtxlochLocnCode(String ftxlochLocnCode) {
        this.ftxlochLocnCode = ftxlochLocnCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : ftxlochCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxlochCoasCode")
    public String getFtxlochCoasCode() {
        return ftxlochCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : ftxlochCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("ftxlochCoasCode")
    public void setFtxlochCoasCode(String ftxlochCoasCode) {
        this.ftxlochCoasCode = ftxlochCoasCode;
    }

    public LocationHierarchyQuery100GetRequest withFtxlochCoasCode(String ftxlochCoasCode) {
        this.ftxlochCoasCode = ftxlochCoasCode;
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

    public LocationHierarchyQuery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationHierarchyQuery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftxlochLocnCode");
        sb.append('=');
        sb.append(((this.ftxlochLocnCode == null)?"<null>":this.ftxlochLocnCode));
        sb.append(',');
        sb.append("ftxlochCoasCode");
        sb.append('=');
        sb.append(((this.ftxlochCoasCode == null)?"<null>":this.ftxlochCoasCode));
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
        result = ((result* 31)+((this.ftxlochLocnCode == null)? 0 :this.ftxlochLocnCode.hashCode()));
        result = ((result* 31)+((this.ftxlochCoasCode == null)? 0 :this.ftxlochCoasCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationHierarchyQuery100GetRequest) == false) {
            return false;
        }
        LocationHierarchyQuery100GetRequest rhs = ((LocationHierarchyQuery100GetRequest) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ftxlochLocnCode == rhs.ftxlochLocnCode)||((this.ftxlochLocnCode!= null)&&this.ftxlochLocnCode.equals(rhs.ftxlochLocnCode))))&&((this.ftxlochCoasCode == rhs.ftxlochCoasCode)||((this.ftxlochCoasCode!= null)&&this.ftxlochCoasCode.equals(rhs.ftxlochCoasCode))));
    }

}
