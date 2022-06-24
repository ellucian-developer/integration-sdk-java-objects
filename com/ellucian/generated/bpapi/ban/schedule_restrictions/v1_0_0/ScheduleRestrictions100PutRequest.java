
package com.ellucian.generated.bpapi.ban.schedule_restrictions.v1_0_0;

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
    "criteria.termDescription",
    "scacrseCrseNumb",
    "criteria.rtrmCode",
    "scacrseSubjCode",
    "scrrtrmTermInd",
    "rtrmCode",
    "scacrseTermCodeEff"
})
@Generated("jsonschema2pojo")
public class ScheduleRestrictions100PutRequest {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.termDescription")
    private String criteriaTermDescription;
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
     * Term
     * <p>
     * Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm
     * (Required)
     * 
     */
    @JsonProperty("criteria.rtrmCode")
    @JsonPropertyDescription("Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm")
    private String criteriaRtrmCode;
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
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrtrmTermInd
     * (Required)
     * 
     */
    @JsonProperty("scrrtrmTermInd")
    @JsonPropertyDescription("Lineage reference object : scrrtrmTermInd")
    private String scrrtrmTermInd;
    /**
     * Term
     * <p>
     * Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm
     * (Required)
     * 
     */
    @JsonProperty("rtrmCode")
    @JsonPropertyDescription("Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm")
    private String rtrmCode;
    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private String scacrseTermCodeEff;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.termDescription")
    public String getCriteriaTermDescription() {
        return criteriaTermDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.termDescription")
    public void setCriteriaTermDescription(String criteriaTermDescription) {
        this.criteriaTermDescription = criteriaTermDescription;
    }

    public ScheduleRestrictions100PutRequest withCriteriaTermDescription(String criteriaTermDescription) {
        this.criteriaTermDescription = criteriaTermDescription;
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

    public ScheduleRestrictions100PutRequest withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm
     * (Required)
     * 
     */
    @JsonProperty("criteria.rtrmCode")
    public String getCriteriaRtrmCode() {
        return criteriaRtrmCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm
     * (Required)
     * 
     */
    @JsonProperty("criteria.rtrmCode")
    public void setCriteriaRtrmCode(String criteriaRtrmCode) {
        this.criteriaRtrmCode = criteriaRtrmCode;
    }

    public ScheduleRestrictions100PutRequest withCriteriaRtrmCode(String criteriaRtrmCode) {
        this.criteriaRtrmCode = criteriaRtrmCode;
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

    public ScheduleRestrictions100PutRequest withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrtrmTermInd
     * (Required)
     * 
     */
    @JsonProperty("scrrtrmTermInd")
    public String getScrrtrmTermInd() {
        return scrrtrmTermInd;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrtrmTermInd
     * (Required)
     * 
     */
    @JsonProperty("scrrtrmTermInd")
    public void setScrrtrmTermInd(String scrrtrmTermInd) {
        this.scrrtrmTermInd = scrrtrmTermInd;
    }

    public ScheduleRestrictions100PutRequest withScrrtrmTermInd(String scrrtrmTermInd) {
        this.scrrtrmTermInd = scrrtrmTermInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm
     * (Required)
     * 
     */
    @JsonProperty("rtrmCode")
    public String getRtrmCode() {
        return rtrmCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SCRRTRM_RTRM_CODE, Lookup lineage reference object : stvrtrm
     * (Required)
     * 
     */
    @JsonProperty("rtrmCode")
    public void setRtrmCode(String rtrmCode) {
        this.rtrmCode = rtrmCode;
    }

    public ScheduleRestrictions100PutRequest withRtrmCode(String rtrmCode) {
        this.rtrmCode = rtrmCode;
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

    public ScheduleRestrictions100PutRequest withScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
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

    public ScheduleRestrictions100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleRestrictions100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTermDescription");
        sb.append('=');
        sb.append(((this.criteriaTermDescription == null)?"<null>":this.criteriaTermDescription));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("criteriaRtrmCode");
        sb.append('=');
        sb.append(((this.criteriaRtrmCode == null)?"<null>":this.criteriaRtrmCode));
        sb.append(',');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("scrrtrmTermInd");
        sb.append('=');
        sb.append(((this.scrrtrmTermInd == null)?"<null>":this.scrrtrmTermInd));
        sb.append(',');
        sb.append("rtrmCode");
        sb.append('=');
        sb.append(((this.rtrmCode == null)?"<null>":this.rtrmCode));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
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
        result = ((result* 31)+((this.criteriaRtrmCode == null)? 0 :this.criteriaRtrmCode.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermDescription == null)? 0 :this.criteriaTermDescription.hashCode()));
        result = ((result* 31)+((this.scrrtrmTermInd == null)? 0 :this.scrrtrmTermInd.hashCode()));
        result = ((result* 31)+((this.rtrmCode == null)? 0 :this.rtrmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseTermCodeEff == null)? 0 :this.scacrseTermCodeEff.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleRestrictions100PutRequest) == false) {
            return false;
        }
        ScheduleRestrictions100PutRequest rhs = ((ScheduleRestrictions100PutRequest) other);
        return (((((((((this.criteriaRtrmCode == rhs.criteriaRtrmCode)||((this.criteriaRtrmCode!= null)&&this.criteriaRtrmCode.equals(rhs.criteriaRtrmCode)))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.criteriaTermDescription == rhs.criteriaTermDescription)||((this.criteriaTermDescription!= null)&&this.criteriaTermDescription.equals(rhs.criteriaTermDescription))))&&((this.scrrtrmTermInd == rhs.scrrtrmTermInd)||((this.scrrtrmTermInd!= null)&&this.scrrtrmTermInd.equals(rhs.scrrtrmTermInd))))&&((this.rtrmCode == rhs.rtrmCode)||((this.rtrmCode!= null)&&this.rtrmCode.equals(rhs.rtrmCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))));
    }

}
