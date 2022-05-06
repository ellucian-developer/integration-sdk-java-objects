
package com.ellucian.generated.bpapi.ban.e_mail_address_types.v1_0_0;

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
    "dispWebInd",
    "desc",
    "urlInd"
})
@Generated("jsonschema2pojo")
public class EMailAddressTypes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVEMAL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVEMAL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : GTVEMAL_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVEMAL_CODE")
    private String code;
    /**
     * Lineage reference object : GTVEMAL_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    @JsonPropertyDescription("Lineage reference object : GTVEMAL_DISP_WEB_IND")
    private String dispWebInd;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVEMAL_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVEMAL_DESC")
    private String desc;
    /**
     * Lineage reference object : GTVEMAL_URL_IND
     * 
     */
    @JsonProperty("urlInd")
    @JsonPropertyDescription("Lineage reference object : GTVEMAL_URL_IND")
    private String urlInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVEMAL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVEMAL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EMailAddressTypes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVEMAL_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVEMAL_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EMailAddressTypes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : GTVEMAL_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public String getDispWebInd() {
        return dispWebInd;
    }

    /**
     * Lineage reference object : GTVEMAL_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public void setDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
    }

    public EMailAddressTypes100GetResponse withDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVEMAL_DESC
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
     * Lineage reference object : GTVEMAL_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EMailAddressTypes100GetResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : GTVEMAL_URL_IND
     * 
     */
    @JsonProperty("urlInd")
    public String getUrlInd() {
        return urlInd;
    }

    /**
     * Lineage reference object : GTVEMAL_URL_IND
     * 
     */
    @JsonProperty("urlInd")
    public void setUrlInd(String urlInd) {
        this.urlInd = urlInd;
    }

    public EMailAddressTypes100GetResponse withUrlInd(String urlInd) {
        this.urlInd = urlInd;
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

    public EMailAddressTypes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EMailAddressTypes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("dispWebInd");
        sb.append('=');
        sb.append(((this.dispWebInd == null)?"<null>":this.dispWebInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("urlInd");
        sb.append('=');
        sb.append(((this.urlInd == null)?"<null>":this.urlInd));
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
        result = ((result* 31)+((this.dispWebInd == null)? 0 :this.dispWebInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.urlInd == null)? 0 :this.urlInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EMailAddressTypes100GetResponse) == false) {
            return false;
        }
        EMailAddressTypes100GetResponse rhs = ((EMailAddressTypes100GetResponse) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.urlInd == rhs.urlInd)||((this.urlInd!= null)&&this.urlInd.equals(rhs.urlInd))));
    }

}
