
package com.ellucian.generated.bpapi.ban.global_institution_financial_aid_options_web_processing_rules.v1_0_0;

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
    "resourceTabInd",
    "nullInfoaccessInd",
    "ssLetrCode",
    "elUrl",
    "acceptImage",
    "aidyAwardInd",
    "termsTabInd",
    "cumLoanInd",
    "needCalcInd",
    "dfltLndrUrl",
    "coaInd",
    "fundZeroAmtInd",
    "termsCondPrintInd",
    "cancelImage",
    "prdsAwardInd",
    "ssLetrUpdateInd",
    "specialMsgTabInd",
    "dfltLndrUrlDesc",
    "pbudPrefEfc",
    "termZeroAwrdInd",
    "housingStatusInd",
    "detailResourceInd",
    "awardAcptTabInd",
    "resourceInfoInd",
    "ssHtmInfoAccessInd",
    "acptAllAwardsInd",
    "ssPdfInfoAccessInd",
    "elUrlDesc",
    "dlUrl",
    "termsAwrdMsgInd",
    "enrollmentStatus",
    "offerImage",
    "awardInfoInd",
    "declineImage",
    "dlUrlDesc"
})
@Generated("jsonschema2pojo")
public class Rorwebr {

    /**
     * Display Resources/Additional Information
     * <p>
     * Lineage reference object : RORWEBR_RESOURCE_TAB_IND
     * 
     */
    @JsonProperty("resourceTabInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_RESOURCE_TAB_IND")
    private String resourceTabInd;
    /**
     * Value for Null Info Access Indicator
     * <p>
     * Lineage reference object : RORWEBR_NULL_INFOACCESS_IND
     * (Required)
     * 
     */
    @JsonProperty("nullInfoaccessInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_NULL_INFOACCESS_IND")
    private String nullInfoaccessInd;
    /**
     * Display Housing Status
     * <p>
     * Lineage reference object : RORWEBR_SS_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("ssLetrCode")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_SS_LETR_CODE, Lookup lineage reference object : gtvletr")
    private String ssLetrCode;
    /**
     * Electronic Loan URL
     * <p>
     * Lineage reference object : RORWEBR_EL_URL
     * 
     */
    @JsonProperty("elUrl")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_EL_URL")
    private String elUrl;
    /**
     * Accept Image
     * <p>
     * Lineage reference object : RORWEBR_ACCEPT_IMAGE
     * 
     */
    @JsonProperty("acceptImage")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_ACCEPT_IMAGE")
    private String acceptImage;
    /**
     * Display Aid Year Awards/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_AIDY_AWARD_IND
     * (Required)
     * 
     */
    @JsonProperty("aidyAwardInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_AIDY_AWARD_IND")
    private String aidyAwardInd;
    /**
     * Display Terms and Conditions
     * <p>
     * Lineage reference object : RORWEBR_TERMS_TAB_IND
     * 
     */
    @JsonProperty("termsTabInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_TERMS_TAB_IND")
    private String termsTabInd;
    /**
     * Display Cumulative Loan Amounts/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_CUM_LOAN_IND
     * 
     */
    @JsonProperty("cumLoanInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_CUM_LOAN_IND")
    private String cumLoanInd;
    /**
     * Display Need Calculation/Display EFC (9x)
     * <p>
     * Lineage reference object : RORWEBR_NEED_CALC_IND
     * 
     */
    @JsonProperty("needCalcInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_NEED_CALC_IND")
    private String needCalcInd;
    /**
     * Default Lender URL
     * <p>
     * Lineage reference object : RORWEBR_DFLT_LNDR_URL
     * 
     */
    @JsonProperty("dfltLndrUrl")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_DFLT_LNDR_URL")
    private String dfltLndrUrl;
    /**
     * Display COA Detail
     * <p>
     * Lineage reference object : RORWEBR_COA_IND
     * 
     */
    @JsonProperty("coaInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_COA_IND")
    private String coaInd;
    /**
     * Display Funds with Zero Award Amount
     * <p>
     * Lineage reference object : RORWEBR_FUND_ZERO_AMT_IND
     * 
     */
    @JsonProperty("fundZeroAmtInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_FUND_ZERO_AMT_IND")
    private String fundZeroAmtInd;
    /**
     * Print Terms and Conditions
     * <p>
     * Lineage reference object : RORWEBR_TERMS_COND_PRINT_IND
     * 
     */
    @JsonProperty("termsCondPrintInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_TERMS_COND_PRINT_IND")
    private String termsCondPrintInd;
    /**
     * Cancel Image
     * <p>
     * Lineage reference object : RORWEBR_CANCEL_IMAGE
     * 
     */
    @JsonProperty("cancelImage")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_CANCEL_IMAGE")
    private String cancelImage;
    /**
     * Display Period Awards/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_PRDS_AWARD_IND
     * (Required)
     * 
     */
    @JsonProperty("prdsAwardInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_PRDS_AWARD_IND")
    private String prdsAwardInd;
    /**
     * College Financing Plan Letter Code Update Indicator
     * <p>
     * Lineage reference object : RORWEBR_SS_LETR_UPDATE_IND
     * 
     */
    @JsonProperty("ssLetrUpdateInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_SS_LETR_UPDATE_IND")
    private String ssLetrUpdateInd;
    /**
     * Display Special Messages
     * <p>
     * Lineage reference object : RORWEBR_SPECIAL_MSG_TAB_IND
     * 
     */
    @JsonProperty("specialMsgTabInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_SPECIAL_MSG_TAB_IND")
    private String specialMsgTabInd;
    /**
     * Default Lender URL Description
     * <p>
     * Lineage reference object : RORWEBR_DFLT_LNDR_URL_DESC
     * 
     */
    @JsonProperty("dfltLndrUrlDesc")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_DFLT_LNDR_URL_DESC")
    private String dfltLndrUrlDesc;
    /**
     * Period Budget Preferred EFC
     * <p>
     * Lineage reference object : RORWEBR_PBUD_PREF_EFC
     * (Required)
     * 
     */
    @JsonProperty("pbudPrefEfc")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_PBUD_PREF_EFC")
    private String pbudPrefEfc;
    /**
     * Display Periods with Zero Award Amount
     * <p>
     * Lineage reference object : RORWEBR_TERM_ZERO_AWRD_IND
     * 
     */
    @JsonProperty("termZeroAwrdInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_TERM_ZERO_AWRD_IND")
    private String termZeroAwrdInd;
    /**
     * Display Housing Status
     * <p>
     * Lineage reference object : RORWEBR_HOUSING_STATUS_IND
     * 
     */
    @JsonProperty("housingStatusInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_HOUSING_STATUS_IND")
    private String housingStatusInd;
    /**
     * Display Outside Resource Detail
     * <p>
     * Lineage reference object : RORWEBR_DETAIL_RESOURCE_IND
     * 
     */
    @JsonProperty("detailResourceInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_DETAIL_RESOURCE_IND")
    private String detailResourceInd;
    /**
     * Display College Financing Offer
     * <p>
     * Lineage reference object : RORWEBR_AWARD_ACPT_TAB_IND
     * 
     */
    @JsonProperty("awardAcptTabInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_AWARD_ACPT_TAB_IND")
    private String awardAcptTabInd;
    /**
     * Allow Student to Submit Outside Resource Information
     * <p>
     * Lineage reference object : RORWEBR_RESOURCE_INFO_IND
     * 
     */
    @JsonProperty("resourceInfoInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_RESOURCE_INFO_IND")
    private String resourceInfoInd;
    /**
     * Display College Financing Plan - HTML
     * <p>
     * Lineage reference object : RORWEBR_SS_HTM_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("ssHtmInfoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_SS_HTM_INFO_ACCESS_IND")
    private String ssHtmInfoAccessInd;
    /**
     * Allow Accept Full Amount of All Awards Option/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_ACPT_ALL_AWARDS_IND
     * 
     */
    @JsonProperty("acptAllAwardsInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_ACPT_ALL_AWARDS_IND")
    private String acptAllAwardsInd;
    /**
     * Display College Financing Plan - PDF
     * <p>
     * Lineage reference object : RORWEBR_SS_PDF_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("ssPdfInfoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_SS_PDF_INFO_ACCESS_IND")
    private String ssPdfInfoAccessInd;
    /**
     * Electronic Loan URL Description
     * <p>
     * Lineage reference object : RORWEBR_EL_URL_DESC
     * 
     */
    @JsonProperty("elUrlDesc")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_EL_URL_DESC")
    private String elUrlDesc;
    /**
     * Direct Loan URL
     * <p>
     * Lineage reference object : RORWEBR_DL_URL
     * 
     */
    @JsonProperty("dlUrl")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_DL_URL")
    private String dlUrl;
    /**
     * Display Award Messages with Terms and Conditions
     * <p>
     * Lineage reference object : RORWEBR_TERMS_AWRD_MSG_IND
     * 
     */
    @JsonProperty("termsAwrdMsgInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_TERMS_AWRD_MSG_IND")
    private String termsAwrdMsgInd;
    /**
     * Display Housing Status
     * <p>
     * Lineage reference object : RORWEBR_ENROLLMENT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("enrollmentStatus")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_ENROLLMENT_STATUS")
    private String enrollmentStatus;
    /**
     * Offer Image
     * <p>
     * Lineage reference object : RORWEBR_OFFER_IMAGE
     * 
     */
    @JsonProperty("offerImage")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_OFFER_IMAGE")
    private String offerImage;
    /**
     * Allow Student to Submit Award Information
     * <p>
     * Lineage reference object : RORWEBR_AWARD_INFO_IND
     * 
     */
    @JsonProperty("awardInfoInd")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_AWARD_INFO_IND")
    private String awardInfoInd;
    /**
     * Decline Image
     * <p>
     * Lineage reference object : RORWEBR_DECLINE_IMAGE
     * 
     */
    @JsonProperty("declineImage")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_DECLINE_IMAGE")
    private String declineImage;
    /**
     * Direct Loan URL Description
     * <p>
     * Lineage reference object : RORWEBR_DL_URL_DESC
     * 
     */
    @JsonProperty("dlUrlDesc")
    @JsonPropertyDescription("Lineage reference object : RORWEBR_DL_URL_DESC")
    private String dlUrlDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Display Resources/Additional Information
     * <p>
     * Lineage reference object : RORWEBR_RESOURCE_TAB_IND
     * 
     */
    @JsonProperty("resourceTabInd")
    public String getResourceTabInd() {
        return resourceTabInd;
    }

    /**
     * Display Resources/Additional Information
     * <p>
     * Lineage reference object : RORWEBR_RESOURCE_TAB_IND
     * 
     */
    @JsonProperty("resourceTabInd")
    public void setResourceTabInd(String resourceTabInd) {
        this.resourceTabInd = resourceTabInd;
    }

    public Rorwebr withResourceTabInd(String resourceTabInd) {
        this.resourceTabInd = resourceTabInd;
        return this;
    }

    /**
     * Value for Null Info Access Indicator
     * <p>
     * Lineage reference object : RORWEBR_NULL_INFOACCESS_IND
     * (Required)
     * 
     */
    @JsonProperty("nullInfoaccessInd")
    public String getNullInfoaccessInd() {
        return nullInfoaccessInd;
    }

    /**
     * Value for Null Info Access Indicator
     * <p>
     * Lineage reference object : RORWEBR_NULL_INFOACCESS_IND
     * (Required)
     * 
     */
    @JsonProperty("nullInfoaccessInd")
    public void setNullInfoaccessInd(String nullInfoaccessInd) {
        this.nullInfoaccessInd = nullInfoaccessInd;
    }

    public Rorwebr withNullInfoaccessInd(String nullInfoaccessInd) {
        this.nullInfoaccessInd = nullInfoaccessInd;
        return this;
    }

    /**
     * Display Housing Status
     * <p>
     * Lineage reference object : RORWEBR_SS_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("ssLetrCode")
    public String getSsLetrCode() {
        return ssLetrCode;
    }

    /**
     * Display Housing Status
     * <p>
     * Lineage reference object : RORWEBR_SS_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("ssLetrCode")
    public void setSsLetrCode(String ssLetrCode) {
        this.ssLetrCode = ssLetrCode;
    }

    public Rorwebr withSsLetrCode(String ssLetrCode) {
        this.ssLetrCode = ssLetrCode;
        return this;
    }

    /**
     * Electronic Loan URL
     * <p>
     * Lineage reference object : RORWEBR_EL_URL
     * 
     */
    @JsonProperty("elUrl")
    public String getElUrl() {
        return elUrl;
    }

    /**
     * Electronic Loan URL
     * <p>
     * Lineage reference object : RORWEBR_EL_URL
     * 
     */
    @JsonProperty("elUrl")
    public void setElUrl(String elUrl) {
        this.elUrl = elUrl;
    }

    public Rorwebr withElUrl(String elUrl) {
        this.elUrl = elUrl;
        return this;
    }

    /**
     * Accept Image
     * <p>
     * Lineage reference object : RORWEBR_ACCEPT_IMAGE
     * 
     */
    @JsonProperty("acceptImage")
    public String getAcceptImage() {
        return acceptImage;
    }

    /**
     * Accept Image
     * <p>
     * Lineage reference object : RORWEBR_ACCEPT_IMAGE
     * 
     */
    @JsonProperty("acceptImage")
    public void setAcceptImage(String acceptImage) {
        this.acceptImage = acceptImage;
    }

    public Rorwebr withAcceptImage(String acceptImage) {
        this.acceptImage = acceptImage;
        return this;
    }

    /**
     * Display Aid Year Awards/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_AIDY_AWARD_IND
     * (Required)
     * 
     */
    @JsonProperty("aidyAwardInd")
    public String getAidyAwardInd() {
        return aidyAwardInd;
    }

    /**
     * Display Aid Year Awards/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_AIDY_AWARD_IND
     * (Required)
     * 
     */
    @JsonProperty("aidyAwardInd")
    public void setAidyAwardInd(String aidyAwardInd) {
        this.aidyAwardInd = aidyAwardInd;
    }

    public Rorwebr withAidyAwardInd(String aidyAwardInd) {
        this.aidyAwardInd = aidyAwardInd;
        return this;
    }

    /**
     * Display Terms and Conditions
     * <p>
     * Lineage reference object : RORWEBR_TERMS_TAB_IND
     * 
     */
    @JsonProperty("termsTabInd")
    public String getTermsTabInd() {
        return termsTabInd;
    }

    /**
     * Display Terms and Conditions
     * <p>
     * Lineage reference object : RORWEBR_TERMS_TAB_IND
     * 
     */
    @JsonProperty("termsTabInd")
    public void setTermsTabInd(String termsTabInd) {
        this.termsTabInd = termsTabInd;
    }

    public Rorwebr withTermsTabInd(String termsTabInd) {
        this.termsTabInd = termsTabInd;
        return this;
    }

    /**
     * Display Cumulative Loan Amounts/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_CUM_LOAN_IND
     * 
     */
    @JsonProperty("cumLoanInd")
    public String getCumLoanInd() {
        return cumLoanInd;
    }

    /**
     * Display Cumulative Loan Amounts/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_CUM_LOAN_IND
     * 
     */
    @JsonProperty("cumLoanInd")
    public void setCumLoanInd(String cumLoanInd) {
        this.cumLoanInd = cumLoanInd;
    }

    public Rorwebr withCumLoanInd(String cumLoanInd) {
        this.cumLoanInd = cumLoanInd;
        return this;
    }

    /**
     * Display Need Calculation/Display EFC (9x)
     * <p>
     * Lineage reference object : RORWEBR_NEED_CALC_IND
     * 
     */
    @JsonProperty("needCalcInd")
    public String getNeedCalcInd() {
        return needCalcInd;
    }

    /**
     * Display Need Calculation/Display EFC (9x)
     * <p>
     * Lineage reference object : RORWEBR_NEED_CALC_IND
     * 
     */
    @JsonProperty("needCalcInd")
    public void setNeedCalcInd(String needCalcInd) {
        this.needCalcInd = needCalcInd;
    }

    public Rorwebr withNeedCalcInd(String needCalcInd) {
        this.needCalcInd = needCalcInd;
        return this;
    }

    /**
     * Default Lender URL
     * <p>
     * Lineage reference object : RORWEBR_DFLT_LNDR_URL
     * 
     */
    @JsonProperty("dfltLndrUrl")
    public String getDfltLndrUrl() {
        return dfltLndrUrl;
    }

    /**
     * Default Lender URL
     * <p>
     * Lineage reference object : RORWEBR_DFLT_LNDR_URL
     * 
     */
    @JsonProperty("dfltLndrUrl")
    public void setDfltLndrUrl(String dfltLndrUrl) {
        this.dfltLndrUrl = dfltLndrUrl;
    }

    public Rorwebr withDfltLndrUrl(String dfltLndrUrl) {
        this.dfltLndrUrl = dfltLndrUrl;
        return this;
    }

    /**
     * Display COA Detail
     * <p>
     * Lineage reference object : RORWEBR_COA_IND
     * 
     */
    @JsonProperty("coaInd")
    public String getCoaInd() {
        return coaInd;
    }

    /**
     * Display COA Detail
     * <p>
     * Lineage reference object : RORWEBR_COA_IND
     * 
     */
    @JsonProperty("coaInd")
    public void setCoaInd(String coaInd) {
        this.coaInd = coaInd;
    }

    public Rorwebr withCoaInd(String coaInd) {
        this.coaInd = coaInd;
        return this;
    }

    /**
     * Display Funds with Zero Award Amount
     * <p>
     * Lineage reference object : RORWEBR_FUND_ZERO_AMT_IND
     * 
     */
    @JsonProperty("fundZeroAmtInd")
    public String getFundZeroAmtInd() {
        return fundZeroAmtInd;
    }

    /**
     * Display Funds with Zero Award Amount
     * <p>
     * Lineage reference object : RORWEBR_FUND_ZERO_AMT_IND
     * 
     */
    @JsonProperty("fundZeroAmtInd")
    public void setFundZeroAmtInd(String fundZeroAmtInd) {
        this.fundZeroAmtInd = fundZeroAmtInd;
    }

    public Rorwebr withFundZeroAmtInd(String fundZeroAmtInd) {
        this.fundZeroAmtInd = fundZeroAmtInd;
        return this;
    }

    /**
     * Print Terms and Conditions
     * <p>
     * Lineage reference object : RORWEBR_TERMS_COND_PRINT_IND
     * 
     */
    @JsonProperty("termsCondPrintInd")
    public String getTermsCondPrintInd() {
        return termsCondPrintInd;
    }

    /**
     * Print Terms and Conditions
     * <p>
     * Lineage reference object : RORWEBR_TERMS_COND_PRINT_IND
     * 
     */
    @JsonProperty("termsCondPrintInd")
    public void setTermsCondPrintInd(String termsCondPrintInd) {
        this.termsCondPrintInd = termsCondPrintInd;
    }

    public Rorwebr withTermsCondPrintInd(String termsCondPrintInd) {
        this.termsCondPrintInd = termsCondPrintInd;
        return this;
    }

    /**
     * Cancel Image
     * <p>
     * Lineage reference object : RORWEBR_CANCEL_IMAGE
     * 
     */
    @JsonProperty("cancelImage")
    public String getCancelImage() {
        return cancelImage;
    }

    /**
     * Cancel Image
     * <p>
     * Lineage reference object : RORWEBR_CANCEL_IMAGE
     * 
     */
    @JsonProperty("cancelImage")
    public void setCancelImage(String cancelImage) {
        this.cancelImage = cancelImage;
    }

    public Rorwebr withCancelImage(String cancelImage) {
        this.cancelImage = cancelImage;
        return this;
    }

    /**
     * Display Period Awards/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_PRDS_AWARD_IND
     * (Required)
     * 
     */
    @JsonProperty("prdsAwardInd")
    public String getPrdsAwardInd() {
        return prdsAwardInd;
    }

    /**
     * Display Period Awards/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_PRDS_AWARD_IND
     * (Required)
     * 
     */
    @JsonProperty("prdsAwardInd")
    public void setPrdsAwardInd(String prdsAwardInd) {
        this.prdsAwardInd = prdsAwardInd;
    }

    public Rorwebr withPrdsAwardInd(String prdsAwardInd) {
        this.prdsAwardInd = prdsAwardInd;
        return this;
    }

    /**
     * College Financing Plan Letter Code Update Indicator
     * <p>
     * Lineage reference object : RORWEBR_SS_LETR_UPDATE_IND
     * 
     */
    @JsonProperty("ssLetrUpdateInd")
    public String getSsLetrUpdateInd() {
        return ssLetrUpdateInd;
    }

    /**
     * College Financing Plan Letter Code Update Indicator
     * <p>
     * Lineage reference object : RORWEBR_SS_LETR_UPDATE_IND
     * 
     */
    @JsonProperty("ssLetrUpdateInd")
    public void setSsLetrUpdateInd(String ssLetrUpdateInd) {
        this.ssLetrUpdateInd = ssLetrUpdateInd;
    }

    public Rorwebr withSsLetrUpdateInd(String ssLetrUpdateInd) {
        this.ssLetrUpdateInd = ssLetrUpdateInd;
        return this;
    }

    /**
     * Display Special Messages
     * <p>
     * Lineage reference object : RORWEBR_SPECIAL_MSG_TAB_IND
     * 
     */
    @JsonProperty("specialMsgTabInd")
    public String getSpecialMsgTabInd() {
        return specialMsgTabInd;
    }

    /**
     * Display Special Messages
     * <p>
     * Lineage reference object : RORWEBR_SPECIAL_MSG_TAB_IND
     * 
     */
    @JsonProperty("specialMsgTabInd")
    public void setSpecialMsgTabInd(String specialMsgTabInd) {
        this.specialMsgTabInd = specialMsgTabInd;
    }

    public Rorwebr withSpecialMsgTabInd(String specialMsgTabInd) {
        this.specialMsgTabInd = specialMsgTabInd;
        return this;
    }

    /**
     * Default Lender URL Description
     * <p>
     * Lineage reference object : RORWEBR_DFLT_LNDR_URL_DESC
     * 
     */
    @JsonProperty("dfltLndrUrlDesc")
    public String getDfltLndrUrlDesc() {
        return dfltLndrUrlDesc;
    }

    /**
     * Default Lender URL Description
     * <p>
     * Lineage reference object : RORWEBR_DFLT_LNDR_URL_DESC
     * 
     */
    @JsonProperty("dfltLndrUrlDesc")
    public void setDfltLndrUrlDesc(String dfltLndrUrlDesc) {
        this.dfltLndrUrlDesc = dfltLndrUrlDesc;
    }

    public Rorwebr withDfltLndrUrlDesc(String dfltLndrUrlDesc) {
        this.dfltLndrUrlDesc = dfltLndrUrlDesc;
        return this;
    }

    /**
     * Period Budget Preferred EFC
     * <p>
     * Lineage reference object : RORWEBR_PBUD_PREF_EFC
     * (Required)
     * 
     */
    @JsonProperty("pbudPrefEfc")
    public String getPbudPrefEfc() {
        return pbudPrefEfc;
    }

    /**
     * Period Budget Preferred EFC
     * <p>
     * Lineage reference object : RORWEBR_PBUD_PREF_EFC
     * (Required)
     * 
     */
    @JsonProperty("pbudPrefEfc")
    public void setPbudPrefEfc(String pbudPrefEfc) {
        this.pbudPrefEfc = pbudPrefEfc;
    }

    public Rorwebr withPbudPrefEfc(String pbudPrefEfc) {
        this.pbudPrefEfc = pbudPrefEfc;
        return this;
    }

    /**
     * Display Periods with Zero Award Amount
     * <p>
     * Lineage reference object : RORWEBR_TERM_ZERO_AWRD_IND
     * 
     */
    @JsonProperty("termZeroAwrdInd")
    public String getTermZeroAwrdInd() {
        return termZeroAwrdInd;
    }

    /**
     * Display Periods with Zero Award Amount
     * <p>
     * Lineage reference object : RORWEBR_TERM_ZERO_AWRD_IND
     * 
     */
    @JsonProperty("termZeroAwrdInd")
    public void setTermZeroAwrdInd(String termZeroAwrdInd) {
        this.termZeroAwrdInd = termZeroAwrdInd;
    }

    public Rorwebr withTermZeroAwrdInd(String termZeroAwrdInd) {
        this.termZeroAwrdInd = termZeroAwrdInd;
        return this;
    }

    /**
     * Display Housing Status
     * <p>
     * Lineage reference object : RORWEBR_HOUSING_STATUS_IND
     * 
     */
    @JsonProperty("housingStatusInd")
    public String getHousingStatusInd() {
        return housingStatusInd;
    }

    /**
     * Display Housing Status
     * <p>
     * Lineage reference object : RORWEBR_HOUSING_STATUS_IND
     * 
     */
    @JsonProperty("housingStatusInd")
    public void setHousingStatusInd(String housingStatusInd) {
        this.housingStatusInd = housingStatusInd;
    }

    public Rorwebr withHousingStatusInd(String housingStatusInd) {
        this.housingStatusInd = housingStatusInd;
        return this;
    }

    /**
     * Display Outside Resource Detail
     * <p>
     * Lineage reference object : RORWEBR_DETAIL_RESOURCE_IND
     * 
     */
    @JsonProperty("detailResourceInd")
    public String getDetailResourceInd() {
        return detailResourceInd;
    }

    /**
     * Display Outside Resource Detail
     * <p>
     * Lineage reference object : RORWEBR_DETAIL_RESOURCE_IND
     * 
     */
    @JsonProperty("detailResourceInd")
    public void setDetailResourceInd(String detailResourceInd) {
        this.detailResourceInd = detailResourceInd;
    }

    public Rorwebr withDetailResourceInd(String detailResourceInd) {
        this.detailResourceInd = detailResourceInd;
        return this;
    }

    /**
     * Display College Financing Offer
     * <p>
     * Lineage reference object : RORWEBR_AWARD_ACPT_TAB_IND
     * 
     */
    @JsonProperty("awardAcptTabInd")
    public String getAwardAcptTabInd() {
        return awardAcptTabInd;
    }

    /**
     * Display College Financing Offer
     * <p>
     * Lineage reference object : RORWEBR_AWARD_ACPT_TAB_IND
     * 
     */
    @JsonProperty("awardAcptTabInd")
    public void setAwardAcptTabInd(String awardAcptTabInd) {
        this.awardAcptTabInd = awardAcptTabInd;
    }

    public Rorwebr withAwardAcptTabInd(String awardAcptTabInd) {
        this.awardAcptTabInd = awardAcptTabInd;
        return this;
    }

    /**
     * Allow Student to Submit Outside Resource Information
     * <p>
     * Lineage reference object : RORWEBR_RESOURCE_INFO_IND
     * 
     */
    @JsonProperty("resourceInfoInd")
    public String getResourceInfoInd() {
        return resourceInfoInd;
    }

    /**
     * Allow Student to Submit Outside Resource Information
     * <p>
     * Lineage reference object : RORWEBR_RESOURCE_INFO_IND
     * 
     */
    @JsonProperty("resourceInfoInd")
    public void setResourceInfoInd(String resourceInfoInd) {
        this.resourceInfoInd = resourceInfoInd;
    }

    public Rorwebr withResourceInfoInd(String resourceInfoInd) {
        this.resourceInfoInd = resourceInfoInd;
        return this;
    }

    /**
     * Display College Financing Plan - HTML
     * <p>
     * Lineage reference object : RORWEBR_SS_HTM_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("ssHtmInfoAccessInd")
    public String getSsHtmInfoAccessInd() {
        return ssHtmInfoAccessInd;
    }

    /**
     * Display College Financing Plan - HTML
     * <p>
     * Lineage reference object : RORWEBR_SS_HTM_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("ssHtmInfoAccessInd")
    public void setSsHtmInfoAccessInd(String ssHtmInfoAccessInd) {
        this.ssHtmInfoAccessInd = ssHtmInfoAccessInd;
    }

    public Rorwebr withSsHtmInfoAccessInd(String ssHtmInfoAccessInd) {
        this.ssHtmInfoAccessInd = ssHtmInfoAccessInd;
        return this;
    }

    /**
     * Allow Accept Full Amount of All Awards Option/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_ACPT_ALL_AWARDS_IND
     * 
     */
    @JsonProperty("acptAllAwardsInd")
    public String getAcptAllAwardsInd() {
        return acptAllAwardsInd;
    }

    /**
     * Allow Accept Full Amount of All Awards Option/Not Applicable in 9x
     * <p>
     * Lineage reference object : RORWEBR_ACPT_ALL_AWARDS_IND
     * 
     */
    @JsonProperty("acptAllAwardsInd")
    public void setAcptAllAwardsInd(String acptAllAwardsInd) {
        this.acptAllAwardsInd = acptAllAwardsInd;
    }

    public Rorwebr withAcptAllAwardsInd(String acptAllAwardsInd) {
        this.acptAllAwardsInd = acptAllAwardsInd;
        return this;
    }

    /**
     * Display College Financing Plan - PDF
     * <p>
     * Lineage reference object : RORWEBR_SS_PDF_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("ssPdfInfoAccessInd")
    public String getSsPdfInfoAccessInd() {
        return ssPdfInfoAccessInd;
    }

    /**
     * Display College Financing Plan - PDF
     * <p>
     * Lineage reference object : RORWEBR_SS_PDF_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("ssPdfInfoAccessInd")
    public void setSsPdfInfoAccessInd(String ssPdfInfoAccessInd) {
        this.ssPdfInfoAccessInd = ssPdfInfoAccessInd;
    }

    public Rorwebr withSsPdfInfoAccessInd(String ssPdfInfoAccessInd) {
        this.ssPdfInfoAccessInd = ssPdfInfoAccessInd;
        return this;
    }

    /**
     * Electronic Loan URL Description
     * <p>
     * Lineage reference object : RORWEBR_EL_URL_DESC
     * 
     */
    @JsonProperty("elUrlDesc")
    public String getElUrlDesc() {
        return elUrlDesc;
    }

    /**
     * Electronic Loan URL Description
     * <p>
     * Lineage reference object : RORWEBR_EL_URL_DESC
     * 
     */
    @JsonProperty("elUrlDesc")
    public void setElUrlDesc(String elUrlDesc) {
        this.elUrlDesc = elUrlDesc;
    }

    public Rorwebr withElUrlDesc(String elUrlDesc) {
        this.elUrlDesc = elUrlDesc;
        return this;
    }

    /**
     * Direct Loan URL
     * <p>
     * Lineage reference object : RORWEBR_DL_URL
     * 
     */
    @JsonProperty("dlUrl")
    public String getDlUrl() {
        return dlUrl;
    }

    /**
     * Direct Loan URL
     * <p>
     * Lineage reference object : RORWEBR_DL_URL
     * 
     */
    @JsonProperty("dlUrl")
    public void setDlUrl(String dlUrl) {
        this.dlUrl = dlUrl;
    }

    public Rorwebr withDlUrl(String dlUrl) {
        this.dlUrl = dlUrl;
        return this;
    }

    /**
     * Display Award Messages with Terms and Conditions
     * <p>
     * Lineage reference object : RORWEBR_TERMS_AWRD_MSG_IND
     * 
     */
    @JsonProperty("termsAwrdMsgInd")
    public String getTermsAwrdMsgInd() {
        return termsAwrdMsgInd;
    }

    /**
     * Display Award Messages with Terms and Conditions
     * <p>
     * Lineage reference object : RORWEBR_TERMS_AWRD_MSG_IND
     * 
     */
    @JsonProperty("termsAwrdMsgInd")
    public void setTermsAwrdMsgInd(String termsAwrdMsgInd) {
        this.termsAwrdMsgInd = termsAwrdMsgInd;
    }

    public Rorwebr withTermsAwrdMsgInd(String termsAwrdMsgInd) {
        this.termsAwrdMsgInd = termsAwrdMsgInd;
        return this;
    }

    /**
     * Display Housing Status
     * <p>
     * Lineage reference object : RORWEBR_ENROLLMENT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("enrollmentStatus")
    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    /**
     * Display Housing Status
     * <p>
     * Lineage reference object : RORWEBR_ENROLLMENT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("enrollmentStatus")
    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    public Rorwebr withEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
        return this;
    }

    /**
     * Offer Image
     * <p>
     * Lineage reference object : RORWEBR_OFFER_IMAGE
     * 
     */
    @JsonProperty("offerImage")
    public String getOfferImage() {
        return offerImage;
    }

    /**
     * Offer Image
     * <p>
     * Lineage reference object : RORWEBR_OFFER_IMAGE
     * 
     */
    @JsonProperty("offerImage")
    public void setOfferImage(String offerImage) {
        this.offerImage = offerImage;
    }

    public Rorwebr withOfferImage(String offerImage) {
        this.offerImage = offerImage;
        return this;
    }

    /**
     * Allow Student to Submit Award Information
     * <p>
     * Lineage reference object : RORWEBR_AWARD_INFO_IND
     * 
     */
    @JsonProperty("awardInfoInd")
    public String getAwardInfoInd() {
        return awardInfoInd;
    }

    /**
     * Allow Student to Submit Award Information
     * <p>
     * Lineage reference object : RORWEBR_AWARD_INFO_IND
     * 
     */
    @JsonProperty("awardInfoInd")
    public void setAwardInfoInd(String awardInfoInd) {
        this.awardInfoInd = awardInfoInd;
    }

    public Rorwebr withAwardInfoInd(String awardInfoInd) {
        this.awardInfoInd = awardInfoInd;
        return this;
    }

    /**
     * Decline Image
     * <p>
     * Lineage reference object : RORWEBR_DECLINE_IMAGE
     * 
     */
    @JsonProperty("declineImage")
    public String getDeclineImage() {
        return declineImage;
    }

    /**
     * Decline Image
     * <p>
     * Lineage reference object : RORWEBR_DECLINE_IMAGE
     * 
     */
    @JsonProperty("declineImage")
    public void setDeclineImage(String declineImage) {
        this.declineImage = declineImage;
    }

    public Rorwebr withDeclineImage(String declineImage) {
        this.declineImage = declineImage;
        return this;
    }

    /**
     * Direct Loan URL Description
     * <p>
     * Lineage reference object : RORWEBR_DL_URL_DESC
     * 
     */
    @JsonProperty("dlUrlDesc")
    public String getDlUrlDesc() {
        return dlUrlDesc;
    }

    /**
     * Direct Loan URL Description
     * <p>
     * Lineage reference object : RORWEBR_DL_URL_DESC
     * 
     */
    @JsonProperty("dlUrlDesc")
    public void setDlUrlDesc(String dlUrlDesc) {
        this.dlUrlDesc = dlUrlDesc;
    }

    public Rorwebr withDlUrlDesc(String dlUrlDesc) {
        this.dlUrlDesc = dlUrlDesc;
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

    public Rorwebr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rorwebr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resourceTabInd");
        sb.append('=');
        sb.append(((this.resourceTabInd == null)?"<null>":this.resourceTabInd));
        sb.append(',');
        sb.append("nullInfoaccessInd");
        sb.append('=');
        sb.append(((this.nullInfoaccessInd == null)?"<null>":this.nullInfoaccessInd));
        sb.append(',');
        sb.append("ssLetrCode");
        sb.append('=');
        sb.append(((this.ssLetrCode == null)?"<null>":this.ssLetrCode));
        sb.append(',');
        sb.append("elUrl");
        sb.append('=');
        sb.append(((this.elUrl == null)?"<null>":this.elUrl));
        sb.append(',');
        sb.append("acceptImage");
        sb.append('=');
        sb.append(((this.acceptImage == null)?"<null>":this.acceptImage));
        sb.append(',');
        sb.append("aidyAwardInd");
        sb.append('=');
        sb.append(((this.aidyAwardInd == null)?"<null>":this.aidyAwardInd));
        sb.append(',');
        sb.append("termsTabInd");
        sb.append('=');
        sb.append(((this.termsTabInd == null)?"<null>":this.termsTabInd));
        sb.append(',');
        sb.append("cumLoanInd");
        sb.append('=');
        sb.append(((this.cumLoanInd == null)?"<null>":this.cumLoanInd));
        sb.append(',');
        sb.append("needCalcInd");
        sb.append('=');
        sb.append(((this.needCalcInd == null)?"<null>":this.needCalcInd));
        sb.append(',');
        sb.append("dfltLndrUrl");
        sb.append('=');
        sb.append(((this.dfltLndrUrl == null)?"<null>":this.dfltLndrUrl));
        sb.append(',');
        sb.append("coaInd");
        sb.append('=');
        sb.append(((this.coaInd == null)?"<null>":this.coaInd));
        sb.append(',');
        sb.append("fundZeroAmtInd");
        sb.append('=');
        sb.append(((this.fundZeroAmtInd == null)?"<null>":this.fundZeroAmtInd));
        sb.append(',');
        sb.append("termsCondPrintInd");
        sb.append('=');
        sb.append(((this.termsCondPrintInd == null)?"<null>":this.termsCondPrintInd));
        sb.append(',');
        sb.append("cancelImage");
        sb.append('=');
        sb.append(((this.cancelImage == null)?"<null>":this.cancelImage));
        sb.append(',');
        sb.append("prdsAwardInd");
        sb.append('=');
        sb.append(((this.prdsAwardInd == null)?"<null>":this.prdsAwardInd));
        sb.append(',');
        sb.append("ssLetrUpdateInd");
        sb.append('=');
        sb.append(((this.ssLetrUpdateInd == null)?"<null>":this.ssLetrUpdateInd));
        sb.append(',');
        sb.append("specialMsgTabInd");
        sb.append('=');
        sb.append(((this.specialMsgTabInd == null)?"<null>":this.specialMsgTabInd));
        sb.append(',');
        sb.append("dfltLndrUrlDesc");
        sb.append('=');
        sb.append(((this.dfltLndrUrlDesc == null)?"<null>":this.dfltLndrUrlDesc));
        sb.append(',');
        sb.append("pbudPrefEfc");
        sb.append('=');
        sb.append(((this.pbudPrefEfc == null)?"<null>":this.pbudPrefEfc));
        sb.append(',');
        sb.append("termZeroAwrdInd");
        sb.append('=');
        sb.append(((this.termZeroAwrdInd == null)?"<null>":this.termZeroAwrdInd));
        sb.append(',');
        sb.append("housingStatusInd");
        sb.append('=');
        sb.append(((this.housingStatusInd == null)?"<null>":this.housingStatusInd));
        sb.append(',');
        sb.append("detailResourceInd");
        sb.append('=');
        sb.append(((this.detailResourceInd == null)?"<null>":this.detailResourceInd));
        sb.append(',');
        sb.append("awardAcptTabInd");
        sb.append('=');
        sb.append(((this.awardAcptTabInd == null)?"<null>":this.awardAcptTabInd));
        sb.append(',');
        sb.append("resourceInfoInd");
        sb.append('=');
        sb.append(((this.resourceInfoInd == null)?"<null>":this.resourceInfoInd));
        sb.append(',');
        sb.append("ssHtmInfoAccessInd");
        sb.append('=');
        sb.append(((this.ssHtmInfoAccessInd == null)?"<null>":this.ssHtmInfoAccessInd));
        sb.append(',');
        sb.append("acptAllAwardsInd");
        sb.append('=');
        sb.append(((this.acptAllAwardsInd == null)?"<null>":this.acptAllAwardsInd));
        sb.append(',');
        sb.append("ssPdfInfoAccessInd");
        sb.append('=');
        sb.append(((this.ssPdfInfoAccessInd == null)?"<null>":this.ssPdfInfoAccessInd));
        sb.append(',');
        sb.append("elUrlDesc");
        sb.append('=');
        sb.append(((this.elUrlDesc == null)?"<null>":this.elUrlDesc));
        sb.append(',');
        sb.append("dlUrl");
        sb.append('=');
        sb.append(((this.dlUrl == null)?"<null>":this.dlUrl));
        sb.append(',');
        sb.append("termsAwrdMsgInd");
        sb.append('=');
        sb.append(((this.termsAwrdMsgInd == null)?"<null>":this.termsAwrdMsgInd));
        sb.append(',');
        sb.append("enrollmentStatus");
        sb.append('=');
        sb.append(((this.enrollmentStatus == null)?"<null>":this.enrollmentStatus));
        sb.append(',');
        sb.append("offerImage");
        sb.append('=');
        sb.append(((this.offerImage == null)?"<null>":this.offerImage));
        sb.append(',');
        sb.append("awardInfoInd");
        sb.append('=');
        sb.append(((this.awardInfoInd == null)?"<null>":this.awardInfoInd));
        sb.append(',');
        sb.append("declineImage");
        sb.append('=');
        sb.append(((this.declineImage == null)?"<null>":this.declineImage));
        sb.append(',');
        sb.append("dlUrlDesc");
        sb.append('=');
        sb.append(((this.dlUrlDesc == null)?"<null>":this.dlUrlDesc));
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
        result = ((result* 31)+((this.resourceTabInd == null)? 0 :this.resourceTabInd.hashCode()));
        result = ((result* 31)+((this.nullInfoaccessInd == null)? 0 :this.nullInfoaccessInd.hashCode()));
        result = ((result* 31)+((this.ssLetrCode == null)? 0 :this.ssLetrCode.hashCode()));
        result = ((result* 31)+((this.elUrl == null)? 0 :this.elUrl.hashCode()));
        result = ((result* 31)+((this.acceptImage == null)? 0 :this.acceptImage.hashCode()));
        result = ((result* 31)+((this.aidyAwardInd == null)? 0 :this.aidyAwardInd.hashCode()));
        result = ((result* 31)+((this.termsTabInd == null)? 0 :this.termsTabInd.hashCode()));
        result = ((result* 31)+((this.cumLoanInd == null)? 0 :this.cumLoanInd.hashCode()));
        result = ((result* 31)+((this.needCalcInd == null)? 0 :this.needCalcInd.hashCode()));
        result = ((result* 31)+((this.dfltLndrUrl == null)? 0 :this.dfltLndrUrl.hashCode()));
        result = ((result* 31)+((this.coaInd == null)? 0 :this.coaInd.hashCode()));
        result = ((result* 31)+((this.fundZeroAmtInd == null)? 0 :this.fundZeroAmtInd.hashCode()));
        result = ((result* 31)+((this.termsCondPrintInd == null)? 0 :this.termsCondPrintInd.hashCode()));
        result = ((result* 31)+((this.cancelImage == null)? 0 :this.cancelImage.hashCode()));
        result = ((result* 31)+((this.prdsAwardInd == null)? 0 :this.prdsAwardInd.hashCode()));
        result = ((result* 31)+((this.ssLetrUpdateInd == null)? 0 :this.ssLetrUpdateInd.hashCode()));
        result = ((result* 31)+((this.specialMsgTabInd == null)? 0 :this.specialMsgTabInd.hashCode()));
        result = ((result* 31)+((this.dfltLndrUrlDesc == null)? 0 :this.dfltLndrUrlDesc.hashCode()));
        result = ((result* 31)+((this.pbudPrefEfc == null)? 0 :this.pbudPrefEfc.hashCode()));
        result = ((result* 31)+((this.termZeroAwrdInd == null)? 0 :this.termZeroAwrdInd.hashCode()));
        result = ((result* 31)+((this.housingStatusInd == null)? 0 :this.housingStatusInd.hashCode()));
        result = ((result* 31)+((this.detailResourceInd == null)? 0 :this.detailResourceInd.hashCode()));
        result = ((result* 31)+((this.awardAcptTabInd == null)? 0 :this.awardAcptTabInd.hashCode()));
        result = ((result* 31)+((this.resourceInfoInd == null)? 0 :this.resourceInfoInd.hashCode()));
        result = ((result* 31)+((this.ssHtmInfoAccessInd == null)? 0 :this.ssHtmInfoAccessInd.hashCode()));
        result = ((result* 31)+((this.acptAllAwardsInd == null)? 0 :this.acptAllAwardsInd.hashCode()));
        result = ((result* 31)+((this.ssPdfInfoAccessInd == null)? 0 :this.ssPdfInfoAccessInd.hashCode()));
        result = ((result* 31)+((this.elUrlDesc == null)? 0 :this.elUrlDesc.hashCode()));
        result = ((result* 31)+((this.dlUrl == null)? 0 :this.dlUrl.hashCode()));
        result = ((result* 31)+((this.termsAwrdMsgInd == null)? 0 :this.termsAwrdMsgInd.hashCode()));
        result = ((result* 31)+((this.enrollmentStatus == null)? 0 :this.enrollmentStatus.hashCode()));
        result = ((result* 31)+((this.offerImage == null)? 0 :this.offerImage.hashCode()));
        result = ((result* 31)+((this.awardInfoInd == null)? 0 :this.awardInfoInd.hashCode()));
        result = ((result* 31)+((this.declineImage == null)? 0 :this.declineImage.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dlUrlDesc == null)? 0 :this.dlUrlDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rorwebr) == false) {
            return false;
        }
        Rorwebr rhs = ((Rorwebr) other);
        return (((((((((((((((((((((((((((((((((((((this.resourceTabInd == rhs.resourceTabInd)||((this.resourceTabInd!= null)&&this.resourceTabInd.equals(rhs.resourceTabInd)))&&((this.nullInfoaccessInd == rhs.nullInfoaccessInd)||((this.nullInfoaccessInd!= null)&&this.nullInfoaccessInd.equals(rhs.nullInfoaccessInd))))&&((this.ssLetrCode == rhs.ssLetrCode)||((this.ssLetrCode!= null)&&this.ssLetrCode.equals(rhs.ssLetrCode))))&&((this.elUrl == rhs.elUrl)||((this.elUrl!= null)&&this.elUrl.equals(rhs.elUrl))))&&((this.acceptImage == rhs.acceptImage)||((this.acceptImage!= null)&&this.acceptImage.equals(rhs.acceptImage))))&&((this.aidyAwardInd == rhs.aidyAwardInd)||((this.aidyAwardInd!= null)&&this.aidyAwardInd.equals(rhs.aidyAwardInd))))&&((this.termsTabInd == rhs.termsTabInd)||((this.termsTabInd!= null)&&this.termsTabInd.equals(rhs.termsTabInd))))&&((this.cumLoanInd == rhs.cumLoanInd)||((this.cumLoanInd!= null)&&this.cumLoanInd.equals(rhs.cumLoanInd))))&&((this.needCalcInd == rhs.needCalcInd)||((this.needCalcInd!= null)&&this.needCalcInd.equals(rhs.needCalcInd))))&&((this.dfltLndrUrl == rhs.dfltLndrUrl)||((this.dfltLndrUrl!= null)&&this.dfltLndrUrl.equals(rhs.dfltLndrUrl))))&&((this.coaInd == rhs.coaInd)||((this.coaInd!= null)&&this.coaInd.equals(rhs.coaInd))))&&((this.fundZeroAmtInd == rhs.fundZeroAmtInd)||((this.fundZeroAmtInd!= null)&&this.fundZeroAmtInd.equals(rhs.fundZeroAmtInd))))&&((this.termsCondPrintInd == rhs.termsCondPrintInd)||((this.termsCondPrintInd!= null)&&this.termsCondPrintInd.equals(rhs.termsCondPrintInd))))&&((this.cancelImage == rhs.cancelImage)||((this.cancelImage!= null)&&this.cancelImage.equals(rhs.cancelImage))))&&((this.prdsAwardInd == rhs.prdsAwardInd)||((this.prdsAwardInd!= null)&&this.prdsAwardInd.equals(rhs.prdsAwardInd))))&&((this.ssLetrUpdateInd == rhs.ssLetrUpdateInd)||((this.ssLetrUpdateInd!= null)&&this.ssLetrUpdateInd.equals(rhs.ssLetrUpdateInd))))&&((this.specialMsgTabInd == rhs.specialMsgTabInd)||((this.specialMsgTabInd!= null)&&this.specialMsgTabInd.equals(rhs.specialMsgTabInd))))&&((this.dfltLndrUrlDesc == rhs.dfltLndrUrlDesc)||((this.dfltLndrUrlDesc!= null)&&this.dfltLndrUrlDesc.equals(rhs.dfltLndrUrlDesc))))&&((this.pbudPrefEfc == rhs.pbudPrefEfc)||((this.pbudPrefEfc!= null)&&this.pbudPrefEfc.equals(rhs.pbudPrefEfc))))&&((this.termZeroAwrdInd == rhs.termZeroAwrdInd)||((this.termZeroAwrdInd!= null)&&this.termZeroAwrdInd.equals(rhs.termZeroAwrdInd))))&&((this.housingStatusInd == rhs.housingStatusInd)||((this.housingStatusInd!= null)&&this.housingStatusInd.equals(rhs.housingStatusInd))))&&((this.detailResourceInd == rhs.detailResourceInd)||((this.detailResourceInd!= null)&&this.detailResourceInd.equals(rhs.detailResourceInd))))&&((this.awardAcptTabInd == rhs.awardAcptTabInd)||((this.awardAcptTabInd!= null)&&this.awardAcptTabInd.equals(rhs.awardAcptTabInd))))&&((this.resourceInfoInd == rhs.resourceInfoInd)||((this.resourceInfoInd!= null)&&this.resourceInfoInd.equals(rhs.resourceInfoInd))))&&((this.ssHtmInfoAccessInd == rhs.ssHtmInfoAccessInd)||((this.ssHtmInfoAccessInd!= null)&&this.ssHtmInfoAccessInd.equals(rhs.ssHtmInfoAccessInd))))&&((this.acptAllAwardsInd == rhs.acptAllAwardsInd)||((this.acptAllAwardsInd!= null)&&this.acptAllAwardsInd.equals(rhs.acptAllAwardsInd))))&&((this.ssPdfInfoAccessInd == rhs.ssPdfInfoAccessInd)||((this.ssPdfInfoAccessInd!= null)&&this.ssPdfInfoAccessInd.equals(rhs.ssPdfInfoAccessInd))))&&((this.elUrlDesc == rhs.elUrlDesc)||((this.elUrlDesc!= null)&&this.elUrlDesc.equals(rhs.elUrlDesc))))&&((this.dlUrl == rhs.dlUrl)||((this.dlUrl!= null)&&this.dlUrl.equals(rhs.dlUrl))))&&((this.termsAwrdMsgInd == rhs.termsAwrdMsgInd)||((this.termsAwrdMsgInd!= null)&&this.termsAwrdMsgInd.equals(rhs.termsAwrdMsgInd))))&&((this.enrollmentStatus == rhs.enrollmentStatus)||((this.enrollmentStatus!= null)&&this.enrollmentStatus.equals(rhs.enrollmentStatus))))&&((this.offerImage == rhs.offerImage)||((this.offerImage!= null)&&this.offerImage.equals(rhs.offerImage))))&&((this.awardInfoInd == rhs.awardInfoInd)||((this.awardInfoInd!= null)&&this.awardInfoInd.equals(rhs.awardInfoInd))))&&((this.declineImage == rhs.declineImage)||((this.declineImage!= null)&&this.declineImage.equals(rhs.declineImage))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dlUrlDesc == rhs.dlUrlDesc)||((this.dlUrlDesc!= null)&&this.dlUrlDesc.equals(rhs.dlUrlDesc))));
    }

}
