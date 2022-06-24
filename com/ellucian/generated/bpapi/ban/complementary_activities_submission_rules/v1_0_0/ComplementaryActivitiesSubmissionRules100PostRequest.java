
package com.ellucian.generated.bpapi.ban.complementary_activities_submission_rules.v1_0_0;

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
    "cadtCode",
    "maxHrs",
    "minHrs",
    "actcCode"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesSubmissionRules100PostRequest {

    /**
     * Lineage reference object : SORCADA_CADT_CODE
     * (Required)
     * 
     */
    @JsonProperty("cadtCode")
    @JsonPropertyDescription("Lineage reference object : SORCADA_CADT_CODE")
    private String cadtCode;
    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_MAX_HRS")
    private Double maxHrs;
    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_MIN_HRS")
    private Double minHrs;
    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_ACTC_CODE")
    private String actcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORCADA_CADT_CODE
     * (Required)
     * 
     */
    @JsonProperty("cadtCode")
    public String getCadtCode() {
        return cadtCode;
    }

    /**
     * Lineage reference object : SORCADA_CADT_CODE
     * (Required)
     * 
     */
    @JsonProperty("cadtCode")
    public void setCadtCode(String cadtCode) {
        this.cadtCode = cadtCode;
    }

    public ComplementaryActivitiesSubmissionRules100PostRequest withCadtCode(String cadtCode) {
        this.cadtCode = cadtCode;
        return this;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    public Double getMaxHrs() {
        return maxHrs;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    public void setMaxHrs(Double maxHrs) {
        this.maxHrs = maxHrs;
    }

    public ComplementaryActivitiesSubmissionRules100PostRequest withMaxHrs(Double maxHrs) {
        this.maxHrs = maxHrs;
        return this;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public Double getMinHrs() {
        return minHrs;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public void setMinHrs(Double minHrs) {
        this.minHrs = minHrs;
    }

    public ComplementaryActivitiesSubmissionRules100PostRequest withMinHrs(Double minHrs) {
        this.minHrs = minHrs;
        return this;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public ComplementaryActivitiesSubmissionRules100PostRequest withActcCode(String actcCode) {
        this.actcCode = actcCode;
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

    public ComplementaryActivitiesSubmissionRules100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesSubmissionRules100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cadtCode");
        sb.append('=');
        sb.append(((this.cadtCode == null)?"<null>":this.cadtCode));
        sb.append(',');
        sb.append("maxHrs");
        sb.append('=');
        sb.append(((this.maxHrs == null)?"<null>":this.maxHrs));
        sb.append(',');
        sb.append("minHrs");
        sb.append('=');
        sb.append(((this.minHrs == null)?"<null>":this.minHrs));
        sb.append(',');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
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
        result = ((result* 31)+((this.cadtCode == null)? 0 :this.cadtCode.hashCode()));
        result = ((result* 31)+((this.maxHrs == null)? 0 :this.maxHrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.minHrs == null)? 0 :this.minHrs.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesSubmissionRules100PostRequest) == false) {
            return false;
        }
        ComplementaryActivitiesSubmissionRules100PostRequest rhs = ((ComplementaryActivitiesSubmissionRules100PostRequest) other);
        return ((((((this.cadtCode == rhs.cadtCode)||((this.cadtCode!= null)&&this.cadtCode.equals(rhs.cadtCode)))&&((this.maxHrs == rhs.maxHrs)||((this.maxHrs!= null)&&this.maxHrs.equals(rhs.maxHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.minHrs == rhs.minHrs)||((this.minHrs!= null)&&this.minHrs.equals(rhs.minHrs))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))));
    }

}
