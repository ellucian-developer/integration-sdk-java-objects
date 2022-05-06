
package com.ellucian.generated.bpapi.ban._2017_2018_need_analysis_document_verification_parent.v1_0_0;

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
    "updParCombatPay",
    "rcrapp3ParEducCredits",
    "updMothIncFrWrk",
    "updParGrantScholarAid",
    "updParFoodStamps",
    "rnrvrfyIra",
    "updParNeedBasedEmploy",
    "rcrapp3ParChildSuppPaid",
    "updateRcrapp1Ind2",
    "rnrvrfyTaxFormInd",
    "updParChildSupportReceived",
    "rcrapp3ParCoOpEarnings",
    "rnrvrfyTaxFinAidRecd",
    "rnrvrfyOtherTaxFinaid",
    "updParChildSuppPaid",
    "rcrapp3ParNeedBasedEmploy",
    "rcrapp3ParTaxDefPension",
    "rnrvrfyMothIncFrWrk",
    "updParNoInColl",
    "updParHouseFoodOth",
    "rnrvrfyVaNonEducBen",
    "rnrvrfyUntaxedIraDist",
    "updParFamMemb",
    "rnrvrfyFoodStamps",
    "updParUsIncTaxPd",
    "rnrvrfyAllOtherUntaxInc",
    "rnrvrfyDislWrk",
    "rcrapp4ParCombatPay",
    "updParIntInc",
    "updParIraKeogh",
    "rcrapp3ParHouseFoodOth",
    "rcrapp1ParOthUntaxInc",
    "rnrvrfyTaxExemptIntInc",
    "rcrapp3ParTeIntInc",
    "rnrvrfyChildSupp",
    "rnrvrfyFamMemb",
    "rnrvrfyTaxDefPensPayt",
    "rcrapp3ParIraKeough",
    "rcrapp3ParGrantScholarAid",
    "keyblckStudentId",
    "rnrvrfyUsIncTaxPd",
    "rnrvrfyFathIncFrWrk",
    "rcrapp1ParChildSupp",
    "rnrvrfyEligInd",
    "pellInd",
    "rcrapp1ParIraDistributions",
    "updParTaxFilingStatus",
    "rnrvrfyChildSuppPd",
    "updParUsInc",
    "rnrvrfyUsInc",
    "rnrvrfyUntaxedPension",
    "updParEducCredits",
    "updP1040EligInd",
    "updParOthUntaxInc",
    "updParUntaxedPensions",
    "rnrvrfyNoInColl",
    "updParDislWrk",
    "updParPensionPayments",
    "updParIraDistributions",
    "updParCoOpEarnings",
    "updFathIncFrWrk",
    "rcrapp1ParUntaxPensions",
    "rnrvrfyEdCredits",
    "rnrvrfyParTaxFilingStatus",
    "rnrvrfyCoOpEarnings",
    "updParTaxFormInd",
    "rcrapp1ParVetsNonEdBen",
    "rnrvrfyLivAllowRecd",
    "updParVetsNonEdBen",
    "rnrvrfyCombatPay"
})
@Generated("jsonschema2pojo")
public class _20172018NeedAnalysisDocumentVerificationParent100PutRequest {

    @JsonProperty("updParCombatPay")
    private String updParCombatPay;
    @JsonProperty("rcrapp3ParEducCredits")
    private Double rcrapp3ParEducCredits;
    @JsonProperty("updMothIncFrWrk")
    private String updMothIncFrWrk;
    @JsonProperty("updParGrantScholarAid")
    private String updParGrantScholarAid;
    @JsonProperty("updParFoodStamps")
    private String updParFoodStamps;
    /**
     * IRA and Keogh Deductions
     * <p>
     * Lineage reference object : RNRVRFY_IRA
     * 
     */
    @JsonProperty("rnrvrfyIra")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_IRA")
    private Double rnrvrfyIra;
    @JsonProperty("updParNeedBasedEmploy")
    private String updParNeedBasedEmploy;
    @JsonProperty("rcrapp3ParChildSuppPaid")
    private Double rcrapp3ParChildSuppPaid;
    /**
     * Update Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("updateRcrapp1Ind2")
    private String updateRcrapp1Ind2;
    /**
     * Lineage reference object : RNRVRFY_TAX_FORM_IND
     * 
     */
    @JsonProperty("rnrvrfyTaxFormInd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_FORM_IND")
    private String rnrvrfyTaxFormInd;
    @JsonProperty("updParChildSupportReceived")
    private String updParChildSupportReceived;
    @JsonProperty("rcrapp3ParCoOpEarnings")
    private Double rcrapp3ParCoOpEarnings;
    /**
     * Need Based Employment
     * <p>
     * Lineage reference object : RNRVRFY_TAX_FIN_AID_RECD
     * 
     */
    @JsonProperty("rnrvrfyTaxFinAidRecd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_FIN_AID_RECD")
    private Double rnrvrfyTaxFinAidRecd;
    /**
     * Grant and Scholarship Aid
     * <p>
     * Lineage reference object : RNRVRFY_OTHER_TAX_FINAID
     * 
     */
    @JsonProperty("rnrvrfyOtherTaxFinaid")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_OTHER_TAX_FINAID")
    private Double rnrvrfyOtherTaxFinaid;
    @JsonProperty("updParChildSuppPaid")
    private String updParChildSuppPaid;
    @JsonProperty("rcrapp3ParNeedBasedEmploy")
    private Double rcrapp3ParNeedBasedEmploy;
    @JsonProperty("rcrapp3ParTaxDefPension")
    private Double rcrapp3ParTaxDefPension;
    /**
     * Lineage reference object : RNRVRFY_MOTH_INC_FR_WRK
     * 
     */
    @JsonProperty("rnrvrfyMothIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_MOTH_INC_FR_WRK")
    private Double rnrvrfyMothIncFrWrk;
    @JsonProperty("updParNoInColl")
    private String updParNoInColl;
    @JsonProperty("updParHouseFoodOth")
    private String updParHouseFoodOth;
    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN
     * 
     */
    @JsonProperty("rnrvrfyVaNonEducBen")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN")
    private Double rnrvrfyVaNonEducBen;
    /**
     * Untaxed IRA Distributions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_IRA_DIST
     * 
     */
    @JsonProperty("rnrvrfyUntaxedIraDist")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_UNTAXED_IRA_DIST")
    private Double rnrvrfyUntaxedIraDist;
    @JsonProperty("updParFamMemb")
    private String updParFamMemb;
    /**
     * Lineage reference object : RNRVRFY_FOOD_STAMPS
     * 
     */
    @JsonProperty("rnrvrfyFoodStamps")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_FOOD_STAMPS")
    private String rnrvrfyFoodStamps;
    @JsonProperty("updParUsIncTaxPd")
    private String updParUsIncTaxPd;
    /**
     * Other Untaxed Income
     * <p>
     * Lineage reference object : RNRVRFY_ALL_OTHER_UNTAX_INC
     * 
     */
    @JsonProperty("rnrvrfyAllOtherUntaxInc")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_ALL_OTHER_UNTAX_INC")
    private Double rnrvrfyAllOtherUntaxInc;
    /**
     * Lineage reference object : RNRVRFY_DISL_WRK
     * 
     */
    @JsonProperty("rnrvrfyDislWrk")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_DISL_WRK")
    private String rnrvrfyDislWrk;
    @JsonProperty("rcrapp4ParCombatPay")
    private Double rcrapp4ParCombatPay;
    @JsonProperty("updParIntInc")
    private String updParIntInc;
    @JsonProperty("updParIraKeogh")
    private String updParIraKeogh;
    @JsonProperty("rcrapp3ParHouseFoodOth")
    private Double rcrapp3ParHouseFoodOth;
    @JsonProperty("rcrapp1ParOthUntaxInc")
    private Double rcrapp1ParOthUntaxInc;
    /**
     * Tax Exempt Interest
     * <p>
     * Lineage reference object : RNRVRFY_TAX_EXEMPT_INT_INC
     * 
     */
    @JsonProperty("rnrvrfyTaxExemptIntInc")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_EXEMPT_INT_INC")
    private Double rnrvrfyTaxExemptIntInc;
    @JsonProperty("rcrapp3ParTeIntInc")
    private Double rcrapp3ParTeIntInc;
    /**
     * Child Support Received
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP
     * 
     */
    @JsonProperty("rnrvrfyChildSupp")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_CHILD_SUPP")
    private Double rnrvrfyChildSupp;
    /**
     * Lineage reference object : RNRVRFY_FAM_MEMB
     * 
     */
    @JsonProperty("rnrvrfyFamMemb")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_FAM_MEMB")
    private Double rnrvrfyFamMemb;
    /**
     * Tax-Deferred Pensions
     * <p>
     * Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT
     * 
     */
    @JsonProperty("rnrvrfyTaxDefPensPayt")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT")
    private Double rnrvrfyTaxDefPensPayt;
    @JsonProperty("rcrapp3ParIraKeough")
    private Double rcrapp3ParIraKeough;
    @JsonProperty("rcrapp3ParGrantScholarAid")
    private Double rcrapp3ParGrantScholarAid;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    @JsonPropertyDescription("Lineage reference object : keyblckStudentId")
    private Object keyblckStudentId;
    /**
     * Lineage reference object : RNRVRFY_US_INC_TAX_PD
     * 
     */
    @JsonProperty("rnrvrfyUsIncTaxPd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_US_INC_TAX_PD")
    private Double rnrvrfyUsIncTaxPd;
    /**
     * Lineage reference object : RNRVRFY_FATH_INC_FR_WRK
     * 
     */
    @JsonProperty("rnrvrfyFathIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_FATH_INC_FR_WRK")
    private Double rnrvrfyFathIncFrWrk;
    @JsonProperty("rcrapp1ParChildSupp")
    private Double rcrapp1ParChildSupp;
    /**
     * Lineage reference object : RNRVRFY_ELIG_IND
     * 
     */
    @JsonProperty("rnrvrfyEligInd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_ELIG_IND")
    private String rnrvrfyEligInd;
    /**
     * Pell Correction
     * <p>
     * Lineage reference object : pellInd
     * 
     */
    @JsonProperty("pellInd")
    @JsonPropertyDescription("Lineage reference object : pellInd")
    private Object pellInd;
    @JsonProperty("rcrapp1ParIraDistributions")
    private Double rcrapp1ParIraDistributions;
    @JsonProperty("updParTaxFilingStatus")
    private String updParTaxFilingStatus;
    /**
     * Child Support Paid
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP_PD
     * 
     */
    @JsonProperty("rnrvrfyChildSuppPd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_CHILD_SUPP_PD")
    private Double rnrvrfyChildSuppPd;
    @JsonProperty("updParUsInc")
    private String updParUsInc;
    /**
     * Lineage reference object : RNRVRFY_US_INC
     * 
     */
    @JsonProperty("rnrvrfyUsInc")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_US_INC")
    private Double rnrvrfyUsInc;
    /**
     * Untaxed Pensions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_PENSION
     * 
     */
    @JsonProperty("rnrvrfyUntaxedPension")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_UNTAXED_PENSION")
    private Double rnrvrfyUntaxedPension;
    @JsonProperty("updParEducCredits")
    private String updParEducCredits;
    @JsonProperty("updP1040EligInd")
    private String updP1040EligInd;
    @JsonProperty("updParOthUntaxInc")
    private String updParOthUntaxInc;
    @JsonProperty("updParUntaxedPensions")
    private String updParUntaxedPensions;
    /**
     * Lineage reference object : RNRVRFY_NO_IN_COLL
     * 
     */
    @JsonProperty("rnrvrfyNoInColl")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_NO_IN_COLL")
    private Double rnrvrfyNoInColl;
    @JsonProperty("updParDislWrk")
    private String updParDislWrk;
    @JsonProperty("updParPensionPayments")
    private String updParPensionPayments;
    @JsonProperty("updParIraDistributions")
    private String updParIraDistributions;
    @JsonProperty("updParCoOpEarnings")
    private String updParCoOpEarnings;
    @JsonProperty("updFathIncFrWrk")
    private String updFathIncFrWrk;
    @JsonProperty("rcrapp1ParUntaxPensions")
    private Double rcrapp1ParUntaxPensions;
    /**
     * Education Tax Credits
     * <p>
     * Lineage reference object : RNRVRFY_ED_CREDITS
     * 
     */
    @JsonProperty("rnrvrfyEdCredits")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_ED_CREDITS")
    private Double rnrvrfyEdCredits;
    /**
     * Lineage reference object : RNRVRFY_PAR_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("rnrvrfyParTaxFilingStatus")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_PAR_TAX_FILING_STATUS")
    private String rnrvrfyParTaxFilingStatus;
    /**
     * Co-op Earnings
     * <p>
     * Lineage reference object : RNRVRFY_CO_OP_EARNINGS
     * 
     */
    @JsonProperty("rnrvrfyCoOpEarnings")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_CO_OP_EARNINGS")
    private Double rnrvrfyCoOpEarnings;
    @JsonProperty("updParTaxFormInd")
    private String updParTaxFormInd;
    @JsonProperty("rcrapp1ParVetsNonEdBen")
    private Double rcrapp1ParVetsNonEdBen;
    /**
     * Military and Clergy Allowance
     * <p>
     * Lineage reference object : RNRVRFY_LIV_ALLOW_RECD
     * 
     */
    @JsonProperty("rnrvrfyLivAllowRecd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_LIV_ALLOW_RECD")
    private Double rnrvrfyLivAllowRecd;
    @JsonProperty("updParVetsNonEdBen")
    private String updParVetsNonEdBen;
    /**
     * Combat Pay
     * <p>
     * Lineage reference object : RNRVRFY_COMBAT_PAY
     * 
     */
    @JsonProperty("rnrvrfyCombatPay")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_COMBAT_PAY")
    private Double rnrvrfyCombatPay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("updParCombatPay")
    public String getUpdParCombatPay() {
        return updParCombatPay;
    }

    @JsonProperty("updParCombatPay")
    public void setUpdParCombatPay(String updParCombatPay) {
        this.updParCombatPay = updParCombatPay;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParCombatPay(String updParCombatPay) {
        this.updParCombatPay = updParCombatPay;
        return this;
    }

    @JsonProperty("rcrapp3ParEducCredits")
    public Double getRcrapp3ParEducCredits() {
        return rcrapp3ParEducCredits;
    }

    @JsonProperty("rcrapp3ParEducCredits")
    public void setRcrapp3ParEducCredits(Double rcrapp3ParEducCredits) {
        this.rcrapp3ParEducCredits = rcrapp3ParEducCredits;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp3ParEducCredits(Double rcrapp3ParEducCredits) {
        this.rcrapp3ParEducCredits = rcrapp3ParEducCredits;
        return this;
    }

    @JsonProperty("updMothIncFrWrk")
    public String getUpdMothIncFrWrk() {
        return updMothIncFrWrk;
    }

    @JsonProperty("updMothIncFrWrk")
    public void setUpdMothIncFrWrk(String updMothIncFrWrk) {
        this.updMothIncFrWrk = updMothIncFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdMothIncFrWrk(String updMothIncFrWrk) {
        this.updMothIncFrWrk = updMothIncFrWrk;
        return this;
    }

    @JsonProperty("updParGrantScholarAid")
    public String getUpdParGrantScholarAid() {
        return updParGrantScholarAid;
    }

    @JsonProperty("updParGrantScholarAid")
    public void setUpdParGrantScholarAid(String updParGrantScholarAid) {
        this.updParGrantScholarAid = updParGrantScholarAid;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParGrantScholarAid(String updParGrantScholarAid) {
        this.updParGrantScholarAid = updParGrantScholarAid;
        return this;
    }

    @JsonProperty("updParFoodStamps")
    public String getUpdParFoodStamps() {
        return updParFoodStamps;
    }

    @JsonProperty("updParFoodStamps")
    public void setUpdParFoodStamps(String updParFoodStamps) {
        this.updParFoodStamps = updParFoodStamps;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParFoodStamps(String updParFoodStamps) {
        this.updParFoodStamps = updParFoodStamps;
        return this;
    }

    /**
     * IRA and Keogh Deductions
     * <p>
     * Lineage reference object : RNRVRFY_IRA
     * 
     */
    @JsonProperty("rnrvrfyIra")
    public Double getRnrvrfyIra() {
        return rnrvrfyIra;
    }

    /**
     * IRA and Keogh Deductions
     * <p>
     * Lineage reference object : RNRVRFY_IRA
     * 
     */
    @JsonProperty("rnrvrfyIra")
    public void setRnrvrfyIra(Double rnrvrfyIra) {
        this.rnrvrfyIra = rnrvrfyIra;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyIra(Double rnrvrfyIra) {
        this.rnrvrfyIra = rnrvrfyIra;
        return this;
    }

    @JsonProperty("updParNeedBasedEmploy")
    public String getUpdParNeedBasedEmploy() {
        return updParNeedBasedEmploy;
    }

    @JsonProperty("updParNeedBasedEmploy")
    public void setUpdParNeedBasedEmploy(String updParNeedBasedEmploy) {
        this.updParNeedBasedEmploy = updParNeedBasedEmploy;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParNeedBasedEmploy(String updParNeedBasedEmploy) {
        this.updParNeedBasedEmploy = updParNeedBasedEmploy;
        return this;
    }

    @JsonProperty("rcrapp3ParChildSuppPaid")
    public Double getRcrapp3ParChildSuppPaid() {
        return rcrapp3ParChildSuppPaid;
    }

    @JsonProperty("rcrapp3ParChildSuppPaid")
    public void setRcrapp3ParChildSuppPaid(Double rcrapp3ParChildSuppPaid) {
        this.rcrapp3ParChildSuppPaid = rcrapp3ParChildSuppPaid;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp3ParChildSuppPaid(Double rcrapp3ParChildSuppPaid) {
        this.rcrapp3ParChildSuppPaid = rcrapp3ParChildSuppPaid;
        return this;
    }

    /**
     * Update Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("updateRcrapp1Ind2")
    public String getUpdateRcrapp1Ind2() {
        return updateRcrapp1Ind2;
    }

    /**
     * Update Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("updateRcrapp1Ind2")
    public void setUpdateRcrapp1Ind2(String updateRcrapp1Ind2) {
        this.updateRcrapp1Ind2 = updateRcrapp1Ind2;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdateRcrapp1Ind2(String updateRcrapp1Ind2) {
        this.updateRcrapp1Ind2 = updateRcrapp1Ind2;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_TAX_FORM_IND
     * 
     */
    @JsonProperty("rnrvrfyTaxFormInd")
    public String getRnrvrfyTaxFormInd() {
        return rnrvrfyTaxFormInd;
    }

    /**
     * Lineage reference object : RNRVRFY_TAX_FORM_IND
     * 
     */
    @JsonProperty("rnrvrfyTaxFormInd")
    public void setRnrvrfyTaxFormInd(String rnrvrfyTaxFormInd) {
        this.rnrvrfyTaxFormInd = rnrvrfyTaxFormInd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyTaxFormInd(String rnrvrfyTaxFormInd) {
        this.rnrvrfyTaxFormInd = rnrvrfyTaxFormInd;
        return this;
    }

    @JsonProperty("updParChildSupportReceived")
    public String getUpdParChildSupportReceived() {
        return updParChildSupportReceived;
    }

    @JsonProperty("updParChildSupportReceived")
    public void setUpdParChildSupportReceived(String updParChildSupportReceived) {
        this.updParChildSupportReceived = updParChildSupportReceived;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParChildSupportReceived(String updParChildSupportReceived) {
        this.updParChildSupportReceived = updParChildSupportReceived;
        return this;
    }

    @JsonProperty("rcrapp3ParCoOpEarnings")
    public Double getRcrapp3ParCoOpEarnings() {
        return rcrapp3ParCoOpEarnings;
    }

    @JsonProperty("rcrapp3ParCoOpEarnings")
    public void setRcrapp3ParCoOpEarnings(Double rcrapp3ParCoOpEarnings) {
        this.rcrapp3ParCoOpEarnings = rcrapp3ParCoOpEarnings;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp3ParCoOpEarnings(Double rcrapp3ParCoOpEarnings) {
        this.rcrapp3ParCoOpEarnings = rcrapp3ParCoOpEarnings;
        return this;
    }

    /**
     * Need Based Employment
     * <p>
     * Lineage reference object : RNRVRFY_TAX_FIN_AID_RECD
     * 
     */
    @JsonProperty("rnrvrfyTaxFinAidRecd")
    public Double getRnrvrfyTaxFinAidRecd() {
        return rnrvrfyTaxFinAidRecd;
    }

    /**
     * Need Based Employment
     * <p>
     * Lineage reference object : RNRVRFY_TAX_FIN_AID_RECD
     * 
     */
    @JsonProperty("rnrvrfyTaxFinAidRecd")
    public void setRnrvrfyTaxFinAidRecd(Double rnrvrfyTaxFinAidRecd) {
        this.rnrvrfyTaxFinAidRecd = rnrvrfyTaxFinAidRecd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyTaxFinAidRecd(Double rnrvrfyTaxFinAidRecd) {
        this.rnrvrfyTaxFinAidRecd = rnrvrfyTaxFinAidRecd;
        return this;
    }

    /**
     * Grant and Scholarship Aid
     * <p>
     * Lineage reference object : RNRVRFY_OTHER_TAX_FINAID
     * 
     */
    @JsonProperty("rnrvrfyOtherTaxFinaid")
    public Double getRnrvrfyOtherTaxFinaid() {
        return rnrvrfyOtherTaxFinaid;
    }

    /**
     * Grant and Scholarship Aid
     * <p>
     * Lineage reference object : RNRVRFY_OTHER_TAX_FINAID
     * 
     */
    @JsonProperty("rnrvrfyOtherTaxFinaid")
    public void setRnrvrfyOtherTaxFinaid(Double rnrvrfyOtherTaxFinaid) {
        this.rnrvrfyOtherTaxFinaid = rnrvrfyOtherTaxFinaid;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyOtherTaxFinaid(Double rnrvrfyOtherTaxFinaid) {
        this.rnrvrfyOtherTaxFinaid = rnrvrfyOtherTaxFinaid;
        return this;
    }

    @JsonProperty("updParChildSuppPaid")
    public String getUpdParChildSuppPaid() {
        return updParChildSuppPaid;
    }

    @JsonProperty("updParChildSuppPaid")
    public void setUpdParChildSuppPaid(String updParChildSuppPaid) {
        this.updParChildSuppPaid = updParChildSuppPaid;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParChildSuppPaid(String updParChildSuppPaid) {
        this.updParChildSuppPaid = updParChildSuppPaid;
        return this;
    }

    @JsonProperty("rcrapp3ParNeedBasedEmploy")
    public Double getRcrapp3ParNeedBasedEmploy() {
        return rcrapp3ParNeedBasedEmploy;
    }

    @JsonProperty("rcrapp3ParNeedBasedEmploy")
    public void setRcrapp3ParNeedBasedEmploy(Double rcrapp3ParNeedBasedEmploy) {
        this.rcrapp3ParNeedBasedEmploy = rcrapp3ParNeedBasedEmploy;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp3ParNeedBasedEmploy(Double rcrapp3ParNeedBasedEmploy) {
        this.rcrapp3ParNeedBasedEmploy = rcrapp3ParNeedBasedEmploy;
        return this;
    }

    @JsonProperty("rcrapp3ParTaxDefPension")
    public Double getRcrapp3ParTaxDefPension() {
        return rcrapp3ParTaxDefPension;
    }

    @JsonProperty("rcrapp3ParTaxDefPension")
    public void setRcrapp3ParTaxDefPension(Double rcrapp3ParTaxDefPension) {
        this.rcrapp3ParTaxDefPension = rcrapp3ParTaxDefPension;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp3ParTaxDefPension(Double rcrapp3ParTaxDefPension) {
        this.rcrapp3ParTaxDefPension = rcrapp3ParTaxDefPension;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_MOTH_INC_FR_WRK
     * 
     */
    @JsonProperty("rnrvrfyMothIncFrWrk")
    public Double getRnrvrfyMothIncFrWrk() {
        return rnrvrfyMothIncFrWrk;
    }

    /**
     * Lineage reference object : RNRVRFY_MOTH_INC_FR_WRK
     * 
     */
    @JsonProperty("rnrvrfyMothIncFrWrk")
    public void setRnrvrfyMothIncFrWrk(Double rnrvrfyMothIncFrWrk) {
        this.rnrvrfyMothIncFrWrk = rnrvrfyMothIncFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyMothIncFrWrk(Double rnrvrfyMothIncFrWrk) {
        this.rnrvrfyMothIncFrWrk = rnrvrfyMothIncFrWrk;
        return this;
    }

    @JsonProperty("updParNoInColl")
    public String getUpdParNoInColl() {
        return updParNoInColl;
    }

    @JsonProperty("updParNoInColl")
    public void setUpdParNoInColl(String updParNoInColl) {
        this.updParNoInColl = updParNoInColl;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParNoInColl(String updParNoInColl) {
        this.updParNoInColl = updParNoInColl;
        return this;
    }

    @JsonProperty("updParHouseFoodOth")
    public String getUpdParHouseFoodOth() {
        return updParHouseFoodOth;
    }

    @JsonProperty("updParHouseFoodOth")
    public void setUpdParHouseFoodOth(String updParHouseFoodOth) {
        this.updParHouseFoodOth = updParHouseFoodOth;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParHouseFoodOth(String updParHouseFoodOth) {
        this.updParHouseFoodOth = updParHouseFoodOth;
        return this;
    }

    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN
     * 
     */
    @JsonProperty("rnrvrfyVaNonEducBen")
    public Double getRnrvrfyVaNonEducBen() {
        return rnrvrfyVaNonEducBen;
    }

    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN
     * 
     */
    @JsonProperty("rnrvrfyVaNonEducBen")
    public void setRnrvrfyVaNonEducBen(Double rnrvrfyVaNonEducBen) {
        this.rnrvrfyVaNonEducBen = rnrvrfyVaNonEducBen;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyVaNonEducBen(Double rnrvrfyVaNonEducBen) {
        this.rnrvrfyVaNonEducBen = rnrvrfyVaNonEducBen;
        return this;
    }

    /**
     * Untaxed IRA Distributions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_IRA_DIST
     * 
     */
    @JsonProperty("rnrvrfyUntaxedIraDist")
    public Double getRnrvrfyUntaxedIraDist() {
        return rnrvrfyUntaxedIraDist;
    }

    /**
     * Untaxed IRA Distributions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_IRA_DIST
     * 
     */
    @JsonProperty("rnrvrfyUntaxedIraDist")
    public void setRnrvrfyUntaxedIraDist(Double rnrvrfyUntaxedIraDist) {
        this.rnrvrfyUntaxedIraDist = rnrvrfyUntaxedIraDist;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyUntaxedIraDist(Double rnrvrfyUntaxedIraDist) {
        this.rnrvrfyUntaxedIraDist = rnrvrfyUntaxedIraDist;
        return this;
    }

    @JsonProperty("updParFamMemb")
    public String getUpdParFamMemb() {
        return updParFamMemb;
    }

    @JsonProperty("updParFamMemb")
    public void setUpdParFamMemb(String updParFamMemb) {
        this.updParFamMemb = updParFamMemb;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParFamMemb(String updParFamMemb) {
        this.updParFamMemb = updParFamMemb;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_FOOD_STAMPS
     * 
     */
    @JsonProperty("rnrvrfyFoodStamps")
    public String getRnrvrfyFoodStamps() {
        return rnrvrfyFoodStamps;
    }

    /**
     * Lineage reference object : RNRVRFY_FOOD_STAMPS
     * 
     */
    @JsonProperty("rnrvrfyFoodStamps")
    public void setRnrvrfyFoodStamps(String rnrvrfyFoodStamps) {
        this.rnrvrfyFoodStamps = rnrvrfyFoodStamps;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyFoodStamps(String rnrvrfyFoodStamps) {
        this.rnrvrfyFoodStamps = rnrvrfyFoodStamps;
        return this;
    }

    @JsonProperty("updParUsIncTaxPd")
    public String getUpdParUsIncTaxPd() {
        return updParUsIncTaxPd;
    }

    @JsonProperty("updParUsIncTaxPd")
    public void setUpdParUsIncTaxPd(String updParUsIncTaxPd) {
        this.updParUsIncTaxPd = updParUsIncTaxPd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParUsIncTaxPd(String updParUsIncTaxPd) {
        this.updParUsIncTaxPd = updParUsIncTaxPd;
        return this;
    }

    /**
     * Other Untaxed Income
     * <p>
     * Lineage reference object : RNRVRFY_ALL_OTHER_UNTAX_INC
     * 
     */
    @JsonProperty("rnrvrfyAllOtherUntaxInc")
    public Double getRnrvrfyAllOtherUntaxInc() {
        return rnrvrfyAllOtherUntaxInc;
    }

    /**
     * Other Untaxed Income
     * <p>
     * Lineage reference object : RNRVRFY_ALL_OTHER_UNTAX_INC
     * 
     */
    @JsonProperty("rnrvrfyAllOtherUntaxInc")
    public void setRnrvrfyAllOtherUntaxInc(Double rnrvrfyAllOtherUntaxInc) {
        this.rnrvrfyAllOtherUntaxInc = rnrvrfyAllOtherUntaxInc;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyAllOtherUntaxInc(Double rnrvrfyAllOtherUntaxInc) {
        this.rnrvrfyAllOtherUntaxInc = rnrvrfyAllOtherUntaxInc;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_DISL_WRK
     * 
     */
    @JsonProperty("rnrvrfyDislWrk")
    public String getRnrvrfyDislWrk() {
        return rnrvrfyDislWrk;
    }

    /**
     * Lineage reference object : RNRVRFY_DISL_WRK
     * 
     */
    @JsonProperty("rnrvrfyDislWrk")
    public void setRnrvrfyDislWrk(String rnrvrfyDislWrk) {
        this.rnrvrfyDislWrk = rnrvrfyDislWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyDislWrk(String rnrvrfyDislWrk) {
        this.rnrvrfyDislWrk = rnrvrfyDislWrk;
        return this;
    }

    @JsonProperty("rcrapp4ParCombatPay")
    public Double getRcrapp4ParCombatPay() {
        return rcrapp4ParCombatPay;
    }

    @JsonProperty("rcrapp4ParCombatPay")
    public void setRcrapp4ParCombatPay(Double rcrapp4ParCombatPay) {
        this.rcrapp4ParCombatPay = rcrapp4ParCombatPay;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp4ParCombatPay(Double rcrapp4ParCombatPay) {
        this.rcrapp4ParCombatPay = rcrapp4ParCombatPay;
        return this;
    }

    @JsonProperty("updParIntInc")
    public String getUpdParIntInc() {
        return updParIntInc;
    }

    @JsonProperty("updParIntInc")
    public void setUpdParIntInc(String updParIntInc) {
        this.updParIntInc = updParIntInc;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParIntInc(String updParIntInc) {
        this.updParIntInc = updParIntInc;
        return this;
    }

    @JsonProperty("updParIraKeogh")
    public String getUpdParIraKeogh() {
        return updParIraKeogh;
    }

    @JsonProperty("updParIraKeogh")
    public void setUpdParIraKeogh(String updParIraKeogh) {
        this.updParIraKeogh = updParIraKeogh;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParIraKeogh(String updParIraKeogh) {
        this.updParIraKeogh = updParIraKeogh;
        return this;
    }

    @JsonProperty("rcrapp3ParHouseFoodOth")
    public Double getRcrapp3ParHouseFoodOth() {
        return rcrapp3ParHouseFoodOth;
    }

    @JsonProperty("rcrapp3ParHouseFoodOth")
    public void setRcrapp3ParHouseFoodOth(Double rcrapp3ParHouseFoodOth) {
        this.rcrapp3ParHouseFoodOth = rcrapp3ParHouseFoodOth;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp3ParHouseFoodOth(Double rcrapp3ParHouseFoodOth) {
        this.rcrapp3ParHouseFoodOth = rcrapp3ParHouseFoodOth;
        return this;
    }

    @JsonProperty("rcrapp1ParOthUntaxInc")
    public Double getRcrapp1ParOthUntaxInc() {
        return rcrapp1ParOthUntaxInc;
    }

    @JsonProperty("rcrapp1ParOthUntaxInc")
    public void setRcrapp1ParOthUntaxInc(Double rcrapp1ParOthUntaxInc) {
        this.rcrapp1ParOthUntaxInc = rcrapp1ParOthUntaxInc;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp1ParOthUntaxInc(Double rcrapp1ParOthUntaxInc) {
        this.rcrapp1ParOthUntaxInc = rcrapp1ParOthUntaxInc;
        return this;
    }

    /**
     * Tax Exempt Interest
     * <p>
     * Lineage reference object : RNRVRFY_TAX_EXEMPT_INT_INC
     * 
     */
    @JsonProperty("rnrvrfyTaxExemptIntInc")
    public Double getRnrvrfyTaxExemptIntInc() {
        return rnrvrfyTaxExemptIntInc;
    }

    /**
     * Tax Exempt Interest
     * <p>
     * Lineage reference object : RNRVRFY_TAX_EXEMPT_INT_INC
     * 
     */
    @JsonProperty("rnrvrfyTaxExemptIntInc")
    public void setRnrvrfyTaxExemptIntInc(Double rnrvrfyTaxExemptIntInc) {
        this.rnrvrfyTaxExemptIntInc = rnrvrfyTaxExemptIntInc;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyTaxExemptIntInc(Double rnrvrfyTaxExemptIntInc) {
        this.rnrvrfyTaxExemptIntInc = rnrvrfyTaxExemptIntInc;
        return this;
    }

    @JsonProperty("rcrapp3ParTeIntInc")
    public Double getRcrapp3ParTeIntInc() {
        return rcrapp3ParTeIntInc;
    }

    @JsonProperty("rcrapp3ParTeIntInc")
    public void setRcrapp3ParTeIntInc(Double rcrapp3ParTeIntInc) {
        this.rcrapp3ParTeIntInc = rcrapp3ParTeIntInc;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp3ParTeIntInc(Double rcrapp3ParTeIntInc) {
        this.rcrapp3ParTeIntInc = rcrapp3ParTeIntInc;
        return this;
    }

    /**
     * Child Support Received
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP
     * 
     */
    @JsonProperty("rnrvrfyChildSupp")
    public Double getRnrvrfyChildSupp() {
        return rnrvrfyChildSupp;
    }

    /**
     * Child Support Received
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP
     * 
     */
    @JsonProperty("rnrvrfyChildSupp")
    public void setRnrvrfyChildSupp(Double rnrvrfyChildSupp) {
        this.rnrvrfyChildSupp = rnrvrfyChildSupp;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyChildSupp(Double rnrvrfyChildSupp) {
        this.rnrvrfyChildSupp = rnrvrfyChildSupp;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_FAM_MEMB
     * 
     */
    @JsonProperty("rnrvrfyFamMemb")
    public Double getRnrvrfyFamMemb() {
        return rnrvrfyFamMemb;
    }

    /**
     * Lineage reference object : RNRVRFY_FAM_MEMB
     * 
     */
    @JsonProperty("rnrvrfyFamMemb")
    public void setRnrvrfyFamMemb(Double rnrvrfyFamMemb) {
        this.rnrvrfyFamMemb = rnrvrfyFamMemb;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyFamMemb(Double rnrvrfyFamMemb) {
        this.rnrvrfyFamMemb = rnrvrfyFamMemb;
        return this;
    }

    /**
     * Tax-Deferred Pensions
     * <p>
     * Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT
     * 
     */
    @JsonProperty("rnrvrfyTaxDefPensPayt")
    public Double getRnrvrfyTaxDefPensPayt() {
        return rnrvrfyTaxDefPensPayt;
    }

    /**
     * Tax-Deferred Pensions
     * <p>
     * Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT
     * 
     */
    @JsonProperty("rnrvrfyTaxDefPensPayt")
    public void setRnrvrfyTaxDefPensPayt(Double rnrvrfyTaxDefPensPayt) {
        this.rnrvrfyTaxDefPensPayt = rnrvrfyTaxDefPensPayt;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyTaxDefPensPayt(Double rnrvrfyTaxDefPensPayt) {
        this.rnrvrfyTaxDefPensPayt = rnrvrfyTaxDefPensPayt;
        return this;
    }

    @JsonProperty("rcrapp3ParIraKeough")
    public Double getRcrapp3ParIraKeough() {
        return rcrapp3ParIraKeough;
    }

    @JsonProperty("rcrapp3ParIraKeough")
    public void setRcrapp3ParIraKeough(Double rcrapp3ParIraKeough) {
        this.rcrapp3ParIraKeough = rcrapp3ParIraKeough;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp3ParIraKeough(Double rcrapp3ParIraKeough) {
        this.rcrapp3ParIraKeough = rcrapp3ParIraKeough;
        return this;
    }

    @JsonProperty("rcrapp3ParGrantScholarAid")
    public Double getRcrapp3ParGrantScholarAid() {
        return rcrapp3ParGrantScholarAid;
    }

    @JsonProperty("rcrapp3ParGrantScholarAid")
    public void setRcrapp3ParGrantScholarAid(Double rcrapp3ParGrantScholarAid) {
        this.rcrapp3ParGrantScholarAid = rcrapp3ParGrantScholarAid;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp3ParGrantScholarAid(Double rcrapp3ParGrantScholarAid) {
        this.rcrapp3ParGrantScholarAid = rcrapp3ParGrantScholarAid;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public Object getKeyblckStudentId() {
        return keyblckStudentId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public void setKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_US_INC_TAX_PD
     * 
     */
    @JsonProperty("rnrvrfyUsIncTaxPd")
    public Double getRnrvrfyUsIncTaxPd() {
        return rnrvrfyUsIncTaxPd;
    }

    /**
     * Lineage reference object : RNRVRFY_US_INC_TAX_PD
     * 
     */
    @JsonProperty("rnrvrfyUsIncTaxPd")
    public void setRnrvrfyUsIncTaxPd(Double rnrvrfyUsIncTaxPd) {
        this.rnrvrfyUsIncTaxPd = rnrvrfyUsIncTaxPd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyUsIncTaxPd(Double rnrvrfyUsIncTaxPd) {
        this.rnrvrfyUsIncTaxPd = rnrvrfyUsIncTaxPd;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_FATH_INC_FR_WRK
     * 
     */
    @JsonProperty("rnrvrfyFathIncFrWrk")
    public Double getRnrvrfyFathIncFrWrk() {
        return rnrvrfyFathIncFrWrk;
    }

    /**
     * Lineage reference object : RNRVRFY_FATH_INC_FR_WRK
     * 
     */
    @JsonProperty("rnrvrfyFathIncFrWrk")
    public void setRnrvrfyFathIncFrWrk(Double rnrvrfyFathIncFrWrk) {
        this.rnrvrfyFathIncFrWrk = rnrvrfyFathIncFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyFathIncFrWrk(Double rnrvrfyFathIncFrWrk) {
        this.rnrvrfyFathIncFrWrk = rnrvrfyFathIncFrWrk;
        return this;
    }

    @JsonProperty("rcrapp1ParChildSupp")
    public Double getRcrapp1ParChildSupp() {
        return rcrapp1ParChildSupp;
    }

    @JsonProperty("rcrapp1ParChildSupp")
    public void setRcrapp1ParChildSupp(Double rcrapp1ParChildSupp) {
        this.rcrapp1ParChildSupp = rcrapp1ParChildSupp;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp1ParChildSupp(Double rcrapp1ParChildSupp) {
        this.rcrapp1ParChildSupp = rcrapp1ParChildSupp;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_ELIG_IND
     * 
     */
    @JsonProperty("rnrvrfyEligInd")
    public String getRnrvrfyEligInd() {
        return rnrvrfyEligInd;
    }

    /**
     * Lineage reference object : RNRVRFY_ELIG_IND
     * 
     */
    @JsonProperty("rnrvrfyEligInd")
    public void setRnrvrfyEligInd(String rnrvrfyEligInd) {
        this.rnrvrfyEligInd = rnrvrfyEligInd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyEligInd(String rnrvrfyEligInd) {
        this.rnrvrfyEligInd = rnrvrfyEligInd;
        return this;
    }

    /**
     * Pell Correction
     * <p>
     * Lineage reference object : pellInd
     * 
     */
    @JsonProperty("pellInd")
    public Object getPellInd() {
        return pellInd;
    }

    /**
     * Pell Correction
     * <p>
     * Lineage reference object : pellInd
     * 
     */
    @JsonProperty("pellInd")
    public void setPellInd(Object pellInd) {
        this.pellInd = pellInd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withPellInd(Object pellInd) {
        this.pellInd = pellInd;
        return this;
    }

    @JsonProperty("rcrapp1ParIraDistributions")
    public Double getRcrapp1ParIraDistributions() {
        return rcrapp1ParIraDistributions;
    }

    @JsonProperty("rcrapp1ParIraDistributions")
    public void setRcrapp1ParIraDistributions(Double rcrapp1ParIraDistributions) {
        this.rcrapp1ParIraDistributions = rcrapp1ParIraDistributions;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp1ParIraDistributions(Double rcrapp1ParIraDistributions) {
        this.rcrapp1ParIraDistributions = rcrapp1ParIraDistributions;
        return this;
    }

    @JsonProperty("updParTaxFilingStatus")
    public String getUpdParTaxFilingStatus() {
        return updParTaxFilingStatus;
    }

    @JsonProperty("updParTaxFilingStatus")
    public void setUpdParTaxFilingStatus(String updParTaxFilingStatus) {
        this.updParTaxFilingStatus = updParTaxFilingStatus;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParTaxFilingStatus(String updParTaxFilingStatus) {
        this.updParTaxFilingStatus = updParTaxFilingStatus;
        return this;
    }

    /**
     * Child Support Paid
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP_PD
     * 
     */
    @JsonProperty("rnrvrfyChildSuppPd")
    public Double getRnrvrfyChildSuppPd() {
        return rnrvrfyChildSuppPd;
    }

    /**
     * Child Support Paid
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP_PD
     * 
     */
    @JsonProperty("rnrvrfyChildSuppPd")
    public void setRnrvrfyChildSuppPd(Double rnrvrfyChildSuppPd) {
        this.rnrvrfyChildSuppPd = rnrvrfyChildSuppPd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyChildSuppPd(Double rnrvrfyChildSuppPd) {
        this.rnrvrfyChildSuppPd = rnrvrfyChildSuppPd;
        return this;
    }

    @JsonProperty("updParUsInc")
    public String getUpdParUsInc() {
        return updParUsInc;
    }

    @JsonProperty("updParUsInc")
    public void setUpdParUsInc(String updParUsInc) {
        this.updParUsInc = updParUsInc;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParUsInc(String updParUsInc) {
        this.updParUsInc = updParUsInc;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_US_INC
     * 
     */
    @JsonProperty("rnrvrfyUsInc")
    public Double getRnrvrfyUsInc() {
        return rnrvrfyUsInc;
    }

    /**
     * Lineage reference object : RNRVRFY_US_INC
     * 
     */
    @JsonProperty("rnrvrfyUsInc")
    public void setRnrvrfyUsInc(Double rnrvrfyUsInc) {
        this.rnrvrfyUsInc = rnrvrfyUsInc;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyUsInc(Double rnrvrfyUsInc) {
        this.rnrvrfyUsInc = rnrvrfyUsInc;
        return this;
    }

    /**
     * Untaxed Pensions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_PENSION
     * 
     */
    @JsonProperty("rnrvrfyUntaxedPension")
    public Double getRnrvrfyUntaxedPension() {
        return rnrvrfyUntaxedPension;
    }

    /**
     * Untaxed Pensions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_PENSION
     * 
     */
    @JsonProperty("rnrvrfyUntaxedPension")
    public void setRnrvrfyUntaxedPension(Double rnrvrfyUntaxedPension) {
        this.rnrvrfyUntaxedPension = rnrvrfyUntaxedPension;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyUntaxedPension(Double rnrvrfyUntaxedPension) {
        this.rnrvrfyUntaxedPension = rnrvrfyUntaxedPension;
        return this;
    }

    @JsonProperty("updParEducCredits")
    public String getUpdParEducCredits() {
        return updParEducCredits;
    }

    @JsonProperty("updParEducCredits")
    public void setUpdParEducCredits(String updParEducCredits) {
        this.updParEducCredits = updParEducCredits;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParEducCredits(String updParEducCredits) {
        this.updParEducCredits = updParEducCredits;
        return this;
    }

    @JsonProperty("updP1040EligInd")
    public String getUpdP1040EligInd() {
        return updP1040EligInd;
    }

    @JsonProperty("updP1040EligInd")
    public void setUpdP1040EligInd(String updP1040EligInd) {
        this.updP1040EligInd = updP1040EligInd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdP1040EligInd(String updP1040EligInd) {
        this.updP1040EligInd = updP1040EligInd;
        return this;
    }

    @JsonProperty("updParOthUntaxInc")
    public String getUpdParOthUntaxInc() {
        return updParOthUntaxInc;
    }

    @JsonProperty("updParOthUntaxInc")
    public void setUpdParOthUntaxInc(String updParOthUntaxInc) {
        this.updParOthUntaxInc = updParOthUntaxInc;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParOthUntaxInc(String updParOthUntaxInc) {
        this.updParOthUntaxInc = updParOthUntaxInc;
        return this;
    }

    @JsonProperty("updParUntaxedPensions")
    public String getUpdParUntaxedPensions() {
        return updParUntaxedPensions;
    }

    @JsonProperty("updParUntaxedPensions")
    public void setUpdParUntaxedPensions(String updParUntaxedPensions) {
        this.updParUntaxedPensions = updParUntaxedPensions;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParUntaxedPensions(String updParUntaxedPensions) {
        this.updParUntaxedPensions = updParUntaxedPensions;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_NO_IN_COLL
     * 
     */
    @JsonProperty("rnrvrfyNoInColl")
    public Double getRnrvrfyNoInColl() {
        return rnrvrfyNoInColl;
    }

    /**
     * Lineage reference object : RNRVRFY_NO_IN_COLL
     * 
     */
    @JsonProperty("rnrvrfyNoInColl")
    public void setRnrvrfyNoInColl(Double rnrvrfyNoInColl) {
        this.rnrvrfyNoInColl = rnrvrfyNoInColl;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyNoInColl(Double rnrvrfyNoInColl) {
        this.rnrvrfyNoInColl = rnrvrfyNoInColl;
        return this;
    }

    @JsonProperty("updParDislWrk")
    public String getUpdParDislWrk() {
        return updParDislWrk;
    }

    @JsonProperty("updParDislWrk")
    public void setUpdParDislWrk(String updParDislWrk) {
        this.updParDislWrk = updParDislWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParDislWrk(String updParDislWrk) {
        this.updParDislWrk = updParDislWrk;
        return this;
    }

    @JsonProperty("updParPensionPayments")
    public String getUpdParPensionPayments() {
        return updParPensionPayments;
    }

    @JsonProperty("updParPensionPayments")
    public void setUpdParPensionPayments(String updParPensionPayments) {
        this.updParPensionPayments = updParPensionPayments;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParPensionPayments(String updParPensionPayments) {
        this.updParPensionPayments = updParPensionPayments;
        return this;
    }

    @JsonProperty("updParIraDistributions")
    public String getUpdParIraDistributions() {
        return updParIraDistributions;
    }

    @JsonProperty("updParIraDistributions")
    public void setUpdParIraDistributions(String updParIraDistributions) {
        this.updParIraDistributions = updParIraDistributions;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParIraDistributions(String updParIraDistributions) {
        this.updParIraDistributions = updParIraDistributions;
        return this;
    }

    @JsonProperty("updParCoOpEarnings")
    public String getUpdParCoOpEarnings() {
        return updParCoOpEarnings;
    }

    @JsonProperty("updParCoOpEarnings")
    public void setUpdParCoOpEarnings(String updParCoOpEarnings) {
        this.updParCoOpEarnings = updParCoOpEarnings;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParCoOpEarnings(String updParCoOpEarnings) {
        this.updParCoOpEarnings = updParCoOpEarnings;
        return this;
    }

    @JsonProperty("updFathIncFrWrk")
    public String getUpdFathIncFrWrk() {
        return updFathIncFrWrk;
    }

    @JsonProperty("updFathIncFrWrk")
    public void setUpdFathIncFrWrk(String updFathIncFrWrk) {
        this.updFathIncFrWrk = updFathIncFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdFathIncFrWrk(String updFathIncFrWrk) {
        this.updFathIncFrWrk = updFathIncFrWrk;
        return this;
    }

    @JsonProperty("rcrapp1ParUntaxPensions")
    public Double getRcrapp1ParUntaxPensions() {
        return rcrapp1ParUntaxPensions;
    }

    @JsonProperty("rcrapp1ParUntaxPensions")
    public void setRcrapp1ParUntaxPensions(Double rcrapp1ParUntaxPensions) {
        this.rcrapp1ParUntaxPensions = rcrapp1ParUntaxPensions;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp1ParUntaxPensions(Double rcrapp1ParUntaxPensions) {
        this.rcrapp1ParUntaxPensions = rcrapp1ParUntaxPensions;
        return this;
    }

    /**
     * Education Tax Credits
     * <p>
     * Lineage reference object : RNRVRFY_ED_CREDITS
     * 
     */
    @JsonProperty("rnrvrfyEdCredits")
    public Double getRnrvrfyEdCredits() {
        return rnrvrfyEdCredits;
    }

    /**
     * Education Tax Credits
     * <p>
     * Lineage reference object : RNRVRFY_ED_CREDITS
     * 
     */
    @JsonProperty("rnrvrfyEdCredits")
    public void setRnrvrfyEdCredits(Double rnrvrfyEdCredits) {
        this.rnrvrfyEdCredits = rnrvrfyEdCredits;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyEdCredits(Double rnrvrfyEdCredits) {
        this.rnrvrfyEdCredits = rnrvrfyEdCredits;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_PAR_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("rnrvrfyParTaxFilingStatus")
    public String getRnrvrfyParTaxFilingStatus() {
        return rnrvrfyParTaxFilingStatus;
    }

    /**
     * Lineage reference object : RNRVRFY_PAR_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("rnrvrfyParTaxFilingStatus")
    public void setRnrvrfyParTaxFilingStatus(String rnrvrfyParTaxFilingStatus) {
        this.rnrvrfyParTaxFilingStatus = rnrvrfyParTaxFilingStatus;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyParTaxFilingStatus(String rnrvrfyParTaxFilingStatus) {
        this.rnrvrfyParTaxFilingStatus = rnrvrfyParTaxFilingStatus;
        return this;
    }

    /**
     * Co-op Earnings
     * <p>
     * Lineage reference object : RNRVRFY_CO_OP_EARNINGS
     * 
     */
    @JsonProperty("rnrvrfyCoOpEarnings")
    public Double getRnrvrfyCoOpEarnings() {
        return rnrvrfyCoOpEarnings;
    }

    /**
     * Co-op Earnings
     * <p>
     * Lineage reference object : RNRVRFY_CO_OP_EARNINGS
     * 
     */
    @JsonProperty("rnrvrfyCoOpEarnings")
    public void setRnrvrfyCoOpEarnings(Double rnrvrfyCoOpEarnings) {
        this.rnrvrfyCoOpEarnings = rnrvrfyCoOpEarnings;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyCoOpEarnings(Double rnrvrfyCoOpEarnings) {
        this.rnrvrfyCoOpEarnings = rnrvrfyCoOpEarnings;
        return this;
    }

    @JsonProperty("updParTaxFormInd")
    public String getUpdParTaxFormInd() {
        return updParTaxFormInd;
    }

    @JsonProperty("updParTaxFormInd")
    public void setUpdParTaxFormInd(String updParTaxFormInd) {
        this.updParTaxFormInd = updParTaxFormInd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParTaxFormInd(String updParTaxFormInd) {
        this.updParTaxFormInd = updParTaxFormInd;
        return this;
    }

    @JsonProperty("rcrapp1ParVetsNonEdBen")
    public Double getRcrapp1ParVetsNonEdBen() {
        return rcrapp1ParVetsNonEdBen;
    }

    @JsonProperty("rcrapp1ParVetsNonEdBen")
    public void setRcrapp1ParVetsNonEdBen(Double rcrapp1ParVetsNonEdBen) {
        this.rcrapp1ParVetsNonEdBen = rcrapp1ParVetsNonEdBen;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRcrapp1ParVetsNonEdBen(Double rcrapp1ParVetsNonEdBen) {
        this.rcrapp1ParVetsNonEdBen = rcrapp1ParVetsNonEdBen;
        return this;
    }

    /**
     * Military and Clergy Allowance
     * <p>
     * Lineage reference object : RNRVRFY_LIV_ALLOW_RECD
     * 
     */
    @JsonProperty("rnrvrfyLivAllowRecd")
    public Double getRnrvrfyLivAllowRecd() {
        return rnrvrfyLivAllowRecd;
    }

    /**
     * Military and Clergy Allowance
     * <p>
     * Lineage reference object : RNRVRFY_LIV_ALLOW_RECD
     * 
     */
    @JsonProperty("rnrvrfyLivAllowRecd")
    public void setRnrvrfyLivAllowRecd(Double rnrvrfyLivAllowRecd) {
        this.rnrvrfyLivAllowRecd = rnrvrfyLivAllowRecd;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyLivAllowRecd(Double rnrvrfyLivAllowRecd) {
        this.rnrvrfyLivAllowRecd = rnrvrfyLivAllowRecd;
        return this;
    }

    @JsonProperty("updParVetsNonEdBen")
    public String getUpdParVetsNonEdBen() {
        return updParVetsNonEdBen;
    }

    @JsonProperty("updParVetsNonEdBen")
    public void setUpdParVetsNonEdBen(String updParVetsNonEdBen) {
        this.updParVetsNonEdBen = updParVetsNonEdBen;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withUpdParVetsNonEdBen(String updParVetsNonEdBen) {
        this.updParVetsNonEdBen = updParVetsNonEdBen;
        return this;
    }

    /**
     * Combat Pay
     * <p>
     * Lineage reference object : RNRVRFY_COMBAT_PAY
     * 
     */
    @JsonProperty("rnrvrfyCombatPay")
    public Double getRnrvrfyCombatPay() {
        return rnrvrfyCombatPay;
    }

    /**
     * Combat Pay
     * <p>
     * Lineage reference object : RNRVRFY_COMBAT_PAY
     * 
     */
    @JsonProperty("rnrvrfyCombatPay")
    public void setRnrvrfyCombatPay(Double rnrvrfyCombatPay) {
        this.rnrvrfyCombatPay = rnrvrfyCombatPay;
    }

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withRnrvrfyCombatPay(Double rnrvrfyCombatPay) {
        this.rnrvrfyCombatPay = rnrvrfyCombatPay;
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

    public _20172018NeedAnalysisDocumentVerificationParent100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20172018NeedAnalysisDocumentVerificationParent100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("updParCombatPay");
        sb.append('=');
        sb.append(((this.updParCombatPay == null)?"<null>":this.updParCombatPay));
        sb.append(',');
        sb.append("rcrapp3ParEducCredits");
        sb.append('=');
        sb.append(((this.rcrapp3ParEducCredits == null)?"<null>":this.rcrapp3ParEducCredits));
        sb.append(',');
        sb.append("updMothIncFrWrk");
        sb.append('=');
        sb.append(((this.updMothIncFrWrk == null)?"<null>":this.updMothIncFrWrk));
        sb.append(',');
        sb.append("updParGrantScholarAid");
        sb.append('=');
        sb.append(((this.updParGrantScholarAid == null)?"<null>":this.updParGrantScholarAid));
        sb.append(',');
        sb.append("updParFoodStamps");
        sb.append('=');
        sb.append(((this.updParFoodStamps == null)?"<null>":this.updParFoodStamps));
        sb.append(',');
        sb.append("rnrvrfyIra");
        sb.append('=');
        sb.append(((this.rnrvrfyIra == null)?"<null>":this.rnrvrfyIra));
        sb.append(',');
        sb.append("updParNeedBasedEmploy");
        sb.append('=');
        sb.append(((this.updParNeedBasedEmploy == null)?"<null>":this.updParNeedBasedEmploy));
        sb.append(',');
        sb.append("rcrapp3ParChildSuppPaid");
        sb.append('=');
        sb.append(((this.rcrapp3ParChildSuppPaid == null)?"<null>":this.rcrapp3ParChildSuppPaid));
        sb.append(',');
        sb.append("updateRcrapp1Ind2");
        sb.append('=');
        sb.append(((this.updateRcrapp1Ind2 == null)?"<null>":this.updateRcrapp1Ind2));
        sb.append(',');
        sb.append("rnrvrfyTaxFormInd");
        sb.append('=');
        sb.append(((this.rnrvrfyTaxFormInd == null)?"<null>":this.rnrvrfyTaxFormInd));
        sb.append(',');
        sb.append("updParChildSupportReceived");
        sb.append('=');
        sb.append(((this.updParChildSupportReceived == null)?"<null>":this.updParChildSupportReceived));
        sb.append(',');
        sb.append("rcrapp3ParCoOpEarnings");
        sb.append('=');
        sb.append(((this.rcrapp3ParCoOpEarnings == null)?"<null>":this.rcrapp3ParCoOpEarnings));
        sb.append(',');
        sb.append("rnrvrfyTaxFinAidRecd");
        sb.append('=');
        sb.append(((this.rnrvrfyTaxFinAidRecd == null)?"<null>":this.rnrvrfyTaxFinAidRecd));
        sb.append(',');
        sb.append("rnrvrfyOtherTaxFinaid");
        sb.append('=');
        sb.append(((this.rnrvrfyOtherTaxFinaid == null)?"<null>":this.rnrvrfyOtherTaxFinaid));
        sb.append(',');
        sb.append("updParChildSuppPaid");
        sb.append('=');
        sb.append(((this.updParChildSuppPaid == null)?"<null>":this.updParChildSuppPaid));
        sb.append(',');
        sb.append("rcrapp3ParNeedBasedEmploy");
        sb.append('=');
        sb.append(((this.rcrapp3ParNeedBasedEmploy == null)?"<null>":this.rcrapp3ParNeedBasedEmploy));
        sb.append(',');
        sb.append("rcrapp3ParTaxDefPension");
        sb.append('=');
        sb.append(((this.rcrapp3ParTaxDefPension == null)?"<null>":this.rcrapp3ParTaxDefPension));
        sb.append(',');
        sb.append("rnrvrfyMothIncFrWrk");
        sb.append('=');
        sb.append(((this.rnrvrfyMothIncFrWrk == null)?"<null>":this.rnrvrfyMothIncFrWrk));
        sb.append(',');
        sb.append("updParNoInColl");
        sb.append('=');
        sb.append(((this.updParNoInColl == null)?"<null>":this.updParNoInColl));
        sb.append(',');
        sb.append("updParHouseFoodOth");
        sb.append('=');
        sb.append(((this.updParHouseFoodOth == null)?"<null>":this.updParHouseFoodOth));
        sb.append(',');
        sb.append("rnrvrfyVaNonEducBen");
        sb.append('=');
        sb.append(((this.rnrvrfyVaNonEducBen == null)?"<null>":this.rnrvrfyVaNonEducBen));
        sb.append(',');
        sb.append("rnrvrfyUntaxedIraDist");
        sb.append('=');
        sb.append(((this.rnrvrfyUntaxedIraDist == null)?"<null>":this.rnrvrfyUntaxedIraDist));
        sb.append(',');
        sb.append("updParFamMemb");
        sb.append('=');
        sb.append(((this.updParFamMemb == null)?"<null>":this.updParFamMemb));
        sb.append(',');
        sb.append("rnrvrfyFoodStamps");
        sb.append('=');
        sb.append(((this.rnrvrfyFoodStamps == null)?"<null>":this.rnrvrfyFoodStamps));
        sb.append(',');
        sb.append("updParUsIncTaxPd");
        sb.append('=');
        sb.append(((this.updParUsIncTaxPd == null)?"<null>":this.updParUsIncTaxPd));
        sb.append(',');
        sb.append("rnrvrfyAllOtherUntaxInc");
        sb.append('=');
        sb.append(((this.rnrvrfyAllOtherUntaxInc == null)?"<null>":this.rnrvrfyAllOtherUntaxInc));
        sb.append(',');
        sb.append("rnrvrfyDislWrk");
        sb.append('=');
        sb.append(((this.rnrvrfyDislWrk == null)?"<null>":this.rnrvrfyDislWrk));
        sb.append(',');
        sb.append("rcrapp4ParCombatPay");
        sb.append('=');
        sb.append(((this.rcrapp4ParCombatPay == null)?"<null>":this.rcrapp4ParCombatPay));
        sb.append(',');
        sb.append("updParIntInc");
        sb.append('=');
        sb.append(((this.updParIntInc == null)?"<null>":this.updParIntInc));
        sb.append(',');
        sb.append("updParIraKeogh");
        sb.append('=');
        sb.append(((this.updParIraKeogh == null)?"<null>":this.updParIraKeogh));
        sb.append(',');
        sb.append("rcrapp3ParHouseFoodOth");
        sb.append('=');
        sb.append(((this.rcrapp3ParHouseFoodOth == null)?"<null>":this.rcrapp3ParHouseFoodOth));
        sb.append(',');
        sb.append("rcrapp1ParOthUntaxInc");
        sb.append('=');
        sb.append(((this.rcrapp1ParOthUntaxInc == null)?"<null>":this.rcrapp1ParOthUntaxInc));
        sb.append(',');
        sb.append("rnrvrfyTaxExemptIntInc");
        sb.append('=');
        sb.append(((this.rnrvrfyTaxExemptIntInc == null)?"<null>":this.rnrvrfyTaxExemptIntInc));
        sb.append(',');
        sb.append("rcrapp3ParTeIntInc");
        sb.append('=');
        sb.append(((this.rcrapp3ParTeIntInc == null)?"<null>":this.rcrapp3ParTeIntInc));
        sb.append(',');
        sb.append("rnrvrfyChildSupp");
        sb.append('=');
        sb.append(((this.rnrvrfyChildSupp == null)?"<null>":this.rnrvrfyChildSupp));
        sb.append(',');
        sb.append("rnrvrfyFamMemb");
        sb.append('=');
        sb.append(((this.rnrvrfyFamMemb == null)?"<null>":this.rnrvrfyFamMemb));
        sb.append(',');
        sb.append("rnrvrfyTaxDefPensPayt");
        sb.append('=');
        sb.append(((this.rnrvrfyTaxDefPensPayt == null)?"<null>":this.rnrvrfyTaxDefPensPayt));
        sb.append(',');
        sb.append("rcrapp3ParIraKeough");
        sb.append('=');
        sb.append(((this.rcrapp3ParIraKeough == null)?"<null>":this.rcrapp3ParIraKeough));
        sb.append(',');
        sb.append("rcrapp3ParGrantScholarAid");
        sb.append('=');
        sb.append(((this.rcrapp3ParGrantScholarAid == null)?"<null>":this.rcrapp3ParGrantScholarAid));
        sb.append(',');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
        sb.append(',');
        sb.append("rnrvrfyUsIncTaxPd");
        sb.append('=');
        sb.append(((this.rnrvrfyUsIncTaxPd == null)?"<null>":this.rnrvrfyUsIncTaxPd));
        sb.append(',');
        sb.append("rnrvrfyFathIncFrWrk");
        sb.append('=');
        sb.append(((this.rnrvrfyFathIncFrWrk == null)?"<null>":this.rnrvrfyFathIncFrWrk));
        sb.append(',');
        sb.append("rcrapp1ParChildSupp");
        sb.append('=');
        sb.append(((this.rcrapp1ParChildSupp == null)?"<null>":this.rcrapp1ParChildSupp));
        sb.append(',');
        sb.append("rnrvrfyEligInd");
        sb.append('=');
        sb.append(((this.rnrvrfyEligInd == null)?"<null>":this.rnrvrfyEligInd));
        sb.append(',');
        sb.append("pellInd");
        sb.append('=');
        sb.append(((this.pellInd == null)?"<null>":this.pellInd));
        sb.append(',');
        sb.append("rcrapp1ParIraDistributions");
        sb.append('=');
        sb.append(((this.rcrapp1ParIraDistributions == null)?"<null>":this.rcrapp1ParIraDistributions));
        sb.append(',');
        sb.append("updParTaxFilingStatus");
        sb.append('=');
        sb.append(((this.updParTaxFilingStatus == null)?"<null>":this.updParTaxFilingStatus));
        sb.append(',');
        sb.append("rnrvrfyChildSuppPd");
        sb.append('=');
        sb.append(((this.rnrvrfyChildSuppPd == null)?"<null>":this.rnrvrfyChildSuppPd));
        sb.append(',');
        sb.append("updParUsInc");
        sb.append('=');
        sb.append(((this.updParUsInc == null)?"<null>":this.updParUsInc));
        sb.append(',');
        sb.append("rnrvrfyUsInc");
        sb.append('=');
        sb.append(((this.rnrvrfyUsInc == null)?"<null>":this.rnrvrfyUsInc));
        sb.append(',');
        sb.append("rnrvrfyUntaxedPension");
        sb.append('=');
        sb.append(((this.rnrvrfyUntaxedPension == null)?"<null>":this.rnrvrfyUntaxedPension));
        sb.append(',');
        sb.append("updParEducCredits");
        sb.append('=');
        sb.append(((this.updParEducCredits == null)?"<null>":this.updParEducCredits));
        sb.append(',');
        sb.append("updP1040EligInd");
        sb.append('=');
        sb.append(((this.updP1040EligInd == null)?"<null>":this.updP1040EligInd));
        sb.append(',');
        sb.append("updParOthUntaxInc");
        sb.append('=');
        sb.append(((this.updParOthUntaxInc == null)?"<null>":this.updParOthUntaxInc));
        sb.append(',');
        sb.append("updParUntaxedPensions");
        sb.append('=');
        sb.append(((this.updParUntaxedPensions == null)?"<null>":this.updParUntaxedPensions));
        sb.append(',');
        sb.append("rnrvrfyNoInColl");
        sb.append('=');
        sb.append(((this.rnrvrfyNoInColl == null)?"<null>":this.rnrvrfyNoInColl));
        sb.append(',');
        sb.append("updParDislWrk");
        sb.append('=');
        sb.append(((this.updParDislWrk == null)?"<null>":this.updParDislWrk));
        sb.append(',');
        sb.append("updParPensionPayments");
        sb.append('=');
        sb.append(((this.updParPensionPayments == null)?"<null>":this.updParPensionPayments));
        sb.append(',');
        sb.append("updParIraDistributions");
        sb.append('=');
        sb.append(((this.updParIraDistributions == null)?"<null>":this.updParIraDistributions));
        sb.append(',');
        sb.append("updParCoOpEarnings");
        sb.append('=');
        sb.append(((this.updParCoOpEarnings == null)?"<null>":this.updParCoOpEarnings));
        sb.append(',');
        sb.append("updFathIncFrWrk");
        sb.append('=');
        sb.append(((this.updFathIncFrWrk == null)?"<null>":this.updFathIncFrWrk));
        sb.append(',');
        sb.append("rcrapp1ParUntaxPensions");
        sb.append('=');
        sb.append(((this.rcrapp1ParUntaxPensions == null)?"<null>":this.rcrapp1ParUntaxPensions));
        sb.append(',');
        sb.append("rnrvrfyEdCredits");
        sb.append('=');
        sb.append(((this.rnrvrfyEdCredits == null)?"<null>":this.rnrvrfyEdCredits));
        sb.append(',');
        sb.append("rnrvrfyParTaxFilingStatus");
        sb.append('=');
        sb.append(((this.rnrvrfyParTaxFilingStatus == null)?"<null>":this.rnrvrfyParTaxFilingStatus));
        sb.append(',');
        sb.append("rnrvrfyCoOpEarnings");
        sb.append('=');
        sb.append(((this.rnrvrfyCoOpEarnings == null)?"<null>":this.rnrvrfyCoOpEarnings));
        sb.append(',');
        sb.append("updParTaxFormInd");
        sb.append('=');
        sb.append(((this.updParTaxFormInd == null)?"<null>":this.updParTaxFormInd));
        sb.append(',');
        sb.append("rcrapp1ParVetsNonEdBen");
        sb.append('=');
        sb.append(((this.rcrapp1ParVetsNonEdBen == null)?"<null>":this.rcrapp1ParVetsNonEdBen));
        sb.append(',');
        sb.append("rnrvrfyLivAllowRecd");
        sb.append('=');
        sb.append(((this.rnrvrfyLivAllowRecd == null)?"<null>":this.rnrvrfyLivAllowRecd));
        sb.append(',');
        sb.append("updParVetsNonEdBen");
        sb.append('=');
        sb.append(((this.updParVetsNonEdBen == null)?"<null>":this.updParVetsNonEdBen));
        sb.append(',');
        sb.append("rnrvrfyCombatPay");
        sb.append('=');
        sb.append(((this.rnrvrfyCombatPay == null)?"<null>":this.rnrvrfyCombatPay));
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
        result = ((result* 31)+((this.updParCombatPay == null)? 0 :this.updParCombatPay.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParEducCredits == null)? 0 :this.rcrapp3ParEducCredits.hashCode()));
        result = ((result* 31)+((this.updMothIncFrWrk == null)? 0 :this.updMothIncFrWrk.hashCode()));
        result = ((result* 31)+((this.updParGrantScholarAid == null)? 0 :this.updParGrantScholarAid.hashCode()));
        result = ((result* 31)+((this.updParFoodStamps == null)? 0 :this.updParFoodStamps.hashCode()));
        result = ((result* 31)+((this.rnrvrfyIra == null)? 0 :this.rnrvrfyIra.hashCode()));
        result = ((result* 31)+((this.updParNeedBasedEmploy == null)? 0 :this.updParNeedBasedEmploy.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParChildSuppPaid == null)? 0 :this.rcrapp3ParChildSuppPaid.hashCode()));
        result = ((result* 31)+((this.updateRcrapp1Ind2 == null)? 0 :this.updateRcrapp1Ind2 .hashCode()));
        result = ((result* 31)+((this.rnrvrfyTaxFormInd == null)? 0 :this.rnrvrfyTaxFormInd.hashCode()));
        result = ((result* 31)+((this.updParChildSupportReceived == null)? 0 :this.updParChildSupportReceived.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParCoOpEarnings == null)? 0 :this.rcrapp3ParCoOpEarnings.hashCode()));
        result = ((result* 31)+((this.rnrvrfyTaxFinAidRecd == null)? 0 :this.rnrvrfyTaxFinAidRecd.hashCode()));
        result = ((result* 31)+((this.rnrvrfyOtherTaxFinaid == null)? 0 :this.rnrvrfyOtherTaxFinaid.hashCode()));
        result = ((result* 31)+((this.updParChildSuppPaid == null)? 0 :this.updParChildSuppPaid.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParNeedBasedEmploy == null)? 0 :this.rcrapp3ParNeedBasedEmploy.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParTaxDefPension == null)? 0 :this.rcrapp3ParTaxDefPension.hashCode()));
        result = ((result* 31)+((this.rnrvrfyMothIncFrWrk == null)? 0 :this.rnrvrfyMothIncFrWrk.hashCode()));
        result = ((result* 31)+((this.updParNoInColl == null)? 0 :this.updParNoInColl.hashCode()));
        result = ((result* 31)+((this.updParHouseFoodOth == null)? 0 :this.updParHouseFoodOth.hashCode()));
        result = ((result* 31)+((this.rnrvrfyVaNonEducBen == null)? 0 :this.rnrvrfyVaNonEducBen.hashCode()));
        result = ((result* 31)+((this.rnrvrfyUntaxedIraDist == null)? 0 :this.rnrvrfyUntaxedIraDist.hashCode()));
        result = ((result* 31)+((this.updParFamMemb == null)? 0 :this.updParFamMemb.hashCode()));
        result = ((result* 31)+((this.rnrvrfyFoodStamps == null)? 0 :this.rnrvrfyFoodStamps.hashCode()));
        result = ((result* 31)+((this.updParUsIncTaxPd == null)? 0 :this.updParUsIncTaxPd.hashCode()));
        result = ((result* 31)+((this.rnrvrfyAllOtherUntaxInc == null)? 0 :this.rnrvrfyAllOtherUntaxInc.hashCode()));
        result = ((result* 31)+((this.rnrvrfyDislWrk == null)? 0 :this.rnrvrfyDislWrk.hashCode()));
        result = ((result* 31)+((this.rcrapp4ParCombatPay == null)? 0 :this.rcrapp4ParCombatPay.hashCode()));
        result = ((result* 31)+((this.updParIntInc == null)? 0 :this.updParIntInc.hashCode()));
        result = ((result* 31)+((this.updParIraKeogh == null)? 0 :this.updParIraKeogh.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParHouseFoodOth == null)? 0 :this.rcrapp3ParHouseFoodOth.hashCode()));
        result = ((result* 31)+((this.rcrapp1ParOthUntaxInc == null)? 0 :this.rcrapp1ParOthUntaxInc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rnrvrfyTaxExemptIntInc == null)? 0 :this.rnrvrfyTaxExemptIntInc.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParTeIntInc == null)? 0 :this.rcrapp3ParTeIntInc.hashCode()));
        result = ((result* 31)+((this.rnrvrfyChildSupp == null)? 0 :this.rnrvrfyChildSupp.hashCode()));
        result = ((result* 31)+((this.rnrvrfyFamMemb == null)? 0 :this.rnrvrfyFamMemb.hashCode()));
        result = ((result* 31)+((this.rnrvrfyTaxDefPensPayt == null)? 0 :this.rnrvrfyTaxDefPensPayt.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParIraKeough == null)? 0 :this.rcrapp3ParIraKeough.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParGrantScholarAid == null)? 0 :this.rcrapp3ParGrantScholarAid.hashCode()));
        result = ((result* 31)+((this.keyblckStudentId == null)? 0 :this.keyblckStudentId.hashCode()));
        result = ((result* 31)+((this.rnrvrfyUsIncTaxPd == null)? 0 :this.rnrvrfyUsIncTaxPd.hashCode()));
        result = ((result* 31)+((this.rnrvrfyFathIncFrWrk == null)? 0 :this.rnrvrfyFathIncFrWrk.hashCode()));
        result = ((result* 31)+((this.rcrapp1ParChildSupp == null)? 0 :this.rcrapp1ParChildSupp.hashCode()));
        result = ((result* 31)+((this.rnrvrfyEligInd == null)? 0 :this.rnrvrfyEligInd.hashCode()));
        result = ((result* 31)+((this.pellInd == null)? 0 :this.pellInd.hashCode()));
        result = ((result* 31)+((this.rcrapp1ParIraDistributions == null)? 0 :this.rcrapp1ParIraDistributions.hashCode()));
        result = ((result* 31)+((this.updParTaxFilingStatus == null)? 0 :this.updParTaxFilingStatus.hashCode()));
        result = ((result* 31)+((this.rnrvrfyChildSuppPd == null)? 0 :this.rnrvrfyChildSuppPd.hashCode()));
        result = ((result* 31)+((this.updParUsInc == null)? 0 :this.updParUsInc.hashCode()));
        result = ((result* 31)+((this.rnrvrfyUsInc == null)? 0 :this.rnrvrfyUsInc.hashCode()));
        result = ((result* 31)+((this.rnrvrfyUntaxedPension == null)? 0 :this.rnrvrfyUntaxedPension.hashCode()));
        result = ((result* 31)+((this.updParEducCredits == null)? 0 :this.updParEducCredits.hashCode()));
        result = ((result* 31)+((this.updP1040EligInd == null)? 0 :this.updP1040EligInd.hashCode()));
        result = ((result* 31)+((this.updParOthUntaxInc == null)? 0 :this.updParOthUntaxInc.hashCode()));
        result = ((result* 31)+((this.updParUntaxedPensions == null)? 0 :this.updParUntaxedPensions.hashCode()));
        result = ((result* 31)+((this.rnrvrfyNoInColl == null)? 0 :this.rnrvrfyNoInColl.hashCode()));
        result = ((result* 31)+((this.updParDislWrk == null)? 0 :this.updParDislWrk.hashCode()));
        result = ((result* 31)+((this.updParPensionPayments == null)? 0 :this.updParPensionPayments.hashCode()));
        result = ((result* 31)+((this.updParIraDistributions == null)? 0 :this.updParIraDistributions.hashCode()));
        result = ((result* 31)+((this.updParCoOpEarnings == null)? 0 :this.updParCoOpEarnings.hashCode()));
        result = ((result* 31)+((this.updFathIncFrWrk == null)? 0 :this.updFathIncFrWrk.hashCode()));
        result = ((result* 31)+((this.rcrapp1ParUntaxPensions == null)? 0 :this.rcrapp1ParUntaxPensions.hashCode()));
        result = ((result* 31)+((this.rnrvrfyEdCredits == null)? 0 :this.rnrvrfyEdCredits.hashCode()));
        result = ((result* 31)+((this.rnrvrfyParTaxFilingStatus == null)? 0 :this.rnrvrfyParTaxFilingStatus.hashCode()));
        result = ((result* 31)+((this.rnrvrfyCoOpEarnings == null)? 0 :this.rnrvrfyCoOpEarnings.hashCode()));
        result = ((result* 31)+((this.updParTaxFormInd == null)? 0 :this.updParTaxFormInd.hashCode()));
        result = ((result* 31)+((this.rcrapp1ParVetsNonEdBen == null)? 0 :this.rcrapp1ParVetsNonEdBen.hashCode()));
        result = ((result* 31)+((this.rnrvrfyLivAllowRecd == null)? 0 :this.rnrvrfyLivAllowRecd.hashCode()));
        result = ((result* 31)+((this.updParVetsNonEdBen == null)? 0 :this.updParVetsNonEdBen.hashCode()));
        result = ((result* 31)+((this.rnrvrfyCombatPay == null)? 0 :this.rnrvrfyCombatPay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20172018NeedAnalysisDocumentVerificationParent100PutRequest) == false) {
            return false;
        }
        _20172018NeedAnalysisDocumentVerificationParent100PutRequest rhs = ((_20172018NeedAnalysisDocumentVerificationParent100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.updParCombatPay == rhs.updParCombatPay)||((this.updParCombatPay!= null)&&this.updParCombatPay.equals(rhs.updParCombatPay)))&&((this.rcrapp3ParEducCredits == rhs.rcrapp3ParEducCredits)||((this.rcrapp3ParEducCredits!= null)&&this.rcrapp3ParEducCredits.equals(rhs.rcrapp3ParEducCredits))))&&((this.updMothIncFrWrk == rhs.updMothIncFrWrk)||((this.updMothIncFrWrk!= null)&&this.updMothIncFrWrk.equals(rhs.updMothIncFrWrk))))&&((this.updParGrantScholarAid == rhs.updParGrantScholarAid)||((this.updParGrantScholarAid!= null)&&this.updParGrantScholarAid.equals(rhs.updParGrantScholarAid))))&&((this.updParFoodStamps == rhs.updParFoodStamps)||((this.updParFoodStamps!= null)&&this.updParFoodStamps.equals(rhs.updParFoodStamps))))&&((this.rnrvrfyIra == rhs.rnrvrfyIra)||((this.rnrvrfyIra!= null)&&this.rnrvrfyIra.equals(rhs.rnrvrfyIra))))&&((this.updParNeedBasedEmploy == rhs.updParNeedBasedEmploy)||((this.updParNeedBasedEmploy!= null)&&this.updParNeedBasedEmploy.equals(rhs.updParNeedBasedEmploy))))&&((this.rcrapp3ParChildSuppPaid == rhs.rcrapp3ParChildSuppPaid)||((this.rcrapp3ParChildSuppPaid!= null)&&this.rcrapp3ParChildSuppPaid.equals(rhs.rcrapp3ParChildSuppPaid))))&&((this.updateRcrapp1Ind2 == rhs.updateRcrapp1Ind2)||((this.updateRcrapp1Ind2 != null)&&this.updateRcrapp1Ind2 .equals(rhs.updateRcrapp1Ind2))))&&((this.rnrvrfyTaxFormInd == rhs.rnrvrfyTaxFormInd)||((this.rnrvrfyTaxFormInd!= null)&&this.rnrvrfyTaxFormInd.equals(rhs.rnrvrfyTaxFormInd))))&&((this.updParChildSupportReceived == rhs.updParChildSupportReceived)||((this.updParChildSupportReceived!= null)&&this.updParChildSupportReceived.equals(rhs.updParChildSupportReceived))))&&((this.rcrapp3ParCoOpEarnings == rhs.rcrapp3ParCoOpEarnings)||((this.rcrapp3ParCoOpEarnings!= null)&&this.rcrapp3ParCoOpEarnings.equals(rhs.rcrapp3ParCoOpEarnings))))&&((this.rnrvrfyTaxFinAidRecd == rhs.rnrvrfyTaxFinAidRecd)||((this.rnrvrfyTaxFinAidRecd!= null)&&this.rnrvrfyTaxFinAidRecd.equals(rhs.rnrvrfyTaxFinAidRecd))))&&((this.rnrvrfyOtherTaxFinaid == rhs.rnrvrfyOtherTaxFinaid)||((this.rnrvrfyOtherTaxFinaid!= null)&&this.rnrvrfyOtherTaxFinaid.equals(rhs.rnrvrfyOtherTaxFinaid))))&&((this.updParChildSuppPaid == rhs.updParChildSuppPaid)||((this.updParChildSuppPaid!= null)&&this.updParChildSuppPaid.equals(rhs.updParChildSuppPaid))))&&((this.rcrapp3ParNeedBasedEmploy == rhs.rcrapp3ParNeedBasedEmploy)||((this.rcrapp3ParNeedBasedEmploy!= null)&&this.rcrapp3ParNeedBasedEmploy.equals(rhs.rcrapp3ParNeedBasedEmploy))))&&((this.rcrapp3ParTaxDefPension == rhs.rcrapp3ParTaxDefPension)||((this.rcrapp3ParTaxDefPension!= null)&&this.rcrapp3ParTaxDefPension.equals(rhs.rcrapp3ParTaxDefPension))))&&((this.rnrvrfyMothIncFrWrk == rhs.rnrvrfyMothIncFrWrk)||((this.rnrvrfyMothIncFrWrk!= null)&&this.rnrvrfyMothIncFrWrk.equals(rhs.rnrvrfyMothIncFrWrk))))&&((this.updParNoInColl == rhs.updParNoInColl)||((this.updParNoInColl!= null)&&this.updParNoInColl.equals(rhs.updParNoInColl))))&&((this.updParHouseFoodOth == rhs.updParHouseFoodOth)||((this.updParHouseFoodOth!= null)&&this.updParHouseFoodOth.equals(rhs.updParHouseFoodOth))))&&((this.rnrvrfyVaNonEducBen == rhs.rnrvrfyVaNonEducBen)||((this.rnrvrfyVaNonEducBen!= null)&&this.rnrvrfyVaNonEducBen.equals(rhs.rnrvrfyVaNonEducBen))))&&((this.rnrvrfyUntaxedIraDist == rhs.rnrvrfyUntaxedIraDist)||((this.rnrvrfyUntaxedIraDist!= null)&&this.rnrvrfyUntaxedIraDist.equals(rhs.rnrvrfyUntaxedIraDist))))&&((this.updParFamMemb == rhs.updParFamMemb)||((this.updParFamMemb!= null)&&this.updParFamMemb.equals(rhs.updParFamMemb))))&&((this.rnrvrfyFoodStamps == rhs.rnrvrfyFoodStamps)||((this.rnrvrfyFoodStamps!= null)&&this.rnrvrfyFoodStamps.equals(rhs.rnrvrfyFoodStamps))))&&((this.updParUsIncTaxPd == rhs.updParUsIncTaxPd)||((this.updParUsIncTaxPd!= null)&&this.updParUsIncTaxPd.equals(rhs.updParUsIncTaxPd))))&&((this.rnrvrfyAllOtherUntaxInc == rhs.rnrvrfyAllOtherUntaxInc)||((this.rnrvrfyAllOtherUntaxInc!= null)&&this.rnrvrfyAllOtherUntaxInc.equals(rhs.rnrvrfyAllOtherUntaxInc))))&&((this.rnrvrfyDislWrk == rhs.rnrvrfyDislWrk)||((this.rnrvrfyDislWrk!= null)&&this.rnrvrfyDislWrk.equals(rhs.rnrvrfyDislWrk))))&&((this.rcrapp4ParCombatPay == rhs.rcrapp4ParCombatPay)||((this.rcrapp4ParCombatPay!= null)&&this.rcrapp4ParCombatPay.equals(rhs.rcrapp4ParCombatPay))))&&((this.updParIntInc == rhs.updParIntInc)||((this.updParIntInc!= null)&&this.updParIntInc.equals(rhs.updParIntInc))))&&((this.updParIraKeogh == rhs.updParIraKeogh)||((this.updParIraKeogh!= null)&&this.updParIraKeogh.equals(rhs.updParIraKeogh))))&&((this.rcrapp3ParHouseFoodOth == rhs.rcrapp3ParHouseFoodOth)||((this.rcrapp3ParHouseFoodOth!= null)&&this.rcrapp3ParHouseFoodOth.equals(rhs.rcrapp3ParHouseFoodOth))))&&((this.rcrapp1ParOthUntaxInc == rhs.rcrapp1ParOthUntaxInc)||((this.rcrapp1ParOthUntaxInc!= null)&&this.rcrapp1ParOthUntaxInc.equals(rhs.rcrapp1ParOthUntaxInc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rnrvrfyTaxExemptIntInc == rhs.rnrvrfyTaxExemptIntInc)||((this.rnrvrfyTaxExemptIntInc!= null)&&this.rnrvrfyTaxExemptIntInc.equals(rhs.rnrvrfyTaxExemptIntInc))))&&((this.rcrapp3ParTeIntInc == rhs.rcrapp3ParTeIntInc)||((this.rcrapp3ParTeIntInc!= null)&&this.rcrapp3ParTeIntInc.equals(rhs.rcrapp3ParTeIntInc))))&&((this.rnrvrfyChildSupp == rhs.rnrvrfyChildSupp)||((this.rnrvrfyChildSupp!= null)&&this.rnrvrfyChildSupp.equals(rhs.rnrvrfyChildSupp))))&&((this.rnrvrfyFamMemb == rhs.rnrvrfyFamMemb)||((this.rnrvrfyFamMemb!= null)&&this.rnrvrfyFamMemb.equals(rhs.rnrvrfyFamMemb))))&&((this.rnrvrfyTaxDefPensPayt == rhs.rnrvrfyTaxDefPensPayt)||((this.rnrvrfyTaxDefPensPayt!= null)&&this.rnrvrfyTaxDefPensPayt.equals(rhs.rnrvrfyTaxDefPensPayt))))&&((this.rcrapp3ParIraKeough == rhs.rcrapp3ParIraKeough)||((this.rcrapp3ParIraKeough!= null)&&this.rcrapp3ParIraKeough.equals(rhs.rcrapp3ParIraKeough))))&&((this.rcrapp3ParGrantScholarAid == rhs.rcrapp3ParGrantScholarAid)||((this.rcrapp3ParGrantScholarAid!= null)&&this.rcrapp3ParGrantScholarAid.equals(rhs.rcrapp3ParGrantScholarAid))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))))&&((this.rnrvrfyUsIncTaxPd == rhs.rnrvrfyUsIncTaxPd)||((this.rnrvrfyUsIncTaxPd!= null)&&this.rnrvrfyUsIncTaxPd.equals(rhs.rnrvrfyUsIncTaxPd))))&&((this.rnrvrfyFathIncFrWrk == rhs.rnrvrfyFathIncFrWrk)||((this.rnrvrfyFathIncFrWrk!= null)&&this.rnrvrfyFathIncFrWrk.equals(rhs.rnrvrfyFathIncFrWrk))))&&((this.rcrapp1ParChildSupp == rhs.rcrapp1ParChildSupp)||((this.rcrapp1ParChildSupp!= null)&&this.rcrapp1ParChildSupp.equals(rhs.rcrapp1ParChildSupp))))&&((this.rnrvrfyEligInd == rhs.rnrvrfyEligInd)||((this.rnrvrfyEligInd!= null)&&this.rnrvrfyEligInd.equals(rhs.rnrvrfyEligInd))))&&((this.pellInd == rhs.pellInd)||((this.pellInd!= null)&&this.pellInd.equals(rhs.pellInd))))&&((this.rcrapp1ParIraDistributions == rhs.rcrapp1ParIraDistributions)||((this.rcrapp1ParIraDistributions!= null)&&this.rcrapp1ParIraDistributions.equals(rhs.rcrapp1ParIraDistributions))))&&((this.updParTaxFilingStatus == rhs.updParTaxFilingStatus)||((this.updParTaxFilingStatus!= null)&&this.updParTaxFilingStatus.equals(rhs.updParTaxFilingStatus))))&&((this.rnrvrfyChildSuppPd == rhs.rnrvrfyChildSuppPd)||((this.rnrvrfyChildSuppPd!= null)&&this.rnrvrfyChildSuppPd.equals(rhs.rnrvrfyChildSuppPd))))&&((this.updParUsInc == rhs.updParUsInc)||((this.updParUsInc!= null)&&this.updParUsInc.equals(rhs.updParUsInc))))&&((this.rnrvrfyUsInc == rhs.rnrvrfyUsInc)||((this.rnrvrfyUsInc!= null)&&this.rnrvrfyUsInc.equals(rhs.rnrvrfyUsInc))))&&((this.rnrvrfyUntaxedPension == rhs.rnrvrfyUntaxedPension)||((this.rnrvrfyUntaxedPension!= null)&&this.rnrvrfyUntaxedPension.equals(rhs.rnrvrfyUntaxedPension))))&&((this.updParEducCredits == rhs.updParEducCredits)||((this.updParEducCredits!= null)&&this.updParEducCredits.equals(rhs.updParEducCredits))))&&((this.updP1040EligInd == rhs.updP1040EligInd)||((this.updP1040EligInd!= null)&&this.updP1040EligInd.equals(rhs.updP1040EligInd))))&&((this.updParOthUntaxInc == rhs.updParOthUntaxInc)||((this.updParOthUntaxInc!= null)&&this.updParOthUntaxInc.equals(rhs.updParOthUntaxInc))))&&((this.updParUntaxedPensions == rhs.updParUntaxedPensions)||((this.updParUntaxedPensions!= null)&&this.updParUntaxedPensions.equals(rhs.updParUntaxedPensions))))&&((this.rnrvrfyNoInColl == rhs.rnrvrfyNoInColl)||((this.rnrvrfyNoInColl!= null)&&this.rnrvrfyNoInColl.equals(rhs.rnrvrfyNoInColl))))&&((this.updParDislWrk == rhs.updParDislWrk)||((this.updParDislWrk!= null)&&this.updParDislWrk.equals(rhs.updParDislWrk))))&&((this.updParPensionPayments == rhs.updParPensionPayments)||((this.updParPensionPayments!= null)&&this.updParPensionPayments.equals(rhs.updParPensionPayments))))&&((this.updParIraDistributions == rhs.updParIraDistributions)||((this.updParIraDistributions!= null)&&this.updParIraDistributions.equals(rhs.updParIraDistributions))))&&((this.updParCoOpEarnings == rhs.updParCoOpEarnings)||((this.updParCoOpEarnings!= null)&&this.updParCoOpEarnings.equals(rhs.updParCoOpEarnings))))&&((this.updFathIncFrWrk == rhs.updFathIncFrWrk)||((this.updFathIncFrWrk!= null)&&this.updFathIncFrWrk.equals(rhs.updFathIncFrWrk))))&&((this.rcrapp1ParUntaxPensions == rhs.rcrapp1ParUntaxPensions)||((this.rcrapp1ParUntaxPensions!= null)&&this.rcrapp1ParUntaxPensions.equals(rhs.rcrapp1ParUntaxPensions))))&&((this.rnrvrfyEdCredits == rhs.rnrvrfyEdCredits)||((this.rnrvrfyEdCredits!= null)&&this.rnrvrfyEdCredits.equals(rhs.rnrvrfyEdCredits))))&&((this.rnrvrfyParTaxFilingStatus == rhs.rnrvrfyParTaxFilingStatus)||((this.rnrvrfyParTaxFilingStatus!= null)&&this.rnrvrfyParTaxFilingStatus.equals(rhs.rnrvrfyParTaxFilingStatus))))&&((this.rnrvrfyCoOpEarnings == rhs.rnrvrfyCoOpEarnings)||((this.rnrvrfyCoOpEarnings!= null)&&this.rnrvrfyCoOpEarnings.equals(rhs.rnrvrfyCoOpEarnings))))&&((this.updParTaxFormInd == rhs.updParTaxFormInd)||((this.updParTaxFormInd!= null)&&this.updParTaxFormInd.equals(rhs.updParTaxFormInd))))&&((this.rcrapp1ParVetsNonEdBen == rhs.rcrapp1ParVetsNonEdBen)||((this.rcrapp1ParVetsNonEdBen!= null)&&this.rcrapp1ParVetsNonEdBen.equals(rhs.rcrapp1ParVetsNonEdBen))))&&((this.rnrvrfyLivAllowRecd == rhs.rnrvrfyLivAllowRecd)||((this.rnrvrfyLivAllowRecd!= null)&&this.rnrvrfyLivAllowRecd.equals(rhs.rnrvrfyLivAllowRecd))))&&((this.updParVetsNonEdBen == rhs.updParVetsNonEdBen)||((this.updParVetsNonEdBen!= null)&&this.updParVetsNonEdBen.equals(rhs.updParVetsNonEdBen))))&&((this.rnrvrfyCombatPay == rhs.rnrvrfyCombatPay)||((this.rnrvrfyCombatPay!= null)&&this.rnrvrfyCombatPay.equals(rhs.rnrvrfyCombatPay))));
    }

}
