
package com.ellucian.generated.bpapi.ban.standard_report_ffr.v1_0_0;

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
    "displayPayeeName",
    "periodFromDate",
    "displayRemainRcptShare",
    "progIncomeExpDed",
    "repType",
    "displayTotalFedShare",
    "displayDunsNum",
    "fedFundsAuth",
    "cashDisbTotal",
    "indrTotal",
    "rcptShareRequired",
    "cashRcptTotal",
    "displayFundingEndDate",
    "displayFundingStartDate",
    "displayPayeeStreetLine2",
    "fedShareUnliqOblig",
    "displayPayeeStreetLine1",
    "displayPayeeStreetLine3",
    "rcptShareExp",
    "displayPayeeZip",
    "displayCashOnHand",
    "displayUnobligatedBalance",
    "progIncomeFed",
    "indrRateBase",
    "progIncomeExpAdd",
    "finalInd",
    "displaySponsorId",
    "displaySponsorName",
    "displayCash",
    "displayPiEmail",
    "indrFedShare",
    "periodToDate",
    "displayPayeeState",
    "displayInstEin",
    "displayUnexpProgIncome",
    "displayPeriodToDate",
    "fedShareExp",
    "displayPayeeCity",
    "dateSubmitted"
})
@Generated("jsonschema2pojo")
public class StandardReportFfr100PutResponse {

    /**
     * Recipient Organization
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeName")
    private String displayPayeeName;
    /**
     * Period From
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodFromDate")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_PERIOD_FROM_DATE")
    private Date periodFromDate;
    /**
     * k. Remaining Recipient Share
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayRemainRcptShare")
    private Double displayRemainRcptShare;
    /**
     * m. Program Income Expended in Accordance with the Deduction Alternative
     * <p>
     * Lineage reference object : FRRFFRR_PROG_INCOME_EXP_DED
     * (Required)
     * 
     */
    @JsonProperty("progIncomeExpDed")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_PROG_INCOME_EXP_DED")
    private Double progIncomeExpDed;
    /**
     * Frequency
     * <p>
     * Lineage reference object : FRRFFRR_REP_TYPE
     * 
     */
    @JsonProperty("repType")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_REP_TYPE")
    private String repType;
    /**
     * g. Total Federal Share
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayTotalFedShare")
    private Double displayTotalFedShare;
    /**
     * Unique Entity Identifier
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDunsNum")
    private String displayDunsNum;
    /**
     * d. Total Federal Funds Authorized
     * <p>
     * Lineage reference object : FRRFFRR_FED_FUNDS_AUTH
     * (Required)
     * 
     */
    @JsonProperty("fedFundsAuth")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_FED_FUNDS_AUTH")
    private Double fedFundsAuth;
    /**
     * b. Cash Disbursements
     * <p>
     * Lineage reference object : FRRFFRR_CASH_DISB_TOTAL
     * (Required)
     * 
     */
    @JsonProperty("cashDisbTotal")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_CASH_DISB_TOTAL")
    private Double cashDisbTotal;
    /**
     * Lineage reference object : FRRFFRR_INDR_TOTAL
     * (Required)
     * 
     */
    @JsonProperty("indrTotal")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_INDR_TOTAL")
    private Double indrTotal;
    /**
     * i. Total Recipient Share Required
     * <p>
     * Lineage reference object : FRRFFRR_RCPT_SHARE_REQUIRED
     * (Required)
     * 
     */
    @JsonProperty("rcptShareRequired")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_RCPT_SHARE_REQUIRED")
    private Double rcptShareRequired;
    /**
     * a. Cash Receipts
     * <p>
     * Lineage reference object : FRRFFRR_CASH_RCPT_TOTAL
     * (Required)
     * 
     */
    @JsonProperty("cashRcptTotal")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_CASH_RCPT_TOTAL")
    private Double cashRcptTotal;
    /**
     * Period To
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFundingEndDate")
    private Date displayFundingEndDate;
    /**
     * Grant Period From
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayFundingStartDate")
    private Date displayFundingStartDate;
    @JsonProperty("displayPayeeStreetLine2")
    private String displayPayeeStreetLine2;
    /**
     * f. Federal Share of Unliquidated Obligations
     * <p>
     * Lineage reference object : FRRFFRR_FED_SHARE_UNLIQ_OBLIG
     * (Required)
     * 
     */
    @JsonProperty("fedShareUnliqOblig")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_FED_SHARE_UNLIQ_OBLIG")
    private Double fedShareUnliqOblig;
    /**
     * Address
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeStreetLine1")
    private String displayPayeeStreetLine1;
    @JsonProperty("displayPayeeStreetLine3")
    private String displayPayeeStreetLine3;
    /**
     * j. Recipient Share of Expenditures
     * <p>
     * Lineage reference object : FRRFFRR_RCPT_SHARE_EXP
     * (Required)
     * 
     */
    @JsonProperty("rcptShareExp")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_RCPT_SHARE_EXP")
    private Double rcptShareExp;
    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeZip")
    private String displayPayeeZip;
    /**
     * c. Cash On Hand
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayCashOnHand")
    private Double displayCashOnHand;
    /**
     * h. Unobligated Balance
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayUnobligatedBalance")
    private Double displayUnobligatedBalance;
    /**
     * l. Total Federal Program Income Earned
     * <p>
     * Lineage reference object : FRRFFRR_PROG_INCOME_FED
     * (Required)
     * 
     */
    @JsonProperty("progIncomeFed")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_PROG_INCOME_FED")
    private Double progIncomeFed;
    /**
     * g.  Totals
     * <p>
     * Lineage reference object : FRRFFRR_INDR_RATE_BASE
     * (Required)
     * 
     */
    @JsonProperty("indrRateBase")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_INDR_RATE_BASE")
    private Double indrRateBase;
    /**
     * n. Program Income Expended in Accordance with the Addition Alternative
     * <p>
     * Lineage reference object : FRRFFRR_PROG_INCOME_EXP_ADD
     * (Required)
     * 
     */
    @JsonProperty("progIncomeExpAdd")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_PROG_INCOME_EXP_ADD")
    private Double progIncomeExpAdd;
    /**
     * Final Report
     * <p>
     * Lineage reference object : FRRFFRR_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_FINAL_IND")
    private String finalInd;
    /**
     * Grant Sponsor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsorId")
    private String displaySponsorId;
    /**
     * Federal Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsorName")
    private String displaySponsorName;
    /**
     * Cash Basis
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCash")
    private String displayCash;
    /**
     * PI's E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPiEmail")
    private String displayPiEmail;
    /**
     * Lineage reference object : FRRFFRR_INDR_FED_SHARE
     * (Required)
     * 
     */
    @JsonProperty("indrFedShare")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_INDR_FED_SHARE")
    private Double indrFedShare;
    /**
     * Period To
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodToDate")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_PERIOD_TO_DATE")
    private Date periodToDate;
    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeState")
    private String displayPayeeState;
    /**
     * Employer ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayInstEin")
    private String displayInstEin;
    /**
     * o. Unexpended Program Income
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayUnexpProgIncome")
    private Double displayUnexpProgIncome;
    /**
     * Period To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPeriodToDate")
    private Date displayPeriodToDate;
    /**
     * e. Federal Share of Expenditures
     * <p>
     * Lineage reference object : FRRFFRR_FED_SHARE_EXP
     * (Required)
     * 
     */
    @JsonProperty("fedShareExp")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_FED_SHARE_EXP")
    private Double fedShareExp;
    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeCity")
    private String displayPayeeCity;
    /**
     * Submission Date
     * <p>
     * Lineage reference object : FRRFFRR_DATE_SUBMITTED
     * 
     */
    @JsonProperty("dateSubmitted")
    @JsonPropertyDescription("Lineage reference object : FRRFFRR_DATE_SUBMITTED")
    private Date dateSubmitted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Recipient Organization
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeName")
    public String getDisplayPayeeName() {
        return displayPayeeName;
    }

    /**
     * Recipient Organization
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeName")
    public void setDisplayPayeeName(String displayPayeeName) {
        this.displayPayeeName = displayPayeeName;
    }

    public StandardReportFfr100PutResponse withDisplayPayeeName(String displayPayeeName) {
        this.displayPayeeName = displayPayeeName;
        return this;
    }

    /**
     * Period From
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodFromDate")
    public Date getPeriodFromDate() {
        return periodFromDate;
    }

    /**
     * Period From
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodFromDate")
    public void setPeriodFromDate(Date periodFromDate) {
        this.periodFromDate = periodFromDate;
    }

    public StandardReportFfr100PutResponse withPeriodFromDate(Date periodFromDate) {
        this.periodFromDate = periodFromDate;
        return this;
    }

    /**
     * k. Remaining Recipient Share
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayRemainRcptShare")
    public Double getDisplayRemainRcptShare() {
        return displayRemainRcptShare;
    }

    /**
     * k. Remaining Recipient Share
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayRemainRcptShare")
    public void setDisplayRemainRcptShare(Double displayRemainRcptShare) {
        this.displayRemainRcptShare = displayRemainRcptShare;
    }

    public StandardReportFfr100PutResponse withDisplayRemainRcptShare(Double displayRemainRcptShare) {
        this.displayRemainRcptShare = displayRemainRcptShare;
        return this;
    }

    /**
     * m. Program Income Expended in Accordance with the Deduction Alternative
     * <p>
     * Lineage reference object : FRRFFRR_PROG_INCOME_EXP_DED
     * (Required)
     * 
     */
    @JsonProperty("progIncomeExpDed")
    public Double getProgIncomeExpDed() {
        return progIncomeExpDed;
    }

    /**
     * m. Program Income Expended in Accordance with the Deduction Alternative
     * <p>
     * Lineage reference object : FRRFFRR_PROG_INCOME_EXP_DED
     * (Required)
     * 
     */
    @JsonProperty("progIncomeExpDed")
    public void setProgIncomeExpDed(Double progIncomeExpDed) {
        this.progIncomeExpDed = progIncomeExpDed;
    }

    public StandardReportFfr100PutResponse withProgIncomeExpDed(Double progIncomeExpDed) {
        this.progIncomeExpDed = progIncomeExpDed;
        return this;
    }

    /**
     * Frequency
     * <p>
     * Lineage reference object : FRRFFRR_REP_TYPE
     * 
     */
    @JsonProperty("repType")
    public String getRepType() {
        return repType;
    }

    /**
     * Frequency
     * <p>
     * Lineage reference object : FRRFFRR_REP_TYPE
     * 
     */
    @JsonProperty("repType")
    public void setRepType(String repType) {
        this.repType = repType;
    }

    public StandardReportFfr100PutResponse withRepType(String repType) {
        this.repType = repType;
        return this;
    }

    /**
     * g. Total Federal Share
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayTotalFedShare")
    public Double getDisplayTotalFedShare() {
        return displayTotalFedShare;
    }

    /**
     * g. Total Federal Share
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayTotalFedShare")
    public void setDisplayTotalFedShare(Double displayTotalFedShare) {
        this.displayTotalFedShare = displayTotalFedShare;
    }

    public StandardReportFfr100PutResponse withDisplayTotalFedShare(Double displayTotalFedShare) {
        this.displayTotalFedShare = displayTotalFedShare;
        return this;
    }

    /**
     * Unique Entity Identifier
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDunsNum")
    public String getDisplayDunsNum() {
        return displayDunsNum;
    }

    /**
     * Unique Entity Identifier
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDunsNum")
    public void setDisplayDunsNum(String displayDunsNum) {
        this.displayDunsNum = displayDunsNum;
    }

    public StandardReportFfr100PutResponse withDisplayDunsNum(String displayDunsNum) {
        this.displayDunsNum = displayDunsNum;
        return this;
    }

    /**
     * d. Total Federal Funds Authorized
     * <p>
     * Lineage reference object : FRRFFRR_FED_FUNDS_AUTH
     * (Required)
     * 
     */
    @JsonProperty("fedFundsAuth")
    public Double getFedFundsAuth() {
        return fedFundsAuth;
    }

    /**
     * d. Total Federal Funds Authorized
     * <p>
     * Lineage reference object : FRRFFRR_FED_FUNDS_AUTH
     * (Required)
     * 
     */
    @JsonProperty("fedFundsAuth")
    public void setFedFundsAuth(Double fedFundsAuth) {
        this.fedFundsAuth = fedFundsAuth;
    }

    public StandardReportFfr100PutResponse withFedFundsAuth(Double fedFundsAuth) {
        this.fedFundsAuth = fedFundsAuth;
        return this;
    }

    /**
     * b. Cash Disbursements
     * <p>
     * Lineage reference object : FRRFFRR_CASH_DISB_TOTAL
     * (Required)
     * 
     */
    @JsonProperty("cashDisbTotal")
    public Double getCashDisbTotal() {
        return cashDisbTotal;
    }

    /**
     * b. Cash Disbursements
     * <p>
     * Lineage reference object : FRRFFRR_CASH_DISB_TOTAL
     * (Required)
     * 
     */
    @JsonProperty("cashDisbTotal")
    public void setCashDisbTotal(Double cashDisbTotal) {
        this.cashDisbTotal = cashDisbTotal;
    }

    public StandardReportFfr100PutResponse withCashDisbTotal(Double cashDisbTotal) {
        this.cashDisbTotal = cashDisbTotal;
        return this;
    }

    /**
     * Lineage reference object : FRRFFRR_INDR_TOTAL
     * (Required)
     * 
     */
    @JsonProperty("indrTotal")
    public Double getIndrTotal() {
        return indrTotal;
    }

    /**
     * Lineage reference object : FRRFFRR_INDR_TOTAL
     * (Required)
     * 
     */
    @JsonProperty("indrTotal")
    public void setIndrTotal(Double indrTotal) {
        this.indrTotal = indrTotal;
    }

    public StandardReportFfr100PutResponse withIndrTotal(Double indrTotal) {
        this.indrTotal = indrTotal;
        return this;
    }

    /**
     * i. Total Recipient Share Required
     * <p>
     * Lineage reference object : FRRFFRR_RCPT_SHARE_REQUIRED
     * (Required)
     * 
     */
    @JsonProperty("rcptShareRequired")
    public Double getRcptShareRequired() {
        return rcptShareRequired;
    }

    /**
     * i. Total Recipient Share Required
     * <p>
     * Lineage reference object : FRRFFRR_RCPT_SHARE_REQUIRED
     * (Required)
     * 
     */
    @JsonProperty("rcptShareRequired")
    public void setRcptShareRequired(Double rcptShareRequired) {
        this.rcptShareRequired = rcptShareRequired;
    }

    public StandardReportFfr100PutResponse withRcptShareRequired(Double rcptShareRequired) {
        this.rcptShareRequired = rcptShareRequired;
        return this;
    }

    /**
     * a. Cash Receipts
     * <p>
     * Lineage reference object : FRRFFRR_CASH_RCPT_TOTAL
     * (Required)
     * 
     */
    @JsonProperty("cashRcptTotal")
    public Double getCashRcptTotal() {
        return cashRcptTotal;
    }

    /**
     * a. Cash Receipts
     * <p>
     * Lineage reference object : FRRFFRR_CASH_RCPT_TOTAL
     * (Required)
     * 
     */
    @JsonProperty("cashRcptTotal")
    public void setCashRcptTotal(Double cashRcptTotal) {
        this.cashRcptTotal = cashRcptTotal;
    }

    public StandardReportFfr100PutResponse withCashRcptTotal(Double cashRcptTotal) {
        this.cashRcptTotal = cashRcptTotal;
        return this;
    }

    /**
     * Period To
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFundingEndDate")
    public Date getDisplayFundingEndDate() {
        return displayFundingEndDate;
    }

    /**
     * Period To
     * <p>
     * 
     * 
     */
    @JsonProperty("displayFundingEndDate")
    public void setDisplayFundingEndDate(Date displayFundingEndDate) {
        this.displayFundingEndDate = displayFundingEndDate;
    }

    public StandardReportFfr100PutResponse withDisplayFundingEndDate(Date displayFundingEndDate) {
        this.displayFundingEndDate = displayFundingEndDate;
        return this;
    }

    /**
     * Grant Period From
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayFundingStartDate")
    public Date getDisplayFundingStartDate() {
        return displayFundingStartDate;
    }

    /**
     * Grant Period From
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayFundingStartDate")
    public void setDisplayFundingStartDate(Date displayFundingStartDate) {
        this.displayFundingStartDate = displayFundingStartDate;
    }

    public StandardReportFfr100PutResponse withDisplayFundingStartDate(Date displayFundingStartDate) {
        this.displayFundingStartDate = displayFundingStartDate;
        return this;
    }

    @JsonProperty("displayPayeeStreetLine2")
    public String getDisplayPayeeStreetLine2() {
        return displayPayeeStreetLine2;
    }

    @JsonProperty("displayPayeeStreetLine2")
    public void setDisplayPayeeStreetLine2(String displayPayeeStreetLine2) {
        this.displayPayeeStreetLine2 = displayPayeeStreetLine2;
    }

    public StandardReportFfr100PutResponse withDisplayPayeeStreetLine2(String displayPayeeStreetLine2) {
        this.displayPayeeStreetLine2 = displayPayeeStreetLine2;
        return this;
    }

    /**
     * f. Federal Share of Unliquidated Obligations
     * <p>
     * Lineage reference object : FRRFFRR_FED_SHARE_UNLIQ_OBLIG
     * (Required)
     * 
     */
    @JsonProperty("fedShareUnliqOblig")
    public Double getFedShareUnliqOblig() {
        return fedShareUnliqOblig;
    }

    /**
     * f. Federal Share of Unliquidated Obligations
     * <p>
     * Lineage reference object : FRRFFRR_FED_SHARE_UNLIQ_OBLIG
     * (Required)
     * 
     */
    @JsonProperty("fedShareUnliqOblig")
    public void setFedShareUnliqOblig(Double fedShareUnliqOblig) {
        this.fedShareUnliqOblig = fedShareUnliqOblig;
    }

    public StandardReportFfr100PutResponse withFedShareUnliqOblig(Double fedShareUnliqOblig) {
        this.fedShareUnliqOblig = fedShareUnliqOblig;
        return this;
    }

    /**
     * Address
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeStreetLine1")
    public String getDisplayPayeeStreetLine1() {
        return displayPayeeStreetLine1;
    }

    /**
     * Address
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeStreetLine1")
    public void setDisplayPayeeStreetLine1(String displayPayeeStreetLine1) {
        this.displayPayeeStreetLine1 = displayPayeeStreetLine1;
    }

    public StandardReportFfr100PutResponse withDisplayPayeeStreetLine1(String displayPayeeStreetLine1) {
        this.displayPayeeStreetLine1 = displayPayeeStreetLine1;
        return this;
    }

    @JsonProperty("displayPayeeStreetLine3")
    public String getDisplayPayeeStreetLine3() {
        return displayPayeeStreetLine3;
    }

    @JsonProperty("displayPayeeStreetLine3")
    public void setDisplayPayeeStreetLine3(String displayPayeeStreetLine3) {
        this.displayPayeeStreetLine3 = displayPayeeStreetLine3;
    }

    public StandardReportFfr100PutResponse withDisplayPayeeStreetLine3(String displayPayeeStreetLine3) {
        this.displayPayeeStreetLine3 = displayPayeeStreetLine3;
        return this;
    }

    /**
     * j. Recipient Share of Expenditures
     * <p>
     * Lineage reference object : FRRFFRR_RCPT_SHARE_EXP
     * (Required)
     * 
     */
    @JsonProperty("rcptShareExp")
    public Double getRcptShareExp() {
        return rcptShareExp;
    }

    /**
     * j. Recipient Share of Expenditures
     * <p>
     * Lineage reference object : FRRFFRR_RCPT_SHARE_EXP
     * (Required)
     * 
     */
    @JsonProperty("rcptShareExp")
    public void setRcptShareExp(Double rcptShareExp) {
        this.rcptShareExp = rcptShareExp;
    }

    public StandardReportFfr100PutResponse withRcptShareExp(Double rcptShareExp) {
        this.rcptShareExp = rcptShareExp;
        return this;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeZip")
    public String getDisplayPayeeZip() {
        return displayPayeeZip;
    }

    /**
     * Zip or Postal Code
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeZip")
    public void setDisplayPayeeZip(String displayPayeeZip) {
        this.displayPayeeZip = displayPayeeZip;
    }

    public StandardReportFfr100PutResponse withDisplayPayeeZip(String displayPayeeZip) {
        this.displayPayeeZip = displayPayeeZip;
        return this;
    }

    /**
     * c. Cash On Hand
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayCashOnHand")
    public Double getDisplayCashOnHand() {
        return displayCashOnHand;
    }

    /**
     * c. Cash On Hand
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayCashOnHand")
    public void setDisplayCashOnHand(Double displayCashOnHand) {
        this.displayCashOnHand = displayCashOnHand;
    }

    public StandardReportFfr100PutResponse withDisplayCashOnHand(Double displayCashOnHand) {
        this.displayCashOnHand = displayCashOnHand;
        return this;
    }

    /**
     * h. Unobligated Balance
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayUnobligatedBalance")
    public Double getDisplayUnobligatedBalance() {
        return displayUnobligatedBalance;
    }

    /**
     * h. Unobligated Balance
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayUnobligatedBalance")
    public void setDisplayUnobligatedBalance(Double displayUnobligatedBalance) {
        this.displayUnobligatedBalance = displayUnobligatedBalance;
    }

    public StandardReportFfr100PutResponse withDisplayUnobligatedBalance(Double displayUnobligatedBalance) {
        this.displayUnobligatedBalance = displayUnobligatedBalance;
        return this;
    }

    /**
     * l. Total Federal Program Income Earned
     * <p>
     * Lineage reference object : FRRFFRR_PROG_INCOME_FED
     * (Required)
     * 
     */
    @JsonProperty("progIncomeFed")
    public Double getProgIncomeFed() {
        return progIncomeFed;
    }

    /**
     * l. Total Federal Program Income Earned
     * <p>
     * Lineage reference object : FRRFFRR_PROG_INCOME_FED
     * (Required)
     * 
     */
    @JsonProperty("progIncomeFed")
    public void setProgIncomeFed(Double progIncomeFed) {
        this.progIncomeFed = progIncomeFed;
    }

    public StandardReportFfr100PutResponse withProgIncomeFed(Double progIncomeFed) {
        this.progIncomeFed = progIncomeFed;
        return this;
    }

    /**
     * g.  Totals
     * <p>
     * Lineage reference object : FRRFFRR_INDR_RATE_BASE
     * (Required)
     * 
     */
    @JsonProperty("indrRateBase")
    public Double getIndrRateBase() {
        return indrRateBase;
    }

    /**
     * g.  Totals
     * <p>
     * Lineage reference object : FRRFFRR_INDR_RATE_BASE
     * (Required)
     * 
     */
    @JsonProperty("indrRateBase")
    public void setIndrRateBase(Double indrRateBase) {
        this.indrRateBase = indrRateBase;
    }

    public StandardReportFfr100PutResponse withIndrRateBase(Double indrRateBase) {
        this.indrRateBase = indrRateBase;
        return this;
    }

    /**
     * n. Program Income Expended in Accordance with the Addition Alternative
     * <p>
     * Lineage reference object : FRRFFRR_PROG_INCOME_EXP_ADD
     * (Required)
     * 
     */
    @JsonProperty("progIncomeExpAdd")
    public Double getProgIncomeExpAdd() {
        return progIncomeExpAdd;
    }

    /**
     * n. Program Income Expended in Accordance with the Addition Alternative
     * <p>
     * Lineage reference object : FRRFFRR_PROG_INCOME_EXP_ADD
     * (Required)
     * 
     */
    @JsonProperty("progIncomeExpAdd")
    public void setProgIncomeExpAdd(Double progIncomeExpAdd) {
        this.progIncomeExpAdd = progIncomeExpAdd;
    }

    public StandardReportFfr100PutResponse withProgIncomeExpAdd(Double progIncomeExpAdd) {
        this.progIncomeExpAdd = progIncomeExpAdd;
        return this;
    }

    /**
     * Final Report
     * <p>
     * Lineage reference object : FRRFFRR_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    public String getFinalInd() {
        return finalInd;
    }

    /**
     * Final Report
     * <p>
     * Lineage reference object : FRRFFRR_FINAL_IND
     * 
     */
    @JsonProperty("finalInd")
    public void setFinalInd(String finalInd) {
        this.finalInd = finalInd;
    }

    public StandardReportFfr100PutResponse withFinalInd(String finalInd) {
        this.finalInd = finalInd;
        return this;
    }

    /**
     * Grant Sponsor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsorId")
    public String getDisplaySponsorId() {
        return displaySponsorId;
    }

    /**
     * Grant Sponsor ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsorId")
    public void setDisplaySponsorId(String displaySponsorId) {
        this.displaySponsorId = displaySponsorId;
    }

    public StandardReportFfr100PutResponse withDisplaySponsorId(String displaySponsorId) {
        this.displaySponsorId = displaySponsorId;
        return this;
    }

    /**
     * Federal Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsorName")
    public String getDisplaySponsorName() {
        return displaySponsorName;
    }

    /**
     * Federal Agency
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySponsorName")
    public void setDisplaySponsorName(String displaySponsorName) {
        this.displaySponsorName = displaySponsorName;
    }

    public StandardReportFfr100PutResponse withDisplaySponsorName(String displaySponsorName) {
        this.displaySponsorName = displaySponsorName;
        return this;
    }

    /**
     * Cash Basis
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCash")
    public String getDisplayCash() {
        return displayCash;
    }

    /**
     * Cash Basis
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCash")
    public void setDisplayCash(String displayCash) {
        this.displayCash = displayCash;
    }

    public StandardReportFfr100PutResponse withDisplayCash(String displayCash) {
        this.displayCash = displayCash;
        return this;
    }

    /**
     * PI's E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPiEmail")
    public String getDisplayPiEmail() {
        return displayPiEmail;
    }

    /**
     * PI's E-mail
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPiEmail")
    public void setDisplayPiEmail(String displayPiEmail) {
        this.displayPiEmail = displayPiEmail;
    }

    public StandardReportFfr100PutResponse withDisplayPiEmail(String displayPiEmail) {
        this.displayPiEmail = displayPiEmail;
        return this;
    }

    /**
     * Lineage reference object : FRRFFRR_INDR_FED_SHARE
     * (Required)
     * 
     */
    @JsonProperty("indrFedShare")
    public Double getIndrFedShare() {
        return indrFedShare;
    }

    /**
     * Lineage reference object : FRRFFRR_INDR_FED_SHARE
     * (Required)
     * 
     */
    @JsonProperty("indrFedShare")
    public void setIndrFedShare(Double indrFedShare) {
        this.indrFedShare = indrFedShare;
    }

    public StandardReportFfr100PutResponse withIndrFedShare(Double indrFedShare) {
        this.indrFedShare = indrFedShare;
        return this;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodToDate")
    public Date getPeriodToDate() {
        return periodToDate;
    }

    /**
     * Period To
     * <p>
     * Lineage reference object : FRRFFRR_PERIOD_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("periodToDate")
    public void setPeriodToDate(Date periodToDate) {
        this.periodToDate = periodToDate;
    }

    public StandardReportFfr100PutResponse withPeriodToDate(Date periodToDate) {
        this.periodToDate = periodToDate;
        return this;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeState")
    public String getDisplayPayeeState() {
        return displayPayeeState;
    }

    /**
     * State or Province
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeState")
    public void setDisplayPayeeState(String displayPayeeState) {
        this.displayPayeeState = displayPayeeState;
    }

    public StandardReportFfr100PutResponse withDisplayPayeeState(String displayPayeeState) {
        this.displayPayeeState = displayPayeeState;
        return this;
    }

    /**
     * Employer ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayInstEin")
    public String getDisplayInstEin() {
        return displayInstEin;
    }

    /**
     * Employer ID
     * <p>
     * 
     * 
     */
    @JsonProperty("displayInstEin")
    public void setDisplayInstEin(String displayInstEin) {
        this.displayInstEin = displayInstEin;
    }

    public StandardReportFfr100PutResponse withDisplayInstEin(String displayInstEin) {
        this.displayInstEin = displayInstEin;
        return this;
    }

    /**
     * o. Unexpended Program Income
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayUnexpProgIncome")
    public Double getDisplayUnexpProgIncome() {
        return displayUnexpProgIncome;
    }

    /**
     * o. Unexpended Program Income
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayUnexpProgIncome")
    public void setDisplayUnexpProgIncome(Double displayUnexpProgIncome) {
        this.displayUnexpProgIncome = displayUnexpProgIncome;
    }

    public StandardReportFfr100PutResponse withDisplayUnexpProgIncome(Double displayUnexpProgIncome) {
        this.displayUnexpProgIncome = displayUnexpProgIncome;
        return this;
    }

    /**
     * Period To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPeriodToDate")
    public Date getDisplayPeriodToDate() {
        return displayPeriodToDate;
    }

    /**
     * Period To Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPeriodToDate")
    public void setDisplayPeriodToDate(Date displayPeriodToDate) {
        this.displayPeriodToDate = displayPeriodToDate;
    }

    public StandardReportFfr100PutResponse withDisplayPeriodToDate(Date displayPeriodToDate) {
        this.displayPeriodToDate = displayPeriodToDate;
        return this;
    }

    /**
     * e. Federal Share of Expenditures
     * <p>
     * Lineage reference object : FRRFFRR_FED_SHARE_EXP
     * (Required)
     * 
     */
    @JsonProperty("fedShareExp")
    public Double getFedShareExp() {
        return fedShareExp;
    }

    /**
     * e. Federal Share of Expenditures
     * <p>
     * Lineage reference object : FRRFFRR_FED_SHARE_EXP
     * (Required)
     * 
     */
    @JsonProperty("fedShareExp")
    public void setFedShareExp(Double fedShareExp) {
        this.fedShareExp = fedShareExp;
    }

    public StandardReportFfr100PutResponse withFedShareExp(Double fedShareExp) {
        this.fedShareExp = fedShareExp;
        return this;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeCity")
    public String getDisplayPayeeCity() {
        return displayPayeeCity;
    }

    /**
     * City
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPayeeCity")
    public void setDisplayPayeeCity(String displayPayeeCity) {
        this.displayPayeeCity = displayPayeeCity;
    }

    public StandardReportFfr100PutResponse withDisplayPayeeCity(String displayPayeeCity) {
        this.displayPayeeCity = displayPayeeCity;
        return this;
    }

    /**
     * Submission Date
     * <p>
     * Lineage reference object : FRRFFRR_DATE_SUBMITTED
     * 
     */
    @JsonProperty("dateSubmitted")
    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    /**
     * Submission Date
     * <p>
     * Lineage reference object : FRRFFRR_DATE_SUBMITTED
     * 
     */
    @JsonProperty("dateSubmitted")
    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public StandardReportFfr100PutResponse withDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
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

    public StandardReportFfr100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardReportFfr100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayPayeeName");
        sb.append('=');
        sb.append(((this.displayPayeeName == null)?"<null>":this.displayPayeeName));
        sb.append(',');
        sb.append("periodFromDate");
        sb.append('=');
        sb.append(((this.periodFromDate == null)?"<null>":this.periodFromDate));
        sb.append(',');
        sb.append("displayRemainRcptShare");
        sb.append('=');
        sb.append(((this.displayRemainRcptShare == null)?"<null>":this.displayRemainRcptShare));
        sb.append(',');
        sb.append("progIncomeExpDed");
        sb.append('=');
        sb.append(((this.progIncomeExpDed == null)?"<null>":this.progIncomeExpDed));
        sb.append(',');
        sb.append("repType");
        sb.append('=');
        sb.append(((this.repType == null)?"<null>":this.repType));
        sb.append(',');
        sb.append("displayTotalFedShare");
        sb.append('=');
        sb.append(((this.displayTotalFedShare == null)?"<null>":this.displayTotalFedShare));
        sb.append(',');
        sb.append("displayDunsNum");
        sb.append('=');
        sb.append(((this.displayDunsNum == null)?"<null>":this.displayDunsNum));
        sb.append(',');
        sb.append("fedFundsAuth");
        sb.append('=');
        sb.append(((this.fedFundsAuth == null)?"<null>":this.fedFundsAuth));
        sb.append(',');
        sb.append("cashDisbTotal");
        sb.append('=');
        sb.append(((this.cashDisbTotal == null)?"<null>":this.cashDisbTotal));
        sb.append(',');
        sb.append("indrTotal");
        sb.append('=');
        sb.append(((this.indrTotal == null)?"<null>":this.indrTotal));
        sb.append(',');
        sb.append("rcptShareRequired");
        sb.append('=');
        sb.append(((this.rcptShareRequired == null)?"<null>":this.rcptShareRequired));
        sb.append(',');
        sb.append("cashRcptTotal");
        sb.append('=');
        sb.append(((this.cashRcptTotal == null)?"<null>":this.cashRcptTotal));
        sb.append(',');
        sb.append("displayFundingEndDate");
        sb.append('=');
        sb.append(((this.displayFundingEndDate == null)?"<null>":this.displayFundingEndDate));
        sb.append(',');
        sb.append("displayFundingStartDate");
        sb.append('=');
        sb.append(((this.displayFundingStartDate == null)?"<null>":this.displayFundingStartDate));
        sb.append(',');
        sb.append("displayPayeeStreetLine2");
        sb.append('=');
        sb.append(((this.displayPayeeStreetLine2 == null)?"<null>":this.displayPayeeStreetLine2));
        sb.append(',');
        sb.append("fedShareUnliqOblig");
        sb.append('=');
        sb.append(((this.fedShareUnliqOblig == null)?"<null>":this.fedShareUnliqOblig));
        sb.append(',');
        sb.append("displayPayeeStreetLine1");
        sb.append('=');
        sb.append(((this.displayPayeeStreetLine1 == null)?"<null>":this.displayPayeeStreetLine1));
        sb.append(',');
        sb.append("displayPayeeStreetLine3");
        sb.append('=');
        sb.append(((this.displayPayeeStreetLine3 == null)?"<null>":this.displayPayeeStreetLine3));
        sb.append(',');
        sb.append("rcptShareExp");
        sb.append('=');
        sb.append(((this.rcptShareExp == null)?"<null>":this.rcptShareExp));
        sb.append(',');
        sb.append("displayPayeeZip");
        sb.append('=');
        sb.append(((this.displayPayeeZip == null)?"<null>":this.displayPayeeZip));
        sb.append(',');
        sb.append("displayCashOnHand");
        sb.append('=');
        sb.append(((this.displayCashOnHand == null)?"<null>":this.displayCashOnHand));
        sb.append(',');
        sb.append("displayUnobligatedBalance");
        sb.append('=');
        sb.append(((this.displayUnobligatedBalance == null)?"<null>":this.displayUnobligatedBalance));
        sb.append(',');
        sb.append("progIncomeFed");
        sb.append('=');
        sb.append(((this.progIncomeFed == null)?"<null>":this.progIncomeFed));
        sb.append(',');
        sb.append("indrRateBase");
        sb.append('=');
        sb.append(((this.indrRateBase == null)?"<null>":this.indrRateBase));
        sb.append(',');
        sb.append("progIncomeExpAdd");
        sb.append('=');
        sb.append(((this.progIncomeExpAdd == null)?"<null>":this.progIncomeExpAdd));
        sb.append(',');
        sb.append("finalInd");
        sb.append('=');
        sb.append(((this.finalInd == null)?"<null>":this.finalInd));
        sb.append(',');
        sb.append("displaySponsorId");
        sb.append('=');
        sb.append(((this.displaySponsorId == null)?"<null>":this.displaySponsorId));
        sb.append(',');
        sb.append("displaySponsorName");
        sb.append('=');
        sb.append(((this.displaySponsorName == null)?"<null>":this.displaySponsorName));
        sb.append(',');
        sb.append("displayCash");
        sb.append('=');
        sb.append(((this.displayCash == null)?"<null>":this.displayCash));
        sb.append(',');
        sb.append("displayPiEmail");
        sb.append('=');
        sb.append(((this.displayPiEmail == null)?"<null>":this.displayPiEmail));
        sb.append(',');
        sb.append("indrFedShare");
        sb.append('=');
        sb.append(((this.indrFedShare == null)?"<null>":this.indrFedShare));
        sb.append(',');
        sb.append("periodToDate");
        sb.append('=');
        sb.append(((this.periodToDate == null)?"<null>":this.periodToDate));
        sb.append(',');
        sb.append("displayPayeeState");
        sb.append('=');
        sb.append(((this.displayPayeeState == null)?"<null>":this.displayPayeeState));
        sb.append(',');
        sb.append("displayInstEin");
        sb.append('=');
        sb.append(((this.displayInstEin == null)?"<null>":this.displayInstEin));
        sb.append(',');
        sb.append("displayUnexpProgIncome");
        sb.append('=');
        sb.append(((this.displayUnexpProgIncome == null)?"<null>":this.displayUnexpProgIncome));
        sb.append(',');
        sb.append("displayPeriodToDate");
        sb.append('=');
        sb.append(((this.displayPeriodToDate == null)?"<null>":this.displayPeriodToDate));
        sb.append(',');
        sb.append("fedShareExp");
        sb.append('=');
        sb.append(((this.fedShareExp == null)?"<null>":this.fedShareExp));
        sb.append(',');
        sb.append("displayPayeeCity");
        sb.append('=');
        sb.append(((this.displayPayeeCity == null)?"<null>":this.displayPayeeCity));
        sb.append(',');
        sb.append("dateSubmitted");
        sb.append('=');
        sb.append(((this.dateSubmitted == null)?"<null>":this.dateSubmitted));
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
        result = ((result* 31)+((this.displayPayeeName == null)? 0 :this.displayPayeeName.hashCode()));
        result = ((result* 31)+((this.periodFromDate == null)? 0 :this.periodFromDate.hashCode()));
        result = ((result* 31)+((this.displayRemainRcptShare == null)? 0 :this.displayRemainRcptShare.hashCode()));
        result = ((result* 31)+((this.progIncomeExpDed == null)? 0 :this.progIncomeExpDed.hashCode()));
        result = ((result* 31)+((this.repType == null)? 0 :this.repType.hashCode()));
        result = ((result* 31)+((this.displayTotalFedShare == null)? 0 :this.displayTotalFedShare.hashCode()));
        result = ((result* 31)+((this.displayDunsNum == null)? 0 :this.displayDunsNum.hashCode()));
        result = ((result* 31)+((this.fedFundsAuth == null)? 0 :this.fedFundsAuth.hashCode()));
        result = ((result* 31)+((this.cashDisbTotal == null)? 0 :this.cashDisbTotal.hashCode()));
        result = ((result* 31)+((this.indrTotal == null)? 0 :this.indrTotal.hashCode()));
        result = ((result* 31)+((this.rcptShareRequired == null)? 0 :this.rcptShareRequired.hashCode()));
        result = ((result* 31)+((this.cashRcptTotal == null)? 0 :this.cashRcptTotal.hashCode()));
        result = ((result* 31)+((this.displayFundingEndDate == null)? 0 :this.displayFundingEndDate.hashCode()));
        result = ((result* 31)+((this.displayFundingStartDate == null)? 0 :this.displayFundingStartDate.hashCode()));
        result = ((result* 31)+((this.displayPayeeStreetLine2 == null)? 0 :this.displayPayeeStreetLine2 .hashCode()));
        result = ((result* 31)+((this.fedShareUnliqOblig == null)? 0 :this.fedShareUnliqOblig.hashCode()));
        result = ((result* 31)+((this.displayPayeeStreetLine1 == null)? 0 :this.displayPayeeStreetLine1 .hashCode()));
        result = ((result* 31)+((this.displayPayeeStreetLine3 == null)? 0 :this.displayPayeeStreetLine3 .hashCode()));
        result = ((result* 31)+((this.rcptShareExp == null)? 0 :this.rcptShareExp.hashCode()));
        result = ((result* 31)+((this.displayPayeeZip == null)? 0 :this.displayPayeeZip.hashCode()));
        result = ((result* 31)+((this.displayCashOnHand == null)? 0 :this.displayCashOnHand.hashCode()));
        result = ((result* 31)+((this.displayUnobligatedBalance == null)? 0 :this.displayUnobligatedBalance.hashCode()));
        result = ((result* 31)+((this.progIncomeFed == null)? 0 :this.progIncomeFed.hashCode()));
        result = ((result* 31)+((this.indrRateBase == null)? 0 :this.indrRateBase.hashCode()));
        result = ((result* 31)+((this.progIncomeExpAdd == null)? 0 :this.progIncomeExpAdd.hashCode()));
        result = ((result* 31)+((this.finalInd == null)? 0 :this.finalInd.hashCode()));
        result = ((result* 31)+((this.displaySponsorId == null)? 0 :this.displaySponsorId.hashCode()));
        result = ((result* 31)+((this.displaySponsorName == null)? 0 :this.displaySponsorName.hashCode()));
        result = ((result* 31)+((this.displayCash == null)? 0 :this.displayCash.hashCode()));
        result = ((result* 31)+((this.displayPiEmail == null)? 0 :this.displayPiEmail.hashCode()));
        result = ((result* 31)+((this.indrFedShare == null)? 0 :this.indrFedShare.hashCode()));
        result = ((result* 31)+((this.periodToDate == null)? 0 :this.periodToDate.hashCode()));
        result = ((result* 31)+((this.displayPayeeState == null)? 0 :this.displayPayeeState.hashCode()));
        result = ((result* 31)+((this.displayInstEin == null)? 0 :this.displayInstEin.hashCode()));
        result = ((result* 31)+((this.displayUnexpProgIncome == null)? 0 :this.displayUnexpProgIncome.hashCode()));
        result = ((result* 31)+((this.displayPeriodToDate == null)? 0 :this.displayPeriodToDate.hashCode()));
        result = ((result* 31)+((this.fedShareExp == null)? 0 :this.fedShareExp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayPayeeCity == null)? 0 :this.displayPayeeCity.hashCode()));
        result = ((result* 31)+((this.dateSubmitted == null)? 0 :this.dateSubmitted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardReportFfr100PutResponse) == false) {
            return false;
        }
        StandardReportFfr100PutResponse rhs = ((StandardReportFfr100PutResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((this.displayPayeeName == rhs.displayPayeeName)||((this.displayPayeeName!= null)&&this.displayPayeeName.equals(rhs.displayPayeeName)))&&((this.periodFromDate == rhs.periodFromDate)||((this.periodFromDate!= null)&&this.periodFromDate.equals(rhs.periodFromDate))))&&((this.displayRemainRcptShare == rhs.displayRemainRcptShare)||((this.displayRemainRcptShare!= null)&&this.displayRemainRcptShare.equals(rhs.displayRemainRcptShare))))&&((this.progIncomeExpDed == rhs.progIncomeExpDed)||((this.progIncomeExpDed!= null)&&this.progIncomeExpDed.equals(rhs.progIncomeExpDed))))&&((this.repType == rhs.repType)||((this.repType!= null)&&this.repType.equals(rhs.repType))))&&((this.displayTotalFedShare == rhs.displayTotalFedShare)||((this.displayTotalFedShare!= null)&&this.displayTotalFedShare.equals(rhs.displayTotalFedShare))))&&((this.displayDunsNum == rhs.displayDunsNum)||((this.displayDunsNum!= null)&&this.displayDunsNum.equals(rhs.displayDunsNum))))&&((this.fedFundsAuth == rhs.fedFundsAuth)||((this.fedFundsAuth!= null)&&this.fedFundsAuth.equals(rhs.fedFundsAuth))))&&((this.cashDisbTotal == rhs.cashDisbTotal)||((this.cashDisbTotal!= null)&&this.cashDisbTotal.equals(rhs.cashDisbTotal))))&&((this.indrTotal == rhs.indrTotal)||((this.indrTotal!= null)&&this.indrTotal.equals(rhs.indrTotal))))&&((this.rcptShareRequired == rhs.rcptShareRequired)||((this.rcptShareRequired!= null)&&this.rcptShareRequired.equals(rhs.rcptShareRequired))))&&((this.cashRcptTotal == rhs.cashRcptTotal)||((this.cashRcptTotal!= null)&&this.cashRcptTotal.equals(rhs.cashRcptTotal))))&&((this.displayFundingEndDate == rhs.displayFundingEndDate)||((this.displayFundingEndDate!= null)&&this.displayFundingEndDate.equals(rhs.displayFundingEndDate))))&&((this.displayFundingStartDate == rhs.displayFundingStartDate)||((this.displayFundingStartDate!= null)&&this.displayFundingStartDate.equals(rhs.displayFundingStartDate))))&&((this.displayPayeeStreetLine2 == rhs.displayPayeeStreetLine2)||((this.displayPayeeStreetLine2 != null)&&this.displayPayeeStreetLine2 .equals(rhs.displayPayeeStreetLine2))))&&((this.fedShareUnliqOblig == rhs.fedShareUnliqOblig)||((this.fedShareUnliqOblig!= null)&&this.fedShareUnliqOblig.equals(rhs.fedShareUnliqOblig))))&&((this.displayPayeeStreetLine1 == rhs.displayPayeeStreetLine1)||((this.displayPayeeStreetLine1 != null)&&this.displayPayeeStreetLine1 .equals(rhs.displayPayeeStreetLine1))))&&((this.displayPayeeStreetLine3 == rhs.displayPayeeStreetLine3)||((this.displayPayeeStreetLine3 != null)&&this.displayPayeeStreetLine3 .equals(rhs.displayPayeeStreetLine3))))&&((this.rcptShareExp == rhs.rcptShareExp)||((this.rcptShareExp!= null)&&this.rcptShareExp.equals(rhs.rcptShareExp))))&&((this.displayPayeeZip == rhs.displayPayeeZip)||((this.displayPayeeZip!= null)&&this.displayPayeeZip.equals(rhs.displayPayeeZip))))&&((this.displayCashOnHand == rhs.displayCashOnHand)||((this.displayCashOnHand!= null)&&this.displayCashOnHand.equals(rhs.displayCashOnHand))))&&((this.displayUnobligatedBalance == rhs.displayUnobligatedBalance)||((this.displayUnobligatedBalance!= null)&&this.displayUnobligatedBalance.equals(rhs.displayUnobligatedBalance))))&&((this.progIncomeFed == rhs.progIncomeFed)||((this.progIncomeFed!= null)&&this.progIncomeFed.equals(rhs.progIncomeFed))))&&((this.indrRateBase == rhs.indrRateBase)||((this.indrRateBase!= null)&&this.indrRateBase.equals(rhs.indrRateBase))))&&((this.progIncomeExpAdd == rhs.progIncomeExpAdd)||((this.progIncomeExpAdd!= null)&&this.progIncomeExpAdd.equals(rhs.progIncomeExpAdd))))&&((this.finalInd == rhs.finalInd)||((this.finalInd!= null)&&this.finalInd.equals(rhs.finalInd))))&&((this.displaySponsorId == rhs.displaySponsorId)||((this.displaySponsorId!= null)&&this.displaySponsorId.equals(rhs.displaySponsorId))))&&((this.displaySponsorName == rhs.displaySponsorName)||((this.displaySponsorName!= null)&&this.displaySponsorName.equals(rhs.displaySponsorName))))&&((this.displayCash == rhs.displayCash)||((this.displayCash!= null)&&this.displayCash.equals(rhs.displayCash))))&&((this.displayPiEmail == rhs.displayPiEmail)||((this.displayPiEmail!= null)&&this.displayPiEmail.equals(rhs.displayPiEmail))))&&((this.indrFedShare == rhs.indrFedShare)||((this.indrFedShare!= null)&&this.indrFedShare.equals(rhs.indrFedShare))))&&((this.periodToDate == rhs.periodToDate)||((this.periodToDate!= null)&&this.periodToDate.equals(rhs.periodToDate))))&&((this.displayPayeeState == rhs.displayPayeeState)||((this.displayPayeeState!= null)&&this.displayPayeeState.equals(rhs.displayPayeeState))))&&((this.displayInstEin == rhs.displayInstEin)||((this.displayInstEin!= null)&&this.displayInstEin.equals(rhs.displayInstEin))))&&((this.displayUnexpProgIncome == rhs.displayUnexpProgIncome)||((this.displayUnexpProgIncome!= null)&&this.displayUnexpProgIncome.equals(rhs.displayUnexpProgIncome))))&&((this.displayPeriodToDate == rhs.displayPeriodToDate)||((this.displayPeriodToDate!= null)&&this.displayPeriodToDate.equals(rhs.displayPeriodToDate))))&&((this.fedShareExp == rhs.fedShareExp)||((this.fedShareExp!= null)&&this.fedShareExp.equals(rhs.fedShareExp))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayPayeeCity == rhs.displayPayeeCity)||((this.displayPayeeCity!= null)&&this.displayPayeeCity.equals(rhs.displayPayeeCity))))&&((this.dateSubmitted == rhs.dateSubmitted)||((this.dateSubmitted!= null)&&this.dateSubmitted.equals(rhs.dateSubmitted))));
    }

}
