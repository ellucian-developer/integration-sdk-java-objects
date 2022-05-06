
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
    "federalFundPercent",
    "agcyName",
    "sponsorId",
    "agencyCode"
})
@Generated("jsonschema2pojo")
public class Frragpt {

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
     * Agency Name
     * <p>
     * 
     * 
     */
    @JsonProperty("agcyName")
    private String agcyName;
    /**
     * Sponsor ID
     * <p>
     * Lineage reference object : FRRAGPT_SPONSOR_ID
     * 
     */
    @JsonProperty("sponsorId")
    @JsonPropertyDescription("Lineage reference object : FRRAGPT_SPONSOR_ID")
    private String sponsorId;
    /**
     * Agency Code
     * <p>
     * Lookup lineage reference object : ftvagcy,spriden
     * 
     */
    @JsonProperty("agencyCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvagcy,spriden")
    private String agencyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Frragpt withFederalFundPercent(Double federalFundPercent) {
        this.federalFundPercent = federalFundPercent;
        return this;
    }

    /**
     * Agency Name
     * <p>
     * 
     * 
     */
    @JsonProperty("agcyName")
    public String getAgcyName() {
        return agcyName;
    }

    /**
     * Agency Name
     * <p>
     * 
     * 
     */
    @JsonProperty("agcyName")
    public void setAgcyName(String agcyName) {
        this.agcyName = agcyName;
    }

    public Frragpt withAgcyName(String agcyName) {
        this.agcyName = agcyName;
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

    public Frragpt withSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
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

    public Frragpt withAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
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

    public Frragpt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Frragpt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("federalFundPercent");
        sb.append('=');
        sb.append(((this.federalFundPercent == null)?"<null>":this.federalFundPercent));
        sb.append(',');
        sb.append("agcyName");
        sb.append('=');
        sb.append(((this.agcyName == null)?"<null>":this.agcyName));
        sb.append(',');
        sb.append("sponsorId");
        sb.append('=');
        sb.append(((this.sponsorId == null)?"<null>":this.sponsorId));
        sb.append(',');
        sb.append("agencyCode");
        sb.append('=');
        sb.append(((this.agencyCode == null)?"<null>":this.agencyCode));
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
        result = ((result* 31)+((this.federalFundPercent == null)? 0 :this.federalFundPercent.hashCode()));
        result = ((result* 31)+((this.agencyCode == null)? 0 :this.agencyCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.agcyName == null)? 0 :this.agcyName.hashCode()));
        result = ((result* 31)+((this.sponsorId == null)? 0 :this.sponsorId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Frragpt) == false) {
            return false;
        }
        Frragpt rhs = ((Frragpt) other);
        return ((((((this.federalFundPercent == rhs.federalFundPercent)||((this.federalFundPercent!= null)&&this.federalFundPercent.equals(rhs.federalFundPercent)))&&((this.agencyCode == rhs.agencyCode)||((this.agencyCode!= null)&&this.agencyCode.equals(rhs.agencyCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.agcyName == rhs.agcyName)||((this.agcyName!= null)&&this.agcyName.equals(rhs.agcyName))))&&((this.sponsorId == rhs.sponsorId)||((this.sponsorId!= null)&&this.sponsorId.equals(rhs.sponsorId))));
    }

}
