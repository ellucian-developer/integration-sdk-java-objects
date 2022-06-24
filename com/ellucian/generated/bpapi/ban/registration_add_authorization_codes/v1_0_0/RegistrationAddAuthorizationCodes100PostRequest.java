
package com.ellucian.generated.bpapi.ban.registration_add_authorization_codes.v1_0_0;

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
    "keyTermCode",
    "keyCrn",
    "generateCodeNumber"
})
@Generated("jsonschema2pojo")
public class RegistrationAddAuthorizationCodes100PostRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : keyTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyTermCode")
    @JsonPropertyDescription("Lineage reference object : keyTermCode, Lookup lineage reference object : stvterm")
    private String keyTermCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : keyCrn
     * 
     */
    @JsonProperty("keyCrn")
    @JsonPropertyDescription("Lineage reference object : keyCrn")
    private String keyCrn;
    /**
     * Number of Random Authorization Codes to Create
     * <p>
     * Lineage reference object : generateCodeNumber
     * 
     */
    @JsonProperty("generateCodeNumber")
    @JsonPropertyDescription("Lineage reference object : generateCodeNumber")
    private Object generateCodeNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : keyTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyTermCode")
    public String getKeyTermCode() {
        return keyTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyTermCode")
    public void setKeyTermCode(String keyTermCode) {
        this.keyTermCode = keyTermCode;
    }

    public RegistrationAddAuthorizationCodes100PostRequest withKeyTermCode(String keyTermCode) {
        this.keyTermCode = keyTermCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : keyCrn
     * 
     */
    @JsonProperty("keyCrn")
    public String getKeyCrn() {
        return keyCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : keyCrn
     * 
     */
    @JsonProperty("keyCrn")
    public void setKeyCrn(String keyCrn) {
        this.keyCrn = keyCrn;
    }

    public RegistrationAddAuthorizationCodes100PostRequest withKeyCrn(String keyCrn) {
        this.keyCrn = keyCrn;
        return this;
    }

    /**
     * Number of Random Authorization Codes to Create
     * <p>
     * Lineage reference object : generateCodeNumber
     * 
     */
    @JsonProperty("generateCodeNumber")
    public Object getGenerateCodeNumber() {
        return generateCodeNumber;
    }

    /**
     * Number of Random Authorization Codes to Create
     * <p>
     * Lineage reference object : generateCodeNumber
     * 
     */
    @JsonProperty("generateCodeNumber")
    public void setGenerateCodeNumber(Object generateCodeNumber) {
        this.generateCodeNumber = generateCodeNumber;
    }

    public RegistrationAddAuthorizationCodes100PostRequest withGenerateCodeNumber(Object generateCodeNumber) {
        this.generateCodeNumber = generateCodeNumber;
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

    public RegistrationAddAuthorizationCodes100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationAddAuthorizationCodes100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyTermCode");
        sb.append('=');
        sb.append(((this.keyTermCode == null)?"<null>":this.keyTermCode));
        sb.append(',');
        sb.append("keyCrn");
        sb.append('=');
        sb.append(((this.keyCrn == null)?"<null>":this.keyCrn));
        sb.append(',');
        sb.append("generateCodeNumber");
        sb.append('=');
        sb.append(((this.generateCodeNumber == null)?"<null>":this.generateCodeNumber));
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
        result = ((result* 31)+((this.keyTermCode == null)? 0 :this.keyTermCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyCrn == null)? 0 :this.keyCrn.hashCode()));
        result = ((result* 31)+((this.generateCodeNumber == null)? 0 :this.generateCodeNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationAddAuthorizationCodes100PostRequest) == false) {
            return false;
        }
        RegistrationAddAuthorizationCodes100PostRequest rhs = ((RegistrationAddAuthorizationCodes100PostRequest) other);
        return (((((this.keyTermCode == rhs.keyTermCode)||((this.keyTermCode!= null)&&this.keyTermCode.equals(rhs.keyTermCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyCrn == rhs.keyCrn)||((this.keyCrn!= null)&&this.keyCrn.equals(rhs.keyCrn))))&&((this.generateCodeNumber == rhs.generateCodeNumber)||((this.generateCodeNumber!= null)&&this.generateCodeNumber.equals(rhs.generateCodeNumber))));
    }

}
