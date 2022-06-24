
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
    "endTerm",
    "scacrseCrseNumb",
    "crseNumbEqiv",
    "scacrseSubjCode",
    "crseNumbCorq",
    "startTerm",
    "scacrseTermCodeEff",
    "subjCodeEqiv",
    "subjCodeCorq"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationCorequisitesAndEquivalents100GetRequest {

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
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private String scacrseCrseNumb;
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
    @JsonProperty("scacrseSubjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private String scacrseSubjCode;
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
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private String scacrseTermCodeEff;
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withEndTerm(String endTerm) {
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withCrseNumbEqiv(String crseNumbEqiv) {
        this.crseNumbEqiv = crseNumbEqiv;
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withCrseNumbCorq(String crseNumbCorq) {
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withStartTerm(String startTerm) {
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withSubjCodeEqiv(String subjCodeEqiv) {
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withSubjCodeCorq(String subjCodeCorq) {
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationCorequisitesAndEquivalents100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endTerm");
        sb.append('=');
        sb.append(((this.endTerm == null)?"<null>":this.endTerm));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("crseNumbEqiv");
        sb.append('=');
        sb.append(((this.crseNumbEqiv == null)?"<null>":this.crseNumbEqiv));
        sb.append(',');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("crseNumbCorq");
        sb.append('=');
        sb.append(((this.crseNumbCorq == null)?"<null>":this.crseNumbCorq));
        sb.append(',');
        sb.append("startTerm");
        sb.append('=');
        sb.append(((this.startTerm == null)?"<null>":this.startTerm));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
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
        result = ((result* 31)+((this.endTerm == null)? 0 :this.endTerm.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.crseNumbEqiv == null)? 0 :this.crseNumbEqiv.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.crseNumbCorq == null)? 0 :this.crseNumbCorq.hashCode()));
        result = ((result* 31)+((this.startTerm == null)? 0 :this.startTerm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseTermCodeEff == null)? 0 :this.scacrseTermCodeEff.hashCode()));
        result = ((result* 31)+((this.subjCodeEqiv == null)? 0 :this.subjCodeEqiv.hashCode()));
        result = ((result* 31)+((this.subjCodeCorq == null)? 0 :this.subjCodeCorq.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationCorequisitesAndEquivalents100GetRequest) == false) {
            return false;
        }
        CourseDetailInformationCorequisitesAndEquivalents100GetRequest rhs = ((CourseDetailInformationCorequisitesAndEquivalents100GetRequest) other);
        return (((((((((((this.endTerm == rhs.endTerm)||((this.endTerm!= null)&&this.endTerm.equals(rhs.endTerm)))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.crseNumbEqiv == rhs.crseNumbEqiv)||((this.crseNumbEqiv!= null)&&this.crseNumbEqiv.equals(rhs.crseNumbEqiv))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.crseNumbCorq == rhs.crseNumbCorq)||((this.crseNumbCorq!= null)&&this.crseNumbCorq.equals(rhs.crseNumbCorq))))&&((this.startTerm == rhs.startTerm)||((this.startTerm!= null)&&this.startTerm.equals(rhs.startTerm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))))&&((this.subjCodeEqiv == rhs.subjCodeEqiv)||((this.subjCodeEqiv!= null)&&this.subjCodeEqiv.equals(rhs.subjCodeEqiv))))&&((this.subjCodeCorq == rhs.subjCodeCorq)||((this.subjCodeCorq!= null)&&this.subjCodeCorq.equals(rhs.subjCodeCorq))));
    }

}
