
package com.ellucian.generated.bpapi.ban.requirements_tracking_codes.v1_0_0;

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
    "instructions",
    "termEligibleInd",
    "code",
    "satisfyAllInd",
    "perkMpnFlag",
    "ltrExcludeInd",
    "infoAccessInd",
    "updatePriorYearInd",
    "pckgInd",
    "url",
    "memoInd",
    "activityDate",
    "onceInd",
    "accessInd",
    "disbInd",
    "activeInd",
    "shortDesc",
    "useFedFundIdInd",
    "vrMsgNo",
    "longDesc"
})
@Generated("jsonschema2pojo")
public class RequirementsTrackingCodes100GetRequest {

    /**
     * Instructions
     * <p>
     * Lineage reference object : RTVTREQ_INSTRUCTIONS
     * 
     */
    @JsonProperty("instructions")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_INSTRUCTIONS")
    private String instructions;
    /**
     * Period Eligible
     * <p>
     * Lineage reference object : RTVTREQ_TERM_ELIGIBLE_IND
     * 
     */
    @JsonProperty("termEligibleInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_TERM_ELIGIBLE_IND")
    private String termEligibleInd;
    /**
     * Code
     * <p>
     * Lineage reference object : RTVTREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_CODE")
    private String code;
    /**
     * Satisfy All
     * <p>
     * Lineage reference object : RTVTREQ_SATISFY_ALL_IND
     * 
     */
    @JsonProperty("satisfyAllInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_SATISFY_ALL_IND")
    private String satisfyAllInd;
    /**
     * Perkins MPN
     * <p>
     * Lineage reference object : RTVTREQ_PERK_MPN_FLAG
     * 
     */
    @JsonProperty("perkMpnFlag")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_PERK_MPN_FLAG")
    private String perkMpnFlag;
    /**
     * Letter Exclusion
     * <p>
     * Lineage reference object : RTVTREQ_LTR_EXCLUDE_IND
     * 
     */
    @JsonProperty("ltrExcludeInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_LTR_EXCLUDE_IND")
    private String ltrExcludeInd;
    /**
     * Information Access
     * <p>
     * Lineage reference object : RTVTREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * Update Prior Year
     * <p>
     * Lineage reference object : RTVTREQ_UPDATE_PRIOR_YEAR_IND
     * 
     */
    @JsonProperty("updatePriorYearInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_UPDATE_PRIOR_YEAR_IND")
    private String updatePriorYearInd;
    /**
     * Packaging
     * <p>
     * Lineage reference object : RTVTREQ_PCKG_IND
     * 
     */
    @JsonProperty("pckgInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_PCKG_IND")
    private String pckgInd;
    /**
     * URL
     * <p>
     * Lineage reference object : RTVTREQ_URL
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_URL")
    private String url;
    /**
     * Memo
     * <p>
     * Lineage reference object : RTVTREQ_MEMO_IND
     * 
     */
    @JsonProperty("memoInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_MEMO_IND")
    private String memoInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVTREQ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Required Once
     * <p>
     * Lineage reference object : RTVTREQ_ONCE_IND
     * 
     */
    @JsonProperty("onceInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_ONCE_IND")
    private String onceInd;
    /**
     * Access Indicator
     * <p>
     * Lineage reference object : RTVTREQ_ACCESS_IND
     * 
     */
    @JsonProperty("accessInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_ACCESS_IND")
    private String accessInd;
    /**
     * Disbursement
     * <p>
     * Lineage reference object : RTVTREQ_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_DISB_IND")
    private String disbInd;
    /**
     * Active
     * <p>
     * Lineage reference object : RTVTREQ_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_ACTIVE_IND")
    private String activeInd;
    /**
     * Short Description
     * <p>
     * Lineage reference object : RTVTREQ_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_SHORT_DESC")
    private String shortDesc;
    /**
     * Match Federal Fund ID
     * <p>
     * Lineage reference object : RTVTREQ_USE_FED_FUND_ID_IND
     * 
     */
    @JsonProperty("useFedFundIdInd")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_USE_FED_FUND_ID_IND")
    private String useFedFundIdInd;
    /**
     * Message Number
     * <p>
     * Lineage reference object : RTVTREQ_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Long Description
     * <p>
     * Lineage reference object : RTVTREQ_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    @JsonPropertyDescription("Lineage reference object : RTVTREQ_LONG_DESC")
    private String longDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Instructions
     * <p>
     * Lineage reference object : RTVTREQ_INSTRUCTIONS
     * 
     */
    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    /**
     * Instructions
     * <p>
     * Lineage reference object : RTVTREQ_INSTRUCTIONS
     * 
     */
    @JsonProperty("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public RequirementsTrackingCodes100GetRequest withInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Period Eligible
     * <p>
     * Lineage reference object : RTVTREQ_TERM_ELIGIBLE_IND
     * 
     */
    @JsonProperty("termEligibleInd")
    public String getTermEligibleInd() {
        return termEligibleInd;
    }

    /**
     * Period Eligible
     * <p>
     * Lineage reference object : RTVTREQ_TERM_ELIGIBLE_IND
     * 
     */
    @JsonProperty("termEligibleInd")
    public void setTermEligibleInd(String termEligibleInd) {
        this.termEligibleInd = termEligibleInd;
    }

    public RequirementsTrackingCodes100GetRequest withTermEligibleInd(String termEligibleInd) {
        this.termEligibleInd = termEligibleInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : RTVTREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : RTVTREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public RequirementsTrackingCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Satisfy All
     * <p>
     * Lineage reference object : RTVTREQ_SATISFY_ALL_IND
     * 
     */
    @JsonProperty("satisfyAllInd")
    public String getSatisfyAllInd() {
        return satisfyAllInd;
    }

    /**
     * Satisfy All
     * <p>
     * Lineage reference object : RTVTREQ_SATISFY_ALL_IND
     * 
     */
    @JsonProperty("satisfyAllInd")
    public void setSatisfyAllInd(String satisfyAllInd) {
        this.satisfyAllInd = satisfyAllInd;
    }

    public RequirementsTrackingCodes100GetRequest withSatisfyAllInd(String satisfyAllInd) {
        this.satisfyAllInd = satisfyAllInd;
        return this;
    }

    /**
     * Perkins MPN
     * <p>
     * Lineage reference object : RTVTREQ_PERK_MPN_FLAG
     * 
     */
    @JsonProperty("perkMpnFlag")
    public String getPerkMpnFlag() {
        return perkMpnFlag;
    }

    /**
     * Perkins MPN
     * <p>
     * Lineage reference object : RTVTREQ_PERK_MPN_FLAG
     * 
     */
    @JsonProperty("perkMpnFlag")
    public void setPerkMpnFlag(String perkMpnFlag) {
        this.perkMpnFlag = perkMpnFlag;
    }

    public RequirementsTrackingCodes100GetRequest withPerkMpnFlag(String perkMpnFlag) {
        this.perkMpnFlag = perkMpnFlag;
        return this;
    }

    /**
     * Letter Exclusion
     * <p>
     * Lineage reference object : RTVTREQ_LTR_EXCLUDE_IND
     * 
     */
    @JsonProperty("ltrExcludeInd")
    public String getLtrExcludeInd() {
        return ltrExcludeInd;
    }

    /**
     * Letter Exclusion
     * <p>
     * Lineage reference object : RTVTREQ_LTR_EXCLUDE_IND
     * 
     */
    @JsonProperty("ltrExcludeInd")
    public void setLtrExcludeInd(String ltrExcludeInd) {
        this.ltrExcludeInd = ltrExcludeInd;
    }

    public RequirementsTrackingCodes100GetRequest withLtrExcludeInd(String ltrExcludeInd) {
        this.ltrExcludeInd = ltrExcludeInd;
        return this;
    }

    /**
     * Information Access
     * <p>
     * Lineage reference object : RTVTREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Information Access
     * <p>
     * Lineage reference object : RTVTREQ_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public RequirementsTrackingCodes100GetRequest withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * Update Prior Year
     * <p>
     * Lineage reference object : RTVTREQ_UPDATE_PRIOR_YEAR_IND
     * 
     */
    @JsonProperty("updatePriorYearInd")
    public String getUpdatePriorYearInd() {
        return updatePriorYearInd;
    }

    /**
     * Update Prior Year
     * <p>
     * Lineage reference object : RTVTREQ_UPDATE_PRIOR_YEAR_IND
     * 
     */
    @JsonProperty("updatePriorYearInd")
    public void setUpdatePriorYearInd(String updatePriorYearInd) {
        this.updatePriorYearInd = updatePriorYearInd;
    }

    public RequirementsTrackingCodes100GetRequest withUpdatePriorYearInd(String updatePriorYearInd) {
        this.updatePriorYearInd = updatePriorYearInd;
        return this;
    }

    /**
     * Packaging
     * <p>
     * Lineage reference object : RTVTREQ_PCKG_IND
     * 
     */
    @JsonProperty("pckgInd")
    public String getPckgInd() {
        return pckgInd;
    }

    /**
     * Packaging
     * <p>
     * Lineage reference object : RTVTREQ_PCKG_IND
     * 
     */
    @JsonProperty("pckgInd")
    public void setPckgInd(String pckgInd) {
        this.pckgInd = pckgInd;
    }

    public RequirementsTrackingCodes100GetRequest withPckgInd(String pckgInd) {
        this.pckgInd = pckgInd;
        return this;
    }

    /**
     * URL
     * <p>
     * Lineage reference object : RTVTREQ_URL
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * URL
     * <p>
     * Lineage reference object : RTVTREQ_URL
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public RequirementsTrackingCodes100GetRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Memo
     * <p>
     * Lineage reference object : RTVTREQ_MEMO_IND
     * 
     */
    @JsonProperty("memoInd")
    public String getMemoInd() {
        return memoInd;
    }

    /**
     * Memo
     * <p>
     * Lineage reference object : RTVTREQ_MEMO_IND
     * 
     */
    @JsonProperty("memoInd")
    public void setMemoInd(String memoInd) {
        this.memoInd = memoInd;
    }

    public RequirementsTrackingCodes100GetRequest withMemoInd(String memoInd) {
        this.memoInd = memoInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVTREQ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVTREQ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RequirementsTrackingCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Required Once
     * <p>
     * Lineage reference object : RTVTREQ_ONCE_IND
     * 
     */
    @JsonProperty("onceInd")
    public String getOnceInd() {
        return onceInd;
    }

    /**
     * Required Once
     * <p>
     * Lineage reference object : RTVTREQ_ONCE_IND
     * 
     */
    @JsonProperty("onceInd")
    public void setOnceInd(String onceInd) {
        this.onceInd = onceInd;
    }

    public RequirementsTrackingCodes100GetRequest withOnceInd(String onceInd) {
        this.onceInd = onceInd;
        return this;
    }

    /**
     * Access Indicator
     * <p>
     * Lineage reference object : RTVTREQ_ACCESS_IND
     * 
     */
    @JsonProperty("accessInd")
    public String getAccessInd() {
        return accessInd;
    }

    /**
     * Access Indicator
     * <p>
     * Lineage reference object : RTVTREQ_ACCESS_IND
     * 
     */
    @JsonProperty("accessInd")
    public void setAccessInd(String accessInd) {
        this.accessInd = accessInd;
    }

    public RequirementsTrackingCodes100GetRequest withAccessInd(String accessInd) {
        this.accessInd = accessInd;
        return this;
    }

    /**
     * Disbursement
     * <p>
     * Lineage reference object : RTVTREQ_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public String getDisbInd() {
        return disbInd;
    }

    /**
     * Disbursement
     * <p>
     * Lineage reference object : RTVTREQ_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public void setDisbInd(String disbInd) {
        this.disbInd = disbInd;
    }

    public RequirementsTrackingCodes100GetRequest withDisbInd(String disbInd) {
        this.disbInd = disbInd;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : RTVTREQ_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : RTVTREQ_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public RequirementsTrackingCodes100GetRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : RTVTREQ_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Short Description
     * <p>
     * Lineage reference object : RTVTREQ_SHORT_DESC
     * (Required)
     * 
     */
    @JsonProperty("shortDesc")
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public RequirementsTrackingCodes100GetRequest withShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        return this;
    }

    /**
     * Match Federal Fund ID
     * <p>
     * Lineage reference object : RTVTREQ_USE_FED_FUND_ID_IND
     * 
     */
    @JsonProperty("useFedFundIdInd")
    public String getUseFedFundIdInd() {
        return useFedFundIdInd;
    }

    /**
     * Match Federal Fund ID
     * <p>
     * Lineage reference object : RTVTREQ_USE_FED_FUND_ID_IND
     * 
     */
    @JsonProperty("useFedFundIdInd")
    public void setUseFedFundIdInd(String useFedFundIdInd) {
        this.useFedFundIdInd = useFedFundIdInd;
    }

    public RequirementsTrackingCodes100GetRequest withUseFedFundIdInd(String useFedFundIdInd) {
        this.useFedFundIdInd = useFedFundIdInd;
        return this;
    }

    /**
     * Message Number
     * <p>
     * Lineage reference object : RTVTREQ_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Message Number
     * <p>
     * Lineage reference object : RTVTREQ_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public RequirementsTrackingCodes100GetRequest withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : RTVTREQ_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * Long Description
     * <p>
     * Lineage reference object : RTVTREQ_LONG_DESC
     * (Required)
     * 
     */
    @JsonProperty("longDesc")
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public RequirementsTrackingCodes100GetRequest withLongDesc(String longDesc) {
        this.longDesc = longDesc;
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

    public RequirementsTrackingCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequirementsTrackingCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instructions");
        sb.append('=');
        sb.append(((this.instructions == null)?"<null>":this.instructions));
        sb.append(',');
        sb.append("termEligibleInd");
        sb.append('=');
        sb.append(((this.termEligibleInd == null)?"<null>":this.termEligibleInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("satisfyAllInd");
        sb.append('=');
        sb.append(((this.satisfyAllInd == null)?"<null>":this.satisfyAllInd));
        sb.append(',');
        sb.append("perkMpnFlag");
        sb.append('=');
        sb.append(((this.perkMpnFlag == null)?"<null>":this.perkMpnFlag));
        sb.append(',');
        sb.append("ltrExcludeInd");
        sb.append('=');
        sb.append(((this.ltrExcludeInd == null)?"<null>":this.ltrExcludeInd));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("updatePriorYearInd");
        sb.append('=');
        sb.append(((this.updatePriorYearInd == null)?"<null>":this.updatePriorYearInd));
        sb.append(',');
        sb.append("pckgInd");
        sb.append('=');
        sb.append(((this.pckgInd == null)?"<null>":this.pckgInd));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("memoInd");
        sb.append('=');
        sb.append(((this.memoInd == null)?"<null>":this.memoInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("onceInd");
        sb.append('=');
        sb.append(((this.onceInd == null)?"<null>":this.onceInd));
        sb.append(',');
        sb.append("accessInd");
        sb.append('=');
        sb.append(((this.accessInd == null)?"<null>":this.accessInd));
        sb.append(',');
        sb.append("disbInd");
        sb.append('=');
        sb.append(((this.disbInd == null)?"<null>":this.disbInd));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("shortDesc");
        sb.append('=');
        sb.append(((this.shortDesc == null)?"<null>":this.shortDesc));
        sb.append(',');
        sb.append("useFedFundIdInd");
        sb.append('=');
        sb.append(((this.useFedFundIdInd == null)?"<null>":this.useFedFundIdInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("longDesc");
        sb.append('=');
        sb.append(((this.longDesc == null)?"<null>":this.longDesc));
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
        result = ((result* 31)+((this.instructions == null)? 0 :this.instructions.hashCode()));
        result = ((result* 31)+((this.termEligibleInd == null)? 0 :this.termEligibleInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.satisfyAllInd == null)? 0 :this.satisfyAllInd.hashCode()));
        result = ((result* 31)+((this.perkMpnFlag == null)? 0 :this.perkMpnFlag.hashCode()));
        result = ((result* 31)+((this.ltrExcludeInd == null)? 0 :this.ltrExcludeInd.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.updatePriorYearInd == null)? 0 :this.updatePriorYearInd.hashCode()));
        result = ((result* 31)+((this.pckgInd == null)? 0 :this.pckgInd.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.memoInd == null)? 0 :this.memoInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.onceInd == null)? 0 :this.onceInd.hashCode()));
        result = ((result* 31)+((this.accessInd == null)? 0 :this.accessInd.hashCode()));
        result = ((result* 31)+((this.disbInd == null)? 0 :this.disbInd.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.shortDesc == null)? 0 :this.shortDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.useFedFundIdInd == null)? 0 :this.useFedFundIdInd.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.longDesc == null)? 0 :this.longDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequirementsTrackingCodes100GetRequest) == false) {
            return false;
        }
        RequirementsTrackingCodes100GetRequest rhs = ((RequirementsTrackingCodes100GetRequest) other);
        return ((((((((((((((((((((((this.instructions == rhs.instructions)||((this.instructions!= null)&&this.instructions.equals(rhs.instructions)))&&((this.termEligibleInd == rhs.termEligibleInd)||((this.termEligibleInd!= null)&&this.termEligibleInd.equals(rhs.termEligibleInd))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.satisfyAllInd == rhs.satisfyAllInd)||((this.satisfyAllInd!= null)&&this.satisfyAllInd.equals(rhs.satisfyAllInd))))&&((this.perkMpnFlag == rhs.perkMpnFlag)||((this.perkMpnFlag!= null)&&this.perkMpnFlag.equals(rhs.perkMpnFlag))))&&((this.ltrExcludeInd == rhs.ltrExcludeInd)||((this.ltrExcludeInd!= null)&&this.ltrExcludeInd.equals(rhs.ltrExcludeInd))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.updatePriorYearInd == rhs.updatePriorYearInd)||((this.updatePriorYearInd!= null)&&this.updatePriorYearInd.equals(rhs.updatePriorYearInd))))&&((this.pckgInd == rhs.pckgInd)||((this.pckgInd!= null)&&this.pckgInd.equals(rhs.pckgInd))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.memoInd == rhs.memoInd)||((this.memoInd!= null)&&this.memoInd.equals(rhs.memoInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.onceInd == rhs.onceInd)||((this.onceInd!= null)&&this.onceInd.equals(rhs.onceInd))))&&((this.accessInd == rhs.accessInd)||((this.accessInd!= null)&&this.accessInd.equals(rhs.accessInd))))&&((this.disbInd == rhs.disbInd)||((this.disbInd!= null)&&this.disbInd.equals(rhs.disbInd))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.shortDesc == rhs.shortDesc)||((this.shortDesc!= null)&&this.shortDesc.equals(rhs.shortDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.useFedFundIdInd == rhs.useFedFundIdInd)||((this.useFedFundIdInd!= null)&&this.useFedFundIdInd.equals(rhs.useFedFundIdInd))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.longDesc == rhs.longDesc)||((this.longDesc!= null)&&this.longDesc.equals(rhs.longDesc))));
    }

}
