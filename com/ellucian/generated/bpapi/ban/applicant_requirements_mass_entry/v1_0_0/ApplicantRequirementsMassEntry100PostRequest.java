
package com.ellucian.generated.bpapi.ban.applicant_requirements_mass_entry.v1_0_0;

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
    "keyblckFundCode",
    "keyblckAidyCode",
    "keyblckTreqCode",
    "keyblckPeriod",
    "rrrareqTreqCode",
    "keyblckTrstCode",
    "rrrareqFundCode",
    "rrrareqPeriod",
    "displayStudCode",
    "keyblckStatDate"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirementsMassEntry100PostRequest {

    /**
     * Fund Code
     * <p>
     * Lineage reference object : keyblckFundCode, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("keyblckFundCode")
    @JsonPropertyDescription("Lineage reference object : keyblckFundCode, Lookup lineage reference object : rfrbase,rfraspc")
    private String keyblckFundCode;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private String keyblckAidyCode;
    /**
     * Requirement Code
     * <p>
     * Lineage reference object : keyblckTreqCode
     * 
     */
    @JsonProperty("keyblckTreqCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTreqCode")
    private String keyblckTreqCode;
    /**
     * Period
     * <p>
     * Lineage reference object : keyblckPeriod, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("keyblckPeriod")
    @JsonPropertyDescription("Lineage reference object : keyblckPeriod, Lookup lineage reference object : robprds")
    private String keyblckPeriod;
    /**
     * Requirement Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTreqCode")
    private String rrrareqTreqCode;
    /**
     * Status Code
     * <p>
     * Lineage reference object : keyblckTrstCode, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("keyblckTrstCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTrstCode, Lookup lineage reference object : rtvtrst")
    private String keyblckTrstCode;
    /**
     * Fund Code
     * <p>
     * Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("rrrareqFundCode")
    @JsonPropertyDescription("Lookup lineage reference object : rfrbase,rfraspc")
    private String rrrareqFundCode;
    /**
     * Period
     * <p>
     * Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("rrrareqPeriod")
    @JsonPropertyDescription("Lookup lineage reference object : robprds")
    private String rrrareqPeriod;
    /**
     * Student ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayStudCode")
    private String displayStudCode;
    /**
     * Status Date
     * <p>
     * Lineage reference object : keyblckStatDate
     * 
     */
    @JsonProperty("keyblckStatDate")
    @JsonPropertyDescription("Lineage reference object : keyblckStatDate")
    private Date keyblckStatDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fund Code
     * <p>
     * Lineage reference object : keyblckFundCode, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("keyblckFundCode")
    public String getKeyblckFundCode() {
        return keyblckFundCode;
    }

    /**
     * Fund Code
     * <p>
     * Lineage reference object : keyblckFundCode, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("keyblckFundCode")
    public void setKeyblckFundCode(String keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
    }

    public ApplicantRequirementsMassEntry100PostRequest withKeyblckFundCode(String keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public ApplicantRequirementsMassEntry100PostRequest withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Requirement Code
     * <p>
     * Lineage reference object : keyblckTreqCode
     * 
     */
    @JsonProperty("keyblckTreqCode")
    public String getKeyblckTreqCode() {
        return keyblckTreqCode;
    }

    /**
     * Requirement Code
     * <p>
     * Lineage reference object : keyblckTreqCode
     * 
     */
    @JsonProperty("keyblckTreqCode")
    public void setKeyblckTreqCode(String keyblckTreqCode) {
        this.keyblckTreqCode = keyblckTreqCode;
    }

    public ApplicantRequirementsMassEntry100PostRequest withKeyblckTreqCode(String keyblckTreqCode) {
        this.keyblckTreqCode = keyblckTreqCode;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : keyblckPeriod, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("keyblckPeriod")
    public String getKeyblckPeriod() {
        return keyblckPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : keyblckPeriod, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("keyblckPeriod")
    public void setKeyblckPeriod(String keyblckPeriod) {
        this.keyblckPeriod = keyblckPeriod;
    }

    public ApplicantRequirementsMassEntry100PostRequest withKeyblckPeriod(String keyblckPeriod) {
        this.keyblckPeriod = keyblckPeriod;
        return this;
    }

    /**
     * Requirement Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTreqCode")
    public String getRrrareqTreqCode() {
        return rrrareqTreqCode;
    }

    /**
     * Requirement Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTreqCode")
    public void setRrrareqTreqCode(String rrrareqTreqCode) {
        this.rrrareqTreqCode = rrrareqTreqCode;
    }

    public ApplicantRequirementsMassEntry100PostRequest withRrrareqTreqCode(String rrrareqTreqCode) {
        this.rrrareqTreqCode = rrrareqTreqCode;
        return this;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : keyblckTrstCode, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("keyblckTrstCode")
    public String getKeyblckTrstCode() {
        return keyblckTrstCode;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : keyblckTrstCode, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("keyblckTrstCode")
    public void setKeyblckTrstCode(String keyblckTrstCode) {
        this.keyblckTrstCode = keyblckTrstCode;
    }

    public ApplicantRequirementsMassEntry100PostRequest withKeyblckTrstCode(String keyblckTrstCode) {
        this.keyblckTrstCode = keyblckTrstCode;
        return this;
    }

    /**
     * Fund Code
     * <p>
     * Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("rrrareqFundCode")
    public String getRrrareqFundCode() {
        return rrrareqFundCode;
    }

    /**
     * Fund Code
     * <p>
     * Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("rrrareqFundCode")
    public void setRrrareqFundCode(String rrrareqFundCode) {
        this.rrrareqFundCode = rrrareqFundCode;
    }

    public ApplicantRequirementsMassEntry100PostRequest withRrrareqFundCode(String rrrareqFundCode) {
        this.rrrareqFundCode = rrrareqFundCode;
        return this;
    }

    /**
     * Period
     * <p>
     * Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("rrrareqPeriod")
    public String getRrrareqPeriod() {
        return rrrareqPeriod;
    }

    /**
     * Period
     * <p>
     * Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("rrrareqPeriod")
    public void setRrrareqPeriod(String rrrareqPeriod) {
        this.rrrareqPeriod = rrrareqPeriod;
    }

    public ApplicantRequirementsMassEntry100PostRequest withRrrareqPeriod(String rrrareqPeriod) {
        this.rrrareqPeriod = rrrareqPeriod;
        return this;
    }

    /**
     * Student ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayStudCode")
    public String getDisplayStudCode() {
        return displayStudCode;
    }

    /**
     * Student ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayStudCode")
    public void setDisplayStudCode(String displayStudCode) {
        this.displayStudCode = displayStudCode;
    }

    public ApplicantRequirementsMassEntry100PostRequest withDisplayStudCode(String displayStudCode) {
        this.displayStudCode = displayStudCode;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : keyblckStatDate
     * 
     */
    @JsonProperty("keyblckStatDate")
    public Date getKeyblckStatDate() {
        return keyblckStatDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : keyblckStatDate
     * 
     */
    @JsonProperty("keyblckStatDate")
    public void setKeyblckStatDate(Date keyblckStatDate) {
        this.keyblckStatDate = keyblckStatDate;
    }

    public ApplicantRequirementsMassEntry100PostRequest withKeyblckStatDate(Date keyblckStatDate) {
        this.keyblckStatDate = keyblckStatDate;
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

    public ApplicantRequirementsMassEntry100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirementsMassEntry100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckFundCode");
        sb.append('=');
        sb.append(((this.keyblckFundCode == null)?"<null>":this.keyblckFundCode));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("keyblckTreqCode");
        sb.append('=');
        sb.append(((this.keyblckTreqCode == null)?"<null>":this.keyblckTreqCode));
        sb.append(',');
        sb.append("keyblckPeriod");
        sb.append('=');
        sb.append(((this.keyblckPeriod == null)?"<null>":this.keyblckPeriod));
        sb.append(',');
        sb.append("rrrareqTreqCode");
        sb.append('=');
        sb.append(((this.rrrareqTreqCode == null)?"<null>":this.rrrareqTreqCode));
        sb.append(',');
        sb.append("keyblckTrstCode");
        sb.append('=');
        sb.append(((this.keyblckTrstCode == null)?"<null>":this.keyblckTrstCode));
        sb.append(',');
        sb.append("rrrareqFundCode");
        sb.append('=');
        sb.append(((this.rrrareqFundCode == null)?"<null>":this.rrrareqFundCode));
        sb.append(',');
        sb.append("rrrareqPeriod");
        sb.append('=');
        sb.append(((this.rrrareqPeriod == null)?"<null>":this.rrrareqPeriod));
        sb.append(',');
        sb.append("displayStudCode");
        sb.append('=');
        sb.append(((this.displayStudCode == null)?"<null>":this.displayStudCode));
        sb.append(',');
        sb.append("keyblckStatDate");
        sb.append('=');
        sb.append(((this.keyblckStatDate == null)?"<null>":this.keyblckStatDate));
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
        result = ((result* 31)+((this.keyblckFundCode == null)? 0 :this.keyblckFundCode.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.keyblckTreqCode == null)? 0 :this.keyblckTreqCode.hashCode()));
        result = ((result* 31)+((this.keyblckPeriod == null)? 0 :this.keyblckPeriod.hashCode()));
        result = ((result* 31)+((this.rrrareqTreqCode == null)? 0 :this.rrrareqTreqCode.hashCode()));
        result = ((result* 31)+((this.keyblckTrstCode == null)? 0 :this.keyblckTrstCode.hashCode()));
        result = ((result* 31)+((this.rrrareqFundCode == null)? 0 :this.rrrareqFundCode.hashCode()));
        result = ((result* 31)+((this.rrrareqPeriod == null)? 0 :this.rrrareqPeriod.hashCode()));
        result = ((result* 31)+((this.displayStudCode == null)? 0 :this.displayStudCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckStatDate == null)? 0 :this.keyblckStatDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirementsMassEntry100PostRequest) == false) {
            return false;
        }
        ApplicantRequirementsMassEntry100PostRequest rhs = ((ApplicantRequirementsMassEntry100PostRequest) other);
        return ((((((((((((this.keyblckFundCode == rhs.keyblckFundCode)||((this.keyblckFundCode!= null)&&this.keyblckFundCode.equals(rhs.keyblckFundCode)))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.keyblckTreqCode == rhs.keyblckTreqCode)||((this.keyblckTreqCode!= null)&&this.keyblckTreqCode.equals(rhs.keyblckTreqCode))))&&((this.keyblckPeriod == rhs.keyblckPeriod)||((this.keyblckPeriod!= null)&&this.keyblckPeriod.equals(rhs.keyblckPeriod))))&&((this.rrrareqTreqCode == rhs.rrrareqTreqCode)||((this.rrrareqTreqCode!= null)&&this.rrrareqTreqCode.equals(rhs.rrrareqTreqCode))))&&((this.keyblckTrstCode == rhs.keyblckTrstCode)||((this.keyblckTrstCode!= null)&&this.keyblckTrstCode.equals(rhs.keyblckTrstCode))))&&((this.rrrareqFundCode == rhs.rrrareqFundCode)||((this.rrrareqFundCode!= null)&&this.rrrareqFundCode.equals(rhs.rrrareqFundCode))))&&((this.rrrareqPeriod == rhs.rrrareqPeriod)||((this.rrrareqPeriod!= null)&&this.rrrareqPeriod.equals(rhs.rrrareqPeriod))))&&((this.displayStudCode == rhs.displayStudCode)||((this.displayStudCode!= null)&&this.displayStudCode.equals(rhs.displayStudCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckStatDate == rhs.keyblckStatDate)||((this.keyblckStatDate!= null)&&this.keyblckStatDate.equals(rhs.keyblckStatDate))));
    }

}
