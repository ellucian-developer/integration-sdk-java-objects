
package com.ellucian.generated.bpapi.ban.award_maintenance_direct_loan_interface.v1_0_0;

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
    "rlrdlorAcadYrEndDate",
    "rlrdlorLoanAmt",
    "period",
    "loanNo",
    "fundCode",
    "rlrdlorAcadYrStartDate",
    "rlrdlorAwardStartDate",
    "loanAmt",
    "displayBbaySayrCode",
    "rlrdlorAwardEndDate"
})
@Generated("jsonschema2pojo")
public class Rlrdlp {

    /**
     * Academic Year End
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAcadYrEndDate")
    private Date rlrdlorAcadYrEndDate;
    /**
     * Loan Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("rlrdlorLoanAmt")
    private Double rlrdlorLoanAmt;
    /**
     * Period
     * <p>
     * Lineage reference object : RLRDLPS_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : RLRDLPS_PERIOD")
    private String period;
    /**
     * Loan Number
     * <p>
     * Lineage reference object : RLRDLPS_LOAN_NO
     * 
     */
    @JsonProperty("loanNo")
    @JsonPropertyDescription("Lineage reference object : RLRDLPS_LOAN_NO")
    private Double loanNo;
    /**
     * Fund
     * <p>
     * Lineage reference object : RLRDLPS_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RLRDLPS_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String fundCode;
    /**
     * Academic Year Start
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAcadYrStartDate")
    private Date rlrdlorAcadYrStartDate;
    /**
     * Loan Start
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAwardStartDate")
    private Date rlrdlorAwardStartDate;
    /**
     * Period Amount
     * <p>
     * Lineage reference object : RLRDLPS_LOAN_AMT
     * 
     */
    @JsonProperty("loanAmt")
    @JsonPropertyDescription("Lineage reference object : RLRDLPS_LOAN_AMT")
    private Double loanAmt;
    /**
     * BBAY/SAY Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayBbaySayrCode")
    private String displayBbaySayrCode;
    /**
     * Loan End
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAwardEndDate")
    private Date rlrdlorAwardEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Academic Year End
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAcadYrEndDate")
    public Date getRlrdlorAcadYrEndDate() {
        return rlrdlorAcadYrEndDate;
    }

    /**
     * Academic Year End
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAcadYrEndDate")
    public void setRlrdlorAcadYrEndDate(Date rlrdlorAcadYrEndDate) {
        this.rlrdlorAcadYrEndDate = rlrdlorAcadYrEndDate;
    }

    public Rlrdlp withRlrdlorAcadYrEndDate(Date rlrdlorAcadYrEndDate) {
        this.rlrdlorAcadYrEndDate = rlrdlorAcadYrEndDate;
        return this;
    }

    /**
     * Loan Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("rlrdlorLoanAmt")
    public Double getRlrdlorLoanAmt() {
        return rlrdlorLoanAmt;
    }

    /**
     * Loan Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("rlrdlorLoanAmt")
    public void setRlrdlorLoanAmt(Double rlrdlorLoanAmt) {
        this.rlrdlorLoanAmt = rlrdlorLoanAmt;
    }

    public Rlrdlp withRlrdlorLoanAmt(Double rlrdlorLoanAmt) {
        this.rlrdlorLoanAmt = rlrdlorLoanAmt;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RLRDLPS_PERIOD
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
     * Lineage reference object : RLRDLPS_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public Rlrdlp withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Loan Number
     * <p>
     * Lineage reference object : RLRDLPS_LOAN_NO
     * 
     */
    @JsonProperty("loanNo")
    public Double getLoanNo() {
        return loanNo;
    }

    /**
     * Loan Number
     * <p>
     * Lineage reference object : RLRDLPS_LOAN_NO
     * 
     */
    @JsonProperty("loanNo")
    public void setLoanNo(Double loanNo) {
        this.loanNo = loanNo;
    }

    public Rlrdlp withLoanNo(Double loanNo) {
        this.loanNo = loanNo;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RLRDLPS_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
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
     * Lineage reference object : RLRDLPS_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public Rlrdlp withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Academic Year Start
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAcadYrStartDate")
    public Date getRlrdlorAcadYrStartDate() {
        return rlrdlorAcadYrStartDate;
    }

    /**
     * Academic Year Start
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAcadYrStartDate")
    public void setRlrdlorAcadYrStartDate(Date rlrdlorAcadYrStartDate) {
        this.rlrdlorAcadYrStartDate = rlrdlorAcadYrStartDate;
    }

    public Rlrdlp withRlrdlorAcadYrStartDate(Date rlrdlorAcadYrStartDate) {
        this.rlrdlorAcadYrStartDate = rlrdlorAcadYrStartDate;
        return this;
    }

    /**
     * Loan Start
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAwardStartDate")
    public Date getRlrdlorAwardStartDate() {
        return rlrdlorAwardStartDate;
    }

    /**
     * Loan Start
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAwardStartDate")
    public void setRlrdlorAwardStartDate(Date rlrdlorAwardStartDate) {
        this.rlrdlorAwardStartDate = rlrdlorAwardStartDate;
    }

    public Rlrdlp withRlrdlorAwardStartDate(Date rlrdlorAwardStartDate) {
        this.rlrdlorAwardStartDate = rlrdlorAwardStartDate;
        return this;
    }

    /**
     * Period Amount
     * <p>
     * Lineage reference object : RLRDLPS_LOAN_AMT
     * 
     */
    @JsonProperty("loanAmt")
    public Double getLoanAmt() {
        return loanAmt;
    }

    /**
     * Period Amount
     * <p>
     * Lineage reference object : RLRDLPS_LOAN_AMT
     * 
     */
    @JsonProperty("loanAmt")
    public void setLoanAmt(Double loanAmt) {
        this.loanAmt = loanAmt;
    }

    public Rlrdlp withLoanAmt(Double loanAmt) {
        this.loanAmt = loanAmt;
        return this;
    }

    /**
     * BBAY/SAY Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayBbaySayrCode")
    public String getDisplayBbaySayrCode() {
        return displayBbaySayrCode;
    }

    /**
     * BBAY/SAY Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayBbaySayrCode")
    public void setDisplayBbaySayrCode(String displayBbaySayrCode) {
        this.displayBbaySayrCode = displayBbaySayrCode;
    }

    public Rlrdlp withDisplayBbaySayrCode(String displayBbaySayrCode) {
        this.displayBbaySayrCode = displayBbaySayrCode;
        return this;
    }

    /**
     * Loan End
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAwardEndDate")
    public Date getRlrdlorAwardEndDate() {
        return rlrdlorAwardEndDate;
    }

    /**
     * Loan End
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorAwardEndDate")
    public void setRlrdlorAwardEndDate(Date rlrdlorAwardEndDate) {
        this.rlrdlorAwardEndDate = rlrdlorAwardEndDate;
    }

    public Rlrdlp withRlrdlorAwardEndDate(Date rlrdlorAwardEndDate) {
        this.rlrdlorAwardEndDate = rlrdlorAwardEndDate;
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

    public Rlrdlp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rlrdlp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rlrdlorAcadYrEndDate");
        sb.append('=');
        sb.append(((this.rlrdlorAcadYrEndDate == null)?"<null>":this.rlrdlorAcadYrEndDate));
        sb.append(',');
        sb.append("rlrdlorLoanAmt");
        sb.append('=');
        sb.append(((this.rlrdlorLoanAmt == null)?"<null>":this.rlrdlorLoanAmt));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("loanNo");
        sb.append('=');
        sb.append(((this.loanNo == null)?"<null>":this.loanNo));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("rlrdlorAcadYrStartDate");
        sb.append('=');
        sb.append(((this.rlrdlorAcadYrStartDate == null)?"<null>":this.rlrdlorAcadYrStartDate));
        sb.append(',');
        sb.append("rlrdlorAwardStartDate");
        sb.append('=');
        sb.append(((this.rlrdlorAwardStartDate == null)?"<null>":this.rlrdlorAwardStartDate));
        sb.append(',');
        sb.append("loanAmt");
        sb.append('=');
        sb.append(((this.loanAmt == null)?"<null>":this.loanAmt));
        sb.append(',');
        sb.append("displayBbaySayrCode");
        sb.append('=');
        sb.append(((this.displayBbaySayrCode == null)?"<null>":this.displayBbaySayrCode));
        sb.append(',');
        sb.append("rlrdlorAwardEndDate");
        sb.append('=');
        sb.append(((this.rlrdlorAwardEndDate == null)?"<null>":this.rlrdlorAwardEndDate));
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
        result = ((result* 31)+((this.rlrdlorAcadYrEndDate == null)? 0 :this.rlrdlorAcadYrEndDate.hashCode()));
        result = ((result* 31)+((this.rlrdlorLoanAmt == null)? 0 :this.rlrdlorLoanAmt.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.loanNo == null)? 0 :this.loanNo.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.rlrdlorAcadYrStartDate == null)? 0 :this.rlrdlorAcadYrStartDate.hashCode()));
        result = ((result* 31)+((this.rlrdlorAwardStartDate == null)? 0 :this.rlrdlorAwardStartDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.loanAmt == null)? 0 :this.loanAmt.hashCode()));
        result = ((result* 31)+((this.displayBbaySayrCode == null)? 0 :this.displayBbaySayrCode.hashCode()));
        result = ((result* 31)+((this.rlrdlorAwardEndDate == null)? 0 :this.rlrdlorAwardEndDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rlrdlp) == false) {
            return false;
        }
        Rlrdlp rhs = ((Rlrdlp) other);
        return ((((((((((((this.rlrdlorAcadYrEndDate == rhs.rlrdlorAcadYrEndDate)||((this.rlrdlorAcadYrEndDate!= null)&&this.rlrdlorAcadYrEndDate.equals(rhs.rlrdlorAcadYrEndDate)))&&((this.rlrdlorLoanAmt == rhs.rlrdlorLoanAmt)||((this.rlrdlorLoanAmt!= null)&&this.rlrdlorLoanAmt.equals(rhs.rlrdlorLoanAmt))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.loanNo == rhs.loanNo)||((this.loanNo!= null)&&this.loanNo.equals(rhs.loanNo))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.rlrdlorAcadYrStartDate == rhs.rlrdlorAcadYrStartDate)||((this.rlrdlorAcadYrStartDate!= null)&&this.rlrdlorAcadYrStartDate.equals(rhs.rlrdlorAcadYrStartDate))))&&((this.rlrdlorAwardStartDate == rhs.rlrdlorAwardStartDate)||((this.rlrdlorAwardStartDate!= null)&&this.rlrdlorAwardStartDate.equals(rhs.rlrdlorAwardStartDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.loanAmt == rhs.loanAmt)||((this.loanAmt!= null)&&this.loanAmt.equals(rhs.loanAmt))))&&((this.displayBbaySayrCode == rhs.displayBbaySayrCode)||((this.displayBbaySayrCode!= null)&&this.displayBbaySayrCode.equals(rhs.displayBbaySayrCode))))&&((this.rlrdlorAwardEndDate == rhs.rlrdlorAwardEndDate)||((this.rlrdlorAwardEndDate!= null)&&this.rlrdlorAwardEndDate.equals(rhs.rlrdlorAwardEndDate))));
    }

}
