
package com.ellucian.generated.bpapi.ban.general_information_prior_college.v1_0_0;

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
    "minrDesc",
    "majrCodeMinor"
})
@Generated("jsonschema2pojo")
public class Sorminr {

    @JsonProperty("minrDesc")
    private String minrDesc;
    /**
     * Minor
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMinor")
    @JsonPropertyDescription("Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr")
    private String majrCodeMinor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("minrDesc")
    public String getMinrDesc() {
        return minrDesc;
    }

    @JsonProperty("minrDesc")
    public void setMinrDesc(String minrDesc) {
        this.minrDesc = minrDesc;
    }

    public Sorminr withMinrDesc(String minrDesc) {
        this.minrDesc = minrDesc;
        return this;
    }

    /**
     * Minor
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMinor")
    public String getMajrCodeMinor() {
        return majrCodeMinor;
    }

    /**
     * Minor
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMinor")
    public void setMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
    }

    public Sorminr withMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
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

    public Sorminr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorminr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("minrDesc");
        sb.append('=');
        sb.append(((this.minrDesc == null)?"<null>":this.minrDesc));
        sb.append(',');
        sb.append("majrCodeMinor");
        sb.append('=');
        sb.append(((this.majrCodeMinor == null)?"<null>":this.majrCodeMinor));
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
        result = ((result* 31)+((this.minrDesc == null)? 0 :this.minrDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.majrCodeMinor == null)? 0 :this.majrCodeMinor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorminr) == false) {
            return false;
        }
        Sorminr rhs = ((Sorminr) other);
        return ((((this.minrDesc == rhs.minrDesc)||((this.minrDesc!= null)&&this.minrDesc.equals(rhs.minrDesc)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.majrCodeMinor == rhs.majrCodeMinor)||((this.majrCodeMinor!= null)&&this.majrCodeMinor.equals(rhs.majrCodeMinor))));
    }

}
