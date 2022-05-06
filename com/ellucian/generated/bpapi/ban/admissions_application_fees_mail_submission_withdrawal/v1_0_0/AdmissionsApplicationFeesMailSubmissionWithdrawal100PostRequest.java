
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
    "criteria.stvadmtDesc",
    "tbbdetcAmt",
    "edlvCode",
    "criteria.termCodeEntryDesc",
    "criteria.decMaintIndDesc",
    "criteria.stvsiteDesc",
    "sbgiCode",
    "criteria.applNo",
    "criteria.stvresdDesc",
    "criteria.sarappdMaintInd",
    "criteria.stvapstDesc",
    "rateCode",
    "criteria.recruiterAppl",
    "feeDate",
    "sessCode",
    "criteria.stvstypDesc",
    "criteria.sarappdApdcDate",
    "criteria.sarappdApdcCode",
    "criteria.reqDocInd",
    "criteria.resdCode",
    "criteria.siteCode",
    "criteria.maintInd",
    "id",
    "recrCode",
    "wrsnCode",
    "criteria.fullPartInd",
    "criteria.admtCode",
    "criteria.stvapdcDesc",
    "kbentryTermCode",
    "criteria.apstCode",
    "initCode",
    "criteria.apstDate",
    "criteria.stypCode",
    "letrCode",
    "criteria.applPreference",
    "detailCode",
    "intvCode",
    "waivCode",
    "criteria.applDate",
    "waitDays",
    "egolCode",
    "rtypCode",
    "criteria.termCodeEntry",
    "changeFeeInd",
    "criteria.statMaintIndDesc"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest {

    @JsonProperty("criteria.stvadmtDesc")
    private String criteriaStvadmtDesc;
    /**
     * Application Fee Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcAmt")
    private Double tbbdetcAmt;
    /**
     * Educational Level
     * <p>
     * Lineage reference object : SARADAP_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String edlvCode;
    @JsonProperty("criteria.termCodeEntryDesc")
    private String criteriaTermCodeEntryDesc;
    @JsonProperty("criteria.decMaintIndDesc")
    private String criteriaDecMaintIndDesc;
    @JsonProperty("criteria.stvsiteDesc")
    private String criteriaStvsiteDesc;
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
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * 
     */
    @JsonProperty("criteria.applNo")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_NO")
    private Double criteriaApplNo;
    @JsonProperty("criteria.stvresdDesc")
    private String criteriaStvresdDesc;
    /**
     * Maintained By
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sarappdMaintInd")
    private String criteriaSarappdMaintInd;
    @JsonProperty("criteria.stvapstDesc")
    private String criteriaStvapstDesc;
    /**
     * Application Fee Rate
     * <p>
     * Lineage reference object : SARADAP_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    @JsonProperty("criteria.recruiterAppl")
    private String criteriaRecruiterAppl;
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
     * Session
     * <p>
     * Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    @JsonProperty("criteria.stvstypDesc")
    private String criteriaStvstypDesc;
    /**
     * Application Decision Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sarappdApdcDate")
    private Date criteriaSarappdApdcDate;
    /**
     * app decision enUS
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("criteria.sarappdApdcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapdc")
    private String criteriaSarappdApdcCode;
    @JsonProperty("criteria.reqDocInd")
    private String criteriaReqDocInd;
    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.resdCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd")
    private String criteriaResdCode;
    /**
     * Site
     * <p>
     * Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("criteria.siteCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite")
    private String criteriaSiteCode;
    /**
     * Maintained By
     * <p>
     * Lineage reference object : SARADAP_MAINT_IND
     * 
     */
    @JsonProperty("criteria.maintInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_MAINT_IND")
    private String criteriaMaintInd;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_FULL_PART_IND")
    private String criteriaFullPartInd;
    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("criteria.admtCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String criteriaAdmtCode;
    @JsonProperty("criteria.stvapdcDesc")
    private String criteriaStvapdcDesc;
    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    @JsonPropertyDescription("Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm")
    private Object kbentryTermCode;
    /**
     * Application Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("criteria.apstCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst")
    private String criteriaApstCode;
    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("initCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit")
    private String initCode;
    /**
     * Application Status Date
     * <p>
     * Lineage reference object : SARADAP_APST_DATE
     * 
     */
    @JsonProperty("criteria.apstDate")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APST_DATE")
    private Date criteriaApstDate;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String criteriaStypCode;
    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("letrCode")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr")
    private String letrCode;
    /**
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("criteria.applPreference")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_PREFERENCE")
    private Double criteriaApplPreference;
    /**
     * Application Fee Detail
     * <p>
     * Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lookup lineage reference object : tbbdetc")
    private String detailCode;
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
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * 
     */
    @JsonProperty("criteria.applDate")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_DATE")
    private Date criteriaApplDate;
    /**
     * Wait Days
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("waitDays")
    @JsonPropertyDescription("Lineage reference object : GURMAIL_WAIT_DAYS")
    private Double waitDays;
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
     * Recruit Type
     * <p>
     * Lineage reference object : SARADAP_RTYP_CODE, Lookup lineage reference object : stvrtyp
     * 
     */
    @JsonProperty("rtypCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RTYP_CODE, Lookup lineage reference object : stvrtyp")
    private String rtypCode;
    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEntry")
    @JsonPropertyDescription("Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeEntry;
    /**
     * Application Fee
     * <p>
     * 
     * 
     */
    @JsonProperty("changeFeeInd")
    private String changeFeeInd;
    @JsonProperty("criteria.statMaintIndDesc")
    private String criteriaStatMaintIndDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("criteria.stvadmtDesc")
    public String getCriteriaStvadmtDesc() {
        return criteriaStvadmtDesc;
    }

    @JsonProperty("criteria.stvadmtDesc")
    public void setCriteriaStvadmtDesc(String criteriaStvadmtDesc) {
        this.criteriaStvadmtDesc = criteriaStvadmtDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaStvadmtDesc(String criteriaStvadmtDesc) {
        this.criteriaStvadmtDesc = criteriaStvadmtDesc;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withTbbdetcAmt(Double tbbdetcAmt) {
        this.tbbdetcAmt = tbbdetcAmt;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
        return this;
    }

    @JsonProperty("criteria.termCodeEntryDesc")
    public String getCriteriaTermCodeEntryDesc() {
        return criteriaTermCodeEntryDesc;
    }

    @JsonProperty("criteria.termCodeEntryDesc")
    public void setCriteriaTermCodeEntryDesc(String criteriaTermCodeEntryDesc) {
        this.criteriaTermCodeEntryDesc = criteriaTermCodeEntryDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaTermCodeEntryDesc(String criteriaTermCodeEntryDesc) {
        this.criteriaTermCodeEntryDesc = criteriaTermCodeEntryDesc;
        return this;
    }

    @JsonProperty("criteria.decMaintIndDesc")
    public String getCriteriaDecMaintIndDesc() {
        return criteriaDecMaintIndDesc;
    }

    @JsonProperty("criteria.decMaintIndDesc")
    public void setCriteriaDecMaintIndDesc(String criteriaDecMaintIndDesc) {
        this.criteriaDecMaintIndDesc = criteriaDecMaintIndDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaDecMaintIndDesc(String criteriaDecMaintIndDesc) {
        this.criteriaDecMaintIndDesc = criteriaDecMaintIndDesc;
        return this;
    }

    @JsonProperty("criteria.stvsiteDesc")
    public String getCriteriaStvsiteDesc() {
        return criteriaStvsiteDesc;
    }

    @JsonProperty("criteria.stvsiteDesc")
    public void setCriteriaStvsiteDesc(String criteriaStvsiteDesc) {
        this.criteriaStvsiteDesc = criteriaStvsiteDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaStvsiteDesc(String criteriaStvsiteDesc) {
        this.criteriaStvsiteDesc = criteriaStvsiteDesc;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * 
     */
    @JsonProperty("criteria.applNo")
    public Double getCriteriaApplNo() {
        return criteriaApplNo;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * 
     */
    @JsonProperty("criteria.applNo")
    public void setCriteriaApplNo(Double criteriaApplNo) {
        this.criteriaApplNo = criteriaApplNo;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaApplNo(Double criteriaApplNo) {
        this.criteriaApplNo = criteriaApplNo;
        return this;
    }

    @JsonProperty("criteria.stvresdDesc")
    public String getCriteriaStvresdDesc() {
        return criteriaStvresdDesc;
    }

    @JsonProperty("criteria.stvresdDesc")
    public void setCriteriaStvresdDesc(String criteriaStvresdDesc) {
        this.criteriaStvresdDesc = criteriaStvresdDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaStvresdDesc(String criteriaStvresdDesc) {
        this.criteriaStvresdDesc = criteriaStvresdDesc;
        return this;
    }

    /**
     * Maintained By
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sarappdMaintInd")
    public String getCriteriaSarappdMaintInd() {
        return criteriaSarappdMaintInd;
    }

    /**
     * Maintained By
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sarappdMaintInd")
    public void setCriteriaSarappdMaintInd(String criteriaSarappdMaintInd) {
        this.criteriaSarappdMaintInd = criteriaSarappdMaintInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaSarappdMaintInd(String criteriaSarappdMaintInd) {
        this.criteriaSarappdMaintInd = criteriaSarappdMaintInd;
        return this;
    }

    @JsonProperty("criteria.stvapstDesc")
    public String getCriteriaStvapstDesc() {
        return criteriaStvapstDesc;
    }

    @JsonProperty("criteria.stvapstDesc")
    public void setCriteriaStvapstDesc(String criteriaStvapstDesc) {
        this.criteriaStvapstDesc = criteriaStvapstDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaStvapstDesc(String criteriaStvapstDesc) {
        this.criteriaStvapstDesc = criteriaStvapstDesc;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    @JsonProperty("criteria.recruiterAppl")
    public String getCriteriaRecruiterAppl() {
        return criteriaRecruiterAppl;
    }

    @JsonProperty("criteria.recruiterAppl")
    public void setCriteriaRecruiterAppl(String criteriaRecruiterAppl) {
        this.criteriaRecruiterAppl = criteriaRecruiterAppl;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaRecruiterAppl(String criteriaRecruiterAppl) {
        this.criteriaRecruiterAppl = criteriaRecruiterAppl;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withFeeDate(Date feeDate) {
        this.feeDate = feeDate;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    @JsonProperty("criteria.stvstypDesc")
    public String getCriteriaStvstypDesc() {
        return criteriaStvstypDesc;
    }

    @JsonProperty("criteria.stvstypDesc")
    public void setCriteriaStvstypDesc(String criteriaStvstypDesc) {
        this.criteriaStvstypDesc = criteriaStvstypDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaStvstypDesc(String criteriaStvstypDesc) {
        this.criteriaStvstypDesc = criteriaStvstypDesc;
        return this;
    }

    /**
     * Application Decision Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sarappdApdcDate")
    public Date getCriteriaSarappdApdcDate() {
        return criteriaSarappdApdcDate;
    }

    /**
     * Application Decision Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sarappdApdcDate")
    public void setCriteriaSarappdApdcDate(Date criteriaSarappdApdcDate) {
        this.criteriaSarappdApdcDate = criteriaSarappdApdcDate;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaSarappdApdcDate(Date criteriaSarappdApdcDate) {
        this.criteriaSarappdApdcDate = criteriaSarappdApdcDate;
        return this;
    }

    /**
     * app decision enUS
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("criteria.sarappdApdcCode")
    public String getCriteriaSarappdApdcCode() {
        return criteriaSarappdApdcCode;
    }

    /**
     * app decision enUS
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("criteria.sarappdApdcCode")
    public void setCriteriaSarappdApdcCode(String criteriaSarappdApdcCode) {
        this.criteriaSarappdApdcCode = criteriaSarappdApdcCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaSarappdApdcCode(String criteriaSarappdApdcCode) {
        this.criteriaSarappdApdcCode = criteriaSarappdApdcCode;
        return this;
    }

    @JsonProperty("criteria.reqDocInd")
    public String getCriteriaReqDocInd() {
        return criteriaReqDocInd;
    }

    @JsonProperty("criteria.reqDocInd")
    public void setCriteriaReqDocInd(String criteriaReqDocInd) {
        this.criteriaReqDocInd = criteriaReqDocInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaReqDocInd(String criteriaReqDocInd) {
        this.criteriaReqDocInd = criteriaReqDocInd;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.resdCode")
    public String getCriteriaResdCode() {
        return criteriaResdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("criteria.resdCode")
    public void setCriteriaResdCode(String criteriaResdCode) {
        this.criteriaResdCode = criteriaResdCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaResdCode(String criteriaResdCode) {
        this.criteriaResdCode = criteriaResdCode;
        return this;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("criteria.siteCode")
    public String getCriteriaSiteCode() {
        return criteriaSiteCode;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("criteria.siteCode")
    public void setCriteriaSiteCode(String criteriaSiteCode) {
        this.criteriaSiteCode = criteriaSiteCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaSiteCode(String criteriaSiteCode) {
        this.criteriaSiteCode = criteriaSiteCode;
        return this;
    }

    /**
     * Maintained By
     * <p>
     * Lineage reference object : SARADAP_MAINT_IND
     * 
     */
    @JsonProperty("criteria.maintInd")
    public String getCriteriaMaintInd() {
        return criteriaMaintInd;
    }

    /**
     * Maintained By
     * <p>
     * Lineage reference object : SARADAP_MAINT_IND
     * 
     */
    @JsonProperty("criteria.maintInd")
    public void setCriteriaMaintInd(String criteriaMaintInd) {
        this.criteriaMaintInd = criteriaMaintInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaMaintInd(String criteriaMaintInd) {
        this.criteriaMaintInd = criteriaMaintInd;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withId(Object id) {
        this.id = id;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withRecrCode(String recrCode) {
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withWrsnCode(String wrsnCode) {
        this.wrsnCode = wrsnCode;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    public String getCriteriaFullPartInd() {
        return criteriaFullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("criteria.fullPartInd")
    public void setCriteriaFullPartInd(String criteriaFullPartInd) {
        this.criteriaFullPartInd = criteriaFullPartInd;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaFullPartInd(String criteriaFullPartInd) {
        this.criteriaFullPartInd = criteriaFullPartInd;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("criteria.admtCode")
    public String getCriteriaAdmtCode() {
        return criteriaAdmtCode;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("criteria.admtCode")
    public void setCriteriaAdmtCode(String criteriaAdmtCode) {
        this.criteriaAdmtCode = criteriaAdmtCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaAdmtCode(String criteriaAdmtCode) {
        this.criteriaAdmtCode = criteriaAdmtCode;
        return this;
    }

    @JsonProperty("criteria.stvapdcDesc")
    public String getCriteriaStvapdcDesc() {
        return criteriaStvapdcDesc;
    }

    @JsonProperty("criteria.stvapdcDesc")
    public void setCriteriaStvapdcDesc(String criteriaStvapdcDesc) {
        this.criteriaStvapdcDesc = criteriaStvapdcDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaStvapdcDesc(String criteriaStvapdcDesc) {
        this.criteriaStvapdcDesc = criteriaStvapdcDesc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public Object getKbentryTermCode() {
        return kbentryTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public void setKbentryTermCode(Object kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withKbentryTermCode(Object kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
        return this;
    }

    /**
     * Application Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("criteria.apstCode")
    public String getCriteriaApstCode() {
        return criteriaApstCode;
    }

    /**
     * Application Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("criteria.apstCode")
    public void setCriteriaApstCode(String criteriaApstCode) {
        this.criteriaApstCode = criteriaApstCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaApstCode(String criteriaApstCode) {
        this.criteriaApstCode = criteriaApstCode;
        return this;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("initCode")
    public String getInitCode() {
        return initCode;
    }

    /**
     * Initials
     * <p>
     * Lineage reference object : GURMAIL_INIT_CODE, Lookup lineage reference object : stvinit
     * 
     */
    @JsonProperty("initCode")
    public void setInitCode(String initCode) {
        this.initCode = initCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withInitCode(String initCode) {
        this.initCode = initCode;
        return this;
    }

    /**
     * Application Status Date
     * <p>
     * Lineage reference object : SARADAP_APST_DATE
     * 
     */
    @JsonProperty("criteria.apstDate")
    public Date getCriteriaApstDate() {
        return criteriaApstDate;
    }

    /**
     * Application Status Date
     * <p>
     * Lineage reference object : SARADAP_APST_DATE
     * 
     */
    @JsonProperty("criteria.apstDate")
    public void setCriteriaApstDate(Date criteriaApstDate) {
        this.criteriaApstDate = criteriaApstDate;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaApstDate(Date criteriaApstDate) {
        this.criteriaApstDate = criteriaApstDate;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCode")
    public String getCriteriaStypCode() {
        return criteriaStypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.stypCode")
    public void setCriteriaStypCode(String criteriaStypCode) {
        this.criteriaStypCode = criteriaStypCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaStypCode(String criteriaStypCode) {
        this.criteriaStypCode = criteriaStypCode;
        return this;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("letrCode")
    public String getLetrCode() {
        return letrCode;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : GURMAIL_LETR_CODE, Lookup lineage reference object : gtvletr
     * 
     */
    @JsonProperty("letrCode")
    public void setLetrCode(String letrCode) {
        this.letrCode = letrCode;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withLetrCode(String letrCode) {
        this.letrCode = letrCode;
        return this;
    }

    /**
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("criteria.applPreference")
    public Double getCriteriaApplPreference() {
        return criteriaApplPreference;
    }

    /**
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("criteria.applPreference")
    public void setCriteriaApplPreference(Double criteriaApplPreference) {
        this.criteriaApplPreference = criteriaApplPreference;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaApplPreference(Double criteriaApplPreference) {
        this.criteriaApplPreference = criteriaApplPreference;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withIntvCode(String intvCode) {
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withWaivCode(String waivCode) {
        this.waivCode = waivCode;
        return this;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * 
     */
    @JsonProperty("criteria.applDate")
    public Date getCriteriaApplDate() {
        return criteriaApplDate;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * 
     */
    @JsonProperty("criteria.applDate")
    public void setCriteriaApplDate(Date criteriaApplDate) {
        this.criteriaApplDate = criteriaApplDate;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaApplDate(Date criteriaApplDate) {
        this.criteriaApplDate = criteriaApplDate;
        return this;
    }

    /**
     * Wait Days
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("waitDays")
    public Double getWaitDays() {
        return waitDays;
    }

    /**
     * Wait Days
     * <p>
     * Lineage reference object : GURMAIL_WAIT_DAYS
     * 
     */
    @JsonProperty("waitDays")
    public void setWaitDays(Double waitDays) {
        this.waitDays = waitDays;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withWaitDays(Double waitDays) {
        this.waitDays = waitDays;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withEgolCode(String egolCode) {
        this.egolCode = egolCode;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withRtypCode(String rtypCode) {
        this.rtypCode = rtypCode;
        return this;
    }

    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEntry")
    public String getCriteriaTermCodeEntry() {
        return criteriaTermCodeEntry;
    }

    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEntry")
    public void setCriteriaTermCodeEntry(String criteriaTermCodeEntry) {
        this.criteriaTermCodeEntry = criteriaTermCodeEntry;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaTermCodeEntry(String criteriaTermCodeEntry) {
        this.criteriaTermCodeEntry = criteriaTermCodeEntry;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withChangeFeeInd(String changeFeeInd) {
        this.changeFeeInd = changeFeeInd;
        return this;
    }

    @JsonProperty("criteria.statMaintIndDesc")
    public String getCriteriaStatMaintIndDesc() {
        return criteriaStatMaintIndDesc;
    }

    @JsonProperty("criteria.statMaintIndDesc")
    public void setCriteriaStatMaintIndDesc(String criteriaStatMaintIndDesc) {
        this.criteriaStatMaintIndDesc = criteriaStatMaintIndDesc;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withCriteriaStatMaintIndDesc(String criteriaStatMaintIndDesc) {
        this.criteriaStatMaintIndDesc = criteriaStatMaintIndDesc;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaStvadmtDesc");
        sb.append('=');
        sb.append(((this.criteriaStvadmtDesc == null)?"<null>":this.criteriaStvadmtDesc));
        sb.append(',');
        sb.append("tbbdetcAmt");
        sb.append('=');
        sb.append(((this.tbbdetcAmt == null)?"<null>":this.tbbdetcAmt));
        sb.append(',');
        sb.append("edlvCode");
        sb.append('=');
        sb.append(((this.edlvCode == null)?"<null>":this.edlvCode));
        sb.append(',');
        sb.append("criteriaTermCodeEntryDesc");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEntryDesc == null)?"<null>":this.criteriaTermCodeEntryDesc));
        sb.append(',');
        sb.append("criteriaDecMaintIndDesc");
        sb.append('=');
        sb.append(((this.criteriaDecMaintIndDesc == null)?"<null>":this.criteriaDecMaintIndDesc));
        sb.append(',');
        sb.append("criteriaStvsiteDesc");
        sb.append('=');
        sb.append(((this.criteriaStvsiteDesc == null)?"<null>":this.criteriaStvsiteDesc));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("criteriaApplNo");
        sb.append('=');
        sb.append(((this.criteriaApplNo == null)?"<null>":this.criteriaApplNo));
        sb.append(',');
        sb.append("criteriaStvresdDesc");
        sb.append('=');
        sb.append(((this.criteriaStvresdDesc == null)?"<null>":this.criteriaStvresdDesc));
        sb.append(',');
        sb.append("criteriaSarappdMaintInd");
        sb.append('=');
        sb.append(((this.criteriaSarappdMaintInd == null)?"<null>":this.criteriaSarappdMaintInd));
        sb.append(',');
        sb.append("criteriaStvapstDesc");
        sb.append('=');
        sb.append(((this.criteriaStvapstDesc == null)?"<null>":this.criteriaStvapstDesc));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("criteriaRecruiterAppl");
        sb.append('=');
        sb.append(((this.criteriaRecruiterAppl == null)?"<null>":this.criteriaRecruiterAppl));
        sb.append(',');
        sb.append("feeDate");
        sb.append('=');
        sb.append(((this.feeDate == null)?"<null>":this.feeDate));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("criteriaStvstypDesc");
        sb.append('=');
        sb.append(((this.criteriaStvstypDesc == null)?"<null>":this.criteriaStvstypDesc));
        sb.append(',');
        sb.append("criteriaSarappdApdcDate");
        sb.append('=');
        sb.append(((this.criteriaSarappdApdcDate == null)?"<null>":this.criteriaSarappdApdcDate));
        sb.append(',');
        sb.append("criteriaSarappdApdcCode");
        sb.append('=');
        sb.append(((this.criteriaSarappdApdcCode == null)?"<null>":this.criteriaSarappdApdcCode));
        sb.append(',');
        sb.append("criteriaReqDocInd");
        sb.append('=');
        sb.append(((this.criteriaReqDocInd == null)?"<null>":this.criteriaReqDocInd));
        sb.append(',');
        sb.append("criteriaResdCode");
        sb.append('=');
        sb.append(((this.criteriaResdCode == null)?"<null>":this.criteriaResdCode));
        sb.append(',');
        sb.append("criteriaSiteCode");
        sb.append('=');
        sb.append(((this.criteriaSiteCode == null)?"<null>":this.criteriaSiteCode));
        sb.append(',');
        sb.append("criteriaMaintInd");
        sb.append('=');
        sb.append(((this.criteriaMaintInd == null)?"<null>":this.criteriaMaintInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("recrCode");
        sb.append('=');
        sb.append(((this.recrCode == null)?"<null>":this.recrCode));
        sb.append(',');
        sb.append("wrsnCode");
        sb.append('=');
        sb.append(((this.wrsnCode == null)?"<null>":this.wrsnCode));
        sb.append(',');
        sb.append("criteriaFullPartInd");
        sb.append('=');
        sb.append(((this.criteriaFullPartInd == null)?"<null>":this.criteriaFullPartInd));
        sb.append(',');
        sb.append("criteriaAdmtCode");
        sb.append('=');
        sb.append(((this.criteriaAdmtCode == null)?"<null>":this.criteriaAdmtCode));
        sb.append(',');
        sb.append("criteriaStvapdcDesc");
        sb.append('=');
        sb.append(((this.criteriaStvapdcDesc == null)?"<null>":this.criteriaStvapdcDesc));
        sb.append(',');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
        sb.append(',');
        sb.append("criteriaApstCode");
        sb.append('=');
        sb.append(((this.criteriaApstCode == null)?"<null>":this.criteriaApstCode));
        sb.append(',');
        sb.append("initCode");
        sb.append('=');
        sb.append(((this.initCode == null)?"<null>":this.initCode));
        sb.append(',');
        sb.append("criteriaApstDate");
        sb.append('=');
        sb.append(((this.criteriaApstDate == null)?"<null>":this.criteriaApstDate));
        sb.append(',');
        sb.append("criteriaStypCode");
        sb.append('=');
        sb.append(((this.criteriaStypCode == null)?"<null>":this.criteriaStypCode));
        sb.append(',');
        sb.append("letrCode");
        sb.append('=');
        sb.append(((this.letrCode == null)?"<null>":this.letrCode));
        sb.append(',');
        sb.append("criteriaApplPreference");
        sb.append('=');
        sb.append(((this.criteriaApplPreference == null)?"<null>":this.criteriaApplPreference));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("intvCode");
        sb.append('=');
        sb.append(((this.intvCode == null)?"<null>":this.intvCode));
        sb.append(',');
        sb.append("waivCode");
        sb.append('=');
        sb.append(((this.waivCode == null)?"<null>":this.waivCode));
        sb.append(',');
        sb.append("criteriaApplDate");
        sb.append('=');
        sb.append(((this.criteriaApplDate == null)?"<null>":this.criteriaApplDate));
        sb.append(',');
        sb.append("waitDays");
        sb.append('=');
        sb.append(((this.waitDays == null)?"<null>":this.waitDays));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("rtypCode");
        sb.append('=');
        sb.append(((this.rtypCode == null)?"<null>":this.rtypCode));
        sb.append(',');
        sb.append("criteriaTermCodeEntry");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEntry == null)?"<null>":this.criteriaTermCodeEntry));
        sb.append(',');
        sb.append("changeFeeInd");
        sb.append('=');
        sb.append(((this.changeFeeInd == null)?"<null>":this.changeFeeInd));
        sb.append(',');
        sb.append("criteriaStatMaintIndDesc");
        sb.append('=');
        sb.append(((this.criteriaStatMaintIndDesc == null)?"<null>":this.criteriaStatMaintIndDesc));
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
        result = ((result* 31)+((this.tbbdetcAmt == null)? 0 :this.tbbdetcAmt.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEntryDesc == null)? 0 :this.criteriaTermCodeEntryDesc.hashCode()));
        result = ((result* 31)+((this.edlvCode == null)? 0 :this.edlvCode.hashCode()));
        result = ((result* 31)+((this.criteriaStvstypDesc == null)? 0 :this.criteriaStvstypDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSarappdApdcDate == null)? 0 :this.criteriaSarappdApdcDate.hashCode()));
        result = ((result* 31)+((this.criteriaStvapdcDesc == null)? 0 :this.criteriaStvapdcDesc.hashCode()));
        result = ((result* 31)+((this.criteriaRecruiterAppl == null)? 0 :this.criteriaRecruiterAppl.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.criteriaApstCode == null)? 0 :this.criteriaApstCode.hashCode()));
        result = ((result* 31)+((this.criteriaApstDate == null)? 0 :this.criteriaApstDate.hashCode()));
        result = ((result* 31)+((this.criteriaStypCode == null)? 0 :this.criteriaStypCode.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.criteriaSarappdApdcCode == null)? 0 :this.criteriaSarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.feeDate == null)? 0 :this.feeDate.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.criteriaStvapstDesc == null)? 0 :this.criteriaStvapstDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSiteCode == null)? 0 :this.criteriaSiteCode.hashCode()));
        result = ((result* 31)+((this.criteriaFullPartInd == null)? 0 :this.criteriaFullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaResdCode == null)? 0 :this.criteriaResdCode.hashCode()));
        result = ((result* 31)+((this.criteriaMaintInd == null)? 0 :this.criteriaMaintInd.hashCode()));
        result = ((result* 31)+((this.criteriaAdmtCode == null)? 0 :this.criteriaAdmtCode.hashCode()));
        result = ((result* 31)+((this.criteriaSarappdMaintInd == null)? 0 :this.criteriaSarappdMaintInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaApplPreference == null)? 0 :this.criteriaApplPreference.hashCode()));
        result = ((result* 31)+((this.recrCode == null)? 0 :this.recrCode.hashCode()));
        result = ((result* 31)+((this.wrsnCode == null)? 0 :this.wrsnCode.hashCode()));
        result = ((result* 31)+((this.criteriaStatMaintIndDesc == null)? 0 :this.criteriaStatMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEntry == null)? 0 :this.criteriaTermCodeEntry.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.initCode == null)? 0 :this.initCode.hashCode()));
        result = ((result* 31)+((this.letrCode == null)? 0 :this.letrCode.hashCode()));
        result = ((result* 31)+((this.criteriaStvadmtDesc == null)? 0 :this.criteriaStvadmtDesc.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.intvCode == null)? 0 :this.intvCode.hashCode()));
        result = ((result* 31)+((this.criteriaReqDocInd == null)? 0 :this.criteriaReqDocInd.hashCode()));
        result = ((result* 31)+((this.waivCode == null)? 0 :this.waivCode.hashCode()));
        result = ((result* 31)+((this.waitDays == null)? 0 :this.waitDays.hashCode()));
        result = ((result* 31)+((this.criteriaStvresdDesc == null)? 0 :this.criteriaStvresdDesc.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.criteriaApplNo == null)? 0 :this.criteriaApplNo.hashCode()));
        result = ((result* 31)+((this.rtypCode == null)? 0 :this.rtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDecMaintIndDesc == null)? 0 :this.criteriaDecMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.criteriaStvsiteDesc == null)? 0 :this.criteriaStvsiteDesc.hashCode()));
        result = ((result* 31)+((this.changeFeeInd == null)? 0 :this.changeFeeInd.hashCode()));
        result = ((result* 31)+((this.criteriaApplDate == null)? 0 :this.criteriaApplDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest) == false) {
            return false;
        }
        AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest rhs = ((AdmissionsApplicationFeesMailSubmissionWithdrawal100PostRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((this.tbbdetcAmt == rhs.tbbdetcAmt)||((this.tbbdetcAmt!= null)&&this.tbbdetcAmt.equals(rhs.tbbdetcAmt)))&&((this.criteriaTermCodeEntryDesc == rhs.criteriaTermCodeEntryDesc)||((this.criteriaTermCodeEntryDesc!= null)&&this.criteriaTermCodeEntryDesc.equals(rhs.criteriaTermCodeEntryDesc))))&&((this.edlvCode == rhs.edlvCode)||((this.edlvCode!= null)&&this.edlvCode.equals(rhs.edlvCode))))&&((this.criteriaStvstypDesc == rhs.criteriaStvstypDesc)||((this.criteriaStvstypDesc!= null)&&this.criteriaStvstypDesc.equals(rhs.criteriaStvstypDesc))))&&((this.criteriaSarappdApdcDate == rhs.criteriaSarappdApdcDate)||((this.criteriaSarappdApdcDate!= null)&&this.criteriaSarappdApdcDate.equals(rhs.criteriaSarappdApdcDate))))&&((this.criteriaStvapdcDesc == rhs.criteriaStvapdcDesc)||((this.criteriaStvapdcDesc!= null)&&this.criteriaStvapdcDesc.equals(rhs.criteriaStvapdcDesc))))&&((this.criteriaRecruiterAppl == rhs.criteriaRecruiterAppl)||((this.criteriaRecruiterAppl!= null)&&this.criteriaRecruiterAppl.equals(rhs.criteriaRecruiterAppl))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.criteriaApstCode == rhs.criteriaApstCode)||((this.criteriaApstCode!= null)&&this.criteriaApstCode.equals(rhs.criteriaApstCode))))&&((this.criteriaApstDate == rhs.criteriaApstDate)||((this.criteriaApstDate!= null)&&this.criteriaApstDate.equals(rhs.criteriaApstDate))))&&((this.criteriaStypCode == rhs.criteriaStypCode)||((this.criteriaStypCode!= null)&&this.criteriaStypCode.equals(rhs.criteriaStypCode))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.criteriaSarappdApdcCode == rhs.criteriaSarappdApdcCode)||((this.criteriaSarappdApdcCode!= null)&&this.criteriaSarappdApdcCode.equals(rhs.criteriaSarappdApdcCode))))&&((this.feeDate == rhs.feeDate)||((this.feeDate!= null)&&this.feeDate.equals(rhs.feeDate))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.criteriaStvapstDesc == rhs.criteriaStvapstDesc)||((this.criteriaStvapstDesc!= null)&&this.criteriaStvapstDesc.equals(rhs.criteriaStvapstDesc))))&&((this.criteriaSiteCode == rhs.criteriaSiteCode)||((this.criteriaSiteCode!= null)&&this.criteriaSiteCode.equals(rhs.criteriaSiteCode))))&&((this.criteriaFullPartInd == rhs.criteriaFullPartInd)||((this.criteriaFullPartInd!= null)&&this.criteriaFullPartInd.equals(rhs.criteriaFullPartInd))))&&((this.criteriaResdCode == rhs.criteriaResdCode)||((this.criteriaResdCode!= null)&&this.criteriaResdCode.equals(rhs.criteriaResdCode))))&&((this.criteriaMaintInd == rhs.criteriaMaintInd)||((this.criteriaMaintInd!= null)&&this.criteriaMaintInd.equals(rhs.criteriaMaintInd))))&&((this.criteriaAdmtCode == rhs.criteriaAdmtCode)||((this.criteriaAdmtCode!= null)&&this.criteriaAdmtCode.equals(rhs.criteriaAdmtCode))))&&((this.criteriaSarappdMaintInd == rhs.criteriaSarappdMaintInd)||((this.criteriaSarappdMaintInd!= null)&&this.criteriaSarappdMaintInd.equals(rhs.criteriaSarappdMaintInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaApplPreference == rhs.criteriaApplPreference)||((this.criteriaApplPreference!= null)&&this.criteriaApplPreference.equals(rhs.criteriaApplPreference))))&&((this.recrCode == rhs.recrCode)||((this.recrCode!= null)&&this.recrCode.equals(rhs.recrCode))))&&((this.wrsnCode == rhs.wrsnCode)||((this.wrsnCode!= null)&&this.wrsnCode.equals(rhs.wrsnCode))))&&((this.criteriaStatMaintIndDesc == rhs.criteriaStatMaintIndDesc)||((this.criteriaStatMaintIndDesc!= null)&&this.criteriaStatMaintIndDesc.equals(rhs.criteriaStatMaintIndDesc))))&&((this.criteriaTermCodeEntry == rhs.criteriaTermCodeEntry)||((this.criteriaTermCodeEntry!= null)&&this.criteriaTermCodeEntry.equals(rhs.criteriaTermCodeEntry))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.initCode == rhs.initCode)||((this.initCode!= null)&&this.initCode.equals(rhs.initCode))))&&((this.letrCode == rhs.letrCode)||((this.letrCode!= null)&&this.letrCode.equals(rhs.letrCode))))&&((this.criteriaStvadmtDesc == rhs.criteriaStvadmtDesc)||((this.criteriaStvadmtDesc!= null)&&this.criteriaStvadmtDesc.equals(rhs.criteriaStvadmtDesc))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.intvCode == rhs.intvCode)||((this.intvCode!= null)&&this.intvCode.equals(rhs.intvCode))))&&((this.criteriaReqDocInd == rhs.criteriaReqDocInd)||((this.criteriaReqDocInd!= null)&&this.criteriaReqDocInd.equals(rhs.criteriaReqDocInd))))&&((this.waivCode == rhs.waivCode)||((this.waivCode!= null)&&this.waivCode.equals(rhs.waivCode))))&&((this.waitDays == rhs.waitDays)||((this.waitDays!= null)&&this.waitDays.equals(rhs.waitDays))))&&((this.criteriaStvresdDesc == rhs.criteriaStvresdDesc)||((this.criteriaStvresdDesc!= null)&&this.criteriaStvresdDesc.equals(rhs.criteriaStvresdDesc))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.criteriaApplNo == rhs.criteriaApplNo)||((this.criteriaApplNo!= null)&&this.criteriaApplNo.equals(rhs.criteriaApplNo))))&&((this.rtypCode == rhs.rtypCode)||((this.rtypCode!= null)&&this.rtypCode.equals(rhs.rtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDecMaintIndDesc == rhs.criteriaDecMaintIndDesc)||((this.criteriaDecMaintIndDesc!= null)&&this.criteriaDecMaintIndDesc.equals(rhs.criteriaDecMaintIndDesc))))&&((this.criteriaStvsiteDesc == rhs.criteriaStvsiteDesc)||((this.criteriaStvsiteDesc!= null)&&this.criteriaStvsiteDesc.equals(rhs.criteriaStvsiteDesc))))&&((this.changeFeeInd == rhs.changeFeeInd)||((this.changeFeeInd!= null)&&this.changeFeeInd.equals(rhs.changeFeeInd))))&&((this.criteriaApplDate == rhs.criteriaApplDate)||((this.criteriaApplDate!= null)&&this.criteriaApplDate.equals(rhs.criteriaApplDate))));
    }

}
