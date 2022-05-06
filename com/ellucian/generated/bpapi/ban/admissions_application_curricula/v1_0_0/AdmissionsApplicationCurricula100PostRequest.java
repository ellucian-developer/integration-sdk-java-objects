
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
    "applDate",
    "endDate",
    "sorlfosTermCodeCtlg",
    "program",
    "degcCode",
    "majrCode",
    "apstCode",
    "apstDate",
    "lfstCode",
    "admtCode",
    "priorityNo",
    "campCode",
    "sorlfosEndDate",
    "id",
    "cstsCode",
    "termCodeEntry",
    "fullPartInd",
    "cactCode",
    "termCodeCtlg",
    "siteCode",
    "kbentryTermCode",
    "resdCode",
    "sorlfosCactCode",
    "tmstCode",
    "termCodeEnd",
    "applPreference",
    "stypCode",
    "collCode",
    "levlCode",
    "startDate",
    "deptCode",
    "sorlfosStartDate"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationCurricula100PostRequest {

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
     * Application Status Date
     * <p>
     * Lineage reference object : SARADAP_APST_DATE
     * 
     */
    @JsonProperty("apstDate")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APST_DATE")
    private Date apstDate;
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
    private Object id;
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
     * Site
     * <p>
     * Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("siteCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_SITE_CODE, Lookup lineage reference object : stvsite")
    private String siteCode;
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
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm")
    private String termCodeEnd;
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

    public AdmissionsApplicationCurricula100PostRequest withApplDate(Date applDate) {
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

    public AdmissionsApplicationCurricula100PostRequest withEndDate(Date endDate) {
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

    public AdmissionsApplicationCurricula100PostRequest withSorlfosTermCodeCtlg(String sorlfosTermCodeCtlg) {
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

    public AdmissionsApplicationCurricula100PostRequest withProgram(String program) {
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

    public AdmissionsApplicationCurricula100PostRequest withDegcCode(String degcCode) {
        this.degcCode = degcCode;
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

    public AdmissionsApplicationCurricula100PostRequest withMajrCode(String majrCode) {
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

    public AdmissionsApplicationCurricula100PostRequest withApstCode(String apstCode) {
        this.apstCode = apstCode;
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

    public AdmissionsApplicationCurricula100PostRequest withApstDate(Date apstDate) {
        this.apstDate = apstDate;
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

    public AdmissionsApplicationCurricula100PostRequest withLfstCode(String lfstCode) {
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

    public AdmissionsApplicationCurricula100PostRequest withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
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

    public AdmissionsApplicationCurricula100PostRequest withPriorityNo(Double priorityNo) {
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

    public AdmissionsApplicationCurricula100PostRequest withCampCode(String campCode) {
        this.campCode = campCode;
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

    public AdmissionsApplicationCurricula100PostRequest withSorlfosEndDate(Date sorlfosEndDate) {
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

    public AdmissionsApplicationCurricula100PostRequest withId(Object id) {
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

    public AdmissionsApplicationCurricula100PostRequest withCstsCode(String cstsCode) {
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

    public AdmissionsApplicationCurricula100PostRequest withTermCodeEntry(String termCodeEntry) {
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

    public AdmissionsApplicationCurricula100PostRequest withFullPartInd(String fullPartInd) {
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

    public AdmissionsApplicationCurricula100PostRequest withCactCode(String cactCode) {
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

    public AdmissionsApplicationCurricula100PostRequest withTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
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

    public AdmissionsApplicationCurricula100PostRequest withSiteCode(String siteCode) {
        this.siteCode = siteCode;
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

    public AdmissionsApplicationCurricula100PostRequest withKbentryTermCode(Object kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
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

    public AdmissionsApplicationCurricula100PostRequest withResdCode(String resdCode) {
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

    public AdmissionsApplicationCurricula100PostRequest withSorlfosCactCode(String sorlfosCactCode) {
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

    public AdmissionsApplicationCurricula100PostRequest withTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public String getTermCodeEnd() {
        return termCodeEnd;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public void setTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
    }

    public AdmissionsApplicationCurricula100PostRequest withTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
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

    public AdmissionsApplicationCurricula100PostRequest withApplPreference(Double applPreference) {
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

    public AdmissionsApplicationCurricula100PostRequest withStypCode(String stypCode) {
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

    public AdmissionsApplicationCurricula100PostRequest withCollCode(String collCode) {
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

    public AdmissionsApplicationCurricula100PostRequest withLevlCode(String levlCode) {
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

    public AdmissionsApplicationCurricula100PostRequest withStartDate(Date startDate) {
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

    public AdmissionsApplicationCurricula100PostRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public AdmissionsApplicationCurricula100PostRequest withSorlfosStartDate(Date sorlfosStartDate) {
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

    public AdmissionsApplicationCurricula100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationCurricula100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("apstDate");
        sb.append('=');
        sb.append(((this.apstDate == null)?"<null>":this.apstDate));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("priorityNo");
        sb.append('=');
        sb.append(((this.priorityNo == null)?"<null>":this.priorityNo));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
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
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
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
        sb.append("termCodeEnd");
        sb.append('=');
        sb.append(((this.termCodeEnd == null)?"<null>":this.termCodeEnd));
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
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.sorlfosTermCodeCtlg == null)? 0 :this.sorlfosTermCodeCtlg.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.apstDate == null)? 0 :this.apstDate.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.priorityNo == null)? 0 :this.priorityNo.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.sorlfosEndDate == null)? 0 :this.sorlfosEndDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.cstsCode == null)? 0 :this.cstsCode.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.cactCode == null)? 0 :this.cactCode.hashCode()));
        result = ((result* 31)+((this.termCodeCtlg == null)? 0 :this.termCodeCtlg.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sorlfosCactCode == null)? 0 :this.sorlfosCactCode.hashCode()));
        result = ((result* 31)+((this.tmstCode == null)? 0 :this.tmstCode.hashCode()));
        result = ((result* 31)+((this.termCodeEnd == null)? 0 :this.termCodeEnd.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.sorlfosStartDate == null)? 0 :this.sorlfosStartDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationCurricula100PostRequest) == false) {
            return false;
        }
        AdmissionsApplicationCurricula100PostRequest rhs = ((AdmissionsApplicationCurricula100PostRequest) other);
        return ((((((((((((((((((((((((((((((((((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.sorlfosTermCodeCtlg == rhs.sorlfosTermCodeCtlg)||((this.sorlfosTermCodeCtlg!= null)&&this.sorlfosTermCodeCtlg.equals(rhs.sorlfosTermCodeCtlg))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.apstDate == rhs.apstDate)||((this.apstDate!= null)&&this.apstDate.equals(rhs.apstDate))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.priorityNo == rhs.priorityNo)||((this.priorityNo!= null)&&this.priorityNo.equals(rhs.priorityNo))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.sorlfosEndDate == rhs.sorlfosEndDate)||((this.sorlfosEndDate!= null)&&this.sorlfosEndDate.equals(rhs.sorlfosEndDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.cstsCode == rhs.cstsCode)||((this.cstsCode!= null)&&this.cstsCode.equals(rhs.cstsCode))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.cactCode == rhs.cactCode)||((this.cactCode!= null)&&this.cactCode.equals(rhs.cactCode))))&&((this.termCodeCtlg == rhs.termCodeCtlg)||((this.termCodeCtlg!= null)&&this.termCodeCtlg.equals(rhs.termCodeCtlg))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sorlfosCactCode == rhs.sorlfosCactCode)||((this.sorlfosCactCode!= null)&&this.sorlfosCactCode.equals(rhs.sorlfosCactCode))))&&((this.tmstCode == rhs.tmstCode)||((this.tmstCode!= null)&&this.tmstCode.equals(rhs.tmstCode))))&&((this.termCodeEnd == rhs.termCodeEnd)||((this.termCodeEnd!= null)&&this.termCodeEnd.equals(rhs.termCodeEnd))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.sorlfosStartDate == rhs.sorlfosStartDate)||((this.sorlfosStartDate!= null)&&this.sorlfosStartDate.equals(rhs.sorlfosStartDate))));
    }

}
