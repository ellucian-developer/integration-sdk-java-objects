
package com.ellucian.generated.bpapi.ban.course_detail_information_corequisites_and_equivalents.v1_0_0;

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
    "crseNumb",
    "termCodeEff",
    "endTerm",
    "crseNumbEqiv",
    "subjCode",
    "crseNumbCorq",
    "startTerm",
    "subjCodeEqiv",
    "subjCodeCorq"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationCorequisitesAndEquivalents100PostRequest {

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumb;
    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private String termCodeEff;
    /**
     * End Term
     * <p>
     * Lineage reference object : SCREQIV_END_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("endTerm")
    @JsonPropertyDescription("Lineage reference object : SCREQIV_END_TERM, Lookup lineage reference object : stvterm")
    private String endTerm;
    /**
     * Course
     * <p>
     * Lineage reference object : SCREQIV_CRSE_NUMB_EQIV, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("crseNumbEqiv")
    @JsonPropertyDescription("Lineage reference object : SCREQIV_CRSE_NUMB_EQIV, Lookup lineage reference object : scbcrse,scbcrky")
    private String crseNumbEqiv;
    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Course
     * <p>
     * Lineage reference object : SCRCORQ_CRSE_NUMB_CORQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("crseNumbCorq")
    @JsonPropertyDescription("Lineage reference object : SCRCORQ_CRSE_NUMB_CORQ, Lookup lineage reference object : stvsubj")
    private String crseNumbCorq;
    /**
     * Start Term
     * <p>
     * Lineage reference object : SCREQIV_START_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("startTerm")
    @JsonPropertyDescription("Lineage reference object : SCREQIV_START_TERM, Lookup lineage reference object : stvterm")
    private String startTerm;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCREQIV_SUBJ_CODE_EQIV, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeEqiv")
    @JsonPropertyDescription("Lineage reference object : SCREQIV_SUBJ_CODE_EQIV, Lookup lineage reference object : scbcrse,scbcrky")
    private String subjCodeEqiv;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCORQ_SUBJ_CODE_CORQ, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeCorq")
    @JsonPropertyDescription("Lineage reference object : SCRCORQ_SUBJ_CODE_CORQ, Lookup lineage reference object : scbcrse,scbcrky")
    private String subjCodeCorq;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SCREQIV_END_TERM, Lookup lineage reference object : stvterm
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
     * Lineage reference object : SCREQIV_END_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("endTerm")
    public void setEndTerm(String endTerm) {
        this.endTerm = endTerm;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withEndTerm(String endTerm) {
        this.endTerm = endTerm;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCREQIV_CRSE_NUMB_EQIV, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("crseNumbEqiv")
    public String getCrseNumbEqiv() {
        return crseNumbEqiv;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCREQIV_CRSE_NUMB_EQIV, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("crseNumbEqiv")
    public void setCrseNumbEqiv(String crseNumbEqiv) {
        this.crseNumbEqiv = crseNumbEqiv;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withCrseNumbEqiv(String crseNumbEqiv) {
        this.crseNumbEqiv = crseNumbEqiv;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCORQ_CRSE_NUMB_CORQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("crseNumbCorq")
    public String getCrseNumbCorq() {
        return crseNumbCorq;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCORQ_CRSE_NUMB_CORQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("crseNumbCorq")
    public void setCrseNumbCorq(String crseNumbCorq) {
        this.crseNumbCorq = crseNumbCorq;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withCrseNumbCorq(String crseNumbCorq) {
        this.crseNumbCorq = crseNumbCorq;
        return this;
    }

    /**
     * Start Term
     * <p>
     * Lineage reference object : SCREQIV_START_TERM, Lookup lineage reference object : stvterm
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
     * Lineage reference object : SCREQIV_START_TERM, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("startTerm")
    public void setStartTerm(String startTerm) {
        this.startTerm = startTerm;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withStartTerm(String startTerm) {
        this.startTerm = startTerm;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCREQIV_SUBJ_CODE_EQIV, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeEqiv")
    public String getSubjCodeEqiv() {
        return subjCodeEqiv;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCREQIV_SUBJ_CODE_EQIV, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeEqiv")
    public void setSubjCodeEqiv(String subjCodeEqiv) {
        this.subjCodeEqiv = subjCodeEqiv;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withSubjCodeEqiv(String subjCodeEqiv) {
        this.subjCodeEqiv = subjCodeEqiv;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCORQ_SUBJ_CODE_CORQ, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeCorq")
    public String getSubjCodeCorq() {
        return subjCodeCorq;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCORQ_SUBJ_CODE_CORQ, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeCorq")
    public void setSubjCodeCorq(String subjCodeCorq) {
        this.subjCodeCorq = subjCodeCorq;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withSubjCodeCorq(String subjCodeCorq) {
        this.subjCodeCorq = subjCodeCorq;
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

    public CourseDetailInformationCorequisitesAndEquivalents100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationCorequisitesAndEquivalents100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("endTerm");
        sb.append('=');
        sb.append(((this.endTerm == null)?"<null>":this.endTerm));
        sb.append(',');
        sb.append("crseNumbEqiv");
        sb.append('=');
        sb.append(((this.crseNumbEqiv == null)?"<null>":this.crseNumbEqiv));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("crseNumbCorq");
        sb.append('=');
        sb.append(((this.crseNumbCorq == null)?"<null>":this.crseNumbCorq));
        sb.append(',');
        sb.append("startTerm");
        sb.append('=');
        sb.append(((this.startTerm == null)?"<null>":this.startTerm));
        sb.append(',');
        sb.append("subjCodeEqiv");
        sb.append('=');
        sb.append(((this.subjCodeEqiv == null)?"<null>":this.subjCodeEqiv));
        sb.append(',');
        sb.append("subjCodeCorq");
        sb.append('=');
        sb.append(((this.subjCodeCorq == null)?"<null>":this.subjCodeCorq));
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
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.endTerm == null)? 0 :this.endTerm.hashCode()));
        result = ((result* 31)+((this.crseNumbEqiv == null)? 0 :this.crseNumbEqiv.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.crseNumbCorq == null)? 0 :this.crseNumbCorq.hashCode()));
        result = ((result* 31)+((this.startTerm == null)? 0 :this.startTerm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subjCodeEqiv == null)? 0 :this.subjCodeEqiv.hashCode()));
        result = ((result* 31)+((this.subjCodeCorq == null)? 0 :this.subjCodeCorq.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationCorequisitesAndEquivalents100PostRequest) == false) {
            return false;
        }
        CourseDetailInformationCorequisitesAndEquivalents100PostRequest rhs = ((CourseDetailInformationCorequisitesAndEquivalents100PostRequest) other);
        return (((((((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.endTerm == rhs.endTerm)||((this.endTerm!= null)&&this.endTerm.equals(rhs.endTerm))))&&((this.crseNumbEqiv == rhs.crseNumbEqiv)||((this.crseNumbEqiv!= null)&&this.crseNumbEqiv.equals(rhs.crseNumbEqiv))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.crseNumbCorq == rhs.crseNumbCorq)||((this.crseNumbCorq!= null)&&this.crseNumbCorq.equals(rhs.crseNumbCorq))))&&((this.startTerm == rhs.startTerm)||((this.startTerm!= null)&&this.startTerm.equals(rhs.startTerm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subjCodeEqiv == rhs.subjCodeEqiv)||((this.subjCodeEqiv!= null)&&this.subjCodeEqiv.equals(rhs.subjCodeEqiv))))&&((this.subjCodeCorq == rhs.subjCodeCorq)||((this.subjCodeCorq!= null)&&this.subjCodeCorq.equals(rhs.subjCodeCorq))));
    }

}
