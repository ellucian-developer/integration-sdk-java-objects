
package com.ellucian.generated.bpapi.ban.prior_college_majors_minors_concentrations.v1_0_0;

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
    "criteria.userId",
    "majrCodeConc",
    "id",
    "criteria.majrCodeConc",
    "criteria.majrCodeMajor",
    "criteria.majrCodeMinor",
    "majrCodeMajor",
    "majrCodeMinor"
})
@Generated("jsonschema2pojo")
public class PriorCollegeMajorsMinorsConcentrations100PutRequest {

    /**
     * User ID
     * <p>
     * Lineage reference object : SORMAJR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SORMAJR_USER_ID")
    private String criteriaUserId;
    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeConc")
    @JsonPropertyDescription("Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr")
    private String majrCodeConc;
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
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCodeConc")
    @JsonPropertyDescription("Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr")
    private String criteriaMajrCodeConc;
    /**
     * Majors
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCodeMajor")
    @JsonPropertyDescription("Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr")
    private String criteriaMajrCodeMajor;
    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCodeMinor")
    @JsonPropertyDescription("Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr")
    private String criteriaMajrCodeMinor;
    /**
     * Majors
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMajor")
    @JsonPropertyDescription("Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr")
    private String majrCodeMajor;
    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinor")
    @JsonPropertyDescription("Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr")
    private String majrCodeMinor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * User ID
     * <p>
     * Lineage reference object : SORMAJR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SORMAJR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public PriorCollegeMajorsMinorsConcentrations100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeConc")
    public String getMajrCodeConc() {
        return majrCodeConc;
    }

    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeConc")
    public void setMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
    }

    public PriorCollegeMajorsMinorsConcentrations100PutRequest withMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
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

    public PriorCollegeMajorsMinorsConcentrations100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCodeConc")
    public String getCriteriaMajrCodeConc() {
        return criteriaMajrCodeConc;
    }

    /**
     * Concentrations
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCodeConc")
    public void setCriteriaMajrCodeConc(String criteriaMajrCodeConc) {
        this.criteriaMajrCodeConc = criteriaMajrCodeConc;
    }

    public PriorCollegeMajorsMinorsConcentrations100PutRequest withCriteriaMajrCodeConc(String criteriaMajrCodeConc) {
        this.criteriaMajrCodeConc = criteriaMajrCodeConc;
        return this;
    }

    /**
     * Majors
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCodeMajor")
    public String getCriteriaMajrCodeMajor() {
        return criteriaMajrCodeMajor;
    }

    /**
     * Majors
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCodeMajor")
    public void setCriteriaMajrCodeMajor(String criteriaMajrCodeMajor) {
        this.criteriaMajrCodeMajor = criteriaMajrCodeMajor;
    }

    public PriorCollegeMajorsMinorsConcentrations100PutRequest withCriteriaMajrCodeMajor(String criteriaMajrCodeMajor) {
        this.criteriaMajrCodeMajor = criteriaMajrCodeMajor;
        return this;
    }

    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCodeMinor")
    public String getCriteriaMajrCodeMinor() {
        return criteriaMajrCodeMinor;
    }

    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majrCodeMinor")
    public void setCriteriaMajrCodeMinor(String criteriaMajrCodeMinor) {
        this.criteriaMajrCodeMinor = criteriaMajrCodeMinor;
    }

    public PriorCollegeMajorsMinorsConcentrations100PutRequest withCriteriaMajrCodeMinor(String criteriaMajrCodeMinor) {
        this.criteriaMajrCodeMinor = criteriaMajrCodeMinor;
        return this;
    }

    /**
     * Majors
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMajor")
    public String getMajrCodeMajor() {
        return majrCodeMajor;
    }

    /**
     * Majors
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMajor")
    public void setMajrCodeMajor(String majrCodeMajor) {
        this.majrCodeMajor = majrCodeMajor;
    }

    public PriorCollegeMajorsMinorsConcentrations100PutRequest withMajrCodeMajor(String majrCodeMajor) {
        this.majrCodeMajor = majrCodeMajor;
        return this;
    }

    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinor")
    public String getMajrCodeMinor() {
        return majrCodeMinor;
    }

    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinor")
    public void setMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
    }

    public PriorCollegeMajorsMinorsConcentrations100PutRequest withMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
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

    public PriorCollegeMajorsMinorsConcentrations100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriorCollegeMajorsMinorsConcentrations100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("majrCodeConc");
        sb.append('=');
        sb.append(((this.majrCodeConc == null)?"<null>":this.majrCodeConc));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaMajrCodeConc");
        sb.append('=');
        sb.append(((this.criteriaMajrCodeConc == null)?"<null>":this.criteriaMajrCodeConc));
        sb.append(',');
        sb.append("criteriaMajrCodeMajor");
        sb.append('=');
        sb.append(((this.criteriaMajrCodeMajor == null)?"<null>":this.criteriaMajrCodeMajor));
        sb.append(',');
        sb.append("criteriaMajrCodeMinor");
        sb.append('=');
        sb.append(((this.criteriaMajrCodeMinor == null)?"<null>":this.criteriaMajrCodeMinor));
        sb.append(',');
        sb.append("majrCodeMajor");
        sb.append('=');
        sb.append(((this.majrCodeMajor == null)?"<null>":this.majrCodeMajor));
        sb.append(',');
        sb.append("majrCodeMinor");
        sb.append('=');
        sb.append(((this.majrCodeMinor == null)?"<null>":this.majrCodeMinor));
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
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaMajrCodeMajor == null)? 0 :this.criteriaMajrCodeMajor.hashCode()));
        result = ((result* 31)+((this.criteriaMajrCodeConc == null)? 0 :this.criteriaMajrCodeConc.hashCode()));
        result = ((result* 31)+((this.majrCodeConc == null)? 0 :this.majrCodeConc.hashCode()));
        result = ((result* 31)+((this.criteriaMajrCodeMinor == null)? 0 :this.criteriaMajrCodeMinor.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.majrCodeMajor == null)? 0 :this.majrCodeMajor.hashCode()));
        result = ((result* 31)+((this.majrCodeMinor == null)? 0 :this.majrCodeMinor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriorCollegeMajorsMinorsConcentrations100PutRequest) == false) {
            return false;
        }
        PriorCollegeMajorsMinorsConcentrations100PutRequest rhs = ((PriorCollegeMajorsMinorsConcentrations100PutRequest) other);
        return ((((((((((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId)))&&((this.criteriaMajrCodeMajor == rhs.criteriaMajrCodeMajor)||((this.criteriaMajrCodeMajor!= null)&&this.criteriaMajrCodeMajor.equals(rhs.criteriaMajrCodeMajor))))&&((this.criteriaMajrCodeConc == rhs.criteriaMajrCodeConc)||((this.criteriaMajrCodeConc!= null)&&this.criteriaMajrCodeConc.equals(rhs.criteriaMajrCodeConc))))&&((this.majrCodeConc == rhs.majrCodeConc)||((this.majrCodeConc!= null)&&this.majrCodeConc.equals(rhs.majrCodeConc))))&&((this.criteriaMajrCodeMinor == rhs.criteriaMajrCodeMinor)||((this.criteriaMajrCodeMinor!= null)&&this.criteriaMajrCodeMinor.equals(rhs.criteriaMajrCodeMinor))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.majrCodeMajor == rhs.majrCodeMajor)||((this.majrCodeMajor!= null)&&this.majrCodeMajor.equals(rhs.majrCodeMajor))))&&((this.majrCodeMinor == rhs.majrCodeMinor)||((this.majrCodeMinor!= null)&&this.majrCodeMinor.equals(rhs.majrCodeMinor))));
    }

}
