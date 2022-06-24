
package com.ellucian.generated.bpapi.ban.student_cohort.v1_0_0;

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
    "chrtCode",
    "termCodeEff",
    "criteria.termCodeEff",
    "creaCode",
    "criteria.activeInd",
    "criteria.bannerId",
    "activeInd",
    "criteria.termCodeTo",
    "criteria.creaCode",
    "criteria.stspKeySequence"
})
@Generated("jsonschema2pojo")
public class StudentCohort100PutRequest {

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : chrtCode, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : chrtCode, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Term
     * <p>
     * Lineage reference object : termCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : termCodeEff, Lookup lineage reference object : stvterm")
    private String termCodeEff;
    /**
     * From Term
     * <p>
     * Lineage reference object : SGRCHRT_TERM_CODE_EFF
     * 
     */
    @JsonProperty("criteria.termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_TERM_CODE_EFF")
    private String criteriaTermCodeEff;
    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("creaCode")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea")
    private String creaCode;
    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.activeInd")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_ACTIVE_IND")
    private String criteriaActiveInd;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.bannerId")
    private String criteriaBannerId;
    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_ACTIVE_IND")
    private String activeInd;
    /**
     * To Term
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.termCodeTo")
    private String criteriaTermCodeTo;
    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("criteria.creaCode")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea")
    private String criteriaCreaCode;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp")
    private String criteriaStspKeySequence;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : chrtCode, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : chrtCode, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public StudentCohort100PutRequest withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public StudentCohort100PutRequest withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : SGRCHRT_TERM_CODE_EFF
     * 
     */
    @JsonProperty("criteria.termCodeEff")
    public String getCriteriaTermCodeEff() {
        return criteriaTermCodeEff;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : SGRCHRT_TERM_CODE_EFF
     * 
     */
    @JsonProperty("criteria.termCodeEff")
    public void setCriteriaTermCodeEff(String criteriaTermCodeEff) {
        this.criteriaTermCodeEff = criteriaTermCodeEff;
    }

    public StudentCohort100PutRequest withCriteriaTermCodeEff(String criteriaTermCodeEff) {
        this.criteriaTermCodeEff = criteriaTermCodeEff;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("creaCode")
    public String getCreaCode() {
        return creaCode;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("creaCode")
    public void setCreaCode(String creaCode) {
        this.creaCode = creaCode;
    }

    public StudentCohort100PutRequest withCreaCode(String creaCode) {
        this.creaCode = creaCode;
        return this;
    }

    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.activeInd")
    public String getCriteriaActiveInd() {
        return criteriaActiveInd;
    }

    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.activeInd")
    public void setCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
    }

    public StudentCohort100PutRequest withCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.bannerId")
    public String getCriteriaBannerId() {
        return criteriaBannerId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.bannerId")
    public void setCriteriaBannerId(String criteriaBannerId) {
        this.criteriaBannerId = criteriaBannerId;
    }

    public StudentCohort100PutRequest withCriteriaBannerId(String criteriaBannerId) {
        this.criteriaBannerId = criteriaBannerId;
        return this;
    }

    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public StudentCohort100PutRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * To Term
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.termCodeTo")
    public String getCriteriaTermCodeTo() {
        return criteriaTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.termCodeTo")
    public void setCriteriaTermCodeTo(String criteriaTermCodeTo) {
        this.criteriaTermCodeTo = criteriaTermCodeTo;
    }

    public StudentCohort100PutRequest withCriteriaTermCodeTo(String criteriaTermCodeTo) {
        this.criteriaTermCodeTo = criteriaTermCodeTo;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("criteria.creaCode")
    public String getCriteriaCreaCode() {
        return criteriaCreaCode;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("criteria.creaCode")
    public void setCriteriaCreaCode(String criteriaCreaCode) {
        this.criteriaCreaCode = criteriaCreaCode;
    }

    public StudentCohort100PutRequest withCriteriaCreaCode(String criteriaCreaCode) {
        this.criteriaCreaCode = criteriaCreaCode;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public String getCriteriaStspKeySequence() {
        return criteriaStspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public void setCriteriaStspKeySequence(String criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
    }

    public StudentCohort100PutRequest withCriteriaStspKeySequence(String criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
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

    public StudentCohort100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCohort100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("criteriaTermCodeEff");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEff == null)?"<null>":this.criteriaTermCodeEff));
        sb.append(',');
        sb.append("creaCode");
        sb.append('=');
        sb.append(((this.creaCode == null)?"<null>":this.creaCode));
        sb.append(',');
        sb.append("criteriaActiveInd");
        sb.append('=');
        sb.append(((this.criteriaActiveInd == null)?"<null>":this.criteriaActiveInd));
        sb.append(',');
        sb.append("criteriaBannerId");
        sb.append('=');
        sb.append(((this.criteriaBannerId == null)?"<null>":this.criteriaBannerId));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("criteriaTermCodeTo");
        sb.append('=');
        sb.append(((this.criteriaTermCodeTo == null)?"<null>":this.criteriaTermCodeTo));
        sb.append(',');
        sb.append("criteriaCreaCode");
        sb.append('=');
        sb.append(((this.criteriaCreaCode == null)?"<null>":this.criteriaCreaCode));
        sb.append(',');
        sb.append("criteriaStspKeySequence");
        sb.append('=');
        sb.append(((this.criteriaStspKeySequence == null)?"<null>":this.criteriaStspKeySequence));
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
        result = ((result* 31)+((this.criteriaTermCodeTo == null)? 0 :this.criteriaTermCodeTo.hashCode()));
        result = ((result* 31)+((this.criteriaCreaCode == null)? 0 :this.criteriaCreaCode.hashCode()));
        result = ((result* 31)+((this.criteriaStspKeySequence == null)? 0 :this.criteriaStspKeySequence.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.creaCode == null)? 0 :this.creaCode.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEff == null)? 0 :this.criteriaTermCodeEff.hashCode()));
        result = ((result* 31)+((this.criteriaBannerId == null)? 0 :this.criteriaBannerId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaActiveInd == null)? 0 :this.criteriaActiveInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCohort100PutRequest) == false) {
            return false;
        }
        StudentCohort100PutRequest rhs = ((StudentCohort100PutRequest) other);
        return ((((((((((((this.criteriaTermCodeTo == rhs.criteriaTermCodeTo)||((this.criteriaTermCodeTo!= null)&&this.criteriaTermCodeTo.equals(rhs.criteriaTermCodeTo)))&&((this.criteriaCreaCode == rhs.criteriaCreaCode)||((this.criteriaCreaCode!= null)&&this.criteriaCreaCode.equals(rhs.criteriaCreaCode))))&&((this.criteriaStspKeySequence == rhs.criteriaStspKeySequence)||((this.criteriaStspKeySequence!= null)&&this.criteriaStspKeySequence.equals(rhs.criteriaStspKeySequence))))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.creaCode == rhs.creaCode)||((this.creaCode!= null)&&this.creaCode.equals(rhs.creaCode))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.criteriaTermCodeEff == rhs.criteriaTermCodeEff)||((this.criteriaTermCodeEff!= null)&&this.criteriaTermCodeEff.equals(rhs.criteriaTermCodeEff))))&&((this.criteriaBannerId == rhs.criteriaBannerId)||((this.criteriaBannerId!= null)&&this.criteriaBannerId.equals(rhs.criteriaBannerId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaActiveInd == rhs.criteriaActiveInd)||((this.criteriaActiveInd!= null)&&this.criteriaActiveInd.equals(rhs.criteriaActiveInd))));
    }

}
