
package com.ellucian.generated.bpapi.ban.additional_identification_types.v1_0_0;

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
    "guisrchBypass"
})
@Generated("jsonschema2pojo")
public class AdditionalIdentificationTypes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVADID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVADID_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Additional
     *  ID Type
     * <p>
     * Lineage reference object : GTVADID_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVADID_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVADID_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVADID_DESC")
    private String desc;
    /**
     * Lineage reference object : GTVADID_GUISRCH_BYPASS
     * 
     */
    @JsonProperty("guisrchBypass")
    @JsonPropertyDescription("Lineage reference object : GTVADID_GUISRCH_BYPASS")
    private String guisrchBypass;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVADID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVADID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AdditionalIdentificationTypes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Additional
     *  ID Type
     * <p>
     * Lineage reference object : GTVADID_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Additional
     *  ID Type
     * <p>
     * Lineage reference object : GTVADID_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AdditionalIdentificationTypes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVADID_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVADID_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AdditionalIdentificationTypes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : GTVADID_GUISRCH_BYPASS
     * 
     */
    @JsonProperty("guisrchBypass")
    public String getGuisrchBypass() {
        return guisrchBypass;
    }

    /**
     * Lineage reference object : GTVADID_GUISRCH_BYPASS
     * 
     */
    @JsonProperty("guisrchBypass")
    public void setGuisrchBypass(String guisrchBypass) {
        this.guisrchBypass = guisrchBypass;
    }

    public AdditionalIdentificationTypes100QapiPost withGuisrchBypass(String guisrchBypass) {
        this.guisrchBypass = guisrchBypass;
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

    public AdditionalIdentificationTypes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalIdentificationTypes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("guisrchBypass");
        sb.append('=');
        sb.append(((this.guisrchBypass == null)?"<null>":this.guisrchBypass));
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
        result = ((result* 31)+((this.guisrchBypass == null)? 0 :this.guisrchBypass.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalIdentificationTypes100QapiPost) == false) {
            return false;
        }
        AdditionalIdentificationTypes100QapiPost rhs = ((AdditionalIdentificationTypes100QapiPost) other);
        return ((((((this.guisrchBypass == rhs.guisrchBypass)||((this.guisrchBypass!= null)&&this.guisrchBypass.equals(rhs.guisrchBypass)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
