
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
    "bankCode",
    "fab1099StWholdAmt",
    "checkNum",
    "cardNotPresent",
    "coasCode",
    "fab1099FedWholdAmt",
    "checkDate",
    "ftvvendVendOwner",
    "fab1099ItypCode",
    "faa1099VendCode",
    "fab1099StPaidOverAmt",
    "taxID",
    "fab1099InvhCode",
    "rptAmt",
    "fab1099InstTin",
    "fab1099FedPaidOverAmt",
    "faa1099RptYr",
    "instTin"
})
@Generated("jsonschema2pojo")
public class _1099Reporting100PostRequest {

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
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("fab1099StWholdAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_ST_WHOLD_AMT")
    private Double fab1099StWholdAmt;
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
    /**
     * Federal Withheld
     * <p>
     * Lineage reference object : FAB1099_FED_WHOLD_AMT
     * 
     */
    @JsonProperty("fab1099FedWholdAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_FED_WHOLD_AMT")
    private Double fab1099FedWholdAmt;
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
     * Owner Vendor ID
     * <p>
     * Lineage reference object : ftvvendVendOwner, Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("ftvvendVendOwner")
    @JsonPropertyDescription("Lineage reference object : ftvvendVendOwner, Lookup lineage reference object : ftvvend")
    private String ftvvendVendOwner;
    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * (Required)
     * 
     */
    @JsonProperty("fab1099ItypCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvityp")
    private String fab1099ItypCode;
    /**
     * Vendor
     * <p>
     * Lineage reference object : faa1099VendCode, Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("faa1099VendCode")
    @JsonPropertyDescription("Lineage reference object : faa1099VendCode, Lookup lineage reference object : ftvvend")
    private String faa1099VendCode;
    /**
     * State Previously Paid
     * <p>
     * Lineage reference object : FAB1099_ST_PAID_OVER_AMT
     * 
     */
    @JsonProperty("fab1099StPaidOverAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_ST_PAID_OVER_AMT")
    private Double fab1099StPaidOverAmt;
    /**
     *  1099 Reporting ID
     * <p>
     * Lineage reference object : taxId
     * (Required)
     * 
     */
    @JsonProperty("taxID")
    @JsonPropertyDescription("Lineage reference object : taxId")
    private String taxID;
    /**
     * Document
     * <p>
     * Lineage reference object : FAB1099_INVH_CODE
     * (Required)
     * 
     */
    @JsonProperty("fab1099InvhCode")
    @JsonPropertyDescription("Lineage reference object : FAB1099_INVH_CODE")
    private String fab1099InvhCode;
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
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("fab1099InstTin")
    @JsonPropertyDescription("Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099")
    private String fab1099InstTin;
    /**
     * Federal Previously Paid
     * <p>
     * Lineage reference object : FAB1099_FED_PAID_OVER_AMT
     * 
     */
    @JsonProperty("fab1099FedPaidOverAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_FED_PAID_OVER_AMT")
    private Double fab1099FedPaidOverAmt;
    /**
     * Year
     * <p>
     * Lineage reference object : faa1099RptYr
     * (Required)
     * 
     */
    @JsonProperty("faa1099RptYr")
    @JsonPropertyDescription("Lineage reference object : faa1099RptYr")
    private String faa1099RptYr;
    /**
     * Payer TIN
     * <p>
     * Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("instTin")
    @JsonPropertyDescription("Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099")
    private String instTin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public _1099Reporting100PostRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("fab1099StWholdAmt")
    public Double getFab1099StWholdAmt() {
        return fab1099StWholdAmt;
    }

    /**
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("fab1099StWholdAmt")
    public void setFab1099StWholdAmt(Double fab1099StWholdAmt) {
        this.fab1099StWholdAmt = fab1099StWholdAmt;
    }

    public _1099Reporting100PostRequest withFab1099StWholdAmt(Double fab1099StWholdAmt) {
        this.fab1099StWholdAmt = fab1099StWholdAmt;
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

    public _1099Reporting100PostRequest withCheckNum(String checkNum) {
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

    public _1099Reporting100PostRequest withCardNotPresent(Double cardNotPresent) {
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

    public _1099Reporting100PostRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Federal Withheld
     * <p>
     * Lineage reference object : FAB1099_FED_WHOLD_AMT
     * 
     */
    @JsonProperty("fab1099FedWholdAmt")
    public Double getFab1099FedWholdAmt() {
        return fab1099FedWholdAmt;
    }

    /**
     * Federal Withheld
     * <p>
     * Lineage reference object : FAB1099_FED_WHOLD_AMT
     * 
     */
    @JsonProperty("fab1099FedWholdAmt")
    public void setFab1099FedWholdAmt(Double fab1099FedWholdAmt) {
        this.fab1099FedWholdAmt = fab1099FedWholdAmt;
    }

    public _1099Reporting100PostRequest withFab1099FedWholdAmt(Double fab1099FedWholdAmt) {
        this.fab1099FedWholdAmt = fab1099FedWholdAmt;
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

    public _1099Reporting100PostRequest withCheckDate(Date checkDate) {
        this.checkDate = checkDate;
        return this;
    }

    /**
     * Owner Vendor ID
     * <p>
     * Lineage reference object : ftvvendVendOwner, Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("ftvvendVendOwner")
    public String getFtvvendVendOwner() {
        return ftvvendVendOwner;
    }

    /**
     * Owner Vendor ID
     * <p>
     * Lineage reference object : ftvvendVendOwner, Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("ftvvendVendOwner")
    public void setFtvvendVendOwner(String ftvvendVendOwner) {
        this.ftvvendVendOwner = ftvvendVendOwner;
    }

    public _1099Reporting100PostRequest withFtvvendVendOwner(String ftvvendVendOwner) {
        this.ftvvendVendOwner = ftvvendVendOwner;
        return this;
    }

    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * (Required)
     * 
     */
    @JsonProperty("fab1099ItypCode")
    public String getFab1099ItypCode() {
        return fab1099ItypCode;
    }

    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * (Required)
     * 
     */
    @JsonProperty("fab1099ItypCode")
    public void setFab1099ItypCode(String fab1099ItypCode) {
        this.fab1099ItypCode = fab1099ItypCode;
    }

    public _1099Reporting100PostRequest withFab1099ItypCode(String fab1099ItypCode) {
        this.fab1099ItypCode = fab1099ItypCode;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : faa1099VendCode, Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("faa1099VendCode")
    public String getFaa1099VendCode() {
        return faa1099VendCode;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : faa1099VendCode, Lookup lineage reference object : ftvvend
     * 
     */
    @JsonProperty("faa1099VendCode")
    public void setFaa1099VendCode(String faa1099VendCode) {
        this.faa1099VendCode = faa1099VendCode;
    }

    public _1099Reporting100PostRequest withFaa1099VendCode(String faa1099VendCode) {
        this.faa1099VendCode = faa1099VendCode;
        return this;
    }

    /**
     * State Previously Paid
     * <p>
     * Lineage reference object : FAB1099_ST_PAID_OVER_AMT
     * 
     */
    @JsonProperty("fab1099StPaidOverAmt")
    public Double getFab1099StPaidOverAmt() {
        return fab1099StPaidOverAmt;
    }

    /**
     * State Previously Paid
     * <p>
     * Lineage reference object : FAB1099_ST_PAID_OVER_AMT
     * 
     */
    @JsonProperty("fab1099StPaidOverAmt")
    public void setFab1099StPaidOverAmt(Double fab1099StPaidOverAmt) {
        this.fab1099StPaidOverAmt = fab1099StPaidOverAmt;
    }

    public _1099Reporting100PostRequest withFab1099StPaidOverAmt(Double fab1099StPaidOverAmt) {
        this.fab1099StPaidOverAmt = fab1099StPaidOverAmt;
        return this;
    }

    /**
     *  1099 Reporting ID
     * <p>
     * Lineage reference object : taxId
     * (Required)
     * 
     */
    @JsonProperty("taxID")
    public String getTaxID() {
        return taxID;
    }

    /**
     *  1099 Reporting ID
     * <p>
     * Lineage reference object : taxId
     * (Required)
     * 
     */
    @JsonProperty("taxID")
    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public _1099Reporting100PostRequest withTaxID(String taxID) {
        this.taxID = taxID;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FAB1099_INVH_CODE
     * (Required)
     * 
     */
    @JsonProperty("fab1099InvhCode")
    public String getFab1099InvhCode() {
        return fab1099InvhCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FAB1099_INVH_CODE
     * (Required)
     * 
     */
    @JsonProperty("fab1099InvhCode")
    public void setFab1099InvhCode(String fab1099InvhCode) {
        this.fab1099InvhCode = fab1099InvhCode;
    }

    public _1099Reporting100PostRequest withFab1099InvhCode(String fab1099InvhCode) {
        this.fab1099InvhCode = fab1099InvhCode;
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

    public _1099Reporting100PostRequest withRptAmt(Double rptAmt) {
        this.rptAmt = rptAmt;
        return this;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("fab1099InstTin")
    public String getFab1099InstTin() {
        return fab1099InstTin;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("fab1099InstTin")
    public void setFab1099InstTin(String fab1099InstTin) {
        this.fab1099InstTin = fab1099InstTin;
    }

    public _1099Reporting100PostRequest withFab1099InstTin(String fab1099InstTin) {
        this.fab1099InstTin = fab1099InstTin;
        return this;
    }

    /**
     * Federal Previously Paid
     * <p>
     * Lineage reference object : FAB1099_FED_PAID_OVER_AMT
     * 
     */
    @JsonProperty("fab1099FedPaidOverAmt")
    public Double getFab1099FedPaidOverAmt() {
        return fab1099FedPaidOverAmt;
    }

    /**
     * Federal Previously Paid
     * <p>
     * Lineage reference object : FAB1099_FED_PAID_OVER_AMT
     * 
     */
    @JsonProperty("fab1099FedPaidOverAmt")
    public void setFab1099FedPaidOverAmt(Double fab1099FedPaidOverAmt) {
        this.fab1099FedPaidOverAmt = fab1099FedPaidOverAmt;
    }

    public _1099Reporting100PostRequest withFab1099FedPaidOverAmt(Double fab1099FedPaidOverAmt) {
        this.fab1099FedPaidOverAmt = fab1099FedPaidOverAmt;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : faa1099RptYr
     * (Required)
     * 
     */
    @JsonProperty("faa1099RptYr")
    public String getFaa1099RptYr() {
        return faa1099RptYr;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : faa1099RptYr
     * (Required)
     * 
     */
    @JsonProperty("faa1099RptYr")
    public void setFaa1099RptYr(String faa1099RptYr) {
        this.faa1099RptYr = faa1099RptYr;
    }

    public _1099Reporting100PostRequest withFaa1099RptYr(String faa1099RptYr) {
        this.faa1099RptYr = faa1099RptYr;
        return this;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("instTin")
    public String getInstTin() {
        return instTin;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("instTin")
    public void setInstTin(String instTin) {
        this.instTin = instTin;
    }

    public _1099Reporting100PostRequest withInstTin(String instTin) {
        this.instTin = instTin;
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

    public _1099Reporting100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_1099Reporting100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("fab1099StWholdAmt");
        sb.append('=');
        sb.append(((this.fab1099StWholdAmt == null)?"<null>":this.fab1099StWholdAmt));
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
        sb.append("fab1099FedWholdAmt");
        sb.append('=');
        sb.append(((this.fab1099FedWholdAmt == null)?"<null>":this.fab1099FedWholdAmt));
        sb.append(',');
        sb.append("checkDate");
        sb.append('=');
        sb.append(((this.checkDate == null)?"<null>":this.checkDate));
        sb.append(',');
        sb.append("ftvvendVendOwner");
        sb.append('=');
        sb.append(((this.ftvvendVendOwner == null)?"<null>":this.ftvvendVendOwner));
        sb.append(',');
        sb.append("fab1099ItypCode");
        sb.append('=');
        sb.append(((this.fab1099ItypCode == null)?"<null>":this.fab1099ItypCode));
        sb.append(',');
        sb.append("faa1099VendCode");
        sb.append('=');
        sb.append(((this.faa1099VendCode == null)?"<null>":this.faa1099VendCode));
        sb.append(',');
        sb.append("fab1099StPaidOverAmt");
        sb.append('=');
        sb.append(((this.fab1099StPaidOverAmt == null)?"<null>":this.fab1099StPaidOverAmt));
        sb.append(',');
        sb.append("taxID");
        sb.append('=');
        sb.append(((this.taxID == null)?"<null>":this.taxID));
        sb.append(',');
        sb.append("fab1099InvhCode");
        sb.append('=');
        sb.append(((this.fab1099InvhCode == null)?"<null>":this.fab1099InvhCode));
        sb.append(',');
        sb.append("rptAmt");
        sb.append('=');
        sb.append(((this.rptAmt == null)?"<null>":this.rptAmt));
        sb.append(',');
        sb.append("fab1099InstTin");
        sb.append('=');
        sb.append(((this.fab1099InstTin == null)?"<null>":this.fab1099InstTin));
        sb.append(',');
        sb.append("fab1099FedPaidOverAmt");
        sb.append('=');
        sb.append(((this.fab1099FedPaidOverAmt == null)?"<null>":this.fab1099FedPaidOverAmt));
        sb.append(',');
        sb.append("faa1099RptYr");
        sb.append('=');
        sb.append(((this.faa1099RptYr == null)?"<null>":this.faa1099RptYr));
        sb.append(',');
        sb.append("instTin");
        sb.append('=');
        sb.append(((this.instTin == null)?"<null>":this.instTin));
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
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.fab1099StWholdAmt == null)? 0 :this.fab1099StWholdAmt.hashCode()));
        result = ((result* 31)+((this.checkNum == null)? 0 :this.checkNum.hashCode()));
        result = ((result* 31)+((this.cardNotPresent == null)? 0 :this.cardNotPresent.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.fab1099FedWholdAmt == null)? 0 :this.fab1099FedWholdAmt.hashCode()));
        result = ((result* 31)+((this.checkDate == null)? 0 :this.checkDate.hashCode()));
        result = ((result* 31)+((this.ftvvendVendOwner == null)? 0 :this.ftvvendVendOwner.hashCode()));
        result = ((result* 31)+((this.fab1099ItypCode == null)? 0 :this.fab1099ItypCode.hashCode()));
        result = ((result* 31)+((this.faa1099VendCode == null)? 0 :this.faa1099VendCode.hashCode()));
        result = ((result* 31)+((this.fab1099StPaidOverAmt == null)? 0 :this.fab1099StPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.taxID == null)? 0 :this.taxID.hashCode()));
        result = ((result* 31)+((this.fab1099InvhCode == null)? 0 :this.fab1099InvhCode.hashCode()));
        result = ((result* 31)+((this.rptAmt == null)? 0 :this.rptAmt.hashCode()));
        result = ((result* 31)+((this.fab1099InstTin == null)? 0 :this.fab1099InstTin.hashCode()));
        result = ((result* 31)+((this.fab1099FedPaidOverAmt == null)? 0 :this.fab1099FedPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.faa1099RptYr == null)? 0 :this.faa1099RptYr.hashCode()));
        result = ((result* 31)+((this.instTin == null)? 0 :this.instTin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _1099Reporting100PostRequest) == false) {
            return false;
        }
        _1099Reporting100PostRequest rhs = ((_1099Reporting100PostRequest) other);
        return ((((((((((((((((((((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode)))&&((this.fab1099StWholdAmt == rhs.fab1099StWholdAmt)||((this.fab1099StWholdAmt!= null)&&this.fab1099StWholdAmt.equals(rhs.fab1099StWholdAmt))))&&((this.checkNum == rhs.checkNum)||((this.checkNum!= null)&&this.checkNum.equals(rhs.checkNum))))&&((this.cardNotPresent == rhs.cardNotPresent)||((this.cardNotPresent!= null)&&this.cardNotPresent.equals(rhs.cardNotPresent))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.fab1099FedWholdAmt == rhs.fab1099FedWholdAmt)||((this.fab1099FedWholdAmt!= null)&&this.fab1099FedWholdAmt.equals(rhs.fab1099FedWholdAmt))))&&((this.checkDate == rhs.checkDate)||((this.checkDate!= null)&&this.checkDate.equals(rhs.checkDate))))&&((this.ftvvendVendOwner == rhs.ftvvendVendOwner)||((this.ftvvendVendOwner!= null)&&this.ftvvendVendOwner.equals(rhs.ftvvendVendOwner))))&&((this.fab1099ItypCode == rhs.fab1099ItypCode)||((this.fab1099ItypCode!= null)&&this.fab1099ItypCode.equals(rhs.fab1099ItypCode))))&&((this.faa1099VendCode == rhs.faa1099VendCode)||((this.faa1099VendCode!= null)&&this.faa1099VendCode.equals(rhs.faa1099VendCode))))&&((this.fab1099StPaidOverAmt == rhs.fab1099StPaidOverAmt)||((this.fab1099StPaidOverAmt!= null)&&this.fab1099StPaidOverAmt.equals(rhs.fab1099StPaidOverAmt))))&&((this.taxID == rhs.taxID)||((this.taxID!= null)&&this.taxID.equals(rhs.taxID))))&&((this.fab1099InvhCode == rhs.fab1099InvhCode)||((this.fab1099InvhCode!= null)&&this.fab1099InvhCode.equals(rhs.fab1099InvhCode))))&&((this.rptAmt == rhs.rptAmt)||((this.rptAmt!= null)&&this.rptAmt.equals(rhs.rptAmt))))&&((this.fab1099InstTin == rhs.fab1099InstTin)||((this.fab1099InstTin!= null)&&this.fab1099InstTin.equals(rhs.fab1099InstTin))))&&((this.fab1099FedPaidOverAmt == rhs.fab1099FedPaidOverAmt)||((this.fab1099FedPaidOverAmt!= null)&&this.fab1099FedPaidOverAmt.equals(rhs.fab1099FedPaidOverAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.faa1099RptYr == rhs.faa1099RptYr)||((this.faa1099RptYr!= null)&&this.faa1099RptYr.equals(rhs.faa1099RptYr))))&&((this.instTin == rhs.instTin)||((this.instTin!= null)&&this.instTin.equals(rhs.instTin))));
    }

}
