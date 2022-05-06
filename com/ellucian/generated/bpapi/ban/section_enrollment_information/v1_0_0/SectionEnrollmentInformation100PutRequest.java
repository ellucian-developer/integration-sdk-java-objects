
package com.ellucian.generated.bpapi.ban.section_enrollment_information.v1_0_0;

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
    "waitCapacity",
    "censusEnrlDate",
    "holdSsrresvWaitCapacity",
    "projEnrl",
    "census2Date",
    "holdSsrresvMaxEnrl",
    "crn",
    "maxEnrl",
    "termCode"
})
@Generated("jsonschema2pojo")
public class SectionEnrollmentInformation100PutRequest {

    /**
     * Waitlist Maximum
     * <p>
     * Lineage reference object : SSBSECT_WAIT_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("waitCapacity")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_WAIT_CAPACITY")
    private Double waitCapacity;
    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusEnrlDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_ENRL_DATE")
    private Date censusEnrlDate;
    /**
     * Waitlist Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvWaitCapacity")
    private Double holdSsrresvWaitCapacity;
    /**
     * Projected
     * <p>
     * Lineage reference object : SSBSECT_PROJ_ENRL
     * (Required)
     * 
     */
    @JsonProperty("projEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PROJ_ENRL")
    private Double projEnrl;
    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_2_DATE")
    private Date census2Date;
    /**
     * Reserved Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvMaxEnrl")
    private Double holdSsrresvMaxEnrl;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private Object crn;
    /**
     * Maximum
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * (Required)
     * 
     */
    @JsonProperty("maxEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_MAX_ENRL")
    private Double maxEnrl;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private Object termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Waitlist Maximum
     * <p>
     * Lineage reference object : SSBSECT_WAIT_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("waitCapacity")
    public Double getWaitCapacity() {
        return waitCapacity;
    }

    /**
     * Waitlist Maximum
     * <p>
     * Lineage reference object : SSBSECT_WAIT_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("waitCapacity")
    public void setWaitCapacity(Double waitCapacity) {
        this.waitCapacity = waitCapacity;
    }

    public SectionEnrollmentInformation100PutRequest withWaitCapacity(Double waitCapacity) {
        this.waitCapacity = waitCapacity;
        return this;
    }

    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusEnrlDate")
    public Date getCensusEnrlDate() {
        return censusEnrlDate;
    }

    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("censusEnrlDate")
    public void setCensusEnrlDate(Date censusEnrlDate) {
        this.censusEnrlDate = censusEnrlDate;
    }

    public SectionEnrollmentInformation100PutRequest withCensusEnrlDate(Date censusEnrlDate) {
        this.censusEnrlDate = censusEnrlDate;
        return this;
    }

    /**
     * Waitlist Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvWaitCapacity")
    public Double getHoldSsrresvWaitCapacity() {
        return holdSsrresvWaitCapacity;
    }

    /**
     * Waitlist Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvWaitCapacity")
    public void setHoldSsrresvWaitCapacity(Double holdSsrresvWaitCapacity) {
        this.holdSsrresvWaitCapacity = holdSsrresvWaitCapacity;
    }

    public SectionEnrollmentInformation100PutRequest withHoldSsrresvWaitCapacity(Double holdSsrresvWaitCapacity) {
        this.holdSsrresvWaitCapacity = holdSsrresvWaitCapacity;
        return this;
    }

    /**
     * Projected
     * <p>
     * Lineage reference object : SSBSECT_PROJ_ENRL
     * (Required)
     * 
     */
    @JsonProperty("projEnrl")
    public Double getProjEnrl() {
        return projEnrl;
    }

    /**
     * Projected
     * <p>
     * Lineage reference object : SSBSECT_PROJ_ENRL
     * (Required)
     * 
     */
    @JsonProperty("projEnrl")
    public void setProjEnrl(Double projEnrl) {
        this.projEnrl = projEnrl;
    }

    public SectionEnrollmentInformation100PutRequest withProjEnrl(Double projEnrl) {
        this.projEnrl = projEnrl;
        return this;
    }

    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    public Date getCensus2Date() {
        return census2Date;
    }

    /**
     * Freeze Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("census2Date")
    public void setCensus2Date(Date census2Date) {
        this.census2Date = census2Date;
    }

    public SectionEnrollmentInformation100PutRequest withCensus2Date(Date census2Date) {
        this.census2Date = census2Date;
        return this;
    }

    /**
     * Reserved Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvMaxEnrl")
    public Double getHoldSsrresvMaxEnrl() {
        return holdSsrresvMaxEnrl;
    }

    /**
     * Reserved Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holdSsrresvMaxEnrl")
    public void setHoldSsrresvMaxEnrl(Double holdSsrresvMaxEnrl) {
        this.holdSsrresvMaxEnrl = holdSsrresvMaxEnrl;
    }

    public SectionEnrollmentInformation100PutRequest withHoldSsrresvMaxEnrl(Double holdSsrresvMaxEnrl) {
        this.holdSsrresvMaxEnrl = holdSsrresvMaxEnrl;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public Object getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("crn")
    public void setCrn(Object crn) {
        this.crn = crn;
    }

    public SectionEnrollmentInformation100PutRequest withCrn(Object crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * (Required)
     * 
     */
    @JsonProperty("maxEnrl")
    public Double getMaxEnrl() {
        return maxEnrl;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SSBSECT_MAX_ENRL
     * (Required)
     * 
     */
    @JsonProperty("maxEnrl")
    public void setMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
    }

    public SectionEnrollmentInformation100PutRequest withMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public Object getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(Object termCode) {
        this.termCode = termCode;
    }

    public SectionEnrollmentInformation100PutRequest withTermCode(Object termCode) {
        this.termCode = termCode;
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

    public SectionEnrollmentInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionEnrollmentInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("waitCapacity");
        sb.append('=');
        sb.append(((this.waitCapacity == null)?"<null>":this.waitCapacity));
        sb.append(',');
        sb.append("censusEnrlDate");
        sb.append('=');
        sb.append(((this.censusEnrlDate == null)?"<null>":this.censusEnrlDate));
        sb.append(',');
        sb.append("holdSsrresvWaitCapacity");
        sb.append('=');
        sb.append(((this.holdSsrresvWaitCapacity == null)?"<null>":this.holdSsrresvWaitCapacity));
        sb.append(',');
        sb.append("projEnrl");
        sb.append('=');
        sb.append(((this.projEnrl == null)?"<null>":this.projEnrl));
        sb.append(',');
        sb.append("census2Date");
        sb.append('=');
        sb.append(((this.census2Date == null)?"<null>":this.census2Date));
        sb.append(',');
        sb.append("holdSsrresvMaxEnrl");
        sb.append('=');
        sb.append(((this.holdSsrresvMaxEnrl == null)?"<null>":this.holdSsrresvMaxEnrl));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("maxEnrl");
        sb.append('=');
        sb.append(((this.maxEnrl == null)?"<null>":this.maxEnrl));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.waitCapacity == null)? 0 :this.waitCapacity.hashCode()));
        result = ((result* 31)+((this.censusEnrlDate == null)? 0 :this.censusEnrlDate.hashCode()));
        result = ((result* 31)+((this.holdSsrresvWaitCapacity == null)? 0 :this.holdSsrresvWaitCapacity.hashCode()));
        result = ((result* 31)+((this.projEnrl == null)? 0 :this.projEnrl.hashCode()));
        result = ((result* 31)+((this.census2Date == null)? 0 :this.census2Date.hashCode()));
        result = ((result* 31)+((this.holdSsrresvMaxEnrl == null)? 0 :this.holdSsrresvMaxEnrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.maxEnrl == null)? 0 :this.maxEnrl.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionEnrollmentInformation100PutRequest) == false) {
            return false;
        }
        SectionEnrollmentInformation100PutRequest rhs = ((SectionEnrollmentInformation100PutRequest) other);
        return (((((((((((this.waitCapacity == rhs.waitCapacity)||((this.waitCapacity!= null)&&this.waitCapacity.equals(rhs.waitCapacity)))&&((this.censusEnrlDate == rhs.censusEnrlDate)||((this.censusEnrlDate!= null)&&this.censusEnrlDate.equals(rhs.censusEnrlDate))))&&((this.holdSsrresvWaitCapacity == rhs.holdSsrresvWaitCapacity)||((this.holdSsrresvWaitCapacity!= null)&&this.holdSsrresvWaitCapacity.equals(rhs.holdSsrresvWaitCapacity))))&&((this.projEnrl == rhs.projEnrl)||((this.projEnrl!= null)&&this.projEnrl.equals(rhs.projEnrl))))&&((this.census2Date == rhs.census2Date)||((this.census2Date!= null)&&this.census2Date.equals(rhs.census2Date))))&&((this.holdSsrresvMaxEnrl == rhs.holdSsrresvMaxEnrl)||((this.holdSsrresvMaxEnrl!= null)&&this.holdSsrresvMaxEnrl.equals(rhs.holdSsrresvMaxEnrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.maxEnrl == rhs.maxEnrl)||((this.maxEnrl!= null)&&this.maxEnrl.equals(rhs.maxEnrl))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
