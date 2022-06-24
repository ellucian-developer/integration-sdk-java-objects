
package com.ellucian.generated.bpapi.ban.admissions_application_curricula.v1_0_0;

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
    "endDate",
    "sorlfosTermCodeCtlg",
    "program",
    "degcCode",
    "lfosRolledInd",
    "majrCode",
    "apstCode",
    "sessCode",
    "gappSeqno",
    "lfstCode",
    "admtCode",
    "activityDate",
    "priorityNo",
    "campCode",
    "sorlfosTermCode",
    "sorlfosEndDate",
    "id",
    "cstsCode",
    "termCodeEntry",
    "fullPartInd",
    "cactCode",
    "termCodeCtlg",
    "majrCodeAttach",
    "sorlfosTermCodeEnd",
    "kbentryTermCode",
    "applNo",
    "resdCode",
    "sorlfosCactCode",
    "tmstCode",
    "sarappdApdcCode",
    "termCodeEnd",
    "userId",
    "keySeqno",
    "currentInd",
    "lmodCode",
    "sorlfosPriorityNo",
    "applPreference",
    "stypCode",
    "collCode",
    "levlCode",
    "startDate",
    "deptCode",
    "termCode",
    "sorlfosStartDate"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationCurricula100GetRequest {

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
    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLCUR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_END_DATE")
    private Date endDate;
    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeCtlg")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm")
    private String sorlfosTermCodeCtlg;
    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    @JsonProperty("lfosRolledInd")
    private String lfosRolledInd;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos")
    private String majrCode;
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
    /**
     * Graduation Sequence
     * <p>
     * Lineage reference object : SOVLCUR_GAPP_SEQNO
     * 
     */
    @JsonProperty("gappSeqno")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_GAPP_SEQNO")
    private Double gappSeqno;
    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String admtCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOVLCUR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_PRIORITY_NO")
    private Double priorityNo;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm")
    private String sorlfosTermCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("sorlfosEndDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_END_DATE")
    private Date sorlfosEndDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String cstsCode;
    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEntry")
    @JsonPropertyDescription("Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm")
    private String termCodeEntry;
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
     * Activity
     * <p>
     * Lineage reference object : SOVLCUR_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_CACT_CODE, Lookup lineage reference object : stvcact,sobcact")
    private String cactCode;
    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm")
    private String termCodeCtlg;
    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos")
    private String majrCodeAttach;
    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeEnd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm")
    private String sorlfosTermCodeEnd;
    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    @JsonPropertyDescription("Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm")
    private String kbentryTermCode;
    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_NO")
    private Double applNo;
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
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("sorlfosCactCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact")
    private String sorlfosCactCode;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst")
    private String tmstCode;
    /**
     * app decision enUS
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapdc")
    private String sarappdApdcCode;
    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_END, Lookup lineage reference object : stvterm")
    private String termCodeEnd;
    /**
     * User ID
     * <p>
     * Lineage reference object : SOVLCUR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_USER_ID")
    private String userId;
    /**
     * Key Sequence
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("keySeqno")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp")
    private Double keySeqno;
    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CURRENT_IND")
    private String currentInd;
    /**
     * Module
     * <p>
     * Lineage reference object : SOVLCUR_LMOD_CODE, Lookup lineage reference object : stvlmod
     * 
     */
    @JsonProperty("lmodCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LMOD_CODE, Lookup lineage reference object : stvlmod")
    private String lmodCode;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_PRIORITY_NO")
    private Double sorlfosPriorityNo;
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
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLCUR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_START_DATE")
    private Date startDate;
    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("sorlfosStartDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_START_DATE")
    private Date sorlfosStartDate;
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

    public AdmissionsApplicationCurricula100GetRequest withReqDocInd(String reqDocInd) {
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

    public AdmissionsApplicationCurricula100GetRequest withApplDate(Date applDate) {
        this.applDate = applDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLCUR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLCUR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public AdmissionsApplicationCurricula100GetRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeCtlg")
    public String getSorlfosTermCodeCtlg() {
        return sorlfosTermCodeCtlg;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeCtlg")
    public void setSorlfosTermCodeCtlg(String sorlfosTermCodeCtlg) {
        this.sorlfosTermCodeCtlg = sorlfosTermCodeCtlg;
    }

    public AdmissionsApplicationCurricula100GetRequest withSorlfosTermCodeCtlg(String sorlfosTermCodeCtlg) {
        this.sorlfosTermCodeCtlg = sorlfosTermCodeCtlg;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public AdmissionsApplicationCurricula100GetRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    @JsonProperty("lfosRolledInd")
    public String getLfosRolledInd() {
        return lfosRolledInd;
    }

    @JsonProperty("lfosRolledInd")
    public void setLfosRolledInd(String lfosRolledInd) {
        this.lfosRolledInd = lfosRolledInd;
    }

    public AdmissionsApplicationCurricula100GetRequest withLfosRolledInd(String lfosRolledInd) {
        this.lfosRolledInd = lfosRolledInd;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withMajrCode(String majrCode) {
        this.majrCode = majrCode;
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

    public AdmissionsApplicationCurricula100GetRequest withApstCode(String apstCode) {
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

    public AdmissionsApplicationCurricula100GetRequest withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Graduation Sequence
     * <p>
     * Lineage reference object : SOVLCUR_GAPP_SEQNO
     * 
     */
    @JsonProperty("gappSeqno")
    public Double getGappSeqno() {
        return gappSeqno;
    }

    /**
     * Graduation Sequence
     * <p>
     * Lineage reference object : SOVLCUR_GAPP_SEQNO
     * 
     */
    @JsonProperty("gappSeqno")
    public void setGappSeqno(Double gappSeqno) {
        this.gappSeqno = gappSeqno;
    }

    public AdmissionsApplicationCurricula100GetRequest withGappSeqno(Double gappSeqno) {
        this.gappSeqno = gappSeqno;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public String getLfstCode() {
        return lfstCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public void setLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
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

    public AdmissionsApplicationCurricula100GetRequest withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOVLCUR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOVLCUR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AdmissionsApplicationCurricula100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public Double getPriorityNo() {
        return priorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public void setPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
    }

    public AdmissionsApplicationCurricula100GetRequest withPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCode")
    public String getSorlfosTermCode() {
        return sorlfosTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCode")
    public void setSorlfosTermCode(String sorlfosTermCode) {
        this.sorlfosTermCode = sorlfosTermCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withSorlfosTermCode(String sorlfosTermCode) {
        this.sorlfosTermCode = sorlfosTermCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("sorlfosEndDate")
    public Date getSorlfosEndDate() {
        return sorlfosEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("sorlfosEndDate")
    public void setSorlfosEndDate(Date sorlfosEndDate) {
        this.sorlfosEndDate = sorlfosEndDate;
    }

    public AdmissionsApplicationCurricula100GetRequest withSorlfosEndDate(Date sorlfosEndDate) {
        this.sorlfosEndDate = sorlfosEndDate;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionsApplicationCurricula100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public String getCstsCode() {
        return cstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    public void setCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
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

    public AdmissionsApplicationCurricula100GetRequest withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
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

    public AdmissionsApplicationCurricula100GetRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLCUR_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public String getCactCode() {
        return cactCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLCUR_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public void setCactCode(String cactCode) {
        this.cactCode = cactCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withCactCode(String cactCode) {
        this.cactCode = cactCode;
        return this;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public String getTermCodeCtlg() {
        return termCodeCtlg;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public void setTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
    }

    public AdmissionsApplicationCurricula100GetRequest withTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
        return this;
    }

    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    public String getMajrCodeAttach() {
        return majrCodeAttach;
    }

    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    public void setMajrCodeAttach(String majrCodeAttach) {
        this.majrCodeAttach = majrCodeAttach;
    }

    public AdmissionsApplicationCurricula100GetRequest withMajrCodeAttach(String majrCodeAttach) {
        this.majrCodeAttach = majrCodeAttach;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeEnd")
    public String getSorlfosTermCodeEnd() {
        return sorlfosTermCodeEnd;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlfosTermCodeEnd")
    public void setSorlfosTermCodeEnd(String sorlfosTermCodeEnd) {
        this.sorlfosTermCodeEnd = sorlfosTermCodeEnd;
    }

    public AdmissionsApplicationCurricula100GetRequest withSorlfosTermCodeEnd(String sorlfosTermCodeEnd) {
        this.sorlfosTermCodeEnd = sorlfosTermCodeEnd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public String getKbentryTermCode() {
        return kbentryTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : kbentryTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("kbentryTermCode")
    public void setKbentryTermCode(String kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withKbentryTermCode(String kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
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

    public AdmissionsApplicationCurricula100GetRequest withApplNo(Double applNo) {
        this.applNo = applNo;
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

    public AdmissionsApplicationCurricula100GetRequest withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("sorlfosCactCode")
    public String getSorlfosCactCode() {
        return sorlfosCactCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("sorlfosCactCode")
    public void setSorlfosCactCode(String sorlfosCactCode) {
        this.sorlfosCactCode = sorlfosCactCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withSorlfosCactCode(String sorlfosCactCode) {
        this.sorlfosCactCode = sorlfosCactCode;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    public String getTmstCode() {
        return tmstCode;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    public void setTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
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

    public AdmissionsApplicationCurricula100GetRequest withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public String getTermCodeEnd() {
        return termCodeEnd;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public void setTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
    }

    public AdmissionsApplicationCurricula100GetRequest withTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SOVLCUR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SOVLCUR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AdmissionsApplicationCurricula100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Key Sequence
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("keySeqno")
    public Double getKeySeqno() {
        return keySeqno;
    }

    /**
     * Key Sequence
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("keySeqno")
    public void setKeySeqno(Double keySeqno) {
        this.keySeqno = keySeqno;
    }

    public AdmissionsApplicationCurricula100GetRequest withKeySeqno(Double keySeqno) {
        this.keySeqno = keySeqno;
        return this;
    }

    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    public String getCurrentInd() {
        return currentInd;
    }

    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    public void setCurrentInd(String currentInd) {
        this.currentInd = currentInd;
    }

    public AdmissionsApplicationCurricula100GetRequest withCurrentInd(String currentInd) {
        this.currentInd = currentInd;
        return this;
    }

    /**
     * Module
     * <p>
     * Lineage reference object : SOVLCUR_LMOD_CODE, Lookup lineage reference object : stvlmod
     * 
     */
    @JsonProperty("lmodCode")
    public String getLmodCode() {
        return lmodCode;
    }

    /**
     * Module
     * <p>
     * Lineage reference object : SOVLCUR_LMOD_CODE, Lookup lineage reference object : stvlmod
     * 
     */
    @JsonProperty("lmodCode")
    public void setLmodCode(String lmodCode) {
        this.lmodCode = lmodCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withLmodCode(String lmodCode) {
        this.lmodCode = lmodCode;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    public Double getSorlfosPriorityNo() {
        return sorlfosPriorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    public void setSorlfosPriorityNo(Double sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
    }

    public AdmissionsApplicationCurricula100GetRequest withSorlfosPriorityNo(Double sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
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

    public AdmissionsApplicationCurricula100GetRequest withApplPreference(Double applPreference) {
        this.applPreference = applPreference;
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

    public AdmissionsApplicationCurricula100GetRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLCUR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLCUR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public AdmissionsApplicationCurricula100GetRequest withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public AdmissionsApplicationCurricula100GetRequest withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("sorlfosStartDate")
    public Date getSorlfosStartDate() {
        return sorlfosStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("sorlfosStartDate")
    public void setSorlfosStartDate(Date sorlfosStartDate) {
        this.sorlfosStartDate = sorlfosStartDate;
    }

    public AdmissionsApplicationCurricula100GetRequest withSorlfosStartDate(Date sorlfosStartDate) {
        this.sorlfosStartDate = sorlfosStartDate;
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

    public AdmissionsApplicationCurricula100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationCurricula100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("sorlfosTermCodeCtlg");
        sb.append('=');
        sb.append(((this.sorlfosTermCodeCtlg == null)?"<null>":this.sorlfosTermCodeCtlg));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("lfosRolledInd");
        sb.append('=');
        sb.append(((this.lfosRolledInd == null)?"<null>":this.lfosRolledInd));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("gappSeqno");
        sb.append('=');
        sb.append(((this.gappSeqno == null)?"<null>":this.gappSeqno));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("priorityNo");
        sb.append('=');
        sb.append(((this.priorityNo == null)?"<null>":this.priorityNo));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("sorlfosTermCode");
        sb.append('=');
        sb.append(((this.sorlfosTermCode == null)?"<null>":this.sorlfosTermCode));
        sb.append(',');
        sb.append("sorlfosEndDate");
        sb.append('=');
        sb.append(((this.sorlfosEndDate == null)?"<null>":this.sorlfosEndDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("cstsCode");
        sb.append('=');
        sb.append(((this.cstsCode == null)?"<null>":this.cstsCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("cactCode");
        sb.append('=');
        sb.append(((this.cactCode == null)?"<null>":this.cactCode));
        sb.append(',');
        sb.append("termCodeCtlg");
        sb.append('=');
        sb.append(((this.termCodeCtlg == null)?"<null>":this.termCodeCtlg));
        sb.append(',');
        sb.append("majrCodeAttach");
        sb.append('=');
        sb.append(((this.majrCodeAttach == null)?"<null>":this.majrCodeAttach));
        sb.append(',');
        sb.append("sorlfosTermCodeEnd");
        sb.append('=');
        sb.append(((this.sorlfosTermCodeEnd == null)?"<null>":this.sorlfosTermCodeEnd));
        sb.append(',');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("sorlfosCactCode");
        sb.append('=');
        sb.append(((this.sorlfosCactCode == null)?"<null>":this.sorlfosCactCode));
        sb.append(',');
        sb.append("tmstCode");
        sb.append('=');
        sb.append(((this.tmstCode == null)?"<null>":this.tmstCode));
        sb.append(',');
        sb.append("sarappdApdcCode");
        sb.append('=');
        sb.append(((this.sarappdApdcCode == null)?"<null>":this.sarappdApdcCode));
        sb.append(',');
        sb.append("termCodeEnd");
        sb.append('=');
        sb.append(((this.termCodeEnd == null)?"<null>":this.termCodeEnd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("keySeqno");
        sb.append('=');
        sb.append(((this.keySeqno == null)?"<null>":this.keySeqno));
        sb.append(',');
        sb.append("currentInd");
        sb.append('=');
        sb.append(((this.currentInd == null)?"<null>":this.currentInd));
        sb.append(',');
        sb.append("lmodCode");
        sb.append('=');
        sb.append(((this.lmodCode == null)?"<null>":this.lmodCode));
        sb.append(',');
        sb.append("sorlfosPriorityNo");
        sb.append('=');
        sb.append(((this.sorlfosPriorityNo == null)?"<null>":this.sorlfosPriorityNo));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("sorlfosStartDate");
        sb.append('=');
        sb.append(((this.sorlfosStartDate == null)?"<null>":this.sorlfosStartDate));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.sorlfosTermCodeCtlg == null)? 0 :this.sorlfosTermCodeCtlg.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.lfosRolledInd == null)? 0 :this.lfosRolledInd.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.gappSeqno == null)? 0 :this.gappSeqno.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.priorityNo == null)? 0 :this.priorityNo.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.sorlfosTermCode == null)? 0 :this.sorlfosTermCode.hashCode()));
        result = ((result* 31)+((this.sorlfosEndDate == null)? 0 :this.sorlfosEndDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.cstsCode == null)? 0 :this.cstsCode.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.cactCode == null)? 0 :this.cactCode.hashCode()));
        result = ((result* 31)+((this.termCodeCtlg == null)? 0 :this.termCodeCtlg.hashCode()));
        result = ((result* 31)+((this.majrCodeAttach == null)? 0 :this.majrCodeAttach.hashCode()));
        result = ((result* 31)+((this.sorlfosTermCodeEnd == null)? 0 :this.sorlfosTermCodeEnd.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sorlfosCactCode == null)? 0 :this.sorlfosCactCode.hashCode()));
        result = ((result* 31)+((this.tmstCode == null)? 0 :this.tmstCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.termCodeEnd == null)? 0 :this.termCodeEnd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.keySeqno == null)? 0 :this.keySeqno.hashCode()));
        result = ((result* 31)+((this.currentInd == null)? 0 :this.currentInd.hashCode()));
        result = ((result* 31)+((this.lmodCode == null)? 0 :this.lmodCode.hashCode()));
        result = ((result* 31)+((this.sorlfosPriorityNo == null)? 0 :this.sorlfosPriorityNo.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.sorlfosStartDate == null)? 0 :this.sorlfosStartDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationCurricula100GetRequest) == false) {
            return false;
        }
        AdmissionsApplicationCurricula100GetRequest rhs = ((AdmissionsApplicationCurricula100GetRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd)))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.sorlfosTermCodeCtlg == rhs.sorlfosTermCodeCtlg)||((this.sorlfosTermCodeCtlg!= null)&&this.sorlfosTermCodeCtlg.equals(rhs.sorlfosTermCodeCtlg))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.lfosRolledInd == rhs.lfosRolledInd)||((this.lfosRolledInd!= null)&&this.lfosRolledInd.equals(rhs.lfosRolledInd))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.gappSeqno == rhs.gappSeqno)||((this.gappSeqno!= null)&&this.gappSeqno.equals(rhs.gappSeqno))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.priorityNo == rhs.priorityNo)||((this.priorityNo!= null)&&this.priorityNo.equals(rhs.priorityNo))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.sorlfosTermCode == rhs.sorlfosTermCode)||((this.sorlfosTermCode!= null)&&this.sorlfosTermCode.equals(rhs.sorlfosTermCode))))&&((this.sorlfosEndDate == rhs.sorlfosEndDate)||((this.sorlfosEndDate!= null)&&this.sorlfosEndDate.equals(rhs.sorlfosEndDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.cstsCode == rhs.cstsCode)||((this.cstsCode!= null)&&this.cstsCode.equals(rhs.cstsCode))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.cactCode == rhs.cactCode)||((this.cactCode!= null)&&this.cactCode.equals(rhs.cactCode))))&&((this.termCodeCtlg == rhs.termCodeCtlg)||((this.termCodeCtlg!= null)&&this.termCodeCtlg.equals(rhs.termCodeCtlg))))&&((this.majrCodeAttach == rhs.majrCodeAttach)||((this.majrCodeAttach!= null)&&this.majrCodeAttach.equals(rhs.majrCodeAttach))))&&((this.sorlfosTermCodeEnd == rhs.sorlfosTermCodeEnd)||((this.sorlfosTermCodeEnd!= null)&&this.sorlfosTermCodeEnd.equals(rhs.sorlfosTermCodeEnd))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sorlfosCactCode == rhs.sorlfosCactCode)||((this.sorlfosCactCode!= null)&&this.sorlfosCactCode.equals(rhs.sorlfosCactCode))))&&((this.tmstCode == rhs.tmstCode)||((this.tmstCode!= null)&&this.tmstCode.equals(rhs.tmstCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.termCodeEnd == rhs.termCodeEnd)||((this.termCodeEnd!= null)&&this.termCodeEnd.equals(rhs.termCodeEnd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.keySeqno == rhs.keySeqno)||((this.keySeqno!= null)&&this.keySeqno.equals(rhs.keySeqno))))&&((this.currentInd == rhs.currentInd)||((this.currentInd!= null)&&this.currentInd.equals(rhs.currentInd))))&&((this.lmodCode == rhs.lmodCode)||((this.lmodCode!= null)&&this.lmodCode.equals(rhs.lmodCode))))&&((this.sorlfosPriorityNo == rhs.sorlfosPriorityNo)||((this.sorlfosPriorityNo!= null)&&this.sorlfosPriorityNo.equals(rhs.sorlfosPriorityNo))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.sorlfosStartDate == rhs.sorlfosStartDate)||((this.sorlfosStartDate!= null)&&this.sorlfosStartDate.equals(rhs.sorlfosStartDate))));
    }

}
