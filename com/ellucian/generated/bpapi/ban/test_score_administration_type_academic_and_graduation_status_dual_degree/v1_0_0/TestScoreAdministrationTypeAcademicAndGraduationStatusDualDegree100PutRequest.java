
package com.ellucian.generated.bpapi.ban.test_score_administration_type_academic_and_graduation_status_dual_degree.v1_0_0;

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
    "sgbstdnPrevCode",
    "sgbstdnCastCode",
    "sgbstdnTermCodeAstd",
    "sgbstdnTermCodeCast",
    "sgbstdnMajrCodeDual",
    "sgbstdnDeptCodeDual",
    "sgbstdnExpGradDate",
    "sgbstdnAstdCode",
    "sgbstdnCollCodeDual",
    "sgbstdnDegcCodeDual",
    "sgbstdnTermCodeGrad",
    "id",
    "sgbstdnTermCodePrev",
    "stvtermTermCode",
    "sgbstdnLevlCodeDual"
})
@Generated("jsonschema2pojo")
public class TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest {

    /**
     * Progress Evaluation Override
     * <p>
     * Lineage reference object : SGBSTDN_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("sgbstdnPrevCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_PREV_CODE, Lookup lineage reference object : stvprev")
    private String sgbstdnPrevCode;
    /**
     * Combined Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("sgbstdnCastCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_CAST_CODE, Lookup lineage reference object : stvcast")
    private String sgbstdnCastCode;
    /**
     * Academic Status Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_ASTD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodeAstd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_ASTD, Lookup lineage reference object : stvterm")
    private String sgbstdnTermCodeAstd;
    /**
     * Combined Academic Standing Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_CAST, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodeCast")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_CAST, Lookup lineage reference object : stvterm")
    private String sgbstdnTermCodeCast;
    /**
     * Major
     * <p>
     * Lineage reference object : SGBSTDN_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("sgbstdnMajrCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr")
    private String sgbstdnMajrCodeDual;
    /**
     * Department
     * <p>
     * Lineage reference object : SGBSTDN_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sgbstdnDeptCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept")
    private String sgbstdnDeptCodeDual;
    /**
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SGBSTDN_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("sgbstdnExpGradDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EXP_GRAD_DATE")
    private Date sgbstdnExpGradDate;
    /**
     * Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("sgbstdnAstdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_ASTD_CODE, Lookup lineage reference object : stvastd")
    private String sgbstdnAstdCode;
    /**
     * College
     * <p>
     * Lineage reference object : SGBSTDN_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sgbstdnCollCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll")
    private String sgbstdnCollCodeDual;
    /**
     * Degree
     * <p>
     * Lineage reference object : SGBSTDN_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sgbstdnDegcCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc")
    private String sgbstdnDegcCodeDual;
    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodeGrad")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_GRAD, Lookup lineage reference object : stvterm")
    private String sgbstdnTermCodeGrad;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Progress Evaluation Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_PREV, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodePrev")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_PREV, Lookup lineage reference object : stvterm")
    private String sgbstdnTermCodePrev;
    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    @JsonPropertyDescription("Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm")
    private Object stvtermTermCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SGBSTDN_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("sgbstdnLevlCodeDual")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl")
    private String sgbstdnLevlCodeDual;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Progress Evaluation Override
     * <p>
     * Lineage reference object : SGBSTDN_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("sgbstdnPrevCode")
    public String getSgbstdnPrevCode() {
        return sgbstdnPrevCode;
    }

    /**
     * Progress Evaluation Override
     * <p>
     * Lineage reference object : SGBSTDN_PREV_CODE, Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("sgbstdnPrevCode")
    public void setSgbstdnPrevCode(String sgbstdnPrevCode) {
        this.sgbstdnPrevCode = sgbstdnPrevCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnPrevCode(String sgbstdnPrevCode) {
        this.sgbstdnPrevCode = sgbstdnPrevCode;
        return this;
    }

    /**
     * Combined Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("sgbstdnCastCode")
    public String getSgbstdnCastCode() {
        return sgbstdnCastCode;
    }

    /**
     * Combined Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_CAST_CODE, Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("sgbstdnCastCode")
    public void setSgbstdnCastCode(String sgbstdnCastCode) {
        this.sgbstdnCastCode = sgbstdnCastCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnCastCode(String sgbstdnCastCode) {
        this.sgbstdnCastCode = sgbstdnCastCode;
        return this;
    }

    /**
     * Academic Status Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_ASTD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodeAstd")
    public String getSgbstdnTermCodeAstd() {
        return sgbstdnTermCodeAstd;
    }

    /**
     * Academic Status Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_ASTD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodeAstd")
    public void setSgbstdnTermCodeAstd(String sgbstdnTermCodeAstd) {
        this.sgbstdnTermCodeAstd = sgbstdnTermCodeAstd;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnTermCodeAstd(String sgbstdnTermCodeAstd) {
        this.sgbstdnTermCodeAstd = sgbstdnTermCodeAstd;
        return this;
    }

    /**
     * Combined Academic Standing Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_CAST, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodeCast")
    public String getSgbstdnTermCodeCast() {
        return sgbstdnTermCodeCast;
    }

    /**
     * Combined Academic Standing Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_CAST, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodeCast")
    public void setSgbstdnTermCodeCast(String sgbstdnTermCodeCast) {
        this.sgbstdnTermCodeCast = sgbstdnTermCodeCast;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnTermCodeCast(String sgbstdnTermCodeCast) {
        this.sgbstdnTermCodeCast = sgbstdnTermCodeCast;
        return this;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SGBSTDN_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("sgbstdnMajrCodeDual")
    public String getSgbstdnMajrCodeDual() {
        return sgbstdnMajrCodeDual;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SGBSTDN_MAJR_CODE_DUAL, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("sgbstdnMajrCodeDual")
    public void setSgbstdnMajrCodeDual(String sgbstdnMajrCodeDual) {
        this.sgbstdnMajrCodeDual = sgbstdnMajrCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnMajrCodeDual(String sgbstdnMajrCodeDual) {
        this.sgbstdnMajrCodeDual = sgbstdnMajrCodeDual;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SGBSTDN_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sgbstdnDeptCodeDual")
    public String getSgbstdnDeptCodeDual() {
        return sgbstdnDeptCodeDual;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SGBSTDN_DEPT_CODE_DUAL, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sgbstdnDeptCodeDual")
    public void setSgbstdnDeptCodeDual(String sgbstdnDeptCodeDual) {
        this.sgbstdnDeptCodeDual = sgbstdnDeptCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnDeptCodeDual(String sgbstdnDeptCodeDual) {
        this.sgbstdnDeptCodeDual = sgbstdnDeptCodeDual;
        return this;
    }

    /**
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SGBSTDN_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("sgbstdnExpGradDate")
    public Date getSgbstdnExpGradDate() {
        return sgbstdnExpGradDate;
    }

    /**
     * Expected Graduation Date
     * <p>
     * Lineage reference object : SGBSTDN_EXP_GRAD_DATE
     * 
     */
    @JsonProperty("sgbstdnExpGradDate")
    public void setSgbstdnExpGradDate(Date sgbstdnExpGradDate) {
        this.sgbstdnExpGradDate = sgbstdnExpGradDate;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnExpGradDate(Date sgbstdnExpGradDate) {
        this.sgbstdnExpGradDate = sgbstdnExpGradDate;
        return this;
    }

    /**
     * Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("sgbstdnAstdCode")
    public String getSgbstdnAstdCode() {
        return sgbstdnAstdCode;
    }

    /**
     * Academic Standing Override
     * <p>
     * Lineage reference object : SGBSTDN_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("sgbstdnAstdCode")
    public void setSgbstdnAstdCode(String sgbstdnAstdCode) {
        this.sgbstdnAstdCode = sgbstdnAstdCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnAstdCode(String sgbstdnAstdCode) {
        this.sgbstdnAstdCode = sgbstdnAstdCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SGBSTDN_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sgbstdnCollCodeDual")
    public String getSgbstdnCollCodeDual() {
        return sgbstdnCollCodeDual;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SGBSTDN_COLL_CODE_DUAL, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sgbstdnCollCodeDual")
    public void setSgbstdnCollCodeDual(String sgbstdnCollCodeDual) {
        this.sgbstdnCollCodeDual = sgbstdnCollCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnCollCodeDual(String sgbstdnCollCodeDual) {
        this.sgbstdnCollCodeDual = sgbstdnCollCodeDual;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SGBSTDN_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sgbstdnDegcCodeDual")
    public String getSgbstdnDegcCodeDual() {
        return sgbstdnDegcCodeDual;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SGBSTDN_DEGC_CODE_DUAL, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sgbstdnDegcCodeDual")
    public void setSgbstdnDegcCodeDual(String sgbstdnDegcCodeDual) {
        this.sgbstdnDegcCodeDual = sgbstdnDegcCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnDegcCodeDual(String sgbstdnDegcCodeDual) {
        this.sgbstdnDegcCodeDual = sgbstdnDegcCodeDual;
        return this;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodeGrad")
    public String getSgbstdnTermCodeGrad() {
        return sgbstdnTermCodeGrad;
    }

    /**
     * Graduation Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_GRAD, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodeGrad")
    public void setSgbstdnTermCodeGrad(String sgbstdnTermCodeGrad) {
        this.sgbstdnTermCodeGrad = sgbstdnTermCodeGrad;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnTermCodeGrad(String sgbstdnTermCodeGrad) {
        this.sgbstdnTermCodeGrad = sgbstdnTermCodeGrad;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Progress Evaluation Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_PREV, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodePrev")
    public String getSgbstdnTermCodePrev() {
        return sgbstdnTermCodePrev;
    }

    /**
     * Progress Evaluation Override Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_PREV, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgbstdnTermCodePrev")
    public void setSgbstdnTermCodePrev(String sgbstdnTermCodePrev) {
        this.sgbstdnTermCodePrev = sgbstdnTermCodePrev;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnTermCodePrev(String sgbstdnTermCodePrev) {
        this.sgbstdnTermCodePrev = sgbstdnTermCodePrev;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public Object getStvtermTermCode() {
        return stvtermTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SGBSTDN_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("sgbstdnLevlCodeDual")
    public String getSgbstdnLevlCodeDual() {
        return sgbstdnLevlCodeDual;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SGBSTDN_LEVL_CODE_DUAL, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("sgbstdnLevlCodeDual")
    public void setSgbstdnLevlCodeDual(String sgbstdnLevlCodeDual) {
        this.sgbstdnLevlCodeDual = sgbstdnLevlCodeDual;
    }

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withSgbstdnLevlCodeDual(String sgbstdnLevlCodeDual) {
        this.sgbstdnLevlCodeDual = sgbstdnLevlCodeDual;
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

    public TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgbstdnPrevCode");
        sb.append('=');
        sb.append(((this.sgbstdnPrevCode == null)?"<null>":this.sgbstdnPrevCode));
        sb.append(',');
        sb.append("sgbstdnCastCode");
        sb.append('=');
        sb.append(((this.sgbstdnCastCode == null)?"<null>":this.sgbstdnCastCode));
        sb.append(',');
        sb.append("sgbstdnTermCodeAstd");
        sb.append('=');
        sb.append(((this.sgbstdnTermCodeAstd == null)?"<null>":this.sgbstdnTermCodeAstd));
        sb.append(',');
        sb.append("sgbstdnTermCodeCast");
        sb.append('=');
        sb.append(((this.sgbstdnTermCodeCast == null)?"<null>":this.sgbstdnTermCodeCast));
        sb.append(',');
        sb.append("sgbstdnMajrCodeDual");
        sb.append('=');
        sb.append(((this.sgbstdnMajrCodeDual == null)?"<null>":this.sgbstdnMajrCodeDual));
        sb.append(',');
        sb.append("sgbstdnDeptCodeDual");
        sb.append('=');
        sb.append(((this.sgbstdnDeptCodeDual == null)?"<null>":this.sgbstdnDeptCodeDual));
        sb.append(',');
        sb.append("sgbstdnExpGradDate");
        sb.append('=');
        sb.append(((this.sgbstdnExpGradDate == null)?"<null>":this.sgbstdnExpGradDate));
        sb.append(',');
        sb.append("sgbstdnAstdCode");
        sb.append('=');
        sb.append(((this.sgbstdnAstdCode == null)?"<null>":this.sgbstdnAstdCode));
        sb.append(',');
        sb.append("sgbstdnCollCodeDual");
        sb.append('=');
        sb.append(((this.sgbstdnCollCodeDual == null)?"<null>":this.sgbstdnCollCodeDual));
        sb.append(',');
        sb.append("sgbstdnDegcCodeDual");
        sb.append('=');
        sb.append(((this.sgbstdnDegcCodeDual == null)?"<null>":this.sgbstdnDegcCodeDual));
        sb.append(',');
        sb.append("sgbstdnTermCodeGrad");
        sb.append('=');
        sb.append(((this.sgbstdnTermCodeGrad == null)?"<null>":this.sgbstdnTermCodeGrad));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sgbstdnTermCodePrev");
        sb.append('=');
        sb.append(((this.sgbstdnTermCodePrev == null)?"<null>":this.sgbstdnTermCodePrev));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
        sb.append(',');
        sb.append("sgbstdnLevlCodeDual");
        sb.append('=');
        sb.append(((this.sgbstdnLevlCodeDual == null)?"<null>":this.sgbstdnLevlCodeDual));
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
        result = ((result* 31)+((this.sgbstdnPrevCode == null)? 0 :this.sgbstdnPrevCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnCastCode == null)? 0 :this.sgbstdnCastCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnTermCodeAstd == null)? 0 :this.sgbstdnTermCodeAstd.hashCode()));
        result = ((result* 31)+((this.sgbstdnTermCodeCast == null)? 0 :this.sgbstdnTermCodeCast.hashCode()));
        result = ((result* 31)+((this.sgbstdnMajrCodeDual == null)? 0 :this.sgbstdnMajrCodeDual.hashCode()));
        result = ((result* 31)+((this.sgbstdnDeptCodeDual == null)? 0 :this.sgbstdnDeptCodeDual.hashCode()));
        result = ((result* 31)+((this.sgbstdnExpGradDate == null)? 0 :this.sgbstdnExpGradDate.hashCode()));
        result = ((result* 31)+((this.sgbstdnAstdCode == null)? 0 :this.sgbstdnAstdCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnCollCodeDual == null)? 0 :this.sgbstdnCollCodeDual.hashCode()));
        result = ((result* 31)+((this.sgbstdnDegcCodeDual == null)? 0 :this.sgbstdnDegcCodeDual.hashCode()));
        result = ((result* 31)+((this.sgbstdnTermCodeGrad == null)? 0 :this.sgbstdnTermCodeGrad.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.sgbstdnTermCodePrev == null)? 0 :this.sgbstdnTermCodePrev.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnLevlCodeDual == null)? 0 :this.sgbstdnLevlCodeDual.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest) == false) {
            return false;
        }
        TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest rhs = ((TestScoreAdministrationTypeAcademicAndGraduationStatusDualDegree100PutRequest) other);
        return (((((((((((((((((this.sgbstdnPrevCode == rhs.sgbstdnPrevCode)||((this.sgbstdnPrevCode!= null)&&this.sgbstdnPrevCode.equals(rhs.sgbstdnPrevCode)))&&((this.sgbstdnCastCode == rhs.sgbstdnCastCode)||((this.sgbstdnCastCode!= null)&&this.sgbstdnCastCode.equals(rhs.sgbstdnCastCode))))&&((this.sgbstdnTermCodeAstd == rhs.sgbstdnTermCodeAstd)||((this.sgbstdnTermCodeAstd!= null)&&this.sgbstdnTermCodeAstd.equals(rhs.sgbstdnTermCodeAstd))))&&((this.sgbstdnTermCodeCast == rhs.sgbstdnTermCodeCast)||((this.sgbstdnTermCodeCast!= null)&&this.sgbstdnTermCodeCast.equals(rhs.sgbstdnTermCodeCast))))&&((this.sgbstdnMajrCodeDual == rhs.sgbstdnMajrCodeDual)||((this.sgbstdnMajrCodeDual!= null)&&this.sgbstdnMajrCodeDual.equals(rhs.sgbstdnMajrCodeDual))))&&((this.sgbstdnDeptCodeDual == rhs.sgbstdnDeptCodeDual)||((this.sgbstdnDeptCodeDual!= null)&&this.sgbstdnDeptCodeDual.equals(rhs.sgbstdnDeptCodeDual))))&&((this.sgbstdnExpGradDate == rhs.sgbstdnExpGradDate)||((this.sgbstdnExpGradDate!= null)&&this.sgbstdnExpGradDate.equals(rhs.sgbstdnExpGradDate))))&&((this.sgbstdnAstdCode == rhs.sgbstdnAstdCode)||((this.sgbstdnAstdCode!= null)&&this.sgbstdnAstdCode.equals(rhs.sgbstdnAstdCode))))&&((this.sgbstdnCollCodeDual == rhs.sgbstdnCollCodeDual)||((this.sgbstdnCollCodeDual!= null)&&this.sgbstdnCollCodeDual.equals(rhs.sgbstdnCollCodeDual))))&&((this.sgbstdnDegcCodeDual == rhs.sgbstdnDegcCodeDual)||((this.sgbstdnDegcCodeDual!= null)&&this.sgbstdnDegcCodeDual.equals(rhs.sgbstdnDegcCodeDual))))&&((this.sgbstdnTermCodeGrad == rhs.sgbstdnTermCodeGrad)||((this.sgbstdnTermCodeGrad!= null)&&this.sgbstdnTermCodeGrad.equals(rhs.sgbstdnTermCodeGrad))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.sgbstdnTermCodePrev == rhs.sgbstdnTermCodePrev)||((this.sgbstdnTermCodePrev!= null)&&this.sgbstdnTermCodePrev.equals(rhs.sgbstdnTermCodePrev))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.sgbstdnLevlCodeDual == rhs.sgbstdnLevlCodeDual)||((this.sgbstdnLevlCodeDual!= null)&&this.sgbstdnLevlCodeDual.equals(rhs.sgbstdnLevlCodeDual))));
    }

}
