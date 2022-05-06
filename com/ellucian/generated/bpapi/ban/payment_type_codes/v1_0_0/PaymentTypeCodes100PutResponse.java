
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
    "activityDate",
    "code",
    "systemReqInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class PaymentTypeCodes100PutResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVPAYT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVPAYT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : TTVPAYT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : TTVPAYT_CODE")
    private String code;
    /**
     * Lineage reference object : TTVPAYT_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : TTVPAYT_SYSTEM_REQ_IND")
    private String systemReqInd;
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
     * Activity Date
     * <p>
     * Lineage reference object : TTVPAYT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVPAYT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PaymentTypeCodes100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : TTVPAYT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Lineage reference object : TTVPAYT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PaymentTypeCodes100PutResponse withCode(String code) {
        this.code = code;
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

    public PaymentTypeCodes100PutResponse withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
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

    public PaymentTypeCodes100PutResponse withDesc(String desc) {
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

    public PaymentTypeCodes100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentTypeCodes100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentTypeCodes100PutResponse) == false) {
            return false;
        }
        PaymentTypeCodes100PutResponse rhs = ((PaymentTypeCodes100PutResponse) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
