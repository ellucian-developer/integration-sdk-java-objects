
package com.ellucian.generated.bpapi.ban.freight_terms_codes.v1_0_0;

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
    "desc",
    "scodCodeEdifact",
    "scodCodeX12"
})
@Generated("jsonschema2pojo")
public class FreightTermsCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVFTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTRM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Freight Terms
     * Code
     * <p>
     * Lineage reference object : FTVFTRM_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FTVFTRM_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVFTRM_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVFTRM_DESC")
    private String desc;
    /**
     * EDIFACT
     * <p>
     * Lineage reference object : FTVFTRM_SCOD_CODE_EDIFACT
     * 
     */
    @JsonProperty("scodCodeEdifact")
    @JsonPropertyDescription("Lineage reference object : FTVFTRM_SCOD_CODE_EDIFACT")
    private String scodCodeEdifact;
    /**
     * X12
     * <p>
     * Lineage reference object : FTVFTRM_SCOD_CODE_X12
     * 
     */
    @JsonProperty("scodCodeX12")
    @JsonPropertyDescription("Lineage reference object : FTVFTRM_SCOD_CODE_X12")
    private String scodCodeX12;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVFTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVFTRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FreightTermsCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Freight Terms
     * Code
     * <p>
     * Lineage reference object : FTVFTRM_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Freight Terms
     * Code
     * <p>
     * Lineage reference object : FTVFTRM_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public FreightTermsCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVFTRM_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVFTRM_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FreightTermsCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * EDIFACT
     * <p>
     * Lineage reference object : FTVFTRM_SCOD_CODE_EDIFACT
     * 
     */
    @JsonProperty("scodCodeEdifact")
    public String getScodCodeEdifact() {
        return scodCodeEdifact;
    }

    /**
     * EDIFACT
     * <p>
     * Lineage reference object : FTVFTRM_SCOD_CODE_EDIFACT
     * 
     */
    @JsonProperty("scodCodeEdifact")
    public void setScodCodeEdifact(String scodCodeEdifact) {
        this.scodCodeEdifact = scodCodeEdifact;
    }

    public FreightTermsCodes100QapiPost withScodCodeEdifact(String scodCodeEdifact) {
        this.scodCodeEdifact = scodCodeEdifact;
        return this;
    }

    /**
     * X12
     * <p>
     * Lineage reference object : FTVFTRM_SCOD_CODE_X12
     * 
     */
    @JsonProperty("scodCodeX12")
    public String getScodCodeX12() {
        return scodCodeX12;
    }

    /**
     * X12
     * <p>
     * Lineage reference object : FTVFTRM_SCOD_CODE_X12
     * 
     */
    @JsonProperty("scodCodeX12")
    public void setScodCodeX12(String scodCodeX12) {
        this.scodCodeX12 = scodCodeX12;
    }

    public FreightTermsCodes100QapiPost withScodCodeX12(String scodCodeX12) {
        this.scodCodeX12 = scodCodeX12;
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

    public FreightTermsCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FreightTermsCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("scodCodeEdifact");
        sb.append('=');
        sb.append(((this.scodCodeEdifact == null)?"<null>":this.scodCodeEdifact));
        sb.append(',');
        sb.append("scodCodeX12");
        sb.append('=');
        sb.append(((this.scodCodeX12 == null)?"<null>":this.scodCodeX12));
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
        result = ((result* 31)+((this.scodCodeX12 == null)? 0 :this.scodCodeX12 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scodCodeEdifact == null)? 0 :this.scodCodeEdifact.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FreightTermsCodes100QapiPost) == false) {
            return false;
        }
        FreightTermsCodes100QapiPost rhs = ((FreightTermsCodes100QapiPost) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.scodCodeX12 == rhs.scodCodeX12)||((this.scodCodeX12 != null)&&this.scodCodeX12 .equals(rhs.scodCodeX12))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scodCodeEdifact == rhs.scodCodeEdifact)||((this.scodCodeEdifact!= null)&&this.scodCodeEdifact.equals(rhs.scodCodeEdifact))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
