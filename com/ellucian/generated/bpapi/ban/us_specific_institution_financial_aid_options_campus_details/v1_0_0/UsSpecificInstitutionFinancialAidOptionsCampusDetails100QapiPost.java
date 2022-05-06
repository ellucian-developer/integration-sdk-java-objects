
package com.ellucian.generated.bpapi.ban.us_specific_institution_financial_aid_options_campus_details.v1_0_0;

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
    "keyblckAidyCode",
    "campCode",
    "elBranchCde",
    "commonSchoolId",
    "paymentMethod",
    "displayReportingId",
    "acadCal",
    "displaySourceId",
    "expectHrs",
    "pellId",
    "expectWks",
    "pellFundCode",
    "hrsInYr",
    "fedSchoolCode",
    "wksInYr",
    "opeid",
    "displayNbrMthsPay",
    "opeidBranch",
    "turnOffPellInd",
    "dlSchoolCode",
    "applyFyftbRuleInd",
    "elSchoolCde",
    "instXrefInd",
    "titleIvRetInd",
    "titleIvRoundInd"
})
@Generated("jsonschema2pojo")
public class UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost {

    @JsonProperty("keyblckAidyCode")
    private String keyblckAidyCode;
    /**
     * Campus Code
     * <p>
     * Lineage reference object : RORCAMP_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Branch ID
     * <p>
     * Lineage reference object : RORCAMP_EL_BRANCH_CDE
     * 
     */
    @JsonProperty("elBranchCde")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_EL_BRANCH_CDE")
    private String elBranchCde;
    /**
     * Routing Number/Common School ID
     * <p>
     * Lineage reference object : RORCAMP_COMMON_SCHOOL_ID
     * 
     */
    @JsonProperty("commonSchoolId")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_COMMON_SCHOOL_ID")
    private String commonSchoolId;
    /**
     * Payment Method
     * <p>
     * Lineage reference object : RORCAMP_PAYMENT_METHOD
     * 
     */
    @JsonProperty("paymentMethod")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_PAYMENT_METHOD")
    private String paymentMethod;
    /**
     * Reporting ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReportingId")
    private String displayReportingId;
    /**
     * Academic Calendar
     * <p>
     * Lineage reference object : RORCAMP_ACAD_CAL
     * 
     */
    @JsonProperty("acadCal")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_ACAD_CAL")
    private Double acadCal;
    /**
     * Source ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySourceId")
    private String displaySourceId;
    /**
     * Expected Hours
     * <p>
     * Lineage reference object : RORCAMP_EXPECT_HRS
     * 
     */
    @JsonProperty("expectHrs")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_EXPECT_HRS")
    private Double expectHrs;
    /**
     * Federal Pell ID
     * <p>
     * Lineage reference object : RORCAMP_PELL_ID
     * 
     */
    @JsonProperty("pellId")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_PELL_ID")
    private String pellId;
    /**
     * Expected Weeks
     * <p>
     * Lineage reference object : RORCAMP_EXPECT_WKS
     * 
     */
    @JsonProperty("expectWks")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_EXPECT_WKS")
    private Double expectWks;
    /**
     * Pell Fund Code
     * <p>
     * Lineage reference object : RORCAMP_PELL_FUND_CODE, Lookup lineage reference object : rfrbase
     * 
     */
    @JsonProperty("pellFundCode")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_PELL_FUND_CODE, Lookup lineage reference object : rfrbase")
    private String pellFundCode;
    /**
     * School Hours
     * <p>
     * Lineage reference object : RORCAMP_HRS_IN_YR
     * 
     */
    @JsonProperty("hrsInYr")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_HRS_IN_YR")
    private Double hrsInYr;
    /**
     * Federal School Code
     * <p>
     * Lineage reference object : RORCAMP_FED_SCHOOL_CODE
     * 
     */
    @JsonProperty("fedSchoolCode")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_FED_SCHOOL_CODE")
    private String fedSchoolCode;
    /**
     * School Weeks
     * <p>
     * Lineage reference object : RORCAMP_WKS_IN_YR
     * 
     */
    @JsonProperty("wksInYr")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_WKS_IN_YR")
    private Double wksInYr;
    /**
     * OPEID
     * <p>
     * Lineage reference object : RORCAMP_OPEID
     * 
     */
    @JsonProperty("opeid")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_OPEID")
    private String opeid;
    /**
     * Number of Months to Pay
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNbrMthsPay")
    private Double displayNbrMthsPay;
    /**
     * OPEID Branch
     * <p>
     * Lineage reference object : RORCAMP_OPEID_BRANCH
     * 
     */
    @JsonProperty("opeidBranch")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_OPEID_BRANCH")
    private String opeidBranch;
    /**
     * Prevent Automatic Pell Calculation
     * <p>
     * Lineage reference object : RORCAMP_TURN_OFF_PELL_IND
     * 
     */
    @JsonProperty("turnOffPellInd")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_TURN_OFF_PELL_IND")
    private String turnOffPellInd;
    /**
     * Direct Loan School Code
     * <p>
     * Lineage reference object : RORCAMP_DL_SCHOOL_CODE
     * 
     */
    @JsonProperty("dlSchoolCode")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_DL_SCHOOL_CODE")
    private String dlSchoolCode;
    /**
     * Apply First-Year, First-Time Borrower Rule
     * <p>
     * Lineage reference object : RORCAMP_APPLY_FYFTB_RULE_IND
     * 
     */
    @JsonProperty("applyFyftbRuleInd")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_APPLY_FYFTB_RULE_IND")
    private String applyFyftbRuleInd;
    /**
     * Electronic School Code
     * <p>
     * Lineage reference object : RORCAMP_EL_SCHOOL_CDE
     * 
     */
    @JsonProperty("elSchoolCde")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_EL_SCHOOL_CDE")
    private String elSchoolCde;
    /**
     * COD Institutional Cross Reference
     * <p>
     * Lineage reference object : RORCAMP_INST_XREF_IND
     * 
     */
    @JsonProperty("instXrefInd")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_INST_XREF_IND")
    private String instXrefInd;
    /**
     * Return Indicator
     * <p>
     * Lineage reference object : RORCAMP_TITLE_IV_RET_IND
     * 
     */
    @JsonProperty("titleIvRetInd")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_TITLE_IV_RET_IND")
    private String titleIvRetInd;
    /**
     * Rounding Indicator
     * <p>
     * Lineage reference object : RORCAMP_TITLE_IV_ROUND_IND
     * 
     */
    @JsonProperty("titleIvRoundInd")
    @JsonPropertyDescription("Lineage reference object : RORCAMP_TITLE_IV_ROUND_IND")
    private String titleIvRoundInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Campus Code
     * <p>
     * Lineage reference object : RORCAMP_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus Code
     * <p>
     * Lineage reference object : RORCAMP_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Branch ID
     * <p>
     * Lineage reference object : RORCAMP_EL_BRANCH_CDE
     * 
     */
    @JsonProperty("elBranchCde")
    public String getElBranchCde() {
        return elBranchCde;
    }

    /**
     * Branch ID
     * <p>
     * Lineage reference object : RORCAMP_EL_BRANCH_CDE
     * 
     */
    @JsonProperty("elBranchCde")
    public void setElBranchCde(String elBranchCde) {
        this.elBranchCde = elBranchCde;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withElBranchCde(String elBranchCde) {
        this.elBranchCde = elBranchCde;
        return this;
    }

    /**
     * Routing Number/Common School ID
     * <p>
     * Lineage reference object : RORCAMP_COMMON_SCHOOL_ID
     * 
     */
    @JsonProperty("commonSchoolId")
    public String getCommonSchoolId() {
        return commonSchoolId;
    }

    /**
     * Routing Number/Common School ID
     * <p>
     * Lineage reference object : RORCAMP_COMMON_SCHOOL_ID
     * 
     */
    @JsonProperty("commonSchoolId")
    public void setCommonSchoolId(String commonSchoolId) {
        this.commonSchoolId = commonSchoolId;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withCommonSchoolId(String commonSchoolId) {
        this.commonSchoolId = commonSchoolId;
        return this;
    }

    /**
     * Payment Method
     * <p>
     * Lineage reference object : RORCAMP_PAYMENT_METHOD
     * 
     */
    @JsonProperty("paymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Payment Method
     * <p>
     * Lineage reference object : RORCAMP_PAYMENT_METHOD
     * 
     */
    @JsonProperty("paymentMethod")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Reporting ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReportingId")
    public String getDisplayReportingId() {
        return displayReportingId;
    }

    /**
     * Reporting ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReportingId")
    public void setDisplayReportingId(String displayReportingId) {
        this.displayReportingId = displayReportingId;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withDisplayReportingId(String displayReportingId) {
        this.displayReportingId = displayReportingId;
        return this;
    }

    /**
     * Academic Calendar
     * <p>
     * Lineage reference object : RORCAMP_ACAD_CAL
     * 
     */
    @JsonProperty("acadCal")
    public Double getAcadCal() {
        return acadCal;
    }

    /**
     * Academic Calendar
     * <p>
     * Lineage reference object : RORCAMP_ACAD_CAL
     * 
     */
    @JsonProperty("acadCal")
    public void setAcadCal(Double acadCal) {
        this.acadCal = acadCal;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withAcadCal(Double acadCal) {
        this.acadCal = acadCal;
        return this;
    }

    /**
     * Source ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySourceId")
    public String getDisplaySourceId() {
        return displaySourceId;
    }

    /**
     * Source ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySourceId")
    public void setDisplaySourceId(String displaySourceId) {
        this.displaySourceId = displaySourceId;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withDisplaySourceId(String displaySourceId) {
        this.displaySourceId = displaySourceId;
        return this;
    }

    /**
     * Expected Hours
     * <p>
     * Lineage reference object : RORCAMP_EXPECT_HRS
     * 
     */
    @JsonProperty("expectHrs")
    public Double getExpectHrs() {
        return expectHrs;
    }

    /**
     * Expected Hours
     * <p>
     * Lineage reference object : RORCAMP_EXPECT_HRS
     * 
     */
    @JsonProperty("expectHrs")
    public void setExpectHrs(Double expectHrs) {
        this.expectHrs = expectHrs;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withExpectHrs(Double expectHrs) {
        this.expectHrs = expectHrs;
        return this;
    }

    /**
     * Federal Pell ID
     * <p>
     * Lineage reference object : RORCAMP_PELL_ID
     * 
     */
    @JsonProperty("pellId")
    public String getPellId() {
        return pellId;
    }

    /**
     * Federal Pell ID
     * <p>
     * Lineage reference object : RORCAMP_PELL_ID
     * 
     */
    @JsonProperty("pellId")
    public void setPellId(String pellId) {
        this.pellId = pellId;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withPellId(String pellId) {
        this.pellId = pellId;
        return this;
    }

    /**
     * Expected Weeks
     * <p>
     * Lineage reference object : RORCAMP_EXPECT_WKS
     * 
     */
    @JsonProperty("expectWks")
    public Double getExpectWks() {
        return expectWks;
    }

    /**
     * Expected Weeks
     * <p>
     * Lineage reference object : RORCAMP_EXPECT_WKS
     * 
     */
    @JsonProperty("expectWks")
    public void setExpectWks(Double expectWks) {
        this.expectWks = expectWks;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withExpectWks(Double expectWks) {
        this.expectWks = expectWks;
        return this;
    }

    /**
     * Pell Fund Code
     * <p>
     * Lineage reference object : RORCAMP_PELL_FUND_CODE, Lookup lineage reference object : rfrbase
     * 
     */
    @JsonProperty("pellFundCode")
    public String getPellFundCode() {
        return pellFundCode;
    }

    /**
     * Pell Fund Code
     * <p>
     * Lineage reference object : RORCAMP_PELL_FUND_CODE, Lookup lineage reference object : rfrbase
     * 
     */
    @JsonProperty("pellFundCode")
    public void setPellFundCode(String pellFundCode) {
        this.pellFundCode = pellFundCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withPellFundCode(String pellFundCode) {
        this.pellFundCode = pellFundCode;
        return this;
    }

    /**
     * School Hours
     * <p>
     * Lineage reference object : RORCAMP_HRS_IN_YR
     * 
     */
    @JsonProperty("hrsInYr")
    public Double getHrsInYr() {
        return hrsInYr;
    }

    /**
     * School Hours
     * <p>
     * Lineage reference object : RORCAMP_HRS_IN_YR
     * 
     */
    @JsonProperty("hrsInYr")
    public void setHrsInYr(Double hrsInYr) {
        this.hrsInYr = hrsInYr;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withHrsInYr(Double hrsInYr) {
        this.hrsInYr = hrsInYr;
        return this;
    }

    /**
     * Federal School Code
     * <p>
     * Lineage reference object : RORCAMP_FED_SCHOOL_CODE
     * 
     */
    @JsonProperty("fedSchoolCode")
    public String getFedSchoolCode() {
        return fedSchoolCode;
    }

    /**
     * Federal School Code
     * <p>
     * Lineage reference object : RORCAMP_FED_SCHOOL_CODE
     * 
     */
    @JsonProperty("fedSchoolCode")
    public void setFedSchoolCode(String fedSchoolCode) {
        this.fedSchoolCode = fedSchoolCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withFedSchoolCode(String fedSchoolCode) {
        this.fedSchoolCode = fedSchoolCode;
        return this;
    }

    /**
     * School Weeks
     * <p>
     * Lineage reference object : RORCAMP_WKS_IN_YR
     * 
     */
    @JsonProperty("wksInYr")
    public Double getWksInYr() {
        return wksInYr;
    }

    /**
     * School Weeks
     * <p>
     * Lineage reference object : RORCAMP_WKS_IN_YR
     * 
     */
    @JsonProperty("wksInYr")
    public void setWksInYr(Double wksInYr) {
        this.wksInYr = wksInYr;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withWksInYr(Double wksInYr) {
        this.wksInYr = wksInYr;
        return this;
    }

    /**
     * OPEID
     * <p>
     * Lineage reference object : RORCAMP_OPEID
     * 
     */
    @JsonProperty("opeid")
    public String getOpeid() {
        return opeid;
    }

    /**
     * OPEID
     * <p>
     * Lineage reference object : RORCAMP_OPEID
     * 
     */
    @JsonProperty("opeid")
    public void setOpeid(String opeid) {
        this.opeid = opeid;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withOpeid(String opeid) {
        this.opeid = opeid;
        return this;
    }

    /**
     * Number of Months to Pay
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNbrMthsPay")
    public Double getDisplayNbrMthsPay() {
        return displayNbrMthsPay;
    }

    /**
     * Number of Months to Pay
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNbrMthsPay")
    public void setDisplayNbrMthsPay(Double displayNbrMthsPay) {
        this.displayNbrMthsPay = displayNbrMthsPay;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withDisplayNbrMthsPay(Double displayNbrMthsPay) {
        this.displayNbrMthsPay = displayNbrMthsPay;
        return this;
    }

    /**
     * OPEID Branch
     * <p>
     * Lineage reference object : RORCAMP_OPEID_BRANCH
     * 
     */
    @JsonProperty("opeidBranch")
    public String getOpeidBranch() {
        return opeidBranch;
    }

    /**
     * OPEID Branch
     * <p>
     * Lineage reference object : RORCAMP_OPEID_BRANCH
     * 
     */
    @JsonProperty("opeidBranch")
    public void setOpeidBranch(String opeidBranch) {
        this.opeidBranch = opeidBranch;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withOpeidBranch(String opeidBranch) {
        this.opeidBranch = opeidBranch;
        return this;
    }

    /**
     * Prevent Automatic Pell Calculation
     * <p>
     * Lineage reference object : RORCAMP_TURN_OFF_PELL_IND
     * 
     */
    @JsonProperty("turnOffPellInd")
    public String getTurnOffPellInd() {
        return turnOffPellInd;
    }

    /**
     * Prevent Automatic Pell Calculation
     * <p>
     * Lineage reference object : RORCAMP_TURN_OFF_PELL_IND
     * 
     */
    @JsonProperty("turnOffPellInd")
    public void setTurnOffPellInd(String turnOffPellInd) {
        this.turnOffPellInd = turnOffPellInd;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withTurnOffPellInd(String turnOffPellInd) {
        this.turnOffPellInd = turnOffPellInd;
        return this;
    }

    /**
     * Direct Loan School Code
     * <p>
     * Lineage reference object : RORCAMP_DL_SCHOOL_CODE
     * 
     */
    @JsonProperty("dlSchoolCode")
    public String getDlSchoolCode() {
        return dlSchoolCode;
    }

    /**
     * Direct Loan School Code
     * <p>
     * Lineage reference object : RORCAMP_DL_SCHOOL_CODE
     * 
     */
    @JsonProperty("dlSchoolCode")
    public void setDlSchoolCode(String dlSchoolCode) {
        this.dlSchoolCode = dlSchoolCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withDlSchoolCode(String dlSchoolCode) {
        this.dlSchoolCode = dlSchoolCode;
        return this;
    }

    /**
     * Apply First-Year, First-Time Borrower Rule
     * <p>
     * Lineage reference object : RORCAMP_APPLY_FYFTB_RULE_IND
     * 
     */
    @JsonProperty("applyFyftbRuleInd")
    public String getApplyFyftbRuleInd() {
        return applyFyftbRuleInd;
    }

    /**
     * Apply First-Year, First-Time Borrower Rule
     * <p>
     * Lineage reference object : RORCAMP_APPLY_FYFTB_RULE_IND
     * 
     */
    @JsonProperty("applyFyftbRuleInd")
    public void setApplyFyftbRuleInd(String applyFyftbRuleInd) {
        this.applyFyftbRuleInd = applyFyftbRuleInd;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withApplyFyftbRuleInd(String applyFyftbRuleInd) {
        this.applyFyftbRuleInd = applyFyftbRuleInd;
        return this;
    }

    /**
     * Electronic School Code
     * <p>
     * Lineage reference object : RORCAMP_EL_SCHOOL_CDE
     * 
     */
    @JsonProperty("elSchoolCde")
    public String getElSchoolCde() {
        return elSchoolCde;
    }

    /**
     * Electronic School Code
     * <p>
     * Lineage reference object : RORCAMP_EL_SCHOOL_CDE
     * 
     */
    @JsonProperty("elSchoolCde")
    public void setElSchoolCde(String elSchoolCde) {
        this.elSchoolCde = elSchoolCde;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withElSchoolCde(String elSchoolCde) {
        this.elSchoolCde = elSchoolCde;
        return this;
    }

    /**
     * COD Institutional Cross Reference
     * <p>
     * Lineage reference object : RORCAMP_INST_XREF_IND
     * 
     */
    @JsonProperty("instXrefInd")
    public String getInstXrefInd() {
        return instXrefInd;
    }

    /**
     * COD Institutional Cross Reference
     * <p>
     * Lineage reference object : RORCAMP_INST_XREF_IND
     * 
     */
    @JsonProperty("instXrefInd")
    public void setInstXrefInd(String instXrefInd) {
        this.instXrefInd = instXrefInd;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withInstXrefInd(String instXrefInd) {
        this.instXrefInd = instXrefInd;
        return this;
    }

    /**
     * Return Indicator
     * <p>
     * Lineage reference object : RORCAMP_TITLE_IV_RET_IND
     * 
     */
    @JsonProperty("titleIvRetInd")
    public String getTitleIvRetInd() {
        return titleIvRetInd;
    }

    /**
     * Return Indicator
     * <p>
     * Lineage reference object : RORCAMP_TITLE_IV_RET_IND
     * 
     */
    @JsonProperty("titleIvRetInd")
    public void setTitleIvRetInd(String titleIvRetInd) {
        this.titleIvRetInd = titleIvRetInd;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withTitleIvRetInd(String titleIvRetInd) {
        this.titleIvRetInd = titleIvRetInd;
        return this;
    }

    /**
     * Rounding Indicator
     * <p>
     * Lineage reference object : RORCAMP_TITLE_IV_ROUND_IND
     * 
     */
    @JsonProperty("titleIvRoundInd")
    public String getTitleIvRoundInd() {
        return titleIvRoundInd;
    }

    /**
     * Rounding Indicator
     * <p>
     * Lineage reference object : RORCAMP_TITLE_IV_ROUND_IND
     * 
     */
    @JsonProperty("titleIvRoundInd")
    public void setTitleIvRoundInd(String titleIvRoundInd) {
        this.titleIvRoundInd = titleIvRoundInd;
    }

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withTitleIvRoundInd(String titleIvRoundInd) {
        this.titleIvRoundInd = titleIvRoundInd;
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

    public UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("elBranchCde");
        sb.append('=');
        sb.append(((this.elBranchCde == null)?"<null>":this.elBranchCde));
        sb.append(',');
        sb.append("commonSchoolId");
        sb.append('=');
        sb.append(((this.commonSchoolId == null)?"<null>":this.commonSchoolId));
        sb.append(',');
        sb.append("paymentMethod");
        sb.append('=');
        sb.append(((this.paymentMethod == null)?"<null>":this.paymentMethod));
        sb.append(',');
        sb.append("displayReportingId");
        sb.append('=');
        sb.append(((this.displayReportingId == null)?"<null>":this.displayReportingId));
        sb.append(',');
        sb.append("acadCal");
        sb.append('=');
        sb.append(((this.acadCal == null)?"<null>":this.acadCal));
        sb.append(',');
        sb.append("displaySourceId");
        sb.append('=');
        sb.append(((this.displaySourceId == null)?"<null>":this.displaySourceId));
        sb.append(',');
        sb.append("expectHrs");
        sb.append('=');
        sb.append(((this.expectHrs == null)?"<null>":this.expectHrs));
        sb.append(',');
        sb.append("pellId");
        sb.append('=');
        sb.append(((this.pellId == null)?"<null>":this.pellId));
        sb.append(',');
        sb.append("expectWks");
        sb.append('=');
        sb.append(((this.expectWks == null)?"<null>":this.expectWks));
        sb.append(',');
        sb.append("pellFundCode");
        sb.append('=');
        sb.append(((this.pellFundCode == null)?"<null>":this.pellFundCode));
        sb.append(',');
        sb.append("hrsInYr");
        sb.append('=');
        sb.append(((this.hrsInYr == null)?"<null>":this.hrsInYr));
        sb.append(',');
        sb.append("fedSchoolCode");
        sb.append('=');
        sb.append(((this.fedSchoolCode == null)?"<null>":this.fedSchoolCode));
        sb.append(',');
        sb.append("wksInYr");
        sb.append('=');
        sb.append(((this.wksInYr == null)?"<null>":this.wksInYr));
        sb.append(',');
        sb.append("opeid");
        sb.append('=');
        sb.append(((this.opeid == null)?"<null>":this.opeid));
        sb.append(',');
        sb.append("displayNbrMthsPay");
        sb.append('=');
        sb.append(((this.displayNbrMthsPay == null)?"<null>":this.displayNbrMthsPay));
        sb.append(',');
        sb.append("opeidBranch");
        sb.append('=');
        sb.append(((this.opeidBranch == null)?"<null>":this.opeidBranch));
        sb.append(',');
        sb.append("turnOffPellInd");
        sb.append('=');
        sb.append(((this.turnOffPellInd == null)?"<null>":this.turnOffPellInd));
        sb.append(',');
        sb.append("dlSchoolCode");
        sb.append('=');
        sb.append(((this.dlSchoolCode == null)?"<null>":this.dlSchoolCode));
        sb.append(',');
        sb.append("applyFyftbRuleInd");
        sb.append('=');
        sb.append(((this.applyFyftbRuleInd == null)?"<null>":this.applyFyftbRuleInd));
        sb.append(',');
        sb.append("elSchoolCde");
        sb.append('=');
        sb.append(((this.elSchoolCde == null)?"<null>":this.elSchoolCde));
        sb.append(',');
        sb.append("instXrefInd");
        sb.append('=');
        sb.append(((this.instXrefInd == null)?"<null>":this.instXrefInd));
        sb.append(',');
        sb.append("titleIvRetInd");
        sb.append('=');
        sb.append(((this.titleIvRetInd == null)?"<null>":this.titleIvRetInd));
        sb.append(',');
        sb.append("titleIvRoundInd");
        sb.append('=');
        sb.append(((this.titleIvRoundInd == null)?"<null>":this.titleIvRoundInd));
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
        result = ((result* 31)+((this.pellFundCode == null)? 0 :this.pellFundCode.hashCode()));
        result = ((result* 31)+((this.elBranchCde == null)? 0 :this.elBranchCde.hashCode()));
        result = ((result* 31)+((this.wksInYr == null)? 0 :this.wksInYr.hashCode()));
        result = ((result* 31)+((this.expectWks == null)? 0 :this.expectWks.hashCode()));
        result = ((result* 31)+((this.turnOffPellInd == null)? 0 :this.turnOffPellInd.hashCode()));
        result = ((result* 31)+((this.commonSchoolId == null)? 0 :this.commonSchoolId.hashCode()));
        result = ((result* 31)+((this.pellId == null)? 0 :this.pellId.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.elSchoolCde == null)? 0 :this.elSchoolCde.hashCode()));
        result = ((result* 31)+((this.instXrefInd == null)? 0 :this.instXrefInd.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.fedSchoolCode == null)? 0 :this.fedSchoolCode.hashCode()));
        result = ((result* 31)+((this.expectHrs == null)? 0 :this.expectHrs.hashCode()));
        result = ((result* 31)+((this.dlSchoolCode == null)? 0 :this.dlSchoolCode.hashCode()));
        result = ((result* 31)+((this.displayReportingId == null)? 0 :this.displayReportingId.hashCode()));
        result = ((result* 31)+((this.titleIvRetInd == null)? 0 :this.titleIvRetInd.hashCode()));
        result = ((result* 31)+((this.hrsInYr == null)? 0 :this.hrsInYr.hashCode()));
        result = ((result* 31)+((this.displaySourceId == null)? 0 :this.displaySourceId.hashCode()));
        result = ((result* 31)+((this.applyFyftbRuleInd == null)? 0 :this.applyFyftbRuleInd.hashCode()));
        result = ((result* 31)+((this.opeidBranch == null)? 0 :this.opeidBranch.hashCode()));
        result = ((result* 31)+((this.displayNbrMthsPay == null)? 0 :this.displayNbrMthsPay.hashCode()));
        result = ((result* 31)+((this.opeid == null)? 0 :this.opeid.hashCode()));
        result = ((result* 31)+((this.titleIvRoundInd == null)? 0 :this.titleIvRoundInd.hashCode()));
        result = ((result* 31)+((this.acadCal == null)? 0 :this.acadCal.hashCode()));
        result = ((result* 31)+((this.paymentMethod == null)? 0 :this.paymentMethod.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost) == false) {
            return false;
        }
        UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost rhs = ((UsSpecificInstitutionFinancialAidOptionsCampusDetails100QapiPost) other);
        return (((((((((((((((((((((((((((this.pellFundCode == rhs.pellFundCode)||((this.pellFundCode!= null)&&this.pellFundCode.equals(rhs.pellFundCode)))&&((this.elBranchCde == rhs.elBranchCde)||((this.elBranchCde!= null)&&this.elBranchCde.equals(rhs.elBranchCde))))&&((this.wksInYr == rhs.wksInYr)||((this.wksInYr!= null)&&this.wksInYr.equals(rhs.wksInYr))))&&((this.expectWks == rhs.expectWks)||((this.expectWks!= null)&&this.expectWks.equals(rhs.expectWks))))&&((this.turnOffPellInd == rhs.turnOffPellInd)||((this.turnOffPellInd!= null)&&this.turnOffPellInd.equals(rhs.turnOffPellInd))))&&((this.commonSchoolId == rhs.commonSchoolId)||((this.commonSchoolId!= null)&&this.commonSchoolId.equals(rhs.commonSchoolId))))&&((this.pellId == rhs.pellId)||((this.pellId!= null)&&this.pellId.equals(rhs.pellId))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.elSchoolCde == rhs.elSchoolCde)||((this.elSchoolCde!= null)&&this.elSchoolCde.equals(rhs.elSchoolCde))))&&((this.instXrefInd == rhs.instXrefInd)||((this.instXrefInd!= null)&&this.instXrefInd.equals(rhs.instXrefInd))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.fedSchoolCode == rhs.fedSchoolCode)||((this.fedSchoolCode!= null)&&this.fedSchoolCode.equals(rhs.fedSchoolCode))))&&((this.expectHrs == rhs.expectHrs)||((this.expectHrs!= null)&&this.expectHrs.equals(rhs.expectHrs))))&&((this.dlSchoolCode == rhs.dlSchoolCode)||((this.dlSchoolCode!= null)&&this.dlSchoolCode.equals(rhs.dlSchoolCode))))&&((this.displayReportingId == rhs.displayReportingId)||((this.displayReportingId!= null)&&this.displayReportingId.equals(rhs.displayReportingId))))&&((this.titleIvRetInd == rhs.titleIvRetInd)||((this.titleIvRetInd!= null)&&this.titleIvRetInd.equals(rhs.titleIvRetInd))))&&((this.hrsInYr == rhs.hrsInYr)||((this.hrsInYr!= null)&&this.hrsInYr.equals(rhs.hrsInYr))))&&((this.displaySourceId == rhs.displaySourceId)||((this.displaySourceId!= null)&&this.displaySourceId.equals(rhs.displaySourceId))))&&((this.applyFyftbRuleInd == rhs.applyFyftbRuleInd)||((this.applyFyftbRuleInd!= null)&&this.applyFyftbRuleInd.equals(rhs.applyFyftbRuleInd))))&&((this.opeidBranch == rhs.opeidBranch)||((this.opeidBranch!= null)&&this.opeidBranch.equals(rhs.opeidBranch))))&&((this.displayNbrMthsPay == rhs.displayNbrMthsPay)||((this.displayNbrMthsPay!= null)&&this.displayNbrMthsPay.equals(rhs.displayNbrMthsPay))))&&((this.opeid == rhs.opeid)||((this.opeid!= null)&&this.opeid.equals(rhs.opeid))))&&((this.titleIvRoundInd == rhs.titleIvRoundInd)||((this.titleIvRoundInd!= null)&&this.titleIvRoundInd.equals(rhs.titleIvRoundInd))))&&((this.acadCal == rhs.acadCal)||((this.acadCal!= null)&&this.acadCal.equals(rhs.acadCal))))&&((this.paymentMethod == rhs.paymentMethod)||((this.paymentMethod!= null)&&this.paymentMethod.equals(rhs.paymentMethod))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
