
package com.ellucian.generated.bpapi.ban.check_number_validation.v1_0_0;

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
    "bankCode",
    "payeeName",
    "cancelInd",
    "payType",
    "checkNum",
    "checkTypeInd",
    "checkAmt",
    "checkDate"
})
@Generated("jsonschema2pojo")
public class CheckNumberValidation100GetResponse {

    /**
     * Bank
     * Code
     * <p>
     * Lineage reference object : FABCHKS_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    @JsonPropertyDescription("Lineage reference object : FABCHKS_BANK_CODE, Lookup lineage reference object : gxvbank")
    private String bankCode;
    /**
     * Payee Name
     * <p>
     * 
     * 
     */
    @JsonProperty("payeeName")
    private String payeeName;
    /**
     * Cancel
     * Indicator
     * <p>
     * Lineage reference object : FABCHKS_CANCEL_IND
     * 
     */
    @JsonProperty("cancelInd")
    @JsonPropertyDescription("Lineage reference object : FABCHKS_CANCEL_IND")
    private String cancelInd;
    /**
     * Pay
     * Type
     * <p>
     * Lineage reference object : FABCHKS_PAY_TYPE
     * 
     */
    @JsonProperty("payType")
    @JsonPropertyDescription("Lineage reference object : FABCHKS_PAY_TYPE")
    private String payType;
    /**
     * Check  
     * Number
     * <p>
     * Lineage reference object : FABCHKS_CHECK_NUM
     * 
     */
    @JsonProperty("checkNum")
    @JsonPropertyDescription("Lineage reference object : FABCHKS_CHECK_NUM")
    private String checkNum;
    /**
     * Check
     * Type
     * <p>
     * Lineage reference object : FABCHKS_CHECK_TYPE_IND
     * 
     */
    @JsonProperty("checkTypeInd")
    @JsonPropertyDescription("Lineage reference object : FABCHKS_CHECK_TYPE_IND")
    private String checkTypeInd;
    /**
     * Check
     * Amount
     * <p>
     * Lineage reference object : FABCHKS_CHECK_AMT
     * 
     */
    @JsonProperty("checkAmt")
    @JsonPropertyDescription("Lineage reference object : FABCHKS_CHECK_AMT")
    private Double checkAmt;
    /**
     * Check
     * Date
     * <p>
     * Lineage reference object : FABCHKS_CHECK_DATE
     * 
     */
    @JsonProperty("checkDate")
    @JsonPropertyDescription("Lineage reference object : FABCHKS_CHECK_DATE")
    private Date checkDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Bank
     * Code
     * <p>
     * Lineage reference object : FABCHKS_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Bank
     * Code
     * <p>
     * Lineage reference object : FABCHKS_BANK_CODE, Lookup lineage reference object : gxvbank
     * 
     */
    @JsonProperty("bankCode")
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public CheckNumberValidation100GetResponse withBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    /**
     * Payee Name
     * <p>
     * 
     * 
     */
    @JsonProperty("payeeName")
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Payee Name
     * <p>
     * 
     * 
     */
    @JsonProperty("payeeName")
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public CheckNumberValidation100GetResponse withPayeeName(String payeeName) {
        this.payeeName = payeeName;
        return this;
    }

    /**
     * Cancel
     * Indicator
     * <p>
     * Lineage reference object : FABCHKS_CANCEL_IND
     * 
     */
    @JsonProperty("cancelInd")
    public String getCancelInd() {
        return cancelInd;
    }

    /**
     * Cancel
     * Indicator
     * <p>
     * Lineage reference object : FABCHKS_CANCEL_IND
     * 
     */
    @JsonProperty("cancelInd")
    public void setCancelInd(String cancelInd) {
        this.cancelInd = cancelInd;
    }

    public CheckNumberValidation100GetResponse withCancelInd(String cancelInd) {
        this.cancelInd = cancelInd;
        return this;
    }

    /**
     * Pay
     * Type
     * <p>
     * Lineage reference object : FABCHKS_PAY_TYPE
     * 
     */
    @JsonProperty("payType")
    public String getPayType() {
        return payType;
    }

    /**
     * Pay
     * Type
     * <p>
     * Lineage reference object : FABCHKS_PAY_TYPE
     * 
     */
    @JsonProperty("payType")
    public void setPayType(String payType) {
        this.payType = payType;
    }

    public CheckNumberValidation100GetResponse withPayType(String payType) {
        this.payType = payType;
        return this;
    }

    /**
     * Check  
     * Number
     * <p>
     * Lineage reference object : FABCHKS_CHECK_NUM
     * 
     */
    @JsonProperty("checkNum")
    public String getCheckNum() {
        return checkNum;
    }

    /**
     * Check  
     * Number
     * <p>
     * Lineage reference object : FABCHKS_CHECK_NUM
     * 
     */
    @JsonProperty("checkNum")
    public void setCheckNum(String checkNum) {
        this.checkNum = checkNum;
    }

    public CheckNumberValidation100GetResponse withCheckNum(String checkNum) {
        this.checkNum = checkNum;
        return this;
    }

    /**
     * Check
     * Type
     * <p>
     * Lineage reference object : FABCHKS_CHECK_TYPE_IND
     * 
     */
    @JsonProperty("checkTypeInd")
    public String getCheckTypeInd() {
        return checkTypeInd;
    }

    /**
     * Check
     * Type
     * <p>
     * Lineage reference object : FABCHKS_CHECK_TYPE_IND
     * 
     */
    @JsonProperty("checkTypeInd")
    public void setCheckTypeInd(String checkTypeInd) {
        this.checkTypeInd = checkTypeInd;
    }

    public CheckNumberValidation100GetResponse withCheckTypeInd(String checkTypeInd) {
        this.checkTypeInd = checkTypeInd;
        return this;
    }

    /**
     * Check
     * Amount
     * <p>
     * Lineage reference object : FABCHKS_CHECK_AMT
     * 
     */
    @JsonProperty("checkAmt")
    public Double getCheckAmt() {
        return checkAmt;
    }

    /**
     * Check
     * Amount
     * <p>
     * Lineage reference object : FABCHKS_CHECK_AMT
     * 
     */
    @JsonProperty("checkAmt")
    public void setCheckAmt(Double checkAmt) {
        this.checkAmt = checkAmt;
    }

    public CheckNumberValidation100GetResponse withCheckAmt(Double checkAmt) {
        this.checkAmt = checkAmt;
        return this;
    }

    /**
     * Check
     * Date
     * <p>
     * Lineage reference object : FABCHKS_CHECK_DATE
     * 
     */
    @JsonProperty("checkDate")
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * Check
     * Date
     * <p>
     * Lineage reference object : FABCHKS_CHECK_DATE
     * 
     */
    @JsonProperty("checkDate")
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public CheckNumberValidation100GetResponse withCheckDate(Date checkDate) {
        this.checkDate = checkDate;
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

    public CheckNumberValidation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CheckNumberValidation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bankCode");
        sb.append('=');
        sb.append(((this.bankCode == null)?"<null>":this.bankCode));
        sb.append(',');
        sb.append("payeeName");
        sb.append('=');
        sb.append(((this.payeeName == null)?"<null>":this.payeeName));
        sb.append(',');
        sb.append("cancelInd");
        sb.append('=');
        sb.append(((this.cancelInd == null)?"<null>":this.cancelInd));
        sb.append(',');
        sb.append("payType");
        sb.append('=');
        sb.append(((this.payType == null)?"<null>":this.payType));
        sb.append(',');
        sb.append("checkNum");
        sb.append('=');
        sb.append(((this.checkNum == null)?"<null>":this.checkNum));
        sb.append(',');
        sb.append("checkTypeInd");
        sb.append('=');
        sb.append(((this.checkTypeInd == null)?"<null>":this.checkTypeInd));
        sb.append(',');
        sb.append("checkAmt");
        sb.append('=');
        sb.append(((this.checkAmt == null)?"<null>":this.checkAmt));
        sb.append(',');
        sb.append("checkDate");
        sb.append('=');
        sb.append(((this.checkDate == null)?"<null>":this.checkDate));
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
        result = ((result* 31)+((this.bankCode == null)? 0 :this.bankCode.hashCode()));
        result = ((result* 31)+((this.payeeName == null)? 0 :this.payeeName.hashCode()));
        result = ((result* 31)+((this.cancelInd == null)? 0 :this.cancelInd.hashCode()));
        result = ((result* 31)+((this.payType == null)? 0 :this.payType.hashCode()));
        result = ((result* 31)+((this.checkNum == null)? 0 :this.checkNum.hashCode()));
        result = ((result* 31)+((this.checkTypeInd == null)? 0 :this.checkTypeInd.hashCode()));
        result = ((result* 31)+((this.checkAmt == null)? 0 :this.checkAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.checkDate == null)? 0 :this.checkDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckNumberValidation100GetResponse) == false) {
            return false;
        }
        CheckNumberValidation100GetResponse rhs = ((CheckNumberValidation100GetResponse) other);
        return ((((((((((this.bankCode == rhs.bankCode)||((this.bankCode!= null)&&this.bankCode.equals(rhs.bankCode)))&&((this.payeeName == rhs.payeeName)||((this.payeeName!= null)&&this.payeeName.equals(rhs.payeeName))))&&((this.cancelInd == rhs.cancelInd)||((this.cancelInd!= null)&&this.cancelInd.equals(rhs.cancelInd))))&&((this.payType == rhs.payType)||((this.payType!= null)&&this.payType.equals(rhs.payType))))&&((this.checkNum == rhs.checkNum)||((this.checkNum!= null)&&this.checkNum.equals(rhs.checkNum))))&&((this.checkTypeInd == rhs.checkTypeInd)||((this.checkTypeInd!= null)&&this.checkTypeInd.equals(rhs.checkTypeInd))))&&((this.checkAmt == rhs.checkAmt)||((this.checkAmt!= null)&&this.checkAmt.equals(rhs.checkAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.checkDate == rhs.checkDate)||((this.checkDate!= null)&&this.checkDate.equals(rhs.checkDate))));
    }

}
