
package com.ellucian.generated.bpapi.ban.fiscal_year_maintenance.v1_0_0;

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
    "prdEndDate",
    "eoqInd",
    "eoyAccrStatusInd",
    "endDate",
    "fsyrCode",
    "coasCode",
    "lastPeriod",
    "startDate"
})
@Generated("jsonschema2pojo")
public class FiscalYearMaintenance100PostRequest {

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSPD_PRD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("prdEndDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSPD_PRD_END_DATE")
    private Date prdEndDate;
    /**
     * Lineage reference object : FTVFSPD_EOQ_IND
     * 
     */
    @JsonProperty("eoqInd")
    @JsonPropertyDescription("Lineage reference object : FTVFSPD_EOQ_IND")
    private String eoqInd;
    /**
     * Accrual Period
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("eoyAccrStatusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND")
    private String eoyAccrStatusInd;
    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSYR_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_END_DATE")
    private Date endDate;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVFSYR_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("fsyrCode")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private String fsyrCode;
    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Periods
     * <p>
     * Lineage reference object : FTVFSYR_LAST_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("lastPeriod")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_LAST_PERIOD")
    private String lastPeriod;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSYR_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSYR_START_DATE")
    private Date startDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSPD_PRD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("prdEndDate")
    public Date getPrdEndDate() {
        return prdEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSPD_PRD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("prdEndDate")
    public void setPrdEndDate(Date prdEndDate) {
        this.prdEndDate = prdEndDate;
    }

    public FiscalYearMaintenance100PostRequest withPrdEndDate(Date prdEndDate) {
        this.prdEndDate = prdEndDate;
        return this;
    }

    /**
     * Lineage reference object : FTVFSPD_EOQ_IND
     * 
     */
    @JsonProperty("eoqInd")
    public String getEoqInd() {
        return eoqInd;
    }

    /**
     * Lineage reference object : FTVFSPD_EOQ_IND
     * 
     */
    @JsonProperty("eoqInd")
    public void setEoqInd(String eoqInd) {
        this.eoqInd = eoqInd;
    }

    public FiscalYearMaintenance100PostRequest withEoqInd(String eoqInd) {
        this.eoqInd = eoqInd;
        return this;
    }

    /**
     * Accrual Period
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("eoyAccrStatusInd")
    public String getEoyAccrStatusInd() {
        return eoyAccrStatusInd;
    }

    /**
     * Accrual Period
     * <p>
     * Lineage reference object : FTVFSYR_EOY_ACCR_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("eoyAccrStatusInd")
    public void setEoyAccrStatusInd(String eoyAccrStatusInd) {
        this.eoyAccrStatusInd = eoyAccrStatusInd;
    }

    public FiscalYearMaintenance100PostRequest withEoyAccrStatusInd(String eoyAccrStatusInd) {
        this.eoyAccrStatusInd = eoyAccrStatusInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSYR_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSYR_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public FiscalYearMaintenance100PostRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVFSYR_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("fsyrCode")
    public String getFsyrCode() {
        return fsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVFSYR_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("fsyrCode")
    public void setFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
    }

    public FiscalYearMaintenance100PostRequest withFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVFSYR_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public FiscalYearMaintenance100PostRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Periods
     * <p>
     * Lineage reference object : FTVFSYR_LAST_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("lastPeriod")
    public String getLastPeriod() {
        return lastPeriod;
    }

    /**
     * Periods
     * <p>
     * Lineage reference object : FTVFSYR_LAST_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("lastPeriod")
    public void setLastPeriod(String lastPeriod) {
        this.lastPeriod = lastPeriod;
    }

    public FiscalYearMaintenance100PostRequest withLastPeriod(String lastPeriod) {
        this.lastPeriod = lastPeriod;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSYR_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSYR_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public FiscalYearMaintenance100PostRequest withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public FiscalYearMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FiscalYearMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("prdEndDate");
        sb.append('=');
        sb.append(((this.prdEndDate == null)?"<null>":this.prdEndDate));
        sb.append(',');
        sb.append("eoqInd");
        sb.append('=');
        sb.append(((this.eoqInd == null)?"<null>":this.eoqInd));
        sb.append(',');
        sb.append("eoyAccrStatusInd");
        sb.append('=');
        sb.append(((this.eoyAccrStatusInd == null)?"<null>":this.eoyAccrStatusInd));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("fsyrCode");
        sb.append('=');
        sb.append(((this.fsyrCode == null)?"<null>":this.fsyrCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("lastPeriod");
        sb.append('=');
        sb.append(((this.lastPeriod == null)?"<null>":this.lastPeriod));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.prdEndDate == null)? 0 :this.prdEndDate.hashCode()));
        result = ((result* 31)+((this.eoqInd == null)? 0 :this.eoqInd.hashCode()));
        result = ((result* 31)+((this.eoyAccrStatusInd == null)? 0 :this.eoyAccrStatusInd.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.fsyrCode == null)? 0 :this.fsyrCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.lastPeriod == null)? 0 :this.lastPeriod.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FiscalYearMaintenance100PostRequest) == false) {
            return false;
        }
        FiscalYearMaintenance100PostRequest rhs = ((FiscalYearMaintenance100PostRequest) other);
        return ((((((((((this.prdEndDate == rhs.prdEndDate)||((this.prdEndDate!= null)&&this.prdEndDate.equals(rhs.prdEndDate)))&&((this.eoqInd == rhs.eoqInd)||((this.eoqInd!= null)&&this.eoqInd.equals(rhs.eoqInd))))&&((this.eoyAccrStatusInd == rhs.eoyAccrStatusInd)||((this.eoyAccrStatusInd!= null)&&this.eoyAccrStatusInd.equals(rhs.eoyAccrStatusInd))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.fsyrCode == rhs.fsyrCode)||((this.fsyrCode!= null)&&this.fsyrCode.equals(rhs.fsyrCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.lastPeriod == rhs.lastPeriod)||((this.lastPeriod!= null)&&this.lastPeriod.equals(rhs.lastPeriod))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
