
package com.ellucian.generated.bpapi.ban.admissions_decision_prior_college_and_degree_review.v1_0_0;

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
    "sordegrAttendFrom",
    "reqDocInd",
    "sordegrCollCode",
    "applDate",
    "keyblocTermCode",
    "sorpcolSbgiCode",
    "sordegrHonrCode",
    "apstCode",
    "sessCode",
    "admtCode",
    "sordegrHoursTransferred",
    "sordegrGpaTransDisplay",
    "id",
    "termCodeEntry",
    "fullPartInd",
    "sordegrDegcYear",
    "sorpcolTransRevDate",
    "applNo",
    "resdCode",
    "sarappdApdcCode",
    "sorpcolOfficialTrans",
    "applPreference",
    "sordegrDegcCode",
    "sordegrDegcDate",
    "sordegrAttendTo",
    "stypCode",
    "sorpcolTransRecvDate"
})
@Generated("jsonschema2pojo")
public class AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest {

    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("sordegrAttendFrom")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_FROM")
    private Date sordegrAttendFrom;
    @JsonProperty("reqDocInd")
    private String reqDocInd;
    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sordegrCollCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String sordegrCollCode;
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
     * College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sorpcolSbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String sorpcolSbgiCode;
    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("sordegrHonrCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr")
    private String sordegrHonrCode;
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
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("sordegrHoursTransferred")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HOURS_TRANSFERRED")
    private Double sordegrHoursTransferred;
    /**
     * GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("sordegrGpaTransDisplay")
    private Double sordegrGpaTransDisplay;
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
    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("sordegrDegcYear")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_YEAR")
    private String sordegrDegcYear;
    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("sorpcolTransRevDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_REV_DATE")
    private Date sorpcolTransRevDate;
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
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("sorpcolOfficialTrans")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_OFFICIAL_TRANS")
    private String sorpcolOfficialTrans;
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
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sordegrDegcCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String sordegrDegcCode;
    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("sordegrDegcDate")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_DATE")
    private Date sordegrDegcDate;
    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("sordegrAttendTo")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_TO")
    private Date sordegrAttendTo;
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
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("sorpcolTransRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_RECV_DATE")
    private Date sorpcolTransRecvDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("sordegrAttendFrom")
    public Date getSordegrAttendFrom() {
        return sordegrAttendFrom;
    }

    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("sordegrAttendFrom")
    public void setSordegrAttendFrom(Date sordegrAttendFrom) {
        this.sordegrAttendFrom = sordegrAttendFrom;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSordegrAttendFrom(Date sordegrAttendFrom) {
        this.sordegrAttendFrom = sordegrAttendFrom;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sordegrCollCode")
    public String getSordegrCollCode() {
        return sordegrCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sordegrCollCode")
    public void setSordegrCollCode(String sordegrCollCode) {
        this.sordegrCollCode = sordegrCollCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSordegrCollCode(String sordegrCollCode) {
        this.sordegrCollCode = sordegrCollCode;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withApplDate(Date applDate) {
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sorpcolSbgiCode")
    public String getSorpcolSbgiCode() {
        return sorpcolSbgiCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sorpcolSbgiCode")
    public void setSorpcolSbgiCode(String sorpcolSbgiCode) {
        this.sorpcolSbgiCode = sorpcolSbgiCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSorpcolSbgiCode(String sorpcolSbgiCode) {
        this.sorpcolSbgiCode = sorpcolSbgiCode;
        return this;
    }

    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("sordegrHonrCode")
    public String getSordegrHonrCode() {
        return sordegrHonrCode;
    }

    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("sordegrHonrCode")
    public void setSordegrHonrCode(String sordegrHonrCode) {
        this.sordegrHonrCode = sordegrHonrCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSordegrHonrCode(String sordegrHonrCode) {
        this.sordegrHonrCode = sordegrHonrCode;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withApstCode(String apstCode) {
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSessCode(String sessCode) {
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("sordegrHoursTransferred")
    public Double getSordegrHoursTransferred() {
        return sordegrHoursTransferred;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("sordegrHoursTransferred")
    public void setSordegrHoursTransferred(Double sordegrHoursTransferred) {
        this.sordegrHoursTransferred = sordegrHoursTransferred;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSordegrHoursTransferred(Double sordegrHoursTransferred) {
        this.sordegrHoursTransferred = sordegrHoursTransferred;
        return this;
    }

    /**
     * GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("sordegrGpaTransDisplay")
    public Double getSordegrGpaTransDisplay() {
        return sordegrGpaTransDisplay;
    }

    /**
     * GPA
     * <p>
     * 
     * 
     */
    @JsonProperty("sordegrGpaTransDisplay")
    public void setSordegrGpaTransDisplay(Double sordegrGpaTransDisplay) {
        this.sordegrGpaTransDisplay = sordegrGpaTransDisplay;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSordegrGpaTransDisplay(Double sordegrGpaTransDisplay) {
        this.sordegrGpaTransDisplay = sordegrGpaTransDisplay;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withId(String id) {
        this.id = id;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withTermCodeEntry(String termCodeEntry) {
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("sordegrDegcYear")
    public String getSordegrDegcYear() {
        return sordegrDegcYear;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("sordegrDegcYear")
    public void setSordegrDegcYear(String sordegrDegcYear) {
        this.sordegrDegcYear = sordegrDegcYear;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSordegrDegcYear(String sordegrDegcYear) {
        this.sordegrDegcYear = sordegrDegcYear;
        return this;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("sorpcolTransRevDate")
    public Date getSorpcolTransRevDate() {
        return sorpcolTransRevDate;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("sorpcolTransRevDate")
    public void setSorpcolTransRevDate(Date sorpcolTransRevDate) {
        this.sorpcolTransRevDate = sorpcolTransRevDate;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSorpcolTransRevDate(Date sorpcolTransRevDate) {
        this.sorpcolTransRevDate = sorpcolTransRevDate;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withApplNo(Double applNo) {
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withResdCode(String resdCode) {
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("sorpcolOfficialTrans")
    public String getSorpcolOfficialTrans() {
        return sorpcolOfficialTrans;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("sorpcolOfficialTrans")
    public void setSorpcolOfficialTrans(String sorpcolOfficialTrans) {
        this.sorpcolOfficialTrans = sorpcolOfficialTrans;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSorpcolOfficialTrans(String sorpcolOfficialTrans) {
        this.sorpcolOfficialTrans = sorpcolOfficialTrans;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withApplPreference(Double applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sordegrDegcCode")
    public String getSordegrDegcCode() {
        return sordegrDegcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sordegrDegcCode")
    public void setSordegrDegcCode(String sordegrDegcCode) {
        this.sordegrDegcCode = sordegrDegcCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSordegrDegcCode(String sordegrDegcCode) {
        this.sordegrDegcCode = sordegrDegcCode;
        return this;
    }

    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("sordegrDegcDate")
    public Date getSordegrDegcDate() {
        return sordegrDegcDate;
    }

    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("sordegrDegcDate")
    public void setSordegrDegcDate(Date sordegrDegcDate) {
        this.sordegrDegcDate = sordegrDegcDate;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSordegrDegcDate(Date sordegrDegcDate) {
        this.sordegrDegcDate = sordegrDegcDate;
        return this;
    }

    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("sordegrAttendTo")
    public Date getSordegrAttendTo() {
        return sordegrAttendTo;
    }

    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("sordegrAttendTo")
    public void setSordegrAttendTo(Date sordegrAttendTo) {
        this.sordegrAttendTo = sordegrAttendTo;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSordegrAttendTo(Date sordegrAttendTo) {
        this.sordegrAttendTo = sordegrAttendTo;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("sorpcolTransRecvDate")
    public Date getSorpcolTransRecvDate() {
        return sorpcolTransRecvDate;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("sorpcolTransRecvDate")
    public void setSorpcolTransRecvDate(Date sorpcolTransRecvDate) {
        this.sorpcolTransRecvDate = sorpcolTransRecvDate;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withSorpcolTransRecvDate(Date sorpcolTransRecvDate) {
        this.sorpcolTransRecvDate = sorpcolTransRecvDate;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sordegrAttendFrom");
        sb.append('=');
        sb.append(((this.sordegrAttendFrom == null)?"<null>":this.sordegrAttendFrom));
        sb.append(',');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("sordegrCollCode");
        sb.append('=');
        sb.append(((this.sordegrCollCode == null)?"<null>":this.sordegrCollCode));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("sorpcolSbgiCode");
        sb.append('=');
        sb.append(((this.sorpcolSbgiCode == null)?"<null>":this.sorpcolSbgiCode));
        sb.append(',');
        sb.append("sordegrHonrCode");
        sb.append('=');
        sb.append(((this.sordegrHonrCode == null)?"<null>":this.sordegrHonrCode));
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
        sb.append("sordegrHoursTransferred");
        sb.append('=');
        sb.append(((this.sordegrHoursTransferred == null)?"<null>":this.sordegrHoursTransferred));
        sb.append(',');
        sb.append("sordegrGpaTransDisplay");
        sb.append('=');
        sb.append(((this.sordegrGpaTransDisplay == null)?"<null>":this.sordegrGpaTransDisplay));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("sordegrDegcYear");
        sb.append('=');
        sb.append(((this.sordegrDegcYear == null)?"<null>":this.sordegrDegcYear));
        sb.append(',');
        sb.append("sorpcolTransRevDate");
        sb.append('=');
        sb.append(((this.sorpcolTransRevDate == null)?"<null>":this.sorpcolTransRevDate));
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
        sb.append("sorpcolOfficialTrans");
        sb.append('=');
        sb.append(((this.sorpcolOfficialTrans == null)?"<null>":this.sorpcolOfficialTrans));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("sordegrDegcCode");
        sb.append('=');
        sb.append(((this.sordegrDegcCode == null)?"<null>":this.sordegrDegcCode));
        sb.append(',');
        sb.append("sordegrDegcDate");
        sb.append('=');
        sb.append(((this.sordegrDegcDate == null)?"<null>":this.sordegrDegcDate));
        sb.append(',');
        sb.append("sordegrAttendTo");
        sb.append('=');
        sb.append(((this.sordegrAttendTo == null)?"<null>":this.sordegrAttendTo));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("sorpcolTransRecvDate");
        sb.append('=');
        sb.append(((this.sorpcolTransRecvDate == null)?"<null>":this.sorpcolTransRecvDate));
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
        result = ((result* 31)+((this.sordegrAttendFrom == null)? 0 :this.sordegrAttendFrom.hashCode()));
        result = ((result* 31)+((this.reqDocInd == null)? 0 :this.reqDocInd.hashCode()));
        result = ((result* 31)+((this.sordegrCollCode == null)? 0 :this.sordegrCollCode.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.sorpcolSbgiCode == null)? 0 :this.sorpcolSbgiCode.hashCode()));
        result = ((result* 31)+((this.sordegrHonrCode == null)? 0 :this.sordegrHonrCode.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.sordegrHoursTransferred == null)? 0 :this.sordegrHoursTransferred.hashCode()));
        result = ((result* 31)+((this.sordegrGpaTransDisplay == null)? 0 :this.sordegrGpaTransDisplay.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.sordegrDegcYear == null)? 0 :this.sordegrDegcYear.hashCode()));
        result = ((result* 31)+((this.sorpcolTransRevDate == null)? 0 :this.sorpcolTransRevDate.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.sorpcolOfficialTrans == null)? 0 :this.sorpcolOfficialTrans.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.sordegrDegcCode == null)? 0 :this.sordegrDegcCode.hashCode()));
        result = ((result* 31)+((this.sordegrDegcDate == null)? 0 :this.sordegrDegcDate.hashCode()));
        result = ((result* 31)+((this.sordegrAttendTo == null)? 0 :this.sordegrAttendTo.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorpcolTransRecvDate == null)? 0 :this.sorpcolTransRecvDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest) == false) {
            return false;
        }
        AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest rhs = ((AdmissionsDecisionPriorCollegeAndDegreeReview100GetRequest) other);
        return (((((((((((((((((((((((((((((this.sordegrAttendFrom == rhs.sordegrAttendFrom)||((this.sordegrAttendFrom!= null)&&this.sordegrAttendFrom.equals(rhs.sordegrAttendFrom)))&&((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd))))&&((this.sordegrCollCode == rhs.sordegrCollCode)||((this.sordegrCollCode!= null)&&this.sordegrCollCode.equals(rhs.sordegrCollCode))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.sorpcolSbgiCode == rhs.sorpcolSbgiCode)||((this.sorpcolSbgiCode!= null)&&this.sorpcolSbgiCode.equals(rhs.sorpcolSbgiCode))))&&((this.sordegrHonrCode == rhs.sordegrHonrCode)||((this.sordegrHonrCode!= null)&&this.sordegrHonrCode.equals(rhs.sordegrHonrCode))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.sordegrHoursTransferred == rhs.sordegrHoursTransferred)||((this.sordegrHoursTransferred!= null)&&this.sordegrHoursTransferred.equals(rhs.sordegrHoursTransferred))))&&((this.sordegrGpaTransDisplay == rhs.sordegrGpaTransDisplay)||((this.sordegrGpaTransDisplay!= null)&&this.sordegrGpaTransDisplay.equals(rhs.sordegrGpaTransDisplay))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.sordegrDegcYear == rhs.sordegrDegcYear)||((this.sordegrDegcYear!= null)&&this.sordegrDegcYear.equals(rhs.sordegrDegcYear))))&&((this.sorpcolTransRevDate == rhs.sorpcolTransRevDate)||((this.sorpcolTransRevDate!= null)&&this.sorpcolTransRevDate.equals(rhs.sorpcolTransRevDate))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.sorpcolOfficialTrans == rhs.sorpcolOfficialTrans)||((this.sorpcolOfficialTrans!= null)&&this.sorpcolOfficialTrans.equals(rhs.sorpcolOfficialTrans))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.sordegrDegcCode == rhs.sordegrDegcCode)||((this.sordegrDegcCode!= null)&&this.sordegrDegcCode.equals(rhs.sordegrDegcCode))))&&((this.sordegrDegcDate == rhs.sordegrDegcDate)||((this.sordegrDegcDate!= null)&&this.sordegrDegcDate.equals(rhs.sordegrDegcDate))))&&((this.sordegrAttendTo == rhs.sordegrAttendTo)||((this.sordegrAttendTo!= null)&&this.sordegrAttendTo.equals(rhs.sordegrAttendTo))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorpcolTransRecvDate == rhs.sorpcolTransRecvDate)||((this.sorpcolTransRecvDate!= null)&&this.sorpcolTransRecvDate.equals(rhs.sorpcolTransRecvDate))));
    }

}
