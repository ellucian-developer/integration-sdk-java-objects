
package com.ellucian.generated.bpapi.ban.grant_maintenance_pass_through_agency.v1_0_0;

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
    "displayFrbgrntCode",
    "displayPropCode",
    "agencyCode",
    "federalFundPercent",
    "sponsorId"
})
@Generated("jsonschema2pojo")
public class GrantMaintenancePassThroughAgency100QapiPost {

    @JsonProperty("displayFrbgrntCode")
    private String displayFrbgrntCode;
    @JsonProperty("displayPropCode")
    private String displayPropCode;
    /**
     * Agency Code
     * <p>
     * Lookup lineage reference object : ftvagcy,spriden
     * 
     */
    @JsonProperty("agencyCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvagcy,spriden")
    private String agencyCode;
    /**
     * Percentage
     * <p>
     * Lineage reference object : FRRAGPT_FEDERAL_FUND_PERCENT
     * 
     */
    @JsonProperty("federalFundPercent")
    @JsonPropertyDescription("Lineage reference object : FRRAGPT_FEDERAL_FUND_PERCENT")
    private Double federalFundPercent;
    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRRAGPT_SPONSOR_ID
     * 
     */
    @JsonProperty("sponsorId")
    @JsonPropertyDescription("Lineage reference object : FRRAGPT_SPONSOR_ID")
    private String sponsorId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayFrbgrntCode")
    public String getDisplayFrbgrntCode() {
        return displayFrbgrntCode;
    }

    @JsonProperty("displayFrbgrntCode")
    public void setDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
    }

    public GrantMaintenancePassThroughAgency100QapiPost withDisplayFrbgrntCode(String displayFrbgrntCode) {
        this.displayFrbgrntCode = displayFrbgrntCode;
        return this;
    }

    @JsonProperty("displayPropCode")
    public String getDisplayPropCode() {
        return displayPropCode;
    }

    @JsonProperty("displayPropCode")
    public void setDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
    }

    public GrantMaintenancePassThroughAgency100QapiPost withDisplayPropCode(String displayPropCode) {
        this.displayPropCode = displayPropCode;
        return this;
    }

    /**
     * Agency Code
     * <p>
     * Lookup lineage reference object : ftvagcy,spriden
     * 
     */
    @JsonProperty("agencyCode")
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Agency Code
     * <p>
     * Lookup lineage reference object : ftvagcy,spriden
     * 
     */
    @JsonProperty("agencyCode")
    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public GrantMaintenancePassThroughAgency100QapiPost withAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
        return this;
    }

    /**
     * Percentage
     * <p>
     * Lineage reference object : FRRAGPT_FEDERAL_FUND_PERCENT
     * 
     */
    @JsonProperty("federalFundPercent")
    public Double getFederalFundPercent() {
        return federalFundPercent;
    }

    /**
     * Percentage
     * <p>
     * Lineage reference object : FRRAGPT_FEDERAL_FUND_PERCENT
     * 
     */
    @JsonProperty("federalFundPercent")
    public void setFederalFundPercent(Double federalFundPercent) {
        this.federalFundPercent = federalFundPercent;
    }

    public GrantMaintenancePassThroughAgency100QapiPost withFederalFundPercent(Double federalFundPercent) {
        this.federalFundPercent = federalFundPercent;
        return this;
    }

    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRRAGPT_SPONSOR_ID
     * 
     */
    @JsonProperty("sponsorId")
    public String getSponsorId() {
        return sponsorId;
    }

    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRRAGPT_SPONSOR_ID
     * 
     */
    @JsonProperty("sponsorId")
    public void setSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
    }

    public GrantMaintenancePassThroughAgency100QapiPost withSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
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

    public GrantMaintenancePassThroughAgency100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenancePassThroughAgency100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayFrbgrntCode");
        sb.append('=');
        sb.append(((this.displayFrbgrntCode == null)?"<null>":this.displayFrbgrntCode));
        sb.append(',');
        sb.append("displayPropCode");
        sb.append('=');
        sb.append(((this.displayPropCode == null)?"<null>":this.displayPropCode));
        sb.append(',');
        sb.append("agencyCode");
        sb.append('=');
        sb.append(((this.agencyCode == null)?"<null>":this.agencyCode));
        sb.append(',');
        sb.append("federalFundPercent");
        sb.append('=');
        sb.append(((this.federalFundPercent == null)?"<null>":this.federalFundPercent));
        sb.append(',');
        sb.append("sponsorId");
        sb.append('=');
        sb.append(((this.sponsorId == null)?"<null>":this.sponsorId));
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
        result = ((result* 31)+((this.displayFrbgrntCode == null)? 0 :this.displayFrbgrntCode.hashCode()));
        result = ((result* 31)+((this.federalFundPercent == null)? 0 :this.federalFundPercent.hashCode()));
        result = ((result* 31)+((this.displayPropCode == null)? 0 :this.displayPropCode.hashCode()));
        result = ((result* 31)+((this.sponsorId == null)? 0 :this.sponsorId.hashCode()));
        result = ((result* 31)+((this.agencyCode == null)? 0 :this.agencyCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantMaintenancePassThroughAgency100QapiPost) == false) {
            return false;
        }
        GrantMaintenancePassThroughAgency100QapiPost rhs = ((GrantMaintenancePassThroughAgency100QapiPost) other);
        return (((((((this.displayFrbgrntCode == rhs.displayFrbgrntCode)||((this.displayFrbgrntCode!= null)&&this.displayFrbgrntCode.equals(rhs.displayFrbgrntCode)))&&((this.federalFundPercent == rhs.federalFundPercent)||((this.federalFundPercent!= null)&&this.federalFundPercent.equals(rhs.federalFundPercent))))&&((this.displayPropCode == rhs.displayPropCode)||((this.displayPropCode!= null)&&this.displayPropCode.equals(rhs.displayPropCode))))&&((this.sponsorId == rhs.sponsorId)||((this.sponsorId!= null)&&this.sponsorId.equals(rhs.sponsorId))))&&((this.agencyCode == rhs.agencyCode)||((this.agencyCode!= null)&&this.agencyCode.equals(rhs.agencyCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
