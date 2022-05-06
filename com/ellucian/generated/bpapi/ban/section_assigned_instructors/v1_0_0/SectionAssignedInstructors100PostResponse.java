
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
    "rwname",
    "workload",
    "category",
    "idno",
    "percentSess",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class SectionAssignedInstructors100PostResponse {

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
    @JsonProperty("rwname")
    private String rwname;
    /**
     * Instructional Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("workload")
    private Double workload;
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
     * Percent of Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_SESS")
    private Double percentSess;
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

    public SectionAssignedInstructors100PostResponse withPercentResponse(Double percentResponse) {
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

    public SectionAssignedInstructors100PostResponse withOverRide(String overRide) {
        this.overRide = overRide;
        return this;
    }

    @JsonProperty("rwname")
    public String getRwname() {
        return rwname;
    }

    @JsonProperty("rwname")
    public void setRwname(String rwname) {
        this.rwname = rwname;
    }

    public SectionAssignedInstructors100PostResponse withRwname(String rwname) {
        this.rwname = rwname;
        return this;
    }

    /**
     * Instructional Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("workload")
    public Double getWorkload() {
        return workload;
    }

    /**
     * Instructional Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("workload")
    public void setWorkload(Double workload) {
        this.workload = workload;
    }

    public SectionAssignedInstructors100PostResponse withWorkload(Double workload) {
        this.workload = workload;
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

    public SectionAssignedInstructors100PostResponse withCategory(String category) {
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

    public SectionAssignedInstructors100PostResponse withIdno(String idno) {
        this.idno = idno;
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

    public SectionAssignedInstructors100PostResponse withPercentSess(Double percentSess) {
        this.percentSess = percentSess;
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

    public SectionAssignedInstructors100PostResponse withPrimaryInd(String primaryInd) {
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

    public SectionAssignedInstructors100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionAssignedInstructors100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("percentResponse");
        sb.append('=');
        sb.append(((this.percentResponse == null)?"<null>":this.percentResponse));
        sb.append(',');
        sb.append("overRide");
        sb.append('=');
        sb.append(((this.overRide == null)?"<null>":this.overRide));
        sb.append(',');
        sb.append("rwname");
        sb.append('=');
        sb.append(((this.rwname == null)?"<null>":this.rwname));
        sb.append(',');
        sb.append("workload");
        sb.append('=');
        sb.append(((this.workload == null)?"<null>":this.workload));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("idno");
        sb.append('=');
        sb.append(((this.idno == null)?"<null>":this.idno));
        sb.append(',');
        sb.append("percentSess");
        sb.append('=');
        sb.append(((this.percentSess == null)?"<null>":this.percentSess));
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
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
        result = ((result* 31)+((this.workload == null)? 0 :this.workload.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.idno == null)? 0 :this.idno.hashCode()));
        result = ((result* 31)+((this.percentSess == null)? 0 :this.percentSess.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionAssignedInstructors100PostResponse) == false) {
            return false;
        }
        SectionAssignedInstructors100PostResponse rhs = ((SectionAssignedInstructors100PostResponse) other);
        return ((((((((((this.percentResponse == rhs.percentResponse)||((this.percentResponse!= null)&&this.percentResponse.equals(rhs.percentResponse)))&&((this.overRide == rhs.overRide)||((this.overRide!= null)&&this.overRide.equals(rhs.overRide))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.workload == rhs.workload)||((this.workload!= null)&&this.workload.equals(rhs.workload))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.idno == rhs.idno)||((this.idno!= null)&&this.idno.equals(rhs.idno))))&&((this.percentSess == rhs.percentSess)||((this.percentSess!= null)&&this.percentSess.equals(rhs.percentSess))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
