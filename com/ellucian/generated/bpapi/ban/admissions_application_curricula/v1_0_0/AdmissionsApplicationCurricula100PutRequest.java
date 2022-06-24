
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
    "criteria.stvadmtDesc",
    "criteria.termCodeEntryDesc",
    "criteria.decMaintIndDesc",
    "criteria.stvsiteDesc",
    "criteria.applNo",
    "criteria.stvresdDesc",
    "criteria.sarappdMaintInd",
    "criteria.stvapstDesc",
    "criteria.recruiterAppl",
    "apstCode",
    "apstDate",
    "criteria.stvstypDesc",
    "criteria.sarappdApdcDate",
    "admtCode",
    "criteria.sarappdApdcCode",
    "criteria.reqDocInd",
    "criteria.resdCode",
    "criteria.siteCode",
    "criteria.maintInd",
    "id",
    "criteria.fullPartInd",
    "fullPartInd",
    "siteCode",
    "criteria.admtCode",
    "criteria.stvapdcDesc",
    "kbentryTermCode",
    "criteria.apstCode",
    "criteria.apstDate",
    "criteria.stypCode",
    "resdCode",
    "criteria.applPreference",
    "criteria.applDate",
    "applPreference",
    "stypCode",
    "criteria.termCodeEntry",
    "criteria.statMaintIndDesc"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationCurricula100PutRequest {

    @JsonProperty("criteria.stvadmtDesc")
    private String criteriaStvadmtDesc;
    @JsonProperty("criteria.termCodeEntryDesc")
    private String criteriaTermCodeEntryDesc;
    @JsonProperty("criteria.decMaintIndDesc")
    private String criteriaDecMaintIndDesc;
    @JsonProperty("criteria.stvsiteDesc")
    private String criteriaStvsiteDesc;
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
    @JsonProperty("criteria.recruiterAppl")
    private String criteriaRecruiterAppl;
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
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String admtCode;
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
    private String id;
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
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_FULL_PART_IND")
    private String fullPartInd;
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
    private String kbentryTermCode;
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
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
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
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * 
     */
    @JsonProperty("criteria.applDate")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_DATE")
    private Date criteriaApplDate;
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
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEntry")
    @JsonPropertyDescription("Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeEntry;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaStvadmtDesc(String criteriaStvadmtDesc) {
        this.criteriaStvadmtDesc = criteriaStvadmtDesc;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaTermCodeEntryDesc(String criteriaTermCodeEntryDesc) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaDecMaintIndDesc(String criteriaDecMaintIndDesc) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaStvsiteDesc(String criteriaStvsiteDesc) {
        this.criteriaStvsiteDesc = criteriaStvsiteDesc;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaApplNo(Double criteriaApplNo) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaStvresdDesc(String criteriaStvresdDesc) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaSarappdMaintInd(String criteriaSarappdMaintInd) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaStvapstDesc(String criteriaStvapstDesc) {
        this.criteriaStvapstDesc = criteriaStvapstDesc;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaRecruiterAppl(String criteriaRecruiterAppl) {
        this.criteriaRecruiterAppl = criteriaRecruiterAppl;
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

    public AdmissionsApplicationCurricula100PutRequest withApstCode(String apstCode) {
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

    public AdmissionsApplicationCurricula100PutRequest withApstDate(Date apstDate) {
        this.apstDate = apstDate;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaStvstypDesc(String criteriaStvstypDesc) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaSarappdApdcDate(Date criteriaSarappdApdcDate) {
        this.criteriaSarappdApdcDate = criteriaSarappdApdcDate;
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

    public AdmissionsApplicationCurricula100PutRequest withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaSarappdApdcCode(String criteriaSarappdApdcCode) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaReqDocInd(String criteriaReqDocInd) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaResdCode(String criteriaResdCode) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaSiteCode(String criteriaSiteCode) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaMaintInd(String criteriaMaintInd) {
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

    public AdmissionsApplicationCurricula100PutRequest withId(String id) {
        this.id = id;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaFullPartInd(String criteriaFullPartInd) {
        this.criteriaFullPartInd = criteriaFullPartInd;
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

    public AdmissionsApplicationCurricula100PutRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
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

    public AdmissionsApplicationCurricula100PutRequest withSiteCode(String siteCode) {
        this.siteCode = siteCode;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaAdmtCode(String criteriaAdmtCode) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaStvapdcDesc(String criteriaStvapdcDesc) {
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

    public AdmissionsApplicationCurricula100PutRequest withKbentryTermCode(String kbentryTermCode) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaApstCode(String criteriaApstCode) {
        this.criteriaApstCode = criteriaApstCode;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaApstDate(Date criteriaApstDate) {
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaStypCode(String criteriaStypCode) {
        this.criteriaStypCode = criteriaStypCode;
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

    public AdmissionsApplicationCurricula100PutRequest withResdCode(String resdCode) {
        this.resdCode = resdCode;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaApplPreference(Double criteriaApplPreference) {
        this.criteriaApplPreference = criteriaApplPreference;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaApplDate(Date criteriaApplDate) {
        this.criteriaApplDate = criteriaApplDate;
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

    public AdmissionsApplicationCurricula100PutRequest withApplPreference(Double applPreference) {
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

    public AdmissionsApplicationCurricula100PutRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaTermCodeEntry(String criteriaTermCodeEntry) {
        this.criteriaTermCodeEntry = criteriaTermCodeEntry;
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

    public AdmissionsApplicationCurricula100PutRequest withCriteriaStatMaintIndDesc(String criteriaStatMaintIndDesc) {
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

    public AdmissionsApplicationCurricula100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationCurricula100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaStvadmtDesc");
        sb.append('=');
        sb.append(((this.criteriaStvadmtDesc == null)?"<null>":this.criteriaStvadmtDesc));
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
        sb.append("criteriaRecruiterAppl");
        sb.append('=');
        sb.append(((this.criteriaRecruiterAppl == null)?"<null>":this.criteriaRecruiterAppl));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("apstDate");
        sb.append('=');
        sb.append(((this.apstDate == null)?"<null>":this.apstDate));
        sb.append(',');
        sb.append("criteriaStvstypDesc");
        sb.append('=');
        sb.append(((this.criteriaStvstypDesc == null)?"<null>":this.criteriaStvstypDesc));
        sb.append(',');
        sb.append("criteriaSarappdApdcDate");
        sb.append('=');
        sb.append(((this.criteriaSarappdApdcDate == null)?"<null>":this.criteriaSarappdApdcDate));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
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
        sb.append("criteriaFullPartInd");
        sb.append('=');
        sb.append(((this.criteriaFullPartInd == null)?"<null>":this.criteriaFullPartInd));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
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
        sb.append("criteriaApstDate");
        sb.append('=');
        sb.append(((this.criteriaApstDate == null)?"<null>":this.criteriaApstDate));
        sb.append(',');
        sb.append("criteriaStypCode");
        sb.append('=');
        sb.append(((this.criteriaStypCode == null)?"<null>":this.criteriaStypCode));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("criteriaApplPreference");
        sb.append('=');
        sb.append(((this.criteriaApplPreference == null)?"<null>":this.criteriaApplPreference));
        sb.append(',');
        sb.append("criteriaApplDate");
        sb.append('=');
        sb.append(((this.criteriaApplDate == null)?"<null>":this.criteriaApplDate));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("criteriaTermCodeEntry");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEntry == null)?"<null>":this.criteriaTermCodeEntry));
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
        result = ((result* 31)+((this.criteriaTermCodeEntryDesc == null)? 0 :this.criteriaTermCodeEntryDesc.hashCode()));
        result = ((result* 31)+((this.criteriaStvstypDesc == null)? 0 :this.criteriaStvstypDesc.hashCode()));
        result = ((result* 31)+((this.criteriaSarappdApdcDate == null)? 0 :this.criteriaSarappdApdcDate.hashCode()));
        result = ((result* 31)+((this.criteriaStvapdcDesc == null)? 0 :this.criteriaStvapdcDesc.hashCode()));
        result = ((result* 31)+((this.criteriaRecruiterAppl == null)? 0 :this.criteriaRecruiterAppl.hashCode()));
        result = ((result* 31)+((this.criteriaApstCode == null)? 0 :this.criteriaApstCode.hashCode()));
        result = ((result* 31)+((this.criteriaApstDate == null)? 0 :this.criteriaApstDate.hashCode()));
        result = ((result* 31)+((this.criteriaStypCode == null)? 0 :this.criteriaStypCode.hashCode()));
        result = ((result* 31)+((this.criteriaSarappdApdcCode == null)? 0 :this.criteriaSarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.criteriaStvapstDesc == null)? 0 :this.criteriaStvapstDesc.hashCode()));
        result = ((result* 31)+((this.apstDate == null)? 0 :this.apstDate.hashCode()));
        result = ((result* 31)+((this.criteriaSiteCode == null)? 0 :this.criteriaSiteCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.criteriaFullPartInd == null)? 0 :this.criteriaFullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaResdCode == null)? 0 :this.criteriaResdCode.hashCode()));
        result = ((result* 31)+((this.criteriaMaintInd == null)? 0 :this.criteriaMaintInd.hashCode()));
        result = ((result* 31)+((this.criteriaAdmtCode == null)? 0 :this.criteriaAdmtCode.hashCode()));
        result = ((result* 31)+((this.criteriaSarappdMaintInd == null)? 0 :this.criteriaSarappdMaintInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaApplPreference == null)? 0 :this.criteriaApplPreference.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaStatMaintIndDesc == null)? 0 :this.criteriaStatMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEntry == null)? 0 :this.criteriaTermCodeEntry.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.criteriaStvadmtDesc == null)? 0 :this.criteriaStvadmtDesc.hashCode()));
        result = ((result* 31)+((this.criteriaReqDocInd == null)? 0 :this.criteriaReqDocInd.hashCode()));
        result = ((result* 31)+((this.criteriaStvresdDesc == null)? 0 :this.criteriaStvresdDesc.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.criteriaApplNo == null)? 0 :this.criteriaApplNo.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDecMaintIndDesc == null)? 0 :this.criteriaDecMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.criteriaStvsiteDesc == null)? 0 :this.criteriaStvsiteDesc.hashCode()));
        result = ((result* 31)+((this.criteriaApplDate == null)? 0 :this.criteriaApplDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationCurricula100PutRequest) == false) {
            return false;
        }
        AdmissionsApplicationCurricula100PutRequest rhs = ((AdmissionsApplicationCurricula100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((this.criteriaTermCodeEntryDesc == rhs.criteriaTermCodeEntryDesc)||((this.criteriaTermCodeEntryDesc!= null)&&this.criteriaTermCodeEntryDesc.equals(rhs.criteriaTermCodeEntryDesc)))&&((this.criteriaStvstypDesc == rhs.criteriaStvstypDesc)||((this.criteriaStvstypDesc!= null)&&this.criteriaStvstypDesc.equals(rhs.criteriaStvstypDesc))))&&((this.criteriaSarappdApdcDate == rhs.criteriaSarappdApdcDate)||((this.criteriaSarappdApdcDate!= null)&&this.criteriaSarappdApdcDate.equals(rhs.criteriaSarappdApdcDate))))&&((this.criteriaStvapdcDesc == rhs.criteriaStvapdcDesc)||((this.criteriaStvapdcDesc!= null)&&this.criteriaStvapdcDesc.equals(rhs.criteriaStvapdcDesc))))&&((this.criteriaRecruiterAppl == rhs.criteriaRecruiterAppl)||((this.criteriaRecruiterAppl!= null)&&this.criteriaRecruiterAppl.equals(rhs.criteriaRecruiterAppl))))&&((this.criteriaApstCode == rhs.criteriaApstCode)||((this.criteriaApstCode!= null)&&this.criteriaApstCode.equals(rhs.criteriaApstCode))))&&((this.criteriaApstDate == rhs.criteriaApstDate)||((this.criteriaApstDate!= null)&&this.criteriaApstDate.equals(rhs.criteriaApstDate))))&&((this.criteriaStypCode == rhs.criteriaStypCode)||((this.criteriaStypCode!= null)&&this.criteriaStypCode.equals(rhs.criteriaStypCode))))&&((this.criteriaSarappdApdcCode == rhs.criteriaSarappdApdcCode)||((this.criteriaSarappdApdcCode!= null)&&this.criteriaSarappdApdcCode.equals(rhs.criteriaSarappdApdcCode))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.criteriaStvapstDesc == rhs.criteriaStvapstDesc)||((this.criteriaStvapstDesc!= null)&&this.criteriaStvapstDesc.equals(rhs.criteriaStvapstDesc))))&&((this.apstDate == rhs.apstDate)||((this.apstDate!= null)&&this.apstDate.equals(rhs.apstDate))))&&((this.criteriaSiteCode == rhs.criteriaSiteCode)||((this.criteriaSiteCode!= null)&&this.criteriaSiteCode.equals(rhs.criteriaSiteCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.criteriaFullPartInd == rhs.criteriaFullPartInd)||((this.criteriaFullPartInd!= null)&&this.criteriaFullPartInd.equals(rhs.criteriaFullPartInd))))&&((this.criteriaResdCode == rhs.criteriaResdCode)||((this.criteriaResdCode!= null)&&this.criteriaResdCode.equals(rhs.criteriaResdCode))))&&((this.criteriaMaintInd == rhs.criteriaMaintInd)||((this.criteriaMaintInd!= null)&&this.criteriaMaintInd.equals(rhs.criteriaMaintInd))))&&((this.criteriaAdmtCode == rhs.criteriaAdmtCode)||((this.criteriaAdmtCode!= null)&&this.criteriaAdmtCode.equals(rhs.criteriaAdmtCode))))&&((this.criteriaSarappdMaintInd == rhs.criteriaSarappdMaintInd)||((this.criteriaSarappdMaintInd!= null)&&this.criteriaSarappdMaintInd.equals(rhs.criteriaSarappdMaintInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaApplPreference == rhs.criteriaApplPreference)||((this.criteriaApplPreference!= null)&&this.criteriaApplPreference.equals(rhs.criteriaApplPreference))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.criteriaStatMaintIndDesc == rhs.criteriaStatMaintIndDesc)||((this.criteriaStatMaintIndDesc!= null)&&this.criteriaStatMaintIndDesc.equals(rhs.criteriaStatMaintIndDesc))))&&((this.criteriaTermCodeEntry == rhs.criteriaTermCodeEntry)||((this.criteriaTermCodeEntry!= null)&&this.criteriaTermCodeEntry.equals(rhs.criteriaTermCodeEntry))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.criteriaStvadmtDesc == rhs.criteriaStvadmtDesc)||((this.criteriaStvadmtDesc!= null)&&this.criteriaStvadmtDesc.equals(rhs.criteriaStvadmtDesc))))&&((this.criteriaReqDocInd == rhs.criteriaReqDocInd)||((this.criteriaReqDocInd!= null)&&this.criteriaReqDocInd.equals(rhs.criteriaReqDocInd))))&&((this.criteriaStvresdDesc == rhs.criteriaStvresdDesc)||((this.criteriaStvresdDesc!= null)&&this.criteriaStvresdDesc.equals(rhs.criteriaStvresdDesc))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.criteriaApplNo == rhs.criteriaApplNo)||((this.criteriaApplNo!= null)&&this.criteriaApplNo.equals(rhs.criteriaApplNo))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDecMaintIndDesc == rhs.criteriaDecMaintIndDesc)||((this.criteriaDecMaintIndDesc!= null)&&this.criteriaDecMaintIndDesc.equals(rhs.criteriaDecMaintIndDesc))))&&((this.criteriaStvsiteDesc == rhs.criteriaStvsiteDesc)||((this.criteriaStvsiteDesc!= null)&&this.criteriaStvsiteDesc.equals(rhs.criteriaStvsiteDesc))))&&((this.criteriaApplDate == rhs.criteriaApplDate)||((this.criteriaApplDate!= null)&&this.criteriaApplDate.equals(rhs.criteriaApplDate))));
    }

}
