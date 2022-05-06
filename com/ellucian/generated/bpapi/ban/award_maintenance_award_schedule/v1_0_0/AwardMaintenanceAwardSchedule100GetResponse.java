
package com.ellucian.generated.bpapi.ban.award_maintenance_award_schedule.v1_0_0;

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
    "bbayCode",
    "overrideDisbRule",
    "period",
    "acceptAmt",
    "displayRprawrdAwstCode",
    "displayRpratrmDeccanAmt",
    "paidAmt",
    "displayLockInd",
    "majrOverrideCode",
    "awstCode",
    "pellAwrdLoadOpt",
    "fundCode",
    "displayRpratrmMemautAmt",
    "lockInd",
    "pckgLoadInd",
    "disbFinalInd",
    "nsldsOvrdInd",
    "offerAmt"
})
@Generated("jsonschema2pojo")
public class AwardMaintenanceAwardSchedule100GetResponse {

    /**
     * BBAY Code
     * <p>
     * Lineage reference object : RPRATRM_BBAY_CODE
     * 
     */
    @JsonProperty("bbayCode")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_BBAY_CODE")
    private String bbayCode;
    /**
     * Fund Disbursement Rule Override
     * <p>
     * Lineage reference object : RPRATRM_OVERRIDE_DISB_RULE
     * 
     */
    @JsonProperty("overrideDisbRule")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_OVERRIDE_DISB_RULE")
    private String overrideDisbRule;
    /**
     * Period
     * <p>
     * Lineage reference object : RPRATRM_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_PERIOD")
    private String period;
    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRATRM_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_ACCEPT_AMT")
    private Double acceptAmt;
    /**
     * Aid Year Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRprawrdAwstCode")
    private String displayRprawrdAwstCode;
    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRpratrmDeccanAmt")
    private Double displayRpratrmDeccanAmt;
    /**
     * Paid
     * <p>
     * Lineage reference object : RPRATRM_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_PAID_AMT")
    private Double paidAmt;
    /**
     * Award Lock
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLockInd")
    private String displayLockInd;
    /**
     * Major Code Override
     * <p>
     * Lineage reference object : RPRATRM_MAJR_OVERRIDE_CODE, Lookup lineage reference object : RPRMAJR,STVMAJR
     * 
     */
    @JsonProperty("majrOverrideCode")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_MAJR_OVERRIDE_CODE, Lookup lineage reference object : RPRMAJR,STVMAJR")
    private String majrOverrideCode;
    /**
     * Status
     * <p>
     * Lineage reference object : RPRATRM_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("awstCode")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_AWST_CODE, Lookup lineage reference object : rtvawst")
    private String awstCode;
    /**
     * Grant Enrollment Option
     * <p>
     * Lineage reference object : RPRATRM_PELL_AWRD_LOAD_OPT
     * 
     */
    @JsonProperty("pellAwrdLoadOpt")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_PELL_AWRD_LOAD_OPT")
    private String pellAwrdLoadOpt;
    /**
     * Fund
     * <p>
     * Lineage reference object : RPRATRM_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String fundCode;
    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRpratrmMemautAmt")
    private Double displayRpratrmMemautAmt;
    /**
     * Period Lock
     * <p>
     * Lineage reference object : RPRATRM_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_LOCK_IND")
    private String lockInd;
    /**
     * Load
     * <p>
     * Lineage reference object : RPRATRM_PCKG_LOAD_IND
     * 
     */
    @JsonProperty("pckgLoadInd")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_PCKG_LOAD_IND")
    private String pckgLoadInd;
    /**
     * Finalized
     * <p>
     * Lineage reference object : RPRATRM_DISB_FINAL_IND
     * 
     */
    @JsonProperty("disbFinalInd")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_DISB_FINAL_IND")
    private String disbFinalInd;
    /**
     * NSLDS Override
     * <p>
     * Lineage reference object : RPRATRM_NSLDS_OVRD_IND
     * 
     */
    @JsonProperty("nsldsOvrdInd")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_NSLDS_OVRD_IND")
    private String nsldsOvrdInd;
    /**
     * Offered
     * <p>
     * Lineage reference object : RPRATRM_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    @JsonPropertyDescription("Lineage reference object : RPRATRM_OFFER_AMT")
    private Double offerAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * BBAY Code
     * <p>
     * Lineage reference object : RPRATRM_BBAY_CODE
     * 
     */
    @JsonProperty("bbayCode")
    public String getBbayCode() {
        return bbayCode;
    }

    /**
     * BBAY Code
     * <p>
     * Lineage reference object : RPRATRM_BBAY_CODE
     * 
     */
    @JsonProperty("bbayCode")
    public void setBbayCode(String bbayCode) {
        this.bbayCode = bbayCode;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withBbayCode(String bbayCode) {
        this.bbayCode = bbayCode;
        return this;
    }

    /**
     * Fund Disbursement Rule Override
     * <p>
     * Lineage reference object : RPRATRM_OVERRIDE_DISB_RULE
     * 
     */
    @JsonProperty("overrideDisbRule")
    public String getOverrideDisbRule() {
        return overrideDisbRule;
    }

    /**
     * Fund Disbursement Rule Override
     * <p>
     * Lineage reference object : RPRATRM_OVERRIDE_DISB_RULE
     * 
     */
    @JsonProperty("overrideDisbRule")
    public void setOverrideDisbRule(String overrideDisbRule) {
        this.overrideDisbRule = overrideDisbRule;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withOverrideDisbRule(String overrideDisbRule) {
        this.overrideDisbRule = overrideDisbRule;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RPRATRM_PERIOD
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
     * Lineage reference object : RPRATRM_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRATRM_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public Double getAcceptAmt() {
        return acceptAmt;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRATRM_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public void setAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
        return this;
    }

    /**
     * Aid Year Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRprawrdAwstCode")
    public String getDisplayRprawrdAwstCode() {
        return displayRprawrdAwstCode;
    }

    /**
     * Aid Year Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRprawrdAwstCode")
    public void setDisplayRprawrdAwstCode(String displayRprawrdAwstCode) {
        this.displayRprawrdAwstCode = displayRprawrdAwstCode;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withDisplayRprawrdAwstCode(String displayRprawrdAwstCode) {
        this.displayRprawrdAwstCode = displayRprawrdAwstCode;
        return this;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRpratrmDeccanAmt")
    public Double getDisplayRpratrmDeccanAmt() {
        return displayRpratrmDeccanAmt;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRpratrmDeccanAmt")
    public void setDisplayRpratrmDeccanAmt(Double displayRpratrmDeccanAmt) {
        this.displayRpratrmDeccanAmt = displayRpratrmDeccanAmt;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withDisplayRpratrmDeccanAmt(Double displayRpratrmDeccanAmt) {
        this.displayRpratrmDeccanAmt = displayRpratrmDeccanAmt;
        return this;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRATRM_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public Double getPaidAmt() {
        return paidAmt;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRATRM_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public void setPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
        return this;
    }

    /**
     * Award Lock
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLockInd")
    public String getDisplayLockInd() {
        return displayLockInd;
    }

    /**
     * Award Lock
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLockInd")
    public void setDisplayLockInd(String displayLockInd) {
        this.displayLockInd = displayLockInd;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withDisplayLockInd(String displayLockInd) {
        this.displayLockInd = displayLockInd;
        return this;
    }

    /**
     * Major Code Override
     * <p>
     * Lineage reference object : RPRATRM_MAJR_OVERRIDE_CODE, Lookup lineage reference object : RPRMAJR,STVMAJR
     * 
     */
    @JsonProperty("majrOverrideCode")
    public String getMajrOverrideCode() {
        return majrOverrideCode;
    }

    /**
     * Major Code Override
     * <p>
     * Lineage reference object : RPRATRM_MAJR_OVERRIDE_CODE, Lookup lineage reference object : RPRMAJR,STVMAJR
     * 
     */
    @JsonProperty("majrOverrideCode")
    public void setMajrOverrideCode(String majrOverrideCode) {
        this.majrOverrideCode = majrOverrideCode;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withMajrOverrideCode(String majrOverrideCode) {
        this.majrOverrideCode = majrOverrideCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRATRM_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("awstCode")
    public String getAwstCode() {
        return awstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRATRM_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("awstCode")
    public void setAwstCode(String awstCode) {
        this.awstCode = awstCode;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withAwstCode(String awstCode) {
        this.awstCode = awstCode;
        return this;
    }

    /**
     * Grant Enrollment Option
     * <p>
     * Lineage reference object : RPRATRM_PELL_AWRD_LOAD_OPT
     * 
     */
    @JsonProperty("pellAwrdLoadOpt")
    public String getPellAwrdLoadOpt() {
        return pellAwrdLoadOpt;
    }

    /**
     * Grant Enrollment Option
     * <p>
     * Lineage reference object : RPRATRM_PELL_AWRD_LOAD_OPT
     * 
     */
    @JsonProperty("pellAwrdLoadOpt")
    public void setPellAwrdLoadOpt(String pellAwrdLoadOpt) {
        this.pellAwrdLoadOpt = pellAwrdLoadOpt;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withPellAwrdLoadOpt(String pellAwrdLoadOpt) {
        this.pellAwrdLoadOpt = pellAwrdLoadOpt;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRATRM_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
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
     * Lineage reference object : RPRATRM_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRpratrmMemautAmt")
    public Double getDisplayRpratrmMemautAmt() {
        return displayRpratrmMemautAmt;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRpratrmMemautAmt")
    public void setDisplayRpratrmMemautAmt(Double displayRpratrmMemautAmt) {
        this.displayRpratrmMemautAmt = displayRpratrmMemautAmt;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withDisplayRpratrmMemautAmt(Double displayRpratrmMemautAmt) {
        this.displayRpratrmMemautAmt = displayRpratrmMemautAmt;
        return this;
    }

    /**
     * Period Lock
     * <p>
     * Lineage reference object : RPRATRM_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    /**
     * Period Lock
     * <p>
     * Lineage reference object : RPRATRM_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    /**
     * Load
     * <p>
     * Lineage reference object : RPRATRM_PCKG_LOAD_IND
     * 
     */
    @JsonProperty("pckgLoadInd")
    public String getPckgLoadInd() {
        return pckgLoadInd;
    }

    /**
     * Load
     * <p>
     * Lineage reference object : RPRATRM_PCKG_LOAD_IND
     * 
     */
    @JsonProperty("pckgLoadInd")
    public void setPckgLoadInd(String pckgLoadInd) {
        this.pckgLoadInd = pckgLoadInd;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withPckgLoadInd(String pckgLoadInd) {
        this.pckgLoadInd = pckgLoadInd;
        return this;
    }

    /**
     * Finalized
     * <p>
     * Lineage reference object : RPRATRM_DISB_FINAL_IND
     * 
     */
    @JsonProperty("disbFinalInd")
    public String getDisbFinalInd() {
        return disbFinalInd;
    }

    /**
     * Finalized
     * <p>
     * Lineage reference object : RPRATRM_DISB_FINAL_IND
     * 
     */
    @JsonProperty("disbFinalInd")
    public void setDisbFinalInd(String disbFinalInd) {
        this.disbFinalInd = disbFinalInd;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withDisbFinalInd(String disbFinalInd) {
        this.disbFinalInd = disbFinalInd;
        return this;
    }

    /**
     * NSLDS Override
     * <p>
     * Lineage reference object : RPRATRM_NSLDS_OVRD_IND
     * 
     */
    @JsonProperty("nsldsOvrdInd")
    public String getNsldsOvrdInd() {
        return nsldsOvrdInd;
    }

    /**
     * NSLDS Override
     * <p>
     * Lineage reference object : RPRATRM_NSLDS_OVRD_IND
     * 
     */
    @JsonProperty("nsldsOvrdInd")
    public void setNsldsOvrdInd(String nsldsOvrdInd) {
        this.nsldsOvrdInd = nsldsOvrdInd;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withNsldsOvrdInd(String nsldsOvrdInd) {
        this.nsldsOvrdInd = nsldsOvrdInd;
        return this;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRATRM_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public Double getOfferAmt() {
        return offerAmt;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRATRM_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public void setOfferAmt(Double offerAmt) {
        this.offerAmt = offerAmt;
    }

    public AwardMaintenanceAwardSchedule100GetResponse withOfferAmt(Double offerAmt) {
        this.offerAmt = offerAmt;
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

    public AwardMaintenanceAwardSchedule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AwardMaintenanceAwardSchedule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bbayCode");
        sb.append('=');
        sb.append(((this.bbayCode == null)?"<null>":this.bbayCode));
        sb.append(',');
        sb.append("overrideDisbRule");
        sb.append('=');
        sb.append(((this.overrideDisbRule == null)?"<null>":this.overrideDisbRule));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("acceptAmt");
        sb.append('=');
        sb.append(((this.acceptAmt == null)?"<null>":this.acceptAmt));
        sb.append(',');
        sb.append("displayRprawrdAwstCode");
        sb.append('=');
        sb.append(((this.displayRprawrdAwstCode == null)?"<null>":this.displayRprawrdAwstCode));
        sb.append(',');
        sb.append("displayRpratrmDeccanAmt");
        sb.append('=');
        sb.append(((this.displayRpratrmDeccanAmt == null)?"<null>":this.displayRpratrmDeccanAmt));
        sb.append(',');
        sb.append("paidAmt");
        sb.append('=');
        sb.append(((this.paidAmt == null)?"<null>":this.paidAmt));
        sb.append(',');
        sb.append("displayLockInd");
        sb.append('=');
        sb.append(((this.displayLockInd == null)?"<null>":this.displayLockInd));
        sb.append(',');
        sb.append("majrOverrideCode");
        sb.append('=');
        sb.append(((this.majrOverrideCode == null)?"<null>":this.majrOverrideCode));
        sb.append(',');
        sb.append("awstCode");
        sb.append('=');
        sb.append(((this.awstCode == null)?"<null>":this.awstCode));
        sb.append(',');
        sb.append("pellAwrdLoadOpt");
        sb.append('=');
        sb.append(((this.pellAwrdLoadOpt == null)?"<null>":this.pellAwrdLoadOpt));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("displayRpratrmMemautAmt");
        sb.append('=');
        sb.append(((this.displayRpratrmMemautAmt == null)?"<null>":this.displayRpratrmMemautAmt));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
        sb.append(',');
        sb.append("pckgLoadInd");
        sb.append('=');
        sb.append(((this.pckgLoadInd == null)?"<null>":this.pckgLoadInd));
        sb.append(',');
        sb.append("disbFinalInd");
        sb.append('=');
        sb.append(((this.disbFinalInd == null)?"<null>":this.disbFinalInd));
        sb.append(',');
        sb.append("nsldsOvrdInd");
        sb.append('=');
        sb.append(((this.nsldsOvrdInd == null)?"<null>":this.nsldsOvrdInd));
        sb.append(',');
        sb.append("offerAmt");
        sb.append('=');
        sb.append(((this.offerAmt == null)?"<null>":this.offerAmt));
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
        result = ((result* 31)+((this.bbayCode == null)? 0 :this.bbayCode.hashCode()));
        result = ((result* 31)+((this.overrideDisbRule == null)? 0 :this.overrideDisbRule.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.acceptAmt == null)? 0 :this.acceptAmt.hashCode()));
        result = ((result* 31)+((this.displayRprawrdAwstCode == null)? 0 :this.displayRprawrdAwstCode.hashCode()));
        result = ((result* 31)+((this.displayRpratrmDeccanAmt == null)? 0 :this.displayRpratrmDeccanAmt.hashCode()));
        result = ((result* 31)+((this.paidAmt == null)? 0 :this.paidAmt.hashCode()));
        result = ((result* 31)+((this.displayLockInd == null)? 0 :this.displayLockInd.hashCode()));
        result = ((result* 31)+((this.majrOverrideCode == null)? 0 :this.majrOverrideCode.hashCode()));
        result = ((result* 31)+((this.awstCode == null)? 0 :this.awstCode.hashCode()));
        result = ((result* 31)+((this.pellAwrdLoadOpt == null)? 0 :this.pellAwrdLoadOpt.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.displayRpratrmMemautAmt == null)? 0 :this.displayRpratrmMemautAmt.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.pckgLoadInd == null)? 0 :this.pckgLoadInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.disbFinalInd == null)? 0 :this.disbFinalInd.hashCode()));
        result = ((result* 31)+((this.nsldsOvrdInd == null)? 0 :this.nsldsOvrdInd.hashCode()));
        result = ((result* 31)+((this.offerAmt == null)? 0 :this.offerAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwardMaintenanceAwardSchedule100GetResponse) == false) {
            return false;
        }
        AwardMaintenanceAwardSchedule100GetResponse rhs = ((AwardMaintenanceAwardSchedule100GetResponse) other);
        return ((((((((((((((((((((this.bbayCode == rhs.bbayCode)||((this.bbayCode!= null)&&this.bbayCode.equals(rhs.bbayCode)))&&((this.overrideDisbRule == rhs.overrideDisbRule)||((this.overrideDisbRule!= null)&&this.overrideDisbRule.equals(rhs.overrideDisbRule))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.acceptAmt == rhs.acceptAmt)||((this.acceptAmt!= null)&&this.acceptAmt.equals(rhs.acceptAmt))))&&((this.displayRprawrdAwstCode == rhs.displayRprawrdAwstCode)||((this.displayRprawrdAwstCode!= null)&&this.displayRprawrdAwstCode.equals(rhs.displayRprawrdAwstCode))))&&((this.displayRpratrmDeccanAmt == rhs.displayRpratrmDeccanAmt)||((this.displayRpratrmDeccanAmt!= null)&&this.displayRpratrmDeccanAmt.equals(rhs.displayRpratrmDeccanAmt))))&&((this.paidAmt == rhs.paidAmt)||((this.paidAmt!= null)&&this.paidAmt.equals(rhs.paidAmt))))&&((this.displayLockInd == rhs.displayLockInd)||((this.displayLockInd!= null)&&this.displayLockInd.equals(rhs.displayLockInd))))&&((this.majrOverrideCode == rhs.majrOverrideCode)||((this.majrOverrideCode!= null)&&this.majrOverrideCode.equals(rhs.majrOverrideCode))))&&((this.awstCode == rhs.awstCode)||((this.awstCode!= null)&&this.awstCode.equals(rhs.awstCode))))&&((this.pellAwrdLoadOpt == rhs.pellAwrdLoadOpt)||((this.pellAwrdLoadOpt!= null)&&this.pellAwrdLoadOpt.equals(rhs.pellAwrdLoadOpt))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.displayRpratrmMemautAmt == rhs.displayRpratrmMemautAmt)||((this.displayRpratrmMemautAmt!= null)&&this.displayRpratrmMemautAmt.equals(rhs.displayRpratrmMemautAmt))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.pckgLoadInd == rhs.pckgLoadInd)||((this.pckgLoadInd!= null)&&this.pckgLoadInd.equals(rhs.pckgLoadInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.disbFinalInd == rhs.disbFinalInd)||((this.disbFinalInd!= null)&&this.disbFinalInd.equals(rhs.disbFinalInd))))&&((this.nsldsOvrdInd == rhs.nsldsOvrdInd)||((this.nsldsOvrdInd!= null)&&this.nsldsOvrdInd.equals(rhs.nsldsOvrdInd))))&&((this.offerAmt == rhs.offerAmt)||((this.offerAmt!= null)&&this.offerAmt.equals(rhs.offerAmt))));
    }

}
