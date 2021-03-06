
package com.ellucian.generated.bpapi.ban.registration_fee_assessment_rules.v1_0_0;

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
    "ruleType",
    "entryType",
    "setCopyIndEnMassInd",
    "sfrrgfeEntryType",
    "copyInd",
    "seqno",
    "detlCode",
    "tbbdetcDcatCode",
    "perCredCharge",
    "minCharge",
    "maxCharge",
    "crseWaivInd",
    "campCodeCrse",
    "levlCodeCrse",
    "attrCodeCrse",
    "levlCode",
    "termCodeAdmit",
    "lfstPrimSecCde",
    "campCode",
    "primSecCde",
    "stypCodeCurric",
    "collCode",
    "lfstCode",
    "rateCodeCurric",
    "degcCode",
    "majrCode",
    "stspResdCode",
    "program",
    "deptCode",
    "stspSessCode",
    "activityDate",
    "userId"
})
@Generated("jsonschema2pojo")
public class RegistrationFeeAssessmentRules100QapiPost {

    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("ruleType")
    private String ruleType;
    /**
     * Type
     * <p>
     * Lineage reference object : SFRRGFE_ENTRY_TYPE
     * 
     */
    @JsonProperty("entryType")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ENTRY_TYPE")
    private String entryType;
    @JsonProperty("setCopyIndEnMassInd")
    private String setCopyIndEnMassInd;
    @JsonProperty("sfrrgfeEntryType")
    private String sfrrgfeEntryType;
    /**
     * Lineage reference object : SFRRGFE_COPY_IND
     * 
     */
    @JsonProperty("copyInd")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_COPY_IND")
    private String copyInd;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRGFE_SEQNO
     * 
     */
    @JsonProperty("seqno")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_SEQNO")
    private Double seqno;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detlCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc")
    private String detlCode;
    /**
     * Category Code
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcDcatCode")
    private String tbbdetcDcatCode;
    /**
     * Per Credit Charge
     * <p>
     * Lineage reference object : SFRRGFE_PER_CRED_CHARGE
     * 
     */
    @JsonProperty("perCredCharge")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PER_CRED_CHARGE")
    private Double perCredCharge;
    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MIN_CHARGE
     * 
     */
    @JsonProperty("minCharge")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_MIN_CHARGE")
    private Double minCharge;
    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MAX_CHARGE
     * 
     */
    @JsonProperty("maxCharge")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_MAX_CHARGE")
    private Double maxCharge;
    /**
     * Lineage reference object : SFRRGFE_CRSE_WAIV_IND
     * 
     */
    @JsonProperty("crseWaivInd")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CRSE_WAIV_IND")
    private String crseWaivInd;
    /**
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp")
    private String campCodeCrse;
    /**
     * Course Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl")
    private String levlCodeCrse;
    /**
     * Course Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeCrse")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr")
    private String attrCodeCrse;
    /**
     * Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Admission Term
     * <p>
     * Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm")
    private String termCodeAdmit;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("lfstPrimSecCde")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE")
    private String lfstPrimSecCde;
    /**
     * Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRRGFE_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PRIM_SEC_CDE")
    private String primSecCde;
    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCodeCurric")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp")
    private String stypCodeCurric;
    /**
     * College
     * <p>
     * Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String lfstCode;
    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCodeCurric")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate")
    private String rateCodeCurric;
    /**
     * Degree
     * <p>
     * Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr")
    private String majrCode;
    @JsonProperty("stspResdCode")
    private String stspResdCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonProperty("stspSessCode")
    private String stspSessCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRGFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRGFE_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SFRRGFE_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("ruleType")
    public String getRuleType() {
        return ruleType;
    }

    @JsonProperty("ruleType")
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public RegistrationFeeAssessmentRules100QapiPost withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SFRRGFE_ENTRY_TYPE
     * 
     */
    @JsonProperty("entryType")
    public String getEntryType() {
        return entryType;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SFRRGFE_ENTRY_TYPE
     * 
     */
    @JsonProperty("entryType")
    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public RegistrationFeeAssessmentRules100QapiPost withEntryType(String entryType) {
        this.entryType = entryType;
        return this;
    }

    @JsonProperty("setCopyIndEnMassInd")
    public String getSetCopyIndEnMassInd() {
        return setCopyIndEnMassInd;
    }

    @JsonProperty("setCopyIndEnMassInd")
    public void setSetCopyIndEnMassInd(String setCopyIndEnMassInd) {
        this.setCopyIndEnMassInd = setCopyIndEnMassInd;
    }

    public RegistrationFeeAssessmentRules100QapiPost withSetCopyIndEnMassInd(String setCopyIndEnMassInd) {
        this.setCopyIndEnMassInd = setCopyIndEnMassInd;
        return this;
    }

    @JsonProperty("sfrrgfeEntryType")
    public String getSfrrgfeEntryType() {
        return sfrrgfeEntryType;
    }

    @JsonProperty("sfrrgfeEntryType")
    public void setSfrrgfeEntryType(String sfrrgfeEntryType) {
        this.sfrrgfeEntryType = sfrrgfeEntryType;
    }

    public RegistrationFeeAssessmentRules100QapiPost withSfrrgfeEntryType(String sfrrgfeEntryType) {
        this.sfrrgfeEntryType = sfrrgfeEntryType;
        return this;
    }

    /**
     * Lineage reference object : SFRRGFE_COPY_IND
     * 
     */
    @JsonProperty("copyInd")
    public String getCopyInd() {
        return copyInd;
    }

    /**
     * Lineage reference object : SFRRGFE_COPY_IND
     * 
     */
    @JsonProperty("copyInd")
    public void setCopyInd(String copyInd) {
        this.copyInd = copyInd;
    }

    public RegistrationFeeAssessmentRules100QapiPost withCopyInd(String copyInd) {
        this.copyInd = copyInd;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRGFE_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public Double getSeqno() {
        return seqno;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRRGFE_SEQNO
     * 
     */
    @JsonProperty("seqno")
    public void setSeqno(Double seqno) {
        this.seqno = seqno;
    }

    public RegistrationFeeAssessmentRules100QapiPost withSeqno(Double seqno) {
        this.seqno = seqno;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detlCode")
    public String getDetlCode() {
        return detlCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SFRRGFE_DETL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detlCode")
    public void setDetlCode(String detlCode) {
        this.detlCode = detlCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withDetlCode(String detlCode) {
        this.detlCode = detlCode;
        return this;
    }

    /**
     * Category Code
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcDcatCode")
    public String getTbbdetcDcatCode() {
        return tbbdetcDcatCode;
    }

    /**
     * Category Code
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcDcatCode")
    public void setTbbdetcDcatCode(String tbbdetcDcatCode) {
        this.tbbdetcDcatCode = tbbdetcDcatCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withTbbdetcDcatCode(String tbbdetcDcatCode) {
        this.tbbdetcDcatCode = tbbdetcDcatCode;
        return this;
    }

    /**
     * Per Credit Charge
     * <p>
     * Lineage reference object : SFRRGFE_PER_CRED_CHARGE
     * 
     */
    @JsonProperty("perCredCharge")
    public Double getPerCredCharge() {
        return perCredCharge;
    }

    /**
     * Per Credit Charge
     * <p>
     * Lineage reference object : SFRRGFE_PER_CRED_CHARGE
     * 
     */
    @JsonProperty("perCredCharge")
    public void setPerCredCharge(Double perCredCharge) {
        this.perCredCharge = perCredCharge;
    }

    public RegistrationFeeAssessmentRules100QapiPost withPerCredCharge(Double perCredCharge) {
        this.perCredCharge = perCredCharge;
        return this;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MIN_CHARGE
     * 
     */
    @JsonProperty("minCharge")
    public Double getMinCharge() {
        return minCharge;
    }

    /**
     * Minimum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MIN_CHARGE
     * 
     */
    @JsonProperty("minCharge")
    public void setMinCharge(Double minCharge) {
        this.minCharge = minCharge;
    }

    public RegistrationFeeAssessmentRules100QapiPost withMinCharge(Double minCharge) {
        this.minCharge = minCharge;
        return this;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MAX_CHARGE
     * 
     */
    @JsonProperty("maxCharge")
    public Double getMaxCharge() {
        return maxCharge;
    }

    /**
     * Maximum Charge
     * <p>
     * Lineage reference object : SFRRGFE_MAX_CHARGE
     * 
     */
    @JsonProperty("maxCharge")
    public void setMaxCharge(Double maxCharge) {
        this.maxCharge = maxCharge;
    }

    public RegistrationFeeAssessmentRules100QapiPost withMaxCharge(Double maxCharge) {
        this.maxCharge = maxCharge;
        return this;
    }

    /**
     * Lineage reference object : SFRRGFE_CRSE_WAIV_IND
     * 
     */
    @JsonProperty("crseWaivInd")
    public String getCrseWaivInd() {
        return crseWaivInd;
    }

    /**
     * Lineage reference object : SFRRGFE_CRSE_WAIV_IND
     * 
     */
    @JsonProperty("crseWaivInd")
    public void setCrseWaivInd(String crseWaivInd) {
        this.crseWaivInd = crseWaivInd;
    }

    public RegistrationFeeAssessmentRules100QapiPost withCrseWaivInd(String crseWaivInd) {
        this.crseWaivInd = crseWaivInd;
        return this;
    }

    /**
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCodeCrse")
    public String getCampCodeCrse() {
        return campCodeCrse;
    }

    /**
     * Course   Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE_CRSE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCodeCrse")
    public void setCampCodeCrse(String campCodeCrse) {
        this.campCodeCrse = campCodeCrse;
    }

    public RegistrationFeeAssessmentRules100QapiPost withCampCodeCrse(String campCodeCrse) {
        this.campCodeCrse = campCodeCrse;
        return this;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeCrse")
    public String getLevlCodeCrse() {
        return levlCodeCrse;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE_CRSE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCodeCrse")
    public void setLevlCodeCrse(String levlCodeCrse) {
        this.levlCodeCrse = levlCodeCrse;
    }

    public RegistrationFeeAssessmentRules100QapiPost withLevlCodeCrse(String levlCodeCrse) {
        this.levlCodeCrse = levlCodeCrse;
        return this;
    }

    /**
     * Course Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeCrse")
    public String getAttrCodeCrse() {
        return attrCodeCrse;
    }

    /**
     * Course Attribute
     * <p>
     * Lineage reference object : SFRRGFE_ATTR_CODE_CRSE, Lookup lineage reference object : stvattr
     * 
     */
    @JsonProperty("attrCodeCrse")
    public void setAttrCodeCrse(String attrCodeCrse) {
        this.attrCodeCrse = attrCodeCrse;
    }

    public RegistrationFeeAssessmentRules100QapiPost withAttrCodeCrse(String attrCodeCrse) {
        this.attrCodeCrse = attrCodeCrse;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRRGFE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public String getTermCodeAdmit() {
        return termCodeAdmit;
    }

    /**
     * Admission Term
     * <p>
     * Lineage reference object : SFRRGFE_TERM_CODE_ADMIT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeAdmit")
    public void setTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
    }

    public RegistrationFeeAssessmentRules100QapiPost withTermCodeAdmit(String termCodeAdmit) {
        this.termCodeAdmit = termCodeAdmit;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("lfstPrimSecCde")
    public String getLfstPrimSecCde() {
        return lfstPrimSecCde;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRRGFE_LFST_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("lfstPrimSecCde")
    public void setLfstPrimSecCde(String lfstPrimSecCde) {
        this.lfstPrimSecCde = lfstPrimSecCde;
    }

    public RegistrationFeeAssessmentRules100QapiPost withLfstPrimSecCde(String lfstPrimSecCde) {
        this.lfstPrimSecCde = lfstPrimSecCde;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRRGFE_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRRGFE_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public String getPrimSecCde() {
        return primSecCde;
    }

    /**
     * Curricula
     * <p>
     * Lineage reference object : SFRRGFE_PRIM_SEC_CDE
     * 
     */
    @JsonProperty("primSecCde")
    public void setPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
    }

    public RegistrationFeeAssessmentRules100QapiPost withPrimSecCde(String primSecCde) {
        this.primSecCde = primSecCde;
        return this;
    }

    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCodeCurric")
    public String getStypCodeCurric() {
        return stypCodeCurric;
    }

    /**
     * Curricula Student Type
     * <p>
     * Lineage reference object : SFRRGFE_STYP_CODE_CURRIC, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCodeCurric")
    public void setStypCodeCurric(String stypCodeCurric) {
        this.stypCodeCurric = stypCodeCurric;
    }

    public RegistrationFeeAssessmentRules100QapiPost withStypCodeCurric(String stypCodeCurric) {
        this.stypCodeCurric = stypCodeCurric;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRRGFE_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public String getLfstCode() {
        return lfstCode;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : SFRRGFE_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public void setLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCodeCurric")
    public String getRateCodeCurric() {
        return rateCodeCurric;
    }

    /**
     * Curricula Rate
     * <p>
     * Lineage reference object : SFRRGFE_RATE_CODE_CURRIC, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCodeCurric")
    public void setRateCodeCurric(String rateCodeCurric) {
        this.rateCodeCurric = rateCodeCurric;
    }

    public RegistrationFeeAssessmentRules100QapiPost withRateCodeCurric(String rateCodeCurric) {
        this.rateCodeCurric = rateCodeCurric;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRRGFE_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : SFRRGFE_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    @JsonProperty("stspResdCode")
    public String getStspResdCode() {
        return stspResdCode;
    }

    @JsonProperty("stspResdCode")
    public void setStspResdCode(String stspResdCode) {
        this.stspResdCode = stspResdCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withStspResdCode(String stspResdCode) {
        this.stspResdCode = stspResdCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRRGFE_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public RegistrationFeeAssessmentRules100QapiPost withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRRGFE_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    @JsonProperty("stspSessCode")
    public String getStspSessCode() {
        return stspSessCode;
    }

    @JsonProperty("stspSessCode")
    public void setStspSessCode(String stspSessCode) {
        this.stspSessCode = stspSessCode;
    }

    public RegistrationFeeAssessmentRules100QapiPost withStspSessCode(String stspSessCode) {
        this.stspSessCode = stspSessCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRGFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRRGFE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RegistrationFeeAssessmentRules100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRGFE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SFRRGFE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RegistrationFeeAssessmentRules100QapiPost withUserId(String userId) {
        this.userId = userId;
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

    public RegistrationFeeAssessmentRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationFeeAssessmentRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("ruleType");
        sb.append('=');
        sb.append(((this.ruleType == null)?"<null>":this.ruleType));
        sb.append(',');
        sb.append("entryType");
        sb.append('=');
        sb.append(((this.entryType == null)?"<null>":this.entryType));
        sb.append(',');
        sb.append("setCopyIndEnMassInd");
        sb.append('=');
        sb.append(((this.setCopyIndEnMassInd == null)?"<null>":this.setCopyIndEnMassInd));
        sb.append(',');
        sb.append("sfrrgfeEntryType");
        sb.append('=');
        sb.append(((this.sfrrgfeEntryType == null)?"<null>":this.sfrrgfeEntryType));
        sb.append(',');
        sb.append("copyInd");
        sb.append('=');
        sb.append(((this.copyInd == null)?"<null>":this.copyInd));
        sb.append(',');
        sb.append("seqno");
        sb.append('=');
        sb.append(((this.seqno == null)?"<null>":this.seqno));
        sb.append(',');
        sb.append("detlCode");
        sb.append('=');
        sb.append(((this.detlCode == null)?"<null>":this.detlCode));
        sb.append(',');
        sb.append("tbbdetcDcatCode");
        sb.append('=');
        sb.append(((this.tbbdetcDcatCode == null)?"<null>":this.tbbdetcDcatCode));
        sb.append(',');
        sb.append("perCredCharge");
        sb.append('=');
        sb.append(((this.perCredCharge == null)?"<null>":this.perCredCharge));
        sb.append(',');
        sb.append("minCharge");
        sb.append('=');
        sb.append(((this.minCharge == null)?"<null>":this.minCharge));
        sb.append(',');
        sb.append("maxCharge");
        sb.append('=');
        sb.append(((this.maxCharge == null)?"<null>":this.maxCharge));
        sb.append(',');
        sb.append("crseWaivInd");
        sb.append('=');
        sb.append(((this.crseWaivInd == null)?"<null>":this.crseWaivInd));
        sb.append(',');
        sb.append("campCodeCrse");
        sb.append('=');
        sb.append(((this.campCodeCrse == null)?"<null>":this.campCodeCrse));
        sb.append(',');
        sb.append("levlCodeCrse");
        sb.append('=');
        sb.append(((this.levlCodeCrse == null)?"<null>":this.levlCodeCrse));
        sb.append(',');
        sb.append("attrCodeCrse");
        sb.append('=');
        sb.append(((this.attrCodeCrse == null)?"<null>":this.attrCodeCrse));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("termCodeAdmit");
        sb.append('=');
        sb.append(((this.termCodeAdmit == null)?"<null>":this.termCodeAdmit));
        sb.append(',');
        sb.append("lfstPrimSecCde");
        sb.append('=');
        sb.append(((this.lfstPrimSecCde == null)?"<null>":this.lfstPrimSecCde));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("primSecCde");
        sb.append('=');
        sb.append(((this.primSecCde == null)?"<null>":this.primSecCde));
        sb.append(',');
        sb.append("stypCodeCurric");
        sb.append('=');
        sb.append(((this.stypCodeCurric == null)?"<null>":this.stypCodeCurric));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("rateCodeCurric");
        sb.append('=');
        sb.append(((this.rateCodeCurric == null)?"<null>":this.rateCodeCurric));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("stspResdCode");
        sb.append('=');
        sb.append(((this.stspResdCode == null)?"<null>":this.stspResdCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("stspSessCode");
        sb.append('=');
        sb.append(((this.stspSessCode == null)?"<null>":this.stspSessCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.stypCodeCurric == null)? 0 :this.stypCodeCurric.hashCode()));
        result = ((result* 31)+((this.primSecCde == null)? 0 :this.primSecCde.hashCode()));
        result = ((result* 31)+((this.detlCode == null)? 0 :this.detlCode.hashCode()));
        result = ((result* 31)+((this.campCodeCrse == null)? 0 :this.campCodeCrse.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.minCharge == null)? 0 :this.minCharge.hashCode()));
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.rateCodeCurric == null)? 0 :this.rateCodeCurric.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.ruleType == null)? 0 :this.ruleType.hashCode()));
        result = ((result* 31)+((this.sfrrgfeEntryType == null)? 0 :this.sfrrgfeEntryType.hashCode()));
        result = ((result* 31)+((this.attrCodeCrse == null)? 0 :this.attrCodeCrse.hashCode()));
        result = ((result* 31)+((this.crseWaivInd == null)? 0 :this.crseWaivInd.hashCode()));
        result = ((result* 31)+((this.stspResdCode == null)? 0 :this.stspResdCode.hashCode()));
        result = ((result* 31)+((this.entryType == null)? 0 :this.entryType.hashCode()));
        result = ((result* 31)+((this.seqno == null)? 0 :this.seqno.hashCode()));
        result = ((result* 31)+((this.maxCharge == null)? 0 :this.maxCharge.hashCode()));
        result = ((result* 31)+((this.levlCodeCrse == null)? 0 :this.levlCodeCrse.hashCode()));
        result = ((result* 31)+((this.perCredCharge == null)? 0 :this.perCredCharge.hashCode()));
        result = ((result* 31)+((this.setCopyIndEnMassInd == null)? 0 :this.setCopyIndEnMassInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.termCodeAdmit == null)? 0 :this.termCodeAdmit.hashCode()));
        result = ((result* 31)+((this.lfstPrimSecCde == null)? 0 :this.lfstPrimSecCde.hashCode()));
        result = ((result* 31)+((this.stspSessCode == null)? 0 :this.stspSessCode.hashCode()));
        result = ((result* 31)+((this.tbbdetcDcatCode == null)? 0 :this.tbbdetcDcatCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.copyInd == null)? 0 :this.copyInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationFeeAssessmentRules100QapiPost) == false) {
            return false;
        }
        RegistrationFeeAssessmentRules100QapiPost rhs = ((RegistrationFeeAssessmentRules100QapiPost) other);
        return (((((((((((((((((((((((((((((((((((this.stypCodeCurric == rhs.stypCodeCurric)||((this.stypCodeCurric!= null)&&this.stypCodeCurric.equals(rhs.stypCodeCurric)))&&((this.primSecCde == rhs.primSecCde)||((this.primSecCde!= null)&&this.primSecCde.equals(rhs.primSecCde))))&&((this.detlCode == rhs.detlCode)||((this.detlCode!= null)&&this.detlCode.equals(rhs.detlCode))))&&((this.campCodeCrse == rhs.campCodeCrse)||((this.campCodeCrse!= null)&&this.campCodeCrse.equals(rhs.campCodeCrse))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.minCharge == rhs.minCharge)||((this.minCharge!= null)&&this.minCharge.equals(rhs.minCharge))))&&((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.rateCodeCurric == rhs.rateCodeCurric)||((this.rateCodeCurric!= null)&&this.rateCodeCurric.equals(rhs.rateCodeCurric))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.ruleType == rhs.ruleType)||((this.ruleType!= null)&&this.ruleType.equals(rhs.ruleType))))&&((this.sfrrgfeEntryType == rhs.sfrrgfeEntryType)||((this.sfrrgfeEntryType!= null)&&this.sfrrgfeEntryType.equals(rhs.sfrrgfeEntryType))))&&((this.attrCodeCrse == rhs.attrCodeCrse)||((this.attrCodeCrse!= null)&&this.attrCodeCrse.equals(rhs.attrCodeCrse))))&&((this.crseWaivInd == rhs.crseWaivInd)||((this.crseWaivInd!= null)&&this.crseWaivInd.equals(rhs.crseWaivInd))))&&((this.stspResdCode == rhs.stspResdCode)||((this.stspResdCode!= null)&&this.stspResdCode.equals(rhs.stspResdCode))))&&((this.entryType == rhs.entryType)||((this.entryType!= null)&&this.entryType.equals(rhs.entryType))))&&((this.seqno == rhs.seqno)||((this.seqno!= null)&&this.seqno.equals(rhs.seqno))))&&((this.maxCharge == rhs.maxCharge)||((this.maxCharge!= null)&&this.maxCharge.equals(rhs.maxCharge))))&&((this.levlCodeCrse == rhs.levlCodeCrse)||((this.levlCodeCrse!= null)&&this.levlCodeCrse.equals(rhs.levlCodeCrse))))&&((this.perCredCharge == rhs.perCredCharge)||((this.perCredCharge!= null)&&this.perCredCharge.equals(rhs.perCredCharge))))&&((this.setCopyIndEnMassInd == rhs.setCopyIndEnMassInd)||((this.setCopyIndEnMassInd!= null)&&this.setCopyIndEnMassInd.equals(rhs.setCopyIndEnMassInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.termCodeAdmit == rhs.termCodeAdmit)||((this.termCodeAdmit!= null)&&this.termCodeAdmit.equals(rhs.termCodeAdmit))))&&((this.lfstPrimSecCde == rhs.lfstPrimSecCde)||((this.lfstPrimSecCde!= null)&&this.lfstPrimSecCde.equals(rhs.lfstPrimSecCde))))&&((this.stspSessCode == rhs.stspSessCode)||((this.stspSessCode!= null)&&this.stspSessCode.equals(rhs.stspSessCode))))&&((this.tbbdetcDcatCode == rhs.tbbdetcDcatCode)||((this.tbbdetcDcatCode!= null)&&this.tbbdetcDcatCode.equals(rhs.tbbdetcDcatCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.copyInd == rhs.copyInd)||((this.copyInd!= null)&&this.copyInd.equals(rhs.copyInd))));
    }

}
