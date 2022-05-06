
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
    "id",
    "kbentryTermCode",
    "termCodeEntry",
    "sarappdApdcCode",
    "apstCode",
    "applDate",
    "applNo",
    "admtCode",
    "sessCode",
    "reqDocInd",
    "applPreference",
    "stypCode",
    "resdCode",
    "fullPartInd",
    "SORLCURCurrentInd",
    "cactCode",
    "termCode",
    "lmodCode",
    "keySeqno",
    "termCodeEnd",
    "termCodeCtlg",
    "priorityNo",
    "gappSeqno",
    "program",
    "collCode",
    "levlCode",
    "degcCode",
    "campCode",
    "startDate",
    "activityDate",
    "userId",
    "endDate",
    "currentInd",
    "sorlfosCactCode",
    "cstsCode",
    "sorlfosTermCode",
    "lfstCode",
    "sorlfosPriorityNo",
    "sorlfosTermCodeCtlg",
    "sorlfosTermCodeEnd",
    "majrCode",
    "sorlfosStartDate",
    "deptCode",
    "sorlfosEndDate",
    "majrCodeAttach",
    "lfosRolledInd",
    "tmstCode"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationCurricula100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("kbentryTermCode")
    private String kbentryTermCode;
    @JsonProperty("termCodeEntry")
    private String termCodeEntry;
    @JsonProperty("sarappdApdcCode")
    private String sarappdApdcCode;
    @JsonProperty("apstCode")
    private String apstCode;
    @JsonProperty("applDate")
    private String applDate;
    @JsonProperty("applNo")
    private String applNo;
    @JsonProperty("admtCode")
    private String admtCode;
    @JsonProperty("sessCode")
    private String sessCode;
    @JsonProperty("reqDocInd")
    private String reqDocInd;
    @JsonProperty("applPreference")
    private String applPreference;
    @JsonProperty("stypCode")
    private String stypCode;
    @JsonProperty("resdCode")
    private String resdCode;
    @JsonProperty("fullPartInd")
    private String fullPartInd;
    @JsonProperty("SORLCURCurrentInd")
    private String sORLCURCurrentInd;
    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact")
    private String cactCode;
    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonProperty("lmodCode")
    private String lmodCode;
    @JsonProperty("keySeqno")
    private String keySeqno;
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
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm")
    private String termCodeCtlg;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_PRIORITY_NO")
    private Double priorityNo;
    @JsonProperty("gappSeqno")
    private String gappSeqno;
    @JsonProperty("program")
    private String program;
    @JsonProperty("collCode")
    private String collCode;
    @JsonProperty("levlCode")
    private String levlCode;
    @JsonProperty("degcCode")
    private String degcCode;
    @JsonProperty("campCode")
    private String campCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_START_DATE")
    private Date startDate;
    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_USER_ID")
    private String userId;
    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_END_DATE")
    private Date endDate;
    /**
     * Lineage reference object : SOVLFOS_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CURRENT_IND")
    private String currentInd;
    @JsonProperty("sorlfosCactCode")
    private String sorlfosCactCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("cstsCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String cstsCode;
    @JsonProperty("sorlfosTermCode")
    private String sorlfosTermCode;
    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    @JsonProperty("sorlfosPriorityNo")
    private String sorlfosPriorityNo;
    @JsonProperty("sorlfosTermCodeCtlg")
    private String sorlfosTermCodeCtlg;
    @JsonProperty("sorlfosTermCodeEnd")
    private String sorlfosTermCodeEnd;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos")
    private String majrCode;
    @JsonProperty("sorlfosStartDate")
    private String sorlfosStartDate;
    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonProperty("sorlfosEndDate")
    private String sorlfosEndDate;
    /**
     * Attached to Major
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos
     * 
     */
    @JsonProperty("majrCodeAttach")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE_ATTACH, Lookup lineage reference object : sobcact,stvmajr,sotlfos,sotlfos")
    private String majrCodeAttach;
    @JsonProperty("lfosRolledInd")
    private String lfosRolledInd;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst
     * 
     */
    @JsonProperty("tmstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_TMST_CODE, Lookup lineage reference object : stvtmst")
    private String tmstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionsApplicationCurricula100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("kbentryTermCode")
    public String getKbentryTermCode() {
        return kbentryTermCode;
    }

    @JsonProperty("kbentryTermCode")
    public void setKbentryTermCode(String kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withKbentryTermCode(String kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
        return this;
    }

    @JsonProperty("termCodeEntry")
    public String getTermCodeEntry() {
        return termCodeEntry;
    }

    @JsonProperty("termCodeEntry")
    public void setTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
    }

    public AdmissionsApplicationCurricula100QapiPost withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
        return this;
    }

    @JsonProperty("sarappdApdcCode")
    public String getSarappdApdcCode() {
        return sarappdApdcCode;
    }

    @JsonProperty("sarappdApdcCode")
    public void setSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    @JsonProperty("apstCode")
    public String getApstCode() {
        return apstCode;
    }

    @JsonProperty("apstCode")
    public void setApstCode(String apstCode) {
        this.apstCode = apstCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withApstCode(String apstCode) {
        this.apstCode = apstCode;
        return this;
    }

    @JsonProperty("applDate")
    public String getApplDate() {
        return applDate;
    }

    @JsonProperty("applDate")
    public void setApplDate(String applDate) {
        this.applDate = applDate;
    }

    public AdmissionsApplicationCurricula100QapiPost withApplDate(String applDate) {
        this.applDate = applDate;
        return this;
    }

    @JsonProperty("applNo")
    public String getApplNo() {
        return applNo;
    }

    @JsonProperty("applNo")
    public void setApplNo(String applNo) {
        this.applNo = applNo;
    }

    public AdmissionsApplicationCurricula100QapiPost withApplNo(String applNo) {
        this.applNo = applNo;
        return this;
    }

    @JsonProperty("admtCode")
    public String getAdmtCode() {
        return admtCode;
    }

    @JsonProperty("admtCode")
    public void setAdmtCode(String admtCode) {
        this.admtCode = admtCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    @JsonProperty("reqDocInd")
    public String getReqDocInd() {
        return reqDocInd;
    }

    @JsonProperty("reqDocInd")
    public void setReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
    }

    public AdmissionsApplicationCurricula100QapiPost withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
        return this;
    }

    @JsonProperty("applPreference")
    public String getApplPreference() {
        return applPreference;
    }

    @JsonProperty("applPreference")
    public void setApplPreference(String applPreference) {
        this.applPreference = applPreference;
    }

    public AdmissionsApplicationCurricula100QapiPost withApplPreference(String applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public AdmissionsApplicationCurricula100QapiPost withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    @JsonProperty("SORLCURCurrentInd")
    public String getSORLCURCurrentInd() {
        return sORLCURCurrentInd;
    }

    @JsonProperty("SORLCURCurrentInd")
    public void setSORLCURCurrentInd(String sORLCURCurrentInd) {
        this.sORLCURCurrentInd = sORLCURCurrentInd;
    }

    public AdmissionsApplicationCurricula100QapiPost withSORLCURCurrentInd(String sORLCURCurrentInd) {
        this.sORLCURCurrentInd = sORLCURCurrentInd;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public String getCactCode() {
        return cactCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVLFOS_CACT_CODE, Lookup lineage reference object : stvcact,sobcact
     * 
     */
    @JsonProperty("cactCode")
    public void setCactCode(String cactCode) {
        this.cactCode = cactCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withCactCode(String cactCode) {
        this.cactCode = cactCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("lmodCode")
    public String getLmodCode() {
        return lmodCode;
    }

    @JsonProperty("lmodCode")
    public void setLmodCode(String lmodCode) {
        this.lmodCode = lmodCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withLmodCode(String lmodCode) {
        this.lmodCode = lmodCode;
        return this;
    }

    @JsonProperty("keySeqno")
    public String getKeySeqno() {
        return keySeqno;
    }

    @JsonProperty("keySeqno")
    public void setKeySeqno(String keySeqno) {
        this.keySeqno = keySeqno;
    }

    public AdmissionsApplicationCurricula100QapiPost withKeySeqno(String keySeqno) {
        this.keySeqno = keySeqno;
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

    public AdmissionsApplicationCurricula100QapiPost withTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
        return this;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public String getTermCodeCtlg() {
        return termCodeCtlg;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SOVLFOS_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeCtlg")
    public void setTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
    }

    public AdmissionsApplicationCurricula100QapiPost withTermCodeCtlg(String termCodeCtlg) {
        this.termCodeCtlg = termCodeCtlg;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public Double getPriorityNo() {
        return priorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("priorityNo")
    public void setPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
    }

    public AdmissionsApplicationCurricula100QapiPost withPriorityNo(Double priorityNo) {
        this.priorityNo = priorityNo;
        return this;
    }

    @JsonProperty("gappSeqno")
    public String getGappSeqno() {
        return gappSeqno;
    }

    @JsonProperty("gappSeqno")
    public void setGappSeqno(String gappSeqno) {
        this.gappSeqno = gappSeqno;
    }

    public AdmissionsApplicationCurricula100QapiPost withGappSeqno(String gappSeqno) {
        this.gappSeqno = gappSeqno;
        return this;
    }

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public AdmissionsApplicationCurricula100QapiPost withProgram(String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SOVLFOS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public AdmissionsApplicationCurricula100QapiPost withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AdmissionsApplicationCurricula100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AdmissionsApplicationCurricula100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SOVLFOS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public AdmissionsApplicationCurricula100QapiPost withEndDate(Date endDate) {
        this.endDate = endDate;
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

    public AdmissionsApplicationCurricula100QapiPost withCurrentInd(String currentInd) {
        this.currentInd = currentInd;
        return this;
    }

    @JsonProperty("sorlfosCactCode")
    public String getSorlfosCactCode() {
        return sorlfosCactCode;
    }

    @JsonProperty("sorlfosCactCode")
    public void setSorlfosCactCode(String sorlfosCactCode) {
        this.sorlfosCactCode = sorlfosCactCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withSorlfosCactCode(String sorlfosCactCode) {
        this.sorlfosCactCode = sorlfosCactCode;
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

    public AdmissionsApplicationCurricula100QapiPost withCstsCode(String cstsCode) {
        this.cstsCode = cstsCode;
        return this;
    }

    @JsonProperty("sorlfosTermCode")
    public String getSorlfosTermCode() {
        return sorlfosTermCode;
    }

    @JsonProperty("sorlfosTermCode")
    public void setSorlfosTermCode(String sorlfosTermCode) {
        this.sorlfosTermCode = sorlfosTermCode;
    }

    public AdmissionsApplicationCurricula100QapiPost withSorlfosTermCode(String sorlfosTermCode) {
        this.sorlfosTermCode = sorlfosTermCode;
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

    public AdmissionsApplicationCurricula100QapiPost withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    @JsonProperty("sorlfosPriorityNo")
    public String getSorlfosPriorityNo() {
        return sorlfosPriorityNo;
    }

    @JsonProperty("sorlfosPriorityNo")
    public void setSorlfosPriorityNo(String sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
    }

    public AdmissionsApplicationCurricula100QapiPost withSorlfosPriorityNo(String sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
        return this;
    }

    @JsonProperty("sorlfosTermCodeCtlg")
    public String getSorlfosTermCodeCtlg() {
        return sorlfosTermCodeCtlg;
    }

    @JsonProperty("sorlfosTermCodeCtlg")
    public void setSorlfosTermCodeCtlg(String sorlfosTermCodeCtlg) {
        this.sorlfosTermCodeCtlg = sorlfosTermCodeCtlg;
    }

    public AdmissionsApplicationCurricula100QapiPost withSorlfosTermCodeCtlg(String sorlfosTermCodeCtlg) {
        this.sorlfosTermCodeCtlg = sorlfosTermCodeCtlg;
        return this;
    }

    @JsonProperty("sorlfosTermCodeEnd")
    public String getSorlfosTermCodeEnd() {
        return sorlfosTermCodeEnd;
    }

    @JsonProperty("sorlfosTermCodeEnd")
    public void setSorlfosTermCodeEnd(String sorlfosTermCodeEnd) {
        this.sorlfosTermCodeEnd = sorlfosTermCodeEnd;
    }

    public AdmissionsApplicationCurricula100QapiPost withSorlfosTermCodeEnd(String sorlfosTermCodeEnd) {
        this.sorlfosTermCodeEnd = sorlfosTermCodeEnd;
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

    public AdmissionsApplicationCurricula100QapiPost withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    @JsonProperty("sorlfosStartDate")
    public String getSorlfosStartDate() {
        return sorlfosStartDate;
    }

    @JsonProperty("sorlfosStartDate")
    public void setSorlfosStartDate(String sorlfosStartDate) {
        this.sorlfosStartDate = sorlfosStartDate;
    }

    public AdmissionsApplicationCurricula100QapiPost withSorlfosStartDate(String sorlfosStartDate) {
        this.sorlfosStartDate = sorlfosStartDate;
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

    public AdmissionsApplicationCurricula100QapiPost withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    @JsonProperty("sorlfosEndDate")
    public String getSorlfosEndDate() {
        return sorlfosEndDate;
    }

    @JsonProperty("sorlfosEndDate")
    public void setSorlfosEndDate(String sorlfosEndDate) {
        this.sorlfosEndDate = sorlfosEndDate;
    }

    public AdmissionsApplicationCurricula100QapiPost withSorlfosEndDate(String sorlfosEndDate) {
        this.sorlfosEndDate = sorlfosEndDate;
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

    public AdmissionsApplicationCurricula100QapiPost withMajrCodeAttach(String majrCodeAttach) {
        this.majrCodeAttach = majrCodeAttach;
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

    public AdmissionsApplicationCurricula100QapiPost withLfosRolledInd(String lfosRolledInd) {
        this.lfosRolledInd = lfosRolledInd;
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

    public AdmissionsApplicationCurricula100QapiPost withTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
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

    public AdmissionsApplicationCurricula100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationCurricula100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("sarappdApdcCode");
        sb.append('=');
        sb.append(((this.sarappdApdcCode == null)?"<null>":this.sarappdApdcCode));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("sORLCURCurrentInd");
        sb.append('=');
        sb.append(((this.sORLCURCurrentInd == null)?"<null>":this.sORLCURCurrentInd));
        sb.append(',');
        sb.append("cactCode");
        sb.append('=');
        sb.append(((this.cactCode == null)?"<null>":this.cactCode));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("lmodCode");
        sb.append('=');
        sb.append(((this.lmodCode == null)?"<null>":this.lmodCode));
        sb.append(',');
        sb.append("keySeqno");
        sb.append('=');
        sb.append(((this.keySeqno == null)?"<null>":this.keySeqno));
        sb.append(',');
        sb.append("termCodeEnd");
        sb.append('=');
        sb.append(((this.termCodeEnd == null)?"<null>":this.termCodeEnd));
        sb.append(',');
        sb.append("termCodeCtlg");
        sb.append('=');
        sb.append(((this.termCodeCtlg == null)?"<null>":this.termCodeCtlg));
        sb.append(',');
        sb.append("priorityNo");
        sb.append('=');
        sb.append(((this.priorityNo == null)?"<null>":this.priorityNo));
        sb.append(',');
        sb.append("gappSeqno");
        sb.append('=');
        sb.append(((this.gappSeqno == null)?"<null>":this.gappSeqno));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("currentInd");
        sb.append('=');
        sb.append(((this.currentInd == null)?"<null>":this.currentInd));
        sb.append(',');
        sb.append("sorlfosCactCode");
        sb.append('=');
        sb.append(((this.sorlfosCactCode == null)?"<null>":this.sorlfosCactCode));
        sb.append(',');
        sb.append("cstsCode");
        sb.append('=');
        sb.append(((this.cstsCode == null)?"<null>":this.cstsCode));
        sb.append(',');
        sb.append("sorlfosTermCode");
        sb.append('=');
        sb.append(((this.sorlfosTermCode == null)?"<null>":this.sorlfosTermCode));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("sorlfosPriorityNo");
        sb.append('=');
        sb.append(((this.sorlfosPriorityNo == null)?"<null>":this.sorlfosPriorityNo));
        sb.append(',');
        sb.append("sorlfosTermCodeCtlg");
        sb.append('=');
        sb.append(((this.sorlfosTermCodeCtlg == null)?"<null>":this.sorlfosTermCodeCtlg));
        sb.append(',');
        sb.append("sorlfosTermCodeEnd");
        sb.append('=');
        sb.append(((this.sorlfosTermCodeEnd == null)?"<null>":this.sorlfosTermCodeEnd));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("sorlfosStartDate");
        sb.append('=');
        sb.append(((this.sorlfosStartDate == null)?"<null>":this.sorlfosStartDate));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("sorlfosEndDate");
        sb.append('=');
        sb.append(((this.sorlfosEndDate == null)?"<null>":this.sorlfosEndDate));
        sb.append(',');
        sb.append("majrCodeAttach");
        sb.append('=');
        sb.append(((this.majrCodeAttach == null)?"<null>":this.majrCodeAttach));
        sb.append(',');
        sb.append("lfosRolledInd");
        sb.append('=');
        sb.append(((this.lfosRolledInd == null)?"<null>":this.lfosRolledInd));
        sb.append(',');
        sb.append("tmstCode");
        sb.append('=');
        sb.append(((this.tmstCode == null)?"<null>":this.tmstCode));
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
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.sorlfosTermCode == null)? 0 :this.sorlfosTermCode.hashCode()));
        result = ((result* 31)+((this.sorlfosEndDate == null)? 0 :this.sorlfosEndDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.cstsCode == null)? 0 :this.cstsCode.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.cactCode == null)? 0 :this.cactCode.hashCode()));
        result = ((result* 31)+((this.majrCodeAttach == null)? 0 :this.majrCodeAttach.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sorlfosCactCode == null)? 0 :this.sorlfosCactCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.currentInd == null)? 0 :this.currentInd.hashCode()));
        result = ((result* 31)+((this.lmodCode == null)? 0 :this.lmodCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.sorlfosStartDate == null)? 0 :this.sorlfosStartDate.hashCode()));
        result = ((result* 31)+((this.lfosRolledInd == null)? 0 :this.lfosRolledInd.hashCode()));
        result = ((result* 31)+((this.gappSeqno == null)? 0 :this.gappSeqno.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.sORLCURCurrentInd == null)? 0 :this.sORLCURCurrentInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.priorityNo == null)? 0 :this.priorityNo.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.termCodeCtlg == null)? 0 :this.termCodeCtlg.hashCode()));
        result = ((result* 31)+((this.sorlfosTermCodeEnd == null)? 0 :this.sorlfosTermCodeEnd.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.tmstCode == null)? 0 :this.tmstCode.hashCode()));
        result = ((result* 31)+((this.termCodeEnd == null)? 0 :this.termCodeEnd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.keySeqno == null)? 0 :this.keySeqno.hashCode()));
        result = ((result* 31)+((this.sorlfosPriorityNo == null)? 0 :this.sorlfosPriorityNo.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationCurricula100QapiPost) == false) {
            return false;
        }
        AdmissionsApplicationCurricula100QapiPost rhs = ((AdmissionsApplicationCurricula100QapiPost) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd)))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.sorlfosTermCodeCtlg == rhs.sorlfosTermCodeCtlg)||((this.sorlfosTermCodeCtlg!= null)&&this.sorlfosTermCodeCtlg.equals(rhs.sorlfosTermCodeCtlg))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.sorlfosTermCode == rhs.sorlfosTermCode)||((this.sorlfosTermCode!= null)&&this.sorlfosTermCode.equals(rhs.sorlfosTermCode))))&&((this.sorlfosEndDate == rhs.sorlfosEndDate)||((this.sorlfosEndDate!= null)&&this.sorlfosEndDate.equals(rhs.sorlfosEndDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.cstsCode == rhs.cstsCode)||((this.cstsCode!= null)&&this.cstsCode.equals(rhs.cstsCode))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.cactCode == rhs.cactCode)||((this.cactCode!= null)&&this.cactCode.equals(rhs.cactCode))))&&((this.majrCodeAttach == rhs.majrCodeAttach)||((this.majrCodeAttach!= null)&&this.majrCodeAttach.equals(rhs.majrCodeAttach))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sorlfosCactCode == rhs.sorlfosCactCode)||((this.sorlfosCactCode!= null)&&this.sorlfosCactCode.equals(rhs.sorlfosCactCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.currentInd == rhs.currentInd)||((this.currentInd!= null)&&this.currentInd.equals(rhs.currentInd))))&&((this.lmodCode == rhs.lmodCode)||((this.lmodCode!= null)&&this.lmodCode.equals(rhs.lmodCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.sorlfosStartDate == rhs.sorlfosStartDate)||((this.sorlfosStartDate!= null)&&this.sorlfosStartDate.equals(rhs.sorlfosStartDate))))&&((this.lfosRolledInd == rhs.lfosRolledInd)||((this.lfosRolledInd!= null)&&this.lfosRolledInd.equals(rhs.lfosRolledInd))))&&((this.gappSeqno == rhs.gappSeqno)||((this.gappSeqno!= null)&&this.gappSeqno.equals(rhs.gappSeqno))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.sORLCURCurrentInd == rhs.sORLCURCurrentInd)||((this.sORLCURCurrentInd!= null)&&this.sORLCURCurrentInd.equals(rhs.sORLCURCurrentInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.priorityNo == rhs.priorityNo)||((this.priorityNo!= null)&&this.priorityNo.equals(rhs.priorityNo))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.termCodeCtlg == rhs.termCodeCtlg)||((this.termCodeCtlg!= null)&&this.termCodeCtlg.equals(rhs.termCodeCtlg))))&&((this.sorlfosTermCodeEnd == rhs.sorlfosTermCodeEnd)||((this.sorlfosTermCodeEnd!= null)&&this.sorlfosTermCodeEnd.equals(rhs.sorlfosTermCodeEnd))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.tmstCode == rhs.tmstCode)||((this.tmstCode!= null)&&this.tmstCode.equals(rhs.tmstCode))))&&((this.termCodeEnd == rhs.termCodeEnd)||((this.termCodeEnd!= null)&&this.termCodeEnd.equals(rhs.termCodeEnd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.keySeqno == rhs.keySeqno)||((this.keySeqno!= null)&&this.keySeqno.equals(rhs.keySeqno))))&&((this.sorlfosPriorityNo == rhs.sorlfosPriorityNo)||((this.sorlfosPriorityNo!= null)&&this.sorlfosPriorityNo.equals(rhs.sorlfosPriorityNo))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
