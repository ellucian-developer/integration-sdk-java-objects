
package com.ellucian.generated.bpapi.ban._1099_reporting.v1_0_0;

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
    "itypDesc",
    "bankCode",
    "checkNum",
    "cardNotPresent",
    "coasCode",
    "bankName",
    "rptId",
    "stWholdAmt",
    "checkDate",
    "fedPaidOverAmt",
    "chartTitle",
    "invhCode",
    "rptAmt",
    "fedWholdAmt",
    "itypCode",
    "instName",
    "instTin",
    "stPaidOverAmt"
})
@Generated("jsonschema2pojo")
public class _1099Reporting100PostResponse {

    @JsonProperty("itypDesc")
    private String itypDesc;
    /**
     * Bank
     * <p>
     * Lineage reference object : FAB1099_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : FAB1099_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Check Number
     * <p>
     * Lineage reference object : FAB1099_CHECK_NUM
     * (Required)
     * 
     */
    @JsonProperty("checkNum")
    @JsonPropertyDescription("Lineage reference object : FAB1099_CHECK_NUM")
    private String checkNum;
    /**
     * Card Not Present
     * <p>
     * Lineage reference object : FAB1099_CARD_NOT_PRESENT
     * 
     */
    @JsonProperty("cardNotPresent")
    @JsonPropertyDescription("Lineage reference object : FAB1099_CARD_NOT_PRESENT")
    private Double cardNotPresent;
    /**
     * Chart
     * <p>
     * Lineage reference object : FAB1099_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FAB1099_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    @JsonProperty("bankName")
    private String bankName;
    /**
     *  1099 Reporting ID
     * <p>
     * Lineage reference object : FAB1099_RPT_ID
     * 
     */
    @JsonProperty("rptId")
    @JsonPropertyDescription("Lineage reference object : FAB1099_RPT_ID")
    private String rptId;
    /**
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("stWholdAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_ST_WHOLD_AMT")
    private Double stWholdAmt;
    /**
     * Check Date
     * <p>
     * Lineage reference object : FAB1099_CHECK_DATE
     * (Required)
     * 
     */
    @JsonProperty("checkDate")
    @JsonPropertyDescription("Lineage reference object : FAB1099_CHECK_DATE")
    private Date checkDate;
    /**
     * Federal Previously Paid
     * <p>
     * Lineage reference object : FAB1099_FED_PAID_OVER_AMT
     * 
     */
    @JsonProperty("fedPaidOverAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_FED_PAID_OVER_AMT")
    private Double fedPaidOverAmt;
    @JsonProperty("chartTitle")
    private String chartTitle;
    /**
     * Document
     * <p>
     * Lineage reference object : FAB1099_INVH_CODE
     * (Required)
     * 
     */
    @JsonProperty("invhCode")
    @JsonPropertyDescription("Lineage reference object : FAB1099_INVH_CODE")
    private String invhCode;
    /**
     * Reported Amount
     * <p>
     * Lineage reference object : FAB1099_RPT_AMT
     * 
     */
    @JsonProperty("rptAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_RPT_AMT")
    private Double rptAmt;
    /**
     * Federal Withheld
     * <p>
     * Lineage reference object : FAB1099_FED_WHOLD_AMT
     * 
     */
    @JsonProperty("fedWholdAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_FED_WHOLD_AMT")
    private Double fedWholdAmt;
    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * (Required)
     * 
     */
    @JsonProperty("itypCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvityp")
    private String itypCode;
    @JsonProperty("instName")
    private String instName;
    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("instTin")
    @JsonPropertyDescription("Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099")
    private String instTin;
    /**
     * State Previously Paid
     * <p>
     * Lineage reference object : FAB1099_ST_PAID_OVER_AMT
     * 
     */
    @JsonProperty("stPaidOverAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_ST_PAID_OVER_AMT")
    private Double stPaidOverAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("itypDesc")
    public String getItypDesc() {
        return itypDesc;
    }

    @JsonProperty("itypDesc")
    public void setItypDesc(String itypDesc) {
        this.itypDesc = itypDesc;
    }

    public _1099Reporting100PostResponse withItypDesc(String itypDesc) {
        this.itypDesc = itypDesc;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FAB1099_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FAB1099_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public _1099Reporting100PostResponse withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Check Number
     * <p>
     * Lineage reference object : FAB1099_CHECK_NUM
     * (Required)
     * 
     */
    @JsonProperty("checkNum")
    public String getCheckNum() {
        return checkNum;
    }

    /**
     * Check Number
     * <p>
     * Lineage reference object : FAB1099_CHECK_NUM
     * (Required)
     * 
     */
    @JsonProperty("checkNum")
    public void setCheckNum(String checkNum) {
        this.checkNum = checkNum;
    }

    public _1099Reporting100PostResponse withCheckNum(String checkNum) {
        this.checkNum = checkNum;
        return this;
    }

    /**
     * Card Not Present
     * <p>
     * Lineage reference object : FAB1099_CARD_NOT_PRESENT
     * 
     */
    @JsonProperty("cardNotPresent")
    public Double getCardNotPresent() {
        return cardNotPresent;
    }

    /**
     * Card Not Present
     * <p>
     * Lineage reference object : FAB1099_CARD_NOT_PRESENT
     * 
     */
    @JsonProperty("cardNotPresent")
    public void setCardNotPresent(Double cardNotPresent) {
        this.cardNotPresent = cardNotPresent;
    }

    public _1099Reporting100PostResponse withCardNotPresent(Double cardNotPresent) {
        this.cardNotPresent = cardNotPresent;
        return this;
    }

    /**
     * Chart
     * <p>
     * Lineage reference object : FAB1099_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart
     * <p>
     * Lineage reference object : FAB1099_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public _1099Reporting100PostResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("bankName")
    public String getBankName() {
        return bankName;
    }

    @JsonProperty("bankName")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public _1099Reporting100PostResponse withBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    /**
     *  1099 Reporting ID
     * <p>
     * Lineage reference object : FAB1099_RPT_ID
     * 
     */
    @JsonProperty("rptId")
    public String getRptId() {
        return rptId;
    }

    /**
     *  1099 Reporting ID
     * <p>
     * Lineage reference object : FAB1099_RPT_ID
     * 
     */
    @JsonProperty("rptId")
    public void setRptId(String rptId) {
        this.rptId = rptId;
    }

    public _1099Reporting100PostResponse withRptId(String rptId) {
        this.rptId = rptId;
        return this;
    }

    /**
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("stWholdAmt")
    public Double getStWholdAmt() {
        return stWholdAmt;
    }

    /**
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("stWholdAmt")
    public void setStWholdAmt(Double stWholdAmt) {
        this.stWholdAmt = stWholdAmt;
    }

    public _1099Reporting100PostResponse withStWholdAmt(Double stWholdAmt) {
        this.stWholdAmt = stWholdAmt;
        return this;
    }

    /**
     * Check Date
     * <p>
     * Lineage reference object : FAB1099_CHECK_DATE
     * (Required)
     * 
     */
    @JsonProperty("checkDate")
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * Check Date
     * <p>
     * Lineage reference object : FAB1099_CHECK_DATE
     * (Required)
     * 
     */
    @JsonProperty("checkDate")
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public _1099Reporting100PostResponse withCheckDate(Date checkDate) {
        this.checkDate = checkDate;
        return this;
    }

    /**
     * Federal Previously Paid
     * <p>
     * Lineage reference object : FAB1099_FED_PAID_OVER_AMT
     * 
     */
    @JsonProperty("fedPaidOverAmt")
    public Double getFedPaidOverAmt() {
        return fedPaidOverAmt;
    }

    /**
     * Federal Previously Paid
     * <p>
     * Lineage reference object : FAB1099_FED_PAID_OVER_AMT
     * 
     */
    @JsonProperty("fedPaidOverAmt")
    public void setFedPaidOverAmt(Double fedPaidOverAmt) {
        this.fedPaidOverAmt = fedPaidOverAmt;
    }

    public _1099Reporting100PostResponse withFedPaidOverAmt(Double fedPaidOverAmt) {
        this.fedPaidOverAmt = fedPaidOverAmt;
        return this;
    }

    @JsonProperty("chartTitle")
    public String getChartTitle() {
        return chartTitle;
    }

    @JsonProperty("chartTitle")
    public void setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
    }

    public _1099Reporting100PostResponse withChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FAB1099_INVH_CODE
     * (Required)
     * 
     */
    @JsonProperty("invhCode")
    public String getInvhCode() {
        return invhCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FAB1099_INVH_CODE
     * (Required)
     * 
     */
    @JsonProperty("invhCode")
    public void setInvhCode(String invhCode) {
        this.invhCode = invhCode;
    }

    public _1099Reporting100PostResponse withInvhCode(String invhCode) {
        this.invhCode = invhCode;
        return this;
    }

    /**
     * Reported Amount
     * <p>
     * Lineage reference object : FAB1099_RPT_AMT
     * 
     */
    @JsonProperty("rptAmt")
    public Double getRptAmt() {
        return rptAmt;
    }

    /**
     * Reported Amount
     * <p>
     * Lineage reference object : FAB1099_RPT_AMT
     * 
     */
    @JsonProperty("rptAmt")
    public void setRptAmt(Double rptAmt) {
        this.rptAmt = rptAmt;
    }

    public _1099Reporting100PostResponse withRptAmt(Double rptAmt) {
        this.rptAmt = rptAmt;
        return this;
    }

    /**
     * Federal Withheld
     * <p>
     * Lineage reference object : FAB1099_FED_WHOLD_AMT
     * 
     */
    @JsonProperty("fedWholdAmt")
    public Double getFedWholdAmt() {
        return fedWholdAmt;
    }

    /**
     * Federal Withheld
     * <p>
     * Lineage reference object : FAB1099_FED_WHOLD_AMT
     * 
     */
    @JsonProperty("fedWholdAmt")
    public void setFedWholdAmt(Double fedWholdAmt) {
        this.fedWholdAmt = fedWholdAmt;
    }

    public _1099Reporting100PostResponse withFedWholdAmt(Double fedWholdAmt) {
        this.fedWholdAmt = fedWholdAmt;
        return this;
    }

    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * (Required)
     * 
     */
    @JsonProperty("itypCode")
    public String getItypCode() {
        return itypCode;
    }

    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * (Required)
     * 
     */
    @JsonProperty("itypCode")
    public void setItypCode(String itypCode) {
        this.itypCode = itypCode;
    }

    public _1099Reporting100PostResponse withItypCode(String itypCode) {
        this.itypCode = itypCode;
        return this;
    }

    @JsonProperty("instName")
    public String getInstName() {
        return instName;
    }

    @JsonProperty("instName")
    public void setInstName(String instName) {
        this.instName = instName;
    }

    public _1099Reporting100PostResponse withInstName(String instName) {
        this.instName = instName;
        return this;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("instTin")
    public String getInstTin() {
        return instTin;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("instTin")
    public void setInstTin(String instTin) {
        this.instTin = instTin;
    }

    public _1099Reporting100PostResponse withInstTin(String instTin) {
        this.instTin = instTin;
        return this;
    }

    /**
     * State Previously Paid
     * <p>
     * Lineage reference object : FAB1099_ST_PAID_OVER_AMT
     * 
     */
    @JsonProperty("stPaidOverAmt")
    public Double getStPaidOverAmt() {
        return stPaidOverAmt;
    }

    /**
     * State Previously Paid
     * <p>
     * Lineage reference object : FAB1099_ST_PAID_OVER_AMT
     * 
     */
    @JsonProperty("stPaidOverAmt")
    public void setStPaidOverAmt(Double stPaidOverAmt) {
        this.stPaidOverAmt = stPaidOverAmt;
    }

    public _1099Reporting100PostResponse withStPaidOverAmt(Double stPaidOverAmt) {
        this.stPaidOverAmt = stPaidOverAmt;
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

    public _1099Reporting100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_1099Reporting100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("itypDesc");
        sb.append('=');
        sb.append(((this.itypDesc == null)?"<null>":this.itypDesc));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("checkNum");
        sb.append('=');
        sb.append(((this.checkNum == null)?"<null>":this.checkNum));
        sb.append(',');
        sb.append("cardNotPresent");
        sb.append('=');
        sb.append(((this.cardNotPresent == null)?"<null>":this.cardNotPresent));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("bankName");
        sb.append('=');
        sb.append(((this.bankName == null)?"<null>":this.bankName));
        sb.append(',');
        sb.append("rptId");
        sb.append('=');
        sb.append(((this.rptId == null)?"<null>":this.rptId));
        sb.append(',');
        sb.append("stWholdAmt");
        sb.append('=');
        sb.append(((this.stWholdAmt == null)?"<null>":this.stWholdAmt));
        sb.append(',');
        sb.append("checkDate");
        sb.append('=');
        sb.append(((this.checkDate == null)?"<null>":this.checkDate));
        sb.append(',');
        sb.append("fedPaidOverAmt");
        sb.append('=');
        sb.append(((this.fedPaidOverAmt == null)?"<null>":this.fedPaidOverAmt));
        sb.append(',');
        sb.append("chartTitle");
        sb.append('=');
        sb.append(((this.chartTitle == null)?"<null>":this.chartTitle));
        sb.append(',');
        sb.append("invhCode");
        sb.append('=');
        sb.append(((this.invhCode == null)?"<null>":this.invhCode));
        sb.append(',');
        sb.append("rptAmt");
        sb.append('=');
        sb.append(((this.rptAmt == null)?"<null>":this.rptAmt));
        sb.append(',');
        sb.append("fedWholdAmt");
        sb.append('=');
        sb.append(((this.fedWholdAmt == null)?"<null>":this.fedWholdAmt));
        sb.append(',');
        sb.append("itypCode");
        sb.append('=');
        sb.append(((this.itypCode == null)?"<null>":this.itypCode));
        sb.append(',');
        sb.append("instName");
        sb.append('=');
        sb.append(((this.instName == null)?"<null>":this.instName));
        sb.append(',');
        sb.append("instTin");
        sb.append('=');
        sb.append(((this.instTin == null)?"<null>":this.instTin));
        sb.append(',');
        sb.append("stPaidOverAmt");
        sb.append('=');
        sb.append(((this.stPaidOverAmt == null)?"<null>":this.stPaidOverAmt));
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
        result = ((result* 31)+((this.itypDesc == null)? 0 :this.itypDesc.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.checkNum == null)? 0 :this.checkNum.hashCode()));
        result = ((result* 31)+((this.cardNotPresent == null)? 0 :this.cardNotPresent.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.bankName == null)? 0 :this.bankName.hashCode()));
        result = ((result* 31)+((this.rptId == null)? 0 :this.rptId.hashCode()));
        result = ((result* 31)+((this.stWholdAmt == null)? 0 :this.stWholdAmt.hashCode()));
        result = ((result* 31)+((this.checkDate == null)? 0 :this.checkDate.hashCode()));
        result = ((result* 31)+((this.fedPaidOverAmt == null)? 0 :this.fedPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.chartTitle == null)? 0 :this.chartTitle.hashCode()));
        result = ((result* 31)+((this.invhCode == null)? 0 :this.invhCode.hashCode()));
        result = ((result* 31)+((this.rptAmt == null)? 0 :this.rptAmt.hashCode()));
        result = ((result* 31)+((this.fedWholdAmt == null)? 0 :this.fedWholdAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.itypCode == null)? 0 :this.itypCode.hashCode()));
        result = ((result* 31)+((this.instName == null)? 0 :this.instName.hashCode()));
        result = ((result* 31)+((this.instTin == null)? 0 :this.instTin.hashCode()));
        result = ((result* 31)+((this.stPaidOverAmt == null)? 0 :this.stPaidOverAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _1099Reporting100PostResponse) == false) {
            return false;
        }
        _1099Reporting100PostResponse rhs = ((_1099Reporting100PostResponse) other);
        return ((((((((((((((((((((this.itypDesc == rhs.itypDesc)||((this.itypDesc!= null)&&this.itypDesc.equals(rhs.itypDesc)))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.checkNum == rhs.checkNum)||((this.checkNum!= null)&&this.checkNum.equals(rhs.checkNum))))&&((this.cardNotPresent == rhs.cardNotPresent)||((this.cardNotPresent!= null)&&this.cardNotPresent.equals(rhs.cardNotPresent))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.bankName == rhs.bankName)||((this.bankName!= null)&&this.bankName.equals(rhs.bankName))))&&((this.rptId == rhs.rptId)||((this.rptId!= null)&&this.rptId.equals(rhs.rptId))))&&((this.stWholdAmt == rhs.stWholdAmt)||((this.stWholdAmt!= null)&&this.stWholdAmt.equals(rhs.stWholdAmt))))&&((this.checkDate == rhs.checkDate)||((this.checkDate!= null)&&this.checkDate.equals(rhs.checkDate))))&&((this.fedPaidOverAmt == rhs.fedPaidOverAmt)||((this.fedPaidOverAmt!= null)&&this.fedPaidOverAmt.equals(rhs.fedPaidOverAmt))))&&((this.chartTitle == rhs.chartTitle)||((this.chartTitle!= null)&&this.chartTitle.equals(rhs.chartTitle))))&&((this.invhCode == rhs.invhCode)||((this.invhCode!= null)&&this.invhCode.equals(rhs.invhCode))))&&((this.rptAmt == rhs.rptAmt)||((this.rptAmt!= null)&&this.rptAmt.equals(rhs.rptAmt))))&&((this.fedWholdAmt == rhs.fedWholdAmt)||((this.fedWholdAmt!= null)&&this.fedWholdAmt.equals(rhs.fedWholdAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.itypCode == rhs.itypCode)||((this.itypCode!= null)&&this.itypCode.equals(rhs.itypCode))))&&((this.instName == rhs.instName)||((this.instName!= null)&&this.instName.equals(rhs.instName))))&&((this.instTin == rhs.instTin)||((this.instTin!= null)&&this.instTin.equals(rhs.instTin))))&&((this.stPaidOverAmt == rhs.stPaidOverAmt)||((this.stPaidOverAmt!= null)&&this.stPaidOverAmt.equals(rhs.stPaidOverAmt))));
    }

}
