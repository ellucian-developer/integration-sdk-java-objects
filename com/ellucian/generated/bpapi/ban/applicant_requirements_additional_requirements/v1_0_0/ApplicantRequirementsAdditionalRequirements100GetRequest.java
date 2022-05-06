
package com.ellucian.generated.bpapi.ban.applicant_requirements_additional_requirements.v1_0_0;

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
    "rrrareqInfoAccessInd",
    "displayDisbInd2",
    "rrrareqFundCode",
    "rrrareqPeriod",
    "rrrareqTreqDesc",
    "displayTrkLtrInd2",
    "rrrareqTrstCode",
    "displayPckgInd2",
    "rrrareqSysInd",
    "keyblckAidyCode",
    "keyblckId",
    "rrrareqStatDate",
    "rrrareqSatInd",
    "displayMemoInd2",
    "rrrareqSbgiCode",
    "rrrareqSbgiTypeInd"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirementsAdditionalRequirements100GetRequest {

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
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("rrrareqInfoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_INFO_ACCESS_IND")
    private String rrrareqInfoAccessInd;
    @JsonProperty("displayDisbInd2")
    private String displayDisbInd2;
    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("rrrareqFundCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc")
    private String rrrareqFundCode;
    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("rrrareqPeriod")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds")
    private String rrrareqPeriod;
    /**
     * Requirement Description
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_DESC
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTreqDesc")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_TREQ_DESC")
    private String rrrareqTreqDesc;
    @JsonProperty("displayTrkLtrInd2")
    private String displayTrkLtrInd2;
    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTrstCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst")
    private String rrrareqTrstCode;
    @JsonProperty("displayPckgInd2")
    private String displayPckgInd2;
    /**
     * System
     * <p>
     * Lineage reference object : RRRAREQ_SYS_IND
     * 
     */
    @JsonProperty("rrrareqSysInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SYS_IND")
    private String rrrareqSysInd;
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
     * Status Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
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
    @JsonProperty("displayMemoInd2")
    private String displayMemoInd2;
    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("rrrareqSbgiCode")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SBGI_CODE")
    private String rrrareqSbgiCode;
    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("rrrareqSbgiTypeInd")
    @JsonPropertyDescription("Lineage reference object : RRRAREQ_SBGI_TYPE_IND")
    private String rrrareqSbgiTypeInd;
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

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqEstDate(Date rrrareqEstDate) {
        this.rrrareqEstDate = rrrareqEstDate;
        return this;
    }

    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("rrrareqInfoAccessInd")
    public String getRrrareqInfoAccessInd() {
        return rrrareqInfoAccessInd;
    }

    /**
     * Lineage reference object : RRRAREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("rrrareqInfoAccessInd")
    public void setRrrareqInfoAccessInd(String rrrareqInfoAccessInd) {
        this.rrrareqInfoAccessInd = rrrareqInfoAccessInd;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqInfoAccessInd(String rrrareqInfoAccessInd) {
        this.rrrareqInfoAccessInd = rrrareqInfoAccessInd;
        return this;
    }

    @JsonProperty("displayDisbInd2")
    public String getDisplayDisbInd2() {
        return displayDisbInd2;
    }

    @JsonProperty("displayDisbInd2")
    public void setDisplayDisbInd2(String displayDisbInd2) {
        this.displayDisbInd2 = displayDisbInd2;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withDisplayDisbInd2(String displayDisbInd2) {
        this.displayDisbInd2 = displayDisbInd2;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("rrrareqFundCode")
    public String getRrrareqFundCode() {
        return rrrareqFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : RRRAREQ_FUND_CODE, Lookup lineage reference object : rfrbase,rfraspc
     * 
     */
    @JsonProperty("rrrareqFundCode")
    public void setRrrareqFundCode(String rrrareqFundCode) {
        this.rrrareqFundCode = rrrareqFundCode;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqFundCode(String rrrareqFundCode) {
        this.rrrareqFundCode = rrrareqFundCode;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("rrrareqPeriod")
    public String getRrrareqPeriod() {
        return rrrareqPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : RRRAREQ_PERIOD, Lookup lineage reference object : robprds
     * 
     */
    @JsonProperty("rrrareqPeriod")
    public void setRrrareqPeriod(String rrrareqPeriod) {
        this.rrrareqPeriod = rrrareqPeriod;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqPeriod(String rrrareqPeriod) {
        this.rrrareqPeriod = rrrareqPeriod;
        return this;
    }

    /**
     * Requirement Description
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_DESC
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTreqDesc")
    public String getRrrareqTreqDesc() {
        return rrrareqTreqDesc;
    }

    /**
     * Requirement Description
     * <p>
     * Lineage reference object : RRRAREQ_TREQ_DESC
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTreqDesc")
    public void setRrrareqTreqDesc(String rrrareqTreqDesc) {
        this.rrrareqTreqDesc = rrrareqTreqDesc;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqTreqDesc(String rrrareqTreqDesc) {
        this.rrrareqTreqDesc = rrrareqTreqDesc;
        return this;
    }

    @JsonProperty("displayTrkLtrInd2")
    public String getDisplayTrkLtrInd2() {
        return displayTrkLtrInd2;
    }

    @JsonProperty("displayTrkLtrInd2")
    public void setDisplayTrkLtrInd2(String displayTrkLtrInd2) {
        this.displayTrkLtrInd2 = displayTrkLtrInd2;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withDisplayTrkLtrInd2(String displayTrkLtrInd2) {
        this.displayTrkLtrInd2 = displayTrkLtrInd2;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RRRAREQ_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("rrrareqTrstCode")
    public void setRrrareqTrstCode(String rrrareqTrstCode) {
        this.rrrareqTrstCode = rrrareqTrstCode;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqTrstCode(String rrrareqTrstCode) {
        this.rrrareqTrstCode = rrrareqTrstCode;
        return this;
    }

    @JsonProperty("displayPckgInd2")
    public String getDisplayPckgInd2() {
        return displayPckgInd2;
    }

    @JsonProperty("displayPckgInd2")
    public void setDisplayPckgInd2(String displayPckgInd2) {
        this.displayPckgInd2 = displayPckgInd2;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withDisplayPckgInd2(String displayPckgInd2) {
        this.displayPckgInd2 = displayPckgInd2;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RRRAREQ_SYS_IND
     * 
     */
    @JsonProperty("rrrareqSysInd")
    public String getRrrareqSysInd() {
        return rrrareqSysInd;
    }

    /**
     * System
     * <p>
     * Lineage reference object : RRRAREQ_SYS_IND
     * 
     */
    @JsonProperty("rrrareqSysInd")
    public void setRrrareqSysInd(String rrrareqSysInd) {
        this.rrrareqSysInd = rrrareqSysInd;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqSysInd(String rrrareqSysInd) {
        this.rrrareqSysInd = rrrareqSysInd;
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

    public ApplicantRequirementsAdditionalRequirements100GetRequest withKeyblckAidyCode(Object keyblckAidyCode) {
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

    public ApplicantRequirementsAdditionalRequirements100GetRequest withKeyblckId(Object keyblckId) {
        this.keyblckId = keyblckId;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : RRRAREQ_STAT_DATE
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
     * Lineage reference object : RRRAREQ_STAT_DATE
     * (Required)
     * 
     */
    @JsonProperty("rrrareqStatDate")
    public void setRrrareqStatDate(Date rrrareqStatDate) {
        this.rrrareqStatDate = rrrareqStatDate;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqStatDate(Date rrrareqStatDate) {
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

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqSatInd(String rrrareqSatInd) {
        this.rrrareqSatInd = rrrareqSatInd;
        return this;
    }

    @JsonProperty("displayMemoInd2")
    public String getDisplayMemoInd2() {
        return displayMemoInd2;
    }

    @JsonProperty("displayMemoInd2")
    public void setDisplayMemoInd2(String displayMemoInd2) {
        this.displayMemoInd2 = displayMemoInd2;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withDisplayMemoInd2(String displayMemoInd2) {
        this.displayMemoInd2 = displayMemoInd2;
        return this;
    }

    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("rrrareqSbgiCode")
    public String getRrrareqSbgiCode() {
        return rrrareqSbgiCode;
    }

    /**
     * SBGI Code
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_CODE
     * 
     */
    @JsonProperty("rrrareqSbgiCode")
    public void setRrrareqSbgiCode(String rrrareqSbgiCode) {
        this.rrrareqSbgiCode = rrrareqSbgiCode;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqSbgiCode(String rrrareqSbgiCode) {
        this.rrrareqSbgiCode = rrrareqSbgiCode;
        return this;
    }

    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("rrrareqSbgiTypeInd")
    public String getRrrareqSbgiTypeInd() {
        return rrrareqSbgiTypeInd;
    }

    /**
     * SBGI Type
     * <p>
     * Lineage reference object : RRRAREQ_SBGI_TYPE_IND
     * 
     */
    @JsonProperty("rrrareqSbgiTypeInd")
    public void setRrrareqSbgiTypeInd(String rrrareqSbgiTypeInd) {
        this.rrrareqSbgiTypeInd = rrrareqSbgiTypeInd;
    }

    public ApplicantRequirementsAdditionalRequirements100GetRequest withRrrareqSbgiTypeInd(String rrrareqSbgiTypeInd) {
        this.rrrareqSbgiTypeInd = rrrareqSbgiTypeInd;
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

    public ApplicantRequirementsAdditionalRequirements100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirementsAdditionalRequirements100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rrrareqEstDate");
        sb.append('=');
        sb.append(((this.rrrareqEstDate == null)?"<null>":this.rrrareqEstDate));
        sb.append(',');
        sb.append("rrrareqInfoAccessInd");
        sb.append('=');
        sb.append(((this.rrrareqInfoAccessInd == null)?"<null>":this.rrrareqInfoAccessInd));
        sb.append(',');
        sb.append("displayDisbInd2");
        sb.append('=');
        sb.append(((this.displayDisbInd2 == null)?"<null>":this.displayDisbInd2));
        sb.append(',');
        sb.append("rrrareqFundCode");
        sb.append('=');
        sb.append(((this.rrrareqFundCode == null)?"<null>":this.rrrareqFundCode));
        sb.append(',');
        sb.append("rrrareqPeriod");
        sb.append('=');
        sb.append(((this.rrrareqPeriod == null)?"<null>":this.rrrareqPeriod));
        sb.append(',');
        sb.append("rrrareqTreqDesc");
        sb.append('=');
        sb.append(((this.rrrareqTreqDesc == null)?"<null>":this.rrrareqTreqDesc));
        sb.append(',');
        sb.append("displayTrkLtrInd2");
        sb.append('=');
        sb.append(((this.displayTrkLtrInd2 == null)?"<null>":this.displayTrkLtrInd2));
        sb.append(',');
        sb.append("rrrareqTrstCode");
        sb.append('=');
        sb.append(((this.rrrareqTrstCode == null)?"<null>":this.rrrareqTrstCode));
        sb.append(',');
        sb.append("displayPckgInd2");
        sb.append('=');
        sb.append(((this.displayPckgInd2 == null)?"<null>":this.displayPckgInd2));
        sb.append(',');
        sb.append("rrrareqSysInd");
        sb.append('=');
        sb.append(((this.rrrareqSysInd == null)?"<null>":this.rrrareqSysInd));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("keyblckId");
        sb.append('=');
        sb.append(((this.keyblckId == null)?"<null>":this.keyblckId));
        sb.append(',');
        sb.append("rrrareqStatDate");
        sb.append('=');
        sb.append(((this.rrrareqStatDate == null)?"<null>":this.rrrareqStatDate));
        sb.append(',');
        sb.append("rrrareqSatInd");
        sb.append('=');
        sb.append(((this.rrrareqSatInd == null)?"<null>":this.rrrareqSatInd));
        sb.append(',');
        sb.append("displayMemoInd2");
        sb.append('=');
        sb.append(((this.displayMemoInd2 == null)?"<null>":this.displayMemoInd2));
        sb.append(',');
        sb.append("rrrareqSbgiCode");
        sb.append('=');
        sb.append(((this.rrrareqSbgiCode == null)?"<null>":this.rrrareqSbgiCode));
        sb.append(',');
        sb.append("rrrareqSbgiTypeInd");
        sb.append('=');
        sb.append(((this.rrrareqSbgiTypeInd == null)?"<null>":this.rrrareqSbgiTypeInd));
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
        result = ((result* 31)+((this.rrrareqInfoAccessInd == null)? 0 :this.rrrareqInfoAccessInd.hashCode()));
        result = ((result* 31)+((this.displayDisbInd2 == null)? 0 :this.displayDisbInd2 .hashCode()));
        result = ((result* 31)+((this.rrrareqFundCode == null)? 0 :this.rrrareqFundCode.hashCode()));
        result = ((result* 31)+((this.rrrareqPeriod == null)? 0 :this.rrrareqPeriod.hashCode()));
        result = ((result* 31)+((this.rrrareqTreqDesc == null)? 0 :this.rrrareqTreqDesc.hashCode()));
        result = ((result* 31)+((this.displayTrkLtrInd2 == null)? 0 :this.displayTrkLtrInd2 .hashCode()));
        result = ((result* 31)+((this.rrrareqTrstCode == null)? 0 :this.rrrareqTrstCode.hashCode()));
        result = ((result* 31)+((this.displayPckgInd2 == null)? 0 :this.displayPckgInd2 .hashCode()));
        result = ((result* 31)+((this.rrrareqSysInd == null)? 0 :this.rrrareqSysInd.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.keyblckId == null)? 0 :this.keyblckId.hashCode()));
        result = ((result* 31)+((this.rrrareqStatDate == null)? 0 :this.rrrareqStatDate.hashCode()));
        result = ((result* 31)+((this.rrrareqSatInd == null)? 0 :this.rrrareqSatInd.hashCode()));
        result = ((result* 31)+((this.displayMemoInd2 == null)? 0 :this.displayMemoInd2 .hashCode()));
        result = ((result* 31)+((this.rrrareqSbgiCode == null)? 0 :this.rrrareqSbgiCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rrrareqSbgiTypeInd == null)? 0 :this.rrrareqSbgiTypeInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirementsAdditionalRequirements100GetRequest) == false) {
            return false;
        }
        ApplicantRequirementsAdditionalRequirements100GetRequest rhs = ((ApplicantRequirementsAdditionalRequirements100GetRequest) other);
        return (((((((((((((((((((this.rrrareqEstDate == rhs.rrrareqEstDate)||((this.rrrareqEstDate!= null)&&this.rrrareqEstDate.equals(rhs.rrrareqEstDate)))&&((this.rrrareqInfoAccessInd == rhs.rrrareqInfoAccessInd)||((this.rrrareqInfoAccessInd!= null)&&this.rrrareqInfoAccessInd.equals(rhs.rrrareqInfoAccessInd))))&&((this.displayDisbInd2 == rhs.displayDisbInd2)||((this.displayDisbInd2 != null)&&this.displayDisbInd2 .equals(rhs.displayDisbInd2))))&&((this.rrrareqFundCode == rhs.rrrareqFundCode)||((this.rrrareqFundCode!= null)&&this.rrrareqFundCode.equals(rhs.rrrareqFundCode))))&&((this.rrrareqPeriod == rhs.rrrareqPeriod)||((this.rrrareqPeriod!= null)&&this.rrrareqPeriod.equals(rhs.rrrareqPeriod))))&&((this.rrrareqTreqDesc == rhs.rrrareqTreqDesc)||((this.rrrareqTreqDesc!= null)&&this.rrrareqTreqDesc.equals(rhs.rrrareqTreqDesc))))&&((this.displayTrkLtrInd2 == rhs.displayTrkLtrInd2)||((this.displayTrkLtrInd2 != null)&&this.displayTrkLtrInd2 .equals(rhs.displayTrkLtrInd2))))&&((this.rrrareqTrstCode == rhs.rrrareqTrstCode)||((this.rrrareqTrstCode!= null)&&this.rrrareqTrstCode.equals(rhs.rrrareqTrstCode))))&&((this.displayPckgInd2 == rhs.displayPckgInd2)||((this.displayPckgInd2 != null)&&this.displayPckgInd2 .equals(rhs.displayPckgInd2))))&&((this.rrrareqSysInd == rhs.rrrareqSysInd)||((this.rrrareqSysInd!= null)&&this.rrrareqSysInd.equals(rhs.rrrareqSysInd))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.keyblckId == rhs.keyblckId)||((this.keyblckId!= null)&&this.keyblckId.equals(rhs.keyblckId))))&&((this.rrrareqStatDate == rhs.rrrareqStatDate)||((this.rrrareqStatDate!= null)&&this.rrrareqStatDate.equals(rhs.rrrareqStatDate))))&&((this.rrrareqSatInd == rhs.rrrareqSatInd)||((this.rrrareqSatInd!= null)&&this.rrrareqSatInd.equals(rhs.rrrareqSatInd))))&&((this.displayMemoInd2 == rhs.displayMemoInd2)||((this.displayMemoInd2 != null)&&this.displayMemoInd2 .equals(rhs.displayMemoInd2))))&&((this.rrrareqSbgiCode == rhs.rrrareqSbgiCode)||((this.rrrareqSbgiCode!= null)&&this.rrrareqSbgiCode.equals(rhs.rrrareqSbgiCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rrrareqSbgiTypeInd == rhs.rrrareqSbgiTypeInd)||((this.rrrareqSbgiTypeInd!= null)&&this.rrrareqSbgiTypeInd.equals(rhs.rrrareqSbgiTypeInd))));
    }

}
