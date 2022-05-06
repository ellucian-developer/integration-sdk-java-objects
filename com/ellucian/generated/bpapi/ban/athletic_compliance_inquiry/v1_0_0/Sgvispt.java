
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
    "seasonsAvailable",
    "actcDesc",
    "eligCode",
    "eligEndTermCode",
    "athlAidInd",
    "compUserId",
    "sareDesc",
    "spstCode",
    "compActivityDate",
    "saelCode",
    "seasonUsedInd",
    "eligBeginTermCode",
    "compSeqNo",
    "currentInd",
    "eligBeginTermDesc",
    "sareCode",
    "ststCode",
    "seasonsRemaining",
    "eligEndTermDesc",
    "termDesc",
    "seasonsUsed",
    "astdCode",
    "actcCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Sgvispt {

    /**
     * Lineage reference object : SGVISPT_SEASONS_AVAILABLE
     * 
     */
    @JsonProperty("seasonsAvailable")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_SEASONS_AVAILABLE")
    private Double seasonsAvailable;
    @JsonProperty("actcDesc")
    private String actcDesc;
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
     * End Term of Eligibility
     * <p>
     * Lineage reference object : SGVISPT_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligEndTermCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm")
    private String eligEndTermCode;
    /**
     * Lineage reference object : SGVISPT_ATHL_AID_IND
     * 
     */
    @JsonProperty("athlAidInd")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_ATHL_AID_IND")
    private String athlAidInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : SGVISPT_COMP_USER_ID
     * 
     */
    @JsonProperty("compUserId")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_COMP_USER_ID")
    private String compUserId;
    @JsonProperty("sareDesc")
    private String sareDesc;
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
     * Activity Date
     * <p>
     * Lineage reference object : SGVISPT_COMP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("compActivityDate")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_COMP_ACTIVITY_DATE")
    private Date compActivityDate;
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
     * Lineage reference object : SGVISPT_SEASON_USED_IND
     * 
     */
    @JsonProperty("seasonUsedInd")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_SEASON_USED_IND")
    private String seasonUsedInd;
    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGVISPT_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligBeginTermCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm")
    private String eligBeginTermCode;
    /**
     * Seasons of Competition Used
     * <p>
     * Lineage reference object : SGVISPT_COMP_SEQ_NO
     * 
     */
    @JsonProperty("compSeqNo")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_COMP_SEQ_NO")
    private Double compSeqNo;
    /**
     * Lineage reference object : SGVISPT_CURRENT_IND
     * 
     */
    @JsonProperty("currentInd")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_CURRENT_IND")
    private String currentInd;
    @JsonProperty("eligBeginTermDesc")
    private String eligBeginTermDesc;
    /**
     * Reason
     * <p>
     * Lineage reference object : SGVISPT_SARE_CODE
     * 
     */
    @JsonProperty("sareCode")
    @JsonPropertyDescription("Lineage reference object : SGVISPT_SARE_CODE")
    private String sareCode;
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
     * Seasons of Competition Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("seasonsRemaining")
    private Double seasonsRemaining;
    @JsonProperty("eligEndTermDesc")
    private String eligEndTermDesc;
    @JsonProperty("termDesc")
    private String termDesc;
    /**
     * Seasons of Competition Used
     * <p>
     * 
     * 
     */
    @JsonProperty("seasonsUsed")
    private Double seasonsUsed;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SGVISPT_SEASONS_AVAILABLE
     * 
     */
    @JsonProperty("seasonsAvailable")
    public Double getSeasonsAvailable() {
        return seasonsAvailable;
    }

    /**
     * Lineage reference object : SGVISPT_SEASONS_AVAILABLE
     * 
     */
    @JsonProperty("seasonsAvailable")
    public void setSeasonsAvailable(Double seasonsAvailable) {
        this.seasonsAvailable = seasonsAvailable;
    }

    public Sgvispt withSeasonsAvailable(Double seasonsAvailable) {
        this.seasonsAvailable = seasonsAvailable;
        return this;
    }

    @JsonProperty("actcDesc")
    public String getActcDesc() {
        return actcDesc;
    }

    @JsonProperty("actcDesc")
    public void setActcDesc(String actcDesc) {
        this.actcDesc = actcDesc;
    }

    public Sgvispt withActcDesc(String actcDesc) {
        this.actcDesc = actcDesc;
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

    public Sgvispt withEligCode(String eligCode) {
        this.eligCode = eligCode;
        return this;
    }

    /**
     * End Term of Eligibility
     * <p>
     * Lineage reference object : SGVISPT_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligEndTermCode")
    public String getEligEndTermCode() {
        return eligEndTermCode;
    }

    /**
     * End Term of Eligibility
     * <p>
     * Lineage reference object : SGVISPT_ELIG_END_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligEndTermCode")
    public void setEligEndTermCode(String eligEndTermCode) {
        this.eligEndTermCode = eligEndTermCode;
    }

    public Sgvispt withEligEndTermCode(String eligEndTermCode) {
        this.eligEndTermCode = eligEndTermCode;
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

    public Sgvispt withAthlAidInd(String athlAidInd) {
        this.athlAidInd = athlAidInd;
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

    public Sgvispt withCompUserId(String compUserId) {
        this.compUserId = compUserId;
        return this;
    }

    @JsonProperty("sareDesc")
    public String getSareDesc() {
        return sareDesc;
    }

    @JsonProperty("sareDesc")
    public void setSareDesc(String sareDesc) {
        this.sareDesc = sareDesc;
    }

    public Sgvispt withSareDesc(String sareDesc) {
        this.sareDesc = sareDesc;
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

    public Sgvispt withSpstCode(String spstCode) {
        this.spstCode = spstCode;
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

    public Sgvispt withCompActivityDate(Date compActivityDate) {
        this.compActivityDate = compActivityDate;
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

    public Sgvispt withSaelCode(String saelCode) {
        this.saelCode = saelCode;
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

    public Sgvispt withSeasonUsedInd(String seasonUsedInd) {
        this.seasonUsedInd = seasonUsedInd;
        return this;
    }

    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGVISPT_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligBeginTermCode")
    public String getEligBeginTermCode() {
        return eligBeginTermCode;
    }

    /**
     * Begin Term of Eligibility
     * <p>
     * Lineage reference object : SGVISPT_ELIG_BEGIN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("eligBeginTermCode")
    public void setEligBeginTermCode(String eligBeginTermCode) {
        this.eligBeginTermCode = eligBeginTermCode;
    }

    public Sgvispt withEligBeginTermCode(String eligBeginTermCode) {
        this.eligBeginTermCode = eligBeginTermCode;
        return this;
    }

    /**
     * Seasons of Competition Used
     * <p>
     * Lineage reference object : SGVISPT_COMP_SEQ_NO
     * 
     */
    @JsonProperty("compSeqNo")
    public Double getCompSeqNo() {
        return compSeqNo;
    }

    /**
     * Seasons of Competition Used
     * <p>
     * Lineage reference object : SGVISPT_COMP_SEQ_NO
     * 
     */
    @JsonProperty("compSeqNo")
    public void setCompSeqNo(Double compSeqNo) {
        this.compSeqNo = compSeqNo;
    }

    public Sgvispt withCompSeqNo(Double compSeqNo) {
        this.compSeqNo = compSeqNo;
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

    public Sgvispt withCurrentInd(String currentInd) {
        this.currentInd = currentInd;
        return this;
    }

    @JsonProperty("eligBeginTermDesc")
    public String getEligBeginTermDesc() {
        return eligBeginTermDesc;
    }

    @JsonProperty("eligBeginTermDesc")
    public void setEligBeginTermDesc(String eligBeginTermDesc) {
        this.eligBeginTermDesc = eligBeginTermDesc;
    }

    public Sgvispt withEligBeginTermDesc(String eligBeginTermDesc) {
        this.eligBeginTermDesc = eligBeginTermDesc;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGVISPT_SARE_CODE
     * 
     */
    @JsonProperty("sareCode")
    public String getSareCode() {
        return sareCode;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGVISPT_SARE_CODE
     * 
     */
    @JsonProperty("sareCode")
    public void setSareCode(String sareCode) {
        this.sareCode = sareCode;
    }

    public Sgvispt withSareCode(String sareCode) {
        this.sareCode = sareCode;
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

    public Sgvispt withStstCode(String ststCode) {
        this.ststCode = ststCode;
        return this;
    }

    /**
     * Seasons of Competition Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("seasonsRemaining")
    public Double getSeasonsRemaining() {
        return seasonsRemaining;
    }

    /**
     * Seasons of Competition Remaining
     * <p>
     * 
     * 
     */
    @JsonProperty("seasonsRemaining")
    public void setSeasonsRemaining(Double seasonsRemaining) {
        this.seasonsRemaining = seasonsRemaining;
    }

    public Sgvispt withSeasonsRemaining(Double seasonsRemaining) {
        this.seasonsRemaining = seasonsRemaining;
        return this;
    }

    @JsonProperty("eligEndTermDesc")
    public String getEligEndTermDesc() {
        return eligEndTermDesc;
    }

    @JsonProperty("eligEndTermDesc")
    public void setEligEndTermDesc(String eligEndTermDesc) {
        this.eligEndTermDesc = eligEndTermDesc;
    }

    public Sgvispt withEligEndTermDesc(String eligEndTermDesc) {
        this.eligEndTermDesc = eligEndTermDesc;
        return this;
    }

    @JsonProperty("termDesc")
    public String getTermDesc() {
        return termDesc;
    }

    @JsonProperty("termDesc")
    public void setTermDesc(String termDesc) {
        this.termDesc = termDesc;
    }

    public Sgvispt withTermDesc(String termDesc) {
        this.termDesc = termDesc;
        return this;
    }

    /**
     * Seasons of Competition Used
     * <p>
     * 
     * 
     */
    @JsonProperty("seasonsUsed")
    public Double getSeasonsUsed() {
        return seasonsUsed;
    }

    /**
     * Seasons of Competition Used
     * <p>
     * 
     * 
     */
    @JsonProperty("seasonsUsed")
    public void setSeasonsUsed(Double seasonsUsed) {
        this.seasonsUsed = seasonsUsed;
    }

    public Sgvispt withSeasonsUsed(Double seasonsUsed) {
        this.seasonsUsed = seasonsUsed;
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

    public Sgvispt withAstdCode(String astdCode) {
        this.astdCode = astdCode;
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

    public Sgvispt withActcCode(String actcCode) {
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

    public Sgvispt withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Sgvispt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sgvispt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seasonsAvailable");
        sb.append('=');
        sb.append(((this.seasonsAvailable == null)?"<null>":this.seasonsAvailable));
        sb.append(',');
        sb.append("actcDesc");
        sb.append('=');
        sb.append(((this.actcDesc == null)?"<null>":this.actcDesc));
        sb.append(',');
        sb.append("eligCode");
        sb.append('=');
        sb.append(((this.eligCode == null)?"<null>":this.eligCode));
        sb.append(',');
        sb.append("eligEndTermCode");
        sb.append('=');
        sb.append(((this.eligEndTermCode == null)?"<null>":this.eligEndTermCode));
        sb.append(',');
        sb.append("athlAidInd");
        sb.append('=');
        sb.append(((this.athlAidInd == null)?"<null>":this.athlAidInd));
        sb.append(',');
        sb.append("compUserId");
        sb.append('=');
        sb.append(((this.compUserId == null)?"<null>":this.compUserId));
        sb.append(',');
        sb.append("sareDesc");
        sb.append('=');
        sb.append(((this.sareDesc == null)?"<null>":this.sareDesc));
        sb.append(',');
        sb.append("spstCode");
        sb.append('=');
        sb.append(((this.spstCode == null)?"<null>":this.spstCode));
        sb.append(',');
        sb.append("compActivityDate");
        sb.append('=');
        sb.append(((this.compActivityDate == null)?"<null>":this.compActivityDate));
        sb.append(',');
        sb.append("saelCode");
        sb.append('=');
        sb.append(((this.saelCode == null)?"<null>":this.saelCode));
        sb.append(',');
        sb.append("seasonUsedInd");
        sb.append('=');
        sb.append(((this.seasonUsedInd == null)?"<null>":this.seasonUsedInd));
        sb.append(',');
        sb.append("eligBeginTermCode");
        sb.append('=');
        sb.append(((this.eligBeginTermCode == null)?"<null>":this.eligBeginTermCode));
        sb.append(',');
        sb.append("compSeqNo");
        sb.append('=');
        sb.append(((this.compSeqNo == null)?"<null>":this.compSeqNo));
        sb.append(',');
        sb.append("currentInd");
        sb.append('=');
        sb.append(((this.currentInd == null)?"<null>":this.currentInd));
        sb.append(',');
        sb.append("eligBeginTermDesc");
        sb.append('=');
        sb.append(((this.eligBeginTermDesc == null)?"<null>":this.eligBeginTermDesc));
        sb.append(',');
        sb.append("sareCode");
        sb.append('=');
        sb.append(((this.sareCode == null)?"<null>":this.sareCode));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("seasonsRemaining");
        sb.append('=');
        sb.append(((this.seasonsRemaining == null)?"<null>":this.seasonsRemaining));
        sb.append(',');
        sb.append("eligEndTermDesc");
        sb.append('=');
        sb.append(((this.eligEndTermDesc == null)?"<null>":this.eligEndTermDesc));
        sb.append(',');
        sb.append("termDesc");
        sb.append('=');
        sb.append(((this.termDesc == null)?"<null>":this.termDesc));
        sb.append(',');
        sb.append("seasonsUsed");
        sb.append('=');
        sb.append(((this.seasonsUsed == null)?"<null>":this.seasonsUsed));
        sb.append(',');
        sb.append("astdCode");
        sb.append('=');
        sb.append(((this.astdCode == null)?"<null>":this.astdCode));
        sb.append(',');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.seasonsAvailable == null)? 0 :this.seasonsAvailable.hashCode()));
        result = ((result* 31)+((this.eligEndTermCode == null)? 0 :this.eligEndTermCode.hashCode()));
        result = ((result* 31)+((this.athlAidInd == null)? 0 :this.athlAidInd.hashCode()));
        result = ((result* 31)+((this.compUserId == null)? 0 :this.compUserId.hashCode()));
        result = ((result* 31)+((this.saelCode == null)? 0 :this.saelCode.hashCode()));
        result = ((result* 31)+((this.seasonUsedInd == null)? 0 :this.seasonUsedInd.hashCode()));
        result = ((result* 31)+((this.sareCode == null)? 0 :this.sareCode.hashCode()));
        result = ((result* 31)+((this.termDesc == null)? 0 :this.termDesc.hashCode()));
        result = ((result* 31)+((this.seasonsUsed == null)? 0 :this.seasonsUsed.hashCode()));
        result = ((result* 31)+((this.actcDesc == null)? 0 :this.actcDesc.hashCode()));
        result = ((result* 31)+((this.eligCode == null)? 0 :this.eligCode.hashCode()));
        result = ((result* 31)+((this.sareDesc == null)? 0 :this.sareDesc.hashCode()));
        result = ((result* 31)+((this.spstCode == null)? 0 :this.spstCode.hashCode()));
        result = ((result* 31)+((this.compActivityDate == null)? 0 :this.compActivityDate.hashCode()));
        result = ((result* 31)+((this.eligBeginTermCode == null)? 0 :this.eligBeginTermCode.hashCode()));
        result = ((result* 31)+((this.compSeqNo == null)? 0 :this.compSeqNo.hashCode()));
        result = ((result* 31)+((this.currentInd == null)? 0 :this.currentInd.hashCode()));
        result = ((result* 31)+((this.eligBeginTermDesc == null)? 0 :this.eligBeginTermDesc.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.seasonsRemaining == null)? 0 :this.seasonsRemaining.hashCode()));
        result = ((result* 31)+((this.eligEndTermDesc == null)? 0 :this.eligEndTermDesc.hashCode()));
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
        if ((other instanceof Sgvispt) == false) {
            return false;
        }
        Sgvispt rhs = ((Sgvispt) other);
        return ((((((((((((((((((((((((((this.seasonsAvailable == rhs.seasonsAvailable)||((this.seasonsAvailable!= null)&&this.seasonsAvailable.equals(rhs.seasonsAvailable)))&&((this.eligEndTermCode == rhs.eligEndTermCode)||((this.eligEndTermCode!= null)&&this.eligEndTermCode.equals(rhs.eligEndTermCode))))&&((this.athlAidInd == rhs.athlAidInd)||((this.athlAidInd!= null)&&this.athlAidInd.equals(rhs.athlAidInd))))&&((this.compUserId == rhs.compUserId)||((this.compUserId!= null)&&this.compUserId.equals(rhs.compUserId))))&&((this.saelCode == rhs.saelCode)||((this.saelCode!= null)&&this.saelCode.equals(rhs.saelCode))))&&((this.seasonUsedInd == rhs.seasonUsedInd)||((this.seasonUsedInd!= null)&&this.seasonUsedInd.equals(rhs.seasonUsedInd))))&&((this.sareCode == rhs.sareCode)||((this.sareCode!= null)&&this.sareCode.equals(rhs.sareCode))))&&((this.termDesc == rhs.termDesc)||((this.termDesc!= null)&&this.termDesc.equals(rhs.termDesc))))&&((this.seasonsUsed == rhs.seasonsUsed)||((this.seasonsUsed!= null)&&this.seasonsUsed.equals(rhs.seasonsUsed))))&&((this.actcDesc == rhs.actcDesc)||((this.actcDesc!= null)&&this.actcDesc.equals(rhs.actcDesc))))&&((this.eligCode == rhs.eligCode)||((this.eligCode!= null)&&this.eligCode.equals(rhs.eligCode))))&&((this.sareDesc == rhs.sareDesc)||((this.sareDesc!= null)&&this.sareDesc.equals(rhs.sareDesc))))&&((this.spstCode == rhs.spstCode)||((this.spstCode!= null)&&this.spstCode.equals(rhs.spstCode))))&&((this.compActivityDate == rhs.compActivityDate)||((this.compActivityDate!= null)&&this.compActivityDate.equals(rhs.compActivityDate))))&&((this.eligBeginTermCode == rhs.eligBeginTermCode)||((this.eligBeginTermCode!= null)&&this.eligBeginTermCode.equals(rhs.eligBeginTermCode))))&&((this.compSeqNo == rhs.compSeqNo)||((this.compSeqNo!= null)&&this.compSeqNo.equals(rhs.compSeqNo))))&&((this.currentInd == rhs.currentInd)||((this.currentInd!= null)&&this.currentInd.equals(rhs.currentInd))))&&((this.eligBeginTermDesc == rhs.eligBeginTermDesc)||((this.eligBeginTermDesc!= null)&&this.eligBeginTermDesc.equals(rhs.eligBeginTermDesc))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.seasonsRemaining == rhs.seasonsRemaining)||((this.seasonsRemaining!= null)&&this.seasonsRemaining.equals(rhs.seasonsRemaining))))&&((this.eligEndTermDesc == rhs.eligEndTermDesc)||((this.eligEndTermDesc!= null)&&this.eligEndTermDesc.equals(rhs.eligEndTermDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.astdCode == rhs.astdCode)||((this.astdCode!= null)&&this.astdCode.equals(rhs.astdCode))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
