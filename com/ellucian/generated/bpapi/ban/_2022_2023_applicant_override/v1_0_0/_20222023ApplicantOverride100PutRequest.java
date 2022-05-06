
package com.ellucian.generated.bpapi.ban._2022_2023_applicant_override.v1_0_0;

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
    "chgDependFm",
    "parTuitExpIm",
    "seqNo",
    "chgDependIm",
    "parOthAssetIm",
    "assetAllowIm",
    "calcUsTaxIm",
    "verificationMessage",
    "budgDurIm",
    "parMedDentExpIm",
    "lockCurrRecord",
    "studentId",
    "budgDurFm",
    "fmRecord",
    "parOthIncAllowIm",
    "medDentExpIm",
    "calcPcIm",
    "othIncAllowIm",
    "calcPcFm",
    "othAssetIm",
    "parAssetAllowIm",
    "parCalcUsTaxIm",
    "lockIMRecord"
})
@Generated("jsonschema2pojo")
public class _20222023ApplicantOverride100PutRequest {

    /**
     * Dependency
     * <p>
     * Lineage reference object : RNROVRD_CHG_DEPEND_FM
     * 
     */
    @JsonProperty("chgDependFm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_CHG_DEPEND_FM")
    private String chgDependFm;
    /**
     * IM-Parent Tuition Paid
     * <p>
     * Lineage reference object : RNROVRD_PAR_TUIT_EXP_IM
     * 
     */
    @JsonProperty("parTuitExpIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_TUIT_EXP_IM")
    private Double parTuitExpIm;
    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("seqNo")
    private Double seqNo;
    /**
     * IM-Student Dependency
     * <p>
     * Lineage reference object : RNROVRD_CHG_DEPEND_IM
     * 
     */
    @JsonProperty("chgDependIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_CHG_DEPEND_IM")
    private String chgDependIm;
    /**
     * IM-Parent Other Assets
     * <p>
     * Lineage reference object : RNROVRD_PAR_OTH_ASSET_IM
     * 
     */
    @JsonProperty("parOthAssetIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_OTH_ASSET_IM")
    private Double parOthAssetIm;
    /**
     * IM-Student Other Asset Allowance
     * <p>
     * Lineage reference object : RNROVRD_ASSET_ALLOW_IM
     * 
     */
    @JsonProperty("assetAllowIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ASSET_ALLOW_IM")
    private Double assetAllowIm;
    /**
     * IM-Student US Tax Calculation Option
     * <p>
     * Lineage reference object : RNROVRD_CALC_US_TAX_IM
     * 
     */
    @JsonProperty("calcUsTaxIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_CALC_US_TAX_IM")
    private String calcUsTaxIm;
    /**
     * Verification Message
     * <p>
     * 
     * 
     */
    @JsonProperty("verificationMessage")
    private String verificationMessage;
    /**
     * IM-Student Budget Duration
     * <p>
     * Lineage reference object : RNROVRD_BUDG_DUR_IM
     * 
     */
    @JsonProperty("budgDurIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_BUDG_DUR_IM")
    private Double budgDurIm;
    /**
     * IM-Parent Medical or Dental Expense
     * <p>
     * Lineage reference object : RNROVRD_PAR_MED_DENT_EXP_IM
     * 
     */
    @JsonProperty("parMedDentExpIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_MED_DENT_EXP_IM")
    private Double parMedDentExpIm;
    /**
     * Lock Current Record
     * <p>
     * 
     * 
     */
    @JsonProperty("lockCurrRecord")
    private String lockCurrRecord;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("studentId")
    @JsonPropertyDescription("Lineage reference object : keyblckStudentId")
    private Object studentId;
    /**
     * FM-Student Budget Duration
     * <p>
     * Lineage reference object : RNROVRD_BUDG_DUR_FM
     * 
     */
    @JsonProperty("budgDurFm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_BUDG_DUR_FM")
    private Double budgDurFm;
    /**
     * New FM Record Source
     * <p>
     * 
     * 
     */
    @JsonProperty("fmRecord")
    private String fmRecord;
    /**
     * IM-Parent Other Income Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_OTH_INC_ALLOW_IM
     * 
     */
    @JsonProperty("parOthIncAllowIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_OTH_INC_ALLOW_IM")
    private Double parOthIncAllowIm;
    /**
     * IM-Student Medical or Dental Expense
     * <p>
     * Lineage reference object : RNROVRD_MED_DENT_EXP_IM
     * 
     */
    @JsonProperty("medDentExpIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_MED_DENT_EXP_IM")
    private Double medDentExpIm;
    /**
     * IM-Student Calculate Parent Contribution for Independent Student
     * <p>
     * Lineage reference object : RNROVRD_CALC_PC_IM
     * 
     */
    @JsonProperty("calcPcIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_CALC_PC_IM")
    private String calcPcIm;
    /**
     * IM-Student Other Income Allowance
     * <p>
     * Lineage reference object : RNROVRD_OTH_INC_ALLOW_IM
     * 
     */
    @JsonProperty("othIncAllowIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_OTH_INC_ALLOW_IM")
    private Double othIncAllowIm;
    /**
     * FM-Student Calculate Parent Contribution for Independent Student
     * <p>
     * Lineage reference object : RNROVRD_CALC_PC_FM
     * 
     */
    @JsonProperty("calcPcFm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_CALC_PC_FM")
    private String calcPcFm;
    /**
     * IM-Student Other Assets
     * <p>
     * Lineage reference object : RNROVRD_OTH_ASSET_IM
     * 
     */
    @JsonProperty("othAssetIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_OTH_ASSET_IM")
    private Double othAssetIm;
    /**
     * IM-Parent Other Asset Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_ASSET_ALLOW_IM
     * 
     */
    @JsonProperty("parAssetAllowIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_ASSET_ALLOW_IM")
    private Double parAssetAllowIm;
    /**
     * IM-Parent US Tax Calculation Option
     * <p>
     * Lineage reference object : RNROVRD_PAR_CALC_US_TAX_IM
     * 
     */
    @JsonProperty("parCalcUsTaxIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_CALC_US_TAX_IM")
    private String parCalcUsTaxIm;
    /**
     * Lock Active IM Record
     * <p>
     * 
     * 
     */
    @JsonProperty("lockIMRecord")
    private String lockIMRecord;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Dependency
     * <p>
     * Lineage reference object : RNROVRD_CHG_DEPEND_FM
     * 
     */
    @JsonProperty("chgDependFm")
    public String getChgDependFm() {
        return chgDependFm;
    }

    /**
     * Dependency
     * <p>
     * Lineage reference object : RNROVRD_CHG_DEPEND_FM
     * 
     */
    @JsonProperty("chgDependFm")
    public void setChgDependFm(String chgDependFm) {
        this.chgDependFm = chgDependFm;
    }

    public _20222023ApplicantOverride100PutRequest withChgDependFm(String chgDependFm) {
        this.chgDependFm = chgDependFm;
        return this;
    }

    /**
     * IM-Parent Tuition Paid
     * <p>
     * Lineage reference object : RNROVRD_PAR_TUIT_EXP_IM
     * 
     */
    @JsonProperty("parTuitExpIm")
    public Double getParTuitExpIm() {
        return parTuitExpIm;
    }

    /**
     * IM-Parent Tuition Paid
     * <p>
     * Lineage reference object : RNROVRD_PAR_TUIT_EXP_IM
     * 
     */
    @JsonProperty("parTuitExpIm")
    public void setParTuitExpIm(Double parTuitExpIm) {
        this.parTuitExpIm = parTuitExpIm;
    }

    public _20222023ApplicantOverride100PutRequest withParTuitExpIm(Double parTuitExpIm) {
        this.parTuitExpIm = parTuitExpIm;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public _20222023ApplicantOverride100PutRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * IM-Student Dependency
     * <p>
     * Lineage reference object : RNROVRD_CHG_DEPEND_IM
     * 
     */
    @JsonProperty("chgDependIm")
    public String getChgDependIm() {
        return chgDependIm;
    }

    /**
     * IM-Student Dependency
     * <p>
     * Lineage reference object : RNROVRD_CHG_DEPEND_IM
     * 
     */
    @JsonProperty("chgDependIm")
    public void setChgDependIm(String chgDependIm) {
        this.chgDependIm = chgDependIm;
    }

    public _20222023ApplicantOverride100PutRequest withChgDependIm(String chgDependIm) {
        this.chgDependIm = chgDependIm;
        return this;
    }

    /**
     * IM-Parent Other Assets
     * <p>
     * Lineage reference object : RNROVRD_PAR_OTH_ASSET_IM
     * 
     */
    @JsonProperty("parOthAssetIm")
    public Double getParOthAssetIm() {
        return parOthAssetIm;
    }

    /**
     * IM-Parent Other Assets
     * <p>
     * Lineage reference object : RNROVRD_PAR_OTH_ASSET_IM
     * 
     */
    @JsonProperty("parOthAssetIm")
    public void setParOthAssetIm(Double parOthAssetIm) {
        this.parOthAssetIm = parOthAssetIm;
    }

    public _20222023ApplicantOverride100PutRequest withParOthAssetIm(Double parOthAssetIm) {
        this.parOthAssetIm = parOthAssetIm;
        return this;
    }

    /**
     * IM-Student Other Asset Allowance
     * <p>
     * Lineage reference object : RNROVRD_ASSET_ALLOW_IM
     * 
     */
    @JsonProperty("assetAllowIm")
    public Double getAssetAllowIm() {
        return assetAllowIm;
    }

    /**
     * IM-Student Other Asset Allowance
     * <p>
     * Lineage reference object : RNROVRD_ASSET_ALLOW_IM
     * 
     */
    @JsonProperty("assetAllowIm")
    public void setAssetAllowIm(Double assetAllowIm) {
        this.assetAllowIm = assetAllowIm;
    }

    public _20222023ApplicantOverride100PutRequest withAssetAllowIm(Double assetAllowIm) {
        this.assetAllowIm = assetAllowIm;
        return this;
    }

    /**
     * IM-Student US Tax Calculation Option
     * <p>
     * Lineage reference object : RNROVRD_CALC_US_TAX_IM
     * 
     */
    @JsonProperty("calcUsTaxIm")
    public String getCalcUsTaxIm() {
        return calcUsTaxIm;
    }

    /**
     * IM-Student US Tax Calculation Option
     * <p>
     * Lineage reference object : RNROVRD_CALC_US_TAX_IM
     * 
     */
    @JsonProperty("calcUsTaxIm")
    public void setCalcUsTaxIm(String calcUsTaxIm) {
        this.calcUsTaxIm = calcUsTaxIm;
    }

    public _20222023ApplicantOverride100PutRequest withCalcUsTaxIm(String calcUsTaxIm) {
        this.calcUsTaxIm = calcUsTaxIm;
        return this;
    }

    /**
     * Verification Message
     * <p>
     * 
     * 
     */
    @JsonProperty("verificationMessage")
    public String getVerificationMessage() {
        return verificationMessage;
    }

    /**
     * Verification Message
     * <p>
     * 
     * 
     */
    @JsonProperty("verificationMessage")
    public void setVerificationMessage(String verificationMessage) {
        this.verificationMessage = verificationMessage;
    }

    public _20222023ApplicantOverride100PutRequest withVerificationMessage(String verificationMessage) {
        this.verificationMessage = verificationMessage;
        return this;
    }

    /**
     * IM-Student Budget Duration
     * <p>
     * Lineage reference object : RNROVRD_BUDG_DUR_IM
     * 
     */
    @JsonProperty("budgDurIm")
    public Double getBudgDurIm() {
        return budgDurIm;
    }

    /**
     * IM-Student Budget Duration
     * <p>
     * Lineage reference object : RNROVRD_BUDG_DUR_IM
     * 
     */
    @JsonProperty("budgDurIm")
    public void setBudgDurIm(Double budgDurIm) {
        this.budgDurIm = budgDurIm;
    }

    public _20222023ApplicantOverride100PutRequest withBudgDurIm(Double budgDurIm) {
        this.budgDurIm = budgDurIm;
        return this;
    }

    /**
     * IM-Parent Medical or Dental Expense
     * <p>
     * Lineage reference object : RNROVRD_PAR_MED_DENT_EXP_IM
     * 
     */
    @JsonProperty("parMedDentExpIm")
    public Double getParMedDentExpIm() {
        return parMedDentExpIm;
    }

    /**
     * IM-Parent Medical or Dental Expense
     * <p>
     * Lineage reference object : RNROVRD_PAR_MED_DENT_EXP_IM
     * 
     */
    @JsonProperty("parMedDentExpIm")
    public void setParMedDentExpIm(Double parMedDentExpIm) {
        this.parMedDentExpIm = parMedDentExpIm;
    }

    public _20222023ApplicantOverride100PutRequest withParMedDentExpIm(Double parMedDentExpIm) {
        this.parMedDentExpIm = parMedDentExpIm;
        return this;
    }

    /**
     * Lock Current Record
     * <p>
     * 
     * 
     */
    @JsonProperty("lockCurrRecord")
    public String getLockCurrRecord() {
        return lockCurrRecord;
    }

    /**
     * Lock Current Record
     * <p>
     * 
     * 
     */
    @JsonProperty("lockCurrRecord")
    public void setLockCurrRecord(String lockCurrRecord) {
        this.lockCurrRecord = lockCurrRecord;
    }

    public _20222023ApplicantOverride100PutRequest withLockCurrRecord(String lockCurrRecord) {
        this.lockCurrRecord = lockCurrRecord;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("studentId")
    public Object getStudentId() {
        return studentId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("studentId")
    public void setStudentId(Object studentId) {
        this.studentId = studentId;
    }

    public _20222023ApplicantOverride100PutRequest withStudentId(Object studentId) {
        this.studentId = studentId;
        return this;
    }

    /**
     * FM-Student Budget Duration
     * <p>
     * Lineage reference object : RNROVRD_BUDG_DUR_FM
     * 
     */
    @JsonProperty("budgDurFm")
    public Double getBudgDurFm() {
        return budgDurFm;
    }

    /**
     * FM-Student Budget Duration
     * <p>
     * Lineage reference object : RNROVRD_BUDG_DUR_FM
     * 
     */
    @JsonProperty("budgDurFm")
    public void setBudgDurFm(Double budgDurFm) {
        this.budgDurFm = budgDurFm;
    }

    public _20222023ApplicantOverride100PutRequest withBudgDurFm(Double budgDurFm) {
        this.budgDurFm = budgDurFm;
        return this;
    }

    /**
     * New FM Record Source
     * <p>
     * 
     * 
     */
    @JsonProperty("fmRecord")
    public String getFmRecord() {
        return fmRecord;
    }

    /**
     * New FM Record Source
     * <p>
     * 
     * 
     */
    @JsonProperty("fmRecord")
    public void setFmRecord(String fmRecord) {
        this.fmRecord = fmRecord;
    }

    public _20222023ApplicantOverride100PutRequest withFmRecord(String fmRecord) {
        this.fmRecord = fmRecord;
        return this;
    }

    /**
     * IM-Parent Other Income Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_OTH_INC_ALLOW_IM
     * 
     */
    @JsonProperty("parOthIncAllowIm")
    public Double getParOthIncAllowIm() {
        return parOthIncAllowIm;
    }

    /**
     * IM-Parent Other Income Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_OTH_INC_ALLOW_IM
     * 
     */
    @JsonProperty("parOthIncAllowIm")
    public void setParOthIncAllowIm(Double parOthIncAllowIm) {
        this.parOthIncAllowIm = parOthIncAllowIm;
    }

    public _20222023ApplicantOverride100PutRequest withParOthIncAllowIm(Double parOthIncAllowIm) {
        this.parOthIncAllowIm = parOthIncAllowIm;
        return this;
    }

    /**
     * IM-Student Medical or Dental Expense
     * <p>
     * Lineage reference object : RNROVRD_MED_DENT_EXP_IM
     * 
     */
    @JsonProperty("medDentExpIm")
    public Double getMedDentExpIm() {
        return medDentExpIm;
    }

    /**
     * IM-Student Medical or Dental Expense
     * <p>
     * Lineage reference object : RNROVRD_MED_DENT_EXP_IM
     * 
     */
    @JsonProperty("medDentExpIm")
    public void setMedDentExpIm(Double medDentExpIm) {
        this.medDentExpIm = medDentExpIm;
    }

    public _20222023ApplicantOverride100PutRequest withMedDentExpIm(Double medDentExpIm) {
        this.medDentExpIm = medDentExpIm;
        return this;
    }

    /**
     * IM-Student Calculate Parent Contribution for Independent Student
     * <p>
     * Lineage reference object : RNROVRD_CALC_PC_IM
     * 
     */
    @JsonProperty("calcPcIm")
    public String getCalcPcIm() {
        return calcPcIm;
    }

    /**
     * IM-Student Calculate Parent Contribution for Independent Student
     * <p>
     * Lineage reference object : RNROVRD_CALC_PC_IM
     * 
     */
    @JsonProperty("calcPcIm")
    public void setCalcPcIm(String calcPcIm) {
        this.calcPcIm = calcPcIm;
    }

    public _20222023ApplicantOverride100PutRequest withCalcPcIm(String calcPcIm) {
        this.calcPcIm = calcPcIm;
        return this;
    }

    /**
     * IM-Student Other Income Allowance
     * <p>
     * Lineage reference object : RNROVRD_OTH_INC_ALLOW_IM
     * 
     */
    @JsonProperty("othIncAllowIm")
    public Double getOthIncAllowIm() {
        return othIncAllowIm;
    }

    /**
     * IM-Student Other Income Allowance
     * <p>
     * Lineage reference object : RNROVRD_OTH_INC_ALLOW_IM
     * 
     */
    @JsonProperty("othIncAllowIm")
    public void setOthIncAllowIm(Double othIncAllowIm) {
        this.othIncAllowIm = othIncAllowIm;
    }

    public _20222023ApplicantOverride100PutRequest withOthIncAllowIm(Double othIncAllowIm) {
        this.othIncAllowIm = othIncAllowIm;
        return this;
    }

    /**
     * FM-Student Calculate Parent Contribution for Independent Student
     * <p>
     * Lineage reference object : RNROVRD_CALC_PC_FM
     * 
     */
    @JsonProperty("calcPcFm")
    public String getCalcPcFm() {
        return calcPcFm;
    }

    /**
     * FM-Student Calculate Parent Contribution for Independent Student
     * <p>
     * Lineage reference object : RNROVRD_CALC_PC_FM
     * 
     */
    @JsonProperty("calcPcFm")
    public void setCalcPcFm(String calcPcFm) {
        this.calcPcFm = calcPcFm;
    }

    public _20222023ApplicantOverride100PutRequest withCalcPcFm(String calcPcFm) {
        this.calcPcFm = calcPcFm;
        return this;
    }

    /**
     * IM-Student Other Assets
     * <p>
     * Lineage reference object : RNROVRD_OTH_ASSET_IM
     * 
     */
    @JsonProperty("othAssetIm")
    public Double getOthAssetIm() {
        return othAssetIm;
    }

    /**
     * IM-Student Other Assets
     * <p>
     * Lineage reference object : RNROVRD_OTH_ASSET_IM
     * 
     */
    @JsonProperty("othAssetIm")
    public void setOthAssetIm(Double othAssetIm) {
        this.othAssetIm = othAssetIm;
    }

    public _20222023ApplicantOverride100PutRequest withOthAssetIm(Double othAssetIm) {
        this.othAssetIm = othAssetIm;
        return this;
    }

    /**
     * IM-Parent Other Asset Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_ASSET_ALLOW_IM
     * 
     */
    @JsonProperty("parAssetAllowIm")
    public Double getParAssetAllowIm() {
        return parAssetAllowIm;
    }

    /**
     * IM-Parent Other Asset Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_ASSET_ALLOW_IM
     * 
     */
    @JsonProperty("parAssetAllowIm")
    public void setParAssetAllowIm(Double parAssetAllowIm) {
        this.parAssetAllowIm = parAssetAllowIm;
    }

    public _20222023ApplicantOverride100PutRequest withParAssetAllowIm(Double parAssetAllowIm) {
        this.parAssetAllowIm = parAssetAllowIm;
        return this;
    }

    /**
     * IM-Parent US Tax Calculation Option
     * <p>
     * Lineage reference object : RNROVRD_PAR_CALC_US_TAX_IM
     * 
     */
    @JsonProperty("parCalcUsTaxIm")
    public String getParCalcUsTaxIm() {
        return parCalcUsTaxIm;
    }

    /**
     * IM-Parent US Tax Calculation Option
     * <p>
     * Lineage reference object : RNROVRD_PAR_CALC_US_TAX_IM
     * 
     */
    @JsonProperty("parCalcUsTaxIm")
    public void setParCalcUsTaxIm(String parCalcUsTaxIm) {
        this.parCalcUsTaxIm = parCalcUsTaxIm;
    }

    public _20222023ApplicantOverride100PutRequest withParCalcUsTaxIm(String parCalcUsTaxIm) {
        this.parCalcUsTaxIm = parCalcUsTaxIm;
        return this;
    }

    /**
     * Lock Active IM Record
     * <p>
     * 
     * 
     */
    @JsonProperty("lockIMRecord")
    public String getLockIMRecord() {
        return lockIMRecord;
    }

    /**
     * Lock Active IM Record
     * <p>
     * 
     * 
     */
    @JsonProperty("lockIMRecord")
    public void setLockIMRecord(String lockIMRecord) {
        this.lockIMRecord = lockIMRecord;
    }

    public _20222023ApplicantOverride100PutRequest withLockIMRecord(String lockIMRecord) {
        this.lockIMRecord = lockIMRecord;
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

    public _20222023ApplicantOverride100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20222023ApplicantOverride100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chgDependFm");
        sb.append('=');
        sb.append(((this.chgDependFm == null)?"<null>":this.chgDependFm));
        sb.append(',');
        sb.append("parTuitExpIm");
        sb.append('=');
        sb.append(((this.parTuitExpIm == null)?"<null>":this.parTuitExpIm));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("chgDependIm");
        sb.append('=');
        sb.append(((this.chgDependIm == null)?"<null>":this.chgDependIm));
        sb.append(',');
        sb.append("parOthAssetIm");
        sb.append('=');
        sb.append(((this.parOthAssetIm == null)?"<null>":this.parOthAssetIm));
        sb.append(',');
        sb.append("assetAllowIm");
        sb.append('=');
        sb.append(((this.assetAllowIm == null)?"<null>":this.assetAllowIm));
        sb.append(',');
        sb.append("calcUsTaxIm");
        sb.append('=');
        sb.append(((this.calcUsTaxIm == null)?"<null>":this.calcUsTaxIm));
        sb.append(',');
        sb.append("verificationMessage");
        sb.append('=');
        sb.append(((this.verificationMessage == null)?"<null>":this.verificationMessage));
        sb.append(',');
        sb.append("budgDurIm");
        sb.append('=');
        sb.append(((this.budgDurIm == null)?"<null>":this.budgDurIm));
        sb.append(',');
        sb.append("parMedDentExpIm");
        sb.append('=');
        sb.append(((this.parMedDentExpIm == null)?"<null>":this.parMedDentExpIm));
        sb.append(',');
        sb.append("lockCurrRecord");
        sb.append('=');
        sb.append(((this.lockCurrRecord == null)?"<null>":this.lockCurrRecord));
        sb.append(',');
        sb.append("studentId");
        sb.append('=');
        sb.append(((this.studentId == null)?"<null>":this.studentId));
        sb.append(',');
        sb.append("budgDurFm");
        sb.append('=');
        sb.append(((this.budgDurFm == null)?"<null>":this.budgDurFm));
        sb.append(',');
        sb.append("fmRecord");
        sb.append('=');
        sb.append(((this.fmRecord == null)?"<null>":this.fmRecord));
        sb.append(',');
        sb.append("parOthIncAllowIm");
        sb.append('=');
        sb.append(((this.parOthIncAllowIm == null)?"<null>":this.parOthIncAllowIm));
        sb.append(',');
        sb.append("medDentExpIm");
        sb.append('=');
        sb.append(((this.medDentExpIm == null)?"<null>":this.medDentExpIm));
        sb.append(',');
        sb.append("calcPcIm");
        sb.append('=');
        sb.append(((this.calcPcIm == null)?"<null>":this.calcPcIm));
        sb.append(',');
        sb.append("othIncAllowIm");
        sb.append('=');
        sb.append(((this.othIncAllowIm == null)?"<null>":this.othIncAllowIm));
        sb.append(',');
        sb.append("calcPcFm");
        sb.append('=');
        sb.append(((this.calcPcFm == null)?"<null>":this.calcPcFm));
        sb.append(',');
        sb.append("othAssetIm");
        sb.append('=');
        sb.append(((this.othAssetIm == null)?"<null>":this.othAssetIm));
        sb.append(',');
        sb.append("parAssetAllowIm");
        sb.append('=');
        sb.append(((this.parAssetAllowIm == null)?"<null>":this.parAssetAllowIm));
        sb.append(',');
        sb.append("parCalcUsTaxIm");
        sb.append('=');
        sb.append(((this.parCalcUsTaxIm == null)?"<null>":this.parCalcUsTaxIm));
        sb.append(',');
        sb.append("lockIMRecord");
        sb.append('=');
        sb.append(((this.lockIMRecord == null)?"<null>":this.lockIMRecord));
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
        result = ((result* 31)+((this.chgDependFm == null)? 0 :this.chgDependFm.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.parOthAssetIm == null)? 0 :this.parOthAssetIm.hashCode()));
        result = ((result* 31)+((this.assetAllowIm == null)? 0 :this.assetAllowIm.hashCode()));
        result = ((result* 31)+((this.budgDurIm == null)? 0 :this.budgDurIm.hashCode()));
        result = ((result* 31)+((this.parMedDentExpIm == null)? 0 :this.parMedDentExpIm.hashCode()));
        result = ((result* 31)+((this.lockCurrRecord == null)? 0 :this.lockCurrRecord.hashCode()));
        result = ((result* 31)+((this.studentId == null)? 0 :this.studentId.hashCode()));
        result = ((result* 31)+((this.fmRecord == null)? 0 :this.fmRecord.hashCode()));
        result = ((result* 31)+((this.parOthIncAllowIm == null)? 0 :this.parOthIncAllowIm.hashCode()));
        result = ((result* 31)+((this.medDentExpIm == null)? 0 :this.medDentExpIm.hashCode()));
        result = ((result* 31)+((this.calcPcIm == null)? 0 :this.calcPcIm.hashCode()));
        result = ((result* 31)+((this.othIncAllowIm == null)? 0 :this.othIncAllowIm.hashCode()));
        result = ((result* 31)+((this.othAssetIm == null)? 0 :this.othAssetIm.hashCode()));
        result = ((result* 31)+((this.parAssetAllowIm == null)? 0 :this.parAssetAllowIm.hashCode()));
        result = ((result* 31)+((this.parCalcUsTaxIm == null)? 0 :this.parCalcUsTaxIm.hashCode()));
        result = ((result* 31)+((this.parTuitExpIm == null)? 0 :this.parTuitExpIm.hashCode()));
        result = ((result* 31)+((this.chgDependIm == null)? 0 :this.chgDependIm.hashCode()));
        result = ((result* 31)+((this.calcUsTaxIm == null)? 0 :this.calcUsTaxIm.hashCode()));
        result = ((result* 31)+((this.verificationMessage == null)? 0 :this.verificationMessage.hashCode()));
        result = ((result* 31)+((this.budgDurFm == null)? 0 :this.budgDurFm.hashCode()));
        result = ((result* 31)+((this.calcPcFm == null)? 0 :this.calcPcFm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lockIMRecord == null)? 0 :this.lockIMRecord.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20222023ApplicantOverride100PutRequest) == false) {
            return false;
        }
        _20222023ApplicantOverride100PutRequest rhs = ((_20222023ApplicantOverride100PutRequest) other);
        return (((((((((((((((((((((((((this.chgDependFm == rhs.chgDependFm)||((this.chgDependFm!= null)&&this.chgDependFm.equals(rhs.chgDependFm)))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.parOthAssetIm == rhs.parOthAssetIm)||((this.parOthAssetIm!= null)&&this.parOthAssetIm.equals(rhs.parOthAssetIm))))&&((this.assetAllowIm == rhs.assetAllowIm)||((this.assetAllowIm!= null)&&this.assetAllowIm.equals(rhs.assetAllowIm))))&&((this.budgDurIm == rhs.budgDurIm)||((this.budgDurIm!= null)&&this.budgDurIm.equals(rhs.budgDurIm))))&&((this.parMedDentExpIm == rhs.parMedDentExpIm)||((this.parMedDentExpIm!= null)&&this.parMedDentExpIm.equals(rhs.parMedDentExpIm))))&&((this.lockCurrRecord == rhs.lockCurrRecord)||((this.lockCurrRecord!= null)&&this.lockCurrRecord.equals(rhs.lockCurrRecord))))&&((this.studentId == rhs.studentId)||((this.studentId!= null)&&this.studentId.equals(rhs.studentId))))&&((this.fmRecord == rhs.fmRecord)||((this.fmRecord!= null)&&this.fmRecord.equals(rhs.fmRecord))))&&((this.parOthIncAllowIm == rhs.parOthIncAllowIm)||((this.parOthIncAllowIm!= null)&&this.parOthIncAllowIm.equals(rhs.parOthIncAllowIm))))&&((this.medDentExpIm == rhs.medDentExpIm)||((this.medDentExpIm!= null)&&this.medDentExpIm.equals(rhs.medDentExpIm))))&&((this.calcPcIm == rhs.calcPcIm)||((this.calcPcIm!= null)&&this.calcPcIm.equals(rhs.calcPcIm))))&&((this.othIncAllowIm == rhs.othIncAllowIm)||((this.othIncAllowIm!= null)&&this.othIncAllowIm.equals(rhs.othIncAllowIm))))&&((this.othAssetIm == rhs.othAssetIm)||((this.othAssetIm!= null)&&this.othAssetIm.equals(rhs.othAssetIm))))&&((this.parAssetAllowIm == rhs.parAssetAllowIm)||((this.parAssetAllowIm!= null)&&this.parAssetAllowIm.equals(rhs.parAssetAllowIm))))&&((this.parCalcUsTaxIm == rhs.parCalcUsTaxIm)||((this.parCalcUsTaxIm!= null)&&this.parCalcUsTaxIm.equals(rhs.parCalcUsTaxIm))))&&((this.parTuitExpIm == rhs.parTuitExpIm)||((this.parTuitExpIm!= null)&&this.parTuitExpIm.equals(rhs.parTuitExpIm))))&&((this.chgDependIm == rhs.chgDependIm)||((this.chgDependIm!= null)&&this.chgDependIm.equals(rhs.chgDependIm))))&&((this.calcUsTaxIm == rhs.calcUsTaxIm)||((this.calcUsTaxIm!= null)&&this.calcUsTaxIm.equals(rhs.calcUsTaxIm))))&&((this.verificationMessage == rhs.verificationMessage)||((this.verificationMessage!= null)&&this.verificationMessage.equals(rhs.verificationMessage))))&&((this.budgDurFm == rhs.budgDurFm)||((this.budgDurFm!= null)&&this.budgDurFm.equals(rhs.budgDurFm))))&&((this.calcPcFm == rhs.calcPcFm)||((this.calcPcFm!= null)&&this.calcPcFm.equals(rhs.calcPcFm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lockIMRecord == rhs.lockIMRecord)||((this.lockIMRecord!= null)&&this.lockIMRecord.equals(rhs.lockIMRecord))));
    }

}
