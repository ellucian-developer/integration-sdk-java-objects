
package com.ellucian.generated.bpapi.ban.detail_category_codes.v1_0_0;

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
    "criteria.vrMsgNo",
    "sysreqInd",
    "criteria.sysreqInd",
    "vrMsgNo",
    "criteria.desc",
    "desc"
})
@Generated("jsonschema2pojo")
public class DetailCategoryCodes100PutRequest {

    /**
     * Code
     * <p>
     * Lineage reference object : TTVDCAT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : TTVDCAT_CODE")
    private String criteriaCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVDCAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVDCAT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVDCAT_VR_MSG_NO
     * 
     */
    @JsonProperty("criteria.vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : TTVDCAT_VR_MSG_NO")
    private Double criteriaVrMsgNo;
    /**
     * Lineage reference object : TTVDCAT_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    @JsonPropertyDescription("Lineage reference object : TTVDCAT_SYSREQ_IND")
    private String sysreqInd;
    /**
     * Lineage reference object : TTVDCAT_SYSREQ_IND
     * 
     */
    @JsonProperty("criteria.sysreqInd")
    @JsonPropertyDescription("Lineage reference object : TTVDCAT_SYSREQ_IND")
    private String criteriaSysreqInd;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVDCAT_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : TTVDCAT_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVDCAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TTVDCAT_DESC")
    private String criteriaDesc;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVDCAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TTVDCAT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : TTVDCAT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : TTVDCAT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public DetailCategoryCodes100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVDCAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVDCAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public DetailCategoryCodes100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVDCAT_VR_MSG_NO
     * 
     */
    @JsonProperty("criteria.vrMsgNo")
    public Double getCriteriaVrMsgNo() {
        return criteriaVrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVDCAT_VR_MSG_NO
     * 
     */
    @JsonProperty("criteria.vrMsgNo")
    public void setCriteriaVrMsgNo(Double criteriaVrMsgNo) {
        this.criteriaVrMsgNo = criteriaVrMsgNo;
    }

    public DetailCategoryCodes100PutRequest withCriteriaVrMsgNo(Double criteriaVrMsgNo) {
        this.criteriaVrMsgNo = criteriaVrMsgNo;
        return this;
    }

    /**
     * Lineage reference object : TTVDCAT_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public String getSysreqInd() {
        return sysreqInd;
    }

    /**
     * Lineage reference object : TTVDCAT_SYSREQ_IND
     * 
     */
    @JsonProperty("sysreqInd")
    public void setSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
    }

    public DetailCategoryCodes100PutRequest withSysreqInd(String sysreqInd) {
        this.sysreqInd = sysreqInd;
        return this;
    }

    /**
     * Lineage reference object : TTVDCAT_SYSREQ_IND
     * 
     */
    @JsonProperty("criteria.sysreqInd")
    public String getCriteriaSysreqInd() {
        return criteriaSysreqInd;
    }

    /**
     * Lineage reference object : TTVDCAT_SYSREQ_IND
     * 
     */
    @JsonProperty("criteria.sysreqInd")
    public void setCriteriaSysreqInd(String criteriaSysreqInd) {
        this.criteriaSysreqInd = criteriaSysreqInd;
    }

    public DetailCategoryCodes100PutRequest withCriteriaSysreqInd(String criteriaSysreqInd) {
        this.criteriaSysreqInd = criteriaSysreqInd;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVDCAT_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVDCAT_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public DetailCategoryCodes100PutRequest withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVDCAT_DESC
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
     * Lineage reference object : TTVDCAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public DetailCategoryCodes100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVDCAT_DESC
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
     * Lineage reference object : TTVDCAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DetailCategoryCodes100PutRequest withDesc(String desc) {
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

    public DetailCategoryCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetailCategoryCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaVrMsgNo");
        sb.append('=');
        sb.append(((this.criteriaVrMsgNo == null)?"<null>":this.criteriaVrMsgNo));
        sb.append(',');
        sb.append("sysreqInd");
        sb.append('=');
        sb.append(((this.sysreqInd == null)?"<null>":this.sysreqInd));
        sb.append(',');
        sb.append("criteriaSysreqInd");
        sb.append('=');
        sb.append(((this.criteriaSysreqInd == null)?"<null>":this.criteriaSysreqInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
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
        result = ((result* 31)+((this.criteriaSysreqInd == null)? 0 :this.criteriaSysreqInd.hashCode()));
        result = ((result* 31)+((this.criteriaVrMsgNo == null)? 0 :this.criteriaVrMsgNo.hashCode()));
        result = ((result* 31)+((this.sysreqInd == null)? 0 :this.sysreqInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetailCategoryCodes100PutRequest) == false) {
            return false;
        }
        DetailCategoryCodes100PutRequest rhs = ((DetailCategoryCodes100PutRequest) other);
        return ((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.criteriaSysreqInd == rhs.criteriaSysreqInd)||((this.criteriaSysreqInd!= null)&&this.criteriaSysreqInd.equals(rhs.criteriaSysreqInd))))&&((this.criteriaVrMsgNo == rhs.criteriaVrMsgNo)||((this.criteriaVrMsgNo!= null)&&this.criteriaVrMsgNo.equals(rhs.criteriaVrMsgNo))))&&((this.sysreqInd == rhs.sysreqInd)||((this.sysreqInd!= null)&&this.sysreqInd.equals(rhs.sysreqInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
