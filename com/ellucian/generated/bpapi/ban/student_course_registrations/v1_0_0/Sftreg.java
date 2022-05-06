
package com.ellucian.generated.bpapi.ban.student_course_registrations.v1_0_0;

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
    "attemptHr",
    "gmodCode",
    "stspKeySequence",
    "billHr",
    "creditHr",
    "ssbsectSeqNumb",
    "apprReceivedInd",
    "rwoverride",
    "frDiscountCrnDisplay",
    "ssbsectSubjCode",
    "tmstHr",
    "ssbsectCrseNumb",
    "ptrmCode",
    "errorFlagDisplay",
    "rstsCode",
    "campCode",
    "vrStatusTypeDisplay",
    "ssbsectInsmCode",
    "crn",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class Sftreg {

    /**
     * Attempted Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("attemptHr")
    private Double attemptHr;
    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFTREGS_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * (Required)
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod")
    private String gmodCode;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SFTREGS_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,stvcast,stvastd,stvests,sfrensp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,stvcast,stvastd,stvests,sfrensp,sgrstsp")
    private Double stspKeySequence;
    /**
     * Bill Hours
     * <p>
     * Lineage reference object : SFTREGS_BILL_HR
     * (Required)
     * 
     */
    @JsonProperty("billHr")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_BILL_HR")
    private Double billHr;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SFTREGS_CREDIT_HR
     * (Required)
     * 
     */
    @JsonProperty("creditHr")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_CREDIT_HR")
    private Double creditHr;
    /**
     * Section
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    private String ssbsectSeqNumb;
    /**
     * Lineage reference object : SFTREGS_APPR_RECEIVED_IND
     * 
     */
    @JsonProperty("apprReceivedInd")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_APPR_RECEIVED_IND")
    private String apprReceivedInd;
    @JsonProperty("rwoverride")
    private String rwoverride;
    @JsonProperty("frDiscountCrnDisplay")
    private String frDiscountCrnDisplay;
    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvsubj")
    private String ssbsectSubjCode;
    /**
     * Time Status Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("tmstHr")
    private Double tmstHr;
    /**
     * Course
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    private String ssbsectCrseNumb;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SFTREGS_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
    /**
     * Error Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("errorFlagDisplay")
    private String errorFlagDisplay;
    /**
     * Status
     * <p>
     * Lineage reference object : SFTREGS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * (Required)
     * 
     */
    @JsonProperty("rstsCode")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_RSTS_CODE, Lookup lineage reference object : stvrsts")
    private String rstsCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SFTREGS_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Status Type
     * <p>
     * 
     * 
     */
    @JsonProperty("vrStatusTypeDisplay")
    private String vrStatusTypeDisplay;
    /**
     * Method of Instruction
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectInsmCode")
    private String ssbsectInsmCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : SFTREGS_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_CRN")
    private String crn;
    /**
     * Level
     * <p>
     * Lineage reference object : SFTREGS_LEVL_CODE, Lookup lineage reference object : stvlevl,scrlevl,scrlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SFTREGS_LEVL_CODE, Lookup lineage reference object : stvlevl,scrlevl,scrlevl")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attempted Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("attemptHr")
    public Double getAttemptHr() {
        return attemptHr;
    }

    /**
     * Attempted Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("attemptHr")
    public void setAttemptHr(Double attemptHr) {
        this.attemptHr = attemptHr;
    }

    public Sftreg withAttemptHr(Double attemptHr) {
        this.attemptHr = attemptHr;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFTREGS_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * (Required)
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFTREGS_GMOD_CODE, Lookup lineage reference object : stvgmod,scrgmod,scrgmod
     * (Required)
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public Sftreg withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SFTREGS_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,stvcast,stvastd,stvests,sfrensp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SFTREGS_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,stvcast,stvastd,stvests,sfrensp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Sftreg withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Bill Hours
     * <p>
     * Lineage reference object : SFTREGS_BILL_HR
     * (Required)
     * 
     */
    @JsonProperty("billHr")
    public Double getBillHr() {
        return billHr;
    }

    /**
     * Bill Hours
     * <p>
     * Lineage reference object : SFTREGS_BILL_HR
     * (Required)
     * 
     */
    @JsonProperty("billHr")
    public void setBillHr(Double billHr) {
        this.billHr = billHr;
    }

    public Sftreg withBillHr(Double billHr) {
        this.billHr = billHr;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SFTREGS_CREDIT_HR
     * (Required)
     * 
     */
    @JsonProperty("creditHr")
    public Double getCreditHr() {
        return creditHr;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SFTREGS_CREDIT_HR
     * (Required)
     * 
     */
    @JsonProperty("creditHr")
    public void setCreditHr(Double creditHr) {
        this.creditHr = creditHr;
    }

    public Sftreg withCreditHr(Double creditHr) {
        this.creditHr = creditHr;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public String getSsbsectSeqNumb() {
        return ssbsectSeqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public void setSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
    }

    public Sftreg withSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
        return this;
    }

    /**
     * Lineage reference object : SFTREGS_APPR_RECEIVED_IND
     * 
     */
    @JsonProperty("apprReceivedInd")
    public String getApprReceivedInd() {
        return apprReceivedInd;
    }

    /**
     * Lineage reference object : SFTREGS_APPR_RECEIVED_IND
     * 
     */
    @JsonProperty("apprReceivedInd")
    public void setApprReceivedInd(String apprReceivedInd) {
        this.apprReceivedInd = apprReceivedInd;
    }

    public Sftreg withApprReceivedInd(String apprReceivedInd) {
        this.apprReceivedInd = apprReceivedInd;
        return this;
    }

    @JsonProperty("rwoverride")
    public String getRwoverride() {
        return rwoverride;
    }

    @JsonProperty("rwoverride")
    public void setRwoverride(String rwoverride) {
        this.rwoverride = rwoverride;
    }

    public Sftreg withRwoverride(String rwoverride) {
        this.rwoverride = rwoverride;
        return this;
    }

    @JsonProperty("frDiscountCrnDisplay")
    public String getFrDiscountCrnDisplay() {
        return frDiscountCrnDisplay;
    }

    @JsonProperty("frDiscountCrnDisplay")
    public void setFrDiscountCrnDisplay(String frDiscountCrnDisplay) {
        this.frDiscountCrnDisplay = frDiscountCrnDisplay;
    }

    public Sftreg withFrDiscountCrnDisplay(String frDiscountCrnDisplay) {
        this.frDiscountCrnDisplay = frDiscountCrnDisplay;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public String getSsbsectSubjCode() {
        return ssbsectSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public void setSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
    }

    public Sftreg withSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
        return this;
    }

    /**
     * Time Status Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("tmstHr")
    public Double getTmstHr() {
        return tmstHr;
    }

    /**
     * Time Status Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("tmstHr")
    public void setTmstHr(Double tmstHr) {
        this.tmstHr = tmstHr;
    }

    public Sftreg withTmstHr(Double tmstHr) {
        this.tmstHr = tmstHr;
        return this;
    }

    /**
     * Course
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public String getSsbsectCrseNumb() {
        return ssbsectCrseNumb;
    }

    /**
     * Course
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public void setSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
    }

    public Sftreg withSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SFTREGS_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SFTREGS_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public Sftreg withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Error Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("errorFlagDisplay")
    public String getErrorFlagDisplay() {
        return errorFlagDisplay;
    }

    /**
     * Error Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("errorFlagDisplay")
    public void setErrorFlagDisplay(String errorFlagDisplay) {
        this.errorFlagDisplay = errorFlagDisplay;
    }

    public Sftreg withErrorFlagDisplay(String errorFlagDisplay) {
        this.errorFlagDisplay = errorFlagDisplay;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFTREGS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * (Required)
     * 
     */
    @JsonProperty("rstsCode")
    public String getRstsCode() {
        return rstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFTREGS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * (Required)
     * 
     */
    @JsonProperty("rstsCode")
    public void setRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
    }

    public Sftreg withRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFTREGS_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFTREGS_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public Sftreg withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Status Type
     * <p>
     * 
     * 
     */
    @JsonProperty("vrStatusTypeDisplay")
    public String getVrStatusTypeDisplay() {
        return vrStatusTypeDisplay;
    }

    /**
     * Status Type
     * <p>
     * 
     * 
     */
    @JsonProperty("vrStatusTypeDisplay")
    public void setVrStatusTypeDisplay(String vrStatusTypeDisplay) {
        this.vrStatusTypeDisplay = vrStatusTypeDisplay;
    }

    public Sftreg withVrStatusTypeDisplay(String vrStatusTypeDisplay) {
        this.vrStatusTypeDisplay = vrStatusTypeDisplay;
        return this;
    }

    /**
     * Method of Instruction
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectInsmCode")
    public String getSsbsectInsmCode() {
        return ssbsectInsmCode;
    }

    /**
     * Method of Instruction
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectInsmCode")
    public void setSsbsectInsmCode(String ssbsectInsmCode) {
        this.ssbsectInsmCode = ssbsectInsmCode;
    }

    public Sftreg withSsbsectInsmCode(String ssbsectInsmCode) {
        this.ssbsectInsmCode = ssbsectInsmCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFTREGS_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFTREGS_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Sftreg withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFTREGS_LEVL_CODE, Lookup lineage reference object : stvlevl,scrlevl,scrlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFTREGS_LEVL_CODE, Lookup lineage reference object : stvlevl,scrlevl,scrlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public Sftreg withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public Sftreg withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sftreg.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attemptHr");
        sb.append('=');
        sb.append(((this.attemptHr == null)?"<null>":this.attemptHr));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("billHr");
        sb.append('=');
        sb.append(((this.billHr == null)?"<null>":this.billHr));
        sb.append(',');
        sb.append("creditHr");
        sb.append('=');
        sb.append(((this.creditHr == null)?"<null>":this.creditHr));
        sb.append(',');
        sb.append("ssbsectSeqNumb");
        sb.append('=');
        sb.append(((this.ssbsectSeqNumb == null)?"<null>":this.ssbsectSeqNumb));
        sb.append(',');
        sb.append("apprReceivedInd");
        sb.append('=');
        sb.append(((this.apprReceivedInd == null)?"<null>":this.apprReceivedInd));
        sb.append(',');
        sb.append("rwoverride");
        sb.append('=');
        sb.append(((this.rwoverride == null)?"<null>":this.rwoverride));
        sb.append(',');
        sb.append("frDiscountCrnDisplay");
        sb.append('=');
        sb.append(((this.frDiscountCrnDisplay == null)?"<null>":this.frDiscountCrnDisplay));
        sb.append(',');
        sb.append("ssbsectSubjCode");
        sb.append('=');
        sb.append(((this.ssbsectSubjCode == null)?"<null>":this.ssbsectSubjCode));
        sb.append(',');
        sb.append("tmstHr");
        sb.append('=');
        sb.append(((this.tmstHr == null)?"<null>":this.tmstHr));
        sb.append(',');
        sb.append("ssbsectCrseNumb");
        sb.append('=');
        sb.append(((this.ssbsectCrseNumb == null)?"<null>":this.ssbsectCrseNumb));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("errorFlagDisplay");
        sb.append('=');
        sb.append(((this.errorFlagDisplay == null)?"<null>":this.errorFlagDisplay));
        sb.append(',');
        sb.append("rstsCode");
        sb.append('=');
        sb.append(((this.rstsCode == null)?"<null>":this.rstsCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("vrStatusTypeDisplay");
        sb.append('=');
        sb.append(((this.vrStatusTypeDisplay == null)?"<null>":this.vrStatusTypeDisplay));
        sb.append(',');
        sb.append("ssbsectInsmCode");
        sb.append('=');
        sb.append(((this.ssbsectInsmCode == null)?"<null>":this.ssbsectInsmCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.attemptHr == null)? 0 :this.attemptHr.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.billHr == null)? 0 :this.billHr.hashCode()));
        result = ((result* 31)+((this.creditHr == null)? 0 :this.creditHr.hashCode()));
        result = ((result* 31)+((this.ssbsectSeqNumb == null)? 0 :this.ssbsectSeqNumb.hashCode()));
        result = ((result* 31)+((this.apprReceivedInd == null)? 0 :this.apprReceivedInd.hashCode()));
        result = ((result* 31)+((this.rwoverride == null)? 0 :this.rwoverride.hashCode()));
        result = ((result* 31)+((this.frDiscountCrnDisplay == null)? 0 :this.frDiscountCrnDisplay.hashCode()));
        result = ((result* 31)+((this.ssbsectSubjCode == null)? 0 :this.ssbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.tmstHr == null)? 0 :this.tmstHr.hashCode()));
        result = ((result* 31)+((this.ssbsectCrseNumb == null)? 0 :this.ssbsectCrseNumb.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.errorFlagDisplay == null)? 0 :this.errorFlagDisplay.hashCode()));
        result = ((result* 31)+((this.rstsCode == null)? 0 :this.rstsCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.vrStatusTypeDisplay == null)? 0 :this.vrStatusTypeDisplay.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssbsectInsmCode == null)? 0 :this.ssbsectInsmCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sftreg) == false) {
            return false;
        }
        Sftreg rhs = ((Sftreg) other);
        return ((((((((((((((((((((((this.attemptHr == rhs.attemptHr)||((this.attemptHr!= null)&&this.attemptHr.equals(rhs.attemptHr)))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.billHr == rhs.billHr)||((this.billHr!= null)&&this.billHr.equals(rhs.billHr))))&&((this.creditHr == rhs.creditHr)||((this.creditHr!= null)&&this.creditHr.equals(rhs.creditHr))))&&((this.ssbsectSeqNumb == rhs.ssbsectSeqNumb)||((this.ssbsectSeqNumb!= null)&&this.ssbsectSeqNumb.equals(rhs.ssbsectSeqNumb))))&&((this.apprReceivedInd == rhs.apprReceivedInd)||((this.apprReceivedInd!= null)&&this.apprReceivedInd.equals(rhs.apprReceivedInd))))&&((this.rwoverride == rhs.rwoverride)||((this.rwoverride!= null)&&this.rwoverride.equals(rhs.rwoverride))))&&((this.frDiscountCrnDisplay == rhs.frDiscountCrnDisplay)||((this.frDiscountCrnDisplay!= null)&&this.frDiscountCrnDisplay.equals(rhs.frDiscountCrnDisplay))))&&((this.ssbsectSubjCode == rhs.ssbsectSubjCode)||((this.ssbsectSubjCode!= null)&&this.ssbsectSubjCode.equals(rhs.ssbsectSubjCode))))&&((this.tmstHr == rhs.tmstHr)||((this.tmstHr!= null)&&this.tmstHr.equals(rhs.tmstHr))))&&((this.ssbsectCrseNumb == rhs.ssbsectCrseNumb)||((this.ssbsectCrseNumb!= null)&&this.ssbsectCrseNumb.equals(rhs.ssbsectCrseNumb))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.errorFlagDisplay == rhs.errorFlagDisplay)||((this.errorFlagDisplay!= null)&&this.errorFlagDisplay.equals(rhs.errorFlagDisplay))))&&((this.rstsCode == rhs.rstsCode)||((this.rstsCode!= null)&&this.rstsCode.equals(rhs.rstsCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.vrStatusTypeDisplay == rhs.vrStatusTypeDisplay)||((this.vrStatusTypeDisplay!= null)&&this.vrStatusTypeDisplay.equals(rhs.vrStatusTypeDisplay))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssbsectInsmCode == rhs.ssbsectInsmCode)||((this.ssbsectInsmCode!= null)&&this.ssbsectInsmCode.equals(rhs.ssbsectInsmCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
