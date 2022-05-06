
package com.ellucian.generated.bpapi.ban.deposit_crosswalk.v1_0_0;

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
    "baseDescription",
    "baseCode",
    "activityDate",
    "paymentCode",
    "depositCode",
    "dtypCode",
    "depositDescription",
    "userId",
    "dtypDescription",
    "paymentDescription"
})
@Generated("jsonschema2pojo")
public class DepositCrosswalk100GetResponse {

    /**
     * Base Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("baseDescription")
    private String baseDescription;
    /**
     * Base Code
     * <p>
     * Lineage reference object : TBBDEPX_BASE_CODE
     * 
     */
    @JsonProperty("baseCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_BASE_CODE")
    private String baseCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBDEPX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPX_PAYMENT_CODE
     * 
     */
    @JsonProperty("paymentCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_PAYMENT_CODE")
    private String paymentCode;
    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc
     * (Required)
     * 
     */
    @JsonProperty("depositCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc")
    private String depositCode;
    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("dtypCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp")
    private String dtypCode;
    /**
     * Deposit Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("depositDescription")
    private String depositDescription;
    /**
     * Last User
     * <p>
     * Lineage reference object : TBBDEPX_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_USER_ID")
    private String userId;
    /**
     * Deposit Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("dtypDescription")
    private String dtypDescription;
    /**
     * Payment Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentDescription")
    private String paymentDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Base Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("baseDescription")
    public String getBaseDescription() {
        return baseDescription;
    }

    /**
     * Base Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("baseDescription")
    public void setBaseDescription(String baseDescription) {
        this.baseDescription = baseDescription;
    }

    public DepositCrosswalk100GetResponse withBaseDescription(String baseDescription) {
        this.baseDescription = baseDescription;
        return this;
    }

    /**
     * Base Code
     * <p>
     * Lineage reference object : TBBDEPX_BASE_CODE
     * 
     */
    @JsonProperty("baseCode")
    public String getBaseCode() {
        return baseCode;
    }

    /**
     * Base Code
     * <p>
     * Lineage reference object : TBBDEPX_BASE_CODE
     * 
     */
    @JsonProperty("baseCode")
    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public DepositCrosswalk100GetResponse withBaseCode(String baseCode) {
        this.baseCode = baseCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBDEPX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBDEPX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public DepositCrosswalk100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPX_PAYMENT_CODE
     * 
     */
    @JsonProperty("paymentCode")
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPX_PAYMENT_CODE
     * 
     */
    @JsonProperty("paymentCode")
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public DepositCrosswalk100GetResponse withPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
        return this;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc
     * (Required)
     * 
     */
    @JsonProperty("depositCode")
    public String getDepositCode() {
        return depositCode;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc
     * (Required)
     * 
     */
    @JsonProperty("depositCode")
    public void setDepositCode(String depositCode) {
        this.depositCode = depositCode;
    }

    public DepositCrosswalk100GetResponse withDepositCode(String depositCode) {
        this.depositCode = depositCode;
        return this;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("dtypCode")
    public String getDtypCode() {
        return dtypCode;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("dtypCode")
    public void setDtypCode(String dtypCode) {
        this.dtypCode = dtypCode;
    }

    public DepositCrosswalk100GetResponse withDtypCode(String dtypCode) {
        this.dtypCode = dtypCode;
        return this;
    }

    /**
     * Deposit Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("depositDescription")
    public String getDepositDescription() {
        return depositDescription;
    }

    /**
     * Deposit Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("depositDescription")
    public void setDepositDescription(String depositDescription) {
        this.depositDescription = depositDescription;
    }

    public DepositCrosswalk100GetResponse withDepositDescription(String depositDescription) {
        this.depositDescription = depositDescription;
        return this;
    }

    /**
     * Last User
     * <p>
     * Lineage reference object : TBBDEPX_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Last User
     * <p>
     * Lineage reference object : TBBDEPX_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DepositCrosswalk100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Deposit Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("dtypDescription")
    public String getDtypDescription() {
        return dtypDescription;
    }

    /**
     * Deposit Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("dtypDescription")
    public void setDtypDescription(String dtypDescription) {
        this.dtypDescription = dtypDescription;
    }

    public DepositCrosswalk100GetResponse withDtypDescription(String dtypDescription) {
        this.dtypDescription = dtypDescription;
        return this;
    }

    /**
     * Payment Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentDescription")
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Payment Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentDescription")
    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    public DepositCrosswalk100GetResponse withPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
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

    public DepositCrosswalk100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DepositCrosswalk100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseDescription");
        sb.append('=');
        sb.append(((this.baseDescription == null)?"<null>":this.baseDescription));
        sb.append(',');
        sb.append("baseCode");
        sb.append('=');
        sb.append(((this.baseCode == null)?"<null>":this.baseCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("paymentCode");
        sb.append('=');
        sb.append(((this.paymentCode == null)?"<null>":this.paymentCode));
        sb.append(',');
        sb.append("depositCode");
        sb.append('=');
        sb.append(((this.depositCode == null)?"<null>":this.depositCode));
        sb.append(',');
        sb.append("dtypCode");
        sb.append('=');
        sb.append(((this.dtypCode == null)?"<null>":this.dtypCode));
        sb.append(',');
        sb.append("depositDescription");
        sb.append('=');
        sb.append(((this.depositDescription == null)?"<null>":this.depositDescription));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("dtypDescription");
        sb.append('=');
        sb.append(((this.dtypDescription == null)?"<null>":this.dtypDescription));
        sb.append(',');
        sb.append("paymentDescription");
        sb.append('=');
        sb.append(((this.paymentDescription == null)?"<null>":this.paymentDescription));
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
        result = ((result* 31)+((this.baseDescription == null)? 0 :this.baseDescription.hashCode()));
        result = ((result* 31)+((this.baseCode == null)? 0 :this.baseCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.paymentCode == null)? 0 :this.paymentCode.hashCode()));
        result = ((result* 31)+((this.depositCode == null)? 0 :this.depositCode.hashCode()));
        result = ((result* 31)+((this.dtypCode == null)? 0 :this.dtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.depositDescription == null)? 0 :this.depositDescription.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.dtypDescription == null)? 0 :this.dtypDescription.hashCode()));
        result = ((result* 31)+((this.paymentDescription == null)? 0 :this.paymentDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepositCrosswalk100GetResponse) == false) {
            return false;
        }
        DepositCrosswalk100GetResponse rhs = ((DepositCrosswalk100GetResponse) other);
        return ((((((((((((this.baseDescription == rhs.baseDescription)||((this.baseDescription!= null)&&this.baseDescription.equals(rhs.baseDescription)))&&((this.baseCode == rhs.baseCode)||((this.baseCode!= null)&&this.baseCode.equals(rhs.baseCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.paymentCode == rhs.paymentCode)||((this.paymentCode!= null)&&this.paymentCode.equals(rhs.paymentCode))))&&((this.depositCode == rhs.depositCode)||((this.depositCode!= null)&&this.depositCode.equals(rhs.depositCode))))&&((this.dtypCode == rhs.dtypCode)||((this.dtypCode!= null)&&this.dtypCode.equals(rhs.dtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.depositDescription == rhs.depositDescription)||((this.depositDescription!= null)&&this.depositDescription.equals(rhs.depositDescription))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.dtypDescription == rhs.dtypDescription)||((this.dtypDescription!= null)&&this.dtypDescription.equals(rhs.dtypDescription))))&&((this.paymentDescription == rhs.paymentDescription)||((this.paymentDescription!= null)&&this.paymentDescription.equals(rhs.paymentDescription))));
    }

}
