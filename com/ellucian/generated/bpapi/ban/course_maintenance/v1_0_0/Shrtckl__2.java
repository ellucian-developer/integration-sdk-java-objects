
package com.ellucian.generated.bpapi.ban.course_maintenance.v1_0_0;

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
    "stvlevlDescShrtckl",
    "primaryLevlInd",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class Shrtckl__2 {

    /**
     * Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlevlDescShrtckl")
    private String stvlevlDescShrtckl;
    /**
     * Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND
     * 
     */
    @JsonProperty("primaryLevlInd")
    @JsonPropertyDescription("Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND")
    private String primaryLevlInd;
    /**
     * Code
     * <p>
     * Lineage reference object : SHRTCKL_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKL_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlevlDescShrtckl")
    public String getStvlevlDescShrtckl() {
        return stvlevlDescShrtckl;
    }

    /**
     * Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvlevlDescShrtckl")
    public void setStvlevlDescShrtckl(String stvlevlDescShrtckl) {
        this.stvlevlDescShrtckl = stvlevlDescShrtckl;
    }

    public Shrtckl__2 withStvlevlDescShrtckl(String stvlevlDescShrtckl) {
        this.stvlevlDescShrtckl = stvlevlDescShrtckl;
        return this;
    }

    /**
     * Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND
     * 
     */
    @JsonProperty("primaryLevlInd")
    public String getPrimaryLevlInd() {
        return primaryLevlInd;
    }

    /**
     * Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND
     * 
     */
    @JsonProperty("primaryLevlInd")
    public void setPrimaryLevlInd(String primaryLevlInd) {
        this.primaryLevlInd = primaryLevlInd;
    }

    public Shrtckl__2 withPrimaryLevlInd(String primaryLevlInd) {
        this.primaryLevlInd = primaryLevlInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRTCKL_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRTCKL_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public Shrtckl__2 withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public Shrtckl__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrtckl__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvlevlDescShrtckl");
        sb.append('=');
        sb.append(((this.stvlevlDescShrtckl == null)?"<null>":this.stvlevlDescShrtckl));
        sb.append(',');
        sb.append("primaryLevlInd");
        sb.append('=');
        sb.append(((this.primaryLevlInd == null)?"<null>":this.primaryLevlInd));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.stvlevlDescShrtckl == null)? 0 :this.stvlevlDescShrtckl.hashCode()));
        result = ((result* 31)+((this.primaryLevlInd == null)? 0 :this.primaryLevlInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrtckl__2) == false) {
            return false;
        }
        Shrtckl__2 rhs = ((Shrtckl__2) other);
        return (((((this.stvlevlDescShrtckl == rhs.stvlevlDescShrtckl)||((this.stvlevlDescShrtckl!= null)&&this.stvlevlDescShrtckl.equals(rhs.stvlevlDescShrtckl)))&&((this.primaryLevlInd == rhs.primaryLevlInd)||((this.primaryLevlInd!= null)&&this.primaryLevlInd.equals(rhs.primaryLevlInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
