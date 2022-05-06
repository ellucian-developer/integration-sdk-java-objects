
package com.ellucian.generated.bpapi.ban.delinquency_codes.v1_0_0;

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
    "criteria.updateInd",
    "updateInd",
    "criteria.desc",
    "desc"
})
@Generated("jsonschema2pojo")
public class DelinquencyCodes100PutRequest {

    /**
     * Lineage reference object : TTVDELI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : TTVDELI_CODE")
    private String criteriaCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVDELI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVDELI_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : TTVDELI_UPDATE_IND
     * 
     */
    @JsonProperty("criteria.updateInd")
    @JsonPropertyDescription("Lineage reference object : TTVDELI_UPDATE_IND")
    private String criteriaUpdateInd;
    /**
     * Lineage reference object : TTVDELI_UPDATE_IND
     * 
     */
    @JsonProperty("updateInd")
    @JsonPropertyDescription("Lineage reference object : TTVDELI_UPDATE_IND")
    private String updateInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVDELI_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TTVDELI_DESC")
    private String criteriaDesc;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVDELI_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TTVDELI_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : TTVDELI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Lineage reference object : TTVDELI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public DelinquencyCodes100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVDELI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVDELI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public DelinquencyCodes100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Lineage reference object : TTVDELI_UPDATE_IND
     * 
     */
    @JsonProperty("criteria.updateInd")
    public String getCriteriaUpdateInd() {
        return criteriaUpdateInd;
    }

    /**
     * Lineage reference object : TTVDELI_UPDATE_IND
     * 
     */
    @JsonProperty("criteria.updateInd")
    public void setCriteriaUpdateInd(String criteriaUpdateInd) {
        this.criteriaUpdateInd = criteriaUpdateInd;
    }

    public DelinquencyCodes100PutRequest withCriteriaUpdateInd(String criteriaUpdateInd) {
        this.criteriaUpdateInd = criteriaUpdateInd;
        return this;
    }

    /**
     * Lineage reference object : TTVDELI_UPDATE_IND
     * 
     */
    @JsonProperty("updateInd")
    public String getUpdateInd() {
        return updateInd;
    }

    /**
     * Lineage reference object : TTVDELI_UPDATE_IND
     * 
     */
    @JsonProperty("updateInd")
    public void setUpdateInd(String updateInd) {
        this.updateInd = updateInd;
    }

    public DelinquencyCodes100PutRequest withUpdateInd(String updateInd) {
        this.updateInd = updateInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVDELI_DESC
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
     * Lineage reference object : TTVDELI_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public DelinquencyCodes100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVDELI_DESC
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
     * Lineage reference object : TTVDELI_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DelinquencyCodes100PutRequest withDesc(String desc) {
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

    public DelinquencyCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DelinquencyCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUpdateInd");
        sb.append('=');
        sb.append(((this.criteriaUpdateInd == null)?"<null>":this.criteriaUpdateInd));
        sb.append(',');
        sb.append("updateInd");
        sb.append('=');
        sb.append(((this.updateInd == null)?"<null>":this.updateInd));
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
        result = ((result* 31)+((this.criteriaUpdateInd == null)? 0 :this.criteriaUpdateInd.hashCode()));
        result = ((result* 31)+((this.updateInd == null)? 0 :this.updateInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DelinquencyCodes100PutRequest) == false) {
            return false;
        }
        DelinquencyCodes100PutRequest rhs = ((DelinquencyCodes100PutRequest) other);
        return ((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.criteriaUpdateInd == rhs.criteriaUpdateInd)||((this.criteriaUpdateInd!= null)&&this.criteriaUpdateInd.equals(rhs.criteriaUpdateInd))))&&((this.updateInd == rhs.updateInd)||((this.updateInd!= null)&&this.updateInd.equals(rhs.updateInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
