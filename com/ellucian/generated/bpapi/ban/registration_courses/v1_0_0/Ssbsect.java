
package com.ellucian.generated.bpapi.ban.registration_courses.v1_0_0;

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
    "scbcrseOthHrLow",
    "creditHrs",
    "scbcrseOthHrHigh",
    "scbcrseBillHrInd",
    "scbcrseContHrHigh",
    "scbcrseContHrInd",
    "title",
    "scbcrseBillHrLow",
    "schdCode",
    "billHrs",
    "scbcrseLabHrLow",
    "campCode",
    "lecHr",
    "sstsCode",
    "scbcrseLecHrHigh",
    "scbcrseCreditHrInd",
    "scbcrseLabHrInd",
    "scbcrseContHrLow",
    "othHr",
    "scbcrseLecHrLow",
    "contHr",
    "gmodCode",
    "scbcrseBillHrHigh",
    "xlstGroup",
    "subjCode",
    "xlstAvail",
    "labHr",
    "seatsAvail",
    "scbcrseCeuInd",
    "scbcrseCreditHrLow",
    "scbcrseLecHrInd",
    "blockInd",
    "crseNumb",
    "scbcrseCreditHrHigh",
    "scbcrseMaxRptUnits",
    "scbcrseLabHrHigh",
    "seqNumb",
    "scbcrseRepsCode",
    "scbcrseOthHrInd",
    "scbcrseRepeatLimit",
    "waitCount"
})
@Generated("jsonschema2pojo")
public class Ssbsect {

    /**
     * Other
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseOthHrLow")
    private Double scbcrseOthHrLow;
    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CREDIT_HRS")
    private Double creditHrs;
    @JsonProperty("scbcrseOthHrHigh")
    private Double scbcrseOthHrHigh;
    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrInd")
    private String scbcrseBillHrInd;
    @JsonProperty("scbcrseContHrHigh")
    private Double scbcrseContHrHigh;
    @JsonProperty("scbcrseContHrInd")
    private String scbcrseContHrInd;
    /**
     * Course Number Description
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * Bill
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrLow")
    private Double scbcrseBillHrLow;
    /**
     * Schedule
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * (Required)
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCHD_CODE")
    private String schdCode;
    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_BILL_HRS
     * 
     */
    @JsonProperty("billHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_BILL_HRS")
    private Double billHrs;
    /**
     * Laboratory
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLabHrLow")
    private Double scbcrseLabHrLow;
    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * (Required)
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CAMP_CODE")
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
     * Lineage reference object : SSBSECT_SSTS_CODE
     * (Required)
     * 
     */
    @JsonProperty("sstsCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SSTS_CODE")
    private String sstsCode;
    @JsonProperty("scbcrseLecHrHigh")
    private Double scbcrseLecHrHigh;
    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrInd")
    private String scbcrseCreditHrInd;
    @JsonProperty("scbcrseLabHrInd")
    private String scbcrseLabHrInd;
    /**
     * Contact
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
     * Lineage reference object : SSBSECT_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_GMOD_CODE")
    private String gmodCode;
    @JsonProperty("scbcrseBillHrHigh")
    private Double scbcrseBillHrHigh;
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
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * (Required)
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE")
    private String subjCode;
    /**
     * Cross List Seats Available
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstAvail")
    private Double xlstAvail;
    /**
     * Lineage reference object : SSBSECT_LAB_HR
     * 
     */
    @JsonProperty("labHr")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_LAB_HR")
    private Double labHr;
    /**
     * Seats Available
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SEATS_AVAIL")
    private Double seatsAvail;
    /**
     * CEU
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCeuInd")
    private String scbcrseCeuInd;
    /**
     * Credit CEU
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrLow")
    private Double scbcrseCreditHrLow;
    @JsonProperty("scbcrseLecHrInd")
    private String scbcrseLecHrInd;
    /**
     * Block
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    private String blockInd;
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
     * Repeat Maximum Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseMaxRptUnits")
    private Double scbcrseMaxRptUnits;
    @JsonProperty("scbcrseLabHrHigh")
    private Double scbcrseLabHrHigh;
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
     * Repeat Code
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseRepsCode")
    private String scbcrseRepsCode;
    @JsonProperty("scbcrseOthHrInd")
    private String scbcrseOthHrInd;
    /**
     * Repeat Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseRepeatLimit")
    private Double scbcrseRepeatLimit;
    /**
     * Waitlisted
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
     * Section
     * <p>
     * Lineage reference object : SSBSECT_CREDIT_HRS
     * 
     */
    @JsonProperty("creditHrs")
    public Double getCreditHrs() {
        return creditHrs;
    }

    /**
     * Section
     * <p>
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
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrInd")
    public String getScbcrseBillHrInd() {
        return scbcrseBillHrInd;
    }

    /**
     * Course
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

    @JsonProperty("scbcrseContHrInd")
    public String getScbcrseContHrInd() {
        return scbcrseContHrInd;
    }

    @JsonProperty("scbcrseContHrInd")
    public void setScbcrseContHrInd(String scbcrseContHrInd) {
        this.scbcrseContHrInd = scbcrseContHrInd;
    }

    public Ssbsect withScbcrseContHrInd(String scbcrseContHrInd) {
        this.scbcrseContHrInd = scbcrseContHrInd;
        return this;
    }

    /**
     * Course Number Description
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Course Number Description
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

    /**
     * Bill
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseBillHrLow")
    public Double getScbcrseBillHrLow() {
        return scbcrseBillHrLow;
    }

    /**
     * Bill
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
     * Schedule
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * (Required)
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
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
     * Section
     * <p>
     * Lineage reference object : SSBSECT_BILL_HRS
     * 
     */
    @JsonProperty("billHrs")
    public Double getBillHrs() {
        return billHrs;
    }

    /**
     * Section
     * <p>
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
     * Laboratory
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseLabHrLow")
    public Double getScbcrseLabHrLow() {
        return scbcrseLabHrLow;
    }

    /**
     * Laboratory
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
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
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
     * Lineage reference object : SSBSECT_CAMP_CODE
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
     * Lineage reference object : SSBSECT_SSTS_CODE
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
     * Lineage reference object : SSBSECT_SSTS_CODE
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
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrInd")
    public String getScbcrseCreditHrInd() {
        return scbcrseCreditHrInd;
    }

    /**
     * Course
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

    @JsonProperty("scbcrseLabHrInd")
    public String getScbcrseLabHrInd() {
        return scbcrseLabHrInd;
    }

    @JsonProperty("scbcrseLabHrInd")
    public void setScbcrseLabHrInd(String scbcrseLabHrInd) {
        this.scbcrseLabHrInd = scbcrseLabHrInd;
    }

    public Ssbsect withScbcrseLabHrInd(String scbcrseLabHrInd) {
        this.scbcrseLabHrInd = scbcrseLabHrInd;
        return this;
    }

    /**
     * Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseContHrLow")
    public Double getScbcrseContHrLow() {
        return scbcrseContHrLow;
    }

    /**
     * Contact
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
     * Lineage reference object : SSBSECT_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SSBSECT_GMOD_CODE
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
     * Lineage reference object : SSBSECT_SUBJ_CODE
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
     * Lineage reference object : SSBSECT_SUBJ_CODE
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
     * Cross List Seats Available
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstAvail")
    public Double getXlstAvail() {
        return xlstAvail;
    }

    /**
     * Cross List Seats Available
     * <p>
     * 
     * 
     */
    @JsonProperty("xlstAvail")
    public void setXlstAvail(Double xlstAvail) {
        this.xlstAvail = xlstAvail;
    }

    public Ssbsect withXlstAvail(Double xlstAvail) {
        this.xlstAvail = xlstAvail;
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
     * Seats Available
     * <p>
     * Lineage reference object : SSBSECT_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    public Double getSeatsAvail() {
        return seatsAvail;
    }

    /**
     * Seats Available
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
     * CEU
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCeuInd")
    public String getScbcrseCeuInd() {
        return scbcrseCeuInd;
    }

    /**
     * CEU
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCeuInd")
    public void setScbcrseCeuInd(String scbcrseCeuInd) {
        this.scbcrseCeuInd = scbcrseCeuInd;
    }

    public Ssbsect withScbcrseCeuInd(String scbcrseCeuInd) {
        this.scbcrseCeuInd = scbcrseCeuInd;
        return this;
    }

    /**
     * Credit CEU
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseCreditHrLow")
    public Double getScbcrseCreditHrLow() {
        return scbcrseCreditHrLow;
    }

    /**
     * Credit CEU
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

    @JsonProperty("scbcrseLecHrInd")
    public String getScbcrseLecHrInd() {
        return scbcrseLecHrInd;
    }

    @JsonProperty("scbcrseLecHrInd")
    public void setScbcrseLecHrInd(String scbcrseLecHrInd) {
        this.scbcrseLecHrInd = scbcrseLecHrInd;
    }

    public Ssbsect withScbcrseLecHrInd(String scbcrseLecHrInd) {
        this.scbcrseLecHrInd = scbcrseLecHrInd;
        return this;
    }

    /**
     * Block
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    public String getBlockInd() {
        return blockInd;
    }

    /**
     * Block
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    public void setBlockInd(String blockInd) {
        this.blockInd = blockInd;
    }

    public Ssbsect withBlockInd(String blockInd) {
        this.blockInd = blockInd;
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
     * Repeat Maximum Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseMaxRptUnits")
    public Double getScbcrseMaxRptUnits() {
        return scbcrseMaxRptUnits;
    }

    /**
     * Repeat Maximum Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseMaxRptUnits")
    public void setScbcrseMaxRptUnits(Double scbcrseMaxRptUnits) {
        this.scbcrseMaxRptUnits = scbcrseMaxRptUnits;
    }

    public Ssbsect withScbcrseMaxRptUnits(Double scbcrseMaxRptUnits) {
        this.scbcrseMaxRptUnits = scbcrseMaxRptUnits;
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

    /**
     * Repeat Code
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseRepsCode")
    public String getScbcrseRepsCode() {
        return scbcrseRepsCode;
    }

    /**
     * Repeat Code
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseRepsCode")
    public void setScbcrseRepsCode(String scbcrseRepsCode) {
        this.scbcrseRepsCode = scbcrseRepsCode;
    }

    public Ssbsect withScbcrseRepsCode(String scbcrseRepsCode) {
        this.scbcrseRepsCode = scbcrseRepsCode;
        return this;
    }

    @JsonProperty("scbcrseOthHrInd")
    public String getScbcrseOthHrInd() {
        return scbcrseOthHrInd;
    }

    @JsonProperty("scbcrseOthHrInd")
    public void setScbcrseOthHrInd(String scbcrseOthHrInd) {
        this.scbcrseOthHrInd = scbcrseOthHrInd;
    }

    public Ssbsect withScbcrseOthHrInd(String scbcrseOthHrInd) {
        this.scbcrseOthHrInd = scbcrseOthHrInd;
        return this;
    }

    /**
     * Repeat Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseRepeatLimit")
    public Double getScbcrseRepeatLimit() {
        return scbcrseRepeatLimit;
    }

    /**
     * Repeat Limit
     * <p>
     * 
     * 
     */
    @JsonProperty("scbcrseRepeatLimit")
    public void setScbcrseRepeatLimit(Double scbcrseRepeatLimit) {
        this.scbcrseRepeatLimit = scbcrseRepeatLimit;
    }

    public Ssbsect withScbcrseRepeatLimit(Double scbcrseRepeatLimit) {
        this.scbcrseRepeatLimit = scbcrseRepeatLimit;
        return this;
    }

    /**
     * Waitlisted
     * <p>
     * Lineage reference object : SSBSECT_WAIT_COUNT
     * 
     */
    @JsonProperty("waitCount")
    public Double getWaitCount() {
        return waitCount;
    }

    /**
     * Waitlisted
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
        sb.append("scbcrseBillHrInd");
        sb.append('=');
        sb.append(((this.scbcrseBillHrInd == null)?"<null>":this.scbcrseBillHrInd));
        sb.append(',');
        sb.append("scbcrseContHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseContHrHigh == null)?"<null>":this.scbcrseContHrHigh));
        sb.append(',');
        sb.append("scbcrseContHrInd");
        sb.append('=');
        sb.append(((this.scbcrseContHrInd == null)?"<null>":this.scbcrseContHrInd));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("scbcrseBillHrLow");
        sb.append('=');
        sb.append(((this.scbcrseBillHrLow == null)?"<null>":this.scbcrseBillHrLow));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("billHrs");
        sb.append('=');
        sb.append(((this.billHrs == null)?"<null>":this.billHrs));
        sb.append(',');
        sb.append("scbcrseLabHrLow");
        sb.append('=');
        sb.append(((this.scbcrseLabHrLow == null)?"<null>":this.scbcrseLabHrLow));
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
        sb.append("scbcrseLecHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseLecHrHigh == null)?"<null>":this.scbcrseLecHrHigh));
        sb.append(',');
        sb.append("scbcrseCreditHrInd");
        sb.append('=');
        sb.append(((this.scbcrseCreditHrInd == null)?"<null>":this.scbcrseCreditHrInd));
        sb.append(',');
        sb.append("scbcrseLabHrInd");
        sb.append('=');
        sb.append(((this.scbcrseLabHrInd == null)?"<null>":this.scbcrseLabHrInd));
        sb.append(',');
        sb.append("scbcrseContHrLow");
        sb.append('=');
        sb.append(((this.scbcrseContHrLow == null)?"<null>":this.scbcrseContHrLow));
        sb.append(',');
        sb.append("othHr");
        sb.append('=');
        sb.append(((this.othHr == null)?"<null>":this.othHr));
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
        sb.append("scbcrseBillHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseBillHrHigh == null)?"<null>":this.scbcrseBillHrHigh));
        sb.append(',');
        sb.append("xlstGroup");
        sb.append('=');
        sb.append(((this.xlstGroup == null)?"<null>":this.xlstGroup));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("xlstAvail");
        sb.append('=');
        sb.append(((this.xlstAvail == null)?"<null>":this.xlstAvail));
        sb.append(',');
        sb.append("labHr");
        sb.append('=');
        sb.append(((this.labHr == null)?"<null>":this.labHr));
        sb.append(',');
        sb.append("seatsAvail");
        sb.append('=');
        sb.append(((this.seatsAvail == null)?"<null>":this.seatsAvail));
        sb.append(',');
        sb.append("scbcrseCeuInd");
        sb.append('=');
        sb.append(((this.scbcrseCeuInd == null)?"<null>":this.scbcrseCeuInd));
        sb.append(',');
        sb.append("scbcrseCreditHrLow");
        sb.append('=');
        sb.append(((this.scbcrseCreditHrLow == null)?"<null>":this.scbcrseCreditHrLow));
        sb.append(',');
        sb.append("scbcrseLecHrInd");
        sb.append('=');
        sb.append(((this.scbcrseLecHrInd == null)?"<null>":this.scbcrseLecHrInd));
        sb.append(',');
        sb.append("blockInd");
        sb.append('=');
        sb.append(((this.blockInd == null)?"<null>":this.blockInd));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("scbcrseCreditHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseCreditHrHigh == null)?"<null>":this.scbcrseCreditHrHigh));
        sb.append(',');
        sb.append("scbcrseMaxRptUnits");
        sb.append('=');
        sb.append(((this.scbcrseMaxRptUnits == null)?"<null>":this.scbcrseMaxRptUnits));
        sb.append(',');
        sb.append("scbcrseLabHrHigh");
        sb.append('=');
        sb.append(((this.scbcrseLabHrHigh == null)?"<null>":this.scbcrseLabHrHigh));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("scbcrseRepsCode");
        sb.append('=');
        sb.append(((this.scbcrseRepsCode == null)?"<null>":this.scbcrseRepsCode));
        sb.append(',');
        sb.append("scbcrseOthHrInd");
        sb.append('=');
        sb.append(((this.scbcrseOthHrInd == null)?"<null>":this.scbcrseOthHrInd));
        sb.append(',');
        sb.append("scbcrseRepeatLimit");
        sb.append('=');
        sb.append(((this.scbcrseRepeatLimit == null)?"<null>":this.scbcrseRepeatLimit));
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
        result = ((result* 31)+((this.scbcrseOthHrLow == null)? 0 :this.scbcrseOthHrLow.hashCode()));
        result = ((result* 31)+((this.creditHrs == null)? 0 :this.creditHrs.hashCode()));
        result = ((result* 31)+((this.scbcrseOthHrHigh == null)? 0 :this.scbcrseOthHrHigh.hashCode()));
        result = ((result* 31)+((this.scbcrseBillHrInd == null)? 0 :this.scbcrseBillHrInd.hashCode()));
        result = ((result* 31)+((this.scbcrseContHrHigh == null)? 0 :this.scbcrseContHrHigh.hashCode()));
        result = ((result* 31)+((this.scbcrseContHrInd == null)? 0 :this.scbcrseContHrInd.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.scbcrseBillHrLow == null)? 0 :this.scbcrseBillHrLow.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.billHrs == null)? 0 :this.billHrs.hashCode()));
        result = ((result* 31)+((this.scbcrseLabHrLow == null)? 0 :this.scbcrseLabHrLow.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.lecHr == null)? 0 :this.lecHr.hashCode()));
        result = ((result* 31)+((this.sstsCode == null)? 0 :this.sstsCode.hashCode()));
        result = ((result* 31)+((this.scbcrseLecHrHigh == null)? 0 :this.scbcrseLecHrHigh.hashCode()));
        result = ((result* 31)+((this.scbcrseCreditHrInd == null)? 0 :this.scbcrseCreditHrInd.hashCode()));
        result = ((result* 31)+((this.scbcrseLabHrInd == null)? 0 :this.scbcrseLabHrInd.hashCode()));
        result = ((result* 31)+((this.scbcrseContHrLow == null)? 0 :this.scbcrseContHrLow.hashCode()));
        result = ((result* 31)+((this.othHr == null)? 0 :this.othHr.hashCode()));
        result = ((result* 31)+((this.scbcrseLecHrLow == null)? 0 :this.scbcrseLecHrLow.hashCode()));
        result = ((result* 31)+((this.contHr == null)? 0 :this.contHr.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.scbcrseBillHrHigh == null)? 0 :this.scbcrseBillHrHigh.hashCode()));
        result = ((result* 31)+((this.xlstGroup == null)? 0 :this.xlstGroup.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.xlstAvail == null)? 0 :this.xlstAvail.hashCode()));
        result = ((result* 31)+((this.labHr == null)? 0 :this.labHr.hashCode()));
        result = ((result* 31)+((this.seatsAvail == null)? 0 :this.seatsAvail.hashCode()));
        result = ((result* 31)+((this.scbcrseCeuInd == null)? 0 :this.scbcrseCeuInd.hashCode()));
        result = ((result* 31)+((this.scbcrseCreditHrLow == null)? 0 :this.scbcrseCreditHrLow.hashCode()));
        result = ((result* 31)+((this.scbcrseLecHrInd == null)? 0 :this.scbcrseLecHrInd.hashCode()));
        result = ((result* 31)+((this.blockInd == null)? 0 :this.blockInd.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.scbcrseCreditHrHigh == null)? 0 :this.scbcrseCreditHrHigh.hashCode()));
        result = ((result* 31)+((this.scbcrseMaxRptUnits == null)? 0 :this.scbcrseMaxRptUnits.hashCode()));
        result = ((result* 31)+((this.scbcrseLabHrHigh == null)? 0 :this.scbcrseLabHrHigh.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.scbcrseRepsCode == null)? 0 :this.scbcrseRepsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scbcrseOthHrInd == null)? 0 :this.scbcrseOthHrInd.hashCode()));
        result = ((result* 31)+((this.scbcrseRepeatLimit == null)? 0 :this.scbcrseRepeatLimit.hashCode()));
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
        return (((((((((((((((((((((((((((((((((((((((((((this.scbcrseOthHrLow == rhs.scbcrseOthHrLow)||((this.scbcrseOthHrLow!= null)&&this.scbcrseOthHrLow.equals(rhs.scbcrseOthHrLow)))&&((this.creditHrs == rhs.creditHrs)||((this.creditHrs!= null)&&this.creditHrs.equals(rhs.creditHrs))))&&((this.scbcrseOthHrHigh == rhs.scbcrseOthHrHigh)||((this.scbcrseOthHrHigh!= null)&&this.scbcrseOthHrHigh.equals(rhs.scbcrseOthHrHigh))))&&((this.scbcrseBillHrInd == rhs.scbcrseBillHrInd)||((this.scbcrseBillHrInd!= null)&&this.scbcrseBillHrInd.equals(rhs.scbcrseBillHrInd))))&&((this.scbcrseContHrHigh == rhs.scbcrseContHrHigh)||((this.scbcrseContHrHigh!= null)&&this.scbcrseContHrHigh.equals(rhs.scbcrseContHrHigh))))&&((this.scbcrseContHrInd == rhs.scbcrseContHrInd)||((this.scbcrseContHrInd!= null)&&this.scbcrseContHrInd.equals(rhs.scbcrseContHrInd))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.scbcrseBillHrLow == rhs.scbcrseBillHrLow)||((this.scbcrseBillHrLow!= null)&&this.scbcrseBillHrLow.equals(rhs.scbcrseBillHrLow))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.billHrs == rhs.billHrs)||((this.billHrs!= null)&&this.billHrs.equals(rhs.billHrs))))&&((this.scbcrseLabHrLow == rhs.scbcrseLabHrLow)||((this.scbcrseLabHrLow!= null)&&this.scbcrseLabHrLow.equals(rhs.scbcrseLabHrLow))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.lecHr == rhs.lecHr)||((this.lecHr!= null)&&this.lecHr.equals(rhs.lecHr))))&&((this.sstsCode == rhs.sstsCode)||((this.sstsCode!= null)&&this.sstsCode.equals(rhs.sstsCode))))&&((this.scbcrseLecHrHigh == rhs.scbcrseLecHrHigh)||((this.scbcrseLecHrHigh!= null)&&this.scbcrseLecHrHigh.equals(rhs.scbcrseLecHrHigh))))&&((this.scbcrseCreditHrInd == rhs.scbcrseCreditHrInd)||((this.scbcrseCreditHrInd!= null)&&this.scbcrseCreditHrInd.equals(rhs.scbcrseCreditHrInd))))&&((this.scbcrseLabHrInd == rhs.scbcrseLabHrInd)||((this.scbcrseLabHrInd!= null)&&this.scbcrseLabHrInd.equals(rhs.scbcrseLabHrInd))))&&((this.scbcrseContHrLow == rhs.scbcrseContHrLow)||((this.scbcrseContHrLow!= null)&&this.scbcrseContHrLow.equals(rhs.scbcrseContHrLow))))&&((this.othHr == rhs.othHr)||((this.othHr!= null)&&this.othHr.equals(rhs.othHr))))&&((this.scbcrseLecHrLow == rhs.scbcrseLecHrLow)||((this.scbcrseLecHrLow!= null)&&this.scbcrseLecHrLow.equals(rhs.scbcrseLecHrLow))))&&((this.contHr == rhs.contHr)||((this.contHr!= null)&&this.contHr.equals(rhs.contHr))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.scbcrseBillHrHigh == rhs.scbcrseBillHrHigh)||((this.scbcrseBillHrHigh!= null)&&this.scbcrseBillHrHigh.equals(rhs.scbcrseBillHrHigh))))&&((this.xlstGroup == rhs.xlstGroup)||((this.xlstGroup!= null)&&this.xlstGroup.equals(rhs.xlstGroup))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.xlstAvail == rhs.xlstAvail)||((this.xlstAvail!= null)&&this.xlstAvail.equals(rhs.xlstAvail))))&&((this.labHr == rhs.labHr)||((this.labHr!= null)&&this.labHr.equals(rhs.labHr))))&&((this.seatsAvail == rhs.seatsAvail)||((this.seatsAvail!= null)&&this.seatsAvail.equals(rhs.seatsAvail))))&&((this.scbcrseCeuInd == rhs.scbcrseCeuInd)||((this.scbcrseCeuInd!= null)&&this.scbcrseCeuInd.equals(rhs.scbcrseCeuInd))))&&((this.scbcrseCreditHrLow == rhs.scbcrseCreditHrLow)||((this.scbcrseCreditHrLow!= null)&&this.scbcrseCreditHrLow.equals(rhs.scbcrseCreditHrLow))))&&((this.scbcrseLecHrInd == rhs.scbcrseLecHrInd)||((this.scbcrseLecHrInd!= null)&&this.scbcrseLecHrInd.equals(rhs.scbcrseLecHrInd))))&&((this.blockInd == rhs.blockInd)||((this.blockInd!= null)&&this.blockInd.equals(rhs.blockInd))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.scbcrseCreditHrHigh == rhs.scbcrseCreditHrHigh)||((this.scbcrseCreditHrHigh!= null)&&this.scbcrseCreditHrHigh.equals(rhs.scbcrseCreditHrHigh))))&&((this.scbcrseMaxRptUnits == rhs.scbcrseMaxRptUnits)||((this.scbcrseMaxRptUnits!= null)&&this.scbcrseMaxRptUnits.equals(rhs.scbcrseMaxRptUnits))))&&((this.scbcrseLabHrHigh == rhs.scbcrseLabHrHigh)||((this.scbcrseLabHrHigh!= null)&&this.scbcrseLabHrHigh.equals(rhs.scbcrseLabHrHigh))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.scbcrseRepsCode == rhs.scbcrseRepsCode)||((this.scbcrseRepsCode!= null)&&this.scbcrseRepsCode.equals(rhs.scbcrseRepsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scbcrseOthHrInd == rhs.scbcrseOthHrInd)||((this.scbcrseOthHrInd!= null)&&this.scbcrseOthHrInd.equals(rhs.scbcrseOthHrInd))))&&((this.scbcrseRepeatLimit == rhs.scbcrseRepeatLimit)||((this.scbcrseRepeatLimit!= null)&&this.scbcrseRepeatLimit.equals(rhs.scbcrseRepeatLimit))))&&((this.waitCount == rhs.waitCount)||((this.waitCount!= null)&&this.waitCount.equals(rhs.waitCount))));
    }

}
