
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
    "rrrareqStatDate",
    "rrrareqTreqCode",
    "displayStudName",
    "rrrareqFundCode",
    "rrrareqPeriod",
    "displayTreqDesc",
    "displayStudCode",
    "rrrareqTrstCode"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirementsMassEntry100PostResponse {

    /**
     * Status Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rrrareqStatDate")
    private Date rrrareqStatDate;
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
     * Student Name
     * <p>
     * 
     * 
     */
    @JsonProperty("displayStudName")
    private String displayStudName;
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
    @JsonProperty("displayTreqDesc")
    private String displayTreqDesc;
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
     * Status Code
     * <p>
     * Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTrstCode")
    @JsonPropertyDescription("Lookup lineage reference object : rtvtrst")
    private String rrrareqTrstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rrrareqStatDate")
    public Date getRrrareqStatDate() {
        return rrrareqStatDate;
    }

    /**
     * Status Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rrrareqStatDate")
    public void setRrrareqStatDate(Date rrrareqStatDate) {
        this.rrrareqStatDate = rrrareqStatDate;
    }

    public ApplicantRequirementsMassEntry100PostResponse withRrrareqStatDate(Date rrrareqStatDate) {
        this.rrrareqStatDate = rrrareqStatDate;
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

    public ApplicantRequirementsMassEntry100PostResponse withRrrareqTreqCode(String rrrareqTreqCode) {
        this.rrrareqTreqCode = rrrareqTreqCode;
        return this;
    }

    /**
     * Student Name
     * <p>
     * 
     * 
     */
    @JsonProperty("displayStudName")
    public String getDisplayStudName() {
        return displayStudName;
    }

    /**
     * Student Name
     * <p>
     * 
     * 
     */
    @JsonProperty("displayStudName")
    public void setDisplayStudName(String displayStudName) {
        this.displayStudName = displayStudName;
    }

    public ApplicantRequirementsMassEntry100PostResponse withDisplayStudName(String displayStudName) {
        this.displayStudName = displayStudName;
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

    public ApplicantRequirementsMassEntry100PostResponse withRrrareqFundCode(String rrrareqFundCode) {
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

    public ApplicantRequirementsMassEntry100PostResponse withRrrareqPeriod(String rrrareqPeriod) {
        this.rrrareqPeriod = rrrareqPeriod;
        return this;
    }

    @JsonProperty("displayTreqDesc")
    public String getDisplayTreqDesc() {
        return displayTreqDesc;
    }

    @JsonProperty("displayTreqDesc")
    public void setDisplayTreqDesc(String displayTreqDesc) {
        this.displayTreqDesc = displayTreqDesc;
    }

    public ApplicantRequirementsMassEntry100PostResponse withDisplayTreqDesc(String displayTreqDesc) {
        this.displayTreqDesc = displayTreqDesc;
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

    public ApplicantRequirementsMassEntry100PostResponse withDisplayStudCode(String displayStudCode) {
        this.displayStudCode = displayStudCode;
        return this;
    }

    /**
     * Status Code
     * <p>
     * Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTrstCode")
    public String getRrrareqTrstCode() {
        return rrrareqTrstCode;
    }

    /**
     * Status Code
     * <p>
     * Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTrstCode")
    public void setRrrareqTrstCode(String rrrareqTrstCode) {
        this.rrrareqTrstCode = rrrareqTrstCode;
    }

    public ApplicantRequirementsMassEntry100PostResponse withRrrareqTrstCode(String rrrareqTrstCode) {
        this.rrrareqTrstCode = rrrareqTrstCode;
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

    public ApplicantRequirementsMassEntry100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirementsMassEntry100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rrrareqStatDate");
        sb.append('=');
        sb.append(((this.rrrareqStatDate == null)?"<null>":this.rrrareqStatDate));
        sb.append(',');
        sb.append("rrrareqTreqCode");
        sb.append('=');
        sb.append(((this.rrrareqTreqCode == null)?"<null>":this.rrrareqTreqCode));
        sb.append(',');
        sb.append("displayStudName");
        sb.append('=');
        sb.append(((this.displayStudName == null)?"<null>":this.displayStudName));
        sb.append(',');
        sb.append("rrrareqFundCode");
        sb.append('=');
        sb.append(((this.rrrareqFundCode == null)?"<null>":this.rrrareqFundCode));
        sb.append(',');
        sb.append("rrrareqPeriod");
        sb.append('=');
        sb.append(((this.rrrareqPeriod == null)?"<null>":this.rrrareqPeriod));
        sb.append(',');
        sb.append("displayTreqDesc");
        sb.append('=');
        sb.append(((this.displayTreqDesc == null)?"<null>":this.displayTreqDesc));
        sb.append(',');
        sb.append("displayStudCode");
        sb.append('=');
        sb.append(((this.displayStudCode == null)?"<null>":this.displayStudCode));
        sb.append(',');
        sb.append("rrrareqTrstCode");
        sb.append('=');
        sb.append(((this.rrrareqTrstCode == null)?"<null>":this.rrrareqTrstCode));
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
        result = ((result* 31)+((this.rrrareqStatDate == null)? 0 :this.rrrareqStatDate.hashCode()));
        result = ((result* 31)+((this.rrrareqTreqCode == null)? 0 :this.rrrareqTreqCode.hashCode()));
        result = ((result* 31)+((this.displayStudName == null)? 0 :this.displayStudName.hashCode()));
        result = ((result* 31)+((this.rrrareqFundCode == null)? 0 :this.rrrareqFundCode.hashCode()));
        result = ((result* 31)+((this.rrrareqPeriod == null)? 0 :this.rrrareqPeriod.hashCode()));
        result = ((result* 31)+((this.displayTreqDesc == null)? 0 :this.displayTreqDesc.hashCode()));
        result = ((result* 31)+((this.displayStudCode == null)? 0 :this.displayStudCode.hashCode()));
        result = ((result* 31)+((this.rrrareqTrstCode == null)? 0 :this.rrrareqTrstCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirementsMassEntry100PostResponse) == false) {
            return false;
        }
        ApplicantRequirementsMassEntry100PostResponse rhs = ((ApplicantRequirementsMassEntry100PostResponse) other);
        return ((((((((((this.rrrareqStatDate == rhs.rrrareqStatDate)||((this.rrrareqStatDate!= null)&&this.rrrareqStatDate.equals(rhs.rrrareqStatDate)))&&((this.rrrareqTreqCode == rhs.rrrareqTreqCode)||((this.rrrareqTreqCode!= null)&&this.rrrareqTreqCode.equals(rhs.rrrareqTreqCode))))&&((this.displayStudName == rhs.displayStudName)||((this.displayStudName!= null)&&this.displayStudName.equals(rhs.displayStudName))))&&((this.rrrareqFundCode == rhs.rrrareqFundCode)||((this.rrrareqFundCode!= null)&&this.rrrareqFundCode.equals(rhs.rrrareqFundCode))))&&((this.rrrareqPeriod == rhs.rrrareqPeriod)||((this.rrrareqPeriod!= null)&&this.rrrareqPeriod.equals(rhs.rrrareqPeriod))))&&((this.displayTreqDesc == rhs.displayTreqDesc)||((this.displayTreqDesc!= null)&&this.displayTreqDesc.equals(rhs.displayTreqDesc))))&&((this.displayStudCode == rhs.displayStudCode)||((this.displayStudCode!= null)&&this.displayStudCode.equals(rhs.displayStudCode))))&&((this.rrrareqTrstCode == rhs.rrrareqTrstCode)||((this.rrrareqTrstCode!= null)&&this.rrrareqTrstCode.equals(rhs.rrrareqTrstCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
