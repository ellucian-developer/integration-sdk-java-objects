
package com.ellucian.generated.bpapi.ban._2020_2021_need_analysis_document_verification_parent.v1_0_0;

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
    "rnrvrfyRecdTanf",
    "updParCombatPay",
    "updParSchoolLunch",
    "updParIraPensions",
    "displayMothIncFrWrk",
    "displayParRecdWic",
    "rcrapp3ParEducCredits",
    "updMothIncFrWrk",
    "updParGrantScholarAid",
    "displayParDislWrk",
    "rnrvrfyIra",
    "updParFoodStamps",
    "updParNeedBasedEmploy",
    "rcrapp3ParChildSuppPaid",
    "rnrvrfyTaxFormInd",
    "updateRcrapp1Ind2",
    "updParChildSupportReceived",
    "rcrapp3ParCoOpEarnings",
    "rnrvrfyTaxFinAidRecd",
    "rnrvrfyOtherTaxFinaid",
    "rcrapp3ParNeedBasedEmploy",
    "updParChildSuppPaid",
    "rcrapp3ParTaxDefPension",
    "rnrvrfyMothIncFrWrk",
    "updParNoInColl",
    "updParHouseFoodOth",
    "displayParSchoolLunch",
    "rnrvrfyRecdSsi",
    "rnrvrfyVaNonEducBen",
    "updParWic",
    "updParFamMemb",
    "rnrvrfyFoodStamps",
    "updParUsIncTaxPd",
    "rnrvrfyAllOtherUntaxInc",
    "rcrapp4ParCombatPay",
    "rnrvrfyDislWrk",
    "rnrvrfyUntaxedIraPensions",
    "updParIntInc",
    "rcrapp3ParHouseFoodOth",
    "updParIraKeogh",
    "rcrapp1ParOthUntaxInc",
    "rnrvrfyTaxExemptIntInc",
    "displayParNoInColl",
    "rcrapp1ParIraPensions",
    "rcrapp3ParTeIntInc",
    "updPFiledSchedule1",
    "rnrvrfyChildSupp",
    "rnrvrfyFamMemb",
    "displayFathIncFrWrk",
    "rnrvrfyTaxDefPensPayt",
    "rnrvrfyFiledSchedule1",
    "displayParRecdSsi",
    "displayParUsInc",
    "federalBenefitsExist",
    "displayParUsIncTaxPd",
    "rcrapp3ParIraKeough",
    "rcrapp3ParGrantScholarAid",
    "displayVerificationPrtyDesc",
    "displayParRecdTanf",
    "displayParTaxFormInd",
    "rnrvrfyUsIncTaxPd",
    "rnrvrfyFathIncFrWrk",
    "updParRecdTanf",
    "rcrapp1ParChildSupp",
    "displayParTaxFilingStatus",
    "displayParFamMemb",
    "rcrapp1VerificationPrty",
    "updParTaxFilingStatus",
    "rnrvrfyChildSuppPd",
    "updParUsInc",
    "rnrvrfyUsInc",
    "updParEducCredits",
    "updParOthUntaxInc",
    "rnrvrfyNoInColl",
    "updParDislWrk",
    "updParPensionPayments",
    "updParRecdSsi",
    "rnrvrfySchoolLunch",
    "updParCoOpEarnings",
    "displayRcrapp4ParFiledSchedule1",
    "updFathIncFrWrk",
    "rnrvrfyRecdWic",
    "rnrvrfyEdCredits",
    "rnrvrfyCoOpEarnings",
    "rnrvrfyParTaxFilingStatus",
    "updParTaxFormInd",
    "rcrapp1ParVetsNonEdBen",
    "rnrvrfyLivAllowRecd",
    "updParVetsNonEdBen",
    "displayParFoodStamps",
    "rnrvrfyCombatPay"
})
@Generated("jsonschema2pojo")
public class _20202021NeedAnalysisDocumentVerificationParent100GetResponse {

    /**
     * Lineage reference object : RNRVRFY_RECD_TANF
     * 
     */
    @JsonProperty("rnrvrfyRecdTanf")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_RECD_TANF")
    private String rnrvrfyRecdTanf;
    @JsonProperty("updParCombatPay")
    private String updParCombatPay;
    @JsonProperty("updParSchoolLunch")
    private String updParSchoolLunch;
    @JsonProperty("updParIraPensions")
    private String updParIraPensions;
    /**
     * Parent 2 Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMothIncFrWrk")
    private Double displayMothIncFrWrk;
    /**
     * WIC
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParRecdWic")
    private String displayParRecdWic;
    @JsonProperty("rcrapp3ParEducCredits")
    private Double rcrapp3ParEducCredits;
    @JsonProperty("updMothIncFrWrk")
    private String updMothIncFrWrk;
    @JsonProperty("updParGrantScholarAid")
    private String updParGrantScholarAid;
    /**
     * Dislocated Worker
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParDislWrk")
    private String displayParDislWrk;
    /**
     * IRA and Keogh Deductions
     * <p>
     * Lineage reference object : RNRVRFY_IRA
     * 
     */
    @JsonProperty("rnrvrfyIra")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_IRA")
    private Double rnrvrfyIra;
    @JsonProperty("updParFoodStamps")
    private String updParFoodStamps;
    @JsonProperty("updParNeedBasedEmploy")
    private String updParNeedBasedEmploy;
    @JsonProperty("rcrapp3ParChildSuppPaid")
    private Double rcrapp3ParChildSuppPaid;
    /**
     * Lineage reference object : RNRVRFY_TAX_FORM_IND
     * 
     */
    @JsonProperty("rnrvrfyTaxFormInd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_FORM_IND")
    private String rnrvrfyTaxFormInd;
    /**
     * Update Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("updateRcrapp1Ind2")
    private String updateRcrapp1Ind2;
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
    @JsonProperty("rcrapp3ParNeedBasedEmploy")
    private Double rcrapp3ParNeedBasedEmploy;
    @JsonProperty("updParChildSuppPaid")
    private String updParChildSuppPaid;
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
     * Free or Reduced Lunch
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParSchoolLunch")
    private String displayParSchoolLunch;
    /**
     * Lineage reference object : RNRVRFY_RECD_SSI
     * 
     */
    @JsonProperty("rnrvrfyRecdSsi")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_RECD_SSI")
    private String rnrvrfyRecdSsi;
    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN
     * 
     */
    @JsonProperty("rnrvrfyVaNonEducBen")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN")
    private Double rnrvrfyVaNonEducBen;
    @JsonProperty("updParWic")
    private String updParWic;
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
    @JsonProperty("rcrapp4ParCombatPay")
    private Double rcrapp4ParCombatPay;
    /**
     * Lineage reference object : RNRVRFY_DISL_WRK
     * 
     */
    @JsonProperty("rnrvrfyDislWrk")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_DISL_WRK")
    private String rnrvrfyDislWrk;
    /**
     * Lineage reference object : RNRVRFY_UNTAX_IRA_PNS_DIST
     * 
     */
    @JsonProperty("rnrvrfyUntaxedIraPensions")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_UNTAX_IRA_PNS_DIST")
    private Double rnrvrfyUntaxedIraPensions;
    @JsonProperty("updParIntInc")
    private String updParIntInc;
    @JsonProperty("rcrapp3ParHouseFoodOth")
    private Double rcrapp3ParHouseFoodOth;
    @JsonProperty("updParIraKeogh")
    private String updParIraKeogh;
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
    /**
     * Number in College
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParNoInColl")
    private Double displayParNoInColl;
    @JsonProperty("rcrapp1ParIraPensions")
    private Double rcrapp1ParIraPensions;
    @JsonProperty("rcrapp3ParTeIntInc")
    private Double rcrapp3ParTeIntInc;
    @JsonProperty("updPFiledSchedule1")
    private String updPFiledSchedule1;
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
     * Parent 1 Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFathIncFrWrk")
    private Double displayFathIncFrWrk;
    /**
     * Tax-Deferred Pensions
     * <p>
     * Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT
     * 
     */
    @JsonProperty("rnrvrfyTaxDefPensPayt")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT")
    private Double rnrvrfyTaxDefPensPayt;
    /**
     * Lineage reference object : RNRVRFY_FILED_SCHED_1
     * 
     */
    @JsonProperty("rnrvrfyFiledSchedule1")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_FILED_SCHED_1")
    private String rnrvrfyFiledSchedule1;
    /**
     * Medical or SSI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParRecdSsi")
    private String displayParRecdSsi;
    /**
     * AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParUsInc")
    private Double displayParUsInc;
    /**
     * Federal Benefits Exist
     * <p>
     * 
     * 
     */
    @JsonProperty("federalBenefitsExist")
    private String federalBenefitsExist;
    /**
     * Tax Paid
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParUsIncTaxPd")
    private Double displayParUsIncTaxPd;
    @JsonProperty("rcrapp3ParIraKeough")
    private Double rcrapp3ParIraKeough;
    @JsonProperty("rcrapp3ParGrantScholarAid")
    private Double rcrapp3ParGrantScholarAid;
    @JsonProperty("displayVerificationPrtyDesc")
    private String displayVerificationPrtyDesc;
    /**
     * TANF
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParRecdTanf")
    private String displayParRecdTanf;
    /**
     * Type of Tax Return
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParTaxFormInd")
    private String displayParTaxFormInd;
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
    @JsonProperty("updParRecdTanf")
    private String updParRecdTanf;
    @JsonProperty("rcrapp1ParChildSupp")
    private Double rcrapp1ParChildSupp;
    /**
     * Tax Filing Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParTaxFilingStatus")
    private String displayParTaxFilingStatus;
    /**
     * Household Size
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParFamMemb")
    private Double displayParFamMemb;
    /**
     * Verification Group
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationPrty")
    private String rcrapp1VerificationPrty;
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
    @JsonProperty("updParEducCredits")
    private String updParEducCredits;
    @JsonProperty("updParOthUntaxInc")
    private String updParOthUntaxInc;
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
    @JsonProperty("updParRecdSsi")
    private String updParRecdSsi;
    /**
     * Lineage reference object : RNRVRFY_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("rnrvrfySchoolLunch")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_SCHOOL_LUNCH")
    private String rnrvrfySchoolLunch;
    @JsonProperty("updParCoOpEarnings")
    private String updParCoOpEarnings;
    @JsonProperty("displayRcrapp4ParFiledSchedule1")
    private String displayRcrapp4ParFiledSchedule1;
    @JsonProperty("updFathIncFrWrk")
    private String updFathIncFrWrk;
    /**
     * Lineage reference object : RNRVRFY_RECD_WIC
     * 
     */
    @JsonProperty("rnrvrfyRecdWic")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_RECD_WIC")
    private String rnrvrfyRecdWic;
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
     * Co-op Earnings
     * <p>
     * Lineage reference object : RNRVRFY_CO_OP_EARNINGS
     * 
     */
    @JsonProperty("rnrvrfyCoOpEarnings")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_CO_OP_EARNINGS")
    private Double rnrvrfyCoOpEarnings;
    /**
     * Lineage reference object : RNRVRFY_PAR_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("rnrvrfyParTaxFilingStatus")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_PAR_TAX_FILING_STATUS")
    private String rnrvrfyParTaxFilingStatus;
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
     * SNAP(Food Stamps)
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParFoodStamps")
    private String displayParFoodStamps;
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

    /**
     * Lineage reference object : RNRVRFY_RECD_TANF
     * 
     */
    @JsonProperty("rnrvrfyRecdTanf")
    public String getRnrvrfyRecdTanf() {
        return rnrvrfyRecdTanf;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_TANF
     * 
     */
    @JsonProperty("rnrvrfyRecdTanf")
    public void setRnrvrfyRecdTanf(String rnrvrfyRecdTanf) {
        this.rnrvrfyRecdTanf = rnrvrfyRecdTanf;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyRecdTanf(String rnrvrfyRecdTanf) {
        this.rnrvrfyRecdTanf = rnrvrfyRecdTanf;
        return this;
    }

    @JsonProperty("updParCombatPay")
    public String getUpdParCombatPay() {
        return updParCombatPay;
    }

    @JsonProperty("updParCombatPay")
    public void setUpdParCombatPay(String updParCombatPay) {
        this.updParCombatPay = updParCombatPay;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParCombatPay(String updParCombatPay) {
        this.updParCombatPay = updParCombatPay;
        return this;
    }

    @JsonProperty("updParSchoolLunch")
    public String getUpdParSchoolLunch() {
        return updParSchoolLunch;
    }

    @JsonProperty("updParSchoolLunch")
    public void setUpdParSchoolLunch(String updParSchoolLunch) {
        this.updParSchoolLunch = updParSchoolLunch;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParSchoolLunch(String updParSchoolLunch) {
        this.updParSchoolLunch = updParSchoolLunch;
        return this;
    }

    @JsonProperty("updParIraPensions")
    public String getUpdParIraPensions() {
        return updParIraPensions;
    }

    @JsonProperty("updParIraPensions")
    public void setUpdParIraPensions(String updParIraPensions) {
        this.updParIraPensions = updParIraPensions;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParIraPensions(String updParIraPensions) {
        this.updParIraPensions = updParIraPensions;
        return this;
    }

    /**
     * Parent 2 Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMothIncFrWrk")
    public Double getDisplayMothIncFrWrk() {
        return displayMothIncFrWrk;
    }

    /**
     * Parent 2 Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displayMothIncFrWrk")
    public void setDisplayMothIncFrWrk(Double displayMothIncFrWrk) {
        this.displayMothIncFrWrk = displayMothIncFrWrk;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayMothIncFrWrk(Double displayMothIncFrWrk) {
        this.displayMothIncFrWrk = displayMothIncFrWrk;
        return this;
    }

    /**
     * WIC
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParRecdWic")
    public String getDisplayParRecdWic() {
        return displayParRecdWic;
    }

    /**
     * WIC
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParRecdWic")
    public void setDisplayParRecdWic(String displayParRecdWic) {
        this.displayParRecdWic = displayParRecdWic;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParRecdWic(String displayParRecdWic) {
        this.displayParRecdWic = displayParRecdWic;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp3ParEducCredits(Double rcrapp3ParEducCredits) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdMothIncFrWrk(String updMothIncFrWrk) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParGrantScholarAid(String updParGrantScholarAid) {
        this.updParGrantScholarAid = updParGrantScholarAid;
        return this;
    }

    /**
     * Dislocated Worker
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParDislWrk")
    public String getDisplayParDislWrk() {
        return displayParDislWrk;
    }

    /**
     * Dislocated Worker
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParDislWrk")
    public void setDisplayParDislWrk(String displayParDislWrk) {
        this.displayParDislWrk = displayParDislWrk;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParDislWrk(String displayParDislWrk) {
        this.displayParDislWrk = displayParDislWrk;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyIra(Double rnrvrfyIra) {
        this.rnrvrfyIra = rnrvrfyIra;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParFoodStamps(String updParFoodStamps) {
        this.updParFoodStamps = updParFoodStamps;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParNeedBasedEmploy(String updParNeedBasedEmploy) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp3ParChildSuppPaid(Double rcrapp3ParChildSuppPaid) {
        this.rcrapp3ParChildSuppPaid = rcrapp3ParChildSuppPaid;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyTaxFormInd(String rnrvrfyTaxFormInd) {
        this.rnrvrfyTaxFormInd = rnrvrfyTaxFormInd;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdateRcrapp1Ind2(String updateRcrapp1Ind2) {
        this.updateRcrapp1Ind2 = updateRcrapp1Ind2;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParChildSupportReceived(String updParChildSupportReceived) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp3ParCoOpEarnings(Double rcrapp3ParCoOpEarnings) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyTaxFinAidRecd(Double rnrvrfyTaxFinAidRecd) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyOtherTaxFinaid(Double rnrvrfyOtherTaxFinaid) {
        this.rnrvrfyOtherTaxFinaid = rnrvrfyOtherTaxFinaid;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp3ParNeedBasedEmploy(Double rcrapp3ParNeedBasedEmploy) {
        this.rcrapp3ParNeedBasedEmploy = rcrapp3ParNeedBasedEmploy;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParChildSuppPaid(String updParChildSuppPaid) {
        this.updParChildSuppPaid = updParChildSuppPaid;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp3ParTaxDefPension(Double rcrapp3ParTaxDefPension) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyMothIncFrWrk(Double rnrvrfyMothIncFrWrk) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParNoInColl(String updParNoInColl) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParHouseFoodOth(String updParHouseFoodOth) {
        this.updParHouseFoodOth = updParHouseFoodOth;
        return this;
    }

    /**
     * Free or Reduced Lunch
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParSchoolLunch")
    public String getDisplayParSchoolLunch() {
        return displayParSchoolLunch;
    }

    /**
     * Free or Reduced Lunch
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParSchoolLunch")
    public void setDisplayParSchoolLunch(String displayParSchoolLunch) {
        this.displayParSchoolLunch = displayParSchoolLunch;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParSchoolLunch(String displayParSchoolLunch) {
        this.displayParSchoolLunch = displayParSchoolLunch;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_SSI
     * 
     */
    @JsonProperty("rnrvrfyRecdSsi")
    public String getRnrvrfyRecdSsi() {
        return rnrvrfyRecdSsi;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_SSI
     * 
     */
    @JsonProperty("rnrvrfyRecdSsi")
    public void setRnrvrfyRecdSsi(String rnrvrfyRecdSsi) {
        this.rnrvrfyRecdSsi = rnrvrfyRecdSsi;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyRecdSsi(String rnrvrfyRecdSsi) {
        this.rnrvrfyRecdSsi = rnrvrfyRecdSsi;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyVaNonEducBen(Double rnrvrfyVaNonEducBen) {
        this.rnrvrfyVaNonEducBen = rnrvrfyVaNonEducBen;
        return this;
    }

    @JsonProperty("updParWic")
    public String getUpdParWic() {
        return updParWic;
    }

    @JsonProperty("updParWic")
    public void setUpdParWic(String updParWic) {
        this.updParWic = updParWic;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParWic(String updParWic) {
        this.updParWic = updParWic;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParFamMemb(String updParFamMemb) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyFoodStamps(String rnrvrfyFoodStamps) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParUsIncTaxPd(String updParUsIncTaxPd) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyAllOtherUntaxInc(Double rnrvrfyAllOtherUntaxInc) {
        this.rnrvrfyAllOtherUntaxInc = rnrvrfyAllOtherUntaxInc;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp4ParCombatPay(Double rcrapp4ParCombatPay) {
        this.rcrapp4ParCombatPay = rcrapp4ParCombatPay;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyDislWrk(String rnrvrfyDislWrk) {
        this.rnrvrfyDislWrk = rnrvrfyDislWrk;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_UNTAX_IRA_PNS_DIST
     * 
     */
    @JsonProperty("rnrvrfyUntaxedIraPensions")
    public Double getRnrvrfyUntaxedIraPensions() {
        return rnrvrfyUntaxedIraPensions;
    }

    /**
     * Lineage reference object : RNRVRFY_UNTAX_IRA_PNS_DIST
     * 
     */
    @JsonProperty("rnrvrfyUntaxedIraPensions")
    public void setRnrvrfyUntaxedIraPensions(Double rnrvrfyUntaxedIraPensions) {
        this.rnrvrfyUntaxedIraPensions = rnrvrfyUntaxedIraPensions;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyUntaxedIraPensions(Double rnrvrfyUntaxedIraPensions) {
        this.rnrvrfyUntaxedIraPensions = rnrvrfyUntaxedIraPensions;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParIntInc(String updParIntInc) {
        this.updParIntInc = updParIntInc;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp3ParHouseFoodOth(Double rcrapp3ParHouseFoodOth) {
        this.rcrapp3ParHouseFoodOth = rcrapp3ParHouseFoodOth;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParIraKeogh(String updParIraKeogh) {
        this.updParIraKeogh = updParIraKeogh;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp1ParOthUntaxInc(Double rcrapp1ParOthUntaxInc) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyTaxExemptIntInc(Double rnrvrfyTaxExemptIntInc) {
        this.rnrvrfyTaxExemptIntInc = rnrvrfyTaxExemptIntInc;
        return this;
    }

    /**
     * Number in College
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParNoInColl")
    public Double getDisplayParNoInColl() {
        return displayParNoInColl;
    }

    /**
     * Number in College
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParNoInColl")
    public void setDisplayParNoInColl(Double displayParNoInColl) {
        this.displayParNoInColl = displayParNoInColl;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParNoInColl(Double displayParNoInColl) {
        this.displayParNoInColl = displayParNoInColl;
        return this;
    }

    @JsonProperty("rcrapp1ParIraPensions")
    public Double getRcrapp1ParIraPensions() {
        return rcrapp1ParIraPensions;
    }

    @JsonProperty("rcrapp1ParIraPensions")
    public void setRcrapp1ParIraPensions(Double rcrapp1ParIraPensions) {
        this.rcrapp1ParIraPensions = rcrapp1ParIraPensions;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp1ParIraPensions(Double rcrapp1ParIraPensions) {
        this.rcrapp1ParIraPensions = rcrapp1ParIraPensions;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp3ParTeIntInc(Double rcrapp3ParTeIntInc) {
        this.rcrapp3ParTeIntInc = rcrapp3ParTeIntInc;
        return this;
    }

    @JsonProperty("updPFiledSchedule1")
    public String getUpdPFiledSchedule1() {
        return updPFiledSchedule1;
    }

    @JsonProperty("updPFiledSchedule1")
    public void setUpdPFiledSchedule1(String updPFiledSchedule1) {
        this.updPFiledSchedule1 = updPFiledSchedule1;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdPFiledSchedule1(String updPFiledSchedule1) {
        this.updPFiledSchedule1 = updPFiledSchedule1;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyChildSupp(Double rnrvrfyChildSupp) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyFamMemb(Double rnrvrfyFamMemb) {
        this.rnrvrfyFamMemb = rnrvrfyFamMemb;
        return this;
    }

    /**
     * Parent 1 Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFathIncFrWrk")
    public Double getDisplayFathIncFrWrk() {
        return displayFathIncFrWrk;
    }

    /**
     * Parent 1 Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFathIncFrWrk")
    public void setDisplayFathIncFrWrk(Double displayFathIncFrWrk) {
        this.displayFathIncFrWrk = displayFathIncFrWrk;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayFathIncFrWrk(Double displayFathIncFrWrk) {
        this.displayFathIncFrWrk = displayFathIncFrWrk;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyTaxDefPensPayt(Double rnrvrfyTaxDefPensPayt) {
        this.rnrvrfyTaxDefPensPayt = rnrvrfyTaxDefPensPayt;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_FILED_SCHED_1
     * 
     */
    @JsonProperty("rnrvrfyFiledSchedule1")
    public String getRnrvrfyFiledSchedule1() {
        return rnrvrfyFiledSchedule1;
    }

    /**
     * Lineage reference object : RNRVRFY_FILED_SCHED_1
     * 
     */
    @JsonProperty("rnrvrfyFiledSchedule1")
    public void setRnrvrfyFiledSchedule1(String rnrvrfyFiledSchedule1) {
        this.rnrvrfyFiledSchedule1 = rnrvrfyFiledSchedule1;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyFiledSchedule1(String rnrvrfyFiledSchedule1) {
        this.rnrvrfyFiledSchedule1 = rnrvrfyFiledSchedule1;
        return this;
    }

    /**
     * Medical or SSI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParRecdSsi")
    public String getDisplayParRecdSsi() {
        return displayParRecdSsi;
    }

    /**
     * Medical or SSI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParRecdSsi")
    public void setDisplayParRecdSsi(String displayParRecdSsi) {
        this.displayParRecdSsi = displayParRecdSsi;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParRecdSsi(String displayParRecdSsi) {
        this.displayParRecdSsi = displayParRecdSsi;
        return this;
    }

    /**
     * AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParUsInc")
    public Double getDisplayParUsInc() {
        return displayParUsInc;
    }

    /**
     * AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParUsInc")
    public void setDisplayParUsInc(Double displayParUsInc) {
        this.displayParUsInc = displayParUsInc;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParUsInc(Double displayParUsInc) {
        this.displayParUsInc = displayParUsInc;
        return this;
    }

    /**
     * Federal Benefits Exist
     * <p>
     * 
     * 
     */
    @JsonProperty("federalBenefitsExist")
    public String getFederalBenefitsExist() {
        return federalBenefitsExist;
    }

    /**
     * Federal Benefits Exist
     * <p>
     * 
     * 
     */
    @JsonProperty("federalBenefitsExist")
    public void setFederalBenefitsExist(String federalBenefitsExist) {
        this.federalBenefitsExist = federalBenefitsExist;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withFederalBenefitsExist(String federalBenefitsExist) {
        this.federalBenefitsExist = federalBenefitsExist;
        return this;
    }

    /**
     * Tax Paid
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParUsIncTaxPd")
    public Double getDisplayParUsIncTaxPd() {
        return displayParUsIncTaxPd;
    }

    /**
     * Tax Paid
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParUsIncTaxPd")
    public void setDisplayParUsIncTaxPd(Double displayParUsIncTaxPd) {
        this.displayParUsIncTaxPd = displayParUsIncTaxPd;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParUsIncTaxPd(Double displayParUsIncTaxPd) {
        this.displayParUsIncTaxPd = displayParUsIncTaxPd;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp3ParIraKeough(Double rcrapp3ParIraKeough) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp3ParGrantScholarAid(Double rcrapp3ParGrantScholarAid) {
        this.rcrapp3ParGrantScholarAid = rcrapp3ParGrantScholarAid;
        return this;
    }

    @JsonProperty("displayVerificationPrtyDesc")
    public String getDisplayVerificationPrtyDesc() {
        return displayVerificationPrtyDesc;
    }

    @JsonProperty("displayVerificationPrtyDesc")
    public void setDisplayVerificationPrtyDesc(String displayVerificationPrtyDesc) {
        this.displayVerificationPrtyDesc = displayVerificationPrtyDesc;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayVerificationPrtyDesc(String displayVerificationPrtyDesc) {
        this.displayVerificationPrtyDesc = displayVerificationPrtyDesc;
        return this;
    }

    /**
     * TANF
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParRecdTanf")
    public String getDisplayParRecdTanf() {
        return displayParRecdTanf;
    }

    /**
     * TANF
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParRecdTanf")
    public void setDisplayParRecdTanf(String displayParRecdTanf) {
        this.displayParRecdTanf = displayParRecdTanf;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParRecdTanf(String displayParRecdTanf) {
        this.displayParRecdTanf = displayParRecdTanf;
        return this;
    }

    /**
     * Type of Tax Return
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParTaxFormInd")
    public String getDisplayParTaxFormInd() {
        return displayParTaxFormInd;
    }

    /**
     * Type of Tax Return
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParTaxFormInd")
    public void setDisplayParTaxFormInd(String displayParTaxFormInd) {
        this.displayParTaxFormInd = displayParTaxFormInd;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParTaxFormInd(String displayParTaxFormInd) {
        this.displayParTaxFormInd = displayParTaxFormInd;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyUsIncTaxPd(Double rnrvrfyUsIncTaxPd) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyFathIncFrWrk(Double rnrvrfyFathIncFrWrk) {
        this.rnrvrfyFathIncFrWrk = rnrvrfyFathIncFrWrk;
        return this;
    }

    @JsonProperty("updParRecdTanf")
    public String getUpdParRecdTanf() {
        return updParRecdTanf;
    }

    @JsonProperty("updParRecdTanf")
    public void setUpdParRecdTanf(String updParRecdTanf) {
        this.updParRecdTanf = updParRecdTanf;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParRecdTanf(String updParRecdTanf) {
        this.updParRecdTanf = updParRecdTanf;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp1ParChildSupp(Double rcrapp1ParChildSupp) {
        this.rcrapp1ParChildSupp = rcrapp1ParChildSupp;
        return this;
    }

    /**
     * Tax Filing Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParTaxFilingStatus")
    public String getDisplayParTaxFilingStatus() {
        return displayParTaxFilingStatus;
    }

    /**
     * Tax Filing Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParTaxFilingStatus")
    public void setDisplayParTaxFilingStatus(String displayParTaxFilingStatus) {
        this.displayParTaxFilingStatus = displayParTaxFilingStatus;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParTaxFilingStatus(String displayParTaxFilingStatus) {
        this.displayParTaxFilingStatus = displayParTaxFilingStatus;
        return this;
    }

    /**
     * Household Size
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParFamMemb")
    public Double getDisplayParFamMemb() {
        return displayParFamMemb;
    }

    /**
     * Household Size
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParFamMemb")
    public void setDisplayParFamMemb(Double displayParFamMemb) {
        this.displayParFamMemb = displayParFamMemb;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParFamMemb(Double displayParFamMemb) {
        this.displayParFamMemb = displayParFamMemb;
        return this;
    }

    /**
     * Verification Group
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationPrty")
    public String getRcrapp1VerificationPrty() {
        return rcrapp1VerificationPrty;
    }

    /**
     * Verification Group
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationPrty")
    public void setRcrapp1VerificationPrty(String rcrapp1VerificationPrty) {
        this.rcrapp1VerificationPrty = rcrapp1VerificationPrty;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp1VerificationPrty(String rcrapp1VerificationPrty) {
        this.rcrapp1VerificationPrty = rcrapp1VerificationPrty;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParTaxFilingStatus(String updParTaxFilingStatus) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyChildSuppPd(Double rnrvrfyChildSuppPd) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParUsInc(String updParUsInc) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyUsInc(Double rnrvrfyUsInc) {
        this.rnrvrfyUsInc = rnrvrfyUsInc;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParEducCredits(String updParEducCredits) {
        this.updParEducCredits = updParEducCredits;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParOthUntaxInc(String updParOthUntaxInc) {
        this.updParOthUntaxInc = updParOthUntaxInc;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyNoInColl(Double rnrvrfyNoInColl) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParDislWrk(String updParDislWrk) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParPensionPayments(String updParPensionPayments) {
        this.updParPensionPayments = updParPensionPayments;
        return this;
    }

    @JsonProperty("updParRecdSsi")
    public String getUpdParRecdSsi() {
        return updParRecdSsi;
    }

    @JsonProperty("updParRecdSsi")
    public void setUpdParRecdSsi(String updParRecdSsi) {
        this.updParRecdSsi = updParRecdSsi;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParRecdSsi(String updParRecdSsi) {
        this.updParRecdSsi = updParRecdSsi;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("rnrvrfySchoolLunch")
    public String getRnrvrfySchoolLunch() {
        return rnrvrfySchoolLunch;
    }

    /**
     * Lineage reference object : RNRVRFY_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("rnrvrfySchoolLunch")
    public void setRnrvrfySchoolLunch(String rnrvrfySchoolLunch) {
        this.rnrvrfySchoolLunch = rnrvrfySchoolLunch;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfySchoolLunch(String rnrvrfySchoolLunch) {
        this.rnrvrfySchoolLunch = rnrvrfySchoolLunch;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParCoOpEarnings(String updParCoOpEarnings) {
        this.updParCoOpEarnings = updParCoOpEarnings;
        return this;
    }

    @JsonProperty("displayRcrapp4ParFiledSchedule1")
    public String getDisplayRcrapp4ParFiledSchedule1() {
        return displayRcrapp4ParFiledSchedule1;
    }

    @JsonProperty("displayRcrapp4ParFiledSchedule1")
    public void setDisplayRcrapp4ParFiledSchedule1(String displayRcrapp4ParFiledSchedule1) {
        this.displayRcrapp4ParFiledSchedule1 = displayRcrapp4ParFiledSchedule1;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayRcrapp4ParFiledSchedule1(String displayRcrapp4ParFiledSchedule1) {
        this.displayRcrapp4ParFiledSchedule1 = displayRcrapp4ParFiledSchedule1;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdFathIncFrWrk(String updFathIncFrWrk) {
        this.updFathIncFrWrk = updFathIncFrWrk;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_WIC
     * 
     */
    @JsonProperty("rnrvrfyRecdWic")
    public String getRnrvrfyRecdWic() {
        return rnrvrfyRecdWic;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_WIC
     * 
     */
    @JsonProperty("rnrvrfyRecdWic")
    public void setRnrvrfyRecdWic(String rnrvrfyRecdWic) {
        this.rnrvrfyRecdWic = rnrvrfyRecdWic;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyRecdWic(String rnrvrfyRecdWic) {
        this.rnrvrfyRecdWic = rnrvrfyRecdWic;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyEdCredits(Double rnrvrfyEdCredits) {
        this.rnrvrfyEdCredits = rnrvrfyEdCredits;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyCoOpEarnings(Double rnrvrfyCoOpEarnings) {
        this.rnrvrfyCoOpEarnings = rnrvrfyCoOpEarnings;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyParTaxFilingStatus(String rnrvrfyParTaxFilingStatus) {
        this.rnrvrfyParTaxFilingStatus = rnrvrfyParTaxFilingStatus;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParTaxFormInd(String updParTaxFormInd) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRcrapp1ParVetsNonEdBen(Double rcrapp1ParVetsNonEdBen) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyLivAllowRecd(Double rnrvrfyLivAllowRecd) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withUpdParVetsNonEdBen(String updParVetsNonEdBen) {
        this.updParVetsNonEdBen = updParVetsNonEdBen;
        return this;
    }

    /**
     * SNAP(Food Stamps)
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParFoodStamps")
    public String getDisplayParFoodStamps() {
        return displayParFoodStamps;
    }

    /**
     * SNAP(Food Stamps)
     * <p>
     * 
     * 
     */
    @JsonProperty("displayParFoodStamps")
    public void setDisplayParFoodStamps(String displayParFoodStamps) {
        this.displayParFoodStamps = displayParFoodStamps;
    }

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withDisplayParFoodStamps(String displayParFoodStamps) {
        this.displayParFoodStamps = displayParFoodStamps;
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withRnrvrfyCombatPay(Double rnrvrfyCombatPay) {
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

    public _20202021NeedAnalysisDocumentVerificationParent100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20202021NeedAnalysisDocumentVerificationParent100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rnrvrfyRecdTanf");
        sb.append('=');
        sb.append(((this.rnrvrfyRecdTanf == null)?"<null>":this.rnrvrfyRecdTanf));
        sb.append(',');
        sb.append("updParCombatPay");
        sb.append('=');
        sb.append(((this.updParCombatPay == null)?"<null>":this.updParCombatPay));
        sb.append(',');
        sb.append("updParSchoolLunch");
        sb.append('=');
        sb.append(((this.updParSchoolLunch == null)?"<null>":this.updParSchoolLunch));
        sb.append(',');
        sb.append("updParIraPensions");
        sb.append('=');
        sb.append(((this.updParIraPensions == null)?"<null>":this.updParIraPensions));
        sb.append(',');
        sb.append("displayMothIncFrWrk");
        sb.append('=');
        sb.append(((this.displayMothIncFrWrk == null)?"<null>":this.displayMothIncFrWrk));
        sb.append(',');
        sb.append("displayParRecdWic");
        sb.append('=');
        sb.append(((this.displayParRecdWic == null)?"<null>":this.displayParRecdWic));
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
        sb.append("displayParDislWrk");
        sb.append('=');
        sb.append(((this.displayParDislWrk == null)?"<null>":this.displayParDislWrk));
        sb.append(',');
        sb.append("rnrvrfyIra");
        sb.append('=');
        sb.append(((this.rnrvrfyIra == null)?"<null>":this.rnrvrfyIra));
        sb.append(',');
        sb.append("updParFoodStamps");
        sb.append('=');
        sb.append(((this.updParFoodStamps == null)?"<null>":this.updParFoodStamps));
        sb.append(',');
        sb.append("updParNeedBasedEmploy");
        sb.append('=');
        sb.append(((this.updParNeedBasedEmploy == null)?"<null>":this.updParNeedBasedEmploy));
        sb.append(',');
        sb.append("rcrapp3ParChildSuppPaid");
        sb.append('=');
        sb.append(((this.rcrapp3ParChildSuppPaid == null)?"<null>":this.rcrapp3ParChildSuppPaid));
        sb.append(',');
        sb.append("rnrvrfyTaxFormInd");
        sb.append('=');
        sb.append(((this.rnrvrfyTaxFormInd == null)?"<null>":this.rnrvrfyTaxFormInd));
        sb.append(',');
        sb.append("updateRcrapp1Ind2");
        sb.append('=');
        sb.append(((this.updateRcrapp1Ind2 == null)?"<null>":this.updateRcrapp1Ind2));
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
        sb.append("rcrapp3ParNeedBasedEmploy");
        sb.append('=');
        sb.append(((this.rcrapp3ParNeedBasedEmploy == null)?"<null>":this.rcrapp3ParNeedBasedEmploy));
        sb.append(',');
        sb.append("updParChildSuppPaid");
        sb.append('=');
        sb.append(((this.updParChildSuppPaid == null)?"<null>":this.updParChildSuppPaid));
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
        sb.append("displayParSchoolLunch");
        sb.append('=');
        sb.append(((this.displayParSchoolLunch == null)?"<null>":this.displayParSchoolLunch));
        sb.append(',');
        sb.append("rnrvrfyRecdSsi");
        sb.append('=');
        sb.append(((this.rnrvrfyRecdSsi == null)?"<null>":this.rnrvrfyRecdSsi));
        sb.append(',');
        sb.append("rnrvrfyVaNonEducBen");
        sb.append('=');
        sb.append(((this.rnrvrfyVaNonEducBen == null)?"<null>":this.rnrvrfyVaNonEducBen));
        sb.append(',');
        sb.append("updParWic");
        sb.append('=');
        sb.append(((this.updParWic == null)?"<null>":this.updParWic));
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
        sb.append("rcrapp4ParCombatPay");
        sb.append('=');
        sb.append(((this.rcrapp4ParCombatPay == null)?"<null>":this.rcrapp4ParCombatPay));
        sb.append(',');
        sb.append("rnrvrfyDislWrk");
        sb.append('=');
        sb.append(((this.rnrvrfyDislWrk == null)?"<null>":this.rnrvrfyDislWrk));
        sb.append(',');
        sb.append("rnrvrfyUntaxedIraPensions");
        sb.append('=');
        sb.append(((this.rnrvrfyUntaxedIraPensions == null)?"<null>":this.rnrvrfyUntaxedIraPensions));
        sb.append(',');
        sb.append("updParIntInc");
        sb.append('=');
        sb.append(((this.updParIntInc == null)?"<null>":this.updParIntInc));
        sb.append(',');
        sb.append("rcrapp3ParHouseFoodOth");
        sb.append('=');
        sb.append(((this.rcrapp3ParHouseFoodOth == null)?"<null>":this.rcrapp3ParHouseFoodOth));
        sb.append(',');
        sb.append("updParIraKeogh");
        sb.append('=');
        sb.append(((this.updParIraKeogh == null)?"<null>":this.updParIraKeogh));
        sb.append(',');
        sb.append("rcrapp1ParOthUntaxInc");
        sb.append('=');
        sb.append(((this.rcrapp1ParOthUntaxInc == null)?"<null>":this.rcrapp1ParOthUntaxInc));
        sb.append(',');
        sb.append("rnrvrfyTaxExemptIntInc");
        sb.append('=');
        sb.append(((this.rnrvrfyTaxExemptIntInc == null)?"<null>":this.rnrvrfyTaxExemptIntInc));
        sb.append(',');
        sb.append("displayParNoInColl");
        sb.append('=');
        sb.append(((this.displayParNoInColl == null)?"<null>":this.displayParNoInColl));
        sb.append(',');
        sb.append("rcrapp1ParIraPensions");
        sb.append('=');
        sb.append(((this.rcrapp1ParIraPensions == null)?"<null>":this.rcrapp1ParIraPensions));
        sb.append(',');
        sb.append("rcrapp3ParTeIntInc");
        sb.append('=');
        sb.append(((this.rcrapp3ParTeIntInc == null)?"<null>":this.rcrapp3ParTeIntInc));
        sb.append(',');
        sb.append("updPFiledSchedule1");
        sb.append('=');
        sb.append(((this.updPFiledSchedule1 == null)?"<null>":this.updPFiledSchedule1));
        sb.append(',');
        sb.append("rnrvrfyChildSupp");
        sb.append('=');
        sb.append(((this.rnrvrfyChildSupp == null)?"<null>":this.rnrvrfyChildSupp));
        sb.append(',');
        sb.append("rnrvrfyFamMemb");
        sb.append('=');
        sb.append(((this.rnrvrfyFamMemb == null)?"<null>":this.rnrvrfyFamMemb));
        sb.append(',');
        sb.append("displayFathIncFrWrk");
        sb.append('=');
        sb.append(((this.displayFathIncFrWrk == null)?"<null>":this.displayFathIncFrWrk));
        sb.append(',');
        sb.append("rnrvrfyTaxDefPensPayt");
        sb.append('=');
        sb.append(((this.rnrvrfyTaxDefPensPayt == null)?"<null>":this.rnrvrfyTaxDefPensPayt));
        sb.append(',');
        sb.append("rnrvrfyFiledSchedule1");
        sb.append('=');
        sb.append(((this.rnrvrfyFiledSchedule1 == null)?"<null>":this.rnrvrfyFiledSchedule1));
        sb.append(',');
        sb.append("displayParRecdSsi");
        sb.append('=');
        sb.append(((this.displayParRecdSsi == null)?"<null>":this.displayParRecdSsi));
        sb.append(',');
        sb.append("displayParUsInc");
        sb.append('=');
        sb.append(((this.displayParUsInc == null)?"<null>":this.displayParUsInc));
        sb.append(',');
        sb.append("federalBenefitsExist");
        sb.append('=');
        sb.append(((this.federalBenefitsExist == null)?"<null>":this.federalBenefitsExist));
        sb.append(',');
        sb.append("displayParUsIncTaxPd");
        sb.append('=');
        sb.append(((this.displayParUsIncTaxPd == null)?"<null>":this.displayParUsIncTaxPd));
        sb.append(',');
        sb.append("rcrapp3ParIraKeough");
        sb.append('=');
        sb.append(((this.rcrapp3ParIraKeough == null)?"<null>":this.rcrapp3ParIraKeough));
        sb.append(',');
        sb.append("rcrapp3ParGrantScholarAid");
        sb.append('=');
        sb.append(((this.rcrapp3ParGrantScholarAid == null)?"<null>":this.rcrapp3ParGrantScholarAid));
        sb.append(',');
        sb.append("displayVerificationPrtyDesc");
        sb.append('=');
        sb.append(((this.displayVerificationPrtyDesc == null)?"<null>":this.displayVerificationPrtyDesc));
        sb.append(',');
        sb.append("displayParRecdTanf");
        sb.append('=');
        sb.append(((this.displayParRecdTanf == null)?"<null>":this.displayParRecdTanf));
        sb.append(',');
        sb.append("displayParTaxFormInd");
        sb.append('=');
        sb.append(((this.displayParTaxFormInd == null)?"<null>":this.displayParTaxFormInd));
        sb.append(',');
        sb.append("rnrvrfyUsIncTaxPd");
        sb.append('=');
        sb.append(((this.rnrvrfyUsIncTaxPd == null)?"<null>":this.rnrvrfyUsIncTaxPd));
        sb.append(',');
        sb.append("rnrvrfyFathIncFrWrk");
        sb.append('=');
        sb.append(((this.rnrvrfyFathIncFrWrk == null)?"<null>":this.rnrvrfyFathIncFrWrk));
        sb.append(',');
        sb.append("updParRecdTanf");
        sb.append('=');
        sb.append(((this.updParRecdTanf == null)?"<null>":this.updParRecdTanf));
        sb.append(',');
        sb.append("rcrapp1ParChildSupp");
        sb.append('=');
        sb.append(((this.rcrapp1ParChildSupp == null)?"<null>":this.rcrapp1ParChildSupp));
        sb.append(',');
        sb.append("displayParTaxFilingStatus");
        sb.append('=');
        sb.append(((this.displayParTaxFilingStatus == null)?"<null>":this.displayParTaxFilingStatus));
        sb.append(',');
        sb.append("displayParFamMemb");
        sb.append('=');
        sb.append(((this.displayParFamMemb == null)?"<null>":this.displayParFamMemb));
        sb.append(',');
        sb.append("rcrapp1VerificationPrty");
        sb.append('=');
        sb.append(((this.rcrapp1VerificationPrty == null)?"<null>":this.rcrapp1VerificationPrty));
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
        sb.append("updParEducCredits");
        sb.append('=');
        sb.append(((this.updParEducCredits == null)?"<null>":this.updParEducCredits));
        sb.append(',');
        sb.append("updParOthUntaxInc");
        sb.append('=');
        sb.append(((this.updParOthUntaxInc == null)?"<null>":this.updParOthUntaxInc));
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
        sb.append("updParRecdSsi");
        sb.append('=');
        sb.append(((this.updParRecdSsi == null)?"<null>":this.updParRecdSsi));
        sb.append(',');
        sb.append("rnrvrfySchoolLunch");
        sb.append('=');
        sb.append(((this.rnrvrfySchoolLunch == null)?"<null>":this.rnrvrfySchoolLunch));
        sb.append(',');
        sb.append("updParCoOpEarnings");
        sb.append('=');
        sb.append(((this.updParCoOpEarnings == null)?"<null>":this.updParCoOpEarnings));
        sb.append(',');
        sb.append("displayRcrapp4ParFiledSchedule1");
        sb.append('=');
        sb.append(((this.displayRcrapp4ParFiledSchedule1 == null)?"<null>":this.displayRcrapp4ParFiledSchedule1));
        sb.append(',');
        sb.append("updFathIncFrWrk");
        sb.append('=');
        sb.append(((this.updFathIncFrWrk == null)?"<null>":this.updFathIncFrWrk));
        sb.append(',');
        sb.append("rnrvrfyRecdWic");
        sb.append('=');
        sb.append(((this.rnrvrfyRecdWic == null)?"<null>":this.rnrvrfyRecdWic));
        sb.append(',');
        sb.append("rnrvrfyEdCredits");
        sb.append('=');
        sb.append(((this.rnrvrfyEdCredits == null)?"<null>":this.rnrvrfyEdCredits));
        sb.append(',');
        sb.append("rnrvrfyCoOpEarnings");
        sb.append('=');
        sb.append(((this.rnrvrfyCoOpEarnings == null)?"<null>":this.rnrvrfyCoOpEarnings));
        sb.append(',');
        sb.append("rnrvrfyParTaxFilingStatus");
        sb.append('=');
        sb.append(((this.rnrvrfyParTaxFilingStatus == null)?"<null>":this.rnrvrfyParTaxFilingStatus));
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
        sb.append("displayParFoodStamps");
        sb.append('=');
        sb.append(((this.displayParFoodStamps == null)?"<null>":this.displayParFoodStamps));
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
        result = ((result* 31)+((this.rnrvrfyRecdTanf == null)? 0 :this.rnrvrfyRecdTanf.hashCode()));
        result = ((result* 31)+((this.updParCombatPay == null)? 0 :this.updParCombatPay.hashCode()));
        result = ((result* 31)+((this.updParSchoolLunch == null)? 0 :this.updParSchoolLunch.hashCode()));
        result = ((result* 31)+((this.updParIraPensions == null)? 0 :this.updParIraPensions.hashCode()));
        result = ((result* 31)+((this.displayMothIncFrWrk == null)? 0 :this.displayMothIncFrWrk.hashCode()));
        result = ((result* 31)+((this.displayParRecdWic == null)? 0 :this.displayParRecdWic.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParEducCredits == null)? 0 :this.rcrapp3ParEducCredits.hashCode()));
        result = ((result* 31)+((this.updMothIncFrWrk == null)? 0 :this.updMothIncFrWrk.hashCode()));
        result = ((result* 31)+((this.updParGrantScholarAid == null)? 0 :this.updParGrantScholarAid.hashCode()));
        result = ((result* 31)+((this.displayParDislWrk == null)? 0 :this.displayParDislWrk.hashCode()));
        result = ((result* 31)+((this.rnrvrfyIra == null)? 0 :this.rnrvrfyIra.hashCode()));
        result = ((result* 31)+((this.updParFoodStamps == null)? 0 :this.updParFoodStamps.hashCode()));
        result = ((result* 31)+((this.updParNeedBasedEmploy == null)? 0 :this.updParNeedBasedEmploy.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParChildSuppPaid == null)? 0 :this.rcrapp3ParChildSuppPaid.hashCode()));
        result = ((result* 31)+((this.rnrvrfyTaxFormInd == null)? 0 :this.rnrvrfyTaxFormInd.hashCode()));
        result = ((result* 31)+((this.updateRcrapp1Ind2 == null)? 0 :this.updateRcrapp1Ind2 .hashCode()));
        result = ((result* 31)+((this.updParChildSupportReceived == null)? 0 :this.updParChildSupportReceived.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParCoOpEarnings == null)? 0 :this.rcrapp3ParCoOpEarnings.hashCode()));
        result = ((result* 31)+((this.rnrvrfyTaxFinAidRecd == null)? 0 :this.rnrvrfyTaxFinAidRecd.hashCode()));
        result = ((result* 31)+((this.rnrvrfyOtherTaxFinaid == null)? 0 :this.rnrvrfyOtherTaxFinaid.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParNeedBasedEmploy == null)? 0 :this.rcrapp3ParNeedBasedEmploy.hashCode()));
        result = ((result* 31)+((this.updParChildSuppPaid == null)? 0 :this.updParChildSuppPaid.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParTaxDefPension == null)? 0 :this.rcrapp3ParTaxDefPension.hashCode()));
        result = ((result* 31)+((this.rnrvrfyMothIncFrWrk == null)? 0 :this.rnrvrfyMothIncFrWrk.hashCode()));
        result = ((result* 31)+((this.updParNoInColl == null)? 0 :this.updParNoInColl.hashCode()));
        result = ((result* 31)+((this.updParHouseFoodOth == null)? 0 :this.updParHouseFoodOth.hashCode()));
        result = ((result* 31)+((this.displayParSchoolLunch == null)? 0 :this.displayParSchoolLunch.hashCode()));
        result = ((result* 31)+((this.rnrvrfyRecdSsi == null)? 0 :this.rnrvrfyRecdSsi.hashCode()));
        result = ((result* 31)+((this.rnrvrfyVaNonEducBen == null)? 0 :this.rnrvrfyVaNonEducBen.hashCode()));
        result = ((result* 31)+((this.updParWic == null)? 0 :this.updParWic.hashCode()));
        result = ((result* 31)+((this.updParFamMemb == null)? 0 :this.updParFamMemb.hashCode()));
        result = ((result* 31)+((this.rnrvrfyFoodStamps == null)? 0 :this.rnrvrfyFoodStamps.hashCode()));
        result = ((result* 31)+((this.updParUsIncTaxPd == null)? 0 :this.updParUsIncTaxPd.hashCode()));
        result = ((result* 31)+((this.rnrvrfyAllOtherUntaxInc == null)? 0 :this.rnrvrfyAllOtherUntaxInc.hashCode()));
        result = ((result* 31)+((this.rcrapp4ParCombatPay == null)? 0 :this.rcrapp4ParCombatPay.hashCode()));
        result = ((result* 31)+((this.rnrvrfyDislWrk == null)? 0 :this.rnrvrfyDislWrk.hashCode()));
        result = ((result* 31)+((this.rnrvrfyUntaxedIraPensions == null)? 0 :this.rnrvrfyUntaxedIraPensions.hashCode()));
        result = ((result* 31)+((this.updParIntInc == null)? 0 :this.updParIntInc.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParHouseFoodOth == null)? 0 :this.rcrapp3ParHouseFoodOth.hashCode()));
        result = ((result* 31)+((this.updParIraKeogh == null)? 0 :this.updParIraKeogh.hashCode()));
        result = ((result* 31)+((this.rcrapp1ParOthUntaxInc == null)? 0 :this.rcrapp1ParOthUntaxInc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rnrvrfyTaxExemptIntInc == null)? 0 :this.rnrvrfyTaxExemptIntInc.hashCode()));
        result = ((result* 31)+((this.displayParNoInColl == null)? 0 :this.displayParNoInColl.hashCode()));
        result = ((result* 31)+((this.rcrapp1ParIraPensions == null)? 0 :this.rcrapp1ParIraPensions.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParTeIntInc == null)? 0 :this.rcrapp3ParTeIntInc.hashCode()));
        result = ((result* 31)+((this.updPFiledSchedule1 == null)? 0 :this.updPFiledSchedule1 .hashCode()));
        result = ((result* 31)+((this.rnrvrfyChildSupp == null)? 0 :this.rnrvrfyChildSupp.hashCode()));
        result = ((result* 31)+((this.rnrvrfyFamMemb == null)? 0 :this.rnrvrfyFamMemb.hashCode()));
        result = ((result* 31)+((this.displayFathIncFrWrk == null)? 0 :this.displayFathIncFrWrk.hashCode()));
        result = ((result* 31)+((this.rnrvrfyTaxDefPensPayt == null)? 0 :this.rnrvrfyTaxDefPensPayt.hashCode()));
        result = ((result* 31)+((this.rnrvrfyFiledSchedule1 == null)? 0 :this.rnrvrfyFiledSchedule1 .hashCode()));
        result = ((result* 31)+((this.displayParRecdSsi == null)? 0 :this.displayParRecdSsi.hashCode()));
        result = ((result* 31)+((this.displayParUsInc == null)? 0 :this.displayParUsInc.hashCode()));
        result = ((result* 31)+((this.federalBenefitsExist == null)? 0 :this.federalBenefitsExist.hashCode()));
        result = ((result* 31)+((this.displayParUsIncTaxPd == null)? 0 :this.displayParUsIncTaxPd.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParIraKeough == null)? 0 :this.rcrapp3ParIraKeough.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParGrantScholarAid == null)? 0 :this.rcrapp3ParGrantScholarAid.hashCode()));
        result = ((result* 31)+((this.displayVerificationPrtyDesc == null)? 0 :this.displayVerificationPrtyDesc.hashCode()));
        result = ((result* 31)+((this.displayParRecdTanf == null)? 0 :this.displayParRecdTanf.hashCode()));
        result = ((result* 31)+((this.displayParTaxFormInd == null)? 0 :this.displayParTaxFormInd.hashCode()));
        result = ((result* 31)+((this.rnrvrfyUsIncTaxPd == null)? 0 :this.rnrvrfyUsIncTaxPd.hashCode()));
        result = ((result* 31)+((this.rnrvrfyFathIncFrWrk == null)? 0 :this.rnrvrfyFathIncFrWrk.hashCode()));
        result = ((result* 31)+((this.updParRecdTanf == null)? 0 :this.updParRecdTanf.hashCode()));
        result = ((result* 31)+((this.rcrapp1ParChildSupp == null)? 0 :this.rcrapp1ParChildSupp.hashCode()));
        result = ((result* 31)+((this.displayParTaxFilingStatus == null)? 0 :this.displayParTaxFilingStatus.hashCode()));
        result = ((result* 31)+((this.displayParFamMemb == null)? 0 :this.displayParFamMemb.hashCode()));
        result = ((result* 31)+((this.rcrapp1VerificationPrty == null)? 0 :this.rcrapp1VerificationPrty.hashCode()));
        result = ((result* 31)+((this.updParTaxFilingStatus == null)? 0 :this.updParTaxFilingStatus.hashCode()));
        result = ((result* 31)+((this.rnrvrfyChildSuppPd == null)? 0 :this.rnrvrfyChildSuppPd.hashCode()));
        result = ((result* 31)+((this.updParUsInc == null)? 0 :this.updParUsInc.hashCode()));
        result = ((result* 31)+((this.rnrvrfyUsInc == null)? 0 :this.rnrvrfyUsInc.hashCode()));
        result = ((result* 31)+((this.updParEducCredits == null)? 0 :this.updParEducCredits.hashCode()));
        result = ((result* 31)+((this.updParOthUntaxInc == null)? 0 :this.updParOthUntaxInc.hashCode()));
        result = ((result* 31)+((this.rnrvrfyNoInColl == null)? 0 :this.rnrvrfyNoInColl.hashCode()));
        result = ((result* 31)+((this.updParDislWrk == null)? 0 :this.updParDislWrk.hashCode()));
        result = ((result* 31)+((this.updParPensionPayments == null)? 0 :this.updParPensionPayments.hashCode()));
        result = ((result* 31)+((this.updParRecdSsi == null)? 0 :this.updParRecdSsi.hashCode()));
        result = ((result* 31)+((this.rnrvrfySchoolLunch == null)? 0 :this.rnrvrfySchoolLunch.hashCode()));
        result = ((result* 31)+((this.updParCoOpEarnings == null)? 0 :this.updParCoOpEarnings.hashCode()));
        result = ((result* 31)+((this.displayRcrapp4ParFiledSchedule1 == null)? 0 :this.displayRcrapp4ParFiledSchedule1 .hashCode()));
        result = ((result* 31)+((this.updFathIncFrWrk == null)? 0 :this.updFathIncFrWrk.hashCode()));
        result = ((result* 31)+((this.rnrvrfyRecdWic == null)? 0 :this.rnrvrfyRecdWic.hashCode()));
        result = ((result* 31)+((this.rnrvrfyEdCredits == null)? 0 :this.rnrvrfyEdCredits.hashCode()));
        result = ((result* 31)+((this.rnrvrfyCoOpEarnings == null)? 0 :this.rnrvrfyCoOpEarnings.hashCode()));
        result = ((result* 31)+((this.rnrvrfyParTaxFilingStatus == null)? 0 :this.rnrvrfyParTaxFilingStatus.hashCode()));
        result = ((result* 31)+((this.updParTaxFormInd == null)? 0 :this.updParTaxFormInd.hashCode()));
        result = ((result* 31)+((this.rcrapp1ParVetsNonEdBen == null)? 0 :this.rcrapp1ParVetsNonEdBen.hashCode()));
        result = ((result* 31)+((this.rnrvrfyLivAllowRecd == null)? 0 :this.rnrvrfyLivAllowRecd.hashCode()));
        result = ((result* 31)+((this.updParVetsNonEdBen == null)? 0 :this.updParVetsNonEdBen.hashCode()));
        result = ((result* 31)+((this.displayParFoodStamps == null)? 0 :this.displayParFoodStamps.hashCode()));
        result = ((result* 31)+((this.rnrvrfyCombatPay == null)? 0 :this.rnrvrfyCombatPay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20202021NeedAnalysisDocumentVerificationParent100GetResponse) == false) {
            return false;
        }
        _20202021NeedAnalysisDocumentVerificationParent100GetResponse rhs = ((_20202021NeedAnalysisDocumentVerificationParent100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.rnrvrfyRecdTanf == rhs.rnrvrfyRecdTanf)||((this.rnrvrfyRecdTanf!= null)&&this.rnrvrfyRecdTanf.equals(rhs.rnrvrfyRecdTanf)))&&((this.updParCombatPay == rhs.updParCombatPay)||((this.updParCombatPay!= null)&&this.updParCombatPay.equals(rhs.updParCombatPay))))&&((this.updParSchoolLunch == rhs.updParSchoolLunch)||((this.updParSchoolLunch!= null)&&this.updParSchoolLunch.equals(rhs.updParSchoolLunch))))&&((this.updParIraPensions == rhs.updParIraPensions)||((this.updParIraPensions!= null)&&this.updParIraPensions.equals(rhs.updParIraPensions))))&&((this.displayMothIncFrWrk == rhs.displayMothIncFrWrk)||((this.displayMothIncFrWrk!= null)&&this.displayMothIncFrWrk.equals(rhs.displayMothIncFrWrk))))&&((this.displayParRecdWic == rhs.displayParRecdWic)||((this.displayParRecdWic!= null)&&this.displayParRecdWic.equals(rhs.displayParRecdWic))))&&((this.rcrapp3ParEducCredits == rhs.rcrapp3ParEducCredits)||((this.rcrapp3ParEducCredits!= null)&&this.rcrapp3ParEducCredits.equals(rhs.rcrapp3ParEducCredits))))&&((this.updMothIncFrWrk == rhs.updMothIncFrWrk)||((this.updMothIncFrWrk!= null)&&this.updMothIncFrWrk.equals(rhs.updMothIncFrWrk))))&&((this.updParGrantScholarAid == rhs.updParGrantScholarAid)||((this.updParGrantScholarAid!= null)&&this.updParGrantScholarAid.equals(rhs.updParGrantScholarAid))))&&((this.displayParDislWrk == rhs.displayParDislWrk)||((this.displayParDislWrk!= null)&&this.displayParDislWrk.equals(rhs.displayParDislWrk))))&&((this.rnrvrfyIra == rhs.rnrvrfyIra)||((this.rnrvrfyIra!= null)&&this.rnrvrfyIra.equals(rhs.rnrvrfyIra))))&&((this.updParFoodStamps == rhs.updParFoodStamps)||((this.updParFoodStamps!= null)&&this.updParFoodStamps.equals(rhs.updParFoodStamps))))&&((this.updParNeedBasedEmploy == rhs.updParNeedBasedEmploy)||((this.updParNeedBasedEmploy!= null)&&this.updParNeedBasedEmploy.equals(rhs.updParNeedBasedEmploy))))&&((this.rcrapp3ParChildSuppPaid == rhs.rcrapp3ParChildSuppPaid)||((this.rcrapp3ParChildSuppPaid!= null)&&this.rcrapp3ParChildSuppPaid.equals(rhs.rcrapp3ParChildSuppPaid))))&&((this.rnrvrfyTaxFormInd == rhs.rnrvrfyTaxFormInd)||((this.rnrvrfyTaxFormInd!= null)&&this.rnrvrfyTaxFormInd.equals(rhs.rnrvrfyTaxFormInd))))&&((this.updateRcrapp1Ind2 == rhs.updateRcrapp1Ind2)||((this.updateRcrapp1Ind2 != null)&&this.updateRcrapp1Ind2 .equals(rhs.updateRcrapp1Ind2))))&&((this.updParChildSupportReceived == rhs.updParChildSupportReceived)||((this.updParChildSupportReceived!= null)&&this.updParChildSupportReceived.equals(rhs.updParChildSupportReceived))))&&((this.rcrapp3ParCoOpEarnings == rhs.rcrapp3ParCoOpEarnings)||((this.rcrapp3ParCoOpEarnings!= null)&&this.rcrapp3ParCoOpEarnings.equals(rhs.rcrapp3ParCoOpEarnings))))&&((this.rnrvrfyTaxFinAidRecd == rhs.rnrvrfyTaxFinAidRecd)||((this.rnrvrfyTaxFinAidRecd!= null)&&this.rnrvrfyTaxFinAidRecd.equals(rhs.rnrvrfyTaxFinAidRecd))))&&((this.rnrvrfyOtherTaxFinaid == rhs.rnrvrfyOtherTaxFinaid)||((this.rnrvrfyOtherTaxFinaid!= null)&&this.rnrvrfyOtherTaxFinaid.equals(rhs.rnrvrfyOtherTaxFinaid))))&&((this.rcrapp3ParNeedBasedEmploy == rhs.rcrapp3ParNeedBasedEmploy)||((this.rcrapp3ParNeedBasedEmploy!= null)&&this.rcrapp3ParNeedBasedEmploy.equals(rhs.rcrapp3ParNeedBasedEmploy))))&&((this.updParChildSuppPaid == rhs.updParChildSuppPaid)||((this.updParChildSuppPaid!= null)&&this.updParChildSuppPaid.equals(rhs.updParChildSuppPaid))))&&((this.rcrapp3ParTaxDefPension == rhs.rcrapp3ParTaxDefPension)||((this.rcrapp3ParTaxDefPension!= null)&&this.rcrapp3ParTaxDefPension.equals(rhs.rcrapp3ParTaxDefPension))))&&((this.rnrvrfyMothIncFrWrk == rhs.rnrvrfyMothIncFrWrk)||((this.rnrvrfyMothIncFrWrk!= null)&&this.rnrvrfyMothIncFrWrk.equals(rhs.rnrvrfyMothIncFrWrk))))&&((this.updParNoInColl == rhs.updParNoInColl)||((this.updParNoInColl!= null)&&this.updParNoInColl.equals(rhs.updParNoInColl))))&&((this.updParHouseFoodOth == rhs.updParHouseFoodOth)||((this.updParHouseFoodOth!= null)&&this.updParHouseFoodOth.equals(rhs.updParHouseFoodOth))))&&((this.displayParSchoolLunch == rhs.displayParSchoolLunch)||((this.displayParSchoolLunch!= null)&&this.displayParSchoolLunch.equals(rhs.displayParSchoolLunch))))&&((this.rnrvrfyRecdSsi == rhs.rnrvrfyRecdSsi)||((this.rnrvrfyRecdSsi!= null)&&this.rnrvrfyRecdSsi.equals(rhs.rnrvrfyRecdSsi))))&&((this.rnrvrfyVaNonEducBen == rhs.rnrvrfyVaNonEducBen)||((this.rnrvrfyVaNonEducBen!= null)&&this.rnrvrfyVaNonEducBen.equals(rhs.rnrvrfyVaNonEducBen))))&&((this.updParWic == rhs.updParWic)||((this.updParWic!= null)&&this.updParWic.equals(rhs.updParWic))))&&((this.updParFamMemb == rhs.updParFamMemb)||((this.updParFamMemb!= null)&&this.updParFamMemb.equals(rhs.updParFamMemb))))&&((this.rnrvrfyFoodStamps == rhs.rnrvrfyFoodStamps)||((this.rnrvrfyFoodStamps!= null)&&this.rnrvrfyFoodStamps.equals(rhs.rnrvrfyFoodStamps))))&&((this.updParUsIncTaxPd == rhs.updParUsIncTaxPd)||((this.updParUsIncTaxPd!= null)&&this.updParUsIncTaxPd.equals(rhs.updParUsIncTaxPd))))&&((this.rnrvrfyAllOtherUntaxInc == rhs.rnrvrfyAllOtherUntaxInc)||((this.rnrvrfyAllOtherUntaxInc!= null)&&this.rnrvrfyAllOtherUntaxInc.equals(rhs.rnrvrfyAllOtherUntaxInc))))&&((this.rcrapp4ParCombatPay == rhs.rcrapp4ParCombatPay)||((this.rcrapp4ParCombatPay!= null)&&this.rcrapp4ParCombatPay.equals(rhs.rcrapp4ParCombatPay))))&&((this.rnrvrfyDislWrk == rhs.rnrvrfyDislWrk)||((this.rnrvrfyDislWrk!= null)&&this.rnrvrfyDislWrk.equals(rhs.rnrvrfyDislWrk))))&&((this.rnrvrfyUntaxedIraPensions == rhs.rnrvrfyUntaxedIraPensions)||((this.rnrvrfyUntaxedIraPensions!= null)&&this.rnrvrfyUntaxedIraPensions.equals(rhs.rnrvrfyUntaxedIraPensions))))&&((this.updParIntInc == rhs.updParIntInc)||((this.updParIntInc!= null)&&this.updParIntInc.equals(rhs.updParIntInc))))&&((this.rcrapp3ParHouseFoodOth == rhs.rcrapp3ParHouseFoodOth)||((this.rcrapp3ParHouseFoodOth!= null)&&this.rcrapp3ParHouseFoodOth.equals(rhs.rcrapp3ParHouseFoodOth))))&&((this.updParIraKeogh == rhs.updParIraKeogh)||((this.updParIraKeogh!= null)&&this.updParIraKeogh.equals(rhs.updParIraKeogh))))&&((this.rcrapp1ParOthUntaxInc == rhs.rcrapp1ParOthUntaxInc)||((this.rcrapp1ParOthUntaxInc!= null)&&this.rcrapp1ParOthUntaxInc.equals(rhs.rcrapp1ParOthUntaxInc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rnrvrfyTaxExemptIntInc == rhs.rnrvrfyTaxExemptIntInc)||((this.rnrvrfyTaxExemptIntInc!= null)&&this.rnrvrfyTaxExemptIntInc.equals(rhs.rnrvrfyTaxExemptIntInc))))&&((this.displayParNoInColl == rhs.displayParNoInColl)||((this.displayParNoInColl!= null)&&this.displayParNoInColl.equals(rhs.displayParNoInColl))))&&((this.rcrapp1ParIraPensions == rhs.rcrapp1ParIraPensions)||((this.rcrapp1ParIraPensions!= null)&&this.rcrapp1ParIraPensions.equals(rhs.rcrapp1ParIraPensions))))&&((this.rcrapp3ParTeIntInc == rhs.rcrapp3ParTeIntInc)||((this.rcrapp3ParTeIntInc!= null)&&this.rcrapp3ParTeIntInc.equals(rhs.rcrapp3ParTeIntInc))))&&((this.updPFiledSchedule1 == rhs.updPFiledSchedule1)||((this.updPFiledSchedule1 != null)&&this.updPFiledSchedule1 .equals(rhs.updPFiledSchedule1))))&&((this.rnrvrfyChildSupp == rhs.rnrvrfyChildSupp)||((this.rnrvrfyChildSupp!= null)&&this.rnrvrfyChildSupp.equals(rhs.rnrvrfyChildSupp))))&&((this.rnrvrfyFamMemb == rhs.rnrvrfyFamMemb)||((this.rnrvrfyFamMemb!= null)&&this.rnrvrfyFamMemb.equals(rhs.rnrvrfyFamMemb))))&&((this.displayFathIncFrWrk == rhs.displayFathIncFrWrk)||((this.displayFathIncFrWrk!= null)&&this.displayFathIncFrWrk.equals(rhs.displayFathIncFrWrk))))&&((this.rnrvrfyTaxDefPensPayt == rhs.rnrvrfyTaxDefPensPayt)||((this.rnrvrfyTaxDefPensPayt!= null)&&this.rnrvrfyTaxDefPensPayt.equals(rhs.rnrvrfyTaxDefPensPayt))))&&((this.rnrvrfyFiledSchedule1 == rhs.rnrvrfyFiledSchedule1)||((this.rnrvrfyFiledSchedule1 != null)&&this.rnrvrfyFiledSchedule1 .equals(rhs.rnrvrfyFiledSchedule1))))&&((this.displayParRecdSsi == rhs.displayParRecdSsi)||((this.displayParRecdSsi!= null)&&this.displayParRecdSsi.equals(rhs.displayParRecdSsi))))&&((this.displayParUsInc == rhs.displayParUsInc)||((this.displayParUsInc!= null)&&this.displayParUsInc.equals(rhs.displayParUsInc))))&&((this.federalBenefitsExist == rhs.federalBenefitsExist)||((this.federalBenefitsExist!= null)&&this.federalBenefitsExist.equals(rhs.federalBenefitsExist))))&&((this.displayParUsIncTaxPd == rhs.displayParUsIncTaxPd)||((this.displayParUsIncTaxPd!= null)&&this.displayParUsIncTaxPd.equals(rhs.displayParUsIncTaxPd))))&&((this.rcrapp3ParIraKeough == rhs.rcrapp3ParIraKeough)||((this.rcrapp3ParIraKeough!= null)&&this.rcrapp3ParIraKeough.equals(rhs.rcrapp3ParIraKeough))))&&((this.rcrapp3ParGrantScholarAid == rhs.rcrapp3ParGrantScholarAid)||((this.rcrapp3ParGrantScholarAid!= null)&&this.rcrapp3ParGrantScholarAid.equals(rhs.rcrapp3ParGrantScholarAid))))&&((this.displayVerificationPrtyDesc == rhs.displayVerificationPrtyDesc)||((this.displayVerificationPrtyDesc!= null)&&this.displayVerificationPrtyDesc.equals(rhs.displayVerificationPrtyDesc))))&&((this.displayParRecdTanf == rhs.displayParRecdTanf)||((this.displayParRecdTanf!= null)&&this.displayParRecdTanf.equals(rhs.displayParRecdTanf))))&&((this.displayParTaxFormInd == rhs.displayParTaxFormInd)||((this.displayParTaxFormInd!= null)&&this.displayParTaxFormInd.equals(rhs.displayParTaxFormInd))))&&((this.rnrvrfyUsIncTaxPd == rhs.rnrvrfyUsIncTaxPd)||((this.rnrvrfyUsIncTaxPd!= null)&&this.rnrvrfyUsIncTaxPd.equals(rhs.rnrvrfyUsIncTaxPd))))&&((this.rnrvrfyFathIncFrWrk == rhs.rnrvrfyFathIncFrWrk)||((this.rnrvrfyFathIncFrWrk!= null)&&this.rnrvrfyFathIncFrWrk.equals(rhs.rnrvrfyFathIncFrWrk))))&&((this.updParRecdTanf == rhs.updParRecdTanf)||((this.updParRecdTanf!= null)&&this.updParRecdTanf.equals(rhs.updParRecdTanf))))&&((this.rcrapp1ParChildSupp == rhs.rcrapp1ParChildSupp)||((this.rcrapp1ParChildSupp!= null)&&this.rcrapp1ParChildSupp.equals(rhs.rcrapp1ParChildSupp))))&&((this.displayParTaxFilingStatus == rhs.displayParTaxFilingStatus)||((this.displayParTaxFilingStatus!= null)&&this.displayParTaxFilingStatus.equals(rhs.displayParTaxFilingStatus))))&&((this.displayParFamMemb == rhs.displayParFamMemb)||((this.displayParFamMemb!= null)&&this.displayParFamMemb.equals(rhs.displayParFamMemb))))&&((this.rcrapp1VerificationPrty == rhs.rcrapp1VerificationPrty)||((this.rcrapp1VerificationPrty!= null)&&this.rcrapp1VerificationPrty.equals(rhs.rcrapp1VerificationPrty))))&&((this.updParTaxFilingStatus == rhs.updParTaxFilingStatus)||((this.updParTaxFilingStatus!= null)&&this.updParTaxFilingStatus.equals(rhs.updParTaxFilingStatus))))&&((this.rnrvrfyChildSuppPd == rhs.rnrvrfyChildSuppPd)||((this.rnrvrfyChildSuppPd!= null)&&this.rnrvrfyChildSuppPd.equals(rhs.rnrvrfyChildSuppPd))))&&((this.updParUsInc == rhs.updParUsInc)||((this.updParUsInc!= null)&&this.updParUsInc.equals(rhs.updParUsInc))))&&((this.rnrvrfyUsInc == rhs.rnrvrfyUsInc)||((this.rnrvrfyUsInc!= null)&&this.rnrvrfyUsInc.equals(rhs.rnrvrfyUsInc))))&&((this.updParEducCredits == rhs.updParEducCredits)||((this.updParEducCredits!= null)&&this.updParEducCredits.equals(rhs.updParEducCredits))))&&((this.updParOthUntaxInc == rhs.updParOthUntaxInc)||((this.updParOthUntaxInc!= null)&&this.updParOthUntaxInc.equals(rhs.updParOthUntaxInc))))&&((this.rnrvrfyNoInColl == rhs.rnrvrfyNoInColl)||((this.rnrvrfyNoInColl!= null)&&this.rnrvrfyNoInColl.equals(rhs.rnrvrfyNoInColl))))&&((this.updParDislWrk == rhs.updParDislWrk)||((this.updParDislWrk!= null)&&this.updParDislWrk.equals(rhs.updParDislWrk))))&&((this.updParPensionPayments == rhs.updParPensionPayments)||((this.updParPensionPayments!= null)&&this.updParPensionPayments.equals(rhs.updParPensionPayments))))&&((this.updParRecdSsi == rhs.updParRecdSsi)||((this.updParRecdSsi!= null)&&this.updParRecdSsi.equals(rhs.updParRecdSsi))))&&((this.rnrvrfySchoolLunch == rhs.rnrvrfySchoolLunch)||((this.rnrvrfySchoolLunch!= null)&&this.rnrvrfySchoolLunch.equals(rhs.rnrvrfySchoolLunch))))&&((this.updParCoOpEarnings == rhs.updParCoOpEarnings)||((this.updParCoOpEarnings!= null)&&this.updParCoOpEarnings.equals(rhs.updParCoOpEarnings))))&&((this.displayRcrapp4ParFiledSchedule1 == rhs.displayRcrapp4ParFiledSchedule1)||((this.displayRcrapp4ParFiledSchedule1 != null)&&this.displayRcrapp4ParFiledSchedule1 .equals(rhs.displayRcrapp4ParFiledSchedule1))))&&((this.updFathIncFrWrk == rhs.updFathIncFrWrk)||((this.updFathIncFrWrk!= null)&&this.updFathIncFrWrk.equals(rhs.updFathIncFrWrk))))&&((this.rnrvrfyRecdWic == rhs.rnrvrfyRecdWic)||((this.rnrvrfyRecdWic!= null)&&this.rnrvrfyRecdWic.equals(rhs.rnrvrfyRecdWic))))&&((this.rnrvrfyEdCredits == rhs.rnrvrfyEdCredits)||((this.rnrvrfyEdCredits!= null)&&this.rnrvrfyEdCredits.equals(rhs.rnrvrfyEdCredits))))&&((this.rnrvrfyCoOpEarnings == rhs.rnrvrfyCoOpEarnings)||((this.rnrvrfyCoOpEarnings!= null)&&this.rnrvrfyCoOpEarnings.equals(rhs.rnrvrfyCoOpEarnings))))&&((this.rnrvrfyParTaxFilingStatus == rhs.rnrvrfyParTaxFilingStatus)||((this.rnrvrfyParTaxFilingStatus!= null)&&this.rnrvrfyParTaxFilingStatus.equals(rhs.rnrvrfyParTaxFilingStatus))))&&((this.updParTaxFormInd == rhs.updParTaxFormInd)||((this.updParTaxFormInd!= null)&&this.updParTaxFormInd.equals(rhs.updParTaxFormInd))))&&((this.rcrapp1ParVetsNonEdBen == rhs.rcrapp1ParVetsNonEdBen)||((this.rcrapp1ParVetsNonEdBen!= null)&&this.rcrapp1ParVetsNonEdBen.equals(rhs.rcrapp1ParVetsNonEdBen))))&&((this.rnrvrfyLivAllowRecd == rhs.rnrvrfyLivAllowRecd)||((this.rnrvrfyLivAllowRecd!= null)&&this.rnrvrfyLivAllowRecd.equals(rhs.rnrvrfyLivAllowRecd))))&&((this.updParVetsNonEdBen == rhs.updParVetsNonEdBen)||((this.updParVetsNonEdBen!= null)&&this.updParVetsNonEdBen.equals(rhs.updParVetsNonEdBen))))&&((this.displayParFoodStamps == rhs.displayParFoodStamps)||((this.displayParFoodStamps!= null)&&this.displayParFoodStamps.equals(rhs.displayParFoodStamps))))&&((this.rnrvrfyCombatPay == rhs.rnrvrfyCombatPay)||((this.rnrvrfyCombatPay!= null)&&this.rnrvrfyCombatPay.equals(rhs.rnrvrfyCombatPay))));
    }

}
