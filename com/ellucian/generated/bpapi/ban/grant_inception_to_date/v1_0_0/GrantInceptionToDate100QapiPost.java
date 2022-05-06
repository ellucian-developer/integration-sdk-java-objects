
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
    "keyblocCoasCode",
    "keyblocGrntCode",
    "keyblocGrntYr",
    "keyblocAcciCode",
    "keyblocFundCode",
    "keyblocOrgnCode",
    "keyblocProgCode",
    "keyblocActvCode",
    "keyblocLocnCode",
    "keyblocAtypCode",
    "keyblocAcctCode",
    "keyblocAcctSummary",
    "keyblocMonthFrom",
    "keyblocYearFrom",
    "keyblocMonthTo",
    "keyblocYearTo",
    "revenueAcctInd",
    "excludeAcctInd",
    "hier",
    "fundSummary",
    "sponsorAcctInd",
    "acctCode",
    "intAtypDesc",
    "title",
    "adjBudAmt",
    "ytdActvAmt",
    "cmtAmt",
    "availBal"
})
@Generated("jsonschema2pojo")
public class GrantInceptionToDate100QapiPost {

    @JsonProperty("keyblocCoasCode")
    private String keyblocCoasCode;
    @JsonProperty("keyblocGrntCode")
    private String keyblocGrntCode;
    @JsonProperty("keyblocGrntYr")
    private String keyblocGrntYr;
    @JsonProperty("keyblocAcciCode")
    private String keyblocAcciCode;
    @JsonProperty("keyblocFundCode")
    private String keyblocFundCode;
    @JsonProperty("keyblocOrgnCode")
    private String keyblocOrgnCode;
    @JsonProperty("keyblocProgCode")
    private String keyblocProgCode;
    @JsonProperty("keyblocActvCode")
    private String keyblocActvCode;
    @JsonProperty("keyblocLocnCode")
    private String keyblocLocnCode;
    @JsonProperty("keyblocAtypCode")
    private String keyblocAtypCode;
    @JsonProperty("keyblocAcctCode")
    private String keyblocAcctCode;
    @JsonProperty("keyblocAcctSummary")
    private String keyblocAcctSummary;
    @JsonProperty("keyblocMonthFrom")
    private String keyblocMonthFrom;
    @JsonProperty("keyblocYearFrom")
    private String keyblocYearFrom;
    @JsonProperty("keyblocMonthTo")
    private String keyblocMonthTo;
    @JsonProperty("keyblocYearTo")
    private String keyblocYearTo;
    @JsonProperty("revenueAcctInd")
    private String revenueAcctInd;
    @JsonProperty("excludeAcctInd")
    private String excludeAcctInd;
    @JsonProperty("hier")
    private String hier;
    @JsonProperty("fundSummary")
    private String fundSummary;
    @JsonProperty("sponsorAcctInd")
    private String sponsorAcctInd;
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
     * Frvgbal Int Atyp Desc
     * <p>
     * Lineage reference object : FRVGBAL_INT_ATYP_DESC
     * 
     */
    @JsonProperty("intAtypDesc")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_INT_ATYP_DESC")
    private String intAtypDesc;
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
     * Frvgbal Adj Bud Amt
     * <p>
     * Lineage reference object : FRVGBAL_ADJ_BUD_AMT
     * 
     */
    @JsonProperty("adjBudAmt")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_ADJ_BUD_AMT")
    private Double adjBudAmt;
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
     * Frvgbal Cmt Amt
     * <p>
     * Lineage reference object : FRVGBAL_CMT_AMT
     * 
     */
    @JsonProperty("cmtAmt")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_CMT_AMT")
    private Double cmtAmt;
    /**
     * Frvgbal Avail Bal
     * <p>
     * Lineage reference object : FRVGBAL_AVAIL_BAL
     * 
     */
    @JsonProperty("availBal")
    @JsonPropertyDescription("Lineage reference object : FRVGBAL_AVAIL_BAL")
    private Double availBal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblocCoasCode")
    public String getKeyblocCoasCode() {
        return keyblocCoasCode;
    }

    @JsonProperty("keyblocCoasCode")
    public void setKeyblocCoasCode(String keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocCoasCode(String keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
        return this;
    }

    @JsonProperty("keyblocGrntCode")
    public String getKeyblocGrntCode() {
        return keyblocGrntCode;
    }

    @JsonProperty("keyblocGrntCode")
    public void setKeyblocGrntCode(String keyblocGrntCode) {
        this.keyblocGrntCode = keyblocGrntCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocGrntCode(String keyblocGrntCode) {
        this.keyblocGrntCode = keyblocGrntCode;
        return this;
    }

    @JsonProperty("keyblocGrntYr")
    public String getKeyblocGrntYr() {
        return keyblocGrntYr;
    }

    @JsonProperty("keyblocGrntYr")
    public void setKeyblocGrntYr(String keyblocGrntYr) {
        this.keyblocGrntYr = keyblocGrntYr;
    }

    public GrantInceptionToDate100QapiPost withKeyblocGrntYr(String keyblocGrntYr) {
        this.keyblocGrntYr = keyblocGrntYr;
        return this;
    }

    @JsonProperty("keyblocAcciCode")
    public String getKeyblocAcciCode() {
        return keyblocAcciCode;
    }

    @JsonProperty("keyblocAcciCode")
    public void setKeyblocAcciCode(String keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocAcciCode(String keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
        return this;
    }

    @JsonProperty("keyblocFundCode")
    public String getKeyblocFundCode() {
        return keyblocFundCode;
    }

    @JsonProperty("keyblocFundCode")
    public void setKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
        return this;
    }

    @JsonProperty("keyblocOrgnCode")
    public String getKeyblocOrgnCode() {
        return keyblocOrgnCode;
    }

    @JsonProperty("keyblocOrgnCode")
    public void setKeyblocOrgnCode(String keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocOrgnCode(String keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
        return this;
    }

    @JsonProperty("keyblocProgCode")
    public String getKeyblocProgCode() {
        return keyblocProgCode;
    }

    @JsonProperty("keyblocProgCode")
    public void setKeyblocProgCode(String keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocProgCode(String keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
        return this;
    }

    @JsonProperty("keyblocActvCode")
    public String getKeyblocActvCode() {
        return keyblocActvCode;
    }

    @JsonProperty("keyblocActvCode")
    public void setKeyblocActvCode(String keyblocActvCode) {
        this.keyblocActvCode = keyblocActvCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocActvCode(String keyblocActvCode) {
        this.keyblocActvCode = keyblocActvCode;
        return this;
    }

    @JsonProperty("keyblocLocnCode")
    public String getKeyblocLocnCode() {
        return keyblocLocnCode;
    }

    @JsonProperty("keyblocLocnCode")
    public void setKeyblocLocnCode(String keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocLocnCode(String keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
        return this;
    }

    @JsonProperty("keyblocAtypCode")
    public String getKeyblocAtypCode() {
        return keyblocAtypCode;
    }

    @JsonProperty("keyblocAtypCode")
    public void setKeyblocAtypCode(String keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocAtypCode(String keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
        return this;
    }

    @JsonProperty("keyblocAcctCode")
    public String getKeyblocAcctCode() {
        return keyblocAcctCode;
    }

    @JsonProperty("keyblocAcctCode")
    public void setKeyblocAcctCode(String keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
    }

    public GrantInceptionToDate100QapiPost withKeyblocAcctCode(String keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
        return this;
    }

    @JsonProperty("keyblocAcctSummary")
    public String getKeyblocAcctSummary() {
        return keyblocAcctSummary;
    }

    @JsonProperty("keyblocAcctSummary")
    public void setKeyblocAcctSummary(String keyblocAcctSummary) {
        this.keyblocAcctSummary = keyblocAcctSummary;
    }

    public GrantInceptionToDate100QapiPost withKeyblocAcctSummary(String keyblocAcctSummary) {
        this.keyblocAcctSummary = keyblocAcctSummary;
        return this;
    }

    @JsonProperty("keyblocMonthFrom")
    public String getKeyblocMonthFrom() {
        return keyblocMonthFrom;
    }

    @JsonProperty("keyblocMonthFrom")
    public void setKeyblocMonthFrom(String keyblocMonthFrom) {
        this.keyblocMonthFrom = keyblocMonthFrom;
    }

    public GrantInceptionToDate100QapiPost withKeyblocMonthFrom(String keyblocMonthFrom) {
        this.keyblocMonthFrom = keyblocMonthFrom;
        return this;
    }

    @JsonProperty("keyblocYearFrom")
    public String getKeyblocYearFrom() {
        return keyblocYearFrom;
    }

    @JsonProperty("keyblocYearFrom")
    public void setKeyblocYearFrom(String keyblocYearFrom) {
        this.keyblocYearFrom = keyblocYearFrom;
    }

    public GrantInceptionToDate100QapiPost withKeyblocYearFrom(String keyblocYearFrom) {
        this.keyblocYearFrom = keyblocYearFrom;
        return this;
    }

    @JsonProperty("keyblocMonthTo")
    public String getKeyblocMonthTo() {
        return keyblocMonthTo;
    }

    @JsonProperty("keyblocMonthTo")
    public void setKeyblocMonthTo(String keyblocMonthTo) {
        this.keyblocMonthTo = keyblocMonthTo;
    }

    public GrantInceptionToDate100QapiPost withKeyblocMonthTo(String keyblocMonthTo) {
        this.keyblocMonthTo = keyblocMonthTo;
        return this;
    }

    @JsonProperty("keyblocYearTo")
    public String getKeyblocYearTo() {
        return keyblocYearTo;
    }

    @JsonProperty("keyblocYearTo")
    public void setKeyblocYearTo(String keyblocYearTo) {
        this.keyblocYearTo = keyblocYearTo;
    }

    public GrantInceptionToDate100QapiPost withKeyblocYearTo(String keyblocYearTo) {
        this.keyblocYearTo = keyblocYearTo;
        return this;
    }

    @JsonProperty("revenueAcctInd")
    public String getRevenueAcctInd() {
        return revenueAcctInd;
    }

    @JsonProperty("revenueAcctInd")
    public void setRevenueAcctInd(String revenueAcctInd) {
        this.revenueAcctInd = revenueAcctInd;
    }

    public GrantInceptionToDate100QapiPost withRevenueAcctInd(String revenueAcctInd) {
        this.revenueAcctInd = revenueAcctInd;
        return this;
    }

    @JsonProperty("excludeAcctInd")
    public String getExcludeAcctInd() {
        return excludeAcctInd;
    }

    @JsonProperty("excludeAcctInd")
    public void setExcludeAcctInd(String excludeAcctInd) {
        this.excludeAcctInd = excludeAcctInd;
    }

    public GrantInceptionToDate100QapiPost withExcludeAcctInd(String excludeAcctInd) {
        this.excludeAcctInd = excludeAcctInd;
        return this;
    }

    @JsonProperty("hier")
    public String getHier() {
        return hier;
    }

    @JsonProperty("hier")
    public void setHier(String hier) {
        this.hier = hier;
    }

    public GrantInceptionToDate100QapiPost withHier(String hier) {
        this.hier = hier;
        return this;
    }

    @JsonProperty("fundSummary")
    public String getFundSummary() {
        return fundSummary;
    }

    @JsonProperty("fundSummary")
    public void setFundSummary(String fundSummary) {
        this.fundSummary = fundSummary;
    }

    public GrantInceptionToDate100QapiPost withFundSummary(String fundSummary) {
        this.fundSummary = fundSummary;
        return this;
    }

    @JsonProperty("sponsorAcctInd")
    public String getSponsorAcctInd() {
        return sponsorAcctInd;
    }

    @JsonProperty("sponsorAcctInd")
    public void setSponsorAcctInd(String sponsorAcctInd) {
        this.sponsorAcctInd = sponsorAcctInd;
    }

    public GrantInceptionToDate100QapiPost withSponsorAcctInd(String sponsorAcctInd) {
        this.sponsorAcctInd = sponsorAcctInd;
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

    public GrantInceptionToDate100QapiPost withAcctCode(String acctCode) {
        this.acctCode = acctCode;
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

    public GrantInceptionToDate100QapiPost withIntAtypDesc(String intAtypDesc) {
        this.intAtypDesc = intAtypDesc;
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

    public GrantInceptionToDate100QapiPost withTitle(String title) {
        this.title = title;
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

    public GrantInceptionToDate100QapiPost withAdjBudAmt(Double adjBudAmt) {
        this.adjBudAmt = adjBudAmt;
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

    public GrantInceptionToDate100QapiPost withYtdActvAmt(Double ytdActvAmt) {
        this.ytdActvAmt = ytdActvAmt;
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

    public GrantInceptionToDate100QapiPost withCmtAmt(Double cmtAmt) {
        this.cmtAmt = cmtAmt;
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

    public GrantInceptionToDate100QapiPost withAvailBal(Double availBal) {
        this.availBal = availBal;
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

    public GrantInceptionToDate100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantInceptionToDate100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocCoasCode");
        sb.append('=');
        sb.append(((this.keyblocCoasCode == null)?"<null>":this.keyblocCoasCode));
        sb.append(',');
        sb.append("keyblocGrntCode");
        sb.append('=');
        sb.append(((this.keyblocGrntCode == null)?"<null>":this.keyblocGrntCode));
        sb.append(',');
        sb.append("keyblocGrntYr");
        sb.append('=');
        sb.append(((this.keyblocGrntYr == null)?"<null>":this.keyblocGrntYr));
        sb.append(',');
        sb.append("keyblocAcciCode");
        sb.append('=');
        sb.append(((this.keyblocAcciCode == null)?"<null>":this.keyblocAcciCode));
        sb.append(',');
        sb.append("keyblocFundCode");
        sb.append('=');
        sb.append(((this.keyblocFundCode == null)?"<null>":this.keyblocFundCode));
        sb.append(',');
        sb.append("keyblocOrgnCode");
        sb.append('=');
        sb.append(((this.keyblocOrgnCode == null)?"<null>":this.keyblocOrgnCode));
        sb.append(',');
        sb.append("keyblocProgCode");
        sb.append('=');
        sb.append(((this.keyblocProgCode == null)?"<null>":this.keyblocProgCode));
        sb.append(',');
        sb.append("keyblocActvCode");
        sb.append('=');
        sb.append(((this.keyblocActvCode == null)?"<null>":this.keyblocActvCode));
        sb.append(',');
        sb.append("keyblocLocnCode");
        sb.append('=');
        sb.append(((this.keyblocLocnCode == null)?"<null>":this.keyblocLocnCode));
        sb.append(',');
        sb.append("keyblocAtypCode");
        sb.append('=');
        sb.append(((this.keyblocAtypCode == null)?"<null>":this.keyblocAtypCode));
        sb.append(',');
        sb.append("keyblocAcctCode");
        sb.append('=');
        sb.append(((this.keyblocAcctCode == null)?"<null>":this.keyblocAcctCode));
        sb.append(',');
        sb.append("keyblocAcctSummary");
        sb.append('=');
        sb.append(((this.keyblocAcctSummary == null)?"<null>":this.keyblocAcctSummary));
        sb.append(',');
        sb.append("keyblocMonthFrom");
        sb.append('=');
        sb.append(((this.keyblocMonthFrom == null)?"<null>":this.keyblocMonthFrom));
        sb.append(',');
        sb.append("keyblocYearFrom");
        sb.append('=');
        sb.append(((this.keyblocYearFrom == null)?"<null>":this.keyblocYearFrom));
        sb.append(',');
        sb.append("keyblocMonthTo");
        sb.append('=');
        sb.append(((this.keyblocMonthTo == null)?"<null>":this.keyblocMonthTo));
        sb.append(',');
        sb.append("keyblocYearTo");
        sb.append('=');
        sb.append(((this.keyblocYearTo == null)?"<null>":this.keyblocYearTo));
        sb.append(',');
        sb.append("revenueAcctInd");
        sb.append('=');
        sb.append(((this.revenueAcctInd == null)?"<null>":this.revenueAcctInd));
        sb.append(',');
        sb.append("excludeAcctInd");
        sb.append('=');
        sb.append(((this.excludeAcctInd == null)?"<null>":this.excludeAcctInd));
        sb.append(',');
        sb.append("hier");
        sb.append('=');
        sb.append(((this.hier == null)?"<null>":this.hier));
        sb.append(',');
        sb.append("fundSummary");
        sb.append('=');
        sb.append(((this.fundSummary == null)?"<null>":this.fundSummary));
        sb.append(',');
        sb.append("sponsorAcctInd");
        sb.append('=');
        sb.append(((this.sponsorAcctInd == null)?"<null>":this.sponsorAcctInd));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("intAtypDesc");
        sb.append('=');
        sb.append(((this.intAtypDesc == null)?"<null>":this.intAtypDesc));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("adjBudAmt");
        sb.append('=');
        sb.append(((this.adjBudAmt == null)?"<null>":this.adjBudAmt));
        sb.append(',');
        sb.append("ytdActvAmt");
        sb.append('=');
        sb.append(((this.ytdActvAmt == null)?"<null>":this.ytdActvAmt));
        sb.append(',');
        sb.append("cmtAmt");
        sb.append('=');
        sb.append(((this.cmtAmt == null)?"<null>":this.cmtAmt));
        sb.append(',');
        sb.append("availBal");
        sb.append('=');
        sb.append(((this.availBal == null)?"<null>":this.availBal));
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
        if ((other instanceof GrantInceptionToDate100QapiPost) == false) {
            return false;
        }
        GrantInceptionToDate100QapiPost rhs = ((GrantInceptionToDate100QapiPost) other);
        return ((((((((((((((((((((((((((((((this.keyblocYearTo == rhs.keyblocYearTo)||((this.keyblocYearTo!= null)&&this.keyblocYearTo.equals(rhs.keyblocYearTo)))&&((this.keyblocAtypCode == rhs.keyblocAtypCode)||((this.keyblocAtypCode!= null)&&this.keyblocAtypCode.equals(rhs.keyblocAtypCode))))&&((this.keyblocMonthTo == rhs.keyblocMonthTo)||((this.keyblocMonthTo!= null)&&this.keyblocMonthTo.equals(rhs.keyblocMonthTo))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.keyblocProgCode == rhs.keyblocProgCode)||((this.keyblocProgCode!= null)&&this.keyblocProgCode.equals(rhs.keyblocProgCode))))&&((this.keyblocAcciCode == rhs.keyblocAcciCode)||((this.keyblocAcciCode!= null)&&this.keyblocAcciCode.equals(rhs.keyblocAcciCode))))&&((this.keyblocOrgnCode == rhs.keyblocOrgnCode)||((this.keyblocOrgnCode!= null)&&this.keyblocOrgnCode.equals(rhs.keyblocOrgnCode))))&&((this.excludeAcctInd == rhs.excludeAcctInd)||((this.excludeAcctInd!= null)&&this.excludeAcctInd.equals(rhs.excludeAcctInd))))&&((this.revenueAcctInd == rhs.revenueAcctInd)||((this.revenueAcctInd!= null)&&this.revenueAcctInd.equals(rhs.revenueAcctInd))))&&((this.hier == rhs.hier)||((this.hier!= null)&&this.hier.equals(rhs.hier))))&&((this.keyblocYearFrom == rhs.keyblocYearFrom)||((this.keyblocYearFrom!= null)&&this.keyblocYearFrom.equals(rhs.keyblocYearFrom))))&&((this.keyblocLocnCode == rhs.keyblocLocnCode)||((this.keyblocLocnCode!= null)&&this.keyblocLocnCode.equals(rhs.keyblocLocnCode))))&&((this.keyblocCoasCode == rhs.keyblocCoasCode)||((this.keyblocCoasCode!= null)&&this.keyblocCoasCode.equals(rhs.keyblocCoasCode))))&&((this.intAtypDesc == rhs.intAtypDesc)||((this.intAtypDesc!= null)&&this.intAtypDesc.equals(rhs.intAtypDesc))))&&((this.adjBudAmt == rhs.adjBudAmt)||((this.adjBudAmt!= null)&&this.adjBudAmt.equals(rhs.adjBudAmt))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.fundSummary == rhs.fundSummary)||((this.fundSummary!= null)&&this.fundSummary.equals(rhs.fundSummary))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.keyblocAcctSummary == rhs.keyblocAcctSummary)||((this.keyblocAcctSummary!= null)&&this.keyblocAcctSummary.equals(rhs.keyblocAcctSummary))))&&((this.sponsorAcctInd == rhs.sponsorAcctInd)||((this.sponsorAcctInd!= null)&&this.sponsorAcctInd.equals(rhs.sponsorAcctInd))))&&((this.availBal == rhs.availBal)||((this.availBal!= null)&&this.availBal.equals(rhs.availBal))))&&((this.keyblocMonthFrom == rhs.keyblocMonthFrom)||((this.keyblocMonthFrom!= null)&&this.keyblocMonthFrom.equals(rhs.keyblocMonthFrom))))&&((this.ytdActvAmt == rhs.ytdActvAmt)||((this.ytdActvAmt!= null)&&this.ytdActvAmt.equals(rhs.ytdActvAmt))))&&((this.keyblocActvCode == rhs.keyblocActvCode)||((this.keyblocActvCode!= null)&&this.keyblocActvCode.equals(rhs.keyblocActvCode))))&&((this.keyblocGrntCode == rhs.keyblocGrntCode)||((this.keyblocGrntCode!= null)&&this.keyblocGrntCode.equals(rhs.keyblocGrntCode))))&&((this.keyblocGrntYr == rhs.keyblocGrntYr)||((this.keyblocGrntYr!= null)&&this.keyblocGrntYr.equals(rhs.keyblocGrntYr))))&&((this.cmtAmt == rhs.cmtAmt)||((this.cmtAmt!= null)&&this.cmtAmt.equals(rhs.cmtAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))));
    }

}
