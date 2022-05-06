
package com.ellucian.generated.bpapi.ban.student_sport_compliance.v1_0_0;

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
    "dummy",
    "actcDesc",
    "eligCode",
    "activityDate",
    "eligDesc",
    "athlAidInd",
    "saelDesc",
    "spstCode",
    "saelCode",
    "userId",
    "actcCode",
    "spstDesc"
})
@Generated("jsonschema2pojo")
public class Sgrsprt {

    @JsonProperty("dummy")
    private String dummy;
    @JsonProperty("actcDesc")
    private String actcDesc;
    /**
     * Eligible
     * <p>
     * Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligCode")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig")
    private String eligCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRSPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("eligDesc")
    private String eligDesc;
    /**
     * Lineage reference object : SGRSPRT_ATHL_AID_IND
     * 
     */
    @JsonProperty("athlAidInd")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_ATHL_AID_IND")
    private String athlAidInd;
    @JsonProperty("saelDesc")
    private String saelDesc;
    /**
     * Status
     * <p>
     * Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("spstCode")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst")
    private String spstCode;
    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("saelCode")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael")
    private String saelCode;
    /**
     * User ID
     * <p>
     * Lineage reference object : SGRSPRT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_USER_ID")
    private String userId;
    /**
     * Sport
     * <p>
     * Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc")
    private String actcCode;
    @JsonProperty("spstDesc")
    private String spstDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dummy")
    public String getDummy() {
        return dummy;
    }

    @JsonProperty("dummy")
    public void setDummy(String dummy) {
        this.dummy = dummy;
    }

    public Sgrsprt withDummy(String dummy) {
        this.dummy = dummy;
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

    public Sgrsprt withActcDesc(String actcDesc) {
        this.actcDesc = actcDesc;
        return this;
    }

    /**
     * Eligible
     * <p>
     * Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligCode")
    public String getEligCode() {
        return eligCode;
    }

    /**
     * Eligible
     * <p>
     * Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligCode")
    public void setEligCode(String eligCode) {
        this.eligCode = eligCode;
    }

    public Sgrsprt withEligCode(String eligCode) {
        this.eligCode = eligCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRSPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRSPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sgrsprt withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("eligDesc")
    public String getEligDesc() {
        return eligDesc;
    }

    @JsonProperty("eligDesc")
    public void setEligDesc(String eligDesc) {
        this.eligDesc = eligDesc;
    }

    public Sgrsprt withEligDesc(String eligDesc) {
        this.eligDesc = eligDesc;
        return this;
    }

    /**
     * Lineage reference object : SGRSPRT_ATHL_AID_IND
     * 
     */
    @JsonProperty("athlAidInd")
    public String getAthlAidInd() {
        return athlAidInd;
    }

    /**
     * Lineage reference object : SGRSPRT_ATHL_AID_IND
     * 
     */
    @JsonProperty("athlAidInd")
    public void setAthlAidInd(String athlAidInd) {
        this.athlAidInd = athlAidInd;
    }

    public Sgrsprt withAthlAidInd(String athlAidInd) {
        this.athlAidInd = athlAidInd;
        return this;
    }

    @JsonProperty("saelDesc")
    public String getSaelDesc() {
        return saelDesc;
    }

    @JsonProperty("saelDesc")
    public void setSaelDesc(String saelDesc) {
        this.saelDesc = saelDesc;
    }

    public Sgrsprt withSaelDesc(String saelDesc) {
        this.saelDesc = saelDesc;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("spstCode")
    public String getSpstCode() {
        return spstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("spstCode")
    public void setSpstCode(String spstCode) {
        this.spstCode = spstCode;
    }

    public Sgrsprt withSpstCode(String spstCode) {
        this.spstCode = spstCode;
        return this;
    }

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("saelCode")
    public String getSaelCode() {
        return saelCode;
    }

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("saelCode")
    public void setSaelCode(String saelCode) {
        this.saelCode = saelCode;
    }

    public Sgrsprt withSaelCode(String saelCode) {
        this.saelCode = saelCode;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRSPRT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRSPRT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sgrsprt withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public Sgrsprt withActcCode(String actcCode) {
        this.actcCode = actcCode;
        return this;
    }

    @JsonProperty("spstDesc")
    public String getSpstDesc() {
        return spstDesc;
    }

    @JsonProperty("spstDesc")
    public void setSpstDesc(String spstDesc) {
        this.spstDesc = spstDesc;
    }

    public Sgrsprt withSpstDesc(String spstDesc) {
        this.spstDesc = spstDesc;
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

    public Sgrsprt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sgrsprt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dummy");
        sb.append('=');
        sb.append(((this.dummy == null)?"<null>":this.dummy));
        sb.append(',');
        sb.append("actcDesc");
        sb.append('=');
        sb.append(((this.actcDesc == null)?"<null>":this.actcDesc));
        sb.append(',');
        sb.append("eligCode");
        sb.append('=');
        sb.append(((this.eligCode == null)?"<null>":this.eligCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("eligDesc");
        sb.append('=');
        sb.append(((this.eligDesc == null)?"<null>":this.eligDesc));
        sb.append(',');
        sb.append("athlAidInd");
        sb.append('=');
        sb.append(((this.athlAidInd == null)?"<null>":this.athlAidInd));
        sb.append(',');
        sb.append("saelDesc");
        sb.append('=');
        sb.append(((this.saelDesc == null)?"<null>":this.saelDesc));
        sb.append(',');
        sb.append("spstCode");
        sb.append('=');
        sb.append(((this.spstCode == null)?"<null>":this.spstCode));
        sb.append(',');
        sb.append("saelCode");
        sb.append('=');
        sb.append(((this.saelCode == null)?"<null>":this.saelCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
        sb.append(',');
        sb.append("spstDesc");
        sb.append('=');
        sb.append(((this.spstDesc == null)?"<null>":this.spstDesc));
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
        result = ((result* 31)+((this.actcDesc == null)? 0 :this.actcDesc.hashCode()));
        result = ((result* 31)+((this.eligCode == null)? 0 :this.eligCode.hashCode()));
        result = ((result* 31)+((this.eligDesc == null)? 0 :this.eligDesc.hashCode()));
        result = ((result* 31)+((this.athlAidInd == null)? 0 :this.athlAidInd.hashCode()));
        result = ((result* 31)+((this.saelDesc == null)? 0 :this.saelDesc.hashCode()));
        result = ((result* 31)+((this.spstCode == null)? 0 :this.spstCode.hashCode()));
        result = ((result* 31)+((this.saelCode == null)? 0 :this.saelCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.spstDesc == null)? 0 :this.spstDesc.hashCode()));
        result = ((result* 31)+((this.dummy == null)? 0 :this.dummy.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sgrsprt) == false) {
            return false;
        }
        Sgrsprt rhs = ((Sgrsprt) other);
        return ((((((((((((((this.actcDesc == rhs.actcDesc)||((this.actcDesc!= null)&&this.actcDesc.equals(rhs.actcDesc)))&&((this.eligCode == rhs.eligCode)||((this.eligCode!= null)&&this.eligCode.equals(rhs.eligCode))))&&((this.eligDesc == rhs.eligDesc)||((this.eligDesc!= null)&&this.eligDesc.equals(rhs.eligDesc))))&&((this.athlAidInd == rhs.athlAidInd)||((this.athlAidInd!= null)&&this.athlAidInd.equals(rhs.athlAidInd))))&&((this.saelDesc == rhs.saelDesc)||((this.saelDesc!= null)&&this.saelDesc.equals(rhs.saelDesc))))&&((this.spstCode == rhs.spstCode)||((this.spstCode!= null)&&this.spstCode.equals(rhs.spstCode))))&&((this.saelCode == rhs.saelCode)||((this.saelCode!= null)&&this.saelCode.equals(rhs.saelCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.spstDesc == rhs.spstDesc)||((this.spstDesc!= null)&&this.spstDesc.equals(rhs.spstDesc))))&&((this.dummy == rhs.dummy)||((this.dummy!= null)&&this.dummy.equals(rhs.dummy))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))));
    }

}
