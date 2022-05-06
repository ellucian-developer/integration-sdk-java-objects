
package com.ellucian.generated.bpapi.ban.contract_authorization_category_code_level_authorization.v1_0_0;

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
    "ttvdcatDesc",
    "dcatPriority",
    "percent",
    "minAmount",
    "maxAmount",
    "dcatCode",
    "iESourceInd"
})
@Generated("jsonschema2pojo")
public class ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("contractNumber")
    private String contractNumber;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ttvdcatDesc")
    private String ttvdcatDesc;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBRCCAT_DCAT_PRIORITY
     * 
     */
    @JsonProperty("dcatPriority")
    @JsonPropertyDescription("Lineage reference object : TBRCCAT_DCAT_PRIORITY")
    private Double dcatPriority;
    /**
     * Percent
     * <p>
     * Lineage reference object : TBRCCAT_PERCENT
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : TBRCCAT_PERCENT")
    private Double percent;
    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBRCCAT_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    @JsonPropertyDescription("Lineage reference object : TBRCCAT_MIN_AMOUNT")
    private Double minAmount;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBRCCAT_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    @JsonPropertyDescription("Lineage reference object : TBRCCAT_MAX_AMOUNT")
    private Double maxAmount;
    /**
     * Category
     * <p>
     * Lineage reference object : TBRCCAT_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * 
     */
    @JsonProperty("dcatCode")
    @JsonPropertyDescription("Lineage reference object : TBRCCAT_DCAT_CODE, Lookup lineage reference object : ttvdcat")
    private String dcatCode;
    /**
     * Source Indicator
     * <p>
     * Lineage reference object : TBRCCAT_I_E_SOURCE_IND
     * 
     */
    @JsonProperty("iESourceInd")
    @JsonPropertyDescription("Lineage reference object : TBRCCAT_I_E_SOURCE_IND")
    private String iESourceInd;
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

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withId(String id) {
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

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withContractNumber(String contractNumber) {
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

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ttvdcatDesc")
    public String getTtvdcatDesc() {
        return ttvdcatDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ttvdcatDesc")
    public void setTtvdcatDesc(String ttvdcatDesc) {
        this.ttvdcatDesc = ttvdcatDesc;
    }

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withTtvdcatDesc(String ttvdcatDesc) {
        this.ttvdcatDesc = ttvdcatDesc;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBRCCAT_DCAT_PRIORITY
     * 
     */
    @JsonProperty("dcatPriority")
    public Double getDcatPriority() {
        return dcatPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBRCCAT_DCAT_PRIORITY
     * 
     */
    @JsonProperty("dcatPriority")
    public void setDcatPriority(Double dcatPriority) {
        this.dcatPriority = dcatPriority;
    }

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withDcatPriority(Double dcatPriority) {
        this.dcatPriority = dcatPriority;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBRCCAT_PERCENT
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBRCCAT_PERCENT
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBRCCAT_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public Double getMinAmount() {
        return minAmount;
    }

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBRCCAT_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withMinAmount(Double minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBRCCAT_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    public Double getMaxAmount() {
        return maxAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBRCCAT_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBRCCAT_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * 
     */
    @JsonProperty("dcatCode")
    public String getDcatCode() {
        return dcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : TBRCCAT_DCAT_CODE, Lookup lineage reference object : ttvdcat
     * 
     */
    @JsonProperty("dcatCode")
    public void setDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
    }

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
        return this;
    }

    /**
     * Source Indicator
     * <p>
     * Lineage reference object : TBRCCAT_I_E_SOURCE_IND
     * 
     */
    @JsonProperty("iESourceInd")
    public String getiESourceInd() {
        return iESourceInd;
    }

    /**
     * Source Indicator
     * <p>
     * Lineage reference object : TBRCCAT_I_E_SOURCE_IND
     * 
     */
    @JsonProperty("iESourceInd")
    public void setiESourceInd(String iESourceInd) {
        this.iESourceInd = iESourceInd;
    }

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withiESourceInd(String iESourceInd) {
        this.iESourceInd = iESourceInd;
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

    public ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("ttvdcatDesc");
        sb.append('=');
        sb.append(((this.ttvdcatDesc == null)?"<null>":this.ttvdcatDesc));
        sb.append(',');
        sb.append("dcatPriority");
        sb.append('=');
        sb.append(((this.dcatPriority == null)?"<null>":this.dcatPriority));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("maxAmount");
        sb.append('=');
        sb.append(((this.maxAmount == null)?"<null>":this.maxAmount));
        sb.append(',');
        sb.append("dcatCode");
        sb.append('=');
        sb.append(((this.dcatCode == null)?"<null>":this.dcatCode));
        sb.append(',');
        sb.append("iESourceInd");
        sb.append('=');
        sb.append(((this.iESourceInd == null)?"<null>":this.iESourceInd));
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
        result = ((result* 31)+((this.ttvdcatDesc == null)? 0 :this.ttvdcatDesc.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.iESourceInd == null)? 0 :this.iESourceInd.hashCode()));
        result = ((result* 31)+((this.dcatPriority == null)? 0 :this.dcatPriority.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maxAmount == null)? 0 :this.maxAmount.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost) == false) {
            return false;
        }
        ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost rhs = ((ContractAuthorizationCategoryCodeLevelAuthorization100QapiPost) other);
        return ((((((((((((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount)))&&((this.ttvdcatDesc == rhs.ttvdcatDesc)||((this.ttvdcatDesc!= null)&&this.ttvdcatDesc.equals(rhs.ttvdcatDesc))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.iESourceInd == rhs.iESourceInd)||((this.iESourceInd!= null)&&this.iESourceInd.equals(rhs.iESourceInd))))&&((this.dcatPriority == rhs.dcatPriority)||((this.dcatPriority!= null)&&this.dcatPriority.equals(rhs.dcatPriority))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maxAmount == rhs.maxAmount)||((this.maxAmount!= null)&&this.maxAmount.equals(rhs.maxAmount))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))));
    }

}
