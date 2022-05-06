
package com.ellucian.generated.bpapi.ban.billing_message.v1_0_0;

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
    "accountId",
    "criteria.activityDate",
    "keyblckDeliCode",
    "criteria.text",
    "installmentPlan",
    "collectionAgency",
    "text"
})
@Generated("jsonschema2pojo")
public class BillingMessage100PutRequest {

    /**
     * Account ID
     * <p>
     * Lineage reference object : accountId
     * 
     */
    @JsonProperty("accountId")
    @JsonPropertyDescription("Lineage reference object : accountId")
    private Object accountId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBRMESG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TBRMESG_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Delinquency Code
     * <p>
     * Lineage reference object : keyblckDeliCode, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("keyblckDeliCode")
    @JsonPropertyDescription("Lineage reference object : keyblckDeliCode, Lookup lineage reference object : ttvdeli")
    private Object keyblckDeliCode;
    /**
     * Billing Message
     * <p>
     * Lineage reference object : TBRMESG_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    @JsonPropertyDescription("Lineage reference object : TBRMESG_TEXT")
    private String criteriaText;
    /**
     * Installment Plan
     * <p>
     * Lineage reference object : installmentPlan
     * 
     */
    @JsonProperty("installmentPlan")
    @JsonPropertyDescription("Lineage reference object : installmentPlan")
    private Object installmentPlan;
    /**
     * Collection Agency
     * <p>
     * Lineage reference object : collectionAgency
     * 
     */
    @JsonProperty("collectionAgency")
    @JsonPropertyDescription("Lineage reference object : collectionAgency")
    private Object collectionAgency;
    /**
     * Billing Message
     * <p>
     * Lineage reference object : TBRMESG_TEXT
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : TBRMESG_TEXT")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Account ID
     * <p>
     * Lineage reference object : accountId
     * 
     */
    @JsonProperty("accountId")
    public Object getAccountId() {
        return accountId;
    }

    /**
     * Account ID
     * <p>
     * Lineage reference object : accountId
     * 
     */
    @JsonProperty("accountId")
    public void setAccountId(Object accountId) {
        this.accountId = accountId;
    }

    public BillingMessage100PutRequest withAccountId(Object accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBRMESG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBRMESG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public BillingMessage100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Delinquency Code
     * <p>
     * Lineage reference object : keyblckDeliCode, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("keyblckDeliCode")
    public Object getKeyblckDeliCode() {
        return keyblckDeliCode;
    }

    /**
     * Delinquency Code
     * <p>
     * Lineage reference object : keyblckDeliCode, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("keyblckDeliCode")
    public void setKeyblckDeliCode(Object keyblckDeliCode) {
        this.keyblckDeliCode = keyblckDeliCode;
    }

    public BillingMessage100PutRequest withKeyblckDeliCode(Object keyblckDeliCode) {
        this.keyblckDeliCode = keyblckDeliCode;
        return this;
    }

    /**
     * Billing Message
     * <p>
     * Lineage reference object : TBRMESG_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public String getCriteriaText() {
        return criteriaText;
    }

    /**
     * Billing Message
     * <p>
     * Lineage reference object : TBRMESG_TEXT
     * 
     */
    @JsonProperty("criteria.text")
    public void setCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
    }

    public BillingMessage100PutRequest withCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
        return this;
    }

    /**
     * Installment Plan
     * <p>
     * Lineage reference object : installmentPlan
     * 
     */
    @JsonProperty("installmentPlan")
    public Object getInstallmentPlan() {
        return installmentPlan;
    }

    /**
     * Installment Plan
     * <p>
     * Lineage reference object : installmentPlan
     * 
     */
    @JsonProperty("installmentPlan")
    public void setInstallmentPlan(Object installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    public BillingMessage100PutRequest withInstallmentPlan(Object installmentPlan) {
        this.installmentPlan = installmentPlan;
        return this;
    }

    /**
     * Collection Agency
     * <p>
     * Lineage reference object : collectionAgency
     * 
     */
    @JsonProperty("collectionAgency")
    public Object getCollectionAgency() {
        return collectionAgency;
    }

    /**
     * Collection Agency
     * <p>
     * Lineage reference object : collectionAgency
     * 
     */
    @JsonProperty("collectionAgency")
    public void setCollectionAgency(Object collectionAgency) {
        this.collectionAgency = collectionAgency;
    }

    public BillingMessage100PutRequest withCollectionAgency(Object collectionAgency) {
        this.collectionAgency = collectionAgency;
        return this;
    }

    /**
     * Billing Message
     * <p>
     * Lineage reference object : TBRMESG_TEXT
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Billing Message
     * <p>
     * Lineage reference object : TBRMESG_TEXT
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public BillingMessage100PutRequest withText(String text) {
        this.text = text;
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

    public BillingMessage100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BillingMessage100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("keyblckDeliCode");
        sb.append('=');
        sb.append(((this.keyblckDeliCode == null)?"<null>":this.keyblckDeliCode));
        sb.append(',');
        sb.append("criteriaText");
        sb.append('=');
        sb.append(((this.criteriaText == null)?"<null>":this.criteriaText));
        sb.append(',');
        sb.append("installmentPlan");
        sb.append('=');
        sb.append(((this.installmentPlan == null)?"<null>":this.installmentPlan));
        sb.append(',');
        sb.append("collectionAgency");
        sb.append('=');
        sb.append(((this.collectionAgency == null)?"<null>":this.collectionAgency));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
        result = ((result* 31)+((this.keyblckDeliCode == null)? 0 :this.keyblckDeliCode.hashCode()));
        result = ((result* 31)+((this.criteriaText == null)? 0 :this.criteriaText.hashCode()));
        result = ((result* 31)+((this.installmentPlan == null)? 0 :this.installmentPlan.hashCode()));
        result = ((result* 31)+((this.collectionAgency == null)? 0 :this.collectionAgency.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingMessage100PutRequest) == false) {
            return false;
        }
        BillingMessage100PutRequest rhs = ((BillingMessage100PutRequest) other);
        return (((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.keyblckDeliCode == rhs.keyblckDeliCode)||((this.keyblckDeliCode!= null)&&this.keyblckDeliCode.equals(rhs.keyblckDeliCode))))&&((this.criteriaText == rhs.criteriaText)||((this.criteriaText!= null)&&this.criteriaText.equals(rhs.criteriaText))))&&((this.installmentPlan == rhs.installmentPlan)||((this.installmentPlan!= null)&&this.installmentPlan.equals(rhs.installmentPlan))))&&((this.collectionAgency == rhs.collectionAgency)||((this.collectionAgency!= null)&&this.collectionAgency.equals(rhs.collectionAgency))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
