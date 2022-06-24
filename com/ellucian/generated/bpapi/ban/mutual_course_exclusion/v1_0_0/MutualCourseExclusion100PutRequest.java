
package com.ellucian.generated.bpapi.ban.mutual_course_exclusion.v1_0_0;

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
    "criteria.endTerm",
    "scacrseCrseNumb",
    "crseNumbMexc",
    "scacrseSubjCode",
    "criteria.crseNumbMexc",
    "criteria.startTerm",
    "grdeCode",
    "criteria.subjCodeMexc",
    "criteria.levlCode",
    "endTerm",
    "criteria.grdeCode",
    "subjCodeMexc",
    "startTerm",
    "scacrseTermCodeEff",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class MutualCourseExclusion100PutRequest {

    /**
     * End Term
     * <p>
     * Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.endTerm")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm")
    private String criteriaEndTerm;
    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private String scacrseCrseNumb;
    /**
     * Course
     * <p>
     * Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("crseNumbMexc")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumbMexc;
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
     * Course
     * <p>
     * Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumbMexc")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky")
    private String criteriaCrseNumbMexc;
    /**
     * Start Term
     * <p>
     * Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.startTerm")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm")
    private String criteriaStartTerm;
    /**
     * Grade
     * <p>
     * Lineage reference object : SCRMEXC_GRDE_CODE
     * (Required)
     * 
     */
    @JsonProperty("grdeCode")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_GRDE_CODE")
    private String grdeCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCodeMexc")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky")
    private String criteriaSubjCodeMexc;
    /**
     * Level
     * <p>
     * Lineage reference object : SCRMEXC_LEVL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_LEVL_CODE")
    private String criteriaLevlCode;
    /**
     * End Term
     * <p>
     * Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("endTerm")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm")
    private String endTerm;
    /**
     * Grade
     * <p>
     * Lineage reference object : SCRMEXC_GRDE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeCode")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_GRDE_CODE")
    private String criteriaGrdeCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeMexc")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky")
    private String subjCodeMexc;
    /**
     * Start Term
     * <p>
     * Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("startTerm")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm")
    private String startTerm;
    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private String scacrseTermCodeEff;
    /**
     * Level
     * <p>
     * Lineage reference object : SCRMEXC_LEVL_CODE
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_LEVL_CODE")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * End Term
     * <p>
     * Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.endTerm")
    public String getCriteriaEndTerm() {
        return criteriaEndTerm;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.endTerm")
    public void setCriteriaEndTerm(String criteriaEndTerm) {
        this.criteriaEndTerm = criteriaEndTerm;
    }

    public MutualCourseExclusion100PutRequest withCriteriaEndTerm(String criteriaEndTerm) {
        this.criteriaEndTerm = criteriaEndTerm;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public String getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public MutualCourseExclusion100PutRequest withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("crseNumbMexc")
    public String getCrseNumbMexc() {
        return crseNumbMexc;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("crseNumbMexc")
    public void setCrseNumbMexc(String crseNumbMexc) {
        this.crseNumbMexc = crseNumbMexc;
    }

    public MutualCourseExclusion100PutRequest withCrseNumbMexc(String crseNumbMexc) {
        this.crseNumbMexc = crseNumbMexc;
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

    public MutualCourseExclusion100PutRequest withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumbMexc")
    public String getCriteriaCrseNumbMexc() {
        return criteriaCrseNumbMexc;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("criteria.crseNumbMexc")
    public void setCriteriaCrseNumbMexc(String criteriaCrseNumbMexc) {
        this.criteriaCrseNumbMexc = criteriaCrseNumbMexc;
    }

    public MutualCourseExclusion100PutRequest withCriteriaCrseNumbMexc(String criteriaCrseNumbMexc) {
        this.criteriaCrseNumbMexc = criteriaCrseNumbMexc;
        return this;
    }

    /**
     * Start Term
     * <p>
     * Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.startTerm")
    public String getCriteriaStartTerm() {
        return criteriaStartTerm;
    }

    /**
     * Start Term
     * <p>
     * Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.startTerm")
    public void setCriteriaStartTerm(String criteriaStartTerm) {
        this.criteriaStartTerm = criteriaStartTerm;
    }

    public MutualCourseExclusion100PutRequest withCriteriaStartTerm(String criteriaStartTerm) {
        this.criteriaStartTerm = criteriaStartTerm;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SCRMEXC_GRDE_CODE
     * (Required)
     * 
     */
    @JsonProperty("grdeCode")
    public String getGrdeCode() {
        return grdeCode;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SCRMEXC_GRDE_CODE
     * (Required)
     * 
     */
    @JsonProperty("grdeCode")
    public void setGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
    }

    public MutualCourseExclusion100PutRequest withGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCodeMexc")
    public String getCriteriaSubjCodeMexc() {
        return criteriaSubjCodeMexc;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("criteria.subjCodeMexc")
    public void setCriteriaSubjCodeMexc(String criteriaSubjCodeMexc) {
        this.criteriaSubjCodeMexc = criteriaSubjCodeMexc;
    }

    public MutualCourseExclusion100PutRequest withCriteriaSubjCodeMexc(String criteriaSubjCodeMexc) {
        this.criteriaSubjCodeMexc = criteriaSubjCodeMexc;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SCRMEXC_LEVL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SCRMEXC_LEVL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public MutualCourseExclusion100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("endTerm")
    public String getEndTerm() {
        return endTerm;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("endTerm")
    public void setEndTerm(String endTerm) {
        this.endTerm = endTerm;
    }

    public MutualCourseExclusion100PutRequest withEndTerm(String endTerm) {
        this.endTerm = endTerm;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SCRMEXC_GRDE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeCode")
    public String getCriteriaGrdeCode() {
        return criteriaGrdeCode;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SCRMEXC_GRDE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeCode")
    public void setCriteriaGrdeCode(String criteriaGrdeCode) {
        this.criteriaGrdeCode = criteriaGrdeCode;
    }

    public MutualCourseExclusion100PutRequest withCriteriaGrdeCode(String criteriaGrdeCode) {
        this.criteriaGrdeCode = criteriaGrdeCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeMexc")
    public String getSubjCodeMexc() {
        return subjCodeMexc;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeMexc")
    public void setSubjCodeMexc(String subjCodeMexc) {
        this.subjCodeMexc = subjCodeMexc;
    }

    public MutualCourseExclusion100PutRequest withSubjCodeMexc(String subjCodeMexc) {
        this.subjCodeMexc = subjCodeMexc;
        return this;
    }

    /**
     * Start Term
     * <p>
     * Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("startTerm")
    public String getStartTerm() {
        return startTerm;
    }

    /**
     * Start Term
     * <p>
     * Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("startTerm")
    public void setStartTerm(String startTerm) {
        this.startTerm = startTerm;
    }

    public MutualCourseExclusion100PutRequest withStartTerm(String startTerm) {
        this.startTerm = startTerm;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public String getScacrseTermCodeEff() {
        return scacrseTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public void setScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
    }

    public MutualCourseExclusion100PutRequest withScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SCRMEXC_LEVL_CODE
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
     * Lineage reference object : SCRMEXC_LEVL_CODE
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public MutualCourseExclusion100PutRequest withLevlCode(String levlCode) {
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

    public MutualCourseExclusion100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MutualCourseExclusion100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaEndTerm");
        sb.append('=');
        sb.append(((this.criteriaEndTerm == null)?"<null>":this.criteriaEndTerm));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("crseNumbMexc");
        sb.append('=');
        sb.append(((this.crseNumbMexc == null)?"<null>":this.crseNumbMexc));
        sb.append(',');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("criteriaCrseNumbMexc");
        sb.append('=');
        sb.append(((this.criteriaCrseNumbMexc == null)?"<null>":this.criteriaCrseNumbMexc));
        sb.append(',');
        sb.append("criteriaStartTerm");
        sb.append('=');
        sb.append(((this.criteriaStartTerm == null)?"<null>":this.criteriaStartTerm));
        sb.append(',');
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
        sb.append(',');
        sb.append("criteriaSubjCodeMexc");
        sb.append('=');
        sb.append(((this.criteriaSubjCodeMexc == null)?"<null>":this.criteriaSubjCodeMexc));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("endTerm");
        sb.append('=');
        sb.append(((this.endTerm == null)?"<null>":this.endTerm));
        sb.append(',');
        sb.append("criteriaGrdeCode");
        sb.append('=');
        sb.append(((this.criteriaGrdeCode == null)?"<null>":this.criteriaGrdeCode));
        sb.append(',');
        sb.append("subjCodeMexc");
        sb.append('=');
        sb.append(((this.subjCodeMexc == null)?"<null>":this.subjCodeMexc));
        sb.append(',');
        sb.append("startTerm");
        sb.append('=');
        sb.append(((this.startTerm == null)?"<null>":this.startTerm));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
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
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCode == null)? 0 :this.criteriaGrdeCode.hashCode()));
        result = ((result* 31)+((this.crseNumbMexc == null)? 0 :this.crseNumbMexc.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.grdeCode == null)? 0 :this.grdeCode.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumbMexc == null)? 0 :this.criteriaCrseNumbMexc.hashCode()));
        result = ((result* 31)+((this.criteriaEndTerm == null)? 0 :this.criteriaEndTerm.hashCode()));
        result = ((result* 31)+((this.endTerm == null)? 0 :this.endTerm.hashCode()));
        result = ((result* 31)+((this.criteriaStartTerm == null)? 0 :this.criteriaStartTerm.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCodeMexc == null)? 0 :this.criteriaSubjCodeMexc.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.subjCodeMexc == null)? 0 :this.subjCodeMexc.hashCode()));
        result = ((result* 31)+((this.startTerm == null)? 0 :this.startTerm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseTermCodeEff == null)? 0 :this.scacrseTermCodeEff.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MutualCourseExclusion100PutRequest) == false) {
            return false;
        }
        MutualCourseExclusion100PutRequest rhs = ((MutualCourseExclusion100PutRequest) other);
        return (((((((((((((((((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb)))&&((this.criteriaGrdeCode == rhs.criteriaGrdeCode)||((this.criteriaGrdeCode!= null)&&this.criteriaGrdeCode.equals(rhs.criteriaGrdeCode))))&&((this.crseNumbMexc == rhs.crseNumbMexc)||((this.crseNumbMexc!= null)&&this.crseNumbMexc.equals(rhs.crseNumbMexc))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.criteriaCrseNumbMexc == rhs.criteriaCrseNumbMexc)||((this.criteriaCrseNumbMexc!= null)&&this.criteriaCrseNumbMexc.equals(rhs.criteriaCrseNumbMexc))))&&((this.criteriaEndTerm == rhs.criteriaEndTerm)||((this.criteriaEndTerm!= null)&&this.criteriaEndTerm.equals(rhs.criteriaEndTerm))))&&((this.endTerm == rhs.endTerm)||((this.endTerm!= null)&&this.endTerm.equals(rhs.endTerm))))&&((this.criteriaStartTerm == rhs.criteriaStartTerm)||((this.criteriaStartTerm!= null)&&this.criteriaStartTerm.equals(rhs.criteriaStartTerm))))&&((this.criteriaSubjCodeMexc == rhs.criteriaSubjCodeMexc)||((this.criteriaSubjCodeMexc!= null)&&this.criteriaSubjCodeMexc.equals(rhs.criteriaSubjCodeMexc))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.subjCodeMexc == rhs.subjCodeMexc)||((this.subjCodeMexc!= null)&&this.subjCodeMexc.equals(rhs.subjCodeMexc))))&&((this.startTerm == rhs.startTerm)||((this.startTerm!= null)&&this.startTerm.equals(rhs.startTerm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
