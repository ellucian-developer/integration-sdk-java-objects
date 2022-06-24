
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
    "criteria.stvadmtDesc",
    "criteria.receiveDate",
    "criteria.termCodeEntryDesc",
    "printInd",
    "criteria.sourceDate",
    "criteria.applNo",
    "criteria.stvresdDesc",
    "criteria.recruiterAppl",
    "criteria.source",
    "criteria.sarappdApdcCode",
    "criteria.deadlineDate",
    "criteria.mandatoryInd",
    "criteria.siteCode",
    "criteria.stvadmrDesc",
    "id",
    "reqDate2",
    "criteria.codeValue",
    "reqDate1",
    "criteria.stvapdcDesc",
    "kbentryTermCode",
    "criteria.apstCode",
    "deadlineDate",
    "receiveDate",
    "criteria.applPreference",
    "criteria.statMaintIndDesc",
    "criteria.admrCode",
    "criteria.decMaintIndDesc",
    "criteria.stvsiteDesc",
    "criteria.sarappdMaintInd",
    "criteria.reqDate1",
    "criteria.reqDate2",
    "criteria.stvapstDesc",
    "codeValue",
    "criteria.stvstypDesc",
    "criteria.sarappdApdcDate",
    "criteria.cksrCode",
    "criteria.reqDocInd",
    "criteria.resdCode",
    "criteria.maintInd",
    "ckstCode",
    "criteria.comment",
    "criteria.fullPartInd",
    "criteria.admtCode",
    "mandatoryInd",
    "criteria.apstDate",
    "criteria.stypCode",
    "criteria.ckstCode",
    "criteria.reqCount",
    "criteria.applDate",
    "criteria.printInd",
    "comment",
    "criteria.termCodeEntry"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationChecklist100PutRequest {

    @JsonProperty("criteria.stvadmtDesc")
    private String criteriaStvadmtDesc;
    /**
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("criteria.receiveDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_RECEIVE_DATE")
    private Date criteriaReceiveDate;
    @JsonProperty("criteria.termCodeEntryDesc")
    private String criteriaTermCodeEntryDesc;
    /**
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_PRINT_IND")
    private String printInd;
    /**
     * Date
     * <p>
     * Lineage reference object : SARCHKL_SOURCE_DATE
     * 
     */
    @JsonProperty("criteria.sourceDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_SOURCE_DATE")
    private Date criteriaSourceDate;
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
    @JsonProperty("criteria.recruiterAppl")
    private String criteriaRecruiterAppl;
    /**
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("criteria.source")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_SOURCE")
    private String criteriaSource;
    /**
     * app decision enUS
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("criteria.sarappdApdcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapdc")
    private String criteriaSarappdApdcCode;
    /**
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("criteria.deadlineDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_DEADLINE_DATE")
    private Date criteriaDeadlineDate;
    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("criteria.mandatoryInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_MANDATORY_IND")
    private String criteriaMandatoryInd;
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
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvadmrDesc")
    private String criteriaStvadmrDesc;
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
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("criteria.codeValue")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CODE_VALUE")
    private String criteriaCodeValue;
    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("reqDate1")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_DATE1")
    private Date reqDate1;
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
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("deadlineDate")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_DEADLINE_DATE")
    private Date deadlineDate;
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
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("criteria.applPreference")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_PREFERENCE")
    private Double criteriaApplPreference;
    @JsonProperty("criteria.statMaintIndDesc")
    private String criteriaStatMaintIndDesc;
    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * (Required)
     * 
     */
    @JsonProperty("criteria.admrCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String criteriaAdmrCode;
    @JsonProperty("criteria.decMaintIndDesc")
    private String criteriaDecMaintIndDesc;
    @JsonProperty("criteria.stvsiteDesc")
    private String criteriaStvsiteDesc;
    /**
     * Maintained By
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sarappdMaintInd")
    private String criteriaSarappdMaintInd;
    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("criteria.reqDate1")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_DATE1")
    private Date criteriaReqDate1;
    /**
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("criteria.reqDate2")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_DATE2")
    private Date criteriaReqDate2;
    @JsonProperty("criteria.stvapstDesc")
    private String criteriaStvapstDesc;
    /**
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("codeValue")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CODE_VALUE")
    private String codeValue;
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
     * Checklist Origin
     * <p>
     * Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr
     * 
     */
    @JsonProperty("criteria.cksrCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr")
    private String criteriaCksrCode;
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
     * Maintained By
     * <p>
     * Lineage reference object : SARADAP_MAINT_IND
     * 
     */
    @JsonProperty("criteria.maintInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_MAINT_IND")
    private String criteriaMaintInd;
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
     * Item Description
     * <p>
     * Lineage reference object : SARCHKL_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_COMMENT")
    private String criteriaComment;
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
    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("mandatoryInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_MANDATORY_IND")
    private String mandatoryInd;
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
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("criteria.ckstCode")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst")
    private String criteriaCkstCode;
    /**
     * Count
     * <p>
     * Lineage reference object : SARCHKL_REQ_COUNT
     * 
     */
    @JsonProperty("criteria.reqCount")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_REQ_COUNT")
    private Double criteriaReqCount;
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
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("criteria.printInd")
    @JsonPropertyDescription("Lineage reference object : SARCHKL_PRINT_IND")
    private String criteriaPrintInd;
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
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeEntry")
    @JsonPropertyDescription("Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeEntry;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaStvadmtDesc(String criteriaStvadmtDesc) {
        this.criteriaStvadmtDesc = criteriaStvadmtDesc;
        return this;
    }

    /**
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("criteria.receiveDate")
    public Date getCriteriaReceiveDate() {
        return criteriaReceiveDate;
    }

    /**
     * Received Date
     * <p>
     * Lineage reference object : SARCHKL_RECEIVE_DATE
     * 
     */
    @JsonProperty("criteria.receiveDate")
    public void setCriteriaReceiveDate(Date criteriaReceiveDate) {
        this.criteriaReceiveDate = criteriaReceiveDate;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaReceiveDate(Date criteriaReceiveDate) {
        this.criteriaReceiveDate = criteriaReceiveDate;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaTermCodeEntryDesc(String criteriaTermCodeEntryDesc) {
        this.criteriaTermCodeEntryDesc = criteriaTermCodeEntryDesc;
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

    public AdmissionsApplicationChecklist100PutRequest withPrintInd(String printInd) {
        this.printInd = printInd;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : SARCHKL_SOURCE_DATE
     * 
     */
    @JsonProperty("criteria.sourceDate")
    public Date getCriteriaSourceDate() {
        return criteriaSourceDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : SARCHKL_SOURCE_DATE
     * 
     */
    @JsonProperty("criteria.sourceDate")
    public void setCriteriaSourceDate(Date criteriaSourceDate) {
        this.criteriaSourceDate = criteriaSourceDate;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaSourceDate(Date criteriaSourceDate) {
        this.criteriaSourceDate = criteriaSourceDate;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaApplNo(Double criteriaApplNo) {
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaStvresdDesc(String criteriaStvresdDesc) {
        this.criteriaStvresdDesc = criteriaStvresdDesc;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaRecruiterAppl(String criteriaRecruiterAppl) {
        this.criteriaRecruiterAppl = criteriaRecruiterAppl;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("criteria.source")
    public String getCriteriaSource() {
        return criteriaSource;
    }

    /**
     * Lineage reference object : SARCHKL_SOURCE
     * 
     */
    @JsonProperty("criteria.source")
    public void setCriteriaSource(String criteriaSource) {
        this.criteriaSource = criteriaSource;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaSource(String criteriaSource) {
        this.criteriaSource = criteriaSource;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaSarappdApdcCode(String criteriaSarappdApdcCode) {
        this.criteriaSarappdApdcCode = criteriaSarappdApdcCode;
        return this;
    }

    /**
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("criteria.deadlineDate")
    public Date getCriteriaDeadlineDate() {
        return criteriaDeadlineDate;
    }

    /**
     * Deadline
     * <p>
     * Lineage reference object : SARCHKL_DEADLINE_DATE
     * 
     */
    @JsonProperty("criteria.deadlineDate")
    public void setCriteriaDeadlineDate(Date criteriaDeadlineDate) {
        this.criteriaDeadlineDate = criteriaDeadlineDate;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaDeadlineDate(Date criteriaDeadlineDate) {
        this.criteriaDeadlineDate = criteriaDeadlineDate;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("criteria.mandatoryInd")
    public String getCriteriaMandatoryInd() {
        return criteriaMandatoryInd;
    }

    /**
     * Lineage reference object : SARCHKL_MANDATORY_IND
     * 
     */
    @JsonProperty("criteria.mandatoryInd")
    public void setCriteriaMandatoryInd(String criteriaMandatoryInd) {
        this.criteriaMandatoryInd = criteriaMandatoryInd;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaMandatoryInd(String criteriaMandatoryInd) {
        this.criteriaMandatoryInd = criteriaMandatoryInd;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaSiteCode(String criteriaSiteCode) {
        this.criteriaSiteCode = criteriaSiteCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvadmrDesc")
    public String getCriteriaStvadmrDesc() {
        return criteriaStvadmrDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvadmrDesc")
    public void setCriteriaStvadmrDesc(String criteriaStvadmrDesc) {
        this.criteriaStvadmrDesc = criteriaStvadmrDesc;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaStvadmrDesc(String criteriaStvadmrDesc) {
        this.criteriaStvadmrDesc = criteriaStvadmrDesc;
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

    public AdmissionsApplicationChecklist100PutRequest withId(String id) {
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

    public AdmissionsApplicationChecklist100PutRequest withReqDate2(Date reqDate2) {
        this.reqDate2 = reqDate2;
        return this;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("criteria.codeValue")
    public String getCriteriaCodeValue() {
        return criteriaCodeValue;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : SARCHKL_CODE_VALUE
     * 
     */
    @JsonProperty("criteria.codeValue")
    public void setCriteriaCodeValue(String criteriaCodeValue) {
        this.criteriaCodeValue = criteriaCodeValue;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaCodeValue(String criteriaCodeValue) {
        this.criteriaCodeValue = criteriaCodeValue;
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

    public AdmissionsApplicationChecklist100PutRequest withReqDate1(Date reqDate1) {
        this.reqDate1 = reqDate1;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaStvapdcDesc(String criteriaStvapdcDesc) {
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

    public AdmissionsApplicationChecklist100PutRequest withKbentryTermCode(String kbentryTermCode) {
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaApstCode(String criteriaApstCode) {
        this.criteriaApstCode = criteriaApstCode;
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

    public AdmissionsApplicationChecklist100PutRequest withDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
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

    public AdmissionsApplicationChecklist100PutRequest withReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaApplPreference(Double criteriaApplPreference) {
        this.criteriaApplPreference = criteriaApplPreference;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaStatMaintIndDesc(String criteriaStatMaintIndDesc) {
        this.criteriaStatMaintIndDesc = criteriaStatMaintIndDesc;
        return this;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * (Required)
     * 
     */
    @JsonProperty("criteria.admrCode")
    public String getCriteriaAdmrCode() {
        return criteriaAdmrCode;
    }

    /**
     * Admission Request
     * <p>
     * Lineage reference object : SARCHKL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * (Required)
     * 
     */
    @JsonProperty("criteria.admrCode")
    public void setCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaDecMaintIndDesc(String criteriaDecMaintIndDesc) {
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaStvsiteDesc(String criteriaStvsiteDesc) {
        this.criteriaStvsiteDesc = criteriaStvsiteDesc;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaSarappdMaintInd(String criteriaSarappdMaintInd) {
        this.criteriaSarappdMaintInd = criteriaSarappdMaintInd;
        return this;
    }

    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("criteria.reqDate1")
    public Date getCriteriaReqDate1() {
        return criteriaReqDate1;
    }

    /**
     * First Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE1
     * 
     */
    @JsonProperty("criteria.reqDate1")
    public void setCriteriaReqDate1(Date criteriaReqDate1) {
        this.criteriaReqDate1 = criteriaReqDate1;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaReqDate1(Date criteriaReqDate1) {
        this.criteriaReqDate1 = criteriaReqDate1;
        return this;
    }

    /**
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("criteria.reqDate2")
    public Date getCriteriaReqDate2() {
        return criteriaReqDate2;
    }

    /**
     * Last Request
     * <p>
     * Lineage reference object : SARCHKL_REQ_DATE2
     * 
     */
    @JsonProperty("criteria.reqDate2")
    public void setCriteriaReqDate2(Date criteriaReqDate2) {
        this.criteriaReqDate2 = criteriaReqDate2;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaReqDate2(Date criteriaReqDate2) {
        this.criteriaReqDate2 = criteriaReqDate2;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaStvapstDesc(String criteriaStvapstDesc) {
        this.criteriaStvapstDesc = criteriaStvapstDesc;
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

    public AdmissionsApplicationChecklist100PutRequest withCodeValue(String codeValue) {
        this.codeValue = codeValue;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaStvstypDesc(String criteriaStvstypDesc) {
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaSarappdApdcDate(Date criteriaSarappdApdcDate) {
        this.criteriaSarappdApdcDate = criteriaSarappdApdcDate;
        return this;
    }

    /**
     * Checklist Origin
     * <p>
     * Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr
     * 
     */
    @JsonProperty("criteria.cksrCode")
    public String getCriteriaCksrCode() {
        return criteriaCksrCode;
    }

    /**
     * Checklist Origin
     * <p>
     * Lineage reference object : SARCHKL_CKSR_CODE, Lookup lineage reference object : stvcksr
     * 
     */
    @JsonProperty("criteria.cksrCode")
    public void setCriteriaCksrCode(String criteriaCksrCode) {
        this.criteriaCksrCode = criteriaCksrCode;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaCksrCode(String criteriaCksrCode) {
        this.criteriaCksrCode = criteriaCksrCode;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaReqDocInd(String criteriaReqDocInd) {
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaResdCode(String criteriaResdCode) {
        this.criteriaResdCode = criteriaResdCode;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaMaintInd(String criteriaMaintInd) {
        this.criteriaMaintInd = criteriaMaintInd;
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

    public AdmissionsApplicationChecklist100PutRequest withCkstCode(String ckstCode) {
        this.ckstCode = ckstCode;
        return this;
    }

    /**
     * Item Description
     * <p>
     * Lineage reference object : SARCHKL_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public String getCriteriaComment() {
        return criteriaComment;
    }

    /**
     * Item Description
     * <p>
     * Lineage reference object : SARCHKL_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public void setCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaFullPartInd(String criteriaFullPartInd) {
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaAdmtCode(String criteriaAdmtCode) {
        this.criteriaAdmtCode = criteriaAdmtCode;
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

    public AdmissionsApplicationChecklist100PutRequest withMandatoryInd(String mandatoryInd) {
        this.mandatoryInd = mandatoryInd;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaApstDate(Date criteriaApstDate) {
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaStypCode(String criteriaStypCode) {
        this.criteriaStypCode = criteriaStypCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("criteria.ckstCode")
    public String getCriteriaCkstCode() {
        return criteriaCkstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARCHKL_CKST_CODE, Lookup lineage reference object : stvckst
     * 
     */
    @JsonProperty("criteria.ckstCode")
    public void setCriteriaCkstCode(String criteriaCkstCode) {
        this.criteriaCkstCode = criteriaCkstCode;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaCkstCode(String criteriaCkstCode) {
        this.criteriaCkstCode = criteriaCkstCode;
        return this;
    }

    /**
     * Count
     * <p>
     * Lineage reference object : SARCHKL_REQ_COUNT
     * 
     */
    @JsonProperty("criteria.reqCount")
    public Double getCriteriaReqCount() {
        return criteriaReqCount;
    }

    /**
     * Count
     * <p>
     * Lineage reference object : SARCHKL_REQ_COUNT
     * 
     */
    @JsonProperty("criteria.reqCount")
    public void setCriteriaReqCount(Double criteriaReqCount) {
        this.criteriaReqCount = criteriaReqCount;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaReqCount(Double criteriaReqCount) {
        this.criteriaReqCount = criteriaReqCount;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaApplDate(Date criteriaApplDate) {
        this.criteriaApplDate = criteriaApplDate;
        return this;
    }

    /**
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("criteria.printInd")
    public String getCriteriaPrintInd() {
        return criteriaPrintInd;
    }

    /**
     * Lineage reference object : SARCHKL_PRINT_IND
     * 
     */
    @JsonProperty("criteria.printInd")
    public void setCriteriaPrintInd(String criteriaPrintInd) {
        this.criteriaPrintInd = criteriaPrintInd;
    }

    public AdmissionsApplicationChecklist100PutRequest withCriteriaPrintInd(String criteriaPrintInd) {
        this.criteriaPrintInd = criteriaPrintInd;
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

    public AdmissionsApplicationChecklist100PutRequest withComment(String comment) {
        this.comment = comment;
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

    public AdmissionsApplicationChecklist100PutRequest withCriteriaTermCodeEntry(String criteriaTermCodeEntry) {
        this.criteriaTermCodeEntry = criteriaTermCodeEntry;
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

    public AdmissionsApplicationChecklist100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationChecklist100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaStvadmtDesc");
        sb.append('=');
        sb.append(((this.criteriaStvadmtDesc == null)?"<null>":this.criteriaStvadmtDesc));
        sb.append(',');
        sb.append("criteriaReceiveDate");
        sb.append('=');
        sb.append(((this.criteriaReceiveDate == null)?"<null>":this.criteriaReceiveDate));
        sb.append(',');
        sb.append("criteriaTermCodeEntryDesc");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEntryDesc == null)?"<null>":this.criteriaTermCodeEntryDesc));
        sb.append(',');
        sb.append("printInd");
        sb.append('=');
        sb.append(((this.printInd == null)?"<null>":this.printInd));
        sb.append(',');
        sb.append("criteriaSourceDate");
        sb.append('=');
        sb.append(((this.criteriaSourceDate == null)?"<null>":this.criteriaSourceDate));
        sb.append(',');
        sb.append("criteriaApplNo");
        sb.append('=');
        sb.append(((this.criteriaApplNo == null)?"<null>":this.criteriaApplNo));
        sb.append(',');
        sb.append("criteriaStvresdDesc");
        sb.append('=');
        sb.append(((this.criteriaStvresdDesc == null)?"<null>":this.criteriaStvresdDesc));
        sb.append(',');
        sb.append("criteriaRecruiterAppl");
        sb.append('=');
        sb.append(((this.criteriaRecruiterAppl == null)?"<null>":this.criteriaRecruiterAppl));
        sb.append(',');
        sb.append("criteriaSource");
        sb.append('=');
        sb.append(((this.criteriaSource == null)?"<null>":this.criteriaSource));
        sb.append(',');
        sb.append("criteriaSarappdApdcCode");
        sb.append('=');
        sb.append(((this.criteriaSarappdApdcCode == null)?"<null>":this.criteriaSarappdApdcCode));
        sb.append(',');
        sb.append("criteriaDeadlineDate");
        sb.append('=');
        sb.append(((this.criteriaDeadlineDate == null)?"<null>":this.criteriaDeadlineDate));
        sb.append(',');
        sb.append("criteriaMandatoryInd");
        sb.append('=');
        sb.append(((this.criteriaMandatoryInd == null)?"<null>":this.criteriaMandatoryInd));
        sb.append(',');
        sb.append("criteriaSiteCode");
        sb.append('=');
        sb.append(((this.criteriaSiteCode == null)?"<null>":this.criteriaSiteCode));
        sb.append(',');
        sb.append("criteriaStvadmrDesc");
        sb.append('=');
        sb.append(((this.criteriaStvadmrDesc == null)?"<null>":this.criteriaStvadmrDesc));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("reqDate2");
        sb.append('=');
        sb.append(((this.reqDate2 == null)?"<null>":this.reqDate2));
        sb.append(',');
        sb.append("criteriaCodeValue");
        sb.append('=');
        sb.append(((this.criteriaCodeValue == null)?"<null>":this.criteriaCodeValue));
        sb.append(',');
        sb.append("reqDate1");
        sb.append('=');
        sb.append(((this.reqDate1 == null)?"<null>":this.reqDate1));
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
        sb.append("deadlineDate");
        sb.append('=');
        sb.append(((this.deadlineDate == null)?"<null>":this.deadlineDate));
        sb.append(',');
        sb.append("receiveDate");
        sb.append('=');
        sb.append(((this.receiveDate == null)?"<null>":this.receiveDate));
        sb.append(',');
        sb.append("criteriaApplPreference");
        sb.append('=');
        sb.append(((this.criteriaApplPreference == null)?"<null>":this.criteriaApplPreference));
        sb.append(',');
        sb.append("criteriaStatMaintIndDesc");
        sb.append('=');
        sb.append(((this.criteriaStatMaintIndDesc == null)?"<null>":this.criteriaStatMaintIndDesc));
        sb.append(',');
        sb.append("criteriaAdmrCode");
        sb.append('=');
        sb.append(((this.criteriaAdmrCode == null)?"<null>":this.criteriaAdmrCode));
        sb.append(',');
        sb.append("criteriaDecMaintIndDesc");
        sb.append('=');
        sb.append(((this.criteriaDecMaintIndDesc == null)?"<null>":this.criteriaDecMaintIndDesc));
        sb.append(',');
        sb.append("criteriaStvsiteDesc");
        sb.append('=');
        sb.append(((this.criteriaStvsiteDesc == null)?"<null>":this.criteriaStvsiteDesc));
        sb.append(',');
        sb.append("criteriaSarappdMaintInd");
        sb.append('=');
        sb.append(((this.criteriaSarappdMaintInd == null)?"<null>":this.criteriaSarappdMaintInd));
        sb.append(',');
        sb.append("criteriaReqDate1");
        sb.append('=');
        sb.append(((this.criteriaReqDate1 == null)?"<null>":this.criteriaReqDate1));
        sb.append(',');
        sb.append("criteriaReqDate2");
        sb.append('=');
        sb.append(((this.criteriaReqDate2 == null)?"<null>":this.criteriaReqDate2));
        sb.append(',');
        sb.append("criteriaStvapstDesc");
        sb.append('=');
        sb.append(((this.criteriaStvapstDesc == null)?"<null>":this.criteriaStvapstDesc));
        sb.append(',');
        sb.append("codeValue");
        sb.append('=');
        sb.append(((this.codeValue == null)?"<null>":this.codeValue));
        sb.append(',');
        sb.append("criteriaStvstypDesc");
        sb.append('=');
        sb.append(((this.criteriaStvstypDesc == null)?"<null>":this.criteriaStvstypDesc));
        sb.append(',');
        sb.append("criteriaSarappdApdcDate");
        sb.append('=');
        sb.append(((this.criteriaSarappdApdcDate == null)?"<null>":this.criteriaSarappdApdcDate));
        sb.append(',');
        sb.append("criteriaCksrCode");
        sb.append('=');
        sb.append(((this.criteriaCksrCode == null)?"<null>":this.criteriaCksrCode));
        sb.append(',');
        sb.append("criteriaReqDocInd");
        sb.append('=');
        sb.append(((this.criteriaReqDocInd == null)?"<null>":this.criteriaReqDocInd));
        sb.append(',');
        sb.append("criteriaResdCode");
        sb.append('=');
        sb.append(((this.criteriaResdCode == null)?"<null>":this.criteriaResdCode));
        sb.append(',');
        sb.append("criteriaMaintInd");
        sb.append('=');
        sb.append(((this.criteriaMaintInd == null)?"<null>":this.criteriaMaintInd));
        sb.append(',');
        sb.append("ckstCode");
        sb.append('=');
        sb.append(((this.ckstCode == null)?"<null>":this.ckstCode));
        sb.append(',');
        sb.append("criteriaComment");
        sb.append('=');
        sb.append(((this.criteriaComment == null)?"<null>":this.criteriaComment));
        sb.append(',');
        sb.append("criteriaFullPartInd");
        sb.append('=');
        sb.append(((this.criteriaFullPartInd == null)?"<null>":this.criteriaFullPartInd));
        sb.append(',');
        sb.append("criteriaAdmtCode");
        sb.append('=');
        sb.append(((this.criteriaAdmtCode == null)?"<null>":this.criteriaAdmtCode));
        sb.append(',');
        sb.append("mandatoryInd");
        sb.append('=');
        sb.append(((this.mandatoryInd == null)?"<null>":this.mandatoryInd));
        sb.append(',');
        sb.append("criteriaApstDate");
        sb.append('=');
        sb.append(((this.criteriaApstDate == null)?"<null>":this.criteriaApstDate));
        sb.append(',');
        sb.append("criteriaStypCode");
        sb.append('=');
        sb.append(((this.criteriaStypCode == null)?"<null>":this.criteriaStypCode));
        sb.append(',');
        sb.append("criteriaCkstCode");
        sb.append('=');
        sb.append(((this.criteriaCkstCode == null)?"<null>":this.criteriaCkstCode));
        sb.append(',');
        sb.append("criteriaReqCount");
        sb.append('=');
        sb.append(((this.criteriaReqCount == null)?"<null>":this.criteriaReqCount));
        sb.append(',');
        sb.append("criteriaApplDate");
        sb.append('=');
        sb.append(((this.criteriaApplDate == null)?"<null>":this.criteriaApplDate));
        sb.append(',');
        sb.append("criteriaPrintInd");
        sb.append('=');
        sb.append(((this.criteriaPrintInd == null)?"<null>":this.criteriaPrintInd));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("criteriaTermCodeEntry");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEntry == null)?"<null>":this.criteriaTermCodeEntry));
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
        result = ((result* 31)+((this.criteriaStvstypDesc == null)? 0 :this.criteriaStvstypDesc.hashCode()));
        result = ((result* 31)+((this.printInd == null)? 0 :this.printInd.hashCode()));
        result = ((result* 31)+((this.criteriaSarappdApdcDate == null)? 0 :this.criteriaSarappdApdcDate.hashCode()));
        result = ((result* 31)+((this.criteriaComment == null)? 0 :this.criteriaComment.hashCode()));
        result = ((result* 31)+((this.criteriaApstDate == null)? 0 :this.criteriaApstDate.hashCode()));
        result = ((result* 31)+((this.criteriaCkstCode == null)? 0 :this.criteriaCkstCode.hashCode()));
        result = ((result* 31)+((this.criteriaReqCount == null)? 0 :this.criteriaReqCount.hashCode()));
        result = ((result* 31)+((this.criteriaSourceDate == null)? 0 :this.criteriaSourceDate.hashCode()));
        result = ((result* 31)+((this.criteriaStvapstDesc == null)? 0 :this.criteriaStvapstDesc.hashCode()));
        result = ((result* 31)+((this.criteriaFullPartInd == null)? 0 :this.criteriaFullPartInd.hashCode()));
        result = ((result* 31)+((this.criteriaResdCode == null)? 0 :this.criteriaResdCode.hashCode()));
        result = ((result* 31)+((this.criteriaAdmtCode == null)? 0 :this.criteriaAdmtCode.hashCode()));
        result = ((result* 31)+((this.criteriaSarappdMaintInd == null)? 0 :this.criteriaSarappdMaintInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reqDate2 == null)? 0 :this.reqDate2 .hashCode()));
        result = ((result* 31)+((this.reqDate1 == null)? 0 :this.reqDate1 .hashCode()));
        result = ((result* 31)+((this.criteriaStatMaintIndDesc == null)? 0 :this.criteriaStatMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.kbentryTermCode == null)? 0 :this.kbentryTermCode.hashCode()));
        result = ((result* 31)+((this.deadlineDate == null)? 0 :this.deadlineDate.hashCode()));
        result = ((result* 31)+((this.receiveDate == null)? 0 :this.receiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaCodeValue == null)? 0 :this.criteriaCodeValue.hashCode()));
        result = ((result* 31)+((this.criteriaStvadmtDesc == null)? 0 :this.criteriaStvadmtDesc.hashCode()));
        result = ((result* 31)+((this.criteriaStvadmrDesc == null)? 0 :this.criteriaStvadmrDesc.hashCode()));
        result = ((result* 31)+((this.criteriaPrintInd == null)? 0 :this.criteriaPrintInd.hashCode()));
        result = ((result* 31)+((this.criteriaStvresdDesc == null)? 0 :this.criteriaStvresdDesc.hashCode()));
        result = ((result* 31)+((this.criteriaApplNo == null)? 0 :this.criteriaApplNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaApplDate == null)? 0 :this.criteriaApplDate.hashCode()));
        result = ((result* 31)+((this.criteriaSource == null)? 0 :this.criteriaSource.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEntryDesc == null)? 0 :this.criteriaTermCodeEntryDesc.hashCode()));
        result = ((result* 31)+((this.criteriaStvapdcDesc == null)? 0 :this.criteriaStvapdcDesc.hashCode()));
        result = ((result* 31)+((this.criteriaRecruiterAppl == null)? 0 :this.criteriaRecruiterAppl.hashCode()));
        result = ((result* 31)+((this.criteriaApstCode == null)? 0 :this.criteriaApstCode.hashCode()));
        result = ((result* 31)+((this.criteriaDeadlineDate == null)? 0 :this.criteriaDeadlineDate.hashCode()));
        result = ((result* 31)+((this.criteriaStypCode == null)? 0 :this.criteriaStypCode.hashCode()));
        result = ((result* 31)+((this.criteriaSarappdApdcCode == null)? 0 :this.criteriaSarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.codeValue == null)? 0 :this.codeValue.hashCode()));
        result = ((result* 31)+((this.criteriaReceiveDate == null)? 0 :this.criteriaReceiveDate.hashCode()));
        result = ((result* 31)+((this.criteriaSiteCode == null)? 0 :this.criteriaSiteCode.hashCode()));
        result = ((result* 31)+((this.criteriaMaintInd == null)? 0 :this.criteriaMaintInd.hashCode()));
        result = ((result* 31)+((this.criteriaMandatoryInd == null)? 0 :this.criteriaMandatoryInd.hashCode()));
        result = ((result* 31)+((this.ckstCode == null)? 0 :this.ckstCode.hashCode()));
        result = ((result* 31)+((this.criteriaApplPreference == null)? 0 :this.criteriaApplPreference.hashCode()));
        result = ((result* 31)+((this.criteriaReqDate2 == null)? 0 :this.criteriaReqDate2 .hashCode()));
        result = ((result* 31)+((this.criteriaReqDate1 == null)? 0 :this.criteriaReqDate1 .hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEntry == null)? 0 :this.criteriaTermCodeEntry.hashCode()));
        result = ((result* 31)+((this.mandatoryInd == null)? 0 :this.mandatoryInd.hashCode()));
        result = ((result* 31)+((this.criteriaAdmrCode == null)? 0 :this.criteriaAdmrCode.hashCode()));
        result = ((result* 31)+((this.criteriaCksrCode == null)? 0 :this.criteriaCksrCode.hashCode()));
        result = ((result* 31)+((this.criteriaReqDocInd == null)? 0 :this.criteriaReqDocInd.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.criteriaDecMaintIndDesc == null)? 0 :this.criteriaDecMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.criteriaStvsiteDesc == null)? 0 :this.criteriaStvsiteDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationChecklist100PutRequest) == false) {
            return false;
        }
        AdmissionsApplicationChecklist100PutRequest rhs = ((AdmissionsApplicationChecklist100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.criteriaStvstypDesc == rhs.criteriaStvstypDesc)||((this.criteriaStvstypDesc!= null)&&this.criteriaStvstypDesc.equals(rhs.criteriaStvstypDesc)))&&((this.printInd == rhs.printInd)||((this.printInd!= null)&&this.printInd.equals(rhs.printInd))))&&((this.criteriaSarappdApdcDate == rhs.criteriaSarappdApdcDate)||((this.criteriaSarappdApdcDate!= null)&&this.criteriaSarappdApdcDate.equals(rhs.criteriaSarappdApdcDate))))&&((this.criteriaComment == rhs.criteriaComment)||((this.criteriaComment!= null)&&this.criteriaComment.equals(rhs.criteriaComment))))&&((this.criteriaApstDate == rhs.criteriaApstDate)||((this.criteriaApstDate!= null)&&this.criteriaApstDate.equals(rhs.criteriaApstDate))))&&((this.criteriaCkstCode == rhs.criteriaCkstCode)||((this.criteriaCkstCode!= null)&&this.criteriaCkstCode.equals(rhs.criteriaCkstCode))))&&((this.criteriaReqCount == rhs.criteriaReqCount)||((this.criteriaReqCount!= null)&&this.criteriaReqCount.equals(rhs.criteriaReqCount))))&&((this.criteriaSourceDate == rhs.criteriaSourceDate)||((this.criteriaSourceDate!= null)&&this.criteriaSourceDate.equals(rhs.criteriaSourceDate))))&&((this.criteriaStvapstDesc == rhs.criteriaStvapstDesc)||((this.criteriaStvapstDesc!= null)&&this.criteriaStvapstDesc.equals(rhs.criteriaStvapstDesc))))&&((this.criteriaFullPartInd == rhs.criteriaFullPartInd)||((this.criteriaFullPartInd!= null)&&this.criteriaFullPartInd.equals(rhs.criteriaFullPartInd))))&&((this.criteriaResdCode == rhs.criteriaResdCode)||((this.criteriaResdCode!= null)&&this.criteriaResdCode.equals(rhs.criteriaResdCode))))&&((this.criteriaAdmtCode == rhs.criteriaAdmtCode)||((this.criteriaAdmtCode!= null)&&this.criteriaAdmtCode.equals(rhs.criteriaAdmtCode))))&&((this.criteriaSarappdMaintInd == rhs.criteriaSarappdMaintInd)||((this.criteriaSarappdMaintInd!= null)&&this.criteriaSarappdMaintInd.equals(rhs.criteriaSarappdMaintInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reqDate2 == rhs.reqDate2)||((this.reqDate2 != null)&&this.reqDate2 .equals(rhs.reqDate2))))&&((this.reqDate1 == rhs.reqDate1)||((this.reqDate1 != null)&&this.reqDate1 .equals(rhs.reqDate1))))&&((this.criteriaStatMaintIndDesc == rhs.criteriaStatMaintIndDesc)||((this.criteriaStatMaintIndDesc!= null)&&this.criteriaStatMaintIndDesc.equals(rhs.criteriaStatMaintIndDesc))))&&((this.kbentryTermCode == rhs.kbentryTermCode)||((this.kbentryTermCode!= null)&&this.kbentryTermCode.equals(rhs.kbentryTermCode))))&&((this.deadlineDate == rhs.deadlineDate)||((this.deadlineDate!= null)&&this.deadlineDate.equals(rhs.deadlineDate))))&&((this.receiveDate == rhs.receiveDate)||((this.receiveDate!= null)&&this.receiveDate.equals(rhs.receiveDate))))&&((this.criteriaCodeValue == rhs.criteriaCodeValue)||((this.criteriaCodeValue!= null)&&this.criteriaCodeValue.equals(rhs.criteriaCodeValue))))&&((this.criteriaStvadmtDesc == rhs.criteriaStvadmtDesc)||((this.criteriaStvadmtDesc!= null)&&this.criteriaStvadmtDesc.equals(rhs.criteriaStvadmtDesc))))&&((this.criteriaStvadmrDesc == rhs.criteriaStvadmrDesc)||((this.criteriaStvadmrDesc!= null)&&this.criteriaStvadmrDesc.equals(rhs.criteriaStvadmrDesc))))&&((this.criteriaPrintInd == rhs.criteriaPrintInd)||((this.criteriaPrintInd!= null)&&this.criteriaPrintInd.equals(rhs.criteriaPrintInd))))&&((this.criteriaStvresdDesc == rhs.criteriaStvresdDesc)||((this.criteriaStvresdDesc!= null)&&this.criteriaStvresdDesc.equals(rhs.criteriaStvresdDesc))))&&((this.criteriaApplNo == rhs.criteriaApplNo)||((this.criteriaApplNo!= null)&&this.criteriaApplNo.equals(rhs.criteriaApplNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaApplDate == rhs.criteriaApplDate)||((this.criteriaApplDate!= null)&&this.criteriaApplDate.equals(rhs.criteriaApplDate))))&&((this.criteriaSource == rhs.criteriaSource)||((this.criteriaSource!= null)&&this.criteriaSource.equals(rhs.criteriaSource))))&&((this.criteriaTermCodeEntryDesc == rhs.criteriaTermCodeEntryDesc)||((this.criteriaTermCodeEntryDesc!= null)&&this.criteriaTermCodeEntryDesc.equals(rhs.criteriaTermCodeEntryDesc))))&&((this.criteriaStvapdcDesc == rhs.criteriaStvapdcDesc)||((this.criteriaStvapdcDesc!= null)&&this.criteriaStvapdcDesc.equals(rhs.criteriaStvapdcDesc))))&&((this.criteriaRecruiterAppl == rhs.criteriaRecruiterAppl)||((this.criteriaRecruiterAppl!= null)&&this.criteriaRecruiterAppl.equals(rhs.criteriaRecruiterAppl))))&&((this.criteriaApstCode == rhs.criteriaApstCode)||((this.criteriaApstCode!= null)&&this.criteriaApstCode.equals(rhs.criteriaApstCode))))&&((this.criteriaDeadlineDate == rhs.criteriaDeadlineDate)||((this.criteriaDeadlineDate!= null)&&this.criteriaDeadlineDate.equals(rhs.criteriaDeadlineDate))))&&((this.criteriaStypCode == rhs.criteriaStypCode)||((this.criteriaStypCode!= null)&&this.criteriaStypCode.equals(rhs.criteriaStypCode))))&&((this.criteriaSarappdApdcCode == rhs.criteriaSarappdApdcCode)||((this.criteriaSarappdApdcCode!= null)&&this.criteriaSarappdApdcCode.equals(rhs.criteriaSarappdApdcCode))))&&((this.codeValue == rhs.codeValue)||((this.codeValue!= null)&&this.codeValue.equals(rhs.codeValue))))&&((this.criteriaReceiveDate == rhs.criteriaReceiveDate)||((this.criteriaReceiveDate!= null)&&this.criteriaReceiveDate.equals(rhs.criteriaReceiveDate))))&&((this.criteriaSiteCode == rhs.criteriaSiteCode)||((this.criteriaSiteCode!= null)&&this.criteriaSiteCode.equals(rhs.criteriaSiteCode))))&&((this.criteriaMaintInd == rhs.criteriaMaintInd)||((this.criteriaMaintInd!= null)&&this.criteriaMaintInd.equals(rhs.criteriaMaintInd))))&&((this.criteriaMandatoryInd == rhs.criteriaMandatoryInd)||((this.criteriaMandatoryInd!= null)&&this.criteriaMandatoryInd.equals(rhs.criteriaMandatoryInd))))&&((this.ckstCode == rhs.ckstCode)||((this.ckstCode!= null)&&this.ckstCode.equals(rhs.ckstCode))))&&((this.criteriaApplPreference == rhs.criteriaApplPreference)||((this.criteriaApplPreference!= null)&&this.criteriaApplPreference.equals(rhs.criteriaApplPreference))))&&((this.criteriaReqDate2 == rhs.criteriaReqDate2)||((this.criteriaReqDate2 != null)&&this.criteriaReqDate2 .equals(rhs.criteriaReqDate2))))&&((this.criteriaReqDate1 == rhs.criteriaReqDate1)||((this.criteriaReqDate1 != null)&&this.criteriaReqDate1 .equals(rhs.criteriaReqDate1))))&&((this.criteriaTermCodeEntry == rhs.criteriaTermCodeEntry)||((this.criteriaTermCodeEntry!= null)&&this.criteriaTermCodeEntry.equals(rhs.criteriaTermCodeEntry))))&&((this.mandatoryInd == rhs.mandatoryInd)||((this.mandatoryInd!= null)&&this.mandatoryInd.equals(rhs.mandatoryInd))))&&((this.criteriaAdmrCode == rhs.criteriaAdmrCode)||((this.criteriaAdmrCode!= null)&&this.criteriaAdmrCode.equals(rhs.criteriaAdmrCode))))&&((this.criteriaCksrCode == rhs.criteriaCksrCode)||((this.criteriaCksrCode!= null)&&this.criteriaCksrCode.equals(rhs.criteriaCksrCode))))&&((this.criteriaReqDocInd == rhs.criteriaReqDocInd)||((this.criteriaReqDocInd!= null)&&this.criteriaReqDocInd.equals(rhs.criteriaReqDocInd))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.criteriaDecMaintIndDesc == rhs.criteriaDecMaintIndDesc)||((this.criteriaDecMaintIndDesc!= null)&&this.criteriaDecMaintIndDesc.equals(rhs.criteriaDecMaintIndDesc))))&&((this.criteriaStvsiteDesc == rhs.criteriaStvsiteDesc)||((this.criteriaStvsiteDesc!= null)&&this.criteriaStvsiteDesc.equals(rhs.criteriaStvsiteDesc))));
    }

}
