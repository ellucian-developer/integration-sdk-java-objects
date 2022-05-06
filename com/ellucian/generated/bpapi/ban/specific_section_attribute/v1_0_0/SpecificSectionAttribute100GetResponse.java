
package com.ellucian.generated.bpapi.ban.specific_section_attribute.v1_0_0;

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
    "duntCode",
    "creditHrs",
    "inProgram",
    "enrl",
    "title",
    "schdCode",
    "sessCode",
    "reservedInd",
    "activityDate",
    "campCode",
    "sstsCode",
    "selectManually",
    "crn",
    "selectAllInd",
    "subjCode",
    "linkIdent",
    "insmCode",
    "seatsAvail",
    "userId",
    "maxEnrl",
    "crseNumb",
    "numberOfUnits",
    "ptrmCode",
    "seqNumb",
    "ssrxlstXlstGroup",
    "termCode"
})
@Generated("jsonschema2pojo")
public class SpecificSectionAttribute100GetResponse {

    /**
     * Unit
     * <p>
     * Lineage reference object : SSBSECT_DUNT_CODE
     * 
     */
    @JsonProperty("duntCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_DUNT_CODE")
    private String duntCode;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CREDIT_HRS")
    private Double creditHrs;
    @JsonProperty("inProgram")
    private String inProgram;
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
     * Lineage reference object : SSBSECT_SCHD_CODE
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCHD_CODE")
    private String schdCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SESS_CODE")
    private String sessCode;
    /**
     * Reserved Seats
     * <p>
     * Lineage reference object : SSBSECT_RESERVED_IND
     * 
     */
    @JsonProperty("reservedInd")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_RESERVED_IND")
    private String reservedInd;
    /**
     * Lineage reference object : SSBSECT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CAMP_CODE")
    private String campCode;
    /**
     * Section Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE
     * 
     */
    @JsonProperty("sstsCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SSTS_CODE")
    private String sstsCode;
    @JsonProperty("selectManually")
    private String selectManually;
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
     * Select
     * <p>
     * 
     * 
     */
    @JsonProperty("selectAllInd")
    private String selectAllInd;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE")
    private String subjCode;
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
     * Instructional Method
     * <p>
     * Lineage reference object : SSBSECT_INSM_CODE
     * 
     */
    @JsonProperty("insmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_INSM_CODE")
    private String insmCode;
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
     * Lineage reference object : SSBSECT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_USER_ID")
    private String userId;
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
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRSE_NUMB")
    private String crseNumb;
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
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_CODE")
    private String ptrmCode;
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
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    private String ssrxlstXlstGroup;
    /**
     * Term
     * <p>
     * Lineage reference object : SSBSECT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Unit
     * <p>
     * Lineage reference object : SSBSECT_DUNT_CODE
     * 
     */
    @JsonProperty("duntCode")
    public String getDuntCode() {
        return duntCode;
    }

    /**
     * Unit
     * <p>
     * Lineage reference object : SSBSECT_DUNT_CODE
     * 
     */
    @JsonProperty("duntCode")
    public void setDuntCode(String duntCode) {
        this.duntCode = duntCode;
    }

    public SpecificSectionAttribute100GetResponse withDuntCode(String duntCode) {
        this.duntCode = duntCode;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    public Double getCreditHrs() {
        return creditHrs;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    public void setCreditHrs(Double creditHrs) {
        this.creditHrs = creditHrs;
    }

    public SpecificSectionAttribute100GetResponse withCreditHrs(Double creditHrs) {
        this.creditHrs = creditHrs;
        return this;
    }

    @JsonProperty("inProgram")
    public String getInProgram() {
        return inProgram;
    }

    @JsonProperty("inProgram")
    public void setInProgram(String inProgram) {
        this.inProgram = inProgram;
    }

    public SpecificSectionAttribute100GetResponse withInProgram(String inProgram) {
        this.inProgram = inProgram;
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

    public SpecificSectionAttribute100GetResponse withEnrl(Double enrl) {
        this.enrl = enrl;
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

    public SpecificSectionAttribute100GetResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * 
     */
    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public SpecificSectionAttribute100GetResponse withSchdCode(String schdCode) {
        this.schdCode = schdCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE
     * 
     */
    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SSBSECT_SESS_CODE
     * 
     */
    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public SpecificSectionAttribute100GetResponse withSessCode(String sessCode) {
        this.sessCode = sessCode;
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

    public SpecificSectionAttribute100GetResponse withReservedInd(String reservedInd) {
        this.reservedInd = reservedInd;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SSBSECT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SpecificSectionAttribute100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public SpecificSectionAttribute100GetResponse withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Section Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE
     * 
     */
    @JsonProperty("sstsCode")
    public String getSstsCode() {
        return sstsCode;
    }

    /**
     * Section Status
     * <p>
     * Lineage reference object : SSBSECT_SSTS_CODE
     * 
     */
    @JsonProperty("sstsCode")
    public void setSstsCode(String sstsCode) {
        this.sstsCode = sstsCode;
    }

    public SpecificSectionAttribute100GetResponse withSstsCode(String sstsCode) {
        this.sstsCode = sstsCode;
        return this;
    }

    @JsonProperty("selectManually")
    public String getSelectManually() {
        return selectManually;
    }

    @JsonProperty("selectManually")
    public void setSelectManually(String selectManually) {
        this.selectManually = selectManually;
    }

    public SpecificSectionAttribute100GetResponse withSelectManually(String selectManually) {
        this.selectManually = selectManually;
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

    public SpecificSectionAttribute100GetResponse withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Select
     * <p>
     * 
     * 
     */
    @JsonProperty("selectAllInd")
    public String getSelectAllInd() {
        return selectAllInd;
    }

    /**
     * Select
     * <p>
     * 
     * 
     */
    @JsonProperty("selectAllInd")
    public void setSelectAllInd(String selectAllInd) {
        this.selectAllInd = selectAllInd;
    }

    public SpecificSectionAttribute100GetResponse withSelectAllInd(String selectAllInd) {
        this.selectAllInd = selectAllInd;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public SpecificSectionAttribute100GetResponse withSubjCode(String subjCode) {
        this.subjCode = subjCode;
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

    public SpecificSectionAttribute100GetResponse withLinkIdent(String linkIdent) {
        this.linkIdent = linkIdent;
        return this;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SSBSECT_INSM_CODE
     * 
     */
    @JsonProperty("insmCode")
    public String getInsmCode() {
        return insmCode;
    }

    /**
     * Instructional Method
     * <p>
     * Lineage reference object : SSBSECT_INSM_CODE
     * 
     */
    @JsonProperty("insmCode")
    public void setInsmCode(String insmCode) {
        this.insmCode = insmCode;
    }

    public SpecificSectionAttribute100GetResponse withInsmCode(String insmCode) {
        this.insmCode = insmCode;
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

    public SpecificSectionAttribute100GetResponse withSeatsAvail(Double seatsAvail) {
        this.seatsAvail = seatsAvail;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SSBSECT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SpecificSectionAttribute100GetResponse withUserId(String userId) {
        this.userId = userId;
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

    public SpecificSectionAttribute100GetResponse withMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
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

    public SpecificSectionAttribute100GetResponse withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
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

    public SpecificSectionAttribute100GetResponse withNumberOfUnits(Double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public SpecificSectionAttribute100GetResponse withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
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

    public SpecificSectionAttribute100GetResponse withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    public String getSsrxlstXlstGroup() {
        return ssrxlstXlstGroup;
    }

    /**
     * Cross List
     * <p>
     * 
     * 
     */
    @JsonProperty("ssrxlstXlstGroup")
    public void setSsrxlstXlstGroup(String ssrxlstXlstGroup) {
        this.ssrxlstXlstGroup = ssrxlstXlstGroup;
    }

    public SpecificSectionAttribute100GetResponse withSsrxlstXlstGroup(String ssrxlstXlstGroup) {
        this.ssrxlstXlstGroup = ssrxlstXlstGroup;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SSBSECT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SSBSECT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public SpecificSectionAttribute100GetResponse withTermCode(String termCode) {
        this.termCode = termCode;
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

    public SpecificSectionAttribute100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpecificSectionAttribute100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("duntCode");
        sb.append('=');
        sb.append(((this.duntCode == null)?"<null>":this.duntCode));
        sb.append(',');
        sb.append("creditHrs");
        sb.append('=');
        sb.append(((this.creditHrs == null)?"<null>":this.creditHrs));
        sb.append(',');
        sb.append("inProgram");
        sb.append('=');
        sb.append(((this.inProgram == null)?"<null>":this.inProgram));
        sb.append(',');
        sb.append("enrl");
        sb.append('=');
        sb.append(((this.enrl == null)?"<null>":this.enrl));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("reservedInd");
        sb.append('=');
        sb.append(((this.reservedInd == null)?"<null>":this.reservedInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("sstsCode");
        sb.append('=');
        sb.append(((this.sstsCode == null)?"<null>":this.sstsCode));
        sb.append(',');
        sb.append("selectManually");
        sb.append('=');
        sb.append(((this.selectManually == null)?"<null>":this.selectManually));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("selectAllInd");
        sb.append('=');
        sb.append(((this.selectAllInd == null)?"<null>":this.selectAllInd));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("linkIdent");
        sb.append('=');
        sb.append(((this.linkIdent == null)?"<null>":this.linkIdent));
        sb.append(',');
        sb.append("insmCode");
        sb.append('=');
        sb.append(((this.insmCode == null)?"<null>":this.insmCode));
        sb.append(',');
        sb.append("seatsAvail");
        sb.append('=');
        sb.append(((this.seatsAvail == null)?"<null>":this.seatsAvail));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("maxEnrl");
        sb.append('=');
        sb.append(((this.maxEnrl == null)?"<null>":this.maxEnrl));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("numberOfUnits");
        sb.append('=');
        sb.append(((this.numberOfUnits == null)?"<null>":this.numberOfUnits));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("ssrxlstXlstGroup");
        sb.append('=');
        sb.append(((this.ssrxlstXlstGroup == null)?"<null>":this.ssrxlstXlstGroup));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.creditHrs == null)? 0 :this.creditHrs.hashCode()));
        result = ((result* 31)+((this.inProgram == null)? 0 :this.inProgram.hashCode()));
        result = ((result* 31)+((this.enrl == null)? 0 :this.enrl.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.reservedInd == null)? 0 :this.reservedInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.sstsCode == null)? 0 :this.sstsCode.hashCode()));
        result = ((result* 31)+((this.selectManually == null)? 0 :this.selectManually.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.selectAllInd == null)? 0 :this.selectAllInd.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.linkIdent == null)? 0 :this.linkIdent.hashCode()));
        result = ((result* 31)+((this.insmCode == null)? 0 :this.insmCode.hashCode()));
        result = ((result* 31)+((this.seatsAvail == null)? 0 :this.seatsAvail.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.maxEnrl == null)? 0 :this.maxEnrl.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.numberOfUnits == null)? 0 :this.numberOfUnits.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrxlstXlstGroup == null)? 0 :this.ssrxlstXlstGroup.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpecificSectionAttribute100GetResponse) == false) {
            return false;
        }
        SpecificSectionAttribute100GetResponse rhs = ((SpecificSectionAttribute100GetResponse) other);
        return ((((((((((((((((((((((((((((this.duntCode == rhs.duntCode)||((this.duntCode!= null)&&this.duntCode.equals(rhs.duntCode)))&&((this.creditHrs == rhs.creditHrs)||((this.creditHrs!= null)&&this.creditHrs.equals(rhs.creditHrs))))&&((this.inProgram == rhs.inProgram)||((this.inProgram!= null)&&this.inProgram.equals(rhs.inProgram))))&&((this.enrl == rhs.enrl)||((this.enrl!= null)&&this.enrl.equals(rhs.enrl))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.reservedInd == rhs.reservedInd)||((this.reservedInd!= null)&&this.reservedInd.equals(rhs.reservedInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.sstsCode == rhs.sstsCode)||((this.sstsCode!= null)&&this.sstsCode.equals(rhs.sstsCode))))&&((this.selectManually == rhs.selectManually)||((this.selectManually!= null)&&this.selectManually.equals(rhs.selectManually))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.selectAllInd == rhs.selectAllInd)||((this.selectAllInd!= null)&&this.selectAllInd.equals(rhs.selectAllInd))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.linkIdent == rhs.linkIdent)||((this.linkIdent!= null)&&this.linkIdent.equals(rhs.linkIdent))))&&((this.insmCode == rhs.insmCode)||((this.insmCode!= null)&&this.insmCode.equals(rhs.insmCode))))&&((this.seatsAvail == rhs.seatsAvail)||((this.seatsAvail!= null)&&this.seatsAvail.equals(rhs.seatsAvail))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.maxEnrl == rhs.maxEnrl)||((this.maxEnrl!= null)&&this.maxEnrl.equals(rhs.maxEnrl))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.numberOfUnits == rhs.numberOfUnits)||((this.numberOfUnits!= null)&&this.numberOfUnits.equals(rhs.numberOfUnits))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrxlstXlstGroup == rhs.ssrxlstXlstGroup)||((this.ssrxlstXlstGroup!= null)&&this.ssrxlstXlstGroup.equals(rhs.ssrxlstXlstGroup))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
