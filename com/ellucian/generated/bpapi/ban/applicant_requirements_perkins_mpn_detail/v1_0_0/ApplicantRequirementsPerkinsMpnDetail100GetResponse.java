
package com.ellucian.generated.bpapi.ban.applicant_requirements_perkins_mpn_detail.v1_0_0;

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
    "rrrareqEstDate",
    "rrrareqTreqCode",
    "rrrareqPerkMpnExpDate",
    "displayActive",
    "rrrareqFundCode",
    "rrrareqTreqDesc",
    "rrrareqTrstCode",
    "rrrareqSatisfiedDate",
    "rfrbaseFundTitle",
    "rrrareqStatDate",
    "rrrareqSatInd",
    "rrrareqMpnFirstDisbDate",
    "rtvtrstDesc",
    "rrrareqMpnSignedDate"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirementsPerkinsMpnDetail100GetResponse {

    /**
     * Established Date
     * <p>
     * Lineage reference object : RRRAREQ_EST_DATE
     * 
     */
    @JsonProperty("rrrareqEstDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_EST_DATE")
    private Date rrrareqEstDate;
    /**
     * Requirement
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_CODE
     * 
     */
    @JsonProperty("rrrareqTreqCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_TREQ_CODE")
    private String rrrareqTreqCode;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RRRAREQ_PERK_MPN_EXP_DATE
     * 
     */
    @JsonProperty("rrrareqPerkMpnExpDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_PERK_MPN_EXP_DATE")
    private Date rrrareqPerkMpnExpDate;
    /**
     * Active/Inactive Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("displayActive")
    private String displayActive;
    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE
     * 
     */
    @JsonProperty("rrrareqFundCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_FUND_CODE")
    private String rrrareqFundCode;
    @JsonProperty("rrrareqTreqDesc")
    private String rrrareqTreqDesc;
    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("rrrareqTrstCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst")
    private String rrrareqTrstCode;
    /**
     * Satisfied Date
     * <p>
     * Lineage reference object : RRRAREQ_SATISFIED_DATE
     * 
     */
    @JsonProperty("rrrareqSatisfiedDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SATISFIED_DATE")
    private Date rrrareqSatisfiedDate;
    @JsonProperty("rfrbaseFundTitle")
    private String rfrbaseFundTitle;
    /**
     * Requirement Status Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * 
     */
    @JsonProperty("rrrareqStatDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_STAT_DATE")
    private Date rrrareqStatDate;
    /**
     * Satisfied
     * <p>
     * Lineage reference object : RRRAREQ_SAT_IND
     * 
     */
    @JsonProperty("rrrareqSatInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SAT_IND")
    private String rrrareqSatInd;
    /**
     * MPN First Disbursement Date
     * <p>
     * Lineage reference object : RRRAREQ_MPN_FIRST_DISB_DATE
     * 
     */
    @JsonProperty("rrrareqMpnFirstDisbDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_MPN_FIRST_DISB_DATE")
    private Date rrrareqMpnFirstDisbDate;
    @JsonProperty("rtvtrstDesc")
    private String rtvtrstDesc;
    /**
     * Signed Date
     * <p>
     * Lineage reference object : RRRAREQ_MPN_SIGNED_DATE
     * 
     */
    @JsonProperty("rrrareqMpnSignedDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_MPN_SIGNED_DATE")
    private Date rrrareqMpnSignedDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Established Date
     * <p>
     * Lineage reference object : RRRAREQ_EST_DATE
     * 
     */
    @JsonProperty("rrrareqEstDate")
    public Date getRrrareqEstDate() {
        return rrrareqEstDate;
    }

    /**
     * Established Date
     * <p>
     * Lineage reference object : RRRAREQ_EST_DATE
     * 
     */
    @JsonProperty("rrrareqEstDate")
    public void setRrrareqEstDate(Date rrrareqEstDate) {
        this.rrrareqEstDate = rrrareqEstDate;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqEstDate(Date rrrareqEstDate) {
        this.rrrareqEstDate = rrrareqEstDate;
        return this;
    }

    /**
     * Requirement
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_CODE
     * 
     */
    @JsonProperty("rrrareqTreqCode")
    public String getRrrareqTreqCode() {
        return rrrareqTreqCode;
    }

    /**
     * Requirement
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_CODE
     * 
     */
    @JsonProperty("rrrareqTreqCode")
    public void setRrrareqTreqCode(String rrrareqTreqCode) {
        this.rrrareqTreqCode = rrrareqTreqCode;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqTreqCode(String rrrareqTreqCode) {
        this.rrrareqTreqCode = rrrareqTreqCode;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RRRAREQ_PERK_MPN_EXP_DATE
     * 
     */
    @JsonProperty("rrrareqPerkMpnExpDate")
    public Date getRrrareqPerkMpnExpDate() {
        return rrrareqPerkMpnExpDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RRRAREQ_PERK_MPN_EXP_DATE
     * 
     */
    @JsonProperty("rrrareqPerkMpnExpDate")
    public void setRrrareqPerkMpnExpDate(Date rrrareqPerkMpnExpDate) {
        this.rrrareqPerkMpnExpDate = rrrareqPerkMpnExpDate;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqPerkMpnExpDate(Date rrrareqPerkMpnExpDate) {
        this.rrrareqPerkMpnExpDate = rrrareqPerkMpnExpDate;
        return this;
    }

    /**
     * Active/Inactive Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("displayActive")
    public String getDisplayActive() {
        return displayActive;
    }

    /**
     * Active/Inactive Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("displayActive")
    public void setDisplayActive(String displayActive) {
        this.displayActive = displayActive;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withDisplayActive(String displayActive) {
        this.displayActive = displayActive;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE
     * 
     */
    @JsonProperty("rrrareqFundCode")
    public String getRrrareqFundCode() {
        return rrrareqFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE
     * 
     */
    @JsonProperty("rrrareqFundCode")
    public void setRrrareqFundCode(String rrrareqFundCode) {
        this.rrrareqFundCode = rrrareqFundCode;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqFundCode(String rrrareqFundCode) {
        this.rrrareqFundCode = rrrareqFundCode;
        return this;
    }

    @JsonProperty("rrrareqTreqDesc")
    public String getRrrareqTreqDesc() {
        return rrrareqTreqDesc;
    }

    @JsonProperty("rrrareqTreqDesc")
    public void setRrrareqTreqDesc(String rrrareqTreqDesc) {
        this.rrrareqTreqDesc = rrrareqTreqDesc;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqTreqDesc(String rrrareqTreqDesc) {
        this.rrrareqTreqDesc = rrrareqTreqDesc;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("rrrareqTrstCode")
    public String getRrrareqTrstCode() {
        return rrrareqTrstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("rrrareqTrstCode")
    public void setRrrareqTrstCode(String rrrareqTrstCode) {
        this.rrrareqTrstCode = rrrareqTrstCode;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqTrstCode(String rrrareqTrstCode) {
        this.rrrareqTrstCode = rrrareqTrstCode;
        return this;
    }

    /**
     * Satisfied Date
     * <p>
     * Lineage reference object : RRRAREQ_SATISFIED_DATE
     * 
     */
    @JsonProperty("rrrareqSatisfiedDate")
    public Date getRrrareqSatisfiedDate() {
        return rrrareqSatisfiedDate;
    }

    /**
     * Satisfied Date
     * <p>
     * Lineage reference object : RRRAREQ_SATISFIED_DATE
     * 
     */
    @JsonProperty("rrrareqSatisfiedDate")
    public void setRrrareqSatisfiedDate(Date rrrareqSatisfiedDate) {
        this.rrrareqSatisfiedDate = rrrareqSatisfiedDate;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqSatisfiedDate(Date rrrareqSatisfiedDate) {
        this.rrrareqSatisfiedDate = rrrareqSatisfiedDate;
        return this;
    }

    @JsonProperty("rfrbaseFundTitle")
    public String getRfrbaseFundTitle() {
        return rfrbaseFundTitle;
    }

    @JsonProperty("rfrbaseFundTitle")
    public void setRfrbaseFundTitle(String rfrbaseFundTitle) {
        this.rfrbaseFundTitle = rfrbaseFundTitle;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRfrbaseFundTitle(String rfrbaseFundTitle) {
        this.rfrbaseFundTitle = rfrbaseFundTitle;
        return this;
    }

    /**
     * Requirement Status Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * 
     */
    @JsonProperty("rrrareqStatDate")
    public Date getRrrareqStatDate() {
        return rrrareqStatDate;
    }

    /**
     * Requirement Status Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * 
     */
    @JsonProperty("rrrareqStatDate")
    public void setRrrareqStatDate(Date rrrareqStatDate) {
        this.rrrareqStatDate = rrrareqStatDate;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqStatDate(Date rrrareqStatDate) {
        this.rrrareqStatDate = rrrareqStatDate;
        return this;
    }

    /**
     * Satisfied
     * <p>
     * Lineage reference object : RRRAREQ_SAT_IND
     * 
     */
    @JsonProperty("rrrareqSatInd")
    public String getRrrareqSatInd() {
        return rrrareqSatInd;
    }

    /**
     * Satisfied
     * <p>
     * Lineage reference object : RRRAREQ_SAT_IND
     * 
     */
    @JsonProperty("rrrareqSatInd")
    public void setRrrareqSatInd(String rrrareqSatInd) {
        this.rrrareqSatInd = rrrareqSatInd;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqSatInd(String rrrareqSatInd) {
        this.rrrareqSatInd = rrrareqSatInd;
        return this;
    }

    /**
     * MPN First Disbursement Date
     * <p>
     * Lineage reference object : RRRAREQ_MPN_FIRST_DISB_DATE
     * 
     */
    @JsonProperty("rrrareqMpnFirstDisbDate")
    public Date getRrrareqMpnFirstDisbDate() {
        return rrrareqMpnFirstDisbDate;
    }

    /**
     * MPN First Disbursement Date
     * <p>
     * Lineage reference object : RRRAREQ_MPN_FIRST_DISB_DATE
     * 
     */
    @JsonProperty("rrrareqMpnFirstDisbDate")
    public void setRrrareqMpnFirstDisbDate(Date rrrareqMpnFirstDisbDate) {
        this.rrrareqMpnFirstDisbDate = rrrareqMpnFirstDisbDate;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqMpnFirstDisbDate(Date rrrareqMpnFirstDisbDate) {
        this.rrrareqMpnFirstDisbDate = rrrareqMpnFirstDisbDate;
        return this;
    }

    @JsonProperty("rtvtrstDesc")
    public String getRtvtrstDesc() {
        return rtvtrstDesc;
    }

    @JsonProperty("rtvtrstDesc")
    public void setRtvtrstDesc(String rtvtrstDesc) {
        this.rtvtrstDesc = rtvtrstDesc;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRtvtrstDesc(String rtvtrstDesc) {
        this.rtvtrstDesc = rtvtrstDesc;
        return this;
    }

    /**
     * Signed Date
     * <p>
     * Lineage reference object : RRRAREQ_MPN_SIGNED_DATE
     * 
     */
    @JsonProperty("rrrareqMpnSignedDate")
    public Date getRrrareqMpnSignedDate() {
        return rrrareqMpnSignedDate;
    }

    /**
     * Signed Date
     * <p>
     * Lineage reference object : RRRAREQ_MPN_SIGNED_DATE
     * 
     */
    @JsonProperty("rrrareqMpnSignedDate")
    public void setRrrareqMpnSignedDate(Date rrrareqMpnSignedDate) {
        this.rrrareqMpnSignedDate = rrrareqMpnSignedDate;
    }

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withRrrareqMpnSignedDate(Date rrrareqMpnSignedDate) {
        this.rrrareqMpnSignedDate = rrrareqMpnSignedDate;
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

    public ApplicantRequirementsPerkinsMpnDetail100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirementsPerkinsMpnDetail100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rrrareqEstDate");
        sb.append('=');
        sb.append(((this.rrrareqEstDate == null)?"<null>":this.rrrareqEstDate));
        sb.append(',');
        sb.append("rrrareqTreqCode");
        sb.append('=');
        sb.append(((this.rrrareqTreqCode == null)?"<null>":this.rrrareqTreqCode));
        sb.append(',');
        sb.append("rrrareqPerkMpnExpDate");
        sb.append('=');
        sb.append(((this.rrrareqPerkMpnExpDate == null)?"<null>":this.rrrareqPerkMpnExpDate));
        sb.append(',');
        sb.append("displayActive");
        sb.append('=');
        sb.append(((this.displayActive == null)?"<null>":this.displayActive));
        sb.append(',');
        sb.append("rrrareqFundCode");
        sb.append('=');
        sb.append(((this.rrrareqFundCode == null)?"<null>":this.rrrareqFundCode));
        sb.append(',');
        sb.append("rrrareqTreqDesc");
        sb.append('=');
        sb.append(((this.rrrareqTreqDesc == null)?"<null>":this.rrrareqTreqDesc));
        sb.append(',');
        sb.append("rrrareqTrstCode");
        sb.append('=');
        sb.append(((this.rrrareqTrstCode == null)?"<null>":this.rrrareqTrstCode));
        sb.append(',');
        sb.append("rrrareqSatisfiedDate");
        sb.append('=');
        sb.append(((this.rrrareqSatisfiedDate == null)?"<null>":this.rrrareqSatisfiedDate));
        sb.append(',');
        sb.append("rfrbaseFundTitle");
        sb.append('=');
        sb.append(((this.rfrbaseFundTitle == null)?"<null>":this.rfrbaseFundTitle));
        sb.append(',');
        sb.append("rrrareqStatDate");
        sb.append('=');
        sb.append(((this.rrrareqStatDate == null)?"<null>":this.rrrareqStatDate));
        sb.append(',');
        sb.append("rrrareqSatInd");
        sb.append('=');
        sb.append(((this.rrrareqSatInd == null)?"<null>":this.rrrareqSatInd));
        sb.append(',');
        sb.append("rrrareqMpnFirstDisbDate");
        sb.append('=');
        sb.append(((this.rrrareqMpnFirstDisbDate == null)?"<null>":this.rrrareqMpnFirstDisbDate));
        sb.append(',');
        sb.append("rtvtrstDesc");
        sb.append('=');
        sb.append(((this.rtvtrstDesc == null)?"<null>":this.rtvtrstDesc));
        sb.append(',');
        sb.append("rrrareqMpnSignedDate");
        sb.append('=');
        sb.append(((this.rrrareqMpnSignedDate == null)?"<null>":this.rrrareqMpnSignedDate));
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
        result = ((result* 31)+((this.rrrareqEstDate == null)? 0 :this.rrrareqEstDate.hashCode()));
        result = ((result* 31)+((this.rrrareqTreqCode == null)? 0 :this.rrrareqTreqCode.hashCode()));
        result = ((result* 31)+((this.rrrareqPerkMpnExpDate == null)? 0 :this.rrrareqPerkMpnExpDate.hashCode()));
        result = ((result* 31)+((this.displayActive == null)? 0 :this.displayActive.hashCode()));
        result = ((result* 31)+((this.rrrareqFundCode == null)? 0 :this.rrrareqFundCode.hashCode()));
        result = ((result* 31)+((this.rrrareqTreqDesc == null)? 0 :this.rrrareqTreqDesc.hashCode()));
        result = ((result* 31)+((this.rrrareqTrstCode == null)? 0 :this.rrrareqTrstCode.hashCode()));
        result = ((result* 31)+((this.rrrareqSatisfiedDate == null)? 0 :this.rrrareqSatisfiedDate.hashCode()));
        result = ((result* 31)+((this.rfrbaseFundTitle == null)? 0 :this.rfrbaseFundTitle.hashCode()));
        result = ((result* 31)+((this.rrrareqStatDate == null)? 0 :this.rrrareqStatDate.hashCode()));
        result = ((result* 31)+((this.rrrareqSatInd == null)? 0 :this.rrrareqSatInd.hashCode()));
        result = ((result* 31)+((this.rrrareqMpnFirstDisbDate == null)? 0 :this.rrrareqMpnFirstDisbDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rtvtrstDesc == null)? 0 :this.rtvtrstDesc.hashCode()));
        result = ((result* 31)+((this.rrrareqMpnSignedDate == null)? 0 :this.rrrareqMpnSignedDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirementsPerkinsMpnDetail100GetResponse) == false) {
            return false;
        }
        ApplicantRequirementsPerkinsMpnDetail100GetResponse rhs = ((ApplicantRequirementsPerkinsMpnDetail100GetResponse) other);
        return ((((((((((((((((this.rrrareqEstDate == rhs.rrrareqEstDate)||((this.rrrareqEstDate!= null)&&this.rrrareqEstDate.equals(rhs.rrrareqEstDate)))&&((this.rrrareqTreqCode == rhs.rrrareqTreqCode)||((this.rrrareqTreqCode!= null)&&this.rrrareqTreqCode.equals(rhs.rrrareqTreqCode))))&&((this.rrrareqPerkMpnExpDate == rhs.rrrareqPerkMpnExpDate)||((this.rrrareqPerkMpnExpDate!= null)&&this.rrrareqPerkMpnExpDate.equals(rhs.rrrareqPerkMpnExpDate))))&&((this.displayActive == rhs.displayActive)||((this.displayActive!= null)&&this.displayActive.equals(rhs.displayActive))))&&((this.rrrareqFundCode == rhs.rrrareqFundCode)||((this.rrrareqFundCode!= null)&&this.rrrareqFundCode.equals(rhs.rrrareqFundCode))))&&((this.rrrareqTreqDesc == rhs.rrrareqTreqDesc)||((this.rrrareqTreqDesc!= null)&&this.rrrareqTreqDesc.equals(rhs.rrrareqTreqDesc))))&&((this.rrrareqTrstCode == rhs.rrrareqTrstCode)||((this.rrrareqTrstCode!= null)&&this.rrrareqTrstCode.equals(rhs.rrrareqTrstCode))))&&((this.rrrareqSatisfiedDate == rhs.rrrareqSatisfiedDate)||((this.rrrareqSatisfiedDate!= null)&&this.rrrareqSatisfiedDate.equals(rhs.rrrareqSatisfiedDate))))&&((this.rfrbaseFundTitle == rhs.rfrbaseFundTitle)||((this.rfrbaseFundTitle!= null)&&this.rfrbaseFundTitle.equals(rhs.rfrbaseFundTitle))))&&((this.rrrareqStatDate == rhs.rrrareqStatDate)||((this.rrrareqStatDate!= null)&&this.rrrareqStatDate.equals(rhs.rrrareqStatDate))))&&((this.rrrareqSatInd == rhs.rrrareqSatInd)||((this.rrrareqSatInd!= null)&&this.rrrareqSatInd.equals(rhs.rrrareqSatInd))))&&((this.rrrareqMpnFirstDisbDate == rhs.rrrareqMpnFirstDisbDate)||((this.rrrareqMpnFirstDisbDate!= null)&&this.rrrareqMpnFirstDisbDate.equals(rhs.rrrareqMpnFirstDisbDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rtvtrstDesc == rhs.rtvtrstDesc)||((this.rtvtrstDesc!= null)&&this.rtvtrstDesc.equals(rhs.rtvtrstDesc))))&&((this.rrrareqMpnSignedDate == rhs.rrrareqMpnSignedDate)||((this.rrrareqMpnSignedDate!= null)&&this.rrrareqMpnSignedDate.equals(rhs.rrrareqMpnSignedDate))));
    }

}
