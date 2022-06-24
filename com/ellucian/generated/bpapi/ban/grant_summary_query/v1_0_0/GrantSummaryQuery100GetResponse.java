
package com.ellucian.generated.bpapi.ban.grant_summary_query.v1_0_0;

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
    "unbilledChargesAmt",
    "grossBillingAmt",
    "refundTotalAmt",
    "witholdChrgTotalAmt",
    "billedTotalAmt3160",
    "witholdPmtTotalAmt",
    "netBillingAmt",
    "billedTotalAmt030",
    "unbilledTotalAmt",
    "netDueAmt",
    "totalOutstandingAmt",
    "paymentsTotalAmt",
    "billedTotalAmt90",
    "billedTotalAmt6190",
    "billedTotalAmtSt",
    "grantTotalAmt",
    "holdChargesAmt"
})
@Generated("jsonschema2pojo")
public class GrantSummaryQuery100GetResponse {

    /**
     * +  Unbilled Charges
     * <p>
     * Lineage reference object : unbilledChargesAmt
     * 
     */
    @JsonProperty("unbilledChargesAmt")
    @JsonPropertyDescription("Lineage reference object : unbilledChargesAmt")
    private Double unbilledChargesAmt;
    /**
     * Gross Billing
     * <p>
     * Lineage reference object : grossBillingAmt
     * 
     */
    @JsonProperty("grossBillingAmt")
    @JsonPropertyDescription("Lineage reference object : grossBillingAmt")
    private Double grossBillingAmt;
    /**
     * +  Refunds
     * <p>
     * Lineage reference object : refundTotalAmt
     * 
     */
    @JsonProperty("refundTotalAmt")
    @JsonPropertyDescription("Lineage reference object : refundTotalAmt")
    private Double refundTotalAmt;
    /**
     * -  Retainage Withholding
     * <p>
     * Lineage reference object : witholdChrgTotalAmt
     * 
     */
    @JsonProperty("witholdChrgTotalAmt")
    @JsonPropertyDescription("Lineage reference object : witholdChrgTotalAmt")
    private Double witholdChrgTotalAmt;
    /**
     *  31 - 60
     * <p>
     * Lineage reference object : billedTotalAmt3160
     * 
     */
    @JsonProperty("billedTotalAmt3160")
    @JsonPropertyDescription("Lineage reference object : billedTotalAmt3160")
    private Double billedTotalAmt3160;
    /**
     * Payment Withholding
     * <p>
     * Lineage reference object : witholdPmtTotalAmt
     * 
     */
    @JsonProperty("witholdPmtTotalAmt")
    @JsonPropertyDescription("Lineage reference object : witholdPmtTotalAmt")
    private Double witholdPmtTotalAmt;
    /**
     *  =  Net Billing
     * <p>
     * Lineage reference object : netBillingAmt
     * 
     */
    @JsonProperty("netBillingAmt")
    @JsonPropertyDescription("Lineage reference object : netBillingAmt")
    private Double netBillingAmt;
    /**
     *  0 - 30
     * <p>
     * Lineage reference object : billedTotalAmt030
     * 
     */
    @JsonProperty("billedTotalAmt030")
    @JsonPropertyDescription("Lineage reference object : billedTotalAmt030")
    private Double billedTotalAmt030;
    /**
     * Unbilled or Held
     * <p>
     * Lineage reference object : unbilledTotalAmt
     * 
     */
    @JsonProperty("unbilledTotalAmt")
    @JsonPropertyDescription("Lineage reference object : unbilledTotalAmt")
    private Double unbilledTotalAmt;
    /**
     *  =  Net Due
     * <p>
     * Lineage reference object : netDueAmt
     * 
     */
    @JsonProperty("netDueAmt")
    @JsonPropertyDescription("Lineage reference object : netDueAmt")
    private Double netDueAmt;
    /**
     *  =  Total Outstanding
     * <p>
     * Lineage reference object : totalOutstandingAmt
     * 
     */
    @JsonProperty("totalOutstandingAmt")
    @JsonPropertyDescription("Lineage reference object : totalOutstandingAmt")
    private Double totalOutstandingAmt;
    /**
     * -  Payments and Transfers
     * <p>
     * Lineage reference object : paymentsTotalAmt
     * 
     */
    @JsonProperty("paymentsTotalAmt")
    @JsonPropertyDescription("Lineage reference object : paymentsTotalAmt")
    private Double paymentsTotalAmt;
    /**
     * Over 90
     * <p>
     * Lineage reference object : billedTotalAmt90
     * 
     */
    @JsonProperty("billedTotalAmt90")
    @JsonPropertyDescription("Lineage reference object : billedTotalAmt90")
    private Double billedTotalAmt90;
    /**
     *  61 - 90
     * <p>
     * Lineage reference object : billedTotalAmt6190
     * 
     */
    @JsonProperty("billedTotalAmt6190")
    @JsonPropertyDescription("Lineage reference object : billedTotalAmt6190")
    private Double billedTotalAmt6190;
    /**
     * Total Billed
     * <p>
     * Lineage reference object : billedTotalAmtSt
     * 
     */
    @JsonProperty("billedTotalAmtSt")
    @JsonPropertyDescription("Lineage reference object : billedTotalAmtSt")
    private Double billedTotalAmtSt;
    /**
     *  =  Grand Total
     * <p>
     * Lineage reference object : grantTotalAmt
     * 
     */
    @JsonProperty("grantTotalAmt")
    @JsonPropertyDescription("Lineage reference object : grantTotalAmt")
    private Double grantTotalAmt;
    /**
     * +  Held Charges
     * <p>
     * Lineage reference object : holdChargesAmt
     * 
     */
    @JsonProperty("holdChargesAmt")
    @JsonPropertyDescription("Lineage reference object : holdChargesAmt")
    private Double holdChargesAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * +  Unbilled Charges
     * <p>
     * Lineage reference object : unbilledChargesAmt
     * 
     */
    @JsonProperty("unbilledChargesAmt")
    public Double getUnbilledChargesAmt() {
        return unbilledChargesAmt;
    }

    /**
     * +  Unbilled Charges
     * <p>
     * Lineage reference object : unbilledChargesAmt
     * 
     */
    @JsonProperty("unbilledChargesAmt")
    public void setUnbilledChargesAmt(Double unbilledChargesAmt) {
        this.unbilledChargesAmt = unbilledChargesAmt;
    }

    public GrantSummaryQuery100GetResponse withUnbilledChargesAmt(Double unbilledChargesAmt) {
        this.unbilledChargesAmt = unbilledChargesAmt;
        return this;
    }

    /**
     * Gross Billing
     * <p>
     * Lineage reference object : grossBillingAmt
     * 
     */
    @JsonProperty("grossBillingAmt")
    public Double getGrossBillingAmt() {
        return grossBillingAmt;
    }

    /**
     * Gross Billing
     * <p>
     * Lineage reference object : grossBillingAmt
     * 
     */
    @JsonProperty("grossBillingAmt")
    public void setGrossBillingAmt(Double grossBillingAmt) {
        this.grossBillingAmt = grossBillingAmt;
    }

    public GrantSummaryQuery100GetResponse withGrossBillingAmt(Double grossBillingAmt) {
        this.grossBillingAmt = grossBillingAmt;
        return this;
    }

    /**
     * +  Refunds
     * <p>
     * Lineage reference object : refundTotalAmt
     * 
     */
    @JsonProperty("refundTotalAmt")
    public Double getRefundTotalAmt() {
        return refundTotalAmt;
    }

    /**
     * +  Refunds
     * <p>
     * Lineage reference object : refundTotalAmt
     * 
     */
    @JsonProperty("refundTotalAmt")
    public void setRefundTotalAmt(Double refundTotalAmt) {
        this.refundTotalAmt = refundTotalAmt;
    }

    public GrantSummaryQuery100GetResponse withRefundTotalAmt(Double refundTotalAmt) {
        this.refundTotalAmt = refundTotalAmt;
        return this;
    }

    /**
     * -  Retainage Withholding
     * <p>
     * Lineage reference object : witholdChrgTotalAmt
     * 
     */
    @JsonProperty("witholdChrgTotalAmt")
    public Double getWitholdChrgTotalAmt() {
        return witholdChrgTotalAmt;
    }

    /**
     * -  Retainage Withholding
     * <p>
     * Lineage reference object : witholdChrgTotalAmt
     * 
     */
    @JsonProperty("witholdChrgTotalAmt")
    public void setWitholdChrgTotalAmt(Double witholdChrgTotalAmt) {
        this.witholdChrgTotalAmt = witholdChrgTotalAmt;
    }

    public GrantSummaryQuery100GetResponse withWitholdChrgTotalAmt(Double witholdChrgTotalAmt) {
        this.witholdChrgTotalAmt = witholdChrgTotalAmt;
        return this;
    }

    /**
     *  31 - 60
     * <p>
     * Lineage reference object : billedTotalAmt3160
     * 
     */
    @JsonProperty("billedTotalAmt3160")
    public Double getBilledTotalAmt3160() {
        return billedTotalAmt3160;
    }

    /**
     *  31 - 60
     * <p>
     * Lineage reference object : billedTotalAmt3160
     * 
     */
    @JsonProperty("billedTotalAmt3160")
    public void setBilledTotalAmt3160(Double billedTotalAmt3160) {
        this.billedTotalAmt3160 = billedTotalAmt3160;
    }

    public GrantSummaryQuery100GetResponse withBilledTotalAmt3160(Double billedTotalAmt3160) {
        this.billedTotalAmt3160 = billedTotalAmt3160;
        return this;
    }

    /**
     * Payment Withholding
     * <p>
     * Lineage reference object : witholdPmtTotalAmt
     * 
     */
    @JsonProperty("witholdPmtTotalAmt")
    public Double getWitholdPmtTotalAmt() {
        return witholdPmtTotalAmt;
    }

    /**
     * Payment Withholding
     * <p>
     * Lineage reference object : witholdPmtTotalAmt
     * 
     */
    @JsonProperty("witholdPmtTotalAmt")
    public void setWitholdPmtTotalAmt(Double witholdPmtTotalAmt) {
        this.witholdPmtTotalAmt = witholdPmtTotalAmt;
    }

    public GrantSummaryQuery100GetResponse withWitholdPmtTotalAmt(Double witholdPmtTotalAmt) {
        this.witholdPmtTotalAmt = witholdPmtTotalAmt;
        return this;
    }

    /**
     *  =  Net Billing
     * <p>
     * Lineage reference object : netBillingAmt
     * 
     */
    @JsonProperty("netBillingAmt")
    public Double getNetBillingAmt() {
        return netBillingAmt;
    }

    /**
     *  =  Net Billing
     * <p>
     * Lineage reference object : netBillingAmt
     * 
     */
    @JsonProperty("netBillingAmt")
    public void setNetBillingAmt(Double netBillingAmt) {
        this.netBillingAmt = netBillingAmt;
    }

    public GrantSummaryQuery100GetResponse withNetBillingAmt(Double netBillingAmt) {
        this.netBillingAmt = netBillingAmt;
        return this;
    }

    /**
     *  0 - 30
     * <p>
     * Lineage reference object : billedTotalAmt030
     * 
     */
    @JsonProperty("billedTotalAmt030")
    public Double getBilledTotalAmt030() {
        return billedTotalAmt030;
    }

    /**
     *  0 - 30
     * <p>
     * Lineage reference object : billedTotalAmt030
     * 
     */
    @JsonProperty("billedTotalAmt030")
    public void setBilledTotalAmt030(Double billedTotalAmt030) {
        this.billedTotalAmt030 = billedTotalAmt030;
    }

    public GrantSummaryQuery100GetResponse withBilledTotalAmt030(Double billedTotalAmt030) {
        this.billedTotalAmt030 = billedTotalAmt030;
        return this;
    }

    /**
     * Unbilled or Held
     * <p>
     * Lineage reference object : unbilledTotalAmt
     * 
     */
    @JsonProperty("unbilledTotalAmt")
    public Double getUnbilledTotalAmt() {
        return unbilledTotalAmt;
    }

    /**
     * Unbilled or Held
     * <p>
     * Lineage reference object : unbilledTotalAmt
     * 
     */
    @JsonProperty("unbilledTotalAmt")
    public void setUnbilledTotalAmt(Double unbilledTotalAmt) {
        this.unbilledTotalAmt = unbilledTotalAmt;
    }

    public GrantSummaryQuery100GetResponse withUnbilledTotalAmt(Double unbilledTotalAmt) {
        this.unbilledTotalAmt = unbilledTotalAmt;
        return this;
    }

    /**
     *  =  Net Due
     * <p>
     * Lineage reference object : netDueAmt
     * 
     */
    @JsonProperty("netDueAmt")
    public Double getNetDueAmt() {
        return netDueAmt;
    }

    /**
     *  =  Net Due
     * <p>
     * Lineage reference object : netDueAmt
     * 
     */
    @JsonProperty("netDueAmt")
    public void setNetDueAmt(Double netDueAmt) {
        this.netDueAmt = netDueAmt;
    }

    public GrantSummaryQuery100GetResponse withNetDueAmt(Double netDueAmt) {
        this.netDueAmt = netDueAmt;
        return this;
    }

    /**
     *  =  Total Outstanding
     * <p>
     * Lineage reference object : totalOutstandingAmt
     * 
     */
    @JsonProperty("totalOutstandingAmt")
    public Double getTotalOutstandingAmt() {
        return totalOutstandingAmt;
    }

    /**
     *  =  Total Outstanding
     * <p>
     * Lineage reference object : totalOutstandingAmt
     * 
     */
    @JsonProperty("totalOutstandingAmt")
    public void setTotalOutstandingAmt(Double totalOutstandingAmt) {
        this.totalOutstandingAmt = totalOutstandingAmt;
    }

    public GrantSummaryQuery100GetResponse withTotalOutstandingAmt(Double totalOutstandingAmt) {
        this.totalOutstandingAmt = totalOutstandingAmt;
        return this;
    }

    /**
     * -  Payments and Transfers
     * <p>
     * Lineage reference object : paymentsTotalAmt
     * 
     */
    @JsonProperty("paymentsTotalAmt")
    public Double getPaymentsTotalAmt() {
        return paymentsTotalAmt;
    }

    /**
     * -  Payments and Transfers
     * <p>
     * Lineage reference object : paymentsTotalAmt
     * 
     */
    @JsonProperty("paymentsTotalAmt")
    public void setPaymentsTotalAmt(Double paymentsTotalAmt) {
        this.paymentsTotalAmt = paymentsTotalAmt;
    }

    public GrantSummaryQuery100GetResponse withPaymentsTotalAmt(Double paymentsTotalAmt) {
        this.paymentsTotalAmt = paymentsTotalAmt;
        return this;
    }

    /**
     * Over 90
     * <p>
     * Lineage reference object : billedTotalAmt90
     * 
     */
    @JsonProperty("billedTotalAmt90")
    public Double getBilledTotalAmt90() {
        return billedTotalAmt90;
    }

    /**
     * Over 90
     * <p>
     * Lineage reference object : billedTotalAmt90
     * 
     */
    @JsonProperty("billedTotalAmt90")
    public void setBilledTotalAmt90(Double billedTotalAmt90) {
        this.billedTotalAmt90 = billedTotalAmt90;
    }

    public GrantSummaryQuery100GetResponse withBilledTotalAmt90(Double billedTotalAmt90) {
        this.billedTotalAmt90 = billedTotalAmt90;
        return this;
    }

    /**
     *  61 - 90
     * <p>
     * Lineage reference object : billedTotalAmt6190
     * 
     */
    @JsonProperty("billedTotalAmt6190")
    public Double getBilledTotalAmt6190() {
        return billedTotalAmt6190;
    }

    /**
     *  61 - 90
     * <p>
     * Lineage reference object : billedTotalAmt6190
     * 
     */
    @JsonProperty("billedTotalAmt6190")
    public void setBilledTotalAmt6190(Double billedTotalAmt6190) {
        this.billedTotalAmt6190 = billedTotalAmt6190;
    }

    public GrantSummaryQuery100GetResponse withBilledTotalAmt6190(Double billedTotalAmt6190) {
        this.billedTotalAmt6190 = billedTotalAmt6190;
        return this;
    }

    /**
     * Total Billed
     * <p>
     * Lineage reference object : billedTotalAmtSt
     * 
     */
    @JsonProperty("billedTotalAmtSt")
    public Double getBilledTotalAmtSt() {
        return billedTotalAmtSt;
    }

    /**
     * Total Billed
     * <p>
     * Lineage reference object : billedTotalAmtSt
     * 
     */
    @JsonProperty("billedTotalAmtSt")
    public void setBilledTotalAmtSt(Double billedTotalAmtSt) {
        this.billedTotalAmtSt = billedTotalAmtSt;
    }

    public GrantSummaryQuery100GetResponse withBilledTotalAmtSt(Double billedTotalAmtSt) {
        this.billedTotalAmtSt = billedTotalAmtSt;
        return this;
    }

    /**
     *  =  Grand Total
     * <p>
     * Lineage reference object : grantTotalAmt
     * 
     */
    @JsonProperty("grantTotalAmt")
    public Double getGrantTotalAmt() {
        return grantTotalAmt;
    }

    /**
     *  =  Grand Total
     * <p>
     * Lineage reference object : grantTotalAmt
     * 
     */
    @JsonProperty("grantTotalAmt")
    public void setGrantTotalAmt(Double grantTotalAmt) {
        this.grantTotalAmt = grantTotalAmt;
    }

    public GrantSummaryQuery100GetResponse withGrantTotalAmt(Double grantTotalAmt) {
        this.grantTotalAmt = grantTotalAmt;
        return this;
    }

    /**
     * +  Held Charges
     * <p>
     * Lineage reference object : holdChargesAmt
     * 
     */
    @JsonProperty("holdChargesAmt")
    public Double getHoldChargesAmt() {
        return holdChargesAmt;
    }

    /**
     * +  Held Charges
     * <p>
     * Lineage reference object : holdChargesAmt
     * 
     */
    @JsonProperty("holdChargesAmt")
    public void setHoldChargesAmt(Double holdChargesAmt) {
        this.holdChargesAmt = holdChargesAmt;
    }

    public GrantSummaryQuery100GetResponse withHoldChargesAmt(Double holdChargesAmt) {
        this.holdChargesAmt = holdChargesAmt;
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

    public GrantSummaryQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantSummaryQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("unbilledChargesAmt");
        sb.append('=');
        sb.append(((this.unbilledChargesAmt == null)?"<null>":this.unbilledChargesAmt));
        sb.append(',');
        sb.append("grossBillingAmt");
        sb.append('=');
        sb.append(((this.grossBillingAmt == null)?"<null>":this.grossBillingAmt));
        sb.append(',');
        sb.append("refundTotalAmt");
        sb.append('=');
        sb.append(((this.refundTotalAmt == null)?"<null>":this.refundTotalAmt));
        sb.append(',');
        sb.append("witholdChrgTotalAmt");
        sb.append('=');
        sb.append(((this.witholdChrgTotalAmt == null)?"<null>":this.witholdChrgTotalAmt));
        sb.append(',');
        sb.append("billedTotalAmt3160");
        sb.append('=');
        sb.append(((this.billedTotalAmt3160 == null)?"<null>":this.billedTotalAmt3160));
        sb.append(',');
        sb.append("witholdPmtTotalAmt");
        sb.append('=');
        sb.append(((this.witholdPmtTotalAmt == null)?"<null>":this.witholdPmtTotalAmt));
        sb.append(',');
        sb.append("netBillingAmt");
        sb.append('=');
        sb.append(((this.netBillingAmt == null)?"<null>":this.netBillingAmt));
        sb.append(',');
        sb.append("billedTotalAmt030");
        sb.append('=');
        sb.append(((this.billedTotalAmt030 == null)?"<null>":this.billedTotalAmt030));
        sb.append(',');
        sb.append("unbilledTotalAmt");
        sb.append('=');
        sb.append(((this.unbilledTotalAmt == null)?"<null>":this.unbilledTotalAmt));
        sb.append(',');
        sb.append("netDueAmt");
        sb.append('=');
        sb.append(((this.netDueAmt == null)?"<null>":this.netDueAmt));
        sb.append(',');
        sb.append("totalOutstandingAmt");
        sb.append('=');
        sb.append(((this.totalOutstandingAmt == null)?"<null>":this.totalOutstandingAmt));
        sb.append(',');
        sb.append("paymentsTotalAmt");
        sb.append('=');
        sb.append(((this.paymentsTotalAmt == null)?"<null>":this.paymentsTotalAmt));
        sb.append(',');
        sb.append("billedTotalAmt90");
        sb.append('=');
        sb.append(((this.billedTotalAmt90 == null)?"<null>":this.billedTotalAmt90));
        sb.append(',');
        sb.append("billedTotalAmt6190");
        sb.append('=');
        sb.append(((this.billedTotalAmt6190 == null)?"<null>":this.billedTotalAmt6190));
        sb.append(',');
        sb.append("billedTotalAmtSt");
        sb.append('=');
        sb.append(((this.billedTotalAmtSt == null)?"<null>":this.billedTotalAmtSt));
        sb.append(',');
        sb.append("grantTotalAmt");
        sb.append('=');
        sb.append(((this.grantTotalAmt == null)?"<null>":this.grantTotalAmt));
        sb.append(',');
        sb.append("holdChargesAmt");
        sb.append('=');
        sb.append(((this.holdChargesAmt == null)?"<null>":this.holdChargesAmt));
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
        result = ((result* 31)+((this.unbilledChargesAmt == null)? 0 :this.unbilledChargesAmt.hashCode()));
        result = ((result* 31)+((this.grossBillingAmt == null)? 0 :this.grossBillingAmt.hashCode()));
        result = ((result* 31)+((this.refundTotalAmt == null)? 0 :this.refundTotalAmt.hashCode()));
        result = ((result* 31)+((this.witholdChrgTotalAmt == null)? 0 :this.witholdChrgTotalAmt.hashCode()));
        result = ((result* 31)+((this.billedTotalAmt3160 == null)? 0 :this.billedTotalAmt3160 .hashCode()));
        result = ((result* 31)+((this.witholdPmtTotalAmt == null)? 0 :this.witholdPmtTotalAmt.hashCode()));
        result = ((result* 31)+((this.netBillingAmt == null)? 0 :this.netBillingAmt.hashCode()));
        result = ((result* 31)+((this.billedTotalAmt030 == null)? 0 :this.billedTotalAmt030 .hashCode()));
        result = ((result* 31)+((this.unbilledTotalAmt == null)? 0 :this.unbilledTotalAmt.hashCode()));
        result = ((result* 31)+((this.netDueAmt == null)? 0 :this.netDueAmt.hashCode()));
        result = ((result* 31)+((this.totalOutstandingAmt == null)? 0 :this.totalOutstandingAmt.hashCode()));
        result = ((result* 31)+((this.paymentsTotalAmt == null)? 0 :this.paymentsTotalAmt.hashCode()));
        result = ((result* 31)+((this.billedTotalAmt90 == null)? 0 :this.billedTotalAmt90 .hashCode()));
        result = ((result* 31)+((this.billedTotalAmt6190 == null)? 0 :this.billedTotalAmt6190 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.billedTotalAmtSt == null)? 0 :this.billedTotalAmtSt.hashCode()));
        result = ((result* 31)+((this.grantTotalAmt == null)? 0 :this.grantTotalAmt.hashCode()));
        result = ((result* 31)+((this.holdChargesAmt == null)? 0 :this.holdChargesAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantSummaryQuery100GetResponse) == false) {
            return false;
        }
        GrantSummaryQuery100GetResponse rhs = ((GrantSummaryQuery100GetResponse) other);
        return (((((((((((((((((((this.unbilledChargesAmt == rhs.unbilledChargesAmt)||((this.unbilledChargesAmt!= null)&&this.unbilledChargesAmt.equals(rhs.unbilledChargesAmt)))&&((this.grossBillingAmt == rhs.grossBillingAmt)||((this.grossBillingAmt!= null)&&this.grossBillingAmt.equals(rhs.grossBillingAmt))))&&((this.refundTotalAmt == rhs.refundTotalAmt)||((this.refundTotalAmt!= null)&&this.refundTotalAmt.equals(rhs.refundTotalAmt))))&&((this.witholdChrgTotalAmt == rhs.witholdChrgTotalAmt)||((this.witholdChrgTotalAmt!= null)&&this.witholdChrgTotalAmt.equals(rhs.witholdChrgTotalAmt))))&&((this.billedTotalAmt3160 == rhs.billedTotalAmt3160)||((this.billedTotalAmt3160 != null)&&this.billedTotalAmt3160 .equals(rhs.billedTotalAmt3160))))&&((this.witholdPmtTotalAmt == rhs.witholdPmtTotalAmt)||((this.witholdPmtTotalAmt!= null)&&this.witholdPmtTotalAmt.equals(rhs.witholdPmtTotalAmt))))&&((this.netBillingAmt == rhs.netBillingAmt)||((this.netBillingAmt!= null)&&this.netBillingAmt.equals(rhs.netBillingAmt))))&&((this.billedTotalAmt030 == rhs.billedTotalAmt030)||((this.billedTotalAmt030 != null)&&this.billedTotalAmt030 .equals(rhs.billedTotalAmt030))))&&((this.unbilledTotalAmt == rhs.unbilledTotalAmt)||((this.unbilledTotalAmt!= null)&&this.unbilledTotalAmt.equals(rhs.unbilledTotalAmt))))&&((this.netDueAmt == rhs.netDueAmt)||((this.netDueAmt!= null)&&this.netDueAmt.equals(rhs.netDueAmt))))&&((this.totalOutstandingAmt == rhs.totalOutstandingAmt)||((this.totalOutstandingAmt!= null)&&this.totalOutstandingAmt.equals(rhs.totalOutstandingAmt))))&&((this.paymentsTotalAmt == rhs.paymentsTotalAmt)||((this.paymentsTotalAmt!= null)&&this.paymentsTotalAmt.equals(rhs.paymentsTotalAmt))))&&((this.billedTotalAmt90 == rhs.billedTotalAmt90)||((this.billedTotalAmt90 != null)&&this.billedTotalAmt90 .equals(rhs.billedTotalAmt90))))&&((this.billedTotalAmt6190 == rhs.billedTotalAmt6190)||((this.billedTotalAmt6190 != null)&&this.billedTotalAmt6190 .equals(rhs.billedTotalAmt6190))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.billedTotalAmtSt == rhs.billedTotalAmtSt)||((this.billedTotalAmtSt!= null)&&this.billedTotalAmtSt.equals(rhs.billedTotalAmtSt))))&&((this.grantTotalAmt == rhs.grantTotalAmt)||((this.grantTotalAmt!= null)&&this.grantTotalAmt.equals(rhs.grantTotalAmt))))&&((this.holdChargesAmt == rhs.holdChargesAmt)||((this.holdChargesAmt!= null)&&this.holdChargesAmt.equals(rhs.holdChargesAmt))));
    }

}
