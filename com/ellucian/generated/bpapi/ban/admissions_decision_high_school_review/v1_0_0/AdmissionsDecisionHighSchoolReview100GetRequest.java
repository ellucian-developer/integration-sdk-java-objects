
package com.ellucian.generated.bpapi.ban.admissions_decision_high_school_review.v1_0_0;

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
    "dplmCode",
    "reqDocInd",
    "collPrepInd",
    "applDate",
    "keyblocTermCode",
    "subjGpa",
    "applNo",
    "resdCode",
    "sarappdApdcCode",
    "sbgiCode",
    "sbjcCode",
    "subjYears",
    "apstCode",
    "sessCode",
    "admtCode",
    "percentile",
    "graduationDate",
    "grade",
    "applPreference",
    "gpa",
    "id",
    "stypCode",
    "termCodeEntry",
    "fullPartInd"
})
@Generated("jsonschema2pojo")
public class AdmissionsDecisionHighSchoolReview100GetRequest {

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("dplmCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm")
    private String dplmCode;
    @JsonProperty("reqDocInd")
    private String reqDocInd;
    /**
     * College Preparatory
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("collPrepInd")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_COLL_PREP_IND")
    private String collPrepInd;
    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_DATE")
    private Date applDate;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_GPA")
    private String subjGpa;
    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * (Required)
     * 
     */
    @JsonProperty("applNo")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_NO")
    private Double applNo;
    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * (Required)
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    /**
     * Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapdc")
    private String sarappdApdcCode;
    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String sbgiCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * 
     */
    @JsonProperty("sbjcCode")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc")
    private String sbjcCode;
    /**
     * Years
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_YEARS")
    private Double subjYears;
    /**
     * Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * (Required)
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
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String admtCode;
    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_PERCENTILE")
    private Double percentile;
    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GRADUATION_DATE")
    private Date graduationDate;
    /**
     * Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_GRADE")
    private String grade;
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
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("gpa")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GPA")
    private String gpa;
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
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * (Required)
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * (Required)
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("dplmCode")
    public String getDplmCode() {
        return dplmCode;
    }

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("dplmCode")
    public void setDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
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

    public AdmissionsDecisionHighSchoolReview100GetRequest withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
        return this;
    }

    /**
     * College Preparatory
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("collPrepInd")
    public String getCollPrepInd() {
        return collPrepInd;
    }

    /**
     * College Preparatory
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("collPrepInd")
    public void setCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
        return this;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    public void setApplDate(Date applDate) {
        this.applDate = applDate;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withApplDate(Date applDate) {
        this.applDate = applDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    public String getSubjGpa() {
        return subjGpa;
    }

    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    public void setSubjGpa(String subjGpa) {
        this.subjGpa = subjGpa;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withSubjGpa(String subjGpa) {
        this.subjGpa = subjGpa;
        return this;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("applNo")
    public void setApplNo(Double applNo) {
        this.applNo = applNo;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withApplNo(Double applNo) {
        this.applNo = applNo;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    public String getSarappdApdcCode() {
        return sarappdApdcCode;
    }

    /**
     * Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    public void setSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * 
     */
    @JsonProperty("sbjcCode")
    public String getSbjcCode() {
        return sbjcCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * 
     */
    @JsonProperty("sbjcCode")
    public void setSbjcCode(String sbjcCode) {
        this.sbjcCode = sbjcCode;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withSbjcCode(String sbjcCode) {
        this.sbjcCode = sbjcCode;
        return this;
    }

    /**
     * Years
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    public Double getSubjYears() {
        return subjYears;
    }

    /**
     * Years
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    public void setSubjYears(Double subjYears) {
        this.subjYears = subjYears;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withSubjYears(Double subjYears) {
        this.subjYears = subjYears;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * (Required)
     * 
     */
    @JsonProperty("apstCode")
    public String getApstCode() {
        return apstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * (Required)
     * 
     */
    @JsonProperty("apstCode")
    public void setApstCode(String apstCode) {
        this.apstCode = apstCode;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withApstCode(String apstCode) {
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

    public AdmissionsDecisionHighSchoolReview100GetRequest withSessCode(String sessCode) {
        this.sessCode = sessCode;
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

    public AdmissionsDecisionHighSchoolReview100GetRequest withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public Double getPercentile() {
        return percentile;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public void setPercentile(Double percentile) {
        this.percentile = percentile;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withPercentile(Double percentile) {
        this.percentile = percentile;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    public Date getGraduationDate() {
        return graduationDate;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withGrade(String grade) {
        this.grade = grade;
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

    public AdmissionsDecisionHighSchoolReview100GetRequest withApplPreference(Double applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("gpa")
    public String getGpa() {
        return gpa;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("gpa")
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withGpa(String gpa) {
        this.gpa = gpa;
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

    public AdmissionsDecisionHighSchoolReview100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("termCodeEntry")
    public void setTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
    }

    public AdmissionsDecisionHighSchoolReview100GetRequest withTermCodeEntry(String termCodeEntry) {
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

    public AdmissionsDecisionHighSchoolReview100GetRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
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

    public AdmissionsDecisionHighSchoolReview100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsDecisionHighSchoolReview100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dplmCode");
        sb.append('=');
        sb.append(((this.dplmCode == null)?"<null>":this.dplmCode));
        sb.append(',');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("collPrepInd");
        sb.append('=');
        sb.append(((this.collPrepInd == null)?"<null>":this.collPrepInd));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("subjGpa");
        sb.append('=');
        sb.append(((this.subjGpa == null)?"<null>":this.subjGpa));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("sarappdApdcCode");
        sb.append('=');
        sb.append(((this.sarappdApdcCode == null)?"<null>":this.sarappdApdcCode));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("sbjcCode");
        sb.append('=');
        sb.append(((this.sbjcCode == null)?"<null>":this.sbjcCode));
        sb.append(',');
        sb.append("subjYears");
        sb.append('=');
        sb.append(((this.subjYears == null)?"<null>":this.subjYears));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
        sb.append(',');
        sb.append("graduationDate");
        sb.append('=');
        sb.append(((this.graduationDate == null)?"<null>":this.graduationDate));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("gpa");
        sb.append('=');
        sb.append(((this.gpa == null)?"<null>":this.gpa));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
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
        result = ((result* 31)+((this.dplmCode == null)? 0 :this.dplmCode.hashCode()));
        result = ((result* 31)+((this.reqDocInd == null)? 0 :this.reqDocInd.hashCode()));
        result = ((result* 31)+((this.collPrepInd == null)? 0 :this.collPrepInd.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.subjYears == null)? 0 :this.subjYears.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.gpa == null)? 0 :this.gpa.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.subjGpa == null)? 0 :this.subjGpa.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.sbjcCode == null)? 0 :this.sbjcCode.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.graduationDate == null)? 0 :this.graduationDate.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsDecisionHighSchoolReview100GetRequest) == false) {
            return false;
        }
        AdmissionsDecisionHighSchoolReview100GetRequest rhs = ((AdmissionsDecisionHighSchoolReview100GetRequest) other);
        return ((((((((((((((((((((((((((this.dplmCode == rhs.dplmCode)||((this.dplmCode!= null)&&this.dplmCode.equals(rhs.dplmCode)))&&((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd))))&&((this.collPrepInd == rhs.collPrepInd)||((this.collPrepInd!= null)&&this.collPrepInd.equals(rhs.collPrepInd))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.subjYears == rhs.subjYears)||((this.subjYears!= null)&&this.subjYears.equals(rhs.subjYears))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.gpa == rhs.gpa)||((this.gpa!= null)&&this.gpa.equals(rhs.gpa))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.subjGpa == rhs.subjGpa)||((this.subjGpa!= null)&&this.subjGpa.equals(rhs.subjGpa))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.sbjcCode == rhs.sbjcCode)||((this.sbjcCode!= null)&&this.sbjcCode.equals(rhs.sbjcCode))))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.graduationDate == rhs.graduationDate)||((this.graduationDate!= null)&&this.graduationDate.equals(rhs.graduationDate))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
