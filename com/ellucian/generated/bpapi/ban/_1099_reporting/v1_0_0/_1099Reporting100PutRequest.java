
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
    "criteria.rptId",
    "fab1099StWholdAmt",
    "checkNum",
    "coasCode",
    "fab1099FedWholdAmt",
    "criteria.cardNotPresent",
    "criteria.fab1099InstTin",
    "criteria.invhCode",
    "fab1099ItypCode",
    "criteria.stWholdAmt",
    "fab1099StPaidOverAmt",
    "criteria.rptAmt",
    "taxID",
    "criteria.coasCode",
    "rptAmt",
    "fab1099InstTin",
    "fab1099FedPaidOverAmt",
    "criteria.fedPaidOverAmt",
    "criteria.checkDate",
    "instTin",
    "bankCode",
    "cardNotPresent",
    "checkDate",
    "ftvvendVendOwner",
    "criteria.itypCode",
    "criteria.stPaidOverAmt",
    "faa1099VendCode",
    "criteria.fedWholdAmt",
    "criteria.checkNum",
    "fab1099InvhCode",
    "faa1099RptYr",
    "criteria.bankCode"
})
@Generated("jsonschema2pojo")
public class _1099Reporting100PutRequest {

    /**
     *  1099 Reporting ID
     * <p>
     * Lineage reference object : FAB1099_RPT_ID
     * 
     */
    @JsonProperty("criteria.rptId")
    @JsonPropertyDescription("Lineage reference object : FAB1099_RPT_ID")
    private String criteriaRptId;
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
     * Card Not Present
     * <p>
     * Lineage reference object : FAB1099_CARD_NOT_PRESENT
     * 
     */
    @JsonProperty("criteria.cardNotPresent")
    @JsonPropertyDescription("Lineage reference object : FAB1099_CARD_NOT_PRESENT")
    private Double criteriaCardNotPresent;
    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("criteria.fab1099InstTin")
    @JsonPropertyDescription("Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099")
    private String criteriaFab1099InstTin;
    /**
     * Document
     * <p>
     * Lineage reference object : FAB1099_INVH_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.invhCode")
    @JsonPropertyDescription("Lineage reference object : FAB1099_INVH_CODE")
    private String criteriaInvhCode;
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
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("criteria.stWholdAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_ST_WHOLD_AMT")
    private Double criteriaStWholdAmt;
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
     * Reported Amount
     * <p>
     * Lineage reference object : FAB1099_RPT_AMT
     * 
     */
    @JsonProperty("criteria.rptAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_RPT_AMT")
    private Double criteriaRptAmt;
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
     * Chart
     * <p>
     * Lineage reference object : FAB1099_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FAB1099_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
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
     * Federal Previously Paid
     * <p>
     * Lineage reference object : FAB1099_FED_PAID_OVER_AMT
     * 
     */
    @JsonProperty("criteria.fedPaidOverAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_FED_PAID_OVER_AMT")
    private Double criteriaFedPaidOverAmt;
    /**
     * Check Date
     * <p>
     * Lineage reference object : FAB1099_CHECK_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkDate")
    @JsonPropertyDescription("Lineage reference object : FAB1099_CHECK_DATE")
    private Date criteriaCheckDate;
    /**
     * Payer TIN
     * <p>
     * Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("instTin")
    @JsonPropertyDescription("Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099")
    private String instTin;
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
     * Card Not Present
     * <p>
     * Lineage reference object : FAB1099_CARD_NOT_PRESENT
     * 
     */
    @JsonProperty("cardNotPresent")
    @JsonPropertyDescription("Lineage reference object : FAB1099_CARD_NOT_PRESENT")
    private Double cardNotPresent;
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
    @JsonProperty("criteria.itypCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvityp")
    private String criteriaItypCode;
    /**
     * State Previously Paid
     * <p>
     * Lineage reference object : FAB1099_ST_PAID_OVER_AMT
     * 
     */
    @JsonProperty("criteria.stPaidOverAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_ST_PAID_OVER_AMT")
    private Double criteriaStPaidOverAmt;
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
     * Federal Withheld
     * <p>
     * Lineage reference object : FAB1099_FED_WHOLD_AMT
     * 
     */
    @JsonProperty("criteria.fedWholdAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_FED_WHOLD_AMT")
    private Double criteriaFedWholdAmt;
    /**
     * Check Number
     * <p>
     * Lineage reference object : FAB1099_CHECK_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkNum")
    @JsonPropertyDescription("Lineage reference object : FAB1099_CHECK_NUM")
    private String criteriaCheckNum;
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
     * Bank
     * <p>
     * Lineage reference object : FAB1099_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankCode")
    @JsonPropertyDescription("Lineage reference object : FAB1099_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String criteriaBankCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *  1099 Reporting ID
     * <p>
     * Lineage reference object : FAB1099_RPT_ID
     * 
     */
    @JsonProperty("criteria.rptId")
    public String getCriteriaRptId() {
        return criteriaRptId;
    }

    /**
     *  1099 Reporting ID
     * <p>
     * Lineage reference object : FAB1099_RPT_ID
     * 
     */
    @JsonProperty("criteria.rptId")
    public void setCriteriaRptId(String criteriaRptId) {
        this.criteriaRptId = criteriaRptId;
    }

    public _1099Reporting100PutRequest withCriteriaRptId(String criteriaRptId) {
        this.criteriaRptId = criteriaRptId;
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

    public _1099Reporting100PutRequest withFab1099StWholdAmt(Double fab1099StWholdAmt) {
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

    public _1099Reporting100PutRequest withCheckNum(String checkNum) {
        this.checkNum = checkNum;
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

    public _1099Reporting100PutRequest withCoasCode(String coasCode) {
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

    public _1099Reporting100PutRequest withFab1099FedWholdAmt(Double fab1099FedWholdAmt) {
        this.fab1099FedWholdAmt = fab1099FedWholdAmt;
        return this;
    }

    /**
     * Card Not Present
     * <p>
     * Lineage reference object : FAB1099_CARD_NOT_PRESENT
     * 
     */
    @JsonProperty("criteria.cardNotPresent")
    public Double getCriteriaCardNotPresent() {
        return criteriaCardNotPresent;
    }

    /**
     * Card Not Present
     * <p>
     * Lineage reference object : FAB1099_CARD_NOT_PRESENT
     * 
     */
    @JsonProperty("criteria.cardNotPresent")
    public void setCriteriaCardNotPresent(Double criteriaCardNotPresent) {
        this.criteriaCardNotPresent = criteriaCardNotPresent;
    }

    public _1099Reporting100PutRequest withCriteriaCardNotPresent(Double criteriaCardNotPresent) {
        this.criteriaCardNotPresent = criteriaCardNotPresent;
        return this;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("criteria.fab1099InstTin")
    public String getCriteriaFab1099InstTin() {
        return criteriaFab1099InstTin;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("criteria.fab1099InstTin")
    public void setCriteriaFab1099InstTin(String criteriaFab1099InstTin) {
        this.criteriaFab1099InstTin = criteriaFab1099InstTin;
    }

    public _1099Reporting100PutRequest withCriteriaFab1099InstTin(String criteriaFab1099InstTin) {
        this.criteriaFab1099InstTin = criteriaFab1099InstTin;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FAB1099_INVH_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.invhCode")
    public String getCriteriaInvhCode() {
        return criteriaInvhCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FAB1099_INVH_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.invhCode")
    public void setCriteriaInvhCode(String criteriaInvhCode) {
        this.criteriaInvhCode = criteriaInvhCode;
    }

    public _1099Reporting100PutRequest withCriteriaInvhCode(String criteriaInvhCode) {
        this.criteriaInvhCode = criteriaInvhCode;
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

    public _1099Reporting100PutRequest withFab1099ItypCode(String fab1099ItypCode) {
        this.fab1099ItypCode = fab1099ItypCode;
        return this;
    }

    /**
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("criteria.stWholdAmt")
    public Double getCriteriaStWholdAmt() {
        return criteriaStWholdAmt;
    }

    /**
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("criteria.stWholdAmt")
    public void setCriteriaStWholdAmt(Double criteriaStWholdAmt) {
        this.criteriaStWholdAmt = criteriaStWholdAmt;
    }

    public _1099Reporting100PutRequest withCriteriaStWholdAmt(Double criteriaStWholdAmt) {
        this.criteriaStWholdAmt = criteriaStWholdAmt;
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

    public _1099Reporting100PutRequest withFab1099StPaidOverAmt(Double fab1099StPaidOverAmt) {
        this.fab1099StPaidOverAmt = fab1099StPaidOverAmt;
        return this;
    }

    /**
     * Reported Amount
     * <p>
     * Lineage reference object : FAB1099_RPT_AMT
     * 
     */
    @JsonProperty("criteria.rptAmt")
    public Double getCriteriaRptAmt() {
        return criteriaRptAmt;
    }

    /**
     * Reported Amount
     * <p>
     * Lineage reference object : FAB1099_RPT_AMT
     * 
     */
    @JsonProperty("criteria.rptAmt")
    public void setCriteriaRptAmt(Double criteriaRptAmt) {
        this.criteriaRptAmt = criteriaRptAmt;
    }

    public _1099Reporting100PutRequest withCriteriaRptAmt(Double criteriaRptAmt) {
        this.criteriaRptAmt = criteriaRptAmt;
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

    public _1099Reporting100PutRequest withTaxID(String taxID) {
        this.taxID = taxID;
        return this;
    }

    /**
     * Chart
     * <p>
     * Lineage reference object : FAB1099_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart
     * <p>
     * Lineage reference object : FAB1099_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public _1099Reporting100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
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

    public _1099Reporting100PutRequest withRptAmt(Double rptAmt) {
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

    public _1099Reporting100PutRequest withFab1099InstTin(String fab1099InstTin) {
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

    public _1099Reporting100PutRequest withFab1099FedPaidOverAmt(Double fab1099FedPaidOverAmt) {
        this.fab1099FedPaidOverAmt = fab1099FedPaidOverAmt;
        return this;
    }

    /**
     * Federal Previously Paid
     * <p>
     * Lineage reference object : FAB1099_FED_PAID_OVER_AMT
     * 
     */
    @JsonProperty("criteria.fedPaidOverAmt")
    public Double getCriteriaFedPaidOverAmt() {
        return criteriaFedPaidOverAmt;
    }

    /**
     * Federal Previously Paid
     * <p>
     * Lineage reference object : FAB1099_FED_PAID_OVER_AMT
     * 
     */
    @JsonProperty("criteria.fedPaidOverAmt")
    public void setCriteriaFedPaidOverAmt(Double criteriaFedPaidOverAmt) {
        this.criteriaFedPaidOverAmt = criteriaFedPaidOverAmt;
    }

    public _1099Reporting100PutRequest withCriteriaFedPaidOverAmt(Double criteriaFedPaidOverAmt) {
        this.criteriaFedPaidOverAmt = criteriaFedPaidOverAmt;
        return this;
    }

    /**
     * Check Date
     * <p>
     * Lineage reference object : FAB1099_CHECK_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkDate")
    public Date getCriteriaCheckDate() {
        return criteriaCheckDate;
    }

    /**
     * Check Date
     * <p>
     * Lineage reference object : FAB1099_CHECK_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkDate")
    public void setCriteriaCheckDate(Date criteriaCheckDate) {
        this.criteriaCheckDate = criteriaCheckDate;
    }

    public _1099Reporting100PutRequest withCriteriaCheckDate(Date criteriaCheckDate) {
        this.criteriaCheckDate = criteriaCheckDate;
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

    public _1099Reporting100PutRequest withInstTin(String instTin) {
        this.instTin = instTin;
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

    public _1099Reporting100PutRequest withBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public _1099Reporting100PutRequest withCardNotPresent(Double cardNotPresent) {
        this.cardNotPresent = cardNotPresent;
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

    public _1099Reporting100PutRequest withCheckDate(Date checkDate) {
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

    public _1099Reporting100PutRequest withFtvvendVendOwner(String ftvvendVendOwner) {
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
    @JsonProperty("criteria.itypCode")
    public String getCriteriaItypCode() {
        return criteriaItypCode;
    }

    /**
     * Income Type
     * <p>
     * Lookup lineage reference object : ftvityp
     * (Required)
     * 
     */
    @JsonProperty("criteria.itypCode")
    public void setCriteriaItypCode(String criteriaItypCode) {
        this.criteriaItypCode = criteriaItypCode;
    }

    public _1099Reporting100PutRequest withCriteriaItypCode(String criteriaItypCode) {
        this.criteriaItypCode = criteriaItypCode;
        return this;
    }

    /**
     * State Previously Paid
     * <p>
     * Lineage reference object : FAB1099_ST_PAID_OVER_AMT
     * 
     */
    @JsonProperty("criteria.stPaidOverAmt")
    public Double getCriteriaStPaidOverAmt() {
        return criteriaStPaidOverAmt;
    }

    /**
     * State Previously Paid
     * <p>
     * Lineage reference object : FAB1099_ST_PAID_OVER_AMT
     * 
     */
    @JsonProperty("criteria.stPaidOverAmt")
    public void setCriteriaStPaidOverAmt(Double criteriaStPaidOverAmt) {
        this.criteriaStPaidOverAmt = criteriaStPaidOverAmt;
    }

    public _1099Reporting100PutRequest withCriteriaStPaidOverAmt(Double criteriaStPaidOverAmt) {
        this.criteriaStPaidOverAmt = criteriaStPaidOverAmt;
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

    public _1099Reporting100PutRequest withFaa1099VendCode(String faa1099VendCode) {
        this.faa1099VendCode = faa1099VendCode;
        return this;
    }

    /**
     * Federal Withheld
     * <p>
     * Lineage reference object : FAB1099_FED_WHOLD_AMT
     * 
     */
    @JsonProperty("criteria.fedWholdAmt")
    public Double getCriteriaFedWholdAmt() {
        return criteriaFedWholdAmt;
    }

    /**
     * Federal Withheld
     * <p>
     * Lineage reference object : FAB1099_FED_WHOLD_AMT
     * 
     */
    @JsonProperty("criteria.fedWholdAmt")
    public void setCriteriaFedWholdAmt(Double criteriaFedWholdAmt) {
        this.criteriaFedWholdAmt = criteriaFedWholdAmt;
    }

    public _1099Reporting100PutRequest withCriteriaFedWholdAmt(Double criteriaFedWholdAmt) {
        this.criteriaFedWholdAmt = criteriaFedWholdAmt;
        return this;
    }

    /**
     * Check Number
     * <p>
     * Lineage reference object : FAB1099_CHECK_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkNum")
    public String getCriteriaCheckNum() {
        return criteriaCheckNum;
    }

    /**
     * Check Number
     * <p>
     * Lineage reference object : FAB1099_CHECK_NUM
     * (Required)
     * 
     */
    @JsonProperty("criteria.checkNum")
    public void setCriteriaCheckNum(String criteriaCheckNum) {
        this.criteriaCheckNum = criteriaCheckNum;
    }

    public _1099Reporting100PutRequest withCriteriaCheckNum(String criteriaCheckNum) {
        this.criteriaCheckNum = criteriaCheckNum;
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

    public _1099Reporting100PutRequest withFab1099InvhCode(String fab1099InvhCode) {
        this.fab1099InvhCode = fab1099InvhCode;
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

    public _1099Reporting100PutRequest withFaa1099RptYr(String faa1099RptYr) {
        this.faa1099RptYr = faa1099RptYr;
        return this;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FAB1099_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankCode")
    public String getCriteriaBankCode() {
        return criteriaBankCode;
    }

    /**
     * Bank
     * <p>
     * Lineage reference object : FAB1099_BANK_CODE, Lookup lineage reference object : gxvbank
     * (Required)
     * 
     */
    @JsonProperty("criteria.bankCode")
    public void setCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
    }

    public _1099Reporting100PutRequest withCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
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

    public _1099Reporting100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_1099Reporting100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaRptId");
        sb.append('=');
        sb.append(((this.criteriaRptId == null)?"<null>":this.criteriaRptId));
        sb.append(',');
        sb.append("fab1099StWholdAmt");
        sb.append('=');
        sb.append(((this.fab1099StWholdAmt == null)?"<null>":this.fab1099StWholdAmt));
        sb.append(',');
        sb.append("checkNum");
        sb.append('=');
        sb.append(((this.checkNum == null)?"<null>":this.checkNum));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("fab1099FedWholdAmt");
        sb.append('=');
        sb.append(((this.fab1099FedWholdAmt == null)?"<null>":this.fab1099FedWholdAmt));
        sb.append(',');
        sb.append("criteriaCardNotPresent");
        sb.append('=');
        sb.append(((this.criteriaCardNotPresent == null)?"<null>":this.criteriaCardNotPresent));
        sb.append(',');
        sb.append("criteriaFab1099InstTin");
        sb.append('=');
        sb.append(((this.criteriaFab1099InstTin == null)?"<null>":this.criteriaFab1099InstTin));
        sb.append(',');
        sb.append("criteriaInvhCode");
        sb.append('=');
        sb.append(((this.criteriaInvhCode == null)?"<null>":this.criteriaInvhCode));
        sb.append(',');
        sb.append("fab1099ItypCode");
        sb.append('=');
        sb.append(((this.fab1099ItypCode == null)?"<null>":this.fab1099ItypCode));
        sb.append(',');
        sb.append("criteriaStWholdAmt");
        sb.append('=');
        sb.append(((this.criteriaStWholdAmt == null)?"<null>":this.criteriaStWholdAmt));
        sb.append(',');
        sb.append("fab1099StPaidOverAmt");
        sb.append('=');
        sb.append(((this.fab1099StPaidOverAmt == null)?"<null>":this.fab1099StPaidOverAmt));
        sb.append(',');
        sb.append("criteriaRptAmt");
        sb.append('=');
        sb.append(((this.criteriaRptAmt == null)?"<null>":this.criteriaRptAmt));
        sb.append(',');
        sb.append("taxID");
        sb.append('=');
        sb.append(((this.taxID == null)?"<null>":this.taxID));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
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
        sb.append("criteriaFedPaidOverAmt");
        sb.append('=');
        sb.append(((this.criteriaFedPaidOverAmt == null)?"<null>":this.criteriaFedPaidOverAmt));
        sb.append(',');
        sb.append("criteriaCheckDate");
        sb.append('=');
        sb.append(((this.criteriaCheckDate == null)?"<null>":this.criteriaCheckDate));
        sb.append(',');
        sb.append("instTin");
        sb.append('=');
        sb.append(((this.instTin == null)?"<null>":this.instTin));
        sb.append(',');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("cardNotPresent");
        sb.append('=');
        sb.append(((this.cardNotPresent == null)?"<null>":this.cardNotPresent));
        sb.append(',');
        sb.append("checkDate");
        sb.append('=');
        sb.append(((this.checkDate == null)?"<null>":this.checkDate));
        sb.append(',');
        sb.append("ftvvendVendOwner");
        sb.append('=');
        sb.append(((this.ftvvendVendOwner == null)?"<null>":this.ftvvendVendOwner));
        sb.append(',');
        sb.append("criteriaItypCode");
        sb.append('=');
        sb.append(((this.criteriaItypCode == null)?"<null>":this.criteriaItypCode));
        sb.append(',');
        sb.append("criteriaStPaidOverAmt");
        sb.append('=');
        sb.append(((this.criteriaStPaidOverAmt == null)?"<null>":this.criteriaStPaidOverAmt));
        sb.append(',');
        sb.append("faa1099VendCode");
        sb.append('=');
        sb.append(((this.faa1099VendCode == null)?"<null>":this.faa1099VendCode));
        sb.append(',');
        sb.append("criteriaFedWholdAmt");
        sb.append('=');
        sb.append(((this.criteriaFedWholdAmt == null)?"<null>":this.criteriaFedWholdAmt));
        sb.append(',');
        sb.append("criteriaCheckNum");
        sb.append('=');
        sb.append(((this.criteriaCheckNum == null)?"<null>":this.criteriaCheckNum));
        sb.append(',');
        sb.append("fab1099InvhCode");
        sb.append('=');
        sb.append(((this.fab1099InvhCode == null)?"<null>":this.fab1099InvhCode));
        sb.append(',');
        sb.append("faa1099RptYr");
        sb.append('=');
        sb.append(((this.faa1099RptYr == null)?"<null>":this.faa1099RptYr));
        sb.append(',');
        sb.append("criteriaBankCode");
        sb.append('=');
        sb.append(((this.criteriaBankCode == null)?"<null>":this.criteriaBankCode));
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
        result = ((result* 31)+((this.fab1099StWholdAmt == null)? 0 :this.fab1099StWholdAmt.hashCode()));
        result = ((result* 31)+((this.checkNum == null)? 0 :this.checkNum.hashCode()));
        result = ((result* 31)+((this.criteriaRptAmt == null)? 0 :this.criteriaRptAmt.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaStPaidOverAmt == null)? 0 :this.criteriaStPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.criteriaCheckDate == null)? 0 :this.criteriaCheckDate.hashCode()));
        result = ((result* 31)+((this.fab1099FedWholdAmt == null)? 0 :this.fab1099FedWholdAmt.hashCode()));
        result = ((result* 31)+((this.fab1099ItypCode == null)? 0 :this.fab1099ItypCode.hashCode()));
        result = ((result* 31)+((this.fab1099StPaidOverAmt == null)? 0 :this.fab1099StPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.taxID == null)? 0 :this.taxID.hashCode()));
        result = ((result* 31)+((this.rptAmt == null)? 0 :this.rptAmt.hashCode()));
        result = ((result* 31)+((this.fab1099InstTin == null)? 0 :this.fab1099InstTin.hashCode()));
        result = ((result* 31)+((this.fab1099FedPaidOverAmt == null)? 0 :this.fab1099FedPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.criteriaRptId == null)? 0 :this.criteriaRptId.hashCode()));
        result = ((result* 31)+((this.criteriaCardNotPresent == null)? 0 :this.criteriaCardNotPresent.hashCode()));
        result = ((result* 31)+((this.instTin == null)? 0 :this.instTin.hashCode()));
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.cardNotPresent == null)? 0 :this.cardNotPresent.hashCode()));
        result = ((result* 31)+((this.criteriaStWholdAmt == null)? 0 :this.criteriaStWholdAmt.hashCode()));
        result = ((result* 31)+((this.criteriaInvhCode == null)? 0 :this.criteriaInvhCode.hashCode()));
        result = ((result* 31)+((this.criteriaFedPaidOverAmt == null)? 0 :this.criteriaFedPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.checkDate == null)? 0 :this.checkDate.hashCode()));
        result = ((result* 31)+((this.ftvvendVendOwner == null)? 0 :this.ftvvendVendOwner.hashCode()));
        result = ((result* 31)+((this.criteriaFedWholdAmt == null)? 0 :this.criteriaFedWholdAmt.hashCode()));
        result = ((result* 31)+((this.faa1099VendCode == null)? 0 :this.faa1099VendCode.hashCode()));
        result = ((result* 31)+((this.criteriaItypCode == null)? 0 :this.criteriaItypCode.hashCode()));
        result = ((result* 31)+((this.criteriaCheckNum == null)? 0 :this.criteriaCheckNum.hashCode()));
        result = ((result* 31)+((this.fab1099InvhCode == null)? 0 :this.fab1099InvhCode.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFab1099InstTin == null)? 0 :this.criteriaFab1099InstTin.hashCode()));
        result = ((result* 31)+((this.faa1099RptYr == null)? 0 :this.faa1099RptYr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _1099Reporting100PutRequest) == false) {
            return false;
        }
        _1099Reporting100PutRequest rhs = ((_1099Reporting100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((this.fab1099StWholdAmt == rhs.fab1099StWholdAmt)||((this.fab1099StWholdAmt!= null)&&this.fab1099StWholdAmt.equals(rhs.fab1099StWholdAmt)))&&((this.checkNum == rhs.checkNum)||((this.checkNum!= null)&&this.checkNum.equals(rhs.checkNum))))&&((this.criteriaRptAmt == rhs.criteriaRptAmt)||((this.criteriaRptAmt!= null)&&this.criteriaRptAmt.equals(rhs.criteriaRptAmt))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaStPaidOverAmt == rhs.criteriaStPaidOverAmt)||((this.criteriaStPaidOverAmt!= null)&&this.criteriaStPaidOverAmt.equals(rhs.criteriaStPaidOverAmt))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.criteriaCheckDate == rhs.criteriaCheckDate)||((this.criteriaCheckDate!= null)&&this.criteriaCheckDate.equals(rhs.criteriaCheckDate))))&&((this.fab1099FedWholdAmt == rhs.fab1099FedWholdAmt)||((this.fab1099FedWholdAmt!= null)&&this.fab1099FedWholdAmt.equals(rhs.fab1099FedWholdAmt))))&&((this.fab1099ItypCode == rhs.fab1099ItypCode)||((this.fab1099ItypCode!= null)&&this.fab1099ItypCode.equals(rhs.fab1099ItypCode))))&&((this.fab1099StPaidOverAmt == rhs.fab1099StPaidOverAmt)||((this.fab1099StPaidOverAmt!= null)&&this.fab1099StPaidOverAmt.equals(rhs.fab1099StPaidOverAmt))))&&((this.taxID == rhs.taxID)||((this.taxID!= null)&&this.taxID.equals(rhs.taxID))))&&((this.rptAmt == rhs.rptAmt)||((this.rptAmt!= null)&&this.rptAmt.equals(rhs.rptAmt))))&&((this.fab1099InstTin == rhs.fab1099InstTin)||((this.fab1099InstTin!= null)&&this.fab1099InstTin.equals(rhs.fab1099InstTin))))&&((this.fab1099FedPaidOverAmt == rhs.fab1099FedPaidOverAmt)||((this.fab1099FedPaidOverAmt!= null)&&this.fab1099FedPaidOverAmt.equals(rhs.fab1099FedPaidOverAmt))))&&((this.criteriaRptId == rhs.criteriaRptId)||((this.criteriaRptId!= null)&&this.criteriaRptId.equals(rhs.criteriaRptId))))&&((this.criteriaCardNotPresent == rhs.criteriaCardNotPresent)||((this.criteriaCardNotPresent!= null)&&this.criteriaCardNotPresent.equals(rhs.criteriaCardNotPresent))))&&((this.instTin == rhs.instTin)||((this.instTin!= null)&&this.instTin.equals(rhs.instTin))))&&((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode))))&&((this.cardNotPresent == rhs.cardNotPresent)||((this.cardNotPresent!= null)&&this.cardNotPresent.equals(rhs.cardNotPresent))))&&((this.criteriaStWholdAmt == rhs.criteriaStWholdAmt)||((this.criteriaStWholdAmt!= null)&&this.criteriaStWholdAmt.equals(rhs.criteriaStWholdAmt))))&&((this.criteriaInvhCode == rhs.criteriaInvhCode)||((this.criteriaInvhCode!= null)&&this.criteriaInvhCode.equals(rhs.criteriaInvhCode))))&&((this.criteriaFedPaidOverAmt == rhs.criteriaFedPaidOverAmt)||((this.criteriaFedPaidOverAmt!= null)&&this.criteriaFedPaidOverAmt.equals(rhs.criteriaFedPaidOverAmt))))&&((this.checkDate == rhs.checkDate)||((this.checkDate!= null)&&this.checkDate.equals(rhs.checkDate))))&&((this.ftvvendVendOwner == rhs.ftvvendVendOwner)||((this.ftvvendVendOwner!= null)&&this.ftvvendVendOwner.equals(rhs.ftvvendVendOwner))))&&((this.criteriaFedWholdAmt == rhs.criteriaFedWholdAmt)||((this.criteriaFedWholdAmt!= null)&&this.criteriaFedWholdAmt.equals(rhs.criteriaFedWholdAmt))))&&((this.faa1099VendCode == rhs.faa1099VendCode)||((this.faa1099VendCode!= null)&&this.faa1099VendCode.equals(rhs.faa1099VendCode))))&&((this.criteriaItypCode == rhs.criteriaItypCode)||((this.criteriaItypCode!= null)&&this.criteriaItypCode.equals(rhs.criteriaItypCode))))&&((this.criteriaCheckNum == rhs.criteriaCheckNum)||((this.criteriaCheckNum!= null)&&this.criteriaCheckNum.equals(rhs.criteriaCheckNum))))&&((this.fab1099InvhCode == rhs.fab1099InvhCode)||((this.fab1099InvhCode!= null)&&this.fab1099InvhCode.equals(rhs.fab1099InvhCode))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFab1099InstTin == rhs.criteriaFab1099InstTin)||((this.criteriaFab1099InstTin!= null)&&this.criteriaFab1099InstTin.equals(rhs.criteriaFab1099InstTin))))&&((this.faa1099RptYr == rhs.faa1099RptYr)||((this.faa1099RptYr!= null)&&this.faa1099RptYr.equals(rhs.faa1099RptYr))));
    }

}
