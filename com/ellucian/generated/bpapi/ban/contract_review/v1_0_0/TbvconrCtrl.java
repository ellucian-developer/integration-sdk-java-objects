
package com.ellucian.generated.bpapi.ban.contract_review.v1_0_0;

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
    "ctlDetailCode",
    "ctlDescription",
    "queryBalance",
    "accountBalance",
    "ctlAmount"
})
@Generated("jsonschema2pojo")
public class TbvconrCtrl {

    /**
     * Detail Code
     * <p>
     * Lineage reference object : ctlDetailCode
     * 
     */
    @JsonProperty("ctlDetailCode")
    @JsonPropertyDescription("Lineage reference object : ctlDetailCode")
    private String ctlDetailCode;
    /**
     * Lineage reference object : ctlDescription
     * 
     */
    @JsonProperty("ctlDescription")
    @JsonPropertyDescription("Lineage reference object : ctlDescription")
    private String ctlDescription;
    /**
     * Query Balance
     * <p>
     * Lineage reference object : queryBalance
     * 
     */
    @JsonProperty("queryBalance")
    @JsonPropertyDescription("Lineage reference object : queryBalance")
    private Double queryBalance;
    /**
     * Account Balance
     * <p>
     * Lineage reference object : accountBalance
     * 
     */
    @JsonProperty("accountBalance")
    @JsonPropertyDescription("Lineage reference object : accountBalance")
    private Double accountBalance;
    /**
     * Amount
     * <p>
     * Lineage reference object : ctlAmount
     * 
     */
    @JsonProperty("ctlAmount")
    @JsonPropertyDescription("Lineage reference object : ctlAmount")
    private Double ctlAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Detail Code
     * <p>
     * Lineage reference object : ctlDetailCode
     * 
     */
    @JsonProperty("ctlDetailCode")
    public String getCtlDetailCode() {
        return ctlDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : ctlDetailCode
     * 
     */
    @JsonProperty("ctlDetailCode")
    public void setCtlDetailCode(String ctlDetailCode) {
        this.ctlDetailCode = ctlDetailCode;
    }

    public TbvconrCtrl withCtlDetailCode(String ctlDetailCode) {
        this.ctlDetailCode = ctlDetailCode;
        return this;
    }

    /**
     * Lineage reference object : ctlDescription
     * 
     */
    @JsonProperty("ctlDescription")
    public String getCtlDescription() {
        return ctlDescription;
    }

    /**
     * Lineage reference object : ctlDescription
     * 
     */
    @JsonProperty("ctlDescription")
    public void setCtlDescription(String ctlDescription) {
        this.ctlDescription = ctlDescription;
    }

    public TbvconrCtrl withCtlDescription(String ctlDescription) {
        this.ctlDescription = ctlDescription;
        return this;
    }

    /**
     * Query Balance
     * <p>
     * Lineage reference object : queryBalance
     * 
     */
    @JsonProperty("queryBalance")
    public Double getQueryBalance() {
        return queryBalance;
    }

    /**
     * Query Balance
     * <p>
     * Lineage reference object : queryBalance
     * 
     */
    @JsonProperty("queryBalance")
    public void setQueryBalance(Double queryBalance) {
        this.queryBalance = queryBalance;
    }

    public TbvconrCtrl withQueryBalance(Double queryBalance) {
        this.queryBalance = queryBalance;
        return this;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : accountBalance
     * 
     */
    @JsonProperty("accountBalance")
    public Double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : accountBalance
     * 
     */
    @JsonProperty("accountBalance")
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public TbvconrCtrl withAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : ctlAmount
     * 
     */
    @JsonProperty("ctlAmount")
    public Double getCtlAmount() {
        return ctlAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : ctlAmount
     * 
     */
    @JsonProperty("ctlAmount")
    public void setCtlAmount(Double ctlAmount) {
        this.ctlAmount = ctlAmount;
    }

    public TbvconrCtrl withCtlAmount(Double ctlAmount) {
        this.ctlAmount = ctlAmount;
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

    public TbvconrCtrl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TbvconrCtrl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ctlDetailCode");
        sb.append('=');
        sb.append(((this.ctlDetailCode == null)?"<null>":this.ctlDetailCode));
        sb.append(',');
        sb.append("ctlDescription");
        sb.append('=');
        sb.append(((this.ctlDescription == null)?"<null>":this.ctlDescription));
        sb.append(',');
        sb.append("queryBalance");
        sb.append('=');
        sb.append(((this.queryBalance == null)?"<null>":this.queryBalance));
        sb.append(',');
        sb.append("accountBalance");
        sb.append('=');
        sb.append(((this.accountBalance == null)?"<null>":this.accountBalance));
        sb.append(',');
        sb.append("ctlAmount");
        sb.append('=');
        sb.append(((this.ctlAmount == null)?"<null>":this.ctlAmount));
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
        result = ((result* 31)+((this.ctlDetailCode == null)? 0 :this.ctlDetailCode.hashCode()));
        result = ((result* 31)+((this.ctlDescription == null)? 0 :this.ctlDescription.hashCode()));
        result = ((result* 31)+((this.queryBalance == null)? 0 :this.queryBalance.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accountBalance == null)? 0 :this.accountBalance.hashCode()));
        result = ((result* 31)+((this.ctlAmount == null)? 0 :this.ctlAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TbvconrCtrl) == false) {
            return false;
        }
        TbvconrCtrl rhs = ((TbvconrCtrl) other);
        return (((((((this.ctlDetailCode == rhs.ctlDetailCode)||((this.ctlDetailCode!= null)&&this.ctlDetailCode.equals(rhs.ctlDetailCode)))&&((this.ctlDescription == rhs.ctlDescription)||((this.ctlDescription!= null)&&this.ctlDescription.equals(rhs.ctlDescription))))&&((this.queryBalance == rhs.queryBalance)||((this.queryBalance!= null)&&this.queryBalance.equals(rhs.queryBalance))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountBalance == rhs.accountBalance)||((this.accountBalance!= null)&&this.accountBalance.equals(rhs.accountBalance))))&&((this.ctlAmount == rhs.ctlAmount)||((this.ctlAmount!= null)&&this.ctlAmount.equals(rhs.ctlAmount))));
    }

}
