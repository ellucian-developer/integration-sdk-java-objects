
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
    "scacrseSubjCode",
    "scacrseCrseNumb",
    "scacrseTermCodeEff",
    "subjCodeMexc",
    "crseNumbMexc",
    "levlCode",
    "grdeCode",
    "startTerm",
    "endTerm"
})
@Generated("jsonschema2pojo")
public class MutualCourseExclusion100QapiPost {

    @JsonProperty("scacrseSubjCode")
    private String scacrseSubjCode;
    @JsonProperty("scacrseCrseNumb")
    private String scacrseCrseNumb;
    @JsonProperty("scacrseTermCodeEff")
    private String scacrseTermCodeEff;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("subjCodeMexc")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky")
    private String subjCodeMexc;
    /**
     * Course
     * <p>
     * Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumbMexc")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumbMexc;
    /**
     * Level
     * <p>
     * Lineage reference object : SCRMEXC_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_LEVL_CODE")
    private String levlCode;
    /**
     * Grade
     * <p>
     * Lineage reference object : SCRMEXC_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_GRDE_CODE")
    private String grdeCode;
    /**
     * Start Term
     * <p>
     * Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("startTerm")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm")
    private String startTerm;
    /**
     * End Term
     * <p>
     * Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("endTerm")
    @JsonPropertyDescription("Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm")
    private String endTerm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scacrseSubjCode")
    public String getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public MutualCourseExclusion100QapiPost withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    @JsonProperty("scacrseCrseNumb")
    public String getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public MutualCourseExclusion100QapiPost withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    @JsonProperty("scacrseTermCodeEff")
    public String getScacrseTermCodeEff() {
        return scacrseTermCodeEff;
    }

    @JsonProperty("scacrseTermCodeEff")
    public void setScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
    }

    public MutualCourseExclusion100QapiPost withScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRMEXC_SUBJ_CODE_MEXC, Lookup lineage reference object : scbcrse,scbcrky
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
     * 
     */
    @JsonProperty("subjCodeMexc")
    public void setSubjCodeMexc(String subjCodeMexc) {
        this.subjCodeMexc = subjCodeMexc;
    }

    public MutualCourseExclusion100QapiPost withSubjCodeMexc(String subjCodeMexc) {
        this.subjCodeMexc = subjCodeMexc;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRMEXC_CRSE_NUMB_MEXC, Lookup lineage reference object : scbcrse,scbcrky
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
     * 
     */
    @JsonProperty("crseNumbMexc")
    public void setCrseNumbMexc(String crseNumbMexc) {
        this.crseNumbMexc = crseNumbMexc;
    }

    public MutualCourseExclusion100QapiPost withCrseNumbMexc(String crseNumbMexc) {
        this.crseNumbMexc = crseNumbMexc;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SCRMEXC_LEVL_CODE
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
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public MutualCourseExclusion100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SCRMEXC_GRDE_CODE
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
     * 
     */
    @JsonProperty("grdeCode")
    public void setGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
    }

    public MutualCourseExclusion100QapiPost withGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
        return this;
    }

    /**
     * Start Term
     * <p>
     * Lineage reference object : SCRMEXC_START_TERM, Lookup lineage reference object : stvterm
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
     * 
     */
    @JsonProperty("startTerm")
    public void setStartTerm(String startTerm) {
        this.startTerm = startTerm;
    }

    public MutualCourseExclusion100QapiPost withStartTerm(String startTerm) {
        this.startTerm = startTerm;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SCRMEXC_END_TERM, Lookup lineage reference object : stvterm
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
     * 
     */
    @JsonProperty("endTerm")
    public void setEndTerm(String endTerm) {
        this.endTerm = endTerm;
    }

    public MutualCourseExclusion100QapiPost withEndTerm(String endTerm) {
        this.endTerm = endTerm;
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

    public MutualCourseExclusion100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MutualCourseExclusion100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
        sb.append(',');
        sb.append("subjCodeMexc");
        sb.append('=');
        sb.append(((this.subjCodeMexc == null)?"<null>":this.subjCodeMexc));
        sb.append(',');
        sb.append("crseNumbMexc");
        sb.append('=');
        sb.append(((this.crseNumbMexc == null)?"<null>":this.crseNumbMexc));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
        sb.append(',');
        sb.append("startTerm");
        sb.append('=');
        sb.append(((this.startTerm == null)?"<null>":this.startTerm));
        sb.append(',');
        sb.append("endTerm");
        sb.append('=');
        sb.append(((this.endTerm == null)?"<null>":this.endTerm));
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
        result = ((result* 31)+((this.endTerm == null)? 0 :this.endTerm.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.crseNumbMexc == null)? 0 :this.crseNumbMexc.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.grdeCode == null)? 0 :this.grdeCode.hashCode()));
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
        if ((other instanceof MutualCourseExclusion100QapiPost) == false) {
            return false;
        }
        MutualCourseExclusion100QapiPost rhs = ((MutualCourseExclusion100QapiPost) other);
        return (((((((((((this.endTerm == rhs.endTerm)||((this.endTerm!= null)&&this.endTerm.equals(rhs.endTerm)))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.crseNumbMexc == rhs.crseNumbMexc)||((this.crseNumbMexc!= null)&&this.crseNumbMexc.equals(rhs.crseNumbMexc))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.subjCodeMexc == rhs.subjCodeMexc)||((this.subjCodeMexc!= null)&&this.subjCodeMexc.equals(rhs.subjCodeMexc))))&&((this.startTerm == rhs.startTerm)||((this.startTerm!= null)&&this.startTerm.equals(rhs.startTerm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
