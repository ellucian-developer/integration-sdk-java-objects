
package com.ellucian.generated.bpapi.ban.course_detail_information_corequisites_and_equivalents.v1_0_0;

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
    "screqivTermCodeFrom",
    "screqivTermCodeTo"
})
@Generated("jsonschema2pojo")
public class EqivCtrlBlock {

    /**
     * From Term
     * <p>
     * Lineage reference object : screqivTermCodeFrom
     * 
     */
    @JsonProperty("screqivTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : screqivTermCodeFrom")
    private String screqivTermCodeFrom;
    /**
     * To Term
     * <p>
     * Lineage reference object : screqivTermCodeTo
     * 
     */
    @JsonProperty("screqivTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : screqivTermCodeTo")
    private String screqivTermCodeTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * From Term
     * <p>
     * Lineage reference object : screqivTermCodeFrom
     * 
     */
    @JsonProperty("screqivTermCodeFrom")
    public String getScreqivTermCodeFrom() {
        return screqivTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : screqivTermCodeFrom
     * 
     */
    @JsonProperty("screqivTermCodeFrom")
    public void setScreqivTermCodeFrom(String screqivTermCodeFrom) {
        this.screqivTermCodeFrom = screqivTermCodeFrom;
    }

    public EqivCtrlBlock withScreqivTermCodeFrom(String screqivTermCodeFrom) {
        this.screqivTermCodeFrom = screqivTermCodeFrom;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : screqivTermCodeTo
     * 
     */
    @JsonProperty("screqivTermCodeTo")
    public String getScreqivTermCodeTo() {
        return screqivTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : screqivTermCodeTo
     * 
     */
    @JsonProperty("screqivTermCodeTo")
    public void setScreqivTermCodeTo(String screqivTermCodeTo) {
        this.screqivTermCodeTo = screqivTermCodeTo;
    }

    public EqivCtrlBlock withScreqivTermCodeTo(String screqivTermCodeTo) {
        this.screqivTermCodeTo = screqivTermCodeTo;
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

    public EqivCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EqivCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("screqivTermCodeFrom");
        sb.append('=');
        sb.append(((this.screqivTermCodeFrom == null)?"<null>":this.screqivTermCodeFrom));
        sb.append(',');
        sb.append("screqivTermCodeTo");
        sb.append('=');
        sb.append(((this.screqivTermCodeTo == null)?"<null>":this.screqivTermCodeTo));
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
        result = ((result* 31)+((this.screqivTermCodeFrom == null)? 0 :this.screqivTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.screqivTermCodeTo == null)? 0 :this.screqivTermCodeTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EqivCtrlBlock) == false) {
            return false;
        }
        EqivCtrlBlock rhs = ((EqivCtrlBlock) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.screqivTermCodeFrom == rhs.screqivTermCodeFrom)||((this.screqivTermCodeFrom!= null)&&this.screqivTermCodeFrom.equals(rhs.screqivTermCodeFrom))))&&((this.screqivTermCodeTo == rhs.screqivTermCodeTo)||((this.screqivTermCodeTo!= null)&&this.screqivTermCodeTo.equals(rhs.screqivTermCodeTo))));
    }

}
