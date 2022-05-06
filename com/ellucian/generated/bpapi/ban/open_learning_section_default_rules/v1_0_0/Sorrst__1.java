
package com.ellucian.generated.bpapi.ban.open_learning_section_default_rules.v1_0_0;

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
    "rstsEnterableInd",
    "usageCutoffPctFrom",
    "rstsExtensionInd",
    "rstsWithdrawInd",
    "rstsInclSectEnrl",
    "usageCutoffPctTo",
    "userId",
    "rstsWebInd",
    "rstsSbPrintInd",
    "activityDate",
    "rstsCode",
    "rstsVoiceType",
    "effByStuStatInd",
    "rstsDescription"
})
@Generated("jsonschema2pojo")
public class Sorrst__1 {

    @JsonProperty("rstsEnterableInd")
    private String rstsEnterableInd;
    /**
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("usageCutoffPctFrom")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM")
    private Double usageCutoffPctFrom;
    @JsonProperty("rstsExtensionInd")
    private String rstsExtensionInd;
    @JsonProperty("rstsWithdrawInd")
    private String rstsWithdrawInd;
    @JsonProperty("rstsInclSectEnrl")
    private String rstsInclSectEnrl;
    /**
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("usageCutoffPctTo")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO")
    private Double usageCutoffPctTo;
    /**
     * Lineage reference object : SORRSTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_USER_ID")
    private String userId;
    @JsonProperty("rstsWebInd")
    private String rstsWebInd;
    @JsonProperty("rstsSbPrintInd")
    private String rstsSbPrintInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Status Code
     * <p>
     * Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts")
    private String rstsCode;
    /**
     * Voice Response
     * <p>
     * 
     * 
     */
    @JsonProperty("rstsVoiceType")
    private String rstsVoiceType;
    /**
     * Lineage reference object : SORRSTS_EFF_BY_STU_STAT_IND
     * 
     */
    @JsonProperty("effByStuStatInd")
    @JsonPropertyDescription("Lineage reference object : SORRSTS_EFF_BY_STU_STAT_IND")
    private String effByStuStatInd;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("rstsDescription")
    private String rstsDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rstsEnterableInd")
    public String getRstsEnterableInd() {
        return rstsEnterableInd;
    }

    @JsonProperty("rstsEnterableInd")
    public void setRstsEnterableInd(String rstsEnterableInd) {
        this.rstsEnterableInd = rstsEnterableInd;
    }

    public Sorrst__1 withRstsEnterableInd(String rstsEnterableInd) {
        this.rstsEnterableInd = rstsEnterableInd;
        return this;
    }

    /**
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("usageCutoffPctFrom")
    public Double getUsageCutoffPctFrom() {
        return usageCutoffPctFrom;
    }

    /**
     * Usage Cutoff From
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_FROM
     * 
     */
    @JsonProperty("usageCutoffPctFrom")
    public void setUsageCutoffPctFrom(Double usageCutoffPctFrom) {
        this.usageCutoffPctFrom = usageCutoffPctFrom;
    }

    public Sorrst__1 withUsageCutoffPctFrom(Double usageCutoffPctFrom) {
        this.usageCutoffPctFrom = usageCutoffPctFrom;
        return this;
    }

    @JsonProperty("rstsExtensionInd")
    public String getRstsExtensionInd() {
        return rstsExtensionInd;
    }

    @JsonProperty("rstsExtensionInd")
    public void setRstsExtensionInd(String rstsExtensionInd) {
        this.rstsExtensionInd = rstsExtensionInd;
    }

    public Sorrst__1 withRstsExtensionInd(String rstsExtensionInd) {
        this.rstsExtensionInd = rstsExtensionInd;
        return this;
    }

    @JsonProperty("rstsWithdrawInd")
    public String getRstsWithdrawInd() {
        return rstsWithdrawInd;
    }

    @JsonProperty("rstsWithdrawInd")
    public void setRstsWithdrawInd(String rstsWithdrawInd) {
        this.rstsWithdrawInd = rstsWithdrawInd;
    }

    public Sorrst__1 withRstsWithdrawInd(String rstsWithdrawInd) {
        this.rstsWithdrawInd = rstsWithdrawInd;
        return this;
    }

    @JsonProperty("rstsInclSectEnrl")
    public String getRstsInclSectEnrl() {
        return rstsInclSectEnrl;
    }

    @JsonProperty("rstsInclSectEnrl")
    public void setRstsInclSectEnrl(String rstsInclSectEnrl) {
        this.rstsInclSectEnrl = rstsInclSectEnrl;
    }

    public Sorrst__1 withRstsInclSectEnrl(String rstsInclSectEnrl) {
        this.rstsInclSectEnrl = rstsInclSectEnrl;
        return this;
    }

    /**
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("usageCutoffPctTo")
    public Double getUsageCutoffPctTo() {
        return usageCutoffPctTo;
    }

    /**
     * Usage Cutoff To
     * <p>
     * Lineage reference object : SORRSTS_USAGE_CUTOFF_PCT_TO
     * 
     */
    @JsonProperty("usageCutoffPctTo")
    public void setUsageCutoffPctTo(Double usageCutoffPctTo) {
        this.usageCutoffPctTo = usageCutoffPctTo;
    }

    public Sorrst__1 withUsageCutoffPctTo(Double usageCutoffPctTo) {
        this.usageCutoffPctTo = usageCutoffPctTo;
        return this;
    }

    /**
     * Lineage reference object : SORRSTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORRSTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorrst__1 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("rstsWebInd")
    public String getRstsWebInd() {
        return rstsWebInd;
    }

    @JsonProperty("rstsWebInd")
    public void setRstsWebInd(String rstsWebInd) {
        this.rstsWebInd = rstsWebInd;
    }

    public Sorrst__1 withRstsWebInd(String rstsWebInd) {
        this.rstsWebInd = rstsWebInd;
        return this;
    }

    @JsonProperty("rstsSbPrintInd")
    public String getRstsSbPrintInd() {
        return rstsSbPrintInd;
    }

    @JsonProperty("rstsSbPrintInd")
    public void setRstsSbPrintInd(String rstsSbPrintInd) {
        this.rstsSbPrintInd = rstsSbPrintInd;
    }

    public Sorrst__1 withRstsSbPrintInd(String rstsSbPrintInd) {
        this.rstsSbPrintInd = rstsSbPrintInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRSTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorrst__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public String getRstsCode() {
        return rstsCode;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : SORRSTS_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public void setRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
    }

    public Sorrst__1 withRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
        return this;
    }

    /**
     * Voice Response
     * <p>
     * 
     * 
     */
    @JsonProperty("rstsVoiceType")
    public String getRstsVoiceType() {
        return rstsVoiceType;
    }

    /**
     * Voice Response
     * <p>
     * 
     * 
     */
    @JsonProperty("rstsVoiceType")
    public void setRstsVoiceType(String rstsVoiceType) {
        this.rstsVoiceType = rstsVoiceType;
    }

    public Sorrst__1 withRstsVoiceType(String rstsVoiceType) {
        this.rstsVoiceType = rstsVoiceType;
        return this;
    }

    /**
     * Lineage reference object : SORRSTS_EFF_BY_STU_STAT_IND
     * 
     */
    @JsonProperty("effByStuStatInd")
    public String getEffByStuStatInd() {
        return effByStuStatInd;
    }

    /**
     * Lineage reference object : SORRSTS_EFF_BY_STU_STAT_IND
     * 
     */
    @JsonProperty("effByStuStatInd")
    public void setEffByStuStatInd(String effByStuStatInd) {
        this.effByStuStatInd = effByStuStatInd;
    }

    public Sorrst__1 withEffByStuStatInd(String effByStuStatInd) {
        this.effByStuStatInd = effByStuStatInd;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("rstsDescription")
    public String getRstsDescription() {
        return rstsDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("rstsDescription")
    public void setRstsDescription(String rstsDescription) {
        this.rstsDescription = rstsDescription;
    }

    public Sorrst__1 withRstsDescription(String rstsDescription) {
        this.rstsDescription = rstsDescription;
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

    public Sorrst__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorrst__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rstsEnterableInd");
        sb.append('=');
        sb.append(((this.rstsEnterableInd == null)?"<null>":this.rstsEnterableInd));
        sb.append(',');
        sb.append("usageCutoffPctFrom");
        sb.append('=');
        sb.append(((this.usageCutoffPctFrom == null)?"<null>":this.usageCutoffPctFrom));
        sb.append(',');
        sb.append("rstsExtensionInd");
        sb.append('=');
        sb.append(((this.rstsExtensionInd == null)?"<null>":this.rstsExtensionInd));
        sb.append(',');
        sb.append("rstsWithdrawInd");
        sb.append('=');
        sb.append(((this.rstsWithdrawInd == null)?"<null>":this.rstsWithdrawInd));
        sb.append(',');
        sb.append("rstsInclSectEnrl");
        sb.append('=');
        sb.append(((this.rstsInclSectEnrl == null)?"<null>":this.rstsInclSectEnrl));
        sb.append(',');
        sb.append("usageCutoffPctTo");
        sb.append('=');
        sb.append(((this.usageCutoffPctTo == null)?"<null>":this.usageCutoffPctTo));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("rstsWebInd");
        sb.append('=');
        sb.append(((this.rstsWebInd == null)?"<null>":this.rstsWebInd));
        sb.append(',');
        sb.append("rstsSbPrintInd");
        sb.append('=');
        sb.append(((this.rstsSbPrintInd == null)?"<null>":this.rstsSbPrintInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("rstsCode");
        sb.append('=');
        sb.append(((this.rstsCode == null)?"<null>":this.rstsCode));
        sb.append(',');
        sb.append("rstsVoiceType");
        sb.append('=');
        sb.append(((this.rstsVoiceType == null)?"<null>":this.rstsVoiceType));
        sb.append(',');
        sb.append("effByStuStatInd");
        sb.append('=');
        sb.append(((this.effByStuStatInd == null)?"<null>":this.effByStuStatInd));
        sb.append(',');
        sb.append("rstsDescription");
        sb.append('=');
        sb.append(((this.rstsDescription == null)?"<null>":this.rstsDescription));
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
        result = ((result* 31)+((this.rstsEnterableInd == null)? 0 :this.rstsEnterableInd.hashCode()));
        result = ((result* 31)+((this.usageCutoffPctFrom == null)? 0 :this.usageCutoffPctFrom.hashCode()));
        result = ((result* 31)+((this.rstsExtensionInd == null)? 0 :this.rstsExtensionInd.hashCode()));
        result = ((result* 31)+((this.rstsWithdrawInd == null)? 0 :this.rstsWithdrawInd.hashCode()));
        result = ((result* 31)+((this.rstsInclSectEnrl == null)? 0 :this.rstsInclSectEnrl.hashCode()));
        result = ((result* 31)+((this.usageCutoffPctTo == null)? 0 :this.usageCutoffPctTo.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.rstsWebInd == null)? 0 :this.rstsWebInd.hashCode()));
        result = ((result* 31)+((this.rstsSbPrintInd == null)? 0 :this.rstsSbPrintInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.rstsCode == null)? 0 :this.rstsCode.hashCode()));
        result = ((result* 31)+((this.rstsVoiceType == null)? 0 :this.rstsVoiceType.hashCode()));
        result = ((result* 31)+((this.effByStuStatInd == null)? 0 :this.effByStuStatInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rstsDescription == null)? 0 :this.rstsDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorrst__1) == false) {
            return false;
        }
        Sorrst__1 rhs = ((Sorrst__1) other);
        return ((((((((((((((((this.rstsEnterableInd == rhs.rstsEnterableInd)||((this.rstsEnterableInd!= null)&&this.rstsEnterableInd.equals(rhs.rstsEnterableInd)))&&((this.usageCutoffPctFrom == rhs.usageCutoffPctFrom)||((this.usageCutoffPctFrom!= null)&&this.usageCutoffPctFrom.equals(rhs.usageCutoffPctFrom))))&&((this.rstsExtensionInd == rhs.rstsExtensionInd)||((this.rstsExtensionInd!= null)&&this.rstsExtensionInd.equals(rhs.rstsExtensionInd))))&&((this.rstsWithdrawInd == rhs.rstsWithdrawInd)||((this.rstsWithdrawInd!= null)&&this.rstsWithdrawInd.equals(rhs.rstsWithdrawInd))))&&((this.rstsInclSectEnrl == rhs.rstsInclSectEnrl)||((this.rstsInclSectEnrl!= null)&&this.rstsInclSectEnrl.equals(rhs.rstsInclSectEnrl))))&&((this.usageCutoffPctTo == rhs.usageCutoffPctTo)||((this.usageCutoffPctTo!= null)&&this.usageCutoffPctTo.equals(rhs.usageCutoffPctTo))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.rstsWebInd == rhs.rstsWebInd)||((this.rstsWebInd!= null)&&this.rstsWebInd.equals(rhs.rstsWebInd))))&&((this.rstsSbPrintInd == rhs.rstsSbPrintInd)||((this.rstsSbPrintInd!= null)&&this.rstsSbPrintInd.equals(rhs.rstsSbPrintInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.rstsCode == rhs.rstsCode)||((this.rstsCode!= null)&&this.rstsCode.equals(rhs.rstsCode))))&&((this.rstsVoiceType == rhs.rstsVoiceType)||((this.rstsVoiceType!= null)&&this.rstsVoiceType.equals(rhs.rstsVoiceType))))&&((this.effByStuStatInd == rhs.effByStuStatInd)||((this.effByStuStatInd!= null)&&this.effByStuStatInd.equals(rhs.effByStuStatInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rstsDescription == rhs.rstsDescription)||((this.rstsDescription!= null)&&this.rstsDescription.equals(rhs.rstsDescription))));
    }

}
