
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
    "criteria.depositCode",
    "criteria.paymentCode",
    "criteria.dtypDescription",
    "criteria.userId",
    "criteria.activityDate",
    "paymentCode",
    "depositCode",
    "criteria.baseCode",
    "criteria.baseDescription",
    "criteria.dtypCode",
    "criteria.paymentDescription",
    "criteria.depositDescription"
})
@Generated("jsonschema2pojo")
public class DepositCrosswalk100PutRequest {

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc
     * (Required)
     * 
     */
    @JsonProperty("criteria.depositCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc")
    private String criteriaDepositCode;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPX_PAYMENT_CODE
     * 
     */
    @JsonProperty("criteria.paymentCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_PAYMENT_CODE")
    private String criteriaPaymentCode;
    /**
     * Deposit Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.dtypDescription")
    private String criteriaDtypDescription;
    /**
     * Last User
     * <p>
     * Lineage reference object : TBBDEPX_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_USER_ID")
    private String criteriaUserId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBDEPX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_ACTIVITY_DATE")
    private Date criteriaActivityDate;
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
     * Base Code
     * <p>
     * Lineage reference object : TBBDEPX_BASE_CODE
     * 
     */
    @JsonProperty("criteria.baseCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_BASE_CODE")
    private String criteriaBaseCode;
    /**
     * Base Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.baseDescription")
    private String criteriaBaseDescription;
    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("criteria.dtypCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp")
    private String criteriaDtypCode;
    /**
     * Payment Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.paymentDescription")
    private String criteriaPaymentDescription;
    /**
     * Deposit Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.depositDescription")
    private String criteriaDepositDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc
     * (Required)
     * 
     */
    @JsonProperty("criteria.depositCode")
    public String getCriteriaDepositCode() {
        return criteriaDepositCode;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPX_DEPOSIT_CODE, Lookup lineage reference object : tbbdetc,tbbdepc
     * (Required)
     * 
     */
    @JsonProperty("criteria.depositCode")
    public void setCriteriaDepositCode(String criteriaDepositCode) {
        this.criteriaDepositCode = criteriaDepositCode;
    }

    public DepositCrosswalk100PutRequest withCriteriaDepositCode(String criteriaDepositCode) {
        this.criteriaDepositCode = criteriaDepositCode;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPX_PAYMENT_CODE
     * 
     */
    @JsonProperty("criteria.paymentCode")
    public String getCriteriaPaymentCode() {
        return criteriaPaymentCode;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPX_PAYMENT_CODE
     * 
     */
    @JsonProperty("criteria.paymentCode")
    public void setCriteriaPaymentCode(String criteriaPaymentCode) {
        this.criteriaPaymentCode = criteriaPaymentCode;
    }

    public DepositCrosswalk100PutRequest withCriteriaPaymentCode(String criteriaPaymentCode) {
        this.criteriaPaymentCode = criteriaPaymentCode;
        return this;
    }

    /**
     * Deposit Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.dtypDescription")
    public String getCriteriaDtypDescription() {
        return criteriaDtypDescription;
    }

    /**
     * Deposit Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.dtypDescription")
    public void setCriteriaDtypDescription(String criteriaDtypDescription) {
        this.criteriaDtypDescription = criteriaDtypDescription;
    }

    public DepositCrosswalk100PutRequest withCriteriaDtypDescription(String criteriaDtypDescription) {
        this.criteriaDtypDescription = criteriaDtypDescription;
        return this;
    }

    /**
     * Last User
     * <p>
     * Lineage reference object : TBBDEPX_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Last User
     * <p>
     * Lineage reference object : TBBDEPX_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public DepositCrosswalk100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBDEPX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBDEPX_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public DepositCrosswalk100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
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

    public DepositCrosswalk100PutRequest withPaymentCode(String paymentCode) {
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

    public DepositCrosswalk100PutRequest withDepositCode(String depositCode) {
        this.depositCode = depositCode;
        return this;
    }

    /**
     * Base Code
     * <p>
     * Lineage reference object : TBBDEPX_BASE_CODE
     * 
     */
    @JsonProperty("criteria.baseCode")
    public String getCriteriaBaseCode() {
        return criteriaBaseCode;
    }

    /**
     * Base Code
     * <p>
     * Lineage reference object : TBBDEPX_BASE_CODE
     * 
     */
    @JsonProperty("criteria.baseCode")
    public void setCriteriaBaseCode(String criteriaBaseCode) {
        this.criteriaBaseCode = criteriaBaseCode;
    }

    public DepositCrosswalk100PutRequest withCriteriaBaseCode(String criteriaBaseCode) {
        this.criteriaBaseCode = criteriaBaseCode;
        return this;
    }

    /**
     * Base Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.baseDescription")
    public String getCriteriaBaseDescription() {
        return criteriaBaseDescription;
    }

    /**
     * Base Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.baseDescription")
    public void setCriteriaBaseDescription(String criteriaBaseDescription) {
        this.criteriaBaseDescription = criteriaBaseDescription;
    }

    public DepositCrosswalk100PutRequest withCriteriaBaseDescription(String criteriaBaseDescription) {
        this.criteriaBaseDescription = criteriaBaseDescription;
        return this;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("criteria.dtypCode")
    public String getCriteriaDtypCode() {
        return criteriaDtypCode;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPX_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("criteria.dtypCode")
    public void setCriteriaDtypCode(String criteriaDtypCode) {
        this.criteriaDtypCode = criteriaDtypCode;
    }

    public DepositCrosswalk100PutRequest withCriteriaDtypCode(String criteriaDtypCode) {
        this.criteriaDtypCode = criteriaDtypCode;
        return this;
    }

    /**
     * Payment Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.paymentDescription")
    public String getCriteriaPaymentDescription() {
        return criteriaPaymentDescription;
    }

    /**
     * Payment Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.paymentDescription")
    public void setCriteriaPaymentDescription(String criteriaPaymentDescription) {
        this.criteriaPaymentDescription = criteriaPaymentDescription;
    }

    public DepositCrosswalk100PutRequest withCriteriaPaymentDescription(String criteriaPaymentDescription) {
        this.criteriaPaymentDescription = criteriaPaymentDescription;
        return this;
    }

    /**
     * Deposit Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.depositDescription")
    public String getCriteriaDepositDescription() {
        return criteriaDepositDescription;
    }

    /**
     * Deposit Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.depositDescription")
    public void setCriteriaDepositDescription(String criteriaDepositDescription) {
        this.criteriaDepositDescription = criteriaDepositDescription;
    }

    public DepositCrosswalk100PutRequest withCriteriaDepositDescription(String criteriaDepositDescription) {
        this.criteriaDepositDescription = criteriaDepositDescription;
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

    public DepositCrosswalk100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DepositCrosswalk100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDepositCode");
        sb.append('=');
        sb.append(((this.criteriaDepositCode == null)?"<null>":this.criteriaDepositCode));
        sb.append(',');
        sb.append("criteriaPaymentCode");
        sb.append('=');
        sb.append(((this.criteriaPaymentCode == null)?"<null>":this.criteriaPaymentCode));
        sb.append(',');
        sb.append("criteriaDtypDescription");
        sb.append('=');
        sb.append(((this.criteriaDtypDescription == null)?"<null>":this.criteriaDtypDescription));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("paymentCode");
        sb.append('=');
        sb.append(((this.paymentCode == null)?"<null>":this.paymentCode));
        sb.append(',');
        sb.append("depositCode");
        sb.append('=');
        sb.append(((this.depositCode == null)?"<null>":this.depositCode));
        sb.append(',');
        sb.append("criteriaBaseCode");
        sb.append('=');
        sb.append(((this.criteriaBaseCode == null)?"<null>":this.criteriaBaseCode));
        sb.append(',');
        sb.append("criteriaBaseDescription");
        sb.append('=');
        sb.append(((this.criteriaBaseDescription == null)?"<null>":this.criteriaBaseDescription));
        sb.append(',');
        sb.append("criteriaDtypCode");
        sb.append('=');
        sb.append(((this.criteriaDtypCode == null)?"<null>":this.criteriaDtypCode));
        sb.append(',');
        sb.append("criteriaPaymentDescription");
        sb.append('=');
        sb.append(((this.criteriaPaymentDescription == null)?"<null>":this.criteriaPaymentDescription));
        sb.append(',');
        sb.append("criteriaDepositDescription");
        sb.append('=');
        sb.append(((this.criteriaDepositDescription == null)?"<null>":this.criteriaDepositDescription));
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
        result = ((result* 31)+((this.criteriaPaymentDescription == null)? 0 :this.criteriaPaymentDescription.hashCode()));
        result = ((result* 31)+((this.criteriaDtypCode == null)? 0 :this.criteriaDtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaDepositCode == null)? 0 :this.criteriaDepositCode.hashCode()));
        result = ((result* 31)+((this.criteriaPaymentCode == null)? 0 :this.criteriaPaymentCode.hashCode()));
        result = ((result* 31)+((this.criteriaDtypDescription == null)? 0 :this.criteriaDtypDescription.hashCode()));
        result = ((result* 31)+((this.criteriaDepositDescription == null)? 0 :this.criteriaDepositDescription.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.paymentCode == null)? 0 :this.paymentCode.hashCode()));
        result = ((result* 31)+((this.depositCode == null)? 0 :this.depositCode.hashCode()));
        result = ((result* 31)+((this.criteriaBaseDescription == null)? 0 :this.criteriaBaseDescription.hashCode()));
        result = ((result* 31)+((this.criteriaBaseCode == null)? 0 :this.criteriaBaseCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepositCrosswalk100PutRequest) == false) {
            return false;
        }
        DepositCrosswalk100PutRequest rhs = ((DepositCrosswalk100PutRequest) other);
        return ((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaPaymentDescription == rhs.criteriaPaymentDescription)||((this.criteriaPaymentDescription!= null)&&this.criteriaPaymentDescription.equals(rhs.criteriaPaymentDescription))))&&((this.criteriaDtypCode == rhs.criteriaDtypCode)||((this.criteriaDtypCode!= null)&&this.criteriaDtypCode.equals(rhs.criteriaDtypCode))))&&((this.criteriaDepositCode == rhs.criteriaDepositCode)||((this.criteriaDepositCode!= null)&&this.criteriaDepositCode.equals(rhs.criteriaDepositCode))))&&((this.criteriaPaymentCode == rhs.criteriaPaymentCode)||((this.criteriaPaymentCode!= null)&&this.criteriaPaymentCode.equals(rhs.criteriaPaymentCode))))&&((this.criteriaDtypDescription == rhs.criteriaDtypDescription)||((this.criteriaDtypDescription!= null)&&this.criteriaDtypDescription.equals(rhs.criteriaDtypDescription))))&&((this.criteriaDepositDescription == rhs.criteriaDepositDescription)||((this.criteriaDepositDescription!= null)&&this.criteriaDepositDescription.equals(rhs.criteriaDepositDescription))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.paymentCode == rhs.paymentCode)||((this.paymentCode!= null)&&this.paymentCode.equals(rhs.paymentCode))))&&((this.depositCode == rhs.depositCode)||((this.depositCode!= null)&&this.depositCode.equals(rhs.depositCode))))&&((this.criteriaBaseDescription == rhs.criteriaBaseDescription)||((this.criteriaBaseDescription!= null)&&this.criteriaBaseDescription.equals(rhs.criteriaBaseDescription))))&&((this.criteriaBaseCode == rhs.criteriaBaseCode)||((this.criteriaBaseCode!= null)&&this.criteriaBaseCode.equals(rhs.criteriaBaseCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
