
package com.ellucian.generated.bpapi.ban.transactions_in_process_status.v1_0_0;

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
    "totalBudgetRsvrtn",
    "displayAvailBal",
    "totalYtdActivity",
    "totalAdjustedBudget"
})
@Generated("jsonschema2pojo")
public class TotalBlock {

    /**
     * Lineage reference object : totalBudgetRsvrtn
     * 
     */
    @JsonProperty("totalBudgetRsvrtn")
    @JsonPropertyDescription("Lineage reference object : totalBudgetRsvrtn")
    private Double totalBudgetRsvrtn;
    /**
     * Available Balance In Process
     * <p>
     * Lineage reference object : displayAvailBal
     * 
     */
    @JsonProperty("displayAvailBal")
    @JsonPropertyDescription("Lineage reference object : displayAvailBal")
    private Double displayAvailBal;
    /**
     * Lineage reference object : totalYtdActivity
     * 
     */
    @JsonProperty("totalYtdActivity")
    @JsonPropertyDescription("Lineage reference object : totalYtdActivity")
    private Double totalYtdActivity;
    /**
     * Total
     * <p>
     * Lineage reference object : totalAdjustedBudget
     * 
     */
    @JsonProperty("totalAdjustedBudget")
    @JsonPropertyDescription("Lineage reference object : totalAdjustedBudget")
    private Double totalAdjustedBudget;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : totalBudgetRsvrtn
     * 
     */
    @JsonProperty("totalBudgetRsvrtn")
    public Double getTotalBudgetRsvrtn() {
        return totalBudgetRsvrtn;
    }

    /**
     * Lineage reference object : totalBudgetRsvrtn
     * 
     */
    @JsonProperty("totalBudgetRsvrtn")
    public void setTotalBudgetRsvrtn(Double totalBudgetRsvrtn) {
        this.totalBudgetRsvrtn = totalBudgetRsvrtn;
    }

    public TotalBlock withTotalBudgetRsvrtn(Double totalBudgetRsvrtn) {
        this.totalBudgetRsvrtn = totalBudgetRsvrtn;
        return this;
    }

    /**
     * Available Balance In Process
     * <p>
     * Lineage reference object : displayAvailBal
     * 
     */
    @JsonProperty("displayAvailBal")
    public Double getDisplayAvailBal() {
        return displayAvailBal;
    }

    /**
     * Available Balance In Process
     * <p>
     * Lineage reference object : displayAvailBal
     * 
     */
    @JsonProperty("displayAvailBal")
    public void setDisplayAvailBal(Double displayAvailBal) {
        this.displayAvailBal = displayAvailBal;
    }

    public TotalBlock withDisplayAvailBal(Double displayAvailBal) {
        this.displayAvailBal = displayAvailBal;
        return this;
    }

    /**
     * Lineage reference object : totalYtdActivity
     * 
     */
    @JsonProperty("totalYtdActivity")
    public Double getTotalYtdActivity() {
        return totalYtdActivity;
    }

    /**
     * Lineage reference object : totalYtdActivity
     * 
     */
    @JsonProperty("totalYtdActivity")
    public void setTotalYtdActivity(Double totalYtdActivity) {
        this.totalYtdActivity = totalYtdActivity;
    }

    public TotalBlock withTotalYtdActivity(Double totalYtdActivity) {
        this.totalYtdActivity = totalYtdActivity;
        return this;
    }

    /**
     * Total
     * <p>
     * Lineage reference object : totalAdjustedBudget
     * 
     */
    @JsonProperty("totalAdjustedBudget")
    public Double getTotalAdjustedBudget() {
        return totalAdjustedBudget;
    }

    /**
     * Total
     * <p>
     * Lineage reference object : totalAdjustedBudget
     * 
     */
    @JsonProperty("totalAdjustedBudget")
    public void setTotalAdjustedBudget(Double totalAdjustedBudget) {
        this.totalAdjustedBudget = totalAdjustedBudget;
    }

    public TotalBlock withTotalAdjustedBudget(Double totalAdjustedBudget) {
        this.totalAdjustedBudget = totalAdjustedBudget;
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
        sb.append("totalBudgetRsvrtn");
        sb.append('=');
        sb.append(((this.totalBudgetRsvrtn == null)?"<null>":this.totalBudgetRsvrtn));
        sb.append(',');
        sb.append("displayAvailBal");
        sb.append('=');
        sb.append(((this.displayAvailBal == null)?"<null>":this.displayAvailBal));
        sb.append(',');
        sb.append("totalYtdActivity");
        sb.append('=');
        sb.append(((this.totalYtdActivity == null)?"<null>":this.totalYtdActivity));
        sb.append(',');
        sb.append("totalAdjustedBudget");
        sb.append('=');
        sb.append(((this.totalAdjustedBudget == null)?"<null>":this.totalAdjustedBudget));
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
        result = ((result* 31)+((this.totalYtdActivity == null)? 0 :this.totalYtdActivity.hashCode()));
        result = ((result* 31)+((this.totalBudgetRsvrtn == null)? 0 :this.totalBudgetRsvrtn.hashCode()));
        result = ((result* 31)+((this.totalAdjustedBudget == null)? 0 :this.totalAdjustedBudget.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayAvailBal == null)? 0 :this.displayAvailBal.hashCode()));
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
        return ((((((this.totalYtdActivity == rhs.totalYtdActivity)||((this.totalYtdActivity!= null)&&this.totalYtdActivity.equals(rhs.totalYtdActivity)))&&((this.totalBudgetRsvrtn == rhs.totalBudgetRsvrtn)||((this.totalBudgetRsvrtn!= null)&&this.totalBudgetRsvrtn.equals(rhs.totalBudgetRsvrtn))))&&((this.totalAdjustedBudget == rhs.totalAdjustedBudget)||((this.totalAdjustedBudget!= null)&&this.totalAdjustedBudget.equals(rhs.totalAdjustedBudget))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayAvailBal == rhs.displayAvailBal)||((this.displayAvailBal!= null)&&this.displayAvailBal.equals(rhs.displayAvailBal))));
    }

}
