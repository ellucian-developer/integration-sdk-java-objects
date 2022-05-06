
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
    "id",
    "kbentryTermCode",
    "termCodeEntry",
    "termCodeEntryDesc",
    "applPreference",
    "recruiterAppl",
    "applNo",
    "applDate",
    "admtCode",
    "stvadmtDesc",
    "fullPartInd",
    "maintInd",
    "statMaintIndDesc",
    "stypCode",
    "stvstypDesc",
    "reqDocInd",
    "sarappdApdcCode",
    "stvapdcDesc",
    "resdCode",
    "stvresdDesc",
    "apstCode",
    "stvapstDesc",
    "sarappdApdcDate",
    "siteCode",
    "stvsiteDesc",
    "apstDate",
    "sarappdMaintInd",
    "decMaintIndDesc",
    "admrCode",
    "comment",
    "receiveDate",
    "codeValue",
    "printInd",
    "mandatoryInd",
    "reqDate1",
    "reqDate2",
    "reqCount",
    "source",
    "sourceDate",
    "deadlineDate",
    "cksrCode",
    "ckstCode"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationChecklist100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("kbentryTermCode")
    private String kbentryTermCode;
    @JsonProperty("termCodeEntry")
    private String termCodeEntry;
    @JsonProperty("termCodeEntryDesc")
    private String termCodeEntryDesc;
    @JsonProperty("applPreference")
    private String applPreference;
    @JsonProperty("recruiterAppl")
    private String recruiterAppl;
    @JsonProperty("applNo")
    private String applNo;
    @JsonProperty("applDate")
    private String applDate;
    @JsonProperty("admtCode")
    private String admtCode;
    @JsonProperty("stvadmtDesc")
    private String stvadmtDesc;
    @JsonProperty("fullPartInd")
    private String fullPartInd;
    @JsonProperty("maintInd")
    private String maintInd;
    @JsonProperty("statMaintIndDesc")
    private String statMaintIndDesc;
    @JsonProperty("stypCode")
    private String stypCode;
    @JsonProperty("stvstypDesc")
    private String stvstypDesc;
    @JsonProperty("reqDocInd")
    private String reqDocInd;
    @JsonProperty("sarappdApdcCode")
    private String sarappdApdcCode;
    @JsonProperty("stvapdcDesc")
    private String stvapdcDesc;
    @JsonProperty("resdCode")
    private String resdCode;
    @JsonProperty("stvresdDesc")
    private String stvresdDesc;
    @JsonProperty("apstCode")
    private String apstCode;
    @JsonProperty("stvapstDesc")
    private String stvapstDesc;
    @JsonProperty("sarappdApdcDate")
    private String sarappdApdcDate;
    @JsonProperty("siteCode")
    private String siteCode;
    @JsonProperty("stvsiteDesc")
    private String stvsiteDesc;
    @JsonProperty("apstDate")
    private String apstDate;
    @JsonProperty("sarappdMaintInd")
    private String sarappdMaintInd;
    @JsonProperty("decMaintIndDesc")
    private String decMaintIndDesc;
    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
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
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("receiveDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_RECEIVE_DATE")
    private Date receiveDate;
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
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_PRINT_IND")
    private String printInd;
    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("mandatoryInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_MANDATORY_IND")
    private String mandatoryInd;
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
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("reqDate2")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_DATE2")
    private Date reqDate2;
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
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_SOURCE")
    private String source;
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
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("ckstCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst")
    private String ckstCode;
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

    public AdmissionsApplicationChecklist100QapiPost withId(String id) {
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

    public AdmissionsApplicationChecklist100QapiPost withKbentryTermCode(String kbentryTermCode) {
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

    public AdmissionsApplicationChecklist100QapiPost withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
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

    public AdmissionsApplicationChecklist100QapiPost withTermCodeEntryDesc(String termCodeEntryDesc) {
        this.termCodeEntryDesc = termCodeEntryDesc;
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

    public AdmissionsApplicationChecklist100QapiPost withApplPreference(String applPreference) {
        this.applPreference = applPreference;
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

    public AdmissionsApplicationChecklist100QapiPost withRecruiterAppl(String recruiterAppl) {
        this.recruiterAppl = recruiterAppl;
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

    public AdmissionsApplicationChecklist100QapiPost withApplNo(String applNo) {
        this.applNo = applNo;
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

    public AdmissionsApplicationChecklist100QapiPost withApplDate(String applDate) {
        this.applDate = applDate;
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

    public AdmissionsApplicationChecklist100QapiPost withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
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

    public AdmissionsApplicationChecklist100QapiPost withStvadmtDesc(String stvadmtDesc) {
        this.stvadmtDesc = stvadmtDesc;
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

    public AdmissionsApplicationChecklist100QapiPost withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    @JsonProperty("maintInd")
    public String getMaintInd() {
        return maintInd;
    }

    @JsonProperty("maintInd")
    public void setMaintInd(String maintInd) {
        this.maintInd = maintInd;
    }

    public AdmissionsApplicationChecklist100QapiPost withMaintInd(String maintInd) {
        this.maintInd = maintInd;
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

    public AdmissionsApplicationChecklist100QapiPost withStatMaintIndDesc(String statMaintIndDesc) {
        this.statMaintIndDesc = statMaintIndDesc;
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

    public AdmissionsApplicationChecklist100QapiPost withStypCode(String stypCode) {
        this.stypCode = stypCode;
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

    public AdmissionsApplicationChecklist100QapiPost withStvstypDesc(String stvstypDesc) {
        this.stvstypDesc = stvstypDesc;
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

    public AdmissionsApplicationChecklist100QapiPost withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
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

    public AdmissionsApplicationChecklist100QapiPost withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
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

    public AdmissionsApplicationChecklist100QapiPost withStvapdcDesc(String stvapdcDesc) {
        this.stvapdcDesc = stvapdcDesc;
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

    public AdmissionsApplicationChecklist100QapiPost withResdCode(String resdCode) {
        this.resdCode = resdCode;
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

    public AdmissionsApplicationChecklist100QapiPost withStvresdDesc(String stvresdDesc) {
        this.stvresdDesc = stvresdDesc;
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

    public AdmissionsApplicationChecklist100QapiPost withApstCode(String apstCode) {
        this.apstCode = apstCode;
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

    public AdmissionsApplicationChecklist100QapiPost withStvapstDesc(String stvapstDesc) {
        this.stvapstDesc = stvapstDesc;
        return this;
    }

    @JsonProperty("sarappdApdcDate")
    public String getSarappdApdcDate() {
        return sarappdApdcDate;
    }

    @JsonProperty("sarappdApdcDate")
    public void setSarappdApdcDate(String sarappdApdcDate) {
        this.sarappdApdcDate = sarappdApdcDate;
    }

    public AdmissionsApplicationChecklist100QapiPost withSarappdApdcDate(String sarappdApdcDate) {
        this.sarappdApdcDate = sarappdApdcDate;
        return this;
    }

    @JsonProperty("siteCode")
    public String getSiteCode() {
        return siteCode;
    }

    @JsonProperty("siteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public AdmissionsApplicationChecklist100QapiPost withSiteCode(String siteCode) {
        this.siteCode = siteCode;
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

    public AdmissionsApplicationChecklist100QapiPost withStvsiteDesc(String stvsiteDesc) {
        this.stvsiteDesc = stvsiteDesc;
        return this;
    }

    @JsonProperty("apstDate")
    public String getApstDate() {
        return apstDate;
    }

    @JsonProperty("apstDate")
    public void setApstDate(String apstDate) {
        this.apstDate = apstDate;
    }

    public AdmissionsApplicationChecklist100QapiPost withApstDate(String apstDate) {
        this.apstDate = apstDate;
        return this;
    }

    @JsonProperty("sarappdMaintInd")
    public String getSarappdMaintInd() {
        return sarappdMaintInd;
    }

    @JsonProperty("sarappdMaintInd")
    public void setSarappdMaintInd(String sarappdMaintInd) {
        this.sarappdMaintInd = sarappdMaintInd;
    }

    public AdmissionsApplicationChecklist100QapiPost withSarappdMaintInd(String sarappdMaintInd) {
        this.sarappdMaintInd = sarappdMaintInd;
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

    public AdmissionsApplicationChecklist100QapiPost withDecMaintIndDesc(String decMaintIndDesc) {
        this.decMaintIndDesc = decMaintIndDesc;
        return this;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
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
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public AdmissionsApplicationChecklist100QapiPost withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
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

    public AdmissionsApplicationChecklist100QapiPost withComment(String comment) {
        this.comment = comment;
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

    public AdmissionsApplicationChecklist100QapiPost withReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
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

    public AdmissionsApplicationChecklist100QapiPost withCodeValue(String codeValue) {
        this.codeValue = codeValue;
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

    public AdmissionsApplicationChecklist100QapiPost withPrintInd(String printInd) {
        this.printInd = printInd;
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

    public AdmissionsApplicationChecklist100QapiPost withMandatoryInd(String mandatoryInd) {
        this.mandatoryInd = mandatoryInd;
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

    public AdmissionsApplicationChecklist100QapiPost withReqDate1(Date reqDate1) {
        this.reqDate1 = reqDate1;
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

    public AdmissionsApplicationChecklist100QapiPost withReqDate2(Date reqDate2) {
        this.reqDate2 = reqDate2;
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

    public AdmissionsApplicationChecklist100QapiPost withReqCount(Double reqCount) {
        this.reqCount = reqCount;
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

    public AdmissionsApplicationChecklist100QapiPost withSource(String source) {
        this.source = source;
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

    public AdmissionsApplicationChecklist100QapiPost withSourceDate(Date sourceDate) {
        this.sourceDate = sourceDate;
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

    public AdmissionsApplicationChecklist100QapiPost withDeadlineDate(Date deadlineDate) {
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

    public AdmissionsApplicationChecklist100QapiPost withCksrCode(String cksrCode) {
        this.cksrCode = cksrCode;
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

    public AdmissionsApplicationChecklist100QapiPost withCkstCode(String ckstCode) {
        this.ckstCode = ckstCode;
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

    public AdmissionsApplicationChecklist100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationChecklist100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("termCodeEntryDesc");
        sb.append('=');
        sb.append(((this.termCodeEntryDesc == null)?"<null>":this.termCodeEntryDesc));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("recruiterAppl");
        sb.append('=');
        sb.append(((this.recruiterAppl == null)?"<null>":this.recruiterAppl));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("stvadmtDesc");
        sb.append('=');
        sb.append(((this.stvadmtDesc == null)?"<null>":this.stvadmtDesc));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("maintInd");
        sb.append('=');
        sb.append(((this.maintInd == null)?"<null>":this.maintInd));
        sb.append(',');
        sb.append("statMaintIndDesc");
        sb.append('=');
        sb.append(((this.statMaintIndDesc == null)?"<null>":this.statMaintIndDesc));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("stvstypDesc");
        sb.append('=');
        sb.append(((this.stvstypDesc == null)?"<null>":this.stvstypDesc));
        sb.append(',');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("sarappdApdcCode");
        sb.append('=');
        sb.append(((this.sarappdApdcCode == null)?"<null>":this.sarappdApdcCode));
        sb.append(',');
        sb.append("stvapdcDesc");
        sb.append('=');
        sb.append(((this.stvapdcDesc == null)?"<null>":this.stvapdcDesc));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("stvresdDesc");
        sb.append('=');
        sb.append(((this.stvresdDesc == null)?"<null>":this.stvresdDesc));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("stvapstDesc");
        sb.append('=');
        sb.append(((this.stvapstDesc == null)?"<null>":this.stvapstDesc));
        sb.append(',');
        sb.append("sarappdApdcDate");
        sb.append('=');
        sb.append(((this.sarappdApdcDate == null)?"<null>":this.sarappdApdcDate));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("stvsiteDesc");
        sb.append('=');
        sb.append(((this.stvsiteDesc == null)?"<null>":this.stvsiteDesc));
        sb.append(',');
        sb.append("apstDate");
        sb.append('=');
        sb.append(((this.apstDate == null)?"<null>":this.apstDate));
        sb.append(',');
        sb.append("sarappdMaintInd");
        sb.append('=');
        sb.append(((this.sarappdMaintInd == null)?"<null>":this.sarappdMaintInd));
        sb.append(',');
        sb.append("decMaintIndDesc");
        sb.append('=');
        sb.append(((this.decMaintIndDesc == null)?"<null>":this.decMaintIndDesc));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("receiveDate");
        sb.append('=');
        sb.append(((this.receiveDate == null)?"<null>":this.receiveDate));
        sb.append(',');
        sb.append("codeValue");
        sb.append('=');
        sb.append(((this.codeValue == null)?"<null>":this.codeValue));
        sb.append(',');
        sb.append("printInd");
        sb.append('=');
        sb.append(((this.printInd == null)?"<null>":this.printInd));
        sb.append(',');
        sb.append("mandatoryInd");
        sb.append('=');
        sb.append(((this.mandatoryInd == null)?"<null>":this.mandatoryInd));
        sb.append(',');
        sb.append("reqDate1");
        sb.append('=');
        sb.append(((this.reqDate1 == null)?"<null>":this.reqDate1));
        sb.append(',');
        sb.append("reqDate2");
        sb.append('=');
        sb.append(((this.reqDate2 == null)?"<null>":this.reqDate2));
        sb.append(',');
        sb.append("reqCount");
        sb.append('=');
        sb.append(((this.reqCount == null)?"<null>":this.reqCount));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("sourceDate");
        sb.append('=');
        sb.append(((this.sourceDate == null)?"<null>":this.sourceDate));
        sb.append(',');
        sb.append("deadlineDate");
        sb.append('=');
        sb.append(((this.deadlineDate == null)?"<null>":this.deadlineDate));
        sb.append(',');
        sb.append("cksrCode");
        sb.append('=');
        sb.append(((this.cksrCode == null)?"<null>":this.cksrCode));
        sb.append(',');
        sb.append("ckstCode");
        sb.append('=');
        sb.append(((this.ckstCode == null)?"<null>":this.ckstCode));
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
        if ((other instanceof AdmissionsApplicationChecklist100QapiPost) == false) {
            return false;
        }
        AdmissionsApplicationChecklist100QapiPost rhs = ((AdmissionsApplicationChecklist100QapiPost) other);
        return ((((((((((((((((((((((((((((((((((((((((((((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd)))&&((this.reqCount == rhs.reqCount)||((this.reqCount!= null)&&this.reqCount.equals(rhs.reqCount))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.stvapdcDesc == rhs.stvapdcDesc)||((this.stvapdcDesc!= null)&&this.stvapdcDesc.equals(rhs.stvapdcDesc))))&&((this.termCodeEntryDesc == rhs.termCodeEntryDesc)||((this.termCodeEntryDesc!= null)&&this.termCodeEntryDesc.equals(rhs.termCodeEntryDesc))))&&((this.printInd == rhs.printInd)||((this.printInd!= null)&&this.printInd.equals(rhs.printInd))))&&((this.maintInd == rhs.maintInd)||((this.maintInd!= null)&&this.maintInd.equals(rhs.maintInd))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.codeValue == rhs.codeValue)||((this.codeValue!= null)&&this.codeValue.equals(rhs.codeValue))))&&((this.sourceDate == rhs.sourceDate)||((this.sourceDate!= null)&&this.sourceDate.equals(rhs.sourceDate))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.apstDate == rhs.apstDate)||((this.apstDate!= null)&&this.apstDate.equals(rhs.apstDate))))&&((this.decMaintIndDesc == rhs.decMaintIndDesc)||((this.decMaintIndDesc!= null)&&this.decMaintIndDesc.equals(rhs.decMaintIndDesc))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.stvstypDesc == rhs.stvstypDesc)||((this.stvstypDesc!= null)&&this.stvstypDesc.equals(rhs.stvstypDesc))))&&((this.statMaintIndDesc == rhs.statMaintIndDesc)||((this.statMaintIndDesc!= null)&&this.statMaintIndDesc.equals(rhs.statMaintIndDesc))))&&((this.ckstCode == rhs.ckstCode)||((this.ckstCode!= null)&&this.ckstCode.equals(rhs.ckstCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reqDate2 == rhs.reqDate2)||((this.reqDate2 != null)&&this.reqDate2 .equals(rhs.reqDate2))))&&((this.reqDate1 == rhs.reqDate1)||((this.reqDate1 != null)&&this.reqDate1 .equals(rhs.reqDate1))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.stvadmtDesc == rhs.stvadmtDesc)||((this.stvadmtDesc!= null)&&this.stvadmtDesc.equals(rhs.stvadmtDesc))))&&((this.stvresdDesc == rhs.stvresdDesc)||((this.stvresdDesc!= null)&&this.stvresdDesc.equals(rhs.stvresdDesc))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.mandatoryInd == rhs.mandatoryInd)||((this.mandatoryInd!= null)&&this.mandatoryInd.equals(rhs.mandatoryInd))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.deadlineDate == rhs.deadlineDate)||((this.deadlineDate!= null)&&this.deadlineDate.equals(rhs.deadlineDate))))&&((this.cksrCode == rhs.cksrCode)||((this.cksrCode!= null)&&this.cksrCode.equals(rhs.cksrCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.receiveDate == rhs.receiveDate)||((this.receiveDate!= null)&&this.receiveDate.equals(rhs.receiveDate))))&&((this.stvsiteDesc == rhs.stvsiteDesc)||((this.stvsiteDesc!= null)&&this.stvsiteDesc.equals(rhs.stvsiteDesc))))&&((this.stvapstDesc == rhs.stvapstDesc)||((this.stvapstDesc!= null)&&this.stvapstDesc.equals(rhs.stvapstDesc))))&&((this.sarappdApdcDate == rhs.sarappdApdcDate)||((this.sarappdApdcDate!= null)&&this.sarappdApdcDate.equals(rhs.sarappdApdcDate))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.recruiterAppl == rhs.recruiterAppl)||((this.recruiterAppl!= null)&&this.recruiterAppl.equals(rhs.recruiterAppl))))&&((this.sarappdMaintInd == rhs.sarappdMaintInd)||((this.sarappdMaintInd!= null)&&this.sarappdMaintInd.equals(rhs.sarappdMaintInd))));
    }

}
