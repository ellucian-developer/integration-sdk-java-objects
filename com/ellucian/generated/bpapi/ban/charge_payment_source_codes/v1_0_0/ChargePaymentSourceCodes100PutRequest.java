
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
    "criteria.code",
    "autoCloseInd",
    "criteria.autoCloseInd",
    "criteria.activityDate",
    "code",
    "criteria.inputInd",
    "criteria.sysreqInd",
    "inputInd",
    "criteria.desc",
    "desc"
})
@Generated("jsonschema2pojo")
public class ChargePaymentSourceCodes100PutRequest {

    /**
     * Source
     * <p>
     * Lineage reference object : TTVSRCE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_CODE")
    private String criteriaCode;
    /**
     * Cashier Auto Close
     * <p>
     * Lineage reference object : TTVSRCE_AUTO_CLOSE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoCloseInd")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_AUTO_CLOSE_IND")
    private String autoCloseInd;
    /**
     * Cashier Auto Close
     * <p>
     * Lineage reference object : TTVSRCE_AUTO_CLOSE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.autoCloseInd")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_AUTO_CLOSE_IND")
    private String criteriaAutoCloseInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVSRCE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Source
     * <p>
     * Lineage reference object : TTVSRCE_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_CODE")
    private String code;
    /**
     * Lineage reference object : TTVSRCE_INPUT_IND
     * 
     */
    @JsonProperty("criteria.inputInd")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_INPUT_IND")
    private String criteriaInputInd;
    /**
     * Lineage reference object : TTVSRCE_SYSREQ_IND
     * 
     */
    @JsonProperty("criteria.sysreqInd")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_SYSREQ_IND")
    private String criteriaSysreqInd;
    /**
     * Lineage reference object : TTVSRCE_INPUT_IND
     * 
     */
    @JsonProperty("inputInd")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_INPUT_IND")
    private String inputInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVSRCE_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_DESC")
    private String criteriaDesc;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVSRCE_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TTVSRCE_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Source
     * <p>
     * Lineage reference object : TTVSRCE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TTVSRCE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public ChargePaymentSourceCodes100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Cashier Auto Close
     * <p>
     * Lineage reference object : TTVSRCE_AUTO_CLOSE_IND
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("autoCloseInd")
    public void setAutoCloseInd(String autoCloseInd) {
        this.autoCloseInd = autoCloseInd;
    }

    public ChargePaymentSourceCodes100PutRequest withAutoCloseInd(String autoCloseInd) {
        this.autoCloseInd = autoCloseInd;
        return this;
    }

    /**
     * Cashier Auto Close
     * <p>
     * Lineage reference object : TTVSRCE_AUTO_CLOSE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.autoCloseInd")
    public String getCriteriaAutoCloseInd() {
        return criteriaAutoCloseInd;
    }

    /**
     * Cashier Auto Close
     * <p>
     * Lineage reference object : TTVSRCE_AUTO_CLOSE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.autoCloseInd")
    public void setCriteriaAutoCloseInd(String criteriaAutoCloseInd) {
        this.criteriaAutoCloseInd = criteriaAutoCloseInd;
    }

    public ChargePaymentSourceCodes100PutRequest withCriteriaAutoCloseInd(String criteriaAutoCloseInd) {
        this.criteriaAutoCloseInd = criteriaAutoCloseInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVSRCE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVSRCE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public ChargePaymentSourceCodes100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TTVSRCE_CODE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ChargePaymentSourceCodes100PutRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : TTVSRCE_INPUT_IND
     * 
     */
    @JsonProperty("criteria.inputInd")
    public String getCriteriaInputInd() {
        return criteriaInputInd;
    }

    /**
     * Lineage reference object : TTVSRCE_INPUT_IND
     * 
     */
    @JsonProperty("criteria.inputInd")
    public void setCriteriaInputInd(String criteriaInputInd) {
        this.criteriaInputInd = criteriaInputInd;
    }

    public ChargePaymentSourceCodes100PutRequest withCriteriaInputInd(String criteriaInputInd) {
        this.criteriaInputInd = criteriaInputInd;
        return this;
    }

    /**
     * Lineage reference object : TTVSRCE_SYSREQ_IND
     * 
     */
    @JsonProperty("criteria.sysreqInd")
    public String getCriteriaSysreqInd() {
        return criteriaSysreqInd;
    }

    /**
     * Lineage reference object : TTVSRCE_SYSREQ_IND
     * 
     */
    @JsonProperty("criteria.sysreqInd")
    public void setCriteriaSysreqInd(String criteriaSysreqInd) {
        this.criteriaSysreqInd = criteriaSysreqInd;
    }

    public ChargePaymentSourceCodes100PutRequest withCriteriaSysreqInd(String criteriaSysreqInd) {
        this.criteriaSysreqInd = criteriaSysreqInd;
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

    public ChargePaymentSourceCodes100PutRequest withInputInd(String inputInd) {
        this.inputInd = inputInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVSRCE_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVSRCE_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public ChargePaymentSourceCodes100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVSRCE_DESC
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
     * Lineage reference object : TTVSRCE_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ChargePaymentSourceCodes100PutRequest withDesc(String desc) {
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

    public ChargePaymentSourceCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChargePaymentSourceCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("autoCloseInd");
        sb.append('=');
        sb.append(((this.autoCloseInd == null)?"<null>":this.autoCloseInd));
        sb.append(',');
        sb.append("criteriaAutoCloseInd");
        sb.append('=');
        sb.append(((this.criteriaAutoCloseInd == null)?"<null>":this.criteriaAutoCloseInd));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("criteriaInputInd");
        sb.append('=');
        sb.append(((this.criteriaInputInd == null)?"<null>":this.criteriaInputInd));
        sb.append(',');
        sb.append("criteriaSysreqInd");
        sb.append('=');
        sb.append(((this.criteriaSysreqInd == null)?"<null>":this.criteriaSysreqInd));
        sb.append(',');
        sb.append("inputInd");
        sb.append('=');
        sb.append(((this.inputInd == null)?"<null>":this.inputInd));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
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
        result = ((result* 31)+((this.autoCloseInd == null)? 0 :this.autoCloseInd.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.criteriaAutoCloseInd == null)? 0 :this.criteriaAutoCloseInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.criteriaSysreqInd == null)? 0 :this.criteriaSysreqInd.hashCode()));
        result = ((result* 31)+((this.inputInd == null)? 0 :this.inputInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaInputInd == null)? 0 :this.criteriaInputInd.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChargePaymentSourceCodes100PutRequest) == false) {
            return false;
        }
        ChargePaymentSourceCodes100PutRequest rhs = ((ChargePaymentSourceCodes100PutRequest) other);
        return ((((((((((((this.autoCloseInd == rhs.autoCloseInd)||((this.autoCloseInd!= null)&&this.autoCloseInd.equals(rhs.autoCloseInd)))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.criteriaAutoCloseInd == rhs.criteriaAutoCloseInd)||((this.criteriaAutoCloseInd!= null)&&this.criteriaAutoCloseInd.equals(rhs.criteriaAutoCloseInd))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.criteriaSysreqInd == rhs.criteriaSysreqInd)||((this.criteriaSysreqInd!= null)&&this.criteriaSysreqInd.equals(rhs.criteriaSysreqInd))))&&((this.inputInd == rhs.inputInd)||((this.inputInd!= null)&&this.inputInd.equals(rhs.inputInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaInputInd == rhs.criteriaInputInd)||((this.criteriaInputInd!= null)&&this.criteriaInputInd.equals(rhs.criteriaInputInd))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
