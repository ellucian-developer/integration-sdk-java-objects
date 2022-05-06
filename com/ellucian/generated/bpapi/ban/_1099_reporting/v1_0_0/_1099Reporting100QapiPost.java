
package com.ellucian.generated.bpapi.ban._1099_reporting.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "faa1099VendCode",
    "faa1099RptYr",
    "taxID",
    "ftvvendVendOwner",
    "nameOwner",
    "tin",
    "criteria.invhCode",
    "criteria.rptAmt",
    "criteria.checkDate",
    "criteria.cardNotPresent",
    "criteria.checkNum",
    "criteria.rptId",
    "criteria.itypCode",
    "criteria.fedWholdAmt",
    "criteria.bankCode",
    "criteria.stWholdAmt",
    "criteria.coasCode",
    "criteria.fedPaidOverAmt",
    "criteria.instTin",
    "criteria.stPaidOverAmt"
})
@Generated("jsonschema2pojo")
public class _1099Reporting100QapiPost {

    @JsonProperty("faa1099VendCode")
    private String faa1099VendCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("faa1099RptYr")
    private String faa1099RptYr;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("taxID")
    private String taxID;
    @JsonProperty("ftvvendVendOwner")
    private String ftvvendVendOwner;
    @JsonProperty("nameOwner")
    private String nameOwner;
    @JsonProperty("tin")
    private String tin;
    @JsonProperty("criteria.invhCode")
    private String criteriaInvhCode;
    @JsonProperty("criteria.rptAmt")
    private String criteriaRptAmt;
    @JsonProperty("criteria.checkDate")
    private String criteriaCheckDate;
    @JsonProperty("criteria.cardNotPresent")
    private String criteriaCardNotPresent;
    @JsonProperty("criteria.checkNum")
    private String criteriaCheckNum;
    @JsonProperty("criteria.rptId")
    private String criteriaRptId;
    @JsonProperty("criteria.itypCode")
    private String criteriaItypCode;
    @JsonProperty("criteria.fedWholdAmt")
    private String criteriaFedWholdAmt;
    @JsonProperty("criteria.bankCode")
    private String criteriaBankCode;
    @JsonProperty("criteria.stWholdAmt")
    private String criteriaStWholdAmt;
    @JsonProperty("criteria.coasCode")
    private String criteriaCoasCode;
    @JsonProperty("criteria.fedPaidOverAmt")
    private String criteriaFedPaidOverAmt;
    @JsonProperty("criteria.instTin")
    private String criteriaInstTin;
    @JsonProperty("criteria.stPaidOverAmt")
    private String criteriaStPaidOverAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("faa1099VendCode")
    public String getFaa1099VendCode() {
        return faa1099VendCode;
    }

    @JsonProperty("faa1099VendCode")
    public void setFaa1099VendCode(String faa1099VendCode) {
        this.faa1099VendCode = faa1099VendCode;
    }

    public _1099Reporting100QapiPost withFaa1099VendCode(String faa1099VendCode) {
        this.faa1099VendCode = faa1099VendCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("faa1099RptYr")
    public String getFaa1099RptYr() {
        return faa1099RptYr;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("faa1099RptYr")
    public void setFaa1099RptYr(String faa1099RptYr) {
        this.faa1099RptYr = faa1099RptYr;
    }

    public _1099Reporting100QapiPost withFaa1099RptYr(String faa1099RptYr) {
        this.faa1099RptYr = faa1099RptYr;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("taxID")
    public String getTaxID() {
        return taxID;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("taxID")
    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public _1099Reporting100QapiPost withTaxID(String taxID) {
        this.taxID = taxID;
        return this;
    }

    @JsonProperty("ftvvendVendOwner")
    public String getFtvvendVendOwner() {
        return ftvvendVendOwner;
    }

    @JsonProperty("ftvvendVendOwner")
    public void setFtvvendVendOwner(String ftvvendVendOwner) {
        this.ftvvendVendOwner = ftvvendVendOwner;
    }

    public _1099Reporting100QapiPost withFtvvendVendOwner(String ftvvendVendOwner) {
        this.ftvvendVendOwner = ftvvendVendOwner;
        return this;
    }

    @JsonProperty("nameOwner")
    public String getNameOwner() {
        return nameOwner;
    }

    @JsonProperty("nameOwner")
    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public _1099Reporting100QapiPost withNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
        return this;
    }

    @JsonProperty("tin")
    public String getTin() {
        return tin;
    }

    @JsonProperty("tin")
    public void setTin(String tin) {
        this.tin = tin;
    }

    public _1099Reporting100QapiPost withTin(String tin) {
        this.tin = tin;
        return this;
    }

    @JsonProperty("criteria.invhCode")
    public String getCriteriaInvhCode() {
        return criteriaInvhCode;
    }

    @JsonProperty("criteria.invhCode")
    public void setCriteriaInvhCode(String criteriaInvhCode) {
        this.criteriaInvhCode = criteriaInvhCode;
    }

    public _1099Reporting100QapiPost withCriteriaInvhCode(String criteriaInvhCode) {
        this.criteriaInvhCode = criteriaInvhCode;
        return this;
    }

    @JsonProperty("criteria.rptAmt")
    public String getCriteriaRptAmt() {
        return criteriaRptAmt;
    }

    @JsonProperty("criteria.rptAmt")
    public void setCriteriaRptAmt(String criteriaRptAmt) {
        this.criteriaRptAmt = criteriaRptAmt;
    }

    public _1099Reporting100QapiPost withCriteriaRptAmt(String criteriaRptAmt) {
        this.criteriaRptAmt = criteriaRptAmt;
        return this;
    }

    @JsonProperty("criteria.checkDate")
    public String getCriteriaCheckDate() {
        return criteriaCheckDate;
    }

    @JsonProperty("criteria.checkDate")
    public void setCriteriaCheckDate(String criteriaCheckDate) {
        this.criteriaCheckDate = criteriaCheckDate;
    }

    public _1099Reporting100QapiPost withCriteriaCheckDate(String criteriaCheckDate) {
        this.criteriaCheckDate = criteriaCheckDate;
        return this;
    }

    @JsonProperty("criteria.cardNotPresent")
    public String getCriteriaCardNotPresent() {
        return criteriaCardNotPresent;
    }

    @JsonProperty("criteria.cardNotPresent")
    public void setCriteriaCardNotPresent(String criteriaCardNotPresent) {
        this.criteriaCardNotPresent = criteriaCardNotPresent;
    }

    public _1099Reporting100QapiPost withCriteriaCardNotPresent(String criteriaCardNotPresent) {
        this.criteriaCardNotPresent = criteriaCardNotPresent;
        return this;
    }

    @JsonProperty("criteria.checkNum")
    public String getCriteriaCheckNum() {
        return criteriaCheckNum;
    }

    @JsonProperty("criteria.checkNum")
    public void setCriteriaCheckNum(String criteriaCheckNum) {
        this.criteriaCheckNum = criteriaCheckNum;
    }

    public _1099Reporting100QapiPost withCriteriaCheckNum(String criteriaCheckNum) {
        this.criteriaCheckNum = criteriaCheckNum;
        return this;
    }

    @JsonProperty("criteria.rptId")
    public String getCriteriaRptId() {
        return criteriaRptId;
    }

    @JsonProperty("criteria.rptId")
    public void setCriteriaRptId(String criteriaRptId) {
        this.criteriaRptId = criteriaRptId;
    }

    public _1099Reporting100QapiPost withCriteriaRptId(String criteriaRptId) {
        this.criteriaRptId = criteriaRptId;
        return this;
    }

    @JsonProperty("criteria.itypCode")
    public String getCriteriaItypCode() {
        return criteriaItypCode;
    }

    @JsonProperty("criteria.itypCode")
    public void setCriteriaItypCode(String criteriaItypCode) {
        this.criteriaItypCode = criteriaItypCode;
    }

    public _1099Reporting100QapiPost withCriteriaItypCode(String criteriaItypCode) {
        this.criteriaItypCode = criteriaItypCode;
        return this;
    }

    @JsonProperty("criteria.fedWholdAmt")
    public String getCriteriaFedWholdAmt() {
        return criteriaFedWholdAmt;
    }

    @JsonProperty("criteria.fedWholdAmt")
    public void setCriteriaFedWholdAmt(String criteriaFedWholdAmt) {
        this.criteriaFedWholdAmt = criteriaFedWholdAmt;
    }

    public _1099Reporting100QapiPost withCriteriaFedWholdAmt(String criteriaFedWholdAmt) {
        this.criteriaFedWholdAmt = criteriaFedWholdAmt;
        return this;
    }

    @JsonProperty("criteria.bankCode")
    public String getCriteriaBankCode() {
        return criteriaBankCode;
    }

    @JsonProperty("criteria.bankCode")
    public void setCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
    }

    public _1099Reporting100QapiPost withCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
        return this;
    }

    @JsonProperty("criteria.stWholdAmt")
    public String getCriteriaStWholdAmt() {
        return criteriaStWholdAmt;
    }

    @JsonProperty("criteria.stWholdAmt")
    public void setCriteriaStWholdAmt(String criteriaStWholdAmt) {
        this.criteriaStWholdAmt = criteriaStWholdAmt;
    }

    public _1099Reporting100QapiPost withCriteriaStWholdAmt(String criteriaStWholdAmt) {
        this.criteriaStWholdAmt = criteriaStWholdAmt;
        return this;
    }

    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public _1099Reporting100QapiPost withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    @JsonProperty("criteria.fedPaidOverAmt")
    public String getCriteriaFedPaidOverAmt() {
        return criteriaFedPaidOverAmt;
    }

    @JsonProperty("criteria.fedPaidOverAmt")
    public void setCriteriaFedPaidOverAmt(String criteriaFedPaidOverAmt) {
        this.criteriaFedPaidOverAmt = criteriaFedPaidOverAmt;
    }

    public _1099Reporting100QapiPost withCriteriaFedPaidOverAmt(String criteriaFedPaidOverAmt) {
        this.criteriaFedPaidOverAmt = criteriaFedPaidOverAmt;
        return this;
    }

    @JsonProperty("criteria.instTin")
    public String getCriteriaInstTin() {
        return criteriaInstTin;
    }

    @JsonProperty("criteria.instTin")
    public void setCriteriaInstTin(String criteriaInstTin) {
        this.criteriaInstTin = criteriaInstTin;
    }

    public _1099Reporting100QapiPost withCriteriaInstTin(String criteriaInstTin) {
        this.criteriaInstTin = criteriaInstTin;
        return this;
    }

    @JsonProperty("criteria.stPaidOverAmt")
    public String getCriteriaStPaidOverAmt() {
        return criteriaStPaidOverAmt;
    }

    @JsonProperty("criteria.stPaidOverAmt")
    public void setCriteriaStPaidOverAmt(String criteriaStPaidOverAmt) {
        this.criteriaStPaidOverAmt = criteriaStPaidOverAmt;
    }

    public _1099Reporting100QapiPost withCriteriaStPaidOverAmt(String criteriaStPaidOverAmt) {
        this.criteriaStPaidOverAmt = criteriaStPaidOverAmt;
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

    public _1099Reporting100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_1099Reporting100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("faa1099VendCode");
        sb.append('=');
        sb.append(((this.faa1099VendCode == null)?"<null>":this.faa1099VendCode));
        sb.append(',');
        sb.append("faa1099RptYr");
        sb.append('=');
        sb.append(((this.faa1099RptYr == null)?"<null>":this.faa1099RptYr));
        sb.append(',');
        sb.append("taxID");
        sb.append('=');
        sb.append(((this.taxID == null)?"<null>":this.taxID));
        sb.append(',');
        sb.append("ftvvendVendOwner");
        sb.append('=');
        sb.append(((this.ftvvendVendOwner == null)?"<null>":this.ftvvendVendOwner));
        sb.append(',');
        sb.append("nameOwner");
        sb.append('=');
        sb.append(((this.nameOwner == null)?"<null>":this.nameOwner));
        sb.append(',');
        sb.append("tin");
        sb.append('=');
        sb.append(((this.tin == null)?"<null>":this.tin));
        sb.append(',');
        sb.append("criteriaInvhCode");
        sb.append('=');
        sb.append(((this.criteriaInvhCode == null)?"<null>":this.criteriaInvhCode));
        sb.append(',');
        sb.append("criteriaRptAmt");
        sb.append('=');
        sb.append(((this.criteriaRptAmt == null)?"<null>":this.criteriaRptAmt));
        sb.append(',');
        sb.append("criteriaCheckDate");
        sb.append('=');
        sb.append(((this.criteriaCheckDate == null)?"<null>":this.criteriaCheckDate));
        sb.append(',');
        sb.append("criteriaCardNotPresent");
        sb.append('=');
        sb.append(((this.criteriaCardNotPresent == null)?"<null>":this.criteriaCardNotPresent));
        sb.append(',');
        sb.append("criteriaCheckNum");
        sb.append('=');
        sb.append(((this.criteriaCheckNum == null)?"<null>":this.criteriaCheckNum));
        sb.append(',');
        sb.append("criteriaRptId");
        sb.append('=');
        sb.append(((this.criteriaRptId == null)?"<null>":this.criteriaRptId));
        sb.append(',');
        sb.append("criteriaItypCode");
        sb.append('=');
        sb.append(((this.criteriaItypCode == null)?"<null>":this.criteriaItypCode));
        sb.append(',');
        sb.append("criteriaFedWholdAmt");
        sb.append('=');
        sb.append(((this.criteriaFedWholdAmt == null)?"<null>":this.criteriaFedWholdAmt));
        sb.append(',');
        sb.append("criteriaBankCode");
        sb.append('=');
        sb.append(((this.criteriaBankCode == null)?"<null>":this.criteriaBankCode));
        sb.append(',');
        sb.append("criteriaStWholdAmt");
        sb.append('=');
        sb.append(((this.criteriaStWholdAmt == null)?"<null>":this.criteriaStWholdAmt));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaFedPaidOverAmt");
        sb.append('=');
        sb.append(((this.criteriaFedPaidOverAmt == null)?"<null>":this.criteriaFedPaidOverAmt));
        sb.append(',');
        sb.append("criteriaInstTin");
        sb.append('=');
        sb.append(((this.criteriaInstTin == null)?"<null>":this.criteriaInstTin));
        sb.append(',');
        sb.append("criteriaStPaidOverAmt");
        sb.append('=');
        sb.append(((this.criteriaStPaidOverAmt == null)?"<null>":this.criteriaStPaidOverAmt));
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
        result = ((result* 31)+((this.nameOwner == null)? 0 :this.nameOwner.hashCode()));
        result = ((result* 31)+((this.criteriaRptAmt == null)? 0 :this.criteriaRptAmt.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaInstTin == null)? 0 :this.criteriaInstTin.hashCode()));
        result = ((result* 31)+((this.criteriaStPaidOverAmt == null)? 0 :this.criteriaStPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.criteriaCheckDate == null)? 0 :this.criteriaCheckDate.hashCode()));
        result = ((result* 31)+((this.criteriaStWholdAmt == null)? 0 :this.criteriaStWholdAmt.hashCode()));
        result = ((result* 31)+((this.criteriaInvhCode == null)? 0 :this.criteriaInvhCode.hashCode()));
        result = ((result* 31)+((this.criteriaFedPaidOverAmt == null)? 0 :this.criteriaFedPaidOverAmt.hashCode()));
        result = ((result* 31)+((this.ftvvendVendOwner == null)? 0 :this.ftvvendVendOwner.hashCode()));
        result = ((result* 31)+((this.criteriaFedWholdAmt == null)? 0 :this.criteriaFedWholdAmt.hashCode()));
        result = ((result* 31)+((this.faa1099VendCode == null)? 0 :this.faa1099VendCode.hashCode()));
        result = ((result* 31)+((this.criteriaItypCode == null)? 0 :this.criteriaItypCode.hashCode()));
        result = ((result* 31)+((this.taxID == null)? 0 :this.taxID.hashCode()));
        result = ((result* 31)+((this.tin == null)? 0 :this.tin.hashCode()));
        result = ((result* 31)+((this.criteriaCheckNum == null)? 0 :this.criteriaCheckNum.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaCardNotPresent == null)? 0 :this.criteriaCardNotPresent.hashCode()));
        result = ((result* 31)+((this.criteriaRptId == null)? 0 :this.criteriaRptId.hashCode()));
        result = ((result* 31)+((this.faa1099RptYr == null)? 0 :this.faa1099RptYr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _1099Reporting100QapiPost) == false) {
            return false;
        }
        _1099Reporting100QapiPost rhs = ((_1099Reporting100QapiPost) other);
        return ((((((((((((((((((((((this.nameOwner == rhs.nameOwner)||((this.nameOwner!= null)&&this.nameOwner.equals(rhs.nameOwner)))&&((this.criteriaRptAmt == rhs.criteriaRptAmt)||((this.criteriaRptAmt!= null)&&this.criteriaRptAmt.equals(rhs.criteriaRptAmt))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaInstTin == rhs.criteriaInstTin)||((this.criteriaInstTin!= null)&&this.criteriaInstTin.equals(rhs.criteriaInstTin))))&&((this.criteriaStPaidOverAmt == rhs.criteriaStPaidOverAmt)||((this.criteriaStPaidOverAmt!= null)&&this.criteriaStPaidOverAmt.equals(rhs.criteriaStPaidOverAmt))))&&((this.criteriaCheckDate == rhs.criteriaCheckDate)||((this.criteriaCheckDate!= null)&&this.criteriaCheckDate.equals(rhs.criteriaCheckDate))))&&((this.criteriaStWholdAmt == rhs.criteriaStWholdAmt)||((this.criteriaStWholdAmt!= null)&&this.criteriaStWholdAmt.equals(rhs.criteriaStWholdAmt))))&&((this.criteriaInvhCode == rhs.criteriaInvhCode)||((this.criteriaInvhCode!= null)&&this.criteriaInvhCode.equals(rhs.criteriaInvhCode))))&&((this.criteriaFedPaidOverAmt == rhs.criteriaFedPaidOverAmt)||((this.criteriaFedPaidOverAmt!= null)&&this.criteriaFedPaidOverAmt.equals(rhs.criteriaFedPaidOverAmt))))&&((this.ftvvendVendOwner == rhs.ftvvendVendOwner)||((this.ftvvendVendOwner!= null)&&this.ftvvendVendOwner.equals(rhs.ftvvendVendOwner))))&&((this.criteriaFedWholdAmt == rhs.criteriaFedWholdAmt)||((this.criteriaFedWholdAmt!= null)&&this.criteriaFedWholdAmt.equals(rhs.criteriaFedWholdAmt))))&&((this.faa1099VendCode == rhs.faa1099VendCode)||((this.faa1099VendCode!= null)&&this.faa1099VendCode.equals(rhs.faa1099VendCode))))&&((this.criteriaItypCode == rhs.criteriaItypCode)||((this.criteriaItypCode!= null)&&this.criteriaItypCode.equals(rhs.criteriaItypCode))))&&((this.taxID == rhs.taxID)||((this.taxID!= null)&&this.taxID.equals(rhs.taxID))))&&((this.tin == rhs.tin)||((this.tin!= null)&&this.tin.equals(rhs.tin))))&&((this.criteriaCheckNum == rhs.criteriaCheckNum)||((this.criteriaCheckNum!= null)&&this.criteriaCheckNum.equals(rhs.criteriaCheckNum))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaCardNotPresent == rhs.criteriaCardNotPresent)||((this.criteriaCardNotPresent!= null)&&this.criteriaCardNotPresent.equals(rhs.criteriaCardNotPresent))))&&((this.criteriaRptId == rhs.criteriaRptId)||((this.criteriaRptId!= null)&&this.criteriaRptId.equals(rhs.criteriaRptId))))&&((this.faa1099RptYr == rhs.faa1099RptYr)||((this.faa1099RptYr!= null)&&this.faa1099RptYr.equals(rhs.faa1099RptYr))));
    }

}
