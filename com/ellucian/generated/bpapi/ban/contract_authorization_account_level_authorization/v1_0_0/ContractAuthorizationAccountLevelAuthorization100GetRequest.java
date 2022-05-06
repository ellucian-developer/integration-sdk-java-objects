
package com.ellucian.generated.bpapi.ban.contract_authorization_account_level_authorization.v1_0_0;

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
    "minAmount",
    "srceCode",
    "keyblocTermCode",
    "contractNumber",
    "id",
    "maxAmount",
    "percent",
    "accPriority"
})
@Generated("jsonschema2pojo")
public class ContractAuthorizationAccountLevelAuthorization100GetRequest {

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBRCACC_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    @JsonPropertyDescription("Lineage reference object : TBRCACC_MIN_AMOUNT")
    private Double minAmount;
    /**
     * Source
     * <p>
     * Lineage reference object : TBRCACC_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("srceCode")
    @JsonPropertyDescription("Lineage reference object : TBRCACC_SRCE_CODE, Lookup lineage reference object : ttvsrce")
    private String srceCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    @JsonPropertyDescription("Lineage reference object : contractNumber")
    private Object contractNumber;
    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBRCACC_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    @JsonPropertyDescription("Lineage reference object : TBRCACC_MAX_AMOUNT")
    private Double maxAmount;
    /**
     * Percent
     * <p>
     * Lineage reference object : TBRCACC_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : TBRCACC_PERCENT")
    private Double percent;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBRCACC_ACC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("accPriority")
    @JsonPropertyDescription("Lineage reference object : TBRCACC_ACC_PRIORITY")
    private Double accPriority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBRCACC_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public Double getMinAmount() {
        return minAmount;
    }

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBRCACC_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public ContractAuthorizationAccountLevelAuthorization100GetRequest withMinAmount(Double minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRCACC_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("srceCode")
    public String getSrceCode() {
        return srceCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRCACC_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * (Required)
     * 
     */
    @JsonProperty("srceCode")
    public void setSrceCode(String srceCode) {
        this.srceCode = srceCode;
    }

    public ContractAuthorizationAccountLevelAuthorization100GetRequest withSrceCode(String srceCode) {
        this.srceCode = srceCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ContractAuthorizationAccountLevelAuthorization100GetRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    public Object getContractNumber() {
        return contractNumber;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    public void setContractNumber(Object contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ContractAuthorizationAccountLevelAuthorization100GetRequest withContractNumber(Object contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public ContractAuthorizationAccountLevelAuthorization100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBRCACC_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    public Double getMaxAmount() {
        return maxAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBRCACC_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public ContractAuthorizationAccountLevelAuthorization100GetRequest withMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBRCACC_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBRCACC_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public ContractAuthorizationAccountLevelAuthorization100GetRequest withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBRCACC_ACC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("accPriority")
    public Double getAccPriority() {
        return accPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBRCACC_ACC_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("accPriority")
    public void setAccPriority(Double accPriority) {
        this.accPriority = accPriority;
    }

    public ContractAuthorizationAccountLevelAuthorization100GetRequest withAccPriority(Double accPriority) {
        this.accPriority = accPriority;
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

    public ContractAuthorizationAccountLevelAuthorization100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractAuthorizationAccountLevelAuthorization100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("maxAmount");
        sb.append('=');
        sb.append(((this.maxAmount == null)?"<null>":this.maxAmount));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("accPriority");
        sb.append('=');
        sb.append(((this.accPriority == null)?"<null>":this.accPriority));
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
        result = ((result* 31)+((this.minAmount == null)? 0 :this.minAmount.hashCode()));
        result = ((result* 31)+((this.srceCode == null)? 0 :this.srceCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maxAmount == null)? 0 :this.maxAmount.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.accPriority == null)? 0 :this.accPriority.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractAuthorizationAccountLevelAuthorization100GetRequest) == false) {
            return false;
        }
        ContractAuthorizationAccountLevelAuthorization100GetRequest rhs = ((ContractAuthorizationAccountLevelAuthorization100GetRequest) other);
        return ((((((((((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount)))&&((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maxAmount == rhs.maxAmount)||((this.maxAmount!= null)&&this.maxAmount.equals(rhs.maxAmount))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.accPriority == rhs.accPriority)||((this.accPriority!= null)&&this.accPriority.equals(rhs.accPriority))));
    }

}
