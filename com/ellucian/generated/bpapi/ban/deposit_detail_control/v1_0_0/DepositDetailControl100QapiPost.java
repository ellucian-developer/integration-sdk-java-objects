
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
    "detailCodeDeposit",
    "detcDescription",
    "detailCodePayment",
    "autoReleaseInd",
    "minAmount",
    "dtypCode",
    "releaseDate",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class DepositDetailControl100QapiPost {

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCodeDeposit")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc")
    private String detailCodeDeposit;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detcDescription")
    private String detcDescription;
    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCodePayment")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc")
    private String detailCodePayment;
    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
     * 
     */
    @JsonProperty("autoReleaseInd")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_AUTO_RELEASE_IND")
    private String autoReleaseInd;
    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBBDEPC_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_MIN_AMOUNT")
    private Double minAmount;
    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPC_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("dtypCode")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_DTYP_CODE, Lookup lineage reference object : ttvdtyp")
    private String dtypCode;
    /**
     * Release Date
     * <p>
     * Lineage reference object : TBBDEPC_RELEASE_DATE
     * 
     */
    @JsonProperty("releaseDate")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_RELEASE_DATE")
    private Date releaseDate;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBBDEPC_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("Lineage reference object : TBBDEPC_EXPIRATION_DATE")
    private Date expirationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Deposit Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_DEPOSIT, Lookup lineage reference object : tbbdetc
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
     * 
     */
    @JsonProperty("detailCodeDeposit")
    public void setDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
    }

    public DepositDetailControl100QapiPost withDetailCodeDeposit(String detailCodeDeposit) {
        this.detailCodeDeposit = detailCodeDeposit;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detcDescription")
    public String getDetcDescription() {
        return detcDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("detcDescription")
    public void setDetcDescription(String detcDescription) {
        this.detcDescription = detcDescription;
    }

    public DepositDetailControl100QapiPost withDetcDescription(String detcDescription) {
        this.detcDescription = detcDescription;
        return this;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCodePayment")
    public String getDetailCodePayment() {
        return detailCodePayment;
    }

    /**
     * Payment Code
     * <p>
     * Lineage reference object : TBBDEPC_DETAIL_CODE_PAYMENT, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailCodePayment")
    public void setDetailCodePayment(String detailCodePayment) {
        this.detailCodePayment = detailCodePayment;
    }

    public DepositDetailControl100QapiPost withDetailCodePayment(String detailCodePayment) {
        this.detailCodePayment = detailCodePayment;
        return this;
    }

    /**
     * Auto Release
     * <p>
     * Lineage reference object : TBBDEPC_AUTO_RELEASE_IND
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
     * 
     */
    @JsonProperty("autoReleaseInd")
    public void setAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
    }

    public DepositDetailControl100QapiPost withAutoReleaseInd(String autoReleaseInd) {
        this.autoReleaseInd = autoReleaseInd;
        return this;
    }

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBBDEPC_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public Double getMinAmount() {
        return minAmount;
    }

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBBDEPC_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public DepositDetailControl100QapiPost withMinAmount(Double minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPC_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("dtypCode")
    public String getDtypCode() {
        return dtypCode;
    }

    /**
     * Deposit Type
     * <p>
     * Lineage reference object : TBBDEPC_DTYP_CODE, Lookup lineage reference object : ttvdtyp
     * 
     */
    @JsonProperty("dtypCode")
    public void setDtypCode(String dtypCode) {
        this.dtypCode = dtypCode;
    }

    public DepositDetailControl100QapiPost withDtypCode(String dtypCode) {
        this.dtypCode = dtypCode;
        return this;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBBDEPC_RELEASE_DATE
     * 
     */
    @JsonProperty("releaseDate")
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * Release Date
     * <p>
     * Lineage reference object : TBBDEPC_RELEASE_DATE
     * 
     */
    @JsonProperty("releaseDate")
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public DepositDetailControl100QapiPost withReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBBDEPC_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBBDEPC_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public DepositDetailControl100QapiPost withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public DepositDetailControl100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DepositDetailControl100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailCodeDeposit");
        sb.append('=');
        sb.append(((this.detailCodeDeposit == null)?"<null>":this.detailCodeDeposit));
        sb.append(',');
        sb.append("detcDescription");
        sb.append('=');
        sb.append(((this.detcDescription == null)?"<null>":this.detcDescription));
        sb.append(',');
        sb.append("detailCodePayment");
        sb.append('=');
        sb.append(((this.detailCodePayment == null)?"<null>":this.detailCodePayment));
        sb.append(',');
        sb.append("autoReleaseInd");
        sb.append('=');
        sb.append(((this.autoReleaseInd == null)?"<null>":this.autoReleaseInd));
        sb.append(',');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("dtypCode");
        sb.append('=');
        sb.append(((this.dtypCode == null)?"<null>":this.dtypCode));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
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
        result = ((result* 31)+((this.minAmount == null)? 0 :this.minAmount.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.dtypCode == null)? 0 :this.dtypCode.hashCode()));
        result = ((result* 31)+((this.detcDescription == null)? 0 :this.detcDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.detailCodePayment == null)? 0 :this.detailCodePayment.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepositDetailControl100QapiPost) == false) {
            return false;
        }
        DepositDetailControl100QapiPost rhs = ((DepositDetailControl100QapiPost) other);
        return ((((((((((this.detailCodeDeposit == rhs.detailCodeDeposit)||((this.detailCodeDeposit!= null)&&this.detailCodeDeposit.equals(rhs.detailCodeDeposit)))&&((this.autoReleaseInd == rhs.autoReleaseInd)||((this.autoReleaseInd!= null)&&this.autoReleaseInd.equals(rhs.autoReleaseInd))))&&((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.dtypCode == rhs.dtypCode)||((this.dtypCode!= null)&&this.dtypCode.equals(rhs.dtypCode))))&&((this.detcDescription == rhs.detcDescription)||((this.detcDescription!= null)&&this.detcDescription.equals(rhs.detcDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCodePayment == rhs.detailCodePayment)||((this.detailCodePayment!= null)&&this.detailCodePayment.equals(rhs.detailCodePayment))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
