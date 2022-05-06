
package com.ellucian.generated.bpapi.ban.award_maintenance_direct_loan_interface.v1_0_0;

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
    "rpratrmAcceptAmt",
    "rlvalinBbayDiffInd",
    "rlvalinDiffAmt",
    "rpratrmFundCode",
    "rpratrmAwstCode",
    "displayLoanAmt",
    "rpratrmPeriod",
    "displayOrigNumber",
    "rlvalinSayrDiffInd",
    "rlvalinFeeChangeInd"
})
@Generated("jsonschema2pojo")
public class Rpratrm2 {

    /**
     * Accepted Award
     * <p>
     * Lineage reference object : RPRATRM_ACCEPT_AMT
     * 
     */
    @JsonProperty("rpratrmAcceptAmt")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_ACCEPT_AMT")
    private Double rpratrmAcceptAmt;
    @JsonProperty("rlvalinBbayDiffInd")
    private String rlvalinBbayDiffInd;
    /**
     * Discrepancy
     * <p>
     * 
     * 
     */
    @JsonProperty("rlvalinDiffAmt")
    private Double rlvalinDiffAmt;
    /**
     * Fund
     * <p>
     * Lineage reference object : RPRATRM_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("rpratrmFundCode")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String rpratrmFundCode;
    /**
     * Status
     * <p>
     * Lineage reference object : RPRATRM_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("rpratrmAwstCode")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_AWST_CODE, Lookup lineage reference object : rtvawst")
    private String rpratrmAwstCode;
    /**
     * Origination
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLoanAmt")
    private Double displayLoanAmt;
    /**
     * Period
     * <p>
     * Lineage reference object : RPRATRM_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("rpratrmPeriod")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_PERIOD")
    private String rpratrmPeriod;
    /**
     * Originations
     * <p>
     * 
     * 
     */
    @JsonProperty("displayOrigNumber")
    private Double displayOrigNumber;
    @JsonProperty("rlvalinSayrDiffInd")
    private String rlvalinSayrDiffInd;
    @JsonProperty("rlvalinFeeChangeInd")
    private String rlvalinFeeChangeInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Accepted Award
     * <p>
     * Lineage reference object : RPRATRM_ACCEPT_AMT
     * 
     */
    @JsonProperty("rpratrmAcceptAmt")
    public Double getRpratrmAcceptAmt() {
        return rpratrmAcceptAmt;
    }

    /**
     * Accepted Award
     * <p>
     * Lineage reference object : RPRATRM_ACCEPT_AMT
     * 
     */
    @JsonProperty("rpratrmAcceptAmt")
    public void setRpratrmAcceptAmt(Double rpratrmAcceptAmt) {
        this.rpratrmAcceptAmt = rpratrmAcceptAmt;
    }

    public Rpratrm2 withRpratrmAcceptAmt(Double rpratrmAcceptAmt) {
        this.rpratrmAcceptAmt = rpratrmAcceptAmt;
        return this;
    }

    @JsonProperty("rlvalinBbayDiffInd")
    public String getRlvalinBbayDiffInd() {
        return rlvalinBbayDiffInd;
    }

    @JsonProperty("rlvalinBbayDiffInd")
    public void setRlvalinBbayDiffInd(String rlvalinBbayDiffInd) {
        this.rlvalinBbayDiffInd = rlvalinBbayDiffInd;
    }

    public Rpratrm2 withRlvalinBbayDiffInd(String rlvalinBbayDiffInd) {
        this.rlvalinBbayDiffInd = rlvalinBbayDiffInd;
        return this;
    }

    /**
     * Discrepancy
     * <p>
     * 
     * 
     */
    @JsonProperty("rlvalinDiffAmt")
    public Double getRlvalinDiffAmt() {
        return rlvalinDiffAmt;
    }

    /**
     * Discrepancy
     * <p>
     * 
     * 
     */
    @JsonProperty("rlvalinDiffAmt")
    public void setRlvalinDiffAmt(Double rlvalinDiffAmt) {
        this.rlvalinDiffAmt = rlvalinDiffAmt;
    }

    public Rpratrm2 withRlvalinDiffAmt(Double rlvalinDiffAmt) {
        this.rlvalinDiffAmt = rlvalinDiffAmt;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRATRM_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("rpratrmFundCode")
    public String getRpratrmFundCode() {
        return rpratrmFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRATRM_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("rpratrmFundCode")
    public void setRpratrmFundCode(String rpratrmFundCode) {
        this.rpratrmFundCode = rpratrmFundCode;
    }

    public Rpratrm2 withRpratrmFundCode(String rpratrmFundCode) {
        this.rpratrmFundCode = rpratrmFundCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRATRM_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("rpratrmAwstCode")
    public String getRpratrmAwstCode() {
        return rpratrmAwstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRATRM_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("rpratrmAwstCode")
    public void setRpratrmAwstCode(String rpratrmAwstCode) {
        this.rpratrmAwstCode = rpratrmAwstCode;
    }

    public Rpratrm2 withRpratrmAwstCode(String rpratrmAwstCode) {
        this.rpratrmAwstCode = rpratrmAwstCode;
        return this;
    }

    /**
     * Origination
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLoanAmt")
    public Double getDisplayLoanAmt() {
        return displayLoanAmt;
    }

    /**
     * Origination
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLoanAmt")
    public void setDisplayLoanAmt(Double displayLoanAmt) {
        this.displayLoanAmt = displayLoanAmt;
    }

    public Rpratrm2 withDisplayLoanAmt(Double displayLoanAmt) {
        this.displayLoanAmt = displayLoanAmt;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RPRATRM_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("rpratrmPeriod")
    public String getRpratrmPeriod() {
        return rpratrmPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RPRATRM_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("rpratrmPeriod")
    public void setRpratrmPeriod(String rpratrmPeriod) {
        this.rpratrmPeriod = rpratrmPeriod;
    }

    public Rpratrm2 withRpratrmPeriod(String rpratrmPeriod) {
        this.rpratrmPeriod = rpratrmPeriod;
        return this;
    }

    /**
     * Originations
     * <p>
     * 
     * 
     */
    @JsonProperty("displayOrigNumber")
    public Double getDisplayOrigNumber() {
        return displayOrigNumber;
    }

    /**
     * Originations
     * <p>
     * 
     * 
     */
    @JsonProperty("displayOrigNumber")
    public void setDisplayOrigNumber(Double displayOrigNumber) {
        this.displayOrigNumber = displayOrigNumber;
    }

    public Rpratrm2 withDisplayOrigNumber(Double displayOrigNumber) {
        this.displayOrigNumber = displayOrigNumber;
        return this;
    }

    @JsonProperty("rlvalinSayrDiffInd")
    public String getRlvalinSayrDiffInd() {
        return rlvalinSayrDiffInd;
    }

    @JsonProperty("rlvalinSayrDiffInd")
    public void setRlvalinSayrDiffInd(String rlvalinSayrDiffInd) {
        this.rlvalinSayrDiffInd = rlvalinSayrDiffInd;
    }

    public Rpratrm2 withRlvalinSayrDiffInd(String rlvalinSayrDiffInd) {
        this.rlvalinSayrDiffInd = rlvalinSayrDiffInd;
        return this;
    }

    @JsonProperty("rlvalinFeeChangeInd")
    public String getRlvalinFeeChangeInd() {
        return rlvalinFeeChangeInd;
    }

    @JsonProperty("rlvalinFeeChangeInd")
    public void setRlvalinFeeChangeInd(String rlvalinFeeChangeInd) {
        this.rlvalinFeeChangeInd = rlvalinFeeChangeInd;
    }

    public Rpratrm2 withRlvalinFeeChangeInd(String rlvalinFeeChangeInd) {
        this.rlvalinFeeChangeInd = rlvalinFeeChangeInd;
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

    public Rpratrm2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rpratrm2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rpratrmAcceptAmt");
        sb.append('=');
        sb.append(((this.rpratrmAcceptAmt == null)?"<null>":this.rpratrmAcceptAmt));
        sb.append(',');
        sb.append("rlvalinBbayDiffInd");
        sb.append('=');
        sb.append(((this.rlvalinBbayDiffInd == null)?"<null>":this.rlvalinBbayDiffInd));
        sb.append(',');
        sb.append("rlvalinDiffAmt");
        sb.append('=');
        sb.append(((this.rlvalinDiffAmt == null)?"<null>":this.rlvalinDiffAmt));
        sb.append(',');
        sb.append("rpratrmFundCode");
        sb.append('=');
        sb.append(((this.rpratrmFundCode == null)?"<null>":this.rpratrmFundCode));
        sb.append(',');
        sb.append("rpratrmAwstCode");
        sb.append('=');
        sb.append(((this.rpratrmAwstCode == null)?"<null>":this.rpratrmAwstCode));
        sb.append(',');
        sb.append("displayLoanAmt");
        sb.append('=');
        sb.append(((this.displayLoanAmt == null)?"<null>":this.displayLoanAmt));
        sb.append(',');
        sb.append("rpratrmPeriod");
        sb.append('=');
        sb.append(((this.rpratrmPeriod == null)?"<null>":this.rpratrmPeriod));
        sb.append(',');
        sb.append("displayOrigNumber");
        sb.append('=');
        sb.append(((this.displayOrigNumber == null)?"<null>":this.displayOrigNumber));
        sb.append(',');
        sb.append("rlvalinSayrDiffInd");
        sb.append('=');
        sb.append(((this.rlvalinSayrDiffInd == null)?"<null>":this.rlvalinSayrDiffInd));
        sb.append(',');
        sb.append("rlvalinFeeChangeInd");
        sb.append('=');
        sb.append(((this.rlvalinFeeChangeInd == null)?"<null>":this.rlvalinFeeChangeInd));
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
        result = ((result* 31)+((this.rpratrmAcceptAmt == null)? 0 :this.rpratrmAcceptAmt.hashCode()));
        result = ((result* 31)+((this.rlvalinBbayDiffInd == null)? 0 :this.rlvalinBbayDiffInd.hashCode()));
        result = ((result* 31)+((this.rlvalinDiffAmt == null)? 0 :this.rlvalinDiffAmt.hashCode()));
        result = ((result* 31)+((this.rpratrmFundCode == null)? 0 :this.rpratrmFundCode.hashCode()));
        result = ((result* 31)+((this.rpratrmAwstCode == null)? 0 :this.rpratrmAwstCode.hashCode()));
        result = ((result* 31)+((this.displayLoanAmt == null)? 0 :this.displayLoanAmt.hashCode()));
        result = ((result* 31)+((this.rpratrmPeriod == null)? 0 :this.rpratrmPeriod.hashCode()));
        result = ((result* 31)+((this.displayOrigNumber == null)? 0 :this.displayOrigNumber.hashCode()));
        result = ((result* 31)+((this.rlvalinSayrDiffInd == null)? 0 :this.rlvalinSayrDiffInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rlvalinFeeChangeInd == null)? 0 :this.rlvalinFeeChangeInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rpratrm2) == false) {
            return false;
        }
        Rpratrm2 rhs = ((Rpratrm2) other);
        return ((((((((((((this.rpratrmAcceptAmt == rhs.rpratrmAcceptAmt)||((this.rpratrmAcceptAmt!= null)&&this.rpratrmAcceptAmt.equals(rhs.rpratrmAcceptAmt)))&&((this.rlvalinBbayDiffInd == rhs.rlvalinBbayDiffInd)||((this.rlvalinBbayDiffInd!= null)&&this.rlvalinBbayDiffInd.equals(rhs.rlvalinBbayDiffInd))))&&((this.rlvalinDiffAmt == rhs.rlvalinDiffAmt)||((this.rlvalinDiffAmt!= null)&&this.rlvalinDiffAmt.equals(rhs.rlvalinDiffAmt))))&&((this.rpratrmFundCode == rhs.rpratrmFundCode)||((this.rpratrmFundCode!= null)&&this.rpratrmFundCode.equals(rhs.rpratrmFundCode))))&&((this.rpratrmAwstCode == rhs.rpratrmAwstCode)||((this.rpratrmAwstCode!= null)&&this.rpratrmAwstCode.equals(rhs.rpratrmAwstCode))))&&((this.displayLoanAmt == rhs.displayLoanAmt)||((this.displayLoanAmt!= null)&&this.displayLoanAmt.equals(rhs.displayLoanAmt))))&&((this.rpratrmPeriod == rhs.rpratrmPeriod)||((this.rpratrmPeriod!= null)&&this.rpratrmPeriod.equals(rhs.rpratrmPeriod))))&&((this.displayOrigNumber == rhs.displayOrigNumber)||((this.displayOrigNumber!= null)&&this.displayOrigNumber.equals(rhs.displayOrigNumber))))&&((this.rlvalinSayrDiffInd == rhs.rlvalinSayrDiffInd)||((this.rlvalinSayrDiffInd!= null)&&this.rlvalinSayrDiffInd.equals(rhs.rlvalinSayrDiffInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rlvalinFeeChangeInd == rhs.rlvalinFeeChangeInd)||((this.rlvalinFeeChangeInd!= null)&&this.rlvalinFeeChangeInd.equals(rhs.rlvalinFeeChangeInd))));
    }

}
