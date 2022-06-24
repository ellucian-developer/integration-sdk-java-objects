
package com.ellucian.generated.bpapi.ban.admissions_application_checklist.v1_0_0;

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
    "reqCount",
    "applDate",
    "stvapdcDesc",
    "termCodeEntryDesc",
    "printInd",
    "maintInd",
    "source",
    "codeValue",
    "sourceDate",
    "apstCode",
    "apstDate",
    "decMaintIndDesc",
    "admtCode",
    "stvstypDesc",
    "statMaintIndDesc",
    "ckstCode",
    "id",
    "reqDate2",
    "reqDate1",
    "termCodeEntry",
    "fullPartInd",
    "stvadmtDesc",
    "stvresdDesc",
    "siteCode",
    "mandatoryInd",
    "kbentryTermCode",
    "deadlineDate",
    "cksrCode",
    "applNo",
    "resdCode",
    "sarappdApdcCode",
    "receiveDate",
    "stvsiteDesc",
    "stvapstDesc",
    "sarappdApdcDate",
    "admrCode",
    "applPreference",
    "comment",
    "stypCode",
    "recruiterAppl",
    "sarappdMaintInd"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationChecklist100GetRequest {

    @JsonProperty("reqDocInd")
    private String reqDocInd;
    /**
     * Count
     * <p>
     * Lineage reference object : SARCHKL_REQ_COUNT
     * 
     */
    @JsonProperty("reqCount")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_COUNT")
    private Double reqCount;
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
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_PRINT_IND")
    private String printInd;
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
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_SOURCE")
    private String source;
    /**
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("codeValue")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CODE_VALUE")
    private String codeValue;
    /**
     * Date
     * <p>
     * Lineage reference object : SARCHKL_SOURCE_DATE
     * 
     */
    @JsonProperty("sourceDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_SOURCE_DATE")
    private Date sourceDate;
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
    @JsonProperty("decMaintIndDesc")
    private String decMaintIndDesc;
    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String admtCode;
    @JsonProperty("stvstypDesc")
    private String stvstypDesc;
    @JsonProperty("statMaintIndDesc")
    private String statMaintIndDesc;
    /**
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("ckstCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst")
    private String ckstCode;
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
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("reqDate2")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_DATE2")
    private Date reqDate2;
    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("reqDate1")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_DATE1")
    private Date reqDate1;
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
    @JsonProperty("stvadmtDesc")
    private String stvadmtDesc;
    @JsonProperty("stvresdDesc")
    private String stvresdDesc;
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
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("mandatoryInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_MANDATORY_IND")
    private String mandatoryInd;
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
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("deadlineDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_DEADLINE_DATE")
    private Date deadlineDate;
    /**
     * Checklist Origin
     * <p>
     * Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr
     * 
     */
    @JsonProperty("cksrCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr")
    private String cksrCode;
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
     * app decision enUS
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapdc")
    private String sarappdApdcCode;
    /**
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("receiveDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_RECEIVE_DATE")
    private Date receiveDate;
    @JsonProperty("stvsiteDesc")
    private String stvsiteDesc;
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
    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * (Required)
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
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
     * Item Description
     * <p>
     * Lineage reference object : SARCHKL_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_COMMENT")
    private String comment;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    @JsonProperty("recruiterAppl")
    private String recruiterAppl;
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

    public AdmissionsApplicationChecklist100GetRequest withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
        return this;
    }

    /**
     * Count
     * <p>
     * Lineage reference object : SARCHKL_REQ_COUNT
     * 
     */
    @JsonProperty("reqCount")
    public Double getReqCount() {
        return reqCount;
    }

    /**
     * Count
     * <p>
     * Lineage reference object : SARCHKL_REQ_COUNT
     * 
     */
    @JsonProperty("reqCount")
    public void setReqCount(Double reqCount) {
        this.reqCount = reqCount;
    }

    public AdmissionsApplicationChecklist100GetRequest withReqCount(Double reqCount) {
        this.reqCount = reqCount;
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

    public AdmissionsApplicationChecklist100GetRequest withApplDate(Date applDate) {
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

    public AdmissionsApplicationChecklist100GetRequest withStvapdcDesc(String stvapdcDesc) {
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

    public AdmissionsApplicationChecklist100GetRequest withTermCodeEntryDesc(String termCodeEntryDesc) {
        this.termCodeEntryDesc = termCodeEntryDesc;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    public String getPrintInd() {
        return printInd;
    }

    /**
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    public void setPrintInd(String printInd) {
        this.printInd = printInd;
    }

    public AdmissionsApplicationChecklist100GetRequest withPrintInd(String printInd) {
        this.printInd = printInd;
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

    public AdmissionsApplicationChecklist100GetRequest withMaintInd(String maintInd) {
        this.maintInd = maintInd;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public AdmissionsApplicationChecklist100GetRequest withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("codeValue")
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("codeValue")
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public AdmissionsApplicationChecklist100GetRequest withCodeValue(String codeValue) {
        this.codeValue = codeValue;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : SARCHKL_SOURCE_DATE
     * 
     */
    @JsonProperty("sourceDate")
    public Date getSourceDate() {
        return sourceDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : SARCHKL_SOURCE_DATE
     * 
     */
    @JsonProperty("sourceDate")
    public void setSourceDate(Date sourceDate) {
        this.sourceDate = sourceDate;
    }

    public AdmissionsApplicationChecklist100GetRequest withSourceDate(Date sourceDate) {
        this.sourceDate = sourceDate;
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

    public AdmissionsApplicationChecklist100GetRequest withApstCode(String apstCode) {
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

    public AdmissionsApplicationChecklist100GetRequest withApstDate(Date apstDate) {
        this.apstDate = apstDate;
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

    public AdmissionsApplicationChecklist100GetRequest withDecMaintIndDesc(String decMaintIndDesc) {
        this.decMaintIndDesc = decMaintIndDesc;
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

    public AdmissionsApplicationChecklist100GetRequest withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
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

    public AdmissionsApplicationChecklist100GetRequest withStvstypDesc(String stvstypDesc) {
        this.stvstypDesc = stvstypDesc;
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

    public AdmissionsApplicationChecklist100GetRequest withStatMaintIndDesc(String statMaintIndDesc) {
        this.statMaintIndDesc = statMaintIndDesc;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("ckstCode")
    public String getCkstCode() {
        return ckstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("ckstCode")
    public void setCkstCode(String ckstCode) {
        this.ckstCode = ckstCode;
    }

    public AdmissionsApplicationChecklist100GetRequest withCkstCode(String ckstCode) {
        this.ckstCode = ckstCode;
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

    public AdmissionsApplicationChecklist100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("reqDate2")
    public Date getReqDate2() {
        return reqDate2;
    }

    /**
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("reqDate2")
    public void setReqDate2(Date reqDate2) {
        this.reqDate2 = reqDate2;
    }

    public AdmissionsApplicationChecklist100GetRequest withReqDate2(Date reqDate2) {
        this.reqDate2 = reqDate2;
        return this;
    }

    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("reqDate1")
    public Date getReqDate1() {
        return reqDate1;
    }

    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("reqDate1")
    public void setReqDate1(Date reqDate1) {
        this.reqDate1 = reqDate1;
    }

    public AdmissionsApplicationChecklist100GetRequest withReqDate1(Date reqDate1) {
        this.reqDate1 = reqDate1;
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

    public AdmissionsApplicationChecklist100GetRequest withTermCodeEntry(String termCodeEntry) {
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

    public AdmissionsApplicationChecklist100GetRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
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

    public AdmissionsApplicationChecklist100GetRequest withStvadmtDesc(String stvadmtDesc) {
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

    public AdmissionsApplicationChecklist100GetRequest withStvresdDesc(String stvresdDesc) {
        this.stvresdDesc = stvresdDesc;
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

    public AdmissionsApplicationChecklist100GetRequest withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("mandatoryInd")
    public String getMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("mandatoryInd")
    public void setMandatoryInd(String mandatoryInd) {
        this.mandatoryInd = mandatoryInd;
    }

    public AdmissionsApplicationChecklist100GetRequest withMandatoryInd(String mandatoryInd) {
        this.mandatoryInd = mandatoryInd;
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

    public AdmissionsApplicationChecklist100GetRequest withKbentryTermCode(String kbentryTermCode) {
        this.kbentryTermCode = kbentryTermCode;
        return this;
    }

    /**
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("deadlineDate")
    public Date getDeadlineDate() {
        return deadlineDate;
    }

    /**
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("deadlineDate")
    public void setDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public AdmissionsApplicationChecklist100GetRequest withDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
        return this;
    }

    /**
     * Checklist Origin
     * <p>
     * Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr
     * 
     */
    @JsonProperty("cksrCode")
    public String getCksrCode() {
        return cksrCode;
    }

    /**
     * Checklist Origin
     * <p>
     * Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr
     * 
     */
    @JsonProperty("cksrCode")
    public void setCksrCode(String cksrCode) {
        this.cksrCode = cksrCode;
    }

    public AdmissionsApplicationChecklist100GetRequest withCksrCode(String cksrCode) {
        this.cksrCode = cksrCode;
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

    public AdmissionsApplicationChecklist100GetRequest withApplNo(Double applNo) {
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

    public AdmissionsApplicationChecklist100GetRequest withResdCode(String resdCode) {
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

    public AdmissionsApplicationChecklist100GetRequest withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    /**
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("receiveDate")
    public Date getReceiveDate() {
        return receiveDate;
    }

    /**
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("receiveDate")
    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public AdmissionsApplicationChecklist100GetRequest withReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
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

    public AdmissionsApplicationChecklist100GetRequest withStvsiteDesc(String stvsiteDesc) {
        this.stvsiteDesc = stvsiteDesc;
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

    public AdmissionsApplicationChecklist100GetRequest withStvapstDesc(String stvapstDesc) {
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

    public AdmissionsApplicationChecklist100GetRequest withSarappdApdcDate(Date sarappdApdcDate) {
        this.sarappdApdcDate = sarappdApdcDate;
        return this;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * (Required)
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * (Required)
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public AdmissionsApplicationChecklist100GetRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
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

    public AdmissionsApplicationChecklist100GetRequest withApplPreference(Double applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    /**
     * Item Description
     * <p>
     * Lineage reference object : SARCHKL_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Item Description
     * <p>
     * Lineage reference object : SARCHKL_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public AdmissionsApplicationChecklist100GetRequest withComment(String comment) {
        this.comment = comment;
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

    public AdmissionsApplicationChecklist100GetRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    @JsonProperty("recruiterAppl")
    public String getRecruiterAppl() {
        return recruiterAppl;
    }

    @JsonProperty("recruiterAppl")
    public void setRecruiterAppl(String recruiterAppl) {
        this.recruiterAppl = recruiterAppl;
    }

    public AdmissionsApplicationChecklist100GetRequest withRecruiterAppl(String recruiterAppl) {
        this.recruiterAppl = recruiterAppl;
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

    public AdmissionsApplicationChecklist100GetRequest withSarappdMaintInd(String sarappdMaintInd) {
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

    public AdmissionsApplicationChecklist100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationChecklist100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("reqCount");
        sb.append('=');
        sb.append(((this.reqCount == null)?"<null>":this.reqCount));
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
        sb.append("printInd");
        sb.append('=');
        sb.append(((this.printInd == null)?"<null>":this.printInd));
        sb.append(',');
        sb.append("maintInd");
        sb.append('=');
        sb.append(((this.maintInd == null)?"<null>":this.maintInd));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("codeValue");
        sb.append('=');
        sb.append(((this.codeValue == null)?"<null>":this.codeValue));
        sb.append(',');
        sb.append("sourceDate");
        sb.append('=');
        sb.append(((this.sourceDate == null)?"<null>":this.sourceDate));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("apstDate");
        sb.append('=');
        sb.append(((this.apstDate == null)?"<null>":this.apstDate));
        sb.append(',');
        sb.append("decMaintIndDesc");
        sb.append('=');
        sb.append(((this.decMaintIndDesc == null)?"<null>":this.decMaintIndDesc));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("stvstypDesc");
        sb.append('=');
        sb.append(((this.stvstypDesc == null)?"<null>":this.stvstypDesc));
        sb.append(',');
        sb.append("statMaintIndDesc");
        sb.append('=');
        sb.append(((this.statMaintIndDesc == null)?"<null>":this.statMaintIndDesc));
        sb.append(',');
        sb.append("ckstCode");
        sb.append('=');
        sb.append(((this.ckstCode == null)?"<null>":this.ckstCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("reqDate2");
        sb.append('=');
        sb.append(((this.reqDate2 == null)?"<null>":this.reqDate2));
        sb.append(',');
        sb.append("reqDate1");
        sb.append('=');
        sb.append(((this.reqDate1 == null)?"<null>":this.reqDate1));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("stvadmtDesc");
        sb.append('=');
        sb.append(((this.stvadmtDesc == null)?"<null>":this.stvadmtDesc));
        sb.append(',');
        sb.append("stvresdDesc");
        sb.append('=');
        sb.append(((this.stvresdDesc == null)?"<null>":this.stvresdDesc));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("mandatoryInd");
        sb.append('=');
        sb.append(((this.mandatoryInd == null)?"<null>":this.mandatoryInd));
        sb.append(',');
        sb.append("kbentryTermCode");
        sb.append('=');
        sb.append(((this.kbentryTermCode == null)?"<null>":this.kbentryTermCode));
        sb.append(',');
        sb.append("deadlineDate");
        sb.append('=');
        sb.append(((this.deadlineDate == null)?"<null>":this.deadlineDate));
        sb.append(',');
        sb.append("cksrCode");
        sb.append('=');
        sb.append(((this.cksrCode == null)?"<null>":this.cksrCode));
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
        sb.append("receiveDate");
        sb.append('=');
        sb.append(((this.receiveDate == null)?"<null>":this.receiveDate));
        sb.append(',');
        sb.append("stvsiteDesc");
        sb.append('=');
        sb.append(((this.stvsiteDesc == null)?"<null>":this.stvsiteDesc));
        sb.append(',');
        sb.append("stvapstDesc");
        sb.append('=');
        sb.append(((this.stvapstDesc == null)?"<null>":this.stvapstDesc));
        sb.append(',');
        sb.append("sarappdApdcDate");
        sb.append('=');
        sb.append(((this.sarappdApdcDate == null)?"<null>":this.sarappdApdcDate));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("recruiterAppl");
        sb.append('=');
        sb.append(((this.recruiterAppl == null)?"<null>":this.recruiterAppl));
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
        result = ((result* 31)+((this.reqCount == null)? 0 :this.reqCount.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.stvapdcDesc == null)? 0 :this.stvapdcDesc.hashCode()));
        result = ((result* 31)+((this.termCodeEntryDesc == null)? 0 :this.termCodeEntryDesc.hashCode()));
        result = ((result* 31)+((this.printInd == null)? 0 :this.printInd.hashCode()));
        result = ((result* 31)+((this.maintInd == null)? 0 :this.maintInd.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.codeValue == null)? 0 :this.codeValue.hashCode()));
        result = ((result* 31)+((this.sourceDate == null)? 0 :this.sourceDate.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.apstDate == null)? 0 :this.apstDate.hashCode()));
        result = ((result* 31)+((this.decMaintIndDesc == null)? 0 :this.decMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.stvstypDesc == null)? 0 :this.stvstypDesc.hashCode()));
        result = ((result* 31)+((this.statMaintIndDesc == null)? 0 :this.statMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.ckstCode == null)? 0 :this.ckstCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reqDate2 == null)? 0 :this.reqDate2 .hashCode()));
        result = ((result* 31)+((this.reqDate1 == null)? 0 :this.reqDate1 .hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.stvadmtDesc == null)? 0 :this.stvadmtDesc.hashCode()));
        result = ((result* 31)+((this.stvresdDesc == null)? 0 :this.stvresdDesc.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.mandatoryInd == null)? 0 :this.mandatoryInd.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.deadlineDate == null)? 0 :this.deadlineDate.hashCode()));
        result = ((result* 31)+((this.cksrCode == null)? 0 :this.cksrCode.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.receiveDate == null)? 0 :this.receiveDate.hashCode()));
        result = ((result* 31)+((this.stvsiteDesc == null)? 0 :this.stvsiteDesc.hashCode()));
        result = ((result* 31)+((this.stvapstDesc == null)? 0 :this.stvapstDesc.hashCode()));
        result = ((result* 31)+((this.sarappdApdcDate == null)? 0 :this.sarappdApdcDate.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.recruiterAppl == null)? 0 :this.recruiterAppl.hashCode()));
        result = ((result* 31)+((this.sarappdMaintInd == null)? 0 :this.sarappdMaintInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationChecklist100GetRequest) == false) {
            return false;
        }
        AdmissionsApplicationChecklist100GetRequest rhs = ((AdmissionsApplicationChecklist100GetRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd)))&&((this.reqCount == rhs.reqCount)||((this.reqCount!= null)&&this.reqCount.equals(rhs.reqCount))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.stvapdcDesc == rhs.stvapdcDesc)||((this.stvapdcDesc!= null)&&this.stvapdcDesc.equals(rhs.stvapdcDesc))))&&((this.termCodeEntryDesc == rhs.termCodeEntryDesc)||((this.termCodeEntryDesc!= null)&&this.termCodeEntryDesc.equals(rhs.termCodeEntryDesc))))&&((this.printInd == rhs.printInd)||((this.printInd!= null)&&this.printInd.equals(rhs.printInd))))&&((this.maintInd == rhs.maintInd)||((this.maintInd!= null)&&this.maintInd.equals(rhs.maintInd))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.codeValue == rhs.codeValue)||((this.codeValue!= null)&&this.codeValue.equals(rhs.codeValue))))&&((this.sourceDate == rhs.sourceDate)||((this.sourceDate!= null)&&this.sourceDate.equals(rhs.sourceDate))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.apstDate == rhs.apstDate)||((this.apstDate!= null)&&this.apstDate.equals(rhs.apstDate))))&&((this.decMaintIndDesc == rhs.decMaintIndDesc)||((this.decMaintIndDesc!= null)&&this.decMaintIndDesc.equals(rhs.decMaintIndDesc))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.stvstypDesc == rhs.stvstypDesc)||((this.stvstypDesc!= null)&&this.stvstypDesc.equals(rhs.stvstypDesc))))&&((this.statMaintIndDesc == rhs.statMaintIndDesc)||((this.statMaintIndDesc!= null)&&this.statMaintIndDesc.equals(rhs.statMaintIndDesc))))&&((this.ckstCode == rhs.ckstCode)||((this.ckstCode!= null)&&this.ckstCode.equals(rhs.ckstCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reqDate2 == rhs.reqDate2)||((this.reqDate2 != null)&&this.reqDate2 .equals(rhs.reqDate2))))&&((this.reqDate1 == rhs.reqDate1)||((this.reqDate1 != null)&&this.reqDate1 .equals(rhs.reqDate1))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.stvadmtDesc == rhs.stvadmtDesc)||((this.stvadmtDesc!= null)&&this.stvadmtDesc.equals(rhs.stvadmtDesc))))&&((this.stvresdDesc == rhs.stvresdDesc)||((this.stvresdDesc!= null)&&this.stvresdDesc.equals(rhs.stvresdDesc))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.mandatoryInd == rhs.mandatoryInd)||((this.mandatoryInd!= null)&&this.mandatoryInd.equals(rhs.mandatoryInd))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.deadlineDate == rhs.deadlineDate)||((this.deadlineDate!= null)&&this.deadlineDate.equals(rhs.deadlineDate))))&&((this.cksrCode == rhs.cksrCode)||((this.cksrCode!= null)&&this.cksrCode.equals(rhs.cksrCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.receiveDate == rhs.receiveDate)||((this.receiveDate!= null)&&this.receiveDate.equals(rhs.receiveDate))))&&((this.stvsiteDesc == rhs.stvsiteDesc)||((this.stvsiteDesc!= null)&&this.stvsiteDesc.equals(rhs.stvsiteDesc))))&&((this.stvapstDesc == rhs.stvapstDesc)||((this.stvapstDesc!= null)&&this.stvapstDesc.equals(rhs.stvapstDesc))))&&((this.sarappdApdcDate == rhs.sarappdApdcDate)||((this.sarappdApdcDate!= null)&&this.sarappdApdcDate.equals(rhs.sarappdApdcDate))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.recruiterAppl == rhs.recruiterAppl)||((this.recruiterAppl!= null)&&this.recruiterAppl.equals(rhs.recruiterAppl))))&&((this.sarappdMaintInd == rhs.sarappdMaintInd)||((this.sarappdMaintInd!= null)&&this.sarappdMaintInd.equals(rhs.sarappdMaintInd))));
    }

}
