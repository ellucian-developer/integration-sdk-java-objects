
package com.ellucian.generated.bpapi.ban.enrollment_status_codes.v1_0_0;

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
    "effCrseStat",
    "thirdPartyWdInd",
    "wdrlCodeDef",
    "activityDate",
    "code",
    "systemReqInd",
    "prevReg",
    "wdInd",
    "effHeadcount",
    "desc"
})
@Generated("jsonschema2pojo")
public class EnrollmentStatusCodes100GetRequest {

    /**
     * Lineage reference object : STVESTS_EFF_CRSE_STAT
     * 
     */
    @JsonProperty("effCrseStat")
    @JsonPropertyDescription("Lineage reference object : STVESTS_EFF_CRSE_STAT")
    private String effCrseStat;
    /**
     * Lineage reference object : STVESTS_THIRD_PARTY_WD_IND
     * 
     */
    @JsonProperty("thirdPartyWdInd")
    @JsonPropertyDescription("Lineage reference object : STVESTS_THIRD_PARTY_WD_IND")
    private String thirdPartyWdInd;
    /**
     * Withdrawal Code
     * <p>
     * Lineage reference object : STVESTS_WDRL_CODE_DEF, Lookup lineage reference object : stvwdrl
     * 
     */
    @JsonProperty("wdrlCodeDef")
    @JsonPropertyDescription("Lineage reference object : STVESTS_WDRL_CODE_DEF, Lookup lineage reference object : stvwdrl")
    private String wdrlCodeDef;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVESTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVESTS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVESTS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVESTS_CODE")
    private String code;
    /**
     * Lineage reference object : STVESTS_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVESTS_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Lineage reference object : STVESTS_PREV_REG
     * 
     */
    @JsonProperty("prevReg")
    @JsonPropertyDescription("Lineage reference object : STVESTS_PREV_REG")
    private String prevReg;
    /**
     * Lineage reference object : STVESTS_WD_IND
     * 
     */
    @JsonProperty("wdInd")
    @JsonPropertyDescription("Lineage reference object : STVESTS_WD_IND")
    private String wdInd;
    /**
     * Lineage reference object : STVESTS_EFF_HEADCOUNT
     * 
     */
    @JsonProperty("effHeadcount")
    @JsonPropertyDescription("Lineage reference object : STVESTS_EFF_HEADCOUNT")
    private String effHeadcount;
    /**
     * Description
     * <p>
     * Lineage reference object : STVESTS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVESTS_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVESTS_EFF_CRSE_STAT
     * 
     */
    @JsonProperty("effCrseStat")
    public String getEffCrseStat() {
        return effCrseStat;
    }

    /**
     * Lineage reference object : STVESTS_EFF_CRSE_STAT
     * 
     */
    @JsonProperty("effCrseStat")
    public void setEffCrseStat(String effCrseStat) {
        this.effCrseStat = effCrseStat;
    }

    public EnrollmentStatusCodes100GetRequest withEffCrseStat(String effCrseStat) {
        this.effCrseStat = effCrseStat;
        return this;
    }

    /**
     * Lineage reference object : STVESTS_THIRD_PARTY_WD_IND
     * 
     */
    @JsonProperty("thirdPartyWdInd")
    public String getThirdPartyWdInd() {
        return thirdPartyWdInd;
    }

    /**
     * Lineage reference object : STVESTS_THIRD_PARTY_WD_IND
     * 
     */
    @JsonProperty("thirdPartyWdInd")
    public void setThirdPartyWdInd(String thirdPartyWdInd) {
        this.thirdPartyWdInd = thirdPartyWdInd;
    }

    public EnrollmentStatusCodes100GetRequest withThirdPartyWdInd(String thirdPartyWdInd) {
        this.thirdPartyWdInd = thirdPartyWdInd;
        return this;
    }

    /**
     * Withdrawal Code
     * <p>
     * Lineage reference object : STVESTS_WDRL_CODE_DEF, Lookup lineage reference object : stvwdrl
     * 
     */
    @JsonProperty("wdrlCodeDef")
    public String getWdrlCodeDef() {
        return wdrlCodeDef;
    }

    /**
     * Withdrawal Code
     * <p>
     * Lineage reference object : STVESTS_WDRL_CODE_DEF, Lookup lineage reference object : stvwdrl
     * 
     */
    @JsonProperty("wdrlCodeDef")
    public void setWdrlCodeDef(String wdrlCodeDef) {
        this.wdrlCodeDef = wdrlCodeDef;
    }

    public EnrollmentStatusCodes100GetRequest withWdrlCodeDef(String wdrlCodeDef) {
        this.wdrlCodeDef = wdrlCodeDef;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVESTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVESTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EnrollmentStatusCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVESTS_CODE
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
     * Lineage reference object : STVESTS_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EnrollmentStatusCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVESTS_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVESTS_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public EnrollmentStatusCodes100GetRequest withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Lineage reference object : STVESTS_PREV_REG
     * 
     */
    @JsonProperty("prevReg")
    public String getPrevReg() {
        return prevReg;
    }

    /**
     * Lineage reference object : STVESTS_PREV_REG
     * 
     */
    @JsonProperty("prevReg")
    public void setPrevReg(String prevReg) {
        this.prevReg = prevReg;
    }

    public EnrollmentStatusCodes100GetRequest withPrevReg(String prevReg) {
        this.prevReg = prevReg;
        return this;
    }

    /**
     * Lineage reference object : STVESTS_WD_IND
     * 
     */
    @JsonProperty("wdInd")
    public String getWdInd() {
        return wdInd;
    }

    /**
     * Lineage reference object : STVESTS_WD_IND
     * 
     */
    @JsonProperty("wdInd")
    public void setWdInd(String wdInd) {
        this.wdInd = wdInd;
    }

    public EnrollmentStatusCodes100GetRequest withWdInd(String wdInd) {
        this.wdInd = wdInd;
        return this;
    }

    /**
     * Lineage reference object : STVESTS_EFF_HEADCOUNT
     * 
     */
    @JsonProperty("effHeadcount")
    public String getEffHeadcount() {
        return effHeadcount;
    }

    /**
     * Lineage reference object : STVESTS_EFF_HEADCOUNT
     * 
     */
    @JsonProperty("effHeadcount")
    public void setEffHeadcount(String effHeadcount) {
        this.effHeadcount = effHeadcount;
    }

    public EnrollmentStatusCodes100GetRequest withEffHeadcount(String effHeadcount) {
        this.effHeadcount = effHeadcount;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVESTS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVESTS_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EnrollmentStatusCodes100GetRequest withDesc(String desc) {
        this.desc = desc;
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

    public EnrollmentStatusCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollmentStatusCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effCrseStat");
        sb.append('=');
        sb.append(((this.effCrseStat == null)?"<null>":this.effCrseStat));
        sb.append(',');
        sb.append("thirdPartyWdInd");
        sb.append('=');
        sb.append(((this.thirdPartyWdInd == null)?"<null>":this.thirdPartyWdInd));
        sb.append(',');
        sb.append("wdrlCodeDef");
        sb.append('=');
        sb.append(((this.wdrlCodeDef == null)?"<null>":this.wdrlCodeDef));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("prevReg");
        sb.append('=');
        sb.append(((this.prevReg == null)?"<null>":this.prevReg));
        sb.append(',');
        sb.append("wdInd");
        sb.append('=');
        sb.append(((this.wdInd == null)?"<null>":this.wdInd));
        sb.append(',');
        sb.append("effHeadcount");
        sb.append('=');
        sb.append(((this.effHeadcount == null)?"<null>":this.effHeadcount));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.effCrseStat == null)? 0 :this.effCrseStat.hashCode()));
        result = ((result* 31)+((this.thirdPartyWdInd == null)? 0 :this.thirdPartyWdInd.hashCode()));
        result = ((result* 31)+((this.wdrlCodeDef == null)? 0 :this.wdrlCodeDef.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.prevReg == null)? 0 :this.prevReg.hashCode()));
        result = ((result* 31)+((this.wdInd == null)? 0 :this.wdInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effHeadcount == null)? 0 :this.effHeadcount.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollmentStatusCodes100GetRequest) == false) {
            return false;
        }
        EnrollmentStatusCodes100GetRequest rhs = ((EnrollmentStatusCodes100GetRequest) other);
        return ((((((((((((this.effCrseStat == rhs.effCrseStat)||((this.effCrseStat!= null)&&this.effCrseStat.equals(rhs.effCrseStat)))&&((this.thirdPartyWdInd == rhs.thirdPartyWdInd)||((this.thirdPartyWdInd!= null)&&this.thirdPartyWdInd.equals(rhs.thirdPartyWdInd))))&&((this.wdrlCodeDef == rhs.wdrlCodeDef)||((this.wdrlCodeDef!= null)&&this.wdrlCodeDef.equals(rhs.wdrlCodeDef))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.prevReg == rhs.prevReg)||((this.prevReg!= null)&&this.prevReg.equals(rhs.prevReg))))&&((this.wdInd == rhs.wdInd)||((this.wdInd!= null)&&this.wdInd.equals(rhs.wdInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effHeadcount == rhs.effHeadcount)||((this.effHeadcount!= null)&&this.effHeadcount.equals(rhs.effHeadcount))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
