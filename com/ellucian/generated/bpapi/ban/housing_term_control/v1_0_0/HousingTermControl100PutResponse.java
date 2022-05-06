
package com.ellucian.generated.bpapi.ban.housing_term_control.v1_0_0;

import java.util.Date;
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
    "feeAssessment",
    "housAllowed",
    "cutoffDate",
    "feeEffDate",
    "oneup"
})
@Generated("jsonschema2pojo")
public class HousingTermControl100PutResponse {

    /**
     * Allow On-Line Fee Assessment
     * <p>
     * Lineage reference object : SLBTERM_FEE_ASSESSMENT
     * 
     */
    @JsonProperty("feeAssessment")
    @JsonPropertyDescription("Lineage reference object : SLBTERM_FEE_ASSESSMENT")
    private String feeAssessment;
    /**
     * Permit On-Line Assignments
     * <p>
     * Lineage reference object : SLBTERM_HOUS_ALLOWED
     * 
     */
    @JsonProperty("housAllowed")
    @JsonPropertyDescription("Lineage reference object : SLBTERM_HOUS_ALLOWED")
    private String housAllowed;
    /**
     * Original Charge Cutoff Date
     * <p>
     * Lineage reference object : SLBTERM_CUTOFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("cutoffDate")
    @JsonPropertyDescription("Lineage reference object : SLBTERM_CUTOFF_DATE")
    private Date cutoffDate;
    /**
     * Fee Assessment Effective Date
     * <p>
     * Lineage reference object : SLBTERM_FEE_ASSESSMNT_EFF_DATE
     * 
     */
    @JsonProperty("feeEffDate")
    @JsonPropertyDescription("Lineage reference object : SLBTERM_FEE_ASSESSMNT_EFF_DATE")
    private Date feeEffDate;
    /**
     * Roommate Sequence Number
     * <p>
     * Lineage reference object : SLBTERM_ONEUP
     * 
     */
    @JsonProperty("oneup")
    @JsonPropertyDescription("Lineage reference object : SLBTERM_ONEUP")
    private Double oneup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Allow On-Line Fee Assessment
     * <p>
     * Lineage reference object : SLBTERM_FEE_ASSESSMENT
     * 
     */
    @JsonProperty("feeAssessment")
    public String getFeeAssessment() {
        return feeAssessment;
    }

    /**
     * Allow On-Line Fee Assessment
     * <p>
     * Lineage reference object : SLBTERM_FEE_ASSESSMENT
     * 
     */
    @JsonProperty("feeAssessment")
    public void setFeeAssessment(String feeAssessment) {
        this.feeAssessment = feeAssessment;
    }

    public HousingTermControl100PutResponse withFeeAssessment(String feeAssessment) {
        this.feeAssessment = feeAssessment;
        return this;
    }

    /**
     * Permit On-Line Assignments
     * <p>
     * Lineage reference object : SLBTERM_HOUS_ALLOWED
     * 
     */
    @JsonProperty("housAllowed")
    public String getHousAllowed() {
        return housAllowed;
    }

    /**
     * Permit On-Line Assignments
     * <p>
     * Lineage reference object : SLBTERM_HOUS_ALLOWED
     * 
     */
    @JsonProperty("housAllowed")
    public void setHousAllowed(String housAllowed) {
        this.housAllowed = housAllowed;
    }

    public HousingTermControl100PutResponse withHousAllowed(String housAllowed) {
        this.housAllowed = housAllowed;
        return this;
    }

    /**
     * Original Charge Cutoff Date
     * <p>
     * Lineage reference object : SLBTERM_CUTOFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("cutoffDate")
    public Date getCutoffDate() {
        return cutoffDate;
    }

    /**
     * Original Charge Cutoff Date
     * <p>
     * Lineage reference object : SLBTERM_CUTOFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("cutoffDate")
    public void setCutoffDate(Date cutoffDate) {
        this.cutoffDate = cutoffDate;
    }

    public HousingTermControl100PutResponse withCutoffDate(Date cutoffDate) {
        this.cutoffDate = cutoffDate;
        return this;
    }

    /**
     * Fee Assessment Effective Date
     * <p>
     * Lineage reference object : SLBTERM_FEE_ASSESSMNT_EFF_DATE
     * 
     */
    @JsonProperty("feeEffDate")
    public Date getFeeEffDate() {
        return feeEffDate;
    }

    /**
     * Fee Assessment Effective Date
     * <p>
     * Lineage reference object : SLBTERM_FEE_ASSESSMNT_EFF_DATE
     * 
     */
    @JsonProperty("feeEffDate")
    public void setFeeEffDate(Date feeEffDate) {
        this.feeEffDate = feeEffDate;
    }

    public HousingTermControl100PutResponse withFeeEffDate(Date feeEffDate) {
        this.feeEffDate = feeEffDate;
        return this;
    }

    /**
     * Roommate Sequence Number
     * <p>
     * Lineage reference object : SLBTERM_ONEUP
     * 
     */
    @JsonProperty("oneup")
    public Double getOneup() {
        return oneup;
    }

    /**
     * Roommate Sequence Number
     * <p>
     * Lineage reference object : SLBTERM_ONEUP
     * 
     */
    @JsonProperty("oneup")
    public void setOneup(Double oneup) {
        this.oneup = oneup;
    }

    public HousingTermControl100PutResponse withOneup(Double oneup) {
        this.oneup = oneup;
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

    public HousingTermControl100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HousingTermControl100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("feeAssessment");
        sb.append('=');
        sb.append(((this.feeAssessment == null)?"<null>":this.feeAssessment));
        sb.append(',');
        sb.append("housAllowed");
        sb.append('=');
        sb.append(((this.housAllowed == null)?"<null>":this.housAllowed));
        sb.append(',');
        sb.append("cutoffDate");
        sb.append('=');
        sb.append(((this.cutoffDate == null)?"<null>":this.cutoffDate));
        sb.append(',');
        sb.append("feeEffDate");
        sb.append('=');
        sb.append(((this.feeEffDate == null)?"<null>":this.feeEffDate));
        sb.append(',');
        sb.append("oneup");
        sb.append('=');
        sb.append(((this.oneup == null)?"<null>":this.oneup));
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
        result = ((result* 31)+((this.feeAssessment == null)? 0 :this.feeAssessment.hashCode()));
        result = ((result* 31)+((this.housAllowed == null)? 0 :this.housAllowed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cutoffDate == null)? 0 :this.cutoffDate.hashCode()));
        result = ((result* 31)+((this.feeEffDate == null)? 0 :this.feeEffDate.hashCode()));
        result = ((result* 31)+((this.oneup == null)? 0 :this.oneup.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HousingTermControl100PutResponse) == false) {
            return false;
        }
        HousingTermControl100PutResponse rhs = ((HousingTermControl100PutResponse) other);
        return (((((((this.feeAssessment == rhs.feeAssessment)||((this.feeAssessment!= null)&&this.feeAssessment.equals(rhs.feeAssessment)))&&((this.housAllowed == rhs.housAllowed)||((this.housAllowed!= null)&&this.housAllowed.equals(rhs.housAllowed))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cutoffDate == rhs.cutoffDate)||((this.cutoffDate!= null)&&this.cutoffDate.equals(rhs.cutoffDate))))&&((this.feeEffDate == rhs.feeEffDate)||((this.feeEffDate!= null)&&this.feeEffDate.equals(rhs.feeEffDate))))&&((this.oneup == rhs.oneup)||((this.oneup!= null)&&this.oneup.equals(rhs.oneup))));
    }

}
