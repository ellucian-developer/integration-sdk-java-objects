
package com.ellucian.generated.bpapi.ban.general_ledger_trial_balance.v1_0_0;

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
    "totalTitle",
    "displayTotCurrDrCr",
    "holdCurrTot",
    "begTotDrCrDesc",
    "holdBegTot",
    "curTotDrCrDesc",
    "displayTotBegDrCr"
})
@Generated("jsonschema2pojo")
public class Fgvtbl1BlockTot {

    /**
     * Total
     * <p>
     * Lineage reference object : totalTitle
     * 
     */
    @JsonProperty("totalTitle")
    @JsonPropertyDescription("Lineage reference object : totalTitle")
    private Object totalTitle;
    /**
     * Lineage reference object : displayTotCurrDrCr
     * 
     */
    @JsonProperty("displayTotCurrDrCr")
    @JsonPropertyDescription("Lineage reference object : displayTotCurrDrCr")
    private Object displayTotCurrDrCr;
    /**
     * Lineage reference object : holdCurrTot
     * 
     */
    @JsonProperty("holdCurrTot")
    @JsonPropertyDescription("Lineage reference object : holdCurrTot")
    private Object holdCurrTot;
    /**
     * Lineage reference object : begTotDrCrDesc
     * 
     */
    @JsonProperty("begTotDrCrDesc")
    @JsonPropertyDescription("Lineage reference object : begTotDrCrDesc")
    private Object begTotDrCrDesc;
    /**
     * Lineage reference object : holdBegTot
     * 
     */
    @JsonProperty("holdBegTot")
    @JsonPropertyDescription("Lineage reference object : holdBegTot")
    private Object holdBegTot;
    /**
     * Lineage reference object : curTotDrCrDesc
     * 
     */
    @JsonProperty("curTotDrCrDesc")
    @JsonPropertyDescription("Lineage reference object : curTotDrCrDesc")
    private Object curTotDrCrDesc;
    /**
     * Lineage reference object : displayTotBegDrCr
     * 
     */
    @JsonProperty("displayTotBegDrCr")
    @JsonPropertyDescription("Lineage reference object : displayTotBegDrCr")
    private Object displayTotBegDrCr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Total
     * <p>
     * Lineage reference object : totalTitle
     * 
     */
    @JsonProperty("totalTitle")
    public Object getTotalTitle() {
        return totalTitle;
    }

    /**
     * Total
     * <p>
     * Lineage reference object : totalTitle
     * 
     */
    @JsonProperty("totalTitle")
    public void setTotalTitle(Object totalTitle) {
        this.totalTitle = totalTitle;
    }

    public Fgvtbl1BlockTot withTotalTitle(Object totalTitle) {
        this.totalTitle = totalTitle;
        return this;
    }

    /**
     * Lineage reference object : displayTotCurrDrCr
     * 
     */
    @JsonProperty("displayTotCurrDrCr")
    public Object getDisplayTotCurrDrCr() {
        return displayTotCurrDrCr;
    }

    /**
     * Lineage reference object : displayTotCurrDrCr
     * 
     */
    @JsonProperty("displayTotCurrDrCr")
    public void setDisplayTotCurrDrCr(Object displayTotCurrDrCr) {
        this.displayTotCurrDrCr = displayTotCurrDrCr;
    }

    public Fgvtbl1BlockTot withDisplayTotCurrDrCr(Object displayTotCurrDrCr) {
        this.displayTotCurrDrCr = displayTotCurrDrCr;
        return this;
    }

    /**
     * Lineage reference object : holdCurrTot
     * 
     */
    @JsonProperty("holdCurrTot")
    public Object getHoldCurrTot() {
        return holdCurrTot;
    }

    /**
     * Lineage reference object : holdCurrTot
     * 
     */
    @JsonProperty("holdCurrTot")
    public void setHoldCurrTot(Object holdCurrTot) {
        this.holdCurrTot = holdCurrTot;
    }

    public Fgvtbl1BlockTot withHoldCurrTot(Object holdCurrTot) {
        this.holdCurrTot = holdCurrTot;
        return this;
    }

    /**
     * Lineage reference object : begTotDrCrDesc
     * 
     */
    @JsonProperty("begTotDrCrDesc")
    public Object getBegTotDrCrDesc() {
        return begTotDrCrDesc;
    }

    /**
     * Lineage reference object : begTotDrCrDesc
     * 
     */
    @JsonProperty("begTotDrCrDesc")
    public void setBegTotDrCrDesc(Object begTotDrCrDesc) {
        this.begTotDrCrDesc = begTotDrCrDesc;
    }

    public Fgvtbl1BlockTot withBegTotDrCrDesc(Object begTotDrCrDesc) {
        this.begTotDrCrDesc = begTotDrCrDesc;
        return this;
    }

    /**
     * Lineage reference object : holdBegTot
     * 
     */
    @JsonProperty("holdBegTot")
    public Object getHoldBegTot() {
        return holdBegTot;
    }

    /**
     * Lineage reference object : holdBegTot
     * 
     */
    @JsonProperty("holdBegTot")
    public void setHoldBegTot(Object holdBegTot) {
        this.holdBegTot = holdBegTot;
    }

    public Fgvtbl1BlockTot withHoldBegTot(Object holdBegTot) {
        this.holdBegTot = holdBegTot;
        return this;
    }

    /**
     * Lineage reference object : curTotDrCrDesc
     * 
     */
    @JsonProperty("curTotDrCrDesc")
    public Object getCurTotDrCrDesc() {
        return curTotDrCrDesc;
    }

    /**
     * Lineage reference object : curTotDrCrDesc
     * 
     */
    @JsonProperty("curTotDrCrDesc")
    public void setCurTotDrCrDesc(Object curTotDrCrDesc) {
        this.curTotDrCrDesc = curTotDrCrDesc;
    }

    public Fgvtbl1BlockTot withCurTotDrCrDesc(Object curTotDrCrDesc) {
        this.curTotDrCrDesc = curTotDrCrDesc;
        return this;
    }

    /**
     * Lineage reference object : displayTotBegDrCr
     * 
     */
    @JsonProperty("displayTotBegDrCr")
    public Object getDisplayTotBegDrCr() {
        return displayTotBegDrCr;
    }

    /**
     * Lineage reference object : displayTotBegDrCr
     * 
     */
    @JsonProperty("displayTotBegDrCr")
    public void setDisplayTotBegDrCr(Object displayTotBegDrCr) {
        this.displayTotBegDrCr = displayTotBegDrCr;
    }

    public Fgvtbl1BlockTot withDisplayTotBegDrCr(Object displayTotBegDrCr) {
        this.displayTotBegDrCr = displayTotBegDrCr;
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

    public Fgvtbl1BlockTot withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgvtbl1BlockTot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalTitle");
        sb.append('=');
        sb.append(((this.totalTitle == null)?"<null>":this.totalTitle));
        sb.append(',');
        sb.append("displayTotCurrDrCr");
        sb.append('=');
        sb.append(((this.displayTotCurrDrCr == null)?"<null>":this.displayTotCurrDrCr));
        sb.append(',');
        sb.append("holdCurrTot");
        sb.append('=');
        sb.append(((this.holdCurrTot == null)?"<null>":this.holdCurrTot));
        sb.append(',');
        sb.append("begTotDrCrDesc");
        sb.append('=');
        sb.append(((this.begTotDrCrDesc == null)?"<null>":this.begTotDrCrDesc));
        sb.append(',');
        sb.append("holdBegTot");
        sb.append('=');
        sb.append(((this.holdBegTot == null)?"<null>":this.holdBegTot));
        sb.append(',');
        sb.append("curTotDrCrDesc");
        sb.append('=');
        sb.append(((this.curTotDrCrDesc == null)?"<null>":this.curTotDrCrDesc));
        sb.append(',');
        sb.append("displayTotBegDrCr");
        sb.append('=');
        sb.append(((this.displayTotBegDrCr == null)?"<null>":this.displayTotBegDrCr));
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
        result = ((result* 31)+((this.totalTitle == null)? 0 :this.totalTitle.hashCode()));
        result = ((result* 31)+((this.displayTotCurrDrCr == null)? 0 :this.displayTotCurrDrCr.hashCode()));
        result = ((result* 31)+((this.holdCurrTot == null)? 0 :this.holdCurrTot.hashCode()));
        result = ((result* 31)+((this.begTotDrCrDesc == null)? 0 :this.begTotDrCrDesc.hashCode()));
        result = ((result* 31)+((this.holdBegTot == null)? 0 :this.holdBegTot.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.curTotDrCrDesc == null)? 0 :this.curTotDrCrDesc.hashCode()));
        result = ((result* 31)+((this.displayTotBegDrCr == null)? 0 :this.displayTotBegDrCr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgvtbl1BlockTot) == false) {
            return false;
        }
        Fgvtbl1BlockTot rhs = ((Fgvtbl1BlockTot) other);
        return (((((((((this.totalTitle == rhs.totalTitle)||((this.totalTitle!= null)&&this.totalTitle.equals(rhs.totalTitle)))&&((this.displayTotCurrDrCr == rhs.displayTotCurrDrCr)||((this.displayTotCurrDrCr!= null)&&this.displayTotCurrDrCr.equals(rhs.displayTotCurrDrCr))))&&((this.holdCurrTot == rhs.holdCurrTot)||((this.holdCurrTot!= null)&&this.holdCurrTot.equals(rhs.holdCurrTot))))&&((this.begTotDrCrDesc == rhs.begTotDrCrDesc)||((this.begTotDrCrDesc!= null)&&this.begTotDrCrDesc.equals(rhs.begTotDrCrDesc))))&&((this.holdBegTot == rhs.holdBegTot)||((this.holdBegTot!= null)&&this.holdBegTot.equals(rhs.holdBegTot))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.curTotDrCrDesc == rhs.curTotDrCrDesc)||((this.curTotDrCrDesc!= null)&&this.curTotDrCrDesc.equals(rhs.curTotDrCrDesc))))&&((this.displayTotBegDrCr == rhs.displayTotBegDrCr)||((this.displayTotBegDrCr!= null)&&this.displayTotBegDrCr.equals(rhs.displayTotBegDrCr))));
    }

}
