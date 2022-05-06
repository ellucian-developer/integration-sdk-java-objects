
package com.ellucian.generated.bpapi.ban._2019_2020_applicant_override.v1_0_0;

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
    "iraKeoghPct",
    "agi",
    "parUseAntYrIncome",
    "parCostLivIndex",
    "useAntIncEfm",
    "parAgi",
    "stuNumInColl",
    "familyAssets",
    "parActFica",
    "parCapEqtFactor",
    "fSsnNoDobRejOvrd",
    "parHsaPreTax",
    "parMedDentExpIm",
    "homeValProj",
    "skipAgeExcl",
    "parOthIncAllowIm",
    "allowImPcLowrFm",
    "allowImScLowrFm",
    "ssnNoDobRejOvrd",
    "mSsnNoDobRejOvrd",
    "medDentExpIm",
    "othIncAllowIm",
    "othAssetIm",
    "parExclTuitDed",
    "capEqtFactor",
    "limitPcByBdgt",
    "numInCollEfm",
    "parAgiOpt",
    "actFica",
    "parTuitExpIm",
    "chgDependIm",
    "invProj",
    "parAddBkHopeOpt",
    "parFsaHealthCare",
    "stuBudget",
    "calcUsTaxIm",
    "parNumInColl",
    "priorYrPc",
    "sHomeValProj",
    "anticipatedUsTax",
    "parAnticipatedUsTax",
    "useAntYrIncome",
    "parNumInHsldEfm",
    "addBkHopeOpt",
    "homeValCap",
    "capIntlStuIpa",
    "hsgMultOvrd",
    "nonCustPcOpt",
    "parNumInCollEfm",
    "parStLocTaxRate",
    "usePStTaxAlwnce",
    "calcPcFm",
    "parUseAntIncEfm",
    "nonCustOpt",
    "minScFromInc",
    "minPcFromAssets",
    "parUntaxInc",
    "chgDependFm",
    "stLocTaxRate",
    "assetAllowIm",
    "fSsnNoNameRejOvrd",
    "parOthAssetIm",
    "pIndexPc",
    "assetAssessPct",
    "minScFromAssets",
    "budgDurIm",
    "priorYrSc",
    "parHsgMultOvrd",
    "parActStLocTax",
    "parAssetAssessPct",
    "exclFwsFrIncExc",
    "sInvProj",
    "parFsaDependentCare",
    "zeroLossOth",
    "calcPcIm",
    "parAssetAllowIm",
    "parEmpAllow",
    "untaxInc",
    "parCalcUsTaxIm",
    "mSsnNoNameRejOvrd",
    "numInHsldEfm",
    "stuEmpAllow",
    "usTaxAmt",
    "zeroLossBusFarm",
    "actStLocTax",
    "minScFromIncCalc",
    "parUsTaxAmt",
    "calcTcaWCc",
    "minPcFromInc",
    "ssnNoNameRejOvrd",
    "budgDurFm",
    "sIndexSc",
    "parHomeValCap",
    "parIpaAmt",
    "incAssessRate",
    "pcNonCustPar"
})
@Generated("jsonschema2pojo")
public class Rnrovrd {

    /**
     * Percent IRA to Include
     * <p>
     * Lineage reference object : RNROVRD_IRA_KEOGH_PCT
     * 
     */
    @JsonProperty("iraKeoghPct")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_IRA_KEOGH_PCT")
    private Double iraKeoghPct;
    /**
     * IM-Student Adjusted Gross Income
     * <p>
     * Lineage reference object : RNROVRD_AGI
     * 
     */
    @JsonProperty("agi")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_AGI")
    private Double agi;
    /**
     * IM-Parent Use Anticipated Year Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_USE_ANT_YR_INCOME
     * 
     */
    @JsonProperty("parUseAntYrIncome")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_USE_ANT_YR_INCOME")
    private String parUseAntYrIncome;
    /**
     * Cost of Living Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_COST_LIV_INDEX
     * 
     */
    @JsonProperty("parCostLivIndex")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_COST_LIV_INDEX")
    private Double parCostLivIndex;
    /**
     * IM-Student Use Anticipated Year Income (EFM)
     * <p>
     * Lineage reference object : RNROVRD_USE_ANT_INC_EFM
     * 
     */
    @JsonProperty("useAntIncEfm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_USE_ANT_INC_EFM")
    private String useAntIncEfm;
    /**
     * Adjusted Gross Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_AGI
     * 
     */
    @JsonProperty("parAgi")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_AGI")
    private Double parAgi;
    /**
     * IM-Student Number in College
     * <p>
     * Lineage reference object : RNROVRD_STU_NUM_IN_COLL
     * 
     */
    @JsonProperty("stuNumInColl")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_STU_NUM_IN_COLL")
    private Double stuNumInColl;
    /**
     * Use Family Assets
     * <p>
     * Lineage reference object : RNROVRD_FAMILY_ASSETS
     * 
     */
    @JsonProperty("familyAssets")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_FAMILY_ASSETS")
    private String familyAssets;
    /**
     * FICA Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_ACT_FICA
     * 
     */
    @JsonProperty("parActFica")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_ACT_FICA")
    private Double parActFica;
    /**
     * Cap Home Equity Factor
     * <p>
     * Lineage reference object : RNROVRD_PAR_CAP_EQT_FACTOR
     * 
     */
    @JsonProperty("parCapEqtFactor")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_CAP_EQT_FACTOR")
    private Double parCapEqtFactor;
    /**
     * S: Parent 1 SSN match, but no Date of Birth match
     * <p>
     * Lineage reference object : RNROVRD_F_SSN_NO_DOB_REJ_OVRD
     * 
     */
    @JsonProperty("fSsnNoDobRejOvrd")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_F_SSN_NO_DOB_REJ_OVRD")
    private String fSsnNoDobRejOvrd;
    /**
     * Include HSA Pre-Tax Contribution in Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_HSA_PRE_TAX
     * 
     */
    @JsonProperty("parHsaPreTax")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_HSA_PRE_TAX")
    private String parHsaPreTax;
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
     * Projection Residence Option
     * <p>
     * Lineage reference object : RNROVRD_HOME_VAL_PROJ
     * 
     */
    @JsonProperty("homeValProj")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_HOME_VAL_PROJ")
    private String homeValProj;
    /**
     * Skip Exclusion of Family Members from Household and Number in College
     * <p>
     * Lineage reference object : RNROVRD_SKIP_AGE_EXCL
     * 
     */
    @JsonProperty("skipAgeExcl")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_SKIP_AGE_EXCL")
    private String skipAgeExcl;
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
     * Use FM as Minimum IM Contribution
     * <p>
     * Lineage reference object : RNROVRD_ALLOW_IM_PC_LOWR_FM
     * 
     */
    @JsonProperty("allowImPcLowrFm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ALLOW_IM_PC_LOWR_FM")
    private String allowImPcLowrFm;
    /**
     * IM-Student IM Contribution Lower than FM
     * <p>
     * Lineage reference object : RNROVRD_ALLOW_IM_SC_LOWR_FM
     * 
     */
    @JsonProperty("allowImScLowrFm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ALLOW_IM_SC_LOWR_FM")
    private String allowImScLowrFm;
    /**
     * R: Student's SSN match, but no Date of Birth match
     * <p>
     * Lineage reference object : RNROVRD_SSN_NO_DOB_REJ_OVRD
     * 
     */
    @JsonProperty("ssnNoDobRejOvrd")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_SSN_NO_DOB_REJ_OVRD")
    private String ssnNoDobRejOvrd;
    /**
     * T: Parent 2 SSN match, but no Date of Birth match
     * <p>
     * Lineage reference object : RNROVRD_M_SSN_NO_DOB_REJ_OVRD
     * 
     */
    @JsonProperty("mSsnNoDobRejOvrd")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_M_SSN_NO_DOB_REJ_OVRD")
    private String mSsnNoDobRejOvrd;
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
     * IM-Student Other Income Allowance
     * <p>
     * Lineage reference object : RNROVRD_OTH_INC_ALLOW_IM
     * 
     */
    @JsonProperty("othIncAllowIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_OTH_INC_ALLOW_IM")
    private Double othIncAllowIm;
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
     * Exclude Tuition and Fee Deduction
     * <p>
     * Lineage reference object : RNROVRD_PAR_EXCL_TUIT_DED
     * 
     */
    @JsonProperty("parExclTuitDed")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_EXCL_TUIT_DED")
    private String parExclTuitDed;
    /**
     * IM-Student Cap Home Equity Factor
     * <p>
     * Lineage reference object : RNROVRD_CAP_EQT_FACTOR
     * 
     */
    @JsonProperty("capEqtFactor")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_CAP_EQT_FACTOR")
    private Double capEqtFactor;
    /**
     * Limit Parent Contribution for Other Family Members by Budget
     * <p>
     * Lineage reference object : RNROVRD_LIMIT_PC_BY_BDGT
     * 
     */
    @JsonProperty("limitPcByBdgt")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_LIMIT_PC_BY_BDGT")
    private String limitPcByBdgt;
    /**
     * IM-Student Number in College(EFM)
     * <p>
     * Lineage reference object : RNROVRD_NUM_IN_COLL_EFM
     * 
     */
    @JsonProperty("numInCollEfm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_NUM_IN_COLL_EFM")
    private Double numInCollEfm;
    /**
     * Which (reported or computed) Parents' Adjusted Gross Income to use
     * <p>
     * Lineage reference object : RNROVRD_PAR_AGI_OPT
     * 
     */
    @JsonProperty("parAgiOpt")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_AGI_OPT")
    private String parAgiOpt;
    /**
     * IM-Student FICA Allowance
     * <p>
     * Lineage reference object : RNROVRD_ACT_FICA
     * 
     */
    @JsonProperty("actFica")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ACT_FICA")
    private Double actFica;
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
     * IM-Student Dependency
     * <p>
     * Lineage reference object : RNROVRD_CHG_DEPEND_IM
     * 
     */
    @JsonProperty("chgDependIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_CHG_DEPEND_IM")
    private String chgDependIm;
    /**
     * Impute Asset Option
     * <p>
     * Lineage reference object : RNROVRD_INV_PROJ
     * 
     */
    @JsonProperty("invProj")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_INV_PROJ")
    private String invProj;
    /**
     * Add Back Hope and Lifelong Learning Credit
     * <p>
     * Lineage reference object : RNROVRD_PAR_ADD_BK_HOPE_OPT
     * 
     */
    @JsonProperty("parAddBkHopeOpt")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_ADD_BK_HOPE_OPT")
    private String parAddBkHopeOpt;
    /**
     * Include Health Care FSA in Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_FSA_HEALTH_CARE
     * 
     */
    @JsonProperty("parFsaHealthCare")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_FSA_HEALTH_CARE")
    private String parFsaHealthCare;
    /**
     * Student's Total Budget
     * <p>
     * Lineage reference object : RNROVRD_STU_BUDGET
     * 
     */
    @JsonProperty("stuBudget")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_STU_BUDGET")
    private Double stuBudget;
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
     * Number in College
     * <p>
     * Lineage reference object : RNROVRD_PAR_NUM_IN_COLL
     * 
     */
    @JsonProperty("parNumInColl")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_NUM_IN_COLL")
    private Double parNumInColl;
    /**
     * Prior Year Contribution
     * <p>
     * Lineage reference object : RNROVRD_PRIOR_YR_PC
     * 
     */
    @JsonProperty("priorYrPc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PRIOR_YR_PC")
    private Double priorYrPc;
    /**
     * IM-Student Projection Residence Option
     * <p>
     * Lineage reference object : RNROVRD_S_HOME_VAL_PROJ
     * 
     */
    @JsonProperty("sHomeValProj")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_S_HOME_VAL_PROJ")
    private String sHomeValProj;
    /**
     * IM-Student Anticipated US Tax
     * <p>
     * Lineage reference object : RNROVRD_ANTICIPATED_US_TAX
     * 
     */
    @JsonProperty("anticipatedUsTax")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ANTICIPATED_US_TAX")
    private Double anticipatedUsTax;
    /**
     * IM-Parent Anticipated US Tax
     * <p>
     * Lineage reference object : RNROVRD_PAR_ANTICIPATED_US_TAX
     * 
     */
    @JsonProperty("parAnticipatedUsTax")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_ANTICIPATED_US_TAX")
    private Double parAnticipatedUsTax;
    /**
     * IM-Student Use Anticipated Year Income
     * <p>
     * Lineage reference object : RNROVRD_USE_ANT_YR_INCOME
     * 
     */
    @JsonProperty("useAntYrIncome")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_USE_ANT_YR_INCOME")
    private String useAntYrIncome;
    /**
     * Number in Family (EFM)
     * <p>
     * Lineage reference object : RNROVRD_PAR_NUM_IN_HSLD_EFM
     * 
     */
    @JsonProperty("parNumInHsldEfm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_NUM_IN_HSLD_EFM")
    private Double parNumInHsldEfm;
    /**
     * IM-Student Add Back Hope and Lifelong Learning Credit
     * <p>
     * Lineage reference object : RNROVRD_ADD_BK_HOPE_OPT
     * 
     */
    @JsonProperty("addBkHopeOpt")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ADD_BK_HOPE_OPT")
    private String addBkHopeOpt;
    /**
     * IM-Student Projected Value Cap Percent
     * <p>
     * Lineage reference object : RNROVRD_HOME_VAL_CAP
     * 
     */
    @JsonProperty("homeValCap")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_HOME_VAL_CAP")
    private Double homeValCap;
    /**
     * Limit International Student's Parents' IPA
     * <p>
     * Lineage reference object : RNROVRD_CAP_INTL_STU_IPA
     * 
     */
    @JsonProperty("capIntlStuIpa")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_CAP_INTL_STU_IPA")
    private String capIntlStuIpa;
    /**
     * IM-Student Housing Multiplier
     * <p>
     * Lineage reference object : RNROVRD_HSG_MULT_OVRD
     * 
     */
    @JsonProperty("hsgMultOvrd")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_HSG_MULT_OVRD")
    private Double hsgMultOvrd;
    /**
     * Increase Parent Contribution by Non-Custodial Parent Contribution
     * <p>
     * Lineage reference object : RNROVRD_NON_CUST_PC_OPT
     * 
     */
    @JsonProperty("nonCustPcOpt")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_NON_CUST_PC_OPT")
    private String nonCustPcOpt;
    /**
     * Number in College(EFM)
     * <p>
     * Lineage reference object : RNROVRD_PAR_NUM_IN_COLL_EFM
     * 
     */
    @JsonProperty("parNumInCollEfm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_NUM_IN_COLL_EFM")
    private Double parNumInCollEfm;
    /**
     * State and Local Tax Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_ST_LOC_TAX_RATE
     * 
     */
    @JsonProperty("parStLocTaxRate")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_ST_LOC_TAX_RATE")
    private Double parStLocTaxRate;
    /**
     * Use Student State Tax Table
     * <p>
     * Lineage reference object : RNROVRD_USE_P_ST_TAX_ALWNCE
     * 
     */
    @JsonProperty("usePStTaxAlwnce")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_USE_P_ST_TAX_ALWNCE")
    private String usePStTaxAlwnce;
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
     * IM-Parent Use Anticipated Year Income (EFM)
     * <p>
     * Lineage reference object : RNROVRD_PAR_USE_ANT_INC_EFM
     * 
     */
    @JsonProperty("parUseAntIncEfm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_USE_ANT_INC_EFM")
    private String parUseAntIncEfm;
    /**
     * Non-Custodial Parent Contribution Option
     * <p>
     * Lineage reference object : RNROVRD_NON_CUST_OPT
     * 
     */
    @JsonProperty("nonCustOpt")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_NON_CUST_OPT")
    private String nonCustOpt;
    /**
     * IM-Student Minimum Contribution From Income
     * <p>
     * Lineage reference object : RNROVRD_MIN_SC_FROM_INC
     * 
     */
    @JsonProperty("minScFromInc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_MIN_SC_FROM_INC")
    private Double minScFromInc;
    /**
     * Minimum Contribution From Assets
     * <p>
     * Lineage reference object : RNROVRD_MIN_PC_FROM_ASSETS
     * 
     */
    @JsonProperty("minPcFromAssets")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_MIN_PC_FROM_ASSETS")
    private Double minPcFromAssets;
    /**
     * Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_UNTAX_INC
     * 
     */
    @JsonProperty("parUntaxInc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_UNTAX_INC")
    private Double parUntaxInc;
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
     * IM-Student State and Local Tax Percent
     * <p>
     * Lineage reference object : RNROVRD_ST_LOC_TAX_RATE
     * 
     */
    @JsonProperty("stLocTaxRate")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ST_LOC_TAX_RATE")
    private Double stLocTaxRate;
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
     * E: Parent 1 SSN match, but no name match
     * <p>
     * Lineage reference object : RNROVRD_F_SSN_NO_NAME_REJ_OVRD
     * 
     */
    @JsonProperty("fSsnNoNameRejOvrd")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_F_SSN_NO_NAME_REJ_OVRD")
    private String fSsnNoNameRejOvrd;
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
     * Index Value
     * <p>
     * Lineage reference object : RNROVRD_P_INDEX_PC
     * 
     */
    @JsonProperty("pIndexPc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_P_INDEX_PC")
    private Double pIndexPc;
    /**
     * IM-Student Asset Assessment Percent
     * <p>
     * Lineage reference object : RNROVRD_ASSET_ASSESS_PCT
     * 
     */
    @JsonProperty("assetAssessPct")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ASSET_ASSESS_PCT")
    private Double assetAssessPct;
    /**
     * IM-Student Minimum Contribution From Assets
     * <p>
     * Lineage reference object : RNROVRD_MIN_SC_FROM_ASSETS
     * 
     */
    @JsonProperty("minScFromAssets")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_MIN_SC_FROM_ASSETS")
    private Double minScFromAssets;
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
     * IM-Student Prior Year Contribution
     * <p>
     * Lineage reference object : RNROVRD_PRIOR_YR_SC
     * 
     */
    @JsonProperty("priorYrSc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PRIOR_YR_SC")
    private Double priorYrSc;
    /**
     * Housing Multiplier
     * <p>
     * Lineage reference object : RNROVRD_PAR_HSG_MULT_OVRD
     * 
     */
    @JsonProperty("parHsgMultOvrd")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_HSG_MULT_OVRD")
    private Double parHsgMultOvrd;
    /**
     * State and Local Tax Amount
     * <p>
     * Lineage reference object : RNROVRD_PAR_ACT_ST_LOC_TAX
     * 
     */
    @JsonProperty("parActStLocTax")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_ACT_ST_LOC_TAX")
    private Double parActStLocTax;
    /**
     * Asset Assessment Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_ASSET_ASSESS_PCT
     * 
     */
    @JsonProperty("parAssetAssessPct")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_ASSET_ASSESS_PCT")
    private Double parAssetAssessPct;
    /**
     * Always Allow Student's Work Study as Income Exclusion
     * <p>
     * Lineage reference object : RNROVRD_EXCL_FWS_FR_INC_EXC
     * 
     */
    @JsonProperty("exclFwsFrIncExc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_EXCL_FWS_FR_INC_EXC")
    private String exclFwsFrIncExc;
    /**
     * IM-Student Impute Asset Option
     * <p>
     * Lineage reference object : RNROVRD_S_INV_PROJ
     * 
     */
    @JsonProperty("sInvProj")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_S_INV_PROJ")
    private String sInvProj;
    /**
     * Include Dependent Care FSA in Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_FSA_DEPENDENT_CARE
     * 
     */
    @JsonProperty("parFsaDependentCare")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_FSA_DEPENDENT_CARE")
    private String parFsaDependentCare;
    /**
     * Ignore Other Losses
     * <p>
     * Lineage reference object : RNROVRD_ZERO_LOSS_OTH
     * 
     */
    @JsonProperty("zeroLossOth")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ZERO_LOSS_OTH")
    private String zeroLossOth;
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
     * IM-Parent Other Asset Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_ASSET_ALLOW_IM
     * 
     */
    @JsonProperty("parAssetAllowIm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_ASSET_ALLOW_IM")
    private Double parAssetAllowIm;
    /**
     * Employment Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_EMP_ALLOW
     * 
     */
    @JsonProperty("parEmpAllow")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_EMP_ALLOW")
    private Double parEmpAllow;
    /**
     * IM-Student Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_UNTAX_INC
     * 
     */
    @JsonProperty("untaxInc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_UNTAX_INC")
    private Double untaxInc;
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
     * F: Parent 2 SSN match, but no name match
     * <p>
     * Lineage reference object : RNROVRD_M_SSN_NO_NAME_REJ_OVRD
     * 
     */
    @JsonProperty("mSsnNoNameRejOvrd")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_M_SSN_NO_NAME_REJ_OVRD")
    private String mSsnNoNameRejOvrd;
    /**
     * IM-Student Number in Family (EFM)
     * <p>
     * Lineage reference object : RNROVRD_NUM_IN_HSLD_EFM
     * 
     */
    @JsonProperty("numInHsldEfm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_NUM_IN_HSLD_EFM")
    private Double numInHsldEfm;
    /**
     * IM-Student Employment Allowance
     * <p>
     * Lineage reference object : RNROVRD_STU_EMP_ALLOW
     * 
     */
    @JsonProperty("stuEmpAllow")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_STU_EMP_ALLOW")
    private Double stuEmpAllow;
    /**
     * IM-Student US Income Tax Paid
     * <p>
     * Lineage reference object : RNROVRD_US_TAX_AMT
     * 
     */
    @JsonProperty("usTaxAmt")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_US_TAX_AMT")
    private Double usTaxAmt;
    /**
     * Ignore Business and Farm Losses
     * <p>
     * Lineage reference object : RNROVRD_ZERO_LOSS_BUS_FARM
     * 
     */
    @JsonProperty("zeroLossBusFarm")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ZERO_LOSS_BUS_FARM")
    private String zeroLossBusFarm;
    /**
     * IM-Student State and Local Tax Amount
     * <p>
     * Lineage reference object : RNROVRD_ACT_ST_LOC_TAX
     * 
     */
    @JsonProperty("actStLocTax")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_ACT_ST_LOC_TAX")
    private Double actStLocTax;
    /**
     * Alternate SC from Income Calculation
     * <p>
     * Lineage reference object : RNROVRD_MIN_SC_FROM_INC_CALC
     * 
     */
    @JsonProperty("minScFromIncCalc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_MIN_SC_FROM_INC_CALC")
    private String minScFromIncCalc;
    /**
     * US Income Tax Paid
     * <p>
     * Lineage reference object : RNROVRD_PAR_US_TAX_AMT
     * 
     */
    @JsonProperty("parUsTaxAmt")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_US_TAX_AMT")
    private Double parUsTaxAmt;
    /**
     * Calculate Total Contribution from Assets using Country Coefficient
     * <p>
     * Lineage reference object : RNROVRD_CALC_TCA_W_CC
     * 
     */
    @JsonProperty("calcTcaWCc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_CALC_TCA_W_CC")
    private String calcTcaWCc;
    /**
     * Minimum Contribution From Income
     * <p>
     * Lineage reference object : RNROVRD_MIN_PC_FROM_INC
     * 
     */
    @JsonProperty("minPcFromInc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_MIN_PC_FROM_INC")
    private Double minPcFromInc;
    /**
     * D: Student's SSN match, but no name match
     * <p>
     * Lineage reference object : RNROVRD_SSN_NO_NAME_REJ_OVRD
     * 
     */
    @JsonProperty("ssnNoNameRejOvrd")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_SSN_NO_NAME_REJ_OVRD")
    private String ssnNoNameRejOvrd;
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
     * IM-Student Index Value
     * <p>
     * Lineage reference object : RNROVRD_S_INDEX_SC
     * 
     */
    @JsonProperty("sIndexSc")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_S_INDEX_SC")
    private Double sIndexSc;
    /**
     * Projected Value Cap Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_HOME_VAL_CAP
     * 
     */
    @JsonProperty("parHomeValCap")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_HOME_VAL_CAP")
    private Double parHomeValCap;
    /**
     * Income Protection Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_IPA_AMT
     * 
     */
    @JsonProperty("parIpaAmt")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PAR_IPA_AMT")
    private Double parIpaAmt;
    /**
     * Income Assessment Percent
     * <p>
     * Lineage reference object : RNROVRD_INC_ASSESS_RATE
     * 
     */
    @JsonProperty("incAssessRate")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_INC_ASSESS_RATE")
    private Double incAssessRate;
    /**
     * Non-Custodial Parent Contribution (Calculated)
     * <p>
     * Lineage reference object : RNROVRD_PC_NON_CUST_PAR
     * 
     */
    @JsonProperty("pcNonCustPar")
    @JsonPropertyDescription("Lineage reference object : RNROVRD_PC_NON_CUST_PAR")
    private Double pcNonCustPar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Percent IRA to Include
     * <p>
     * Lineage reference object : RNROVRD_IRA_KEOGH_PCT
     * 
     */
    @JsonProperty("iraKeoghPct")
    public Double getIraKeoghPct() {
        return iraKeoghPct;
    }

    /**
     * Percent IRA to Include
     * <p>
     * Lineage reference object : RNROVRD_IRA_KEOGH_PCT
     * 
     */
    @JsonProperty("iraKeoghPct")
    public void setIraKeoghPct(Double iraKeoghPct) {
        this.iraKeoghPct = iraKeoghPct;
    }

    public Rnrovrd withIraKeoghPct(Double iraKeoghPct) {
        this.iraKeoghPct = iraKeoghPct;
        return this;
    }

    /**
     * IM-Student Adjusted Gross Income
     * <p>
     * Lineage reference object : RNROVRD_AGI
     * 
     */
    @JsonProperty("agi")
    public Double getAgi() {
        return agi;
    }

    /**
     * IM-Student Adjusted Gross Income
     * <p>
     * Lineage reference object : RNROVRD_AGI
     * 
     */
    @JsonProperty("agi")
    public void setAgi(Double agi) {
        this.agi = agi;
    }

    public Rnrovrd withAgi(Double agi) {
        this.agi = agi;
        return this;
    }

    /**
     * IM-Parent Use Anticipated Year Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_USE_ANT_YR_INCOME
     * 
     */
    @JsonProperty("parUseAntYrIncome")
    public String getParUseAntYrIncome() {
        return parUseAntYrIncome;
    }

    /**
     * IM-Parent Use Anticipated Year Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_USE_ANT_YR_INCOME
     * 
     */
    @JsonProperty("parUseAntYrIncome")
    public void setParUseAntYrIncome(String parUseAntYrIncome) {
        this.parUseAntYrIncome = parUseAntYrIncome;
    }

    public Rnrovrd withParUseAntYrIncome(String parUseAntYrIncome) {
        this.parUseAntYrIncome = parUseAntYrIncome;
        return this;
    }

    /**
     * Cost of Living Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_COST_LIV_INDEX
     * 
     */
    @JsonProperty("parCostLivIndex")
    public Double getParCostLivIndex() {
        return parCostLivIndex;
    }

    /**
     * Cost of Living Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_COST_LIV_INDEX
     * 
     */
    @JsonProperty("parCostLivIndex")
    public void setParCostLivIndex(Double parCostLivIndex) {
        this.parCostLivIndex = parCostLivIndex;
    }

    public Rnrovrd withParCostLivIndex(Double parCostLivIndex) {
        this.parCostLivIndex = parCostLivIndex;
        return this;
    }

    /**
     * IM-Student Use Anticipated Year Income (EFM)
     * <p>
     * Lineage reference object : RNROVRD_USE_ANT_INC_EFM
     * 
     */
    @JsonProperty("useAntIncEfm")
    public String getUseAntIncEfm() {
        return useAntIncEfm;
    }

    /**
     * IM-Student Use Anticipated Year Income (EFM)
     * <p>
     * Lineage reference object : RNROVRD_USE_ANT_INC_EFM
     * 
     */
    @JsonProperty("useAntIncEfm")
    public void setUseAntIncEfm(String useAntIncEfm) {
        this.useAntIncEfm = useAntIncEfm;
    }

    public Rnrovrd withUseAntIncEfm(String useAntIncEfm) {
        this.useAntIncEfm = useAntIncEfm;
        return this;
    }

    /**
     * Adjusted Gross Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_AGI
     * 
     */
    @JsonProperty("parAgi")
    public Double getParAgi() {
        return parAgi;
    }

    /**
     * Adjusted Gross Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_AGI
     * 
     */
    @JsonProperty("parAgi")
    public void setParAgi(Double parAgi) {
        this.parAgi = parAgi;
    }

    public Rnrovrd withParAgi(Double parAgi) {
        this.parAgi = parAgi;
        return this;
    }

    /**
     * IM-Student Number in College
     * <p>
     * Lineage reference object : RNROVRD_STU_NUM_IN_COLL
     * 
     */
    @JsonProperty("stuNumInColl")
    public Double getStuNumInColl() {
        return stuNumInColl;
    }

    /**
     * IM-Student Number in College
     * <p>
     * Lineage reference object : RNROVRD_STU_NUM_IN_COLL
     * 
     */
    @JsonProperty("stuNumInColl")
    public void setStuNumInColl(Double stuNumInColl) {
        this.stuNumInColl = stuNumInColl;
    }

    public Rnrovrd withStuNumInColl(Double stuNumInColl) {
        this.stuNumInColl = stuNumInColl;
        return this;
    }

    /**
     * Use Family Assets
     * <p>
     * Lineage reference object : RNROVRD_FAMILY_ASSETS
     * 
     */
    @JsonProperty("familyAssets")
    public String getFamilyAssets() {
        return familyAssets;
    }

    /**
     * Use Family Assets
     * <p>
     * Lineage reference object : RNROVRD_FAMILY_ASSETS
     * 
     */
    @JsonProperty("familyAssets")
    public void setFamilyAssets(String familyAssets) {
        this.familyAssets = familyAssets;
    }

    public Rnrovrd withFamilyAssets(String familyAssets) {
        this.familyAssets = familyAssets;
        return this;
    }

    /**
     * FICA Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_ACT_FICA
     * 
     */
    @JsonProperty("parActFica")
    public Double getParActFica() {
        return parActFica;
    }

    /**
     * FICA Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_ACT_FICA
     * 
     */
    @JsonProperty("parActFica")
    public void setParActFica(Double parActFica) {
        this.parActFica = parActFica;
    }

    public Rnrovrd withParActFica(Double parActFica) {
        this.parActFica = parActFica;
        return this;
    }

    /**
     * Cap Home Equity Factor
     * <p>
     * Lineage reference object : RNROVRD_PAR_CAP_EQT_FACTOR
     * 
     */
    @JsonProperty("parCapEqtFactor")
    public Double getParCapEqtFactor() {
        return parCapEqtFactor;
    }

    /**
     * Cap Home Equity Factor
     * <p>
     * Lineage reference object : RNROVRD_PAR_CAP_EQT_FACTOR
     * 
     */
    @JsonProperty("parCapEqtFactor")
    public void setParCapEqtFactor(Double parCapEqtFactor) {
        this.parCapEqtFactor = parCapEqtFactor;
    }

    public Rnrovrd withParCapEqtFactor(Double parCapEqtFactor) {
        this.parCapEqtFactor = parCapEqtFactor;
        return this;
    }

    /**
     * S: Parent 1 SSN match, but no Date of Birth match
     * <p>
     * Lineage reference object : RNROVRD_F_SSN_NO_DOB_REJ_OVRD
     * 
     */
    @JsonProperty("fSsnNoDobRejOvrd")
    public String getfSsnNoDobRejOvrd() {
        return fSsnNoDobRejOvrd;
    }

    /**
     * S: Parent 1 SSN match, but no Date of Birth match
     * <p>
     * Lineage reference object : RNROVRD_F_SSN_NO_DOB_REJ_OVRD
     * 
     */
    @JsonProperty("fSsnNoDobRejOvrd")
    public void setfSsnNoDobRejOvrd(String fSsnNoDobRejOvrd) {
        this.fSsnNoDobRejOvrd = fSsnNoDobRejOvrd;
    }

    public Rnrovrd withfSsnNoDobRejOvrd(String fSsnNoDobRejOvrd) {
        this.fSsnNoDobRejOvrd = fSsnNoDobRejOvrd;
        return this;
    }

    /**
     * Include HSA Pre-Tax Contribution in Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_HSA_PRE_TAX
     * 
     */
    @JsonProperty("parHsaPreTax")
    public String getParHsaPreTax() {
        return parHsaPreTax;
    }

    /**
     * Include HSA Pre-Tax Contribution in Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_HSA_PRE_TAX
     * 
     */
    @JsonProperty("parHsaPreTax")
    public void setParHsaPreTax(String parHsaPreTax) {
        this.parHsaPreTax = parHsaPreTax;
    }

    public Rnrovrd withParHsaPreTax(String parHsaPreTax) {
        this.parHsaPreTax = parHsaPreTax;
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

    public Rnrovrd withParMedDentExpIm(Double parMedDentExpIm) {
        this.parMedDentExpIm = parMedDentExpIm;
        return this;
    }

    /**
     * Projection Residence Option
     * <p>
     * Lineage reference object : RNROVRD_HOME_VAL_PROJ
     * 
     */
    @JsonProperty("homeValProj")
    public String getHomeValProj() {
        return homeValProj;
    }

    /**
     * Projection Residence Option
     * <p>
     * Lineage reference object : RNROVRD_HOME_VAL_PROJ
     * 
     */
    @JsonProperty("homeValProj")
    public void setHomeValProj(String homeValProj) {
        this.homeValProj = homeValProj;
    }

    public Rnrovrd withHomeValProj(String homeValProj) {
        this.homeValProj = homeValProj;
        return this;
    }

    /**
     * Skip Exclusion of Family Members from Household and Number in College
     * <p>
     * Lineage reference object : RNROVRD_SKIP_AGE_EXCL
     * 
     */
    @JsonProperty("skipAgeExcl")
    public String getSkipAgeExcl() {
        return skipAgeExcl;
    }

    /**
     * Skip Exclusion of Family Members from Household and Number in College
     * <p>
     * Lineage reference object : RNROVRD_SKIP_AGE_EXCL
     * 
     */
    @JsonProperty("skipAgeExcl")
    public void setSkipAgeExcl(String skipAgeExcl) {
        this.skipAgeExcl = skipAgeExcl;
    }

    public Rnrovrd withSkipAgeExcl(String skipAgeExcl) {
        this.skipAgeExcl = skipAgeExcl;
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

    public Rnrovrd withParOthIncAllowIm(Double parOthIncAllowIm) {
        this.parOthIncAllowIm = parOthIncAllowIm;
        return this;
    }

    /**
     * Use FM as Minimum IM Contribution
     * <p>
     * Lineage reference object : RNROVRD_ALLOW_IM_PC_LOWR_FM
     * 
     */
    @JsonProperty("allowImPcLowrFm")
    public String getAllowImPcLowrFm() {
        return allowImPcLowrFm;
    }

    /**
     * Use FM as Minimum IM Contribution
     * <p>
     * Lineage reference object : RNROVRD_ALLOW_IM_PC_LOWR_FM
     * 
     */
    @JsonProperty("allowImPcLowrFm")
    public void setAllowImPcLowrFm(String allowImPcLowrFm) {
        this.allowImPcLowrFm = allowImPcLowrFm;
    }

    public Rnrovrd withAllowImPcLowrFm(String allowImPcLowrFm) {
        this.allowImPcLowrFm = allowImPcLowrFm;
        return this;
    }

    /**
     * IM-Student IM Contribution Lower than FM
     * <p>
     * Lineage reference object : RNROVRD_ALLOW_IM_SC_LOWR_FM
     * 
     */
    @JsonProperty("allowImScLowrFm")
    public String getAllowImScLowrFm() {
        return allowImScLowrFm;
    }

    /**
     * IM-Student IM Contribution Lower than FM
     * <p>
     * Lineage reference object : RNROVRD_ALLOW_IM_SC_LOWR_FM
     * 
     */
    @JsonProperty("allowImScLowrFm")
    public void setAllowImScLowrFm(String allowImScLowrFm) {
        this.allowImScLowrFm = allowImScLowrFm;
    }

    public Rnrovrd withAllowImScLowrFm(String allowImScLowrFm) {
        this.allowImScLowrFm = allowImScLowrFm;
        return this;
    }

    /**
     * R: Student's SSN match, but no Date of Birth match
     * <p>
     * Lineage reference object : RNROVRD_SSN_NO_DOB_REJ_OVRD
     * 
     */
    @JsonProperty("ssnNoDobRejOvrd")
    public String getSsnNoDobRejOvrd() {
        return ssnNoDobRejOvrd;
    }

    /**
     * R: Student's SSN match, but no Date of Birth match
     * <p>
     * Lineage reference object : RNROVRD_SSN_NO_DOB_REJ_OVRD
     * 
     */
    @JsonProperty("ssnNoDobRejOvrd")
    public void setSsnNoDobRejOvrd(String ssnNoDobRejOvrd) {
        this.ssnNoDobRejOvrd = ssnNoDobRejOvrd;
    }

    public Rnrovrd withSsnNoDobRejOvrd(String ssnNoDobRejOvrd) {
        this.ssnNoDobRejOvrd = ssnNoDobRejOvrd;
        return this;
    }

    /**
     * T: Parent 2 SSN match, but no Date of Birth match
     * <p>
     * Lineage reference object : RNROVRD_M_SSN_NO_DOB_REJ_OVRD
     * 
     */
    @JsonProperty("mSsnNoDobRejOvrd")
    public String getmSsnNoDobRejOvrd() {
        return mSsnNoDobRejOvrd;
    }

    /**
     * T: Parent 2 SSN match, but no Date of Birth match
     * <p>
     * Lineage reference object : RNROVRD_M_SSN_NO_DOB_REJ_OVRD
     * 
     */
    @JsonProperty("mSsnNoDobRejOvrd")
    public void setmSsnNoDobRejOvrd(String mSsnNoDobRejOvrd) {
        this.mSsnNoDobRejOvrd = mSsnNoDobRejOvrd;
    }

    public Rnrovrd withmSsnNoDobRejOvrd(String mSsnNoDobRejOvrd) {
        this.mSsnNoDobRejOvrd = mSsnNoDobRejOvrd;
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

    public Rnrovrd withMedDentExpIm(Double medDentExpIm) {
        this.medDentExpIm = medDentExpIm;
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

    public Rnrovrd withOthIncAllowIm(Double othIncAllowIm) {
        this.othIncAllowIm = othIncAllowIm;
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

    public Rnrovrd withOthAssetIm(Double othAssetIm) {
        this.othAssetIm = othAssetIm;
        return this;
    }

    /**
     * Exclude Tuition and Fee Deduction
     * <p>
     * Lineage reference object : RNROVRD_PAR_EXCL_TUIT_DED
     * 
     */
    @JsonProperty("parExclTuitDed")
    public String getParExclTuitDed() {
        return parExclTuitDed;
    }

    /**
     * Exclude Tuition and Fee Deduction
     * <p>
     * Lineage reference object : RNROVRD_PAR_EXCL_TUIT_DED
     * 
     */
    @JsonProperty("parExclTuitDed")
    public void setParExclTuitDed(String parExclTuitDed) {
        this.parExclTuitDed = parExclTuitDed;
    }

    public Rnrovrd withParExclTuitDed(String parExclTuitDed) {
        this.parExclTuitDed = parExclTuitDed;
        return this;
    }

    /**
     * IM-Student Cap Home Equity Factor
     * <p>
     * Lineage reference object : RNROVRD_CAP_EQT_FACTOR
     * 
     */
    @JsonProperty("capEqtFactor")
    public Double getCapEqtFactor() {
        return capEqtFactor;
    }

    /**
     * IM-Student Cap Home Equity Factor
     * <p>
     * Lineage reference object : RNROVRD_CAP_EQT_FACTOR
     * 
     */
    @JsonProperty("capEqtFactor")
    public void setCapEqtFactor(Double capEqtFactor) {
        this.capEqtFactor = capEqtFactor;
    }

    public Rnrovrd withCapEqtFactor(Double capEqtFactor) {
        this.capEqtFactor = capEqtFactor;
        return this;
    }

    /**
     * Limit Parent Contribution for Other Family Members by Budget
     * <p>
     * Lineage reference object : RNROVRD_LIMIT_PC_BY_BDGT
     * 
     */
    @JsonProperty("limitPcByBdgt")
    public String getLimitPcByBdgt() {
        return limitPcByBdgt;
    }

    /**
     * Limit Parent Contribution for Other Family Members by Budget
     * <p>
     * Lineage reference object : RNROVRD_LIMIT_PC_BY_BDGT
     * 
     */
    @JsonProperty("limitPcByBdgt")
    public void setLimitPcByBdgt(String limitPcByBdgt) {
        this.limitPcByBdgt = limitPcByBdgt;
    }

    public Rnrovrd withLimitPcByBdgt(String limitPcByBdgt) {
        this.limitPcByBdgt = limitPcByBdgt;
        return this;
    }

    /**
     * IM-Student Number in College(EFM)
     * <p>
     * Lineage reference object : RNROVRD_NUM_IN_COLL_EFM
     * 
     */
    @JsonProperty("numInCollEfm")
    public Double getNumInCollEfm() {
        return numInCollEfm;
    }

    /**
     * IM-Student Number in College(EFM)
     * <p>
     * Lineage reference object : RNROVRD_NUM_IN_COLL_EFM
     * 
     */
    @JsonProperty("numInCollEfm")
    public void setNumInCollEfm(Double numInCollEfm) {
        this.numInCollEfm = numInCollEfm;
    }

    public Rnrovrd withNumInCollEfm(Double numInCollEfm) {
        this.numInCollEfm = numInCollEfm;
        return this;
    }

    /**
     * Which (reported or computed) Parents' Adjusted Gross Income to use
     * <p>
     * Lineage reference object : RNROVRD_PAR_AGI_OPT
     * 
     */
    @JsonProperty("parAgiOpt")
    public String getParAgiOpt() {
        return parAgiOpt;
    }

    /**
     * Which (reported or computed) Parents' Adjusted Gross Income to use
     * <p>
     * Lineage reference object : RNROVRD_PAR_AGI_OPT
     * 
     */
    @JsonProperty("parAgiOpt")
    public void setParAgiOpt(String parAgiOpt) {
        this.parAgiOpt = parAgiOpt;
    }

    public Rnrovrd withParAgiOpt(String parAgiOpt) {
        this.parAgiOpt = parAgiOpt;
        return this;
    }

    /**
     * IM-Student FICA Allowance
     * <p>
     * Lineage reference object : RNROVRD_ACT_FICA
     * 
     */
    @JsonProperty("actFica")
    public Double getActFica() {
        return actFica;
    }

    /**
     * IM-Student FICA Allowance
     * <p>
     * Lineage reference object : RNROVRD_ACT_FICA
     * 
     */
    @JsonProperty("actFica")
    public void setActFica(Double actFica) {
        this.actFica = actFica;
    }

    public Rnrovrd withActFica(Double actFica) {
        this.actFica = actFica;
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

    public Rnrovrd withParTuitExpIm(Double parTuitExpIm) {
        this.parTuitExpIm = parTuitExpIm;
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

    public Rnrovrd withChgDependIm(String chgDependIm) {
        this.chgDependIm = chgDependIm;
        return this;
    }

    /**
     * Impute Asset Option
     * <p>
     * Lineage reference object : RNROVRD_INV_PROJ
     * 
     */
    @JsonProperty("invProj")
    public String getInvProj() {
        return invProj;
    }

    /**
     * Impute Asset Option
     * <p>
     * Lineage reference object : RNROVRD_INV_PROJ
     * 
     */
    @JsonProperty("invProj")
    public void setInvProj(String invProj) {
        this.invProj = invProj;
    }

    public Rnrovrd withInvProj(String invProj) {
        this.invProj = invProj;
        return this;
    }

    /**
     * Add Back Hope and Lifelong Learning Credit
     * <p>
     * Lineage reference object : RNROVRD_PAR_ADD_BK_HOPE_OPT
     * 
     */
    @JsonProperty("parAddBkHopeOpt")
    public String getParAddBkHopeOpt() {
        return parAddBkHopeOpt;
    }

    /**
     * Add Back Hope and Lifelong Learning Credit
     * <p>
     * Lineage reference object : RNROVRD_PAR_ADD_BK_HOPE_OPT
     * 
     */
    @JsonProperty("parAddBkHopeOpt")
    public void setParAddBkHopeOpt(String parAddBkHopeOpt) {
        this.parAddBkHopeOpt = parAddBkHopeOpt;
    }

    public Rnrovrd withParAddBkHopeOpt(String parAddBkHopeOpt) {
        this.parAddBkHopeOpt = parAddBkHopeOpt;
        return this;
    }

    /**
     * Include Health Care FSA in Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_FSA_HEALTH_CARE
     * 
     */
    @JsonProperty("parFsaHealthCare")
    public String getParFsaHealthCare() {
        return parFsaHealthCare;
    }

    /**
     * Include Health Care FSA in Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_FSA_HEALTH_CARE
     * 
     */
    @JsonProperty("parFsaHealthCare")
    public void setParFsaHealthCare(String parFsaHealthCare) {
        this.parFsaHealthCare = parFsaHealthCare;
    }

    public Rnrovrd withParFsaHealthCare(String parFsaHealthCare) {
        this.parFsaHealthCare = parFsaHealthCare;
        return this;
    }

    /**
     * Student's Total Budget
     * <p>
     * Lineage reference object : RNROVRD_STU_BUDGET
     * 
     */
    @JsonProperty("stuBudget")
    public Double getStuBudget() {
        return stuBudget;
    }

    /**
     * Student's Total Budget
     * <p>
     * Lineage reference object : RNROVRD_STU_BUDGET
     * 
     */
    @JsonProperty("stuBudget")
    public void setStuBudget(Double stuBudget) {
        this.stuBudget = stuBudget;
    }

    public Rnrovrd withStuBudget(Double stuBudget) {
        this.stuBudget = stuBudget;
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

    public Rnrovrd withCalcUsTaxIm(String calcUsTaxIm) {
        this.calcUsTaxIm = calcUsTaxIm;
        return this;
    }

    /**
     * Number in College
     * <p>
     * Lineage reference object : RNROVRD_PAR_NUM_IN_COLL
     * 
     */
    @JsonProperty("parNumInColl")
    public Double getParNumInColl() {
        return parNumInColl;
    }

    /**
     * Number in College
     * <p>
     * Lineage reference object : RNROVRD_PAR_NUM_IN_COLL
     * 
     */
    @JsonProperty("parNumInColl")
    public void setParNumInColl(Double parNumInColl) {
        this.parNumInColl = parNumInColl;
    }

    public Rnrovrd withParNumInColl(Double parNumInColl) {
        this.parNumInColl = parNumInColl;
        return this;
    }

    /**
     * Prior Year Contribution
     * <p>
     * Lineage reference object : RNROVRD_PRIOR_YR_PC
     * 
     */
    @JsonProperty("priorYrPc")
    public Double getPriorYrPc() {
        return priorYrPc;
    }

    /**
     * Prior Year Contribution
     * <p>
     * Lineage reference object : RNROVRD_PRIOR_YR_PC
     * 
     */
    @JsonProperty("priorYrPc")
    public void setPriorYrPc(Double priorYrPc) {
        this.priorYrPc = priorYrPc;
    }

    public Rnrovrd withPriorYrPc(Double priorYrPc) {
        this.priorYrPc = priorYrPc;
        return this;
    }

    /**
     * IM-Student Projection Residence Option
     * <p>
     * Lineage reference object : RNROVRD_S_HOME_VAL_PROJ
     * 
     */
    @JsonProperty("sHomeValProj")
    public String getsHomeValProj() {
        return sHomeValProj;
    }

    /**
     * IM-Student Projection Residence Option
     * <p>
     * Lineage reference object : RNROVRD_S_HOME_VAL_PROJ
     * 
     */
    @JsonProperty("sHomeValProj")
    public void setsHomeValProj(String sHomeValProj) {
        this.sHomeValProj = sHomeValProj;
    }

    public Rnrovrd withsHomeValProj(String sHomeValProj) {
        this.sHomeValProj = sHomeValProj;
        return this;
    }

    /**
     * IM-Student Anticipated US Tax
     * <p>
     * Lineage reference object : RNROVRD_ANTICIPATED_US_TAX
     * 
     */
    @JsonProperty("anticipatedUsTax")
    public Double getAnticipatedUsTax() {
        return anticipatedUsTax;
    }

    /**
     * IM-Student Anticipated US Tax
     * <p>
     * Lineage reference object : RNROVRD_ANTICIPATED_US_TAX
     * 
     */
    @JsonProperty("anticipatedUsTax")
    public void setAnticipatedUsTax(Double anticipatedUsTax) {
        this.anticipatedUsTax = anticipatedUsTax;
    }

    public Rnrovrd withAnticipatedUsTax(Double anticipatedUsTax) {
        this.anticipatedUsTax = anticipatedUsTax;
        return this;
    }

    /**
     * IM-Parent Anticipated US Tax
     * <p>
     * Lineage reference object : RNROVRD_PAR_ANTICIPATED_US_TAX
     * 
     */
    @JsonProperty("parAnticipatedUsTax")
    public Double getParAnticipatedUsTax() {
        return parAnticipatedUsTax;
    }

    /**
     * IM-Parent Anticipated US Tax
     * <p>
     * Lineage reference object : RNROVRD_PAR_ANTICIPATED_US_TAX
     * 
     */
    @JsonProperty("parAnticipatedUsTax")
    public void setParAnticipatedUsTax(Double parAnticipatedUsTax) {
        this.parAnticipatedUsTax = parAnticipatedUsTax;
    }

    public Rnrovrd withParAnticipatedUsTax(Double parAnticipatedUsTax) {
        this.parAnticipatedUsTax = parAnticipatedUsTax;
        return this;
    }

    /**
     * IM-Student Use Anticipated Year Income
     * <p>
     * Lineage reference object : RNROVRD_USE_ANT_YR_INCOME
     * 
     */
    @JsonProperty("useAntYrIncome")
    public String getUseAntYrIncome() {
        return useAntYrIncome;
    }

    /**
     * IM-Student Use Anticipated Year Income
     * <p>
     * Lineage reference object : RNROVRD_USE_ANT_YR_INCOME
     * 
     */
    @JsonProperty("useAntYrIncome")
    public void setUseAntYrIncome(String useAntYrIncome) {
        this.useAntYrIncome = useAntYrIncome;
    }

    public Rnrovrd withUseAntYrIncome(String useAntYrIncome) {
        this.useAntYrIncome = useAntYrIncome;
        return this;
    }

    /**
     * Number in Family (EFM)
     * <p>
     * Lineage reference object : RNROVRD_PAR_NUM_IN_HSLD_EFM
     * 
     */
    @JsonProperty("parNumInHsldEfm")
    public Double getParNumInHsldEfm() {
        return parNumInHsldEfm;
    }

    /**
     * Number in Family (EFM)
     * <p>
     * Lineage reference object : RNROVRD_PAR_NUM_IN_HSLD_EFM
     * 
     */
    @JsonProperty("parNumInHsldEfm")
    public void setParNumInHsldEfm(Double parNumInHsldEfm) {
        this.parNumInHsldEfm = parNumInHsldEfm;
    }

    public Rnrovrd withParNumInHsldEfm(Double parNumInHsldEfm) {
        this.parNumInHsldEfm = parNumInHsldEfm;
        return this;
    }

    /**
     * IM-Student Add Back Hope and Lifelong Learning Credit
     * <p>
     * Lineage reference object : RNROVRD_ADD_BK_HOPE_OPT
     * 
     */
    @JsonProperty("addBkHopeOpt")
    public String getAddBkHopeOpt() {
        return addBkHopeOpt;
    }

    /**
     * IM-Student Add Back Hope and Lifelong Learning Credit
     * <p>
     * Lineage reference object : RNROVRD_ADD_BK_HOPE_OPT
     * 
     */
    @JsonProperty("addBkHopeOpt")
    public void setAddBkHopeOpt(String addBkHopeOpt) {
        this.addBkHopeOpt = addBkHopeOpt;
    }

    public Rnrovrd withAddBkHopeOpt(String addBkHopeOpt) {
        this.addBkHopeOpt = addBkHopeOpt;
        return this;
    }

    /**
     * IM-Student Projected Value Cap Percent
     * <p>
     * Lineage reference object : RNROVRD_HOME_VAL_CAP
     * 
     */
    @JsonProperty("homeValCap")
    public Double getHomeValCap() {
        return homeValCap;
    }

    /**
     * IM-Student Projected Value Cap Percent
     * <p>
     * Lineage reference object : RNROVRD_HOME_VAL_CAP
     * 
     */
    @JsonProperty("homeValCap")
    public void setHomeValCap(Double homeValCap) {
        this.homeValCap = homeValCap;
    }

    public Rnrovrd withHomeValCap(Double homeValCap) {
        this.homeValCap = homeValCap;
        return this;
    }

    /**
     * Limit International Student's Parents' IPA
     * <p>
     * Lineage reference object : RNROVRD_CAP_INTL_STU_IPA
     * 
     */
    @JsonProperty("capIntlStuIpa")
    public String getCapIntlStuIpa() {
        return capIntlStuIpa;
    }

    /**
     * Limit International Student's Parents' IPA
     * <p>
     * Lineage reference object : RNROVRD_CAP_INTL_STU_IPA
     * 
     */
    @JsonProperty("capIntlStuIpa")
    public void setCapIntlStuIpa(String capIntlStuIpa) {
        this.capIntlStuIpa = capIntlStuIpa;
    }

    public Rnrovrd withCapIntlStuIpa(String capIntlStuIpa) {
        this.capIntlStuIpa = capIntlStuIpa;
        return this;
    }

    /**
     * IM-Student Housing Multiplier
     * <p>
     * Lineage reference object : RNROVRD_HSG_MULT_OVRD
     * 
     */
    @JsonProperty("hsgMultOvrd")
    public Double getHsgMultOvrd() {
        return hsgMultOvrd;
    }

    /**
     * IM-Student Housing Multiplier
     * <p>
     * Lineage reference object : RNROVRD_HSG_MULT_OVRD
     * 
     */
    @JsonProperty("hsgMultOvrd")
    public void setHsgMultOvrd(Double hsgMultOvrd) {
        this.hsgMultOvrd = hsgMultOvrd;
    }

    public Rnrovrd withHsgMultOvrd(Double hsgMultOvrd) {
        this.hsgMultOvrd = hsgMultOvrd;
        return this;
    }

    /**
     * Increase Parent Contribution by Non-Custodial Parent Contribution
     * <p>
     * Lineage reference object : RNROVRD_NON_CUST_PC_OPT
     * 
     */
    @JsonProperty("nonCustPcOpt")
    public String getNonCustPcOpt() {
        return nonCustPcOpt;
    }

    /**
     * Increase Parent Contribution by Non-Custodial Parent Contribution
     * <p>
     * Lineage reference object : RNROVRD_NON_CUST_PC_OPT
     * 
     */
    @JsonProperty("nonCustPcOpt")
    public void setNonCustPcOpt(String nonCustPcOpt) {
        this.nonCustPcOpt = nonCustPcOpt;
    }

    public Rnrovrd withNonCustPcOpt(String nonCustPcOpt) {
        this.nonCustPcOpt = nonCustPcOpt;
        return this;
    }

    /**
     * Number in College(EFM)
     * <p>
     * Lineage reference object : RNROVRD_PAR_NUM_IN_COLL_EFM
     * 
     */
    @JsonProperty("parNumInCollEfm")
    public Double getParNumInCollEfm() {
        return parNumInCollEfm;
    }

    /**
     * Number in College(EFM)
     * <p>
     * Lineage reference object : RNROVRD_PAR_NUM_IN_COLL_EFM
     * 
     */
    @JsonProperty("parNumInCollEfm")
    public void setParNumInCollEfm(Double parNumInCollEfm) {
        this.parNumInCollEfm = parNumInCollEfm;
    }

    public Rnrovrd withParNumInCollEfm(Double parNumInCollEfm) {
        this.parNumInCollEfm = parNumInCollEfm;
        return this;
    }

    /**
     * State and Local Tax Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_ST_LOC_TAX_RATE
     * 
     */
    @JsonProperty("parStLocTaxRate")
    public Double getParStLocTaxRate() {
        return parStLocTaxRate;
    }

    /**
     * State and Local Tax Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_ST_LOC_TAX_RATE
     * 
     */
    @JsonProperty("parStLocTaxRate")
    public void setParStLocTaxRate(Double parStLocTaxRate) {
        this.parStLocTaxRate = parStLocTaxRate;
    }

    public Rnrovrd withParStLocTaxRate(Double parStLocTaxRate) {
        this.parStLocTaxRate = parStLocTaxRate;
        return this;
    }

    /**
     * Use Student State Tax Table
     * <p>
     * Lineage reference object : RNROVRD_USE_P_ST_TAX_ALWNCE
     * 
     */
    @JsonProperty("usePStTaxAlwnce")
    public String getUsePStTaxAlwnce() {
        return usePStTaxAlwnce;
    }

    /**
     * Use Student State Tax Table
     * <p>
     * Lineage reference object : RNROVRD_USE_P_ST_TAX_ALWNCE
     * 
     */
    @JsonProperty("usePStTaxAlwnce")
    public void setUsePStTaxAlwnce(String usePStTaxAlwnce) {
        this.usePStTaxAlwnce = usePStTaxAlwnce;
    }

    public Rnrovrd withUsePStTaxAlwnce(String usePStTaxAlwnce) {
        this.usePStTaxAlwnce = usePStTaxAlwnce;
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

    public Rnrovrd withCalcPcFm(String calcPcFm) {
        this.calcPcFm = calcPcFm;
        return this;
    }

    /**
     * IM-Parent Use Anticipated Year Income (EFM)
     * <p>
     * Lineage reference object : RNROVRD_PAR_USE_ANT_INC_EFM
     * 
     */
    @JsonProperty("parUseAntIncEfm")
    public String getParUseAntIncEfm() {
        return parUseAntIncEfm;
    }

    /**
     * IM-Parent Use Anticipated Year Income (EFM)
     * <p>
     * Lineage reference object : RNROVRD_PAR_USE_ANT_INC_EFM
     * 
     */
    @JsonProperty("parUseAntIncEfm")
    public void setParUseAntIncEfm(String parUseAntIncEfm) {
        this.parUseAntIncEfm = parUseAntIncEfm;
    }

    public Rnrovrd withParUseAntIncEfm(String parUseAntIncEfm) {
        this.parUseAntIncEfm = parUseAntIncEfm;
        return this;
    }

    /**
     * Non-Custodial Parent Contribution Option
     * <p>
     * Lineage reference object : RNROVRD_NON_CUST_OPT
     * 
     */
    @JsonProperty("nonCustOpt")
    public String getNonCustOpt() {
        return nonCustOpt;
    }

    /**
     * Non-Custodial Parent Contribution Option
     * <p>
     * Lineage reference object : RNROVRD_NON_CUST_OPT
     * 
     */
    @JsonProperty("nonCustOpt")
    public void setNonCustOpt(String nonCustOpt) {
        this.nonCustOpt = nonCustOpt;
    }

    public Rnrovrd withNonCustOpt(String nonCustOpt) {
        this.nonCustOpt = nonCustOpt;
        return this;
    }

    /**
     * IM-Student Minimum Contribution From Income
     * <p>
     * Lineage reference object : RNROVRD_MIN_SC_FROM_INC
     * 
     */
    @JsonProperty("minScFromInc")
    public Double getMinScFromInc() {
        return minScFromInc;
    }

    /**
     * IM-Student Minimum Contribution From Income
     * <p>
     * Lineage reference object : RNROVRD_MIN_SC_FROM_INC
     * 
     */
    @JsonProperty("minScFromInc")
    public void setMinScFromInc(Double minScFromInc) {
        this.minScFromInc = minScFromInc;
    }

    public Rnrovrd withMinScFromInc(Double minScFromInc) {
        this.minScFromInc = minScFromInc;
        return this;
    }

    /**
     * Minimum Contribution From Assets
     * <p>
     * Lineage reference object : RNROVRD_MIN_PC_FROM_ASSETS
     * 
     */
    @JsonProperty("minPcFromAssets")
    public Double getMinPcFromAssets() {
        return minPcFromAssets;
    }

    /**
     * Minimum Contribution From Assets
     * <p>
     * Lineage reference object : RNROVRD_MIN_PC_FROM_ASSETS
     * 
     */
    @JsonProperty("minPcFromAssets")
    public void setMinPcFromAssets(Double minPcFromAssets) {
        this.minPcFromAssets = minPcFromAssets;
    }

    public Rnrovrd withMinPcFromAssets(Double minPcFromAssets) {
        this.minPcFromAssets = minPcFromAssets;
        return this;
    }

    /**
     * Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_UNTAX_INC
     * 
     */
    @JsonProperty("parUntaxInc")
    public Double getParUntaxInc() {
        return parUntaxInc;
    }

    /**
     * Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_UNTAX_INC
     * 
     */
    @JsonProperty("parUntaxInc")
    public void setParUntaxInc(Double parUntaxInc) {
        this.parUntaxInc = parUntaxInc;
    }

    public Rnrovrd withParUntaxInc(Double parUntaxInc) {
        this.parUntaxInc = parUntaxInc;
        return this;
    }

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

    public Rnrovrd withChgDependFm(String chgDependFm) {
        this.chgDependFm = chgDependFm;
        return this;
    }

    /**
     * IM-Student State and Local Tax Percent
     * <p>
     * Lineage reference object : RNROVRD_ST_LOC_TAX_RATE
     * 
     */
    @JsonProperty("stLocTaxRate")
    public Double getStLocTaxRate() {
        return stLocTaxRate;
    }

    /**
     * IM-Student State and Local Tax Percent
     * <p>
     * Lineage reference object : RNROVRD_ST_LOC_TAX_RATE
     * 
     */
    @JsonProperty("stLocTaxRate")
    public void setStLocTaxRate(Double stLocTaxRate) {
        this.stLocTaxRate = stLocTaxRate;
    }

    public Rnrovrd withStLocTaxRate(Double stLocTaxRate) {
        this.stLocTaxRate = stLocTaxRate;
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

    public Rnrovrd withAssetAllowIm(Double assetAllowIm) {
        this.assetAllowIm = assetAllowIm;
        return this;
    }

    /**
     * E: Parent 1 SSN match, but no name match
     * <p>
     * Lineage reference object : RNROVRD_F_SSN_NO_NAME_REJ_OVRD
     * 
     */
    @JsonProperty("fSsnNoNameRejOvrd")
    public String getfSsnNoNameRejOvrd() {
        return fSsnNoNameRejOvrd;
    }

    /**
     * E: Parent 1 SSN match, but no name match
     * <p>
     * Lineage reference object : RNROVRD_F_SSN_NO_NAME_REJ_OVRD
     * 
     */
    @JsonProperty("fSsnNoNameRejOvrd")
    public void setfSsnNoNameRejOvrd(String fSsnNoNameRejOvrd) {
        this.fSsnNoNameRejOvrd = fSsnNoNameRejOvrd;
    }

    public Rnrovrd withfSsnNoNameRejOvrd(String fSsnNoNameRejOvrd) {
        this.fSsnNoNameRejOvrd = fSsnNoNameRejOvrd;
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

    public Rnrovrd withParOthAssetIm(Double parOthAssetIm) {
        this.parOthAssetIm = parOthAssetIm;
        return this;
    }

    /**
     * Index Value
     * <p>
     * Lineage reference object : RNROVRD_P_INDEX_PC
     * 
     */
    @JsonProperty("pIndexPc")
    public Double getpIndexPc() {
        return pIndexPc;
    }

    /**
     * Index Value
     * <p>
     * Lineage reference object : RNROVRD_P_INDEX_PC
     * 
     */
    @JsonProperty("pIndexPc")
    public void setpIndexPc(Double pIndexPc) {
        this.pIndexPc = pIndexPc;
    }

    public Rnrovrd withpIndexPc(Double pIndexPc) {
        this.pIndexPc = pIndexPc;
        return this;
    }

    /**
     * IM-Student Asset Assessment Percent
     * <p>
     * Lineage reference object : RNROVRD_ASSET_ASSESS_PCT
     * 
     */
    @JsonProperty("assetAssessPct")
    public Double getAssetAssessPct() {
        return assetAssessPct;
    }

    /**
     * IM-Student Asset Assessment Percent
     * <p>
     * Lineage reference object : RNROVRD_ASSET_ASSESS_PCT
     * 
     */
    @JsonProperty("assetAssessPct")
    public void setAssetAssessPct(Double assetAssessPct) {
        this.assetAssessPct = assetAssessPct;
    }

    public Rnrovrd withAssetAssessPct(Double assetAssessPct) {
        this.assetAssessPct = assetAssessPct;
        return this;
    }

    /**
     * IM-Student Minimum Contribution From Assets
     * <p>
     * Lineage reference object : RNROVRD_MIN_SC_FROM_ASSETS
     * 
     */
    @JsonProperty("minScFromAssets")
    public Double getMinScFromAssets() {
        return minScFromAssets;
    }

    /**
     * IM-Student Minimum Contribution From Assets
     * <p>
     * Lineage reference object : RNROVRD_MIN_SC_FROM_ASSETS
     * 
     */
    @JsonProperty("minScFromAssets")
    public void setMinScFromAssets(Double minScFromAssets) {
        this.minScFromAssets = minScFromAssets;
    }

    public Rnrovrd withMinScFromAssets(Double minScFromAssets) {
        this.minScFromAssets = minScFromAssets;
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

    public Rnrovrd withBudgDurIm(Double budgDurIm) {
        this.budgDurIm = budgDurIm;
        return this;
    }

    /**
     * IM-Student Prior Year Contribution
     * <p>
     * Lineage reference object : RNROVRD_PRIOR_YR_SC
     * 
     */
    @JsonProperty("priorYrSc")
    public Double getPriorYrSc() {
        return priorYrSc;
    }

    /**
     * IM-Student Prior Year Contribution
     * <p>
     * Lineage reference object : RNROVRD_PRIOR_YR_SC
     * 
     */
    @JsonProperty("priorYrSc")
    public void setPriorYrSc(Double priorYrSc) {
        this.priorYrSc = priorYrSc;
    }

    public Rnrovrd withPriorYrSc(Double priorYrSc) {
        this.priorYrSc = priorYrSc;
        return this;
    }

    /**
     * Housing Multiplier
     * <p>
     * Lineage reference object : RNROVRD_PAR_HSG_MULT_OVRD
     * 
     */
    @JsonProperty("parHsgMultOvrd")
    public Double getParHsgMultOvrd() {
        return parHsgMultOvrd;
    }

    /**
     * Housing Multiplier
     * <p>
     * Lineage reference object : RNROVRD_PAR_HSG_MULT_OVRD
     * 
     */
    @JsonProperty("parHsgMultOvrd")
    public void setParHsgMultOvrd(Double parHsgMultOvrd) {
        this.parHsgMultOvrd = parHsgMultOvrd;
    }

    public Rnrovrd withParHsgMultOvrd(Double parHsgMultOvrd) {
        this.parHsgMultOvrd = parHsgMultOvrd;
        return this;
    }

    /**
     * State and Local Tax Amount
     * <p>
     * Lineage reference object : RNROVRD_PAR_ACT_ST_LOC_TAX
     * 
     */
    @JsonProperty("parActStLocTax")
    public Double getParActStLocTax() {
        return parActStLocTax;
    }

    /**
     * State and Local Tax Amount
     * <p>
     * Lineage reference object : RNROVRD_PAR_ACT_ST_LOC_TAX
     * 
     */
    @JsonProperty("parActStLocTax")
    public void setParActStLocTax(Double parActStLocTax) {
        this.parActStLocTax = parActStLocTax;
    }

    public Rnrovrd withParActStLocTax(Double parActStLocTax) {
        this.parActStLocTax = parActStLocTax;
        return this;
    }

    /**
     * Asset Assessment Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_ASSET_ASSESS_PCT
     * 
     */
    @JsonProperty("parAssetAssessPct")
    public Double getParAssetAssessPct() {
        return parAssetAssessPct;
    }

    /**
     * Asset Assessment Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_ASSET_ASSESS_PCT
     * 
     */
    @JsonProperty("parAssetAssessPct")
    public void setParAssetAssessPct(Double parAssetAssessPct) {
        this.parAssetAssessPct = parAssetAssessPct;
    }

    public Rnrovrd withParAssetAssessPct(Double parAssetAssessPct) {
        this.parAssetAssessPct = parAssetAssessPct;
        return this;
    }

    /**
     * Always Allow Student's Work Study as Income Exclusion
     * <p>
     * Lineage reference object : RNROVRD_EXCL_FWS_FR_INC_EXC
     * 
     */
    @JsonProperty("exclFwsFrIncExc")
    public String getExclFwsFrIncExc() {
        return exclFwsFrIncExc;
    }

    /**
     * Always Allow Student's Work Study as Income Exclusion
     * <p>
     * Lineage reference object : RNROVRD_EXCL_FWS_FR_INC_EXC
     * 
     */
    @JsonProperty("exclFwsFrIncExc")
    public void setExclFwsFrIncExc(String exclFwsFrIncExc) {
        this.exclFwsFrIncExc = exclFwsFrIncExc;
    }

    public Rnrovrd withExclFwsFrIncExc(String exclFwsFrIncExc) {
        this.exclFwsFrIncExc = exclFwsFrIncExc;
        return this;
    }

    /**
     * IM-Student Impute Asset Option
     * <p>
     * Lineage reference object : RNROVRD_S_INV_PROJ
     * 
     */
    @JsonProperty("sInvProj")
    public String getsInvProj() {
        return sInvProj;
    }

    /**
     * IM-Student Impute Asset Option
     * <p>
     * Lineage reference object : RNROVRD_S_INV_PROJ
     * 
     */
    @JsonProperty("sInvProj")
    public void setsInvProj(String sInvProj) {
        this.sInvProj = sInvProj;
    }

    public Rnrovrd withsInvProj(String sInvProj) {
        this.sInvProj = sInvProj;
        return this;
    }

    /**
     * Include Dependent Care FSA in Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_FSA_DEPENDENT_CARE
     * 
     */
    @JsonProperty("parFsaDependentCare")
    public String getParFsaDependentCare() {
        return parFsaDependentCare;
    }

    /**
     * Include Dependent Care FSA in Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_PAR_FSA_DEPENDENT_CARE
     * 
     */
    @JsonProperty("parFsaDependentCare")
    public void setParFsaDependentCare(String parFsaDependentCare) {
        this.parFsaDependentCare = parFsaDependentCare;
    }

    public Rnrovrd withParFsaDependentCare(String parFsaDependentCare) {
        this.parFsaDependentCare = parFsaDependentCare;
        return this;
    }

    /**
     * Ignore Other Losses
     * <p>
     * Lineage reference object : RNROVRD_ZERO_LOSS_OTH
     * 
     */
    @JsonProperty("zeroLossOth")
    public String getZeroLossOth() {
        return zeroLossOth;
    }

    /**
     * Ignore Other Losses
     * <p>
     * Lineage reference object : RNROVRD_ZERO_LOSS_OTH
     * 
     */
    @JsonProperty("zeroLossOth")
    public void setZeroLossOth(String zeroLossOth) {
        this.zeroLossOth = zeroLossOth;
    }

    public Rnrovrd withZeroLossOth(String zeroLossOth) {
        this.zeroLossOth = zeroLossOth;
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

    public Rnrovrd withCalcPcIm(String calcPcIm) {
        this.calcPcIm = calcPcIm;
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

    public Rnrovrd withParAssetAllowIm(Double parAssetAllowIm) {
        this.parAssetAllowIm = parAssetAllowIm;
        return this;
    }

    /**
     * Employment Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_EMP_ALLOW
     * 
     */
    @JsonProperty("parEmpAllow")
    public Double getParEmpAllow() {
        return parEmpAllow;
    }

    /**
     * Employment Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_EMP_ALLOW
     * 
     */
    @JsonProperty("parEmpAllow")
    public void setParEmpAllow(Double parEmpAllow) {
        this.parEmpAllow = parEmpAllow;
    }

    public Rnrovrd withParEmpAllow(Double parEmpAllow) {
        this.parEmpAllow = parEmpAllow;
        return this;
    }

    /**
     * IM-Student Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_UNTAX_INC
     * 
     */
    @JsonProperty("untaxInc")
    public Double getUntaxInc() {
        return untaxInc;
    }

    /**
     * IM-Student Untaxed Income
     * <p>
     * Lineage reference object : RNROVRD_UNTAX_INC
     * 
     */
    @JsonProperty("untaxInc")
    public void setUntaxInc(Double untaxInc) {
        this.untaxInc = untaxInc;
    }

    public Rnrovrd withUntaxInc(Double untaxInc) {
        this.untaxInc = untaxInc;
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

    public Rnrovrd withParCalcUsTaxIm(String parCalcUsTaxIm) {
        this.parCalcUsTaxIm = parCalcUsTaxIm;
        return this;
    }

    /**
     * F: Parent 2 SSN match, but no name match
     * <p>
     * Lineage reference object : RNROVRD_M_SSN_NO_NAME_REJ_OVRD
     * 
     */
    @JsonProperty("mSsnNoNameRejOvrd")
    public String getmSsnNoNameRejOvrd() {
        return mSsnNoNameRejOvrd;
    }

    /**
     * F: Parent 2 SSN match, but no name match
     * <p>
     * Lineage reference object : RNROVRD_M_SSN_NO_NAME_REJ_OVRD
     * 
     */
    @JsonProperty("mSsnNoNameRejOvrd")
    public void setmSsnNoNameRejOvrd(String mSsnNoNameRejOvrd) {
        this.mSsnNoNameRejOvrd = mSsnNoNameRejOvrd;
    }

    public Rnrovrd withmSsnNoNameRejOvrd(String mSsnNoNameRejOvrd) {
        this.mSsnNoNameRejOvrd = mSsnNoNameRejOvrd;
        return this;
    }

    /**
     * IM-Student Number in Family (EFM)
     * <p>
     * Lineage reference object : RNROVRD_NUM_IN_HSLD_EFM
     * 
     */
    @JsonProperty("numInHsldEfm")
    public Double getNumInHsldEfm() {
        return numInHsldEfm;
    }

    /**
     * IM-Student Number in Family (EFM)
     * <p>
     * Lineage reference object : RNROVRD_NUM_IN_HSLD_EFM
     * 
     */
    @JsonProperty("numInHsldEfm")
    public void setNumInHsldEfm(Double numInHsldEfm) {
        this.numInHsldEfm = numInHsldEfm;
    }

    public Rnrovrd withNumInHsldEfm(Double numInHsldEfm) {
        this.numInHsldEfm = numInHsldEfm;
        return this;
    }

    /**
     * IM-Student Employment Allowance
     * <p>
     * Lineage reference object : RNROVRD_STU_EMP_ALLOW
     * 
     */
    @JsonProperty("stuEmpAllow")
    public Double getStuEmpAllow() {
        return stuEmpAllow;
    }

    /**
     * IM-Student Employment Allowance
     * <p>
     * Lineage reference object : RNROVRD_STU_EMP_ALLOW
     * 
     */
    @JsonProperty("stuEmpAllow")
    public void setStuEmpAllow(Double stuEmpAllow) {
        this.stuEmpAllow = stuEmpAllow;
    }

    public Rnrovrd withStuEmpAllow(Double stuEmpAllow) {
        this.stuEmpAllow = stuEmpAllow;
        return this;
    }

    /**
     * IM-Student US Income Tax Paid
     * <p>
     * Lineage reference object : RNROVRD_US_TAX_AMT
     * 
     */
    @JsonProperty("usTaxAmt")
    public Double getUsTaxAmt() {
        return usTaxAmt;
    }

    /**
     * IM-Student US Income Tax Paid
     * <p>
     * Lineage reference object : RNROVRD_US_TAX_AMT
     * 
     */
    @JsonProperty("usTaxAmt")
    public void setUsTaxAmt(Double usTaxAmt) {
        this.usTaxAmt = usTaxAmt;
    }

    public Rnrovrd withUsTaxAmt(Double usTaxAmt) {
        this.usTaxAmt = usTaxAmt;
        return this;
    }

    /**
     * Ignore Business and Farm Losses
     * <p>
     * Lineage reference object : RNROVRD_ZERO_LOSS_BUS_FARM
     * 
     */
    @JsonProperty("zeroLossBusFarm")
    public String getZeroLossBusFarm() {
        return zeroLossBusFarm;
    }

    /**
     * Ignore Business and Farm Losses
     * <p>
     * Lineage reference object : RNROVRD_ZERO_LOSS_BUS_FARM
     * 
     */
    @JsonProperty("zeroLossBusFarm")
    public void setZeroLossBusFarm(String zeroLossBusFarm) {
        this.zeroLossBusFarm = zeroLossBusFarm;
    }

    public Rnrovrd withZeroLossBusFarm(String zeroLossBusFarm) {
        this.zeroLossBusFarm = zeroLossBusFarm;
        return this;
    }

    /**
     * IM-Student State and Local Tax Amount
     * <p>
     * Lineage reference object : RNROVRD_ACT_ST_LOC_TAX
     * 
     */
    @JsonProperty("actStLocTax")
    public Double getActStLocTax() {
        return actStLocTax;
    }

    /**
     * IM-Student State and Local Tax Amount
     * <p>
     * Lineage reference object : RNROVRD_ACT_ST_LOC_TAX
     * 
     */
    @JsonProperty("actStLocTax")
    public void setActStLocTax(Double actStLocTax) {
        this.actStLocTax = actStLocTax;
    }

    public Rnrovrd withActStLocTax(Double actStLocTax) {
        this.actStLocTax = actStLocTax;
        return this;
    }

    /**
     * Alternate SC from Income Calculation
     * <p>
     * Lineage reference object : RNROVRD_MIN_SC_FROM_INC_CALC
     * 
     */
    @JsonProperty("minScFromIncCalc")
    public String getMinScFromIncCalc() {
        return minScFromIncCalc;
    }

    /**
     * Alternate SC from Income Calculation
     * <p>
     * Lineage reference object : RNROVRD_MIN_SC_FROM_INC_CALC
     * 
     */
    @JsonProperty("minScFromIncCalc")
    public void setMinScFromIncCalc(String minScFromIncCalc) {
        this.minScFromIncCalc = minScFromIncCalc;
    }

    public Rnrovrd withMinScFromIncCalc(String minScFromIncCalc) {
        this.minScFromIncCalc = minScFromIncCalc;
        return this;
    }

    /**
     * US Income Tax Paid
     * <p>
     * Lineage reference object : RNROVRD_PAR_US_TAX_AMT
     * 
     */
    @JsonProperty("parUsTaxAmt")
    public Double getParUsTaxAmt() {
        return parUsTaxAmt;
    }

    /**
     * US Income Tax Paid
     * <p>
     * Lineage reference object : RNROVRD_PAR_US_TAX_AMT
     * 
     */
    @JsonProperty("parUsTaxAmt")
    public void setParUsTaxAmt(Double parUsTaxAmt) {
        this.parUsTaxAmt = parUsTaxAmt;
    }

    public Rnrovrd withParUsTaxAmt(Double parUsTaxAmt) {
        this.parUsTaxAmt = parUsTaxAmt;
        return this;
    }

    /**
     * Calculate Total Contribution from Assets using Country Coefficient
     * <p>
     * Lineage reference object : RNROVRD_CALC_TCA_W_CC
     * 
     */
    @JsonProperty("calcTcaWCc")
    public String getCalcTcaWCc() {
        return calcTcaWCc;
    }

    /**
     * Calculate Total Contribution from Assets using Country Coefficient
     * <p>
     * Lineage reference object : RNROVRD_CALC_TCA_W_CC
     * 
     */
    @JsonProperty("calcTcaWCc")
    public void setCalcTcaWCc(String calcTcaWCc) {
        this.calcTcaWCc = calcTcaWCc;
    }

    public Rnrovrd withCalcTcaWCc(String calcTcaWCc) {
        this.calcTcaWCc = calcTcaWCc;
        return this;
    }

    /**
     * Minimum Contribution From Income
     * <p>
     * Lineage reference object : RNROVRD_MIN_PC_FROM_INC
     * 
     */
    @JsonProperty("minPcFromInc")
    public Double getMinPcFromInc() {
        return minPcFromInc;
    }

    /**
     * Minimum Contribution From Income
     * <p>
     * Lineage reference object : RNROVRD_MIN_PC_FROM_INC
     * 
     */
    @JsonProperty("minPcFromInc")
    public void setMinPcFromInc(Double minPcFromInc) {
        this.minPcFromInc = minPcFromInc;
    }

    public Rnrovrd withMinPcFromInc(Double minPcFromInc) {
        this.minPcFromInc = minPcFromInc;
        return this;
    }

    /**
     * D: Student's SSN match, but no name match
     * <p>
     * Lineage reference object : RNROVRD_SSN_NO_NAME_REJ_OVRD
     * 
     */
    @JsonProperty("ssnNoNameRejOvrd")
    public String getSsnNoNameRejOvrd() {
        return ssnNoNameRejOvrd;
    }

    /**
     * D: Student's SSN match, but no name match
     * <p>
     * Lineage reference object : RNROVRD_SSN_NO_NAME_REJ_OVRD
     * 
     */
    @JsonProperty("ssnNoNameRejOvrd")
    public void setSsnNoNameRejOvrd(String ssnNoNameRejOvrd) {
        this.ssnNoNameRejOvrd = ssnNoNameRejOvrd;
    }

    public Rnrovrd withSsnNoNameRejOvrd(String ssnNoNameRejOvrd) {
        this.ssnNoNameRejOvrd = ssnNoNameRejOvrd;
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

    public Rnrovrd withBudgDurFm(Double budgDurFm) {
        this.budgDurFm = budgDurFm;
        return this;
    }

    /**
     * IM-Student Index Value
     * <p>
     * Lineage reference object : RNROVRD_S_INDEX_SC
     * 
     */
    @JsonProperty("sIndexSc")
    public Double getsIndexSc() {
        return sIndexSc;
    }

    /**
     * IM-Student Index Value
     * <p>
     * Lineage reference object : RNROVRD_S_INDEX_SC
     * 
     */
    @JsonProperty("sIndexSc")
    public void setsIndexSc(Double sIndexSc) {
        this.sIndexSc = sIndexSc;
    }

    public Rnrovrd withsIndexSc(Double sIndexSc) {
        this.sIndexSc = sIndexSc;
        return this;
    }

    /**
     * Projected Value Cap Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_HOME_VAL_CAP
     * 
     */
    @JsonProperty("parHomeValCap")
    public Double getParHomeValCap() {
        return parHomeValCap;
    }

    /**
     * Projected Value Cap Percent
     * <p>
     * Lineage reference object : RNROVRD_PAR_HOME_VAL_CAP
     * 
     */
    @JsonProperty("parHomeValCap")
    public void setParHomeValCap(Double parHomeValCap) {
        this.parHomeValCap = parHomeValCap;
    }

    public Rnrovrd withParHomeValCap(Double parHomeValCap) {
        this.parHomeValCap = parHomeValCap;
        return this;
    }

    /**
     * Income Protection Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_IPA_AMT
     * 
     */
    @JsonProperty("parIpaAmt")
    public Double getParIpaAmt() {
        return parIpaAmt;
    }

    /**
     * Income Protection Allowance
     * <p>
     * Lineage reference object : RNROVRD_PAR_IPA_AMT
     * 
     */
    @JsonProperty("parIpaAmt")
    public void setParIpaAmt(Double parIpaAmt) {
        this.parIpaAmt = parIpaAmt;
    }

    public Rnrovrd withParIpaAmt(Double parIpaAmt) {
        this.parIpaAmt = parIpaAmt;
        return this;
    }

    /**
     * Income Assessment Percent
     * <p>
     * Lineage reference object : RNROVRD_INC_ASSESS_RATE
     * 
     */
    @JsonProperty("incAssessRate")
    public Double getIncAssessRate() {
        return incAssessRate;
    }

    /**
     * Income Assessment Percent
     * <p>
     * Lineage reference object : RNROVRD_INC_ASSESS_RATE
     * 
     */
    @JsonProperty("incAssessRate")
    public void setIncAssessRate(Double incAssessRate) {
        this.incAssessRate = incAssessRate;
    }

    public Rnrovrd withIncAssessRate(Double incAssessRate) {
        this.incAssessRate = incAssessRate;
        return this;
    }

    /**
     * Non-Custodial Parent Contribution (Calculated)
     * <p>
     * Lineage reference object : RNROVRD_PC_NON_CUST_PAR
     * 
     */
    @JsonProperty("pcNonCustPar")
    public Double getPcNonCustPar() {
        return pcNonCustPar;
    }

    /**
     * Non-Custodial Parent Contribution (Calculated)
     * <p>
     * Lineage reference object : RNROVRD_PC_NON_CUST_PAR
     * 
     */
    @JsonProperty("pcNonCustPar")
    public void setPcNonCustPar(Double pcNonCustPar) {
        this.pcNonCustPar = pcNonCustPar;
    }

    public Rnrovrd withPcNonCustPar(Double pcNonCustPar) {
        this.pcNonCustPar = pcNonCustPar;
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

    public Rnrovrd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rnrovrd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iraKeoghPct");
        sb.append('=');
        sb.append(((this.iraKeoghPct == null)?"<null>":this.iraKeoghPct));
        sb.append(',');
        sb.append("agi");
        sb.append('=');
        sb.append(((this.agi == null)?"<null>":this.agi));
        sb.append(',');
        sb.append("parUseAntYrIncome");
        sb.append('=');
        sb.append(((this.parUseAntYrIncome == null)?"<null>":this.parUseAntYrIncome));
        sb.append(',');
        sb.append("parCostLivIndex");
        sb.append('=');
        sb.append(((this.parCostLivIndex == null)?"<null>":this.parCostLivIndex));
        sb.append(',');
        sb.append("useAntIncEfm");
        sb.append('=');
        sb.append(((this.useAntIncEfm == null)?"<null>":this.useAntIncEfm));
        sb.append(',');
        sb.append("parAgi");
        sb.append('=');
        sb.append(((this.parAgi == null)?"<null>":this.parAgi));
        sb.append(',');
        sb.append("stuNumInColl");
        sb.append('=');
        sb.append(((this.stuNumInColl == null)?"<null>":this.stuNumInColl));
        sb.append(',');
        sb.append("familyAssets");
        sb.append('=');
        sb.append(((this.familyAssets == null)?"<null>":this.familyAssets));
        sb.append(',');
        sb.append("parActFica");
        sb.append('=');
        sb.append(((this.parActFica == null)?"<null>":this.parActFica));
        sb.append(',');
        sb.append("parCapEqtFactor");
        sb.append('=');
        sb.append(((this.parCapEqtFactor == null)?"<null>":this.parCapEqtFactor));
        sb.append(',');
        sb.append("fSsnNoDobRejOvrd");
        sb.append('=');
        sb.append(((this.fSsnNoDobRejOvrd == null)?"<null>":this.fSsnNoDobRejOvrd));
        sb.append(',');
        sb.append("parHsaPreTax");
        sb.append('=');
        sb.append(((this.parHsaPreTax == null)?"<null>":this.parHsaPreTax));
        sb.append(',');
        sb.append("parMedDentExpIm");
        sb.append('=');
        sb.append(((this.parMedDentExpIm == null)?"<null>":this.parMedDentExpIm));
        sb.append(',');
        sb.append("homeValProj");
        sb.append('=');
        sb.append(((this.homeValProj == null)?"<null>":this.homeValProj));
        sb.append(',');
        sb.append("skipAgeExcl");
        sb.append('=');
        sb.append(((this.skipAgeExcl == null)?"<null>":this.skipAgeExcl));
        sb.append(',');
        sb.append("parOthIncAllowIm");
        sb.append('=');
        sb.append(((this.parOthIncAllowIm == null)?"<null>":this.parOthIncAllowIm));
        sb.append(',');
        sb.append("allowImPcLowrFm");
        sb.append('=');
        sb.append(((this.allowImPcLowrFm == null)?"<null>":this.allowImPcLowrFm));
        sb.append(',');
        sb.append("allowImScLowrFm");
        sb.append('=');
        sb.append(((this.allowImScLowrFm == null)?"<null>":this.allowImScLowrFm));
        sb.append(',');
        sb.append("ssnNoDobRejOvrd");
        sb.append('=');
        sb.append(((this.ssnNoDobRejOvrd == null)?"<null>":this.ssnNoDobRejOvrd));
        sb.append(',');
        sb.append("mSsnNoDobRejOvrd");
        sb.append('=');
        sb.append(((this.mSsnNoDobRejOvrd == null)?"<null>":this.mSsnNoDobRejOvrd));
        sb.append(',');
        sb.append("medDentExpIm");
        sb.append('=');
        sb.append(((this.medDentExpIm == null)?"<null>":this.medDentExpIm));
        sb.append(',');
        sb.append("othIncAllowIm");
        sb.append('=');
        sb.append(((this.othIncAllowIm == null)?"<null>":this.othIncAllowIm));
        sb.append(',');
        sb.append("othAssetIm");
        sb.append('=');
        sb.append(((this.othAssetIm == null)?"<null>":this.othAssetIm));
        sb.append(',');
        sb.append("parExclTuitDed");
        sb.append('=');
        sb.append(((this.parExclTuitDed == null)?"<null>":this.parExclTuitDed));
        sb.append(',');
        sb.append("capEqtFactor");
        sb.append('=');
        sb.append(((this.capEqtFactor == null)?"<null>":this.capEqtFactor));
        sb.append(',');
        sb.append("limitPcByBdgt");
        sb.append('=');
        sb.append(((this.limitPcByBdgt == null)?"<null>":this.limitPcByBdgt));
        sb.append(',');
        sb.append("numInCollEfm");
        sb.append('=');
        sb.append(((this.numInCollEfm == null)?"<null>":this.numInCollEfm));
        sb.append(',');
        sb.append("parAgiOpt");
        sb.append('=');
        sb.append(((this.parAgiOpt == null)?"<null>":this.parAgiOpt));
        sb.append(',');
        sb.append("actFica");
        sb.append('=');
        sb.append(((this.actFica == null)?"<null>":this.actFica));
        sb.append(',');
        sb.append("parTuitExpIm");
        sb.append('=');
        sb.append(((this.parTuitExpIm == null)?"<null>":this.parTuitExpIm));
        sb.append(',');
        sb.append("chgDependIm");
        sb.append('=');
        sb.append(((this.chgDependIm == null)?"<null>":this.chgDependIm));
        sb.append(',');
        sb.append("invProj");
        sb.append('=');
        sb.append(((this.invProj == null)?"<null>":this.invProj));
        sb.append(',');
        sb.append("parAddBkHopeOpt");
        sb.append('=');
        sb.append(((this.parAddBkHopeOpt == null)?"<null>":this.parAddBkHopeOpt));
        sb.append(',');
        sb.append("parFsaHealthCare");
        sb.append('=');
        sb.append(((this.parFsaHealthCare == null)?"<null>":this.parFsaHealthCare));
        sb.append(',');
        sb.append("stuBudget");
        sb.append('=');
        sb.append(((this.stuBudget == null)?"<null>":this.stuBudget));
        sb.append(',');
        sb.append("calcUsTaxIm");
        sb.append('=');
        sb.append(((this.calcUsTaxIm == null)?"<null>":this.calcUsTaxIm));
        sb.append(',');
        sb.append("parNumInColl");
        sb.append('=');
        sb.append(((this.parNumInColl == null)?"<null>":this.parNumInColl));
        sb.append(',');
        sb.append("priorYrPc");
        sb.append('=');
        sb.append(((this.priorYrPc == null)?"<null>":this.priorYrPc));
        sb.append(',');
        sb.append("sHomeValProj");
        sb.append('=');
        sb.append(((this.sHomeValProj == null)?"<null>":this.sHomeValProj));
        sb.append(',');
        sb.append("anticipatedUsTax");
        sb.append('=');
        sb.append(((this.anticipatedUsTax == null)?"<null>":this.anticipatedUsTax));
        sb.append(',');
        sb.append("parAnticipatedUsTax");
        sb.append('=');
        sb.append(((this.parAnticipatedUsTax == null)?"<null>":this.parAnticipatedUsTax));
        sb.append(',');
        sb.append("useAntYrIncome");
        sb.append('=');
        sb.append(((this.useAntYrIncome == null)?"<null>":this.useAntYrIncome));
        sb.append(',');
        sb.append("parNumInHsldEfm");
        sb.append('=');
        sb.append(((this.parNumInHsldEfm == null)?"<null>":this.parNumInHsldEfm));
        sb.append(',');
        sb.append("addBkHopeOpt");
        sb.append('=');
        sb.append(((this.addBkHopeOpt == null)?"<null>":this.addBkHopeOpt));
        sb.append(',');
        sb.append("homeValCap");
        sb.append('=');
        sb.append(((this.homeValCap == null)?"<null>":this.homeValCap));
        sb.append(',');
        sb.append("capIntlStuIpa");
        sb.append('=');
        sb.append(((this.capIntlStuIpa == null)?"<null>":this.capIntlStuIpa));
        sb.append(',');
        sb.append("hsgMultOvrd");
        sb.append('=');
        sb.append(((this.hsgMultOvrd == null)?"<null>":this.hsgMultOvrd));
        sb.append(',');
        sb.append("nonCustPcOpt");
        sb.append('=');
        sb.append(((this.nonCustPcOpt == null)?"<null>":this.nonCustPcOpt));
        sb.append(',');
        sb.append("parNumInCollEfm");
        sb.append('=');
        sb.append(((this.parNumInCollEfm == null)?"<null>":this.parNumInCollEfm));
        sb.append(',');
        sb.append("parStLocTaxRate");
        sb.append('=');
        sb.append(((this.parStLocTaxRate == null)?"<null>":this.parStLocTaxRate));
        sb.append(',');
        sb.append("usePStTaxAlwnce");
        sb.append('=');
        sb.append(((this.usePStTaxAlwnce == null)?"<null>":this.usePStTaxAlwnce));
        sb.append(',');
        sb.append("calcPcFm");
        sb.append('=');
        sb.append(((this.calcPcFm == null)?"<null>":this.calcPcFm));
        sb.append(',');
        sb.append("parUseAntIncEfm");
        sb.append('=');
        sb.append(((this.parUseAntIncEfm == null)?"<null>":this.parUseAntIncEfm));
        sb.append(',');
        sb.append("nonCustOpt");
        sb.append('=');
        sb.append(((this.nonCustOpt == null)?"<null>":this.nonCustOpt));
        sb.append(',');
        sb.append("minScFromInc");
        sb.append('=');
        sb.append(((this.minScFromInc == null)?"<null>":this.minScFromInc));
        sb.append(',');
        sb.append("minPcFromAssets");
        sb.append('=');
        sb.append(((this.minPcFromAssets == null)?"<null>":this.minPcFromAssets));
        sb.append(',');
        sb.append("parUntaxInc");
        sb.append('=');
        sb.append(((this.parUntaxInc == null)?"<null>":this.parUntaxInc));
        sb.append(',');
        sb.append("chgDependFm");
        sb.append('=');
        sb.append(((this.chgDependFm == null)?"<null>":this.chgDependFm));
        sb.append(',');
        sb.append("stLocTaxRate");
        sb.append('=');
        sb.append(((this.stLocTaxRate == null)?"<null>":this.stLocTaxRate));
        sb.append(',');
        sb.append("assetAllowIm");
        sb.append('=');
        sb.append(((this.assetAllowIm == null)?"<null>":this.assetAllowIm));
        sb.append(',');
        sb.append("fSsnNoNameRejOvrd");
        sb.append('=');
        sb.append(((this.fSsnNoNameRejOvrd == null)?"<null>":this.fSsnNoNameRejOvrd));
        sb.append(',');
        sb.append("parOthAssetIm");
        sb.append('=');
        sb.append(((this.parOthAssetIm == null)?"<null>":this.parOthAssetIm));
        sb.append(',');
        sb.append("pIndexPc");
        sb.append('=');
        sb.append(((this.pIndexPc == null)?"<null>":this.pIndexPc));
        sb.append(',');
        sb.append("assetAssessPct");
        sb.append('=');
        sb.append(((this.assetAssessPct == null)?"<null>":this.assetAssessPct));
        sb.append(',');
        sb.append("minScFromAssets");
        sb.append('=');
        sb.append(((this.minScFromAssets == null)?"<null>":this.minScFromAssets));
        sb.append(',');
        sb.append("budgDurIm");
        sb.append('=');
        sb.append(((this.budgDurIm == null)?"<null>":this.budgDurIm));
        sb.append(',');
        sb.append("priorYrSc");
        sb.append('=');
        sb.append(((this.priorYrSc == null)?"<null>":this.priorYrSc));
        sb.append(',');
        sb.append("parHsgMultOvrd");
        sb.append('=');
        sb.append(((this.parHsgMultOvrd == null)?"<null>":this.parHsgMultOvrd));
        sb.append(',');
        sb.append("parActStLocTax");
        sb.append('=');
        sb.append(((this.parActStLocTax == null)?"<null>":this.parActStLocTax));
        sb.append(',');
        sb.append("parAssetAssessPct");
        sb.append('=');
        sb.append(((this.parAssetAssessPct == null)?"<null>":this.parAssetAssessPct));
        sb.append(',');
        sb.append("exclFwsFrIncExc");
        sb.append('=');
        sb.append(((this.exclFwsFrIncExc == null)?"<null>":this.exclFwsFrIncExc));
        sb.append(',');
        sb.append("sInvProj");
        sb.append('=');
        sb.append(((this.sInvProj == null)?"<null>":this.sInvProj));
        sb.append(',');
        sb.append("parFsaDependentCare");
        sb.append('=');
        sb.append(((this.parFsaDependentCare == null)?"<null>":this.parFsaDependentCare));
        sb.append(',');
        sb.append("zeroLossOth");
        sb.append('=');
        sb.append(((this.zeroLossOth == null)?"<null>":this.zeroLossOth));
        sb.append(',');
        sb.append("calcPcIm");
        sb.append('=');
        sb.append(((this.calcPcIm == null)?"<null>":this.calcPcIm));
        sb.append(',');
        sb.append("parAssetAllowIm");
        sb.append('=');
        sb.append(((this.parAssetAllowIm == null)?"<null>":this.parAssetAllowIm));
        sb.append(',');
        sb.append("parEmpAllow");
        sb.append('=');
        sb.append(((this.parEmpAllow == null)?"<null>":this.parEmpAllow));
        sb.append(',');
        sb.append("untaxInc");
        sb.append('=');
        sb.append(((this.untaxInc == null)?"<null>":this.untaxInc));
        sb.append(',');
        sb.append("parCalcUsTaxIm");
        sb.append('=');
        sb.append(((this.parCalcUsTaxIm == null)?"<null>":this.parCalcUsTaxIm));
        sb.append(',');
        sb.append("mSsnNoNameRejOvrd");
        sb.append('=');
        sb.append(((this.mSsnNoNameRejOvrd == null)?"<null>":this.mSsnNoNameRejOvrd));
        sb.append(',');
        sb.append("numInHsldEfm");
        sb.append('=');
        sb.append(((this.numInHsldEfm == null)?"<null>":this.numInHsldEfm));
        sb.append(',');
        sb.append("stuEmpAllow");
        sb.append('=');
        sb.append(((this.stuEmpAllow == null)?"<null>":this.stuEmpAllow));
        sb.append(',');
        sb.append("usTaxAmt");
        sb.append('=');
        sb.append(((this.usTaxAmt == null)?"<null>":this.usTaxAmt));
        sb.append(',');
        sb.append("zeroLossBusFarm");
        sb.append('=');
        sb.append(((this.zeroLossBusFarm == null)?"<null>":this.zeroLossBusFarm));
        sb.append(',');
        sb.append("actStLocTax");
        sb.append('=');
        sb.append(((this.actStLocTax == null)?"<null>":this.actStLocTax));
        sb.append(',');
        sb.append("minScFromIncCalc");
        sb.append('=');
        sb.append(((this.minScFromIncCalc == null)?"<null>":this.minScFromIncCalc));
        sb.append(',');
        sb.append("parUsTaxAmt");
        sb.append('=');
        sb.append(((this.parUsTaxAmt == null)?"<null>":this.parUsTaxAmt));
        sb.append(',');
        sb.append("calcTcaWCc");
        sb.append('=');
        sb.append(((this.calcTcaWCc == null)?"<null>":this.calcTcaWCc));
        sb.append(',');
        sb.append("minPcFromInc");
        sb.append('=');
        sb.append(((this.minPcFromInc == null)?"<null>":this.minPcFromInc));
        sb.append(',');
        sb.append("ssnNoNameRejOvrd");
        sb.append('=');
        sb.append(((this.ssnNoNameRejOvrd == null)?"<null>":this.ssnNoNameRejOvrd));
        sb.append(',');
        sb.append("budgDurFm");
        sb.append('=');
        sb.append(((this.budgDurFm == null)?"<null>":this.budgDurFm));
        sb.append(',');
        sb.append("sIndexSc");
        sb.append('=');
        sb.append(((this.sIndexSc == null)?"<null>":this.sIndexSc));
        sb.append(',');
        sb.append("parHomeValCap");
        sb.append('=');
        sb.append(((this.parHomeValCap == null)?"<null>":this.parHomeValCap));
        sb.append(',');
        sb.append("parIpaAmt");
        sb.append('=');
        sb.append(((this.parIpaAmt == null)?"<null>":this.parIpaAmt));
        sb.append(',');
        sb.append("incAssessRate");
        sb.append('=');
        sb.append(((this.incAssessRate == null)?"<null>":this.incAssessRate));
        sb.append(',');
        sb.append("pcNonCustPar");
        sb.append('=');
        sb.append(((this.pcNonCustPar == null)?"<null>":this.pcNonCustPar));
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
        result = ((result* 31)+((this.iraKeoghPct == null)? 0 :this.iraKeoghPct.hashCode()));
        result = ((result* 31)+((this.agi == null)? 0 :this.agi.hashCode()));
        result = ((result* 31)+((this.parUseAntYrIncome == null)? 0 :this.parUseAntYrIncome.hashCode()));
        result = ((result* 31)+((this.parCostLivIndex == null)? 0 :this.parCostLivIndex.hashCode()));
        result = ((result* 31)+((this.useAntIncEfm == null)? 0 :this.useAntIncEfm.hashCode()));
        result = ((result* 31)+((this.parAgi == null)? 0 :this.parAgi.hashCode()));
        result = ((result* 31)+((this.familyAssets == null)? 0 :this.familyAssets.hashCode()));
        result = ((result* 31)+((this.parActFica == null)? 0 :this.parActFica.hashCode()));
        result = ((result* 31)+((this.fSsnNoDobRejOvrd == null)? 0 :this.fSsnNoDobRejOvrd.hashCode()));
        result = ((result* 31)+((this.parHsaPreTax == null)? 0 :this.parHsaPreTax.hashCode()));
        result = ((result* 31)+((this.parOthIncAllowIm == null)? 0 :this.parOthIncAllowIm.hashCode()));
        result = ((result* 31)+((this.ssnNoDobRejOvrd == null)? 0 :this.ssnNoDobRejOvrd.hashCode()));
        result = ((result* 31)+((this.mSsnNoDobRejOvrd == null)? 0 :this.mSsnNoDobRejOvrd.hashCode()));
        result = ((result* 31)+((this.othAssetIm == null)? 0 :this.othAssetIm.hashCode()));
        result = ((result* 31)+((this.parExclTuitDed == null)? 0 :this.parExclTuitDed.hashCode()));
        result = ((result* 31)+((this.limitPcByBdgt == null)? 0 :this.limitPcByBdgt.hashCode()));
        result = ((result* 31)+((this.parAgiOpt == null)? 0 :this.parAgiOpt.hashCode()));
        result = ((result* 31)+((this.chgDependIm == null)? 0 :this.chgDependIm.hashCode()));
        result = ((result* 31)+((this.invProj == null)? 0 :this.invProj.hashCode()));
        result = ((result* 31)+((this.parAddBkHopeOpt == null)? 0 :this.parAddBkHopeOpt.hashCode()));
        result = ((result* 31)+((this.parFsaHealthCare == null)? 0 :this.parFsaHealthCare.hashCode()));
        result = ((result* 31)+((this.sHomeValProj == null)? 0 :this.sHomeValProj.hashCode()));
        result = ((result* 31)+((this.parAnticipatedUsTax == null)? 0 :this.parAnticipatedUsTax.hashCode()));
        result = ((result* 31)+((this.parNumInHsldEfm == null)? 0 :this.parNumInHsldEfm.hashCode()));
        result = ((result* 31)+((this.addBkHopeOpt == null)? 0 :this.addBkHopeOpt.hashCode()));
        result = ((result* 31)+((this.homeValCap == null)? 0 :this.homeValCap.hashCode()));
        result = ((result* 31)+((this.nonCustPcOpt == null)? 0 :this.nonCustPcOpt.hashCode()));
        result = ((result* 31)+((this.calcPcFm == null)? 0 :this.calcPcFm.hashCode()));
        result = ((result* 31)+((this.parUseAntIncEfm == null)? 0 :this.parUseAntIncEfm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.minScFromInc == null)? 0 :this.minScFromInc.hashCode()));
        result = ((result* 31)+((this.parUntaxInc == null)? 0 :this.parUntaxInc.hashCode()));
        result = ((result* 31)+((this.chgDependFm == null)? 0 :this.chgDependFm.hashCode()));
        result = ((result* 31)+((this.fSsnNoNameRejOvrd == null)? 0 :this.fSsnNoNameRejOvrd.hashCode()));
        result = ((result* 31)+((this.pIndexPc == null)? 0 :this.pIndexPc.hashCode()));
        result = ((result* 31)+((this.budgDurIm == null)? 0 :this.budgDurIm.hashCode()));
        result = ((result* 31)+((this.priorYrSc == null)? 0 :this.priorYrSc.hashCode()));
        result = ((result* 31)+((this.parHsgMultOvrd == null)? 0 :this.parHsgMultOvrd.hashCode()));
        result = ((result* 31)+((this.parAssetAssessPct == null)? 0 :this.parAssetAssessPct.hashCode()));
        result = ((result* 31)+((this.exclFwsFrIncExc == null)? 0 :this.exclFwsFrIncExc.hashCode()));
        result = ((result* 31)+((this.zeroLossOth == null)? 0 :this.zeroLossOth.hashCode()));
        result = ((result* 31)+((this.calcPcIm == null)? 0 :this.calcPcIm.hashCode()));
        result = ((result* 31)+((this.parAssetAllowIm == null)? 0 :this.parAssetAllowIm.hashCode()));
        result = ((result* 31)+((this.untaxInc == null)? 0 :this.untaxInc.hashCode()));
        result = ((result* 31)+((this.parCalcUsTaxIm == null)? 0 :this.parCalcUsTaxIm.hashCode()));
        result = ((result* 31)+((this.stuEmpAllow == null)? 0 :this.stuEmpAllow.hashCode()));
        result = ((result* 31)+((this.usTaxAmt == null)? 0 :this.usTaxAmt.hashCode()));
        result = ((result* 31)+((this.parUsTaxAmt == null)? 0 :this.parUsTaxAmt.hashCode()));
        result = ((result* 31)+((this.minPcFromInc == null)? 0 :this.minPcFromInc.hashCode()));
        result = ((result* 31)+((this.ssnNoNameRejOvrd == null)? 0 :this.ssnNoNameRejOvrd.hashCode()));
        result = ((result* 31)+((this.incAssessRate == null)? 0 :this.incAssessRate.hashCode()));
        result = ((result* 31)+((this.pcNonCustPar == null)? 0 :this.pcNonCustPar.hashCode()));
        result = ((result* 31)+((this.stuNumInColl == null)? 0 :this.stuNumInColl.hashCode()));
        result = ((result* 31)+((this.parCapEqtFactor == null)? 0 :this.parCapEqtFactor.hashCode()));
        result = ((result* 31)+((this.parMedDentExpIm == null)? 0 :this.parMedDentExpIm.hashCode()));
        result = ((result* 31)+((this.homeValProj == null)? 0 :this.homeValProj.hashCode()));
        result = ((result* 31)+((this.skipAgeExcl == null)? 0 :this.skipAgeExcl.hashCode()));
        result = ((result* 31)+((this.allowImPcLowrFm == null)? 0 :this.allowImPcLowrFm.hashCode()));
        result = ((result* 31)+((this.allowImScLowrFm == null)? 0 :this.allowImScLowrFm.hashCode()));
        result = ((result* 31)+((this.medDentExpIm == null)? 0 :this.medDentExpIm.hashCode()));
        result = ((result* 31)+((this.othIncAllowIm == null)? 0 :this.othIncAllowIm.hashCode()));
        result = ((result* 31)+((this.capEqtFactor == null)? 0 :this.capEqtFactor.hashCode()));
        result = ((result* 31)+((this.numInCollEfm == null)? 0 :this.numInCollEfm.hashCode()));
        result = ((result* 31)+((this.actFica == null)? 0 :this.actFica.hashCode()));
        result = ((result* 31)+((this.parTuitExpIm == null)? 0 :this.parTuitExpIm.hashCode()));
        result = ((result* 31)+((this.stuBudget == null)? 0 :this.stuBudget.hashCode()));
        result = ((result* 31)+((this.calcUsTaxIm == null)? 0 :this.calcUsTaxIm.hashCode()));
        result = ((result* 31)+((this.parNumInColl == null)? 0 :this.parNumInColl.hashCode()));
        result = ((result* 31)+((this.priorYrPc == null)? 0 :this.priorYrPc.hashCode()));
        result = ((result* 31)+((this.anticipatedUsTax == null)? 0 :this.anticipatedUsTax.hashCode()));
        result = ((result* 31)+((this.useAntYrIncome == null)? 0 :this.useAntYrIncome.hashCode()));
        result = ((result* 31)+((this.capIntlStuIpa == null)? 0 :this.capIntlStuIpa.hashCode()));
        result = ((result* 31)+((this.hsgMultOvrd == null)? 0 :this.hsgMultOvrd.hashCode()));
        result = ((result* 31)+((this.parNumInCollEfm == null)? 0 :this.parNumInCollEfm.hashCode()));
        result = ((result* 31)+((this.parStLocTaxRate == null)? 0 :this.parStLocTaxRate.hashCode()));
        result = ((result* 31)+((this.usePStTaxAlwnce == null)? 0 :this.usePStTaxAlwnce.hashCode()));
        result = ((result* 31)+((this.nonCustOpt == null)? 0 :this.nonCustOpt.hashCode()));
        result = ((result* 31)+((this.minPcFromAssets == null)? 0 :this.minPcFromAssets.hashCode()));
        result = ((result* 31)+((this.stLocTaxRate == null)? 0 :this.stLocTaxRate.hashCode()));
        result = ((result* 31)+((this.assetAllowIm == null)? 0 :this.assetAllowIm.hashCode()));
        result = ((result* 31)+((this.parOthAssetIm == null)? 0 :this.parOthAssetIm.hashCode()));
        result = ((result* 31)+((this.assetAssessPct == null)? 0 :this.assetAssessPct.hashCode()));
        result = ((result* 31)+((this.minScFromAssets == null)? 0 :this.minScFromAssets.hashCode()));
        result = ((result* 31)+((this.parActStLocTax == null)? 0 :this.parActStLocTax.hashCode()));
        result = ((result* 31)+((this.sInvProj == null)? 0 :this.sInvProj.hashCode()));
        result = ((result* 31)+((this.parFsaDependentCare == null)? 0 :this.parFsaDependentCare.hashCode()));
        result = ((result* 31)+((this.parEmpAllow == null)? 0 :this.parEmpAllow.hashCode()));
        result = ((result* 31)+((this.mSsnNoNameRejOvrd == null)? 0 :this.mSsnNoNameRejOvrd.hashCode()));
        result = ((result* 31)+((this.numInHsldEfm == null)? 0 :this.numInHsldEfm.hashCode()));
        result = ((result* 31)+((this.zeroLossBusFarm == null)? 0 :this.zeroLossBusFarm.hashCode()));
        result = ((result* 31)+((this.actStLocTax == null)? 0 :this.actStLocTax.hashCode()));
        result = ((result* 31)+((this.minScFromIncCalc == null)? 0 :this.minScFromIncCalc.hashCode()));
        result = ((result* 31)+((this.calcTcaWCc == null)? 0 :this.calcTcaWCc.hashCode()));
        result = ((result* 31)+((this.budgDurFm == null)? 0 :this.budgDurFm.hashCode()));
        result = ((result* 31)+((this.sIndexSc == null)? 0 :this.sIndexSc.hashCode()));
        result = ((result* 31)+((this.parHomeValCap == null)? 0 :this.parHomeValCap.hashCode()));
        result = ((result* 31)+((this.parIpaAmt == null)? 0 :this.parIpaAmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rnrovrd) == false) {
            return false;
        }
        Rnrovrd rhs = ((Rnrovrd) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.iraKeoghPct == rhs.iraKeoghPct)||((this.iraKeoghPct!= null)&&this.iraKeoghPct.equals(rhs.iraKeoghPct)))&&((this.agi == rhs.agi)||((this.agi!= null)&&this.agi.equals(rhs.agi))))&&((this.parUseAntYrIncome == rhs.parUseAntYrIncome)||((this.parUseAntYrIncome!= null)&&this.parUseAntYrIncome.equals(rhs.parUseAntYrIncome))))&&((this.parCostLivIndex == rhs.parCostLivIndex)||((this.parCostLivIndex!= null)&&this.parCostLivIndex.equals(rhs.parCostLivIndex))))&&((this.useAntIncEfm == rhs.useAntIncEfm)||((this.useAntIncEfm!= null)&&this.useAntIncEfm.equals(rhs.useAntIncEfm))))&&((this.parAgi == rhs.parAgi)||((this.parAgi!= null)&&this.parAgi.equals(rhs.parAgi))))&&((this.familyAssets == rhs.familyAssets)||((this.familyAssets!= null)&&this.familyAssets.equals(rhs.familyAssets))))&&((this.parActFica == rhs.parActFica)||((this.parActFica!= null)&&this.parActFica.equals(rhs.parActFica))))&&((this.fSsnNoDobRejOvrd == rhs.fSsnNoDobRejOvrd)||((this.fSsnNoDobRejOvrd!= null)&&this.fSsnNoDobRejOvrd.equals(rhs.fSsnNoDobRejOvrd))))&&((this.parHsaPreTax == rhs.parHsaPreTax)||((this.parHsaPreTax!= null)&&this.parHsaPreTax.equals(rhs.parHsaPreTax))))&&((this.parOthIncAllowIm == rhs.parOthIncAllowIm)||((this.parOthIncAllowIm!= null)&&this.parOthIncAllowIm.equals(rhs.parOthIncAllowIm))))&&((this.ssnNoDobRejOvrd == rhs.ssnNoDobRejOvrd)||((this.ssnNoDobRejOvrd!= null)&&this.ssnNoDobRejOvrd.equals(rhs.ssnNoDobRejOvrd))))&&((this.mSsnNoDobRejOvrd == rhs.mSsnNoDobRejOvrd)||((this.mSsnNoDobRejOvrd!= null)&&this.mSsnNoDobRejOvrd.equals(rhs.mSsnNoDobRejOvrd))))&&((this.othAssetIm == rhs.othAssetIm)||((this.othAssetIm!= null)&&this.othAssetIm.equals(rhs.othAssetIm))))&&((this.parExclTuitDed == rhs.parExclTuitDed)||((this.parExclTuitDed!= null)&&this.parExclTuitDed.equals(rhs.parExclTuitDed))))&&((this.limitPcByBdgt == rhs.limitPcByBdgt)||((this.limitPcByBdgt!= null)&&this.limitPcByBdgt.equals(rhs.limitPcByBdgt))))&&((this.parAgiOpt == rhs.parAgiOpt)||((this.parAgiOpt!= null)&&this.parAgiOpt.equals(rhs.parAgiOpt))))&&((this.chgDependIm == rhs.chgDependIm)||((this.chgDependIm!= null)&&this.chgDependIm.equals(rhs.chgDependIm))))&&((this.invProj == rhs.invProj)||((this.invProj!= null)&&this.invProj.equals(rhs.invProj))))&&((this.parAddBkHopeOpt == rhs.parAddBkHopeOpt)||((this.parAddBkHopeOpt!= null)&&this.parAddBkHopeOpt.equals(rhs.parAddBkHopeOpt))))&&((this.parFsaHealthCare == rhs.parFsaHealthCare)||((this.parFsaHealthCare!= null)&&this.parFsaHealthCare.equals(rhs.parFsaHealthCare))))&&((this.sHomeValProj == rhs.sHomeValProj)||((this.sHomeValProj!= null)&&this.sHomeValProj.equals(rhs.sHomeValProj))))&&((this.parAnticipatedUsTax == rhs.parAnticipatedUsTax)||((this.parAnticipatedUsTax!= null)&&this.parAnticipatedUsTax.equals(rhs.parAnticipatedUsTax))))&&((this.parNumInHsldEfm == rhs.parNumInHsldEfm)||((this.parNumInHsldEfm!= null)&&this.parNumInHsldEfm.equals(rhs.parNumInHsldEfm))))&&((this.addBkHopeOpt == rhs.addBkHopeOpt)||((this.addBkHopeOpt!= null)&&this.addBkHopeOpt.equals(rhs.addBkHopeOpt))))&&((this.homeValCap == rhs.homeValCap)||((this.homeValCap!= null)&&this.homeValCap.equals(rhs.homeValCap))))&&((this.nonCustPcOpt == rhs.nonCustPcOpt)||((this.nonCustPcOpt!= null)&&this.nonCustPcOpt.equals(rhs.nonCustPcOpt))))&&((this.calcPcFm == rhs.calcPcFm)||((this.calcPcFm!= null)&&this.calcPcFm.equals(rhs.calcPcFm))))&&((this.parUseAntIncEfm == rhs.parUseAntIncEfm)||((this.parUseAntIncEfm!= null)&&this.parUseAntIncEfm.equals(rhs.parUseAntIncEfm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.minScFromInc == rhs.minScFromInc)||((this.minScFromInc!= null)&&this.minScFromInc.equals(rhs.minScFromInc))))&&((this.parUntaxInc == rhs.parUntaxInc)||((this.parUntaxInc!= null)&&this.parUntaxInc.equals(rhs.parUntaxInc))))&&((this.chgDependFm == rhs.chgDependFm)||((this.chgDependFm!= null)&&this.chgDependFm.equals(rhs.chgDependFm))))&&((this.fSsnNoNameRejOvrd == rhs.fSsnNoNameRejOvrd)||((this.fSsnNoNameRejOvrd!= null)&&this.fSsnNoNameRejOvrd.equals(rhs.fSsnNoNameRejOvrd))))&&((this.pIndexPc == rhs.pIndexPc)||((this.pIndexPc!= null)&&this.pIndexPc.equals(rhs.pIndexPc))))&&((this.budgDurIm == rhs.budgDurIm)||((this.budgDurIm!= null)&&this.budgDurIm.equals(rhs.budgDurIm))))&&((this.priorYrSc == rhs.priorYrSc)||((this.priorYrSc!= null)&&this.priorYrSc.equals(rhs.priorYrSc))))&&((this.parHsgMultOvrd == rhs.parHsgMultOvrd)||((this.parHsgMultOvrd!= null)&&this.parHsgMultOvrd.equals(rhs.parHsgMultOvrd))))&&((this.parAssetAssessPct == rhs.parAssetAssessPct)||((this.parAssetAssessPct!= null)&&this.parAssetAssessPct.equals(rhs.parAssetAssessPct))))&&((this.exclFwsFrIncExc == rhs.exclFwsFrIncExc)||((this.exclFwsFrIncExc!= null)&&this.exclFwsFrIncExc.equals(rhs.exclFwsFrIncExc))))&&((this.zeroLossOth == rhs.zeroLossOth)||((this.zeroLossOth!= null)&&this.zeroLossOth.equals(rhs.zeroLossOth))))&&((this.calcPcIm == rhs.calcPcIm)||((this.calcPcIm!= null)&&this.calcPcIm.equals(rhs.calcPcIm))))&&((this.parAssetAllowIm == rhs.parAssetAllowIm)||((this.parAssetAllowIm!= null)&&this.parAssetAllowIm.equals(rhs.parAssetAllowIm))))&&((this.untaxInc == rhs.untaxInc)||((this.untaxInc!= null)&&this.untaxInc.equals(rhs.untaxInc))))&&((this.parCalcUsTaxIm == rhs.parCalcUsTaxIm)||((this.parCalcUsTaxIm!= null)&&this.parCalcUsTaxIm.equals(rhs.parCalcUsTaxIm))))&&((this.stuEmpAllow == rhs.stuEmpAllow)||((this.stuEmpAllow!= null)&&this.stuEmpAllow.equals(rhs.stuEmpAllow))))&&((this.usTaxAmt == rhs.usTaxAmt)||((this.usTaxAmt!= null)&&this.usTaxAmt.equals(rhs.usTaxAmt))))&&((this.parUsTaxAmt == rhs.parUsTaxAmt)||((this.parUsTaxAmt!= null)&&this.parUsTaxAmt.equals(rhs.parUsTaxAmt))))&&((this.minPcFromInc == rhs.minPcFromInc)||((this.minPcFromInc!= null)&&this.minPcFromInc.equals(rhs.minPcFromInc))))&&((this.ssnNoNameRejOvrd == rhs.ssnNoNameRejOvrd)||((this.ssnNoNameRejOvrd!= null)&&this.ssnNoNameRejOvrd.equals(rhs.ssnNoNameRejOvrd))))&&((this.incAssessRate == rhs.incAssessRate)||((this.incAssessRate!= null)&&this.incAssessRate.equals(rhs.incAssessRate))))&&((this.pcNonCustPar == rhs.pcNonCustPar)||((this.pcNonCustPar!= null)&&this.pcNonCustPar.equals(rhs.pcNonCustPar))))&&((this.stuNumInColl == rhs.stuNumInColl)||((this.stuNumInColl!= null)&&this.stuNumInColl.equals(rhs.stuNumInColl))))&&((this.parCapEqtFactor == rhs.parCapEqtFactor)||((this.parCapEqtFactor!= null)&&this.parCapEqtFactor.equals(rhs.parCapEqtFactor))))&&((this.parMedDentExpIm == rhs.parMedDentExpIm)||((this.parMedDentExpIm!= null)&&this.parMedDentExpIm.equals(rhs.parMedDentExpIm))))&&((this.homeValProj == rhs.homeValProj)||((this.homeValProj!= null)&&this.homeValProj.equals(rhs.homeValProj))))&&((this.skipAgeExcl == rhs.skipAgeExcl)||((this.skipAgeExcl!= null)&&this.skipAgeExcl.equals(rhs.skipAgeExcl))))&&((this.allowImPcLowrFm == rhs.allowImPcLowrFm)||((this.allowImPcLowrFm!= null)&&this.allowImPcLowrFm.equals(rhs.allowImPcLowrFm))))&&((this.allowImScLowrFm == rhs.allowImScLowrFm)||((this.allowImScLowrFm!= null)&&this.allowImScLowrFm.equals(rhs.allowImScLowrFm))))&&((this.medDentExpIm == rhs.medDentExpIm)||((this.medDentExpIm!= null)&&this.medDentExpIm.equals(rhs.medDentExpIm))))&&((this.othIncAllowIm == rhs.othIncAllowIm)||((this.othIncAllowIm!= null)&&this.othIncAllowIm.equals(rhs.othIncAllowIm))))&&((this.capEqtFactor == rhs.capEqtFactor)||((this.capEqtFactor!= null)&&this.capEqtFactor.equals(rhs.capEqtFactor))))&&((this.numInCollEfm == rhs.numInCollEfm)||((this.numInCollEfm!= null)&&this.numInCollEfm.equals(rhs.numInCollEfm))))&&((this.actFica == rhs.actFica)||((this.actFica!= null)&&this.actFica.equals(rhs.actFica))))&&((this.parTuitExpIm == rhs.parTuitExpIm)||((this.parTuitExpIm!= null)&&this.parTuitExpIm.equals(rhs.parTuitExpIm))))&&((this.stuBudget == rhs.stuBudget)||((this.stuBudget!= null)&&this.stuBudget.equals(rhs.stuBudget))))&&((this.calcUsTaxIm == rhs.calcUsTaxIm)||((this.calcUsTaxIm!= null)&&this.calcUsTaxIm.equals(rhs.calcUsTaxIm))))&&((this.parNumInColl == rhs.parNumInColl)||((this.parNumInColl!= null)&&this.parNumInColl.equals(rhs.parNumInColl))))&&((this.priorYrPc == rhs.priorYrPc)||((this.priorYrPc!= null)&&this.priorYrPc.equals(rhs.priorYrPc))))&&((this.anticipatedUsTax == rhs.anticipatedUsTax)||((this.anticipatedUsTax!= null)&&this.anticipatedUsTax.equals(rhs.anticipatedUsTax))))&&((this.useAntYrIncome == rhs.useAntYrIncome)||((this.useAntYrIncome!= null)&&this.useAntYrIncome.equals(rhs.useAntYrIncome))))&&((this.capIntlStuIpa == rhs.capIntlStuIpa)||((this.capIntlStuIpa!= null)&&this.capIntlStuIpa.equals(rhs.capIntlStuIpa))))&&((this.hsgMultOvrd == rhs.hsgMultOvrd)||((this.hsgMultOvrd!= null)&&this.hsgMultOvrd.equals(rhs.hsgMultOvrd))))&&((this.parNumInCollEfm == rhs.parNumInCollEfm)||((this.parNumInCollEfm!= null)&&this.parNumInCollEfm.equals(rhs.parNumInCollEfm))))&&((this.parStLocTaxRate == rhs.parStLocTaxRate)||((this.parStLocTaxRate!= null)&&this.parStLocTaxRate.equals(rhs.parStLocTaxRate))))&&((this.usePStTaxAlwnce == rhs.usePStTaxAlwnce)||((this.usePStTaxAlwnce!= null)&&this.usePStTaxAlwnce.equals(rhs.usePStTaxAlwnce))))&&((this.nonCustOpt == rhs.nonCustOpt)||((this.nonCustOpt!= null)&&this.nonCustOpt.equals(rhs.nonCustOpt))))&&((this.minPcFromAssets == rhs.minPcFromAssets)||((this.minPcFromAssets!= null)&&this.minPcFromAssets.equals(rhs.minPcFromAssets))))&&((this.stLocTaxRate == rhs.stLocTaxRate)||((this.stLocTaxRate!= null)&&this.stLocTaxRate.equals(rhs.stLocTaxRate))))&&((this.assetAllowIm == rhs.assetAllowIm)||((this.assetAllowIm!= null)&&this.assetAllowIm.equals(rhs.assetAllowIm))))&&((this.parOthAssetIm == rhs.parOthAssetIm)||((this.parOthAssetIm!= null)&&this.parOthAssetIm.equals(rhs.parOthAssetIm))))&&((this.assetAssessPct == rhs.assetAssessPct)||((this.assetAssessPct!= null)&&this.assetAssessPct.equals(rhs.assetAssessPct))))&&((this.minScFromAssets == rhs.minScFromAssets)||((this.minScFromAssets!= null)&&this.minScFromAssets.equals(rhs.minScFromAssets))))&&((this.parActStLocTax == rhs.parActStLocTax)||((this.parActStLocTax!= null)&&this.parActStLocTax.equals(rhs.parActStLocTax))))&&((this.sInvProj == rhs.sInvProj)||((this.sInvProj!= null)&&this.sInvProj.equals(rhs.sInvProj))))&&((this.parFsaDependentCare == rhs.parFsaDependentCare)||((this.parFsaDependentCare!= null)&&this.parFsaDependentCare.equals(rhs.parFsaDependentCare))))&&((this.parEmpAllow == rhs.parEmpAllow)||((this.parEmpAllow!= null)&&this.parEmpAllow.equals(rhs.parEmpAllow))))&&((this.mSsnNoNameRejOvrd == rhs.mSsnNoNameRejOvrd)||((this.mSsnNoNameRejOvrd!= null)&&this.mSsnNoNameRejOvrd.equals(rhs.mSsnNoNameRejOvrd))))&&((this.numInHsldEfm == rhs.numInHsldEfm)||((this.numInHsldEfm!= null)&&this.numInHsldEfm.equals(rhs.numInHsldEfm))))&&((this.zeroLossBusFarm == rhs.zeroLossBusFarm)||((this.zeroLossBusFarm!= null)&&this.zeroLossBusFarm.equals(rhs.zeroLossBusFarm))))&&((this.actStLocTax == rhs.actStLocTax)||((this.actStLocTax!= null)&&this.actStLocTax.equals(rhs.actStLocTax))))&&((this.minScFromIncCalc == rhs.minScFromIncCalc)||((this.minScFromIncCalc!= null)&&this.minScFromIncCalc.equals(rhs.minScFromIncCalc))))&&((this.calcTcaWCc == rhs.calcTcaWCc)||((this.calcTcaWCc!= null)&&this.calcTcaWCc.equals(rhs.calcTcaWCc))))&&((this.budgDurFm == rhs.budgDurFm)||((this.budgDurFm!= null)&&this.budgDurFm.equals(rhs.budgDurFm))))&&((this.sIndexSc == rhs.sIndexSc)||((this.sIndexSc!= null)&&this.sIndexSc.equals(rhs.sIndexSc))))&&((this.parHomeValCap == rhs.parHomeValCap)||((this.parHomeValCap!= null)&&this.parHomeValCap.equals(rhs.parHomeValCap))))&&((this.parIpaAmt == rhs.parIpaAmt)||((this.parIpaAmt!= null)&&this.parIpaAmt.equals(rhs.parIpaAmt))));
    }

}
