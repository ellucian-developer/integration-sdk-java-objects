
package com.ellucian.generated.bpapi.ban.course_detail_information_supplemental_data.v1_0_0;

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
    "scbsuppTermCodeTo",
    "scbsuppTermCodeFrom"
})
@Generated("jsonschema2pojo")
public class SuppCtrlBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scbsuppTermCodeTo
     * 
     */
    @JsonProperty("scbsuppTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scbsuppTermCodeTo")
    private String scbsuppTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : scbsuppTermCodeFrom
     * 
     */
    @JsonProperty("scbsuppTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scbsuppTermCodeFrom")
    private String scbsuppTermCodeFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scbsuppTermCodeTo
     * 
     */
    @JsonProperty("scbsuppTermCodeTo")
    public String getScbsuppTermCodeTo() {
        return scbsuppTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scbsuppTermCodeTo
     * 
     */
    @JsonProperty("scbsuppTermCodeTo")
    public void setScbsuppTermCodeTo(String scbsuppTermCodeTo) {
        this.scbsuppTermCodeTo = scbsuppTermCodeTo;
    }

    public SuppCtrlBlock withScbsuppTermCodeTo(String scbsuppTermCodeTo) {
        this.scbsuppTermCodeTo = scbsuppTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scbsuppTermCodeFrom
     * 
     */
    @JsonProperty("scbsuppTermCodeFrom")
    public String getScbsuppTermCodeFrom() {
        return scbsuppTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scbsuppTermCodeFrom
     * 
     */
    @JsonProperty("scbsuppTermCodeFrom")
    public void setScbsuppTermCodeFrom(String scbsuppTermCodeFrom) {
        this.scbsuppTermCodeFrom = scbsuppTermCodeFrom;
    }

    public SuppCtrlBlock withScbsuppTermCodeFrom(String scbsuppTermCodeFrom) {
        this.scbsuppTermCodeFrom = scbsuppTermCodeFrom;
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

    public SuppCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SuppCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scbsuppTermCodeTo");
        sb.append('=');
        sb.append(((this.scbsuppTermCodeTo == null)?"<null>":this.scbsuppTermCodeTo));
        sb.append(',');
        sb.append("scbsuppTermCodeFrom");
        sb.append('=');
        sb.append(((this.scbsuppTermCodeFrom == null)?"<null>":this.scbsuppTermCodeFrom));
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
        result = ((result* 31)+((this.scbsuppTermCodeTo == null)? 0 :this.scbsuppTermCodeTo.hashCode()));
        result = ((result* 31)+((this.scbsuppTermCodeFrom == null)? 0 :this.scbsuppTermCodeFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SuppCtrlBlock) == false) {
            return false;
        }
        SuppCtrlBlock rhs = ((SuppCtrlBlock) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.scbsuppTermCodeTo == rhs.scbsuppTermCodeTo)||((this.scbsuppTermCodeTo!= null)&&this.scbsuppTermCodeTo.equals(rhs.scbsuppTermCodeTo))))&&((this.scbsuppTermCodeFrom == rhs.scbsuppTermCodeFrom)||((this.scbsuppTermCodeFrom!= null)&&this.scbsuppTermCodeFrom.equals(rhs.scbsuppTermCodeFrom))));
    }

}
