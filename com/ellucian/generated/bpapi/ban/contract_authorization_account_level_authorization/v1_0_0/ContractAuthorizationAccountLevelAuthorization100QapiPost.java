
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
    "id",
    "contractNumber",
    "keyblocTermCode",
    "srceCode",
    "percent",
    "minAmount",
    "accPriority",
    "maxAmount"
})
@Generated("jsonschema2pojo")
public class ContractAuthorizationAccountLevelAuthorization100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("contractNumber")
    private String contractNumber;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    /**
     * Source
     * <p>
     * Lineage reference object : TBRCACC_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("srceCode")
    @JsonPropertyDescription("Lineage reference object : TBRCACC_SRCE_CODE, Lookup lineage reference object : ttvsrce")
    private String srceCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : TBRCACC_PERCENT
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : TBRCACC_PERCENT")
    private Double percent;
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
     * Priority
     * <p>
     * Lineage reference object : TBRCACC_ACC_PRIORITY
     * 
     */
    @JsonProperty("accPriority")
    @JsonPropertyDescription("Lineage reference object : TBRCACC_ACC_PRIORITY")
    private Double accPriority;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBRCACC_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    @JsonPropertyDescription("Lineage reference object : TBRCACC_MAX_AMOUNT")
    private Double maxAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ContractAuthorizationAccountLevelAuthorization100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("contractNumber")
    public String getContractNumber() {
        return contractNumber;
    }

    @JsonProperty("contractNumber")
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ContractAuthorizationAccountLevelAuthorization100QapiPost withContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ContractAuthorizationAccountLevelAuthorization100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRCACC_SRCE_CODE, Lookup lineage reference object : ttvsrce
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
     * 
     */
    @JsonProperty("srceCode")
    public void setSrceCode(String srceCode) {
        this.srceCode = srceCode;
    }

    public ContractAuthorizationAccountLevelAuthorization100QapiPost withSrceCode(String srceCode) {
        this.srceCode = srceCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBRCACC_PERCENT
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
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public ContractAuthorizationAccountLevelAuthorization100QapiPost withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

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

    public ContractAuthorizationAccountLevelAuthorization100QapiPost withMinAmount(Double minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBRCACC_ACC_PRIORITY
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
     * 
     */
    @JsonProperty("accPriority")
    public void setAccPriority(Double accPriority) {
        this.accPriority = accPriority;
    }

    public ContractAuthorizationAccountLevelAuthorization100QapiPost withAccPriority(Double accPriority) {
        this.accPriority = accPriority;
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

    public ContractAuthorizationAccountLevelAuthorization100QapiPost withMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
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

    public ContractAuthorizationAccountLevelAuthorization100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractAuthorizationAccountLevelAuthorization100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("accPriority");
        sb.append('=');
        sb.append(((this.accPriority == null)?"<null>":this.accPriority));
        sb.append(',');
        sb.append("maxAmount");
        sb.append('=');
        sb.append(((this.maxAmount == null)?"<null>":this.maxAmount));
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
        if ((other instanceof ContractAuthorizationAccountLevelAuthorization100QapiPost) == false) {
            return false;
        }
        ContractAuthorizationAccountLevelAuthorization100QapiPost rhs = ((ContractAuthorizationAccountLevelAuthorization100QapiPost) other);
        return ((((((((((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount)))&&((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maxAmount == rhs.maxAmount)||((this.maxAmount!= null)&&this.maxAmount.equals(rhs.maxAmount))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.accPriority == rhs.accPriority)||((this.accPriority!= null)&&this.accPriority.equals(rhs.accPriority))));
    }

}
