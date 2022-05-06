
package com.ellucian.generated.bpapi.ban.benefits_and_deductions_rules.v1_0_0;

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
    "amt1Ind",
    "amt1Desc",
    "amt5Title",
    "bdtyCode",
    "week5Ind",
    "amt5Ind",
    "option2Ind",
    "option5Ind",
    "week2Ind",
    "ytdStartMonth",
    "bdclCode",
    "overloadInd",
    "amt6Title",
    "acaMlyPremSelfAmt",
    "amt2Ind",
    "dispWebPaystubInd",
    "amt3Desc",
    "amt6Ind",
    "week4Ind",
    "priority",
    "option1Ind",
    "amt4WebDesc",
    "option1Title",
    "option4Title",
    "option1WebDesc",
    "amt2Desc",
    "week1Ind",
    "shortDesc",
    "amt2WebDesc",
    "amt6WebDesc",
    "beneficiaryInd",
    "1099Code",
    "option5WebDesc",
    "amt3Ind",
    "coverageInd",
    "option3WebDesc",
    "option4WebDesc",
    "calcRule",
    "amt5Desc",
    "amt7Ind",
    "option2WebDesc",
    "amt2Title",
    "option3Title",
    "option4Ind",
    "applgrossWpaystbInd",
    "acaOfferCoverageCde",
    "amt7Desc",
    "amt3Title",
    "amt4Desc",
    "arrearInd",
    "aca4980hSafeHbrCde",
    "option2Title",
    "acaHealthProvidrInd",
    "amt1Title",
    "webDesc",
    "amt4Title",
    "amt7Title",
    "option5Title",
    "amt4Ind",
    "option3Ind",
    "webInfoUrl",
    "amt3WebDesc",
    "amt5WebDesc",
    "week3Ind",
    "benefitInd",
    "txcdCode",
    "bdclDesc",
    "amt1WebDesc",
    "amt7WebDesc",
    "amt6Desc",
    "longDesc"
})
@Generated("jsonschema2pojo")
public class BenefitsAndDeductionsRules100GetResponse {

    /**
     * Entry
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_IND
     * (Required)
     * 
     */
    @JsonProperty("amt1Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT1_IND")
    private String amt1Ind;
    /**
     * Description
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_DESC
     * 
     */
    @JsonProperty("amt1Desc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT1_DESC")
    private String amt1Desc;
    /**
     * Lineage reference object : PTRBDCA_AMT5_TITLE
     * 
     */
    @JsonProperty("amt5Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT5_TITLE")
    private String amt5Title;
    /**
     * Deduction Type
     * <p>
     * Lineage reference object : PTRBDCA_BDTY_CODE, Lookup lineage reference object : ptvbdty
     * 
     */
    @JsonProperty("bdtyCode")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_BDTY_CODE, Lookup lineage reference object : ptvbdty")
    private String bdtyCode;
    /**
     * Payroll Period 5
     * <p>
     * Lineage reference object : PTRBDCA_WEEK5_IND
     * 
     */
    @JsonProperty("week5Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_WEEK5_IND")
    private String week5Ind;
    /**
     * Lineage reference object : PTRBDCA_AMT5_IND
     * 
     */
    @JsonProperty("amt5Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT5_IND")
    private String amt5Ind;
    /**
     * Lineage reference object : PTRBDCA_OPTION2_IND
     * (Required)
     * 
     */
    @JsonProperty("option2Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION2_IND")
    private String option2Ind;
    /**
     * Lineage reference object : PTRBDCA_OPTION5_IND
     * (Required)
     * 
     */
    @JsonProperty("option5Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION5_IND")
    private String option5Ind;
    /**
     * Payroll Period 2
     * <p>
     * Lineage reference object : PTRBDCA_WEEK2_IND
     * 
     */
    @JsonProperty("week2Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_WEEK2_IND")
    private String week2Ind;
    /**
     * Year-To-Date Start Month Indicator
     * <p>
     * Lineage reference object : PTRBDCA_YTD_START_MONTH
     * 
     */
    @JsonProperty("ytdStartMonth")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_YTD_START_MONTH")
    private Double ytdStartMonth;
    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDCA_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_BDCL_CODE")
    private String bdclCode;
    /**
     * Exclude from Overload Jobs
     * <p>
     * Lineage reference object : PTRBDCA_OVERLOAD_IND
     * 
     */
    @JsonProperty("overloadInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OVERLOAD_IND")
    private String overloadInd;
    /**
     * Lineage reference object : PTRBDCA_AMT6_TITLE
     * 
     */
    @JsonProperty("amt6Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT6_TITLE")
    private String amt6Title;
    /**
     * Lineage reference object : PTRBDCA_ACA_MLY_PREM_SELF_AMT
     * 
     */
    @JsonProperty("acaMlyPremSelfAmt")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_ACA_MLY_PREM_SELF_AMT")
    private Double acaMlyPremSelfAmt;
    /**
     * Lineage reference object : PTRBDCA_AMT2_IND
     * (Required)
     * 
     */
    @JsonProperty("amt2Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT2_IND")
    private String amt2Ind;
    /**
     * Display on Web Pay Stub
     * <p>
     * Lineage reference object : PTRBDCA_DISP_WEB_PAYSTUB_IND
     * 
     */
    @JsonProperty("dispWebPaystubInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_DISP_WEB_PAYSTUB_IND")
    private String dispWebPaystubInd;
    /**
     * Lineage reference object : PTRBDCA_AMT3_DESC
     * 
     */
    @JsonProperty("amt3Desc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT3_DESC")
    private String amt3Desc;
    /**
     * Lineage reference object : PTRBDCA_AMT6_IND
     * 
     */
    @JsonProperty("amt6Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT6_IND")
    private String amt6Ind;
    /**
     * Payroll Period 4
     * <p>
     * Lineage reference object : PTRBDCA_WEEK4_IND
     * 
     */
    @JsonProperty("week4Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_WEEK4_IND")
    private String week4Ind;
    /**
     * Priority
     * <p>
     * Lineage reference object : PTRBDCA_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_PRIORITY")
    private Double priority;
    /**
     * Entry
     * <p>
     * Lineage reference object : PTRBDCA_OPTION1_IND
     * (Required)
     * 
     */
    @JsonProperty("option1Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION1_IND")
    private String option1Ind;
    /**
     * Amount 4
     * <p>
     * Lineage reference object : PTRBDCA_AMT4_WEB_DESC
     * 
     */
    @JsonProperty("amt4WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT4_WEB_DESC")
    private String amt4WebDesc;
    /**
     * Title
     * <p>
     * Lineage reference object : PTRBDCA_OPTION1_TITLE
     * 
     */
    @JsonProperty("option1Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION1_TITLE")
    private String option1Title;
    /**
     * Lineage reference object : PTRBDCA_OPTION4_TITLE
     * 
     */
    @JsonProperty("option4Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION4_TITLE")
    private String option4Title;
    /**
     * Option 1
     * <p>
     * Lineage reference object : PTRBDCA_OPTION1_WEB_DESC
     * 
     */
    @JsonProperty("option1WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION1_WEB_DESC")
    private String option1WebDesc;
    /**
     * Lineage reference object : PTRBDCA_AMT2_DESC
     * 
     */
    @JsonProperty("amt2Desc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT2_DESC")
    private String amt2Desc;
    /**
     * Payroll Period 1
     * <p>
     * Lineage reference object : PTRBDCA_WEEK1_IND
     * 
     */
    @JsonProperty("week1Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_WEEK1_IND")
    private String week1Ind;
    /**
     * Short
     * <p>
     * Lineage reference object : PTRBDCA_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_SHORT_DESC")
    private String shortDesc;
    /**
     * Amount 2
     * <p>
     * Lineage reference object : PTRBDCA_AMT2_WEB_DESC
     * 
     */
    @JsonProperty("amt2WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT2_WEB_DESC")
    private String amt2WebDesc;
    /**
     * Lineage reference object : PTRBDCA_AMT6_WEB_DESC
     * 
     */
    @JsonProperty("amt6WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT6_WEB_DESC")
    private String amt6WebDesc;
    /**
     * Allocations
     * <p>
     * Lineage reference object : PTRBDCA_BENEFICIARY_IND
     * 
     */
    @JsonProperty("beneficiaryInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_BENEFICIARY_IND")
    private String beneficiaryInd;
    /**
     *  1099-R Code
     * <p>
     * Lineage reference object : PTRBDCA_1099_CODE, Lookup lineage reference object : ptv1099
     * 
     */
    @JsonProperty("1099Code")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_1099_CODE, Lookup lineage reference object : ptv1099")
    private String _1099Code;
    /**
     * Option 5
     * <p>
     * Lineage reference object : PTRBDCA_OPTION5_WEB_DESC
     * 
     */
    @JsonProperty("option5WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION5_WEB_DESC")
    private String option5WebDesc;
    /**
     * Lineage reference object : PTRBDCA_AMT3_IND
     * (Required)
     * 
     */
    @JsonProperty("amt3Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT3_IND")
    private String amt3Ind;
    /**
     * Coverage
     * <p>
     * Lineage reference object : PTRBDCA_COVERAGE_IND
     * 
     */
    @JsonProperty("coverageInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_COVERAGE_IND")
    private String coverageInd;
    /**
     * Option 3
     * <p>
     * Lineage reference object : PTRBDCA_OPTION3_WEB_DESC
     * 
     */
    @JsonProperty("option3WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION3_WEB_DESC")
    private String option3WebDesc;
    /**
     * Option 4
     * <p>
     * Lineage reference object : PTRBDCA_OPTION4_WEB_DESC
     * 
     */
    @JsonProperty("option4WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION4_WEB_DESC")
    private String option4WebDesc;
    /**
     * Calculation Rule
     * <p>
     * Lineage reference object : PTRBDCA_CALC_RULE
     * (Required)
     * 
     */
    @JsonProperty("calcRule")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_CALC_RULE")
    private String calcRule;
    /**
     * Lineage reference object : PTRBDCA_AMT5_DESC
     * 
     */
    @JsonProperty("amt5Desc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT5_DESC")
    private String amt5Desc;
    /**
     * Lineage reference object : PTRBDCA_AMT7_IND
     * 
     */
    @JsonProperty("amt7Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT7_IND")
    private String amt7Ind;
    /**
     * Option 2
     * <p>
     * Lineage reference object : PTRBDCA_OPTION2_WEB_DESC
     * 
     */
    @JsonProperty("option2WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION2_WEB_DESC")
    private String option2WebDesc;
    /**
     * Lineage reference object : PTRBDCA_AMT2_TITLE
     * 
     */
    @JsonProperty("amt2Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT2_TITLE")
    private String amt2Title;
    /**
     * Lineage reference object : PTRBDCA_OPTION3_TITLE
     * 
     */
    @JsonProperty("option3Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION3_TITLE")
    private String option3Title;
    /**
     * Lineage reference object : PTRBDCA_OPTION4_IND
     * (Required)
     * 
     */
    @JsonProperty("option4Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION4_IND")
    private String option4Ind;
    /**
     * Display Applicable Gross on Web Pay Stub
     * <p>
     * Lineage reference object : PTRBDCA_APPLGROSS_WPAYSTB_IND
     * 
     */
    @JsonProperty("applgrossWpaystbInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_APPLGROSS_WPAYSTB_IND")
    private String applgrossWpaystbInd;
    /**
     * Lineage reference object : PTRBDCA_ACA_OFFER_COVERAGE_CDE
     * 
     */
    @JsonProperty("acaOfferCoverageCde")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_ACA_OFFER_COVERAGE_CDE")
    private String acaOfferCoverageCde;
    /**
     * Lineage reference object : PTRBDCA_AMT7_DESC
     * 
     */
    @JsonProperty("amt7Desc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT7_DESC")
    private String amt7Desc;
    /**
     * Lineage reference object : PTRBDCA_AMT3_TITLE
     * 
     */
    @JsonProperty("amt3Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT3_TITLE")
    private String amt3Title;
    /**
     * Lineage reference object : PTRBDCA_AMT4_DESC
     * 
     */
    @JsonProperty("amt4Desc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT4_DESC")
    private String amt4Desc;
    /**
     * Arrearage Method
     * <p>
     * Lineage reference object : PTRBDCA_ARREAR_IND
     * (Required)
     * 
     */
    @JsonProperty("arrearInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_ARREAR_IND")
    private String arrearInd;
    /**
     * Lineage reference object : PTRBDCA_ACA_4980H_SAFE_HBR_CDE
     * 
     */
    @JsonProperty("aca4980hSafeHbrCde")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_ACA_4980H_SAFE_HBR_CDE")
    private String aca4980hSafeHbrCde;
    /**
     * Lineage reference object : PTRBDCA_OPTION2_TITLE
     * 
     */
    @JsonProperty("option2Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION2_TITLE")
    private String option2Title;
    /**
     * Lineage reference object : PTRBDCA_ACA_HEALTH_PROVIDR_IND
     * 
     */
    @JsonProperty("acaHealthProvidrInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_ACA_HEALTH_PROVIDR_IND")
    private String acaHealthProvidrInd;
    /**
     * Title
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_TITLE
     * 
     */
    @JsonProperty("amt1Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT1_TITLE")
    private String amt1Title;
    /**
     * Web Description
     * <p>
     * Lineage reference object : PTRBDCA_WEB_DESC
     * 
     */
    @JsonProperty("webDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_WEB_DESC")
    private String webDesc;
    /**
     * Lineage reference object : PTRBDCA_AMT4_TITLE
     * 
     */
    @JsonProperty("amt4Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT4_TITLE")
    private String amt4Title;
    /**
     * Lineage reference object : PTRBDCA_AMT7_TITLE
     * 
     */
    @JsonProperty("amt7Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT7_TITLE")
    private String amt7Title;
    /**
     * Lineage reference object : PTRBDCA_OPTION5_TITLE
     * 
     */
    @JsonProperty("option5Title")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION5_TITLE")
    private String option5Title;
    /**
     * Lineage reference object : PTRBDCA_AMT4_IND
     * (Required)
     * 
     */
    @JsonProperty("amt4Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT4_IND")
    private String amt4Ind;
    /**
     * Lineage reference object : PTRBDCA_OPTION3_IND
     * (Required)
     * 
     */
    @JsonProperty("option3Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_OPTION3_IND")
    private String option3Ind;
    /**
     * Web Information URL
     * <p>
     * Lineage reference object : PTRBDCA_WEB_INFO_URL
     * 
     */
    @JsonProperty("webInfoUrl")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_WEB_INFO_URL")
    private String webInfoUrl;
    /**
     * Amount 3
     * <p>
     * Lineage reference object : PTRBDCA_AMT3_WEB_DESC
     * 
     */
    @JsonProperty("amt3WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT3_WEB_DESC")
    private String amt3WebDesc;
    /**
     * Lineage reference object : PTRBDCA_AMT5_WEB_DESC
     * 
     */
    @JsonProperty("amt5WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT5_WEB_DESC")
    private String amt5WebDesc;
    /**
     * Payroll Period 3
     * <p>
     * Lineage reference object : PTRBDCA_WEEK3_IND
     * 
     */
    @JsonProperty("week3Ind")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_WEEK3_IND")
    private String week3Ind;
    /**
     * Continue Employer Contributions when on Leave with Benefits
     * <p>
     * Lineage reference object : PTRBDCA_BENEFIT_IND
     * 
     */
    @JsonProperty("benefitInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_BENEFIT_IND")
    private String benefitInd;
    /**
     * Tax Code
     * <p>
     * Lineage reference object : PTRBDCA_TXCD_CODE
     * 
     */
    @JsonProperty("txcdCode")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_TXCD_CODE")
    private String txcdCode;
    @JsonProperty("bdclDesc")
    private String bdclDesc;
    /**
     * Amount 1
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_WEB_DESC
     * 
     */
    @JsonProperty("amt1WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT1_WEB_DESC")
    private String amt1WebDesc;
    /**
     * Lineage reference object : PTRBDCA_AMT7_WEB_DESC
     * 
     */
    @JsonProperty("amt7WebDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT7_WEB_DESC")
    private String amt7WebDesc;
    /**
     * Lineage reference object : PTRBDCA_AMT6_DESC
     * 
     */
    @JsonProperty("amt6Desc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_AMT6_DESC")
    private String amt6Desc;
    /**
     * Long
     * <p>
     * Lineage reference object : PTRBDCA_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    @JsonPropertyDescription("Lineage reference object : PTRBDCA_LONG_DESC")
    private String longDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Entry
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_IND
     * (Required)
     * 
     */
    @JsonProperty("amt1Ind")
    public String getAmt1Ind() {
        return amt1Ind;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_IND
     * (Required)
     * 
     */
    @JsonProperty("amt1Ind")
    public void setAmt1Ind(String amt1Ind) {
        this.amt1Ind = amt1Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt1Ind(String amt1Ind) {
        this.amt1Ind = amt1Ind;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_DESC
     * 
     */
    @JsonProperty("amt1Desc")
    public String getAmt1Desc() {
        return amt1Desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_DESC
     * 
     */
    @JsonProperty("amt1Desc")
    public void setAmt1Desc(String amt1Desc) {
        this.amt1Desc = amt1Desc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt1Desc(String amt1Desc) {
        this.amt1Desc = amt1Desc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT5_TITLE
     * 
     */
    @JsonProperty("amt5Title")
    public String getAmt5Title() {
        return amt5Title;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT5_TITLE
     * 
     */
    @JsonProperty("amt5Title")
    public void setAmt5Title(String amt5Title) {
        this.amt5Title = amt5Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt5Title(String amt5Title) {
        this.amt5Title = amt5Title;
        return this;
    }

    /**
     * Deduction Type
     * <p>
     * Lineage reference object : PTRBDCA_BDTY_CODE, Lookup lineage reference object : ptvbdty
     * 
     */
    @JsonProperty("bdtyCode")
    public String getBdtyCode() {
        return bdtyCode;
    }

    /**
     * Deduction Type
     * <p>
     * Lineage reference object : PTRBDCA_BDTY_CODE, Lookup lineage reference object : ptvbdty
     * 
     */
    @JsonProperty("bdtyCode")
    public void setBdtyCode(String bdtyCode) {
        this.bdtyCode = bdtyCode;
    }

    public BenefitsAndDeductionsRules100GetResponse withBdtyCode(String bdtyCode) {
        this.bdtyCode = bdtyCode;
        return this;
    }

    /**
     * Payroll Period 5
     * <p>
     * Lineage reference object : PTRBDCA_WEEK5_IND
     * 
     */
    @JsonProperty("week5Ind")
    public String getWeek5Ind() {
        return week5Ind;
    }

    /**
     * Payroll Period 5
     * <p>
     * Lineage reference object : PTRBDCA_WEEK5_IND
     * 
     */
    @JsonProperty("week5Ind")
    public void setWeek5Ind(String week5Ind) {
        this.week5Ind = week5Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withWeek5Ind(String week5Ind) {
        this.week5Ind = week5Ind;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT5_IND
     * 
     */
    @JsonProperty("amt5Ind")
    public String getAmt5Ind() {
        return amt5Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT5_IND
     * 
     */
    @JsonProperty("amt5Ind")
    public void setAmt5Ind(String amt5Ind) {
        this.amt5Ind = amt5Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt5Ind(String amt5Ind) {
        this.amt5Ind = amt5Ind;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION2_IND
     * (Required)
     * 
     */
    @JsonProperty("option2Ind")
    public String getOption2Ind() {
        return option2Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION2_IND
     * (Required)
     * 
     */
    @JsonProperty("option2Ind")
    public void setOption2Ind(String option2Ind) {
        this.option2Ind = option2Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption2Ind(String option2Ind) {
        this.option2Ind = option2Ind;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION5_IND
     * (Required)
     * 
     */
    @JsonProperty("option5Ind")
    public String getOption5Ind() {
        return option5Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION5_IND
     * (Required)
     * 
     */
    @JsonProperty("option5Ind")
    public void setOption5Ind(String option5Ind) {
        this.option5Ind = option5Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption5Ind(String option5Ind) {
        this.option5Ind = option5Ind;
        return this;
    }

    /**
     * Payroll Period 2
     * <p>
     * Lineage reference object : PTRBDCA_WEEK2_IND
     * 
     */
    @JsonProperty("week2Ind")
    public String getWeek2Ind() {
        return week2Ind;
    }

    /**
     * Payroll Period 2
     * <p>
     * Lineage reference object : PTRBDCA_WEEK2_IND
     * 
     */
    @JsonProperty("week2Ind")
    public void setWeek2Ind(String week2Ind) {
        this.week2Ind = week2Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withWeek2Ind(String week2Ind) {
        this.week2Ind = week2Ind;
        return this;
    }

    /**
     * Year-To-Date Start Month Indicator
     * <p>
     * Lineage reference object : PTRBDCA_YTD_START_MONTH
     * 
     */
    @JsonProperty("ytdStartMonth")
    public Double getYtdStartMonth() {
        return ytdStartMonth;
    }

    /**
     * Year-To-Date Start Month Indicator
     * <p>
     * Lineage reference object : PTRBDCA_YTD_START_MONTH
     * 
     */
    @JsonProperty("ytdStartMonth")
    public void setYtdStartMonth(Double ytdStartMonth) {
        this.ytdStartMonth = ytdStartMonth;
    }

    public BenefitsAndDeductionsRules100GetResponse withYtdStartMonth(Double ytdStartMonth) {
        this.ytdStartMonth = ytdStartMonth;
        return this;
    }

    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDCA_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    public String getBdclCode() {
        return bdclCode;
    }

    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDCA_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    public void setBdclCode(String bdclCode) {
        this.bdclCode = bdclCode;
    }

    public BenefitsAndDeductionsRules100GetResponse withBdclCode(String bdclCode) {
        this.bdclCode = bdclCode;
        return this;
    }

    /**
     * Exclude from Overload Jobs
     * <p>
     * Lineage reference object : PTRBDCA_OVERLOAD_IND
     * 
     */
    @JsonProperty("overloadInd")
    public String getOverloadInd() {
        return overloadInd;
    }

    /**
     * Exclude from Overload Jobs
     * <p>
     * Lineage reference object : PTRBDCA_OVERLOAD_IND
     * 
     */
    @JsonProperty("overloadInd")
    public void setOverloadInd(String overloadInd) {
        this.overloadInd = overloadInd;
    }

    public BenefitsAndDeductionsRules100GetResponse withOverloadInd(String overloadInd) {
        this.overloadInd = overloadInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT6_TITLE
     * 
     */
    @JsonProperty("amt6Title")
    public String getAmt6Title() {
        return amt6Title;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT6_TITLE
     * 
     */
    @JsonProperty("amt6Title")
    public void setAmt6Title(String amt6Title) {
        this.amt6Title = amt6Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt6Title(String amt6Title) {
        this.amt6Title = amt6Title;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_ACA_MLY_PREM_SELF_AMT
     * 
     */
    @JsonProperty("acaMlyPremSelfAmt")
    public Double getAcaMlyPremSelfAmt() {
        return acaMlyPremSelfAmt;
    }

    /**
     * Lineage reference object : PTRBDCA_ACA_MLY_PREM_SELF_AMT
     * 
     */
    @JsonProperty("acaMlyPremSelfAmt")
    public void setAcaMlyPremSelfAmt(Double acaMlyPremSelfAmt) {
        this.acaMlyPremSelfAmt = acaMlyPremSelfAmt;
    }

    public BenefitsAndDeductionsRules100GetResponse withAcaMlyPremSelfAmt(Double acaMlyPremSelfAmt) {
        this.acaMlyPremSelfAmt = acaMlyPremSelfAmt;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT2_IND
     * (Required)
     * 
     */
    @JsonProperty("amt2Ind")
    public String getAmt2Ind() {
        return amt2Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT2_IND
     * (Required)
     * 
     */
    @JsonProperty("amt2Ind")
    public void setAmt2Ind(String amt2Ind) {
        this.amt2Ind = amt2Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt2Ind(String amt2Ind) {
        this.amt2Ind = amt2Ind;
        return this;
    }

    /**
     * Display on Web Pay Stub
     * <p>
     * Lineage reference object : PTRBDCA_DISP_WEB_PAYSTUB_IND
     * 
     */
    @JsonProperty("dispWebPaystubInd")
    public String getDispWebPaystubInd() {
        return dispWebPaystubInd;
    }

    /**
     * Display on Web Pay Stub
     * <p>
     * Lineage reference object : PTRBDCA_DISP_WEB_PAYSTUB_IND
     * 
     */
    @JsonProperty("dispWebPaystubInd")
    public void setDispWebPaystubInd(String dispWebPaystubInd) {
        this.dispWebPaystubInd = dispWebPaystubInd;
    }

    public BenefitsAndDeductionsRules100GetResponse withDispWebPaystubInd(String dispWebPaystubInd) {
        this.dispWebPaystubInd = dispWebPaystubInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT3_DESC
     * 
     */
    @JsonProperty("amt3Desc")
    public String getAmt3Desc() {
        return amt3Desc;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT3_DESC
     * 
     */
    @JsonProperty("amt3Desc")
    public void setAmt3Desc(String amt3Desc) {
        this.amt3Desc = amt3Desc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt3Desc(String amt3Desc) {
        this.amt3Desc = amt3Desc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT6_IND
     * 
     */
    @JsonProperty("amt6Ind")
    public String getAmt6Ind() {
        return amt6Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT6_IND
     * 
     */
    @JsonProperty("amt6Ind")
    public void setAmt6Ind(String amt6Ind) {
        this.amt6Ind = amt6Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt6Ind(String amt6Ind) {
        this.amt6Ind = amt6Ind;
        return this;
    }

    /**
     * Payroll Period 4
     * <p>
     * Lineage reference object : PTRBDCA_WEEK4_IND
     * 
     */
    @JsonProperty("week4Ind")
    public String getWeek4Ind() {
        return week4Ind;
    }

    /**
     * Payroll Period 4
     * <p>
     * Lineage reference object : PTRBDCA_WEEK4_IND
     * 
     */
    @JsonProperty("week4Ind")
    public void setWeek4Ind(String week4Ind) {
        this.week4Ind = week4Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withWeek4Ind(String week4Ind) {
        this.week4Ind = week4Ind;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : PTRBDCA_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : PTRBDCA_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public BenefitsAndDeductionsRules100GetResponse withPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : PTRBDCA_OPTION1_IND
     * (Required)
     * 
     */
    @JsonProperty("option1Ind")
    public String getOption1Ind() {
        return option1Ind;
    }

    /**
     * Entry
     * <p>
     * Lineage reference object : PTRBDCA_OPTION1_IND
     * (Required)
     * 
     */
    @JsonProperty("option1Ind")
    public void setOption1Ind(String option1Ind) {
        this.option1Ind = option1Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption1Ind(String option1Ind) {
        this.option1Ind = option1Ind;
        return this;
    }

    /**
     * Amount 4
     * <p>
     * Lineage reference object : PTRBDCA_AMT4_WEB_DESC
     * 
     */
    @JsonProperty("amt4WebDesc")
    public String getAmt4WebDesc() {
        return amt4WebDesc;
    }

    /**
     * Amount 4
     * <p>
     * Lineage reference object : PTRBDCA_AMT4_WEB_DESC
     * 
     */
    @JsonProperty("amt4WebDesc")
    public void setAmt4WebDesc(String amt4WebDesc) {
        this.amt4WebDesc = amt4WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt4WebDesc(String amt4WebDesc) {
        this.amt4WebDesc = amt4WebDesc;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : PTRBDCA_OPTION1_TITLE
     * 
     */
    @JsonProperty("option1Title")
    public String getOption1Title() {
        return option1Title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : PTRBDCA_OPTION1_TITLE
     * 
     */
    @JsonProperty("option1Title")
    public void setOption1Title(String option1Title) {
        this.option1Title = option1Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption1Title(String option1Title) {
        this.option1Title = option1Title;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION4_TITLE
     * 
     */
    @JsonProperty("option4Title")
    public String getOption4Title() {
        return option4Title;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION4_TITLE
     * 
     */
    @JsonProperty("option4Title")
    public void setOption4Title(String option4Title) {
        this.option4Title = option4Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption4Title(String option4Title) {
        this.option4Title = option4Title;
        return this;
    }

    /**
     * Option 1
     * <p>
     * Lineage reference object : PTRBDCA_OPTION1_WEB_DESC
     * 
     */
    @JsonProperty("option1WebDesc")
    public String getOption1WebDesc() {
        return option1WebDesc;
    }

    /**
     * Option 1
     * <p>
     * Lineage reference object : PTRBDCA_OPTION1_WEB_DESC
     * 
     */
    @JsonProperty("option1WebDesc")
    public void setOption1WebDesc(String option1WebDesc) {
        this.option1WebDesc = option1WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption1WebDesc(String option1WebDesc) {
        this.option1WebDesc = option1WebDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT2_DESC
     * 
     */
    @JsonProperty("amt2Desc")
    public String getAmt2Desc() {
        return amt2Desc;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT2_DESC
     * 
     */
    @JsonProperty("amt2Desc")
    public void setAmt2Desc(String amt2Desc) {
        this.amt2Desc = amt2Desc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt2Desc(String amt2Desc) {
        this.amt2Desc = amt2Desc;
        return this;
    }

    /**
     * Payroll Period 1
     * <p>
     * Lineage reference object : PTRBDCA_WEEK1_IND
     * 
     */
    @JsonProperty("week1Ind")
    public String getWeek1Ind() {
        return week1Ind;
    }

    /**
     * Payroll Period 1
     * <p>
     * Lineage reference object : PTRBDCA_WEEK1_IND
     * 
     */
    @JsonProperty("week1Ind")
    public void setWeek1Ind(String week1Ind) {
        this.week1Ind = week1Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withWeek1Ind(String week1Ind) {
        this.week1Ind = week1Ind;
        return this;
    }

    /**
     * Short
     * <p>
     * Lineage reference object : PTRBDCA_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Short
     * <p>
     * Lineage reference object : PTRBDCA_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        return this;
    }

    /**
     * Amount 2
     * <p>
     * Lineage reference object : PTRBDCA_AMT2_WEB_DESC
     * 
     */
    @JsonProperty("amt2WebDesc")
    public String getAmt2WebDesc() {
        return amt2WebDesc;
    }

    /**
     * Amount 2
     * <p>
     * Lineage reference object : PTRBDCA_AMT2_WEB_DESC
     * 
     */
    @JsonProperty("amt2WebDesc")
    public void setAmt2WebDesc(String amt2WebDesc) {
        this.amt2WebDesc = amt2WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt2WebDesc(String amt2WebDesc) {
        this.amt2WebDesc = amt2WebDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT6_WEB_DESC
     * 
     */
    @JsonProperty("amt6WebDesc")
    public String getAmt6WebDesc() {
        return amt6WebDesc;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT6_WEB_DESC
     * 
     */
    @JsonProperty("amt6WebDesc")
    public void setAmt6WebDesc(String amt6WebDesc) {
        this.amt6WebDesc = amt6WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt6WebDesc(String amt6WebDesc) {
        this.amt6WebDesc = amt6WebDesc;
        return this;
    }

    /**
     * Allocations
     * <p>
     * Lineage reference object : PTRBDCA_BENEFICIARY_IND
     * 
     */
    @JsonProperty("beneficiaryInd")
    public String getBeneficiaryInd() {
        return beneficiaryInd;
    }

    /**
     * Allocations
     * <p>
     * Lineage reference object : PTRBDCA_BENEFICIARY_IND
     * 
     */
    @JsonProperty("beneficiaryInd")
    public void setBeneficiaryInd(String beneficiaryInd) {
        this.beneficiaryInd = beneficiaryInd;
    }

    public BenefitsAndDeductionsRules100GetResponse withBeneficiaryInd(String beneficiaryInd) {
        this.beneficiaryInd = beneficiaryInd;
        return this;
    }

    /**
     *  1099-R Code
     * <p>
     * Lineage reference object : PTRBDCA_1099_CODE, Lookup lineage reference object : ptv1099
     * 
     */
    @JsonProperty("1099Code")
    public String get1099Code() {
        return _1099Code;
    }

    /**
     *  1099-R Code
     * <p>
     * Lineage reference object : PTRBDCA_1099_CODE, Lookup lineage reference object : ptv1099
     * 
     */
    @JsonProperty("1099Code")
    public void set1099Code(String _1099Code) {
        this._1099Code = _1099Code;
    }

    public BenefitsAndDeductionsRules100GetResponse with1099Code(String _1099Code) {
        this._1099Code = _1099Code;
        return this;
    }

    /**
     * Option 5
     * <p>
     * Lineage reference object : PTRBDCA_OPTION5_WEB_DESC
     * 
     */
    @JsonProperty("option5WebDesc")
    public String getOption5WebDesc() {
        return option5WebDesc;
    }

    /**
     * Option 5
     * <p>
     * Lineage reference object : PTRBDCA_OPTION5_WEB_DESC
     * 
     */
    @JsonProperty("option5WebDesc")
    public void setOption5WebDesc(String option5WebDesc) {
        this.option5WebDesc = option5WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption5WebDesc(String option5WebDesc) {
        this.option5WebDesc = option5WebDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT3_IND
     * (Required)
     * 
     */
    @JsonProperty("amt3Ind")
    public String getAmt3Ind() {
        return amt3Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT3_IND
     * (Required)
     * 
     */
    @JsonProperty("amt3Ind")
    public void setAmt3Ind(String amt3Ind) {
        this.amt3Ind = amt3Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt3Ind(String amt3Ind) {
        this.amt3Ind = amt3Ind;
        return this;
    }

    /**
     * Coverage
     * <p>
     * Lineage reference object : PTRBDCA_COVERAGE_IND
     * 
     */
    @JsonProperty("coverageInd")
    public String getCoverageInd() {
        return coverageInd;
    }

    /**
     * Coverage
     * <p>
     * Lineage reference object : PTRBDCA_COVERAGE_IND
     * 
     */
    @JsonProperty("coverageInd")
    public void setCoverageInd(String coverageInd) {
        this.coverageInd = coverageInd;
    }

    public BenefitsAndDeductionsRules100GetResponse withCoverageInd(String coverageInd) {
        this.coverageInd = coverageInd;
        return this;
    }

    /**
     * Option 3
     * <p>
     * Lineage reference object : PTRBDCA_OPTION3_WEB_DESC
     * 
     */
    @JsonProperty("option3WebDesc")
    public String getOption3WebDesc() {
        return option3WebDesc;
    }

    /**
     * Option 3
     * <p>
     * Lineage reference object : PTRBDCA_OPTION3_WEB_DESC
     * 
     */
    @JsonProperty("option3WebDesc")
    public void setOption3WebDesc(String option3WebDesc) {
        this.option3WebDesc = option3WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption3WebDesc(String option3WebDesc) {
        this.option3WebDesc = option3WebDesc;
        return this;
    }

    /**
     * Option 4
     * <p>
     * Lineage reference object : PTRBDCA_OPTION4_WEB_DESC
     * 
     */
    @JsonProperty("option4WebDesc")
    public String getOption4WebDesc() {
        return option4WebDesc;
    }

    /**
     * Option 4
     * <p>
     * Lineage reference object : PTRBDCA_OPTION4_WEB_DESC
     * 
     */
    @JsonProperty("option4WebDesc")
    public void setOption4WebDesc(String option4WebDesc) {
        this.option4WebDesc = option4WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption4WebDesc(String option4WebDesc) {
        this.option4WebDesc = option4WebDesc;
        return this;
    }

    /**
     * Calculation Rule
     * <p>
     * Lineage reference object : PTRBDCA_CALC_RULE
     * (Required)
     * 
     */
    @JsonProperty("calcRule")
    public String getCalcRule() {
        return calcRule;
    }

    /**
     * Calculation Rule
     * <p>
     * Lineage reference object : PTRBDCA_CALC_RULE
     * (Required)
     * 
     */
    @JsonProperty("calcRule")
    public void setCalcRule(String calcRule) {
        this.calcRule = calcRule;
    }

    public BenefitsAndDeductionsRules100GetResponse withCalcRule(String calcRule) {
        this.calcRule = calcRule;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT5_DESC
     * 
     */
    @JsonProperty("amt5Desc")
    public String getAmt5Desc() {
        return amt5Desc;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT5_DESC
     * 
     */
    @JsonProperty("amt5Desc")
    public void setAmt5Desc(String amt5Desc) {
        this.amt5Desc = amt5Desc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt5Desc(String amt5Desc) {
        this.amt5Desc = amt5Desc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT7_IND
     * 
     */
    @JsonProperty("amt7Ind")
    public String getAmt7Ind() {
        return amt7Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT7_IND
     * 
     */
    @JsonProperty("amt7Ind")
    public void setAmt7Ind(String amt7Ind) {
        this.amt7Ind = amt7Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt7Ind(String amt7Ind) {
        this.amt7Ind = amt7Ind;
        return this;
    }

    /**
     * Option 2
     * <p>
     * Lineage reference object : PTRBDCA_OPTION2_WEB_DESC
     * 
     */
    @JsonProperty("option2WebDesc")
    public String getOption2WebDesc() {
        return option2WebDesc;
    }

    /**
     * Option 2
     * <p>
     * Lineage reference object : PTRBDCA_OPTION2_WEB_DESC
     * 
     */
    @JsonProperty("option2WebDesc")
    public void setOption2WebDesc(String option2WebDesc) {
        this.option2WebDesc = option2WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption2WebDesc(String option2WebDesc) {
        this.option2WebDesc = option2WebDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT2_TITLE
     * 
     */
    @JsonProperty("amt2Title")
    public String getAmt2Title() {
        return amt2Title;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT2_TITLE
     * 
     */
    @JsonProperty("amt2Title")
    public void setAmt2Title(String amt2Title) {
        this.amt2Title = amt2Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt2Title(String amt2Title) {
        this.amt2Title = amt2Title;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION3_TITLE
     * 
     */
    @JsonProperty("option3Title")
    public String getOption3Title() {
        return option3Title;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION3_TITLE
     * 
     */
    @JsonProperty("option3Title")
    public void setOption3Title(String option3Title) {
        this.option3Title = option3Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption3Title(String option3Title) {
        this.option3Title = option3Title;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION4_IND
     * (Required)
     * 
     */
    @JsonProperty("option4Ind")
    public String getOption4Ind() {
        return option4Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION4_IND
     * (Required)
     * 
     */
    @JsonProperty("option4Ind")
    public void setOption4Ind(String option4Ind) {
        this.option4Ind = option4Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption4Ind(String option4Ind) {
        this.option4Ind = option4Ind;
        return this;
    }

    /**
     * Display Applicable Gross on Web Pay Stub
     * <p>
     * Lineage reference object : PTRBDCA_APPLGROSS_WPAYSTB_IND
     * 
     */
    @JsonProperty("applgrossWpaystbInd")
    public String getApplgrossWpaystbInd() {
        return applgrossWpaystbInd;
    }

    /**
     * Display Applicable Gross on Web Pay Stub
     * <p>
     * Lineage reference object : PTRBDCA_APPLGROSS_WPAYSTB_IND
     * 
     */
    @JsonProperty("applgrossWpaystbInd")
    public void setApplgrossWpaystbInd(String applgrossWpaystbInd) {
        this.applgrossWpaystbInd = applgrossWpaystbInd;
    }

    public BenefitsAndDeductionsRules100GetResponse withApplgrossWpaystbInd(String applgrossWpaystbInd) {
        this.applgrossWpaystbInd = applgrossWpaystbInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_ACA_OFFER_COVERAGE_CDE
     * 
     */
    @JsonProperty("acaOfferCoverageCde")
    public String getAcaOfferCoverageCde() {
        return acaOfferCoverageCde;
    }

    /**
     * Lineage reference object : PTRBDCA_ACA_OFFER_COVERAGE_CDE
     * 
     */
    @JsonProperty("acaOfferCoverageCde")
    public void setAcaOfferCoverageCde(String acaOfferCoverageCde) {
        this.acaOfferCoverageCde = acaOfferCoverageCde;
    }

    public BenefitsAndDeductionsRules100GetResponse withAcaOfferCoverageCde(String acaOfferCoverageCde) {
        this.acaOfferCoverageCde = acaOfferCoverageCde;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT7_DESC
     * 
     */
    @JsonProperty("amt7Desc")
    public String getAmt7Desc() {
        return amt7Desc;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT7_DESC
     * 
     */
    @JsonProperty("amt7Desc")
    public void setAmt7Desc(String amt7Desc) {
        this.amt7Desc = amt7Desc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt7Desc(String amt7Desc) {
        this.amt7Desc = amt7Desc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT3_TITLE
     * 
     */
    @JsonProperty("amt3Title")
    public String getAmt3Title() {
        return amt3Title;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT3_TITLE
     * 
     */
    @JsonProperty("amt3Title")
    public void setAmt3Title(String amt3Title) {
        this.amt3Title = amt3Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt3Title(String amt3Title) {
        this.amt3Title = amt3Title;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT4_DESC
     * 
     */
    @JsonProperty("amt4Desc")
    public String getAmt4Desc() {
        return amt4Desc;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT4_DESC
     * 
     */
    @JsonProperty("amt4Desc")
    public void setAmt4Desc(String amt4Desc) {
        this.amt4Desc = amt4Desc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt4Desc(String amt4Desc) {
        this.amt4Desc = amt4Desc;
        return this;
    }

    /**
     * Arrearage Method
     * <p>
     * Lineage reference object : PTRBDCA_ARREAR_IND
     * (Required)
     * 
     */
    @JsonProperty("arrearInd")
    public String getArrearInd() {
        return arrearInd;
    }

    /**
     * Arrearage Method
     * <p>
     * Lineage reference object : PTRBDCA_ARREAR_IND
     * (Required)
     * 
     */
    @JsonProperty("arrearInd")
    public void setArrearInd(String arrearInd) {
        this.arrearInd = arrearInd;
    }

    public BenefitsAndDeductionsRules100GetResponse withArrearInd(String arrearInd) {
        this.arrearInd = arrearInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_ACA_4980H_SAFE_HBR_CDE
     * 
     */
    @JsonProperty("aca4980hSafeHbrCde")
    public String getAca4980hSafeHbrCde() {
        return aca4980hSafeHbrCde;
    }

    /**
     * Lineage reference object : PTRBDCA_ACA_4980H_SAFE_HBR_CDE
     * 
     */
    @JsonProperty("aca4980hSafeHbrCde")
    public void setAca4980hSafeHbrCde(String aca4980hSafeHbrCde) {
        this.aca4980hSafeHbrCde = aca4980hSafeHbrCde;
    }

    public BenefitsAndDeductionsRules100GetResponse withAca4980hSafeHbrCde(String aca4980hSafeHbrCde) {
        this.aca4980hSafeHbrCde = aca4980hSafeHbrCde;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION2_TITLE
     * 
     */
    @JsonProperty("option2Title")
    public String getOption2Title() {
        return option2Title;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION2_TITLE
     * 
     */
    @JsonProperty("option2Title")
    public void setOption2Title(String option2Title) {
        this.option2Title = option2Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption2Title(String option2Title) {
        this.option2Title = option2Title;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_ACA_HEALTH_PROVIDR_IND
     * 
     */
    @JsonProperty("acaHealthProvidrInd")
    public String getAcaHealthProvidrInd() {
        return acaHealthProvidrInd;
    }

    /**
     * Lineage reference object : PTRBDCA_ACA_HEALTH_PROVIDR_IND
     * 
     */
    @JsonProperty("acaHealthProvidrInd")
    public void setAcaHealthProvidrInd(String acaHealthProvidrInd) {
        this.acaHealthProvidrInd = acaHealthProvidrInd;
    }

    public BenefitsAndDeductionsRules100GetResponse withAcaHealthProvidrInd(String acaHealthProvidrInd) {
        this.acaHealthProvidrInd = acaHealthProvidrInd;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_TITLE
     * 
     */
    @JsonProperty("amt1Title")
    public String getAmt1Title() {
        return amt1Title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_TITLE
     * 
     */
    @JsonProperty("amt1Title")
    public void setAmt1Title(String amt1Title) {
        this.amt1Title = amt1Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt1Title(String amt1Title) {
        this.amt1Title = amt1Title;
        return this;
    }

    /**
     * Web Description
     * <p>
     * Lineage reference object : PTRBDCA_WEB_DESC
     * 
     */
    @JsonProperty("webDesc")
    public String getWebDesc() {
        return webDesc;
    }

    /**
     * Web Description
     * <p>
     * Lineage reference object : PTRBDCA_WEB_DESC
     * 
     */
    @JsonProperty("webDesc")
    public void setWebDesc(String webDesc) {
        this.webDesc = webDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withWebDesc(String webDesc) {
        this.webDesc = webDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT4_TITLE
     * 
     */
    @JsonProperty("amt4Title")
    public String getAmt4Title() {
        return amt4Title;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT4_TITLE
     * 
     */
    @JsonProperty("amt4Title")
    public void setAmt4Title(String amt4Title) {
        this.amt4Title = amt4Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt4Title(String amt4Title) {
        this.amt4Title = amt4Title;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT7_TITLE
     * 
     */
    @JsonProperty("amt7Title")
    public String getAmt7Title() {
        return amt7Title;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT7_TITLE
     * 
     */
    @JsonProperty("amt7Title")
    public void setAmt7Title(String amt7Title) {
        this.amt7Title = amt7Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt7Title(String amt7Title) {
        this.amt7Title = amt7Title;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION5_TITLE
     * 
     */
    @JsonProperty("option5Title")
    public String getOption5Title() {
        return option5Title;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION5_TITLE
     * 
     */
    @JsonProperty("option5Title")
    public void setOption5Title(String option5Title) {
        this.option5Title = option5Title;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption5Title(String option5Title) {
        this.option5Title = option5Title;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT4_IND
     * (Required)
     * 
     */
    @JsonProperty("amt4Ind")
    public String getAmt4Ind() {
        return amt4Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT4_IND
     * (Required)
     * 
     */
    @JsonProperty("amt4Ind")
    public void setAmt4Ind(String amt4Ind) {
        this.amt4Ind = amt4Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt4Ind(String amt4Ind) {
        this.amt4Ind = amt4Ind;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION3_IND
     * (Required)
     * 
     */
    @JsonProperty("option3Ind")
    public String getOption3Ind() {
        return option3Ind;
    }

    /**
     * Lineage reference object : PTRBDCA_OPTION3_IND
     * (Required)
     * 
     */
    @JsonProperty("option3Ind")
    public void setOption3Ind(String option3Ind) {
        this.option3Ind = option3Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withOption3Ind(String option3Ind) {
        this.option3Ind = option3Ind;
        return this;
    }

    /**
     * Web Information URL
     * <p>
     * Lineage reference object : PTRBDCA_WEB_INFO_URL
     * 
     */
    @JsonProperty("webInfoUrl")
    public String getWebInfoUrl() {
        return webInfoUrl;
    }

    /**
     * Web Information URL
     * <p>
     * Lineage reference object : PTRBDCA_WEB_INFO_URL
     * 
     */
    @JsonProperty("webInfoUrl")
    public void setWebInfoUrl(String webInfoUrl) {
        this.webInfoUrl = webInfoUrl;
    }

    public BenefitsAndDeductionsRules100GetResponse withWebInfoUrl(String webInfoUrl) {
        this.webInfoUrl = webInfoUrl;
        return this;
    }

    /**
     * Amount 3
     * <p>
     * Lineage reference object : PTRBDCA_AMT3_WEB_DESC
     * 
     */
    @JsonProperty("amt3WebDesc")
    public String getAmt3WebDesc() {
        return amt3WebDesc;
    }

    /**
     * Amount 3
     * <p>
     * Lineage reference object : PTRBDCA_AMT3_WEB_DESC
     * 
     */
    @JsonProperty("amt3WebDesc")
    public void setAmt3WebDesc(String amt3WebDesc) {
        this.amt3WebDesc = amt3WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt3WebDesc(String amt3WebDesc) {
        this.amt3WebDesc = amt3WebDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT5_WEB_DESC
     * 
     */
    @JsonProperty("amt5WebDesc")
    public String getAmt5WebDesc() {
        return amt5WebDesc;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT5_WEB_DESC
     * 
     */
    @JsonProperty("amt5WebDesc")
    public void setAmt5WebDesc(String amt5WebDesc) {
        this.amt5WebDesc = amt5WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt5WebDesc(String amt5WebDesc) {
        this.amt5WebDesc = amt5WebDesc;
        return this;
    }

    /**
     * Payroll Period 3
     * <p>
     * Lineage reference object : PTRBDCA_WEEK3_IND
     * 
     */
    @JsonProperty("week3Ind")
    public String getWeek3Ind() {
        return week3Ind;
    }

    /**
     * Payroll Period 3
     * <p>
     * Lineage reference object : PTRBDCA_WEEK3_IND
     * 
     */
    @JsonProperty("week3Ind")
    public void setWeek3Ind(String week3Ind) {
        this.week3Ind = week3Ind;
    }

    public BenefitsAndDeductionsRules100GetResponse withWeek3Ind(String week3Ind) {
        this.week3Ind = week3Ind;
        return this;
    }

    /**
     * Continue Employer Contributions when on Leave with Benefits
     * <p>
     * Lineage reference object : PTRBDCA_BENEFIT_IND
     * 
     */
    @JsonProperty("benefitInd")
    public String getBenefitInd() {
        return benefitInd;
    }

    /**
     * Continue Employer Contributions when on Leave with Benefits
     * <p>
     * Lineage reference object : PTRBDCA_BENEFIT_IND
     * 
     */
    @JsonProperty("benefitInd")
    public void setBenefitInd(String benefitInd) {
        this.benefitInd = benefitInd;
    }

    public BenefitsAndDeductionsRules100GetResponse withBenefitInd(String benefitInd) {
        this.benefitInd = benefitInd;
        return this;
    }

    /**
     * Tax Code
     * <p>
     * Lineage reference object : PTRBDCA_TXCD_CODE
     * 
     */
    @JsonProperty("txcdCode")
    public String getTxcdCode() {
        return txcdCode;
    }

    /**
     * Tax Code
     * <p>
     * Lineage reference object : PTRBDCA_TXCD_CODE
     * 
     */
    @JsonProperty("txcdCode")
    public void setTxcdCode(String txcdCode) {
        this.txcdCode = txcdCode;
    }

    public BenefitsAndDeductionsRules100GetResponse withTxcdCode(String txcdCode) {
        this.txcdCode = txcdCode;
        return this;
    }

    @JsonProperty("bdclDesc")
    public String getBdclDesc() {
        return bdclDesc;
    }

    @JsonProperty("bdclDesc")
    public void setBdclDesc(String bdclDesc) {
        this.bdclDesc = bdclDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withBdclDesc(String bdclDesc) {
        this.bdclDesc = bdclDesc;
        return this;
    }

    /**
     * Amount 1
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_WEB_DESC
     * 
     */
    @JsonProperty("amt1WebDesc")
    public String getAmt1WebDesc() {
        return amt1WebDesc;
    }

    /**
     * Amount 1
     * <p>
     * Lineage reference object : PTRBDCA_AMT1_WEB_DESC
     * 
     */
    @JsonProperty("amt1WebDesc")
    public void setAmt1WebDesc(String amt1WebDesc) {
        this.amt1WebDesc = amt1WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt1WebDesc(String amt1WebDesc) {
        this.amt1WebDesc = amt1WebDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT7_WEB_DESC
     * 
     */
    @JsonProperty("amt7WebDesc")
    public String getAmt7WebDesc() {
        return amt7WebDesc;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT7_WEB_DESC
     * 
     */
    @JsonProperty("amt7WebDesc")
    public void setAmt7WebDesc(String amt7WebDesc) {
        this.amt7WebDesc = amt7WebDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt7WebDesc(String amt7WebDesc) {
        this.amt7WebDesc = amt7WebDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT6_DESC
     * 
     */
    @JsonProperty("amt6Desc")
    public String getAmt6Desc() {
        return amt6Desc;
    }

    /**
     * Lineage reference object : PTRBDCA_AMT6_DESC
     * 
     */
    @JsonProperty("amt6Desc")
    public void setAmt6Desc(String amt6Desc) {
        this.amt6Desc = amt6Desc;
    }

    public BenefitsAndDeductionsRules100GetResponse withAmt6Desc(String amt6Desc) {
        this.amt6Desc = amt6Desc;
        return this;
    }

    /**
     * Long
     * <p>
     * Lineage reference object : PTRBDCA_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * Long
     * <p>
     * Lineage reference object : PTRBDCA_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public BenefitsAndDeductionsRules100GetResponse withLongDesc(String longDesc) {
        this.longDesc = longDesc;
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

    public BenefitsAndDeductionsRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitsAndDeductionsRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amt1Ind");
        sb.append('=');
        sb.append(((this.amt1Ind == null)?"<null>":this.amt1Ind));
        sb.append(',');
        sb.append("amt1Desc");
        sb.append('=');
        sb.append(((this.amt1Desc == null)?"<null>":this.amt1Desc));
        sb.append(',');
        sb.append("amt5Title");
        sb.append('=');
        sb.append(((this.amt5Title == null)?"<null>":this.amt5Title));
        sb.append(',');
        sb.append("bdtyCode");
        sb.append('=');
        sb.append(((this.bdtyCode == null)?"<null>":this.bdtyCode));
        sb.append(',');
        sb.append("week5Ind");
        sb.append('=');
        sb.append(((this.week5Ind == null)?"<null>":this.week5Ind));
        sb.append(',');
        sb.append("amt5Ind");
        sb.append('=');
        sb.append(((this.amt5Ind == null)?"<null>":this.amt5Ind));
        sb.append(',');
        sb.append("option2Ind");
        sb.append('=');
        sb.append(((this.option2Ind == null)?"<null>":this.option2Ind));
        sb.append(',');
        sb.append("option5Ind");
        sb.append('=');
        sb.append(((this.option5Ind == null)?"<null>":this.option5Ind));
        sb.append(',');
        sb.append("week2Ind");
        sb.append('=');
        sb.append(((this.week2Ind == null)?"<null>":this.week2Ind));
        sb.append(',');
        sb.append("ytdStartMonth");
        sb.append('=');
        sb.append(((this.ytdStartMonth == null)?"<null>":this.ytdStartMonth));
        sb.append(',');
        sb.append("bdclCode");
        sb.append('=');
        sb.append(((this.bdclCode == null)?"<null>":this.bdclCode));
        sb.append(',');
        sb.append("overloadInd");
        sb.append('=');
        sb.append(((this.overloadInd == null)?"<null>":this.overloadInd));
        sb.append(',');
        sb.append("amt6Title");
        sb.append('=');
        sb.append(((this.amt6Title == null)?"<null>":this.amt6Title));
        sb.append(',');
        sb.append("acaMlyPremSelfAmt");
        sb.append('=');
        sb.append(((this.acaMlyPremSelfAmt == null)?"<null>":this.acaMlyPremSelfAmt));
        sb.append(',');
        sb.append("amt2Ind");
        sb.append('=');
        sb.append(((this.amt2Ind == null)?"<null>":this.amt2Ind));
        sb.append(',');
        sb.append("dispWebPaystubInd");
        sb.append('=');
        sb.append(((this.dispWebPaystubInd == null)?"<null>":this.dispWebPaystubInd));
        sb.append(',');
        sb.append("amt3Desc");
        sb.append('=');
        sb.append(((this.amt3Desc == null)?"<null>":this.amt3Desc));
        sb.append(',');
        sb.append("amt6Ind");
        sb.append('=');
        sb.append(((this.amt6Ind == null)?"<null>":this.amt6Ind));
        sb.append(',');
        sb.append("week4Ind");
        sb.append('=');
        sb.append(((this.week4Ind == null)?"<null>":this.week4Ind));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("option1Ind");
        sb.append('=');
        sb.append(((this.option1Ind == null)?"<null>":this.option1Ind));
        sb.append(',');
        sb.append("amt4WebDesc");
        sb.append('=');
        sb.append(((this.amt4WebDesc == null)?"<null>":this.amt4WebDesc));
        sb.append(',');
        sb.append("option1Title");
        sb.append('=');
        sb.append(((this.option1Title == null)?"<null>":this.option1Title));
        sb.append(',');
        sb.append("option4Title");
        sb.append('=');
        sb.append(((this.option4Title == null)?"<null>":this.option4Title));
        sb.append(',');
        sb.append("option1WebDesc");
        sb.append('=');
        sb.append(((this.option1WebDesc == null)?"<null>":this.option1WebDesc));
        sb.append(',');
        sb.append("amt2Desc");
        sb.append('=');
        sb.append(((this.amt2Desc == null)?"<null>":this.amt2Desc));
        sb.append(',');
        sb.append("week1Ind");
        sb.append('=');
        sb.append(((this.week1Ind == null)?"<null>":this.week1Ind));
        sb.append(',');
        sb.append("shortDesc");
        sb.append('=');
        sb.append(((this.shortDesc == null)?"<null>":this.shortDesc));
        sb.append(',');
        sb.append("amt2WebDesc");
        sb.append('=');
        sb.append(((this.amt2WebDesc == null)?"<null>":this.amt2WebDesc));
        sb.append(',');
        sb.append("amt6WebDesc");
        sb.append('=');
        sb.append(((this.amt6WebDesc == null)?"<null>":this.amt6WebDesc));
        sb.append(',');
        sb.append("beneficiaryInd");
        sb.append('=');
        sb.append(((this.beneficiaryInd == null)?"<null>":this.beneficiaryInd));
        sb.append(',');
        sb.append("_1099Code");
        sb.append('=');
        sb.append(((this._1099Code == null)?"<null>":this._1099Code));
        sb.append(',');
        sb.append("option5WebDesc");
        sb.append('=');
        sb.append(((this.option5WebDesc == null)?"<null>":this.option5WebDesc));
        sb.append(',');
        sb.append("amt3Ind");
        sb.append('=');
        sb.append(((this.amt3Ind == null)?"<null>":this.amt3Ind));
        sb.append(',');
        sb.append("coverageInd");
        sb.append('=');
        sb.append(((this.coverageInd == null)?"<null>":this.coverageInd));
        sb.append(',');
        sb.append("option3WebDesc");
        sb.append('=');
        sb.append(((this.option3WebDesc == null)?"<null>":this.option3WebDesc));
        sb.append(',');
        sb.append("option4WebDesc");
        sb.append('=');
        sb.append(((this.option4WebDesc == null)?"<null>":this.option4WebDesc));
        sb.append(',');
        sb.append("calcRule");
        sb.append('=');
        sb.append(((this.calcRule == null)?"<null>":this.calcRule));
        sb.append(',');
        sb.append("amt5Desc");
        sb.append('=');
        sb.append(((this.amt5Desc == null)?"<null>":this.amt5Desc));
        sb.append(',');
        sb.append("amt7Ind");
        sb.append('=');
        sb.append(((this.amt7Ind == null)?"<null>":this.amt7Ind));
        sb.append(',');
        sb.append("option2WebDesc");
        sb.append('=');
        sb.append(((this.option2WebDesc == null)?"<null>":this.option2WebDesc));
        sb.append(',');
        sb.append("amt2Title");
        sb.append('=');
        sb.append(((this.amt2Title == null)?"<null>":this.amt2Title));
        sb.append(',');
        sb.append("option3Title");
        sb.append('=');
        sb.append(((this.option3Title == null)?"<null>":this.option3Title));
        sb.append(',');
        sb.append("option4Ind");
        sb.append('=');
        sb.append(((this.option4Ind == null)?"<null>":this.option4Ind));
        sb.append(',');
        sb.append("applgrossWpaystbInd");
        sb.append('=');
        sb.append(((this.applgrossWpaystbInd == null)?"<null>":this.applgrossWpaystbInd));
        sb.append(',');
        sb.append("acaOfferCoverageCde");
        sb.append('=');
        sb.append(((this.acaOfferCoverageCde == null)?"<null>":this.acaOfferCoverageCde));
        sb.append(',');
        sb.append("amt7Desc");
        sb.append('=');
        sb.append(((this.amt7Desc == null)?"<null>":this.amt7Desc));
        sb.append(',');
        sb.append("amt3Title");
        sb.append('=');
        sb.append(((this.amt3Title == null)?"<null>":this.amt3Title));
        sb.append(',');
        sb.append("amt4Desc");
        sb.append('=');
        sb.append(((this.amt4Desc == null)?"<null>":this.amt4Desc));
        sb.append(',');
        sb.append("arrearInd");
        sb.append('=');
        sb.append(((this.arrearInd == null)?"<null>":this.arrearInd));
        sb.append(',');
        sb.append("aca4980hSafeHbrCde");
        sb.append('=');
        sb.append(((this.aca4980hSafeHbrCde == null)?"<null>":this.aca4980hSafeHbrCde));
        sb.append(',');
        sb.append("option2Title");
        sb.append('=');
        sb.append(((this.option2Title == null)?"<null>":this.option2Title));
        sb.append(',');
        sb.append("acaHealthProvidrInd");
        sb.append('=');
        sb.append(((this.acaHealthProvidrInd == null)?"<null>":this.acaHealthProvidrInd));
        sb.append(',');
        sb.append("amt1Title");
        sb.append('=');
        sb.append(((this.amt1Title == null)?"<null>":this.amt1Title));
        sb.append(',');
        sb.append("webDesc");
        sb.append('=');
        sb.append(((this.webDesc == null)?"<null>":this.webDesc));
        sb.append(',');
        sb.append("amt4Title");
        sb.append('=');
        sb.append(((this.amt4Title == null)?"<null>":this.amt4Title));
        sb.append(',');
        sb.append("amt7Title");
        sb.append('=');
        sb.append(((this.amt7Title == null)?"<null>":this.amt7Title));
        sb.append(',');
        sb.append("option5Title");
        sb.append('=');
        sb.append(((this.option5Title == null)?"<null>":this.option5Title));
        sb.append(',');
        sb.append("amt4Ind");
        sb.append('=');
        sb.append(((this.amt4Ind == null)?"<null>":this.amt4Ind));
        sb.append(',');
        sb.append("option3Ind");
        sb.append('=');
        sb.append(((this.option3Ind == null)?"<null>":this.option3Ind));
        sb.append(',');
        sb.append("webInfoUrl");
        sb.append('=');
        sb.append(((this.webInfoUrl == null)?"<null>":this.webInfoUrl));
        sb.append(',');
        sb.append("amt3WebDesc");
        sb.append('=');
        sb.append(((this.amt3WebDesc == null)?"<null>":this.amt3WebDesc));
        sb.append(',');
        sb.append("amt5WebDesc");
        sb.append('=');
        sb.append(((this.amt5WebDesc == null)?"<null>":this.amt5WebDesc));
        sb.append(',');
        sb.append("week3Ind");
        sb.append('=');
        sb.append(((this.week3Ind == null)?"<null>":this.week3Ind));
        sb.append(',');
        sb.append("benefitInd");
        sb.append('=');
        sb.append(((this.benefitInd == null)?"<null>":this.benefitInd));
        sb.append(',');
        sb.append("txcdCode");
        sb.append('=');
        sb.append(((this.txcdCode == null)?"<null>":this.txcdCode));
        sb.append(',');
        sb.append("bdclDesc");
        sb.append('=');
        sb.append(((this.bdclDesc == null)?"<null>":this.bdclDesc));
        sb.append(',');
        sb.append("amt1WebDesc");
        sb.append('=');
        sb.append(((this.amt1WebDesc == null)?"<null>":this.amt1WebDesc));
        sb.append(',');
        sb.append("amt7WebDesc");
        sb.append('=');
        sb.append(((this.amt7WebDesc == null)?"<null>":this.amt7WebDesc));
        sb.append(',');
        sb.append("amt6Desc");
        sb.append('=');
        sb.append(((this.amt6Desc == null)?"<null>":this.amt6Desc));
        sb.append(',');
        sb.append("longDesc");
        sb.append('=');
        sb.append(((this.longDesc == null)?"<null>":this.longDesc));
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
        result = ((result* 31)+((this.amt1Ind == null)? 0 :this.amt1Ind.hashCode()));
        result = ((result* 31)+((this.amt1Desc == null)? 0 :this.amt1Desc.hashCode()));
        result = ((result* 31)+((this.amt5Title == null)? 0 :this.amt5Title.hashCode()));
        result = ((result* 31)+((this.bdtyCode == null)? 0 :this.bdtyCode.hashCode()));
        result = ((result* 31)+((this.week5Ind == null)? 0 :this.week5Ind.hashCode()));
        result = ((result* 31)+((this.amt5Ind == null)? 0 :this.amt5Ind.hashCode()));
        result = ((result* 31)+((this.option2Ind == null)? 0 :this.option2Ind.hashCode()));
        result = ((result* 31)+((this.option5Ind == null)? 0 :this.option5Ind.hashCode()));
        result = ((result* 31)+((this.week2Ind == null)? 0 :this.week2Ind.hashCode()));
        result = ((result* 31)+((this.ytdStartMonth == null)? 0 :this.ytdStartMonth.hashCode()));
        result = ((result* 31)+((this.bdclCode == null)? 0 :this.bdclCode.hashCode()));
        result = ((result* 31)+((this.overloadInd == null)? 0 :this.overloadInd.hashCode()));
        result = ((result* 31)+((this.amt6Title == null)? 0 :this.amt6Title.hashCode()));
        result = ((result* 31)+((this.acaMlyPremSelfAmt == null)? 0 :this.acaMlyPremSelfAmt.hashCode()));
        result = ((result* 31)+((this.amt2Ind == null)? 0 :this.amt2Ind.hashCode()));
        result = ((result* 31)+((this.dispWebPaystubInd == null)? 0 :this.dispWebPaystubInd.hashCode()));
        result = ((result* 31)+((this.amt3Desc == null)? 0 :this.amt3Desc.hashCode()));
        result = ((result* 31)+((this.amt6Ind == null)? 0 :this.amt6Ind.hashCode()));
        result = ((result* 31)+((this.week4Ind == null)? 0 :this.week4Ind.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.option1Ind == null)? 0 :this.option1Ind.hashCode()));
        result = ((result* 31)+((this.amt4WebDesc == null)? 0 :this.amt4WebDesc.hashCode()));
        result = ((result* 31)+((this.option1Title == null)? 0 :this.option1Title.hashCode()));
        result = ((result* 31)+((this.option4Title == null)? 0 :this.option4Title.hashCode()));
        result = ((result* 31)+((this.option1WebDesc == null)? 0 :this.option1WebDesc.hashCode()));
        result = ((result* 31)+((this.amt2Desc == null)? 0 :this.amt2Desc.hashCode()));
        result = ((result* 31)+((this.week1Ind == null)? 0 :this.week1Ind.hashCode()));
        result = ((result* 31)+((this.shortDesc == null)? 0 :this.shortDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.amt2WebDesc == null)? 0 :this.amt2WebDesc.hashCode()));
        result = ((result* 31)+((this.amt6WebDesc == null)? 0 :this.amt6WebDesc.hashCode()));
        result = ((result* 31)+((this.beneficiaryInd == null)? 0 :this.beneficiaryInd.hashCode()));
        result = ((result* 31)+((this.option5WebDesc == null)? 0 :this.option5WebDesc.hashCode()));
        result = ((result* 31)+((this.amt3Ind == null)? 0 :this.amt3Ind.hashCode()));
        result = ((result* 31)+((this.coverageInd == null)? 0 :this.coverageInd.hashCode()));
        result = ((result* 31)+((this.option3WebDesc == null)? 0 :this.option3WebDesc.hashCode()));
        result = ((result* 31)+((this.option4WebDesc == null)? 0 :this.option4WebDesc.hashCode()));
        result = ((result* 31)+((this.calcRule == null)? 0 :this.calcRule.hashCode()));
        result = ((result* 31)+((this.amt5Desc == null)? 0 :this.amt5Desc.hashCode()));
        result = ((result* 31)+((this.amt7Ind == null)? 0 :this.amt7Ind.hashCode()));
        result = ((result* 31)+((this.option2WebDesc == null)? 0 :this.option2WebDesc.hashCode()));
        result = ((result* 31)+((this.amt2Title == null)? 0 :this.amt2Title.hashCode()));
        result = ((result* 31)+((this.option3Title == null)? 0 :this.option3Title.hashCode()));
        result = ((result* 31)+((this.option4Ind == null)? 0 :this.option4Ind.hashCode()));
        result = ((result* 31)+((this.applgrossWpaystbInd == null)? 0 :this.applgrossWpaystbInd.hashCode()));
        result = ((result* 31)+((this.acaOfferCoverageCde == null)? 0 :this.acaOfferCoverageCde.hashCode()));
        result = ((result* 31)+((this.amt7Desc == null)? 0 :this.amt7Desc.hashCode()));
        result = ((result* 31)+((this.amt3Title == null)? 0 :this.amt3Title.hashCode()));
        result = ((result* 31)+((this.amt4Desc == null)? 0 :this.amt4Desc.hashCode()));
        result = ((result* 31)+((this.arrearInd == null)? 0 :this.arrearInd.hashCode()));
        result = ((result* 31)+((this.aca4980hSafeHbrCde == null)? 0 :this.aca4980hSafeHbrCde.hashCode()));
        result = ((result* 31)+((this._1099Code == null)? 0 :this._1099Code.hashCode()));
        result = ((result* 31)+((this.option2Title == null)? 0 :this.option2Title.hashCode()));
        result = ((result* 31)+((this.acaHealthProvidrInd == null)? 0 :this.acaHealthProvidrInd.hashCode()));
        result = ((result* 31)+((this.amt1Title == null)? 0 :this.amt1Title.hashCode()));
        result = ((result* 31)+((this.webDesc == null)? 0 :this.webDesc.hashCode()));
        result = ((result* 31)+((this.amt4Title == null)? 0 :this.amt4Title.hashCode()));
        result = ((result* 31)+((this.amt7Title == null)? 0 :this.amt7Title.hashCode()));
        result = ((result* 31)+((this.option5Title == null)? 0 :this.option5Title.hashCode()));
        result = ((result* 31)+((this.amt4Ind == null)? 0 :this.amt4Ind.hashCode()));
        result = ((result* 31)+((this.option3Ind == null)? 0 :this.option3Ind.hashCode()));
        result = ((result* 31)+((this.webInfoUrl == null)? 0 :this.webInfoUrl.hashCode()));
        result = ((result* 31)+((this.amt3WebDesc == null)? 0 :this.amt3WebDesc.hashCode()));
        result = ((result* 31)+((this.amt5WebDesc == null)? 0 :this.amt5WebDesc.hashCode()));
        result = ((result* 31)+((this.week3Ind == null)? 0 :this.week3Ind.hashCode()));
        result = ((result* 31)+((this.benefitInd == null)? 0 :this.benefitInd.hashCode()));
        result = ((result* 31)+((this.txcdCode == null)? 0 :this.txcdCode.hashCode()));
        result = ((result* 31)+((this.bdclDesc == null)? 0 :this.bdclDesc.hashCode()));
        result = ((result* 31)+((this.amt1WebDesc == null)? 0 :this.amt1WebDesc.hashCode()));
        result = ((result* 31)+((this.amt7WebDesc == null)? 0 :this.amt7WebDesc.hashCode()));
        result = ((result* 31)+((this.amt6Desc == null)? 0 :this.amt6Desc.hashCode()));
        result = ((result* 31)+((this.longDesc == null)? 0 :this.longDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitsAndDeductionsRules100GetResponse) == false) {
            return false;
        }
        BenefitsAndDeductionsRules100GetResponse rhs = ((BenefitsAndDeductionsRules100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.amt1Ind == rhs.amt1Ind)||((this.amt1Ind!= null)&&this.amt1Ind.equals(rhs.amt1Ind)))&&((this.amt1Desc == rhs.amt1Desc)||((this.amt1Desc!= null)&&this.amt1Desc.equals(rhs.amt1Desc))))&&((this.amt5Title == rhs.amt5Title)||((this.amt5Title!= null)&&this.amt5Title.equals(rhs.amt5Title))))&&((this.bdtyCode == rhs.bdtyCode)||((this.bdtyCode!= null)&&this.bdtyCode.equals(rhs.bdtyCode))))&&((this.week5Ind == rhs.week5Ind)||((this.week5Ind!= null)&&this.week5Ind.equals(rhs.week5Ind))))&&((this.amt5Ind == rhs.amt5Ind)||((this.amt5Ind!= null)&&this.amt5Ind.equals(rhs.amt5Ind))))&&((this.option2Ind == rhs.option2Ind)||((this.option2Ind!= null)&&this.option2Ind.equals(rhs.option2Ind))))&&((this.option5Ind == rhs.option5Ind)||((this.option5Ind!= null)&&this.option5Ind.equals(rhs.option5Ind))))&&((this.week2Ind == rhs.week2Ind)||((this.week2Ind!= null)&&this.week2Ind.equals(rhs.week2Ind))))&&((this.ytdStartMonth == rhs.ytdStartMonth)||((this.ytdStartMonth!= null)&&this.ytdStartMonth.equals(rhs.ytdStartMonth))))&&((this.bdclCode == rhs.bdclCode)||((this.bdclCode!= null)&&this.bdclCode.equals(rhs.bdclCode))))&&((this.overloadInd == rhs.overloadInd)||((this.overloadInd!= null)&&this.overloadInd.equals(rhs.overloadInd))))&&((this.amt6Title == rhs.amt6Title)||((this.amt6Title!= null)&&this.amt6Title.equals(rhs.amt6Title))))&&((this.acaMlyPremSelfAmt == rhs.acaMlyPremSelfAmt)||((this.acaMlyPremSelfAmt!= null)&&this.acaMlyPremSelfAmt.equals(rhs.acaMlyPremSelfAmt))))&&((this.amt2Ind == rhs.amt2Ind)||((this.amt2Ind!= null)&&this.amt2Ind.equals(rhs.amt2Ind))))&&((this.dispWebPaystubInd == rhs.dispWebPaystubInd)||((this.dispWebPaystubInd!= null)&&this.dispWebPaystubInd.equals(rhs.dispWebPaystubInd))))&&((this.amt3Desc == rhs.amt3Desc)||((this.amt3Desc!= null)&&this.amt3Desc.equals(rhs.amt3Desc))))&&((this.amt6Ind == rhs.amt6Ind)||((this.amt6Ind!= null)&&this.amt6Ind.equals(rhs.amt6Ind))))&&((this.week4Ind == rhs.week4Ind)||((this.week4Ind!= null)&&this.week4Ind.equals(rhs.week4Ind))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.option1Ind == rhs.option1Ind)||((this.option1Ind!= null)&&this.option1Ind.equals(rhs.option1Ind))))&&((this.amt4WebDesc == rhs.amt4WebDesc)||((this.amt4WebDesc!= null)&&this.amt4WebDesc.equals(rhs.amt4WebDesc))))&&((this.option1Title == rhs.option1Title)||((this.option1Title!= null)&&this.option1Title.equals(rhs.option1Title))))&&((this.option4Title == rhs.option4Title)||((this.option4Title!= null)&&this.option4Title.equals(rhs.option4Title))))&&((this.option1WebDesc == rhs.option1WebDesc)||((this.option1WebDesc!= null)&&this.option1WebDesc.equals(rhs.option1WebDesc))))&&((this.amt2Desc == rhs.amt2Desc)||((this.amt2Desc!= null)&&this.amt2Desc.equals(rhs.amt2Desc))))&&((this.week1Ind == rhs.week1Ind)||((this.week1Ind!= null)&&this.week1Ind.equals(rhs.week1Ind))))&&((this.shortDesc == rhs.shortDesc)||((this.shortDesc!= null)&&this.shortDesc.equals(rhs.shortDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.amt2WebDesc == rhs.amt2WebDesc)||((this.amt2WebDesc!= null)&&this.amt2WebDesc.equals(rhs.amt2WebDesc))))&&((this.amt6WebDesc == rhs.amt6WebDesc)||((this.amt6WebDesc!= null)&&this.amt6WebDesc.equals(rhs.amt6WebDesc))))&&((this.beneficiaryInd == rhs.beneficiaryInd)||((this.beneficiaryInd!= null)&&this.beneficiaryInd.equals(rhs.beneficiaryInd))))&&((this.option5WebDesc == rhs.option5WebDesc)||((this.option5WebDesc!= null)&&this.option5WebDesc.equals(rhs.option5WebDesc))))&&((this.amt3Ind == rhs.amt3Ind)||((this.amt3Ind!= null)&&this.amt3Ind.equals(rhs.amt3Ind))))&&((this.coverageInd == rhs.coverageInd)||((this.coverageInd!= null)&&this.coverageInd.equals(rhs.coverageInd))))&&((this.option3WebDesc == rhs.option3WebDesc)||((this.option3WebDesc!= null)&&this.option3WebDesc.equals(rhs.option3WebDesc))))&&((this.option4WebDesc == rhs.option4WebDesc)||((this.option4WebDesc!= null)&&this.option4WebDesc.equals(rhs.option4WebDesc))))&&((this.calcRule == rhs.calcRule)||((this.calcRule!= null)&&this.calcRule.equals(rhs.calcRule))))&&((this.amt5Desc == rhs.amt5Desc)||((this.amt5Desc!= null)&&this.amt5Desc.equals(rhs.amt5Desc))))&&((this.amt7Ind == rhs.amt7Ind)||((this.amt7Ind!= null)&&this.amt7Ind.equals(rhs.amt7Ind))))&&((this.option2WebDesc == rhs.option2WebDesc)||((this.option2WebDesc!= null)&&this.option2WebDesc.equals(rhs.option2WebDesc))))&&((this.amt2Title == rhs.amt2Title)||((this.amt2Title!= null)&&this.amt2Title.equals(rhs.amt2Title))))&&((this.option3Title == rhs.option3Title)||((this.option3Title!= null)&&this.option3Title.equals(rhs.option3Title))))&&((this.option4Ind == rhs.option4Ind)||((this.option4Ind!= null)&&this.option4Ind.equals(rhs.option4Ind))))&&((this.applgrossWpaystbInd == rhs.applgrossWpaystbInd)||((this.applgrossWpaystbInd!= null)&&this.applgrossWpaystbInd.equals(rhs.applgrossWpaystbInd))))&&((this.acaOfferCoverageCde == rhs.acaOfferCoverageCde)||((this.acaOfferCoverageCde!= null)&&this.acaOfferCoverageCde.equals(rhs.acaOfferCoverageCde))))&&((this.amt7Desc == rhs.amt7Desc)||((this.amt7Desc!= null)&&this.amt7Desc.equals(rhs.amt7Desc))))&&((this.amt3Title == rhs.amt3Title)||((this.amt3Title!= null)&&this.amt3Title.equals(rhs.amt3Title))))&&((this.amt4Desc == rhs.amt4Desc)||((this.amt4Desc!= null)&&this.amt4Desc.equals(rhs.amt4Desc))))&&((this.arrearInd == rhs.arrearInd)||((this.arrearInd!= null)&&this.arrearInd.equals(rhs.arrearInd))))&&((this.aca4980hSafeHbrCde == rhs.aca4980hSafeHbrCde)||((this.aca4980hSafeHbrCde!= null)&&this.aca4980hSafeHbrCde.equals(rhs.aca4980hSafeHbrCde))))&&((this._1099Code == rhs._1099Code)||((this._1099Code!= null)&&this._1099Code.equals(rhs._1099Code))))&&((this.option2Title == rhs.option2Title)||((this.option2Title!= null)&&this.option2Title.equals(rhs.option2Title))))&&((this.acaHealthProvidrInd == rhs.acaHealthProvidrInd)||((this.acaHealthProvidrInd!= null)&&this.acaHealthProvidrInd.equals(rhs.acaHealthProvidrInd))))&&((this.amt1Title == rhs.amt1Title)||((this.amt1Title!= null)&&this.amt1Title.equals(rhs.amt1Title))))&&((this.webDesc == rhs.webDesc)||((this.webDesc!= null)&&this.webDesc.equals(rhs.webDesc))))&&((this.amt4Title == rhs.amt4Title)||((this.amt4Title!= null)&&this.amt4Title.equals(rhs.amt4Title))))&&((this.amt7Title == rhs.amt7Title)||((this.amt7Title!= null)&&this.amt7Title.equals(rhs.amt7Title))))&&((this.option5Title == rhs.option5Title)||((this.option5Title!= null)&&this.option5Title.equals(rhs.option5Title))))&&((this.amt4Ind == rhs.amt4Ind)||((this.amt4Ind!= null)&&this.amt4Ind.equals(rhs.amt4Ind))))&&((this.option3Ind == rhs.option3Ind)||((this.option3Ind!= null)&&this.option3Ind.equals(rhs.option3Ind))))&&((this.webInfoUrl == rhs.webInfoUrl)||((this.webInfoUrl!= null)&&this.webInfoUrl.equals(rhs.webInfoUrl))))&&((this.amt3WebDesc == rhs.amt3WebDesc)||((this.amt3WebDesc!= null)&&this.amt3WebDesc.equals(rhs.amt3WebDesc))))&&((this.amt5WebDesc == rhs.amt5WebDesc)||((this.amt5WebDesc!= null)&&this.amt5WebDesc.equals(rhs.amt5WebDesc))))&&((this.week3Ind == rhs.week3Ind)||((this.week3Ind!= null)&&this.week3Ind.equals(rhs.week3Ind))))&&((this.benefitInd == rhs.benefitInd)||((this.benefitInd!= null)&&this.benefitInd.equals(rhs.benefitInd))))&&((this.txcdCode == rhs.txcdCode)||((this.txcdCode!= null)&&this.txcdCode.equals(rhs.txcdCode))))&&((this.bdclDesc == rhs.bdclDesc)||((this.bdclDesc!= null)&&this.bdclDesc.equals(rhs.bdclDesc))))&&((this.amt1WebDesc == rhs.amt1WebDesc)||((this.amt1WebDesc!= null)&&this.amt1WebDesc.equals(rhs.amt1WebDesc))))&&((this.amt7WebDesc == rhs.amt7WebDesc)||((this.amt7WebDesc!= null)&&this.amt7WebDesc.equals(rhs.amt7WebDesc))))&&((this.amt6Desc == rhs.amt6Desc)||((this.amt6Desc!= null)&&this.amt6Desc.equals(rhs.amt6Desc))))&&((this.longDesc == rhs.longDesc)||((this.longDesc!= null)&&this.longDesc.equals(rhs.longDesc))));
    }

}
