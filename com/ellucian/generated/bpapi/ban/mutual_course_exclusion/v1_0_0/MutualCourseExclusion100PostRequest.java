
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
    "endTerm",
    "scacrseCrseNumb",
    "crseNumbMexc",
    "scacrseSubjCode",
    "grdeCode",
    "subjCodeMexc",
    "startTerm",
    "scacrseTermCodeEff",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class MutualCourseExclusion100PostRequest {

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
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private Object scacrseCrseNumb;
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
    private Object scacrseSubjCode;
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
    private Object scacrseTermCodeEff;
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

    public MutualCourseExclusion100PostRequest withEndTerm(String endTerm) {
        this.endTerm = endTerm;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public Object getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(Object scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public MutualCourseExclusion100PostRequest withScacrseCrseNumb(Object scacrseCrseNumb) {
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

    public MutualCourseExclusion100PostRequest withCrseNumbMexc(String crseNumbMexc) {
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
    public Object getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(Object scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public MutualCourseExclusion100PostRequest withScacrseSubjCode(Object scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
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

    public MutualCourseExclusion100PostRequest withGrdeCode(String grdeCode) {
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

    public MutualCourseExclusion100PostRequest withSubjCodeMexc(String subjCodeMexc) {
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

    public MutualCourseExclusion100PostRequest withStartTerm(String startTerm) {
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
    public Object getScacrseTermCodeEff() {
        return scacrseTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public void setScacrseTermCodeEff(Object scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
    }

    public MutualCourseExclusion100PostRequest withScacrseTermCodeEff(Object scacrseTermCodeEff) {
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

    public MutualCourseExclusion100PostRequest withLevlCode(String levlCode) {
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

    public MutualCourseExclusion100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MutualCourseExclusion100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endTerm");
        sb.append('=');
        sb.append(((this.endTerm == null)?"<null>":this.endTerm));
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
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
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
        if ((other instanceof MutualCourseExclusion100PostRequest) == false) {
            return false;
        }
        MutualCourseExclusion100PostRequest rhs = ((MutualCourseExclusion100PostRequest) other);
        return (((((((((((this.endTerm == rhs.endTerm)||((this.endTerm!= null)&&this.endTerm.equals(rhs.endTerm)))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.crseNumbMexc == rhs.crseNumbMexc)||((this.crseNumbMexc!= null)&&this.crseNumbMexc.equals(rhs.crseNumbMexc))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.subjCodeMexc == rhs.subjCodeMexc)||((this.subjCodeMexc!= null)&&this.subjCodeMexc.equals(rhs.subjCodeMexc))))&&((this.startTerm == rhs.startTerm)||((this.startTerm!= null)&&this.startTerm.equals(rhs.startTerm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
