
package com.ellucian.generated.bpapi.ban._2017_2018_need_analysis.v1_0_0;

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
    "schoolLunch",
    "citzInd",
    "parVetsNonEdBen",
    "rcrapp4FathLastName",
    "rcrapp3ParEducCredits",
    "rcrapp3PreparerSsn",
    "rcrapp4BusNetWorth",
    "incFrWrk",
    "ssn",
    "displayNeedDate",
    "rcrapp4Par1040aEligInd",
    "parUsInc",
    "recdSsi",
    "parCashAmt",
    "parIraDistributions",
    "parNoInColl",
    "rcrapp3ParIrsFitFlag",
    "rcrapp3HouseFoodOth",
    "noExempt",
    "rcrapp3ParNeedBasedEmploy",
    "othUntaxInc",
    "zip",
    "rcrapp3NeedBasedEmploy",
    "rcrapp4EmailAddress",
    "rcrapp4ParLegalResInd",
    "rcrapp4CombatPay",
    "atRiskHomeless",
    "rcrapp4ParTxRetFiledInd",
    "rcrapp4ParBusNetWorth",
    "signed",
    "statCodeRes",
    "instHousCde",
    "origCompDate",
    "rcrapp4HighSchoolFlg",
    "rcrapp4StatCodeHighSch",
    "statCodeLic",
    "activeDuty",
    "taxFilingStatus",
    "rcrapp3GrantScholarAid",
    "parTaxFormInd",
    "rcrapp3FatherHiGrade",
    "mrtlStatus",
    "rcrapp4LegalResInd",
    "famMemb",
    "rcrapp3ParHouseFoodOth",
    "driverLicNo",
    "rcrapp4MothBirthDate",
    "rcrapp3ParTeIntInc",
    "emancipatedMinor",
    "lastName",
    "unaccompYouthHud",
    "city",
    "degreeByJuly",
    "wardOfCourt",
    "parOthUntaxInc",
    "childSupp",
    "phoneNo",
    "rcrapp3MothSsnMatch",
    "usIncTaxPd",
    "rcrapp3FedCollChoice4",
    "rcrapp3FedCollChoice5",
    "activityDate",
    "fedCollChoice1",
    "rcrapp3FedCollChoice6",
    "rcrapp3ParGrantScholarAid",
    "displayVerificationPrtyDesc",
    "rcrapp3IrsFitFlag",
    "untaxPensions",
    "rcrapp3PreparerEin",
    "rcrapp3ChildSuppPaid",
    "rcrapp3FedCollChoice7",
    "displaySResDateYr",
    "rcrapp3FedCollChoice8",
    "rcrapp4FathFirstNameIni",
    "rcrapp3FedCollChoice9",
    "rcrapp3SpecCircumFlg",
    "createDate",
    "rcrapp3SMarMthYr",
    "rcrapp3PreparerSign",
    "rcrapp3ParIrsDisplayFlag",
    "rcrapp4FathSsn",
    "rcrapp3ParIrsAgiFlag",
    "permitDraftReg",
    "rcrapp4DrugOffenseConvic",
    "recdTanf",
    "rcrapp4SAssetThreshExcd",
    "rcrapp4HighSchoolCity",
    "fedCollChoice2",
    "vetsNonEdBen",
    "fedCollChoice3",
    "userId",
    "parTaxFilingStatus",
    "parFoodStamps",
    "fathIncFrWrk",
    "parRecdTanf",
    "parRecdWic",
    "rcrapp4MothLastName",
    "rcrapp4WrkStdyLoansInt",
    "parUsIncTaxPd",
    "rcrapp3DegreeType",
    "usVet",
    "rcrapp3Married",
    "iraDistributions",
    "rcrapp3YrInColl2",
    "cashAmt",
    "noInColl",
    "rcrapp3GradOrProf",
    "parFamMemb",
    "rcrapp3ParChildSuppPaid",
    "verificationPrty",
    "rcrapp3FedCollChoice10",
    "parNoExempt",
    "parStatCodeRes",
    "rcrapp3ParCoOpEarnings",
    "rcrapp4PEmailAddress",
    "rcrapp4ParInvNetWorth",
    "mi",
    "yrInColl",
    "rcrapp3ParTaxDefPension",
    "parDislWrk",
    "spsIncFrWrk",
    "rcrapp3IrsAgiFlag",
    "alienRegNo",
    "rcrapp3CoOpEarnings",
    "parChildSupp",
    "bornBefore11Xx",
    "rcrapp4IraKeoghAmt",
    "rcrapp3FathSsnMatch",
    "rcrapp4InvNetWorth",
    "displayPResDateMo",
    "rcrapp4HaveChildren",
    "othNonReportMoney",
    "firstName",
    "rcptDate",
    "rcrapp4ParCombatPay",
    "rcrapp4HighSchoolName",
    "rcrapp4FathBirthDate",
    "phoneArea",
    "parRecdSsi",
    "rcrapp3ParMarMthYr",
    "foodStamps",
    "hasLegalDepend",
    "rcrapp3MotherHiGrade",
    "rcrapp3IrsRequestFlag",
    "usInc",
    "creatorId",
    "taxFormInd",
    "verificationMsg",
    "title",
    "dislWrk",
    "rcrapp3ParIrsRequestFlag",
    "legalGuardian",
    "rcrapp4PAssetThreshExcd",
    "rcrapp3ParIraKeough",
    "rcrapp3TaxDefPension",
    "parUntaxPensions",
    "displaySResDateMo",
    "displayPResDateYr",
    "parMrtlStatus",
    "rcrapp4MothSsn",
    "addr",
    "recdWic",
    "rcrapp3IrsDisplayFlag",
    "rcrapp4HighSchoolCde",
    "statCode",
    "unaccompYouthSchool",
    "rcrapp3EducCredits",
    "birthDate",
    "rcrapp4HsGedRcvd",
    "rcrapp4TxRetFiledInd",
    "rcrapp3TeIntInc",
    "rcrapp41040aEligInd",
    "completionDate",
    "rcrapp3EfcRecalcCorrReq",
    "rcrapp4MothFirstNameIni",
    "mothIncFrWrk",
    "parSchoolLunch"
})
@Generated("jsonschema2pojo")
public class Rcrapp1__1 {

    /**
     * Lineage reference object : RCRAPP1_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("schoolLunch")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_SCHOOL_LUNCH")
    private String schoolLunch;
    /**
     * Citizenship Status
     * <p>
     * Lineage reference object : RCRAPP1_CITZ_IND
     * 
     */
    @JsonProperty("citzInd")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_CITZ_IND")
    private String citzInd;
    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RCRAPP1_PAR_VETS_NON_ED_BEN
     * 
     */
    @JsonProperty("parVetsNonEdBen")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_VETS_NON_ED_BEN")
    private Double parVetsNonEdBen;
    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathLastName")
    private String rcrapp4FathLastName;
    /**
     * Education Tax Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParEducCredits")
    private Double rcrapp3ParEducCredits;
    /**
     * Preparer's SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3PreparerSsn")
    private String rcrapp3PreparerSsn;
    @JsonProperty("rcrapp4BusNetWorth")
    private Double rcrapp4BusNetWorth;
    /**
     * Lineage reference object : RCRAPP1_INC_FR_WRK
     * 
     */
    @JsonProperty("incFrWrk")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_INC_FR_WRK")
    private Double incFrWrk;
    /**
     * Social Security Number
     * <p>
     * Lineage reference object : RCRAPP1_SSN
     * (Required)
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_SSN")
    private String ssn;
    /**
     * Last Need Analysis Calculation Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNeedDate")
    private Date displayNeedDate;
    /**
     * Eligible to File 1040A EZ
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4Par1040aEligInd")
    private String rcrapp4Par1040aEligInd;
    /**
     * Adjusted Gross Income
     * <p>
     * Lineage reference object : RCRAPP1_PAR_US_INC
     * 
     */
    @JsonProperty("parUsInc")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_US_INC")
    private Double parUsInc;
    /**
     * Lineage reference object : RCRAPP1_RECD_SSI
     * 
     */
    @JsonProperty("recdSsi")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_RECD_SSI")
    private String recdSsi;
    /**
     * Cash Savings Checking
     * <p>
     * Lineage reference object : RCRAPP1_PAR_CASH_AMT
     * 
     */
    @JsonProperty("parCashAmt")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_CASH_AMT")
    private Double parCashAmt;
    /**
     * Untaxed IRA Distributions
     * <p>
     * Lineage reference object : RCRAPP1_PAR_IRA_DISTRIBUTIONS
     * 
     */
    @JsonProperty("parIraDistributions")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_IRA_DISTRIBUTIONS")
    private Double parIraDistributions;
    /**
     * Lineage reference object : RCRAPP1_PAR_NO_IN_COLL
     * 
     */
    @JsonProperty("parNoInColl")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_NO_IN_COLL")
    private Double parNoInColl;
    /**
     * Parent IRS FIT Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsFitFlag")
    private String rcrapp3ParIrsFitFlag;
    @JsonProperty("rcrapp3HouseFoodOth")
    private Double rcrapp3HouseFoodOth;
    /**
     * Lineage reference object : RCRAPP1_NO_EXEMPT
     * 
     */
    @JsonProperty("noExempt")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_NO_EXEMPT")
    private Double noExempt;
    /**
     * Need Based Employment
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParNeedBasedEmploy")
    private Double rcrapp3ParNeedBasedEmploy;
    /**
     * Lineage reference object : RCRAPP1_OTH_UNTAX_INC
     * 
     */
    @JsonProperty("othUntaxInc")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_OTH_UNTAX_INC")
    private Double othUntaxInc;
    /**
     * Zip
     * <p>
     * Lineage reference object : RCRAPP1_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_ZIP")
    private String zip;
    @JsonProperty("rcrapp3NeedBasedEmploy")
    private Double rcrapp3NeedBasedEmploy;
    /**
     * E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4EmailAddress")
    private String rcrapp4EmailAddress;
    /**
     * Parent Legal Resident Before 01-JAN-2000
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParLegalResInd")
    private String rcrapp4ParLegalResInd;
    @JsonProperty("rcrapp4CombatPay")
    private Double rcrapp4CombatPay;
    /**
     * At Risk of Homelessness
     * <p>
     * Lineage reference object : RCRAPP1_AT_RISK_HOMELESS
     * 
     */
    @JsonProperty("atRiskHomeless")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_AT_RISK_HOMELESS")
    private String atRiskHomeless;
    /**
     * Tax Return Filed
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParTxRetFiledInd")
    private String rcrapp4ParTxRetFiledInd;
    /**
     * Business and Farm Net Worth
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParBusNetWorth")
    private Double rcrapp4ParBusNetWorth;
    /**
     * Signed by
     * <p>
     * Lineage reference object : RCRAPP1_SIGNED
     * 
     */
    @JsonProperty("signed")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_SIGNED")
    private String signed;
    /**
     * Legal Residence
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_RES, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeRes")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_STAT_CODE_RES, Lookup lineage reference object : stvstat")
    private String statCodeRes;
    /**
     * Institutional Housing Plans
     * <p>
     * Lineage reference object : RCRAPP1_INST_HOUS_CDE
     * 
     */
    @JsonProperty("instHousCde")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_INST_HOUS_CDE")
    private String instHousCde;
    /**
     * Processed by Processor
     * <p>
     * Lineage reference object : RCRAPP1_ORIG_COMP_DATE
     * 
     */
    @JsonProperty("origCompDate")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_ORIG_COMP_DATE")
    private Date origCompDate;
    /**
     * Invalid
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolFlg")
    private String rcrapp4HighSchoolFlg;
    /**
     * State
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("rcrapp4StatCodeHighSch")
    @JsonPropertyDescription("Lookup lineage reference object : stvstat")
    private String rcrapp4StatCodeHighSch;
    /**
     * Driver's License State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_LIC, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeLic")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_STAT_CODE_LIC, Lookup lineage reference object : stvstat")
    private String statCodeLic;
    /**
     * Active Duty in U.S. Armed Forces
     * <p>
     * Lineage reference object : RCRAPP1_ACTIVE_DUTY
     * 
     */
    @JsonProperty("activeDuty")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_ACTIVE_DUTY")
    private String activeDuty;
    /**
     * Lineage reference object : RCRAPP1_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("taxFilingStatus")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_TAX_FILING_STATUS")
    private String taxFilingStatus;
    @JsonProperty("rcrapp3GrantScholarAid")
    private Double rcrapp3GrantScholarAid;
    /**
     * Tax Return Type Form Filed
     * <p>
     * Lineage reference object : RCRAPP1_PAR_TAX_FORM_IND
     * 
     */
    @JsonProperty("parTaxFormInd")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_TAX_FORM_IND")
    private String parTaxFormInd;
    /**
     * Parent 1
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FatherHiGrade")
    private String rcrapp3FatherHiGrade;
    /**
     * Current Marital Status
     * <p>
     * Lineage reference object : RCRAPP1_MRTL_STATUS
     * 
     */
    @JsonProperty("mrtlStatus")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_MRTL_STATUS")
    private String mrtlStatus;
    /**
     * Legal Resident Before 01-JAN-2000
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4LegalResInd")
    private String rcrapp4LegalResInd;
    /**
     * Lineage reference object : RCRAPP1_FAM_MEMB
     * 
     */
    @JsonProperty("famMemb")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_FAM_MEMB")
    private Double famMemb;
    /**
     * Military and Clergy Allowance
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParHouseFoodOth")
    private Double rcrapp3ParHouseFoodOth;
    /**
     * Driver's License Number
     * <p>
     * Lineage reference object : RCRAPP1_DRIVER_LIC_NO
     * 
     */
    @JsonProperty("driverLicNo")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_DRIVER_LIC_NO")
    private String driverLicNo;
    @JsonProperty("rcrapp4MothBirthDate")
    private Date rcrapp4MothBirthDate;
    /**
     * Tax-Exempt Interest
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParTeIntInc")
    private Double rcrapp3ParTeIntInc;
    /**
     * Emancipated Minor
     * <p>
     * Lineage reference object : RCRAPP1_EMANCIPATED_MINOR
     * 
     */
    @JsonProperty("emancipatedMinor")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_EMANCIPATED_MINOR")
    private String emancipatedMinor;
    /**
     * Last Name
     * <p>
     * Lineage reference object : RCRAPP1_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_LAST_NAME")
    private String lastName;
    /**
     * Unaccompanied Youth by HUD
     * <p>
     * Lineage reference object : RCRAPP1_UNACCOMP_YOUTH_HUD
     * 
     */
    @JsonProperty("unaccompYouthHud")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_UNACCOMP_YOUTH_HUD")
    private String unaccompYouthHud;
    /**
     * City
     * <p>
     * Lineage reference object : RCRAPP1_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_CITY")
    private String city;
    /**
     * First Bachelor's Degree by 01-JUL-2005
     * <p>
     * Lineage reference object : RCRAPP1_DEGREE_BY_JULY
     * 
     */
    @JsonProperty("degreeByJuly")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_DEGREE_BY_JULY")
    private String degreeByJuly;
    /**
     * Orphan, Ward of Court, Foster Care
     * <p>
     * Lineage reference object : RCRAPP1_WARD_OF_COURT
     * 
     */
    @JsonProperty("wardOfCourt")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_WARD_OF_COURT")
    private String wardOfCourt;
    /**
     * Other Untaxed Income
     * <p>
     * Lineage reference object : RCRAPP1_PAR_OTH_UNTAX_INC
     * 
     */
    @JsonProperty("parOthUntaxInc")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_OTH_UNTAX_INC")
    private Double parOthUntaxInc;
    /**
     * Lineage reference object : RCRAPP1_CHILD_SUPP
     * 
     */
    @JsonProperty("childSupp")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_CHILD_SUPP")
    private Double childSupp;
    /**
     * Lineage reference object : RCRAPP1_PHONE_NO
     * 
     */
    @JsonProperty("phoneNo")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PHONE_NO")
    private String phoneNo;
    /**
     * Parent 2
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MothSsnMatch")
    private String rcrapp3MothSsnMatch;
    /**
     * Lineage reference object : RCRAPP1_US_INC_TAX_PD
     * 
     */
    @JsonProperty("usIncTaxPd")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_US_INC_TAX_PD")
    private Double usIncTaxPd;
    /**
     * Federal School Code Choice 4
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice4")
    private String rcrapp3FedCollChoice4;
    /**
     * Federal School Code Choice 5
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice5")
    private String rcrapp3FedCollChoice5;
    /**
     * Record Last Updated
     * <p>
     * 
     * 
     */
    @JsonProperty("activityDate")
    private Date activityDate;
    /**
     * Federal School Code Choice 1
     * <p>
     * Lineage reference object : RCRAPP1_FED_COLL_CHOICE_1
     * 
     */
    @JsonProperty("fedCollChoice1")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_FED_COLL_CHOICE_1")
    private String fedCollChoice1;
    /**
     * Federal School Code Choice 6
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice6")
    private String rcrapp3FedCollChoice6;
    /**
     * Grant and Scholarship Aid
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParGrantScholarAid")
    private Double rcrapp3ParGrantScholarAid;
    @JsonProperty("displayVerificationPrtyDesc")
    private String displayVerificationPrtyDesc;
    /**
     * Student IRS FIT Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsFitFlag")
    private String rcrapp3IrsFitFlag;
    /**
     * Lineage reference object : RCRAPP1_UNTAX_PENSIONS
     * 
     */
    @JsonProperty("untaxPensions")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_UNTAX_PENSIONS")
    private Double untaxPensions;
    /**
     * Paid Preparer's Employee Identification Number
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3PreparerEin")
    private String rcrapp3PreparerEin;
    @JsonProperty("rcrapp3ChildSuppPaid")
    private Double rcrapp3ChildSuppPaid;
    /**
     * Federal School Code Choice 7
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice7")
    private String rcrapp3FedCollChoice7;
    @JsonProperty("displaySResDateYr")
    private Double displaySResDateYr;
    /**
     * Federal School Code Choice 8
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice8")
    private String rcrapp3FedCollChoice8;
    /**
     * First Initial
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathFirstNameIni")
    private String rcrapp4FathFirstNameIni;
    /**
     * Federal School Code Choice 9
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice9")
    private String rcrapp3FedCollChoice9;
    /**
     * Special Circumstances Performed
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SpecCircumFlg")
    private String rcrapp3SpecCircumFlg;
    /**
     * Record Created
     * <p>
     * Lineage reference object : RCRAPP1_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_CREATE_DATE")
    private Date createDate;
    /**
     * Date of Status
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SMarMthYr")
    private String rcrapp3SMarMthYr;
    /**
     * Preparer's Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3PreparerSign")
    private String rcrapp3PreparerSign;
    /**
     * Parent IRS Display Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsDisplayFlag")
    private String rcrapp3ParIrsDisplayFlag;
    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathSsn")
    private String rcrapp4FathSsn;
    /**
     * Parent IRS AGI Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsAgiFlag")
    private String rcrapp3ParIrsAgiFlag;
    /**
     * Permit Selective Service Registration
     * <p>
     * Lineage reference object : RCRAPP1_PERMIT_DRAFT_REG
     * 
     */
    @JsonProperty("permitDraftReg")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PERMIT_DRAFT_REG")
    private String permitDraftReg;
    /**
     * Aid Eligibility Response or Drug Offense Conviction
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DrugOffenseConvic")
    private String rcrapp4DrugOffenseConvic;
    /**
     * Lineage reference object : RCRAPP1_RECD_TANF
     * 
     */
    @JsonProperty("recdTanf")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_RECD_TANF")
    private String recdTanf;
    @JsonProperty("rcrapp4SAssetThreshExcd")
    private String rcrapp4SAssetThreshExcd;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolCity")
    private String rcrapp4HighSchoolCity;
    /**
     * Federal School Code Choice 2
     * <p>
     * Lineage reference object : RCRAPP1_FED_COLL_CHOICE_2
     * 
     */
    @JsonProperty("fedCollChoice2")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_FED_COLL_CHOICE_2")
    private String fedCollChoice2;
    /**
     * Lineage reference object : RCRAPP1_VETS_NON_ED_BEN
     * 
     */
    @JsonProperty("vetsNonEdBen")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_VETS_NON_ED_BEN")
    private Double vetsNonEdBen;
    /**
     * Federal School Code Choice 3
     * <p>
     * Lineage reference object : RCRAPP1_FED_COLL_CHOICE_3
     * 
     */
    @JsonProperty("fedCollChoice3")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_FED_COLL_CHOICE_3")
    private String fedCollChoice3;
    /**
     * Updated By
     * <p>
     * 
     * 
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * Tax Filing Status
     * <p>
     * Lineage reference object : RCRAPP1_PAR_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("parTaxFilingStatus")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_TAX_FILING_STATUS")
    private String parTaxFilingStatus;
    /**
     * SNAP (Food Stamps)
     * <p>
     * Lineage reference object : RCRAPP1_PAR_FOOD_STAMPS
     * 
     */
    @JsonProperty("parFoodStamps")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_FOOD_STAMPS")
    private String parFoodStamps;
    /**
     * Wages (Parent 1 and Student)
     * <p>
     * Lineage reference object : RCRAPP1_FATH_INC_FR_WRK
     * 
     */
    @JsonProperty("fathIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_FATH_INC_FR_WRK")
    private Double fathIncFrWrk;
    /**
     * TANF
     * <p>
     * Lineage reference object : RCRAPP1_PAR_RECD_TANF
     * 
     */
    @JsonProperty("parRecdTanf")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_RECD_TANF")
    private String parRecdTanf;
    /**
     * WIC
     * <p>
     * Lineage reference object : RCRAPP1_PAR_RECD_WIC
     * 
     */
    @JsonProperty("parRecdWic")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_RECD_WIC")
    private String parRecdWic;
    @JsonProperty("rcrapp4MothLastName")
    private String rcrapp4MothLastName;
    /**
     * Interested in Work-Study
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4WrkStdyLoansInt")
    private String rcrapp4WrkStdyLoansInt;
    /**
     * Income Taxes Paid
     * <p>
     * Lineage reference object : RCRAPP1_PAR_US_INC_TAX_PD
     * 
     */
    @JsonProperty("parUsIncTaxPd")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_US_INC_TAX_PD")
    private Double parUsIncTaxPd;
    /**
     * Degree or Certificate
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3DegreeType")
    private String rcrapp3DegreeType;
    /**
     * Veteran of U.S. Armed Forces
     * <p>
     * Lineage reference object : RCRAPP1_US_VET
     * 
     */
    @JsonProperty("usVet")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_US_VET")
    private String usVet;
    /**
     * Married
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3Married")
    private String rcrapp3Married;
    /**
     * Lineage reference object : RCRAPP1_IRA_DISTRIBUTIONS
     * 
     */
    @JsonProperty("iraDistributions")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_IRA_DISTRIBUTIONS")
    private Double iraDistributions;
    /**
     * Year in College
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3YrInColl2")
    private String rcrapp3YrInColl2;
    /**
     * Lineage reference object : RCRAPP1_CASH_AMT
     * 
     */
    @JsonProperty("cashAmt")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_CASH_AMT")
    private Double cashAmt;
    /**
     * Lineage reference object : RCRAPP1_NO_IN_COLL
     * 
     */
    @JsonProperty("noInColl")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_NO_IN_COLL")
    private Double noInColl;
    /**
     * Graduate or Professional
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3GradOrProf")
    private String rcrapp3GradOrProf;
    /**
     * Family Members/ In College
     * <p>
     * Lineage reference object : RCRAPP1_PAR_FAM_MEMB
     * 
     */
    @JsonProperty("parFamMemb")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_FAM_MEMB")
    private Double parFamMemb;
    /**
     * Child Support Paid
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParChildSuppPaid")
    private Double rcrapp3ParChildSuppPaid;
    /**
     * Verification Group
     * <p>
     * Lineage reference object : RCRAPP1_VERIFICATION_PRTY
     * 
     */
    @JsonProperty("verificationPrty")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_VERIFICATION_PRTY")
    private String verificationPrty;
    /**
     * Federal School Code Choice 10
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice10")
    private String rcrapp3FedCollChoice10;
    /**
     * Number of Exemptions
     * <p>
     * Lineage reference object : RCRAPP1_PAR_NO_EXEMPT
     * 
     */
    @JsonProperty("parNoExempt")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_NO_EXEMPT")
    private Double parNoExempt;
    /**
     * Legal Residence
     * <p>
     * Lineage reference object : RCRAPP1_PAR_STAT_CODE_RES, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("parStatCodeRes")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_STAT_CODE_RES, Lookup lineage reference object : stvstat")
    private String parStatCodeRes;
    /**
     * Co-op Earnings
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParCoOpEarnings")
    private Double rcrapp3ParCoOpEarnings;
    /**
     * Parents' E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4PEmailAddress")
    private String rcrapp4PEmailAddress;
    /**
     * Investment Net Worth
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParInvNetWorth")
    private Double rcrapp4ParInvNetWorth;
    /**
     * Middle Initial
     * <p>
     * Lineage reference object : RCRAPP1_MI
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_MI")
    private String mi;
    /**
     * Banner Year in College
     * <p>
     * Lineage reference object : RCRAPP1_YR_IN_COLL
     * 
     */
    @JsonProperty("yrInColl")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_YR_IN_COLL")
    private String yrInColl;
    /**
     * Tax-Deferred Pensions
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParTaxDefPension")
    private Double rcrapp3ParTaxDefPension;
    /**
     * Dislocated Worker
     * <p>
     * Lineage reference object : RCRAPP1_PAR_DISL_WRK
     * 
     */
    @JsonProperty("parDislWrk")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_DISL_WRK")
    private String parDislWrk;
    /**
     * Lineage reference object : RCRAPP1_SPS_INC_FR_WRK
     * 
     */
    @JsonProperty("spsIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_SPS_INC_FR_WRK")
    private Double spsIncFrWrk;
    /**
     * Student IRS AGI Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsAgiFlag")
    private String rcrapp3IrsAgiFlag;
    /**
     * Alien Registration Number
     * <p>
     * Lineage reference object : RCRAPP1_ALIEN_REG_NO
     * 
     */
    @JsonProperty("alienRegNo")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_ALIEN_REG_NO")
    private String alienRegNo;
    @JsonProperty("rcrapp3CoOpEarnings")
    private Double rcrapp3CoOpEarnings;
    /**
     * Child Support Received
     * <p>
     * Lineage reference object : RCRAPP1_PAR_CHILD_SUPP
     * 
     */
    @JsonProperty("parChildSupp")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_CHILD_SUPP")
    private Double parChildSupp;
    /**
     * Born Before 01-JAN-1982
     * <p>
     * Lineage reference object : RCRAPP1_BORN_BEFORE_1_1_XX
     * 
     */
    @JsonProperty("bornBefore11Xx")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_BORN_BEFORE_1_1_XX")
    private String bornBefore11Xx;
    @JsonProperty("rcrapp4IraKeoghAmt")
    private Double rcrapp4IraKeoghAmt;
    /**
     * Parent 1
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FathSsnMatch")
    private String rcrapp3FathSsnMatch;
    @JsonProperty("rcrapp4InvNetWorth")
    private Double rcrapp4InvNetWorth;
    /**
     * Resident Since
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPResDateMo")
    private String displayPResDateMo;
    /**
     * Have Children You Support
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HaveChildren")
    private String rcrapp4HaveChildren;
    /**
     * Other Non-Reported Money
     * <p>
     * Lineage reference object : RCRAPP1_OTH_NON_REPORT_MONEY
     * 
     */
    @JsonProperty("othNonReportMoney")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_OTH_NON_REPORT_MONEY")
    private Double othNonReportMoney;
    /**
     * First Name
     * <p>
     * Lineage reference object : RCRAPP1_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_FIRST_NAME")
    private String firstName;
    /**
     * Received by Processor
     * <p>
     * Lineage reference object : RCRAPP1_RCPT_DATE
     * 
     */
    @JsonProperty("rcptDate")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_RCPT_DATE")
    private Date rcptDate;
    /**
     * Combat Pay
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParCombatPay")
    private Double rcrapp4ParCombatPay;
    /**
     * School Name
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolName")
    private String rcrapp4HighSchoolName;
    /**
     * Date of Birth
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathBirthDate")
    private Date rcrapp4FathBirthDate;
    /**
     * Home Phone Number
     * <p>
     * Lineage reference object : RCRAPP1_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PHONE_AREA")
    private String phoneArea;
    /**
     * Medicaid or SSI
     * <p>
     * Lineage reference object : RCRAPP1_PAR_RECD_SSI
     * 
     */
    @JsonProperty("parRecdSsi")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_RECD_SSI")
    private String parRecdSsi;
    /**
     * Date of Status
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParMarMthYr")
    private String rcrapp3ParMarMthYr;
    /**
     * Lineage reference object : RCRAPP1_FOOD_STAMPS
     * 
     */
    @JsonProperty("foodStamps")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_FOOD_STAMPS")
    private String foodStamps;
    /**
     * Legal Dependents
     * <p>
     * Lineage reference object : RCRAPP1_HAS_LEGAL_DEPEND
     * 
     */
    @JsonProperty("hasLegalDepend")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_HAS_LEGAL_DEPEND")
    private String hasLegalDepend;
    /**
     * Parent 2
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MotherHiGrade")
    private String rcrapp3MotherHiGrade;
    /**
     * Student IRS Request
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsRequestFlag")
    private String rcrapp3IrsRequestFlag;
    /**
     * Lineage reference object : RCRAPP1_US_INC
     * 
     */
    @JsonProperty("usInc")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_US_INC")
    private Double usInc;
    /**
     * Created By
     * <p>
     * Lineage reference object : RCRAPP1_CREATOR_ID
     * 
     */
    @JsonProperty("creatorId")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_CREATOR_ID")
    private String creatorId;
    /**
     * Lineage reference object : RCRAPP1_TAX_FORM_IND
     * 
     */
    @JsonProperty("taxFormInd")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_TAX_FORM_IND")
    private String taxFormInd;
    /**
     * Verification
     * <p>
     * Lineage reference object : RCRAPP1_VERIFICATION_MSG
     * 
     */
    @JsonProperty("verificationMsg")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_VERIFICATION_MSG")
    private String verificationMsg;
    /**
     * Male or Female
     * <p>
     * Lineage reference object : RCRAPP1_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_TITLE")
    private String title;
    /**
     * Lineage reference object : RCRAPP1_DISL_WRK
     * 
     */
    @JsonProperty("dislWrk")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_DISL_WRK")
    private String dislWrk;
    /**
     * Parent IRS Request
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsRequestFlag")
    private String rcrapp3ParIrsRequestFlag;
    /**
     * Legal Guardianship
     * <p>
     * Lineage reference object : RCRAPP1_LEGAL_GUARDIAN
     * 
     */
    @JsonProperty("legalGuardian")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_LEGAL_GUARDIAN")
    private String legalGuardian;
    /**
     * Asset Threshold Exceeded
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4PAssetThreshExcd")
    private String rcrapp4PAssetThreshExcd;
    /**
     * IRA and Keogh Deductions
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIraKeough")
    private Double rcrapp3ParIraKeough;
    @JsonProperty("rcrapp3TaxDefPension")
    private Double rcrapp3TaxDefPension;
    /**
     * Untaxed Pensions
     * <p>
     * Lineage reference object : RCRAPP1_PAR_UNTAX_PENSIONS
     * 
     */
    @JsonProperty("parUntaxPensions")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_UNTAX_PENSIONS")
    private Double parUntaxPensions;
    /**
     * Resident Since
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySResDateMo")
    private String displaySResDateMo;
    @JsonProperty("displayPResDateYr")
    private String displayPResDateYr;
    /**
     * Parents' Marital Status
     * <p>
     * Lineage reference object : RCRAPP1_PAR_MRTL_STATUS
     * 
     */
    @JsonProperty("parMrtlStatus")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_MRTL_STATUS")
    private String parMrtlStatus;
    @JsonProperty("rcrapp4MothSsn")
    private String rcrapp4MothSsn;
    /**
     * Address
     * <p>
     * Lineage reference object : RCRAPP1_ADDR
     * 
     */
    @JsonProperty("addr")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_ADDR")
    private String addr;
    /**
     * Lineage reference object : RCRAPP1_RECD_WIC
     * 
     */
    @JsonProperty("recdWic")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_RECD_WIC")
    private String recdWic;
    /**
     * Student IRS Display Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsDisplayFlag")
    private String rcrapp3IrsDisplayFlag;
    /**
     * Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolCde")
    private String rcrapp4HighSchoolCde;
    /**
     * State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Unaccompanied Youth by School
     * <p>
     * Lineage reference object : RCRAPP1_UNACCOMP_YOUTH_SCHOOL
     * 
     */
    @JsonProperty("unaccompYouthSchool")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_UNACCOMP_YOUTH_SCHOOL")
    private String unaccompYouthSchool;
    @JsonProperty("rcrapp3EducCredits")
    private Double rcrapp3EducCredits;
    /**
     * Date of Birth
     * <p>
     * Lineage reference object : RCRAPP1_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_BIRTH_DATE")
    private Date birthDate;
    /**
     * High School Diploma or Equivalent
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HsGedRcvd")
    private String rcrapp4HsGedRcvd;
    @JsonProperty("rcrapp4TxRetFiledInd")
    private String rcrapp4TxRetFiledInd;
    @JsonProperty("rcrapp3TeIntInc")
    private Double rcrapp3TeIntInc;
    @JsonProperty("rcrapp41040aEligInd")
    private String rcrapp41040aEligInd;
    /**
     * Date Application Completed
     * <p>
     * Lineage reference object : RCRAPP1_COMPLETION_DATE
     * 
     */
    @JsonProperty("completionDate")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_COMPLETION_DATE")
    private Date completionDate;
    /**
     * Professional Judgment Used
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3EfcRecalcCorrReq")
    private String rcrapp3EfcRecalcCorrReq;
    @JsonProperty("rcrapp4MothFirstNameIni")
    private String rcrapp4MothFirstNameIni;
    /**
     * Wages (Parent 2 and Spouse)
     * <p>
     * Lineage reference object : RCRAPP1_MOTH_INC_FR_WRK
     * 
     */
    @JsonProperty("mothIncFrWrk")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_MOTH_INC_FR_WRK")
    private Double mothIncFrWrk;
    /**
     * Free or Reduced Lunch
     * <p>
     * Lineage reference object : RCRAPP1_PAR_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("parSchoolLunch")
    @JsonPropertyDescription("Lineage reference object : RCRAPP1_PAR_SCHOOL_LUNCH")
    private String parSchoolLunch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RCRAPP1_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("schoolLunch")
    public String getSchoolLunch() {
        return schoolLunch;
    }

    /**
     * Lineage reference object : RCRAPP1_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("schoolLunch")
    public void setSchoolLunch(String schoolLunch) {
        this.schoolLunch = schoolLunch;
    }

    public Rcrapp1__1 withSchoolLunch(String schoolLunch) {
        this.schoolLunch = schoolLunch;
        return this;
    }

    /**
     * Citizenship Status
     * <p>
     * Lineage reference object : RCRAPP1_CITZ_IND
     * 
     */
    @JsonProperty("citzInd")
    public String getCitzInd() {
        return citzInd;
    }

    /**
     * Citizenship Status
     * <p>
     * Lineage reference object : RCRAPP1_CITZ_IND
     * 
     */
    @JsonProperty("citzInd")
    public void setCitzInd(String citzInd) {
        this.citzInd = citzInd;
    }

    public Rcrapp1__1 withCitzInd(String citzInd) {
        this.citzInd = citzInd;
        return this;
    }

    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RCRAPP1_PAR_VETS_NON_ED_BEN
     * 
     */
    @JsonProperty("parVetsNonEdBen")
    public Double getParVetsNonEdBen() {
        return parVetsNonEdBen;
    }

    /**
     * VA Non-Education Benefits
     * <p>
     * Lineage reference object : RCRAPP1_PAR_VETS_NON_ED_BEN
     * 
     */
    @JsonProperty("parVetsNonEdBen")
    public void setParVetsNonEdBen(Double parVetsNonEdBen) {
        this.parVetsNonEdBen = parVetsNonEdBen;
    }

    public Rcrapp1__1 withParVetsNonEdBen(Double parVetsNonEdBen) {
        this.parVetsNonEdBen = parVetsNonEdBen;
        return this;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathLastName")
    public String getRcrapp4FathLastName() {
        return rcrapp4FathLastName;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathLastName")
    public void setRcrapp4FathLastName(String rcrapp4FathLastName) {
        this.rcrapp4FathLastName = rcrapp4FathLastName;
    }

    public Rcrapp1__1 withRcrapp4FathLastName(String rcrapp4FathLastName) {
        this.rcrapp4FathLastName = rcrapp4FathLastName;
        return this;
    }

    /**
     * Education Tax Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParEducCredits")
    public Double getRcrapp3ParEducCredits() {
        return rcrapp3ParEducCredits;
    }

    /**
     * Education Tax Credits
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParEducCredits")
    public void setRcrapp3ParEducCredits(Double rcrapp3ParEducCredits) {
        this.rcrapp3ParEducCredits = rcrapp3ParEducCredits;
    }

    public Rcrapp1__1 withRcrapp3ParEducCredits(Double rcrapp3ParEducCredits) {
        this.rcrapp3ParEducCredits = rcrapp3ParEducCredits;
        return this;
    }

    /**
     * Preparer's SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3PreparerSsn")
    public String getRcrapp3PreparerSsn() {
        return rcrapp3PreparerSsn;
    }

    /**
     * Preparer's SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3PreparerSsn")
    public void setRcrapp3PreparerSsn(String rcrapp3PreparerSsn) {
        this.rcrapp3PreparerSsn = rcrapp3PreparerSsn;
    }

    public Rcrapp1__1 withRcrapp3PreparerSsn(String rcrapp3PreparerSsn) {
        this.rcrapp3PreparerSsn = rcrapp3PreparerSsn;
        return this;
    }

    @JsonProperty("rcrapp4BusNetWorth")
    public Double getRcrapp4BusNetWorth() {
        return rcrapp4BusNetWorth;
    }

    @JsonProperty("rcrapp4BusNetWorth")
    public void setRcrapp4BusNetWorth(Double rcrapp4BusNetWorth) {
        this.rcrapp4BusNetWorth = rcrapp4BusNetWorth;
    }

    public Rcrapp1__1 withRcrapp4BusNetWorth(Double rcrapp4BusNetWorth) {
        this.rcrapp4BusNetWorth = rcrapp4BusNetWorth;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_INC_FR_WRK
     * 
     */
    @JsonProperty("incFrWrk")
    public Double getIncFrWrk() {
        return incFrWrk;
    }

    /**
     * Lineage reference object : RCRAPP1_INC_FR_WRK
     * 
     */
    @JsonProperty("incFrWrk")
    public void setIncFrWrk(Double incFrWrk) {
        this.incFrWrk = incFrWrk;
    }

    public Rcrapp1__1 withIncFrWrk(Double incFrWrk) {
        this.incFrWrk = incFrWrk;
        return this;
    }

    /**
     * Social Security Number
     * <p>
     * Lineage reference object : RCRAPP1_SSN
     * (Required)
     * 
     */
    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    /**
     * Social Security Number
     * <p>
     * Lineage reference object : RCRAPP1_SSN
     * (Required)
     * 
     */
    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Rcrapp1__1 withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    /**
     * Last Need Analysis Calculation Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNeedDate")
    public Date getDisplayNeedDate() {
        return displayNeedDate;
    }

    /**
     * Last Need Analysis Calculation Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNeedDate")
    public void setDisplayNeedDate(Date displayNeedDate) {
        this.displayNeedDate = displayNeedDate;
    }

    public Rcrapp1__1 withDisplayNeedDate(Date displayNeedDate) {
        this.displayNeedDate = displayNeedDate;
        return this;
    }

    /**
     * Eligible to File 1040A EZ
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4Par1040aEligInd")
    public String getRcrapp4Par1040aEligInd() {
        return rcrapp4Par1040aEligInd;
    }

    /**
     * Eligible to File 1040A EZ
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4Par1040aEligInd")
    public void setRcrapp4Par1040aEligInd(String rcrapp4Par1040aEligInd) {
        this.rcrapp4Par1040aEligInd = rcrapp4Par1040aEligInd;
    }

    public Rcrapp1__1 withRcrapp4Par1040aEligInd(String rcrapp4Par1040aEligInd) {
        this.rcrapp4Par1040aEligInd = rcrapp4Par1040aEligInd;
        return this;
    }

    /**
     * Adjusted Gross Income
     * <p>
     * Lineage reference object : RCRAPP1_PAR_US_INC
     * 
     */
    @JsonProperty("parUsInc")
    public Double getParUsInc() {
        return parUsInc;
    }

    /**
     * Adjusted Gross Income
     * <p>
     * Lineage reference object : RCRAPP1_PAR_US_INC
     * 
     */
    @JsonProperty("parUsInc")
    public void setParUsInc(Double parUsInc) {
        this.parUsInc = parUsInc;
    }

    public Rcrapp1__1 withParUsInc(Double parUsInc) {
        this.parUsInc = parUsInc;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_RECD_SSI
     * 
     */
    @JsonProperty("recdSsi")
    public String getRecdSsi() {
        return recdSsi;
    }

    /**
     * Lineage reference object : RCRAPP1_RECD_SSI
     * 
     */
    @JsonProperty("recdSsi")
    public void setRecdSsi(String recdSsi) {
        this.recdSsi = recdSsi;
    }

    public Rcrapp1__1 withRecdSsi(String recdSsi) {
        this.recdSsi = recdSsi;
        return this;
    }

    /**
     * Cash Savings Checking
     * <p>
     * Lineage reference object : RCRAPP1_PAR_CASH_AMT
     * 
     */
    @JsonProperty("parCashAmt")
    public Double getParCashAmt() {
        return parCashAmt;
    }

    /**
     * Cash Savings Checking
     * <p>
     * Lineage reference object : RCRAPP1_PAR_CASH_AMT
     * 
     */
    @JsonProperty("parCashAmt")
    public void setParCashAmt(Double parCashAmt) {
        this.parCashAmt = parCashAmt;
    }

    public Rcrapp1__1 withParCashAmt(Double parCashAmt) {
        this.parCashAmt = parCashAmt;
        return this;
    }

    /**
     * Untaxed IRA Distributions
     * <p>
     * Lineage reference object : RCRAPP1_PAR_IRA_DISTRIBUTIONS
     * 
     */
    @JsonProperty("parIraDistributions")
    public Double getParIraDistributions() {
        return parIraDistributions;
    }

    /**
     * Untaxed IRA Distributions
     * <p>
     * Lineage reference object : RCRAPP1_PAR_IRA_DISTRIBUTIONS
     * 
     */
    @JsonProperty("parIraDistributions")
    public void setParIraDistributions(Double parIraDistributions) {
        this.parIraDistributions = parIraDistributions;
    }

    public Rcrapp1__1 withParIraDistributions(Double parIraDistributions) {
        this.parIraDistributions = parIraDistributions;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_PAR_NO_IN_COLL
     * 
     */
    @JsonProperty("parNoInColl")
    public Double getParNoInColl() {
        return parNoInColl;
    }

    /**
     * Lineage reference object : RCRAPP1_PAR_NO_IN_COLL
     * 
     */
    @JsonProperty("parNoInColl")
    public void setParNoInColl(Double parNoInColl) {
        this.parNoInColl = parNoInColl;
    }

    public Rcrapp1__1 withParNoInColl(Double parNoInColl) {
        this.parNoInColl = parNoInColl;
        return this;
    }

    /**
     * Parent IRS FIT Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsFitFlag")
    public String getRcrapp3ParIrsFitFlag() {
        return rcrapp3ParIrsFitFlag;
    }

    /**
     * Parent IRS FIT Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsFitFlag")
    public void setRcrapp3ParIrsFitFlag(String rcrapp3ParIrsFitFlag) {
        this.rcrapp3ParIrsFitFlag = rcrapp3ParIrsFitFlag;
    }

    public Rcrapp1__1 withRcrapp3ParIrsFitFlag(String rcrapp3ParIrsFitFlag) {
        this.rcrapp3ParIrsFitFlag = rcrapp3ParIrsFitFlag;
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

    public Rcrapp1__1 withRcrapp3HouseFoodOth(Double rcrapp3HouseFoodOth) {
        this.rcrapp3HouseFoodOth = rcrapp3HouseFoodOth;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_NO_EXEMPT
     * 
     */
    @JsonProperty("noExempt")
    public Double getNoExempt() {
        return noExempt;
    }

    /**
     * Lineage reference object : RCRAPP1_NO_EXEMPT
     * 
     */
    @JsonProperty("noExempt")
    public void setNoExempt(Double noExempt) {
        this.noExempt = noExempt;
    }

    public Rcrapp1__1 withNoExempt(Double noExempt) {
        this.noExempt = noExempt;
        return this;
    }

    /**
     * Need Based Employment
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParNeedBasedEmploy")
    public Double getRcrapp3ParNeedBasedEmploy() {
        return rcrapp3ParNeedBasedEmploy;
    }

    /**
     * Need Based Employment
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParNeedBasedEmploy")
    public void setRcrapp3ParNeedBasedEmploy(Double rcrapp3ParNeedBasedEmploy) {
        this.rcrapp3ParNeedBasedEmploy = rcrapp3ParNeedBasedEmploy;
    }

    public Rcrapp1__1 withRcrapp3ParNeedBasedEmploy(Double rcrapp3ParNeedBasedEmploy) {
        this.rcrapp3ParNeedBasedEmploy = rcrapp3ParNeedBasedEmploy;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_OTH_UNTAX_INC
     * 
     */
    @JsonProperty("othUntaxInc")
    public Double getOthUntaxInc() {
        return othUntaxInc;
    }

    /**
     * Lineage reference object : RCRAPP1_OTH_UNTAX_INC
     * 
     */
    @JsonProperty("othUntaxInc")
    public void setOthUntaxInc(Double othUntaxInc) {
        this.othUntaxInc = othUntaxInc;
    }

    public Rcrapp1__1 withOthUntaxInc(Double othUntaxInc) {
        this.othUntaxInc = othUntaxInc;
        return this;
    }

    /**
     * Zip
     * <p>
     * Lineage reference object : RCRAPP1_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * Zip
     * <p>
     * Lineage reference object : RCRAPP1_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public Rcrapp1__1 withZip(String zip) {
        this.zip = zip;
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

    public Rcrapp1__1 withRcrapp3NeedBasedEmploy(Double rcrapp3NeedBasedEmploy) {
        this.rcrapp3NeedBasedEmploy = rcrapp3NeedBasedEmploy;
        return this;
    }

    /**
     * E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4EmailAddress")
    public String getRcrapp4EmailAddress() {
        return rcrapp4EmailAddress;
    }

    /**
     * E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4EmailAddress")
    public void setRcrapp4EmailAddress(String rcrapp4EmailAddress) {
        this.rcrapp4EmailAddress = rcrapp4EmailAddress;
    }

    public Rcrapp1__1 withRcrapp4EmailAddress(String rcrapp4EmailAddress) {
        this.rcrapp4EmailAddress = rcrapp4EmailAddress;
        return this;
    }

    /**
     * Parent Legal Resident Before 01-JAN-2000
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParLegalResInd")
    public String getRcrapp4ParLegalResInd() {
        return rcrapp4ParLegalResInd;
    }

    /**
     * Parent Legal Resident Before 01-JAN-2000
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParLegalResInd")
    public void setRcrapp4ParLegalResInd(String rcrapp4ParLegalResInd) {
        this.rcrapp4ParLegalResInd = rcrapp4ParLegalResInd;
    }

    public Rcrapp1__1 withRcrapp4ParLegalResInd(String rcrapp4ParLegalResInd) {
        this.rcrapp4ParLegalResInd = rcrapp4ParLegalResInd;
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

    public Rcrapp1__1 withRcrapp4CombatPay(Double rcrapp4CombatPay) {
        this.rcrapp4CombatPay = rcrapp4CombatPay;
        return this;
    }

    /**
     * At Risk of Homelessness
     * <p>
     * Lineage reference object : RCRAPP1_AT_RISK_HOMELESS
     * 
     */
    @JsonProperty("atRiskHomeless")
    public String getAtRiskHomeless() {
        return atRiskHomeless;
    }

    /**
     * At Risk of Homelessness
     * <p>
     * Lineage reference object : RCRAPP1_AT_RISK_HOMELESS
     * 
     */
    @JsonProperty("atRiskHomeless")
    public void setAtRiskHomeless(String atRiskHomeless) {
        this.atRiskHomeless = atRiskHomeless;
    }

    public Rcrapp1__1 withAtRiskHomeless(String atRiskHomeless) {
        this.atRiskHomeless = atRiskHomeless;
        return this;
    }

    /**
     * Tax Return Filed
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParTxRetFiledInd")
    public String getRcrapp4ParTxRetFiledInd() {
        return rcrapp4ParTxRetFiledInd;
    }

    /**
     * Tax Return Filed
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParTxRetFiledInd")
    public void setRcrapp4ParTxRetFiledInd(String rcrapp4ParTxRetFiledInd) {
        this.rcrapp4ParTxRetFiledInd = rcrapp4ParTxRetFiledInd;
    }

    public Rcrapp1__1 withRcrapp4ParTxRetFiledInd(String rcrapp4ParTxRetFiledInd) {
        this.rcrapp4ParTxRetFiledInd = rcrapp4ParTxRetFiledInd;
        return this;
    }

    /**
     * Business and Farm Net Worth
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParBusNetWorth")
    public Double getRcrapp4ParBusNetWorth() {
        return rcrapp4ParBusNetWorth;
    }

    /**
     * Business and Farm Net Worth
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParBusNetWorth")
    public void setRcrapp4ParBusNetWorth(Double rcrapp4ParBusNetWorth) {
        this.rcrapp4ParBusNetWorth = rcrapp4ParBusNetWorth;
    }

    public Rcrapp1__1 withRcrapp4ParBusNetWorth(Double rcrapp4ParBusNetWorth) {
        this.rcrapp4ParBusNetWorth = rcrapp4ParBusNetWorth;
        return this;
    }

    /**
     * Signed by
     * <p>
     * Lineage reference object : RCRAPP1_SIGNED
     * 
     */
    @JsonProperty("signed")
    public String getSigned() {
        return signed;
    }

    /**
     * Signed by
     * <p>
     * Lineage reference object : RCRAPP1_SIGNED
     * 
     */
    @JsonProperty("signed")
    public void setSigned(String signed) {
        this.signed = signed;
    }

    public Rcrapp1__1 withSigned(String signed) {
        this.signed = signed;
        return this;
    }

    /**
     * Legal Residence
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_RES, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeRes")
    public String getStatCodeRes() {
        return statCodeRes;
    }

    /**
     * Legal Residence
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_RES, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeRes")
    public void setStatCodeRes(String statCodeRes) {
        this.statCodeRes = statCodeRes;
    }

    public Rcrapp1__1 withStatCodeRes(String statCodeRes) {
        this.statCodeRes = statCodeRes;
        return this;
    }

    /**
     * Institutional Housing Plans
     * <p>
     * Lineage reference object : RCRAPP1_INST_HOUS_CDE
     * 
     */
    @JsonProperty("instHousCde")
    public String getInstHousCde() {
        return instHousCde;
    }

    /**
     * Institutional Housing Plans
     * <p>
     * Lineage reference object : RCRAPP1_INST_HOUS_CDE
     * 
     */
    @JsonProperty("instHousCde")
    public void setInstHousCde(String instHousCde) {
        this.instHousCde = instHousCde;
    }

    public Rcrapp1__1 withInstHousCde(String instHousCde) {
        this.instHousCde = instHousCde;
        return this;
    }

    /**
     * Processed by Processor
     * <p>
     * Lineage reference object : RCRAPP1_ORIG_COMP_DATE
     * 
     */
    @JsonProperty("origCompDate")
    public Date getOrigCompDate() {
        return origCompDate;
    }

    /**
     * Processed by Processor
     * <p>
     * Lineage reference object : RCRAPP1_ORIG_COMP_DATE
     * 
     */
    @JsonProperty("origCompDate")
    public void setOrigCompDate(Date origCompDate) {
        this.origCompDate = origCompDate;
    }

    public Rcrapp1__1 withOrigCompDate(Date origCompDate) {
        this.origCompDate = origCompDate;
        return this;
    }

    /**
     * Invalid
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolFlg")
    public String getRcrapp4HighSchoolFlg() {
        return rcrapp4HighSchoolFlg;
    }

    /**
     * Invalid
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolFlg")
    public void setRcrapp4HighSchoolFlg(String rcrapp4HighSchoolFlg) {
        this.rcrapp4HighSchoolFlg = rcrapp4HighSchoolFlg;
    }

    public Rcrapp1__1 withRcrapp4HighSchoolFlg(String rcrapp4HighSchoolFlg) {
        this.rcrapp4HighSchoolFlg = rcrapp4HighSchoolFlg;
        return this;
    }

    /**
     * State
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("rcrapp4StatCodeHighSch")
    public String getRcrapp4StatCodeHighSch() {
        return rcrapp4StatCodeHighSch;
    }

    /**
     * State
     * <p>
     * Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("rcrapp4StatCodeHighSch")
    public void setRcrapp4StatCodeHighSch(String rcrapp4StatCodeHighSch) {
        this.rcrapp4StatCodeHighSch = rcrapp4StatCodeHighSch;
    }

    public Rcrapp1__1 withRcrapp4StatCodeHighSch(String rcrapp4StatCodeHighSch) {
        this.rcrapp4StatCodeHighSch = rcrapp4StatCodeHighSch;
        return this;
    }

    /**
     * Driver's License State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_LIC, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeLic")
    public String getStatCodeLic() {
        return statCodeLic;
    }

    /**
     * Driver's License State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE_LIC, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeLic")
    public void setStatCodeLic(String statCodeLic) {
        this.statCodeLic = statCodeLic;
    }

    public Rcrapp1__1 withStatCodeLic(String statCodeLic) {
        this.statCodeLic = statCodeLic;
        return this;
    }

    /**
     * Active Duty in U.S. Armed Forces
     * <p>
     * Lineage reference object : RCRAPP1_ACTIVE_DUTY
     * 
     */
    @JsonProperty("activeDuty")
    public String getActiveDuty() {
        return activeDuty;
    }

    /**
     * Active Duty in U.S. Armed Forces
     * <p>
     * Lineage reference object : RCRAPP1_ACTIVE_DUTY
     * 
     */
    @JsonProperty("activeDuty")
    public void setActiveDuty(String activeDuty) {
        this.activeDuty = activeDuty;
    }

    public Rcrapp1__1 withActiveDuty(String activeDuty) {
        this.activeDuty = activeDuty;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("taxFilingStatus")
    public String getTaxFilingStatus() {
        return taxFilingStatus;
    }

    /**
     * Lineage reference object : RCRAPP1_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("taxFilingStatus")
    public void setTaxFilingStatus(String taxFilingStatus) {
        this.taxFilingStatus = taxFilingStatus;
    }

    public Rcrapp1__1 withTaxFilingStatus(String taxFilingStatus) {
        this.taxFilingStatus = taxFilingStatus;
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

    public Rcrapp1__1 withRcrapp3GrantScholarAid(Double rcrapp3GrantScholarAid) {
        this.rcrapp3GrantScholarAid = rcrapp3GrantScholarAid;
        return this;
    }

    /**
     * Tax Return Type Form Filed
     * <p>
     * Lineage reference object : RCRAPP1_PAR_TAX_FORM_IND
     * 
     */
    @JsonProperty("parTaxFormInd")
    public String getParTaxFormInd() {
        return parTaxFormInd;
    }

    /**
     * Tax Return Type Form Filed
     * <p>
     * Lineage reference object : RCRAPP1_PAR_TAX_FORM_IND
     * 
     */
    @JsonProperty("parTaxFormInd")
    public void setParTaxFormInd(String parTaxFormInd) {
        this.parTaxFormInd = parTaxFormInd;
    }

    public Rcrapp1__1 withParTaxFormInd(String parTaxFormInd) {
        this.parTaxFormInd = parTaxFormInd;
        return this;
    }

    /**
     * Parent 1
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FatherHiGrade")
    public String getRcrapp3FatherHiGrade() {
        return rcrapp3FatherHiGrade;
    }

    /**
     * Parent 1
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FatherHiGrade")
    public void setRcrapp3FatherHiGrade(String rcrapp3FatherHiGrade) {
        this.rcrapp3FatherHiGrade = rcrapp3FatherHiGrade;
    }

    public Rcrapp1__1 withRcrapp3FatherHiGrade(String rcrapp3FatherHiGrade) {
        this.rcrapp3FatherHiGrade = rcrapp3FatherHiGrade;
        return this;
    }

    /**
     * Current Marital Status
     * <p>
     * Lineage reference object : RCRAPP1_MRTL_STATUS
     * 
     */
    @JsonProperty("mrtlStatus")
    public String getMrtlStatus() {
        return mrtlStatus;
    }

    /**
     * Current Marital Status
     * <p>
     * Lineage reference object : RCRAPP1_MRTL_STATUS
     * 
     */
    @JsonProperty("mrtlStatus")
    public void setMrtlStatus(String mrtlStatus) {
        this.mrtlStatus = mrtlStatus;
    }

    public Rcrapp1__1 withMrtlStatus(String mrtlStatus) {
        this.mrtlStatus = mrtlStatus;
        return this;
    }

    /**
     * Legal Resident Before 01-JAN-2000
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4LegalResInd")
    public String getRcrapp4LegalResInd() {
        return rcrapp4LegalResInd;
    }

    /**
     * Legal Resident Before 01-JAN-2000
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4LegalResInd")
    public void setRcrapp4LegalResInd(String rcrapp4LegalResInd) {
        this.rcrapp4LegalResInd = rcrapp4LegalResInd;
    }

    public Rcrapp1__1 withRcrapp4LegalResInd(String rcrapp4LegalResInd) {
        this.rcrapp4LegalResInd = rcrapp4LegalResInd;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_FAM_MEMB
     * 
     */
    @JsonProperty("famMemb")
    public Double getFamMemb() {
        return famMemb;
    }

    /**
     * Lineage reference object : RCRAPP1_FAM_MEMB
     * 
     */
    @JsonProperty("famMemb")
    public void setFamMemb(Double famMemb) {
        this.famMemb = famMemb;
    }

    public Rcrapp1__1 withFamMemb(Double famMemb) {
        this.famMemb = famMemb;
        return this;
    }

    /**
     * Military and Clergy Allowance
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParHouseFoodOth")
    public Double getRcrapp3ParHouseFoodOth() {
        return rcrapp3ParHouseFoodOth;
    }

    /**
     * Military and Clergy Allowance
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParHouseFoodOth")
    public void setRcrapp3ParHouseFoodOth(Double rcrapp3ParHouseFoodOth) {
        this.rcrapp3ParHouseFoodOth = rcrapp3ParHouseFoodOth;
    }

    public Rcrapp1__1 withRcrapp3ParHouseFoodOth(Double rcrapp3ParHouseFoodOth) {
        this.rcrapp3ParHouseFoodOth = rcrapp3ParHouseFoodOth;
        return this;
    }

    /**
     * Driver's License Number
     * <p>
     * Lineage reference object : RCRAPP1_DRIVER_LIC_NO
     * 
     */
    @JsonProperty("driverLicNo")
    public String getDriverLicNo() {
        return driverLicNo;
    }

    /**
     * Driver's License Number
     * <p>
     * Lineage reference object : RCRAPP1_DRIVER_LIC_NO
     * 
     */
    @JsonProperty("driverLicNo")
    public void setDriverLicNo(String driverLicNo) {
        this.driverLicNo = driverLicNo;
    }

    public Rcrapp1__1 withDriverLicNo(String driverLicNo) {
        this.driverLicNo = driverLicNo;
        return this;
    }

    @JsonProperty("rcrapp4MothBirthDate")
    public Date getRcrapp4MothBirthDate() {
        return rcrapp4MothBirthDate;
    }

    @JsonProperty("rcrapp4MothBirthDate")
    public void setRcrapp4MothBirthDate(Date rcrapp4MothBirthDate) {
        this.rcrapp4MothBirthDate = rcrapp4MothBirthDate;
    }

    public Rcrapp1__1 withRcrapp4MothBirthDate(Date rcrapp4MothBirthDate) {
        this.rcrapp4MothBirthDate = rcrapp4MothBirthDate;
        return this;
    }

    /**
     * Tax-Exempt Interest
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParTeIntInc")
    public Double getRcrapp3ParTeIntInc() {
        return rcrapp3ParTeIntInc;
    }

    /**
     * Tax-Exempt Interest
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParTeIntInc")
    public void setRcrapp3ParTeIntInc(Double rcrapp3ParTeIntInc) {
        this.rcrapp3ParTeIntInc = rcrapp3ParTeIntInc;
    }

    public Rcrapp1__1 withRcrapp3ParTeIntInc(Double rcrapp3ParTeIntInc) {
        this.rcrapp3ParTeIntInc = rcrapp3ParTeIntInc;
        return this;
    }

    /**
     * Emancipated Minor
     * <p>
     * Lineage reference object : RCRAPP1_EMANCIPATED_MINOR
     * 
     */
    @JsonProperty("emancipatedMinor")
    public String getEmancipatedMinor() {
        return emancipatedMinor;
    }

    /**
     * Emancipated Minor
     * <p>
     * Lineage reference object : RCRAPP1_EMANCIPATED_MINOR
     * 
     */
    @JsonProperty("emancipatedMinor")
    public void setEmancipatedMinor(String emancipatedMinor) {
        this.emancipatedMinor = emancipatedMinor;
    }

    public Rcrapp1__1 withEmancipatedMinor(String emancipatedMinor) {
        this.emancipatedMinor = emancipatedMinor;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : RCRAPP1_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : RCRAPP1_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Rcrapp1__1 withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Unaccompanied Youth by HUD
     * <p>
     * Lineage reference object : RCRAPP1_UNACCOMP_YOUTH_HUD
     * 
     */
    @JsonProperty("unaccompYouthHud")
    public String getUnaccompYouthHud() {
        return unaccompYouthHud;
    }

    /**
     * Unaccompanied Youth by HUD
     * <p>
     * Lineage reference object : RCRAPP1_UNACCOMP_YOUTH_HUD
     * 
     */
    @JsonProperty("unaccompYouthHud")
    public void setUnaccompYouthHud(String unaccompYouthHud) {
        this.unaccompYouthHud = unaccompYouthHud;
    }

    public Rcrapp1__1 withUnaccompYouthHud(String unaccompYouthHud) {
        this.unaccompYouthHud = unaccompYouthHud;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : RCRAPP1_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : RCRAPP1_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Rcrapp1__1 withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * First Bachelor's Degree by 01-JUL-2005
     * <p>
     * Lineage reference object : RCRAPP1_DEGREE_BY_JULY
     * 
     */
    @JsonProperty("degreeByJuly")
    public String getDegreeByJuly() {
        return degreeByJuly;
    }

    /**
     * First Bachelor's Degree by 01-JUL-2005
     * <p>
     * Lineage reference object : RCRAPP1_DEGREE_BY_JULY
     * 
     */
    @JsonProperty("degreeByJuly")
    public void setDegreeByJuly(String degreeByJuly) {
        this.degreeByJuly = degreeByJuly;
    }

    public Rcrapp1__1 withDegreeByJuly(String degreeByJuly) {
        this.degreeByJuly = degreeByJuly;
        return this;
    }

    /**
     * Orphan, Ward of Court, Foster Care
     * <p>
     * Lineage reference object : RCRAPP1_WARD_OF_COURT
     * 
     */
    @JsonProperty("wardOfCourt")
    public String getWardOfCourt() {
        return wardOfCourt;
    }

    /**
     * Orphan, Ward of Court, Foster Care
     * <p>
     * Lineage reference object : RCRAPP1_WARD_OF_COURT
     * 
     */
    @JsonProperty("wardOfCourt")
    public void setWardOfCourt(String wardOfCourt) {
        this.wardOfCourt = wardOfCourt;
    }

    public Rcrapp1__1 withWardOfCourt(String wardOfCourt) {
        this.wardOfCourt = wardOfCourt;
        return this;
    }

    /**
     * Other Untaxed Income
     * <p>
     * Lineage reference object : RCRAPP1_PAR_OTH_UNTAX_INC
     * 
     */
    @JsonProperty("parOthUntaxInc")
    public Double getParOthUntaxInc() {
        return parOthUntaxInc;
    }

    /**
     * Other Untaxed Income
     * <p>
     * Lineage reference object : RCRAPP1_PAR_OTH_UNTAX_INC
     * 
     */
    @JsonProperty("parOthUntaxInc")
    public void setParOthUntaxInc(Double parOthUntaxInc) {
        this.parOthUntaxInc = parOthUntaxInc;
    }

    public Rcrapp1__1 withParOthUntaxInc(Double parOthUntaxInc) {
        this.parOthUntaxInc = parOthUntaxInc;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_CHILD_SUPP
     * 
     */
    @JsonProperty("childSupp")
    public Double getChildSupp() {
        return childSupp;
    }

    /**
     * Lineage reference object : RCRAPP1_CHILD_SUPP
     * 
     */
    @JsonProperty("childSupp")
    public void setChildSupp(Double childSupp) {
        this.childSupp = childSupp;
    }

    public Rcrapp1__1 withChildSupp(Double childSupp) {
        this.childSupp = childSupp;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_PHONE_NO
     * 
     */
    @JsonProperty("phoneNo")
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Lineage reference object : RCRAPP1_PHONE_NO
     * 
     */
    @JsonProperty("phoneNo")
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Rcrapp1__1 withPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    /**
     * Parent 2
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MothSsnMatch")
    public String getRcrapp3MothSsnMatch() {
        return rcrapp3MothSsnMatch;
    }

    /**
     * Parent 2
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MothSsnMatch")
    public void setRcrapp3MothSsnMatch(String rcrapp3MothSsnMatch) {
        this.rcrapp3MothSsnMatch = rcrapp3MothSsnMatch;
    }

    public Rcrapp1__1 withRcrapp3MothSsnMatch(String rcrapp3MothSsnMatch) {
        this.rcrapp3MothSsnMatch = rcrapp3MothSsnMatch;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_US_INC_TAX_PD
     * 
     */
    @JsonProperty("usIncTaxPd")
    public Double getUsIncTaxPd() {
        return usIncTaxPd;
    }

    /**
     * Lineage reference object : RCRAPP1_US_INC_TAX_PD
     * 
     */
    @JsonProperty("usIncTaxPd")
    public void setUsIncTaxPd(Double usIncTaxPd) {
        this.usIncTaxPd = usIncTaxPd;
    }

    public Rcrapp1__1 withUsIncTaxPd(Double usIncTaxPd) {
        this.usIncTaxPd = usIncTaxPd;
        return this;
    }

    /**
     * Federal School Code Choice 4
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice4")
    public String getRcrapp3FedCollChoice4() {
        return rcrapp3FedCollChoice4;
    }

    /**
     * Federal School Code Choice 4
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice4")
    public void setRcrapp3FedCollChoice4(String rcrapp3FedCollChoice4) {
        this.rcrapp3FedCollChoice4 = rcrapp3FedCollChoice4;
    }

    public Rcrapp1__1 withRcrapp3FedCollChoice4(String rcrapp3FedCollChoice4) {
        this.rcrapp3FedCollChoice4 = rcrapp3FedCollChoice4;
        return this;
    }

    /**
     * Federal School Code Choice 5
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice5")
    public String getRcrapp3FedCollChoice5() {
        return rcrapp3FedCollChoice5;
    }

    /**
     * Federal School Code Choice 5
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice5")
    public void setRcrapp3FedCollChoice5(String rcrapp3FedCollChoice5) {
        this.rcrapp3FedCollChoice5 = rcrapp3FedCollChoice5;
    }

    public Rcrapp1__1 withRcrapp3FedCollChoice5(String rcrapp3FedCollChoice5) {
        this.rcrapp3FedCollChoice5 = rcrapp3FedCollChoice5;
        return this;
    }

    /**
     * Record Last Updated
     * <p>
     * 
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Record Last Updated
     * <p>
     * 
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Rcrapp1__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Federal School Code Choice 1
     * <p>
     * Lineage reference object : RCRAPP1_FED_COLL_CHOICE_1
     * 
     */
    @JsonProperty("fedCollChoice1")
    public String getFedCollChoice1() {
        return fedCollChoice1;
    }

    /**
     * Federal School Code Choice 1
     * <p>
     * Lineage reference object : RCRAPP1_FED_COLL_CHOICE_1
     * 
     */
    @JsonProperty("fedCollChoice1")
    public void setFedCollChoice1(String fedCollChoice1) {
        this.fedCollChoice1 = fedCollChoice1;
    }

    public Rcrapp1__1 withFedCollChoice1(String fedCollChoice1) {
        this.fedCollChoice1 = fedCollChoice1;
        return this;
    }

    /**
     * Federal School Code Choice 6
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice6")
    public String getRcrapp3FedCollChoice6() {
        return rcrapp3FedCollChoice6;
    }

    /**
     * Federal School Code Choice 6
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice6")
    public void setRcrapp3FedCollChoice6(String rcrapp3FedCollChoice6) {
        this.rcrapp3FedCollChoice6 = rcrapp3FedCollChoice6;
    }

    public Rcrapp1__1 withRcrapp3FedCollChoice6(String rcrapp3FedCollChoice6) {
        this.rcrapp3FedCollChoice6 = rcrapp3FedCollChoice6;
        return this;
    }

    /**
     * Grant and Scholarship Aid
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParGrantScholarAid")
    public Double getRcrapp3ParGrantScholarAid() {
        return rcrapp3ParGrantScholarAid;
    }

    /**
     * Grant and Scholarship Aid
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParGrantScholarAid")
    public void setRcrapp3ParGrantScholarAid(Double rcrapp3ParGrantScholarAid) {
        this.rcrapp3ParGrantScholarAid = rcrapp3ParGrantScholarAid;
    }

    public Rcrapp1__1 withRcrapp3ParGrantScholarAid(Double rcrapp3ParGrantScholarAid) {
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

    public Rcrapp1__1 withDisplayVerificationPrtyDesc(String displayVerificationPrtyDesc) {
        this.displayVerificationPrtyDesc = displayVerificationPrtyDesc;
        return this;
    }

    /**
     * Student IRS FIT Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsFitFlag")
    public String getRcrapp3IrsFitFlag() {
        return rcrapp3IrsFitFlag;
    }

    /**
     * Student IRS FIT Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsFitFlag")
    public void setRcrapp3IrsFitFlag(String rcrapp3IrsFitFlag) {
        this.rcrapp3IrsFitFlag = rcrapp3IrsFitFlag;
    }

    public Rcrapp1__1 withRcrapp3IrsFitFlag(String rcrapp3IrsFitFlag) {
        this.rcrapp3IrsFitFlag = rcrapp3IrsFitFlag;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_UNTAX_PENSIONS
     * 
     */
    @JsonProperty("untaxPensions")
    public Double getUntaxPensions() {
        return untaxPensions;
    }

    /**
     * Lineage reference object : RCRAPP1_UNTAX_PENSIONS
     * 
     */
    @JsonProperty("untaxPensions")
    public void setUntaxPensions(Double untaxPensions) {
        this.untaxPensions = untaxPensions;
    }

    public Rcrapp1__1 withUntaxPensions(Double untaxPensions) {
        this.untaxPensions = untaxPensions;
        return this;
    }

    /**
     * Paid Preparer's Employee Identification Number
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3PreparerEin")
    public String getRcrapp3PreparerEin() {
        return rcrapp3PreparerEin;
    }

    /**
     * Paid Preparer's Employee Identification Number
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3PreparerEin")
    public void setRcrapp3PreparerEin(String rcrapp3PreparerEin) {
        this.rcrapp3PreparerEin = rcrapp3PreparerEin;
    }

    public Rcrapp1__1 withRcrapp3PreparerEin(String rcrapp3PreparerEin) {
        this.rcrapp3PreparerEin = rcrapp3PreparerEin;
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

    public Rcrapp1__1 withRcrapp3ChildSuppPaid(Double rcrapp3ChildSuppPaid) {
        this.rcrapp3ChildSuppPaid = rcrapp3ChildSuppPaid;
        return this;
    }

    /**
     * Federal School Code Choice 7
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice7")
    public String getRcrapp3FedCollChoice7() {
        return rcrapp3FedCollChoice7;
    }

    /**
     * Federal School Code Choice 7
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice7")
    public void setRcrapp3FedCollChoice7(String rcrapp3FedCollChoice7) {
        this.rcrapp3FedCollChoice7 = rcrapp3FedCollChoice7;
    }

    public Rcrapp1__1 withRcrapp3FedCollChoice7(String rcrapp3FedCollChoice7) {
        this.rcrapp3FedCollChoice7 = rcrapp3FedCollChoice7;
        return this;
    }

    @JsonProperty("displaySResDateYr")
    public Double getDisplaySResDateYr() {
        return displaySResDateYr;
    }

    @JsonProperty("displaySResDateYr")
    public void setDisplaySResDateYr(Double displaySResDateYr) {
        this.displaySResDateYr = displaySResDateYr;
    }

    public Rcrapp1__1 withDisplaySResDateYr(Double displaySResDateYr) {
        this.displaySResDateYr = displaySResDateYr;
        return this;
    }

    /**
     * Federal School Code Choice 8
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice8")
    public String getRcrapp3FedCollChoice8() {
        return rcrapp3FedCollChoice8;
    }

    /**
     * Federal School Code Choice 8
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice8")
    public void setRcrapp3FedCollChoice8(String rcrapp3FedCollChoice8) {
        this.rcrapp3FedCollChoice8 = rcrapp3FedCollChoice8;
    }

    public Rcrapp1__1 withRcrapp3FedCollChoice8(String rcrapp3FedCollChoice8) {
        this.rcrapp3FedCollChoice8 = rcrapp3FedCollChoice8;
        return this;
    }

    /**
     * First Initial
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathFirstNameIni")
    public String getRcrapp4FathFirstNameIni() {
        return rcrapp4FathFirstNameIni;
    }

    /**
     * First Initial
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathFirstNameIni")
    public void setRcrapp4FathFirstNameIni(String rcrapp4FathFirstNameIni) {
        this.rcrapp4FathFirstNameIni = rcrapp4FathFirstNameIni;
    }

    public Rcrapp1__1 withRcrapp4FathFirstNameIni(String rcrapp4FathFirstNameIni) {
        this.rcrapp4FathFirstNameIni = rcrapp4FathFirstNameIni;
        return this;
    }

    /**
     * Federal School Code Choice 9
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice9")
    public String getRcrapp3FedCollChoice9() {
        return rcrapp3FedCollChoice9;
    }

    /**
     * Federal School Code Choice 9
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice9")
    public void setRcrapp3FedCollChoice9(String rcrapp3FedCollChoice9) {
        this.rcrapp3FedCollChoice9 = rcrapp3FedCollChoice9;
    }

    public Rcrapp1__1 withRcrapp3FedCollChoice9(String rcrapp3FedCollChoice9) {
        this.rcrapp3FedCollChoice9 = rcrapp3FedCollChoice9;
        return this;
    }

    /**
     * Special Circumstances Performed
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SpecCircumFlg")
    public String getRcrapp3SpecCircumFlg() {
        return rcrapp3SpecCircumFlg;
    }

    /**
     * Special Circumstances Performed
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SpecCircumFlg")
    public void setRcrapp3SpecCircumFlg(String rcrapp3SpecCircumFlg) {
        this.rcrapp3SpecCircumFlg = rcrapp3SpecCircumFlg;
    }

    public Rcrapp1__1 withRcrapp3SpecCircumFlg(String rcrapp3SpecCircumFlg) {
        this.rcrapp3SpecCircumFlg = rcrapp3SpecCircumFlg;
        return this;
    }

    /**
     * Record Created
     * <p>
     * Lineage reference object : RCRAPP1_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Record Created
     * <p>
     * Lineage reference object : RCRAPP1_CREATE_DATE
     * 
     */
    @JsonProperty("createDate")
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Rcrapp1__1 withCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Date of Status
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SMarMthYr")
    public String getRcrapp3SMarMthYr() {
        return rcrapp3SMarMthYr;
    }

    /**
     * Date of Status
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SMarMthYr")
    public void setRcrapp3SMarMthYr(String rcrapp3SMarMthYr) {
        this.rcrapp3SMarMthYr = rcrapp3SMarMthYr;
    }

    public Rcrapp1__1 withRcrapp3SMarMthYr(String rcrapp3SMarMthYr) {
        this.rcrapp3SMarMthYr = rcrapp3SMarMthYr;
        return this;
    }

    /**
     * Preparer's Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3PreparerSign")
    public String getRcrapp3PreparerSign() {
        return rcrapp3PreparerSign;
    }

    /**
     * Preparer's Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3PreparerSign")
    public void setRcrapp3PreparerSign(String rcrapp3PreparerSign) {
        this.rcrapp3PreparerSign = rcrapp3PreparerSign;
    }

    public Rcrapp1__1 withRcrapp3PreparerSign(String rcrapp3PreparerSign) {
        this.rcrapp3PreparerSign = rcrapp3PreparerSign;
        return this;
    }

    /**
     * Parent IRS Display Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsDisplayFlag")
    public String getRcrapp3ParIrsDisplayFlag() {
        return rcrapp3ParIrsDisplayFlag;
    }

    /**
     * Parent IRS Display Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsDisplayFlag")
    public void setRcrapp3ParIrsDisplayFlag(String rcrapp3ParIrsDisplayFlag) {
        this.rcrapp3ParIrsDisplayFlag = rcrapp3ParIrsDisplayFlag;
    }

    public Rcrapp1__1 withRcrapp3ParIrsDisplayFlag(String rcrapp3ParIrsDisplayFlag) {
        this.rcrapp3ParIrsDisplayFlag = rcrapp3ParIrsDisplayFlag;
        return this;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathSsn")
    public String getRcrapp4FathSsn() {
        return rcrapp4FathSsn;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathSsn")
    public void setRcrapp4FathSsn(String rcrapp4FathSsn) {
        this.rcrapp4FathSsn = rcrapp4FathSsn;
    }

    public Rcrapp1__1 withRcrapp4FathSsn(String rcrapp4FathSsn) {
        this.rcrapp4FathSsn = rcrapp4FathSsn;
        return this;
    }

    /**
     * Parent IRS AGI Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsAgiFlag")
    public String getRcrapp3ParIrsAgiFlag() {
        return rcrapp3ParIrsAgiFlag;
    }

    /**
     * Parent IRS AGI Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsAgiFlag")
    public void setRcrapp3ParIrsAgiFlag(String rcrapp3ParIrsAgiFlag) {
        this.rcrapp3ParIrsAgiFlag = rcrapp3ParIrsAgiFlag;
    }

    public Rcrapp1__1 withRcrapp3ParIrsAgiFlag(String rcrapp3ParIrsAgiFlag) {
        this.rcrapp3ParIrsAgiFlag = rcrapp3ParIrsAgiFlag;
        return this;
    }

    /**
     * Permit Selective Service Registration
     * <p>
     * Lineage reference object : RCRAPP1_PERMIT_DRAFT_REG
     * 
     */
    @JsonProperty("permitDraftReg")
    public String getPermitDraftReg() {
        return permitDraftReg;
    }

    /**
     * Permit Selective Service Registration
     * <p>
     * Lineage reference object : RCRAPP1_PERMIT_DRAFT_REG
     * 
     */
    @JsonProperty("permitDraftReg")
    public void setPermitDraftReg(String permitDraftReg) {
        this.permitDraftReg = permitDraftReg;
    }

    public Rcrapp1__1 withPermitDraftReg(String permitDraftReg) {
        this.permitDraftReg = permitDraftReg;
        return this;
    }

    /**
     * Aid Eligibility Response or Drug Offense Conviction
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DrugOffenseConvic")
    public String getRcrapp4DrugOffenseConvic() {
        return rcrapp4DrugOffenseConvic;
    }

    /**
     * Aid Eligibility Response or Drug Offense Conviction
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DrugOffenseConvic")
    public void setRcrapp4DrugOffenseConvic(String rcrapp4DrugOffenseConvic) {
        this.rcrapp4DrugOffenseConvic = rcrapp4DrugOffenseConvic;
    }

    public Rcrapp1__1 withRcrapp4DrugOffenseConvic(String rcrapp4DrugOffenseConvic) {
        this.rcrapp4DrugOffenseConvic = rcrapp4DrugOffenseConvic;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_RECD_TANF
     * 
     */
    @JsonProperty("recdTanf")
    public String getRecdTanf() {
        return recdTanf;
    }

    /**
     * Lineage reference object : RCRAPP1_RECD_TANF
     * 
     */
    @JsonProperty("recdTanf")
    public void setRecdTanf(String recdTanf) {
        this.recdTanf = recdTanf;
    }

    public Rcrapp1__1 withRecdTanf(String recdTanf) {
        this.recdTanf = recdTanf;
        return this;
    }

    @JsonProperty("rcrapp4SAssetThreshExcd")
    public String getRcrapp4SAssetThreshExcd() {
        return rcrapp4SAssetThreshExcd;
    }

    @JsonProperty("rcrapp4SAssetThreshExcd")
    public void setRcrapp4SAssetThreshExcd(String rcrapp4SAssetThreshExcd) {
        this.rcrapp4SAssetThreshExcd = rcrapp4SAssetThreshExcd;
    }

    public Rcrapp1__1 withRcrapp4SAssetThreshExcd(String rcrapp4SAssetThreshExcd) {
        this.rcrapp4SAssetThreshExcd = rcrapp4SAssetThreshExcd;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolCity")
    public String getRcrapp4HighSchoolCity() {
        return rcrapp4HighSchoolCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolCity")
    public void setRcrapp4HighSchoolCity(String rcrapp4HighSchoolCity) {
        this.rcrapp4HighSchoolCity = rcrapp4HighSchoolCity;
    }

    public Rcrapp1__1 withRcrapp4HighSchoolCity(String rcrapp4HighSchoolCity) {
        this.rcrapp4HighSchoolCity = rcrapp4HighSchoolCity;
        return this;
    }

    /**
     * Federal School Code Choice 2
     * <p>
     * Lineage reference object : RCRAPP1_FED_COLL_CHOICE_2
     * 
     */
    @JsonProperty("fedCollChoice2")
    public String getFedCollChoice2() {
        return fedCollChoice2;
    }

    /**
     * Federal School Code Choice 2
     * <p>
     * Lineage reference object : RCRAPP1_FED_COLL_CHOICE_2
     * 
     */
    @JsonProperty("fedCollChoice2")
    public void setFedCollChoice2(String fedCollChoice2) {
        this.fedCollChoice2 = fedCollChoice2;
    }

    public Rcrapp1__1 withFedCollChoice2(String fedCollChoice2) {
        this.fedCollChoice2 = fedCollChoice2;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_VETS_NON_ED_BEN
     * 
     */
    @JsonProperty("vetsNonEdBen")
    public Double getVetsNonEdBen() {
        return vetsNonEdBen;
    }

    /**
     * Lineage reference object : RCRAPP1_VETS_NON_ED_BEN
     * 
     */
    @JsonProperty("vetsNonEdBen")
    public void setVetsNonEdBen(Double vetsNonEdBen) {
        this.vetsNonEdBen = vetsNonEdBen;
    }

    public Rcrapp1__1 withVetsNonEdBen(Double vetsNonEdBen) {
        this.vetsNonEdBen = vetsNonEdBen;
        return this;
    }

    /**
     * Federal School Code Choice 3
     * <p>
     * Lineage reference object : RCRAPP1_FED_COLL_CHOICE_3
     * 
     */
    @JsonProperty("fedCollChoice3")
    public String getFedCollChoice3() {
        return fedCollChoice3;
    }

    /**
     * Federal School Code Choice 3
     * <p>
     * Lineage reference object : RCRAPP1_FED_COLL_CHOICE_3
     * 
     */
    @JsonProperty("fedCollChoice3")
    public void setFedCollChoice3(String fedCollChoice3) {
        this.fedCollChoice3 = fedCollChoice3;
    }

    public Rcrapp1__1 withFedCollChoice3(String fedCollChoice3) {
        this.fedCollChoice3 = fedCollChoice3;
        return this;
    }

    /**
     * Updated By
     * <p>
     * 
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Updated By
     * <p>
     * 
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Rcrapp1__1 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Tax Filing Status
     * <p>
     * Lineage reference object : RCRAPP1_PAR_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("parTaxFilingStatus")
    public String getParTaxFilingStatus() {
        return parTaxFilingStatus;
    }

    /**
     * Tax Filing Status
     * <p>
     * Lineage reference object : RCRAPP1_PAR_TAX_FILING_STATUS
     * 
     */
    @JsonProperty("parTaxFilingStatus")
    public void setParTaxFilingStatus(String parTaxFilingStatus) {
        this.parTaxFilingStatus = parTaxFilingStatus;
    }

    public Rcrapp1__1 withParTaxFilingStatus(String parTaxFilingStatus) {
        this.parTaxFilingStatus = parTaxFilingStatus;
        return this;
    }

    /**
     * SNAP (Food Stamps)
     * <p>
     * Lineage reference object : RCRAPP1_PAR_FOOD_STAMPS
     * 
     */
    @JsonProperty("parFoodStamps")
    public String getParFoodStamps() {
        return parFoodStamps;
    }

    /**
     * SNAP (Food Stamps)
     * <p>
     * Lineage reference object : RCRAPP1_PAR_FOOD_STAMPS
     * 
     */
    @JsonProperty("parFoodStamps")
    public void setParFoodStamps(String parFoodStamps) {
        this.parFoodStamps = parFoodStamps;
    }

    public Rcrapp1__1 withParFoodStamps(String parFoodStamps) {
        this.parFoodStamps = parFoodStamps;
        return this;
    }

    /**
     * Wages (Parent 1 and Student)
     * <p>
     * Lineage reference object : RCRAPP1_FATH_INC_FR_WRK
     * 
     */
    @JsonProperty("fathIncFrWrk")
    public Double getFathIncFrWrk() {
        return fathIncFrWrk;
    }

    /**
     * Wages (Parent 1 and Student)
     * <p>
     * Lineage reference object : RCRAPP1_FATH_INC_FR_WRK
     * 
     */
    @JsonProperty("fathIncFrWrk")
    public void setFathIncFrWrk(Double fathIncFrWrk) {
        this.fathIncFrWrk = fathIncFrWrk;
    }

    public Rcrapp1__1 withFathIncFrWrk(Double fathIncFrWrk) {
        this.fathIncFrWrk = fathIncFrWrk;
        return this;
    }

    /**
     * TANF
     * <p>
     * Lineage reference object : RCRAPP1_PAR_RECD_TANF
     * 
     */
    @JsonProperty("parRecdTanf")
    public String getParRecdTanf() {
        return parRecdTanf;
    }

    /**
     * TANF
     * <p>
     * Lineage reference object : RCRAPP1_PAR_RECD_TANF
     * 
     */
    @JsonProperty("parRecdTanf")
    public void setParRecdTanf(String parRecdTanf) {
        this.parRecdTanf = parRecdTanf;
    }

    public Rcrapp1__1 withParRecdTanf(String parRecdTanf) {
        this.parRecdTanf = parRecdTanf;
        return this;
    }

    /**
     * WIC
     * <p>
     * Lineage reference object : RCRAPP1_PAR_RECD_WIC
     * 
     */
    @JsonProperty("parRecdWic")
    public String getParRecdWic() {
        return parRecdWic;
    }

    /**
     * WIC
     * <p>
     * Lineage reference object : RCRAPP1_PAR_RECD_WIC
     * 
     */
    @JsonProperty("parRecdWic")
    public void setParRecdWic(String parRecdWic) {
        this.parRecdWic = parRecdWic;
    }

    public Rcrapp1__1 withParRecdWic(String parRecdWic) {
        this.parRecdWic = parRecdWic;
        return this;
    }

    @JsonProperty("rcrapp4MothLastName")
    public String getRcrapp4MothLastName() {
        return rcrapp4MothLastName;
    }

    @JsonProperty("rcrapp4MothLastName")
    public void setRcrapp4MothLastName(String rcrapp4MothLastName) {
        this.rcrapp4MothLastName = rcrapp4MothLastName;
    }

    public Rcrapp1__1 withRcrapp4MothLastName(String rcrapp4MothLastName) {
        this.rcrapp4MothLastName = rcrapp4MothLastName;
        return this;
    }

    /**
     * Interested in Work-Study
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4WrkStdyLoansInt")
    public String getRcrapp4WrkStdyLoansInt() {
        return rcrapp4WrkStdyLoansInt;
    }

    /**
     * Interested in Work-Study
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4WrkStdyLoansInt")
    public void setRcrapp4WrkStdyLoansInt(String rcrapp4WrkStdyLoansInt) {
        this.rcrapp4WrkStdyLoansInt = rcrapp4WrkStdyLoansInt;
    }

    public Rcrapp1__1 withRcrapp4WrkStdyLoansInt(String rcrapp4WrkStdyLoansInt) {
        this.rcrapp4WrkStdyLoansInt = rcrapp4WrkStdyLoansInt;
        return this;
    }

    /**
     * Income Taxes Paid
     * <p>
     * Lineage reference object : RCRAPP1_PAR_US_INC_TAX_PD
     * 
     */
    @JsonProperty("parUsIncTaxPd")
    public Double getParUsIncTaxPd() {
        return parUsIncTaxPd;
    }

    /**
     * Income Taxes Paid
     * <p>
     * Lineage reference object : RCRAPP1_PAR_US_INC_TAX_PD
     * 
     */
    @JsonProperty("parUsIncTaxPd")
    public void setParUsIncTaxPd(Double parUsIncTaxPd) {
        this.parUsIncTaxPd = parUsIncTaxPd;
    }

    public Rcrapp1__1 withParUsIncTaxPd(Double parUsIncTaxPd) {
        this.parUsIncTaxPd = parUsIncTaxPd;
        return this;
    }

    /**
     * Degree or Certificate
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3DegreeType")
    public String getRcrapp3DegreeType() {
        return rcrapp3DegreeType;
    }

    /**
     * Degree or Certificate
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3DegreeType")
    public void setRcrapp3DegreeType(String rcrapp3DegreeType) {
        this.rcrapp3DegreeType = rcrapp3DegreeType;
    }

    public Rcrapp1__1 withRcrapp3DegreeType(String rcrapp3DegreeType) {
        this.rcrapp3DegreeType = rcrapp3DegreeType;
        return this;
    }

    /**
     * Veteran of U.S. Armed Forces
     * <p>
     * Lineage reference object : RCRAPP1_US_VET
     * 
     */
    @JsonProperty("usVet")
    public String getUsVet() {
        return usVet;
    }

    /**
     * Veteran of U.S. Armed Forces
     * <p>
     * Lineage reference object : RCRAPP1_US_VET
     * 
     */
    @JsonProperty("usVet")
    public void setUsVet(String usVet) {
        this.usVet = usVet;
    }

    public Rcrapp1__1 withUsVet(String usVet) {
        this.usVet = usVet;
        return this;
    }

    /**
     * Married
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3Married")
    public String getRcrapp3Married() {
        return rcrapp3Married;
    }

    /**
     * Married
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3Married")
    public void setRcrapp3Married(String rcrapp3Married) {
        this.rcrapp3Married = rcrapp3Married;
    }

    public Rcrapp1__1 withRcrapp3Married(String rcrapp3Married) {
        this.rcrapp3Married = rcrapp3Married;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_IRA_DISTRIBUTIONS
     * 
     */
    @JsonProperty("iraDistributions")
    public Double getIraDistributions() {
        return iraDistributions;
    }

    /**
     * Lineage reference object : RCRAPP1_IRA_DISTRIBUTIONS
     * 
     */
    @JsonProperty("iraDistributions")
    public void setIraDistributions(Double iraDistributions) {
        this.iraDistributions = iraDistributions;
    }

    public Rcrapp1__1 withIraDistributions(Double iraDistributions) {
        this.iraDistributions = iraDistributions;
        return this;
    }

    /**
     * Year in College
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3YrInColl2")
    public String getRcrapp3YrInColl2() {
        return rcrapp3YrInColl2;
    }

    /**
     * Year in College
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3YrInColl2")
    public void setRcrapp3YrInColl2(String rcrapp3YrInColl2) {
        this.rcrapp3YrInColl2 = rcrapp3YrInColl2;
    }

    public Rcrapp1__1 withRcrapp3YrInColl2(String rcrapp3YrInColl2) {
        this.rcrapp3YrInColl2 = rcrapp3YrInColl2;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_CASH_AMT
     * 
     */
    @JsonProperty("cashAmt")
    public Double getCashAmt() {
        return cashAmt;
    }

    /**
     * Lineage reference object : RCRAPP1_CASH_AMT
     * 
     */
    @JsonProperty("cashAmt")
    public void setCashAmt(Double cashAmt) {
        this.cashAmt = cashAmt;
    }

    public Rcrapp1__1 withCashAmt(Double cashAmt) {
        this.cashAmt = cashAmt;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_NO_IN_COLL
     * 
     */
    @JsonProperty("noInColl")
    public Double getNoInColl() {
        return noInColl;
    }

    /**
     * Lineage reference object : RCRAPP1_NO_IN_COLL
     * 
     */
    @JsonProperty("noInColl")
    public void setNoInColl(Double noInColl) {
        this.noInColl = noInColl;
    }

    public Rcrapp1__1 withNoInColl(Double noInColl) {
        this.noInColl = noInColl;
        return this;
    }

    /**
     * Graduate or Professional
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3GradOrProf")
    public String getRcrapp3GradOrProf() {
        return rcrapp3GradOrProf;
    }

    /**
     * Graduate or Professional
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3GradOrProf")
    public void setRcrapp3GradOrProf(String rcrapp3GradOrProf) {
        this.rcrapp3GradOrProf = rcrapp3GradOrProf;
    }

    public Rcrapp1__1 withRcrapp3GradOrProf(String rcrapp3GradOrProf) {
        this.rcrapp3GradOrProf = rcrapp3GradOrProf;
        return this;
    }

    /**
     * Family Members/ In College
     * <p>
     * Lineage reference object : RCRAPP1_PAR_FAM_MEMB
     * 
     */
    @JsonProperty("parFamMemb")
    public Double getParFamMemb() {
        return parFamMemb;
    }

    /**
     * Family Members/ In College
     * <p>
     * Lineage reference object : RCRAPP1_PAR_FAM_MEMB
     * 
     */
    @JsonProperty("parFamMemb")
    public void setParFamMemb(Double parFamMemb) {
        this.parFamMemb = parFamMemb;
    }

    public Rcrapp1__1 withParFamMemb(Double parFamMemb) {
        this.parFamMemb = parFamMemb;
        return this;
    }

    /**
     * Child Support Paid
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParChildSuppPaid")
    public Double getRcrapp3ParChildSuppPaid() {
        return rcrapp3ParChildSuppPaid;
    }

    /**
     * Child Support Paid
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParChildSuppPaid")
    public void setRcrapp3ParChildSuppPaid(Double rcrapp3ParChildSuppPaid) {
        this.rcrapp3ParChildSuppPaid = rcrapp3ParChildSuppPaid;
    }

    public Rcrapp1__1 withRcrapp3ParChildSuppPaid(Double rcrapp3ParChildSuppPaid) {
        this.rcrapp3ParChildSuppPaid = rcrapp3ParChildSuppPaid;
        return this;
    }

    /**
     * Verification Group
     * <p>
     * Lineage reference object : RCRAPP1_VERIFICATION_PRTY
     * 
     */
    @JsonProperty("verificationPrty")
    public String getVerificationPrty() {
        return verificationPrty;
    }

    /**
     * Verification Group
     * <p>
     * Lineage reference object : RCRAPP1_VERIFICATION_PRTY
     * 
     */
    @JsonProperty("verificationPrty")
    public void setVerificationPrty(String verificationPrty) {
        this.verificationPrty = verificationPrty;
    }

    public Rcrapp1__1 withVerificationPrty(String verificationPrty) {
        this.verificationPrty = verificationPrty;
        return this;
    }

    /**
     * Federal School Code Choice 10
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice10")
    public String getRcrapp3FedCollChoice10() {
        return rcrapp3FedCollChoice10;
    }

    /**
     * Federal School Code Choice 10
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FedCollChoice10")
    public void setRcrapp3FedCollChoice10(String rcrapp3FedCollChoice10) {
        this.rcrapp3FedCollChoice10 = rcrapp3FedCollChoice10;
    }

    public Rcrapp1__1 withRcrapp3FedCollChoice10(String rcrapp3FedCollChoice10) {
        this.rcrapp3FedCollChoice10 = rcrapp3FedCollChoice10;
        return this;
    }

    /**
     * Number of Exemptions
     * <p>
     * Lineage reference object : RCRAPP1_PAR_NO_EXEMPT
     * 
     */
    @JsonProperty("parNoExempt")
    public Double getParNoExempt() {
        return parNoExempt;
    }

    /**
     * Number of Exemptions
     * <p>
     * Lineage reference object : RCRAPP1_PAR_NO_EXEMPT
     * 
     */
    @JsonProperty("parNoExempt")
    public void setParNoExempt(Double parNoExempt) {
        this.parNoExempt = parNoExempt;
    }

    public Rcrapp1__1 withParNoExempt(Double parNoExempt) {
        this.parNoExempt = parNoExempt;
        return this;
    }

    /**
     * Legal Residence
     * <p>
     * Lineage reference object : RCRAPP1_PAR_STAT_CODE_RES, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("parStatCodeRes")
    public String getParStatCodeRes() {
        return parStatCodeRes;
    }

    /**
     * Legal Residence
     * <p>
     * Lineage reference object : RCRAPP1_PAR_STAT_CODE_RES, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("parStatCodeRes")
    public void setParStatCodeRes(String parStatCodeRes) {
        this.parStatCodeRes = parStatCodeRes;
    }

    public Rcrapp1__1 withParStatCodeRes(String parStatCodeRes) {
        this.parStatCodeRes = parStatCodeRes;
        return this;
    }

    /**
     * Co-op Earnings
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParCoOpEarnings")
    public Double getRcrapp3ParCoOpEarnings() {
        return rcrapp3ParCoOpEarnings;
    }

    /**
     * Co-op Earnings
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParCoOpEarnings")
    public void setRcrapp3ParCoOpEarnings(Double rcrapp3ParCoOpEarnings) {
        this.rcrapp3ParCoOpEarnings = rcrapp3ParCoOpEarnings;
    }

    public Rcrapp1__1 withRcrapp3ParCoOpEarnings(Double rcrapp3ParCoOpEarnings) {
        this.rcrapp3ParCoOpEarnings = rcrapp3ParCoOpEarnings;
        return this;
    }

    /**
     * Parents' E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4PEmailAddress")
    public String getRcrapp4PEmailAddress() {
        return rcrapp4PEmailAddress;
    }

    /**
     * Parents' E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4PEmailAddress")
    public void setRcrapp4PEmailAddress(String rcrapp4PEmailAddress) {
        this.rcrapp4PEmailAddress = rcrapp4PEmailAddress;
    }

    public Rcrapp1__1 withRcrapp4PEmailAddress(String rcrapp4PEmailAddress) {
        this.rcrapp4PEmailAddress = rcrapp4PEmailAddress;
        return this;
    }

    /**
     * Investment Net Worth
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParInvNetWorth")
    public Double getRcrapp4ParInvNetWorth() {
        return rcrapp4ParInvNetWorth;
    }

    /**
     * Investment Net Worth
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParInvNetWorth")
    public void setRcrapp4ParInvNetWorth(Double rcrapp4ParInvNetWorth) {
        this.rcrapp4ParInvNetWorth = rcrapp4ParInvNetWorth;
    }

    public Rcrapp1__1 withRcrapp4ParInvNetWorth(Double rcrapp4ParInvNetWorth) {
        this.rcrapp4ParInvNetWorth = rcrapp4ParInvNetWorth;
        return this;
    }

    /**
     * Middle Initial
     * <p>
     * Lineage reference object : RCRAPP1_MI
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Initial
     * <p>
     * Lineage reference object : RCRAPP1_MI
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public Rcrapp1__1 withMi(String mi) {
        this.mi = mi;
        return this;
    }

    /**
     * Banner Year in College
     * <p>
     * Lineage reference object : RCRAPP1_YR_IN_COLL
     * 
     */
    @JsonProperty("yrInColl")
    public String getYrInColl() {
        return yrInColl;
    }

    /**
     * Banner Year in College
     * <p>
     * Lineage reference object : RCRAPP1_YR_IN_COLL
     * 
     */
    @JsonProperty("yrInColl")
    public void setYrInColl(String yrInColl) {
        this.yrInColl = yrInColl;
    }

    public Rcrapp1__1 withYrInColl(String yrInColl) {
        this.yrInColl = yrInColl;
        return this;
    }

    /**
     * Tax-Deferred Pensions
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParTaxDefPension")
    public Double getRcrapp3ParTaxDefPension() {
        return rcrapp3ParTaxDefPension;
    }

    /**
     * Tax-Deferred Pensions
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParTaxDefPension")
    public void setRcrapp3ParTaxDefPension(Double rcrapp3ParTaxDefPension) {
        this.rcrapp3ParTaxDefPension = rcrapp3ParTaxDefPension;
    }

    public Rcrapp1__1 withRcrapp3ParTaxDefPension(Double rcrapp3ParTaxDefPension) {
        this.rcrapp3ParTaxDefPension = rcrapp3ParTaxDefPension;
        return this;
    }

    /**
     * Dislocated Worker
     * <p>
     * Lineage reference object : RCRAPP1_PAR_DISL_WRK
     * 
     */
    @JsonProperty("parDislWrk")
    public String getParDislWrk() {
        return parDislWrk;
    }

    /**
     * Dislocated Worker
     * <p>
     * Lineage reference object : RCRAPP1_PAR_DISL_WRK
     * 
     */
    @JsonProperty("parDislWrk")
    public void setParDislWrk(String parDislWrk) {
        this.parDislWrk = parDislWrk;
    }

    public Rcrapp1__1 withParDislWrk(String parDislWrk) {
        this.parDislWrk = parDislWrk;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_SPS_INC_FR_WRK
     * 
     */
    @JsonProperty("spsIncFrWrk")
    public Double getSpsIncFrWrk() {
        return spsIncFrWrk;
    }

    /**
     * Lineage reference object : RCRAPP1_SPS_INC_FR_WRK
     * 
     */
    @JsonProperty("spsIncFrWrk")
    public void setSpsIncFrWrk(Double spsIncFrWrk) {
        this.spsIncFrWrk = spsIncFrWrk;
    }

    public Rcrapp1__1 withSpsIncFrWrk(Double spsIncFrWrk) {
        this.spsIncFrWrk = spsIncFrWrk;
        return this;
    }

    /**
     * Student IRS AGI Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsAgiFlag")
    public String getRcrapp3IrsAgiFlag() {
        return rcrapp3IrsAgiFlag;
    }

    /**
     * Student IRS AGI Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsAgiFlag")
    public void setRcrapp3IrsAgiFlag(String rcrapp3IrsAgiFlag) {
        this.rcrapp3IrsAgiFlag = rcrapp3IrsAgiFlag;
    }

    public Rcrapp1__1 withRcrapp3IrsAgiFlag(String rcrapp3IrsAgiFlag) {
        this.rcrapp3IrsAgiFlag = rcrapp3IrsAgiFlag;
        return this;
    }

    /**
     * Alien Registration Number
     * <p>
     * Lineage reference object : RCRAPP1_ALIEN_REG_NO
     * 
     */
    @JsonProperty("alienRegNo")
    public String getAlienRegNo() {
        return alienRegNo;
    }

    /**
     * Alien Registration Number
     * <p>
     * Lineage reference object : RCRAPP1_ALIEN_REG_NO
     * 
     */
    @JsonProperty("alienRegNo")
    public void setAlienRegNo(String alienRegNo) {
        this.alienRegNo = alienRegNo;
    }

    public Rcrapp1__1 withAlienRegNo(String alienRegNo) {
        this.alienRegNo = alienRegNo;
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

    public Rcrapp1__1 withRcrapp3CoOpEarnings(Double rcrapp3CoOpEarnings) {
        this.rcrapp3CoOpEarnings = rcrapp3CoOpEarnings;
        return this;
    }

    /**
     * Child Support Received
     * <p>
     * Lineage reference object : RCRAPP1_PAR_CHILD_SUPP
     * 
     */
    @JsonProperty("parChildSupp")
    public Double getParChildSupp() {
        return parChildSupp;
    }

    /**
     * Child Support Received
     * <p>
     * Lineage reference object : RCRAPP1_PAR_CHILD_SUPP
     * 
     */
    @JsonProperty("parChildSupp")
    public void setParChildSupp(Double parChildSupp) {
        this.parChildSupp = parChildSupp;
    }

    public Rcrapp1__1 withParChildSupp(Double parChildSupp) {
        this.parChildSupp = parChildSupp;
        return this;
    }

    /**
     * Born Before 01-JAN-1982
     * <p>
     * Lineage reference object : RCRAPP1_BORN_BEFORE_1_1_XX
     * 
     */
    @JsonProperty("bornBefore11Xx")
    public String getBornBefore11Xx() {
        return bornBefore11Xx;
    }

    /**
     * Born Before 01-JAN-1982
     * <p>
     * Lineage reference object : RCRAPP1_BORN_BEFORE_1_1_XX
     * 
     */
    @JsonProperty("bornBefore11Xx")
    public void setBornBefore11Xx(String bornBefore11Xx) {
        this.bornBefore11Xx = bornBefore11Xx;
    }

    public Rcrapp1__1 withBornBefore11Xx(String bornBefore11Xx) {
        this.bornBefore11Xx = bornBefore11Xx;
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

    public Rcrapp1__1 withRcrapp4IraKeoghAmt(Double rcrapp4IraKeoghAmt) {
        this.rcrapp4IraKeoghAmt = rcrapp4IraKeoghAmt;
        return this;
    }

    /**
     * Parent 1
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FathSsnMatch")
    public String getRcrapp3FathSsnMatch() {
        return rcrapp3FathSsnMatch;
    }

    /**
     * Parent 1
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FathSsnMatch")
    public void setRcrapp3FathSsnMatch(String rcrapp3FathSsnMatch) {
        this.rcrapp3FathSsnMatch = rcrapp3FathSsnMatch;
    }

    public Rcrapp1__1 withRcrapp3FathSsnMatch(String rcrapp3FathSsnMatch) {
        this.rcrapp3FathSsnMatch = rcrapp3FathSsnMatch;
        return this;
    }

    @JsonProperty("rcrapp4InvNetWorth")
    public Double getRcrapp4InvNetWorth() {
        return rcrapp4InvNetWorth;
    }

    @JsonProperty("rcrapp4InvNetWorth")
    public void setRcrapp4InvNetWorth(Double rcrapp4InvNetWorth) {
        this.rcrapp4InvNetWorth = rcrapp4InvNetWorth;
    }

    public Rcrapp1__1 withRcrapp4InvNetWorth(Double rcrapp4InvNetWorth) {
        this.rcrapp4InvNetWorth = rcrapp4InvNetWorth;
        return this;
    }

    /**
     * Resident Since
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPResDateMo")
    public String getDisplayPResDateMo() {
        return displayPResDateMo;
    }

    /**
     * Resident Since
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPResDateMo")
    public void setDisplayPResDateMo(String displayPResDateMo) {
        this.displayPResDateMo = displayPResDateMo;
    }

    public Rcrapp1__1 withDisplayPResDateMo(String displayPResDateMo) {
        this.displayPResDateMo = displayPResDateMo;
        return this;
    }

    /**
     * Have Children You Support
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HaveChildren")
    public String getRcrapp4HaveChildren() {
        return rcrapp4HaveChildren;
    }

    /**
     * Have Children You Support
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HaveChildren")
    public void setRcrapp4HaveChildren(String rcrapp4HaveChildren) {
        this.rcrapp4HaveChildren = rcrapp4HaveChildren;
    }

    public Rcrapp1__1 withRcrapp4HaveChildren(String rcrapp4HaveChildren) {
        this.rcrapp4HaveChildren = rcrapp4HaveChildren;
        return this;
    }

    /**
     * Other Non-Reported Money
     * <p>
     * Lineage reference object : RCRAPP1_OTH_NON_REPORT_MONEY
     * 
     */
    @JsonProperty("othNonReportMoney")
    public Double getOthNonReportMoney() {
        return othNonReportMoney;
    }

    /**
     * Other Non-Reported Money
     * <p>
     * Lineage reference object : RCRAPP1_OTH_NON_REPORT_MONEY
     * 
     */
    @JsonProperty("othNonReportMoney")
    public void setOthNonReportMoney(Double othNonReportMoney) {
        this.othNonReportMoney = othNonReportMoney;
    }

    public Rcrapp1__1 withOthNonReportMoney(Double othNonReportMoney) {
        this.othNonReportMoney = othNonReportMoney;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : RCRAPP1_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : RCRAPP1_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Rcrapp1__1 withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Received by Processor
     * <p>
     * Lineage reference object : RCRAPP1_RCPT_DATE
     * 
     */
    @JsonProperty("rcptDate")
    public Date getRcptDate() {
        return rcptDate;
    }

    /**
     * Received by Processor
     * <p>
     * Lineage reference object : RCRAPP1_RCPT_DATE
     * 
     */
    @JsonProperty("rcptDate")
    public void setRcptDate(Date rcptDate) {
        this.rcptDate = rcptDate;
    }

    public Rcrapp1__1 withRcptDate(Date rcptDate) {
        this.rcptDate = rcptDate;
        return this;
    }

    /**
     * Combat Pay
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParCombatPay")
    public Double getRcrapp4ParCombatPay() {
        return rcrapp4ParCombatPay;
    }

    /**
     * Combat Pay
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4ParCombatPay")
    public void setRcrapp4ParCombatPay(Double rcrapp4ParCombatPay) {
        this.rcrapp4ParCombatPay = rcrapp4ParCombatPay;
    }

    public Rcrapp1__1 withRcrapp4ParCombatPay(Double rcrapp4ParCombatPay) {
        this.rcrapp4ParCombatPay = rcrapp4ParCombatPay;
        return this;
    }

    /**
     * School Name
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolName")
    public String getRcrapp4HighSchoolName() {
        return rcrapp4HighSchoolName;
    }

    /**
     * School Name
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolName")
    public void setRcrapp4HighSchoolName(String rcrapp4HighSchoolName) {
        this.rcrapp4HighSchoolName = rcrapp4HighSchoolName;
    }

    public Rcrapp1__1 withRcrapp4HighSchoolName(String rcrapp4HighSchoolName) {
        this.rcrapp4HighSchoolName = rcrapp4HighSchoolName;
        return this;
    }

    /**
     * Date of Birth
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathBirthDate")
    public Date getRcrapp4FathBirthDate() {
        return rcrapp4FathBirthDate;
    }

    /**
     * Date of Birth
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4FathBirthDate")
    public void setRcrapp4FathBirthDate(Date rcrapp4FathBirthDate) {
        this.rcrapp4FathBirthDate = rcrapp4FathBirthDate;
    }

    public Rcrapp1__1 withRcrapp4FathBirthDate(Date rcrapp4FathBirthDate) {
        this.rcrapp4FathBirthDate = rcrapp4FathBirthDate;
        return this;
    }

    /**
     * Home Phone Number
     * <p>
     * Lineage reference object : RCRAPP1_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Home Phone Number
     * <p>
     * Lineage reference object : RCRAPP1_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public Rcrapp1__1 withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Medicaid or SSI
     * <p>
     * Lineage reference object : RCRAPP1_PAR_RECD_SSI
     * 
     */
    @JsonProperty("parRecdSsi")
    public String getParRecdSsi() {
        return parRecdSsi;
    }

    /**
     * Medicaid or SSI
     * <p>
     * Lineage reference object : RCRAPP1_PAR_RECD_SSI
     * 
     */
    @JsonProperty("parRecdSsi")
    public void setParRecdSsi(String parRecdSsi) {
        this.parRecdSsi = parRecdSsi;
    }

    public Rcrapp1__1 withParRecdSsi(String parRecdSsi) {
        this.parRecdSsi = parRecdSsi;
        return this;
    }

    /**
     * Date of Status
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParMarMthYr")
    public String getRcrapp3ParMarMthYr() {
        return rcrapp3ParMarMthYr;
    }

    /**
     * Date of Status
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParMarMthYr")
    public void setRcrapp3ParMarMthYr(String rcrapp3ParMarMthYr) {
        this.rcrapp3ParMarMthYr = rcrapp3ParMarMthYr;
    }

    public Rcrapp1__1 withRcrapp3ParMarMthYr(String rcrapp3ParMarMthYr) {
        this.rcrapp3ParMarMthYr = rcrapp3ParMarMthYr;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_FOOD_STAMPS
     * 
     */
    @JsonProperty("foodStamps")
    public String getFoodStamps() {
        return foodStamps;
    }

    /**
     * Lineage reference object : RCRAPP1_FOOD_STAMPS
     * 
     */
    @JsonProperty("foodStamps")
    public void setFoodStamps(String foodStamps) {
        this.foodStamps = foodStamps;
    }

    public Rcrapp1__1 withFoodStamps(String foodStamps) {
        this.foodStamps = foodStamps;
        return this;
    }

    /**
     * Legal Dependents
     * <p>
     * Lineage reference object : RCRAPP1_HAS_LEGAL_DEPEND
     * 
     */
    @JsonProperty("hasLegalDepend")
    public String getHasLegalDepend() {
        return hasLegalDepend;
    }

    /**
     * Legal Dependents
     * <p>
     * Lineage reference object : RCRAPP1_HAS_LEGAL_DEPEND
     * 
     */
    @JsonProperty("hasLegalDepend")
    public void setHasLegalDepend(String hasLegalDepend) {
        this.hasLegalDepend = hasLegalDepend;
    }

    public Rcrapp1__1 withHasLegalDepend(String hasLegalDepend) {
        this.hasLegalDepend = hasLegalDepend;
        return this;
    }

    /**
     * Parent 2
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MotherHiGrade")
    public String getRcrapp3MotherHiGrade() {
        return rcrapp3MotherHiGrade;
    }

    /**
     * Parent 2
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MotherHiGrade")
    public void setRcrapp3MotherHiGrade(String rcrapp3MotherHiGrade) {
        this.rcrapp3MotherHiGrade = rcrapp3MotherHiGrade;
    }

    public Rcrapp1__1 withRcrapp3MotherHiGrade(String rcrapp3MotherHiGrade) {
        this.rcrapp3MotherHiGrade = rcrapp3MotherHiGrade;
        return this;
    }

    /**
     * Student IRS Request
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsRequestFlag")
    public String getRcrapp3IrsRequestFlag() {
        return rcrapp3IrsRequestFlag;
    }

    /**
     * Student IRS Request
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsRequestFlag")
    public void setRcrapp3IrsRequestFlag(String rcrapp3IrsRequestFlag) {
        this.rcrapp3IrsRequestFlag = rcrapp3IrsRequestFlag;
    }

    public Rcrapp1__1 withRcrapp3IrsRequestFlag(String rcrapp3IrsRequestFlag) {
        this.rcrapp3IrsRequestFlag = rcrapp3IrsRequestFlag;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_US_INC
     * 
     */
    @JsonProperty("usInc")
    public Double getUsInc() {
        return usInc;
    }

    /**
     * Lineage reference object : RCRAPP1_US_INC
     * 
     */
    @JsonProperty("usInc")
    public void setUsInc(Double usInc) {
        this.usInc = usInc;
    }

    public Rcrapp1__1 withUsInc(Double usInc) {
        this.usInc = usInc;
        return this;
    }

    /**
     * Created By
     * <p>
     * Lineage reference object : RCRAPP1_CREATOR_ID
     * 
     */
    @JsonProperty("creatorId")
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * Created By
     * <p>
     * Lineage reference object : RCRAPP1_CREATOR_ID
     * 
     */
    @JsonProperty("creatorId")
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Rcrapp1__1 withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_TAX_FORM_IND
     * 
     */
    @JsonProperty("taxFormInd")
    public String getTaxFormInd() {
        return taxFormInd;
    }

    /**
     * Lineage reference object : RCRAPP1_TAX_FORM_IND
     * 
     */
    @JsonProperty("taxFormInd")
    public void setTaxFormInd(String taxFormInd) {
        this.taxFormInd = taxFormInd;
    }

    public Rcrapp1__1 withTaxFormInd(String taxFormInd) {
        this.taxFormInd = taxFormInd;
        return this;
    }

    /**
     * Verification
     * <p>
     * Lineage reference object : RCRAPP1_VERIFICATION_MSG
     * 
     */
    @JsonProperty("verificationMsg")
    public String getVerificationMsg() {
        return verificationMsg;
    }

    /**
     * Verification
     * <p>
     * Lineage reference object : RCRAPP1_VERIFICATION_MSG
     * 
     */
    @JsonProperty("verificationMsg")
    public void setVerificationMsg(String verificationMsg) {
        this.verificationMsg = verificationMsg;
    }

    public Rcrapp1__1 withVerificationMsg(String verificationMsg) {
        this.verificationMsg = verificationMsg;
        return this;
    }

    /**
     * Male or Female
     * <p>
     * Lineage reference object : RCRAPP1_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Male or Female
     * <p>
     * Lineage reference object : RCRAPP1_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Rcrapp1__1 withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_DISL_WRK
     * 
     */
    @JsonProperty("dislWrk")
    public String getDislWrk() {
        return dislWrk;
    }

    /**
     * Lineage reference object : RCRAPP1_DISL_WRK
     * 
     */
    @JsonProperty("dislWrk")
    public void setDislWrk(String dislWrk) {
        this.dislWrk = dislWrk;
    }

    public Rcrapp1__1 withDislWrk(String dislWrk) {
        this.dislWrk = dislWrk;
        return this;
    }

    /**
     * Parent IRS Request
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsRequestFlag")
    public String getRcrapp3ParIrsRequestFlag() {
        return rcrapp3ParIrsRequestFlag;
    }

    /**
     * Parent IRS Request
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIrsRequestFlag")
    public void setRcrapp3ParIrsRequestFlag(String rcrapp3ParIrsRequestFlag) {
        this.rcrapp3ParIrsRequestFlag = rcrapp3ParIrsRequestFlag;
    }

    public Rcrapp1__1 withRcrapp3ParIrsRequestFlag(String rcrapp3ParIrsRequestFlag) {
        this.rcrapp3ParIrsRequestFlag = rcrapp3ParIrsRequestFlag;
        return this;
    }

    /**
     * Legal Guardianship
     * <p>
     * Lineage reference object : RCRAPP1_LEGAL_GUARDIAN
     * 
     */
    @JsonProperty("legalGuardian")
    public String getLegalGuardian() {
        return legalGuardian;
    }

    /**
     * Legal Guardianship
     * <p>
     * Lineage reference object : RCRAPP1_LEGAL_GUARDIAN
     * 
     */
    @JsonProperty("legalGuardian")
    public void setLegalGuardian(String legalGuardian) {
        this.legalGuardian = legalGuardian;
    }

    public Rcrapp1__1 withLegalGuardian(String legalGuardian) {
        this.legalGuardian = legalGuardian;
        return this;
    }

    /**
     * Asset Threshold Exceeded
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4PAssetThreshExcd")
    public String getRcrapp4PAssetThreshExcd() {
        return rcrapp4PAssetThreshExcd;
    }

    /**
     * Asset Threshold Exceeded
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4PAssetThreshExcd")
    public void setRcrapp4PAssetThreshExcd(String rcrapp4PAssetThreshExcd) {
        this.rcrapp4PAssetThreshExcd = rcrapp4PAssetThreshExcd;
    }

    public Rcrapp1__1 withRcrapp4PAssetThreshExcd(String rcrapp4PAssetThreshExcd) {
        this.rcrapp4PAssetThreshExcd = rcrapp4PAssetThreshExcd;
        return this;
    }

    /**
     * IRA and Keogh Deductions
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIraKeough")
    public Double getRcrapp3ParIraKeough() {
        return rcrapp3ParIraKeough;
    }

    /**
     * IRA and Keogh Deductions
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3ParIraKeough")
    public void setRcrapp3ParIraKeough(Double rcrapp3ParIraKeough) {
        this.rcrapp3ParIraKeough = rcrapp3ParIraKeough;
    }

    public Rcrapp1__1 withRcrapp3ParIraKeough(Double rcrapp3ParIraKeough) {
        this.rcrapp3ParIraKeough = rcrapp3ParIraKeough;
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

    public Rcrapp1__1 withRcrapp3TaxDefPension(Double rcrapp3TaxDefPension) {
        this.rcrapp3TaxDefPension = rcrapp3TaxDefPension;
        return this;
    }

    /**
     * Untaxed Pensions
     * <p>
     * Lineage reference object : RCRAPP1_PAR_UNTAX_PENSIONS
     * 
     */
    @JsonProperty("parUntaxPensions")
    public Double getParUntaxPensions() {
        return parUntaxPensions;
    }

    /**
     * Untaxed Pensions
     * <p>
     * Lineage reference object : RCRAPP1_PAR_UNTAX_PENSIONS
     * 
     */
    @JsonProperty("parUntaxPensions")
    public void setParUntaxPensions(Double parUntaxPensions) {
        this.parUntaxPensions = parUntaxPensions;
    }

    public Rcrapp1__1 withParUntaxPensions(Double parUntaxPensions) {
        this.parUntaxPensions = parUntaxPensions;
        return this;
    }

    /**
     * Resident Since
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySResDateMo")
    public String getDisplaySResDateMo() {
        return displaySResDateMo;
    }

    /**
     * Resident Since
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySResDateMo")
    public void setDisplaySResDateMo(String displaySResDateMo) {
        this.displaySResDateMo = displaySResDateMo;
    }

    public Rcrapp1__1 withDisplaySResDateMo(String displaySResDateMo) {
        this.displaySResDateMo = displaySResDateMo;
        return this;
    }

    @JsonProperty("displayPResDateYr")
    public String getDisplayPResDateYr() {
        return displayPResDateYr;
    }

    @JsonProperty("displayPResDateYr")
    public void setDisplayPResDateYr(String displayPResDateYr) {
        this.displayPResDateYr = displayPResDateYr;
    }

    public Rcrapp1__1 withDisplayPResDateYr(String displayPResDateYr) {
        this.displayPResDateYr = displayPResDateYr;
        return this;
    }

    /**
     * Parents' Marital Status
     * <p>
     * Lineage reference object : RCRAPP1_PAR_MRTL_STATUS
     * 
     */
    @JsonProperty("parMrtlStatus")
    public String getParMrtlStatus() {
        return parMrtlStatus;
    }

    /**
     * Parents' Marital Status
     * <p>
     * Lineage reference object : RCRAPP1_PAR_MRTL_STATUS
     * 
     */
    @JsonProperty("parMrtlStatus")
    public void setParMrtlStatus(String parMrtlStatus) {
        this.parMrtlStatus = parMrtlStatus;
    }

    public Rcrapp1__1 withParMrtlStatus(String parMrtlStatus) {
        this.parMrtlStatus = parMrtlStatus;
        return this;
    }

    @JsonProperty("rcrapp4MothSsn")
    public String getRcrapp4MothSsn() {
        return rcrapp4MothSsn;
    }

    @JsonProperty("rcrapp4MothSsn")
    public void setRcrapp4MothSsn(String rcrapp4MothSsn) {
        this.rcrapp4MothSsn = rcrapp4MothSsn;
    }

    public Rcrapp1__1 withRcrapp4MothSsn(String rcrapp4MothSsn) {
        this.rcrapp4MothSsn = rcrapp4MothSsn;
        return this;
    }

    /**
     * Address
     * <p>
     * Lineage reference object : RCRAPP1_ADDR
     * 
     */
    @JsonProperty("addr")
    public String getAddr() {
        return addr;
    }

    /**
     * Address
     * <p>
     * Lineage reference object : RCRAPP1_ADDR
     * 
     */
    @JsonProperty("addr")
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Rcrapp1__1 withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * Lineage reference object : RCRAPP1_RECD_WIC
     * 
     */
    @JsonProperty("recdWic")
    public String getRecdWic() {
        return recdWic;
    }

    /**
     * Lineage reference object : RCRAPP1_RECD_WIC
     * 
     */
    @JsonProperty("recdWic")
    public void setRecdWic(String recdWic) {
        this.recdWic = recdWic;
    }

    public Rcrapp1__1 withRecdWic(String recdWic) {
        this.recdWic = recdWic;
        return this;
    }

    /**
     * Student IRS Display Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsDisplayFlag")
    public String getRcrapp3IrsDisplayFlag() {
        return rcrapp3IrsDisplayFlag;
    }

    /**
     * Student IRS Display Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3IrsDisplayFlag")
    public void setRcrapp3IrsDisplayFlag(String rcrapp3IrsDisplayFlag) {
        this.rcrapp3IrsDisplayFlag = rcrapp3IrsDisplayFlag;
    }

    public Rcrapp1__1 withRcrapp3IrsDisplayFlag(String rcrapp3IrsDisplayFlag) {
        this.rcrapp3IrsDisplayFlag = rcrapp3IrsDisplayFlag;
        return this;
    }

    /**
     * Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolCde")
    public String getRcrapp4HighSchoolCde() {
        return rcrapp4HighSchoolCde;
    }

    /**
     * Code
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HighSchoolCde")
    public void setRcrapp4HighSchoolCde(String rcrapp4HighSchoolCde) {
        this.rcrapp4HighSchoolCde = rcrapp4HighSchoolCde;
    }

    public Rcrapp1__1 withRcrapp4HighSchoolCde(String rcrapp4HighSchoolCde) {
        this.rcrapp4HighSchoolCde = rcrapp4HighSchoolCde;
        return this;
    }

    /**
     * State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State
     * <p>
     * Lineage reference object : RCRAPP1_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public Rcrapp1__1 withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Unaccompanied Youth by School
     * <p>
     * Lineage reference object : RCRAPP1_UNACCOMP_YOUTH_SCHOOL
     * 
     */
    @JsonProperty("unaccompYouthSchool")
    public String getUnaccompYouthSchool() {
        return unaccompYouthSchool;
    }

    /**
     * Unaccompanied Youth by School
     * <p>
     * Lineage reference object : RCRAPP1_UNACCOMP_YOUTH_SCHOOL
     * 
     */
    @JsonProperty("unaccompYouthSchool")
    public void setUnaccompYouthSchool(String unaccompYouthSchool) {
        this.unaccompYouthSchool = unaccompYouthSchool;
    }

    public Rcrapp1__1 withUnaccompYouthSchool(String unaccompYouthSchool) {
        this.unaccompYouthSchool = unaccompYouthSchool;
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

    public Rcrapp1__1 withRcrapp3EducCredits(Double rcrapp3EducCredits) {
        this.rcrapp3EducCredits = rcrapp3EducCredits;
        return this;
    }

    /**
     * Date of Birth
     * <p>
     * Lineage reference object : RCRAPP1_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Date of Birth
     * <p>
     * Lineage reference object : RCRAPP1_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Rcrapp1__1 withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * High School Diploma or Equivalent
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HsGedRcvd")
    public String getRcrapp4HsGedRcvd() {
        return rcrapp4HsGedRcvd;
    }

    /**
     * High School Diploma or Equivalent
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4HsGedRcvd")
    public void setRcrapp4HsGedRcvd(String rcrapp4HsGedRcvd) {
        this.rcrapp4HsGedRcvd = rcrapp4HsGedRcvd;
    }

    public Rcrapp1__1 withRcrapp4HsGedRcvd(String rcrapp4HsGedRcvd) {
        this.rcrapp4HsGedRcvd = rcrapp4HsGedRcvd;
        return this;
    }

    @JsonProperty("rcrapp4TxRetFiledInd")
    public String getRcrapp4TxRetFiledInd() {
        return rcrapp4TxRetFiledInd;
    }

    @JsonProperty("rcrapp4TxRetFiledInd")
    public void setRcrapp4TxRetFiledInd(String rcrapp4TxRetFiledInd) {
        this.rcrapp4TxRetFiledInd = rcrapp4TxRetFiledInd;
    }

    public Rcrapp1__1 withRcrapp4TxRetFiledInd(String rcrapp4TxRetFiledInd) {
        this.rcrapp4TxRetFiledInd = rcrapp4TxRetFiledInd;
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

    public Rcrapp1__1 withRcrapp3TeIntInc(Double rcrapp3TeIntInc) {
        this.rcrapp3TeIntInc = rcrapp3TeIntInc;
        return this;
    }

    @JsonProperty("rcrapp41040aEligInd")
    public String getRcrapp41040aEligInd() {
        return rcrapp41040aEligInd;
    }

    @JsonProperty("rcrapp41040aEligInd")
    public void setRcrapp41040aEligInd(String rcrapp41040aEligInd) {
        this.rcrapp41040aEligInd = rcrapp41040aEligInd;
    }

    public Rcrapp1__1 withRcrapp41040aEligInd(String rcrapp41040aEligInd) {
        this.rcrapp41040aEligInd = rcrapp41040aEligInd;
        return this;
    }

    /**
     * Date Application Completed
     * <p>
     * Lineage reference object : RCRAPP1_COMPLETION_DATE
     * 
     */
    @JsonProperty("completionDate")
    public Date getCompletionDate() {
        return completionDate;
    }

    /**
     * Date Application Completed
     * <p>
     * Lineage reference object : RCRAPP1_COMPLETION_DATE
     * 
     */
    @JsonProperty("completionDate")
    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Rcrapp1__1 withCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * Professional Judgment Used
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3EfcRecalcCorrReq")
    public String getRcrapp3EfcRecalcCorrReq() {
        return rcrapp3EfcRecalcCorrReq;
    }

    /**
     * Professional Judgment Used
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3EfcRecalcCorrReq")
    public void setRcrapp3EfcRecalcCorrReq(String rcrapp3EfcRecalcCorrReq) {
        this.rcrapp3EfcRecalcCorrReq = rcrapp3EfcRecalcCorrReq;
    }

    public Rcrapp1__1 withRcrapp3EfcRecalcCorrReq(String rcrapp3EfcRecalcCorrReq) {
        this.rcrapp3EfcRecalcCorrReq = rcrapp3EfcRecalcCorrReq;
        return this;
    }

    @JsonProperty("rcrapp4MothFirstNameIni")
    public String getRcrapp4MothFirstNameIni() {
        return rcrapp4MothFirstNameIni;
    }

    @JsonProperty("rcrapp4MothFirstNameIni")
    public void setRcrapp4MothFirstNameIni(String rcrapp4MothFirstNameIni) {
        this.rcrapp4MothFirstNameIni = rcrapp4MothFirstNameIni;
    }

    public Rcrapp1__1 withRcrapp4MothFirstNameIni(String rcrapp4MothFirstNameIni) {
        this.rcrapp4MothFirstNameIni = rcrapp4MothFirstNameIni;
        return this;
    }

    /**
     * Wages (Parent 2 and Spouse)
     * <p>
     * Lineage reference object : RCRAPP1_MOTH_INC_FR_WRK
     * 
     */
    @JsonProperty("mothIncFrWrk")
    public Double getMothIncFrWrk() {
        return mothIncFrWrk;
    }

    /**
     * Wages (Parent 2 and Spouse)
     * <p>
     * Lineage reference object : RCRAPP1_MOTH_INC_FR_WRK
     * 
     */
    @JsonProperty("mothIncFrWrk")
    public void setMothIncFrWrk(Double mothIncFrWrk) {
        this.mothIncFrWrk = mothIncFrWrk;
    }

    public Rcrapp1__1 withMothIncFrWrk(Double mothIncFrWrk) {
        this.mothIncFrWrk = mothIncFrWrk;
        return this;
    }

    /**
     * Free or Reduced Lunch
     * <p>
     * Lineage reference object : RCRAPP1_PAR_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("parSchoolLunch")
    public String getParSchoolLunch() {
        return parSchoolLunch;
    }

    /**
     * Free or Reduced Lunch
     * <p>
     * Lineage reference object : RCRAPP1_PAR_SCHOOL_LUNCH
     * 
     */
    @JsonProperty("parSchoolLunch")
    public void setParSchoolLunch(String parSchoolLunch) {
        this.parSchoolLunch = parSchoolLunch;
    }

    public Rcrapp1__1 withParSchoolLunch(String parSchoolLunch) {
        this.parSchoolLunch = parSchoolLunch;
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

    public Rcrapp1__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rcrapp1__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("schoolLunch");
        sb.append('=');
        sb.append(((this.schoolLunch == null)?"<null>":this.schoolLunch));
        sb.append(',');
        sb.append("citzInd");
        sb.append('=');
        sb.append(((this.citzInd == null)?"<null>":this.citzInd));
        sb.append(',');
        sb.append("parVetsNonEdBen");
        sb.append('=');
        sb.append(((this.parVetsNonEdBen == null)?"<null>":this.parVetsNonEdBen));
        sb.append(',');
        sb.append("rcrapp4FathLastName");
        sb.append('=');
        sb.append(((this.rcrapp4FathLastName == null)?"<null>":this.rcrapp4FathLastName));
        sb.append(',');
        sb.append("rcrapp3ParEducCredits");
        sb.append('=');
        sb.append(((this.rcrapp3ParEducCredits == null)?"<null>":this.rcrapp3ParEducCredits));
        sb.append(',');
        sb.append("rcrapp3PreparerSsn");
        sb.append('=');
        sb.append(((this.rcrapp3PreparerSsn == null)?"<null>":this.rcrapp3PreparerSsn));
        sb.append(',');
        sb.append("rcrapp4BusNetWorth");
        sb.append('=');
        sb.append(((this.rcrapp4BusNetWorth == null)?"<null>":this.rcrapp4BusNetWorth));
        sb.append(',');
        sb.append("incFrWrk");
        sb.append('=');
        sb.append(((this.incFrWrk == null)?"<null>":this.incFrWrk));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("displayNeedDate");
        sb.append('=');
        sb.append(((this.displayNeedDate == null)?"<null>":this.displayNeedDate));
        sb.append(',');
        sb.append("rcrapp4Par1040aEligInd");
        sb.append('=');
        sb.append(((this.rcrapp4Par1040aEligInd == null)?"<null>":this.rcrapp4Par1040aEligInd));
        sb.append(',');
        sb.append("parUsInc");
        sb.append('=');
        sb.append(((this.parUsInc == null)?"<null>":this.parUsInc));
        sb.append(',');
        sb.append("recdSsi");
        sb.append('=');
        sb.append(((this.recdSsi == null)?"<null>":this.recdSsi));
        sb.append(',');
        sb.append("parCashAmt");
        sb.append('=');
        sb.append(((this.parCashAmt == null)?"<null>":this.parCashAmt));
        sb.append(',');
        sb.append("parIraDistributions");
        sb.append('=');
        sb.append(((this.parIraDistributions == null)?"<null>":this.parIraDistributions));
        sb.append(',');
        sb.append("parNoInColl");
        sb.append('=');
        sb.append(((this.parNoInColl == null)?"<null>":this.parNoInColl));
        sb.append(',');
        sb.append("rcrapp3ParIrsFitFlag");
        sb.append('=');
        sb.append(((this.rcrapp3ParIrsFitFlag == null)?"<null>":this.rcrapp3ParIrsFitFlag));
        sb.append(',');
        sb.append("rcrapp3HouseFoodOth");
        sb.append('=');
        sb.append(((this.rcrapp3HouseFoodOth == null)?"<null>":this.rcrapp3HouseFoodOth));
        sb.append(',');
        sb.append("noExempt");
        sb.append('=');
        sb.append(((this.noExempt == null)?"<null>":this.noExempt));
        sb.append(',');
        sb.append("rcrapp3ParNeedBasedEmploy");
        sb.append('=');
        sb.append(((this.rcrapp3ParNeedBasedEmploy == null)?"<null>":this.rcrapp3ParNeedBasedEmploy));
        sb.append(',');
        sb.append("othUntaxInc");
        sb.append('=');
        sb.append(((this.othUntaxInc == null)?"<null>":this.othUntaxInc));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("rcrapp3NeedBasedEmploy");
        sb.append('=');
        sb.append(((this.rcrapp3NeedBasedEmploy == null)?"<null>":this.rcrapp3NeedBasedEmploy));
        sb.append(',');
        sb.append("rcrapp4EmailAddress");
        sb.append('=');
        sb.append(((this.rcrapp4EmailAddress == null)?"<null>":this.rcrapp4EmailAddress));
        sb.append(',');
        sb.append("rcrapp4ParLegalResInd");
        sb.append('=');
        sb.append(((this.rcrapp4ParLegalResInd == null)?"<null>":this.rcrapp4ParLegalResInd));
        sb.append(',');
        sb.append("rcrapp4CombatPay");
        sb.append('=');
        sb.append(((this.rcrapp4CombatPay == null)?"<null>":this.rcrapp4CombatPay));
        sb.append(',');
        sb.append("atRiskHomeless");
        sb.append('=');
        sb.append(((this.atRiskHomeless == null)?"<null>":this.atRiskHomeless));
        sb.append(',');
        sb.append("rcrapp4ParTxRetFiledInd");
        sb.append('=');
        sb.append(((this.rcrapp4ParTxRetFiledInd == null)?"<null>":this.rcrapp4ParTxRetFiledInd));
        sb.append(',');
        sb.append("rcrapp4ParBusNetWorth");
        sb.append('=');
        sb.append(((this.rcrapp4ParBusNetWorth == null)?"<null>":this.rcrapp4ParBusNetWorth));
        sb.append(',');
        sb.append("signed");
        sb.append('=');
        sb.append(((this.signed == null)?"<null>":this.signed));
        sb.append(',');
        sb.append("statCodeRes");
        sb.append('=');
        sb.append(((this.statCodeRes == null)?"<null>":this.statCodeRes));
        sb.append(',');
        sb.append("instHousCde");
        sb.append('=');
        sb.append(((this.instHousCde == null)?"<null>":this.instHousCde));
        sb.append(',');
        sb.append("origCompDate");
        sb.append('=');
        sb.append(((this.origCompDate == null)?"<null>":this.origCompDate));
        sb.append(',');
        sb.append("rcrapp4HighSchoolFlg");
        sb.append('=');
        sb.append(((this.rcrapp4HighSchoolFlg == null)?"<null>":this.rcrapp4HighSchoolFlg));
        sb.append(',');
        sb.append("rcrapp4StatCodeHighSch");
        sb.append('=');
        sb.append(((this.rcrapp4StatCodeHighSch == null)?"<null>":this.rcrapp4StatCodeHighSch));
        sb.append(',');
        sb.append("statCodeLic");
        sb.append('=');
        sb.append(((this.statCodeLic == null)?"<null>":this.statCodeLic));
        sb.append(',');
        sb.append("activeDuty");
        sb.append('=');
        sb.append(((this.activeDuty == null)?"<null>":this.activeDuty));
        sb.append(',');
        sb.append("taxFilingStatus");
        sb.append('=');
        sb.append(((this.taxFilingStatus == null)?"<null>":this.taxFilingStatus));
        sb.append(',');
        sb.append("rcrapp3GrantScholarAid");
        sb.append('=');
        sb.append(((this.rcrapp3GrantScholarAid == null)?"<null>":this.rcrapp3GrantScholarAid));
        sb.append(',');
        sb.append("parTaxFormInd");
        sb.append('=');
        sb.append(((this.parTaxFormInd == null)?"<null>":this.parTaxFormInd));
        sb.append(',');
        sb.append("rcrapp3FatherHiGrade");
        sb.append('=');
        sb.append(((this.rcrapp3FatherHiGrade == null)?"<null>":this.rcrapp3FatherHiGrade));
        sb.append(',');
        sb.append("mrtlStatus");
        sb.append('=');
        sb.append(((this.mrtlStatus == null)?"<null>":this.mrtlStatus));
        sb.append(',');
        sb.append("rcrapp4LegalResInd");
        sb.append('=');
        sb.append(((this.rcrapp4LegalResInd == null)?"<null>":this.rcrapp4LegalResInd));
        sb.append(',');
        sb.append("famMemb");
        sb.append('=');
        sb.append(((this.famMemb == null)?"<null>":this.famMemb));
        sb.append(',');
        sb.append("rcrapp3ParHouseFoodOth");
        sb.append('=');
        sb.append(((this.rcrapp3ParHouseFoodOth == null)?"<null>":this.rcrapp3ParHouseFoodOth));
        sb.append(',');
        sb.append("driverLicNo");
        sb.append('=');
        sb.append(((this.driverLicNo == null)?"<null>":this.driverLicNo));
        sb.append(',');
        sb.append("rcrapp4MothBirthDate");
        sb.append('=');
        sb.append(((this.rcrapp4MothBirthDate == null)?"<null>":this.rcrapp4MothBirthDate));
        sb.append(',');
        sb.append("rcrapp3ParTeIntInc");
        sb.append('=');
        sb.append(((this.rcrapp3ParTeIntInc == null)?"<null>":this.rcrapp3ParTeIntInc));
        sb.append(',');
        sb.append("emancipatedMinor");
        sb.append('=');
        sb.append(((this.emancipatedMinor == null)?"<null>":this.emancipatedMinor));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("unaccompYouthHud");
        sb.append('=');
        sb.append(((this.unaccompYouthHud == null)?"<null>":this.unaccompYouthHud));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("degreeByJuly");
        sb.append('=');
        sb.append(((this.degreeByJuly == null)?"<null>":this.degreeByJuly));
        sb.append(',');
        sb.append("wardOfCourt");
        sb.append('=');
        sb.append(((this.wardOfCourt == null)?"<null>":this.wardOfCourt));
        sb.append(',');
        sb.append("parOthUntaxInc");
        sb.append('=');
        sb.append(((this.parOthUntaxInc == null)?"<null>":this.parOthUntaxInc));
        sb.append(',');
        sb.append("childSupp");
        sb.append('=');
        sb.append(((this.childSupp == null)?"<null>":this.childSupp));
        sb.append(',');
        sb.append("phoneNo");
        sb.append('=');
        sb.append(((this.phoneNo == null)?"<null>":this.phoneNo));
        sb.append(',');
        sb.append("rcrapp3MothSsnMatch");
        sb.append('=');
        sb.append(((this.rcrapp3MothSsnMatch == null)?"<null>":this.rcrapp3MothSsnMatch));
        sb.append(',');
        sb.append("usIncTaxPd");
        sb.append('=');
        sb.append(((this.usIncTaxPd == null)?"<null>":this.usIncTaxPd));
        sb.append(',');
        sb.append("rcrapp3FedCollChoice4");
        sb.append('=');
        sb.append(((this.rcrapp3FedCollChoice4 == null)?"<null>":this.rcrapp3FedCollChoice4));
        sb.append(',');
        sb.append("rcrapp3FedCollChoice5");
        sb.append('=');
        sb.append(((this.rcrapp3FedCollChoice5 == null)?"<null>":this.rcrapp3FedCollChoice5));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("fedCollChoice1");
        sb.append('=');
        sb.append(((this.fedCollChoice1 == null)?"<null>":this.fedCollChoice1));
        sb.append(',');
        sb.append("rcrapp3FedCollChoice6");
        sb.append('=');
        sb.append(((this.rcrapp3FedCollChoice6 == null)?"<null>":this.rcrapp3FedCollChoice6));
        sb.append(',');
        sb.append("rcrapp3ParGrantScholarAid");
        sb.append('=');
        sb.append(((this.rcrapp3ParGrantScholarAid == null)?"<null>":this.rcrapp3ParGrantScholarAid));
        sb.append(',');
        sb.append("displayVerificationPrtyDesc");
        sb.append('=');
        sb.append(((this.displayVerificationPrtyDesc == null)?"<null>":this.displayVerificationPrtyDesc));
        sb.append(',');
        sb.append("rcrapp3IrsFitFlag");
        sb.append('=');
        sb.append(((this.rcrapp3IrsFitFlag == null)?"<null>":this.rcrapp3IrsFitFlag));
        sb.append(',');
        sb.append("untaxPensions");
        sb.append('=');
        sb.append(((this.untaxPensions == null)?"<null>":this.untaxPensions));
        sb.append(',');
        sb.append("rcrapp3PreparerEin");
        sb.append('=');
        sb.append(((this.rcrapp3PreparerEin == null)?"<null>":this.rcrapp3PreparerEin));
        sb.append(',');
        sb.append("rcrapp3ChildSuppPaid");
        sb.append('=');
        sb.append(((this.rcrapp3ChildSuppPaid == null)?"<null>":this.rcrapp3ChildSuppPaid));
        sb.append(',');
        sb.append("rcrapp3FedCollChoice7");
        sb.append('=');
        sb.append(((this.rcrapp3FedCollChoice7 == null)?"<null>":this.rcrapp3FedCollChoice7));
        sb.append(',');
        sb.append("displaySResDateYr");
        sb.append('=');
        sb.append(((this.displaySResDateYr == null)?"<null>":this.displaySResDateYr));
        sb.append(',');
        sb.append("rcrapp3FedCollChoice8");
        sb.append('=');
        sb.append(((this.rcrapp3FedCollChoice8 == null)?"<null>":this.rcrapp3FedCollChoice8));
        sb.append(',');
        sb.append("rcrapp4FathFirstNameIni");
        sb.append('=');
        sb.append(((this.rcrapp4FathFirstNameIni == null)?"<null>":this.rcrapp4FathFirstNameIni));
        sb.append(',');
        sb.append("rcrapp3FedCollChoice9");
        sb.append('=');
        sb.append(((this.rcrapp3FedCollChoice9 == null)?"<null>":this.rcrapp3FedCollChoice9));
        sb.append(',');
        sb.append("rcrapp3SpecCircumFlg");
        sb.append('=');
        sb.append(((this.rcrapp3SpecCircumFlg == null)?"<null>":this.rcrapp3SpecCircumFlg));
        sb.append(',');
        sb.append("createDate");
        sb.append('=');
        sb.append(((this.createDate == null)?"<null>":this.createDate));
        sb.append(',');
        sb.append("rcrapp3SMarMthYr");
        sb.append('=');
        sb.append(((this.rcrapp3SMarMthYr == null)?"<null>":this.rcrapp3SMarMthYr));
        sb.append(',');
        sb.append("rcrapp3PreparerSign");
        sb.append('=');
        sb.append(((this.rcrapp3PreparerSign == null)?"<null>":this.rcrapp3PreparerSign));
        sb.append(',');
        sb.append("rcrapp3ParIrsDisplayFlag");
        sb.append('=');
        sb.append(((this.rcrapp3ParIrsDisplayFlag == null)?"<null>":this.rcrapp3ParIrsDisplayFlag));
        sb.append(',');
        sb.append("rcrapp4FathSsn");
        sb.append('=');
        sb.append(((this.rcrapp4FathSsn == null)?"<null>":this.rcrapp4FathSsn));
        sb.append(',');
        sb.append("rcrapp3ParIrsAgiFlag");
        sb.append('=');
        sb.append(((this.rcrapp3ParIrsAgiFlag == null)?"<null>":this.rcrapp3ParIrsAgiFlag));
        sb.append(',');
        sb.append("permitDraftReg");
        sb.append('=');
        sb.append(((this.permitDraftReg == null)?"<null>":this.permitDraftReg));
        sb.append(',');
        sb.append("rcrapp4DrugOffenseConvic");
        sb.append('=');
        sb.append(((this.rcrapp4DrugOffenseConvic == null)?"<null>":this.rcrapp4DrugOffenseConvic));
        sb.append(',');
        sb.append("recdTanf");
        sb.append('=');
        sb.append(((this.recdTanf == null)?"<null>":this.recdTanf));
        sb.append(',');
        sb.append("rcrapp4SAssetThreshExcd");
        sb.append('=');
        sb.append(((this.rcrapp4SAssetThreshExcd == null)?"<null>":this.rcrapp4SAssetThreshExcd));
        sb.append(',');
        sb.append("rcrapp4HighSchoolCity");
        sb.append('=');
        sb.append(((this.rcrapp4HighSchoolCity == null)?"<null>":this.rcrapp4HighSchoolCity));
        sb.append(',');
        sb.append("fedCollChoice2");
        sb.append('=');
        sb.append(((this.fedCollChoice2 == null)?"<null>":this.fedCollChoice2));
        sb.append(',');
        sb.append("vetsNonEdBen");
        sb.append('=');
        sb.append(((this.vetsNonEdBen == null)?"<null>":this.vetsNonEdBen));
        sb.append(',');
        sb.append("fedCollChoice3");
        sb.append('=');
        sb.append(((this.fedCollChoice3 == null)?"<null>":this.fedCollChoice3));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("parTaxFilingStatus");
        sb.append('=');
        sb.append(((this.parTaxFilingStatus == null)?"<null>":this.parTaxFilingStatus));
        sb.append(',');
        sb.append("parFoodStamps");
        sb.append('=');
        sb.append(((this.parFoodStamps == null)?"<null>":this.parFoodStamps));
        sb.append(',');
        sb.append("fathIncFrWrk");
        sb.append('=');
        sb.append(((this.fathIncFrWrk == null)?"<null>":this.fathIncFrWrk));
        sb.append(',');
        sb.append("parRecdTanf");
        sb.append('=');
        sb.append(((this.parRecdTanf == null)?"<null>":this.parRecdTanf));
        sb.append(',');
        sb.append("parRecdWic");
        sb.append('=');
        sb.append(((this.parRecdWic == null)?"<null>":this.parRecdWic));
        sb.append(',');
        sb.append("rcrapp4MothLastName");
        sb.append('=');
        sb.append(((this.rcrapp4MothLastName == null)?"<null>":this.rcrapp4MothLastName));
        sb.append(',');
        sb.append("rcrapp4WrkStdyLoansInt");
        sb.append('=');
        sb.append(((this.rcrapp4WrkStdyLoansInt == null)?"<null>":this.rcrapp4WrkStdyLoansInt));
        sb.append(',');
        sb.append("parUsIncTaxPd");
        sb.append('=');
        sb.append(((this.parUsIncTaxPd == null)?"<null>":this.parUsIncTaxPd));
        sb.append(',');
        sb.append("rcrapp3DegreeType");
        sb.append('=');
        sb.append(((this.rcrapp3DegreeType == null)?"<null>":this.rcrapp3DegreeType));
        sb.append(',');
        sb.append("usVet");
        sb.append('=');
        sb.append(((this.usVet == null)?"<null>":this.usVet));
        sb.append(',');
        sb.append("rcrapp3Married");
        sb.append('=');
        sb.append(((this.rcrapp3Married == null)?"<null>":this.rcrapp3Married));
        sb.append(',');
        sb.append("iraDistributions");
        sb.append('=');
        sb.append(((this.iraDistributions == null)?"<null>":this.iraDistributions));
        sb.append(',');
        sb.append("rcrapp3YrInColl2");
        sb.append('=');
        sb.append(((this.rcrapp3YrInColl2 == null)?"<null>":this.rcrapp3YrInColl2));
        sb.append(',');
        sb.append("cashAmt");
        sb.append('=');
        sb.append(((this.cashAmt == null)?"<null>":this.cashAmt));
        sb.append(',');
        sb.append("noInColl");
        sb.append('=');
        sb.append(((this.noInColl == null)?"<null>":this.noInColl));
        sb.append(',');
        sb.append("rcrapp3GradOrProf");
        sb.append('=');
        sb.append(((this.rcrapp3GradOrProf == null)?"<null>":this.rcrapp3GradOrProf));
        sb.append(',');
        sb.append("parFamMemb");
        sb.append('=');
        sb.append(((this.parFamMemb == null)?"<null>":this.parFamMemb));
        sb.append(',');
        sb.append("rcrapp3ParChildSuppPaid");
        sb.append('=');
        sb.append(((this.rcrapp3ParChildSuppPaid == null)?"<null>":this.rcrapp3ParChildSuppPaid));
        sb.append(',');
        sb.append("verificationPrty");
        sb.append('=');
        sb.append(((this.verificationPrty == null)?"<null>":this.verificationPrty));
        sb.append(',');
        sb.append("rcrapp3FedCollChoice10");
        sb.append('=');
        sb.append(((this.rcrapp3FedCollChoice10 == null)?"<null>":this.rcrapp3FedCollChoice10));
        sb.append(',');
        sb.append("parNoExempt");
        sb.append('=');
        sb.append(((this.parNoExempt == null)?"<null>":this.parNoExempt));
        sb.append(',');
        sb.append("parStatCodeRes");
        sb.append('=');
        sb.append(((this.parStatCodeRes == null)?"<null>":this.parStatCodeRes));
        sb.append(',');
        sb.append("rcrapp3ParCoOpEarnings");
        sb.append('=');
        sb.append(((this.rcrapp3ParCoOpEarnings == null)?"<null>":this.rcrapp3ParCoOpEarnings));
        sb.append(',');
        sb.append("rcrapp4PEmailAddress");
        sb.append('=');
        sb.append(((this.rcrapp4PEmailAddress == null)?"<null>":this.rcrapp4PEmailAddress));
        sb.append(',');
        sb.append("rcrapp4ParInvNetWorth");
        sb.append('=');
        sb.append(((this.rcrapp4ParInvNetWorth == null)?"<null>":this.rcrapp4ParInvNetWorth));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("yrInColl");
        sb.append('=');
        sb.append(((this.yrInColl == null)?"<null>":this.yrInColl));
        sb.append(',');
        sb.append("rcrapp3ParTaxDefPension");
        sb.append('=');
        sb.append(((this.rcrapp3ParTaxDefPension == null)?"<null>":this.rcrapp3ParTaxDefPension));
        sb.append(',');
        sb.append("parDislWrk");
        sb.append('=');
        sb.append(((this.parDislWrk == null)?"<null>":this.parDislWrk));
        sb.append(',');
        sb.append("spsIncFrWrk");
        sb.append('=');
        sb.append(((this.spsIncFrWrk == null)?"<null>":this.spsIncFrWrk));
        sb.append(',');
        sb.append("rcrapp3IrsAgiFlag");
        sb.append('=');
        sb.append(((this.rcrapp3IrsAgiFlag == null)?"<null>":this.rcrapp3IrsAgiFlag));
        sb.append(',');
        sb.append("alienRegNo");
        sb.append('=');
        sb.append(((this.alienRegNo == null)?"<null>":this.alienRegNo));
        sb.append(',');
        sb.append("rcrapp3CoOpEarnings");
        sb.append('=');
        sb.append(((this.rcrapp3CoOpEarnings == null)?"<null>":this.rcrapp3CoOpEarnings));
        sb.append(',');
        sb.append("parChildSupp");
        sb.append('=');
        sb.append(((this.parChildSupp == null)?"<null>":this.parChildSupp));
        sb.append(',');
        sb.append("bornBefore11Xx");
        sb.append('=');
        sb.append(((this.bornBefore11Xx == null)?"<null>":this.bornBefore11Xx));
        sb.append(',');
        sb.append("rcrapp4IraKeoghAmt");
        sb.append('=');
        sb.append(((this.rcrapp4IraKeoghAmt == null)?"<null>":this.rcrapp4IraKeoghAmt));
        sb.append(',');
        sb.append("rcrapp3FathSsnMatch");
        sb.append('=');
        sb.append(((this.rcrapp3FathSsnMatch == null)?"<null>":this.rcrapp3FathSsnMatch));
        sb.append(',');
        sb.append("rcrapp4InvNetWorth");
        sb.append('=');
        sb.append(((this.rcrapp4InvNetWorth == null)?"<null>":this.rcrapp4InvNetWorth));
        sb.append(',');
        sb.append("displayPResDateMo");
        sb.append('=');
        sb.append(((this.displayPResDateMo == null)?"<null>":this.displayPResDateMo));
        sb.append(',');
        sb.append("rcrapp4HaveChildren");
        sb.append('=');
        sb.append(((this.rcrapp4HaveChildren == null)?"<null>":this.rcrapp4HaveChildren));
        sb.append(',');
        sb.append("othNonReportMoney");
        sb.append('=');
        sb.append(((this.othNonReportMoney == null)?"<null>":this.othNonReportMoney));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("rcptDate");
        sb.append('=');
        sb.append(((this.rcptDate == null)?"<null>":this.rcptDate));
        sb.append(',');
        sb.append("rcrapp4ParCombatPay");
        sb.append('=');
        sb.append(((this.rcrapp4ParCombatPay == null)?"<null>":this.rcrapp4ParCombatPay));
        sb.append(',');
        sb.append("rcrapp4HighSchoolName");
        sb.append('=');
        sb.append(((this.rcrapp4HighSchoolName == null)?"<null>":this.rcrapp4HighSchoolName));
        sb.append(',');
        sb.append("rcrapp4FathBirthDate");
        sb.append('=');
        sb.append(((this.rcrapp4FathBirthDate == null)?"<null>":this.rcrapp4FathBirthDate));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("parRecdSsi");
        sb.append('=');
        sb.append(((this.parRecdSsi == null)?"<null>":this.parRecdSsi));
        sb.append(',');
        sb.append("rcrapp3ParMarMthYr");
        sb.append('=');
        sb.append(((this.rcrapp3ParMarMthYr == null)?"<null>":this.rcrapp3ParMarMthYr));
        sb.append(',');
        sb.append("foodStamps");
        sb.append('=');
        sb.append(((this.foodStamps == null)?"<null>":this.foodStamps));
        sb.append(',');
        sb.append("hasLegalDepend");
        sb.append('=');
        sb.append(((this.hasLegalDepend == null)?"<null>":this.hasLegalDepend));
        sb.append(',');
        sb.append("rcrapp3MotherHiGrade");
        sb.append('=');
        sb.append(((this.rcrapp3MotherHiGrade == null)?"<null>":this.rcrapp3MotherHiGrade));
        sb.append(',');
        sb.append("rcrapp3IrsRequestFlag");
        sb.append('=');
        sb.append(((this.rcrapp3IrsRequestFlag == null)?"<null>":this.rcrapp3IrsRequestFlag));
        sb.append(',');
        sb.append("usInc");
        sb.append('=');
        sb.append(((this.usInc == null)?"<null>":this.usInc));
        sb.append(',');
        sb.append("creatorId");
        sb.append('=');
        sb.append(((this.creatorId == null)?"<null>":this.creatorId));
        sb.append(',');
        sb.append("taxFormInd");
        sb.append('=');
        sb.append(((this.taxFormInd == null)?"<null>":this.taxFormInd));
        sb.append(',');
        sb.append("verificationMsg");
        sb.append('=');
        sb.append(((this.verificationMsg == null)?"<null>":this.verificationMsg));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("dislWrk");
        sb.append('=');
        sb.append(((this.dislWrk == null)?"<null>":this.dislWrk));
        sb.append(',');
        sb.append("rcrapp3ParIrsRequestFlag");
        sb.append('=');
        sb.append(((this.rcrapp3ParIrsRequestFlag == null)?"<null>":this.rcrapp3ParIrsRequestFlag));
        sb.append(',');
        sb.append("legalGuardian");
        sb.append('=');
        sb.append(((this.legalGuardian == null)?"<null>":this.legalGuardian));
        sb.append(',');
        sb.append("rcrapp4PAssetThreshExcd");
        sb.append('=');
        sb.append(((this.rcrapp4PAssetThreshExcd == null)?"<null>":this.rcrapp4PAssetThreshExcd));
        sb.append(',');
        sb.append("rcrapp3ParIraKeough");
        sb.append('=');
        sb.append(((this.rcrapp3ParIraKeough == null)?"<null>":this.rcrapp3ParIraKeough));
        sb.append(',');
        sb.append("rcrapp3TaxDefPension");
        sb.append('=');
        sb.append(((this.rcrapp3TaxDefPension == null)?"<null>":this.rcrapp3TaxDefPension));
        sb.append(',');
        sb.append("parUntaxPensions");
        sb.append('=');
        sb.append(((this.parUntaxPensions == null)?"<null>":this.parUntaxPensions));
        sb.append(',');
        sb.append("displaySResDateMo");
        sb.append('=');
        sb.append(((this.displaySResDateMo == null)?"<null>":this.displaySResDateMo));
        sb.append(',');
        sb.append("displayPResDateYr");
        sb.append('=');
        sb.append(((this.displayPResDateYr == null)?"<null>":this.displayPResDateYr));
        sb.append(',');
        sb.append("parMrtlStatus");
        sb.append('=');
        sb.append(((this.parMrtlStatus == null)?"<null>":this.parMrtlStatus));
        sb.append(',');
        sb.append("rcrapp4MothSsn");
        sb.append('=');
        sb.append(((this.rcrapp4MothSsn == null)?"<null>":this.rcrapp4MothSsn));
        sb.append(',');
        sb.append("addr");
        sb.append('=');
        sb.append(((this.addr == null)?"<null>":this.addr));
        sb.append(',');
        sb.append("recdWic");
        sb.append('=');
        sb.append(((this.recdWic == null)?"<null>":this.recdWic));
        sb.append(',');
        sb.append("rcrapp3IrsDisplayFlag");
        sb.append('=');
        sb.append(((this.rcrapp3IrsDisplayFlag == null)?"<null>":this.rcrapp3IrsDisplayFlag));
        sb.append(',');
        sb.append("rcrapp4HighSchoolCde");
        sb.append('=');
        sb.append(((this.rcrapp4HighSchoolCde == null)?"<null>":this.rcrapp4HighSchoolCde));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("unaccompYouthSchool");
        sb.append('=');
        sb.append(((this.unaccompYouthSchool == null)?"<null>":this.unaccompYouthSchool));
        sb.append(',');
        sb.append("rcrapp3EducCredits");
        sb.append('=');
        sb.append(((this.rcrapp3EducCredits == null)?"<null>":this.rcrapp3EducCredits));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("rcrapp4HsGedRcvd");
        sb.append('=');
        sb.append(((this.rcrapp4HsGedRcvd == null)?"<null>":this.rcrapp4HsGedRcvd));
        sb.append(',');
        sb.append("rcrapp4TxRetFiledInd");
        sb.append('=');
        sb.append(((this.rcrapp4TxRetFiledInd == null)?"<null>":this.rcrapp4TxRetFiledInd));
        sb.append(',');
        sb.append("rcrapp3TeIntInc");
        sb.append('=');
        sb.append(((this.rcrapp3TeIntInc == null)?"<null>":this.rcrapp3TeIntInc));
        sb.append(',');
        sb.append("rcrapp41040aEligInd");
        sb.append('=');
        sb.append(((this.rcrapp41040aEligInd == null)?"<null>":this.rcrapp41040aEligInd));
        sb.append(',');
        sb.append("completionDate");
        sb.append('=');
        sb.append(((this.completionDate == null)?"<null>":this.completionDate));
        sb.append(',');
        sb.append("rcrapp3EfcRecalcCorrReq");
        sb.append('=');
        sb.append(((this.rcrapp3EfcRecalcCorrReq == null)?"<null>":this.rcrapp3EfcRecalcCorrReq));
        sb.append(',');
        sb.append("rcrapp4MothFirstNameIni");
        sb.append('=');
        sb.append(((this.rcrapp4MothFirstNameIni == null)?"<null>":this.rcrapp4MothFirstNameIni));
        sb.append(',');
        sb.append("mothIncFrWrk");
        sb.append('=');
        sb.append(((this.mothIncFrWrk == null)?"<null>":this.mothIncFrWrk));
        sb.append(',');
        sb.append("parSchoolLunch");
        sb.append('=');
        sb.append(((this.parSchoolLunch == null)?"<null>":this.parSchoolLunch));
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
        result = ((result* 31)+((this.citzInd == null)? 0 :this.citzInd.hashCode()));
        result = ((result* 31)+((this.parVetsNonEdBen == null)? 0 :this.parVetsNonEdBen.hashCode()));
        result = ((result* 31)+((this.rcrapp4FathLastName == null)? 0 :this.rcrapp4FathLastName.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParEducCredits == null)? 0 :this.rcrapp3ParEducCredits.hashCode()));
        result = ((result* 31)+((this.rcrapp3PreparerSsn == null)? 0 :this.rcrapp3PreparerSsn.hashCode()));
        result = ((result* 31)+((this.rcrapp4BusNetWorth == null)? 0 :this.rcrapp4BusNetWorth.hashCode()));
        result = ((result* 31)+((this.incFrWrk == null)? 0 :this.incFrWrk.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.displayNeedDate == null)? 0 :this.displayNeedDate.hashCode()));
        result = ((result* 31)+((this.rcrapp4Par1040aEligInd == null)? 0 :this.rcrapp4Par1040aEligInd.hashCode()));
        result = ((result* 31)+((this.parUsInc == null)? 0 :this.parUsInc.hashCode()));
        result = ((result* 31)+((this.recdSsi == null)? 0 :this.recdSsi.hashCode()));
        result = ((result* 31)+((this.parCashAmt == null)? 0 :this.parCashAmt.hashCode()));
        result = ((result* 31)+((this.parIraDistributions == null)? 0 :this.parIraDistributions.hashCode()));
        result = ((result* 31)+((this.parNoInColl == null)? 0 :this.parNoInColl.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParIrsFitFlag == null)? 0 :this.rcrapp3ParIrsFitFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp3HouseFoodOth == null)? 0 :this.rcrapp3HouseFoodOth.hashCode()));
        result = ((result* 31)+((this.noExempt == null)? 0 :this.noExempt.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParNeedBasedEmploy == null)? 0 :this.rcrapp3ParNeedBasedEmploy.hashCode()));
        result = ((result* 31)+((this.othUntaxInc == null)? 0 :this.othUntaxInc.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.rcrapp3NeedBasedEmploy == null)? 0 :this.rcrapp3NeedBasedEmploy.hashCode()));
        result = ((result* 31)+((this.rcrapp4EmailAddress == null)? 0 :this.rcrapp4EmailAddress.hashCode()));
        result = ((result* 31)+((this.rcrapp4ParLegalResInd == null)? 0 :this.rcrapp4ParLegalResInd.hashCode()));
        result = ((result* 31)+((this.rcrapp4CombatPay == null)? 0 :this.rcrapp4CombatPay.hashCode()));
        result = ((result* 31)+((this.atRiskHomeless == null)? 0 :this.atRiskHomeless.hashCode()));
        result = ((result* 31)+((this.rcrapp4ParTxRetFiledInd == null)? 0 :this.rcrapp4ParTxRetFiledInd.hashCode()));
        result = ((result* 31)+((this.rcrapp4ParBusNetWorth == null)? 0 :this.rcrapp4ParBusNetWorth.hashCode()));
        result = ((result* 31)+((this.signed == null)? 0 :this.signed.hashCode()));
        result = ((result* 31)+((this.statCodeRes == null)? 0 :this.statCodeRes.hashCode()));
        result = ((result* 31)+((this.instHousCde == null)? 0 :this.instHousCde.hashCode()));
        result = ((result* 31)+((this.origCompDate == null)? 0 :this.origCompDate.hashCode()));
        result = ((result* 31)+((this.rcrapp4HighSchoolFlg == null)? 0 :this.rcrapp4HighSchoolFlg.hashCode()));
        result = ((result* 31)+((this.rcrapp4StatCodeHighSch == null)? 0 :this.rcrapp4StatCodeHighSch.hashCode()));
        result = ((result* 31)+((this.statCodeLic == null)? 0 :this.statCodeLic.hashCode()));
        result = ((result* 31)+((this.activeDuty == null)? 0 :this.activeDuty.hashCode()));
        result = ((result* 31)+((this.taxFilingStatus == null)? 0 :this.taxFilingStatus.hashCode()));
        result = ((result* 31)+((this.rcrapp3GrantScholarAid == null)? 0 :this.rcrapp3GrantScholarAid.hashCode()));
        result = ((result* 31)+((this.parTaxFormInd == null)? 0 :this.parTaxFormInd.hashCode()));
        result = ((result* 31)+((this.rcrapp3FatherHiGrade == null)? 0 :this.rcrapp3FatherHiGrade.hashCode()));
        result = ((result* 31)+((this.mrtlStatus == null)? 0 :this.mrtlStatus.hashCode()));
        result = ((result* 31)+((this.rcrapp4LegalResInd == null)? 0 :this.rcrapp4LegalResInd.hashCode()));
        result = ((result* 31)+((this.famMemb == null)? 0 :this.famMemb.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParHouseFoodOth == null)? 0 :this.rcrapp3ParHouseFoodOth.hashCode()));
        result = ((result* 31)+((this.driverLicNo == null)? 0 :this.driverLicNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rcrapp4MothBirthDate == null)? 0 :this.rcrapp4MothBirthDate.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParTeIntInc == null)? 0 :this.rcrapp3ParTeIntInc.hashCode()));
        result = ((result* 31)+((this.emancipatedMinor == null)? 0 :this.emancipatedMinor.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.unaccompYouthHud == null)? 0 :this.unaccompYouthHud.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.degreeByJuly == null)? 0 :this.degreeByJuly.hashCode()));
        result = ((result* 31)+((this.wardOfCourt == null)? 0 :this.wardOfCourt.hashCode()));
        result = ((result* 31)+((this.parOthUntaxInc == null)? 0 :this.parOthUntaxInc.hashCode()));
        result = ((result* 31)+((this.childSupp == null)? 0 :this.childSupp.hashCode()));
        result = ((result* 31)+((this.phoneNo == null)? 0 :this.phoneNo.hashCode()));
        result = ((result* 31)+((this.rcrapp3MothSsnMatch == null)? 0 :this.rcrapp3MothSsnMatch.hashCode()));
        result = ((result* 31)+((this.usIncTaxPd == null)? 0 :this.usIncTaxPd.hashCode()));
        result = ((result* 31)+((this.rcrapp3FedCollChoice4 == null)? 0 :this.rcrapp3FedCollChoice4 .hashCode()));
        result = ((result* 31)+((this.rcrapp3FedCollChoice5 == null)? 0 :this.rcrapp3FedCollChoice5 .hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.fedCollChoice1 == null)? 0 :this.fedCollChoice1 .hashCode()));
        result = ((result* 31)+((this.rcrapp3FedCollChoice6 == null)? 0 :this.rcrapp3FedCollChoice6 .hashCode()));
        result = ((result* 31)+((this.rcrapp3ParGrantScholarAid == null)? 0 :this.rcrapp3ParGrantScholarAid.hashCode()));
        result = ((result* 31)+((this.displayVerificationPrtyDesc == null)? 0 :this.displayVerificationPrtyDesc.hashCode()));
        result = ((result* 31)+((this.rcrapp3IrsFitFlag == null)? 0 :this.rcrapp3IrsFitFlag.hashCode()));
        result = ((result* 31)+((this.untaxPensions == null)? 0 :this.untaxPensions.hashCode()));
        result = ((result* 31)+((this.rcrapp3PreparerEin == null)? 0 :this.rcrapp3PreparerEin.hashCode()));
        result = ((result* 31)+((this.rcrapp3ChildSuppPaid == null)? 0 :this.rcrapp3ChildSuppPaid.hashCode()));
        result = ((result* 31)+((this.rcrapp3FedCollChoice7 == null)? 0 :this.rcrapp3FedCollChoice7 .hashCode()));
        result = ((result* 31)+((this.displaySResDateYr == null)? 0 :this.displaySResDateYr.hashCode()));
        result = ((result* 31)+((this.rcrapp3FedCollChoice8 == null)? 0 :this.rcrapp3FedCollChoice8 .hashCode()));
        result = ((result* 31)+((this.rcrapp4FathFirstNameIni == null)? 0 :this.rcrapp4FathFirstNameIni.hashCode()));
        result = ((result* 31)+((this.rcrapp3FedCollChoice9 == null)? 0 :this.rcrapp3FedCollChoice9 .hashCode()));
        result = ((result* 31)+((this.rcrapp3SpecCircumFlg == null)? 0 :this.rcrapp3SpecCircumFlg.hashCode()));
        result = ((result* 31)+((this.createDate == null)? 0 :this.createDate.hashCode()));
        result = ((result* 31)+((this.rcrapp3SMarMthYr == null)? 0 :this.rcrapp3SMarMthYr.hashCode()));
        result = ((result* 31)+((this.rcrapp3PreparerSign == null)? 0 :this.rcrapp3PreparerSign.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParIrsDisplayFlag == null)? 0 :this.rcrapp3ParIrsDisplayFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp4FathSsn == null)? 0 :this.rcrapp4FathSsn.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParIrsAgiFlag == null)? 0 :this.rcrapp3ParIrsAgiFlag.hashCode()));
        result = ((result* 31)+((this.permitDraftReg == null)? 0 :this.permitDraftReg.hashCode()));
        result = ((result* 31)+((this.rcrapp4DrugOffenseConvic == null)? 0 :this.rcrapp4DrugOffenseConvic.hashCode()));
        result = ((result* 31)+((this.recdTanf == null)? 0 :this.recdTanf.hashCode()));
        result = ((result* 31)+((this.rcrapp4SAssetThreshExcd == null)? 0 :this.rcrapp4SAssetThreshExcd.hashCode()));
        result = ((result* 31)+((this.rcrapp4HighSchoolCity == null)? 0 :this.rcrapp4HighSchoolCity.hashCode()));
        result = ((result* 31)+((this.fedCollChoice2 == null)? 0 :this.fedCollChoice2 .hashCode()));
        result = ((result* 31)+((this.vetsNonEdBen == null)? 0 :this.vetsNonEdBen.hashCode()));
        result = ((result* 31)+((this.fedCollChoice3 == null)? 0 :this.fedCollChoice3 .hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.parTaxFilingStatus == null)? 0 :this.parTaxFilingStatus.hashCode()));
        result = ((result* 31)+((this.parFoodStamps == null)? 0 :this.parFoodStamps.hashCode()));
        result = ((result* 31)+((this.fathIncFrWrk == null)? 0 :this.fathIncFrWrk.hashCode()));
        result = ((result* 31)+((this.parRecdTanf == null)? 0 :this.parRecdTanf.hashCode()));
        result = ((result* 31)+((this.parRecdWic == null)? 0 :this.parRecdWic.hashCode()));
        result = ((result* 31)+((this.rcrapp4MothLastName == null)? 0 :this.rcrapp4MothLastName.hashCode()));
        result = ((result* 31)+((this.rcrapp4WrkStdyLoansInt == null)? 0 :this.rcrapp4WrkStdyLoansInt.hashCode()));
        result = ((result* 31)+((this.parUsIncTaxPd == null)? 0 :this.parUsIncTaxPd.hashCode()));
        result = ((result* 31)+((this.rcrapp3DegreeType == null)? 0 :this.rcrapp3DegreeType.hashCode()));
        result = ((result* 31)+((this.usVet == null)? 0 :this.usVet.hashCode()));
        result = ((result* 31)+((this.rcrapp3Married == null)? 0 :this.rcrapp3Married.hashCode()));
        result = ((result* 31)+((this.iraDistributions == null)? 0 :this.iraDistributions.hashCode()));
        result = ((result* 31)+((this.rcrapp3YrInColl2 == null)? 0 :this.rcrapp3YrInColl2 .hashCode()));
        result = ((result* 31)+((this.cashAmt == null)? 0 :this.cashAmt.hashCode()));
        result = ((result* 31)+((this.noInColl == null)? 0 :this.noInColl.hashCode()));
        result = ((result* 31)+((this.rcrapp3GradOrProf == null)? 0 :this.rcrapp3GradOrProf.hashCode()));
        result = ((result* 31)+((this.parFamMemb == null)? 0 :this.parFamMemb.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParChildSuppPaid == null)? 0 :this.rcrapp3ParChildSuppPaid.hashCode()));
        result = ((result* 31)+((this.verificationPrty == null)? 0 :this.verificationPrty.hashCode()));
        result = ((result* 31)+((this.rcrapp3FedCollChoice10 == null)? 0 :this.rcrapp3FedCollChoice10 .hashCode()));
        result = ((result* 31)+((this.parNoExempt == null)? 0 :this.parNoExempt.hashCode()));
        result = ((result* 31)+((this.parStatCodeRes == null)? 0 :this.parStatCodeRes.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParCoOpEarnings == null)? 0 :this.rcrapp3ParCoOpEarnings.hashCode()));
        result = ((result* 31)+((this.rcrapp4PEmailAddress == null)? 0 :this.rcrapp4PEmailAddress.hashCode()));
        result = ((result* 31)+((this.rcrapp4ParInvNetWorth == null)? 0 :this.rcrapp4ParInvNetWorth.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.yrInColl == null)? 0 :this.yrInColl.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParTaxDefPension == null)? 0 :this.rcrapp3ParTaxDefPension.hashCode()));
        result = ((result* 31)+((this.parDislWrk == null)? 0 :this.parDislWrk.hashCode()));
        result = ((result* 31)+((this.spsIncFrWrk == null)? 0 :this.spsIncFrWrk.hashCode()));
        result = ((result* 31)+((this.rcrapp3IrsAgiFlag == null)? 0 :this.rcrapp3IrsAgiFlag.hashCode()));
        result = ((result* 31)+((this.alienRegNo == null)? 0 :this.alienRegNo.hashCode()));
        result = ((result* 31)+((this.rcrapp3CoOpEarnings == null)? 0 :this.rcrapp3CoOpEarnings.hashCode()));
        result = ((result* 31)+((this.parChildSupp == null)? 0 :this.parChildSupp.hashCode()));
        result = ((result* 31)+((this.bornBefore11Xx == null)? 0 :this.bornBefore11Xx.hashCode()));
        result = ((result* 31)+((this.rcrapp4IraKeoghAmt == null)? 0 :this.rcrapp4IraKeoghAmt.hashCode()));
        result = ((result* 31)+((this.rcrapp3FathSsnMatch == null)? 0 :this.rcrapp3FathSsnMatch.hashCode()));
        result = ((result* 31)+((this.rcrapp4InvNetWorth == null)? 0 :this.rcrapp4InvNetWorth.hashCode()));
        result = ((result* 31)+((this.displayPResDateMo == null)? 0 :this.displayPResDateMo.hashCode()));
        result = ((result* 31)+((this.rcrapp4HaveChildren == null)? 0 :this.rcrapp4HaveChildren.hashCode()));
        result = ((result* 31)+((this.othNonReportMoney == null)? 0 :this.othNonReportMoney.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.rcptDate == null)? 0 :this.rcptDate.hashCode()));
        result = ((result* 31)+((this.rcrapp4ParCombatPay == null)? 0 :this.rcrapp4ParCombatPay.hashCode()));
        result = ((result* 31)+((this.rcrapp4HighSchoolName == null)? 0 :this.rcrapp4HighSchoolName.hashCode()));
        result = ((result* 31)+((this.rcrapp4FathBirthDate == null)? 0 :this.rcrapp4FathBirthDate.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.parRecdSsi == null)? 0 :this.parRecdSsi.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParMarMthYr == null)? 0 :this.rcrapp3ParMarMthYr.hashCode()));
        result = ((result* 31)+((this.foodStamps == null)? 0 :this.foodStamps.hashCode()));
        result = ((result* 31)+((this.hasLegalDepend == null)? 0 :this.hasLegalDepend.hashCode()));
        result = ((result* 31)+((this.rcrapp3MotherHiGrade == null)? 0 :this.rcrapp3MotherHiGrade.hashCode()));
        result = ((result* 31)+((this.rcrapp3IrsRequestFlag == null)? 0 :this.rcrapp3IrsRequestFlag.hashCode()));
        result = ((result* 31)+((this.usInc == null)? 0 :this.usInc.hashCode()));
        result = ((result* 31)+((this.creatorId == null)? 0 :this.creatorId.hashCode()));
        result = ((result* 31)+((this.taxFormInd == null)? 0 :this.taxFormInd.hashCode()));
        result = ((result* 31)+((this.verificationMsg == null)? 0 :this.verificationMsg.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.dislWrk == null)? 0 :this.dislWrk.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParIrsRequestFlag == null)? 0 :this.rcrapp3ParIrsRequestFlag.hashCode()));
        result = ((result* 31)+((this.legalGuardian == null)? 0 :this.legalGuardian.hashCode()));
        result = ((result* 31)+((this.rcrapp4PAssetThreshExcd == null)? 0 :this.rcrapp4PAssetThreshExcd.hashCode()));
        result = ((result* 31)+((this.rcrapp3ParIraKeough == null)? 0 :this.rcrapp3ParIraKeough.hashCode()));
        result = ((result* 31)+((this.rcrapp3TaxDefPension == null)? 0 :this.rcrapp3TaxDefPension.hashCode()));
        result = ((result* 31)+((this.parUntaxPensions == null)? 0 :this.parUntaxPensions.hashCode()));
        result = ((result* 31)+((this.displaySResDateMo == null)? 0 :this.displaySResDateMo.hashCode()));
        result = ((result* 31)+((this.displayPResDateYr == null)? 0 :this.displayPResDateYr.hashCode()));
        result = ((result* 31)+((this.parMrtlStatus == null)? 0 :this.parMrtlStatus.hashCode()));
        result = ((result* 31)+((this.rcrapp4MothSsn == null)? 0 :this.rcrapp4MothSsn.hashCode()));
        result = ((result* 31)+((this.addr == null)? 0 :this.addr.hashCode()));
        result = ((result* 31)+((this.recdWic == null)? 0 :this.recdWic.hashCode()));
        result = ((result* 31)+((this.rcrapp3IrsDisplayFlag == null)? 0 :this.rcrapp3IrsDisplayFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp4HighSchoolCde == null)? 0 :this.rcrapp4HighSchoolCde.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.unaccompYouthSchool == null)? 0 :this.unaccompYouthSchool.hashCode()));
        result = ((result* 31)+((this.rcrapp3EducCredits == null)? 0 :this.rcrapp3EducCredits.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.rcrapp4HsGedRcvd == null)? 0 :this.rcrapp4HsGedRcvd.hashCode()));
        result = ((result* 31)+((this.rcrapp4TxRetFiledInd == null)? 0 :this.rcrapp4TxRetFiledInd.hashCode()));
        result = ((result* 31)+((this.rcrapp3TeIntInc == null)? 0 :this.rcrapp3TeIntInc.hashCode()));
        result = ((result* 31)+((this.rcrapp41040aEligInd == null)? 0 :this.rcrapp41040aEligInd.hashCode()));
        result = ((result* 31)+((this.completionDate == null)? 0 :this.completionDate.hashCode()));
        result = ((result* 31)+((this.rcrapp3EfcRecalcCorrReq == null)? 0 :this.rcrapp3EfcRecalcCorrReq.hashCode()));
        result = ((result* 31)+((this.rcrapp4MothFirstNameIni == null)? 0 :this.rcrapp4MothFirstNameIni.hashCode()));
        result = ((result* 31)+((this.mothIncFrWrk == null)? 0 :this.mothIncFrWrk.hashCode()));
        result = ((result* 31)+((this.parSchoolLunch == null)? 0 :this.parSchoolLunch.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rcrapp1__1) == false) {
            return false;
        }
        Rcrapp1__1 rhs = ((Rcrapp1__1) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.schoolLunch == rhs.schoolLunch)||((this.schoolLunch!= null)&&this.schoolLunch.equals(rhs.schoolLunch)))&&((this.citzInd == rhs.citzInd)||((this.citzInd!= null)&&this.citzInd.equals(rhs.citzInd))))&&((this.parVetsNonEdBen == rhs.parVetsNonEdBen)||((this.parVetsNonEdBen!= null)&&this.parVetsNonEdBen.equals(rhs.parVetsNonEdBen))))&&((this.rcrapp4FathLastName == rhs.rcrapp4FathLastName)||((this.rcrapp4FathLastName!= null)&&this.rcrapp4FathLastName.equals(rhs.rcrapp4FathLastName))))&&((this.rcrapp3ParEducCredits == rhs.rcrapp3ParEducCredits)||((this.rcrapp3ParEducCredits!= null)&&this.rcrapp3ParEducCredits.equals(rhs.rcrapp3ParEducCredits))))&&((this.rcrapp3PreparerSsn == rhs.rcrapp3PreparerSsn)||((this.rcrapp3PreparerSsn!= null)&&this.rcrapp3PreparerSsn.equals(rhs.rcrapp3PreparerSsn))))&&((this.rcrapp4BusNetWorth == rhs.rcrapp4BusNetWorth)||((this.rcrapp4BusNetWorth!= null)&&this.rcrapp4BusNetWorth.equals(rhs.rcrapp4BusNetWorth))))&&((this.incFrWrk == rhs.incFrWrk)||((this.incFrWrk!= null)&&this.incFrWrk.equals(rhs.incFrWrk))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.displayNeedDate == rhs.displayNeedDate)||((this.displayNeedDate!= null)&&this.displayNeedDate.equals(rhs.displayNeedDate))))&&((this.rcrapp4Par1040aEligInd == rhs.rcrapp4Par1040aEligInd)||((this.rcrapp4Par1040aEligInd!= null)&&this.rcrapp4Par1040aEligInd.equals(rhs.rcrapp4Par1040aEligInd))))&&((this.parUsInc == rhs.parUsInc)||((this.parUsInc!= null)&&this.parUsInc.equals(rhs.parUsInc))))&&((this.recdSsi == rhs.recdSsi)||((this.recdSsi!= null)&&this.recdSsi.equals(rhs.recdSsi))))&&((this.parCashAmt == rhs.parCashAmt)||((this.parCashAmt!= null)&&this.parCashAmt.equals(rhs.parCashAmt))))&&((this.parIraDistributions == rhs.parIraDistributions)||((this.parIraDistributions!= null)&&this.parIraDistributions.equals(rhs.parIraDistributions))))&&((this.parNoInColl == rhs.parNoInColl)||((this.parNoInColl!= null)&&this.parNoInColl.equals(rhs.parNoInColl))))&&((this.rcrapp3ParIrsFitFlag == rhs.rcrapp3ParIrsFitFlag)||((this.rcrapp3ParIrsFitFlag!= null)&&this.rcrapp3ParIrsFitFlag.equals(rhs.rcrapp3ParIrsFitFlag))))&&((this.rcrapp3HouseFoodOth == rhs.rcrapp3HouseFoodOth)||((this.rcrapp3HouseFoodOth!= null)&&this.rcrapp3HouseFoodOth.equals(rhs.rcrapp3HouseFoodOth))))&&((this.noExempt == rhs.noExempt)||((this.noExempt!= null)&&this.noExempt.equals(rhs.noExempt))))&&((this.rcrapp3ParNeedBasedEmploy == rhs.rcrapp3ParNeedBasedEmploy)||((this.rcrapp3ParNeedBasedEmploy!= null)&&this.rcrapp3ParNeedBasedEmploy.equals(rhs.rcrapp3ParNeedBasedEmploy))))&&((this.othUntaxInc == rhs.othUntaxInc)||((this.othUntaxInc!= null)&&this.othUntaxInc.equals(rhs.othUntaxInc))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.rcrapp3NeedBasedEmploy == rhs.rcrapp3NeedBasedEmploy)||((this.rcrapp3NeedBasedEmploy!= null)&&this.rcrapp3NeedBasedEmploy.equals(rhs.rcrapp3NeedBasedEmploy))))&&((this.rcrapp4EmailAddress == rhs.rcrapp4EmailAddress)||((this.rcrapp4EmailAddress!= null)&&this.rcrapp4EmailAddress.equals(rhs.rcrapp4EmailAddress))))&&((this.rcrapp4ParLegalResInd == rhs.rcrapp4ParLegalResInd)||((this.rcrapp4ParLegalResInd!= null)&&this.rcrapp4ParLegalResInd.equals(rhs.rcrapp4ParLegalResInd))))&&((this.rcrapp4CombatPay == rhs.rcrapp4CombatPay)||((this.rcrapp4CombatPay!= null)&&this.rcrapp4CombatPay.equals(rhs.rcrapp4CombatPay))))&&((this.atRiskHomeless == rhs.atRiskHomeless)||((this.atRiskHomeless!= null)&&this.atRiskHomeless.equals(rhs.atRiskHomeless))))&&((this.rcrapp4ParTxRetFiledInd == rhs.rcrapp4ParTxRetFiledInd)||((this.rcrapp4ParTxRetFiledInd!= null)&&this.rcrapp4ParTxRetFiledInd.equals(rhs.rcrapp4ParTxRetFiledInd))))&&((this.rcrapp4ParBusNetWorth == rhs.rcrapp4ParBusNetWorth)||((this.rcrapp4ParBusNetWorth!= null)&&this.rcrapp4ParBusNetWorth.equals(rhs.rcrapp4ParBusNetWorth))))&&((this.signed == rhs.signed)||((this.signed!= null)&&this.signed.equals(rhs.signed))))&&((this.statCodeRes == rhs.statCodeRes)||((this.statCodeRes!= null)&&this.statCodeRes.equals(rhs.statCodeRes))))&&((this.instHousCde == rhs.instHousCde)||((this.instHousCde!= null)&&this.instHousCde.equals(rhs.instHousCde))))&&((this.origCompDate == rhs.origCompDate)||((this.origCompDate!= null)&&this.origCompDate.equals(rhs.origCompDate))))&&((this.rcrapp4HighSchoolFlg == rhs.rcrapp4HighSchoolFlg)||((this.rcrapp4HighSchoolFlg!= null)&&this.rcrapp4HighSchoolFlg.equals(rhs.rcrapp4HighSchoolFlg))))&&((this.rcrapp4StatCodeHighSch == rhs.rcrapp4StatCodeHighSch)||((this.rcrapp4StatCodeHighSch!= null)&&this.rcrapp4StatCodeHighSch.equals(rhs.rcrapp4StatCodeHighSch))))&&((this.statCodeLic == rhs.statCodeLic)||((this.statCodeLic!= null)&&this.statCodeLic.equals(rhs.statCodeLic))))&&((this.activeDuty == rhs.activeDuty)||((this.activeDuty!= null)&&this.activeDuty.equals(rhs.activeDuty))))&&((this.taxFilingStatus == rhs.taxFilingStatus)||((this.taxFilingStatus!= null)&&this.taxFilingStatus.equals(rhs.taxFilingStatus))))&&((this.rcrapp3GrantScholarAid == rhs.rcrapp3GrantScholarAid)||((this.rcrapp3GrantScholarAid!= null)&&this.rcrapp3GrantScholarAid.equals(rhs.rcrapp3GrantScholarAid))))&&((this.parTaxFormInd == rhs.parTaxFormInd)||((this.parTaxFormInd!= null)&&this.parTaxFormInd.equals(rhs.parTaxFormInd))))&&((this.rcrapp3FatherHiGrade == rhs.rcrapp3FatherHiGrade)||((this.rcrapp3FatherHiGrade!= null)&&this.rcrapp3FatherHiGrade.equals(rhs.rcrapp3FatherHiGrade))))&&((this.mrtlStatus == rhs.mrtlStatus)||((this.mrtlStatus!= null)&&this.mrtlStatus.equals(rhs.mrtlStatus))))&&((this.rcrapp4LegalResInd == rhs.rcrapp4LegalResInd)||((this.rcrapp4LegalResInd!= null)&&this.rcrapp4LegalResInd.equals(rhs.rcrapp4LegalResInd))))&&((this.famMemb == rhs.famMemb)||((this.famMemb!= null)&&this.famMemb.equals(rhs.famMemb))))&&((this.rcrapp3ParHouseFoodOth == rhs.rcrapp3ParHouseFoodOth)||((this.rcrapp3ParHouseFoodOth!= null)&&this.rcrapp3ParHouseFoodOth.equals(rhs.rcrapp3ParHouseFoodOth))))&&((this.driverLicNo == rhs.driverLicNo)||((this.driverLicNo!= null)&&this.driverLicNo.equals(rhs.driverLicNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rcrapp4MothBirthDate == rhs.rcrapp4MothBirthDate)||((this.rcrapp4MothBirthDate!= null)&&this.rcrapp4MothBirthDate.equals(rhs.rcrapp4MothBirthDate))))&&((this.rcrapp3ParTeIntInc == rhs.rcrapp3ParTeIntInc)||((this.rcrapp3ParTeIntInc!= null)&&this.rcrapp3ParTeIntInc.equals(rhs.rcrapp3ParTeIntInc))))&&((this.emancipatedMinor == rhs.emancipatedMinor)||((this.emancipatedMinor!= null)&&this.emancipatedMinor.equals(rhs.emancipatedMinor))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.unaccompYouthHud == rhs.unaccompYouthHud)||((this.unaccompYouthHud!= null)&&this.unaccompYouthHud.equals(rhs.unaccompYouthHud))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.degreeByJuly == rhs.degreeByJuly)||((this.degreeByJuly!= null)&&this.degreeByJuly.equals(rhs.degreeByJuly))))&&((this.wardOfCourt == rhs.wardOfCourt)||((this.wardOfCourt!= null)&&this.wardOfCourt.equals(rhs.wardOfCourt))))&&((this.parOthUntaxInc == rhs.parOthUntaxInc)||((this.parOthUntaxInc!= null)&&this.parOthUntaxInc.equals(rhs.parOthUntaxInc))))&&((this.childSupp == rhs.childSupp)||((this.childSupp!= null)&&this.childSupp.equals(rhs.childSupp))))&&((this.phoneNo == rhs.phoneNo)||((this.phoneNo!= null)&&this.phoneNo.equals(rhs.phoneNo))))&&((this.rcrapp3MothSsnMatch == rhs.rcrapp3MothSsnMatch)||((this.rcrapp3MothSsnMatch!= null)&&this.rcrapp3MothSsnMatch.equals(rhs.rcrapp3MothSsnMatch))))&&((this.usIncTaxPd == rhs.usIncTaxPd)||((this.usIncTaxPd!= null)&&this.usIncTaxPd.equals(rhs.usIncTaxPd))))&&((this.rcrapp3FedCollChoice4 == rhs.rcrapp3FedCollChoice4)||((this.rcrapp3FedCollChoice4 != null)&&this.rcrapp3FedCollChoice4 .equals(rhs.rcrapp3FedCollChoice4))))&&((this.rcrapp3FedCollChoice5 == rhs.rcrapp3FedCollChoice5)||((this.rcrapp3FedCollChoice5 != null)&&this.rcrapp3FedCollChoice5 .equals(rhs.rcrapp3FedCollChoice5))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.fedCollChoice1 == rhs.fedCollChoice1)||((this.fedCollChoice1 != null)&&this.fedCollChoice1 .equals(rhs.fedCollChoice1))))&&((this.rcrapp3FedCollChoice6 == rhs.rcrapp3FedCollChoice6)||((this.rcrapp3FedCollChoice6 != null)&&this.rcrapp3FedCollChoice6 .equals(rhs.rcrapp3FedCollChoice6))))&&((this.rcrapp3ParGrantScholarAid == rhs.rcrapp3ParGrantScholarAid)||((this.rcrapp3ParGrantScholarAid!= null)&&this.rcrapp3ParGrantScholarAid.equals(rhs.rcrapp3ParGrantScholarAid))))&&((this.displayVerificationPrtyDesc == rhs.displayVerificationPrtyDesc)||((this.displayVerificationPrtyDesc!= null)&&this.displayVerificationPrtyDesc.equals(rhs.displayVerificationPrtyDesc))))&&((this.rcrapp3IrsFitFlag == rhs.rcrapp3IrsFitFlag)||((this.rcrapp3IrsFitFlag!= null)&&this.rcrapp3IrsFitFlag.equals(rhs.rcrapp3IrsFitFlag))))&&((this.untaxPensions == rhs.untaxPensions)||((this.untaxPensions!= null)&&this.untaxPensions.equals(rhs.untaxPensions))))&&((this.rcrapp3PreparerEin == rhs.rcrapp3PreparerEin)||((this.rcrapp3PreparerEin!= null)&&this.rcrapp3PreparerEin.equals(rhs.rcrapp3PreparerEin))))&&((this.rcrapp3ChildSuppPaid == rhs.rcrapp3ChildSuppPaid)||((this.rcrapp3ChildSuppPaid!= null)&&this.rcrapp3ChildSuppPaid.equals(rhs.rcrapp3ChildSuppPaid))))&&((this.rcrapp3FedCollChoice7 == rhs.rcrapp3FedCollChoice7)||((this.rcrapp3FedCollChoice7 != null)&&this.rcrapp3FedCollChoice7 .equals(rhs.rcrapp3FedCollChoice7))))&&((this.displaySResDateYr == rhs.displaySResDateYr)||((this.displaySResDateYr!= null)&&this.displaySResDateYr.equals(rhs.displaySResDateYr))))&&((this.rcrapp3FedCollChoice8 == rhs.rcrapp3FedCollChoice8)||((this.rcrapp3FedCollChoice8 != null)&&this.rcrapp3FedCollChoice8 .equals(rhs.rcrapp3FedCollChoice8))))&&((this.rcrapp4FathFirstNameIni == rhs.rcrapp4FathFirstNameIni)||((this.rcrapp4FathFirstNameIni!= null)&&this.rcrapp4FathFirstNameIni.equals(rhs.rcrapp4FathFirstNameIni))))&&((this.rcrapp3FedCollChoice9 == rhs.rcrapp3FedCollChoice9)||((this.rcrapp3FedCollChoice9 != null)&&this.rcrapp3FedCollChoice9 .equals(rhs.rcrapp3FedCollChoice9))))&&((this.rcrapp3SpecCircumFlg == rhs.rcrapp3SpecCircumFlg)||((this.rcrapp3SpecCircumFlg!= null)&&this.rcrapp3SpecCircumFlg.equals(rhs.rcrapp3SpecCircumFlg))))&&((this.createDate == rhs.createDate)||((this.createDate!= null)&&this.createDate.equals(rhs.createDate))))&&((this.rcrapp3SMarMthYr == rhs.rcrapp3SMarMthYr)||((this.rcrapp3SMarMthYr!= null)&&this.rcrapp3SMarMthYr.equals(rhs.rcrapp3SMarMthYr))))&&((this.rcrapp3PreparerSign == rhs.rcrapp3PreparerSign)||((this.rcrapp3PreparerSign!= null)&&this.rcrapp3PreparerSign.equals(rhs.rcrapp3PreparerSign))))&&((this.rcrapp3ParIrsDisplayFlag == rhs.rcrapp3ParIrsDisplayFlag)||((this.rcrapp3ParIrsDisplayFlag!= null)&&this.rcrapp3ParIrsDisplayFlag.equals(rhs.rcrapp3ParIrsDisplayFlag))))&&((this.rcrapp4FathSsn == rhs.rcrapp4FathSsn)||((this.rcrapp4FathSsn!= null)&&this.rcrapp4FathSsn.equals(rhs.rcrapp4FathSsn))))&&((this.rcrapp3ParIrsAgiFlag == rhs.rcrapp3ParIrsAgiFlag)||((this.rcrapp3ParIrsAgiFlag!= null)&&this.rcrapp3ParIrsAgiFlag.equals(rhs.rcrapp3ParIrsAgiFlag))))&&((this.permitDraftReg == rhs.permitDraftReg)||((this.permitDraftReg!= null)&&this.permitDraftReg.equals(rhs.permitDraftReg))))&&((this.rcrapp4DrugOffenseConvic == rhs.rcrapp4DrugOffenseConvic)||((this.rcrapp4DrugOffenseConvic!= null)&&this.rcrapp4DrugOffenseConvic.equals(rhs.rcrapp4DrugOffenseConvic))))&&((this.recdTanf == rhs.recdTanf)||((this.recdTanf!= null)&&this.recdTanf.equals(rhs.recdTanf))))&&((this.rcrapp4SAssetThreshExcd == rhs.rcrapp4SAssetThreshExcd)||((this.rcrapp4SAssetThreshExcd!= null)&&this.rcrapp4SAssetThreshExcd.equals(rhs.rcrapp4SAssetThreshExcd))))&&((this.rcrapp4HighSchoolCity == rhs.rcrapp4HighSchoolCity)||((this.rcrapp4HighSchoolCity!= null)&&this.rcrapp4HighSchoolCity.equals(rhs.rcrapp4HighSchoolCity))))&&((this.fedCollChoice2 == rhs.fedCollChoice2)||((this.fedCollChoice2 != null)&&this.fedCollChoice2 .equals(rhs.fedCollChoice2))))&&((this.vetsNonEdBen == rhs.vetsNonEdBen)||((this.vetsNonEdBen!= null)&&this.vetsNonEdBen.equals(rhs.vetsNonEdBen))))&&((this.fedCollChoice3 == rhs.fedCollChoice3)||((this.fedCollChoice3 != null)&&this.fedCollChoice3 .equals(rhs.fedCollChoice3))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.parTaxFilingStatus == rhs.parTaxFilingStatus)||((this.parTaxFilingStatus!= null)&&this.parTaxFilingStatus.equals(rhs.parTaxFilingStatus))))&&((this.parFoodStamps == rhs.parFoodStamps)||((this.parFoodStamps!= null)&&this.parFoodStamps.equals(rhs.parFoodStamps))))&&((this.fathIncFrWrk == rhs.fathIncFrWrk)||((this.fathIncFrWrk!= null)&&this.fathIncFrWrk.equals(rhs.fathIncFrWrk))))&&((this.parRecdTanf == rhs.parRecdTanf)||((this.parRecdTanf!= null)&&this.parRecdTanf.equals(rhs.parRecdTanf))))&&((this.parRecdWic == rhs.parRecdWic)||((this.parRecdWic!= null)&&this.parRecdWic.equals(rhs.parRecdWic))))&&((this.rcrapp4MothLastName == rhs.rcrapp4MothLastName)||((this.rcrapp4MothLastName!= null)&&this.rcrapp4MothLastName.equals(rhs.rcrapp4MothLastName))))&&((this.rcrapp4WrkStdyLoansInt == rhs.rcrapp4WrkStdyLoansInt)||((this.rcrapp4WrkStdyLoansInt!= null)&&this.rcrapp4WrkStdyLoansInt.equals(rhs.rcrapp4WrkStdyLoansInt))))&&((this.parUsIncTaxPd == rhs.parUsIncTaxPd)||((this.parUsIncTaxPd!= null)&&this.parUsIncTaxPd.equals(rhs.parUsIncTaxPd))))&&((this.rcrapp3DegreeType == rhs.rcrapp3DegreeType)||((this.rcrapp3DegreeType!= null)&&this.rcrapp3DegreeType.equals(rhs.rcrapp3DegreeType))))&&((this.usVet == rhs.usVet)||((this.usVet!= null)&&this.usVet.equals(rhs.usVet))))&&((this.rcrapp3Married == rhs.rcrapp3Married)||((this.rcrapp3Married!= null)&&this.rcrapp3Married.equals(rhs.rcrapp3Married))))&&((this.iraDistributions == rhs.iraDistributions)||((this.iraDistributions!= null)&&this.iraDistributions.equals(rhs.iraDistributions))))&&((this.rcrapp3YrInColl2 == rhs.rcrapp3YrInColl2)||((this.rcrapp3YrInColl2 != null)&&this.rcrapp3YrInColl2 .equals(rhs.rcrapp3YrInColl2))))&&((this.cashAmt == rhs.cashAmt)||((this.cashAmt!= null)&&this.cashAmt.equals(rhs.cashAmt))))&&((this.noInColl == rhs.noInColl)||((this.noInColl!= null)&&this.noInColl.equals(rhs.noInColl))))&&((this.rcrapp3GradOrProf == rhs.rcrapp3GradOrProf)||((this.rcrapp3GradOrProf!= null)&&this.rcrapp3GradOrProf.equals(rhs.rcrapp3GradOrProf))))&&((this.parFamMemb == rhs.parFamMemb)||((this.parFamMemb!= null)&&this.parFamMemb.equals(rhs.parFamMemb))))&&((this.rcrapp3ParChildSuppPaid == rhs.rcrapp3ParChildSuppPaid)||((this.rcrapp3ParChildSuppPaid!= null)&&this.rcrapp3ParChildSuppPaid.equals(rhs.rcrapp3ParChildSuppPaid))))&&((this.verificationPrty == rhs.verificationPrty)||((this.verificationPrty!= null)&&this.verificationPrty.equals(rhs.verificationPrty))))&&((this.rcrapp3FedCollChoice10 == rhs.rcrapp3FedCollChoice10)||((this.rcrapp3FedCollChoice10 != null)&&this.rcrapp3FedCollChoice10 .equals(rhs.rcrapp3FedCollChoice10))))&&((this.parNoExempt == rhs.parNoExempt)||((this.parNoExempt!= null)&&this.parNoExempt.equals(rhs.parNoExempt))))&&((this.parStatCodeRes == rhs.parStatCodeRes)||((this.parStatCodeRes!= null)&&this.parStatCodeRes.equals(rhs.parStatCodeRes))))&&((this.rcrapp3ParCoOpEarnings == rhs.rcrapp3ParCoOpEarnings)||((this.rcrapp3ParCoOpEarnings!= null)&&this.rcrapp3ParCoOpEarnings.equals(rhs.rcrapp3ParCoOpEarnings))))&&((this.rcrapp4PEmailAddress == rhs.rcrapp4PEmailAddress)||((this.rcrapp4PEmailAddress!= null)&&this.rcrapp4PEmailAddress.equals(rhs.rcrapp4PEmailAddress))))&&((this.rcrapp4ParInvNetWorth == rhs.rcrapp4ParInvNetWorth)||((this.rcrapp4ParInvNetWorth!= null)&&this.rcrapp4ParInvNetWorth.equals(rhs.rcrapp4ParInvNetWorth))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.yrInColl == rhs.yrInColl)||((this.yrInColl!= null)&&this.yrInColl.equals(rhs.yrInColl))))&&((this.rcrapp3ParTaxDefPension == rhs.rcrapp3ParTaxDefPension)||((this.rcrapp3ParTaxDefPension!= null)&&this.rcrapp3ParTaxDefPension.equals(rhs.rcrapp3ParTaxDefPension))))&&((this.parDislWrk == rhs.parDislWrk)||((this.parDislWrk!= null)&&this.parDislWrk.equals(rhs.parDislWrk))))&&((this.spsIncFrWrk == rhs.spsIncFrWrk)||((this.spsIncFrWrk!= null)&&this.spsIncFrWrk.equals(rhs.spsIncFrWrk))))&&((this.rcrapp3IrsAgiFlag == rhs.rcrapp3IrsAgiFlag)||((this.rcrapp3IrsAgiFlag!= null)&&this.rcrapp3IrsAgiFlag.equals(rhs.rcrapp3IrsAgiFlag))))&&((this.alienRegNo == rhs.alienRegNo)||((this.alienRegNo!= null)&&this.alienRegNo.equals(rhs.alienRegNo))))&&((this.rcrapp3CoOpEarnings == rhs.rcrapp3CoOpEarnings)||((this.rcrapp3CoOpEarnings!= null)&&this.rcrapp3CoOpEarnings.equals(rhs.rcrapp3CoOpEarnings))))&&((this.parChildSupp == rhs.parChildSupp)||((this.parChildSupp!= null)&&this.parChildSupp.equals(rhs.parChildSupp))))&&((this.bornBefore11Xx == rhs.bornBefore11Xx)||((this.bornBefore11Xx!= null)&&this.bornBefore11Xx.equals(rhs.bornBefore11Xx))))&&((this.rcrapp4IraKeoghAmt == rhs.rcrapp4IraKeoghAmt)||((this.rcrapp4IraKeoghAmt!= null)&&this.rcrapp4IraKeoghAmt.equals(rhs.rcrapp4IraKeoghAmt))))&&((this.rcrapp3FathSsnMatch == rhs.rcrapp3FathSsnMatch)||((this.rcrapp3FathSsnMatch!= null)&&this.rcrapp3FathSsnMatch.equals(rhs.rcrapp3FathSsnMatch))))&&((this.rcrapp4InvNetWorth == rhs.rcrapp4InvNetWorth)||((this.rcrapp4InvNetWorth!= null)&&this.rcrapp4InvNetWorth.equals(rhs.rcrapp4InvNetWorth))))&&((this.displayPResDateMo == rhs.displayPResDateMo)||((this.displayPResDateMo!= null)&&this.displayPResDateMo.equals(rhs.displayPResDateMo))))&&((this.rcrapp4HaveChildren == rhs.rcrapp4HaveChildren)||((this.rcrapp4HaveChildren!= null)&&this.rcrapp4HaveChildren.equals(rhs.rcrapp4HaveChildren))))&&((this.othNonReportMoney == rhs.othNonReportMoney)||((this.othNonReportMoney!= null)&&this.othNonReportMoney.equals(rhs.othNonReportMoney))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.rcptDate == rhs.rcptDate)||((this.rcptDate!= null)&&this.rcptDate.equals(rhs.rcptDate))))&&((this.rcrapp4ParCombatPay == rhs.rcrapp4ParCombatPay)||((this.rcrapp4ParCombatPay!= null)&&this.rcrapp4ParCombatPay.equals(rhs.rcrapp4ParCombatPay))))&&((this.rcrapp4HighSchoolName == rhs.rcrapp4HighSchoolName)||((this.rcrapp4HighSchoolName!= null)&&this.rcrapp4HighSchoolName.equals(rhs.rcrapp4HighSchoolName))))&&((this.rcrapp4FathBirthDate == rhs.rcrapp4FathBirthDate)||((this.rcrapp4FathBirthDate!= null)&&this.rcrapp4FathBirthDate.equals(rhs.rcrapp4FathBirthDate))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.parRecdSsi == rhs.parRecdSsi)||((this.parRecdSsi!= null)&&this.parRecdSsi.equals(rhs.parRecdSsi))))&&((this.rcrapp3ParMarMthYr == rhs.rcrapp3ParMarMthYr)||((this.rcrapp3ParMarMthYr!= null)&&this.rcrapp3ParMarMthYr.equals(rhs.rcrapp3ParMarMthYr))))&&((this.foodStamps == rhs.foodStamps)||((this.foodStamps!= null)&&this.foodStamps.equals(rhs.foodStamps))))&&((this.hasLegalDepend == rhs.hasLegalDepend)||((this.hasLegalDepend!= null)&&this.hasLegalDepend.equals(rhs.hasLegalDepend))))&&((this.rcrapp3MotherHiGrade == rhs.rcrapp3MotherHiGrade)||((this.rcrapp3MotherHiGrade!= null)&&this.rcrapp3MotherHiGrade.equals(rhs.rcrapp3MotherHiGrade))))&&((this.rcrapp3IrsRequestFlag == rhs.rcrapp3IrsRequestFlag)||((this.rcrapp3IrsRequestFlag!= null)&&this.rcrapp3IrsRequestFlag.equals(rhs.rcrapp3IrsRequestFlag))))&&((this.usInc == rhs.usInc)||((this.usInc!= null)&&this.usInc.equals(rhs.usInc))))&&((this.creatorId == rhs.creatorId)||((this.creatorId!= null)&&this.creatorId.equals(rhs.creatorId))))&&((this.taxFormInd == rhs.taxFormInd)||((this.taxFormInd!= null)&&this.taxFormInd.equals(rhs.taxFormInd))))&&((this.verificationMsg == rhs.verificationMsg)||((this.verificationMsg!= null)&&this.verificationMsg.equals(rhs.verificationMsg))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.dislWrk == rhs.dislWrk)||((this.dislWrk!= null)&&this.dislWrk.equals(rhs.dislWrk))))&&((this.rcrapp3ParIrsRequestFlag == rhs.rcrapp3ParIrsRequestFlag)||((this.rcrapp3ParIrsRequestFlag!= null)&&this.rcrapp3ParIrsRequestFlag.equals(rhs.rcrapp3ParIrsRequestFlag))))&&((this.legalGuardian == rhs.legalGuardian)||((this.legalGuardian!= null)&&this.legalGuardian.equals(rhs.legalGuardian))))&&((this.rcrapp4PAssetThreshExcd == rhs.rcrapp4PAssetThreshExcd)||((this.rcrapp4PAssetThreshExcd!= null)&&this.rcrapp4PAssetThreshExcd.equals(rhs.rcrapp4PAssetThreshExcd))))&&((this.rcrapp3ParIraKeough == rhs.rcrapp3ParIraKeough)||((this.rcrapp3ParIraKeough!= null)&&this.rcrapp3ParIraKeough.equals(rhs.rcrapp3ParIraKeough))))&&((this.rcrapp3TaxDefPension == rhs.rcrapp3TaxDefPension)||((this.rcrapp3TaxDefPension!= null)&&this.rcrapp3TaxDefPension.equals(rhs.rcrapp3TaxDefPension))))&&((this.parUntaxPensions == rhs.parUntaxPensions)||((this.parUntaxPensions!= null)&&this.parUntaxPensions.equals(rhs.parUntaxPensions))))&&((this.displaySResDateMo == rhs.displaySResDateMo)||((this.displaySResDateMo!= null)&&this.displaySResDateMo.equals(rhs.displaySResDateMo))))&&((this.displayPResDateYr == rhs.displayPResDateYr)||((this.displayPResDateYr!= null)&&this.displayPResDateYr.equals(rhs.displayPResDateYr))))&&((this.parMrtlStatus == rhs.parMrtlStatus)||((this.parMrtlStatus!= null)&&this.parMrtlStatus.equals(rhs.parMrtlStatus))))&&((this.rcrapp4MothSsn == rhs.rcrapp4MothSsn)||((this.rcrapp4MothSsn!= null)&&this.rcrapp4MothSsn.equals(rhs.rcrapp4MothSsn))))&&((this.addr == rhs.addr)||((this.addr!= null)&&this.addr.equals(rhs.addr))))&&((this.recdWic == rhs.recdWic)||((this.recdWic!= null)&&this.recdWic.equals(rhs.recdWic))))&&((this.rcrapp3IrsDisplayFlag == rhs.rcrapp3IrsDisplayFlag)||((this.rcrapp3IrsDisplayFlag!= null)&&this.rcrapp3IrsDisplayFlag.equals(rhs.rcrapp3IrsDisplayFlag))))&&((this.rcrapp4HighSchoolCde == rhs.rcrapp4HighSchoolCde)||((this.rcrapp4HighSchoolCde!= null)&&this.rcrapp4HighSchoolCde.equals(rhs.rcrapp4HighSchoolCde))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.unaccompYouthSchool == rhs.unaccompYouthSchool)||((this.unaccompYouthSchool!= null)&&this.unaccompYouthSchool.equals(rhs.unaccompYouthSchool))))&&((this.rcrapp3EducCredits == rhs.rcrapp3EducCredits)||((this.rcrapp3EducCredits!= null)&&this.rcrapp3EducCredits.equals(rhs.rcrapp3EducCredits))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.rcrapp4HsGedRcvd == rhs.rcrapp4HsGedRcvd)||((this.rcrapp4HsGedRcvd!= null)&&this.rcrapp4HsGedRcvd.equals(rhs.rcrapp4HsGedRcvd))))&&((this.rcrapp4TxRetFiledInd == rhs.rcrapp4TxRetFiledInd)||((this.rcrapp4TxRetFiledInd!= null)&&this.rcrapp4TxRetFiledInd.equals(rhs.rcrapp4TxRetFiledInd))))&&((this.rcrapp3TeIntInc == rhs.rcrapp3TeIntInc)||((this.rcrapp3TeIntInc!= null)&&this.rcrapp3TeIntInc.equals(rhs.rcrapp3TeIntInc))))&&((this.rcrapp41040aEligInd == rhs.rcrapp41040aEligInd)||((this.rcrapp41040aEligInd!= null)&&this.rcrapp41040aEligInd.equals(rhs.rcrapp41040aEligInd))))&&((this.completionDate == rhs.completionDate)||((this.completionDate!= null)&&this.completionDate.equals(rhs.completionDate))))&&((this.rcrapp3EfcRecalcCorrReq == rhs.rcrapp3EfcRecalcCorrReq)||((this.rcrapp3EfcRecalcCorrReq!= null)&&this.rcrapp3EfcRecalcCorrReq.equals(rhs.rcrapp3EfcRecalcCorrReq))))&&((this.rcrapp4MothFirstNameIni == rhs.rcrapp4MothFirstNameIni)||((this.rcrapp4MothFirstNameIni!= null)&&this.rcrapp4MothFirstNameIni.equals(rhs.rcrapp4MothFirstNameIni))))&&((this.mothIncFrWrk == rhs.mothIncFrWrk)||((this.mothIncFrWrk!= null)&&this.mothIncFrWrk.equals(rhs.mothIncFrWrk))))&&((this.parSchoolLunch == rhs.parSchoolLunch)||((this.parSchoolLunch!= null)&&this.parSchoolLunch.equals(rhs.parSchoolLunch))));
    }

}
