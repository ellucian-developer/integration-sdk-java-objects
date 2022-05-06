
package com.ellucian.generated.bpapi.ban.curricula_summary_learner_outcome.v1_0_0;

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
    "majrCodeDual",
    "stvdegsDesc",
    "tbbdetcAmt",
    "applDate",
    "grstCode",
    "stvmajrDescDual",
    "stvcollDescDual",
    "termCodeGrad",
    "termCodeComp",
    "tbraccdTermCode",
    "feeDate",
    "stvdegcDescDual",
    "tbbdetcDesc",
    "authorized",
    "acyrCodeBulletin",
    "collCodeDual",
    "gradDate",
    "stvgrstDesc",
    "stvlevlDescDual",
    "stspKeySequence",
    "levlCodeDual",
    "stvdeptDescDual",
    "detailCode",
    "termCodeSturec",
    "acyrCode",
    "feeInd",
    "deptCodeDual",
    "degsCode",
    "changeFeeInd",
    "degcCodeDual"
})
@Generated("jsonschema2pojo")
public class Shrdgmr {

    /**
     * Major
     * <p>
     * Lineage reference object : SHRDGMR_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeDual")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr")
    private String majrCodeDual;
    /**
     * Learner Outcome Information
     * <p>
     * 
     * 
     */
    @JsonProperty("stvdegsDesc")
    private String stvdegsDesc;
    /**
     * Fee Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcAmt")
    private Double tbbdetcAmt;
    /**
     * Graduation Application Date
     * <p>
     * Lineage reference object : SHRDGMR_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_APPL_DATE")
    private Date applDate;
    /**
     * Graduation Status
     * <p>
     * Lineage reference object : SHRDGMR_GRST_CODE, Lookup lineage reference object : stvgrst
     * 
     */
    @JsonProperty("grstCode")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_GRST_CODE, Lookup lineage reference object : stvgrst")
    private String grstCode;
    @JsonProperty("stvmajrDescDual")
    private String stvmajrDescDual;
    @JsonProperty("stvcollDescDual")
    private String stvcollDescDual;
    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm")
    private String termCodeGrad;
    /**
     * Degree Completion Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_COMPLETED, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeComp")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_TERM_CODE_COMPLETED, Lookup lineage reference object : stvterm")
    private String termCodeComp;
    /**
     * Fee Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("tbraccdTermCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvterm")
    private String tbraccdTermCode;
    /**
     * Fee Date
     * <p>
     * Lineage reference object : SHRDGMR_FEE_DATE
     * 
     */
    @JsonProperty("feeDate")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_FEE_DATE")
    private Date feeDate;
    @JsonProperty("stvdegcDescDual")
    private String stvdegcDescDual;
    @JsonProperty("tbbdetcDesc")
    private String tbbdetcDesc;
    /**
     * Authorize
     * <p>
     * Lineage reference object : SHRDGMR_AUTHORIZED
     * 
     */
    @JsonProperty("authorized")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_AUTHORIZED")
    private String authorized;
    /**
     * Bulletin Academic Year
     * <p>
     * Lineage reference object : SHRDGMR_ACYR_CODE_BULLETIN, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCodeBulletin")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_ACYR_CODE_BULLETIN, Lookup lineage reference object : stvacyr")
    private String acyrCodeBulletin;
    /**
     * College
     * <p>
     * Lineage reference object : SHRDGMR_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCodeDual")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll")
    private String collCodeDual;
    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SHRDGMR_GRAD_DATE
     * 
     */
    @JsonProperty("gradDate")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_GRAD_DATE")
    private Date gradDate;
    @JsonProperty("stvgrstDesc")
    private String stvgrstDesc;
    @JsonProperty("stvlevlDescDual")
    private String stvlevlDescDual;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRDGMR_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRDGMR_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeDual")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl")
    private String levlCodeDual;
    @JsonProperty("stvdeptDescDual")
    private String stvdeptDescDual;
    /**
     * Fee Detail
     * <p>
     * Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lookup lineage reference object : tbbdetc")
    private String detailCode;
    /**
     * Student Record Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_STUREC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeSturec")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_TERM_CODE_STUREC, Lookup lineage reference object : stvterm")
    private String termCodeSturec;
    /**
     * Graduation Year
     * <p>
     * Lineage reference object : SHRDGMR_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_ACYR_CODE, Lookup lineage reference object : stvacyr")
    private String acyrCode;
    /**
     * Fee Indicator
     * <p>
     * Lineage reference object : SHRDGMR_FEE_IND
     * 
     */
    @JsonProperty("feeInd")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_FEE_IND")
    private String feeInd;
    /**
     * Department
     * <p>
     * Lineage reference object : SHRDGMR_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCodeDual")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept")
    private String deptCodeDual;
    /**
     * Outcome Status
     * <p>
     * Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs
     * 
     */
    @JsonProperty("degsCode")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs")
    private String degsCode;
    /**
     * Fee
     * <p>
     * 
     * 
     */
    @JsonProperty("changeFeeInd")
    private String changeFeeInd;
    /**
     * Degree
     * <p>
     * Lineage reference object : SHRDGMR_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCodeDual")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc")
    private String degcCodeDual;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Major
     * <p>
     * Lineage reference object : SHRDGMR_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeDual")
    public String getMajrCodeDual() {
        return majrCodeDual;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SHRDGMR_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeDual")
    public void setMajrCodeDual(String majrCodeDual) {
        this.majrCodeDual = majrCodeDual;
    }

    public Shrdgmr withMajrCodeDual(String majrCodeDual) {
        this.majrCodeDual = majrCodeDual;
        return this;
    }

    /**
     * Learner Outcome Information
     * <p>
     * 
     * 
     */
    @JsonProperty("stvdegsDesc")
    public String getStvdegsDesc() {
        return stvdegsDesc;
    }

    /**
     * Learner Outcome Information
     * <p>
     * 
     * 
     */
    @JsonProperty("stvdegsDesc")
    public void setStvdegsDesc(String stvdegsDesc) {
        this.stvdegsDesc = stvdegsDesc;
    }

    public Shrdgmr withStvdegsDesc(String stvdegsDesc) {
        this.stvdegsDesc = stvdegsDesc;
        return this;
    }

    /**
     * Fee Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcAmt")
    public Double getTbbdetcAmt() {
        return tbbdetcAmt;
    }

    /**
     * Fee Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcAmt")
    public void setTbbdetcAmt(Double tbbdetcAmt) {
        this.tbbdetcAmt = tbbdetcAmt;
    }

    public Shrdgmr withTbbdetcAmt(Double tbbdetcAmt) {
        this.tbbdetcAmt = tbbdetcAmt;
        return this;
    }

    /**
     * Graduation Application Date
     * <p>
     * Lineage reference object : SHRDGMR_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    public Date getApplDate() {
        return applDate;
    }

    /**
     * Graduation Application Date
     * <p>
     * Lineage reference object : SHRDGMR_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    public void setApplDate(Date applDate) {
        this.applDate = applDate;
    }

    public Shrdgmr withApplDate(Date applDate) {
        this.applDate = applDate;
        return this;
    }

    /**
     * Graduation Status
     * <p>
     * Lineage reference object : SHRDGMR_GRST_CODE, Lookup lineage reference object : stvgrst
     * 
     */
    @JsonProperty("grstCode")
    public String getGrstCode() {
        return grstCode;
    }

    /**
     * Graduation Status
     * <p>
     * Lineage reference object : SHRDGMR_GRST_CODE, Lookup lineage reference object : stvgrst
     * 
     */
    @JsonProperty("grstCode")
    public void setGrstCode(String grstCode) {
        this.grstCode = grstCode;
    }

    public Shrdgmr withGrstCode(String grstCode) {
        this.grstCode = grstCode;
        return this;
    }

    @JsonProperty("stvmajrDescDual")
    public String getStvmajrDescDual() {
        return stvmajrDescDual;
    }

    @JsonProperty("stvmajrDescDual")
    public void setStvmajrDescDual(String stvmajrDescDual) {
        this.stvmajrDescDual = stvmajrDescDual;
    }

    public Shrdgmr withStvmajrDescDual(String stvmajrDescDual) {
        this.stvmajrDescDual = stvmajrDescDual;
        return this;
    }

    @JsonProperty("stvcollDescDual")
    public String getStvcollDescDual() {
        return stvcollDescDual;
    }

    @JsonProperty("stvcollDescDual")
    public void setStvcollDescDual(String stvcollDescDual) {
        this.stvcollDescDual = stvcollDescDual;
    }

    public Shrdgmr withStvcollDescDual(String stvcollDescDual) {
        this.stvcollDescDual = stvcollDescDual;
        return this;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public String getTermCodeGrad() {
        return termCodeGrad;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeGrad")
    public void setTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
    }

    public Shrdgmr withTermCodeGrad(String termCodeGrad) {
        this.termCodeGrad = termCodeGrad;
        return this;
    }

    /**
     * Degree Completion Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_COMPLETED, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeComp")
    public String getTermCodeComp() {
        return termCodeComp;
    }

    /**
     * Degree Completion Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_COMPLETED, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeComp")
    public void setTermCodeComp(String termCodeComp) {
        this.termCodeComp = termCodeComp;
    }

    public Shrdgmr withTermCodeComp(String termCodeComp) {
        this.termCodeComp = termCodeComp;
        return this;
    }

    /**
     * Fee Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("tbraccdTermCode")
    public String getTbraccdTermCode() {
        return tbraccdTermCode;
    }

    /**
     * Fee Term
     * <p>
     * Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("tbraccdTermCode")
    public void setTbraccdTermCode(String tbraccdTermCode) {
        this.tbraccdTermCode = tbraccdTermCode;
    }

    public Shrdgmr withTbraccdTermCode(String tbraccdTermCode) {
        this.tbraccdTermCode = tbraccdTermCode;
        return this;
    }

    /**
     * Fee Date
     * <p>
     * Lineage reference object : SHRDGMR_FEE_DATE
     * 
     */
    @JsonProperty("feeDate")
    public Date getFeeDate() {
        return feeDate;
    }

    /**
     * Fee Date
     * <p>
     * Lineage reference object : SHRDGMR_FEE_DATE
     * 
     */
    @JsonProperty("feeDate")
    public void setFeeDate(Date feeDate) {
        this.feeDate = feeDate;
    }

    public Shrdgmr withFeeDate(Date feeDate) {
        this.feeDate = feeDate;
        return this;
    }

    @JsonProperty("stvdegcDescDual")
    public String getStvdegcDescDual() {
        return stvdegcDescDual;
    }

    @JsonProperty("stvdegcDescDual")
    public void setStvdegcDescDual(String stvdegcDescDual) {
        this.stvdegcDescDual = stvdegcDescDual;
    }

    public Shrdgmr withStvdegcDescDual(String stvdegcDescDual) {
        this.stvdegcDescDual = stvdegcDescDual;
        return this;
    }

    @JsonProperty("tbbdetcDesc")
    public String getTbbdetcDesc() {
        return tbbdetcDesc;
    }

    @JsonProperty("tbbdetcDesc")
    public void setTbbdetcDesc(String tbbdetcDesc) {
        this.tbbdetcDesc = tbbdetcDesc;
    }

    public Shrdgmr withTbbdetcDesc(String tbbdetcDesc) {
        this.tbbdetcDesc = tbbdetcDesc;
        return this;
    }

    /**
     * Authorize
     * <p>
     * Lineage reference object : SHRDGMR_AUTHORIZED
     * 
     */
    @JsonProperty("authorized")
    public String getAuthorized() {
        return authorized;
    }

    /**
     * Authorize
     * <p>
     * Lineage reference object : SHRDGMR_AUTHORIZED
     * 
     */
    @JsonProperty("authorized")
    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }

    public Shrdgmr withAuthorized(String authorized) {
        this.authorized = authorized;
        return this;
    }

    /**
     * Bulletin Academic Year
     * <p>
     * Lineage reference object : SHRDGMR_ACYR_CODE_BULLETIN, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCodeBulletin")
    public String getAcyrCodeBulletin() {
        return acyrCodeBulletin;
    }

    /**
     * Bulletin Academic Year
     * <p>
     * Lineage reference object : SHRDGMR_ACYR_CODE_BULLETIN, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCodeBulletin")
    public void setAcyrCodeBulletin(String acyrCodeBulletin) {
        this.acyrCodeBulletin = acyrCodeBulletin;
    }

    public Shrdgmr withAcyrCodeBulletin(String acyrCodeBulletin) {
        this.acyrCodeBulletin = acyrCodeBulletin;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SHRDGMR_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCodeDual")
    public String getCollCodeDual() {
        return collCodeDual;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SHRDGMR_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCodeDual")
    public void setCollCodeDual(String collCodeDual) {
        this.collCodeDual = collCodeDual;
    }

    public Shrdgmr withCollCodeDual(String collCodeDual) {
        this.collCodeDual = collCodeDual;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SHRDGMR_GRAD_DATE
     * 
     */
    @JsonProperty("gradDate")
    public Date getGradDate() {
        return gradDate;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SHRDGMR_GRAD_DATE
     * 
     */
    @JsonProperty("gradDate")
    public void setGradDate(Date gradDate) {
        this.gradDate = gradDate;
    }

    public Shrdgmr withGradDate(Date gradDate) {
        this.gradDate = gradDate;
        return this;
    }

    @JsonProperty("stvgrstDesc")
    public String getStvgrstDesc() {
        return stvgrstDesc;
    }

    @JsonProperty("stvgrstDesc")
    public void setStvgrstDesc(String stvgrstDesc) {
        this.stvgrstDesc = stvgrstDesc;
    }

    public Shrdgmr withStvgrstDesc(String stvgrstDesc) {
        this.stvgrstDesc = stvgrstDesc;
        return this;
    }

    @JsonProperty("stvlevlDescDual")
    public String getStvlevlDescDual() {
        return stvlevlDescDual;
    }

    @JsonProperty("stvlevlDescDual")
    public void setStvlevlDescDual(String stvlevlDescDual) {
        this.stvlevlDescDual = stvlevlDescDual;
    }

    public Shrdgmr withStvlevlDescDual(String stvlevlDescDual) {
        this.stvlevlDescDual = stvlevlDescDual;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRDGMR_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRDGMR_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Shrdgmr withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRDGMR_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeDual")
    public String getLevlCodeDual() {
        return levlCodeDual;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRDGMR_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeDual")
    public void setLevlCodeDual(String levlCodeDual) {
        this.levlCodeDual = levlCodeDual;
    }

    public Shrdgmr withLevlCodeDual(String levlCodeDual) {
        this.levlCodeDual = levlCodeDual;
        return this;
    }

    @JsonProperty("stvdeptDescDual")
    public String getStvdeptDescDual() {
        return stvdeptDescDual;
    }

    @JsonProperty("stvdeptDescDual")
    public void setStvdeptDescDual(String stvdeptDescDual) {
        this.stvdeptDescDual = stvdeptDescDual;
    }

    public Shrdgmr withStvdeptDescDual(String stvdeptDescDual) {
        this.stvdeptDescDual = stvdeptDescDual;
        return this;
    }

    /**
     * Fee Detail
     * <p>
     * Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Fee Detail
     * <p>
     * Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Shrdgmr withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Student Record Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_STUREC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeSturec")
    public String getTermCodeSturec() {
        return termCodeSturec;
    }

    /**
     * Student Record Term
     * <p>
     * Lineage reference object : SHRDGMR_TERM_CODE_STUREC, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeSturec")
    public void setTermCodeSturec(String termCodeSturec) {
        this.termCodeSturec = termCodeSturec;
    }

    public Shrdgmr withTermCodeSturec(String termCodeSturec) {
        this.termCodeSturec = termCodeSturec;
        return this;
    }

    /**
     * Graduation Year
     * <p>
     * Lineage reference object : SHRDGMR_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    public String getAcyrCode() {
        return acyrCode;
    }

    /**
     * Graduation Year
     * <p>
     * Lineage reference object : SHRDGMR_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    public void setAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
    }

    public Shrdgmr withAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
        return this;
    }

    /**
     * Fee Indicator
     * <p>
     * Lineage reference object : SHRDGMR_FEE_IND
     * 
     */
    @JsonProperty("feeInd")
    public String getFeeInd() {
        return feeInd;
    }

    /**
     * Fee Indicator
     * <p>
     * Lineage reference object : SHRDGMR_FEE_IND
     * 
     */
    @JsonProperty("feeInd")
    public void setFeeInd(String feeInd) {
        this.feeInd = feeInd;
    }

    public Shrdgmr withFeeInd(String feeInd) {
        this.feeInd = feeInd;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SHRDGMR_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCodeDual")
    public String getDeptCodeDual() {
        return deptCodeDual;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SHRDGMR_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCodeDual")
    public void setDeptCodeDual(String deptCodeDual) {
        this.deptCodeDual = deptCodeDual;
    }

    public Shrdgmr withDeptCodeDual(String deptCodeDual) {
        this.deptCodeDual = deptCodeDual;
        return this;
    }

    /**
     * Outcome Status
     * <p>
     * Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs
     * 
     */
    @JsonProperty("degsCode")
    public String getDegsCode() {
        return degsCode;
    }

    /**
     * Outcome Status
     * <p>
     * Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs
     * 
     */
    @JsonProperty("degsCode")
    public void setDegsCode(String degsCode) {
        this.degsCode = degsCode;
    }

    public Shrdgmr withDegsCode(String degsCode) {
        this.degsCode = degsCode;
        return this;
    }

    /**
     * Fee
     * <p>
     * 
     * 
     */
    @JsonProperty("changeFeeInd")
    public String getChangeFeeInd() {
        return changeFeeInd;
    }

    /**
     * Fee
     * <p>
     * 
     * 
     */
    @JsonProperty("changeFeeInd")
    public void setChangeFeeInd(String changeFeeInd) {
        this.changeFeeInd = changeFeeInd;
    }

    public Shrdgmr withChangeFeeInd(String changeFeeInd) {
        this.changeFeeInd = changeFeeInd;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SHRDGMR_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCodeDual")
    public String getDegcCodeDual() {
        return degcCodeDual;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SHRDGMR_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCodeDual")
    public void setDegcCodeDual(String degcCodeDual) {
        this.degcCodeDual = degcCodeDual;
    }

    public Shrdgmr withDegcCodeDual(String degcCodeDual) {
        this.degcCodeDual = degcCodeDual;
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

    public Shrdgmr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrdgmr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("majrCodeDual");
        sb.append('=');
        sb.append(((this.majrCodeDual == null)?"<null>":this.majrCodeDual));
        sb.append(',');
        sb.append("stvdegsDesc");
        sb.append('=');
        sb.append(((this.stvdegsDesc == null)?"<null>":this.stvdegsDesc));
        sb.append(',');
        sb.append("tbbdetcAmt");
        sb.append('=');
        sb.append(((this.tbbdetcAmt == null)?"<null>":this.tbbdetcAmt));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("grstCode");
        sb.append('=');
        sb.append(((this.grstCode == null)?"<null>":this.grstCode));
        sb.append(',');
        sb.append("stvmajrDescDual");
        sb.append('=');
        sb.append(((this.stvmajrDescDual == null)?"<null>":this.stvmajrDescDual));
        sb.append(',');
        sb.append("stvcollDescDual");
        sb.append('=');
        sb.append(((this.stvcollDescDual == null)?"<null>":this.stvcollDescDual));
        sb.append(',');
        sb.append("termCodeGrad");
        sb.append('=');
        sb.append(((this.termCodeGrad == null)?"<null>":this.termCodeGrad));
        sb.append(',');
        sb.append("termCodeComp");
        sb.append('=');
        sb.append(((this.termCodeComp == null)?"<null>":this.termCodeComp));
        sb.append(',');
        sb.append("tbraccdTermCode");
        sb.append('=');
        sb.append(((this.tbraccdTermCode == null)?"<null>":this.tbraccdTermCode));
        sb.append(',');
        sb.append("feeDate");
        sb.append('=');
        sb.append(((this.feeDate == null)?"<null>":this.feeDate));
        sb.append(',');
        sb.append("stvdegcDescDual");
        sb.append('=');
        sb.append(((this.stvdegcDescDual == null)?"<null>":this.stvdegcDescDual));
        sb.append(',');
        sb.append("tbbdetcDesc");
        sb.append('=');
        sb.append(((this.tbbdetcDesc == null)?"<null>":this.tbbdetcDesc));
        sb.append(',');
        sb.append("authorized");
        sb.append('=');
        sb.append(((this.authorized == null)?"<null>":this.authorized));
        sb.append(',');
        sb.append("acyrCodeBulletin");
        sb.append('=');
        sb.append(((this.acyrCodeBulletin == null)?"<null>":this.acyrCodeBulletin));
        sb.append(',');
        sb.append("collCodeDual");
        sb.append('=');
        sb.append(((this.collCodeDual == null)?"<null>":this.collCodeDual));
        sb.append(',');
        sb.append("gradDate");
        sb.append('=');
        sb.append(((this.gradDate == null)?"<null>":this.gradDate));
        sb.append(',');
        sb.append("stvgrstDesc");
        sb.append('=');
        sb.append(((this.stvgrstDesc == null)?"<null>":this.stvgrstDesc));
        sb.append(',');
        sb.append("stvlevlDescDual");
        sb.append('=');
        sb.append(((this.stvlevlDescDual == null)?"<null>":this.stvlevlDescDual));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("levlCodeDual");
        sb.append('=');
        sb.append(((this.levlCodeDual == null)?"<null>":this.levlCodeDual));
        sb.append(',');
        sb.append("stvdeptDescDual");
        sb.append('=');
        sb.append(((this.stvdeptDescDual == null)?"<null>":this.stvdeptDescDual));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("termCodeSturec");
        sb.append('=');
        sb.append(((this.termCodeSturec == null)?"<null>":this.termCodeSturec));
        sb.append(',');
        sb.append("acyrCode");
        sb.append('=');
        sb.append(((this.acyrCode == null)?"<null>":this.acyrCode));
        sb.append(',');
        sb.append("feeInd");
        sb.append('=');
        sb.append(((this.feeInd == null)?"<null>":this.feeInd));
        sb.append(',');
        sb.append("deptCodeDual");
        sb.append('=');
        sb.append(((this.deptCodeDual == null)?"<null>":this.deptCodeDual));
        sb.append(',');
        sb.append("degsCode");
        sb.append('=');
        sb.append(((this.degsCode == null)?"<null>":this.degsCode));
        sb.append(',');
        sb.append("changeFeeInd");
        sb.append('=');
        sb.append(((this.changeFeeInd == null)?"<null>":this.changeFeeInd));
        sb.append(',');
        sb.append("degcCodeDual");
        sb.append('=');
        sb.append(((this.degcCodeDual == null)?"<null>":this.degcCodeDual));
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
        result = ((result* 31)+((this.majrCodeDual == null)? 0 :this.majrCodeDual.hashCode()));
        result = ((result* 31)+((this.stvdegsDesc == null)? 0 :this.stvdegsDesc.hashCode()));
        result = ((result* 31)+((this.tbbdetcAmt == null)? 0 :this.tbbdetcAmt.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.grstCode == null)? 0 :this.grstCode.hashCode()));
        result = ((result* 31)+((this.stvmajrDescDual == null)? 0 :this.stvmajrDescDual.hashCode()));
        result = ((result* 31)+((this.stvcollDescDual == null)? 0 :this.stvcollDescDual.hashCode()));
        result = ((result* 31)+((this.termCodeGrad == null)? 0 :this.termCodeGrad.hashCode()));
        result = ((result* 31)+((this.termCodeComp == null)? 0 :this.termCodeComp.hashCode()));
        result = ((result* 31)+((this.tbraccdTermCode == null)? 0 :this.tbraccdTermCode.hashCode()));
        result = ((result* 31)+((this.feeDate == null)? 0 :this.feeDate.hashCode()));
        result = ((result* 31)+((this.stvdegcDescDual == null)? 0 :this.stvdegcDescDual.hashCode()));
        result = ((result* 31)+((this.tbbdetcDesc == null)? 0 :this.tbbdetcDesc.hashCode()));
        result = ((result* 31)+((this.authorized == null)? 0 :this.authorized.hashCode()));
        result = ((result* 31)+((this.acyrCodeBulletin == null)? 0 :this.acyrCodeBulletin.hashCode()));
        result = ((result* 31)+((this.collCodeDual == null)? 0 :this.collCodeDual.hashCode()));
        result = ((result* 31)+((this.gradDate == null)? 0 :this.gradDate.hashCode()));
        result = ((result* 31)+((this.stvgrstDesc == null)? 0 :this.stvgrstDesc.hashCode()));
        result = ((result* 31)+((this.stvlevlDescDual == null)? 0 :this.stvlevlDescDual.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.levlCodeDual == null)? 0 :this.levlCodeDual.hashCode()));
        result = ((result* 31)+((this.stvdeptDescDual == null)? 0 :this.stvdeptDescDual.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.termCodeSturec == null)? 0 :this.termCodeSturec.hashCode()));
        result = ((result* 31)+((this.acyrCode == null)? 0 :this.acyrCode.hashCode()));
        result = ((result* 31)+((this.feeInd == null)? 0 :this.feeInd.hashCode()));
        result = ((result* 31)+((this.deptCodeDual == null)? 0 :this.deptCodeDual.hashCode()));
        result = ((result* 31)+((this.degsCode == null)? 0 :this.degsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.changeFeeInd == null)? 0 :this.changeFeeInd.hashCode()));
        result = ((result* 31)+((this.degcCodeDual == null)? 0 :this.degcCodeDual.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrdgmr) == false) {
            return false;
        }
        Shrdgmr rhs = ((Shrdgmr) other);
        return ((((((((((((((((((((((((((((((((this.majrCodeDual == rhs.majrCodeDual)||((this.majrCodeDual!= null)&&this.majrCodeDual.equals(rhs.majrCodeDual)))&&((this.stvdegsDesc == rhs.stvdegsDesc)||((this.stvdegsDesc!= null)&&this.stvdegsDesc.equals(rhs.stvdegsDesc))))&&((this.tbbdetcAmt == rhs.tbbdetcAmt)||((this.tbbdetcAmt!= null)&&this.tbbdetcAmt.equals(rhs.tbbdetcAmt))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.grstCode == rhs.grstCode)||((this.grstCode!= null)&&this.grstCode.equals(rhs.grstCode))))&&((this.stvmajrDescDual == rhs.stvmajrDescDual)||((this.stvmajrDescDual!= null)&&this.stvmajrDescDual.equals(rhs.stvmajrDescDual))))&&((this.stvcollDescDual == rhs.stvcollDescDual)||((this.stvcollDescDual!= null)&&this.stvcollDescDual.equals(rhs.stvcollDescDual))))&&((this.termCodeGrad == rhs.termCodeGrad)||((this.termCodeGrad!= null)&&this.termCodeGrad.equals(rhs.termCodeGrad))))&&((this.termCodeComp == rhs.termCodeComp)||((this.termCodeComp!= null)&&this.termCodeComp.equals(rhs.termCodeComp))))&&((this.tbraccdTermCode == rhs.tbraccdTermCode)||((this.tbraccdTermCode!= null)&&this.tbraccdTermCode.equals(rhs.tbraccdTermCode))))&&((this.feeDate == rhs.feeDate)||((this.feeDate!= null)&&this.feeDate.equals(rhs.feeDate))))&&((this.stvdegcDescDual == rhs.stvdegcDescDual)||((this.stvdegcDescDual!= null)&&this.stvdegcDescDual.equals(rhs.stvdegcDescDual))))&&((this.tbbdetcDesc == rhs.tbbdetcDesc)||((this.tbbdetcDesc!= null)&&this.tbbdetcDesc.equals(rhs.tbbdetcDesc))))&&((this.authorized == rhs.authorized)||((this.authorized!= null)&&this.authorized.equals(rhs.authorized))))&&((this.acyrCodeBulletin == rhs.acyrCodeBulletin)||((this.acyrCodeBulletin!= null)&&this.acyrCodeBulletin.equals(rhs.acyrCodeBulletin))))&&((this.collCodeDual == rhs.collCodeDual)||((this.collCodeDual!= null)&&this.collCodeDual.equals(rhs.collCodeDual))))&&((this.gradDate == rhs.gradDate)||((this.gradDate!= null)&&this.gradDate.equals(rhs.gradDate))))&&((this.stvgrstDesc == rhs.stvgrstDesc)||((this.stvgrstDesc!= null)&&this.stvgrstDesc.equals(rhs.stvgrstDesc))))&&((this.stvlevlDescDual == rhs.stvlevlDescDual)||((this.stvlevlDescDual!= null)&&this.stvlevlDescDual.equals(rhs.stvlevlDescDual))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.levlCodeDual == rhs.levlCodeDual)||((this.levlCodeDual!= null)&&this.levlCodeDual.equals(rhs.levlCodeDual))))&&((this.stvdeptDescDual == rhs.stvdeptDescDual)||((this.stvdeptDescDual!= null)&&this.stvdeptDescDual.equals(rhs.stvdeptDescDual))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.termCodeSturec == rhs.termCodeSturec)||((this.termCodeSturec!= null)&&this.termCodeSturec.equals(rhs.termCodeSturec))))&&((this.acyrCode == rhs.acyrCode)||((this.acyrCode!= null)&&this.acyrCode.equals(rhs.acyrCode))))&&((this.feeInd == rhs.feeInd)||((this.feeInd!= null)&&this.feeInd.equals(rhs.feeInd))))&&((this.deptCodeDual == rhs.deptCodeDual)||((this.deptCodeDual!= null)&&this.deptCodeDual.equals(rhs.deptCodeDual))))&&((this.degsCode == rhs.degsCode)||((this.degsCode!= null)&&this.degsCode.equals(rhs.degsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.changeFeeInd == rhs.changeFeeInd)||((this.changeFeeInd!= null)&&this.changeFeeInd.equals(rhs.changeFeeInd))))&&((this.degcCodeDual == rhs.degcCodeDual)||((this.degcCodeDual!= null)&&this.degcCodeDual.equals(rhs.degcCodeDual))));
    }

}
