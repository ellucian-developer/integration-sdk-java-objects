
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
    "addFeesInd",
    "billHrLow",
    "contHrInd",
    "repeatLimit",
    "tuiwInd",
    "labHrInd",
    "departmentDescription",
    "othHrInd",
    "billHrInd",
    "aprvDescription",
    "title",
    "othHrHigh",
    "cipcCode",
    "prereqChkMethodCde",
    "syllabusInd",
    "cipcDescription",
    "longTitleInd",
    "creditHrHigh",
    "creditHrLow",
    "duntDescription",
    "creditHrInd",
    "pwavDescription",
    "divisionDescription",
    "othHrLow",
    "labHrHigh",
    "lecHrInd",
    "billHrHigh",
    "pwavCode",
    "maxRptUnits",
    "repsCode",
    "lecHrLow",
    "contHrHigh",
    "lecHrHigh",
    "statusDescription",
    "aprvCode",
    "numberOfUnits",
    "ceuInd",
    "divsCode",
    "collegeDescription",
    "collCode",
    "contHrLow",
    "labHrLow",
    "deptCode"
})
@Generated("jsonschema2pojo")
public class BasicCourseInformations100GetResponse {

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
    @JsonProperty("departmentDescription")
    private String departmentDescription;
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
    @JsonProperty("aprvDescription")
    private String aprvDescription;
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
     * Lineage reference object : SCBCRSE_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_PREREQ_CHK_METHOD_CDE")
    private String prereqChkMethodCde;
    /**
     * Syllabus Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("syllabusInd")
    private String syllabusInd;
    @JsonProperty("cipcDescription")
    private String cipcDescription;
    /**
     * Long Title Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("longTitleInd")
    private String longTitleInd;
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
    @JsonProperty("duntDescription")
    private String duntDescription;
    /**
     * CEU or Credit None/Or/To
     * <p>
     * Lineage reference object : SCBCRSE_CREDIT_HR_IND
     * 
     */
    @JsonProperty("creditHrInd")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CREDIT_HR_IND")
    private String creditHrInd;
    @JsonProperty("pwavDescription")
    private String pwavDescription;
    @JsonProperty("divisionDescription")
    private String divisionDescription;
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
     * Billing * High
     * <p>
     * Lineage reference object : SCBCRSE_BILL_HR_HIGH
     * 
     */
    @JsonProperty("billHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_BILL_HR_HIGH")
    private Double billHrHigh;
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
     * Contact High
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_HIGH
     * 
     */
    @JsonProperty("contHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CONT_HR_HIGH")
    private Double contHrHigh;
    /**
     * Lecture High
     * <p>
     * Lineage reference object : SCBCRSE_LEC_HR_HIGH
     * 
     */
    @JsonProperty("lecHrHigh")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_LEC_HR_HIGH")
    private Double lecHrHigh;
    @JsonProperty("statusDescription")
    private String statusDescription;
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
    @JsonProperty("collegeDescription")
    private String collegeDescription;
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
     * Contact Low
     * <p>
     * Lineage reference object : SCBCRSE_CONT_HR_LOW
     * 
     */
    @JsonProperty("contHrLow")
    @JsonPropertyDescription("Lineage reference object : SCBCRSE_CONT_HR_LOW")
    private Double contHrLow;
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

    public BasicCourseInformations100GetResponse withCstaCode(String cstaCode) {
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

    public BasicCourseInformations100GetResponse withDuntCode(String duntCode) {
        this.duntCode = duntCode;
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

    public BasicCourseInformations100GetResponse withAddFeesInd(String addFeesInd) {
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

    public BasicCourseInformations100GetResponse withBillHrLow(Double billHrLow) {
        this.billHrLow = billHrLow;
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

    public BasicCourseInformations100GetResponse withContHrInd(String contHrInd) {
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

    public BasicCourseInformations100GetResponse withRepeatLimit(Double repeatLimit) {
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

    public BasicCourseInformations100GetResponse withTuiwInd(String tuiwInd) {
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

    public BasicCourseInformations100GetResponse withLabHrInd(String labHrInd) {
        this.labHrInd = labHrInd;
        return this;
    }

    @JsonProperty("departmentDescription")
    public String getDepartmentDescription() {
        return departmentDescription;
    }

    @JsonProperty("departmentDescription")
    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public BasicCourseInformations100GetResponse withDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
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

    public BasicCourseInformations100GetResponse withOthHrInd(String othHrInd) {
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

    public BasicCourseInformations100GetResponse withBillHrInd(String billHrInd) {
        this.billHrInd = billHrInd;
        return this;
    }

    @JsonProperty("aprvDescription")
    public String getAprvDescription() {
        return aprvDescription;
    }

    @JsonProperty("aprvDescription")
    public void setAprvDescription(String aprvDescription) {
        this.aprvDescription = aprvDescription;
    }

    public BasicCourseInformations100GetResponse withAprvDescription(String aprvDescription) {
        this.aprvDescription = aprvDescription;
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

    public BasicCourseInformations100GetResponse withTitle(String title) {
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

    public BasicCourseInformations100GetResponse withOthHrHigh(Double othHrHigh) {
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

    public BasicCourseInformations100GetResponse withCipcCode(String cipcCode) {
        this.cipcCode = cipcCode;
        return this;
    }

    /**
     * Lineage reference object : SCBCRSE_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public String getPrereqChkMethodCde() {
        return prereqChkMethodCde;
    }

    /**
     * Lineage reference object : SCBCRSE_PREREQ_CHK_METHOD_CDE
     * 
     */
    @JsonProperty("prereqChkMethodCde")
    public void setPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
    }

    public BasicCourseInformations100GetResponse withPrereqChkMethodCde(String prereqChkMethodCde) {
        this.prereqChkMethodCde = prereqChkMethodCde;
        return this;
    }

    /**
     * Syllabus Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("syllabusInd")
    public String getSyllabusInd() {
        return syllabusInd;
    }

    /**
     * Syllabus Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("syllabusInd")
    public void setSyllabusInd(String syllabusInd) {
        this.syllabusInd = syllabusInd;
    }

    public BasicCourseInformations100GetResponse withSyllabusInd(String syllabusInd) {
        this.syllabusInd = syllabusInd;
        return this;
    }

    @JsonProperty("cipcDescription")
    public String getCipcDescription() {
        return cipcDescription;
    }

    @JsonProperty("cipcDescription")
    public void setCipcDescription(String cipcDescription) {
        this.cipcDescription = cipcDescription;
    }

    public BasicCourseInformations100GetResponse withCipcDescription(String cipcDescription) {
        this.cipcDescription = cipcDescription;
        return this;
    }

    /**
     * Long Title Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("longTitleInd")
    public String getLongTitleInd() {
        return longTitleInd;
    }

    /**
     * Long Title Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("longTitleInd")
    public void setLongTitleInd(String longTitleInd) {
        this.longTitleInd = longTitleInd;
    }

    public BasicCourseInformations100GetResponse withLongTitleInd(String longTitleInd) {
        this.longTitleInd = longTitleInd;
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

    public BasicCourseInformations100GetResponse withCreditHrHigh(Double creditHrHigh) {
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

    public BasicCourseInformations100GetResponse withCreditHrLow(Double creditHrLow) {
        this.creditHrLow = creditHrLow;
        return this;
    }

    @JsonProperty("duntDescription")
    public String getDuntDescription() {
        return duntDescription;
    }

    @JsonProperty("duntDescription")
    public void setDuntDescription(String duntDescription) {
        this.duntDescription = duntDescription;
    }

    public BasicCourseInformations100GetResponse withDuntDescription(String duntDescription) {
        this.duntDescription = duntDescription;
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

    public BasicCourseInformations100GetResponse withCreditHrInd(String creditHrInd) {
        this.creditHrInd = creditHrInd;
        return this;
    }

    @JsonProperty("pwavDescription")
    public String getPwavDescription() {
        return pwavDescription;
    }

    @JsonProperty("pwavDescription")
    public void setPwavDescription(String pwavDescription) {
        this.pwavDescription = pwavDescription;
    }

    public BasicCourseInformations100GetResponse withPwavDescription(String pwavDescription) {
        this.pwavDescription = pwavDescription;
        return this;
    }

    @JsonProperty("divisionDescription")
    public String getDivisionDescription() {
        return divisionDescription;
    }

    @JsonProperty("divisionDescription")
    public void setDivisionDescription(String divisionDescription) {
        this.divisionDescription = divisionDescription;
    }

    public BasicCourseInformations100GetResponse withDivisionDescription(String divisionDescription) {
        this.divisionDescription = divisionDescription;
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

    public BasicCourseInformations100GetResponse withOthHrLow(Double othHrLow) {
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

    public BasicCourseInformations100GetResponse withLabHrHigh(Double labHrHigh) {
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

    public BasicCourseInformations100GetResponse withLecHrInd(String lecHrInd) {
        this.lecHrInd = lecHrInd;
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

    public BasicCourseInformations100GetResponse withBillHrHigh(Double billHrHigh) {
        this.billHrHigh = billHrHigh;
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

    public BasicCourseInformations100GetResponse withPwavCode(String pwavCode) {
        this.pwavCode = pwavCode;
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

    public BasicCourseInformations100GetResponse withMaxRptUnits(Double maxRptUnits) {
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

    public BasicCourseInformations100GetResponse withRepsCode(String repsCode) {
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

    public BasicCourseInformations100GetResponse withLecHrLow(Double lecHrLow) {
        this.lecHrLow = lecHrLow;
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

    public BasicCourseInformations100GetResponse withContHrHigh(Double contHrHigh) {
        this.contHrHigh = contHrHigh;
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

    public BasicCourseInformations100GetResponse withLecHrHigh(Double lecHrHigh) {
        this.lecHrHigh = lecHrHigh;
        return this;
    }

    @JsonProperty("statusDescription")
    public String getStatusDescription() {
        return statusDescription;
    }

    @JsonProperty("statusDescription")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public BasicCourseInformations100GetResponse withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
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

    public BasicCourseInformations100GetResponse withAprvCode(String aprvCode) {
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

    public BasicCourseInformations100GetResponse withNumberOfUnits(Double numberOfUnits) {
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

    public BasicCourseInformations100GetResponse withCeuInd(String ceuInd) {
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

    public BasicCourseInformations100GetResponse withDivsCode(String divsCode) {
        this.divsCode = divsCode;
        return this;
    }

    @JsonProperty("collegeDescription")
    public String getCollegeDescription() {
        return collegeDescription;
    }

    @JsonProperty("collegeDescription")
    public void setCollegeDescription(String collegeDescription) {
        this.collegeDescription = collegeDescription;
    }

    public BasicCourseInformations100GetResponse withCollegeDescription(String collegeDescription) {
        this.collegeDescription = collegeDescription;
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

    public BasicCourseInformations100GetResponse withCollCode(String collCode) {
        this.collCode = collCode;
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

    public BasicCourseInformations100GetResponse withContHrLow(Double contHrLow) {
        this.contHrLow = contHrLow;
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

    public BasicCourseInformations100GetResponse withLabHrLow(Double labHrLow) {
        this.labHrLow = labHrLow;
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

    public BasicCourseInformations100GetResponse withDeptCode(String deptCode) {
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

    public BasicCourseInformations100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BasicCourseInformations100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cstaCode");
        sb.append('=');
        sb.append(((this.cstaCode == null)?"<null>":this.cstaCode));
        sb.append(',');
        sb.append("duntCode");
        sb.append('=');
        sb.append(((this.duntCode == null)?"<null>":this.duntCode));
        sb.append(',');
        sb.append("addFeesInd");
        sb.append('=');
        sb.append(((this.addFeesInd == null)?"<null>":this.addFeesInd));
        sb.append(',');
        sb.append("billHrLow");
        sb.append('=');
        sb.append(((this.billHrLow == null)?"<null>":this.billHrLow));
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
        sb.append("departmentDescription");
        sb.append('=');
        sb.append(((this.departmentDescription == null)?"<null>":this.departmentDescription));
        sb.append(',');
        sb.append("othHrInd");
        sb.append('=');
        sb.append(((this.othHrInd == null)?"<null>":this.othHrInd));
        sb.append(',');
        sb.append("billHrInd");
        sb.append('=');
        sb.append(((this.billHrInd == null)?"<null>":this.billHrInd));
        sb.append(',');
        sb.append("aprvDescription");
        sb.append('=');
        sb.append(((this.aprvDescription == null)?"<null>":this.aprvDescription));
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
        sb.append("prereqChkMethodCde");
        sb.append('=');
        sb.append(((this.prereqChkMethodCde == null)?"<null>":this.prereqChkMethodCde));
        sb.append(',');
        sb.append("syllabusInd");
        sb.append('=');
        sb.append(((this.syllabusInd == null)?"<null>":this.syllabusInd));
        sb.append(',');
        sb.append("cipcDescription");
        sb.append('=');
        sb.append(((this.cipcDescription == null)?"<null>":this.cipcDescription));
        sb.append(',');
        sb.append("longTitleInd");
        sb.append('=');
        sb.append(((this.longTitleInd == null)?"<null>":this.longTitleInd));
        sb.append(',');
        sb.append("creditHrHigh");
        sb.append('=');
        sb.append(((this.creditHrHigh == null)?"<null>":this.creditHrHigh));
        sb.append(',');
        sb.append("creditHrLow");
        sb.append('=');
        sb.append(((this.creditHrLow == null)?"<null>":this.creditHrLow));
        sb.append(',');
        sb.append("duntDescription");
        sb.append('=');
        sb.append(((this.duntDescription == null)?"<null>":this.duntDescription));
        sb.append(',');
        sb.append("creditHrInd");
        sb.append('=');
        sb.append(((this.creditHrInd == null)?"<null>":this.creditHrInd));
        sb.append(',');
        sb.append("pwavDescription");
        sb.append('=');
        sb.append(((this.pwavDescription == null)?"<null>":this.pwavDescription));
        sb.append(',');
        sb.append("divisionDescription");
        sb.append('=');
        sb.append(((this.divisionDescription == null)?"<null>":this.divisionDescription));
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
        sb.append("billHrHigh");
        sb.append('=');
        sb.append(((this.billHrHigh == null)?"<null>":this.billHrHigh));
        sb.append(',');
        sb.append("pwavCode");
        sb.append('=');
        sb.append(((this.pwavCode == null)?"<null>":this.pwavCode));
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
        sb.append("contHrHigh");
        sb.append('=');
        sb.append(((this.contHrHigh == null)?"<null>":this.contHrHigh));
        sb.append(',');
        sb.append("lecHrHigh");
        sb.append('=');
        sb.append(((this.lecHrHigh == null)?"<null>":this.lecHrHigh));
        sb.append(',');
        sb.append("statusDescription");
        sb.append('=');
        sb.append(((this.statusDescription == null)?"<null>":this.statusDescription));
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
        sb.append("collegeDescription");
        sb.append('=');
        sb.append(((this.collegeDescription == null)?"<null>":this.collegeDescription));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("contHrLow");
        sb.append('=');
        sb.append(((this.contHrLow == null)?"<null>":this.contHrLow));
        sb.append(',');
        sb.append("labHrLow");
        sb.append('=');
        sb.append(((this.labHrLow == null)?"<null>":this.labHrLow));
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
        result = ((result* 31)+((this.addFeesInd == null)? 0 :this.addFeesInd.hashCode()));
        result = ((result* 31)+((this.billHrLow == null)? 0 :this.billHrLow.hashCode()));
        result = ((result* 31)+((this.contHrInd == null)? 0 :this.contHrInd.hashCode()));
        result = ((result* 31)+((this.repeatLimit == null)? 0 :this.repeatLimit.hashCode()));
        result = ((result* 31)+((this.tuiwInd == null)? 0 :this.tuiwInd.hashCode()));
        result = ((result* 31)+((this.labHrInd == null)? 0 :this.labHrInd.hashCode()));
        result = ((result* 31)+((this.departmentDescription == null)? 0 :this.departmentDescription.hashCode()));
        result = ((result* 31)+((this.othHrInd == null)? 0 :this.othHrInd.hashCode()));
        result = ((result* 31)+((this.billHrInd == null)? 0 :this.billHrInd.hashCode()));
        result = ((result* 31)+((this.aprvDescription == null)? 0 :this.aprvDescription.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.othHrHigh == null)? 0 :this.othHrHigh.hashCode()));
        result = ((result* 31)+((this.cipcCode == null)? 0 :this.cipcCode.hashCode()));
        result = ((result* 31)+((this.prereqChkMethodCde == null)? 0 :this.prereqChkMethodCde.hashCode()));
        result = ((result* 31)+((this.syllabusInd == null)? 0 :this.syllabusInd.hashCode()));
        result = ((result* 31)+((this.cipcDescription == null)? 0 :this.cipcDescription.hashCode()));
        result = ((result* 31)+((this.longTitleInd == null)? 0 :this.longTitleInd.hashCode()));
        result = ((result* 31)+((this.creditHrHigh == null)? 0 :this.creditHrHigh.hashCode()));
        result = ((result* 31)+((this.creditHrLow == null)? 0 :this.creditHrLow.hashCode()));
        result = ((result* 31)+((this.duntDescription == null)? 0 :this.duntDescription.hashCode()));
        result = ((result* 31)+((this.creditHrInd == null)? 0 :this.creditHrInd.hashCode()));
        result = ((result* 31)+((this.pwavDescription == null)? 0 :this.pwavDescription.hashCode()));
        result = ((result* 31)+((this.divisionDescription == null)? 0 :this.divisionDescription.hashCode()));
        result = ((result* 31)+((this.othHrLow == null)? 0 :this.othHrLow.hashCode()));
        result = ((result* 31)+((this.labHrHigh == null)? 0 :this.labHrHigh.hashCode()));
        result = ((result* 31)+((this.lecHrInd == null)? 0 :this.lecHrInd.hashCode()));
        result = ((result* 31)+((this.billHrHigh == null)? 0 :this.billHrHigh.hashCode()));
        result = ((result* 31)+((this.pwavCode == null)? 0 :this.pwavCode.hashCode()));
        result = ((result* 31)+((this.maxRptUnits == null)? 0 :this.maxRptUnits.hashCode()));
        result = ((result* 31)+((this.repsCode == null)? 0 :this.repsCode.hashCode()));
        result = ((result* 31)+((this.lecHrLow == null)? 0 :this.lecHrLow.hashCode()));
        result = ((result* 31)+((this.contHrHigh == null)? 0 :this.contHrHigh.hashCode()));
        result = ((result* 31)+((this.lecHrHigh == null)? 0 :this.lecHrHigh.hashCode()));
        result = ((result* 31)+((this.statusDescription == null)? 0 :this.statusDescription.hashCode()));
        result = ((result* 31)+((this.aprvCode == null)? 0 :this.aprvCode.hashCode()));
        result = ((result* 31)+((this.numberOfUnits == null)? 0 :this.numberOfUnits.hashCode()));
        result = ((result* 31)+((this.ceuInd == null)? 0 :this.ceuInd.hashCode()));
        result = ((result* 31)+((this.divsCode == null)? 0 :this.divsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collegeDescription == null)? 0 :this.collegeDescription.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.contHrLow == null)? 0 :this.contHrLow.hashCode()));
        result = ((result* 31)+((this.labHrLow == null)? 0 :this.labHrLow.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasicCourseInformations100GetResponse) == false) {
            return false;
        }
        BasicCourseInformations100GetResponse rhs = ((BasicCourseInformations100GetResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((this.cstaCode == rhs.cstaCode)||((this.cstaCode!= null)&&this.cstaCode.equals(rhs.cstaCode)))&&((this.duntCode == rhs.duntCode)||((this.duntCode!= null)&&this.duntCode.equals(rhs.duntCode))))&&((this.addFeesInd == rhs.addFeesInd)||((this.addFeesInd!= null)&&this.addFeesInd.equals(rhs.addFeesInd))))&&((this.billHrLow == rhs.billHrLow)||((this.billHrLow!= null)&&this.billHrLow.equals(rhs.billHrLow))))&&((this.contHrInd == rhs.contHrInd)||((this.contHrInd!= null)&&this.contHrInd.equals(rhs.contHrInd))))&&((this.repeatLimit == rhs.repeatLimit)||((this.repeatLimit!= null)&&this.repeatLimit.equals(rhs.repeatLimit))))&&((this.tuiwInd == rhs.tuiwInd)||((this.tuiwInd!= null)&&this.tuiwInd.equals(rhs.tuiwInd))))&&((this.labHrInd == rhs.labHrInd)||((this.labHrInd!= null)&&this.labHrInd.equals(rhs.labHrInd))))&&((this.departmentDescription == rhs.departmentDescription)||((this.departmentDescription!= null)&&this.departmentDescription.equals(rhs.departmentDescription))))&&((this.othHrInd == rhs.othHrInd)||((this.othHrInd!= null)&&this.othHrInd.equals(rhs.othHrInd))))&&((this.billHrInd == rhs.billHrInd)||((this.billHrInd!= null)&&this.billHrInd.equals(rhs.billHrInd))))&&((this.aprvDescription == rhs.aprvDescription)||((this.aprvDescription!= null)&&this.aprvDescription.equals(rhs.aprvDescription))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.othHrHigh == rhs.othHrHigh)||((this.othHrHigh!= null)&&this.othHrHigh.equals(rhs.othHrHigh))))&&((this.cipcCode == rhs.cipcCode)||((this.cipcCode!= null)&&this.cipcCode.equals(rhs.cipcCode))))&&((this.prereqChkMethodCde == rhs.prereqChkMethodCde)||((this.prereqChkMethodCde!= null)&&this.prereqChkMethodCde.equals(rhs.prereqChkMethodCde))))&&((this.syllabusInd == rhs.syllabusInd)||((this.syllabusInd!= null)&&this.syllabusInd.equals(rhs.syllabusInd))))&&((this.cipcDescription == rhs.cipcDescription)||((this.cipcDescription!= null)&&this.cipcDescription.equals(rhs.cipcDescription))))&&((this.longTitleInd == rhs.longTitleInd)||((this.longTitleInd!= null)&&this.longTitleInd.equals(rhs.longTitleInd))))&&((this.creditHrHigh == rhs.creditHrHigh)||((this.creditHrHigh!= null)&&this.creditHrHigh.equals(rhs.creditHrHigh))))&&((this.creditHrLow == rhs.creditHrLow)||((this.creditHrLow!= null)&&this.creditHrLow.equals(rhs.creditHrLow))))&&((this.duntDescription == rhs.duntDescription)||((this.duntDescription!= null)&&this.duntDescription.equals(rhs.duntDescription))))&&((this.creditHrInd == rhs.creditHrInd)||((this.creditHrInd!= null)&&this.creditHrInd.equals(rhs.creditHrInd))))&&((this.pwavDescription == rhs.pwavDescription)||((this.pwavDescription!= null)&&this.pwavDescription.equals(rhs.pwavDescription))))&&((this.divisionDescription == rhs.divisionDescription)||((this.divisionDescription!= null)&&this.divisionDescription.equals(rhs.divisionDescription))))&&((this.othHrLow == rhs.othHrLow)||((this.othHrLow!= null)&&this.othHrLow.equals(rhs.othHrLow))))&&((this.labHrHigh == rhs.labHrHigh)||((this.labHrHigh!= null)&&this.labHrHigh.equals(rhs.labHrHigh))))&&((this.lecHrInd == rhs.lecHrInd)||((this.lecHrInd!= null)&&this.lecHrInd.equals(rhs.lecHrInd))))&&((this.billHrHigh == rhs.billHrHigh)||((this.billHrHigh!= null)&&this.billHrHigh.equals(rhs.billHrHigh))))&&((this.pwavCode == rhs.pwavCode)||((this.pwavCode!= null)&&this.pwavCode.equals(rhs.pwavCode))))&&((this.maxRptUnits == rhs.maxRptUnits)||((this.maxRptUnits!= null)&&this.maxRptUnits.equals(rhs.maxRptUnits))))&&((this.repsCode == rhs.repsCode)||((this.repsCode!= null)&&this.repsCode.equals(rhs.repsCode))))&&((this.lecHrLow == rhs.lecHrLow)||((this.lecHrLow!= null)&&this.lecHrLow.equals(rhs.lecHrLow))))&&((this.contHrHigh == rhs.contHrHigh)||((this.contHrHigh!= null)&&this.contHrHigh.equals(rhs.contHrHigh))))&&((this.lecHrHigh == rhs.lecHrHigh)||((this.lecHrHigh!= null)&&this.lecHrHigh.equals(rhs.lecHrHigh))))&&((this.statusDescription == rhs.statusDescription)||((this.statusDescription!= null)&&this.statusDescription.equals(rhs.statusDescription))))&&((this.aprvCode == rhs.aprvCode)||((this.aprvCode!= null)&&this.aprvCode.equals(rhs.aprvCode))))&&((this.numberOfUnits == rhs.numberOfUnits)||((this.numberOfUnits!= null)&&this.numberOfUnits.equals(rhs.numberOfUnits))))&&((this.ceuInd == rhs.ceuInd)||((this.ceuInd!= null)&&this.ceuInd.equals(rhs.ceuInd))))&&((this.divsCode == rhs.divsCode)||((this.divsCode!= null)&&this.divsCode.equals(rhs.divsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collegeDescription == rhs.collegeDescription)||((this.collegeDescription!= null)&&this.collegeDescription.equals(rhs.collegeDescription))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.contHrLow == rhs.contHrLow)||((this.contHrLow!= null)&&this.contHrLow.equals(rhs.contHrLow))))&&((this.labHrLow == rhs.labHrLow)||((this.labHrLow!= null)&&this.labHrLow.equals(rhs.labHrLow))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
