
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
    "displayFrbgrntCode",
    "displayPropCode",
    "locnResearchInd",
    "locnCode"
})
@Generated("jsonschema2pojo")
public class GrantMaintenanceLocation100GetRequest {

    /**
     * Grant
     * <p>
     * Lineage reference object : displayFrbgrntCode
     * 
     */
    @JsonProperty("displayFrbgrntCode")
    @JsonPropertyDescription("Lineage reference object : displayFrbgrntCode")
    private String displayFrbgrntCode;
    /**
     * Proposal
     * <p>
     * Lineage reference object : displayPropCode
     * 
     */
    @JsonProperty("displayPropCode")
    @JsonPropertyDescription("Lineage reference object : displayPropCode")
    private String displayPropCode;
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
     * Grant
     * <p>
     * Lineage reference object : displayFrbgrntCode
     * 
     */
    @JsonProperty("displayFrbgrntCode")
    public String getDisplayFrbgrntCode() {
        return displayFrbgrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayFrbgrntCode
     * 
     */
    @JsonProperty("displayFrbgrntCode")
    public void setDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
    }

    public GrantMaintenanceLocation100GetRequest withDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
        return this;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : displayPropCode
     * 
     */
    @JsonProperty("displayPropCode")
    public String getDisplayPropCode() {
        return displayPropCode;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : displayPropCode
     * 
     */
    @JsonProperty("displayPropCode")
    public void setDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
    }

    public GrantMaintenanceLocation100GetRequest withDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
        return this;
    }

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

    public GrantMaintenanceLocation100GetRequest withLocnResearchInd(String locnResearchInd) {
        this.locnResearchInd = locnResearchInd;
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

    public GrantMaintenanceLocation100GetRequest withLocnCode(String locnCode) {
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

    public GrantMaintenanceLocation100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenanceLocation100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayFrbgrntCode");
        sb.append('=');
        sb.append(((this.displayFrbgrntCode == null)?"<null>":this.displayFrbgrntCode));
        sb.append(',');
        sb.append("displayPropCode");
        sb.append('=');
        sb.append(((this.displayPropCode == null)?"<null>":this.displayPropCode));
        sb.append(',');
        sb.append("locnResearchInd");
        sb.append('=');
        sb.append(((this.locnResearchInd == null)?"<null>":this.locnResearchInd));
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
        result = ((result* 31)+((this.displayFrbgrntCode == null)? 0 :this.displayFrbgrntCode.hashCode()));
        result = ((result* 31)+((this.displayPropCode == null)? 0 :this.displayPropCode.hashCode()));
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
        if ((other instanceof GrantMaintenanceLocation100GetRequest) == false) {
            return false;
        }
        GrantMaintenanceLocation100GetRequest rhs = ((GrantMaintenanceLocation100GetRequest) other);
        return ((((((this.displayFrbgrntCode == rhs.displayFrbgrntCode)||((this.displayFrbgrntCode!= null)&&this.displayFrbgrntCode.equals(rhs.displayFrbgrntCode)))&&((this.displayPropCode == rhs.displayPropCode)||((this.displayPropCode!= null)&&this.displayPropCode.equals(rhs.displayPropCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.locnResearchInd == rhs.locnResearchInd)||((this.locnResearchInd!= null)&&this.locnResearchInd.equals(rhs.locnResearchInd))));
    }

}
