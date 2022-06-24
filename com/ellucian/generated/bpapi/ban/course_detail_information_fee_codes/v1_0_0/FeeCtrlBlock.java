
package com.ellucian.generated.bpapi.ban.course_detail_information_fee_codes.v1_0_0;

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
    "scrfeesTermCodeTo",
    "scrfeesTermCodeFrom"
})
@Generated("jsonschema2pojo")
public class FeeCtrlBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scrfeesTermCodeTo
     * 
     */
    @JsonProperty("scrfeesTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrfeesTermCodeTo")
    private String scrfeesTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrfeesTermCodeFrom
     * 
     */
    @JsonProperty("scrfeesTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrfeesTermCodeFrom")
    private String scrfeesTermCodeFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scrfeesTermCodeTo
     * 
     */
    @JsonProperty("scrfeesTermCodeTo")
    public String getScrfeesTermCodeTo() {
        return scrfeesTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrfeesTermCodeTo
     * 
     */
    @JsonProperty("scrfeesTermCodeTo")
    public void setScrfeesTermCodeTo(String scrfeesTermCodeTo) {
        this.scrfeesTermCodeTo = scrfeesTermCodeTo;
    }

    public FeeCtrlBlock withScrfeesTermCodeTo(String scrfeesTermCodeTo) {
        this.scrfeesTermCodeTo = scrfeesTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrfeesTermCodeFrom
     * 
     */
    @JsonProperty("scrfeesTermCodeFrom")
    public String getScrfeesTermCodeFrom() {
        return scrfeesTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrfeesTermCodeFrom
     * 
     */
    @JsonProperty("scrfeesTermCodeFrom")
    public void setScrfeesTermCodeFrom(String scrfeesTermCodeFrom) {
        this.scrfeesTermCodeFrom = scrfeesTermCodeFrom;
    }

    public FeeCtrlBlock withScrfeesTermCodeFrom(String scrfeesTermCodeFrom) {
        this.scrfeesTermCodeFrom = scrfeesTermCodeFrom;
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

    public FeeCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FeeCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrfeesTermCodeTo");
        sb.append('=');
        sb.append(((this.scrfeesTermCodeTo == null)?"<null>":this.scrfeesTermCodeTo));
        sb.append(',');
        sb.append("scrfeesTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrfeesTermCodeFrom == null)?"<null>":this.scrfeesTermCodeFrom));
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
        result = ((result* 31)+((this.scrfeesTermCodeFrom == null)? 0 :this.scrfeesTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrfeesTermCodeTo == null)? 0 :this.scrfeesTermCodeTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeeCtrlBlock) == false) {
            return false;
        }
        FeeCtrlBlock rhs = ((FeeCtrlBlock) other);
        return ((((this.scrfeesTermCodeFrom == rhs.scrfeesTermCodeFrom)||((this.scrfeesTermCodeFrom!= null)&&this.scrfeesTermCodeFrom.equals(rhs.scrfeesTermCodeFrom)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrfeesTermCodeTo == rhs.scrfeesTermCodeTo)||((this.scrfeesTermCodeTo!= null)&&this.scrfeesTermCodeTo.equals(rhs.scrfeesTermCodeTo))));
    }

}
