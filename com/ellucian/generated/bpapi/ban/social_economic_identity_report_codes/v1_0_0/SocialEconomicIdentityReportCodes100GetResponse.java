
package com.ellucian.generated.bpapi.ban.social_economic_identity_report_codes.v1_0_0;

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
    "surrogateId",
    "dataOrigin",
    "vpdiCode",
    "userId",
    "version",
    "desc"
})
@Generated("jsonschema2pojo")
public class SocialEconomicIdentityReportCodes100GetResponse {

    /**
     * Lineage reference object : GTVSEIR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVSEIR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : GTVSEIR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVSEIR_CODE")
    private String code;
    /**
     * Lineage reference object : GTVSEIR_SURROGATE_ID
     * 
     */
    @JsonProperty("surrogateId")
    @JsonPropertyDescription("Lineage reference object : GTVSEIR_SURROGATE_ID")
    private Double surrogateId;
    /**
     * Lineage reference object : GTVSEIR_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    @JsonPropertyDescription("Lineage reference object : GTVSEIR_DATA_ORIGIN")
    private String dataOrigin;
    /**
     * Lineage reference object : GTVSEIR_VPDI_CODE
     * 
     */
    @JsonProperty("vpdiCode")
    @JsonPropertyDescription("Lineage reference object : GTVSEIR_VPDI_CODE")
    private String vpdiCode;
    /**
     * Lineage reference object : GTVSEIR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GTVSEIR_USER_ID")
    private String userId;
    /**
     * Lineage reference object : GTVSEIR_VERSION
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Lineage reference object : GTVSEIR_VERSION")
    private Double version;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVSEIR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVSEIR_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : GTVSEIR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : GTVSEIR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SocialEconomicIdentityReportCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVSEIR_CODE
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
     * Lineage reference object : GTVSEIR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SocialEconomicIdentityReportCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : GTVSEIR_SURROGATE_ID
     * 
     */
    @JsonProperty("surrogateId")
    public Double getSurrogateId() {
        return surrogateId;
    }

    /**
     * Lineage reference object : GTVSEIR_SURROGATE_ID
     * 
     */
    @JsonProperty("surrogateId")
    public void setSurrogateId(Double surrogateId) {
        this.surrogateId = surrogateId;
    }

    public SocialEconomicIdentityReportCodes100GetResponse withSurrogateId(Double surrogateId) {
        this.surrogateId = surrogateId;
        return this;
    }

    /**
     * Lineage reference object : GTVSEIR_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public String getDataOrigin() {
        return dataOrigin;
    }

    /**
     * Lineage reference object : GTVSEIR_DATA_ORIGIN
     * 
     */
    @JsonProperty("dataOrigin")
    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public SocialEconomicIdentityReportCodes100GetResponse withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    /**
     * Lineage reference object : GTVSEIR_VPDI_CODE
     * 
     */
    @JsonProperty("vpdiCode")
    public String getVpdiCode() {
        return vpdiCode;
    }

    /**
     * Lineage reference object : GTVSEIR_VPDI_CODE
     * 
     */
    @JsonProperty("vpdiCode")
    public void setVpdiCode(String vpdiCode) {
        this.vpdiCode = vpdiCode;
    }

    public SocialEconomicIdentityReportCodes100GetResponse withVpdiCode(String vpdiCode) {
        this.vpdiCode = vpdiCode;
        return this;
    }

    /**
     * Lineage reference object : GTVSEIR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : GTVSEIR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SocialEconomicIdentityReportCodes100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : GTVSEIR_VERSION
     * 
     */
    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    /**
     * Lineage reference object : GTVSEIR_VERSION
     * 
     */
    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    public SocialEconomicIdentityReportCodes100GetResponse withVersion(Double version) {
        this.version = version;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVSEIR_DESC
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
     * Lineage reference object : GTVSEIR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SocialEconomicIdentityReportCodes100GetResponse withDesc(String desc) {
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

    public SocialEconomicIdentityReportCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SocialEconomicIdentityReportCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("surrogateId");
        sb.append('=');
        sb.append(((this.surrogateId == null)?"<null>":this.surrogateId));
        sb.append(',');
        sb.append("dataOrigin");
        sb.append('=');
        sb.append(((this.dataOrigin == null)?"<null>":this.dataOrigin));
        sb.append(',');
        sb.append("vpdiCode");
        sb.append('=');
        sb.append(((this.vpdiCode == null)?"<null>":this.vpdiCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
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
        result = ((result* 31)+((this.surrogateId == null)? 0 :this.surrogateId.hashCode()));
        result = ((result* 31)+((this.dataOrigin == null)? 0 :this.dataOrigin.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vpdiCode == null)? 0 :this.vpdiCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SocialEconomicIdentityReportCodes100GetResponse) == false) {
            return false;
        }
        SocialEconomicIdentityReportCodes100GetResponse rhs = ((SocialEconomicIdentityReportCodes100GetResponse) other);
        return ((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.surrogateId == rhs.surrogateId)||((this.surrogateId!= null)&&this.surrogateId.equals(rhs.surrogateId))))&&((this.dataOrigin == rhs.dataOrigin)||((this.dataOrigin!= null)&&this.dataOrigin.equals(rhs.dataOrigin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vpdiCode == rhs.vpdiCode)||((this.vpdiCode!= null)&&this.vpdiCode.equals(rhs.vpdiCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
