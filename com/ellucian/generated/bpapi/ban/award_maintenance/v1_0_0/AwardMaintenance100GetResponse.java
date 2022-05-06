
package com.ellucian.generated.bpapi.ban.award_maintenance.v1_0_0;

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
    "fedLimitOvrdeInd",
    "acceptAmt",
    "displayMemautAmt",
    "infoAccessInd",
    "treqOvrdeInd",
    "sysInd",
    "paidAmt",
    "unmetNeedOvrdeInd",
    "fundDescription",
    "overrideFundRule",
    "replaceTfcOvrdeInd",
    "displayRescheduleInd",
    "awstCode",
    "fundCode",
    "fundLimitOvrdeInd",
    "lockInd",
    "displayDeccanAmt",
    "offerAmt"
})
@Generated("jsonschema2pojo")
public class AwardMaintenance100GetResponse {

    /**
     * Federal Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fedLimitOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND")
    private String fedLimitOvrdeInd;
    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_ACCEPT_AMT")
    private Double acceptAmt;
    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    private Double displayMemautAmt;
    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * Tracking Requirement Override
     * <p>
     * Lineage reference object : RPRAWRD_TREQ_OVRDE_IND
     * 
     */
    @JsonProperty("treqOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_TREQ_OVRDE_IND")
    private String treqOvrdeInd;
    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_SYS_IND")
    private String sysInd;
    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_PAID_AMT")
    private Double paidAmt;
    /**
     * Unmet Need Override
     * <p>
     * Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND
     * 
     */
    @JsonProperty("unmetNeedOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND")
    private String unmetNeedOvrdeInd;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    private String fundDescription;
    /**
     * Fund Award Rule Override
     * <p>
     * Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE
     * 
     */
    @JsonProperty("overrideFundRule")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE")
    private String overrideFundRule;
    /**
     * Replace EFC Override
     * <p>
     * Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND
     * 
     */
    @JsonProperty("replaceTfcOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND")
    private String replaceTfcOvrdeInd;
    @JsonProperty("displayRescheduleInd")
    private String displayRescheduleInd;
    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("awstCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst")
    private String awstCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String fundCode;
    /**
     * Fund Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fundLimitOvrdeInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND")
    private String fundLimitOvrdeInd;
    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_LOCK_IND")
    private String lockInd;
    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    private Double displayDeccanAmt;
    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    @JsonPropertyDescription("Lineage reference object : RPRAWRD_OFFER_AMT")
    private Double offerAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Federal Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fedLimitOvrdeInd")
    public String getFedLimitOvrdeInd() {
        return fedLimitOvrdeInd;
    }

    /**
     * Federal Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FED_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fedLimitOvrdeInd")
    public void setFedLimitOvrdeInd(String fedLimitOvrdeInd) {
        this.fedLimitOvrdeInd = fedLimitOvrdeInd;
    }

    public AwardMaintenance100GetResponse withFedLimitOvrdeInd(String fedLimitOvrdeInd) {
        this.fedLimitOvrdeInd = fedLimitOvrdeInd;
        return this;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public Double getAcceptAmt() {
        return acceptAmt;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : RPRAWRD_ACCEPT_AMT
     * 
     */
    @JsonProperty("acceptAmt")
    public void setAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
    }

    public AwardMaintenance100GetResponse withAcceptAmt(Double acceptAmt) {
        this.acceptAmt = acceptAmt;
        return this;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    public Double getDisplayMemautAmt() {
        return displayMemautAmt;
    }

    /**
     * Memoed or Authorized
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMemautAmt")
    public void setDisplayMemautAmt(Double displayMemautAmt) {
        this.displayMemautAmt = displayMemautAmt;
    }

    public AwardMaintenance100GetResponse withDisplayMemautAmt(Double displayMemautAmt) {
        this.displayMemautAmt = displayMemautAmt;
        return this;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RPRAWRD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public AwardMaintenance100GetResponse withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * Tracking Requirement Override
     * <p>
     * Lineage reference object : RPRAWRD_TREQ_OVRDE_IND
     * 
     */
    @JsonProperty("treqOvrdeInd")
    public String getTreqOvrdeInd() {
        return treqOvrdeInd;
    }

    /**
     * Tracking Requirement Override
     * <p>
     * Lineage reference object : RPRAWRD_TREQ_OVRDE_IND
     * 
     */
    @JsonProperty("treqOvrdeInd")
    public void setTreqOvrdeInd(String treqOvrdeInd) {
        this.treqOvrdeInd = treqOvrdeInd;
    }

    public AwardMaintenance100GetResponse withTreqOvrdeInd(String treqOvrdeInd) {
        this.treqOvrdeInd = treqOvrdeInd;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    public String getSysInd() {
        return sysInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RPRAWRD_SYS_IND
     * 
     */
    @JsonProperty("sysInd")
    public void setSysInd(String sysInd) {
        this.sysInd = sysInd;
    }

    public AwardMaintenance100GetResponse withSysInd(String sysInd) {
        this.sysInd = sysInd;
        return this;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public Double getPaidAmt() {
        return paidAmt;
    }

    /**
     * Paid
     * <p>
     * Lineage reference object : RPRAWRD_PAID_AMT
     * 
     */
    @JsonProperty("paidAmt")
    public void setPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
    }

    public AwardMaintenance100GetResponse withPaidAmt(Double paidAmt) {
        this.paidAmt = paidAmt;
        return this;
    }

    /**
     * Unmet Need Override
     * <p>
     * Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND
     * 
     */
    @JsonProperty("unmetNeedOvrdeInd")
    public String getUnmetNeedOvrdeInd() {
        return unmetNeedOvrdeInd;
    }

    /**
     * Unmet Need Override
     * <p>
     * Lineage reference object : RPRAWRD_UNMET_NEED_OVRDE_IND
     * 
     */
    @JsonProperty("unmetNeedOvrdeInd")
    public void setUnmetNeedOvrdeInd(String unmetNeedOvrdeInd) {
        this.unmetNeedOvrdeInd = unmetNeedOvrdeInd;
    }

    public AwardMaintenance100GetResponse withUnmetNeedOvrdeInd(String unmetNeedOvrdeInd) {
        this.unmetNeedOvrdeInd = unmetNeedOvrdeInd;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public String getFundDescription() {
        return fundDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fundDescription")
    public void setFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
    }

    public AwardMaintenance100GetResponse withFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
        return this;
    }

    /**
     * Fund Award Rule Override
     * <p>
     * Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE
     * 
     */
    @JsonProperty("overrideFundRule")
    public String getOverrideFundRule() {
        return overrideFundRule;
    }

    /**
     * Fund Award Rule Override
     * <p>
     * Lineage reference object : RPRAWRD_OVERRIDE_FUND_RULE
     * 
     */
    @JsonProperty("overrideFundRule")
    public void setOverrideFundRule(String overrideFundRule) {
        this.overrideFundRule = overrideFundRule;
    }

    public AwardMaintenance100GetResponse withOverrideFundRule(String overrideFundRule) {
        this.overrideFundRule = overrideFundRule;
        return this;
    }

    /**
     * Replace EFC Override
     * <p>
     * Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND
     * 
     */
    @JsonProperty("replaceTfcOvrdeInd")
    public String getReplaceTfcOvrdeInd() {
        return replaceTfcOvrdeInd;
    }

    /**
     * Replace EFC Override
     * <p>
     * Lineage reference object : RPRAWRD_REPLACE_TFC_OVRDE_IND
     * 
     */
    @JsonProperty("replaceTfcOvrdeInd")
    public void setReplaceTfcOvrdeInd(String replaceTfcOvrdeInd) {
        this.replaceTfcOvrdeInd = replaceTfcOvrdeInd;
    }

    public AwardMaintenance100GetResponse withReplaceTfcOvrdeInd(String replaceTfcOvrdeInd) {
        this.replaceTfcOvrdeInd = replaceTfcOvrdeInd;
        return this;
    }

    @JsonProperty("displayRescheduleInd")
    public String getDisplayRescheduleInd() {
        return displayRescheduleInd;
    }

    @JsonProperty("displayRescheduleInd")
    public void setDisplayRescheduleInd(String displayRescheduleInd) {
        this.displayRescheduleInd = displayRescheduleInd;
    }

    public AwardMaintenance100GetResponse withDisplayRescheduleInd(String displayRescheduleInd) {
        this.displayRescheduleInd = displayRescheduleInd;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("awstCode")
    public String getAwstCode() {
        return awstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RPRAWRD_AWST_CODE, Lookup lineage reference object : rtvawst
     * 
     */
    @JsonProperty("awstCode")
    public void setAwstCode(String awstCode) {
        this.awstCode = awstCode;
    }

    public AwardMaintenance100GetResponse withAwstCode(String awstCode) {
        this.awstCode = awstCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RPRAWRD_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public AwardMaintenance100GetResponse withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Fund Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fundLimitOvrdeInd")
    public String getFundLimitOvrdeInd() {
        return fundLimitOvrdeInd;
    }

    /**
     * Fund Limit Override
     * <p>
     * Lineage reference object : RPRAWRD_FUND_LIMIT_OVRDE_IND
     * 
     */
    @JsonProperty("fundLimitOvrdeInd")
    public void setFundLimitOvrdeInd(String fundLimitOvrdeInd) {
        this.fundLimitOvrdeInd = fundLimitOvrdeInd;
    }

    public AwardMaintenance100GetResponse withFundLimitOvrdeInd(String fundLimitOvrdeInd) {
        this.fundLimitOvrdeInd = fundLimitOvrdeInd;
        return this;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    /**
     * Lock
     * <p>
     * Lineage reference object : RPRAWRD_LOCK_IND
     * (Required)
     * 
     */
    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public AwardMaintenance100GetResponse withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    public Double getDisplayDeccanAmt() {
        return displayDeccanAmt;
    }

    /**
     * Declined or Cancelled
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDeccanAmt")
    public void setDisplayDeccanAmt(Double displayDeccanAmt) {
        this.displayDeccanAmt = displayDeccanAmt;
    }

    public AwardMaintenance100GetResponse withDisplayDeccanAmt(Double displayDeccanAmt) {
        this.displayDeccanAmt = displayDeccanAmt;
        return this;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public Double getOfferAmt() {
        return offerAmt;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : RPRAWRD_OFFER_AMT
     * 
     */
    @JsonProperty("offerAmt")
    public void setOfferAmt(Double offerAmt) {
        this.offerAmt = offerAmt;
    }

    public AwardMaintenance100GetResponse withOfferAmt(Double offerAmt) {
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

    public AwardMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AwardMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fedLimitOvrdeInd");
        sb.append('=');
        sb.append(((this.fedLimitOvrdeInd == null)?"<null>":this.fedLimitOvrdeInd));
        sb.append(',');
        sb.append("acceptAmt");
        sb.append('=');
        sb.append(((this.acceptAmt == null)?"<null>":this.acceptAmt));
        sb.append(',');
        sb.append("displayMemautAmt");
        sb.append('=');
        sb.append(((this.displayMemautAmt == null)?"<null>":this.displayMemautAmt));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("treqOvrdeInd");
        sb.append('=');
        sb.append(((this.treqOvrdeInd == null)?"<null>":this.treqOvrdeInd));
        sb.append(',');
        sb.append("sysInd");
        sb.append('=');
        sb.append(((this.sysInd == null)?"<null>":this.sysInd));
        sb.append(',');
        sb.append("paidAmt");
        sb.append('=');
        sb.append(((this.paidAmt == null)?"<null>":this.paidAmt));
        sb.append(',');
        sb.append("unmetNeedOvrdeInd");
        sb.append('=');
        sb.append(((this.unmetNeedOvrdeInd == null)?"<null>":this.unmetNeedOvrdeInd));
        sb.append(',');
        sb.append("fundDescription");
        sb.append('=');
        sb.append(((this.fundDescription == null)?"<null>":this.fundDescription));
        sb.append(',');
        sb.append("overrideFundRule");
        sb.append('=');
        sb.append(((this.overrideFundRule == null)?"<null>":this.overrideFundRule));
        sb.append(',');
        sb.append("replaceTfcOvrdeInd");
        sb.append('=');
        sb.append(((this.replaceTfcOvrdeInd == null)?"<null>":this.replaceTfcOvrdeInd));
        sb.append(',');
        sb.append("displayRescheduleInd");
        sb.append('=');
        sb.append(((this.displayRescheduleInd == null)?"<null>":this.displayRescheduleInd));
        sb.append(',');
        sb.append("awstCode");
        sb.append('=');
        sb.append(((this.awstCode == null)?"<null>":this.awstCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("fundLimitOvrdeInd");
        sb.append('=');
        sb.append(((this.fundLimitOvrdeInd == null)?"<null>":this.fundLimitOvrdeInd));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
        sb.append(',');
        sb.append("displayDeccanAmt");
        sb.append('=');
        sb.append(((this.displayDeccanAmt == null)?"<null>":this.displayDeccanAmt));
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
        result = ((result* 31)+((this.fedLimitOvrdeInd == null)? 0 :this.fedLimitOvrdeInd.hashCode()));
        result = ((result* 31)+((this.acceptAmt == null)? 0 :this.acceptAmt.hashCode()));
        result = ((result* 31)+((this.displayMemautAmt == null)? 0 :this.displayMemautAmt.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.treqOvrdeInd == null)? 0 :this.treqOvrdeInd.hashCode()));
        result = ((result* 31)+((this.sysInd == null)? 0 :this.sysInd.hashCode()));
        result = ((result* 31)+((this.paidAmt == null)? 0 :this.paidAmt.hashCode()));
        result = ((result* 31)+((this.unmetNeedOvrdeInd == null)? 0 :this.unmetNeedOvrdeInd.hashCode()));
        result = ((result* 31)+((this.fundDescription == null)? 0 :this.fundDescription.hashCode()));
        result = ((result* 31)+((this.overrideFundRule == null)? 0 :this.overrideFundRule.hashCode()));
        result = ((result* 31)+((this.replaceTfcOvrdeInd == null)? 0 :this.replaceTfcOvrdeInd.hashCode()));
        result = ((result* 31)+((this.displayRescheduleInd == null)? 0 :this.displayRescheduleInd.hashCode()));
        result = ((result* 31)+((this.awstCode == null)? 0 :this.awstCode.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.fundLimitOvrdeInd == null)? 0 :this.fundLimitOvrdeInd.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayDeccanAmt == null)? 0 :this.displayDeccanAmt.hashCode()));
        result = ((result* 31)+((this.offerAmt == null)? 0 :this.offerAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwardMaintenance100GetResponse) == false) {
            return false;
        }
        AwardMaintenance100GetResponse rhs = ((AwardMaintenance100GetResponse) other);
        return ((((((((((((((((((((this.fedLimitOvrdeInd == rhs.fedLimitOvrdeInd)||((this.fedLimitOvrdeInd!= null)&&this.fedLimitOvrdeInd.equals(rhs.fedLimitOvrdeInd)))&&((this.acceptAmt == rhs.acceptAmt)||((this.acceptAmt!= null)&&this.acceptAmt.equals(rhs.acceptAmt))))&&((this.displayMemautAmt == rhs.displayMemautAmt)||((this.displayMemautAmt!= null)&&this.displayMemautAmt.equals(rhs.displayMemautAmt))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.treqOvrdeInd == rhs.treqOvrdeInd)||((this.treqOvrdeInd!= null)&&this.treqOvrdeInd.equals(rhs.treqOvrdeInd))))&&((this.sysInd == rhs.sysInd)||((this.sysInd!= null)&&this.sysInd.equals(rhs.sysInd))))&&((this.paidAmt == rhs.paidAmt)||((this.paidAmt!= null)&&this.paidAmt.equals(rhs.paidAmt))))&&((this.unmetNeedOvrdeInd == rhs.unmetNeedOvrdeInd)||((this.unmetNeedOvrdeInd!= null)&&this.unmetNeedOvrdeInd.equals(rhs.unmetNeedOvrdeInd))))&&((this.fundDescription == rhs.fundDescription)||((this.fundDescription!= null)&&this.fundDescription.equals(rhs.fundDescription))))&&((this.overrideFundRule == rhs.overrideFundRule)||((this.overrideFundRule!= null)&&this.overrideFundRule.equals(rhs.overrideFundRule))))&&((this.replaceTfcOvrdeInd == rhs.replaceTfcOvrdeInd)||((this.replaceTfcOvrdeInd!= null)&&this.replaceTfcOvrdeInd.equals(rhs.replaceTfcOvrdeInd))))&&((this.displayRescheduleInd == rhs.displayRescheduleInd)||((this.displayRescheduleInd!= null)&&this.displayRescheduleInd.equals(rhs.displayRescheduleInd))))&&((this.awstCode == rhs.awstCode)||((this.awstCode!= null)&&this.awstCode.equals(rhs.awstCode))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.fundLimitOvrdeInd == rhs.fundLimitOvrdeInd)||((this.fundLimitOvrdeInd!= null)&&this.fundLimitOvrdeInd.equals(rhs.fundLimitOvrdeInd))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayDeccanAmt == rhs.displayDeccanAmt)||((this.displayDeccanAmt!= null)&&this.displayDeccanAmt.equals(rhs.displayDeccanAmt))))&&((this.offerAmt == rhs.offerAmt)||((this.offerAmt!= null)&&this.offerAmt.equals(rhs.offerAmt))));
    }

}
