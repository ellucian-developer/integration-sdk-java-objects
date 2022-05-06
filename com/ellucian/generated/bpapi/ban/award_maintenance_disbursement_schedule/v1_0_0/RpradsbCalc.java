
package com.ellucian.generated.bpapi.ban.award_maintenance_disbursement_schedule.v1_0_0;

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
    "rpradsbFundCode",
    "rpradsbPellCalcDisbAmt",
    "rpradsbPeriod",
    "rpradsbPellcDisbLoadOpt",
    "rpradsbPellcDisbLoad"
})
@Generated("jsonschema2pojo")
public class RpradsbCalc {

    /**
     * Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("rpradsbFundCode")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String rpradsbFundCode;
    /**
     * Lineage reference object : RPRADSB_PELL_CALC_DISB_AMT
     * 
     */
    @JsonProperty("rpradsbPellCalcDisbAmt")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_PELL_CALC_DISB_AMT")
    private Double rpradsbPellCalcDisbAmt;
    /**
     * Lineage reference object : RPRADSB_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("rpradsbPeriod")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_PERIOD")
    private String rpradsbPeriod;
    /**
     * Lineage reference object : RPRADSB_PELLC_DISB_LOAD_OPT
     * 
     */
    @JsonProperty("rpradsbPellcDisbLoadOpt")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_PELLC_DISB_LOAD_OPT")
    private String rpradsbPellcDisbLoadOpt;
    /**
     * Lineage reference object : RPRADSB_PELLC_DISB_LOAD
     * 
     */
    @JsonProperty("rpradsbPellcDisbLoad")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_PELLC_DISB_LOAD")
    private String rpradsbPellcDisbLoad;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("rpradsbFundCode")
    public String getRpradsbFundCode() {
        return rpradsbFundCode;
    }

    /**
     * Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("rpradsbFundCode")
    public void setRpradsbFundCode(String rpradsbFundCode) {
        this.rpradsbFundCode = rpradsbFundCode;
    }

    public RpradsbCalc withRpradsbFundCode(String rpradsbFundCode) {
        this.rpradsbFundCode = rpradsbFundCode;
        return this;
    }

    /**
     * Lineage reference object : RPRADSB_PELL_CALC_DISB_AMT
     * 
     */
    @JsonProperty("rpradsbPellCalcDisbAmt")
    public Double getRpradsbPellCalcDisbAmt() {
        return rpradsbPellCalcDisbAmt;
    }

    /**
     * Lineage reference object : RPRADSB_PELL_CALC_DISB_AMT
     * 
     */
    @JsonProperty("rpradsbPellCalcDisbAmt")
    public void setRpradsbPellCalcDisbAmt(Double rpradsbPellCalcDisbAmt) {
        this.rpradsbPellCalcDisbAmt = rpradsbPellCalcDisbAmt;
    }

    public RpradsbCalc withRpradsbPellCalcDisbAmt(Double rpradsbPellCalcDisbAmt) {
        this.rpradsbPellCalcDisbAmt = rpradsbPellCalcDisbAmt;
        return this;
    }

    /**
     * Lineage reference object : RPRADSB_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("rpradsbPeriod")
    public String getRpradsbPeriod() {
        return rpradsbPeriod;
    }

    /**
     * Lineage reference object : RPRADSB_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("rpradsbPeriod")
    public void setRpradsbPeriod(String rpradsbPeriod) {
        this.rpradsbPeriod = rpradsbPeriod;
    }

    public RpradsbCalc withRpradsbPeriod(String rpradsbPeriod) {
        this.rpradsbPeriod = rpradsbPeriod;
        return this;
    }

    /**
     * Lineage reference object : RPRADSB_PELLC_DISB_LOAD_OPT
     * 
     */
    @JsonProperty("rpradsbPellcDisbLoadOpt")
    public String getRpradsbPellcDisbLoadOpt() {
        return rpradsbPellcDisbLoadOpt;
    }

    /**
     * Lineage reference object : RPRADSB_PELLC_DISB_LOAD_OPT
     * 
     */
    @JsonProperty("rpradsbPellcDisbLoadOpt")
    public void setRpradsbPellcDisbLoadOpt(String rpradsbPellcDisbLoadOpt) {
        this.rpradsbPellcDisbLoadOpt = rpradsbPellcDisbLoadOpt;
    }

    public RpradsbCalc withRpradsbPellcDisbLoadOpt(String rpradsbPellcDisbLoadOpt) {
        this.rpradsbPellcDisbLoadOpt = rpradsbPellcDisbLoadOpt;
        return this;
    }

    /**
     * Lineage reference object : RPRADSB_PELLC_DISB_LOAD
     * 
     */
    @JsonProperty("rpradsbPellcDisbLoad")
    public String getRpradsbPellcDisbLoad() {
        return rpradsbPellcDisbLoad;
    }

    /**
     * Lineage reference object : RPRADSB_PELLC_DISB_LOAD
     * 
     */
    @JsonProperty("rpradsbPellcDisbLoad")
    public void setRpradsbPellcDisbLoad(String rpradsbPellcDisbLoad) {
        this.rpradsbPellcDisbLoad = rpradsbPellcDisbLoad;
    }

    public RpradsbCalc withRpradsbPellcDisbLoad(String rpradsbPellcDisbLoad) {
        this.rpradsbPellcDisbLoad = rpradsbPellcDisbLoad;
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

    public RpradsbCalc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RpradsbCalc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rpradsbFundCode");
        sb.append('=');
        sb.append(((this.rpradsbFundCode == null)?"<null>":this.rpradsbFundCode));
        sb.append(',');
        sb.append("rpradsbPellCalcDisbAmt");
        sb.append('=');
        sb.append(((this.rpradsbPellCalcDisbAmt == null)?"<null>":this.rpradsbPellCalcDisbAmt));
        sb.append(',');
        sb.append("rpradsbPeriod");
        sb.append('=');
        sb.append(((this.rpradsbPeriod == null)?"<null>":this.rpradsbPeriod));
        sb.append(',');
        sb.append("rpradsbPellcDisbLoadOpt");
        sb.append('=');
        sb.append(((this.rpradsbPellcDisbLoadOpt == null)?"<null>":this.rpradsbPellcDisbLoadOpt));
        sb.append(',');
        sb.append("rpradsbPellcDisbLoad");
        sb.append('=');
        sb.append(((this.rpradsbPellcDisbLoad == null)?"<null>":this.rpradsbPellcDisbLoad));
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
        result = ((result* 31)+((this.rpradsbFundCode == null)? 0 :this.rpradsbFundCode.hashCode()));
        result = ((result* 31)+((this.rpradsbPellCalcDisbAmt == null)? 0 :this.rpradsbPellCalcDisbAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rpradsbPeriod == null)? 0 :this.rpradsbPeriod.hashCode()));
        result = ((result* 31)+((this.rpradsbPellcDisbLoadOpt == null)? 0 :this.rpradsbPellcDisbLoadOpt.hashCode()));
        result = ((result* 31)+((this.rpradsbPellcDisbLoad == null)? 0 :this.rpradsbPellcDisbLoad.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RpradsbCalc) == false) {
            return false;
        }
        RpradsbCalc rhs = ((RpradsbCalc) other);
        return (((((((this.rpradsbFundCode == rhs.rpradsbFundCode)||((this.rpradsbFundCode!= null)&&this.rpradsbFundCode.equals(rhs.rpradsbFundCode)))&&((this.rpradsbPellCalcDisbAmt == rhs.rpradsbPellCalcDisbAmt)||((this.rpradsbPellCalcDisbAmt!= null)&&this.rpradsbPellCalcDisbAmt.equals(rhs.rpradsbPellCalcDisbAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rpradsbPeriod == rhs.rpradsbPeriod)||((this.rpradsbPeriod!= null)&&this.rpradsbPeriod.equals(rhs.rpradsbPeriod))))&&((this.rpradsbPellcDisbLoadOpt == rhs.rpradsbPellcDisbLoadOpt)||((this.rpradsbPellcDisbLoadOpt!= null)&&this.rpradsbPellcDisbLoadOpt.equals(rhs.rpradsbPellcDisbLoadOpt))))&&((this.rpradsbPellcDisbLoad == rhs.rpradsbPellcDisbLoad)||((this.rpradsbPellcDisbLoad!= null)&&this.rpradsbPellcDisbLoad.equals(rhs.rpradsbPellcDisbLoad))));
    }

}
