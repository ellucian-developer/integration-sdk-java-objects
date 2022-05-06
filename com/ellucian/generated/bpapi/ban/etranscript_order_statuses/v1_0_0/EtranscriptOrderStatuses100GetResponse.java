
package com.ellucian.generated.bpapi.ban.etranscript_order_statuses.v1_0_0;

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
    "translationValue",
    "sendVendorInd",
    "activityDate",
    "code",
    "sendCloudInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class EtranscriptOrderStatuses100GetResponse {

    /**
     * Third Party Translation
     * <p>
     * Lineage reference object : STVETST_TRANSLATION_VALUE
     * 
     */
    @JsonProperty("translationValue")
    @JsonPropertyDescription("Lineage reference object : STVETST_TRANSLATION_VALUE")
    private String translationValue;
    /**
     * Send To Vendor:
     * <p>
     * Lineage reference object : STVETST_SEND_VENDOR_IND
     * 
     */
    @JsonProperty("sendVendorInd")
    @JsonPropertyDescription("Lineage reference object : STVETST_SEND_VENDOR_IND")
    private String sendVendorInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVETST_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVETST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Order Status Code
     * <p>
     * Lineage reference object : STVETST_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVETST_CODE")
    private String code;
    /**
     * Send To Cloud:
     * <p>
     * Lineage reference object : STVETST_SEND_CLOUD_IND
     * 
     */
    @JsonProperty("sendCloudInd")
    @JsonPropertyDescription("Lineage reference object : STVETST_SEND_CLOUD_IND")
    private String sendCloudInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVETST_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVETST_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Third Party Translation
     * <p>
     * Lineage reference object : STVETST_TRANSLATION_VALUE
     * 
     */
    @JsonProperty("translationValue")
    public String getTranslationValue() {
        return translationValue;
    }

    /**
     * Third Party Translation
     * <p>
     * Lineage reference object : STVETST_TRANSLATION_VALUE
     * 
     */
    @JsonProperty("translationValue")
    public void setTranslationValue(String translationValue) {
        this.translationValue = translationValue;
    }

    public EtranscriptOrderStatuses100GetResponse withTranslationValue(String translationValue) {
        this.translationValue = translationValue;
        return this;
    }

    /**
     * Send To Vendor:
     * <p>
     * Lineage reference object : STVETST_SEND_VENDOR_IND
     * 
     */
    @JsonProperty("sendVendorInd")
    public String getSendVendorInd() {
        return sendVendorInd;
    }

    /**
     * Send To Vendor:
     * <p>
     * Lineage reference object : STVETST_SEND_VENDOR_IND
     * 
     */
    @JsonProperty("sendVendorInd")
    public void setSendVendorInd(String sendVendorInd) {
        this.sendVendorInd = sendVendorInd;
    }

    public EtranscriptOrderStatuses100GetResponse withSendVendorInd(String sendVendorInd) {
        this.sendVendorInd = sendVendorInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVETST_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVETST_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EtranscriptOrderStatuses100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Order Status Code
     * <p>
     * Lineage reference object : STVETST_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Order Status Code
     * <p>
     * Lineage reference object : STVETST_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EtranscriptOrderStatuses100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Send To Cloud:
     * <p>
     * Lineage reference object : STVETST_SEND_CLOUD_IND
     * 
     */
    @JsonProperty("sendCloudInd")
    public String getSendCloudInd() {
        return sendCloudInd;
    }

    /**
     * Send To Cloud:
     * <p>
     * Lineage reference object : STVETST_SEND_CLOUD_IND
     * 
     */
    @JsonProperty("sendCloudInd")
    public void setSendCloudInd(String sendCloudInd) {
        this.sendCloudInd = sendCloudInd;
    }

    public EtranscriptOrderStatuses100GetResponse withSendCloudInd(String sendCloudInd) {
        this.sendCloudInd = sendCloudInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVETST_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVETST_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EtranscriptOrderStatuses100GetResponse withDesc(String desc) {
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

    public EtranscriptOrderStatuses100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EtranscriptOrderStatuses100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("translationValue");
        sb.append('=');
        sb.append(((this.translationValue == null)?"<null>":this.translationValue));
        sb.append(',');
        sb.append("sendVendorInd");
        sb.append('=');
        sb.append(((this.sendVendorInd == null)?"<null>":this.sendVendorInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("sendCloudInd");
        sb.append('=');
        sb.append(((this.sendCloudInd == null)?"<null>":this.sendCloudInd));
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
        result = ((result* 31)+((this.translationValue == null)? 0 :this.translationValue.hashCode()));
        result = ((result* 31)+((this.sendVendorInd == null)? 0 :this.sendVendorInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.sendCloudInd == null)? 0 :this.sendCloudInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EtranscriptOrderStatuses100GetResponse) == false) {
            return false;
        }
        EtranscriptOrderStatuses100GetResponse rhs = ((EtranscriptOrderStatuses100GetResponse) other);
        return ((((((((this.translationValue == rhs.translationValue)||((this.translationValue!= null)&&this.translationValue.equals(rhs.translationValue)))&&((this.sendVendorInd == rhs.sendVendorInd)||((this.sendVendorInd!= null)&&this.sendVendorInd.equals(rhs.sendVendorInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.sendCloudInd == rhs.sendCloudInd)||((this.sendCloudInd!= null)&&this.sendCloudInd.equals(rhs.sendCloudInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
