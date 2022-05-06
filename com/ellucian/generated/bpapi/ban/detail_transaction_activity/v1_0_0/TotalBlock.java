
package com.ellucian.generated.bpapi.ban.detail_transaction_activity.v1_0_0;

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
    "dispTotalAmt",
    "totalDrCrInd"
})
@Generated("jsonschema2pojo")
public class TotalBlock {

    /**
     * Total
     * <p>
     * Lineage reference object : dispTotalAmt
     * 
     */
    @JsonProperty("dispTotalAmt")
    @JsonPropertyDescription("Lineage reference object : dispTotalAmt")
    private Object dispTotalAmt;
    /**
     * Lineage reference object : totalDrCrInd
     * 
     */
    @JsonProperty("totalDrCrInd")
    @JsonPropertyDescription("Lineage reference object : totalDrCrInd")
    private Object totalDrCrInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Total
     * <p>
     * Lineage reference object : dispTotalAmt
     * 
     */
    @JsonProperty("dispTotalAmt")
    public Object getDispTotalAmt() {
        return dispTotalAmt;
    }

    /**
     * Total
     * <p>
     * Lineage reference object : dispTotalAmt
     * 
     */
    @JsonProperty("dispTotalAmt")
    public void setDispTotalAmt(Object dispTotalAmt) {
        this.dispTotalAmt = dispTotalAmt;
    }

    public TotalBlock withDispTotalAmt(Object dispTotalAmt) {
        this.dispTotalAmt = dispTotalAmt;
        return this;
    }

    /**
     * Lineage reference object : totalDrCrInd
     * 
     */
    @JsonProperty("totalDrCrInd")
    public Object getTotalDrCrInd() {
        return totalDrCrInd;
    }

    /**
     * Lineage reference object : totalDrCrInd
     * 
     */
    @JsonProperty("totalDrCrInd")
    public void setTotalDrCrInd(Object totalDrCrInd) {
        this.totalDrCrInd = totalDrCrInd;
    }

    public TotalBlock withTotalDrCrInd(Object totalDrCrInd) {
        this.totalDrCrInd = totalDrCrInd;
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

    public TotalBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TotalBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dispTotalAmt");
        sb.append('=');
        sb.append(((this.dispTotalAmt == null)?"<null>":this.dispTotalAmt));
        sb.append(',');
        sb.append("totalDrCrInd");
        sb.append('=');
        sb.append(((this.totalDrCrInd == null)?"<null>":this.totalDrCrInd));
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
        result = ((result* 31)+((this.dispTotalAmt == null)? 0 :this.dispTotalAmt.hashCode()));
        result = ((result* 31)+((this.totalDrCrInd == null)? 0 :this.totalDrCrInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalBlock) == false) {
            return false;
        }
        TotalBlock rhs = ((TotalBlock) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.dispTotalAmt == rhs.dispTotalAmt)||((this.dispTotalAmt!= null)&&this.dispTotalAmt.equals(rhs.dispTotalAmt))))&&((this.totalDrCrInd == rhs.totalDrCrInd)||((this.totalDrCrInd!= null)&&this.totalDrCrInd.equals(rhs.totalDrCrInd))));
    }

}
