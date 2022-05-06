
package com.ellucian.generated.bpapi.ban.schedule_details_contract_and_block_schedule_information.v1_0_0;

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
    "sccdDesc",
    "percent",
    "primaryInd",
    "sccdCode"
})
@Generated("jsonschema2pojo")
public class Ssrsccd {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sccdDesc")
    private String sccdDesc;
    /**
     * Percentage
     * <p>
     * Lineage reference object : SSRSCCD_PERCENT
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : SSRSCCD_PERCENT")
    private Double percent;
    /**
     * Lineage reference object : SSRSCCD_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SSRSCCD_PRIMARY_IND")
    private String primaryInd;
    /**
     * Contract
     * <p>
     * Lineage reference object : SSRSCCD_SCCD_CODE, Lookup lineage reference object : stvsccd
     * (Required)
     * 
     */
    @JsonProperty("sccdCode")
    @JsonPropertyDescription("Lineage reference object : SSRSCCD_SCCD_CODE, Lookup lineage reference object : stvsccd")
    private String sccdCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sccdDesc")
    public String getSccdDesc() {
        return sccdDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sccdDesc")
    public void setSccdDesc(String sccdDesc) {
        this.sccdDesc = sccdDesc;
    }

    public Ssrsccd withSccdDesc(String sccdDesc) {
        this.sccdDesc = sccdDesc;
        return this;
    }

    /**
     * Percentage
     * <p>
     * Lineage reference object : SSRSCCD_PERCENT
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percentage
     * <p>
     * Lineage reference object : SSRSCCD_PERCENT
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Ssrsccd withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Lineage reference object : SSRSCCD_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Lineage reference object : SSRSCCD_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public Ssrsccd withPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
        return this;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SSRSCCD_SCCD_CODE, Lookup lineage reference object : stvsccd
     * (Required)
     * 
     */
    @JsonProperty("sccdCode")
    public String getSccdCode() {
        return sccdCode;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SSRSCCD_SCCD_CODE, Lookup lineage reference object : stvsccd
     * (Required)
     * 
     */
    @JsonProperty("sccdCode")
    public void setSccdCode(String sccdCode) {
        this.sccdCode = sccdCode;
    }

    public Ssrsccd withSccdCode(String sccdCode) {
        this.sccdCode = sccdCode;
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

    public Ssrsccd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrsccd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sccdDesc");
        sb.append('=');
        sb.append(((this.sccdDesc == null)?"<null>":this.sccdDesc));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("primaryInd");
        sb.append('=');
        sb.append(((this.primaryInd == null)?"<null>":this.primaryInd));
        sb.append(',');
        sb.append("sccdCode");
        sb.append('=');
        sb.append(((this.sccdCode == null)?"<null>":this.sccdCode));
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
        result = ((result* 31)+((this.sccdDesc == null)? 0 :this.sccdDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        result = ((result* 31)+((this.sccdCode == null)? 0 :this.sccdCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrsccd) == false) {
            return false;
        }
        Ssrsccd rhs = ((Ssrsccd) other);
        return ((((((this.sccdDesc == rhs.sccdDesc)||((this.sccdDesc!= null)&&this.sccdDesc.equals(rhs.sccdDesc)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))))&&((this.sccdCode == rhs.sccdCode)||((this.sccdCode!= null)&&this.sccdCode.equals(rhs.sccdCode))));
    }

}
