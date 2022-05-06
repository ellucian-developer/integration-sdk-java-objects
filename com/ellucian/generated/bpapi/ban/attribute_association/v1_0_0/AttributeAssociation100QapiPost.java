
package com.ellucian.generated.bpapi.ban.attribute_association.v1_0_0;

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
    "coas",
    "foapalType",
    "foapalCode",
    "ftrfndaAtttCode",
    "ftrfndaAttvCode"
})
@Generated("jsonschema2pojo")
public class AttributeAssociation100QapiPost {

    @JsonProperty("coas")
    private String coas;
    @JsonProperty("foapalType")
    private String foapalType;
    @JsonProperty("foapalCode")
    private String foapalCode;
    /**
     * Ftrfnda Attt Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftrfndaAtttCode")
    @JsonPropertyDescription("Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv")
    private String ftrfndaAtttCode;
    /**
     * Ftrfnda Attv Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv
     * 
     */
    @JsonProperty("ftrfndaAttvCode")
    @JsonPropertyDescription("Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv")
    private String ftrfndaAttvCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coas")
    public String getCoas() {
        return coas;
    }

    @JsonProperty("coas")
    public void setCoas(String coas) {
        this.coas = coas;
    }

    public AttributeAssociation100QapiPost withCoas(String coas) {
        this.coas = coas;
        return this;
    }

    @JsonProperty("foapalType")
    public String getFoapalType() {
        return foapalType;
    }

    @JsonProperty("foapalType")
    public void setFoapalType(String foapalType) {
        this.foapalType = foapalType;
    }

    public AttributeAssociation100QapiPost withFoapalType(String foapalType) {
        this.foapalType = foapalType;
        return this;
    }

    @JsonProperty("foapalCode")
    public String getFoapalCode() {
        return foapalCode;
    }

    @JsonProperty("foapalCode")
    public void setFoapalCode(String foapalCode) {
        this.foapalCode = foapalCode;
    }

    public AttributeAssociation100QapiPost withFoapalCode(String foapalCode) {
        this.foapalCode = foapalCode;
        return this;
    }

    /**
     * Ftrfnda Attt Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftrfndaAtttCode")
    public String getFtrfndaAtttCode() {
        return ftrfndaAtttCode;
    }

    /**
     * Ftrfnda Attt Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftrfndaAtttCode")
    public void setFtrfndaAtttCode(String ftrfndaAtttCode) {
        this.ftrfndaAtttCode = ftrfndaAtttCode;
    }

    public AttributeAssociation100QapiPost withFtrfndaAtttCode(String ftrfndaAtttCode) {
        this.ftrfndaAtttCode = ftrfndaAtttCode;
        return this;
    }

    /**
     * Ftrfnda Attv Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv
     * 
     */
    @JsonProperty("ftrfndaAttvCode")
    public String getFtrfndaAttvCode() {
        return ftrfndaAttvCode;
    }

    /**
     * Ftrfnda Attv Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv
     * 
     */
    @JsonProperty("ftrfndaAttvCode")
    public void setFtrfndaAttvCode(String ftrfndaAttvCode) {
        this.ftrfndaAttvCode = ftrfndaAttvCode;
    }

    public AttributeAssociation100QapiPost withFtrfndaAttvCode(String ftrfndaAttvCode) {
        this.ftrfndaAttvCode = ftrfndaAttvCode;
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

    public AttributeAssociation100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttributeAssociation100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("foapalType");
        sb.append('=');
        sb.append(((this.foapalType == null)?"<null>":this.foapalType));
        sb.append(',');
        sb.append("foapalCode");
        sb.append('=');
        sb.append(((this.foapalCode == null)?"<null>":this.foapalCode));
        sb.append(',');
        sb.append("ftrfndaAtttCode");
        sb.append('=');
        sb.append(((this.ftrfndaAtttCode == null)?"<null>":this.ftrfndaAtttCode));
        sb.append(',');
        sb.append("ftrfndaAttvCode");
        sb.append('=');
        sb.append(((this.ftrfndaAttvCode == null)?"<null>":this.ftrfndaAttvCode));
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
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.foapalCode == null)? 0 :this.foapalCode.hashCode()));
        result = ((result* 31)+((this.ftrfndaAttvCode == null)? 0 :this.ftrfndaAttvCode.hashCode()));
        result = ((result* 31)+((this.foapalType == null)? 0 :this.foapalType.hashCode()));
        result = ((result* 31)+((this.ftrfndaAtttCode == null)? 0 :this.ftrfndaAtttCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributeAssociation100QapiPost) == false) {
            return false;
        }
        AttributeAssociation100QapiPost rhs = ((AttributeAssociation100QapiPost) other);
        return (((((((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas)))&&((this.foapalCode == rhs.foapalCode)||((this.foapalCode!= null)&&this.foapalCode.equals(rhs.foapalCode))))&&((this.ftrfndaAttvCode == rhs.ftrfndaAttvCode)||((this.ftrfndaAttvCode!= null)&&this.ftrfndaAttvCode.equals(rhs.ftrfndaAttvCode))))&&((this.foapalType == rhs.foapalType)||((this.foapalType!= null)&&this.foapalType.equals(rhs.foapalType))))&&((this.ftrfndaAtttCode == rhs.ftrfndaAtttCode)||((this.ftrfndaAtttCode!= null)&&this.ftrfndaAtttCode.equals(rhs.ftrfndaAtttCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
