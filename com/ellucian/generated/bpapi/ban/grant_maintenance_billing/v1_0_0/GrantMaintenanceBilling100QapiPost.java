
package com.ellucian.generated.bpapi.ban.grant_maintenance_billing.v1_0_0;

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
    "displayFrbgrntCode",
    "displayPropCode",
    "pmscCode",
    "lastInvSeqNo",
    "beclCode",
    "bfrmCode1034Ext",
    "budgetLimitInd",
    "budLineExceedInd",
    "paymentFundCode",
    "minNotReachedInd",
    "paymentAcctCode",
    "budTotalExceedInd",
    "clearingAcctCode",
    "budCheckSourceInd",
    "addrType",
    "billingStartDate",
    "addrSeqno",
    "billingEndDate",
    "billingMinAmt",
    "billingMaxAmt",
    "cumulativeBilledAmt",
    "deferredAcctCode"
})
@Generated("jsonschema2pojo")
public class GrantMaintenanceBilling100QapiPost {

    @JsonProperty("displayFrbgrntCode")
    private String displayFrbgrntCode;
    @JsonProperty("displayPropCode")
    private String displayPropCode;
    /**
     * PMS Code
     * <p>
     * Lineage reference object : FRBGBIL_PMSC_CODE, Lookup lineage reference object : frvpmsc
     * 
     */
    @JsonProperty("pmscCode")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_PMSC_CODE, Lookup lineage reference object : frvpmsc")
    private String pmscCode;
    /**
     * Last Invoice Number
     * <p>
     * Lineage reference object : FRBGBIL_LAST_INV_SEQ_NO
     * 
     */
    @JsonProperty("lastInvSeqNo")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_LAST_INV_SEQ_NO")
    private Double lastInvSeqNo;
    /**
     * Billing Exclusion Code
     * <p>
     * Lineage reference object : FRBGBIL_BECL_CODE
     * 
     */
    @JsonProperty("beclCode")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BECL_CODE")
    private String beclCode;
    /**
     *  1034 Billing Format Extension
     * <p>
     * Lineage reference object : FRBGBIL_BFRM_CODE_1034_EXT
     * 
     */
    @JsonProperty("bfrmCode1034Ext")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BFRM_CODE_1034_EXT")
    private String bfrmCode1034Ext;
    /**
     * Budget Limit Indicator
     * <p>
     * Lineage reference object : FRBGBIL_BUDGET_LIMIT_IND
     * 
     */
    @JsonProperty("budgetLimitInd")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BUDGET_LIMIT_IND")
    private String budgetLimitInd;
    /**
     * Bill If Budget Line Exceeded
     * <p>
     * Lineage reference object : FRBGBIL_BUD_LINE_EXCEED_IND
     * 
     */
    @JsonProperty("budLineExceedInd")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BUD_LINE_EXCEED_IND")
    private String budLineExceedInd;
    /**
     * Payment Fund Code
     * <p>
     * Lineage reference object : FRBGBIL_PAYMENT_FUND_CODE
     * 
     */
    @JsonProperty("paymentFundCode")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_PAYMENT_FUND_CODE")
    private String paymentFundCode;
    /**
     * Bill If Minimum Not Reached
     * <p>
     * Lineage reference object : FRBGBIL_MIN_NOT_REACHED_IND
     * 
     */
    @JsonProperty("minNotReachedInd")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_MIN_NOT_REACHED_IND")
    private String minNotReachedInd;
    /**
     * Undistributed Cash Receipt Account
     * <p>
     * Lineage reference object : FRBGBIL_PAYMENT_ACCT_CODE
     * 
     */
    @JsonProperty("paymentAcctCode")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_PAYMENT_ACCT_CODE")
    private String paymentAcctCode;
    /**
     * Bill If Budget Total Exceeded
     * <p>
     * Lineage reference object : FRBGBIL_BUD_TOTAL_EXCEED_IND
     * 
     */
    @JsonProperty("budTotalExceedInd")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BUD_TOTAL_EXCEED_IND")
    private String budTotalExceedInd;
    /**
     * Refund Clearing Account
     * <p>
     * Lineage reference object : FRBGBIL_CLEARING_ACCT_CODE
     * 
     */
    @JsonProperty("clearingAcctCode")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_CLEARING_ACCT_CODE")
    private String clearingAcctCode;
    /**
     * Budget Check Source
     * <p>
     * Lineage reference object : FRBGBIL_BUD_CHECK_SOURCE_IND
     * 
     */
    @JsonProperty("budCheckSourceInd")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BUD_CHECK_SOURCE_IND")
    private String budCheckSourceInd;
    /**
     * Billing Address Type
     * <p>
     * Lineage reference object : FRBGBIL_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_ADDR_TYPE, Lookup lineage reference object : stvatyp")
    private String addrType;
    /**
     * Billing Start Date
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_START_DATE
     * 
     */
    @JsonProperty("billingStartDate")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BILLING_START_DATE")
    private Date billingStartDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FRBGBIL_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_ADDR_SEQNO")
    private Double addrSeqno;
    /**
     * Billing End Date
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_END_DATE
     * 
     */
    @JsonProperty("billingEndDate")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BILLING_END_DATE")
    private Date billingEndDate;
    /**
     * Minimum
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_MIN_AMT
     * 
     */
    @JsonProperty("billingMinAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BILLING_MIN_AMT")
    private Double billingMinAmt;
    /**
     * Maximum
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_MAX_AMT
     * 
     */
    @JsonProperty("billingMaxAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_BILLING_MAX_AMT")
    private Double billingMaxAmt;
    /**
     * Cumulative
     * <p>
     * Lineage reference object : FRBGBIL_CUMULATIVE_BILLED_AMT
     * 
     */
    @JsonProperty("cumulativeBilledAmt")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_CUMULATIVE_BILLED_AMT")
    private Double cumulativeBilledAmt;
    /**
     * Deferred Account Code
     * <p>
     * Lineage reference object : FRBGBIL_DEFERRED_ACCT_CODE
     * 
     */
    @JsonProperty("deferredAcctCode")
    @JsonPropertyDescription("Lineage reference object : FRBGBIL_DEFERRED_ACCT_CODE")
    private String deferredAcctCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayFrbgrntCode")
    public String getDisplayFrbgrntCode() {
        return displayFrbgrntCode;
    }

    @JsonProperty("displayFrbgrntCode")
    public void setDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
    }

    public GrantMaintenanceBilling100QapiPost withDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
        return this;
    }

    @JsonProperty("displayPropCode")
    public String getDisplayPropCode() {
        return displayPropCode;
    }

    @JsonProperty("displayPropCode")
    public void setDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
    }

    public GrantMaintenanceBilling100QapiPost withDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
        return this;
    }

    /**
     * PMS Code
     * <p>
     * Lineage reference object : FRBGBIL_PMSC_CODE, Lookup lineage reference object : frvpmsc
     * 
     */
    @JsonProperty("pmscCode")
    public String getPmscCode() {
        return pmscCode;
    }

    /**
     * PMS Code
     * <p>
     * Lineage reference object : FRBGBIL_PMSC_CODE, Lookup lineage reference object : frvpmsc
     * 
     */
    @JsonProperty("pmscCode")
    public void setPmscCode(String pmscCode) {
        this.pmscCode = pmscCode;
    }

    public GrantMaintenanceBilling100QapiPost withPmscCode(String pmscCode) {
        this.pmscCode = pmscCode;
        return this;
    }

    /**
     * Last Invoice Number
     * <p>
     * Lineage reference object : FRBGBIL_LAST_INV_SEQ_NO
     * 
     */
    @JsonProperty("lastInvSeqNo")
    public Double getLastInvSeqNo() {
        return lastInvSeqNo;
    }

    /**
     * Last Invoice Number
     * <p>
     * Lineage reference object : FRBGBIL_LAST_INV_SEQ_NO
     * 
     */
    @JsonProperty("lastInvSeqNo")
    public void setLastInvSeqNo(Double lastInvSeqNo) {
        this.lastInvSeqNo = lastInvSeqNo;
    }

    public GrantMaintenanceBilling100QapiPost withLastInvSeqNo(Double lastInvSeqNo) {
        this.lastInvSeqNo = lastInvSeqNo;
        return this;
    }

    /**
     * Billing Exclusion Code
     * <p>
     * Lineage reference object : FRBGBIL_BECL_CODE
     * 
     */
    @JsonProperty("beclCode")
    public String getBeclCode() {
        return beclCode;
    }

    /**
     * Billing Exclusion Code
     * <p>
     * Lineage reference object : FRBGBIL_BECL_CODE
     * 
     */
    @JsonProperty("beclCode")
    public void setBeclCode(String beclCode) {
        this.beclCode = beclCode;
    }

    public GrantMaintenanceBilling100QapiPost withBeclCode(String beclCode) {
        this.beclCode = beclCode;
        return this;
    }

    /**
     *  1034 Billing Format Extension
     * <p>
     * Lineage reference object : FRBGBIL_BFRM_CODE_1034_EXT
     * 
     */
    @JsonProperty("bfrmCode1034Ext")
    public String getBfrmCode1034Ext() {
        return bfrmCode1034Ext;
    }

    /**
     *  1034 Billing Format Extension
     * <p>
     * Lineage reference object : FRBGBIL_BFRM_CODE_1034_EXT
     * 
     */
    @JsonProperty("bfrmCode1034Ext")
    public void setBfrmCode1034Ext(String bfrmCode1034Ext) {
        this.bfrmCode1034Ext = bfrmCode1034Ext;
    }

    public GrantMaintenanceBilling100QapiPost withBfrmCode1034Ext(String bfrmCode1034Ext) {
        this.bfrmCode1034Ext = bfrmCode1034Ext;
        return this;
    }

    /**
     * Budget Limit Indicator
     * <p>
     * Lineage reference object : FRBGBIL_BUDGET_LIMIT_IND
     * 
     */
    @JsonProperty("budgetLimitInd")
    public String getBudgetLimitInd() {
        return budgetLimitInd;
    }

    /**
     * Budget Limit Indicator
     * <p>
     * Lineage reference object : FRBGBIL_BUDGET_LIMIT_IND
     * 
     */
    @JsonProperty("budgetLimitInd")
    public void setBudgetLimitInd(String budgetLimitInd) {
        this.budgetLimitInd = budgetLimitInd;
    }

    public GrantMaintenanceBilling100QapiPost withBudgetLimitInd(String budgetLimitInd) {
        this.budgetLimitInd = budgetLimitInd;
        return this;
    }

    /**
     * Bill If Budget Line Exceeded
     * <p>
     * Lineage reference object : FRBGBIL_BUD_LINE_EXCEED_IND
     * 
     */
    @JsonProperty("budLineExceedInd")
    public String getBudLineExceedInd() {
        return budLineExceedInd;
    }

    /**
     * Bill If Budget Line Exceeded
     * <p>
     * Lineage reference object : FRBGBIL_BUD_LINE_EXCEED_IND
     * 
     */
    @JsonProperty("budLineExceedInd")
    public void setBudLineExceedInd(String budLineExceedInd) {
        this.budLineExceedInd = budLineExceedInd;
    }

    public GrantMaintenanceBilling100QapiPost withBudLineExceedInd(String budLineExceedInd) {
        this.budLineExceedInd = budLineExceedInd;
        return this;
    }

    /**
     * Payment Fund Code
     * <p>
     * Lineage reference object : FRBGBIL_PAYMENT_FUND_CODE
     * 
     */
    @JsonProperty("paymentFundCode")
    public String getPaymentFundCode() {
        return paymentFundCode;
    }

    /**
     * Payment Fund Code
     * <p>
     * Lineage reference object : FRBGBIL_PAYMENT_FUND_CODE
     * 
     */
    @JsonProperty("paymentFundCode")
    public void setPaymentFundCode(String paymentFundCode) {
        this.paymentFundCode = paymentFundCode;
    }

    public GrantMaintenanceBilling100QapiPost withPaymentFundCode(String paymentFundCode) {
        this.paymentFundCode = paymentFundCode;
        return this;
    }

    /**
     * Bill If Minimum Not Reached
     * <p>
     * Lineage reference object : FRBGBIL_MIN_NOT_REACHED_IND
     * 
     */
    @JsonProperty("minNotReachedInd")
    public String getMinNotReachedInd() {
        return minNotReachedInd;
    }

    /**
     * Bill If Minimum Not Reached
     * <p>
     * Lineage reference object : FRBGBIL_MIN_NOT_REACHED_IND
     * 
     */
    @JsonProperty("minNotReachedInd")
    public void setMinNotReachedInd(String minNotReachedInd) {
        this.minNotReachedInd = minNotReachedInd;
    }

    public GrantMaintenanceBilling100QapiPost withMinNotReachedInd(String minNotReachedInd) {
        this.minNotReachedInd = minNotReachedInd;
        return this;
    }

    /**
     * Undistributed Cash Receipt Account
     * <p>
     * Lineage reference object : FRBGBIL_PAYMENT_ACCT_CODE
     * 
     */
    @JsonProperty("paymentAcctCode")
    public String getPaymentAcctCode() {
        return paymentAcctCode;
    }

    /**
     * Undistributed Cash Receipt Account
     * <p>
     * Lineage reference object : FRBGBIL_PAYMENT_ACCT_CODE
     * 
     */
    @JsonProperty("paymentAcctCode")
    public void setPaymentAcctCode(String paymentAcctCode) {
        this.paymentAcctCode = paymentAcctCode;
    }

    public GrantMaintenanceBilling100QapiPost withPaymentAcctCode(String paymentAcctCode) {
        this.paymentAcctCode = paymentAcctCode;
        return this;
    }

    /**
     * Bill If Budget Total Exceeded
     * <p>
     * Lineage reference object : FRBGBIL_BUD_TOTAL_EXCEED_IND
     * 
     */
    @JsonProperty("budTotalExceedInd")
    public String getBudTotalExceedInd() {
        return budTotalExceedInd;
    }

    /**
     * Bill If Budget Total Exceeded
     * <p>
     * Lineage reference object : FRBGBIL_BUD_TOTAL_EXCEED_IND
     * 
     */
    @JsonProperty("budTotalExceedInd")
    public void setBudTotalExceedInd(String budTotalExceedInd) {
        this.budTotalExceedInd = budTotalExceedInd;
    }

    public GrantMaintenanceBilling100QapiPost withBudTotalExceedInd(String budTotalExceedInd) {
        this.budTotalExceedInd = budTotalExceedInd;
        return this;
    }

    /**
     * Refund Clearing Account
     * <p>
     * Lineage reference object : FRBGBIL_CLEARING_ACCT_CODE
     * 
     */
    @JsonProperty("clearingAcctCode")
    public String getClearingAcctCode() {
        return clearingAcctCode;
    }

    /**
     * Refund Clearing Account
     * <p>
     * Lineage reference object : FRBGBIL_CLEARING_ACCT_CODE
     * 
     */
    @JsonProperty("clearingAcctCode")
    public void setClearingAcctCode(String clearingAcctCode) {
        this.clearingAcctCode = clearingAcctCode;
    }

    public GrantMaintenanceBilling100QapiPost withClearingAcctCode(String clearingAcctCode) {
        this.clearingAcctCode = clearingAcctCode;
        return this;
    }

    /**
     * Budget Check Source
     * <p>
     * Lineage reference object : FRBGBIL_BUD_CHECK_SOURCE_IND
     * 
     */
    @JsonProperty("budCheckSourceInd")
    public String getBudCheckSourceInd() {
        return budCheckSourceInd;
    }

    /**
     * Budget Check Source
     * <p>
     * Lineage reference object : FRBGBIL_BUD_CHECK_SOURCE_IND
     * 
     */
    @JsonProperty("budCheckSourceInd")
    public void setBudCheckSourceInd(String budCheckSourceInd) {
        this.budCheckSourceInd = budCheckSourceInd;
    }

    public GrantMaintenanceBilling100QapiPost withBudCheckSourceInd(String budCheckSourceInd) {
        this.budCheckSourceInd = budCheckSourceInd;
        return this;
    }

    /**
     * Billing Address Type
     * <p>
     * Lineage reference object : FRBGBIL_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    public String getAddrType() {
        return addrType;
    }

    /**
     * Billing Address Type
     * <p>
     * Lineage reference object : FRBGBIL_ADDR_TYPE, Lookup lineage reference object : stvatyp
     * 
     */
    @JsonProperty("addrType")
    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    public GrantMaintenanceBilling100QapiPost withAddrType(String addrType) {
        this.addrType = addrType;
        return this;
    }

    /**
     * Billing Start Date
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_START_DATE
     * 
     */
    @JsonProperty("billingStartDate")
    public Date getBillingStartDate() {
        return billingStartDate;
    }

    /**
     * Billing Start Date
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_START_DATE
     * 
     */
    @JsonProperty("billingStartDate")
    public void setBillingStartDate(Date billingStartDate) {
        this.billingStartDate = billingStartDate;
    }

    public GrantMaintenanceBilling100QapiPost withBillingStartDate(Date billingStartDate) {
        this.billingStartDate = billingStartDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FRBGBIL_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public Double getAddrSeqno() {
        return addrSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : FRBGBIL_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public void setAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
    }

    public GrantMaintenanceBilling100QapiPost withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
        return this;
    }

    /**
     * Billing End Date
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_END_DATE
     * 
     */
    @JsonProperty("billingEndDate")
    public Date getBillingEndDate() {
        return billingEndDate;
    }

    /**
     * Billing End Date
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_END_DATE
     * 
     */
    @JsonProperty("billingEndDate")
    public void setBillingEndDate(Date billingEndDate) {
        this.billingEndDate = billingEndDate;
    }

    public GrantMaintenanceBilling100QapiPost withBillingEndDate(Date billingEndDate) {
        this.billingEndDate = billingEndDate;
        return this;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_MIN_AMT
     * 
     */
    @JsonProperty("billingMinAmt")
    public Double getBillingMinAmt() {
        return billingMinAmt;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_MIN_AMT
     * 
     */
    @JsonProperty("billingMinAmt")
    public void setBillingMinAmt(Double billingMinAmt) {
        this.billingMinAmt = billingMinAmt;
    }

    public GrantMaintenanceBilling100QapiPost withBillingMinAmt(Double billingMinAmt) {
        this.billingMinAmt = billingMinAmt;
        return this;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_MAX_AMT
     * 
     */
    @JsonProperty("billingMaxAmt")
    public Double getBillingMaxAmt() {
        return billingMaxAmt;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : FRBGBIL_BILLING_MAX_AMT
     * 
     */
    @JsonProperty("billingMaxAmt")
    public void setBillingMaxAmt(Double billingMaxAmt) {
        this.billingMaxAmt = billingMaxAmt;
    }

    public GrantMaintenanceBilling100QapiPost withBillingMaxAmt(Double billingMaxAmt) {
        this.billingMaxAmt = billingMaxAmt;
        return this;
    }

    /**
     * Cumulative
     * <p>
     * Lineage reference object : FRBGBIL_CUMULATIVE_BILLED_AMT
     * 
     */
    @JsonProperty("cumulativeBilledAmt")
    public Double getCumulativeBilledAmt() {
        return cumulativeBilledAmt;
    }

    /**
     * Cumulative
     * <p>
     * Lineage reference object : FRBGBIL_CUMULATIVE_BILLED_AMT
     * 
     */
    @JsonProperty("cumulativeBilledAmt")
    public void setCumulativeBilledAmt(Double cumulativeBilledAmt) {
        this.cumulativeBilledAmt = cumulativeBilledAmt;
    }

    public GrantMaintenanceBilling100QapiPost withCumulativeBilledAmt(Double cumulativeBilledAmt) {
        this.cumulativeBilledAmt = cumulativeBilledAmt;
        return this;
    }

    /**
     * Deferred Account Code
     * <p>
     * Lineage reference object : FRBGBIL_DEFERRED_ACCT_CODE
     * 
     */
    @JsonProperty("deferredAcctCode")
    public String getDeferredAcctCode() {
        return deferredAcctCode;
    }

    /**
     * Deferred Account Code
     * <p>
     * Lineage reference object : FRBGBIL_DEFERRED_ACCT_CODE
     * 
     */
    @JsonProperty("deferredAcctCode")
    public void setDeferredAcctCode(String deferredAcctCode) {
        this.deferredAcctCode = deferredAcctCode;
    }

    public GrantMaintenanceBilling100QapiPost withDeferredAcctCode(String deferredAcctCode) {
        this.deferredAcctCode = deferredAcctCode;
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

    public GrantMaintenanceBilling100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenanceBilling100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayFrbgrntCode");
        sb.append('=');
        sb.append(((this.displayFrbgrntCode == null)?"<null>":this.displayFrbgrntCode));
        sb.append(',');
        sb.append("displayPropCode");
        sb.append('=');
        sb.append(((this.displayPropCode == null)?"<null>":this.displayPropCode));
        sb.append(',');
        sb.append("pmscCode");
        sb.append('=');
        sb.append(((this.pmscCode == null)?"<null>":this.pmscCode));
        sb.append(',');
        sb.append("lastInvSeqNo");
        sb.append('=');
        sb.append(((this.lastInvSeqNo == null)?"<null>":this.lastInvSeqNo));
        sb.append(',');
        sb.append("beclCode");
        sb.append('=');
        sb.append(((this.beclCode == null)?"<null>":this.beclCode));
        sb.append(',');
        sb.append("bfrmCode1034Ext");
        sb.append('=');
        sb.append(((this.bfrmCode1034Ext == null)?"<null>":this.bfrmCode1034Ext));
        sb.append(',');
        sb.append("budgetLimitInd");
        sb.append('=');
        sb.append(((this.budgetLimitInd == null)?"<null>":this.budgetLimitInd));
        sb.append(',');
        sb.append("budLineExceedInd");
        sb.append('=');
        sb.append(((this.budLineExceedInd == null)?"<null>":this.budLineExceedInd));
        sb.append(',');
        sb.append("paymentFundCode");
        sb.append('=');
        sb.append(((this.paymentFundCode == null)?"<null>":this.paymentFundCode));
        sb.append(',');
        sb.append("minNotReachedInd");
        sb.append('=');
        sb.append(((this.minNotReachedInd == null)?"<null>":this.minNotReachedInd));
        sb.append(',');
        sb.append("paymentAcctCode");
        sb.append('=');
        sb.append(((this.paymentAcctCode == null)?"<null>":this.paymentAcctCode));
        sb.append(',');
        sb.append("budTotalExceedInd");
        sb.append('=');
        sb.append(((this.budTotalExceedInd == null)?"<null>":this.budTotalExceedInd));
        sb.append(',');
        sb.append("clearingAcctCode");
        sb.append('=');
        sb.append(((this.clearingAcctCode == null)?"<null>":this.clearingAcctCode));
        sb.append(',');
        sb.append("budCheckSourceInd");
        sb.append('=');
        sb.append(((this.budCheckSourceInd == null)?"<null>":this.budCheckSourceInd));
        sb.append(',');
        sb.append("addrType");
        sb.append('=');
        sb.append(((this.addrType == null)?"<null>":this.addrType));
        sb.append(',');
        sb.append("billingStartDate");
        sb.append('=');
        sb.append(((this.billingStartDate == null)?"<null>":this.billingStartDate));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("billingEndDate");
        sb.append('=');
        sb.append(((this.billingEndDate == null)?"<null>":this.billingEndDate));
        sb.append(',');
        sb.append("billingMinAmt");
        sb.append('=');
        sb.append(((this.billingMinAmt == null)?"<null>":this.billingMinAmt));
        sb.append(',');
        sb.append("billingMaxAmt");
        sb.append('=');
        sb.append(((this.billingMaxAmt == null)?"<null>":this.billingMaxAmt));
        sb.append(',');
        sb.append("cumulativeBilledAmt");
        sb.append('=');
        sb.append(((this.cumulativeBilledAmt == null)?"<null>":this.cumulativeBilledAmt));
        sb.append(',');
        sb.append("deferredAcctCode");
        sb.append('=');
        sb.append(((this.deferredAcctCode == null)?"<null>":this.deferredAcctCode));
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
        result = ((result* 31)+((this.pmscCode == null)? 0 :this.pmscCode.hashCode()));
        result = ((result* 31)+((this.billingMinAmt == null)? 0 :this.billingMinAmt.hashCode()));
        result = ((result* 31)+((this.budTotalExceedInd == null)? 0 :this.budTotalExceedInd.hashCode()));
        result = ((result* 31)+((this.budLineExceedInd == null)? 0 :this.budLineExceedInd.hashCode()));
        result = ((result* 31)+((this.bfrmCode1034Ext == null)? 0 :this.bfrmCode1034Ext.hashCode()));
        result = ((result* 31)+((this.paymentAcctCode == null)? 0 :this.paymentAcctCode.hashCode()));
        result = ((result* 31)+((this.billingStartDate == null)? 0 :this.billingStartDate.hashCode()));
        result = ((result* 31)+((this.displayFrbgrntCode == null)? 0 :this.displayFrbgrntCode.hashCode()));
        result = ((result* 31)+((this.budCheckSourceInd == null)? 0 :this.budCheckSourceInd.hashCode()));
        result = ((result* 31)+((this.clearingAcctCode == null)? 0 :this.clearingAcctCode.hashCode()));
        result = ((result* 31)+((this.displayPropCode == null)? 0 :this.displayPropCode.hashCode()));
        result = ((result* 31)+((this.beclCode == null)? 0 :this.beclCode.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.deferredAcctCode == null)? 0 :this.deferredAcctCode.hashCode()));
        result = ((result* 31)+((this.billingEndDate == null)? 0 :this.billingEndDate.hashCode()));
        result = ((result* 31)+((this.budgetLimitInd == null)? 0 :this.budgetLimitInd.hashCode()));
        result = ((result* 31)+((this.billingMaxAmt == null)? 0 :this.billingMaxAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lastInvSeqNo == null)? 0 :this.lastInvSeqNo.hashCode()));
        result = ((result* 31)+((this.cumulativeBilledAmt == null)? 0 :this.cumulativeBilledAmt.hashCode()));
        result = ((result* 31)+((this.paymentFundCode == null)? 0 :this.paymentFundCode.hashCode()));
        result = ((result* 31)+((this.minNotReachedInd == null)? 0 :this.minNotReachedInd.hashCode()));
        result = ((result* 31)+((this.addrType == null)? 0 :this.addrType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantMaintenanceBilling100QapiPost) == false) {
            return false;
        }
        GrantMaintenanceBilling100QapiPost rhs = ((GrantMaintenanceBilling100QapiPost) other);
        return ((((((((((((((((((((((((this.pmscCode == rhs.pmscCode)||((this.pmscCode!= null)&&this.pmscCode.equals(rhs.pmscCode)))&&((this.billingMinAmt == rhs.billingMinAmt)||((this.billingMinAmt!= null)&&this.billingMinAmt.equals(rhs.billingMinAmt))))&&((this.budTotalExceedInd == rhs.budTotalExceedInd)||((this.budTotalExceedInd!= null)&&this.budTotalExceedInd.equals(rhs.budTotalExceedInd))))&&((this.budLineExceedInd == rhs.budLineExceedInd)||((this.budLineExceedInd!= null)&&this.budLineExceedInd.equals(rhs.budLineExceedInd))))&&((this.bfrmCode1034Ext == rhs.bfrmCode1034Ext)||((this.bfrmCode1034Ext!= null)&&this.bfrmCode1034Ext.equals(rhs.bfrmCode1034Ext))))&&((this.paymentAcctCode == rhs.paymentAcctCode)||((this.paymentAcctCode!= null)&&this.paymentAcctCode.equals(rhs.paymentAcctCode))))&&((this.billingStartDate == rhs.billingStartDate)||((this.billingStartDate!= null)&&this.billingStartDate.equals(rhs.billingStartDate))))&&((this.displayFrbgrntCode == rhs.displayFrbgrntCode)||((this.displayFrbgrntCode!= null)&&this.displayFrbgrntCode.equals(rhs.displayFrbgrntCode))))&&((this.budCheckSourceInd == rhs.budCheckSourceInd)||((this.budCheckSourceInd!= null)&&this.budCheckSourceInd.equals(rhs.budCheckSourceInd))))&&((this.clearingAcctCode == rhs.clearingAcctCode)||((this.clearingAcctCode!= null)&&this.clearingAcctCode.equals(rhs.clearingAcctCode))))&&((this.displayPropCode == rhs.displayPropCode)||((this.displayPropCode!= null)&&this.displayPropCode.equals(rhs.displayPropCode))))&&((this.beclCode == rhs.beclCode)||((this.beclCode!= null)&&this.beclCode.equals(rhs.beclCode))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.deferredAcctCode == rhs.deferredAcctCode)||((this.deferredAcctCode!= null)&&this.deferredAcctCode.equals(rhs.deferredAcctCode))))&&((this.billingEndDate == rhs.billingEndDate)||((this.billingEndDate!= null)&&this.billingEndDate.equals(rhs.billingEndDate))))&&((this.budgetLimitInd == rhs.budgetLimitInd)||((this.budgetLimitInd!= null)&&this.budgetLimitInd.equals(rhs.budgetLimitInd))))&&((this.billingMaxAmt == rhs.billingMaxAmt)||((this.billingMaxAmt!= null)&&this.billingMaxAmt.equals(rhs.billingMaxAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lastInvSeqNo == rhs.lastInvSeqNo)||((this.lastInvSeqNo!= null)&&this.lastInvSeqNo.equals(rhs.lastInvSeqNo))))&&((this.cumulativeBilledAmt == rhs.cumulativeBilledAmt)||((this.cumulativeBilledAmt!= null)&&this.cumulativeBilledAmt.equals(rhs.cumulativeBilledAmt))))&&((this.paymentFundCode == rhs.paymentFundCode)||((this.paymentFundCode!= null)&&this.paymentFundCode.equals(rhs.paymentFundCode))))&&((this.minNotReachedInd == rhs.minNotReachedInd)||((this.minNotReachedInd!= null)&&this.minNotReachedInd.equals(rhs.minNotReachedInd))))&&((this.addrType == rhs.addrType)||((this.addrType!= null)&&this.addrType.equals(rhs.addrType))));
    }

}
