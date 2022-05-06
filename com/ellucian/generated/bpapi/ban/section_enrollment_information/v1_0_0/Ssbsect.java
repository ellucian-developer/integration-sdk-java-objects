
package com.ellucian.generated.bpapi.ban.section_enrollment_information.v1_0_0;

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
    "totCreditHrs",
    "scbcrseBillHrInd",
    "tuiwInd",
    "acctDesc",
    "scbcrseContHrHigh",
    "enrl",
    "scbcrseBillHrLow",
    "schdCode",
    "sessCode",
    "scbcrseLabHrLow",
    "prereqChkMethodCde",
    "regAuthActiveCde",
    "reservedInd",
    "longTitleInd",
    "campCode",
    "lecHr",
    "sstsCode",
    "commentInd",
    "scbcrseLecHrHigh",
    "scbcrseLabHrInd",
    "censusEnrlDate",
    "intgCde",
    "numberOfExtensions",
    "learnerRegstartTdate",
    "stvgmodDesc",
    "wch",
    "SectAuthStartDate",
    "gradableInd",
    "stvsessDesc",
    "xlstGroup",
    "subjCode",
    "learnerRegstartFdate",
    "ssrseatReg",
    "seatsAvail",
    "crseNumb",
    "scbcrseCreditHrHigh",
    "ptrmCode",
    "saprCode",
    "scbcrseLabHrHigh",
    "overrideDurInd",
    "waitAvail",
    "seqNumb",
    "ceuInd",
    "scbcrseOthHrInd",
    "census2Enrl",
    "duntCode",
    "scbcrseOthHrLow",
    "creditHrs",
    "scbcrseOthHrHigh",
    "SectStartDate",
    "dch",
    "projEnrl",
    "subjDesc",
    "scbcrseContHrInd",
    "census2Date",
    "gtvduntDesc",
    "title",
    "stvsstsDesc",
    "stvcampDesc",
    "ssrseatPending",
    "stvsaprDesc",
    "gorintgDesc",
    "regFromDate",
    "billHrs",
    "voiceAvail",
    "syllabusInd",
    "scbcrseCreditHrInd",
    "cappPrereqTestInd",
    "SectWLNotificationEndDate",
    "scbcrseContHrLow",
    "othHr",
    "ptrmStartDate",
    "scbcrseLecHrLow",
    "contHr",
    "gmodCode",
    "waitCapacity",
    "scbcrseBillHrHigh",
    "gtvinsmDesc",
    "linkIdent",
    "labHr",
    "insmCode",
    "stvschdDesc",
    "acctCode",
    "scbcrseCreditHrLow",
    "scbcrseLecHrInd",
    "maxEnrl",
    "ssrseawPending",
    "prntInd",
    "numberOfUnits",
    "ssrseawWaitlist",
    "ptrmWeeks",
    "regToDate",
    "censusEnrl",
    "ptrmEndDate",
    "priorEnrl",
    "waitCount"
})
@Generated("jsonschema2pojo")
public class Ssbsect {

    /**
     * Generated Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_TOT_CREDIT_HRS
     * 
     */
    @JsonProperty("totCreditHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_TOT_CREDIT_HRS")
    private Double totCreditHrs;
    /**
     * Billing Hours Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrInd")
    private String scbcrseBillHrInd;
    /**
     * Tuition and  Fee Waiver
     * <p>
     * Lineage reference object : SSBSECT_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_TUIW_IND")
    private String tuiwInd;
    @JsonProperty("acctDesc")
    private String acctDesc;
    @JsonProperty("scbcrseContHrHigh")
    private Double scbcrseContHrHigh;
    /**
     * Actual
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("enrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ENRL")
    private Double enrl;
    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrLow")
    private Double scbcrseBillHrLow;
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
     * Lab
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLabHrLow")
    private Double scbcrseLabHrLow;
    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SSBSECT_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PREREQ_CHK_METHOD_CDE")
    private String prereqChkMethodCde;
    /**
     * Authorization Codes Active for Section
     * <p>
     * Lineage reference object : SSBSECT_REG_AUTH_ACTIVE_CDE
     * 
     */
    @JsonProperty("regAuthActiveCde")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REG_AUTH_ACTIVE_CDE")
    private String regAuthActiveCde;
    /**
     * Reserved
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("reservedInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_RESERVED_IND")
    private String reservedInd;
    /**
     * Long Title
     * <p>
     * 
     * 
     */
    @JsonProperty("longTitleInd")
    private String longTitleInd;
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
     * Comments
     * <p>
     * 
     * 
     */
    @JsonProperty("commentInd")
    private String commentInd;
    @JsonProperty("scbcrseLecHrHigh")
    private Double scbcrseLecHrHigh;
    /**
     * Lab Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLabHrInd")
    private String scbcrseLabHrInd;
    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusEnrlDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_ENRL_DATE")
    private Date censusEnrlDate;
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
     * Maximum Extensions
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_EXTENSIONS
     * 
     */
    @JsonProperty("numberOfExtensions")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_NUMBER_OF_EXTENSIONS")
    private Double numberOfExtensions;
    /**
     * Lineage reference object : SSBSECT_LEARNER_REGSTART_TDATE
     * 
     */
    @JsonProperty("learnerRegstartTdate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LEARNER_REGSTART_TDATE")
    private Date learnerRegstartTdate;
    @JsonProperty("stvgmodDesc")
    private String stvgmodDesc;
    /**
     * Weekly Contact Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("wch")
    private Double wch;
    /**
     * Add Authorization Start Date(DD-MON-YYYY).
     * <p>
     * 
     * 
     */
    @JsonProperty("SectAuthStartDate")
    private Date sectAuthStartDate;
    /**
     * Gradable
     * <p>
     * Lineage reference object : SSBSECT_GRADABLE_IND
     * 
     */
    @JsonProperty("gradableInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_GRADABLE_IND")
    private String gradableInd;
    @JsonProperty("stvsessDesc")
    private String stvsessDesc;
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
     * Start Dates
     * <p>
     * Lineage reference object : SSBSECT_LEARNER_REGSTART_FDATE
     * 
     */
    @JsonProperty("learnerRegstartFdate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LEARNER_REGSTART_FDATE")
    private Date learnerRegstartFdate;
    /**
     * Registered
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseatReg")
    private Double ssrseatReg;
    /**
     * Remaining
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SEATS_AVAIL")
    private Double seatsAvail;
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
    @JsonProperty("scbcrseCreditHrHigh")
    private Double scbcrseCreditHrHigh;
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
     * Special Approval
     * <p>
     * Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr
     * 
     */
    @JsonProperty("saprCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SAPR_CODE, Lookup lineage reference object : stvsapr")
    private String saprCode;
    @JsonProperty("scbcrseLabHrHigh")
    private Double scbcrseLabHrHigh;
    /**
     * Lineage reference object : SSBSECT_OVERRIDE_DUR_IND
     * 
     */
    @JsonProperty("overrideDurInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_OVERRIDE_DUR_IND")
    private String overrideDurInd;
    /**
     * Waitlist Remaining
     * <p>
     * Lineage reference object : SSBSECT_WAIT_AVAIL
     * 
     */
    @JsonProperty("waitAvail")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_WAIT_AVAIL")
    private Double waitAvail;
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
    @JsonProperty("ceuInd")
    private String ceuInd;
    /**
     * Other Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseOthHrInd")
    private String scbcrseOthHrInd;
    /**
     * Enrollment Count
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_ENRL
     * 
     */
    @JsonProperty("census2Enrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_2_ENRL")
    private Double census2Enrl;
    /**
     * Lineage reference object : SSBSECT_DUNT_CODE, Lookup lineage reference object : gtvdunt
     * 
     */
    @JsonProperty("duntCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_DUNT_CODE, Lookup lineage reference object : gtvdunt")
    private String duntCode;
    /**
     * Other
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseOthHrLow")
    private Double scbcrseOthHrLow;
    /**
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CREDIT_HRS")
    private Double creditHrs;
    @JsonProperty("scbcrseOthHrHigh")
    private Double scbcrseOthHrHigh;
    /**
     * Calculated Section Start Date(DD-MON-YYYY).
     * <p>
     * 
     * 
     */
    @JsonProperty("SectStartDate")
    private Date sectStartDate;
    /**
     * Daily Contact  Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("dch")
    private Double dch;
    /**
     * Projected
     * <p>
     * Lineage reference object : SSBSECT_PROJ_ENRL
     * (Required)
     * 
     */
    @JsonProperty("projEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PROJ_ENRL")
    private Double projEnrl;
    @JsonProperty("subjDesc")
    private String subjDesc;
    /**
     * Contact Hours Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseContHrInd")
    private String scbcrseContHrInd;
    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_2_DATE")
    private Date census2Date;
    @JsonProperty("gtvduntDesc")
    private String gtvduntDesc;
    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    private String title;
    @JsonProperty("stvsstsDesc")
    private String stvsstsDesc;
    @JsonProperty("stvcampDesc")
    private String stvcampDesc;
    /**
     * Pending
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseatPending")
    private Double ssrseatPending;
    @JsonProperty("stvsaprDesc")
    private String stvsaprDesc;
    @JsonProperty("gorintgDesc")
    private String gorintgDesc;
    /**
     * Registration Dates
     * <p>
     * Lineage reference object : SSBSECT_REG_FROM_DATE
     * 
     */
    @JsonProperty("regFromDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REG_FROM_DATE")
    private Date regFromDate;
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
     * Syllabus
     * <p>
     * 
     * 
     */
    @JsonProperty("syllabusInd")
    private String syllabusInd;
    /**
     * Credit Hours Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrInd")
    private String scbcrseCreditHrInd;
    /**
     * CAPP Areas for Prerequisites
     * <p>
     * Lineage reference object : SSBSECT_CAPP_PREREQ_TEST_IND
     * 
     */
    @JsonProperty("cappPrereqTestInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CAPP_PREREQ_TEST_IND")
    private String cappPrereqTestInd;
    /**
     * Waitlist Notification Ending Date
     * <p>
     * 
     * 
     */
    @JsonProperty("SectWLNotificationEndDate")
    private Date sectWLNotificationEndDate;
    /**
     * Contact Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseContHrLow")
    private Double scbcrseContHrLow;
    /**
     * Lineage reference object : SSBSECT_OTH_HR
     * 
     */
    @JsonProperty("othHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_OTH_HR")
    private Double othHr;
    /**
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("ptrmStartDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_START_DATE")
    private Date ptrmStartDate;
    /**
     * Lecture
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLecHrLow")
    private Double scbcrseLecHrLow;
    /**
     * Lineage reference object : SSBSECT_CONT_HR
     * 
     */
    @JsonProperty("contHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CONT_HR")
    private Double contHr;
    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod")
    private String gmodCode;
    /**
     * Waitlist Maximum
     * <p>
     * Lineage reference object : SSBSECT_WAIT_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("waitCapacity")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_WAIT_CAPACITY")
    private Double waitCapacity;
    @JsonProperty("scbcrseBillHrHigh")
    private Double scbcrseBillHrHigh;
    @JsonProperty("gtvinsmDesc")
    private String gtvinsmDesc;
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
    @JsonProperty("stvschdDesc")
    private String stvschdDesc;
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
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrLow")
    private Double scbcrseCreditHrLow;
    /**
     * Lecture Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLecHrInd")
    private String scbcrseLecHrInd;
    /**
     * Maximum
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * (Required)
     * 
     */
    @JsonProperty("maxEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_MAX_ENRL")
    private Double maxEnrl;
    /**
     * Pending
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseawPending")
    private Double ssrseawPending;
    /**
     * Print
     * <p>
     * Lineage reference object : SSBSECT_PRNT_IND
     * 
     */
    @JsonProperty("prntInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PRNT_IND")
    private String prntInd;
    /**
     * Duration
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("numberOfUnits")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_NUMBER_OF_UNITS")
    private Double numberOfUnits;
    /**
     * Waitlisted
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseawWaitlist")
    private Double ssrseawWaitlist;
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
     * Last
     * <p>
     * Lineage reference object : SSBSECT_REG_TO_DATE
     * 
     */
    @JsonProperty("regToDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REG_TO_DATE")
    private Date regToDate;
    /**
     * Enrollment Count
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL
     * 
     */
    @JsonProperty("censusEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_ENRL")
    private Double censusEnrl;
    /**
     * Part-of-Term End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("ptrmEndDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_END_DATE")
    private Date ptrmEndDate;
    /**
     * Prior
     * <p>
     * Lineage reference object : SSBSECT_PRIOR_ENRL
     * 
     */
    @JsonProperty("priorEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PRIOR_ENRL")
    private Double priorEnrl;
    /**
     * Waitlist Actual
     * <p>
     * Lineage reference object : SSBSECT_WAIT_COUNT
     * 
     */
    @JsonProperty("waitCount")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_WAIT_COUNT")
    private Double waitCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Generated Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_TOT_CREDIT_HRS
     * 
     */
    @JsonProperty("totCreditHrs")
    public Double getTotCreditHrs() {
        return totCreditHrs;
    }

    /**
     * Generated Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_TOT_CREDIT_HRS
     * 
     */
    @JsonProperty("totCreditHrs")
    public void setTotCreditHrs(Double totCreditHrs) {
        this.totCreditHrs = totCreditHrs;
    }

    public Ssbsect withTotCreditHrs(Double totCreditHrs) {
        this.totCreditHrs = totCreditHrs;
        return this;
    }

    /**
     * Billing Hours Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrInd")
    public String getScbcrseBillHrInd() {
        return scbcrseBillHrInd;
    }

    /**
     * Billing Hours Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrInd")
    public void setScbcrseBillHrInd(String scbcrseBillHrInd) {
        this.scbcrseBillHrInd = scbcrseBillHrInd;
    }

    public Ssbsect withScbcrseBillHrInd(String scbcrseBillHrInd) {
        this.scbcrseBillHrInd = scbcrseBillHrInd;
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

    public Ssbsect withTuiwInd(String tuiwInd) {
        this.tuiwInd = tuiwInd;
        return this;
    }

    @JsonProperty("acctDesc")
    public String getAcctDesc() {
        return acctDesc;
    }

    @JsonProperty("acctDesc")
    public void setAcctDesc(String acctDesc) {
        this.acctDesc = acctDesc;
    }

    public Ssbsect withAcctDesc(String acctDesc) {
        this.acctDesc = acctDesc;
        return this;
    }

    @JsonProperty("scbcrseContHrHigh")
    public Double getScbcrseContHrHigh() {
        return scbcrseContHrHigh;
    }

    @JsonProperty("scbcrseContHrHigh")
    public void setScbcrseContHrHigh(Double scbcrseContHrHigh) {
        this.scbcrseContHrHigh = scbcrseContHrHigh;
    }

    public Ssbsect withScbcrseContHrHigh(Double scbcrseContHrHigh) {
        this.scbcrseContHrHigh = scbcrseContHrHigh;
        return this;
    }

    /**
     * Actual
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("enrl")
    public Double getEnrl() {
        return enrl;
    }

    /**
     * Actual
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("enrl")
    public void setEnrl(Double enrl) {
        this.enrl = enrl;
    }

    public Ssbsect withEnrl(Double enrl) {
        this.enrl = enrl;
        return this;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrLow")
    public Double getScbcrseBillHrLow() {
        return scbcrseBillHrLow;
    }

    /**
     * Billing Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrLow")
    public void setScbcrseBillHrLow(Double scbcrseBillHrLow) {
        this.scbcrseBillHrLow = scbcrseBillHrLow;
    }

    public Ssbsect withScbcrseBillHrLow(Double scbcrseBillHrLow) {
        this.scbcrseBillHrLow = scbcrseBillHrLow;
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

    public Ssbsect withSchdCode(String schdCode) {
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

    public Ssbsect withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Lab
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLabHrLow")
    public Double getScbcrseLabHrLow() {
        return scbcrseLabHrLow;
    }

    /**
     * Lab
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLabHrLow")
    public void setScbcrseLabHrLow(Double scbcrseLabHrLow) {
        this.scbcrseLabHrLow = scbcrseLabHrLow;
    }

    public Ssbsect withScbcrseLabHrLow(Double scbcrseLabHrLow) {
        this.scbcrseLabHrLow = scbcrseLabHrLow;
        return this;
    }

    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SSBSECT_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public String getPrereqChkMethodCde() {
        return prereqChkMethodCde;
    }

    /**
     * Prerequisite Check Method
     * <p>
     * Lineage reference object : SSBSECT_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public void setPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
    }

    public Ssbsect withPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
        return this;
    }

    /**
     * Authorization Codes Active for Section
     * <p>
     * Lineage reference object : SSBSECT_REG_AUTH_ACTIVE_CDE
     * 
     */
    @JsonProperty("regAuthActiveCde")
    public String getRegAuthActiveCde() {
        return regAuthActiveCde;
    }

    /**
     * Authorization Codes Active for Section
     * <p>
     * Lineage reference object : SSBSECT_REG_AUTH_ACTIVE_CDE
     * 
     */
    @JsonProperty("regAuthActiveCde")
    public void setRegAuthActiveCde(String regAuthActiveCde) {
        this.regAuthActiveCde = regAuthActiveCde;
    }

    public Ssbsect withRegAuthActiveCde(String regAuthActiveCde) {
        this.regAuthActiveCde = regAuthActiveCde;
        return this;
    }

    /**
     * Reserved
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("reservedInd")
    public String getReservedInd() {
        return reservedInd;
    }

    /**
     * Reserved
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("reservedInd")
    public void setReservedInd(String reservedInd) {
        this.reservedInd = reservedInd;
    }

    public Ssbsect withReservedInd(String reservedInd) {
        this.reservedInd = reservedInd;
        return this;
    }

    /**
     * Long Title
     * <p>
     * 
     * 
     */
    @JsonProperty("longTitleInd")
    public String getLongTitleInd() {
        return longTitleInd;
    }

    /**
     * Long Title
     * <p>
     * 
     * 
     */
    @JsonProperty("longTitleInd")
    public void setLongTitleInd(String longTitleInd) {
        this.longTitleInd = longTitleInd;
    }

    public Ssbsect withLongTitleInd(String longTitleInd) {
        this.longTitleInd = longTitleInd;
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

    public Ssbsect withCampCode(String campCode) {
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

    public Ssbsect withLecHr(Double lecHr) {
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

    public Ssbsect withSstsCode(String sstsCode) {
        this.sstsCode = sstsCode;
        return this;
    }

    /**
     * Comments
     * <p>
     * 
     * 
     */
    @JsonProperty("commentInd")
    public String getCommentInd() {
        return commentInd;
    }

    /**
     * Comments
     * <p>
     * 
     * 
     */
    @JsonProperty("commentInd")
    public void setCommentInd(String commentInd) {
        this.commentInd = commentInd;
    }

    public Ssbsect withCommentInd(String commentInd) {
        this.commentInd = commentInd;
        return this;
    }

    @JsonProperty("scbcrseLecHrHigh")
    public Double getScbcrseLecHrHigh() {
        return scbcrseLecHrHigh;
    }

    @JsonProperty("scbcrseLecHrHigh")
    public void setScbcrseLecHrHigh(Double scbcrseLecHrHigh) {
        this.scbcrseLecHrHigh = scbcrseLecHrHigh;
    }

    public Ssbsect withScbcrseLecHrHigh(Double scbcrseLecHrHigh) {
        this.scbcrseLecHrHigh = scbcrseLecHrHigh;
        return this;
    }

    /**
     * Lab Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLabHrInd")
    public String getScbcrseLabHrInd() {
        return scbcrseLabHrInd;
    }

    /**
     * Lab Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLabHrInd")
    public void setScbcrseLabHrInd(String scbcrseLabHrInd) {
        this.scbcrseLabHrInd = scbcrseLabHrInd;
    }

    public Ssbsect withScbcrseLabHrInd(String scbcrseLabHrInd) {
        this.scbcrseLabHrInd = scbcrseLabHrInd;
        return this;
    }

    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusEnrlDate")
    public Date getCensusEnrlDate() {
        return censusEnrlDate;
    }

    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusEnrlDate")
    public void setCensusEnrlDate(Date censusEnrlDate) {
        this.censusEnrlDate = censusEnrlDate;
    }

    public Ssbsect withCensusEnrlDate(Date censusEnrlDate) {
        this.censusEnrlDate = censusEnrlDate;
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

    public Ssbsect withIntgCde(String intgCde) {
        this.intgCde = intgCde;
        return this;
    }

    /**
     * Maximum Extensions
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_EXTENSIONS
     * 
     */
    @JsonProperty("numberOfExtensions")
    public Double getNumberOfExtensions() {
        return numberOfExtensions;
    }

    /**
     * Maximum Extensions
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_EXTENSIONS
     * 
     */
    @JsonProperty("numberOfExtensions")
    public void setNumberOfExtensions(Double numberOfExtensions) {
        this.numberOfExtensions = numberOfExtensions;
    }

    public Ssbsect withNumberOfExtensions(Double numberOfExtensions) {
        this.numberOfExtensions = numberOfExtensions;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_LEARNER_REGSTART_TDATE
     * 
     */
    @JsonProperty("learnerRegstartTdate")
    public Date getLearnerRegstartTdate() {
        return learnerRegstartTdate;
    }

    /**
     * Lineage reference object : SSBSECT_LEARNER_REGSTART_TDATE
     * 
     */
    @JsonProperty("learnerRegstartTdate")
    public void setLearnerRegstartTdate(Date learnerRegstartTdate) {
        this.learnerRegstartTdate = learnerRegstartTdate;
    }

    public Ssbsect withLearnerRegstartTdate(Date learnerRegstartTdate) {
        this.learnerRegstartTdate = learnerRegstartTdate;
        return this;
    }

    @JsonProperty("stvgmodDesc")
    public String getStvgmodDesc() {
        return stvgmodDesc;
    }

    @JsonProperty("stvgmodDesc")
    public void setStvgmodDesc(String stvgmodDesc) {
        this.stvgmodDesc = stvgmodDesc;
    }

    public Ssbsect withStvgmodDesc(String stvgmodDesc) {
        this.stvgmodDesc = stvgmodDesc;
        return this;
    }

    /**
     * Weekly Contact Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("wch")
    public Double getWch() {
        return wch;
    }

    /**
     * Weekly Contact Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("wch")
    public void setWch(Double wch) {
        this.wch = wch;
    }

    public Ssbsect withWch(Double wch) {
        this.wch = wch;
        return this;
    }

    /**
     * Add Authorization Start Date(DD-MON-YYYY).
     * <p>
     * 
     * 
     */
    @JsonProperty("SectAuthStartDate")
    public Date getSectAuthStartDate() {
        return sectAuthStartDate;
    }

    /**
     * Add Authorization Start Date(DD-MON-YYYY).
     * <p>
     * 
     * 
     */
    @JsonProperty("SectAuthStartDate")
    public void setSectAuthStartDate(Date sectAuthStartDate) {
        this.sectAuthStartDate = sectAuthStartDate;
    }

    public Ssbsect withSectAuthStartDate(Date sectAuthStartDate) {
        this.sectAuthStartDate = sectAuthStartDate;
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

    public Ssbsect withGradableInd(String gradableInd) {
        this.gradableInd = gradableInd;
        return this;
    }

    @JsonProperty("stvsessDesc")
    public String getStvsessDesc() {
        return stvsessDesc;
    }

    @JsonProperty("stvsessDesc")
    public void setStvsessDesc(String stvsessDesc) {
        this.stvsessDesc = stvsessDesc;
    }

    public Ssbsect withStvsessDesc(String stvsessDesc) {
        this.stvsessDesc = stvsessDesc;
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

    public Ssbsect withXlstGroup(String xlstGroup) {
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

    public Ssbsect withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Start Dates
     * <p>
     * Lineage reference object : SSBSECT_LEARNER_REGSTART_FDATE
     * 
     */
    @JsonProperty("learnerRegstartFdate")
    public Date getLearnerRegstartFdate() {
        return learnerRegstartFdate;
    }

    /**
     * Start Dates
     * <p>
     * Lineage reference object : SSBSECT_LEARNER_REGSTART_FDATE
     * 
     */
    @JsonProperty("learnerRegstartFdate")
    public void setLearnerRegstartFdate(Date learnerRegstartFdate) {
        this.learnerRegstartFdate = learnerRegstartFdate;
    }

    public Ssbsect withLearnerRegstartFdate(Date learnerRegstartFdate) {
        this.learnerRegstartFdate = learnerRegstartFdate;
        return this;
    }

    /**
     * Registered
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseatReg")
    public Double getSsrseatReg() {
        return ssrseatReg;
    }

    /**
     * Registered
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseatReg")
    public void setSsrseatReg(Double ssrseatReg) {
        this.ssrseatReg = ssrseatReg;
    }

    public Ssbsect withSsrseatReg(Double ssrseatReg) {
        this.ssrseatReg = ssrseatReg;
        return this;
    }

    /**
     * Remaining
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    public Double getSeatsAvail() {
        return seatsAvail;
    }

    /**
     * Remaining
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    public void setSeatsAvail(Double seatsAvail) {
        this.seatsAvail = seatsAvail;
    }

    public Ssbsect withSeatsAvail(Double seatsAvail) {
        this.seatsAvail = seatsAvail;
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

    public Ssbsect withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    @JsonProperty("scbcrseCreditHrHigh")
    public Double getScbcrseCreditHrHigh() {
        return scbcrseCreditHrHigh;
    }

    @JsonProperty("scbcrseCreditHrHigh")
    public void setScbcrseCreditHrHigh(Double scbcrseCreditHrHigh) {
        this.scbcrseCreditHrHigh = scbcrseCreditHrHigh;
    }

    public Ssbsect withScbcrseCreditHrHigh(Double scbcrseCreditHrHigh) {
        this.scbcrseCreditHrHigh = scbcrseCreditHrHigh;
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

    public Ssbsect withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
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

    public Ssbsect withSaprCode(String saprCode) {
        this.saprCode = saprCode;
        return this;
    }

    @JsonProperty("scbcrseLabHrHigh")
    public Double getScbcrseLabHrHigh() {
        return scbcrseLabHrHigh;
    }

    @JsonProperty("scbcrseLabHrHigh")
    public void setScbcrseLabHrHigh(Double scbcrseLabHrHigh) {
        this.scbcrseLabHrHigh = scbcrseLabHrHigh;
    }

    public Ssbsect withScbcrseLabHrHigh(Double scbcrseLabHrHigh) {
        this.scbcrseLabHrHigh = scbcrseLabHrHigh;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_OVERRIDE_DUR_IND
     * 
     */
    @JsonProperty("overrideDurInd")
    public String getOverrideDurInd() {
        return overrideDurInd;
    }

    /**
     * Lineage reference object : SSBSECT_OVERRIDE_DUR_IND
     * 
     */
    @JsonProperty("overrideDurInd")
    public void setOverrideDurInd(String overrideDurInd) {
        this.overrideDurInd = overrideDurInd;
    }

    public Ssbsect withOverrideDurInd(String overrideDurInd) {
        this.overrideDurInd = overrideDurInd;
        return this;
    }

    /**
     * Waitlist Remaining
     * <p>
     * Lineage reference object : SSBSECT_WAIT_AVAIL
     * 
     */
    @JsonProperty("waitAvail")
    public Double getWaitAvail() {
        return waitAvail;
    }

    /**
     * Waitlist Remaining
     * <p>
     * Lineage reference object : SSBSECT_WAIT_AVAIL
     * 
     */
    @JsonProperty("waitAvail")
    public void setWaitAvail(Double waitAvail) {
        this.waitAvail = waitAvail;
    }

    public Ssbsect withWaitAvail(Double waitAvail) {
        this.waitAvail = waitAvail;
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

    public Ssbsect withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    @JsonProperty("ceuInd")
    public String getCeuInd() {
        return ceuInd;
    }

    @JsonProperty("ceuInd")
    public void setCeuInd(String ceuInd) {
        this.ceuInd = ceuInd;
    }

    public Ssbsect withCeuInd(String ceuInd) {
        this.ceuInd = ceuInd;
        return this;
    }

    /**
     * Other Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseOthHrInd")
    public String getScbcrseOthHrInd() {
        return scbcrseOthHrInd;
    }

    /**
     * Other Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseOthHrInd")
    public void setScbcrseOthHrInd(String scbcrseOthHrInd) {
        this.scbcrseOthHrInd = scbcrseOthHrInd;
    }

    public Ssbsect withScbcrseOthHrInd(String scbcrseOthHrInd) {
        this.scbcrseOthHrInd = scbcrseOthHrInd;
        return this;
    }

    /**
     * Enrollment Count
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_ENRL
     * 
     */
    @JsonProperty("census2Enrl")
    public Double getCensus2Enrl() {
        return census2Enrl;
    }

    /**
     * Enrollment Count
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_ENRL
     * 
     */
    @JsonProperty("census2Enrl")
    public void setCensus2Enrl(Double census2Enrl) {
        this.census2Enrl = census2Enrl;
    }

    public Ssbsect withCensus2Enrl(Double census2Enrl) {
        this.census2Enrl = census2Enrl;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_DUNT_CODE, Lookup lineage reference object : gtvdunt
     * 
     */
    @JsonProperty("duntCode")
    public String getDuntCode() {
        return duntCode;
    }

    /**
     * Lineage reference object : SSBSECT_DUNT_CODE, Lookup lineage reference object : gtvdunt
     * 
     */
    @JsonProperty("duntCode")
    public void setDuntCode(String duntCode) {
        this.duntCode = duntCode;
    }

    public Ssbsect withDuntCode(String duntCode) {
        this.duntCode = duntCode;
        return this;
    }

    /**
     * Other
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseOthHrLow")
    public Double getScbcrseOthHrLow() {
        return scbcrseOthHrLow;
    }

    /**
     * Other
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseOthHrLow")
    public void setScbcrseOthHrLow(Double scbcrseOthHrLow) {
        this.scbcrseOthHrLow = scbcrseOthHrLow;
    }

    public Ssbsect withScbcrseOthHrLow(Double scbcrseOthHrLow) {
        this.scbcrseOthHrLow = scbcrseOthHrLow;
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

    public Ssbsect withCreditHrs(Double creditHrs) {
        this.creditHrs = creditHrs;
        return this;
    }

    @JsonProperty("scbcrseOthHrHigh")
    public Double getScbcrseOthHrHigh() {
        return scbcrseOthHrHigh;
    }

    @JsonProperty("scbcrseOthHrHigh")
    public void setScbcrseOthHrHigh(Double scbcrseOthHrHigh) {
        this.scbcrseOthHrHigh = scbcrseOthHrHigh;
    }

    public Ssbsect withScbcrseOthHrHigh(Double scbcrseOthHrHigh) {
        this.scbcrseOthHrHigh = scbcrseOthHrHigh;
        return this;
    }

    /**
     * Calculated Section Start Date(DD-MON-YYYY).
     * <p>
     * 
     * 
     */
    @JsonProperty("SectStartDate")
    public Date getSectStartDate() {
        return sectStartDate;
    }

    /**
     * Calculated Section Start Date(DD-MON-YYYY).
     * <p>
     * 
     * 
     */
    @JsonProperty("SectStartDate")
    public void setSectStartDate(Date sectStartDate) {
        this.sectStartDate = sectStartDate;
    }

    public Ssbsect withSectStartDate(Date sectStartDate) {
        this.sectStartDate = sectStartDate;
        return this;
    }

    /**
     * Daily Contact  Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("dch")
    public Double getDch() {
        return dch;
    }

    /**
     * Daily Contact  Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("dch")
    public void setDch(Double dch) {
        this.dch = dch;
    }

    public Ssbsect withDch(Double dch) {
        this.dch = dch;
        return this;
    }

    /**
     * Projected
     * <p>
     * Lineage reference object : SSBSECT_PROJ_ENRL
     * (Required)
     * 
     */
    @JsonProperty("projEnrl")
    public Double getProjEnrl() {
        return projEnrl;
    }

    /**
     * Projected
     * <p>
     * Lineage reference object : SSBSECT_PROJ_ENRL
     * (Required)
     * 
     */
    @JsonProperty("projEnrl")
    public void setProjEnrl(Double projEnrl) {
        this.projEnrl = projEnrl;
    }

    public Ssbsect withProjEnrl(Double projEnrl) {
        this.projEnrl = projEnrl;
        return this;
    }

    @JsonProperty("subjDesc")
    public String getSubjDesc() {
        return subjDesc;
    }

    @JsonProperty("subjDesc")
    public void setSubjDesc(String subjDesc) {
        this.subjDesc = subjDesc;
    }

    public Ssbsect withSubjDesc(String subjDesc) {
        this.subjDesc = subjDesc;
        return this;
    }

    /**
     * Contact Hours Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseContHrInd")
    public String getScbcrseContHrInd() {
        return scbcrseContHrInd;
    }

    /**
     * Contact Hours Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseContHrInd")
    public void setScbcrseContHrInd(String scbcrseContHrInd) {
        this.scbcrseContHrInd = scbcrseContHrInd;
    }

    public Ssbsect withScbcrseContHrInd(String scbcrseContHrInd) {
        this.scbcrseContHrInd = scbcrseContHrInd;
        return this;
    }

    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    public Date getCensus2Date() {
        return census2Date;
    }

    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    public void setCensus2Date(Date census2Date) {
        this.census2Date = census2Date;
    }

    public Ssbsect withCensus2Date(Date census2Date) {
        this.census2Date = census2Date;
        return this;
    }

    @JsonProperty("gtvduntDesc")
    public String getGtvduntDesc() {
        return gtvduntDesc;
    }

    @JsonProperty("gtvduntDesc")
    public void setGtvduntDesc(String gtvduntDesc) {
        this.gtvduntDesc = gtvduntDesc;
    }

    public Ssbsect withGtvduntDesc(String gtvduntDesc) {
        this.gtvduntDesc = gtvduntDesc;
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

    public Ssbsect withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("stvsstsDesc")
    public String getStvsstsDesc() {
        return stvsstsDesc;
    }

    @JsonProperty("stvsstsDesc")
    public void setStvsstsDesc(String stvsstsDesc) {
        this.stvsstsDesc = stvsstsDesc;
    }

    public Ssbsect withStvsstsDesc(String stvsstsDesc) {
        this.stvsstsDesc = stvsstsDesc;
        return this;
    }

    @JsonProperty("stvcampDesc")
    public String getStvcampDesc() {
        return stvcampDesc;
    }

    @JsonProperty("stvcampDesc")
    public void setStvcampDesc(String stvcampDesc) {
        this.stvcampDesc = stvcampDesc;
    }

    public Ssbsect withStvcampDesc(String stvcampDesc) {
        this.stvcampDesc = stvcampDesc;
        return this;
    }

    /**
     * Pending
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseatPending")
    public Double getSsrseatPending() {
        return ssrseatPending;
    }

    /**
     * Pending
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseatPending")
    public void setSsrseatPending(Double ssrseatPending) {
        this.ssrseatPending = ssrseatPending;
    }

    public Ssbsect withSsrseatPending(Double ssrseatPending) {
        this.ssrseatPending = ssrseatPending;
        return this;
    }

    @JsonProperty("stvsaprDesc")
    public String getStvsaprDesc() {
        return stvsaprDesc;
    }

    @JsonProperty("stvsaprDesc")
    public void setStvsaprDesc(String stvsaprDesc) {
        this.stvsaprDesc = stvsaprDesc;
    }

    public Ssbsect withStvsaprDesc(String stvsaprDesc) {
        this.stvsaprDesc = stvsaprDesc;
        return this;
    }

    @JsonProperty("gorintgDesc")
    public String getGorintgDesc() {
        return gorintgDesc;
    }

    @JsonProperty("gorintgDesc")
    public void setGorintgDesc(String gorintgDesc) {
        this.gorintgDesc = gorintgDesc;
    }

    public Ssbsect withGorintgDesc(String gorintgDesc) {
        this.gorintgDesc = gorintgDesc;
        return this;
    }

    /**
     * Registration Dates
     * <p>
     * Lineage reference object : SSBSECT_REG_FROM_DATE
     * 
     */
    @JsonProperty("regFromDate")
    public Date getRegFromDate() {
        return regFromDate;
    }

    /**
     * Registration Dates
     * <p>
     * Lineage reference object : SSBSECT_REG_FROM_DATE
     * 
     */
    @JsonProperty("regFromDate")
    public void setRegFromDate(Date regFromDate) {
        this.regFromDate = regFromDate;
    }

    public Ssbsect withRegFromDate(Date regFromDate) {
        this.regFromDate = regFromDate;
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

    public Ssbsect withBillHrs(Double billHrs) {
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

    public Ssbsect withVoiceAvail(String voiceAvail) {
        this.voiceAvail = voiceAvail;
        return this;
    }

    /**
     * Syllabus
     * <p>
     * 
     * 
     */
    @JsonProperty("syllabusInd")
    public String getSyllabusInd() {
        return syllabusInd;
    }

    /**
     * Syllabus
     * <p>
     * 
     * 
     */
    @JsonProperty("syllabusInd")
    public void setSyllabusInd(String syllabusInd) {
        this.syllabusInd = syllabusInd;
    }

    public Ssbsect withSyllabusInd(String syllabusInd) {
        this.syllabusInd = syllabusInd;
        return this;
    }

    /**
     * Credit Hours Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrInd")
    public String getScbcrseCreditHrInd() {
        return scbcrseCreditHrInd;
    }

    /**
     * Credit Hours Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrInd")
    public void setScbcrseCreditHrInd(String scbcrseCreditHrInd) {
        this.scbcrseCreditHrInd = scbcrseCreditHrInd;
    }

    public Ssbsect withScbcrseCreditHrInd(String scbcrseCreditHrInd) {
        this.scbcrseCreditHrInd = scbcrseCreditHrInd;
        return this;
    }

    /**
     * CAPP Areas for Prerequisites
     * <p>
     * Lineage reference object : SSBSECT_CAPP_PREREQ_TEST_IND
     * 
     */
    @JsonProperty("cappPrereqTestInd")
    public String getCappPrereqTestInd() {
        return cappPrereqTestInd;
    }

    /**
     * CAPP Areas for Prerequisites
     * <p>
     * Lineage reference object : SSBSECT_CAPP_PREREQ_TEST_IND
     * 
     */
    @JsonProperty("cappPrereqTestInd")
    public void setCappPrereqTestInd(String cappPrereqTestInd) {
        this.cappPrereqTestInd = cappPrereqTestInd;
    }

    public Ssbsect withCappPrereqTestInd(String cappPrereqTestInd) {
        this.cappPrereqTestInd = cappPrereqTestInd;
        return this;
    }

    /**
     * Waitlist Notification Ending Date
     * <p>
     * 
     * 
     */
    @JsonProperty("SectWLNotificationEndDate")
    public Date getSectWLNotificationEndDate() {
        return sectWLNotificationEndDate;
    }

    /**
     * Waitlist Notification Ending Date
     * <p>
     * 
     * 
     */
    @JsonProperty("SectWLNotificationEndDate")
    public void setSectWLNotificationEndDate(Date sectWLNotificationEndDate) {
        this.sectWLNotificationEndDate = sectWLNotificationEndDate;
    }

    public Ssbsect withSectWLNotificationEndDate(Date sectWLNotificationEndDate) {
        this.sectWLNotificationEndDate = sectWLNotificationEndDate;
        return this;
    }

    /**
     * Contact Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseContHrLow")
    public Double getScbcrseContHrLow() {
        return scbcrseContHrLow;
    }

    /**
     * Contact Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseContHrLow")
    public void setScbcrseContHrLow(Double scbcrseContHrLow) {
        this.scbcrseContHrLow = scbcrseContHrLow;
    }

    public Ssbsect withScbcrseContHrLow(Double scbcrseContHrLow) {
        this.scbcrseContHrLow = scbcrseContHrLow;
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

    public Ssbsect withOthHr(Double othHr) {
        this.othHr = othHr;
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

    public Ssbsect withPtrmStartDate(Date ptrmStartDate) {
        this.ptrmStartDate = ptrmStartDate;
        return this;
    }

    /**
     * Lecture
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLecHrLow")
    public Double getScbcrseLecHrLow() {
        return scbcrseLecHrLow;
    }

    /**
     * Lecture
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLecHrLow")
    public void setScbcrseLecHrLow(Double scbcrseLecHrLow) {
        this.scbcrseLecHrLow = scbcrseLecHrLow;
    }

    public Ssbsect withScbcrseLecHrLow(Double scbcrseLecHrLow) {
        this.scbcrseLecHrLow = scbcrseLecHrLow;
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

    public Ssbsect withContHr(Double contHr) {
        this.contHr = contHr;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public Ssbsect withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Waitlist Maximum
     * <p>
     * Lineage reference object : SSBSECT_WAIT_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("waitCapacity")
    public Double getWaitCapacity() {
        return waitCapacity;
    }

    /**
     * Waitlist Maximum
     * <p>
     * Lineage reference object : SSBSECT_WAIT_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("waitCapacity")
    public void setWaitCapacity(Double waitCapacity) {
        this.waitCapacity = waitCapacity;
    }

    public Ssbsect withWaitCapacity(Double waitCapacity) {
        this.waitCapacity = waitCapacity;
        return this;
    }

    @JsonProperty("scbcrseBillHrHigh")
    public Double getScbcrseBillHrHigh() {
        return scbcrseBillHrHigh;
    }

    @JsonProperty("scbcrseBillHrHigh")
    public void setScbcrseBillHrHigh(Double scbcrseBillHrHigh) {
        this.scbcrseBillHrHigh = scbcrseBillHrHigh;
    }

    public Ssbsect withScbcrseBillHrHigh(Double scbcrseBillHrHigh) {
        this.scbcrseBillHrHigh = scbcrseBillHrHigh;
        return this;
    }

    @JsonProperty("gtvinsmDesc")
    public String getGtvinsmDesc() {
        return gtvinsmDesc;
    }

    @JsonProperty("gtvinsmDesc")
    public void setGtvinsmDesc(String gtvinsmDesc) {
        this.gtvinsmDesc = gtvinsmDesc;
    }

    public Ssbsect withGtvinsmDesc(String gtvinsmDesc) {
        this.gtvinsmDesc = gtvinsmDesc;
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

    public Ssbsect withLinkIdent(String linkIdent) {
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

    public Ssbsect withLabHr(Double labHr) {
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

    public Ssbsect withInsmCode(String insmCode) {
        this.insmCode = insmCode;
        return this;
    }

    @JsonProperty("stvschdDesc")
    public String getStvschdDesc() {
        return stvschdDesc;
    }

    @JsonProperty("stvschdDesc")
    public void setStvschdDesc(String stvschdDesc) {
        this.stvschdDesc = stvschdDesc;
    }

    public Ssbsect withStvschdDesc(String stvschdDesc) {
        this.stvschdDesc = stvschdDesc;
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

    public Ssbsect withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrLow")
    public Double getScbcrseCreditHrLow() {
        return scbcrseCreditHrLow;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrLow")
    public void setScbcrseCreditHrLow(Double scbcrseCreditHrLow) {
        this.scbcrseCreditHrLow = scbcrseCreditHrLow;
    }

    public Ssbsect withScbcrseCreditHrLow(Double scbcrseCreditHrLow) {
        this.scbcrseCreditHrLow = scbcrseCreditHrLow;
        return this;
    }

    /**
     * Lecture Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLecHrInd")
    public String getScbcrseLecHrInd() {
        return scbcrseLecHrInd;
    }

    /**
     * Lecture Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLecHrInd")
    public void setScbcrseLecHrInd(String scbcrseLecHrInd) {
        this.scbcrseLecHrInd = scbcrseLecHrInd;
    }

    public Ssbsect withScbcrseLecHrInd(String scbcrseLecHrInd) {
        this.scbcrseLecHrInd = scbcrseLecHrInd;
        return this;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * (Required)
     * 
     */
    @JsonProperty("maxEnrl")
    public Double getMaxEnrl() {
        return maxEnrl;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * (Required)
     * 
     */
    @JsonProperty("maxEnrl")
    public void setMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
    }

    public Ssbsect withMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
        return this;
    }

    /**
     * Pending
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseawPending")
    public Double getSsrseawPending() {
        return ssrseawPending;
    }

    /**
     * Pending
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseawPending")
    public void setSsrseawPending(Double ssrseawPending) {
        this.ssrseawPending = ssrseawPending;
    }

    public Ssbsect withSsrseawPending(Double ssrseawPending) {
        this.ssrseawPending = ssrseawPending;
        return this;
    }

    /**
     * Print
     * <p>
     * Lineage reference object : SSBSECT_PRNT_IND
     * 
     */
    @JsonProperty("prntInd")
    public String getPrntInd() {
        return prntInd;
    }

    /**
     * Print
     * <p>
     * Lineage reference object : SSBSECT_PRNT_IND
     * 
     */
    @JsonProperty("prntInd")
    public void setPrntInd(String prntInd) {
        this.prntInd = prntInd;
    }

    public Ssbsect withPrntInd(String prntInd) {
        this.prntInd = prntInd;
        return this;
    }

    /**
     * Duration
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("numberOfUnits")
    public Double getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Duration
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("numberOfUnits")
    public void setNumberOfUnits(Double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public Ssbsect withNumberOfUnits(Double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
        return this;
    }

    /**
     * Waitlisted
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseawWaitlist")
    public Double getSsrseawWaitlist() {
        return ssrseawWaitlist;
    }

    /**
     * Waitlisted
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrseawWaitlist")
    public void setSsrseawWaitlist(Double ssrseawWaitlist) {
        this.ssrseawWaitlist = ssrseawWaitlist;
    }

    public Ssbsect withSsrseawWaitlist(Double ssrseawWaitlist) {
        this.ssrseawWaitlist = ssrseawWaitlist;
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

    public Ssbsect withPtrmWeeks(Double ptrmWeeks) {
        this.ptrmWeeks = ptrmWeeks;
        return this;
    }

    /**
     * Last
     * <p>
     * Lineage reference object : SSBSECT_REG_TO_DATE
     * 
     */
    @JsonProperty("regToDate")
    public Date getRegToDate() {
        return regToDate;
    }

    /**
     * Last
     * <p>
     * Lineage reference object : SSBSECT_REG_TO_DATE
     * 
     */
    @JsonProperty("regToDate")
    public void setRegToDate(Date regToDate) {
        this.regToDate = regToDate;
    }

    public Ssbsect withRegToDate(Date regToDate) {
        this.regToDate = regToDate;
        return this;
    }

    /**
     * Enrollment Count
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL
     * 
     */
    @JsonProperty("censusEnrl")
    public Double getCensusEnrl() {
        return censusEnrl;
    }

    /**
     * Enrollment Count
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL
     * 
     */
    @JsonProperty("censusEnrl")
    public void setCensusEnrl(Double censusEnrl) {
        this.censusEnrl = censusEnrl;
    }

    public Ssbsect withCensusEnrl(Double censusEnrl) {
        this.censusEnrl = censusEnrl;
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

    public Ssbsect withPtrmEndDate(Date ptrmEndDate) {
        this.ptrmEndDate = ptrmEndDate;
        return this;
    }

    /**
     * Prior
     * <p>
     * Lineage reference object : SSBSECT_PRIOR_ENRL
     * 
     */
    @JsonProperty("priorEnrl")
    public Double getPriorEnrl() {
        return priorEnrl;
    }

    /**
     * Prior
     * <p>
     * Lineage reference object : SSBSECT_PRIOR_ENRL
     * 
     */
    @JsonProperty("priorEnrl")
    public void setPriorEnrl(Double priorEnrl) {
        this.priorEnrl = priorEnrl;
    }

    public Ssbsect withPriorEnrl(Double priorEnrl) {
        this.priorEnrl = priorEnrl;
        return this;
    }

    /**
     * Waitlist Actual
     * <p>
     * Lineage reference object : SSBSECT_WAIT_COUNT
     * 
     */
    @JsonProperty("waitCount")
    public Double getWaitCount() {
        return waitCount;
    }

    /**
     * Waitlist Actual
     * <p>
     * Lineage reference object : SSBSECT_WAIT_COUNT
     * 
     */
    @JsonProperty("waitCount")
    public void setWaitCount(Double waitCount) {
        this.waitCount = waitCount;
    }

    public Ssbsect withWaitCount(Double waitCount) {
        this.waitCount = waitCount;
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

    public Ssbsect withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssbsect.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totCreditHrs");
        sb.append('=');
        sb.append(((this.totCreditHrs == null)?"<null>":this.totCreditHrs));
        sb.append(',');
        sb.append("scbcrseBillHrInd");
        sb.append('=');
        sb.append(((this.scbcrseBillHrInd == null)?"<null>":this.scbcrseBillHrInd));
        sb.append(',');
        sb.append("tuiwInd");
        sb.append('=');
        sb.append(((this.tuiwInd == null)?"<null>":this.tuiwInd));
        sb.append(',');
        sb.append("acctDesc");
        sb.append('=');
        sb.append(((this.acctDesc == null)?"<null>":this.acctDesc));
        sb.append(',');
        sb.append("scbcrseContHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseContHrHigh == null)?"<null>":this.scbcrseContHrHigh));
        sb.append(',');
        sb.append("enrl");
        sb.append('=');
        sb.append(((this.enrl == null)?"<null>":this.enrl));
        sb.append(',');
        sb.append("scbcrseBillHrLow");
        sb.append('=');
        sb.append(((this.scbcrseBillHrLow == null)?"<null>":this.scbcrseBillHrLow));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("scbcrseLabHrLow");
        sb.append('=');
        sb.append(((this.scbcrseLabHrLow == null)?"<null>":this.scbcrseLabHrLow));
        sb.append(',');
        sb.append("prereqChkMethodCde");
        sb.append('=');
        sb.append(((this.prereqChkMethodCde == null)?"<null>":this.prereqChkMethodCde));
        sb.append(',');
        sb.append("regAuthActiveCde");
        sb.append('=');
        sb.append(((this.regAuthActiveCde == null)?"<null>":this.regAuthActiveCde));
        sb.append(',');
        sb.append("reservedInd");
        sb.append('=');
        sb.append(((this.reservedInd == null)?"<null>":this.reservedInd));
        sb.append(',');
        sb.append("longTitleInd");
        sb.append('=');
        sb.append(((this.longTitleInd == null)?"<null>":this.longTitleInd));
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
        sb.append("commentInd");
        sb.append('=');
        sb.append(((this.commentInd == null)?"<null>":this.commentInd));
        sb.append(',');
        sb.append("scbcrseLecHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseLecHrHigh == null)?"<null>":this.scbcrseLecHrHigh));
        sb.append(',');
        sb.append("scbcrseLabHrInd");
        sb.append('=');
        sb.append(((this.scbcrseLabHrInd == null)?"<null>":this.scbcrseLabHrInd));
        sb.append(',');
        sb.append("censusEnrlDate");
        sb.append('=');
        sb.append(((this.censusEnrlDate == null)?"<null>":this.censusEnrlDate));
        sb.append(',');
        sb.append("intgCde");
        sb.append('=');
        sb.append(((this.intgCde == null)?"<null>":this.intgCde));
        sb.append(',');
        sb.append("numberOfExtensions");
        sb.append('=');
        sb.append(((this.numberOfExtensions == null)?"<null>":this.numberOfExtensions));
        sb.append(',');
        sb.append("learnerRegstartTdate");
        sb.append('=');
        sb.append(((this.learnerRegstartTdate == null)?"<null>":this.learnerRegstartTdate));
        sb.append(',');
        sb.append("stvgmodDesc");
        sb.append('=');
        sb.append(((this.stvgmodDesc == null)?"<null>":this.stvgmodDesc));
        sb.append(',');
        sb.append("wch");
        sb.append('=');
        sb.append(((this.wch == null)?"<null>":this.wch));
        sb.append(',');
        sb.append("sectAuthStartDate");
        sb.append('=');
        sb.append(((this.sectAuthStartDate == null)?"<null>":this.sectAuthStartDate));
        sb.append(',');
        sb.append("gradableInd");
        sb.append('=');
        sb.append(((this.gradableInd == null)?"<null>":this.gradableInd));
        sb.append(',');
        sb.append("stvsessDesc");
        sb.append('=');
        sb.append(((this.stvsessDesc == null)?"<null>":this.stvsessDesc));
        sb.append(',');
        sb.append("xlstGroup");
        sb.append('=');
        sb.append(((this.xlstGroup == null)?"<null>":this.xlstGroup));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("learnerRegstartFdate");
        sb.append('=');
        sb.append(((this.learnerRegstartFdate == null)?"<null>":this.learnerRegstartFdate));
        sb.append(',');
        sb.append("ssrseatReg");
        sb.append('=');
        sb.append(((this.ssrseatReg == null)?"<null>":this.ssrseatReg));
        sb.append(',');
        sb.append("seatsAvail");
        sb.append('=');
        sb.append(((this.seatsAvail == null)?"<null>":this.seatsAvail));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("scbcrseCreditHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseCreditHrHigh == null)?"<null>":this.scbcrseCreditHrHigh));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("saprCode");
        sb.append('=');
        sb.append(((this.saprCode == null)?"<null>":this.saprCode));
        sb.append(',');
        sb.append("scbcrseLabHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseLabHrHigh == null)?"<null>":this.scbcrseLabHrHigh));
        sb.append(',');
        sb.append("overrideDurInd");
        sb.append('=');
        sb.append(((this.overrideDurInd == null)?"<null>":this.overrideDurInd));
        sb.append(',');
        sb.append("waitAvail");
        sb.append('=');
        sb.append(((this.waitAvail == null)?"<null>":this.waitAvail));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("ceuInd");
        sb.append('=');
        sb.append(((this.ceuInd == null)?"<null>":this.ceuInd));
        sb.append(',');
        sb.append("scbcrseOthHrInd");
        sb.append('=');
        sb.append(((this.scbcrseOthHrInd == null)?"<null>":this.scbcrseOthHrInd));
        sb.append(',');
        sb.append("census2Enrl");
        sb.append('=');
        sb.append(((this.census2Enrl == null)?"<null>":this.census2Enrl));
        sb.append(',');
        sb.append("duntCode");
        sb.append('=');
        sb.append(((this.duntCode == null)?"<null>":this.duntCode));
        sb.append(',');
        sb.append("scbcrseOthHrLow");
        sb.append('=');
        sb.append(((this.scbcrseOthHrLow == null)?"<null>":this.scbcrseOthHrLow));
        sb.append(',');
        sb.append("creditHrs");
        sb.append('=');
        sb.append(((this.creditHrs == null)?"<null>":this.creditHrs));
        sb.append(',');
        sb.append("scbcrseOthHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseOthHrHigh == null)?"<null>":this.scbcrseOthHrHigh));
        sb.append(',');
        sb.append("sectStartDate");
        sb.append('=');
        sb.append(((this.sectStartDate == null)?"<null>":this.sectStartDate));
        sb.append(',');
        sb.append("dch");
        sb.append('=');
        sb.append(((this.dch == null)?"<null>":this.dch));
        sb.append(',');
        sb.append("projEnrl");
        sb.append('=');
        sb.append(((this.projEnrl == null)?"<null>":this.projEnrl));
        sb.append(',');
        sb.append("subjDesc");
        sb.append('=');
        sb.append(((this.subjDesc == null)?"<null>":this.subjDesc));
        sb.append(',');
        sb.append("scbcrseContHrInd");
        sb.append('=');
        sb.append(((this.scbcrseContHrInd == null)?"<null>":this.scbcrseContHrInd));
        sb.append(',');
        sb.append("census2Date");
        sb.append('=');
        sb.append(((this.census2Date == null)?"<null>":this.census2Date));
        sb.append(',');
        sb.append("gtvduntDesc");
        sb.append('=');
        sb.append(((this.gtvduntDesc == null)?"<null>":this.gtvduntDesc));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("stvsstsDesc");
        sb.append('=');
        sb.append(((this.stvsstsDesc == null)?"<null>":this.stvsstsDesc));
        sb.append(',');
        sb.append("stvcampDesc");
        sb.append('=');
        sb.append(((this.stvcampDesc == null)?"<null>":this.stvcampDesc));
        sb.append(',');
        sb.append("ssrseatPending");
        sb.append('=');
        sb.append(((this.ssrseatPending == null)?"<null>":this.ssrseatPending));
        sb.append(',');
        sb.append("stvsaprDesc");
        sb.append('=');
        sb.append(((this.stvsaprDesc == null)?"<null>":this.stvsaprDesc));
        sb.append(',');
        sb.append("gorintgDesc");
        sb.append('=');
        sb.append(((this.gorintgDesc == null)?"<null>":this.gorintgDesc));
        sb.append(',');
        sb.append("regFromDate");
        sb.append('=');
        sb.append(((this.regFromDate == null)?"<null>":this.regFromDate));
        sb.append(',');
        sb.append("billHrs");
        sb.append('=');
        sb.append(((this.billHrs == null)?"<null>":this.billHrs));
        sb.append(',');
        sb.append("voiceAvail");
        sb.append('=');
        sb.append(((this.voiceAvail == null)?"<null>":this.voiceAvail));
        sb.append(',');
        sb.append("syllabusInd");
        sb.append('=');
        sb.append(((this.syllabusInd == null)?"<null>":this.syllabusInd));
        sb.append(',');
        sb.append("scbcrseCreditHrInd");
        sb.append('=');
        sb.append(((this.scbcrseCreditHrInd == null)?"<null>":this.scbcrseCreditHrInd));
        sb.append(',');
        sb.append("cappPrereqTestInd");
        sb.append('=');
        sb.append(((this.cappPrereqTestInd == null)?"<null>":this.cappPrereqTestInd));
        sb.append(',');
        sb.append("sectWLNotificationEndDate");
        sb.append('=');
        sb.append(((this.sectWLNotificationEndDate == null)?"<null>":this.sectWLNotificationEndDate));
        sb.append(',');
        sb.append("scbcrseContHrLow");
        sb.append('=');
        sb.append(((this.scbcrseContHrLow == null)?"<null>":this.scbcrseContHrLow));
        sb.append(',');
        sb.append("othHr");
        sb.append('=');
        sb.append(((this.othHr == null)?"<null>":this.othHr));
        sb.append(',');
        sb.append("ptrmStartDate");
        sb.append('=');
        sb.append(((this.ptrmStartDate == null)?"<null>":this.ptrmStartDate));
        sb.append(',');
        sb.append("scbcrseLecHrLow");
        sb.append('=');
        sb.append(((this.scbcrseLecHrLow == null)?"<null>":this.scbcrseLecHrLow));
        sb.append(',');
        sb.append("contHr");
        sb.append('=');
        sb.append(((this.contHr == null)?"<null>":this.contHr));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("waitCapacity");
        sb.append('=');
        sb.append(((this.waitCapacity == null)?"<null>":this.waitCapacity));
        sb.append(',');
        sb.append("scbcrseBillHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseBillHrHigh == null)?"<null>":this.scbcrseBillHrHigh));
        sb.append(',');
        sb.append("gtvinsmDesc");
        sb.append('=');
        sb.append(((this.gtvinsmDesc == null)?"<null>":this.gtvinsmDesc));
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
        sb.append("stvschdDesc");
        sb.append('=');
        sb.append(((this.stvschdDesc == null)?"<null>":this.stvschdDesc));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("scbcrseCreditHrLow");
        sb.append('=');
        sb.append(((this.scbcrseCreditHrLow == null)?"<null>":this.scbcrseCreditHrLow));
        sb.append(',');
        sb.append("scbcrseLecHrInd");
        sb.append('=');
        sb.append(((this.scbcrseLecHrInd == null)?"<null>":this.scbcrseLecHrInd));
        sb.append(',');
        sb.append("maxEnrl");
        sb.append('=');
        sb.append(((this.maxEnrl == null)?"<null>":this.maxEnrl));
        sb.append(',');
        sb.append("ssrseawPending");
        sb.append('=');
        sb.append(((this.ssrseawPending == null)?"<null>":this.ssrseawPending));
        sb.append(',');
        sb.append("prntInd");
        sb.append('=');
        sb.append(((this.prntInd == null)?"<null>":this.prntInd));
        sb.append(',');
        sb.append("numberOfUnits");
        sb.append('=');
        sb.append(((this.numberOfUnits == null)?"<null>":this.numberOfUnits));
        sb.append(',');
        sb.append("ssrseawWaitlist");
        sb.append('=');
        sb.append(((this.ssrseawWaitlist == null)?"<null>":this.ssrseawWaitlist));
        sb.append(',');
        sb.append("ptrmWeeks");
        sb.append('=');
        sb.append(((this.ptrmWeeks == null)?"<null>":this.ptrmWeeks));
        sb.append(',');
        sb.append("regToDate");
        sb.append('=');
        sb.append(((this.regToDate == null)?"<null>":this.regToDate));
        sb.append(',');
        sb.append("censusEnrl");
        sb.append('=');
        sb.append(((this.censusEnrl == null)?"<null>":this.censusEnrl));
        sb.append(',');
        sb.append("ptrmEndDate");
        sb.append('=');
        sb.append(((this.ptrmEndDate == null)?"<null>":this.ptrmEndDate));
        sb.append(',');
        sb.append("priorEnrl");
        sb.append('=');
        sb.append(((this.priorEnrl == null)?"<null>":this.priorEnrl));
        sb.append(',');
        sb.append("waitCount");
        sb.append('=');
        sb.append(((this.waitCount == null)?"<null>":this.waitCount));
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
        result = ((result* 31)+((this.totCreditHrs == null)? 0 :this.totCreditHrs.hashCode()));
        result = ((result* 31)+((this.sectStartDate == null)? 0 :this.sectStartDate.hashCode()));
        result = ((result* 31)+((this.tuiwInd == null)? 0 :this.tuiwInd.hashCode()));
        result = ((result* 31)+((this.scbcrseContHrHigh == null)? 0 :this.scbcrseContHrHigh.hashCode()));
        result = ((result* 31)+((this.scbcrseBillHrLow == null)? 0 :this.scbcrseBillHrLow.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.scbcrseLabHrLow == null)? 0 :this.scbcrseLabHrLow.hashCode()));
        result = ((result* 31)+((this.regAuthActiveCde == null)? 0 :this.regAuthActiveCde.hashCode()));
        result = ((result* 31)+((this.intgCde == null)? 0 :this.intgCde.hashCode()));
        result = ((result* 31)+((this.numberOfExtensions == null)? 0 :this.numberOfExtensions.hashCode()));
        result = ((result* 31)+((this.learnerRegstartTdate == null)? 0 :this.learnerRegstartTdate.hashCode()));
        result = ((result* 31)+((this.wch == null)? 0 :this.wch.hashCode()));
        result = ((result* 31)+((this.gradableInd == null)? 0 :this.gradableInd.hashCode()));
        result = ((result* 31)+((this.stvsessDesc == null)? 0 :this.stvsessDesc.hashCode()));
        result = ((result* 31)+((this.seatsAvail == null)? 0 :this.seatsAvail.hashCode()));
        result = ((result* 31)+((this.saprCode == null)? 0 :this.saprCode.hashCode()));
        result = ((result* 31)+((this.scbcrseLabHrHigh == null)? 0 :this.scbcrseLabHrHigh.hashCode()));
        result = ((result* 31)+((this.waitAvail == null)? 0 :this.waitAvail.hashCode()));
        result = ((result* 31)+((this.ceuInd == null)? 0 :this.ceuInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scbcrseOthHrInd == null)? 0 :this.scbcrseOthHrInd.hashCode()));
        result = ((result* 31)+((this.sectWLNotificationEndDate == null)? 0 :this.sectWLNotificationEndDate.hashCode()));
        result = ((result* 31)+((this.sectAuthStartDate == null)? 0 :this.sectAuthStartDate.hashCode()));
        result = ((result* 31)+((this.scbcrseOthHrHigh == null)? 0 :this.scbcrseOthHrHigh.hashCode()));
        result = ((result* 31)+((this.subjDesc == null)? 0 :this.subjDesc.hashCode()));
        result = ((result* 31)+((this.gtvduntDesc == null)? 0 :this.gtvduntDesc.hashCode()));
        result = ((result* 31)+((this.ssrseatPending == null)? 0 :this.ssrseatPending.hashCode()));
        result = ((result* 31)+((this.billHrs == null)? 0 :this.billHrs.hashCode()));
        result = ((result* 31)+((this.scbcrseCreditHrInd == null)? 0 :this.scbcrseCreditHrInd.hashCode()));
        result = ((result* 31)+((this.scbcrseContHrLow == null)? 0 :this.scbcrseContHrLow.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.waitCapacity == null)? 0 :this.waitCapacity.hashCode()));
        result = ((result* 31)+((this.scbcrseBillHrHigh == null)? 0 :this.scbcrseBillHrHigh.hashCode()));
        result = ((result* 31)+((this.labHr == null)? 0 :this.labHr.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.scbcrseLecHrInd == null)? 0 :this.scbcrseLecHrInd.hashCode()));
        result = ((result* 31)+((this.maxEnrl == null)? 0 :this.maxEnrl.hashCode()));
        result = ((result* 31)+((this.ssrseawPending == null)? 0 :this.ssrseawPending.hashCode()));
        result = ((result* 31)+((this.numberOfUnits == null)? 0 :this.numberOfUnits.hashCode()));
        result = ((result* 31)+((this.ssrseawWaitlist == null)? 0 :this.ssrseawWaitlist.hashCode()));
        result = ((result* 31)+((this.ptrmWeeks == null)? 0 :this.ptrmWeeks.hashCode()));
        result = ((result* 31)+((this.censusEnrl == null)? 0 :this.censusEnrl.hashCode()));
        result = ((result* 31)+((this.scbcrseBillHrInd == null)? 0 :this.scbcrseBillHrInd.hashCode()));
        result = ((result* 31)+((this.acctDesc == null)? 0 :this.acctDesc.hashCode()));
        result = ((result* 31)+((this.enrl == null)? 0 :this.enrl.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.prereqChkMethodCde == null)? 0 :this.prereqChkMethodCde.hashCode()));
        result = ((result* 31)+((this.reservedInd == null)? 0 :this.reservedInd.hashCode()));
        result = ((result* 31)+((this.longTitleInd == null)? 0 :this.longTitleInd.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.lecHr == null)? 0 :this.lecHr.hashCode()));
        result = ((result* 31)+((this.sstsCode == null)? 0 :this.sstsCode.hashCode()));
        result = ((result* 31)+((this.commentInd == null)? 0 :this.commentInd.hashCode()));
        result = ((result* 31)+((this.scbcrseLecHrHigh == null)? 0 :this.scbcrseLecHrHigh.hashCode()));
        result = ((result* 31)+((this.scbcrseLabHrInd == null)? 0 :this.scbcrseLabHrInd.hashCode()));
        result = ((result* 31)+((this.censusEnrlDate == null)? 0 :this.censusEnrlDate.hashCode()));
        result = ((result* 31)+((this.stvgmodDesc == null)? 0 :this.stvgmodDesc.hashCode()));
        result = ((result* 31)+((this.xlstGroup == null)? 0 :this.xlstGroup.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.learnerRegstartFdate == null)? 0 :this.learnerRegstartFdate.hashCode()));
        result = ((result* 31)+((this.ssrseatReg == null)? 0 :this.ssrseatReg.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.scbcrseCreditHrHigh == null)? 0 :this.scbcrseCreditHrHigh.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.overrideDurInd == null)? 0 :this.overrideDurInd.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.census2Enrl == null)? 0 :this.census2Enrl.hashCode()));
        result = ((result* 31)+((this.duntCode == null)? 0 :this.duntCode.hashCode()));
        result = ((result* 31)+((this.scbcrseOthHrLow == null)? 0 :this.scbcrseOthHrLow.hashCode()));
        result = ((result* 31)+((this.creditHrs == null)? 0 :this.creditHrs.hashCode()));
        result = ((result* 31)+((this.dch == null)? 0 :this.dch.hashCode()));
        result = ((result* 31)+((this.projEnrl == null)? 0 :this.projEnrl.hashCode()));
        result = ((result* 31)+((this.scbcrseContHrInd == null)? 0 :this.scbcrseContHrInd.hashCode()));
        result = ((result* 31)+((this.census2Date == null)? 0 :this.census2Date.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.stvsstsDesc == null)? 0 :this.stvsstsDesc.hashCode()));
        result = ((result* 31)+((this.stvcampDesc == null)? 0 :this.stvcampDesc.hashCode()));
        result = ((result* 31)+((this.stvsaprDesc == null)? 0 :this.stvsaprDesc.hashCode()));
        result = ((result* 31)+((this.gorintgDesc == null)? 0 :this.gorintgDesc.hashCode()));
        result = ((result* 31)+((this.regFromDate == null)? 0 :this.regFromDate.hashCode()));
        result = ((result* 31)+((this.voiceAvail == null)? 0 :this.voiceAvail.hashCode()));
        result = ((result* 31)+((this.syllabusInd == null)? 0 :this.syllabusInd.hashCode()));
        result = ((result* 31)+((this.cappPrereqTestInd == null)? 0 :this.cappPrereqTestInd.hashCode()));
        result = ((result* 31)+((this.othHr == null)? 0 :this.othHr.hashCode()));
        result = ((result* 31)+((this.ptrmStartDate == null)? 0 :this.ptrmStartDate.hashCode()));
        result = ((result* 31)+((this.scbcrseLecHrLow == null)? 0 :this.scbcrseLecHrLow.hashCode()));
        result = ((result* 31)+((this.contHr == null)? 0 :this.contHr.hashCode()));
        result = ((result* 31)+((this.gtvinsmDesc == null)? 0 :this.gtvinsmDesc.hashCode()));
        result = ((result* 31)+((this.linkIdent == null)? 0 :this.linkIdent.hashCode()));
        result = ((result* 31)+((this.stvschdDesc == null)? 0 :this.stvschdDesc.hashCode()));
        result = ((result* 31)+((this.scbcrseCreditHrLow == null)? 0 :this.scbcrseCreditHrLow.hashCode()));
        result = ((result* 31)+((this.prntInd == null)? 0 :this.prntInd.hashCode()));
        result = ((result* 31)+((this.regToDate == null)? 0 :this.regToDate.hashCode()));
        result = ((result* 31)+((this.ptrmEndDate == null)? 0 :this.ptrmEndDate.hashCode()));
        result = ((result* 31)+((this.priorEnrl == null)? 0 :this.priorEnrl.hashCode()));
        result = ((result* 31)+((this.waitCount == null)? 0 :this.waitCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssbsect) == false) {
            return false;
        }
        Ssbsect rhs = ((Ssbsect) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.totCreditHrs == rhs.totCreditHrs)||((this.totCreditHrs!= null)&&this.totCreditHrs.equals(rhs.totCreditHrs)))&&((this.sectStartDate == rhs.sectStartDate)||((this.sectStartDate!= null)&&this.sectStartDate.equals(rhs.sectStartDate))))&&((this.tuiwInd == rhs.tuiwInd)||((this.tuiwInd!= null)&&this.tuiwInd.equals(rhs.tuiwInd))))&&((this.scbcrseContHrHigh == rhs.scbcrseContHrHigh)||((this.scbcrseContHrHigh!= null)&&this.scbcrseContHrHigh.equals(rhs.scbcrseContHrHigh))))&&((this.scbcrseBillHrLow == rhs.scbcrseBillHrLow)||((this.scbcrseBillHrLow!= null)&&this.scbcrseBillHrLow.equals(rhs.scbcrseBillHrLow))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.scbcrseLabHrLow == rhs.scbcrseLabHrLow)||((this.scbcrseLabHrLow!= null)&&this.scbcrseLabHrLow.equals(rhs.scbcrseLabHrLow))))&&((this.regAuthActiveCde == rhs.regAuthActiveCde)||((this.regAuthActiveCde!= null)&&this.regAuthActiveCde.equals(rhs.regAuthActiveCde))))&&((this.intgCde == rhs.intgCde)||((this.intgCde!= null)&&this.intgCde.equals(rhs.intgCde))))&&((this.numberOfExtensions == rhs.numberOfExtensions)||((this.numberOfExtensions!= null)&&this.numberOfExtensions.equals(rhs.numberOfExtensions))))&&((this.learnerRegstartTdate == rhs.learnerRegstartTdate)||((this.learnerRegstartTdate!= null)&&this.learnerRegstartTdate.equals(rhs.learnerRegstartTdate))))&&((this.wch == rhs.wch)||((this.wch!= null)&&this.wch.equals(rhs.wch))))&&((this.gradableInd == rhs.gradableInd)||((this.gradableInd!= null)&&this.gradableInd.equals(rhs.gradableInd))))&&((this.stvsessDesc == rhs.stvsessDesc)||((this.stvsessDesc!= null)&&this.stvsessDesc.equals(rhs.stvsessDesc))))&&((this.seatsAvail == rhs.seatsAvail)||((this.seatsAvail!= null)&&this.seatsAvail.equals(rhs.seatsAvail))))&&((this.saprCode == rhs.saprCode)||((this.saprCode!= null)&&this.saprCode.equals(rhs.saprCode))))&&((this.scbcrseLabHrHigh == rhs.scbcrseLabHrHigh)||((this.scbcrseLabHrHigh!= null)&&this.scbcrseLabHrHigh.equals(rhs.scbcrseLabHrHigh))))&&((this.waitAvail == rhs.waitAvail)||((this.waitAvail!= null)&&this.waitAvail.equals(rhs.waitAvail))))&&((this.ceuInd == rhs.ceuInd)||((this.ceuInd!= null)&&this.ceuInd.equals(rhs.ceuInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scbcrseOthHrInd == rhs.scbcrseOthHrInd)||((this.scbcrseOthHrInd!= null)&&this.scbcrseOthHrInd.equals(rhs.scbcrseOthHrInd))))&&((this.sectWLNotificationEndDate == rhs.sectWLNotificationEndDate)||((this.sectWLNotificationEndDate!= null)&&this.sectWLNotificationEndDate.equals(rhs.sectWLNotificationEndDate))))&&((this.sectAuthStartDate == rhs.sectAuthStartDate)||((this.sectAuthStartDate!= null)&&this.sectAuthStartDate.equals(rhs.sectAuthStartDate))))&&((this.scbcrseOthHrHigh == rhs.scbcrseOthHrHigh)||((this.scbcrseOthHrHigh!= null)&&this.scbcrseOthHrHigh.equals(rhs.scbcrseOthHrHigh))))&&((this.subjDesc == rhs.subjDesc)||((this.subjDesc!= null)&&this.subjDesc.equals(rhs.subjDesc))))&&((this.gtvduntDesc == rhs.gtvduntDesc)||((this.gtvduntDesc!= null)&&this.gtvduntDesc.equals(rhs.gtvduntDesc))))&&((this.ssrseatPending == rhs.ssrseatPending)||((this.ssrseatPending!= null)&&this.ssrseatPending.equals(rhs.ssrseatPending))))&&((this.billHrs == rhs.billHrs)||((this.billHrs!= null)&&this.billHrs.equals(rhs.billHrs))))&&((this.scbcrseCreditHrInd == rhs.scbcrseCreditHrInd)||((this.scbcrseCreditHrInd!= null)&&this.scbcrseCreditHrInd.equals(rhs.scbcrseCreditHrInd))))&&((this.scbcrseContHrLow == rhs.scbcrseContHrLow)||((this.scbcrseContHrLow!= null)&&this.scbcrseContHrLow.equals(rhs.scbcrseContHrLow))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.waitCapacity == rhs.waitCapacity)||((this.waitCapacity!= null)&&this.waitCapacity.equals(rhs.waitCapacity))))&&((this.scbcrseBillHrHigh == rhs.scbcrseBillHrHigh)||((this.scbcrseBillHrHigh!= null)&&this.scbcrseBillHrHigh.equals(rhs.scbcrseBillHrHigh))))&&((this.labHr == rhs.labHr)||((this.labHr!= null)&&this.labHr.equals(rhs.labHr))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.scbcrseLecHrInd == rhs.scbcrseLecHrInd)||((this.scbcrseLecHrInd!= null)&&this.scbcrseLecHrInd.equals(rhs.scbcrseLecHrInd))))&&((this.maxEnrl == rhs.maxEnrl)||((this.maxEnrl!= null)&&this.maxEnrl.equals(rhs.maxEnrl))))&&((this.ssrseawPending == rhs.ssrseawPending)||((this.ssrseawPending!= null)&&this.ssrseawPending.equals(rhs.ssrseawPending))))&&((this.numberOfUnits == rhs.numberOfUnits)||((this.numberOfUnits!= null)&&this.numberOfUnits.equals(rhs.numberOfUnits))))&&((this.ssrseawWaitlist == rhs.ssrseawWaitlist)||((this.ssrseawWaitlist!= null)&&this.ssrseawWaitlist.equals(rhs.ssrseawWaitlist))))&&((this.ptrmWeeks == rhs.ptrmWeeks)||((this.ptrmWeeks!= null)&&this.ptrmWeeks.equals(rhs.ptrmWeeks))))&&((this.censusEnrl == rhs.censusEnrl)||((this.censusEnrl!= null)&&this.censusEnrl.equals(rhs.censusEnrl))))&&((this.scbcrseBillHrInd == rhs.scbcrseBillHrInd)||((this.scbcrseBillHrInd!= null)&&this.scbcrseBillHrInd.equals(rhs.scbcrseBillHrInd))))&&((this.acctDesc == rhs.acctDesc)||((this.acctDesc!= null)&&this.acctDesc.equals(rhs.acctDesc))))&&((this.enrl == rhs.enrl)||((this.enrl!= null)&&this.enrl.equals(rhs.enrl))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.prereqChkMethodCde == rhs.prereqChkMethodCde)||((this.prereqChkMethodCde!= null)&&this.prereqChkMethodCde.equals(rhs.prereqChkMethodCde))))&&((this.reservedInd == rhs.reservedInd)||((this.reservedInd!= null)&&this.reservedInd.equals(rhs.reservedInd))))&&((this.longTitleInd == rhs.longTitleInd)||((this.longTitleInd!= null)&&this.longTitleInd.equals(rhs.longTitleInd))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.lecHr == rhs.lecHr)||((this.lecHr!= null)&&this.lecHr.equals(rhs.lecHr))))&&((this.sstsCode == rhs.sstsCode)||((this.sstsCode!= null)&&this.sstsCode.equals(rhs.sstsCode))))&&((this.commentInd == rhs.commentInd)||((this.commentInd!= null)&&this.commentInd.equals(rhs.commentInd))))&&((this.scbcrseLecHrHigh == rhs.scbcrseLecHrHigh)||((this.scbcrseLecHrHigh!= null)&&this.scbcrseLecHrHigh.equals(rhs.scbcrseLecHrHigh))))&&((this.scbcrseLabHrInd == rhs.scbcrseLabHrInd)||((this.scbcrseLabHrInd!= null)&&this.scbcrseLabHrInd.equals(rhs.scbcrseLabHrInd))))&&((this.censusEnrlDate == rhs.censusEnrlDate)||((this.censusEnrlDate!= null)&&this.censusEnrlDate.equals(rhs.censusEnrlDate))))&&((this.stvgmodDesc == rhs.stvgmodDesc)||((this.stvgmodDesc!= null)&&this.stvgmodDesc.equals(rhs.stvgmodDesc))))&&((this.xlstGroup == rhs.xlstGroup)||((this.xlstGroup!= null)&&this.xlstGroup.equals(rhs.xlstGroup))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.learnerRegstartFdate == rhs.learnerRegstartFdate)||((this.learnerRegstartFdate!= null)&&this.learnerRegstartFdate.equals(rhs.learnerRegstartFdate))))&&((this.ssrseatReg == rhs.ssrseatReg)||((this.ssrseatReg!= null)&&this.ssrseatReg.equals(rhs.ssrseatReg))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.scbcrseCreditHrHigh == rhs.scbcrseCreditHrHigh)||((this.scbcrseCreditHrHigh!= null)&&this.scbcrseCreditHrHigh.equals(rhs.scbcrseCreditHrHigh))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.overrideDurInd == rhs.overrideDurInd)||((this.overrideDurInd!= null)&&this.overrideDurInd.equals(rhs.overrideDurInd))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.census2Enrl == rhs.census2Enrl)||((this.census2Enrl!= null)&&this.census2Enrl.equals(rhs.census2Enrl))))&&((this.duntCode == rhs.duntCode)||((this.duntCode!= null)&&this.duntCode.equals(rhs.duntCode))))&&((this.scbcrseOthHrLow == rhs.scbcrseOthHrLow)||((this.scbcrseOthHrLow!= null)&&this.scbcrseOthHrLow.equals(rhs.scbcrseOthHrLow))))&&((this.creditHrs == rhs.creditHrs)||((this.creditHrs!= null)&&this.creditHrs.equals(rhs.creditHrs))))&&((this.dch == rhs.dch)||((this.dch!= null)&&this.dch.equals(rhs.dch))))&&((this.projEnrl == rhs.projEnrl)||((this.projEnrl!= null)&&this.projEnrl.equals(rhs.projEnrl))))&&((this.scbcrseContHrInd == rhs.scbcrseContHrInd)||((this.scbcrseContHrInd!= null)&&this.scbcrseContHrInd.equals(rhs.scbcrseContHrInd))))&&((this.census2Date == rhs.census2Date)||((this.census2Date!= null)&&this.census2Date.equals(rhs.census2Date))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.stvsstsDesc == rhs.stvsstsDesc)||((this.stvsstsDesc!= null)&&this.stvsstsDesc.equals(rhs.stvsstsDesc))))&&((this.stvcampDesc == rhs.stvcampDesc)||((this.stvcampDesc!= null)&&this.stvcampDesc.equals(rhs.stvcampDesc))))&&((this.stvsaprDesc == rhs.stvsaprDesc)||((this.stvsaprDesc!= null)&&this.stvsaprDesc.equals(rhs.stvsaprDesc))))&&((this.gorintgDesc == rhs.gorintgDesc)||((this.gorintgDesc!= null)&&this.gorintgDesc.equals(rhs.gorintgDesc))))&&((this.regFromDate == rhs.regFromDate)||((this.regFromDate!= null)&&this.regFromDate.equals(rhs.regFromDate))))&&((this.voiceAvail == rhs.voiceAvail)||((this.voiceAvail!= null)&&this.voiceAvail.equals(rhs.voiceAvail))))&&((this.syllabusInd == rhs.syllabusInd)||((this.syllabusInd!= null)&&this.syllabusInd.equals(rhs.syllabusInd))))&&((this.cappPrereqTestInd == rhs.cappPrereqTestInd)||((this.cappPrereqTestInd!= null)&&this.cappPrereqTestInd.equals(rhs.cappPrereqTestInd))))&&((this.othHr == rhs.othHr)||((this.othHr!= null)&&this.othHr.equals(rhs.othHr))))&&((this.ptrmStartDate == rhs.ptrmStartDate)||((this.ptrmStartDate!= null)&&this.ptrmStartDate.equals(rhs.ptrmStartDate))))&&((this.scbcrseLecHrLow == rhs.scbcrseLecHrLow)||((this.scbcrseLecHrLow!= null)&&this.scbcrseLecHrLow.equals(rhs.scbcrseLecHrLow))))&&((this.contHr == rhs.contHr)||((this.contHr!= null)&&this.contHr.equals(rhs.contHr))))&&((this.gtvinsmDesc == rhs.gtvinsmDesc)||((this.gtvinsmDesc!= null)&&this.gtvinsmDesc.equals(rhs.gtvinsmDesc))))&&((this.linkIdent == rhs.linkIdent)||((this.linkIdent!= null)&&this.linkIdent.equals(rhs.linkIdent))))&&((this.stvschdDesc == rhs.stvschdDesc)||((this.stvschdDesc!= null)&&this.stvschdDesc.equals(rhs.stvschdDesc))))&&((this.scbcrseCreditHrLow == rhs.scbcrseCreditHrLow)||((this.scbcrseCreditHrLow!= null)&&this.scbcrseCreditHrLow.equals(rhs.scbcrseCreditHrLow))))&&((this.prntInd == rhs.prntInd)||((this.prntInd!= null)&&this.prntInd.equals(rhs.prntInd))))&&((this.regToDate == rhs.regToDate)||((this.regToDate!= null)&&this.regToDate.equals(rhs.regToDate))))&&((this.ptrmEndDate == rhs.ptrmEndDate)||((this.ptrmEndDate!= null)&&this.ptrmEndDate.equals(rhs.ptrmEndDate))))&&((this.priorEnrl == rhs.priorEnrl)||((this.priorEnrl!= null)&&this.priorEnrl.equals(rhs.priorEnrl))))&&((this.waitCount == rhs.waitCount)||((this.waitCount!= null)&&this.waitCount.equals(rhs.waitCount))));
    }

}
