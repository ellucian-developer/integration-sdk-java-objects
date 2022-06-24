
package com.ellucian.generated.bpapi.ban.exemption_authorization_detail_code_level_authorization.v1_0_0;

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
    "exemptionCode",
    "minAmount",
    "tbbdetcDesc",
    "keyblocTermCode",
    "iESourceInd",
    "detailPriority",
    "maxAmount",
    "detailCode",
    "percent",
    "desc"
})
@Generated("jsonschema2pojo")
public class ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest {

    /**
     * Exemption Code
     * <p>
     * Lineage reference object : exemptionCode
     * 
     */
    @JsonProperty("exemptionCode")
    @JsonPropertyDescription("Lineage reference object : exemptionCode")
    private String exemptionCode;
    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBREDET_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    @JsonPropertyDescription("Lineage reference object : TBREDET_MIN_AMOUNT")
    private Double minAmount;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcDesc")
    private String tbbdetcDesc;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Source Indicator
     * <p>
     * Lineage reference object : TBREDET_I_E_SOURCE_IND
     * (Required)
     * 
     */
    @JsonProperty("iESourceInd")
    @JsonPropertyDescription("Lineage reference object : TBREDET_I_E_SOURCE_IND")
    private String iESourceInd;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBREDET_DETAIL_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("detailPriority")
    @JsonPropertyDescription("Lineage reference object : TBREDET_DETAIL_PRIORITY")
    private Double detailPriority;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBREDET_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    @JsonPropertyDescription("Lineage reference object : TBREDET_MAX_AMOUNT")
    private Double maxAmount;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBREDET_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBREDET_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String detailCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : TBREDET_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : TBREDET_PERCENT")
    private Double percent;
    /**
     * Description
     * <p>
     * Lineage reference object : TBBEXPT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Exemption Code
     * <p>
     * Lineage reference object : exemptionCode
     * 
     */
    @JsonProperty("exemptionCode")
    public String getExemptionCode() {
        return exemptionCode;
    }

    /**
     * Exemption Code
     * <p>
     * Lineage reference object : exemptionCode
     * 
     */
    @JsonProperty("exemptionCode")
    public void setExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
        return this;
    }

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBREDET_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public Double getMinAmount() {
        return minAmount;
    }

    /**
     * Minimum Amount
     * <p>
     * Lineage reference object : TBREDET_MIN_AMOUNT
     * 
     */
    @JsonProperty("minAmount")
    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withMinAmount(Double minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcDesc")
    public String getTbbdetcDesc() {
        return tbbdetcDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("tbbdetcDesc")
    public void setTbbdetcDesc(String tbbdetcDesc) {
        this.tbbdetcDesc = tbbdetcDesc;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withTbbdetcDesc(String tbbdetcDesc) {
        this.tbbdetcDesc = tbbdetcDesc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Source Indicator
     * <p>
     * Lineage reference object : TBREDET_I_E_SOURCE_IND
     * (Required)
     * 
     */
    @JsonProperty("iESourceInd")
    public String getiESourceInd() {
        return iESourceInd;
    }

    /**
     * Source Indicator
     * <p>
     * Lineage reference object : TBREDET_I_E_SOURCE_IND
     * (Required)
     * 
     */
    @JsonProperty("iESourceInd")
    public void setiESourceInd(String iESourceInd) {
        this.iESourceInd = iESourceInd;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withiESourceInd(String iESourceInd) {
        this.iESourceInd = iESourceInd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBREDET_DETAIL_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("detailPriority")
    public Double getDetailPriority() {
        return detailPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBREDET_DETAIL_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("detailPriority")
    public void setDetailPriority(Double detailPriority) {
        this.detailPriority = detailPriority;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withDetailPriority(Double detailPriority) {
        this.detailPriority = detailPriority;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBREDET_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    public Double getMaxAmount() {
        return maxAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBREDET_MAX_AMOUNT
     * 
     */
    @JsonProperty("maxAmount")
    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBREDET_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBREDET_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBREDET_PERCENT
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
     * Lineage reference object : TBREDET_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBEXPT_DESC
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
     * Lineage reference object : TBBEXPT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withDesc(String desc) {
        this.desc = desc;
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

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exemptionCode");
        sb.append('=');
        sb.append(((this.exemptionCode == null)?"<null>":this.exemptionCode));
        sb.append(',');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("tbbdetcDesc");
        sb.append('=');
        sb.append(((this.tbbdetcDesc == null)?"<null>":this.tbbdetcDesc));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("iESourceInd");
        sb.append('=');
        sb.append(((this.iESourceInd == null)?"<null>":this.iESourceInd));
        sb.append(',');
        sb.append("detailPriority");
        sb.append('=');
        sb.append(((this.detailPriority == null)?"<null>":this.detailPriority));
        sb.append(',');
        sb.append("maxAmount");
        sb.append('=');
        sb.append(((this.maxAmount == null)?"<null>":this.maxAmount));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.exemptionCode == null)? 0 :this.exemptionCode.hashCode()));
        result = ((result* 31)+((this.minAmount == null)? 0 :this.minAmount.hashCode()));
        result = ((result* 31)+((this.tbbdetcDesc == null)? 0 :this.tbbdetcDesc.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.iESourceInd == null)? 0 :this.iESourceInd.hashCode()));
        result = ((result* 31)+((this.detailPriority == null)? 0 :this.detailPriority.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maxAmount == null)? 0 :this.maxAmount.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest) == false) {
            return false;
        }
        ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest rhs = ((ExemptionAuthorizationDetailCodeLevelAuthorization100GetRequest) other);
        return ((((((((((((this.exemptionCode == rhs.exemptionCode)||((this.exemptionCode!= null)&&this.exemptionCode.equals(rhs.exemptionCode)))&&((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount))))&&((this.tbbdetcDesc == rhs.tbbdetcDesc)||((this.tbbdetcDesc!= null)&&this.tbbdetcDesc.equals(rhs.tbbdetcDesc))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.iESourceInd == rhs.iESourceInd)||((this.iESourceInd!= null)&&this.iESourceInd.equals(rhs.iESourceInd))))&&((this.detailPriority == rhs.detailPriority)||((this.detailPriority!= null)&&this.detailPriority.equals(rhs.detailPriority))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maxAmount == rhs.maxAmount)||((this.maxAmount!= null)&&this.maxAmount.equals(rhs.maxAmount))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
