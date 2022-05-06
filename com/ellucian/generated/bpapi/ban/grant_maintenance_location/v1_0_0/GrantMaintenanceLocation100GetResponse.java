
package com.ellucian.generated.bpapi.ban.grant_maintenance_location.v1_0_0;

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
    "locnResearchInd",
    "locnTitle",
    "locnCode"
})
@Generated("jsonschema2pojo")
public class GrantMaintenanceLocation100GetResponse {

    /**
     * Research Code
     * <p>
     * Lineage reference object : FRRGLOC_LOCN_RESEARCH_IND
     * (Required)
     * 
     */
    @JsonProperty("locnResearchInd")
    @JsonPropertyDescription("Lineage reference object : FRRGLOC_LOCN_RESEARCH_IND")
    private String locnResearchInd;
    /**
     * Location Title
     * <p>
     * 
     * 
     */
    @JsonProperty("locnTitle")
    private String locnTitle;
    /**
     * Location
     * <p>
     * Lineage reference object : FRRGLOC_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FRRGLOC_LOCN_CODE")
    private String locnCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Research Code
     * <p>
     * Lineage reference object : FRRGLOC_LOCN_RESEARCH_IND
     * (Required)
     * 
     */
    @JsonProperty("locnResearchInd")
    public String getLocnResearchInd() {
        return locnResearchInd;
    }

    /**
     * Research Code
     * <p>
     * Lineage reference object : FRRGLOC_LOCN_RESEARCH_IND
     * (Required)
     * 
     */
    @JsonProperty("locnResearchInd")
    public void setLocnResearchInd(String locnResearchInd) {
        this.locnResearchInd = locnResearchInd;
    }

    public GrantMaintenanceLocation100GetResponse withLocnResearchInd(String locnResearchInd) {
        this.locnResearchInd = locnResearchInd;
        return this;
    }

    /**
     * Location Title
     * <p>
     * 
     * 
     */
    @JsonProperty("locnTitle")
    public String getLocnTitle() {
        return locnTitle;
    }

    /**
     * Location Title
     * <p>
     * 
     * 
     */
    @JsonProperty("locnTitle")
    public void setLocnTitle(String locnTitle) {
        this.locnTitle = locnTitle;
    }

    public GrantMaintenanceLocation100GetResponse withLocnTitle(String locnTitle) {
        this.locnTitle = locnTitle;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FRRGLOC_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FRRGLOC_LOCN_CODE
     * (Required)
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public GrantMaintenanceLocation100GetResponse withLocnCode(String locnCode) {
        this.locnCode = locnCode;
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

    public GrantMaintenanceLocation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenanceLocation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("locnResearchInd");
        sb.append('=');
        sb.append(((this.locnResearchInd == null)?"<null>":this.locnResearchInd));
        sb.append(',');
        sb.append("locnTitle");
        sb.append('=');
        sb.append(((this.locnTitle == null)?"<null>":this.locnTitle));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
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
        result = ((result* 31)+((this.locnTitle == null)? 0 :this.locnTitle.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.locnResearchInd == null)? 0 :this.locnResearchInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantMaintenanceLocation100GetResponse) == false) {
            return false;
        }
        GrantMaintenanceLocation100GetResponse rhs = ((GrantMaintenanceLocation100GetResponse) other);
        return (((((this.locnTitle == rhs.locnTitle)||((this.locnTitle!= null)&&this.locnTitle.equals(rhs.locnTitle)))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.locnResearchInd == rhs.locnResearchInd)||((this.locnResearchInd!= null)&&this.locnResearchInd.equals(rhs.locnResearchInd))));
    }

}
