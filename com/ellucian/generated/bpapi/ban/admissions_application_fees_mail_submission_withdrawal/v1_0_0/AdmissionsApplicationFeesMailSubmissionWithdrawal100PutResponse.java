
package com.ellucian.generated.bpapi.ban.admissions_application_fees_mail_submission_withdrawal.v1_0_0;

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
    "reqDocInd",
    "applDate",
    "stvapdcDesc",
    "termCodeEntryDesc",
    "maintInd",
    "sbgiCode",
    "feeDate",
    "apstCode",
    "sessCode",
    "waivDesc",
    "recrCode",
    "wrsnCode",
    "termCodeEntry",
    "stvadmtDesc",
    "stvresdDesc",
    "webAmount",
    "stvintvDesc",
    "stvsessDesc",
    "resdCode",
    "sarappdApdcCode",
    "edlvDesc",
    "intvCode",
    "waivCode",
    "feeInd",
    "rtypCode",
    "changeFeeInd",
    "tbbdetcAmt",
    "egolDesc",
    "edlvCode",
    "webReceiptNumber",
    "stvrecrDesc",
    "rateCode",
    "decMaintIndDesc",
    "apstDate",
    "admtCode",
    "stvrtypDesc",
    "stvstypDesc",
    "stvsbgiDesc",
    "tbbdetcDesc",
    "statMaintIndDesc",
    "fullPartInd",
    "webTransNo",
    "siteCode",
    "applNo",
    "stvsiteDesc",
    "detailCode",
    "stvapstDesc",
    "sarappdApdcDate",
    "stvwrsnDesc",
    "stvrateDesc",
    "applPreference",
    "egolCode",
    "stypCode",
    "webAcctMiscInd",
    "sarappdMaintInd"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse {

    @JsonProperty("reqDocInd")
    private String reqDocInd;
    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * 
     */
    @JsonProperty("applDate")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_DATE")
    private Date applDate;
    @JsonProperty("stvapdcDesc")
    private String stvapdcDesc;
    @JsonProperty("termCodeEntryDesc")
    private String termCodeEntryDesc;
    /**
     * Maintained By
     * <p>
     * Lineage reference object : SARADAP_MAINT_IND
     * 
     */
    @JsonProperty("maintInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_MAINT_IND")
    private String maintInd;
    /**
     * Institution Attended
     * <p>
     * Lineage reference object : SARADAP_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String sbgiCode;
    /**
     * Application Fee Date
     * <p>
     * Lineage reference object : SARADAP_FEE_DATE
     * 
     */
    @JsonProperty("feeDate")
    @JsonPropertyDescription("Lineage reference object : SARADAP_FEE_DATE")
    private Date feeDate;
    /**
     * Application Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("apstCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst")
    private String apstCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    @JsonProperty("waivDesc")
    private String waivDesc;
    /**
     * Recruiter
     * <p>
     * Lineage reference object : SARADAP_RECR_CODE, Lookup lineage reference object : stvrecr
     * 
     */
    @JsonProperty("recrCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RECR_CODE, Lookup lineage reference object : stvrecr")
    private String recrCode;
    /**
     * Withdrawal Reason
     * <p>
     * Lineage reference object : SARADAP_WRSN_CODE, Lookup lineage reference object : stvwrsn
     * 
     */
    @JsonProperty("wrsnCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_WRSN_CODE, Lookup lineage reference object : stvwrsn")
    private String wrsnCode;
    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEntry")
    @JsonPropertyDescription("Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm")
    private String termCodeEntry;
    @JsonProperty("stvadmtDesc")
    private String stvadmtDesc;
    @JsonProperty("stvresdDesc")
    private String stvresdDesc;
    /**
     * Amount
     * <p>
     * Lineage reference object : SARADAP_WEB_AMOUNT
     * 
     */
    @JsonProperty("webAmount")
    @JsonPropertyDescription("Lineage reference object : SARADAP_WEB_AMOUNT")
    private Double webAmount;
    @JsonProperty("stvintvDesc")
    private String stvintvDesc;
    @JsonProperty("stvsessDesc")
    private String stvsessDesc;
    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    /**
     * app decision enUS
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapdc")
    private String sarappdApdcCode;
    @JsonProperty("edlvDesc")
    private String edlvDesc;
    /**
     * Interview
     * <p>
     * Lineage reference object : SARADAP_INTV_CODE, Lookup lineage reference object : stvintv
     * 
     */
    @JsonProperty("intvCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_INTV_CODE, Lookup lineage reference object : stvintv")
    private String intvCode;
    /**
     * Application Fee Waiver
     * <p>
     * Lineage reference object : SARADAP_WAIV_CODE, Lookup lineage reference object : stvwaiv
     * 
     */
    @JsonProperty("waivCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_WAIV_CODE, Lookup lineage reference object : stvwaiv")
    private String waivCode;
    /**
     * Last Application Fee
     * <p>
     * Lineage reference object : SARADAP_FEE_IND
     * 
     */
    @JsonProperty("feeInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_FEE_IND")
    private String feeInd;
    /**
     * Recruit Type
     * <p>
     * Lineage reference object : SARADAP_RTYP_CODE, Lookup lineage reference object : stvrtyp
     * 
     */
    @JsonProperty("rtypCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RTYP_CODE, Lookup lineage reference object : stvrtyp")
    private String rtypCode;
    /**
     * Application Fee
     * <p>
     * 
     * 
     */
    @JsonProperty("changeFeeInd")
    private String changeFeeInd;
    /**
     * Application Fee Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcAmt")
    private Double tbbdetcAmt;
    @JsonProperty("egolDesc")
    private String egolDesc;
    /**
     * Educational Level
     * <p>
     * Lineage reference object : SARADAP_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String edlvCode;
    /**
     * Receipt Number
     * <p>
     * Lineage reference object : SARADAP_WEB_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("webReceiptNumber")
    @JsonPropertyDescription("Lineage reference object : SARADAP_WEB_RECEIPT_NUMBER")
    private Double webReceiptNumber;
    @JsonProperty("stvrecrDesc")
    private String stvrecrDesc;
    /**
     * Application Fee Rate
     * <p>
     * Lineage reference object : SARADAP_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    @JsonProperty("decMaintIndDesc")
    private String decMaintIndDesc;
    /**
     * Application Status Date
     * <p>
     * Lineage reference object : SARADAP_APST_DATE
     * 
     */
    @JsonProperty("apstDate")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APST_DATE")
    private Date apstDate;
    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String admtCode;
    @JsonProperty("stvrtypDesc")
    private String stvrtypDesc;
    @JsonProperty("stvstypDesc")
    private String stvstypDesc;
    @JsonProperty("stvsbgiDesc")
    private String stvsbgiDesc;
    @JsonProperty("tbbdetcDesc")
    private String tbbdetcDesc;
    @JsonProperty("statMaintIndDesc")
    private String statMaintIndDesc;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_FULL_PART_IND")
    private String fullPartInd;
    /**
     * Transaction Number
     * <p>
     * Lineage reference object : SARADAP_WEB_TRANS_NO
     * 
     */
    @JsonProperty("webTransNo")
    @JsonPropertyDescription("Lineage reference object : SARADAP_WEB_TRANS_NO")
    private Double webTransNo;
    /**
     * Site
     * <p>
     * Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite")
    private String siteCode;
    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_NO")
    private Double applNo;
    @JsonProperty("stvsiteDesc")
    private String stvsiteDesc;
    /**
     * Application Fee Detail
     * <p>
     * Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lookup lineage reference object : tbbdetc")
    private String detailCode;
    @JsonProperty("stvapstDesc")
    private String stvapstDesc;
    /**
     * Application Decision Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sarappdApdcDate")
    private Date sarappdApdcDate;
    @JsonProperty("stvwrsnDesc")
    private String stvwrsnDesc;
    @JsonProperty("stvrateDesc")
    private String stvrateDesc;
    /**
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("applPreference")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_PREFERENCE")
    private Double applPreference;
    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SARADAP_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String egolCode;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Lineage reference object : SARADAP_WEB_ACCT_MISC_IND
     * 
     */
    @JsonProperty("webAcctMiscInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_WEB_ACCT_MISC_IND")
    private String webAcctMiscInd;
    /**
     * Maintained By
     * <p>
     * 
     * 
     */
    @JsonProperty("sarappdMaintInd")
    private String sarappdMaintInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reqDocInd")
    public String getReqDocInd() {
        return reqDocInd;
    }

    @JsonProperty("reqDocInd")
    public void setReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
        return this;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * 
     */
    @JsonProperty("applDate")
    public Date getApplDate() {
        return applDate;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * 
     */
    @JsonProperty("applDate")
    public void setApplDate(Date applDate) {
        this.applDate = applDate;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withApplDate(Date applDate) {
        this.applDate = applDate;
        return this;
    }

    @JsonProperty("stvapdcDesc")
    public String getStvapdcDesc() {
        return stvapdcDesc;
    }

    @JsonProperty("stvapdcDesc")
    public void setStvapdcDesc(String stvapdcDesc) {
        this.stvapdcDesc = stvapdcDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvapdcDesc(String stvapdcDesc) {
        this.stvapdcDesc = stvapdcDesc;
        return this;
    }

    @JsonProperty("termCodeEntryDesc")
    public String getTermCodeEntryDesc() {
        return termCodeEntryDesc;
    }

    @JsonProperty("termCodeEntryDesc")
    public void setTermCodeEntryDesc(String termCodeEntryDesc) {
        this.termCodeEntryDesc = termCodeEntryDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withTermCodeEntryDesc(String termCodeEntryDesc) {
        this.termCodeEntryDesc = termCodeEntryDesc;
        return this;
    }

    /**
     * Maintained By
     * <p>
     * Lineage reference object : SARADAP_MAINT_IND
     * 
     */
    @JsonProperty("maintInd")
    public String getMaintInd() {
        return maintInd;
    }

    /**
     * Maintained By
     * <p>
     * Lineage reference object : SARADAP_MAINT_IND
     * 
     */
    @JsonProperty("maintInd")
    public void setMaintInd(String maintInd) {
        this.maintInd = maintInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withMaintInd(String maintInd) {
        this.maintInd = maintInd;
        return this;
    }

    /**
     * Institution Attended
     * <p>
     * Lineage reference object : SARADAP_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Institution Attended
     * <p>
     * Lineage reference object : SARADAP_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Application Fee Date
     * <p>
     * Lineage reference object : SARADAP_FEE_DATE
     * 
     */
    @JsonProperty("feeDate")
    public Date getFeeDate() {
        return feeDate;
    }

    /**
     * Application Fee Date
     * <p>
     * Lineage reference object : SARADAP_FEE_DATE
     * 
     */
    @JsonProperty("feeDate")
    public void setFeeDate(Date feeDate) {
        this.feeDate = feeDate;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withFeeDate(Date feeDate) {
        this.feeDate = feeDate;
        return this;
    }

    /**
     * Application Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("apstCode")
    public String getApstCode() {
        return apstCode;
    }

    /**
     * Application Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("apstCode")
    public void setApstCode(String apstCode) {
        this.apstCode = apstCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withApstCode(String apstCode) {
        this.apstCode = apstCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    @JsonProperty("waivDesc")
    public String getWaivDesc() {
        return waivDesc;
    }

    @JsonProperty("waivDesc")
    public void setWaivDesc(String waivDesc) {
        this.waivDesc = waivDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withWaivDesc(String waivDesc) {
        this.waivDesc = waivDesc;
        return this;
    }

    /**
     * Recruiter
     * <p>
     * Lineage reference object : SARADAP_RECR_CODE, Lookup lineage reference object : stvrecr
     * 
     */
    @JsonProperty("recrCode")
    public String getRecrCode() {
        return recrCode;
    }

    /**
     * Recruiter
     * <p>
     * Lineage reference object : SARADAP_RECR_CODE, Lookup lineage reference object : stvrecr
     * 
     */
    @JsonProperty("recrCode")
    public void setRecrCode(String recrCode) {
        this.recrCode = recrCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withRecrCode(String recrCode) {
        this.recrCode = recrCode;
        return this;
    }

    /**
     * Withdrawal Reason
     * <p>
     * Lineage reference object : SARADAP_WRSN_CODE, Lookup lineage reference object : stvwrsn
     * 
     */
    @JsonProperty("wrsnCode")
    public String getWrsnCode() {
        return wrsnCode;
    }

    /**
     * Withdrawal Reason
     * <p>
     * Lineage reference object : SARADAP_WRSN_CODE, Lookup lineage reference object : stvwrsn
     * 
     */
    @JsonProperty("wrsnCode")
    public void setWrsnCode(String wrsnCode) {
        this.wrsnCode = wrsnCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withWrsnCode(String wrsnCode) {
        this.wrsnCode = wrsnCode;
        return this;
    }

    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEntry")
    public String getTermCodeEntry() {
        return termCodeEntry;
    }

    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEntry")
    public void setTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
        return this;
    }

    @JsonProperty("stvadmtDesc")
    public String getStvadmtDesc() {
        return stvadmtDesc;
    }

    @JsonProperty("stvadmtDesc")
    public void setStvadmtDesc(String stvadmtDesc) {
        this.stvadmtDesc = stvadmtDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvadmtDesc(String stvadmtDesc) {
        this.stvadmtDesc = stvadmtDesc;
        return this;
    }

    @JsonProperty("stvresdDesc")
    public String getStvresdDesc() {
        return stvresdDesc;
    }

    @JsonProperty("stvresdDesc")
    public void setStvresdDesc(String stvresdDesc) {
        this.stvresdDesc = stvresdDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvresdDesc(String stvresdDesc) {
        this.stvresdDesc = stvresdDesc;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SARADAP_WEB_AMOUNT
     * 
     */
    @JsonProperty("webAmount")
    public Double getWebAmount() {
        return webAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SARADAP_WEB_AMOUNT
     * 
     */
    @JsonProperty("webAmount")
    public void setWebAmount(Double webAmount) {
        this.webAmount = webAmount;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withWebAmount(Double webAmount) {
        this.webAmount = webAmount;
        return this;
    }

    @JsonProperty("stvintvDesc")
    public String getStvintvDesc() {
        return stvintvDesc;
    }

    @JsonProperty("stvintvDesc")
    public void setStvintvDesc(String stvintvDesc) {
        this.stvintvDesc = stvintvDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvintvDesc(String stvintvDesc) {
        this.stvintvDesc = stvintvDesc;
        return this;
    }

    @JsonProperty("stvsessDesc")
    public String getStvsessDesc() {
        return stvsessDesc;
    }

    @JsonProperty("stvsessDesc")
    public void setStvsessDesc(String stvsessDesc) {
        this.stvsessDesc = stvsessDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvsessDesc(String stvsessDesc) {
        this.stvsessDesc = stvsessDesc;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * app decision enUS
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    public String getSarappdApdcCode() {
        return sarappdApdcCode;
    }

    /**
     * app decision enUS
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    public void setSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    @JsonProperty("edlvDesc")
    public String getEdlvDesc() {
        return edlvDesc;
    }

    @JsonProperty("edlvDesc")
    public void setEdlvDesc(String edlvDesc) {
        this.edlvDesc = edlvDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withEdlvDesc(String edlvDesc) {
        this.edlvDesc = edlvDesc;
        return this;
    }

    /**
     * Interview
     * <p>
     * Lineage reference object : SARADAP_INTV_CODE, Lookup lineage reference object : stvintv
     * 
     */
    @JsonProperty("intvCode")
    public String getIntvCode() {
        return intvCode;
    }

    /**
     * Interview
     * <p>
     * Lineage reference object : SARADAP_INTV_CODE, Lookup lineage reference object : stvintv
     * 
     */
    @JsonProperty("intvCode")
    public void setIntvCode(String intvCode) {
        this.intvCode = intvCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withIntvCode(String intvCode) {
        this.intvCode = intvCode;
        return this;
    }

    /**
     * Application Fee Waiver
     * <p>
     * Lineage reference object : SARADAP_WAIV_CODE, Lookup lineage reference object : stvwaiv
     * 
     */
    @JsonProperty("waivCode")
    public String getWaivCode() {
        return waivCode;
    }

    /**
     * Application Fee Waiver
     * <p>
     * Lineage reference object : SARADAP_WAIV_CODE, Lookup lineage reference object : stvwaiv
     * 
     */
    @JsonProperty("waivCode")
    public void setWaivCode(String waivCode) {
        this.waivCode = waivCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withWaivCode(String waivCode) {
        this.waivCode = waivCode;
        return this;
    }

    /**
     * Last Application Fee
     * <p>
     * Lineage reference object : SARADAP_FEE_IND
     * 
     */
    @JsonProperty("feeInd")
    public String getFeeInd() {
        return feeInd;
    }

    /**
     * Last Application Fee
     * <p>
     * Lineage reference object : SARADAP_FEE_IND
     * 
     */
    @JsonProperty("feeInd")
    public void setFeeInd(String feeInd) {
        this.feeInd = feeInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withFeeInd(String feeInd) {
        this.feeInd = feeInd;
        return this;
    }

    /**
     * Recruit Type
     * <p>
     * Lineage reference object : SARADAP_RTYP_CODE, Lookup lineage reference object : stvrtyp
     * 
     */
    @JsonProperty("rtypCode")
    public String getRtypCode() {
        return rtypCode;
    }

    /**
     * Recruit Type
     * <p>
     * Lineage reference object : SARADAP_RTYP_CODE, Lookup lineage reference object : stvrtyp
     * 
     */
    @JsonProperty("rtypCode")
    public void setRtypCode(String rtypCode) {
        this.rtypCode = rtypCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withRtypCode(String rtypCode) {
        this.rtypCode = rtypCode;
        return this;
    }

    /**
     * Application Fee
     * <p>
     * 
     * 
     */
    @JsonProperty("changeFeeInd")
    public String getChangeFeeInd() {
        return changeFeeInd;
    }

    /**
     * Application Fee
     * <p>
     * 
     * 
     */
    @JsonProperty("changeFeeInd")
    public void setChangeFeeInd(String changeFeeInd) {
        this.changeFeeInd = changeFeeInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withChangeFeeInd(String changeFeeInd) {
        this.changeFeeInd = changeFeeInd;
        return this;
    }

    /**
     * Application Fee Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcAmt")
    public Double getTbbdetcAmt() {
        return tbbdetcAmt;
    }

    /**
     * Application Fee Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcAmt")
    public void setTbbdetcAmt(Double tbbdetcAmt) {
        this.tbbdetcAmt = tbbdetcAmt;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withTbbdetcAmt(Double tbbdetcAmt) {
        this.tbbdetcAmt = tbbdetcAmt;
        return this;
    }

    @JsonProperty("egolDesc")
    public String getEgolDesc() {
        return egolDesc;
    }

    @JsonProperty("egolDesc")
    public void setEgolDesc(String egolDesc) {
        this.egolDesc = egolDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withEgolDesc(String egolDesc) {
        this.egolDesc = egolDesc;
        return this;
    }

    /**
     * Educational Level
     * <p>
     * Lineage reference object : SARADAP_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public String getEdlvCode() {
        return edlvCode;
    }

    /**
     * Educational Level
     * <p>
     * Lineage reference object : SARADAP_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public void setEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
        return this;
    }

    /**
     * Receipt Number
     * <p>
     * Lineage reference object : SARADAP_WEB_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("webReceiptNumber")
    public Double getWebReceiptNumber() {
        return webReceiptNumber;
    }

    /**
     * Receipt Number
     * <p>
     * Lineage reference object : SARADAP_WEB_RECEIPT_NUMBER
     * 
     */
    @JsonProperty("webReceiptNumber")
    public void setWebReceiptNumber(Double webReceiptNumber) {
        this.webReceiptNumber = webReceiptNumber;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withWebReceiptNumber(Double webReceiptNumber) {
        this.webReceiptNumber = webReceiptNumber;
        return this;
    }

    @JsonProperty("stvrecrDesc")
    public String getStvrecrDesc() {
        return stvrecrDesc;
    }

    @JsonProperty("stvrecrDesc")
    public void setStvrecrDesc(String stvrecrDesc) {
        this.stvrecrDesc = stvrecrDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvrecrDesc(String stvrecrDesc) {
        this.stvrecrDesc = stvrecrDesc;
        return this;
    }

    /**
     * Application Fee Rate
     * <p>
     * Lineage reference object : SARADAP_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Application Fee Rate
     * <p>
     * Lineage reference object : SARADAP_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    @JsonProperty("decMaintIndDesc")
    public String getDecMaintIndDesc() {
        return decMaintIndDesc;
    }

    @JsonProperty("decMaintIndDesc")
    public void setDecMaintIndDesc(String decMaintIndDesc) {
        this.decMaintIndDesc = decMaintIndDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withDecMaintIndDesc(String decMaintIndDesc) {
        this.decMaintIndDesc = decMaintIndDesc;
        return this;
    }

    /**
     * Application Status Date
     * <p>
     * Lineage reference object : SARADAP_APST_DATE
     * 
     */
    @JsonProperty("apstDate")
    public Date getApstDate() {
        return apstDate;
    }

    /**
     * Application Status Date
     * <p>
     * Lineage reference object : SARADAP_APST_DATE
     * 
     */
    @JsonProperty("apstDate")
    public void setApstDate(Date apstDate) {
        this.apstDate = apstDate;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withApstDate(Date apstDate) {
        this.apstDate = apstDate;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    public String getAdmtCode() {
        return admtCode;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    public void setAdmtCode(String admtCode) {
        this.admtCode = admtCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    @JsonProperty("stvrtypDesc")
    public String getStvrtypDesc() {
        return stvrtypDesc;
    }

    @JsonProperty("stvrtypDesc")
    public void setStvrtypDesc(String stvrtypDesc) {
        this.stvrtypDesc = stvrtypDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvrtypDesc(String stvrtypDesc) {
        this.stvrtypDesc = stvrtypDesc;
        return this;
    }

    @JsonProperty("stvstypDesc")
    public String getStvstypDesc() {
        return stvstypDesc;
    }

    @JsonProperty("stvstypDesc")
    public void setStvstypDesc(String stvstypDesc) {
        this.stvstypDesc = stvstypDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvstypDesc(String stvstypDesc) {
        this.stvstypDesc = stvstypDesc;
        return this;
    }

    @JsonProperty("stvsbgiDesc")
    public String getStvsbgiDesc() {
        return stvsbgiDesc;
    }

    @JsonProperty("stvsbgiDesc")
    public void setStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
        return this;
    }

    @JsonProperty("tbbdetcDesc")
    public String getTbbdetcDesc() {
        return tbbdetcDesc;
    }

    @JsonProperty("tbbdetcDesc")
    public void setTbbdetcDesc(String tbbdetcDesc) {
        this.tbbdetcDesc = tbbdetcDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withTbbdetcDesc(String tbbdetcDesc) {
        this.tbbdetcDesc = tbbdetcDesc;
        return this;
    }

    @JsonProperty("statMaintIndDesc")
    public String getStatMaintIndDesc() {
        return statMaintIndDesc;
    }

    @JsonProperty("statMaintIndDesc")
    public void setStatMaintIndDesc(String statMaintIndDesc) {
        this.statMaintIndDesc = statMaintIndDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStatMaintIndDesc(String statMaintIndDesc) {
        this.statMaintIndDesc = statMaintIndDesc;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : SARADAP_WEB_TRANS_NO
     * 
     */
    @JsonProperty("webTransNo")
    public Double getWebTransNo() {
        return webTransNo;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : SARADAP_WEB_TRANS_NO
     * 
     */
    @JsonProperty("webTransNo")
    public void setWebTransNo(Double webTransNo) {
        this.webTransNo = webTransNo;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withWebTransNo(Double webTransNo) {
        this.webTransNo = webTransNo;
        return this;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    public Double getApplNo() {
        return applNo;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    public void setApplNo(Double applNo) {
        this.applNo = applNo;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withApplNo(Double applNo) {
        this.applNo = applNo;
        return this;
    }

    @JsonProperty("stvsiteDesc")
    public String getStvsiteDesc() {
        return stvsiteDesc;
    }

    @JsonProperty("stvsiteDesc")
    public void setStvsiteDesc(String stvsiteDesc) {
        this.stvsiteDesc = stvsiteDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvsiteDesc(String stvsiteDesc) {
        this.stvsiteDesc = stvsiteDesc;
        return this;
    }

    /**
     * Application Fee Detail
     * <p>
     * Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Application Fee Detail
     * <p>
     * Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    @JsonProperty("stvapstDesc")
    public String getStvapstDesc() {
        return stvapstDesc;
    }

    @JsonProperty("stvapstDesc")
    public void setStvapstDesc(String stvapstDesc) {
        this.stvapstDesc = stvapstDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvapstDesc(String stvapstDesc) {
        this.stvapstDesc = stvapstDesc;
        return this;
    }

    /**
     * Application Decision Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sarappdApdcDate")
    public Date getSarappdApdcDate() {
        return sarappdApdcDate;
    }

    /**
     * Application Decision Date
     * <p>
     * 
     * 
     */
    @JsonProperty("sarappdApdcDate")
    public void setSarappdApdcDate(Date sarappdApdcDate) {
        this.sarappdApdcDate = sarappdApdcDate;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withSarappdApdcDate(Date sarappdApdcDate) {
        this.sarappdApdcDate = sarappdApdcDate;
        return this;
    }

    @JsonProperty("stvwrsnDesc")
    public String getStvwrsnDesc() {
        return stvwrsnDesc;
    }

    @JsonProperty("stvwrsnDesc")
    public void setStvwrsnDesc(String stvwrsnDesc) {
        this.stvwrsnDesc = stvwrsnDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvwrsnDesc(String stvwrsnDesc) {
        this.stvwrsnDesc = stvwrsnDesc;
        return this;
    }

    @JsonProperty("stvrateDesc")
    public String getStvrateDesc() {
        return stvrateDesc;
    }

    @JsonProperty("stvrateDesc")
    public void setStvrateDesc(String stvrateDesc) {
        this.stvrateDesc = stvrateDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStvrateDesc(String stvrateDesc) {
        this.stvrateDesc = stvrateDesc;
        return this;
    }

    /**
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("applPreference")
    public Double getApplPreference() {
        return applPreference;
    }

    /**
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("applPreference")
    public void setApplPreference(Double applPreference) {
        this.applPreference = applPreference;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withApplPreference(Double applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SARADAP_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public String getEgolCode() {
        return egolCode;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SARADAP_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public void setEgolCode(String egolCode) {
        this.egolCode = egolCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withEgolCode(String egolCode) {
        this.egolCode = egolCode;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Lineage reference object : SARADAP_WEB_ACCT_MISC_IND
     * 
     */
    @JsonProperty("webAcctMiscInd")
    public String getWebAcctMiscInd() {
        return webAcctMiscInd;
    }

    /**
     * Lineage reference object : SARADAP_WEB_ACCT_MISC_IND
     * 
     */
    @JsonProperty("webAcctMiscInd")
    public void setWebAcctMiscInd(String webAcctMiscInd) {
        this.webAcctMiscInd = webAcctMiscInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withWebAcctMiscInd(String webAcctMiscInd) {
        this.webAcctMiscInd = webAcctMiscInd;
        return this;
    }

    /**
     * Maintained By
     * <p>
     * 
     * 
     */
    @JsonProperty("sarappdMaintInd")
    public String getSarappdMaintInd() {
        return sarappdMaintInd;
    }

    /**
     * Maintained By
     * <p>
     * 
     * 
     */
    @JsonProperty("sarappdMaintInd")
    public void setSarappdMaintInd(String sarappdMaintInd) {
        this.sarappdMaintInd = sarappdMaintInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withSarappdMaintInd(String sarappdMaintInd) {
        this.sarappdMaintInd = sarappdMaintInd;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("stvapdcDesc");
        sb.append('=');
        sb.append(((this.stvapdcDesc == null)?"<null>":this.stvapdcDesc));
        sb.append(',');
        sb.append("termCodeEntryDesc");
        sb.append('=');
        sb.append(((this.termCodeEntryDesc == null)?"<null>":this.termCodeEntryDesc));
        sb.append(',');
        sb.append("maintInd");
        sb.append('=');
        sb.append(((this.maintInd == null)?"<null>":this.maintInd));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("feeDate");
        sb.append('=');
        sb.append(((this.feeDate == null)?"<null>":this.feeDate));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("waivDesc");
        sb.append('=');
        sb.append(((this.waivDesc == null)?"<null>":this.waivDesc));
        sb.append(',');
        sb.append("recrCode");
        sb.append('=');
        sb.append(((this.recrCode == null)?"<null>":this.recrCode));
        sb.append(',');
        sb.append("wrsnCode");
        sb.append('=');
        sb.append(((this.wrsnCode == null)?"<null>":this.wrsnCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("stvadmtDesc");
        sb.append('=');
        sb.append(((this.stvadmtDesc == null)?"<null>":this.stvadmtDesc));
        sb.append(',');
        sb.append("stvresdDesc");
        sb.append('=');
        sb.append(((this.stvresdDesc == null)?"<null>":this.stvresdDesc));
        sb.append(',');
        sb.append("webAmount");
        sb.append('=');
        sb.append(((this.webAmount == null)?"<null>":this.webAmount));
        sb.append(',');
        sb.append("stvintvDesc");
        sb.append('=');
        sb.append(((this.stvintvDesc == null)?"<null>":this.stvintvDesc));
        sb.append(',');
        sb.append("stvsessDesc");
        sb.append('=');
        sb.append(((this.stvsessDesc == null)?"<null>":this.stvsessDesc));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("sarappdApdcCode");
        sb.append('=');
        sb.append(((this.sarappdApdcCode == null)?"<null>":this.sarappdApdcCode));
        sb.append(',');
        sb.append("edlvDesc");
        sb.append('=');
        sb.append(((this.edlvDesc == null)?"<null>":this.edlvDesc));
        sb.append(',');
        sb.append("intvCode");
        sb.append('=');
        sb.append(((this.intvCode == null)?"<null>":this.intvCode));
        sb.append(',');
        sb.append("waivCode");
        sb.append('=');
        sb.append(((this.waivCode == null)?"<null>":this.waivCode));
        sb.append(',');
        sb.append("feeInd");
        sb.append('=');
        sb.append(((this.feeInd == null)?"<null>":this.feeInd));
        sb.append(',');
        sb.append("rtypCode");
        sb.append('=');
        sb.append(((this.rtypCode == null)?"<null>":this.rtypCode));
        sb.append(',');
        sb.append("changeFeeInd");
        sb.append('=');
        sb.append(((this.changeFeeInd == null)?"<null>":this.changeFeeInd));
        sb.append(',');
        sb.append("tbbdetcAmt");
        sb.append('=');
        sb.append(((this.tbbdetcAmt == null)?"<null>":this.tbbdetcAmt));
        sb.append(',');
        sb.append("egolDesc");
        sb.append('=');
        sb.append(((this.egolDesc == null)?"<null>":this.egolDesc));
        sb.append(',');
        sb.append("edlvCode");
        sb.append('=');
        sb.append(((this.edlvCode == null)?"<null>":this.edlvCode));
        sb.append(',');
        sb.append("webReceiptNumber");
        sb.append('=');
        sb.append(((this.webReceiptNumber == null)?"<null>":this.webReceiptNumber));
        sb.append(',');
        sb.append("stvrecrDesc");
        sb.append('=');
        sb.append(((this.stvrecrDesc == null)?"<null>":this.stvrecrDesc));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("decMaintIndDesc");
        sb.append('=');
        sb.append(((this.decMaintIndDesc == null)?"<null>":this.decMaintIndDesc));
        sb.append(',');
        sb.append("apstDate");
        sb.append('=');
        sb.append(((this.apstDate == null)?"<null>":this.apstDate));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("stvrtypDesc");
        sb.append('=');
        sb.append(((this.stvrtypDesc == null)?"<null>":this.stvrtypDesc));
        sb.append(',');
        sb.append("stvstypDesc");
        sb.append('=');
        sb.append(((this.stvstypDesc == null)?"<null>":this.stvstypDesc));
        sb.append(',');
        sb.append("stvsbgiDesc");
        sb.append('=');
        sb.append(((this.stvsbgiDesc == null)?"<null>":this.stvsbgiDesc));
        sb.append(',');
        sb.append("tbbdetcDesc");
        sb.append('=');
        sb.append(((this.tbbdetcDesc == null)?"<null>":this.tbbdetcDesc));
        sb.append(',');
        sb.append("statMaintIndDesc");
        sb.append('=');
        sb.append(((this.statMaintIndDesc == null)?"<null>":this.statMaintIndDesc));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("webTransNo");
        sb.append('=');
        sb.append(((this.webTransNo == null)?"<null>":this.webTransNo));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("stvsiteDesc");
        sb.append('=');
        sb.append(((this.stvsiteDesc == null)?"<null>":this.stvsiteDesc));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("stvapstDesc");
        sb.append('=');
        sb.append(((this.stvapstDesc == null)?"<null>":this.stvapstDesc));
        sb.append(',');
        sb.append("sarappdApdcDate");
        sb.append('=');
        sb.append(((this.sarappdApdcDate == null)?"<null>":this.sarappdApdcDate));
        sb.append(',');
        sb.append("stvwrsnDesc");
        sb.append('=');
        sb.append(((this.stvwrsnDesc == null)?"<null>":this.stvwrsnDesc));
        sb.append(',');
        sb.append("stvrateDesc");
        sb.append('=');
        sb.append(((this.stvrateDesc == null)?"<null>":this.stvrateDesc));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("webAcctMiscInd");
        sb.append('=');
        sb.append(((this.webAcctMiscInd == null)?"<null>":this.webAcctMiscInd));
        sb.append(',');
        sb.append("sarappdMaintInd");
        sb.append('=');
        sb.append(((this.sarappdMaintInd == null)?"<null>":this.sarappdMaintInd));
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
        result = ((result* 31)+((this.reqDocInd == null)? 0 :this.reqDocInd.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.stvapdcDesc == null)? 0 :this.stvapdcDesc.hashCode()));
        result = ((result* 31)+((this.termCodeEntryDesc == null)? 0 :this.termCodeEntryDesc.hashCode()));
        result = ((result* 31)+((this.maintInd == null)? 0 :this.maintInd.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.feeDate == null)? 0 :this.feeDate.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.waivDesc == null)? 0 :this.waivDesc.hashCode()));
        result = ((result* 31)+((this.recrCode == null)? 0 :this.recrCode.hashCode()));
        result = ((result* 31)+((this.wrsnCode == null)? 0 :this.wrsnCode.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.stvadmtDesc == null)? 0 :this.stvadmtDesc.hashCode()));
        result = ((result* 31)+((this.stvresdDesc == null)? 0 :this.stvresdDesc.hashCode()));
        result = ((result* 31)+((this.webAmount == null)? 0 :this.webAmount.hashCode()));
        result = ((result* 31)+((this.stvintvDesc == null)? 0 :this.stvintvDesc.hashCode()));
        result = ((result* 31)+((this.stvsessDesc == null)? 0 :this.stvsessDesc.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.edlvDesc == null)? 0 :this.edlvDesc.hashCode()));
        result = ((result* 31)+((this.intvCode == null)? 0 :this.intvCode.hashCode()));
        result = ((result* 31)+((this.waivCode == null)? 0 :this.waivCode.hashCode()));
        result = ((result* 31)+((this.feeInd == null)? 0 :this.feeInd.hashCode()));
        result = ((result* 31)+((this.rtypCode == null)? 0 :this.rtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.changeFeeInd == null)? 0 :this.changeFeeInd.hashCode()));
        result = ((result* 31)+((this.tbbdetcAmt == null)? 0 :this.tbbdetcAmt.hashCode()));
        result = ((result* 31)+((this.egolDesc == null)? 0 :this.egolDesc.hashCode()));
        result = ((result* 31)+((this.edlvCode == null)? 0 :this.edlvCode.hashCode()));
        result = ((result* 31)+((this.webReceiptNumber == null)? 0 :this.webReceiptNumber.hashCode()));
        result = ((result* 31)+((this.stvrecrDesc == null)? 0 :this.stvrecrDesc.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.decMaintIndDesc == null)? 0 :this.decMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.apstDate == null)? 0 :this.apstDate.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.stvrtypDesc == null)? 0 :this.stvrtypDesc.hashCode()));
        result = ((result* 31)+((this.stvstypDesc == null)? 0 :this.stvstypDesc.hashCode()));
        result = ((result* 31)+((this.stvsbgiDesc == null)? 0 :this.stvsbgiDesc.hashCode()));
        result = ((result* 31)+((this.tbbdetcDesc == null)? 0 :this.tbbdetcDesc.hashCode()));
        result = ((result* 31)+((this.statMaintIndDesc == null)? 0 :this.statMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.webTransNo == null)? 0 :this.webTransNo.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.stvsiteDesc == null)? 0 :this.stvsiteDesc.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.stvapstDesc == null)? 0 :this.stvapstDesc.hashCode()));
        result = ((result* 31)+((this.sarappdApdcDate == null)? 0 :this.sarappdApdcDate.hashCode()));
        result = ((result* 31)+((this.stvwrsnDesc == null)? 0 :this.stvwrsnDesc.hashCode()));
        result = ((result* 31)+((this.stvrateDesc == null)? 0 :this.stvrateDesc.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.webAcctMiscInd == null)? 0 :this.webAcctMiscInd.hashCode()));
        result = ((result* 31)+((this.sarappdMaintInd == null)? 0 :this.sarappdMaintInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse) == false) {
            return false;
        }
        AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse rhs = ((AdmissionsApplicationFeesMailSubmissionWithdrawal100PutResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd)))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.stvapdcDesc == rhs.stvapdcDesc)||((this.stvapdcDesc!= null)&&this.stvapdcDesc.equals(rhs.stvapdcDesc))))&&((this.termCodeEntryDesc == rhs.termCodeEntryDesc)||((this.termCodeEntryDesc!= null)&&this.termCodeEntryDesc.equals(rhs.termCodeEntryDesc))))&&((this.maintInd == rhs.maintInd)||((this.maintInd!= null)&&this.maintInd.equals(rhs.maintInd))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.feeDate == rhs.feeDate)||((this.feeDate!= null)&&this.feeDate.equals(rhs.feeDate))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.waivDesc == rhs.waivDesc)||((this.waivDesc!= null)&&this.waivDesc.equals(rhs.waivDesc))))&&((this.recrCode == rhs.recrCode)||((this.recrCode!= null)&&this.recrCode.equals(rhs.recrCode))))&&((this.wrsnCode == rhs.wrsnCode)||((this.wrsnCode!= null)&&this.wrsnCode.equals(rhs.wrsnCode))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.stvadmtDesc == rhs.stvadmtDesc)||((this.stvadmtDesc!= null)&&this.stvadmtDesc.equals(rhs.stvadmtDesc))))&&((this.stvresdDesc == rhs.stvresdDesc)||((this.stvresdDesc!= null)&&this.stvresdDesc.equals(rhs.stvresdDesc))))&&((this.webAmount == rhs.webAmount)||((this.webAmount!= null)&&this.webAmount.equals(rhs.webAmount))))&&((this.stvintvDesc == rhs.stvintvDesc)||((this.stvintvDesc!= null)&&this.stvintvDesc.equals(rhs.stvintvDesc))))&&((this.stvsessDesc == rhs.stvsessDesc)||((this.stvsessDesc!= null)&&this.stvsessDesc.equals(rhs.stvsessDesc))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.edlvDesc == rhs.edlvDesc)||((this.edlvDesc!= null)&&this.edlvDesc.equals(rhs.edlvDesc))))&&((this.intvCode == rhs.intvCode)||((this.intvCode!= null)&&this.intvCode.equals(rhs.intvCode))))&&((this.waivCode == rhs.waivCode)||((this.waivCode!= null)&&this.waivCode.equals(rhs.waivCode))))&&((this.feeInd == rhs.feeInd)||((this.feeInd!= null)&&this.feeInd.equals(rhs.feeInd))))&&((this.rtypCode == rhs.rtypCode)||((this.rtypCode!= null)&&this.rtypCode.equals(rhs.rtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.changeFeeInd == rhs.changeFeeInd)||((this.changeFeeInd!= null)&&this.changeFeeInd.equals(rhs.changeFeeInd))))&&((this.tbbdetcAmt == rhs.tbbdetcAmt)||((this.tbbdetcAmt!= null)&&this.tbbdetcAmt.equals(rhs.tbbdetcAmt))))&&((this.egolDesc == rhs.egolDesc)||((this.egolDesc!= null)&&this.egolDesc.equals(rhs.egolDesc))))&&((this.edlvCode == rhs.edlvCode)||((this.edlvCode!= null)&&this.edlvCode.equals(rhs.edlvCode))))&&((this.webReceiptNumber == rhs.webReceiptNumber)||((this.webReceiptNumber!= null)&&this.webReceiptNumber.equals(rhs.webReceiptNumber))))&&((this.stvrecrDesc == rhs.stvrecrDesc)||((this.stvrecrDesc!= null)&&this.stvrecrDesc.equals(rhs.stvrecrDesc))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.decMaintIndDesc == rhs.decMaintIndDesc)||((this.decMaintIndDesc!= null)&&this.decMaintIndDesc.equals(rhs.decMaintIndDesc))))&&((this.apstDate == rhs.apstDate)||((this.apstDate!= null)&&this.apstDate.equals(rhs.apstDate))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.stvrtypDesc == rhs.stvrtypDesc)||((this.stvrtypDesc!= null)&&this.stvrtypDesc.equals(rhs.stvrtypDesc))))&&((this.stvstypDesc == rhs.stvstypDesc)||((this.stvstypDesc!= null)&&this.stvstypDesc.equals(rhs.stvstypDesc))))&&((this.stvsbgiDesc == rhs.stvsbgiDesc)||((this.stvsbgiDesc!= null)&&this.stvsbgiDesc.equals(rhs.stvsbgiDesc))))&&((this.tbbdetcDesc == rhs.tbbdetcDesc)||((this.tbbdetcDesc!= null)&&this.tbbdetcDesc.equals(rhs.tbbdetcDesc))))&&((this.statMaintIndDesc == rhs.statMaintIndDesc)||((this.statMaintIndDesc!= null)&&this.statMaintIndDesc.equals(rhs.statMaintIndDesc))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.webTransNo == rhs.webTransNo)||((this.webTransNo!= null)&&this.webTransNo.equals(rhs.webTransNo))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.stvsiteDesc == rhs.stvsiteDesc)||((this.stvsiteDesc!= null)&&this.stvsiteDesc.equals(rhs.stvsiteDesc))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.stvapstDesc == rhs.stvapstDesc)||((this.stvapstDesc!= null)&&this.stvapstDesc.equals(rhs.stvapstDesc))))&&((this.sarappdApdcDate == rhs.sarappdApdcDate)||((this.sarappdApdcDate!= null)&&this.sarappdApdcDate.equals(rhs.sarappdApdcDate))))&&((this.stvwrsnDesc == rhs.stvwrsnDesc)||((this.stvwrsnDesc!= null)&&this.stvwrsnDesc.equals(rhs.stvwrsnDesc))))&&((this.stvrateDesc == rhs.stvrateDesc)||((this.stvrateDesc!= null)&&this.stvrateDesc.equals(rhs.stvrateDesc))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.webAcctMiscInd == rhs.webAcctMiscInd)||((this.webAcctMiscInd!= null)&&this.webAcctMiscInd.equals(rhs.webAcctMiscInd))))&&((this.sarappdMaintInd == rhs.sarappdMaintInd)||((this.sarappdMaintInd!= null)&&this.sarappdMaintInd.equals(rhs.sarappdMaintInd))));
    }

}
