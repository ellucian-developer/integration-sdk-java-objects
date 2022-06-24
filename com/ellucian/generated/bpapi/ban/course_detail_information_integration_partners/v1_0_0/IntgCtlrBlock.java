
package com.ellucian.generated.bpapi.ban.course_detail_information_integration_partners.v1_0_0;

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
    "scrintgTermCodeTo",
    "scrintgTermCodeFrom"
})
@Generated("jsonschema2pojo")
public class IntgCtlrBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scrintgTermCodeTo
     * 
     */
    @JsonProperty("scrintgTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrintgTermCodeTo")
    private String scrintgTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrintgTermCodeFrom
     * 
     */
    @JsonProperty("scrintgTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrintgTermCodeFrom")
    private String scrintgTermCodeFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scrintgTermCodeTo
     * 
     */
    @JsonProperty("scrintgTermCodeTo")
    public String getScrintgTermCodeTo() {
        return scrintgTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrintgTermCodeTo
     * 
     */
    @JsonProperty("scrintgTermCodeTo")
    public void setScrintgTermCodeTo(String scrintgTermCodeTo) {
        this.scrintgTermCodeTo = scrintgTermCodeTo;
    }

    public IntgCtlrBlock withScrintgTermCodeTo(String scrintgTermCodeTo) {
        this.scrintgTermCodeTo = scrintgTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrintgTermCodeFrom
     * 
     */
    @JsonProperty("scrintgTermCodeFrom")
    public String getScrintgTermCodeFrom() {
        return scrintgTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrintgTermCodeFrom
     * 
     */
    @JsonProperty("scrintgTermCodeFrom")
    public void setScrintgTermCodeFrom(String scrintgTermCodeFrom) {
        this.scrintgTermCodeFrom = scrintgTermCodeFrom;
    }

    public IntgCtlrBlock withScrintgTermCodeFrom(String scrintgTermCodeFrom) {
        this.scrintgTermCodeFrom = scrintgTermCodeFrom;
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

    public IntgCtlrBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IntgCtlrBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrintgTermCodeTo");
        sb.append('=');
        sb.append(((this.scrintgTermCodeTo == null)?"<null>":this.scrintgTermCodeTo));
        sb.append(',');
        sb.append("scrintgTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrintgTermCodeFrom == null)?"<null>":this.scrintgTermCodeFrom));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrintgTermCodeTo == null)? 0 :this.scrintgTermCodeTo.hashCode()));
        result = ((result* 31)+((this.scrintgTermCodeFrom == null)? 0 :this.scrintgTermCodeFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IntgCtlrBlock) == false) {
            return false;
        }
        IntgCtlrBlock rhs = ((IntgCtlrBlock) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.scrintgTermCodeTo == rhs.scrintgTermCodeTo)||((this.scrintgTermCodeTo!= null)&&this.scrintgTermCodeTo.equals(rhs.scrintgTermCodeTo))))&&((this.scrintgTermCodeFrom == rhs.scrintgTermCodeFrom)||((this.scrintgTermCodeFrom!= null)&&this.scrintgTermCodeFrom.equals(rhs.scrintgTermCodeFrom))));
    }

}
