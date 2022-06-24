
package com.ellucian.generated.bpapi.ban.address_summary.v1_0_0;

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
    "nname",
    "id",
    "confidInfo",
    "deceasedInd"
})
@Generated("jsonschema2pojo")
public class KeyBlock {

    /**
     * Lineage reference object : nname
     * 
     */
    @JsonProperty("nname")
    @JsonPropertyDescription("Lineage reference object : nname")
    private String nname;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Lineage reference object : confidInfo
     * 
     */
    @JsonProperty("confidInfo")
    @JsonPropertyDescription("Lineage reference object : confidInfo")
    private String confidInfo;
    /**
     * Lineage reference object : deceasedInd
     * 
     */
    @JsonProperty("deceasedInd")
    @JsonPropertyDescription("Lineage reference object : deceasedInd")
    private String deceasedInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : nname
     * 
     */
    @JsonProperty("nname")
    public String getNname() {
        return nname;
    }

    /**
     * Lineage reference object : nname
     * 
     */
    @JsonProperty("nname")
    public void setNname(String nname) {
        this.nname = nname;
    }

    public KeyBlock withNname(String nname) {
        this.nname = nname;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public KeyBlock withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Lineage reference object : confidInfo
     * 
     */
    @JsonProperty("confidInfo")
    public String getConfidInfo() {
        return confidInfo;
    }

    /**
     * Lineage reference object : confidInfo
     * 
     */
    @JsonProperty("confidInfo")
    public void setConfidInfo(String confidInfo) {
        this.confidInfo = confidInfo;
    }

    public KeyBlock withConfidInfo(String confidInfo) {
        this.confidInfo = confidInfo;
        return this;
    }

    /**
     * Lineage reference object : deceasedInd
     * 
     */
    @JsonProperty("deceasedInd")
    public String getDeceasedInd() {
        return deceasedInd;
    }

    /**
     * Lineage reference object : deceasedInd
     * 
     */
    @JsonProperty("deceasedInd")
    public void setDeceasedInd(String deceasedInd) {
        this.deceasedInd = deceasedInd;
    }

    public KeyBlock withDeceasedInd(String deceasedInd) {
        this.deceasedInd = deceasedInd;
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

    public KeyBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nname");
        sb.append('=');
        sb.append(((this.nname == null)?"<null>":this.nname));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("confidInfo");
        sb.append('=');
        sb.append(((this.confidInfo == null)?"<null>":this.confidInfo));
        sb.append(',');
        sb.append("deceasedInd");
        sb.append('=');
        sb.append(((this.deceasedInd == null)?"<null>":this.deceasedInd));
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
        result = ((result* 31)+((this.nname == null)? 0 :this.nname.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.confidInfo == null)? 0 :this.confidInfo.hashCode()));
        result = ((result* 31)+((this.deceasedInd == null)? 0 :this.deceasedInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyBlock) == false) {
            return false;
        }
        KeyBlock rhs = ((KeyBlock) other);
        return ((((((this.nname == rhs.nname)||((this.nname!= null)&&this.nname.equals(rhs.nname)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.confidInfo == rhs.confidInfo)||((this.confidInfo!= null)&&this.confidInfo.equals(rhs.confidInfo))))&&((this.deceasedInd == rhs.deceasedInd)||((this.deceasedInd!= null)&&this.deceasedInd.equals(rhs.deceasedInd))));
    }

}
