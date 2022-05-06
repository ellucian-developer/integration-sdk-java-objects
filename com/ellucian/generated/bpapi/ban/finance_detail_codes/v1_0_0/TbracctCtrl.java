
package com.ellucian.generated.bpapi.ban.finance_detail_codes.v1_0_0;

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
    "holdPercent",
    "holdPercent4",
    "holdPercent2",
    "holdPercent3"
})
@Generated("jsonschema2pojo")
public class TbracctCtrl {

    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent
     * 
     */
    @JsonProperty("holdPercent")
    @JsonPropertyDescription("Lineage reference object : holdPercent")
    private Object holdPercent;
    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent4
     * 
     */
    @JsonProperty("holdPercent4")
    @JsonPropertyDescription("Lineage reference object : holdPercent4")
    private Object holdPercent4;
    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent2
     * 
     */
    @JsonProperty("holdPercent2")
    @JsonPropertyDescription("Lineage reference object : holdPercent2")
    private Object holdPercent2;
    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent3
     * 
     */
    @JsonProperty("holdPercent3")
    @JsonPropertyDescription("Lineage reference object : holdPercent3")
    private Object holdPercent3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent
     * 
     */
    @JsonProperty("holdPercent")
    public Object getHoldPercent() {
        return holdPercent;
    }

    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent
     * 
     */
    @JsonProperty("holdPercent")
    public void setHoldPercent(Object holdPercent) {
        this.holdPercent = holdPercent;
    }

    public TbracctCtrl withHoldPercent(Object holdPercent) {
        this.holdPercent = holdPercent;
        return this;
    }

    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent4
     * 
     */
    @JsonProperty("holdPercent4")
    public Object getHoldPercent4() {
        return holdPercent4;
    }

    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent4
     * 
     */
    @JsonProperty("holdPercent4")
    public void setHoldPercent4(Object holdPercent4) {
        this.holdPercent4 = holdPercent4;
    }

    public TbracctCtrl withHoldPercent4(Object holdPercent4) {
        this.holdPercent4 = holdPercent4;
        return this;
    }

    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent2
     * 
     */
    @JsonProperty("holdPercent2")
    public Object getHoldPercent2() {
        return holdPercent2;
    }

    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent2
     * 
     */
    @JsonProperty("holdPercent2")
    public void setHoldPercent2(Object holdPercent2) {
        this.holdPercent2 = holdPercent2;
    }

    public TbracctCtrl withHoldPercent2(Object holdPercent2) {
        this.holdPercent2 = holdPercent2;
        return this;
    }

    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent3
     * 
     */
    @JsonProperty("holdPercent3")
    public Object getHoldPercent3() {
        return holdPercent3;
    }

    /**
     * Total Percent
     * <p>
     * Lineage reference object : holdPercent3
     * 
     */
    @JsonProperty("holdPercent3")
    public void setHoldPercent3(Object holdPercent3) {
        this.holdPercent3 = holdPercent3;
    }

    public TbracctCtrl withHoldPercent3(Object holdPercent3) {
        this.holdPercent3 = holdPercent3;
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

    public TbracctCtrl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TbracctCtrl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("holdPercent");
        sb.append('=');
        sb.append(((this.holdPercent == null)?"<null>":this.holdPercent));
        sb.append(',');
        sb.append("holdPercent4");
        sb.append('=');
        sb.append(((this.holdPercent4 == null)?"<null>":this.holdPercent4));
        sb.append(',');
        sb.append("holdPercent2");
        sb.append('=');
        sb.append(((this.holdPercent2 == null)?"<null>":this.holdPercent2));
        sb.append(',');
        sb.append("holdPercent3");
        sb.append('=');
        sb.append(((this.holdPercent3 == null)?"<null>":this.holdPercent3));
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
        result = ((result* 31)+((this.holdPercent == null)? 0 :this.holdPercent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.holdPercent4 == null)? 0 :this.holdPercent4 .hashCode()));
        result = ((result* 31)+((this.holdPercent2 == null)? 0 :this.holdPercent2 .hashCode()));
        result = ((result* 31)+((this.holdPercent3 == null)? 0 :this.holdPercent3 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TbracctCtrl) == false) {
            return false;
        }
        TbracctCtrl rhs = ((TbracctCtrl) other);
        return ((((((this.holdPercent == rhs.holdPercent)||((this.holdPercent!= null)&&this.holdPercent.equals(rhs.holdPercent)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.holdPercent4 == rhs.holdPercent4)||((this.holdPercent4 != null)&&this.holdPercent4 .equals(rhs.holdPercent4))))&&((this.holdPercent2 == rhs.holdPercent2)||((this.holdPercent2 != null)&&this.holdPercent2 .equals(rhs.holdPercent2))))&&((this.holdPercent3 == rhs.holdPercent3)||((this.holdPercent3 != null)&&this.holdPercent3 .equals(rhs.holdPercent3))));
    }

}
