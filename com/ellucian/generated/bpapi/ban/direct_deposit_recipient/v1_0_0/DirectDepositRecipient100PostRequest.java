
package com.ellucian.generated.bpapi.ban.direct_deposit_recipient.v1_0_0;

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
    "bankAcctNum",
    "apInd",
    "id",
    "bankRoutNum",
    "atypCode"
})
@Generated("jsonschema2pojo")
public class DirectDepositRecipient100PostRequest {

    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("bankAcctNum")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_BANK_ACCT_NUM")
    private String bankAcctNum;
    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("apInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_AP_IND")
    private String apInd;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("bankRoutNum")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_BANK_ROUT_NUM")
    private String bankRoutNum;
    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ATYP_CODE")
    private String atypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("bankAcctNum")
    public String getBankAcctNum() {
        return bankAcctNum;
    }

    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("bankAcctNum")
    public void setBankAcctNum(String bankAcctNum) {
        this.bankAcctNum = bankAcctNum;
    }

    public DirectDepositRecipient100PostRequest withBankAcctNum(String bankAcctNum) {
        this.bankAcctNum = bankAcctNum;
        return this;
    }

    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("apInd")
    public String getApInd() {
        return apInd;
    }

    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("apInd")
    public void setApInd(String apInd) {
        this.apInd = apInd;
    }

    public DirectDepositRecipient100PostRequest withApInd(String apInd) {
        this.apInd = apInd;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public DirectDepositRecipient100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("bankRoutNum")
    public String getBankRoutNum() {
        return bankRoutNum;
    }

    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("bankRoutNum")
    public void setBankRoutNum(String bankRoutNum) {
        this.bankRoutNum = bankRoutNum;
    }

    public DirectDepositRecipient100PostRequest withBankRoutNum(String bankRoutNum) {
        this.bankRoutNum = bankRoutNum;
        return this;
    }

    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public DirectDepositRecipient100PostRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
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

    public DirectDepositRecipient100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DirectDepositRecipient100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bankAcctNum");
        sb.append('=');
        sb.append(((this.bankAcctNum == null)?"<null>":this.bankAcctNum));
        sb.append(',');
        sb.append("apInd");
        sb.append('=');
        sb.append(((this.apInd == null)?"<null>":this.apInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("bankRoutNum");
        sb.append('=');
        sb.append(((this.bankRoutNum == null)?"<null>":this.bankRoutNum));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
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
        result = ((result* 31)+((this.bankAcctNum == null)? 0 :this.bankAcctNum.hashCode()));
        result = ((result* 31)+((this.apInd == null)? 0 :this.apInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.bankRoutNum == null)? 0 :this.bankRoutNum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectDepositRecipient100PostRequest) == false) {
            return false;
        }
        DirectDepositRecipient100PostRequest rhs = ((DirectDepositRecipient100PostRequest) other);
        return (((((((this.bankAcctNum == rhs.bankAcctNum)||((this.bankAcctNum!= null)&&this.bankAcctNum.equals(rhs.bankAcctNum)))&&((this.apInd == rhs.apInd)||((this.apInd!= null)&&this.apInd.equals(rhs.apInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.bankRoutNum == rhs.bankRoutNum)||((this.bankRoutNum!= null)&&this.bankRoutNum.equals(rhs.bankRoutNum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
