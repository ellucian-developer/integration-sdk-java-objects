
package com.ellucian.generated.bpapi.ban._2020_2021_miscellaneous_results_inquiry.v1_0_0;

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
    "aUsInc",
    "reProcReaCd",
    "tranReceiptDate",
    "aPAddlFinancial",
    "aFathSsn",
    "alt2Fc11MthCalc",
    "aSAddlFinancial",
    "agencyInd",
    "alt1Fc11MthCalc",
    "aParUsInc",
    "aParNoInColl",
    "edeEtiInd",
    "signatureRejEfc",
    "nameSsnChgInd",
    "alt2Fc02MthCalc",
    "alt2Fc04MthCalc",
    "alt2Fc06MthCalc",
    "aSDependants",
    "alt2Fc08MthCalc",
    "rcrapp3RejectOvrd20",
    "aMarried",
    "commCode01",
    "commCode02",
    "edeInstInd",
    "rcrapp3FaaTitleIvCode",
    "rcrapp3RejectOvrd21",
    "commCode05",
    "commCode06",
    "commCode03",
    "computeBatchNo",
    "aPAssetThreshExcd",
    "commCode04",
    "rnrovrdMSsnNoDobRejOvrd",
    "aTaxFiledInd",
    "aFamMemb",
    "aNoInColl",
    "rtvicmtDesc15",
    "rtvicmtDesc16",
    "rtvicmtDesc13",
    "rtvicmtDesc14",
    "rtvicmtDesc19",
    "rtvicmtDesc17",
    "rtvicmtDesc18",
    "rtvicmtDesc11",
    "rtvicmtDesc12",
    "rtvicmtDesc10",
    "alt2Fc01MthCalc",
    "commCode12",
    "commCode13",
    "commCode10",
    "secEfcType",
    "rcrapp4AddressChgFlag",
    "commCode11",
    "autoZeroEfcFlag",
    "commCode16",
    "rcrapp4SarCChangeFlag",
    "commCode17",
    "commCode14",
    "commCode15",
    "aCitzInd",
    "aHaveChildren",
    "alt1Fc05MthCalc",
    "alt1Fc09MthCalc",
    "rnrovrdFSsnNoDobRejOvrd",
    "rcrapp2CAddlFinancial",
    "alt1Fc12MthCalc",
    "alt2Fc05MthCalc",
    "aMrtlStatusInd",
    "commCode09",
    "aMothSsn",
    "commCode07",
    "alt2Fc12MthCalc",
    "commCode08",
    "rejStatusChangeInd",
    "rtvicmtDesc20",
    "alt2Fc09MthCalc",
    "rcrapp3AssumptOvrd2",
    "rcrapp3AssumptOvrd1",
    "pellElgbl",
    "aMothIncFrWrk",
    "aSpsIncFrWrk",
    "alt1Fc01MthCalc",
    "commCode20",
    "recType",
    "alt1Fc02MthCalc",
    "alt1Fc03MthCalc",
    "etiDestCode",
    "aParMrtlStatusInd",
    "commCode18",
    "commCode19",
    "rcrapp3AssumptOvrd4",
    "rcrapp1FedCollChoice1",
    "rcrapp3AssumptOvrd3",
    "rcrapp3AssumptOvrd6",
    "rnrovrdSsnNoNameRejOvrd",
    "rcrapp3AssumptOvrd5",
    "displayFaaDepOverride",
    "rcrapp3RejectOvrd12",
    "alt1Fc06MthCalc",
    "verifChangeInd",
    "rcrapp2CParAddlFinancial",
    "rcrapp4VerifNum",
    "alt1Fc08MthCalc",
    "alt1Fc04MthCalc",
    "aParTaxFiledInd",
    "rcrapp4PushIsirFlag",
    "fedHousCde1",
    "rtvicmtDesc04",
    "rtvicmtDesc05",
    "rtvicmtDesc02",
    "rtvicmtDesc03",
    "rtvicmtDesc08",
    "rtvicmtDesc09",
    "rtvicmtDesc06",
    "rtvicmtDesc07",
    "rtvicmtDesc01",
    "rnrovrdFSsnNoNameRejOvrd",
    "aFathIncFrWrk",
    "rnrovrdMSsnNoNameRejOvrd",
    "rcrapp3RejectOvrdK",
    "rcrapp3RejectOvrdN",
    "aParFamMemb",
    "aIncFrWrk",
    "mdeSiteCd",
    "rcrapp2CParUntaxInc",
    "rcrapp3RejectOvrdW",
    "corrAppl",
    "aBornBeforeInd",
    "aSAssetThreshExcd",
    "aSFit",
    "alt2Fc10MthCalc",
    "specCircumFlg",
    "rcrapp3RejectOvrdB",
    "rcrapp3RejectOvrdA",
    "rcrapp3RejectOvrdC",
    "rcrapp2CUntaxInc",
    "rcrapp4SourceCorrection",
    "rcrapp3RejectOvrdG",
    "rcrapp3RejectOvrdJ",
    "alt1Fc07MthCalc",
    "rcrapp4EfcChangeInd",
    "alt1Fc10MthCalc",
    "displayAdjEfcCalcReq",
    "rcrapp4DupSsnInd",
    "rcrapp3RejectOvrd3",
    "rcrapp2PellAnlyType",
    "alt2Fc03MthCalc",
    "aVaStatus",
    "aPFit",
    "rnrovrdSsnNoDobRejOvrd",
    "alt2Fc07MthCalc"
})
@Generated("jsonschema2pojo")
public class _20202021MiscellaneousResultsInquiry100GetResponse {

    /**
     * Lineage reference object : RCRESAR_A_US_INC
     * 
     */
    @JsonProperty("aUsInc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_US_INC")
    private Double aUsInc;
    /**
     * Reprocessed Reason Code
     * <p>
     * Lineage reference object : RCRESAR_RE_PROC_REA_CD
     * 
     */
    @JsonProperty("reProcReaCd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_RE_PROC_REA_CD")
    private String reProcReaCd;
    /**
     * Transaction Receipt Date
     * <p>
     * Lineage reference object : RCRESAR_TRAN_RECEIPT_DATE
     * 
     */
    @JsonProperty("tranReceiptDate")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_TRAN_RECEIPT_DATE")
    private Date tranReceiptDate;
    /**
     * Additional Financial Information
     * <p>
     * Lineage reference object : RCRESAR_A_P_ADDL_FINANCIAL
     * 
     */
    @JsonProperty("aPAddlFinancial")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_P_ADDL_FINANCIAL")
    private Double aPAddlFinancial;
    /**
     * Parent 1 SSN
     * <p>
     * Lineage reference object : RCRESAR_A_FATH_SSN
     * 
     */
    @JsonProperty("aFathSsn")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_FATH_SSN")
    private String aFathSsn;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_11_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc11MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_11_MTH_CALC")
    private Double alt2Fc11MthCalc;
    /**
     * Lineage reference object : RCRESAR_A_S_ADDL_FINANCIAL
     * 
     */
    @JsonProperty("aSAddlFinancial")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_S_ADDL_FINANCIAL")
    private Double aSAddlFinancial;
    /**
     * Application Source Site Code
     * <p>
     * Lineage reference object : RCRESAR_AGENCY_IND
     * 
     */
    @JsonProperty("agencyInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_AGENCY_IND")
    private String agencyInd;
    /**
     * Month 11
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_11_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc11MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_11_MTH_CALC")
    private Double alt1Fc11MthCalc;
    /**
     *  2007 Adjusted Gross Income
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_US_INC
     * 
     */
    @JsonProperty("aParUsInc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_PAR_US_INC")
    private Double aParUsInc;
    /**
     * Number of Family in College
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_NO_IN_COLL
     * 
     */
    @JsonProperty("aParNoInColl")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_PAR_NO_IN_COLL")
    private Double aParNoInColl;
    /**
     * Electronic Transaction Indicator
     * <p>
     * Lineage reference object : RCRESAR_EDE_ETI_IND
     * 
     */
    @JsonProperty("edeEtiInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_EDE_ETI_IND")
    private String edeEtiInd;
    /**
     * Signature Reject EFC
     * <p>
     * Lineage reference object : RCRESAR_SIGNATURE_REJ_EFC
     * 
     */
    @JsonProperty("signatureRejEfc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_SIGNATURE_REJ_EFC")
    private Double signatureRejEfc;
    /**
     * Last Name or SSN Change
     * <p>
     * Lineage reference object : RCRESAR_NAME_SSN_CHG_IND
     * 
     */
    @JsonProperty("nameSsnChgInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_NAME_SSN_CHG_IND")
    private String nameSsnChgInd;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_02_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc02MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_02_MTH_CALC")
    private Double alt2Fc02MthCalc;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_04_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc04MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_04_MTH_CALC")
    private Double alt2Fc04MthCalc;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_06_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc06MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_06_MTH_CALC")
    private Double alt2Fc06MthCalc;
    /**
     * Legal Dependents
     * <p>
     * Lineage reference object : RCRESAR_A_S_DEPENDANTS
     * 
     */
    @JsonProperty("aSDependants")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_S_DEPENDANTS")
    private String aSDependants;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_08_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc08MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_08_MTH_CALC")
    private Double alt2Fc08MthCalc;
    /**
     *  20         Non-tax filer reporting an income above IRS filing requirements
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd20")
    private String rcrapp3RejectOvrd20;
    /**
     * Is Student Married or Remarried
     * <p>
     * Lineage reference object : RCRESAR_A_MARRIED
     * 
     */
    @JsonProperty("aMarried")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_MARRIED")
    private String aMarried;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_01
     * 
     */
    @JsonProperty("commCode01")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_01")
    private Double commCode01;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_02
     * 
     */
    @JsonProperty("commCode02")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_02")
    private Double commCode02;
    /**
     * Electronic Institution
     * <p>
     * Lineage reference object : RCRESAR_EDE_INST_IND
     * 
     */
    @JsonProperty("edeInstInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_EDE_INST_IND")
    private String edeInstInd;
    /**
     * FAA Federal School Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FaaTitleIvCode")
    private String rcrapp3FaaTitleIvCode;
    /**
     *  21         Student's corrected marital status date >= application receipt date and <= transaction receipt date
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd21")
    private String rcrapp3RejectOvrd21;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_05
     * 
     */
    @JsonProperty("commCode05")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_05")
    private Double commCode05;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_06
     * 
     */
    @JsonProperty("commCode06")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_06")
    private Double commCode06;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_03
     * 
     */
    @JsonProperty("commCode03")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_03")
    private Double commCode03;
    /**
     * Compute Batch Number
     * <p>
     * Lineage reference object : RCRESAR_COMPUTE_BATCH_NO
     * 
     */
    @JsonProperty("computeBatchNo")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMPUTE_BATCH_NO")
    private Double computeBatchNo;
    /**
     * Threshold Exceeded
     * <p>
     * Lineage reference object : RCRESAR_A_P_ASSET_THRESH_EXCD
     * 
     */
    @JsonProperty("aPAssetThreshExcd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_P_ASSET_THRESH_EXCD")
    private String aPAssetThreshExcd;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_04
     * 
     */
    @JsonProperty("commCode04")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_04")
    private Double commCode04;
    /**
     * T          Parent 2 SSN match, but no Date of Birth match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdMSsnNoDobRejOvrd")
    private String rnrovrdMSsnNoDobRejOvrd;
    /**
     * Lineage reference object : RCRESAR_A_TAX_FILED_IND
     * 
     */
    @JsonProperty("aTaxFiledInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_TAX_FILED_IND")
    private String aTaxFiledInd;
    /**
     * Lineage reference object : RCRESAR_A_FAM_MEMB
     * 
     */
    @JsonProperty("aFamMemb")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_FAM_MEMB")
    private Double aFamMemb;
    /**
     * Lineage reference object : RCRESAR_A_NO_IN_COLL
     * 
     */
    @JsonProperty("aNoInColl")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_NO_IN_COLL")
    private Double aNoInColl;
    @JsonProperty("rtvicmtDesc15")
    private String rtvicmtDesc15;
    @JsonProperty("rtvicmtDesc16")
    private String rtvicmtDesc16;
    @JsonProperty("rtvicmtDesc13")
    private String rtvicmtDesc13;
    @JsonProperty("rtvicmtDesc14")
    private String rtvicmtDesc14;
    @JsonProperty("rtvicmtDesc19")
    private String rtvicmtDesc19;
    @JsonProperty("rtvicmtDesc17")
    private String rtvicmtDesc17;
    @JsonProperty("rtvicmtDesc18")
    private String rtvicmtDesc18;
    @JsonProperty("rtvicmtDesc11")
    private String rtvicmtDesc11;
    @JsonProperty("rtvicmtDesc12")
    private String rtvicmtDesc12;
    @JsonProperty("rtvicmtDesc10")
    private String rtvicmtDesc10;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_01_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc01MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_01_MTH_CALC")
    private Double alt2Fc01MthCalc;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_12
     * 
     */
    @JsonProperty("commCode12")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_12")
    private Double commCode12;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_13
     * 
     */
    @JsonProperty("commCode13")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_13")
    private Double commCode13;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_10
     * 
     */
    @JsonProperty("commCode10")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_10")
    private Double commCode10;
    /**
     * Secondary EFC Type
     * <p>
     * Lineage reference object : RCRESAR_SEC_EFC_TYPE
     * 
     */
    @JsonProperty("secEfcType")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_SEC_EFC_TYPE")
    private String secEfcType;
    /**
     * Address Only Change
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4AddressChgFlag")
    private String rcrapp4AddressChgFlag;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_11
     * 
     */
    @JsonProperty("commCode11")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_11")
    private Double commCode11;
    /**
     * Auto Zero Flag
     * <p>
     * Lineage reference object : RCRESAR_AUTO_ZERO_EFC_FLAG
     * 
     */
    @JsonProperty("autoZeroEfcFlag")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_AUTO_ZERO_EFC_FLAG")
    private String autoZeroEfcFlag;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_16
     * 
     */
    @JsonProperty("commCode16")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_16")
    private Double commCode16;
    /**
     * SAR C Change
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SarCChangeFlag")
    private String rcrapp4SarCChangeFlag;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_17
     * 
     */
    @JsonProperty("commCode17")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_17")
    private Double commCode17;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_14
     * 
     */
    @JsonProperty("commCode14")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_14")
    private Double commCode14;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_15
     * 
     */
    @JsonProperty("commCode15")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_15")
    private Double commCode15;
    /**
     * Citizenship
     * <p>
     * Lineage reference object : RCRESAR_A_CITZ_IND
     * 
     */
    @JsonProperty("aCitzInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_CITZ_IND")
    private String aCitzInd;
    /**
     * Have Children You Support
     * <p>
     * Lineage reference object : RCRESAR_A_HAVE_CHILDREN
     * 
     */
    @JsonProperty("aHaveChildren")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_HAVE_CHILDREN")
    private String aHaveChildren;
    /**
     * Month 5
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_05_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc05MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_05_MTH_CALC")
    private Double alt1Fc05MthCalc;
    /**
     * Month 9
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_09_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc09MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_09_MTH_CALC")
    private Double alt1Fc09MthCalc;
    /**
     * S          Parent 1 SSN match, but no Date of Birth match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdFSsnNoDobRejOvrd")
    private String rnrovrdFSsnNoDobRejOvrd;
    @JsonProperty("rcrapp2CAddlFinancial")
    private Double rcrapp2CAddlFinancial;
    /**
     * Month 12
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_12_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc12MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_12_MTH_CALC")
    private Double alt1Fc12MthCalc;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_05_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc05MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_05_MTH_CALC")
    private Double alt2Fc05MthCalc;
    /**
     * Lineage reference object : RCRESAR_A_MRTL_STATUS_IND
     * 
     */
    @JsonProperty("aMrtlStatusInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_MRTL_STATUS_IND")
    private String aMrtlStatusInd;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_09
     * 
     */
    @JsonProperty("commCode09")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_09")
    private Double commCode09;
    /**
     * Parent 2 SSN
     * <p>
     * Lineage reference object : RCRESAR_A_MOTH_SSN
     * 
     */
    @JsonProperty("aMothSsn")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_MOTH_SSN")
    private String aMothSsn;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_07
     * 
     */
    @JsonProperty("commCode07")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_07")
    private Double commCode07;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_12_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc12MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_12_MTH_CALC")
    private Double alt2Fc12MthCalc;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_08
     * 
     */
    @JsonProperty("commCode08")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_08")
    private Double commCode08;
    /**
     * Rejected Status Change
     * <p>
     * Lineage reference object : RCRESAR_REJ_STATUS_CHANGE_IND
     * 
     */
    @JsonProperty("rejStatusChangeInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_REJ_STATUS_CHANGE_IND")
    private String rejStatusChangeInd;
    @JsonProperty("rtvicmtDesc20")
    private String rtvicmtDesc20;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_09_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc09MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_09_MTH_CALC")
    private Double alt2Fc09MthCalc;
    /**
     *  2          Parents' AGI is assumed to be the sum of earned income
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd2")
    private String rcrapp3AssumptOvrd2;
    /**
     *  1          Parents in college assumed 1 (number in college is greater than 6)
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd1")
    private String rcrapp3AssumptOvrd1;
    /**
     * Pell Eligibility Flag
     * <p>
     * Lineage reference object : RCRESAR_PELL_ELGBL
     * 
     */
    @JsonProperty("pellElgbl")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_PELL_ELGBL")
    private String pellElgbl;
    /**
     *  2013 Wages (Parent 2 and Spouse)
     * <p>
     * Lineage reference object : RCRESAR_A_MOTH_INC_FR_WRK
     * 
     */
    @JsonProperty("aMothIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_MOTH_INC_FR_WRK")
    private Double aMothIncFrWrk;
    /**
     * Lineage reference object : RCRESAR_A_SPS_INC_FR_WRK
     * 
     */
    @JsonProperty("aSpsIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_SPS_INC_FR_WRK")
    private Double aSpsIncFrWrk;
    /**
     * Month 1
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_01_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc01MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_01_MTH_CALC")
    private Double alt1Fc01MthCalc;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_20
     * 
     */
    @JsonProperty("commCode20")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_20")
    private Double commCode20;
    /**
     * Processed Record Type
     * <p>
     * Lineage reference object : RCRESAR_REC_TYPE
     * 
     */
    @JsonProperty("recType")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_REC_TYPE")
    private String recType;
    /**
     * Month 2
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_02_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc02MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_02_MTH_CALC")
    private Double alt1Fc02MthCalc;
    /**
     * Month 3
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_03_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc03MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_03_MTH_CALC")
    private Double alt1Fc03MthCalc;
    /**
     * ETI Destination Code
     * <p>
     * Lineage reference object : RCRESAR_ETI_DEST_CODE
     * 
     */
    @JsonProperty("etiDestCode")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ETI_DEST_CODE")
    private String etiDestCode;
    /**
     * Marital Status
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_MRTL_STATUS_IND
     * 
     */
    @JsonProperty("aParMrtlStatusInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_PAR_MRTL_STATUS_IND")
    private String aParMrtlStatusInd;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_18
     * 
     */
    @JsonProperty("commCode18")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_18")
    private Double commCode18;
    /**
     * Lineage reference object : RCRESAR_COMM_CODE_19
     * 
     */
    @JsonProperty("commCode19")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_COMM_CODE_19")
    private Double commCode19;
    /**
     *  4          Student's AGI, assumed to be the sum of earned income
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd4")
    private String rcrapp3AssumptOvrd4;
    /**
     * Federal School Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1FedCollChoice1")
    private String rcrapp1FedCollChoice1;
    /**
     *  3          Student's number in college, assumed to be one
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd3")
    private String rcrapp3AssumptOvrd3;
    /**
     *  6          Student's income from Additional Financial Information, assumed to be zero
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd6")
    private String rcrapp3AssumptOvrd6;
    /**
     * D         Student's SSN match, but no name match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdSsnNoNameRejOvrd")
    private String rnrovrdSsnNoNameRejOvrd;
    /**
     *  5          Parents' income from Additional Financial Information, assumed to be zero
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd5")
    private String rcrapp3AssumptOvrd5;
    /**
     * Dependency Override
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFaaDepOverride")
    private String displayFaaDepOverride;
    /**
     *  12         Parents' taxes paid > 0 and >= AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd12")
    private String rcrapp3RejectOvrd12;
    /**
     * Month 6
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_06_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc06MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_06_MTH_CALC")
    private Double alt1Fc06MthCalc;
    /**
     * Verification Selection Change
     * <p>
     * Lineage reference object : RCRESAR_VERIF_CHANGE_IND
     * 
     */
    @JsonProperty("verifChangeInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_VERIF_CHANGE_IND")
    private String verifChangeInd;
    /**
     * CPS Additional Financial Information Total
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp2CParAddlFinancial")
    private Double rcrapp2CParAddlFinancial;
    /**
     * Primary DHS Verification Number
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VerifNum")
    private String rcrapp4VerifNum;
    /**
     * Month 8
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_08_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc08MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_08_MTH_CALC")
    private Double alt1Fc08MthCalc;
    /**
     * Month 4
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_04_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc04MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_04_MTH_CALC")
    private Double alt1Fc04MthCalc;
    /**
     * Tax Status
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_TAX_FILED_IND
     * 
     */
    @JsonProperty("aParTaxFiledInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_PAR_TAX_FILED_IND")
    private String aParTaxFiledInd;
    /**
     * CPS Pushed ISIR
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4PushIsirFlag")
    private String rcrapp4PushIsirFlag;
    /**
     * Housing Plans
     * <p>
     * Lineage reference object : RCRESAR_FED_HOUS_CDE_1
     * 
     */
    @JsonProperty("fedHousCde1")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_FED_HOUS_CDE_1")
    private String fedHousCde1;
    @JsonProperty("rtvicmtDesc04")
    private String rtvicmtDesc04;
    @JsonProperty("rtvicmtDesc05")
    private String rtvicmtDesc05;
    @JsonProperty("rtvicmtDesc02")
    private String rtvicmtDesc02;
    @JsonProperty("rtvicmtDesc03")
    private String rtvicmtDesc03;
    @JsonProperty("rtvicmtDesc08")
    private String rtvicmtDesc08;
    @JsonProperty("rtvicmtDesc09")
    private String rtvicmtDesc09;
    @JsonProperty("rtvicmtDesc06")
    private String rtvicmtDesc06;
    @JsonProperty("rtvicmtDesc07")
    private String rtvicmtDesc07;
    @JsonProperty("rtvicmtDesc01")
    private String rtvicmtDesc01;
    /**
     * E          Parent 1 SSN match, but no name match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdFSsnNoNameRejOvrd")
    private String rnrovrdFSsnNoNameRejOvrd;
    /**
     *  2013 Wages (Parent 1 and Student)
     * <p>
     * Lineage reference object : RCRESAR_A_FATH_INC_FR_WRK
     * 
     */
    @JsonProperty("aFathIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_FATH_INC_FR_WRK")
    private Double aFathIncFrWrk;
    /**
     * F          Parent 2 SSN match, but no name match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdMSsnNoNameRejOvrd")
    private String rnrovrdMSsnNoNameRejOvrd;
    /**
     * K          Parent 2 SSN all zeroes and reported as tax filer
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdK")
    private String rcrapp3RejectOvrdK;
    /**
     * N          Student's first or last name is blank
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdN")
    private String rcrapp3RejectOvrdN;
    /**
     * Number of Family Members
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_FAM_MEMB
     * 
     */
    @JsonProperty("aParFamMemb")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_PAR_FAM_MEMB")
    private Double aParFamMemb;
    /**
     * Lineage reference object : RCRESAR_A_INC_FR_WRK
     * 
     */
    @JsonProperty("aIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_INC_FR_WRK")
    private Double aIncFrWrk;
    /**
     * Transaction Data Source
     * <p>
     * Lineage reference object : RCRESAR_MDE_SITE_CD
     * 
     */
    @JsonProperty("mdeSiteCd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_MDE_SITE_CD")
    private String mdeSiteCd;
    /**
     * CPS Untaxed Income Total
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp2CParUntaxInc")
    private Double rcrapp2CParUntaxInc;
    /**
     * W         Questionable number of family members
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdW")
    private String rcrapp3RejectOvrdW;
    /**
     * Correction Applied Transaction Number
     * <p>
     * Lineage reference object : RCRESAR_CORR_APPL
     * 
     */
    @JsonProperty("corrAppl")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_CORR_APPL")
    private String corrAppl;
    /**
     * Born Before
     * <p>
     * Lineage reference object : RCRESAR_A_BORN_BEFORE_IND
     * 
     */
    @JsonProperty("aBornBeforeInd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_BORN_BEFORE_IND")
    private String aBornBeforeInd;
    /**
     * Lineage reference object : RCRESAR_A_S_ASSET_THRESH_EXCD
     * 
     */
    @JsonProperty("aSAssetThreshExcd")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_S_ASSET_THRESH_EXCD")
    private String aSAssetThreshExcd;
    /**
     * Lineage reference object : RCRESAR_A_S_FIT
     * 
     */
    @JsonProperty("aSFit")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_S_FIT")
    private Double aSFit;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_10_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc10MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_10_MTH_CALC")
    private Double alt2Fc10MthCalc;
    /**
     * Special Circumstance Performed
     * <p>
     * Lineage reference object : RCRESAR_SPEC_CIRCUM_FLG
     * 
     */
    @JsonProperty("specCircumFlg")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_SPEC_CIRCUM_FLG")
    private String specCircumFlg;
    /**
     * B          Independent status in question because of student's age
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdB")
    private String rcrapp3RejectOvrdB;
    /**
     * A          Year of Birth between 1900 - 1945
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdA")
    private String rcrapp3RejectOvrdA;
    /**
     * C          Parent or independent student taxes paid > 0 and >= fixed percent of AGI, but < AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdC")
    private String rcrapp3RejectOvrdC;
    @JsonProperty("rcrapp2CUntaxInc")
    private Double rcrapp2CUntaxInc;
    /**
     * Source of Correction
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SourceCorrection")
    private String rcrapp4SourceCorrection;
    /**
     * G          Dependent student taxes paid > 0 and >= fixed percent of AGI, but < AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdG")
    private String rcrapp3RejectOvrdG;
    /**
     * J          Parent 1 SSN all zeroes and reported as tax filer
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdJ")
    private String rcrapp3RejectOvrdJ;
    /**
     * Month 7
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_07_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc07MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_07_MTH_CALC")
    private Double alt1Fc07MthCalc;
    /**
     * EFC Change Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4EfcChangeInd")
    private String rcrapp4EfcChangeInd;
    /**
     * Month 10
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_10_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc10MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_1_FC_10_MTH_CALC")
    private Double alt1Fc10MthCalc;
    /**
     * Professional Judgement
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAdjEfcCalcReq")
    private String displayAdjEfcCalcReq;
    /**
     * Duplicate SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DupSsnInd")
    private String rcrapp4DupSsnInd;
    /**
     *  3          Student's taxes paid > 0 and >= AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd3")
    private String rcrapp3RejectOvrd3;
    /**
     * Simplified Needs Test
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp2PellAnlyType")
    private String rcrapp2PellAnlyType;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_03_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc03MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_03_MTH_CALC")
    private Double alt2Fc03MthCalc;
    /**
     * VA Status
     * <p>
     * Lineage reference object : RCRESAR_A_VA_STATUS
     * 
     */
    @JsonProperty("aVaStatus")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_VA_STATUS")
    private String aVaStatus;
    /**
     *  2007 Taxes Paid
     * <p>
     * Lineage reference object : RCRESAR_A_P_FIT
     * 
     */
    @JsonProperty("aPFit")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_A_P_FIT")
    private Double aPFit;
    /**
     * R          Student's SSN match, but no Date of Birth match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdSsnNoDobRejOvrd")
    private String rnrovrdSsnNoDobRejOvrd;
    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_07_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc07MthCalc")
    @JsonPropertyDescription("Lineage reference object : RCRESAR_ALT_2_FC_07_MTH_CALC")
    private Double alt2Fc07MthCalc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RCRESAR_A_US_INC
     * 
     */
    @JsonProperty("aUsInc")
    public Double getaUsInc() {
        return aUsInc;
    }

    /**
     * Lineage reference object : RCRESAR_A_US_INC
     * 
     */
    @JsonProperty("aUsInc")
    public void setaUsInc(Double aUsInc) {
        this.aUsInc = aUsInc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaUsInc(Double aUsInc) {
        this.aUsInc = aUsInc;
        return this;
    }

    /**
     * Reprocessed Reason Code
     * <p>
     * Lineage reference object : RCRESAR_RE_PROC_REA_CD
     * 
     */
    @JsonProperty("reProcReaCd")
    public String getReProcReaCd() {
        return reProcReaCd;
    }

    /**
     * Reprocessed Reason Code
     * <p>
     * Lineage reference object : RCRESAR_RE_PROC_REA_CD
     * 
     */
    @JsonProperty("reProcReaCd")
    public void setReProcReaCd(String reProcReaCd) {
        this.reProcReaCd = reProcReaCd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withReProcReaCd(String reProcReaCd) {
        this.reProcReaCd = reProcReaCd;
        return this;
    }

    /**
     * Transaction Receipt Date
     * <p>
     * Lineage reference object : RCRESAR_TRAN_RECEIPT_DATE
     * 
     */
    @JsonProperty("tranReceiptDate")
    public Date getTranReceiptDate() {
        return tranReceiptDate;
    }

    /**
     * Transaction Receipt Date
     * <p>
     * Lineage reference object : RCRESAR_TRAN_RECEIPT_DATE
     * 
     */
    @JsonProperty("tranReceiptDate")
    public void setTranReceiptDate(Date tranReceiptDate) {
        this.tranReceiptDate = tranReceiptDate;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withTranReceiptDate(Date tranReceiptDate) {
        this.tranReceiptDate = tranReceiptDate;
        return this;
    }

    /**
     * Additional Financial Information
     * <p>
     * Lineage reference object : RCRESAR_A_P_ADDL_FINANCIAL
     * 
     */
    @JsonProperty("aPAddlFinancial")
    public Double getaPAddlFinancial() {
        return aPAddlFinancial;
    }

    /**
     * Additional Financial Information
     * <p>
     * Lineage reference object : RCRESAR_A_P_ADDL_FINANCIAL
     * 
     */
    @JsonProperty("aPAddlFinancial")
    public void setaPAddlFinancial(Double aPAddlFinancial) {
        this.aPAddlFinancial = aPAddlFinancial;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaPAddlFinancial(Double aPAddlFinancial) {
        this.aPAddlFinancial = aPAddlFinancial;
        return this;
    }

    /**
     * Parent 1 SSN
     * <p>
     * Lineage reference object : RCRESAR_A_FATH_SSN
     * 
     */
    @JsonProperty("aFathSsn")
    public String getaFathSsn() {
        return aFathSsn;
    }

    /**
     * Parent 1 SSN
     * <p>
     * Lineage reference object : RCRESAR_A_FATH_SSN
     * 
     */
    @JsonProperty("aFathSsn")
    public void setaFathSsn(String aFathSsn) {
        this.aFathSsn = aFathSsn;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaFathSsn(String aFathSsn) {
        this.aFathSsn = aFathSsn;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_11_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc11MthCalc")
    public Double getAlt2Fc11MthCalc() {
        return alt2Fc11MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_11_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc11MthCalc")
    public void setAlt2Fc11MthCalc(Double alt2Fc11MthCalc) {
        this.alt2Fc11MthCalc = alt2Fc11MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc11MthCalc(Double alt2Fc11MthCalc) {
        this.alt2Fc11MthCalc = alt2Fc11MthCalc;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_A_S_ADDL_FINANCIAL
     * 
     */
    @JsonProperty("aSAddlFinancial")
    public Double getaSAddlFinancial() {
        return aSAddlFinancial;
    }

    /**
     * Lineage reference object : RCRESAR_A_S_ADDL_FINANCIAL
     * 
     */
    @JsonProperty("aSAddlFinancial")
    public void setaSAddlFinancial(Double aSAddlFinancial) {
        this.aSAddlFinancial = aSAddlFinancial;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaSAddlFinancial(Double aSAddlFinancial) {
        this.aSAddlFinancial = aSAddlFinancial;
        return this;
    }

    /**
     * Application Source Site Code
     * <p>
     * Lineage reference object : RCRESAR_AGENCY_IND
     * 
     */
    @JsonProperty("agencyInd")
    public String getAgencyInd() {
        return agencyInd;
    }

    /**
     * Application Source Site Code
     * <p>
     * Lineage reference object : RCRESAR_AGENCY_IND
     * 
     */
    @JsonProperty("agencyInd")
    public void setAgencyInd(String agencyInd) {
        this.agencyInd = agencyInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAgencyInd(String agencyInd) {
        this.agencyInd = agencyInd;
        return this;
    }

    /**
     * Month 11
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_11_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc11MthCalc")
    public Double getAlt1Fc11MthCalc() {
        return alt1Fc11MthCalc;
    }

    /**
     * Month 11
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_11_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc11MthCalc")
    public void setAlt1Fc11MthCalc(Double alt1Fc11MthCalc) {
        this.alt1Fc11MthCalc = alt1Fc11MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc11MthCalc(Double alt1Fc11MthCalc) {
        this.alt1Fc11MthCalc = alt1Fc11MthCalc;
        return this;
    }

    /**
     *  2007 Adjusted Gross Income
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_US_INC
     * 
     */
    @JsonProperty("aParUsInc")
    public Double getaParUsInc() {
        return aParUsInc;
    }

    /**
     *  2007 Adjusted Gross Income
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_US_INC
     * 
     */
    @JsonProperty("aParUsInc")
    public void setaParUsInc(Double aParUsInc) {
        this.aParUsInc = aParUsInc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaParUsInc(Double aParUsInc) {
        this.aParUsInc = aParUsInc;
        return this;
    }

    /**
     * Number of Family in College
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_NO_IN_COLL
     * 
     */
    @JsonProperty("aParNoInColl")
    public Double getaParNoInColl() {
        return aParNoInColl;
    }

    /**
     * Number of Family in College
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_NO_IN_COLL
     * 
     */
    @JsonProperty("aParNoInColl")
    public void setaParNoInColl(Double aParNoInColl) {
        this.aParNoInColl = aParNoInColl;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaParNoInColl(Double aParNoInColl) {
        this.aParNoInColl = aParNoInColl;
        return this;
    }

    /**
     * Electronic Transaction Indicator
     * <p>
     * Lineage reference object : RCRESAR_EDE_ETI_IND
     * 
     */
    @JsonProperty("edeEtiInd")
    public String getEdeEtiInd() {
        return edeEtiInd;
    }

    /**
     * Electronic Transaction Indicator
     * <p>
     * Lineage reference object : RCRESAR_EDE_ETI_IND
     * 
     */
    @JsonProperty("edeEtiInd")
    public void setEdeEtiInd(String edeEtiInd) {
        this.edeEtiInd = edeEtiInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withEdeEtiInd(String edeEtiInd) {
        this.edeEtiInd = edeEtiInd;
        return this;
    }

    /**
     * Signature Reject EFC
     * <p>
     * Lineage reference object : RCRESAR_SIGNATURE_REJ_EFC
     * 
     */
    @JsonProperty("signatureRejEfc")
    public Double getSignatureRejEfc() {
        return signatureRejEfc;
    }

    /**
     * Signature Reject EFC
     * <p>
     * Lineage reference object : RCRESAR_SIGNATURE_REJ_EFC
     * 
     */
    @JsonProperty("signatureRejEfc")
    public void setSignatureRejEfc(Double signatureRejEfc) {
        this.signatureRejEfc = signatureRejEfc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withSignatureRejEfc(Double signatureRejEfc) {
        this.signatureRejEfc = signatureRejEfc;
        return this;
    }

    /**
     * Last Name or SSN Change
     * <p>
     * Lineage reference object : RCRESAR_NAME_SSN_CHG_IND
     * 
     */
    @JsonProperty("nameSsnChgInd")
    public String getNameSsnChgInd() {
        return nameSsnChgInd;
    }

    /**
     * Last Name or SSN Change
     * <p>
     * Lineage reference object : RCRESAR_NAME_SSN_CHG_IND
     * 
     */
    @JsonProperty("nameSsnChgInd")
    public void setNameSsnChgInd(String nameSsnChgInd) {
        this.nameSsnChgInd = nameSsnChgInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withNameSsnChgInd(String nameSsnChgInd) {
        this.nameSsnChgInd = nameSsnChgInd;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_02_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc02MthCalc")
    public Double getAlt2Fc02MthCalc() {
        return alt2Fc02MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_02_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc02MthCalc")
    public void setAlt2Fc02MthCalc(Double alt2Fc02MthCalc) {
        this.alt2Fc02MthCalc = alt2Fc02MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc02MthCalc(Double alt2Fc02MthCalc) {
        this.alt2Fc02MthCalc = alt2Fc02MthCalc;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_04_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc04MthCalc")
    public Double getAlt2Fc04MthCalc() {
        return alt2Fc04MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_04_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc04MthCalc")
    public void setAlt2Fc04MthCalc(Double alt2Fc04MthCalc) {
        this.alt2Fc04MthCalc = alt2Fc04MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc04MthCalc(Double alt2Fc04MthCalc) {
        this.alt2Fc04MthCalc = alt2Fc04MthCalc;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_06_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc06MthCalc")
    public Double getAlt2Fc06MthCalc() {
        return alt2Fc06MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_06_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc06MthCalc")
    public void setAlt2Fc06MthCalc(Double alt2Fc06MthCalc) {
        this.alt2Fc06MthCalc = alt2Fc06MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc06MthCalc(Double alt2Fc06MthCalc) {
        this.alt2Fc06MthCalc = alt2Fc06MthCalc;
        return this;
    }

    /**
     * Legal Dependents
     * <p>
     * Lineage reference object : RCRESAR_A_S_DEPENDANTS
     * 
     */
    @JsonProperty("aSDependants")
    public String getaSDependants() {
        return aSDependants;
    }

    /**
     * Legal Dependents
     * <p>
     * Lineage reference object : RCRESAR_A_S_DEPENDANTS
     * 
     */
    @JsonProperty("aSDependants")
    public void setaSDependants(String aSDependants) {
        this.aSDependants = aSDependants;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaSDependants(String aSDependants) {
        this.aSDependants = aSDependants;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_08_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc08MthCalc")
    public Double getAlt2Fc08MthCalc() {
        return alt2Fc08MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_08_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc08MthCalc")
    public void setAlt2Fc08MthCalc(Double alt2Fc08MthCalc) {
        this.alt2Fc08MthCalc = alt2Fc08MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc08MthCalc(Double alt2Fc08MthCalc) {
        this.alt2Fc08MthCalc = alt2Fc08MthCalc;
        return this;
    }

    /**
     *  20         Non-tax filer reporting an income above IRS filing requirements
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd20")
    public String getRcrapp3RejectOvrd20() {
        return rcrapp3RejectOvrd20;
    }

    /**
     *  20         Non-tax filer reporting an income above IRS filing requirements
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd20")
    public void setRcrapp3RejectOvrd20(String rcrapp3RejectOvrd20) {
        this.rcrapp3RejectOvrd20 = rcrapp3RejectOvrd20;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrd20(String rcrapp3RejectOvrd20) {
        this.rcrapp3RejectOvrd20 = rcrapp3RejectOvrd20;
        return this;
    }

    /**
     * Is Student Married or Remarried
     * <p>
     * Lineage reference object : RCRESAR_A_MARRIED
     * 
     */
    @JsonProperty("aMarried")
    public String getaMarried() {
        return aMarried;
    }

    /**
     * Is Student Married or Remarried
     * <p>
     * Lineage reference object : RCRESAR_A_MARRIED
     * 
     */
    @JsonProperty("aMarried")
    public void setaMarried(String aMarried) {
        this.aMarried = aMarried;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaMarried(String aMarried) {
        this.aMarried = aMarried;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_01
     * 
     */
    @JsonProperty("commCode01")
    public Double getCommCode01() {
        return commCode01;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_01
     * 
     */
    @JsonProperty("commCode01")
    public void setCommCode01(Double commCode01) {
        this.commCode01 = commCode01;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode01(Double commCode01) {
        this.commCode01 = commCode01;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_02
     * 
     */
    @JsonProperty("commCode02")
    public Double getCommCode02() {
        return commCode02;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_02
     * 
     */
    @JsonProperty("commCode02")
    public void setCommCode02(Double commCode02) {
        this.commCode02 = commCode02;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode02(Double commCode02) {
        this.commCode02 = commCode02;
        return this;
    }

    /**
     * Electronic Institution
     * <p>
     * Lineage reference object : RCRESAR_EDE_INST_IND
     * 
     */
    @JsonProperty("edeInstInd")
    public String getEdeInstInd() {
        return edeInstInd;
    }

    /**
     * Electronic Institution
     * <p>
     * Lineage reference object : RCRESAR_EDE_INST_IND
     * 
     */
    @JsonProperty("edeInstInd")
    public void setEdeInstInd(String edeInstInd) {
        this.edeInstInd = edeInstInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withEdeInstInd(String edeInstInd) {
        this.edeInstInd = edeInstInd;
        return this;
    }

    /**
     * FAA Federal School Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FaaTitleIvCode")
    public String getRcrapp3FaaTitleIvCode() {
        return rcrapp3FaaTitleIvCode;
    }

    /**
     * FAA Federal School Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FaaTitleIvCode")
    public void setRcrapp3FaaTitleIvCode(String rcrapp3FaaTitleIvCode) {
        this.rcrapp3FaaTitleIvCode = rcrapp3FaaTitleIvCode;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3FaaTitleIvCode(String rcrapp3FaaTitleIvCode) {
        this.rcrapp3FaaTitleIvCode = rcrapp3FaaTitleIvCode;
        return this;
    }

    /**
     *  21         Student's corrected marital status date >= application receipt date and <= transaction receipt date
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd21")
    public String getRcrapp3RejectOvrd21() {
        return rcrapp3RejectOvrd21;
    }

    /**
     *  21         Student's corrected marital status date >= application receipt date and <= transaction receipt date
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd21")
    public void setRcrapp3RejectOvrd21(String rcrapp3RejectOvrd21) {
        this.rcrapp3RejectOvrd21 = rcrapp3RejectOvrd21;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrd21(String rcrapp3RejectOvrd21) {
        this.rcrapp3RejectOvrd21 = rcrapp3RejectOvrd21;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_05
     * 
     */
    @JsonProperty("commCode05")
    public Double getCommCode05() {
        return commCode05;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_05
     * 
     */
    @JsonProperty("commCode05")
    public void setCommCode05(Double commCode05) {
        this.commCode05 = commCode05;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode05(Double commCode05) {
        this.commCode05 = commCode05;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_06
     * 
     */
    @JsonProperty("commCode06")
    public Double getCommCode06() {
        return commCode06;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_06
     * 
     */
    @JsonProperty("commCode06")
    public void setCommCode06(Double commCode06) {
        this.commCode06 = commCode06;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode06(Double commCode06) {
        this.commCode06 = commCode06;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_03
     * 
     */
    @JsonProperty("commCode03")
    public Double getCommCode03() {
        return commCode03;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_03
     * 
     */
    @JsonProperty("commCode03")
    public void setCommCode03(Double commCode03) {
        this.commCode03 = commCode03;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode03(Double commCode03) {
        this.commCode03 = commCode03;
        return this;
    }

    /**
     * Compute Batch Number
     * <p>
     * Lineage reference object : RCRESAR_COMPUTE_BATCH_NO
     * 
     */
    @JsonProperty("computeBatchNo")
    public Double getComputeBatchNo() {
        return computeBatchNo;
    }

    /**
     * Compute Batch Number
     * <p>
     * Lineage reference object : RCRESAR_COMPUTE_BATCH_NO
     * 
     */
    @JsonProperty("computeBatchNo")
    public void setComputeBatchNo(Double computeBatchNo) {
        this.computeBatchNo = computeBatchNo;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withComputeBatchNo(Double computeBatchNo) {
        this.computeBatchNo = computeBatchNo;
        return this;
    }

    /**
     * Threshold Exceeded
     * <p>
     * Lineage reference object : RCRESAR_A_P_ASSET_THRESH_EXCD
     * 
     */
    @JsonProperty("aPAssetThreshExcd")
    public String getaPAssetThreshExcd() {
        return aPAssetThreshExcd;
    }

    /**
     * Threshold Exceeded
     * <p>
     * Lineage reference object : RCRESAR_A_P_ASSET_THRESH_EXCD
     * 
     */
    @JsonProperty("aPAssetThreshExcd")
    public void setaPAssetThreshExcd(String aPAssetThreshExcd) {
        this.aPAssetThreshExcd = aPAssetThreshExcd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaPAssetThreshExcd(String aPAssetThreshExcd) {
        this.aPAssetThreshExcd = aPAssetThreshExcd;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_04
     * 
     */
    @JsonProperty("commCode04")
    public Double getCommCode04() {
        return commCode04;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_04
     * 
     */
    @JsonProperty("commCode04")
    public void setCommCode04(Double commCode04) {
        this.commCode04 = commCode04;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode04(Double commCode04) {
        this.commCode04 = commCode04;
        return this;
    }

    /**
     * T          Parent 2 SSN match, but no Date of Birth match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdMSsnNoDobRejOvrd")
    public String getRnrovrdMSsnNoDobRejOvrd() {
        return rnrovrdMSsnNoDobRejOvrd;
    }

    /**
     * T          Parent 2 SSN match, but no Date of Birth match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdMSsnNoDobRejOvrd")
    public void setRnrovrdMSsnNoDobRejOvrd(String rnrovrdMSsnNoDobRejOvrd) {
        this.rnrovrdMSsnNoDobRejOvrd = rnrovrdMSsnNoDobRejOvrd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRnrovrdMSsnNoDobRejOvrd(String rnrovrdMSsnNoDobRejOvrd) {
        this.rnrovrdMSsnNoDobRejOvrd = rnrovrdMSsnNoDobRejOvrd;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_A_TAX_FILED_IND
     * 
     */
    @JsonProperty("aTaxFiledInd")
    public String getaTaxFiledInd() {
        return aTaxFiledInd;
    }

    /**
     * Lineage reference object : RCRESAR_A_TAX_FILED_IND
     * 
     */
    @JsonProperty("aTaxFiledInd")
    public void setaTaxFiledInd(String aTaxFiledInd) {
        this.aTaxFiledInd = aTaxFiledInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaTaxFiledInd(String aTaxFiledInd) {
        this.aTaxFiledInd = aTaxFiledInd;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_A_FAM_MEMB
     * 
     */
    @JsonProperty("aFamMemb")
    public Double getaFamMemb() {
        return aFamMemb;
    }

    /**
     * Lineage reference object : RCRESAR_A_FAM_MEMB
     * 
     */
    @JsonProperty("aFamMemb")
    public void setaFamMemb(Double aFamMemb) {
        this.aFamMemb = aFamMemb;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaFamMemb(Double aFamMemb) {
        this.aFamMemb = aFamMemb;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_A_NO_IN_COLL
     * 
     */
    @JsonProperty("aNoInColl")
    public Double getaNoInColl() {
        return aNoInColl;
    }

    /**
     * Lineage reference object : RCRESAR_A_NO_IN_COLL
     * 
     */
    @JsonProperty("aNoInColl")
    public void setaNoInColl(Double aNoInColl) {
        this.aNoInColl = aNoInColl;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaNoInColl(Double aNoInColl) {
        this.aNoInColl = aNoInColl;
        return this;
    }

    @JsonProperty("rtvicmtDesc15")
    public String getRtvicmtDesc15() {
        return rtvicmtDesc15;
    }

    @JsonProperty("rtvicmtDesc15")
    public void setRtvicmtDesc15(String rtvicmtDesc15) {
        this.rtvicmtDesc15 = rtvicmtDesc15;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc15(String rtvicmtDesc15) {
        this.rtvicmtDesc15 = rtvicmtDesc15;
        return this;
    }

    @JsonProperty("rtvicmtDesc16")
    public String getRtvicmtDesc16() {
        return rtvicmtDesc16;
    }

    @JsonProperty("rtvicmtDesc16")
    public void setRtvicmtDesc16(String rtvicmtDesc16) {
        this.rtvicmtDesc16 = rtvicmtDesc16;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc16(String rtvicmtDesc16) {
        this.rtvicmtDesc16 = rtvicmtDesc16;
        return this;
    }

    @JsonProperty("rtvicmtDesc13")
    public String getRtvicmtDesc13() {
        return rtvicmtDesc13;
    }

    @JsonProperty("rtvicmtDesc13")
    public void setRtvicmtDesc13(String rtvicmtDesc13) {
        this.rtvicmtDesc13 = rtvicmtDesc13;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc13(String rtvicmtDesc13) {
        this.rtvicmtDesc13 = rtvicmtDesc13;
        return this;
    }

    @JsonProperty("rtvicmtDesc14")
    public String getRtvicmtDesc14() {
        return rtvicmtDesc14;
    }

    @JsonProperty("rtvicmtDesc14")
    public void setRtvicmtDesc14(String rtvicmtDesc14) {
        this.rtvicmtDesc14 = rtvicmtDesc14;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc14(String rtvicmtDesc14) {
        this.rtvicmtDesc14 = rtvicmtDesc14;
        return this;
    }

    @JsonProperty("rtvicmtDesc19")
    public String getRtvicmtDesc19() {
        return rtvicmtDesc19;
    }

    @JsonProperty("rtvicmtDesc19")
    public void setRtvicmtDesc19(String rtvicmtDesc19) {
        this.rtvicmtDesc19 = rtvicmtDesc19;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc19(String rtvicmtDesc19) {
        this.rtvicmtDesc19 = rtvicmtDesc19;
        return this;
    }

    @JsonProperty("rtvicmtDesc17")
    public String getRtvicmtDesc17() {
        return rtvicmtDesc17;
    }

    @JsonProperty("rtvicmtDesc17")
    public void setRtvicmtDesc17(String rtvicmtDesc17) {
        this.rtvicmtDesc17 = rtvicmtDesc17;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc17(String rtvicmtDesc17) {
        this.rtvicmtDesc17 = rtvicmtDesc17;
        return this;
    }

    @JsonProperty("rtvicmtDesc18")
    public String getRtvicmtDesc18() {
        return rtvicmtDesc18;
    }

    @JsonProperty("rtvicmtDesc18")
    public void setRtvicmtDesc18(String rtvicmtDesc18) {
        this.rtvicmtDesc18 = rtvicmtDesc18;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc18(String rtvicmtDesc18) {
        this.rtvicmtDesc18 = rtvicmtDesc18;
        return this;
    }

    @JsonProperty("rtvicmtDesc11")
    public String getRtvicmtDesc11() {
        return rtvicmtDesc11;
    }

    @JsonProperty("rtvicmtDesc11")
    public void setRtvicmtDesc11(String rtvicmtDesc11) {
        this.rtvicmtDesc11 = rtvicmtDesc11;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc11(String rtvicmtDesc11) {
        this.rtvicmtDesc11 = rtvicmtDesc11;
        return this;
    }

    @JsonProperty("rtvicmtDesc12")
    public String getRtvicmtDesc12() {
        return rtvicmtDesc12;
    }

    @JsonProperty("rtvicmtDesc12")
    public void setRtvicmtDesc12(String rtvicmtDesc12) {
        this.rtvicmtDesc12 = rtvicmtDesc12;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc12(String rtvicmtDesc12) {
        this.rtvicmtDesc12 = rtvicmtDesc12;
        return this;
    }

    @JsonProperty("rtvicmtDesc10")
    public String getRtvicmtDesc10() {
        return rtvicmtDesc10;
    }

    @JsonProperty("rtvicmtDesc10")
    public void setRtvicmtDesc10(String rtvicmtDesc10) {
        this.rtvicmtDesc10 = rtvicmtDesc10;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc10(String rtvicmtDesc10) {
        this.rtvicmtDesc10 = rtvicmtDesc10;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_01_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc01MthCalc")
    public Double getAlt2Fc01MthCalc() {
        return alt2Fc01MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_01_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc01MthCalc")
    public void setAlt2Fc01MthCalc(Double alt2Fc01MthCalc) {
        this.alt2Fc01MthCalc = alt2Fc01MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc01MthCalc(Double alt2Fc01MthCalc) {
        this.alt2Fc01MthCalc = alt2Fc01MthCalc;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_12
     * 
     */
    @JsonProperty("commCode12")
    public Double getCommCode12() {
        return commCode12;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_12
     * 
     */
    @JsonProperty("commCode12")
    public void setCommCode12(Double commCode12) {
        this.commCode12 = commCode12;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode12(Double commCode12) {
        this.commCode12 = commCode12;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_13
     * 
     */
    @JsonProperty("commCode13")
    public Double getCommCode13() {
        return commCode13;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_13
     * 
     */
    @JsonProperty("commCode13")
    public void setCommCode13(Double commCode13) {
        this.commCode13 = commCode13;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode13(Double commCode13) {
        this.commCode13 = commCode13;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_10
     * 
     */
    @JsonProperty("commCode10")
    public Double getCommCode10() {
        return commCode10;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_10
     * 
     */
    @JsonProperty("commCode10")
    public void setCommCode10(Double commCode10) {
        this.commCode10 = commCode10;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode10(Double commCode10) {
        this.commCode10 = commCode10;
        return this;
    }

    /**
     * Secondary EFC Type
     * <p>
     * Lineage reference object : RCRESAR_SEC_EFC_TYPE
     * 
     */
    @JsonProperty("secEfcType")
    public String getSecEfcType() {
        return secEfcType;
    }

    /**
     * Secondary EFC Type
     * <p>
     * Lineage reference object : RCRESAR_SEC_EFC_TYPE
     * 
     */
    @JsonProperty("secEfcType")
    public void setSecEfcType(String secEfcType) {
        this.secEfcType = secEfcType;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withSecEfcType(String secEfcType) {
        this.secEfcType = secEfcType;
        return this;
    }

    /**
     * Address Only Change
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4AddressChgFlag")
    public String getRcrapp4AddressChgFlag() {
        return rcrapp4AddressChgFlag;
    }

    /**
     * Address Only Change
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4AddressChgFlag")
    public void setRcrapp4AddressChgFlag(String rcrapp4AddressChgFlag) {
        this.rcrapp4AddressChgFlag = rcrapp4AddressChgFlag;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp4AddressChgFlag(String rcrapp4AddressChgFlag) {
        this.rcrapp4AddressChgFlag = rcrapp4AddressChgFlag;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_11
     * 
     */
    @JsonProperty("commCode11")
    public Double getCommCode11() {
        return commCode11;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_11
     * 
     */
    @JsonProperty("commCode11")
    public void setCommCode11(Double commCode11) {
        this.commCode11 = commCode11;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode11(Double commCode11) {
        this.commCode11 = commCode11;
        return this;
    }

    /**
     * Auto Zero Flag
     * <p>
     * Lineage reference object : RCRESAR_AUTO_ZERO_EFC_FLAG
     * 
     */
    @JsonProperty("autoZeroEfcFlag")
    public String getAutoZeroEfcFlag() {
        return autoZeroEfcFlag;
    }

    /**
     * Auto Zero Flag
     * <p>
     * Lineage reference object : RCRESAR_AUTO_ZERO_EFC_FLAG
     * 
     */
    @JsonProperty("autoZeroEfcFlag")
    public void setAutoZeroEfcFlag(String autoZeroEfcFlag) {
        this.autoZeroEfcFlag = autoZeroEfcFlag;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAutoZeroEfcFlag(String autoZeroEfcFlag) {
        this.autoZeroEfcFlag = autoZeroEfcFlag;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_16
     * 
     */
    @JsonProperty("commCode16")
    public Double getCommCode16() {
        return commCode16;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_16
     * 
     */
    @JsonProperty("commCode16")
    public void setCommCode16(Double commCode16) {
        this.commCode16 = commCode16;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode16(Double commCode16) {
        this.commCode16 = commCode16;
        return this;
    }

    /**
     * SAR C Change
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SarCChangeFlag")
    public String getRcrapp4SarCChangeFlag() {
        return rcrapp4SarCChangeFlag;
    }

    /**
     * SAR C Change
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SarCChangeFlag")
    public void setRcrapp4SarCChangeFlag(String rcrapp4SarCChangeFlag) {
        this.rcrapp4SarCChangeFlag = rcrapp4SarCChangeFlag;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp4SarCChangeFlag(String rcrapp4SarCChangeFlag) {
        this.rcrapp4SarCChangeFlag = rcrapp4SarCChangeFlag;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_17
     * 
     */
    @JsonProperty("commCode17")
    public Double getCommCode17() {
        return commCode17;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_17
     * 
     */
    @JsonProperty("commCode17")
    public void setCommCode17(Double commCode17) {
        this.commCode17 = commCode17;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode17(Double commCode17) {
        this.commCode17 = commCode17;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_14
     * 
     */
    @JsonProperty("commCode14")
    public Double getCommCode14() {
        return commCode14;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_14
     * 
     */
    @JsonProperty("commCode14")
    public void setCommCode14(Double commCode14) {
        this.commCode14 = commCode14;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode14(Double commCode14) {
        this.commCode14 = commCode14;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_15
     * 
     */
    @JsonProperty("commCode15")
    public Double getCommCode15() {
        return commCode15;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_15
     * 
     */
    @JsonProperty("commCode15")
    public void setCommCode15(Double commCode15) {
        this.commCode15 = commCode15;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode15(Double commCode15) {
        this.commCode15 = commCode15;
        return this;
    }

    /**
     * Citizenship
     * <p>
     * Lineage reference object : RCRESAR_A_CITZ_IND
     * 
     */
    @JsonProperty("aCitzInd")
    public String getaCitzInd() {
        return aCitzInd;
    }

    /**
     * Citizenship
     * <p>
     * Lineage reference object : RCRESAR_A_CITZ_IND
     * 
     */
    @JsonProperty("aCitzInd")
    public void setaCitzInd(String aCitzInd) {
        this.aCitzInd = aCitzInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaCitzInd(String aCitzInd) {
        this.aCitzInd = aCitzInd;
        return this;
    }

    /**
     * Have Children You Support
     * <p>
     * Lineage reference object : RCRESAR_A_HAVE_CHILDREN
     * 
     */
    @JsonProperty("aHaveChildren")
    public String getaHaveChildren() {
        return aHaveChildren;
    }

    /**
     * Have Children You Support
     * <p>
     * Lineage reference object : RCRESAR_A_HAVE_CHILDREN
     * 
     */
    @JsonProperty("aHaveChildren")
    public void setaHaveChildren(String aHaveChildren) {
        this.aHaveChildren = aHaveChildren;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaHaveChildren(String aHaveChildren) {
        this.aHaveChildren = aHaveChildren;
        return this;
    }

    /**
     * Month 5
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_05_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc05MthCalc")
    public Double getAlt1Fc05MthCalc() {
        return alt1Fc05MthCalc;
    }

    /**
     * Month 5
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_05_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc05MthCalc")
    public void setAlt1Fc05MthCalc(Double alt1Fc05MthCalc) {
        this.alt1Fc05MthCalc = alt1Fc05MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc05MthCalc(Double alt1Fc05MthCalc) {
        this.alt1Fc05MthCalc = alt1Fc05MthCalc;
        return this;
    }

    /**
     * Month 9
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_09_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc09MthCalc")
    public Double getAlt1Fc09MthCalc() {
        return alt1Fc09MthCalc;
    }

    /**
     * Month 9
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_09_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc09MthCalc")
    public void setAlt1Fc09MthCalc(Double alt1Fc09MthCalc) {
        this.alt1Fc09MthCalc = alt1Fc09MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc09MthCalc(Double alt1Fc09MthCalc) {
        this.alt1Fc09MthCalc = alt1Fc09MthCalc;
        return this;
    }

    /**
     * S          Parent 1 SSN match, but no Date of Birth match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdFSsnNoDobRejOvrd")
    public String getRnrovrdFSsnNoDobRejOvrd() {
        return rnrovrdFSsnNoDobRejOvrd;
    }

    /**
     * S          Parent 1 SSN match, but no Date of Birth match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdFSsnNoDobRejOvrd")
    public void setRnrovrdFSsnNoDobRejOvrd(String rnrovrdFSsnNoDobRejOvrd) {
        this.rnrovrdFSsnNoDobRejOvrd = rnrovrdFSsnNoDobRejOvrd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRnrovrdFSsnNoDobRejOvrd(String rnrovrdFSsnNoDobRejOvrd) {
        this.rnrovrdFSsnNoDobRejOvrd = rnrovrdFSsnNoDobRejOvrd;
        return this;
    }

    @JsonProperty("rcrapp2CAddlFinancial")
    public Double getRcrapp2CAddlFinancial() {
        return rcrapp2CAddlFinancial;
    }

    @JsonProperty("rcrapp2CAddlFinancial")
    public void setRcrapp2CAddlFinancial(Double rcrapp2CAddlFinancial) {
        this.rcrapp2CAddlFinancial = rcrapp2CAddlFinancial;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp2CAddlFinancial(Double rcrapp2CAddlFinancial) {
        this.rcrapp2CAddlFinancial = rcrapp2CAddlFinancial;
        return this;
    }

    /**
     * Month 12
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_12_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc12MthCalc")
    public Double getAlt1Fc12MthCalc() {
        return alt1Fc12MthCalc;
    }

    /**
     * Month 12
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_12_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc12MthCalc")
    public void setAlt1Fc12MthCalc(Double alt1Fc12MthCalc) {
        this.alt1Fc12MthCalc = alt1Fc12MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc12MthCalc(Double alt1Fc12MthCalc) {
        this.alt1Fc12MthCalc = alt1Fc12MthCalc;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_05_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc05MthCalc")
    public Double getAlt2Fc05MthCalc() {
        return alt2Fc05MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_05_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc05MthCalc")
    public void setAlt2Fc05MthCalc(Double alt2Fc05MthCalc) {
        this.alt2Fc05MthCalc = alt2Fc05MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc05MthCalc(Double alt2Fc05MthCalc) {
        this.alt2Fc05MthCalc = alt2Fc05MthCalc;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_A_MRTL_STATUS_IND
     * 
     */
    @JsonProperty("aMrtlStatusInd")
    public String getaMrtlStatusInd() {
        return aMrtlStatusInd;
    }

    /**
     * Lineage reference object : RCRESAR_A_MRTL_STATUS_IND
     * 
     */
    @JsonProperty("aMrtlStatusInd")
    public void setaMrtlStatusInd(String aMrtlStatusInd) {
        this.aMrtlStatusInd = aMrtlStatusInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaMrtlStatusInd(String aMrtlStatusInd) {
        this.aMrtlStatusInd = aMrtlStatusInd;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_09
     * 
     */
    @JsonProperty("commCode09")
    public Double getCommCode09() {
        return commCode09;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_09
     * 
     */
    @JsonProperty("commCode09")
    public void setCommCode09(Double commCode09) {
        this.commCode09 = commCode09;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode09(Double commCode09) {
        this.commCode09 = commCode09;
        return this;
    }

    /**
     * Parent 2 SSN
     * <p>
     * Lineage reference object : RCRESAR_A_MOTH_SSN
     * 
     */
    @JsonProperty("aMothSsn")
    public String getaMothSsn() {
        return aMothSsn;
    }

    /**
     * Parent 2 SSN
     * <p>
     * Lineage reference object : RCRESAR_A_MOTH_SSN
     * 
     */
    @JsonProperty("aMothSsn")
    public void setaMothSsn(String aMothSsn) {
        this.aMothSsn = aMothSsn;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaMothSsn(String aMothSsn) {
        this.aMothSsn = aMothSsn;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_07
     * 
     */
    @JsonProperty("commCode07")
    public Double getCommCode07() {
        return commCode07;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_07
     * 
     */
    @JsonProperty("commCode07")
    public void setCommCode07(Double commCode07) {
        this.commCode07 = commCode07;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode07(Double commCode07) {
        this.commCode07 = commCode07;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_12_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc12MthCalc")
    public Double getAlt2Fc12MthCalc() {
        return alt2Fc12MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_12_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc12MthCalc")
    public void setAlt2Fc12MthCalc(Double alt2Fc12MthCalc) {
        this.alt2Fc12MthCalc = alt2Fc12MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc12MthCalc(Double alt2Fc12MthCalc) {
        this.alt2Fc12MthCalc = alt2Fc12MthCalc;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_08
     * 
     */
    @JsonProperty("commCode08")
    public Double getCommCode08() {
        return commCode08;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_08
     * 
     */
    @JsonProperty("commCode08")
    public void setCommCode08(Double commCode08) {
        this.commCode08 = commCode08;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode08(Double commCode08) {
        this.commCode08 = commCode08;
        return this;
    }

    /**
     * Rejected Status Change
     * <p>
     * Lineage reference object : RCRESAR_REJ_STATUS_CHANGE_IND
     * 
     */
    @JsonProperty("rejStatusChangeInd")
    public String getRejStatusChangeInd() {
        return rejStatusChangeInd;
    }

    /**
     * Rejected Status Change
     * <p>
     * Lineage reference object : RCRESAR_REJ_STATUS_CHANGE_IND
     * 
     */
    @JsonProperty("rejStatusChangeInd")
    public void setRejStatusChangeInd(String rejStatusChangeInd) {
        this.rejStatusChangeInd = rejStatusChangeInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRejStatusChangeInd(String rejStatusChangeInd) {
        this.rejStatusChangeInd = rejStatusChangeInd;
        return this;
    }

    @JsonProperty("rtvicmtDesc20")
    public String getRtvicmtDesc20() {
        return rtvicmtDesc20;
    }

    @JsonProperty("rtvicmtDesc20")
    public void setRtvicmtDesc20(String rtvicmtDesc20) {
        this.rtvicmtDesc20 = rtvicmtDesc20;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc20(String rtvicmtDesc20) {
        this.rtvicmtDesc20 = rtvicmtDesc20;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_09_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc09MthCalc")
    public Double getAlt2Fc09MthCalc() {
        return alt2Fc09MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_09_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc09MthCalc")
    public void setAlt2Fc09MthCalc(Double alt2Fc09MthCalc) {
        this.alt2Fc09MthCalc = alt2Fc09MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc09MthCalc(Double alt2Fc09MthCalc) {
        this.alt2Fc09MthCalc = alt2Fc09MthCalc;
        return this;
    }

    /**
     *  2          Parents' AGI is assumed to be the sum of earned income
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd2")
    public String getRcrapp3AssumptOvrd2() {
        return rcrapp3AssumptOvrd2;
    }

    /**
     *  2          Parents' AGI is assumed to be the sum of earned income
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd2")
    public void setRcrapp3AssumptOvrd2(String rcrapp3AssumptOvrd2) {
        this.rcrapp3AssumptOvrd2 = rcrapp3AssumptOvrd2;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3AssumptOvrd2(String rcrapp3AssumptOvrd2) {
        this.rcrapp3AssumptOvrd2 = rcrapp3AssumptOvrd2;
        return this;
    }

    /**
     *  1          Parents in college assumed 1 (number in college is greater than 6)
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd1")
    public String getRcrapp3AssumptOvrd1() {
        return rcrapp3AssumptOvrd1;
    }

    /**
     *  1          Parents in college assumed 1 (number in college is greater than 6)
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd1")
    public void setRcrapp3AssumptOvrd1(String rcrapp3AssumptOvrd1) {
        this.rcrapp3AssumptOvrd1 = rcrapp3AssumptOvrd1;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3AssumptOvrd1(String rcrapp3AssumptOvrd1) {
        this.rcrapp3AssumptOvrd1 = rcrapp3AssumptOvrd1;
        return this;
    }

    /**
     * Pell Eligibility Flag
     * <p>
     * Lineage reference object : RCRESAR_PELL_ELGBL
     * 
     */
    @JsonProperty("pellElgbl")
    public String getPellElgbl() {
        return pellElgbl;
    }

    /**
     * Pell Eligibility Flag
     * <p>
     * Lineage reference object : RCRESAR_PELL_ELGBL
     * 
     */
    @JsonProperty("pellElgbl")
    public void setPellElgbl(String pellElgbl) {
        this.pellElgbl = pellElgbl;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withPellElgbl(String pellElgbl) {
        this.pellElgbl = pellElgbl;
        return this;
    }

    /**
     *  2013 Wages (Parent 2 and Spouse)
     * <p>
     * Lineage reference object : RCRESAR_A_MOTH_INC_FR_WRK
     * 
     */
    @JsonProperty("aMothIncFrWrk")
    public Double getaMothIncFrWrk() {
        return aMothIncFrWrk;
    }

    /**
     *  2013 Wages (Parent 2 and Spouse)
     * <p>
     * Lineage reference object : RCRESAR_A_MOTH_INC_FR_WRK
     * 
     */
    @JsonProperty("aMothIncFrWrk")
    public void setaMothIncFrWrk(Double aMothIncFrWrk) {
        this.aMothIncFrWrk = aMothIncFrWrk;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaMothIncFrWrk(Double aMothIncFrWrk) {
        this.aMothIncFrWrk = aMothIncFrWrk;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_A_SPS_INC_FR_WRK
     * 
     */
    @JsonProperty("aSpsIncFrWrk")
    public Double getaSpsIncFrWrk() {
        return aSpsIncFrWrk;
    }

    /**
     * Lineage reference object : RCRESAR_A_SPS_INC_FR_WRK
     * 
     */
    @JsonProperty("aSpsIncFrWrk")
    public void setaSpsIncFrWrk(Double aSpsIncFrWrk) {
        this.aSpsIncFrWrk = aSpsIncFrWrk;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaSpsIncFrWrk(Double aSpsIncFrWrk) {
        this.aSpsIncFrWrk = aSpsIncFrWrk;
        return this;
    }

    /**
     * Month 1
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_01_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc01MthCalc")
    public Double getAlt1Fc01MthCalc() {
        return alt1Fc01MthCalc;
    }

    /**
     * Month 1
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_01_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc01MthCalc")
    public void setAlt1Fc01MthCalc(Double alt1Fc01MthCalc) {
        this.alt1Fc01MthCalc = alt1Fc01MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc01MthCalc(Double alt1Fc01MthCalc) {
        this.alt1Fc01MthCalc = alt1Fc01MthCalc;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_20
     * 
     */
    @JsonProperty("commCode20")
    public Double getCommCode20() {
        return commCode20;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_20
     * 
     */
    @JsonProperty("commCode20")
    public void setCommCode20(Double commCode20) {
        this.commCode20 = commCode20;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode20(Double commCode20) {
        this.commCode20 = commCode20;
        return this;
    }

    /**
     * Processed Record Type
     * <p>
     * Lineage reference object : RCRESAR_REC_TYPE
     * 
     */
    @JsonProperty("recType")
    public String getRecType() {
        return recType;
    }

    /**
     * Processed Record Type
     * <p>
     * Lineage reference object : RCRESAR_REC_TYPE
     * 
     */
    @JsonProperty("recType")
    public void setRecType(String recType) {
        this.recType = recType;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRecType(String recType) {
        this.recType = recType;
        return this;
    }

    /**
     * Month 2
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_02_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc02MthCalc")
    public Double getAlt1Fc02MthCalc() {
        return alt1Fc02MthCalc;
    }

    /**
     * Month 2
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_02_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc02MthCalc")
    public void setAlt1Fc02MthCalc(Double alt1Fc02MthCalc) {
        this.alt1Fc02MthCalc = alt1Fc02MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc02MthCalc(Double alt1Fc02MthCalc) {
        this.alt1Fc02MthCalc = alt1Fc02MthCalc;
        return this;
    }

    /**
     * Month 3
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_03_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc03MthCalc")
    public Double getAlt1Fc03MthCalc() {
        return alt1Fc03MthCalc;
    }

    /**
     * Month 3
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_03_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc03MthCalc")
    public void setAlt1Fc03MthCalc(Double alt1Fc03MthCalc) {
        this.alt1Fc03MthCalc = alt1Fc03MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc03MthCalc(Double alt1Fc03MthCalc) {
        this.alt1Fc03MthCalc = alt1Fc03MthCalc;
        return this;
    }

    /**
     * ETI Destination Code
     * <p>
     * Lineage reference object : RCRESAR_ETI_DEST_CODE
     * 
     */
    @JsonProperty("etiDestCode")
    public String getEtiDestCode() {
        return etiDestCode;
    }

    /**
     * ETI Destination Code
     * <p>
     * Lineage reference object : RCRESAR_ETI_DEST_CODE
     * 
     */
    @JsonProperty("etiDestCode")
    public void setEtiDestCode(String etiDestCode) {
        this.etiDestCode = etiDestCode;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withEtiDestCode(String etiDestCode) {
        this.etiDestCode = etiDestCode;
        return this;
    }

    /**
     * Marital Status
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_MRTL_STATUS_IND
     * 
     */
    @JsonProperty("aParMrtlStatusInd")
    public String getaParMrtlStatusInd() {
        return aParMrtlStatusInd;
    }

    /**
     * Marital Status
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_MRTL_STATUS_IND
     * 
     */
    @JsonProperty("aParMrtlStatusInd")
    public void setaParMrtlStatusInd(String aParMrtlStatusInd) {
        this.aParMrtlStatusInd = aParMrtlStatusInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaParMrtlStatusInd(String aParMrtlStatusInd) {
        this.aParMrtlStatusInd = aParMrtlStatusInd;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_18
     * 
     */
    @JsonProperty("commCode18")
    public Double getCommCode18() {
        return commCode18;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_18
     * 
     */
    @JsonProperty("commCode18")
    public void setCommCode18(Double commCode18) {
        this.commCode18 = commCode18;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode18(Double commCode18) {
        this.commCode18 = commCode18;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_19
     * 
     */
    @JsonProperty("commCode19")
    public Double getCommCode19() {
        return commCode19;
    }

    /**
     * Lineage reference object : RCRESAR_COMM_CODE_19
     * 
     */
    @JsonProperty("commCode19")
    public void setCommCode19(Double commCode19) {
        this.commCode19 = commCode19;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCommCode19(Double commCode19) {
        this.commCode19 = commCode19;
        return this;
    }

    /**
     *  4          Student's AGI, assumed to be the sum of earned income
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd4")
    public String getRcrapp3AssumptOvrd4() {
        return rcrapp3AssumptOvrd4;
    }

    /**
     *  4          Student's AGI, assumed to be the sum of earned income
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd4")
    public void setRcrapp3AssumptOvrd4(String rcrapp3AssumptOvrd4) {
        this.rcrapp3AssumptOvrd4 = rcrapp3AssumptOvrd4;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3AssumptOvrd4(String rcrapp3AssumptOvrd4) {
        this.rcrapp3AssumptOvrd4 = rcrapp3AssumptOvrd4;
        return this;
    }

    /**
     * Federal School Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1FedCollChoice1")
    public String getRcrapp1FedCollChoice1() {
        return rcrapp1FedCollChoice1;
    }

    /**
     * Federal School Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1FedCollChoice1")
    public void setRcrapp1FedCollChoice1(String rcrapp1FedCollChoice1) {
        this.rcrapp1FedCollChoice1 = rcrapp1FedCollChoice1;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp1FedCollChoice1(String rcrapp1FedCollChoice1) {
        this.rcrapp1FedCollChoice1 = rcrapp1FedCollChoice1;
        return this;
    }

    /**
     *  3          Student's number in college, assumed to be one
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd3")
    public String getRcrapp3AssumptOvrd3() {
        return rcrapp3AssumptOvrd3;
    }

    /**
     *  3          Student's number in college, assumed to be one
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd3")
    public void setRcrapp3AssumptOvrd3(String rcrapp3AssumptOvrd3) {
        this.rcrapp3AssumptOvrd3 = rcrapp3AssumptOvrd3;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3AssumptOvrd3(String rcrapp3AssumptOvrd3) {
        this.rcrapp3AssumptOvrd3 = rcrapp3AssumptOvrd3;
        return this;
    }

    /**
     *  6          Student's income from Additional Financial Information, assumed to be zero
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd6")
    public String getRcrapp3AssumptOvrd6() {
        return rcrapp3AssumptOvrd6;
    }

    /**
     *  6          Student's income from Additional Financial Information, assumed to be zero
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd6")
    public void setRcrapp3AssumptOvrd6(String rcrapp3AssumptOvrd6) {
        this.rcrapp3AssumptOvrd6 = rcrapp3AssumptOvrd6;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3AssumptOvrd6(String rcrapp3AssumptOvrd6) {
        this.rcrapp3AssumptOvrd6 = rcrapp3AssumptOvrd6;
        return this;
    }

    /**
     * D         Student's SSN match, but no name match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdSsnNoNameRejOvrd")
    public String getRnrovrdSsnNoNameRejOvrd() {
        return rnrovrdSsnNoNameRejOvrd;
    }

    /**
     * D         Student's SSN match, but no name match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdSsnNoNameRejOvrd")
    public void setRnrovrdSsnNoNameRejOvrd(String rnrovrdSsnNoNameRejOvrd) {
        this.rnrovrdSsnNoNameRejOvrd = rnrovrdSsnNoNameRejOvrd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRnrovrdSsnNoNameRejOvrd(String rnrovrdSsnNoNameRejOvrd) {
        this.rnrovrdSsnNoNameRejOvrd = rnrovrdSsnNoNameRejOvrd;
        return this;
    }

    /**
     *  5          Parents' income from Additional Financial Information, assumed to be zero
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd5")
    public String getRcrapp3AssumptOvrd5() {
        return rcrapp3AssumptOvrd5;
    }

    /**
     *  5          Parents' income from Additional Financial Information, assumed to be zero
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3AssumptOvrd5")
    public void setRcrapp3AssumptOvrd5(String rcrapp3AssumptOvrd5) {
        this.rcrapp3AssumptOvrd5 = rcrapp3AssumptOvrd5;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3AssumptOvrd5(String rcrapp3AssumptOvrd5) {
        this.rcrapp3AssumptOvrd5 = rcrapp3AssumptOvrd5;
        return this;
    }

    /**
     * Dependency Override
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFaaDepOverride")
    public String getDisplayFaaDepOverride() {
        return displayFaaDepOverride;
    }

    /**
     * Dependency Override
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFaaDepOverride")
    public void setDisplayFaaDepOverride(String displayFaaDepOverride) {
        this.displayFaaDepOverride = displayFaaDepOverride;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withDisplayFaaDepOverride(String displayFaaDepOverride) {
        this.displayFaaDepOverride = displayFaaDepOverride;
        return this;
    }

    /**
     *  12         Parents' taxes paid > 0 and >= AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd12")
    public String getRcrapp3RejectOvrd12() {
        return rcrapp3RejectOvrd12;
    }

    /**
     *  12         Parents' taxes paid > 0 and >= AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd12")
    public void setRcrapp3RejectOvrd12(String rcrapp3RejectOvrd12) {
        this.rcrapp3RejectOvrd12 = rcrapp3RejectOvrd12;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrd12(String rcrapp3RejectOvrd12) {
        this.rcrapp3RejectOvrd12 = rcrapp3RejectOvrd12;
        return this;
    }

    /**
     * Month 6
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_06_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc06MthCalc")
    public Double getAlt1Fc06MthCalc() {
        return alt1Fc06MthCalc;
    }

    /**
     * Month 6
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_06_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc06MthCalc")
    public void setAlt1Fc06MthCalc(Double alt1Fc06MthCalc) {
        this.alt1Fc06MthCalc = alt1Fc06MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc06MthCalc(Double alt1Fc06MthCalc) {
        this.alt1Fc06MthCalc = alt1Fc06MthCalc;
        return this;
    }

    /**
     * Verification Selection Change
     * <p>
     * Lineage reference object : RCRESAR_VERIF_CHANGE_IND
     * 
     */
    @JsonProperty("verifChangeInd")
    public String getVerifChangeInd() {
        return verifChangeInd;
    }

    /**
     * Verification Selection Change
     * <p>
     * Lineage reference object : RCRESAR_VERIF_CHANGE_IND
     * 
     */
    @JsonProperty("verifChangeInd")
    public void setVerifChangeInd(String verifChangeInd) {
        this.verifChangeInd = verifChangeInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withVerifChangeInd(String verifChangeInd) {
        this.verifChangeInd = verifChangeInd;
        return this;
    }

    /**
     * CPS Additional Financial Information Total
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp2CParAddlFinancial")
    public Double getRcrapp2CParAddlFinancial() {
        return rcrapp2CParAddlFinancial;
    }

    /**
     * CPS Additional Financial Information Total
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp2CParAddlFinancial")
    public void setRcrapp2CParAddlFinancial(Double rcrapp2CParAddlFinancial) {
        this.rcrapp2CParAddlFinancial = rcrapp2CParAddlFinancial;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp2CParAddlFinancial(Double rcrapp2CParAddlFinancial) {
        this.rcrapp2CParAddlFinancial = rcrapp2CParAddlFinancial;
        return this;
    }

    /**
     * Primary DHS Verification Number
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VerifNum")
    public String getRcrapp4VerifNum() {
        return rcrapp4VerifNum;
    }

    /**
     * Primary DHS Verification Number
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VerifNum")
    public void setRcrapp4VerifNum(String rcrapp4VerifNum) {
        this.rcrapp4VerifNum = rcrapp4VerifNum;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp4VerifNum(String rcrapp4VerifNum) {
        this.rcrapp4VerifNum = rcrapp4VerifNum;
        return this;
    }

    /**
     * Month 8
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_08_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc08MthCalc")
    public Double getAlt1Fc08MthCalc() {
        return alt1Fc08MthCalc;
    }

    /**
     * Month 8
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_08_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc08MthCalc")
    public void setAlt1Fc08MthCalc(Double alt1Fc08MthCalc) {
        this.alt1Fc08MthCalc = alt1Fc08MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc08MthCalc(Double alt1Fc08MthCalc) {
        this.alt1Fc08MthCalc = alt1Fc08MthCalc;
        return this;
    }

    /**
     * Month 4
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_04_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc04MthCalc")
    public Double getAlt1Fc04MthCalc() {
        return alt1Fc04MthCalc;
    }

    /**
     * Month 4
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_04_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc04MthCalc")
    public void setAlt1Fc04MthCalc(Double alt1Fc04MthCalc) {
        this.alt1Fc04MthCalc = alt1Fc04MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc04MthCalc(Double alt1Fc04MthCalc) {
        this.alt1Fc04MthCalc = alt1Fc04MthCalc;
        return this;
    }

    /**
     * Tax Status
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_TAX_FILED_IND
     * 
     */
    @JsonProperty("aParTaxFiledInd")
    public String getaParTaxFiledInd() {
        return aParTaxFiledInd;
    }

    /**
     * Tax Status
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_TAX_FILED_IND
     * 
     */
    @JsonProperty("aParTaxFiledInd")
    public void setaParTaxFiledInd(String aParTaxFiledInd) {
        this.aParTaxFiledInd = aParTaxFiledInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaParTaxFiledInd(String aParTaxFiledInd) {
        this.aParTaxFiledInd = aParTaxFiledInd;
        return this;
    }

    /**
     * CPS Pushed ISIR
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4PushIsirFlag")
    public String getRcrapp4PushIsirFlag() {
        return rcrapp4PushIsirFlag;
    }

    /**
     * CPS Pushed ISIR
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4PushIsirFlag")
    public void setRcrapp4PushIsirFlag(String rcrapp4PushIsirFlag) {
        this.rcrapp4PushIsirFlag = rcrapp4PushIsirFlag;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp4PushIsirFlag(String rcrapp4PushIsirFlag) {
        this.rcrapp4PushIsirFlag = rcrapp4PushIsirFlag;
        return this;
    }

    /**
     * Housing Plans
     * <p>
     * Lineage reference object : RCRESAR_FED_HOUS_CDE_1
     * 
     */
    @JsonProperty("fedHousCde1")
    public String getFedHousCde1() {
        return fedHousCde1;
    }

    /**
     * Housing Plans
     * <p>
     * Lineage reference object : RCRESAR_FED_HOUS_CDE_1
     * 
     */
    @JsonProperty("fedHousCde1")
    public void setFedHousCde1(String fedHousCde1) {
        this.fedHousCde1 = fedHousCde1;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withFedHousCde1(String fedHousCde1) {
        this.fedHousCde1 = fedHousCde1;
        return this;
    }

    @JsonProperty("rtvicmtDesc04")
    public String getRtvicmtDesc04() {
        return rtvicmtDesc04;
    }

    @JsonProperty("rtvicmtDesc04")
    public void setRtvicmtDesc04(String rtvicmtDesc04) {
        this.rtvicmtDesc04 = rtvicmtDesc04;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc04(String rtvicmtDesc04) {
        this.rtvicmtDesc04 = rtvicmtDesc04;
        return this;
    }

    @JsonProperty("rtvicmtDesc05")
    public String getRtvicmtDesc05() {
        return rtvicmtDesc05;
    }

    @JsonProperty("rtvicmtDesc05")
    public void setRtvicmtDesc05(String rtvicmtDesc05) {
        this.rtvicmtDesc05 = rtvicmtDesc05;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc05(String rtvicmtDesc05) {
        this.rtvicmtDesc05 = rtvicmtDesc05;
        return this;
    }

    @JsonProperty("rtvicmtDesc02")
    public String getRtvicmtDesc02() {
        return rtvicmtDesc02;
    }

    @JsonProperty("rtvicmtDesc02")
    public void setRtvicmtDesc02(String rtvicmtDesc02) {
        this.rtvicmtDesc02 = rtvicmtDesc02;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc02(String rtvicmtDesc02) {
        this.rtvicmtDesc02 = rtvicmtDesc02;
        return this;
    }

    @JsonProperty("rtvicmtDesc03")
    public String getRtvicmtDesc03() {
        return rtvicmtDesc03;
    }

    @JsonProperty("rtvicmtDesc03")
    public void setRtvicmtDesc03(String rtvicmtDesc03) {
        this.rtvicmtDesc03 = rtvicmtDesc03;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc03(String rtvicmtDesc03) {
        this.rtvicmtDesc03 = rtvicmtDesc03;
        return this;
    }

    @JsonProperty("rtvicmtDesc08")
    public String getRtvicmtDesc08() {
        return rtvicmtDesc08;
    }

    @JsonProperty("rtvicmtDesc08")
    public void setRtvicmtDesc08(String rtvicmtDesc08) {
        this.rtvicmtDesc08 = rtvicmtDesc08;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc08(String rtvicmtDesc08) {
        this.rtvicmtDesc08 = rtvicmtDesc08;
        return this;
    }

    @JsonProperty("rtvicmtDesc09")
    public String getRtvicmtDesc09() {
        return rtvicmtDesc09;
    }

    @JsonProperty("rtvicmtDesc09")
    public void setRtvicmtDesc09(String rtvicmtDesc09) {
        this.rtvicmtDesc09 = rtvicmtDesc09;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc09(String rtvicmtDesc09) {
        this.rtvicmtDesc09 = rtvicmtDesc09;
        return this;
    }

    @JsonProperty("rtvicmtDesc06")
    public String getRtvicmtDesc06() {
        return rtvicmtDesc06;
    }

    @JsonProperty("rtvicmtDesc06")
    public void setRtvicmtDesc06(String rtvicmtDesc06) {
        this.rtvicmtDesc06 = rtvicmtDesc06;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc06(String rtvicmtDesc06) {
        this.rtvicmtDesc06 = rtvicmtDesc06;
        return this;
    }

    @JsonProperty("rtvicmtDesc07")
    public String getRtvicmtDesc07() {
        return rtvicmtDesc07;
    }

    @JsonProperty("rtvicmtDesc07")
    public void setRtvicmtDesc07(String rtvicmtDesc07) {
        this.rtvicmtDesc07 = rtvicmtDesc07;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc07(String rtvicmtDesc07) {
        this.rtvicmtDesc07 = rtvicmtDesc07;
        return this;
    }

    @JsonProperty("rtvicmtDesc01")
    public String getRtvicmtDesc01() {
        return rtvicmtDesc01;
    }

    @JsonProperty("rtvicmtDesc01")
    public void setRtvicmtDesc01(String rtvicmtDesc01) {
        this.rtvicmtDesc01 = rtvicmtDesc01;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRtvicmtDesc01(String rtvicmtDesc01) {
        this.rtvicmtDesc01 = rtvicmtDesc01;
        return this;
    }

    /**
     * E          Parent 1 SSN match, but no name match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdFSsnNoNameRejOvrd")
    public String getRnrovrdFSsnNoNameRejOvrd() {
        return rnrovrdFSsnNoNameRejOvrd;
    }

    /**
     * E          Parent 1 SSN match, but no name match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdFSsnNoNameRejOvrd")
    public void setRnrovrdFSsnNoNameRejOvrd(String rnrovrdFSsnNoNameRejOvrd) {
        this.rnrovrdFSsnNoNameRejOvrd = rnrovrdFSsnNoNameRejOvrd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRnrovrdFSsnNoNameRejOvrd(String rnrovrdFSsnNoNameRejOvrd) {
        this.rnrovrdFSsnNoNameRejOvrd = rnrovrdFSsnNoNameRejOvrd;
        return this;
    }

    /**
     *  2013 Wages (Parent 1 and Student)
     * <p>
     * Lineage reference object : RCRESAR_A_FATH_INC_FR_WRK
     * 
     */
    @JsonProperty("aFathIncFrWrk")
    public Double getaFathIncFrWrk() {
        return aFathIncFrWrk;
    }

    /**
     *  2013 Wages (Parent 1 and Student)
     * <p>
     * Lineage reference object : RCRESAR_A_FATH_INC_FR_WRK
     * 
     */
    @JsonProperty("aFathIncFrWrk")
    public void setaFathIncFrWrk(Double aFathIncFrWrk) {
        this.aFathIncFrWrk = aFathIncFrWrk;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaFathIncFrWrk(Double aFathIncFrWrk) {
        this.aFathIncFrWrk = aFathIncFrWrk;
        return this;
    }

    /**
     * F          Parent 2 SSN match, but no name match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdMSsnNoNameRejOvrd")
    public String getRnrovrdMSsnNoNameRejOvrd() {
        return rnrovrdMSsnNoNameRejOvrd;
    }

    /**
     * F          Parent 2 SSN match, but no name match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdMSsnNoNameRejOvrd")
    public void setRnrovrdMSsnNoNameRejOvrd(String rnrovrdMSsnNoNameRejOvrd) {
        this.rnrovrdMSsnNoNameRejOvrd = rnrovrdMSsnNoNameRejOvrd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRnrovrdMSsnNoNameRejOvrd(String rnrovrdMSsnNoNameRejOvrd) {
        this.rnrovrdMSsnNoNameRejOvrd = rnrovrdMSsnNoNameRejOvrd;
        return this;
    }

    /**
     * K          Parent 2 SSN all zeroes and reported as tax filer
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdK")
    public String getRcrapp3RejectOvrdK() {
        return rcrapp3RejectOvrdK;
    }

    /**
     * K          Parent 2 SSN all zeroes and reported as tax filer
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdK")
    public void setRcrapp3RejectOvrdK(String rcrapp3RejectOvrdK) {
        this.rcrapp3RejectOvrdK = rcrapp3RejectOvrdK;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrdK(String rcrapp3RejectOvrdK) {
        this.rcrapp3RejectOvrdK = rcrapp3RejectOvrdK;
        return this;
    }

    /**
     * N          Student's first or last name is blank
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdN")
    public String getRcrapp3RejectOvrdN() {
        return rcrapp3RejectOvrdN;
    }

    /**
     * N          Student's first or last name is blank
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdN")
    public void setRcrapp3RejectOvrdN(String rcrapp3RejectOvrdN) {
        this.rcrapp3RejectOvrdN = rcrapp3RejectOvrdN;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrdN(String rcrapp3RejectOvrdN) {
        this.rcrapp3RejectOvrdN = rcrapp3RejectOvrdN;
        return this;
    }

    /**
     * Number of Family Members
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_FAM_MEMB
     * 
     */
    @JsonProperty("aParFamMemb")
    public Double getaParFamMemb() {
        return aParFamMemb;
    }

    /**
     * Number of Family Members
     * <p>
     * Lineage reference object : RCRESAR_A_PAR_FAM_MEMB
     * 
     */
    @JsonProperty("aParFamMemb")
    public void setaParFamMemb(Double aParFamMemb) {
        this.aParFamMemb = aParFamMemb;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaParFamMemb(Double aParFamMemb) {
        this.aParFamMemb = aParFamMemb;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_A_INC_FR_WRK
     * 
     */
    @JsonProperty("aIncFrWrk")
    public Double getaIncFrWrk() {
        return aIncFrWrk;
    }

    /**
     * Lineage reference object : RCRESAR_A_INC_FR_WRK
     * 
     */
    @JsonProperty("aIncFrWrk")
    public void setaIncFrWrk(Double aIncFrWrk) {
        this.aIncFrWrk = aIncFrWrk;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaIncFrWrk(Double aIncFrWrk) {
        this.aIncFrWrk = aIncFrWrk;
        return this;
    }

    /**
     * Transaction Data Source
     * <p>
     * Lineage reference object : RCRESAR_MDE_SITE_CD
     * 
     */
    @JsonProperty("mdeSiteCd")
    public String getMdeSiteCd() {
        return mdeSiteCd;
    }

    /**
     * Transaction Data Source
     * <p>
     * Lineage reference object : RCRESAR_MDE_SITE_CD
     * 
     */
    @JsonProperty("mdeSiteCd")
    public void setMdeSiteCd(String mdeSiteCd) {
        this.mdeSiteCd = mdeSiteCd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withMdeSiteCd(String mdeSiteCd) {
        this.mdeSiteCd = mdeSiteCd;
        return this;
    }

    /**
     * CPS Untaxed Income Total
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp2CParUntaxInc")
    public Double getRcrapp2CParUntaxInc() {
        return rcrapp2CParUntaxInc;
    }

    /**
     * CPS Untaxed Income Total
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp2CParUntaxInc")
    public void setRcrapp2CParUntaxInc(Double rcrapp2CParUntaxInc) {
        this.rcrapp2CParUntaxInc = rcrapp2CParUntaxInc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp2CParUntaxInc(Double rcrapp2CParUntaxInc) {
        this.rcrapp2CParUntaxInc = rcrapp2CParUntaxInc;
        return this;
    }

    /**
     * W         Questionable number of family members
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdW")
    public String getRcrapp3RejectOvrdW() {
        return rcrapp3RejectOvrdW;
    }

    /**
     * W         Questionable number of family members
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdW")
    public void setRcrapp3RejectOvrdW(String rcrapp3RejectOvrdW) {
        this.rcrapp3RejectOvrdW = rcrapp3RejectOvrdW;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrdW(String rcrapp3RejectOvrdW) {
        this.rcrapp3RejectOvrdW = rcrapp3RejectOvrdW;
        return this;
    }

    /**
     * Correction Applied Transaction Number
     * <p>
     * Lineage reference object : RCRESAR_CORR_APPL
     * 
     */
    @JsonProperty("corrAppl")
    public String getCorrAppl() {
        return corrAppl;
    }

    /**
     * Correction Applied Transaction Number
     * <p>
     * Lineage reference object : RCRESAR_CORR_APPL
     * 
     */
    @JsonProperty("corrAppl")
    public void setCorrAppl(String corrAppl) {
        this.corrAppl = corrAppl;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withCorrAppl(String corrAppl) {
        this.corrAppl = corrAppl;
        return this;
    }

    /**
     * Born Before
     * <p>
     * Lineage reference object : RCRESAR_A_BORN_BEFORE_IND
     * 
     */
    @JsonProperty("aBornBeforeInd")
    public String getaBornBeforeInd() {
        return aBornBeforeInd;
    }

    /**
     * Born Before
     * <p>
     * Lineage reference object : RCRESAR_A_BORN_BEFORE_IND
     * 
     */
    @JsonProperty("aBornBeforeInd")
    public void setaBornBeforeInd(String aBornBeforeInd) {
        this.aBornBeforeInd = aBornBeforeInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaBornBeforeInd(String aBornBeforeInd) {
        this.aBornBeforeInd = aBornBeforeInd;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_A_S_ASSET_THRESH_EXCD
     * 
     */
    @JsonProperty("aSAssetThreshExcd")
    public String getaSAssetThreshExcd() {
        return aSAssetThreshExcd;
    }

    /**
     * Lineage reference object : RCRESAR_A_S_ASSET_THRESH_EXCD
     * 
     */
    @JsonProperty("aSAssetThreshExcd")
    public void setaSAssetThreshExcd(String aSAssetThreshExcd) {
        this.aSAssetThreshExcd = aSAssetThreshExcd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaSAssetThreshExcd(String aSAssetThreshExcd) {
        this.aSAssetThreshExcd = aSAssetThreshExcd;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_A_S_FIT
     * 
     */
    @JsonProperty("aSFit")
    public Double getaSFit() {
        return aSFit;
    }

    /**
     * Lineage reference object : RCRESAR_A_S_FIT
     * 
     */
    @JsonProperty("aSFit")
    public void setaSFit(Double aSFit) {
        this.aSFit = aSFit;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaSFit(Double aSFit) {
        this.aSFit = aSFit;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_10_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc10MthCalc")
    public Double getAlt2Fc10MthCalc() {
        return alt2Fc10MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_10_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc10MthCalc")
    public void setAlt2Fc10MthCalc(Double alt2Fc10MthCalc) {
        this.alt2Fc10MthCalc = alt2Fc10MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc10MthCalc(Double alt2Fc10MthCalc) {
        this.alt2Fc10MthCalc = alt2Fc10MthCalc;
        return this;
    }

    /**
     * Special Circumstance Performed
     * <p>
     * Lineage reference object : RCRESAR_SPEC_CIRCUM_FLG
     * 
     */
    @JsonProperty("specCircumFlg")
    public String getSpecCircumFlg() {
        return specCircumFlg;
    }

    /**
     * Special Circumstance Performed
     * <p>
     * Lineage reference object : RCRESAR_SPEC_CIRCUM_FLG
     * 
     */
    @JsonProperty("specCircumFlg")
    public void setSpecCircumFlg(String specCircumFlg) {
        this.specCircumFlg = specCircumFlg;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withSpecCircumFlg(String specCircumFlg) {
        this.specCircumFlg = specCircumFlg;
        return this;
    }

    /**
     * B          Independent status in question because of student's age
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdB")
    public String getRcrapp3RejectOvrdB() {
        return rcrapp3RejectOvrdB;
    }

    /**
     * B          Independent status in question because of student's age
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdB")
    public void setRcrapp3RejectOvrdB(String rcrapp3RejectOvrdB) {
        this.rcrapp3RejectOvrdB = rcrapp3RejectOvrdB;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrdB(String rcrapp3RejectOvrdB) {
        this.rcrapp3RejectOvrdB = rcrapp3RejectOvrdB;
        return this;
    }

    /**
     * A          Year of Birth between 1900 - 1945
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdA")
    public String getRcrapp3RejectOvrdA() {
        return rcrapp3RejectOvrdA;
    }

    /**
     * A          Year of Birth between 1900 - 1945
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdA")
    public void setRcrapp3RejectOvrdA(String rcrapp3RejectOvrdA) {
        this.rcrapp3RejectOvrdA = rcrapp3RejectOvrdA;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrdA(String rcrapp3RejectOvrdA) {
        this.rcrapp3RejectOvrdA = rcrapp3RejectOvrdA;
        return this;
    }

    /**
     * C          Parent or independent student taxes paid > 0 and >= fixed percent of AGI, but < AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdC")
    public String getRcrapp3RejectOvrdC() {
        return rcrapp3RejectOvrdC;
    }

    /**
     * C          Parent or independent student taxes paid > 0 and >= fixed percent of AGI, but < AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdC")
    public void setRcrapp3RejectOvrdC(String rcrapp3RejectOvrdC) {
        this.rcrapp3RejectOvrdC = rcrapp3RejectOvrdC;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrdC(String rcrapp3RejectOvrdC) {
        this.rcrapp3RejectOvrdC = rcrapp3RejectOvrdC;
        return this;
    }

    @JsonProperty("rcrapp2CUntaxInc")
    public Double getRcrapp2CUntaxInc() {
        return rcrapp2CUntaxInc;
    }

    @JsonProperty("rcrapp2CUntaxInc")
    public void setRcrapp2CUntaxInc(Double rcrapp2CUntaxInc) {
        this.rcrapp2CUntaxInc = rcrapp2CUntaxInc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp2CUntaxInc(Double rcrapp2CUntaxInc) {
        this.rcrapp2CUntaxInc = rcrapp2CUntaxInc;
        return this;
    }

    /**
     * Source of Correction
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SourceCorrection")
    public String getRcrapp4SourceCorrection() {
        return rcrapp4SourceCorrection;
    }

    /**
     * Source of Correction
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SourceCorrection")
    public void setRcrapp4SourceCorrection(String rcrapp4SourceCorrection) {
        this.rcrapp4SourceCorrection = rcrapp4SourceCorrection;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp4SourceCorrection(String rcrapp4SourceCorrection) {
        this.rcrapp4SourceCorrection = rcrapp4SourceCorrection;
        return this;
    }

    /**
     * G          Dependent student taxes paid > 0 and >= fixed percent of AGI, but < AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdG")
    public String getRcrapp3RejectOvrdG() {
        return rcrapp3RejectOvrdG;
    }

    /**
     * G          Dependent student taxes paid > 0 and >= fixed percent of AGI, but < AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdG")
    public void setRcrapp3RejectOvrdG(String rcrapp3RejectOvrdG) {
        this.rcrapp3RejectOvrdG = rcrapp3RejectOvrdG;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrdG(String rcrapp3RejectOvrdG) {
        this.rcrapp3RejectOvrdG = rcrapp3RejectOvrdG;
        return this;
    }

    /**
     * J          Parent 1 SSN all zeroes and reported as tax filer
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdJ")
    public String getRcrapp3RejectOvrdJ() {
        return rcrapp3RejectOvrdJ;
    }

    /**
     * J          Parent 1 SSN all zeroes and reported as tax filer
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrdJ")
    public void setRcrapp3RejectOvrdJ(String rcrapp3RejectOvrdJ) {
        this.rcrapp3RejectOvrdJ = rcrapp3RejectOvrdJ;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrdJ(String rcrapp3RejectOvrdJ) {
        this.rcrapp3RejectOvrdJ = rcrapp3RejectOvrdJ;
        return this;
    }

    /**
     * Month 7
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_07_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc07MthCalc")
    public Double getAlt1Fc07MthCalc() {
        return alt1Fc07MthCalc;
    }

    /**
     * Month 7
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_07_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc07MthCalc")
    public void setAlt1Fc07MthCalc(Double alt1Fc07MthCalc) {
        this.alt1Fc07MthCalc = alt1Fc07MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc07MthCalc(Double alt1Fc07MthCalc) {
        this.alt1Fc07MthCalc = alt1Fc07MthCalc;
        return this;
    }

    /**
     * EFC Change Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4EfcChangeInd")
    public String getRcrapp4EfcChangeInd() {
        return rcrapp4EfcChangeInd;
    }

    /**
     * EFC Change Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4EfcChangeInd")
    public void setRcrapp4EfcChangeInd(String rcrapp4EfcChangeInd) {
        this.rcrapp4EfcChangeInd = rcrapp4EfcChangeInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp4EfcChangeInd(String rcrapp4EfcChangeInd) {
        this.rcrapp4EfcChangeInd = rcrapp4EfcChangeInd;
        return this;
    }

    /**
     * Month 10
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_10_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc10MthCalc")
    public Double getAlt1Fc10MthCalc() {
        return alt1Fc10MthCalc;
    }

    /**
     * Month 10
     * <p>
     * Lineage reference object : RCRESAR_ALT_1_FC_10_MTH_CALC
     * 
     */
    @JsonProperty("alt1Fc10MthCalc")
    public void setAlt1Fc10MthCalc(Double alt1Fc10MthCalc) {
        this.alt1Fc10MthCalc = alt1Fc10MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt1Fc10MthCalc(Double alt1Fc10MthCalc) {
        this.alt1Fc10MthCalc = alt1Fc10MthCalc;
        return this;
    }

    /**
     * Professional Judgement
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAdjEfcCalcReq")
    public String getDisplayAdjEfcCalcReq() {
        return displayAdjEfcCalcReq;
    }

    /**
     * Professional Judgement
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAdjEfcCalcReq")
    public void setDisplayAdjEfcCalcReq(String displayAdjEfcCalcReq) {
        this.displayAdjEfcCalcReq = displayAdjEfcCalcReq;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withDisplayAdjEfcCalcReq(String displayAdjEfcCalcReq) {
        this.displayAdjEfcCalcReq = displayAdjEfcCalcReq;
        return this;
    }

    /**
     * Duplicate SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DupSsnInd")
    public String getRcrapp4DupSsnInd() {
        return rcrapp4DupSsnInd;
    }

    /**
     * Duplicate SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DupSsnInd")
    public void setRcrapp4DupSsnInd(String rcrapp4DupSsnInd) {
        this.rcrapp4DupSsnInd = rcrapp4DupSsnInd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp4DupSsnInd(String rcrapp4DupSsnInd) {
        this.rcrapp4DupSsnInd = rcrapp4DupSsnInd;
        return this;
    }

    /**
     *  3          Student's taxes paid > 0 and >= AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd3")
    public String getRcrapp3RejectOvrd3() {
        return rcrapp3RejectOvrd3;
    }

    /**
     *  3          Student's taxes paid > 0 and >= AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3RejectOvrd3")
    public void setRcrapp3RejectOvrd3(String rcrapp3RejectOvrd3) {
        this.rcrapp3RejectOvrd3 = rcrapp3RejectOvrd3;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp3RejectOvrd3(String rcrapp3RejectOvrd3) {
        this.rcrapp3RejectOvrd3 = rcrapp3RejectOvrd3;
        return this;
    }

    /**
     * Simplified Needs Test
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp2PellAnlyType")
    public String getRcrapp2PellAnlyType() {
        return rcrapp2PellAnlyType;
    }

    /**
     * Simplified Needs Test
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp2PellAnlyType")
    public void setRcrapp2PellAnlyType(String rcrapp2PellAnlyType) {
        this.rcrapp2PellAnlyType = rcrapp2PellAnlyType;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRcrapp2PellAnlyType(String rcrapp2PellAnlyType) {
        this.rcrapp2PellAnlyType = rcrapp2PellAnlyType;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_03_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc03MthCalc")
    public Double getAlt2Fc03MthCalc() {
        return alt2Fc03MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_03_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc03MthCalc")
    public void setAlt2Fc03MthCalc(Double alt2Fc03MthCalc) {
        this.alt2Fc03MthCalc = alt2Fc03MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc03MthCalc(Double alt2Fc03MthCalc) {
        this.alt2Fc03MthCalc = alt2Fc03MthCalc;
        return this;
    }

    /**
     * VA Status
     * <p>
     * Lineage reference object : RCRESAR_A_VA_STATUS
     * 
     */
    @JsonProperty("aVaStatus")
    public String getaVaStatus() {
        return aVaStatus;
    }

    /**
     * VA Status
     * <p>
     * Lineage reference object : RCRESAR_A_VA_STATUS
     * 
     */
    @JsonProperty("aVaStatus")
    public void setaVaStatus(String aVaStatus) {
        this.aVaStatus = aVaStatus;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaVaStatus(String aVaStatus) {
        this.aVaStatus = aVaStatus;
        return this;
    }

    /**
     *  2007 Taxes Paid
     * <p>
     * Lineage reference object : RCRESAR_A_P_FIT
     * 
     */
    @JsonProperty("aPFit")
    public Double getaPFit() {
        return aPFit;
    }

    /**
     *  2007 Taxes Paid
     * <p>
     * Lineage reference object : RCRESAR_A_P_FIT
     * 
     */
    @JsonProperty("aPFit")
    public void setaPFit(Double aPFit) {
        this.aPFit = aPFit;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withaPFit(Double aPFit) {
        this.aPFit = aPFit;
        return this;
    }

    /**
     * R          Student's SSN match, but no Date of Birth match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdSsnNoDobRejOvrd")
    public String getRnrovrdSsnNoDobRejOvrd() {
        return rnrovrdSsnNoDobRejOvrd;
    }

    /**
     * R          Student's SSN match, but no Date of Birth match
     * <p>
     * 
     * 
     */
    @JsonProperty("rnrovrdSsnNoDobRejOvrd")
    public void setRnrovrdSsnNoDobRejOvrd(String rnrovrdSsnNoDobRejOvrd) {
        this.rnrovrdSsnNoDobRejOvrd = rnrovrdSsnNoDobRejOvrd;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withRnrovrdSsnNoDobRejOvrd(String rnrovrdSsnNoDobRejOvrd) {
        this.rnrovrdSsnNoDobRejOvrd = rnrovrdSsnNoDobRejOvrd;
        return this;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_07_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc07MthCalc")
    public Double getAlt2Fc07MthCalc() {
        return alt2Fc07MthCalc;
    }

    /**
     * Lineage reference object : RCRESAR_ALT_2_FC_07_MTH_CALC
     * 
     */
    @JsonProperty("alt2Fc07MthCalc")
    public void setAlt2Fc07MthCalc(Double alt2Fc07MthCalc) {
        this.alt2Fc07MthCalc = alt2Fc07MthCalc;
    }

    public _20202021MiscellaneousResultsInquiry100GetResponse withAlt2Fc07MthCalc(Double alt2Fc07MthCalc) {
        this.alt2Fc07MthCalc = alt2Fc07MthCalc;
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

    public _20202021MiscellaneousResultsInquiry100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20202021MiscellaneousResultsInquiry100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aUsInc");
        sb.append('=');
        sb.append(((this.aUsInc == null)?"<null>":this.aUsInc));
        sb.append(',');
        sb.append("reProcReaCd");
        sb.append('=');
        sb.append(((this.reProcReaCd == null)?"<null>":this.reProcReaCd));
        sb.append(',');
        sb.append("tranReceiptDate");
        sb.append('=');
        sb.append(((this.tranReceiptDate == null)?"<null>":this.tranReceiptDate));
        sb.append(',');
        sb.append("aPAddlFinancial");
        sb.append('=');
        sb.append(((this.aPAddlFinancial == null)?"<null>":this.aPAddlFinancial));
        sb.append(',');
        sb.append("aFathSsn");
        sb.append('=');
        sb.append(((this.aFathSsn == null)?"<null>":this.aFathSsn));
        sb.append(',');
        sb.append("alt2Fc11MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc11MthCalc == null)?"<null>":this.alt2Fc11MthCalc));
        sb.append(',');
        sb.append("aSAddlFinancial");
        sb.append('=');
        sb.append(((this.aSAddlFinancial == null)?"<null>":this.aSAddlFinancial));
        sb.append(',');
        sb.append("agencyInd");
        sb.append('=');
        sb.append(((this.agencyInd == null)?"<null>":this.agencyInd));
        sb.append(',');
        sb.append("alt1Fc11MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc11MthCalc == null)?"<null>":this.alt1Fc11MthCalc));
        sb.append(',');
        sb.append("aParUsInc");
        sb.append('=');
        sb.append(((this.aParUsInc == null)?"<null>":this.aParUsInc));
        sb.append(',');
        sb.append("aParNoInColl");
        sb.append('=');
        sb.append(((this.aParNoInColl == null)?"<null>":this.aParNoInColl));
        sb.append(',');
        sb.append("edeEtiInd");
        sb.append('=');
        sb.append(((this.edeEtiInd == null)?"<null>":this.edeEtiInd));
        sb.append(',');
        sb.append("signatureRejEfc");
        sb.append('=');
        sb.append(((this.signatureRejEfc == null)?"<null>":this.signatureRejEfc));
        sb.append(',');
        sb.append("nameSsnChgInd");
        sb.append('=');
        sb.append(((this.nameSsnChgInd == null)?"<null>":this.nameSsnChgInd));
        sb.append(',');
        sb.append("alt2Fc02MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc02MthCalc == null)?"<null>":this.alt2Fc02MthCalc));
        sb.append(',');
        sb.append("alt2Fc04MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc04MthCalc == null)?"<null>":this.alt2Fc04MthCalc));
        sb.append(',');
        sb.append("alt2Fc06MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc06MthCalc == null)?"<null>":this.alt2Fc06MthCalc));
        sb.append(',');
        sb.append("aSDependants");
        sb.append('=');
        sb.append(((this.aSDependants == null)?"<null>":this.aSDependants));
        sb.append(',');
        sb.append("alt2Fc08MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc08MthCalc == null)?"<null>":this.alt2Fc08MthCalc));
        sb.append(',');
        sb.append("rcrapp3RejectOvrd20");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrd20 == null)?"<null>":this.rcrapp3RejectOvrd20));
        sb.append(',');
        sb.append("aMarried");
        sb.append('=');
        sb.append(((this.aMarried == null)?"<null>":this.aMarried));
        sb.append(',');
        sb.append("commCode01");
        sb.append('=');
        sb.append(((this.commCode01 == null)?"<null>":this.commCode01));
        sb.append(',');
        sb.append("commCode02");
        sb.append('=');
        sb.append(((this.commCode02 == null)?"<null>":this.commCode02));
        sb.append(',');
        sb.append("edeInstInd");
        sb.append('=');
        sb.append(((this.edeInstInd == null)?"<null>":this.edeInstInd));
        sb.append(',');
        sb.append("rcrapp3FaaTitleIvCode");
        sb.append('=');
        sb.append(((this.rcrapp3FaaTitleIvCode == null)?"<null>":this.rcrapp3FaaTitleIvCode));
        sb.append(',');
        sb.append("rcrapp3RejectOvrd21");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrd21 == null)?"<null>":this.rcrapp3RejectOvrd21));
        sb.append(',');
        sb.append("commCode05");
        sb.append('=');
        sb.append(((this.commCode05 == null)?"<null>":this.commCode05));
        sb.append(',');
        sb.append("commCode06");
        sb.append('=');
        sb.append(((this.commCode06 == null)?"<null>":this.commCode06));
        sb.append(',');
        sb.append("commCode03");
        sb.append('=');
        sb.append(((this.commCode03 == null)?"<null>":this.commCode03));
        sb.append(',');
        sb.append("computeBatchNo");
        sb.append('=');
        sb.append(((this.computeBatchNo == null)?"<null>":this.computeBatchNo));
        sb.append(',');
        sb.append("aPAssetThreshExcd");
        sb.append('=');
        sb.append(((this.aPAssetThreshExcd == null)?"<null>":this.aPAssetThreshExcd));
        sb.append(',');
        sb.append("commCode04");
        sb.append('=');
        sb.append(((this.commCode04 == null)?"<null>":this.commCode04));
        sb.append(',');
        sb.append("rnrovrdMSsnNoDobRejOvrd");
        sb.append('=');
        sb.append(((this.rnrovrdMSsnNoDobRejOvrd == null)?"<null>":this.rnrovrdMSsnNoDobRejOvrd));
        sb.append(',');
        sb.append("aTaxFiledInd");
        sb.append('=');
        sb.append(((this.aTaxFiledInd == null)?"<null>":this.aTaxFiledInd));
        sb.append(',');
        sb.append("aFamMemb");
        sb.append('=');
        sb.append(((this.aFamMemb == null)?"<null>":this.aFamMemb));
        sb.append(',');
        sb.append("aNoInColl");
        sb.append('=');
        sb.append(((this.aNoInColl == null)?"<null>":this.aNoInColl));
        sb.append(',');
        sb.append("rtvicmtDesc15");
        sb.append('=');
        sb.append(((this.rtvicmtDesc15 == null)?"<null>":this.rtvicmtDesc15));
        sb.append(',');
        sb.append("rtvicmtDesc16");
        sb.append('=');
        sb.append(((this.rtvicmtDesc16 == null)?"<null>":this.rtvicmtDesc16));
        sb.append(',');
        sb.append("rtvicmtDesc13");
        sb.append('=');
        sb.append(((this.rtvicmtDesc13 == null)?"<null>":this.rtvicmtDesc13));
        sb.append(',');
        sb.append("rtvicmtDesc14");
        sb.append('=');
        sb.append(((this.rtvicmtDesc14 == null)?"<null>":this.rtvicmtDesc14));
        sb.append(',');
        sb.append("rtvicmtDesc19");
        sb.append('=');
        sb.append(((this.rtvicmtDesc19 == null)?"<null>":this.rtvicmtDesc19));
        sb.append(',');
        sb.append("rtvicmtDesc17");
        sb.append('=');
        sb.append(((this.rtvicmtDesc17 == null)?"<null>":this.rtvicmtDesc17));
        sb.append(',');
        sb.append("rtvicmtDesc18");
        sb.append('=');
        sb.append(((this.rtvicmtDesc18 == null)?"<null>":this.rtvicmtDesc18));
        sb.append(',');
        sb.append("rtvicmtDesc11");
        sb.append('=');
        sb.append(((this.rtvicmtDesc11 == null)?"<null>":this.rtvicmtDesc11));
        sb.append(',');
        sb.append("rtvicmtDesc12");
        sb.append('=');
        sb.append(((this.rtvicmtDesc12 == null)?"<null>":this.rtvicmtDesc12));
        sb.append(',');
        sb.append("rtvicmtDesc10");
        sb.append('=');
        sb.append(((this.rtvicmtDesc10 == null)?"<null>":this.rtvicmtDesc10));
        sb.append(',');
        sb.append("alt2Fc01MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc01MthCalc == null)?"<null>":this.alt2Fc01MthCalc));
        sb.append(',');
        sb.append("commCode12");
        sb.append('=');
        sb.append(((this.commCode12 == null)?"<null>":this.commCode12));
        sb.append(',');
        sb.append("commCode13");
        sb.append('=');
        sb.append(((this.commCode13 == null)?"<null>":this.commCode13));
        sb.append(',');
        sb.append("commCode10");
        sb.append('=');
        sb.append(((this.commCode10 == null)?"<null>":this.commCode10));
        sb.append(',');
        sb.append("secEfcType");
        sb.append('=');
        sb.append(((this.secEfcType == null)?"<null>":this.secEfcType));
        sb.append(',');
        sb.append("rcrapp4AddressChgFlag");
        sb.append('=');
        sb.append(((this.rcrapp4AddressChgFlag == null)?"<null>":this.rcrapp4AddressChgFlag));
        sb.append(',');
        sb.append("commCode11");
        sb.append('=');
        sb.append(((this.commCode11 == null)?"<null>":this.commCode11));
        sb.append(',');
        sb.append("autoZeroEfcFlag");
        sb.append('=');
        sb.append(((this.autoZeroEfcFlag == null)?"<null>":this.autoZeroEfcFlag));
        sb.append(',');
        sb.append("commCode16");
        sb.append('=');
        sb.append(((this.commCode16 == null)?"<null>":this.commCode16));
        sb.append(',');
        sb.append("rcrapp4SarCChangeFlag");
        sb.append('=');
        sb.append(((this.rcrapp4SarCChangeFlag == null)?"<null>":this.rcrapp4SarCChangeFlag));
        sb.append(',');
        sb.append("commCode17");
        sb.append('=');
        sb.append(((this.commCode17 == null)?"<null>":this.commCode17));
        sb.append(',');
        sb.append("commCode14");
        sb.append('=');
        sb.append(((this.commCode14 == null)?"<null>":this.commCode14));
        sb.append(',');
        sb.append("commCode15");
        sb.append('=');
        sb.append(((this.commCode15 == null)?"<null>":this.commCode15));
        sb.append(',');
        sb.append("aCitzInd");
        sb.append('=');
        sb.append(((this.aCitzInd == null)?"<null>":this.aCitzInd));
        sb.append(',');
        sb.append("aHaveChildren");
        sb.append('=');
        sb.append(((this.aHaveChildren == null)?"<null>":this.aHaveChildren));
        sb.append(',');
        sb.append("alt1Fc05MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc05MthCalc == null)?"<null>":this.alt1Fc05MthCalc));
        sb.append(',');
        sb.append("alt1Fc09MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc09MthCalc == null)?"<null>":this.alt1Fc09MthCalc));
        sb.append(',');
        sb.append("rnrovrdFSsnNoDobRejOvrd");
        sb.append('=');
        sb.append(((this.rnrovrdFSsnNoDobRejOvrd == null)?"<null>":this.rnrovrdFSsnNoDobRejOvrd));
        sb.append(',');
        sb.append("rcrapp2CAddlFinancial");
        sb.append('=');
        sb.append(((this.rcrapp2CAddlFinancial == null)?"<null>":this.rcrapp2CAddlFinancial));
        sb.append(',');
        sb.append("alt1Fc12MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc12MthCalc == null)?"<null>":this.alt1Fc12MthCalc));
        sb.append(',');
        sb.append("alt2Fc05MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc05MthCalc == null)?"<null>":this.alt2Fc05MthCalc));
        sb.append(',');
        sb.append("aMrtlStatusInd");
        sb.append('=');
        sb.append(((this.aMrtlStatusInd == null)?"<null>":this.aMrtlStatusInd));
        sb.append(',');
        sb.append("commCode09");
        sb.append('=');
        sb.append(((this.commCode09 == null)?"<null>":this.commCode09));
        sb.append(',');
        sb.append("aMothSsn");
        sb.append('=');
        sb.append(((this.aMothSsn == null)?"<null>":this.aMothSsn));
        sb.append(',');
        sb.append("commCode07");
        sb.append('=');
        sb.append(((this.commCode07 == null)?"<null>":this.commCode07));
        sb.append(',');
        sb.append("alt2Fc12MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc12MthCalc == null)?"<null>":this.alt2Fc12MthCalc));
        sb.append(',');
        sb.append("commCode08");
        sb.append('=');
        sb.append(((this.commCode08 == null)?"<null>":this.commCode08));
        sb.append(',');
        sb.append("rejStatusChangeInd");
        sb.append('=');
        sb.append(((this.rejStatusChangeInd == null)?"<null>":this.rejStatusChangeInd));
        sb.append(',');
        sb.append("rtvicmtDesc20");
        sb.append('=');
        sb.append(((this.rtvicmtDesc20 == null)?"<null>":this.rtvicmtDesc20));
        sb.append(',');
        sb.append("alt2Fc09MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc09MthCalc == null)?"<null>":this.alt2Fc09MthCalc));
        sb.append(',');
        sb.append("rcrapp3AssumptOvrd2");
        sb.append('=');
        sb.append(((this.rcrapp3AssumptOvrd2 == null)?"<null>":this.rcrapp3AssumptOvrd2));
        sb.append(',');
        sb.append("rcrapp3AssumptOvrd1");
        sb.append('=');
        sb.append(((this.rcrapp3AssumptOvrd1 == null)?"<null>":this.rcrapp3AssumptOvrd1));
        sb.append(',');
        sb.append("pellElgbl");
        sb.append('=');
        sb.append(((this.pellElgbl == null)?"<null>":this.pellElgbl));
        sb.append(',');
        sb.append("aMothIncFrWrk");
        sb.append('=');
        sb.append(((this.aMothIncFrWrk == null)?"<null>":this.aMothIncFrWrk));
        sb.append(',');
        sb.append("aSpsIncFrWrk");
        sb.append('=');
        sb.append(((this.aSpsIncFrWrk == null)?"<null>":this.aSpsIncFrWrk));
        sb.append(',');
        sb.append("alt1Fc01MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc01MthCalc == null)?"<null>":this.alt1Fc01MthCalc));
        sb.append(',');
        sb.append("commCode20");
        sb.append('=');
        sb.append(((this.commCode20 == null)?"<null>":this.commCode20));
        sb.append(',');
        sb.append("recType");
        sb.append('=');
        sb.append(((this.recType == null)?"<null>":this.recType));
        sb.append(',');
        sb.append("alt1Fc02MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc02MthCalc == null)?"<null>":this.alt1Fc02MthCalc));
        sb.append(',');
        sb.append("alt1Fc03MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc03MthCalc == null)?"<null>":this.alt1Fc03MthCalc));
        sb.append(',');
        sb.append("etiDestCode");
        sb.append('=');
        sb.append(((this.etiDestCode == null)?"<null>":this.etiDestCode));
        sb.append(',');
        sb.append("aParMrtlStatusInd");
        sb.append('=');
        sb.append(((this.aParMrtlStatusInd == null)?"<null>":this.aParMrtlStatusInd));
        sb.append(',');
        sb.append("commCode18");
        sb.append('=');
        sb.append(((this.commCode18 == null)?"<null>":this.commCode18));
        sb.append(',');
        sb.append("commCode19");
        sb.append('=');
        sb.append(((this.commCode19 == null)?"<null>":this.commCode19));
        sb.append(',');
        sb.append("rcrapp3AssumptOvrd4");
        sb.append('=');
        sb.append(((this.rcrapp3AssumptOvrd4 == null)?"<null>":this.rcrapp3AssumptOvrd4));
        sb.append(',');
        sb.append("rcrapp1FedCollChoice1");
        sb.append('=');
        sb.append(((this.rcrapp1FedCollChoice1 == null)?"<null>":this.rcrapp1FedCollChoice1));
        sb.append(',');
        sb.append("rcrapp3AssumptOvrd3");
        sb.append('=');
        sb.append(((this.rcrapp3AssumptOvrd3 == null)?"<null>":this.rcrapp3AssumptOvrd3));
        sb.append(',');
        sb.append("rcrapp3AssumptOvrd6");
        sb.append('=');
        sb.append(((this.rcrapp3AssumptOvrd6 == null)?"<null>":this.rcrapp3AssumptOvrd6));
        sb.append(',');
        sb.append("rnrovrdSsnNoNameRejOvrd");
        sb.append('=');
        sb.append(((this.rnrovrdSsnNoNameRejOvrd == null)?"<null>":this.rnrovrdSsnNoNameRejOvrd));
        sb.append(',');
        sb.append("rcrapp3AssumptOvrd5");
        sb.append('=');
        sb.append(((this.rcrapp3AssumptOvrd5 == null)?"<null>":this.rcrapp3AssumptOvrd5));
        sb.append(',');
        sb.append("displayFaaDepOverride");
        sb.append('=');
        sb.append(((this.displayFaaDepOverride == null)?"<null>":this.displayFaaDepOverride));
        sb.append(',');
        sb.append("rcrapp3RejectOvrd12");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrd12 == null)?"<null>":this.rcrapp3RejectOvrd12));
        sb.append(',');
        sb.append("alt1Fc06MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc06MthCalc == null)?"<null>":this.alt1Fc06MthCalc));
        sb.append(',');
        sb.append("verifChangeInd");
        sb.append('=');
        sb.append(((this.verifChangeInd == null)?"<null>":this.verifChangeInd));
        sb.append(',');
        sb.append("rcrapp2CParAddlFinancial");
        sb.append('=');
        sb.append(((this.rcrapp2CParAddlFinancial == null)?"<null>":this.rcrapp2CParAddlFinancial));
        sb.append(',');
        sb.append("rcrapp4VerifNum");
        sb.append('=');
        sb.append(((this.rcrapp4VerifNum == null)?"<null>":this.rcrapp4VerifNum));
        sb.append(',');
        sb.append("alt1Fc08MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc08MthCalc == null)?"<null>":this.alt1Fc08MthCalc));
        sb.append(',');
        sb.append("alt1Fc04MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc04MthCalc == null)?"<null>":this.alt1Fc04MthCalc));
        sb.append(',');
        sb.append("aParTaxFiledInd");
        sb.append('=');
        sb.append(((this.aParTaxFiledInd == null)?"<null>":this.aParTaxFiledInd));
        sb.append(',');
        sb.append("rcrapp4PushIsirFlag");
        sb.append('=');
        sb.append(((this.rcrapp4PushIsirFlag == null)?"<null>":this.rcrapp4PushIsirFlag));
        sb.append(',');
        sb.append("fedHousCde1");
        sb.append('=');
        sb.append(((this.fedHousCde1 == null)?"<null>":this.fedHousCde1));
        sb.append(',');
        sb.append("rtvicmtDesc04");
        sb.append('=');
        sb.append(((this.rtvicmtDesc04 == null)?"<null>":this.rtvicmtDesc04));
        sb.append(',');
        sb.append("rtvicmtDesc05");
        sb.append('=');
        sb.append(((this.rtvicmtDesc05 == null)?"<null>":this.rtvicmtDesc05));
        sb.append(',');
        sb.append("rtvicmtDesc02");
        sb.append('=');
        sb.append(((this.rtvicmtDesc02 == null)?"<null>":this.rtvicmtDesc02));
        sb.append(',');
        sb.append("rtvicmtDesc03");
        sb.append('=');
        sb.append(((this.rtvicmtDesc03 == null)?"<null>":this.rtvicmtDesc03));
        sb.append(',');
        sb.append("rtvicmtDesc08");
        sb.append('=');
        sb.append(((this.rtvicmtDesc08 == null)?"<null>":this.rtvicmtDesc08));
        sb.append(',');
        sb.append("rtvicmtDesc09");
        sb.append('=');
        sb.append(((this.rtvicmtDesc09 == null)?"<null>":this.rtvicmtDesc09));
        sb.append(',');
        sb.append("rtvicmtDesc06");
        sb.append('=');
        sb.append(((this.rtvicmtDesc06 == null)?"<null>":this.rtvicmtDesc06));
        sb.append(',');
        sb.append("rtvicmtDesc07");
        sb.append('=');
        sb.append(((this.rtvicmtDesc07 == null)?"<null>":this.rtvicmtDesc07));
        sb.append(',');
        sb.append("rtvicmtDesc01");
        sb.append('=');
        sb.append(((this.rtvicmtDesc01 == null)?"<null>":this.rtvicmtDesc01));
        sb.append(',');
        sb.append("rnrovrdFSsnNoNameRejOvrd");
        sb.append('=');
        sb.append(((this.rnrovrdFSsnNoNameRejOvrd == null)?"<null>":this.rnrovrdFSsnNoNameRejOvrd));
        sb.append(',');
        sb.append("aFathIncFrWrk");
        sb.append('=');
        sb.append(((this.aFathIncFrWrk == null)?"<null>":this.aFathIncFrWrk));
        sb.append(',');
        sb.append("rnrovrdMSsnNoNameRejOvrd");
        sb.append('=');
        sb.append(((this.rnrovrdMSsnNoNameRejOvrd == null)?"<null>":this.rnrovrdMSsnNoNameRejOvrd));
        sb.append(',');
        sb.append("rcrapp3RejectOvrdK");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrdK == null)?"<null>":this.rcrapp3RejectOvrdK));
        sb.append(',');
        sb.append("rcrapp3RejectOvrdN");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrdN == null)?"<null>":this.rcrapp3RejectOvrdN));
        sb.append(',');
        sb.append("aParFamMemb");
        sb.append('=');
        sb.append(((this.aParFamMemb == null)?"<null>":this.aParFamMemb));
        sb.append(',');
        sb.append("aIncFrWrk");
        sb.append('=');
        sb.append(((this.aIncFrWrk == null)?"<null>":this.aIncFrWrk));
        sb.append(',');
        sb.append("mdeSiteCd");
        sb.append('=');
        sb.append(((this.mdeSiteCd == null)?"<null>":this.mdeSiteCd));
        sb.append(',');
        sb.append("rcrapp2CParUntaxInc");
        sb.append('=');
        sb.append(((this.rcrapp2CParUntaxInc == null)?"<null>":this.rcrapp2CParUntaxInc));
        sb.append(',');
        sb.append("rcrapp3RejectOvrdW");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrdW == null)?"<null>":this.rcrapp3RejectOvrdW));
        sb.append(',');
        sb.append("corrAppl");
        sb.append('=');
        sb.append(((this.corrAppl == null)?"<null>":this.corrAppl));
        sb.append(',');
        sb.append("aBornBeforeInd");
        sb.append('=');
        sb.append(((this.aBornBeforeInd == null)?"<null>":this.aBornBeforeInd));
        sb.append(',');
        sb.append("aSAssetThreshExcd");
        sb.append('=');
        sb.append(((this.aSAssetThreshExcd == null)?"<null>":this.aSAssetThreshExcd));
        sb.append(',');
        sb.append("aSFit");
        sb.append('=');
        sb.append(((this.aSFit == null)?"<null>":this.aSFit));
        sb.append(',');
        sb.append("alt2Fc10MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc10MthCalc == null)?"<null>":this.alt2Fc10MthCalc));
        sb.append(',');
        sb.append("specCircumFlg");
        sb.append('=');
        sb.append(((this.specCircumFlg == null)?"<null>":this.specCircumFlg));
        sb.append(',');
        sb.append("rcrapp3RejectOvrdB");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrdB == null)?"<null>":this.rcrapp3RejectOvrdB));
        sb.append(',');
        sb.append("rcrapp3RejectOvrdA");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrdA == null)?"<null>":this.rcrapp3RejectOvrdA));
        sb.append(',');
        sb.append("rcrapp3RejectOvrdC");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrdC == null)?"<null>":this.rcrapp3RejectOvrdC));
        sb.append(',');
        sb.append("rcrapp2CUntaxInc");
        sb.append('=');
        sb.append(((this.rcrapp2CUntaxInc == null)?"<null>":this.rcrapp2CUntaxInc));
        sb.append(',');
        sb.append("rcrapp4SourceCorrection");
        sb.append('=');
        sb.append(((this.rcrapp4SourceCorrection == null)?"<null>":this.rcrapp4SourceCorrection));
        sb.append(',');
        sb.append("rcrapp3RejectOvrdG");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrdG == null)?"<null>":this.rcrapp3RejectOvrdG));
        sb.append(',');
        sb.append("rcrapp3RejectOvrdJ");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrdJ == null)?"<null>":this.rcrapp3RejectOvrdJ));
        sb.append(',');
        sb.append("alt1Fc07MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc07MthCalc == null)?"<null>":this.alt1Fc07MthCalc));
        sb.append(',');
        sb.append("rcrapp4EfcChangeInd");
        sb.append('=');
        sb.append(((this.rcrapp4EfcChangeInd == null)?"<null>":this.rcrapp4EfcChangeInd));
        sb.append(',');
        sb.append("alt1Fc10MthCalc");
        sb.append('=');
        sb.append(((this.alt1Fc10MthCalc == null)?"<null>":this.alt1Fc10MthCalc));
        sb.append(',');
        sb.append("displayAdjEfcCalcReq");
        sb.append('=');
        sb.append(((this.displayAdjEfcCalcReq == null)?"<null>":this.displayAdjEfcCalcReq));
        sb.append(',');
        sb.append("rcrapp4DupSsnInd");
        sb.append('=');
        sb.append(((this.rcrapp4DupSsnInd == null)?"<null>":this.rcrapp4DupSsnInd));
        sb.append(',');
        sb.append("rcrapp3RejectOvrd3");
        sb.append('=');
        sb.append(((this.rcrapp3RejectOvrd3 == null)?"<null>":this.rcrapp3RejectOvrd3));
        sb.append(',');
        sb.append("rcrapp2PellAnlyType");
        sb.append('=');
        sb.append(((this.rcrapp2PellAnlyType == null)?"<null>":this.rcrapp2PellAnlyType));
        sb.append(',');
        sb.append("alt2Fc03MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc03MthCalc == null)?"<null>":this.alt2Fc03MthCalc));
        sb.append(',');
        sb.append("aVaStatus");
        sb.append('=');
        sb.append(((this.aVaStatus == null)?"<null>":this.aVaStatus));
        sb.append(',');
        sb.append("aPFit");
        sb.append('=');
        sb.append(((this.aPFit == null)?"<null>":this.aPFit));
        sb.append(',');
        sb.append("rnrovrdSsnNoDobRejOvrd");
        sb.append('=');
        sb.append(((this.rnrovrdSsnNoDobRejOvrd == null)?"<null>":this.rnrovrdSsnNoDobRejOvrd));
        sb.append(',');
        sb.append("alt2Fc07MthCalc");
        sb.append('=');
        sb.append(((this.alt2Fc07MthCalc == null)?"<null>":this.alt2Fc07MthCalc));
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
        result = ((result* 31)+((this.aUsInc == null)? 0 :this.aUsInc.hashCode()));
        result = ((result* 31)+((this.reProcReaCd == null)? 0 :this.reProcReaCd.hashCode()));
        result = ((result* 31)+((this.tranReceiptDate == null)? 0 :this.tranReceiptDate.hashCode()));
        result = ((result* 31)+((this.aPAddlFinancial == null)? 0 :this.aPAddlFinancial.hashCode()));
        result = ((result* 31)+((this.aFathSsn == null)? 0 :this.aFathSsn.hashCode()));
        result = ((result* 31)+((this.alt2Fc11MthCalc == null)? 0 :this.alt2Fc11MthCalc.hashCode()));
        result = ((result* 31)+((this.aSAddlFinancial == null)? 0 :this.aSAddlFinancial.hashCode()));
        result = ((result* 31)+((this.agencyInd == null)? 0 :this.agencyInd.hashCode()));
        result = ((result* 31)+((this.alt1Fc11MthCalc == null)? 0 :this.alt1Fc11MthCalc.hashCode()));
        result = ((result* 31)+((this.aParUsInc == null)? 0 :this.aParUsInc.hashCode()));
        result = ((result* 31)+((this.aParNoInColl == null)? 0 :this.aParNoInColl.hashCode()));
        result = ((result* 31)+((this.edeEtiInd == null)? 0 :this.edeEtiInd.hashCode()));
        result = ((result* 31)+((this.signatureRejEfc == null)? 0 :this.signatureRejEfc.hashCode()));
        result = ((result* 31)+((this.nameSsnChgInd == null)? 0 :this.nameSsnChgInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.alt2Fc02MthCalc == null)? 0 :this.alt2Fc02MthCalc.hashCode()));
        result = ((result* 31)+((this.alt2Fc04MthCalc == null)? 0 :this.alt2Fc04MthCalc.hashCode()));
        result = ((result* 31)+((this.alt2Fc06MthCalc == null)? 0 :this.alt2Fc06MthCalc.hashCode()));
        result = ((result* 31)+((this.aSDependants == null)? 0 :this.aSDependants.hashCode()));
        result = ((result* 31)+((this.alt2Fc08MthCalc == null)? 0 :this.alt2Fc08MthCalc.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrd20 == null)? 0 :this.rcrapp3RejectOvrd20 .hashCode()));
        result = ((result* 31)+((this.aMarried == null)? 0 :this.aMarried.hashCode()));
        result = ((result* 31)+((this.commCode01 == null)? 0 :this.commCode01 .hashCode()));
        result = ((result* 31)+((this.commCode02 == null)? 0 :this.commCode02 .hashCode()));
        result = ((result* 31)+((this.edeInstInd == null)? 0 :this.edeInstInd.hashCode()));
        result = ((result* 31)+((this.rcrapp3FaaTitleIvCode == null)? 0 :this.rcrapp3FaaTitleIvCode.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrd21 == null)? 0 :this.rcrapp3RejectOvrd21 .hashCode()));
        result = ((result* 31)+((this.commCode05 == null)? 0 :this.commCode05 .hashCode()));
        result = ((result* 31)+((this.commCode06 == null)? 0 :this.commCode06 .hashCode()));
        result = ((result* 31)+((this.commCode03 == null)? 0 :this.commCode03 .hashCode()));
        result = ((result* 31)+((this.computeBatchNo == null)? 0 :this.computeBatchNo.hashCode()));
        result = ((result* 31)+((this.aPAssetThreshExcd == null)? 0 :this.aPAssetThreshExcd.hashCode()));
        result = ((result* 31)+((this.commCode04 == null)? 0 :this.commCode04 .hashCode()));
        result = ((result* 31)+((this.rnrovrdMSsnNoDobRejOvrd == null)? 0 :this.rnrovrdMSsnNoDobRejOvrd.hashCode()));
        result = ((result* 31)+((this.aTaxFiledInd == null)? 0 :this.aTaxFiledInd.hashCode()));
        result = ((result* 31)+((this.aFamMemb == null)? 0 :this.aFamMemb.hashCode()));
        result = ((result* 31)+((this.aNoInColl == null)? 0 :this.aNoInColl.hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc15 == null)? 0 :this.rtvicmtDesc15 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc16 == null)? 0 :this.rtvicmtDesc16 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc13 == null)? 0 :this.rtvicmtDesc13 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc14 == null)? 0 :this.rtvicmtDesc14 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc19 == null)? 0 :this.rtvicmtDesc19 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc17 == null)? 0 :this.rtvicmtDesc17 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc18 == null)? 0 :this.rtvicmtDesc18 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc11 == null)? 0 :this.rtvicmtDesc11 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc12 == null)? 0 :this.rtvicmtDesc12 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc10 == null)? 0 :this.rtvicmtDesc10 .hashCode()));
        result = ((result* 31)+((this.alt2Fc01MthCalc == null)? 0 :this.alt2Fc01MthCalc.hashCode()));
        result = ((result* 31)+((this.commCode12 == null)? 0 :this.commCode12 .hashCode()));
        result = ((result* 31)+((this.commCode13 == null)? 0 :this.commCode13 .hashCode()));
        result = ((result* 31)+((this.commCode10 == null)? 0 :this.commCode10 .hashCode()));
        result = ((result* 31)+((this.secEfcType == null)? 0 :this.secEfcType.hashCode()));
        result = ((result* 31)+((this.rcrapp4AddressChgFlag == null)? 0 :this.rcrapp4AddressChgFlag.hashCode()));
        result = ((result* 31)+((this.commCode11 == null)? 0 :this.commCode11 .hashCode()));
        result = ((result* 31)+((this.autoZeroEfcFlag == null)? 0 :this.autoZeroEfcFlag.hashCode()));
        result = ((result* 31)+((this.commCode16 == null)? 0 :this.commCode16 .hashCode()));
        result = ((result* 31)+((this.rcrapp4SarCChangeFlag == null)? 0 :this.rcrapp4SarCChangeFlag.hashCode()));
        result = ((result* 31)+((this.commCode17 == null)? 0 :this.commCode17 .hashCode()));
        result = ((result* 31)+((this.commCode14 == null)? 0 :this.commCode14 .hashCode()));
        result = ((result* 31)+((this.commCode15 == null)? 0 :this.commCode15 .hashCode()));
        result = ((result* 31)+((this.aCitzInd == null)? 0 :this.aCitzInd.hashCode()));
        result = ((result* 31)+((this.aHaveChildren == null)? 0 :this.aHaveChildren.hashCode()));
        result = ((result* 31)+((this.alt1Fc05MthCalc == null)? 0 :this.alt1Fc05MthCalc.hashCode()));
        result = ((result* 31)+((this.alt1Fc09MthCalc == null)? 0 :this.alt1Fc09MthCalc.hashCode()));
        result = ((result* 31)+((this.rnrovrdFSsnNoDobRejOvrd == null)? 0 :this.rnrovrdFSsnNoDobRejOvrd.hashCode()));
        result = ((result* 31)+((this.rcrapp2CAddlFinancial == null)? 0 :this.rcrapp2CAddlFinancial.hashCode()));
        result = ((result* 31)+((this.alt1Fc12MthCalc == null)? 0 :this.alt1Fc12MthCalc.hashCode()));
        result = ((result* 31)+((this.alt2Fc05MthCalc == null)? 0 :this.alt2Fc05MthCalc.hashCode()));
        result = ((result* 31)+((this.aMrtlStatusInd == null)? 0 :this.aMrtlStatusInd.hashCode()));
        result = ((result* 31)+((this.commCode09 == null)? 0 :this.commCode09 .hashCode()));
        result = ((result* 31)+((this.aMothSsn == null)? 0 :this.aMothSsn.hashCode()));
        result = ((result* 31)+((this.commCode07 == null)? 0 :this.commCode07 .hashCode()));
        result = ((result* 31)+((this.alt2Fc12MthCalc == null)? 0 :this.alt2Fc12MthCalc.hashCode()));
        result = ((result* 31)+((this.commCode08 == null)? 0 :this.commCode08 .hashCode()));
        result = ((result* 31)+((this.rejStatusChangeInd == null)? 0 :this.rejStatusChangeInd.hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc20 == null)? 0 :this.rtvicmtDesc20 .hashCode()));
        result = ((result* 31)+((this.alt2Fc09MthCalc == null)? 0 :this.alt2Fc09MthCalc.hashCode()));
        result = ((result* 31)+((this.rcrapp3AssumptOvrd2 == null)? 0 :this.rcrapp3AssumptOvrd2 .hashCode()));
        result = ((result* 31)+((this.rcrapp3AssumptOvrd1 == null)? 0 :this.rcrapp3AssumptOvrd1 .hashCode()));
        result = ((result* 31)+((this.pellElgbl == null)? 0 :this.pellElgbl.hashCode()));
        result = ((result* 31)+((this.aMothIncFrWrk == null)? 0 :this.aMothIncFrWrk.hashCode()));
        result = ((result* 31)+((this.aSpsIncFrWrk == null)? 0 :this.aSpsIncFrWrk.hashCode()));
        result = ((result* 31)+((this.alt1Fc01MthCalc == null)? 0 :this.alt1Fc01MthCalc.hashCode()));
        result = ((result* 31)+((this.commCode20 == null)? 0 :this.commCode20 .hashCode()));
        result = ((result* 31)+((this.recType == null)? 0 :this.recType.hashCode()));
        result = ((result* 31)+((this.alt1Fc02MthCalc == null)? 0 :this.alt1Fc02MthCalc.hashCode()));
        result = ((result* 31)+((this.alt1Fc03MthCalc == null)? 0 :this.alt1Fc03MthCalc.hashCode()));
        result = ((result* 31)+((this.etiDestCode == null)? 0 :this.etiDestCode.hashCode()));
        result = ((result* 31)+((this.aParMrtlStatusInd == null)? 0 :this.aParMrtlStatusInd.hashCode()));
        result = ((result* 31)+((this.commCode18 == null)? 0 :this.commCode18 .hashCode()));
        result = ((result* 31)+((this.commCode19 == null)? 0 :this.commCode19 .hashCode()));
        result = ((result* 31)+((this.rcrapp3AssumptOvrd4 == null)? 0 :this.rcrapp3AssumptOvrd4 .hashCode()));
        result = ((result* 31)+((this.rcrapp1FedCollChoice1 == null)? 0 :this.rcrapp1FedCollChoice1 .hashCode()));
        result = ((result* 31)+((this.rcrapp3AssumptOvrd3 == null)? 0 :this.rcrapp3AssumptOvrd3 .hashCode()));
        result = ((result* 31)+((this.rcrapp3AssumptOvrd6 == null)? 0 :this.rcrapp3AssumptOvrd6 .hashCode()));
        result = ((result* 31)+((this.rnrovrdSsnNoNameRejOvrd == null)? 0 :this.rnrovrdSsnNoNameRejOvrd.hashCode()));
        result = ((result* 31)+((this.rcrapp3AssumptOvrd5 == null)? 0 :this.rcrapp3AssumptOvrd5 .hashCode()));
        result = ((result* 31)+((this.displayFaaDepOverride == null)? 0 :this.displayFaaDepOverride.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrd12 == null)? 0 :this.rcrapp3RejectOvrd12 .hashCode()));
        result = ((result* 31)+((this.alt1Fc06MthCalc == null)? 0 :this.alt1Fc06MthCalc.hashCode()));
        result = ((result* 31)+((this.verifChangeInd == null)? 0 :this.verifChangeInd.hashCode()));
        result = ((result* 31)+((this.rcrapp2CParAddlFinancial == null)? 0 :this.rcrapp2CParAddlFinancial.hashCode()));
        result = ((result* 31)+((this.rcrapp4VerifNum == null)? 0 :this.rcrapp4VerifNum.hashCode()));
        result = ((result* 31)+((this.alt1Fc08MthCalc == null)? 0 :this.alt1Fc08MthCalc.hashCode()));
        result = ((result* 31)+((this.alt1Fc04MthCalc == null)? 0 :this.alt1Fc04MthCalc.hashCode()));
        result = ((result* 31)+((this.aParTaxFiledInd == null)? 0 :this.aParTaxFiledInd.hashCode()));
        result = ((result* 31)+((this.rcrapp4PushIsirFlag == null)? 0 :this.rcrapp4PushIsirFlag.hashCode()));
        result = ((result* 31)+((this.fedHousCde1 == null)? 0 :this.fedHousCde1 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc04 == null)? 0 :this.rtvicmtDesc04 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc05 == null)? 0 :this.rtvicmtDesc05 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc02 == null)? 0 :this.rtvicmtDesc02 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc03 == null)? 0 :this.rtvicmtDesc03 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc08 == null)? 0 :this.rtvicmtDesc08 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc09 == null)? 0 :this.rtvicmtDesc09 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc06 == null)? 0 :this.rtvicmtDesc06 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc07 == null)? 0 :this.rtvicmtDesc07 .hashCode()));
        result = ((result* 31)+((this.rtvicmtDesc01 == null)? 0 :this.rtvicmtDesc01 .hashCode()));
        result = ((result* 31)+((this.rnrovrdFSsnNoNameRejOvrd == null)? 0 :this.rnrovrdFSsnNoNameRejOvrd.hashCode()));
        result = ((result* 31)+((this.aFathIncFrWrk == null)? 0 :this.aFathIncFrWrk.hashCode()));
        result = ((result* 31)+((this.rnrovrdMSsnNoNameRejOvrd == null)? 0 :this.rnrovrdMSsnNoNameRejOvrd.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrdK == null)? 0 :this.rcrapp3RejectOvrdK.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrdN == null)? 0 :this.rcrapp3RejectOvrdN.hashCode()));
        result = ((result* 31)+((this.aParFamMemb == null)? 0 :this.aParFamMemb.hashCode()));
        result = ((result* 31)+((this.aIncFrWrk == null)? 0 :this.aIncFrWrk.hashCode()));
        result = ((result* 31)+((this.mdeSiteCd == null)? 0 :this.mdeSiteCd.hashCode()));
        result = ((result* 31)+((this.rcrapp2CParUntaxInc == null)? 0 :this.rcrapp2CParUntaxInc.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrdW == null)? 0 :this.rcrapp3RejectOvrdW.hashCode()));
        result = ((result* 31)+((this.corrAppl == null)? 0 :this.corrAppl.hashCode()));
        result = ((result* 31)+((this.aBornBeforeInd == null)? 0 :this.aBornBeforeInd.hashCode()));
        result = ((result* 31)+((this.aSAssetThreshExcd == null)? 0 :this.aSAssetThreshExcd.hashCode()));
        result = ((result* 31)+((this.aSFit == null)? 0 :this.aSFit.hashCode()));
        result = ((result* 31)+((this.alt2Fc10MthCalc == null)? 0 :this.alt2Fc10MthCalc.hashCode()));
        result = ((result* 31)+((this.specCircumFlg == null)? 0 :this.specCircumFlg.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrdB == null)? 0 :this.rcrapp3RejectOvrdB.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrdA == null)? 0 :this.rcrapp3RejectOvrdA.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrdC == null)? 0 :this.rcrapp3RejectOvrdC.hashCode()));
        result = ((result* 31)+((this.rcrapp2CUntaxInc == null)? 0 :this.rcrapp2CUntaxInc.hashCode()));
        result = ((result* 31)+((this.rcrapp4SourceCorrection == null)? 0 :this.rcrapp4SourceCorrection.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrdG == null)? 0 :this.rcrapp3RejectOvrdG.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrdJ == null)? 0 :this.rcrapp3RejectOvrdJ.hashCode()));
        result = ((result* 31)+((this.alt1Fc07MthCalc == null)? 0 :this.alt1Fc07MthCalc.hashCode()));
        result = ((result* 31)+((this.rcrapp4EfcChangeInd == null)? 0 :this.rcrapp4EfcChangeInd.hashCode()));
        result = ((result* 31)+((this.alt1Fc10MthCalc == null)? 0 :this.alt1Fc10MthCalc.hashCode()));
        result = ((result* 31)+((this.displayAdjEfcCalcReq == null)? 0 :this.displayAdjEfcCalcReq.hashCode()));
        result = ((result* 31)+((this.rcrapp4DupSsnInd == null)? 0 :this.rcrapp4DupSsnInd.hashCode()));
        result = ((result* 31)+((this.rcrapp3RejectOvrd3 == null)? 0 :this.rcrapp3RejectOvrd3 .hashCode()));
        result = ((result* 31)+((this.rcrapp2PellAnlyType == null)? 0 :this.rcrapp2PellAnlyType.hashCode()));
        result = ((result* 31)+((this.alt2Fc03MthCalc == null)? 0 :this.alt2Fc03MthCalc.hashCode()));
        result = ((result* 31)+((this.aVaStatus == null)? 0 :this.aVaStatus.hashCode()));
        result = ((result* 31)+((this.aPFit == null)? 0 :this.aPFit.hashCode()));
        result = ((result* 31)+((this.rnrovrdSsnNoDobRejOvrd == null)? 0 :this.rnrovrdSsnNoDobRejOvrd.hashCode()));
        result = ((result* 31)+((this.alt2Fc07MthCalc == null)? 0 :this.alt2Fc07MthCalc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20202021MiscellaneousResultsInquiry100GetResponse) == false) {
            return false;
        }
        _20202021MiscellaneousResultsInquiry100GetResponse rhs = ((_20202021MiscellaneousResultsInquiry100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.aUsInc == rhs.aUsInc)||((this.aUsInc!= null)&&this.aUsInc.equals(rhs.aUsInc)))&&((this.reProcReaCd == rhs.reProcReaCd)||((this.reProcReaCd!= null)&&this.reProcReaCd.equals(rhs.reProcReaCd))))&&((this.tranReceiptDate == rhs.tranReceiptDate)||((this.tranReceiptDate!= null)&&this.tranReceiptDate.equals(rhs.tranReceiptDate))))&&((this.aPAddlFinancial == rhs.aPAddlFinancial)||((this.aPAddlFinancial!= null)&&this.aPAddlFinancial.equals(rhs.aPAddlFinancial))))&&((this.aFathSsn == rhs.aFathSsn)||((this.aFathSsn!= null)&&this.aFathSsn.equals(rhs.aFathSsn))))&&((this.alt2Fc11MthCalc == rhs.alt2Fc11MthCalc)||((this.alt2Fc11MthCalc!= null)&&this.alt2Fc11MthCalc.equals(rhs.alt2Fc11MthCalc))))&&((this.aSAddlFinancial == rhs.aSAddlFinancial)||((this.aSAddlFinancial!= null)&&this.aSAddlFinancial.equals(rhs.aSAddlFinancial))))&&((this.agencyInd == rhs.agencyInd)||((this.agencyInd!= null)&&this.agencyInd.equals(rhs.agencyInd))))&&((this.alt1Fc11MthCalc == rhs.alt1Fc11MthCalc)||((this.alt1Fc11MthCalc!= null)&&this.alt1Fc11MthCalc.equals(rhs.alt1Fc11MthCalc))))&&((this.aParUsInc == rhs.aParUsInc)||((this.aParUsInc!= null)&&this.aParUsInc.equals(rhs.aParUsInc))))&&((this.aParNoInColl == rhs.aParNoInColl)||((this.aParNoInColl!= null)&&this.aParNoInColl.equals(rhs.aParNoInColl))))&&((this.edeEtiInd == rhs.edeEtiInd)||((this.edeEtiInd!= null)&&this.edeEtiInd.equals(rhs.edeEtiInd))))&&((this.signatureRejEfc == rhs.signatureRejEfc)||((this.signatureRejEfc!= null)&&this.signatureRejEfc.equals(rhs.signatureRejEfc))))&&((this.nameSsnChgInd == rhs.nameSsnChgInd)||((this.nameSsnChgInd!= null)&&this.nameSsnChgInd.equals(rhs.nameSsnChgInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.alt2Fc02MthCalc == rhs.alt2Fc02MthCalc)||((this.alt2Fc02MthCalc!= null)&&this.alt2Fc02MthCalc.equals(rhs.alt2Fc02MthCalc))))&&((this.alt2Fc04MthCalc == rhs.alt2Fc04MthCalc)||((this.alt2Fc04MthCalc!= null)&&this.alt2Fc04MthCalc.equals(rhs.alt2Fc04MthCalc))))&&((this.alt2Fc06MthCalc == rhs.alt2Fc06MthCalc)||((this.alt2Fc06MthCalc!= null)&&this.alt2Fc06MthCalc.equals(rhs.alt2Fc06MthCalc))))&&((this.aSDependants == rhs.aSDependants)||((this.aSDependants!= null)&&this.aSDependants.equals(rhs.aSDependants))))&&((this.alt2Fc08MthCalc == rhs.alt2Fc08MthCalc)||((this.alt2Fc08MthCalc!= null)&&this.alt2Fc08MthCalc.equals(rhs.alt2Fc08MthCalc))))&&((this.rcrapp3RejectOvrd20 == rhs.rcrapp3RejectOvrd20)||((this.rcrapp3RejectOvrd20 != null)&&this.rcrapp3RejectOvrd20 .equals(rhs.rcrapp3RejectOvrd20))))&&((this.aMarried == rhs.aMarried)||((this.aMarried!= null)&&this.aMarried.equals(rhs.aMarried))))&&((this.commCode01 == rhs.commCode01)||((this.commCode01 != null)&&this.commCode01 .equals(rhs.commCode01))))&&((this.commCode02 == rhs.commCode02)||((this.commCode02 != null)&&this.commCode02 .equals(rhs.commCode02))))&&((this.edeInstInd == rhs.edeInstInd)||((this.edeInstInd!= null)&&this.edeInstInd.equals(rhs.edeInstInd))))&&((this.rcrapp3FaaTitleIvCode == rhs.rcrapp3FaaTitleIvCode)||((this.rcrapp3FaaTitleIvCode!= null)&&this.rcrapp3FaaTitleIvCode.equals(rhs.rcrapp3FaaTitleIvCode))))&&((this.rcrapp3RejectOvrd21 == rhs.rcrapp3RejectOvrd21)||((this.rcrapp3RejectOvrd21 != null)&&this.rcrapp3RejectOvrd21 .equals(rhs.rcrapp3RejectOvrd21))))&&((this.commCode05 == rhs.commCode05)||((this.commCode05 != null)&&this.commCode05 .equals(rhs.commCode05))))&&((this.commCode06 == rhs.commCode06)||((this.commCode06 != null)&&this.commCode06 .equals(rhs.commCode06))))&&((this.commCode03 == rhs.commCode03)||((this.commCode03 != null)&&this.commCode03 .equals(rhs.commCode03))))&&((this.computeBatchNo == rhs.computeBatchNo)||((this.computeBatchNo!= null)&&this.computeBatchNo.equals(rhs.computeBatchNo))))&&((this.aPAssetThreshExcd == rhs.aPAssetThreshExcd)||((this.aPAssetThreshExcd!= null)&&this.aPAssetThreshExcd.equals(rhs.aPAssetThreshExcd))))&&((this.commCode04 == rhs.commCode04)||((this.commCode04 != null)&&this.commCode04 .equals(rhs.commCode04))))&&((this.rnrovrdMSsnNoDobRejOvrd == rhs.rnrovrdMSsnNoDobRejOvrd)||((this.rnrovrdMSsnNoDobRejOvrd!= null)&&this.rnrovrdMSsnNoDobRejOvrd.equals(rhs.rnrovrdMSsnNoDobRejOvrd))))&&((this.aTaxFiledInd == rhs.aTaxFiledInd)||((this.aTaxFiledInd!= null)&&this.aTaxFiledInd.equals(rhs.aTaxFiledInd))))&&((this.aFamMemb == rhs.aFamMemb)||((this.aFamMemb!= null)&&this.aFamMemb.equals(rhs.aFamMemb))))&&((this.aNoInColl == rhs.aNoInColl)||((this.aNoInColl!= null)&&this.aNoInColl.equals(rhs.aNoInColl))))&&((this.rtvicmtDesc15 == rhs.rtvicmtDesc15)||((this.rtvicmtDesc15 != null)&&this.rtvicmtDesc15 .equals(rhs.rtvicmtDesc15))))&&((this.rtvicmtDesc16 == rhs.rtvicmtDesc16)||((this.rtvicmtDesc16 != null)&&this.rtvicmtDesc16 .equals(rhs.rtvicmtDesc16))))&&((this.rtvicmtDesc13 == rhs.rtvicmtDesc13)||((this.rtvicmtDesc13 != null)&&this.rtvicmtDesc13 .equals(rhs.rtvicmtDesc13))))&&((this.rtvicmtDesc14 == rhs.rtvicmtDesc14)||((this.rtvicmtDesc14 != null)&&this.rtvicmtDesc14 .equals(rhs.rtvicmtDesc14))))&&((this.rtvicmtDesc19 == rhs.rtvicmtDesc19)||((this.rtvicmtDesc19 != null)&&this.rtvicmtDesc19 .equals(rhs.rtvicmtDesc19))))&&((this.rtvicmtDesc17 == rhs.rtvicmtDesc17)||((this.rtvicmtDesc17 != null)&&this.rtvicmtDesc17 .equals(rhs.rtvicmtDesc17))))&&((this.rtvicmtDesc18 == rhs.rtvicmtDesc18)||((this.rtvicmtDesc18 != null)&&this.rtvicmtDesc18 .equals(rhs.rtvicmtDesc18))))&&((this.rtvicmtDesc11 == rhs.rtvicmtDesc11)||((this.rtvicmtDesc11 != null)&&this.rtvicmtDesc11 .equals(rhs.rtvicmtDesc11))))&&((this.rtvicmtDesc12 == rhs.rtvicmtDesc12)||((this.rtvicmtDesc12 != null)&&this.rtvicmtDesc12 .equals(rhs.rtvicmtDesc12))))&&((this.rtvicmtDesc10 == rhs.rtvicmtDesc10)||((this.rtvicmtDesc10 != null)&&this.rtvicmtDesc10 .equals(rhs.rtvicmtDesc10))))&&((this.alt2Fc01MthCalc == rhs.alt2Fc01MthCalc)||((this.alt2Fc01MthCalc!= null)&&this.alt2Fc01MthCalc.equals(rhs.alt2Fc01MthCalc))))&&((this.commCode12 == rhs.commCode12)||((this.commCode12 != null)&&this.commCode12 .equals(rhs.commCode12))))&&((this.commCode13 == rhs.commCode13)||((this.commCode13 != null)&&this.commCode13 .equals(rhs.commCode13))))&&((this.commCode10 == rhs.commCode10)||((this.commCode10 != null)&&this.commCode10 .equals(rhs.commCode10))))&&((this.secEfcType == rhs.secEfcType)||((this.secEfcType!= null)&&this.secEfcType.equals(rhs.secEfcType))))&&((this.rcrapp4AddressChgFlag == rhs.rcrapp4AddressChgFlag)||((this.rcrapp4AddressChgFlag!= null)&&this.rcrapp4AddressChgFlag.equals(rhs.rcrapp4AddressChgFlag))))&&((this.commCode11 == rhs.commCode11)||((this.commCode11 != null)&&this.commCode11 .equals(rhs.commCode11))))&&((this.autoZeroEfcFlag == rhs.autoZeroEfcFlag)||((this.autoZeroEfcFlag!= null)&&this.autoZeroEfcFlag.equals(rhs.autoZeroEfcFlag))))&&((this.commCode16 == rhs.commCode16)||((this.commCode16 != null)&&this.commCode16 .equals(rhs.commCode16))))&&((this.rcrapp4SarCChangeFlag == rhs.rcrapp4SarCChangeFlag)||((this.rcrapp4SarCChangeFlag!= null)&&this.rcrapp4SarCChangeFlag.equals(rhs.rcrapp4SarCChangeFlag))))&&((this.commCode17 == rhs.commCode17)||((this.commCode17 != null)&&this.commCode17 .equals(rhs.commCode17))))&&((this.commCode14 == rhs.commCode14)||((this.commCode14 != null)&&this.commCode14 .equals(rhs.commCode14))))&&((this.commCode15 == rhs.commCode15)||((this.commCode15 != null)&&this.commCode15 .equals(rhs.commCode15))))&&((this.aCitzInd == rhs.aCitzInd)||((this.aCitzInd!= null)&&this.aCitzInd.equals(rhs.aCitzInd))))&&((this.aHaveChildren == rhs.aHaveChildren)||((this.aHaveChildren!= null)&&this.aHaveChildren.equals(rhs.aHaveChildren))))&&((this.alt1Fc05MthCalc == rhs.alt1Fc05MthCalc)||((this.alt1Fc05MthCalc!= null)&&this.alt1Fc05MthCalc.equals(rhs.alt1Fc05MthCalc))))&&((this.alt1Fc09MthCalc == rhs.alt1Fc09MthCalc)||((this.alt1Fc09MthCalc!= null)&&this.alt1Fc09MthCalc.equals(rhs.alt1Fc09MthCalc))))&&((this.rnrovrdFSsnNoDobRejOvrd == rhs.rnrovrdFSsnNoDobRejOvrd)||((this.rnrovrdFSsnNoDobRejOvrd!= null)&&this.rnrovrdFSsnNoDobRejOvrd.equals(rhs.rnrovrdFSsnNoDobRejOvrd))))&&((this.rcrapp2CAddlFinancial == rhs.rcrapp2CAddlFinancial)||((this.rcrapp2CAddlFinancial!= null)&&this.rcrapp2CAddlFinancial.equals(rhs.rcrapp2CAddlFinancial))))&&((this.alt1Fc12MthCalc == rhs.alt1Fc12MthCalc)||((this.alt1Fc12MthCalc!= null)&&this.alt1Fc12MthCalc.equals(rhs.alt1Fc12MthCalc))))&&((this.alt2Fc05MthCalc == rhs.alt2Fc05MthCalc)||((this.alt2Fc05MthCalc!= null)&&this.alt2Fc05MthCalc.equals(rhs.alt2Fc05MthCalc))))&&((this.aMrtlStatusInd == rhs.aMrtlStatusInd)||((this.aMrtlStatusInd!= null)&&this.aMrtlStatusInd.equals(rhs.aMrtlStatusInd))))&&((this.commCode09 == rhs.commCode09)||((this.commCode09 != null)&&this.commCode09 .equals(rhs.commCode09))))&&((this.aMothSsn == rhs.aMothSsn)||((this.aMothSsn!= null)&&this.aMothSsn.equals(rhs.aMothSsn))))&&((this.commCode07 == rhs.commCode07)||((this.commCode07 != null)&&this.commCode07 .equals(rhs.commCode07))))&&((this.alt2Fc12MthCalc == rhs.alt2Fc12MthCalc)||((this.alt2Fc12MthCalc!= null)&&this.alt2Fc12MthCalc.equals(rhs.alt2Fc12MthCalc))))&&((this.commCode08 == rhs.commCode08)||((this.commCode08 != null)&&this.commCode08 .equals(rhs.commCode08))))&&((this.rejStatusChangeInd == rhs.rejStatusChangeInd)||((this.rejStatusChangeInd!= null)&&this.rejStatusChangeInd.equals(rhs.rejStatusChangeInd))))&&((this.rtvicmtDesc20 == rhs.rtvicmtDesc20)||((this.rtvicmtDesc20 != null)&&this.rtvicmtDesc20 .equals(rhs.rtvicmtDesc20))))&&((this.alt2Fc09MthCalc == rhs.alt2Fc09MthCalc)||((this.alt2Fc09MthCalc!= null)&&this.alt2Fc09MthCalc.equals(rhs.alt2Fc09MthCalc))))&&((this.rcrapp3AssumptOvrd2 == rhs.rcrapp3AssumptOvrd2)||((this.rcrapp3AssumptOvrd2 != null)&&this.rcrapp3AssumptOvrd2 .equals(rhs.rcrapp3AssumptOvrd2))))&&((this.rcrapp3AssumptOvrd1 == rhs.rcrapp3AssumptOvrd1)||((this.rcrapp3AssumptOvrd1 != null)&&this.rcrapp3AssumptOvrd1 .equals(rhs.rcrapp3AssumptOvrd1))))&&((this.pellElgbl == rhs.pellElgbl)||((this.pellElgbl!= null)&&this.pellElgbl.equals(rhs.pellElgbl))))&&((this.aMothIncFrWrk == rhs.aMothIncFrWrk)||((this.aMothIncFrWrk!= null)&&this.aMothIncFrWrk.equals(rhs.aMothIncFrWrk))))&&((this.aSpsIncFrWrk == rhs.aSpsIncFrWrk)||((this.aSpsIncFrWrk!= null)&&this.aSpsIncFrWrk.equals(rhs.aSpsIncFrWrk))))&&((this.alt1Fc01MthCalc == rhs.alt1Fc01MthCalc)||((this.alt1Fc01MthCalc!= null)&&this.alt1Fc01MthCalc.equals(rhs.alt1Fc01MthCalc))))&&((this.commCode20 == rhs.commCode20)||((this.commCode20 != null)&&this.commCode20 .equals(rhs.commCode20))))&&((this.recType == rhs.recType)||((this.recType!= null)&&this.recType.equals(rhs.recType))))&&((this.alt1Fc02MthCalc == rhs.alt1Fc02MthCalc)||((this.alt1Fc02MthCalc!= null)&&this.alt1Fc02MthCalc.equals(rhs.alt1Fc02MthCalc))))&&((this.alt1Fc03MthCalc == rhs.alt1Fc03MthCalc)||((this.alt1Fc03MthCalc!= null)&&this.alt1Fc03MthCalc.equals(rhs.alt1Fc03MthCalc))))&&((this.etiDestCode == rhs.etiDestCode)||((this.etiDestCode!= null)&&this.etiDestCode.equals(rhs.etiDestCode))))&&((this.aParMrtlStatusInd == rhs.aParMrtlStatusInd)||((this.aParMrtlStatusInd!= null)&&this.aParMrtlStatusInd.equals(rhs.aParMrtlStatusInd))))&&((this.commCode18 == rhs.commCode18)||((this.commCode18 != null)&&this.commCode18 .equals(rhs.commCode18))))&&((this.commCode19 == rhs.commCode19)||((this.commCode19 != null)&&this.commCode19 .equals(rhs.commCode19))))&&((this.rcrapp3AssumptOvrd4 == rhs.rcrapp3AssumptOvrd4)||((this.rcrapp3AssumptOvrd4 != null)&&this.rcrapp3AssumptOvrd4 .equals(rhs.rcrapp3AssumptOvrd4))))&&((this.rcrapp1FedCollChoice1 == rhs.rcrapp1FedCollChoice1)||((this.rcrapp1FedCollChoice1 != null)&&this.rcrapp1FedCollChoice1 .equals(rhs.rcrapp1FedCollChoice1))))&&((this.rcrapp3AssumptOvrd3 == rhs.rcrapp3AssumptOvrd3)||((this.rcrapp3AssumptOvrd3 != null)&&this.rcrapp3AssumptOvrd3 .equals(rhs.rcrapp3AssumptOvrd3))))&&((this.rcrapp3AssumptOvrd6 == rhs.rcrapp3AssumptOvrd6)||((this.rcrapp3AssumptOvrd6 != null)&&this.rcrapp3AssumptOvrd6 .equals(rhs.rcrapp3AssumptOvrd6))))&&((this.rnrovrdSsnNoNameRejOvrd == rhs.rnrovrdSsnNoNameRejOvrd)||((this.rnrovrdSsnNoNameRejOvrd!= null)&&this.rnrovrdSsnNoNameRejOvrd.equals(rhs.rnrovrdSsnNoNameRejOvrd))))&&((this.rcrapp3AssumptOvrd5 == rhs.rcrapp3AssumptOvrd5)||((this.rcrapp3AssumptOvrd5 != null)&&this.rcrapp3AssumptOvrd5 .equals(rhs.rcrapp3AssumptOvrd5))))&&((this.displayFaaDepOverride == rhs.displayFaaDepOverride)||((this.displayFaaDepOverride!= null)&&this.displayFaaDepOverride.equals(rhs.displayFaaDepOverride))))&&((this.rcrapp3RejectOvrd12 == rhs.rcrapp3RejectOvrd12)||((this.rcrapp3RejectOvrd12 != null)&&this.rcrapp3RejectOvrd12 .equals(rhs.rcrapp3RejectOvrd12))))&&((this.alt1Fc06MthCalc == rhs.alt1Fc06MthCalc)||((this.alt1Fc06MthCalc!= null)&&this.alt1Fc06MthCalc.equals(rhs.alt1Fc06MthCalc))))&&((this.verifChangeInd == rhs.verifChangeInd)||((this.verifChangeInd!= null)&&this.verifChangeInd.equals(rhs.verifChangeInd))))&&((this.rcrapp2CParAddlFinancial == rhs.rcrapp2CParAddlFinancial)||((this.rcrapp2CParAddlFinancial!= null)&&this.rcrapp2CParAddlFinancial.equals(rhs.rcrapp2CParAddlFinancial))))&&((this.rcrapp4VerifNum == rhs.rcrapp4VerifNum)||((this.rcrapp4VerifNum!= null)&&this.rcrapp4VerifNum.equals(rhs.rcrapp4VerifNum))))&&((this.alt1Fc08MthCalc == rhs.alt1Fc08MthCalc)||((this.alt1Fc08MthCalc!= null)&&this.alt1Fc08MthCalc.equals(rhs.alt1Fc08MthCalc))))&&((this.alt1Fc04MthCalc == rhs.alt1Fc04MthCalc)||((this.alt1Fc04MthCalc!= null)&&this.alt1Fc04MthCalc.equals(rhs.alt1Fc04MthCalc))))&&((this.aParTaxFiledInd == rhs.aParTaxFiledInd)||((this.aParTaxFiledInd!= null)&&this.aParTaxFiledInd.equals(rhs.aParTaxFiledInd))))&&((this.rcrapp4PushIsirFlag == rhs.rcrapp4PushIsirFlag)||((this.rcrapp4PushIsirFlag!= null)&&this.rcrapp4PushIsirFlag.equals(rhs.rcrapp4PushIsirFlag))))&&((this.fedHousCde1 == rhs.fedHousCde1)||((this.fedHousCde1 != null)&&this.fedHousCde1 .equals(rhs.fedHousCde1))))&&((this.rtvicmtDesc04 == rhs.rtvicmtDesc04)||((this.rtvicmtDesc04 != null)&&this.rtvicmtDesc04 .equals(rhs.rtvicmtDesc04))))&&((this.rtvicmtDesc05 == rhs.rtvicmtDesc05)||((this.rtvicmtDesc05 != null)&&this.rtvicmtDesc05 .equals(rhs.rtvicmtDesc05))))&&((this.rtvicmtDesc02 == rhs.rtvicmtDesc02)||((this.rtvicmtDesc02 != null)&&this.rtvicmtDesc02 .equals(rhs.rtvicmtDesc02))))&&((this.rtvicmtDesc03 == rhs.rtvicmtDesc03)||((this.rtvicmtDesc03 != null)&&this.rtvicmtDesc03 .equals(rhs.rtvicmtDesc03))))&&((this.rtvicmtDesc08 == rhs.rtvicmtDesc08)||((this.rtvicmtDesc08 != null)&&this.rtvicmtDesc08 .equals(rhs.rtvicmtDesc08))))&&((this.rtvicmtDesc09 == rhs.rtvicmtDesc09)||((this.rtvicmtDesc09 != null)&&this.rtvicmtDesc09 .equals(rhs.rtvicmtDesc09))))&&((this.rtvicmtDesc06 == rhs.rtvicmtDesc06)||((this.rtvicmtDesc06 != null)&&this.rtvicmtDesc06 .equals(rhs.rtvicmtDesc06))))&&((this.rtvicmtDesc07 == rhs.rtvicmtDesc07)||((this.rtvicmtDesc07 != null)&&this.rtvicmtDesc07 .equals(rhs.rtvicmtDesc07))))&&((this.rtvicmtDesc01 == rhs.rtvicmtDesc01)||((this.rtvicmtDesc01 != null)&&this.rtvicmtDesc01 .equals(rhs.rtvicmtDesc01))))&&((this.rnrovrdFSsnNoNameRejOvrd == rhs.rnrovrdFSsnNoNameRejOvrd)||((this.rnrovrdFSsnNoNameRejOvrd!= null)&&this.rnrovrdFSsnNoNameRejOvrd.equals(rhs.rnrovrdFSsnNoNameRejOvrd))))&&((this.aFathIncFrWrk == rhs.aFathIncFrWrk)||((this.aFathIncFrWrk!= null)&&this.aFathIncFrWrk.equals(rhs.aFathIncFrWrk))))&&((this.rnrovrdMSsnNoNameRejOvrd == rhs.rnrovrdMSsnNoNameRejOvrd)||((this.rnrovrdMSsnNoNameRejOvrd!= null)&&this.rnrovrdMSsnNoNameRejOvrd.equals(rhs.rnrovrdMSsnNoNameRejOvrd))))&&((this.rcrapp3RejectOvrdK == rhs.rcrapp3RejectOvrdK)||((this.rcrapp3RejectOvrdK!= null)&&this.rcrapp3RejectOvrdK.equals(rhs.rcrapp3RejectOvrdK))))&&((this.rcrapp3RejectOvrdN == rhs.rcrapp3RejectOvrdN)||((this.rcrapp3RejectOvrdN!= null)&&this.rcrapp3RejectOvrdN.equals(rhs.rcrapp3RejectOvrdN))))&&((this.aParFamMemb == rhs.aParFamMemb)||((this.aParFamMemb!= null)&&this.aParFamMemb.equals(rhs.aParFamMemb))))&&((this.aIncFrWrk == rhs.aIncFrWrk)||((this.aIncFrWrk!= null)&&this.aIncFrWrk.equals(rhs.aIncFrWrk))))&&((this.mdeSiteCd == rhs.mdeSiteCd)||((this.mdeSiteCd!= null)&&this.mdeSiteCd.equals(rhs.mdeSiteCd))))&&((this.rcrapp2CParUntaxInc == rhs.rcrapp2CParUntaxInc)||((this.rcrapp2CParUntaxInc!= null)&&this.rcrapp2CParUntaxInc.equals(rhs.rcrapp2CParUntaxInc))))&&((this.rcrapp3RejectOvrdW == rhs.rcrapp3RejectOvrdW)||((this.rcrapp3RejectOvrdW!= null)&&this.rcrapp3RejectOvrdW.equals(rhs.rcrapp3RejectOvrdW))))&&((this.corrAppl == rhs.corrAppl)||((this.corrAppl!= null)&&this.corrAppl.equals(rhs.corrAppl))))&&((this.aBornBeforeInd == rhs.aBornBeforeInd)||((this.aBornBeforeInd!= null)&&this.aBornBeforeInd.equals(rhs.aBornBeforeInd))))&&((this.aSAssetThreshExcd == rhs.aSAssetThreshExcd)||((this.aSAssetThreshExcd!= null)&&this.aSAssetThreshExcd.equals(rhs.aSAssetThreshExcd))))&&((this.aSFit == rhs.aSFit)||((this.aSFit!= null)&&this.aSFit.equals(rhs.aSFit))))&&((this.alt2Fc10MthCalc == rhs.alt2Fc10MthCalc)||((this.alt2Fc10MthCalc!= null)&&this.alt2Fc10MthCalc.equals(rhs.alt2Fc10MthCalc))))&&((this.specCircumFlg == rhs.specCircumFlg)||((this.specCircumFlg!= null)&&this.specCircumFlg.equals(rhs.specCircumFlg))))&&((this.rcrapp3RejectOvrdB == rhs.rcrapp3RejectOvrdB)||((this.rcrapp3RejectOvrdB!= null)&&this.rcrapp3RejectOvrdB.equals(rhs.rcrapp3RejectOvrdB))))&&((this.rcrapp3RejectOvrdA == rhs.rcrapp3RejectOvrdA)||((this.rcrapp3RejectOvrdA!= null)&&this.rcrapp3RejectOvrdA.equals(rhs.rcrapp3RejectOvrdA))))&&((this.rcrapp3RejectOvrdC == rhs.rcrapp3RejectOvrdC)||((this.rcrapp3RejectOvrdC!= null)&&this.rcrapp3RejectOvrdC.equals(rhs.rcrapp3RejectOvrdC))))&&((this.rcrapp2CUntaxInc == rhs.rcrapp2CUntaxInc)||((this.rcrapp2CUntaxInc!= null)&&this.rcrapp2CUntaxInc.equals(rhs.rcrapp2CUntaxInc))))&&((this.rcrapp4SourceCorrection == rhs.rcrapp4SourceCorrection)||((this.rcrapp4SourceCorrection!= null)&&this.rcrapp4SourceCorrection.equals(rhs.rcrapp4SourceCorrection))))&&((this.rcrapp3RejectOvrdG == rhs.rcrapp3RejectOvrdG)||((this.rcrapp3RejectOvrdG!= null)&&this.rcrapp3RejectOvrdG.equals(rhs.rcrapp3RejectOvrdG))))&&((this.rcrapp3RejectOvrdJ == rhs.rcrapp3RejectOvrdJ)||((this.rcrapp3RejectOvrdJ!= null)&&this.rcrapp3RejectOvrdJ.equals(rhs.rcrapp3RejectOvrdJ))))&&((this.alt1Fc07MthCalc == rhs.alt1Fc07MthCalc)||((this.alt1Fc07MthCalc!= null)&&this.alt1Fc07MthCalc.equals(rhs.alt1Fc07MthCalc))))&&((this.rcrapp4EfcChangeInd == rhs.rcrapp4EfcChangeInd)||((this.rcrapp4EfcChangeInd!= null)&&this.rcrapp4EfcChangeInd.equals(rhs.rcrapp4EfcChangeInd))))&&((this.alt1Fc10MthCalc == rhs.alt1Fc10MthCalc)||((this.alt1Fc10MthCalc!= null)&&this.alt1Fc10MthCalc.equals(rhs.alt1Fc10MthCalc))))&&((this.displayAdjEfcCalcReq == rhs.displayAdjEfcCalcReq)||((this.displayAdjEfcCalcReq!= null)&&this.displayAdjEfcCalcReq.equals(rhs.displayAdjEfcCalcReq))))&&((this.rcrapp4DupSsnInd == rhs.rcrapp4DupSsnInd)||((this.rcrapp4DupSsnInd!= null)&&this.rcrapp4DupSsnInd.equals(rhs.rcrapp4DupSsnInd))))&&((this.rcrapp3RejectOvrd3 == rhs.rcrapp3RejectOvrd3)||((this.rcrapp3RejectOvrd3 != null)&&this.rcrapp3RejectOvrd3 .equals(rhs.rcrapp3RejectOvrd3))))&&((this.rcrapp2PellAnlyType == rhs.rcrapp2PellAnlyType)||((this.rcrapp2PellAnlyType!= null)&&this.rcrapp2PellAnlyType.equals(rhs.rcrapp2PellAnlyType))))&&((this.alt2Fc03MthCalc == rhs.alt2Fc03MthCalc)||((this.alt2Fc03MthCalc!= null)&&this.alt2Fc03MthCalc.equals(rhs.alt2Fc03MthCalc))))&&((this.aVaStatus == rhs.aVaStatus)||((this.aVaStatus!= null)&&this.aVaStatus.equals(rhs.aVaStatus))))&&((this.aPFit == rhs.aPFit)||((this.aPFit!= null)&&this.aPFit.equals(rhs.aPFit))))&&((this.rnrovrdSsnNoDobRejOvrd == rhs.rnrovrdSsnNoDobRejOvrd)||((this.rnrovrdSsnNoDobRejOvrd!= null)&&this.rnrovrdSsnNoDobRejOvrd.equals(rhs.rnrovrdSsnNoDobRejOvrd))))&&((this.alt2Fc07MthCalc == rhs.alt2Fc07MthCalc)||((this.alt2Fc07MthCalc!= null)&&this.alt2Fc07MthCalc.equals(rhs.alt2Fc07MthCalc))));
    }

}
