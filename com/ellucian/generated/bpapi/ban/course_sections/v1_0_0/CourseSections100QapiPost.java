
package com.ellucian.generated.bpapi.ban.course_sections.v1_0_0;

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
    "termCode",
    "ptrmCode",
    "regFromDate",
    "regToDate",
    "crn",
    "blockInd",
    "subjCode",
    "crseNumb",
    "seqNumb",
    "sstsCode",
    "campCode",
    "title",
    "schdCode",
    "insmCode",
    "numberOfUnits",
    "duntCode",
    "linkIdent",
    "ssrxlstXlstGroup",
    "reservedInd",
    "longTitleExists",
    "syllabusInfoExists",
    "sectionCommentsExist",
    "maxEnrl",
    "enrl",
    "seatsAvail",
    "waitCapacity",
    "waitCount",
    "waitAvail"
})
@Generated("jsonschema2pojo")
public class CourseSections100QapiPost {

    /**
     * Term
     * <p>
     * Lineage reference object : SSBSECT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
    /**
     * Registration From
     * <p>
     * Lineage reference object : SSBSECT_REG_FROM_DATE
     * 
     */
    @JsonProperty("regFromDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REG_FROM_DATE")
    private Date regFromDate;
    /**
     * Registration To
     * <p>
     * Lineage reference object : SSBSECT_REG_TO_DATE
     * 
     */
    @JsonProperty("regToDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REG_TO_DATE")
    private Date regToDate;
    /**
     * CRN
     * <p>
     * Lineage reference object : SSBSECT_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRN")
    private String crn;
    /**
     * Block Schedule
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    private String blockInd;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRSE_NUMB")
    private String crseNumb;
    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SEQ_NUMB")
    private String seqNumb;
    /**
     * Section Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("sstsCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts")
    private String sstsCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Course/Section Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCHD_CODE, Lookup lineage reference object : stvschd")
    private String schdCode;
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
     * Duration
     * <p>
     * Lineage reference object : SSBSECT_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("numberOfUnits")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_NUMBER_OF_UNITS")
    private Double numberOfUnits;
    /**
     * Unit
     * <p>
     * Lineage reference object : SSBSECT_DUNT_CODE, Lookup lineage reference object : gtvdunt
     * 
     */
    @JsonProperty("duntCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_DUNT_CODE, Lookup lineage reference object : gtvdunt")
    private String duntCode;
    /**
     * Link
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("linkIdent")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LINK_IDENT")
    private String linkIdent;
    /**
     * Cross List
     * <p>
     * Lineage reference object : SSRXLST_XLST_GROUP
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    @JsonPropertyDescription("Lineage reference object : SSRXLST_XLST_GROUP")
    private String ssrxlstXlstGroup;
    /**
     * Reserved Seats
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("reservedInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_RESERVED_IND")
    private String reservedInd;
    @JsonProperty("longTitleExists")
    private String longTitleExists;
    @JsonProperty("syllabusInfoExists")
    private String syllabusInfoExists;
    @JsonProperty("sectionCommentsExist")
    private String sectionCommentsExist;
    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * 
     */
    @JsonProperty("maxEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_MAX_ENRL")
    private Double maxEnrl;
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
     * Enrollment Seats Available
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SEATS_AVAIL")
    private Double seatsAvail;
    /**
     * Waitlist
     * <p>
     * Lineage reference object : SSBSECT_WAIT_CAPACITY
     * 
     */
    @JsonProperty("waitCapacity")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_WAIT_CAPACITY")
    private Double waitCapacity;
    /**
     * Waitlist Actual
     * <p>
     * Lineage reference object : SSBSECT_WAIT_COUNT
     * 
     */
    @JsonProperty("waitCount")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_WAIT_COUNT")
    private Double waitCount;
    /**
     * Waitlist Seats Available
     * <p>
     * Lineage reference object : SSBSECT_WAIT_AVAIL
     * 
     */
    @JsonProperty("waitAvail")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_WAIT_AVAIL")
    private Double waitAvail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : SSBSECT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SSBSECT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public CourseSections100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public CourseSections100QapiPost withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Registration From
     * <p>
     * Lineage reference object : SSBSECT_REG_FROM_DATE
     * 
     */
    @JsonProperty("regFromDate")
    public Date getRegFromDate() {
        return regFromDate;
    }

    /**
     * Registration From
     * <p>
     * Lineage reference object : SSBSECT_REG_FROM_DATE
     * 
     */
    @JsonProperty("regFromDate")
    public void setRegFromDate(Date regFromDate) {
        this.regFromDate = regFromDate;
    }

    public CourseSections100QapiPost withRegFromDate(Date regFromDate) {
        this.regFromDate = regFromDate;
        return this;
    }

    /**
     * Registration To
     * <p>
     * Lineage reference object : SSBSECT_REG_TO_DATE
     * 
     */
    @JsonProperty("regToDate")
    public Date getRegToDate() {
        return regToDate;
    }

    /**
     * Registration To
     * <p>
     * Lineage reference object : SSBSECT_REG_TO_DATE
     * 
     */
    @JsonProperty("regToDate")
    public void setRegToDate(Date regToDate) {
        this.regToDate = regToDate;
    }

    public CourseSections100QapiPost withRegToDate(Date regToDate) {
        this.regToDate = regToDate;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSBSECT_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSBSECT_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public CourseSections100QapiPost withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Block Schedule
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    public String getBlockInd() {
        return blockInd;
    }

    /**
     * Block Schedule
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    public void setBlockInd(String blockInd) {
        this.blockInd = blockInd;
    }

    public CourseSections100QapiPost withBlockInd(String blockInd) {
        this.blockInd = blockInd;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE, Lookup lineage reference object : stvsubj
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
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public CourseSections100QapiPost withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CourseSections100QapiPost withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
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
     * 
     */
    @JsonProperty("seqNumb")
    public void setSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
    }

    public CourseSections100QapiPost withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    /**
     * Section Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("sstsCode")
    public String getSstsCode() {
        return sstsCode;
    }

    /**
     * Section Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE, Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("sstsCode")
    public void setSstsCode(String sstsCode) {
        this.sstsCode = sstsCode;
    }

    public CourseSections100QapiPost withSstsCode(String sstsCode) {
        this.sstsCode = sstsCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE, Lookup lineage reference object : stvcamp
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
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public CourseSections100QapiPost withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Course/Section Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Course/Section Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CourseSections100QapiPost withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE, Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public CourseSections100QapiPost withSchdCode(String schdCode) {
        this.schdCode = schdCode;
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

    public CourseSections100QapiPost withInsmCode(String insmCode) {
        this.insmCode = insmCode;
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

    public CourseSections100QapiPost withNumberOfUnits(Double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
        return this;
    }

    /**
     * Unit
     * <p>
     * Lineage reference object : SSBSECT_DUNT_CODE, Lookup lineage reference object : gtvdunt
     * 
     */
    @JsonProperty("duntCode")
    public String getDuntCode() {
        return duntCode;
    }

    /**
     * Unit
     * <p>
     * Lineage reference object : SSBSECT_DUNT_CODE, Lookup lineage reference object : gtvdunt
     * 
     */
    @JsonProperty("duntCode")
    public void setDuntCode(String duntCode) {
        this.duntCode = duntCode;
    }

    public CourseSections100QapiPost withDuntCode(String duntCode) {
        this.duntCode = duntCode;
        return this;
    }

    /**
     * Link
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("linkIdent")
    public String getLinkIdent() {
        return linkIdent;
    }

    /**
     * Link
     * <p>
     * Lineage reference object : SSBSECT_LINK_IDENT
     * 
     */
    @JsonProperty("linkIdent")
    public void setLinkIdent(String linkIdent) {
        this.linkIdent = linkIdent;
    }

    public CourseSections100QapiPost withLinkIdent(String linkIdent) {
        this.linkIdent = linkIdent;
        return this;
    }

    /**
     * Cross List
     * <p>
     * Lineage reference object : SSRXLST_XLST_GROUP
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    public String getSsrxlstXlstGroup() {
        return ssrxlstXlstGroup;
    }

    /**
     * Cross List
     * <p>
     * Lineage reference object : SSRXLST_XLST_GROUP
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    public void setSsrxlstXlstGroup(String ssrxlstXlstGroup) {
        this.ssrxlstXlstGroup = ssrxlstXlstGroup;
    }

    public CourseSections100QapiPost withSsrxlstXlstGroup(String ssrxlstXlstGroup) {
        this.ssrxlstXlstGroup = ssrxlstXlstGroup;
        return this;
    }

    /**
     * Reserved Seats
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("reservedInd")
    public String getReservedInd() {
        return reservedInd;
    }

    /**
     * Reserved Seats
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("reservedInd")
    public void setReservedInd(String reservedInd) {
        this.reservedInd = reservedInd;
    }

    public CourseSections100QapiPost withReservedInd(String reservedInd) {
        this.reservedInd = reservedInd;
        return this;
    }

    @JsonProperty("longTitleExists")
    public String getLongTitleExists() {
        return longTitleExists;
    }

    @JsonProperty("longTitleExists")
    public void setLongTitleExists(String longTitleExists) {
        this.longTitleExists = longTitleExists;
    }

    public CourseSections100QapiPost withLongTitleExists(String longTitleExists) {
        this.longTitleExists = longTitleExists;
        return this;
    }

    @JsonProperty("syllabusInfoExists")
    public String getSyllabusInfoExists() {
        return syllabusInfoExists;
    }

    @JsonProperty("syllabusInfoExists")
    public void setSyllabusInfoExists(String syllabusInfoExists) {
        this.syllabusInfoExists = syllabusInfoExists;
    }

    public CourseSections100QapiPost withSyllabusInfoExists(String syllabusInfoExists) {
        this.syllabusInfoExists = syllabusInfoExists;
        return this;
    }

    @JsonProperty("sectionCommentsExist")
    public String getSectionCommentsExist() {
        return sectionCommentsExist;
    }

    @JsonProperty("sectionCommentsExist")
    public void setSectionCommentsExist(String sectionCommentsExist) {
        this.sectionCommentsExist = sectionCommentsExist;
    }

    public CourseSections100QapiPost withSectionCommentsExist(String sectionCommentsExist) {
        this.sectionCommentsExist = sectionCommentsExist;
        return this;
    }

    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * 
     */
    @JsonProperty("maxEnrl")
    public Double getMaxEnrl() {
        return maxEnrl;
    }

    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * 
     */
    @JsonProperty("maxEnrl")
    public void setMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
    }

    public CourseSections100QapiPost withMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
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

    public CourseSections100QapiPost withEnrl(Double enrl) {
        this.enrl = enrl;
        return this;
    }

    /**
     * Enrollment Seats Available
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    public Double getSeatsAvail() {
        return seatsAvail;
    }

    /**
     * Enrollment Seats Available
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    public void setSeatsAvail(Double seatsAvail) {
        this.seatsAvail = seatsAvail;
    }

    public CourseSections100QapiPost withSeatsAvail(Double seatsAvail) {
        this.seatsAvail = seatsAvail;
        return this;
    }

    /**
     * Waitlist
     * <p>
     * Lineage reference object : SSBSECT_WAIT_CAPACITY
     * 
     */
    @JsonProperty("waitCapacity")
    public Double getWaitCapacity() {
        return waitCapacity;
    }

    /**
     * Waitlist
     * <p>
     * Lineage reference object : SSBSECT_WAIT_CAPACITY
     * 
     */
    @JsonProperty("waitCapacity")
    public void setWaitCapacity(Double waitCapacity) {
        this.waitCapacity = waitCapacity;
    }

    public CourseSections100QapiPost withWaitCapacity(Double waitCapacity) {
        this.waitCapacity = waitCapacity;
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

    public CourseSections100QapiPost withWaitCount(Double waitCount) {
        this.waitCount = waitCount;
        return this;
    }

    /**
     * Waitlist Seats Available
     * <p>
     * Lineage reference object : SSBSECT_WAIT_AVAIL
     * 
     */
    @JsonProperty("waitAvail")
    public Double getWaitAvail() {
        return waitAvail;
    }

    /**
     * Waitlist Seats Available
     * <p>
     * Lineage reference object : SSBSECT_WAIT_AVAIL
     * 
     */
    @JsonProperty("waitAvail")
    public void setWaitAvail(Double waitAvail) {
        this.waitAvail = waitAvail;
    }

    public CourseSections100QapiPost withWaitAvail(Double waitAvail) {
        this.waitAvail = waitAvail;
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

    public CourseSections100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseSections100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("regFromDate");
        sb.append('=');
        sb.append(((this.regFromDate == null)?"<null>":this.regFromDate));
        sb.append(',');
        sb.append("regToDate");
        sb.append('=');
        sb.append(((this.regToDate == null)?"<null>":this.regToDate));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("blockInd");
        sb.append('=');
        sb.append(((this.blockInd == null)?"<null>":this.blockInd));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("sstsCode");
        sb.append('=');
        sb.append(((this.sstsCode == null)?"<null>":this.sstsCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("numberOfUnits");
        sb.append('=');
        sb.append(((this.numberOfUnits == null)?"<null>":this.numberOfUnits));
        sb.append(',');
        sb.append("duntCode");
        sb.append('=');
        sb.append(((this.duntCode == null)?"<null>":this.duntCode));
        sb.append(',');
        sb.append("linkIdent");
        sb.append('=');
        sb.append(((this.linkIdent == null)?"<null>":this.linkIdent));
        sb.append(',');
        sb.append("ssrxlstXlstGroup");
        sb.append('=');
        sb.append(((this.ssrxlstXlstGroup == null)?"<null>":this.ssrxlstXlstGroup));
        sb.append(',');
        sb.append("reservedInd");
        sb.append('=');
        sb.append(((this.reservedInd == null)?"<null>":this.reservedInd));
        sb.append(',');
        sb.append("longTitleExists");
        sb.append('=');
        sb.append(((this.longTitleExists == null)?"<null>":this.longTitleExists));
        sb.append(',');
        sb.append("syllabusInfoExists");
        sb.append('=');
        sb.append(((this.syllabusInfoExists == null)?"<null>":this.syllabusInfoExists));
        sb.append(',');
        sb.append("sectionCommentsExist");
        sb.append('=');
        sb.append(((this.sectionCommentsExist == null)?"<null>":this.sectionCommentsExist));
        sb.append(',');
        sb.append("maxEnrl");
        sb.append('=');
        sb.append(((this.maxEnrl == null)?"<null>":this.maxEnrl));
        sb.append(',');
        sb.append("enrl");
        sb.append('=');
        sb.append(((this.enrl == null)?"<null>":this.enrl));
        sb.append(',');
        sb.append("seatsAvail");
        sb.append('=');
        sb.append(((this.seatsAvail == null)?"<null>":this.seatsAvail));
        sb.append(',');
        sb.append("waitCapacity");
        sb.append('=');
        sb.append(((this.waitCapacity == null)?"<null>":this.waitCapacity));
        sb.append(',');
        sb.append("waitCount");
        sb.append('=');
        sb.append(((this.waitCount == null)?"<null>":this.waitCount));
        sb.append(',');
        sb.append("waitAvail");
        sb.append('=');
        sb.append(((this.waitAvail == null)?"<null>":this.waitAvail));
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
        result = ((result* 31)+((this.duntCode == null)? 0 :this.duntCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.enrl == null)? 0 :this.enrl.hashCode()));
        result = ((result* 31)+((this.regFromDate == null)? 0 :this.regFromDate.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.reservedInd == null)? 0 :this.reservedInd.hashCode()));
        result = ((result* 31)+((this.syllabusInfoExists == null)? 0 :this.syllabusInfoExists.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.sstsCode == null)? 0 :this.sstsCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.sectionCommentsExist == null)? 0 :this.sectionCommentsExist.hashCode()));
        result = ((result* 31)+((this.waitCapacity == null)? 0 :this.waitCapacity.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.linkIdent == null)? 0 :this.linkIdent.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.seatsAvail == null)? 0 :this.seatsAvail.hashCode()));
        result = ((result* 31)+((this.maxEnrl == null)? 0 :this.maxEnrl.hashCode()));
        result = ((result* 31)+((this.blockInd == null)? 0 :this.blockInd.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.numberOfUnits == null)? 0 :this.numberOfUnits.hashCode()));
        result = ((result* 31)+((this.longTitleExists == null)? 0 :this.longTitleExists.hashCode()));
        result = ((result* 31)+((this.waitAvail == null)? 0 :this.waitAvail.hashCode()));
        result = ((result* 31)+((this.regToDate == null)? 0 :this.regToDate.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.waitCount == null)? 0 :this.waitCount.hashCode()));
        result = ((result* 31)+((this.ssrxlstXlstGroup == null)? 0 :this.ssrxlstXlstGroup.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseSections100QapiPost) == false) {
            return false;
        }
        CourseSections100QapiPost rhs = ((CourseSections100QapiPost) other);
        return ((((((((((((((((((((((((((((((this.duntCode == rhs.duntCode)||((this.duntCode!= null)&&this.duntCode.equals(rhs.duntCode)))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.enrl == rhs.enrl)||((this.enrl!= null)&&this.enrl.equals(rhs.enrl))))&&((this.regFromDate == rhs.regFromDate)||((this.regFromDate!= null)&&this.regFromDate.equals(rhs.regFromDate))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.reservedInd == rhs.reservedInd)||((this.reservedInd!= null)&&this.reservedInd.equals(rhs.reservedInd))))&&((this.syllabusInfoExists == rhs.syllabusInfoExists)||((this.syllabusInfoExists!= null)&&this.syllabusInfoExists.equals(rhs.syllabusInfoExists))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.sstsCode == rhs.sstsCode)||((this.sstsCode!= null)&&this.sstsCode.equals(rhs.sstsCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.sectionCommentsExist == rhs.sectionCommentsExist)||((this.sectionCommentsExist!= null)&&this.sectionCommentsExist.equals(rhs.sectionCommentsExist))))&&((this.waitCapacity == rhs.waitCapacity)||((this.waitCapacity!= null)&&this.waitCapacity.equals(rhs.waitCapacity))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.linkIdent == rhs.linkIdent)||((this.linkIdent!= null)&&this.linkIdent.equals(rhs.linkIdent))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.seatsAvail == rhs.seatsAvail)||((this.seatsAvail!= null)&&this.seatsAvail.equals(rhs.seatsAvail))))&&((this.maxEnrl == rhs.maxEnrl)||((this.maxEnrl!= null)&&this.maxEnrl.equals(rhs.maxEnrl))))&&((this.blockInd == rhs.blockInd)||((this.blockInd!= null)&&this.blockInd.equals(rhs.blockInd))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.numberOfUnits == rhs.numberOfUnits)||((this.numberOfUnits!= null)&&this.numberOfUnits.equals(rhs.numberOfUnits))))&&((this.longTitleExists == rhs.longTitleExists)||((this.longTitleExists!= null)&&this.longTitleExists.equals(rhs.longTitleExists))))&&((this.waitAvail == rhs.waitAvail)||((this.waitAvail!= null)&&this.waitAvail.equals(rhs.waitAvail))))&&((this.regToDate == rhs.regToDate)||((this.regToDate!= null)&&this.regToDate.equals(rhs.regToDate))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.waitCount == rhs.waitCount)||((this.waitCount!= null)&&this.waitCount.equals(rhs.waitCount))))&&((this.ssrxlstXlstGroup == rhs.ssrxlstXlstGroup)||((this.ssrxlstXlstGroup!= null)&&this.ssrxlstXlstGroup.equals(rhs.ssrxlstXlstGroup))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
