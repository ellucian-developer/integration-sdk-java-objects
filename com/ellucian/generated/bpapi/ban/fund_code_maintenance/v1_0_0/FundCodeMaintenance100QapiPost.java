
package com.ellucian.generated.bpapi.ban.fund_code_maintenance.v1_0_0;

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
    "criteria.coasCode",
    "criteria.statusInd",
    "criteria.grntCode",
    "criteria.propCode",
    "criteria.fundCode",
    "criteria.title",
    "criteria.effDate",
    "criteria.termDate",
    "criteria.expendEndDate",
    "criteria.dataEntryInd",
    "criteria.ftypCode",
    "criteria.effCertRequiredInd",
    "criteria.fundCodePred",
    "criteria.effCertAllocInd",
    "criteria.acctCodeAccr",
    "criteria.acctCodeRev",
    "criteria.bankCode",
    "criteria.cashReceiptBankCode",
    "criteria.srcCapSameInd",
    "criteria.acctCodePlant",
    "criteria.fundCodePlant",
    "criteria.fbalInd",
    "criteria.netAssetClass",
    "criteria.restInd",
    "criteria.orgnCodeDef",
    "criteria.progCodeDef",
    "criteria.actvCodeDef",
    "criteria.locnCodeDef",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class FundCodeMaintenance100QapiPost {

    @JsonProperty("criteria.coasCode")
    private String criteriaCoasCode;
    @JsonProperty("criteria.statusInd")
    private String criteriaStatusInd;
    @JsonProperty("criteria.grntCode")
    private String criteriaGrntCode;
    @JsonProperty("criteria.propCode")
    private String criteriaPropCode;
    @JsonProperty("criteria.fundCode")
    private String criteriaFundCode;
    @JsonProperty("criteria.title")
    private String criteriaTitle;
    @JsonProperty("criteria.effDate")
    private String criteriaEffDate;
    @JsonProperty("criteria.termDate")
    private String criteriaTermDate;
    @JsonProperty("criteria.expendEndDate")
    private String criteriaExpendEndDate;
    @JsonProperty("criteria.dataEntryInd")
    private String criteriaDataEntryInd;
    @JsonProperty("criteria.ftypCode")
    private String criteriaFtypCode;
    @JsonProperty("criteria.effCertRequiredInd")
    private String criteriaEffCertRequiredInd;
    @JsonProperty("criteria.fundCodePred")
    private String criteriaFundCodePred;
    @JsonProperty("criteria.effCertAllocInd")
    private String criteriaEffCertAllocInd;
    @JsonProperty("criteria.acctCodeAccr")
    private String criteriaAcctCodeAccr;
    @JsonProperty("criteria.acctCodeRev")
    private String criteriaAcctCodeRev;
    @JsonProperty("criteria.bankCode")
    private String criteriaBankCode;
    @JsonProperty("criteria.cashReceiptBankCode")
    private String criteriaCashReceiptBankCode;
    @JsonProperty("criteria.srcCapSameInd")
    private String criteriaSrcCapSameInd;
    @JsonProperty("criteria.acctCodePlant")
    private String criteriaAcctCodePlant;
    @JsonProperty("criteria.fundCodePlant")
    private String criteriaFundCodePlant;
    @JsonProperty("criteria.fbalInd")
    private String criteriaFbalInd;
    @JsonProperty("criteria.netAssetClass")
    private String criteriaNetAssetClass;
    @JsonProperty("criteria.restInd")
    private String criteriaRestInd;
    @JsonProperty("criteria.orgnCodeDef")
    private String criteriaOrgnCodeDef;
    @JsonProperty("criteria.progCodeDef")
    private String criteriaProgCodeDef;
    @JsonProperty("criteria.actvCodeDef")
    private String criteriaActvCodeDef;
    @JsonProperty("criteria.locnCodeDef")
    private String criteriaLocnCodeDef;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFUND_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public FundCodeMaintenance100QapiPost withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public FundCodeMaintenance100QapiPost withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    @JsonProperty("criteria.grntCode")
    public String getCriteriaGrntCode() {
        return criteriaGrntCode;
    }

    @JsonProperty("criteria.grntCode")
    public void setCriteriaGrntCode(String criteriaGrntCode) {
        this.criteriaGrntCode = criteriaGrntCode;
    }

    public FundCodeMaintenance100QapiPost withCriteriaGrntCode(String criteriaGrntCode) {
        this.criteriaGrntCode = criteriaGrntCode;
        return this;
    }

    @JsonProperty("criteria.propCode")
    public String getCriteriaPropCode() {
        return criteriaPropCode;
    }

    @JsonProperty("criteria.propCode")
    public void setCriteriaPropCode(String criteriaPropCode) {
        this.criteriaPropCode = criteriaPropCode;
    }

    public FundCodeMaintenance100QapiPost withCriteriaPropCode(String criteriaPropCode) {
        this.criteriaPropCode = criteriaPropCode;
        return this;
    }

    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public FundCodeMaintenance100QapiPost withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public FundCodeMaintenance100QapiPost withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    @JsonProperty("criteria.effDate")
    public String getCriteriaEffDate() {
        return criteriaEffDate;
    }

    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(String criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public FundCodeMaintenance100QapiPost withCriteriaEffDate(String criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    @JsonProperty("criteria.termDate")
    public String getCriteriaTermDate() {
        return criteriaTermDate;
    }

    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(String criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public FundCodeMaintenance100QapiPost withCriteriaTermDate(String criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    @JsonProperty("criteria.expendEndDate")
    public String getCriteriaExpendEndDate() {
        return criteriaExpendEndDate;
    }

    @JsonProperty("criteria.expendEndDate")
    public void setCriteriaExpendEndDate(String criteriaExpendEndDate) {
        this.criteriaExpendEndDate = criteriaExpendEndDate;
    }

    public FundCodeMaintenance100QapiPost withCriteriaExpendEndDate(String criteriaExpendEndDate) {
        this.criteriaExpendEndDate = criteriaExpendEndDate;
        return this;
    }

    @JsonProperty("criteria.dataEntryInd")
    public String getCriteriaDataEntryInd() {
        return criteriaDataEntryInd;
    }

    @JsonProperty("criteria.dataEntryInd")
    public void setCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
    }

    public FundCodeMaintenance100QapiPost withCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
        return this;
    }

    @JsonProperty("criteria.ftypCode")
    public String getCriteriaFtypCode() {
        return criteriaFtypCode;
    }

    @JsonProperty("criteria.ftypCode")
    public void setCriteriaFtypCode(String criteriaFtypCode) {
        this.criteriaFtypCode = criteriaFtypCode;
    }

    public FundCodeMaintenance100QapiPost withCriteriaFtypCode(String criteriaFtypCode) {
        this.criteriaFtypCode = criteriaFtypCode;
        return this;
    }

    @JsonProperty("criteria.effCertRequiredInd")
    public String getCriteriaEffCertRequiredInd() {
        return criteriaEffCertRequiredInd;
    }

    @JsonProperty("criteria.effCertRequiredInd")
    public void setCriteriaEffCertRequiredInd(String criteriaEffCertRequiredInd) {
        this.criteriaEffCertRequiredInd = criteriaEffCertRequiredInd;
    }

    public FundCodeMaintenance100QapiPost withCriteriaEffCertRequiredInd(String criteriaEffCertRequiredInd) {
        this.criteriaEffCertRequiredInd = criteriaEffCertRequiredInd;
        return this;
    }

    @JsonProperty("criteria.fundCodePred")
    public String getCriteriaFundCodePred() {
        return criteriaFundCodePred;
    }

    @JsonProperty("criteria.fundCodePred")
    public void setCriteriaFundCodePred(String criteriaFundCodePred) {
        this.criteriaFundCodePred = criteriaFundCodePred;
    }

    public FundCodeMaintenance100QapiPost withCriteriaFundCodePred(String criteriaFundCodePred) {
        this.criteriaFundCodePred = criteriaFundCodePred;
        return this;
    }

    @JsonProperty("criteria.effCertAllocInd")
    public String getCriteriaEffCertAllocInd() {
        return criteriaEffCertAllocInd;
    }

    @JsonProperty("criteria.effCertAllocInd")
    public void setCriteriaEffCertAllocInd(String criteriaEffCertAllocInd) {
        this.criteriaEffCertAllocInd = criteriaEffCertAllocInd;
    }

    public FundCodeMaintenance100QapiPost withCriteriaEffCertAllocInd(String criteriaEffCertAllocInd) {
        this.criteriaEffCertAllocInd = criteriaEffCertAllocInd;
        return this;
    }

    @JsonProperty("criteria.acctCodeAccr")
    public String getCriteriaAcctCodeAccr() {
        return criteriaAcctCodeAccr;
    }

    @JsonProperty("criteria.acctCodeAccr")
    public void setCriteriaAcctCodeAccr(String criteriaAcctCodeAccr) {
        this.criteriaAcctCodeAccr = criteriaAcctCodeAccr;
    }

    public FundCodeMaintenance100QapiPost withCriteriaAcctCodeAccr(String criteriaAcctCodeAccr) {
        this.criteriaAcctCodeAccr = criteriaAcctCodeAccr;
        return this;
    }

    @JsonProperty("criteria.acctCodeRev")
    public String getCriteriaAcctCodeRev() {
        return criteriaAcctCodeRev;
    }

    @JsonProperty("criteria.acctCodeRev")
    public void setCriteriaAcctCodeRev(String criteriaAcctCodeRev) {
        this.criteriaAcctCodeRev = criteriaAcctCodeRev;
    }

    public FundCodeMaintenance100QapiPost withCriteriaAcctCodeRev(String criteriaAcctCodeRev) {
        this.criteriaAcctCodeRev = criteriaAcctCodeRev;
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

    public FundCodeMaintenance100QapiPost withCriteriaBankCode(String criteriaBankCode) {
        this.criteriaBankCode = criteriaBankCode;
        return this;
    }

    @JsonProperty("criteria.cashReceiptBankCode")
    public String getCriteriaCashReceiptBankCode() {
        return criteriaCashReceiptBankCode;
    }

    @JsonProperty("criteria.cashReceiptBankCode")
    public void setCriteriaCashReceiptBankCode(String criteriaCashReceiptBankCode) {
        this.criteriaCashReceiptBankCode = criteriaCashReceiptBankCode;
    }

    public FundCodeMaintenance100QapiPost withCriteriaCashReceiptBankCode(String criteriaCashReceiptBankCode) {
        this.criteriaCashReceiptBankCode = criteriaCashReceiptBankCode;
        return this;
    }

    @JsonProperty("criteria.srcCapSameInd")
    public String getCriteriaSrcCapSameInd() {
        return criteriaSrcCapSameInd;
    }

    @JsonProperty("criteria.srcCapSameInd")
    public void setCriteriaSrcCapSameInd(String criteriaSrcCapSameInd) {
        this.criteriaSrcCapSameInd = criteriaSrcCapSameInd;
    }

    public FundCodeMaintenance100QapiPost withCriteriaSrcCapSameInd(String criteriaSrcCapSameInd) {
        this.criteriaSrcCapSameInd = criteriaSrcCapSameInd;
        return this;
    }

    @JsonProperty("criteria.acctCodePlant")
    public String getCriteriaAcctCodePlant() {
        return criteriaAcctCodePlant;
    }

    @JsonProperty("criteria.acctCodePlant")
    public void setCriteriaAcctCodePlant(String criteriaAcctCodePlant) {
        this.criteriaAcctCodePlant = criteriaAcctCodePlant;
    }

    public FundCodeMaintenance100QapiPost withCriteriaAcctCodePlant(String criteriaAcctCodePlant) {
        this.criteriaAcctCodePlant = criteriaAcctCodePlant;
        return this;
    }

    @JsonProperty("criteria.fundCodePlant")
    public String getCriteriaFundCodePlant() {
        return criteriaFundCodePlant;
    }

    @JsonProperty("criteria.fundCodePlant")
    public void setCriteriaFundCodePlant(String criteriaFundCodePlant) {
        this.criteriaFundCodePlant = criteriaFundCodePlant;
    }

    public FundCodeMaintenance100QapiPost withCriteriaFundCodePlant(String criteriaFundCodePlant) {
        this.criteriaFundCodePlant = criteriaFundCodePlant;
        return this;
    }

    @JsonProperty("criteria.fbalInd")
    public String getCriteriaFbalInd() {
        return criteriaFbalInd;
    }

    @JsonProperty("criteria.fbalInd")
    public void setCriteriaFbalInd(String criteriaFbalInd) {
        this.criteriaFbalInd = criteriaFbalInd;
    }

    public FundCodeMaintenance100QapiPost withCriteriaFbalInd(String criteriaFbalInd) {
        this.criteriaFbalInd = criteriaFbalInd;
        return this;
    }

    @JsonProperty("criteria.netAssetClass")
    public String getCriteriaNetAssetClass() {
        return criteriaNetAssetClass;
    }

    @JsonProperty("criteria.netAssetClass")
    public void setCriteriaNetAssetClass(String criteriaNetAssetClass) {
        this.criteriaNetAssetClass = criteriaNetAssetClass;
    }

    public FundCodeMaintenance100QapiPost withCriteriaNetAssetClass(String criteriaNetAssetClass) {
        this.criteriaNetAssetClass = criteriaNetAssetClass;
        return this;
    }

    @JsonProperty("criteria.restInd")
    public String getCriteriaRestInd() {
        return criteriaRestInd;
    }

    @JsonProperty("criteria.restInd")
    public void setCriteriaRestInd(String criteriaRestInd) {
        this.criteriaRestInd = criteriaRestInd;
    }

    public FundCodeMaintenance100QapiPost withCriteriaRestInd(String criteriaRestInd) {
        this.criteriaRestInd = criteriaRestInd;
        return this;
    }

    @JsonProperty("criteria.orgnCodeDef")
    public String getCriteriaOrgnCodeDef() {
        return criteriaOrgnCodeDef;
    }

    @JsonProperty("criteria.orgnCodeDef")
    public void setCriteriaOrgnCodeDef(String criteriaOrgnCodeDef) {
        this.criteriaOrgnCodeDef = criteriaOrgnCodeDef;
    }

    public FundCodeMaintenance100QapiPost withCriteriaOrgnCodeDef(String criteriaOrgnCodeDef) {
        this.criteriaOrgnCodeDef = criteriaOrgnCodeDef;
        return this;
    }

    @JsonProperty("criteria.progCodeDef")
    public String getCriteriaProgCodeDef() {
        return criteriaProgCodeDef;
    }

    @JsonProperty("criteria.progCodeDef")
    public void setCriteriaProgCodeDef(String criteriaProgCodeDef) {
        this.criteriaProgCodeDef = criteriaProgCodeDef;
    }

    public FundCodeMaintenance100QapiPost withCriteriaProgCodeDef(String criteriaProgCodeDef) {
        this.criteriaProgCodeDef = criteriaProgCodeDef;
        return this;
    }

    @JsonProperty("criteria.actvCodeDef")
    public String getCriteriaActvCodeDef() {
        return criteriaActvCodeDef;
    }

    @JsonProperty("criteria.actvCodeDef")
    public void setCriteriaActvCodeDef(String criteriaActvCodeDef) {
        this.criteriaActvCodeDef = criteriaActvCodeDef;
    }

    public FundCodeMaintenance100QapiPost withCriteriaActvCodeDef(String criteriaActvCodeDef) {
        this.criteriaActvCodeDef = criteriaActvCodeDef;
        return this;
    }

    @JsonProperty("criteria.locnCodeDef")
    public String getCriteriaLocnCodeDef() {
        return criteriaLocnCodeDef;
    }

    @JsonProperty("criteria.locnCodeDef")
    public void setCriteriaLocnCodeDef(String criteriaLocnCodeDef) {
        this.criteriaLocnCodeDef = criteriaLocnCodeDef;
    }

    public FundCodeMaintenance100QapiPost withCriteriaLocnCodeDef(String criteriaLocnCodeDef) {
        this.criteriaLocnCodeDef = criteriaLocnCodeDef;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVFUND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FundCodeMaintenance100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public FundCodeMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundCodeMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaGrntCode");
        sb.append('=');
        sb.append(((this.criteriaGrntCode == null)?"<null>":this.criteriaGrntCode));
        sb.append(',');
        sb.append("criteriaPropCode");
        sb.append('=');
        sb.append(((this.criteriaPropCode == null)?"<null>":this.criteriaPropCode));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaExpendEndDate");
        sb.append('=');
        sb.append(((this.criteriaExpendEndDate == null)?"<null>":this.criteriaExpendEndDate));
        sb.append(',');
        sb.append("criteriaDataEntryInd");
        sb.append('=');
        sb.append(((this.criteriaDataEntryInd == null)?"<null>":this.criteriaDataEntryInd));
        sb.append(',');
        sb.append("criteriaFtypCode");
        sb.append('=');
        sb.append(((this.criteriaFtypCode == null)?"<null>":this.criteriaFtypCode));
        sb.append(',');
        sb.append("criteriaEffCertRequiredInd");
        sb.append('=');
        sb.append(((this.criteriaEffCertRequiredInd == null)?"<null>":this.criteriaEffCertRequiredInd));
        sb.append(',');
        sb.append("criteriaFundCodePred");
        sb.append('=');
        sb.append(((this.criteriaFundCodePred == null)?"<null>":this.criteriaFundCodePred));
        sb.append(',');
        sb.append("criteriaEffCertAllocInd");
        sb.append('=');
        sb.append(((this.criteriaEffCertAllocInd == null)?"<null>":this.criteriaEffCertAllocInd));
        sb.append(',');
        sb.append("criteriaAcctCodeAccr");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeAccr == null)?"<null>":this.criteriaAcctCodeAccr));
        sb.append(',');
        sb.append("criteriaAcctCodeRev");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeRev == null)?"<null>":this.criteriaAcctCodeRev));
        sb.append(',');
        sb.append("criteriaBankCode");
        sb.append('=');
        sb.append(((this.criteriaBankCode == null)?"<null>":this.criteriaBankCode));
        sb.append(',');
        sb.append("criteriaCashReceiptBankCode");
        sb.append('=');
        sb.append(((this.criteriaCashReceiptBankCode == null)?"<null>":this.criteriaCashReceiptBankCode));
        sb.append(',');
        sb.append("criteriaSrcCapSameInd");
        sb.append('=');
        sb.append(((this.criteriaSrcCapSameInd == null)?"<null>":this.criteriaSrcCapSameInd));
        sb.append(',');
        sb.append("criteriaAcctCodePlant");
        sb.append('=');
        sb.append(((this.criteriaAcctCodePlant == null)?"<null>":this.criteriaAcctCodePlant));
        sb.append(',');
        sb.append("criteriaFundCodePlant");
        sb.append('=');
        sb.append(((this.criteriaFundCodePlant == null)?"<null>":this.criteriaFundCodePlant));
        sb.append(',');
        sb.append("criteriaFbalInd");
        sb.append('=');
        sb.append(((this.criteriaFbalInd == null)?"<null>":this.criteriaFbalInd));
        sb.append(',');
        sb.append("criteriaNetAssetClass");
        sb.append('=');
        sb.append(((this.criteriaNetAssetClass == null)?"<null>":this.criteriaNetAssetClass));
        sb.append(',');
        sb.append("criteriaRestInd");
        sb.append('=');
        sb.append(((this.criteriaRestInd == null)?"<null>":this.criteriaRestInd));
        sb.append(',');
        sb.append("criteriaOrgnCodeDef");
        sb.append('=');
        sb.append(((this.criteriaOrgnCodeDef == null)?"<null>":this.criteriaOrgnCodeDef));
        sb.append(',');
        sb.append("criteriaProgCodeDef");
        sb.append('=');
        sb.append(((this.criteriaProgCodeDef == null)?"<null>":this.criteriaProgCodeDef));
        sb.append(',');
        sb.append("criteriaActvCodeDef");
        sb.append('=');
        sb.append(((this.criteriaActvCodeDef == null)?"<null>":this.criteriaActvCodeDef));
        sb.append(',');
        sb.append("criteriaLocnCodeDef");
        sb.append('=');
        sb.append(((this.criteriaLocnCodeDef == null)?"<null>":this.criteriaLocnCodeDef));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.criteriaFundCode == null)? 0 :this.criteriaFundCode.hashCode()));
        result = ((result* 31)+((this.criteriaRestInd == null)? 0 :this.criteriaRestInd.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaFundCodePlant == null)? 0 :this.criteriaFundCodePlant.hashCode()));
        result = ((result* 31)+((this.criteriaNetAssetClass == null)? 0 :this.criteriaNetAssetClass.hashCode()));
        result = ((result* 31)+((this.criteriaSrcCapSameInd == null)? 0 :this.criteriaSrcCapSameInd.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeRev == null)? 0 :this.criteriaAcctCodeRev.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.criteriaActvCodeDef == null)? 0 :this.criteriaActvCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodePlant == null)? 0 :this.criteriaAcctCodePlant.hashCode()));
        result = ((result* 31)+((this.criteriaExpendEndDate == null)? 0 :this.criteriaExpendEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaGrntCode == null)? 0 :this.criteriaGrntCode.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCodeDef == null)? 0 :this.criteriaOrgnCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaEffCertAllocInd == null)? 0 :this.criteriaEffCertAllocInd.hashCode()));
        result = ((result* 31)+((this.criteriaPropCode == null)? 0 :this.criteriaPropCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaFtypCode == null)? 0 :this.criteriaFtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaDataEntryInd == null)? 0 :this.criteriaDataEntryInd.hashCode()));
        result = ((result* 31)+((this.criteriaFundCodePred == null)? 0 :this.criteriaFundCodePred.hashCode()));
        result = ((result* 31)+((this.criteriaCashReceiptBankCode == null)? 0 :this.criteriaCashReceiptBankCode.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaProgCodeDef == null)? 0 :this.criteriaProgCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaLocnCodeDef == null)? 0 :this.criteriaLocnCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaEffCertRequiredInd == null)? 0 :this.criteriaEffCertRequiredInd.hashCode()));
        result = ((result* 31)+((this.criteriaBankCode == null)? 0 :this.criteriaBankCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFbalInd == null)? 0 :this.criteriaFbalInd.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeAccr == null)? 0 :this.criteriaAcctCodeAccr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundCodeMaintenance100QapiPost) == false) {
            return false;
        }
        FundCodeMaintenance100QapiPost rhs = ((FundCodeMaintenance100QapiPost) other);
        return (((((((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaRestInd == rhs.criteriaRestInd)||((this.criteriaRestInd!= null)&&this.criteriaRestInd.equals(rhs.criteriaRestInd))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaFundCodePlant == rhs.criteriaFundCodePlant)||((this.criteriaFundCodePlant!= null)&&this.criteriaFundCodePlant.equals(rhs.criteriaFundCodePlant))))&&((this.criteriaNetAssetClass == rhs.criteriaNetAssetClass)||((this.criteriaNetAssetClass!= null)&&this.criteriaNetAssetClass.equals(rhs.criteriaNetAssetClass))))&&((this.criteriaSrcCapSameInd == rhs.criteriaSrcCapSameInd)||((this.criteriaSrcCapSameInd!= null)&&this.criteriaSrcCapSameInd.equals(rhs.criteriaSrcCapSameInd))))&&((this.criteriaAcctCodeRev == rhs.criteriaAcctCodeRev)||((this.criteriaAcctCodeRev!= null)&&this.criteriaAcctCodeRev.equals(rhs.criteriaAcctCodeRev))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.criteriaActvCodeDef == rhs.criteriaActvCodeDef)||((this.criteriaActvCodeDef!= null)&&this.criteriaActvCodeDef.equals(rhs.criteriaActvCodeDef))))&&((this.criteriaAcctCodePlant == rhs.criteriaAcctCodePlant)||((this.criteriaAcctCodePlant!= null)&&this.criteriaAcctCodePlant.equals(rhs.criteriaAcctCodePlant))))&&((this.criteriaExpendEndDate == rhs.criteriaExpendEndDate)||((this.criteriaExpendEndDate!= null)&&this.criteriaExpendEndDate.equals(rhs.criteriaExpendEndDate))))&&((this.criteriaGrntCode == rhs.criteriaGrntCode)||((this.criteriaGrntCode!= null)&&this.criteriaGrntCode.equals(rhs.criteriaGrntCode))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.criteriaOrgnCodeDef == rhs.criteriaOrgnCodeDef)||((this.criteriaOrgnCodeDef!= null)&&this.criteriaOrgnCodeDef.equals(rhs.criteriaOrgnCodeDef))))&&((this.criteriaEffCertAllocInd == rhs.criteriaEffCertAllocInd)||((this.criteriaEffCertAllocInd!= null)&&this.criteriaEffCertAllocInd.equals(rhs.criteriaEffCertAllocInd))))&&((this.criteriaPropCode == rhs.criteriaPropCode)||((this.criteriaPropCode!= null)&&this.criteriaPropCode.equals(rhs.criteriaPropCode))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaFtypCode == rhs.criteriaFtypCode)||((this.criteriaFtypCode!= null)&&this.criteriaFtypCode.equals(rhs.criteriaFtypCode))))&&((this.criteriaDataEntryInd == rhs.criteriaDataEntryInd)||((this.criteriaDataEntryInd!= null)&&this.criteriaDataEntryInd.equals(rhs.criteriaDataEntryInd))))&&((this.criteriaFundCodePred == rhs.criteriaFundCodePred)||((this.criteriaFundCodePred!= null)&&this.criteriaFundCodePred.equals(rhs.criteriaFundCodePred))))&&((this.criteriaCashReceiptBankCode == rhs.criteriaCashReceiptBankCode)||((this.criteriaCashReceiptBankCode!= null)&&this.criteriaCashReceiptBankCode.equals(rhs.criteriaCashReceiptBankCode))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaProgCodeDef == rhs.criteriaProgCodeDef)||((this.criteriaProgCodeDef!= null)&&this.criteriaProgCodeDef.equals(rhs.criteriaProgCodeDef))))&&((this.criteriaLocnCodeDef == rhs.criteriaLocnCodeDef)||((this.criteriaLocnCodeDef!= null)&&this.criteriaLocnCodeDef.equals(rhs.criteriaLocnCodeDef))))&&((this.criteriaEffCertRequiredInd == rhs.criteriaEffCertRequiredInd)||((this.criteriaEffCertRequiredInd!= null)&&this.criteriaEffCertRequiredInd.equals(rhs.criteriaEffCertRequiredInd))))&&((this.criteriaBankCode == rhs.criteriaBankCode)||((this.criteriaBankCode!= null)&&this.criteriaBankCode.equals(rhs.criteriaBankCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFbalInd == rhs.criteriaFbalInd)||((this.criteriaFbalInd!= null)&&this.criteriaFbalInd.equals(rhs.criteriaFbalInd))))&&((this.criteriaAcctCodeAccr == rhs.criteriaAcctCodeAccr)||((this.criteriaAcctCodeAccr!= null)&&this.criteriaAcctCodeAccr.equals(rhs.criteriaAcctCodeAccr))));
    }

}
