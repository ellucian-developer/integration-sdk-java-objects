
package com.ellucian.generated.bpapi.ban.student_tax_notifications.v1_0_0;

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
    "equalSign1",
    "minusSign",
    "equalSign2",
    "currDecPrevChrg",
    "prevCb",
    "currentPr",
    "currentCb",
    "adjustPay",
    "currentReportPr",
    "prevReportPr",
    "unReported",
    "cumCb",
    "capPr",
    "cumPr",
    "taxYear",
    "addSign1"
})
@Generated("jsonschema2pojo")
public class Ttvxrcn {

    /**
     *  =
     * <p>
     * 
     * 
     */
    @JsonProperty("equalSign1")
    private String equalSign1;
    /**
     * -
     * <p>
     * 
     * 
     */
    @JsonProperty("minusSign")
    private String minusSign;
    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("equalSign2")
    private String equalSign2;
    /**
     * Current Decrease Previous Charges (C)
     * <p>
     * Lineage reference object : TTVXRCN_CURR_DEC_PREV_CHRG
     * 
     */
    @JsonProperty("currDecPrevChrg")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_CURR_DEC_PREV_CHRG")
    private Double currDecPrevChrg;
    /**
     * Previous Cumulative Charges Billed (B=D for Previous Year)
     * <p>
     * Lineage reference object : TTVXRCN_PREV_CB
     * 
     */
    @JsonProperty("prevCb")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_PREV_CB")
    private Double prevCb;
    /**
     * Current Payments Received (H)
     * <p>
     * Lineage reference object : TTVXRCN_CURRENT_PR
     * 
     */
    @JsonProperty("currentPr")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_CURRENT_PR")
    private Double currentPr;
    /**
     * Current Charges Billed (A)
     * <p>
     * Lineage reference object : TTVXRCN_CURRENT_CB
     * 
     */
    @JsonProperty("currentCb")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_CURRENT_CB")
    private Double currentCb;
    /**
     * Box 4 Adjustment (F)
     * <p>
     * Lineage reference object : TTVXRCN_ADJUST_PAY
     * 
     */
    @JsonProperty("adjustPay")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_ADJUST_PAY")
    private Double adjustPay;
    /**
     * Box 1 Payments Reportable (I=Least (G,H))
     * <p>
     * Lineage reference object : TTVXRCN_CURRENT_REPORT_PR
     * 
     */
    @JsonProperty("currentReportPr")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_CURRENT_REPORT_PR")
    private Double currentReportPr;
    /**
     * Previous Cumulative Payments Reported (E=J for Previous Year)
     * <p>
     * Lineage reference object : TTVXRCN_PREV_REPORT_PR
     * 
     */
    @JsonProperty("prevReportPr")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_PREV_REPORT_PR")
    private Double prevReportPr;
    /**
     * Un-Reported CB
     * <p>
     * Lineage reference object : TTVXRCN_UNREPORTED
     * 
     */
    @JsonProperty("unReported")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_UNREPORTED")
    private Double unReported;
    /**
     * Cumulative Charges Billed (D = A+B+C)
     * <p>
     * Lineage reference object : TTVXRCN_CUM_CB
     * 
     */
    @JsonProperty("cumCb")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_CUM_CB")
    private Double cumCb;
    /**
     * Cap Limit Charges Billed (G = D-E+F)
     * <p>
     * Lineage reference object : TTVXRCN_CAP_PR
     * 
     */
    @JsonProperty("capPr")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_CAP_PR")
    private Double capPr;
    /**
     * Cumulative Box 1 Payments Reportable less Box 4 Adjustments (J=E-F+I)
     * <p>
     * Lineage reference object : TTVXRCN_CUM_PR
     * 
     */
    @JsonProperty("cumPr")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_CUM_PR")
    private Double cumPr;
    /**
     * Tax Year
     * <p>
     * Lineage reference object : TTVXRCN_TAX_YEAR
     * 
     */
    @JsonProperty("taxYear")
    @JsonPropertyDescription("Lineage reference object : TTVXRCN_TAX_YEAR")
    private Double taxYear;
    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("addSign1")
    private String addSign1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *  =
     * <p>
     * 
     * 
     */
    @JsonProperty("equalSign1")
    public String getEqualSign1() {
        return equalSign1;
    }

    /**
     *  =
     * <p>
     * 
     * 
     */
    @JsonProperty("equalSign1")
    public void setEqualSign1(String equalSign1) {
        this.equalSign1 = equalSign1;
    }

    public Ttvxrcn withEqualSign1(String equalSign1) {
        this.equalSign1 = equalSign1;
        return this;
    }

    /**
     * -
     * <p>
     * 
     * 
     */
    @JsonProperty("minusSign")
    public String getMinusSign() {
        return minusSign;
    }

    /**
     * -
     * <p>
     * 
     * 
     */
    @JsonProperty("minusSign")
    public void setMinusSign(String minusSign) {
        this.minusSign = minusSign;
    }

    public Ttvxrcn withMinusSign(String minusSign) {
        this.minusSign = minusSign;
        return this;
    }

    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("equalSign2")
    public String getEqualSign2() {
        return equalSign2;
    }

    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("equalSign2")
    public void setEqualSign2(String equalSign2) {
        this.equalSign2 = equalSign2;
    }

    public Ttvxrcn withEqualSign2(String equalSign2) {
        this.equalSign2 = equalSign2;
        return this;
    }

    /**
     * Current Decrease Previous Charges (C)
     * <p>
     * Lineage reference object : TTVXRCN_CURR_DEC_PREV_CHRG
     * 
     */
    @JsonProperty("currDecPrevChrg")
    public Double getCurrDecPrevChrg() {
        return currDecPrevChrg;
    }

    /**
     * Current Decrease Previous Charges (C)
     * <p>
     * Lineage reference object : TTVXRCN_CURR_DEC_PREV_CHRG
     * 
     */
    @JsonProperty("currDecPrevChrg")
    public void setCurrDecPrevChrg(Double currDecPrevChrg) {
        this.currDecPrevChrg = currDecPrevChrg;
    }

    public Ttvxrcn withCurrDecPrevChrg(Double currDecPrevChrg) {
        this.currDecPrevChrg = currDecPrevChrg;
        return this;
    }

    /**
     * Previous Cumulative Charges Billed (B=D for Previous Year)
     * <p>
     * Lineage reference object : TTVXRCN_PREV_CB
     * 
     */
    @JsonProperty("prevCb")
    public Double getPrevCb() {
        return prevCb;
    }

    /**
     * Previous Cumulative Charges Billed (B=D for Previous Year)
     * <p>
     * Lineage reference object : TTVXRCN_PREV_CB
     * 
     */
    @JsonProperty("prevCb")
    public void setPrevCb(Double prevCb) {
        this.prevCb = prevCb;
    }

    public Ttvxrcn withPrevCb(Double prevCb) {
        this.prevCb = prevCb;
        return this;
    }

    /**
     * Current Payments Received (H)
     * <p>
     * Lineage reference object : TTVXRCN_CURRENT_PR
     * 
     */
    @JsonProperty("currentPr")
    public Double getCurrentPr() {
        return currentPr;
    }

    /**
     * Current Payments Received (H)
     * <p>
     * Lineage reference object : TTVXRCN_CURRENT_PR
     * 
     */
    @JsonProperty("currentPr")
    public void setCurrentPr(Double currentPr) {
        this.currentPr = currentPr;
    }

    public Ttvxrcn withCurrentPr(Double currentPr) {
        this.currentPr = currentPr;
        return this;
    }

    /**
     * Current Charges Billed (A)
     * <p>
     * Lineage reference object : TTVXRCN_CURRENT_CB
     * 
     */
    @JsonProperty("currentCb")
    public Double getCurrentCb() {
        return currentCb;
    }

    /**
     * Current Charges Billed (A)
     * <p>
     * Lineage reference object : TTVXRCN_CURRENT_CB
     * 
     */
    @JsonProperty("currentCb")
    public void setCurrentCb(Double currentCb) {
        this.currentCb = currentCb;
    }

    public Ttvxrcn withCurrentCb(Double currentCb) {
        this.currentCb = currentCb;
        return this;
    }

    /**
     * Box 4 Adjustment (F)
     * <p>
     * Lineage reference object : TTVXRCN_ADJUST_PAY
     * 
     */
    @JsonProperty("adjustPay")
    public Double getAdjustPay() {
        return adjustPay;
    }

    /**
     * Box 4 Adjustment (F)
     * <p>
     * Lineage reference object : TTVXRCN_ADJUST_PAY
     * 
     */
    @JsonProperty("adjustPay")
    public void setAdjustPay(Double adjustPay) {
        this.adjustPay = adjustPay;
    }

    public Ttvxrcn withAdjustPay(Double adjustPay) {
        this.adjustPay = adjustPay;
        return this;
    }

    /**
     * Box 1 Payments Reportable (I=Least (G,H))
     * <p>
     * Lineage reference object : TTVXRCN_CURRENT_REPORT_PR
     * 
     */
    @JsonProperty("currentReportPr")
    public Double getCurrentReportPr() {
        return currentReportPr;
    }

    /**
     * Box 1 Payments Reportable (I=Least (G,H))
     * <p>
     * Lineage reference object : TTVXRCN_CURRENT_REPORT_PR
     * 
     */
    @JsonProperty("currentReportPr")
    public void setCurrentReportPr(Double currentReportPr) {
        this.currentReportPr = currentReportPr;
    }

    public Ttvxrcn withCurrentReportPr(Double currentReportPr) {
        this.currentReportPr = currentReportPr;
        return this;
    }

    /**
     * Previous Cumulative Payments Reported (E=J for Previous Year)
     * <p>
     * Lineage reference object : TTVXRCN_PREV_REPORT_PR
     * 
     */
    @JsonProperty("prevReportPr")
    public Double getPrevReportPr() {
        return prevReportPr;
    }

    /**
     * Previous Cumulative Payments Reported (E=J for Previous Year)
     * <p>
     * Lineage reference object : TTVXRCN_PREV_REPORT_PR
     * 
     */
    @JsonProperty("prevReportPr")
    public void setPrevReportPr(Double prevReportPr) {
        this.prevReportPr = prevReportPr;
    }

    public Ttvxrcn withPrevReportPr(Double prevReportPr) {
        this.prevReportPr = prevReportPr;
        return this;
    }

    /**
     * Un-Reported CB
     * <p>
     * Lineage reference object : TTVXRCN_UNREPORTED
     * 
     */
    @JsonProperty("unReported")
    public Double getUnReported() {
        return unReported;
    }

    /**
     * Un-Reported CB
     * <p>
     * Lineage reference object : TTVXRCN_UNREPORTED
     * 
     */
    @JsonProperty("unReported")
    public void setUnReported(Double unReported) {
        this.unReported = unReported;
    }

    public Ttvxrcn withUnReported(Double unReported) {
        this.unReported = unReported;
        return this;
    }

    /**
     * Cumulative Charges Billed (D = A+B+C)
     * <p>
     * Lineage reference object : TTVXRCN_CUM_CB
     * 
     */
    @JsonProperty("cumCb")
    public Double getCumCb() {
        return cumCb;
    }

    /**
     * Cumulative Charges Billed (D = A+B+C)
     * <p>
     * Lineage reference object : TTVXRCN_CUM_CB
     * 
     */
    @JsonProperty("cumCb")
    public void setCumCb(Double cumCb) {
        this.cumCb = cumCb;
    }

    public Ttvxrcn withCumCb(Double cumCb) {
        this.cumCb = cumCb;
        return this;
    }

    /**
     * Cap Limit Charges Billed (G = D-E+F)
     * <p>
     * Lineage reference object : TTVXRCN_CAP_PR
     * 
     */
    @JsonProperty("capPr")
    public Double getCapPr() {
        return capPr;
    }

    /**
     * Cap Limit Charges Billed (G = D-E+F)
     * <p>
     * Lineage reference object : TTVXRCN_CAP_PR
     * 
     */
    @JsonProperty("capPr")
    public void setCapPr(Double capPr) {
        this.capPr = capPr;
    }

    public Ttvxrcn withCapPr(Double capPr) {
        this.capPr = capPr;
        return this;
    }

    /**
     * Cumulative Box 1 Payments Reportable less Box 4 Adjustments (J=E-F+I)
     * <p>
     * Lineage reference object : TTVXRCN_CUM_PR
     * 
     */
    @JsonProperty("cumPr")
    public Double getCumPr() {
        return cumPr;
    }

    /**
     * Cumulative Box 1 Payments Reportable less Box 4 Adjustments (J=E-F+I)
     * <p>
     * Lineage reference object : TTVXRCN_CUM_PR
     * 
     */
    @JsonProperty("cumPr")
    public void setCumPr(Double cumPr) {
        this.cumPr = cumPr;
    }

    public Ttvxrcn withCumPr(Double cumPr) {
        this.cumPr = cumPr;
        return this;
    }

    /**
     * Tax Year
     * <p>
     * Lineage reference object : TTVXRCN_TAX_YEAR
     * 
     */
    @JsonProperty("taxYear")
    public Double getTaxYear() {
        return taxYear;
    }

    /**
     * Tax Year
     * <p>
     * Lineage reference object : TTVXRCN_TAX_YEAR
     * 
     */
    @JsonProperty("taxYear")
    public void setTaxYear(Double taxYear) {
        this.taxYear = taxYear;
    }

    public Ttvxrcn withTaxYear(Double taxYear) {
        this.taxYear = taxYear;
        return this;
    }

    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("addSign1")
    public String getAddSign1() {
        return addSign1;
    }

    /**
     * +
     * <p>
     * 
     * 
     */
    @JsonProperty("addSign1")
    public void setAddSign1(String addSign1) {
        this.addSign1 = addSign1;
    }

    public Ttvxrcn withAddSign1(String addSign1) {
        this.addSign1 = addSign1;
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

    public Ttvxrcn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ttvxrcn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("equalSign1");
        sb.append('=');
        sb.append(((this.equalSign1 == null)?"<null>":this.equalSign1));
        sb.append(',');
        sb.append("minusSign");
        sb.append('=');
        sb.append(((this.minusSign == null)?"<null>":this.minusSign));
        sb.append(',');
        sb.append("equalSign2");
        sb.append('=');
        sb.append(((this.equalSign2 == null)?"<null>":this.equalSign2));
        sb.append(',');
        sb.append("currDecPrevChrg");
        sb.append('=');
        sb.append(((this.currDecPrevChrg == null)?"<null>":this.currDecPrevChrg));
        sb.append(',');
        sb.append("prevCb");
        sb.append('=');
        sb.append(((this.prevCb == null)?"<null>":this.prevCb));
        sb.append(',');
        sb.append("currentPr");
        sb.append('=');
        sb.append(((this.currentPr == null)?"<null>":this.currentPr));
        sb.append(',');
        sb.append("currentCb");
        sb.append('=');
        sb.append(((this.currentCb == null)?"<null>":this.currentCb));
        sb.append(',');
        sb.append("adjustPay");
        sb.append('=');
        sb.append(((this.adjustPay == null)?"<null>":this.adjustPay));
        sb.append(',');
        sb.append("currentReportPr");
        sb.append('=');
        sb.append(((this.currentReportPr == null)?"<null>":this.currentReportPr));
        sb.append(',');
        sb.append("prevReportPr");
        sb.append('=');
        sb.append(((this.prevReportPr == null)?"<null>":this.prevReportPr));
        sb.append(',');
        sb.append("unReported");
        sb.append('=');
        sb.append(((this.unReported == null)?"<null>":this.unReported));
        sb.append(',');
        sb.append("cumCb");
        sb.append('=');
        sb.append(((this.cumCb == null)?"<null>":this.cumCb));
        sb.append(',');
        sb.append("capPr");
        sb.append('=');
        sb.append(((this.capPr == null)?"<null>":this.capPr));
        sb.append(',');
        sb.append("cumPr");
        sb.append('=');
        sb.append(((this.cumPr == null)?"<null>":this.cumPr));
        sb.append(',');
        sb.append("taxYear");
        sb.append('=');
        sb.append(((this.taxYear == null)?"<null>":this.taxYear));
        sb.append(',');
        sb.append("addSign1");
        sb.append('=');
        sb.append(((this.addSign1 == null)?"<null>":this.addSign1));
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
        result = ((result* 31)+((this.equalSign1 == null)? 0 :this.equalSign1 .hashCode()));
        result = ((result* 31)+((this.minusSign == null)? 0 :this.minusSign.hashCode()));
        result = ((result* 31)+((this.equalSign2 == null)? 0 :this.equalSign2 .hashCode()));
        result = ((result* 31)+((this.currDecPrevChrg == null)? 0 :this.currDecPrevChrg.hashCode()));
        result = ((result* 31)+((this.prevCb == null)? 0 :this.prevCb.hashCode()));
        result = ((result* 31)+((this.currentPr == null)? 0 :this.currentPr.hashCode()));
        result = ((result* 31)+((this.currentCb == null)? 0 :this.currentCb.hashCode()));
        result = ((result* 31)+((this.adjustPay == null)? 0 :this.adjustPay.hashCode()));
        result = ((result* 31)+((this.currentReportPr == null)? 0 :this.currentReportPr.hashCode()));
        result = ((result* 31)+((this.prevReportPr == null)? 0 :this.prevReportPr.hashCode()));
        result = ((result* 31)+((this.unReported == null)? 0 :this.unReported.hashCode()));
        result = ((result* 31)+((this.cumCb == null)? 0 :this.cumCb.hashCode()));
        result = ((result* 31)+((this.capPr == null)? 0 :this.capPr.hashCode()));
        result = ((result* 31)+((this.cumPr == null)? 0 :this.cumPr.hashCode()));
        result = ((result* 31)+((this.taxYear == null)? 0 :this.taxYear.hashCode()));
        result = ((result* 31)+((this.addSign1 == null)? 0 :this.addSign1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ttvxrcn) == false) {
            return false;
        }
        Ttvxrcn rhs = ((Ttvxrcn) other);
        return ((((((((((((((((((this.equalSign1 == rhs.equalSign1)||((this.equalSign1 != null)&&this.equalSign1 .equals(rhs.equalSign1)))&&((this.minusSign == rhs.minusSign)||((this.minusSign!= null)&&this.minusSign.equals(rhs.minusSign))))&&((this.equalSign2 == rhs.equalSign2)||((this.equalSign2 != null)&&this.equalSign2 .equals(rhs.equalSign2))))&&((this.currDecPrevChrg == rhs.currDecPrevChrg)||((this.currDecPrevChrg!= null)&&this.currDecPrevChrg.equals(rhs.currDecPrevChrg))))&&((this.prevCb == rhs.prevCb)||((this.prevCb!= null)&&this.prevCb.equals(rhs.prevCb))))&&((this.currentPr == rhs.currentPr)||((this.currentPr!= null)&&this.currentPr.equals(rhs.currentPr))))&&((this.currentCb == rhs.currentCb)||((this.currentCb!= null)&&this.currentCb.equals(rhs.currentCb))))&&((this.adjustPay == rhs.adjustPay)||((this.adjustPay!= null)&&this.adjustPay.equals(rhs.adjustPay))))&&((this.currentReportPr == rhs.currentReportPr)||((this.currentReportPr!= null)&&this.currentReportPr.equals(rhs.currentReportPr))))&&((this.prevReportPr == rhs.prevReportPr)||((this.prevReportPr!= null)&&this.prevReportPr.equals(rhs.prevReportPr))))&&((this.unReported == rhs.unReported)||((this.unReported!= null)&&this.unReported.equals(rhs.unReported))))&&((this.cumCb == rhs.cumCb)||((this.cumCb!= null)&&this.cumCb.equals(rhs.cumCb))))&&((this.capPr == rhs.capPr)||((this.capPr!= null)&&this.capPr.equals(rhs.capPr))))&&((this.cumPr == rhs.cumPr)||((this.cumPr!= null)&&this.cumPr.equals(rhs.cumPr))))&&((this.taxYear == rhs.taxYear)||((this.taxYear!= null)&&this.taxYear.equals(rhs.taxYear))))&&((this.addSign1 == rhs.addSign1)||((this.addSign1 != null)&&this.addSign1 .equals(rhs.addSign1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
