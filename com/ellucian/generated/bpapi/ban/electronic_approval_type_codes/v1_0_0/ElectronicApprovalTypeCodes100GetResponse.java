
package com.ellucian.generated.bpapi.ban.electronic_approval_type_codes.v1_0_0;

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
    "webDesc",
    "activityDate",
    "code",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalTypeCodes100GetResponse {

    /**
     * Self-Service Description
     * <p>
     * Lineage reference object : NTVAPTY_WEB_DESC
     * 
     */
    @JsonProperty("webDesc")
    @JsonPropertyDescription("Lineage reference object : NTVAPTY_WEB_DESC")
    private String webDesc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : NTVAPTY_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NTVAPTY_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Approval Type Code
     * <p>
     * Lineage reference object : NTVAPTY_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : NTVAPTY_CODE")
    private String code;
    /**
     * Lineage reference object : NTVAPTY_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NTVAPTY_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * Lineage reference object : NTVAPTY_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : NTVAPTY_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Self-Service Description
     * <p>
     * Lineage reference object : NTVAPTY_WEB_DESC
     * 
     */
    @JsonProperty("webDesc")
    public String getWebDesc() {
        return webDesc;
    }

    /**
     * Self-Service Description
     * <p>
     * Lineage reference object : NTVAPTY_WEB_DESC
     * 
     */
    @JsonProperty("webDesc")
    public void setWebDesc(String webDesc) {
        this.webDesc = webDesc;
    }

    public ElectronicApprovalTypeCodes100GetResponse withWebDesc(String webDesc) {
        this.webDesc = webDesc;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : NTVAPTY_ACTIVITY_DATE
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
     * Lineage reference object : NTVAPTY_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ElectronicApprovalTypeCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Approval Type Code
     * <p>
     * Lineage reference object : NTVAPTY_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Approval Type Code
     * <p>
     * Lineage reference object : NTVAPTY_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ElectronicApprovalTypeCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : NTVAPTY_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NTVAPTY_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ElectronicApprovalTypeCodes100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : NTVAPTY_DESC
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
     * Lineage reference object : NTVAPTY_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ElectronicApprovalTypeCodes100GetResponse withDesc(String desc) {
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

    public ElectronicApprovalTypeCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalTypeCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("webDesc");
        sb.append('=');
        sb.append(((this.webDesc == null)?"<null>":this.webDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.webDesc == null)? 0 :this.webDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalTypeCodes100GetResponse) == false) {
            return false;
        }
        ElectronicApprovalTypeCodes100GetResponse rhs = ((ElectronicApprovalTypeCodes100GetResponse) other);
        return (((((((this.webDesc == rhs.webDesc)||((this.webDesc!= null)&&this.webDesc.equals(rhs.webDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
