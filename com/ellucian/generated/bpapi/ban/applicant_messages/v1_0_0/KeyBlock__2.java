
package com.ellucian.generated.bpapi.ban.applicant_messages.v1_0_0;

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
    "lastName",
    "id",
    "confidInfo",
    "deceasedInd"
})
@Generated("jsonschema2pojo")
public class KeyBlock__2 {

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
     * Lineage reference object : lastName
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : lastName")
    private Object lastName;
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

    public KeyBlock__2 withKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Lineage reference object : lastName
     * 
     */
    @JsonProperty("lastName")
    public Object getLastName() {
        return lastName;
    }

    /**
     * Lineage reference object : lastName
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public KeyBlock__2 withLastName(Object lastName) {
        this.lastName = lastName;
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

    public KeyBlock__2 withId(Object id) {
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

    public KeyBlock__2 withConfidInfo(Object confidInfo) {
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

    public KeyBlock__2 withDeceasedInd(Object deceasedInd) {
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

    public KeyBlock__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyBlock__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
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
        if ((other instanceof KeyBlock__2) == false) {
            return false;
        }
        KeyBlock__2 rhs = ((KeyBlock__2) other);
        return (((((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.confidInfo == rhs.confidInfo)||((this.confidInfo!= null)&&this.confidInfo.equals(rhs.confidInfo))))&&((this.deceasedInd == rhs.deceasedInd)||((this.deceasedInd!= null)&&this.deceasedInd.equals(rhs.deceasedInd))));
    }

}
