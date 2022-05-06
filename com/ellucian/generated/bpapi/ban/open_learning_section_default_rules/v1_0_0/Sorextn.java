
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
    "activityDate",
    "extensionFeeAmt",
    "detlCode",
    "extensionPct",
    "ftypCode",
    "userId",
    "overrideInd"
})
@Generated("jsonschema2pojo")
public class Sorextn {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOREXTN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOREXTN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Amount
     * <p>
     * Lineage reference object : SOREXTN_EXTENSION_FEE_AMT
     * (Required)
     * 
     */
    @JsonProperty("extensionFeeAmt")
    @JsonPropertyDescription("Lineage reference object : SOREXTN_EXTENSION_FEE_AMT")
    private Double extensionFeeAmt;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : SOREXTN_DETL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detlCode")
    @JsonPropertyDescription("Lineage reference object : SOREXTN_DETL_CODE")
    private String detlCode;
    /**
     * Extension Percent
     * <p>
     * Lineage reference object : SOREXTN_EXTENSION_PCT
     * (Required)
     * 
     */
    @JsonProperty("extensionPct")
    @JsonPropertyDescription("Lineage reference object : SOREXTN_EXTENSION_PCT")
    private Double extensionPct;
    /**
     * Fee Type
     * <p>
     * Lineage reference object : SOREXTN_FTYP_CODE, Lookup lineage reference object : stvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    @JsonPropertyDescription("Lineage reference object : SOREXTN_FTYP_CODE, Lookup lineage reference object : stvftyp")
    private String ftypCode;
    /**
     * Lineage reference object : SOREXTN_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOREXTN_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SOREXTN_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    @JsonPropertyDescription("Lineage reference object : SOREXTN_OVERRIDE_IND")
    private String overrideInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOREXTN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SOREXTN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorextn withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SOREXTN_EXTENSION_FEE_AMT
     * (Required)
     * 
     */
    @JsonProperty("extensionFeeAmt")
    public Double getExtensionFeeAmt() {
        return extensionFeeAmt;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : SOREXTN_EXTENSION_FEE_AMT
     * (Required)
     * 
     */
    @JsonProperty("extensionFeeAmt")
    public void setExtensionFeeAmt(Double extensionFeeAmt) {
        this.extensionFeeAmt = extensionFeeAmt;
    }

    public Sorextn withExtensionFeeAmt(Double extensionFeeAmt) {
        this.extensionFeeAmt = extensionFeeAmt;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SOREXTN_DETL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detlCode")
    public String getDetlCode() {
        return detlCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : SOREXTN_DETL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detlCode")
    public void setDetlCode(String detlCode) {
        this.detlCode = detlCode;
    }

    public Sorextn withDetlCode(String detlCode) {
        this.detlCode = detlCode;
        return this;
    }

    /**
     * Extension Percent
     * <p>
     * Lineage reference object : SOREXTN_EXTENSION_PCT
     * (Required)
     * 
     */
    @JsonProperty("extensionPct")
    public Double getExtensionPct() {
        return extensionPct;
    }

    /**
     * Extension Percent
     * <p>
     * Lineage reference object : SOREXTN_EXTENSION_PCT
     * (Required)
     * 
     */
    @JsonProperty("extensionPct")
    public void setExtensionPct(Double extensionPct) {
        this.extensionPct = extensionPct;
    }

    public Sorextn withExtensionPct(Double extensionPct) {
        this.extensionPct = extensionPct;
        return this;
    }

    /**
     * Fee Type
     * <p>
     * Lineage reference object : SOREXTN_FTYP_CODE, Lookup lineage reference object : stvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public String getFtypCode() {
        return ftypCode;
    }

    /**
     * Fee Type
     * <p>
     * Lineage reference object : SOREXTN_FTYP_CODE, Lookup lineage reference object : stvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public void setFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
    }

    public Sorextn withFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
        return this;
    }

    /**
     * Lineage reference object : SOREXTN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOREXTN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorextn withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SOREXTN_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public String getOverrideInd() {
        return overrideInd;
    }

    /**
     * Lineage reference object : SOREXTN_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public void setOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
    }

    public Sorextn withOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
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

    public Sorextn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorextn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("extensionFeeAmt");
        sb.append('=');
        sb.append(((this.extensionFeeAmt == null)?"<null>":this.extensionFeeAmt));
        sb.append(',');
        sb.append("detlCode");
        sb.append('=');
        sb.append(((this.detlCode == null)?"<null>":this.detlCode));
        sb.append(',');
        sb.append("extensionPct");
        sb.append('=');
        sb.append(((this.extensionPct == null)?"<null>":this.extensionPct));
        sb.append(',');
        sb.append("ftypCode");
        sb.append('=');
        sb.append(((this.ftypCode == null)?"<null>":this.ftypCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("overrideInd");
        sb.append('=');
        sb.append(((this.overrideInd == null)?"<null>":this.overrideInd));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.extensionFeeAmt == null)? 0 :this.extensionFeeAmt.hashCode()));
        result = ((result* 31)+((this.detlCode == null)? 0 :this.detlCode.hashCode()));
        result = ((result* 31)+((this.extensionPct == null)? 0 :this.extensionPct.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftypCode == null)? 0 :this.ftypCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.overrideInd == null)? 0 :this.overrideInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorextn) == false) {
            return false;
        }
        Sorextn rhs = ((Sorextn) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.extensionFeeAmt == rhs.extensionFeeAmt)||((this.extensionFeeAmt!= null)&&this.extensionFeeAmt.equals(rhs.extensionFeeAmt))))&&((this.detlCode == rhs.detlCode)||((this.detlCode!= null)&&this.detlCode.equals(rhs.detlCode))))&&((this.extensionPct == rhs.extensionPct)||((this.extensionPct!= null)&&this.extensionPct.equals(rhs.extensionPct))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftypCode == rhs.ftypCode)||((this.ftypCode!= null)&&this.ftypCode.equals(rhs.ftypCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.overrideInd == rhs.overrideInd)||((this.overrideInd!= null)&&this.overrideInd.equals(rhs.overrideInd))));
    }

}
