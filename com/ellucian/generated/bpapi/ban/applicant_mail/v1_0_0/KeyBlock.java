
package com.ellucian.generated.bpapi.ban.applicant_mail.v1_0_0;

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
    "keyblckAidyCode",
    "displayMessage",
    "statAwdLtrInd",
    "rwname",
    "id",
    "confidInfo",
    "deceasedInd"
})
@Generated("jsonschema2pojo")
public class KeyBlock {

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private Object keyblckAidyCode;
    /**
     * Lineage reference object : displayMessage
     * 
     */
    @JsonProperty("displayMessage")
    @JsonPropertyDescription("Lineage reference object : displayMessage")
    private Object displayMessage;
    /**
     * Award Letter
     * <p>
     * Lineage reference object : statAwdLtrInd
     * 
     */
    @JsonProperty("statAwdLtrInd")
    @JsonPropertyDescription("Lineage reference object : statAwdLtrInd")
    private Object statAwdLtrInd;
    /**
     * Lineage reference object : rwname
     * 
     */
    @JsonProperty("rwname")
    @JsonPropertyDescription("Lineage reference object : rwname")
    private Object rwname;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Lineage reference object : confidInfo
     * 
     */
    @JsonProperty("confidInfo")
    @JsonPropertyDescription("Lineage reference object : confidInfo")
    private Object confidInfo;
    /**
     * Lineage reference object : deceasedInd
     * 
     */
    @JsonProperty("deceasedInd")
    @JsonPropertyDescription("Lineage reference object : deceasedInd")
    private Object deceasedInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public Object getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public KeyBlock withKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Lineage reference object : displayMessage
     * 
     */
    @JsonProperty("displayMessage")
    public Object getDisplayMessage() {
        return displayMessage;
    }

    /**
     * Lineage reference object : displayMessage
     * 
     */
    @JsonProperty("displayMessage")
    public void setDisplayMessage(Object displayMessage) {
        this.displayMessage = displayMessage;
    }

    public KeyBlock withDisplayMessage(Object displayMessage) {
        this.displayMessage = displayMessage;
        return this;
    }

    /**
     * Award Letter
     * <p>
     * Lineage reference object : statAwdLtrInd
     * 
     */
    @JsonProperty("statAwdLtrInd")
    public Object getStatAwdLtrInd() {
        return statAwdLtrInd;
    }

    /**
     * Award Letter
     * <p>
     * Lineage reference object : statAwdLtrInd
     * 
     */
    @JsonProperty("statAwdLtrInd")
    public void setStatAwdLtrInd(Object statAwdLtrInd) {
        this.statAwdLtrInd = statAwdLtrInd;
    }

    public KeyBlock withStatAwdLtrInd(Object statAwdLtrInd) {
        this.statAwdLtrInd = statAwdLtrInd;
        return this;
    }

    /**
     * Lineage reference object : rwname
     * 
     */
    @JsonProperty("rwname")
    public Object getRwname() {
        return rwname;
    }

    /**
     * Lineage reference object : rwname
     * 
     */
    @JsonProperty("rwname")
    public void setRwname(Object rwname) {
        this.rwname = rwname;
    }

    public KeyBlock withRwname(Object rwname) {
        this.rwname = rwname;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public KeyBlock withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Lineage reference object : confidInfo
     * 
     */
    @JsonProperty("confidInfo")
    public Object getConfidInfo() {
        return confidInfo;
    }

    /**
     * Lineage reference object : confidInfo
     * 
     */
    @JsonProperty("confidInfo")
    public void setConfidInfo(Object confidInfo) {
        this.confidInfo = confidInfo;
    }

    public KeyBlock withConfidInfo(Object confidInfo) {
        this.confidInfo = confidInfo;
        return this;
    }

    /**
     * Lineage reference object : deceasedInd
     * 
     */
    @JsonProperty("deceasedInd")
    public Object getDeceasedInd() {
        return deceasedInd;
    }

    /**
     * Lineage reference object : deceasedInd
     * 
     */
    @JsonProperty("deceasedInd")
    public void setDeceasedInd(Object deceasedInd) {
        this.deceasedInd = deceasedInd;
    }

    public KeyBlock withDeceasedInd(Object deceasedInd) {
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
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("displayMessage");
        sb.append('=');
        sb.append(((this.displayMessage == null)?"<null>":this.displayMessage));
        sb.append(',');
        sb.append("statAwdLtrInd");
        sb.append('=');
        sb.append(((this.statAwdLtrInd == null)?"<null>":this.statAwdLtrInd));
        sb.append(',');
        sb.append("rwname");
        sb.append('=');
        sb.append(((this.rwname == null)?"<null>":this.rwname));
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
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.displayMessage == null)? 0 :this.displayMessage.hashCode()));
        result = ((result* 31)+((this.statAwdLtrInd == null)? 0 :this.statAwdLtrInd.hashCode()));
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
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
        return (((((((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.displayMessage == rhs.displayMessage)||((this.displayMessage!= null)&&this.displayMessage.equals(rhs.displayMessage))))&&((this.statAwdLtrInd == rhs.statAwdLtrInd)||((this.statAwdLtrInd!= null)&&this.statAwdLtrInd.equals(rhs.statAwdLtrInd))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.confidInfo == rhs.confidInfo)||((this.confidInfo!= null)&&this.confidInfo.equals(rhs.confidInfo))))&&((this.deceasedInd == rhs.deceasedInd)||((this.deceasedInd!= null)&&this.deceasedInd.equals(rhs.deceasedInd))));
    }

}
