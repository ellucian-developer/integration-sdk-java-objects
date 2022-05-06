
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
    "period",
    "disbursePct",
    "fundCode",
    "disburseLoadOpt",
    "scheduleDate",
    "displayScheduleAmt"
})
@Generated("jsonschema2pojo")
public class Rpradsb {

    /**
     * Period
     * <p>
     * Lineage reference object : RPRADSB_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_PERIOD")
    private String period;
    /**
     * Schedule Percent
     * <p>
     * Lineage reference object : RPRADSB_DISBURSE_PCT
     * 
     */
    @JsonProperty("disbursePct")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_DISBURSE_PCT")
    private Double disbursePct;
    /**
     * Fund
     * <p>
     * Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String fundCode;
    /**
     * Schedule Enrollment Option
     * <p>
     * Lineage reference object : RPRADSB_DISBURSE_LOAD_OPT
     * 
     */
    @JsonProperty("disburseLoadOpt")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_DISBURSE_LOAD_OPT")
    private String disburseLoadOpt;
    /**
     * Schedule Date
     * <p>
     * Lineage reference object : RPRADSB_SCHEDULE_DATE
     * (Required)
     * 
     */
    @JsonProperty("scheduleDate")
    @JsonPropertyDescription("Lineage reference object : RPRADSB_SCHEDULE_DATE")
    private Date scheduleDate;
    /**
     * Schedule Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayScheduleAmt")
    private Double displayScheduleAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Period
     * <p>
     * Lineage reference object : RPRADSB_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RPRADSB_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public Rpradsb withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Schedule Percent
     * <p>
     * Lineage reference object : RPRADSB_DISBURSE_PCT
     * 
     */
    @JsonProperty("disbursePct")
    public Double getDisbursePct() {
        return disbursePct;
    }

    /**
     * Schedule Percent
     * <p>
     * Lineage reference object : RPRADSB_DISBURSE_PCT
     * 
     */
    @JsonProperty("disbursePct")
    public void setDisbursePct(Double disbursePct) {
        this.disbursePct = disbursePct;
    }

    public Rpradsb withDisbursePct(Double disbursePct) {
        this.disbursePct = disbursePct;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRADSB_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public Rpradsb withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Schedule Enrollment Option
     * <p>
     * Lineage reference object : RPRADSB_DISBURSE_LOAD_OPT
     * 
     */
    @JsonProperty("disburseLoadOpt")
    public String getDisburseLoadOpt() {
        return disburseLoadOpt;
    }

    /**
     * Schedule Enrollment Option
     * <p>
     * Lineage reference object : RPRADSB_DISBURSE_LOAD_OPT
     * 
     */
    @JsonProperty("disburseLoadOpt")
    public void setDisburseLoadOpt(String disburseLoadOpt) {
        this.disburseLoadOpt = disburseLoadOpt;
    }

    public Rpradsb withDisburseLoadOpt(String disburseLoadOpt) {
        this.disburseLoadOpt = disburseLoadOpt;
        return this;
    }

    /**
     * Schedule Date
     * <p>
     * Lineage reference object : RPRADSB_SCHEDULE_DATE
     * (Required)
     * 
     */
    @JsonProperty("scheduleDate")
    public Date getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Schedule Date
     * <p>
     * Lineage reference object : RPRADSB_SCHEDULE_DATE
     * (Required)
     * 
     */
    @JsonProperty("scheduleDate")
    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public Rpradsb withScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
        return this;
    }

    /**
     * Schedule Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayScheduleAmt")
    public Double getDisplayScheduleAmt() {
        return displayScheduleAmt;
    }

    /**
     * Schedule Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("displayScheduleAmt")
    public void setDisplayScheduleAmt(Double displayScheduleAmt) {
        this.displayScheduleAmt = displayScheduleAmt;
    }

    public Rpradsb withDisplayScheduleAmt(Double displayScheduleAmt) {
        this.displayScheduleAmt = displayScheduleAmt;
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

    public Rpradsb withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rpradsb.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("disbursePct");
        sb.append('=');
        sb.append(((this.disbursePct == null)?"<null>":this.disbursePct));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("disburseLoadOpt");
        sb.append('=');
        sb.append(((this.disburseLoadOpt == null)?"<null>":this.disburseLoadOpt));
        sb.append(',');
        sb.append("scheduleDate");
        sb.append('=');
        sb.append(((this.scheduleDate == null)?"<null>":this.scheduleDate));
        sb.append(',');
        sb.append("displayScheduleAmt");
        sb.append('=');
        sb.append(((this.displayScheduleAmt == null)?"<null>":this.displayScheduleAmt));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.disbursePct == null)? 0 :this.disbursePct.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.disburseLoadOpt == null)? 0 :this.disburseLoadOpt.hashCode()));
        result = ((result* 31)+((this.scheduleDate == null)? 0 :this.scheduleDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayScheduleAmt == null)? 0 :this.displayScheduleAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rpradsb) == false) {
            return false;
        }
        Rpradsb rhs = ((Rpradsb) other);
        return ((((((((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period)))&&((this.disbursePct == rhs.disbursePct)||((this.disbursePct!= null)&&this.disbursePct.equals(rhs.disbursePct))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.disburseLoadOpt == rhs.disburseLoadOpt)||((this.disburseLoadOpt!= null)&&this.disburseLoadOpt.equals(rhs.disburseLoadOpt))))&&((this.scheduleDate == rhs.scheduleDate)||((this.scheduleDate!= null)&&this.scheduleDate.equals(rhs.scheduleDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayScheduleAmt == rhs.displayScheduleAmt)||((this.displayScheduleAmt!= null)&&this.displayScheduleAmt.equals(rhs.displayScheduleAmt))));
    }

}
