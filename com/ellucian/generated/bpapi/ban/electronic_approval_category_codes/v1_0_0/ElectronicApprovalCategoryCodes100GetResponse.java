
package com.ellucian.generated.bpapi.ban.electronic_approval_category_codes.v1_0_0;

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
    "webDisplaySeqNo",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalCategoryCodes100GetResponse {

    /**
     * Self-Service Description
     * <p>
     * Lineage reference object : NTVACAT_WEB_DESC
     * 
     */
    @JsonProperty("webDesc")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_WEB_DESC")
    private String webDesc;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : NTVACAT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Approval Category Code
     * <p>
     * Lineage reference object : NTVACAT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_CODE")
    private String code;
    /**
     * Self Service Display Sequence
     * <p>
     * Lineage reference object : NTVACAT_WEB_DISPLAY_SEQ_NO
     * 
     */
    @JsonProperty("webDisplaySeqNo")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_WEB_DISPLAY_SEQ_NO")
    private Double webDisplaySeqNo;
    /**
     * Lineage reference object : NTVACAT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * Lineage reference object : NTVACAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Self-Service Description
     * <p>
     * Lineage reference object : NTVACAT_WEB_DESC
     * 
     */
    @JsonProperty("webDesc")
    public String getWebDesc() {
        return webDesc;
    }

    /**
     * Self-Service Description
     * <p>
     * Lineage reference object : NTVACAT_WEB_DESC
     * 
     */
    @JsonProperty("webDesc")
    public void setWebDesc(String webDesc) {
        this.webDesc = webDesc;
    }

    public ElectronicApprovalCategoryCodes100GetResponse withWebDesc(String webDesc) {
        this.webDesc = webDesc;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : NTVACAT_ACTIVITY_DATE
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
     * Lineage reference object : NTVACAT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ElectronicApprovalCategoryCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Approval Category Code
     * <p>
     * Lineage reference object : NTVACAT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Approval Category Code
     * <p>
     * Lineage reference object : NTVACAT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ElectronicApprovalCategoryCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Self Service Display Sequence
     * <p>
     * Lineage reference object : NTVACAT_WEB_DISPLAY_SEQ_NO
     * 
     */
    @JsonProperty("webDisplaySeqNo")
    public Double getWebDisplaySeqNo() {
        return webDisplaySeqNo;
    }

    /**
     * Self Service Display Sequence
     * <p>
     * Lineage reference object : NTVACAT_WEB_DISPLAY_SEQ_NO
     * 
     */
    @JsonProperty("webDisplaySeqNo")
    public void setWebDisplaySeqNo(Double webDisplaySeqNo) {
        this.webDisplaySeqNo = webDisplaySeqNo;
    }

    public ElectronicApprovalCategoryCodes100GetResponse withWebDisplaySeqNo(Double webDisplaySeqNo) {
        this.webDisplaySeqNo = webDisplaySeqNo;
        return this;
    }

    /**
     * Lineage reference object : NTVACAT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NTVACAT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ElectronicApprovalCategoryCodes100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : NTVACAT_DESC
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
     * Lineage reference object : NTVACAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ElectronicApprovalCategoryCodes100GetResponse withDesc(String desc) {
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

    public ElectronicApprovalCategoryCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalCategoryCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("webDisplaySeqNo");
        sb.append('=');
        sb.append(((this.webDisplaySeqNo == null)?"<null>":this.webDisplaySeqNo));
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
        result = ((result* 31)+((this.webDisplaySeqNo == null)? 0 :this.webDisplaySeqNo.hashCode()));
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
        if ((other instanceof ElectronicApprovalCategoryCodes100GetResponse) == false) {
            return false;
        }
        ElectronicApprovalCategoryCodes100GetResponse rhs = ((ElectronicApprovalCategoryCodes100GetResponse) other);
        return ((((((((this.webDesc == rhs.webDesc)||((this.webDesc!= null)&&this.webDesc.equals(rhs.webDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.webDisplaySeqNo == rhs.webDisplaySeqNo)||((this.webDisplaySeqNo!= null)&&this.webDisplaySeqNo.equals(rhs.webDisplaySeqNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
