
package com.ellucian.generated.bpapi.ban.award_maintenance_disbursement_schedule.v1_0_0;

import java.util.Date;
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
    "rpradsbDisburseDate",
    "rpradsbTermCode",
    "rpradsbDisburseLoad",
    "rpradsbFundCode",
    "rpradsbTranNumber",
    "rpradsbDisburseAmt",
    "rpradsbPeriod"
})
@Generated("jsonschema2pojo")
public class RpradsbAct {

    /**
     * Lineage reference object : RPRADSB_DISBURSE_DATE
     * 
     */
    @JsonProperty("rpradsbDisburseDate")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_DISBURSE_DATE")
    private Date rpradsbDisburseDate;
    /**
     * Lineage reference object : RPRADSB_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("rpradsbTermCode")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_TERM_CODE, Lookup lineage reference object : stvterm")
    private String rpradsbTermCode;
    /**
     * Lineage reference object : RPRADSB_DISBURSE_LOAD
     * 
     */
    @JsonProperty("rpradsbDisburseLoad")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_DISBURSE_LOAD")
    private String rpradsbDisburseLoad;
    /**
     * Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("rpradsbFundCode")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String rpradsbFundCode;
    /**
     * Lineage reference object : RPRADSB_TRAN_NUMBER
     * 
     */
    @JsonProperty("rpradsbTranNumber")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_TRAN_NUMBER")
    private Double rpradsbTranNumber;
    /**
     * Lineage reference object : RPRADSB_DISBURSE_AMT
     * 
     */
    @JsonProperty("rpradsbDisburseAmt")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_DISBURSE_AMT")
    private Double rpradsbDisburseAmt;
    /**
     * Lineage reference object : RPRADSB_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("rpradsbPeriod")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_PERIOD")
    private String rpradsbPeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RPRADSB_DISBURSE_DATE
     * 
     */
    @JsonProperty("rpradsbDisburseDate")
    public Date getRpradsbDisburseDate() {
        return rpradsbDisburseDate;
    }

    /**
     * Lineage reference object : RPRADSB_DISBURSE_DATE
     * 
     */
    @JsonProperty("rpradsbDisburseDate")
    public void setRpradsbDisburseDate(Date rpradsbDisburseDate) {
        this.rpradsbDisburseDate = rpradsbDisburseDate;
    }

    public RpradsbAct withRpradsbDisburseDate(Date rpradsbDisburseDate) {
        this.rpradsbDisburseDate = rpradsbDisburseDate;
        return this;
    }

    /**
     * Lineage reference object : RPRADSB_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("rpradsbTermCode")
    public String getRpradsbTermCode() {
        return rpradsbTermCode;
    }

    /**
     * Lineage reference object : RPRADSB_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("rpradsbTermCode")
    public void setRpradsbTermCode(String rpradsbTermCode) {
        this.rpradsbTermCode = rpradsbTermCode;
    }

    public RpradsbAct withRpradsbTermCode(String rpradsbTermCode) {
        this.rpradsbTermCode = rpradsbTermCode;
        return this;
    }

    /**
     * Lineage reference object : RPRADSB_DISBURSE_LOAD
     * 
     */
    @JsonProperty("rpradsbDisburseLoad")
    public String getRpradsbDisburseLoad() {
        return rpradsbDisburseLoad;
    }

    /**
     * Lineage reference object : RPRADSB_DISBURSE_LOAD
     * 
     */
    @JsonProperty("rpradsbDisburseLoad")
    public void setRpradsbDisburseLoad(String rpradsbDisburseLoad) {
        this.rpradsbDisburseLoad = rpradsbDisburseLoad;
    }

    public RpradsbAct withRpradsbDisburseLoad(String rpradsbDisburseLoad) {
        this.rpradsbDisburseLoad = rpradsbDisburseLoad;
        return this;
    }

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

    public RpradsbAct withRpradsbFundCode(String rpradsbFundCode) {
        this.rpradsbFundCode = rpradsbFundCode;
        return this;
    }

    /**
     * Lineage reference object : RPRADSB_TRAN_NUMBER
     * 
     */
    @JsonProperty("rpradsbTranNumber")
    public Double getRpradsbTranNumber() {
        return rpradsbTranNumber;
    }

    /**
     * Lineage reference object : RPRADSB_TRAN_NUMBER
     * 
     */
    @JsonProperty("rpradsbTranNumber")
    public void setRpradsbTranNumber(Double rpradsbTranNumber) {
        this.rpradsbTranNumber = rpradsbTranNumber;
    }

    public RpradsbAct withRpradsbTranNumber(Double rpradsbTranNumber) {
        this.rpradsbTranNumber = rpradsbTranNumber;
        return this;
    }

    /**
     * Lineage reference object : RPRADSB_DISBURSE_AMT
     * 
     */
    @JsonProperty("rpradsbDisburseAmt")
    public Double getRpradsbDisburseAmt() {
        return rpradsbDisburseAmt;
    }

    /**
     * Lineage reference object : RPRADSB_DISBURSE_AMT
     * 
     */
    @JsonProperty("rpradsbDisburseAmt")
    public void setRpradsbDisburseAmt(Double rpradsbDisburseAmt) {
        this.rpradsbDisburseAmt = rpradsbDisburseAmt;
    }

    public RpradsbAct withRpradsbDisburseAmt(Double rpradsbDisburseAmt) {
        this.rpradsbDisburseAmt = rpradsbDisburseAmt;
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

    public RpradsbAct withRpradsbPeriod(String rpradsbPeriod) {
        this.rpradsbPeriod = rpradsbPeriod;
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

    public RpradsbAct withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RpradsbAct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rpradsbDisburseDate");
        sb.append('=');
        sb.append(((this.rpradsbDisburseDate == null)?"<null>":this.rpradsbDisburseDate));
        sb.append(',');
        sb.append("rpradsbTermCode");
        sb.append('=');
        sb.append(((this.rpradsbTermCode == null)?"<null>":this.rpradsbTermCode));
        sb.append(',');
        sb.append("rpradsbDisburseLoad");
        sb.append('=');
        sb.append(((this.rpradsbDisburseLoad == null)?"<null>":this.rpradsbDisburseLoad));
        sb.append(',');
        sb.append("rpradsbFundCode");
        sb.append('=');
        sb.append(((this.rpradsbFundCode == null)?"<null>":this.rpradsbFundCode));
        sb.append(',');
        sb.append("rpradsbTranNumber");
        sb.append('=');
        sb.append(((this.rpradsbTranNumber == null)?"<null>":this.rpradsbTranNumber));
        sb.append(',');
        sb.append("rpradsbDisburseAmt");
        sb.append('=');
        sb.append(((this.rpradsbDisburseAmt == null)?"<null>":this.rpradsbDisburseAmt));
        sb.append(',');
        sb.append("rpradsbPeriod");
        sb.append('=');
        sb.append(((this.rpradsbPeriod == null)?"<null>":this.rpradsbPeriod));
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
        result = ((result* 31)+((this.rpradsbDisburseDate == null)? 0 :this.rpradsbDisburseDate.hashCode()));
        result = ((result* 31)+((this.rpradsbTermCode == null)? 0 :this.rpradsbTermCode.hashCode()));
        result = ((result* 31)+((this.rpradsbDisburseLoad == null)? 0 :this.rpradsbDisburseLoad.hashCode()));
        result = ((result* 31)+((this.rpradsbFundCode == null)? 0 :this.rpradsbFundCode.hashCode()));
        result = ((result* 31)+((this.rpradsbTranNumber == null)? 0 :this.rpradsbTranNumber.hashCode()));
        result = ((result* 31)+((this.rpradsbDisburseAmt == null)? 0 :this.rpradsbDisburseAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rpradsbPeriod == null)? 0 :this.rpradsbPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RpradsbAct) == false) {
            return false;
        }
        RpradsbAct rhs = ((RpradsbAct) other);
        return (((((((((this.rpradsbDisburseDate == rhs.rpradsbDisburseDate)||((this.rpradsbDisburseDate!= null)&&this.rpradsbDisburseDate.equals(rhs.rpradsbDisburseDate)))&&((this.rpradsbTermCode == rhs.rpradsbTermCode)||((this.rpradsbTermCode!= null)&&this.rpradsbTermCode.equals(rhs.rpradsbTermCode))))&&((this.rpradsbDisburseLoad == rhs.rpradsbDisburseLoad)||((this.rpradsbDisburseLoad!= null)&&this.rpradsbDisburseLoad.equals(rhs.rpradsbDisburseLoad))))&&((this.rpradsbFundCode == rhs.rpradsbFundCode)||((this.rpradsbFundCode!= null)&&this.rpradsbFundCode.equals(rhs.rpradsbFundCode))))&&((this.rpradsbTranNumber == rhs.rpradsbTranNumber)||((this.rpradsbTranNumber!= null)&&this.rpradsbTranNumber.equals(rhs.rpradsbTranNumber))))&&((this.rpradsbDisburseAmt == rhs.rpradsbDisburseAmt)||((this.rpradsbDisburseAmt!= null)&&this.rpradsbDisburseAmt.equals(rhs.rpradsbDisburseAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rpradsbPeriod == rhs.rpradsbPeriod)||((this.rpradsbPeriod!= null)&&this.rpradsbPeriod.equals(rhs.rpradsbPeriod))));
    }

}
