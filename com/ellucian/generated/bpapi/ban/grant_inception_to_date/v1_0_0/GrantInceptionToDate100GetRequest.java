
package com.ellucian.generated.bpapi.ban.grant_inception_to_date.v1_0_0;

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
    "keyblocYearTo",
    "keyblocAtypCode",
    "keyblocMonthTo",
    "title",
    "keyblocProgCode",
    "keyblocAcciCode",
    "keyblocOrgnCode",
    "excludeAcctInd",
    "revenueAcctInd",
    "hier",
    "keyblocYearFrom",
    "keyblocLocnCode",
    "keyblocCoasCode",
    "intAtypDesc",
    "adjBudAmt",
    "keyblocAcctCode",
    "fundSummary",
    "acctCode",
    "keyblocAcctSummary",
    "sponsorAcctInd",
    "availBal",
    "keyblocMonthFrom",
    "ytdActvAmt",
    "keyblocActvCode",
    "keyblocGrntCode",
    "keyblocGrntYr",
    "cmtAmt",
    "keyblocFundCode"
})
@Generated("jsonschema2pojo")
public class GrantInceptionToDate100GetRequest {

    /**
     * Lineage reference object : keyblocYearTo
     * 
     */
    @JsonProperty("keyblocYearTo")
    @JsonPropertyDescription("Lineage reference object : keyblocYearTo")
    private Object keyblocYearTo;
    /**
     * Account Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp")
    private Object keyblocAtypCode;
    /**
     * Date To (MM/YY)
     * <p>
     * Lineage reference object : keyblocMonthTo
     * 
     */
    @JsonProperty("keyblocMonthTo")
    @JsonPropertyDescription("Lineage reference object : keyblocMonthTo")
    private Object keyblocMonthTo;
    /**
     * Frvgbal Title
     * <p>
     * Lineage reference object : FRVGBAL_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_TITLE")
    private String title;
    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgCode
     * 
     */
    @JsonProperty("keyblocProgCode")
    @JsonPropertyDescription("Lineage reference object : keyblocProgCode")
    private Object keyblocProgCode;
    /**
     * Index
     * <p>
     * Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci")
    private Object keyblocAcciCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : keyblocOrgnCode
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    @JsonPropertyDescription("Lineage reference object : keyblocOrgnCode")
    private Object keyblocOrgnCode;
    /**
     * Exclude Indirect Costs
     * <p>
     * Lineage reference object : excludeAcctInd
     * 
     */
    @JsonProperty("excludeAcctInd")
    @JsonPropertyDescription("Lineage reference object : excludeAcctInd")
    private Object excludeAcctInd;
    /**
     * Include Revenue Accounts
     * <p>
     * Lineage reference object : revenueAcctInd
     * 
     */
    @JsonProperty("revenueAcctInd")
    @JsonPropertyDescription("Lineage reference object : revenueAcctInd")
    private Object revenueAcctInd;
    /**
     * Hierarchy
     * <p>
     * Lineage reference object : hier
     * 
     */
    @JsonProperty("hier")
    @JsonPropertyDescription("Lineage reference object : hier")
    private Object hier;
    /**
     * Lineage reference object : keyblocYearFrom
     * 
     */
    @JsonProperty("keyblocYearFrom")
    @JsonPropertyDescription("Lineage reference object : keyblocYearFrom")
    private Object keyblocYearFrom;
    /**
     * Location
     * <p>
     * Lineage reference object : keyblocLocnCode
     * 
     */
    @JsonProperty("keyblocLocnCode")
    @JsonPropertyDescription("Lineage reference object : keyblocLocnCode")
    private Object keyblocLocnCode;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("keyblocCoasCode")
    @JsonPropertyDescription("Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas")
    private Object keyblocCoasCode;
    /**
     * Frvgbal Int Atyp Desc
     * <p>
     * Lineage reference object : FRVGBAL_INT_ATYP_DESC
     * 
     */
    @JsonProperty("intAtypDesc")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_INT_ATYP_DESC")
    private String intAtypDesc;
    /**
     * Frvgbal Adj Bud Amt
     * <p>
     * Lineage reference object : FRVGBAL_ADJ_BUD_AMT
     * 
     */
    @JsonProperty("adjBudAmt")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_ADJ_BUD_AMT")
    private Double adjBudAmt;
    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAcctCode")
    private Object keyblocAcctCode;
    /**
     * Fund Summary
     * <p>
     * Lineage reference object : fundSummary
     * 
     */
    @JsonProperty("fundSummary")
    @JsonPropertyDescription("Lineage reference object : fundSummary")
    private Object fundSummary;
    /**
     * Frvgbal Acct Code
     * <p>
     * Lineage reference object : FRVGBAL_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_ACCT_CODE")
    private String acctCode;
    /**
     * Account Summary
     * <p>
     * Lineage reference object : keyblocAcctSummary
     * 
     */
    @JsonProperty("keyblocAcctSummary")
    @JsonPropertyDescription("Lineage reference object : keyblocAcctSummary")
    private Object keyblocAcctSummary;
    /**
     * By Sponsor Account
     * <p>
     * Lineage reference object : sponsorAcctInd
     * 
     */
    @JsonProperty("sponsorAcctInd")
    @JsonPropertyDescription("Lineage reference object : sponsorAcctInd")
    private Object sponsorAcctInd;
    /**
     * Frvgbal Avail Bal
     * <p>
     * Lineage reference object : FRVGBAL_AVAIL_BAL
     * 
     */
    @JsonProperty("availBal")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_AVAIL_BAL")
    private Double availBal;
    /**
     * Date From (MM/YY)
     * <p>
     * Lineage reference object : keyblocMonthFrom
     * 
     */
    @JsonProperty("keyblocMonthFrom")
    @JsonPropertyDescription("Lineage reference object : keyblocMonthFrom")
    private Object keyblocMonthFrom;
    /**
     * Frvgbal Ytd Actv Amt
     * <p>
     * Lineage reference object : FRVGBAL_YTD_ACTV_AMT
     * 
     */
    @JsonProperty("ytdActvAmt")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_YTD_ACTV_AMT")
    private Double ytdActvAmt;
    /**
     * Activity
     * <p>
     * Lineage reference object : keyblocActvCode
     * 
     */
    @JsonProperty("keyblocActvCode")
    @JsonPropertyDescription("Lineage reference object : keyblocActvCode")
    private Object keyblocActvCode;
    /**
     * Grant
     * <p>
     * Lineage reference object : keyblocGrntCode
     * 
     */
    @JsonProperty("keyblocGrntCode")
    @JsonPropertyDescription("Lineage reference object : keyblocGrntCode")
    private Object keyblocGrntCode;
    /**
     * Grant Year
     * <p>
     * Lineage reference object : keyblocGrntYr
     * 
     */
    @JsonProperty("keyblocGrntYr")
    @JsonPropertyDescription("Lineage reference object : keyblocGrntYr")
    private Object keyblocGrntYr;
    /**
     * Frvgbal Cmt Amt
     * <p>
     * Lineage reference object : FRVGBAL_CMT_AMT
     * 
     */
    @JsonProperty("cmtAmt")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_CMT_AMT")
    private Double cmtAmt;
    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    @JsonPropertyDescription("Lineage reference object : keyblocFundCode")
    private Object keyblocFundCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : keyblocYearTo
     * 
     */
    @JsonProperty("keyblocYearTo")
    public Object getKeyblocYearTo() {
        return keyblocYearTo;
    }

    /**
     * Lineage reference object : keyblocYearTo
     * 
     */
    @JsonProperty("keyblocYearTo")
    public void setKeyblocYearTo(Object keyblocYearTo) {
        this.keyblocYearTo = keyblocYearTo;
    }

    public GrantInceptionToDate100GetRequest withKeyblocYearTo(Object keyblocYearTo) {
        this.keyblocYearTo = keyblocYearTo;
        return this;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    public Object getKeyblocAtypCode() {
        return keyblocAtypCode;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    public void setKeyblocAtypCode(Object keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocAtypCode(Object keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
        return this;
    }

    /**
     * Date To (MM/YY)
     * <p>
     * Lineage reference object : keyblocMonthTo
     * 
     */
    @JsonProperty("keyblocMonthTo")
    public Object getKeyblocMonthTo() {
        return keyblocMonthTo;
    }

    /**
     * Date To (MM/YY)
     * <p>
     * Lineage reference object : keyblocMonthTo
     * 
     */
    @JsonProperty("keyblocMonthTo")
    public void setKeyblocMonthTo(Object keyblocMonthTo) {
        this.keyblocMonthTo = keyblocMonthTo;
    }

    public GrantInceptionToDate100GetRequest withKeyblocMonthTo(Object keyblocMonthTo) {
        this.keyblocMonthTo = keyblocMonthTo;
        return this;
    }

    /**
     * Frvgbal Title
     * <p>
     * Lineage reference object : FRVGBAL_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Frvgbal Title
     * <p>
     * Lineage reference object : FRVGBAL_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GrantInceptionToDate100GetRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgCode
     * 
     */
    @JsonProperty("keyblocProgCode")
    public Object getKeyblocProgCode() {
        return keyblocProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgCode
     * 
     */
    @JsonProperty("keyblocProgCode")
    public void setKeyblocProgCode(Object keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocProgCode(Object keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    public Object getKeyblocAcciCode() {
        return keyblocAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    public void setKeyblocAcciCode(Object keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocAcciCode(Object keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : keyblocOrgnCode
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    public Object getKeyblocOrgnCode() {
        return keyblocOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : keyblocOrgnCode
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    public void setKeyblocOrgnCode(Object keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocOrgnCode(Object keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
        return this;
    }

    /**
     * Exclude Indirect Costs
     * <p>
     * Lineage reference object : excludeAcctInd
     * 
     */
    @JsonProperty("excludeAcctInd")
    public Object getExcludeAcctInd() {
        return excludeAcctInd;
    }

    /**
     * Exclude Indirect Costs
     * <p>
     * Lineage reference object : excludeAcctInd
     * 
     */
    @JsonProperty("excludeAcctInd")
    public void setExcludeAcctInd(Object excludeAcctInd) {
        this.excludeAcctInd = excludeAcctInd;
    }

    public GrantInceptionToDate100GetRequest withExcludeAcctInd(Object excludeAcctInd) {
        this.excludeAcctInd = excludeAcctInd;
        return this;
    }

    /**
     * Include Revenue Accounts
     * <p>
     * Lineage reference object : revenueAcctInd
     * 
     */
    @JsonProperty("revenueAcctInd")
    public Object getRevenueAcctInd() {
        return revenueAcctInd;
    }

    /**
     * Include Revenue Accounts
     * <p>
     * Lineage reference object : revenueAcctInd
     * 
     */
    @JsonProperty("revenueAcctInd")
    public void setRevenueAcctInd(Object revenueAcctInd) {
        this.revenueAcctInd = revenueAcctInd;
    }

    public GrantInceptionToDate100GetRequest withRevenueAcctInd(Object revenueAcctInd) {
        this.revenueAcctInd = revenueAcctInd;
        return this;
    }

    /**
     * Hierarchy
     * <p>
     * Lineage reference object : hier
     * 
     */
    @JsonProperty("hier")
    public Object getHier() {
        return hier;
    }

    /**
     * Hierarchy
     * <p>
     * Lineage reference object : hier
     * 
     */
    @JsonProperty("hier")
    public void setHier(Object hier) {
        this.hier = hier;
    }

    public GrantInceptionToDate100GetRequest withHier(Object hier) {
        this.hier = hier;
        return this;
    }

    /**
     * Lineage reference object : keyblocYearFrom
     * 
     */
    @JsonProperty("keyblocYearFrom")
    public Object getKeyblocYearFrom() {
        return keyblocYearFrom;
    }

    /**
     * Lineage reference object : keyblocYearFrom
     * 
     */
    @JsonProperty("keyblocYearFrom")
    public void setKeyblocYearFrom(Object keyblocYearFrom) {
        this.keyblocYearFrom = keyblocYearFrom;
    }

    public GrantInceptionToDate100GetRequest withKeyblocYearFrom(Object keyblocYearFrom) {
        this.keyblocYearFrom = keyblocYearFrom;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : keyblocLocnCode
     * 
     */
    @JsonProperty("keyblocLocnCode")
    public Object getKeyblocLocnCode() {
        return keyblocLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : keyblocLocnCode
     * 
     */
    @JsonProperty("keyblocLocnCode")
    public void setKeyblocLocnCode(Object keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocLocnCode(Object keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("keyblocCoasCode")
    public Object getKeyblocCoasCode() {
        return keyblocCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("keyblocCoasCode")
    public void setKeyblocCoasCode(Object keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocCoasCode(Object keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
        return this;
    }

    /**
     * Frvgbal Int Atyp Desc
     * <p>
     * Lineage reference object : FRVGBAL_INT_ATYP_DESC
     * 
     */
    @JsonProperty("intAtypDesc")
    public String getIntAtypDesc() {
        return intAtypDesc;
    }

    /**
     * Frvgbal Int Atyp Desc
     * <p>
     * Lineage reference object : FRVGBAL_INT_ATYP_DESC
     * 
     */
    @JsonProperty("intAtypDesc")
    public void setIntAtypDesc(String intAtypDesc) {
        this.intAtypDesc = intAtypDesc;
    }

    public GrantInceptionToDate100GetRequest withIntAtypDesc(String intAtypDesc) {
        this.intAtypDesc = intAtypDesc;
        return this;
    }

    /**
     * Frvgbal Adj Bud Amt
     * <p>
     * Lineage reference object : FRVGBAL_ADJ_BUD_AMT
     * 
     */
    @JsonProperty("adjBudAmt")
    public Double getAdjBudAmt() {
        return adjBudAmt;
    }

    /**
     * Frvgbal Adj Bud Amt
     * <p>
     * Lineage reference object : FRVGBAL_ADJ_BUD_AMT
     * 
     */
    @JsonProperty("adjBudAmt")
    public void setAdjBudAmt(Double adjBudAmt) {
        this.adjBudAmt = adjBudAmt;
    }

    public GrantInceptionToDate100GetRequest withAdjBudAmt(Double adjBudAmt) {
        this.adjBudAmt = adjBudAmt;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    public Object getKeyblocAcctCode() {
        return keyblocAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    public void setKeyblocAcctCode(Object keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocAcctCode(Object keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
        return this;
    }

    /**
     * Fund Summary
     * <p>
     * Lineage reference object : fundSummary
     * 
     */
    @JsonProperty("fundSummary")
    public Object getFundSummary() {
        return fundSummary;
    }

    /**
     * Fund Summary
     * <p>
     * Lineage reference object : fundSummary
     * 
     */
    @JsonProperty("fundSummary")
    public void setFundSummary(Object fundSummary) {
        this.fundSummary = fundSummary;
    }

    public GrantInceptionToDate100GetRequest withFundSummary(Object fundSummary) {
        this.fundSummary = fundSummary;
        return this;
    }

    /**
     * Frvgbal Acct Code
     * <p>
     * Lineage reference object : FRVGBAL_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Frvgbal Acct Code
     * <p>
     * Lineage reference object : FRVGBAL_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public GrantInceptionToDate100GetRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Account Summary
     * <p>
     * Lineage reference object : keyblocAcctSummary
     * 
     */
    @JsonProperty("keyblocAcctSummary")
    public Object getKeyblocAcctSummary() {
        return keyblocAcctSummary;
    }

    /**
     * Account Summary
     * <p>
     * Lineage reference object : keyblocAcctSummary
     * 
     */
    @JsonProperty("keyblocAcctSummary")
    public void setKeyblocAcctSummary(Object keyblocAcctSummary) {
        this.keyblocAcctSummary = keyblocAcctSummary;
    }

    public GrantInceptionToDate100GetRequest withKeyblocAcctSummary(Object keyblocAcctSummary) {
        this.keyblocAcctSummary = keyblocAcctSummary;
        return this;
    }

    /**
     * By Sponsor Account
     * <p>
     * Lineage reference object : sponsorAcctInd
     * 
     */
    @JsonProperty("sponsorAcctInd")
    public Object getSponsorAcctInd() {
        return sponsorAcctInd;
    }

    /**
     * By Sponsor Account
     * <p>
     * Lineage reference object : sponsorAcctInd
     * 
     */
    @JsonProperty("sponsorAcctInd")
    public void setSponsorAcctInd(Object sponsorAcctInd) {
        this.sponsorAcctInd = sponsorAcctInd;
    }

    public GrantInceptionToDate100GetRequest withSponsorAcctInd(Object sponsorAcctInd) {
        this.sponsorAcctInd = sponsorAcctInd;
        return this;
    }

    /**
     * Frvgbal Avail Bal
     * <p>
     * Lineage reference object : FRVGBAL_AVAIL_BAL
     * 
     */
    @JsonProperty("availBal")
    public Double getAvailBal() {
        return availBal;
    }

    /**
     * Frvgbal Avail Bal
     * <p>
     * Lineage reference object : FRVGBAL_AVAIL_BAL
     * 
     */
    @JsonProperty("availBal")
    public void setAvailBal(Double availBal) {
        this.availBal = availBal;
    }

    public GrantInceptionToDate100GetRequest withAvailBal(Double availBal) {
        this.availBal = availBal;
        return this;
    }

    /**
     * Date From (MM/YY)
     * <p>
     * Lineage reference object : keyblocMonthFrom
     * 
     */
    @JsonProperty("keyblocMonthFrom")
    public Object getKeyblocMonthFrom() {
        return keyblocMonthFrom;
    }

    /**
     * Date From (MM/YY)
     * <p>
     * Lineage reference object : keyblocMonthFrom
     * 
     */
    @JsonProperty("keyblocMonthFrom")
    public void setKeyblocMonthFrom(Object keyblocMonthFrom) {
        this.keyblocMonthFrom = keyblocMonthFrom;
    }

    public GrantInceptionToDate100GetRequest withKeyblocMonthFrom(Object keyblocMonthFrom) {
        this.keyblocMonthFrom = keyblocMonthFrom;
        return this;
    }

    /**
     * Frvgbal Ytd Actv Amt
     * <p>
     * Lineage reference object : FRVGBAL_YTD_ACTV_AMT
     * 
     */
    @JsonProperty("ytdActvAmt")
    public Double getYtdActvAmt() {
        return ytdActvAmt;
    }

    /**
     * Frvgbal Ytd Actv Amt
     * <p>
     * Lineage reference object : FRVGBAL_YTD_ACTV_AMT
     * 
     */
    @JsonProperty("ytdActvAmt")
    public void setYtdActvAmt(Double ytdActvAmt) {
        this.ytdActvAmt = ytdActvAmt;
    }

    public GrantInceptionToDate100GetRequest withYtdActvAmt(Double ytdActvAmt) {
        this.ytdActvAmt = ytdActvAmt;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : keyblocActvCode
     * 
     */
    @JsonProperty("keyblocActvCode")
    public Object getKeyblocActvCode() {
        return keyblocActvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : keyblocActvCode
     * 
     */
    @JsonProperty("keyblocActvCode")
    public void setKeyblocActvCode(Object keyblocActvCode) {
        this.keyblocActvCode = keyblocActvCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocActvCode(Object keyblocActvCode) {
        this.keyblocActvCode = keyblocActvCode;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : keyblocGrntCode
     * 
     */
    @JsonProperty("keyblocGrntCode")
    public Object getKeyblocGrntCode() {
        return keyblocGrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : keyblocGrntCode
     * 
     */
    @JsonProperty("keyblocGrntCode")
    public void setKeyblocGrntCode(Object keyblocGrntCode) {
        this.keyblocGrntCode = keyblocGrntCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocGrntCode(Object keyblocGrntCode) {
        this.keyblocGrntCode = keyblocGrntCode;
        return this;
    }

    /**
     * Grant Year
     * <p>
     * Lineage reference object : keyblocGrntYr
     * 
     */
    @JsonProperty("keyblocGrntYr")
    public Object getKeyblocGrntYr() {
        return keyblocGrntYr;
    }

    /**
     * Grant Year
     * <p>
     * Lineage reference object : keyblocGrntYr
     * 
     */
    @JsonProperty("keyblocGrntYr")
    public void setKeyblocGrntYr(Object keyblocGrntYr) {
        this.keyblocGrntYr = keyblocGrntYr;
    }

    public GrantInceptionToDate100GetRequest withKeyblocGrntYr(Object keyblocGrntYr) {
        this.keyblocGrntYr = keyblocGrntYr;
        return this;
    }

    /**
     * Frvgbal Cmt Amt
     * <p>
     * Lineage reference object : FRVGBAL_CMT_AMT
     * 
     */
    @JsonProperty("cmtAmt")
    public Double getCmtAmt() {
        return cmtAmt;
    }

    /**
     * Frvgbal Cmt Amt
     * <p>
     * Lineage reference object : FRVGBAL_CMT_AMT
     * 
     */
    @JsonProperty("cmtAmt")
    public void setCmtAmt(Double cmtAmt) {
        this.cmtAmt = cmtAmt;
    }

    public GrantInceptionToDate100GetRequest withCmtAmt(Double cmtAmt) {
        this.cmtAmt = cmtAmt;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    public Object getKeyblocFundCode() {
        return keyblocFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    public void setKeyblocFundCode(Object keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
    }

    public GrantInceptionToDate100GetRequest withKeyblocFundCode(Object keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
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

    public GrantInceptionToDate100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantInceptionToDate100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocYearTo");
        sb.append('=');
        sb.append(((this.keyblocYearTo == null)?"<null>":this.keyblocYearTo));
        sb.append(',');
        sb.append("keyblocAtypCode");
        sb.append('=');
        sb.append(((this.keyblocAtypCode == null)?"<null>":this.keyblocAtypCode));
        sb.append(',');
        sb.append("keyblocMonthTo");
        sb.append('=');
        sb.append(((this.keyblocMonthTo == null)?"<null>":this.keyblocMonthTo));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("keyblocProgCode");
        sb.append('=');
        sb.append(((this.keyblocProgCode == null)?"<null>":this.keyblocProgCode));
        sb.append(',');
        sb.append("keyblocAcciCode");
        sb.append('=');
        sb.append(((this.keyblocAcciCode == null)?"<null>":this.keyblocAcciCode));
        sb.append(',');
        sb.append("keyblocOrgnCode");
        sb.append('=');
        sb.append(((this.keyblocOrgnCode == null)?"<null>":this.keyblocOrgnCode));
        sb.append(',');
        sb.append("excludeAcctInd");
        sb.append('=');
        sb.append(((this.excludeAcctInd == null)?"<null>":this.excludeAcctInd));
        sb.append(',');
        sb.append("revenueAcctInd");
        sb.append('=');
        sb.append(((this.revenueAcctInd == null)?"<null>":this.revenueAcctInd));
        sb.append(',');
        sb.append("hier");
        sb.append('=');
        sb.append(((this.hier == null)?"<null>":this.hier));
        sb.append(',');
        sb.append("keyblocYearFrom");
        sb.append('=');
        sb.append(((this.keyblocYearFrom == null)?"<null>":this.keyblocYearFrom));
        sb.append(',');
        sb.append("keyblocLocnCode");
        sb.append('=');
        sb.append(((this.keyblocLocnCode == null)?"<null>":this.keyblocLocnCode));
        sb.append(',');
        sb.append("keyblocCoasCode");
        sb.append('=');
        sb.append(((this.keyblocCoasCode == null)?"<null>":this.keyblocCoasCode));
        sb.append(',');
        sb.append("intAtypDesc");
        sb.append('=');
        sb.append(((this.intAtypDesc == null)?"<null>":this.intAtypDesc));
        sb.append(',');
        sb.append("adjBudAmt");
        sb.append('=');
        sb.append(((this.adjBudAmt == null)?"<null>":this.adjBudAmt));
        sb.append(',');
        sb.append("keyblocAcctCode");
        sb.append('=');
        sb.append(((this.keyblocAcctCode == null)?"<null>":this.keyblocAcctCode));
        sb.append(',');
        sb.append("fundSummary");
        sb.append('=');
        sb.append(((this.fundSummary == null)?"<null>":this.fundSummary));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("keyblocAcctSummary");
        sb.append('=');
        sb.append(((this.keyblocAcctSummary == null)?"<null>":this.keyblocAcctSummary));
        sb.append(',');
        sb.append("sponsorAcctInd");
        sb.append('=');
        sb.append(((this.sponsorAcctInd == null)?"<null>":this.sponsorAcctInd));
        sb.append(',');
        sb.append("availBal");
        sb.append('=');
        sb.append(((this.availBal == null)?"<null>":this.availBal));
        sb.append(',');
        sb.append("keyblocMonthFrom");
        sb.append('=');
        sb.append(((this.keyblocMonthFrom == null)?"<null>":this.keyblocMonthFrom));
        sb.append(',');
        sb.append("ytdActvAmt");
        sb.append('=');
        sb.append(((this.ytdActvAmt == null)?"<null>":this.ytdActvAmt));
        sb.append(',');
        sb.append("keyblocActvCode");
        sb.append('=');
        sb.append(((this.keyblocActvCode == null)?"<null>":this.keyblocActvCode));
        sb.append(',');
        sb.append("keyblocGrntCode");
        sb.append('=');
        sb.append(((this.keyblocGrntCode == null)?"<null>":this.keyblocGrntCode));
        sb.append(',');
        sb.append("keyblocGrntYr");
        sb.append('=');
        sb.append(((this.keyblocGrntYr == null)?"<null>":this.keyblocGrntYr));
        sb.append(',');
        sb.append("cmtAmt");
        sb.append('=');
        sb.append(((this.cmtAmt == null)?"<null>":this.cmtAmt));
        sb.append(',');
        sb.append("keyblocFundCode");
        sb.append('=');
        sb.append(((this.keyblocFundCode == null)?"<null>":this.keyblocFundCode));
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
        result = ((result* 31)+((this.keyblocYearTo == null)? 0 :this.keyblocYearTo.hashCode()));
        result = ((result* 31)+((this.keyblocAtypCode == null)? 0 :this.keyblocAtypCode.hashCode()));
        result = ((result* 31)+((this.keyblocMonthTo == null)? 0 :this.keyblocMonthTo.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.keyblocProgCode == null)? 0 :this.keyblocProgCode.hashCode()));
        result = ((result* 31)+((this.keyblocAcciCode == null)? 0 :this.keyblocAcciCode.hashCode()));
        result = ((result* 31)+((this.keyblocOrgnCode == null)? 0 :this.keyblocOrgnCode.hashCode()));
        result = ((result* 31)+((this.excludeAcctInd == null)? 0 :this.excludeAcctInd.hashCode()));
        result = ((result* 31)+((this.revenueAcctInd == null)? 0 :this.revenueAcctInd.hashCode()));
        result = ((result* 31)+((this.hier == null)? 0 :this.hier.hashCode()));
        result = ((result* 31)+((this.keyblocYearFrom == null)? 0 :this.keyblocYearFrom.hashCode()));
        result = ((result* 31)+((this.keyblocLocnCode == null)? 0 :this.keyblocLocnCode.hashCode()));
        result = ((result* 31)+((this.keyblocCoasCode == null)? 0 :this.keyblocCoasCode.hashCode()));
        result = ((result* 31)+((this.intAtypDesc == null)? 0 :this.intAtypDesc.hashCode()));
        result = ((result* 31)+((this.adjBudAmt == null)? 0 :this.adjBudAmt.hashCode()));
        result = ((result* 31)+((this.keyblocAcctCode == null)? 0 :this.keyblocAcctCode.hashCode()));
        result = ((result* 31)+((this.fundSummary == null)? 0 :this.fundSummary.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.keyblocAcctSummary == null)? 0 :this.keyblocAcctSummary.hashCode()));
        result = ((result* 31)+((this.sponsorAcctInd == null)? 0 :this.sponsorAcctInd.hashCode()));
        result = ((result* 31)+((this.availBal == null)? 0 :this.availBal.hashCode()));
        result = ((result* 31)+((this.keyblocMonthFrom == null)? 0 :this.keyblocMonthFrom.hashCode()));
        result = ((result* 31)+((this.ytdActvAmt == null)? 0 :this.ytdActvAmt.hashCode()));
        result = ((result* 31)+((this.keyblocActvCode == null)? 0 :this.keyblocActvCode.hashCode()));
        result = ((result* 31)+((this.keyblocGrntCode == null)? 0 :this.keyblocGrntCode.hashCode()));
        result = ((result* 31)+((this.keyblocGrntYr == null)? 0 :this.keyblocGrntYr.hashCode()));
        result = ((result* 31)+((this.cmtAmt == null)? 0 :this.cmtAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblocFundCode == null)? 0 :this.keyblocFundCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantInceptionToDate100GetRequest) == false) {
            return false;
        }
        GrantInceptionToDate100GetRequest rhs = ((GrantInceptionToDate100GetRequest) other);
        return ((((((((((((((((((((((((((((((this.keyblocYearTo == rhs.keyblocYearTo)||((this.keyblocYearTo!= null)&&this.keyblocYearTo.equals(rhs.keyblocYearTo)))&&((this.keyblocAtypCode == rhs.keyblocAtypCode)||((this.keyblocAtypCode!= null)&&this.keyblocAtypCode.equals(rhs.keyblocAtypCode))))&&((this.keyblocMonthTo == rhs.keyblocMonthTo)||((this.keyblocMonthTo!= null)&&this.keyblocMonthTo.equals(rhs.keyblocMonthTo))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.keyblocProgCode == rhs.keyblocProgCode)||((this.keyblocProgCode!= null)&&this.keyblocProgCode.equals(rhs.keyblocProgCode))))&&((this.keyblocAcciCode == rhs.keyblocAcciCode)||((this.keyblocAcciCode!= null)&&this.keyblocAcciCode.equals(rhs.keyblocAcciCode))))&&((this.keyblocOrgnCode == rhs.keyblocOrgnCode)||((this.keyblocOrgnCode!= null)&&this.keyblocOrgnCode.equals(rhs.keyblocOrgnCode))))&&((this.excludeAcctInd == rhs.excludeAcctInd)||((this.excludeAcctInd!= null)&&this.excludeAcctInd.equals(rhs.excludeAcctInd))))&&((this.revenueAcctInd == rhs.revenueAcctInd)||((this.revenueAcctInd!= null)&&this.revenueAcctInd.equals(rhs.revenueAcctInd))))&&((this.hier == rhs.hier)||((this.hier!= null)&&this.hier.equals(rhs.hier))))&&((this.keyblocYearFrom == rhs.keyblocYearFrom)||((this.keyblocYearFrom!= null)&&this.keyblocYearFrom.equals(rhs.keyblocYearFrom))))&&((this.keyblocLocnCode == rhs.keyblocLocnCode)||((this.keyblocLocnCode!= null)&&this.keyblocLocnCode.equals(rhs.keyblocLocnCode))))&&((this.keyblocCoasCode == rhs.keyblocCoasCode)||((this.keyblocCoasCode!= null)&&this.keyblocCoasCode.equals(rhs.keyblocCoasCode))))&&((this.intAtypDesc == rhs.intAtypDesc)||((this.intAtypDesc!= null)&&this.intAtypDesc.equals(rhs.intAtypDesc))))&&((this.adjBudAmt == rhs.adjBudAmt)||((this.adjBudAmt!= null)&&this.adjBudAmt.equals(rhs.adjBudAmt))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.fundSummary == rhs.fundSummary)||((this.fundSummary!= null)&&this.fundSummary.equals(rhs.fundSummary))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.keyblocAcctSummary == rhs.keyblocAcctSummary)||((this.keyblocAcctSummary!= null)&&this.keyblocAcctSummary.equals(rhs.keyblocAcctSummary))))&&((this.sponsorAcctInd == rhs.sponsorAcctInd)||((this.sponsorAcctInd!= null)&&this.sponsorAcctInd.equals(rhs.sponsorAcctInd))))&&((this.availBal == rhs.availBal)||((this.availBal!= null)&&this.availBal.equals(rhs.availBal))))&&((this.keyblocMonthFrom == rhs.keyblocMonthFrom)||((this.keyblocMonthFrom!= null)&&this.keyblocMonthFrom.equals(rhs.keyblocMonthFrom))))&&((this.ytdActvAmt == rhs.ytdActvAmt)||((this.ytdActvAmt!= null)&&this.ytdActvAmt.equals(rhs.ytdActvAmt))))&&((this.keyblocActvCode == rhs.keyblocActvCode)||((this.keyblocActvCode!= null)&&this.keyblocActvCode.equals(rhs.keyblocActvCode))))&&((this.keyblocGrntCode == rhs.keyblocGrntCode)||((this.keyblocGrntCode!= null)&&this.keyblocGrntCode.equals(rhs.keyblocGrntCode))))&&((this.keyblocGrntYr == rhs.keyblocGrntYr)||((this.keyblocGrntYr!= null)&&this.keyblocGrntYr.equals(rhs.keyblocGrntYr))))&&((this.cmtAmt == rhs.cmtAmt)||((this.cmtAmt!= null)&&this.cmtAmt.equals(rhs.cmtAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))));
    }

}
