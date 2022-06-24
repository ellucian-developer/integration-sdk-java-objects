
package com.ellucian.generated.bpapi.ban.basic_course_informations.v1_0_0;

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
    "cstaCode",
    "duntCode",
    "scacrseCrseNumb",
    "addFeesInd",
    "billHrLow",
    "scacrseSubjCode",
    "contHrInd",
    "repeatLimit",
    "tuiwInd",
    "labHrInd",
    "othHrInd",
    "billHrInd",
    "title",
    "othHrHigh",
    "cipcCode",
    "creditHrHigh",
    "creditHrLow",
    "creditHrInd",
    "scbcrseContHrLow",
    "othHrLow",
    "labHrHigh",
    "lecHrInd",
    "pwavCode",
    "billHrHigh",
    "maxRptUnits",
    "repsCode",
    "lecHrLow",
    "lecHrHigh",
    "contHrHigh",
    "aprvCode",
    "numberOfUnits",
    "ceuInd",
    "divsCode",
    "collCode",
    "labHrLow",
    "contHrLow",
    "scacrseTermCodeEff",
    "deptCode"
})
@Generated("jsonschema2pojo")
public class BasicCourseInformations100PutRequest {

    /**
     * Status
     * <p>
     * Lineage reference object : SCBCRSE_CSTA_CODE, Lookup lineage reference object : stvcsta
     * (Required)
     * 
     */
    @JsonProperty("cstaCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CSTA_CODE, Lookup lineage reference object : stvcsta")
    private String cstaCode;
    /**
     * Lineage reference object : SCBCRSE_DUNT_CODE, Lookup lineage reference object : gtvdunt
     * 
     */
    @JsonProperty("duntCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_DUNT_CODE, Lookup lineage reference object : gtvdunt")
    private String duntCode;
    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : stvsubj")
    private String scacrseCrseNumb;
    /**
     * Additional Fees
     * <p>
     * Lineage reference object : SCBCRSE_ADD_FEES_IND
     * 
     */
    @JsonProperty("addFeesInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_ADD_FEES_IND")
    private String addFeesInd;
    /**
     * Billing * Low
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_LOW
     * (Required)
     * 
     */
    @JsonProperty("billHrLow")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_BILL_HR_LOW")
    private Double billHrLow;
    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private String scacrseSubjCode;
    /**
     * Contact None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_IND
     * 
     */
    @JsonProperty("contHrInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CONT_HR_IND")
    private String contHrInd;
    /**
     * Limit
     * <p>
     * Lineage reference object : SCBCRSE_REPEAT_LIMIT
     * 
     */
    @JsonProperty("repeatLimit")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_REPEAT_LIMIT")
    private Double repeatLimit;
    /**
     * Tuition Waiver
     * <p>
     * Lineage reference object : SCBCRSE_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_TUIW_IND")
    private String tuiwInd;
    /**
     * Lab None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_LAB_HR_IND
     * 
     */
    @JsonProperty("labHrInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_LAB_HR_IND")
    private String labHrInd;
    /**
     * Other None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_OTH_HR_IND
     * 
     */
    @JsonProperty("othHrInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_OTH_HR_IND")
    private String othHrInd;
    /**
     * Billing * None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_IND
     * 
     */
    @JsonProperty("billHrInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_BILL_HR_IND")
    private String billHrInd;
    /**
     * Course Title
     * <p>
     * Lineage reference object : SCBCRSE_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_TITLE")
    private String title;
    /**
     * Other High
     * <p>
     * Lineage reference object : SCBCRSE_OTH_HR_HIGH
     * 
     */
    @JsonProperty("othHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_OTH_HR_HIGH")
    private Double othHrHigh;
    /**
     * CIP
     * <p>
     * Lineage reference object : SCBCRSE_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("cipcCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CIPC_CODE, Lookup lineage reference object : stvcipc")
    private String cipcCode;
    /**
     * CEU or Credit High
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_HIGH
     * 
     */
    @JsonProperty("creditHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CREDIT_HR_HIGH")
    private Double creditHrHigh;
    /**
     * CEU or Credit Low
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_LOW
     * 
     */
    @JsonProperty("creditHrLow")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CREDIT_HR_LOW")
    private Double creditHrLow;
    /**
     * CEU or Credit None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_IND
     * 
     */
    @JsonProperty("creditHrInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CREDIT_HR_IND")
    private String creditHrInd;
    /**
     * Contact Low
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_LOW
     * 
     */
    @JsonProperty("scbcrseContHrLow")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CONT_HR_LOW")
    private Double scbcrseContHrLow;
    /**
     * Other Low
     * <p>
     * Lineage reference object : SCBCRSE_OTH_HR_LOW
     * 
     */
    @JsonProperty("othHrLow")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_OTH_HR_LOW")
    private Double othHrLow;
    /**
     * Lab High
     * <p>
     * Lineage reference object : SCBCRSE_LAB_HR_HIGH
     * 
     */
    @JsonProperty("labHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_LAB_HR_HIGH")
    private Double labHrHigh;
    /**
     * Lecture None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_IND
     * 
     */
    @JsonProperty("lecHrInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_LEC_HR_IND")
    private String lecHrInd;
    /**
     * Prerequisite Waiver
     * <p>
     * Lineage reference object : SCBCRSE_PWAV_CODE, Lookup lineage reference object : stvpwav
     * 
     */
    @JsonProperty("pwavCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_PWAV_CODE, Lookup lineage reference object : stvpwav")
    private String pwavCode;
    /**
     * Billing * High
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_HIGH
     * 
     */
    @JsonProperty("billHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_BILL_HR_HIGH")
    private Double billHrHigh;
    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SCBCRSE_MAX_RPT_UNITS
     * 
     */
    @JsonProperty("maxRptUnits")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_MAX_RPT_UNITS")
    private Double maxRptUnits;
    /**
     * Repeat Status
     * <p>
     * Lineage reference object : SCBCRSE_REPS_CODE, Lookup lineage reference object : stvreps
     * 
     */
    @JsonProperty("repsCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_REPS_CODE, Lookup lineage reference object : stvreps")
    private String repsCode;
    /**
     * Lecture Low
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_LOW
     * 
     */
    @JsonProperty("lecHrLow")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_LEC_HR_LOW")
    private Double lecHrLow;
    /**
     * Lecture High
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_HIGH
     * 
     */
    @JsonProperty("lecHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_LEC_HR_HIGH")
    private Double lecHrHigh;
    /**
     * Contact High
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_HIGH
     * 
     */
    @JsonProperty("contHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CONT_HR_HIGH")
    private Double contHrHigh;
    /**
     * Approval
     * <p>
     * Lineage reference object : SCBCRSE_APRV_CODE, Lookup lineage reference object : stvaprv
     * 
     */
    @JsonProperty("aprvCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_APRV_CODE, Lookup lineage reference object : stvaprv")
    private String aprvCode;
    /**
     * Duration
     * <p>
     * Lineage reference object : SCBCRSE_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("numberOfUnits")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_NUMBER_OF_UNITS")
    private Double numberOfUnits;
    /**
     * Continuing Education
     * <p>
     * Lineage reference object : SCBCRSE_CEU_IND
     * 
     */
    @JsonProperty("ceuInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CEU_IND")
    private String ceuInd;
    /**
     * Division
     * <p>
     * Lineage reference object : SCBCRSE_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_DIVS_CODE, Lookup lineage reference object : stvdivs")
    private String divsCode;
    /**
     * College
     * <p>
     * Lineage reference object : SCBCRSE_COLL_CODE, Lookup lineage reference object : stvcoll
     * (Required)
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Lab Low
     * <p>
     * Lineage reference object : SCBCRSE_LAB_HR_LOW
     * 
     */
    @JsonProperty("labHrLow")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_LAB_HR_LOW")
    private Double labHrLow;
    /**
     * Contact Low
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_LOW
     * 
     */
    @JsonProperty("contHrLow")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CONT_HR_LOW")
    private Double contHrLow;
    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : scacrseTermCodeEff")
    private String scacrseTermCodeEff;
    /**
     * Department
     * <p>
     * Lineage reference object : SCBCRSE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : SCBCRSE_CSTA_CODE, Lookup lineage reference object : stvcsta
     * (Required)
     * 
     */
    @JsonProperty("cstaCode")
    public String getCstaCode() {
        return cstaCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SCBCRSE_CSTA_CODE, Lookup lineage reference object : stvcsta
     * (Required)
     * 
     */
    @JsonProperty("cstaCode")
    public void setCstaCode(String cstaCode) {
        this.cstaCode = cstaCode;
    }

    public BasicCourseInformations100PutRequest withCstaCode(String cstaCode) {
        this.cstaCode = cstaCode;
        return this;
    }

    /**
     * Lineage reference object : SCBCRSE_DUNT_CODE, Lookup lineage reference object : gtvdunt
     * 
     */
    @JsonProperty("duntCode")
    public String getDuntCode() {
        return duntCode;
    }

    /**
     * Lineage reference object : SCBCRSE_DUNT_CODE, Lookup lineage reference object : gtvdunt
     * 
     */
    @JsonProperty("duntCode")
    public void setDuntCode(String duntCode) {
        this.duntCode = duntCode;
    }

    public BasicCourseInformations100PutRequest withDuntCode(String duntCode) {
        this.duntCode = duntCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public String getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public BasicCourseInformations100PutRequest withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    /**
     * Additional Fees
     * <p>
     * Lineage reference object : SCBCRSE_ADD_FEES_IND
     * 
     */
    @JsonProperty("addFeesInd")
    public String getAddFeesInd() {
        return addFeesInd;
    }

    /**
     * Additional Fees
     * <p>
     * Lineage reference object : SCBCRSE_ADD_FEES_IND
     * 
     */
    @JsonProperty("addFeesInd")
    public void setAddFeesInd(String addFeesInd) {
        this.addFeesInd = addFeesInd;
    }

    public BasicCourseInformations100PutRequest withAddFeesInd(String addFeesInd) {
        this.addFeesInd = addFeesInd;
        return this;
    }

    /**
     * Billing * Low
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_LOW
     * (Required)
     * 
     */
    @JsonProperty("billHrLow")
    public Double getBillHrLow() {
        return billHrLow;
    }

    /**
     * Billing * Low
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_LOW
     * (Required)
     * 
     */
    @JsonProperty("billHrLow")
    public void setBillHrLow(Double billHrLow) {
        this.billHrLow = billHrLow;
    }

    public BasicCourseInformations100PutRequest withBillHrLow(Double billHrLow) {
        this.billHrLow = billHrLow;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public String getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public BasicCourseInformations100PutRequest withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    /**
     * Contact None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_IND
     * 
     */
    @JsonProperty("contHrInd")
    public String getContHrInd() {
        return contHrInd;
    }

    /**
     * Contact None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_IND
     * 
     */
    @JsonProperty("contHrInd")
    public void setContHrInd(String contHrInd) {
        this.contHrInd = contHrInd;
    }

    public BasicCourseInformations100PutRequest withContHrInd(String contHrInd) {
        this.contHrInd = contHrInd;
        return this;
    }

    /**
     * Limit
     * <p>
     * Lineage reference object : SCBCRSE_REPEAT_LIMIT
     * 
     */
    @JsonProperty("repeatLimit")
    public Double getRepeatLimit() {
        return repeatLimit;
    }

    /**
     * Limit
     * <p>
     * Lineage reference object : SCBCRSE_REPEAT_LIMIT
     * 
     */
    @JsonProperty("repeatLimit")
    public void setRepeatLimit(Double repeatLimit) {
        this.repeatLimit = repeatLimit;
    }

    public BasicCourseInformations100PutRequest withRepeatLimit(Double repeatLimit) {
        this.repeatLimit = repeatLimit;
        return this;
    }

    /**
     * Tuition Waiver
     * <p>
     * Lineage reference object : SCBCRSE_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    public String getTuiwInd() {
        return tuiwInd;
    }

    /**
     * Tuition Waiver
     * <p>
     * Lineage reference object : SCBCRSE_TUIW_IND
     * 
     */
    @JsonProperty("tuiwInd")
    public void setTuiwInd(String tuiwInd) {
        this.tuiwInd = tuiwInd;
    }

    public BasicCourseInformations100PutRequest withTuiwInd(String tuiwInd) {
        this.tuiwInd = tuiwInd;
        return this;
    }

    /**
     * Lab None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_LAB_HR_IND
     * 
     */
    @JsonProperty("labHrInd")
    public String getLabHrInd() {
        return labHrInd;
    }

    /**
     * Lab None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_LAB_HR_IND
     * 
     */
    @JsonProperty("labHrInd")
    public void setLabHrInd(String labHrInd) {
        this.labHrInd = labHrInd;
    }

    public BasicCourseInformations100PutRequest withLabHrInd(String labHrInd) {
        this.labHrInd = labHrInd;
        return this;
    }

    /**
     * Other None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_OTH_HR_IND
     * 
     */
    @JsonProperty("othHrInd")
    public String getOthHrInd() {
        return othHrInd;
    }

    /**
     * Other None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_OTH_HR_IND
     * 
     */
    @JsonProperty("othHrInd")
    public void setOthHrInd(String othHrInd) {
        this.othHrInd = othHrInd;
    }

    public BasicCourseInformations100PutRequest withOthHrInd(String othHrInd) {
        this.othHrInd = othHrInd;
        return this;
    }

    /**
     * Billing * None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_IND
     * 
     */
    @JsonProperty("billHrInd")
    public String getBillHrInd() {
        return billHrInd;
    }

    /**
     * Billing * None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_IND
     * 
     */
    @JsonProperty("billHrInd")
    public void setBillHrInd(String billHrInd) {
        this.billHrInd = billHrInd;
    }

    public BasicCourseInformations100PutRequest withBillHrInd(String billHrInd) {
        this.billHrInd = billHrInd;
        return this;
    }

    /**
     * Course Title
     * <p>
     * Lineage reference object : SCBCRSE_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Course Title
     * <p>
     * Lineage reference object : SCBCRSE_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public BasicCourseInformations100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Other High
     * <p>
     * Lineage reference object : SCBCRSE_OTH_HR_HIGH
     * 
     */
    @JsonProperty("othHrHigh")
    public Double getOthHrHigh() {
        return othHrHigh;
    }

    /**
     * Other High
     * <p>
     * Lineage reference object : SCBCRSE_OTH_HR_HIGH
     * 
     */
    @JsonProperty("othHrHigh")
    public void setOthHrHigh(Double othHrHigh) {
        this.othHrHigh = othHrHigh;
    }

    public BasicCourseInformations100PutRequest withOthHrHigh(Double othHrHigh) {
        this.othHrHigh = othHrHigh;
        return this;
    }

    /**
     * CIP
     * <p>
     * Lineage reference object : SCBCRSE_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("cipcCode")
    public String getCipcCode() {
        return cipcCode;
    }

    /**
     * CIP
     * <p>
     * Lineage reference object : SCBCRSE_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("cipcCode")
    public void setCipcCode(String cipcCode) {
        this.cipcCode = cipcCode;
    }

    public BasicCourseInformations100PutRequest withCipcCode(String cipcCode) {
        this.cipcCode = cipcCode;
        return this;
    }

    /**
     * CEU or Credit High
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_HIGH
     * 
     */
    @JsonProperty("creditHrHigh")
    public Double getCreditHrHigh() {
        return creditHrHigh;
    }

    /**
     * CEU or Credit High
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_HIGH
     * 
     */
    @JsonProperty("creditHrHigh")
    public void setCreditHrHigh(Double creditHrHigh) {
        this.creditHrHigh = creditHrHigh;
    }

    public BasicCourseInformations100PutRequest withCreditHrHigh(Double creditHrHigh) {
        this.creditHrHigh = creditHrHigh;
        return this;
    }

    /**
     * CEU or Credit Low
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_LOW
     * 
     */
    @JsonProperty("creditHrLow")
    public Double getCreditHrLow() {
        return creditHrLow;
    }

    /**
     * CEU or Credit Low
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_LOW
     * 
     */
    @JsonProperty("creditHrLow")
    public void setCreditHrLow(Double creditHrLow) {
        this.creditHrLow = creditHrLow;
    }

    public BasicCourseInformations100PutRequest withCreditHrLow(Double creditHrLow) {
        this.creditHrLow = creditHrLow;
        return this;
    }

    /**
     * CEU or Credit None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_IND
     * 
     */
    @JsonProperty("creditHrInd")
    public String getCreditHrInd() {
        return creditHrInd;
    }

    /**
     * CEU or Credit None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_IND
     * 
     */
    @JsonProperty("creditHrInd")
    public void setCreditHrInd(String creditHrInd) {
        this.creditHrInd = creditHrInd;
    }

    public BasicCourseInformations100PutRequest withCreditHrInd(String creditHrInd) {
        this.creditHrInd = creditHrInd;
        return this;
    }

    /**
     * Contact Low
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_LOW
     * 
     */
    @JsonProperty("scbcrseContHrLow")
    public Double getScbcrseContHrLow() {
        return scbcrseContHrLow;
    }

    /**
     * Contact Low
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_LOW
     * 
     */
    @JsonProperty("scbcrseContHrLow")
    public void setScbcrseContHrLow(Double scbcrseContHrLow) {
        this.scbcrseContHrLow = scbcrseContHrLow;
    }

    public BasicCourseInformations100PutRequest withScbcrseContHrLow(Double scbcrseContHrLow) {
        this.scbcrseContHrLow = scbcrseContHrLow;
        return this;
    }

    /**
     * Other Low
     * <p>
     * Lineage reference object : SCBCRSE_OTH_HR_LOW
     * 
     */
    @JsonProperty("othHrLow")
    public Double getOthHrLow() {
        return othHrLow;
    }

    /**
     * Other Low
     * <p>
     * Lineage reference object : SCBCRSE_OTH_HR_LOW
     * 
     */
    @JsonProperty("othHrLow")
    public void setOthHrLow(Double othHrLow) {
        this.othHrLow = othHrLow;
    }

    public BasicCourseInformations100PutRequest withOthHrLow(Double othHrLow) {
        this.othHrLow = othHrLow;
        return this;
    }

    /**
     * Lab High
     * <p>
     * Lineage reference object : SCBCRSE_LAB_HR_HIGH
     * 
     */
    @JsonProperty("labHrHigh")
    public Double getLabHrHigh() {
        return labHrHigh;
    }

    /**
     * Lab High
     * <p>
     * Lineage reference object : SCBCRSE_LAB_HR_HIGH
     * 
     */
    @JsonProperty("labHrHigh")
    public void setLabHrHigh(Double labHrHigh) {
        this.labHrHigh = labHrHigh;
    }

    public BasicCourseInformations100PutRequest withLabHrHigh(Double labHrHigh) {
        this.labHrHigh = labHrHigh;
        return this;
    }

    /**
     * Lecture None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_IND
     * 
     */
    @JsonProperty("lecHrInd")
    public String getLecHrInd() {
        return lecHrInd;
    }

    /**
     * Lecture None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_IND
     * 
     */
    @JsonProperty("lecHrInd")
    public void setLecHrInd(String lecHrInd) {
        this.lecHrInd = lecHrInd;
    }

    public BasicCourseInformations100PutRequest withLecHrInd(String lecHrInd) {
        this.lecHrInd = lecHrInd;
        return this;
    }

    /**
     * Prerequisite Waiver
     * <p>
     * Lineage reference object : SCBCRSE_PWAV_CODE, Lookup lineage reference object : stvpwav
     * 
     */
    @JsonProperty("pwavCode")
    public String getPwavCode() {
        return pwavCode;
    }

    /**
     * Prerequisite Waiver
     * <p>
     * Lineage reference object : SCBCRSE_PWAV_CODE, Lookup lineage reference object : stvpwav
     * 
     */
    @JsonProperty("pwavCode")
    public void setPwavCode(String pwavCode) {
        this.pwavCode = pwavCode;
    }

    public BasicCourseInformations100PutRequest withPwavCode(String pwavCode) {
        this.pwavCode = pwavCode;
        return this;
    }

    /**
     * Billing * High
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_HIGH
     * 
     */
    @JsonProperty("billHrHigh")
    public Double getBillHrHigh() {
        return billHrHigh;
    }

    /**
     * Billing * High
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_HIGH
     * 
     */
    @JsonProperty("billHrHigh")
    public void setBillHrHigh(Double billHrHigh) {
        this.billHrHigh = billHrHigh;
    }

    public BasicCourseInformations100PutRequest withBillHrHigh(Double billHrHigh) {
        this.billHrHigh = billHrHigh;
        return this;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SCBCRSE_MAX_RPT_UNITS
     * 
     */
    @JsonProperty("maxRptUnits")
    public Double getMaxRptUnits() {
        return maxRptUnits;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SCBCRSE_MAX_RPT_UNITS
     * 
     */
    @JsonProperty("maxRptUnits")
    public void setMaxRptUnits(Double maxRptUnits) {
        this.maxRptUnits = maxRptUnits;
    }

    public BasicCourseInformations100PutRequest withMaxRptUnits(Double maxRptUnits) {
        this.maxRptUnits = maxRptUnits;
        return this;
    }

    /**
     * Repeat Status
     * <p>
     * Lineage reference object : SCBCRSE_REPS_CODE, Lookup lineage reference object : stvreps
     * 
     */
    @JsonProperty("repsCode")
    public String getRepsCode() {
        return repsCode;
    }

    /**
     * Repeat Status
     * <p>
     * Lineage reference object : SCBCRSE_REPS_CODE, Lookup lineage reference object : stvreps
     * 
     */
    @JsonProperty("repsCode")
    public void setRepsCode(String repsCode) {
        this.repsCode = repsCode;
    }

    public BasicCourseInformations100PutRequest withRepsCode(String repsCode) {
        this.repsCode = repsCode;
        return this;
    }

    /**
     * Lecture Low
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_LOW
     * 
     */
    @JsonProperty("lecHrLow")
    public Double getLecHrLow() {
        return lecHrLow;
    }

    /**
     * Lecture Low
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_LOW
     * 
     */
    @JsonProperty("lecHrLow")
    public void setLecHrLow(Double lecHrLow) {
        this.lecHrLow = lecHrLow;
    }

    public BasicCourseInformations100PutRequest withLecHrLow(Double lecHrLow) {
        this.lecHrLow = lecHrLow;
        return this;
    }

    /**
     * Lecture High
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_HIGH
     * 
     */
    @JsonProperty("lecHrHigh")
    public Double getLecHrHigh() {
        return lecHrHigh;
    }

    /**
     * Lecture High
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_HIGH
     * 
     */
    @JsonProperty("lecHrHigh")
    public void setLecHrHigh(Double lecHrHigh) {
        this.lecHrHigh = lecHrHigh;
    }

    public BasicCourseInformations100PutRequest withLecHrHigh(Double lecHrHigh) {
        this.lecHrHigh = lecHrHigh;
        return this;
    }

    /**
     * Contact High
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_HIGH
     * 
     */
    @JsonProperty("contHrHigh")
    public Double getContHrHigh() {
        return contHrHigh;
    }

    /**
     * Contact High
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_HIGH
     * 
     */
    @JsonProperty("contHrHigh")
    public void setContHrHigh(Double contHrHigh) {
        this.contHrHigh = contHrHigh;
    }

    public BasicCourseInformations100PutRequest withContHrHigh(Double contHrHigh) {
        this.contHrHigh = contHrHigh;
        return this;
    }

    /**
     * Approval
     * <p>
     * Lineage reference object : SCBCRSE_APRV_CODE, Lookup lineage reference object : stvaprv
     * 
     */
    @JsonProperty("aprvCode")
    public String getAprvCode() {
        return aprvCode;
    }

    /**
     * Approval
     * <p>
     * Lineage reference object : SCBCRSE_APRV_CODE, Lookup lineage reference object : stvaprv
     * 
     */
    @JsonProperty("aprvCode")
    public void setAprvCode(String aprvCode) {
        this.aprvCode = aprvCode;
    }

    public BasicCourseInformations100PutRequest withAprvCode(String aprvCode) {
        this.aprvCode = aprvCode;
        return this;
    }

    /**
     * Duration
     * <p>
     * Lineage reference object : SCBCRSE_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("numberOfUnits")
    public Double getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Duration
     * <p>
     * Lineage reference object : SCBCRSE_NUMBER_OF_UNITS
     * 
     */
    @JsonProperty("numberOfUnits")
    public void setNumberOfUnits(Double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public BasicCourseInformations100PutRequest withNumberOfUnits(Double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
        return this;
    }

    /**
     * Continuing Education
     * <p>
     * Lineage reference object : SCBCRSE_CEU_IND
     * 
     */
    @JsonProperty("ceuInd")
    public String getCeuInd() {
        return ceuInd;
    }

    /**
     * Continuing Education
     * <p>
     * Lineage reference object : SCBCRSE_CEU_IND
     * 
     */
    @JsonProperty("ceuInd")
    public void setCeuInd(String ceuInd) {
        this.ceuInd = ceuInd;
    }

    public BasicCourseInformations100PutRequest withCeuInd(String ceuInd) {
        this.ceuInd = ceuInd;
        return this;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : SCBCRSE_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    public String getDivsCode() {
        return divsCode;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : SCBCRSE_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    public void setDivsCode(String divsCode) {
        this.divsCode = divsCode;
    }

    public BasicCourseInformations100PutRequest withDivsCode(String divsCode) {
        this.divsCode = divsCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SCBCRSE_COLL_CODE, Lookup lineage reference object : stvcoll
     * (Required)
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SCBCRSE_COLL_CODE, Lookup lineage reference object : stvcoll
     * (Required)
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public BasicCourseInformations100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Lab Low
     * <p>
     * Lineage reference object : SCBCRSE_LAB_HR_LOW
     * 
     */
    @JsonProperty("labHrLow")
    public Double getLabHrLow() {
        return labHrLow;
    }

    /**
     * Lab Low
     * <p>
     * Lineage reference object : SCBCRSE_LAB_HR_LOW
     * 
     */
    @JsonProperty("labHrLow")
    public void setLabHrLow(Double labHrLow) {
        this.labHrLow = labHrLow;
    }

    public BasicCourseInformations100PutRequest withLabHrLow(Double labHrLow) {
        this.labHrLow = labHrLow;
        return this;
    }

    /**
     * Contact Low
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_LOW
     * 
     */
    @JsonProperty("contHrLow")
    public Double getContHrLow() {
        return contHrLow;
    }

    /**
     * Contact Low
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_LOW
     * 
     */
    @JsonProperty("contHrLow")
    public void setContHrLow(Double contHrLow) {
        this.contHrLow = contHrLow;
    }

    public BasicCourseInformations100PutRequest withContHrLow(Double contHrLow) {
        this.contHrLow = contHrLow;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public String getScacrseTermCodeEff() {
        return scacrseTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public void setScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
    }

    public BasicCourseInformations100PutRequest withScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SCBCRSE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SCBCRSE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BasicCourseInformations100PutRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public BasicCourseInformations100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BasicCourseInformations100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cstaCode");
        sb.append('=');
        sb.append(((this.cstaCode == null)?"<null>":this.cstaCode));
        sb.append(',');
        sb.append("duntCode");
        sb.append('=');
        sb.append(((this.duntCode == null)?"<null>":this.duntCode));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("addFeesInd");
        sb.append('=');
        sb.append(((this.addFeesInd == null)?"<null>":this.addFeesInd));
        sb.append(',');
        sb.append("billHrLow");
        sb.append('=');
        sb.append(((this.billHrLow == null)?"<null>":this.billHrLow));
        sb.append(',');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("contHrInd");
        sb.append('=');
        sb.append(((this.contHrInd == null)?"<null>":this.contHrInd));
        sb.append(',');
        sb.append("repeatLimit");
        sb.append('=');
        sb.append(((this.repeatLimit == null)?"<null>":this.repeatLimit));
        sb.append(',');
        sb.append("tuiwInd");
        sb.append('=');
        sb.append(((this.tuiwInd == null)?"<null>":this.tuiwInd));
        sb.append(',');
        sb.append("labHrInd");
        sb.append('=');
        sb.append(((this.labHrInd == null)?"<null>":this.labHrInd));
        sb.append(',');
        sb.append("othHrInd");
        sb.append('=');
        sb.append(((this.othHrInd == null)?"<null>":this.othHrInd));
        sb.append(',');
        sb.append("billHrInd");
        sb.append('=');
        sb.append(((this.billHrInd == null)?"<null>":this.billHrInd));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("othHrHigh");
        sb.append('=');
        sb.append(((this.othHrHigh == null)?"<null>":this.othHrHigh));
        sb.append(',');
        sb.append("cipcCode");
        sb.append('=');
        sb.append(((this.cipcCode == null)?"<null>":this.cipcCode));
        sb.append(',');
        sb.append("creditHrHigh");
        sb.append('=');
        sb.append(((this.creditHrHigh == null)?"<null>":this.creditHrHigh));
        sb.append(',');
        sb.append("creditHrLow");
        sb.append('=');
        sb.append(((this.creditHrLow == null)?"<null>":this.creditHrLow));
        sb.append(',');
        sb.append("creditHrInd");
        sb.append('=');
        sb.append(((this.creditHrInd == null)?"<null>":this.creditHrInd));
        sb.append(',');
        sb.append("scbcrseContHrLow");
        sb.append('=');
        sb.append(((this.scbcrseContHrLow == null)?"<null>":this.scbcrseContHrLow));
        sb.append(',');
        sb.append("othHrLow");
        sb.append('=');
        sb.append(((this.othHrLow == null)?"<null>":this.othHrLow));
        sb.append(',');
        sb.append("labHrHigh");
        sb.append('=');
        sb.append(((this.labHrHigh == null)?"<null>":this.labHrHigh));
        sb.append(',');
        sb.append("lecHrInd");
        sb.append('=');
        sb.append(((this.lecHrInd == null)?"<null>":this.lecHrInd));
        sb.append(',');
        sb.append("pwavCode");
        sb.append('=');
        sb.append(((this.pwavCode == null)?"<null>":this.pwavCode));
        sb.append(',');
        sb.append("billHrHigh");
        sb.append('=');
        sb.append(((this.billHrHigh == null)?"<null>":this.billHrHigh));
        sb.append(',');
        sb.append("maxRptUnits");
        sb.append('=');
        sb.append(((this.maxRptUnits == null)?"<null>":this.maxRptUnits));
        sb.append(',');
        sb.append("repsCode");
        sb.append('=');
        sb.append(((this.repsCode == null)?"<null>":this.repsCode));
        sb.append(',');
        sb.append("lecHrLow");
        sb.append('=');
        sb.append(((this.lecHrLow == null)?"<null>":this.lecHrLow));
        sb.append(',');
        sb.append("lecHrHigh");
        sb.append('=');
        sb.append(((this.lecHrHigh == null)?"<null>":this.lecHrHigh));
        sb.append(',');
        sb.append("contHrHigh");
        sb.append('=');
        sb.append(((this.contHrHigh == null)?"<null>":this.contHrHigh));
        sb.append(',');
        sb.append("aprvCode");
        sb.append('=');
        sb.append(((this.aprvCode == null)?"<null>":this.aprvCode));
        sb.append(',');
        sb.append("numberOfUnits");
        sb.append('=');
        sb.append(((this.numberOfUnits == null)?"<null>":this.numberOfUnits));
        sb.append(',');
        sb.append("ceuInd");
        sb.append('=');
        sb.append(((this.ceuInd == null)?"<null>":this.ceuInd));
        sb.append(',');
        sb.append("divsCode");
        sb.append('=');
        sb.append(((this.divsCode == null)?"<null>":this.divsCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("labHrLow");
        sb.append('=');
        sb.append(((this.labHrLow == null)?"<null>":this.labHrLow));
        sb.append(',');
        sb.append("contHrLow");
        sb.append('=');
        sb.append(((this.contHrLow == null)?"<null>":this.contHrLow));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
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
        result = ((result* 31)+((this.cstaCode == null)? 0 :this.cstaCode.hashCode()));
        result = ((result* 31)+((this.duntCode == null)? 0 :this.duntCode.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.addFeesInd == null)? 0 :this.addFeesInd.hashCode()));
        result = ((result* 31)+((this.billHrLow == null)? 0 :this.billHrLow.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.contHrInd == null)? 0 :this.contHrInd.hashCode()));
        result = ((result* 31)+((this.repeatLimit == null)? 0 :this.repeatLimit.hashCode()));
        result = ((result* 31)+((this.tuiwInd == null)? 0 :this.tuiwInd.hashCode()));
        result = ((result* 31)+((this.labHrInd == null)? 0 :this.labHrInd.hashCode()));
        result = ((result* 31)+((this.othHrInd == null)? 0 :this.othHrInd.hashCode()));
        result = ((result* 31)+((this.billHrInd == null)? 0 :this.billHrInd.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.othHrHigh == null)? 0 :this.othHrHigh.hashCode()));
        result = ((result* 31)+((this.cipcCode == null)? 0 :this.cipcCode.hashCode()));
        result = ((result* 31)+((this.creditHrHigh == null)? 0 :this.creditHrHigh.hashCode()));
        result = ((result* 31)+((this.creditHrLow == null)? 0 :this.creditHrLow.hashCode()));
        result = ((result* 31)+((this.creditHrInd == null)? 0 :this.creditHrInd.hashCode()));
        result = ((result* 31)+((this.scbcrseContHrLow == null)? 0 :this.scbcrseContHrLow.hashCode()));
        result = ((result* 31)+((this.othHrLow == null)? 0 :this.othHrLow.hashCode()));
        result = ((result* 31)+((this.labHrHigh == null)? 0 :this.labHrHigh.hashCode()));
        result = ((result* 31)+((this.lecHrInd == null)? 0 :this.lecHrInd.hashCode()));
        result = ((result* 31)+((this.pwavCode == null)? 0 :this.pwavCode.hashCode()));
        result = ((result* 31)+((this.billHrHigh == null)? 0 :this.billHrHigh.hashCode()));
        result = ((result* 31)+((this.maxRptUnits == null)? 0 :this.maxRptUnits.hashCode()));
        result = ((result* 31)+((this.repsCode == null)? 0 :this.repsCode.hashCode()));
        result = ((result* 31)+((this.lecHrLow == null)? 0 :this.lecHrLow.hashCode()));
        result = ((result* 31)+((this.lecHrHigh == null)? 0 :this.lecHrHigh.hashCode()));
        result = ((result* 31)+((this.contHrHigh == null)? 0 :this.contHrHigh.hashCode()));
        result = ((result* 31)+((this.aprvCode == null)? 0 :this.aprvCode.hashCode()));
        result = ((result* 31)+((this.numberOfUnits == null)? 0 :this.numberOfUnits.hashCode()));
        result = ((result* 31)+((this.ceuInd == null)? 0 :this.ceuInd.hashCode()));
        result = ((result* 31)+((this.divsCode == null)? 0 :this.divsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.labHrLow == null)? 0 :this.labHrLow.hashCode()));
        result = ((result* 31)+((this.contHrLow == null)? 0 :this.contHrLow.hashCode()));
        result = ((result* 31)+((this.scacrseTermCodeEff == null)? 0 :this.scacrseTermCodeEff.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasicCourseInformations100PutRequest) == false) {
            return false;
        }
        BasicCourseInformations100PutRequest rhs = ((BasicCourseInformations100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((this.cstaCode == rhs.cstaCode)||((this.cstaCode!= null)&&this.cstaCode.equals(rhs.cstaCode)))&&((this.duntCode == rhs.duntCode)||((this.duntCode!= null)&&this.duntCode.equals(rhs.duntCode))))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.addFeesInd == rhs.addFeesInd)||((this.addFeesInd!= null)&&this.addFeesInd.equals(rhs.addFeesInd))))&&((this.billHrLow == rhs.billHrLow)||((this.billHrLow!= null)&&this.billHrLow.equals(rhs.billHrLow))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.contHrInd == rhs.contHrInd)||((this.contHrInd!= null)&&this.contHrInd.equals(rhs.contHrInd))))&&((this.repeatLimit == rhs.repeatLimit)||((this.repeatLimit!= null)&&this.repeatLimit.equals(rhs.repeatLimit))))&&((this.tuiwInd == rhs.tuiwInd)||((this.tuiwInd!= null)&&this.tuiwInd.equals(rhs.tuiwInd))))&&((this.labHrInd == rhs.labHrInd)||((this.labHrInd!= null)&&this.labHrInd.equals(rhs.labHrInd))))&&((this.othHrInd == rhs.othHrInd)||((this.othHrInd!= null)&&this.othHrInd.equals(rhs.othHrInd))))&&((this.billHrInd == rhs.billHrInd)||((this.billHrInd!= null)&&this.billHrInd.equals(rhs.billHrInd))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.othHrHigh == rhs.othHrHigh)||((this.othHrHigh!= null)&&this.othHrHigh.equals(rhs.othHrHigh))))&&((this.cipcCode == rhs.cipcCode)||((this.cipcCode!= null)&&this.cipcCode.equals(rhs.cipcCode))))&&((this.creditHrHigh == rhs.creditHrHigh)||((this.creditHrHigh!= null)&&this.creditHrHigh.equals(rhs.creditHrHigh))))&&((this.creditHrLow == rhs.creditHrLow)||((this.creditHrLow!= null)&&this.creditHrLow.equals(rhs.creditHrLow))))&&((this.creditHrInd == rhs.creditHrInd)||((this.creditHrInd!= null)&&this.creditHrInd.equals(rhs.creditHrInd))))&&((this.scbcrseContHrLow == rhs.scbcrseContHrLow)||((this.scbcrseContHrLow!= null)&&this.scbcrseContHrLow.equals(rhs.scbcrseContHrLow))))&&((this.othHrLow == rhs.othHrLow)||((this.othHrLow!= null)&&this.othHrLow.equals(rhs.othHrLow))))&&((this.labHrHigh == rhs.labHrHigh)||((this.labHrHigh!= null)&&this.labHrHigh.equals(rhs.labHrHigh))))&&((this.lecHrInd == rhs.lecHrInd)||((this.lecHrInd!= null)&&this.lecHrInd.equals(rhs.lecHrInd))))&&((this.pwavCode == rhs.pwavCode)||((this.pwavCode!= null)&&this.pwavCode.equals(rhs.pwavCode))))&&((this.billHrHigh == rhs.billHrHigh)||((this.billHrHigh!= null)&&this.billHrHigh.equals(rhs.billHrHigh))))&&((this.maxRptUnits == rhs.maxRptUnits)||((this.maxRptUnits!= null)&&this.maxRptUnits.equals(rhs.maxRptUnits))))&&((this.repsCode == rhs.repsCode)||((this.repsCode!= null)&&this.repsCode.equals(rhs.repsCode))))&&((this.lecHrLow == rhs.lecHrLow)||((this.lecHrLow!= null)&&this.lecHrLow.equals(rhs.lecHrLow))))&&((this.lecHrHigh == rhs.lecHrHigh)||((this.lecHrHigh!= null)&&this.lecHrHigh.equals(rhs.lecHrHigh))))&&((this.contHrHigh == rhs.contHrHigh)||((this.contHrHigh!= null)&&this.contHrHigh.equals(rhs.contHrHigh))))&&((this.aprvCode == rhs.aprvCode)||((this.aprvCode!= null)&&this.aprvCode.equals(rhs.aprvCode))))&&((this.numberOfUnits == rhs.numberOfUnits)||((this.numberOfUnits!= null)&&this.numberOfUnits.equals(rhs.numberOfUnits))))&&((this.ceuInd == rhs.ceuInd)||((this.ceuInd!= null)&&this.ceuInd.equals(rhs.ceuInd))))&&((this.divsCode == rhs.divsCode)||((this.divsCode!= null)&&this.divsCode.equals(rhs.divsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.labHrLow == rhs.labHrLow)||((this.labHrLow!= null)&&this.labHrLow.equals(rhs.labHrLow))))&&((this.contHrLow == rhs.contHrLow)||((this.contHrLow!= null)&&this.contHrLow.equals(rhs.contHrLow))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
