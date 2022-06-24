
package com.ellucian.generated.bpapi.ban.course_section_information_copy_crn.v1_0_0;

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
    "ssbsectPrntInd",
    "creditHrs",
    "ssasectCrn",
    "tuiwInd",
    "title",
    "gModCode",
    "schdCode",
    "sessCode",
    "billHrs",
    "voiceAvail",
    "campCode",
    "lecHr",
    "sstsCode",
    "ssasectCrnDefault",
    "intgCde",
    "ptrmStartDate",
    "othHr",
    "contHr",
    "gradableInd",
    "xlstGroup",
    "subjCode",
    "linkIdent",
    "labHr",
    "insmCode",
    "ssasectTermCodeDefault",
    "acctCode",
    "crseNumb",
    "ptrmCode",
    "ssasectTermCode",
    "saprCode",
    "seqNumb",
    "ptrmWeeks",
    "ptrmEndDate"
})
@Generated("jsonschema2pojo")
public class CourseSectionInformationCopyCrn100PutRequest {

    /**
     * Print
     * <p>
     * Lineage reference object : SSBSECT_PRNT_IND
     * 
     */
    @JsonProperty("ssbsectPrntInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PRNT_IND")
    private String ssbsectPrntInd;
    /**
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CREDIT_HRS")
    private Double creditHrs;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private String ssasectCrn;
    /**
     * Tuition and  Fee Waiver
     * <p>
     * Lineage reference object : SSBSECT_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_TUIW_IND")
    private String tuiwInd;
    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("gModCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod")
    private String gModCode;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd
     * (Required)
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd")
    private String schdCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    /**
     * Lineage reference object : SSBSECT_BILL_HRS
     * 
     */
    @JsonProperty("billHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_BILL_HRS")
    private Double billHrs;
    /**
     * Voice Response and Self-Service Available
     * <p>
     * Lineage reference object : SSBSECT_VOICE_AVAIL
     * 
     */
    @JsonProperty("voiceAvail")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_VOICE_AVAIL")
    private String voiceAvail;
    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Lineage reference object : SSBSECT_LEC_HR
     * 
     */
    @JsonProperty("lecHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LEC_HR")
    private Double lecHr;
    /**
     * Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts
     * (Required)
     * 
     */
    @JsonProperty("sstsCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts")
    private String sstsCode;
    /**
     * Default CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("ssasectCrnDefault")
    private String ssasectCrnDefault;
    /**
     * Integration Partner
     * <p>
     * Lineage reference object : SSBSECT_INTG_CDE
     * 
     */
    @JsonProperty("intgCde")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_INTG_CDE")
    private String intgCde;
    /**
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_START_DATE")
    private Date ptrmStartDate;
    /**
     * Lineage reference object : SSBSECT_OTH_HR
     * 
     */
    @JsonProperty("othHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_OTH_HR")
    private Double othHr;
    /**
     * Lineage reference object : SSBSECT_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CONT_HR")
    private Double contHr;
    /**
     * Gradable
     * <p>
     * Lineage reference object : SSBSECT_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_GRADABLE_IND")
    private String gradableInd;
    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstGroup")
    private String xlstGroup;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Link Identifier
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("linkIdent")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LINK_IDENT")
    private String linkIdent;
    /**
     * Lineage reference object : SSBSECT_LAB_HR
     * 
     */
    @JsonProperty("labHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LAB_HR")
    private Double labHr;
    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SSBSECT_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_INSM_CODE, Lookup lineage reference object : gtvinsm")
    private String insmCode;
    /**
     * Default Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCodeDefault")
    @JsonPropertyDescription("Lookup lineage reference object : stvterm")
    private String ssasectTermCodeDefault;
    /**
     * Attendance Method
     * <p>
     * Lineage reference object : SSBSECT_ACCT_CODE, Lookup lineage reference object : stvacct
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACCT_CODE, Lookup lineage reference object : stvacct")
    private String acctCode;
    /**
     * Course Number
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRSE_NUMB")
    private String crseNumb;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : sobptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : sobptrm")
    private String ptrmCode;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private String ssasectTermCode;
    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr
     * 
     */
    @JsonProperty("saprCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr")
    private String saprCode;
    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * (Required)
     * 
     */
    @JsonProperty("seqNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SEQ_NUMB")
    private String seqNumb;
    /**
     * Part of Term Weeks
     * <p>
     * Lineage reference object : SSBSECT_PTRM_WEEKS
     * 
     */
    @JsonProperty("ptrmWeeks")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_WEEKS")
    private Double ptrmWeeks;
    /**
     * Part-of-Term End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_END_DATE")
    private Date ptrmEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Print
     * <p>
     * Lineage reference object : SSBSECT_PRNT_IND
     * 
     */
    @JsonProperty("ssbsectPrntInd")
    public String getSsbsectPrntInd() {
        return ssbsectPrntInd;
    }

    /**
     * Print
     * <p>
     * Lineage reference object : SSBSECT_PRNT_IND
     * 
     */
    @JsonProperty("ssbsectPrntInd")
    public void setSsbsectPrntInd(String ssbsectPrntInd) {
        this.ssbsectPrntInd = ssbsectPrntInd;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSsbsectPrntInd(String ssbsectPrntInd) {
        this.ssbsectPrntInd = ssbsectPrntInd;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    public Double getCreditHrs() {
        return creditHrs;
    }

    /**
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    public void setCreditHrs(Double creditHrs) {
        this.creditHrs = creditHrs;
    }

    public CourseSectionInformationCopyCrn100PutRequest withCreditHrs(Double creditHrs) {
        this.creditHrs = creditHrs;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public String getSsasectCrn() {
        return ssasectCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public void setSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
        return this;
    }

    /**
     * Tuition and  Fee Waiver
     * <p>
     * Lineage reference object : SSBSECT_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    public String getTuiwInd() {
        return tuiwInd;
    }

    /**
     * Tuition and  Fee Waiver
     * <p>
     * Lineage reference object : SSBSECT_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    public void setTuiwInd(String tuiwInd) {
        this.tuiwInd = tuiwInd;
    }

    public CourseSectionInformationCopyCrn100PutRequest withTuiwInd(String tuiwInd) {
        this.tuiwInd = tuiwInd;
        return this;
    }

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CourseSectionInformationCopyCrn100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("gModCode")
    public String getgModCode() {
        return gModCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("gModCode")
    public void setgModCode(String gModCode) {
        this.gModCode = gModCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withgModCode(String gModCode) {
        this.gModCode = gModCode;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd
     * (Required)
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE, Lookup lineage reference object : scrschd,stvschd,scrschd
     * (Required)
     * 
     */
    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSchdCode(String schdCode) {
        this.schdCode = schdCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_BILL_HRS
     * 
     */
    @JsonProperty("billHrs")
    public Double getBillHrs() {
        return billHrs;
    }

    /**
     * Lineage reference object : SSBSECT_BILL_HRS
     * 
     */
    @JsonProperty("billHrs")
    public void setBillHrs(Double billHrs) {
        this.billHrs = billHrs;
    }

    public CourseSectionInformationCopyCrn100PutRequest withBillHrs(Double billHrs) {
        this.billHrs = billHrs;
        return this;
    }

    /**
     * Voice Response and Self-Service Available
     * <p>
     * Lineage reference object : SSBSECT_VOICE_AVAIL
     * 
     */
    @JsonProperty("voiceAvail")
    public String getVoiceAvail() {
        return voiceAvail;
    }

    /**
     * Voice Response and Self-Service Available
     * <p>
     * Lineage reference object : SSBSECT_VOICE_AVAIL
     * 
     */
    @JsonProperty("voiceAvail")
    public void setVoiceAvail(String voiceAvail) {
        this.voiceAvail = voiceAvail;
    }

    public CourseSectionInformationCopyCrn100PutRequest withVoiceAvail(String voiceAvail) {
        this.voiceAvail = voiceAvail;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_LEC_HR
     * 
     */
    @JsonProperty("lecHr")
    public Double getLecHr() {
        return lecHr;
    }

    /**
     * Lineage reference object : SSBSECT_LEC_HR
     * 
     */
    @JsonProperty("lecHr")
    public void setLecHr(Double lecHr) {
        this.lecHr = lecHr;
    }

    public CourseSectionInformationCopyCrn100PutRequest withLecHr(Double lecHr) {
        this.lecHr = lecHr;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts
     * (Required)
     * 
     */
    @JsonProperty("sstsCode")
    public String getSstsCode() {
        return sstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts
     * (Required)
     * 
     */
    @JsonProperty("sstsCode")
    public void setSstsCode(String sstsCode) {
        this.sstsCode = sstsCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSstsCode(String sstsCode) {
        this.sstsCode = sstsCode;
        return this;
    }

    /**
     * Default CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("ssasectCrnDefault")
    public String getSsasectCrnDefault() {
        return ssasectCrnDefault;
    }

    /**
     * Default CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("ssasectCrnDefault")
    public void setSsasectCrnDefault(String ssasectCrnDefault) {
        this.ssasectCrnDefault = ssasectCrnDefault;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSsasectCrnDefault(String ssasectCrnDefault) {
        this.ssasectCrnDefault = ssasectCrnDefault;
        return this;
    }

    /**
     * Integration Partner
     * <p>
     * Lineage reference object : SSBSECT_INTG_CDE
     * 
     */
    @JsonProperty("intgCde")
    public String getIntgCde() {
        return intgCde;
    }

    /**
     * Integration Partner
     * <p>
     * Lineage reference object : SSBSECT_INTG_CDE
     * 
     */
    @JsonProperty("intgCde")
    public void setIntgCde(String intgCde) {
        this.intgCde = intgCde;
    }

    public CourseSectionInformationCopyCrn100PutRequest withIntgCde(String intgCde) {
        this.intgCde = intgCde;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    public Date getPtrmStartDate() {
        return ptrmStartDate;
    }

    /**
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    public void setPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
    }

    public CourseSectionInformationCopyCrn100PutRequest withPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_OTH_HR
     * 
     */
    @JsonProperty("othHr")
    public Double getOthHr() {
        return othHr;
    }

    /**
     * Lineage reference object : SSBSECT_OTH_HR
     * 
     */
    @JsonProperty("othHr")
    public void setOthHr(Double othHr) {
        this.othHr = othHr;
    }

    public CourseSectionInformationCopyCrn100PutRequest withOthHr(Double othHr) {
        this.othHr = othHr;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    public Double getContHr() {
        return contHr;
    }

    /**
     * Lineage reference object : SSBSECT_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    public void setContHr(Double contHr) {
        this.contHr = contHr;
    }

    public CourseSectionInformationCopyCrn100PutRequest withContHr(Double contHr) {
        this.contHr = contHr;
        return this;
    }

    /**
     * Gradable
     * <p>
     * Lineage reference object : SSBSECT_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    public String getGradableInd() {
        return gradableInd;
    }

    /**
     * Gradable
     * <p>
     * Lineage reference object : SSBSECT_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    public void setGradableInd(String gradableInd) {
        this.gradableInd = gradableInd;
    }

    public CourseSectionInformationCopyCrn100PutRequest withGradableInd(String gradableInd) {
        this.gradableInd = gradableInd;
        return this;
    }

    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstGroup")
    public String getXlstGroup() {
        return xlstGroup;
    }

    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstGroup")
    public void setXlstGroup(String xlstGroup) {
        this.xlstGroup = xlstGroup;
    }

    public CourseSectionInformationCopyCrn100PutRequest withXlstGroup(String xlstGroup) {
        this.xlstGroup = xlstGroup;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Link Identifier
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("linkIdent")
    public String getLinkIdent() {
        return linkIdent;
    }

    /**
     * Link Identifier
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("linkIdent")
    public void setLinkIdent(String linkIdent) {
        this.linkIdent = linkIdent;
    }

    public CourseSectionInformationCopyCrn100PutRequest withLinkIdent(String linkIdent) {
        this.linkIdent = linkIdent;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_LAB_HR
     * 
     */
    @JsonProperty("labHr")
    public Double getLabHr() {
        return labHr;
    }

    /**
     * Lineage reference object : SSBSECT_LAB_HR
     * 
     */
    @JsonProperty("labHr")
    public void setLabHr(Double labHr) {
        this.labHr = labHr;
    }

    public CourseSectionInformationCopyCrn100PutRequest withLabHr(Double labHr) {
        this.labHr = labHr;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SSBSECT_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    public String getInsmCode() {
        return insmCode;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SSBSECT_INSM_CODE, Lookup lineage reference object : gtvinsm
     * 
     */
    @JsonProperty("insmCode")
    public void setInsmCode(String insmCode) {
        this.insmCode = insmCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withInsmCode(String insmCode) {
        this.insmCode = insmCode;
        return this;
    }

    /**
     * Default Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCodeDefault")
    public String getSsasectTermCodeDefault() {
        return ssasectTermCodeDefault;
    }

    /**
     * Default Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCodeDefault")
    public void setSsasectTermCodeDefault(String ssasectTermCodeDefault) {
        this.ssasectTermCodeDefault = ssasectTermCodeDefault;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSsasectTermCodeDefault(String ssasectTermCodeDefault) {
        this.ssasectTermCodeDefault = ssasectTermCodeDefault;
        return this;
    }

    /**
     * Attendance Method
     * <p>
     * Lineage reference object : SSBSECT_ACCT_CODE, Lookup lineage reference object : stvacct
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Attendance Method
     * <p>
     * Lineage reference object : SSBSECT_ACCT_CODE, Lookup lineage reference object : stvacct
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * (Required)
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CourseSectionInformationCopyCrn100PutRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : sobptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : sobptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    public String getSsasectTermCode() {
        return ssasectTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssasectTermCode")
    public void setSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
        return this;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr
     * 
     */
    @JsonProperty("saprCode")
    public String getSaprCode() {
        return saprCode;
    }

    /**
     * Special Approval
     * <p>
     * Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr
     * 
     */
    @JsonProperty("saprCode")
    public void setSaprCode(String saprCode) {
        this.saprCode = saprCode;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSaprCode(String saprCode) {
        this.saprCode = saprCode;
        return this;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * (Required)
     * 
     */
    @JsonProperty("seqNumb")
    public String getSeqNumb() {
        return seqNumb;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * (Required)
     * 
     */
    @JsonProperty("seqNumb")
    public void setSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
    }

    public CourseSectionInformationCopyCrn100PutRequest withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    /**
     * Part of Term Weeks
     * <p>
     * Lineage reference object : SSBSECT_PTRM_WEEKS
     * 
     */
    @JsonProperty("ptrmWeeks")
    public Double getPtrmWeeks() {
        return ptrmWeeks;
    }

    /**
     * Part of Term Weeks
     * <p>
     * Lineage reference object : SSBSECT_PTRM_WEEKS
     * 
     */
    @JsonProperty("ptrmWeeks")
    public void setPtrmWeeks(Double ptrmWeeks) {
        this.ptrmWeeks = ptrmWeeks;
    }

    public CourseSectionInformationCopyCrn100PutRequest withPtrmWeeks(Double ptrmWeeks) {
        this.ptrmWeeks = ptrmWeeks;
        return this;
    }

    /**
     * Part-of-Term End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    public Date getPtrmEndDate() {
        return ptrmEndDate;
    }

    /**
     * Part-of-Term End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    public void setPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
    }

    public CourseSectionInformationCopyCrn100PutRequest withPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
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

    public CourseSectionInformationCopyCrn100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseSectionInformationCopyCrn100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssbsectPrntInd");
        sb.append('=');
        sb.append(((this.ssbsectPrntInd == null)?"<null>":this.ssbsectPrntInd));
        sb.append(',');
        sb.append("creditHrs");
        sb.append('=');
        sb.append(((this.creditHrs == null)?"<null>":this.creditHrs));
        sb.append(',');
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
        sb.append(',');
        sb.append("tuiwInd");
        sb.append('=');
        sb.append(((this.tuiwInd == null)?"<null>":this.tuiwInd));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("gModCode");
        sb.append('=');
        sb.append(((this.gModCode == null)?"<null>":this.gModCode));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("billHrs");
        sb.append('=');
        sb.append(((this.billHrs == null)?"<null>":this.billHrs));
        sb.append(',');
        sb.append("voiceAvail");
        sb.append('=');
        sb.append(((this.voiceAvail == null)?"<null>":this.voiceAvail));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("lecHr");
        sb.append('=');
        sb.append(((this.lecHr == null)?"<null>":this.lecHr));
        sb.append(',');
        sb.append("sstsCode");
        sb.append('=');
        sb.append(((this.sstsCode == null)?"<null>":this.sstsCode));
        sb.append(',');
        sb.append("ssasectCrnDefault");
        sb.append('=');
        sb.append(((this.ssasectCrnDefault == null)?"<null>":this.ssasectCrnDefault));
        sb.append(',');
        sb.append("intgCde");
        sb.append('=');
        sb.append(((this.intgCde == null)?"<null>":this.intgCde));
        sb.append(',');
        sb.append("ptrmStartDate");
        sb.append('=');
        sb.append(((this.ptrmStartDate == null)?"<null>":this.ptrmStartDate));
        sb.append(',');
        sb.append("othHr");
        sb.append('=');
        sb.append(((this.othHr == null)?"<null>":this.othHr));
        sb.append(',');
        sb.append("contHr");
        sb.append('=');
        sb.append(((this.contHr == null)?"<null>":this.contHr));
        sb.append(',');
        sb.append("gradableInd");
        sb.append('=');
        sb.append(((this.gradableInd == null)?"<null>":this.gradableInd));
        sb.append(',');
        sb.append("xlstGroup");
        sb.append('=');
        sb.append(((this.xlstGroup == null)?"<null>":this.xlstGroup));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("linkIdent");
        sb.append('=');
        sb.append(((this.linkIdent == null)?"<null>":this.linkIdent));
        sb.append(',');
        sb.append("labHr");
        sb.append('=');
        sb.append(((this.labHr == null)?"<null>":this.labHr));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("ssasectTermCodeDefault");
        sb.append('=');
        sb.append(((this.ssasectTermCodeDefault == null)?"<null>":this.ssasectTermCodeDefault));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
        sb.append(',');
        sb.append("saprCode");
        sb.append('=');
        sb.append(((this.saprCode == null)?"<null>":this.saprCode));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("ptrmWeeks");
        sb.append('=');
        sb.append(((this.ptrmWeeks == null)?"<null>":this.ptrmWeeks));
        sb.append(',');
        sb.append("ptrmEndDate");
        sb.append('=');
        sb.append(((this.ptrmEndDate == null)?"<null>":this.ptrmEndDate));
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
        result = ((result* 31)+((this.ssbsectPrntInd == null)? 0 :this.ssbsectPrntInd.hashCode()));
        result = ((result* 31)+((this.creditHrs == null)? 0 :this.creditHrs.hashCode()));
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
        result = ((result* 31)+((this.tuiwInd == null)? 0 :this.tuiwInd.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.gModCode == null)? 0 :this.gModCode.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.billHrs == null)? 0 :this.billHrs.hashCode()));
        result = ((result* 31)+((this.voiceAvail == null)? 0 :this.voiceAvail.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.lecHr == null)? 0 :this.lecHr.hashCode()));
        result = ((result* 31)+((this.sstsCode == null)? 0 :this.sstsCode.hashCode()));
        result = ((result* 31)+((this.ssasectCrnDefault == null)? 0 :this.ssasectCrnDefault.hashCode()));
        result = ((result* 31)+((this.intgCde == null)? 0 :this.intgCde.hashCode()));
        result = ((result* 31)+((this.ptrmStartDate == null)? 0 :this.ptrmStartDate.hashCode()));
        result = ((result* 31)+((this.othHr == null)? 0 :this.othHr.hashCode()));
        result = ((result* 31)+((this.contHr == null)? 0 :this.contHr.hashCode()));
        result = ((result* 31)+((this.gradableInd == null)? 0 :this.gradableInd.hashCode()));
        result = ((result* 31)+((this.xlstGroup == null)? 0 :this.xlstGroup.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.linkIdent == null)? 0 :this.linkIdent.hashCode()));
        result = ((result* 31)+((this.labHr == null)? 0 :this.labHr.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.ssasectTermCodeDefault == null)? 0 :this.ssasectTermCodeDefault.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.saprCode == null)? 0 :this.saprCode.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.ptrmWeeks == null)? 0 :this.ptrmWeeks.hashCode()));
        result = ((result* 31)+((this.ptrmEndDate == null)? 0 :this.ptrmEndDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseSectionInformationCopyCrn100PutRequest) == false) {
            return false;
        }
        CourseSectionInformationCopyCrn100PutRequest rhs = ((CourseSectionInformationCopyCrn100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((this.ssbsectPrntInd == rhs.ssbsectPrntInd)||((this.ssbsectPrntInd!= null)&&this.ssbsectPrntInd.equals(rhs.ssbsectPrntInd)))&&((this.creditHrs == rhs.creditHrs)||((this.creditHrs!= null)&&this.creditHrs.equals(rhs.creditHrs))))&&((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn))))&&((this.tuiwInd == rhs.tuiwInd)||((this.tuiwInd!= null)&&this.tuiwInd.equals(rhs.tuiwInd))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.gModCode == rhs.gModCode)||((this.gModCode!= null)&&this.gModCode.equals(rhs.gModCode))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.billHrs == rhs.billHrs)||((this.billHrs!= null)&&this.billHrs.equals(rhs.billHrs))))&&((this.voiceAvail == rhs.voiceAvail)||((this.voiceAvail!= null)&&this.voiceAvail.equals(rhs.voiceAvail))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.lecHr == rhs.lecHr)||((this.lecHr!= null)&&this.lecHr.equals(rhs.lecHr))))&&((this.sstsCode == rhs.sstsCode)||((this.sstsCode!= null)&&this.sstsCode.equals(rhs.sstsCode))))&&((this.ssasectCrnDefault == rhs.ssasectCrnDefault)||((this.ssasectCrnDefault!= null)&&this.ssasectCrnDefault.equals(rhs.ssasectCrnDefault))))&&((this.intgCde == rhs.intgCde)||((this.intgCde!= null)&&this.intgCde.equals(rhs.intgCde))))&&((this.ptrmStartDate == rhs.ptrmStartDate)||((this.ptrmStartDate!= null)&&this.ptrmStartDate.equals(rhs.ptrmStartDate))))&&((this.othHr == rhs.othHr)||((this.othHr!= null)&&this.othHr.equals(rhs.othHr))))&&((this.contHr == rhs.contHr)||((this.contHr!= null)&&this.contHr.equals(rhs.contHr))))&&((this.gradableInd == rhs.gradableInd)||((this.gradableInd!= null)&&this.gradableInd.equals(rhs.gradableInd))))&&((this.xlstGroup == rhs.xlstGroup)||((this.xlstGroup!= null)&&this.xlstGroup.equals(rhs.xlstGroup))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.linkIdent == rhs.linkIdent)||((this.linkIdent!= null)&&this.linkIdent.equals(rhs.linkIdent))))&&((this.labHr == rhs.labHr)||((this.labHr!= null)&&this.labHr.equals(rhs.labHr))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.ssasectTermCodeDefault == rhs.ssasectTermCodeDefault)||((this.ssasectTermCodeDefault!= null)&&this.ssasectTermCodeDefault.equals(rhs.ssasectTermCodeDefault))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode))))&&((this.saprCode == rhs.saprCode)||((this.saprCode!= null)&&this.saprCode.equals(rhs.saprCode))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.ptrmWeeks == rhs.ptrmWeeks)||((this.ptrmWeeks!= null)&&this.ptrmWeeks.equals(rhs.ptrmWeeks))))&&((this.ptrmEndDate == rhs.ptrmEndDate)||((this.ptrmEndDate!= null)&&this.ptrmEndDate.equals(rhs.ptrmEndDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
