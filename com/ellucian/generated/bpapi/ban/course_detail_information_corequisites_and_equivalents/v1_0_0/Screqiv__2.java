
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
    "crseNumbEqiv",
    "endcopy",
    "startTerm",
    "subjCodeEqiv"
})
@Generated("jsonschema2pojo")
public class Screqiv__2 {

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
    @JsonProperty("endcopy")
    private String endcopy;
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

    public Screqiv__2 withEndTerm(String endTerm) {
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

    public Screqiv__2 withCrseNumbEqiv(String crseNumbEqiv) {
        this.crseNumbEqiv = crseNumbEqiv;
        return this;
    }

    @JsonProperty("endcopy")
    public String getEndcopy() {
        return endcopy;
    }

    @JsonProperty("endcopy")
    public void setEndcopy(String endcopy) {
        this.endcopy = endcopy;
    }

    public Screqiv__2 withEndcopy(String endcopy) {
        this.endcopy = endcopy;
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

    public Screqiv__2 withStartTerm(String startTerm) {
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

    public Screqiv__2 withSubjCodeEqiv(String subjCodeEqiv) {
        this.subjCodeEqiv = subjCodeEqiv;
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

    public Screqiv__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Screqiv__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endTerm");
        sb.append('=');
        sb.append(((this.endTerm == null)?"<null>":this.endTerm));
        sb.append(',');
        sb.append("crseNumbEqiv");
        sb.append('=');
        sb.append(((this.crseNumbEqiv == null)?"<null>":this.crseNumbEqiv));
        sb.append(',');
        sb.append("endcopy");
        sb.append('=');
        sb.append(((this.endcopy == null)?"<null>":this.endcopy));
        sb.append(',');
        sb.append("startTerm");
        sb.append('=');
        sb.append(((this.startTerm == null)?"<null>":this.startTerm));
        sb.append(',');
        sb.append("subjCodeEqiv");
        sb.append('=');
        sb.append(((this.subjCodeEqiv == null)?"<null>":this.subjCodeEqiv));
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
        result = ((result* 31)+((this.crseNumbEqiv == null)? 0 :this.crseNumbEqiv.hashCode()));
        result = ((result* 31)+((this.endcopy == null)? 0 :this.endcopy.hashCode()));
        result = ((result* 31)+((this.startTerm == null)? 0 :this.startTerm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subjCodeEqiv == null)? 0 :this.subjCodeEqiv.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Screqiv__2) == false) {
            return false;
        }
        Screqiv__2 rhs = ((Screqiv__2) other);
        return (((((((this.endTerm == rhs.endTerm)||((this.endTerm!= null)&&this.endTerm.equals(rhs.endTerm)))&&((this.crseNumbEqiv == rhs.crseNumbEqiv)||((this.crseNumbEqiv!= null)&&this.crseNumbEqiv.equals(rhs.crseNumbEqiv))))&&((this.endcopy == rhs.endcopy)||((this.endcopy!= null)&&this.endcopy.equals(rhs.endcopy))))&&((this.startTerm == rhs.startTerm)||((this.startTerm!= null)&&this.startTerm.equals(rhs.startTerm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subjCodeEqiv == rhs.subjCodeEqiv)||((this.subjCodeEqiv!= null)&&this.subjCodeEqiv.equals(rhs.subjCodeEqiv))));
    }

}
