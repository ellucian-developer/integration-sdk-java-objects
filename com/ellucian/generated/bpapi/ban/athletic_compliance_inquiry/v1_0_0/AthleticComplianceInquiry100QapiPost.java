
package com.ellucian.generated.bpapi.ban.athletic_compliance_inquiry.v1_0_0;

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
    "id",
    "actcCode",
    "termCode",
    "fullName",
    "spstCode",
    "eligCode",
    "saelCode",
    "ststCode",
    "astdCode",
    "athlAidInd",
    "seasonUsedInd",
    "currentInd",
    "compActivityDate",
    "compUserId"
})
@Generated("jsonschema2pojo")
public class AthleticComplianceInquiry100QapiPost {

    @JsonProperty("id")
    private String id;
    /**
     * Sport
     * <p>
     * Lineage reference object : SGVISPT_ACTC_CODE, Lookup lineage reference object : stvactc
     * 
     */
    @JsonProperty("actcCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_ACTC_CODE, Lookup lineage reference object : stvactc")
    private String actcCode;
    /**
     * Term
     * <p>
     * Lineage reference object : SGVISPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonProperty("fullName")
    private String fullName;
    /**
     * Status
     * <p>
     * Lineage reference object : SGVISPT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("spstCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_SPST_CODE, Lookup lineage reference object : stvspst")
    private String spstCode;
    /**
     * Eligible
     * <p>
     * Lineage reference object : SGVISPT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_ELIG_CODE, Lookup lineage reference object : stvelig")
    private String eligCode;
    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGVISPT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("saelCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_SAEL_CODE, Lookup lineage reference object : stvsael")
    private String saelCode;
    /**
     * Student Status
     * <p>
     * Lineage reference object : SGVISPT_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_STST_CODE, Lookup lineage reference object : stvstst")
    private String ststCode;
    /**
     * Academic Standing
     * <p>
     * Lineage reference object : SGVISPT_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_ASTD_CODE, Lookup lineage reference object : stvastd")
    private String astdCode;
    /**
     * Lineage reference object : SGVISPT_ATHL_AID_IND
     * 
     */
    @JsonProperty("athlAidInd")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_ATHL_AID_IND")
    private String athlAidInd;
    /**
     * Lineage reference object : SGVISPT_SEASON_USED_IND
     * 
     */
    @JsonProperty("seasonUsedInd")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_SEASON_USED_IND")
    private String seasonUsedInd;
    /**
     * Lineage reference object : SGVISPT_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_CURRENT_IND")
    private String currentInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGVISPT_COMP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("compActivityDate")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_COMP_ACTIVITY_DATE")
    private Date compActivityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SGVISPT_COMP_USER_ID
     * 
     */
    @JsonProperty("compUserId")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_COMP_USER_ID")
    private String compUserId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AthleticComplianceInquiry100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SGVISPT_ACTC_CODE, Lookup lineage reference object : stvactc
     * 
     */
    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SGVISPT_ACTC_CODE, Lookup lineage reference object : stvactc
     * 
     */
    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public AthleticComplianceInquiry100QapiPost withActcCode(String actcCode) {
        this.actcCode = actcCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SGVISPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SGVISPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public AthleticComplianceInquiry100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public AthleticComplianceInquiry100QapiPost withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SGVISPT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("spstCode")
    public String getSpstCode() {
        return spstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SGVISPT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("spstCode")
    public void setSpstCode(String spstCode) {
        this.spstCode = spstCode;
    }

    public AthleticComplianceInquiry100QapiPost withSpstCode(String spstCode) {
        this.spstCode = spstCode;
        return this;
    }

    /**
     * Eligible
     * <p>
     * Lineage reference object : SGVISPT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligCode")
    public String getEligCode() {
        return eligCode;
    }

    /**
     * Eligible
     * <p>
     * Lineage reference object : SGVISPT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligCode")
    public void setEligCode(String eligCode) {
        this.eligCode = eligCode;
    }

    public AthleticComplianceInquiry100QapiPost withEligCode(String eligCode) {
        this.eligCode = eligCode;
        return this;
    }

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGVISPT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("saelCode")
    public String getSaelCode() {
        return saelCode;
    }

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGVISPT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("saelCode")
    public void setSaelCode(String saelCode) {
        this.saelCode = saelCode;
    }

    public AthleticComplianceInquiry100QapiPost withSaelCode(String saelCode) {
        this.saelCode = saelCode;
        return this;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGVISPT_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    public String getStstCode() {
        return ststCode;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGVISPT_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    public void setStstCode(String ststCode) {
        this.ststCode = ststCode;
    }

    public AthleticComplianceInquiry100QapiPost withStstCode(String ststCode) {
        this.ststCode = ststCode;
        return this;
    }

    /**
     * Academic Standing
     * <p>
     * Lineage reference object : SGVISPT_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCode")
    public String getAstdCode() {
        return astdCode;
    }

    /**
     * Academic Standing
     * <p>
     * Lineage reference object : SGVISPT_ASTD_CODE, Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("astdCode")
    public void setAstdCode(String astdCode) {
        this.astdCode = astdCode;
    }

    public AthleticComplianceInquiry100QapiPost withAstdCode(String astdCode) {
        this.astdCode = astdCode;
        return this;
    }

    /**
     * Lineage reference object : SGVISPT_ATHL_AID_IND
     * 
     */
    @JsonProperty("athlAidInd")
    public String getAthlAidInd() {
        return athlAidInd;
    }

    /**
     * Lineage reference object : SGVISPT_ATHL_AID_IND
     * 
     */
    @JsonProperty("athlAidInd")
    public void setAthlAidInd(String athlAidInd) {
        this.athlAidInd = athlAidInd;
    }

    public AthleticComplianceInquiry100QapiPost withAthlAidInd(String athlAidInd) {
        this.athlAidInd = athlAidInd;
        return this;
    }

    /**
     * Lineage reference object : SGVISPT_SEASON_USED_IND
     * 
     */
    @JsonProperty("seasonUsedInd")
    public String getSeasonUsedInd() {
        return seasonUsedInd;
    }

    /**
     * Lineage reference object : SGVISPT_SEASON_USED_IND
     * 
     */
    @JsonProperty("seasonUsedInd")
    public void setSeasonUsedInd(String seasonUsedInd) {
        this.seasonUsedInd = seasonUsedInd;
    }

    public AthleticComplianceInquiry100QapiPost withSeasonUsedInd(String seasonUsedInd) {
        this.seasonUsedInd = seasonUsedInd;
        return this;
    }

    /**
     * Lineage reference object : SGVISPT_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    public String getCurrentInd() {
        return currentInd;
    }

    /**
     * Lineage reference object : SGVISPT_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    public void setCurrentInd(String currentInd) {
        this.currentInd = currentInd;
    }

    public AthleticComplianceInquiry100QapiPost withCurrentInd(String currentInd) {
        this.currentInd = currentInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGVISPT_COMP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("compActivityDate")
    public Date getCompActivityDate() {
        return compActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGVISPT_COMP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("compActivityDate")
    public void setCompActivityDate(Date compActivityDate) {
        this.compActivityDate = compActivityDate;
    }

    public AthleticComplianceInquiry100QapiPost withCompActivityDate(Date compActivityDate) {
        this.compActivityDate = compActivityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGVISPT_COMP_USER_ID
     * 
     */
    @JsonProperty("compUserId")
    public String getCompUserId() {
        return compUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGVISPT_COMP_USER_ID
     * 
     */
    @JsonProperty("compUserId")
    public void setCompUserId(String compUserId) {
        this.compUserId = compUserId;
    }

    public AthleticComplianceInquiry100QapiPost withCompUserId(String compUserId) {
        this.compUserId = compUserId;
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

    public AthleticComplianceInquiry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AthleticComplianceInquiry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("spstCode");
        sb.append('=');
        sb.append(((this.spstCode == null)?"<null>":this.spstCode));
        sb.append(',');
        sb.append("eligCode");
        sb.append('=');
        sb.append(((this.eligCode == null)?"<null>":this.eligCode));
        sb.append(',');
        sb.append("saelCode");
        sb.append('=');
        sb.append(((this.saelCode == null)?"<null>":this.saelCode));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("astdCode");
        sb.append('=');
        sb.append(((this.astdCode == null)?"<null>":this.astdCode));
        sb.append(',');
        sb.append("athlAidInd");
        sb.append('=');
        sb.append(((this.athlAidInd == null)?"<null>":this.athlAidInd));
        sb.append(',');
        sb.append("seasonUsedInd");
        sb.append('=');
        sb.append(((this.seasonUsedInd == null)?"<null>":this.seasonUsedInd));
        sb.append(',');
        sb.append("currentInd");
        sb.append('=');
        sb.append(((this.currentInd == null)?"<null>":this.currentInd));
        sb.append(',');
        sb.append("compActivityDate");
        sb.append('=');
        sb.append(((this.compActivityDate == null)?"<null>":this.compActivityDate));
        sb.append(',');
        sb.append("compUserId");
        sb.append('=');
        sb.append(((this.compUserId == null)?"<null>":this.compUserId));
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
        result = ((result* 31)+((this.eligCode == null)? 0 :this.eligCode.hashCode()));
        result = ((result* 31)+((this.athlAidInd == null)? 0 :this.athlAidInd.hashCode()));
        result = ((result* 31)+((this.compUserId == null)? 0 :this.compUserId.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.spstCode == null)? 0 :this.spstCode.hashCode()));
        result = ((result* 31)+((this.compActivityDate == null)? 0 :this.compActivityDate.hashCode()));
        result = ((result* 31)+((this.saelCode == null)? 0 :this.saelCode.hashCode()));
        result = ((result* 31)+((this.seasonUsedInd == null)? 0 :this.seasonUsedInd.hashCode()));
        result = ((result* 31)+((this.currentInd == null)? 0 :this.currentInd.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.astdCode == null)? 0 :this.astdCode.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AthleticComplianceInquiry100QapiPost) == false) {
            return false;
        }
        AthleticComplianceInquiry100QapiPost rhs = ((AthleticComplianceInquiry100QapiPost) other);
        return ((((((((((((((((this.eligCode == rhs.eligCode)||((this.eligCode!= null)&&this.eligCode.equals(rhs.eligCode)))&&((this.athlAidInd == rhs.athlAidInd)||((this.athlAidInd!= null)&&this.athlAidInd.equals(rhs.athlAidInd))))&&((this.compUserId == rhs.compUserId)||((this.compUserId!= null)&&this.compUserId.equals(rhs.compUserId))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.spstCode == rhs.spstCode)||((this.spstCode!= null)&&this.spstCode.equals(rhs.spstCode))))&&((this.compActivityDate == rhs.compActivityDate)||((this.compActivityDate!= null)&&this.compActivityDate.equals(rhs.compActivityDate))))&&((this.saelCode == rhs.saelCode)||((this.saelCode!= null)&&this.saelCode.equals(rhs.saelCode))))&&((this.seasonUsedInd == rhs.seasonUsedInd)||((this.seasonUsedInd!= null)&&this.seasonUsedInd.equals(rhs.seasonUsedInd))))&&((this.currentInd == rhs.currentInd)||((this.currentInd!= null)&&this.currentInd.equals(rhs.currentInd))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.astdCode == rhs.astdCode)||((this.astdCode!= null)&&this.astdCode.equals(rhs.astdCode))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
