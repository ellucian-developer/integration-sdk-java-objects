
package com.ellucian.generated.bpapi.ban.payment_type_codes.v1_0_0;

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
    "criteria.activityDate",
    "systemReqInd",
    "criteria.systemReqInd",
    "criteria.desc",
    "desc"
})
@Generated("jsonschema2pojo")
public class PaymentTypeCodes100PutRequest {

    /**
     * Lineage reference object : TTVPAYT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : TTVPAYT_CODE")
    private String criteriaCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVPAYT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVPAYT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : TTVPAYT_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : TTVPAYT_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Lineage reference object : TTVPAYT_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("criteria.systemReqInd")
    @JsonPropertyDescription("Lineage reference object : TTVPAYT_SYSTEM_REQ_IND")
    private String criteriaSystemReqInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVPAYT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TTVPAYT_DESC")
    private String criteriaDesc;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVPAYT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TTVPAYT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : TTVPAYT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Lineage reference object : TTVPAYT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public PaymentTypeCodes100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVPAYT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVPAYT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public PaymentTypeCodes100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Lineage reference object : TTVPAYT_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : TTVPAYT_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public PaymentTypeCodes100PutRequest withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Lineage reference object : TTVPAYT_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("criteria.systemReqInd")
    public String getCriteriaSystemReqInd() {
        return criteriaSystemReqInd;
    }

    /**
     * Lineage reference object : TTVPAYT_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("criteria.systemReqInd")
    public void setCriteriaSystemReqInd(String criteriaSystemReqInd) {
        this.criteriaSystemReqInd = criteriaSystemReqInd;
    }

    public PaymentTypeCodes100PutRequest withCriteriaSystemReqInd(String criteriaSystemReqInd) {
        this.criteriaSystemReqInd = criteriaSystemReqInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVPAYT_DESC
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
     * Lineage reference object : TTVPAYT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public PaymentTypeCodes100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVPAYT_DESC
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
     * Lineage reference object : TTVPAYT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PaymentTypeCodes100PutRequest withDesc(String desc) {
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

    public PaymentTypeCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentTypeCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("criteriaSystemReqInd");
        sb.append('=');
        sb.append(((this.criteriaSystemReqInd == null)?"<null>":this.criteriaSystemReqInd));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSystemReqInd == null)? 0 :this.criteriaSystemReqInd.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentTypeCodes100PutRequest) == false) {
            return false;
        }
        PaymentTypeCodes100PutRequest rhs = ((PaymentTypeCodes100PutRequest) other);
        return ((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSystemReqInd == rhs.criteriaSystemReqInd)||((this.criteriaSystemReqInd!= null)&&this.criteriaSystemReqInd.equals(rhs.criteriaSystemReqInd))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
