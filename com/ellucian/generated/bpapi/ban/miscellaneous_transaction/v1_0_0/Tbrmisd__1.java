
package com.ellucian.generated.bpapi.ban.miscellaneous_transaction.v1_0_0;

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
    "amount",
    "currCode",
    "workCoas",
    "workOrgn",
    "workRuclCode",
    "workAcct",
    "foreignAmount",
    "workDetailCode",
    "workLocn",
    "workAcci",
    "merchantId",
    "paymentId",
    "workAccount",
    "workProg",
    "workFund",
    "drCrInd",
    "desc",
    "workActv"
})
@Generated("jsonschema2pojo")
public class Tbrmisd__1 {

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMISD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_AMOUNT")
    private Double amount;
    /**
     * Currency Code
     * <p>
     * Lineage reference object : TBRMISD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_CURR_CODE, Lookup lineage reference object : gtvcurr")
    private String currCode;
    /**
     * COA
     * <p>
     * 
     * 
     */
    @JsonProperty("workCoas")
    private String workCoas;
    /**
     * Organization
     * <p>
     * 
     * 
     */
    @JsonProperty("workOrgn")
    private String workOrgn;
    /**
     * Rule Class
     * <p>
     * 
     * 
     */
    @JsonProperty("workRuclCode")
    private String workRuclCode;
    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("workAcct")
    private String workAcct;
    /**
     * Currency Amount
     * <p>
     * Lineage reference object : TBRMISD_FOREIGN_AMOUNT
     * 
     */
    @JsonProperty("foreignAmount")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_FOREIGN_AMOUNT")
    private Double foreignAmount;
    /**
     * Detail Code
     * <p>
     * Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("workDetailCode")
    @JsonPropertyDescription("Lookup lineage reference object : tbbdetc")
    private String workDetailCode;
    /**
     * Location
     * <p>
     * 
     * 
     */
    @JsonProperty("workLocn")
    private String workLocn;
    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("workAcci")
    private String workAcci;
    /**
     * Merchant ID
     * <p>
     * Lineage reference object : TBRMISD_MERCHANT_ID
     * 
     */
    @JsonProperty("merchantId")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_MERCHANT_ID")
    private String merchantId;
    /**
     * Payment Number
     * <p>
     * Lineage reference object : TBRMISD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_PAYMENT_ID")
    private String paymentId;
    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("workAccount")
    private String workAccount;
    /**
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("workProg")
    private String workProg;
    /**
     * Fund
     * <p>
     * 
     * 
     */
    @JsonProperty("workFund")
    private String workFund;
    /**
     * Debit or Credit
     * <p>
     * Lineage reference object : TBRMISD_DR_CR_IND
     * (Required)
     * 
     */
    @JsonProperty("drCrInd")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_DR_CR_IND")
    private String drCrInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TBRMISD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRMISD_DESC")
    private String desc;
    /**
     * Activity
     * <p>
     * 
     * 
     */
    @JsonProperty("workActv")
    private String workActv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMISD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMISD_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Tbrmisd__1 withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Currency Code
     * <p>
     * Lineage reference object : TBRMISD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Currency Code
     * <p>
     * Lineage reference object : TBRMISD_CURR_CODE, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public Tbrmisd__1 withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * COA
     * <p>
     * 
     * 
     */
    @JsonProperty("workCoas")
    public String getWorkCoas() {
        return workCoas;
    }

    /**
     * COA
     * <p>
     * 
     * 
     */
    @JsonProperty("workCoas")
    public void setWorkCoas(String workCoas) {
        this.workCoas = workCoas;
    }

    public Tbrmisd__1 withWorkCoas(String workCoas) {
        this.workCoas = workCoas;
        return this;
    }

    /**
     * Organization
     * <p>
     * 
     * 
     */
    @JsonProperty("workOrgn")
    public String getWorkOrgn() {
        return workOrgn;
    }

    /**
     * Organization
     * <p>
     * 
     * 
     */
    @JsonProperty("workOrgn")
    public void setWorkOrgn(String workOrgn) {
        this.workOrgn = workOrgn;
    }

    public Tbrmisd__1 withWorkOrgn(String workOrgn) {
        this.workOrgn = workOrgn;
        return this;
    }

    /**
     * Rule Class
     * <p>
     * 
     * 
     */
    @JsonProperty("workRuclCode")
    public String getWorkRuclCode() {
        return workRuclCode;
    }

    /**
     * Rule Class
     * <p>
     * 
     * 
     */
    @JsonProperty("workRuclCode")
    public void setWorkRuclCode(String workRuclCode) {
        this.workRuclCode = workRuclCode;
    }

    public Tbrmisd__1 withWorkRuclCode(String workRuclCode) {
        this.workRuclCode = workRuclCode;
        return this;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("workAcct")
    public String getWorkAcct() {
        return workAcct;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("workAcct")
    public void setWorkAcct(String workAcct) {
        this.workAcct = workAcct;
    }

    public Tbrmisd__1 withWorkAcct(String workAcct) {
        this.workAcct = workAcct;
        return this;
    }

    /**
     * Currency Amount
     * <p>
     * Lineage reference object : TBRMISD_FOREIGN_AMOUNT
     * 
     */
    @JsonProperty("foreignAmount")
    public Double getForeignAmount() {
        return foreignAmount;
    }

    /**
     * Currency Amount
     * <p>
     * Lineage reference object : TBRMISD_FOREIGN_AMOUNT
     * 
     */
    @JsonProperty("foreignAmount")
    public void setForeignAmount(Double foreignAmount) {
        this.foreignAmount = foreignAmount;
    }

    public Tbrmisd__1 withForeignAmount(Double foreignAmount) {
        this.foreignAmount = foreignAmount;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("workDetailCode")
    public String getWorkDetailCode() {
        return workDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("workDetailCode")
    public void setWorkDetailCode(String workDetailCode) {
        this.workDetailCode = workDetailCode;
    }

    public Tbrmisd__1 withWorkDetailCode(String workDetailCode) {
        this.workDetailCode = workDetailCode;
        return this;
    }

    /**
     * Location
     * <p>
     * 
     * 
     */
    @JsonProperty("workLocn")
    public String getWorkLocn() {
        return workLocn;
    }

    /**
     * Location
     * <p>
     * 
     * 
     */
    @JsonProperty("workLocn")
    public void setWorkLocn(String workLocn) {
        this.workLocn = workLocn;
    }

    public Tbrmisd__1 withWorkLocn(String workLocn) {
        this.workLocn = workLocn;
        return this;
    }

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("workAcci")
    public String getWorkAcci() {
        return workAcci;
    }

    /**
     * Index
     * <p>
     * 
     * 
     */
    @JsonProperty("workAcci")
    public void setWorkAcci(String workAcci) {
        this.workAcci = workAcci;
    }

    public Tbrmisd__1 withWorkAcci(String workAcci) {
        this.workAcci = workAcci;
        return this;
    }

    /**
     * Merchant ID
     * <p>
     * Lineage reference object : TBRMISD_MERCHANT_ID
     * 
     */
    @JsonProperty("merchantId")
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Merchant ID
     * <p>
     * Lineage reference object : TBRMISD_MERCHANT_ID
     * 
     */
    @JsonProperty("merchantId")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Tbrmisd__1 withMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    /**
     * Payment Number
     * <p>
     * Lineage reference object : TBRMISD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Payment Number
     * <p>
     * Lineage reference object : TBRMISD_PAYMENT_ID
     * 
     */
    @JsonProperty("paymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Tbrmisd__1 withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("workAccount")
    public String getWorkAccount() {
        return workAccount;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("workAccount")
    public void setWorkAccount(String workAccount) {
        this.workAccount = workAccount;
    }

    public Tbrmisd__1 withWorkAccount(String workAccount) {
        this.workAccount = workAccount;
        return this;
    }

    /**
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("workProg")
    public String getWorkProg() {
        return workProg;
    }

    /**
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("workProg")
    public void setWorkProg(String workProg) {
        this.workProg = workProg;
    }

    public Tbrmisd__1 withWorkProg(String workProg) {
        this.workProg = workProg;
        return this;
    }

    /**
     * Fund
     * <p>
     * 
     * 
     */
    @JsonProperty("workFund")
    public String getWorkFund() {
        return workFund;
    }

    /**
     * Fund
     * <p>
     * 
     * 
     */
    @JsonProperty("workFund")
    public void setWorkFund(String workFund) {
        this.workFund = workFund;
    }

    public Tbrmisd__1 withWorkFund(String workFund) {
        this.workFund = workFund;
        return this;
    }

    /**
     * Debit or Credit
     * <p>
     * Lineage reference object : TBRMISD_DR_CR_IND
     * (Required)
     * 
     */
    @JsonProperty("drCrInd")
    public String getDrCrInd() {
        return drCrInd;
    }

    /**
     * Debit or Credit
     * <p>
     * Lineage reference object : TBRMISD_DR_CR_IND
     * (Required)
     * 
     */
    @JsonProperty("drCrInd")
    public void setDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
    }

    public Tbrmisd__1 withDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBRMISD_DESC
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
     * Lineage reference object : TBRMISD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Tbrmisd__1 withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Activity
     * <p>
     * 
     * 
     */
    @JsonProperty("workActv")
    public String getWorkActv() {
        return workActv;
    }

    /**
     * Activity
     * <p>
     * 
     * 
     */
    @JsonProperty("workActv")
    public void setWorkActv(String workActv) {
        this.workActv = workActv;
    }

    public Tbrmisd__1 withWorkActv(String workActv) {
        this.workActv = workActv;
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

    public Tbrmisd__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbrmisd__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("workCoas");
        sb.append('=');
        sb.append(((this.workCoas == null)?"<null>":this.workCoas));
        sb.append(',');
        sb.append("workOrgn");
        sb.append('=');
        sb.append(((this.workOrgn == null)?"<null>":this.workOrgn));
        sb.append(',');
        sb.append("workRuclCode");
        sb.append('=');
        sb.append(((this.workRuclCode == null)?"<null>":this.workRuclCode));
        sb.append(',');
        sb.append("workAcct");
        sb.append('=');
        sb.append(((this.workAcct == null)?"<null>":this.workAcct));
        sb.append(',');
        sb.append("foreignAmount");
        sb.append('=');
        sb.append(((this.foreignAmount == null)?"<null>":this.foreignAmount));
        sb.append(',');
        sb.append("workDetailCode");
        sb.append('=');
        sb.append(((this.workDetailCode == null)?"<null>":this.workDetailCode));
        sb.append(',');
        sb.append("workLocn");
        sb.append('=');
        sb.append(((this.workLocn == null)?"<null>":this.workLocn));
        sb.append(',');
        sb.append("workAcci");
        sb.append('=');
        sb.append(((this.workAcci == null)?"<null>":this.workAcci));
        sb.append(',');
        sb.append("merchantId");
        sb.append('=');
        sb.append(((this.merchantId == null)?"<null>":this.merchantId));
        sb.append(',');
        sb.append("paymentId");
        sb.append('=');
        sb.append(((this.paymentId == null)?"<null>":this.paymentId));
        sb.append(',');
        sb.append("workAccount");
        sb.append('=');
        sb.append(((this.workAccount == null)?"<null>":this.workAccount));
        sb.append(',');
        sb.append("workProg");
        sb.append('=');
        sb.append(((this.workProg == null)?"<null>":this.workProg));
        sb.append(',');
        sb.append("workFund");
        sb.append('=');
        sb.append(((this.workFund == null)?"<null>":this.workFund));
        sb.append(',');
        sb.append("drCrInd");
        sb.append('=');
        sb.append(((this.drCrInd == null)?"<null>":this.drCrInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("workActv");
        sb.append('=');
        sb.append(((this.workActv == null)?"<null>":this.workActv));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.workCoas == null)? 0 :this.workCoas.hashCode()));
        result = ((result* 31)+((this.workOrgn == null)? 0 :this.workOrgn.hashCode()));
        result = ((result* 31)+((this.workRuclCode == null)? 0 :this.workRuclCode.hashCode()));
        result = ((result* 31)+((this.workAcct == null)? 0 :this.workAcct.hashCode()));
        result = ((result* 31)+((this.foreignAmount == null)? 0 :this.foreignAmount.hashCode()));
        result = ((result* 31)+((this.workDetailCode == null)? 0 :this.workDetailCode.hashCode()));
        result = ((result* 31)+((this.workLocn == null)? 0 :this.workLocn.hashCode()));
        result = ((result* 31)+((this.workAcci == null)? 0 :this.workAcci.hashCode()));
        result = ((result* 31)+((this.merchantId == null)? 0 :this.merchantId.hashCode()));
        result = ((result* 31)+((this.paymentId == null)? 0 :this.paymentId.hashCode()));
        result = ((result* 31)+((this.workAccount == null)? 0 :this.workAccount.hashCode()));
        result = ((result* 31)+((this.workProg == null)? 0 :this.workProg.hashCode()));
        result = ((result* 31)+((this.workFund == null)? 0 :this.workFund.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.workActv == null)? 0 :this.workActv.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbrmisd__1) == false) {
            return false;
        }
        Tbrmisd__1 rhs = ((Tbrmisd__1) other);
        return ((((((((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.workCoas == rhs.workCoas)||((this.workCoas!= null)&&this.workCoas.equals(rhs.workCoas))))&&((this.workOrgn == rhs.workOrgn)||((this.workOrgn!= null)&&this.workOrgn.equals(rhs.workOrgn))))&&((this.workRuclCode == rhs.workRuclCode)||((this.workRuclCode!= null)&&this.workRuclCode.equals(rhs.workRuclCode))))&&((this.workAcct == rhs.workAcct)||((this.workAcct!= null)&&this.workAcct.equals(rhs.workAcct))))&&((this.foreignAmount == rhs.foreignAmount)||((this.foreignAmount!= null)&&this.foreignAmount.equals(rhs.foreignAmount))))&&((this.workDetailCode == rhs.workDetailCode)||((this.workDetailCode!= null)&&this.workDetailCode.equals(rhs.workDetailCode))))&&((this.workLocn == rhs.workLocn)||((this.workLocn!= null)&&this.workLocn.equals(rhs.workLocn))))&&((this.workAcci == rhs.workAcci)||((this.workAcci!= null)&&this.workAcci.equals(rhs.workAcci))))&&((this.merchantId == rhs.merchantId)||((this.merchantId!= null)&&this.merchantId.equals(rhs.merchantId))))&&((this.paymentId == rhs.paymentId)||((this.paymentId!= null)&&this.paymentId.equals(rhs.paymentId))))&&((this.workAccount == rhs.workAccount)||((this.workAccount!= null)&&this.workAccount.equals(rhs.workAccount))))&&((this.workProg == rhs.workProg)||((this.workProg!= null)&&this.workProg.equals(rhs.workProg))))&&((this.workFund == rhs.workFund)||((this.workFund!= null)&&this.workFund.equals(rhs.workFund))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.workActv == rhs.workActv)||((this.workActv!= null)&&this.workActv.equals(rhs.workActv))));
    }

}
