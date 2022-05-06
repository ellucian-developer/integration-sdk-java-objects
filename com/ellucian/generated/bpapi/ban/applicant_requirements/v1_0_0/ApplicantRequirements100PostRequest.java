
package com.ellucian.generated.bpapi.ban.applicant_requirements.v1_0_0;

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
    "statDate",
    "trstCode",
    "period",
    "tgrpCode",
    "displayDisbInd1",
    "infoAccessInd",
    "sbgiTypeInd",
    "displayTrkLtrInd1",
    "sbgiCode",
    "keyblckAidyCode",
    "keyblckId",
    "fundCode",
    "displayMemoInd1",
    "treqCode",
    "displayPckgInd1"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirements100PostRequest {

    /**
     * Status   Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("statDate")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_STAT_DATE")
    private Date statDate;
    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst")
    private String trstCode;
    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds")
    private String period;
    /**
     * Tracking Group
     * <p>
     * Lineage reference object : RORSTAT_TGRP_CODE, Lookup lineage reference object : rtvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_TGRP_CODE, Lookup lineage reference object : rtvtgrp")
    private String tgrpCode;
    @JsonProperty("displayDisbInd1")
    private String displayDisbInd1;
    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("sbgiTypeInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SBGI_TYPE_IND")
    private String sbgiTypeInd;
    @JsonProperty("displayTrkLtrInd1")
    private String displayTrkLtrInd1;
    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SBGI_CODE")
    private String sbgiCode;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private Object keyblckAidyCode;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("keyblckId")
    @JsonPropertyDescription("Lineage reference object : keyblckId")
    private Object keyblckId;
    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String fundCode;
    @JsonProperty("displayMemoInd1")
    private String displayMemoInd1;
    /**
     * Requirement
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("treqCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_TREQ_CODE")
    private String treqCode;
    @JsonProperty("displayPckgInd1")
    private String displayPckgInd1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status   Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("statDate")
    public Date getStatDate() {
        return statDate;
    }

    /**
     * Status   Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("statDate")
    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public ApplicantRequirements100PostRequest withStatDate(Date statDate) {
        this.statDate = statDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCode")
    public String getTrstCode() {
        return trstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCode")
    public void setTrstCode(String trstCode) {
        this.trstCode = trstCode;
    }

    public ApplicantRequirements100PostRequest withTrstCode(String trstCode) {
        this.trstCode = trstCode;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public ApplicantRequirements100PostRequest withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Tracking Group
     * <p>
     * Lineage reference object : RORSTAT_TGRP_CODE, Lookup lineage reference object : rtvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tracking Group
     * <p>
     * Lineage reference object : RORSTAT_TGRP_CODE, Lookup lineage reference object : rtvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public ApplicantRequirements100PostRequest withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    @JsonProperty("displayDisbInd1")
    public String getDisplayDisbInd1() {
        return displayDisbInd1;
    }

    @JsonProperty("displayDisbInd1")
    public void setDisplayDisbInd1(String displayDisbInd1) {
        this.displayDisbInd1 = displayDisbInd1;
    }

    public ApplicantRequirements100PostRequest withDisplayDisbInd1(String displayDisbInd1) {
        this.displayDisbInd1 = displayDisbInd1;
        return this;
    }

    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public ApplicantRequirements100PostRequest withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("sbgiTypeInd")
    public String getSbgiTypeInd() {
        return sbgiTypeInd;
    }

    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("sbgiTypeInd")
    public void setSbgiTypeInd(String sbgiTypeInd) {
        this.sbgiTypeInd = sbgiTypeInd;
    }

    public ApplicantRequirements100PostRequest withSbgiTypeInd(String sbgiTypeInd) {
        this.sbgiTypeInd = sbgiTypeInd;
        return this;
    }

    @JsonProperty("displayTrkLtrInd1")
    public String getDisplayTrkLtrInd1() {
        return displayTrkLtrInd1;
    }

    @JsonProperty("displayTrkLtrInd1")
    public void setDisplayTrkLtrInd1(String displayTrkLtrInd1) {
        this.displayTrkLtrInd1 = displayTrkLtrInd1;
    }

    public ApplicantRequirements100PostRequest withDisplayTrkLtrInd1(String displayTrkLtrInd1) {
        this.displayTrkLtrInd1 = displayTrkLtrInd1;
        return this;
    }

    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public ApplicantRequirements100PostRequest withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public Object getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public ApplicantRequirements100PostRequest withKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("keyblckId")
    public Object getKeyblckId() {
        return keyblckId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("keyblckId")
    public void setKeyblckId(Object keyblckId) {
        this.keyblckId = keyblckId;
    }

    public ApplicantRequirements100PostRequest withKeyblckId(Object keyblckId) {
        this.keyblckId = keyblckId;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public ApplicantRequirements100PostRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    @JsonProperty("displayMemoInd1")
    public String getDisplayMemoInd1() {
        return displayMemoInd1;
    }

    @JsonProperty("displayMemoInd1")
    public void setDisplayMemoInd1(String displayMemoInd1) {
        this.displayMemoInd1 = displayMemoInd1;
    }

    public ApplicantRequirements100PostRequest withDisplayMemoInd1(String displayMemoInd1) {
        this.displayMemoInd1 = displayMemoInd1;
        return this;
    }

    /**
     * Requirement
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("treqCode")
    public String getTreqCode() {
        return treqCode;
    }

    /**
     * Requirement
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("treqCode")
    public void setTreqCode(String treqCode) {
        this.treqCode = treqCode;
    }

    public ApplicantRequirements100PostRequest withTreqCode(String treqCode) {
        this.treqCode = treqCode;
        return this;
    }

    @JsonProperty("displayPckgInd1")
    public String getDisplayPckgInd1() {
        return displayPckgInd1;
    }

    @JsonProperty("displayPckgInd1")
    public void setDisplayPckgInd1(String displayPckgInd1) {
        this.displayPckgInd1 = displayPckgInd1;
    }

    public ApplicantRequirements100PostRequest withDisplayPckgInd1(String displayPckgInd1) {
        this.displayPckgInd1 = displayPckgInd1;
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

    public ApplicantRequirements100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirements100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statDate");
        sb.append('=');
        sb.append(((this.statDate == null)?"<null>":this.statDate));
        sb.append(',');
        sb.append("trstCode");
        sb.append('=');
        sb.append(((this.trstCode == null)?"<null>":this.trstCode));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("displayDisbInd1");
        sb.append('=');
        sb.append(((this.displayDisbInd1 == null)?"<null>":this.displayDisbInd1));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("sbgiTypeInd");
        sb.append('=');
        sb.append(((this.sbgiTypeInd == null)?"<null>":this.sbgiTypeInd));
        sb.append(',');
        sb.append("displayTrkLtrInd1");
        sb.append('=');
        sb.append(((this.displayTrkLtrInd1 == null)?"<null>":this.displayTrkLtrInd1));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("keyblckId");
        sb.append('=');
        sb.append(((this.keyblckId == null)?"<null>":this.keyblckId));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("displayMemoInd1");
        sb.append('=');
        sb.append(((this.displayMemoInd1 == null)?"<null>":this.displayMemoInd1));
        sb.append(',');
        sb.append("treqCode");
        sb.append('=');
        sb.append(((this.treqCode == null)?"<null>":this.treqCode));
        sb.append(',');
        sb.append("displayPckgInd1");
        sb.append('=');
        sb.append(((this.displayPckgInd1 == null)?"<null>":this.displayPckgInd1));
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
        result = ((result* 31)+((this.statDate == null)? 0 :this.statDate.hashCode()));
        result = ((result* 31)+((this.trstCode == null)? 0 :this.trstCode.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.displayDisbInd1 == null)? 0 :this.displayDisbInd1 .hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.sbgiTypeInd == null)? 0 :this.sbgiTypeInd.hashCode()));
        result = ((result* 31)+((this.displayTrkLtrInd1 == null)? 0 :this.displayTrkLtrInd1 .hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.keyblckId == null)? 0 :this.keyblckId.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.displayMemoInd1 == null)? 0 :this.displayMemoInd1 .hashCode()));
        result = ((result* 31)+((this.treqCode == null)? 0 :this.treqCode.hashCode()));
        result = ((result* 31)+((this.displayPckgInd1 == null)? 0 :this.displayPckgInd1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirements100PostRequest) == false) {
            return false;
        }
        ApplicantRequirements100PostRequest rhs = ((ApplicantRequirements100PostRequest) other);
        return (((((((((((((((((this.statDate == rhs.statDate)||((this.statDate!= null)&&this.statDate.equals(rhs.statDate)))&&((this.trstCode == rhs.trstCode)||((this.trstCode!= null)&&this.trstCode.equals(rhs.trstCode))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.displayDisbInd1 == rhs.displayDisbInd1)||((this.displayDisbInd1 != null)&&this.displayDisbInd1 .equals(rhs.displayDisbInd1))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.sbgiTypeInd == rhs.sbgiTypeInd)||((this.sbgiTypeInd!= null)&&this.sbgiTypeInd.equals(rhs.sbgiTypeInd))))&&((this.displayTrkLtrInd1 == rhs.displayTrkLtrInd1)||((this.displayTrkLtrInd1 != null)&&this.displayTrkLtrInd1 .equals(rhs.displayTrkLtrInd1))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.keyblckId == rhs.keyblckId)||((this.keyblckId!= null)&&this.keyblckId.equals(rhs.keyblckId))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.displayMemoInd1 == rhs.displayMemoInd1)||((this.displayMemoInd1 != null)&&this.displayMemoInd1 .equals(rhs.displayMemoInd1))))&&((this.treqCode == rhs.treqCode)||((this.treqCode!= null)&&this.treqCode.equals(rhs.treqCode))))&&((this.displayPckgInd1 == rhs.displayPckgInd1)||((this.displayPckgInd1 != null)&&this.displayPckgInd1 .equals(rhs.displayPckgInd1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
