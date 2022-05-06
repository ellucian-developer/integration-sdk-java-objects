
package com.ellucian.generated.bpapi.ban.test_score_administration_type_miscellaneous_types.v1_0_0;

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
    "sgbstdnLeavFromDate",
    "sgbstdnGainCode",
    "sgbstdnBsklCode",
    "sgbstdnEdlvCode",
    "sgbstdnEmexCode",
    "sgbstdnAprnCode",
    "sgbstdnLeavToDate",
    "sgbstdnTrcnCode",
    "sgbstdnOrsnCode",
    "sgbstdnEgolCode",
    "sgbstdnVoedCode",
    "sgbstdnPracCode",
    "sgbstdnCaplCode",
    "sgbstdnGradCreditApprInd",
    "id",
    "sgbstdnIncmCode",
    "sgbstdnLeavCode",
    "stvtermTermCode"
})
@Generated("jsonschema2pojo")
public class TestScoreAdministrationTypeMiscellaneousTypes100PutRequest {

    /**
     * From Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("sgbstdnLeavFromDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_FROM_DATE")
    private Date sgbstdnLeavFromDate;
    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("sgbstdnGainCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain")
    private String sgbstdnGainCode;
    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("sgbstdnBsklCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl")
    private String sgbstdnBsklCode;
    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("sgbstdnEdlvCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String sgbstdnEdlvCode;
    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("sgbstdnEmexCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex")
    private String sgbstdnEmexCode;
    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("sgbstdnAprnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn")
    private String sgbstdnAprnCode;
    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("sgbstdnLeavToDate")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_TO_DATE")
    private Date sgbstdnLeavToDate;
    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("sgbstdnTrcnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn")
    private String sgbstdnTrcnCode;
    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("sgbstdnOrsnCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn")
    private String sgbstdnOrsnCode;
    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("sgbstdnEgolCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String sgbstdnEgolCode;
    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("sgbstdnVoedCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed")
    private String sgbstdnVoedCode;
    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("sgbstdnPracCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac")
    private String sgbstdnPracCode;
    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("sgbstdnCaplCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl")
    private String sgbstdnCaplCode;
    /**
     * Graduate Credit Approved
     * <p>
     * Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND
     * 
     */
    @JsonProperty("sgbstdnGradCreditApprInd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND")
    private String sgbstdnGradCreditApprInd;
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
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("sgbstdnIncmCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm")
    private String sgbstdnIncmCode;
    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("sgbstdnLeavCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav")
    private String sgbstdnLeavCode;
    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    @JsonPropertyDescription("Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm")
    private Object stvtermTermCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * From Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("sgbstdnLeavFromDate")
    public Date getSgbstdnLeavFromDate() {
        return sgbstdnLeavFromDate;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_FROM_DATE
     * 
     */
    @JsonProperty("sgbstdnLeavFromDate")
    public void setSgbstdnLeavFromDate(Date sgbstdnLeavFromDate) {
        this.sgbstdnLeavFromDate = sgbstdnLeavFromDate;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnLeavFromDate(Date sgbstdnLeavFromDate) {
        this.sgbstdnLeavFromDate = sgbstdnLeavFromDate;
        return this;
    }

    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("sgbstdnGainCode")
    public String getSgbstdnGainCode() {
        return sgbstdnGainCode;
    }

    /**
     * Employee and Training Code
     * <p>
     * Lineage reference object : SGBSTDN_GAIN_CODE, Lookup lineage reference object : stvgain
     * 
     */
    @JsonProperty("sgbstdnGainCode")
    public void setSgbstdnGainCode(String sgbstdnGainCode) {
        this.sgbstdnGainCode = sgbstdnGainCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnGainCode(String sgbstdnGainCode) {
        this.sgbstdnGainCode = sgbstdnGainCode;
        return this;
    }

    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("sgbstdnBsklCode")
    public String getSgbstdnBsklCode() {
        return sgbstdnBsklCode;
    }

    /**
     * Basic Skills
     * <p>
     * Lineage reference object : SGBSTDN_BSKL_CODE, Lookup lineage reference object : stvbskl
     * 
     */
    @JsonProperty("sgbstdnBsklCode")
    public void setSgbstdnBsklCode(String sgbstdnBsklCode) {
        this.sgbstdnBsklCode = sgbstdnBsklCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnBsklCode(String sgbstdnBsklCode) {
        this.sgbstdnBsklCode = sgbstdnBsklCode;
        return this;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("sgbstdnEdlvCode")
    public String getSgbstdnEdlvCode() {
        return sgbstdnEdlvCode;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("sgbstdnEdlvCode")
    public void setSgbstdnEdlvCode(String sgbstdnEdlvCode) {
        this.sgbstdnEdlvCode = sgbstdnEdlvCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnEdlvCode(String sgbstdnEdlvCode) {
        this.sgbstdnEdlvCode = sgbstdnEdlvCode;
        return this;
    }

    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("sgbstdnEmexCode")
    public String getSgbstdnEmexCode() {
        return sgbstdnEmexCode;
    }

    /**
     * Employment Expectation
     * <p>
     * Lineage reference object : SGBSTDN_EMEX_CODE, Lookup lineage reference object : stvemex
     * 
     */
    @JsonProperty("sgbstdnEmexCode")
    public void setSgbstdnEmexCode(String sgbstdnEmexCode) {
        this.sgbstdnEmexCode = sgbstdnEmexCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnEmexCode(String sgbstdnEmexCode) {
        this.sgbstdnEmexCode = sgbstdnEmexCode;
        return this;
    }

    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("sgbstdnAprnCode")
    public String getSgbstdnAprnCode() {
        return sgbstdnAprnCode;
    }

    /**
     * Apprenticeship Code
     * <p>
     * Lineage reference object : SGBSTDN_APRN_CODE, Lookup lineage reference object : stvaprn
     * 
     */
    @JsonProperty("sgbstdnAprnCode")
    public void setSgbstdnAprnCode(String sgbstdnAprnCode) {
        this.sgbstdnAprnCode = sgbstdnAprnCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnAprnCode(String sgbstdnAprnCode) {
        this.sgbstdnAprnCode = sgbstdnAprnCode;
        return this;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("sgbstdnLeavToDate")
    public Date getSgbstdnLeavToDate() {
        return sgbstdnLeavToDate;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_TO_DATE
     * 
     */
    @JsonProperty("sgbstdnLeavToDate")
    public void setSgbstdnLeavToDate(Date sgbstdnLeavToDate) {
        this.sgbstdnLeavToDate = sgbstdnLeavToDate;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnLeavToDate(Date sgbstdnLeavToDate) {
        this.sgbstdnLeavToDate = sgbstdnLeavToDate;
        return this;
    }

    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("sgbstdnTrcnCode")
    public String getSgbstdnTrcnCode() {
        return sgbstdnTrcnCode;
    }

    /**
     * Transfer Center
     * <p>
     * Lineage reference object : SGBSTDN_TRCN_CODE, Lookup lineage reference object : stvtrcn
     * 
     */
    @JsonProperty("sgbstdnTrcnCode")
    public void setSgbstdnTrcnCode(String sgbstdnTrcnCode) {
        this.sgbstdnTrcnCode = sgbstdnTrcnCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnTrcnCode(String sgbstdnTrcnCode) {
        this.sgbstdnTrcnCode = sgbstdnTrcnCode;
        return this;
    }

    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("sgbstdnOrsnCode")
    public String getSgbstdnOrsnCode() {
        return sgbstdnOrsnCode;
    }

    /**
     * Orientation Session
     * <p>
     * Lineage reference object : SGBSTDN_ORSN_CODE, Lookup lineage reference object : stvorsn
     * 
     */
    @JsonProperty("sgbstdnOrsnCode")
    public void setSgbstdnOrsnCode(String sgbstdnOrsnCode) {
        this.sgbstdnOrsnCode = sgbstdnOrsnCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnOrsnCode(String sgbstdnOrsnCode) {
        this.sgbstdnOrsnCode = sgbstdnOrsnCode;
        return this;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("sgbstdnEgolCode")
    public String getSgbstdnEgolCode() {
        return sgbstdnEgolCode;
    }

    /**
     * Educational Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("sgbstdnEgolCode")
    public void setSgbstdnEgolCode(String sgbstdnEgolCode) {
        this.sgbstdnEgolCode = sgbstdnEgolCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnEgolCode(String sgbstdnEgolCode) {
        this.sgbstdnEgolCode = sgbstdnEgolCode;
        return this;
    }

    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("sgbstdnVoedCode")
    public String getSgbstdnVoedCode() {
        return sgbstdnVoedCode;
    }

    /**
     * Vocational Education
     * <p>
     * Lineage reference object : SGBSTDN_VOED_CODE, Lookup lineage reference object : stvvoed
     * 
     */
    @JsonProperty("sgbstdnVoedCode")
    public void setSgbstdnVoedCode(String sgbstdnVoedCode) {
        this.sgbstdnVoedCode = sgbstdnVoedCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnVoedCode(String sgbstdnVoedCode) {
        this.sgbstdnVoedCode = sgbstdnVoedCode;
        return this;
    }

    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("sgbstdnPracCode")
    public String getSgbstdnPracCode() {
        return sgbstdnPracCode;
    }

    /**
     * Practical Training
     * <p>
     * Lineage reference object : SGBSTDN_PRAC_CODE, Lookup lineage reference object : stvprac
     * 
     */
    @JsonProperty("sgbstdnPracCode")
    public void setSgbstdnPracCode(String sgbstdnPracCode) {
        this.sgbstdnPracCode = sgbstdnPracCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnPracCode(String sgbstdnPracCode) {
        this.sgbstdnPracCode = sgbstdnPracCode;
        return this;
    }

    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("sgbstdnCaplCode")
    public String getSgbstdnCaplCode() {
        return sgbstdnCaplCode;
    }

    /**
     * Career Plan
     * <p>
     * Lineage reference object : SGBSTDN_CAPL_CODE, Lookup lineage reference object : stvcapl
     * 
     */
    @JsonProperty("sgbstdnCaplCode")
    public void setSgbstdnCaplCode(String sgbstdnCaplCode) {
        this.sgbstdnCaplCode = sgbstdnCaplCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnCaplCode(String sgbstdnCaplCode) {
        this.sgbstdnCaplCode = sgbstdnCaplCode;
        return this;
    }

    /**
     * Graduate Credit Approved
     * <p>
     * Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND
     * 
     */
    @JsonProperty("sgbstdnGradCreditApprInd")
    public String getSgbstdnGradCreditApprInd() {
        return sgbstdnGradCreditApprInd;
    }

    /**
     * Graduate Credit Approved
     * <p>
     * Lineage reference object : SGBSTDN_GRAD_CREDIT_APPR_IND
     * 
     */
    @JsonProperty("sgbstdnGradCreditApprInd")
    public void setSgbstdnGradCreditApprInd(String sgbstdnGradCreditApprInd) {
        this.sgbstdnGradCreditApprInd = sgbstdnGradCreditApprInd;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnGradCreditApprInd(String sgbstdnGradCreditApprInd) {
        this.sgbstdnGradCreditApprInd = sgbstdnGradCreditApprInd;
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

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("sgbstdnIncmCode")
    public String getSgbstdnIncmCode() {
        return sgbstdnIncmCode;
    }

    /**
     * Income Range
     * <p>
     * Lineage reference object : SGBSTDN_INCM_CODE, Lookup lineage reference object : stvincm
     * 
     */
    @JsonProperty("sgbstdnIncmCode")
    public void setSgbstdnIncmCode(String sgbstdnIncmCode) {
        this.sgbstdnIncmCode = sgbstdnIncmCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnIncmCode(String sgbstdnIncmCode) {
        this.sgbstdnIncmCode = sgbstdnIncmCode;
        return this;
    }

    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("sgbstdnLeavCode")
    public String getSgbstdnLeavCode() {
        return sgbstdnLeavCode;
    }

    /**
     * Leave of Absence
     * <p>
     * Lineage reference object : SGBSTDN_LEAV_CODE, Lookup lineage reference object : stvleav
     * 
     */
    @JsonProperty("sgbstdnLeavCode")
    public void setSgbstdnLeavCode(String sgbstdnLeavCode) {
        this.sgbstdnLeavCode = sgbstdnLeavCode;
    }

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withSgbstdnLeavCode(String sgbstdnLeavCode) {
        this.sgbstdnLeavCode = sgbstdnLeavCode;
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

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
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

    public TestScoreAdministrationTypeMiscellaneousTypes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreAdministrationTypeMiscellaneousTypes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgbstdnLeavFromDate");
        sb.append('=');
        sb.append(((this.sgbstdnLeavFromDate == null)?"<null>":this.sgbstdnLeavFromDate));
        sb.append(',');
        sb.append("sgbstdnGainCode");
        sb.append('=');
        sb.append(((this.sgbstdnGainCode == null)?"<null>":this.sgbstdnGainCode));
        sb.append(',');
        sb.append("sgbstdnBsklCode");
        sb.append('=');
        sb.append(((this.sgbstdnBsklCode == null)?"<null>":this.sgbstdnBsklCode));
        sb.append(',');
        sb.append("sgbstdnEdlvCode");
        sb.append('=');
        sb.append(((this.sgbstdnEdlvCode == null)?"<null>":this.sgbstdnEdlvCode));
        sb.append(',');
        sb.append("sgbstdnEmexCode");
        sb.append('=');
        sb.append(((this.sgbstdnEmexCode == null)?"<null>":this.sgbstdnEmexCode));
        sb.append(',');
        sb.append("sgbstdnAprnCode");
        sb.append('=');
        sb.append(((this.sgbstdnAprnCode == null)?"<null>":this.sgbstdnAprnCode));
        sb.append(',');
        sb.append("sgbstdnLeavToDate");
        sb.append('=');
        sb.append(((this.sgbstdnLeavToDate == null)?"<null>":this.sgbstdnLeavToDate));
        sb.append(',');
        sb.append("sgbstdnTrcnCode");
        sb.append('=');
        sb.append(((this.sgbstdnTrcnCode == null)?"<null>":this.sgbstdnTrcnCode));
        sb.append(',');
        sb.append("sgbstdnOrsnCode");
        sb.append('=');
        sb.append(((this.sgbstdnOrsnCode == null)?"<null>":this.sgbstdnOrsnCode));
        sb.append(',');
        sb.append("sgbstdnEgolCode");
        sb.append('=');
        sb.append(((this.sgbstdnEgolCode == null)?"<null>":this.sgbstdnEgolCode));
        sb.append(',');
        sb.append("sgbstdnVoedCode");
        sb.append('=');
        sb.append(((this.sgbstdnVoedCode == null)?"<null>":this.sgbstdnVoedCode));
        sb.append(',');
        sb.append("sgbstdnPracCode");
        sb.append('=');
        sb.append(((this.sgbstdnPracCode == null)?"<null>":this.sgbstdnPracCode));
        sb.append(',');
        sb.append("sgbstdnCaplCode");
        sb.append('=');
        sb.append(((this.sgbstdnCaplCode == null)?"<null>":this.sgbstdnCaplCode));
        sb.append(',');
        sb.append("sgbstdnGradCreditApprInd");
        sb.append('=');
        sb.append(((this.sgbstdnGradCreditApprInd == null)?"<null>":this.sgbstdnGradCreditApprInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sgbstdnIncmCode");
        sb.append('=');
        sb.append(((this.sgbstdnIncmCode == null)?"<null>":this.sgbstdnIncmCode));
        sb.append(',');
        sb.append("sgbstdnLeavCode");
        sb.append('=');
        sb.append(((this.sgbstdnLeavCode == null)?"<null>":this.sgbstdnLeavCode));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
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
        result = ((result* 31)+((this.sgbstdnLeavFromDate == null)? 0 :this.sgbstdnLeavFromDate.hashCode()));
        result = ((result* 31)+((this.sgbstdnGainCode == null)? 0 :this.sgbstdnGainCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnBsklCode == null)? 0 :this.sgbstdnBsklCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnEdlvCode == null)? 0 :this.sgbstdnEdlvCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnEmexCode == null)? 0 :this.sgbstdnEmexCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnAprnCode == null)? 0 :this.sgbstdnAprnCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnLeavToDate == null)? 0 :this.sgbstdnLeavToDate.hashCode()));
        result = ((result* 31)+((this.sgbstdnTrcnCode == null)? 0 :this.sgbstdnTrcnCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnOrsnCode == null)? 0 :this.sgbstdnOrsnCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnEgolCode == null)? 0 :this.sgbstdnEgolCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnVoedCode == null)? 0 :this.sgbstdnVoedCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnPracCode == null)? 0 :this.sgbstdnPracCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnCaplCode == null)? 0 :this.sgbstdnCaplCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnGradCreditApprInd == null)? 0 :this.sgbstdnGradCreditApprInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.sgbstdnIncmCode == null)? 0 :this.sgbstdnIncmCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnLeavCode == null)? 0 :this.sgbstdnLeavCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreAdministrationTypeMiscellaneousTypes100PutRequest) == false) {
            return false;
        }
        TestScoreAdministrationTypeMiscellaneousTypes100PutRequest rhs = ((TestScoreAdministrationTypeMiscellaneousTypes100PutRequest) other);
        return ((((((((((((((((((((this.sgbstdnLeavFromDate == rhs.sgbstdnLeavFromDate)||((this.sgbstdnLeavFromDate!= null)&&this.sgbstdnLeavFromDate.equals(rhs.sgbstdnLeavFromDate)))&&((this.sgbstdnGainCode == rhs.sgbstdnGainCode)||((this.sgbstdnGainCode!= null)&&this.sgbstdnGainCode.equals(rhs.sgbstdnGainCode))))&&((this.sgbstdnBsklCode == rhs.sgbstdnBsklCode)||((this.sgbstdnBsklCode!= null)&&this.sgbstdnBsklCode.equals(rhs.sgbstdnBsklCode))))&&((this.sgbstdnEdlvCode == rhs.sgbstdnEdlvCode)||((this.sgbstdnEdlvCode!= null)&&this.sgbstdnEdlvCode.equals(rhs.sgbstdnEdlvCode))))&&((this.sgbstdnEmexCode == rhs.sgbstdnEmexCode)||((this.sgbstdnEmexCode!= null)&&this.sgbstdnEmexCode.equals(rhs.sgbstdnEmexCode))))&&((this.sgbstdnAprnCode == rhs.sgbstdnAprnCode)||((this.sgbstdnAprnCode!= null)&&this.sgbstdnAprnCode.equals(rhs.sgbstdnAprnCode))))&&((this.sgbstdnLeavToDate == rhs.sgbstdnLeavToDate)||((this.sgbstdnLeavToDate!= null)&&this.sgbstdnLeavToDate.equals(rhs.sgbstdnLeavToDate))))&&((this.sgbstdnTrcnCode == rhs.sgbstdnTrcnCode)||((this.sgbstdnTrcnCode!= null)&&this.sgbstdnTrcnCode.equals(rhs.sgbstdnTrcnCode))))&&((this.sgbstdnOrsnCode == rhs.sgbstdnOrsnCode)||((this.sgbstdnOrsnCode!= null)&&this.sgbstdnOrsnCode.equals(rhs.sgbstdnOrsnCode))))&&((this.sgbstdnEgolCode == rhs.sgbstdnEgolCode)||((this.sgbstdnEgolCode!= null)&&this.sgbstdnEgolCode.equals(rhs.sgbstdnEgolCode))))&&((this.sgbstdnVoedCode == rhs.sgbstdnVoedCode)||((this.sgbstdnVoedCode!= null)&&this.sgbstdnVoedCode.equals(rhs.sgbstdnVoedCode))))&&((this.sgbstdnPracCode == rhs.sgbstdnPracCode)||((this.sgbstdnPracCode!= null)&&this.sgbstdnPracCode.equals(rhs.sgbstdnPracCode))))&&((this.sgbstdnCaplCode == rhs.sgbstdnCaplCode)||((this.sgbstdnCaplCode!= null)&&this.sgbstdnCaplCode.equals(rhs.sgbstdnCaplCode))))&&((this.sgbstdnGradCreditApprInd == rhs.sgbstdnGradCreditApprInd)||((this.sgbstdnGradCreditApprInd!= null)&&this.sgbstdnGradCreditApprInd.equals(rhs.sgbstdnGradCreditApprInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.sgbstdnIncmCode == rhs.sgbstdnIncmCode)||((this.sgbstdnIncmCode!= null)&&this.sgbstdnIncmCode.equals(rhs.sgbstdnIncmCode))))&&((this.sgbstdnLeavCode == rhs.sgbstdnLeavCode)||((this.sgbstdnLeavCode!= null)&&this.sgbstdnLeavCode.equals(rhs.sgbstdnLeavCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))));
    }

}
