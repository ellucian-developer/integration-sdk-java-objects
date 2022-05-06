
package com.ellucian.generated.bpapi.ban.identification_additional_identification.v1_0_0;

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
    "additionalId",
    "adidCode",
    "id"
})
@Generated("jsonschema2pojo")
public class IdentificationAdditionalIdentification100PostRequest {

    /**
     * Additional Identification
     * <p>
     * Lineage reference object : GORADID_ADDITIONAL_ID
     * 
     */
    @JsonProperty("additionalId")
    @JsonPropertyDescription("Lineage reference object : GORADID_ADDITIONAL_ID")
    private String additionalId;
    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    @JsonPropertyDescription("Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid")
    private String adidCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Additional Identification
     * <p>
     * Lineage reference object : GORADID_ADDITIONAL_ID
     * 
     */
    @JsonProperty("additionalId")
    public String getAdditionalId() {
        return additionalId;
    }

    /**
     * Additional Identification
     * <p>
     * Lineage reference object : GORADID_ADDITIONAL_ID
     * 
     */
    @JsonProperty("additionalId")
    public void setAdditionalId(String additionalId) {
        this.additionalId = additionalId;
    }

    public IdentificationAdditionalIdentification100PostRequest withAdditionalId(String additionalId) {
        this.additionalId = additionalId;
        return this;
    }

    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    public String getAdidCode() {
        return adidCode;
    }

    /**
     * ID Type
     * <p>
     * Lineage reference object : GORADID_ADID_CODE, Lookup lineage reference object : gtvadid
     * 
     */
    @JsonProperty("adidCode")
    public void setAdidCode(String adidCode) {
        this.adidCode = adidCode;
    }

    public IdentificationAdditionalIdentification100PostRequest withAdidCode(String adidCode) {
        this.adidCode = adidCode;
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

    public IdentificationAdditionalIdentification100PostRequest withId(Object id) {
        this.id = id;
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

    public IdentificationAdditionalIdentification100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdentificationAdditionalIdentification100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("additionalId");
        sb.append('=');
        sb.append(((this.additionalId == null)?"<null>":this.additionalId));
        sb.append(',');
        sb.append("adidCode");
        sb.append('=');
        sb.append(((this.adidCode == null)?"<null>":this.adidCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.additionalId == null)? 0 :this.additionalId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.adidCode == null)? 0 :this.adidCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentificationAdditionalIdentification100PostRequest) == false) {
            return false;
        }
        IdentificationAdditionalIdentification100PostRequest rhs = ((IdentificationAdditionalIdentification100PostRequest) other);
        return (((((this.additionalId == rhs.additionalId)||((this.additionalId!= null)&&this.additionalId.equals(rhs.additionalId)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.adidCode == rhs.adidCode)||((this.adidCode!= null)&&this.adidCode.equals(rhs.adidCode))));
    }

}
