
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
    "activityDate",
    "code",
    "desc",
    "webDesc",
    "webDisplaySeqNo"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalCategoryCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : NTVACAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Approval Category Code
     * <p>
     * Lineage reference object : NTVACAT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : NTVACAT_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_DESC")
    private String desc;
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
     * Self Service Display Sequence
     * <p>
     * Lineage reference object : NTVACAT_WEB_DISPLAY_SEQ_NO
     * 
     */
    @JsonProperty("webDisplaySeqNo")
    @JsonPropertyDescription("Lineage reference object : NTVACAT_WEB_DISPLAY_SEQ_NO")
    private Double webDisplaySeqNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : NTVACAT_ACTIVITY_DATE
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
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ElectronicApprovalCategoryCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Approval Category Code
     * <p>
     * Lineage reference object : NTVACAT_CODE
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
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ElectronicApprovalCategoryCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : NTVACAT_DESC
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
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ElectronicApprovalCategoryCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

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

    public ElectronicApprovalCategoryCodes100QapiPost withWebDesc(String webDesc) {
        this.webDesc = webDesc;
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

    public ElectronicApprovalCategoryCodes100QapiPost withWebDisplaySeqNo(Double webDisplaySeqNo) {
        this.webDisplaySeqNo = webDisplaySeqNo;
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

    public ElectronicApprovalCategoryCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalCategoryCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("webDesc");
        sb.append('=');
        sb.append(((this.webDesc == null)?"<null>":this.webDesc));
        sb.append(',');
        sb.append("webDisplaySeqNo");
        sb.append('=');
        sb.append(((this.webDisplaySeqNo == null)?"<null>":this.webDisplaySeqNo));
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
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalCategoryCodes100QapiPost) == false) {
            return false;
        }
        ElectronicApprovalCategoryCodes100QapiPost rhs = ((ElectronicApprovalCategoryCodes100QapiPost) other);
        return (((((((this.webDesc == rhs.webDesc)||((this.webDesc!= null)&&this.webDesc.equals(rhs.webDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.webDisplaySeqNo == rhs.webDisplaySeqNo)||((this.webDisplaySeqNo!= null)&&this.webDisplaySeqNo.equals(rhs.webDisplaySeqNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
