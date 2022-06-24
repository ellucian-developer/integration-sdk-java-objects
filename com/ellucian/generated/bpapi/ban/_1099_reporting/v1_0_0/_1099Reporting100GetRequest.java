
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
    "criteria.cardNotPresent",
    "ftvvendVendOwner",
    "criteria.itypCode",
    "criteria.invhCode",
    "criteria.instTin",
    "criteria.stPaidOverAmt",
    "faa1099VendCode",
    "criteria.fedWholdAmt",
    "criteria.stWholdAmt",
    "criteria.rptAmt",
    "criteria.checkNum",
    "taxID",
    "tin",
    "criteria.coasCode",
    "criteria.fedPaidOverAmt",
    "criteria.checkDate",
    "faa1099RptYr",
    "criteria.bankCode"
})
@Generated("jsonschema2pojo")
public class _1099Reporting100GetRequest {

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
     * Card Not Present
     * <p>
     * Lineage reference object : FAB1099_CARD_NOT_PRESENT
     * 
     */
    @JsonProperty("criteria.cardNotPresent")
    @JsonPropertyDescription("Lineage reference object : FAB1099_CARD_NOT_PRESENT")
    private Double criteriaCardNotPresent;
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
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("criteria.instTin")
    @JsonPropertyDescription("Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099")
    private String criteriaInstTin;
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
     * State Withheld
     * <p>
     * Lineage reference object : FAB1099_ST_WHOLD_AMT
     * 
     */
    @JsonProperty("criteria.stWholdAmt")
    @JsonPropertyDescription("Lineage reference object : FAB1099_ST_WHOLD_AMT")
    private Double criteriaStWholdAmt;
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
     * Payer TIN
     * <p>
     * Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("tin")
    @JsonPropertyDescription("Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099")
    private String tin;
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

    public _1099Reporting100GetRequest withCriteriaRptId(String criteriaRptId) {
        this.criteriaRptId = criteriaRptId;
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

    public _1099Reporting100GetRequest withCriteriaCardNotPresent(Double criteriaCardNotPresent) {
        this.criteriaCardNotPresent = criteriaCardNotPresent;
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

    public _1099Reporting100GetRequest withFtvvendVendOwner(String ftvvendVendOwner) {
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

    public _1099Reporting100GetRequest withCriteriaItypCode(String criteriaItypCode) {
        this.criteriaItypCode = criteriaItypCode;
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

    public _1099Reporting100GetRequest withCriteriaInvhCode(String criteriaInvhCode) {
        this.criteriaInvhCode = criteriaInvhCode;
        return this;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("criteria.instTin")
    public String getCriteriaInstTin() {
        return criteriaInstTin;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : FAB1099_INST_TIN, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("criteria.instTin")
    public void setCriteriaInstTin(String criteriaInstTin) {
        this.criteriaInstTin = criteriaInstTin;
    }

    public _1099Reporting100GetRequest withCriteriaInstTin(String criteriaInstTin) {
        this.criteriaInstTin = criteriaInstTin;
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

    public _1099Reporting100GetRequest withCriteriaStPaidOverAmt(Double criteriaStPaidOverAmt) {
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

    public _1099Reporting100GetRequest withFaa1099VendCode(String faa1099VendCode) {
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

    public _1099Reporting100GetRequest withCriteriaFedWholdAmt(Double criteriaFedWholdAmt) {
        this.criteriaFedWholdAmt = criteriaFedWholdAmt;
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

    public _1099Reporting100GetRequest withCriteriaStWholdAmt(Double criteriaStWholdAmt) {
        this.criteriaStWholdAmt = criteriaStWholdAmt;
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

    public _1099Reporting100GetRequest withCriteriaRptAmt(Double criteriaRptAmt) {
        this.criteriaRptAmt = criteriaRptAmt;
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

    public _1099Reporting100GetRequest withCriteriaCheckNum(String criteriaCheckNum) {
        this.criteriaCheckNum = criteriaCheckNum;
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

    public _1099Reporting100GetRequest withTaxID(String taxID) {
        this.taxID = taxID;
        return this;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("tin")
    public String getTin() {
        return tin;
    }

    /**
     * Payer TIN
     * <p>
     * Lineage reference object : instTin, Lookup lineage reference object : fob1099,for1099
     * 
     */
    @JsonProperty("tin")
    public void setTin(String tin) {
        this.tin = tin;
    }

    public _1099Reporting100GetRequest withTin(String tin) {
        this.tin = tin;
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

    public _1099Reporting100GetRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
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

    public _1099Reporting100GetRequest withCriteriaFedPaidOverAmt(Double criteriaFedPaidOverAmt) {
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

    public _1099Reporting100GetRequest withCriteriaCheckDate(Date criteriaCheckDate) {
        this.criteriaCheckDate = criteriaCheckDate;
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

    public _1099Reporting100GetRequest withFaa1099RptYr(String faa1099RptYr) {
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

    public _1099Reporting100GetRequest withCriteriaBankCode(String criteriaBankCode) {
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

    public _1099Reporting100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_1099Reporting100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaRptId");
        sb.append('=');
        sb.append(((this.criteriaRptId == null)?"<null>":this.criteriaRptId));
        sb.append(',');
        sb.append("criteriaCardNotPresent");
        sb.append('=');
        sb.append(((this.criteriaCardNotPresent == null)?"<null>":this.criteriaCardNotPresent));
        sb.append(',');
        sb.append("ftvvendVendOwner");
        sb.append('=');
        sb.append(((this.ftvvendVendOwner == null)?"<null>":this.ftvvendVendOwner));
        sb.append(',');
        sb.append("criteriaItypCode");
        sb.append('=');
        sb.append(((this.criteriaItypCode == null)?"<null>":this.criteriaItypCode));
        sb.append(',');
        sb.append("criteriaInvhCode");
        sb.append('=');
        sb.append(((this.criteriaInvhCode == null)?"<null>":this.criteriaInvhCode));
        sb.append(',');
        sb.append("criteriaInstTin");
        sb.append('=');
        sb.append(((this.criteriaInstTin == null)?"<null>":this.criteriaInstTin));
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
        sb.append("criteriaStWholdAmt");
        sb.append('=');
        sb.append(((this.criteriaStWholdAmt == null)?"<null>":this.criteriaStWholdAmt));
        sb.append(',');
        sb.append("criteriaRptAmt");
        sb.append('=');
        sb.append(((this.criteriaRptAmt == null)?"<null>":this.criteriaRptAmt));
        sb.append(',');
        sb.append("criteriaCheckNum");
        sb.append('=');
        sb.append(((this.criteriaCheckNum == null)?"<null>":this.criteriaCheckNum));
        sb.append(',');
        sb.append("taxID");
        sb.append('=');
        sb.append(((this.taxID == null)?"<null>":this.taxID));
        sb.append(',');
        sb.append("tin");
        sb.append('=');
        sb.append(((this.tin == null)?"<null>":this.tin));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaFedPaidOverAmt");
        sb.append('=');
        sb.append(((this.criteriaFedPaidOverAmt == null)?"<null>":this.criteriaFedPaidOverAmt));
        sb.append(',');
        sb.append("criteriaCheckDate");
        sb.append('=');
        sb.append(((this.criteriaCheckDate == null)?"<null>":this.criteriaCheckDate));
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
        result = ((result* 31)+((this.criteriaRptAmt == null)? 0 :this.criteriaRptAmt.hashCode()));
        result = ((result* 31)+((this.criteriaInstTin == null)? 0 :this.criteriaInstTin.hashCode()));
        result = ((result* 31)+((this.criteriaStPaidOverAmt == null)? 0 :this.criteriaStPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaCheckDate == null)? 0 :this.criteriaCheckDate.hashCode()));
        result = ((result* 31)+((this.criteriaStWholdAmt == null)? 0 :this.criteriaStWholdAmt.hashCode()));
        result = ((result* 31)+((this.criteriaInvhCode == null)? 0 :this.criteriaInvhCode.hashCode()));
        result = ((result* 31)+((this.criteriaFedPaidOverAmt == null)? 0 :this.criteriaFedPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.ftvvendVendOwner == null)? 0 :this.ftvvendVendOwner.hashCode()));
        result = ((result* 31)+((this.criteriaFedWholdAmt == null)? 0 :this.criteriaFedWholdAmt.hashCode()));
        result = ((result* 31)+((this.faa1099VendCode == null)? 0 :this.faa1099VendCode.hashCode()));
        result = ((result* 31)+((this.criteriaItypCode == null)? 0 :this.criteriaItypCode.hashCode()));
        result = ((result* 31)+((this.taxID == null)? 0 :this.taxID.hashCode()));
        result = ((result* 31)+((this.criteriaCheckNum == null)? 0 :this.criteriaCheckNum.hashCode()));
        result = ((result* 31)+((this.tin == null)? 0 :this.tin.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaRptId == null)? 0 :this.criteriaRptId.hashCode()));
        result = ((result* 31)+((this.criteriaCardNotPresent == null)? 0 :this.criteriaCardNotPresent.hashCode()));
        result = ((result* 31)+((this.faa1099RptYr == null)? 0 :this.faa1099RptYr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _1099Reporting100GetRequest) == false) {
            return false;
        }
        _1099Reporting100GetRequest rhs = ((_1099Reporting100GetRequest) other);
        return (((((((((((((((((((((this.criteriaRptAmt == rhs.criteriaRptAmt)||((this.criteriaRptAmt!= null)&&this.criteriaRptAmt.equals(rhs.criteriaRptAmt)))&&((this.criteriaInstTin == rhs.criteriaInstTin)||((this.criteriaInstTin!= null)&&this.criteriaInstTin.equals(rhs.criteriaInstTin))))&&((this.criteriaStPaidOverAmt == rhs.criteriaStPaidOverAmt)||((this.criteriaStPaidOverAmt!= null)&&this.criteriaStPaidOverAmt.equals(rhs.criteriaStPaidOverAmt))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaCheckDate == rhs.criteriaCheckDate)||((this.criteriaCheckDate!= null)&&this.criteriaCheckDate.equals(rhs.criteriaCheckDate))))&&((this.criteriaStWholdAmt == rhs.criteriaStWholdAmt)||((this.criteriaStWholdAmt!= null)&&this.criteriaStWholdAmt.equals(rhs.criteriaStWholdAmt))))&&((this.criteriaInvhCode == rhs.criteriaInvhCode)||((this.criteriaInvhCode!= null)&&this.criteriaInvhCode.equals(rhs.criteriaInvhCode))))&&((this.criteriaFedPaidOverAmt == rhs.criteriaFedPaidOverAmt)||((this.criteriaFedPaidOverAmt!= null)&&this.criteriaFedPaidOverAmt.equals(rhs.criteriaFedPaidOverAmt))))&&((this.ftvvendVendOwner == rhs.ftvvendVendOwner)||((this.ftvvendVendOwner!= null)&&this.ftvvendVendOwner.equals(rhs.ftvvendVendOwner))))&&((this.criteriaFedWholdAmt == rhs.criteriaFedWholdAmt)||((this.criteriaFedWholdAmt!= null)&&this.criteriaFedWholdAmt.equals(rhs.criteriaFedWholdAmt))))&&((this.faa1099VendCode == rhs.faa1099VendCode)||((this.faa1099VendCode!= null)&&this.faa1099VendCode.equals(rhs.faa1099VendCode))))&&((this.criteriaItypCode == rhs.criteriaItypCode)||((this.criteriaItypCode!= null)&&this.criteriaItypCode.equals(rhs.criteriaItypCode))))&&((this.taxID == rhs.taxID)||((this.taxID!= null)&&this.taxID.equals(rhs.taxID))))&&((this.criteriaCheckNum == rhs.criteriaCheckNum)||((this.criteriaCheckNum!= null)&&this.criteriaCheckNum.equals(rhs.criteriaCheckNum))))&&((this.tin == rhs.tin)||((this.tin!= null)&&this.tin.equals(rhs.tin))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaRptId == rhs.criteriaRptId)||((this.criteriaRptId!= null)&&this.criteriaRptId.equals(rhs.criteriaRptId))))&&((this.criteriaCardNotPresent == rhs.criteriaCardNotPresent)||((this.criteriaCardNotPresent!= null)&&this.criteriaCardNotPresent.equals(rhs.criteriaCardNotPresent))))&&((this.faa1099RptYr == rhs.faa1099RptYr)||((this.faa1099RptYr!= null)&&this.faa1099RptYr.equals(rhs.faa1099RptYr))));
    }

}
