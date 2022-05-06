
package com.ellucian.generated.bpapi.ban.building_query.v1_0_0;

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
    "siteCode",
    "campCode",
    "bldgDesc",
    "maximumCapacity",
    "bldgCode",
    "capacity"
})
@Generated("jsonschema2pojo")
public class BuildingQuery100GetRequest {

    /**
     * Site
     * <p>
     * Lineage reference object : SLBBLDG_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_SITE_CODE, Lookup lineage reference object : stvsite")
    private String siteCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bldgDesc")
    private String bldgDesc;
    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBBLDG_MAXIMUM_CAPACITY
     * 
     */
    @JsonProperty("maximumCapacity")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_MAXIMUM_CAPACITY")
    private Double maximumCapacity;
    /**
     * Building
     * <p>
     * Lineage reference object : SLBBLDG_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("bldgCode")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_BLDG_CODE, Lookup lineage reference object : stvbldg")
    private String bldgCode;
    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBBLDG_CAPACITY
     * 
     */
    @JsonProperty("capacity")
    @JsonPropertyDescription("Lineage reference object : SLBBLDG_CAPACITY")
    private Double capacity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Site
     * <p>
     * Lineage reference object : SLBBLDG_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SLBBLDG_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public BuildingQuery100GetRequest withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SLBBLDG_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public BuildingQuery100GetRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bldgDesc")
    public String getBldgDesc() {
        return bldgDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bldgDesc")
    public void setBldgDesc(String bldgDesc) {
        this.bldgDesc = bldgDesc;
    }

    public BuildingQuery100GetRequest withBldgDesc(String bldgDesc) {
        this.bldgDesc = bldgDesc;
        return this;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBBLDG_MAXIMUM_CAPACITY
     * 
     */
    @JsonProperty("maximumCapacity")
    public Double getMaximumCapacity() {
        return maximumCapacity;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBBLDG_MAXIMUM_CAPACITY
     * 
     */
    @JsonProperty("maximumCapacity")
    public void setMaximumCapacity(Double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public BuildingQuery100GetRequest withMaximumCapacity(Double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        return this;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SLBBLDG_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("bldgCode")
    public String getBldgCode() {
        return bldgCode;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : SLBBLDG_BLDG_CODE, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("bldgCode")
    public void setBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
    }

    public BuildingQuery100GetRequest withBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
        return this;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBBLDG_CAPACITY
     * 
     */
    @JsonProperty("capacity")
    public Double getCapacity() {
        return capacity;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBBLDG_CAPACITY
     * 
     */
    @JsonProperty("capacity")
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public BuildingQuery100GetRequest withCapacity(Double capacity) {
        this.capacity = capacity;
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

    public BuildingQuery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuildingQuery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("bldgDesc");
        sb.append('=');
        sb.append(((this.bldgDesc == null)?"<null>":this.bldgDesc));
        sb.append(',');
        sb.append("maximumCapacity");
        sb.append('=');
        sb.append(((this.maximumCapacity == null)?"<null>":this.maximumCapacity));
        sb.append(',');
        sb.append("bldgCode");
        sb.append('=');
        sb.append(((this.bldgCode == null)?"<null>":this.bldgCode));
        sb.append(',');
        sb.append("capacity");
        sb.append('=');
        sb.append(((this.capacity == null)?"<null>":this.capacity));
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
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.bldgDesc == null)? 0 :this.bldgDesc.hashCode()));
        result = ((result* 31)+((this.maximumCapacity == null)? 0 :this.maximumCapacity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bldgCode == null)? 0 :this.bldgCode.hashCode()));
        result = ((result* 31)+((this.capacity == null)? 0 :this.capacity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BuildingQuery100GetRequest) == false) {
            return false;
        }
        BuildingQuery100GetRequest rhs = ((BuildingQuery100GetRequest) other);
        return ((((((((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode)))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.bldgDesc == rhs.bldgDesc)||((this.bldgDesc!= null)&&this.bldgDesc.equals(rhs.bldgDesc))))&&((this.maximumCapacity == rhs.maximumCapacity)||((this.maximumCapacity!= null)&&this.maximumCapacity.equals(rhs.maximumCapacity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bldgCode == rhs.bldgCode)||((this.bldgCode!= null)&&this.bldgCode.equals(rhs.bldgCode))))&&((this.capacity == rhs.capacity)||((this.capacity!= null)&&this.capacity.equals(rhs.capacity))));
    }

}
