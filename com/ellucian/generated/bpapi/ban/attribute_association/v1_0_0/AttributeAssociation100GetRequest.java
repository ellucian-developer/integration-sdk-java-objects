
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
    "foapalCode",
    "ftrfndaAttvCode",
    "foapalType",
    "ftrfndaAtttCode"
})
@Generated("jsonschema2pojo")
public class AttributeAssociation100GetRequest {

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : coasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    @JsonPropertyDescription("Lineage reference object : coasCode, Lookup lineage reference object : ftvcoas")
    private Object coas;
    /**
     * Lineage reference object : foapalCode
     * 
     */
    @JsonProperty("foapalCode")
    @JsonPropertyDescription("Lineage reference object : foapalCode")
    private Object foapalCode;
    /**
     * Ftrfnda Attv Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv
     * 
     */
    @JsonProperty("ftrfndaAttvCode")
    @JsonPropertyDescription("Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv")
    private String ftrfndaAttvCode;
    /**
     * Lineage reference object : foapalType
     * 
     */
    @JsonProperty("foapalType")
    @JsonPropertyDescription("Lineage reference object : foapalType")
    private Object foapalType;
    /**
     * Ftrfnda Attt Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftrfndaAtttCode")
    @JsonPropertyDescription("Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv")
    private String ftrfndaAtttCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : coasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public Object getCoas() {
        return coas;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : coasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public void setCoas(Object coas) {
        this.coas = coas;
    }

    public AttributeAssociation100GetRequest withCoas(Object coas) {
        this.coas = coas;
        return this;
    }

    /**
     * Lineage reference object : foapalCode
     * 
     */
    @JsonProperty("foapalCode")
    public Object getFoapalCode() {
        return foapalCode;
    }

    /**
     * Lineage reference object : foapalCode
     * 
     */
    @JsonProperty("foapalCode")
    public void setFoapalCode(Object foapalCode) {
        this.foapalCode = foapalCode;
    }

    public AttributeAssociation100GetRequest withFoapalCode(Object foapalCode) {
        this.foapalCode = foapalCode;
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

    public AttributeAssociation100GetRequest withFtrfndaAttvCode(String ftrfndaAttvCode) {
        this.ftrfndaAttvCode = ftrfndaAttvCode;
        return this;
    }

    /**
     * Lineage reference object : foapalType
     * 
     */
    @JsonProperty("foapalType")
    public Object getFoapalType() {
        return foapalType;
    }

    /**
     * Lineage reference object : foapalType
     * 
     */
    @JsonProperty("foapalType")
    public void setFoapalType(Object foapalType) {
        this.foapalType = foapalType;
    }

    public AttributeAssociation100GetRequest withFoapalType(Object foapalType) {
        this.foapalType = foapalType;
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

    public AttributeAssociation100GetRequest withFtrfndaAtttCode(String ftrfndaAtttCode) {
        this.ftrfndaAtttCode = ftrfndaAtttCode;
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

    public AttributeAssociation100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttributeAssociation100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("foapalCode");
        sb.append('=');
        sb.append(((this.foapalCode == null)?"<null>":this.foapalCode));
        sb.append(',');
        sb.append("ftrfndaAttvCode");
        sb.append('=');
        sb.append(((this.ftrfndaAttvCode == null)?"<null>":this.ftrfndaAttvCode));
        sb.append(',');
        sb.append("foapalType");
        sb.append('=');
        sb.append(((this.foapalType == null)?"<null>":this.foapalType));
        sb.append(',');
        sb.append("ftrfndaAtttCode");
        sb.append('=');
        sb.append(((this.ftrfndaAtttCode == null)?"<null>":this.ftrfndaAtttCode));
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
        if ((other instanceof AttributeAssociation100GetRequest) == false) {
            return false;
        }
        AttributeAssociation100GetRequest rhs = ((AttributeAssociation100GetRequest) other);
        return (((((((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas)))&&((this.foapalCode == rhs.foapalCode)||((this.foapalCode!= null)&&this.foapalCode.equals(rhs.foapalCode))))&&((this.ftrfndaAttvCode == rhs.ftrfndaAttvCode)||((this.ftrfndaAttvCode!= null)&&this.ftrfndaAttvCode.equals(rhs.ftrfndaAttvCode))))&&((this.foapalType == rhs.foapalType)||((this.foapalType!= null)&&this.foapalType.equals(rhs.foapalType))))&&((this.ftrfndaAtttCode == rhs.ftrfndaAtttCode)||((this.ftrfndaAtttCode!= null)&&this.ftrfndaAtttCode.equals(rhs.ftrfndaAtttCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
