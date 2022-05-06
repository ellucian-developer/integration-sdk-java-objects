
package com.ellucian.generated.bpapi.ban.account_detail_reviews.v1_0_0;

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
    "amountDue",
    "memoBalance",
    "queryBalance",
    "authAidBalance",
    "accountBalance",
    "nsfCount"
})
@Generated("jsonschema2pojo")
public class TbraccdCtrl {

    /**
     * Amount Due
     * <p>
     * Lineage reference object : amountDue
     * 
     */
    @JsonProperty("amountDue")
    @JsonPropertyDescription("Lineage reference object : amountDue")
    private Object amountDue;
    /**
     * Memo Balance
     * <p>
     * Lineage reference object : memoBalance
     * 
     */
    @JsonProperty("memoBalance")
    @JsonPropertyDescription("Lineage reference object : memoBalance")
    private Object memoBalance;
    /**
     * Query Balance
     * <p>
     * Lineage reference object : queryBalance
     * 
     */
    @JsonProperty("queryBalance")
    @JsonPropertyDescription("Lineage reference object : queryBalance")
    private Object queryBalance;
    /**
     * Authorized Aid Balance
     * <p>
     * Lineage reference object : authAidBalance
     * 
     */
    @JsonProperty("authAidBalance")
    @JsonPropertyDescription("Lineage reference object : authAidBalance")
    private Object authAidBalance;
    /**
     * Account Balance
     * <p>
     * Lineage reference object : accountBalance
     * 
     */
    @JsonProperty("accountBalance")
    @JsonPropertyDescription("Lineage reference object : accountBalance")
    private Object accountBalance;
    /**
     * NSF
     * <p>
     * Lineage reference object : nsfCount
     * 
     */
    @JsonProperty("nsfCount")
    @JsonPropertyDescription("Lineage reference object : nsfCount")
    private Object nsfCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Amount Due
     * <p>
     * Lineage reference object : amountDue
     * 
     */
    @JsonProperty("amountDue")
    public Object getAmountDue() {
        return amountDue;
    }

    /**
     * Amount Due
     * <p>
     * Lineage reference object : amountDue
     * 
     */
    @JsonProperty("amountDue")
    public void setAmountDue(Object amountDue) {
        this.amountDue = amountDue;
    }

    public TbraccdCtrl withAmountDue(Object amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    /**
     * Memo Balance
     * <p>
     * Lineage reference object : memoBalance
     * 
     */
    @JsonProperty("memoBalance")
    public Object getMemoBalance() {
        return memoBalance;
    }

    /**
     * Memo Balance
     * <p>
     * Lineage reference object : memoBalance
     * 
     */
    @JsonProperty("memoBalance")
    public void setMemoBalance(Object memoBalance) {
        this.memoBalance = memoBalance;
    }

    public TbraccdCtrl withMemoBalance(Object memoBalance) {
        this.memoBalance = memoBalance;
        return this;
    }

    /**
     * Query Balance
     * <p>
     * Lineage reference object : queryBalance
     * 
     */
    @JsonProperty("queryBalance")
    public Object getQueryBalance() {
        return queryBalance;
    }

    /**
     * Query Balance
     * <p>
     * Lineage reference object : queryBalance
     * 
     */
    @JsonProperty("queryBalance")
    public void setQueryBalance(Object queryBalance) {
        this.queryBalance = queryBalance;
    }

    public TbraccdCtrl withQueryBalance(Object queryBalance) {
        this.queryBalance = queryBalance;
        return this;
    }

    /**
     * Authorized Aid Balance
     * <p>
     * Lineage reference object : authAidBalance
     * 
     */
    @JsonProperty("authAidBalance")
    public Object getAuthAidBalance() {
        return authAidBalance;
    }

    /**
     * Authorized Aid Balance
     * <p>
     * Lineage reference object : authAidBalance
     * 
     */
    @JsonProperty("authAidBalance")
    public void setAuthAidBalance(Object authAidBalance) {
        this.authAidBalance = authAidBalance;
    }

    public TbraccdCtrl withAuthAidBalance(Object authAidBalance) {
        this.authAidBalance = authAidBalance;
        return this;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : accountBalance
     * 
     */
    @JsonProperty("accountBalance")
    public Object getAccountBalance() {
        return accountBalance;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : accountBalance
     * 
     */
    @JsonProperty("accountBalance")
    public void setAccountBalance(Object accountBalance) {
        this.accountBalance = accountBalance;
    }

    public TbraccdCtrl withAccountBalance(Object accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    /**
     * NSF
     * <p>
     * Lineage reference object : nsfCount
     * 
     */
    @JsonProperty("nsfCount")
    public Object getNsfCount() {
        return nsfCount;
    }

    /**
     * NSF
     * <p>
     * Lineage reference object : nsfCount
     * 
     */
    @JsonProperty("nsfCount")
    public void setNsfCount(Object nsfCount) {
        this.nsfCount = nsfCount;
    }

    public TbraccdCtrl withNsfCount(Object nsfCount) {
        this.nsfCount = nsfCount;
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

    public TbraccdCtrl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TbraccdCtrl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amountDue");
        sb.append('=');
        sb.append(((this.amountDue == null)?"<null>":this.amountDue));
        sb.append(',');
        sb.append("memoBalance");
        sb.append('=');
        sb.append(((this.memoBalance == null)?"<null>":this.memoBalance));
        sb.append(',');
        sb.append("queryBalance");
        sb.append('=');
        sb.append(((this.queryBalance == null)?"<null>":this.queryBalance));
        sb.append(',');
        sb.append("authAidBalance");
        sb.append('=');
        sb.append(((this.authAidBalance == null)?"<null>":this.authAidBalance));
        sb.append(',');
        sb.append("accountBalance");
        sb.append('=');
        sb.append(((this.accountBalance == null)?"<null>":this.accountBalance));
        sb.append(',');
        sb.append("nsfCount");
        sb.append('=');
        sb.append(((this.nsfCount == null)?"<null>":this.nsfCount));
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
        result = ((result* 31)+((this.amountDue == null)? 0 :this.amountDue.hashCode()));
        result = ((result* 31)+((this.memoBalance == null)? 0 :this.memoBalance.hashCode()));
        result = ((result* 31)+((this.queryBalance == null)? 0 :this.queryBalance.hashCode()));
        result = ((result* 31)+((this.authAidBalance == null)? 0 :this.authAidBalance.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accountBalance == null)? 0 :this.accountBalance.hashCode()));
        result = ((result* 31)+((this.nsfCount == null)? 0 :this.nsfCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TbraccdCtrl) == false) {
            return false;
        }
        TbraccdCtrl rhs = ((TbraccdCtrl) other);
        return ((((((((this.amountDue == rhs.amountDue)||((this.amountDue!= null)&&this.amountDue.equals(rhs.amountDue)))&&((this.memoBalance == rhs.memoBalance)||((this.memoBalance!= null)&&this.memoBalance.equals(rhs.memoBalance))))&&((this.queryBalance == rhs.queryBalance)||((this.queryBalance!= null)&&this.queryBalance.equals(rhs.queryBalance))))&&((this.authAidBalance == rhs.authAidBalance)||((this.authAidBalance!= null)&&this.authAidBalance.equals(rhs.authAidBalance))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accountBalance == rhs.accountBalance)||((this.accountBalance!= null)&&this.accountBalance.equals(rhs.accountBalance))))&&((this.nsfCount == rhs.nsfCount)||((this.nsfCount!= null)&&this.nsfCount.equals(rhs.nsfCount))));
    }

}
