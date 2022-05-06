
package com.ellucian.generated.bpapi.ban._2017_2018_need_analysis_document_verification_student.v1_0_0;

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
    "schoolLunch",
    "updHouseFoodOth",
    "updTaxFilingStatus",
    "updTaxFormInd",
    "updIraDistributions",
    "displayUsInc",
    "updUntaxedPensions",
    "updIncFrWrk",
    "displayRcrapp41040aEligInd",
    "incFrWrk",
    "displayFamMemb",
    "updSpsIncFrWrk",
    "livAllowRecd",
    "recdSsi",
    "coOpEarnings",
    "rcrapp3HouseFoodOth",
    "updRecdSsi",
    "rcrapp3NeedBasedEmploy",
    "displayIncFrWrk",
    "rcrapp4CombatPay",
    "displaySchoolLunch",
    "statCode1",
    "taxDefPensPayt",
    "updOthNonReportMoney",
    "hsCompletion",
    "rcrapp3GrantScholarAid",
    "taxFilingStatus",
    "updIraKeogh",
    "famMemb",
    "displayTaxFilingStatus",
    "childSuppPd",
    "displayRecdSsi",
    "displayDislWrk",
    "updPensionPayments",
    "childSupp",
    "displayTaxFormInd",
    "federalBenefitsExist",
    "usIncTaxPd",
    "displayVerificationPrtyDesc",
    "ira",
    "updDislWrk",
    "rcrapp3ChildSuppPaid",
    "updFoodStamps",
    "recdTanf",
    "rcrapp1OthNonReportMoney",
    "otherTaxFinaid",
    "displayRecdWic",
    "updIntInc",
    "displaySpsIncFrWrk",
    "updUsIncTaxPd",
    "updVetsNonEdBen",
    "rcrapp1IraDistributions",
    "eligInd",
    "rcrapp1VetsNonEdBen",
    "edCredits",
    "noInColl",
    "updOthUntaxInc",
    "updCoOpEarnings",
    "rcrapp1OthUntaxInc",
    "updNoInColl",
    "displayFoodStamps",
    "updChildSuppPaid",
    "updateRcrapp1Ind1",
    "untaxedIraDist",
    "displayUsIncTaxPd",
    "identitySep",
    "updUsInc",
    "spsIncFrWrk",
    "updCombatPay",
    "taxFinAidRecd",
    "rcrapp3CoOpEarnings",
    "updS1040EligInd",
    "rcrapp4IraKeoghAmt",
    "displayNoInColl",
    "updSchoolLunch",
    "foodStamps",
    "rcrapp1UntaxPensions",
    "untaxedPension",
    "taxExemptIntInc",
    "usInc",
    "updEducCredits",
    "taxFormInd",
    "displayRecdTanf",
    "dislWrk",
    "rcrapp3TaxDefPension",
    "updRecdTanf",
    "updGrantScholarAid",
    "updChildSupportReceived",
    "rcrapp1VerificationPrty",
    "recdWic",
    "rcrapp1ChildSupp",
    "updFamMemb",
    "updWic",
    "updNeedBasedEmploy",
    "rcrapp3EducCredits",
    "rcrapp3TeIntInc",
    "vaNonEducBen",
    "allOtherUntaxInc",
    "combatPay",
    "cashReceived"
})
@Generated("jsonschema2pojo")
public class _20172018NeedAnalysisDocumentVerificationStudent100GetResponse {

    /**
     * Lineage reference object : RNRVRFY_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("schoolLunch")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_SCHOOL_LUNCH")
    private String schoolLunch;
    @JsonProperty("updHouseFoodOth")
    private String updHouseFoodOth;
    @JsonProperty("updTaxFilingStatus")
    private String updTaxFilingStatus;
    @JsonProperty("updTaxFormInd")
    private String updTaxFormInd;
    @JsonProperty("updIraDistributions")
    private String updIraDistributions;
    /**
     * AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayUsInc")
    private Double displayUsInc;
    @JsonProperty("updUntaxedPensions")
    private String updUntaxedPensions;
    @JsonProperty("updIncFrWrk")
    private String updIncFrWrk;
    /**
     *  1040 A or EZ Eligible
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRcrapp41040aEligInd")
    private String displayRcrapp41040aEligInd;
    /**
     * Lineage reference object : RNRVRFY_INC_FR_WRK
     * 
     */
    @JsonProperty("incFrWrk")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_INC_FR_WRK")
    private Double incFrWrk;
    /**
     * Household Size
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFamMemb")
    private Double displayFamMemb;
    @JsonProperty("updSpsIncFrWrk")
    private String updSpsIncFrWrk;
    /**
     * Military and Clergy Allowance
     * <p>
     * Lineage reference object : RNRVRFY_LIV_ALLOW_RECD
     * 
     */
    @JsonProperty("livAllowRecd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_LIV_ALLOW_RECD")
    private Double livAllowRecd;
    /**
     * Lineage reference object : RNRVRFY_RECD_SSI
     * 
     */
    @JsonProperty("recdSsi")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_RECD_SSI")
    private String recdSsi;
    /**
     * Co-op Earnings
     * <p>
     * Lineage reference object : RNRVRFY_CO_OP_EARNINGS
     * 
     */
    @JsonProperty("coOpEarnings")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_CO_OP_EARNINGS")
    private Double coOpEarnings;
    @JsonProperty("rcrapp3HouseFoodOth")
    private Double rcrapp3HouseFoodOth;
    @JsonProperty("updRecdSsi")
    private String updRecdSsi;
    @JsonProperty("rcrapp3NeedBasedEmploy")
    private Double rcrapp3NeedBasedEmploy;
    /**
     * Student's Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displayIncFrWrk")
    private Double displayIncFrWrk;
    @JsonProperty("rcrapp4CombatPay")
    private Double rcrapp4CombatPay;
    /**
     * Free or Reduced Lunch
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySchoolLunch")
    private String displaySchoolLunch;
    /**
     * Verification Status
     * <p>
     * 
     * 
     */
    @JsonProperty("statCode1")
    private String statCode1;
    /**
     * Tax-Deferred Pensions
     * <p>
     * Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT
     * 
     */
    @JsonProperty("taxDefPensPayt")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT")
    private Double taxDefPensPayt;
    @JsonProperty("updOthNonReportMoney")
    private String updOthNonReportMoney;
    /**
     * High School Completion
     * <p>
     * Lineage reference object : RNRVRFY_HS_COMPLETION
     * 
     */
    @JsonProperty("hsCompletion")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_HS_COMPLETION")
    private String hsCompletion;
    @JsonProperty("rcrapp3GrantScholarAid")
    private Double rcrapp3GrantScholarAid;
    /**
     * Lineage reference object : RNRVRFY_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("taxFilingStatus")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_FILING_STATUS")
    private String taxFilingStatus;
    @JsonProperty("updIraKeogh")
    private String updIraKeogh;
    /**
     * Lineage reference object : RNRVRFY_FAM_MEMB
     * 
     */
    @JsonProperty("famMemb")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_FAM_MEMB")
    private Double famMemb;
    /**
     * Tax Filing Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTaxFilingStatus")
    private String displayTaxFilingStatus;
    /**
     * Child Support Paid
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP_PD
     * 
     */
    @JsonProperty("childSuppPd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_CHILD_SUPP_PD")
    private Double childSuppPd;
    /**
     * Medical or SSI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRecdSsi")
    private String displayRecdSsi;
    /**
     * Dislocated Worker
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDislWrk")
    private String displayDislWrk;
    @JsonProperty("updPensionPayments")
    private String updPensionPayments;
    /**
     * Child Support Received
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP
     * 
     */
    @JsonProperty("childSupp")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_CHILD_SUPP")
    private Double childSupp;
    /**
     * Type of Tax Return
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTaxFormInd")
    private String displayTaxFormInd;
    /**
     * Federal Benefits Exist
     * <p>
     * 
     * 
     */
    @JsonProperty("federalBenefitsExist")
    private String federalBenefitsExist;
    /**
     * Lineage reference object : RNRVRFY_US_INC_TAX_PD
     * 
     */
    @JsonProperty("usIncTaxPd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_US_INC_TAX_PD")
    private Double usIncTaxPd;
    @JsonProperty("displayVerificationPrtyDesc")
    private String displayVerificationPrtyDesc;
    /**
     * IRA and Keogh Deductions
     * <p>
     * Lineage reference object : RNRVRFY_IRA
     * 
     */
    @JsonProperty("ira")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_IRA")
    private Double ira;
    @JsonProperty("updDislWrk")
    private String updDislWrk;
    @JsonProperty("rcrapp3ChildSuppPaid")
    private Double rcrapp3ChildSuppPaid;
    @JsonProperty("updFoodStamps")
    private String updFoodStamps;
    /**
     * Lineage reference object : RNRVRFY_RECD_TANF
     * 
     */
    @JsonProperty("recdTanf")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_RECD_TANF")
    private String recdTanf;
    @JsonProperty("rcrapp1OthNonReportMoney")
    private Double rcrapp1OthNonReportMoney;
    /**
     * Grant and Scholarship Aid
     * <p>
     * Lineage reference object : RNRVRFY_OTHER_TAX_FINAID
     * 
     */
    @JsonProperty("otherTaxFinaid")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_OTHER_TAX_FINAID")
    private Double otherTaxFinaid;
    /**
     * WIC
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRecdWic")
    private String displayRecdWic;
    @JsonProperty("updIntInc")
    private String updIntInc;
    /**
     * Spouse's Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySpsIncFrWrk")
    private Double displaySpsIncFrWrk;
    @JsonProperty("updUsIncTaxPd")
    private String updUsIncTaxPd;
    @JsonProperty("updVetsNonEdBen")
    private String updVetsNonEdBen;
    @JsonProperty("rcrapp1IraDistributions")
    private Double rcrapp1IraDistributions;
    /**
     * Lineage reference object : RNRVRFY_ELIG_IND
     * 
     */
    @JsonProperty("eligInd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_ELIG_IND")
    private String eligInd;
    @JsonProperty("rcrapp1VetsNonEdBen")
    private Double rcrapp1VetsNonEdBen;
    /**
     * Education Tax Credits
     * <p>
     * Lineage reference object : RNRVRFY_ED_CREDITS
     * 
     */
    @JsonProperty("edCredits")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_ED_CREDITS")
    private Double edCredits;
    /**
     * Lineage reference object : RNRVRFY_NO_IN_COLL
     * 
     */
    @JsonProperty("noInColl")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_NO_IN_COLL")
    private Double noInColl;
    @JsonProperty("updOthUntaxInc")
    private String updOthUntaxInc;
    @JsonProperty("updCoOpEarnings")
    private String updCoOpEarnings;
    @JsonProperty("rcrapp1OthUntaxInc")
    private Double rcrapp1OthUntaxInc;
    @JsonProperty("updNoInColl")
    private String updNoInColl;
    /**
     * SNAP(Food Stamps)
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFoodStamps")
    private String displayFoodStamps;
    @JsonProperty("updChildSuppPaid")
    private String updChildSuppPaid;
    /**
     * Update Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("updateRcrapp1Ind1")
    private String updateRcrapp1Ind1;
    /**
     * Untaxed IRA Distributions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_IRA_DIST
     * 
     */
    @JsonProperty("untaxedIraDist")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_UNTAXED_IRA_DIST")
    private Double untaxedIraDist;
    /**
     * Tax Paid
     * <p>
     * 
     * 
     */
    @JsonProperty("displayUsIncTaxPd")
    private Double displayUsIncTaxPd;
    /**
     * Identity and SEP
     * <p>
     * Lineage reference object : RNRVRFY_IDENTITY_SEP
     * 
     */
    @JsonProperty("identitySep")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_IDENTITY_SEP")
    private String identitySep;
    @JsonProperty("updUsInc")
    private String updUsInc;
    /**
     * Lineage reference object : RNRVRFY_SPS_INC_FR_WRK
     * 
     */
    @JsonProperty("spsIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_SPS_INC_FR_WRK")
    private Double spsIncFrWrk;
    @JsonProperty("updCombatPay")
    private String updCombatPay;
    /**
     * Need Based Employment
     * <p>
     * Lineage reference object : RNRVRFY_TAX_FIN_AID_RECD
     * 
     */
    @JsonProperty("taxFinAidRecd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_FIN_AID_RECD")
    private Double taxFinAidRecd;
    @JsonProperty("rcrapp3CoOpEarnings")
    private Double rcrapp3CoOpEarnings;
    @JsonProperty("updS1040EligInd")
    private String updS1040EligInd;
    @JsonProperty("rcrapp4IraKeoghAmt")
    private Double rcrapp4IraKeoghAmt;
    /**
     * Number in College
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNoInColl")
    private Double displayNoInColl;
    @JsonProperty("updSchoolLunch")
    private String updSchoolLunch;
    /**
     * Lineage reference object : RNRVRFY_FOOD_STAMPS
     * 
     */
    @JsonProperty("foodStamps")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_FOOD_STAMPS")
    private String foodStamps;
    @JsonProperty("rcrapp1UntaxPensions")
    private Double rcrapp1UntaxPensions;
    /**
     * Untaxed Pensions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_PENSION
     * 
     */
    @JsonProperty("untaxedPension")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_UNTAXED_PENSION")
    private Double untaxedPension;
    /**
     * Tax Exempt Interest
     * <p>
     * Lineage reference object : RNRVRFY_TAX_EXEMPT_INT_INC
     * 
     */
    @JsonProperty("taxExemptIntInc")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_EXEMPT_INT_INC")
    private Double taxExemptIntInc;
    /**
     * Lineage reference object : RNRVRFY_US_INC
     * 
     */
    @JsonProperty("usInc")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_US_INC")
    private Double usInc;
    @JsonProperty("updEducCredits")
    private String updEducCredits;
    /**
     * Lineage reference object : RNRVRFY_TAX_FORM_IND
     * 
     */
    @JsonProperty("taxFormInd")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_TAX_FORM_IND")
    private String taxFormInd;
    /**
     * TANF
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRecdTanf")
    private String displayRecdTanf;
    /**
     * Lineage reference object : RNRVRFY_DISL_WRK
     * 
     */
    @JsonProperty("dislWrk")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_DISL_WRK")
    private String dislWrk;
    @JsonProperty("rcrapp3TaxDefPension")
    private Double rcrapp3TaxDefPension;
    @JsonProperty("updRecdTanf")
    private String updRecdTanf;
    @JsonProperty("updGrantScholarAid")
    private String updGrantScholarAid;
    @JsonProperty("updChildSupportReceived")
    private String updChildSupportReceived;
    /**
     * Verification Group
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationPrty")
    private String rcrapp1VerificationPrty;
    /**
     * Lineage reference object : RNRVRFY_RECD_WIC
     * 
     */
    @JsonProperty("recdWic")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_RECD_WIC")
    private String recdWic;
    @JsonProperty("rcrapp1ChildSupp")
    private Double rcrapp1ChildSupp;
    @JsonProperty("updFamMemb")
    private String updFamMemb;
    @JsonProperty("updWic")
    private String updWic;
    @JsonProperty("updNeedBasedEmploy")
    private String updNeedBasedEmploy;
    @JsonProperty("rcrapp3EducCredits")
    private Double rcrapp3EducCredits;
    @JsonProperty("rcrapp3TeIntInc")
    private Double rcrapp3TeIntInc;
    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN
     * 
     */
    @JsonProperty("vaNonEducBen")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN")
    private Double vaNonEducBen;
    /**
     * Other Untaxed Income
     * <p>
     * Lineage reference object : RNRVRFY_ALL_OTHER_UNTAX_INC
     * 
     */
    @JsonProperty("allOtherUntaxInc")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_ALL_OTHER_UNTAX_INC")
    private Double allOtherUntaxInc;
    /**
     * Combat Pay
     * <p>
     * Lineage reference object : RNRVRFY_COMBAT_PAY
     * 
     */
    @JsonProperty("combatPay")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_COMBAT_PAY")
    private Double combatPay;
    /**
     * Other Non-Reported Money
     * <p>
     * Lineage reference object : RNRVRFY_CASH_RECEIVED
     * 
     */
    @JsonProperty("cashReceived")
    @JsonPropertyDescription("Lineage reference object : RNRVRFY_CASH_RECEIVED")
    private Double cashReceived;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RNRVRFY_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("schoolLunch")
    public String getSchoolLunch() {
        return schoolLunch;
    }

    /**
     * Lineage reference object : RNRVRFY_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("schoolLunch")
    public void setSchoolLunch(String schoolLunch) {
        this.schoolLunch = schoolLunch;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withSchoolLunch(String schoolLunch) {
        this.schoolLunch = schoolLunch;
        return this;
    }

    @JsonProperty("updHouseFoodOth")
    public String getUpdHouseFoodOth() {
        return updHouseFoodOth;
    }

    @JsonProperty("updHouseFoodOth")
    public void setUpdHouseFoodOth(String updHouseFoodOth) {
        this.updHouseFoodOth = updHouseFoodOth;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdHouseFoodOth(String updHouseFoodOth) {
        this.updHouseFoodOth = updHouseFoodOth;
        return this;
    }

    @JsonProperty("updTaxFilingStatus")
    public String getUpdTaxFilingStatus() {
        return updTaxFilingStatus;
    }

    @JsonProperty("updTaxFilingStatus")
    public void setUpdTaxFilingStatus(String updTaxFilingStatus) {
        this.updTaxFilingStatus = updTaxFilingStatus;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdTaxFilingStatus(String updTaxFilingStatus) {
        this.updTaxFilingStatus = updTaxFilingStatus;
        return this;
    }

    @JsonProperty("updTaxFormInd")
    public String getUpdTaxFormInd() {
        return updTaxFormInd;
    }

    @JsonProperty("updTaxFormInd")
    public void setUpdTaxFormInd(String updTaxFormInd) {
        this.updTaxFormInd = updTaxFormInd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdTaxFormInd(String updTaxFormInd) {
        this.updTaxFormInd = updTaxFormInd;
        return this;
    }

    @JsonProperty("updIraDistributions")
    public String getUpdIraDistributions() {
        return updIraDistributions;
    }

    @JsonProperty("updIraDistributions")
    public void setUpdIraDistributions(String updIraDistributions) {
        this.updIraDistributions = updIraDistributions;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdIraDistributions(String updIraDistributions) {
        this.updIraDistributions = updIraDistributions;
        return this;
    }

    /**
     * AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayUsInc")
    public Double getDisplayUsInc() {
        return displayUsInc;
    }

    /**
     * AGI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayUsInc")
    public void setDisplayUsInc(Double displayUsInc) {
        this.displayUsInc = displayUsInc;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayUsInc(Double displayUsInc) {
        this.displayUsInc = displayUsInc;
        return this;
    }

    @JsonProperty("updUntaxedPensions")
    public String getUpdUntaxedPensions() {
        return updUntaxedPensions;
    }

    @JsonProperty("updUntaxedPensions")
    public void setUpdUntaxedPensions(String updUntaxedPensions) {
        this.updUntaxedPensions = updUntaxedPensions;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdUntaxedPensions(String updUntaxedPensions) {
        this.updUntaxedPensions = updUntaxedPensions;
        return this;
    }

    @JsonProperty("updIncFrWrk")
    public String getUpdIncFrWrk() {
        return updIncFrWrk;
    }

    @JsonProperty("updIncFrWrk")
    public void setUpdIncFrWrk(String updIncFrWrk) {
        this.updIncFrWrk = updIncFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdIncFrWrk(String updIncFrWrk) {
        this.updIncFrWrk = updIncFrWrk;
        return this;
    }

    /**
     *  1040 A or EZ Eligible
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRcrapp41040aEligInd")
    public String getDisplayRcrapp41040aEligInd() {
        return displayRcrapp41040aEligInd;
    }

    /**
     *  1040 A or EZ Eligible
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRcrapp41040aEligInd")
    public void setDisplayRcrapp41040aEligInd(String displayRcrapp41040aEligInd) {
        this.displayRcrapp41040aEligInd = displayRcrapp41040aEligInd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayRcrapp41040aEligInd(String displayRcrapp41040aEligInd) {
        this.displayRcrapp41040aEligInd = displayRcrapp41040aEligInd;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_INC_FR_WRK
     * 
     */
    @JsonProperty("incFrWrk")
    public Double getIncFrWrk() {
        return incFrWrk;
    }

    /**
     * Lineage reference object : RNRVRFY_INC_FR_WRK
     * 
     */
    @JsonProperty("incFrWrk")
    public void setIncFrWrk(Double incFrWrk) {
        this.incFrWrk = incFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withIncFrWrk(Double incFrWrk) {
        this.incFrWrk = incFrWrk;
        return this;
    }

    /**
     * Household Size
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFamMemb")
    public Double getDisplayFamMemb() {
        return displayFamMemb;
    }

    /**
     * Household Size
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFamMemb")
    public void setDisplayFamMemb(Double displayFamMemb) {
        this.displayFamMemb = displayFamMemb;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayFamMemb(Double displayFamMemb) {
        this.displayFamMemb = displayFamMemb;
        return this;
    }

    @JsonProperty("updSpsIncFrWrk")
    public String getUpdSpsIncFrWrk() {
        return updSpsIncFrWrk;
    }

    @JsonProperty("updSpsIncFrWrk")
    public void setUpdSpsIncFrWrk(String updSpsIncFrWrk) {
        this.updSpsIncFrWrk = updSpsIncFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdSpsIncFrWrk(String updSpsIncFrWrk) {
        this.updSpsIncFrWrk = updSpsIncFrWrk;
        return this;
    }

    /**
     * Military and Clergy Allowance
     * <p>
     * Lineage reference object : RNRVRFY_LIV_ALLOW_RECD
     * 
     */
    @JsonProperty("livAllowRecd")
    public Double getLivAllowRecd() {
        return livAllowRecd;
    }

    /**
     * Military and Clergy Allowance
     * <p>
     * Lineage reference object : RNRVRFY_LIV_ALLOW_RECD
     * 
     */
    @JsonProperty("livAllowRecd")
    public void setLivAllowRecd(Double livAllowRecd) {
        this.livAllowRecd = livAllowRecd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withLivAllowRecd(Double livAllowRecd) {
        this.livAllowRecd = livAllowRecd;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_SSI
     * 
     */
    @JsonProperty("recdSsi")
    public String getRecdSsi() {
        return recdSsi;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_SSI
     * 
     */
    @JsonProperty("recdSsi")
    public void setRecdSsi(String recdSsi) {
        this.recdSsi = recdSsi;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRecdSsi(String recdSsi) {
        this.recdSsi = recdSsi;
        return this;
    }

    /**
     * Co-op Earnings
     * <p>
     * Lineage reference object : RNRVRFY_CO_OP_EARNINGS
     * 
     */
    @JsonProperty("coOpEarnings")
    public Double getCoOpEarnings() {
        return coOpEarnings;
    }

    /**
     * Co-op Earnings
     * <p>
     * Lineage reference object : RNRVRFY_CO_OP_EARNINGS
     * 
     */
    @JsonProperty("coOpEarnings")
    public void setCoOpEarnings(Double coOpEarnings) {
        this.coOpEarnings = coOpEarnings;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withCoOpEarnings(Double coOpEarnings) {
        this.coOpEarnings = coOpEarnings;
        return this;
    }

    @JsonProperty("rcrapp3HouseFoodOth")
    public Double getRcrapp3HouseFoodOth() {
        return rcrapp3HouseFoodOth;
    }

    @JsonProperty("rcrapp3HouseFoodOth")
    public void setRcrapp3HouseFoodOth(Double rcrapp3HouseFoodOth) {
        this.rcrapp3HouseFoodOth = rcrapp3HouseFoodOth;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp3HouseFoodOth(Double rcrapp3HouseFoodOth) {
        this.rcrapp3HouseFoodOth = rcrapp3HouseFoodOth;
        return this;
    }

    @JsonProperty("updRecdSsi")
    public String getUpdRecdSsi() {
        return updRecdSsi;
    }

    @JsonProperty("updRecdSsi")
    public void setUpdRecdSsi(String updRecdSsi) {
        this.updRecdSsi = updRecdSsi;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdRecdSsi(String updRecdSsi) {
        this.updRecdSsi = updRecdSsi;
        return this;
    }

    @JsonProperty("rcrapp3NeedBasedEmploy")
    public Double getRcrapp3NeedBasedEmploy() {
        return rcrapp3NeedBasedEmploy;
    }

    @JsonProperty("rcrapp3NeedBasedEmploy")
    public void setRcrapp3NeedBasedEmploy(Double rcrapp3NeedBasedEmploy) {
        this.rcrapp3NeedBasedEmploy = rcrapp3NeedBasedEmploy;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp3NeedBasedEmploy(Double rcrapp3NeedBasedEmploy) {
        this.rcrapp3NeedBasedEmploy = rcrapp3NeedBasedEmploy;
        return this;
    }

    /**
     * Student's Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displayIncFrWrk")
    public Double getDisplayIncFrWrk() {
        return displayIncFrWrk;
    }

    /**
     * Student's Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displayIncFrWrk")
    public void setDisplayIncFrWrk(Double displayIncFrWrk) {
        this.displayIncFrWrk = displayIncFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayIncFrWrk(Double displayIncFrWrk) {
        this.displayIncFrWrk = displayIncFrWrk;
        return this;
    }

    @JsonProperty("rcrapp4CombatPay")
    public Double getRcrapp4CombatPay() {
        return rcrapp4CombatPay;
    }

    @JsonProperty("rcrapp4CombatPay")
    public void setRcrapp4CombatPay(Double rcrapp4CombatPay) {
        this.rcrapp4CombatPay = rcrapp4CombatPay;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp4CombatPay(Double rcrapp4CombatPay) {
        this.rcrapp4CombatPay = rcrapp4CombatPay;
        return this;
    }

    /**
     * Free or Reduced Lunch
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySchoolLunch")
    public String getDisplaySchoolLunch() {
        return displaySchoolLunch;
    }

    /**
     * Free or Reduced Lunch
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySchoolLunch")
    public void setDisplaySchoolLunch(String displaySchoolLunch) {
        this.displaySchoolLunch = displaySchoolLunch;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplaySchoolLunch(String displaySchoolLunch) {
        this.displaySchoolLunch = displaySchoolLunch;
        return this;
    }

    /**
     * Verification Status
     * <p>
     * 
     * 
     */
    @JsonProperty("statCode1")
    public String getStatCode1() {
        return statCode1;
    }

    /**
     * Verification Status
     * <p>
     * 
     * 
     */
    @JsonProperty("statCode1")
    public void setStatCode1(String statCode1) {
        this.statCode1 = statCode1;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withStatCode1(String statCode1) {
        this.statCode1 = statCode1;
        return this;
    }

    /**
     * Tax-Deferred Pensions
     * <p>
     * Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT
     * 
     */
    @JsonProperty("taxDefPensPayt")
    public Double getTaxDefPensPayt() {
        return taxDefPensPayt;
    }

    /**
     * Tax-Deferred Pensions
     * <p>
     * Lineage reference object : RNRVRFY_TAX_DEF_PENS_PAYT
     * 
     */
    @JsonProperty("taxDefPensPayt")
    public void setTaxDefPensPayt(Double taxDefPensPayt) {
        this.taxDefPensPayt = taxDefPensPayt;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withTaxDefPensPayt(Double taxDefPensPayt) {
        this.taxDefPensPayt = taxDefPensPayt;
        return this;
    }

    @JsonProperty("updOthNonReportMoney")
    public String getUpdOthNonReportMoney() {
        return updOthNonReportMoney;
    }

    @JsonProperty("updOthNonReportMoney")
    public void setUpdOthNonReportMoney(String updOthNonReportMoney) {
        this.updOthNonReportMoney = updOthNonReportMoney;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdOthNonReportMoney(String updOthNonReportMoney) {
        this.updOthNonReportMoney = updOthNonReportMoney;
        return this;
    }

    /**
     * High School Completion
     * <p>
     * Lineage reference object : RNRVRFY_HS_COMPLETION
     * 
     */
    @JsonProperty("hsCompletion")
    public String getHsCompletion() {
        return hsCompletion;
    }

    /**
     * High School Completion
     * <p>
     * Lineage reference object : RNRVRFY_HS_COMPLETION
     * 
     */
    @JsonProperty("hsCompletion")
    public void setHsCompletion(String hsCompletion) {
        this.hsCompletion = hsCompletion;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withHsCompletion(String hsCompletion) {
        this.hsCompletion = hsCompletion;
        return this;
    }

    @JsonProperty("rcrapp3GrantScholarAid")
    public Double getRcrapp3GrantScholarAid() {
        return rcrapp3GrantScholarAid;
    }

    @JsonProperty("rcrapp3GrantScholarAid")
    public void setRcrapp3GrantScholarAid(Double rcrapp3GrantScholarAid) {
        this.rcrapp3GrantScholarAid = rcrapp3GrantScholarAid;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp3GrantScholarAid(Double rcrapp3GrantScholarAid) {
        this.rcrapp3GrantScholarAid = rcrapp3GrantScholarAid;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("taxFilingStatus")
    public String getTaxFilingStatus() {
        return taxFilingStatus;
    }

    /**
     * Lineage reference object : RNRVRFY_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("taxFilingStatus")
    public void setTaxFilingStatus(String taxFilingStatus) {
        this.taxFilingStatus = taxFilingStatus;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withTaxFilingStatus(String taxFilingStatus) {
        this.taxFilingStatus = taxFilingStatus;
        return this;
    }

    @JsonProperty("updIraKeogh")
    public String getUpdIraKeogh() {
        return updIraKeogh;
    }

    @JsonProperty("updIraKeogh")
    public void setUpdIraKeogh(String updIraKeogh) {
        this.updIraKeogh = updIraKeogh;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdIraKeogh(String updIraKeogh) {
        this.updIraKeogh = updIraKeogh;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_FAM_MEMB
     * 
     */
    @JsonProperty("famMemb")
    public Double getFamMemb() {
        return famMemb;
    }

    /**
     * Lineage reference object : RNRVRFY_FAM_MEMB
     * 
     */
    @JsonProperty("famMemb")
    public void setFamMemb(Double famMemb) {
        this.famMemb = famMemb;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withFamMemb(Double famMemb) {
        this.famMemb = famMemb;
        return this;
    }

    /**
     * Tax Filing Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTaxFilingStatus")
    public String getDisplayTaxFilingStatus() {
        return displayTaxFilingStatus;
    }

    /**
     * Tax Filing Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTaxFilingStatus")
    public void setDisplayTaxFilingStatus(String displayTaxFilingStatus) {
        this.displayTaxFilingStatus = displayTaxFilingStatus;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayTaxFilingStatus(String displayTaxFilingStatus) {
        this.displayTaxFilingStatus = displayTaxFilingStatus;
        return this;
    }

    /**
     * Child Support Paid
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP_PD
     * 
     */
    @JsonProperty("childSuppPd")
    public Double getChildSuppPd() {
        return childSuppPd;
    }

    /**
     * Child Support Paid
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP_PD
     * 
     */
    @JsonProperty("childSuppPd")
    public void setChildSuppPd(Double childSuppPd) {
        this.childSuppPd = childSuppPd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withChildSuppPd(Double childSuppPd) {
        this.childSuppPd = childSuppPd;
        return this;
    }

    /**
     * Medical or SSI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRecdSsi")
    public String getDisplayRecdSsi() {
        return displayRecdSsi;
    }

    /**
     * Medical or SSI
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRecdSsi")
    public void setDisplayRecdSsi(String displayRecdSsi) {
        this.displayRecdSsi = displayRecdSsi;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayRecdSsi(String displayRecdSsi) {
        this.displayRecdSsi = displayRecdSsi;
        return this;
    }

    /**
     * Dislocated Worker
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDislWrk")
    public String getDisplayDislWrk() {
        return displayDislWrk;
    }

    /**
     * Dislocated Worker
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDislWrk")
    public void setDisplayDislWrk(String displayDislWrk) {
        this.displayDislWrk = displayDislWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayDislWrk(String displayDislWrk) {
        this.displayDislWrk = displayDislWrk;
        return this;
    }

    @JsonProperty("updPensionPayments")
    public String getUpdPensionPayments() {
        return updPensionPayments;
    }

    @JsonProperty("updPensionPayments")
    public void setUpdPensionPayments(String updPensionPayments) {
        this.updPensionPayments = updPensionPayments;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdPensionPayments(String updPensionPayments) {
        this.updPensionPayments = updPensionPayments;
        return this;
    }

    /**
     * Child Support Received
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP
     * 
     */
    @JsonProperty("childSupp")
    public Double getChildSupp() {
        return childSupp;
    }

    /**
     * Child Support Received
     * <p>
     * Lineage reference object : RNRVRFY_CHILD_SUPP
     * 
     */
    @JsonProperty("childSupp")
    public void setChildSupp(Double childSupp) {
        this.childSupp = childSupp;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withChildSupp(Double childSupp) {
        this.childSupp = childSupp;
        return this;
    }

    /**
     * Type of Tax Return
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTaxFormInd")
    public String getDisplayTaxFormInd() {
        return displayTaxFormInd;
    }

    /**
     * Type of Tax Return
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTaxFormInd")
    public void setDisplayTaxFormInd(String displayTaxFormInd) {
        this.displayTaxFormInd = displayTaxFormInd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayTaxFormInd(String displayTaxFormInd) {
        this.displayTaxFormInd = displayTaxFormInd;
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

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withFederalBenefitsExist(String federalBenefitsExist) {
        this.federalBenefitsExist = federalBenefitsExist;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_US_INC_TAX_PD
     * 
     */
    @JsonProperty("usIncTaxPd")
    public Double getUsIncTaxPd() {
        return usIncTaxPd;
    }

    /**
     * Lineage reference object : RNRVRFY_US_INC_TAX_PD
     * 
     */
    @JsonProperty("usIncTaxPd")
    public void setUsIncTaxPd(Double usIncTaxPd) {
        this.usIncTaxPd = usIncTaxPd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUsIncTaxPd(Double usIncTaxPd) {
        this.usIncTaxPd = usIncTaxPd;
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

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayVerificationPrtyDesc(String displayVerificationPrtyDesc) {
        this.displayVerificationPrtyDesc = displayVerificationPrtyDesc;
        return this;
    }

    /**
     * IRA and Keogh Deductions
     * <p>
     * Lineage reference object : RNRVRFY_IRA
     * 
     */
    @JsonProperty("ira")
    public Double getIra() {
        return ira;
    }

    /**
     * IRA and Keogh Deductions
     * <p>
     * Lineage reference object : RNRVRFY_IRA
     * 
     */
    @JsonProperty("ira")
    public void setIra(Double ira) {
        this.ira = ira;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withIra(Double ira) {
        this.ira = ira;
        return this;
    }

    @JsonProperty("updDislWrk")
    public String getUpdDislWrk() {
        return updDislWrk;
    }

    @JsonProperty("updDislWrk")
    public void setUpdDislWrk(String updDislWrk) {
        this.updDislWrk = updDislWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdDislWrk(String updDislWrk) {
        this.updDislWrk = updDislWrk;
        return this;
    }

    @JsonProperty("rcrapp3ChildSuppPaid")
    public Double getRcrapp3ChildSuppPaid() {
        return rcrapp3ChildSuppPaid;
    }

    @JsonProperty("rcrapp3ChildSuppPaid")
    public void setRcrapp3ChildSuppPaid(Double rcrapp3ChildSuppPaid) {
        this.rcrapp3ChildSuppPaid = rcrapp3ChildSuppPaid;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp3ChildSuppPaid(Double rcrapp3ChildSuppPaid) {
        this.rcrapp3ChildSuppPaid = rcrapp3ChildSuppPaid;
        return this;
    }

    @JsonProperty("updFoodStamps")
    public String getUpdFoodStamps() {
        return updFoodStamps;
    }

    @JsonProperty("updFoodStamps")
    public void setUpdFoodStamps(String updFoodStamps) {
        this.updFoodStamps = updFoodStamps;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdFoodStamps(String updFoodStamps) {
        this.updFoodStamps = updFoodStamps;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_TANF
     * 
     */
    @JsonProperty("recdTanf")
    public String getRecdTanf() {
        return recdTanf;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_TANF
     * 
     */
    @JsonProperty("recdTanf")
    public void setRecdTanf(String recdTanf) {
        this.recdTanf = recdTanf;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRecdTanf(String recdTanf) {
        this.recdTanf = recdTanf;
        return this;
    }

    @JsonProperty("rcrapp1OthNonReportMoney")
    public Double getRcrapp1OthNonReportMoney() {
        return rcrapp1OthNonReportMoney;
    }

    @JsonProperty("rcrapp1OthNonReportMoney")
    public void setRcrapp1OthNonReportMoney(Double rcrapp1OthNonReportMoney) {
        this.rcrapp1OthNonReportMoney = rcrapp1OthNonReportMoney;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp1OthNonReportMoney(Double rcrapp1OthNonReportMoney) {
        this.rcrapp1OthNonReportMoney = rcrapp1OthNonReportMoney;
        return this;
    }

    /**
     * Grant and Scholarship Aid
     * <p>
     * Lineage reference object : RNRVRFY_OTHER_TAX_FINAID
     * 
     */
    @JsonProperty("otherTaxFinaid")
    public Double getOtherTaxFinaid() {
        return otherTaxFinaid;
    }

    /**
     * Grant and Scholarship Aid
     * <p>
     * Lineage reference object : RNRVRFY_OTHER_TAX_FINAID
     * 
     */
    @JsonProperty("otherTaxFinaid")
    public void setOtherTaxFinaid(Double otherTaxFinaid) {
        this.otherTaxFinaid = otherTaxFinaid;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withOtherTaxFinaid(Double otherTaxFinaid) {
        this.otherTaxFinaid = otherTaxFinaid;
        return this;
    }

    /**
     * WIC
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRecdWic")
    public String getDisplayRecdWic() {
        return displayRecdWic;
    }

    /**
     * WIC
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRecdWic")
    public void setDisplayRecdWic(String displayRecdWic) {
        this.displayRecdWic = displayRecdWic;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayRecdWic(String displayRecdWic) {
        this.displayRecdWic = displayRecdWic;
        return this;
    }

    @JsonProperty("updIntInc")
    public String getUpdIntInc() {
        return updIntInc;
    }

    @JsonProperty("updIntInc")
    public void setUpdIntInc(String updIntInc) {
        this.updIntInc = updIntInc;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdIntInc(String updIntInc) {
        this.updIntInc = updIntInc;
        return this;
    }

    /**
     * Spouse's Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySpsIncFrWrk")
    public Double getDisplaySpsIncFrWrk() {
        return displaySpsIncFrWrk;
    }

    /**
     * Spouse's Earned Income
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySpsIncFrWrk")
    public void setDisplaySpsIncFrWrk(Double displaySpsIncFrWrk) {
        this.displaySpsIncFrWrk = displaySpsIncFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplaySpsIncFrWrk(Double displaySpsIncFrWrk) {
        this.displaySpsIncFrWrk = displaySpsIncFrWrk;
        return this;
    }

    @JsonProperty("updUsIncTaxPd")
    public String getUpdUsIncTaxPd() {
        return updUsIncTaxPd;
    }

    @JsonProperty("updUsIncTaxPd")
    public void setUpdUsIncTaxPd(String updUsIncTaxPd) {
        this.updUsIncTaxPd = updUsIncTaxPd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdUsIncTaxPd(String updUsIncTaxPd) {
        this.updUsIncTaxPd = updUsIncTaxPd;
        return this;
    }

    @JsonProperty("updVetsNonEdBen")
    public String getUpdVetsNonEdBen() {
        return updVetsNonEdBen;
    }

    @JsonProperty("updVetsNonEdBen")
    public void setUpdVetsNonEdBen(String updVetsNonEdBen) {
        this.updVetsNonEdBen = updVetsNonEdBen;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdVetsNonEdBen(String updVetsNonEdBen) {
        this.updVetsNonEdBen = updVetsNonEdBen;
        return this;
    }

    @JsonProperty("rcrapp1IraDistributions")
    public Double getRcrapp1IraDistributions() {
        return rcrapp1IraDistributions;
    }

    @JsonProperty("rcrapp1IraDistributions")
    public void setRcrapp1IraDistributions(Double rcrapp1IraDistributions) {
        this.rcrapp1IraDistributions = rcrapp1IraDistributions;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp1IraDistributions(Double rcrapp1IraDistributions) {
        this.rcrapp1IraDistributions = rcrapp1IraDistributions;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_ELIG_IND
     * 
     */
    @JsonProperty("eligInd")
    public String getEligInd() {
        return eligInd;
    }

    /**
     * Lineage reference object : RNRVRFY_ELIG_IND
     * 
     */
    @JsonProperty("eligInd")
    public void setEligInd(String eligInd) {
        this.eligInd = eligInd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withEligInd(String eligInd) {
        this.eligInd = eligInd;
        return this;
    }

    @JsonProperty("rcrapp1VetsNonEdBen")
    public Double getRcrapp1VetsNonEdBen() {
        return rcrapp1VetsNonEdBen;
    }

    @JsonProperty("rcrapp1VetsNonEdBen")
    public void setRcrapp1VetsNonEdBen(Double rcrapp1VetsNonEdBen) {
        this.rcrapp1VetsNonEdBen = rcrapp1VetsNonEdBen;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp1VetsNonEdBen(Double rcrapp1VetsNonEdBen) {
        this.rcrapp1VetsNonEdBen = rcrapp1VetsNonEdBen;
        return this;
    }

    /**
     * Education Tax Credits
     * <p>
     * Lineage reference object : RNRVRFY_ED_CREDITS
     * 
     */
    @JsonProperty("edCredits")
    public Double getEdCredits() {
        return edCredits;
    }

    /**
     * Education Tax Credits
     * <p>
     * Lineage reference object : RNRVRFY_ED_CREDITS
     * 
     */
    @JsonProperty("edCredits")
    public void setEdCredits(Double edCredits) {
        this.edCredits = edCredits;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withEdCredits(Double edCredits) {
        this.edCredits = edCredits;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_NO_IN_COLL
     * 
     */
    @JsonProperty("noInColl")
    public Double getNoInColl() {
        return noInColl;
    }

    /**
     * Lineage reference object : RNRVRFY_NO_IN_COLL
     * 
     */
    @JsonProperty("noInColl")
    public void setNoInColl(Double noInColl) {
        this.noInColl = noInColl;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withNoInColl(Double noInColl) {
        this.noInColl = noInColl;
        return this;
    }

    @JsonProperty("updOthUntaxInc")
    public String getUpdOthUntaxInc() {
        return updOthUntaxInc;
    }

    @JsonProperty("updOthUntaxInc")
    public void setUpdOthUntaxInc(String updOthUntaxInc) {
        this.updOthUntaxInc = updOthUntaxInc;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdOthUntaxInc(String updOthUntaxInc) {
        this.updOthUntaxInc = updOthUntaxInc;
        return this;
    }

    @JsonProperty("updCoOpEarnings")
    public String getUpdCoOpEarnings() {
        return updCoOpEarnings;
    }

    @JsonProperty("updCoOpEarnings")
    public void setUpdCoOpEarnings(String updCoOpEarnings) {
        this.updCoOpEarnings = updCoOpEarnings;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdCoOpEarnings(String updCoOpEarnings) {
        this.updCoOpEarnings = updCoOpEarnings;
        return this;
    }

    @JsonProperty("rcrapp1OthUntaxInc")
    public Double getRcrapp1OthUntaxInc() {
        return rcrapp1OthUntaxInc;
    }

    @JsonProperty("rcrapp1OthUntaxInc")
    public void setRcrapp1OthUntaxInc(Double rcrapp1OthUntaxInc) {
        this.rcrapp1OthUntaxInc = rcrapp1OthUntaxInc;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp1OthUntaxInc(Double rcrapp1OthUntaxInc) {
        this.rcrapp1OthUntaxInc = rcrapp1OthUntaxInc;
        return this;
    }

    @JsonProperty("updNoInColl")
    public String getUpdNoInColl() {
        return updNoInColl;
    }

    @JsonProperty("updNoInColl")
    public void setUpdNoInColl(String updNoInColl) {
        this.updNoInColl = updNoInColl;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdNoInColl(String updNoInColl) {
        this.updNoInColl = updNoInColl;
        return this;
    }

    /**
     * SNAP(Food Stamps)
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFoodStamps")
    public String getDisplayFoodStamps() {
        return displayFoodStamps;
    }

    /**
     * SNAP(Food Stamps)
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFoodStamps")
    public void setDisplayFoodStamps(String displayFoodStamps) {
        this.displayFoodStamps = displayFoodStamps;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayFoodStamps(String displayFoodStamps) {
        this.displayFoodStamps = displayFoodStamps;
        return this;
    }

    @JsonProperty("updChildSuppPaid")
    public String getUpdChildSuppPaid() {
        return updChildSuppPaid;
    }

    @JsonProperty("updChildSuppPaid")
    public void setUpdChildSuppPaid(String updChildSuppPaid) {
        this.updChildSuppPaid = updChildSuppPaid;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdChildSuppPaid(String updChildSuppPaid) {
        this.updChildSuppPaid = updChildSuppPaid;
        return this;
    }

    /**
     * Update Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("updateRcrapp1Ind1")
    public String getUpdateRcrapp1Ind1() {
        return updateRcrapp1Ind1;
    }

    /**
     * Update Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("updateRcrapp1Ind1")
    public void setUpdateRcrapp1Ind1(String updateRcrapp1Ind1) {
        this.updateRcrapp1Ind1 = updateRcrapp1Ind1;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdateRcrapp1Ind1(String updateRcrapp1Ind1) {
        this.updateRcrapp1Ind1 = updateRcrapp1Ind1;
        return this;
    }

    /**
     * Untaxed IRA Distributions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_IRA_DIST
     * 
     */
    @JsonProperty("untaxedIraDist")
    public Double getUntaxedIraDist() {
        return untaxedIraDist;
    }

    /**
     * Untaxed IRA Distributions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_IRA_DIST
     * 
     */
    @JsonProperty("untaxedIraDist")
    public void setUntaxedIraDist(Double untaxedIraDist) {
        this.untaxedIraDist = untaxedIraDist;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUntaxedIraDist(Double untaxedIraDist) {
        this.untaxedIraDist = untaxedIraDist;
        return this;
    }

    /**
     * Tax Paid
     * <p>
     * 
     * 
     */
    @JsonProperty("displayUsIncTaxPd")
    public Double getDisplayUsIncTaxPd() {
        return displayUsIncTaxPd;
    }

    /**
     * Tax Paid
     * <p>
     * 
     * 
     */
    @JsonProperty("displayUsIncTaxPd")
    public void setDisplayUsIncTaxPd(Double displayUsIncTaxPd) {
        this.displayUsIncTaxPd = displayUsIncTaxPd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayUsIncTaxPd(Double displayUsIncTaxPd) {
        this.displayUsIncTaxPd = displayUsIncTaxPd;
        return this;
    }

    /**
     * Identity and SEP
     * <p>
     * Lineage reference object : RNRVRFY_IDENTITY_SEP
     * 
     */
    @JsonProperty("identitySep")
    public String getIdentitySep() {
        return identitySep;
    }

    /**
     * Identity and SEP
     * <p>
     * Lineage reference object : RNRVRFY_IDENTITY_SEP
     * 
     */
    @JsonProperty("identitySep")
    public void setIdentitySep(String identitySep) {
        this.identitySep = identitySep;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withIdentitySep(String identitySep) {
        this.identitySep = identitySep;
        return this;
    }

    @JsonProperty("updUsInc")
    public String getUpdUsInc() {
        return updUsInc;
    }

    @JsonProperty("updUsInc")
    public void setUpdUsInc(String updUsInc) {
        this.updUsInc = updUsInc;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdUsInc(String updUsInc) {
        this.updUsInc = updUsInc;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_SPS_INC_FR_WRK
     * 
     */
    @JsonProperty("spsIncFrWrk")
    public Double getSpsIncFrWrk() {
        return spsIncFrWrk;
    }

    /**
     * Lineage reference object : RNRVRFY_SPS_INC_FR_WRK
     * 
     */
    @JsonProperty("spsIncFrWrk")
    public void setSpsIncFrWrk(Double spsIncFrWrk) {
        this.spsIncFrWrk = spsIncFrWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withSpsIncFrWrk(Double spsIncFrWrk) {
        this.spsIncFrWrk = spsIncFrWrk;
        return this;
    }

    @JsonProperty("updCombatPay")
    public String getUpdCombatPay() {
        return updCombatPay;
    }

    @JsonProperty("updCombatPay")
    public void setUpdCombatPay(String updCombatPay) {
        this.updCombatPay = updCombatPay;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdCombatPay(String updCombatPay) {
        this.updCombatPay = updCombatPay;
        return this;
    }

    /**
     * Need Based Employment
     * <p>
     * Lineage reference object : RNRVRFY_TAX_FIN_AID_RECD
     * 
     */
    @JsonProperty("taxFinAidRecd")
    public Double getTaxFinAidRecd() {
        return taxFinAidRecd;
    }

    /**
     * Need Based Employment
     * <p>
     * Lineage reference object : RNRVRFY_TAX_FIN_AID_RECD
     * 
     */
    @JsonProperty("taxFinAidRecd")
    public void setTaxFinAidRecd(Double taxFinAidRecd) {
        this.taxFinAidRecd = taxFinAidRecd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withTaxFinAidRecd(Double taxFinAidRecd) {
        this.taxFinAidRecd = taxFinAidRecd;
        return this;
    }

    @JsonProperty("rcrapp3CoOpEarnings")
    public Double getRcrapp3CoOpEarnings() {
        return rcrapp3CoOpEarnings;
    }

    @JsonProperty("rcrapp3CoOpEarnings")
    public void setRcrapp3CoOpEarnings(Double rcrapp3CoOpEarnings) {
        this.rcrapp3CoOpEarnings = rcrapp3CoOpEarnings;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp3CoOpEarnings(Double rcrapp3CoOpEarnings) {
        this.rcrapp3CoOpEarnings = rcrapp3CoOpEarnings;
        return this;
    }

    @JsonProperty("updS1040EligInd")
    public String getUpdS1040EligInd() {
        return updS1040EligInd;
    }

    @JsonProperty("updS1040EligInd")
    public void setUpdS1040EligInd(String updS1040EligInd) {
        this.updS1040EligInd = updS1040EligInd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdS1040EligInd(String updS1040EligInd) {
        this.updS1040EligInd = updS1040EligInd;
        return this;
    }

    @JsonProperty("rcrapp4IraKeoghAmt")
    public Double getRcrapp4IraKeoghAmt() {
        return rcrapp4IraKeoghAmt;
    }

    @JsonProperty("rcrapp4IraKeoghAmt")
    public void setRcrapp4IraKeoghAmt(Double rcrapp4IraKeoghAmt) {
        this.rcrapp4IraKeoghAmt = rcrapp4IraKeoghAmt;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp4IraKeoghAmt(Double rcrapp4IraKeoghAmt) {
        this.rcrapp4IraKeoghAmt = rcrapp4IraKeoghAmt;
        return this;
    }

    /**
     * Number in College
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNoInColl")
    public Double getDisplayNoInColl() {
        return displayNoInColl;
    }

    /**
     * Number in College
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNoInColl")
    public void setDisplayNoInColl(Double displayNoInColl) {
        this.displayNoInColl = displayNoInColl;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayNoInColl(Double displayNoInColl) {
        this.displayNoInColl = displayNoInColl;
        return this;
    }

    @JsonProperty("updSchoolLunch")
    public String getUpdSchoolLunch() {
        return updSchoolLunch;
    }

    @JsonProperty("updSchoolLunch")
    public void setUpdSchoolLunch(String updSchoolLunch) {
        this.updSchoolLunch = updSchoolLunch;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdSchoolLunch(String updSchoolLunch) {
        this.updSchoolLunch = updSchoolLunch;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_FOOD_STAMPS
     * 
     */
    @JsonProperty("foodStamps")
    public String getFoodStamps() {
        return foodStamps;
    }

    /**
     * Lineage reference object : RNRVRFY_FOOD_STAMPS
     * 
     */
    @JsonProperty("foodStamps")
    public void setFoodStamps(String foodStamps) {
        this.foodStamps = foodStamps;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withFoodStamps(String foodStamps) {
        this.foodStamps = foodStamps;
        return this;
    }

    @JsonProperty("rcrapp1UntaxPensions")
    public Double getRcrapp1UntaxPensions() {
        return rcrapp1UntaxPensions;
    }

    @JsonProperty("rcrapp1UntaxPensions")
    public void setRcrapp1UntaxPensions(Double rcrapp1UntaxPensions) {
        this.rcrapp1UntaxPensions = rcrapp1UntaxPensions;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp1UntaxPensions(Double rcrapp1UntaxPensions) {
        this.rcrapp1UntaxPensions = rcrapp1UntaxPensions;
        return this;
    }

    /**
     * Untaxed Pensions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_PENSION
     * 
     */
    @JsonProperty("untaxedPension")
    public Double getUntaxedPension() {
        return untaxedPension;
    }

    /**
     * Untaxed Pensions
     * <p>
     * Lineage reference object : RNRVRFY_UNTAXED_PENSION
     * 
     */
    @JsonProperty("untaxedPension")
    public void setUntaxedPension(Double untaxedPension) {
        this.untaxedPension = untaxedPension;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUntaxedPension(Double untaxedPension) {
        this.untaxedPension = untaxedPension;
        return this;
    }

    /**
     * Tax Exempt Interest
     * <p>
     * Lineage reference object : RNRVRFY_TAX_EXEMPT_INT_INC
     * 
     */
    @JsonProperty("taxExemptIntInc")
    public Double getTaxExemptIntInc() {
        return taxExemptIntInc;
    }

    /**
     * Tax Exempt Interest
     * <p>
     * Lineage reference object : RNRVRFY_TAX_EXEMPT_INT_INC
     * 
     */
    @JsonProperty("taxExemptIntInc")
    public void setTaxExemptIntInc(Double taxExemptIntInc) {
        this.taxExemptIntInc = taxExemptIntInc;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withTaxExemptIntInc(Double taxExemptIntInc) {
        this.taxExemptIntInc = taxExemptIntInc;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_US_INC
     * 
     */
    @JsonProperty("usInc")
    public Double getUsInc() {
        return usInc;
    }

    /**
     * Lineage reference object : RNRVRFY_US_INC
     * 
     */
    @JsonProperty("usInc")
    public void setUsInc(Double usInc) {
        this.usInc = usInc;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUsInc(Double usInc) {
        this.usInc = usInc;
        return this;
    }

    @JsonProperty("updEducCredits")
    public String getUpdEducCredits() {
        return updEducCredits;
    }

    @JsonProperty("updEducCredits")
    public void setUpdEducCredits(String updEducCredits) {
        this.updEducCredits = updEducCredits;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdEducCredits(String updEducCredits) {
        this.updEducCredits = updEducCredits;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_TAX_FORM_IND
     * 
     */
    @JsonProperty("taxFormInd")
    public String getTaxFormInd() {
        return taxFormInd;
    }

    /**
     * Lineage reference object : RNRVRFY_TAX_FORM_IND
     * 
     */
    @JsonProperty("taxFormInd")
    public void setTaxFormInd(String taxFormInd) {
        this.taxFormInd = taxFormInd;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withTaxFormInd(String taxFormInd) {
        this.taxFormInd = taxFormInd;
        return this;
    }

    /**
     * TANF
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRecdTanf")
    public String getDisplayRecdTanf() {
        return displayRecdTanf;
    }

    /**
     * TANF
     * <p>
     * 
     * 
     */
    @JsonProperty("displayRecdTanf")
    public void setDisplayRecdTanf(String displayRecdTanf) {
        this.displayRecdTanf = displayRecdTanf;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDisplayRecdTanf(String displayRecdTanf) {
        this.displayRecdTanf = displayRecdTanf;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_DISL_WRK
     * 
     */
    @JsonProperty("dislWrk")
    public String getDislWrk() {
        return dislWrk;
    }

    /**
     * Lineage reference object : RNRVRFY_DISL_WRK
     * 
     */
    @JsonProperty("dislWrk")
    public void setDislWrk(String dislWrk) {
        this.dislWrk = dislWrk;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withDislWrk(String dislWrk) {
        this.dislWrk = dislWrk;
        return this;
    }

    @JsonProperty("rcrapp3TaxDefPension")
    public Double getRcrapp3TaxDefPension() {
        return rcrapp3TaxDefPension;
    }

    @JsonProperty("rcrapp3TaxDefPension")
    public void setRcrapp3TaxDefPension(Double rcrapp3TaxDefPension) {
        this.rcrapp3TaxDefPension = rcrapp3TaxDefPension;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp3TaxDefPension(Double rcrapp3TaxDefPension) {
        this.rcrapp3TaxDefPension = rcrapp3TaxDefPension;
        return this;
    }

    @JsonProperty("updRecdTanf")
    public String getUpdRecdTanf() {
        return updRecdTanf;
    }

    @JsonProperty("updRecdTanf")
    public void setUpdRecdTanf(String updRecdTanf) {
        this.updRecdTanf = updRecdTanf;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdRecdTanf(String updRecdTanf) {
        this.updRecdTanf = updRecdTanf;
        return this;
    }

    @JsonProperty("updGrantScholarAid")
    public String getUpdGrantScholarAid() {
        return updGrantScholarAid;
    }

    @JsonProperty("updGrantScholarAid")
    public void setUpdGrantScholarAid(String updGrantScholarAid) {
        this.updGrantScholarAid = updGrantScholarAid;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdGrantScholarAid(String updGrantScholarAid) {
        this.updGrantScholarAid = updGrantScholarAid;
        return this;
    }

    @JsonProperty("updChildSupportReceived")
    public String getUpdChildSupportReceived() {
        return updChildSupportReceived;
    }

    @JsonProperty("updChildSupportReceived")
    public void setUpdChildSupportReceived(String updChildSupportReceived) {
        this.updChildSupportReceived = updChildSupportReceived;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdChildSupportReceived(String updChildSupportReceived) {
        this.updChildSupportReceived = updChildSupportReceived;
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

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp1VerificationPrty(String rcrapp1VerificationPrty) {
        this.rcrapp1VerificationPrty = rcrapp1VerificationPrty;
        return this;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_WIC
     * 
     */
    @JsonProperty("recdWic")
    public String getRecdWic() {
        return recdWic;
    }

    /**
     * Lineage reference object : RNRVRFY_RECD_WIC
     * 
     */
    @JsonProperty("recdWic")
    public void setRecdWic(String recdWic) {
        this.recdWic = recdWic;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRecdWic(String recdWic) {
        this.recdWic = recdWic;
        return this;
    }

    @JsonProperty("rcrapp1ChildSupp")
    public Double getRcrapp1ChildSupp() {
        return rcrapp1ChildSupp;
    }

    @JsonProperty("rcrapp1ChildSupp")
    public void setRcrapp1ChildSupp(Double rcrapp1ChildSupp) {
        this.rcrapp1ChildSupp = rcrapp1ChildSupp;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp1ChildSupp(Double rcrapp1ChildSupp) {
        this.rcrapp1ChildSupp = rcrapp1ChildSupp;
        return this;
    }

    @JsonProperty("updFamMemb")
    public String getUpdFamMemb() {
        return updFamMemb;
    }

    @JsonProperty("updFamMemb")
    public void setUpdFamMemb(String updFamMemb) {
        this.updFamMemb = updFamMemb;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdFamMemb(String updFamMemb) {
        this.updFamMemb = updFamMemb;
        return this;
    }

    @JsonProperty("updWic")
    public String getUpdWic() {
        return updWic;
    }

    @JsonProperty("updWic")
    public void setUpdWic(String updWic) {
        this.updWic = updWic;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdWic(String updWic) {
        this.updWic = updWic;
        return this;
    }

    @JsonProperty("updNeedBasedEmploy")
    public String getUpdNeedBasedEmploy() {
        return updNeedBasedEmploy;
    }

    @JsonProperty("updNeedBasedEmploy")
    public void setUpdNeedBasedEmploy(String updNeedBasedEmploy) {
        this.updNeedBasedEmploy = updNeedBasedEmploy;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withUpdNeedBasedEmploy(String updNeedBasedEmploy) {
        this.updNeedBasedEmploy = updNeedBasedEmploy;
        return this;
    }

    @JsonProperty("rcrapp3EducCredits")
    public Double getRcrapp3EducCredits() {
        return rcrapp3EducCredits;
    }

    @JsonProperty("rcrapp3EducCredits")
    public void setRcrapp3EducCredits(Double rcrapp3EducCredits) {
        this.rcrapp3EducCredits = rcrapp3EducCredits;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp3EducCredits(Double rcrapp3EducCredits) {
        this.rcrapp3EducCredits = rcrapp3EducCredits;
        return this;
    }

    @JsonProperty("rcrapp3TeIntInc")
    public Double getRcrapp3TeIntInc() {
        return rcrapp3TeIntInc;
    }

    @JsonProperty("rcrapp3TeIntInc")
    public void setRcrapp3TeIntInc(Double rcrapp3TeIntInc) {
        this.rcrapp3TeIntInc = rcrapp3TeIntInc;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withRcrapp3TeIntInc(Double rcrapp3TeIntInc) {
        this.rcrapp3TeIntInc = rcrapp3TeIntInc;
        return this;
    }

    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN
     * 
     */
    @JsonProperty("vaNonEducBen")
    public Double getVaNonEducBen() {
        return vaNonEducBen;
    }

    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RNRVRFY_VA_NON_EDUC_BEN
     * 
     */
    @JsonProperty("vaNonEducBen")
    public void setVaNonEducBen(Double vaNonEducBen) {
        this.vaNonEducBen = vaNonEducBen;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withVaNonEducBen(Double vaNonEducBen) {
        this.vaNonEducBen = vaNonEducBen;
        return this;
    }

    /**
     * Other Untaxed Income
     * <p>
     * Lineage reference object : RNRVRFY_ALL_OTHER_UNTAX_INC
     * 
     */
    @JsonProperty("allOtherUntaxInc")
    public Double getAllOtherUntaxInc() {
        return allOtherUntaxInc;
    }

    /**
     * Other Untaxed Income
     * <p>
     * Lineage reference object : RNRVRFY_ALL_OTHER_UNTAX_INC
     * 
     */
    @JsonProperty("allOtherUntaxInc")
    public void setAllOtherUntaxInc(Double allOtherUntaxInc) {
        this.allOtherUntaxInc = allOtherUntaxInc;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withAllOtherUntaxInc(Double allOtherUntaxInc) {
        this.allOtherUntaxInc = allOtherUntaxInc;
        return this;
    }

    /**
     * Combat Pay
     * <p>
     * Lineage reference object : RNRVRFY_COMBAT_PAY
     * 
     */
    @JsonProperty("combatPay")
    public Double getCombatPay() {
        return combatPay;
    }

    /**
     * Combat Pay
     * <p>
     * Lineage reference object : RNRVRFY_COMBAT_PAY
     * 
     */
    @JsonProperty("combatPay")
    public void setCombatPay(Double combatPay) {
        this.combatPay = combatPay;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withCombatPay(Double combatPay) {
        this.combatPay = combatPay;
        return this;
    }

    /**
     * Other Non-Reported Money
     * <p>
     * Lineage reference object : RNRVRFY_CASH_RECEIVED
     * 
     */
    @JsonProperty("cashReceived")
    public Double getCashReceived() {
        return cashReceived;
    }

    /**
     * Other Non-Reported Money
     * <p>
     * Lineage reference object : RNRVRFY_CASH_RECEIVED
     * 
     */
    @JsonProperty("cashReceived")
    public void setCashReceived(Double cashReceived) {
        this.cashReceived = cashReceived;
    }

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withCashReceived(Double cashReceived) {
        this.cashReceived = cashReceived;
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

    public _20172018NeedAnalysisDocumentVerificationStudent100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20172018NeedAnalysisDocumentVerificationStudent100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("schoolLunch");
        sb.append('=');
        sb.append(((this.schoolLunch == null)?"<null>":this.schoolLunch));
        sb.append(',');
        sb.append("updHouseFoodOth");
        sb.append('=');
        sb.append(((this.updHouseFoodOth == null)?"<null>":this.updHouseFoodOth));
        sb.append(',');
        sb.append("updTaxFilingStatus");
        sb.append('=');
        sb.append(((this.updTaxFilingStatus == null)?"<null>":this.updTaxFilingStatus));
        sb.append(',');
        sb.append("updTaxFormInd");
        sb.append('=');
        sb.append(((this.updTaxFormInd == null)?"<null>":this.updTaxFormInd));
        sb.append(',');
        sb.append("updIraDistributions");
        sb.append('=');
        sb.append(((this.updIraDistributions == null)?"<null>":this.updIraDistributions));
        sb.append(',');
        sb.append("displayUsInc");
        sb.append('=');
        sb.append(((this.displayUsInc == null)?"<null>":this.displayUsInc));
        sb.append(',');
        sb.append("updUntaxedPensions");
        sb.append('=');
        sb.append(((this.updUntaxedPensions == null)?"<null>":this.updUntaxedPensions));
        sb.append(',');
        sb.append("updIncFrWrk");
        sb.append('=');
        sb.append(((this.updIncFrWrk == null)?"<null>":this.updIncFrWrk));
        sb.append(',');
        sb.append("displayRcrapp41040aEligInd");
        sb.append('=');
        sb.append(((this.displayRcrapp41040aEligInd == null)?"<null>":this.displayRcrapp41040aEligInd));
        sb.append(',');
        sb.append("incFrWrk");
        sb.append('=');
        sb.append(((this.incFrWrk == null)?"<null>":this.incFrWrk));
        sb.append(',');
        sb.append("displayFamMemb");
        sb.append('=');
        sb.append(((this.displayFamMemb == null)?"<null>":this.displayFamMemb));
        sb.append(',');
        sb.append("updSpsIncFrWrk");
        sb.append('=');
        sb.append(((this.updSpsIncFrWrk == null)?"<null>":this.updSpsIncFrWrk));
        sb.append(',');
        sb.append("livAllowRecd");
        sb.append('=');
        sb.append(((this.livAllowRecd == null)?"<null>":this.livAllowRecd));
        sb.append(',');
        sb.append("recdSsi");
        sb.append('=');
        sb.append(((this.recdSsi == null)?"<null>":this.recdSsi));
        sb.append(',');
        sb.append("coOpEarnings");
        sb.append('=');
        sb.append(((this.coOpEarnings == null)?"<null>":this.coOpEarnings));
        sb.append(',');
        sb.append("rcrapp3HouseFoodOth");
        sb.append('=');
        sb.append(((this.rcrapp3HouseFoodOth == null)?"<null>":this.rcrapp3HouseFoodOth));
        sb.append(',');
        sb.append("updRecdSsi");
        sb.append('=');
        sb.append(((this.updRecdSsi == null)?"<null>":this.updRecdSsi));
        sb.append(',');
        sb.append("rcrapp3NeedBasedEmploy");
        sb.append('=');
        sb.append(((this.rcrapp3NeedBasedEmploy == null)?"<null>":this.rcrapp3NeedBasedEmploy));
        sb.append(',');
        sb.append("displayIncFrWrk");
        sb.append('=');
        sb.append(((this.displayIncFrWrk == null)?"<null>":this.displayIncFrWrk));
        sb.append(',');
        sb.append("rcrapp4CombatPay");
        sb.append('=');
        sb.append(((this.rcrapp4CombatPay == null)?"<null>":this.rcrapp4CombatPay));
        sb.append(',');
        sb.append("displaySchoolLunch");
        sb.append('=');
        sb.append(((this.displaySchoolLunch == null)?"<null>":this.displaySchoolLunch));
        sb.append(',');
        sb.append("statCode1");
        sb.append('=');
        sb.append(((this.statCode1 == null)?"<null>":this.statCode1));
        sb.append(',');
        sb.append("taxDefPensPayt");
        sb.append('=');
        sb.append(((this.taxDefPensPayt == null)?"<null>":this.taxDefPensPayt));
        sb.append(',');
        sb.append("updOthNonReportMoney");
        sb.append('=');
        sb.append(((this.updOthNonReportMoney == null)?"<null>":this.updOthNonReportMoney));
        sb.append(',');
        sb.append("hsCompletion");
        sb.append('=');
        sb.append(((this.hsCompletion == null)?"<null>":this.hsCompletion));
        sb.append(',');
        sb.append("rcrapp3GrantScholarAid");
        sb.append('=');
        sb.append(((this.rcrapp3GrantScholarAid == null)?"<null>":this.rcrapp3GrantScholarAid));
        sb.append(',');
        sb.append("taxFilingStatus");
        sb.append('=');
        sb.append(((this.taxFilingStatus == null)?"<null>":this.taxFilingStatus));
        sb.append(',');
        sb.append("updIraKeogh");
        sb.append('=');
        sb.append(((this.updIraKeogh == null)?"<null>":this.updIraKeogh));
        sb.append(',');
        sb.append("famMemb");
        sb.append('=');
        sb.append(((this.famMemb == null)?"<null>":this.famMemb));
        sb.append(',');
        sb.append("displayTaxFilingStatus");
        sb.append('=');
        sb.append(((this.displayTaxFilingStatus == null)?"<null>":this.displayTaxFilingStatus));
        sb.append(',');
        sb.append("childSuppPd");
        sb.append('=');
        sb.append(((this.childSuppPd == null)?"<null>":this.childSuppPd));
        sb.append(',');
        sb.append("displayRecdSsi");
        sb.append('=');
        sb.append(((this.displayRecdSsi == null)?"<null>":this.displayRecdSsi));
        sb.append(',');
        sb.append("displayDislWrk");
        sb.append('=');
        sb.append(((this.displayDislWrk == null)?"<null>":this.displayDislWrk));
        sb.append(',');
        sb.append("updPensionPayments");
        sb.append('=');
        sb.append(((this.updPensionPayments == null)?"<null>":this.updPensionPayments));
        sb.append(',');
        sb.append("childSupp");
        sb.append('=');
        sb.append(((this.childSupp == null)?"<null>":this.childSupp));
        sb.append(',');
        sb.append("displayTaxFormInd");
        sb.append('=');
        sb.append(((this.displayTaxFormInd == null)?"<null>":this.displayTaxFormInd));
        sb.append(',');
        sb.append("federalBenefitsExist");
        sb.append('=');
        sb.append(((this.federalBenefitsExist == null)?"<null>":this.federalBenefitsExist));
        sb.append(',');
        sb.append("usIncTaxPd");
        sb.append('=');
        sb.append(((this.usIncTaxPd == null)?"<null>":this.usIncTaxPd));
        sb.append(',');
        sb.append("displayVerificationPrtyDesc");
        sb.append('=');
        sb.append(((this.displayVerificationPrtyDesc == null)?"<null>":this.displayVerificationPrtyDesc));
        sb.append(',');
        sb.append("ira");
        sb.append('=');
        sb.append(((this.ira == null)?"<null>":this.ira));
        sb.append(',');
        sb.append("updDislWrk");
        sb.append('=');
        sb.append(((this.updDislWrk == null)?"<null>":this.updDislWrk));
        sb.append(',');
        sb.append("rcrapp3ChildSuppPaid");
        sb.append('=');
        sb.append(((this.rcrapp3ChildSuppPaid == null)?"<null>":this.rcrapp3ChildSuppPaid));
        sb.append(',');
        sb.append("updFoodStamps");
        sb.append('=');
        sb.append(((this.updFoodStamps == null)?"<null>":this.updFoodStamps));
        sb.append(',');
        sb.append("recdTanf");
        sb.append('=');
        sb.append(((this.recdTanf == null)?"<null>":this.recdTanf));
        sb.append(',');
        sb.append("rcrapp1OthNonReportMoney");
        sb.append('=');
        sb.append(((this.rcrapp1OthNonReportMoney == null)?"<null>":this.rcrapp1OthNonReportMoney));
        sb.append(',');
        sb.append("otherTaxFinaid");
        sb.append('=');
        sb.append(((this.otherTaxFinaid == null)?"<null>":this.otherTaxFinaid));
        sb.append(',');
        sb.append("displayRecdWic");
        sb.append('=');
        sb.append(((this.displayRecdWic == null)?"<null>":this.displayRecdWic));
        sb.append(',');
        sb.append("updIntInc");
        sb.append('=');
        sb.append(((this.updIntInc == null)?"<null>":this.updIntInc));
        sb.append(',');
        sb.append("displaySpsIncFrWrk");
        sb.append('=');
        sb.append(((this.displaySpsIncFrWrk == null)?"<null>":this.displaySpsIncFrWrk));
        sb.append(',');
        sb.append("updUsIncTaxPd");
        sb.append('=');
        sb.append(((this.updUsIncTaxPd == null)?"<null>":this.updUsIncTaxPd));
        sb.append(',');
        sb.append("updVetsNonEdBen");
        sb.append('=');
        sb.append(((this.updVetsNonEdBen == null)?"<null>":this.updVetsNonEdBen));
        sb.append(',');
        sb.append("rcrapp1IraDistributions");
        sb.append('=');
        sb.append(((this.rcrapp1IraDistributions == null)?"<null>":this.rcrapp1IraDistributions));
        sb.append(',');
        sb.append("eligInd");
        sb.append('=');
        sb.append(((this.eligInd == null)?"<null>":this.eligInd));
        sb.append(',');
        sb.append("rcrapp1VetsNonEdBen");
        sb.append('=');
        sb.append(((this.rcrapp1VetsNonEdBen == null)?"<null>":this.rcrapp1VetsNonEdBen));
        sb.append(',');
        sb.append("edCredits");
        sb.append('=');
        sb.append(((this.edCredits == null)?"<null>":this.edCredits));
        sb.append(',');
        sb.append("noInColl");
        sb.append('=');
        sb.append(((this.noInColl == null)?"<null>":this.noInColl));
        sb.append(',');
        sb.append("updOthUntaxInc");
        sb.append('=');
        sb.append(((this.updOthUntaxInc == null)?"<null>":this.updOthUntaxInc));
        sb.append(',');
        sb.append("updCoOpEarnings");
        sb.append('=');
        sb.append(((this.updCoOpEarnings == null)?"<null>":this.updCoOpEarnings));
        sb.append(',');
        sb.append("rcrapp1OthUntaxInc");
        sb.append('=');
        sb.append(((this.rcrapp1OthUntaxInc == null)?"<null>":this.rcrapp1OthUntaxInc));
        sb.append(',');
        sb.append("updNoInColl");
        sb.append('=');
        sb.append(((this.updNoInColl == null)?"<null>":this.updNoInColl));
        sb.append(',');
        sb.append("displayFoodStamps");
        sb.append('=');
        sb.append(((this.displayFoodStamps == null)?"<null>":this.displayFoodStamps));
        sb.append(',');
        sb.append("updChildSuppPaid");
        sb.append('=');
        sb.append(((this.updChildSuppPaid == null)?"<null>":this.updChildSuppPaid));
        sb.append(',');
        sb.append("updateRcrapp1Ind1");
        sb.append('=');
        sb.append(((this.updateRcrapp1Ind1 == null)?"<null>":this.updateRcrapp1Ind1));
        sb.append(',');
        sb.append("untaxedIraDist");
        sb.append('=');
        sb.append(((this.untaxedIraDist == null)?"<null>":this.untaxedIraDist));
        sb.append(',');
        sb.append("displayUsIncTaxPd");
        sb.append('=');
        sb.append(((this.displayUsIncTaxPd == null)?"<null>":this.displayUsIncTaxPd));
        sb.append(',');
        sb.append("identitySep");
        sb.append('=');
        sb.append(((this.identitySep == null)?"<null>":this.identitySep));
        sb.append(',');
        sb.append("updUsInc");
        sb.append('=');
        sb.append(((this.updUsInc == null)?"<null>":this.updUsInc));
        sb.append(',');
        sb.append("spsIncFrWrk");
        sb.append('=');
        sb.append(((this.spsIncFrWrk == null)?"<null>":this.spsIncFrWrk));
        sb.append(',');
        sb.append("updCombatPay");
        sb.append('=');
        sb.append(((this.updCombatPay == null)?"<null>":this.updCombatPay));
        sb.append(',');
        sb.append("taxFinAidRecd");
        sb.append('=');
        sb.append(((this.taxFinAidRecd == null)?"<null>":this.taxFinAidRecd));
        sb.append(',');
        sb.append("rcrapp3CoOpEarnings");
        sb.append('=');
        sb.append(((this.rcrapp3CoOpEarnings == null)?"<null>":this.rcrapp3CoOpEarnings));
        sb.append(',');
        sb.append("updS1040EligInd");
        sb.append('=');
        sb.append(((this.updS1040EligInd == null)?"<null>":this.updS1040EligInd));
        sb.append(',');
        sb.append("rcrapp4IraKeoghAmt");
        sb.append('=');
        sb.append(((this.rcrapp4IraKeoghAmt == null)?"<null>":this.rcrapp4IraKeoghAmt));
        sb.append(',');
        sb.append("displayNoInColl");
        sb.append('=');
        sb.append(((this.displayNoInColl == null)?"<null>":this.displayNoInColl));
        sb.append(',');
        sb.append("updSchoolLunch");
        sb.append('=');
        sb.append(((this.updSchoolLunch == null)?"<null>":this.updSchoolLunch));
        sb.append(',');
        sb.append("foodStamps");
        sb.append('=');
        sb.append(((this.foodStamps == null)?"<null>":this.foodStamps));
        sb.append(',');
        sb.append("rcrapp1UntaxPensions");
        sb.append('=');
        sb.append(((this.rcrapp1UntaxPensions == null)?"<null>":this.rcrapp1UntaxPensions));
        sb.append(',');
        sb.append("untaxedPension");
        sb.append('=');
        sb.append(((this.untaxedPension == null)?"<null>":this.untaxedPension));
        sb.append(',');
        sb.append("taxExemptIntInc");
        sb.append('=');
        sb.append(((this.taxExemptIntInc == null)?"<null>":this.taxExemptIntInc));
        sb.append(',');
        sb.append("usInc");
        sb.append('=');
        sb.append(((this.usInc == null)?"<null>":this.usInc));
        sb.append(',');
        sb.append("updEducCredits");
        sb.append('=');
        sb.append(((this.updEducCredits == null)?"<null>":this.updEducCredits));
        sb.append(',');
        sb.append("taxFormInd");
        sb.append('=');
        sb.append(((this.taxFormInd == null)?"<null>":this.taxFormInd));
        sb.append(',');
        sb.append("displayRecdTanf");
        sb.append('=');
        sb.append(((this.displayRecdTanf == null)?"<null>":this.displayRecdTanf));
        sb.append(',');
        sb.append("dislWrk");
        sb.append('=');
        sb.append(((this.dislWrk == null)?"<null>":this.dislWrk));
        sb.append(',');
        sb.append("rcrapp3TaxDefPension");
        sb.append('=');
        sb.append(((this.rcrapp3TaxDefPension == null)?"<null>":this.rcrapp3TaxDefPension));
        sb.append(',');
        sb.append("updRecdTanf");
        sb.append('=');
        sb.append(((this.updRecdTanf == null)?"<null>":this.updRecdTanf));
        sb.append(',');
        sb.append("updGrantScholarAid");
        sb.append('=');
        sb.append(((this.updGrantScholarAid == null)?"<null>":this.updGrantScholarAid));
        sb.append(',');
        sb.append("updChildSupportReceived");
        sb.append('=');
        sb.append(((this.updChildSupportReceived == null)?"<null>":this.updChildSupportReceived));
        sb.append(',');
        sb.append("rcrapp1VerificationPrty");
        sb.append('=');
        sb.append(((this.rcrapp1VerificationPrty == null)?"<null>":this.rcrapp1VerificationPrty));
        sb.append(',');
        sb.append("recdWic");
        sb.append('=');
        sb.append(((this.recdWic == null)?"<null>":this.recdWic));
        sb.append(',');
        sb.append("rcrapp1ChildSupp");
        sb.append('=');
        sb.append(((this.rcrapp1ChildSupp == null)?"<null>":this.rcrapp1ChildSupp));
        sb.append(',');
        sb.append("updFamMemb");
        sb.append('=');
        sb.append(((this.updFamMemb == null)?"<null>":this.updFamMemb));
        sb.append(',');
        sb.append("updWic");
        sb.append('=');
        sb.append(((this.updWic == null)?"<null>":this.updWic));
        sb.append(',');
        sb.append("updNeedBasedEmploy");
        sb.append('=');
        sb.append(((this.updNeedBasedEmploy == null)?"<null>":this.updNeedBasedEmploy));
        sb.append(',');
        sb.append("rcrapp3EducCredits");
        sb.append('=');
        sb.append(((this.rcrapp3EducCredits == null)?"<null>":this.rcrapp3EducCredits));
        sb.append(',');
        sb.append("rcrapp3TeIntInc");
        sb.append('=');
        sb.append(((this.rcrapp3TeIntInc == null)?"<null>":this.rcrapp3TeIntInc));
        sb.append(',');
        sb.append("vaNonEducBen");
        sb.append('=');
        sb.append(((this.vaNonEducBen == null)?"<null>":this.vaNonEducBen));
        sb.append(',');
        sb.append("allOtherUntaxInc");
        sb.append('=');
        sb.append(((this.allOtherUntaxInc == null)?"<null>":this.allOtherUntaxInc));
        sb.append(',');
        sb.append("combatPay");
        sb.append('=');
        sb.append(((this.combatPay == null)?"<null>":this.combatPay));
        sb.append(',');
        sb.append("cashReceived");
        sb.append('=');
        sb.append(((this.cashReceived == null)?"<null>":this.cashReceived));
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
        result = ((result* 31)+((this.schoolLunch == null)? 0 :this.schoolLunch.hashCode()));
        result = ((result* 31)+((this.updHouseFoodOth == null)? 0 :this.updHouseFoodOth.hashCode()));
        result = ((result* 31)+((this.updTaxFilingStatus == null)? 0 :this.updTaxFilingStatus.hashCode()));
        result = ((result* 31)+((this.updTaxFormInd == null)? 0 :this.updTaxFormInd.hashCode()));
        result = ((result* 31)+((this.updIraDistributions == null)? 0 :this.updIraDistributions.hashCode()));
        result = ((result* 31)+((this.displayUsInc == null)? 0 :this.displayUsInc.hashCode()));
        result = ((result* 31)+((this.updUntaxedPensions == null)? 0 :this.updUntaxedPensions.hashCode()));
        result = ((result* 31)+((this.updIncFrWrk == null)? 0 :this.updIncFrWrk.hashCode()));
        result = ((result* 31)+((this.displayRcrapp41040aEligInd == null)? 0 :this.displayRcrapp41040aEligInd.hashCode()));
        result = ((result* 31)+((this.incFrWrk == null)? 0 :this.incFrWrk.hashCode()));
        result = ((result* 31)+((this.displayFamMemb == null)? 0 :this.displayFamMemb.hashCode()));
        result = ((result* 31)+((this.updSpsIncFrWrk == null)? 0 :this.updSpsIncFrWrk.hashCode()));
        result = ((result* 31)+((this.livAllowRecd == null)? 0 :this.livAllowRecd.hashCode()));
        result = ((result* 31)+((this.recdSsi == null)? 0 :this.recdSsi.hashCode()));
        result = ((result* 31)+((this.coOpEarnings == null)? 0 :this.coOpEarnings.hashCode()));
        result = ((result* 31)+((this.rcrapp3HouseFoodOth == null)? 0 :this.rcrapp3HouseFoodOth.hashCode()));
        result = ((result* 31)+((this.updRecdSsi == null)? 0 :this.updRecdSsi.hashCode()));
        result = ((result* 31)+((this.rcrapp3NeedBasedEmploy == null)? 0 :this.rcrapp3NeedBasedEmploy.hashCode()));
        result = ((result* 31)+((this.displayIncFrWrk == null)? 0 :this.displayIncFrWrk.hashCode()));
        result = ((result* 31)+((this.rcrapp4CombatPay == null)? 0 :this.rcrapp4CombatPay.hashCode()));
        result = ((result* 31)+((this.displaySchoolLunch == null)? 0 :this.displaySchoolLunch.hashCode()));
        result = ((result* 31)+((this.statCode1 == null)? 0 :this.statCode1 .hashCode()));
        result = ((result* 31)+((this.taxDefPensPayt == null)? 0 :this.taxDefPensPayt.hashCode()));
        result = ((result* 31)+((this.updOthNonReportMoney == null)? 0 :this.updOthNonReportMoney.hashCode()));
        result = ((result* 31)+((this.hsCompletion == null)? 0 :this.hsCompletion.hashCode()));
        result = ((result* 31)+((this.rcrapp3GrantScholarAid == null)? 0 :this.rcrapp3GrantScholarAid.hashCode()));
        result = ((result* 31)+((this.taxFilingStatus == null)? 0 :this.taxFilingStatus.hashCode()));
        result = ((result* 31)+((this.updIraKeogh == null)? 0 :this.updIraKeogh.hashCode()));
        result = ((result* 31)+((this.famMemb == null)? 0 :this.famMemb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayTaxFilingStatus == null)? 0 :this.displayTaxFilingStatus.hashCode()));
        result = ((result* 31)+((this.childSuppPd == null)? 0 :this.childSuppPd.hashCode()));
        result = ((result* 31)+((this.displayRecdSsi == null)? 0 :this.displayRecdSsi.hashCode()));
        result = ((result* 31)+((this.displayDislWrk == null)? 0 :this.displayDislWrk.hashCode()));
        result = ((result* 31)+((this.updPensionPayments == null)? 0 :this.updPensionPayments.hashCode()));
        result = ((result* 31)+((this.childSupp == null)? 0 :this.childSupp.hashCode()));
        result = ((result* 31)+((this.displayTaxFormInd == null)? 0 :this.displayTaxFormInd.hashCode()));
        result = ((result* 31)+((this.federalBenefitsExist == null)? 0 :this.federalBenefitsExist.hashCode()));
        result = ((result* 31)+((this.usIncTaxPd == null)? 0 :this.usIncTaxPd.hashCode()));
        result = ((result* 31)+((this.displayVerificationPrtyDesc == null)? 0 :this.displayVerificationPrtyDesc.hashCode()));
        result = ((result* 31)+((this.ira == null)? 0 :this.ira.hashCode()));
        result = ((result* 31)+((this.updDislWrk == null)? 0 :this.updDislWrk.hashCode()));
        result = ((result* 31)+((this.rcrapp3ChildSuppPaid == null)? 0 :this.rcrapp3ChildSuppPaid.hashCode()));
        result = ((result* 31)+((this.updFoodStamps == null)? 0 :this.updFoodStamps.hashCode()));
        result = ((result* 31)+((this.recdTanf == null)? 0 :this.recdTanf.hashCode()));
        result = ((result* 31)+((this.rcrapp1OthNonReportMoney == null)? 0 :this.rcrapp1OthNonReportMoney.hashCode()));
        result = ((result* 31)+((this.otherTaxFinaid == null)? 0 :this.otherTaxFinaid.hashCode()));
        result = ((result* 31)+((this.displayRecdWic == null)? 0 :this.displayRecdWic.hashCode()));
        result = ((result* 31)+((this.updIntInc == null)? 0 :this.updIntInc.hashCode()));
        result = ((result* 31)+((this.displaySpsIncFrWrk == null)? 0 :this.displaySpsIncFrWrk.hashCode()));
        result = ((result* 31)+((this.updUsIncTaxPd == null)? 0 :this.updUsIncTaxPd.hashCode()));
        result = ((result* 31)+((this.updVetsNonEdBen == null)? 0 :this.updVetsNonEdBen.hashCode()));
        result = ((result* 31)+((this.rcrapp1IraDistributions == null)? 0 :this.rcrapp1IraDistributions.hashCode()));
        result = ((result* 31)+((this.eligInd == null)? 0 :this.eligInd.hashCode()));
        result = ((result* 31)+((this.rcrapp1VetsNonEdBen == null)? 0 :this.rcrapp1VetsNonEdBen.hashCode()));
        result = ((result* 31)+((this.edCredits == null)? 0 :this.edCredits.hashCode()));
        result = ((result* 31)+((this.noInColl == null)? 0 :this.noInColl.hashCode()));
        result = ((result* 31)+((this.updOthUntaxInc == null)? 0 :this.updOthUntaxInc.hashCode()));
        result = ((result* 31)+((this.updCoOpEarnings == null)? 0 :this.updCoOpEarnings.hashCode()));
        result = ((result* 31)+((this.rcrapp1OthUntaxInc == null)? 0 :this.rcrapp1OthUntaxInc.hashCode()));
        result = ((result* 31)+((this.updNoInColl == null)? 0 :this.updNoInColl.hashCode()));
        result = ((result* 31)+((this.displayFoodStamps == null)? 0 :this.displayFoodStamps.hashCode()));
        result = ((result* 31)+((this.updChildSuppPaid == null)? 0 :this.updChildSuppPaid.hashCode()));
        result = ((result* 31)+((this.updateRcrapp1Ind1 == null)? 0 :this.updateRcrapp1Ind1 .hashCode()));
        result = ((result* 31)+((this.untaxedIraDist == null)? 0 :this.untaxedIraDist.hashCode()));
        result = ((result* 31)+((this.displayUsIncTaxPd == null)? 0 :this.displayUsIncTaxPd.hashCode()));
        result = ((result* 31)+((this.identitySep == null)? 0 :this.identitySep.hashCode()));
        result = ((result* 31)+((this.updUsInc == null)? 0 :this.updUsInc.hashCode()));
        result = ((result* 31)+((this.spsIncFrWrk == null)? 0 :this.spsIncFrWrk.hashCode()));
        result = ((result* 31)+((this.updCombatPay == null)? 0 :this.updCombatPay.hashCode()));
        result = ((result* 31)+((this.taxFinAidRecd == null)? 0 :this.taxFinAidRecd.hashCode()));
        result = ((result* 31)+((this.rcrapp3CoOpEarnings == null)? 0 :this.rcrapp3CoOpEarnings.hashCode()));
        result = ((result* 31)+((this.updS1040EligInd == null)? 0 :this.updS1040EligInd.hashCode()));
        result = ((result* 31)+((this.rcrapp4IraKeoghAmt == null)? 0 :this.rcrapp4IraKeoghAmt.hashCode()));
        result = ((result* 31)+((this.displayNoInColl == null)? 0 :this.displayNoInColl.hashCode()));
        result = ((result* 31)+((this.updSchoolLunch == null)? 0 :this.updSchoolLunch.hashCode()));
        result = ((result* 31)+((this.foodStamps == null)? 0 :this.foodStamps.hashCode()));
        result = ((result* 31)+((this.rcrapp1UntaxPensions == null)? 0 :this.rcrapp1UntaxPensions.hashCode()));
        result = ((result* 31)+((this.untaxedPension == null)? 0 :this.untaxedPension.hashCode()));
        result = ((result* 31)+((this.taxExemptIntInc == null)? 0 :this.taxExemptIntInc.hashCode()));
        result = ((result* 31)+((this.usInc == null)? 0 :this.usInc.hashCode()));
        result = ((result* 31)+((this.updEducCredits == null)? 0 :this.updEducCredits.hashCode()));
        result = ((result* 31)+((this.taxFormInd == null)? 0 :this.taxFormInd.hashCode()));
        result = ((result* 31)+((this.displayRecdTanf == null)? 0 :this.displayRecdTanf.hashCode()));
        result = ((result* 31)+((this.dislWrk == null)? 0 :this.dislWrk.hashCode()));
        result = ((result* 31)+((this.rcrapp3TaxDefPension == null)? 0 :this.rcrapp3TaxDefPension.hashCode()));
        result = ((result* 31)+((this.updRecdTanf == null)? 0 :this.updRecdTanf.hashCode()));
        result = ((result* 31)+((this.updGrantScholarAid == null)? 0 :this.updGrantScholarAid.hashCode()));
        result = ((result* 31)+((this.updChildSupportReceived == null)? 0 :this.updChildSupportReceived.hashCode()));
        result = ((result* 31)+((this.rcrapp1VerificationPrty == null)? 0 :this.rcrapp1VerificationPrty.hashCode()));
        result = ((result* 31)+((this.recdWic == null)? 0 :this.recdWic.hashCode()));
        result = ((result* 31)+((this.rcrapp1ChildSupp == null)? 0 :this.rcrapp1ChildSupp.hashCode()));
        result = ((result* 31)+((this.updFamMemb == null)? 0 :this.updFamMemb.hashCode()));
        result = ((result* 31)+((this.updWic == null)? 0 :this.updWic.hashCode()));
        result = ((result* 31)+((this.updNeedBasedEmploy == null)? 0 :this.updNeedBasedEmploy.hashCode()));
        result = ((result* 31)+((this.rcrapp3EducCredits == null)? 0 :this.rcrapp3EducCredits.hashCode()));
        result = ((result* 31)+((this.rcrapp3TeIntInc == null)? 0 :this.rcrapp3TeIntInc.hashCode()));
        result = ((result* 31)+((this.vaNonEducBen == null)? 0 :this.vaNonEducBen.hashCode()));
        result = ((result* 31)+((this.allOtherUntaxInc == null)? 0 :this.allOtherUntaxInc.hashCode()));
        result = ((result* 31)+((this.combatPay == null)? 0 :this.combatPay.hashCode()));
        result = ((result* 31)+((this.cashReceived == null)? 0 :this.cashReceived.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20172018NeedAnalysisDocumentVerificationStudent100GetResponse) == false) {
            return false;
        }
        _20172018NeedAnalysisDocumentVerificationStudent100GetResponse rhs = ((_20172018NeedAnalysisDocumentVerificationStudent100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.schoolLunch == rhs.schoolLunch)||((this.schoolLunch!= null)&&this.schoolLunch.equals(rhs.schoolLunch)))&&((this.updHouseFoodOth == rhs.updHouseFoodOth)||((this.updHouseFoodOth!= null)&&this.updHouseFoodOth.equals(rhs.updHouseFoodOth))))&&((this.updTaxFilingStatus == rhs.updTaxFilingStatus)||((this.updTaxFilingStatus!= null)&&this.updTaxFilingStatus.equals(rhs.updTaxFilingStatus))))&&((this.updTaxFormInd == rhs.updTaxFormInd)||((this.updTaxFormInd!= null)&&this.updTaxFormInd.equals(rhs.updTaxFormInd))))&&((this.updIraDistributions == rhs.updIraDistributions)||((this.updIraDistributions!= null)&&this.updIraDistributions.equals(rhs.updIraDistributions))))&&((this.displayUsInc == rhs.displayUsInc)||((this.displayUsInc!= null)&&this.displayUsInc.equals(rhs.displayUsInc))))&&((this.updUntaxedPensions == rhs.updUntaxedPensions)||((this.updUntaxedPensions!= null)&&this.updUntaxedPensions.equals(rhs.updUntaxedPensions))))&&((this.updIncFrWrk == rhs.updIncFrWrk)||((this.updIncFrWrk!= null)&&this.updIncFrWrk.equals(rhs.updIncFrWrk))))&&((this.displayRcrapp41040aEligInd == rhs.displayRcrapp41040aEligInd)||((this.displayRcrapp41040aEligInd!= null)&&this.displayRcrapp41040aEligInd.equals(rhs.displayRcrapp41040aEligInd))))&&((this.incFrWrk == rhs.incFrWrk)||((this.incFrWrk!= null)&&this.incFrWrk.equals(rhs.incFrWrk))))&&((this.displayFamMemb == rhs.displayFamMemb)||((this.displayFamMemb!= null)&&this.displayFamMemb.equals(rhs.displayFamMemb))))&&((this.updSpsIncFrWrk == rhs.updSpsIncFrWrk)||((this.updSpsIncFrWrk!= null)&&this.updSpsIncFrWrk.equals(rhs.updSpsIncFrWrk))))&&((this.livAllowRecd == rhs.livAllowRecd)||((this.livAllowRecd!= null)&&this.livAllowRecd.equals(rhs.livAllowRecd))))&&((this.recdSsi == rhs.recdSsi)||((this.recdSsi!= null)&&this.recdSsi.equals(rhs.recdSsi))))&&((this.coOpEarnings == rhs.coOpEarnings)||((this.coOpEarnings!= null)&&this.coOpEarnings.equals(rhs.coOpEarnings))))&&((this.rcrapp3HouseFoodOth == rhs.rcrapp3HouseFoodOth)||((this.rcrapp3HouseFoodOth!= null)&&this.rcrapp3HouseFoodOth.equals(rhs.rcrapp3HouseFoodOth))))&&((this.updRecdSsi == rhs.updRecdSsi)||((this.updRecdSsi!= null)&&this.updRecdSsi.equals(rhs.updRecdSsi))))&&((this.rcrapp3NeedBasedEmploy == rhs.rcrapp3NeedBasedEmploy)||((this.rcrapp3NeedBasedEmploy!= null)&&this.rcrapp3NeedBasedEmploy.equals(rhs.rcrapp3NeedBasedEmploy))))&&((this.displayIncFrWrk == rhs.displayIncFrWrk)||((this.displayIncFrWrk!= null)&&this.displayIncFrWrk.equals(rhs.displayIncFrWrk))))&&((this.rcrapp4CombatPay == rhs.rcrapp4CombatPay)||((this.rcrapp4CombatPay!= null)&&this.rcrapp4CombatPay.equals(rhs.rcrapp4CombatPay))))&&((this.displaySchoolLunch == rhs.displaySchoolLunch)||((this.displaySchoolLunch!= null)&&this.displaySchoolLunch.equals(rhs.displaySchoolLunch))))&&((this.statCode1 == rhs.statCode1)||((this.statCode1 != null)&&this.statCode1 .equals(rhs.statCode1))))&&((this.taxDefPensPayt == rhs.taxDefPensPayt)||((this.taxDefPensPayt!= null)&&this.taxDefPensPayt.equals(rhs.taxDefPensPayt))))&&((this.updOthNonReportMoney == rhs.updOthNonReportMoney)||((this.updOthNonReportMoney!= null)&&this.updOthNonReportMoney.equals(rhs.updOthNonReportMoney))))&&((this.hsCompletion == rhs.hsCompletion)||((this.hsCompletion!= null)&&this.hsCompletion.equals(rhs.hsCompletion))))&&((this.rcrapp3GrantScholarAid == rhs.rcrapp3GrantScholarAid)||((this.rcrapp3GrantScholarAid!= null)&&this.rcrapp3GrantScholarAid.equals(rhs.rcrapp3GrantScholarAid))))&&((this.taxFilingStatus == rhs.taxFilingStatus)||((this.taxFilingStatus!= null)&&this.taxFilingStatus.equals(rhs.taxFilingStatus))))&&((this.updIraKeogh == rhs.updIraKeogh)||((this.updIraKeogh!= null)&&this.updIraKeogh.equals(rhs.updIraKeogh))))&&((this.famMemb == rhs.famMemb)||((this.famMemb!= null)&&this.famMemb.equals(rhs.famMemb))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayTaxFilingStatus == rhs.displayTaxFilingStatus)||((this.displayTaxFilingStatus!= null)&&this.displayTaxFilingStatus.equals(rhs.displayTaxFilingStatus))))&&((this.childSuppPd == rhs.childSuppPd)||((this.childSuppPd!= null)&&this.childSuppPd.equals(rhs.childSuppPd))))&&((this.displayRecdSsi == rhs.displayRecdSsi)||((this.displayRecdSsi!= null)&&this.displayRecdSsi.equals(rhs.displayRecdSsi))))&&((this.displayDislWrk == rhs.displayDislWrk)||((this.displayDislWrk!= null)&&this.displayDislWrk.equals(rhs.displayDislWrk))))&&((this.updPensionPayments == rhs.updPensionPayments)||((this.updPensionPayments!= null)&&this.updPensionPayments.equals(rhs.updPensionPayments))))&&((this.childSupp == rhs.childSupp)||((this.childSupp!= null)&&this.childSupp.equals(rhs.childSupp))))&&((this.displayTaxFormInd == rhs.displayTaxFormInd)||((this.displayTaxFormInd!= null)&&this.displayTaxFormInd.equals(rhs.displayTaxFormInd))))&&((this.federalBenefitsExist == rhs.federalBenefitsExist)||((this.federalBenefitsExist!= null)&&this.federalBenefitsExist.equals(rhs.federalBenefitsExist))))&&((this.usIncTaxPd == rhs.usIncTaxPd)||((this.usIncTaxPd!= null)&&this.usIncTaxPd.equals(rhs.usIncTaxPd))))&&((this.displayVerificationPrtyDesc == rhs.displayVerificationPrtyDesc)||((this.displayVerificationPrtyDesc!= null)&&this.displayVerificationPrtyDesc.equals(rhs.displayVerificationPrtyDesc))))&&((this.ira == rhs.ira)||((this.ira!= null)&&this.ira.equals(rhs.ira))))&&((this.updDislWrk == rhs.updDislWrk)||((this.updDislWrk!= null)&&this.updDislWrk.equals(rhs.updDislWrk))))&&((this.rcrapp3ChildSuppPaid == rhs.rcrapp3ChildSuppPaid)||((this.rcrapp3ChildSuppPaid!= null)&&this.rcrapp3ChildSuppPaid.equals(rhs.rcrapp3ChildSuppPaid))))&&((this.updFoodStamps == rhs.updFoodStamps)||((this.updFoodStamps!= null)&&this.updFoodStamps.equals(rhs.updFoodStamps))))&&((this.recdTanf == rhs.recdTanf)||((this.recdTanf!= null)&&this.recdTanf.equals(rhs.recdTanf))))&&((this.rcrapp1OthNonReportMoney == rhs.rcrapp1OthNonReportMoney)||((this.rcrapp1OthNonReportMoney!= null)&&this.rcrapp1OthNonReportMoney.equals(rhs.rcrapp1OthNonReportMoney))))&&((this.otherTaxFinaid == rhs.otherTaxFinaid)||((this.otherTaxFinaid!= null)&&this.otherTaxFinaid.equals(rhs.otherTaxFinaid))))&&((this.displayRecdWic == rhs.displayRecdWic)||((this.displayRecdWic!= null)&&this.displayRecdWic.equals(rhs.displayRecdWic))))&&((this.updIntInc == rhs.updIntInc)||((this.updIntInc!= null)&&this.updIntInc.equals(rhs.updIntInc))))&&((this.displaySpsIncFrWrk == rhs.displaySpsIncFrWrk)||((this.displaySpsIncFrWrk!= null)&&this.displaySpsIncFrWrk.equals(rhs.displaySpsIncFrWrk))))&&((this.updUsIncTaxPd == rhs.updUsIncTaxPd)||((this.updUsIncTaxPd!= null)&&this.updUsIncTaxPd.equals(rhs.updUsIncTaxPd))))&&((this.updVetsNonEdBen == rhs.updVetsNonEdBen)||((this.updVetsNonEdBen!= null)&&this.updVetsNonEdBen.equals(rhs.updVetsNonEdBen))))&&((this.rcrapp1IraDistributions == rhs.rcrapp1IraDistributions)||((this.rcrapp1IraDistributions!= null)&&this.rcrapp1IraDistributions.equals(rhs.rcrapp1IraDistributions))))&&((this.eligInd == rhs.eligInd)||((this.eligInd!= null)&&this.eligInd.equals(rhs.eligInd))))&&((this.rcrapp1VetsNonEdBen == rhs.rcrapp1VetsNonEdBen)||((this.rcrapp1VetsNonEdBen!= null)&&this.rcrapp1VetsNonEdBen.equals(rhs.rcrapp1VetsNonEdBen))))&&((this.edCredits == rhs.edCredits)||((this.edCredits!= null)&&this.edCredits.equals(rhs.edCredits))))&&((this.noInColl == rhs.noInColl)||((this.noInColl!= null)&&this.noInColl.equals(rhs.noInColl))))&&((this.updOthUntaxInc == rhs.updOthUntaxInc)||((this.updOthUntaxInc!= null)&&this.updOthUntaxInc.equals(rhs.updOthUntaxInc))))&&((this.updCoOpEarnings == rhs.updCoOpEarnings)||((this.updCoOpEarnings!= null)&&this.updCoOpEarnings.equals(rhs.updCoOpEarnings))))&&((this.rcrapp1OthUntaxInc == rhs.rcrapp1OthUntaxInc)||((this.rcrapp1OthUntaxInc!= null)&&this.rcrapp1OthUntaxInc.equals(rhs.rcrapp1OthUntaxInc))))&&((this.updNoInColl == rhs.updNoInColl)||((this.updNoInColl!= null)&&this.updNoInColl.equals(rhs.updNoInColl))))&&((this.displayFoodStamps == rhs.displayFoodStamps)||((this.displayFoodStamps!= null)&&this.displayFoodStamps.equals(rhs.displayFoodStamps))))&&((this.updChildSuppPaid == rhs.updChildSuppPaid)||((this.updChildSuppPaid!= null)&&this.updChildSuppPaid.equals(rhs.updChildSuppPaid))))&&((this.updateRcrapp1Ind1 == rhs.updateRcrapp1Ind1)||((this.updateRcrapp1Ind1 != null)&&this.updateRcrapp1Ind1 .equals(rhs.updateRcrapp1Ind1))))&&((this.untaxedIraDist == rhs.untaxedIraDist)||((this.untaxedIraDist!= null)&&this.untaxedIraDist.equals(rhs.untaxedIraDist))))&&((this.displayUsIncTaxPd == rhs.displayUsIncTaxPd)||((this.displayUsIncTaxPd!= null)&&this.displayUsIncTaxPd.equals(rhs.displayUsIncTaxPd))))&&((this.identitySep == rhs.identitySep)||((this.identitySep!= null)&&this.identitySep.equals(rhs.identitySep))))&&((this.updUsInc == rhs.updUsInc)||((this.updUsInc!= null)&&this.updUsInc.equals(rhs.updUsInc))))&&((this.spsIncFrWrk == rhs.spsIncFrWrk)||((this.spsIncFrWrk!= null)&&this.spsIncFrWrk.equals(rhs.spsIncFrWrk))))&&((this.updCombatPay == rhs.updCombatPay)||((this.updCombatPay!= null)&&this.updCombatPay.equals(rhs.updCombatPay))))&&((this.taxFinAidRecd == rhs.taxFinAidRecd)||((this.taxFinAidRecd!= null)&&this.taxFinAidRecd.equals(rhs.taxFinAidRecd))))&&((this.rcrapp3CoOpEarnings == rhs.rcrapp3CoOpEarnings)||((this.rcrapp3CoOpEarnings!= null)&&this.rcrapp3CoOpEarnings.equals(rhs.rcrapp3CoOpEarnings))))&&((this.updS1040EligInd == rhs.updS1040EligInd)||((this.updS1040EligInd!= null)&&this.updS1040EligInd.equals(rhs.updS1040EligInd))))&&((this.rcrapp4IraKeoghAmt == rhs.rcrapp4IraKeoghAmt)||((this.rcrapp4IraKeoghAmt!= null)&&this.rcrapp4IraKeoghAmt.equals(rhs.rcrapp4IraKeoghAmt))))&&((this.displayNoInColl == rhs.displayNoInColl)||((this.displayNoInColl!= null)&&this.displayNoInColl.equals(rhs.displayNoInColl))))&&((this.updSchoolLunch == rhs.updSchoolLunch)||((this.updSchoolLunch!= null)&&this.updSchoolLunch.equals(rhs.updSchoolLunch))))&&((this.foodStamps == rhs.foodStamps)||((this.foodStamps!= null)&&this.foodStamps.equals(rhs.foodStamps))))&&((this.rcrapp1UntaxPensions == rhs.rcrapp1UntaxPensions)||((this.rcrapp1UntaxPensions!= null)&&this.rcrapp1UntaxPensions.equals(rhs.rcrapp1UntaxPensions))))&&((this.untaxedPension == rhs.untaxedPension)||((this.untaxedPension!= null)&&this.untaxedPension.equals(rhs.untaxedPension))))&&((this.taxExemptIntInc == rhs.taxExemptIntInc)||((this.taxExemptIntInc!= null)&&this.taxExemptIntInc.equals(rhs.taxExemptIntInc))))&&((this.usInc == rhs.usInc)||((this.usInc!= null)&&this.usInc.equals(rhs.usInc))))&&((this.updEducCredits == rhs.updEducCredits)||((this.updEducCredits!= null)&&this.updEducCredits.equals(rhs.updEducCredits))))&&((this.taxFormInd == rhs.taxFormInd)||((this.taxFormInd!= null)&&this.taxFormInd.equals(rhs.taxFormInd))))&&((this.displayRecdTanf == rhs.displayRecdTanf)||((this.displayRecdTanf!= null)&&this.displayRecdTanf.equals(rhs.displayRecdTanf))))&&((this.dislWrk == rhs.dislWrk)||((this.dislWrk!= null)&&this.dislWrk.equals(rhs.dislWrk))))&&((this.rcrapp3TaxDefPension == rhs.rcrapp3TaxDefPension)||((this.rcrapp3TaxDefPension!= null)&&this.rcrapp3TaxDefPension.equals(rhs.rcrapp3TaxDefPension))))&&((this.updRecdTanf == rhs.updRecdTanf)||((this.updRecdTanf!= null)&&this.updRecdTanf.equals(rhs.updRecdTanf))))&&((this.updGrantScholarAid == rhs.updGrantScholarAid)||((this.updGrantScholarAid!= null)&&this.updGrantScholarAid.equals(rhs.updGrantScholarAid))))&&((this.updChildSupportReceived == rhs.updChildSupportReceived)||((this.updChildSupportReceived!= null)&&this.updChildSupportReceived.equals(rhs.updChildSupportReceived))))&&((this.rcrapp1VerificationPrty == rhs.rcrapp1VerificationPrty)||((this.rcrapp1VerificationPrty!= null)&&this.rcrapp1VerificationPrty.equals(rhs.rcrapp1VerificationPrty))))&&((this.recdWic == rhs.recdWic)||((this.recdWic!= null)&&this.recdWic.equals(rhs.recdWic))))&&((this.rcrapp1ChildSupp == rhs.rcrapp1ChildSupp)||((this.rcrapp1ChildSupp!= null)&&this.rcrapp1ChildSupp.equals(rhs.rcrapp1ChildSupp))))&&((this.updFamMemb == rhs.updFamMemb)||((this.updFamMemb!= null)&&this.updFamMemb.equals(rhs.updFamMemb))))&&((this.updWic == rhs.updWic)||((this.updWic!= null)&&this.updWic.equals(rhs.updWic))))&&((this.updNeedBasedEmploy == rhs.updNeedBasedEmploy)||((this.updNeedBasedEmploy!= null)&&this.updNeedBasedEmploy.equals(rhs.updNeedBasedEmploy))))&&((this.rcrapp3EducCredits == rhs.rcrapp3EducCredits)||((this.rcrapp3EducCredits!= null)&&this.rcrapp3EducCredits.equals(rhs.rcrapp3EducCredits))))&&((this.rcrapp3TeIntInc == rhs.rcrapp3TeIntInc)||((this.rcrapp3TeIntInc!= null)&&this.rcrapp3TeIntInc.equals(rhs.rcrapp3TeIntInc))))&&((this.vaNonEducBen == rhs.vaNonEducBen)||((this.vaNonEducBen!= null)&&this.vaNonEducBen.equals(rhs.vaNonEducBen))))&&((this.allOtherUntaxInc == rhs.allOtherUntaxInc)||((this.allOtherUntaxInc!= null)&&this.allOtherUntaxInc.equals(rhs.allOtherUntaxInc))))&&((this.combatPay == rhs.combatPay)||((this.combatPay!= null)&&this.combatPay.equals(rhs.combatPay))))&&((this.cashReceived == rhs.cashReceived)||((this.cashReceived!= null)&&this.cashReceived.equals(rhs.cashReceived))));
    }

}
