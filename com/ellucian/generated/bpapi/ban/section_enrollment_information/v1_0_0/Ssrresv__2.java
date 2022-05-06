
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
    "holdSsrresvEnrl",
    "primSecCde",
    "holdSsrresvWaitCapacity",
    "degcCode",
    "program",
    "termCodeMatric",
    "majrCode",
    "userId",
    "termCodeGrad",
    "holdSsrresvSeatsAvail",
    "holdSsrresvWaitCount",
    "lfstCode",
    "activityDate",
    "chrtCode",
    "attsCode",
    "campCode",
    "termCodeAdmit",
    "holdSsrresvWaitAvail",
    "clasCode",
    "holdSsrresvMaxEnrl",
    "collCode",
    "deptCode",
    "levlCode",
    "overflowInd"
})
@Generated("jsonschema2pojo")
public class Ssrresv__2 {

    /**
     * Reserved Actual
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvEnrl")
    private Double holdSsrresvEnrl;
    /**
     * Curricula
     * <p>
     * Lineage reference object : SSRRESV_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_PRIM_SEC_CDE")
    private String primSecCde;
    /**
     * Waitlist Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvWaitCapacity")
    private Double holdSsrresvWaitCapacity;
    /**
     * Degree
     * <p>
     * Lineage reference object : SSRRESV_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SSRRESV_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * Matriculation Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeMatric")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm")
    private String termCodeMatric;
    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SSRRESV_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_MAJR_CODE, Lookup lineage reference object : stvmajr")
    private String majrCode;
    /**
     * User ID
     * <p>
     * Lineage reference object : SSRRESV_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_USER_ID")
    private String userId;
    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_TERM_CODE_GRAD, Lookup lineage reference object : stvterm")
    private String termCodeGrad;
    /**
     * Reserved Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvSeatsAvail")
    private Double holdSsrresvSeatsAvail;
    /**
     * Waitlist Actual
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvWaitCount")
    private Double holdSsrresvWaitCount;
    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SSRRESV_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRRESV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SSRRESV_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Attribute
     * <p>
     * Lineage reference object : SSRRESV_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SSRRESV_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Admission Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm")
    private String termCodeAdmit;
    /**
     * Waitlist Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvWaitAvail")
    private Double holdSsrresvWaitAvail;
    /**
     * Class
     * <p>
     * Lineage reference object : SSRRESV_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_CLAS_CODE, Lookup lineage reference object : stvclas")
    private String clasCode;
    /**
     * Reserved Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvMaxEnrl")
    private Double holdSsrresvMaxEnrl;
    /**
     * College
     * <p>
     * Lineage reference object : SSRRESV_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SSRRESV_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SSRRESV_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Overflow
     * <p>
     * Lineage reference object : SSRRESV_OVERFLOW_IND
     * 
     */
    @JsonProperty("overflowInd")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_OVERFLOW_IND")
    private String overflowInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Reserved Actual
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvEnrl")
    public Double getHoldSsrresvEnrl() {
        return holdSsrresvEnrl;
    }

    /**
     * Reserved Actual
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvEnrl")
    public void setHoldSsrresvEnrl(Double holdSsrresvEnrl) {
        this.holdSsrresvEnrl = holdSsrresvEnrl;
    }

    public Ssrresv__2 withHoldSsrresvEnrl(Double holdSsrresvEnrl) {
        this.holdSsrresvEnrl = holdSsrresvEnrl;
        return this;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SSRRESV_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public String getPrimSecCde() {
        return primSecCde;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SSRRESV_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public void setPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
    }

    public Ssrresv__2 withPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
        return this;
    }

    /**
     * Waitlist Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvWaitCapacity")
    public Double getHoldSsrresvWaitCapacity() {
        return holdSsrresvWaitCapacity;
    }

    /**
     * Waitlist Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvWaitCapacity")
    public void setHoldSsrresvWaitCapacity(Double holdSsrresvWaitCapacity) {
        this.holdSsrresvWaitCapacity = holdSsrresvWaitCapacity;
    }

    public Ssrresv__2 withHoldSsrresvWaitCapacity(Double holdSsrresvWaitCapacity) {
        this.holdSsrresvWaitCapacity = holdSsrresvWaitCapacity;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SSRRESV_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SSRRESV_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public Ssrresv__2 withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRRESV_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRRESV_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public Ssrresv__2 withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Matriculation Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeMatric")
    public String getTermCodeMatric() {
        return termCodeMatric;
    }

    /**
     * Matriculation Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_MATRIC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeMatric")
    public void setTermCodeMatric(String termCodeMatric) {
        this.termCodeMatric = termCodeMatric;
    }

    public Ssrresv__2 withTermCodeMatric(String termCodeMatric) {
        this.termCodeMatric = termCodeMatric;
        return this;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SSRRESV_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SSRRESV_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public Ssrresv__2 withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SSRRESV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SSRRESV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ssrresv__2 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public String getTermCodeGrad() {
        return termCodeGrad;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public void setTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
    }

    public Ssrresv__2 withTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
        return this;
    }

    /**
     * Reserved Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvSeatsAvail")
    public Double getHoldSsrresvSeatsAvail() {
        return holdSsrresvSeatsAvail;
    }

    /**
     * Reserved Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvSeatsAvail")
    public void setHoldSsrresvSeatsAvail(Double holdSsrresvSeatsAvail) {
        this.holdSsrresvSeatsAvail = holdSsrresvSeatsAvail;
    }

    public Ssrresv__2 withHoldSsrresvSeatsAvail(Double holdSsrresvSeatsAvail) {
        this.holdSsrresvSeatsAvail = holdSsrresvSeatsAvail;
        return this;
    }

    /**
     * Waitlist Actual
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvWaitCount")
    public Double getHoldSsrresvWaitCount() {
        return holdSsrresvWaitCount;
    }

    /**
     * Waitlist Actual
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvWaitCount")
    public void setHoldSsrresvWaitCount(Double holdSsrresvWaitCount) {
        this.holdSsrresvWaitCount = holdSsrresvWaitCount;
    }

    public Ssrresv__2 withHoldSsrresvWaitCount(Double holdSsrresvWaitCount) {
        this.holdSsrresvWaitCount = holdSsrresvWaitCount;
        return this;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SSRRESV_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public String getLfstCode() {
        return lfstCode;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SSRRESV_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public void setLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
    }

    public Ssrresv__2 withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRRESV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRRESV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssrresv__2 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SSRRESV_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SSRRESV_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public Ssrresv__2 withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SSRRESV_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public String getAttsCode() {
        return attsCode;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SSRRESV_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public Ssrresv__2 withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSRRESV_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSRRESV_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public Ssrresv__2 withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public String getTermCodeAdmit() {
        return termCodeAdmit;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public void setTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
    }

    public Ssrresv__2 withTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
        return this;
    }

    /**
     * Waitlist Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvWaitAvail")
    public Double getHoldSsrresvWaitAvail() {
        return holdSsrresvWaitAvail;
    }

    /**
     * Waitlist Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSsrresvWaitAvail")
    public void setHoldSsrresvWaitAvail(Double holdSsrresvWaitAvail) {
        this.holdSsrresvWaitAvail = holdSsrresvWaitAvail;
    }

    public Ssrresv__2 withHoldSsrresvWaitAvail(Double holdSsrresvWaitAvail) {
        this.holdSsrresvWaitAvail = holdSsrresvWaitAvail;
        return this;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SSRRESV_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public String getClasCode() {
        return clasCode;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SSRRESV_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
    }

    public Ssrresv__2 withClasCode(String clasCode) {
        this.clasCode = clasCode;
        return this;
    }

    /**
     * Reserved Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvMaxEnrl")
    public Double getHoldSsrresvMaxEnrl() {
        return holdSsrresvMaxEnrl;
    }

    /**
     * Reserved Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvMaxEnrl")
    public void setHoldSsrresvMaxEnrl(Double holdSsrresvMaxEnrl) {
        this.holdSsrresvMaxEnrl = holdSsrresvMaxEnrl;
    }

    public Ssrresv__2 withHoldSsrresvMaxEnrl(Double holdSsrresvMaxEnrl) {
        this.holdSsrresvMaxEnrl = holdSsrresvMaxEnrl;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SSRRESV_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SSRRESV_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public Ssrresv__2 withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSRRESV_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSRRESV_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Ssrresv__2 withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRRESV_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SSRRESV_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public Ssrresv__2 withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Overflow
     * <p>
     * Lineage reference object : SSRRESV_OVERFLOW_IND
     * 
     */
    @JsonProperty("overflowInd")
    public String getOverflowInd() {
        return overflowInd;
    }

    /**
     * Overflow
     * <p>
     * Lineage reference object : SSRRESV_OVERFLOW_IND
     * 
     */
    @JsonProperty("overflowInd")
    public void setOverflowInd(String overflowInd) {
        this.overflowInd = overflowInd;
    }

    public Ssrresv__2 withOverflowInd(String overflowInd) {
        this.overflowInd = overflowInd;
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

    public Ssrresv__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrresv__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("holdSsrresvEnrl");
        sb.append('=');
        sb.append(((this.holdSsrresvEnrl == null)?"<null>":this.holdSsrresvEnrl));
        sb.append(',');
        sb.append("primSecCde");
        sb.append('=');
        sb.append(((this.primSecCde == null)?"<null>":this.primSecCde));
        sb.append(',');
        sb.append("holdSsrresvWaitCapacity");
        sb.append('=');
        sb.append(((this.holdSsrresvWaitCapacity == null)?"<null>":this.holdSsrresvWaitCapacity));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("termCodeMatric");
        sb.append('=');
        sb.append(((this.termCodeMatric == null)?"<null>":this.termCodeMatric));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("termCodeGrad");
        sb.append('=');
        sb.append(((this.termCodeGrad == null)?"<null>":this.termCodeGrad));
        sb.append(',');
        sb.append("holdSsrresvSeatsAvail");
        sb.append('=');
        sb.append(((this.holdSsrresvSeatsAvail == null)?"<null>":this.holdSsrresvSeatsAvail));
        sb.append(',');
        sb.append("holdSsrresvWaitCount");
        sb.append('=');
        sb.append(((this.holdSsrresvWaitCount == null)?"<null>":this.holdSsrresvWaitCount));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("termCodeAdmit");
        sb.append('=');
        sb.append(((this.termCodeAdmit == null)?"<null>":this.termCodeAdmit));
        sb.append(',');
        sb.append("holdSsrresvWaitAvail");
        sb.append('=');
        sb.append(((this.holdSsrresvWaitAvail == null)?"<null>":this.holdSsrresvWaitAvail));
        sb.append(',');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("holdSsrresvMaxEnrl");
        sb.append('=');
        sb.append(((this.holdSsrresvMaxEnrl == null)?"<null>":this.holdSsrresvMaxEnrl));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("overflowInd");
        sb.append('=');
        sb.append(((this.overflowInd == null)?"<null>":this.overflowInd));
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
        result = ((result* 31)+((this.primSecCde == null)? 0 :this.primSecCde.hashCode()));
        result = ((result* 31)+((this.holdSsrresvWaitCapacity == null)? 0 :this.holdSsrresvWaitCapacity.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.termCodeMatric == null)? 0 :this.termCodeMatric.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.termCodeGrad == null)? 0 :this.termCodeGrad.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.holdSsrresvMaxEnrl == null)? 0 :this.holdSsrresvMaxEnrl.hashCode()));
        result = ((result* 31)+((this.overflowInd == null)? 0 :this.overflowInd.hashCode()));
        result = ((result* 31)+((this.holdSsrresvEnrl == null)? 0 :this.holdSsrresvEnrl.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.holdSsrresvSeatsAvail == null)? 0 :this.holdSsrresvSeatsAvail.hashCode()));
        result = ((result* 31)+((this.holdSsrresvWaitCount == null)? 0 :this.holdSsrresvWaitCount.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.termCodeAdmit == null)? 0 :this.termCodeAdmit.hashCode()));
        result = ((result* 31)+((this.holdSsrresvWaitAvail == null)? 0 :this.holdSsrresvWaitAvail.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrresv__2) == false) {
            return false;
        }
        Ssrresv__2 rhs = ((Ssrresv__2) other);
        return ((((((((((((((((((((((((((this.primSecCde == rhs.primSecCde)||((this.primSecCde!= null)&&this.primSecCde.equals(rhs.primSecCde)))&&((this.holdSsrresvWaitCapacity == rhs.holdSsrresvWaitCapacity)||((this.holdSsrresvWaitCapacity!= null)&&this.holdSsrresvWaitCapacity.equals(rhs.holdSsrresvWaitCapacity))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.termCodeMatric == rhs.termCodeMatric)||((this.termCodeMatric!= null)&&this.termCodeMatric.equals(rhs.termCodeMatric))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.termCodeGrad == rhs.termCodeGrad)||((this.termCodeGrad!= null)&&this.termCodeGrad.equals(rhs.termCodeGrad))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode))))&&((this.holdSsrresvMaxEnrl == rhs.holdSsrresvMaxEnrl)||((this.holdSsrresvMaxEnrl!= null)&&this.holdSsrresvMaxEnrl.equals(rhs.holdSsrresvMaxEnrl))))&&((this.overflowInd == rhs.overflowInd)||((this.overflowInd!= null)&&this.overflowInd.equals(rhs.overflowInd))))&&((this.holdSsrresvEnrl == rhs.holdSsrresvEnrl)||((this.holdSsrresvEnrl!= null)&&this.holdSsrresvEnrl.equals(rhs.holdSsrresvEnrl))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.holdSsrresvSeatsAvail == rhs.holdSsrresvSeatsAvail)||((this.holdSsrresvSeatsAvail!= null)&&this.holdSsrresvSeatsAvail.equals(rhs.holdSsrresvSeatsAvail))))&&((this.holdSsrresvWaitCount == rhs.holdSsrresvWaitCount)||((this.holdSsrresvWaitCount!= null)&&this.holdSsrresvWaitCount.equals(rhs.holdSsrresvWaitCount))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.termCodeAdmit == rhs.termCodeAdmit)||((this.termCodeAdmit!= null)&&this.termCodeAdmit.equals(rhs.termCodeAdmit))))&&((this.holdSsrresvWaitAvail == rhs.holdSsrresvWaitAvail)||((this.holdSsrresvWaitAvail!= null)&&this.holdSsrresvWaitAvail.equals(rhs.holdSsrresvWaitAvail))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
