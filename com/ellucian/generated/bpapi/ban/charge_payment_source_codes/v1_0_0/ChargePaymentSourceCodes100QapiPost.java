
package com.ellucian.generated.bpapi.ban.charge_payment_source_codes.v1_0_0;

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
    "autoCloseInd",
    "code",
    "desc",
    "inputInd",
    "sysreqInd"
})
@Generated("jsonschema2pojo")
public class ChargePaymentSourceCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVSRCE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Cashier Auto Close
     * <p>
     * Lineage reference object : TTVSRCE_AUTO_CLOSE_IND
     * 
     */
    @JsonProperty("autoCloseInd")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_AUTO_CLOSE_IND")
    private String autoCloseInd;
    /**
     * Source
     * <p>
     * Lineage reference object : TTVSRCE_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVSRCE_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_DESC")
    private String desc;
    /**
     * Lineage reference object : TTVSRCE_INPUT_IND
     * 
     */
    @JsonProperty("inputInd")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_INPUT_IND")
    private String inputInd;
    /**
     * Lineage reference object : TTVSRCE_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_SYSREQ_IND")
    private String sysreqInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVSRCE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVSRCE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ChargePaymentSourceCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Cashier Auto Close
     * <p>
     * Lineage reference object : TTVSRCE_AUTO_CLOSE_IND
     * 
     */
    @JsonProperty("autoCloseInd")
    public String getAutoCloseInd() {
        return autoCloseInd;
    }

    /**
     * Cashier Auto Close
     * <p>
     * Lineage reference object : TTVSRCE_AUTO_CLOSE_IND
     * 
     */
    @JsonProperty("autoCloseInd")
    public void setAutoCloseInd(String autoCloseInd) {
        this.autoCloseInd = autoCloseInd;
    }

    public ChargePaymentSourceCodes100QapiPost withAutoCloseInd(String autoCloseInd) {
        this.autoCloseInd = autoCloseInd;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TTVSRCE_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TTVSRCE_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ChargePaymentSourceCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVSRCE_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVSRCE_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ChargePaymentSourceCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : TTVSRCE_INPUT_IND
     * 
     */
    @JsonProperty("inputInd")
    public String getInputInd() {
        return inputInd;
    }

    /**
     * Lineage reference object : TTVSRCE_INPUT_IND
     * 
     */
    @JsonProperty("inputInd")
    public void setInputInd(String inputInd) {
        this.inputInd = inputInd;
    }

    public ChargePaymentSourceCodes100QapiPost withInputInd(String inputInd) {
        this.inputInd = inputInd;
        return this;
    }

    /**
     * Lineage reference object : TTVSRCE_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public String getSysreqInd() {
        return sysreqInd;
    }

    /**
     * Lineage reference object : TTVSRCE_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public void setSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
    }

    public ChargePaymentSourceCodes100QapiPost withSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
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

    public ChargePaymentSourceCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChargePaymentSourceCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("autoCloseInd");
        sb.append('=');
        sb.append(((this.autoCloseInd == null)?"<null>":this.autoCloseInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("inputInd");
        sb.append('=');
        sb.append(((this.inputInd == null)?"<null>":this.inputInd));
        sb.append(',');
        sb.append("sysreqInd");
        sb.append('=');
        sb.append(((this.sysreqInd == null)?"<null>":this.sysreqInd));
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
        result = ((result* 31)+((this.autoCloseInd == null)? 0 :this.autoCloseInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.sysreqInd == null)? 0 :this.sysreqInd.hashCode()));
        result = ((result* 31)+((this.inputInd == null)? 0 :this.inputInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChargePaymentSourceCodes100QapiPost) == false) {
            return false;
        }
        ChargePaymentSourceCodes100QapiPost rhs = ((ChargePaymentSourceCodes100QapiPost) other);
        return ((((((((this.autoCloseInd == rhs.autoCloseInd)||((this.autoCloseInd!= null)&&this.autoCloseInd.equals(rhs.autoCloseInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.sysreqInd == rhs.sysreqInd)||((this.sysreqInd!= null)&&this.sysreqInd.equals(rhs.sysreqInd))))&&((this.inputInd == rhs.inputInd)||((this.inputInd!= null)&&this.inputInd.equals(rhs.inputInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
