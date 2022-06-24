
package com.ellucian.generated.bpapi.ban.general_encumbrance_maintenance.v1_0_0;

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
    "docN"
})
@Generated("jsonschema2pojo")
public class GeneralEncumbranceMaintenance100GetRequest {

    /**
     * Encumbrance Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("docN")
    @JsonPropertyDescription("Lineage reference object : documentNumber")
    private String docN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Encumbrance Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("docN")
    public String getDocN() {
        return docN;
    }

    /**
     * Encumbrance Number
     * <p>
     * Lineage reference object : documentNumber
     * 
     */
    @JsonProperty("docN")
    public void setDocN(String docN) {
        this.docN = docN;
    }

    public GeneralEncumbranceMaintenance100GetRequest withDocN(String docN) {
        this.docN = docN;
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

    public GeneralEncumbranceMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralEncumbranceMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("docN");
        sb.append('=');
        sb.append(((this.docN == null)?"<null>":this.docN));
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
        result = ((result* 31)+((this.docN == null)? 0 :this.docN.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralEncumbranceMaintenance100GetRequest) == false) {
            return false;
        }
        GeneralEncumbranceMaintenance100GetRequest rhs = ((GeneralEncumbranceMaintenance100GetRequest) other);
        return (((this.docN == rhs.docN)||((this.docN!= null)&&this.docN.equals(rhs.docN)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
