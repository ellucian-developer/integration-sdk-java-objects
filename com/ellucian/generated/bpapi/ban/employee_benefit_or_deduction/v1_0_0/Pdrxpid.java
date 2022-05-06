
package com.ellucian.generated.bpapi.ban.employee_benefit_or_deduction.v1_0_0;

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
    "pictCode",
    "userId",
    "pictDesc"
})
@Generated("jsonschema2pojo")
public class Pdrxpid {

    /**
     * Lineage reference object : PDRXPID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PDRXPID_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Payroll Id
     * <p>
     * Lineage reference object : PDRXPID_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    @JsonPropertyDescription("Lineage reference object : PDRXPID_PICT_CODE")
    private String pictCode;
    /**
     * Lineage reference object : PDRXPID_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PDRXPID_USER_ID")
    private String userId;
    @JsonProperty("pictDesc")
    private String pictDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PDRXPID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PDRXPID_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Pdrxpid withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Payroll Id
     * <p>
     * Lineage reference object : PDRXPID_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public String getPictCode() {
        return pictCode;
    }

    /**
     * Payroll Id
     * <p>
     * Lineage reference object : PDRXPID_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public Pdrxpid withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    /**
     * Lineage reference object : PDRXPID_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PDRXPID_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Pdrxpid withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("pictDesc")
    public String getPictDesc() {
        return pictDesc;
    }

    @JsonProperty("pictDesc")
    public void setPictDesc(String pictDesc) {
        this.pictDesc = pictDesc;
    }

    public Pdrxpid withPictDesc(String pictDesc) {
        this.pictDesc = pictDesc;
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

    public Pdrxpid withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pdrxpid.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("pictDesc");
        sb.append('=');
        sb.append(((this.pictDesc == null)?"<null>":this.pictDesc));
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
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.pictDesc == null)? 0 :this.pictDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pdrxpid) == false) {
            return false;
        }
        Pdrxpid rhs = ((Pdrxpid) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.pictDesc == rhs.pictDesc)||((this.pictDesc!= null)&&this.pictDesc.equals(rhs.pictDesc))));
    }

}
