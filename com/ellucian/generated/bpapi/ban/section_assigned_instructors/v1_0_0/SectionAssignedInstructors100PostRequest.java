
package com.ellucian.generated.bpapi.ban.section_assigned_instructors.v1_0_0;

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
    "percentResponse",
    "overRide",
    "category",
    "idno",
    "crn",
    "percentSess",
    "termCode",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class SectionAssignedInstructors100PostRequest {

    /**
     * Percent of Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * 
     */
    @JsonProperty("percentResponse")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_RESPONSE")
    private Double percentResponse;
    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_OVER_RIDE")
    private String overRide;
    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_CATEGORY")
    private String category;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("idno")
    private String idno;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private String crn;
    /**
     * Percent of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_SESS")
    private Double percentSess;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private String termCode;
    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PRIMARY_IND")
    private String primaryInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Percent of Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * 
     */
    @JsonProperty("percentResponse")
    public Double getPercentResponse() {
        return percentResponse;
    }

    /**
     * Percent of Responsibility
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * 
     */
    @JsonProperty("percentResponse")
    public void setPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
    }

    public SectionAssignedInstructors100PostRequest withPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public String getOverRide() {
        return overRide;
    }

    /**
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public void setOverRide(String overRide) {
        this.overRide = overRide;
    }

    public SectionAssignedInstructors100PostRequest withOverRide(String overRide) {
        this.overRide = overRide;
        return this;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public SectionAssignedInstructors100PostRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("idno")
    public String getIdno() {
        return idno;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("idno")
    public void setIdno(String idno) {
        this.idno = idno;
    }

    public SectionAssignedInstructors100PostRequest withIdno(String idno) {
        this.idno = idno;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public SectionAssignedInstructors100PostRequest withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Percent of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    public Double getPercentSess() {
        return percentSess;
    }

    /**
     * Percent of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    public void setPercentSess(Double percentSess) {
        this.percentSess = percentSess;
    }

    public SectionAssignedInstructors100PostRequest withPercentSess(Double percentSess) {
        this.percentSess = percentSess;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public SectionAssignedInstructors100PostRequest withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public SectionAssignedInstructors100PostRequest withPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
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

    public SectionAssignedInstructors100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionAssignedInstructors100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("percentResponse");
        sb.append('=');
        sb.append(((this.percentResponse == null)?"<null>":this.percentResponse));
        sb.append(',');
        sb.append("overRide");
        sb.append('=');
        sb.append(((this.overRide == null)?"<null>":this.overRide));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("idno");
        sb.append('=');
        sb.append(((this.idno == null)?"<null>":this.idno));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("percentSess");
        sb.append('=');
        sb.append(((this.percentSess == null)?"<null>":this.percentSess));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("primaryInd");
        sb.append('=');
        sb.append(((this.primaryInd == null)?"<null>":this.primaryInd));
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
        result = ((result* 31)+((this.percentResponse == null)? 0 :this.percentResponse.hashCode()));
        result = ((result* 31)+((this.overRide == null)? 0 :this.overRide.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.idno == null)? 0 :this.idno.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.percentSess == null)? 0 :this.percentSess.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionAssignedInstructors100PostRequest) == false) {
            return false;
        }
        SectionAssignedInstructors100PostRequest rhs = ((SectionAssignedInstructors100PostRequest) other);
        return ((((((((((this.percentResponse == rhs.percentResponse)||((this.percentResponse!= null)&&this.percentResponse.equals(rhs.percentResponse)))&&((this.overRide == rhs.overRide)||((this.overRide!= null)&&this.overRide.equals(rhs.overRide))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.idno == rhs.idno)||((this.idno!= null)&&this.idno.equals(rhs.idno))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.percentSess == rhs.percentSess)||((this.percentSess!= null)&&this.percentSess.equals(rhs.percentSess))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
