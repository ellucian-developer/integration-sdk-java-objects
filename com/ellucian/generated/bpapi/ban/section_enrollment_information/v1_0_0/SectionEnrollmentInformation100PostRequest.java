
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
    "primSecCde",
    "holdSsrresvWaitCapacity",
    "projEnrl",
    "census2Date",
    "degcCode",
    "program",
    "termCodeMatric",
    "majrCode",
    "termCodeGrad",
    "lfstCode",
    "chrtCode",
    "campCode",
    "clasCode",
    "censusEnrlDate",
    "holdSsrresvMaxEnrl",
    "crn",
    "overflowInd",
    "waitCapacity",
    "maxEnrl",
    "attsCode",
    "termCodeAdmit",
    "collCode",
    "levlCode",
    "deptCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class SectionEnrollmentInformation100PostRequest {

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
     * Projected
     * <p>
     * Lineage reference object : SSBSECT_PROJ_ENRL
     * (Required)
     * 
     */
    @JsonProperty("projEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PROJ_ENRL")
    private Double projEnrl;
    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_2_DATE")
    private Date census2Date;
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
     * Graduation Term
     * <p>
     * Lineage reference object : SSRRESV_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_TERM_CODE_GRAD, Lookup lineage reference object : stvterm")
    private String termCodeGrad;
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
     * Cohort
     * <p>
     * Lineage reference object : SSRRESV_CHRT_CODE, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
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
     * Class
     * <p>
     * Lineage reference object : SSRRESV_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_CLAS_CODE, Lookup lineage reference object : stvclas")
    private String clasCode;
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
     * Reserved Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvMaxEnrl")
    private Double holdSsrresvMaxEnrl;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private String crn;
    /**
     * Overflow
     * <p>
     * Lineage reference object : SSRRESV_OVERFLOW_IND
     * 
     */
    @JsonProperty("overflowInd")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_OVERFLOW_IND")
    private String overflowInd;
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
     * Attribute
     * <p>
     * Lineage reference object : SSRRESV_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
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
     * College
     * <p>
     * Lineage reference object : SSRRESV_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
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
     * Department
     * <p>
     * Lineage reference object : SSRRESV_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SSRRESV_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public SectionEnrollmentInformation100PostRequest withPrimSecCde(String primSecCde) {
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

    public SectionEnrollmentInformation100PostRequest withHoldSsrresvWaitCapacity(Double holdSsrresvWaitCapacity) {
        this.holdSsrresvWaitCapacity = holdSsrresvWaitCapacity;
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

    public SectionEnrollmentInformation100PostRequest withProjEnrl(Double projEnrl) {
        this.projEnrl = projEnrl;
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

    public SectionEnrollmentInformation100PostRequest withCensus2Date(Date census2Date) {
        this.census2Date = census2Date;
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

    public SectionEnrollmentInformation100PostRequest withDegcCode(String degcCode) {
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

    public SectionEnrollmentInformation100PostRequest withProgram(String program) {
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

    public SectionEnrollmentInformation100PostRequest withTermCodeMatric(String termCodeMatric) {
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

    public SectionEnrollmentInformation100PostRequest withMajrCode(String majrCode) {
        this.majrCode = majrCode;
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

    public SectionEnrollmentInformation100PostRequest withTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
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

    public SectionEnrollmentInformation100PostRequest withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
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

    public SectionEnrollmentInformation100PostRequest withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
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

    public SectionEnrollmentInformation100PostRequest withCampCode(String campCode) {
        this.campCode = campCode;
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

    public SectionEnrollmentInformation100PostRequest withClasCode(String clasCode) {
        this.clasCode = clasCode;
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

    public SectionEnrollmentInformation100PostRequest withCensusEnrlDate(Date censusEnrlDate) {
        this.censusEnrlDate = censusEnrlDate;
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

    public SectionEnrollmentInformation100PostRequest withHoldSsrresvMaxEnrl(Double holdSsrresvMaxEnrl) {
        this.holdSsrresvMaxEnrl = holdSsrresvMaxEnrl;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public SectionEnrollmentInformation100PostRequest withCrn(String crn) {
        this.crn = crn;
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

    public SectionEnrollmentInformation100PostRequest withOverflowInd(String overflowInd) {
        this.overflowInd = overflowInd;
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

    public SectionEnrollmentInformation100PostRequest withWaitCapacity(Double waitCapacity) {
        this.waitCapacity = waitCapacity;
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

    public SectionEnrollmentInformation100PostRequest withMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
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

    public SectionEnrollmentInformation100PostRequest withAttsCode(String attsCode) {
        this.attsCode = attsCode;
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

    public SectionEnrollmentInformation100PostRequest withTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
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

    public SectionEnrollmentInformation100PostRequest withCollCode(String collCode) {
        this.collCode = collCode;
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

    public SectionEnrollmentInformation100PostRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public SectionEnrollmentInformation100PostRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public SectionEnrollmentInformation100PostRequest withTermCode(String termCode) {
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

    public SectionEnrollmentInformation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionEnrollmentInformation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primSecCde");
        sb.append('=');
        sb.append(((this.primSecCde == null)?"<null>":this.primSecCde));
        sb.append(',');
        sb.append("holdSsrresvWaitCapacity");
        sb.append('=');
        sb.append(((this.holdSsrresvWaitCapacity == null)?"<null>":this.holdSsrresvWaitCapacity));
        sb.append(',');
        sb.append("projEnrl");
        sb.append('=');
        sb.append(((this.projEnrl == null)?"<null>":this.projEnrl));
        sb.append(',');
        sb.append("census2Date");
        sb.append('=');
        sb.append(((this.census2Date == null)?"<null>":this.census2Date));
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
        sb.append("termCodeGrad");
        sb.append('=');
        sb.append(((this.termCodeGrad == null)?"<null>":this.termCodeGrad));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("censusEnrlDate");
        sb.append('=');
        sb.append(((this.censusEnrlDate == null)?"<null>":this.censusEnrlDate));
        sb.append(',');
        sb.append("holdSsrresvMaxEnrl");
        sb.append('=');
        sb.append(((this.holdSsrresvMaxEnrl == null)?"<null>":this.holdSsrresvMaxEnrl));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("overflowInd");
        sb.append('=');
        sb.append(((this.overflowInd == null)?"<null>":this.overflowInd));
        sb.append(',');
        sb.append("waitCapacity");
        sb.append('=');
        sb.append(((this.waitCapacity == null)?"<null>":this.waitCapacity));
        sb.append(',');
        sb.append("maxEnrl");
        sb.append('=');
        sb.append(((this.maxEnrl == null)?"<null>":this.maxEnrl));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("termCodeAdmit");
        sb.append('=');
        sb.append(((this.termCodeAdmit == null)?"<null>":this.termCodeAdmit));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
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
        result = ((result* 31)+((this.primSecCde == null)? 0 :this.primSecCde.hashCode()));
        result = ((result* 31)+((this.holdSsrresvWaitCapacity == null)? 0 :this.holdSsrresvWaitCapacity.hashCode()));
        result = ((result* 31)+((this.projEnrl == null)? 0 :this.projEnrl.hashCode()));
        result = ((result* 31)+((this.census2Date == null)? 0 :this.census2Date.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.termCodeMatric == null)? 0 :this.termCodeMatric.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.termCodeGrad == null)? 0 :this.termCodeGrad.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.censusEnrlDate == null)? 0 :this.censusEnrlDate.hashCode()));
        result = ((result* 31)+((this.holdSsrresvMaxEnrl == null)? 0 :this.holdSsrresvMaxEnrl.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.overflowInd == null)? 0 :this.overflowInd.hashCode()));
        result = ((result* 31)+((this.waitCapacity == null)? 0 :this.waitCapacity.hashCode()));
        result = ((result* 31)+((this.maxEnrl == null)? 0 :this.maxEnrl.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.termCodeAdmit == null)? 0 :this.termCodeAdmit.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionEnrollmentInformation100PostRequest) == false) {
            return false;
        }
        SectionEnrollmentInformation100PostRequest rhs = ((SectionEnrollmentInformation100PostRequest) other);
        return (((((((((((((((((((((((((((this.primSecCde == rhs.primSecCde)||((this.primSecCde!= null)&&this.primSecCde.equals(rhs.primSecCde)))&&((this.holdSsrresvWaitCapacity == rhs.holdSsrresvWaitCapacity)||((this.holdSsrresvWaitCapacity!= null)&&this.holdSsrresvWaitCapacity.equals(rhs.holdSsrresvWaitCapacity))))&&((this.projEnrl == rhs.projEnrl)||((this.projEnrl!= null)&&this.projEnrl.equals(rhs.projEnrl))))&&((this.census2Date == rhs.census2Date)||((this.census2Date!= null)&&this.census2Date.equals(rhs.census2Date))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.termCodeMatric == rhs.termCodeMatric)||((this.termCodeMatric!= null)&&this.termCodeMatric.equals(rhs.termCodeMatric))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.termCodeGrad == rhs.termCodeGrad)||((this.termCodeGrad!= null)&&this.termCodeGrad.equals(rhs.termCodeGrad))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode))))&&((this.censusEnrlDate == rhs.censusEnrlDate)||((this.censusEnrlDate!= null)&&this.censusEnrlDate.equals(rhs.censusEnrlDate))))&&((this.holdSsrresvMaxEnrl == rhs.holdSsrresvMaxEnrl)||((this.holdSsrresvMaxEnrl!= null)&&this.holdSsrresvMaxEnrl.equals(rhs.holdSsrresvMaxEnrl))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.overflowInd == rhs.overflowInd)||((this.overflowInd!= null)&&this.overflowInd.equals(rhs.overflowInd))))&&((this.waitCapacity == rhs.waitCapacity)||((this.waitCapacity!= null)&&this.waitCapacity.equals(rhs.waitCapacity))))&&((this.maxEnrl == rhs.maxEnrl)||((this.maxEnrl!= null)&&this.maxEnrl.equals(rhs.maxEnrl))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.termCodeAdmit == rhs.termCodeAdmit)||((this.termCodeAdmit!= null)&&this.termCodeAdmit.equals(rhs.termCodeAdmit))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
