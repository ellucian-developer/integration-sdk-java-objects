
package com.ellucian.generated.bpapi.ban.deposit_detail_control.v1_0_0;

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
    "criteria.detailCodeDeposit",
    "criteria.minAmount",
    "detailCodeDeposit",
    "autoReleaseInd",
    "criteria.expirationDate",
    "criteria.autoReleaseInd",
    "criteria.dtypCode",
    "criteria.releaseDate",
    "criteria.detcDescription",
    "criteria.detailCodePayment"
})
@Generated("jsonschema2pojo")
public class DepositDetailControl100PutRequest {

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCodeDeposit")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc")
    private String criteriaDetailCodeDeposit;
    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBBDEPC_MIN_AMOUNT
     * 
     */
    @JsonProperty("criteria.minAmount")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_MIN_AMOUNT")
    private Double criteriaMinAmount;
    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDeposit")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc")
    private String detailCodeDeposit;
    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_AUTO_RELEASE_IND")
    private String autoReleaseInd;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBBDEPC_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_EXPIRATION_DATE")
    private Date criteriaExpirationDate;
    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.autoReleaseInd")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_AUTO_RELEASE_IND")
    private String criteriaAutoReleaseInd;
    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPC_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("criteria.dtypCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_DTYP_CODE, Lookup lineage reference object : ttvdtyp")
    private String criteriaDtypCode;
    /**
     * Release Date
     * <p>
     * Lineage reference object : TBBDEPC_RELEASE_DATE
     * 
     */
    @JsonProperty("criteria.releaseDate")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_RELEASE_DATE")
    private Date criteriaReleaseDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.detcDescription")
    private String criteriaDetcDescription;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("criteria.detailCodePayment")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc")
    private String criteriaDetailCodePayment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCodeDeposit")
    public String getCriteriaDetailCodeDeposit() {
        return criteriaDetailCodeDeposit;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCodeDeposit")
    public void setCriteriaDetailCodeDeposit(String criteriaDetailCodeDeposit) {
        this.criteriaDetailCodeDeposit = criteriaDetailCodeDeposit;
    }

    public DepositDetailControl100PutRequest withCriteriaDetailCodeDeposit(String criteriaDetailCodeDeposit) {
        this.criteriaDetailCodeDeposit = criteriaDetailCodeDeposit;
        return this;
    }

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBBDEPC_MIN_AMOUNT
     * 
     */
    @JsonProperty("criteria.minAmount")
    public Double getCriteriaMinAmount() {
        return criteriaMinAmount;
    }

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBBDEPC_MIN_AMOUNT
     * 
     */
    @JsonProperty("criteria.minAmount")
    public void setCriteriaMinAmount(Double criteriaMinAmount) {
        this.criteriaMinAmount = criteriaMinAmount;
    }

    public DepositDetailControl100PutRequest withCriteriaMinAmount(Double criteriaMinAmount) {
        this.criteriaMinAmount = criteriaMinAmount;
        return this;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDeposit")
    public String getDetailCodeDeposit() {
        return detailCodeDeposit;
    }

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCodeDeposit")
    public void setDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
    }

    public DepositDetailControl100PutRequest withDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
        return this;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    public String getAutoReleaseInd() {
        return autoReleaseInd;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("autoReleaseInd")
    public void setAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
    }

    public DepositDetailControl100PutRequest withAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBBDEPC_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    public Date getCriteriaExpirationDate() {
        return criteriaExpirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBBDEPC_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    public void setCriteriaExpirationDate(Date criteriaExpirationDate) {
        this.criteriaExpirationDate = criteriaExpirationDate;
    }

    public DepositDetailControl100PutRequest withCriteriaExpirationDate(Date criteriaExpirationDate) {
        this.criteriaExpirationDate = criteriaExpirationDate;
        return this;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.autoReleaseInd")
    public String getCriteriaAutoReleaseInd() {
        return criteriaAutoReleaseInd;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.autoReleaseInd")
    public void setCriteriaAutoReleaseInd(String criteriaAutoReleaseInd) {
        this.criteriaAutoReleaseInd = criteriaAutoReleaseInd;
    }

    public DepositDetailControl100PutRequest withCriteriaAutoReleaseInd(String criteriaAutoReleaseInd) {
        this.criteriaAutoReleaseInd = criteriaAutoReleaseInd;
        return this;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPC_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("criteria.dtypCode")
    public String getCriteriaDtypCode() {
        return criteriaDtypCode;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPC_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("criteria.dtypCode")
    public void setCriteriaDtypCode(String criteriaDtypCode) {
        this.criteriaDtypCode = criteriaDtypCode;
    }

    public DepositDetailControl100PutRequest withCriteriaDtypCode(String criteriaDtypCode) {
        this.criteriaDtypCode = criteriaDtypCode;
        return this;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBBDEPC_RELEASE_DATE
     * 
     */
    @JsonProperty("criteria.releaseDate")
    public Date getCriteriaReleaseDate() {
        return criteriaReleaseDate;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBBDEPC_RELEASE_DATE
     * 
     */
    @JsonProperty("criteria.releaseDate")
    public void setCriteriaReleaseDate(Date criteriaReleaseDate) {
        this.criteriaReleaseDate = criteriaReleaseDate;
    }

    public DepositDetailControl100PutRequest withCriteriaReleaseDate(Date criteriaReleaseDate) {
        this.criteriaReleaseDate = criteriaReleaseDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.detcDescription")
    public String getCriteriaDetcDescription() {
        return criteriaDetcDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.detcDescription")
    public void setCriteriaDetcDescription(String criteriaDetcDescription) {
        this.criteriaDetcDescription = criteriaDetcDescription;
    }

    public DepositDetailControl100PutRequest withCriteriaDetcDescription(String criteriaDetcDescription) {
        this.criteriaDetcDescription = criteriaDetcDescription;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("criteria.detailCodePayment")
    public String getCriteriaDetailCodePayment() {
        return criteriaDetailCodePayment;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("criteria.detailCodePayment")
    public void setCriteriaDetailCodePayment(String criteriaDetailCodePayment) {
        this.criteriaDetailCodePayment = criteriaDetailCodePayment;
    }

    public DepositDetailControl100PutRequest withCriteriaDetailCodePayment(String criteriaDetailCodePayment) {
        this.criteriaDetailCodePayment = criteriaDetailCodePayment;
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

    public DepositDetailControl100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DepositDetailControl100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDetailCodeDeposit");
        sb.append('=');
        sb.append(((this.criteriaDetailCodeDeposit == null)?"<null>":this.criteriaDetailCodeDeposit));
        sb.append(',');
        sb.append("criteriaMinAmount");
        sb.append('=');
        sb.append(((this.criteriaMinAmount == null)?"<null>":this.criteriaMinAmount));
        sb.append(',');
        sb.append("detailCodeDeposit");
        sb.append('=');
        sb.append(((this.detailCodeDeposit == null)?"<null>":this.detailCodeDeposit));
        sb.append(',');
        sb.append("autoReleaseInd");
        sb.append('=');
        sb.append(((this.autoReleaseInd == null)?"<null>":this.autoReleaseInd));
        sb.append(',');
        sb.append("criteriaExpirationDate");
        sb.append('=');
        sb.append(((this.criteriaExpirationDate == null)?"<null>":this.criteriaExpirationDate));
        sb.append(',');
        sb.append("criteriaAutoReleaseInd");
        sb.append('=');
        sb.append(((this.criteriaAutoReleaseInd == null)?"<null>":this.criteriaAutoReleaseInd));
        sb.append(',');
        sb.append("criteriaDtypCode");
        sb.append('=');
        sb.append(((this.criteriaDtypCode == null)?"<null>":this.criteriaDtypCode));
        sb.append(',');
        sb.append("criteriaReleaseDate");
        sb.append('=');
        sb.append(((this.criteriaReleaseDate == null)?"<null>":this.criteriaReleaseDate));
        sb.append(',');
        sb.append("criteriaDetcDescription");
        sb.append('=');
        sb.append(((this.criteriaDetcDescription == null)?"<null>":this.criteriaDetcDescription));
        sb.append(',');
        sb.append("criteriaDetailCodePayment");
        sb.append('=');
        sb.append(((this.criteriaDetailCodePayment == null)?"<null>":this.criteriaDetailCodePayment));
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
        result = ((result* 31)+((this.detailCodeDeposit == null)? 0 :this.detailCodeDeposit.hashCode()));
        result = ((result* 31)+((this.autoReleaseInd == null)? 0 :this.autoReleaseInd.hashCode()));
        result = ((result* 31)+((this.criteriaExpirationDate == null)? 0 :this.criteriaExpirationDate.hashCode()));
        result = ((result* 31)+((this.criteriaMinAmount == null)? 0 :this.criteriaMinAmount.hashCode()));
        result = ((result* 31)+((this.criteriaAutoReleaseInd == null)? 0 :this.criteriaAutoReleaseInd.hashCode()));
        result = ((result* 31)+((this.criteriaDtypCode == null)? 0 :this.criteriaDtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCodePayment == null)? 0 :this.criteriaDetailCodePayment.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCodeDeposit == null)? 0 :this.criteriaDetailCodeDeposit.hashCode()));
        result = ((result* 31)+((this.criteriaDetcDescription == null)? 0 :this.criteriaDetcDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaReleaseDate == null)? 0 :this.criteriaReleaseDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepositDetailControl100PutRequest) == false) {
            return false;
        }
        DepositDetailControl100PutRequest rhs = ((DepositDetailControl100PutRequest) other);
        return ((((((((((((this.detailCodeDeposit == rhs.detailCodeDeposit)||((this.detailCodeDeposit!= null)&&this.detailCodeDeposit.equals(rhs.detailCodeDeposit)))&&((this.autoReleaseInd == rhs.autoReleaseInd)||((this.autoReleaseInd!= null)&&this.autoReleaseInd.equals(rhs.autoReleaseInd))))&&((this.criteriaExpirationDate == rhs.criteriaExpirationDate)||((this.criteriaExpirationDate!= null)&&this.criteriaExpirationDate.equals(rhs.criteriaExpirationDate))))&&((this.criteriaMinAmount == rhs.criteriaMinAmount)||((this.criteriaMinAmount!= null)&&this.criteriaMinAmount.equals(rhs.criteriaMinAmount))))&&((this.criteriaAutoReleaseInd == rhs.criteriaAutoReleaseInd)||((this.criteriaAutoReleaseInd!= null)&&this.criteriaAutoReleaseInd.equals(rhs.criteriaAutoReleaseInd))))&&((this.criteriaDtypCode == rhs.criteriaDtypCode)||((this.criteriaDtypCode!= null)&&this.criteriaDtypCode.equals(rhs.criteriaDtypCode))))&&((this.criteriaDetailCodePayment == rhs.criteriaDetailCodePayment)||((this.criteriaDetailCodePayment!= null)&&this.criteriaDetailCodePayment.equals(rhs.criteriaDetailCodePayment))))&&((this.criteriaDetailCodeDeposit == rhs.criteriaDetailCodeDeposit)||((this.criteriaDetailCodeDeposit!= null)&&this.criteriaDetailCodeDeposit.equals(rhs.criteriaDetailCodeDeposit))))&&((this.criteriaDetcDescription == rhs.criteriaDetcDescription)||((this.criteriaDetcDescription!= null)&&this.criteriaDetcDescription.equals(rhs.criteriaDetcDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaReleaseDate == rhs.criteriaReleaseDate)||((this.criteriaReleaseDate!= null)&&this.criteriaReleaseDate.equals(rhs.criteriaReleaseDate))));
    }

}
