
package com.ellucian.generated.bpapi.ban.billing_message.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "collectionAgency",
    "keyblckDeliCode",
    "installmentPlan",
    "accountId"
})
@Generated("jsonschema2pojo")
public class BillingMessage100QapiPost {

    @JsonProperty("collectionAgency")
    private String collectionAgency;
    @JsonProperty("keyblckDeliCode")
    private String keyblckDeliCode;
    @JsonProperty("installmentPlan")
    private String installmentPlan;
    @JsonProperty("accountId")
    private String accountId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("collectionAgency")
    public String getCollectionAgency() {
        return collectionAgency;
    }

    @JsonProperty("collectionAgency")
    public void setCollectionAgency(String collectionAgency) {
        this.collectionAgency = collectionAgency;
    }

    public BillingMessage100QapiPost withCollectionAgency(String collectionAgency) {
        this.collectionAgency = collectionAgency;
        return this;
    }

    @JsonProperty("keyblckDeliCode")
    public String getKeyblckDeliCode() {
        return keyblckDeliCode;
    }

    @JsonProperty("keyblckDeliCode")
    public void setKeyblckDeliCode(String keyblckDeliCode) {
        this.keyblckDeliCode = keyblckDeliCode;
    }

    public BillingMessage100QapiPost withKeyblckDeliCode(String keyblckDeliCode) {
        this.keyblckDeliCode = keyblckDeliCode;
        return this;
    }

    @JsonProperty("installmentPlan")
    public String getInstallmentPlan() {
        return installmentPlan;
    }

    @JsonProperty("installmentPlan")
    public void setInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    public BillingMessage100QapiPost withInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
        return this;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BillingMessage100QapiPost withAccountId(String accountId) {
        this.accountId = accountId;
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

    public BillingMessage100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BillingMessage100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("collectionAgency");
        sb.append('=');
        sb.append(((this.collectionAgency == null)?"<null>":this.collectionAgency));
        sb.append(',');
        sb.append("keyblckDeliCode");
        sb.append('=');
        sb.append(((this.keyblckDeliCode == null)?"<null>":this.keyblckDeliCode));
        sb.append(',');
        sb.append("installmentPlan");
        sb.append('=');
        sb.append(((this.installmentPlan == null)?"<null>":this.installmentPlan));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
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
        result = ((result* 31)+((this.installmentPlan == null)? 0 :this.installmentPlan.hashCode()));
        result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
        result = ((result* 31)+((this.collectionAgency == null)? 0 :this.collectionAgency.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckDeliCode == null)? 0 :this.keyblckDeliCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingMessage100QapiPost) == false) {
            return false;
        }
        BillingMessage100QapiPost rhs = ((BillingMessage100QapiPost) other);
        return ((((((this.installmentPlan == rhs.installmentPlan)||((this.installmentPlan!= null)&&this.installmentPlan.equals(rhs.installmentPlan)))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.collectionAgency == rhs.collectionAgency)||((this.collectionAgency!= null)&&this.collectionAgency.equals(rhs.collectionAgency))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckDeliCode == rhs.keyblckDeliCode)||((this.keyblckDeliCode!= null)&&this.keyblckDeliCode.equals(rhs.keyblckDeliCode))));
    }

}
