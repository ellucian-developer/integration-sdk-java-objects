
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
    "tuitionRefundPct",
    "activityDate",
    "extensionRefundPct",
    "feeRefundPct",
    "refundPctComplete",
    "overrideInd"
})
@Generated("jsonschema2pojo")
public class Sorrfnd__2 {

    /**
     * Tuition Refund
     * <p>
     * Lineage reference object : SORRFND_TUITION_REFUND_PCT
     * 
     */
    @JsonProperty("tuitionRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_TUITION_REFUND_PCT")
    private Double tuitionRefundPct;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRFND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORRFND_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Extension Refund
     * <p>
     * Lineage reference object : SORRFND_EXTENSION_REFUND_PCT
     * 
     */
    @JsonProperty("extensionRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_EXTENSION_REFUND_PCT")
    private Double extensionRefundPct;
    /**
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("feeRefundPct")
    @JsonPropertyDescription("Lineage reference object : SORRFND_FEE_REFUND_PCT")
    private Double feeRefundPct;
    /**
     * Percent Complete
     * <p>
     * Lineage reference object : SORRFND_REFUND_PCT_COMPLETE
     * (Required)
     * 
     */
    @JsonProperty("refundPctComplete")
    @JsonPropertyDescription("Lineage reference object : SORRFND_REFUND_PCT_COMPLETE")
    private Double refundPctComplete;
    /**
     * Lineage reference object : SORRFND_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    @JsonPropertyDescription("Lineage reference object : SORRFND_OVERRIDE_IND")
    private String overrideInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Tuition Refund
     * <p>
     * Lineage reference object : SORRFND_TUITION_REFUND_PCT
     * 
     */
    @JsonProperty("tuitionRefundPct")
    public Double getTuitionRefundPct() {
        return tuitionRefundPct;
    }

    /**
     * Tuition Refund
     * <p>
     * Lineage reference object : SORRFND_TUITION_REFUND_PCT
     * 
     */
    @JsonProperty("tuitionRefundPct")
    public void setTuitionRefundPct(Double tuitionRefundPct) {
        this.tuitionRefundPct = tuitionRefundPct;
    }

    public Sorrfnd__2 withTuitionRefundPct(Double tuitionRefundPct) {
        this.tuitionRefundPct = tuitionRefundPct;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRFND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORRFND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorrfnd__2 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Extension Refund
     * <p>
     * Lineage reference object : SORRFND_EXTENSION_REFUND_PCT
     * 
     */
    @JsonProperty("extensionRefundPct")
    public Double getExtensionRefundPct() {
        return extensionRefundPct;
    }

    /**
     * Extension Refund
     * <p>
     * Lineage reference object : SORRFND_EXTENSION_REFUND_PCT
     * 
     */
    @JsonProperty("extensionRefundPct")
    public void setExtensionRefundPct(Double extensionRefundPct) {
        this.extensionRefundPct = extensionRefundPct;
    }

    public Sorrfnd__2 withExtensionRefundPct(Double extensionRefundPct) {
        this.extensionRefundPct = extensionRefundPct;
        return this;
    }

    /**
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("feeRefundPct")
    public Double getFeeRefundPct() {
        return feeRefundPct;
    }

    /**
     * Fee Refund
     * <p>
     * Lineage reference object : SORRFND_FEE_REFUND_PCT
     * 
     */
    @JsonProperty("feeRefundPct")
    public void setFeeRefundPct(Double feeRefundPct) {
        this.feeRefundPct = feeRefundPct;
    }

    public Sorrfnd__2 withFeeRefundPct(Double feeRefundPct) {
        this.feeRefundPct = feeRefundPct;
        return this;
    }

    /**
     * Percent Complete
     * <p>
     * Lineage reference object : SORRFND_REFUND_PCT_COMPLETE
     * (Required)
     * 
     */
    @JsonProperty("refundPctComplete")
    public Double getRefundPctComplete() {
        return refundPctComplete;
    }

    /**
     * Percent Complete
     * <p>
     * Lineage reference object : SORRFND_REFUND_PCT_COMPLETE
     * (Required)
     * 
     */
    @JsonProperty("refundPctComplete")
    public void setRefundPctComplete(Double refundPctComplete) {
        this.refundPctComplete = refundPctComplete;
    }

    public Sorrfnd__2 withRefundPctComplete(Double refundPctComplete) {
        this.refundPctComplete = refundPctComplete;
        return this;
    }

    /**
     * Lineage reference object : SORRFND_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public String getOverrideInd() {
        return overrideInd;
    }

    /**
     * Lineage reference object : SORRFND_OVERRIDE_IND
     * 
     */
    @JsonProperty("overrideInd")
    public void setOverrideInd(String overrideInd) {
        this.overrideInd = overrideInd;
    }

    public Sorrfnd__2 withOverrideInd(String overrideInd) {
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

    public Sorrfnd__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorrfnd__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tuitionRefundPct");
        sb.append('=');
        sb.append(((this.tuitionRefundPct == null)?"<null>":this.tuitionRefundPct));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("extensionRefundPct");
        sb.append('=');
        sb.append(((this.extensionRefundPct == null)?"<null>":this.extensionRefundPct));
        sb.append(',');
        sb.append("feeRefundPct");
        sb.append('=');
        sb.append(((this.feeRefundPct == null)?"<null>":this.feeRefundPct));
        sb.append(',');
        sb.append("refundPctComplete");
        sb.append('=');
        sb.append(((this.refundPctComplete == null)?"<null>":this.refundPctComplete));
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
        result = ((result* 31)+((this.tuitionRefundPct == null)? 0 :this.tuitionRefundPct.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.extensionRefundPct == null)? 0 :this.extensionRefundPct.hashCode()));
        result = ((result* 31)+((this.feeRefundPct == null)? 0 :this.feeRefundPct.hashCode()));
        result = ((result* 31)+((this.refundPctComplete == null)? 0 :this.refundPctComplete.hashCode()));
        result = ((result* 31)+((this.overrideInd == null)? 0 :this.overrideInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorrfnd__2) == false) {
            return false;
        }
        Sorrfnd__2 rhs = ((Sorrfnd__2) other);
        return ((((((((this.tuitionRefundPct == rhs.tuitionRefundPct)||((this.tuitionRefundPct!= null)&&this.tuitionRefundPct.equals(rhs.tuitionRefundPct)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.extensionRefundPct == rhs.extensionRefundPct)||((this.extensionRefundPct!= null)&&this.extensionRefundPct.equals(rhs.extensionRefundPct))))&&((this.feeRefundPct == rhs.feeRefundPct)||((this.feeRefundPct!= null)&&this.feeRefundPct.equals(rhs.feeRefundPct))))&&((this.refundPctComplete == rhs.refundPctComplete)||((this.refundPctComplete!= null)&&this.refundPctComplete.equals(rhs.refundPctComplete))))&&((this.overrideInd == rhs.overrideInd)||((this.overrideInd!= null)&&this.overrideInd.equals(rhs.overrideInd))));
    }

}
